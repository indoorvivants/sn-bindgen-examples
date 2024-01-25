package libuv

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[libuv] trait CEnum[T](using eq: T =:= Int):
    given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
    extension (inline t: T) 
      inline def int: CInt = eq.apply(t)
      inline def value: CInt = eq.apply(t)
  private[libuv] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
     inline def int: CInt = eq.apply(t).toInt
     inline def uint: CUnsignedInt = eq.apply(t)
     inline def value: CUnsignedInt = eq.apply(t)


object enumerations:
  import predef.*
  /**
  */
  opaque type uv_clock_id = CUnsignedInt
  object uv_clock_id extends CEnumU[uv_clock_id]:
    given _tag: Tag[uv_clock_id] = Tag.UInt
    inline def define(inline a: Long): uv_clock_id = a.toUInt
    val UV_CLOCK_MONOTONIC = define(0)
    val UV_CLOCK_REALTIME = define(1)
    inline def getName(inline value: uv_clock_id): Option[String] =
      inline value match
        case UV_CLOCK_MONOTONIC => Some("UV_CLOCK_MONOTONIC")
        case UV_CLOCK_REALTIME => Some("UV_CLOCK_REALTIME")
        case _ => None
    extension (a: uv_clock_id)
      inline def &(b: uv_clock_id): uv_clock_id = a & b
      inline def |(b: uv_clock_id): uv_clock_id = a | b
      inline def is(b: uv_clock_id): Boolean = (a & b) == b

  /**
  */
  opaque type uv_dirent_type_t = CUnsignedInt
  object uv_dirent_type_t extends CEnumU[uv_dirent_type_t]:
    given _tag: Tag[uv_dirent_type_t] = Tag.UInt
    inline def define(inline a: Long): uv_dirent_type_t = a.toUInt
    val UV_DIRENT_UNKNOWN = define(0)
    val UV_DIRENT_FILE = define(1)
    val UV_DIRENT_DIR = define(2)
    val UV_DIRENT_LINK = define(3)
    val UV_DIRENT_FIFO = define(4)
    val UV_DIRENT_SOCKET = define(5)
    val UV_DIRENT_CHAR = define(6)
    val UV_DIRENT_BLOCK = define(7)
    inline def getName(inline value: uv_dirent_type_t): Option[String] =
      inline value match
        case UV_DIRENT_UNKNOWN => Some("UV_DIRENT_UNKNOWN")
        case UV_DIRENT_FILE => Some("UV_DIRENT_FILE")
        case UV_DIRENT_DIR => Some("UV_DIRENT_DIR")
        case UV_DIRENT_LINK => Some("UV_DIRENT_LINK")
        case UV_DIRENT_FIFO => Some("UV_DIRENT_FIFO")
        case UV_DIRENT_SOCKET => Some("UV_DIRENT_SOCKET")
        case UV_DIRENT_CHAR => Some("UV_DIRENT_CHAR")
        case UV_DIRENT_BLOCK => Some("UV_DIRENT_BLOCK")
        case _ => None
    extension (a: uv_dirent_type_t)
      inline def &(b: uv_dirent_type_t): uv_dirent_type_t = a & b
      inline def |(b: uv_dirent_type_t): uv_dirent_type_t = a | b
      inline def is(b: uv_dirent_type_t): Boolean = (a & b) == b

  /**
  */
  opaque type uv_errno_t = CInt
  object uv_errno_t extends CEnum[uv_errno_t]:
    given _tag: Tag[uv_errno_t] = Tag.Int
    inline def define(inline a: CInt): uv_errno_t = a
    val UV_E2BIG = define(-7)
    val UV_EACCES = define(-13)
    val UV_EADDRINUSE = define(-48)
    val UV_EADDRNOTAVAIL = define(-49)
    val UV_EAFNOSUPPORT = define(-47)
    val UV_EAGAIN = define(-35)
    val UV_EAI_ADDRFAMILY = define(-3000)
    val UV_EAI_AGAIN = define(-3001)
    val UV_EAI_BADFLAGS = define(-3002)
    val UV_EAI_BADHINTS = define(-3013)
    val UV_EAI_CANCELED = define(-3003)
    val UV_EAI_FAIL = define(-3004)
    val UV_EAI_FAMILY = define(-3005)
    val UV_EAI_MEMORY = define(-3006)
    val UV_EAI_NODATA = define(-3007)
    val UV_EAI_NONAME = define(-3008)
    val UV_EAI_OVERFLOW = define(-3009)
    val UV_EAI_PROTOCOL = define(-3014)
    val UV_EAI_SERVICE = define(-3010)
    val UV_EAI_SOCKTYPE = define(-3011)
    val UV_EALREADY = define(-37)
    val UV_EBADF = define(-9)
    val UV_EBUSY = define(-16)
    val UV_ECANCELED = define(-89)
    val UV_ECHARSET = define(-4080)
    val UV_ECONNABORTED = define(-53)
    val UV_ECONNREFUSED = define(-61)
    val UV_ECONNRESET = define(-54)
    val UV_EDESTADDRREQ = define(-39)
    val UV_EEXIST = define(-17)
    val UV_EFAULT = define(-14)
    val UV_EFBIG = define(-27)
    val UV_EHOSTUNREACH = define(-65)
    val UV_EINTR = define(-4)
    val UV_EINVAL = define(-22)
    val UV_EIO = define(-5)
    val UV_EISCONN = define(-56)
    val UV_EISDIR = define(-21)
    val UV_ELOOP = define(-62)
    val UV_EMFILE = define(-24)
    val UV_EMSGSIZE = define(-40)
    val UV_ENAMETOOLONG = define(-63)
    val UV_ENETDOWN = define(-50)
    val UV_ENETUNREACH = define(-51)
    val UV_ENFILE = define(-23)
    val UV_ENOBUFS = define(-55)
    val UV_ENODEV = define(-19)
    val UV_ENOENT = define(-2)
    val UV_ENOMEM = define(-12)
    val UV_ENONET = define(-4056)
    val UV_ENOPROTOOPT = define(-42)
    val UV_ENOSPC = define(-28)
    val UV_ENOSYS = define(-78)
    val UV_ENOTCONN = define(-57)
    val UV_ENOTDIR = define(-20)
    val UV_ENOTEMPTY = define(-66)
    val UV_ENOTSOCK = define(-38)
    val UV_ENOTSUP = define(-45)
    val UV_EOVERFLOW = define(-84)
    val UV_EPERM = define(-1)
    val UV_EPIPE = define(-32)
    val UV_EPROTO = define(-100)
    val UV_EPROTONOSUPPORT = define(-43)
    val UV_EPROTOTYPE = define(-41)
    val UV_ERANGE = define(-34)
    val UV_EROFS = define(-30)
    val UV_ESHUTDOWN = define(-58)
    val UV_ESPIPE = define(-29)
    val UV_ESRCH = define(-3)
    val UV_ETIMEDOUT = define(-60)
    val UV_ETXTBSY = define(-26)
    val UV_EXDEV = define(-18)
    val UV_UNKNOWN = define(-4094)
    val UV_EOF = define(-4095)
    val UV_ENXIO = define(-6)
    val UV_EMLINK = define(-31)
    val UV_EHOSTDOWN = define(-64)
    val UV_EREMOTEIO = define(-4030)
    val UV_ENOTTY = define(-25)
    val UV_EFTYPE = define(-79)
    val UV_EILSEQ = define(-92)
    val UV_ESOCKTNOSUPPORT = define(-44)
    val UV_ENODATA = define(-96)
    val UV_EUNATCH = define(-4023)
    val UV_ERRNO_MAX = define(-4096)
    inline def getName(inline value: uv_errno_t): Option[String] =
      inline value match
        case UV_E2BIG => Some("UV_E2BIG")
        case UV_EACCES => Some("UV_EACCES")
        case UV_EADDRINUSE => Some("UV_EADDRINUSE")
        case UV_EADDRNOTAVAIL => Some("UV_EADDRNOTAVAIL")
        case UV_EAFNOSUPPORT => Some("UV_EAFNOSUPPORT")
        case UV_EAGAIN => Some("UV_EAGAIN")
        case UV_EAI_ADDRFAMILY => Some("UV_EAI_ADDRFAMILY")
        case UV_EAI_AGAIN => Some("UV_EAI_AGAIN")
        case UV_EAI_BADFLAGS => Some("UV_EAI_BADFLAGS")
        case UV_EAI_BADHINTS => Some("UV_EAI_BADHINTS")
        case UV_EAI_CANCELED => Some("UV_EAI_CANCELED")
        case UV_EAI_FAIL => Some("UV_EAI_FAIL")
        case UV_EAI_FAMILY => Some("UV_EAI_FAMILY")
        case UV_EAI_MEMORY => Some("UV_EAI_MEMORY")
        case UV_EAI_NODATA => Some("UV_EAI_NODATA")
        case UV_EAI_NONAME => Some("UV_EAI_NONAME")
        case UV_EAI_OVERFLOW => Some("UV_EAI_OVERFLOW")
        case UV_EAI_PROTOCOL => Some("UV_EAI_PROTOCOL")
        case UV_EAI_SERVICE => Some("UV_EAI_SERVICE")
        case UV_EAI_SOCKTYPE => Some("UV_EAI_SOCKTYPE")
        case UV_EALREADY => Some("UV_EALREADY")
        case UV_EBADF => Some("UV_EBADF")
        case UV_EBUSY => Some("UV_EBUSY")
        case UV_ECANCELED => Some("UV_ECANCELED")
        case UV_ECHARSET => Some("UV_ECHARSET")
        case UV_ECONNABORTED => Some("UV_ECONNABORTED")
        case UV_ECONNREFUSED => Some("UV_ECONNREFUSED")
        case UV_ECONNRESET => Some("UV_ECONNRESET")
        case UV_EDESTADDRREQ => Some("UV_EDESTADDRREQ")
        case UV_EEXIST => Some("UV_EEXIST")
        case UV_EFAULT => Some("UV_EFAULT")
        case UV_EFBIG => Some("UV_EFBIG")
        case UV_EHOSTUNREACH => Some("UV_EHOSTUNREACH")
        case UV_EINTR => Some("UV_EINTR")
        case UV_EINVAL => Some("UV_EINVAL")
        case UV_EIO => Some("UV_EIO")
        case UV_EISCONN => Some("UV_EISCONN")
        case UV_EISDIR => Some("UV_EISDIR")
        case UV_ELOOP => Some("UV_ELOOP")
        case UV_EMFILE => Some("UV_EMFILE")
        case UV_EMSGSIZE => Some("UV_EMSGSIZE")
        case UV_ENAMETOOLONG => Some("UV_ENAMETOOLONG")
        case UV_ENETDOWN => Some("UV_ENETDOWN")
        case UV_ENETUNREACH => Some("UV_ENETUNREACH")
        case UV_ENFILE => Some("UV_ENFILE")
        case UV_ENOBUFS => Some("UV_ENOBUFS")
        case UV_ENODEV => Some("UV_ENODEV")
        case UV_ENOENT => Some("UV_ENOENT")
        case UV_ENOMEM => Some("UV_ENOMEM")
        case UV_ENONET => Some("UV_ENONET")
        case UV_ENOPROTOOPT => Some("UV_ENOPROTOOPT")
        case UV_ENOSPC => Some("UV_ENOSPC")
        case UV_ENOSYS => Some("UV_ENOSYS")
        case UV_ENOTCONN => Some("UV_ENOTCONN")
        case UV_ENOTDIR => Some("UV_ENOTDIR")
        case UV_ENOTEMPTY => Some("UV_ENOTEMPTY")
        case UV_ENOTSOCK => Some("UV_ENOTSOCK")
        case UV_ENOTSUP => Some("UV_ENOTSUP")
        case UV_EOVERFLOW => Some("UV_EOVERFLOW")
        case UV_EPERM => Some("UV_EPERM")
        case UV_EPIPE => Some("UV_EPIPE")
        case UV_EPROTO => Some("UV_EPROTO")
        case UV_EPROTONOSUPPORT => Some("UV_EPROTONOSUPPORT")
        case UV_EPROTOTYPE => Some("UV_EPROTOTYPE")
        case UV_ERANGE => Some("UV_ERANGE")
        case UV_EROFS => Some("UV_EROFS")
        case UV_ESHUTDOWN => Some("UV_ESHUTDOWN")
        case UV_ESPIPE => Some("UV_ESPIPE")
        case UV_ESRCH => Some("UV_ESRCH")
        case UV_ETIMEDOUT => Some("UV_ETIMEDOUT")
        case UV_ETXTBSY => Some("UV_ETXTBSY")
        case UV_EXDEV => Some("UV_EXDEV")
        case UV_UNKNOWN => Some("UV_UNKNOWN")
        case UV_EOF => Some("UV_EOF")
        case UV_ENXIO => Some("UV_ENXIO")
        case UV_EMLINK => Some("UV_EMLINK")
        case UV_EHOSTDOWN => Some("UV_EHOSTDOWN")
        case UV_EREMOTEIO => Some("UV_EREMOTEIO")
        case UV_ENOTTY => Some("UV_ENOTTY")
        case UV_EFTYPE => Some("UV_EFTYPE")
        case UV_EILSEQ => Some("UV_EILSEQ")
        case UV_ESOCKTNOSUPPORT => Some("UV_ESOCKTNOSUPPORT")
        case UV_ENODATA => Some("UV_ENODATA")
        case UV_EUNATCH => Some("UV_EUNATCH")
        case UV_ERRNO_MAX => Some("UV_ERRNO_MAX")
        case _ => None
    extension (a: uv_errno_t)
      inline def &(b: uv_errno_t): uv_errno_t = a & b
      inline def |(b: uv_errno_t): uv_errno_t = a | b
      inline def is(b: uv_errno_t): Boolean = (a & b) == b

  /**
  */
  opaque type uv_fs_event = CUnsignedInt
  object uv_fs_event extends CEnumU[uv_fs_event]:
    given _tag: Tag[uv_fs_event] = Tag.UInt
    inline def define(inline a: Long): uv_fs_event = a.toUInt
    val UV_RENAME = define(1)
    val UV_CHANGE = define(2)
    inline def getName(inline value: uv_fs_event): Option[String] =
      inline value match
        case UV_RENAME => Some("UV_RENAME")
        case UV_CHANGE => Some("UV_CHANGE")
        case _ => None
    extension (a: uv_fs_event)
      inline def &(b: uv_fs_event): uv_fs_event = a & b
      inline def |(b: uv_fs_event): uv_fs_event = a | b
      inline def is(b: uv_fs_event): Boolean = (a & b) == b

  /**
  */
  opaque type uv_fs_event_flags = CUnsignedInt
  object uv_fs_event_flags extends CEnumU[uv_fs_event_flags]:
    given _tag: Tag[uv_fs_event_flags] = Tag.UInt
    inline def define(inline a: Long): uv_fs_event_flags = a.toUInt
    val UV_FS_EVENT_WATCH_ENTRY = define(1)
    val UV_FS_EVENT_STAT = define(2)
    val UV_FS_EVENT_RECURSIVE = define(4)
    inline def getName(inline value: uv_fs_event_flags): Option[String] =
      inline value match
        case UV_FS_EVENT_WATCH_ENTRY => Some("UV_FS_EVENT_WATCH_ENTRY")
        case UV_FS_EVENT_STAT => Some("UV_FS_EVENT_STAT")
        case UV_FS_EVENT_RECURSIVE => Some("UV_FS_EVENT_RECURSIVE")
        case _ => None
    extension (a: uv_fs_event_flags)
      inline def &(b: uv_fs_event_flags): uv_fs_event_flags = a & b
      inline def |(b: uv_fs_event_flags): uv_fs_event_flags = a | b
      inline def is(b: uv_fs_event_flags): Boolean = (a & b) == b

  /**
  */
  opaque type uv_fs_type = CInt
  object uv_fs_type extends CEnum[uv_fs_type]:
    given _tag: Tag[uv_fs_type] = Tag.Int
    inline def define(inline a: CInt): uv_fs_type = a
    val UV_FS_UNKNOWN = define(-1)
    val UV_FS_CUSTOM = define(0)
    val UV_FS_OPEN = define(1)
    val UV_FS_CLOSE = define(2)
    val UV_FS_READ = define(3)
    val UV_FS_WRITE = define(4)
    val UV_FS_SENDFILE = define(5)
    val UV_FS_STAT = define(6)
    val UV_FS_LSTAT = define(7)
    val UV_FS_FSTAT = define(8)
    val UV_FS_FTRUNCATE = define(9)
    val UV_FS_UTIME = define(10)
    val UV_FS_FUTIME = define(11)
    val UV_FS_ACCESS = define(12)
    val UV_FS_CHMOD = define(13)
    val UV_FS_FCHMOD = define(14)
    val UV_FS_FSYNC = define(15)
    val UV_FS_FDATASYNC = define(16)
    val UV_FS_UNLINK = define(17)
    val UV_FS_RMDIR = define(18)
    val UV_FS_MKDIR = define(19)
    val UV_FS_MKDTEMP = define(20)
    val UV_FS_RENAME = define(21)
    val UV_FS_SCANDIR = define(22)
    val UV_FS_LINK = define(23)
    val UV_FS_SYMLINK = define(24)
    val UV_FS_READLINK = define(25)
    val UV_FS_CHOWN = define(26)
    val UV_FS_FCHOWN = define(27)
    val UV_FS_REALPATH = define(28)
    val UV_FS_COPYFILE = define(29)
    val UV_FS_LCHOWN = define(30)
    val UV_FS_OPENDIR = define(31)
    val UV_FS_READDIR = define(32)
    val UV_FS_CLOSEDIR = define(33)
    val UV_FS_STATFS = define(34)
    val UV_FS_MKSTEMP = define(35)
    val UV_FS_LUTIME = define(36)
    inline def getName(inline value: uv_fs_type): Option[String] =
      inline value match
        case UV_FS_UNKNOWN => Some("UV_FS_UNKNOWN")
        case UV_FS_CUSTOM => Some("UV_FS_CUSTOM")
        case UV_FS_OPEN => Some("UV_FS_OPEN")
        case UV_FS_CLOSE => Some("UV_FS_CLOSE")
        case UV_FS_READ => Some("UV_FS_READ")
        case UV_FS_WRITE => Some("UV_FS_WRITE")
        case UV_FS_SENDFILE => Some("UV_FS_SENDFILE")
        case UV_FS_STAT => Some("UV_FS_STAT")
        case UV_FS_LSTAT => Some("UV_FS_LSTAT")
        case UV_FS_FSTAT => Some("UV_FS_FSTAT")
        case UV_FS_FTRUNCATE => Some("UV_FS_FTRUNCATE")
        case UV_FS_UTIME => Some("UV_FS_UTIME")
        case UV_FS_FUTIME => Some("UV_FS_FUTIME")
        case UV_FS_ACCESS => Some("UV_FS_ACCESS")
        case UV_FS_CHMOD => Some("UV_FS_CHMOD")
        case UV_FS_FCHMOD => Some("UV_FS_FCHMOD")
        case UV_FS_FSYNC => Some("UV_FS_FSYNC")
        case UV_FS_FDATASYNC => Some("UV_FS_FDATASYNC")
        case UV_FS_UNLINK => Some("UV_FS_UNLINK")
        case UV_FS_RMDIR => Some("UV_FS_RMDIR")
        case UV_FS_MKDIR => Some("UV_FS_MKDIR")
        case UV_FS_MKDTEMP => Some("UV_FS_MKDTEMP")
        case UV_FS_RENAME => Some("UV_FS_RENAME")
        case UV_FS_SCANDIR => Some("UV_FS_SCANDIR")
        case UV_FS_LINK => Some("UV_FS_LINK")
        case UV_FS_SYMLINK => Some("UV_FS_SYMLINK")
        case UV_FS_READLINK => Some("UV_FS_READLINK")
        case UV_FS_CHOWN => Some("UV_FS_CHOWN")
        case UV_FS_FCHOWN => Some("UV_FS_FCHOWN")
        case UV_FS_REALPATH => Some("UV_FS_REALPATH")
        case UV_FS_COPYFILE => Some("UV_FS_COPYFILE")
        case UV_FS_LCHOWN => Some("UV_FS_LCHOWN")
        case UV_FS_OPENDIR => Some("UV_FS_OPENDIR")
        case UV_FS_READDIR => Some("UV_FS_READDIR")
        case UV_FS_CLOSEDIR => Some("UV_FS_CLOSEDIR")
        case UV_FS_STATFS => Some("UV_FS_STATFS")
        case UV_FS_MKSTEMP => Some("UV_FS_MKSTEMP")
        case UV_FS_LUTIME => Some("UV_FS_LUTIME")
        case _ => None
    extension (a: uv_fs_type)
      inline def &(b: uv_fs_type): uv_fs_type = a & b
      inline def |(b: uv_fs_type): uv_fs_type = a | b
      inline def is(b: uv_fs_type): Boolean = (a & b) == b

  /**
  */
  opaque type uv_handle_type = CUnsignedInt
  object uv_handle_type extends CEnumU[uv_handle_type]:
    given _tag: Tag[uv_handle_type] = Tag.UInt
    inline def define(inline a: Long): uv_handle_type = a.toUInt
    val UV_UNKNOWN_HANDLE = define(0)
    val UV_ASYNC = define(1)
    val UV_CHECK = define(2)
    val UV_FS_EVENT = define(3)
    val UV_FS_POLL = define(4)
    val UV_HANDLE = define(5)
    val UV_IDLE = define(6)
    val UV_NAMED_PIPE = define(7)
    val UV_POLL = define(8)
    val UV_PREPARE = define(9)
    val UV_PROCESS = define(10)
    val UV_STREAM = define(11)
    val UV_TCP = define(12)
    val UV_TIMER = define(13)
    val UV_TTY = define(14)
    val UV_UDP = define(15)
    val UV_SIGNAL = define(16)
    val UV_FILE = define(17)
    val UV_HANDLE_TYPE_MAX = define(18)
    inline def getName(inline value: uv_handle_type): Option[String] =
      inline value match
        case UV_UNKNOWN_HANDLE => Some("UV_UNKNOWN_HANDLE")
        case UV_ASYNC => Some("UV_ASYNC")
        case UV_CHECK => Some("UV_CHECK")
        case UV_FS_EVENT => Some("UV_FS_EVENT")
        case UV_FS_POLL => Some("UV_FS_POLL")
        case UV_HANDLE => Some("UV_HANDLE")
        case UV_IDLE => Some("UV_IDLE")
        case UV_NAMED_PIPE => Some("UV_NAMED_PIPE")
        case UV_POLL => Some("UV_POLL")
        case UV_PREPARE => Some("UV_PREPARE")
        case UV_PROCESS => Some("UV_PROCESS")
        case UV_STREAM => Some("UV_STREAM")
        case UV_TCP => Some("UV_TCP")
        case UV_TIMER => Some("UV_TIMER")
        case UV_TTY => Some("UV_TTY")
        case UV_UDP => Some("UV_UDP")
        case UV_SIGNAL => Some("UV_SIGNAL")
        case UV_FILE => Some("UV_FILE")
        case UV_HANDLE_TYPE_MAX => Some("UV_HANDLE_TYPE_MAX")
        case _ => None
    extension (a: uv_handle_type)
      inline def &(b: uv_handle_type): uv_handle_type = a & b
      inline def |(b: uv_handle_type): uv_handle_type = a | b
      inline def is(b: uv_handle_type): Boolean = (a & b) == b

  /**
  */
  opaque type uv_loop_option = CUnsignedInt
  object uv_loop_option extends CEnumU[uv_loop_option]:
    given _tag: Tag[uv_loop_option] = Tag.UInt
    inline def define(inline a: Long): uv_loop_option = a.toUInt
    val UV_LOOP_BLOCK_SIGNAL = define(0)
    val UV_METRICS_IDLE_TIME = define(1)
    inline def getName(inline value: uv_loop_option): Option[String] =
      inline value match
        case UV_LOOP_BLOCK_SIGNAL => Some("UV_LOOP_BLOCK_SIGNAL")
        case UV_METRICS_IDLE_TIME => Some("UV_METRICS_IDLE_TIME")
        case _ => None
    extension (a: uv_loop_option)
      inline def &(b: uv_loop_option): uv_loop_option = a & b
      inline def |(b: uv_loop_option): uv_loop_option = a | b
      inline def is(b: uv_loop_option): Boolean = (a & b) == b

  /**
  */
  opaque type uv_membership = CUnsignedInt
  object uv_membership extends CEnumU[uv_membership]:
    given _tag: Tag[uv_membership] = Tag.UInt
    inline def define(inline a: Long): uv_membership = a.toUInt
    val UV_LEAVE_GROUP = define(0)
    val UV_JOIN_GROUP = define(1)
    inline def getName(inline value: uv_membership): Option[String] =
      inline value match
        case UV_LEAVE_GROUP => Some("UV_LEAVE_GROUP")
        case UV_JOIN_GROUP => Some("UV_JOIN_GROUP")
        case _ => None
    extension (a: uv_membership)
      inline def &(b: uv_membership): uv_membership = a & b
      inline def |(b: uv_membership): uv_membership = a | b
      inline def is(b: uv_membership): Boolean = (a & b) == b

  /**
  */
  opaque type uv_poll_event = CUnsignedInt
  object uv_poll_event extends CEnumU[uv_poll_event]:
    given _tag: Tag[uv_poll_event] = Tag.UInt
    inline def define(inline a: Long): uv_poll_event = a.toUInt
    val UV_READABLE = define(1)
    val UV_WRITABLE = define(2)
    val UV_DISCONNECT = define(4)
    val UV_PRIORITIZED = define(8)
    inline def getName(inline value: uv_poll_event): Option[String] =
      inline value match
        case UV_READABLE => Some("UV_READABLE")
        case UV_WRITABLE => Some("UV_WRITABLE")
        case UV_DISCONNECT => Some("UV_DISCONNECT")
        case UV_PRIORITIZED => Some("UV_PRIORITIZED")
        case _ => None
    extension (a: uv_poll_event)
      inline def &(b: uv_poll_event): uv_poll_event = a & b
      inline def |(b: uv_poll_event): uv_poll_event = a | b
      inline def is(b: uv_poll_event): Boolean = (a & b) == b

  /**
  */
  opaque type uv_process_flags = CUnsignedInt
  object uv_process_flags extends CEnumU[uv_process_flags]:
    given _tag: Tag[uv_process_flags] = Tag.UInt
    inline def define(inline a: Long): uv_process_flags = a.toUInt
    val UV_PROCESS_SETUID = define(1)
    val UV_PROCESS_SETGID = define(2)
    val UV_PROCESS_WINDOWS_VERBATIM_ARGUMENTS = define(4)
    val UV_PROCESS_DETACHED = define(8)
    val UV_PROCESS_WINDOWS_HIDE = define(16)
    val UV_PROCESS_WINDOWS_HIDE_CONSOLE = define(32)
    val UV_PROCESS_WINDOWS_HIDE_GUI = define(64)
    inline def getName(inline value: uv_process_flags): Option[String] =
      inline value match
        case UV_PROCESS_SETUID => Some("UV_PROCESS_SETUID")
        case UV_PROCESS_SETGID => Some("UV_PROCESS_SETGID")
        case UV_PROCESS_WINDOWS_VERBATIM_ARGUMENTS => Some("UV_PROCESS_WINDOWS_VERBATIM_ARGUMENTS")
        case UV_PROCESS_DETACHED => Some("UV_PROCESS_DETACHED")
        case UV_PROCESS_WINDOWS_HIDE => Some("UV_PROCESS_WINDOWS_HIDE")
        case UV_PROCESS_WINDOWS_HIDE_CONSOLE => Some("UV_PROCESS_WINDOWS_HIDE_CONSOLE")
        case UV_PROCESS_WINDOWS_HIDE_GUI => Some("UV_PROCESS_WINDOWS_HIDE_GUI")
        case _ => None
    extension (a: uv_process_flags)
      inline def &(b: uv_process_flags): uv_process_flags = a & b
      inline def |(b: uv_process_flags): uv_process_flags = a | b
      inline def is(b: uv_process_flags): Boolean = (a & b) == b

  /**
  */
  opaque type uv_req_type = CUnsignedInt
  object uv_req_type extends CEnumU[uv_req_type]:
    given _tag: Tag[uv_req_type] = Tag.UInt
    inline def define(inline a: Long): uv_req_type = a.toUInt
    val UV_UNKNOWN_REQ = define(0)
    val UV_REQ = define(1)
    val UV_CONNECT = define(2)
    val UV_WRITE = define(3)
    val UV_SHUTDOWN = define(4)
    val UV_UDP_SEND = define(5)
    val UV_FS = define(6)
    val UV_WORK = define(7)
    val UV_GETADDRINFO = define(8)
    val UV_GETNAMEINFO = define(9)
    val UV_RANDOM = define(10)
    val UV_REQ_TYPE_MAX = define(11)
    inline def getName(inline value: uv_req_type): Option[String] =
      inline value match
        case UV_UNKNOWN_REQ => Some("UV_UNKNOWN_REQ")
        case UV_REQ => Some("UV_REQ")
        case UV_CONNECT => Some("UV_CONNECT")
        case UV_WRITE => Some("UV_WRITE")
        case UV_SHUTDOWN => Some("UV_SHUTDOWN")
        case UV_UDP_SEND => Some("UV_UDP_SEND")
        case UV_FS => Some("UV_FS")
        case UV_WORK => Some("UV_WORK")
        case UV_GETADDRINFO => Some("UV_GETADDRINFO")
        case UV_GETNAMEINFO => Some("UV_GETNAMEINFO")
        case UV_RANDOM => Some("UV_RANDOM")
        case UV_REQ_TYPE_MAX => Some("UV_REQ_TYPE_MAX")
        case _ => None
    extension (a: uv_req_type)
      inline def &(b: uv_req_type): uv_req_type = a & b
      inline def |(b: uv_req_type): uv_req_type = a | b
      inline def is(b: uv_req_type): Boolean = (a & b) == b

  /**
  */
  opaque type uv_run_mode = CUnsignedInt
  object uv_run_mode extends CEnumU[uv_run_mode]:
    given _tag: Tag[uv_run_mode] = Tag.UInt
    inline def define(inline a: Long): uv_run_mode = a.toUInt
    val UV_RUN_DEFAULT = define(0)
    val UV_RUN_ONCE = define(1)
    val UV_RUN_NOWAIT = define(2)
    inline def getName(inline value: uv_run_mode): Option[String] =
      inline value match
        case UV_RUN_DEFAULT => Some("UV_RUN_DEFAULT")
        case UV_RUN_ONCE => Some("UV_RUN_ONCE")
        case UV_RUN_NOWAIT => Some("UV_RUN_NOWAIT")
        case _ => None
    extension (a: uv_run_mode)
      inline def &(b: uv_run_mode): uv_run_mode = a & b
      inline def |(b: uv_run_mode): uv_run_mode = a | b
      inline def is(b: uv_run_mode): Boolean = (a & b) == b

  /**
  */
  opaque type uv_stdio_flags = CUnsignedInt
  object uv_stdio_flags extends CEnumU[uv_stdio_flags]:
    given _tag: Tag[uv_stdio_flags] = Tag.UInt
    inline def define(inline a: Long): uv_stdio_flags = a.toUInt
    val UV_IGNORE = define(0)
    val UV_CREATE_PIPE = define(1)
    val UV_INHERIT_FD = define(2)
    val UV_INHERIT_STREAM = define(4)
    val UV_READABLE_PIPE = define(16)
    val UV_WRITABLE_PIPE = define(32)
    val UV_NONBLOCK_PIPE = define(64)
    val UV_OVERLAPPED_PIPE = define(64)
    inline def getName(inline value: uv_stdio_flags): Option[String] =
      inline value match
        case UV_IGNORE => Some("UV_IGNORE")
        case UV_CREATE_PIPE => Some("UV_CREATE_PIPE")
        case UV_INHERIT_FD => Some("UV_INHERIT_FD")
        case UV_INHERIT_STREAM => Some("UV_INHERIT_STREAM")
        case UV_READABLE_PIPE => Some("UV_READABLE_PIPE")
        case UV_WRITABLE_PIPE => Some("UV_WRITABLE_PIPE")
        case UV_NONBLOCK_PIPE => Some("UV_NONBLOCK_PIPE")
        case UV_OVERLAPPED_PIPE => Some("UV_OVERLAPPED_PIPE")
        case _ => None
    extension (a: uv_stdio_flags)
      inline def &(b: uv_stdio_flags): uv_stdio_flags = a & b
      inline def |(b: uv_stdio_flags): uv_stdio_flags = a | b
      inline def is(b: uv_stdio_flags): Boolean = (a & b) == b

  /**
  */
  opaque type uv_tcp_flags = CUnsignedInt
  object uv_tcp_flags extends CEnumU[uv_tcp_flags]:
    given _tag: Tag[uv_tcp_flags] = Tag.UInt
    inline def define(inline a: Long): uv_tcp_flags = a.toUInt
    val UV_TCP_IPV6ONLY = define(1)
    inline def getName(inline value: uv_tcp_flags): Option[String] =
      inline value match
        case UV_TCP_IPV6ONLY => Some("UV_TCP_IPV6ONLY")
        case _ => None
    extension (a: uv_tcp_flags)
      inline def &(b: uv_tcp_flags): uv_tcp_flags = a & b
      inline def |(b: uv_tcp_flags): uv_tcp_flags = a | b
      inline def is(b: uv_tcp_flags): Boolean = (a & b) == b

  /**
  */
  opaque type uv_thread_create_flags = CUnsignedInt
  object uv_thread_create_flags extends CEnumU[uv_thread_create_flags]:
    given _tag: Tag[uv_thread_create_flags] = Tag.UInt
    inline def define(inline a: Long): uv_thread_create_flags = a.toUInt
    val UV_THREAD_NO_FLAGS = define(0)
    val UV_THREAD_HAS_STACK_SIZE = define(1)
    inline def getName(inline value: uv_thread_create_flags): Option[String] =
      inline value match
        case UV_THREAD_NO_FLAGS => Some("UV_THREAD_NO_FLAGS")
        case UV_THREAD_HAS_STACK_SIZE => Some("UV_THREAD_HAS_STACK_SIZE")
        case _ => None
    extension (a: uv_thread_create_flags)
      inline def &(b: uv_thread_create_flags): uv_thread_create_flags = a & b
      inline def |(b: uv_thread_create_flags): uv_thread_create_flags = a | b
      inline def is(b: uv_thread_create_flags): Boolean = (a & b) == b

  /**
  */
  opaque type uv_tty_mode_t = CUnsignedInt
  object uv_tty_mode_t extends CEnumU[uv_tty_mode_t]:
    given _tag: Tag[uv_tty_mode_t] = Tag.UInt
    inline def define(inline a: Long): uv_tty_mode_t = a.toUInt
    val UV_TTY_MODE_NORMAL = define(0)
    val UV_TTY_MODE_RAW = define(1)
    val UV_TTY_MODE_IO = define(2)
    inline def getName(inline value: uv_tty_mode_t): Option[String] =
      inline value match
        case UV_TTY_MODE_NORMAL => Some("UV_TTY_MODE_NORMAL")
        case UV_TTY_MODE_RAW => Some("UV_TTY_MODE_RAW")
        case UV_TTY_MODE_IO => Some("UV_TTY_MODE_IO")
        case _ => None
    extension (a: uv_tty_mode_t)
      inline def &(b: uv_tty_mode_t): uv_tty_mode_t = a & b
      inline def |(b: uv_tty_mode_t): uv_tty_mode_t = a | b
      inline def is(b: uv_tty_mode_t): Boolean = (a & b) == b

  /**
  */
  opaque type uv_tty_vtermstate_t = CUnsignedInt
  object uv_tty_vtermstate_t extends CEnumU[uv_tty_vtermstate_t]:
    given _tag: Tag[uv_tty_vtermstate_t] = Tag.UInt
    inline def define(inline a: Long): uv_tty_vtermstate_t = a.toUInt
    val UV_TTY_SUPPORTED = define(0)
    val UV_TTY_UNSUPPORTED = define(1)
    inline def getName(inline value: uv_tty_vtermstate_t): Option[String] =
      inline value match
        case UV_TTY_SUPPORTED => Some("UV_TTY_SUPPORTED")
        case UV_TTY_UNSUPPORTED => Some("UV_TTY_UNSUPPORTED")
        case _ => None
    extension (a: uv_tty_vtermstate_t)
      inline def &(b: uv_tty_vtermstate_t): uv_tty_vtermstate_t = a & b
      inline def |(b: uv_tty_vtermstate_t): uv_tty_vtermstate_t = a | b
      inline def is(b: uv_tty_vtermstate_t): Boolean = (a & b) == b

  /**
  */
  opaque type uv_udp_flags = CUnsignedInt
  object uv_udp_flags extends CEnumU[uv_udp_flags]:
    given _tag: Tag[uv_udp_flags] = Tag.UInt
    inline def define(inline a: Long): uv_udp_flags = a.toUInt
    val UV_UDP_IPV6ONLY = define(1)
    val UV_UDP_PARTIAL = define(2)
    val UV_UDP_REUSEADDR = define(4)
    val UV_UDP_MMSG_CHUNK = define(8)
    val UV_UDP_MMSG_FREE = define(16)
    val UV_UDP_LINUX_RECVERR = define(32)
    val UV_UDP_RECVMMSG = define(256)
    inline def getName(inline value: uv_udp_flags): Option[String] =
      inline value match
        case UV_UDP_IPV6ONLY => Some("UV_UDP_IPV6ONLY")
        case UV_UDP_PARTIAL => Some("UV_UDP_PARTIAL")
        case UV_UDP_REUSEADDR => Some("UV_UDP_REUSEADDR")
        case UV_UDP_MMSG_CHUNK => Some("UV_UDP_MMSG_CHUNK")
        case UV_UDP_MMSG_FREE => Some("UV_UDP_MMSG_FREE")
        case UV_UDP_LINUX_RECVERR => Some("UV_UDP_LINUX_RECVERR")
        case UV_UDP_RECVMMSG => Some("UV_UDP_RECVMMSG")
        case _ => None
    extension (a: uv_udp_flags)
      inline def &(b: uv_udp_flags): uv_udp_flags = a & b
      inline def |(b: uv_udp_flags): uv_udp_flags = a | b
      inline def is(b: uv_udp_flags): Boolean = (a & b) == b

object aliases:
  import _root_.libuv.enumerations.*
  import _root_.libuv.predef.*
  import _root_.libuv.aliases.*
  import _root_.libuv.structs.*
  import _root_.libuv.unions.*
  type DIR = posix.dirent.DIR
  object DIR: 
    val _tag: Tag[DIR] = summon[Tag[posix.dirent.DIR]]
    inline def apply(inline o: posix.dirent.DIR): DIR = o
    extension (v: DIR)
      inline def value: posix.dirent.DIR = v

  type FILE = libc.stdio.FILE
  object FILE: 
    val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
    inline def apply(inline o: libc.stdio.FILE): FILE = o
    extension (v: FILE)
      inline def value: libc.stdio.FILE = v

  /**
  */
  type __darwin_mach_port_name_t = __darwin_natural_t
  object __darwin_mach_port_name_t: 
    given _tag: Tag[__darwin_mach_port_name_t] = __darwin_natural_t._tag
    inline def apply(inline o: __darwin_natural_t): __darwin_mach_port_name_t = o
    extension (v: __darwin_mach_port_name_t)
      inline def value: __darwin_natural_t = v

  /**
  */
  type __darwin_mach_port_t = __darwin_mach_port_name_t
  object __darwin_mach_port_t: 
    given _tag: Tag[__darwin_mach_port_t] = __darwin_mach_port_name_t._tag
    inline def apply(inline o: __darwin_mach_port_name_t): __darwin_mach_port_t = o
    extension (v: __darwin_mach_port_t)
      inline def value: __darwin_mach_port_name_t = v

  /**
  */
  opaque type __darwin_natural_t = CUnsignedInt
  object __darwin_natural_t: 
    given _tag: Tag[__darwin_natural_t] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): __darwin_natural_t = o
    extension (v: __darwin_natural_t)
      inline def value: CUnsignedInt = v

  /**
  */
  opaque type __uint16_t = CUnsignedShort
  object __uint16_t: 
    given _tag: Tag[__uint16_t] = Tag.UShort
    inline def apply(inline o: CUnsignedShort): __uint16_t = o
    extension (v: __uint16_t)
      inline def value: CUnsignedShort = v

  /**
  */
  opaque type __uint64_t = CUnsignedLongLong
  object __uint64_t: 
    given _tag: Tag[__uint64_t] = Tag.ULong
    inline def apply(inline o: CUnsignedLongLong): __uint64_t = o
    extension (v: __uint64_t)
      inline def value: CUnsignedLongLong = v

  /**
  */
  opaque type __uint8_t = CUnsignedChar
  object __uint8_t: 
    given _tag: Tag[__uint8_t] = Tag.UByte
    inline def apply(inline o: CUnsignedChar): __uint8_t = o
    extension (v: __uint8_t)
      inline def value: CUnsignedChar = v

  type addrinfo = posix.netdb.addrinfo
  object addrinfo: 
    val _tag: Tag[addrinfo] = summon[Tag[posix.netdb.addrinfo]]
    inline def apply(inline o: posix.netdb.addrinfo): addrinfo = o
    extension (v: addrinfo)
      inline def value: posix.netdb.addrinfo = v

  type gid_t = posix.sys.types.gid_t
  object gid_t: 
    val _tag: Tag[gid_t] = summon[Tag[posix.sys.types.gid_t]]
    inline def apply(inline o: posix.sys.types.gid_t): gid_t = o
    extension (v: gid_t)
      inline def value: posix.sys.types.gid_t = v

  type int32_t = scala.scalanative.unsafe.CInt
  object int32_t: 
    val _tag: Tag[int32_t] = summon[Tag[scala.scalanative.unsafe.CInt]]
    inline def apply(inline o: scala.scalanative.unsafe.CInt): int32_t = o
    extension (v: int32_t)
      inline def value: scala.scalanative.unsafe.CInt = v

  type int64_t = scala.Long
  object int64_t: 
    val _tag: Tag[int64_t] = summon[Tag[scala.Long]]
    inline def apply(inline o: scala.Long): int64_t = o
    extension (v: int64_t)
      inline def value: scala.Long = v

  /**
  */
  type mach_port_t = __darwin_mach_port_t
  object mach_port_t: 
    given _tag: Tag[mach_port_t] = __darwin_mach_port_t._tag
    inline def apply(inline o: __darwin_mach_port_t): mach_port_t = o
    extension (v: mach_port_t)
      inline def value: __darwin_mach_port_t = v

  type mode_t = posix.sys.types.mode_t
  object mode_t: 
    val _tag: Tag[mode_t] = summon[Tag[posix.sys.types.mode_t]]
    inline def apply(inline o: posix.sys.types.mode_t): mode_t = o
    extension (v: mode_t)
      inline def value: posix.sys.types.mode_t = v

  type off_t = posix.unistd.off_t
  object off_t: 
    val _tag: Tag[off_t] = summon[Tag[posix.unistd.off_t]]
    inline def apply(inline o: posix.unistd.off_t): off_t = o
    extension (v: off_t)
      inline def value: posix.unistd.off_t = v

  type pid_t = posix.sys.types.pid_t
  object pid_t: 
    val _tag: Tag[pid_t] = summon[Tag[posix.sys.types.pid_t]]
    inline def apply(inline o: posix.sys.types.pid_t): pid_t = o
    extension (v: pid_t)
      inline def value: posix.sys.types.pid_t = v

  type pthread_cond_t = posix.sys.types.pthread_cond_t
  object pthread_cond_t: 
    val _tag: Tag[pthread_cond_t] = summon[Tag[posix.sys.types.pthread_cond_t]]
    inline def apply(inline o: posix.sys.types.pthread_cond_t): pthread_cond_t = o
    extension (v: pthread_cond_t)
      inline def value: posix.sys.types.pthread_cond_t = v

  type pthread_key_t = posix.sys.types.pthread_key_t
  object pthread_key_t: 
    val _tag: Tag[pthread_key_t] = summon[Tag[posix.sys.types.pthread_key_t]]
    inline def apply(inline o: posix.sys.types.pthread_key_t): pthread_key_t = o
    extension (v: pthread_key_t)
      inline def value: posix.sys.types.pthread_key_t = v

  type pthread_mutex_t = posix.sys.types.pthread_mutex_t
  object pthread_mutex_t: 
    val _tag: Tag[pthread_mutex_t] = summon[Tag[posix.sys.types.pthread_mutex_t]]
    inline def apply(inline o: posix.sys.types.pthread_mutex_t): pthread_mutex_t = o
    extension (v: pthread_mutex_t)
      inline def value: posix.sys.types.pthread_mutex_t = v

  type pthread_once_t = posix.sys.types.pthread_once_t
  object pthread_once_t: 
    val _tag: Tag[pthread_once_t] = summon[Tag[posix.sys.types.pthread_once_t]]
    inline def apply(inline o: posix.sys.types.pthread_once_t): pthread_once_t = o
    extension (v: pthread_once_t)
      inline def value: posix.sys.types.pthread_once_t = v

  type pthread_rwlock_t = posix.sys.types.pthread_rwlock_t
  object pthread_rwlock_t: 
    val _tag: Tag[pthread_rwlock_t] = summon[Tag[posix.sys.types.pthread_rwlock_t]]
    inline def apply(inline o: posix.sys.types.pthread_rwlock_t): pthread_rwlock_t = o
    extension (v: pthread_rwlock_t)
      inline def value: posix.sys.types.pthread_rwlock_t = v

  type pthread_t = posix.sys.types.pthread_t
  object pthread_t: 
    val _tag: Tag[pthread_t] = summon[Tag[posix.sys.types.pthread_t]]
    inline def apply(inline o: posix.sys.types.pthread_t): pthread_t = o
    extension (v: pthread_t)
      inline def value: posix.sys.types.pthread_t = v

  /**
  */
  type semaphore_t = mach_port_t
  object semaphore_t: 
    given _tag: Tag[semaphore_t] = mach_port_t._tag
    inline def apply(inline o: mach_port_t): semaphore_t = o
    extension (v: semaphore_t)
      inline def value: mach_port_t = v

  type size_t = libc.stddef.size_t
  object size_t: 
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t)
      inline def value: libc.stddef.size_t = v

  type sockaddr = posix.sys.socket.sockaddr
  object sockaddr: 
    val _tag: Tag[sockaddr] = summon[Tag[posix.sys.socket.sockaddr]]
    inline def apply(inline o: posix.sys.socket.sockaddr): sockaddr = o
    extension (v: sockaddr)
      inline def value: posix.sys.socket.sockaddr = v

  type sockaddr_in = posix.netinet.in.sockaddr_in
  object sockaddr_in: 
    val _tag: Tag[sockaddr_in] = summon[Tag[posix.netinet.in.sockaddr_in]]
    inline def apply(inline o: posix.netinet.in.sockaddr_in): sockaddr_in = o
    extension (v: sockaddr_in)
      inline def value: posix.netinet.in.sockaddr_in = v

  type sockaddr_in6 = posix.netinet.in.sockaddr_in6
  object sockaddr_in6: 
    val _tag: Tag[sockaddr_in6] = summon[Tag[posix.netinet.in.sockaddr_in6]]
    inline def apply(inline o: posix.netinet.in.sockaddr_in6): sockaddr_in6 = o
    extension (v: sockaddr_in6)
      inline def value: posix.netinet.in.sockaddr_in6 = v

  type sockaddr_storage = posix.sys.socket.sockaddr_storage
  object sockaddr_storage: 
    val _tag: Tag[sockaddr_storage] = summon[Tag[posix.sys.socket.sockaddr_storage]]
    inline def apply(inline o: posix.sys.socket.sockaddr_storage): sockaddr_storage = o
    extension (v: sockaddr_storage)
      inline def value: posix.sys.socket.sockaddr_storage = v

  type ssize_t = posix.sys.types.ssize_t
  object ssize_t: 
    val _tag: Tag[ssize_t] = summon[Tag[posix.sys.types.ssize_t]]
    inline def apply(inline o: posix.sys.types.ssize_t): ssize_t = o
    extension (v: ssize_t)
      inline def value: posix.sys.types.ssize_t = v

  type termios = posix.termios.termios
  object termios: 
    val _tag: Tag[termios] = summon[Tag[posix.termios.termios]]
    inline def apply(inline o: posix.termios.termios): termios = o
    extension (v: termios)
      inline def value: posix.termios.termios = v

  type uid_t = posix.sys.types.uid_t
  object uid_t: 
    val _tag: Tag[uid_t] = summon[Tag[posix.sys.types.uid_t]]
    inline def apply(inline o: posix.sys.types.uid_t): uid_t = o
    extension (v: uid_t)
      inline def value: posix.sys.types.uid_t = v

  type uint64_t = scala.scalanative.unsigned.ULong
  object uint64_t: 
    val _tag: Tag[uint64_t] = summon[Tag[scala.scalanative.unsigned.ULong]]
    inline def apply(inline o: scala.scalanative.unsigned.ULong): uint64_t = o
    extension (v: uint64_t)
      inline def value: scala.scalanative.unsigned.ULong = v

  /**
  */
  opaque type uv__io_cb = CFuncPtr3[Ptr[uv_loop_s], Ptr[uv__io_s], CUnsignedInt, Unit]
  object uv__io_cb: 
    given _tag: Tag[uv__io_cb] = Tag.materializeCFuncPtr3[Ptr[uv_loop_s], Ptr[uv__io_s], CUnsignedInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv__io_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[Ptr[uv_loop_s], Ptr[uv__io_s], CUnsignedInt, Unit]): uv__io_cb = o
    extension (v: uv__io_cb)
      inline def value: CFuncPtr3[Ptr[uv_loop_s], Ptr[uv__io_s], CUnsignedInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_after_work_cb = CFuncPtr2[Ptr[uv_work_t], CInt, Unit]
  object uv_after_work_cb: 
    given _tag: Tag[uv_after_work_cb] = Tag.materializeCFuncPtr2[Ptr[uv_work_t], CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_after_work_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[uv_work_t], CInt, Unit]): uv_after_work_cb = o
    extension (v: uv_after_work_cb)
      inline def value: CFuncPtr2[Ptr[uv_work_t], CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_alloc_cb = CFuncPtr3[Ptr[uv_handle_t], size_t, Ptr[uv_buf_t], Unit]
  object uv_alloc_cb: 
    given _tag: Tag[uv_alloc_cb] = Tag.materializeCFuncPtr3[Ptr[uv_handle_t], size_t, Ptr[uv_buf_t], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_alloc_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[Ptr[uv_handle_t], size_t, Ptr[uv_buf_t], Unit]): uv_alloc_cb = o
    extension (v: uv_alloc_cb)
      inline def value: CFuncPtr3[Ptr[uv_handle_t], size_t, Ptr[uv_buf_t], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_async_cb = CFuncPtr1[Ptr[uv_async_t], Unit]
  object uv_async_cb: 
    given _tag: Tag[uv_async_cb] = Tag.materializeCFuncPtr1[Ptr[uv_async_t], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_async_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[uv_async_t], Unit]): uv_async_cb = o
    extension (v: uv_async_cb)
      inline def value: CFuncPtr1[Ptr[uv_async_t], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_calloc_func = CFuncPtr2[size_t, size_t, Ptr[Byte]]
  object uv_calloc_func: 
    given _tag: Tag[uv_calloc_func] = Tag.materializeCFuncPtr2[size_t, size_t, Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte]): uv_calloc_func = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[size_t, size_t, Ptr[Byte]]): uv_calloc_func = o
    extension (v: uv_calloc_func)
      inline def value: CFuncPtr2[size_t, size_t, Ptr[Byte]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_check_cb = CFuncPtr1[Ptr[uv_check_t], Unit]
  object uv_check_cb: 
    given _tag: Tag[uv_check_cb] = Tag.materializeCFuncPtr1[Ptr[uv_check_t], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_check_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[uv_check_t], Unit]): uv_check_cb = o
    extension (v: uv_check_cb)
      inline def value: CFuncPtr1[Ptr[uv_check_t], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_close_cb = CFuncPtr1[Ptr[uv_handle_t], Unit]
  object uv_close_cb: 
    given _tag: Tag[uv_close_cb] = Tag.materializeCFuncPtr1[Ptr[uv_handle_t], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_close_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[uv_handle_t], Unit]): uv_close_cb = o
    extension (v: uv_close_cb)
      inline def value: CFuncPtr1[Ptr[uv_handle_t], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  type uv_cond_t = pthread_cond_t
  object uv_cond_t: 
    given _tag: Tag[uv_cond_t] = pthread_cond_t._tag
    inline def apply(inline o: pthread_cond_t): uv_cond_t = o
    extension (v: uv_cond_t)
      inline def value: pthread_cond_t = v

  /**
  */
  opaque type uv_connect_cb = CFuncPtr2[Ptr[uv_connect_t], CInt, Unit]
  object uv_connect_cb: 
    given _tag: Tag[uv_connect_cb] = Tag.materializeCFuncPtr2[Ptr[uv_connect_t], CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_connect_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[uv_connect_t], CInt, Unit]): uv_connect_cb = o
    extension (v: uv_connect_cb)
      inline def value: CFuncPtr2[Ptr[uv_connect_t], CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_connection_cb = CFuncPtr2[Ptr[uv_stream_t], CInt, Unit]
  object uv_connection_cb: 
    given _tag: Tag[uv_connection_cb] = Tag.materializeCFuncPtr2[Ptr[uv_stream_t], CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_connection_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[uv_stream_t], CInt, Unit]): uv_connection_cb = o
    extension (v: uv_connection_cb)
      inline def value: CFuncPtr2[Ptr[uv_stream_t], CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_exit_cb = CFuncPtr3[Ptr[uv_process_t], int64_t, CInt, Unit]
  object uv_exit_cb: 
    given _tag: Tag[uv_exit_cb] = Tag.materializeCFuncPtr3[Ptr[uv_process_t], int64_t, CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_exit_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[Ptr[uv_process_t], int64_t, CInt, Unit]): uv_exit_cb = o
    extension (v: uv_exit_cb)
      inline def value: CFuncPtr3[Ptr[uv_process_t], int64_t, CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_file = CInt
  object uv_file: 
    given _tag: Tag[uv_file] = Tag.Int
    inline def apply(inline o: CInt): uv_file = o
    extension (v: uv_file)
      inline def value: CInt = v

  /**
  */
  opaque type uv_free_func = CFuncPtr1[Ptr[Byte], Unit]
  object uv_free_func: 
    given _tag: Tag[uv_free_func] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_free_func = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): uv_free_func = o
    extension (v: uv_free_func)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_fs_cb = CFuncPtr1[Ptr[uv_fs_t], Unit]
  object uv_fs_cb: 
    given _tag: Tag[uv_fs_cb] = Tag.materializeCFuncPtr1[Ptr[uv_fs_t], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_fs_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[uv_fs_t], Unit]): uv_fs_cb = o
    extension (v: uv_fs_cb)
      inline def value: CFuncPtr1[Ptr[uv_fs_t], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_fs_event_cb = CFuncPtr4[Ptr[uv_fs_event_t], CString, CInt, CInt, Unit]
  object uv_fs_event_cb: 
    given _tag: Tag[uv_fs_event_cb] = Tag.materializeCFuncPtr4[Ptr[uv_fs_event_t], CString, CInt, CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_fs_event_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr4[Ptr[uv_fs_event_t], CString, CInt, CInt, Unit]): uv_fs_event_cb = o
    extension (v: uv_fs_event_cb)
      inline def value: CFuncPtr4[Ptr[uv_fs_event_t], CString, CInt, CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_fs_poll_cb = CFuncPtr4[Ptr[uv_fs_poll_t], CInt, Ptr[uv_stat_t], Ptr[uv_stat_t], Unit]
  object uv_fs_poll_cb: 
    given _tag: Tag[uv_fs_poll_cb] = Tag.materializeCFuncPtr4[Ptr[uv_fs_poll_t], CInt, Ptr[uv_stat_t], Ptr[uv_stat_t], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_fs_poll_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr4[Ptr[uv_fs_poll_t], CInt, Ptr[uv_stat_t], Ptr[uv_stat_t], Unit]): uv_fs_poll_cb = o
    extension (v: uv_fs_poll_cb)
      inline def value: CFuncPtr4[Ptr[uv_fs_poll_t], CInt, Ptr[uv_stat_t], Ptr[uv_stat_t], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_getaddrinfo_cb = CFuncPtr3[Ptr[uv_getaddrinfo_t], CInt, Ptr[addrinfo], Unit]
  object uv_getaddrinfo_cb: 
    given _tag: Tag[uv_getaddrinfo_cb] = Tag.materializeCFuncPtr3[Ptr[uv_getaddrinfo_t], CInt, Ptr[addrinfo], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_getaddrinfo_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[Ptr[uv_getaddrinfo_t], CInt, Ptr[addrinfo], Unit]): uv_getaddrinfo_cb = o
    extension (v: uv_getaddrinfo_cb)
      inline def value: CFuncPtr3[Ptr[uv_getaddrinfo_t], CInt, Ptr[addrinfo], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_getnameinfo_cb = CFuncPtr4[Ptr[uv_getnameinfo_t], CInt, CString, CString, Unit]
  object uv_getnameinfo_cb: 
    given _tag: Tag[uv_getnameinfo_cb] = Tag.materializeCFuncPtr4[Ptr[uv_getnameinfo_t], CInt, CString, CString, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_getnameinfo_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr4[Ptr[uv_getnameinfo_t], CInt, CString, CString, Unit]): uv_getnameinfo_cb = o
    extension (v: uv_getnameinfo_cb)
      inline def value: CFuncPtr4[Ptr[uv_getnameinfo_t], CInt, CString, CString, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  type uv_gid_t = gid_t
  object uv_gid_t: 
    given _tag: Tag[uv_gid_t] = gid_t._tag
    inline def apply(inline o: gid_t): uv_gid_t = o
    extension (v: uv_gid_t)
      inline def value: gid_t = v

  /**
  */
  opaque type uv_idle_cb = CFuncPtr1[Ptr[uv_idle_t], Unit]
  object uv_idle_cb: 
    given _tag: Tag[uv_idle_cb] = Tag.materializeCFuncPtr1[Ptr[uv_idle_t], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_idle_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[uv_idle_t], Unit]): uv_idle_cb = o
    extension (v: uv_idle_cb)
      inline def value: CFuncPtr1[Ptr[uv_idle_t], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  type uv_key_t = pthread_key_t
  object uv_key_t: 
    given _tag: Tag[uv_key_t] = pthread_key_t._tag
    inline def apply(inline o: pthread_key_t): uv_key_t = o
    extension (v: uv_key_t)
      inline def value: pthread_key_t = v

  /**
  */
  opaque type uv_malloc_func = CFuncPtr1[size_t, Ptr[Byte]]
  object uv_malloc_func: 
    given _tag: Tag[uv_malloc_func] = Tag.materializeCFuncPtr1[size_t, Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte]): uv_malloc_func = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[size_t, Ptr[Byte]]): uv_malloc_func = o
    extension (v: uv_malloc_func)
      inline def value: CFuncPtr1[size_t, Ptr[Byte]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  type uv_mutex_t = pthread_mutex_t
  object uv_mutex_t: 
    given _tag: Tag[uv_mutex_t] = pthread_mutex_t._tag
    inline def apply(inline o: pthread_mutex_t): uv_mutex_t = o
    extension (v: uv_mutex_t)
      inline def value: pthread_mutex_t = v

  /**
  */
  type uv_once_t = pthread_once_t
  object uv_once_t: 
    given _tag: Tag[uv_once_t] = pthread_once_t._tag
    inline def apply(inline o: pthread_once_t): uv_once_t = o
    extension (v: uv_once_t)
      inline def value: pthread_once_t = v

  /**
  */
  opaque type uv_os_fd_t = CInt
  object uv_os_fd_t: 
    given _tag: Tag[uv_os_fd_t] = Tag.Int
    inline def apply(inline o: CInt): uv_os_fd_t = o
    extension (v: uv_os_fd_t)
      inline def value: CInt = v

  /**
  */
  opaque type uv_os_sock_t = CInt
  object uv_os_sock_t: 
    given _tag: Tag[uv_os_sock_t] = Tag.Int
    inline def apply(inline o: CInt): uv_os_sock_t = o
    extension (v: uv_os_sock_t)
      inline def value: CInt = v

  /**
  */
  type uv_pid_t = pid_t
  object uv_pid_t: 
    given _tag: Tag[uv_pid_t] = pid_t._tag
    inline def apply(inline o: pid_t): uv_pid_t = o
    extension (v: uv_pid_t)
      inline def value: pid_t = v

  /**
  */
  opaque type uv_poll_cb = CFuncPtr3[Ptr[uv_poll_t], CInt, CInt, Unit]
  object uv_poll_cb: 
    given _tag: Tag[uv_poll_cb] = Tag.materializeCFuncPtr3[Ptr[uv_poll_t], CInt, CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_poll_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[Ptr[uv_poll_t], CInt, CInt, Unit]): uv_poll_cb = o
    extension (v: uv_poll_cb)
      inline def value: CFuncPtr3[Ptr[uv_poll_t], CInt, CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_prepare_cb = CFuncPtr1[Ptr[uv_prepare_t], Unit]
  object uv_prepare_cb: 
    given _tag: Tag[uv_prepare_cb] = Tag.materializeCFuncPtr1[Ptr[uv_prepare_t], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_prepare_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[uv_prepare_t], Unit]): uv_prepare_cb = o
    extension (v: uv_prepare_cb)
      inline def value: CFuncPtr1[Ptr[uv_prepare_t], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_random_cb = CFuncPtr4[Ptr[uv_random_t], CInt, Ptr[Byte], size_t, Unit]
  object uv_random_cb: 
    given _tag: Tag[uv_random_cb] = Tag.materializeCFuncPtr4[Ptr[uv_random_t], CInt, Ptr[Byte], size_t, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_random_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr4[Ptr[uv_random_t], CInt, Ptr[Byte], size_t, Unit]): uv_random_cb = o
    extension (v: uv_random_cb)
      inline def value: CFuncPtr4[Ptr[uv_random_t], CInt, Ptr[Byte], size_t, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_read_cb = CFuncPtr3[Ptr[uv_stream_t], ssize_t, Ptr[uv_buf_t], Unit]
  object uv_read_cb: 
    given _tag: Tag[uv_read_cb] = Tag.materializeCFuncPtr3[Ptr[uv_stream_t], ssize_t, Ptr[uv_buf_t], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_read_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[Ptr[uv_stream_t], ssize_t, Ptr[uv_buf_t], Unit]): uv_read_cb = o
    extension (v: uv_read_cb)
      inline def value: CFuncPtr3[Ptr[uv_stream_t], ssize_t, Ptr[uv_buf_t], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_realloc_func = CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]
  object uv_realloc_func: 
    given _tag: Tag[uv_realloc_func] = Tag.materializeCFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte]): uv_realloc_func = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]): uv_realloc_func = o
    extension (v: uv_realloc_func)
      inline def value: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  type uv_rwlock_t = pthread_rwlock_t
  object uv_rwlock_t: 
    given _tag: Tag[uv_rwlock_t] = pthread_rwlock_t._tag
    inline def apply(inline o: pthread_rwlock_t): uv_rwlock_t = o
    extension (v: uv_rwlock_t)
      inline def value: pthread_rwlock_t = v

  /**
  */
  type uv_sem_t = semaphore_t
  object uv_sem_t: 
    given _tag: Tag[uv_sem_t] = semaphore_t._tag
    inline def apply(inline o: semaphore_t): uv_sem_t = o
    extension (v: uv_sem_t)
      inline def value: semaphore_t = v

  /**
  */
  opaque type uv_shutdown_cb = CFuncPtr2[Ptr[uv_shutdown_t], CInt, Unit]
  object uv_shutdown_cb: 
    given _tag: Tag[uv_shutdown_cb] = Tag.materializeCFuncPtr2[Ptr[uv_shutdown_t], CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_shutdown_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[uv_shutdown_t], CInt, Unit]): uv_shutdown_cb = o
    extension (v: uv_shutdown_cb)
      inline def value: CFuncPtr2[Ptr[uv_shutdown_t], CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_signal_cb = CFuncPtr2[Ptr[uv_signal_t], CInt, Unit]
  object uv_signal_cb: 
    given _tag: Tag[uv_signal_cb] = Tag.materializeCFuncPtr2[Ptr[uv_signal_t], CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_signal_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[uv_signal_t], CInt, Unit]): uv_signal_cb = o
    extension (v: uv_signal_cb)
      inline def value: CFuncPtr2[Ptr[uv_signal_t], CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_thread_cb = CFuncPtr1[Ptr[Byte], Unit]
  object uv_thread_cb: 
    given _tag: Tag[uv_thread_cb] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_thread_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): uv_thread_cb = o
    extension (v: uv_thread_cb)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  type uv_thread_t = pthread_t
  object uv_thread_t: 
    given _tag: Tag[uv_thread_t] = pthread_t._tag
    inline def apply(inline o: pthread_t): uv_thread_t = o
    extension (v: uv_thread_t)
      inline def value: pthread_t = v

  /**
  */
  opaque type uv_timer_cb = CFuncPtr1[Ptr[uv_timer_t], Unit]
  object uv_timer_cb: 
    given _tag: Tag[uv_timer_cb] = Tag.materializeCFuncPtr1[Ptr[uv_timer_t], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_timer_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[uv_timer_t], Unit]): uv_timer_cb = o
    extension (v: uv_timer_cb)
      inline def value: CFuncPtr1[Ptr[uv_timer_t], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_udp_recv_cb = CFuncPtr5[Ptr[uv_udp_t], ssize_t, Ptr[uv_buf_t], Ptr[sockaddr], CUnsignedInt, Unit]
  object uv_udp_recv_cb: 
    given _tag: Tag[uv_udp_recv_cb] = Tag.materializeCFuncPtr5[Ptr[uv_udp_t], ssize_t, Ptr[uv_buf_t], Ptr[sockaddr], CUnsignedInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_udp_recv_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr5[Ptr[uv_udp_t], ssize_t, Ptr[uv_buf_t], Ptr[sockaddr], CUnsignedInt, Unit]): uv_udp_recv_cb = o
    extension (v: uv_udp_recv_cb)
      inline def value: CFuncPtr5[Ptr[uv_udp_t], ssize_t, Ptr[uv_buf_t], Ptr[sockaddr], CUnsignedInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_udp_send_cb = CFuncPtr2[Ptr[uv_udp_send_t], CInt, Unit]
  object uv_udp_send_cb: 
    given _tag: Tag[uv_udp_send_cb] = Tag.materializeCFuncPtr2[Ptr[uv_udp_send_t], CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_udp_send_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[uv_udp_send_t], CInt, Unit]): uv_udp_send_cb = o
    extension (v: uv_udp_send_cb)
      inline def value: CFuncPtr2[Ptr[uv_udp_send_t], CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  type uv_uid_t = uid_t
  object uv_uid_t: 
    given _tag: Tag[uv_uid_t] = uid_t._tag
    inline def apply(inline o: uid_t): uv_uid_t = o
    extension (v: uv_uid_t)
      inline def value: uid_t = v

  /**
  */
  opaque type uv_walk_cb = CFuncPtr2[Ptr[uv_handle_t], Ptr[Byte], Unit]
  object uv_walk_cb: 
    given _tag: Tag[uv_walk_cb] = Tag.materializeCFuncPtr2[Ptr[uv_handle_t], Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_walk_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[uv_handle_t], Ptr[Byte], Unit]): uv_walk_cb = o
    extension (v: uv_walk_cb)
      inline def value: CFuncPtr2[Ptr[uv_handle_t], Ptr[Byte], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_work_cb = CFuncPtr1[Ptr[uv_work_t], Unit]
  object uv_work_cb: 
    given _tag: Tag[uv_work_cb] = Tag.materializeCFuncPtr1[Ptr[uv_work_t], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_work_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[uv_work_t], Unit]): uv_work_cb = o
    extension (v: uv_work_cb)
      inline def value: CFuncPtr1[Ptr[uv_work_t], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
  */
  opaque type uv_write_cb = CFuncPtr2[Ptr[uv_write_t], CInt, Unit]
  object uv_write_cb: 
    given _tag: Tag[uv_write_cb] = Tag.materializeCFuncPtr2[Ptr[uv_write_t], CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): uv_write_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[uv_write_t], CInt, Unit]): uv_write_cb = o
    extension (v: uv_write_cb)
      inline def value: CFuncPtr2[Ptr[uv_write_t], CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

object structs:
  import _root_.libuv.enumerations.*
  import _root_.libuv.predef.*
  import _root_.libuv.aliases.*
  import _root_.libuv.structs.*
  import _root_.libuv.unions.*
  /**
  */
  opaque type _uv_barrier = CStruct5[uv_mutex_t, uv_cond_t, CUnsignedInt, CUnsignedInt, CUnsignedInt]
  object _uv_barrier:
    given _tag: Tag[_uv_barrier] = Tag.materializeCStruct5Tag[uv_mutex_t, uv_cond_t, CUnsignedInt, CUnsignedInt, CUnsignedInt]
    def apply()(using Zone): Ptr[_uv_barrier] = scala.scalanative.unsafe.alloc[_uv_barrier](1)
    def apply(mutex : uv_mutex_t, cond : uv_cond_t, threshold : CUnsignedInt, in : CUnsignedInt, out : CUnsignedInt)(using Zone): Ptr[_uv_barrier] = 
      val ____ptr = apply()
      (!____ptr).mutex = mutex
      (!____ptr).cond = cond
      (!____ptr).threshold = threshold
      (!____ptr).in = in
      (!____ptr).out = out
      ____ptr
    extension (struct: _uv_barrier)
      def mutex : uv_mutex_t = struct._1
      def mutex_=(value: uv_mutex_t): Unit = !struct.at1 = value
      def cond : uv_cond_t = struct._2
      def cond_=(value: uv_cond_t): Unit = !struct.at2 = value
      def threshold : CUnsignedInt = struct._3
      def threshold_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def in : CUnsignedInt = struct._4
      def in_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def out : CUnsignedInt = struct._5
      def out_=(value: CUnsignedInt): Unit = !struct.at5 = value

  /**
  */
  opaque type uv__dirent_t = CStruct6[__uint64_t, __uint64_t, __uint16_t, __uint16_t, __uint8_t, CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]]]
  object uv__dirent_t:
    given _tag: Tag[uv__dirent_t] = Tag.materializeCStruct6Tag[__uint64_t, __uint64_t, __uint16_t, __uint16_t, __uint8_t, CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]]]
    def apply()(using Zone): Ptr[uv__dirent_t] = scala.scalanative.unsafe.alloc[uv__dirent_t](1)
    def apply(d_ino : __uint64_t, d_seekoff : __uint64_t, d_reclen : __uint16_t, d_namlen : __uint16_t, d_type : __uint8_t, d_name : CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]])(using Zone): Ptr[uv__dirent_t] = 
      val ____ptr = apply()
      (!____ptr).d_ino = d_ino
      (!____ptr).d_seekoff = d_seekoff
      (!____ptr).d_reclen = d_reclen
      (!____ptr).d_namlen = d_namlen
      (!____ptr).d_type = d_type
      (!____ptr).d_name = d_name
      ____ptr
    extension (struct: uv__dirent_t)
      def d_ino : __uint64_t = struct._1
      def d_ino_=(value: __uint64_t): Unit = !struct.at1 = value
      def d_seekoff : __uint64_t = struct._2
      def d_seekoff_=(value: __uint64_t): Unit = !struct.at2 = value
      def d_reclen : __uint16_t = struct._3
      def d_reclen_=(value: __uint16_t): Unit = !struct.at3 = value
      def d_namlen : __uint16_t = struct._4
      def d_namlen_=(value: __uint16_t): Unit = !struct.at4 = value
      def d_type : __uint8_t = struct._5
      def d_type_=(value: __uint8_t): Unit = !struct.at5 = value
      def d_name : CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]] = struct._6
      def d_name_=(value: CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]]): Unit = !struct.at6 = value

  /**
  */
  opaque type uv__io_s = CStruct8[Ptr[Byte], uv__queue, uv__queue, CUnsignedInt, CUnsignedInt, CInt, CInt, CInt]
  object uv__io_s:
    given _tag: Tag[uv__io_s] = Tag.materializeCStruct8Tag[Ptr[Byte], uv__queue, uv__queue, CUnsignedInt, CUnsignedInt, CInt, CInt, CInt]
    def apply()(using Zone): Ptr[uv__io_s] = scala.scalanative.unsafe.alloc[uv__io_s](1)
    def apply(cb : uv__io_cb, pending_queue : uv__queue, watcher_queue : uv__queue, pevents : CUnsignedInt, events : CUnsignedInt, fd : CInt, rcount : CInt, wcount : CInt)(using Zone): Ptr[uv__io_s] = 
      val ____ptr = apply()
      (!____ptr).cb = cb
      (!____ptr).pending_queue = pending_queue
      (!____ptr).watcher_queue = watcher_queue
      (!____ptr).pevents = pevents
      (!____ptr).events = events
      (!____ptr).fd = fd
      (!____ptr).rcount = rcount
      (!____ptr).wcount = wcount
      ____ptr
    extension (struct: uv__io_s)
      def cb : uv__io_cb = struct._1.asInstanceOf[uv__io_cb]
      def cb_=(value: uv__io_cb): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def pending_queue : uv__queue = struct._2
      def pending_queue_=(value: uv__queue): Unit = !struct.at2 = value
      def watcher_queue : uv__queue = struct._3
      def watcher_queue_=(value: uv__queue): Unit = !struct.at3 = value
      def pevents : CUnsignedInt = struct._4
      def pevents_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def events : CUnsignedInt = struct._5
      def events_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def fd : CInt = struct._6
      def fd_=(value: CInt): Unit = !struct.at6 = value
      def rcount : CInt = struct._7
      def rcount_=(value: CInt): Unit = !struct.at7 = value
      def wcount : CInt = struct._8
      def wcount_=(value: CInt): Unit = !struct.at8 = value

  /**
  */
  opaque type uv__io_t = CStruct8[Ptr[Byte], uv__queue, uv__queue, CUnsignedInt, CUnsignedInt, CInt, CInt, CInt]
  object uv__io_t:
    given _tag: Tag[uv__io_t] = Tag.materializeCStruct8Tag[Ptr[Byte], uv__queue, uv__queue, CUnsignedInt, CUnsignedInt, CInt, CInt, CInt]
    def apply()(using Zone): Ptr[uv__io_t] = scala.scalanative.unsafe.alloc[uv__io_t](1)
    def apply(cb : uv__io_cb, pending_queue : uv__queue, watcher_queue : uv__queue, pevents : CUnsignedInt, events : CUnsignedInt, fd : CInt, rcount : CInt, wcount : CInt)(using Zone): Ptr[uv__io_t] = 
      val ____ptr = apply()
      (!____ptr).cb = cb
      (!____ptr).pending_queue = pending_queue
      (!____ptr).watcher_queue = watcher_queue
      (!____ptr).pevents = pevents
      (!____ptr).events = events
      (!____ptr).fd = fd
      (!____ptr).rcount = rcount
      (!____ptr).wcount = wcount
      ____ptr
    extension (struct: uv__io_t)
      def cb : uv__io_cb = struct._1.asInstanceOf[uv__io_cb]
      def cb_=(value: uv__io_cb): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def pending_queue : uv__queue = struct._2
      def pending_queue_=(value: uv__queue): Unit = !struct.at2 = value
      def watcher_queue : uv__queue = struct._3
      def watcher_queue_=(value: uv__queue): Unit = !struct.at3 = value
      def pevents : CUnsignedInt = struct._4
      def pevents_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def events : CUnsignedInt = struct._5
      def events_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def fd : CInt = struct._6
      def fd_=(value: CInt): Unit = !struct.at6 = value
      def rcount : CInt = struct._7
      def rcount_=(value: CInt): Unit = !struct.at7 = value
      def wcount : CInt = struct._8
      def wcount_=(value: CInt): Unit = !struct.at8 = value

  /**
  */
  opaque type uv__queue = CStruct2[Ptr[Byte], Ptr[Byte]]
  object uv__queue:
    given _tag: Tag[uv__queue] = Tag.materializeCStruct2Tag[Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[uv__queue] = scala.scalanative.unsafe.alloc[uv__queue](1)
    def apply(next : Ptr[uv__queue], prev : Ptr[uv__queue])(using Zone): Ptr[uv__queue] = 
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).prev = prev
      ____ptr
    extension (struct: uv__queue)
      def next : Ptr[uv__queue] = struct._1.asInstanceOf[Ptr[uv__queue]]
      def next_=(value: Ptr[uv__queue]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def prev : Ptr[uv__queue] = struct._2.asInstanceOf[Ptr[uv__queue]]
      def prev_=(value: Ptr[uv__queue]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]

  /**
  */
  opaque type uv__work = CStruct4[CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], CInt, Unit], Ptr[uv_loop_s], uv__queue]
  object uv__work:
    /**
    */
    opaque type Struct0 = CStruct0
    object Struct0:
      given _tag: Tag[Struct0] = Tag.materializeCStruct0Tag
    given _tag: Tag[uv__work] = Tag.materializeCStruct4Tag[CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], CInt, Unit], Ptr[uv_loop_s], uv__queue]
    def apply()(using Zone): Ptr[uv__work] = scala.scalanative.unsafe.alloc[uv__work](1)
    def apply(work : CFuncPtr1[Ptr[uv__work], Unit], done : CFuncPtr2[Ptr[uv__work], CInt, Unit], loop : Ptr[uv_loop_s], wq : uv__queue)(using Zone): Ptr[uv__work] = 
      val ____ptr = apply()
      (!____ptr).work = work
      (!____ptr).done = done
      (!____ptr).loop = loop
      (!____ptr).wq = wq
      ____ptr
    extension (struct: uv__work)
      def work : CFuncPtr1[Ptr[uv__work], Unit] = struct._1.asInstanceOf[CFuncPtr1[Ptr[uv__work], Unit]]
      def work_=(value: CFuncPtr1[Ptr[uv__work], Unit]): Unit = !struct.at1 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
      def done : CFuncPtr2[Ptr[uv__work], CInt, Unit] = struct._2.asInstanceOf[CFuncPtr2[Ptr[uv__work], CInt, Unit]]
      def done_=(value: CFuncPtr2[Ptr[uv__work], CInt, Unit]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], CInt, Unit]]
      def loop : Ptr[uv_loop_s] = struct._3
      def loop_=(value: Ptr[uv_loop_s]): Unit = !struct.at3 = value
      def wq : uv__queue = struct._4
      def wq_=(value: uv__queue): Unit = !struct.at4 = value

  /**
  */
  opaque type uv_async_s = CStruct11[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_async_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue, CInt]
  object uv_async_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_async_s] = Tag.materializeCStruct11Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_async_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue, CInt]
    def apply()(using Zone): Ptr[uv_async_s] = scala.scalanative.unsafe.alloc[uv_async_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_async_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, async_cb : uv_async_cb, queue : uv__queue, pending : CInt)(using Zone): Ptr[uv_async_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).async_cb = async_cb
      (!____ptr).queue = queue
      (!____ptr).pending = pending
      ____ptr
    extension (struct: uv_async_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_async_s.Union0 = struct._6
      def u_=(value: uv_async_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def async_cb : uv_async_cb = struct._9.asInstanceOf[uv_async_cb]
      def async_cb_=(value: uv_async_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._10
      def queue_=(value: uv__queue): Unit = !struct.at10 = value
      def pending : CInt = struct._11
      def pending_=(value: CInt): Unit = !struct.at11 = value

  /**
  */
  opaque type uv_async_t = CStruct11[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_async_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue, CInt]
  object uv_async_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_async_t] = Tag.materializeCStruct11Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_async_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue, CInt]
    def apply()(using Zone): Ptr[uv_async_t] = scala.scalanative.unsafe.alloc[uv_async_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_async_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, async_cb : uv_async_cb, queue : uv__queue, pending : CInt)(using Zone): Ptr[uv_async_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).async_cb = async_cb
      (!____ptr).queue = queue
      (!____ptr).pending = pending
      ____ptr
    extension (struct: uv_async_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_async_t.Union0 = struct._6
      def u_=(value: uv_async_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def async_cb : uv_async_cb = struct._9.asInstanceOf[uv_async_cb]
      def async_cb_=(value: uv_async_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._10
      def queue_=(value: uv__queue): Unit = !struct.at10 = value
      def pending : CInt = struct._11
      def pending_=(value: CInt): Unit = !struct.at11 = value

  /**
  */
  opaque type uv_barrier_t = CStruct1[Ptr[_uv_barrier]]
  object uv_barrier_t:
    given _tag: Tag[uv_barrier_t] = Tag.materializeCStruct1Tag[Ptr[_uv_barrier]]
    def apply()(using Zone): Ptr[uv_barrier_t] = scala.scalanative.unsafe.alloc[uv_barrier_t](1)
    def apply(b : Ptr[_uv_barrier])(using Zone): Ptr[uv_barrier_t] = 
      val ____ptr = apply()
      (!____ptr).b = b
      ____ptr
    extension (struct: uv_barrier_t)
      def b : Ptr[_uv_barrier] = struct._1
      def b_=(value: Ptr[_uv_barrier]): Unit = !struct.at1 = value

  /**
  */
  opaque type uv_buf_t = CStruct2[CString, size_t]
  object uv_buf_t:
    given _tag: Tag[uv_buf_t] = Tag.materializeCStruct2Tag[CString, size_t]
    def apply()(using Zone): Ptr[uv_buf_t] = scala.scalanative.unsafe.alloc[uv_buf_t](1)
    def apply(base : CString, len : size_t)(using Zone): Ptr[uv_buf_t] = 
      val ____ptr = apply()
      (!____ptr).base = base
      (!____ptr).len = len
      ____ptr
    extension (struct: uv_buf_t)
      def base : CString = struct._1
      def base_=(value: CString): Unit = !struct.at1 = value
      def len : size_t = struct._2
      def len_=(value: size_t): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_check_s = CStruct10[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_check_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
  object uv_check_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_check_s] = Tag.materializeCStruct10Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_check_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
    def apply()(using Zone): Ptr[uv_check_s] = scala.scalanative.unsafe.alloc[uv_check_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_check_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, check_cb : uv_check_cb, queue : uv__queue)(using Zone): Ptr[uv_check_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).check_cb = check_cb
      (!____ptr).queue = queue
      ____ptr
    extension (struct: uv_check_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_check_s.Union0 = struct._6
      def u_=(value: uv_check_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def check_cb : uv_check_cb = struct._9.asInstanceOf[uv_check_cb]
      def check_cb_=(value: uv_check_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._10
      def queue_=(value: uv__queue): Unit = !struct.at10 = value

  /**
  */
  opaque type uv_check_t = CStruct10[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_check_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
  object uv_check_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_check_t] = Tag.materializeCStruct10Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_check_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
    def apply()(using Zone): Ptr[uv_check_t] = scala.scalanative.unsafe.alloc[uv_check_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_check_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, check_cb : uv_check_cb, queue : uv__queue)(using Zone): Ptr[uv_check_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).check_cb = check_cb
      (!____ptr).queue = queue
      ____ptr
    extension (struct: uv_check_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_check_t.Union0 = struct._6
      def u_=(value: uv_check_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def check_cb : uv_check_cb = struct._9.asInstanceOf[uv_check_cb]
      def check_cb_=(value: uv_check_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._10
      def queue_=(value: uv__queue): Unit = !struct.at10 = value

  /**
  */
  opaque type uv_connect_s = CStruct6[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], uv__queue]
  object uv_connect_s:
    given _tag: Tag[uv_connect_s] = Tag.materializeCStruct6Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], uv__queue]
    def apply()(using Zone): Ptr[uv_connect_s] = scala.scalanative.unsafe.alloc[uv_connect_s](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], cb : uv_connect_cb, handle : Ptr[uv_stream_t], queue : uv__queue)(using Zone): Ptr[uv_connect_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).cb = cb
      (!____ptr).handle = handle
      (!____ptr).queue = queue
      ____ptr
    extension (struct: uv_connect_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def cb : uv_connect_cb = struct._4.asInstanceOf[uv_connect_cb]
      def cb_=(value: uv_connect_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle : Ptr[uv_stream_t] = struct._5.asInstanceOf[Ptr[uv_stream_t]]
      def handle_=(value: Ptr[uv_stream_t]): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._6
      def queue_=(value: uv__queue): Unit = !struct.at6 = value

  /**
  */
  opaque type uv_connect_t = CStruct6[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], uv__queue]
  object uv_connect_t:
    given _tag: Tag[uv_connect_t] = Tag.materializeCStruct6Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], uv__queue]
    def apply()(using Zone): Ptr[uv_connect_t] = scala.scalanative.unsafe.alloc[uv_connect_t](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], cb : uv_connect_cb, handle : Ptr[uv_stream_t], queue : uv__queue)(using Zone): Ptr[uv_connect_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).cb = cb
      (!____ptr).handle = handle
      (!____ptr).queue = queue
      ____ptr
    extension (struct: uv_connect_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def cb : uv_connect_cb = struct._4.asInstanceOf[uv_connect_cb]
      def cb_=(value: uv_connect_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle : Ptr[uv_stream_t] = struct._5.asInstanceOf[Ptr[uv_stream_t]]
      def handle_=(value: Ptr[uv_stream_t]): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._6
      def queue_=(value: uv__queue): Unit = !struct.at6 = value

  /**
  */
  opaque type uv_cpu_info_s = CStruct3[CString, CInt, uv_cpu_times_s]
  object uv_cpu_info_s:
    given _tag: Tag[uv_cpu_info_s] = Tag.materializeCStruct3Tag[CString, CInt, uv_cpu_times_s]
    def apply()(using Zone): Ptr[uv_cpu_info_s] = scala.scalanative.unsafe.alloc[uv_cpu_info_s](1)
    def apply(model : CString, speed : CInt, cpu_times : uv_cpu_times_s)(using Zone): Ptr[uv_cpu_info_s] = 
      val ____ptr = apply()
      (!____ptr).model = model
      (!____ptr).speed = speed
      (!____ptr).cpu_times = cpu_times
      ____ptr
    extension (struct: uv_cpu_info_s)
      def model : CString = struct._1
      def model_=(value: CString): Unit = !struct.at1 = value
      def speed : CInt = struct._2
      def speed_=(value: CInt): Unit = !struct.at2 = value
      def cpu_times : uv_cpu_times_s = struct._3
      def cpu_times_=(value: uv_cpu_times_s): Unit = !struct.at3 = value

  /**
  */
  opaque type uv_cpu_info_t = CStruct3[CString, CInt, uv_cpu_times_s]
  object uv_cpu_info_t:
    given _tag: Tag[uv_cpu_info_t] = Tag.materializeCStruct3Tag[CString, CInt, uv_cpu_times_s]
    def apply()(using Zone): Ptr[uv_cpu_info_t] = scala.scalanative.unsafe.alloc[uv_cpu_info_t](1)
    def apply(model : CString, speed : CInt, cpu_times : uv_cpu_times_s)(using Zone): Ptr[uv_cpu_info_t] = 
      val ____ptr = apply()
      (!____ptr).model = model
      (!____ptr).speed = speed
      (!____ptr).cpu_times = cpu_times
      ____ptr
    extension (struct: uv_cpu_info_t)
      def model : CString = struct._1
      def model_=(value: CString): Unit = !struct.at1 = value
      def speed : CInt = struct._2
      def speed_=(value: CInt): Unit = !struct.at2 = value
      def cpu_times : uv_cpu_times_s = struct._3
      def cpu_times_=(value: uv_cpu_times_s): Unit = !struct.at3 = value

  /**
  */
  opaque type uv_cpu_times_s = CStruct5[uint64_t, uint64_t, uint64_t, uint64_t, uint64_t]
  object uv_cpu_times_s:
    given _tag: Tag[uv_cpu_times_s] = Tag.materializeCStruct5Tag[uint64_t, uint64_t, uint64_t, uint64_t, uint64_t]
    def apply()(using Zone): Ptr[uv_cpu_times_s] = scala.scalanative.unsafe.alloc[uv_cpu_times_s](1)
    def apply(user : uint64_t, nice : uint64_t, sys : uint64_t, idle : uint64_t, irq : uint64_t)(using Zone): Ptr[uv_cpu_times_s] = 
      val ____ptr = apply()
      (!____ptr).user = user
      (!____ptr).nice = nice
      (!____ptr).sys = sys
      (!____ptr).idle = idle
      (!____ptr).irq = irq
      ____ptr
    extension (struct: uv_cpu_times_s)
      def user : uint64_t = struct._1
      def user_=(value: uint64_t): Unit = !struct.at1 = value
      def nice : uint64_t = struct._2
      def nice_=(value: uint64_t): Unit = !struct.at2 = value
      def sys : uint64_t = struct._3
      def sys_=(value: uint64_t): Unit = !struct.at3 = value
      def idle : uint64_t = struct._4
      def idle_=(value: uint64_t): Unit = !struct.at4 = value
      def irq : uint64_t = struct._5
      def irq_=(value: uint64_t): Unit = !struct.at5 = value

  /**
  */
  opaque type uv_dir_s = CStruct4[Ptr[uv_dirent_t], size_t, CArray[Ptr[Byte], Nat._4], Ptr[DIR]]
  object uv_dir_s:
    given _tag: Tag[uv_dir_s] = Tag.materializeCStruct4Tag[Ptr[uv_dirent_t], size_t, CArray[Ptr[Byte], Nat._4], Ptr[DIR]]
    def apply()(using Zone): Ptr[uv_dir_s] = scala.scalanative.unsafe.alloc[uv_dir_s](1)
    def apply(dirents : Ptr[uv_dirent_t], nentries : size_t, reserved : CArray[Ptr[Byte], Nat._4], dir : Ptr[DIR])(using Zone): Ptr[uv_dir_s] = 
      val ____ptr = apply()
      (!____ptr).dirents = dirents
      (!____ptr).nentries = nentries
      (!____ptr).reserved = reserved
      (!____ptr).dir = dir
      ____ptr
    extension (struct: uv_dir_s)
      def dirents : Ptr[uv_dirent_t] = struct._1
      def dirents_=(value: Ptr[uv_dirent_t]): Unit = !struct.at1 = value
      def nentries : size_t = struct._2
      def nentries_=(value: size_t): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._4] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at3 = value
      def dir : Ptr[DIR] = struct._4
      def dir_=(value: Ptr[DIR]): Unit = !struct.at4 = value

  /**
  */
  opaque type uv_dir_t = CStruct4[Ptr[uv_dirent_t], size_t, CArray[Ptr[Byte], Nat._4], Ptr[DIR]]
  object uv_dir_t:
    given _tag: Tag[uv_dir_t] = Tag.materializeCStruct4Tag[Ptr[uv_dirent_t], size_t, CArray[Ptr[Byte], Nat._4], Ptr[DIR]]
    def apply()(using Zone): Ptr[uv_dir_t] = scala.scalanative.unsafe.alloc[uv_dir_t](1)
    def apply(dirents : Ptr[uv_dirent_t], nentries : size_t, reserved : CArray[Ptr[Byte], Nat._4], dir : Ptr[DIR])(using Zone): Ptr[uv_dir_t] = 
      val ____ptr = apply()
      (!____ptr).dirents = dirents
      (!____ptr).nentries = nentries
      (!____ptr).reserved = reserved
      (!____ptr).dir = dir
      ____ptr
    extension (struct: uv_dir_t)
      def dirents : Ptr[uv_dirent_t] = struct._1
      def dirents_=(value: Ptr[uv_dirent_t]): Unit = !struct.at1 = value
      def nentries : size_t = struct._2
      def nentries_=(value: size_t): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._4] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at3 = value
      def dir : Ptr[DIR] = struct._4
      def dir_=(value: Ptr[DIR]): Unit = !struct.at4 = value

  /**
  */
  opaque type uv_dirent_s = CStruct2[CString, uv_dirent_type_t]
  object uv_dirent_s:
    given _tag: Tag[uv_dirent_s] = Tag.materializeCStruct2Tag[CString, uv_dirent_type_t]
    def apply()(using Zone): Ptr[uv_dirent_s] = scala.scalanative.unsafe.alloc[uv_dirent_s](1)
    def apply(name : CString, `type` : uv_dirent_type_t)(using Zone): Ptr[uv_dirent_s] = 
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).`type` = `type`
      ____ptr
    extension (struct: uv_dirent_s)
      def name : CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def `type` : uv_dirent_type_t = struct._2
      def type_=(value: uv_dirent_type_t): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_dirent_t = CStruct2[CString, uv_dirent_type_t]
  object uv_dirent_t:
    given _tag: Tag[uv_dirent_t] = Tag.materializeCStruct2Tag[CString, uv_dirent_type_t]
    def apply()(using Zone): Ptr[uv_dirent_t] = scala.scalanative.unsafe.alloc[uv_dirent_t](1)
    def apply(name : CString, `type` : uv_dirent_type_t)(using Zone): Ptr[uv_dirent_t] = 
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).`type` = `type`
      ____ptr
    extension (struct: uv_dirent_t)
      def name : CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def `type` : uv_dirent_type_t = struct._2
      def type_=(value: uv_dirent_type_t): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_env_item_s = CStruct2[CString, CString]
  object uv_env_item_s:
    given _tag: Tag[uv_env_item_s] = Tag.materializeCStruct2Tag[CString, CString]
    def apply()(using Zone): Ptr[uv_env_item_s] = scala.scalanative.unsafe.alloc[uv_env_item_s](1)
    def apply(name : CString, value : CString)(using Zone): Ptr[uv_env_item_s] = 
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).value = value
      ____ptr
    extension (struct: uv_env_item_s)
      def name : CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def value : CString = struct._2
      def value_=(value: CString): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_env_item_t = CStruct2[CString, CString]
  object uv_env_item_t:
    given _tag: Tag[uv_env_item_t] = Tag.materializeCStruct2Tag[CString, CString]
    def apply()(using Zone): Ptr[uv_env_item_t] = scala.scalanative.unsafe.alloc[uv_env_item_t](1)
    def apply(name : CString, value : CString)(using Zone): Ptr[uv_env_item_t] = 
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).value = value
      ____ptr
    extension (struct: uv_env_item_t)
      def name : CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def value : CString = struct._2
      def value_=(value: CString): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_fs_event_s = CStruct19[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_fs_event_s.Union0, Ptr[Byte], CUnsignedInt, CString, Ptr[Byte], uv__io_t, CString, CInt, CInt, Ptr[Byte], uv__queue, uv__queue, CInt, uv_mutex_t]
  object uv_fs_event_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_fs_event_s] = Tag.materializeCStruct19Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_fs_event_s.Union0, Ptr[Byte], CUnsignedInt, CString, Ptr[Byte], uv__io_t, CString, CInt, CInt, Ptr[Byte], uv__queue, uv__queue, CInt, uv_mutex_t]
    def apply()(using Zone): Ptr[uv_fs_event_s] = scala.scalanative.unsafe.alloc[uv_fs_event_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_fs_event_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, path : CString, cb : uv_fs_event_cb, event_watcher : uv__io_t, realpath : CString, realpath_len : CInt, cf_flags : CInt, cf_cb : Ptr[uv_async_t], cf_events : uv__queue, cf_member : uv__queue, cf_error : CInt, cf_mutex : uv_mutex_t)(using Zone): Ptr[uv_fs_event_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).path = path
      (!____ptr).cb = cb
      (!____ptr).event_watcher = event_watcher
      (!____ptr).realpath = realpath
      (!____ptr).realpath_len = realpath_len
      (!____ptr).cf_flags = cf_flags
      (!____ptr).cf_cb = cf_cb
      (!____ptr).cf_events = cf_events
      (!____ptr).cf_member = cf_member
      (!____ptr).cf_error = cf_error
      (!____ptr).cf_mutex = cf_mutex
      ____ptr
    extension (struct: uv_fs_event_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_fs_event_s.Union0 = struct._6
      def u_=(value: uv_fs_event_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def path : CString = struct._9
      def path_=(value: CString): Unit = !struct.at9 = value
      def cb : uv_fs_event_cb = struct._10.asInstanceOf[uv_fs_event_cb]
      def cb_=(value: uv_fs_event_cb): Unit = !struct.at10 = value.asInstanceOf[Ptr[Byte]]
      def event_watcher : uv__io_t = struct._11
      def event_watcher_=(value: uv__io_t): Unit = !struct.at11 = value
      def realpath : CString = struct._12
      def realpath_=(value: CString): Unit = !struct.at12 = value
      def realpath_len : CInt = struct._13
      def realpath_len_=(value: CInt): Unit = !struct.at13 = value
      def cf_flags : CInt = struct._14
      def cf_flags_=(value: CInt): Unit = !struct.at14 = value
      def cf_cb : Ptr[uv_async_t] = struct._15.asInstanceOf[Ptr[uv_async_t]]
      def cf_cb_=(value: Ptr[uv_async_t]): Unit = !struct.at15 = value.asInstanceOf[Ptr[Byte]]
      def cf_events : uv__queue = struct._16
      def cf_events_=(value: uv__queue): Unit = !struct.at16 = value
      def cf_member : uv__queue = struct._17
      def cf_member_=(value: uv__queue): Unit = !struct.at17 = value
      def cf_error : CInt = struct._18
      def cf_error_=(value: CInt): Unit = !struct.at18 = value
      def cf_mutex : uv_mutex_t = struct._19
      def cf_mutex_=(value: uv_mutex_t): Unit = !struct.at19 = value

  /**
  */
  opaque type uv_fs_event_t = CStruct19[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_fs_event_t.Union0, Ptr[Byte], CUnsignedInt, CString, Ptr[Byte], uv__io_t, CString, CInt, CInt, Ptr[Byte], uv__queue, uv__queue, CInt, uv_mutex_t]
  object uv_fs_event_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_fs_event_t] = Tag.materializeCStruct19Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_fs_event_t.Union0, Ptr[Byte], CUnsignedInt, CString, Ptr[Byte], uv__io_t, CString, CInt, CInt, Ptr[Byte], uv__queue, uv__queue, CInt, uv_mutex_t]
    def apply()(using Zone): Ptr[uv_fs_event_t] = scala.scalanative.unsafe.alloc[uv_fs_event_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_fs_event_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, path : CString, cb : uv_fs_event_cb, event_watcher : uv__io_t, realpath : CString, realpath_len : CInt, cf_flags : CInt, cf_cb : Ptr[uv_async_t], cf_events : uv__queue, cf_member : uv__queue, cf_error : CInt, cf_mutex : uv_mutex_t)(using Zone): Ptr[uv_fs_event_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).path = path
      (!____ptr).cb = cb
      (!____ptr).event_watcher = event_watcher
      (!____ptr).realpath = realpath
      (!____ptr).realpath_len = realpath_len
      (!____ptr).cf_flags = cf_flags
      (!____ptr).cf_cb = cf_cb
      (!____ptr).cf_events = cf_events
      (!____ptr).cf_member = cf_member
      (!____ptr).cf_error = cf_error
      (!____ptr).cf_mutex = cf_mutex
      ____ptr
    extension (struct: uv_fs_event_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_fs_event_t.Union0 = struct._6
      def u_=(value: uv_fs_event_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def path : CString = struct._9
      def path_=(value: CString): Unit = !struct.at9 = value
      def cb : uv_fs_event_cb = struct._10.asInstanceOf[uv_fs_event_cb]
      def cb_=(value: uv_fs_event_cb): Unit = !struct.at10 = value.asInstanceOf[Ptr[Byte]]
      def event_watcher : uv__io_t = struct._11
      def event_watcher_=(value: uv__io_t): Unit = !struct.at11 = value
      def realpath : CString = struct._12
      def realpath_=(value: CString): Unit = !struct.at12 = value
      def realpath_len : CInt = struct._13
      def realpath_len_=(value: CInt): Unit = !struct.at13 = value
      def cf_flags : CInt = struct._14
      def cf_flags_=(value: CInt): Unit = !struct.at14 = value
      def cf_cb : Ptr[uv_async_t] = struct._15.asInstanceOf[Ptr[uv_async_t]]
      def cf_cb_=(value: Ptr[uv_async_t]): Unit = !struct.at15 = value.asInstanceOf[Ptr[Byte]]
      def cf_events : uv__queue = struct._16
      def cf_events_=(value: uv__queue): Unit = !struct.at16 = value
      def cf_member : uv__queue = struct._17
      def cf_member_=(value: uv__queue): Unit = !struct.at17 = value
      def cf_error : CInt = struct._18
      def cf_error_=(value: CInt): Unit = !struct.at18 = value
      def cf_mutex : uv_mutex_t = struct._19
      def cf_mutex_=(value: uv_mutex_t): Unit = !struct.at19 = value

  /**
  */
  opaque type uv_fs_poll_s = CStruct9[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_fs_poll_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte]]
  object uv_fs_poll_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_fs_poll_s] = Tag.materializeCStruct9Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_fs_poll_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte]]
    def apply()(using Zone): Ptr[uv_fs_poll_s] = scala.scalanative.unsafe.alloc[uv_fs_poll_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_fs_poll_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, poll_ctx : Ptr[Byte])(using Zone): Ptr[uv_fs_poll_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).poll_ctx = poll_ctx
      ____ptr
    extension (struct: uv_fs_poll_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_fs_poll_s.Union0 = struct._6
      def u_=(value: uv_fs_poll_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def poll_ctx : Ptr[Byte] = struct._9
      def poll_ctx_=(value: Ptr[Byte]): Unit = !struct.at9 = value

  /**
  */
  opaque type uv_fs_poll_t = CStruct9[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_fs_poll_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte]]
  object uv_fs_poll_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_fs_poll_t] = Tag.materializeCStruct9Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_fs_poll_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte]]
    def apply()(using Zone): Ptr[uv_fs_poll_t] = scala.scalanative.unsafe.alloc[uv_fs_poll_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_fs_poll_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, poll_ctx : Ptr[Byte])(using Zone): Ptr[uv_fs_poll_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).poll_ctx = poll_ctx
      ____ptr
    extension (struct: uv_fs_poll_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_fs_poll_t.Union0 = struct._6
      def u_=(value: uv_fs_poll_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def poll_ctx : Ptr[Byte] = struct._9
      def poll_ctx_=(value: Ptr[Byte]): Unit = !struct.at9 = value

  /**
  */
  opaque type uv_fs_s = CArray[CChar, Nat.Digit3[Nat._4, Nat._4, Nat._0]]
  object uv_fs_s:
    given _tag: Tag[uv_fs_s] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._4, Nat._0]](Tag.Byte, Tag.Digit3[Nat._4, Nat._4, Nat._0](Tag.Nat4, Tag.Nat4, Tag.Nat0))
    def apply()(using Zone): Ptr[uv_fs_s] = scala.scalanative.unsafe.alloc[uv_fs_s](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], fs_type : uv_fs_type, loop : Ptr[uv_loop_t], cb : uv_fs_cb, result : ssize_t, ptr : Ptr[Byte], path : CString, statbuf : uv_stat_t, new_path : CString, file : uv_file, flags : CInt, mode : mode_t, nbufs : CUnsignedInt, bufs : Ptr[uv_buf_t], off : off_t, uid : uv_uid_t, gid : uv_gid_t, atime : Double, mtime : Double, work_req : uv__work, bufsml : CArray[uv_buf_t, Nat._4])(using Zone): Ptr[uv_fs_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).fs_type = fs_type
      (!____ptr).loop = loop
      (!____ptr).cb = cb
      (!____ptr).result = result
      (!____ptr).ptr = ptr
      (!____ptr).path = path
      (!____ptr).statbuf = statbuf
      (!____ptr).new_path = new_path
      (!____ptr).file = file
      (!____ptr).flags = flags
      (!____ptr).mode = mode
      (!____ptr).nbufs = nbufs
      (!____ptr).bufs = bufs
      (!____ptr).off = off
      (!____ptr).uid = uid
      (!____ptr).gid = gid
      (!____ptr).atime = atime
      (!____ptr).mtime = mtime
      (!____ptr).work_req = work_req
      (!____ptr).bufsml = bufsml
      ____ptr
    extension (struct: uv_fs_s)
      def data: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def data_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def `type`: uv_req_type = !struct.at(8).asInstanceOf[Ptr[uv_req_type]]
      def type_=(value: uv_req_type): Unit = !struct.at(8).asInstanceOf[Ptr[uv_req_type]] = value
      def reserved: CArray[Ptr[Byte], Nat._6] = !struct.at(16).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._6]]]
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at(16).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._6]]] = value
      def fs_type: uv_fs_type = !struct.at(64).asInstanceOf[Ptr[uv_fs_type]]
      def fs_type_=(value: uv_fs_type): Unit = !struct.at(64).asInstanceOf[Ptr[uv_fs_type]] = value
      def loop: Ptr[uv_loop_t] = !struct.at(72).asInstanceOf[Ptr[Ptr[uv_loop_t]]]
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at(72).asInstanceOf[Ptr[Ptr[uv_loop_t]]] = value
      def cb: uv_fs_cb = !struct.at(80).asInstanceOf[Ptr[uv_fs_cb]]
      def cb_=(value: uv_fs_cb): Unit = !struct.at(80).asInstanceOf[Ptr[uv_fs_cb]] = value
      def result: ssize_t = !struct.at(88).asInstanceOf[Ptr[ssize_t]]
      def result_=(value: ssize_t): Unit = !struct.at(88).asInstanceOf[Ptr[ssize_t]] = value
      def ptr: Ptr[Byte] = !struct.at(96).asInstanceOf[Ptr[Ptr[Byte]]]
      def ptr_=(value: Ptr[Byte]): Unit = !struct.at(96).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def path: CString = !struct.at(104).asInstanceOf[Ptr[CString]]
      def path_=(value: CString): Unit = !struct.at(104).asInstanceOf[Ptr[CString]] = value
      def statbuf: uv_stat_t = !struct.at(112).asInstanceOf[Ptr[uv_stat_t]]
      def statbuf_=(value: uv_stat_t): Unit = !struct.at(112).asInstanceOf[Ptr[uv_stat_t]] = value
      def new_path: CString = !struct.at(272).asInstanceOf[Ptr[CString]]
      def new_path_=(value: CString): Unit = !struct.at(272).asInstanceOf[Ptr[CString]] = value
      def file: uv_file = !struct.at(280).asInstanceOf[Ptr[uv_file]]
      def file_=(value: uv_file): Unit = !struct.at(280).asInstanceOf[Ptr[uv_file]] = value
      def flags: CInt = !struct.at(284).asInstanceOf[Ptr[CInt]]
      def flags_=(value: CInt): Unit = !struct.at(284).asInstanceOf[Ptr[CInt]] = value
      def mode: mode_t = !struct.at(288).asInstanceOf[Ptr[mode_t]]
      def mode_=(value: mode_t): Unit = !struct.at(288).asInstanceOf[Ptr[mode_t]] = value
      def nbufs: CUnsignedInt = !struct.at(292).asInstanceOf[Ptr[CUnsignedInt]]
      def nbufs_=(value: CUnsignedInt): Unit = !struct.at(292).asInstanceOf[Ptr[CUnsignedInt]] = value
      def bufs: Ptr[uv_buf_t] = !struct.at(296).asInstanceOf[Ptr[Ptr[uv_buf_t]]]
      def bufs_=(value: Ptr[uv_buf_t]): Unit = !struct.at(296).asInstanceOf[Ptr[Ptr[uv_buf_t]]] = value
      def off: off_t = !struct.at(304).asInstanceOf[Ptr[off_t]]
      def off_=(value: off_t): Unit = !struct.at(304).asInstanceOf[Ptr[off_t]] = value
      def uid: uv_uid_t = !struct.at(312).asInstanceOf[Ptr[uv_uid_t]]
      def uid_=(value: uv_uid_t): Unit = !struct.at(312).asInstanceOf[Ptr[uv_uid_t]] = value
      def gid: uv_gid_t = !struct.at(316).asInstanceOf[Ptr[uv_gid_t]]
      def gid_=(value: uv_gid_t): Unit = !struct.at(316).asInstanceOf[Ptr[uv_gid_t]] = value
      def atime: Double = !struct.at(320).asInstanceOf[Ptr[Double]]
      def atime_=(value: Double): Unit = !struct.at(320).asInstanceOf[Ptr[Double]] = value
      def mtime: Double = !struct.at(328).asInstanceOf[Ptr[Double]]
      def mtime_=(value: Double): Unit = !struct.at(328).asInstanceOf[Ptr[Double]] = value
      def work_req: uv__work = !struct.at(336).asInstanceOf[Ptr[uv__work]]
      def work_req_=(value: uv__work): Unit = !struct.at(336).asInstanceOf[Ptr[uv__work]] = value
      def bufsml: CArray[uv_buf_t, Nat._4] = !struct.at(376).asInstanceOf[Ptr[CArray[uv_buf_t, Nat._4]]]
      def bufsml_=(value: CArray[uv_buf_t, Nat._4]): Unit = !struct.at(376).asInstanceOf[Ptr[CArray[uv_buf_t, Nat._4]]] = value

  /**
  */
  opaque type uv_fs_t = CArray[CChar, Nat.Digit3[Nat._4, Nat._4, Nat._0]]
  object uv_fs_t:
    given _tag: Tag[uv_fs_t] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._4, Nat._0]](Tag.Byte, Tag.Digit3[Nat._4, Nat._4, Nat._0](Tag.Nat4, Tag.Nat4, Tag.Nat0))
    def apply()(using Zone): Ptr[uv_fs_t] = scala.scalanative.unsafe.alloc[uv_fs_t](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], fs_type : uv_fs_type, loop : Ptr[uv_loop_t], cb : uv_fs_cb, result : ssize_t, ptr : Ptr[Byte], path : CString, statbuf : uv_stat_t, new_path : CString, file : uv_file, flags : CInt, mode : mode_t, nbufs : CUnsignedInt, bufs : Ptr[uv_buf_t], off : off_t, uid : uv_uid_t, gid : uv_gid_t, atime : Double, mtime : Double, work_req : uv__work, bufsml : CArray[uv_buf_t, Nat._4])(using Zone): Ptr[uv_fs_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).fs_type = fs_type
      (!____ptr).loop = loop
      (!____ptr).cb = cb
      (!____ptr).result = result
      (!____ptr).ptr = ptr
      (!____ptr).path = path
      (!____ptr).statbuf = statbuf
      (!____ptr).new_path = new_path
      (!____ptr).file = file
      (!____ptr).flags = flags
      (!____ptr).mode = mode
      (!____ptr).nbufs = nbufs
      (!____ptr).bufs = bufs
      (!____ptr).off = off
      (!____ptr).uid = uid
      (!____ptr).gid = gid
      (!____ptr).atime = atime
      (!____ptr).mtime = mtime
      (!____ptr).work_req = work_req
      (!____ptr).bufsml = bufsml
      ____ptr
    extension (struct: uv_fs_t)
      def data: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def data_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def `type`: uv_req_type = !struct.at(8).asInstanceOf[Ptr[uv_req_type]]
      def type_=(value: uv_req_type): Unit = !struct.at(8).asInstanceOf[Ptr[uv_req_type]] = value
      def reserved: CArray[Ptr[Byte], Nat._6] = !struct.at(16).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._6]]]
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at(16).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._6]]] = value
      def fs_type: uv_fs_type = !struct.at(64).asInstanceOf[Ptr[uv_fs_type]]
      def fs_type_=(value: uv_fs_type): Unit = !struct.at(64).asInstanceOf[Ptr[uv_fs_type]] = value
      def loop: Ptr[uv_loop_t] = !struct.at(72).asInstanceOf[Ptr[Ptr[uv_loop_t]]]
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at(72).asInstanceOf[Ptr[Ptr[uv_loop_t]]] = value
      def cb: uv_fs_cb = !struct.at(80).asInstanceOf[Ptr[uv_fs_cb]]
      def cb_=(value: uv_fs_cb): Unit = !struct.at(80).asInstanceOf[Ptr[uv_fs_cb]] = value
      def result: ssize_t = !struct.at(88).asInstanceOf[Ptr[ssize_t]]
      def result_=(value: ssize_t): Unit = !struct.at(88).asInstanceOf[Ptr[ssize_t]] = value
      def ptr: Ptr[Byte] = !struct.at(96).asInstanceOf[Ptr[Ptr[Byte]]]
      def ptr_=(value: Ptr[Byte]): Unit = !struct.at(96).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def path: CString = !struct.at(104).asInstanceOf[Ptr[CString]]
      def path_=(value: CString): Unit = !struct.at(104).asInstanceOf[Ptr[CString]] = value
      def statbuf: uv_stat_t = !struct.at(112).asInstanceOf[Ptr[uv_stat_t]]
      def statbuf_=(value: uv_stat_t): Unit = !struct.at(112).asInstanceOf[Ptr[uv_stat_t]] = value
      def new_path: CString = !struct.at(272).asInstanceOf[Ptr[CString]]
      def new_path_=(value: CString): Unit = !struct.at(272).asInstanceOf[Ptr[CString]] = value
      def file: uv_file = !struct.at(280).asInstanceOf[Ptr[uv_file]]
      def file_=(value: uv_file): Unit = !struct.at(280).asInstanceOf[Ptr[uv_file]] = value
      def flags: CInt = !struct.at(284).asInstanceOf[Ptr[CInt]]
      def flags_=(value: CInt): Unit = !struct.at(284).asInstanceOf[Ptr[CInt]] = value
      def mode: mode_t = !struct.at(288).asInstanceOf[Ptr[mode_t]]
      def mode_=(value: mode_t): Unit = !struct.at(288).asInstanceOf[Ptr[mode_t]] = value
      def nbufs: CUnsignedInt = !struct.at(292).asInstanceOf[Ptr[CUnsignedInt]]
      def nbufs_=(value: CUnsignedInt): Unit = !struct.at(292).asInstanceOf[Ptr[CUnsignedInt]] = value
      def bufs: Ptr[uv_buf_t] = !struct.at(296).asInstanceOf[Ptr[Ptr[uv_buf_t]]]
      def bufs_=(value: Ptr[uv_buf_t]): Unit = !struct.at(296).asInstanceOf[Ptr[Ptr[uv_buf_t]]] = value
      def off: off_t = !struct.at(304).asInstanceOf[Ptr[off_t]]
      def off_=(value: off_t): Unit = !struct.at(304).asInstanceOf[Ptr[off_t]] = value
      def uid: uv_uid_t = !struct.at(312).asInstanceOf[Ptr[uv_uid_t]]
      def uid_=(value: uv_uid_t): Unit = !struct.at(312).asInstanceOf[Ptr[uv_uid_t]] = value
      def gid: uv_gid_t = !struct.at(316).asInstanceOf[Ptr[uv_gid_t]]
      def gid_=(value: uv_gid_t): Unit = !struct.at(316).asInstanceOf[Ptr[uv_gid_t]] = value
      def atime: Double = !struct.at(320).asInstanceOf[Ptr[Double]]
      def atime_=(value: Double): Unit = !struct.at(320).asInstanceOf[Ptr[Double]] = value
      def mtime: Double = !struct.at(328).asInstanceOf[Ptr[Double]]
      def mtime_=(value: Double): Unit = !struct.at(328).asInstanceOf[Ptr[Double]] = value
      def work_req: uv__work = !struct.at(336).asInstanceOf[Ptr[uv__work]]
      def work_req_=(value: uv__work): Unit = !struct.at(336).asInstanceOf[Ptr[uv__work]] = value
      def bufsml: CArray[uv_buf_t, Nat._4] = !struct.at(376).asInstanceOf[Ptr[CArray[uv_buf_t, Nat._4]]]
      def bufsml_=(value: CArray[uv_buf_t, Nat._4]): Unit = !struct.at(376).asInstanceOf[Ptr[CArray[uv_buf_t, Nat._4]]] = value

  /**
  */
  opaque type uv_getaddrinfo_s = CStruct11[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], uv__work, Ptr[Byte], Ptr[addrinfo], CString, CString, Ptr[addrinfo], CInt]
  object uv_getaddrinfo_s:
    given _tag: Tag[uv_getaddrinfo_s] = Tag.materializeCStruct11Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], uv__work, Ptr[Byte], Ptr[addrinfo], CString, CString, Ptr[addrinfo], CInt]
    def apply()(using Zone): Ptr[uv_getaddrinfo_s] = scala.scalanative.unsafe.alloc[uv_getaddrinfo_s](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], loop : Ptr[uv_loop_t], work_req : uv__work, cb : uv_getaddrinfo_cb, hints : Ptr[addrinfo], hostname : CString, service : CString, addrinfo : Ptr[addrinfo], retcode : CInt)(using Zone): Ptr[uv_getaddrinfo_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).loop = loop
      (!____ptr).work_req = work_req
      (!____ptr).cb = cb
      (!____ptr).hints = hints
      (!____ptr).hostname = hostname
      (!____ptr).service = service
      (!____ptr).addrinfo = addrinfo
      (!____ptr).retcode = retcode
      ____ptr
    extension (struct: uv_getaddrinfo_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def loop : Ptr[uv_loop_t] = struct._4
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at4 = value
      def work_req : uv__work = struct._5
      def work_req_=(value: uv__work): Unit = !struct.at5 = value
      def cb : uv_getaddrinfo_cb = struct._6.asInstanceOf[uv_getaddrinfo_cb]
      def cb_=(value: uv_getaddrinfo_cb): Unit = !struct.at6 = value.asInstanceOf[Ptr[Byte]]
      def hints : Ptr[addrinfo] = struct._7
      def hints_=(value: Ptr[addrinfo]): Unit = !struct.at7 = value
      def hostname : CString = struct._8
      def hostname_=(value: CString): Unit = !struct.at8 = value
      def service : CString = struct._9
      def service_=(value: CString): Unit = !struct.at9 = value
      def addrinfo : Ptr[addrinfo] = struct._10
      def addrinfo_=(value: Ptr[addrinfo]): Unit = !struct.at10 = value
      def retcode : CInt = struct._11
      def retcode_=(value: CInt): Unit = !struct.at11 = value

  /**
  */
  opaque type uv_getaddrinfo_t = CStruct11[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], uv__work, Ptr[Byte], Ptr[addrinfo], CString, CString, Ptr[addrinfo], CInt]
  object uv_getaddrinfo_t:
    given _tag: Tag[uv_getaddrinfo_t] = Tag.materializeCStruct11Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], uv__work, Ptr[Byte], Ptr[addrinfo], CString, CString, Ptr[addrinfo], CInt]
    def apply()(using Zone): Ptr[uv_getaddrinfo_t] = scala.scalanative.unsafe.alloc[uv_getaddrinfo_t](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], loop : Ptr[uv_loop_t], work_req : uv__work, cb : uv_getaddrinfo_cb, hints : Ptr[addrinfo], hostname : CString, service : CString, addrinfo : Ptr[addrinfo], retcode : CInt)(using Zone): Ptr[uv_getaddrinfo_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).loop = loop
      (!____ptr).work_req = work_req
      (!____ptr).cb = cb
      (!____ptr).hints = hints
      (!____ptr).hostname = hostname
      (!____ptr).service = service
      (!____ptr).addrinfo = addrinfo
      (!____ptr).retcode = retcode
      ____ptr
    extension (struct: uv_getaddrinfo_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def loop : Ptr[uv_loop_t] = struct._4
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at4 = value
      def work_req : uv__work = struct._5
      def work_req_=(value: uv__work): Unit = !struct.at5 = value
      def cb : uv_getaddrinfo_cb = struct._6.asInstanceOf[uv_getaddrinfo_cb]
      def cb_=(value: uv_getaddrinfo_cb): Unit = !struct.at6 = value.asInstanceOf[Ptr[Byte]]
      def hints : Ptr[addrinfo] = struct._7
      def hints_=(value: Ptr[addrinfo]): Unit = !struct.at7 = value
      def hostname : CString = struct._8
      def hostname_=(value: CString): Unit = !struct.at8 = value
      def service : CString = struct._9
      def service_=(value: CString): Unit = !struct.at9 = value
      def addrinfo : Ptr[addrinfo] = struct._10
      def addrinfo_=(value: Ptr[addrinfo]): Unit = !struct.at10 = value
      def retcode : CInt = struct._11
      def retcode_=(value: CInt): Unit = !struct.at11 = value

  /**
  */
  opaque type uv_getnameinfo_s = CStruct11[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], uv__work, Ptr[Byte], sockaddr_storage, CInt, CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._5]], CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], CInt]
  object uv_getnameinfo_s:
    given _tag: Tag[uv_getnameinfo_s] = Tag.materializeCStruct11Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], uv__work, Ptr[Byte], sockaddr_storage, CInt, CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._5]], CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], CInt]
    def apply()(using Zone): Ptr[uv_getnameinfo_s] = scala.scalanative.unsafe.alloc[uv_getnameinfo_s](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], loop : Ptr[uv_loop_t], work_req : uv__work, getnameinfo_cb : uv_getnameinfo_cb, storage : sockaddr_storage, flags : CInt, host : CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._5]], service : CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], retcode : CInt)(using Zone): Ptr[uv_getnameinfo_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).loop = loop
      (!____ptr).work_req = work_req
      (!____ptr).getnameinfo_cb = getnameinfo_cb
      (!____ptr).storage = storage
      (!____ptr).flags = flags
      (!____ptr).host = host
      (!____ptr).service = service
      (!____ptr).retcode = retcode
      ____ptr
    extension (struct: uv_getnameinfo_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def loop : Ptr[uv_loop_t] = struct._4
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at4 = value
      def work_req : uv__work = struct._5
      def work_req_=(value: uv__work): Unit = !struct.at5 = value
      def getnameinfo_cb : uv_getnameinfo_cb = struct._6.asInstanceOf[uv_getnameinfo_cb]
      def getnameinfo_cb_=(value: uv_getnameinfo_cb): Unit = !struct.at6 = value.asInstanceOf[Ptr[Byte]]
      def storage : sockaddr_storage = struct._7
      def storage_=(value: sockaddr_storage): Unit = !struct.at7 = value
      def flags : CInt = struct._8
      def flags_=(value: CInt): Unit = !struct.at8 = value
      def host : CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._5]] = struct._9
      def host_=(value: CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._5]]): Unit = !struct.at9 = value
      def service : CArray[CChar, Nat.Digit2[Nat._3, Nat._2]] = struct._10
      def service_=(value: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at10 = value
      def retcode : CInt = struct._11
      def retcode_=(value: CInt): Unit = !struct.at11 = value

  /**
  */
  opaque type uv_getnameinfo_t = CStruct11[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], uv__work, Ptr[Byte], sockaddr_storage, CInt, CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._5]], CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], CInt]
  object uv_getnameinfo_t:
    given _tag: Tag[uv_getnameinfo_t] = Tag.materializeCStruct11Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], uv__work, Ptr[Byte], sockaddr_storage, CInt, CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._5]], CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], CInt]
    def apply()(using Zone): Ptr[uv_getnameinfo_t] = scala.scalanative.unsafe.alloc[uv_getnameinfo_t](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], loop : Ptr[uv_loop_t], work_req : uv__work, getnameinfo_cb : uv_getnameinfo_cb, storage : sockaddr_storage, flags : CInt, host : CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._5]], service : CArray[CChar, Nat.Digit2[Nat._3, Nat._2]], retcode : CInt)(using Zone): Ptr[uv_getnameinfo_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).loop = loop
      (!____ptr).work_req = work_req
      (!____ptr).getnameinfo_cb = getnameinfo_cb
      (!____ptr).storage = storage
      (!____ptr).flags = flags
      (!____ptr).host = host
      (!____ptr).service = service
      (!____ptr).retcode = retcode
      ____ptr
    extension (struct: uv_getnameinfo_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def loop : Ptr[uv_loop_t] = struct._4
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at4 = value
      def work_req : uv__work = struct._5
      def work_req_=(value: uv__work): Unit = !struct.at5 = value
      def getnameinfo_cb : uv_getnameinfo_cb = struct._6.asInstanceOf[uv_getnameinfo_cb]
      def getnameinfo_cb_=(value: uv_getnameinfo_cb): Unit = !struct.at6 = value.asInstanceOf[Ptr[Byte]]
      def storage : sockaddr_storage = struct._7
      def storage_=(value: sockaddr_storage): Unit = !struct.at7 = value
      def flags : CInt = struct._8
      def flags_=(value: CInt): Unit = !struct.at8 = value
      def host : CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._5]] = struct._9
      def host_=(value: CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._5]]): Unit = !struct.at9 = value
      def service : CArray[CChar, Nat.Digit2[Nat._3, Nat._2]] = struct._10
      def service_=(value: CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at10 = value
      def retcode : CInt = struct._11
      def retcode_=(value: CInt): Unit = !struct.at11 = value

  /**
  */
  opaque type uv_group_s = CStruct3[CString, CUnsignedLongInt, Ptr[CString]]
  object uv_group_s:
    given _tag: Tag[uv_group_s] = Tag.materializeCStruct3Tag[CString, CUnsignedLongInt, Ptr[CString]]
    def apply()(using Zone): Ptr[uv_group_s] = scala.scalanative.unsafe.alloc[uv_group_s](1)
    def apply(groupname : CString, gid : CUnsignedLongInt, members : Ptr[CString])(using Zone): Ptr[uv_group_s] = 
      val ____ptr = apply()
      (!____ptr).groupname = groupname
      (!____ptr).gid = gid
      (!____ptr).members = members
      ____ptr
    extension (struct: uv_group_s)
      def groupname : CString = struct._1
      def groupname_=(value: CString): Unit = !struct.at1 = value
      def gid : CUnsignedLongInt = struct._2
      def gid_=(value: CUnsignedLongInt): Unit = !struct.at2 = value
      def members : Ptr[CString] = struct._3
      def members_=(value: Ptr[CString]): Unit = !struct.at3 = value

  /**
  */
  opaque type uv_group_t = CStruct3[CString, CUnsignedLongInt, Ptr[CString]]
  object uv_group_t:
    given _tag: Tag[uv_group_t] = Tag.materializeCStruct3Tag[CString, CUnsignedLongInt, Ptr[CString]]
    def apply()(using Zone): Ptr[uv_group_t] = scala.scalanative.unsafe.alloc[uv_group_t](1)
    def apply(groupname : CString, gid : CUnsignedLongInt, members : Ptr[CString])(using Zone): Ptr[uv_group_t] = 
      val ____ptr = apply()
      (!____ptr).groupname = groupname
      (!____ptr).gid = gid
      (!____ptr).members = members
      ____ptr
    extension (struct: uv_group_t)
      def groupname : CString = struct._1
      def groupname_=(value: CString): Unit = !struct.at1 = value
      def gid : CUnsignedLongInt = struct._2
      def gid_=(value: CUnsignedLongInt): Unit = !struct.at2 = value
      def members : Ptr[CString] = struct._3
      def members_=(value: Ptr[CString]): Unit = !struct.at3 = value

  /**
  */
  opaque type uv_handle_s = CStruct8[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_handle_s.Union0, Ptr[Byte], CUnsignedInt]
  object uv_handle_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_handle_s] = Tag.materializeCStruct8Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_handle_s.Union0, Ptr[Byte], CUnsignedInt]
    def apply()(using Zone): Ptr[uv_handle_s] = scala.scalanative.unsafe.alloc[uv_handle_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_handle_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt)(using Zone): Ptr[uv_handle_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      ____ptr
    extension (struct: uv_handle_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_handle_s.Union0 = struct._6
      def u_=(value: uv_handle_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value

  /**
  */
  opaque type uv_handle_t = CStruct8[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_handle_t.Union0, Ptr[Byte], CUnsignedInt]
  object uv_handle_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_handle_t] = Tag.materializeCStruct8Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_handle_t.Union0, Ptr[Byte], CUnsignedInt]
    def apply()(using Zone): Ptr[uv_handle_t] = scala.scalanative.unsafe.alloc[uv_handle_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_handle_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt)(using Zone): Ptr[uv_handle_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      ____ptr
    extension (struct: uv_handle_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_handle_t.Union0 = struct._6
      def u_=(value: uv_handle_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value

  /**
  */
  opaque type uv_idle_s = CStruct10[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_idle_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
  object uv_idle_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_idle_s] = Tag.materializeCStruct10Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_idle_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
    def apply()(using Zone): Ptr[uv_idle_s] = scala.scalanative.unsafe.alloc[uv_idle_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_idle_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, idle_cb : uv_idle_cb, queue : uv__queue)(using Zone): Ptr[uv_idle_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).idle_cb = idle_cb
      (!____ptr).queue = queue
      ____ptr
    extension (struct: uv_idle_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_idle_s.Union0 = struct._6
      def u_=(value: uv_idle_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def idle_cb : uv_idle_cb = struct._9.asInstanceOf[uv_idle_cb]
      def idle_cb_=(value: uv_idle_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._10
      def queue_=(value: uv__queue): Unit = !struct.at10 = value

  /**
  */
  opaque type uv_idle_t = CStruct10[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_idle_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
  object uv_idle_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_idle_t] = Tag.materializeCStruct10Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_idle_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
    def apply()(using Zone): Ptr[uv_idle_t] = scala.scalanative.unsafe.alloc[uv_idle_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_idle_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, idle_cb : uv_idle_cb, queue : uv__queue)(using Zone): Ptr[uv_idle_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).idle_cb = idle_cb
      (!____ptr).queue = queue
      ____ptr
    extension (struct: uv_idle_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_idle_t.Union0 = struct._6
      def u_=(value: uv_idle_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def idle_cb : uv_idle_cb = struct._9.asInstanceOf[uv_idle_cb]
      def idle_cb_=(value: uv_idle_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._10
      def queue_=(value: uv__queue): Unit = !struct.at10 = value

  /**
  */
  opaque type uv_interface_address_s = CStruct5[CString, CArray[CChar, Nat._6], CInt, uv_interface_address_s.Union0, uv_interface_address_s.Union1]
  object uv_interface_address_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._2, Nat._8]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._8]](Tag.Byte, Tag.Digit2[Nat._2, Nat._8](Tag.Nat2, Tag.Nat8))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_address4")
      def apply(address4: sockaddr_in)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[sockaddr_in]].update(0, address4)
        ___ptr
      @scala.annotation.targetName("apply_address6")
      def apply(address6: sockaddr_in6)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[sockaddr_in6]].update(0, address6)
        ___ptr
      extension (struct: Union0)
        def address4 : sockaddr_in = !struct.at(0).asInstanceOf[Ptr[sockaddr_in]]
        def address4_=(value: sockaddr_in): Unit = !struct.at(0).asInstanceOf[Ptr[sockaddr_in]] = value
        def address6 : sockaddr_in6 = !struct.at(0).asInstanceOf[Ptr[sockaddr_in6]]
        def address6_=(value: sockaddr_in6): Unit = !struct.at(0).asInstanceOf[Ptr[sockaddr_in6]] = value
    /**
    */
    opaque type Union1 = CArray[Byte, Nat.Digit2[Nat._2, Nat._8]]
    object Union1:
      given _tag: Tag[Union1] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._8]](Tag.Byte, Tag.Digit2[Nat._2, Nat._8](Tag.Nat2, Tag.Nat8))
      def apply()(using Zone): Ptr[Union1] = 
        val ___ptr = alloc[Union1](1)
        ___ptr
      @scala.annotation.targetName("apply_netmask4")
      def apply(netmask4: sockaddr_in)(using Zone): Ptr[Union1] =
        val ___ptr = alloc[Union1](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[sockaddr_in]].update(0, netmask4)
        ___ptr
      @scala.annotation.targetName("apply_netmask6")
      def apply(netmask6: sockaddr_in6)(using Zone): Ptr[Union1] =
        val ___ptr = alloc[Union1](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[sockaddr_in6]].update(0, netmask6)
        ___ptr
      extension (struct: Union1)
        def netmask4 : sockaddr_in = !struct.at(0).asInstanceOf[Ptr[sockaddr_in]]
        def netmask4_=(value: sockaddr_in): Unit = !struct.at(0).asInstanceOf[Ptr[sockaddr_in]] = value
        def netmask6 : sockaddr_in6 = !struct.at(0).asInstanceOf[Ptr[sockaddr_in6]]
        def netmask6_=(value: sockaddr_in6): Unit = !struct.at(0).asInstanceOf[Ptr[sockaddr_in6]] = value
    given _tag: Tag[uv_interface_address_s] = Tag.materializeCStruct5Tag[CString, CArray[CChar, Nat._6], CInt, uv_interface_address_s.Union0, uv_interface_address_s.Union1]
    def apply()(using Zone): Ptr[uv_interface_address_s] = scala.scalanative.unsafe.alloc[uv_interface_address_s](1)
    def apply(name : CString, phys_addr : CArray[CChar, Nat._6], is_internal : CInt, address : uv_interface_address_s.Union0, netmask : uv_interface_address_s.Union1)(using Zone): Ptr[uv_interface_address_s] = 
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).phys_addr = phys_addr
      (!____ptr).is_internal = is_internal
      (!____ptr).address = address
      (!____ptr).netmask = netmask
      ____ptr
    extension (struct: uv_interface_address_s)
      def name : CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def phys_addr : CArray[CChar, Nat._6] = struct._2
      def phys_addr_=(value: CArray[CChar, Nat._6]): Unit = !struct.at2 = value
      def is_internal : CInt = struct._3
      def is_internal_=(value: CInt): Unit = !struct.at3 = value
      def address : uv_interface_address_s.Union0 = struct._4
      def address_=(value: uv_interface_address_s.Union0): Unit = !struct.at4 = value
      def netmask : uv_interface_address_s.Union1 = struct._5
      def netmask_=(value: uv_interface_address_s.Union1): Unit = !struct.at5 = value

  /**
  */
  opaque type uv_interface_address_t = CStruct5[CString, CArray[CChar, Nat._6], CInt, uv_interface_address_t.Union0, uv_interface_address_t.Union1]
  object uv_interface_address_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._2, Nat._8]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._8]](Tag.Byte, Tag.Digit2[Nat._2, Nat._8](Tag.Nat2, Tag.Nat8))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_address4")
      def apply(address4: sockaddr_in)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[sockaddr_in]].update(0, address4)
        ___ptr
      @scala.annotation.targetName("apply_address6")
      def apply(address6: sockaddr_in6)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[sockaddr_in6]].update(0, address6)
        ___ptr
      extension (struct: Union0)
        def address4 : sockaddr_in = !struct.at(0).asInstanceOf[Ptr[sockaddr_in]]
        def address4_=(value: sockaddr_in): Unit = !struct.at(0).asInstanceOf[Ptr[sockaddr_in]] = value
        def address6 : sockaddr_in6 = !struct.at(0).asInstanceOf[Ptr[sockaddr_in6]]
        def address6_=(value: sockaddr_in6): Unit = !struct.at(0).asInstanceOf[Ptr[sockaddr_in6]] = value
    /**
    */
    opaque type Union1 = CArray[Byte, Nat.Digit2[Nat._2, Nat._8]]
    object Union1:
      given _tag: Tag[Union1] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._8]](Tag.Byte, Tag.Digit2[Nat._2, Nat._8](Tag.Nat2, Tag.Nat8))
      def apply()(using Zone): Ptr[Union1] = 
        val ___ptr = alloc[Union1](1)
        ___ptr
      @scala.annotation.targetName("apply_netmask4")
      def apply(netmask4: sockaddr_in)(using Zone): Ptr[Union1] =
        val ___ptr = alloc[Union1](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[sockaddr_in]].update(0, netmask4)
        ___ptr
      @scala.annotation.targetName("apply_netmask6")
      def apply(netmask6: sockaddr_in6)(using Zone): Ptr[Union1] =
        val ___ptr = alloc[Union1](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[sockaddr_in6]].update(0, netmask6)
        ___ptr
      extension (struct: Union1)
        def netmask4 : sockaddr_in = !struct.at(0).asInstanceOf[Ptr[sockaddr_in]]
        def netmask4_=(value: sockaddr_in): Unit = !struct.at(0).asInstanceOf[Ptr[sockaddr_in]] = value
        def netmask6 : sockaddr_in6 = !struct.at(0).asInstanceOf[Ptr[sockaddr_in6]]
        def netmask6_=(value: sockaddr_in6): Unit = !struct.at(0).asInstanceOf[Ptr[sockaddr_in6]] = value
    given _tag: Tag[uv_interface_address_t] = Tag.materializeCStruct5Tag[CString, CArray[CChar, Nat._6], CInt, uv_interface_address_t.Union0, uv_interface_address_t.Union1]
    def apply()(using Zone): Ptr[uv_interface_address_t] = scala.scalanative.unsafe.alloc[uv_interface_address_t](1)
    def apply(name : CString, phys_addr : CArray[CChar, Nat._6], is_internal : CInt, address : uv_interface_address_t.Union0, netmask : uv_interface_address_t.Union1)(using Zone): Ptr[uv_interface_address_t] = 
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).phys_addr = phys_addr
      (!____ptr).is_internal = is_internal
      (!____ptr).address = address
      (!____ptr).netmask = netmask
      ____ptr
    extension (struct: uv_interface_address_t)
      def name : CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def phys_addr : CArray[CChar, Nat._6] = struct._2
      def phys_addr_=(value: CArray[CChar, Nat._6]): Unit = !struct.at2 = value
      def is_internal : CInt = struct._3
      def is_internal_=(value: CInt): Unit = !struct.at3 = value
      def address : uv_interface_address_t.Union0 = struct._4
      def address_=(value: uv_interface_address_t.Union0): Unit = !struct.at4 = value
      def netmask : uv_interface_address_t.Union1 = struct._5
      def netmask_=(value: uv_interface_address_t.Union1): Unit = !struct.at5 = value

  /**
  */
  opaque type uv_lib_t = CStruct2[Ptr[Byte], CString]
  object uv_lib_t:
    given _tag: Tag[uv_lib_t] = Tag.materializeCStruct2Tag[Ptr[Byte], CString]
    def apply()(using Zone): Ptr[uv_lib_t] = scala.scalanative.unsafe.alloc[uv_lib_t](1)
    def apply(handle : Ptr[Byte], errmsg : CString)(using Zone): Ptr[uv_lib_t] = 
      val ____ptr = apply()
      (!____ptr).handle = handle
      (!____ptr).errmsg = errmsg
      ____ptr
    extension (struct: uv_lib_t)
      def handle : Ptr[Byte] = struct._1
      def handle_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def errmsg : CString = struct._2
      def errmsg_=(value: CString): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_loop_s = CArray[CChar, Nat.Digit3[Nat._7, Nat._6, Nat._8]]
  object uv_loop_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat._8]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_unused")
      def apply(unused: Ptr[Byte])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[Byte]]].update(0, unused)
        ___ptr
      @scala.annotation.targetName("apply_count")
      def apply(count: CUnsignedInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CUnsignedInt]].update(0, count)
        ___ptr
      extension (struct: Union0)
        def unused : Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
        def unused_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
        def count : CUnsignedInt = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]]
        def count_=(value: CUnsignedInt): Unit = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]] = value
    /**
    */
    opaque type Struct1 = CStruct2[Ptr[Byte], CUnsignedInt]
    object Struct1:
      given _tag: Tag[Struct1] = Tag.materializeCStruct2Tag[Ptr[Byte], CUnsignedInt]
      def apply()(using Zone): Ptr[Struct1] = scala.scalanative.unsafe.alloc[Struct1](1)
      def apply(min : Ptr[Byte], nelts : CUnsignedInt)(using Zone): Ptr[Struct1] = 
        val ____ptr = apply()
        (!____ptr).min = min
        (!____ptr).nelts = nelts
        ____ptr
      extension (struct: Struct1)
        def min : Ptr[Byte] = struct._1
        def min_=(value: Ptr[Byte]): Unit = !struct.at1 = value
        def nelts : CUnsignedInt = struct._2
        def nelts_=(value: CUnsignedInt): Unit = !struct.at2 = value
    given _tag: Tag[uv_loop_s] = Tag.CArray[CChar, Nat.Digit3[Nat._7, Nat._6, Nat._8]](Tag.Byte, Tag.Digit3[Nat._7, Nat._6, Nat._8](Tag.Nat7, Tag.Nat6, Tag.Nat8))
    def apply()(using Zone): Ptr[uv_loop_s] = scala.scalanative.unsafe.alloc[uv_loop_s](1)
    def apply(data : Ptr[Byte], active_handles : CUnsignedInt, handle_queue : uv__queue, active_reqs : uv_loop_s.Union0, internal_fields : Ptr[Byte], stop_flag : CUnsignedInt, flags : CUnsignedLongInt, backend_fd : CInt, pending_queue : uv__queue, watcher_queue : uv__queue, watchers : Ptr[Ptr[uv__io_t]], nwatchers : CUnsignedInt, nfds : CUnsignedInt, wq : uv__queue, wq_mutex : uv_mutex_t, wq_async : uv_async_t, cloexec_lock : uv_rwlock_t, closing_handles : Ptr[uv_handle_t], process_handles : uv__queue, prepare_handles : uv__queue, check_handles : uv__queue, idle_handles : uv__queue, async_handles : uv__queue, async_unused : CFuncPtr0[Unit], async_io_watcher : uv__io_t, async_wfd : CInt, timer_heap : uv_loop_s.Struct1, timer_counter : uint64_t, time : uint64_t, signal_pipefd : CArray[CInt, Nat._2], signal_io_watcher : uv__io_t, child_watcher : uv_signal_t, emfile_fd : CInt, cf_thread : uv_thread_t, _cf_reserved : Ptr[Byte], cf_state : Ptr[Byte], cf_mutex : uv_mutex_t, cf_sem : uv_sem_t, cf_signals : uv__queue)(using Zone): Ptr[uv_loop_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).active_handles = active_handles
      (!____ptr).handle_queue = handle_queue
      (!____ptr).active_reqs = active_reqs
      (!____ptr).internal_fields = internal_fields
      (!____ptr).stop_flag = stop_flag
      (!____ptr).flags = flags
      (!____ptr).backend_fd = backend_fd
      (!____ptr).pending_queue = pending_queue
      (!____ptr).watcher_queue = watcher_queue
      (!____ptr).watchers = watchers
      (!____ptr).nwatchers = nwatchers
      (!____ptr).nfds = nfds
      (!____ptr).wq = wq
      (!____ptr).wq_mutex = wq_mutex
      (!____ptr).wq_async = wq_async
      (!____ptr).cloexec_lock = cloexec_lock
      (!____ptr).closing_handles = closing_handles
      (!____ptr).process_handles = process_handles
      (!____ptr).prepare_handles = prepare_handles
      (!____ptr).check_handles = check_handles
      (!____ptr).idle_handles = idle_handles
      (!____ptr).async_handles = async_handles
      (!____ptr).async_unused = async_unused
      (!____ptr).async_io_watcher = async_io_watcher
      (!____ptr).async_wfd = async_wfd
      (!____ptr).timer_heap = timer_heap
      (!____ptr).timer_counter = timer_counter
      (!____ptr).time = time
      (!____ptr).signal_pipefd = signal_pipefd
      (!____ptr).signal_io_watcher = signal_io_watcher
      (!____ptr).child_watcher = child_watcher
      (!____ptr).emfile_fd = emfile_fd
      (!____ptr).cf_thread = cf_thread
      (!____ptr)._cf_reserved = _cf_reserved
      (!____ptr).cf_state = cf_state
      (!____ptr).cf_mutex = cf_mutex
      (!____ptr).cf_sem = cf_sem
      (!____ptr).cf_signals = cf_signals
      ____ptr
    extension (struct: uv_loop_s)
      def data: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def data_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def active_handles: CUnsignedInt = !struct.at(8).asInstanceOf[Ptr[CUnsignedInt]]
      def active_handles_=(value: CUnsignedInt): Unit = !struct.at(8).asInstanceOf[Ptr[CUnsignedInt]] = value
      def handle_queue: uv__queue = !struct.at(16).asInstanceOf[Ptr[uv__queue]]
      def handle_queue_=(value: uv__queue): Unit = !struct.at(16).asInstanceOf[Ptr[uv__queue]] = value
      def active_reqs: uv_loop_s.Union0 = !struct.at(32).asInstanceOf[Ptr[uv_loop_s.Union0]]
      def active_reqs_=(value: uv_loop_s.Union0): Unit = !struct.at(32).asInstanceOf[Ptr[uv_loop_s.Union0]] = value
      def internal_fields: Ptr[Byte] = !struct.at(40).asInstanceOf[Ptr[Ptr[Byte]]]
      def internal_fields_=(value: Ptr[Byte]): Unit = !struct.at(40).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def stop_flag: CUnsignedInt = !struct.at(48).asInstanceOf[Ptr[CUnsignedInt]]
      def stop_flag_=(value: CUnsignedInt): Unit = !struct.at(48).asInstanceOf[Ptr[CUnsignedInt]] = value
      def flags: CUnsignedLongInt = !struct.at(56).asInstanceOf[Ptr[CUnsignedLongInt]]
      def flags_=(value: CUnsignedLongInt): Unit = !struct.at(56).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def backend_fd: CInt = !struct.at(64).asInstanceOf[Ptr[CInt]]
      def backend_fd_=(value: CInt): Unit = !struct.at(64).asInstanceOf[Ptr[CInt]] = value
      def pending_queue: uv__queue = !struct.at(72).asInstanceOf[Ptr[uv__queue]]
      def pending_queue_=(value: uv__queue): Unit = !struct.at(72).asInstanceOf[Ptr[uv__queue]] = value
      def watcher_queue: uv__queue = !struct.at(88).asInstanceOf[Ptr[uv__queue]]
      def watcher_queue_=(value: uv__queue): Unit = !struct.at(88).asInstanceOf[Ptr[uv__queue]] = value
      def watchers: Ptr[Ptr[uv__io_t]] = !struct.at(104).asInstanceOf[Ptr[Ptr[Ptr[uv__io_t]]]]
      def watchers_=(value: Ptr[Ptr[uv__io_t]]): Unit = !struct.at(104).asInstanceOf[Ptr[Ptr[Ptr[uv__io_t]]]] = value
      def nwatchers: CUnsignedInt = !struct.at(112).asInstanceOf[Ptr[CUnsignedInt]]
      def nwatchers_=(value: CUnsignedInt): Unit = !struct.at(112).asInstanceOf[Ptr[CUnsignedInt]] = value
      def nfds: CUnsignedInt = !struct.at(116).asInstanceOf[Ptr[CUnsignedInt]]
      def nfds_=(value: CUnsignedInt): Unit = !struct.at(116).asInstanceOf[Ptr[CUnsignedInt]] = value
      def wq: uv__queue = !struct.at(120).asInstanceOf[Ptr[uv__queue]]
      def wq_=(value: uv__queue): Unit = !struct.at(120).asInstanceOf[Ptr[uv__queue]] = value
      def wq_mutex: uv_mutex_t = !struct.at(136).asInstanceOf[Ptr[uv_mutex_t]]
      def wq_mutex_=(value: uv_mutex_t): Unit = !struct.at(136).asInstanceOf[Ptr[uv_mutex_t]] = value
      def wq_async: uv_async_t = !struct.at(144).asInstanceOf[Ptr[uv_async_t]]
      def wq_async_=(value: uv_async_t): Unit = !struct.at(144).asInstanceOf[Ptr[uv_async_t]] = value
      def cloexec_lock: uv_rwlock_t = !struct.at(272).asInstanceOf[Ptr[uv_rwlock_t]]
      def cloexec_lock_=(value: uv_rwlock_t): Unit = !struct.at(272).asInstanceOf[Ptr[uv_rwlock_t]] = value
      def closing_handles: Ptr[uv_handle_t] = !struct.at(280).asInstanceOf[Ptr[Ptr[uv_handle_t]]]
      def closing_handles_=(value: Ptr[uv_handle_t]): Unit = !struct.at(280).asInstanceOf[Ptr[Ptr[uv_handle_t]]] = value
      def process_handles: uv__queue = !struct.at(288).asInstanceOf[Ptr[uv__queue]]
      def process_handles_=(value: uv__queue): Unit = !struct.at(288).asInstanceOf[Ptr[uv__queue]] = value
      def prepare_handles: uv__queue = !struct.at(304).asInstanceOf[Ptr[uv__queue]]
      def prepare_handles_=(value: uv__queue): Unit = !struct.at(304).asInstanceOf[Ptr[uv__queue]] = value
      def check_handles: uv__queue = !struct.at(320).asInstanceOf[Ptr[uv__queue]]
      def check_handles_=(value: uv__queue): Unit = !struct.at(320).asInstanceOf[Ptr[uv__queue]] = value
      def idle_handles: uv__queue = !struct.at(336).asInstanceOf[Ptr[uv__queue]]
      def idle_handles_=(value: uv__queue): Unit = !struct.at(336).asInstanceOf[Ptr[uv__queue]] = value
      def async_handles: uv__queue = !struct.at(352).asInstanceOf[Ptr[uv__queue]]
      def async_handles_=(value: uv__queue): Unit = !struct.at(352).asInstanceOf[Ptr[uv__queue]] = value
      def async_unused: CFuncPtr0[Unit] = !struct.at(368).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      def async_unused_=(value: CFuncPtr0[Unit]): Unit = !struct.at(368).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      def async_io_watcher: uv__io_t = !struct.at(376).asInstanceOf[Ptr[uv__io_t]]
      def async_io_watcher_=(value: uv__io_t): Unit = !struct.at(376).asInstanceOf[Ptr[uv__io_t]] = value
      def async_wfd: CInt = !struct.at(440).asInstanceOf[Ptr[CInt]]
      def async_wfd_=(value: CInt): Unit = !struct.at(440).asInstanceOf[Ptr[CInt]] = value
      def timer_heap: uv_loop_s.Struct1 = !struct.at(448).asInstanceOf[Ptr[uv_loop_s.Struct1]]
      def timer_heap_=(value: uv_loop_s.Struct1): Unit = !struct.at(448).asInstanceOf[Ptr[uv_loop_s.Struct1]] = value
      def timer_counter: uint64_t = !struct.at(464).asInstanceOf[Ptr[uint64_t]]
      def timer_counter_=(value: uint64_t): Unit = !struct.at(464).asInstanceOf[Ptr[uint64_t]] = value
      def time: uint64_t = !struct.at(472).asInstanceOf[Ptr[uint64_t]]
      def time_=(value: uint64_t): Unit = !struct.at(472).asInstanceOf[Ptr[uint64_t]] = value
      def signal_pipefd: CArray[CInt, Nat._2] = !struct.at(480).asInstanceOf[Ptr[CArray[CInt, Nat._2]]]
      def signal_pipefd_=(value: CArray[CInt, Nat._2]): Unit = !struct.at(480).asInstanceOf[Ptr[CArray[CInt, Nat._2]]] = value
      def signal_io_watcher: uv__io_t = !struct.at(488).asInstanceOf[Ptr[uv__io_t]]
      def signal_io_watcher_=(value: uv__io_t): Unit = !struct.at(488).asInstanceOf[Ptr[uv__io_t]] = value
      def child_watcher: uv_signal_t = !struct.at(552).asInstanceOf[Ptr[uv_signal_t]]
      def child_watcher_=(value: uv_signal_t): Unit = !struct.at(552).asInstanceOf[Ptr[uv_signal_t]] = value
      def emfile_fd: CInt = !struct.at(704).asInstanceOf[Ptr[CInt]]
      def emfile_fd_=(value: CInt): Unit = !struct.at(704).asInstanceOf[Ptr[CInt]] = value
      def cf_thread: uv_thread_t = !struct.at(712).asInstanceOf[Ptr[uv_thread_t]]
      def cf_thread_=(value: uv_thread_t): Unit = !struct.at(712).asInstanceOf[Ptr[uv_thread_t]] = value
      def _cf_reserved: Ptr[Byte] = !struct.at(720).asInstanceOf[Ptr[Ptr[Byte]]]
      def _cf_reserved_=(value: Ptr[Byte]): Unit = !struct.at(720).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def cf_state: Ptr[Byte] = !struct.at(728).asInstanceOf[Ptr[Ptr[Byte]]]
      def cf_state_=(value: Ptr[Byte]): Unit = !struct.at(728).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def cf_mutex: uv_mutex_t = !struct.at(736).asInstanceOf[Ptr[uv_mutex_t]]
      def cf_mutex_=(value: uv_mutex_t): Unit = !struct.at(736).asInstanceOf[Ptr[uv_mutex_t]] = value
      def cf_sem: uv_sem_t = !struct.at(744).asInstanceOf[Ptr[uv_sem_t]]
      def cf_sem_=(value: uv_sem_t): Unit = !struct.at(744).asInstanceOf[Ptr[uv_sem_t]] = value
      def cf_signals: uv__queue = !struct.at(752).asInstanceOf[Ptr[uv__queue]]
      def cf_signals_=(value: uv__queue): Unit = !struct.at(752).asInstanceOf[Ptr[uv__queue]] = value

  /**
  */
  opaque type uv_loop_t = CArray[CChar, Nat.Digit3[Nat._7, Nat._6, Nat._8]]
  object uv_loop_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat._8]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_unused")
      def apply(unused: Ptr[Byte])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[Byte]]].update(0, unused)
        ___ptr
      @scala.annotation.targetName("apply_count")
      def apply(count: CUnsignedInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CUnsignedInt]].update(0, count)
        ___ptr
      extension (struct: Union0)
        def unused : Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
        def unused_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
        def count : CUnsignedInt = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]]
        def count_=(value: CUnsignedInt): Unit = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]] = value
    /**
    */
    opaque type Struct1 = CStruct2[Ptr[Byte], CUnsignedInt]
    object Struct1:
      given _tag: Tag[Struct1] = Tag.materializeCStruct2Tag[Ptr[Byte], CUnsignedInt]
      def apply()(using Zone): Ptr[Struct1] = scala.scalanative.unsafe.alloc[Struct1](1)
      def apply(min : Ptr[Byte], nelts : CUnsignedInt)(using Zone): Ptr[Struct1] = 
        val ____ptr = apply()
        (!____ptr).min = min
        (!____ptr).nelts = nelts
        ____ptr
      extension (struct: Struct1)
        def min : Ptr[Byte] = struct._1
        def min_=(value: Ptr[Byte]): Unit = !struct.at1 = value
        def nelts : CUnsignedInt = struct._2
        def nelts_=(value: CUnsignedInt): Unit = !struct.at2 = value
    given _tag: Tag[uv_loop_t] = Tag.CArray[CChar, Nat.Digit3[Nat._7, Nat._6, Nat._8]](Tag.Byte, Tag.Digit3[Nat._7, Nat._6, Nat._8](Tag.Nat7, Tag.Nat6, Tag.Nat8))
    def apply()(using Zone): Ptr[uv_loop_t] = scala.scalanative.unsafe.alloc[uv_loop_t](1)
    def apply(data : Ptr[Byte], active_handles : CUnsignedInt, handle_queue : uv__queue, active_reqs : uv_loop_t.Union0, internal_fields : Ptr[Byte], stop_flag : CUnsignedInt, flags : CUnsignedLongInt, backend_fd : CInt, pending_queue : uv__queue, watcher_queue : uv__queue, watchers : Ptr[Ptr[uv__io_t]], nwatchers : CUnsignedInt, nfds : CUnsignedInt, wq : uv__queue, wq_mutex : uv_mutex_t, wq_async : uv_async_t, cloexec_lock : uv_rwlock_t, closing_handles : Ptr[uv_handle_t], process_handles : uv__queue, prepare_handles : uv__queue, check_handles : uv__queue, idle_handles : uv__queue, async_handles : uv__queue, async_unused : CFuncPtr0[Unit], async_io_watcher : uv__io_t, async_wfd : CInt, timer_heap : uv_loop_t.Struct1, timer_counter : uint64_t, time : uint64_t, signal_pipefd : CArray[CInt, Nat._2], signal_io_watcher : uv__io_t, child_watcher : uv_signal_t, emfile_fd : CInt, cf_thread : uv_thread_t, _cf_reserved : Ptr[Byte], cf_state : Ptr[Byte], cf_mutex : uv_mutex_t, cf_sem : uv_sem_t, cf_signals : uv__queue)(using Zone): Ptr[uv_loop_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).active_handles = active_handles
      (!____ptr).handle_queue = handle_queue
      (!____ptr).active_reqs = active_reqs
      (!____ptr).internal_fields = internal_fields
      (!____ptr).stop_flag = stop_flag
      (!____ptr).flags = flags
      (!____ptr).backend_fd = backend_fd
      (!____ptr).pending_queue = pending_queue
      (!____ptr).watcher_queue = watcher_queue
      (!____ptr).watchers = watchers
      (!____ptr).nwatchers = nwatchers
      (!____ptr).nfds = nfds
      (!____ptr).wq = wq
      (!____ptr).wq_mutex = wq_mutex
      (!____ptr).wq_async = wq_async
      (!____ptr).cloexec_lock = cloexec_lock
      (!____ptr).closing_handles = closing_handles
      (!____ptr).process_handles = process_handles
      (!____ptr).prepare_handles = prepare_handles
      (!____ptr).check_handles = check_handles
      (!____ptr).idle_handles = idle_handles
      (!____ptr).async_handles = async_handles
      (!____ptr).async_unused = async_unused
      (!____ptr).async_io_watcher = async_io_watcher
      (!____ptr).async_wfd = async_wfd
      (!____ptr).timer_heap = timer_heap
      (!____ptr).timer_counter = timer_counter
      (!____ptr).time = time
      (!____ptr).signal_pipefd = signal_pipefd
      (!____ptr).signal_io_watcher = signal_io_watcher
      (!____ptr).child_watcher = child_watcher
      (!____ptr).emfile_fd = emfile_fd
      (!____ptr).cf_thread = cf_thread
      (!____ptr)._cf_reserved = _cf_reserved
      (!____ptr).cf_state = cf_state
      (!____ptr).cf_mutex = cf_mutex
      (!____ptr).cf_sem = cf_sem
      (!____ptr).cf_signals = cf_signals
      ____ptr
    extension (struct: uv_loop_t)
      def data: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def data_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def active_handles: CUnsignedInt = !struct.at(8).asInstanceOf[Ptr[CUnsignedInt]]
      def active_handles_=(value: CUnsignedInt): Unit = !struct.at(8).asInstanceOf[Ptr[CUnsignedInt]] = value
      def handle_queue: uv__queue = !struct.at(16).asInstanceOf[Ptr[uv__queue]]
      def handle_queue_=(value: uv__queue): Unit = !struct.at(16).asInstanceOf[Ptr[uv__queue]] = value
      def active_reqs: uv_loop_t.Union0 = !struct.at(32).asInstanceOf[Ptr[uv_loop_t.Union0]]
      def active_reqs_=(value: uv_loop_t.Union0): Unit = !struct.at(32).asInstanceOf[Ptr[uv_loop_t.Union0]] = value
      def internal_fields: Ptr[Byte] = !struct.at(40).asInstanceOf[Ptr[Ptr[Byte]]]
      def internal_fields_=(value: Ptr[Byte]): Unit = !struct.at(40).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def stop_flag: CUnsignedInt = !struct.at(48).asInstanceOf[Ptr[CUnsignedInt]]
      def stop_flag_=(value: CUnsignedInt): Unit = !struct.at(48).asInstanceOf[Ptr[CUnsignedInt]] = value
      def flags: CUnsignedLongInt = !struct.at(56).asInstanceOf[Ptr[CUnsignedLongInt]]
      def flags_=(value: CUnsignedLongInt): Unit = !struct.at(56).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def backend_fd: CInt = !struct.at(64).asInstanceOf[Ptr[CInt]]
      def backend_fd_=(value: CInt): Unit = !struct.at(64).asInstanceOf[Ptr[CInt]] = value
      def pending_queue: uv__queue = !struct.at(72).asInstanceOf[Ptr[uv__queue]]
      def pending_queue_=(value: uv__queue): Unit = !struct.at(72).asInstanceOf[Ptr[uv__queue]] = value
      def watcher_queue: uv__queue = !struct.at(88).asInstanceOf[Ptr[uv__queue]]
      def watcher_queue_=(value: uv__queue): Unit = !struct.at(88).asInstanceOf[Ptr[uv__queue]] = value
      def watchers: Ptr[Ptr[uv__io_t]] = !struct.at(104).asInstanceOf[Ptr[Ptr[Ptr[uv__io_t]]]]
      def watchers_=(value: Ptr[Ptr[uv__io_t]]): Unit = !struct.at(104).asInstanceOf[Ptr[Ptr[Ptr[uv__io_t]]]] = value
      def nwatchers: CUnsignedInt = !struct.at(112).asInstanceOf[Ptr[CUnsignedInt]]
      def nwatchers_=(value: CUnsignedInt): Unit = !struct.at(112).asInstanceOf[Ptr[CUnsignedInt]] = value
      def nfds: CUnsignedInt = !struct.at(116).asInstanceOf[Ptr[CUnsignedInt]]
      def nfds_=(value: CUnsignedInt): Unit = !struct.at(116).asInstanceOf[Ptr[CUnsignedInt]] = value
      def wq: uv__queue = !struct.at(120).asInstanceOf[Ptr[uv__queue]]
      def wq_=(value: uv__queue): Unit = !struct.at(120).asInstanceOf[Ptr[uv__queue]] = value
      def wq_mutex: uv_mutex_t = !struct.at(136).asInstanceOf[Ptr[uv_mutex_t]]
      def wq_mutex_=(value: uv_mutex_t): Unit = !struct.at(136).asInstanceOf[Ptr[uv_mutex_t]] = value
      def wq_async: uv_async_t = !struct.at(144).asInstanceOf[Ptr[uv_async_t]]
      def wq_async_=(value: uv_async_t): Unit = !struct.at(144).asInstanceOf[Ptr[uv_async_t]] = value
      def cloexec_lock: uv_rwlock_t = !struct.at(272).asInstanceOf[Ptr[uv_rwlock_t]]
      def cloexec_lock_=(value: uv_rwlock_t): Unit = !struct.at(272).asInstanceOf[Ptr[uv_rwlock_t]] = value
      def closing_handles: Ptr[uv_handle_t] = !struct.at(280).asInstanceOf[Ptr[Ptr[uv_handle_t]]]
      def closing_handles_=(value: Ptr[uv_handle_t]): Unit = !struct.at(280).asInstanceOf[Ptr[Ptr[uv_handle_t]]] = value
      def process_handles: uv__queue = !struct.at(288).asInstanceOf[Ptr[uv__queue]]
      def process_handles_=(value: uv__queue): Unit = !struct.at(288).asInstanceOf[Ptr[uv__queue]] = value
      def prepare_handles: uv__queue = !struct.at(304).asInstanceOf[Ptr[uv__queue]]
      def prepare_handles_=(value: uv__queue): Unit = !struct.at(304).asInstanceOf[Ptr[uv__queue]] = value
      def check_handles: uv__queue = !struct.at(320).asInstanceOf[Ptr[uv__queue]]
      def check_handles_=(value: uv__queue): Unit = !struct.at(320).asInstanceOf[Ptr[uv__queue]] = value
      def idle_handles: uv__queue = !struct.at(336).asInstanceOf[Ptr[uv__queue]]
      def idle_handles_=(value: uv__queue): Unit = !struct.at(336).asInstanceOf[Ptr[uv__queue]] = value
      def async_handles: uv__queue = !struct.at(352).asInstanceOf[Ptr[uv__queue]]
      def async_handles_=(value: uv__queue): Unit = !struct.at(352).asInstanceOf[Ptr[uv__queue]] = value
      def async_unused: CFuncPtr0[Unit] = !struct.at(368).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      def async_unused_=(value: CFuncPtr0[Unit]): Unit = !struct.at(368).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      def async_io_watcher: uv__io_t = !struct.at(376).asInstanceOf[Ptr[uv__io_t]]
      def async_io_watcher_=(value: uv__io_t): Unit = !struct.at(376).asInstanceOf[Ptr[uv__io_t]] = value
      def async_wfd: CInt = !struct.at(440).asInstanceOf[Ptr[CInt]]
      def async_wfd_=(value: CInt): Unit = !struct.at(440).asInstanceOf[Ptr[CInt]] = value
      def timer_heap: uv_loop_t.Struct1 = !struct.at(448).asInstanceOf[Ptr[uv_loop_t.Struct1]]
      def timer_heap_=(value: uv_loop_t.Struct1): Unit = !struct.at(448).asInstanceOf[Ptr[uv_loop_t.Struct1]] = value
      def timer_counter: uint64_t = !struct.at(464).asInstanceOf[Ptr[uint64_t]]
      def timer_counter_=(value: uint64_t): Unit = !struct.at(464).asInstanceOf[Ptr[uint64_t]] = value
      def time: uint64_t = !struct.at(472).asInstanceOf[Ptr[uint64_t]]
      def time_=(value: uint64_t): Unit = !struct.at(472).asInstanceOf[Ptr[uint64_t]] = value
      def signal_pipefd: CArray[CInt, Nat._2] = !struct.at(480).asInstanceOf[Ptr[CArray[CInt, Nat._2]]]
      def signal_pipefd_=(value: CArray[CInt, Nat._2]): Unit = !struct.at(480).asInstanceOf[Ptr[CArray[CInt, Nat._2]]] = value
      def signal_io_watcher: uv__io_t = !struct.at(488).asInstanceOf[Ptr[uv__io_t]]
      def signal_io_watcher_=(value: uv__io_t): Unit = !struct.at(488).asInstanceOf[Ptr[uv__io_t]] = value
      def child_watcher: uv_signal_t = !struct.at(552).asInstanceOf[Ptr[uv_signal_t]]
      def child_watcher_=(value: uv_signal_t): Unit = !struct.at(552).asInstanceOf[Ptr[uv_signal_t]] = value
      def emfile_fd: CInt = !struct.at(704).asInstanceOf[Ptr[CInt]]
      def emfile_fd_=(value: CInt): Unit = !struct.at(704).asInstanceOf[Ptr[CInt]] = value
      def cf_thread: uv_thread_t = !struct.at(712).asInstanceOf[Ptr[uv_thread_t]]
      def cf_thread_=(value: uv_thread_t): Unit = !struct.at(712).asInstanceOf[Ptr[uv_thread_t]] = value
      def _cf_reserved: Ptr[Byte] = !struct.at(720).asInstanceOf[Ptr[Ptr[Byte]]]
      def _cf_reserved_=(value: Ptr[Byte]): Unit = !struct.at(720).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def cf_state: Ptr[Byte] = !struct.at(728).asInstanceOf[Ptr[Ptr[Byte]]]
      def cf_state_=(value: Ptr[Byte]): Unit = !struct.at(728).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def cf_mutex: uv_mutex_t = !struct.at(736).asInstanceOf[Ptr[uv_mutex_t]]
      def cf_mutex_=(value: uv_mutex_t): Unit = !struct.at(736).asInstanceOf[Ptr[uv_mutex_t]] = value
      def cf_sem: uv_sem_t = !struct.at(744).asInstanceOf[Ptr[uv_sem_t]]
      def cf_sem_=(value: uv_sem_t): Unit = !struct.at(744).asInstanceOf[Ptr[uv_sem_t]] = value
      def cf_signals: uv__queue = !struct.at(752).asInstanceOf[Ptr[uv__queue]]
      def cf_signals_=(value: uv__queue): Unit = !struct.at(752).asInstanceOf[Ptr[uv__queue]] = value

  /**
  */
  opaque type uv_metrics_s = CStruct4[uint64_t, uint64_t, uint64_t, CArray[Ptr[uint64_t], Nat.Digit2[Nat._1, Nat._3]]]
  object uv_metrics_s:
    given _tag: Tag[uv_metrics_s] = Tag.materializeCStruct4Tag[uint64_t, uint64_t, uint64_t, CArray[Ptr[uint64_t], Nat.Digit2[Nat._1, Nat._3]]]
    def apply()(using Zone): Ptr[uv_metrics_s] = scala.scalanative.unsafe.alloc[uv_metrics_s](1)
    def apply(loop_count : uint64_t, events : uint64_t, events_waiting : uint64_t, reserved : CArray[Ptr[uint64_t], Nat.Digit2[Nat._1, Nat._3]])(using Zone): Ptr[uv_metrics_s] = 
      val ____ptr = apply()
      (!____ptr).loop_count = loop_count
      (!____ptr).events = events
      (!____ptr).events_waiting = events_waiting
      (!____ptr).reserved = reserved
      ____ptr
    extension (struct: uv_metrics_s)
      def loop_count : uint64_t = struct._1
      def loop_count_=(value: uint64_t): Unit = !struct.at1 = value
      def events : uint64_t = struct._2
      def events_=(value: uint64_t): Unit = !struct.at2 = value
      def events_waiting : uint64_t = struct._3
      def events_waiting_=(value: uint64_t): Unit = !struct.at3 = value
      def reserved : CArray[Ptr[uint64_t], Nat.Digit2[Nat._1, Nat._3]] = struct._4
      def reserved_=(value: CArray[Ptr[uint64_t], Nat.Digit2[Nat._1, Nat._3]]): Unit = !struct.at4 = value

  /**
  */
  opaque type uv_metrics_t = CStruct4[uint64_t, uint64_t, uint64_t, CArray[Ptr[uint64_t], Nat.Digit2[Nat._1, Nat._3]]]
  object uv_metrics_t:
    given _tag: Tag[uv_metrics_t] = Tag.materializeCStruct4Tag[uint64_t, uint64_t, uint64_t, CArray[Ptr[uint64_t], Nat.Digit2[Nat._1, Nat._3]]]
    def apply()(using Zone): Ptr[uv_metrics_t] = scala.scalanative.unsafe.alloc[uv_metrics_t](1)
    def apply(loop_count : uint64_t, events : uint64_t, events_waiting : uint64_t, reserved : CArray[Ptr[uint64_t], Nat.Digit2[Nat._1, Nat._3]])(using Zone): Ptr[uv_metrics_t] = 
      val ____ptr = apply()
      (!____ptr).loop_count = loop_count
      (!____ptr).events = events
      (!____ptr).events_waiting = events_waiting
      (!____ptr).reserved = reserved
      ____ptr
    extension (struct: uv_metrics_t)
      def loop_count : uint64_t = struct._1
      def loop_count_=(value: uint64_t): Unit = !struct.at1 = value
      def events : uint64_t = struct._2
      def events_=(value: uint64_t): Unit = !struct.at2 = value
      def events_waiting : uint64_t = struct._3
      def events_waiting_=(value: uint64_t): Unit = !struct.at3 = value
      def reserved : CArray[Ptr[uint64_t], Nat.Digit2[Nat._1, Nat._3]] = struct._4
      def reserved_=(value: CArray[Ptr[uint64_t], Nat.Digit2[Nat._1, Nat._3]]): Unit = !struct.at4 = value

  /**
  */
  opaque type uv_passwd_s = CStruct5[CString, CUnsignedLongInt, CUnsignedLongInt, CString, CString]
  object uv_passwd_s:
    given _tag: Tag[uv_passwd_s] = Tag.materializeCStruct5Tag[CString, CUnsignedLongInt, CUnsignedLongInt, CString, CString]
    def apply()(using Zone): Ptr[uv_passwd_s] = scala.scalanative.unsafe.alloc[uv_passwd_s](1)
    def apply(username : CString, uid : CUnsignedLongInt, gid : CUnsignedLongInt, shell : CString, homedir : CString)(using Zone): Ptr[uv_passwd_s] = 
      val ____ptr = apply()
      (!____ptr).username = username
      (!____ptr).uid = uid
      (!____ptr).gid = gid
      (!____ptr).shell = shell
      (!____ptr).homedir = homedir
      ____ptr
    extension (struct: uv_passwd_s)
      def username : CString = struct._1
      def username_=(value: CString): Unit = !struct.at1 = value
      def uid : CUnsignedLongInt = struct._2
      def uid_=(value: CUnsignedLongInt): Unit = !struct.at2 = value
      def gid : CUnsignedLongInt = struct._3
      def gid_=(value: CUnsignedLongInt): Unit = !struct.at3 = value
      def shell : CString = struct._4
      def shell_=(value: CString): Unit = !struct.at4 = value
      def homedir : CString = struct._5
      def homedir_=(value: CString): Unit = !struct.at5 = value

  /**
  */
  opaque type uv_passwd_t = CStruct5[CString, CUnsignedLongInt, CUnsignedLongInt, CString, CString]
  object uv_passwd_t:
    given _tag: Tag[uv_passwd_t] = Tag.materializeCStruct5Tag[CString, CUnsignedLongInt, CUnsignedLongInt, CString, CString]
    def apply()(using Zone): Ptr[uv_passwd_t] = scala.scalanative.unsafe.alloc[uv_passwd_t](1)
    def apply(username : CString, uid : CUnsignedLongInt, gid : CUnsignedLongInt, shell : CString, homedir : CString)(using Zone): Ptr[uv_passwd_t] = 
      val ____ptr = apply()
      (!____ptr).username = username
      (!____ptr).uid = uid
      (!____ptr).gid = gid
      (!____ptr).shell = shell
      (!____ptr).homedir = homedir
      ____ptr
    extension (struct: uv_passwd_t)
      def username : CString = struct._1
      def username_=(value: CString): Unit = !struct.at1 = value
      def uid : CUnsignedLongInt = struct._2
      def uid_=(value: CUnsignedLongInt): Unit = !struct.at2 = value
      def gid : CUnsignedLongInt = struct._3
      def gid_=(value: CUnsignedLongInt): Unit = !struct.at3 = value
      def shell : CString = struct._4
      def shell_=(value: CString): Unit = !struct.at4 = value
      def homedir : CString = struct._5
      def homedir_=(value: CString): Unit = !struct.at5 = value

  /**
  */
  opaque type uv_pipe_s = CArray[CChar, Nat.Digit3[Nat._2, Nat._8, Nat._0]]
  object uv_pipe_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_pipe_s] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._8, Nat._0]](Tag.Byte, Tag.Digit3[Nat._2, Nat._8, Nat._0](Tag.Nat2, Tag.Nat8, Tag.Nat0))
    def apply()(using Zone): Ptr[uv_pipe_s] = scala.scalanative.unsafe.alloc[uv_pipe_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_pipe_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, write_queue_size : size_t, alloc_cb : uv_alloc_cb, read_cb : uv_read_cb, connect_req : Ptr[uv_connect_t], shutdown_req : Ptr[uv_shutdown_t], io_watcher : uv__io_t, write_queue : uv__queue, write_completed_queue : uv__queue, connection_cb : uv_connection_cb, delayed_error : CInt, accepted_fd : CInt, queued_fds : Ptr[Byte], select : Ptr[Byte], ipc : CInt, pipe_fname : CString)(using Zone): Ptr[uv_pipe_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).write_queue_size = write_queue_size
      (!____ptr).alloc_cb = alloc_cb
      (!____ptr).read_cb = read_cb
      (!____ptr).connect_req = connect_req
      (!____ptr).shutdown_req = shutdown_req
      (!____ptr).io_watcher = io_watcher
      (!____ptr).write_queue = write_queue
      (!____ptr).write_completed_queue = write_completed_queue
      (!____ptr).connection_cb = connection_cb
      (!____ptr).delayed_error = delayed_error
      (!____ptr).accepted_fd = accepted_fd
      (!____ptr).queued_fds = queued_fds
      (!____ptr).select = select
      (!____ptr).ipc = ipc
      (!____ptr).pipe_fname = pipe_fname
      ____ptr
    extension (struct: uv_pipe_s)
      def data: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def data_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def loop: Ptr[uv_loop_t] = !struct.at(8).asInstanceOf[Ptr[Ptr[uv_loop_t]]]
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at(8).asInstanceOf[Ptr[Ptr[uv_loop_t]]] = value
      def `type`: uv_handle_type = !struct.at(16).asInstanceOf[Ptr[uv_handle_type]]
      def type_=(value: uv_handle_type): Unit = !struct.at(16).asInstanceOf[Ptr[uv_handle_type]] = value
      def close_cb: uv_close_cb = !struct.at(24).asInstanceOf[Ptr[uv_close_cb]]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at(24).asInstanceOf[Ptr[uv_close_cb]] = value
      def handle_queue: uv__queue = !struct.at(32).asInstanceOf[Ptr[uv__queue]]
      def handle_queue_=(value: uv__queue): Unit = !struct.at(32).asInstanceOf[Ptr[uv__queue]] = value
      def u: uv_pipe_s.Union0 = !struct.at(48).asInstanceOf[Ptr[uv_pipe_s.Union0]]
      def u_=(value: uv_pipe_s.Union0): Unit = !struct.at(48).asInstanceOf[Ptr[uv_pipe_s.Union0]] = value
      def next_closing: Ptr[uv_handle_t] = !struct.at(80).asInstanceOf[Ptr[Ptr[uv_handle_t]]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at(80).asInstanceOf[Ptr[Ptr[uv_handle_t]]] = value
      def flags: CUnsignedInt = !struct.at(88).asInstanceOf[Ptr[CUnsignedInt]]
      def flags_=(value: CUnsignedInt): Unit = !struct.at(88).asInstanceOf[Ptr[CUnsignedInt]] = value
      def write_queue_size: size_t = !struct.at(96).asInstanceOf[Ptr[size_t]]
      def write_queue_size_=(value: size_t): Unit = !struct.at(96).asInstanceOf[Ptr[size_t]] = value
      def alloc_cb: uv_alloc_cb = !struct.at(104).asInstanceOf[Ptr[uv_alloc_cb]]
      def alloc_cb_=(value: uv_alloc_cb): Unit = !struct.at(104).asInstanceOf[Ptr[uv_alloc_cb]] = value
      def read_cb: uv_read_cb = !struct.at(112).asInstanceOf[Ptr[uv_read_cb]]
      def read_cb_=(value: uv_read_cb): Unit = !struct.at(112).asInstanceOf[Ptr[uv_read_cb]] = value
      def connect_req: Ptr[uv_connect_t] = !struct.at(120).asInstanceOf[Ptr[Ptr[uv_connect_t]]]
      def connect_req_=(value: Ptr[uv_connect_t]): Unit = !struct.at(120).asInstanceOf[Ptr[Ptr[uv_connect_t]]] = value
      def shutdown_req: Ptr[uv_shutdown_t] = !struct.at(128).asInstanceOf[Ptr[Ptr[uv_shutdown_t]]]
      def shutdown_req_=(value: Ptr[uv_shutdown_t]): Unit = !struct.at(128).asInstanceOf[Ptr[Ptr[uv_shutdown_t]]] = value
      def io_watcher: uv__io_t = !struct.at(136).asInstanceOf[Ptr[uv__io_t]]
      def io_watcher_=(value: uv__io_t): Unit = !struct.at(136).asInstanceOf[Ptr[uv__io_t]] = value
      def write_queue: uv__queue = !struct.at(200).asInstanceOf[Ptr[uv__queue]]
      def write_queue_=(value: uv__queue): Unit = !struct.at(200).asInstanceOf[Ptr[uv__queue]] = value
      def write_completed_queue: uv__queue = !struct.at(216).asInstanceOf[Ptr[uv__queue]]
      def write_completed_queue_=(value: uv__queue): Unit = !struct.at(216).asInstanceOf[Ptr[uv__queue]] = value
      def connection_cb: uv_connection_cb = !struct.at(232).asInstanceOf[Ptr[uv_connection_cb]]
      def connection_cb_=(value: uv_connection_cb): Unit = !struct.at(232).asInstanceOf[Ptr[uv_connection_cb]] = value
      def delayed_error: CInt = !struct.at(240).asInstanceOf[Ptr[CInt]]
      def delayed_error_=(value: CInt): Unit = !struct.at(240).asInstanceOf[Ptr[CInt]] = value
      def accepted_fd: CInt = !struct.at(244).asInstanceOf[Ptr[CInt]]
      def accepted_fd_=(value: CInt): Unit = !struct.at(244).asInstanceOf[Ptr[CInt]] = value
      def queued_fds: Ptr[Byte] = !struct.at(248).asInstanceOf[Ptr[Ptr[Byte]]]
      def queued_fds_=(value: Ptr[Byte]): Unit = !struct.at(248).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def select: Ptr[Byte] = !struct.at(256).asInstanceOf[Ptr[Ptr[Byte]]]
      def select_=(value: Ptr[Byte]): Unit = !struct.at(256).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def ipc: CInt = !struct.at(264).asInstanceOf[Ptr[CInt]]
      def ipc_=(value: CInt): Unit = !struct.at(264).asInstanceOf[Ptr[CInt]] = value
      def pipe_fname: CString = !struct.at(272).asInstanceOf[Ptr[CString]]
      def pipe_fname_=(value: CString): Unit = !struct.at(272).asInstanceOf[Ptr[CString]] = value

  /**
  */
  opaque type uv_pipe_t = CArray[CChar, Nat.Digit3[Nat._2, Nat._8, Nat._0]]
  object uv_pipe_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_pipe_t] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._8, Nat._0]](Tag.Byte, Tag.Digit3[Nat._2, Nat._8, Nat._0](Tag.Nat2, Tag.Nat8, Tag.Nat0))
    def apply()(using Zone): Ptr[uv_pipe_t] = scala.scalanative.unsafe.alloc[uv_pipe_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_pipe_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, write_queue_size : size_t, alloc_cb : uv_alloc_cb, read_cb : uv_read_cb, connect_req : Ptr[uv_connect_t], shutdown_req : Ptr[uv_shutdown_t], io_watcher : uv__io_t, write_queue : uv__queue, write_completed_queue : uv__queue, connection_cb : uv_connection_cb, delayed_error : CInt, accepted_fd : CInt, queued_fds : Ptr[Byte], select : Ptr[Byte], ipc : CInt, pipe_fname : CString)(using Zone): Ptr[uv_pipe_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).write_queue_size = write_queue_size
      (!____ptr).alloc_cb = alloc_cb
      (!____ptr).read_cb = read_cb
      (!____ptr).connect_req = connect_req
      (!____ptr).shutdown_req = shutdown_req
      (!____ptr).io_watcher = io_watcher
      (!____ptr).write_queue = write_queue
      (!____ptr).write_completed_queue = write_completed_queue
      (!____ptr).connection_cb = connection_cb
      (!____ptr).delayed_error = delayed_error
      (!____ptr).accepted_fd = accepted_fd
      (!____ptr).queued_fds = queued_fds
      (!____ptr).select = select
      (!____ptr).ipc = ipc
      (!____ptr).pipe_fname = pipe_fname
      ____ptr
    extension (struct: uv_pipe_t)
      def data: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def data_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def loop: Ptr[uv_loop_t] = !struct.at(8).asInstanceOf[Ptr[Ptr[uv_loop_t]]]
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at(8).asInstanceOf[Ptr[Ptr[uv_loop_t]]] = value
      def `type`: uv_handle_type = !struct.at(16).asInstanceOf[Ptr[uv_handle_type]]
      def type_=(value: uv_handle_type): Unit = !struct.at(16).asInstanceOf[Ptr[uv_handle_type]] = value
      def close_cb: uv_close_cb = !struct.at(24).asInstanceOf[Ptr[uv_close_cb]]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at(24).asInstanceOf[Ptr[uv_close_cb]] = value
      def handle_queue: uv__queue = !struct.at(32).asInstanceOf[Ptr[uv__queue]]
      def handle_queue_=(value: uv__queue): Unit = !struct.at(32).asInstanceOf[Ptr[uv__queue]] = value
      def u: uv_pipe_t.Union0 = !struct.at(48).asInstanceOf[Ptr[uv_pipe_t.Union0]]
      def u_=(value: uv_pipe_t.Union0): Unit = !struct.at(48).asInstanceOf[Ptr[uv_pipe_t.Union0]] = value
      def next_closing: Ptr[uv_handle_t] = !struct.at(80).asInstanceOf[Ptr[Ptr[uv_handle_t]]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at(80).asInstanceOf[Ptr[Ptr[uv_handle_t]]] = value
      def flags: CUnsignedInt = !struct.at(88).asInstanceOf[Ptr[CUnsignedInt]]
      def flags_=(value: CUnsignedInt): Unit = !struct.at(88).asInstanceOf[Ptr[CUnsignedInt]] = value
      def write_queue_size: size_t = !struct.at(96).asInstanceOf[Ptr[size_t]]
      def write_queue_size_=(value: size_t): Unit = !struct.at(96).asInstanceOf[Ptr[size_t]] = value
      def alloc_cb: uv_alloc_cb = !struct.at(104).asInstanceOf[Ptr[uv_alloc_cb]]
      def alloc_cb_=(value: uv_alloc_cb): Unit = !struct.at(104).asInstanceOf[Ptr[uv_alloc_cb]] = value
      def read_cb: uv_read_cb = !struct.at(112).asInstanceOf[Ptr[uv_read_cb]]
      def read_cb_=(value: uv_read_cb): Unit = !struct.at(112).asInstanceOf[Ptr[uv_read_cb]] = value
      def connect_req: Ptr[uv_connect_t] = !struct.at(120).asInstanceOf[Ptr[Ptr[uv_connect_t]]]
      def connect_req_=(value: Ptr[uv_connect_t]): Unit = !struct.at(120).asInstanceOf[Ptr[Ptr[uv_connect_t]]] = value
      def shutdown_req: Ptr[uv_shutdown_t] = !struct.at(128).asInstanceOf[Ptr[Ptr[uv_shutdown_t]]]
      def shutdown_req_=(value: Ptr[uv_shutdown_t]): Unit = !struct.at(128).asInstanceOf[Ptr[Ptr[uv_shutdown_t]]] = value
      def io_watcher: uv__io_t = !struct.at(136).asInstanceOf[Ptr[uv__io_t]]
      def io_watcher_=(value: uv__io_t): Unit = !struct.at(136).asInstanceOf[Ptr[uv__io_t]] = value
      def write_queue: uv__queue = !struct.at(200).asInstanceOf[Ptr[uv__queue]]
      def write_queue_=(value: uv__queue): Unit = !struct.at(200).asInstanceOf[Ptr[uv__queue]] = value
      def write_completed_queue: uv__queue = !struct.at(216).asInstanceOf[Ptr[uv__queue]]
      def write_completed_queue_=(value: uv__queue): Unit = !struct.at(216).asInstanceOf[Ptr[uv__queue]] = value
      def connection_cb: uv_connection_cb = !struct.at(232).asInstanceOf[Ptr[uv_connection_cb]]
      def connection_cb_=(value: uv_connection_cb): Unit = !struct.at(232).asInstanceOf[Ptr[uv_connection_cb]] = value
      def delayed_error: CInt = !struct.at(240).asInstanceOf[Ptr[CInt]]
      def delayed_error_=(value: CInt): Unit = !struct.at(240).asInstanceOf[Ptr[CInt]] = value
      def accepted_fd: CInt = !struct.at(244).asInstanceOf[Ptr[CInt]]
      def accepted_fd_=(value: CInt): Unit = !struct.at(244).asInstanceOf[Ptr[CInt]] = value
      def queued_fds: Ptr[Byte] = !struct.at(248).asInstanceOf[Ptr[Ptr[Byte]]]
      def queued_fds_=(value: Ptr[Byte]): Unit = !struct.at(248).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def select: Ptr[Byte] = !struct.at(256).asInstanceOf[Ptr[Ptr[Byte]]]
      def select_=(value: Ptr[Byte]): Unit = !struct.at(256).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def ipc: CInt = !struct.at(264).asInstanceOf[Ptr[CInt]]
      def ipc_=(value: CInt): Unit = !struct.at(264).asInstanceOf[Ptr[CInt]] = value
      def pipe_fname: CString = !struct.at(272).asInstanceOf[Ptr[CString]]
      def pipe_fname_=(value: CString): Unit = !struct.at(272).asInstanceOf[Ptr[CString]] = value

  /**
  */
  opaque type uv_poll_s = CStruct10[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_poll_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__io_t]
  object uv_poll_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_poll_s] = Tag.materializeCStruct10Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_poll_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__io_t]
    def apply()(using Zone): Ptr[uv_poll_s] = scala.scalanative.unsafe.alloc[uv_poll_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_poll_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, poll_cb : uv_poll_cb, io_watcher : uv__io_t)(using Zone): Ptr[uv_poll_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).poll_cb = poll_cb
      (!____ptr).io_watcher = io_watcher
      ____ptr
    extension (struct: uv_poll_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_poll_s.Union0 = struct._6
      def u_=(value: uv_poll_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def poll_cb : uv_poll_cb = struct._9.asInstanceOf[uv_poll_cb]
      def poll_cb_=(value: uv_poll_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def io_watcher : uv__io_t = struct._10
      def io_watcher_=(value: uv__io_t): Unit = !struct.at10 = value

  /**
  */
  opaque type uv_poll_t = CStruct10[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_poll_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__io_t]
  object uv_poll_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_poll_t] = Tag.materializeCStruct10Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_poll_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__io_t]
    def apply()(using Zone): Ptr[uv_poll_t] = scala.scalanative.unsafe.alloc[uv_poll_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_poll_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, poll_cb : uv_poll_cb, io_watcher : uv__io_t)(using Zone): Ptr[uv_poll_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).poll_cb = poll_cb
      (!____ptr).io_watcher = io_watcher
      ____ptr
    extension (struct: uv_poll_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_poll_t.Union0 = struct._6
      def u_=(value: uv_poll_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def poll_cb : uv_poll_cb = struct._9.asInstanceOf[uv_poll_cb]
      def poll_cb_=(value: uv_poll_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def io_watcher : uv__io_t = struct._10
      def io_watcher_=(value: uv__io_t): Unit = !struct.at10 = value

  /**
  */
  opaque type uv_prepare_s = CStruct10[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_prepare_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
  object uv_prepare_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_prepare_s] = Tag.materializeCStruct10Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_prepare_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
    def apply()(using Zone): Ptr[uv_prepare_s] = scala.scalanative.unsafe.alloc[uv_prepare_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_prepare_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, prepare_cb : uv_prepare_cb, queue : uv__queue)(using Zone): Ptr[uv_prepare_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).prepare_cb = prepare_cb
      (!____ptr).queue = queue
      ____ptr
    extension (struct: uv_prepare_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_prepare_s.Union0 = struct._6
      def u_=(value: uv_prepare_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def prepare_cb : uv_prepare_cb = struct._9.asInstanceOf[uv_prepare_cb]
      def prepare_cb_=(value: uv_prepare_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._10
      def queue_=(value: uv__queue): Unit = !struct.at10 = value

  /**
  */
  opaque type uv_prepare_t = CStruct10[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_prepare_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
  object uv_prepare_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_prepare_t] = Tag.materializeCStruct10Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_prepare_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], uv__queue]
    def apply()(using Zone): Ptr[uv_prepare_t] = scala.scalanative.unsafe.alloc[uv_prepare_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_prepare_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, prepare_cb : uv_prepare_cb, queue : uv__queue)(using Zone): Ptr[uv_prepare_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).prepare_cb = prepare_cb
      (!____ptr).queue = queue
      ____ptr
    extension (struct: uv_prepare_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_prepare_t.Union0 = struct._6
      def u_=(value: uv_prepare_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def prepare_cb : uv_prepare_cb = struct._9.asInstanceOf[uv_prepare_cb]
      def prepare_cb_=(value: uv_prepare_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._10
      def queue_=(value: uv__queue): Unit = !struct.at10 = value

  /**
  */
  opaque type uv_process_options_s = CStruct10[Ptr[Byte], CString, Ptr[CString], Ptr[CString], CString, CUnsignedInt, CInt, Ptr[uv_stdio_container_t], uv_uid_t, uv_gid_t]
  object uv_process_options_s:
    given _tag: Tag[uv_process_options_s] = Tag.materializeCStruct10Tag[Ptr[Byte], CString, Ptr[CString], Ptr[CString], CString, CUnsignedInt, CInt, Ptr[uv_stdio_container_t], uv_uid_t, uv_gid_t]
    def apply()(using Zone): Ptr[uv_process_options_s] = scala.scalanative.unsafe.alloc[uv_process_options_s](1)
    def apply(exit_cb : uv_exit_cb, file : CString, args : Ptr[CString], env : Ptr[CString], cwd : CString, flags : CUnsignedInt, stdio_count : CInt, stdio : Ptr[uv_stdio_container_t], uid : uv_uid_t, gid : uv_gid_t)(using Zone): Ptr[uv_process_options_s] = 
      val ____ptr = apply()
      (!____ptr).exit_cb = exit_cb
      (!____ptr).file = file
      (!____ptr).args = args
      (!____ptr).env = env
      (!____ptr).cwd = cwd
      (!____ptr).flags = flags
      (!____ptr).stdio_count = stdio_count
      (!____ptr).stdio = stdio
      (!____ptr).uid = uid
      (!____ptr).gid = gid
      ____ptr
    extension (struct: uv_process_options_s)
      def exit_cb : uv_exit_cb = struct._1.asInstanceOf[uv_exit_cb]
      def exit_cb_=(value: uv_exit_cb): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def file : CString = struct._2
      def file_=(value: CString): Unit = !struct.at2 = value
      def args : Ptr[CString] = struct._3
      def args_=(value: Ptr[CString]): Unit = !struct.at3 = value
      def env : Ptr[CString] = struct._4
      def env_=(value: Ptr[CString]): Unit = !struct.at4 = value
      def cwd : CString = struct._5
      def cwd_=(value: CString): Unit = !struct.at5 = value
      def flags : CUnsignedInt = struct._6
      def flags_=(value: CUnsignedInt): Unit = !struct.at6 = value
      def stdio_count : CInt = struct._7
      def stdio_count_=(value: CInt): Unit = !struct.at7 = value
      def stdio : Ptr[uv_stdio_container_t] = struct._8
      def stdio_=(value: Ptr[uv_stdio_container_t]): Unit = !struct.at8 = value
      def uid : uv_uid_t = struct._9
      def uid_=(value: uv_uid_t): Unit = !struct.at9 = value
      def gid : uv_gid_t = struct._10
      def gid_=(value: uv_gid_t): Unit = !struct.at10 = value

  /**
  */
  opaque type uv_process_options_t = CStruct10[Ptr[Byte], CString, Ptr[CString], Ptr[CString], CString, CUnsignedInt, CInt, Ptr[uv_stdio_container_t], uv_uid_t, uv_gid_t]
  object uv_process_options_t:
    given _tag: Tag[uv_process_options_t] = Tag.materializeCStruct10Tag[Ptr[Byte], CString, Ptr[CString], Ptr[CString], CString, CUnsignedInt, CInt, Ptr[uv_stdio_container_t], uv_uid_t, uv_gid_t]
    def apply()(using Zone): Ptr[uv_process_options_t] = scala.scalanative.unsafe.alloc[uv_process_options_t](1)
    def apply(exit_cb : uv_exit_cb, file : CString, args : Ptr[CString], env : Ptr[CString], cwd : CString, flags : CUnsignedInt, stdio_count : CInt, stdio : Ptr[uv_stdio_container_t], uid : uv_uid_t, gid : uv_gid_t)(using Zone): Ptr[uv_process_options_t] = 
      val ____ptr = apply()
      (!____ptr).exit_cb = exit_cb
      (!____ptr).file = file
      (!____ptr).args = args
      (!____ptr).env = env
      (!____ptr).cwd = cwd
      (!____ptr).flags = flags
      (!____ptr).stdio_count = stdio_count
      (!____ptr).stdio = stdio
      (!____ptr).uid = uid
      (!____ptr).gid = gid
      ____ptr
    extension (struct: uv_process_options_t)
      def exit_cb : uv_exit_cb = struct._1.asInstanceOf[uv_exit_cb]
      def exit_cb_=(value: uv_exit_cb): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def file : CString = struct._2
      def file_=(value: CString): Unit = !struct.at2 = value
      def args : Ptr[CString] = struct._3
      def args_=(value: Ptr[CString]): Unit = !struct.at3 = value
      def env : Ptr[CString] = struct._4
      def env_=(value: Ptr[CString]): Unit = !struct.at4 = value
      def cwd : CString = struct._5
      def cwd_=(value: CString): Unit = !struct.at5 = value
      def flags : CUnsignedInt = struct._6
      def flags_=(value: CUnsignedInt): Unit = !struct.at6 = value
      def stdio_count : CInt = struct._7
      def stdio_count_=(value: CInt): Unit = !struct.at7 = value
      def stdio : Ptr[uv_stdio_container_t] = struct._8
      def stdio_=(value: Ptr[uv_stdio_container_t]): Unit = !struct.at8 = value
      def uid : uv_uid_t = struct._9
      def uid_=(value: uv_uid_t): Unit = !struct.at9 = value
      def gid : uv_gid_t = struct._10
      def gid_=(value: uv_gid_t): Unit = !struct.at10 = value

  /**
  */
  opaque type uv_process_s = CStruct12[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_process_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CInt, uv__queue, CInt]
  object uv_process_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_process_s] = Tag.materializeCStruct12Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_process_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CInt, uv__queue, CInt]
    def apply()(using Zone): Ptr[uv_process_s] = scala.scalanative.unsafe.alloc[uv_process_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_process_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, exit_cb : uv_exit_cb, pid : CInt, queue : uv__queue, status : CInt)(using Zone): Ptr[uv_process_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).exit_cb = exit_cb
      (!____ptr).pid = pid
      (!____ptr).queue = queue
      (!____ptr).status = status
      ____ptr
    extension (struct: uv_process_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_process_s.Union0 = struct._6
      def u_=(value: uv_process_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def exit_cb : uv_exit_cb = struct._9.asInstanceOf[uv_exit_cb]
      def exit_cb_=(value: uv_exit_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def pid : CInt = struct._10
      def pid_=(value: CInt): Unit = !struct.at10 = value
      def queue : uv__queue = struct._11
      def queue_=(value: uv__queue): Unit = !struct.at11 = value
      def status : CInt = struct._12
      def status_=(value: CInt): Unit = !struct.at12 = value

  /**
  */
  opaque type uv_process_t = CStruct12[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_process_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CInt, uv__queue, CInt]
  object uv_process_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_process_t] = Tag.materializeCStruct12Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_process_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CInt, uv__queue, CInt]
    def apply()(using Zone): Ptr[uv_process_t] = scala.scalanative.unsafe.alloc[uv_process_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_process_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, exit_cb : uv_exit_cb, pid : CInt, queue : uv__queue, status : CInt)(using Zone): Ptr[uv_process_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).exit_cb = exit_cb
      (!____ptr).pid = pid
      (!____ptr).queue = queue
      (!____ptr).status = status
      ____ptr
    extension (struct: uv_process_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_process_t.Union0 = struct._6
      def u_=(value: uv_process_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def exit_cb : uv_exit_cb = struct._9.asInstanceOf[uv_exit_cb]
      def exit_cb_=(value: uv_exit_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def pid : CInt = struct._10
      def pid_=(value: CInt): Unit = !struct.at10 = value
      def queue : uv__queue = struct._11
      def queue_=(value: uv__queue): Unit = !struct.at11 = value
      def status : CInt = struct._12
      def status_=(value: CInt): Unit = !struct.at12 = value

  /**
  */
  opaque type uv_random_s = CStruct9[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], CInt, Ptr[Byte], size_t, Ptr[Byte], uv__work]
  object uv_random_s:
    given _tag: Tag[uv_random_s] = Tag.materializeCStruct9Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], CInt, Ptr[Byte], size_t, Ptr[Byte], uv__work]
    def apply()(using Zone): Ptr[uv_random_s] = scala.scalanative.unsafe.alloc[uv_random_s](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], loop : Ptr[uv_loop_t], status : CInt, buf : Ptr[Byte], buflen : size_t, cb : uv_random_cb, work_req : uv__work)(using Zone): Ptr[uv_random_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).loop = loop
      (!____ptr).status = status
      (!____ptr).buf = buf
      (!____ptr).buflen = buflen
      (!____ptr).cb = cb
      (!____ptr).work_req = work_req
      ____ptr
    extension (struct: uv_random_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def loop : Ptr[uv_loop_t] = struct._4
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at4 = value
      def status : CInt = struct._5
      def status_=(value: CInt): Unit = !struct.at5 = value
      def buf : Ptr[Byte] = struct._6
      def buf_=(value: Ptr[Byte]): Unit = !struct.at6 = value
      def buflen : size_t = struct._7
      def buflen_=(value: size_t): Unit = !struct.at7 = value
      def cb : uv_random_cb = struct._8.asInstanceOf[uv_random_cb]
      def cb_=(value: uv_random_cb): Unit = !struct.at8 = value.asInstanceOf[Ptr[Byte]]
      def work_req : uv__work = struct._9
      def work_req_=(value: uv__work): Unit = !struct.at9 = value

  /**
  */
  opaque type uv_random_t = CStruct9[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], CInt, Ptr[Byte], size_t, Ptr[Byte], uv__work]
  object uv_random_t:
    given _tag: Tag[uv_random_t] = Tag.materializeCStruct9Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], CInt, Ptr[Byte], size_t, Ptr[Byte], uv__work]
    def apply()(using Zone): Ptr[uv_random_t] = scala.scalanative.unsafe.alloc[uv_random_t](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], loop : Ptr[uv_loop_t], status : CInt, buf : Ptr[Byte], buflen : size_t, cb : uv_random_cb, work_req : uv__work)(using Zone): Ptr[uv_random_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).loop = loop
      (!____ptr).status = status
      (!____ptr).buf = buf
      (!____ptr).buflen = buflen
      (!____ptr).cb = cb
      (!____ptr).work_req = work_req
      ____ptr
    extension (struct: uv_random_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def loop : Ptr[uv_loop_t] = struct._4
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at4 = value
      def status : CInt = struct._5
      def status_=(value: CInt): Unit = !struct.at5 = value
      def buf : Ptr[Byte] = struct._6
      def buf_=(value: Ptr[Byte]): Unit = !struct.at6 = value
      def buflen : size_t = struct._7
      def buflen_=(value: size_t): Unit = !struct.at7 = value
      def cb : uv_random_cb = struct._8.asInstanceOf[uv_random_cb]
      def cb_=(value: uv_random_cb): Unit = !struct.at8 = value.asInstanceOf[Ptr[Byte]]
      def work_req : uv__work = struct._9
      def work_req_=(value: uv__work): Unit = !struct.at9 = value

  /**
  */
  opaque type uv_req_s = CStruct3[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6]]
  object uv_req_s:
    given _tag: Tag[uv_req_s] = Tag.materializeCStruct3Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6]]
    def apply()(using Zone): Ptr[uv_req_s] = scala.scalanative.unsafe.alloc[uv_req_s](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6])(using Zone): Ptr[uv_req_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      ____ptr
    extension (struct: uv_req_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value

  /**
  */
  opaque type uv_req_t = CStruct3[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6]]
  object uv_req_t:
    given _tag: Tag[uv_req_t] = Tag.materializeCStruct3Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6]]
    def apply()(using Zone): Ptr[uv_req_t] = scala.scalanative.unsafe.alloc[uv_req_t](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6])(using Zone): Ptr[uv_req_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      ____ptr
    extension (struct: uv_req_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value

  /**
  */
  opaque type uv_rusage_t = CStruct16[uv_timeval_t, uv_timeval_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t]
  object uv_rusage_t:
    given _tag: Tag[uv_rusage_t] = Tag.materializeCStruct16Tag[uv_timeval_t, uv_timeval_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t]
    def apply()(using Zone): Ptr[uv_rusage_t] = scala.scalanative.unsafe.alloc[uv_rusage_t](1)
    def apply(ru_utime : uv_timeval_t, ru_stime : uv_timeval_t, ru_maxrss : uint64_t, ru_ixrss : uint64_t, ru_idrss : uint64_t, ru_isrss : uint64_t, ru_minflt : uint64_t, ru_majflt : uint64_t, ru_nswap : uint64_t, ru_inblock : uint64_t, ru_oublock : uint64_t, ru_msgsnd : uint64_t, ru_msgrcv : uint64_t, ru_nsignals : uint64_t, ru_nvcsw : uint64_t, ru_nivcsw : uint64_t)(using Zone): Ptr[uv_rusage_t] = 
      val ____ptr = apply()
      (!____ptr).ru_utime = ru_utime
      (!____ptr).ru_stime = ru_stime
      (!____ptr).ru_maxrss = ru_maxrss
      (!____ptr).ru_ixrss = ru_ixrss
      (!____ptr).ru_idrss = ru_idrss
      (!____ptr).ru_isrss = ru_isrss
      (!____ptr).ru_minflt = ru_minflt
      (!____ptr).ru_majflt = ru_majflt
      (!____ptr).ru_nswap = ru_nswap
      (!____ptr).ru_inblock = ru_inblock
      (!____ptr).ru_oublock = ru_oublock
      (!____ptr).ru_msgsnd = ru_msgsnd
      (!____ptr).ru_msgrcv = ru_msgrcv
      (!____ptr).ru_nsignals = ru_nsignals
      (!____ptr).ru_nvcsw = ru_nvcsw
      (!____ptr).ru_nivcsw = ru_nivcsw
      ____ptr
    extension (struct: uv_rusage_t)
      def ru_utime : uv_timeval_t = struct._1
      def ru_utime_=(value: uv_timeval_t): Unit = !struct.at1 = value
      def ru_stime : uv_timeval_t = struct._2
      def ru_stime_=(value: uv_timeval_t): Unit = !struct.at2 = value
      def ru_maxrss : uint64_t = struct._3
      def ru_maxrss_=(value: uint64_t): Unit = !struct.at3 = value
      def ru_ixrss : uint64_t = struct._4
      def ru_ixrss_=(value: uint64_t): Unit = !struct.at4 = value
      def ru_idrss : uint64_t = struct._5
      def ru_idrss_=(value: uint64_t): Unit = !struct.at5 = value
      def ru_isrss : uint64_t = struct._6
      def ru_isrss_=(value: uint64_t): Unit = !struct.at6 = value
      def ru_minflt : uint64_t = struct._7
      def ru_minflt_=(value: uint64_t): Unit = !struct.at7 = value
      def ru_majflt : uint64_t = struct._8
      def ru_majflt_=(value: uint64_t): Unit = !struct.at8 = value
      def ru_nswap : uint64_t = struct._9
      def ru_nswap_=(value: uint64_t): Unit = !struct.at9 = value
      def ru_inblock : uint64_t = struct._10
      def ru_inblock_=(value: uint64_t): Unit = !struct.at10 = value
      def ru_oublock : uint64_t = struct._11
      def ru_oublock_=(value: uint64_t): Unit = !struct.at11 = value
      def ru_msgsnd : uint64_t = struct._12
      def ru_msgsnd_=(value: uint64_t): Unit = !struct.at12 = value
      def ru_msgrcv : uint64_t = struct._13
      def ru_msgrcv_=(value: uint64_t): Unit = !struct.at13 = value
      def ru_nsignals : uint64_t = struct._14
      def ru_nsignals_=(value: uint64_t): Unit = !struct.at14 = value
      def ru_nvcsw : uint64_t = struct._15
      def ru_nvcsw_=(value: uint64_t): Unit = !struct.at15 = value
      def ru_nivcsw : uint64_t = struct._16
      def ru_nivcsw_=(value: uint64_t): Unit = !struct.at16 = value

  /**
  */
  opaque type uv_shutdown_s = CStruct5[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte]]
  object uv_shutdown_s:
    given _tag: Tag[uv_shutdown_s] = Tag.materializeCStruct5Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[uv_shutdown_s] = scala.scalanative.unsafe.alloc[uv_shutdown_s](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], handle : Ptr[uv_stream_t], cb : uv_shutdown_cb)(using Zone): Ptr[uv_shutdown_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).handle = handle
      (!____ptr).cb = cb
      ____ptr
    extension (struct: uv_shutdown_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def handle : Ptr[uv_stream_t] = struct._4.asInstanceOf[Ptr[uv_stream_t]]
      def handle_=(value: Ptr[uv_stream_t]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def cb : uv_shutdown_cb = struct._5.asInstanceOf[uv_shutdown_cb]
      def cb_=(value: uv_shutdown_cb): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]

  /**
  */
  opaque type uv_shutdown_t = CStruct5[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte]]
  object uv_shutdown_t:
    given _tag: Tag[uv_shutdown_t] = Tag.materializeCStruct5Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[uv_shutdown_t] = scala.scalanative.unsafe.alloc[uv_shutdown_t](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], handle : Ptr[uv_stream_t], cb : uv_shutdown_cb)(using Zone): Ptr[uv_shutdown_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).handle = handle
      (!____ptr).cb = cb
      ____ptr
    extension (struct: uv_shutdown_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def handle : Ptr[uv_stream_t] = struct._4.asInstanceOf[Ptr[uv_stream_t]]
      def handle_=(value: Ptr[uv_stream_t]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def cb : uv_shutdown_cb = struct._5.asInstanceOf[uv_shutdown_cb]
      def cb_=(value: uv_shutdown_cb): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]

  /**
  */
  opaque type uv_signal_s = CStruct13[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_signal_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CInt, uv_signal_s.Struct1, CUnsignedInt, CUnsignedInt]
  object uv_signal_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    /**
    */
    opaque type Struct1 = CStruct4[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt]
    object Struct1:
      given _tag: Tag[Struct1] = Tag.materializeCStruct4Tag[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt]
      def apply()(using Zone): Ptr[Struct1] = scala.scalanative.unsafe.alloc[Struct1](1)
      def apply(rbe_left : Ptr[uv_signal_s], rbe_right : Ptr[uv_signal_s], rbe_parent : Ptr[uv_signal_s], rbe_color : CInt)(using Zone): Ptr[Struct1] = 
        val ____ptr = apply()
        (!____ptr).rbe_left = rbe_left
        (!____ptr).rbe_right = rbe_right
        (!____ptr).rbe_parent = rbe_parent
        (!____ptr).rbe_color = rbe_color
        ____ptr
      extension (struct: Struct1)
        def rbe_left : Ptr[uv_signal_s] = struct._1.asInstanceOf[Ptr[uv_signal_s]]
        def rbe_left_=(value: Ptr[uv_signal_s]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
        def rbe_right : Ptr[uv_signal_s] = struct._2.asInstanceOf[Ptr[uv_signal_s]]
        def rbe_right_=(value: Ptr[uv_signal_s]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
        def rbe_parent : Ptr[uv_signal_s] = struct._3.asInstanceOf[Ptr[uv_signal_s]]
        def rbe_parent_=(value: Ptr[uv_signal_s]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
        def rbe_color : CInt = struct._4
        def rbe_color_=(value: CInt): Unit = !struct.at4 = value
    given _tag: Tag[uv_signal_s] = Tag.materializeCStruct13Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_signal_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CInt, uv_signal_s.Struct1, CUnsignedInt, CUnsignedInt]
    def apply()(using Zone): Ptr[uv_signal_s] = scala.scalanative.unsafe.alloc[uv_signal_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_signal_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, signal_cb : uv_signal_cb, signum : CInt, tree_entry : uv_signal_s.Struct1, caught_signals : CUnsignedInt, dispatched_signals : CUnsignedInt)(using Zone): Ptr[uv_signal_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).signal_cb = signal_cb
      (!____ptr).signum = signum
      (!____ptr).tree_entry = tree_entry
      (!____ptr).caught_signals = caught_signals
      (!____ptr).dispatched_signals = dispatched_signals
      ____ptr
    extension (struct: uv_signal_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_signal_s.Union0 = struct._6
      def u_=(value: uv_signal_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def signal_cb : uv_signal_cb = struct._9.asInstanceOf[uv_signal_cb]
      def signal_cb_=(value: uv_signal_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def signum : CInt = struct._10
      def signum_=(value: CInt): Unit = !struct.at10 = value
      def tree_entry : uv_signal_s.Struct1 = struct._11
      def tree_entry_=(value: uv_signal_s.Struct1): Unit = !struct.at11 = value
      def caught_signals : CUnsignedInt = struct._12
      def caught_signals_=(value: CUnsignedInt): Unit = !struct.at12 = value
      def dispatched_signals : CUnsignedInt = struct._13
      def dispatched_signals_=(value: CUnsignedInt): Unit = !struct.at13 = value

  /**
  */
  opaque type uv_signal_t = CStruct13[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_signal_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CInt, uv_signal_t.Struct1, CUnsignedInt, CUnsignedInt]
  object uv_signal_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    /**
    */
    opaque type Struct1 = CStruct4[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt]
    object Struct1:
      given _tag: Tag[Struct1] = Tag.materializeCStruct4Tag[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt]
      def apply()(using Zone): Ptr[Struct1] = scala.scalanative.unsafe.alloc[Struct1](1)
      def apply(rbe_left : Ptr[uv_signal_s], rbe_right : Ptr[uv_signal_s], rbe_parent : Ptr[uv_signal_s], rbe_color : CInt)(using Zone): Ptr[Struct1] = 
        val ____ptr = apply()
        (!____ptr).rbe_left = rbe_left
        (!____ptr).rbe_right = rbe_right
        (!____ptr).rbe_parent = rbe_parent
        (!____ptr).rbe_color = rbe_color
        ____ptr
      extension (struct: Struct1)
        def rbe_left : Ptr[uv_signal_s] = struct._1.asInstanceOf[Ptr[uv_signal_s]]
        def rbe_left_=(value: Ptr[uv_signal_s]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
        def rbe_right : Ptr[uv_signal_s] = struct._2.asInstanceOf[Ptr[uv_signal_s]]
        def rbe_right_=(value: Ptr[uv_signal_s]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
        def rbe_parent : Ptr[uv_signal_s] = struct._3.asInstanceOf[Ptr[uv_signal_s]]
        def rbe_parent_=(value: Ptr[uv_signal_s]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
        def rbe_color : CInt = struct._4
        def rbe_color_=(value: CInt): Unit = !struct.at4 = value
    given _tag: Tag[uv_signal_t] = Tag.materializeCStruct13Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_signal_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CInt, uv_signal_t.Struct1, CUnsignedInt, CUnsignedInt]
    def apply()(using Zone): Ptr[uv_signal_t] = scala.scalanative.unsafe.alloc[uv_signal_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_signal_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, signal_cb : uv_signal_cb, signum : CInt, tree_entry : uv_signal_t.Struct1, caught_signals : CUnsignedInt, dispatched_signals : CUnsignedInt)(using Zone): Ptr[uv_signal_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).signal_cb = signal_cb
      (!____ptr).signum = signum
      (!____ptr).tree_entry = tree_entry
      (!____ptr).caught_signals = caught_signals
      (!____ptr).dispatched_signals = dispatched_signals
      ____ptr
    extension (struct: uv_signal_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_signal_t.Union0 = struct._6
      def u_=(value: uv_signal_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def signal_cb : uv_signal_cb = struct._9.asInstanceOf[uv_signal_cb]
      def signal_cb_=(value: uv_signal_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def signum : CInt = struct._10
      def signum_=(value: CInt): Unit = !struct.at10 = value
      def tree_entry : uv_signal_t.Struct1 = struct._11
      def tree_entry_=(value: uv_signal_t.Struct1): Unit = !struct.at11 = value
      def caught_signals : CUnsignedInt = struct._12
      def caught_signals_=(value: CUnsignedInt): Unit = !struct.at12 = value
      def dispatched_signals : CUnsignedInt = struct._13
      def dispatched_signals_=(value: CUnsignedInt): Unit = !struct.at13 = value

  /**
  */
  opaque type uv_stat_t = CStruct16[uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uv_timespec_t, uv_timespec_t, uv_timespec_t, uv_timespec_t]
  object uv_stat_t:
    given _tag: Tag[uv_stat_t] = Tag.materializeCStruct16Tag[uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uv_timespec_t, uv_timespec_t, uv_timespec_t, uv_timespec_t]
    def apply()(using Zone): Ptr[uv_stat_t] = scala.scalanative.unsafe.alloc[uv_stat_t](1)
    def apply(st_dev : uint64_t, st_mode : uint64_t, st_nlink : uint64_t, st_uid : uint64_t, st_gid : uint64_t, st_rdev : uint64_t, st_ino : uint64_t, st_size : uint64_t, st_blksize : uint64_t, st_blocks : uint64_t, st_flags : uint64_t, st_gen : uint64_t, st_atim : uv_timespec_t, st_mtim : uv_timespec_t, st_ctim : uv_timespec_t, st_birthtim : uv_timespec_t)(using Zone): Ptr[uv_stat_t] = 
      val ____ptr = apply()
      (!____ptr).st_dev = st_dev
      (!____ptr).st_mode = st_mode
      (!____ptr).st_nlink = st_nlink
      (!____ptr).st_uid = st_uid
      (!____ptr).st_gid = st_gid
      (!____ptr).st_rdev = st_rdev
      (!____ptr).st_ino = st_ino
      (!____ptr).st_size = st_size
      (!____ptr).st_blksize = st_blksize
      (!____ptr).st_blocks = st_blocks
      (!____ptr).st_flags = st_flags
      (!____ptr).st_gen = st_gen
      (!____ptr).st_atim = st_atim
      (!____ptr).st_mtim = st_mtim
      (!____ptr).st_ctim = st_ctim
      (!____ptr).st_birthtim = st_birthtim
      ____ptr
    extension (struct: uv_stat_t)
      def st_dev : uint64_t = struct._1
      def st_dev_=(value: uint64_t): Unit = !struct.at1 = value
      def st_mode : uint64_t = struct._2
      def st_mode_=(value: uint64_t): Unit = !struct.at2 = value
      def st_nlink : uint64_t = struct._3
      def st_nlink_=(value: uint64_t): Unit = !struct.at3 = value
      def st_uid : uint64_t = struct._4
      def st_uid_=(value: uint64_t): Unit = !struct.at4 = value
      def st_gid : uint64_t = struct._5
      def st_gid_=(value: uint64_t): Unit = !struct.at5 = value
      def st_rdev : uint64_t = struct._6
      def st_rdev_=(value: uint64_t): Unit = !struct.at6 = value
      def st_ino : uint64_t = struct._7
      def st_ino_=(value: uint64_t): Unit = !struct.at7 = value
      def st_size : uint64_t = struct._8
      def st_size_=(value: uint64_t): Unit = !struct.at8 = value
      def st_blksize : uint64_t = struct._9
      def st_blksize_=(value: uint64_t): Unit = !struct.at9 = value
      def st_blocks : uint64_t = struct._10
      def st_blocks_=(value: uint64_t): Unit = !struct.at10 = value
      def st_flags : uint64_t = struct._11
      def st_flags_=(value: uint64_t): Unit = !struct.at11 = value
      def st_gen : uint64_t = struct._12
      def st_gen_=(value: uint64_t): Unit = !struct.at12 = value
      def st_atim : uv_timespec_t = struct._13
      def st_atim_=(value: uv_timespec_t): Unit = !struct.at13 = value
      def st_mtim : uv_timespec_t = struct._14
      def st_mtim_=(value: uv_timespec_t): Unit = !struct.at14 = value
      def st_ctim : uv_timespec_t = struct._15
      def st_ctim_=(value: uv_timespec_t): Unit = !struct.at15 = value
      def st_birthtim : uv_timespec_t = struct._16
      def st_birthtim_=(value: uv_timespec_t): Unit = !struct.at16 = value

  /**
  */
  opaque type uv_statfs_s = CStruct8[uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, CArray[uint64_t, Nat._4]]
  object uv_statfs_s:
    given _tag: Tag[uv_statfs_s] = Tag.materializeCStruct8Tag[uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, CArray[uint64_t, Nat._4]]
    def apply()(using Zone): Ptr[uv_statfs_s] = scala.scalanative.unsafe.alloc[uv_statfs_s](1)
    def apply(f_type : uint64_t, f_bsize : uint64_t, f_blocks : uint64_t, f_bfree : uint64_t, f_bavail : uint64_t, f_files : uint64_t, f_ffree : uint64_t, f_spare : CArray[uint64_t, Nat._4])(using Zone): Ptr[uv_statfs_s] = 
      val ____ptr = apply()
      (!____ptr).f_type = f_type
      (!____ptr).f_bsize = f_bsize
      (!____ptr).f_blocks = f_blocks
      (!____ptr).f_bfree = f_bfree
      (!____ptr).f_bavail = f_bavail
      (!____ptr).f_files = f_files
      (!____ptr).f_ffree = f_ffree
      (!____ptr).f_spare = f_spare
      ____ptr
    extension (struct: uv_statfs_s)
      def f_type : uint64_t = struct._1
      def f_type_=(value: uint64_t): Unit = !struct.at1 = value
      def f_bsize : uint64_t = struct._2
      def f_bsize_=(value: uint64_t): Unit = !struct.at2 = value
      def f_blocks : uint64_t = struct._3
      def f_blocks_=(value: uint64_t): Unit = !struct.at3 = value
      def f_bfree : uint64_t = struct._4
      def f_bfree_=(value: uint64_t): Unit = !struct.at4 = value
      def f_bavail : uint64_t = struct._5
      def f_bavail_=(value: uint64_t): Unit = !struct.at5 = value
      def f_files : uint64_t = struct._6
      def f_files_=(value: uint64_t): Unit = !struct.at6 = value
      def f_ffree : uint64_t = struct._7
      def f_ffree_=(value: uint64_t): Unit = !struct.at7 = value
      def f_spare : CArray[uint64_t, Nat._4] = struct._8
      def f_spare_=(value: CArray[uint64_t, Nat._4]): Unit = !struct.at8 = value

  /**
  */
  opaque type uv_statfs_t = CStruct8[uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, CArray[uint64_t, Nat._4]]
  object uv_statfs_t:
    given _tag: Tag[uv_statfs_t] = Tag.materializeCStruct8Tag[uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, uint64_t, CArray[uint64_t, Nat._4]]
    def apply()(using Zone): Ptr[uv_statfs_t] = scala.scalanative.unsafe.alloc[uv_statfs_t](1)
    def apply(f_type : uint64_t, f_bsize : uint64_t, f_blocks : uint64_t, f_bfree : uint64_t, f_bavail : uint64_t, f_files : uint64_t, f_ffree : uint64_t, f_spare : CArray[uint64_t, Nat._4])(using Zone): Ptr[uv_statfs_t] = 
      val ____ptr = apply()
      (!____ptr).f_type = f_type
      (!____ptr).f_bsize = f_bsize
      (!____ptr).f_blocks = f_blocks
      (!____ptr).f_bfree = f_bfree
      (!____ptr).f_bavail = f_bavail
      (!____ptr).f_files = f_files
      (!____ptr).f_ffree = f_ffree
      (!____ptr).f_spare = f_spare
      ____ptr
    extension (struct: uv_statfs_t)
      def f_type : uint64_t = struct._1
      def f_type_=(value: uint64_t): Unit = !struct.at1 = value
      def f_bsize : uint64_t = struct._2
      def f_bsize_=(value: uint64_t): Unit = !struct.at2 = value
      def f_blocks : uint64_t = struct._3
      def f_blocks_=(value: uint64_t): Unit = !struct.at3 = value
      def f_bfree : uint64_t = struct._4
      def f_bfree_=(value: uint64_t): Unit = !struct.at4 = value
      def f_bavail : uint64_t = struct._5
      def f_bavail_=(value: uint64_t): Unit = !struct.at5 = value
      def f_files : uint64_t = struct._6
      def f_files_=(value: uint64_t): Unit = !struct.at6 = value
      def f_ffree : uint64_t = struct._7
      def f_ffree_=(value: uint64_t): Unit = !struct.at7 = value
      def f_spare : CArray[uint64_t, Nat._4] = struct._8
      def f_spare_=(value: CArray[uint64_t, Nat._4]): Unit = !struct.at8 = value

  /**
  */
  opaque type uv_stdio_container_s = CStruct2[uv_stdio_flags, uv_stdio_container_s.Union0]
  object uv_stdio_container_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat._8]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_stream")
      def apply(stream: Ptr[uv_stream_t])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[uv_stream_t]]].update(0, stream)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      extension (struct: Union0)
        def stream : Ptr[uv_stream_t] = !struct.at(0).asInstanceOf[Ptr[Ptr[uv_stream_t]]]
        def stream_=(value: Ptr[uv_stream_t]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[uv_stream_t]]] = value
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    given _tag: Tag[uv_stdio_container_s] = Tag.materializeCStruct2Tag[uv_stdio_flags, uv_stdio_container_s.Union0]
    def apply()(using Zone): Ptr[uv_stdio_container_s] = scala.scalanative.unsafe.alloc[uv_stdio_container_s](1)
    def apply(flags : uv_stdio_flags, data : uv_stdio_container_s.Union0)(using Zone): Ptr[uv_stdio_container_s] = 
      val ____ptr = apply()
      (!____ptr).flags = flags
      (!____ptr).data = data
      ____ptr
    extension (struct: uv_stdio_container_s)
      def flags : uv_stdio_flags = struct._1
      def flags_=(value: uv_stdio_flags): Unit = !struct.at1 = value
      def data : uv_stdio_container_s.Union0 = struct._2
      def data_=(value: uv_stdio_container_s.Union0): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_stdio_container_t = CStruct2[uv_stdio_flags, uv_stdio_container_t.Union0]
  object uv_stdio_container_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat._8]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_stream")
      def apply(stream: Ptr[uv_stream_t])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[uv_stream_t]]].update(0, stream)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      extension (struct: Union0)
        def stream : Ptr[uv_stream_t] = !struct.at(0).asInstanceOf[Ptr[Ptr[uv_stream_t]]]
        def stream_=(value: Ptr[uv_stream_t]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[uv_stream_t]]] = value
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    given _tag: Tag[uv_stdio_container_t] = Tag.materializeCStruct2Tag[uv_stdio_flags, uv_stdio_container_t.Union0]
    def apply()(using Zone): Ptr[uv_stdio_container_t] = scala.scalanative.unsafe.alloc[uv_stdio_container_t](1)
    def apply(flags : uv_stdio_flags, data : uv_stdio_container_t.Union0)(using Zone): Ptr[uv_stdio_container_t] = 
      val ____ptr = apply()
      (!____ptr).flags = flags
      (!____ptr).data = data
      ____ptr
    extension (struct: uv_stdio_container_t)
      def flags : uv_stdio_flags = struct._1
      def flags_=(value: uv_stdio_flags): Unit = !struct.at1 = value
      def data : uv_stdio_container_t.Union0 = struct._2
      def data_=(value: uv_stdio_container_t.Union0): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_stream_s = CStruct21[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_stream_s.Union0, Ptr[Byte], CUnsignedInt, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue, Ptr[Byte], CInt, CInt, Ptr[Byte], Ptr[Byte]]
  object uv_stream_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_stream_s] = Tag.materializeCStruct21Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_stream_s.Union0, Ptr[Byte], CUnsignedInt, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue, Ptr[Byte], CInt, CInt, Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[uv_stream_s] = scala.scalanative.unsafe.alloc[uv_stream_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_stream_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, write_queue_size : size_t, alloc_cb : uv_alloc_cb, read_cb : uv_read_cb, connect_req : Ptr[uv_connect_t], shutdown_req : Ptr[uv_shutdown_t], io_watcher : uv__io_t, write_queue : uv__queue, write_completed_queue : uv__queue, connection_cb : uv_connection_cb, delayed_error : CInt, accepted_fd : CInt, queued_fds : Ptr[Byte], select : Ptr[Byte])(using Zone): Ptr[uv_stream_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).write_queue_size = write_queue_size
      (!____ptr).alloc_cb = alloc_cb
      (!____ptr).read_cb = read_cb
      (!____ptr).connect_req = connect_req
      (!____ptr).shutdown_req = shutdown_req
      (!____ptr).io_watcher = io_watcher
      (!____ptr).write_queue = write_queue
      (!____ptr).write_completed_queue = write_completed_queue
      (!____ptr).connection_cb = connection_cb
      (!____ptr).delayed_error = delayed_error
      (!____ptr).accepted_fd = accepted_fd
      (!____ptr).queued_fds = queued_fds
      (!____ptr).select = select
      ____ptr
    extension (struct: uv_stream_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_stream_s.Union0 = struct._6
      def u_=(value: uv_stream_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def write_queue_size : size_t = struct._9
      def write_queue_size_=(value: size_t): Unit = !struct.at9 = value
      def alloc_cb : uv_alloc_cb = struct._10.asInstanceOf[uv_alloc_cb]
      def alloc_cb_=(value: uv_alloc_cb): Unit = !struct.at10 = value.asInstanceOf[Ptr[Byte]]
      def read_cb : uv_read_cb = struct._11.asInstanceOf[uv_read_cb]
      def read_cb_=(value: uv_read_cb): Unit = !struct.at11 = value.asInstanceOf[Ptr[Byte]]
      def connect_req : Ptr[uv_connect_t] = struct._12.asInstanceOf[Ptr[uv_connect_t]]
      def connect_req_=(value: Ptr[uv_connect_t]): Unit = !struct.at12 = value.asInstanceOf[Ptr[Byte]]
      def shutdown_req : Ptr[uv_shutdown_t] = struct._13.asInstanceOf[Ptr[uv_shutdown_t]]
      def shutdown_req_=(value: Ptr[uv_shutdown_t]): Unit = !struct.at13 = value.asInstanceOf[Ptr[Byte]]
      def io_watcher : uv__io_t = struct._14
      def io_watcher_=(value: uv__io_t): Unit = !struct.at14 = value
      def write_queue : uv__queue = struct._15
      def write_queue_=(value: uv__queue): Unit = !struct.at15 = value
      def write_completed_queue : uv__queue = struct._16
      def write_completed_queue_=(value: uv__queue): Unit = !struct.at16 = value
      def connection_cb : uv_connection_cb = struct._17.asInstanceOf[uv_connection_cb]
      def connection_cb_=(value: uv_connection_cb): Unit = !struct.at17 = value.asInstanceOf[Ptr[Byte]]
      def delayed_error : CInt = struct._18
      def delayed_error_=(value: CInt): Unit = !struct.at18 = value
      def accepted_fd : CInt = struct._19
      def accepted_fd_=(value: CInt): Unit = !struct.at19 = value
      def queued_fds : Ptr[Byte] = struct._20
      def queued_fds_=(value: Ptr[Byte]): Unit = !struct.at20 = value
      def select : Ptr[Byte] = struct._21
      def select_=(value: Ptr[Byte]): Unit = !struct.at21 = value

  /**
  */
  opaque type uv_stream_t = CStruct21[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_stream_t.Union0, Ptr[Byte], CUnsignedInt, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue, Ptr[Byte], CInt, CInt, Ptr[Byte], Ptr[Byte]]
  object uv_stream_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_stream_t] = Tag.materializeCStruct21Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_stream_t.Union0, Ptr[Byte], CUnsignedInt, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue, Ptr[Byte], CInt, CInt, Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[uv_stream_t] = scala.scalanative.unsafe.alloc[uv_stream_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_stream_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, write_queue_size : size_t, alloc_cb : uv_alloc_cb, read_cb : uv_read_cb, connect_req : Ptr[uv_connect_t], shutdown_req : Ptr[uv_shutdown_t], io_watcher : uv__io_t, write_queue : uv__queue, write_completed_queue : uv__queue, connection_cb : uv_connection_cb, delayed_error : CInt, accepted_fd : CInt, queued_fds : Ptr[Byte], select : Ptr[Byte])(using Zone): Ptr[uv_stream_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).write_queue_size = write_queue_size
      (!____ptr).alloc_cb = alloc_cb
      (!____ptr).read_cb = read_cb
      (!____ptr).connect_req = connect_req
      (!____ptr).shutdown_req = shutdown_req
      (!____ptr).io_watcher = io_watcher
      (!____ptr).write_queue = write_queue
      (!____ptr).write_completed_queue = write_completed_queue
      (!____ptr).connection_cb = connection_cb
      (!____ptr).delayed_error = delayed_error
      (!____ptr).accepted_fd = accepted_fd
      (!____ptr).queued_fds = queued_fds
      (!____ptr).select = select
      ____ptr
    extension (struct: uv_stream_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_stream_t.Union0 = struct._6
      def u_=(value: uv_stream_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def write_queue_size : size_t = struct._9
      def write_queue_size_=(value: size_t): Unit = !struct.at9 = value
      def alloc_cb : uv_alloc_cb = struct._10.asInstanceOf[uv_alloc_cb]
      def alloc_cb_=(value: uv_alloc_cb): Unit = !struct.at10 = value.asInstanceOf[Ptr[Byte]]
      def read_cb : uv_read_cb = struct._11.asInstanceOf[uv_read_cb]
      def read_cb_=(value: uv_read_cb): Unit = !struct.at11 = value.asInstanceOf[Ptr[Byte]]
      def connect_req : Ptr[uv_connect_t] = struct._12.asInstanceOf[Ptr[uv_connect_t]]
      def connect_req_=(value: Ptr[uv_connect_t]): Unit = !struct.at12 = value.asInstanceOf[Ptr[Byte]]
      def shutdown_req : Ptr[uv_shutdown_t] = struct._13.asInstanceOf[Ptr[uv_shutdown_t]]
      def shutdown_req_=(value: Ptr[uv_shutdown_t]): Unit = !struct.at13 = value.asInstanceOf[Ptr[Byte]]
      def io_watcher : uv__io_t = struct._14
      def io_watcher_=(value: uv__io_t): Unit = !struct.at14 = value
      def write_queue : uv__queue = struct._15
      def write_queue_=(value: uv__queue): Unit = !struct.at15 = value
      def write_completed_queue : uv__queue = struct._16
      def write_completed_queue_=(value: uv__queue): Unit = !struct.at16 = value
      def connection_cb : uv_connection_cb = struct._17.asInstanceOf[uv_connection_cb]
      def connection_cb_=(value: uv_connection_cb): Unit = !struct.at17 = value.asInstanceOf[Ptr[Byte]]
      def delayed_error : CInt = struct._18
      def delayed_error_=(value: CInt): Unit = !struct.at18 = value
      def accepted_fd : CInt = struct._19
      def accepted_fd_=(value: CInt): Unit = !struct.at19 = value
      def queued_fds : Ptr[Byte] = struct._20
      def queued_fds_=(value: Ptr[Byte]): Unit = !struct.at20 = value
      def select : Ptr[Byte] = struct._21
      def select_=(value: Ptr[Byte]): Unit = !struct.at21 = value

  /**
  */
  opaque type uv_tcp_s = CStruct21[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_tcp_s.Union0, Ptr[Byte], CUnsignedInt, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue, Ptr[Byte], CInt, CInt, Ptr[Byte], Ptr[Byte]]
  object uv_tcp_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_tcp_s] = Tag.materializeCStruct21Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_tcp_s.Union0, Ptr[Byte], CUnsignedInt, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue, Ptr[Byte], CInt, CInt, Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[uv_tcp_s] = scala.scalanative.unsafe.alloc[uv_tcp_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_tcp_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, write_queue_size : size_t, alloc_cb : uv_alloc_cb, read_cb : uv_read_cb, connect_req : Ptr[uv_connect_t], shutdown_req : Ptr[uv_shutdown_t], io_watcher : uv__io_t, write_queue : uv__queue, write_completed_queue : uv__queue, connection_cb : uv_connection_cb, delayed_error : CInt, accepted_fd : CInt, queued_fds : Ptr[Byte], select : Ptr[Byte])(using Zone): Ptr[uv_tcp_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).write_queue_size = write_queue_size
      (!____ptr).alloc_cb = alloc_cb
      (!____ptr).read_cb = read_cb
      (!____ptr).connect_req = connect_req
      (!____ptr).shutdown_req = shutdown_req
      (!____ptr).io_watcher = io_watcher
      (!____ptr).write_queue = write_queue
      (!____ptr).write_completed_queue = write_completed_queue
      (!____ptr).connection_cb = connection_cb
      (!____ptr).delayed_error = delayed_error
      (!____ptr).accepted_fd = accepted_fd
      (!____ptr).queued_fds = queued_fds
      (!____ptr).select = select
      ____ptr
    extension (struct: uv_tcp_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_tcp_s.Union0 = struct._6
      def u_=(value: uv_tcp_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def write_queue_size : size_t = struct._9
      def write_queue_size_=(value: size_t): Unit = !struct.at9 = value
      def alloc_cb : uv_alloc_cb = struct._10.asInstanceOf[uv_alloc_cb]
      def alloc_cb_=(value: uv_alloc_cb): Unit = !struct.at10 = value.asInstanceOf[Ptr[Byte]]
      def read_cb : uv_read_cb = struct._11.asInstanceOf[uv_read_cb]
      def read_cb_=(value: uv_read_cb): Unit = !struct.at11 = value.asInstanceOf[Ptr[Byte]]
      def connect_req : Ptr[uv_connect_t] = struct._12.asInstanceOf[Ptr[uv_connect_t]]
      def connect_req_=(value: Ptr[uv_connect_t]): Unit = !struct.at12 = value.asInstanceOf[Ptr[Byte]]
      def shutdown_req : Ptr[uv_shutdown_t] = struct._13.asInstanceOf[Ptr[uv_shutdown_t]]
      def shutdown_req_=(value: Ptr[uv_shutdown_t]): Unit = !struct.at13 = value.asInstanceOf[Ptr[Byte]]
      def io_watcher : uv__io_t = struct._14
      def io_watcher_=(value: uv__io_t): Unit = !struct.at14 = value
      def write_queue : uv__queue = struct._15
      def write_queue_=(value: uv__queue): Unit = !struct.at15 = value
      def write_completed_queue : uv__queue = struct._16
      def write_completed_queue_=(value: uv__queue): Unit = !struct.at16 = value
      def connection_cb : uv_connection_cb = struct._17.asInstanceOf[uv_connection_cb]
      def connection_cb_=(value: uv_connection_cb): Unit = !struct.at17 = value.asInstanceOf[Ptr[Byte]]
      def delayed_error : CInt = struct._18
      def delayed_error_=(value: CInt): Unit = !struct.at18 = value
      def accepted_fd : CInt = struct._19
      def accepted_fd_=(value: CInt): Unit = !struct.at19 = value
      def queued_fds : Ptr[Byte] = struct._20
      def queued_fds_=(value: Ptr[Byte]): Unit = !struct.at20 = value
      def select : Ptr[Byte] = struct._21
      def select_=(value: Ptr[Byte]): Unit = !struct.at21 = value

  /**
  */
  opaque type uv_tcp_t = CStruct21[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_tcp_t.Union0, Ptr[Byte], CUnsignedInt, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue, Ptr[Byte], CInt, CInt, Ptr[Byte], Ptr[Byte]]
  object uv_tcp_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_tcp_t] = Tag.materializeCStruct21Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_tcp_t.Union0, Ptr[Byte], CUnsignedInt, size_t, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue, Ptr[Byte], CInt, CInt, Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[uv_tcp_t] = scala.scalanative.unsafe.alloc[uv_tcp_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_tcp_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, write_queue_size : size_t, alloc_cb : uv_alloc_cb, read_cb : uv_read_cb, connect_req : Ptr[uv_connect_t], shutdown_req : Ptr[uv_shutdown_t], io_watcher : uv__io_t, write_queue : uv__queue, write_completed_queue : uv__queue, connection_cb : uv_connection_cb, delayed_error : CInt, accepted_fd : CInt, queued_fds : Ptr[Byte], select : Ptr[Byte])(using Zone): Ptr[uv_tcp_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).write_queue_size = write_queue_size
      (!____ptr).alloc_cb = alloc_cb
      (!____ptr).read_cb = read_cb
      (!____ptr).connect_req = connect_req
      (!____ptr).shutdown_req = shutdown_req
      (!____ptr).io_watcher = io_watcher
      (!____ptr).write_queue = write_queue
      (!____ptr).write_completed_queue = write_completed_queue
      (!____ptr).connection_cb = connection_cb
      (!____ptr).delayed_error = delayed_error
      (!____ptr).accepted_fd = accepted_fd
      (!____ptr).queued_fds = queued_fds
      (!____ptr).select = select
      ____ptr
    extension (struct: uv_tcp_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_tcp_t.Union0 = struct._6
      def u_=(value: uv_tcp_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def write_queue_size : size_t = struct._9
      def write_queue_size_=(value: size_t): Unit = !struct.at9 = value
      def alloc_cb : uv_alloc_cb = struct._10.asInstanceOf[uv_alloc_cb]
      def alloc_cb_=(value: uv_alloc_cb): Unit = !struct.at10 = value.asInstanceOf[Ptr[Byte]]
      def read_cb : uv_read_cb = struct._11.asInstanceOf[uv_read_cb]
      def read_cb_=(value: uv_read_cb): Unit = !struct.at11 = value.asInstanceOf[Ptr[Byte]]
      def connect_req : Ptr[uv_connect_t] = struct._12.asInstanceOf[Ptr[uv_connect_t]]
      def connect_req_=(value: Ptr[uv_connect_t]): Unit = !struct.at12 = value.asInstanceOf[Ptr[Byte]]
      def shutdown_req : Ptr[uv_shutdown_t] = struct._13.asInstanceOf[Ptr[uv_shutdown_t]]
      def shutdown_req_=(value: Ptr[uv_shutdown_t]): Unit = !struct.at13 = value.asInstanceOf[Ptr[Byte]]
      def io_watcher : uv__io_t = struct._14
      def io_watcher_=(value: uv__io_t): Unit = !struct.at14 = value
      def write_queue : uv__queue = struct._15
      def write_queue_=(value: uv__queue): Unit = !struct.at15 = value
      def write_completed_queue : uv__queue = struct._16
      def write_completed_queue_=(value: uv__queue): Unit = !struct.at16 = value
      def connection_cb : uv_connection_cb = struct._17.asInstanceOf[uv_connection_cb]
      def connection_cb_=(value: uv_connection_cb): Unit = !struct.at17 = value.asInstanceOf[Ptr[Byte]]
      def delayed_error : CInt = struct._18
      def delayed_error_=(value: CInt): Unit = !struct.at18 = value
      def accepted_fd : CInt = struct._19
      def accepted_fd_=(value: CInt): Unit = !struct.at19 = value
      def queued_fds : Ptr[Byte] = struct._20
      def queued_fds_=(value: Ptr[Byte]): Unit = !struct.at20 = value
      def select : Ptr[Byte] = struct._21
      def select_=(value: Ptr[Byte]): Unit = !struct.at21 = value

  /**
  */
  opaque type uv_thread_options_s = CStruct2[CUnsignedInt, size_t]
  object uv_thread_options_s:
    given _tag: Tag[uv_thread_options_s] = Tag.materializeCStruct2Tag[CUnsignedInt, size_t]
    def apply()(using Zone): Ptr[uv_thread_options_s] = scala.scalanative.unsafe.alloc[uv_thread_options_s](1)
    def apply(flags : CUnsignedInt, stack_size : size_t)(using Zone): Ptr[uv_thread_options_s] = 
      val ____ptr = apply()
      (!____ptr).flags = flags
      (!____ptr).stack_size = stack_size
      ____ptr
    extension (struct: uv_thread_options_s)
      def flags : CUnsignedInt = struct._1
      def flags_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def stack_size : size_t = struct._2
      def stack_size_=(value: size_t): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_thread_options_t = CStruct2[CUnsignedInt, size_t]
  object uv_thread_options_t:
    given _tag: Tag[uv_thread_options_t] = Tag.materializeCStruct2Tag[CUnsignedInt, size_t]
    def apply()(using Zone): Ptr[uv_thread_options_t] = scala.scalanative.unsafe.alloc[uv_thread_options_t](1)
    def apply(flags : CUnsignedInt, stack_size : size_t)(using Zone): Ptr[uv_thread_options_t] = 
      val ____ptr = apply()
      (!____ptr).flags = flags
      (!____ptr).stack_size = stack_size
      ____ptr
    extension (struct: uv_thread_options_t)
      def flags : CUnsignedInt = struct._1
      def flags_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def stack_size : size_t = struct._2
      def stack_size_=(value: size_t): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_timer_s = CStruct13[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_timer_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CArray[Ptr[Byte], Nat._3], uint64_t, uint64_t, uint64_t]
  object uv_timer_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_timer_s] = Tag.materializeCStruct13Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_timer_s.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CArray[Ptr[Byte], Nat._3], uint64_t, uint64_t, uint64_t]
    def apply()(using Zone): Ptr[uv_timer_s] = scala.scalanative.unsafe.alloc[uv_timer_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_timer_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, timer_cb : uv_timer_cb, heap_node : CArray[Ptr[Byte], Nat._3], timeout : uint64_t, repeat : uint64_t, start_id : uint64_t)(using Zone): Ptr[uv_timer_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).timer_cb = timer_cb
      (!____ptr).heap_node = heap_node
      (!____ptr).timeout = timeout
      (!____ptr).repeat = repeat
      (!____ptr).start_id = start_id
      ____ptr
    extension (struct: uv_timer_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_timer_s.Union0 = struct._6
      def u_=(value: uv_timer_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def timer_cb : uv_timer_cb = struct._9.asInstanceOf[uv_timer_cb]
      def timer_cb_=(value: uv_timer_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def heap_node : CArray[Ptr[Byte], Nat._3] = struct._10
      def heap_node_=(value: CArray[Ptr[Byte], Nat._3]): Unit = !struct.at10 = value
      def timeout : uint64_t = struct._11
      def timeout_=(value: uint64_t): Unit = !struct.at11 = value
      def repeat : uint64_t = struct._12
      def repeat_=(value: uint64_t): Unit = !struct.at12 = value
      def start_id : uint64_t = struct._13
      def start_id_=(value: uint64_t): Unit = !struct.at13 = value

  /**
  */
  opaque type uv_timer_t = CStruct13[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_timer_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CArray[Ptr[Byte], Nat._3], uint64_t, uint64_t, uint64_t]
  object uv_timer_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_timer_t] = Tag.materializeCStruct13Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_timer_t.Union0, Ptr[Byte], CUnsignedInt, Ptr[Byte], CArray[Ptr[Byte], Nat._3], uint64_t, uint64_t, uint64_t]
    def apply()(using Zone): Ptr[uv_timer_t] = scala.scalanative.unsafe.alloc[uv_timer_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_timer_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, timer_cb : uv_timer_cb, heap_node : CArray[Ptr[Byte], Nat._3], timeout : uint64_t, repeat : uint64_t, start_id : uint64_t)(using Zone): Ptr[uv_timer_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).timer_cb = timer_cb
      (!____ptr).heap_node = heap_node
      (!____ptr).timeout = timeout
      (!____ptr).repeat = repeat
      (!____ptr).start_id = start_id
      ____ptr
    extension (struct: uv_timer_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_timer_t.Union0 = struct._6
      def u_=(value: uv_timer_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def timer_cb : uv_timer_cb = struct._9.asInstanceOf[uv_timer_cb]
      def timer_cb_=(value: uv_timer_cb): Unit = !struct.at9 = value.asInstanceOf[Ptr[Byte]]
      def heap_node : CArray[Ptr[Byte], Nat._3] = struct._10
      def heap_node_=(value: CArray[Ptr[Byte], Nat._3]): Unit = !struct.at10 = value
      def timeout : uint64_t = struct._11
      def timeout_=(value: uint64_t): Unit = !struct.at11 = value
      def repeat : uint64_t = struct._12
      def repeat_=(value: uint64_t): Unit = !struct.at12 = value
      def start_id : uint64_t = struct._13
      def start_id_=(value: uint64_t): Unit = !struct.at13 = value

  /**
  */
  opaque type uv_timespec64_t = CStruct2[int64_t, int32_t]
  object uv_timespec64_t:
    given _tag: Tag[uv_timespec64_t] = Tag.materializeCStruct2Tag[int64_t, int32_t]
    def apply()(using Zone): Ptr[uv_timespec64_t] = scala.scalanative.unsafe.alloc[uv_timespec64_t](1)
    def apply(tv_sec : int64_t, tv_nsec : int32_t)(using Zone): Ptr[uv_timespec64_t] = 
      val ____ptr = apply()
      (!____ptr).tv_sec = tv_sec
      (!____ptr).tv_nsec = tv_nsec
      ____ptr
    extension (struct: uv_timespec64_t)
      def tv_sec : int64_t = struct._1
      def tv_sec_=(value: int64_t): Unit = !struct.at1 = value
      def tv_nsec : int32_t = struct._2
      def tv_nsec_=(value: int32_t): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_timespec_t = CStruct2[CLongInt, CLongInt]
  object uv_timespec_t:
    given _tag: Tag[uv_timespec_t] = Tag.materializeCStruct2Tag[CLongInt, CLongInt]
    def apply()(using Zone): Ptr[uv_timespec_t] = scala.scalanative.unsafe.alloc[uv_timespec_t](1)
    def apply(tv_sec : CLongInt, tv_nsec : CLongInt)(using Zone): Ptr[uv_timespec_t] = 
      val ____ptr = apply()
      (!____ptr).tv_sec = tv_sec
      (!____ptr).tv_nsec = tv_nsec
      ____ptr
    extension (struct: uv_timespec_t)
      def tv_sec : CLongInt = struct._1
      def tv_sec_=(value: CLongInt): Unit = !struct.at1 = value
      def tv_nsec : CLongInt = struct._2
      def tv_nsec_=(value: CLongInt): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_timeval64_t = CStruct2[int64_t, int32_t]
  object uv_timeval64_t:
    given _tag: Tag[uv_timeval64_t] = Tag.materializeCStruct2Tag[int64_t, int32_t]
    def apply()(using Zone): Ptr[uv_timeval64_t] = scala.scalanative.unsafe.alloc[uv_timeval64_t](1)
    def apply(tv_sec : int64_t, tv_usec : int32_t)(using Zone): Ptr[uv_timeval64_t] = 
      val ____ptr = apply()
      (!____ptr).tv_sec = tv_sec
      (!____ptr).tv_usec = tv_usec
      ____ptr
    extension (struct: uv_timeval64_t)
      def tv_sec : int64_t = struct._1
      def tv_sec_=(value: int64_t): Unit = !struct.at1 = value
      def tv_usec : int32_t = struct._2
      def tv_usec_=(value: int32_t): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_timeval_t = CStruct2[CLongInt, CLongInt]
  object uv_timeval_t:
    given _tag: Tag[uv_timeval_t] = Tag.materializeCStruct2Tag[CLongInt, CLongInt]
    def apply()(using Zone): Ptr[uv_timeval_t] = scala.scalanative.unsafe.alloc[uv_timeval_t](1)
    def apply(tv_sec : CLongInt, tv_usec : CLongInt)(using Zone): Ptr[uv_timeval_t] = 
      val ____ptr = apply()
      (!____ptr).tv_sec = tv_sec
      (!____ptr).tv_usec = tv_usec
      ____ptr
    extension (struct: uv_timeval_t)
      def tv_sec : CLongInt = struct._1
      def tv_sec_=(value: CLongInt): Unit = !struct.at1 = value
      def tv_usec : CLongInt = struct._2
      def tv_usec_=(value: CLongInt): Unit = !struct.at2 = value

  /**
  */
  opaque type uv_tty_s = CArray[CChar, Nat.Digit3[Nat._3, Nat._4, Nat._4]]
  object uv_tty_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_tty_s] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._4, Nat._4]](Tag.Byte, Tag.Digit3[Nat._3, Nat._4, Nat._4](Tag.Nat3, Tag.Nat4, Tag.Nat4))
    def apply()(using Zone): Ptr[uv_tty_s] = scala.scalanative.unsafe.alloc[uv_tty_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_tty_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, write_queue_size : size_t, alloc_cb : uv_alloc_cb, read_cb : uv_read_cb, connect_req : Ptr[uv_connect_t], shutdown_req : Ptr[uv_shutdown_t], io_watcher : uv__io_t, write_queue : uv__queue, write_completed_queue : uv__queue, connection_cb : uv_connection_cb, delayed_error : CInt, accepted_fd : CInt, queued_fds : Ptr[Byte], select : Ptr[Byte], orig_termios : termios, mode : CInt)(using Zone): Ptr[uv_tty_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).write_queue_size = write_queue_size
      (!____ptr).alloc_cb = alloc_cb
      (!____ptr).read_cb = read_cb
      (!____ptr).connect_req = connect_req
      (!____ptr).shutdown_req = shutdown_req
      (!____ptr).io_watcher = io_watcher
      (!____ptr).write_queue = write_queue
      (!____ptr).write_completed_queue = write_completed_queue
      (!____ptr).connection_cb = connection_cb
      (!____ptr).delayed_error = delayed_error
      (!____ptr).accepted_fd = accepted_fd
      (!____ptr).queued_fds = queued_fds
      (!____ptr).select = select
      (!____ptr).orig_termios = orig_termios
      (!____ptr).mode = mode
      ____ptr
    extension (struct: uv_tty_s)
      def data: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def data_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def loop: Ptr[uv_loop_t] = !struct.at(8).asInstanceOf[Ptr[Ptr[uv_loop_t]]]
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at(8).asInstanceOf[Ptr[Ptr[uv_loop_t]]] = value
      def `type`: uv_handle_type = !struct.at(16).asInstanceOf[Ptr[uv_handle_type]]
      def type_=(value: uv_handle_type): Unit = !struct.at(16).asInstanceOf[Ptr[uv_handle_type]] = value
      def close_cb: uv_close_cb = !struct.at(24).asInstanceOf[Ptr[uv_close_cb]]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at(24).asInstanceOf[Ptr[uv_close_cb]] = value
      def handle_queue: uv__queue = !struct.at(32).asInstanceOf[Ptr[uv__queue]]
      def handle_queue_=(value: uv__queue): Unit = !struct.at(32).asInstanceOf[Ptr[uv__queue]] = value
      def u: uv_tty_s.Union0 = !struct.at(48).asInstanceOf[Ptr[uv_tty_s.Union0]]
      def u_=(value: uv_tty_s.Union0): Unit = !struct.at(48).asInstanceOf[Ptr[uv_tty_s.Union0]] = value
      def next_closing: Ptr[uv_handle_t] = !struct.at(80).asInstanceOf[Ptr[Ptr[uv_handle_t]]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at(80).asInstanceOf[Ptr[Ptr[uv_handle_t]]] = value
      def flags: CUnsignedInt = !struct.at(88).asInstanceOf[Ptr[CUnsignedInt]]
      def flags_=(value: CUnsignedInt): Unit = !struct.at(88).asInstanceOf[Ptr[CUnsignedInt]] = value
      def write_queue_size: size_t = !struct.at(96).asInstanceOf[Ptr[size_t]]
      def write_queue_size_=(value: size_t): Unit = !struct.at(96).asInstanceOf[Ptr[size_t]] = value
      def alloc_cb: uv_alloc_cb = !struct.at(104).asInstanceOf[Ptr[uv_alloc_cb]]
      def alloc_cb_=(value: uv_alloc_cb): Unit = !struct.at(104).asInstanceOf[Ptr[uv_alloc_cb]] = value
      def read_cb: uv_read_cb = !struct.at(112).asInstanceOf[Ptr[uv_read_cb]]
      def read_cb_=(value: uv_read_cb): Unit = !struct.at(112).asInstanceOf[Ptr[uv_read_cb]] = value
      def connect_req: Ptr[uv_connect_t] = !struct.at(120).asInstanceOf[Ptr[Ptr[uv_connect_t]]]
      def connect_req_=(value: Ptr[uv_connect_t]): Unit = !struct.at(120).asInstanceOf[Ptr[Ptr[uv_connect_t]]] = value
      def shutdown_req: Ptr[uv_shutdown_t] = !struct.at(128).asInstanceOf[Ptr[Ptr[uv_shutdown_t]]]
      def shutdown_req_=(value: Ptr[uv_shutdown_t]): Unit = !struct.at(128).asInstanceOf[Ptr[Ptr[uv_shutdown_t]]] = value
      def io_watcher: uv__io_t = !struct.at(136).asInstanceOf[Ptr[uv__io_t]]
      def io_watcher_=(value: uv__io_t): Unit = !struct.at(136).asInstanceOf[Ptr[uv__io_t]] = value
      def write_queue: uv__queue = !struct.at(200).asInstanceOf[Ptr[uv__queue]]
      def write_queue_=(value: uv__queue): Unit = !struct.at(200).asInstanceOf[Ptr[uv__queue]] = value
      def write_completed_queue: uv__queue = !struct.at(216).asInstanceOf[Ptr[uv__queue]]
      def write_completed_queue_=(value: uv__queue): Unit = !struct.at(216).asInstanceOf[Ptr[uv__queue]] = value
      def connection_cb: uv_connection_cb = !struct.at(232).asInstanceOf[Ptr[uv_connection_cb]]
      def connection_cb_=(value: uv_connection_cb): Unit = !struct.at(232).asInstanceOf[Ptr[uv_connection_cb]] = value
      def delayed_error: CInt = !struct.at(240).asInstanceOf[Ptr[CInt]]
      def delayed_error_=(value: CInt): Unit = !struct.at(240).asInstanceOf[Ptr[CInt]] = value
      def accepted_fd: CInt = !struct.at(244).asInstanceOf[Ptr[CInt]]
      def accepted_fd_=(value: CInt): Unit = !struct.at(244).asInstanceOf[Ptr[CInt]] = value
      def queued_fds: Ptr[Byte] = !struct.at(248).asInstanceOf[Ptr[Ptr[Byte]]]
      def queued_fds_=(value: Ptr[Byte]): Unit = !struct.at(248).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def select: Ptr[Byte] = !struct.at(256).asInstanceOf[Ptr[Ptr[Byte]]]
      def select_=(value: Ptr[Byte]): Unit = !struct.at(256).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def orig_termios: termios = !struct.at(264).asInstanceOf[Ptr[termios]]
      def orig_termios_=(value: termios): Unit = !struct.at(264).asInstanceOf[Ptr[termios]] = value
      def mode: CInt = !struct.at(336).asInstanceOf[Ptr[CInt]]
      def mode_=(value: CInt): Unit = !struct.at(336).asInstanceOf[Ptr[CInt]] = value

  /**
  */
  opaque type uv_tty_t = CArray[CChar, Nat.Digit3[Nat._3, Nat._4, Nat._4]]
  object uv_tty_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_tty_t] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._4, Nat._4]](Tag.Byte, Tag.Digit3[Nat._3, Nat._4, Nat._4](Tag.Nat3, Tag.Nat4, Tag.Nat4))
    def apply()(using Zone): Ptr[uv_tty_t] = scala.scalanative.unsafe.alloc[uv_tty_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_tty_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, write_queue_size : size_t, alloc_cb : uv_alloc_cb, read_cb : uv_read_cb, connect_req : Ptr[uv_connect_t], shutdown_req : Ptr[uv_shutdown_t], io_watcher : uv__io_t, write_queue : uv__queue, write_completed_queue : uv__queue, connection_cb : uv_connection_cb, delayed_error : CInt, accepted_fd : CInt, queued_fds : Ptr[Byte], select : Ptr[Byte], orig_termios : termios, mode : CInt)(using Zone): Ptr[uv_tty_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).write_queue_size = write_queue_size
      (!____ptr).alloc_cb = alloc_cb
      (!____ptr).read_cb = read_cb
      (!____ptr).connect_req = connect_req
      (!____ptr).shutdown_req = shutdown_req
      (!____ptr).io_watcher = io_watcher
      (!____ptr).write_queue = write_queue
      (!____ptr).write_completed_queue = write_completed_queue
      (!____ptr).connection_cb = connection_cb
      (!____ptr).delayed_error = delayed_error
      (!____ptr).accepted_fd = accepted_fd
      (!____ptr).queued_fds = queued_fds
      (!____ptr).select = select
      (!____ptr).orig_termios = orig_termios
      (!____ptr).mode = mode
      ____ptr
    extension (struct: uv_tty_t)
      def data: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def data_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def loop: Ptr[uv_loop_t] = !struct.at(8).asInstanceOf[Ptr[Ptr[uv_loop_t]]]
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at(8).asInstanceOf[Ptr[Ptr[uv_loop_t]]] = value
      def `type`: uv_handle_type = !struct.at(16).asInstanceOf[Ptr[uv_handle_type]]
      def type_=(value: uv_handle_type): Unit = !struct.at(16).asInstanceOf[Ptr[uv_handle_type]] = value
      def close_cb: uv_close_cb = !struct.at(24).asInstanceOf[Ptr[uv_close_cb]]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at(24).asInstanceOf[Ptr[uv_close_cb]] = value
      def handle_queue: uv__queue = !struct.at(32).asInstanceOf[Ptr[uv__queue]]
      def handle_queue_=(value: uv__queue): Unit = !struct.at(32).asInstanceOf[Ptr[uv__queue]] = value
      def u: uv_tty_t.Union0 = !struct.at(48).asInstanceOf[Ptr[uv_tty_t.Union0]]
      def u_=(value: uv_tty_t.Union0): Unit = !struct.at(48).asInstanceOf[Ptr[uv_tty_t.Union0]] = value
      def next_closing: Ptr[uv_handle_t] = !struct.at(80).asInstanceOf[Ptr[Ptr[uv_handle_t]]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at(80).asInstanceOf[Ptr[Ptr[uv_handle_t]]] = value
      def flags: CUnsignedInt = !struct.at(88).asInstanceOf[Ptr[CUnsignedInt]]
      def flags_=(value: CUnsignedInt): Unit = !struct.at(88).asInstanceOf[Ptr[CUnsignedInt]] = value
      def write_queue_size: size_t = !struct.at(96).asInstanceOf[Ptr[size_t]]
      def write_queue_size_=(value: size_t): Unit = !struct.at(96).asInstanceOf[Ptr[size_t]] = value
      def alloc_cb: uv_alloc_cb = !struct.at(104).asInstanceOf[Ptr[uv_alloc_cb]]
      def alloc_cb_=(value: uv_alloc_cb): Unit = !struct.at(104).asInstanceOf[Ptr[uv_alloc_cb]] = value
      def read_cb: uv_read_cb = !struct.at(112).asInstanceOf[Ptr[uv_read_cb]]
      def read_cb_=(value: uv_read_cb): Unit = !struct.at(112).asInstanceOf[Ptr[uv_read_cb]] = value
      def connect_req: Ptr[uv_connect_t] = !struct.at(120).asInstanceOf[Ptr[Ptr[uv_connect_t]]]
      def connect_req_=(value: Ptr[uv_connect_t]): Unit = !struct.at(120).asInstanceOf[Ptr[Ptr[uv_connect_t]]] = value
      def shutdown_req: Ptr[uv_shutdown_t] = !struct.at(128).asInstanceOf[Ptr[Ptr[uv_shutdown_t]]]
      def shutdown_req_=(value: Ptr[uv_shutdown_t]): Unit = !struct.at(128).asInstanceOf[Ptr[Ptr[uv_shutdown_t]]] = value
      def io_watcher: uv__io_t = !struct.at(136).asInstanceOf[Ptr[uv__io_t]]
      def io_watcher_=(value: uv__io_t): Unit = !struct.at(136).asInstanceOf[Ptr[uv__io_t]] = value
      def write_queue: uv__queue = !struct.at(200).asInstanceOf[Ptr[uv__queue]]
      def write_queue_=(value: uv__queue): Unit = !struct.at(200).asInstanceOf[Ptr[uv__queue]] = value
      def write_completed_queue: uv__queue = !struct.at(216).asInstanceOf[Ptr[uv__queue]]
      def write_completed_queue_=(value: uv__queue): Unit = !struct.at(216).asInstanceOf[Ptr[uv__queue]] = value
      def connection_cb: uv_connection_cb = !struct.at(232).asInstanceOf[Ptr[uv_connection_cb]]
      def connection_cb_=(value: uv_connection_cb): Unit = !struct.at(232).asInstanceOf[Ptr[uv_connection_cb]] = value
      def delayed_error: CInt = !struct.at(240).asInstanceOf[Ptr[CInt]]
      def delayed_error_=(value: CInt): Unit = !struct.at(240).asInstanceOf[Ptr[CInt]] = value
      def accepted_fd: CInt = !struct.at(244).asInstanceOf[Ptr[CInt]]
      def accepted_fd_=(value: CInt): Unit = !struct.at(244).asInstanceOf[Ptr[CInt]] = value
      def queued_fds: Ptr[Byte] = !struct.at(248).asInstanceOf[Ptr[Ptr[Byte]]]
      def queued_fds_=(value: Ptr[Byte]): Unit = !struct.at(248).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def select: Ptr[Byte] = !struct.at(256).asInstanceOf[Ptr[Ptr[Byte]]]
      def select_=(value: Ptr[Byte]): Unit = !struct.at(256).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def orig_termios: termios = !struct.at(264).asInstanceOf[Ptr[termios]]
      def orig_termios_=(value: termios): Unit = !struct.at(264).asInstanceOf[Ptr[termios]] = value
      def mode: CInt = !struct.at(336).asInstanceOf[Ptr[CInt]]
      def mode_=(value: CInt): Unit = !struct.at(336).asInstanceOf[Ptr[CInt]] = value

  /**
  */
  opaque type uv_udp_s = CStruct15[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_udp_s.Union0, Ptr[Byte], CUnsignedInt, size_t, size_t, Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue]
  object uv_udp_s:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_udp_s] = Tag.materializeCStruct15Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_udp_s.Union0, Ptr[Byte], CUnsignedInt, size_t, size_t, Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue]
    def apply()(using Zone): Ptr[uv_udp_s] = scala.scalanative.unsafe.alloc[uv_udp_s](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_udp_s.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, send_queue_size : size_t, send_queue_count : size_t, alloc_cb : uv_alloc_cb, recv_cb : uv_udp_recv_cb, io_watcher : uv__io_t, write_queue : uv__queue, write_completed_queue : uv__queue)(using Zone): Ptr[uv_udp_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).send_queue_size = send_queue_size
      (!____ptr).send_queue_count = send_queue_count
      (!____ptr).alloc_cb = alloc_cb
      (!____ptr).recv_cb = recv_cb
      (!____ptr).io_watcher = io_watcher
      (!____ptr).write_queue = write_queue
      (!____ptr).write_completed_queue = write_completed_queue
      ____ptr
    extension (struct: uv_udp_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_udp_s.Union0 = struct._6
      def u_=(value: uv_udp_s.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def send_queue_size : size_t = struct._9
      def send_queue_size_=(value: size_t): Unit = !struct.at9 = value
      def send_queue_count : size_t = struct._10
      def send_queue_count_=(value: size_t): Unit = !struct.at10 = value
      def alloc_cb : uv_alloc_cb = struct._11.asInstanceOf[uv_alloc_cb]
      def alloc_cb_=(value: uv_alloc_cb): Unit = !struct.at11 = value.asInstanceOf[Ptr[Byte]]
      def recv_cb : uv_udp_recv_cb = struct._12.asInstanceOf[uv_udp_recv_cb]
      def recv_cb_=(value: uv_udp_recv_cb): Unit = !struct.at12 = value.asInstanceOf[Ptr[Byte]]
      def io_watcher : uv__io_t = struct._13
      def io_watcher_=(value: uv__io_t): Unit = !struct.at13 = value
      def write_queue : uv__queue = struct._14
      def write_queue_=(value: uv__queue): Unit = !struct.at14 = value
      def write_completed_queue : uv__queue = struct._15
      def write_completed_queue_=(value: uv__queue): Unit = !struct.at15 = value

  /**
  */
  opaque type uv_udp_send_s = CStruct12[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], uv__queue, sockaddr_storage, CUnsignedInt, Ptr[uv_buf_t], ssize_t, Ptr[Byte], CArray[uv_buf_t, Nat._4]]
  object uv_udp_send_s:
    given _tag: Tag[uv_udp_send_s] = Tag.materializeCStruct12Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], uv__queue, sockaddr_storage, CUnsignedInt, Ptr[uv_buf_t], ssize_t, Ptr[Byte], CArray[uv_buf_t, Nat._4]]
    def apply()(using Zone): Ptr[uv_udp_send_s] = scala.scalanative.unsafe.alloc[uv_udp_send_s](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], handle : Ptr[uv_udp_t], cb : uv_udp_send_cb, queue : uv__queue, addr : sockaddr_storage, nbufs : CUnsignedInt, bufs : Ptr[uv_buf_t], status : ssize_t, send_cb : uv_udp_send_cb, bufsml : CArray[uv_buf_t, Nat._4])(using Zone): Ptr[uv_udp_send_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).handle = handle
      (!____ptr).cb = cb
      (!____ptr).queue = queue
      (!____ptr).addr = addr
      (!____ptr).nbufs = nbufs
      (!____ptr).bufs = bufs
      (!____ptr).status = status
      (!____ptr).send_cb = send_cb
      (!____ptr).bufsml = bufsml
      ____ptr
    extension (struct: uv_udp_send_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def handle : Ptr[uv_udp_t] = struct._4.asInstanceOf[Ptr[uv_udp_t]]
      def handle_=(value: Ptr[uv_udp_t]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def cb : uv_udp_send_cb = struct._5.asInstanceOf[uv_udp_send_cb]
      def cb_=(value: uv_udp_send_cb): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._6
      def queue_=(value: uv__queue): Unit = !struct.at6 = value
      def addr : sockaddr_storage = struct._7
      def addr_=(value: sockaddr_storage): Unit = !struct.at7 = value
      def nbufs : CUnsignedInt = struct._8
      def nbufs_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def bufs : Ptr[uv_buf_t] = struct._9
      def bufs_=(value: Ptr[uv_buf_t]): Unit = !struct.at9 = value
      def status : ssize_t = struct._10
      def status_=(value: ssize_t): Unit = !struct.at10 = value
      def send_cb : uv_udp_send_cb = struct._11.asInstanceOf[uv_udp_send_cb]
      def send_cb_=(value: uv_udp_send_cb): Unit = !struct.at11 = value.asInstanceOf[Ptr[Byte]]
      def bufsml : CArray[uv_buf_t, Nat._4] = struct._12
      def bufsml_=(value: CArray[uv_buf_t, Nat._4]): Unit = !struct.at12 = value

  /**
  */
  opaque type uv_udp_send_t = CStruct12[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], uv__queue, sockaddr_storage, CUnsignedInt, Ptr[uv_buf_t], ssize_t, Ptr[Byte], CArray[uv_buf_t, Nat._4]]
  object uv_udp_send_t:
    given _tag: Tag[uv_udp_send_t] = Tag.materializeCStruct12Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], uv__queue, sockaddr_storage, CUnsignedInt, Ptr[uv_buf_t], ssize_t, Ptr[Byte], CArray[uv_buf_t, Nat._4]]
    def apply()(using Zone): Ptr[uv_udp_send_t] = scala.scalanative.unsafe.alloc[uv_udp_send_t](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], handle : Ptr[uv_udp_t], cb : uv_udp_send_cb, queue : uv__queue, addr : sockaddr_storage, nbufs : CUnsignedInt, bufs : Ptr[uv_buf_t], status : ssize_t, send_cb : uv_udp_send_cb, bufsml : CArray[uv_buf_t, Nat._4])(using Zone): Ptr[uv_udp_send_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).handle = handle
      (!____ptr).cb = cb
      (!____ptr).queue = queue
      (!____ptr).addr = addr
      (!____ptr).nbufs = nbufs
      (!____ptr).bufs = bufs
      (!____ptr).status = status
      (!____ptr).send_cb = send_cb
      (!____ptr).bufsml = bufsml
      ____ptr
    extension (struct: uv_udp_send_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def handle : Ptr[uv_udp_t] = struct._4.asInstanceOf[Ptr[uv_udp_t]]
      def handle_=(value: Ptr[uv_udp_t]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def cb : uv_udp_send_cb = struct._5.asInstanceOf[uv_udp_send_cb]
      def cb_=(value: uv_udp_send_cb): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._6
      def queue_=(value: uv__queue): Unit = !struct.at6 = value
      def addr : sockaddr_storage = struct._7
      def addr_=(value: sockaddr_storage): Unit = !struct.at7 = value
      def nbufs : CUnsignedInt = struct._8
      def nbufs_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def bufs : Ptr[uv_buf_t] = struct._9
      def bufs_=(value: Ptr[uv_buf_t]): Unit = !struct.at9 = value
      def status : ssize_t = struct._10
      def status_=(value: ssize_t): Unit = !struct.at10 = value
      def send_cb : uv_udp_send_cb = struct._11.asInstanceOf[uv_udp_send_cb]
      def send_cb_=(value: uv_udp_send_cb): Unit = !struct.at11 = value.asInstanceOf[Ptr[Byte]]
      def bufsml : CArray[uv_buf_t, Nat._4] = struct._12
      def bufsml_=(value: CArray[uv_buf_t, Nat._4]): Unit = !struct.at12 = value

  /**
  */
  opaque type uv_udp_t = CStruct15[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_udp_t.Union0, Ptr[Byte], CUnsignedInt, size_t, size_t, Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue]
  object uv_udp_t:
    /**
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._3, Nat._2]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, fd)
        ___ptr
      @scala.annotation.targetName("apply_reserved")
      def apply(reserved: CArray[Ptr[Byte], Nat._4])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]].update(0, reserved)
        ___ptr
      extension (struct: Union0)
        def fd : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def fd_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def reserved : CArray[Ptr[Byte], Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]]
        def reserved_=(value: CArray[Ptr[Byte], Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Ptr[Byte], Nat._4]]] = value
    given _tag: Tag[uv_udp_t] = Tag.materializeCStruct15Tag[Ptr[Byte], Ptr[uv_loop_t], uv_handle_type, Ptr[Byte], uv__queue, uv_udp_t.Union0, Ptr[Byte], CUnsignedInt, size_t, size_t, Ptr[Byte], Ptr[Byte], uv__io_t, uv__queue, uv__queue]
    def apply()(using Zone): Ptr[uv_udp_t] = scala.scalanative.unsafe.alloc[uv_udp_t](1)
    def apply(data : Ptr[Byte], loop : Ptr[uv_loop_t], `type` : uv_handle_type, close_cb : uv_close_cb, handle_queue : uv__queue, u : uv_udp_t.Union0, next_closing : Ptr[uv_handle_t], flags : CUnsignedInt, send_queue_size : size_t, send_queue_count : size_t, alloc_cb : uv_alloc_cb, recv_cb : uv_udp_recv_cb, io_watcher : uv__io_t, write_queue : uv__queue, write_completed_queue : uv__queue)(using Zone): Ptr[uv_udp_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).loop = loop
      (!____ptr).`type` = `type`
      (!____ptr).close_cb = close_cb
      (!____ptr).handle_queue = handle_queue
      (!____ptr).u = u
      (!____ptr).next_closing = next_closing
      (!____ptr).flags = flags
      (!____ptr).send_queue_size = send_queue_size
      (!____ptr).send_queue_count = send_queue_count
      (!____ptr).alloc_cb = alloc_cb
      (!____ptr).recv_cb = recv_cb
      (!____ptr).io_watcher = io_watcher
      (!____ptr).write_queue = write_queue
      (!____ptr).write_completed_queue = write_completed_queue
      ____ptr
    extension (struct: uv_udp_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def loop : Ptr[uv_loop_t] = struct._2
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at2 = value
      def `type` : uv_handle_type = struct._3
      def type_=(value: uv_handle_type): Unit = !struct.at3 = value
      def close_cb : uv_close_cb = struct._4.asInstanceOf[uv_close_cb]
      def close_cb_=(value: uv_close_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def handle_queue : uv__queue = struct._5
      def handle_queue_=(value: uv__queue): Unit = !struct.at5 = value
      def u : uv_udp_t.Union0 = struct._6
      def u_=(value: uv_udp_t.Union0): Unit = !struct.at6 = value
      def next_closing : Ptr[uv_handle_t] = struct._7.asInstanceOf[Ptr[uv_handle_t]]
      def next_closing_=(value: Ptr[uv_handle_t]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
      def flags : CUnsignedInt = struct._8
      def flags_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def send_queue_size : size_t = struct._9
      def send_queue_size_=(value: size_t): Unit = !struct.at9 = value
      def send_queue_count : size_t = struct._10
      def send_queue_count_=(value: size_t): Unit = !struct.at10 = value
      def alloc_cb : uv_alloc_cb = struct._11.asInstanceOf[uv_alloc_cb]
      def alloc_cb_=(value: uv_alloc_cb): Unit = !struct.at11 = value.asInstanceOf[Ptr[Byte]]
      def recv_cb : uv_udp_recv_cb = struct._12.asInstanceOf[uv_udp_recv_cb]
      def recv_cb_=(value: uv_udp_recv_cb): Unit = !struct.at12 = value.asInstanceOf[Ptr[Byte]]
      def io_watcher : uv__io_t = struct._13
      def io_watcher_=(value: uv__io_t): Unit = !struct.at13 = value
      def write_queue : uv__queue = struct._14
      def write_queue_=(value: uv__queue): Unit = !struct.at14 = value
      def write_completed_queue : uv__queue = struct._15
      def write_completed_queue_=(value: uv__queue): Unit = !struct.at15 = value

  /**
  */
  opaque type uv_utsname_s = CStruct4[CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
  object uv_utsname_s:
    given _tag: Tag[uv_utsname_s] = Tag.materializeCStruct4Tag[CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
    def apply()(using Zone): Ptr[uv_utsname_s] = scala.scalanative.unsafe.alloc[uv_utsname_s](1)
    def apply(sysname : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], release : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], version : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], machine : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]])(using Zone): Ptr[uv_utsname_s] = 
      val ____ptr = apply()
      (!____ptr).sysname = sysname
      (!____ptr).release = release
      (!____ptr).version = version
      (!____ptr).machine = machine
      ____ptr
    extension (struct: uv_utsname_s)
      def sysname : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._1
      def sysname_=(value: CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = !struct.at1 = value
      def release : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._2
      def release_=(value: CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = !struct.at2 = value
      def version : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._3
      def version_=(value: CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = !struct.at3 = value
      def machine : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._4
      def machine_=(value: CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = !struct.at4 = value

  /**
  */
  opaque type uv_utsname_t = CStruct4[CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
  object uv_utsname_t:
    given _tag: Tag[uv_utsname_t] = Tag.materializeCStruct4Tag[CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
    def apply()(using Zone): Ptr[uv_utsname_t] = scala.scalanative.unsafe.alloc[uv_utsname_t](1)
    def apply(sysname : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], release : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], version : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]], machine : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]])(using Zone): Ptr[uv_utsname_t] = 
      val ____ptr = apply()
      (!____ptr).sysname = sysname
      (!____ptr).release = release
      (!____ptr).version = version
      (!____ptr).machine = machine
      ____ptr
    extension (struct: uv_utsname_t)
      def sysname : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._1
      def sysname_=(value: CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = !struct.at1 = value
      def release : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._2
      def release_=(value: CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = !struct.at2 = value
      def version : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._3
      def version_=(value: CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = !struct.at3 = value
      def machine : CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._4
      def machine_=(value: CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = !struct.at4 = value

  /**
  */
  opaque type uv_work_s = CStruct7[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], Ptr[Byte], Ptr[Byte], uv__work]
  object uv_work_s:
    given _tag: Tag[uv_work_s] = Tag.materializeCStruct7Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], Ptr[Byte], Ptr[Byte], uv__work]
    def apply()(using Zone): Ptr[uv_work_s] = scala.scalanative.unsafe.alloc[uv_work_s](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], loop : Ptr[uv_loop_t], work_cb : uv_work_cb, after_work_cb : uv_after_work_cb, work_req : uv__work)(using Zone): Ptr[uv_work_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).loop = loop
      (!____ptr).work_cb = work_cb
      (!____ptr).after_work_cb = after_work_cb
      (!____ptr).work_req = work_req
      ____ptr
    extension (struct: uv_work_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def loop : Ptr[uv_loop_t] = struct._4
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at4 = value
      def work_cb : uv_work_cb = struct._5.asInstanceOf[uv_work_cb]
      def work_cb_=(value: uv_work_cb): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]
      def after_work_cb : uv_after_work_cb = struct._6.asInstanceOf[uv_after_work_cb]
      def after_work_cb_=(value: uv_after_work_cb): Unit = !struct.at6 = value.asInstanceOf[Ptr[Byte]]
      def work_req : uv__work = struct._7
      def work_req_=(value: uv__work): Unit = !struct.at7 = value

  /**
  */
  opaque type uv_work_t = CStruct7[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], Ptr[Byte], Ptr[Byte], uv__work]
  object uv_work_t:
    given _tag: Tag[uv_work_t] = Tag.materializeCStruct7Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[uv_loop_t], Ptr[Byte], Ptr[Byte], uv__work]
    def apply()(using Zone): Ptr[uv_work_t] = scala.scalanative.unsafe.alloc[uv_work_t](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], loop : Ptr[uv_loop_t], work_cb : uv_work_cb, after_work_cb : uv_after_work_cb, work_req : uv__work)(using Zone): Ptr[uv_work_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).loop = loop
      (!____ptr).work_cb = work_cb
      (!____ptr).after_work_cb = after_work_cb
      (!____ptr).work_req = work_req
      ____ptr
    extension (struct: uv_work_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def loop : Ptr[uv_loop_t] = struct._4
      def loop_=(value: Ptr[uv_loop_t]): Unit = !struct.at4 = value
      def work_cb : uv_work_cb = struct._5.asInstanceOf[uv_work_cb]
      def work_cb_=(value: uv_work_cb): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]
      def after_work_cb : uv_after_work_cb = struct._6.asInstanceOf[uv_after_work_cb]
      def after_work_cb_=(value: uv_after_work_cb): Unit = !struct.at6 = value.asInstanceOf[Ptr[Byte]]
      def work_req : uv__work = struct._7
      def work_req_=(value: uv__work): Unit = !struct.at7 = value

  /**
  */
  opaque type uv_write_s = CStruct12[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__queue, CUnsignedInt, Ptr[uv_buf_t], CUnsignedInt, CInt, CArray[uv_buf_t, Nat._4]]
  object uv_write_s:
    given _tag: Tag[uv_write_s] = Tag.materializeCStruct12Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__queue, CUnsignedInt, Ptr[uv_buf_t], CUnsignedInt, CInt, CArray[uv_buf_t, Nat._4]]
    def apply()(using Zone): Ptr[uv_write_s] = scala.scalanative.unsafe.alloc[uv_write_s](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], cb : uv_write_cb, send_handle : Ptr[uv_stream_t], handle : Ptr[uv_stream_t], queue : uv__queue, write_index : CUnsignedInt, bufs : Ptr[uv_buf_t], nbufs : CUnsignedInt, error : CInt, bufsml : CArray[uv_buf_t, Nat._4])(using Zone): Ptr[uv_write_s] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).cb = cb
      (!____ptr).send_handle = send_handle
      (!____ptr).handle = handle
      (!____ptr).queue = queue
      (!____ptr).write_index = write_index
      (!____ptr).bufs = bufs
      (!____ptr).nbufs = nbufs
      (!____ptr).error = error
      (!____ptr).bufsml = bufsml
      ____ptr
    extension (struct: uv_write_s)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def cb : uv_write_cb = struct._4.asInstanceOf[uv_write_cb]
      def cb_=(value: uv_write_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def send_handle : Ptr[uv_stream_t] = struct._5.asInstanceOf[Ptr[uv_stream_t]]
      def send_handle_=(value: Ptr[uv_stream_t]): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]
      def handle : Ptr[uv_stream_t] = struct._6.asInstanceOf[Ptr[uv_stream_t]]
      def handle_=(value: Ptr[uv_stream_t]): Unit = !struct.at6 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._7
      def queue_=(value: uv__queue): Unit = !struct.at7 = value
      def write_index : CUnsignedInt = struct._8
      def write_index_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def bufs : Ptr[uv_buf_t] = struct._9
      def bufs_=(value: Ptr[uv_buf_t]): Unit = !struct.at9 = value
      def nbufs : CUnsignedInt = struct._10
      def nbufs_=(value: CUnsignedInt): Unit = !struct.at10 = value
      def error : CInt = struct._11
      def error_=(value: CInt): Unit = !struct.at11 = value
      def bufsml : CArray[uv_buf_t, Nat._4] = struct._12
      def bufsml_=(value: CArray[uv_buf_t, Nat._4]): Unit = !struct.at12 = value

  /**
  */
  opaque type uv_write_t = CStruct12[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__queue, CUnsignedInt, Ptr[uv_buf_t], CUnsignedInt, CInt, CArray[uv_buf_t, Nat._4]]
  object uv_write_t:
    given _tag: Tag[uv_write_t] = Tag.materializeCStruct12Tag[Ptr[Byte], uv_req_type, CArray[Ptr[Byte], Nat._6], Ptr[Byte], Ptr[Byte], Ptr[Byte], uv__queue, CUnsignedInt, Ptr[uv_buf_t], CUnsignedInt, CInt, CArray[uv_buf_t, Nat._4]]
    def apply()(using Zone): Ptr[uv_write_t] = scala.scalanative.unsafe.alloc[uv_write_t](1)
    def apply(data : Ptr[Byte], `type` : uv_req_type, reserved : CArray[Ptr[Byte], Nat._6], cb : uv_write_cb, send_handle : Ptr[uv_stream_t], handle : Ptr[uv_stream_t], queue : uv__queue, write_index : CUnsignedInt, bufs : Ptr[uv_buf_t], nbufs : CUnsignedInt, error : CInt, bufsml : CArray[uv_buf_t, Nat._4])(using Zone): Ptr[uv_write_t] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).`type` = `type`
      (!____ptr).reserved = reserved
      (!____ptr).cb = cb
      (!____ptr).send_handle = send_handle
      (!____ptr).handle = handle
      (!____ptr).queue = queue
      (!____ptr).write_index = write_index
      (!____ptr).bufs = bufs
      (!____ptr).nbufs = nbufs
      (!____ptr).error = error
      (!____ptr).bufsml = bufsml
      ____ptr
    extension (struct: uv_write_t)
      def data : Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type` : uv_req_type = struct._2
      def type_=(value: uv_req_type): Unit = !struct.at2 = value
      def reserved : CArray[Ptr[Byte], Nat._6] = struct._3
      def reserved_=(value: CArray[Ptr[Byte], Nat._6]): Unit = !struct.at3 = value
      def cb : uv_write_cb = struct._4.asInstanceOf[uv_write_cb]
      def cb_=(value: uv_write_cb): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def send_handle : Ptr[uv_stream_t] = struct._5.asInstanceOf[Ptr[uv_stream_t]]
      def send_handle_=(value: Ptr[uv_stream_t]): Unit = !struct.at5 = value.asInstanceOf[Ptr[Byte]]
      def handle : Ptr[uv_stream_t] = struct._6.asInstanceOf[Ptr[uv_stream_t]]
      def handle_=(value: Ptr[uv_stream_t]): Unit = !struct.at6 = value.asInstanceOf[Ptr[Byte]]
      def queue : uv__queue = struct._7
      def queue_=(value: uv__queue): Unit = !struct.at7 = value
      def write_index : CUnsignedInt = struct._8
      def write_index_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def bufs : Ptr[uv_buf_t] = struct._9
      def bufs_=(value: Ptr[uv_buf_t]): Unit = !struct.at9 = value
      def nbufs : CUnsignedInt = struct._10
      def nbufs_=(value: CUnsignedInt): Unit = !struct.at10 = value
      def error : CInt = struct._11
      def error_=(value: CInt): Unit = !struct.at11 = value
      def bufsml : CArray[uv_buf_t, Nat._4] = struct._12
      def bufsml_=(value: CArray[uv_buf_t, Nat._4]): Unit = !struct.at12 = value

object unions:
  import _root_.libuv.enumerations.*
  import _root_.libuv.predef.*
  import _root_.libuv.aliases.*
  import _root_.libuv.structs.*
  import _root_.libuv.unions.*
  /**
  */
  opaque type uv_any_handle = CArray[Byte, Nat.Digit3[Nat._3, Nat._4, Nat._4]]
  object uv_any_handle:
    given _tag: Tag[uv_any_handle] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._4, Nat._4]](Tag.Byte, Tag.Digit3[Nat._3, Nat._4, Nat._4](Tag.Nat3, Tag.Nat4, Tag.Nat4))
    def apply()(using Zone): Ptr[uv_any_handle] = 
      val ___ptr = alloc[uv_any_handle](1)
      ___ptr
    @scala.annotation.targetName("apply_async")
    def apply(async: uv_async_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_async_t]].update(0, async)
      ___ptr
    @scala.annotation.targetName("apply_check")
    def apply(check: uv_check_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_check_t]].update(0, check)
      ___ptr
    @scala.annotation.targetName("apply_fs_event")
    def apply(fs_event: uv_fs_event_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_fs_event_t]].update(0, fs_event)
      ___ptr
    @scala.annotation.targetName("apply_fs_poll")
    def apply(fs_poll: uv_fs_poll_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_fs_poll_t]].update(0, fs_poll)
      ___ptr
    @scala.annotation.targetName("apply_handle")
    def apply(handle: uv_handle_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_handle_t]].update(0, handle)
      ___ptr
    @scala.annotation.targetName("apply_idle")
    def apply(idle: uv_idle_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_idle_t]].update(0, idle)
      ___ptr
    @scala.annotation.targetName("apply_pipe")
    def apply(pipe: uv_pipe_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_pipe_t]].update(0, pipe)
      ___ptr
    @scala.annotation.targetName("apply_poll")
    def apply(poll: uv_poll_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_poll_t]].update(0, poll)
      ___ptr
    @scala.annotation.targetName("apply_prepare")
    def apply(prepare: uv_prepare_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_prepare_t]].update(0, prepare)
      ___ptr
    @scala.annotation.targetName("apply_process")
    def apply(process: uv_process_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_process_t]].update(0, process)
      ___ptr
    @scala.annotation.targetName("apply_stream")
    def apply(stream: uv_stream_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_stream_t]].update(0, stream)
      ___ptr
    @scala.annotation.targetName("apply_tcp")
    def apply(tcp: uv_tcp_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_tcp_t]].update(0, tcp)
      ___ptr
    @scala.annotation.targetName("apply_timer")
    def apply(timer: uv_timer_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_timer_t]].update(0, timer)
      ___ptr
    @scala.annotation.targetName("apply_tty")
    def apply(tty: uv_tty_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_tty_t]].update(0, tty)
      ___ptr
    @scala.annotation.targetName("apply_udp")
    def apply(udp: uv_udp_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_udp_t]].update(0, udp)
      ___ptr
    @scala.annotation.targetName("apply_signal")
    def apply(signal: uv_signal_t)(using Zone): Ptr[uv_any_handle] =
      val ___ptr = alloc[uv_any_handle](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_signal_t]].update(0, signal)
      ___ptr
    extension (struct: uv_any_handle)
      def async : uv_async_t = !struct.at(0).asInstanceOf[Ptr[uv_async_t]]
      def async_=(value: uv_async_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_async_t]] = value
      def check : uv_check_t = !struct.at(0).asInstanceOf[Ptr[uv_check_t]]
      def check_=(value: uv_check_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_check_t]] = value
      def fs_event : uv_fs_event_t = !struct.at(0).asInstanceOf[Ptr[uv_fs_event_t]]
      def fs_event_=(value: uv_fs_event_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_fs_event_t]] = value
      def fs_poll : uv_fs_poll_t = !struct.at(0).asInstanceOf[Ptr[uv_fs_poll_t]]
      def fs_poll_=(value: uv_fs_poll_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_fs_poll_t]] = value
      def handle : uv_handle_t = !struct.at(0).asInstanceOf[Ptr[uv_handle_t]]
      def handle_=(value: uv_handle_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_handle_t]] = value
      def idle : uv_idle_t = !struct.at(0).asInstanceOf[Ptr[uv_idle_t]]
      def idle_=(value: uv_idle_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_idle_t]] = value
      def pipe : uv_pipe_t = !struct.at(0).asInstanceOf[Ptr[uv_pipe_t]]
      def pipe_=(value: uv_pipe_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_pipe_t]] = value
      def poll : uv_poll_t = !struct.at(0).asInstanceOf[Ptr[uv_poll_t]]
      def poll_=(value: uv_poll_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_poll_t]] = value
      def prepare : uv_prepare_t = !struct.at(0).asInstanceOf[Ptr[uv_prepare_t]]
      def prepare_=(value: uv_prepare_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_prepare_t]] = value
      def process : uv_process_t = !struct.at(0).asInstanceOf[Ptr[uv_process_t]]
      def process_=(value: uv_process_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_process_t]] = value
      def stream : uv_stream_t = !struct.at(0).asInstanceOf[Ptr[uv_stream_t]]
      def stream_=(value: uv_stream_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_stream_t]] = value
      def tcp : uv_tcp_t = !struct.at(0).asInstanceOf[Ptr[uv_tcp_t]]
      def tcp_=(value: uv_tcp_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_tcp_t]] = value
      def timer : uv_timer_t = !struct.at(0).asInstanceOf[Ptr[uv_timer_t]]
      def timer_=(value: uv_timer_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_timer_t]] = value
      def tty : uv_tty_t = !struct.at(0).asInstanceOf[Ptr[uv_tty_t]]
      def tty_=(value: uv_tty_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_tty_t]] = value
      def udp : uv_udp_t = !struct.at(0).asInstanceOf[Ptr[uv_udp_t]]
      def udp_=(value: uv_udp_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_udp_t]] = value
      def signal : uv_signal_t = !struct.at(0).asInstanceOf[Ptr[uv_signal_t]]
      def signal_=(value: uv_signal_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_signal_t]] = value

  /**
  */
  opaque type uv_any_req = CArray[Byte, Nat.Digit4[Nat._1, Nat._1, Nat._9, Nat._2]]
  object uv_any_req:
    given _tag: Tag[uv_any_req] = Tag.CArray[CChar, Nat.Digit4[Nat._1, Nat._1, Nat._9, Nat._2]](Tag.Byte, Tag.Digit4[Nat._1, Nat._1, Nat._9, Nat._2](Tag.Nat1, Tag.Nat1, Tag.Nat9, Tag.Nat2))
    def apply()(using Zone): Ptr[uv_any_req] = 
      val ___ptr = alloc[uv_any_req](1)
      ___ptr
    @scala.annotation.targetName("apply_req")
    def apply(req: uv_req_t)(using Zone): Ptr[uv_any_req] =
      val ___ptr = alloc[uv_any_req](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_req_t]].update(0, req)
      ___ptr
    @scala.annotation.targetName("apply_connect")
    def apply(connect: uv_connect_t)(using Zone): Ptr[uv_any_req] =
      val ___ptr = alloc[uv_any_req](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_connect_t]].update(0, connect)
      ___ptr
    @scala.annotation.targetName("apply_write")
    def apply(write: uv_write_t)(using Zone): Ptr[uv_any_req] =
      val ___ptr = alloc[uv_any_req](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_write_t]].update(0, write)
      ___ptr
    @scala.annotation.targetName("apply_shutdown")
    def apply(shutdown: uv_shutdown_t)(using Zone): Ptr[uv_any_req] =
      val ___ptr = alloc[uv_any_req](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_shutdown_t]].update(0, shutdown)
      ___ptr
    @scala.annotation.targetName("apply_udp_send")
    def apply(udp_send: uv_udp_send_t)(using Zone): Ptr[uv_any_req] =
      val ___ptr = alloc[uv_any_req](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_udp_send_t]].update(0, udp_send)
      ___ptr
    @scala.annotation.targetName("apply_fs")
    def apply(fs: uv_fs_t)(using Zone): Ptr[uv_any_req] =
      val ___ptr = alloc[uv_any_req](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_fs_t]].update(0, fs)
      ___ptr
    @scala.annotation.targetName("apply_work")
    def apply(work: uv_work_t)(using Zone): Ptr[uv_any_req] =
      val ___ptr = alloc[uv_any_req](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_work_t]].update(0, work)
      ___ptr
    @scala.annotation.targetName("apply_getaddrinfo")
    def apply(getaddrinfo: uv_getaddrinfo_t)(using Zone): Ptr[uv_any_req] =
      val ___ptr = alloc[uv_any_req](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_getaddrinfo_t]].update(0, getaddrinfo)
      ___ptr
    @scala.annotation.targetName("apply_getnameinfo")
    def apply(getnameinfo: uv_getnameinfo_t)(using Zone): Ptr[uv_any_req] =
      val ___ptr = alloc[uv_any_req](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_getnameinfo_t]].update(0, getnameinfo)
      ___ptr
    @scala.annotation.targetName("apply_random")
    def apply(random: uv_random_t)(using Zone): Ptr[uv_any_req] =
      val ___ptr = alloc[uv_any_req](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uv_random_t]].update(0, random)
      ___ptr
    extension (struct: uv_any_req)
      def req : uv_req_t = !struct.at(0).asInstanceOf[Ptr[uv_req_t]]
      def req_=(value: uv_req_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_req_t]] = value
      def connect : uv_connect_t = !struct.at(0).asInstanceOf[Ptr[uv_connect_t]]
      def connect_=(value: uv_connect_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_connect_t]] = value
      def write : uv_write_t = !struct.at(0).asInstanceOf[Ptr[uv_write_t]]
      def write_=(value: uv_write_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_write_t]] = value
      def shutdown : uv_shutdown_t = !struct.at(0).asInstanceOf[Ptr[uv_shutdown_t]]
      def shutdown_=(value: uv_shutdown_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_shutdown_t]] = value
      def udp_send : uv_udp_send_t = !struct.at(0).asInstanceOf[Ptr[uv_udp_send_t]]
      def udp_send_=(value: uv_udp_send_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_udp_send_t]] = value
      def fs : uv_fs_t = !struct.at(0).asInstanceOf[Ptr[uv_fs_t]]
      def fs_=(value: uv_fs_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_fs_t]] = value
      def work : uv_work_t = !struct.at(0).asInstanceOf[Ptr[uv_work_t]]
      def work_=(value: uv_work_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_work_t]] = value
      def getaddrinfo : uv_getaddrinfo_t = !struct.at(0).asInstanceOf[Ptr[uv_getaddrinfo_t]]
      def getaddrinfo_=(value: uv_getaddrinfo_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_getaddrinfo_t]] = value
      def getnameinfo : uv_getnameinfo_t = !struct.at(0).asInstanceOf[Ptr[uv_getnameinfo_t]]
      def getnameinfo_=(value: uv_getnameinfo_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_getnameinfo_t]] = value
      def random : uv_random_t = !struct.at(0).asInstanceOf[Ptr[uv_random_t]]
      def random_=(value: uv_random_t): Unit = !struct.at(0).asInstanceOf[Ptr[uv_random_t]] = value


@extern
private[libuv] object extern_functions:
  import _root_.libuv.enumerations.*
  import _root_.libuv.predef.*
  import _root_.libuv.aliases.*
  import _root_.libuv.structs.*
  import _root_.libuv.unions.*
  private[libuv] def __sn_wrap_libuv_uv_buf_init(base : CString, len : CUnsignedInt, __return : Ptr[uv_buf_t]): Unit = extern

  /**
  */
  def uv_accept(server : Ptr[uv_stream_t], client : Ptr[uv_stream_t]): CInt = extern

  /**
  */
  def uv_async_init(_0 : Ptr[uv_loop_t], async : Ptr[uv_async_t], async_cb : uv_async_cb): CInt = extern

  /**
  */
  def uv_async_send(async : Ptr[uv_async_t]): CInt = extern

  /**
  */
  def uv_available_parallelism(): CUnsignedInt = extern

  /**
  */
  def uv_backend_fd(_0 : Ptr[uv_loop_t]): CInt = extern

  /**
  */
  def uv_backend_timeout(_0 : Ptr[uv_loop_t]): CInt = extern

  /**
  */
  def uv_barrier_destroy(barrier : Ptr[uv_barrier_t]): Unit = extern

  /**
  */
  def uv_barrier_init(barrier : Ptr[uv_barrier_t], count : CUnsignedInt): CInt = extern

  /**
  */
  def uv_barrier_wait(barrier : Ptr[uv_barrier_t]): CInt = extern

  /**
  */
  def uv_cancel(req : Ptr[uv_req_t]): CInt = extern

  /**
  */
  def uv_chdir(dir : CString): CInt = extern

  /**
  */
  def uv_check_init(_0 : Ptr[uv_loop_t], check : Ptr[uv_check_t]): CInt = extern

  /**
  */
  def uv_check_start(check : Ptr[uv_check_t], cb : uv_check_cb): CInt = extern

  /**
  */
  def uv_check_stop(check : Ptr[uv_check_t]): CInt = extern

  /**
  */
  def uv_clock_gettime(clock_id : uv_clock_id, ts : Ptr[uv_timespec64_t]): CInt = extern

  /**
  */
  def uv_close(handle : Ptr[uv_handle_t], close_cb : uv_close_cb): Unit = extern

  /**
  */
  def uv_cond_broadcast(cond : Ptr[uv_cond_t]): Unit = extern

  /**
  */
  def uv_cond_destroy(cond : Ptr[uv_cond_t]): Unit = extern

  /**
  */
  def uv_cond_init(cond : Ptr[uv_cond_t]): CInt = extern

  /**
  */
  def uv_cond_signal(cond : Ptr[uv_cond_t]): Unit = extern

  /**
  */
  def uv_cond_timedwait(cond : Ptr[uv_cond_t], mutex : Ptr[uv_mutex_t], timeout : uint64_t): CInt = extern

  /**
  */
  def uv_cond_wait(cond : Ptr[uv_cond_t], mutex : Ptr[uv_mutex_t]): Unit = extern

  /**
  */
  def uv_cpu_info(cpu_infos : Ptr[Ptr[uv_cpu_info_t]], count : Ptr[CInt]): CInt = extern

  /**
  */
  def uv_cpumask_size(): CInt = extern

  /**
  */
  def uv_cwd(buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_default_loop(): Ptr[uv_loop_t] = extern

  /**
  */
  def uv_disable_stdio_inheritance(): Unit = extern

  /**
  */
  def uv_dlclose(lib : Ptr[uv_lib_t]): Unit = extern

  /**
  */
  def uv_dlerror(lib : Ptr[uv_lib_t]): CString = extern

  /**
  */
  def uv_dlopen(filename : CString, lib : Ptr[uv_lib_t]): CInt = extern

  /**
  */
  def uv_dlsym(lib : Ptr[uv_lib_t], name : CString, ptr : Ptr[Ptr[Byte]]): CInt = extern

  /**
  */
  def uv_err_name(err : CInt): CString = extern

  /**
  */
  def uv_err_name_r(err : CInt, buf : CString, buflen : size_t): CString = extern

  /**
  */
  def uv_exepath(buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_fileno(handle : Ptr[uv_handle_t], fd : Ptr[uv_os_fd_t]): CInt = extern

  /**
  */
  def uv_free_cpu_info(cpu_infos : Ptr[uv_cpu_info_t], count : CInt): Unit = extern

  /**
  */
  def uv_free_interface_addresses(addresses : Ptr[uv_interface_address_t], count : CInt): Unit = extern

  /**
  */
  def uv_freeaddrinfo(ai : Ptr[addrinfo]): Unit = extern

  /**
  */
  def uv_fs_access(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, mode : CInt, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_chmod(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, mode : CInt, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_chown(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, uid : uv_uid_t, gid : uv_gid_t, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_close(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], file : uv_file, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_closedir(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], dir : Ptr[uv_dir_t], cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_copyfile(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, new_path : CString, flags : CInt, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_event_getpath(handle : Ptr[uv_fs_event_t], buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_fs_event_init(loop : Ptr[uv_loop_t], handle : Ptr[uv_fs_event_t]): CInt = extern

  /**
  */
  def uv_fs_event_start(handle : Ptr[uv_fs_event_t], cb : uv_fs_event_cb, path : CString, flags : CUnsignedInt): CInt = extern

  /**
  */
  def uv_fs_event_stop(handle : Ptr[uv_fs_event_t]): CInt = extern

  /**
  */
  def uv_fs_fchmod(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], file : uv_file, mode : CInt, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_fchown(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], file : uv_file, uid : uv_uid_t, gid : uv_gid_t, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_fdatasync(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], file : uv_file, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_fstat(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], file : uv_file, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_fsync(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], file : uv_file, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_ftruncate(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], file : uv_file, offset : int64_t, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_futime(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], file : uv_file, atime : Double, mtime : Double, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_get_path(_0 : Ptr[uv_fs_t]): CString = extern

  /**
  */
  def uv_fs_get_ptr(_0 : Ptr[uv_fs_t]): Ptr[Byte] = extern

  /**
  */
  def uv_fs_get_result(_0 : Ptr[uv_fs_t]): ssize_t = extern

  /**
  */
  def uv_fs_get_statbuf(_0 : Ptr[uv_fs_t]): Ptr[uv_stat_t] = extern

  /**
  */
  def uv_fs_get_system_error(_0 : Ptr[uv_fs_t]): CInt = extern

  /**
  */
  def uv_fs_get_type(_0 : Ptr[uv_fs_t]): uv_fs_type = extern

  /**
  */
  def uv_fs_lchown(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, uid : uv_uid_t, gid : uv_gid_t, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_link(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, new_path : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_lstat(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_lutime(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, atime : Double, mtime : Double, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_mkdir(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, mode : CInt, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_mkdtemp(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], tpl : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_mkstemp(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], tpl : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_open(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, flags : CInt, mode : CInt, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_opendir(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_poll_getpath(handle : Ptr[uv_fs_poll_t], buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_fs_poll_init(loop : Ptr[uv_loop_t], handle : Ptr[uv_fs_poll_t]): CInt = extern

  /**
  */
  def uv_fs_poll_start(handle : Ptr[uv_fs_poll_t], poll_cb : uv_fs_poll_cb, path : CString, interval : CUnsignedInt): CInt = extern

  /**
  */
  def uv_fs_poll_stop(handle : Ptr[uv_fs_poll_t]): CInt = extern

  /**
  */
  def uv_fs_read(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], file : uv_file, bufs : Ptr[uv_buf_t], nbufs : CUnsignedInt, offset : int64_t, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_readdir(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], dir : Ptr[uv_dir_t], cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_readlink(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_realpath(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_rename(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, new_path : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_req_cleanup(req : Ptr[uv_fs_t]): Unit = extern

  /**
  */
  def uv_fs_rmdir(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_scandir(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, flags : CInt, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_scandir_next(req : Ptr[uv_fs_t], ent : Ptr[uv_dirent_t]): CInt = extern

  /**
  */
  def uv_fs_sendfile(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], out_fd : uv_file, in_fd : uv_file, in_offset : int64_t, length : size_t, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_stat(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_statfs(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_symlink(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, new_path : CString, flags : CInt, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_unlink(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_utime(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], path : CString, atime : Double, mtime : Double, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_fs_write(loop : Ptr[uv_loop_t], req : Ptr[uv_fs_t], file : uv_file, bufs : Ptr[uv_buf_t], nbufs : CUnsignedInt, offset : int64_t, cb : uv_fs_cb): CInt = extern

  /**
  */
  def uv_get_available_memory(): uint64_t = extern

  /**
  */
  def uv_get_constrained_memory(): uint64_t = extern

  /**
  */
  def uv_get_free_memory(): uint64_t = extern

  /**
  */
  def uv_get_osfhandle(fd : CInt): uv_os_fd_t = extern

  /**
  */
  def uv_get_process_title(buffer : CString, size : size_t): CInt = extern

  /**
  */
  def uv_get_total_memory(): uint64_t = extern

  /**
  */
  def uv_getaddrinfo(loop : Ptr[uv_loop_t], req : Ptr[uv_getaddrinfo_t], getaddrinfo_cb : uv_getaddrinfo_cb, node : CString, service : CString, hints : Ptr[addrinfo]): CInt = extern

  /**
  */
  def uv_getnameinfo(loop : Ptr[uv_loop_t], req : Ptr[uv_getnameinfo_t], getnameinfo_cb : uv_getnameinfo_cb, addr : Ptr[sockaddr], flags : CInt): CInt = extern

  /**
  */
  def uv_getrusage(rusage : Ptr[uv_rusage_t]): CInt = extern

  /**
  */
  def uv_gettimeofday(tv : Ptr[uv_timeval64_t]): CInt = extern

  /**
  */
  def uv_guess_handle(file : uv_file): uv_handle_type = extern

  /**
  */
  def uv_handle_get_data(handle : Ptr[uv_handle_t]): Ptr[Byte] = extern

  /**
  */
  def uv_handle_get_loop(handle : Ptr[uv_handle_t]): Ptr[uv_loop_t] = extern

  /**
  */
  def uv_handle_get_type(handle : Ptr[uv_handle_t]): uv_handle_type = extern

  /**
  */
  def uv_handle_set_data(handle : Ptr[uv_handle_t], data : Ptr[Byte]): Unit = extern

  /**
  */
  def uv_handle_size(`type` : uv_handle_type): size_t = extern

  /**
  */
  def uv_handle_type_name(`type` : uv_handle_type): CString = extern

  /**
  */
  def uv_has_ref(_0 : Ptr[uv_handle_t]): CInt = extern

  /**
  */
  def uv_hrtime(): uint64_t = extern

  /**
  */
  def uv_idle_init(_0 : Ptr[uv_loop_t], idle : Ptr[uv_idle_t]): CInt = extern

  /**
  */
  def uv_idle_start(idle : Ptr[uv_idle_t], cb : uv_idle_cb): CInt = extern

  /**
  */
  def uv_idle_stop(idle : Ptr[uv_idle_t]): CInt = extern

  /**
  */
  def uv_if_indextoiid(ifindex : CUnsignedInt, buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_if_indextoname(ifindex : CUnsignedInt, buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_inet_ntop(af : CInt, src : Ptr[Byte], dst : CString, size : size_t): CInt = extern

  /**
  */
  def uv_inet_pton(af : CInt, src : CString, dst : Ptr[Byte]): CInt = extern

  /**
  */
  def uv_interface_addresses(addresses : Ptr[Ptr[uv_interface_address_t]], count : Ptr[CInt]): CInt = extern

  /**
  */
  def uv_ip4_addr(ip : CString, port : CInt, addr : Ptr[sockaddr_in]): CInt = extern

  /**
  */
  def uv_ip4_name(src : Ptr[sockaddr_in], dst : CString, size : size_t): CInt = extern

  /**
  */
  def uv_ip6_addr(ip : CString, port : CInt, addr : Ptr[sockaddr_in6]): CInt = extern

  /**
  */
  def uv_ip6_name(src : Ptr[sockaddr_in6], dst : CString, size : size_t): CInt = extern

  /**
  */
  def uv_ip_name(src : Ptr[sockaddr], dst : CString, size : size_t): CInt = extern

  /**
  */
  def uv_is_active(handle : Ptr[uv_handle_t]): CInt = extern

  /**
  */
  def uv_is_closing(handle : Ptr[uv_handle_t]): CInt = extern

  /**
  */
  def uv_is_readable(handle : Ptr[uv_stream_t]): CInt = extern

  /**
  */
  def uv_is_writable(handle : Ptr[uv_stream_t]): CInt = extern

  /**
  */
  def uv_key_create(key : Ptr[uv_key_t]): CInt = extern

  /**
  */
  def uv_key_delete(key : Ptr[uv_key_t]): Unit = extern

  /**
  */
  def uv_key_get(key : Ptr[uv_key_t]): Ptr[Byte] = extern

  /**
  */
  def uv_key_set(key : Ptr[uv_key_t], value : Ptr[Byte]): Unit = extern

  /**
  */
  def uv_kill(pid : CInt, signum : CInt): CInt = extern

  /**
  */
  def uv_library_shutdown(): Unit = extern

  /**
  */
  def uv_listen(stream : Ptr[uv_stream_t], backlog : CInt, cb : uv_connection_cb): CInt = extern

  /**
  */
  def uv_loadavg(avg : CArray[Double, Nat._3]): Unit = extern

  /**
  */
  def uv_loop_alive(loop : Ptr[uv_loop_t]): CInt = extern

  /**
  */
  def uv_loop_close(loop : Ptr[uv_loop_t]): CInt = extern

  /**
  */
  def uv_loop_configure(loop : Ptr[uv_loop_t], option : uv_loop_option, rest: Any*): CInt = extern

  /**
  */
  def uv_loop_delete(_0 : Ptr[uv_loop_t]): Unit = extern

  /**
  */
  def uv_loop_fork(loop : Ptr[uv_loop_t]): CInt = extern

  /**
  */
  def uv_loop_get_data(_0 : Ptr[uv_loop_t]): Ptr[Byte] = extern

  /**
  */
  def uv_loop_init(loop : Ptr[uv_loop_t]): CInt = extern

  /**
  */
  def uv_loop_new(): Ptr[uv_loop_t] = extern

  /**
  */
  def uv_loop_set_data(_0 : Ptr[uv_loop_t], data : Ptr[Byte]): Unit = extern

  /**
  */
  def uv_loop_size(): size_t = extern

  /**
  */
  def uv_metrics_idle_time(loop : Ptr[uv_loop_t]): uint64_t = extern

  /**
  */
  def uv_metrics_info(loop : Ptr[uv_loop_t], metrics : Ptr[uv_metrics_t]): CInt = extern

  /**
  */
  def uv_mutex_destroy(handle : Ptr[uv_mutex_t]): Unit = extern

  /**
  */
  def uv_mutex_init(handle : Ptr[uv_mutex_t]): CInt = extern

  /**
  */
  def uv_mutex_init_recursive(handle : Ptr[uv_mutex_t]): CInt = extern

  /**
  */
  def uv_mutex_lock(handle : Ptr[uv_mutex_t]): Unit = extern

  /**
  */
  def uv_mutex_trylock(handle : Ptr[uv_mutex_t]): CInt = extern

  /**
  */
  def uv_mutex_unlock(handle : Ptr[uv_mutex_t]): Unit = extern

  /**
  */
  def uv_now(_0 : Ptr[uv_loop_t]): uint64_t = extern

  /**
  */
  def uv_once(guard : Ptr[uv_once_t], callback : CFuncPtr0[Unit]): Unit = extern

  /**
  */
  def uv_open_osfhandle(os_fd : uv_os_fd_t): CInt = extern

  /**
  */
  def uv_os_environ(envitems : Ptr[Ptr[uv_env_item_t]], count : Ptr[CInt]): CInt = extern

  /**
  */
  def uv_os_free_environ(envitems : Ptr[uv_env_item_t], count : CInt): Unit = extern

  /**
  */
  def uv_os_free_group(grp : Ptr[uv_group_t]): Unit = extern

  /**
  */
  def uv_os_free_passwd(pwd : Ptr[uv_passwd_t]): Unit = extern

  /**
  */
  def uv_os_get_group(grp : Ptr[uv_group_t], gid : uv_uid_t): CInt = extern

  /**
  */
  def uv_os_get_passwd(pwd : Ptr[uv_passwd_t]): CInt = extern

  /**
  */
  def uv_os_get_passwd2(pwd : Ptr[uv_passwd_t], uid : uv_uid_t): CInt = extern

  /**
  */
  def uv_os_getenv(name : CString, buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_os_gethostname(buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_os_getpid(): uv_pid_t = extern

  /**
  */
  def uv_os_getppid(): uv_pid_t = extern

  /**
  */
  def uv_os_getpriority(pid : uv_pid_t, priority : Ptr[CInt]): CInt = extern

  /**
  */
  def uv_os_homedir(buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_os_setenv(name : CString, value : CString): CInt = extern

  /**
  */
  def uv_os_setpriority(pid : uv_pid_t, priority : CInt): CInt = extern

  /**
  */
  def uv_os_tmpdir(buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_os_uname(buffer : Ptr[uv_utsname_t]): CInt = extern

  /**
  */
  def uv_os_unsetenv(name : CString): CInt = extern

  /**
  */
  def uv_pipe(fds : CArray[uv_file, Nat._2], read_flags : CInt, write_flags : CInt): CInt = extern

  /**
  */
  def uv_pipe_bind(handle : Ptr[uv_pipe_t], name : CString): CInt = extern

  /**
  */
  def uv_pipe_bind2(handle : Ptr[uv_pipe_t], name : CString, namelen : size_t, flags : CUnsignedInt): CInt = extern

  /**
  */
  def uv_pipe_chmod(handle : Ptr[uv_pipe_t], flags : CInt): CInt = extern

  /**
  */
  def uv_pipe_connect(req : Ptr[uv_connect_t], handle : Ptr[uv_pipe_t], name : CString, cb : uv_connect_cb): Unit = extern

  /**
  */
  def uv_pipe_connect2(req : Ptr[uv_connect_t], handle : Ptr[uv_pipe_t], name : CString, namelen : size_t, flags : CUnsignedInt, cb : uv_connect_cb): CInt = extern

  /**
  */
  def uv_pipe_getpeername(handle : Ptr[uv_pipe_t], buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_pipe_getsockname(handle : Ptr[uv_pipe_t], buffer : CString, size : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_pipe_init(_0 : Ptr[uv_loop_t], handle : Ptr[uv_pipe_t], ipc : CInt): CInt = extern

  /**
  */
  def uv_pipe_open(_0 : Ptr[uv_pipe_t], file : uv_file): CInt = extern

  /**
  */
  def uv_pipe_pending_count(handle : Ptr[uv_pipe_t]): CInt = extern

  /**
  */
  def uv_pipe_pending_instances(handle : Ptr[uv_pipe_t], count : CInt): Unit = extern

  /**
  */
  def uv_pipe_pending_type(handle : Ptr[uv_pipe_t]): uv_handle_type = extern

  /**
  */
  def uv_poll_init(loop : Ptr[uv_loop_t], handle : Ptr[uv_poll_t], fd : CInt): CInt = extern

  /**
  */
  def uv_poll_init_socket(loop : Ptr[uv_loop_t], handle : Ptr[uv_poll_t], socket : uv_os_sock_t): CInt = extern

  /**
  */
  def uv_poll_start(handle : Ptr[uv_poll_t], events : CInt, cb : uv_poll_cb): CInt = extern

  /**
  */
  def uv_poll_stop(handle : Ptr[uv_poll_t]): CInt = extern

  /**
  */
  def uv_prepare_init(_0 : Ptr[uv_loop_t], prepare : Ptr[uv_prepare_t]): CInt = extern

  /**
  */
  def uv_prepare_start(prepare : Ptr[uv_prepare_t], cb : uv_prepare_cb): CInt = extern

  /**
  */
  def uv_prepare_stop(prepare : Ptr[uv_prepare_t]): CInt = extern

  /**
  */
  def uv_print_active_handles(loop : Ptr[uv_loop_t], stream : Ptr[FILE]): Unit = extern

  /**
  */
  def uv_print_all_handles(loop : Ptr[uv_loop_t], stream : Ptr[FILE]): Unit = extern

  /**
  */
  def uv_process_get_pid(_0 : Ptr[uv_process_t]): uv_pid_t = extern

  /**
  */
  def uv_process_kill(_0 : Ptr[uv_process_t], signum : CInt): CInt = extern

  /**
  */
  def uv_queue_work(loop : Ptr[uv_loop_t], req : Ptr[uv_work_t], work_cb : uv_work_cb, after_work_cb : uv_after_work_cb): CInt = extern

  /**
  */
  def uv_random(loop : Ptr[uv_loop_t], req : Ptr[uv_random_t], buf : Ptr[Byte], buflen : size_t, flags : CUnsignedInt, cb : uv_random_cb): CInt = extern

  /**
  */
  def uv_read_start(_0 : Ptr[uv_stream_t], alloc_cb : uv_alloc_cb, read_cb : uv_read_cb): CInt = extern

  /**
  */
  def uv_read_stop(_0 : Ptr[uv_stream_t]): CInt = extern

  /**
  */
  def uv_recv_buffer_size(handle : Ptr[uv_handle_t], value : Ptr[CInt]): CInt = extern

  /**
  */
  def uv_ref(_0 : Ptr[uv_handle_t]): Unit = extern

  /**
  */
  def uv_replace_allocator(malloc_func : uv_malloc_func, realloc_func : uv_realloc_func, calloc_func : uv_calloc_func, free_func : uv_free_func): CInt = extern

  /**
  */
  def uv_req_get_data(req : Ptr[uv_req_t]): Ptr[Byte] = extern

  /**
  */
  def uv_req_get_type(req : Ptr[uv_req_t]): uv_req_type = extern

  /**
  */
  def uv_req_set_data(req : Ptr[uv_req_t], data : Ptr[Byte]): Unit = extern

  /**
  */
  def uv_req_size(`type` : uv_req_type): size_t = extern

  /**
  */
  def uv_req_type_name(`type` : uv_req_type): CString = extern

  /**
  */
  def uv_resident_set_memory(rss : Ptr[size_t]): CInt = extern

  /**
  */
  def uv_run(_0 : Ptr[uv_loop_t], mode : uv_run_mode): CInt = extern

  /**
  */
  def uv_rwlock_destroy(rwlock : Ptr[uv_rwlock_t]): Unit = extern

  /**
  */
  def uv_rwlock_init(rwlock : Ptr[uv_rwlock_t]): CInt = extern

  /**
  */
  def uv_rwlock_rdlock(rwlock : Ptr[uv_rwlock_t]): Unit = extern

  /**
  */
  def uv_rwlock_rdunlock(rwlock : Ptr[uv_rwlock_t]): Unit = extern

  /**
  */
  def uv_rwlock_tryrdlock(rwlock : Ptr[uv_rwlock_t]): CInt = extern

  /**
  */
  def uv_rwlock_trywrlock(rwlock : Ptr[uv_rwlock_t]): CInt = extern

  /**
  */
  def uv_rwlock_wrlock(rwlock : Ptr[uv_rwlock_t]): Unit = extern

  /**
  */
  def uv_rwlock_wrunlock(rwlock : Ptr[uv_rwlock_t]): Unit = extern

  /**
  */
  def uv_sem_destroy(sem : Ptr[uv_sem_t]): Unit = extern

  /**
  */
  def uv_sem_init(sem : Ptr[uv_sem_t], value : CUnsignedInt): CInt = extern

  /**
  */
  def uv_sem_post(sem : Ptr[uv_sem_t]): Unit = extern

  /**
  */
  def uv_sem_trywait(sem : Ptr[uv_sem_t]): CInt = extern

  /**
  */
  def uv_sem_wait(sem : Ptr[uv_sem_t]): Unit = extern

  /**
  */
  def uv_send_buffer_size(handle : Ptr[uv_handle_t], value : Ptr[CInt]): CInt = extern

  /**
  */
  def uv_set_process_title(title : CString): CInt = extern

  /**
  */
  def uv_setup_args(argc : CInt, argv : Ptr[CString]): Ptr[CString] = extern

  /**
  */
  def uv_shutdown(req : Ptr[uv_shutdown_t], handle : Ptr[uv_stream_t], cb : uv_shutdown_cb): CInt = extern

  /**
  */
  def uv_signal_init(loop : Ptr[uv_loop_t], handle : Ptr[uv_signal_t]): CInt = extern

  /**
  */
  def uv_signal_start(handle : Ptr[uv_signal_t], signal_cb : uv_signal_cb, signum : CInt): CInt = extern

  /**
  */
  def uv_signal_start_oneshot(handle : Ptr[uv_signal_t], signal_cb : uv_signal_cb, signum : CInt): CInt = extern

  /**
  */
  def uv_signal_stop(handle : Ptr[uv_signal_t]): CInt = extern

  /**
  */
  def uv_sleep(msec : CUnsignedInt): Unit = extern

  /**
  */
  def uv_socketpair(`type` : CInt, protocol : CInt, socket_vector : CArray[uv_os_sock_t, Nat._2], flags0 : CInt, flags1 : CInt): CInt = extern

  /**
  */
  def uv_spawn(loop : Ptr[uv_loop_t], handle : Ptr[uv_process_t], options : Ptr[uv_process_options_t]): CInt = extern

  /**
  */
  def uv_stop(_0 : Ptr[uv_loop_t]): Unit = extern

  /**
  */
  def uv_stream_get_write_queue_size(stream : Ptr[uv_stream_t]): size_t = extern

  /**
  */
  def uv_stream_set_blocking(handle : Ptr[uv_stream_t], blocking : CInt): CInt = extern

  /**
  */
  def uv_strerror(err : CInt): CString = extern

  /**
  */
  def uv_strerror_r(err : CInt, buf : CString, buflen : size_t): CString = extern

  /**
  */
  def uv_tcp_bind(handle : Ptr[uv_tcp_t], addr : Ptr[sockaddr], flags : CUnsignedInt): CInt = extern

  /**
  */
  def uv_tcp_close_reset(handle : Ptr[uv_tcp_t], close_cb : uv_close_cb): CInt = extern

  /**
  */
  def uv_tcp_connect(req : Ptr[uv_connect_t], handle : Ptr[uv_tcp_t], addr : Ptr[sockaddr], cb : uv_connect_cb): CInt = extern

  /**
  */
  def uv_tcp_getpeername(handle : Ptr[uv_tcp_t], name : Ptr[sockaddr], namelen : Ptr[CInt]): CInt = extern

  /**
  */
  def uv_tcp_getsockname(handle : Ptr[uv_tcp_t], name : Ptr[sockaddr], namelen : Ptr[CInt]): CInt = extern

  /**
  */
  def uv_tcp_init(_0 : Ptr[uv_loop_t], handle : Ptr[uv_tcp_t]): CInt = extern

  /**
  */
  def uv_tcp_init_ex(_0 : Ptr[uv_loop_t], handle : Ptr[uv_tcp_t], flags : CUnsignedInt): CInt = extern

  /**
  */
  def uv_tcp_keepalive(handle : Ptr[uv_tcp_t], enable : CInt, delay : CUnsignedInt): CInt = extern

  /**
  */
  def uv_tcp_nodelay(handle : Ptr[uv_tcp_t], enable : CInt): CInt = extern

  /**
  */
  def uv_tcp_open(handle : Ptr[uv_tcp_t], sock : uv_os_sock_t): CInt = extern

  /**
  */
  def uv_tcp_simultaneous_accepts(handle : Ptr[uv_tcp_t], enable : CInt): CInt = extern

  /**
  */
  def uv_thread_create(tid : Ptr[uv_thread_t], entry : uv_thread_cb, arg : Ptr[Byte]): CInt = extern

  /**
  */
  def uv_thread_create_ex(tid : Ptr[uv_thread_t], params : Ptr[uv_thread_options_t], entry : uv_thread_cb, arg : Ptr[Byte]): CInt = extern

  /**
  */
  def uv_thread_equal(t1 : Ptr[uv_thread_t], t2 : Ptr[uv_thread_t]): CInt = extern

  /**
  */
  def uv_thread_getaffinity(tid : Ptr[uv_thread_t], cpumask : CString, mask_size : size_t): CInt = extern

  /**
  */
  def uv_thread_getcpu(): CInt = extern

  /**
  */
  def uv_thread_join(tid : Ptr[uv_thread_t]): CInt = extern

  /**
  */
  def uv_thread_self(): uv_thread_t = extern

  /**
  */
  def uv_thread_setaffinity(tid : Ptr[uv_thread_t], cpumask : CString, oldmask : CString, mask_size : size_t): CInt = extern

  /**
  */
  def uv_timer_again(handle : Ptr[uv_timer_t]): CInt = extern

  /**
  */
  def uv_timer_get_due_in(handle : Ptr[uv_timer_t]): uint64_t = extern

  /**
  */
  def uv_timer_get_repeat(handle : Ptr[uv_timer_t]): uint64_t = extern

  /**
  */
  def uv_timer_init(_0 : Ptr[uv_loop_t], handle : Ptr[uv_timer_t]): CInt = extern

  /**
  */
  def uv_timer_set_repeat(handle : Ptr[uv_timer_t], repeat : uint64_t): Unit = extern

  /**
  */
  def uv_timer_start(handle : Ptr[uv_timer_t], cb : uv_timer_cb, timeout : uint64_t, repeat : uint64_t): CInt = extern

  /**
  */
  def uv_timer_stop(handle : Ptr[uv_timer_t]): CInt = extern

  /**
  */
  def uv_translate_sys_error(sys_errno : CInt): CInt = extern

  /**
  */
  def uv_try_write(handle : Ptr[uv_stream_t], bufs : Ptr[uv_buf_t], nbufs : CUnsignedInt): CInt = extern

  /**
  */
  def uv_try_write2(handle : Ptr[uv_stream_t], bufs : Ptr[uv_buf_t], nbufs : CUnsignedInt, send_handle : Ptr[uv_stream_t]): CInt = extern

  /**
  */
  def uv_tty_get_vterm_state(state : Ptr[uv_tty_vtermstate_t]): CInt = extern

  /**
  */
  def uv_tty_get_winsize(_0 : Ptr[uv_tty_t], width : Ptr[CInt], height : Ptr[CInt]): CInt = extern

  /**
  */
  def uv_tty_init(_0 : Ptr[uv_loop_t], _1 : Ptr[uv_tty_t], fd : uv_file, readable : CInt): CInt = extern

  /**
  */
  def uv_tty_reset_mode(): CInt = extern

  /**
  */
  def uv_tty_set_mode(_0 : Ptr[uv_tty_t], mode : uv_tty_mode_t): CInt = extern

  /**
  */
  def uv_tty_set_vterm_state(state : uv_tty_vtermstate_t): Unit = extern

  /**
  */
  def uv_udp_bind(handle : Ptr[uv_udp_t], addr : Ptr[sockaddr], flags : CUnsignedInt): CInt = extern

  /**
  */
  def uv_udp_connect(handle : Ptr[uv_udp_t], addr : Ptr[sockaddr]): CInt = extern

  /**
  */
  def uv_udp_get_send_queue_count(handle : Ptr[uv_udp_t]): size_t = extern

  /**
  */
  def uv_udp_get_send_queue_size(handle : Ptr[uv_udp_t]): size_t = extern

  /**
  */
  def uv_udp_getpeername(handle : Ptr[uv_udp_t], name : Ptr[sockaddr], namelen : Ptr[CInt]): CInt = extern

  /**
  */
  def uv_udp_getsockname(handle : Ptr[uv_udp_t], name : Ptr[sockaddr], namelen : Ptr[CInt]): CInt = extern

  /**
  */
  def uv_udp_init(_0 : Ptr[uv_loop_t], handle : Ptr[uv_udp_t]): CInt = extern

  /**
  */
  def uv_udp_init_ex(_0 : Ptr[uv_loop_t], handle : Ptr[uv_udp_t], flags : CUnsignedInt): CInt = extern

  /**
  */
  def uv_udp_open(handle : Ptr[uv_udp_t], sock : uv_os_sock_t): CInt = extern

  /**
  */
  def uv_udp_recv_start(handle : Ptr[uv_udp_t], alloc_cb : uv_alloc_cb, recv_cb : uv_udp_recv_cb): CInt = extern

  /**
  */
  def uv_udp_recv_stop(handle : Ptr[uv_udp_t]): CInt = extern

  /**
  */
  def uv_udp_send(req : Ptr[uv_udp_send_t], handle : Ptr[uv_udp_t], bufs : Ptr[uv_buf_t], nbufs : CUnsignedInt, addr : Ptr[sockaddr], send_cb : uv_udp_send_cb): CInt = extern

  /**
  */
  def uv_udp_set_broadcast(handle : Ptr[uv_udp_t], on : CInt): CInt = extern

  /**
  */
  def uv_udp_set_membership(handle : Ptr[uv_udp_t], multicast_addr : CString, interface_addr : CString, membership : uv_membership): CInt = extern

  /**
  */
  def uv_udp_set_multicast_interface(handle : Ptr[uv_udp_t], interface_addr : CString): CInt = extern

  /**
  */
  def uv_udp_set_multicast_loop(handle : Ptr[uv_udp_t], on : CInt): CInt = extern

  /**
  */
  def uv_udp_set_multicast_ttl(handle : Ptr[uv_udp_t], ttl : CInt): CInt = extern

  /**
  */
  def uv_udp_set_source_membership(handle : Ptr[uv_udp_t], multicast_addr : CString, interface_addr : CString, source_addr : CString, membership : uv_membership): CInt = extern

  /**
  */
  def uv_udp_set_ttl(handle : Ptr[uv_udp_t], ttl : CInt): CInt = extern

  /**
  */
  def uv_udp_try_send(handle : Ptr[uv_udp_t], bufs : Ptr[uv_buf_t], nbufs : CUnsignedInt, addr : Ptr[sockaddr]): CInt = extern

  /**
  */
  def uv_udp_using_recvmmsg(handle : Ptr[uv_udp_t]): CInt = extern

  /**
  */
  def uv_unref(_0 : Ptr[uv_handle_t]): Unit = extern

  /**
  */
  def uv_update_time(_0 : Ptr[uv_loop_t]): Unit = extern

  /**
  */
  def uv_uptime(uptime : Ptr[Double]): CInt = extern

  /**
  */
  def uv_version(): CUnsignedInt = extern

  /**
  */
  def uv_version_string(): CString = extern

  /**
  */
  def uv_walk(loop : Ptr[uv_loop_t], walk_cb : uv_walk_cb, arg : Ptr[Byte]): Unit = extern

  /**
  */
  def uv_write(req : Ptr[uv_write_t], handle : Ptr[uv_stream_t], bufs : Ptr[uv_buf_t], nbufs : CUnsignedInt, cb : uv_write_cb): CInt = extern

  /**
  */
  def uv_write2(req : Ptr[uv_write_t], handle : Ptr[uv_stream_t], bufs : Ptr[uv_buf_t], nbufs : CUnsignedInt, send_handle : Ptr[uv_stream_t], cb : uv_write_cb): CInt = extern


object functions:
  import _root_.libuv.enumerations.*
  import _root_.libuv.predef.*
  import _root_.libuv.aliases.*
  import _root_.libuv.structs.*
  import _root_.libuv.unions.*
  import extern_functions.*
  export extern_functions.*

  /**
  */
  def uv_buf_init(base : CString, len : CUnsignedInt)(__return : Ptr[uv_buf_t]): Unit = 
    __sn_wrap_libuv_uv_buf_init(base, len, __return)

  /**
  */
  def uv_buf_init(base : CString, len : CUnsignedInt)(using Zone): uv_buf_t = 
    val __ptr_0: Ptr[uv_buf_t] = alloc[uv_buf_t](1)
    __sn_wrap_libuv_uv_buf_init(base, len, (__ptr_0 + 0))
    !(__ptr_0 + 0)

object constants:
  val UV_PIPE_NO_TRUNCATE: CUnsignedInt = 1.toUInt
  
object types:
  export _root_.libuv.structs.*
  export _root_.libuv.aliases.*
  export _root_.libuv.unions.*
  export _root_.libuv.enumerations.*

object all:
  export _root_.libuv.enumerations.uv_clock_id
  export _root_.libuv.enumerations.uv_dirent_type_t
  export _root_.libuv.enumerations.uv_errno_t
  export _root_.libuv.enumerations.uv_fs_event
  export _root_.libuv.enumerations.uv_fs_event_flags
  export _root_.libuv.enumerations.uv_fs_type
  export _root_.libuv.enumerations.uv_handle_type
  export _root_.libuv.enumerations.uv_loop_option
  export _root_.libuv.enumerations.uv_membership
  export _root_.libuv.enumerations.uv_poll_event
  export _root_.libuv.enumerations.uv_process_flags
  export _root_.libuv.enumerations.uv_req_type
  export _root_.libuv.enumerations.uv_run_mode
  export _root_.libuv.enumerations.uv_stdio_flags
  export _root_.libuv.enumerations.uv_tcp_flags
  export _root_.libuv.enumerations.uv_thread_create_flags
  export _root_.libuv.enumerations.uv_tty_mode_t
  export _root_.libuv.enumerations.uv_tty_vtermstate_t
  export _root_.libuv.enumerations.uv_udp_flags
  export _root_.libuv.aliases.DIR
  export _root_.libuv.aliases.FILE
  export _root_.libuv.aliases.__darwin_mach_port_name_t
  export _root_.libuv.aliases.__darwin_mach_port_t
  export _root_.libuv.aliases.__darwin_natural_t
  export _root_.libuv.aliases.__uint16_t
  export _root_.libuv.aliases.__uint64_t
  export _root_.libuv.aliases.__uint8_t
  export _root_.libuv.aliases.addrinfo
  export _root_.libuv.aliases.gid_t
  export _root_.libuv.aliases.int32_t
  export _root_.libuv.aliases.int64_t
  export _root_.libuv.aliases.mach_port_t
  export _root_.libuv.aliases.mode_t
  export _root_.libuv.aliases.off_t
  export _root_.libuv.aliases.pid_t
  export _root_.libuv.aliases.pthread_cond_t
  export _root_.libuv.aliases.pthread_key_t
  export _root_.libuv.aliases.pthread_mutex_t
  export _root_.libuv.aliases.pthread_once_t
  export _root_.libuv.aliases.pthread_rwlock_t
  export _root_.libuv.aliases.pthread_t
  export _root_.libuv.aliases.semaphore_t
  export _root_.libuv.aliases.size_t
  export _root_.libuv.aliases.sockaddr
  export _root_.libuv.aliases.sockaddr_in
  export _root_.libuv.aliases.sockaddr_in6
  export _root_.libuv.aliases.sockaddr_storage
  export _root_.libuv.aliases.ssize_t
  export _root_.libuv.aliases.termios
  export _root_.libuv.aliases.uid_t
  export _root_.libuv.aliases.uint64_t
  export _root_.libuv.aliases.uv__io_cb
  export _root_.libuv.aliases.uv_after_work_cb
  export _root_.libuv.aliases.uv_alloc_cb
  export _root_.libuv.aliases.uv_async_cb
  export _root_.libuv.aliases.uv_calloc_func
  export _root_.libuv.aliases.uv_check_cb
  export _root_.libuv.aliases.uv_close_cb
  export _root_.libuv.aliases.uv_cond_t
  export _root_.libuv.aliases.uv_connect_cb
  export _root_.libuv.aliases.uv_connection_cb
  export _root_.libuv.aliases.uv_exit_cb
  export _root_.libuv.aliases.uv_file
  export _root_.libuv.aliases.uv_free_func
  export _root_.libuv.aliases.uv_fs_cb
  export _root_.libuv.aliases.uv_fs_event_cb
  export _root_.libuv.aliases.uv_fs_poll_cb
  export _root_.libuv.aliases.uv_getaddrinfo_cb
  export _root_.libuv.aliases.uv_getnameinfo_cb
  export _root_.libuv.aliases.uv_gid_t
  export _root_.libuv.aliases.uv_idle_cb
  export _root_.libuv.aliases.uv_key_t
  export _root_.libuv.aliases.uv_malloc_func
  export _root_.libuv.aliases.uv_mutex_t
  export _root_.libuv.aliases.uv_once_t
  export _root_.libuv.aliases.uv_os_fd_t
  export _root_.libuv.aliases.uv_os_sock_t
  export _root_.libuv.aliases.uv_pid_t
  export _root_.libuv.aliases.uv_poll_cb
  export _root_.libuv.aliases.uv_prepare_cb
  export _root_.libuv.aliases.uv_random_cb
  export _root_.libuv.aliases.uv_read_cb
  export _root_.libuv.aliases.uv_realloc_func
  export _root_.libuv.aliases.uv_rwlock_t
  export _root_.libuv.aliases.uv_sem_t
  export _root_.libuv.aliases.uv_shutdown_cb
  export _root_.libuv.aliases.uv_signal_cb
  export _root_.libuv.aliases.uv_thread_cb
  export _root_.libuv.aliases.uv_thread_t
  export _root_.libuv.aliases.uv_timer_cb
  export _root_.libuv.aliases.uv_udp_recv_cb
  export _root_.libuv.aliases.uv_udp_send_cb
  export _root_.libuv.aliases.uv_uid_t
  export _root_.libuv.aliases.uv_walk_cb
  export _root_.libuv.aliases.uv_work_cb
  export _root_.libuv.aliases.uv_write_cb
  export _root_.libuv.structs._uv_barrier
  export _root_.libuv.structs.uv__dirent_t
  export _root_.libuv.structs.uv__io_s
  export _root_.libuv.structs.uv__io_t
  export _root_.libuv.structs.uv__queue
  export _root_.libuv.structs.uv__work
  export _root_.libuv.structs.uv_async_s
  export _root_.libuv.structs.uv_async_t
  export _root_.libuv.structs.uv_barrier_t
  export _root_.libuv.structs.uv_buf_t
  export _root_.libuv.structs.uv_check_s
  export _root_.libuv.structs.uv_check_t
  export _root_.libuv.structs.uv_connect_s
  export _root_.libuv.structs.uv_connect_t
  export _root_.libuv.structs.uv_cpu_info_s
  export _root_.libuv.structs.uv_cpu_info_t
  export _root_.libuv.structs.uv_cpu_times_s
  export _root_.libuv.structs.uv_dir_s
  export _root_.libuv.structs.uv_dir_t
  export _root_.libuv.structs.uv_dirent_s
  export _root_.libuv.structs.uv_dirent_t
  export _root_.libuv.structs.uv_env_item_s
  export _root_.libuv.structs.uv_env_item_t
  export _root_.libuv.structs.uv_fs_event_s
  export _root_.libuv.structs.uv_fs_event_t
  export _root_.libuv.structs.uv_fs_poll_s
  export _root_.libuv.structs.uv_fs_poll_t
  export _root_.libuv.structs.uv_fs_s
  export _root_.libuv.structs.uv_fs_t
  export _root_.libuv.structs.uv_getaddrinfo_s
  export _root_.libuv.structs.uv_getaddrinfo_t
  export _root_.libuv.structs.uv_getnameinfo_s
  export _root_.libuv.structs.uv_getnameinfo_t
  export _root_.libuv.structs.uv_group_s
  export _root_.libuv.structs.uv_group_t
  export _root_.libuv.structs.uv_handle_s
  export _root_.libuv.structs.uv_handle_t
  export _root_.libuv.structs.uv_idle_s
  export _root_.libuv.structs.uv_idle_t
  export _root_.libuv.structs.uv_interface_address_s
  export _root_.libuv.structs.uv_interface_address_t
  export _root_.libuv.structs.uv_lib_t
  export _root_.libuv.structs.uv_loop_s
  export _root_.libuv.structs.uv_loop_t
  export _root_.libuv.structs.uv_metrics_s
  export _root_.libuv.structs.uv_metrics_t
  export _root_.libuv.structs.uv_passwd_s
  export _root_.libuv.structs.uv_passwd_t
  export _root_.libuv.structs.uv_pipe_s
  export _root_.libuv.structs.uv_pipe_t
  export _root_.libuv.structs.uv_poll_s
  export _root_.libuv.structs.uv_poll_t
  export _root_.libuv.structs.uv_prepare_s
  export _root_.libuv.structs.uv_prepare_t
  export _root_.libuv.structs.uv_process_options_s
  export _root_.libuv.structs.uv_process_options_t
  export _root_.libuv.structs.uv_process_s
  export _root_.libuv.structs.uv_process_t
  export _root_.libuv.structs.uv_random_s
  export _root_.libuv.structs.uv_random_t
  export _root_.libuv.structs.uv_req_s
  export _root_.libuv.structs.uv_req_t
  export _root_.libuv.structs.uv_rusage_t
  export _root_.libuv.structs.uv_shutdown_s
  export _root_.libuv.structs.uv_shutdown_t
  export _root_.libuv.structs.uv_signal_s
  export _root_.libuv.structs.uv_signal_t
  export _root_.libuv.structs.uv_stat_t
  export _root_.libuv.structs.uv_statfs_s
  export _root_.libuv.structs.uv_statfs_t
  export _root_.libuv.structs.uv_stdio_container_s
  export _root_.libuv.structs.uv_stdio_container_t
  export _root_.libuv.structs.uv_stream_s
  export _root_.libuv.structs.uv_stream_t
  export _root_.libuv.structs.uv_tcp_s
  export _root_.libuv.structs.uv_tcp_t
  export _root_.libuv.structs.uv_thread_options_s
  export _root_.libuv.structs.uv_thread_options_t
  export _root_.libuv.structs.uv_timer_s
  export _root_.libuv.structs.uv_timer_t
  export _root_.libuv.structs.uv_timespec64_t
  export _root_.libuv.structs.uv_timespec_t
  export _root_.libuv.structs.uv_timeval64_t
  export _root_.libuv.structs.uv_timeval_t
  export _root_.libuv.structs.uv_tty_s
  export _root_.libuv.structs.uv_tty_t
  export _root_.libuv.structs.uv_udp_s
  export _root_.libuv.structs.uv_udp_send_s
  export _root_.libuv.structs.uv_udp_send_t
  export _root_.libuv.structs.uv_udp_t
  export _root_.libuv.structs.uv_utsname_s
  export _root_.libuv.structs.uv_utsname_t
  export _root_.libuv.structs.uv_work_s
  export _root_.libuv.structs.uv_work_t
  export _root_.libuv.structs.uv_write_s
  export _root_.libuv.structs.uv_write_t
  export _root_.libuv.unions.uv_any_handle
  export _root_.libuv.unions.uv_any_req
  export _root_.libuv.functions.uv_accept
  export _root_.libuv.functions.uv_async_init
  export _root_.libuv.functions.uv_async_send
  export _root_.libuv.functions.uv_available_parallelism
  export _root_.libuv.functions.uv_backend_fd
  export _root_.libuv.functions.uv_backend_timeout
  export _root_.libuv.functions.uv_barrier_destroy
  export _root_.libuv.functions.uv_barrier_init
  export _root_.libuv.functions.uv_barrier_wait
  export _root_.libuv.functions.uv_cancel
  export _root_.libuv.functions.uv_chdir
  export _root_.libuv.functions.uv_check_init
  export _root_.libuv.functions.uv_check_start
  export _root_.libuv.functions.uv_check_stop
  export _root_.libuv.functions.uv_clock_gettime
  export _root_.libuv.functions.uv_close
  export _root_.libuv.functions.uv_cond_broadcast
  export _root_.libuv.functions.uv_cond_destroy
  export _root_.libuv.functions.uv_cond_init
  export _root_.libuv.functions.uv_cond_signal
  export _root_.libuv.functions.uv_cond_timedwait
  export _root_.libuv.functions.uv_cond_wait
  export _root_.libuv.functions.uv_cpu_info
  export _root_.libuv.functions.uv_cpumask_size
  export _root_.libuv.functions.uv_cwd
  export _root_.libuv.functions.uv_default_loop
  export _root_.libuv.functions.uv_disable_stdio_inheritance
  export _root_.libuv.functions.uv_dlclose
  export _root_.libuv.functions.uv_dlerror
  export _root_.libuv.functions.uv_dlopen
  export _root_.libuv.functions.uv_dlsym
  export _root_.libuv.functions.uv_err_name
  export _root_.libuv.functions.uv_err_name_r
  export _root_.libuv.functions.uv_exepath
  export _root_.libuv.functions.uv_fileno
  export _root_.libuv.functions.uv_free_cpu_info
  export _root_.libuv.functions.uv_free_interface_addresses
  export _root_.libuv.functions.uv_freeaddrinfo
  export _root_.libuv.functions.uv_fs_access
  export _root_.libuv.functions.uv_fs_chmod
  export _root_.libuv.functions.uv_fs_chown
  export _root_.libuv.functions.uv_fs_close
  export _root_.libuv.functions.uv_fs_closedir
  export _root_.libuv.functions.uv_fs_copyfile
  export _root_.libuv.functions.uv_fs_event_getpath
  export _root_.libuv.functions.uv_fs_event_init
  export _root_.libuv.functions.uv_fs_event_start
  export _root_.libuv.functions.uv_fs_event_stop
  export _root_.libuv.functions.uv_fs_fchmod
  export _root_.libuv.functions.uv_fs_fchown
  export _root_.libuv.functions.uv_fs_fdatasync
  export _root_.libuv.functions.uv_fs_fstat
  export _root_.libuv.functions.uv_fs_fsync
  export _root_.libuv.functions.uv_fs_ftruncate
  export _root_.libuv.functions.uv_fs_futime
  export _root_.libuv.functions.uv_fs_get_path
  export _root_.libuv.functions.uv_fs_get_ptr
  export _root_.libuv.functions.uv_fs_get_result
  export _root_.libuv.functions.uv_fs_get_statbuf
  export _root_.libuv.functions.uv_fs_get_system_error
  export _root_.libuv.functions.uv_fs_get_type
  export _root_.libuv.functions.uv_fs_lchown
  export _root_.libuv.functions.uv_fs_link
  export _root_.libuv.functions.uv_fs_lstat
  export _root_.libuv.functions.uv_fs_lutime
  export _root_.libuv.functions.uv_fs_mkdir
  export _root_.libuv.functions.uv_fs_mkdtemp
  export _root_.libuv.functions.uv_fs_mkstemp
  export _root_.libuv.functions.uv_fs_open
  export _root_.libuv.functions.uv_fs_opendir
  export _root_.libuv.functions.uv_fs_poll_getpath
  export _root_.libuv.functions.uv_fs_poll_init
  export _root_.libuv.functions.uv_fs_poll_start
  export _root_.libuv.functions.uv_fs_poll_stop
  export _root_.libuv.functions.uv_fs_read
  export _root_.libuv.functions.uv_fs_readdir
  export _root_.libuv.functions.uv_fs_readlink
  export _root_.libuv.functions.uv_fs_realpath
  export _root_.libuv.functions.uv_fs_rename
  export _root_.libuv.functions.uv_fs_req_cleanup
  export _root_.libuv.functions.uv_fs_rmdir
  export _root_.libuv.functions.uv_fs_scandir
  export _root_.libuv.functions.uv_fs_scandir_next
  export _root_.libuv.functions.uv_fs_sendfile
  export _root_.libuv.functions.uv_fs_stat
  export _root_.libuv.functions.uv_fs_statfs
  export _root_.libuv.functions.uv_fs_symlink
  export _root_.libuv.functions.uv_fs_unlink
  export _root_.libuv.functions.uv_fs_utime
  export _root_.libuv.functions.uv_fs_write
  export _root_.libuv.functions.uv_get_available_memory
  export _root_.libuv.functions.uv_get_constrained_memory
  export _root_.libuv.functions.uv_get_free_memory
  export _root_.libuv.functions.uv_get_osfhandle
  export _root_.libuv.functions.uv_get_process_title
  export _root_.libuv.functions.uv_get_total_memory
  export _root_.libuv.functions.uv_getaddrinfo
  export _root_.libuv.functions.uv_getnameinfo
  export _root_.libuv.functions.uv_getrusage
  export _root_.libuv.functions.uv_gettimeofday
  export _root_.libuv.functions.uv_guess_handle
  export _root_.libuv.functions.uv_handle_get_data
  export _root_.libuv.functions.uv_handle_get_loop
  export _root_.libuv.functions.uv_handle_get_type
  export _root_.libuv.functions.uv_handle_set_data
  export _root_.libuv.functions.uv_handle_size
  export _root_.libuv.functions.uv_handle_type_name
  export _root_.libuv.functions.uv_has_ref
  export _root_.libuv.functions.uv_hrtime
  export _root_.libuv.functions.uv_idle_init
  export _root_.libuv.functions.uv_idle_start
  export _root_.libuv.functions.uv_idle_stop
  export _root_.libuv.functions.uv_if_indextoiid
  export _root_.libuv.functions.uv_if_indextoname
  export _root_.libuv.functions.uv_inet_ntop
  export _root_.libuv.functions.uv_inet_pton
  export _root_.libuv.functions.uv_interface_addresses
  export _root_.libuv.functions.uv_ip4_addr
  export _root_.libuv.functions.uv_ip4_name
  export _root_.libuv.functions.uv_ip6_addr
  export _root_.libuv.functions.uv_ip6_name
  export _root_.libuv.functions.uv_ip_name
  export _root_.libuv.functions.uv_is_active
  export _root_.libuv.functions.uv_is_closing
  export _root_.libuv.functions.uv_is_readable
  export _root_.libuv.functions.uv_is_writable
  export _root_.libuv.functions.uv_key_create
  export _root_.libuv.functions.uv_key_delete
  export _root_.libuv.functions.uv_key_get
  export _root_.libuv.functions.uv_key_set
  export _root_.libuv.functions.uv_kill
  export _root_.libuv.functions.uv_library_shutdown
  export _root_.libuv.functions.uv_listen
  export _root_.libuv.functions.uv_loadavg
  export _root_.libuv.functions.uv_loop_alive
  export _root_.libuv.functions.uv_loop_close
  export _root_.libuv.functions.uv_loop_configure
  export _root_.libuv.functions.uv_loop_delete
  export _root_.libuv.functions.uv_loop_fork
  export _root_.libuv.functions.uv_loop_get_data
  export _root_.libuv.functions.uv_loop_init
  export _root_.libuv.functions.uv_loop_new
  export _root_.libuv.functions.uv_loop_set_data
  export _root_.libuv.functions.uv_loop_size
  export _root_.libuv.functions.uv_metrics_idle_time
  export _root_.libuv.functions.uv_metrics_info
  export _root_.libuv.functions.uv_mutex_destroy
  export _root_.libuv.functions.uv_mutex_init
  export _root_.libuv.functions.uv_mutex_init_recursive
  export _root_.libuv.functions.uv_mutex_lock
  export _root_.libuv.functions.uv_mutex_trylock
  export _root_.libuv.functions.uv_mutex_unlock
  export _root_.libuv.functions.uv_now
  export _root_.libuv.functions.uv_once
  export _root_.libuv.functions.uv_open_osfhandle
  export _root_.libuv.functions.uv_os_environ
  export _root_.libuv.functions.uv_os_free_environ
  export _root_.libuv.functions.uv_os_free_group
  export _root_.libuv.functions.uv_os_free_passwd
  export _root_.libuv.functions.uv_os_get_group
  export _root_.libuv.functions.uv_os_get_passwd
  export _root_.libuv.functions.uv_os_get_passwd2
  export _root_.libuv.functions.uv_os_getenv
  export _root_.libuv.functions.uv_os_gethostname
  export _root_.libuv.functions.uv_os_getpid
  export _root_.libuv.functions.uv_os_getppid
  export _root_.libuv.functions.uv_os_getpriority
  export _root_.libuv.functions.uv_os_homedir
  export _root_.libuv.functions.uv_os_setenv
  export _root_.libuv.functions.uv_os_setpriority
  export _root_.libuv.functions.uv_os_tmpdir
  export _root_.libuv.functions.uv_os_uname
  export _root_.libuv.functions.uv_os_unsetenv
  export _root_.libuv.functions.uv_pipe
  export _root_.libuv.functions.uv_pipe_bind
  export _root_.libuv.functions.uv_pipe_bind2
  export _root_.libuv.functions.uv_pipe_chmod
  export _root_.libuv.functions.uv_pipe_connect
  export _root_.libuv.functions.uv_pipe_connect2
  export _root_.libuv.functions.uv_pipe_getpeername
  export _root_.libuv.functions.uv_pipe_getsockname
  export _root_.libuv.functions.uv_pipe_init
  export _root_.libuv.functions.uv_pipe_open
  export _root_.libuv.functions.uv_pipe_pending_count
  export _root_.libuv.functions.uv_pipe_pending_instances
  export _root_.libuv.functions.uv_pipe_pending_type
  export _root_.libuv.functions.uv_poll_init
  export _root_.libuv.functions.uv_poll_init_socket
  export _root_.libuv.functions.uv_poll_start
  export _root_.libuv.functions.uv_poll_stop
  export _root_.libuv.functions.uv_prepare_init
  export _root_.libuv.functions.uv_prepare_start
  export _root_.libuv.functions.uv_prepare_stop
  export _root_.libuv.functions.uv_print_active_handles
  export _root_.libuv.functions.uv_print_all_handles
  export _root_.libuv.functions.uv_process_get_pid
  export _root_.libuv.functions.uv_process_kill
  export _root_.libuv.functions.uv_queue_work
  export _root_.libuv.functions.uv_random
  export _root_.libuv.functions.uv_read_start
  export _root_.libuv.functions.uv_read_stop
  export _root_.libuv.functions.uv_recv_buffer_size
  export _root_.libuv.functions.uv_ref
  export _root_.libuv.functions.uv_replace_allocator
  export _root_.libuv.functions.uv_req_get_data
  export _root_.libuv.functions.uv_req_get_type
  export _root_.libuv.functions.uv_req_set_data
  export _root_.libuv.functions.uv_req_size
  export _root_.libuv.functions.uv_req_type_name
  export _root_.libuv.functions.uv_resident_set_memory
  export _root_.libuv.functions.uv_run
  export _root_.libuv.functions.uv_rwlock_destroy
  export _root_.libuv.functions.uv_rwlock_init
  export _root_.libuv.functions.uv_rwlock_rdlock
  export _root_.libuv.functions.uv_rwlock_rdunlock
  export _root_.libuv.functions.uv_rwlock_tryrdlock
  export _root_.libuv.functions.uv_rwlock_trywrlock
  export _root_.libuv.functions.uv_rwlock_wrlock
  export _root_.libuv.functions.uv_rwlock_wrunlock
  export _root_.libuv.functions.uv_sem_destroy
  export _root_.libuv.functions.uv_sem_init
  export _root_.libuv.functions.uv_sem_post
  export _root_.libuv.functions.uv_sem_trywait
  export _root_.libuv.functions.uv_sem_wait
  export _root_.libuv.functions.uv_send_buffer_size
  export _root_.libuv.functions.uv_set_process_title
  export _root_.libuv.functions.uv_setup_args
  export _root_.libuv.functions.uv_shutdown
  export _root_.libuv.functions.uv_signal_init
  export _root_.libuv.functions.uv_signal_start
  export _root_.libuv.functions.uv_signal_start_oneshot
  export _root_.libuv.functions.uv_signal_stop
  export _root_.libuv.functions.uv_sleep
  export _root_.libuv.functions.uv_socketpair
  export _root_.libuv.functions.uv_spawn
  export _root_.libuv.functions.uv_stop
  export _root_.libuv.functions.uv_stream_get_write_queue_size
  export _root_.libuv.functions.uv_stream_set_blocking
  export _root_.libuv.functions.uv_strerror
  export _root_.libuv.functions.uv_strerror_r
  export _root_.libuv.functions.uv_tcp_bind
  export _root_.libuv.functions.uv_tcp_close_reset
  export _root_.libuv.functions.uv_tcp_connect
  export _root_.libuv.functions.uv_tcp_getpeername
  export _root_.libuv.functions.uv_tcp_getsockname
  export _root_.libuv.functions.uv_tcp_init
  export _root_.libuv.functions.uv_tcp_init_ex
  export _root_.libuv.functions.uv_tcp_keepalive
  export _root_.libuv.functions.uv_tcp_nodelay
  export _root_.libuv.functions.uv_tcp_open
  export _root_.libuv.functions.uv_tcp_simultaneous_accepts
  export _root_.libuv.functions.uv_thread_create
  export _root_.libuv.functions.uv_thread_create_ex
  export _root_.libuv.functions.uv_thread_equal
  export _root_.libuv.functions.uv_thread_getaffinity
  export _root_.libuv.functions.uv_thread_getcpu
  export _root_.libuv.functions.uv_thread_join
  export _root_.libuv.functions.uv_thread_self
  export _root_.libuv.functions.uv_thread_setaffinity
  export _root_.libuv.functions.uv_timer_again
  export _root_.libuv.functions.uv_timer_get_due_in
  export _root_.libuv.functions.uv_timer_get_repeat
  export _root_.libuv.functions.uv_timer_init
  export _root_.libuv.functions.uv_timer_set_repeat
  export _root_.libuv.functions.uv_timer_start
  export _root_.libuv.functions.uv_timer_stop
  export _root_.libuv.functions.uv_translate_sys_error
  export _root_.libuv.functions.uv_try_write
  export _root_.libuv.functions.uv_try_write2
  export _root_.libuv.functions.uv_tty_get_vterm_state
  export _root_.libuv.functions.uv_tty_get_winsize
  export _root_.libuv.functions.uv_tty_init
  export _root_.libuv.functions.uv_tty_reset_mode
  export _root_.libuv.functions.uv_tty_set_mode
  export _root_.libuv.functions.uv_tty_set_vterm_state
  export _root_.libuv.functions.uv_udp_bind
  export _root_.libuv.functions.uv_udp_connect
  export _root_.libuv.functions.uv_udp_get_send_queue_count
  export _root_.libuv.functions.uv_udp_get_send_queue_size
  export _root_.libuv.functions.uv_udp_getpeername
  export _root_.libuv.functions.uv_udp_getsockname
  export _root_.libuv.functions.uv_udp_init
  export _root_.libuv.functions.uv_udp_init_ex
  export _root_.libuv.functions.uv_udp_open
  export _root_.libuv.functions.uv_udp_recv_start
  export _root_.libuv.functions.uv_udp_recv_stop
  export _root_.libuv.functions.uv_udp_send
  export _root_.libuv.functions.uv_udp_set_broadcast
  export _root_.libuv.functions.uv_udp_set_membership
  export _root_.libuv.functions.uv_udp_set_multicast_interface
  export _root_.libuv.functions.uv_udp_set_multicast_loop
  export _root_.libuv.functions.uv_udp_set_multicast_ttl
  export _root_.libuv.functions.uv_udp_set_source_membership
  export _root_.libuv.functions.uv_udp_set_ttl
  export _root_.libuv.functions.uv_udp_try_send
  export _root_.libuv.functions.uv_udp_using_recvmmsg
  export _root_.libuv.functions.uv_unref
  export _root_.libuv.functions.uv_update_time
  export _root_.libuv.functions.uv_uptime
  export _root_.libuv.functions.uv_version
  export _root_.libuv.functions.uv_version_string
  export _root_.libuv.functions.uv_walk
  export _root_.libuv.functions.uv_write
  export _root_.libuv.functions.uv_write2
  export _root_.libuv.functions.uv_buf_init