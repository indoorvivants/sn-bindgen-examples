import civetweb.functions.*
import civetweb.types.*

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.*

inline def zone[A](inline f: Zone ?=> A) = Zone.apply(z => f(using z))

case class Response(code: Int, headers: Map[String, String], body: String)

def client_get(cli: Ptr[mg_connection], path: String)(using
    Zone
): Either[String, Response] =
  val errbuf = alloc[CChar](256)
  mg_printf(cli, c"GET ")
  mg_printf(cli, toCString(path))
  mg_printf(cli, c" HTTP/1.1\r\n");
  mg_printf(cli, c"Connection: close\r\n\r\n");
  val ret = mg_get_response(cli, errbuf, 256.toUInt, 10000);

  val ri = !mg_get_response_info(cli)

  val headers = Map.newBuilder[String, String]
  val body = StringBuilder()

  val num_headers = ri.num_headers
  for i <- 0 until num_headers do
    headers +=
      fromCString(ri.http_headers(i).name) ->
        fromCString(ri.http_headers(i).value)

  val body_length = ri.content_length

  // if body_length > 0 then
  //   var rem = ri.content_length
  //   var err = false
  //   val buf = alloc[CChar](1024)
  //   while rem > 0 && !err do
  //     val ret = mg_read(cli, buf, 1024.toUInt)
  //     if ret >= 0 then
  //       rem -= ret
  //       for i <- 0 until ret do body.addOne(buf(i).toChar)
  //     else err = true
  // end if

  if ret != 1 then Left(fromCString(errbuf))
  else Right(Response(ri.status_code, headers.result, body.result))

end client_get

@main def hello =
  zone {
    val errbuf = alloc[CChar](256)

    mg_init_library(0.toUInt)

    val callbacks = alloc[mg_callbacks](1)
    val context = alloc[mg_context](1)

    (!callbacks).log_message = CFuncPtr2.fromScalaFunction {
      (conn: Ptr[mg_connection], message: Ptr[CChar]) =>
        stdio.printf(c"Log: %s", message)
        1
    }

    val options = alloc[CArray[CString, Nat._2]](1)

    (!options)(0) = c"listening_ports"
    (!options)(1) = c"9991"

    val ctx = mg_start(callbacks, null, options.at(0))

    val channel = alloc[Boolean](1)

    mg_set_request_handler(
      ctx,
      c"/shutdown",
      mg_request_handler { (conn: Ptr[mg_connection], channel: Ptr[Byte]) =>
        mg_printf(
          conn,
          c"""HTTP/1.1 200 OK\r\nContent-Type: text/bla\r\nConnection: close\r\n\r\n"""
        )
        mg_printf(conn, c"Server will shut down.\n")
        mg_printf(conn, c"Bye!\n")
        !(channel.asInstanceOf[Ptr[Boolean]]) = true
        200
      },
      channel.asInstanceOf[Ptr[Byte]]
    )

    mg_set_request_handler(
      ctx,
      c"/add/*/*",
      mg_request_handler { (conn: Ptr[mg_connection], data: Ptr[Byte]) =>
        val info = !mg_get_request_info(conn)

        zone {
          val req = fromCString(info.local_uri)

          try
            val result = req match
              case s"/add/$num1/$num2" => num1.toInt + num2.toInt

            val response = s"Result is $result"

            mg_send_http_ok(conn, c"text/plain", response.length)
            zone {
              mg_write(conn, toCString(response), response.length.toUInt)
            }

            200

          catch
            case exc =>
              mg_send_http_error(conn, 400, c"Failure to parse input")
              400
          end try
        }

      },
      null
    )

    // Now let's call our own http server

    val cli = mg_connect_client(c"localhost", 9991, 0, errbuf, 256.toUInt)

    println(client_get(cli, "/add/111/567"))

    mg_close_connection(cli)

    // Uncomment this line to make the server run until /shutdown endpoint is
    // called
    // while (!channel) == false do Thread.sleep(1000)

    mg_stop(ctx)
  }
