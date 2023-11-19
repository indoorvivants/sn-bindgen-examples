package libmysql

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[libmysql] trait CEnum[T](using eq: T =:= Int):
    given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
    extension (inline t: T) 
      inline def int: CInt = eq.apply(t)
      inline def value: CInt = eq.apply(t)
  private[libmysql] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
     inline def int: CInt = eq.apply(t).toInt
     inline def uint: CUnsignedInt = eq.apply(t)
     inline def value: CUnsignedInt = eq.apply(t)


object enumerations:
  import predef.*
  /**
   * Type of the user defined function return slot and arguments
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type Item_result = CInt
  object Item_result extends CEnum[Item_result]:
    given _tag: Tag[Item_result] = Tag.Int
    inline def define(inline a: CInt): Item_result = a
    val INVALID_RESULT = define(-1)
    val STRING_RESULT = define(0)
    val REAL_RESULT = define(1)
    val INT_RESULT = define(2)
    val ROW_RESULT = define(3)
    val DECIMAL_RESULT = define(4)
    inline def getName(inline value: Item_result): Option[String] =
      inline value match
        case INVALID_RESULT => Some("INVALID_RESULT")
        case STRING_RESULT => Some("STRING_RESULT")
        case REAL_RESULT => Some("REAL_RESULT")
        case INT_RESULT => Some("INT_RESULT")
        case ROW_RESULT => Some("ROW_RESULT")
        case DECIMAL_RESULT => Some("DECIMAL_RESULT")
        case _ => None
    extension (a: Item_result)
      inline def &(b: Item_result): Item_result = a & b
      inline def |(b: Item_result): Item_result = a | b
      inline def is(b: Item_result): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type Item_udftype = CUnsignedInt
  object Item_udftype extends CEnumU[Item_udftype]:
    given _tag: Tag[Item_udftype] = Tag.UInt
    inline def define(inline a: Long): Item_udftype = a.toUInt
    val UDFTYPE_FUNCTION = define(1)
    val UDFTYPE_AGGREGATE = define(2)
    inline def getName(inline value: Item_udftype): Option[String] =
      inline value match
        case UDFTYPE_FUNCTION => Some("UDFTYPE_FUNCTION")
        case UDFTYPE_AGGREGATE => Some("UDFTYPE_AGGREGATE")
        case _ => None
    extension (a: Item_udftype)
      inline def &(b: Item_udftype): Item_udftype = a & b
      inline def |(b: Item_udftype): Item_udftype = a | b
      inline def is(b: Item_udftype): Boolean = (a & b) == b

  /**
   * The status flags are a bit-field
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  opaque type SERVER_STATUS_flags_enum = CUnsignedInt
  object SERVER_STATUS_flags_enum extends CEnumU[SERVER_STATUS_flags_enum]:
    given _tag: Tag[SERVER_STATUS_flags_enum] = Tag.UInt
    inline def define(inline a: Long): SERVER_STATUS_flags_enum = a.toUInt
    val SERVER_STATUS_IN_TRANS = define(1)
    val SERVER_STATUS_AUTOCOMMIT = define(2)
    val SERVER_MORE_RESULTS_EXISTS = define(8)
    val SERVER_QUERY_NO_GOOD_INDEX_USED = define(16)
    val SERVER_QUERY_NO_INDEX_USED = define(32)
    val SERVER_STATUS_CURSOR_EXISTS = define(64)
    val SERVER_STATUS_LAST_ROW_SENT = define(128)
    val SERVER_STATUS_DB_DROPPED = define(256)
    val SERVER_STATUS_NO_BACKSLASH_ESCAPES = define(512)
    val SERVER_STATUS_METADATA_CHANGED = define(1024)
    val SERVER_QUERY_WAS_SLOW = define(2048)
    val SERVER_PS_OUT_PARAMS = define(4096)
    val SERVER_STATUS_IN_TRANS_READONLY = define(8192)
    val SERVER_SESSION_STATE_CHANGED = define(16384)
    inline def getName(inline value: SERVER_STATUS_flags_enum): Option[String] =
      inline value match
        case SERVER_STATUS_IN_TRANS => Some("SERVER_STATUS_IN_TRANS")
        case SERVER_STATUS_AUTOCOMMIT => Some("SERVER_STATUS_AUTOCOMMIT")
        case SERVER_MORE_RESULTS_EXISTS => Some("SERVER_MORE_RESULTS_EXISTS")
        case SERVER_QUERY_NO_GOOD_INDEX_USED => Some("SERVER_QUERY_NO_GOOD_INDEX_USED")
        case SERVER_QUERY_NO_INDEX_USED => Some("SERVER_QUERY_NO_INDEX_USED")
        case SERVER_STATUS_CURSOR_EXISTS => Some("SERVER_STATUS_CURSOR_EXISTS")
        case SERVER_STATUS_LAST_ROW_SENT => Some("SERVER_STATUS_LAST_ROW_SENT")
        case SERVER_STATUS_DB_DROPPED => Some("SERVER_STATUS_DB_DROPPED")
        case SERVER_STATUS_NO_BACKSLASH_ESCAPES => Some("SERVER_STATUS_NO_BACKSLASH_ESCAPES")
        case SERVER_STATUS_METADATA_CHANGED => Some("SERVER_STATUS_METADATA_CHANGED")
        case SERVER_QUERY_WAS_SLOW => Some("SERVER_QUERY_WAS_SLOW")
        case SERVER_PS_OUT_PARAMS => Some("SERVER_PS_OUT_PARAMS")
        case SERVER_STATUS_IN_TRANS_READONLY => Some("SERVER_STATUS_IN_TRANS_READONLY")
        case SERVER_SESSION_STATE_CHANGED => Some("SERVER_SESSION_STATE_CHANGED")
        case _ => None
    extension (a: SERVER_STATUS_flags_enum)
      inline def &(b: SERVER_STATUS_flags_enum): SERVER_STATUS_flags_enum = a & b
      inline def |(b: SERVER_STATUS_flags_enum): SERVER_STATUS_flags_enum = a | b
      inline def is(b: SERVER_STATUS_flags_enum): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
  */
  opaque type enum_compression_algorithm = CUnsignedInt
  object enum_compression_algorithm extends CEnumU[enum_compression_algorithm]:
    given _tag: Tag[enum_compression_algorithm] = Tag.UInt
    inline def define(inline a: Long): enum_compression_algorithm = a.toUInt
    val MYSQL_UNCOMPRESSED = define(1)
    val MYSQL_ZLIB = define(2)
    val MYSQL_ZSTD = define(3)
    val MYSQL_INVALID = define(4)
    inline def getName(inline value: enum_compression_algorithm): Option[String] =
      inline value match
        case MYSQL_UNCOMPRESSED => Some("MYSQL_UNCOMPRESSED")
        case MYSQL_ZLIB => Some("MYSQL_ZLIB")
        case MYSQL_ZSTD => Some("MYSQL_ZSTD")
        case MYSQL_INVALID => Some("MYSQL_INVALID")
        case _ => None
    extension (a: enum_compression_algorithm)
      inline def &(b: enum_compression_algorithm): enum_compression_algorithm = a & b
      inline def |(b: enum_compression_algorithm): enum_compression_algorithm = a | b
      inline def is(b: enum_compression_algorithm): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  opaque type enum_cursor_type = CUnsignedInt
  object enum_cursor_type extends CEnumU[enum_cursor_type]:
    given _tag: Tag[enum_cursor_type] = Tag.UInt
    inline def define(inline a: Long): enum_cursor_type = a.toUInt
    val CURSOR_TYPE_NO_CURSOR = define(0)
    val CURSOR_TYPE_READ_ONLY = define(1)
    val CURSOR_TYPE_FOR_UPDATE = define(2)
    val CURSOR_TYPE_SCROLLABLE = define(4)
    val PARAMETER_COUNT_AVAILABLE = define(8)
    inline def getName(inline value: enum_cursor_type): Option[String] =
      inline value match
        case CURSOR_TYPE_NO_CURSOR => Some("CURSOR_TYPE_NO_CURSOR")
        case CURSOR_TYPE_READ_ONLY => Some("CURSOR_TYPE_READ_ONLY")
        case CURSOR_TYPE_FOR_UPDATE => Some("CURSOR_TYPE_FOR_UPDATE")
        case CURSOR_TYPE_SCROLLABLE => Some("CURSOR_TYPE_SCROLLABLE")
        case PARAMETER_COUNT_AVAILABLE => Some("PARAMETER_COUNT_AVAILABLE")
        case _ => None
    extension (a: enum_cursor_type)
      inline def &(b: enum_cursor_type): enum_cursor_type = a & b
      inline def |(b: enum_cursor_type): enum_cursor_type = a | b
      inline def is(b: enum_cursor_type): Boolean = (a & b) == b

  /**
   * Column types for MySQL
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/field_types.h
  */
  opaque type enum_field_types = CUnsignedInt
  object enum_field_types extends CEnumU[enum_field_types]:
    given _tag: Tag[enum_field_types] = Tag.UInt
    inline def define(inline a: Long): enum_field_types = a.toUInt
    val MYSQL_TYPE_DECIMAL = define(0)
    val MYSQL_TYPE_TINY = define(1)
    val MYSQL_TYPE_SHORT = define(2)
    val MYSQL_TYPE_LONG = define(3)
    val MYSQL_TYPE_FLOAT = define(4)
    val MYSQL_TYPE_DOUBLE = define(5)
    val MYSQL_TYPE_NULL = define(6)
    val MYSQL_TYPE_TIMESTAMP = define(7)
    val MYSQL_TYPE_LONGLONG = define(8)
    val MYSQL_TYPE_INT24 = define(9)
    val MYSQL_TYPE_DATE = define(10)
    val MYSQL_TYPE_TIME = define(11)
    val MYSQL_TYPE_DATETIME = define(12)
    val MYSQL_TYPE_YEAR = define(13)
    val MYSQL_TYPE_NEWDATE = define(14)
    val MYSQL_TYPE_VARCHAR = define(15)
    val MYSQL_TYPE_BIT = define(16)
    val MYSQL_TYPE_TIMESTAMP2 = define(17)
    val MYSQL_TYPE_DATETIME2 = define(18)
    val MYSQL_TYPE_TIME2 = define(19)
    val MYSQL_TYPE_TYPED_ARRAY = define(20)
    val MYSQL_TYPE_INVALID = define(243)
    val MYSQL_TYPE_BOOL = define(244)
    val MYSQL_TYPE_JSON = define(245)
    val MYSQL_TYPE_NEWDECIMAL = define(246)
    val MYSQL_TYPE_ENUM = define(247)
    val MYSQL_TYPE_SET = define(248)
    val MYSQL_TYPE_TINY_BLOB = define(249)
    val MYSQL_TYPE_MEDIUM_BLOB = define(250)
    val MYSQL_TYPE_LONG_BLOB = define(251)
    val MYSQL_TYPE_BLOB = define(252)
    val MYSQL_TYPE_VAR_STRING = define(253)
    val MYSQL_TYPE_STRING = define(254)
    val MYSQL_TYPE_GEOMETRY = define(255)
    inline def getName(inline value: enum_field_types): Option[String] =
      inline value match
        case MYSQL_TYPE_DECIMAL => Some("MYSQL_TYPE_DECIMAL")
        case MYSQL_TYPE_TINY => Some("MYSQL_TYPE_TINY")
        case MYSQL_TYPE_SHORT => Some("MYSQL_TYPE_SHORT")
        case MYSQL_TYPE_LONG => Some("MYSQL_TYPE_LONG")
        case MYSQL_TYPE_FLOAT => Some("MYSQL_TYPE_FLOAT")
        case MYSQL_TYPE_DOUBLE => Some("MYSQL_TYPE_DOUBLE")
        case MYSQL_TYPE_NULL => Some("MYSQL_TYPE_NULL")
        case MYSQL_TYPE_TIMESTAMP => Some("MYSQL_TYPE_TIMESTAMP")
        case MYSQL_TYPE_LONGLONG => Some("MYSQL_TYPE_LONGLONG")
        case MYSQL_TYPE_INT24 => Some("MYSQL_TYPE_INT24")
        case MYSQL_TYPE_DATE => Some("MYSQL_TYPE_DATE")
        case MYSQL_TYPE_TIME => Some("MYSQL_TYPE_TIME")
        case MYSQL_TYPE_DATETIME => Some("MYSQL_TYPE_DATETIME")
        case MYSQL_TYPE_YEAR => Some("MYSQL_TYPE_YEAR")
        case MYSQL_TYPE_NEWDATE => Some("MYSQL_TYPE_NEWDATE")
        case MYSQL_TYPE_VARCHAR => Some("MYSQL_TYPE_VARCHAR")
        case MYSQL_TYPE_BIT => Some("MYSQL_TYPE_BIT")
        case MYSQL_TYPE_TIMESTAMP2 => Some("MYSQL_TYPE_TIMESTAMP2")
        case MYSQL_TYPE_DATETIME2 => Some("MYSQL_TYPE_DATETIME2")
        case MYSQL_TYPE_TIME2 => Some("MYSQL_TYPE_TIME2")
        case MYSQL_TYPE_TYPED_ARRAY => Some("MYSQL_TYPE_TYPED_ARRAY")
        case MYSQL_TYPE_INVALID => Some("MYSQL_TYPE_INVALID")
        case MYSQL_TYPE_BOOL => Some("MYSQL_TYPE_BOOL")
        case MYSQL_TYPE_JSON => Some("MYSQL_TYPE_JSON")
        case MYSQL_TYPE_NEWDECIMAL => Some("MYSQL_TYPE_NEWDECIMAL")
        case MYSQL_TYPE_ENUM => Some("MYSQL_TYPE_ENUM")
        case MYSQL_TYPE_SET => Some("MYSQL_TYPE_SET")
        case MYSQL_TYPE_TINY_BLOB => Some("MYSQL_TYPE_TINY_BLOB")
        case MYSQL_TYPE_MEDIUM_BLOB => Some("MYSQL_TYPE_MEDIUM_BLOB")
        case MYSQL_TYPE_LONG_BLOB => Some("MYSQL_TYPE_LONG_BLOB")
        case MYSQL_TYPE_BLOB => Some("MYSQL_TYPE_BLOB")
        case MYSQL_TYPE_VAR_STRING => Some("MYSQL_TYPE_VAR_STRING")
        case MYSQL_TYPE_STRING => Some("MYSQL_TYPE_STRING")
        case MYSQL_TYPE_GEOMETRY => Some("MYSQL_TYPE_GEOMETRY")
        case _ => None
    extension (a: enum_field_types)
      inline def &(b: enum_field_types): enum_field_types = a & b
      inline def |(b: enum_field_types): enum_field_types = a | b
      inline def is(b: enum_field_types): Boolean = (a & b) == b

  /**
   * options for ::mysql_options()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  opaque type enum_mysql_set_option = CUnsignedInt
  object enum_mysql_set_option extends CEnumU[enum_mysql_set_option]:
    given _tag: Tag[enum_mysql_set_option] = Tag.UInt
    inline def define(inline a: Long): enum_mysql_set_option = a.toUInt
    val MYSQL_OPTION_MULTI_STATEMENTS_ON = define(0)
    val MYSQL_OPTION_MULTI_STATEMENTS_OFF = define(1)
    inline def getName(inline value: enum_mysql_set_option): Option[String] =
      inline value match
        case MYSQL_OPTION_MULTI_STATEMENTS_ON => Some("MYSQL_OPTION_MULTI_STATEMENTS_ON")
        case MYSQL_OPTION_MULTI_STATEMENTS_OFF => Some("MYSQL_OPTION_MULTI_STATEMENTS_OFF")
        case _ => None
    extension (a: enum_mysql_set_option)
      inline def &(b: enum_mysql_set_option): enum_mysql_set_option = a & b
      inline def |(b: enum_mysql_set_option): enum_mysql_set_option = a | b
      inline def is(b: enum_mysql_set_option): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type enum_mysql_stmt_state = CUnsignedInt
  object enum_mysql_stmt_state extends CEnumU[enum_mysql_stmt_state]:
    given _tag: Tag[enum_mysql_stmt_state] = Tag.UInt
    inline def define(inline a: Long): enum_mysql_stmt_state = a.toUInt
    val MYSQL_STMT_INIT_DONE = define(1)
    val MYSQL_STMT_PREPARE_DONE = define(2)
    val MYSQL_STMT_EXECUTE_DONE = define(3)
    val MYSQL_STMT_FETCH_DONE = define(4)
    inline def getName(inline value: enum_mysql_stmt_state): Option[String] =
      inline value match
        case MYSQL_STMT_INIT_DONE => Some("MYSQL_STMT_INIT_DONE")
        case MYSQL_STMT_PREPARE_DONE => Some("MYSQL_STMT_PREPARE_DONE")
        case MYSQL_STMT_EXECUTE_DONE => Some("MYSQL_STMT_EXECUTE_DONE")
        case MYSQL_STMT_FETCH_DONE => Some("MYSQL_STMT_FETCH_DONE")
        case _ => None
    extension (a: enum_mysql_stmt_state)
      inline def &(b: enum_mysql_stmt_state): enum_mysql_stmt_state = a & b
      inline def |(b: enum_mysql_stmt_state): enum_mysql_stmt_state = a | b
      inline def is(b: enum_mysql_stmt_state): Boolean = (a & b) == b

  /**
   * Time declarations shared between the server and client API: you should not add anything to this header unless it's used (and hence should be visible) in mysql.h. If you're looking for a place to add new time-related declaration, it's most likely my_time.h. See also "C API Handling of Date and Time Values" chapter in documentation.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_time.h
  */
  opaque type enum_mysql_timestamp_type = CInt
  object enum_mysql_timestamp_type extends CEnum[enum_mysql_timestamp_type]:
    given _tag: Tag[enum_mysql_timestamp_type] = Tag.Int
    inline def define(inline a: CInt): enum_mysql_timestamp_type = a
    val MYSQL_TIMESTAMP_NONE = define(-2)
    val MYSQL_TIMESTAMP_ERROR = define(-1)
    val MYSQL_TIMESTAMP_DATE = define(0)
    val MYSQL_TIMESTAMP_DATETIME = define(1)
    val MYSQL_TIMESTAMP_TIME = define(2)
    val MYSQL_TIMESTAMP_DATETIME_TZ = define(3)
    inline def getName(inline value: enum_mysql_timestamp_type): Option[String] =
      inline value match
        case MYSQL_TIMESTAMP_NONE => Some("MYSQL_TIMESTAMP_NONE")
        case MYSQL_TIMESTAMP_ERROR => Some("MYSQL_TIMESTAMP_ERROR")
        case MYSQL_TIMESTAMP_DATE => Some("MYSQL_TIMESTAMP_DATE")
        case MYSQL_TIMESTAMP_DATETIME => Some("MYSQL_TIMESTAMP_DATETIME")
        case MYSQL_TIMESTAMP_TIME => Some("MYSQL_TIMESTAMP_TIME")
        case MYSQL_TIMESTAMP_DATETIME_TZ => Some("MYSQL_TIMESTAMP_DATETIME_TZ")
        case _ => None
    extension (a: enum_mysql_timestamp_type)
      inline def &(b: enum_mysql_timestamp_type): enum_mysql_timestamp_type = a & b
      inline def |(b: enum_mysql_timestamp_type): enum_mysql_timestamp_type = a | b
      inline def is(b: enum_mysql_timestamp_type): Boolean = (a & b) == b

  /**
   * @}
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  opaque type enum_resultset_metadata = CUnsignedInt
  object enum_resultset_metadata extends CEnumU[enum_resultset_metadata]:
    given _tag: Tag[enum_resultset_metadata] = Tag.UInt
    inline def define(inline a: Long): enum_resultset_metadata = a.toUInt
    val RESULTSET_METADATA_NONE = define(0)
    val RESULTSET_METADATA_FULL = define(1)
    inline def getName(inline value: enum_resultset_metadata): Option[String] =
      inline value match
        case RESULTSET_METADATA_NONE => Some("RESULTSET_METADATA_NONE")
        case RESULTSET_METADATA_FULL => Some("RESULTSET_METADATA_FULL")
        case _ => None
    extension (a: enum_resultset_metadata)
      inline def &(b: enum_resultset_metadata): enum_resultset_metadata = a & b
      inline def |(b: enum_resultset_metadata): enum_resultset_metadata = a | b
      inline def is(b: enum_resultset_metadata): Boolean = (a & b) == b

  /**
   * A list of all MySQL protocol commands.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_command.h
  */
  opaque type enum_server_command = CUnsignedInt
  object enum_server_command extends CEnumU[enum_server_command]:
    given _tag: Tag[enum_server_command] = Tag.UInt
    inline def define(inline a: Long): enum_server_command = a.toUInt
    val COM_SLEEP = define(0)
    val COM_QUIT = define(1)
    val COM_INIT_DB = define(2)
    val COM_QUERY = define(3)
    val COM_FIELD_LIST = define(4)
    val COM_CREATE_DB = define(5)
    val COM_DROP_DB = define(6)
    val COM_REFRESH = define(7)
    val COM_DEPRECATED_1 = define(8)
    val COM_STATISTICS = define(9)
    val COM_PROCESS_INFO = define(10)
    val COM_CONNECT = define(11)
    val COM_PROCESS_KILL = define(12)
    val COM_DEBUG = define(13)
    val COM_PING = define(14)
    val COM_TIME = define(15)
    val COM_DELAYED_INSERT = define(16)
    val COM_CHANGE_USER = define(17)
    val COM_BINLOG_DUMP = define(18)
    val COM_TABLE_DUMP = define(19)
    val COM_CONNECT_OUT = define(20)
    val COM_REGISTER_SLAVE = define(21)
    val COM_STMT_PREPARE = define(22)
    val COM_STMT_EXECUTE = define(23)
    val COM_STMT_SEND_LONG_DATA = define(24)
    val COM_STMT_CLOSE = define(25)
    val COM_STMT_RESET = define(26)
    val COM_SET_OPTION = define(27)
    val COM_STMT_FETCH = define(28)
    val COM_DAEMON = define(29)
    val COM_BINLOG_DUMP_GTID = define(30)
    val COM_RESET_CONNECTION = define(31)
    val COM_CLONE = define(32)
    val COM_SUBSCRIBE_GROUP_REPLICATION_STREAM = define(33)
    val COM_END = define(34)
    inline def getName(inline value: enum_server_command): Option[String] =
      inline value match
        case COM_SLEEP => Some("COM_SLEEP")
        case COM_QUIT => Some("COM_QUIT")
        case COM_INIT_DB => Some("COM_INIT_DB")
        case COM_QUERY => Some("COM_QUERY")
        case COM_FIELD_LIST => Some("COM_FIELD_LIST")
        case COM_CREATE_DB => Some("COM_CREATE_DB")
        case COM_DROP_DB => Some("COM_DROP_DB")
        case COM_REFRESH => Some("COM_REFRESH")
        case COM_DEPRECATED_1 => Some("COM_DEPRECATED_1")
        case COM_STATISTICS => Some("COM_STATISTICS")
        case COM_PROCESS_INFO => Some("COM_PROCESS_INFO")
        case COM_CONNECT => Some("COM_CONNECT")
        case COM_PROCESS_KILL => Some("COM_PROCESS_KILL")
        case COM_DEBUG => Some("COM_DEBUG")
        case COM_PING => Some("COM_PING")
        case COM_TIME => Some("COM_TIME")
        case COM_DELAYED_INSERT => Some("COM_DELAYED_INSERT")
        case COM_CHANGE_USER => Some("COM_CHANGE_USER")
        case COM_BINLOG_DUMP => Some("COM_BINLOG_DUMP")
        case COM_TABLE_DUMP => Some("COM_TABLE_DUMP")
        case COM_CONNECT_OUT => Some("COM_CONNECT_OUT")
        case COM_REGISTER_SLAVE => Some("COM_REGISTER_SLAVE")
        case COM_STMT_PREPARE => Some("COM_STMT_PREPARE")
        case COM_STMT_EXECUTE => Some("COM_STMT_EXECUTE")
        case COM_STMT_SEND_LONG_DATA => Some("COM_STMT_SEND_LONG_DATA")
        case COM_STMT_CLOSE => Some("COM_STMT_CLOSE")
        case COM_STMT_RESET => Some("COM_STMT_RESET")
        case COM_SET_OPTION => Some("COM_SET_OPTION")
        case COM_STMT_FETCH => Some("COM_STMT_FETCH")
        case COM_DAEMON => Some("COM_DAEMON")
        case COM_BINLOG_DUMP_GTID => Some("COM_BINLOG_DUMP_GTID")
        case COM_RESET_CONNECTION => Some("COM_RESET_CONNECTION")
        case COM_CLONE => Some("COM_CLONE")
        case COM_SUBSCRIBE_GROUP_REPLICATION_STREAM => Some("COM_SUBSCRIBE_GROUP_REPLICATION_STREAM")
        case COM_END => Some("COM_END")
        case _ => None
    extension (a: enum_server_command)
      inline def &(b: enum_server_command): enum_server_command = a & b
      inline def |(b: enum_server_command): enum_server_command = a | b
      inline def is(b: enum_server_command): Boolean = (a & b) == b

  /**
   * Type of state change information that the server can include in the Ok packet.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  opaque type enum_session_state_type = CUnsignedInt
  object enum_session_state_type extends CEnumU[enum_session_state_type]:
    given _tag: Tag[enum_session_state_type] = Tag.UInt
    inline def define(inline a: Long): enum_session_state_type = a.toUInt
    val SESSION_TRACK_SYSTEM_VARIABLES = define(0)
    val SESSION_TRACK_SCHEMA = define(1)
    val SESSION_TRACK_STATE_CHANGE = define(2)
    val SESSION_TRACK_GTIDS = define(3)
    val SESSION_TRACK_TRANSACTION_CHARACTERISTICS = define(4)
    val SESSION_TRACK_TRANSACTION_STATE = define(5)
    inline def getName(inline value: enum_session_state_type): Option[String] =
      inline value match
        case SESSION_TRACK_SYSTEM_VARIABLES => Some("SESSION_TRACK_SYSTEM_VARIABLES")
        case SESSION_TRACK_SCHEMA => Some("SESSION_TRACK_SCHEMA")
        case SESSION_TRACK_STATE_CHANGE => Some("SESSION_TRACK_STATE_CHANGE")
        case SESSION_TRACK_GTIDS => Some("SESSION_TRACK_GTIDS")
        case SESSION_TRACK_TRANSACTION_CHARACTERISTICS => Some("SESSION_TRACK_TRANSACTION_CHARACTERISTICS")
        case SESSION_TRACK_TRANSACTION_STATE => Some("SESSION_TRACK_TRANSACTION_STATE")
        case _ => None
    extension (a: enum_session_state_type)
      inline def &(b: enum_session_state_type): enum_session_state_type = a & b
      inline def |(b: enum_session_state_type): enum_session_state_type = a | b
      inline def is(b: enum_session_state_type): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type enum_stmt_attr_type = CUnsignedInt
  object enum_stmt_attr_type extends CEnumU[enum_stmt_attr_type]:
    given _tag: Tag[enum_stmt_attr_type] = Tag.UInt
    inline def define(inline a: Long): enum_stmt_attr_type = a.toUInt
    val STMT_ATTR_UPDATE_MAX_LENGTH = define(0)
    val STMT_ATTR_CURSOR_TYPE = define(1)
    val STMT_ATTR_PREFETCH_ROWS = define(2)
    inline def getName(inline value: enum_stmt_attr_type): Option[String] =
      inline value match
        case STMT_ATTR_UPDATE_MAX_LENGTH => Some("STMT_ATTR_UPDATE_MAX_LENGTH")
        case STMT_ATTR_CURSOR_TYPE => Some("STMT_ATTR_CURSOR_TYPE")
        case STMT_ATTR_PREFETCH_ROWS => Some("STMT_ATTR_PREFETCH_ROWS")
        case _ => None
    extension (a: enum_stmt_attr_type)
      inline def &(b: enum_stmt_attr_type): enum_stmt_attr_type = a & b
      inline def |(b: enum_stmt_attr_type): enum_stmt_attr_type = a | b
      inline def is(b: enum_stmt_attr_type): Boolean = (a & b) == b

  /**
   * We want levels to be in growing order of hardness (because we use number comparisons).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  opaque type mysql_enum_shutdown_level = CUnsignedInt
  object mysql_enum_shutdown_level extends CEnumU[mysql_enum_shutdown_level]:
    given _tag: Tag[mysql_enum_shutdown_level] = Tag.UInt
    inline def define(inline a: Long): mysql_enum_shutdown_level = a.toUInt
    val SHUTDOWN_DEFAULT = define(0)
    val SHUTDOWN_WAIT_CONNECTIONS = define(1)
    val SHUTDOWN_WAIT_TRANSACTIONS = define(2)
    val SHUTDOWN_WAIT_UPDATES = define(8)
    val SHUTDOWN_WAIT_ALL_BUFFERS = define(16)
    val SHUTDOWN_WAIT_CRITICAL_BUFFERS = define(17)
    val KILL_QUERY = define(254)
    val KILL_CONNECTION = define(255)
    inline def getName(inline value: mysql_enum_shutdown_level): Option[String] =
      inline value match
        case SHUTDOWN_DEFAULT => Some("SHUTDOWN_DEFAULT")
        case SHUTDOWN_WAIT_CONNECTIONS => Some("SHUTDOWN_WAIT_CONNECTIONS")
        case SHUTDOWN_WAIT_TRANSACTIONS => Some("SHUTDOWN_WAIT_TRANSACTIONS")
        case SHUTDOWN_WAIT_UPDATES => Some("SHUTDOWN_WAIT_UPDATES")
        case SHUTDOWN_WAIT_ALL_BUFFERS => Some("SHUTDOWN_WAIT_ALL_BUFFERS")
        case SHUTDOWN_WAIT_CRITICAL_BUFFERS => Some("SHUTDOWN_WAIT_CRITICAL_BUFFERS")
        case KILL_QUERY => Some("KILL_QUERY")
        case KILL_CONNECTION => Some("KILL_CONNECTION")
        case _ => None
    extension (a: mysql_enum_shutdown_level)
      inline def &(b: mysql_enum_shutdown_level): mysql_enum_shutdown_level = a & b
      inline def |(b: mysql_enum_shutdown_level): mysql_enum_shutdown_level = a | b
      inline def is(b: mysql_enum_shutdown_level): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type mysql_option = CUnsignedInt
  object mysql_option extends CEnumU[mysql_option]:
    given _tag: Tag[mysql_option] = Tag.UInt
    inline def define(inline a: Long): mysql_option = a.toUInt
    val MYSQL_OPT_CONNECT_TIMEOUT = define(0)
    val MYSQL_OPT_COMPRESS = define(1)
    val MYSQL_OPT_NAMED_PIPE = define(2)
    val MYSQL_INIT_COMMAND = define(3)
    val MYSQL_READ_DEFAULT_FILE = define(4)
    val MYSQL_READ_DEFAULT_GROUP = define(5)
    val MYSQL_SET_CHARSET_DIR = define(6)
    val MYSQL_SET_CHARSET_NAME = define(7)
    val MYSQL_OPT_LOCAL_INFILE = define(8)
    val MYSQL_OPT_PROTOCOL = define(9)
    val MYSQL_SHARED_MEMORY_BASE_NAME = define(10)
    val MYSQL_OPT_READ_TIMEOUT = define(11)
    val MYSQL_OPT_WRITE_TIMEOUT = define(12)
    val MYSQL_OPT_USE_RESULT = define(13)
    val MYSQL_REPORT_DATA_TRUNCATION = define(14)
    val MYSQL_OPT_RECONNECT = define(15)
    val MYSQL_PLUGIN_DIR = define(16)
    val MYSQL_DEFAULT_AUTH = define(17)
    val MYSQL_OPT_BIND = define(18)
    val MYSQL_OPT_SSL_KEY = define(19)
    val MYSQL_OPT_SSL_CERT = define(20)
    val MYSQL_OPT_SSL_CA = define(21)
    val MYSQL_OPT_SSL_CAPATH = define(22)
    val MYSQL_OPT_SSL_CIPHER = define(23)
    val MYSQL_OPT_SSL_CRL = define(24)
    val MYSQL_OPT_SSL_CRLPATH = define(25)
    val MYSQL_OPT_CONNECT_ATTR_RESET = define(26)
    val MYSQL_OPT_CONNECT_ATTR_ADD = define(27)
    val MYSQL_OPT_CONNECT_ATTR_DELETE = define(28)
    val MYSQL_SERVER_PUBLIC_KEY = define(29)
    val MYSQL_ENABLE_CLEARTEXT_PLUGIN = define(30)
    val MYSQL_OPT_CAN_HANDLE_EXPIRED_PASSWORDS = define(31)
    val MYSQL_OPT_MAX_ALLOWED_PACKET = define(32)
    val MYSQL_OPT_NET_BUFFER_LENGTH = define(33)
    val MYSQL_OPT_TLS_VERSION = define(34)
    val MYSQL_OPT_SSL_MODE = define(35)
    val MYSQL_OPT_GET_SERVER_PUBLIC_KEY = define(36)
    val MYSQL_OPT_RETRY_COUNT = define(37)
    val MYSQL_OPT_OPTIONAL_RESULTSET_METADATA = define(38)
    val MYSQL_OPT_SSL_FIPS_MODE = define(39)
    val MYSQL_OPT_TLS_CIPHERSUITES = define(40)
    val MYSQL_OPT_COMPRESSION_ALGORITHMS = define(41)
    val MYSQL_OPT_ZSTD_COMPRESSION_LEVEL = define(42)
    val MYSQL_OPT_LOAD_DATA_LOCAL_DIR = define(43)
    val MYSQL_OPT_USER_PASSWORD = define(44)
    val MYSQL_OPT_SSL_SESSION_DATA = define(45)
    inline def getName(inline value: mysql_option): Option[String] =
      inline value match
        case MYSQL_OPT_CONNECT_TIMEOUT => Some("MYSQL_OPT_CONNECT_TIMEOUT")
        case MYSQL_OPT_COMPRESS => Some("MYSQL_OPT_COMPRESS")
        case MYSQL_OPT_NAMED_PIPE => Some("MYSQL_OPT_NAMED_PIPE")
        case MYSQL_INIT_COMMAND => Some("MYSQL_INIT_COMMAND")
        case MYSQL_READ_DEFAULT_FILE => Some("MYSQL_READ_DEFAULT_FILE")
        case MYSQL_READ_DEFAULT_GROUP => Some("MYSQL_READ_DEFAULT_GROUP")
        case MYSQL_SET_CHARSET_DIR => Some("MYSQL_SET_CHARSET_DIR")
        case MYSQL_SET_CHARSET_NAME => Some("MYSQL_SET_CHARSET_NAME")
        case MYSQL_OPT_LOCAL_INFILE => Some("MYSQL_OPT_LOCAL_INFILE")
        case MYSQL_OPT_PROTOCOL => Some("MYSQL_OPT_PROTOCOL")
        case MYSQL_SHARED_MEMORY_BASE_NAME => Some("MYSQL_SHARED_MEMORY_BASE_NAME")
        case MYSQL_OPT_READ_TIMEOUT => Some("MYSQL_OPT_READ_TIMEOUT")
        case MYSQL_OPT_WRITE_TIMEOUT => Some("MYSQL_OPT_WRITE_TIMEOUT")
        case MYSQL_OPT_USE_RESULT => Some("MYSQL_OPT_USE_RESULT")
        case MYSQL_REPORT_DATA_TRUNCATION => Some("MYSQL_REPORT_DATA_TRUNCATION")
        case MYSQL_OPT_RECONNECT => Some("MYSQL_OPT_RECONNECT")
        case MYSQL_PLUGIN_DIR => Some("MYSQL_PLUGIN_DIR")
        case MYSQL_DEFAULT_AUTH => Some("MYSQL_DEFAULT_AUTH")
        case MYSQL_OPT_BIND => Some("MYSQL_OPT_BIND")
        case MYSQL_OPT_SSL_KEY => Some("MYSQL_OPT_SSL_KEY")
        case MYSQL_OPT_SSL_CERT => Some("MYSQL_OPT_SSL_CERT")
        case MYSQL_OPT_SSL_CA => Some("MYSQL_OPT_SSL_CA")
        case MYSQL_OPT_SSL_CAPATH => Some("MYSQL_OPT_SSL_CAPATH")
        case MYSQL_OPT_SSL_CIPHER => Some("MYSQL_OPT_SSL_CIPHER")
        case MYSQL_OPT_SSL_CRL => Some("MYSQL_OPT_SSL_CRL")
        case MYSQL_OPT_SSL_CRLPATH => Some("MYSQL_OPT_SSL_CRLPATH")
        case MYSQL_OPT_CONNECT_ATTR_RESET => Some("MYSQL_OPT_CONNECT_ATTR_RESET")
        case MYSQL_OPT_CONNECT_ATTR_ADD => Some("MYSQL_OPT_CONNECT_ATTR_ADD")
        case MYSQL_OPT_CONNECT_ATTR_DELETE => Some("MYSQL_OPT_CONNECT_ATTR_DELETE")
        case MYSQL_SERVER_PUBLIC_KEY => Some("MYSQL_SERVER_PUBLIC_KEY")
        case MYSQL_ENABLE_CLEARTEXT_PLUGIN => Some("MYSQL_ENABLE_CLEARTEXT_PLUGIN")
        case MYSQL_OPT_CAN_HANDLE_EXPIRED_PASSWORDS => Some("MYSQL_OPT_CAN_HANDLE_EXPIRED_PASSWORDS")
        case MYSQL_OPT_MAX_ALLOWED_PACKET => Some("MYSQL_OPT_MAX_ALLOWED_PACKET")
        case MYSQL_OPT_NET_BUFFER_LENGTH => Some("MYSQL_OPT_NET_BUFFER_LENGTH")
        case MYSQL_OPT_TLS_VERSION => Some("MYSQL_OPT_TLS_VERSION")
        case MYSQL_OPT_SSL_MODE => Some("MYSQL_OPT_SSL_MODE")
        case MYSQL_OPT_GET_SERVER_PUBLIC_KEY => Some("MYSQL_OPT_GET_SERVER_PUBLIC_KEY")
        case MYSQL_OPT_RETRY_COUNT => Some("MYSQL_OPT_RETRY_COUNT")
        case MYSQL_OPT_OPTIONAL_RESULTSET_METADATA => Some("MYSQL_OPT_OPTIONAL_RESULTSET_METADATA")
        case MYSQL_OPT_SSL_FIPS_MODE => Some("MYSQL_OPT_SSL_FIPS_MODE")
        case MYSQL_OPT_TLS_CIPHERSUITES => Some("MYSQL_OPT_TLS_CIPHERSUITES")
        case MYSQL_OPT_COMPRESSION_ALGORITHMS => Some("MYSQL_OPT_COMPRESSION_ALGORITHMS")
        case MYSQL_OPT_ZSTD_COMPRESSION_LEVEL => Some("MYSQL_OPT_ZSTD_COMPRESSION_LEVEL")
        case MYSQL_OPT_LOAD_DATA_LOCAL_DIR => Some("MYSQL_OPT_LOAD_DATA_LOCAL_DIR")
        case MYSQL_OPT_USER_PASSWORD => Some("MYSQL_OPT_USER_PASSWORD")
        case MYSQL_OPT_SSL_SESSION_DATA => Some("MYSQL_OPT_SSL_SESSION_DATA")
        case _ => None
    extension (a: mysql_option)
      inline def &(b: mysql_option): mysql_option = a & b
      inline def |(b: mysql_option): mysql_option = a | b
      inline def is(b: mysql_option): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type mysql_protocol_type = CUnsignedInt
  object mysql_protocol_type extends CEnumU[mysql_protocol_type]:
    given _tag: Tag[mysql_protocol_type] = Tag.UInt
    inline def define(inline a: Long): mysql_protocol_type = a.toUInt
    val MYSQL_PROTOCOL_DEFAULT = define(0)
    val MYSQL_PROTOCOL_TCP = define(1)
    val MYSQL_PROTOCOL_SOCKET = define(2)
    val MYSQL_PROTOCOL_PIPE = define(3)
    val MYSQL_PROTOCOL_MEMORY = define(4)
    inline def getName(inline value: mysql_protocol_type): Option[String] =
      inline value match
        case MYSQL_PROTOCOL_DEFAULT => Some("MYSQL_PROTOCOL_DEFAULT")
        case MYSQL_PROTOCOL_TCP => Some("MYSQL_PROTOCOL_TCP")
        case MYSQL_PROTOCOL_SOCKET => Some("MYSQL_PROTOCOL_SOCKET")
        case MYSQL_PROTOCOL_PIPE => Some("MYSQL_PROTOCOL_PIPE")
        case MYSQL_PROTOCOL_MEMORY => Some("MYSQL_PROTOCOL_MEMORY")
        case _ => None
    extension (a: mysql_protocol_type)
      inline def &(b: mysql_protocol_type): mysql_protocol_type = a & b
      inline def |(b: mysql_protocol_type): mysql_protocol_type = a | b
      inline def is(b: mysql_protocol_type): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type mysql_ssl_fips_mode = CUnsignedInt
  object mysql_ssl_fips_mode extends CEnumU[mysql_ssl_fips_mode]:
    given _tag: Tag[mysql_ssl_fips_mode] = Tag.UInt
    inline def define(inline a: Long): mysql_ssl_fips_mode = a.toUInt
    val SSL_FIPS_MODE_OFF = define(0)
    val SSL_FIPS_MODE_ON = define(1)
    val SSL_FIPS_MODE_STRICT = define(2)
    inline def getName(inline value: mysql_ssl_fips_mode): Option[String] =
      inline value match
        case SSL_FIPS_MODE_OFF => Some("SSL_FIPS_MODE_OFF")
        case SSL_FIPS_MODE_ON => Some("SSL_FIPS_MODE_ON")
        case SSL_FIPS_MODE_STRICT => Some("SSL_FIPS_MODE_STRICT")
        case _ => None
    extension (a: mysql_ssl_fips_mode)
      inline def &(b: mysql_ssl_fips_mode): mysql_ssl_fips_mode = a & b
      inline def |(b: mysql_ssl_fips_mode): mysql_ssl_fips_mode = a | b
      inline def is(b: mysql_ssl_fips_mode): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type mysql_ssl_mode = CUnsignedInt
  object mysql_ssl_mode extends CEnumU[mysql_ssl_mode]:
    given _tag: Tag[mysql_ssl_mode] = Tag.UInt
    inline def define(inline a: Long): mysql_ssl_mode = a.toUInt
    val SSL_MODE_DISABLED = define(1)
    val SSL_MODE_PREFERRED = define(2)
    val SSL_MODE_REQUIRED = define(3)
    val SSL_MODE_VERIFY_CA = define(4)
    val SSL_MODE_VERIFY_IDENTITY = define(5)
    inline def getName(inline value: mysql_ssl_mode): Option[String] =
      inline value match
        case SSL_MODE_DISABLED => Some("SSL_MODE_DISABLED")
        case SSL_MODE_PREFERRED => Some("SSL_MODE_PREFERRED")
        case SSL_MODE_REQUIRED => Some("SSL_MODE_REQUIRED")
        case SSL_MODE_VERIFY_CA => Some("SSL_MODE_VERIFY_CA")
        case SSL_MODE_VERIFY_IDENTITY => Some("SSL_MODE_VERIFY_IDENTITY")
        case _ => None
    extension (a: mysql_ssl_mode)
      inline def &(b: mysql_ssl_mode): mysql_ssl_mode = a & b
      inline def |(b: mysql_ssl_mode): mysql_ssl_mode = a | b
      inline def is(b: mysql_ssl_mode): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type mysql_status = CUnsignedInt
  object mysql_status extends CEnumU[mysql_status]:
    given _tag: Tag[mysql_status] = Tag.UInt
    inline def define(inline a: Long): mysql_status = a.toUInt
    val MYSQL_STATUS_READY = define(0)
    val MYSQL_STATUS_GET_RESULT = define(1)
    val MYSQL_STATUS_USE_RESULT = define(2)
    val MYSQL_STATUS_STATEMENT_GET_RESULT = define(3)
    inline def getName(inline value: mysql_status): Option[String] =
      inline value match
        case MYSQL_STATUS_READY => Some("MYSQL_STATUS_READY")
        case MYSQL_STATUS_GET_RESULT => Some("MYSQL_STATUS_GET_RESULT")
        case MYSQL_STATUS_USE_RESULT => Some("MYSQL_STATUS_USE_RESULT")
        case MYSQL_STATUS_STATEMENT_GET_RESULT => Some("MYSQL_STATUS_STATEMENT_GET_RESULT")
        case _ => None
    extension (a: mysql_status)
      inline def &(b: mysql_status): mysql_status = a & b
      inline def |(b: mysql_status): mysql_status = a | b
      inline def is(b: mysql_status): Boolean = (a & b) == b

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/plugin_auth_common.h
  */
  opaque type net_async_status = CUnsignedInt
  object net_async_status extends CEnumU[net_async_status]:
    given _tag: Tag[net_async_status] = Tag.UInt
    inline def define(inline a: Long): net_async_status = a.toUInt
    val NET_ASYNC_COMPLETE = define(0)
    val NET_ASYNC_NOT_READY = define(1)
    val NET_ASYNC_ERROR = define(2)
    val NET_ASYNC_COMPLETE_NO_MORE_RESULTS = define(3)
    inline def getName(inline value: net_async_status): Option[String] =
      inline value match
        case NET_ASYNC_COMPLETE => Some("NET_ASYNC_COMPLETE")
        case NET_ASYNC_NOT_READY => Some("NET_ASYNC_NOT_READY")
        case NET_ASYNC_ERROR => Some("NET_ASYNC_ERROR")
        case NET_ASYNC_COMPLETE_NO_MORE_RESULTS => Some("NET_ASYNC_COMPLETE_NO_MORE_RESULTS")
        case _ => None
    extension (a: net_async_status)
      inline def &(b: net_async_status): net_async_status = a & b
      inline def |(b: net_async_status): net_async_status = a | b
      inline def is(b: net_async_status): Boolean = (a & b) == b

object aliases:
  import _root_.libmysql.enumerations.*
  import _root_.libmysql.predef.*
  import _root_.libmysql.aliases.*
  import _root_.libmysql.structs.*
  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_FIELD_OFFSET = CUnsignedInt
  object MYSQL_FIELD_OFFSET: 
    given _tag: Tag[MYSQL_FIELD_OFFSET] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): MYSQL_FIELD_OFFSET = o
    extension (v: MYSQL_FIELD_OFFSET)
      inline def value: CUnsignedInt = v

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_ROW = Ptr[CString]
  object MYSQL_ROW: 
    given _tag: Tag[MYSQL_ROW] = Tag.Ptr[CString](Tag.Ptr[CChar](Tag.Byte))
    inline def apply(inline o: Ptr[CString]): MYSQL_ROW = o
    extension (v: MYSQL_ROW)
      inline def value: Ptr[CString] = v

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_ROW_OFFSET = Ptr[MYSQL_ROWS]
  object MYSQL_ROW_OFFSET: 
    given _tag: Tag[MYSQL_ROW_OFFSET] = Tag.Ptr[MYSQL_ROWS](MYSQL_ROWS._tag)
    inline def apply(inline o: Ptr[MYSQL_ROWS]): MYSQL_ROW_OFFSET = o
    extension (v: MYSQL_ROW_OFFSET)
      inline def value: Ptr[MYSQL_ROWS] = v

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type Udf_func_add = CFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Unit]
  object Udf_func_add: 
    given _tag: Tag[Udf_func_add] = Tag.materializeCFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): Udf_func_add = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Unit]): Udf_func_add = o
    extension (v: Udf_func_add)
      inline def value: CFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type Udf_func_any = CFuncPtr0[Unit]
  object Udf_func_any: 
    given _tag: Tag[Udf_func_any] = Tag.materializeCFuncPtr0[Unit]
    inline def fromPtr(ptr: Ptr[Byte]): Udf_func_any = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr0[Unit]): Udf_func_any = o
    extension (v: Udf_func_any)
      inline def value: CFuncPtr0[Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type Udf_func_clear = CFuncPtr3[Ptr[UDF_INIT], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Unit]
  object Udf_func_clear: 
    given _tag: Tag[Udf_func_clear] = Tag.materializeCFuncPtr3[Ptr[UDF_INIT], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): Udf_func_clear = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[Ptr[UDF_INIT], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Unit]): Udf_func_clear = o
    extension (v: Udf_func_clear)
      inline def value: CFuncPtr3[Ptr[UDF_INIT], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type Udf_func_deinit = CFuncPtr1[Ptr[UDF_INIT], Unit]
  object Udf_func_deinit: 
    given _tag: Tag[Udf_func_deinit] = Tag.materializeCFuncPtr1[Ptr[UDF_INIT], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): Udf_func_deinit = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[UDF_INIT], Unit]): Udf_func_deinit = o
    extension (v: Udf_func_deinit)
      inline def value: CFuncPtr1[Ptr[UDF_INIT], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type Udf_func_double = CFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Double]
  object Udf_func_double: 
    given _tag: Tag[Udf_func_double] = Tag.materializeCFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Double]
    inline def fromPtr(ptr: Ptr[Byte]): Udf_func_double = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Double]): Udf_func_double = o
    extension (v: Udf_func_double)
      inline def value: CFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], Double] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type Udf_func_init = CFuncPtr3[Ptr[UDF_INIT], Ptr[UDF_ARGS], CString, Boolean]
  object Udf_func_init: 
    given _tag: Tag[Udf_func_init] = Tag.materializeCFuncPtr3[Ptr[UDF_INIT], Ptr[UDF_ARGS], CString, Boolean]
    inline def fromPtr(ptr: Ptr[Byte]): Udf_func_init = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[Ptr[UDF_INIT], Ptr[UDF_ARGS], CString, Boolean]): Udf_func_init = o
    extension (v: Udf_func_init)
      inline def value: CFuncPtr3[Ptr[UDF_INIT], Ptr[UDF_ARGS], CString, Boolean] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type Udf_func_longlong = CFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], CLongLong]
  object Udf_func_longlong: 
    given _tag: Tag[Udf_func_longlong] = Tag.materializeCFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], CLongLong]
    inline def fromPtr(ptr: Ptr[Byte]): Udf_func_longlong = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], CLongLong]): Udf_func_longlong = o
    extension (v: Udf_func_longlong)
      inline def value: CFuncPtr4[Ptr[UDF_INIT], Ptr[UDF_ARGS], Ptr[CUnsignedChar], Ptr[CUnsignedChar], CLongLong] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type Udf_func_string = CFuncPtr6[Ptr[UDF_INIT], Ptr[UDF_ARGS], CString, Ptr[CUnsignedLongInt], Ptr[CUnsignedChar], Ptr[CUnsignedChar], CString]
  object Udf_func_string: 
    given _tag: Tag[Udf_func_string] = Tag.materializeCFuncPtr6[Ptr[UDF_INIT], Ptr[UDF_ARGS], CString, Ptr[CUnsignedLongInt], Ptr[CUnsignedChar], Ptr[CUnsignedChar], CString]
    inline def fromPtr(ptr: Ptr[Byte]): Udf_func_string = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr6[Ptr[UDF_INIT], Ptr[UDF_ARGS], CString, Ptr[CUnsignedLongInt], Ptr[CUnsignedChar], Ptr[CUnsignedChar], CString]): Udf_func_string = o
    extension (v: Udf_func_string)
      inline def value: CFuncPtr6[Ptr[UDF_INIT], Ptr[UDF_ARGS], CString, Ptr[CUnsignedLongInt], Ptr[CUnsignedChar], Ptr[CUnsignedChar], CString] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_list.h
  */
  opaque type list_walk_action = CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
  object list_walk_action: 
    given _tag: Tag[list_walk_action] = Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): list_walk_action = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]): list_walk_action = o
    extension (v: list_walk_action)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type my_socket = CInt
  object my_socket: 
    given _tag: Tag[my_socket] = Tag.Int
    inline def apply(inline o: CInt): my_socket = o
    extension (v: my_socket)
      inline def value: CInt = v

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  type my_ulonglong = uint64_t
  object my_ulonglong: 
    given _tag: Tag[my_ulonglong] = uint64_t._tag
    inline def apply(inline o: uint64_t): my_ulonglong = o
    extension (v: my_ulonglong)
      inline def value: uint64_t = v

  type size_t = libc.stddef.size_t
  object size_t: 
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t)
      inline def value: libc.stddef.size_t = v

  type uint64_t = scala.scalanative.unsigned.ULong
  object uint64_t: 
    val _tag: Tag[uint64_t] = summon[Tag[scala.scalanative.unsigned.ULong]]
    inline def apply(inline o: scala.scalanative.unsigned.ULong): uint64_t = o
    extension (v: uint64_t)
      inline def value: scala.scalanative.unsigned.ULong = v

  type va_list = unsafe.CVarArgList
  object va_list: 
    val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
    inline def apply(inline o: unsafe.CVarArgList): va_list = o
    extension (v: va_list)
      inline def value: unsafe.CVarArgList = v

object structs:
  import _root_.libmysql.enumerations.*
  import _root_.libmysql.predef.*
  import _root_.libmysql.aliases.*
  import _root_.libmysql.structs.*
  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type CHARSET_INFO = CStruct0
  object CHARSET_INFO:
    given _tag: Tag[CHARSET_INFO] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type Init_commands_array = CStruct0
  object Init_commands_array:
    given _tag: Tag[Init_commands_array] = Tag.materializeCStruct0Tag

  /**
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_list.h
  */
  opaque type LIST = CStruct3[Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  object LIST:
    given _tag: Tag[LIST] = Tag.materializeCStruct3Tag[Ptr[Byte], Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[LIST] = scala.scalanative.unsafe.alloc[LIST](1)
    def apply(prev : Ptr[LIST], next : Ptr[LIST], data : Ptr[Byte])(using Zone): Ptr[LIST] = 
      val ____ptr = apply()
      (!____ptr).prev = prev
      (!____ptr).next = next
      (!____ptr).data = data
      ____ptr
    extension (struct: LIST)
      def prev : Ptr[LIST] = struct._1.asInstanceOf[Ptr[LIST]]
      def prev_=(value: Ptr[LIST]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def next : Ptr[LIST] = struct._2.asInstanceOf[Ptr[LIST]]
      def next_=(value: Ptr[LIST]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
      def data : Ptr[Byte] = struct._3
      def data_=(value: Ptr[Byte]): Unit = !struct.at3 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MEM_ROOT = CStruct0
  object MEM_ROOT:
    given _tag: Tag[MEM_ROOT] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL = CArray[CChar, Nat.Digit4[Nat._1, Nat._1, Nat._4, Nat._4]]
  object MYSQL:
    /**
     * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
    */
    opaque type Struct0 = CStruct0
    object Struct0:
      given _tag: Tag[Struct0] = Tag.materializeCStruct0Tag
    given _tag: Tag[MYSQL] = Tag.CArray[CChar, Nat.Digit4[Nat._1, Nat._1, Nat._4, Nat._4]](Tag.Byte, Tag.Digit4[Nat._1, Nat._1, Nat._4, Nat._4](Tag.Nat1, Tag.Nat1, Tag.Nat4, Tag.Nat4))
    def apply()(using Zone): Ptr[MYSQL] = scala.scalanative.unsafe.alloc[MYSQL](1)
    def apply(net : NET, connector_fd : Ptr[CUnsignedChar], host : CString, user : CString, passwd : CString, unix_socket : CString, server_version : CString, host_info : CString, info : CString, db : CString, charset : Ptr[CHARSET_INFO], fields : Ptr[MYSQL_FIELD], field_alloc : Ptr[MEM_ROOT], affected_rows : uint64_t, insert_id : uint64_t, extra_info : uint64_t, thread_id : CUnsignedLongInt, packet_length : CUnsignedLongInt, port : CUnsignedInt, client_flag : CUnsignedLongInt, server_capabilities : CUnsignedLongInt, protocol_version : CUnsignedInt, field_count : CUnsignedInt, server_status : CUnsignedInt, server_language : CUnsignedInt, warning_count : CUnsignedInt, options : st_mysql_options, status : mysql_status, resultset_metadata : enum_resultset_metadata, free_me : Boolean, reconnect : Boolean, scramble : CArray[MYSQL.Struct0, Nat.Digit2[Nat._2, Nat._1]], stmts : Ptr[LIST], methods : Ptr[MYSQL_METHODS], thd : Ptr[Byte], unbuffered_fetch_owner : Ptr[Boolean], extension : Ptr[Byte])(using Zone): Ptr[MYSQL] = 
      val ____ptr = apply()
      (!____ptr).net = net
      (!____ptr).connector_fd = connector_fd
      (!____ptr).host = host
      (!____ptr).user = user
      (!____ptr).passwd = passwd
      (!____ptr).unix_socket = unix_socket
      (!____ptr).server_version = server_version
      (!____ptr).host_info = host_info
      (!____ptr).info = info
      (!____ptr).db = db
      (!____ptr).charset = charset
      (!____ptr).fields = fields
      (!____ptr).field_alloc = field_alloc
      (!____ptr).affected_rows = affected_rows
      (!____ptr).insert_id = insert_id
      (!____ptr).extra_info = extra_info
      (!____ptr).thread_id = thread_id
      (!____ptr).packet_length = packet_length
      (!____ptr).port = port
      (!____ptr).client_flag = client_flag
      (!____ptr).server_capabilities = server_capabilities
      (!____ptr).protocol_version = protocol_version
      (!____ptr).field_count = field_count
      (!____ptr).server_status = server_status
      (!____ptr).server_language = server_language
      (!____ptr).warning_count = warning_count
      (!____ptr).options = options
      (!____ptr).status = status
      (!____ptr).resultset_metadata = resultset_metadata
      (!____ptr).free_me = free_me
      (!____ptr).reconnect = reconnect
      (!____ptr).scramble = scramble
      (!____ptr).stmts = stmts
      (!____ptr).methods = methods
      (!____ptr).thd = thd
      (!____ptr).unbuffered_fetch_owner = unbuffered_fetch_owner
      (!____ptr).extension = extension
      ____ptr
    extension (struct: MYSQL)
      def net: NET = !struct.at(0).asInstanceOf[Ptr[NET]]
      def net_=(value: NET): Unit = !struct.at(0).asInstanceOf[Ptr[NET]] = value
      def connector_fd: Ptr[CUnsignedChar] = !struct.at(664).asInstanceOf[Ptr[Ptr[CUnsignedChar]]]
      def connector_fd_=(value: Ptr[CUnsignedChar]): Unit = !struct.at(664).asInstanceOf[Ptr[Ptr[CUnsignedChar]]] = value
      def host: CString = !struct.at(672).asInstanceOf[Ptr[CString]]
      def host_=(value: CString): Unit = !struct.at(672).asInstanceOf[Ptr[CString]] = value
      def user: CString = !struct.at(680).asInstanceOf[Ptr[CString]]
      def user_=(value: CString): Unit = !struct.at(680).asInstanceOf[Ptr[CString]] = value
      def passwd: CString = !struct.at(688).asInstanceOf[Ptr[CString]]
      def passwd_=(value: CString): Unit = !struct.at(688).asInstanceOf[Ptr[CString]] = value
      def unix_socket: CString = !struct.at(696).asInstanceOf[Ptr[CString]]
      def unix_socket_=(value: CString): Unit = !struct.at(696).asInstanceOf[Ptr[CString]] = value
      def server_version: CString = !struct.at(704).asInstanceOf[Ptr[CString]]
      def server_version_=(value: CString): Unit = !struct.at(704).asInstanceOf[Ptr[CString]] = value
      def host_info: CString = !struct.at(712).asInstanceOf[Ptr[CString]]
      def host_info_=(value: CString): Unit = !struct.at(712).asInstanceOf[Ptr[CString]] = value
      def info: CString = !struct.at(720).asInstanceOf[Ptr[CString]]
      def info_=(value: CString): Unit = !struct.at(720).asInstanceOf[Ptr[CString]] = value
      def db: CString = !struct.at(728).asInstanceOf[Ptr[CString]]
      def db_=(value: CString): Unit = !struct.at(728).asInstanceOf[Ptr[CString]] = value
      def charset: Ptr[CHARSET_INFO] = !struct.at(736).asInstanceOf[Ptr[Ptr[CHARSET_INFO]]]
      def charset_=(value: Ptr[CHARSET_INFO]): Unit = !struct.at(736).asInstanceOf[Ptr[Ptr[CHARSET_INFO]]] = value
      def fields: Ptr[MYSQL_FIELD] = !struct.at(744).asInstanceOf[Ptr[Ptr[MYSQL_FIELD]]]
      def fields_=(value: Ptr[MYSQL_FIELD]): Unit = !struct.at(744).asInstanceOf[Ptr[Ptr[MYSQL_FIELD]]] = value
      def field_alloc: Ptr[MEM_ROOT] = !struct.at(752).asInstanceOf[Ptr[Ptr[MEM_ROOT]]]
      def field_alloc_=(value: Ptr[MEM_ROOT]): Unit = !struct.at(752).asInstanceOf[Ptr[Ptr[MEM_ROOT]]] = value
      def affected_rows: uint64_t = !struct.at(760).asInstanceOf[Ptr[uint64_t]]
      def affected_rows_=(value: uint64_t): Unit = !struct.at(760).asInstanceOf[Ptr[uint64_t]] = value
      def insert_id: uint64_t = !struct.at(768).asInstanceOf[Ptr[uint64_t]]
      def insert_id_=(value: uint64_t): Unit = !struct.at(768).asInstanceOf[Ptr[uint64_t]] = value
      def extra_info: uint64_t = !struct.at(776).asInstanceOf[Ptr[uint64_t]]
      def extra_info_=(value: uint64_t): Unit = !struct.at(776).asInstanceOf[Ptr[uint64_t]] = value
      def thread_id: CUnsignedLongInt = !struct.at(784).asInstanceOf[Ptr[CUnsignedLongInt]]
      def thread_id_=(value: CUnsignedLongInt): Unit = !struct.at(784).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def packet_length: CUnsignedLongInt = !struct.at(792).asInstanceOf[Ptr[CUnsignedLongInt]]
      def packet_length_=(value: CUnsignedLongInt): Unit = !struct.at(792).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def port: CUnsignedInt = !struct.at(800).asInstanceOf[Ptr[CUnsignedInt]]
      def port_=(value: CUnsignedInt): Unit = !struct.at(800).asInstanceOf[Ptr[CUnsignedInt]] = value
      def client_flag: CUnsignedLongInt = !struct.at(808).asInstanceOf[Ptr[CUnsignedLongInt]]
      def client_flag_=(value: CUnsignedLongInt): Unit = !struct.at(808).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def server_capabilities: CUnsignedLongInt = !struct.at(816).asInstanceOf[Ptr[CUnsignedLongInt]]
      def server_capabilities_=(value: CUnsignedLongInt): Unit = !struct.at(816).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def protocol_version: CUnsignedInt = !struct.at(824).asInstanceOf[Ptr[CUnsignedInt]]
      def protocol_version_=(value: CUnsignedInt): Unit = !struct.at(824).asInstanceOf[Ptr[CUnsignedInt]] = value
      def field_count: CUnsignedInt = !struct.at(828).asInstanceOf[Ptr[CUnsignedInt]]
      def field_count_=(value: CUnsignedInt): Unit = !struct.at(828).asInstanceOf[Ptr[CUnsignedInt]] = value
      def server_status: CUnsignedInt = !struct.at(832).asInstanceOf[Ptr[CUnsignedInt]]
      def server_status_=(value: CUnsignedInt): Unit = !struct.at(832).asInstanceOf[Ptr[CUnsignedInt]] = value
      def server_language: CUnsignedInt = !struct.at(836).asInstanceOf[Ptr[CUnsignedInt]]
      def server_language_=(value: CUnsignedInt): Unit = !struct.at(836).asInstanceOf[Ptr[CUnsignedInt]] = value
      def warning_count: CUnsignedInt = !struct.at(840).asInstanceOf[Ptr[CUnsignedInt]]
      def warning_count_=(value: CUnsignedInt): Unit = !struct.at(840).asInstanceOf[Ptr[CUnsignedInt]] = value
      def options: st_mysql_options = !struct.at(848).asInstanceOf[Ptr[st_mysql_options]]
      def options_=(value: st_mysql_options): Unit = !struct.at(848).asInstanceOf[Ptr[st_mysql_options]] = value
      def status: mysql_status = !struct.at(1088).asInstanceOf[Ptr[mysql_status]]
      def status_=(value: mysql_status): Unit = !struct.at(1088).asInstanceOf[Ptr[mysql_status]] = value
      def resultset_metadata: enum_resultset_metadata = !struct.at(1092).asInstanceOf[Ptr[enum_resultset_metadata]]
      def resultset_metadata_=(value: enum_resultset_metadata): Unit = !struct.at(1092).asInstanceOf[Ptr[enum_resultset_metadata]] = value
      def free_me: Boolean = !struct.at(1096).asInstanceOf[Ptr[Boolean]]
      def free_me_=(value: Boolean): Unit = !struct.at(1096).asInstanceOf[Ptr[Boolean]] = value
      def reconnect: Boolean = !struct.at(1097).asInstanceOf[Ptr[Boolean]]
      def reconnect_=(value: Boolean): Unit = !struct.at(1097).asInstanceOf[Ptr[Boolean]] = value
      def scramble: CArray[MYSQL.Struct0, Nat.Digit2[Nat._2, Nat._1]] = !struct.at(1098).asInstanceOf[Ptr[CArray[MYSQL.Struct0, Nat.Digit2[Nat._2, Nat._1]]]]
      def scramble_=(value: CArray[MYSQL.Struct0, Nat.Digit2[Nat._2, Nat._1]]): Unit = !struct.at(1098).asInstanceOf[Ptr[CArray[MYSQL.Struct0, Nat.Digit2[Nat._2, Nat._1]]]] = value
      def stmts: Ptr[LIST] = !struct.at(1104).asInstanceOf[Ptr[Ptr[LIST]]]
      def stmts_=(value: Ptr[LIST]): Unit = !struct.at(1104).asInstanceOf[Ptr[Ptr[LIST]]] = value
      def methods: Ptr[MYSQL_METHODS] = !struct.at(1112).asInstanceOf[Ptr[Ptr[MYSQL_METHODS]]]
      def methods_=(value: Ptr[MYSQL_METHODS]): Unit = !struct.at(1112).asInstanceOf[Ptr[Ptr[MYSQL_METHODS]]] = value
      def thd: Ptr[Byte] = !struct.at(1120).asInstanceOf[Ptr[Ptr[Byte]]]
      def thd_=(value: Ptr[Byte]): Unit = !struct.at(1120).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def unbuffered_fetch_owner: Ptr[Boolean] = !struct.at(1128).asInstanceOf[Ptr[Ptr[Boolean]]]
      def unbuffered_fetch_owner_=(value: Ptr[Boolean]): Unit = !struct.at(1128).asInstanceOf[Ptr[Ptr[Boolean]]] = value
      def extension: Ptr[Byte] = !struct.at(1136).asInstanceOf[Ptr[Ptr[Byte]]]
      def extension_=(value: Ptr[Byte]): Unit = !struct.at(1136).asInstanceOf[Ptr[Ptr[Byte]]] = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_BIND = CStruct19[Ptr[CUnsignedLongInt], Ptr[Boolean], Ptr[Byte], Ptr[Boolean], Ptr[CUnsignedChar], CFuncPtr2[Ptr[NET], Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit], CFuncPtr3[Ptr[Byte], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit], CUnsignedLongInt, CUnsignedLongInt, CUnsignedLongInt, CUnsignedInt, CUnsignedInt, enum_field_types, Boolean, Boolean, Boolean, Boolean, Ptr[Byte]]
  object MYSQL_BIND:
    given _tag: Tag[MYSQL_BIND] = Tag.materializeCStruct19Tag[Ptr[CUnsignedLongInt], Ptr[Boolean], Ptr[Byte], Ptr[Boolean], Ptr[CUnsignedChar], CFuncPtr2[Ptr[NET], Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit], CFuncPtr3[Ptr[Byte], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit], CUnsignedLongInt, CUnsignedLongInt, CUnsignedLongInt, CUnsignedInt, CUnsignedInt, enum_field_types, Boolean, Boolean, Boolean, Boolean, Ptr[Byte]]
    def apply()(using Zone): Ptr[MYSQL_BIND] = scala.scalanative.unsafe.alloc[MYSQL_BIND](1)
    def apply(length : Ptr[CUnsignedLongInt], is_null : Ptr[Boolean], buffer : Ptr[Byte], error : Ptr[Boolean], row_ptr : Ptr[CUnsignedChar], store_param_func : CFuncPtr2[Ptr[NET], Ptr[MYSQL_BIND], Unit], fetch_result : CFuncPtr3[Ptr[MYSQL_BIND], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit], skip_result : CFuncPtr3[Ptr[MYSQL_BIND], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit], buffer_length : CUnsignedLongInt, offset : CUnsignedLongInt, length_value : CUnsignedLongInt, param_number : CUnsignedInt, pack_length : CUnsignedInt, buffer_type : enum_field_types, error_value : Boolean, is_unsigned : Boolean, long_data_used : Boolean, is_null_value : Boolean, extension : Ptr[Byte])(using Zone): Ptr[MYSQL_BIND] = 
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).is_null = is_null
      (!____ptr).buffer = buffer
      (!____ptr).error = error
      (!____ptr).row_ptr = row_ptr
      (!____ptr).store_param_func = store_param_func
      (!____ptr).fetch_result = fetch_result
      (!____ptr).skip_result = skip_result
      (!____ptr).buffer_length = buffer_length
      (!____ptr).offset = offset
      (!____ptr).length_value = length_value
      (!____ptr).param_number = param_number
      (!____ptr).pack_length = pack_length
      (!____ptr).buffer_type = buffer_type
      (!____ptr).error_value = error_value
      (!____ptr).is_unsigned = is_unsigned
      (!____ptr).long_data_used = long_data_used
      (!____ptr).is_null_value = is_null_value
      (!____ptr).extension = extension
      ____ptr
    extension (struct: MYSQL_BIND)
      def length : Ptr[CUnsignedLongInt] = struct._1
      def length_=(value: Ptr[CUnsignedLongInt]): Unit = !struct.at1 = value
      def is_null : Ptr[Boolean] = struct._2
      def is_null_=(value: Ptr[Boolean]): Unit = !struct.at2 = value
      def buffer : Ptr[Byte] = struct._3
      def buffer_=(value: Ptr[Byte]): Unit = !struct.at3 = value
      def error : Ptr[Boolean] = struct._4
      def error_=(value: Ptr[Boolean]): Unit = !struct.at4 = value
      def row_ptr : Ptr[CUnsignedChar] = struct._5
      def row_ptr_=(value: Ptr[CUnsignedChar]): Unit = !struct.at5 = value
      def store_param_func : CFuncPtr2[Ptr[NET], Ptr[MYSQL_BIND], Unit] = struct._6.asInstanceOf[CFuncPtr2[Ptr[NET], Ptr[MYSQL_BIND], Unit]]
      def store_param_func_=(value: CFuncPtr2[Ptr[NET], Ptr[MYSQL_BIND], Unit]): Unit = !struct.at6 = value.asInstanceOf[CFuncPtr2[Ptr[NET], Ptr[Byte], Unit]]
      def fetch_result : CFuncPtr3[Ptr[MYSQL_BIND], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit] = struct._7.asInstanceOf[CFuncPtr3[Ptr[MYSQL_BIND], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit]]
      def fetch_result_=(value: CFuncPtr3[Ptr[MYSQL_BIND], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit]): Unit = !struct.at7 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit]]
      def skip_result : CFuncPtr3[Ptr[MYSQL_BIND], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit] = struct._8.asInstanceOf[CFuncPtr3[Ptr[MYSQL_BIND], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit]]
      def skip_result_=(value: CFuncPtr3[Ptr[MYSQL_BIND], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit]): Unit = !struct.at8 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], Ptr[MYSQL_FIELD], Ptr[Ptr[CUnsignedChar]], Unit]]
      def buffer_length : CUnsignedLongInt = struct._9
      def buffer_length_=(value: CUnsignedLongInt): Unit = !struct.at9 = value
      def offset : CUnsignedLongInt = struct._10
      def offset_=(value: CUnsignedLongInt): Unit = !struct.at10 = value
      def length_value : CUnsignedLongInt = struct._11
      def length_value_=(value: CUnsignedLongInt): Unit = !struct.at11 = value
      def param_number : CUnsignedInt = struct._12
      def param_number_=(value: CUnsignedInt): Unit = !struct.at12 = value
      def pack_length : CUnsignedInt = struct._13
      def pack_length_=(value: CUnsignedInt): Unit = !struct.at13 = value
      def buffer_type : enum_field_types = struct._14
      def buffer_type_=(value: enum_field_types): Unit = !struct.at14 = value
      def error_value : Boolean = struct._15
      def error_value_=(value: Boolean): Unit = !struct.at15 = value
      def is_unsigned : Boolean = struct._16
      def is_unsigned_=(value: Boolean): Unit = !struct.at16 = value
      def long_data_used : Boolean = struct._17
      def long_data_used_=(value: Boolean): Unit = !struct.at17 = value
      def is_null_value : Boolean = struct._18
      def is_null_value_=(value: Boolean): Unit = !struct.at18 = value
      def extension : Ptr[Byte] = struct._19
      def extension_=(value: Ptr[Byte]): Unit = !struct.at19 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_DATA = CStruct4[Ptr[Byte], Ptr[MEM_ROOT], uint64_t, CUnsignedInt]
  object MYSQL_DATA:
    given _tag: Tag[MYSQL_DATA] = Tag.materializeCStruct4Tag[Ptr[Byte], Ptr[MEM_ROOT], uint64_t, CUnsignedInt]
    def apply()(using Zone): Ptr[MYSQL_DATA] = scala.scalanative.unsafe.alloc[MYSQL_DATA](1)
    def apply(data : Ptr[MYSQL_ROWS], alloc : Ptr[MEM_ROOT], rows : uint64_t, fields : CUnsignedInt)(using Zone): Ptr[MYSQL_DATA] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).alloc = alloc
      (!____ptr).rows = rows
      (!____ptr).fields = fields
      ____ptr
    extension (struct: MYSQL_DATA)
      def data : Ptr[MYSQL_ROWS] = struct._1.asInstanceOf[Ptr[MYSQL_ROWS]]
      def data_=(value: Ptr[MYSQL_ROWS]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def alloc : Ptr[MEM_ROOT] = struct._2
      def alloc_=(value: Ptr[MEM_ROOT]): Unit = !struct.at2 = value
      def rows : uint64_t = struct._3
      def rows_=(value: uint64_t): Unit = !struct.at3 = value
      def fields : CUnsignedInt = struct._4
      def fields_=(value: CUnsignedInt): Unit = !struct.at4 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_FIELD = CStruct21[CString, CString, CString, CString, CString, CString, CString, CUnsignedLongInt, CUnsignedLongInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, enum_field_types, Ptr[Byte]]
  object MYSQL_FIELD:
    given _tag: Tag[MYSQL_FIELD] = Tag.materializeCStruct21Tag[CString, CString, CString, CString, CString, CString, CString, CUnsignedLongInt, CUnsignedLongInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, enum_field_types, Ptr[Byte]]
    def apply()(using Zone): Ptr[MYSQL_FIELD] = scala.scalanative.unsafe.alloc[MYSQL_FIELD](1)
    def apply(name : CString, org_name : CString, table : CString, org_table : CString, db : CString, catalog : CString, `def` : CString, length : CUnsignedLongInt, max_length : CUnsignedLongInt, name_length : CUnsignedInt, org_name_length : CUnsignedInt, table_length : CUnsignedInt, org_table_length : CUnsignedInt, db_length : CUnsignedInt, catalog_length : CUnsignedInt, def_length : CUnsignedInt, flags : CUnsignedInt, decimals : CUnsignedInt, charsetnr : CUnsignedInt, `type` : enum_field_types, extension : Ptr[Byte])(using Zone): Ptr[MYSQL_FIELD] = 
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).org_name = org_name
      (!____ptr).table = table
      (!____ptr).org_table = org_table
      (!____ptr).db = db
      (!____ptr).catalog = catalog
      (!____ptr).`def` = `def`
      (!____ptr).length = length
      (!____ptr).max_length = max_length
      (!____ptr).name_length = name_length
      (!____ptr).org_name_length = org_name_length
      (!____ptr).table_length = table_length
      (!____ptr).org_table_length = org_table_length
      (!____ptr).db_length = db_length
      (!____ptr).catalog_length = catalog_length
      (!____ptr).def_length = def_length
      (!____ptr).flags = flags
      (!____ptr).decimals = decimals
      (!____ptr).charsetnr = charsetnr
      (!____ptr).`type` = `type`
      (!____ptr).extension = extension
      ____ptr
    extension (struct: MYSQL_FIELD)
      def name : CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def org_name : CString = struct._2
      def org_name_=(value: CString): Unit = !struct.at2 = value
      def table : CString = struct._3
      def table_=(value: CString): Unit = !struct.at3 = value
      def org_table : CString = struct._4
      def org_table_=(value: CString): Unit = !struct.at4 = value
      def db : CString = struct._5
      def db_=(value: CString): Unit = !struct.at5 = value
      def catalog : CString = struct._6
      def catalog_=(value: CString): Unit = !struct.at6 = value
      def `def` : CString = struct._7
      def def_=(value: CString): Unit = !struct.at7 = value
      def length : CUnsignedLongInt = struct._8
      def length_=(value: CUnsignedLongInt): Unit = !struct.at8 = value
      def max_length : CUnsignedLongInt = struct._9
      def max_length_=(value: CUnsignedLongInt): Unit = !struct.at9 = value
      def name_length : CUnsignedInt = struct._10
      def name_length_=(value: CUnsignedInt): Unit = !struct.at10 = value
      def org_name_length : CUnsignedInt = struct._11
      def org_name_length_=(value: CUnsignedInt): Unit = !struct.at11 = value
      def table_length : CUnsignedInt = struct._12
      def table_length_=(value: CUnsignedInt): Unit = !struct.at12 = value
      def org_table_length : CUnsignedInt = struct._13
      def org_table_length_=(value: CUnsignedInt): Unit = !struct.at13 = value
      def db_length : CUnsignedInt = struct._14
      def db_length_=(value: CUnsignedInt): Unit = !struct.at14 = value
      def catalog_length : CUnsignedInt = struct._15
      def catalog_length_=(value: CUnsignedInt): Unit = !struct.at15 = value
      def def_length : CUnsignedInt = struct._16
      def def_length_=(value: CUnsignedInt): Unit = !struct.at16 = value
      def flags : CUnsignedInt = struct._17
      def flags_=(value: CUnsignedInt): Unit = !struct.at17 = value
      def decimals : CUnsignedInt = struct._18
      def decimals_=(value: CUnsignedInt): Unit = !struct.at18 = value
      def charsetnr : CUnsignedInt = struct._19
      def charsetnr_=(value: CUnsignedInt): Unit = !struct.at19 = value
      def `type` : enum_field_types = struct._20
      def type_=(value: enum_field_types): Unit = !struct.at20 = value
      def extension : Ptr[Byte] = struct._21
      def extension_=(value: Ptr[Byte]): Unit = !struct.at21 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_METHODS = CStruct0
  object MYSQL_METHODS:
    given _tag: Tag[MYSQL_METHODS] = Tag.materializeCStruct0Tag

  /**
   * Provides plugin access to communication channel
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/plugin_auth_common.h
  */
  opaque type MYSQL_PLUGIN_VIO = CStruct5[CFuncPtr2[Ptr[Byte], Ptr[Ptr[CUnsignedChar]], CInt], CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CInt, CInt], CFuncPtr2[Ptr[Byte], Ptr[MYSQL_PLUGIN_VIO_INFO], Unit], CFuncPtr3[Ptr[Byte], Ptr[Ptr[CUnsignedChar]], Ptr[CInt], net_async_status], CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], CInt, Ptr[CInt], net_async_status]]
  object MYSQL_PLUGIN_VIO:
    given _tag: Tag[MYSQL_PLUGIN_VIO] = Tag.materializeCStruct5Tag[CFuncPtr2[Ptr[Byte], Ptr[Ptr[CUnsignedChar]], CInt], CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CInt, CInt], CFuncPtr2[Ptr[Byte], Ptr[MYSQL_PLUGIN_VIO_INFO], Unit], CFuncPtr3[Ptr[Byte], Ptr[Ptr[CUnsignedChar]], Ptr[CInt], net_async_status], CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], CInt, Ptr[CInt], net_async_status]]
    def apply()(using Zone): Ptr[MYSQL_PLUGIN_VIO] = scala.scalanative.unsafe.alloc[MYSQL_PLUGIN_VIO](1)
    def apply(read_packet : CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[Ptr[CUnsignedChar]], CInt], write_packet : CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[CUnsignedChar], CInt, CInt], info : CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL_PLUGIN_VIO_INFO], Unit], read_packet_nonblocking : CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[Ptr[CUnsignedChar]], Ptr[CInt], net_async_status], write_packet_nonblocking : CFuncPtr4[Ptr[MYSQL_PLUGIN_VIO], Ptr[CUnsignedChar], CInt, Ptr[CInt], net_async_status])(using Zone): Ptr[MYSQL_PLUGIN_VIO] = 
      val ____ptr = apply()
      (!____ptr).read_packet = read_packet
      (!____ptr).write_packet = write_packet
      (!____ptr).info = info
      (!____ptr).read_packet_nonblocking = read_packet_nonblocking
      (!____ptr).write_packet_nonblocking = write_packet_nonblocking
      ____ptr
    extension (struct: MYSQL_PLUGIN_VIO)
      def read_packet : CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[Ptr[CUnsignedChar]], CInt] = struct._1.asInstanceOf[CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[Ptr[CUnsignedChar]], CInt]]
      def read_packet_=(value: CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[Ptr[CUnsignedChar]], CInt]): Unit = !struct.at1 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[Ptr[CUnsignedChar]], CInt]]
      def write_packet : CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[CUnsignedChar], CInt, CInt] = struct._2.asInstanceOf[CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[CUnsignedChar], CInt, CInt]]
      def write_packet_=(value: CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[CUnsignedChar], CInt, CInt]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CInt, CInt]]
      def info : CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL_PLUGIN_VIO_INFO], Unit] = struct._3.asInstanceOf[CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL_PLUGIN_VIO_INFO], Unit]]
      def info_=(value: CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL_PLUGIN_VIO_INFO], Unit]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[MYSQL_PLUGIN_VIO_INFO], Unit]]
      def read_packet_nonblocking : CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[Ptr[CUnsignedChar]], Ptr[CInt], net_async_status] = struct._4.asInstanceOf[CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[Ptr[CUnsignedChar]], Ptr[CInt], net_async_status]]
      def read_packet_nonblocking_=(value: CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[Ptr[CUnsignedChar]], Ptr[CInt], net_async_status]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], Ptr[Ptr[CUnsignedChar]], Ptr[CInt], net_async_status]]
      def write_packet_nonblocking : CFuncPtr4[Ptr[MYSQL_PLUGIN_VIO], Ptr[CUnsignedChar], CInt, Ptr[CInt], net_async_status] = struct._5.asInstanceOf[CFuncPtr4[Ptr[MYSQL_PLUGIN_VIO], Ptr[CUnsignedChar], CInt, Ptr[CInt], net_async_status]]
      def write_packet_nonblocking_=(value: CFuncPtr4[Ptr[MYSQL_PLUGIN_VIO], Ptr[CUnsignedChar], CInt, Ptr[CInt], net_async_status]): Unit = !struct.at5 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], CInt, Ptr[CInt], net_async_status]]

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/plugin_auth_common.h
  */
  opaque type MYSQL_PLUGIN_VIO_INFO = CStruct2[MYSQL_PLUGIN_VIO_INFO.Enum0, CInt]
  object MYSQL_PLUGIN_VIO_INFO:
    /**
     * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/plugin_auth_common.h
    */
    opaque type Enum0 = CUnsignedInt
    object Enum0 extends CEnumU[Enum0]:
      given _tag: Tag[Enum0] = Tag.UInt
      inline def define(inline a: Long): Enum0 = a.toUInt
      val MYSQL_VIO_INVALID = define(0)
      val MYSQL_VIO_TCP = define(1)
      val MYSQL_VIO_SOCKET = define(2)
      val MYSQL_VIO_PIPE = define(3)
      val MYSQL_VIO_MEMORY = define(4)
      inline def getName(inline value: Enum0): Option[String] =
        inline value match
          case MYSQL_VIO_INVALID => Some("MYSQL_VIO_INVALID")
          case MYSQL_VIO_TCP => Some("MYSQL_VIO_TCP")
          case MYSQL_VIO_SOCKET => Some("MYSQL_VIO_SOCKET")
          case MYSQL_VIO_PIPE => Some("MYSQL_VIO_PIPE")
          case MYSQL_VIO_MEMORY => Some("MYSQL_VIO_MEMORY")
          case _ => None
      extension (a: Enum0)
        inline def &(b: Enum0): Enum0 = a & b
        inline def |(b: Enum0): Enum0 = a | b
        inline def is(b: Enum0): Boolean = (a & b) == b
    given _tag: Tag[MYSQL_PLUGIN_VIO_INFO] = Tag.materializeCStruct2Tag[MYSQL_PLUGIN_VIO_INFO.Enum0, CInt]
    def apply()(using Zone): Ptr[MYSQL_PLUGIN_VIO_INFO] = scala.scalanative.unsafe.alloc[MYSQL_PLUGIN_VIO_INFO](1)
    def apply(protocol : MYSQL_PLUGIN_VIO_INFO.Enum0, socket : CInt)(using Zone): Ptr[MYSQL_PLUGIN_VIO_INFO] = 
      val ____ptr = apply()
      (!____ptr).protocol = protocol
      (!____ptr).socket = socket
      ____ptr
    extension (struct: MYSQL_PLUGIN_VIO_INFO)
      def protocol : MYSQL_PLUGIN_VIO_INFO.Enum0 = struct._1
      def protocol_=(value: MYSQL_PLUGIN_VIO_INFO.Enum0): Unit = !struct.at1 = value
      def socket : CInt = struct._2
      def socket_=(value: CInt): Unit = !struct.at2 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_RES = CStruct16[uint64_t, Ptr[MYSQL_FIELD], Ptr[Byte], Ptr[Byte], Ptr[CUnsignedLongInt], Ptr[MYSQL], Ptr[MYSQL_METHODS], MYSQL_ROW, MYSQL_ROW, Ptr[MEM_ROOT], CUnsignedInt, CUnsignedInt, Boolean, Boolean, enum_resultset_metadata, Ptr[Byte]]
  object MYSQL_RES:
    given _tag: Tag[MYSQL_RES] = Tag.materializeCStruct16Tag[uint64_t, Ptr[MYSQL_FIELD], Ptr[Byte], Ptr[Byte], Ptr[CUnsignedLongInt], Ptr[MYSQL], Ptr[MYSQL_METHODS], MYSQL_ROW, MYSQL_ROW, Ptr[MEM_ROOT], CUnsignedInt, CUnsignedInt, Boolean, Boolean, enum_resultset_metadata, Ptr[Byte]]
    def apply()(using Zone): Ptr[MYSQL_RES] = scala.scalanative.unsafe.alloc[MYSQL_RES](1)
    def apply(row_count : uint64_t, fields : Ptr[MYSQL_FIELD], data : Ptr[MYSQL_DATA], data_cursor : Ptr[MYSQL_ROWS], lengths : Ptr[CUnsignedLongInt], handle : Ptr[MYSQL], methods : Ptr[MYSQL_METHODS], row : MYSQL_ROW, current_row : MYSQL_ROW, field_alloc : Ptr[MEM_ROOT], field_count : CUnsignedInt, current_field : CUnsignedInt, eof : Boolean, unbuffered_fetch_cancelled : Boolean, metadata : enum_resultset_metadata, extension : Ptr[Byte])(using Zone): Ptr[MYSQL_RES] = 
      val ____ptr = apply()
      (!____ptr).row_count = row_count
      (!____ptr).fields = fields
      (!____ptr).data = data
      (!____ptr).data_cursor = data_cursor
      (!____ptr).lengths = lengths
      (!____ptr).handle = handle
      (!____ptr).methods = methods
      (!____ptr).row = row
      (!____ptr).current_row = current_row
      (!____ptr).field_alloc = field_alloc
      (!____ptr).field_count = field_count
      (!____ptr).current_field = current_field
      (!____ptr).eof = eof
      (!____ptr).unbuffered_fetch_cancelled = unbuffered_fetch_cancelled
      (!____ptr).metadata = metadata
      (!____ptr).extension = extension
      ____ptr
    extension (struct: MYSQL_RES)
      def row_count : uint64_t = struct._1
      def row_count_=(value: uint64_t): Unit = !struct.at1 = value
      def fields : Ptr[MYSQL_FIELD] = struct._2
      def fields_=(value: Ptr[MYSQL_FIELD]): Unit = !struct.at2 = value
      def data : Ptr[MYSQL_DATA] = struct._3.asInstanceOf[Ptr[MYSQL_DATA]]
      def data_=(value: Ptr[MYSQL_DATA]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
      def data_cursor : Ptr[MYSQL_ROWS] = struct._4.asInstanceOf[Ptr[MYSQL_ROWS]]
      def data_cursor_=(value: Ptr[MYSQL_ROWS]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def lengths : Ptr[CUnsignedLongInt] = struct._5
      def lengths_=(value: Ptr[CUnsignedLongInt]): Unit = !struct.at5 = value
      def handle : Ptr[MYSQL] = struct._6
      def handle_=(value: Ptr[MYSQL]): Unit = !struct.at6 = value
      def methods : Ptr[MYSQL_METHODS] = struct._7
      def methods_=(value: Ptr[MYSQL_METHODS]): Unit = !struct.at7 = value
      def row : MYSQL_ROW = struct._8
      def row_=(value: MYSQL_ROW): Unit = !struct.at8 = value
      def current_row : MYSQL_ROW = struct._9
      def current_row_=(value: MYSQL_ROW): Unit = !struct.at9 = value
      def field_alloc : Ptr[MEM_ROOT] = struct._10
      def field_alloc_=(value: Ptr[MEM_ROOT]): Unit = !struct.at10 = value
      def field_count : CUnsignedInt = struct._11
      def field_count_=(value: CUnsignedInt): Unit = !struct.at11 = value
      def current_field : CUnsignedInt = struct._12
      def current_field_=(value: CUnsignedInt): Unit = !struct.at12 = value
      def eof : Boolean = struct._13
      def eof_=(value: Boolean): Unit = !struct.at13 = value
      def unbuffered_fetch_cancelled : Boolean = struct._14
      def unbuffered_fetch_cancelled_=(value: Boolean): Unit = !struct.at14 = value
      def metadata : enum_resultset_metadata = struct._15
      def metadata_=(value: enum_resultset_metadata): Unit = !struct.at15 = value
      def extension : Ptr[Byte] = struct._16
      def extension_=(value: Ptr[Byte]): Unit = !struct.at16 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_ROWS = CStruct3[Ptr[Byte], MYSQL_ROW, CUnsignedLongInt]
  object MYSQL_ROWS:
    given _tag: Tag[MYSQL_ROWS] = Tag.materializeCStruct3Tag[Ptr[Byte], MYSQL_ROW, CUnsignedLongInt]
    def apply()(using Zone): Ptr[MYSQL_ROWS] = scala.scalanative.unsafe.alloc[MYSQL_ROWS](1)
    def apply(next : Ptr[MYSQL_ROWS], data : MYSQL_ROW, length : CUnsignedLongInt)(using Zone): Ptr[MYSQL_ROWS] = 
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).data = data
      (!____ptr).length = length
      ____ptr
    extension (struct: MYSQL_ROWS)
      def next : Ptr[MYSQL_ROWS] = struct._1.asInstanceOf[Ptr[MYSQL_ROWS]]
      def next_=(value: Ptr[MYSQL_ROWS]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def data : MYSQL_ROW = struct._2
      def data_=(value: MYSQL_ROW): Unit = !struct.at2 = value
      def length : CUnsignedLongInt = struct._3
      def length_=(value: CUnsignedLongInt): Unit = !struct.at3 = value

  /**
   * Struct for information about a replication stream.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_RPL = CStruct10[size_t, CString, uint64_t, CUnsignedInt, CUnsignedInt, size_t, CFuncPtr2[Ptr[Byte], Ptr[CUnsignedChar], Unit], Ptr[Byte], CUnsignedLongInt, Ptr[CUnsignedChar]]
  object MYSQL_RPL:
    given _tag: Tag[MYSQL_RPL] = Tag.materializeCStruct10Tag[size_t, CString, uint64_t, CUnsignedInt, CUnsignedInt, size_t, CFuncPtr2[Ptr[Byte], Ptr[CUnsignedChar], Unit], Ptr[Byte], CUnsignedLongInt, Ptr[CUnsignedChar]]
    def apply()(using Zone): Ptr[MYSQL_RPL] = scala.scalanative.unsafe.alloc[MYSQL_RPL](1)
    def apply(file_name_length : size_t, file_name : CString, start_position : uint64_t, server_id : CUnsignedInt, flags : CUnsignedInt, gtid_set_encoded_size : size_t, fix_gtid_set : CFuncPtr2[Ptr[MYSQL_RPL], Ptr[CUnsignedChar], Unit], gtid_set_arg : Ptr[Byte], size : CUnsignedLongInt, buffer : Ptr[CUnsignedChar])(using Zone): Ptr[MYSQL_RPL] = 
      val ____ptr = apply()
      (!____ptr).file_name_length = file_name_length
      (!____ptr).file_name = file_name
      (!____ptr).start_position = start_position
      (!____ptr).server_id = server_id
      (!____ptr).flags = flags
      (!____ptr).gtid_set_encoded_size = gtid_set_encoded_size
      (!____ptr).fix_gtid_set = fix_gtid_set
      (!____ptr).gtid_set_arg = gtid_set_arg
      (!____ptr).size = size
      (!____ptr).buffer = buffer
      ____ptr
    extension (struct: MYSQL_RPL)
      def file_name_length : size_t = struct._1
      def file_name_length_=(value: size_t): Unit = !struct.at1 = value
      def file_name : CString = struct._2
      def file_name_=(value: CString): Unit = !struct.at2 = value
      def start_position : uint64_t = struct._3
      def start_position_=(value: uint64_t): Unit = !struct.at3 = value
      def server_id : CUnsignedInt = struct._4
      def server_id_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def flags : CUnsignedInt = struct._5
      def flags_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def gtid_set_encoded_size : size_t = struct._6
      def gtid_set_encoded_size_=(value: size_t): Unit = !struct.at6 = value
      def fix_gtid_set : CFuncPtr2[Ptr[MYSQL_RPL], Ptr[CUnsignedChar], Unit] = struct._7.asInstanceOf[CFuncPtr2[Ptr[MYSQL_RPL], Ptr[CUnsignedChar], Unit]]
      def fix_gtid_set_=(value: CFuncPtr2[Ptr[MYSQL_RPL], Ptr[CUnsignedChar], Unit]): Unit = !struct.at7 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[CUnsignedChar], Unit]]
      def gtid_set_arg : Ptr[Byte] = struct._8
      def gtid_set_arg_=(value: Ptr[Byte]): Unit = !struct.at8 = value
      def size : CUnsignedLongInt = struct._9
      def size_=(value: CUnsignedLongInt): Unit = !struct.at9 = value
      def buffer : Ptr[CUnsignedChar] = struct._10
      def buffer_=(value: Ptr[CUnsignedChar]): Unit = !struct.at10 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_STMT = CArray[CChar, Nat.Digit3[Nat._7, Nat._0, Nat._4]]
  object MYSQL_STMT:
    given _tag: Tag[MYSQL_STMT] = Tag.CArray[CChar, Nat.Digit3[Nat._7, Nat._0, Nat._4]](Tag.Byte, Tag.Digit3[Nat._7, Nat._0, Nat._4](Tag.Nat7, Tag.Nat0, Tag.Nat4))
    def apply()(using Zone): Ptr[MYSQL_STMT] = scala.scalanative.unsafe.alloc[MYSQL_STMT](1)
    def apply(mem_root : Ptr[MEM_ROOT], list : LIST, mysql : Ptr[MYSQL], params : Ptr[MYSQL_BIND], bind : Ptr[MYSQL_BIND], fields : Ptr[MYSQL_FIELD], result : MYSQL_DATA, data_cursor : Ptr[MYSQL_ROWS], read_row_func : CFuncPtr2[Ptr[MYSQL_STMT], Ptr[Ptr[CUnsignedChar]], CInt], affected_rows : uint64_t, insert_id : uint64_t, stmt_id : CUnsignedLongInt, flags : CUnsignedLongInt, prefetch_rows : CUnsignedLongInt, server_status : CUnsignedInt, last_errno : CUnsignedInt, param_count : CUnsignedInt, field_count : CUnsignedInt, state : enum_mysql_stmt_state, last_error : CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]], sqlstate : CArray[CChar, Nat._6], send_types_to_server : Boolean, bind_param_done : Boolean, bind_result_done : CUnsignedChar, unbuffered_fetch_cancelled : Boolean, update_max_length : Boolean, extension : Ptr[MYSQL_STMT_EXT])(using Zone): Ptr[MYSQL_STMT] = 
      val ____ptr = apply()
      (!____ptr).mem_root = mem_root
      (!____ptr).list = list
      (!____ptr).mysql = mysql
      (!____ptr).params = params
      (!____ptr).bind = bind
      (!____ptr).fields = fields
      (!____ptr).result = result
      (!____ptr).data_cursor = data_cursor
      (!____ptr).read_row_func = read_row_func
      (!____ptr).affected_rows = affected_rows
      (!____ptr).insert_id = insert_id
      (!____ptr).stmt_id = stmt_id
      (!____ptr).flags = flags
      (!____ptr).prefetch_rows = prefetch_rows
      (!____ptr).server_status = server_status
      (!____ptr).last_errno = last_errno
      (!____ptr).param_count = param_count
      (!____ptr).field_count = field_count
      (!____ptr).state = state
      (!____ptr).last_error = last_error
      (!____ptr).sqlstate = sqlstate
      (!____ptr).send_types_to_server = send_types_to_server
      (!____ptr).bind_param_done = bind_param_done
      (!____ptr).bind_result_done = bind_result_done
      (!____ptr).unbuffered_fetch_cancelled = unbuffered_fetch_cancelled
      (!____ptr).update_max_length = update_max_length
      (!____ptr).extension = extension
      ____ptr
    extension (struct: MYSQL_STMT)
      def mem_root: Ptr[MEM_ROOT] = !struct.at(0).asInstanceOf[Ptr[Ptr[MEM_ROOT]]]
      def mem_root_=(value: Ptr[MEM_ROOT]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[MEM_ROOT]]] = value
      def list: LIST = !struct.at(8).asInstanceOf[Ptr[LIST]]
      def list_=(value: LIST): Unit = !struct.at(8).asInstanceOf[Ptr[LIST]] = value
      def mysql: Ptr[MYSQL] = !struct.at(32).asInstanceOf[Ptr[Ptr[MYSQL]]]
      def mysql_=(value: Ptr[MYSQL]): Unit = !struct.at(32).asInstanceOf[Ptr[Ptr[MYSQL]]] = value
      def params: Ptr[MYSQL_BIND] = !struct.at(40).asInstanceOf[Ptr[Ptr[MYSQL_BIND]]]
      def params_=(value: Ptr[MYSQL_BIND]): Unit = !struct.at(40).asInstanceOf[Ptr[Ptr[MYSQL_BIND]]] = value
      def bind: Ptr[MYSQL_BIND] = !struct.at(48).asInstanceOf[Ptr[Ptr[MYSQL_BIND]]]
      def bind_=(value: Ptr[MYSQL_BIND]): Unit = !struct.at(48).asInstanceOf[Ptr[Ptr[MYSQL_BIND]]] = value
      def fields: Ptr[MYSQL_FIELD] = !struct.at(56).asInstanceOf[Ptr[Ptr[MYSQL_FIELD]]]
      def fields_=(value: Ptr[MYSQL_FIELD]): Unit = !struct.at(56).asInstanceOf[Ptr[Ptr[MYSQL_FIELD]]] = value
      def result: MYSQL_DATA = !struct.at(64).asInstanceOf[Ptr[MYSQL_DATA]]
      def result_=(value: MYSQL_DATA): Unit = !struct.at(64).asInstanceOf[Ptr[MYSQL_DATA]] = value
      def data_cursor: Ptr[MYSQL_ROWS] = !struct.at(96).asInstanceOf[Ptr[Ptr[MYSQL_ROWS]]]
      def data_cursor_=(value: Ptr[MYSQL_ROWS]): Unit = !struct.at(96).asInstanceOf[Ptr[Ptr[MYSQL_ROWS]]] = value
      def read_row_func: CFuncPtr2[Ptr[MYSQL_STMT], Ptr[Ptr[CUnsignedChar]], CInt] = !struct.at(104).asInstanceOf[Ptr[CFuncPtr2[Ptr[MYSQL_STMT], Ptr[Ptr[CUnsignedChar]], CInt]]]
      def read_row_func_=(value: CFuncPtr2[Ptr[MYSQL_STMT], Ptr[Ptr[CUnsignedChar]], CInt]): Unit = !struct.at(104).asInstanceOf[Ptr[CFuncPtr2[Ptr[MYSQL_STMT], Ptr[Ptr[CUnsignedChar]], CInt]]] = value
      def affected_rows: uint64_t = !struct.at(112).asInstanceOf[Ptr[uint64_t]]
      def affected_rows_=(value: uint64_t): Unit = !struct.at(112).asInstanceOf[Ptr[uint64_t]] = value
      def insert_id: uint64_t = !struct.at(120).asInstanceOf[Ptr[uint64_t]]
      def insert_id_=(value: uint64_t): Unit = !struct.at(120).asInstanceOf[Ptr[uint64_t]] = value
      def stmt_id: CUnsignedLongInt = !struct.at(128).asInstanceOf[Ptr[CUnsignedLongInt]]
      def stmt_id_=(value: CUnsignedLongInt): Unit = !struct.at(128).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def flags: CUnsignedLongInt = !struct.at(136).asInstanceOf[Ptr[CUnsignedLongInt]]
      def flags_=(value: CUnsignedLongInt): Unit = !struct.at(136).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def prefetch_rows: CUnsignedLongInt = !struct.at(144).asInstanceOf[Ptr[CUnsignedLongInt]]
      def prefetch_rows_=(value: CUnsignedLongInt): Unit = !struct.at(144).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def server_status: CUnsignedInt = !struct.at(152).asInstanceOf[Ptr[CUnsignedInt]]
      def server_status_=(value: CUnsignedInt): Unit = !struct.at(152).asInstanceOf[Ptr[CUnsignedInt]] = value
      def last_errno: CUnsignedInt = !struct.at(156).asInstanceOf[Ptr[CUnsignedInt]]
      def last_errno_=(value: CUnsignedInt): Unit = !struct.at(156).asInstanceOf[Ptr[CUnsignedInt]] = value
      def param_count: CUnsignedInt = !struct.at(160).asInstanceOf[Ptr[CUnsignedInt]]
      def param_count_=(value: CUnsignedInt): Unit = !struct.at(160).asInstanceOf[Ptr[CUnsignedInt]] = value
      def field_count: CUnsignedInt = !struct.at(164).asInstanceOf[Ptr[CUnsignedInt]]
      def field_count_=(value: CUnsignedInt): Unit = !struct.at(164).asInstanceOf[Ptr[CUnsignedInt]] = value
      def state: enum_mysql_stmt_state = !struct.at(168).asInstanceOf[Ptr[enum_mysql_stmt_state]]
      def state_=(value: enum_mysql_stmt_state): Unit = !struct.at(168).asInstanceOf[Ptr[enum_mysql_stmt_state]] = value
      def last_error: CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]] = !struct.at(172).asInstanceOf[Ptr[CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]]]]
      def last_error_=(value: CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]]): Unit = !struct.at(172).asInstanceOf[Ptr[CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]]]] = value
      def sqlstate: CArray[CChar, Nat._6] = !struct.at(684).asInstanceOf[Ptr[CArray[CChar, Nat._6]]]
      def sqlstate_=(value: CArray[CChar, Nat._6]): Unit = !struct.at(684).asInstanceOf[Ptr[CArray[CChar, Nat._6]]] = value
      def send_types_to_server: Boolean = !struct.at(690).asInstanceOf[Ptr[Boolean]]
      def send_types_to_server_=(value: Boolean): Unit = !struct.at(690).asInstanceOf[Ptr[Boolean]] = value
      def bind_param_done: Boolean = !struct.at(691).asInstanceOf[Ptr[Boolean]]
      def bind_param_done_=(value: Boolean): Unit = !struct.at(691).asInstanceOf[Ptr[Boolean]] = value
      def bind_result_done: CUnsignedChar = !struct.at(692).asInstanceOf[Ptr[CUnsignedChar]]
      def bind_result_done_=(value: CUnsignedChar): Unit = !struct.at(692).asInstanceOf[Ptr[CUnsignedChar]] = value
      def unbuffered_fetch_cancelled: Boolean = !struct.at(693).asInstanceOf[Ptr[Boolean]]
      def unbuffered_fetch_cancelled_=(value: Boolean): Unit = !struct.at(693).asInstanceOf[Ptr[Boolean]] = value
      def update_max_length: Boolean = !struct.at(694).asInstanceOf[Ptr[Boolean]]
      def update_max_length_=(value: Boolean): Unit = !struct.at(694).asInstanceOf[Ptr[Boolean]] = value
      def extension: Ptr[MYSQL_STMT_EXT] = !struct.at(696).asInstanceOf[Ptr[Ptr[MYSQL_STMT_EXT]]]
      def extension_=(value: Ptr[MYSQL_STMT_EXT]): Unit = !struct.at(696).asInstanceOf[Ptr[Ptr[MYSQL_STMT_EXT]]] = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MYSQL_STMT_EXT = CStruct0
  object MYSQL_STMT_EXT:
    given _tag: Tag[MYSQL_STMT_EXT] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_time.h
  */
  opaque type MYSQL_TIME = CStruct10[CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedLongInt, Boolean, enum_mysql_timestamp_type, CInt]
  object MYSQL_TIME:
    given _tag: Tag[MYSQL_TIME] = Tag.materializeCStruct10Tag[CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedLongInt, Boolean, enum_mysql_timestamp_type, CInt]
    def apply()(using Zone): Ptr[MYSQL_TIME] = scala.scalanative.unsafe.alloc[MYSQL_TIME](1)
    def apply(year : CUnsignedInt, month : CUnsignedInt, day : CUnsignedInt, hour : CUnsignedInt, minute : CUnsignedInt, second : CUnsignedInt, second_part : CUnsignedLongInt, neg : Boolean, time_type : enum_mysql_timestamp_type, time_zone_displacement : CInt)(using Zone): Ptr[MYSQL_TIME] = 
      val ____ptr = apply()
      (!____ptr).year = year
      (!____ptr).month = month
      (!____ptr).day = day
      (!____ptr).hour = hour
      (!____ptr).minute = minute
      (!____ptr).second = second
      (!____ptr).second_part = second_part
      (!____ptr).neg = neg
      (!____ptr).time_type = time_type
      (!____ptr).time_zone_displacement = time_zone_displacement
      ____ptr
    extension (struct: MYSQL_TIME)
      def year : CUnsignedInt = struct._1
      def year_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def month : CUnsignedInt = struct._2
      def month_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def day : CUnsignedInt = struct._3
      def day_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def hour : CUnsignedInt = struct._4
      def hour_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def minute : CUnsignedInt = struct._5
      def minute_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def second : CUnsignedInt = struct._6
      def second_=(value: CUnsignedInt): Unit = !struct.at6 = value
      def second_part : CUnsignedLongInt = struct._7
      def second_part_=(value: CUnsignedLongInt): Unit = !struct.at7 = value
      def neg : Boolean = struct._8
      def neg_=(value: Boolean): Unit = !struct.at8 = value
      def time_type : enum_mysql_timestamp_type = struct._9
      def time_type_=(value: enum_mysql_timestamp_type): Unit = !struct.at9 = value
      def time_zone_displacement : CInt = struct._10
      def time_zone_displacement_=(value: CInt): Unit = !struct.at10 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type MY_CHARSET_INFO = CStruct8[CUnsignedInt, CUnsignedInt, CString, CString, CString, CString, CUnsignedInt, CUnsignedInt]
  object MY_CHARSET_INFO:
    given _tag: Tag[MY_CHARSET_INFO] = Tag.materializeCStruct8Tag[CUnsignedInt, CUnsignedInt, CString, CString, CString, CString, CUnsignedInt, CUnsignedInt]
    def apply()(using Zone): Ptr[MY_CHARSET_INFO] = scala.scalanative.unsafe.alloc[MY_CHARSET_INFO](1)
    def apply(number : CUnsignedInt, state : CUnsignedInt, csname : CString, name : CString, comment : CString, dir : CString, mbminlen : CUnsignedInt, mbmaxlen : CUnsignedInt)(using Zone): Ptr[MY_CHARSET_INFO] = 
      val ____ptr = apply()
      (!____ptr).number = number
      (!____ptr).state = state
      (!____ptr).csname = csname
      (!____ptr).name = name
      (!____ptr).comment = comment
      (!____ptr).dir = dir
      (!____ptr).mbminlen = mbminlen
      (!____ptr).mbmaxlen = mbmaxlen
      ____ptr
    extension (struct: MY_CHARSET_INFO)
      def number : CUnsignedInt = struct._1
      def number_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def state : CUnsignedInt = struct._2
      def state_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def csname : CString = struct._3
      def csname_=(value: CString): Unit = !struct.at3 = value
      def name : CString = struct._4
      def name_=(value: CString): Unit = !struct.at4 = value
      def comment : CString = struct._5
      def comment_=(value: CString): Unit = !struct.at5 = value
      def dir : CString = struct._6
      def dir_=(value: CString): Unit = !struct.at6 = value
      def mbminlen : CUnsignedInt = struct._7
      def mbminlen_=(value: CUnsignedInt): Unit = !struct.at7 = value
      def mbmaxlen : CUnsignedInt = struct._8
      def mbmaxlen_=(value: CUnsignedInt): Unit = !struct.at8 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  opaque type NET = CArray[CChar, Nat.Digit3[Nat._6, Nat._6, Nat._4]]
  object NET:
    given _tag: Tag[NET] = Tag.CArray[CChar, Nat.Digit3[Nat._6, Nat._6, Nat._4]](Tag.Byte, Tag.Digit3[Nat._6, Nat._6, Nat._4](Tag.Nat6, Tag.Nat6, Tag.Nat4))
    def apply()(using Zone): Ptr[NET] = scala.scalanative.unsafe.alloc[NET](1)
    def apply(vio : Ptr[Vio], buff : Ptr[CUnsignedChar], buff_end : Ptr[CUnsignedChar], write_pos : Ptr[CUnsignedChar], read_pos : Ptr[CUnsignedChar], fd : my_socket, remain_in_buf : CUnsignedLongInt, _length : CUnsignedLongInt, buf_length : CUnsignedLongInt, where_b : CUnsignedLongInt, max_packet : CUnsignedLongInt, max_packet_size : CUnsignedLongInt, pkt_nr : CUnsignedInt, compress_pkt_nr : CUnsignedInt, write_timeout : CUnsignedInt, read_timeout : CUnsignedInt, retry_count : CUnsignedInt, fcntl : CInt, return_status : Ptr[CUnsignedInt], reading_or_writing : CUnsignedChar, save_char : CUnsignedChar, compress : Boolean, last_errno : CUnsignedInt, error : CUnsignedChar, last_error : CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]], sqlstate : CArray[CChar, Nat._6], extension : Ptr[Byte])(using Zone): Ptr[NET] = 
      val ____ptr = apply()
      (!____ptr).vio = vio
      (!____ptr).buff = buff
      (!____ptr).buff_end = buff_end
      (!____ptr).write_pos = write_pos
      (!____ptr).read_pos = read_pos
      (!____ptr).fd = fd
      (!____ptr).remain_in_buf = remain_in_buf
      (!____ptr)._length = _length
      (!____ptr).buf_length = buf_length
      (!____ptr).where_b = where_b
      (!____ptr).max_packet = max_packet
      (!____ptr).max_packet_size = max_packet_size
      (!____ptr).pkt_nr = pkt_nr
      (!____ptr).compress_pkt_nr = compress_pkt_nr
      (!____ptr).write_timeout = write_timeout
      (!____ptr).read_timeout = read_timeout
      (!____ptr).retry_count = retry_count
      (!____ptr).fcntl = fcntl
      (!____ptr).return_status = return_status
      (!____ptr).reading_or_writing = reading_or_writing
      (!____ptr).save_char = save_char
      (!____ptr).compress = compress
      (!____ptr).last_errno = last_errno
      (!____ptr).error = error
      (!____ptr).last_error = last_error
      (!____ptr).sqlstate = sqlstate
      (!____ptr).extension = extension
      ____ptr
    extension (struct: NET)
      def vio: Ptr[Vio] = !struct.at(0).asInstanceOf[Ptr[Ptr[Vio]]]
      def vio_=(value: Ptr[Vio]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Vio]]] = value
      def buff: Ptr[CUnsignedChar] = !struct.at(8).asInstanceOf[Ptr[Ptr[CUnsignedChar]]]
      def buff_=(value: Ptr[CUnsignedChar]): Unit = !struct.at(8).asInstanceOf[Ptr[Ptr[CUnsignedChar]]] = value
      def buff_end: Ptr[CUnsignedChar] = !struct.at(16).asInstanceOf[Ptr[Ptr[CUnsignedChar]]]
      def buff_end_=(value: Ptr[CUnsignedChar]): Unit = !struct.at(16).asInstanceOf[Ptr[Ptr[CUnsignedChar]]] = value
      def write_pos: Ptr[CUnsignedChar] = !struct.at(24).asInstanceOf[Ptr[Ptr[CUnsignedChar]]]
      def write_pos_=(value: Ptr[CUnsignedChar]): Unit = !struct.at(24).asInstanceOf[Ptr[Ptr[CUnsignedChar]]] = value
      def read_pos: Ptr[CUnsignedChar] = !struct.at(32).asInstanceOf[Ptr[Ptr[CUnsignedChar]]]
      def read_pos_=(value: Ptr[CUnsignedChar]): Unit = !struct.at(32).asInstanceOf[Ptr[Ptr[CUnsignedChar]]] = value
      def fd: my_socket = !struct.at(40).asInstanceOf[Ptr[my_socket]]
      def fd_=(value: my_socket): Unit = !struct.at(40).asInstanceOf[Ptr[my_socket]] = value
      def remain_in_buf: CUnsignedLongInt = !struct.at(48).asInstanceOf[Ptr[CUnsignedLongInt]]
      def remain_in_buf_=(value: CUnsignedLongInt): Unit = !struct.at(48).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def _length: CUnsignedLongInt = !struct.at(56).asInstanceOf[Ptr[CUnsignedLongInt]]
      def _length_=(value: CUnsignedLongInt): Unit = !struct.at(56).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def buf_length: CUnsignedLongInt = !struct.at(64).asInstanceOf[Ptr[CUnsignedLongInt]]
      def buf_length_=(value: CUnsignedLongInt): Unit = !struct.at(64).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def where_b: CUnsignedLongInt = !struct.at(72).asInstanceOf[Ptr[CUnsignedLongInt]]
      def where_b_=(value: CUnsignedLongInt): Unit = !struct.at(72).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def max_packet: CUnsignedLongInt = !struct.at(80).asInstanceOf[Ptr[CUnsignedLongInt]]
      def max_packet_=(value: CUnsignedLongInt): Unit = !struct.at(80).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def max_packet_size: CUnsignedLongInt = !struct.at(88).asInstanceOf[Ptr[CUnsignedLongInt]]
      def max_packet_size_=(value: CUnsignedLongInt): Unit = !struct.at(88).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def pkt_nr: CUnsignedInt = !struct.at(96).asInstanceOf[Ptr[CUnsignedInt]]
      def pkt_nr_=(value: CUnsignedInt): Unit = !struct.at(96).asInstanceOf[Ptr[CUnsignedInt]] = value
      def compress_pkt_nr: CUnsignedInt = !struct.at(100).asInstanceOf[Ptr[CUnsignedInt]]
      def compress_pkt_nr_=(value: CUnsignedInt): Unit = !struct.at(100).asInstanceOf[Ptr[CUnsignedInt]] = value
      def write_timeout: CUnsignedInt = !struct.at(104).asInstanceOf[Ptr[CUnsignedInt]]
      def write_timeout_=(value: CUnsignedInt): Unit = !struct.at(104).asInstanceOf[Ptr[CUnsignedInt]] = value
      def read_timeout: CUnsignedInt = !struct.at(108).asInstanceOf[Ptr[CUnsignedInt]]
      def read_timeout_=(value: CUnsignedInt): Unit = !struct.at(108).asInstanceOf[Ptr[CUnsignedInt]] = value
      def retry_count: CUnsignedInt = !struct.at(112).asInstanceOf[Ptr[CUnsignedInt]]
      def retry_count_=(value: CUnsignedInt): Unit = !struct.at(112).asInstanceOf[Ptr[CUnsignedInt]] = value
      def fcntl: CInt = !struct.at(116).asInstanceOf[Ptr[CInt]]
      def fcntl_=(value: CInt): Unit = !struct.at(116).asInstanceOf[Ptr[CInt]] = value
      def return_status: Ptr[CUnsignedInt] = !struct.at(120).asInstanceOf[Ptr[Ptr[CUnsignedInt]]]
      def return_status_=(value: Ptr[CUnsignedInt]): Unit = !struct.at(120).asInstanceOf[Ptr[Ptr[CUnsignedInt]]] = value
      def reading_or_writing: CUnsignedChar = !struct.at(128).asInstanceOf[Ptr[CUnsignedChar]]
      def reading_or_writing_=(value: CUnsignedChar): Unit = !struct.at(128).asInstanceOf[Ptr[CUnsignedChar]] = value
      def save_char: CUnsignedChar = !struct.at(129).asInstanceOf[Ptr[CUnsignedChar]]
      def save_char_=(value: CUnsignedChar): Unit = !struct.at(129).asInstanceOf[Ptr[CUnsignedChar]] = value
      def compress: Boolean = !struct.at(130).asInstanceOf[Ptr[Boolean]]
      def compress_=(value: Boolean): Unit = !struct.at(130).asInstanceOf[Ptr[Boolean]] = value
      def last_errno: CUnsignedInt = !struct.at(132).asInstanceOf[Ptr[CUnsignedInt]]
      def last_errno_=(value: CUnsignedInt): Unit = !struct.at(132).asInstanceOf[Ptr[CUnsignedInt]] = value
      def error: CUnsignedChar = !struct.at(136).asInstanceOf[Ptr[CUnsignedChar]]
      def error_=(value: CUnsignedChar): Unit = !struct.at(136).asInstanceOf[Ptr[CUnsignedChar]] = value
      def last_error: CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]] = !struct.at(137).asInstanceOf[Ptr[CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]]]]
      def last_error_=(value: CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]]): Unit = !struct.at(137).asInstanceOf[Ptr[CArray[CChar, Nat.Digit3[Nat._5, Nat._1, Nat._2]]]] = value
      def sqlstate: CArray[CChar, Nat._6] = !struct.at(649).asInstanceOf[Ptr[CArray[CChar, Nat._6]]]
      def sqlstate_=(value: CArray[CChar, Nat._6]): Unit = !struct.at(649).asInstanceOf[Ptr[CArray[CChar, Nat._6]]] = value
      def extension: Ptr[Byte] = !struct.at(656).asInstanceOf[Ptr[Ptr[Byte]]]
      def extension_=(value: Ptr[Byte]): Unit = !struct.at(656).asInstanceOf[Ptr[Ptr[Byte]]] = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type UDF_ARGS = CStruct8[CUnsignedInt, Ptr[Item_result], Ptr[CString], Ptr[CUnsignedLongInt], CString, Ptr[CString], Ptr[CUnsignedLongInt], Ptr[Byte]]
  object UDF_ARGS:
    given _tag: Tag[UDF_ARGS] = Tag.materializeCStruct8Tag[CUnsignedInt, Ptr[Item_result], Ptr[CString], Ptr[CUnsignedLongInt], CString, Ptr[CString], Ptr[CUnsignedLongInt], Ptr[Byte]]
    def apply()(using Zone): Ptr[UDF_ARGS] = scala.scalanative.unsafe.alloc[UDF_ARGS](1)
    def apply(arg_count : CUnsignedInt, arg_type : Ptr[Item_result], args : Ptr[CString], lengths : Ptr[CUnsignedLongInt], maybe_null : CString, attributes : Ptr[CString], attribute_lengths : Ptr[CUnsignedLongInt], extension : Ptr[Byte])(using Zone): Ptr[UDF_ARGS] = 
      val ____ptr = apply()
      (!____ptr).arg_count = arg_count
      (!____ptr).arg_type = arg_type
      (!____ptr).args = args
      (!____ptr).lengths = lengths
      (!____ptr).maybe_null = maybe_null
      (!____ptr).attributes = attributes
      (!____ptr).attribute_lengths = attribute_lengths
      (!____ptr).extension = extension
      ____ptr
    extension (struct: UDF_ARGS)
      def arg_count : CUnsignedInt = struct._1
      def arg_count_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def arg_type : Ptr[Item_result] = struct._2
      def arg_type_=(value: Ptr[Item_result]): Unit = !struct.at2 = value
      def args : Ptr[CString] = struct._3
      def args_=(value: Ptr[CString]): Unit = !struct.at3 = value
      def lengths : Ptr[CUnsignedLongInt] = struct._4
      def lengths_=(value: Ptr[CUnsignedLongInt]): Unit = !struct.at4 = value
      def maybe_null : CString = struct._5
      def maybe_null_=(value: CString): Unit = !struct.at5 = value
      def attributes : Ptr[CString] = struct._6
      def attributes_=(value: Ptr[CString]): Unit = !struct.at6 = value
      def attribute_lengths : Ptr[CUnsignedLongInt] = struct._7
      def attribute_lengths_=(value: Ptr[CUnsignedLongInt]): Unit = !struct.at7 = value
      def extension : Ptr[Byte] = struct._8
      def extension_=(value: Ptr[Byte]): Unit = !struct.at8 = value

  /**
   * Information about the result of a user defined function
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/udf_registration_types.h
  */
  opaque type UDF_INIT = CStruct6[Boolean, CUnsignedInt, CUnsignedLongInt, CString, Boolean, Ptr[Byte]]
  object UDF_INIT:
    given _tag: Tag[UDF_INIT] = Tag.materializeCStruct6Tag[Boolean, CUnsignedInt, CUnsignedLongInt, CString, Boolean, Ptr[Byte]]
    def apply()(using Zone): Ptr[UDF_INIT] = scala.scalanative.unsafe.alloc[UDF_INIT](1)
    def apply(maybe_null : Boolean, decimals : CUnsignedInt, max_length : CUnsignedLongInt, ptr : CString, const_item : Boolean, extension : Ptr[Byte])(using Zone): Ptr[UDF_INIT] = 
      val ____ptr = apply()
      (!____ptr).maybe_null = maybe_null
      (!____ptr).decimals = decimals
      (!____ptr).max_length = max_length
      (!____ptr).ptr = ptr
      (!____ptr).const_item = const_item
      (!____ptr).extension = extension
      ____ptr
    extension (struct: UDF_INIT)
      def maybe_null : Boolean = struct._1
      def maybe_null_=(value: Boolean): Unit = !struct.at1 = value
      def decimals : CUnsignedInt = struct._2
      def decimals_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def max_length : CUnsignedLongInt = struct._3
      def max_length_=(value: CUnsignedLongInt): Unit = !struct.at3 = value
      def ptr : CString = struct._4
      def ptr_=(value: CString): Unit = !struct.at4 = value
      def const_item : Boolean = struct._5
      def const_item_=(value: Boolean): Unit = !struct.at5 = value
      def extension : Ptr[Byte] = struct._6
      def extension_=(value: Ptr[Byte]): Unit = !struct.at6 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  opaque type Vio = CStruct0
  object Vio:
    given _tag: Tag[Vio] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
  */
  opaque type ZSTD_CCtx = CStruct0
  object ZSTD_CCtx:
    given _tag: Tag[ZSTD_CCtx] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
  */
  opaque type ZSTD_CCtx_s = CStruct0
  object ZSTD_CCtx_s:
    given _tag: Tag[ZSTD_CCtx_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
  */
  opaque type ZSTD_DCtx = CStruct0
  object ZSTD_DCtx:
    given _tag: Tag[ZSTD_DCtx] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
  */
  opaque type ZSTD_DCtx_s = CStruct0
  object ZSTD_DCtx_s:
    given _tag: Tag[ZSTD_DCtx_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/client_plugin.h
  */
  opaque type auth_plugin_t = CStruct14[CInt, CUnsignedInt, CString, CString, CString, CArray[CUnsignedInt, Nat._3], CString, Ptr[Byte], CFuncPtr4[CString, size_t, CInt, va_list, CInt], CFuncPtr0[CInt], CFuncPtr2[CString, Ptr[Byte], CInt], CFuncPtr2[CString, Ptr[Byte], CInt], CFuncPtr2[Ptr[Byte], Ptr[MYSQL], CInt], CFuncPtr3[Ptr[Byte], Ptr[MYSQL], Ptr[CInt], net_async_status]]
  object auth_plugin_t:
    given _tag: Tag[auth_plugin_t] = Tag.materializeCStruct14Tag[CInt, CUnsignedInt, CString, CString, CString, CArray[CUnsignedInt, Nat._3], CString, Ptr[Byte], CFuncPtr4[CString, size_t, CInt, va_list, CInt], CFuncPtr0[CInt], CFuncPtr2[CString, Ptr[Byte], CInt], CFuncPtr2[CString, Ptr[Byte], CInt], CFuncPtr2[Ptr[Byte], Ptr[MYSQL], CInt], CFuncPtr3[Ptr[Byte], Ptr[MYSQL], Ptr[CInt], net_async_status]]
    def apply()(using Zone): Ptr[auth_plugin_t] = scala.scalanative.unsafe.alloc[auth_plugin_t](1)
    def apply(`type` : CInt, interface_version : CUnsignedInt, name : CString, author : CString, desc : CString, version : CArray[CUnsignedInt, Nat._3], license : CString, mysql_api : Ptr[Byte], init : CFuncPtr4[CString, size_t, CInt, va_list, CInt], deinit : CFuncPtr0[CInt], options : CFuncPtr2[CString, Ptr[Byte], CInt], get_options : CFuncPtr2[CString, Ptr[Byte], CInt], authenticate_user : CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], CInt], authenticate_user_nonblocking : CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], Ptr[CInt], net_async_status])(using Zone): Ptr[auth_plugin_t] = 
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).interface_version = interface_version
      (!____ptr).name = name
      (!____ptr).author = author
      (!____ptr).desc = desc
      (!____ptr).version = version
      (!____ptr).license = license
      (!____ptr).mysql_api = mysql_api
      (!____ptr).init = init
      (!____ptr).deinit = deinit
      (!____ptr).options = options
      (!____ptr).get_options = get_options
      (!____ptr).authenticate_user = authenticate_user
      (!____ptr).authenticate_user_nonblocking = authenticate_user_nonblocking
      ____ptr
    extension (struct: auth_plugin_t)
      def `type` : CInt = struct._1
      def type_=(value: CInt): Unit = !struct.at1 = value
      def interface_version : CUnsignedInt = struct._2
      def interface_version_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def name : CString = struct._3
      def name_=(value: CString): Unit = !struct.at3 = value
      def author : CString = struct._4
      def author_=(value: CString): Unit = !struct.at4 = value
      def desc : CString = struct._5
      def desc_=(value: CString): Unit = !struct.at5 = value
      def version : CArray[CUnsignedInt, Nat._3] = struct._6
      def version_=(value: CArray[CUnsignedInt, Nat._3]): Unit = !struct.at6 = value
      def license : CString = struct._7
      def license_=(value: CString): Unit = !struct.at7 = value
      def mysql_api : Ptr[Byte] = struct._8
      def mysql_api_=(value: Ptr[Byte]): Unit = !struct.at8 = value
      def init : CFuncPtr4[CString, size_t, CInt, va_list, CInt] = struct._9
      def init_=(value: CFuncPtr4[CString, size_t, CInt, va_list, CInt]): Unit = !struct.at9 = value
      def deinit : CFuncPtr0[CInt] = struct._10
      def deinit_=(value: CFuncPtr0[CInt]): Unit = !struct.at10 = value
      def options : CFuncPtr2[CString, Ptr[Byte], CInt] = struct._11
      def options_=(value: CFuncPtr2[CString, Ptr[Byte], CInt]): Unit = !struct.at11 = value
      def get_options : CFuncPtr2[CString, Ptr[Byte], CInt] = struct._12
      def get_options_=(value: CFuncPtr2[CString, Ptr[Byte], CInt]): Unit = !struct.at12 = value
      def authenticate_user : CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], CInt] = struct._13.asInstanceOf[CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], CInt]]
      def authenticate_user_=(value: CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], CInt]): Unit = !struct.at13 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[MYSQL], CInt]]
      def authenticate_user_nonblocking : CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], Ptr[CInt], net_async_status] = struct._14.asInstanceOf[CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], Ptr[CInt], net_async_status]]
      def authenticate_user_nonblocking_=(value: CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], Ptr[CInt], net_async_status]): Unit = !struct.at14 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], Ptr[MYSQL], Ptr[CInt], net_async_status]]

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type character_set = CStruct8[CUnsignedInt, CUnsignedInt, CString, CString, CString, CString, CUnsignedInt, CUnsignedInt]
  object character_set:
    given _tag: Tag[character_set] = Tag.materializeCStruct8Tag[CUnsignedInt, CUnsignedInt, CString, CString, CString, CString, CUnsignedInt, CUnsignedInt]
    def apply()(using Zone): Ptr[character_set] = scala.scalanative.unsafe.alloc[character_set](1)
    def apply(number : CUnsignedInt, state : CUnsignedInt, csname : CString, name : CString, comment : CString, dir : CString, mbminlen : CUnsignedInt, mbmaxlen : CUnsignedInt)(using Zone): Ptr[character_set] = 
      val ____ptr = apply()
      (!____ptr).number = number
      (!____ptr).state = state
      (!____ptr).csname = csname
      (!____ptr).name = name
      (!____ptr).comment = comment
      (!____ptr).dir = dir
      (!____ptr).mbminlen = mbminlen
      (!____ptr).mbmaxlen = mbmaxlen
      ____ptr
    extension (struct: character_set)
      def number : CUnsignedInt = struct._1
      def number_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def state : CUnsignedInt = struct._2
      def state_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def csname : CString = struct._3
      def csname_=(value: CString): Unit = !struct.at3 = value
      def name : CString = struct._4
      def name_=(value: CString): Unit = !struct.at4 = value
      def comment : CString = struct._5
      def comment_=(value: CString): Unit = !struct.at5 = value
      def dir : CString = struct._6
      def dir_=(value: CString): Unit = !struct.at6 = value
      def mbminlen : CUnsignedInt = struct._7
      def mbminlen_=(value: CUnsignedInt): Unit = !struct.at7 = value
      def mbmaxlen : CUnsignedInt = struct._8
      def mbmaxlen_=(value: CUnsignedInt): Unit = !struct.at8 = value

  /**
   * Compression context information. It encapsulate the context information based on compression method and presents a generic struct.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
  */
  opaque type mysql_compress_context = CStruct2[enum_compression_algorithm, mysql_compress_context.Union0]
  object mysql_compress_context:
    /**
     * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._2, Nat._4]]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_zlib_ctx")
      def apply(zlib_ctx: mysql_zlib_compress_context)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[mysql_zlib_compress_context]].update(0, zlib_ctx)
        ___ptr
      @scala.annotation.targetName("apply_zstd_ctx")
      def apply(zstd_ctx: mysql_zstd_compress_context)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[mysql_zstd_compress_context]].update(0, zstd_ctx)
        ___ptr
      extension (struct: Union0)
        def zlib_ctx : mysql_zlib_compress_context = !struct.at(0).asInstanceOf[Ptr[mysql_zlib_compress_context]]
        def zlib_ctx_=(value: mysql_zlib_compress_context): Unit = !struct.at(0).asInstanceOf[Ptr[mysql_zlib_compress_context]] = value
        def zstd_ctx : mysql_zstd_compress_context = !struct.at(0).asInstanceOf[Ptr[mysql_zstd_compress_context]]
        def zstd_ctx_=(value: mysql_zstd_compress_context): Unit = !struct.at(0).asInstanceOf[Ptr[mysql_zstd_compress_context]] = value
    given _tag: Tag[mysql_compress_context] = Tag.materializeCStruct2Tag[enum_compression_algorithm, mysql_compress_context.Union0]
    def apply()(using Zone): Ptr[mysql_compress_context] = scala.scalanative.unsafe.alloc[mysql_compress_context](1)
    def apply(algorithm : enum_compression_algorithm, u : mysql_compress_context.Union0)(using Zone): Ptr[mysql_compress_context] = 
      val ____ptr = apply()
      (!____ptr).algorithm = algorithm
      (!____ptr).u = u
      ____ptr
    extension (struct: mysql_compress_context)
      def algorithm : enum_compression_algorithm = struct._1
      def algorithm_=(value: enum_compression_algorithm): Unit = !struct.at1 = value
      def u : mysql_compress_context.Union0 = struct._2
      def u_=(value: mysql_compress_context.Union0): Unit = !struct.at2 = value

  /**
   * Compress context information. relating to zlib compression.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
  */
  opaque type mysql_zlib_compress_context = CStruct1[CUnsignedInt]
  object mysql_zlib_compress_context:
    given _tag: Tag[mysql_zlib_compress_context] = Tag.materializeCStruct1Tag[CUnsignedInt]
    def apply()(using Zone): Ptr[mysql_zlib_compress_context] = scala.scalanative.unsafe.alloc[mysql_zlib_compress_context](1)
    def apply(compression_level : CUnsignedInt)(using Zone): Ptr[mysql_zlib_compress_context] = 
      val ____ptr = apply()
      (!____ptr).compression_level = compression_level
      ____ptr
    extension (struct: mysql_zlib_compress_context)
      def compression_level : CUnsignedInt = struct._1
      def compression_level_=(value: CUnsignedInt): Unit = !struct.at1 = value

  /**
   * Compress context information relating to zstd compression.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
  */
  opaque type mysql_zstd_compress_context = CStruct3[Ptr[ZSTD_CCtx], Ptr[ZSTD_DCtx], CUnsignedInt]
  object mysql_zstd_compress_context:
    given _tag: Tag[mysql_zstd_compress_context] = Tag.materializeCStruct3Tag[Ptr[ZSTD_CCtx], Ptr[ZSTD_DCtx], CUnsignedInt]
    def apply()(using Zone): Ptr[mysql_zstd_compress_context] = scala.scalanative.unsafe.alloc[mysql_zstd_compress_context](1)
    def apply(cctx : Ptr[ZSTD_CCtx], dctx : Ptr[ZSTD_DCtx], compression_level : CUnsignedInt)(using Zone): Ptr[mysql_zstd_compress_context] = 
      val ____ptr = apply()
      (!____ptr).cctx = cctx
      (!____ptr).dctx = dctx
      (!____ptr).compression_level = compression_level
      ____ptr
    extension (struct: mysql_zstd_compress_context)
      def cctx : Ptr[ZSTD_CCtx] = struct._1
      def cctx_=(value: Ptr[ZSTD_CCtx]): Unit = !struct.at1 = value
      def dctx : Ptr[ZSTD_DCtx] = struct._2
      def dctx_=(value: Ptr[ZSTD_DCtx]): Unit = !struct.at2 = value
      def compression_level : CUnsignedInt = struct._3
      def compression_level_=(value: CUnsignedInt): Unit = !struct.at3 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  opaque type rand_struct = CStruct4[CUnsignedLongInt, CUnsignedLongInt, CUnsignedLongInt, Double]
  object rand_struct:
    given _tag: Tag[rand_struct] = Tag.materializeCStruct4Tag[CUnsignedLongInt, CUnsignedLongInt, CUnsignedLongInt, Double]
    def apply()(using Zone): Ptr[rand_struct] = scala.scalanative.unsafe.alloc[rand_struct](1)
    def apply(seed1 : CUnsignedLongInt, seed2 : CUnsignedLongInt, max_value : CUnsignedLongInt, max_value_dbl : Double)(using Zone): Ptr[rand_struct] = 
      val ____ptr = apply()
      (!____ptr).seed1 = seed1
      (!____ptr).seed2 = seed2
      (!____ptr).max_value = max_value
      (!____ptr).max_value_dbl = max_value_dbl
      ____ptr
    extension (struct: rand_struct)
      def seed1 : CUnsignedLongInt = struct._1
      def seed1_=(value: CUnsignedLongInt): Unit = !struct.at1 = value
      def seed2 : CUnsignedLongInt = struct._2
      def seed2_=(value: CUnsignedLongInt): Unit = !struct.at2 = value
      def max_value : CUnsignedLongInt = struct._3
      def max_value_=(value: CUnsignedLongInt): Unit = !struct.at3 = value
      def max_value_dbl : Double = struct._4
      def max_value_dbl_=(value: Double): Unit = !struct.at4 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/client_plugin.h
  */
  opaque type st_mysql_client_plugin = CStruct12[CInt, CUnsignedInt, CString, CString, CString, CArray[CUnsignedInt, Nat._3], CString, Ptr[Byte], CFuncPtr4[CString, size_t, CInt, va_list, CInt], CFuncPtr0[CInt], CFuncPtr2[CString, Ptr[Byte], CInt], CFuncPtr2[CString, Ptr[Byte], CInt]]
  object st_mysql_client_plugin:
    given _tag: Tag[st_mysql_client_plugin] = Tag.materializeCStruct12Tag[CInt, CUnsignedInt, CString, CString, CString, CArray[CUnsignedInt, Nat._3], CString, Ptr[Byte], CFuncPtr4[CString, size_t, CInt, va_list, CInt], CFuncPtr0[CInt], CFuncPtr2[CString, Ptr[Byte], CInt], CFuncPtr2[CString, Ptr[Byte], CInt]]
    def apply()(using Zone): Ptr[st_mysql_client_plugin] = scala.scalanative.unsafe.alloc[st_mysql_client_plugin](1)
    def apply(`type` : CInt, interface_version : CUnsignedInt, name : CString, author : CString, desc : CString, version : CArray[CUnsignedInt, Nat._3], license : CString, mysql_api : Ptr[Byte], init : CFuncPtr4[CString, size_t, CInt, va_list, CInt], deinit : CFuncPtr0[CInt], options : CFuncPtr2[CString, Ptr[Byte], CInt], get_options : CFuncPtr2[CString, Ptr[Byte], CInt])(using Zone): Ptr[st_mysql_client_plugin] = 
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).interface_version = interface_version
      (!____ptr).name = name
      (!____ptr).author = author
      (!____ptr).desc = desc
      (!____ptr).version = version
      (!____ptr).license = license
      (!____ptr).mysql_api = mysql_api
      (!____ptr).init = init
      (!____ptr).deinit = deinit
      (!____ptr).options = options
      (!____ptr).get_options = get_options
      ____ptr
    extension (struct: st_mysql_client_plugin)
      def `type` : CInt = struct._1
      def type_=(value: CInt): Unit = !struct.at1 = value
      def interface_version : CUnsignedInt = struct._2
      def interface_version_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def name : CString = struct._3
      def name_=(value: CString): Unit = !struct.at3 = value
      def author : CString = struct._4
      def author_=(value: CString): Unit = !struct.at4 = value
      def desc : CString = struct._5
      def desc_=(value: CString): Unit = !struct.at5 = value
      def version : CArray[CUnsignedInt, Nat._3] = struct._6
      def version_=(value: CArray[CUnsignedInt, Nat._3]): Unit = !struct.at6 = value
      def license : CString = struct._7
      def license_=(value: CString): Unit = !struct.at7 = value
      def mysql_api : Ptr[Byte] = struct._8
      def mysql_api_=(value: Ptr[Byte]): Unit = !struct.at8 = value
      def init : CFuncPtr4[CString, size_t, CInt, va_list, CInt] = struct._9
      def init_=(value: CFuncPtr4[CString, size_t, CInt, va_list, CInt]): Unit = !struct.at9 = value
      def deinit : CFuncPtr0[CInt] = struct._10
      def deinit_=(value: CFuncPtr0[CInt]): Unit = !struct.at10 = value
      def options : CFuncPtr2[CString, Ptr[Byte], CInt] = struct._11
      def options_=(value: CFuncPtr2[CString, Ptr[Byte], CInt]): Unit = !struct.at11 = value
      def get_options : CFuncPtr2[CString, Ptr[Byte], CInt] = struct._12
      def get_options_=(value: CFuncPtr2[CString, Ptr[Byte], CInt]): Unit = !struct.at12 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/client_plugin.h
  */
  opaque type st_mysql_client_plugin_AUTHENTICATION = CStruct14[CInt, CUnsignedInt, CString, CString, CString, CArray[CUnsignedInt, Nat._3], CString, Ptr[Byte], CFuncPtr4[CString, size_t, CInt, va_list, CInt], CFuncPtr0[CInt], CFuncPtr2[CString, Ptr[Byte], CInt], CFuncPtr2[CString, Ptr[Byte], CInt], CFuncPtr2[Ptr[Byte], Ptr[MYSQL], CInt], CFuncPtr3[Ptr[Byte], Ptr[MYSQL], Ptr[CInt], net_async_status]]
  object st_mysql_client_plugin_AUTHENTICATION:
    given _tag: Tag[st_mysql_client_plugin_AUTHENTICATION] = Tag.materializeCStruct14Tag[CInt, CUnsignedInt, CString, CString, CString, CArray[CUnsignedInt, Nat._3], CString, Ptr[Byte], CFuncPtr4[CString, size_t, CInt, va_list, CInt], CFuncPtr0[CInt], CFuncPtr2[CString, Ptr[Byte], CInt], CFuncPtr2[CString, Ptr[Byte], CInt], CFuncPtr2[Ptr[Byte], Ptr[MYSQL], CInt], CFuncPtr3[Ptr[Byte], Ptr[MYSQL], Ptr[CInt], net_async_status]]
    def apply()(using Zone): Ptr[st_mysql_client_plugin_AUTHENTICATION] = scala.scalanative.unsafe.alloc[st_mysql_client_plugin_AUTHENTICATION](1)
    def apply(`type` : CInt, interface_version : CUnsignedInt, name : CString, author : CString, desc : CString, version : CArray[CUnsignedInt, Nat._3], license : CString, mysql_api : Ptr[Byte], init : CFuncPtr4[CString, size_t, CInt, va_list, CInt], deinit : CFuncPtr0[CInt], options : CFuncPtr2[CString, Ptr[Byte], CInt], get_options : CFuncPtr2[CString, Ptr[Byte], CInt], authenticate_user : CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], CInt], authenticate_user_nonblocking : CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], Ptr[CInt], net_async_status])(using Zone): Ptr[st_mysql_client_plugin_AUTHENTICATION] = 
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).interface_version = interface_version
      (!____ptr).name = name
      (!____ptr).author = author
      (!____ptr).desc = desc
      (!____ptr).version = version
      (!____ptr).license = license
      (!____ptr).mysql_api = mysql_api
      (!____ptr).init = init
      (!____ptr).deinit = deinit
      (!____ptr).options = options
      (!____ptr).get_options = get_options
      (!____ptr).authenticate_user = authenticate_user
      (!____ptr).authenticate_user_nonblocking = authenticate_user_nonblocking
      ____ptr
    extension (struct: st_mysql_client_plugin_AUTHENTICATION)
      def `type` : CInt = struct._1
      def type_=(value: CInt): Unit = !struct.at1 = value
      def interface_version : CUnsignedInt = struct._2
      def interface_version_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def name : CString = struct._3
      def name_=(value: CString): Unit = !struct.at3 = value
      def author : CString = struct._4
      def author_=(value: CString): Unit = !struct.at4 = value
      def desc : CString = struct._5
      def desc_=(value: CString): Unit = !struct.at5 = value
      def version : CArray[CUnsignedInt, Nat._3] = struct._6
      def version_=(value: CArray[CUnsignedInt, Nat._3]): Unit = !struct.at6 = value
      def license : CString = struct._7
      def license_=(value: CString): Unit = !struct.at7 = value
      def mysql_api : Ptr[Byte] = struct._8
      def mysql_api_=(value: Ptr[Byte]): Unit = !struct.at8 = value
      def init : CFuncPtr4[CString, size_t, CInt, va_list, CInt] = struct._9
      def init_=(value: CFuncPtr4[CString, size_t, CInt, va_list, CInt]): Unit = !struct.at9 = value
      def deinit : CFuncPtr0[CInt] = struct._10
      def deinit_=(value: CFuncPtr0[CInt]): Unit = !struct.at10 = value
      def options : CFuncPtr2[CString, Ptr[Byte], CInt] = struct._11
      def options_=(value: CFuncPtr2[CString, Ptr[Byte], CInt]): Unit = !struct.at11 = value
      def get_options : CFuncPtr2[CString, Ptr[Byte], CInt] = struct._12
      def get_options_=(value: CFuncPtr2[CString, Ptr[Byte], CInt]): Unit = !struct.at12 = value
      def authenticate_user : CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], CInt] = struct._13.asInstanceOf[CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], CInt]]
      def authenticate_user_=(value: CFuncPtr2[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], CInt]): Unit = !struct.at13 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[MYSQL], CInt]]
      def authenticate_user_nonblocking : CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], Ptr[CInt], net_async_status] = struct._14.asInstanceOf[CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], Ptr[CInt], net_async_status]]
      def authenticate_user_nonblocking_=(value: CFuncPtr3[Ptr[MYSQL_PLUGIN_VIO], Ptr[MYSQL], Ptr[CInt], net_async_status]): Unit = !struct.at14 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], Ptr[MYSQL], Ptr[CInt], net_async_status]]

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type st_mysql_options = CArray[CChar, Nat.Digit3[Nat._2, Nat._4, Nat._0]]
  object st_mysql_options:
    /**
     * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
    */
    opaque type Struct0 = CStruct0
    object Struct0:
      given _tag: Tag[Struct0] = Tag.materializeCStruct0Tag
    given _tag: Tag[st_mysql_options] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._4, Nat._0]](Tag.Byte, Tag.Digit3[Nat._2, Nat._4, Nat._0](Tag.Nat2, Tag.Nat4, Tag.Nat0))
    def apply()(using Zone): Ptr[st_mysql_options] = scala.scalanative.unsafe.alloc[st_mysql_options](1)
    def apply(connect_timeout : CUnsignedInt, read_timeout : CUnsignedInt, write_timeout : CUnsignedInt, port : CUnsignedInt, protocol : CUnsignedInt, client_flag : CUnsignedLongInt, host : CString, user : CString, password : CString, unix_socket : CString, db : CString, init_commands : Ptr[Init_commands_array], my_cnf_file : CString, my_cnf_group : CString, charset_dir : CString, charset_name : CString, ssl_key : CString, ssl_cert : CString, ssl_ca : CString, ssl_capath : CString, ssl_cipher : CString, shared_memory_base_name : CString, max_allowed_packet : CUnsignedLongInt, compress : Boolean, named_pipe : Boolean, bind_address : CString, report_data_truncation : Boolean, local_infile_init : CFuncPtr3[Ptr[Ptr[Byte]], CString, Ptr[Byte], CInt], local_infile_read : CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt], local_infile_end : CFuncPtr1[Ptr[Byte], Unit], local_infile_error : CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt], local_infile_userdata : Ptr[Byte], extension : Ptr[st_mysql_options_extention])(using Zone): Ptr[st_mysql_options] = 
      val ____ptr = apply()
      (!____ptr).connect_timeout = connect_timeout
      (!____ptr).read_timeout = read_timeout
      (!____ptr).write_timeout = write_timeout
      (!____ptr).port = port
      (!____ptr).protocol = protocol
      (!____ptr).client_flag = client_flag
      (!____ptr).host = host
      (!____ptr).user = user
      (!____ptr).password = password
      (!____ptr).unix_socket = unix_socket
      (!____ptr).db = db
      (!____ptr).init_commands = init_commands
      (!____ptr).my_cnf_file = my_cnf_file
      (!____ptr).my_cnf_group = my_cnf_group
      (!____ptr).charset_dir = charset_dir
      (!____ptr).charset_name = charset_name
      (!____ptr).ssl_key = ssl_key
      (!____ptr).ssl_cert = ssl_cert
      (!____ptr).ssl_ca = ssl_ca
      (!____ptr).ssl_capath = ssl_capath
      (!____ptr).ssl_cipher = ssl_cipher
      (!____ptr).shared_memory_base_name = shared_memory_base_name
      (!____ptr).max_allowed_packet = max_allowed_packet
      (!____ptr).compress = compress
      (!____ptr).named_pipe = named_pipe
      (!____ptr).bind_address = bind_address
      (!____ptr).report_data_truncation = report_data_truncation
      (!____ptr).local_infile_init = local_infile_init
      (!____ptr).local_infile_read = local_infile_read
      (!____ptr).local_infile_end = local_infile_end
      (!____ptr).local_infile_error = local_infile_error
      (!____ptr).local_infile_userdata = local_infile_userdata
      (!____ptr).extension = extension
      ____ptr
    extension (struct: st_mysql_options)
      def connect_timeout: CUnsignedInt = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]]
      def connect_timeout_=(value: CUnsignedInt): Unit = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]] = value
      def read_timeout: CUnsignedInt = !struct.at(4).asInstanceOf[Ptr[CUnsignedInt]]
      def read_timeout_=(value: CUnsignedInt): Unit = !struct.at(4).asInstanceOf[Ptr[CUnsignedInt]] = value
      def write_timeout: CUnsignedInt = !struct.at(8).asInstanceOf[Ptr[CUnsignedInt]]
      def write_timeout_=(value: CUnsignedInt): Unit = !struct.at(8).asInstanceOf[Ptr[CUnsignedInt]] = value
      def port: CUnsignedInt = !struct.at(12).asInstanceOf[Ptr[CUnsignedInt]]
      def port_=(value: CUnsignedInt): Unit = !struct.at(12).asInstanceOf[Ptr[CUnsignedInt]] = value
      def protocol: CUnsignedInt = !struct.at(16).asInstanceOf[Ptr[CUnsignedInt]]
      def protocol_=(value: CUnsignedInt): Unit = !struct.at(16).asInstanceOf[Ptr[CUnsignedInt]] = value
      def client_flag: CUnsignedLongInt = !struct.at(24).asInstanceOf[Ptr[CUnsignedLongInt]]
      def client_flag_=(value: CUnsignedLongInt): Unit = !struct.at(24).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def host: CString = !struct.at(32).asInstanceOf[Ptr[CString]]
      def host_=(value: CString): Unit = !struct.at(32).asInstanceOf[Ptr[CString]] = value
      def user: CString = !struct.at(40).asInstanceOf[Ptr[CString]]
      def user_=(value: CString): Unit = !struct.at(40).asInstanceOf[Ptr[CString]] = value
      def password: CString = !struct.at(48).asInstanceOf[Ptr[CString]]
      def password_=(value: CString): Unit = !struct.at(48).asInstanceOf[Ptr[CString]] = value
      def unix_socket: CString = !struct.at(56).asInstanceOf[Ptr[CString]]
      def unix_socket_=(value: CString): Unit = !struct.at(56).asInstanceOf[Ptr[CString]] = value
      def db: CString = !struct.at(64).asInstanceOf[Ptr[CString]]
      def db_=(value: CString): Unit = !struct.at(64).asInstanceOf[Ptr[CString]] = value
      def init_commands: Ptr[Init_commands_array] = !struct.at(72).asInstanceOf[Ptr[Ptr[Init_commands_array]]]
      def init_commands_=(value: Ptr[Init_commands_array]): Unit = !struct.at(72).asInstanceOf[Ptr[Ptr[Init_commands_array]]] = value
      def my_cnf_file: CString = !struct.at(80).asInstanceOf[Ptr[CString]]
      def my_cnf_file_=(value: CString): Unit = !struct.at(80).asInstanceOf[Ptr[CString]] = value
      def my_cnf_group: CString = !struct.at(88).asInstanceOf[Ptr[CString]]
      def my_cnf_group_=(value: CString): Unit = !struct.at(88).asInstanceOf[Ptr[CString]] = value
      def charset_dir: CString = !struct.at(96).asInstanceOf[Ptr[CString]]
      def charset_dir_=(value: CString): Unit = !struct.at(96).asInstanceOf[Ptr[CString]] = value
      def charset_name: CString = !struct.at(104).asInstanceOf[Ptr[CString]]
      def charset_name_=(value: CString): Unit = !struct.at(104).asInstanceOf[Ptr[CString]] = value
      def ssl_key: CString = !struct.at(112).asInstanceOf[Ptr[CString]]
      def ssl_key_=(value: CString): Unit = !struct.at(112).asInstanceOf[Ptr[CString]] = value
      def ssl_cert: CString = !struct.at(120).asInstanceOf[Ptr[CString]]
      def ssl_cert_=(value: CString): Unit = !struct.at(120).asInstanceOf[Ptr[CString]] = value
      def ssl_ca: CString = !struct.at(128).asInstanceOf[Ptr[CString]]
      def ssl_ca_=(value: CString): Unit = !struct.at(128).asInstanceOf[Ptr[CString]] = value
      def ssl_capath: CString = !struct.at(136).asInstanceOf[Ptr[CString]]
      def ssl_capath_=(value: CString): Unit = !struct.at(136).asInstanceOf[Ptr[CString]] = value
      def ssl_cipher: CString = !struct.at(144).asInstanceOf[Ptr[CString]]
      def ssl_cipher_=(value: CString): Unit = !struct.at(144).asInstanceOf[Ptr[CString]] = value
      def shared_memory_base_name: CString = !struct.at(152).asInstanceOf[Ptr[CString]]
      def shared_memory_base_name_=(value: CString): Unit = !struct.at(152).asInstanceOf[Ptr[CString]] = value
      def max_allowed_packet: CUnsignedLongInt = !struct.at(160).asInstanceOf[Ptr[CUnsignedLongInt]]
      def max_allowed_packet_=(value: CUnsignedLongInt): Unit = !struct.at(160).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def compress: Boolean = !struct.at(168).asInstanceOf[Ptr[Boolean]]
      def compress_=(value: Boolean): Unit = !struct.at(168).asInstanceOf[Ptr[Boolean]] = value
      def named_pipe: Boolean = !struct.at(169).asInstanceOf[Ptr[Boolean]]
      def named_pipe_=(value: Boolean): Unit = !struct.at(169).asInstanceOf[Ptr[Boolean]] = value
      def bind_address: CString = !struct.at(176).asInstanceOf[Ptr[CString]]
      def bind_address_=(value: CString): Unit = !struct.at(176).asInstanceOf[Ptr[CString]] = value
      def report_data_truncation: Boolean = !struct.at(184).asInstanceOf[Ptr[Boolean]]
      def report_data_truncation_=(value: Boolean): Unit = !struct.at(184).asInstanceOf[Ptr[Boolean]] = value
      def local_infile_init: CFuncPtr3[Ptr[Ptr[Byte]], CString, Ptr[Byte], CInt] = !struct.at(192).asInstanceOf[Ptr[CFuncPtr3[Ptr[Ptr[Byte]], CString, Ptr[Byte], CInt]]]
      def local_infile_init_=(value: CFuncPtr3[Ptr[Ptr[Byte]], CString, Ptr[Byte], CInt]): Unit = !struct.at(192).asInstanceOf[Ptr[CFuncPtr3[Ptr[Ptr[Byte]], CString, Ptr[Byte], CInt]]] = value
      def local_infile_read: CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt] = !struct.at(200).asInstanceOf[Ptr[CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt]]]
      def local_infile_read_=(value: CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt]): Unit = !struct.at(200).asInstanceOf[Ptr[CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt]]] = value
      def local_infile_end: CFuncPtr1[Ptr[Byte], Unit] = !struct.at(208).asInstanceOf[Ptr[CFuncPtr1[Ptr[Byte], Unit]]]
      def local_infile_end_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = !struct.at(208).asInstanceOf[Ptr[CFuncPtr1[Ptr[Byte], Unit]]] = value
      def local_infile_error: CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt] = !struct.at(216).asInstanceOf[Ptr[CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt]]]
      def local_infile_error_=(value: CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt]): Unit = !struct.at(216).asInstanceOf[Ptr[CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt]]] = value
      def local_infile_userdata: Ptr[Byte] = !struct.at(224).asInstanceOf[Ptr[Ptr[Byte]]]
      def local_infile_userdata_=(value: Ptr[Byte]): Unit = !struct.at(224).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def extension: Ptr[st_mysql_options_extention] = !struct.at(232).asInstanceOf[Ptr[Ptr[st_mysql_options_extention]]]
      def extension_=(value: Ptr[st_mysql_options_extention]): Unit = !struct.at(232).asInstanceOf[Ptr[Ptr[st_mysql_options_extention]]] = value

  /**
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  opaque type st_mysql_options_extention = CStruct0
  object st_mysql_options_extention:
    given _tag: Tag[st_mysql_options_extention] = Tag.materializeCStruct0Tag

@link("mysqlclient")
@extern
private[libmysql] object extern_functions:
  import _root_.libmysql.enumerations.*
  import _root_.libmysql.predef.*
  import _root_.libmysql.aliases.*
  import _root_.libmysql.structs.*
  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/errmsg.h
  */
  def ER_CLIENT(client_errno : CInt): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def check_scramble(reply : Ptr[CUnsignedChar], message : CString, hash_stage2 : Ptr[CUnsignedChar]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def check_scramble_323(reply : Ptr[CUnsignedChar], message : CString, salt : Ptr[CUnsignedLongInt]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def create_random_string(to : CString, length : CUnsignedInt, rand_st : Ptr[rand_struct]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/errmsg.h
  */
  def finish_client_errs(): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def generate_sha256_scramble(dst : Ptr[CUnsignedChar], dst_size : size_t, src : CString, src_size : size_t, rnd : CString, rnd_size : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def get_salt_from_password(res : Ptr[CUnsignedChar], password : CString): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def get_salt_from_password_323(res : Ptr[CUnsignedLongInt], password : CString): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def get_tty_password(opt_message : CString): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def hash_password(to : Ptr[CUnsignedLongInt], password : CString, password_len : CUnsignedInt): Unit = extern

  /**
   * Error messages for MySQL clients. These are constant and use the CR_ prefix. <mysqlclient_ername.h> will contain auto-generated mappings containing the symbolic name and the number from this file, and the english error messages in libmysql/errmsg.c.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/errmsg.h
  */
  def init_client_errs(): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_list.h
  */
  def list_add(root : Ptr[LIST], element : Ptr[LIST]): Ptr[LIST] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_list.h
  */
  def list_cons(data : Ptr[Byte], root : Ptr[LIST]): Ptr[LIST] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_list.h
  */
  def list_delete(root : Ptr[LIST], element : Ptr[LIST]): Ptr[LIST] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_list.h
  */
  def list_free(root : Ptr[LIST], free_data : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_list.h
  */
  def list_length(_0 : Ptr[LIST]): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_list.h
  */
  def list_reverse(root : Ptr[LIST]): Ptr[LIST] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_list.h
  */
  def list_walk(_0 : Ptr[LIST], action : list_walk_action, argument : Ptr[CUnsignedChar]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def make_password_from_salt(to : CString, hash_stage2 : Ptr[CUnsignedChar]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def make_password_from_salt_323(to : CString, salt : Ptr[CUnsignedLongInt]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def make_scrambled_password(to : CString, password : CString): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def make_scrambled_password_323(to : CString, password : CString): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def my_net_init(net : Ptr[NET], vio : Ptr[Vio]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def my_net_local_init(net : Ptr[NET]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def my_net_read(net : Ptr[NET]): CUnsignedLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def my_net_set_read_timeout(net : Ptr[NET], timeout : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def my_net_set_retry_count(net : Ptr[NET], retry_count : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def my_net_set_write_timeout(net : Ptr[NET], timeout : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def my_net_write(net : Ptr[NET], packet : Ptr[CUnsignedChar], len : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def my_rnd(_0 : Ptr[rand_struct]): Double = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def my_thread_end(): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def my_thread_init(): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def myodbc_remove_escape(mysql : Ptr[MYSQL], name : CString): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_affected_rows(mysql : Ptr[MYSQL]): uint64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_autocommit(mysql : Ptr[MYSQL], auto_mode : Boolean): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_bind_param(mysql : Ptr[MYSQL], n_params : CUnsignedInt, binds : Ptr[MYSQL_BIND], names : Ptr[CString]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_binlog_close(mysql : Ptr[MYSQL], rpl : Ptr[MYSQL_RPL]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_binlog_fetch(mysql : Ptr[MYSQL], rpl : Ptr[MYSQL_RPL]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_binlog_open(mysql : Ptr[MYSQL], rpl : Ptr[MYSQL_RPL]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_change_user(mysql : Ptr[MYSQL], user : CString, passwd : CString, db : CString): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_character_set_name(mysql : Ptr[MYSQL]): CString = extern

  /**
   * finds an already loaded plugin by name, or loads it, if necessary
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/client_plugin.h
  */
  def mysql_client_find_plugin(mysql : Ptr[MYSQL], name : CString, `type` : CInt): Ptr[st_mysql_client_plugin] = extern

  /**
   * adds a plugin structure to the list of loaded plugins
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/client_plugin.h
  */
  def mysql_client_register_plugin(mysql : Ptr[MYSQL], plugin : Ptr[st_mysql_client_plugin]): Ptr[st_mysql_client_plugin] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_close(sock : Ptr[MYSQL]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_commit(mysql : Ptr[MYSQL]): Boolean = extern

  /**
   * Deinitialize the compression context allocated.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
  */
  def mysql_compress_context_deinit(mysql_compress_ctx : Ptr[mysql_compress_context]): Unit = extern

  /**
   * Initialize a compress context object to be associated with a NET object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
  */
  def mysql_compress_context_init(cmp_ctx : Ptr[mysql_compress_context], algorithm : enum_compression_algorithm, compression_level : CUnsignedInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_data_seek(result : Ptr[MYSQL_RES], offset : uint64_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_debug(debug : CString): Unit = extern

  /**
   * Get default compression level corresponding to a given compression method.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/my_compress.h
  */
  def mysql_default_compression_level(algorithm : enum_compression_algorithm): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_dump_debug_info(mysql : Ptr[MYSQL]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_eof(res : Ptr[MYSQL_RES]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_errno(mysql : Ptr[MYSQL]): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def mysql_errno_to_sqlstate(mysql_errno : CUnsignedInt): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_error(mysql : Ptr[MYSQL]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_escape_string(to : CString, from : CString, from_length : CUnsignedLongInt): CUnsignedLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_fetch_field(result : Ptr[MYSQL_RES]): Ptr[MYSQL_FIELD] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_fetch_field_direct(res : Ptr[MYSQL_RES], fieldnr : CUnsignedInt): Ptr[MYSQL_FIELD] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_fetch_fields(res : Ptr[MYSQL_RES]): Ptr[MYSQL_FIELD] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_fetch_lengths(result : Ptr[MYSQL_RES]): Ptr[CUnsignedLongInt] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_fetch_row(result : Ptr[MYSQL_RES]): MYSQL_ROW = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_fetch_row_nonblocking(res : Ptr[MYSQL_RES], row : Ptr[MYSQL_ROW]): net_async_status = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_field_count(mysql : Ptr[MYSQL]): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_field_seek(result : Ptr[MYSQL_RES], offset : MYSQL_FIELD_OFFSET): MYSQL_FIELD_OFFSET = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_field_tell(res : Ptr[MYSQL_RES]): MYSQL_FIELD_OFFSET = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_free_result(result : Ptr[MYSQL_RES]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_free_result_nonblocking(result : Ptr[MYSQL_RES]): net_async_status = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_free_ssl_session_data(mysql : Ptr[MYSQL], data : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_get_character_set_info(mysql : Ptr[MYSQL], charset : Ptr[MY_CHARSET_INFO]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_get_client_info(): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_get_client_version(): CUnsignedLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_get_host_info(mysql : Ptr[MYSQL]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_get_option(mysql : Ptr[MYSQL], option : mysql_option, arg : Ptr[Byte]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_get_proto_info(mysql : Ptr[MYSQL]): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_get_server_info(mysql : Ptr[MYSQL]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_get_server_version(mysql : Ptr[MYSQL]): CUnsignedLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_get_ssl_cipher(mysql : Ptr[MYSQL]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_get_ssl_session_data(mysql : Ptr[MYSQL], n_ticket : CUnsignedInt, out_len : Ptr[CUnsignedInt]): Ptr[Byte] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_get_ssl_session_reused(mysql : Ptr[MYSQL]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_hex_string(to : CString, from : CString, from_length : CUnsignedLongInt): CUnsignedLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_info(mysql : Ptr[MYSQL]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_init(mysql : Ptr[MYSQL]): Ptr[MYSQL] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_insert_id(mysql : Ptr[MYSQL]): uint64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_kill(mysql : Ptr[MYSQL], pid : CUnsignedLongInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_list_dbs(mysql : Ptr[MYSQL], wild : CString): Ptr[MYSQL_RES] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_list_fields(mysql : Ptr[MYSQL], table : CString, wild : CString): Ptr[MYSQL_RES] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_list_processes(mysql : Ptr[MYSQL]): Ptr[MYSQL_RES] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_list_tables(mysql : Ptr[MYSQL], wild : CString): Ptr[MYSQL_RES] = extern

  /**
   * loads a plugin and initializes it
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/client_plugin.h
  */
  def mysql_load_plugin(mysql : Ptr[MYSQL], name : CString, `type` : CInt, argc : CInt, rest: Any*): Ptr[st_mysql_client_plugin] = extern

  /**
   * loads a plugin and initializes it, taking va_list as an argument
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/client_plugin.h
  */
  def mysql_load_plugin_v(mysql : Ptr[MYSQL], name : CString, `type` : CInt, argc : CInt, args : va_list): Ptr[st_mysql_client_plugin] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_more_results(mysql : Ptr[MYSQL]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_next_result(mysql : Ptr[MYSQL]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_next_result_nonblocking(mysql : Ptr[MYSQL]): net_async_status = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_num_fields(res : Ptr[MYSQL_RES]): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_num_rows(res : Ptr[MYSQL_RES]): uint64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_options(mysql : Ptr[MYSQL], option : mysql_option, arg : Ptr[Byte]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_options4(mysql : Ptr[MYSQL], option : mysql_option, arg1 : Ptr[Byte], arg2 : Ptr[Byte]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_ping(mysql : Ptr[MYSQL]): CInt = extern

  /**
   * get plugin options
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/client_plugin.h
  */
  def mysql_plugin_get_option(plugin : Ptr[st_mysql_client_plugin], option : CString, value : Ptr[Byte]): CInt = extern

  /**
   * set plugin options
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql/client_plugin.h
  */
  def mysql_plugin_options(plugin : Ptr[st_mysql_client_plugin], option : CString, value : Ptr[Byte]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_query(mysql : Ptr[MYSQL], q : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_read_query_result(mysql : Ptr[MYSQL]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_real_connect(mysql : Ptr[MYSQL], host : CString, user : CString, passwd : CString, db : CString, port : CUnsignedInt, unix_socket : CString, clientflag : CUnsignedLongInt): Ptr[MYSQL] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_real_connect_dns_srv(mysql : Ptr[MYSQL], dns_srv_name : CString, user : CString, passwd : CString, db : CString, client_flag : CUnsignedLongInt): Ptr[MYSQL] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_real_connect_nonblocking(mysql : Ptr[MYSQL], host : CString, user : CString, passwd : CString, db : CString, port : CUnsignedInt, unix_socket : CString, clientflag : CUnsignedLongInt): net_async_status = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_real_escape_string(mysql : Ptr[MYSQL], to : CString, from : CString, length : CUnsignedLongInt): CUnsignedLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_real_escape_string_quote(mysql : Ptr[MYSQL], to : CString, from : CString, length : CUnsignedLongInt, quote : CChar): CUnsignedLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_real_query(mysql : Ptr[MYSQL], q : CString, length : CUnsignedLongInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_real_query_nonblocking(mysql : Ptr[MYSQL], query : CString, length : CUnsignedLongInt): net_async_status = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_refresh(mysql : Ptr[MYSQL], refresh_options : CUnsignedInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_reset_connection(mysql : Ptr[MYSQL]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_reset_server_public_key(): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_result_metadata(result : Ptr[MYSQL_RES]): enum_resultset_metadata = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_rollback(mysql : Ptr[MYSQL]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_row_seek(result : Ptr[MYSQL_RES], offset : MYSQL_ROW_OFFSET): MYSQL_ROW_OFFSET = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_row_tell(res : Ptr[MYSQL_RES]): MYSQL_ROW_OFFSET = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_select_db(mysql : Ptr[MYSQL], db : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_select_db_nonblocking(mysql : Ptr[MYSQL], db : CString, error : Ptr[Boolean]): net_async_status = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_send_query(mysql : Ptr[MYSQL], q : CString, length : CUnsignedLongInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_send_query_nonblocking(mysql : Ptr[MYSQL], query : CString, length : CUnsignedLongInt): net_async_status = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_server_end(): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_server_init(argc : CInt, argv : Ptr[CString], groups : Ptr[CString]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_session_track_get_first(mysql : Ptr[MYSQL], `type` : enum_session_state_type, data : Ptr[CString], length : Ptr[size_t]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_session_track_get_next(mysql : Ptr[MYSQL], `type` : enum_session_state_type, data : Ptr[CString], length : Ptr[size_t]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_set_character_set(mysql : Ptr[MYSQL], csname : CString): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_set_local_infile_default(mysql : Ptr[MYSQL]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_set_local_infile_handler(mysql : Ptr[MYSQL], local_infile_init : CFuncPtr3[Ptr[Ptr[Byte]], CString, Ptr[Byte], CInt], local_infile_read : CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt], local_infile_end : CFuncPtr1[Ptr[Byte], Unit], local_infile_error : CFuncPtr3[Ptr[Byte], CString, CUnsignedInt, CInt], _5 : Ptr[Byte]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_set_server_option(mysql : Ptr[MYSQL], option : enum_mysql_set_option): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_shutdown(mysql : Ptr[MYSQL], shutdown_level : mysql_enum_shutdown_level): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_sqlstate(mysql : Ptr[MYSQL]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_ssl_set(mysql : Ptr[MYSQL], key : CString, cert : CString, ca : CString, capath : CString, cipher : CString): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stat(mysql : Ptr[MYSQL]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_affected_rows(stmt : Ptr[MYSQL_STMT]): uint64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_attr_get(stmt : Ptr[MYSQL_STMT], attr_type : enum_stmt_attr_type, attr : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_attr_set(stmt : Ptr[MYSQL_STMT], attr_type : enum_stmt_attr_type, attr : Ptr[Byte]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_bind_param(stmt : Ptr[MYSQL_STMT], bnd : Ptr[MYSQL_BIND]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_bind_result(stmt : Ptr[MYSQL_STMT], bnd : Ptr[MYSQL_BIND]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_close(stmt : Ptr[MYSQL_STMT]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_data_seek(stmt : Ptr[MYSQL_STMT], offset : uint64_t): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_errno(stmt : Ptr[MYSQL_STMT]): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_error(stmt : Ptr[MYSQL_STMT]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_execute(stmt : Ptr[MYSQL_STMT]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_fetch(stmt : Ptr[MYSQL_STMT]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_fetch_column(stmt : Ptr[MYSQL_STMT], bind_arg : Ptr[MYSQL_BIND], column : CUnsignedInt, offset : CUnsignedLongInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_field_count(stmt : Ptr[MYSQL_STMT]): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_free_result(stmt : Ptr[MYSQL_STMT]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_init(mysql : Ptr[MYSQL]): Ptr[MYSQL_STMT] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_insert_id(stmt : Ptr[MYSQL_STMT]): uint64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_next_result(stmt : Ptr[MYSQL_STMT]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_num_rows(stmt : Ptr[MYSQL_STMT]): uint64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_param_count(stmt : Ptr[MYSQL_STMT]): CUnsignedLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_param_metadata(stmt : Ptr[MYSQL_STMT]): Ptr[MYSQL_RES] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_prepare(stmt : Ptr[MYSQL_STMT], query : CString, length : CUnsignedLongInt): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_reset(stmt : Ptr[MYSQL_STMT]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_result_metadata(stmt : Ptr[MYSQL_STMT]): Ptr[MYSQL_RES] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_row_seek(stmt : Ptr[MYSQL_STMT], offset : MYSQL_ROW_OFFSET): MYSQL_ROW_OFFSET = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_row_tell(stmt : Ptr[MYSQL_STMT]): MYSQL_ROW_OFFSET = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_send_long_data(stmt : Ptr[MYSQL_STMT], param_number : CUnsignedInt, data : CString, length : CUnsignedLongInt): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_sqlstate(stmt : Ptr[MYSQL_STMT]): CString = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_stmt_store_result(stmt : Ptr[MYSQL_STMT]): CInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_store_result(mysql : Ptr[MYSQL]): Ptr[MYSQL_RES] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_store_result_nonblocking(mysql : Ptr[MYSQL], result : Ptr[Ptr[MYSQL_RES]]): net_async_status = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_thread_end(): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_thread_id(mysql : Ptr[MYSQL]): CUnsignedLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_thread_init(): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_thread_safe(): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_use_result(mysql : Ptr[MYSQL]): Ptr[MYSQL_RES] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql.h
  */
  def mysql_warning_count(mysql : Ptr[MYSQL]): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_claim_memory_ownership(net : Ptr[NET], claim : Boolean): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_clear(net : Ptr[NET], check_buffer : Boolean): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_end(net : Ptr[NET]): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_field_length(packet : Ptr[Ptr[CUnsignedChar]]): CUnsignedLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_field_length_checked(packet : Ptr[Ptr[CUnsignedChar]], max_length : CUnsignedLongInt): CUnsignedLongInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_field_length_ll(packet : Ptr[Ptr[CUnsignedChar]]): uint64_t = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_field_length_size(pos : Ptr[CUnsignedChar]): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_flush(net : Ptr[NET]): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_length_size(num : CUnsignedLongLong): CUnsignedInt = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_realloc(net : Ptr[NET], length : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_store_length(pkg : Ptr[CUnsignedChar], length : CUnsignedLongLong): Ptr[CUnsignedChar] = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_write_command(net : Ptr[NET], command : CUnsignedChar, header : Ptr[CUnsignedChar], head_len : size_t, packet : Ptr[CUnsignedChar], len : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def net_write_packet(net : Ptr[NET], packet : Ptr[CUnsignedChar], length : size_t): Boolean = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def octet2hex(to : CString, str : CString, len : CUnsignedInt): CString = extern

  /**
   * @}
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def randominit(_0 : Ptr[rand_struct], seed1 : CUnsignedLongInt, seed2 : CUnsignedLongInt): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def scramble(to : CString, message : CString, password : CString): Unit = extern

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/mysql/mysql_com.h
  */
  def scramble_323(to : CString, message : CString, password : CString): Unit = extern


object functions:
  import _root_.libmysql.enumerations.*
  import _root_.libmysql.predef.*
  import _root_.libmysql.aliases.*
  import _root_.libmysql.structs.*
  import extern_functions.*
  export extern_functions.*

object constants:
  val MYSQL_VIO_INVALID: CUnsignedInt = 0.toUInt
  val MYSQL_VIO_TCP: CUnsignedInt = 1.toUInt
  val MYSQL_VIO_SOCKET: CUnsignedInt = 2.toUInt
  val MYSQL_VIO_PIPE: CUnsignedInt = 3.toUInt
  val MYSQL_VIO_MEMORY: CUnsignedInt = 4.toUInt
  
object types:
  export _root_.libmysql.structs.*
  export _root_.libmysql.aliases.*
  export _root_.libmysql.enumerations.*

object all:
  export _root_.libmysql.enumerations.Item_result
  export _root_.libmysql.enumerations.Item_udftype
  export _root_.libmysql.enumerations.SERVER_STATUS_flags_enum
  export _root_.libmysql.enumerations.enum_compression_algorithm
  export _root_.libmysql.enumerations.enum_cursor_type
  export _root_.libmysql.enumerations.enum_field_types
  export _root_.libmysql.enumerations.enum_mysql_set_option
  export _root_.libmysql.enumerations.enum_mysql_stmt_state
  export _root_.libmysql.enumerations.enum_mysql_timestamp_type
  export _root_.libmysql.enumerations.enum_resultset_metadata
  export _root_.libmysql.enumerations.enum_server_command
  export _root_.libmysql.enumerations.enum_session_state_type
  export _root_.libmysql.enumerations.enum_stmt_attr_type
  export _root_.libmysql.enumerations.mysql_enum_shutdown_level
  export _root_.libmysql.enumerations.mysql_option
  export _root_.libmysql.enumerations.mysql_protocol_type
  export _root_.libmysql.enumerations.mysql_ssl_fips_mode
  export _root_.libmysql.enumerations.mysql_ssl_mode
  export _root_.libmysql.enumerations.mysql_status
  export _root_.libmysql.enumerations.net_async_status
  export _root_.libmysql.aliases.MYSQL_FIELD_OFFSET
  export _root_.libmysql.aliases.MYSQL_ROW
  export _root_.libmysql.aliases.MYSQL_ROW_OFFSET
  export _root_.libmysql.aliases.Udf_func_add
  export _root_.libmysql.aliases.Udf_func_any
  export _root_.libmysql.aliases.Udf_func_clear
  export _root_.libmysql.aliases.Udf_func_deinit
  export _root_.libmysql.aliases.Udf_func_double
  export _root_.libmysql.aliases.Udf_func_init
  export _root_.libmysql.aliases.Udf_func_longlong
  export _root_.libmysql.aliases.Udf_func_string
  export _root_.libmysql.aliases.list_walk_action
  export _root_.libmysql.aliases.my_socket
  export _root_.libmysql.aliases.my_ulonglong
  export _root_.libmysql.aliases.size_t
  export _root_.libmysql.aliases.uint64_t
  export _root_.libmysql.aliases.va_list
  export _root_.libmysql.structs.CHARSET_INFO
  export _root_.libmysql.structs.Init_commands_array
  export _root_.libmysql.structs.LIST
  export _root_.libmysql.structs.MEM_ROOT
  export _root_.libmysql.structs.MYSQL
  export _root_.libmysql.structs.MYSQL_BIND
  export _root_.libmysql.structs.MYSQL_DATA
  export _root_.libmysql.structs.MYSQL_FIELD
  export _root_.libmysql.structs.MYSQL_METHODS
  export _root_.libmysql.structs.MYSQL_PLUGIN_VIO
  export _root_.libmysql.structs.MYSQL_PLUGIN_VIO_INFO
  export _root_.libmysql.structs.MYSQL_RES
  export _root_.libmysql.structs.MYSQL_ROWS
  export _root_.libmysql.structs.MYSQL_RPL
  export _root_.libmysql.structs.MYSQL_STMT
  export _root_.libmysql.structs.MYSQL_STMT_EXT
  export _root_.libmysql.structs.MYSQL_TIME
  export _root_.libmysql.structs.MY_CHARSET_INFO
  export _root_.libmysql.structs.NET
  export _root_.libmysql.structs.UDF_ARGS
  export _root_.libmysql.structs.UDF_INIT
  export _root_.libmysql.structs.Vio
  export _root_.libmysql.structs.ZSTD_CCtx
  export _root_.libmysql.structs.ZSTD_CCtx_s
  export _root_.libmysql.structs.ZSTD_DCtx
  export _root_.libmysql.structs.ZSTD_DCtx_s
  export _root_.libmysql.structs.auth_plugin_t
  export _root_.libmysql.structs.character_set
  export _root_.libmysql.structs.mysql_compress_context
  export _root_.libmysql.structs.mysql_zlib_compress_context
  export _root_.libmysql.structs.mysql_zstd_compress_context
  export _root_.libmysql.structs.rand_struct
  export _root_.libmysql.structs.st_mysql_client_plugin
  export _root_.libmysql.structs.st_mysql_client_plugin_AUTHENTICATION
  export _root_.libmysql.structs.st_mysql_options
  export _root_.libmysql.structs.st_mysql_options_extention
  export _root_.libmysql.functions.ER_CLIENT
  export _root_.libmysql.functions.check_scramble
  export _root_.libmysql.functions.check_scramble_323
  export _root_.libmysql.functions.create_random_string
  export _root_.libmysql.functions.finish_client_errs
  export _root_.libmysql.functions.generate_sha256_scramble
  export _root_.libmysql.functions.get_salt_from_password
  export _root_.libmysql.functions.get_salt_from_password_323
  export _root_.libmysql.functions.get_tty_password
  export _root_.libmysql.functions.hash_password
  export _root_.libmysql.functions.init_client_errs
  export _root_.libmysql.functions.list_add
  export _root_.libmysql.functions.list_cons
  export _root_.libmysql.functions.list_delete
  export _root_.libmysql.functions.list_free
  export _root_.libmysql.functions.list_length
  export _root_.libmysql.functions.list_reverse
  export _root_.libmysql.functions.list_walk
  export _root_.libmysql.functions.make_password_from_salt
  export _root_.libmysql.functions.make_password_from_salt_323
  export _root_.libmysql.functions.make_scrambled_password
  export _root_.libmysql.functions.make_scrambled_password_323
  export _root_.libmysql.functions.my_net_init
  export _root_.libmysql.functions.my_net_local_init
  export _root_.libmysql.functions.my_net_read
  export _root_.libmysql.functions.my_net_set_read_timeout
  export _root_.libmysql.functions.my_net_set_retry_count
  export _root_.libmysql.functions.my_net_set_write_timeout
  export _root_.libmysql.functions.my_net_write
  export _root_.libmysql.functions.my_rnd
  export _root_.libmysql.functions.my_thread_end
  export _root_.libmysql.functions.my_thread_init
  export _root_.libmysql.functions.myodbc_remove_escape
  export _root_.libmysql.functions.mysql_affected_rows
  export _root_.libmysql.functions.mysql_autocommit
  export _root_.libmysql.functions.mysql_bind_param
  export _root_.libmysql.functions.mysql_binlog_close
  export _root_.libmysql.functions.mysql_binlog_fetch
  export _root_.libmysql.functions.mysql_binlog_open
  export _root_.libmysql.functions.mysql_change_user
  export _root_.libmysql.functions.mysql_character_set_name
  export _root_.libmysql.functions.mysql_client_find_plugin
  export _root_.libmysql.functions.mysql_client_register_plugin
  export _root_.libmysql.functions.mysql_close
  export _root_.libmysql.functions.mysql_commit
  export _root_.libmysql.functions.mysql_compress_context_deinit
  export _root_.libmysql.functions.mysql_compress_context_init
  export _root_.libmysql.functions.mysql_data_seek
  export _root_.libmysql.functions.mysql_debug
  export _root_.libmysql.functions.mysql_default_compression_level
  export _root_.libmysql.functions.mysql_dump_debug_info
  export _root_.libmysql.functions.mysql_eof
  export _root_.libmysql.functions.mysql_errno
  export _root_.libmysql.functions.mysql_errno_to_sqlstate
  export _root_.libmysql.functions.mysql_error
  export _root_.libmysql.functions.mysql_escape_string
  export _root_.libmysql.functions.mysql_fetch_field
  export _root_.libmysql.functions.mysql_fetch_field_direct
  export _root_.libmysql.functions.mysql_fetch_fields
  export _root_.libmysql.functions.mysql_fetch_lengths
  export _root_.libmysql.functions.mysql_fetch_row
  export _root_.libmysql.functions.mysql_fetch_row_nonblocking
  export _root_.libmysql.functions.mysql_field_count
  export _root_.libmysql.functions.mysql_field_seek
  export _root_.libmysql.functions.mysql_field_tell
  export _root_.libmysql.functions.mysql_free_result
  export _root_.libmysql.functions.mysql_free_result_nonblocking
  export _root_.libmysql.functions.mysql_free_ssl_session_data
  export _root_.libmysql.functions.mysql_get_character_set_info
  export _root_.libmysql.functions.mysql_get_client_info
  export _root_.libmysql.functions.mysql_get_client_version
  export _root_.libmysql.functions.mysql_get_host_info
  export _root_.libmysql.functions.mysql_get_option
  export _root_.libmysql.functions.mysql_get_proto_info
  export _root_.libmysql.functions.mysql_get_server_info
  export _root_.libmysql.functions.mysql_get_server_version
  export _root_.libmysql.functions.mysql_get_ssl_cipher
  export _root_.libmysql.functions.mysql_get_ssl_session_data
  export _root_.libmysql.functions.mysql_get_ssl_session_reused
  export _root_.libmysql.functions.mysql_hex_string
  export _root_.libmysql.functions.mysql_info
  export _root_.libmysql.functions.mysql_init
  export _root_.libmysql.functions.mysql_insert_id
  export _root_.libmysql.functions.mysql_kill
  export _root_.libmysql.functions.mysql_list_dbs
  export _root_.libmysql.functions.mysql_list_fields
  export _root_.libmysql.functions.mysql_list_processes
  export _root_.libmysql.functions.mysql_list_tables
  export _root_.libmysql.functions.mysql_load_plugin
  export _root_.libmysql.functions.mysql_load_plugin_v
  export _root_.libmysql.functions.mysql_more_results
  export _root_.libmysql.functions.mysql_next_result
  export _root_.libmysql.functions.mysql_next_result_nonblocking
  export _root_.libmysql.functions.mysql_num_fields
  export _root_.libmysql.functions.mysql_num_rows
  export _root_.libmysql.functions.mysql_options
  export _root_.libmysql.functions.mysql_options4
  export _root_.libmysql.functions.mysql_ping
  export _root_.libmysql.functions.mysql_plugin_get_option
  export _root_.libmysql.functions.mysql_plugin_options
  export _root_.libmysql.functions.mysql_query
  export _root_.libmysql.functions.mysql_read_query_result
  export _root_.libmysql.functions.mysql_real_connect
  export _root_.libmysql.functions.mysql_real_connect_dns_srv
  export _root_.libmysql.functions.mysql_real_connect_nonblocking
  export _root_.libmysql.functions.mysql_real_escape_string
  export _root_.libmysql.functions.mysql_real_escape_string_quote
  export _root_.libmysql.functions.mysql_real_query
  export _root_.libmysql.functions.mysql_real_query_nonblocking
  export _root_.libmysql.functions.mysql_refresh
  export _root_.libmysql.functions.mysql_reset_connection
  export _root_.libmysql.functions.mysql_reset_server_public_key
  export _root_.libmysql.functions.mysql_result_metadata
  export _root_.libmysql.functions.mysql_rollback
  export _root_.libmysql.functions.mysql_row_seek
  export _root_.libmysql.functions.mysql_row_tell
  export _root_.libmysql.functions.mysql_select_db
  export _root_.libmysql.functions.mysql_select_db_nonblocking
  export _root_.libmysql.functions.mysql_send_query
  export _root_.libmysql.functions.mysql_send_query_nonblocking
  export _root_.libmysql.functions.mysql_server_end
  export _root_.libmysql.functions.mysql_server_init
  export _root_.libmysql.functions.mysql_session_track_get_first
  export _root_.libmysql.functions.mysql_session_track_get_next
  export _root_.libmysql.functions.mysql_set_character_set
  export _root_.libmysql.functions.mysql_set_local_infile_default
  export _root_.libmysql.functions.mysql_set_local_infile_handler
  export _root_.libmysql.functions.mysql_set_server_option
  export _root_.libmysql.functions.mysql_shutdown
  export _root_.libmysql.functions.mysql_sqlstate
  export _root_.libmysql.functions.mysql_ssl_set
  export _root_.libmysql.functions.mysql_stat
  export _root_.libmysql.functions.mysql_stmt_affected_rows
  export _root_.libmysql.functions.mysql_stmt_attr_get
  export _root_.libmysql.functions.mysql_stmt_attr_set
  export _root_.libmysql.functions.mysql_stmt_bind_param
  export _root_.libmysql.functions.mysql_stmt_bind_result
  export _root_.libmysql.functions.mysql_stmt_close
  export _root_.libmysql.functions.mysql_stmt_data_seek
  export _root_.libmysql.functions.mysql_stmt_errno
  export _root_.libmysql.functions.mysql_stmt_error
  export _root_.libmysql.functions.mysql_stmt_execute
  export _root_.libmysql.functions.mysql_stmt_fetch
  export _root_.libmysql.functions.mysql_stmt_fetch_column
  export _root_.libmysql.functions.mysql_stmt_field_count
  export _root_.libmysql.functions.mysql_stmt_free_result
  export _root_.libmysql.functions.mysql_stmt_init
  export _root_.libmysql.functions.mysql_stmt_insert_id
  export _root_.libmysql.functions.mysql_stmt_next_result
  export _root_.libmysql.functions.mysql_stmt_num_rows
  export _root_.libmysql.functions.mysql_stmt_param_count
  export _root_.libmysql.functions.mysql_stmt_param_metadata
  export _root_.libmysql.functions.mysql_stmt_prepare
  export _root_.libmysql.functions.mysql_stmt_reset
  export _root_.libmysql.functions.mysql_stmt_result_metadata
  export _root_.libmysql.functions.mysql_stmt_row_seek
  export _root_.libmysql.functions.mysql_stmt_row_tell
  export _root_.libmysql.functions.mysql_stmt_send_long_data
  export _root_.libmysql.functions.mysql_stmt_sqlstate
  export _root_.libmysql.functions.mysql_stmt_store_result
  export _root_.libmysql.functions.mysql_store_result
  export _root_.libmysql.functions.mysql_store_result_nonblocking
  export _root_.libmysql.functions.mysql_thread_end
  export _root_.libmysql.functions.mysql_thread_id
  export _root_.libmysql.functions.mysql_thread_init
  export _root_.libmysql.functions.mysql_thread_safe
  export _root_.libmysql.functions.mysql_use_result
  export _root_.libmysql.functions.mysql_warning_count
  export _root_.libmysql.functions.net_claim_memory_ownership
  export _root_.libmysql.functions.net_clear
  export _root_.libmysql.functions.net_end
  export _root_.libmysql.functions.net_field_length
  export _root_.libmysql.functions.net_field_length_checked
  export _root_.libmysql.functions.net_field_length_ll
  export _root_.libmysql.functions.net_field_length_size
  export _root_.libmysql.functions.net_flush
  export _root_.libmysql.functions.net_length_size
  export _root_.libmysql.functions.net_realloc
  export _root_.libmysql.functions.net_store_length
  export _root_.libmysql.functions.net_write_command
  export _root_.libmysql.functions.net_write_packet
  export _root_.libmysql.functions.octet2hex
  export _root_.libmysql.functions.randominit
  export _root_.libmysql.functions.scramble
  export _root_.libmysql.functions.scramble_323
