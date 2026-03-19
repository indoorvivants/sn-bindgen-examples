import s2n.functions.*
import s2n.types.*

import scalanative.unsafe.*
import scalanative.unsigned.*
import scalanative.libc.string.*
import scalanative.posix.netdb.*
import scalanative.posix.netdbOps.*
import scalanative.posix.sys.socket.*

@main def hello_s2n =
  assert(s2n_init() == 0)

  val addr = stackalloc[Ptr[addrinfo]]()
  assert(getaddrinfo(c"icanhazdadjoke.com", c"443", null, addr) == 0)

  val fd = socket(AF_INET, SOCK_STREAM, 0)
  assert(fd > 0)
  assert(connect(fd, (!addr).ai_addr, (!addr).ai_addrlen) == 0)

  val cfg = s2n_config_new()
  assert(cfg != null)
  assert(s2n_config_set_cipher_preferences(cfg, c"default_tls13") == 0)

  val conn = s2n_connection_new(s2n_mode.S2N_CLIENT)
  assert(conn != null)

  assert(s2n_connection_set_config(conn, cfg) == 0)
  assert(s2n_connection_set_fd(conn, fd) == 0)
  assert(s2n_set_server_name(conn, c"icanhazdadjoke.com") == 0)

  val blocked = stackalloc[s2n_blocked_status]()

  def negotiate(): Unit =
    val rtn = s2n_negotiate(conn, blocked)
    if !blocked != s2n_blocked_status.S2N_NOT_BLOCKED then negotiate()
    else assert(rtn == 0)

  negotiate()

  val msg =
    c"""GET / HTTP/1.1\nHost: icanhazdadjoke.com\nAccept:text/plain\n\n"""
  val msgLen = 59
  assert(strlen(msg) == msgLen.toULong)

  def send(): Unit =
    val rtn = s2n_send(conn, msg, msgLen, blocked)
    if !blocked != s2n_blocked_status.S2N_NOT_BLOCKED then send()
    else assert(rtn == msgLen)

  send()

  def recv(): Unit =
    val replyLen = 1024
    val replyBuf = stackalloc[CChar](replyLen)
    val rtn = s2n_recv(conn, replyBuf, replyLen, blocked)
    print(fromCString(replyBuf))
    if !blocked != s2n_blocked_status.S2N_NOT_BLOCKED then recv()
    else assert(rtn > 0)

  recv()

  println()

end hello_s2n
