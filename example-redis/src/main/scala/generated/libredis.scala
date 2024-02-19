package libredis

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[libredis] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def int: CInt = eq.apply(t).toInt
      inline def uint: CUnsignedInt = eq.apply(t)
      inline def value: CUnsignedInt = eq.apply(t)

object enumerations:
  import predef.*

  /** */
  opaque type redisConnectionType = CUnsignedInt
  object redisConnectionType extends CEnumU[redisConnectionType]:
    given _tag: Tag[redisConnectionType] = Tag.UInt
    inline def define(inline a: Long): redisConnectionType = a.toUInt
    val REDIS_CONN_TCP = define(0)
    val REDIS_CONN_UNIX = define(1)
    val REDIS_CONN_USERFD = define(2)
    inline def getName(inline value: redisConnectionType): Option[String] =
      inline value match
        case REDIS_CONN_TCP    => Some("REDIS_CONN_TCP")
        case REDIS_CONN_UNIX   => Some("REDIS_CONN_UNIX")
        case REDIS_CONN_USERFD => Some("REDIS_CONN_USERFD")
        case _                 => None
    extension (a: redisConnectionType)
      inline def &(b: redisConnectionType): redisConnectionType = a & b
      inline def |(b: redisConnectionType): redisConnectionType = a | b
      inline def is(b: redisConnectionType): Boolean = (a & b) == b
  end redisConnectionType
end enumerations

object aliases:
  import _root_.libredis.enumerations.*
  import _root_.libredis.predef.*
  import _root_.libredis.aliases.*
  import _root_.libredis.structs.*

  /** */
  type redisAsyncPushFn = CFuncPtr2[Ptr[redisAsyncContext], Ptr[Byte], Unit]
  object redisAsyncPushFn:
    given _tag: Tag[redisAsyncPushFn] =
      Tag.materializeCFuncPtr2[Ptr[redisAsyncContext], Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr2[Ptr[redisAsyncContext], Ptr[Byte], Unit]
    ): redisAsyncPushFn = o
    extension (v: redisAsyncPushFn)
      inline def value: CFuncPtr2[Ptr[redisAsyncContext], Ptr[Byte], Unit] = v

  /** */
  opaque type redisFD = CInt
  object redisFD:
    given _tag: Tag[redisFD] = Tag.Int
    inline def apply(inline o: CInt): redisFD = o
    extension (v: redisFD) inline def value: CInt = v

  /** */
  type redisPushFn = CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit]
  object redisPushFn:
    given _tag: Tag[redisPushFn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit]
    ): redisPushFn = o
    extension (v: redisPushFn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit] = v

  /** */
  opaque type sds = CString
  object sds:
    given _tag: Tag[sds] = Tag.Ptr[CChar](Tag.Byte)
    inline def apply(inline o: CString): sds = o
    extension (v: sds) inline def value: CString = v

  type size_t = libc.stddef.size_t
  object size_t:
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t) inline def value: libc.stddef.size_t = v

  type ssize_t = posix.sys.types.ssize_t
  object ssize_t:
    val _tag: Tag[ssize_t] = summon[Tag[posix.sys.types.ssize_t]]
    inline def apply(inline o: posix.sys.types.ssize_t): ssize_t = o
    extension (v: ssize_t) inline def value: posix.sys.types.ssize_t = v

  type timeval = posix.sys.time.timeval
  object timeval:
    val _tag: Tag[timeval] = summon[Tag[posix.sys.time.timeval]]
    inline def apply(inline o: posix.sys.time.timeval): timeval = o
    extension (v: timeval) inline def value: posix.sys.time.timeval = v

  type uint16_t = scala.scalanative.unsigned.UShort
  object uint16_t:
    val _tag: Tag[uint16_t] = summon[Tag[scala.scalanative.unsigned.UShort]]
    inline def apply(inline o: scala.scalanative.unsigned.UShort): uint16_t = o
    extension (v: uint16_t)
      inline def value: scala.scalanative.unsigned.UShort = v

  type uint32_t = scala.scalanative.unsigned.UInt
  object uint32_t:
    val _tag: Tag[uint32_t] = summon[Tag[scala.scalanative.unsigned.UInt]]
    inline def apply(inline o: scala.scalanative.unsigned.UInt): uint32_t = o
    extension (v: uint32_t)
      inline def value: scala.scalanative.unsigned.UInt = v

  type uint64_t = scala.scalanative.unsigned.ULong
  object uint64_t:
    val _tag: Tag[uint64_t] = summon[Tag[scala.scalanative.unsigned.ULong]]
    inline def apply(inline o: scala.scalanative.unsigned.ULong): uint64_t = o
    extension (v: uint64_t)
      inline def value: scala.scalanative.unsigned.ULong = v

  type uint8_t = scala.scalanative.unsigned.UByte
  object uint8_t:
    val _tag: Tag[uint8_t] = summon[Tag[scala.scalanative.unsigned.UByte]]
    inline def apply(inline o: scala.scalanative.unsigned.UByte): uint8_t = o
    extension (v: uint8_t)
      inline def value: scala.scalanative.unsigned.UByte = v

  type va_list = unsafe.CVarArgList
  object va_list:
    val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
    inline def apply(inline o: unsafe.CVarArgList): va_list = o
    extension (v: va_list) inline def value: unsafe.CVarArgList = v
end aliases

object structs:
  import _root_.libredis.enumerations.*
  import _root_.libredis.predef.*
  import _root_.libredis.aliases.*
  import _root_.libredis.structs.*

  /** */
  opaque type hiredisAllocFuncs = CStruct5[
    CFuncPtr1[size_t, Ptr[Byte]],
    CFuncPtr2[size_t, size_t, Ptr[Byte]],
    CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]],
    CFuncPtr1[CString, CString],
    CFuncPtr1[Ptr[Byte], Unit]
  ]
  object hiredisAllocFuncs:
    given _tag: Tag[hiredisAllocFuncs] = Tag.materializeCStruct5Tag[
      CFuncPtr1[size_t, Ptr[Byte]],
      CFuncPtr2[size_t, size_t, Ptr[Byte]],
      CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]],
      CFuncPtr1[CString, CString],
      CFuncPtr1[Ptr[Byte], Unit]
    ]
    def apply()(using Zone): Ptr[hiredisAllocFuncs] =
      scala.scalanative.unsafe.alloc[hiredisAllocFuncs](1)
    def apply(
        mallocFn: CFuncPtr1[size_t, Ptr[Byte]],
        callocFn: CFuncPtr2[size_t, size_t, Ptr[Byte]],
        reallocFn: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]],
        strdupFn: CFuncPtr1[CString, CString],
        freeFn: CFuncPtr1[Ptr[Byte], Unit]
    )(using Zone): Ptr[hiredisAllocFuncs] =
      val ____ptr = apply()
      (!____ptr).mallocFn = mallocFn
      (!____ptr).callocFn = callocFn
      (!____ptr).reallocFn = reallocFn
      (!____ptr).strdupFn = strdupFn
      (!____ptr).freeFn = freeFn
      ____ptr
    end apply
    extension (struct: hiredisAllocFuncs)
      def mallocFn: CFuncPtr1[size_t, Ptr[Byte]] = struct._1
      def mallocFn_=(value: CFuncPtr1[size_t, Ptr[Byte]]): Unit = !struct.at1 =
        value
      def callocFn: CFuncPtr2[size_t, size_t, Ptr[Byte]] = struct._2
      def callocFn_=(value: CFuncPtr2[size_t, size_t, Ptr[Byte]]): Unit =
        !struct.at2 = value
      def reallocFn: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]] = struct._3
      def reallocFn_=(value: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]): Unit =
        !struct.at3 = value
      def strdupFn: CFuncPtr1[CString, CString] = struct._4
      def strdupFn_=(value: CFuncPtr1[CString, CString]): Unit = !struct.at4 =
        value
      def freeFn: CFuncPtr1[Ptr[Byte], Unit] = struct._5
      def freeFn_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = !struct.at5 =
        value
    end extension
  end hiredisAllocFuncs

  /** */
  opaque type redisAsyncContext = CStruct0
  object redisAsyncContext:
    given _tag: Tag[redisAsyncContext] = Tag.materializeCStruct0Tag

  /** */
  opaque type redisContext = CStruct18[
    Ptr[Byte],
    CInt,
    CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]],
    redisFD,
    CInt,
    CString,
    Ptr[Byte],
    redisConnectionType,
    Ptr[timeval],
    Ptr[timeval],
    redisContext.Struct0,
    redisContext.Struct1,
    Ptr[sockaddr],
    size_t,
    Ptr[Byte],
    CFuncPtr1[Ptr[Byte], Unit],
    Ptr[Byte],
    Ptr[redisPushFn]
  ]
  object redisContext:
    /** */
    opaque type Struct0 = CStruct3[CString, CString, CInt]
    object Struct0:
      given _tag: Tag[Struct0] =
        Tag.materializeCStruct3Tag[CString, CString, CInt]
      def apply()(using Zone): Ptr[Struct0] =
        scala.scalanative.unsafe.alloc[Struct0](1)
      def apply(host: CString, source_addr: CString, port: CInt)(using
          Zone
      ): Ptr[Struct0] =
        val ____ptr = apply()
        (!____ptr).host = host
        (!____ptr).source_addr = source_addr
        (!____ptr).port = port
        ____ptr
      extension (struct: Struct0)
        def host: CString = struct._1
        def host_=(value: CString): Unit = !struct.at1 = value
        def source_addr: CString = struct._2
        def source_addr_=(value: CString): Unit = !struct.at2 = value
        def port: CInt = struct._3
        def port_=(value: CInt): Unit = !struct.at3 = value
    end Struct0

    /** */
    opaque type Struct1 = CStruct1[CString]
    object Struct1:
      given _tag: Tag[Struct1] = Tag.materializeCStruct1Tag[CString]
      def apply()(using Zone): Ptr[Struct1] =
        scala.scalanative.unsafe.alloc[Struct1](1)
      def apply(path: CString)(using Zone): Ptr[Struct1] =
        val ____ptr = apply()
        (!____ptr).path = path
        ____ptr
      extension (struct: Struct1)
        def path: CString = struct._1
        def path_=(value: CString): Unit = !struct.at1 = value
    end Struct1

    /** */
    opaque type Struct2 = CStruct0
    object Struct2:
      given _tag: Tag[Struct2] = Tag.materializeCStruct0Tag
    given _tag: Tag[redisContext] = Tag.materializeCStruct18Tag[
      Ptr[Byte],
      CInt,
      CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]],
      redisFD,
      CInt,
      CString,
      Ptr[Byte],
      redisConnectionType,
      Ptr[timeval],
      Ptr[timeval],
      redisContext.Struct0,
      redisContext.Struct1,
      Ptr[sockaddr],
      size_t,
      Ptr[Byte],
      CFuncPtr1[Ptr[Byte], Unit],
      Ptr[Byte],
      Ptr[redisPushFn]
    ]
    def apply()(using Zone): Ptr[redisContext] =
      scala.scalanative.unsafe.alloc[redisContext](1)
    def apply(
        funcs: Ptr[redisContextFuncs],
        err: CInt,
        errstr: CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]],
        fd: redisFD,
        flags: CInt,
        obuf: CString,
        reader: Ptr[redisReader],
        connection_type: redisConnectionType,
        connect_timeout: Ptr[timeval],
        command_timeout: Ptr[timeval],
        tcp: redisContext.Struct0,
        unix_sock: redisContext.Struct1,
        saddr: Ptr[sockaddr],
        addrlen: size_t,
        privdata: Ptr[Byte],
        free_privdata: CFuncPtr1[Ptr[Byte], Unit],
        privctx: Ptr[Byte],
        push_cb: Ptr[redisPushFn]
    )(using Zone): Ptr[redisContext] =
      val ____ptr = apply()
      (!____ptr).funcs = funcs
      (!____ptr).err = err
      (!____ptr).errstr = errstr
      (!____ptr).fd = fd
      (!____ptr).flags = flags
      (!____ptr).obuf = obuf
      (!____ptr).reader = reader
      (!____ptr).connection_type = connection_type
      (!____ptr).connect_timeout = connect_timeout
      (!____ptr).command_timeout = command_timeout
      (!____ptr).tcp = tcp
      (!____ptr).unix_sock = unix_sock
      (!____ptr).saddr = saddr
      (!____ptr).addrlen = addrlen
      (!____ptr).privdata = privdata
      (!____ptr).free_privdata = free_privdata
      (!____ptr).privctx = privctx
      (!____ptr).push_cb = push_cb
      ____ptr
    end apply
    extension (struct: redisContext)
      def funcs: Ptr[redisContextFuncs] =
        struct._1.asInstanceOf[Ptr[redisContextFuncs]]
      def funcs_=(value: Ptr[redisContextFuncs]): Unit = !struct.at1 =
        value.asInstanceOf[Ptr[Byte]]
      def err: CInt = struct._2
      def err_=(value: CInt): Unit = !struct.at2 = value
      def errstr: CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]] = struct._3
      def errstr_=(
          value: CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
      ): Unit = !struct.at3 = value
      def fd: redisFD = struct._4
      def fd_=(value: redisFD): Unit = !struct.at4 = value
      def flags: CInt = struct._5
      def flags_=(value: CInt): Unit = !struct.at5 = value
      def obuf: CString = struct._6
      def obuf_=(value: CString): Unit = !struct.at6 = value
      def reader: Ptr[redisReader] = struct._7.asInstanceOf[Ptr[redisReader]]
      def reader_=(value: Ptr[redisReader]): Unit = !struct.at7 =
        value.asInstanceOf[Ptr[Byte]]
      def connection_type: redisConnectionType = struct._8
      def connection_type_=(value: redisConnectionType): Unit = !struct.at8 =
        value
      def connect_timeout: Ptr[timeval] = struct._9
      def connect_timeout_=(value: Ptr[timeval]): Unit = !struct.at9 = value
      def command_timeout: Ptr[timeval] = struct._10
      def command_timeout_=(value: Ptr[timeval]): Unit = !struct.at10 = value
      def tcp: redisContext.Struct0 = struct._11
      def tcp_=(value: redisContext.Struct0): Unit = !struct.at11 = value
      def unix_sock: redisContext.Struct1 = struct._12
      def unix_sock_=(value: redisContext.Struct1): Unit = !struct.at12 = value
      def saddr: Ptr[sockaddr] = struct._13
      def saddr_=(value: Ptr[sockaddr]): Unit = !struct.at13 = value
      def addrlen: size_t = struct._14
      def addrlen_=(value: size_t): Unit = !struct.at14 = value
      def privdata: Ptr[Byte] = struct._15
      def privdata_=(value: Ptr[Byte]): Unit = !struct.at15 = value
      def free_privdata: CFuncPtr1[Ptr[Byte], Unit] = struct._16
      def free_privdata_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit =
        !struct.at16 = value
      def privctx: Ptr[Byte] = struct._17
      def privctx_=(value: Ptr[Byte]): Unit = !struct.at17 = value
      def push_cb: Ptr[redisPushFn] = struct._18
      def push_cb_=(value: Ptr[redisPushFn]): Unit = !struct.at18 = value
    end extension
  end redisContext

  /** */
  opaque type redisContextFuncs = CStruct6[
    CFuncPtr1[Ptr[Byte], Unit],
    CFuncPtr1[Ptr[Byte], Unit],
    CFuncPtr1[Ptr[redisAsyncContext], Unit],
    CFuncPtr1[Ptr[redisAsyncContext], Unit],
    CFuncPtr3[Ptr[Byte], CString, size_t, ssize_t],
    CFuncPtr1[Ptr[Byte], ssize_t]
  ]
  object redisContextFuncs:
    given _tag: Tag[redisContextFuncs] = Tag.materializeCStruct6Tag[
      CFuncPtr1[Ptr[Byte], Unit],
      CFuncPtr1[Ptr[Byte], Unit],
      CFuncPtr1[Ptr[redisAsyncContext], Unit],
      CFuncPtr1[Ptr[redisAsyncContext], Unit],
      CFuncPtr3[Ptr[Byte], CString, size_t, ssize_t],
      CFuncPtr1[Ptr[Byte], ssize_t]
    ]
    def apply()(using Zone): Ptr[redisContextFuncs] =
      scala.scalanative.unsafe.alloc[redisContextFuncs](1)
    def apply(
        close: CFuncPtr1[Ptr[redisContext], Unit],
        free_privctx: CFuncPtr1[Ptr[Byte], Unit],
        async_read: CFuncPtr1[Ptr[redisAsyncContext], Unit],
        async_write: CFuncPtr1[Ptr[redisAsyncContext], Unit],
        read: CFuncPtr3[Ptr[redisContext], CString, size_t, ssize_t],
        write: CFuncPtr1[Ptr[redisContext], ssize_t]
    )(using Zone): Ptr[redisContextFuncs] =
      val ____ptr = apply()
      (!____ptr).close = close
      (!____ptr).free_privctx = free_privctx
      (!____ptr).async_read = async_read
      (!____ptr).async_write = async_write
      (!____ptr).read = read
      (!____ptr).write = write
      ____ptr
    end apply
    extension (struct: redisContextFuncs)
      def close: CFuncPtr1[Ptr[redisContext], Unit] =
        struct._1.asInstanceOf[CFuncPtr1[Ptr[redisContext], Unit]]
      def close_=(value: CFuncPtr1[Ptr[redisContext], Unit]): Unit =
        !struct.at1 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
      def free_privctx: CFuncPtr1[Ptr[Byte], Unit] = struct._2
      def free_privctx_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit =
        !struct.at2 = value
      def async_read: CFuncPtr1[Ptr[redisAsyncContext], Unit] = struct._3
      def async_read_=(value: CFuncPtr1[Ptr[redisAsyncContext], Unit]): Unit =
        !struct.at3 = value
      def async_write: CFuncPtr1[Ptr[redisAsyncContext], Unit] = struct._4
      def async_write_=(value: CFuncPtr1[Ptr[redisAsyncContext], Unit]): Unit =
        !struct.at4 = value
      def read: CFuncPtr3[Ptr[redisContext], CString, size_t, ssize_t] =
        struct._5
          .asInstanceOf[CFuncPtr3[Ptr[redisContext], CString, size_t, ssize_t]]
      def read_=(
          value: CFuncPtr3[Ptr[redisContext], CString, size_t, ssize_t]
      ): Unit = !struct.at5 =
        value.asInstanceOf[CFuncPtr3[Ptr[Byte], CString, size_t, ssize_t]]
      def write: CFuncPtr1[Ptr[redisContext], ssize_t] =
        struct._6.asInstanceOf[CFuncPtr1[Ptr[redisContext], ssize_t]]
      def write_=(value: CFuncPtr1[Ptr[redisContext], ssize_t]): Unit =
        !struct.at6 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], ssize_t]]
    end extension
  end redisContextFuncs

  /** */
  opaque type redisOptions =
    CStruct9[CInt, CInt, Ptr[timeval], Ptr[timeval], redisOptions.Union0, Ptr[
      Byte
    ], CFuncPtr1[Ptr[Byte], Unit], Ptr[redisPushFn], Ptr[redisAsyncPushFn]]
  object redisOptions:
    /** */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._2, Nat._4]]
    object Union0:
      /** use this field for tcp/ip connections
        */
      opaque type Struct0 = CStruct3[CString, CString, CInt]
      object Struct0:
        given _tag: Tag[Struct0] =
          Tag.materializeCStruct3Tag[CString, CString, CInt]
        def apply()(using Zone): Ptr[Struct0] =
          scala.scalanative.unsafe.alloc[Struct0](1)
        def apply(source_addr: CString, ip: CString, port: CInt)(using
            Zone
        ): Ptr[Struct0] =
          val ____ptr = apply()
          (!____ptr).source_addr = source_addr
          (!____ptr).ip = ip
          (!____ptr).port = port
          ____ptr
        extension (struct: Struct0)
          def source_addr: CString = struct._1
          def source_addr_=(value: CString): Unit = !struct.at1 = value
          def ip: CString = struct._2
          def ip_=(value: CString): Unit = !struct.at2 = value
          def port: CInt = struct._3
          def port_=(value: CInt): Unit = !struct.at3 = value
      end Struct0
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](
        Tag.Byte,
        Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4)
      )
      def apply()(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_tcp")
      def apply(tcp: redisOptions.Union0.Struct0)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[redisOptions.Union0.Struct0]].update(0, tcp)
        ___ptr
      @scala.annotation.targetName("apply_unix_socket")
      def apply(unix_socket: CString)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CString]].update(0, unix_socket)
        ___ptr
      @scala.annotation.targetName("apply_fd")
      def apply(fd: redisFD)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[redisFD]].update(0, fd)
        ___ptr
      extension (struct: Union0)
        def tcp: redisOptions.Union0.Struct0 =
          !struct.at(0).asInstanceOf[Ptr[redisOptions.Union0.Struct0]]
        def tcp_=(value: redisOptions.Union0.Struct0): Unit =
          !struct.at(0).asInstanceOf[Ptr[redisOptions.Union0.Struct0]] = value
        def unix_socket: CString = !struct.at(0).asInstanceOf[Ptr[CString]]
        def unix_socket_=(value: CString): Unit =
          !struct.at(0).asInstanceOf[Ptr[CString]] = value
        def fd: redisFD = !struct.at(0).asInstanceOf[Ptr[redisFD]]
        def fd_=(value: redisFD): Unit =
          !struct.at(0).asInstanceOf[Ptr[redisFD]] = value
      end extension
    end Union0
    given _tag: Tag[redisOptions] =
      Tag.materializeCStruct9Tag[CInt, CInt, Ptr[timeval], Ptr[
        timeval
      ], redisOptions.Union0, Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], Ptr[
        redisPushFn
      ], Ptr[redisAsyncPushFn]]
    def apply()(using Zone): Ptr[redisOptions] =
      scala.scalanative.unsafe.alloc[redisOptions](1)
    def apply(
        `type`: CInt,
        options: CInt,
        connect_timeout: Ptr[timeval],
        command_timeout: Ptr[timeval],
        endpoint: redisOptions.Union0,
        privdata: Ptr[Byte],
        free_privdata: CFuncPtr1[Ptr[Byte], Unit],
        push_cb: Ptr[redisPushFn],
        async_push_cb: Ptr[redisAsyncPushFn]
    )(using Zone): Ptr[redisOptions] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).options = options
      (!____ptr).connect_timeout = connect_timeout
      (!____ptr).command_timeout = command_timeout
      (!____ptr).endpoint = endpoint
      (!____ptr).privdata = privdata
      (!____ptr).free_privdata = free_privdata
      (!____ptr).push_cb = push_cb
      (!____ptr).async_push_cb = async_push_cb
      ____ptr
    end apply
    extension (struct: redisOptions)
      def `type`: CInt = struct._1
      def type_=(value: CInt): Unit = !struct.at1 = value
      def options: CInt = struct._2
      def options_=(value: CInt): Unit = !struct.at2 = value
      def connect_timeout: Ptr[timeval] = struct._3
      def connect_timeout_=(value: Ptr[timeval]): Unit = !struct.at3 = value
      def command_timeout: Ptr[timeval] = struct._4
      def command_timeout_=(value: Ptr[timeval]): Unit = !struct.at4 = value
      def endpoint: redisOptions.Union0 = struct._5
      def endpoint_=(value: redisOptions.Union0): Unit = !struct.at5 = value
      def privdata: Ptr[Byte] = struct._6
      def privdata_=(value: Ptr[Byte]): Unit = !struct.at6 = value
      def free_privdata: CFuncPtr1[Ptr[Byte], Unit] = struct._7
      def free_privdata_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit =
        !struct.at7 = value
      def push_cb: Ptr[redisPushFn] = struct._8
      def push_cb_=(value: Ptr[redisPushFn]): Unit = !struct.at8 = value
      def async_push_cb: Ptr[redisAsyncPushFn] = struct._9
      def async_push_cb_=(value: Ptr[redisAsyncPushFn]): Unit = !struct.at9 =
        value
    end extension
  end redisOptions

  /** */
  opaque type redisReadTask =
    CStruct6[CInt, CLongLong, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  object redisReadTask:
    given _tag: Tag[redisReadTask] =
      Tag.materializeCStruct6Tag[CInt, CLongLong, CInt, Ptr[Byte], Ptr[
        Byte
      ], Ptr[Byte]]
    def apply()(using Zone): Ptr[redisReadTask] =
      scala.scalanative.unsafe.alloc[redisReadTask](1)
    def apply(
        `type`: CInt,
        elements: CLongLong,
        idx: CInt,
        obj: Ptr[Byte],
        parent: Ptr[redisReadTask],
        privdata: Ptr[Byte]
    )(using Zone): Ptr[redisReadTask] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).elements = elements
      (!____ptr).idx = idx
      (!____ptr).obj = obj
      (!____ptr).parent = parent
      (!____ptr).privdata = privdata
      ____ptr
    end apply
    extension (struct: redisReadTask)
      def `type`: CInt = struct._1
      def type_=(value: CInt): Unit = !struct.at1 = value
      def elements: CLongLong = struct._2
      def elements_=(value: CLongLong): Unit = !struct.at2 = value
      def idx: CInt = struct._3
      def idx_=(value: CInt): Unit = !struct.at3 = value
      def obj: Ptr[Byte] = struct._4
      def obj_=(value: Ptr[Byte]): Unit = !struct.at4 = value
      def parent: Ptr[redisReadTask] =
        struct._5.asInstanceOf[Ptr[redisReadTask]]
      def parent_=(value: Ptr[redisReadTask]): Unit = !struct.at5 =
        value.asInstanceOf[Ptr[Byte]]
      def privdata: Ptr[Byte] = struct._6
      def privdata_=(value: Ptr[Byte]): Unit = !struct.at6 = value
    end extension
  end redisReadTask

  /** */
  opaque type redisReader = CStruct13[
    CInt,
    CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]],
    CString,
    size_t,
    size_t,
    size_t,
    CLongLong,
    Ptr[Byte],
    CInt,
    CInt,
    Ptr[Byte],
    Ptr[Byte],
    Ptr[Byte]
  ]
  object redisReader:
    given _tag: Tag[redisReader] = Tag.materializeCStruct13Tag[CInt, CArray[
      CChar,
      Nat.Digit3[Nat._1, Nat._2, Nat._8]
    ], CString, size_t, size_t, size_t, CLongLong, Ptr[Byte], CInt, CInt, Ptr[
      Byte
    ], Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[redisReader] =
      scala.scalanative.unsafe.alloc[redisReader](1)
    def apply(
        err: CInt,
        errstr: CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]],
        buf: CString,
        pos: size_t,
        len: size_t,
        maxbuf: size_t,
        maxelements: CLongLong,
        task: Ptr[Ptr[redisReadTask]],
        tasks: CInt,
        ridx: CInt,
        reply: Ptr[Byte],
        fn: Ptr[redisReplyObjectFunctions],
        privdata: Ptr[Byte]
    )(using Zone): Ptr[redisReader] =
      val ____ptr = apply()
      (!____ptr).err = err
      (!____ptr).errstr = errstr
      (!____ptr).buf = buf
      (!____ptr).pos = pos
      (!____ptr).len = len
      (!____ptr).maxbuf = maxbuf
      (!____ptr).maxelements = maxelements
      (!____ptr).task = task
      (!____ptr).tasks = tasks
      (!____ptr).ridx = ridx
      (!____ptr).reply = reply
      (!____ptr).fn = fn
      (!____ptr).privdata = privdata
      ____ptr
    end apply
    extension (struct: redisReader)
      def err: CInt = struct._1
      def err_=(value: CInt): Unit = !struct.at1 = value
      def errstr: CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]] = struct._2
      def errstr_=(
          value: CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
      ): Unit = !struct.at2 = value
      def buf: CString = struct._3
      def buf_=(value: CString): Unit = !struct.at3 = value
      def pos: size_t = struct._4
      def pos_=(value: size_t): Unit = !struct.at4 = value
      def len: size_t = struct._5
      def len_=(value: size_t): Unit = !struct.at5 = value
      def maxbuf: size_t = struct._6
      def maxbuf_=(value: size_t): Unit = !struct.at6 = value
      def maxelements: CLongLong = struct._7
      def maxelements_=(value: CLongLong): Unit = !struct.at7 = value
      def task: Ptr[Ptr[redisReadTask]] =
        struct._8.asInstanceOf[Ptr[Ptr[redisReadTask]]]
      def task_=(value: Ptr[Ptr[redisReadTask]]): Unit = !struct.at8 =
        value.asInstanceOf[Ptr[Byte]]
      def tasks: CInt = struct._9
      def tasks_=(value: CInt): Unit = !struct.at9 = value
      def ridx: CInt = struct._10
      def ridx_=(value: CInt): Unit = !struct.at10 = value
      def reply: Ptr[Byte] = struct._11
      def reply_=(value: Ptr[Byte]): Unit = !struct.at11 = value
      def fn: Ptr[redisReplyObjectFunctions] =
        struct._12.asInstanceOf[Ptr[redisReplyObjectFunctions]]
      def fn_=(value: Ptr[redisReplyObjectFunctions]): Unit = !struct.at12 =
        value.asInstanceOf[Ptr[Byte]]
      def privdata: Ptr[Byte] = struct._13
      def privdata_=(value: Ptr[Byte]): Unit = !struct.at13 = value
    end extension
  end redisReader

  /** */
  opaque type redisReply = CStruct8[
    CInt,
    CLongLong,
    Double,
    size_t,
    CString,
    CArray[CChar, Nat._4],
    size_t,
    Ptr[Byte]
  ]
  object redisReply:
    given _tag: Tag[redisReply] = Tag
      .materializeCStruct8Tag[CInt, CLongLong, Double, size_t, CString, CArray[
        CChar,
        Nat._4
      ], size_t, Ptr[Byte]]
    def apply()(using Zone): Ptr[redisReply] =
      scala.scalanative.unsafe.alloc[redisReply](1)
    def apply(
        `type`: CInt,
        integer: CLongLong,
        dval: Double,
        len: size_t,
        str: CString,
        vtype: CArray[CChar, Nat._4],
        elements: size_t,
        element: Ptr[Ptr[redisReply]]
    )(using Zone): Ptr[redisReply] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).integer = integer
      (!____ptr).dval = dval
      (!____ptr).len = len
      (!____ptr).str = str
      (!____ptr).vtype = vtype
      (!____ptr).elements = elements
      (!____ptr).element = element
      ____ptr
    end apply
    extension (struct: redisReply)
      def `type`: CInt = struct._1
      def type_=(value: CInt): Unit = !struct.at1 = value
      def integer: CLongLong = struct._2
      def integer_=(value: CLongLong): Unit = !struct.at2 = value
      def dval: Double = struct._3
      def dval_=(value: Double): Unit = !struct.at3 = value
      def len: size_t = struct._4
      def len_=(value: size_t): Unit = !struct.at4 = value
      def str: CString = struct._5
      def str_=(value: CString): Unit = !struct.at5 = value
      def vtype: CArray[CChar, Nat._4] = struct._6
      def vtype_=(value: CArray[CChar, Nat._4]): Unit = !struct.at6 = value
      def elements: size_t = struct._7
      def elements_=(value: size_t): Unit = !struct.at7 = value
      def element: Ptr[Ptr[redisReply]] =
        struct._8.asInstanceOf[Ptr[Ptr[redisReply]]]
      def element_=(value: Ptr[Ptr[redisReply]]): Unit = !struct.at8 =
        value.asInstanceOf[Ptr[Byte]]
    end extension
  end redisReply

  /** */
  opaque type redisReplyObjectFunctions = CStruct7[
    CFuncPtr3[Ptr[Byte], CString, size_t, Ptr[Byte]],
    CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]],
    CFuncPtr2[Ptr[Byte], CLongLong, Ptr[Byte]],
    CFuncPtr4[Ptr[Byte], Double, CString, size_t, Ptr[Byte]],
    CFuncPtr1[Ptr[Byte], Ptr[Byte]],
    CFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]],
    CFuncPtr1[Ptr[Byte], Unit]
  ]
  object redisReplyObjectFunctions:
    given _tag: Tag[redisReplyObjectFunctions] = Tag.materializeCStruct7Tag[
      CFuncPtr3[Ptr[Byte], CString, size_t, Ptr[Byte]],
      CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]],
      CFuncPtr2[Ptr[Byte], CLongLong, Ptr[Byte]],
      CFuncPtr4[Ptr[Byte], Double, CString, size_t, Ptr[Byte]],
      CFuncPtr1[Ptr[Byte], Ptr[Byte]],
      CFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]],
      CFuncPtr1[Ptr[Byte], Unit]
    ]
    def apply()(using Zone): Ptr[redisReplyObjectFunctions] =
      scala.scalanative.unsafe.alloc[redisReplyObjectFunctions](1)
    def apply(
        createString: CFuncPtr3[Ptr[redisReadTask], CString, size_t, Ptr[Byte]],
        createArray: CFuncPtr2[Ptr[redisReadTask], size_t, Ptr[Byte]],
        createInteger: CFuncPtr2[Ptr[redisReadTask], CLongLong, Ptr[Byte]],
        createDouble: CFuncPtr4[Ptr[
          redisReadTask
        ], Double, CString, size_t, Ptr[Byte]],
        createNil: CFuncPtr1[Ptr[redisReadTask], Ptr[Byte]],
        createBool: CFuncPtr2[Ptr[redisReadTask], CInt, Ptr[Byte]],
        freeObject: CFuncPtr1[Ptr[Byte], Unit]
    )(using Zone): Ptr[redisReplyObjectFunctions] =
      val ____ptr = apply()
      (!____ptr).createString = createString
      (!____ptr).createArray = createArray
      (!____ptr).createInteger = createInteger
      (!____ptr).createDouble = createDouble
      (!____ptr).createNil = createNil
      (!____ptr).createBool = createBool
      (!____ptr).freeObject = freeObject
      ____ptr
    end apply
    extension (struct: redisReplyObjectFunctions)
      def createString
          : CFuncPtr3[Ptr[redisReadTask], CString, size_t, Ptr[Byte]] =
        struct._1.asInstanceOf[CFuncPtr3[Ptr[
          redisReadTask
        ], CString, size_t, Ptr[Byte]]]
      def createString_=(
          value: CFuncPtr3[Ptr[redisReadTask], CString, size_t, Ptr[Byte]]
      ): Unit = !struct.at1 =
        value.asInstanceOf[CFuncPtr3[Ptr[Byte], CString, size_t, Ptr[Byte]]]
      def createArray: CFuncPtr2[Ptr[redisReadTask], size_t, Ptr[Byte]] =
        struct._2.asInstanceOf[CFuncPtr2[Ptr[redisReadTask], size_t, Ptr[Byte]]]
      def createArray_=(
          value: CFuncPtr2[Ptr[redisReadTask], size_t, Ptr[Byte]]
      ): Unit = !struct.at2 =
        value.asInstanceOf[CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]]
      def createInteger: CFuncPtr2[Ptr[redisReadTask], CLongLong, Ptr[Byte]] =
        struct._3
          .asInstanceOf[CFuncPtr2[Ptr[redisReadTask], CLongLong, Ptr[Byte]]]
      def createInteger_=(
          value: CFuncPtr2[Ptr[redisReadTask], CLongLong, Ptr[Byte]]
      ): Unit = !struct.at3 =
        value.asInstanceOf[CFuncPtr2[Ptr[Byte], CLongLong, Ptr[Byte]]]
      def createDouble
          : CFuncPtr4[Ptr[redisReadTask], Double, CString, size_t, Ptr[Byte]] =
        struct._4.asInstanceOf[CFuncPtr4[Ptr[
          redisReadTask
        ], Double, CString, size_t, Ptr[Byte]]]
      def createDouble_=(
          value: CFuncPtr4[Ptr[redisReadTask], Double, CString, size_t, Ptr[
            Byte
          ]]
      ): Unit = !struct.at4 = value
        .asInstanceOf[CFuncPtr4[Ptr[Byte], Double, CString, size_t, Ptr[Byte]]]
      def createNil: CFuncPtr1[Ptr[redisReadTask], Ptr[Byte]] =
        struct._5.asInstanceOf[CFuncPtr1[Ptr[redisReadTask], Ptr[Byte]]]
      def createNil_=(value: CFuncPtr1[Ptr[redisReadTask], Ptr[Byte]]): Unit =
        !struct.at5 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Ptr[Byte]]]
      def createBool: CFuncPtr2[Ptr[redisReadTask], CInt, Ptr[Byte]] =
        struct._6.asInstanceOf[CFuncPtr2[Ptr[redisReadTask], CInt, Ptr[Byte]]]
      def createBool_=(
          value: CFuncPtr2[Ptr[redisReadTask], CInt, Ptr[Byte]]
      ): Unit = !struct.at6 =
        value.asInstanceOf[CFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]]]
      def freeObject: CFuncPtr1[Ptr[Byte], Unit] = struct._7
      def freeObject_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = !struct.at7 =
        value
    end extension
  end redisReplyObjectFunctions

  /** */
  opaque type redisSsl = CStruct0
  object redisSsl:
    given _tag: Tag[redisSsl] = Tag.materializeCStruct0Tag

  /** */
  opaque type sdshdr16 = CStruct3[uint16_t, uint16_t, CUnsignedChar]
  object sdshdr16:
    given _tag: Tag[sdshdr16] =
      Tag.materializeCStruct3Tag[uint16_t, uint16_t, CUnsignedChar]
    def apply()(using Zone): Ptr[sdshdr16] =
      scala.scalanative.unsafe.alloc[sdshdr16](1)
    def apply(len: uint16_t, alloc: uint16_t, flags: CUnsignedChar)(using
        Zone
    ): Ptr[sdshdr16] =
      val ____ptr = apply()
      (!____ptr).len = len
      (!____ptr).alloc = alloc
      (!____ptr).flags = flags
      ____ptr
    extension (struct: sdshdr16)
      def len: uint16_t = struct._1
      def len_=(value: uint16_t): Unit = !struct.at1 = value
      def alloc: uint16_t = struct._2
      def alloc_=(value: uint16_t): Unit = !struct.at2 = value
      def flags: CUnsignedChar = struct._3
      def flags_=(value: CUnsignedChar): Unit = !struct.at3 = value
  end sdshdr16

  /** */
  opaque type sdshdr32 = CStruct3[uint32_t, uint32_t, CUnsignedChar]
  object sdshdr32:
    given _tag: Tag[sdshdr32] =
      Tag.materializeCStruct3Tag[uint32_t, uint32_t, CUnsignedChar]
    def apply()(using Zone): Ptr[sdshdr32] =
      scala.scalanative.unsafe.alloc[sdshdr32](1)
    def apply(len: uint32_t, alloc: uint32_t, flags: CUnsignedChar)(using
        Zone
    ): Ptr[sdshdr32] =
      val ____ptr = apply()
      (!____ptr).len = len
      (!____ptr).alloc = alloc
      (!____ptr).flags = flags
      ____ptr
    extension (struct: sdshdr32)
      def len: uint32_t = struct._1
      def len_=(value: uint32_t): Unit = !struct.at1 = value
      def alloc: uint32_t = struct._2
      def alloc_=(value: uint32_t): Unit = !struct.at2 = value
      def flags: CUnsignedChar = struct._3
      def flags_=(value: CUnsignedChar): Unit = !struct.at3 = value
  end sdshdr32

  /** */
  opaque type sdshdr5 = CStruct1[CUnsignedChar]
  object sdshdr5:
    given _tag: Tag[sdshdr5] = Tag.materializeCStruct1Tag[CUnsignedChar]
    def apply()(using Zone): Ptr[sdshdr5] =
      scala.scalanative.unsafe.alloc[sdshdr5](1)
    def apply(flags: CUnsignedChar)(using Zone): Ptr[sdshdr5] =
      val ____ptr = apply()
      (!____ptr).flags = flags
      ____ptr
    extension (struct: sdshdr5)
      def flags: CUnsignedChar = struct._1
      def flags_=(value: CUnsignedChar): Unit = !struct.at1 = value
  end sdshdr5

  /** */
  opaque type sdshdr64 = CStruct3[uint64_t, uint64_t, CUnsignedChar]
  object sdshdr64:
    given _tag: Tag[sdshdr64] =
      Tag.materializeCStruct3Tag[uint64_t, uint64_t, CUnsignedChar]
    def apply()(using Zone): Ptr[sdshdr64] =
      scala.scalanative.unsafe.alloc[sdshdr64](1)
    def apply(len: uint64_t, alloc: uint64_t, flags: CUnsignedChar)(using
        Zone
    ): Ptr[sdshdr64] =
      val ____ptr = apply()
      (!____ptr).len = len
      (!____ptr).alloc = alloc
      (!____ptr).flags = flags
      ____ptr
    extension (struct: sdshdr64)
      def len: uint64_t = struct._1
      def len_=(value: uint64_t): Unit = !struct.at1 = value
      def alloc: uint64_t = struct._2
      def alloc_=(value: uint64_t): Unit = !struct.at2 = value
      def flags: CUnsignedChar = struct._3
      def flags_=(value: CUnsignedChar): Unit = !struct.at3 = value
  end sdshdr64

  /** */
  opaque type sdshdr8 = CStruct3[uint8_t, uint8_t, CUnsignedChar]
  object sdshdr8:
    given _tag: Tag[sdshdr8] =
      Tag.materializeCStruct3Tag[uint8_t, uint8_t, CUnsignedChar]
    def apply()(using Zone): Ptr[sdshdr8] =
      scala.scalanative.unsafe.alloc[sdshdr8](1)
    def apply(len: uint8_t, alloc: uint8_t, flags: CUnsignedChar)(using
        Zone
    ): Ptr[sdshdr8] =
      val ____ptr = apply()
      (!____ptr).len = len
      (!____ptr).alloc = alloc
      (!____ptr).flags = flags
      ____ptr
    extension (struct: sdshdr8)
      def len: uint8_t = struct._1
      def len_=(value: uint8_t): Unit = !struct.at1 = value
      def alloc: uint8_t = struct._2
      def alloc_=(value: uint8_t): Unit = !struct.at2 = value
      def flags: CUnsignedChar = struct._3
      def flags_=(value: CUnsignedChar): Unit = !struct.at3 = value
  end sdshdr8

  /** */
  opaque type sockaddr = CStruct0
  object sockaddr:
    given _tag: Tag[sockaddr] = Tag.materializeCStruct0Tag
end structs

@extern
private[libredis] object extern_functions:
  import _root_.libredis.enumerations.*
  import _root_.libredis.predef.*
  import _root_.libredis.aliases.*
  import _root_.libredis.structs.*
  private[libredis] def __sn_wrap_libredis_hiredisSetAllocators(
      ha: Ptr[hiredisAllocFuncs],
      __return: Ptr[hiredisAllocFuncs]
  ): Unit = extern

  /** */
  def freeReplyObject(reply: Ptr[Byte]): Unit = extern

  /** */
  def hi_calloc(nmemb: size_t, size: size_t): Ptr[Byte] = extern

  /** */
  def hi_free(ptr: Ptr[Byte]): Unit = extern

  /** */
  def hi_malloc(size: size_t): Ptr[Byte] = extern

  /** */
  def hi_realloc(ptr: Ptr[Byte], size: size_t): Ptr[Byte] = extern

  /** */
  def hi_strdup(str: CString): CString = extern

  /** */
  def hiredisResetAllocators(): Unit = extern

  /** */
  def redisAppendCommand(
      c: Ptr[redisContext],
      format: CString,
      rest: Any*
  ): CInt = extern

  /** */
  def redisAppendCommandArgv(
      c: Ptr[redisContext],
      argc: CInt,
      argv: Ptr[CString],
      argvlen: Ptr[size_t]
  ): CInt = extern

  /** */
  def redisAppendFormattedCommand(
      c: Ptr[redisContext],
      cmd: CString,
      len: size_t
  ): CInt = extern

  /** */
  def redisBufferRead(c: Ptr[redisContext]): CInt = extern

  /** */
  def redisBufferWrite(c: Ptr[redisContext], done: Ptr[CInt]): CInt = extern

  /** */
  def redisCommand(
      c: Ptr[redisContext],
      format: CString,
      rest: Any*
  ): Ptr[Byte] = extern

  /** */
  def redisCommandArgv(
      c: Ptr[redisContext],
      argc: CInt,
      argv: Ptr[CString],
      argvlen: Ptr[size_t]
  ): Ptr[Byte] = extern

  /** */
  def redisConnect(ip: CString, port: CInt): Ptr[redisContext] = extern

  /** */
  def redisConnectBindNonBlock(
      ip: CString,
      port: CInt,
      source_addr: CString
  ): Ptr[redisContext] = extern

  /** */
  def redisConnectBindNonBlockWithReuse(
      ip: CString,
      port: CInt,
      source_addr: CString
  ): Ptr[redisContext] = extern

  /** */
  def redisConnectFd(fd: redisFD): Ptr[redisContext] = extern

  /** */
  def redisConnectNonBlock(ip: CString, port: CInt): Ptr[redisContext] = extern

  /** */
  def redisConnectUnix(path: CString): Ptr[redisContext] = extern

  /** */
  def redisConnectUnixNonBlock(path: CString): Ptr[redisContext] = extern

  /** */
  def redisConnectUnixWithTimeout(
      path: CString,
      tv: timeval
  ): Ptr[redisContext] = extern

  /** */
  def redisConnectWithOptions(options: Ptr[redisOptions]): Ptr[redisContext] =
    extern

  /** */
  def redisConnectWithTimeout(
      ip: CString,
      port: CInt,
      tv: timeval
  ): Ptr[redisContext] = extern

  /** */
  def redisEnableKeepAlive(c: Ptr[redisContext]): CInt = extern

  /** */
  def redisEnableKeepAliveWithInterval(
      c: Ptr[redisContext],
      interval: CInt
  ): CInt = extern

  /** */
  def redisFormatCommand(
      target: Ptr[CString],
      format: CString,
      rest: Any*
  ): CInt = extern

  /** */
  def redisFormatCommandArgv(
      target: Ptr[CString],
      argc: CInt,
      argv: Ptr[CString],
      argvlen: Ptr[size_t]
  ): CLongLong = extern

  /** */
  def redisFormatSdsCommandArgv(
      target: Ptr[sds],
      argc: CInt,
      argv: Ptr[CString],
      argvlen: Ptr[size_t]
  ): CLongLong = extern

  /** */
  def redisFree(c: Ptr[redisContext]): Unit = extern

  /** */
  def redisFreeCommand(cmd: CString): Unit = extern

  /** */
  def redisFreeKeepFd(c: Ptr[redisContext]): redisFD = extern

  /** */
  def redisFreeSdsCommand(cmd: sds): Unit = extern

  /** */
  def redisGetReply(c: Ptr[redisContext], reply: Ptr[Ptr[Byte]]): CInt = extern

  /** */
  def redisGetReplyFromReader(
      c: Ptr[redisContext],
      reply: Ptr[Ptr[Byte]]
  ): CInt = extern

  /** */
  def redisReaderCreate(): Ptr[redisReader] = extern

  /** */
  def redisReaderCreateWithFunctions(
      fn: Ptr[redisReplyObjectFunctions]
  ): Ptr[redisReader] = extern

  /** */
  def redisReaderFeed(r: Ptr[redisReader], buf: CString, len: size_t): CInt =
    extern

  /** */
  def redisReaderFree(r: Ptr[redisReader]): Unit = extern

  /** */
  def redisReaderGetReply(r: Ptr[redisReader], reply: Ptr[Ptr[Byte]]): CInt =
    extern

  /** Reconnect the given context using the saved information.
    */
  def redisReconnect(c: Ptr[redisContext]): CInt = extern

  /** */
  def redisSetPushCallback(
      c: Ptr[redisContext],
      fn: Ptr[redisPushFn]
  ): Ptr[redisPushFn] = extern

  /** */
  def redisSetTcpUserTimeout(
      c: Ptr[redisContext],
      timeout: CUnsignedInt
  ): CInt = extern

  /** */
  def redisSetTimeout(c: Ptr[redisContext], tv: timeval): CInt = extern

  /** */
  def redisvAppendCommand(
      c: Ptr[redisContext],
      format: CString,
      ap: va_list
  ): CInt = extern

  /** */
  def redisvCommand(
      c: Ptr[redisContext],
      format: CString,
      ap: va_list
  ): Ptr[Byte] = extern

  /** */
  def redisvFormatCommand(
      target: Ptr[CString],
      format: CString,
      ap: va_list
  ): CInt = extern

  /** */
  def sdsAllocPtr(s: sds): Ptr[Byte] = extern

  /** */
  def sdsAllocSize(s: sds): size_t = extern

  /** */
  def sdsIncrLen(s: sds, incr: CInt): Unit = extern

  /** */
  def sdsMakeRoomFor(s: sds, addlen: size_t): sds = extern

  /** */
  def sdsRemoveFreeSpace(s: sds): sds = extern

  /** */
  def sds_free(ptr: Ptr[Byte]): Unit = extern

  /** */
  def sds_malloc(size: size_t): Ptr[Byte] = extern

  /** */
  def sds_realloc(ptr: Ptr[Byte], size: size_t): Ptr[Byte] = extern

  /** */
  def sdsalloc(s: sds): size_t = extern

  /** */
  def sdsavail(s: sds): size_t = extern

  /** */
  def sdscat(s: sds, t: CString): sds = extern

  /** */
  def sdscatfmt(s: sds, fmt: CString, rest: Any*): sds = extern

  /** */
  def sdscatlen(s: sds, t: Ptr[Byte], len: size_t): sds = extern

  /** */
  def sdscatprintf(s: sds, fmt: CString, rest: Any*): sds = extern

  /** */
  def sdscatrepr(s: sds, p: CString, len: size_t): sds = extern

  /** */
  def sdscatsds(s: sds, t: sds): sds = extern

  /** */
  def sdscatvprintf(s: sds, fmt: CString, ap: va_list): sds = extern

  /** */
  def sdsclear(s: sds): Unit = extern

  /** */
  def sdscmp(s1: sds, s2: sds): CInt = extern

  /** */
  def sdscpy(s: sds, t: CString): sds = extern

  /** */
  def sdscpylen(s: sds, t: CString, len: size_t): sds = extern

  /** */
  def sdsdup(s: sds): sds = extern

  /** */
  def sdsempty(): sds = extern

  /** */
  def sdsfree(s: sds): Unit = extern

  /** */
  def sdsfreesplitres(tokens: Ptr[sds], count: CInt): Unit = extern

  /** */
  def sdsfromlonglong(value: CLongLong): sds = extern

  /** */
  def sdsgrowzero(s: sds, len: size_t): sds = extern

  /** */
  def sdsinclen(s: sds, inc: size_t): Unit = extern

  /** */
  def sdsjoin(argv: Ptr[CString], argc: CInt, sep: CString): sds = extern

  /** */
  def sdsjoinsds(
      argv: Ptr[sds],
      argc: CInt,
      sep: CString,
      seplen: size_t
  ): sds = extern

  /** */
  def sdslen(s: sds): size_t = extern

  /** */
  def sdsmapchars(s: sds, from: CString, to: CString, setlen: size_t): sds =
    extern

  /** */
  def sdsnew(init: CString): sds = extern

  /** */
  def sdsnewlen(init: Ptr[Byte], initlen: size_t): sds = extern

  /** */
  def sdsrange(s: sds, start: ssize_t, end: ssize_t): CInt = extern

  /** */
  def sdssetalloc(s: sds, newlen: size_t): Unit = extern

  /** */
  def sdssetlen(s: sds, newlen: size_t): Unit = extern

  /** */
  def sdssplitargs(line: CString, argc: Ptr[CInt]): Ptr[sds] = extern

  /** */
  def sdssplitlen(
      s: CString,
      len: CInt,
      sep: CString,
      seplen: CInt,
      count: Ptr[CInt]
  ): Ptr[sds] = extern

  /** */
  def sdstolower(s: sds): Unit = extern

  /** */
  def sdstoupper(s: sds): Unit = extern

  /** */
  def sdstrim(s: sds, cset: CString): sds = extern

  /** */
  def sdsupdatelen(s: sds): Unit = extern
end extern_functions

object functions:
  import _root_.libredis.enumerations.*
  import _root_.libredis.predef.*
  import _root_.libredis.aliases.*
  import _root_.libredis.structs.*
  import extern_functions.*
  export extern_functions.*

  /** */
  def hiredisSetAllocators(ha: Ptr[hiredisAllocFuncs])(using
      Zone
  ): hiredisAllocFuncs =
    val __ptr_0: Ptr[hiredisAllocFuncs] = alloc[hiredisAllocFuncs](1)
    __sn_wrap_libredis_hiredisSetAllocators(ha, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def hiredisSetAllocators(ha: Ptr[hiredisAllocFuncs])(
      __return: Ptr[hiredisAllocFuncs]
  ): Unit =
    __sn_wrap_libredis_hiredisSetAllocators(ha, __return)
end functions

object types:
  export _root_.libredis.structs.*
  export _root_.libredis.aliases.*
  export _root_.libredis.enumerations.*

object all:
  export _root_.libredis.enumerations.redisConnectionType
  export _root_.libredis.aliases.redisAsyncPushFn
  export _root_.libredis.aliases.redisFD
  export _root_.libredis.aliases.redisPushFn
  export _root_.libredis.aliases.sds
  export _root_.libredis.aliases.size_t
  export _root_.libredis.aliases.ssize_t
  export _root_.libredis.aliases.timeval
  export _root_.libredis.aliases.uint16_t
  export _root_.libredis.aliases.uint32_t
  export _root_.libredis.aliases.uint64_t
  export _root_.libredis.aliases.uint8_t
  export _root_.libredis.aliases.va_list
  export _root_.libredis.structs.hiredisAllocFuncs
  export _root_.libredis.structs.redisAsyncContext
  export _root_.libredis.structs.redisContext
  export _root_.libredis.structs.redisContextFuncs
  export _root_.libredis.structs.redisOptions
  export _root_.libredis.structs.redisReadTask
  export _root_.libredis.structs.redisReader
  export _root_.libredis.structs.redisReply
  export _root_.libredis.structs.redisReplyObjectFunctions
  export _root_.libredis.structs.redisSsl
  export _root_.libredis.structs.sdshdr16
  export _root_.libredis.structs.sdshdr32
  export _root_.libredis.structs.sdshdr5
  export _root_.libredis.structs.sdshdr64
  export _root_.libredis.structs.sdshdr8
  export _root_.libredis.structs.sockaddr
  export _root_.libredis.functions.freeReplyObject
  export _root_.libredis.functions.hi_calloc
  export _root_.libredis.functions.hi_free
  export _root_.libredis.functions.hi_malloc
  export _root_.libredis.functions.hi_realloc
  export _root_.libredis.functions.hi_strdup
  export _root_.libredis.functions.hiredisResetAllocators
  export _root_.libredis.functions.redisAppendCommand
  export _root_.libredis.functions.redisAppendCommandArgv
  export _root_.libredis.functions.redisAppendFormattedCommand
  export _root_.libredis.functions.redisBufferRead
  export _root_.libredis.functions.redisBufferWrite
  export _root_.libredis.functions.redisCommand
  export _root_.libredis.functions.redisCommandArgv
  export _root_.libredis.functions.redisConnect
  export _root_.libredis.functions.redisConnectBindNonBlock
  export _root_.libredis.functions.redisConnectBindNonBlockWithReuse
  export _root_.libredis.functions.redisConnectFd
  export _root_.libredis.functions.redisConnectNonBlock
  export _root_.libredis.functions.redisConnectUnix
  export _root_.libredis.functions.redisConnectUnixNonBlock
  export _root_.libredis.functions.redisConnectUnixWithTimeout
  export _root_.libredis.functions.redisConnectWithOptions
  export _root_.libredis.functions.redisConnectWithTimeout
  export _root_.libredis.functions.redisEnableKeepAlive
  export _root_.libredis.functions.redisEnableKeepAliveWithInterval
  export _root_.libredis.functions.redisFormatCommand
  export _root_.libredis.functions.redisFormatCommandArgv
  export _root_.libredis.functions.redisFormatSdsCommandArgv
  export _root_.libredis.functions.redisFree
  export _root_.libredis.functions.redisFreeCommand
  export _root_.libredis.functions.redisFreeKeepFd
  export _root_.libredis.functions.redisFreeSdsCommand
  export _root_.libredis.functions.redisGetReply
  export _root_.libredis.functions.redisGetReplyFromReader
  export _root_.libredis.functions.redisReaderCreate
  export _root_.libredis.functions.redisReaderCreateWithFunctions
  export _root_.libredis.functions.redisReaderFeed
  export _root_.libredis.functions.redisReaderFree
  export _root_.libredis.functions.redisReaderGetReply
  export _root_.libredis.functions.redisReconnect
  export _root_.libredis.functions.redisSetPushCallback
  export _root_.libredis.functions.redisSetTcpUserTimeout
  export _root_.libredis.functions.redisSetTimeout
  export _root_.libredis.functions.redisvAppendCommand
  export _root_.libredis.functions.redisvCommand
  export _root_.libredis.functions.redisvFormatCommand
  export _root_.libredis.functions.sdsAllocPtr
  export _root_.libredis.functions.sdsAllocSize
  export _root_.libredis.functions.sdsIncrLen
  export _root_.libredis.functions.sdsMakeRoomFor
  export _root_.libredis.functions.sdsRemoveFreeSpace
  export _root_.libredis.functions.sds_free
  export _root_.libredis.functions.sds_malloc
  export _root_.libredis.functions.sds_realloc
  export _root_.libredis.functions.sdsalloc
  export _root_.libredis.functions.sdsavail
  export _root_.libredis.functions.sdscat
  export _root_.libredis.functions.sdscatfmt
  export _root_.libredis.functions.sdscatlen
  export _root_.libredis.functions.sdscatprintf
  export _root_.libredis.functions.sdscatrepr
  export _root_.libredis.functions.sdscatsds
  export _root_.libredis.functions.sdscatvprintf
  export _root_.libredis.functions.sdsclear
  export _root_.libredis.functions.sdscmp
  export _root_.libredis.functions.sdscpy
  export _root_.libredis.functions.sdscpylen
  export _root_.libredis.functions.sdsdup
  export _root_.libredis.functions.sdsempty
  export _root_.libredis.functions.sdsfree
  export _root_.libredis.functions.sdsfreesplitres
  export _root_.libredis.functions.sdsfromlonglong
  export _root_.libredis.functions.sdsgrowzero
  export _root_.libredis.functions.sdsinclen
  export _root_.libredis.functions.sdsjoin
  export _root_.libredis.functions.sdsjoinsds
  export _root_.libredis.functions.sdslen
  export _root_.libredis.functions.sdsmapchars
  export _root_.libredis.functions.sdsnew
  export _root_.libredis.functions.sdsnewlen
  export _root_.libredis.functions.sdsrange
  export _root_.libredis.functions.sdssetalloc
  export _root_.libredis.functions.sdssetlen
  export _root_.libredis.functions.sdssplitargs
  export _root_.libredis.functions.sdssplitlen
  export _root_.libredis.functions.sdstolower
  export _root_.libredis.functions.sdstoupper
  export _root_.libredis.functions.sdstrim
  export _root_.libredis.functions.sdsupdatelen
  export _root_.libredis.functions.hiredisSetAllocators
end all
