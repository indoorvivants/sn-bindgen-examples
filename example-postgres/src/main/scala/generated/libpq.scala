package libpq

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[libpq] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
     inline def int: CInt = eq.apply(t).toInt
     inline def uint: CUnsignedInt = eq.apply(t)
     inline def value: CUnsignedInt = eq.apply(t)


object enumerations:
  import predef.*
  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type ConnStatusType = CUnsignedInt
  object ConnStatusType extends CEnumU[ConnStatusType]:
    given _tag: Tag[ConnStatusType] = Tag.UInt
    inline def define(inline a: Long): ConnStatusType = a.toUInt
    val CONNECTION_OK = define(0)
    val CONNECTION_BAD = define(1)
    val CONNECTION_STARTED = define(2)
    val CONNECTION_MADE = define(3)
    val CONNECTION_AWAITING_RESPONSE = define(4)
    val CONNECTION_AUTH_OK = define(5)
    val CONNECTION_SETENV = define(6)
    val CONNECTION_SSL_STARTUP = define(7)
    val CONNECTION_NEEDED = define(8)
    val CONNECTION_CHECK_WRITABLE = define(9)
    val CONNECTION_CONSUME = define(10)
    val CONNECTION_GSS_STARTUP = define(11)
    val CONNECTION_CHECK_TARGET = define(12)
    val CONNECTION_CHECK_STANDBY = define(13)
    inline def getName(inline value: ConnStatusType): Option[String] =
      inline value match
        case CONNECTION_OK => Some("CONNECTION_OK")
        case CONNECTION_BAD => Some("CONNECTION_BAD")
        case CONNECTION_STARTED => Some("CONNECTION_STARTED")
        case CONNECTION_MADE => Some("CONNECTION_MADE")
        case CONNECTION_AWAITING_RESPONSE => Some("CONNECTION_AWAITING_RESPONSE")
        case CONNECTION_AUTH_OK => Some("CONNECTION_AUTH_OK")
        case CONNECTION_SETENV => Some("CONNECTION_SETENV")
        case CONNECTION_SSL_STARTUP => Some("CONNECTION_SSL_STARTUP")
        case CONNECTION_NEEDED => Some("CONNECTION_NEEDED")
        case CONNECTION_CHECK_WRITABLE => Some("CONNECTION_CHECK_WRITABLE")
        case CONNECTION_CONSUME => Some("CONNECTION_CONSUME")
        case CONNECTION_GSS_STARTUP => Some("CONNECTION_GSS_STARTUP")
        case CONNECTION_CHECK_TARGET => Some("CONNECTION_CHECK_TARGET")
        case CONNECTION_CHECK_STANDBY => Some("CONNECTION_CHECK_STANDBY")
        case _ => None
    extension (a: ConnStatusType)
      inline def &(b: ConnStatusType): ConnStatusType = a & b
      inline def |(b: ConnStatusType): ConnStatusType = a | b
      inline def is(b: ConnStatusType): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type ExecStatusType = CUnsignedInt
  object ExecStatusType extends CEnumU[ExecStatusType]:
    given _tag: Tag[ExecStatusType] = Tag.UInt
    inline def define(inline a: Long): ExecStatusType = a.toUInt
    val PGRES_EMPTY_QUERY = define(0)
    val PGRES_COMMAND_OK = define(1)
    val PGRES_TUPLES_OK = define(2)
    val PGRES_COPY_OUT = define(3)
    val PGRES_COPY_IN = define(4)
    val PGRES_BAD_RESPONSE = define(5)
    val PGRES_NONFATAL_ERROR = define(6)
    val PGRES_FATAL_ERROR = define(7)
    val PGRES_COPY_BOTH = define(8)
    val PGRES_SINGLE_TUPLE = define(9)
    val PGRES_PIPELINE_SYNC = define(10)
    val PGRES_PIPELINE_ABORTED = define(11)
    inline def getName(inline value: ExecStatusType): Option[String] =
      inline value match
        case PGRES_EMPTY_QUERY => Some("PGRES_EMPTY_QUERY")
        case PGRES_COMMAND_OK => Some("PGRES_COMMAND_OK")
        case PGRES_TUPLES_OK => Some("PGRES_TUPLES_OK")
        case PGRES_COPY_OUT => Some("PGRES_COPY_OUT")
        case PGRES_COPY_IN => Some("PGRES_COPY_IN")
        case PGRES_BAD_RESPONSE => Some("PGRES_BAD_RESPONSE")
        case PGRES_NONFATAL_ERROR => Some("PGRES_NONFATAL_ERROR")
        case PGRES_FATAL_ERROR => Some("PGRES_FATAL_ERROR")
        case PGRES_COPY_BOTH => Some("PGRES_COPY_BOTH")
        case PGRES_SINGLE_TUPLE => Some("PGRES_SINGLE_TUPLE")
        case PGRES_PIPELINE_SYNC => Some("PGRES_PIPELINE_SYNC")
        case PGRES_PIPELINE_ABORTED => Some("PGRES_PIPELINE_ABORTED")
        case _ => None
    extension (a: ExecStatusType)
      inline def &(b: ExecStatusType): ExecStatusType = a & b
      inline def |(b: ExecStatusType): ExecStatusType = a | b
      inline def is(b: ExecStatusType): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PGContextVisibility = CUnsignedInt
  object PGContextVisibility extends CEnumU[PGContextVisibility]:
    given _tag: Tag[PGContextVisibility] = Tag.UInt
    inline def define(inline a: Long): PGContextVisibility = a.toUInt
    val PQSHOW_CONTEXT_NEVER = define(0)
    val PQSHOW_CONTEXT_ERRORS = define(1)
    val PQSHOW_CONTEXT_ALWAYS = define(2)
    inline def getName(inline value: PGContextVisibility): Option[String] =
      inline value match
        case PQSHOW_CONTEXT_NEVER => Some("PQSHOW_CONTEXT_NEVER")
        case PQSHOW_CONTEXT_ERRORS => Some("PQSHOW_CONTEXT_ERRORS")
        case PQSHOW_CONTEXT_ALWAYS => Some("PQSHOW_CONTEXT_ALWAYS")
        case _ => None
    extension (a: PGContextVisibility)
      inline def &(b: PGContextVisibility): PGContextVisibility = a & b
      inline def |(b: PGContextVisibility): PGContextVisibility = a | b
      inline def is(b: PGContextVisibility): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PGPing = CUnsignedInt
  object PGPing extends CEnumU[PGPing]:
    given _tag: Tag[PGPing] = Tag.UInt
    inline def define(inline a: Long): PGPing = a.toUInt
    val PQPING_OK = define(0)
    val PQPING_REJECT = define(1)
    val PQPING_NO_RESPONSE = define(2)
    val PQPING_NO_ATTEMPT = define(3)
    inline def getName(inline value: PGPing): Option[String] =
      inline value match
        case PQPING_OK => Some("PQPING_OK")
        case PQPING_REJECT => Some("PQPING_REJECT")
        case PQPING_NO_RESPONSE => Some("PQPING_NO_RESPONSE")
        case PQPING_NO_ATTEMPT => Some("PQPING_NO_ATTEMPT")
        case _ => None
    extension (a: PGPing)
      inline def &(b: PGPing): PGPing = a & b
      inline def |(b: PGPing): PGPing = a | b
      inline def is(b: PGPing): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PGTransactionStatusType = CUnsignedInt
  object PGTransactionStatusType extends CEnumU[PGTransactionStatusType]:
    given _tag: Tag[PGTransactionStatusType] = Tag.UInt
    inline def define(inline a: Long): PGTransactionStatusType = a.toUInt
    val PQTRANS_IDLE = define(0)
    val PQTRANS_ACTIVE = define(1)
    val PQTRANS_INTRANS = define(2)
    val PQTRANS_INERROR = define(3)
    val PQTRANS_UNKNOWN = define(4)
    inline def getName(inline value: PGTransactionStatusType): Option[String] =
      inline value match
        case PQTRANS_IDLE => Some("PQTRANS_IDLE")
        case PQTRANS_ACTIVE => Some("PQTRANS_ACTIVE")
        case PQTRANS_INTRANS => Some("PQTRANS_INTRANS")
        case PQTRANS_INERROR => Some("PQTRANS_INERROR")
        case PQTRANS_UNKNOWN => Some("PQTRANS_UNKNOWN")
        case _ => None
    extension (a: PGTransactionStatusType)
      inline def &(b: PGTransactionStatusType): PGTransactionStatusType = a & b
      inline def |(b: PGTransactionStatusType): PGTransactionStatusType = a | b
      inline def is(b: PGTransactionStatusType): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PGVerbosity = CUnsignedInt
  object PGVerbosity extends CEnumU[PGVerbosity]:
    given _tag: Tag[PGVerbosity] = Tag.UInt
    inline def define(inline a: Long): PGVerbosity = a.toUInt
    val PQERRORS_TERSE = define(0)
    val PQERRORS_DEFAULT = define(1)
    val PQERRORS_VERBOSE = define(2)
    val PQERRORS_SQLSTATE = define(3)
    inline def getName(inline value: PGVerbosity): Option[String] =
      inline value match
        case PQERRORS_TERSE => Some("PQERRORS_TERSE")
        case PQERRORS_DEFAULT => Some("PQERRORS_DEFAULT")
        case PQERRORS_VERBOSE => Some("PQERRORS_VERBOSE")
        case PQERRORS_SQLSTATE => Some("PQERRORS_SQLSTATE")
        case _ => None
    extension (a: PGVerbosity)
      inline def &(b: PGVerbosity): PGVerbosity = a & b
      inline def |(b: PGVerbosity): PGVerbosity = a | b
      inline def is(b: PGVerbosity): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PGpipelineStatus = CUnsignedInt
  object PGpipelineStatus extends CEnumU[PGpipelineStatus]:
    given _tag: Tag[PGpipelineStatus] = Tag.UInt
    inline def define(inline a: Long): PGpipelineStatus = a.toUInt
    val PQ_PIPELINE_OFF = define(0)
    val PQ_PIPELINE_ON = define(1)
    val PQ_PIPELINE_ABORTED = define(2)
    inline def getName(inline value: PGpipelineStatus): Option[String] =
      inline value match
        case PQ_PIPELINE_OFF => Some("PQ_PIPELINE_OFF")
        case PQ_PIPELINE_ON => Some("PQ_PIPELINE_ON")
        case PQ_PIPELINE_ABORTED => Some("PQ_PIPELINE_ABORTED")
        case _ => None
    extension (a: PGpipelineStatus)
      inline def &(b: PGpipelineStatus): PGpipelineStatus = a & b
      inline def |(b: PGpipelineStatus): PGpipelineStatus = a | b
      inline def is(b: PGpipelineStatus): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PostgresPollingStatusType = CUnsignedInt
  object PostgresPollingStatusType extends CEnumU[PostgresPollingStatusType]:
    given _tag: Tag[PostgresPollingStatusType] = Tag.UInt
    inline def define(inline a: Long): PostgresPollingStatusType = a.toUInt
    val PGRES_POLLING_FAILED = define(0)
    val PGRES_POLLING_READING = define(1)
    val PGRES_POLLING_WRITING = define(2)
    val PGRES_POLLING_OK = define(3)
    val PGRES_POLLING_ACTIVE = define(4)
    inline def getName(inline value: PostgresPollingStatusType): Option[String] =
      inline value match
        case PGRES_POLLING_FAILED => Some("PGRES_POLLING_FAILED")
        case PGRES_POLLING_READING => Some("PGRES_POLLING_READING")
        case PGRES_POLLING_WRITING => Some("PGRES_POLLING_WRITING")
        case PGRES_POLLING_OK => Some("PGRES_POLLING_OK")
        case PGRES_POLLING_ACTIVE => Some("PGRES_POLLING_ACTIVE")
        case _ => None
    extension (a: PostgresPollingStatusType)
      inline def &(b: PostgresPollingStatusType): PostgresPollingStatusType = a & b
      inline def |(b: PostgresPollingStatusType): PostgresPollingStatusType = a | b
      inline def is(b: PostgresPollingStatusType): Boolean = (a & b) == b

object aliases:
  import _root_.libpq.enumerations.*
  import _root_.libpq.predef.*
  import _root_.libpq.aliases.*
  import _root_.libpq.structs.*
  type FILE = libc.stdio.FILE
  object FILE: 
    val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
    inline def apply(inline o: libc.stdio.FILE): FILE = o
    extension (v: FILE)
      inline def value: libc.stdio.FILE = v

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/postgres_ext.h
  */
  opaque type Oid = CUnsignedInt
  object Oid: 
    given _tag: Tag[Oid] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): Oid = o
    extension (v: Oid)
      inline def value: CUnsignedInt = v

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PQnoticeProcessor = CFuncPtr2[Ptr[Byte], CString, Unit]
  object PQnoticeProcessor: 
    given _tag: Tag[PQnoticeProcessor] = Tag.materializeCFuncPtr2[Ptr[Byte], CString, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): PQnoticeProcessor = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[Byte], CString, Unit]): PQnoticeProcessor = o
    extension (v: PQnoticeProcessor)
      inline def value: CFuncPtr2[Ptr[Byte], CString, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PQnoticeReceiver = CFuncPtr2[Ptr[Byte], Ptr[PGresult], Unit]
  object PQnoticeReceiver: 
    given _tag: Tag[PQnoticeReceiver] = Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[PGresult], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): PQnoticeReceiver = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[Byte], Ptr[PGresult], Unit]): PQnoticeReceiver = o
    extension (v: PQnoticeReceiver)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[PGresult], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PQsslKeyPassHook_OpenSSL_type = CFuncPtr3[CString, CInt, Ptr[PGconn], CInt]
  object PQsslKeyPassHook_OpenSSL_type: 
    given _tag: Tag[PQsslKeyPassHook_OpenSSL_type] = Tag.materializeCFuncPtr3[CString, CInt, Ptr[PGconn], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): PQsslKeyPassHook_OpenSSL_type = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[CString, CInt, Ptr[PGconn], CInt]): PQsslKeyPassHook_OpenSSL_type = o
    extension (v: PQsslKeyPassHook_OpenSSL_type)
      inline def value: CFuncPtr3[CString, CInt, Ptr[PGconn], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/postgres_ext.h
  */
  opaque type pg_int64 = CLongInt
  object pg_int64: 
    given _tag: Tag[pg_int64] = Tag.Long
    inline def apply(inline o: CLongInt): pg_int64 = o
    extension (v: pg_int64)
      inline def value: CLongInt = v

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type pgthreadlock_t = CFuncPtr1[CInt, Unit]
  object pgthreadlock_t: 
    given _tag: Tag[pgthreadlock_t] = Tag.materializeCFuncPtr1[CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): pgthreadlock_t = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[CInt, Unit]): pgthreadlock_t = o
    extension (v: pgthreadlock_t)
      inline def value: CFuncPtr1[CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type pqbool = CChar
  object pqbool: 
    given _tag: Tag[pqbool] = Tag.Byte
    inline def apply(inline o: CChar): pqbool = o
    extension (v: pqbool)
      inline def value: CChar = v

  type size_t = libc.stddef.size_t
  object size_t: 
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t)
      inline def value: libc.stddef.size_t = v

object structs:
  import _root_.libpq.enumerations.*
  import _root_.libpq.predef.*
  import _root_.libpq.aliases.*
  import _root_.libpq.structs.*
  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PGcancel = CStruct0
  object PGcancel:
    given _tag: Tag[PGcancel] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PGconn = CStruct0
  object PGconn:
    given _tag: Tag[PGconn] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PGnotify = CStruct4[CString, CInt, CString, Ptr[Byte]]
  object PGnotify:
    given _tag: Tag[PGnotify] = Tag.materializeCStruct4Tag[CString, CInt, CString, Ptr[Byte]]
    def apply()(using Zone): Ptr[PGnotify] = scala.scalanative.unsafe.alloc[PGnotify](1)
    def apply(relname : CString, be_pid : CInt, extra : CString, next : Ptr[pgNotify])(using Zone): Ptr[PGnotify] = 
      val ____ptr = apply()
      (!____ptr).relname = relname
      (!____ptr).be_pid = be_pid
      (!____ptr).extra = extra
      (!____ptr).next = next
      ____ptr
    extension (struct: PGnotify)
      def relname : CString = struct._1
      def relname_=(value: CString): Unit = !struct.at1 = value
      def be_pid : CInt = struct._2
      def be_pid_=(value: CInt): Unit = !struct.at2 = value
      def extra : CString = struct._3
      def extra_=(value: CString): Unit = !struct.at3 = value
      def next : Ptr[pgNotify] = struct._4.asInstanceOf[Ptr[pgNotify]]
      def next_=(value: Ptr[pgNotify]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PGresAttDesc = CStruct7[CString, Oid, CInt, CInt, Oid, CInt, CInt]
  object PGresAttDesc:
    given _tag: Tag[PGresAttDesc] = Tag.materializeCStruct7Tag[CString, Oid, CInt, CInt, Oid, CInt, CInt]
    def apply()(using Zone): Ptr[PGresAttDesc] = scala.scalanative.unsafe.alloc[PGresAttDesc](1)
    def apply(name : CString, tableid : Oid, columnid : CInt, format : CInt, typid : Oid, typlen : CInt, atttypmod : CInt)(using Zone): Ptr[PGresAttDesc] = 
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).tableid = tableid
      (!____ptr).columnid = columnid
      (!____ptr).format = format
      (!____ptr).typid = typid
      (!____ptr).typlen = typlen
      (!____ptr).atttypmod = atttypmod
      ____ptr
    extension (struct: PGresAttDesc)
      def name : CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def tableid : Oid = struct._2
      def tableid_=(value: Oid): Unit = !struct.at2 = value
      def columnid : CInt = struct._3
      def columnid_=(value: CInt): Unit = !struct.at3 = value
      def format : CInt = struct._4
      def format_=(value: CInt): Unit = !struct.at4 = value
      def typid : Oid = struct._5
      def typid_=(value: Oid): Unit = !struct.at5 = value
      def typlen : CInt = struct._6
      def typlen_=(value: CInt): Unit = !struct.at6 = value
      def atttypmod : CInt = struct._7
      def atttypmod_=(value: CInt): Unit = !struct.at7 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PGresult = CStruct0
  object PGresult:
    given _tag: Tag[PGresult] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PQArgBlock = CStruct3[CInt, CInt, PQArgBlock.Union0]
  object PQArgBlock:
    /**
     * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
    */
    opaque type Union0 = CArray[Byte, Nat._8]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_ptr")
      def apply(ptr: Ptr[CInt])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[CInt]]].update(0, ptr)
        ___ptr
      @scala.annotation.targetName("apply_integer")
      def apply(integer: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, integer)
        ___ptr
      extension (struct: Union0)
        def ptr : Ptr[CInt] = !struct.at(0).asInstanceOf[Ptr[Ptr[CInt]]]
        def ptr_=(value: Ptr[CInt]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[CInt]]] = value
        def integer : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def integer_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    given _tag: Tag[PQArgBlock] = Tag.materializeCStruct3Tag[CInt, CInt, PQArgBlock.Union0]
    def apply()(using Zone): Ptr[PQArgBlock] = scala.scalanative.unsafe.alloc[PQArgBlock](1)
    def apply(len : CInt, isint : CInt, u : PQArgBlock.Union0)(using Zone): Ptr[PQArgBlock] = 
      val ____ptr = apply()
      (!____ptr).len = len
      (!____ptr).isint = isint
      (!____ptr).u = u
      ____ptr
    extension (struct: PQArgBlock)
      def len : CInt = struct._1
      def len_=(value: CInt): Unit = !struct.at1 = value
      def isint : CInt = struct._2
      def isint_=(value: CInt): Unit = !struct.at2 = value
      def u : PQArgBlock.Union0 = struct._3
      def u_=(value: PQArgBlock.Union0): Unit = !struct.at3 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PQconninfoOption = CStruct7[CString, CString, CString, CString, CString, CString, CInt]
  object PQconninfoOption:
    given _tag: Tag[PQconninfoOption] = Tag.materializeCStruct7Tag[CString, CString, CString, CString, CString, CString, CInt]
    def apply()(using Zone): Ptr[PQconninfoOption] = scala.scalanative.unsafe.alloc[PQconninfoOption](1)
    def apply(keyword : CString, envvar : CString, compiled : CString, `val` : CString, label : CString, dispchar : CString, dispsize : CInt)(using Zone): Ptr[PQconninfoOption] = 
      val ____ptr = apply()
      (!____ptr).keyword = keyword
      (!____ptr).envvar = envvar
      (!____ptr).compiled = compiled
      (!____ptr).`val` = `val`
      (!____ptr).label = label
      (!____ptr).dispchar = dispchar
      (!____ptr).dispsize = dispsize
      ____ptr
    extension (struct: PQconninfoOption)
      def keyword : CString = struct._1
      def keyword_=(value: CString): Unit = !struct.at1 = value
      def envvar : CString = struct._2
      def envvar_=(value: CString): Unit = !struct.at2 = value
      def compiled : CString = struct._3
      def compiled_=(value: CString): Unit = !struct.at3 = value
      def `val` : CString = struct._4
      def val_=(value: CString): Unit = !struct.at4 = value
      def label : CString = struct._5
      def label_=(value: CString): Unit = !struct.at5 = value
      def dispchar : CString = struct._6
      def dispchar_=(value: CString): Unit = !struct.at6 = value
      def dispsize : CInt = struct._7
      def dispsize_=(value: CInt): Unit = !struct.at7 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type PQprintOpt = CStruct10[pqbool, pqbool, pqbool, pqbool, pqbool, pqbool, CString, CString, CString, Ptr[CString]]
  object PQprintOpt:
    given _tag: Tag[PQprintOpt] = Tag.materializeCStruct10Tag[pqbool, pqbool, pqbool, pqbool, pqbool, pqbool, CString, CString, CString, Ptr[CString]]
    def apply()(using Zone): Ptr[PQprintOpt] = scala.scalanative.unsafe.alloc[PQprintOpt](1)
    def apply(header : pqbool, align : pqbool, standard : pqbool, html3 : pqbool, expanded : pqbool, pager : pqbool, fieldSep : CString, tableOpt : CString, caption : CString, fieldName : Ptr[CString])(using Zone): Ptr[PQprintOpt] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).align = align
      (!____ptr).standard = standard
      (!____ptr).html3 = html3
      (!____ptr).expanded = expanded
      (!____ptr).pager = pager
      (!____ptr).fieldSep = fieldSep
      (!____ptr).tableOpt = tableOpt
      (!____ptr).caption = caption
      (!____ptr).fieldName = fieldName
      ____ptr
    extension (struct: PQprintOpt)
      def header : pqbool = struct._1
      def header_=(value: pqbool): Unit = !struct.at1 = value
      def align : pqbool = struct._2
      def align_=(value: pqbool): Unit = !struct.at2 = value
      def standard : pqbool = struct._3
      def standard_=(value: pqbool): Unit = !struct.at3 = value
      def html3 : pqbool = struct._4
      def html3_=(value: pqbool): Unit = !struct.at4 = value
      def expanded : pqbool = struct._5
      def expanded_=(value: pqbool): Unit = !struct.at5 = value
      def pager : pqbool = struct._6
      def pager_=(value: pqbool): Unit = !struct.at6 = value
      def fieldSep : CString = struct._7
      def fieldSep_=(value: CString): Unit = !struct.at7 = value
      def tableOpt : CString = struct._8
      def tableOpt_=(value: CString): Unit = !struct.at8 = value
      def caption : CString = struct._9
      def caption_=(value: CString): Unit = !struct.at9 = value
      def fieldName : Ptr[CString] = struct._10
      def fieldName_=(value: Ptr[CString]): Unit = !struct.at10 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type _PQconninfoOption = CStruct7[CString, CString, CString, CString, CString, CString, CInt]
  object _PQconninfoOption:
    given _tag: Tag[_PQconninfoOption] = Tag.materializeCStruct7Tag[CString, CString, CString, CString, CString, CString, CInt]
    def apply()(using Zone): Ptr[_PQconninfoOption] = scala.scalanative.unsafe.alloc[_PQconninfoOption](1)
    def apply(keyword : CString, envvar : CString, compiled : CString, `val` : CString, label : CString, dispchar : CString, dispsize : CInt)(using Zone): Ptr[_PQconninfoOption] = 
      val ____ptr = apply()
      (!____ptr).keyword = keyword
      (!____ptr).envvar = envvar
      (!____ptr).compiled = compiled
      (!____ptr).`val` = `val`
      (!____ptr).label = label
      (!____ptr).dispchar = dispchar
      (!____ptr).dispsize = dispsize
      ____ptr
    extension (struct: _PQconninfoOption)
      def keyword : CString = struct._1
      def keyword_=(value: CString): Unit = !struct.at1 = value
      def envvar : CString = struct._2
      def envvar_=(value: CString): Unit = !struct.at2 = value
      def compiled : CString = struct._3
      def compiled_=(value: CString): Unit = !struct.at3 = value
      def `val` : CString = struct._4
      def val_=(value: CString): Unit = !struct.at4 = value
      def label : CString = struct._5
      def label_=(value: CString): Unit = !struct.at5 = value
      def dispchar : CString = struct._6
      def dispchar_=(value: CString): Unit = !struct.at6 = value
      def dispsize : CInt = struct._7
      def dispsize_=(value: CInt): Unit = !struct.at7 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type _PQprintOpt = CStruct10[pqbool, pqbool, pqbool, pqbool, pqbool, pqbool, CString, CString, CString, Ptr[CString]]
  object _PQprintOpt:
    given _tag: Tag[_PQprintOpt] = Tag.materializeCStruct10Tag[pqbool, pqbool, pqbool, pqbool, pqbool, pqbool, CString, CString, CString, Ptr[CString]]
    def apply()(using Zone): Ptr[_PQprintOpt] = scala.scalanative.unsafe.alloc[_PQprintOpt](1)
    def apply(header : pqbool, align : pqbool, standard : pqbool, html3 : pqbool, expanded : pqbool, pager : pqbool, fieldSep : CString, tableOpt : CString, caption : CString, fieldName : Ptr[CString])(using Zone): Ptr[_PQprintOpt] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).align = align
      (!____ptr).standard = standard
      (!____ptr).html3 = html3
      (!____ptr).expanded = expanded
      (!____ptr).pager = pager
      (!____ptr).fieldSep = fieldSep
      (!____ptr).tableOpt = tableOpt
      (!____ptr).caption = caption
      (!____ptr).fieldName = fieldName
      ____ptr
    extension (struct: _PQprintOpt)
      def header : pqbool = struct._1
      def header_=(value: pqbool): Unit = !struct.at1 = value
      def align : pqbool = struct._2
      def align_=(value: pqbool): Unit = !struct.at2 = value
      def standard : pqbool = struct._3
      def standard_=(value: pqbool): Unit = !struct.at3 = value
      def html3 : pqbool = struct._4
      def html3_=(value: pqbool): Unit = !struct.at4 = value
      def expanded : pqbool = struct._5
      def expanded_=(value: pqbool): Unit = !struct.at5 = value
      def pager : pqbool = struct._6
      def pager_=(value: pqbool): Unit = !struct.at6 = value
      def fieldSep : CString = struct._7
      def fieldSep_=(value: CString): Unit = !struct.at7 = value
      def tableOpt : CString = struct._8
      def tableOpt_=(value: CString): Unit = !struct.at8 = value
      def caption : CString = struct._9
      def caption_=(value: CString): Unit = !struct.at9 = value
      def fieldName : Ptr[CString] = struct._10
      def fieldName_=(value: Ptr[CString]): Unit = !struct.at10 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type pgNotify = CStruct4[CString, CInt, CString, Ptr[Byte]]
  object pgNotify:
    given _tag: Tag[pgNotify] = Tag.materializeCStruct4Tag[CString, CInt, CString, Ptr[Byte]]
    def apply()(using Zone): Ptr[pgNotify] = scala.scalanative.unsafe.alloc[pgNotify](1)
    def apply(relname : CString, be_pid : CInt, extra : CString, next : Ptr[pgNotify])(using Zone): Ptr[pgNotify] = 
      val ____ptr = apply()
      (!____ptr).relname = relname
      (!____ptr).be_pid = be_pid
      (!____ptr).extra = extra
      (!____ptr).next = next
      ____ptr
    extension (struct: pgNotify)
      def relname : CString = struct._1
      def relname_=(value: CString): Unit = !struct.at1 = value
      def be_pid : CInt = struct._2
      def be_pid_=(value: CInt): Unit = !struct.at2 = value
      def extra : CString = struct._3
      def extra_=(value: CString): Unit = !struct.at3 = value
      def next : Ptr[pgNotify] = struct._4.asInstanceOf[Ptr[pgNotify]]
      def next_=(value: Ptr[pgNotify]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type pg_cancel = CStruct0
  object pg_cancel:
    given _tag: Tag[pg_cancel] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type pg_conn = CStruct0
  object pg_conn:
    given _tag: Tag[pg_conn] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type pg_result = CStruct0
  object pg_result:
    given _tag: Tag[pg_result] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  opaque type pgresAttDesc = CStruct7[CString, Oid, CInt, CInt, Oid, CInt, CInt]
  object pgresAttDesc:
    given _tag: Tag[pgresAttDesc] = Tag.materializeCStruct7Tag[CString, Oid, CInt, CInt, Oid, CInt, CInt]
    def apply()(using Zone): Ptr[pgresAttDesc] = scala.scalanative.unsafe.alloc[pgresAttDesc](1)
    def apply(name : CString, tableid : Oid, columnid : CInt, format : CInt, typid : Oid, typlen : CInt, atttypmod : CInt)(using Zone): Ptr[pgresAttDesc] = 
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).tableid = tableid
      (!____ptr).columnid = columnid
      (!____ptr).format = format
      (!____ptr).typid = typid
      (!____ptr).typlen = typlen
      (!____ptr).atttypmod = atttypmod
      ____ptr
    extension (struct: pgresAttDesc)
      def name : CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def tableid : Oid = struct._2
      def tableid_=(value: Oid): Unit = !struct.at2 = value
      def columnid : CInt = struct._3
      def columnid_=(value: CInt): Unit = !struct.at3 = value
      def format : CInt = struct._4
      def format_=(value: CInt): Unit = !struct.at4 = value
      def typid : Oid = struct._5
      def typid_=(value: Oid): Unit = !struct.at5 = value
      def typlen : CInt = struct._6
      def typlen_=(value: CInt): Unit = !struct.at6 = value
      def atttypmod : CInt = struct._7
      def atttypmod_=(value: CInt): Unit = !struct.at7 = value

@link("pq")
@extern
private[libpq] object extern_functions:
  import _root_.libpq.enumerations.*
  import _root_.libpq.predef.*
  import _root_.libpq.aliases.*
  import _root_.libpq.structs.*
  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQbackendPID(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQbinaryTuples(res : Ptr[PGresult]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQcancel(cancel : Ptr[PGcancel], errbuf : CString, errbufsize : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQclear(res : Ptr[PGresult]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQclientEncoding(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQcmdStatus(res : Ptr[PGresult]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQcmdTuples(res : Ptr[PGresult]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconndefaults(): Ptr[PQconninfoOption] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconnectPoll(conn : Ptr[PGconn]): PostgresPollingStatusType = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconnectStart(conninfo : CString): Ptr[PGconn] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconnectStartParams(keywords : Ptr[CString], values : Ptr[CString], expand_dbname : CInt): Ptr[PGconn] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconnectdb(conninfo : CString): Ptr[PGconn] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconnectdbParams(keywords : Ptr[CString], values : Ptr[CString], expand_dbname : CInt): Ptr[PGconn] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconnectionNeedsPassword(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconnectionUsedGSSAPI(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconnectionUsedPassword(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconninfo(conn : Ptr[PGconn]): Ptr[PQconninfoOption] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconninfoFree(connOptions : Ptr[PQconninfoOption]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconninfoParse(conninfo : CString, errmsg : Ptr[CString]): Ptr[PQconninfoOption] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQconsumeInput(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQcopyResult(src : Ptr[PGresult], flags : CInt): Ptr[PGresult] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQdb(conn : Ptr[PGconn]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQdefaultSSLKeyPassHook_OpenSSL(buf : CString, size : CInt, conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQdescribePortal(conn : Ptr[PGconn], portal : CString): Ptr[PGresult] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQdescribePrepared(conn : Ptr[PGconn], stmt : CString): Ptr[PGresult] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQdisplayTuples(res : Ptr[PGresult], fp : Ptr[FILE], fillAlign : CInt, fieldSep : CString, printHeader : CInt, quiet : CInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQdsplen(s : CString, encoding : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQencryptPassword(passwd : CString, user : CString): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQencryptPasswordConn(conn : Ptr[PGconn], passwd : CString, user : CString, algorithm : CString): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQendcopy(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQenterPipelineMode(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQenv2encoding(): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQerrorMessage(conn : Ptr[PGconn]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQescapeBytea(from : Ptr[CUnsignedChar], from_length : size_t, to_length : Ptr[size_t]): Ptr[CUnsignedChar] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQescapeByteaConn(conn : Ptr[PGconn], from : Ptr[CUnsignedChar], from_length : size_t, to_length : Ptr[size_t]): Ptr[CUnsignedChar] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQescapeIdentifier(conn : Ptr[PGconn], str : CString, len : size_t): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQescapeLiteral(conn : Ptr[PGconn], str : CString, len : size_t): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQescapeString(to : CString, from : CString, length : size_t): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQescapeStringConn(conn : Ptr[PGconn], to : CString, from : CString, length : size_t, error : Ptr[CInt]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQexec(conn : Ptr[PGconn], query : CString): Ptr[PGresult] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQexecParams(conn : Ptr[PGconn], command : CString, nParams : CInt, paramTypes : Ptr[Oid], paramValues : Ptr[CString], paramLengths : Ptr[CInt], paramFormats : Ptr[CInt], resultFormat : CInt): Ptr[PGresult] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQexecPrepared(conn : Ptr[PGconn], stmtName : CString, nParams : CInt, paramValues : Ptr[CString], paramLengths : Ptr[CInt], paramFormats : Ptr[CInt], resultFormat : CInt): Ptr[PGresult] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQexitPipelineMode(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQfformat(res : Ptr[PGresult], field_num : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQfinish(conn : Ptr[PGconn]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQflush(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQfmod(res : Ptr[PGresult], field_num : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQfn(conn : Ptr[PGconn], fnid : CInt, result_buf : Ptr[CInt], result_len : Ptr[CInt], result_is_int : CInt, args : Ptr[PQArgBlock], nargs : CInt): Ptr[PGresult] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQfname(res : Ptr[PGresult], field_num : CInt): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQfnumber(res : Ptr[PGresult], field_name : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQfreeCancel(cancel : Ptr[PGcancel]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQfreemem(ptr : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQfsize(res : Ptr[PGresult], field_num : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQftable(res : Ptr[PGresult], field_num : CInt): Oid = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQftablecol(res : Ptr[PGresult], field_num : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQftype(res : Ptr[PGresult], field_num : CInt): Oid = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgetCancel(conn : Ptr[PGconn]): Ptr[PGcancel] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgetCopyData(conn : Ptr[PGconn], buffer : Ptr[CString], async : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgetResult(conn : Ptr[PGconn]): Ptr[PGresult] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgetSSLKeyPassHook_OpenSSL(): PQsslKeyPassHook_OpenSSL_type = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgetgssctx(conn : Ptr[PGconn]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgetisnull(res : Ptr[PGresult], tup_num : CInt, field_num : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgetlength(res : Ptr[PGresult], tup_num : CInt, field_num : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgetline(conn : Ptr[PGconn], buffer : CString, length : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgetlineAsync(conn : Ptr[PGconn], buffer : CString, bufsize : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgetssl(conn : Ptr[PGconn]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgetvalue(res : Ptr[PGresult], tup_num : CInt, field_num : CInt): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQgssEncInUse(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQhost(conn : Ptr[PGconn]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQhostaddr(conn : Ptr[PGconn]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQinitOpenSSL(do_ssl : CInt, do_crypto : CInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQinitSSL(do_init : CInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQisBusy(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQisnonblocking(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQisthreadsafe(): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQlibVersion(): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQmakeEmptyPGresult(conn : Ptr[PGconn], status : ExecStatusType): Ptr[PGresult] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQmblen(s : CString, encoding : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQmblenBounded(s : CString, encoding : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQnfields(res : Ptr[PGresult]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQnotifies(conn : Ptr[PGconn]): Ptr[PGnotify] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQnparams(res : Ptr[PGresult]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQntuples(res : Ptr[PGresult]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQoidStatus(res : Ptr[PGresult]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQoidValue(res : Ptr[PGresult]): Oid = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQoptions(conn : Ptr[PGconn]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQparameterStatus(conn : Ptr[PGconn], paramName : CString): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQparamtype(res : Ptr[PGresult], param_num : CInt): Oid = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQpass(conn : Ptr[PGconn]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQping(conninfo : CString): PGPing = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQpingParams(keywords : Ptr[CString], values : Ptr[CString], expand_dbname : CInt): PGPing = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQpipelineStatus(conn : Ptr[PGconn]): PGpipelineStatus = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQpipelineSync(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQport(conn : Ptr[PGconn]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQprepare(conn : Ptr[PGconn], stmtName : CString, query : CString, nParams : CInt, paramTypes : Ptr[Oid]): Ptr[PGresult] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQprint(fout : Ptr[FILE], res : Ptr[PGresult], po : Ptr[PQprintOpt]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQprintTuples(res : Ptr[PGresult], fout : Ptr[FILE], PrintAttNames : CInt, TerseOutput : CInt, colWidth : CInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQprotocolVersion(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQputCopyData(conn : Ptr[PGconn], buffer : CString, nbytes : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQputCopyEnd(conn : Ptr[PGconn], errormsg : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQputline(conn : Ptr[PGconn], string : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQputnbytes(conn : Ptr[PGconn], buffer : CString, nbytes : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQregisterThreadLock(newhandler : pgthreadlock_t): pgthreadlock_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQrequestCancel(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQresStatus(status : ExecStatusType): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQreset(conn : Ptr[PGconn]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQresetPoll(conn : Ptr[PGconn]): PostgresPollingStatusType = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQresetStart(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQresultAlloc(res : Ptr[PGresult], nBytes : size_t): Ptr[Byte] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQresultErrorField(res : Ptr[PGresult], fieldcode : CInt): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQresultErrorMessage(res : Ptr[PGresult]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQresultMemorySize(res : Ptr[PGresult]): size_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQresultStatus(res : Ptr[PGresult]): ExecStatusType = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQresultVerboseErrorMessage(res : Ptr[PGresult], verbosity : PGVerbosity, show_context : PGContextVisibility): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsendDescribePortal(conn : Ptr[PGconn], portal : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsendDescribePrepared(conn : Ptr[PGconn], stmt : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsendFlushRequest(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsendPrepare(conn : Ptr[PGconn], stmtName : CString, query : CString, nParams : CInt, paramTypes : Ptr[Oid]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsendQuery(conn : Ptr[PGconn], query : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsendQueryParams(conn : Ptr[PGconn], command : CString, nParams : CInt, paramTypes : Ptr[Oid], paramValues : Ptr[CString], paramLengths : Ptr[CInt], paramFormats : Ptr[CInt], resultFormat : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsendQueryPrepared(conn : Ptr[PGconn], stmtName : CString, nParams : CInt, paramValues : Ptr[CString], paramLengths : Ptr[CInt], paramFormats : Ptr[CInt], resultFormat : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQserverVersion(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetClientEncoding(conn : Ptr[PGconn], encoding : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetErrorContextVisibility(conn : Ptr[PGconn], show_context : PGContextVisibility): PGContextVisibility = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetErrorVerbosity(conn : Ptr[PGconn], verbosity : PGVerbosity): PGVerbosity = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetNoticeProcessor(conn : Ptr[PGconn], proc : PQnoticeProcessor, arg : Ptr[Byte]): PQnoticeProcessor = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetNoticeReceiver(conn : Ptr[PGconn], proc : PQnoticeReceiver, arg : Ptr[Byte]): PQnoticeReceiver = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetResultAttrs(res : Ptr[PGresult], numAttributes : CInt, attDescs : Ptr[PGresAttDesc]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetSSLKeyPassHook_OpenSSL(hook : PQsslKeyPassHook_OpenSSL_type): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetSingleRowMode(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetTraceFlags(conn : Ptr[PGconn], flags : CInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetdbLogin(pghost : CString, pgport : CString, pgoptions : CString, pgtty : CString, dbName : CString, login : CString, pwd : CString): Ptr[PGconn] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetnonblocking(conn : Ptr[PGconn], arg : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsetvalue(res : Ptr[PGresult], tup_num : CInt, field_num : CInt, value : CString, len : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsocket(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsslAttribute(conn : Ptr[PGconn], attribute_name : CString): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsslAttributeNames(conn : Ptr[PGconn]): Ptr[CString] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsslInUse(conn : Ptr[PGconn]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQsslStruct(conn : Ptr[PGconn], struct_name : CString): Ptr[Byte] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQstatus(conn : Ptr[PGconn]): ConnStatusType = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQtrace(conn : Ptr[PGconn], debug_port : Ptr[FILE]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQtransactionStatus(conn : Ptr[PGconn]): PGTransactionStatusType = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQtty(conn : Ptr[PGconn]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQunescapeBytea(strtext : Ptr[CUnsignedChar], retbuflen : Ptr[size_t]): Ptr[CUnsignedChar] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQuntrace(conn : Ptr[PGconn]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def PQuser(conn : Ptr[PGconn]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_close(conn : Ptr[PGconn], fd : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_creat(conn : Ptr[PGconn], mode : CInt): Oid = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_create(conn : Ptr[PGconn], lobjId : Oid): Oid = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_export(conn : Ptr[PGconn], lobjId : Oid, filename : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_import(conn : Ptr[PGconn], filename : CString): Oid = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_import_with_oid(conn : Ptr[PGconn], filename : CString, lobjId : Oid): Oid = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_lseek(conn : Ptr[PGconn], fd : CInt, offset : CInt, whence : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_lseek64(conn : Ptr[PGconn], fd : CInt, offset : pg_int64, whence : CInt): pg_int64 = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_open(conn : Ptr[PGconn], lobjId : Oid, mode : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_read(conn : Ptr[PGconn], fd : CInt, buf : CString, len : size_t): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_tell(conn : Ptr[PGconn], fd : CInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_tell64(conn : Ptr[PGconn], fd : CInt): pg_int64 = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_truncate(conn : Ptr[PGconn], fd : CInt, len : size_t): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_truncate64(conn : Ptr[PGconn], fd : CInt, len : pg_int64): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_unlink(conn : Ptr[PGconn], lobjId : Oid): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def lo_write(conn : Ptr[PGconn], fd : CInt, buf : CString, len : size_t): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def pg_char_to_encoding(name : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def pg_encoding_to_char(encoding : CInt): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/libpq_arm64-osx/include/libpq-fe.h
  */
  def pg_valid_server_encoding_id(encoding : CInt): CInt = extern


object functions:
  import _root_.libpq.enumerations.*
  import _root_.libpq.predef.*
  import _root_.libpq.aliases.*
  import _root_.libpq.structs.*
  import extern_functions.*
  export extern_functions.*

object types:
  export _root_.libpq.structs.*
  export _root_.libpq.aliases.*
  export _root_.libpq.enumerations.*

object all:
  export _root_.libpq.enumerations.ConnStatusType
  export _root_.libpq.enumerations.ExecStatusType
  export _root_.libpq.enumerations.PGContextVisibility
  export _root_.libpq.enumerations.PGPing
  export _root_.libpq.enumerations.PGTransactionStatusType
  export _root_.libpq.enumerations.PGVerbosity
  export _root_.libpq.enumerations.PGpipelineStatus
  export _root_.libpq.enumerations.PostgresPollingStatusType
  export _root_.libpq.aliases.FILE
  export _root_.libpq.aliases.Oid
  export _root_.libpq.aliases.PQnoticeProcessor
  export _root_.libpq.aliases.PQnoticeReceiver
  export _root_.libpq.aliases.PQsslKeyPassHook_OpenSSL_type
  export _root_.libpq.aliases.pg_int64
  export _root_.libpq.aliases.pgthreadlock_t
  export _root_.libpq.aliases.pqbool
  export _root_.libpq.aliases.size_t
  export _root_.libpq.structs.PGcancel
  export _root_.libpq.structs.PGconn
  export _root_.libpq.structs.PGnotify
  export _root_.libpq.structs.PGresAttDesc
  export _root_.libpq.structs.PGresult
  export _root_.libpq.structs.PQArgBlock
  export _root_.libpq.structs.PQconninfoOption
  export _root_.libpq.structs.PQprintOpt
  export _root_.libpq.structs._PQconninfoOption
  export _root_.libpq.structs._PQprintOpt
  export _root_.libpq.structs.pgNotify
  export _root_.libpq.structs.pg_cancel
  export _root_.libpq.structs.pg_conn
  export _root_.libpq.structs.pg_result
  export _root_.libpq.structs.pgresAttDesc
  export _root_.libpq.functions.PQbackendPID
  export _root_.libpq.functions.PQbinaryTuples
  export _root_.libpq.functions.PQcancel
  export _root_.libpq.functions.PQclear
  export _root_.libpq.functions.PQclientEncoding
  export _root_.libpq.functions.PQcmdStatus
  export _root_.libpq.functions.PQcmdTuples
  export _root_.libpq.functions.PQconndefaults
  export _root_.libpq.functions.PQconnectPoll
  export _root_.libpq.functions.PQconnectStart
  export _root_.libpq.functions.PQconnectStartParams
  export _root_.libpq.functions.PQconnectdb
  export _root_.libpq.functions.PQconnectdbParams
  export _root_.libpq.functions.PQconnectionNeedsPassword
  export _root_.libpq.functions.PQconnectionUsedGSSAPI
  export _root_.libpq.functions.PQconnectionUsedPassword
  export _root_.libpq.functions.PQconninfo
  export _root_.libpq.functions.PQconninfoFree
  export _root_.libpq.functions.PQconninfoParse
  export _root_.libpq.functions.PQconsumeInput
  export _root_.libpq.functions.PQcopyResult
  export _root_.libpq.functions.PQdb
  export _root_.libpq.functions.PQdefaultSSLKeyPassHook_OpenSSL
  export _root_.libpq.functions.PQdescribePortal
  export _root_.libpq.functions.PQdescribePrepared
  export _root_.libpq.functions.PQdisplayTuples
  export _root_.libpq.functions.PQdsplen
  export _root_.libpq.functions.PQencryptPassword
  export _root_.libpq.functions.PQencryptPasswordConn
  export _root_.libpq.functions.PQendcopy
  export _root_.libpq.functions.PQenterPipelineMode
  export _root_.libpq.functions.PQenv2encoding
  export _root_.libpq.functions.PQerrorMessage
  export _root_.libpq.functions.PQescapeBytea
  export _root_.libpq.functions.PQescapeByteaConn
  export _root_.libpq.functions.PQescapeIdentifier
  export _root_.libpq.functions.PQescapeLiteral
  export _root_.libpq.functions.PQescapeString
  export _root_.libpq.functions.PQescapeStringConn
  export _root_.libpq.functions.PQexec
  export _root_.libpq.functions.PQexecParams
  export _root_.libpq.functions.PQexecPrepared
  export _root_.libpq.functions.PQexitPipelineMode
  export _root_.libpq.functions.PQfformat
  export _root_.libpq.functions.PQfinish
  export _root_.libpq.functions.PQflush
  export _root_.libpq.functions.PQfmod
  export _root_.libpq.functions.PQfn
  export _root_.libpq.functions.PQfname
  export _root_.libpq.functions.PQfnumber
  export _root_.libpq.functions.PQfreeCancel
  export _root_.libpq.functions.PQfreemem
  export _root_.libpq.functions.PQfsize
  export _root_.libpq.functions.PQftable
  export _root_.libpq.functions.PQftablecol
  export _root_.libpq.functions.PQftype
  export _root_.libpq.functions.PQgetCancel
  export _root_.libpq.functions.PQgetCopyData
  export _root_.libpq.functions.PQgetResult
  export _root_.libpq.functions.PQgetSSLKeyPassHook_OpenSSL
  export _root_.libpq.functions.PQgetgssctx
  export _root_.libpq.functions.PQgetisnull
  export _root_.libpq.functions.PQgetlength
  export _root_.libpq.functions.PQgetline
  export _root_.libpq.functions.PQgetlineAsync
  export _root_.libpq.functions.PQgetssl
  export _root_.libpq.functions.PQgetvalue
  export _root_.libpq.functions.PQgssEncInUse
  export _root_.libpq.functions.PQhost
  export _root_.libpq.functions.PQhostaddr
  export _root_.libpq.functions.PQinitOpenSSL
  export _root_.libpq.functions.PQinitSSL
  export _root_.libpq.functions.PQisBusy
  export _root_.libpq.functions.PQisnonblocking
  export _root_.libpq.functions.PQisthreadsafe
  export _root_.libpq.functions.PQlibVersion
  export _root_.libpq.functions.PQmakeEmptyPGresult
  export _root_.libpq.functions.PQmblen
  export _root_.libpq.functions.PQmblenBounded
  export _root_.libpq.functions.PQnfields
  export _root_.libpq.functions.PQnotifies
  export _root_.libpq.functions.PQnparams
  export _root_.libpq.functions.PQntuples
  export _root_.libpq.functions.PQoidStatus
  export _root_.libpq.functions.PQoidValue
  export _root_.libpq.functions.PQoptions
  export _root_.libpq.functions.PQparameterStatus
  export _root_.libpq.functions.PQparamtype
  export _root_.libpq.functions.PQpass
  export _root_.libpq.functions.PQping
  export _root_.libpq.functions.PQpingParams
  export _root_.libpq.functions.PQpipelineStatus
  export _root_.libpq.functions.PQpipelineSync
  export _root_.libpq.functions.PQport
  export _root_.libpq.functions.PQprepare
  export _root_.libpq.functions.PQprint
  export _root_.libpq.functions.PQprintTuples
  export _root_.libpq.functions.PQprotocolVersion
  export _root_.libpq.functions.PQputCopyData
  export _root_.libpq.functions.PQputCopyEnd
  export _root_.libpq.functions.PQputline
  export _root_.libpq.functions.PQputnbytes
  export _root_.libpq.functions.PQregisterThreadLock
  export _root_.libpq.functions.PQrequestCancel
  export _root_.libpq.functions.PQresStatus
  export _root_.libpq.functions.PQreset
  export _root_.libpq.functions.PQresetPoll
  export _root_.libpq.functions.PQresetStart
  export _root_.libpq.functions.PQresultAlloc
  export _root_.libpq.functions.PQresultErrorField
  export _root_.libpq.functions.PQresultErrorMessage
  export _root_.libpq.functions.PQresultMemorySize
  export _root_.libpq.functions.PQresultStatus
  export _root_.libpq.functions.PQresultVerboseErrorMessage
  export _root_.libpq.functions.PQsendDescribePortal
  export _root_.libpq.functions.PQsendDescribePrepared
  export _root_.libpq.functions.PQsendFlushRequest
  export _root_.libpq.functions.PQsendPrepare
  export _root_.libpq.functions.PQsendQuery
  export _root_.libpq.functions.PQsendQueryParams
  export _root_.libpq.functions.PQsendQueryPrepared
  export _root_.libpq.functions.PQserverVersion
  export _root_.libpq.functions.PQsetClientEncoding
  export _root_.libpq.functions.PQsetErrorContextVisibility
  export _root_.libpq.functions.PQsetErrorVerbosity
  export _root_.libpq.functions.PQsetNoticeProcessor
  export _root_.libpq.functions.PQsetNoticeReceiver
  export _root_.libpq.functions.PQsetResultAttrs
  export _root_.libpq.functions.PQsetSSLKeyPassHook_OpenSSL
  export _root_.libpq.functions.PQsetSingleRowMode
  export _root_.libpq.functions.PQsetTraceFlags
  export _root_.libpq.functions.PQsetdbLogin
  export _root_.libpq.functions.PQsetnonblocking
  export _root_.libpq.functions.PQsetvalue
  export _root_.libpq.functions.PQsocket
  export _root_.libpq.functions.PQsslAttribute
  export _root_.libpq.functions.PQsslAttributeNames
  export _root_.libpq.functions.PQsslInUse
  export _root_.libpq.functions.PQsslStruct
  export _root_.libpq.functions.PQstatus
  export _root_.libpq.functions.PQtrace
  export _root_.libpq.functions.PQtransactionStatus
  export _root_.libpq.functions.PQtty
  export _root_.libpq.functions.PQunescapeBytea
  export _root_.libpq.functions.PQuntrace
  export _root_.libpq.functions.PQuser
  export _root_.libpq.functions.lo_close
  export _root_.libpq.functions.lo_creat
  export _root_.libpq.functions.lo_create
  export _root_.libpq.functions.lo_export
  export _root_.libpq.functions.lo_import
  export _root_.libpq.functions.lo_import_with_oid
  export _root_.libpq.functions.lo_lseek
  export _root_.libpq.functions.lo_lseek64
  export _root_.libpq.functions.lo_open
  export _root_.libpq.functions.lo_read
  export _root_.libpq.functions.lo_tell
  export _root_.libpq.functions.lo_tell64
  export _root_.libpq.functions.lo_truncate
  export _root_.libpq.functions.lo_truncate64
  export _root_.libpq.functions.lo_unlink
  export _root_.libpq.functions.lo_write
  export _root_.libpq.functions.pg_char_to_encoding
  export _root_.libpq.functions.pg_encoding_to_char
  export _root_.libpq.functions.pg_valid_server_encoding_id