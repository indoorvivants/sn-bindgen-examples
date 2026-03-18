package duckdb

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
    private[duckdb] trait _BindgenEnumCUnsignedInt[T](using eq: T =:= CUnsignedInt):
      given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
      extension (inline t: T)
        inline def value: CUnsignedInt = t.asInstanceOf[CUnsignedInt]
        inline def int: CInt = value.toInt
        inline def uint: CUnsignedInt = value


object enumerations:
  import predef.*
  /**
   * An enum over DuckDB's internal types.
  */
  opaque type DUCKDB_TYPE = CUnsignedInt
  object DUCKDB_TYPE extends _BindgenEnumCUnsignedInt[DUCKDB_TYPE]:
    given _tag: Tag[DUCKDB_TYPE] = Tag.UInt
    inline def define(inline a: Long): DUCKDB_TYPE = a.toUInt
    val DUCKDB_TYPE_INVALID = define(0)
    val DUCKDB_TYPE_BOOLEAN = define(1)
    val DUCKDB_TYPE_TINYINT = define(2)
    val DUCKDB_TYPE_SMALLINT = define(3)
    val DUCKDB_TYPE_INTEGER = define(4)
    val DUCKDB_TYPE_BIGINT = define(5)
    val DUCKDB_TYPE_UTINYINT = define(6)
    val DUCKDB_TYPE_USMALLINT = define(7)
    val DUCKDB_TYPE_UINTEGER = define(8)
    val DUCKDB_TYPE_UBIGINT = define(9)
    val DUCKDB_TYPE_FLOAT = define(10)
    val DUCKDB_TYPE_DOUBLE = define(11)
    val DUCKDB_TYPE_TIMESTAMP = define(12)
    val DUCKDB_TYPE_DATE = define(13)
    val DUCKDB_TYPE_TIME = define(14)
    val DUCKDB_TYPE_INTERVAL = define(15)
    val DUCKDB_TYPE_HUGEINT = define(16)
    val DUCKDB_TYPE_UHUGEINT = define(32)
    val DUCKDB_TYPE_VARCHAR = define(17)
    val DUCKDB_TYPE_BLOB = define(18)
    val DUCKDB_TYPE_DECIMAL = define(19)
    val DUCKDB_TYPE_TIMESTAMP_S = define(20)
    val DUCKDB_TYPE_TIMESTAMP_MS = define(21)
    val DUCKDB_TYPE_TIMESTAMP_NS = define(22)
    val DUCKDB_TYPE_ENUM = define(23)
    val DUCKDB_TYPE_LIST = define(24)
    val DUCKDB_TYPE_STRUCT = define(25)
    val DUCKDB_TYPE_MAP = define(26)
    val DUCKDB_TYPE_ARRAY = define(33)
    val DUCKDB_TYPE_UUID = define(27)
    val DUCKDB_TYPE_UNION = define(28)
    val DUCKDB_TYPE_BIT = define(29)
    val DUCKDB_TYPE_TIME_TZ = define(30)
    val DUCKDB_TYPE_TIMESTAMP_TZ = define(31)
    val DUCKDB_TYPE_ANY = define(34)
    val DUCKDB_TYPE_BIGNUM = define(35)
    val DUCKDB_TYPE_SQLNULL = define(36)
    val DUCKDB_TYPE_STRING_LITERAL = define(37)
    val DUCKDB_TYPE_INTEGER_LITERAL = define(38)
    val DUCKDB_TYPE_TIME_NS = define(39)
    def getName(value: DUCKDB_TYPE): Option[String] =
      value match
        case `DUCKDB_TYPE_INVALID` => Some("DUCKDB_TYPE_INVALID")
        case `DUCKDB_TYPE_BOOLEAN` => Some("DUCKDB_TYPE_BOOLEAN")
        case `DUCKDB_TYPE_TINYINT` => Some("DUCKDB_TYPE_TINYINT")
        case `DUCKDB_TYPE_SMALLINT` => Some("DUCKDB_TYPE_SMALLINT")
        case `DUCKDB_TYPE_INTEGER` => Some("DUCKDB_TYPE_INTEGER")
        case `DUCKDB_TYPE_BIGINT` => Some("DUCKDB_TYPE_BIGINT")
        case `DUCKDB_TYPE_UTINYINT` => Some("DUCKDB_TYPE_UTINYINT")
        case `DUCKDB_TYPE_USMALLINT` => Some("DUCKDB_TYPE_USMALLINT")
        case `DUCKDB_TYPE_UINTEGER` => Some("DUCKDB_TYPE_UINTEGER")
        case `DUCKDB_TYPE_UBIGINT` => Some("DUCKDB_TYPE_UBIGINT")
        case `DUCKDB_TYPE_FLOAT` => Some("DUCKDB_TYPE_FLOAT")
        case `DUCKDB_TYPE_DOUBLE` => Some("DUCKDB_TYPE_DOUBLE")
        case `DUCKDB_TYPE_TIMESTAMP` => Some("DUCKDB_TYPE_TIMESTAMP")
        case `DUCKDB_TYPE_DATE` => Some("DUCKDB_TYPE_DATE")
        case `DUCKDB_TYPE_TIME` => Some("DUCKDB_TYPE_TIME")
        case `DUCKDB_TYPE_INTERVAL` => Some("DUCKDB_TYPE_INTERVAL")
        case `DUCKDB_TYPE_HUGEINT` => Some("DUCKDB_TYPE_HUGEINT")
        case `DUCKDB_TYPE_UHUGEINT` => Some("DUCKDB_TYPE_UHUGEINT")
        case `DUCKDB_TYPE_VARCHAR` => Some("DUCKDB_TYPE_VARCHAR")
        case `DUCKDB_TYPE_BLOB` => Some("DUCKDB_TYPE_BLOB")
        case `DUCKDB_TYPE_DECIMAL` => Some("DUCKDB_TYPE_DECIMAL")
        case `DUCKDB_TYPE_TIMESTAMP_S` => Some("DUCKDB_TYPE_TIMESTAMP_S")
        case `DUCKDB_TYPE_TIMESTAMP_MS` => Some("DUCKDB_TYPE_TIMESTAMP_MS")
        case `DUCKDB_TYPE_TIMESTAMP_NS` => Some("DUCKDB_TYPE_TIMESTAMP_NS")
        case `DUCKDB_TYPE_ENUM` => Some("DUCKDB_TYPE_ENUM")
        case `DUCKDB_TYPE_LIST` => Some("DUCKDB_TYPE_LIST")
        case `DUCKDB_TYPE_STRUCT` => Some("DUCKDB_TYPE_STRUCT")
        case `DUCKDB_TYPE_MAP` => Some("DUCKDB_TYPE_MAP")
        case `DUCKDB_TYPE_ARRAY` => Some("DUCKDB_TYPE_ARRAY")
        case `DUCKDB_TYPE_UUID` => Some("DUCKDB_TYPE_UUID")
        case `DUCKDB_TYPE_UNION` => Some("DUCKDB_TYPE_UNION")
        case `DUCKDB_TYPE_BIT` => Some("DUCKDB_TYPE_BIT")
        case `DUCKDB_TYPE_TIME_TZ` => Some("DUCKDB_TYPE_TIME_TZ")
        case `DUCKDB_TYPE_TIMESTAMP_TZ` => Some("DUCKDB_TYPE_TIMESTAMP_TZ")
        case `DUCKDB_TYPE_ANY` => Some("DUCKDB_TYPE_ANY")
        case `DUCKDB_TYPE_BIGNUM` => Some("DUCKDB_TYPE_BIGNUM")
        case `DUCKDB_TYPE_SQLNULL` => Some("DUCKDB_TYPE_SQLNULL")
        case `DUCKDB_TYPE_STRING_LITERAL` => Some("DUCKDB_TYPE_STRING_LITERAL")
        case `DUCKDB_TYPE_INTEGER_LITERAL` => Some("DUCKDB_TYPE_INTEGER_LITERAL")
        case `DUCKDB_TYPE_TIME_NS` => Some("DUCKDB_TYPE_TIME_NS")
        case _ => _root_.scala.None
    extension (a: DUCKDB_TYPE)
      inline def &(b: DUCKDB_TYPE): DUCKDB_TYPE = a & b
      inline def |(b: DUCKDB_TYPE): DUCKDB_TYPE = a | b
      inline def is(b: DUCKDB_TYPE): Boolean = (a & b) == b

  /**
   * An enum over DuckDB's different cast modes.
  */
  opaque type duckdb_cast_mode = CUnsignedInt
  object duckdb_cast_mode extends _BindgenEnumCUnsignedInt[duckdb_cast_mode]:
    given _tag: Tag[duckdb_cast_mode] = Tag.UInt
    inline def define(inline a: Long): duckdb_cast_mode = a.toUInt
    val DUCKDB_CAST_NORMAL = define(0)
    val DUCKDB_CAST_TRY = define(1)
    def getName(value: duckdb_cast_mode): Option[String] =
      value match
        case `DUCKDB_CAST_NORMAL` => Some("DUCKDB_CAST_NORMAL")
        case `DUCKDB_CAST_TRY` => Some("DUCKDB_CAST_TRY")
        case _ => _root_.scala.None
    extension (a: duckdb_cast_mode)
      inline def &(b: duckdb_cast_mode): duckdb_cast_mode = a & b
      inline def |(b: duckdb_cast_mode): duckdb_cast_mode = a | b
      inline def is(b: duckdb_cast_mode): Boolean = (a & b) == b

  /**
   * An enum over DuckDB's different error types.
  */
  opaque type duckdb_error_type = CUnsignedInt
  object duckdb_error_type extends _BindgenEnumCUnsignedInt[duckdb_error_type]:
    given _tag: Tag[duckdb_error_type] = Tag.UInt
    inline def define(inline a: Long): duckdb_error_type = a.toUInt
    val DUCKDB_ERROR_INVALID = define(0)
    val DUCKDB_ERROR_OUT_OF_RANGE = define(1)
    val DUCKDB_ERROR_CONVERSION = define(2)
    val DUCKDB_ERROR_UNKNOWN_TYPE = define(3)
    val DUCKDB_ERROR_DECIMAL = define(4)
    val DUCKDB_ERROR_MISMATCH_TYPE = define(5)
    val DUCKDB_ERROR_DIVIDE_BY_ZERO = define(6)
    val DUCKDB_ERROR_OBJECT_SIZE = define(7)
    val DUCKDB_ERROR_INVALID_TYPE = define(8)
    val DUCKDB_ERROR_SERIALIZATION = define(9)
    val DUCKDB_ERROR_TRANSACTION = define(10)
    val DUCKDB_ERROR_NOT_IMPLEMENTED = define(11)
    val DUCKDB_ERROR_EXPRESSION = define(12)
    val DUCKDB_ERROR_CATALOG = define(13)
    val DUCKDB_ERROR_PARSER = define(14)
    val DUCKDB_ERROR_PLANNER = define(15)
    val DUCKDB_ERROR_SCHEDULER = define(16)
    val DUCKDB_ERROR_EXECUTOR = define(17)
    val DUCKDB_ERROR_CONSTRAINT = define(18)
    val DUCKDB_ERROR_INDEX = define(19)
    val DUCKDB_ERROR_STAT = define(20)
    val DUCKDB_ERROR_CONNECTION = define(21)
    val DUCKDB_ERROR_SYNTAX = define(22)
    val DUCKDB_ERROR_SETTINGS = define(23)
    val DUCKDB_ERROR_BINDER = define(24)
    val DUCKDB_ERROR_NETWORK = define(25)
    val DUCKDB_ERROR_OPTIMIZER = define(26)
    val DUCKDB_ERROR_NULL_POINTER = define(27)
    val DUCKDB_ERROR_IO = define(28)
    val DUCKDB_ERROR_INTERRUPT = define(29)
    val DUCKDB_ERROR_FATAL = define(30)
    val DUCKDB_ERROR_INTERNAL = define(31)
    val DUCKDB_ERROR_INVALID_INPUT = define(32)
    val DUCKDB_ERROR_OUT_OF_MEMORY = define(33)
    val DUCKDB_ERROR_PERMISSION = define(34)
    val DUCKDB_ERROR_PARAMETER_NOT_RESOLVED = define(35)
    val DUCKDB_ERROR_PARAMETER_NOT_ALLOWED = define(36)
    val DUCKDB_ERROR_DEPENDENCY = define(37)
    val DUCKDB_ERROR_HTTP = define(38)
    val DUCKDB_ERROR_MISSING_EXTENSION = define(39)
    val DUCKDB_ERROR_AUTOLOAD = define(40)
    val DUCKDB_ERROR_SEQUENCE = define(41)
    val DUCKDB_INVALID_CONFIGURATION = define(42)
    def getName(value: duckdb_error_type): Option[String] =
      value match
        case `DUCKDB_ERROR_INVALID` => Some("DUCKDB_ERROR_INVALID")
        case `DUCKDB_ERROR_OUT_OF_RANGE` => Some("DUCKDB_ERROR_OUT_OF_RANGE")
        case `DUCKDB_ERROR_CONVERSION` => Some("DUCKDB_ERROR_CONVERSION")
        case `DUCKDB_ERROR_UNKNOWN_TYPE` => Some("DUCKDB_ERROR_UNKNOWN_TYPE")
        case `DUCKDB_ERROR_DECIMAL` => Some("DUCKDB_ERROR_DECIMAL")
        case `DUCKDB_ERROR_MISMATCH_TYPE` => Some("DUCKDB_ERROR_MISMATCH_TYPE")
        case `DUCKDB_ERROR_DIVIDE_BY_ZERO` => Some("DUCKDB_ERROR_DIVIDE_BY_ZERO")
        case `DUCKDB_ERROR_OBJECT_SIZE` => Some("DUCKDB_ERROR_OBJECT_SIZE")
        case `DUCKDB_ERROR_INVALID_TYPE` => Some("DUCKDB_ERROR_INVALID_TYPE")
        case `DUCKDB_ERROR_SERIALIZATION` => Some("DUCKDB_ERROR_SERIALIZATION")
        case `DUCKDB_ERROR_TRANSACTION` => Some("DUCKDB_ERROR_TRANSACTION")
        case `DUCKDB_ERROR_NOT_IMPLEMENTED` => Some("DUCKDB_ERROR_NOT_IMPLEMENTED")
        case `DUCKDB_ERROR_EXPRESSION` => Some("DUCKDB_ERROR_EXPRESSION")
        case `DUCKDB_ERROR_CATALOG` => Some("DUCKDB_ERROR_CATALOG")
        case `DUCKDB_ERROR_PARSER` => Some("DUCKDB_ERROR_PARSER")
        case `DUCKDB_ERROR_PLANNER` => Some("DUCKDB_ERROR_PLANNER")
        case `DUCKDB_ERROR_SCHEDULER` => Some("DUCKDB_ERROR_SCHEDULER")
        case `DUCKDB_ERROR_EXECUTOR` => Some("DUCKDB_ERROR_EXECUTOR")
        case `DUCKDB_ERROR_CONSTRAINT` => Some("DUCKDB_ERROR_CONSTRAINT")
        case `DUCKDB_ERROR_INDEX` => Some("DUCKDB_ERROR_INDEX")
        case `DUCKDB_ERROR_STAT` => Some("DUCKDB_ERROR_STAT")
        case `DUCKDB_ERROR_CONNECTION` => Some("DUCKDB_ERROR_CONNECTION")
        case `DUCKDB_ERROR_SYNTAX` => Some("DUCKDB_ERROR_SYNTAX")
        case `DUCKDB_ERROR_SETTINGS` => Some("DUCKDB_ERROR_SETTINGS")
        case `DUCKDB_ERROR_BINDER` => Some("DUCKDB_ERROR_BINDER")
        case `DUCKDB_ERROR_NETWORK` => Some("DUCKDB_ERROR_NETWORK")
        case `DUCKDB_ERROR_OPTIMIZER` => Some("DUCKDB_ERROR_OPTIMIZER")
        case `DUCKDB_ERROR_NULL_POINTER` => Some("DUCKDB_ERROR_NULL_POINTER")
        case `DUCKDB_ERROR_IO` => Some("DUCKDB_ERROR_IO")
        case `DUCKDB_ERROR_INTERRUPT` => Some("DUCKDB_ERROR_INTERRUPT")
        case `DUCKDB_ERROR_FATAL` => Some("DUCKDB_ERROR_FATAL")
        case `DUCKDB_ERROR_INTERNAL` => Some("DUCKDB_ERROR_INTERNAL")
        case `DUCKDB_ERROR_INVALID_INPUT` => Some("DUCKDB_ERROR_INVALID_INPUT")
        case `DUCKDB_ERROR_OUT_OF_MEMORY` => Some("DUCKDB_ERROR_OUT_OF_MEMORY")
        case `DUCKDB_ERROR_PERMISSION` => Some("DUCKDB_ERROR_PERMISSION")
        case `DUCKDB_ERROR_PARAMETER_NOT_RESOLVED` => Some("DUCKDB_ERROR_PARAMETER_NOT_RESOLVED")
        case `DUCKDB_ERROR_PARAMETER_NOT_ALLOWED` => Some("DUCKDB_ERROR_PARAMETER_NOT_ALLOWED")
        case `DUCKDB_ERROR_DEPENDENCY` => Some("DUCKDB_ERROR_DEPENDENCY")
        case `DUCKDB_ERROR_HTTP` => Some("DUCKDB_ERROR_HTTP")
        case `DUCKDB_ERROR_MISSING_EXTENSION` => Some("DUCKDB_ERROR_MISSING_EXTENSION")
        case `DUCKDB_ERROR_AUTOLOAD` => Some("DUCKDB_ERROR_AUTOLOAD")
        case `DUCKDB_ERROR_SEQUENCE` => Some("DUCKDB_ERROR_SEQUENCE")
        case `DUCKDB_INVALID_CONFIGURATION` => Some("DUCKDB_INVALID_CONFIGURATION")
        case _ => _root_.scala.None
    extension (a: duckdb_error_type)
      inline def &(b: duckdb_error_type): duckdb_error_type = a & b
      inline def |(b: duckdb_error_type): duckdb_error_type = a | b
      inline def is(b: duckdb_error_type): Boolean = (a & b) == b

  /**
   * An enum over the pending state of a pending query result.
  */
  opaque type duckdb_pending_state = CUnsignedInt
  object duckdb_pending_state extends _BindgenEnumCUnsignedInt[duckdb_pending_state]:
    given _tag: Tag[duckdb_pending_state] = Tag.UInt
    inline def define(inline a: Long): duckdb_pending_state = a.toUInt
    val DUCKDB_PENDING_RESULT_READY = define(0)
    val DUCKDB_PENDING_RESULT_NOT_READY = define(1)
    val DUCKDB_PENDING_ERROR = define(2)
    val DUCKDB_PENDING_NO_TASKS_AVAILABLE = define(3)
    def getName(value: duckdb_pending_state): Option[String] =
      value match
        case `DUCKDB_PENDING_RESULT_READY` => Some("DUCKDB_PENDING_RESULT_READY")
        case `DUCKDB_PENDING_RESULT_NOT_READY` => Some("DUCKDB_PENDING_RESULT_NOT_READY")
        case `DUCKDB_PENDING_ERROR` => Some("DUCKDB_PENDING_ERROR")
        case `DUCKDB_PENDING_NO_TASKS_AVAILABLE` => Some("DUCKDB_PENDING_NO_TASKS_AVAILABLE")
        case _ => _root_.scala.None
    extension (a: duckdb_pending_state)
      inline def &(b: duckdb_pending_state): duckdb_pending_state = a & b
      inline def |(b: duckdb_pending_state): duckdb_pending_state = a | b
      inline def is(b: duckdb_pending_state): Boolean = (a & b) == b

  /**
   * An enum over DuckDB's different result types.
  */
  opaque type duckdb_result_type = CUnsignedInt
  object duckdb_result_type extends _BindgenEnumCUnsignedInt[duckdb_result_type]:
    given _tag: Tag[duckdb_result_type] = Tag.UInt
    inline def define(inline a: Long): duckdb_result_type = a.toUInt
    val DUCKDB_RESULT_TYPE_INVALID = define(0)
    val DUCKDB_RESULT_TYPE_CHANGED_ROWS = define(1)
    val DUCKDB_RESULT_TYPE_NOTHING = define(2)
    val DUCKDB_RESULT_TYPE_QUERY_RESULT = define(3)
    def getName(value: duckdb_result_type): Option[String] =
      value match
        case `DUCKDB_RESULT_TYPE_INVALID` => Some("DUCKDB_RESULT_TYPE_INVALID")
        case `DUCKDB_RESULT_TYPE_CHANGED_ROWS` => Some("DUCKDB_RESULT_TYPE_CHANGED_ROWS")
        case `DUCKDB_RESULT_TYPE_NOTHING` => Some("DUCKDB_RESULT_TYPE_NOTHING")
        case `DUCKDB_RESULT_TYPE_QUERY_RESULT` => Some("DUCKDB_RESULT_TYPE_QUERY_RESULT")
        case _ => _root_.scala.None
    extension (a: duckdb_result_type)
      inline def &(b: duckdb_result_type): duckdb_result_type = a & b
      inline def |(b: duckdb_result_type): duckdb_result_type = a | b
      inline def is(b: duckdb_result_type): Boolean = (a & b) == b

  /**
   * An enum over the returned state of different functions.
  */
  opaque type duckdb_state = CUnsignedInt
  object duckdb_state extends _BindgenEnumCUnsignedInt[duckdb_state]:
    given _tag: Tag[duckdb_state] = Tag.UInt
    inline def define(inline a: Long): duckdb_state = a.toUInt
    val DuckDBSuccess = define(0)
    val DuckDBError = define(1)
    def getName(value: duckdb_state): Option[String] =
      value match
        case `DuckDBSuccess` => Some("DuckDBSuccess")
        case `DuckDBError` => Some("DuckDBError")
        case _ => _root_.scala.None
    extension (a: duckdb_state)
      inline def &(b: duckdb_state): duckdb_state = a & b
      inline def |(b: duckdb_state): duckdb_state = a | b
      inline def is(b: duckdb_state): Boolean = (a & b) == b

  /**
   * An enum over DuckDB's different statement types.
  */
  opaque type duckdb_statement_type = CUnsignedInt
  object duckdb_statement_type extends _BindgenEnumCUnsignedInt[duckdb_statement_type]:
    given _tag: Tag[duckdb_statement_type] = Tag.UInt
    inline def define(inline a: Long): duckdb_statement_type = a.toUInt
    val DUCKDB_STATEMENT_TYPE_INVALID = define(0)
    val DUCKDB_STATEMENT_TYPE_SELECT = define(1)
    val DUCKDB_STATEMENT_TYPE_INSERT = define(2)
    val DUCKDB_STATEMENT_TYPE_UPDATE = define(3)
    val DUCKDB_STATEMENT_TYPE_EXPLAIN = define(4)
    val DUCKDB_STATEMENT_TYPE_DELETE = define(5)
    val DUCKDB_STATEMENT_TYPE_PREPARE = define(6)
    val DUCKDB_STATEMENT_TYPE_CREATE = define(7)
    val DUCKDB_STATEMENT_TYPE_EXECUTE = define(8)
    val DUCKDB_STATEMENT_TYPE_ALTER = define(9)
    val DUCKDB_STATEMENT_TYPE_TRANSACTION = define(10)
    val DUCKDB_STATEMENT_TYPE_COPY = define(11)
    val DUCKDB_STATEMENT_TYPE_ANALYZE = define(12)
    val DUCKDB_STATEMENT_TYPE_VARIABLE_SET = define(13)
    val DUCKDB_STATEMENT_TYPE_CREATE_FUNC = define(14)
    val DUCKDB_STATEMENT_TYPE_DROP = define(15)
    val DUCKDB_STATEMENT_TYPE_EXPORT = define(16)
    val DUCKDB_STATEMENT_TYPE_PRAGMA = define(17)
    val DUCKDB_STATEMENT_TYPE_VACUUM = define(18)
    val DUCKDB_STATEMENT_TYPE_CALL = define(19)
    val DUCKDB_STATEMENT_TYPE_SET = define(20)
    val DUCKDB_STATEMENT_TYPE_LOAD = define(21)
    val DUCKDB_STATEMENT_TYPE_RELATION = define(22)
    val DUCKDB_STATEMENT_TYPE_EXTENSION = define(23)
    val DUCKDB_STATEMENT_TYPE_LOGICAL_PLAN = define(24)
    val DUCKDB_STATEMENT_TYPE_ATTACH = define(25)
    val DUCKDB_STATEMENT_TYPE_DETACH = define(26)
    val DUCKDB_STATEMENT_TYPE_MULTI = define(27)
    def getName(value: duckdb_statement_type): Option[String] =
      value match
        case `DUCKDB_STATEMENT_TYPE_INVALID` => Some("DUCKDB_STATEMENT_TYPE_INVALID")
        case `DUCKDB_STATEMENT_TYPE_SELECT` => Some("DUCKDB_STATEMENT_TYPE_SELECT")
        case `DUCKDB_STATEMENT_TYPE_INSERT` => Some("DUCKDB_STATEMENT_TYPE_INSERT")
        case `DUCKDB_STATEMENT_TYPE_UPDATE` => Some("DUCKDB_STATEMENT_TYPE_UPDATE")
        case `DUCKDB_STATEMENT_TYPE_EXPLAIN` => Some("DUCKDB_STATEMENT_TYPE_EXPLAIN")
        case `DUCKDB_STATEMENT_TYPE_DELETE` => Some("DUCKDB_STATEMENT_TYPE_DELETE")
        case `DUCKDB_STATEMENT_TYPE_PREPARE` => Some("DUCKDB_STATEMENT_TYPE_PREPARE")
        case `DUCKDB_STATEMENT_TYPE_CREATE` => Some("DUCKDB_STATEMENT_TYPE_CREATE")
        case `DUCKDB_STATEMENT_TYPE_EXECUTE` => Some("DUCKDB_STATEMENT_TYPE_EXECUTE")
        case `DUCKDB_STATEMENT_TYPE_ALTER` => Some("DUCKDB_STATEMENT_TYPE_ALTER")
        case `DUCKDB_STATEMENT_TYPE_TRANSACTION` => Some("DUCKDB_STATEMENT_TYPE_TRANSACTION")
        case `DUCKDB_STATEMENT_TYPE_COPY` => Some("DUCKDB_STATEMENT_TYPE_COPY")
        case `DUCKDB_STATEMENT_TYPE_ANALYZE` => Some("DUCKDB_STATEMENT_TYPE_ANALYZE")
        case `DUCKDB_STATEMENT_TYPE_VARIABLE_SET` => Some("DUCKDB_STATEMENT_TYPE_VARIABLE_SET")
        case `DUCKDB_STATEMENT_TYPE_CREATE_FUNC` => Some("DUCKDB_STATEMENT_TYPE_CREATE_FUNC")
        case `DUCKDB_STATEMENT_TYPE_DROP` => Some("DUCKDB_STATEMENT_TYPE_DROP")
        case `DUCKDB_STATEMENT_TYPE_EXPORT` => Some("DUCKDB_STATEMENT_TYPE_EXPORT")
        case `DUCKDB_STATEMENT_TYPE_PRAGMA` => Some("DUCKDB_STATEMENT_TYPE_PRAGMA")
        case `DUCKDB_STATEMENT_TYPE_VACUUM` => Some("DUCKDB_STATEMENT_TYPE_VACUUM")
        case `DUCKDB_STATEMENT_TYPE_CALL` => Some("DUCKDB_STATEMENT_TYPE_CALL")
        case `DUCKDB_STATEMENT_TYPE_SET` => Some("DUCKDB_STATEMENT_TYPE_SET")
        case `DUCKDB_STATEMENT_TYPE_LOAD` => Some("DUCKDB_STATEMENT_TYPE_LOAD")
        case `DUCKDB_STATEMENT_TYPE_RELATION` => Some("DUCKDB_STATEMENT_TYPE_RELATION")
        case `DUCKDB_STATEMENT_TYPE_EXTENSION` => Some("DUCKDB_STATEMENT_TYPE_EXTENSION")
        case `DUCKDB_STATEMENT_TYPE_LOGICAL_PLAN` => Some("DUCKDB_STATEMENT_TYPE_LOGICAL_PLAN")
        case `DUCKDB_STATEMENT_TYPE_ATTACH` => Some("DUCKDB_STATEMENT_TYPE_ATTACH")
        case `DUCKDB_STATEMENT_TYPE_DETACH` => Some("DUCKDB_STATEMENT_TYPE_DETACH")
        case `DUCKDB_STATEMENT_TYPE_MULTI` => Some("DUCKDB_STATEMENT_TYPE_MULTI")
        case _ => _root_.scala.None
    extension (a: duckdb_statement_type)
      inline def &(b: duckdb_statement_type): duckdb_statement_type = a & b
      inline def |(b: duckdb_statement_type): duckdb_statement_type = a | b
      inline def is(b: duckdb_statement_type): Boolean = (a & b) == b

object aliases:
  import _root_.duckdb.predef.*
  import _root_.duckdb.enumerations.*
  import _root_.duckdb.aliases.*
  import _root_.duckdb.structs.*
  /**
   * A function to combine aggregate states.
  */
  opaque type duckdb_aggregate_combine_t = CFuncPtr4[duckdb_function_info, Ptr[duckdb_aggregate_state], Ptr[duckdb_aggregate_state], idx_t, Unit]
  object duckdb_aggregate_combine_t:
    given _tag: Tag[duckdb_aggregate_combine_t] = Tag.materializeCFuncPtr4[duckdb_function_info, Ptr[duckdb_aggregate_state], Ptr[duckdb_aggregate_state], idx_t, Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_aggregate_combine_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr4[duckdb_function_info, Ptr[duckdb_aggregate_state], Ptr[duckdb_aggregate_state], idx_t, Unit]): duckdb_aggregate_combine_t = o
    extension (v: duckdb_aggregate_combine_t)
      inline def value: CFuncPtr4[duckdb_function_info, Ptr[duckdb_aggregate_state], Ptr[duckdb_aggregate_state], idx_t, Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * An optional function to destroy an aggregate state.
  */
  opaque type duckdb_aggregate_destroy_t = CFuncPtr2[Ptr[duckdb_aggregate_state], idx_t, Unit]
  object duckdb_aggregate_destroy_t:
    given _tag: Tag[duckdb_aggregate_destroy_t] = Tag.materializeCFuncPtr2[Ptr[duckdb_aggregate_state], idx_t, Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_aggregate_destroy_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr2[Ptr[duckdb_aggregate_state], idx_t, Unit]): duckdb_aggregate_destroy_t = o
    extension (v: duckdb_aggregate_destroy_t)
      inline def value: CFuncPtr2[Ptr[duckdb_aggregate_state], idx_t, Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A function to finalize aggregate states into a result vector.
  */
  opaque type duckdb_aggregate_finalize_t = CFuncPtr5[duckdb_function_info, Ptr[duckdb_aggregate_state], duckdb_vector, idx_t, idx_t, Unit]
  object duckdb_aggregate_finalize_t:
    given _tag: Tag[duckdb_aggregate_finalize_t] = Tag.materializeCFuncPtr5[duckdb_function_info, Ptr[duckdb_aggregate_state], duckdb_vector, idx_t, idx_t, Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_aggregate_finalize_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr5[duckdb_function_info, Ptr[duckdb_aggregate_state], duckdb_vector, idx_t, idx_t, Unit]): duckdb_aggregate_finalize_t = o
    extension (v: duckdb_aggregate_finalize_t)
      inline def value: CFuncPtr5[duckdb_function_info, Ptr[duckdb_aggregate_state], duckdb_vector, idx_t, idx_t, Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * An aggregate function. Must be destroyed with `duckdb_destroy_aggregate_function`.
  */
  opaque type duckdb_aggregate_function = Ptr[_duckdb_aggregate_function]
  object duckdb_aggregate_function:
    given _tag: Tag[duckdb_aggregate_function] = Tag.Ptr[_duckdb_aggregate_function](_duckdb_aggregate_function._tag)
    inline def apply(inline o: Ptr[_duckdb_aggregate_function]): duckdb_aggregate_function = o
    extension (v: duckdb_aggregate_function)
      inline def value: Ptr[_duckdb_aggregate_function] = v

  /**
   * A aggregate function set. Must be destroyed with `duckdb_destroy_aggregate_function_set`.
  */
  opaque type duckdb_aggregate_function_set = Ptr[_duckdb_aggregate_function_set]
  object duckdb_aggregate_function_set:
    given _tag: Tag[duckdb_aggregate_function_set] = Tag.Ptr[_duckdb_aggregate_function_set](_duckdb_aggregate_function_set._tag)
    inline def apply(inline o: Ptr[_duckdb_aggregate_function_set]): duckdb_aggregate_function_set = o
    extension (v: duckdb_aggregate_function_set)
      inline def value: Ptr[_duckdb_aggregate_function_set] = v

  /**
   * A function to initialize an aggregate state.
  */
  opaque type duckdb_aggregate_init_t = CFuncPtr2[duckdb_function_info, duckdb_aggregate_state, Unit]
  object duckdb_aggregate_init_t:
    given _tag: Tag[duckdb_aggregate_init_t] = Tag.materializeCFuncPtr2[duckdb_function_info, duckdb_aggregate_state, Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_aggregate_init_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr2[duckdb_function_info, duckdb_aggregate_state, Unit]): duckdb_aggregate_init_t = o
    extension (v: duckdb_aggregate_init_t)
      inline def value: CFuncPtr2[duckdb_function_info, duckdb_aggregate_state, Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * The state of an aggregate function.
  */
  opaque type duckdb_aggregate_state = Ptr[_duckdb_aggregate_state]
  object duckdb_aggregate_state:
    given _tag: Tag[duckdb_aggregate_state] = Tag.Ptr[_duckdb_aggregate_state](_duckdb_aggregate_state._tag)
    inline def apply(inline o: Ptr[_duckdb_aggregate_state]): duckdb_aggregate_state = o
    extension (v: duckdb_aggregate_state)
      inline def value: Ptr[_duckdb_aggregate_state] = v

  /**
   * A function to return the aggregate state's size.
  */
  opaque type duckdb_aggregate_state_size = CFuncPtr1[duckdb_function_info, idx_t]
  object duckdb_aggregate_state_size:
    given _tag: Tag[duckdb_aggregate_state_size] = Tag.materializeCFuncPtr1[duckdb_function_info, idx_t]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_aggregate_state_size = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr1[duckdb_function_info, idx_t]): duckdb_aggregate_state_size = o
    extension (v: duckdb_aggregate_state_size)
      inline def value: CFuncPtr1[duckdb_function_info, idx_t] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A function to update a set of aggregate states with new values.
  */
  opaque type duckdb_aggregate_update_t = CFuncPtr3[duckdb_function_info, duckdb_data_chunk, Ptr[duckdb_aggregate_state], Unit]
  object duckdb_aggregate_update_t:
    given _tag: Tag[duckdb_aggregate_update_t] = Tag.materializeCFuncPtr3[duckdb_function_info, duckdb_data_chunk, Ptr[duckdb_aggregate_state], Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_aggregate_update_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr3[duckdb_function_info, duckdb_data_chunk, Ptr[duckdb_aggregate_state], Unit]): duckdb_aggregate_update_t = o
    extension (v: duckdb_aggregate_update_t)
      inline def value: CFuncPtr3[duckdb_function_info, duckdb_data_chunk, Ptr[duckdb_aggregate_state], Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * The appender enables fast data loading into DuckDB. Must be destroyed with `duckdb_appender_destroy`.
  */
  opaque type duckdb_appender = Ptr[_duckdb_appender]
  object duckdb_appender:
    given _tag: Tag[duckdb_appender] = Tag.Ptr[_duckdb_appender](_duckdb_appender._tag)
    inline def apply(inline o: Ptr[_duckdb_appender]): duckdb_appender = o
    extension (v: duckdb_appender)
      inline def value: Ptr[_duckdb_appender] = v

  /**
   * Holds an arrow query result. Must be destroyed with `duckdb_destroy_arrow`.
  */
  opaque type duckdb_arrow = Ptr[_duckdb_arrow]
  object duckdb_arrow:
    given _tag: Tag[duckdb_arrow] = Tag.Ptr[_duckdb_arrow](_duckdb_arrow._tag)
    inline def apply(inline o: Ptr[_duckdb_arrow]): duckdb_arrow = o
    extension (v: duckdb_arrow)
      inline def value: Ptr[_duckdb_arrow] = v

  /**
   * Holds an arrow array. Remember to release the respective ArrowSchema object.
  */
  opaque type duckdb_arrow_array = Ptr[_duckdb_arrow_array]
  object duckdb_arrow_array:
    given _tag: Tag[duckdb_arrow_array] = Tag.Ptr[_duckdb_arrow_array](_duckdb_arrow_array._tag)
    inline def apply(inline o: Ptr[_duckdb_arrow_array]): duckdb_arrow_array = o
    extension (v: duckdb_arrow_array)
      inline def value: Ptr[_duckdb_arrow_array] = v

  /**
   * Holds an arrow converted schema (i.e., duckdb::ArrowTableSchema). In practice, this object holds the information necessary to do proper conversion between Arrow Types and DuckDB Types. Check duckdb/function/table/arrow/arrow_duck_schema.hpp for more details! Must be destroyed with `duckdb_destroy_arrow_converted_schema`
  */
  opaque type duckdb_arrow_converted_schema = Ptr[_duckdb_arrow_converted_schema]
  object duckdb_arrow_converted_schema:
    given _tag: Tag[duckdb_arrow_converted_schema] = Tag.Ptr[_duckdb_arrow_converted_schema](_duckdb_arrow_converted_schema._tag)
    inline def apply(inline o: Ptr[_duckdb_arrow_converted_schema]): duckdb_arrow_converted_schema = o
    extension (v: duckdb_arrow_converted_schema)
      inline def value: Ptr[_duckdb_arrow_converted_schema] = v

  /**
   * The arrow options used when transforming the DuckDB schema and datachunks into Arrow schema and arrays. Used in `duckdb_to_arrow_schema` and `duckdb_data_chunk_to_arrow`
  */
  opaque type duckdb_arrow_options = Ptr[_duckdb_arrow_options]
  object duckdb_arrow_options:
    given _tag: Tag[duckdb_arrow_options] = Tag.Ptr[_duckdb_arrow_options](_duckdb_arrow_options._tag)
    inline def apply(inline o: Ptr[_duckdb_arrow_options]): duckdb_arrow_options = o
    extension (v: duckdb_arrow_options)
      inline def value: Ptr[_duckdb_arrow_options] = v

  /**
   * Holds an arrow schema. Remember to release the respective ArrowSchema object.
  */
  opaque type duckdb_arrow_schema = Ptr[_duckdb_arrow_schema]
  object duckdb_arrow_schema:
    given _tag: Tag[duckdb_arrow_schema] = Tag.Ptr[_duckdb_arrow_schema](_duckdb_arrow_schema._tag)
    inline def apply(inline o: Ptr[_duckdb_arrow_schema]): duckdb_arrow_schema = o
    extension (v: duckdb_arrow_schema)
      inline def value: Ptr[_duckdb_arrow_schema] = v

  /**
   * Holds an arrow array stream. Must be destroyed with `duckdb_destroy_arrow_stream`.
  */
  opaque type duckdb_arrow_stream = Ptr[_duckdb_arrow_stream]
  object duckdb_arrow_stream:
    given _tag: Tag[duckdb_arrow_stream] = Tag.Ptr[_duckdb_arrow_stream](_duckdb_arrow_stream._tag)
    inline def apply(inline o: Ptr[_duckdb_arrow_stream]): duckdb_arrow_stream = o
    extension (v: duckdb_arrow_stream)
      inline def value: Ptr[_duckdb_arrow_stream] = v

  /**
   * The bind info of a function. When setting this info, it is necessary to pass a destroy-callback function.
  */
  opaque type duckdb_bind_info = Ptr[_duckdb_bind_info]
  object duckdb_bind_info:
    given _tag: Tag[duckdb_bind_info] = Tag.Ptr[_duckdb_bind_info](_duckdb_bind_info._tag)
    inline def apply(inline o: Ptr[_duckdb_bind_info]): duckdb_bind_info = o
    extension (v: duckdb_bind_info)
      inline def value: Ptr[_duckdb_bind_info] = v

  /**
   * A cast function. Must be destroyed with `duckdb_destroy_cast_function`.
  */
  opaque type duckdb_cast_function = Ptr[_duckdb_cast_function]
  object duckdb_cast_function:
    given _tag: Tag[duckdb_cast_function] = Tag.Ptr[_duckdb_cast_function](_duckdb_cast_function._tag)
    inline def apply(inline o: Ptr[_duckdb_cast_function]): duckdb_cast_function = o
    extension (v: duckdb_cast_function)
      inline def value: Ptr[_duckdb_cast_function] = v

  /**
   * The function to cast from an input vector to an output vector.
  */
  opaque type duckdb_cast_function_t = CFuncPtr4[duckdb_function_info, idx_t, duckdb_vector, duckdb_vector, Boolean]
  object duckdb_cast_function_t:
    given _tag: Tag[duckdb_cast_function_t] = Tag.materializeCFuncPtr4[duckdb_function_info, idx_t, duckdb_vector, duckdb_vector, Boolean]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_cast_function_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr4[duckdb_function_info, idx_t, duckdb_vector, duckdb_vector, Boolean]): duckdb_cast_function_t = o
    extension (v: duckdb_cast_function_t)
      inline def value: CFuncPtr4[duckdb_function_info, idx_t, duckdb_vector, duckdb_vector, Boolean] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A client context of a duckdb connection. Must be destroyed with `duckdb_destroy_context`.
  */
  opaque type duckdb_client_context = Ptr[_duckdb_client_context]
  object duckdb_client_context:
    given _tag: Tag[duckdb_client_context] = Tag.Ptr[_duckdb_client_context](_duckdb_client_context._tag)
    inline def apply(inline o: Ptr[_duckdb_client_context]): duckdb_client_context = o
    extension (v: duckdb_client_context)
      inline def value: Ptr[_duckdb_client_context] = v

  /**
   * The configuration can be used to provide start-up options for a database. Must be destroyed with `duckdb_destroy_config`.
  */
  opaque type duckdb_config = Ptr[_duckdb_config]
  object duckdb_config:
    given _tag: Tag[duckdb_config] = Tag.Ptr[_duckdb_config](_duckdb_config._tag)
    inline def apply(inline o: Ptr[_duckdb_config]): duckdb_config = o
    extension (v: duckdb_config)
      inline def value: Ptr[_duckdb_config] = v

  /**
   * A connection to a duckdb database. Must be closed with `duckdb_disconnect`.
  */
  opaque type duckdb_connection = Ptr[_duckdb_connection]
  object duckdb_connection:
    given _tag: Tag[duckdb_connection] = Tag.Ptr[_duckdb_connection](_duckdb_connection._tag)
    inline def apply(inline o: Ptr[_duckdb_connection]): duckdb_connection = o
    extension (v: duckdb_connection)
      inline def value: Ptr[_duckdb_connection] = v

  /**
   * The callback to copy data, e.g., bind data (if any).
  */
  opaque type duckdb_copy_callback_t = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object duckdb_copy_callback_t:
    given _tag: Tag[duckdb_copy_callback_t] = Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_copy_callback_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]): duckdb_copy_callback_t = o
    extension (v: duckdb_copy_callback_t)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Holds extra information to register a custom logical type. Reserved for future use.
  */
  opaque type duckdb_create_type_info = Ptr[_duckdb_create_type_info]
  object duckdb_create_type_info:
    given _tag: Tag[duckdb_create_type_info] = Tag.Ptr[_duckdb_create_type_info](_duckdb_create_type_info._tag)
    inline def apply(inline o: Ptr[_duckdb_create_type_info]): duckdb_create_type_info = o
    extension (v: duckdb_create_type_info)
      inline def value: Ptr[_duckdb_create_type_info] = v

  /**
   * Contains a data chunk of a duckdb_result. Must be destroyed with `duckdb_destroy_data_chunk`.
  */
  opaque type duckdb_data_chunk = Ptr[_duckdb_data_chunk]
  object duckdb_data_chunk:
    given _tag: Tag[duckdb_data_chunk] = Tag.Ptr[_duckdb_data_chunk](_duckdb_data_chunk._tag)
    inline def apply(inline o: Ptr[_duckdb_data_chunk]): duckdb_data_chunk = o
    extension (v: duckdb_data_chunk)
      inline def value: Ptr[_duckdb_data_chunk] = v

  /**
   * A database object. Must be closed with `duckdb_close`.
  */
  opaque type duckdb_database = Ptr[_duckdb_database]
  object duckdb_database:
    given _tag: Tag[duckdb_database] = Tag.Ptr[_duckdb_database](_duckdb_database._tag)
    inline def apply(inline o: Ptr[_duckdb_database]): duckdb_database = o
    extension (v: duckdb_database)
      inline def value: Ptr[_duckdb_database] = v

  /**
   * The callback to destroy data, e.g., bind data (if any), init data (if any), extra data for replacement scans (if any), etc.
  */
  opaque type duckdb_delete_callback_t = CFuncPtr1[Ptr[Byte], Unit]
  object duckdb_delete_callback_t:
    given _tag: Tag[duckdb_delete_callback_t] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_delete_callback_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): duckdb_delete_callback_t = o
    extension (v: duckdb_delete_callback_t)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Holds error data. Must be destroyed with `duckdb_destroy_error_data`.
  */
  opaque type duckdb_error_data = Ptr[_duckdb_error_data]
  object duckdb_error_data:
    given _tag: Tag[duckdb_error_data] = Tag.Ptr[_duckdb_error_data](_duckdb_error_data._tag)
    inline def apply(inline o: Ptr[_duckdb_error_data]): duckdb_error_data = o
    extension (v: duckdb_error_data)
      inline def value: Ptr[_duckdb_error_data] = v

  /**
   * Holds a bound expression. Must be destroyed with `duckdb_destroy_expression`.
  */
  opaque type duckdb_expression = Ptr[_duckdb_expression]
  object duckdb_expression:
    given _tag: Tag[duckdb_expression] = Tag.Ptr[_duckdb_expression](_duckdb_expression._tag)
    inline def apply(inline o: Ptr[_duckdb_expression]): duckdb_expression = o
    extension (v: duckdb_expression)
      inline def value: Ptr[_duckdb_expression] = v

  /**
   * Holds the state of the C API extension initialization process.
  */
  opaque type duckdb_extension_info = Ptr[_duckdb_extension_info]
  object duckdb_extension_info:
    given _tag: Tag[duckdb_extension_info] = Tag.Ptr[_duckdb_extension_info](_duckdb_extension_info._tag)
    inline def apply(inline o: Ptr[_duckdb_extension_info]): duckdb_extension_info = o
    extension (v: duckdb_extension_info)
      inline def value: Ptr[_duckdb_extension_info] = v

  /**
   * Extracted statements. Must be destroyed with `duckdb_destroy_extracted`.
  */
  opaque type duckdb_extracted_statements = Ptr[_duckdb_extracted_statements]
  object duckdb_extracted_statements:
    given _tag: Tag[duckdb_extracted_statements] = Tag.Ptr[_duckdb_extracted_statements](_duckdb_extracted_statements._tag)
    inline def apply(inline o: Ptr[_duckdb_extracted_statements]): duckdb_extracted_statements = o
    extension (v: duckdb_extracted_statements)
      inline def value: Ptr[_duckdb_extracted_statements] = v

  /**
   * Additional function info. When setting this info, it is necessary to pass a destroy-callback function.
  */
  opaque type duckdb_function_info = Ptr[_duckdb_function_info]
  object duckdb_function_info:
    given _tag: Tag[duckdb_function_info] = Tag.Ptr[_duckdb_function_info](_duckdb_function_info._tag)
    inline def apply(inline o: Ptr[_duckdb_function_info]): duckdb_function_info = o
    extension (v: duckdb_function_info)
      inline def value: Ptr[_duckdb_function_info] = v

  /**
   * Additional function initialization info. When setting this info, it is necessary to pass a destroy-callback function.
  */
  opaque type duckdb_init_info = Ptr[_duckdb_init_info]
  object duckdb_init_info:
    given _tag: Tag[duckdb_init_info] = Tag.Ptr[_duckdb_init_info](_duckdb_init_info._tag)
    inline def apply(inline o: Ptr[_duckdb_init_info]): duckdb_init_info = o
    extension (v: duckdb_init_info)
      inline def value: Ptr[_duckdb_init_info] = v

  /**
   * A database instance cache object. Must be destroyed with `duckdb_destroy_instance_cache`.
  */
  opaque type duckdb_instance_cache = Ptr[_duckdb_instance_cache]
  object duckdb_instance_cache:
    given _tag: Tag[duckdb_instance_cache] = Tag.Ptr[_duckdb_instance_cache](_duckdb_instance_cache._tag)
    inline def apply(inline o: Ptr[_duckdb_instance_cache]): duckdb_instance_cache = o
    extension (v: duckdb_instance_cache)
      inline def value: Ptr[_duckdb_instance_cache] = v

  /**
   * A logical type. Must be destroyed with `duckdb_destroy_logical_type`.
  */
  opaque type duckdb_logical_type = Ptr[_duckdb_logical_type]
  object duckdb_logical_type:
    given _tag: Tag[duckdb_logical_type] = Tag.Ptr[_duckdb_logical_type](_duckdb_logical_type._tag)
    inline def apply(inline o: Ptr[_duckdb_logical_type]): duckdb_logical_type = o
    extension (v: duckdb_logical_type)
      inline def value: Ptr[_duckdb_logical_type] = v

  /**
   * The pending result represents an intermediate structure for a query that is not yet fully executed. Must be destroyed with `duckdb_destroy_pending`.
  */
  opaque type duckdb_pending_result = Ptr[_duckdb_pending_result]
  object duckdb_pending_result:
    given _tag: Tag[duckdb_pending_result] = Tag.Ptr[_duckdb_pending_result](_duckdb_pending_result._tag)
    inline def apply(inline o: Ptr[_duckdb_pending_result]): duckdb_pending_result = o
    extension (v: duckdb_pending_result)
      inline def value: Ptr[_duckdb_pending_result] = v

  /**
   * A prepared statement is a parameterized query that allows you to bind parameters to it. Must be destroyed with `duckdb_destroy_prepare`.
  */
  opaque type duckdb_prepared_statement = Ptr[_duckdb_prepared_statement]
  object duckdb_prepared_statement:
    given _tag: Tag[duckdb_prepared_statement] = Tag.Ptr[_duckdb_prepared_statement](_duckdb_prepared_statement._tag)
    inline def apply(inline o: Ptr[_duckdb_prepared_statement]): duckdb_prepared_statement = o
    extension (v: duckdb_prepared_statement)
      inline def value: Ptr[_duckdb_prepared_statement] = v

  /**
   * Holds a recursive tree containing profiling metrics. The tree matches the query plan, and has a top-level node.
  */
  opaque type duckdb_profiling_info = Ptr[_duckdb_profiling_info]
  object duckdb_profiling_info:
    given _tag: Tag[duckdb_profiling_info] = Tag.Ptr[_duckdb_profiling_info](_duckdb_profiling_info._tag)
    inline def apply(inline o: Ptr[_duckdb_profiling_info]): duckdb_profiling_info = o
    extension (v: duckdb_profiling_info)
      inline def value: Ptr[_duckdb_profiling_info] = v

  /**
   * A replacement scan function.
  */
  opaque type duckdb_replacement_callback_t = CFuncPtr3[duckdb_replacement_scan_info, CString, Ptr[Byte], Unit]
  object duckdb_replacement_callback_t:
    given _tag: Tag[duckdb_replacement_callback_t] = Tag.materializeCFuncPtr3[duckdb_replacement_scan_info, CString, Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_replacement_callback_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr3[duckdb_replacement_scan_info, CString, Ptr[Byte], Unit]): duckdb_replacement_callback_t = o
    extension (v: duckdb_replacement_callback_t)
      inline def value: CFuncPtr3[duckdb_replacement_scan_info, CString, Ptr[Byte], Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Additional replacement scan info. When setting this info, it is necessary to pass a destroy-callback function.
  */
  opaque type duckdb_replacement_scan_info = Ptr[_duckdb_replacement_scan_info]
  object duckdb_replacement_scan_info:
    given _tag: Tag[duckdb_replacement_scan_info] = Tag.Ptr[_duckdb_replacement_scan_info](_duckdb_replacement_scan_info._tag)
    inline def apply(inline o: Ptr[_duckdb_replacement_scan_info]): duckdb_replacement_scan_info = o
    extension (v: duckdb_replacement_scan_info)
      inline def value: Ptr[_duckdb_replacement_scan_info] = v

  /**
   * A scalar function. Must be destroyed with `duckdb_destroy_scalar_function`.
  */
  opaque type duckdb_scalar_function = Ptr[_duckdb_scalar_function]
  object duckdb_scalar_function:
    given _tag: Tag[duckdb_scalar_function] = Tag.Ptr[_duckdb_scalar_function](_duckdb_scalar_function._tag)
    inline def apply(inline o: Ptr[_duckdb_scalar_function]): duckdb_scalar_function = o
    extension (v: duckdb_scalar_function)
      inline def value: Ptr[_duckdb_scalar_function] = v

  /**
   * The bind function callback of the scalar function.
  */
  opaque type duckdb_scalar_function_bind_t = CFuncPtr1[duckdb_bind_info, Unit]
  object duckdb_scalar_function_bind_t:
    given _tag: Tag[duckdb_scalar_function_bind_t] = Tag.materializeCFuncPtr1[duckdb_bind_info, Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_scalar_function_bind_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr1[duckdb_bind_info, Unit]): duckdb_scalar_function_bind_t = o
    extension (v: duckdb_scalar_function_bind_t)
      inline def value: CFuncPtr1[duckdb_bind_info, Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A scalar function set. Must be destroyed with `duckdb_destroy_scalar_function_set`.
  */
  opaque type duckdb_scalar_function_set = Ptr[_duckdb_scalar_function_set]
  object duckdb_scalar_function_set:
    given _tag: Tag[duckdb_scalar_function_set] = Tag.Ptr[_duckdb_scalar_function_set](_duckdb_scalar_function_set._tag)
    inline def apply(inline o: Ptr[_duckdb_scalar_function_set]): duckdb_scalar_function_set = o
    extension (v: duckdb_scalar_function_set)
      inline def value: Ptr[_duckdb_scalar_function_set] = v

  /**
   * The function to execute the scalar function on an input chunk.
  */
  opaque type duckdb_scalar_function_t = CFuncPtr3[duckdb_function_info, duckdb_data_chunk, duckdb_vector, Unit]
  object duckdb_scalar_function_t:
    given _tag: Tag[duckdb_scalar_function_t] = Tag.materializeCFuncPtr3[duckdb_function_info, duckdb_data_chunk, duckdb_vector, Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_scalar_function_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr3[duckdb_function_info, duckdb_data_chunk, duckdb_vector, Unit]): duckdb_scalar_function_t = o
    extension (v: duckdb_scalar_function_t)
      inline def value: CFuncPtr3[duckdb_function_info, duckdb_data_chunk, duckdb_vector, Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A selection vector is a vector of indices, which usually refer to values in a vector. Can be used to slice vectors, changing their length and the order of their entries. Standalone selection vectors must be destroyed.
  */
  opaque type duckdb_selection_vector = Ptr[_duckdb_selection_vector]
  object duckdb_selection_vector:
    given _tag: Tag[duckdb_selection_vector] = Tag.Ptr[_duckdb_selection_vector](_duckdb_selection_vector._tag)
    inline def apply(inline o: Ptr[_duckdb_selection_vector]): duckdb_selection_vector = o
    extension (v: duckdb_selection_vector)
      inline def value: Ptr[_duckdb_selection_vector] = v

  /**
   * The table description allows querying information about the table. Must be destroyed with `duckdb_table_description_destroy`.
  */
  opaque type duckdb_table_description = Ptr[_duckdb_table_description]
  object duckdb_table_description:
    given _tag: Tag[duckdb_table_description] = Tag.Ptr[_duckdb_table_description](_duckdb_table_description._tag)
    inline def apply(inline o: Ptr[_duckdb_table_description]): duckdb_table_description = o
    extension (v: duckdb_table_description)
      inline def value: Ptr[_duckdb_table_description] = v

  /**
   * A table function. Must be destroyed with `duckdb_destroy_table_function`.
  */
  opaque type duckdb_table_function = Ptr[_duckdb_table_function]
  object duckdb_table_function:
    given _tag: Tag[duckdb_table_function] = Tag.Ptr[_duckdb_table_function](_duckdb_table_function._tag)
    inline def apply(inline o: Ptr[_duckdb_table_function]): duckdb_table_function = o
    extension (v: duckdb_table_function)
      inline def value: Ptr[_duckdb_table_function] = v

  /**
   * The bind function of the table function.
  */
  opaque type duckdb_table_function_bind_t = CFuncPtr1[duckdb_bind_info, Unit]
  object duckdb_table_function_bind_t:
    given _tag: Tag[duckdb_table_function_bind_t] = Tag.materializeCFuncPtr1[duckdb_bind_info, Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_table_function_bind_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr1[duckdb_bind_info, Unit]): duckdb_table_function_bind_t = o
    extension (v: duckdb_table_function_bind_t)
      inline def value: CFuncPtr1[duckdb_bind_info, Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * The possibly thread-local initialization function of the table function.
  */
  opaque type duckdb_table_function_init_t = CFuncPtr1[duckdb_init_info, Unit]
  object duckdb_table_function_init_t:
    given _tag: Tag[duckdb_table_function_init_t] = Tag.materializeCFuncPtr1[duckdb_init_info, Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_table_function_init_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr1[duckdb_init_info, Unit]): duckdb_table_function_init_t = o
    extension (v: duckdb_table_function_init_t)
      inline def value: CFuncPtr1[duckdb_init_info, Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * The function to generate an output chunk during table function execution.
  */
  opaque type duckdb_table_function_t = CFuncPtr2[duckdb_function_info, duckdb_data_chunk, Unit]
  object duckdb_table_function_t:
    given _tag: Tag[duckdb_table_function_t] = Tag.materializeCFuncPtr2[duckdb_function_info, duckdb_data_chunk, Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): duckdb_table_function_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr2[duckdb_function_info, duckdb_data_chunk, Unit]): duckdb_table_function_t = o
    extension (v: duckdb_table_function_t)
      inline def value: CFuncPtr2[duckdb_function_info, duckdb_data_chunk, Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Used for threading, contains a task state. Must be destroyed with `duckdb_destroy_task_state`.
  */
  opaque type duckdb_task_state = Ptr[Byte]
  object duckdb_task_state:
    given _tag: Tag[duckdb_task_state] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_task_state = o
    extension (v: duckdb_task_state)
      inline def value: Ptr[Byte] = v

  /**
   * An enum over DuckDB's internal types.
  */
  type duckdb_type = DUCKDB_TYPE
  object duckdb_type:
    given _tag: Tag[duckdb_type] = DUCKDB_TYPE._tag
    inline def apply(inline o: DUCKDB_TYPE): duckdb_type = o
    extension (v: duckdb_type)
      inline def value: DUCKDB_TYPE = v

  /**
   * A value of a logical type. Must be destroyed with `duckdb_destroy_value`.
  */
  opaque type duckdb_value = Ptr[_duckdb_value]
  object duckdb_value:
    given _tag: Tag[duckdb_value] = Tag.Ptr[_duckdb_value](_duckdb_value._tag)
    inline def apply(inline o: Ptr[_duckdb_value]): duckdb_value = o
    extension (v: duckdb_value)
      inline def value: Ptr[_duckdb_value] = v

  /**
   * 1. A standalone vector that must be destroyed, or 2. A vector to a column in a data chunk that lives as long as the data chunk lives.
  */
  opaque type duckdb_vector = Ptr[_duckdb_vector]
  object duckdb_vector:
    given _tag: Tag[duckdb_vector] = Tag.Ptr[_duckdb_vector](_duckdb_vector._tag)
    inline def apply(inline o: Ptr[_duckdb_vector]): duckdb_vector = o
    extension (v: duckdb_vector)
      inline def value: Ptr[_duckdb_vector] = v

  /**
   * DuckDB's index type.
  */
  type idx_t = uint64_t
  object idx_t:
    given _tag: Tag[idx_t] = uint64_t._tag
    inline def apply(inline o: uint64_t): idx_t = o
    extension (v: idx_t)
      inline def value: uint64_t = v

  type int16_t = scala.Short
  object int16_t:
    val _tag: Tag[int16_t] = summon[Tag[scala.Short]]
    inline def apply(inline o: scala.Short): int16_t = o
    extension (v: int16_t)
      inline def value: scala.Short = v

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

  type int8_t = scala.scalanative.unsafe.CChar
  object int8_t:
    val _tag: Tag[int8_t] = summon[Tag[scala.scalanative.unsafe.CChar]]
    inline def apply(inline o: scala.scalanative.unsafe.CChar): int8_t = o
    extension (v: int8_t)
      inline def value: scala.scalanative.unsafe.CChar = v

  /**
   * Type definition for the data pointers of selection vectors.
  */
  type sel_t = uint32_t
  object sel_t:
    given _tag: Tag[sel_t] = uint32_t._tag
    inline def apply(inline o: uint32_t): sel_t = o
    extension (v: sel_t)
      inline def value: uint32_t = v

  type size_t = libc.stddef.size_t
  object size_t:
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t)
      inline def value: libc.stddef.size_t = v

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

object structs:
  import _root_.duckdb.predef.*
  import _root_.duckdb.enumerations.*
  import _root_.duckdb.aliases.*
  import _root_.duckdb.structs.*

  /**
   * Forward declare Arrow structs It is important to notice that these structs are not defined by DuckDB but are actually Arrow external objects. They're defined by the C Data Interface Arrow spec: https://arrow.apache.org/docs/format/CDataInterface.html
  */
  opaque type ArrowArray = CStruct0
  
  object ArrowArray:
    given _tag: Tag[ArrowArray] = Tag.materializeCStruct0Tag
    

  opaque type ArrowSchema = CStruct0
  
  object ArrowSchema:
    given _tag: Tag[ArrowSchema] = Tag.materializeCStruct0Tag
    

  /**
   * An aggregate function. Must be destroyed with `duckdb_destroy_aggregate_function`.
  */
  opaque type _duckdb_aggregate_function = CStruct1[Ptr[Byte]]
  
  object _duckdb_aggregate_function:
    given _tag: Tag[_duckdb_aggregate_function] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_aggregate_function)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_aggregate_function on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_aggregate_function] = scala.scalanative.unsafe.alloc[_duckdb_aggregate_function](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_aggregate_function] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A aggregate function set. Must be destroyed with `duckdb_destroy_aggregate_function_set`.
  */
  opaque type _duckdb_aggregate_function_set = CStruct1[Ptr[Byte]]
  
  object _duckdb_aggregate_function_set:
    given _tag: Tag[_duckdb_aggregate_function_set] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_aggregate_function_set)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_aggregate_function_set on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_aggregate_function_set] = scala.scalanative.unsafe.alloc[_duckdb_aggregate_function_set](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_aggregate_function_set] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * The state of an aggregate function.
  */
  opaque type _duckdb_aggregate_state = CStruct1[Ptr[Byte]]
  
  object _duckdb_aggregate_state:
    given _tag: Tag[_duckdb_aggregate_state] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_aggregate_state)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_aggregate_state on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_aggregate_state] = scala.scalanative.unsafe.alloc[_duckdb_aggregate_state](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_aggregate_state] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * The appender enables fast data loading into DuckDB. Must be destroyed with `duckdb_appender_destroy`.
  */
  opaque type _duckdb_appender = CStruct1[Ptr[Byte]]
  
  object _duckdb_appender:
    given _tag: Tag[_duckdb_appender] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_appender)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_appender on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_appender] = scala.scalanative.unsafe.alloc[_duckdb_appender](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_appender] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Holds an arrow query result. Must be destroyed with `duckdb_destroy_arrow`.
  */
  opaque type _duckdb_arrow = CStruct1[Ptr[Byte]]
  
  object _duckdb_arrow:
    given _tag: Tag[_duckdb_arrow] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_arrow)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_arrow on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_arrow] = scala.scalanative.unsafe.alloc[_duckdb_arrow](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_arrow] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Holds an arrow array. Remember to release the respective ArrowSchema object.
  */
  opaque type _duckdb_arrow_array = CStruct1[Ptr[Byte]]
  
  object _duckdb_arrow_array:
    given _tag: Tag[_duckdb_arrow_array] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_arrow_array)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_arrow_array on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_arrow_array] = scala.scalanative.unsafe.alloc[_duckdb_arrow_array](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_arrow_array] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Holds an arrow converted schema (i.e., duckdb::ArrowTableSchema). In practice, this object holds the information necessary to do proper conversion between Arrow Types and DuckDB Types. Check duckdb/function/table/arrow/arrow_duck_schema.hpp for more details! Must be destroyed with `duckdb_destroy_arrow_converted_schema`
  */
  opaque type _duckdb_arrow_converted_schema = CStruct1[Ptr[Byte]]
  
  object _duckdb_arrow_converted_schema:
    given _tag: Tag[_duckdb_arrow_converted_schema] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_arrow_converted_schema)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_arrow_converted_schema on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_arrow_converted_schema] = scala.scalanative.unsafe.alloc[_duckdb_arrow_converted_schema](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_arrow_converted_schema] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * The arrow options used when transforming the DuckDB schema and datachunks into Arrow schema and arrays. Used in `duckdb_to_arrow_schema` and `duckdb_data_chunk_to_arrow`
  */
  opaque type _duckdb_arrow_options = CStruct1[Ptr[Byte]]
  
  object _duckdb_arrow_options:
    given _tag: Tag[_duckdb_arrow_options] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_arrow_options)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_arrow_options on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_arrow_options] = scala.scalanative.unsafe.alloc[_duckdb_arrow_options](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_arrow_options] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Holds an arrow schema. Remember to release the respective ArrowSchema object.
  */
  opaque type _duckdb_arrow_schema = CStruct1[Ptr[Byte]]
  
  object _duckdb_arrow_schema:
    given _tag: Tag[_duckdb_arrow_schema] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_arrow_schema)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_arrow_schema on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_arrow_schema] = scala.scalanative.unsafe.alloc[_duckdb_arrow_schema](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_arrow_schema] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Holds an arrow array stream. Must be destroyed with `duckdb_destroy_arrow_stream`.
  */
  opaque type _duckdb_arrow_stream = CStruct1[Ptr[Byte]]
  
  object _duckdb_arrow_stream:
    given _tag: Tag[_duckdb_arrow_stream] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_arrow_stream)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_arrow_stream on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_arrow_stream] = scala.scalanative.unsafe.alloc[_duckdb_arrow_stream](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_arrow_stream] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * The bind info of a function. When setting this info, it is necessary to pass a destroy-callback function.
  */
  opaque type _duckdb_bind_info = CStruct1[Ptr[Byte]]
  
  object _duckdb_bind_info:
    given _tag: Tag[_duckdb_bind_info] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_bind_info)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_bind_info on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_bind_info] = scala.scalanative.unsafe.alloc[_duckdb_bind_info](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_bind_info] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A cast function. Must be destroyed with `duckdb_destroy_cast_function`.
  */
  opaque type _duckdb_cast_function = CStruct1[Ptr[Byte]]
  
  object _duckdb_cast_function:
    given _tag: Tag[_duckdb_cast_function] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_cast_function)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_cast_function on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_cast_function] = scala.scalanative.unsafe.alloc[_duckdb_cast_function](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_cast_function] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A client context of a duckdb connection. Must be destroyed with `duckdb_destroy_context`.
  */
  opaque type _duckdb_client_context = CStruct1[Ptr[Byte]]
  
  object _duckdb_client_context:
    given _tag: Tag[_duckdb_client_context] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_client_context)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_client_context on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_client_context] = scala.scalanative.unsafe.alloc[_duckdb_client_context](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_client_context] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * The configuration can be used to provide start-up options for a database. Must be destroyed with `duckdb_destroy_config`.
  */
  opaque type _duckdb_config = CStruct1[Ptr[Byte]]
  
  object _duckdb_config:
    given _tag: Tag[_duckdb_config] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_config)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_config on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_config] = scala.scalanative.unsafe.alloc[_duckdb_config](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_config] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A connection to a duckdb database. Must be closed with `duckdb_disconnect`.
  */
  opaque type _duckdb_connection = CStruct1[Ptr[Byte]]
  
  object _duckdb_connection:
    given _tag: Tag[_duckdb_connection] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_connection)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_connection on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_connection] = scala.scalanative.unsafe.alloc[_duckdb_connection](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_connection] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Holds extra information to register a custom logical type. Reserved for future use.
  */
  opaque type _duckdb_create_type_info = CStruct1[Ptr[Byte]]
  
  object _duckdb_create_type_info:
    given _tag: Tag[_duckdb_create_type_info] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_create_type_info)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_create_type_info on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_create_type_info] = scala.scalanative.unsafe.alloc[_duckdb_create_type_info](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_create_type_info] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Contains a data chunk of a duckdb_result. Must be destroyed with `duckdb_destroy_data_chunk`.
  */
  opaque type _duckdb_data_chunk = CStruct1[Ptr[Byte]]
  
  object _duckdb_data_chunk:
    given _tag: Tag[_duckdb_data_chunk] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_data_chunk)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_data_chunk on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_data_chunk] = scala.scalanative.unsafe.alloc[_duckdb_data_chunk](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_data_chunk] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A database object. Must be closed with `duckdb_close`.
  */
  opaque type _duckdb_database = CStruct1[Ptr[Byte]]
  
  object _duckdb_database:
    given _tag: Tag[_duckdb_database] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_database)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_database on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_database] = scala.scalanative.unsafe.alloc[_duckdb_database](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_database] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Holds error data. Must be destroyed with `duckdb_destroy_error_data`.
  */
  opaque type _duckdb_error_data = CStruct1[Ptr[Byte]]
  
  object _duckdb_error_data:
    given _tag: Tag[_duckdb_error_data] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_error_data)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_error_data on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_error_data] = scala.scalanative.unsafe.alloc[_duckdb_error_data](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_error_data] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Holds a bound expression. Must be destroyed with `duckdb_destroy_expression`.
  */
  opaque type _duckdb_expression = CStruct1[Ptr[Byte]]
  
  object _duckdb_expression:
    given _tag: Tag[_duckdb_expression] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_expression)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_expression on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_expression] = scala.scalanative.unsafe.alloc[_duckdb_expression](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_expression] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Holds the state of the C API extension initialization process.
  */
  opaque type _duckdb_extension_info = CStruct1[Ptr[Byte]]
  
  object _duckdb_extension_info:
    given _tag: Tag[_duckdb_extension_info] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_extension_info)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_extension_info on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_extension_info] = scala.scalanative.unsafe.alloc[_duckdb_extension_info](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_extension_info] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Extracted statements. Must be destroyed with `duckdb_destroy_extracted`.
  */
  opaque type _duckdb_extracted_statements = CStruct1[Ptr[Byte]]
  
  object _duckdb_extracted_statements:
    given _tag: Tag[_duckdb_extracted_statements] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_extracted_statements)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_extracted_statements on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_extracted_statements] = scala.scalanative.unsafe.alloc[_duckdb_extracted_statements](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_extracted_statements] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Additional function info. When setting this info, it is necessary to pass a destroy-callback function.
  */
  opaque type _duckdb_function_info = CStruct1[Ptr[Byte]]
  
  object _duckdb_function_info:
    given _tag: Tag[_duckdb_function_info] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_function_info)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_function_info on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_function_info] = scala.scalanative.unsafe.alloc[_duckdb_function_info](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_function_info] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Additional function initialization info. When setting this info, it is necessary to pass a destroy-callback function.
  */
  opaque type _duckdb_init_info = CStruct1[Ptr[Byte]]
  
  object _duckdb_init_info:
    given _tag: Tag[_duckdb_init_info] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_init_info)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_init_info on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_init_info] = scala.scalanative.unsafe.alloc[_duckdb_init_info](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_init_info] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A database instance cache object. Must be destroyed with `duckdb_destroy_instance_cache`.
  */
  opaque type _duckdb_instance_cache = CStruct1[Ptr[Byte]]
  
  object _duckdb_instance_cache:
    given _tag: Tag[_duckdb_instance_cache] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_instance_cache)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_instance_cache on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_instance_cache] = scala.scalanative.unsafe.alloc[_duckdb_instance_cache](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_instance_cache] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A logical type. Must be destroyed with `duckdb_destroy_logical_type`.
  */
  opaque type _duckdb_logical_type = CStruct1[Ptr[Byte]]
  
  object _duckdb_logical_type:
    given _tag: Tag[_duckdb_logical_type] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_logical_type)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_logical_type on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_logical_type] = scala.scalanative.unsafe.alloc[_duckdb_logical_type](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_logical_type] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * The pending result represents an intermediate structure for a query that is not yet fully executed. Must be destroyed with `duckdb_destroy_pending`.
  */
  opaque type _duckdb_pending_result = CStruct1[Ptr[Byte]]
  
  object _duckdb_pending_result:
    given _tag: Tag[_duckdb_pending_result] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_pending_result)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_pending_result on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_pending_result] = scala.scalanative.unsafe.alloc[_duckdb_pending_result](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_pending_result] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A prepared statement is a parameterized query that allows you to bind parameters to it. Must be destroyed with `duckdb_destroy_prepare`.
  */
  opaque type _duckdb_prepared_statement = CStruct1[Ptr[Byte]]
  
  object _duckdb_prepared_statement:
    given _tag: Tag[_duckdb_prepared_statement] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_prepared_statement)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_prepared_statement on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_prepared_statement] = scala.scalanative.unsafe.alloc[_duckdb_prepared_statement](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_prepared_statement] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Holds a recursive tree containing profiling metrics. The tree matches the query plan, and has a top-level node.
  */
  opaque type _duckdb_profiling_info = CStruct1[Ptr[Byte]]
  
  object _duckdb_profiling_info:
    given _tag: Tag[_duckdb_profiling_info] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_profiling_info)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_profiling_info on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_profiling_info] = scala.scalanative.unsafe.alloc[_duckdb_profiling_info](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_profiling_info] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * Additional replacement scan info. When setting this info, it is necessary to pass a destroy-callback function.
  */
  opaque type _duckdb_replacement_scan_info = CStruct1[Ptr[Byte]]
  
  object _duckdb_replacement_scan_info:
    given _tag: Tag[_duckdb_replacement_scan_info] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_replacement_scan_info)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_replacement_scan_info on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_replacement_scan_info] = scala.scalanative.unsafe.alloc[_duckdb_replacement_scan_info](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_replacement_scan_info] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A scalar function. Must be destroyed with `duckdb_destroy_scalar_function`.
  */
  opaque type _duckdb_scalar_function = CStruct1[Ptr[Byte]]
  
  object _duckdb_scalar_function:
    given _tag: Tag[_duckdb_scalar_function] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_scalar_function)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_scalar_function on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_scalar_function] = scala.scalanative.unsafe.alloc[_duckdb_scalar_function](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_scalar_function] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A scalar function set. Must be destroyed with `duckdb_destroy_scalar_function_set`.
  */
  opaque type _duckdb_scalar_function_set = CStruct1[Ptr[Byte]]
  
  object _duckdb_scalar_function_set:
    given _tag: Tag[_duckdb_scalar_function_set] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_scalar_function_set)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_scalar_function_set on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_scalar_function_set] = scala.scalanative.unsafe.alloc[_duckdb_scalar_function_set](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_scalar_function_set] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A selection vector is a vector of indices, which usually refer to values in a vector. Can be used to slice vectors, changing their length and the order of their entries. Standalone selection vectors must be destroyed.
  */
  opaque type _duckdb_selection_vector = CStruct1[Ptr[Byte]]
  
  object _duckdb_selection_vector:
    given _tag: Tag[_duckdb_selection_vector] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_selection_vector)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_selection_vector on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_selection_vector] = scala.scalanative.unsafe.alloc[_duckdb_selection_vector](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_selection_vector] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * The table description allows querying information about the table. Must be destroyed with `duckdb_table_description_destroy`.
  */
  opaque type _duckdb_table_description = CStruct1[Ptr[Byte]]
  
  object _duckdb_table_description:
    given _tag: Tag[_duckdb_table_description] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_table_description)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_table_description on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_table_description] = scala.scalanative.unsafe.alloc[_duckdb_table_description](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_table_description] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A table function. Must be destroyed with `duckdb_destroy_table_function`.
  */
  opaque type _duckdb_table_function = CStruct1[Ptr[Byte]]
  
  object _duckdb_table_function:
    given _tag: Tag[_duckdb_table_function] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_table_function)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_table_function on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_table_function] = scala.scalanative.unsafe.alloc[_duckdb_table_function](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_table_function] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * A value of a logical type. Must be destroyed with `duckdb_destroy_value`.
  */
  opaque type _duckdb_value = CStruct1[Ptr[Byte]]
  
  object _duckdb_value:
    given _tag: Tag[_duckdb_value] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_value)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_value on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_value] = scala.scalanative.unsafe.alloc[_duckdb_value](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_value] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * 1. A standalone vector that must be destroyed, or 2. A vector to a column in a data chunk that lives as long as the data chunk lives.
  */
  opaque type _duckdb_vector = CStruct1[Ptr[Byte]]
  
  object _duckdb_vector:
    given _tag: Tag[_duckdb_vector] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: _duckdb_vector)
        inline def internal_ptr : Ptr[Byte] = struct._1
        inline def internal_ptr_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates _duckdb_vector on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[_duckdb_vector] = scala.scalanative.unsafe.alloc[_duckdb_vector](1)
    def apply(internal_ptr : Ptr[Byte])(using Zone): Ptr[_duckdb_vector] =
      val ____ptr = apply()
      (!____ptr).internal_ptr = internal_ptr
      ____ptr
    
    

  /**
   * BIGNUMs are composed of a byte pointer, a size, and an `is_negative` bool. The absolute value of the number is stored in `data` in little endian format. You must free `data` with `duckdb_free`.
  */
  opaque type duckdb_bignum = CStruct3[Ptr[uint8_t], idx_t, Boolean]
  
  object duckdb_bignum:
    given _tag: Tag[duckdb_bignum] = Tag.materializeCStruct3Tag[Ptr[uint8_t], idx_t, Boolean]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_bignum)
        inline def data : Ptr[uint8_t] = struct._1
        inline def data_=(value: Ptr[uint8_t]): Unit = (!struct.at1 = value)
        inline def size : idx_t = struct._2
        inline def size_=(value: idx_t): Unit = (!struct.at2 = value)
        inline def is_negative : Boolean = struct._3
        inline def is_negative_=(value: Boolean): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates duckdb_bignum on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_bignum] = scala.scalanative.unsafe.alloc[duckdb_bignum](1)
    def apply(data : Ptr[uint8_t], size : idx_t, is_negative : Boolean)(using Zone): Ptr[duckdb_bignum] =
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).size = size
      (!____ptr).is_negative = is_negative
      ____ptr
    
    

  /**
   * BITs are composed of a byte pointer and a size. BIT byte data has 0 to 7 bits of padding. The first byte contains the number of padding bits. The padding bits of the second byte are set to 1, starting from the MSB. You must free `data` with `duckdb_free`.
  */
  opaque type duckdb_bit = CStruct2[Ptr[uint8_t], idx_t]
  
  object duckdb_bit:
    given _tag: Tag[duckdb_bit] = Tag.materializeCStruct2Tag[Ptr[uint8_t], idx_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_bit)
        inline def data : Ptr[uint8_t] = struct._1
        inline def data_=(value: Ptr[uint8_t]): Unit = (!struct.at1 = value)
        inline def size : idx_t = struct._2
        inline def size_=(value: idx_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates duckdb_bit on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_bit] = scala.scalanative.unsafe.alloc[duckdb_bit](1)
    def apply(data : Ptr[uint8_t], size : idx_t)(using Zone): Ptr[duckdb_bit] =
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).size = size
      ____ptr
    
    

  /**
   * BLOBs are composed of a byte pointer and a size. You must free `blob.data` with `duckdb_free`.
  */
  opaque type duckdb_blob = CStruct2[Ptr[Byte], idx_t]
  
  object duckdb_blob:
    given _tag: Tag[duckdb_blob] = Tag.materializeCStruct2Tag[Ptr[Byte], idx_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_blob)
        inline def data : Ptr[Byte] = struct._1
        inline def data_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def size : idx_t = struct._2
        inline def size_=(value: idx_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates duckdb_blob on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_blob] = scala.scalanative.unsafe.alloc[duckdb_blob](1)
    def apply(data : Ptr[Byte], size : idx_t)(using Zone): Ptr[duckdb_blob] =
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).size = size
      ____ptr
    
    

  /**
   * A column consists of a pointer to its internal data. Don't operate on this type directly. Instead, use functions such as `duckdb_column_data`, `duckdb_nullmask_data`, `duckdb_column_type`, and `duckdb_column_name`.
  */
  opaque type duckdb_column = CStruct5[Ptr[Byte], Ptr[Boolean], duckdb_type, CString, Ptr[Byte]]
  
  object duckdb_column:
    given _tag: Tag[duckdb_column] = Tag.materializeCStruct5Tag[Ptr[Byte], Ptr[Boolean], duckdb_type, CString, Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_column)
        inline def deprecated_data : Ptr[Byte] = struct._1
        inline def deprecated_data_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def deprecated_nullmask : Ptr[Boolean] = struct._2
        inline def deprecated_nullmask_=(value: Ptr[Boolean]): Unit = (!struct.at2 = value)
        inline def deprecated_type : duckdb_type = struct._3
        inline def deprecated_type_=(value: duckdb_type): Unit = (!struct.at3 = value)
        inline def deprecated_name : CString = struct._4
        inline def deprecated_name_=(value: CString): Unit = (!struct.at4 = value)
        inline def internal_data : Ptr[Byte] = struct._5
        inline def internal_data_=(value: Ptr[Byte]): Unit = (!struct.at5 = value)
      end extension
    
    // Allocates duckdb_column on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_column] = scala.scalanative.unsafe.alloc[duckdb_column](1)
    def apply(deprecated_data : Ptr[Byte], deprecated_nullmask : Ptr[Boolean], deprecated_type : duckdb_type, deprecated_name : CString, internal_data : Ptr[Byte])(using Zone): Ptr[duckdb_column] =
      val ____ptr = apply()
      (!____ptr).deprecated_data = deprecated_data
      (!____ptr).deprecated_nullmask = deprecated_nullmask
      (!____ptr).deprecated_type = deprecated_type
      (!____ptr).deprecated_name = deprecated_name
      (!____ptr).internal_data = internal_data
      ____ptr
    
    

  /**
   * DATE is stored as days since 1970-01-01. Use the `duckdb_from_date` and `duckdb_to_date` functions to extract individual information.
  */
  opaque type duckdb_date = CStruct1[int32_t]
  
  object duckdb_date:
    given _tag: Tag[duckdb_date] = Tag.materializeCStruct1Tag[int32_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_date)
        inline def days : int32_t = struct._1
        inline def days_=(value: int32_t): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates duckdb_date on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_date] = scala.scalanative.unsafe.alloc[duckdb_date](1)
    def apply(days : int32_t)(using Zone): Ptr[duckdb_date] =
      val ____ptr = apply()
      (!____ptr).days = days
      ____ptr
    
    

  opaque type duckdb_date_struct = CStruct3[int32_t, int8_t, int8_t]
  
  object duckdb_date_struct:
    given _tag: Tag[duckdb_date_struct] = Tag.materializeCStruct3Tag[int32_t, int8_t, int8_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_date_struct)
        inline def year : int32_t = struct._1
        inline def year_=(value: int32_t): Unit = (!struct.at1 = value)
        inline def month : int8_t = struct._2
        inline def month_=(value: int8_t): Unit = (!struct.at2 = value)
        inline def day : int8_t = struct._3
        inline def day_=(value: int8_t): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates duckdb_date_struct on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_date_struct] = scala.scalanative.unsafe.alloc[duckdb_date_struct](1)
    def apply(year : int32_t, month : int8_t, day : int8_t)(using Zone): Ptr[duckdb_date_struct] =
      val ____ptr = apply()
      (!____ptr).year = year
      (!____ptr).month = month
      (!____ptr).day = day
      ____ptr
    
    

  /**
   * DECIMAL is composed of a width and a scale. Their value is stored in a HUGEINT.
  */
  opaque type duckdb_decimal = CStruct3[uint8_t, uint8_t, duckdb_hugeint]
  
  object duckdb_decimal:
    given _tag: Tag[duckdb_decimal] = Tag.materializeCStruct3Tag[uint8_t, uint8_t, duckdb_hugeint]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_decimal)
        inline def width : uint8_t = struct._1
        inline def width_=(value: uint8_t): Unit = (!struct.at1 = value)
        inline def scale : uint8_t = struct._2
        inline def scale_=(value: uint8_t): Unit = (!struct.at2 = value)
        inline def value : duckdb_hugeint = struct._3
        inline def value_=(value: duckdb_hugeint): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates duckdb_decimal on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_decimal] = scala.scalanative.unsafe.alloc[duckdb_decimal](1)
    def apply(width : uint8_t, scale : uint8_t, value : duckdb_hugeint)(using Zone): Ptr[duckdb_decimal] =
      val ____ptr = apply()
      (!____ptr).width = width
      (!____ptr).scale = scale
      (!____ptr).value = value
      ____ptr
    
    

  /**
   * Passed to C API extension as a parameter to the entrypoint.
  */
  opaque type duckdb_extension_access = CStruct3[CFuncPtr2[duckdb_extension_info, CString, Unit], CFuncPtr1[duckdb_extension_info, Ptr[duckdb_database]], CFuncPtr2[duckdb_extension_info, CString, Ptr[Byte]]]
  
  object duckdb_extension_access:
    given _tag: Tag[duckdb_extension_access] = Tag.materializeCStruct3Tag[CFuncPtr2[duckdb_extension_info, CString, Unit], CFuncPtr1[duckdb_extension_info, Ptr[duckdb_database]], CFuncPtr2[duckdb_extension_info, CString, Ptr[Byte]]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_extension_access)
        inline def set_error : CFuncPtr2[duckdb_extension_info, CString, Unit] = struct._1
        inline def set_error_=(value: CFuncPtr2[duckdb_extension_info, CString, Unit]): Unit = (!struct.at1 = value)
        inline def get_database : CFuncPtr1[duckdb_extension_info, Ptr[duckdb_database]] = struct._2
        inline def get_database_=(value: CFuncPtr1[duckdb_extension_info, Ptr[duckdb_database]]): Unit = (!struct.at2 = value)
        inline def get_api : CFuncPtr2[duckdb_extension_info, CString, Ptr[Byte]] = struct._3
        inline def get_api_=(value: CFuncPtr2[duckdb_extension_info, CString, Ptr[Byte]]): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates duckdb_extension_access on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_extension_access] = scala.scalanative.unsafe.alloc[duckdb_extension_access](1)
    def apply(set_error : CFuncPtr2[duckdb_extension_info, CString, Unit], get_database : CFuncPtr1[duckdb_extension_info, Ptr[duckdb_database]], get_api : CFuncPtr2[duckdb_extension_info, CString, Ptr[Byte]])(using Zone): Ptr[duckdb_extension_access] =
      val ____ptr = apply()
      (!____ptr).set_error = set_error
      (!____ptr).get_database = get_database
      (!____ptr).get_api = get_api
      ____ptr
    
    

  /**
   * HUGEINT is composed of a lower and upper component. Its value is upper * 2^64 + lower. For simplified usage, use `duckdb_hugeint_to_double` and `duckdb_double_to_hugeint`.
  */
  opaque type duckdb_hugeint = CStruct2[uint64_t, int64_t]
  
  object duckdb_hugeint:
    given _tag: Tag[duckdb_hugeint] = Tag.materializeCStruct2Tag[uint64_t, int64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_hugeint)
        inline def lower : uint64_t = struct._1
        inline def lower_=(value: uint64_t): Unit = (!struct.at1 = value)
        inline def upper : int64_t = struct._2
        inline def upper_=(value: int64_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates duckdb_hugeint on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_hugeint] = scala.scalanative.unsafe.alloc[duckdb_hugeint](1)
    def apply(lower : uint64_t, upper : int64_t)(using Zone): Ptr[duckdb_hugeint] =
      val ____ptr = apply()
      (!____ptr).lower = lower
      (!____ptr).upper = upper
      ____ptr
    
    

  /**
   * INTERVAL is stored in months, days, and micros.
  */
  opaque type duckdb_interval = CStruct3[int32_t, int32_t, int64_t]
  
  object duckdb_interval:
    given _tag: Tag[duckdb_interval] = Tag.materializeCStruct3Tag[int32_t, int32_t, int64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_interval)
        inline def months : int32_t = struct._1
        inline def months_=(value: int32_t): Unit = (!struct.at1 = value)
        inline def days : int32_t = struct._2
        inline def days_=(value: int32_t): Unit = (!struct.at2 = value)
        inline def micros : int64_t = struct._3
        inline def micros_=(value: int64_t): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates duckdb_interval on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_interval] = scala.scalanative.unsafe.alloc[duckdb_interval](1)
    def apply(months : int32_t, days : int32_t, micros : int64_t)(using Zone): Ptr[duckdb_interval] =
      val ____ptr = apply()
      (!____ptr).months = months
      (!____ptr).days = days
      (!____ptr).micros = micros
      ____ptr
    
    

  /**
   * DuckDB's LISTs are composed of a 'parent' vector holding metadata of each list, and a child vector holding the entries of the lists. The `duckdb_list_entry` struct contains the internal representation of a LIST metadata entry. A metadata entry contains the length of the list, and its offset in the child vector.
  */
  opaque type duckdb_list_entry = CStruct2[uint64_t, uint64_t]
  
  object duckdb_list_entry:
    given _tag: Tag[duckdb_list_entry] = Tag.materializeCStruct2Tag[uint64_t, uint64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_list_entry)
        inline def offset : uint64_t = struct._1
        inline def offset_=(value: uint64_t): Unit = (!struct.at1 = value)
        inline def length : uint64_t = struct._2
        inline def length_=(value: uint64_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates duckdb_list_entry on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_list_entry] = scala.scalanative.unsafe.alloc[duckdb_list_entry](1)
    def apply(offset : uint64_t, length : uint64_t)(using Zone): Ptr[duckdb_list_entry] =
      val ____ptr = apply()
      (!____ptr).offset = offset
      (!____ptr).length = length
      ____ptr
    
    

  /**
   * A type holding information about the query execution progress.
  */
  opaque type duckdb_query_progress_type = CStruct3[Double, uint64_t, uint64_t]
  
  object duckdb_query_progress_type:
    given _tag: Tag[duckdb_query_progress_type] = Tag.materializeCStruct3Tag[Double, uint64_t, uint64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_query_progress_type)
        inline def percentage : Double = struct._1
        inline def percentage_=(value: Double): Unit = (!struct.at1 = value)
        inline def rows_processed : uint64_t = struct._2
        inline def rows_processed_=(value: uint64_t): Unit = (!struct.at2 = value)
        inline def total_rows_to_process : uint64_t = struct._3
        inline def total_rows_to_process_=(value: uint64_t): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates duckdb_query_progress_type on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_query_progress_type] = scala.scalanative.unsafe.alloc[duckdb_query_progress_type](1)
    def apply(percentage : Double, rows_processed : uint64_t, total_rows_to_process : uint64_t)(using Zone): Ptr[duckdb_query_progress_type] =
      val ____ptr = apply()
      (!____ptr).percentage = percentage
      (!____ptr).rows_processed = rows_processed
      (!____ptr).total_rows_to_process = total_rows_to_process
      ____ptr
    
    

  /**
   * A query result consists of a pointer to its internal data. Must be freed with 'duckdb_destroy_result'.
  */
  opaque type duckdb_result = CStruct6[idx_t, idx_t, idx_t, Ptr[duckdb_column], CString, Ptr[Byte]]
  
  object duckdb_result:
    given _tag: Tag[duckdb_result] = Tag.materializeCStruct6Tag[idx_t, idx_t, idx_t, Ptr[duckdb_column], CString, Ptr[Byte]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_result)
        inline def deprecated_column_count : idx_t = struct._1
        inline def deprecated_column_count_=(value: idx_t): Unit = (!struct.at1 = value)
        inline def deprecated_row_count : idx_t = struct._2
        inline def deprecated_row_count_=(value: idx_t): Unit = (!struct.at2 = value)
        inline def deprecated_rows_changed : idx_t = struct._3
        inline def deprecated_rows_changed_=(value: idx_t): Unit = (!struct.at3 = value)
        inline def deprecated_columns : Ptr[duckdb_column] = struct._4
        inline def deprecated_columns_=(value: Ptr[duckdb_column]): Unit = (!struct.at4 = value)
        inline def deprecated_error_message : CString = struct._5
        inline def deprecated_error_message_=(value: CString): Unit = (!struct.at5 = value)
        inline def internal_data : Ptr[Byte] = struct._6
        inline def internal_data_=(value: Ptr[Byte]): Unit = (!struct.at6 = value)
      end extension
    
    // Allocates duckdb_result on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_result] = scala.scalanative.unsafe.alloc[duckdb_result](1)
    def apply(deprecated_column_count : idx_t, deprecated_row_count : idx_t, deprecated_rows_changed : idx_t, deprecated_columns : Ptr[duckdb_column], deprecated_error_message : CString, internal_data : Ptr[Byte])(using Zone): Ptr[duckdb_result] =
      val ____ptr = apply()
      (!____ptr).deprecated_column_count = deprecated_column_count
      (!____ptr).deprecated_row_count = deprecated_row_count
      (!____ptr).deprecated_rows_changed = deprecated_rows_changed
      (!____ptr).deprecated_columns = deprecated_columns
      (!____ptr).deprecated_error_message = deprecated_error_message
      (!____ptr).internal_data = internal_data
      ____ptr
    
    

  /**
   * Strings are composed of a `char` pointer and a size. You must free `string.data` with `duckdb_free`.
  */
  opaque type duckdb_string = CStruct2[CString, idx_t]
  
  object duckdb_string:
    given _tag: Tag[duckdb_string] = Tag.materializeCStruct2Tag[CString, idx_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_string)
        inline def data : CString = struct._1
        inline def data_=(value: CString): Unit = (!struct.at1 = value)
        inline def size : idx_t = struct._2
        inline def size_=(value: idx_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates duckdb_string on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_string] = scala.scalanative.unsafe.alloc[duckdb_string](1)
    def apply(data : CString, size : idx_t)(using Zone): Ptr[duckdb_string] =
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).size = size
      ____ptr
    
    

  /**
   * The internal representation of a VARCHAR (string_t). If the VARCHAR does not exceed 12 characters, then we inline it. Otherwise, we inline a four-byte prefix for faster string comparisons and store a pointer to the remaining characters. This is a non- owning structure, i.e., it does not have to be freed.
  */
  opaque type duckdb_string_t = CStruct1[duckdb_string_t_Value]
  
  object duckdb_string_t:
    given _tag: Tag[duckdb_string_t] = Tag.materializeCStruct1Tag[duckdb_string_t_Value]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_string_t)
        inline def value : duckdb_string_t_Value = struct._1
        inline def value_=(value: duckdb_string_t_Value): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates duckdb_string_t on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_string_t] = scala.scalanative.unsafe.alloc[duckdb_string_t](1)
    def apply(value : duckdb_string_t_Value)(using Zone): Ptr[duckdb_string_t] =
      val ____ptr = apply()
      (!____ptr).value = value
      ____ptr
    
    
  opaque type duckdb_string_t_Value = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
  object duckdb_string_t_Value:
    given _tag: Tag[duckdb_string_t_Value] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
    
    def apply()(using Zone): Ptr[duckdb_string_t_Value] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[duckdb_string_t_Value](1)
      ___ptr
    
    @scala.annotation.targetName("apply_pointer")
    def apply(pointer: duckdb_string_t_Value_Pointer)(using Zone): Ptr[duckdb_string_t_Value] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[duckdb_string_t_Value](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[duckdb_string_t_Value_Pointer]].update(0, pointer)
      ___ptr
    
    @scala.annotation.targetName("apply_inlined")
    def apply(inlined: duckdb_string_t_Value_Inlined)(using Zone): Ptr[duckdb_string_t_Value] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[duckdb_string_t_Value](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[duckdb_string_t_Value_Inlined]].update(0, inlined)
      ___ptr
    
    extension (struct: duckdb_string_t_Value)
      inline def pointer : duckdb_string_t_Value_Pointer = !struct.at(0).asInstanceOf[Ptr[duckdb_string_t_Value_Pointer]]
      inline def pointer_=(value: duckdb_string_t_Value_Pointer): Unit = !struct.at(0).asInstanceOf[Ptr[duckdb_string_t_Value_Pointer]] = value
      inline def inlined : duckdb_string_t_Value_Inlined = !struct.at(0).asInstanceOf[Ptr[duckdb_string_t_Value_Inlined]]
      inline def inlined_=(value: duckdb_string_t_Value_Inlined): Unit = !struct.at(0).asInstanceOf[Ptr[duckdb_string_t_Value_Inlined]] = value
  opaque type duckdb_string_t_Value_Pointer = CStruct3[uint32_t, CArray[CChar, Nat._4], CString]
  
  object duckdb_string_t_Value_Pointer:
    given _tag: Tag[duckdb_string_t_Value_Pointer] = Tag.materializeCStruct3Tag[uint32_t, CArray[CChar, Nat._4], CString]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_string_t_Value_Pointer)
        inline def length : uint32_t = struct._1
        inline def length_=(value: uint32_t): Unit = (!struct.at1 = value)
        inline def prefix : CArray[CChar, Nat._4] = struct._2
        inline def prefix_=(value: CArray[CChar, Nat._4]): Unit = (!struct.at2 = value)
        inline def ptr : CString = struct._3
        inline def ptr_=(value: CString): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates duckdb_string_t_Value_Pointer on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_string_t_Value_Pointer] = scala.scalanative.unsafe.alloc[duckdb_string_t_Value_Pointer](1)
    def apply(length : uint32_t, prefix : CArray[CChar, Nat._4], ptr : CString)(using Zone): Ptr[duckdb_string_t_Value_Pointer] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).prefix = prefix
      (!____ptr).ptr = ptr
      ____ptr
    
    
  opaque type duckdb_string_t_Value_Inlined = CStruct2[uint32_t, CArray[CChar, Nat.Digit2[Nat._1, Nat._2]]]
  
  object duckdb_string_t_Value_Inlined:
    given _tag: Tag[duckdb_string_t_Value_Inlined] = Tag.materializeCStruct2Tag[uint32_t, CArray[CChar, Nat.Digit2[Nat._1, Nat._2]]]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_string_t_Value_Inlined)
        inline def length : uint32_t = struct._1
        inline def length_=(value: uint32_t): Unit = (!struct.at1 = value)
        inline def inlined : CArray[CChar, Nat.Digit2[Nat._1, Nat._2]] = struct._2
        inline def inlined_=(value: CArray[CChar, Nat.Digit2[Nat._1, Nat._2]]): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates duckdb_string_t_Value_Inlined on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_string_t_Value_Inlined] = scala.scalanative.unsafe.alloc[duckdb_string_t_Value_Inlined](1)
    def apply(length : uint32_t, inlined : CArray[CChar, Nat.Digit2[Nat._1, Nat._2]])(using Zone): Ptr[duckdb_string_t_Value_Inlined] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).inlined = inlined
      ____ptr
    
    

  /**
   * TIME is stored as microseconds since 00:00:00. Use the `duckdb_from_time` and `duckdb_to_time` functions to extract individual information.
  */
  opaque type duckdb_time = CStruct1[int64_t]
  
  object duckdb_time:
    given _tag: Tag[duckdb_time] = Tag.materializeCStruct1Tag[int64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_time)
        inline def micros : int64_t = struct._1
        inline def micros_=(value: int64_t): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates duckdb_time on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_time] = scala.scalanative.unsafe.alloc[duckdb_time](1)
    def apply(micros : int64_t)(using Zone): Ptr[duckdb_time] =
      val ____ptr = apply()
      (!____ptr).micros = micros
      ____ptr
    
    

  /**
   * TIME_NS is stored as nanoseconds since 00:00:00.
  */
  opaque type duckdb_time_ns = CStruct1[int64_t]
  
  object duckdb_time_ns:
    given _tag: Tag[duckdb_time_ns] = Tag.materializeCStruct1Tag[int64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_time_ns)
        inline def nanos : int64_t = struct._1
        inline def nanos_=(value: int64_t): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates duckdb_time_ns on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_time_ns] = scala.scalanative.unsafe.alloc[duckdb_time_ns](1)
    def apply(nanos : int64_t)(using Zone): Ptr[duckdb_time_ns] =
      val ____ptr = apply()
      (!____ptr).nanos = nanos
      ____ptr
    
    

  opaque type duckdb_time_struct = CStruct4[int8_t, int8_t, int8_t, int32_t]
  
  object duckdb_time_struct:
    given _tag: Tag[duckdb_time_struct] = Tag.materializeCStruct4Tag[int8_t, int8_t, int8_t, int32_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_time_struct)
        inline def hour : int8_t = struct._1
        inline def hour_=(value: int8_t): Unit = (!struct.at1 = value)
        inline def min : int8_t = struct._2
        inline def min_=(value: int8_t): Unit = (!struct.at2 = value)
        inline def sec : int8_t = struct._3
        inline def sec_=(value: int8_t): Unit = (!struct.at3 = value)
        inline def micros : int32_t = struct._4
        inline def micros_=(value: int32_t): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates duckdb_time_struct on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_time_struct] = scala.scalanative.unsafe.alloc[duckdb_time_struct](1)
    def apply(hour : int8_t, min : int8_t, sec : int8_t, micros : int32_t)(using Zone): Ptr[duckdb_time_struct] =
      val ____ptr = apply()
      (!____ptr).hour = hour
      (!____ptr).min = min
      (!____ptr).sec = sec
      (!____ptr).micros = micros
      ____ptr
    
    

  /**
   * TIME_TZ is stored as 40 bits for the int64_t microseconds, and 24 bits for the int32_t offset. Use the `duckdb_from_time_tz` function to extract individual information.
  */
  opaque type duckdb_time_tz = CStruct1[uint64_t]
  
  object duckdb_time_tz:
    given _tag: Tag[duckdb_time_tz] = Tag.materializeCStruct1Tag[uint64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_time_tz)
        inline def bits : uint64_t = struct._1
        inline def bits_=(value: uint64_t): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates duckdb_time_tz on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_time_tz] = scala.scalanative.unsafe.alloc[duckdb_time_tz](1)
    def apply(bits : uint64_t)(using Zone): Ptr[duckdb_time_tz] =
      val ____ptr = apply()
      (!____ptr).bits = bits
      ____ptr
    
    

  opaque type duckdb_time_tz_struct = CStruct2[duckdb_time_struct, int32_t]
  
  object duckdb_time_tz_struct:
    given _tag: Tag[duckdb_time_tz_struct] = Tag.materializeCStruct2Tag[duckdb_time_struct, int32_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_time_tz_struct)
        inline def time : duckdb_time_struct = struct._1
        inline def time_=(value: duckdb_time_struct): Unit = (!struct.at1 = value)
        inline def offset : int32_t = struct._2
        inline def offset_=(value: int32_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates duckdb_time_tz_struct on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_time_tz_struct] = scala.scalanative.unsafe.alloc[duckdb_time_tz_struct](1)
    def apply(time : duckdb_time_struct, offset : int32_t)(using Zone): Ptr[duckdb_time_tz_struct] =
      val ____ptr = apply()
      (!____ptr).time = time
      (!____ptr).offset = offset
      ____ptr
    
    

  /**
   * TIMESTAMP is stored as microseconds since 1970-01-01. Use the `duckdb_from_timestamp` and `duckdb_to_timestamp` functions to extract individual information.
  */
  opaque type duckdb_timestamp = CStruct1[int64_t]
  
  object duckdb_timestamp:
    given _tag: Tag[duckdb_timestamp] = Tag.materializeCStruct1Tag[int64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_timestamp)
        inline def micros : int64_t = struct._1
        inline def micros_=(value: int64_t): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates duckdb_timestamp on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_timestamp] = scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    def apply(micros : int64_t)(using Zone): Ptr[duckdb_timestamp] =
      val ____ptr = apply()
      (!____ptr).micros = micros
      ____ptr
    
    

  /**
   * TIMESTAMP_MS is stored as milliseconds since 1970-01-01.
  */
  opaque type duckdb_timestamp_ms = CStruct1[int64_t]
  
  object duckdb_timestamp_ms:
    given _tag: Tag[duckdb_timestamp_ms] = Tag.materializeCStruct1Tag[int64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_timestamp_ms)
        inline def millis : int64_t = struct._1
        inline def millis_=(value: int64_t): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates duckdb_timestamp_ms on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_timestamp_ms] = scala.scalanative.unsafe.alloc[duckdb_timestamp_ms](1)
    def apply(millis : int64_t)(using Zone): Ptr[duckdb_timestamp_ms] =
      val ____ptr = apply()
      (!____ptr).millis = millis
      ____ptr
    
    

  /**
   * TIMESTAMP_NS is stored as nanoseconds since 1970-01-01.
  */
  opaque type duckdb_timestamp_ns = CStruct1[int64_t]
  
  object duckdb_timestamp_ns:
    given _tag: Tag[duckdb_timestamp_ns] = Tag.materializeCStruct1Tag[int64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_timestamp_ns)
        inline def nanos : int64_t = struct._1
        inline def nanos_=(value: int64_t): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates duckdb_timestamp_ns on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_timestamp_ns] = scala.scalanative.unsafe.alloc[duckdb_timestamp_ns](1)
    def apply(nanos : int64_t)(using Zone): Ptr[duckdb_timestamp_ns] =
      val ____ptr = apply()
      (!____ptr).nanos = nanos
      ____ptr
    
    

  /**
   * TIMESTAMP_S is stored as seconds since 1970-01-01.
  */
  opaque type duckdb_timestamp_s = CStruct1[int64_t]
  
  object duckdb_timestamp_s:
    given _tag: Tag[duckdb_timestamp_s] = Tag.materializeCStruct1Tag[int64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_timestamp_s)
        inline def seconds : int64_t = struct._1
        inline def seconds_=(value: int64_t): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates duckdb_timestamp_s on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_timestamp_s] = scala.scalanative.unsafe.alloc[duckdb_timestamp_s](1)
    def apply(seconds : int64_t)(using Zone): Ptr[duckdb_timestamp_s] =
      val ____ptr = apply()
      (!____ptr).seconds = seconds
      ____ptr
    
    

  opaque type duckdb_timestamp_struct = CStruct2[duckdb_date_struct, duckdb_time_struct]
  
  object duckdb_timestamp_struct:
    given _tag: Tag[duckdb_timestamp_struct] = Tag.materializeCStruct2Tag[duckdb_date_struct, duckdb_time_struct]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_timestamp_struct)
        inline def date : duckdb_date_struct = struct._1
        inline def date_=(value: duckdb_date_struct): Unit = (!struct.at1 = value)
        inline def time : duckdb_time_struct = struct._2
        inline def time_=(value: duckdb_time_struct): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates duckdb_timestamp_struct on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_timestamp_struct] = scala.scalanative.unsafe.alloc[duckdb_timestamp_struct](1)
    def apply(date : duckdb_date_struct, time : duckdb_time_struct)(using Zone): Ptr[duckdb_timestamp_struct] =
      val ____ptr = apply()
      (!____ptr).date = date
      (!____ptr).time = time
      ____ptr
    
    

  /**
   * UHUGEINT is composed of a lower and upper component. Its value is upper * 2^64 + lower. For simplified usage, use `duckdb_uhugeint_to_double` and `duckdb_double_to_uhugeint`.
  */
  opaque type duckdb_uhugeint = CStruct2[uint64_t, uint64_t]
  
  object duckdb_uhugeint:
    given _tag: Tag[duckdb_uhugeint] = Tag.materializeCStruct2Tag[uint64_t, uint64_t]
    
    export fields.*
    private[duckdb] object fields:
      extension (struct: duckdb_uhugeint)
        inline def lower : uint64_t = struct._1
        inline def lower_=(value: uint64_t): Unit = (!struct.at1 = value)
        inline def upper : uint64_t = struct._2
        inline def upper_=(value: uint64_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates duckdb_uhugeint on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[duckdb_uhugeint] = scala.scalanative.unsafe.alloc[duckdb_uhugeint](1)
    def apply(lower : uint64_t, upper : uint64_t)(using Zone): Ptr[duckdb_uhugeint] =
      val ____ptr = apply()
      (!____ptr).lower = lower
      (!____ptr).upper = upper
      ____ptr
    
    


@extern
private[duckdb] object extern_functions:
  import _root_.duckdb.predef.*
  import _root_.duckdb.enumerations.*
  import _root_.duckdb.aliases.*
  import _root_.duckdb.structs.*
  private[duckdb] def __sn_wrap_duckdb_duckdb_append_date(appender : duckdb_appender, value : Ptr[duckdb_date]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_append_hugeint(appender : duckdb_appender, value : Ptr[duckdb_hugeint]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_append_interval(appender : duckdb_appender, value : Ptr[duckdb_interval]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_append_time(appender : duckdb_appender, value : Ptr[duckdb_time]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_append_timestamp(appender : duckdb_appender, value : Ptr[duckdb_timestamp]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_append_uhugeint(appender : duckdb_appender, value : Ptr[duckdb_uhugeint]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_date(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_date]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_decimal(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_decimal]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_hugeint(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_hugeint]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_interval(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_interval]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_time(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_time]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_timestamp(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_timestamp]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_timestamp_tz(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_timestamp]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_uhugeint(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_uhugeint]): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_bignum(input : Ptr[duckdb_bignum]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_bit(input : Ptr[duckdb_bit]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_date(input : Ptr[duckdb_date]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_decimal(input : Ptr[duckdb_decimal]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_hugeint(input : Ptr[duckdb_hugeint]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_interval(input : Ptr[duckdb_interval]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_time(input : Ptr[duckdb_time]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_time_ns(input : Ptr[duckdb_time_ns]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_time_tz(micros : int64_t, offset : int32_t, __return : Ptr[duckdb_time_tz]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_time_tz_value(value : Ptr[duckdb_time_tz]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_timestamp(input : Ptr[duckdb_timestamp]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_timestamp_ms(input : Ptr[duckdb_timestamp_ms]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_timestamp_ns(input : Ptr[duckdb_timestamp_ns]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_timestamp_s(input : Ptr[duckdb_timestamp_s]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_timestamp_tz(input : Ptr[duckdb_timestamp]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_uhugeint(input : Ptr[duckdb_uhugeint]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_create_uuid(input : Ptr[duckdb_uhugeint]): duckdb_value = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_decimal_to_double(`val` : Ptr[duckdb_decimal]): Double = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_double_to_decimal(`val` : Double, width : uint8_t, scale : uint8_t, __return : Ptr[duckdb_decimal]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_double_to_hugeint(`val` : Double, __return : Ptr[duckdb_hugeint]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_double_to_uhugeint(`val` : Double, __return : Ptr[duckdb_uhugeint]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_fetch_chunk(result : Ptr[duckdb_result]): duckdb_data_chunk = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_from_date(date : Ptr[duckdb_date], __return : Ptr[duckdb_date_struct]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_from_time(time : Ptr[duckdb_time], __return : Ptr[duckdb_time_struct]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_from_time_tz(micros : Ptr[duckdb_time_tz], __return : Ptr[duckdb_time_tz_struct]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_from_timestamp(ts : Ptr[duckdb_timestamp], __return : Ptr[duckdb_timestamp_struct]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_bignum(`val` : duckdb_value, __return : Ptr[duckdb_bignum]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_bit(`val` : duckdb_value, __return : Ptr[duckdb_bit]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_blob(`val` : duckdb_value, __return : Ptr[duckdb_blob]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_date(`val` : duckdb_value, __return : Ptr[duckdb_date]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_decimal(`val` : duckdb_value, __return : Ptr[duckdb_decimal]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_hugeint(`val` : duckdb_value, __return : Ptr[duckdb_hugeint]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_interval(`val` : duckdb_value, __return : Ptr[duckdb_interval]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_time(`val` : duckdb_value, __return : Ptr[duckdb_time]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_time_ns(`val` : duckdb_value, __return : Ptr[duckdb_time_ns]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_time_tz(`val` : duckdb_value, __return : Ptr[duckdb_time_tz]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_timestamp(`val` : duckdb_value, __return : Ptr[duckdb_timestamp]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_timestamp_ms(`val` : duckdb_value, __return : Ptr[duckdb_timestamp_ms]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_timestamp_ns(`val` : duckdb_value, __return : Ptr[duckdb_timestamp_ns]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_timestamp_s(`val` : duckdb_value, __return : Ptr[duckdb_timestamp_s]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_timestamp_tz(`val` : duckdb_value, __return : Ptr[duckdb_timestamp]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_uhugeint(`val` : duckdb_value, __return : Ptr[duckdb_uhugeint]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_get_uuid(`val` : duckdb_value, __return : Ptr[duckdb_uhugeint]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_hugeint_to_double(`val` : Ptr[duckdb_hugeint]): Double = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_is_finite_date(date : Ptr[duckdb_date]): Boolean = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_is_finite_timestamp(ts : Ptr[duckdb_timestamp]): Boolean = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_is_finite_timestamp_ms(ts : Ptr[duckdb_timestamp_ms]): Boolean = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_is_finite_timestamp_ns(ts : Ptr[duckdb_timestamp_ns]): Boolean = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_is_finite_timestamp_s(ts : Ptr[duckdb_timestamp_s]): Boolean = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_query_progress(connection : duckdb_connection, __return : Ptr[duckdb_query_progress_type]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_result_arrow_array(result : Ptr[duckdb_result], chunk : duckdb_data_chunk, out_array : Ptr[duckdb_arrow_array]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_result_chunk_count(result : Ptr[duckdb_result]): idx_t = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_result_get_chunk(result : Ptr[duckdb_result], chunk_index : idx_t): duckdb_data_chunk = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_result_is_streaming(result : Ptr[duckdb_result]): Boolean = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_result_return_type(result : Ptr[duckdb_result]): duckdb_result_type = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_result_statement_type(result : Ptr[duckdb_result]): duckdb_statement_type = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_stream_fetch_chunk(result : Ptr[duckdb_result]): duckdb_data_chunk = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_string_is_inlined(string : Ptr[duckdb_string_t]): Boolean = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_string_t_length(string : Ptr[duckdb_string_t]): uint32_t = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_to_date(date : Ptr[duckdb_date_struct], __return : Ptr[duckdb_date]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_to_time(time : Ptr[duckdb_time_struct], __return : Ptr[duckdb_time]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_to_timestamp(ts : Ptr[duckdb_timestamp_struct], __return : Ptr[duckdb_timestamp]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_uhugeint_to_double(`val` : Ptr[duckdb_uhugeint]): Double = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_blob(result : Ptr[duckdb_result], col : idx_t, row : idx_t, __return : Ptr[duckdb_blob]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_date(result : Ptr[duckdb_result], col : idx_t, row : idx_t, __return : Ptr[duckdb_date]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_decimal(result : Ptr[duckdb_result], col : idx_t, row : idx_t, __return : Ptr[duckdb_decimal]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_hugeint(result : Ptr[duckdb_result], col : idx_t, row : idx_t, __return : Ptr[duckdb_hugeint]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_interval(result : Ptr[duckdb_result], col : idx_t, row : idx_t, __return : Ptr[duckdb_interval]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_string(result : Ptr[duckdb_result], col : idx_t, row : idx_t, __return : Ptr[duckdb_string]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_string_internal(result : Ptr[duckdb_result], col : idx_t, row : idx_t, __return : Ptr[duckdb_string]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_time(result : Ptr[duckdb_result], col : idx_t, row : idx_t, __return : Ptr[duckdb_time]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_timestamp(result : Ptr[duckdb_result], col : idx_t, row : idx_t, __return : Ptr[duckdb_timestamp]): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_uhugeint(result : Ptr[duckdb_result], col : idx_t, row : idx_t, __return : Ptr[duckdb_uhugeint]): Unit = extern

  /**
   * Adds the aggregate function as a new overload to the aggregate function set.
  */
  def duckdb_add_aggregate_function_to_set(set : duckdb_aggregate_function_set, function : duckdb_aggregate_function): duckdb_state = extern

  /**
   * Add a replacement scan definition to the specified database.
  */
  def duckdb_add_replacement_scan(db : duckdb_database, replacement : duckdb_replacement_callback_t, extra_data : Ptr[Byte], delete_callback : duckdb_delete_callback_t): Unit = extern

  /**
   * Adds the scalar function as a new overload to the scalar function set.
  */
  def duckdb_add_scalar_function_to_set(set : duckdb_scalar_function_set, function : duckdb_scalar_function): duckdb_state = extern

  /**
   * Adds a parameter to the aggregate function.
  */
  def duckdb_aggregate_function_add_parameter(aggregate_function : duckdb_aggregate_function, `type` : duckdb_logical_type): Unit = extern

  /**
   * Retrieves the extra info of the function as set in `duckdb_aggregate_function_set_extra_info`.
  */
  def duckdb_aggregate_function_get_extra_info(info : duckdb_function_info): Ptr[Byte] = extern

  /**
   * Sets the state destructor callback of the aggregate function (optional)
  */
  def duckdb_aggregate_function_set_destructor(aggregate_function : duckdb_aggregate_function, destroy : duckdb_aggregate_destroy_t): Unit = extern

  /**
   * Report that an error has occurred while executing the aggregate function.
  */
  def duckdb_aggregate_function_set_error(info : duckdb_function_info, error : CString): Unit = extern

  /**
   * Assigns extra information to the scalar function that can be fetched during binding, etc.
  */
  def duckdb_aggregate_function_set_extra_info(aggregate_function : duckdb_aggregate_function, extra_info : Ptr[Byte], destroy : duckdb_delete_callback_t): Unit = extern

  /**
   * Sets the main functions of the aggregate function.
  */
  def duckdb_aggregate_function_set_functions(aggregate_function : duckdb_aggregate_function, state_size : duckdb_aggregate_state_size, state_init : duckdb_aggregate_init_t, update : duckdb_aggregate_update_t, combine : duckdb_aggregate_combine_t, finalize : duckdb_aggregate_finalize_t): Unit = extern

  /**
   * Sets the name of the given aggregate function.
  */
  def duckdb_aggregate_function_set_name(aggregate_function : duckdb_aggregate_function, name : CString): Unit = extern

  /**
   * Sets the return type of the aggregate function.
  */
  def duckdb_aggregate_function_set_return_type(aggregate_function : duckdb_aggregate_function, `type` : duckdb_logical_type): Unit = extern

  /**
   * Sets the NULL handling of the aggregate function to SPECIAL_HANDLING.
  */
  def duckdb_aggregate_function_set_special_handling(aggregate_function : duckdb_aggregate_function): Unit = extern

  /**
   * Append a blob value to the appender.
  */
  def duckdb_append_blob(appender : duckdb_appender, data : Ptr[Byte], length : idx_t): duckdb_state = extern

  /**
   * Append a bool value to the appender.
  */
  def duckdb_append_bool(appender : duckdb_appender, value : Boolean): duckdb_state = extern

  /**
   * Appends a pre-filled data chunk to the specified appender. Attempts casting, if the data chunk types do not match the active appender types.
  */
  def duckdb_append_data_chunk(appender : duckdb_appender, chunk : duckdb_data_chunk): duckdb_state = extern

  /**
   * Append a DEFAULT value (NULL if DEFAULT not available for column) to the appender.
  */
  def duckdb_append_default(appender : duckdb_appender): duckdb_state = extern

  /**
   * Append a DEFAULT value, at the specified row and column, (NULL if DEFAULT not available for column) to the chunk created from the specified appender. The default value of the column must be a constant value. Non-deterministic expressions like nextval('seq') or random() are not supported.
  */
  def duckdb_append_default_to_chunk(appender : duckdb_appender, chunk : duckdb_data_chunk, col : idx_t, row : idx_t): duckdb_state = extern

  /**
   * Append a double value to the appender.
  */
  def duckdb_append_double(appender : duckdb_appender, value : Double): duckdb_state = extern

  /**
   * Append a float value to the appender.
  */
  def duckdb_append_float(appender : duckdb_appender, value : Float): duckdb_state = extern

  /**
   * Append an int16_t value to the appender.
  */
  def duckdb_append_int16(appender : duckdb_appender, value : int16_t): duckdb_state = extern

  /**
   * Append an int32_t value to the appender.
  */
  def duckdb_append_int32(appender : duckdb_appender, value : int32_t): duckdb_state = extern

  /**
   * Append an int64_t value to the appender.
  */
  def duckdb_append_int64(appender : duckdb_appender, value : int64_t): duckdb_state = extern

  /**
   * Append an int8_t value to the appender.
  */
  def duckdb_append_int8(appender : duckdb_appender, value : int8_t): duckdb_state = extern

  /**
   * Append a NULL value to the appender (of any type).
  */
  def duckdb_append_null(appender : duckdb_appender): duckdb_state = extern

  /**
   * Append a uint16_t value to the appender.
  */
  def duckdb_append_uint16(appender : duckdb_appender, value : uint16_t): duckdb_state = extern

  /**
   * Append a uint32_t value to the appender.
  */
  def duckdb_append_uint32(appender : duckdb_appender, value : uint32_t): duckdb_state = extern

  /**
   * Append a uint64_t value to the appender.
  */
  def duckdb_append_uint64(appender : duckdb_appender, value : uint64_t): duckdb_state = extern

  /**
   * Append a uint8_t value to the appender.
  */
  def duckdb_append_uint8(appender : duckdb_appender, value : uint8_t): duckdb_state = extern

  /**
   * Append a duckdb_value to the appender.
  */
  def duckdb_append_value(appender : duckdb_appender, value : duckdb_value): duckdb_state = extern

  /**
   * Append a varchar value to the appender.
  */
  def duckdb_append_varchar(appender : duckdb_appender, `val` : CString): duckdb_state = extern

  /**
   * Append a varchar value to the appender.
  */
  def duckdb_append_varchar_length(appender : duckdb_appender, `val` : CString, length : idx_t): duckdb_state = extern

  /**
   * Appends a column to the active column list of the appender. Immediately flushes all previous data.
  */
  def duckdb_appender_add_column(appender : duckdb_appender, name : CString): duckdb_state = extern

  /**
   * A nop function, provided for backwards compatibility reasons. Does nothing. Only `duckdb_appender_end_row` is required.
  */
  def duckdb_appender_begin_row(appender : duckdb_appender): duckdb_state = extern

  /**
   * Removes all columns from the active column list of the appender, resetting the appender to treat all columns as active. Immediately flushes all previous data.
  */
  def duckdb_appender_clear_columns(appender : duckdb_appender): duckdb_state = extern

  /**
   * Closes the appender by flushing all intermediate states and closing it for further appends. If flushing the data triggers a constraint violation or any other error, then all data is invalidated, and this function returns DuckDBError. Call duckdb_appender_error_data to obtain the error data followed by duckdb_appender_destroy to destroy the invalidated appender.
  */
  def duckdb_appender_close(appender : duckdb_appender): duckdb_state = extern

  /**
   * Returns the number of columns that belong to the appender. If there is no active column list, then this equals the table's physical columns.
  */
  def duckdb_appender_column_count(appender : duckdb_appender): idx_t = extern

  /**
   * Returns the type of the column at the specified index. This is either a type in the active column list, or the same type as a column in the receiving table.
  */
  def duckdb_appender_column_type(appender : duckdb_appender, col_idx : idx_t): duckdb_logical_type = extern

  /**
   * Creates an appender object.
  */
  def duckdb_appender_create(connection : duckdb_connection, schema : CString, table : CString, out_appender : Ptr[duckdb_appender]): duckdb_state = extern

  /**
   * Creates an appender object.
  */
  def duckdb_appender_create_ext(connection : duckdb_connection, catalog : CString, schema : CString, table : CString, out_appender : Ptr[duckdb_appender]): duckdb_state = extern

  /**
   * Creates an appender object that executes the given query with any data appended to it.
  */
  def duckdb_appender_create_query(connection : duckdb_connection, query : CString, column_count : idx_t, types : Ptr[duckdb_logical_type], table_name : CString, column_names : Ptr[CString], out_appender : Ptr[duckdb_appender]): duckdb_state = extern

  /**
   * Closes the appender by flushing all intermediate states to the table and destroying it. By destroying it, this function de-allocates all memory associated with the appender. If flushing the data triggers a constraint violation, then all data is invalidated, and this function returns DuckDBError. Due to the destruction of the appender, it is no longer possible to obtain the specific error message with duckdb_appender_error. Therefore, call duckdb_appender_close before destroying the appender, if you need insights into the specific error.
  */
  def duckdb_appender_destroy(appender : Ptr[duckdb_appender]): duckdb_state = extern

  /**
   * Finish the current row of appends. After end_row is called, the next row can be appended.
  */
  def duckdb_appender_end_row(appender : duckdb_appender): duckdb_state = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release. Use duckdb_appender_error_data instead.
  */
  def duckdb_appender_error(appender : duckdb_appender): CString = extern

  /**
   * Returns the error data associated with the appender. Must be destroyed with duckdb_destroy_error_data.
  */
  def duckdb_appender_error_data(appender : duckdb_appender): duckdb_error_data = extern

  /**
   * Flush the appender to the table, forcing the cache of the appender to be cleared. If flushing the data triggers a constraint violation or any other error, then all data is invalidated, and this function returns DuckDBError. It is not possible to append more values. Call duckdb_appender_error_data to obtain the error data followed by duckdb_appender_destroy to destroy the invalidated appender.
  */
  def duckdb_appender_flush(appender : duckdb_appender): duckdb_state = extern

  /**
   * Retrieves the array size of the given array type.
  */
  def duckdb_array_type_array_size(`type` : duckdb_logical_type): idx_t = extern

  /**
   * Retrieves the child type of the given ARRAY type.
  */
  def duckdb_array_type_child_type(`type` : duckdb_logical_type): duckdb_logical_type = extern

  /**
   * Retrieves the child vector of an array vector. The resulting vector is valid as long as the parent vector is valid. The resulting vector has the size of the parent vector multiplied by the array size.
  */
  def duckdb_array_vector_get_child(vector : duckdb_vector): duckdb_vector = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_arrow_array_scan(connection : duckdb_connection, table_name : CString, arrow_schema : duckdb_arrow_schema, arrow_array : duckdb_arrow_array, out_stream : Ptr[duckdb_arrow_stream]): duckdb_state = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_arrow_column_count(result : duckdb_arrow): idx_t = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_arrow_row_count(result : duckdb_arrow): idx_t = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_arrow_rows_changed(result : duckdb_arrow): idx_t = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_arrow_scan(connection : duckdb_connection, table_name : CString, arrow : duckdb_arrow_stream): duckdb_state = extern

  /**
   * Adds a result column to the output of the table function.
  */
  def duckdb_bind_add_result_column(info : duckdb_bind_info, name : CString, `type` : duckdb_logical_type): Unit = extern

  /**
   * Binds a blob value to the prepared statement at the specified index.
  */
  def duckdb_bind_blob(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, data : Ptr[Byte], length : idx_t): duckdb_state = extern

  /**
   * Binds a bool value to the prepared statement at the specified index.
  */
  def duckdb_bind_boolean(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Boolean): duckdb_state = extern

  /**
   * Binds a double value to the prepared statement at the specified index.
  */
  def duckdb_bind_double(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Double): duckdb_state = extern

  /**
   * Binds a float value to the prepared statement at the specified index.
  */
  def duckdb_bind_float(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Float): duckdb_state = extern

  /**
   * Retrieves the extra info of the function as set in `duckdb_table_function_set_extra_info`.
  */
  def duckdb_bind_get_extra_info(info : duckdb_bind_info): Ptr[Byte] = extern

  /**
   * Retrieves a named parameter with the given name.
  */
  def duckdb_bind_get_named_parameter(info : duckdb_bind_info, name : CString): duckdb_value = extern

  /**
   * Retrieves the parameter at the given index.
  */
  def duckdb_bind_get_parameter(info : duckdb_bind_info, index : idx_t): duckdb_value = extern

  /**
   * Retrieves the number of regular (non-named) parameters to the function.
  */
  def duckdb_bind_get_parameter_count(info : duckdb_bind_info): idx_t = extern

  /**
   * Binds an int16_t value to the prepared statement at the specified index.
  */
  def duckdb_bind_int16(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : int16_t): duckdb_state = extern

  /**
   * Binds an int32_t value to the prepared statement at the specified index.
  */
  def duckdb_bind_int32(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : int32_t): duckdb_state = extern

  /**
   * Binds an int64_t value to the prepared statement at the specified index.
  */
  def duckdb_bind_int64(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : int64_t): duckdb_state = extern

  /**
   * Binds an int8_t value to the prepared statement at the specified index.
  */
  def duckdb_bind_int8(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : int8_t): duckdb_state = extern

  /**
   * Binds a NULL value to the prepared statement at the specified index.
  */
  def duckdb_bind_null(prepared_statement : duckdb_prepared_statement, param_idx : idx_t): duckdb_state = extern

  /**
   * Retrieve the index of the parameter for the prepared statement, identified by name
  */
  def duckdb_bind_parameter_index(prepared_statement : duckdb_prepared_statement, param_idx_out : Ptr[idx_t], name : CString): duckdb_state = extern

  /**
   * Sets the user-provided bind data in the bind object of the table function. This object can be retrieved again during execution.
  */
  def duckdb_bind_set_bind_data(info : duckdb_bind_info, bind_data : Ptr[Byte], destroy : duckdb_delete_callback_t): Unit = extern

  /**
   * Sets the cardinality estimate for the table function, used for optimization.
  */
  def duckdb_bind_set_cardinality(info : duckdb_bind_info, cardinality : idx_t, is_exact : Boolean): Unit = extern

  /**
   * Report that an error has occurred while calling bind on a table function.
  */
  def duckdb_bind_set_error(info : duckdb_bind_info, error : CString): Unit = extern

  /**
   * Binds a uint16_t value to the prepared statement at the specified index.
  */
  def duckdb_bind_uint16(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : uint16_t): duckdb_state = extern

  /**
   * Binds a uint32_t value to the prepared statement at the specified index.
  */
  def duckdb_bind_uint32(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : uint32_t): duckdb_state = extern

  /**
   * Binds a uint64_t value to the prepared statement at the specified index.
  */
  def duckdb_bind_uint64(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : uint64_t): duckdb_state = extern

  /**
   * Binds a uint8_t value to the prepared statement at the specified index.
  */
  def duckdb_bind_uint8(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : uint8_t): duckdb_state = extern

  /**
   * Binds a value to the prepared statement at the specified index.
  */
  def duckdb_bind_value(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : duckdb_value): duckdb_state = extern

  /**
   * Binds a null-terminated varchar value to the prepared statement at the specified index.
  */
  def duckdb_bind_varchar(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : CString): duckdb_state = extern

  /**
   * Binds a varchar value to the prepared statement at the specified index.
  */
  def duckdb_bind_varchar_length(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : CString, length : idx_t): duckdb_state = extern

  /**
   * Get the cast execution mode from the given function info.
  */
  def duckdb_cast_function_get_cast_mode(info : duckdb_function_info): duckdb_cast_mode = extern

  /**
   * Retrieves the extra info of the function as set in `duckdb_cast_function_set_extra_info`.
  */
  def duckdb_cast_function_get_extra_info(info : duckdb_function_info): Ptr[Byte] = extern

  /**
   * Report that an error has occurred while executing the cast function.
  */
  def duckdb_cast_function_set_error(info : duckdb_function_info, error : CString): Unit = extern

  /**
   * Assigns extra information to the cast function that can be fetched during execution, etc.
  */
  def duckdb_cast_function_set_extra_info(cast_function : duckdb_cast_function, extra_info : Ptr[Byte], destroy : duckdb_delete_callback_t): Unit = extern

  /**
   * Sets the actual cast function to use.
  */
  def duckdb_cast_function_set_function(cast_function : duckdb_cast_function, function : duckdb_cast_function_t): Unit = extern

  /**
   * Sets the "cost" of implicitly casting the source type to the target type using this function.
  */
  def duckdb_cast_function_set_implicit_cast_cost(cast_function : duckdb_cast_function, cost : int64_t): Unit = extern

  /**
   * Report that an error has occurred while executing the cast function, setting the corresponding output row to NULL.
  */
  def duckdb_cast_function_set_row_error(info : duckdb_function_info, error : CString, row : idx_t, output : duckdb_vector): Unit = extern

  /**
   * Sets the source type of the cast function.
  */
  def duckdb_cast_function_set_source_type(cast_function : duckdb_cast_function, source_type : duckdb_logical_type): Unit = extern

  /**
   * Sets the target type of the cast function.
  */
  def duckdb_cast_function_set_target_type(cast_function : duckdb_cast_function, target_type : duckdb_logical_type): Unit = extern

  /**
   * Clear the params bind to the prepared statement.
  */
  def duckdb_clear_bindings(prepared_statement : duckdb_prepared_statement): duckdb_state = extern

  /**
   * Returns the connection id of the client context.
  */
  def duckdb_client_context_get_connection_id(context : duckdb_client_context): idx_t = extern

  /**
   * Closes the specified database and de-allocates all memory allocated for that database. This should be called after you are done with any database allocated through `duckdb_open` or `duckdb_open_ext`. Note that failing to call `duckdb_close` (in case of e.g. a program crash) will not cause data corruption. Still, it is recommended to always correctly close a database object after you are done with it.
  */
  def duckdb_close(database : Ptr[duckdb_database]): Unit = extern

  /**
   * Returns the number of columns present in a the result object.
  */
  def duckdb_column_count(result : Ptr[duckdb_result]): idx_t = extern

  /**
   * *DEPRECATED**: Prefer using `duckdb_result_get_chunk` instead.
  */
  def duckdb_column_data(result : Ptr[duckdb_result], col : idx_t): Ptr[Byte] = extern

  /**
   * Check if the column at 'index' index of the table has a DEFAULT expression.
  */
  def duckdb_column_has_default(table_description : duckdb_table_description, index : idx_t, out : Ptr[Boolean]): duckdb_state = extern

  /**
   * Returns the logical column type of the specified column.
  */
  def duckdb_column_logical_type(result : Ptr[duckdb_result], col : idx_t): duckdb_logical_type = extern

  /**
   * Returns the column name of the specified column. The result should not need to be freed; the column names will automatically be destroyed when the result is destroyed.
  */
  def duckdb_column_name(result : Ptr[duckdb_result], col : idx_t): CString = extern

  /**
   * Returns the column type of the specified column.
  */
  def duckdb_column_type(result : Ptr[duckdb_result], col : idx_t): duckdb_type = extern

  /**
   * This returns the total amount of configuration options available for usage with `duckdb_get_config_flag`.
  */
  def duckdb_config_count(): size_t = extern

  /**
   * Opens a connection to a database. Connections are required to query the database, and store transactional state associated with the connection. The instantiated connection should be closed using 'duckdb_disconnect'.
  */
  def duckdb_connect(database : duckdb_database, out_connection : Ptr[duckdb_connection]): duckdb_state = extern

  /**
   * Retrieves the arrow options of the connection.
  */
  def duckdb_connection_get_arrow_options(connection : duckdb_connection, out_arrow_options : Ptr[duckdb_arrow_options]): Unit = extern

  /**
   * Retrieves the client context of the connection.
  */
  def duckdb_connection_get_client_context(connection : duckdb_connection, out_context : Ptr[duckdb_client_context]): Unit = extern

  /**
   * Creates a new empty aggregate function.
  */
  def duckdb_create_aggregate_function(): duckdb_aggregate_function = extern

  /**
   * Creates a new empty aggregate function set.
  */
  def duckdb_create_aggregate_function_set(name : CString): duckdb_aggregate_function_set = extern

  /**
   * Creates an ARRAY type from its child type. The return type must be destroyed with `duckdb_destroy_logical_type`.
  */
  def duckdb_create_array_type(`type` : duckdb_logical_type, array_size : idx_t): duckdb_logical_type = extern

  /**
   * Creates an array value from a child (element) type and an array of values of length `value_count`. Must be destroyed with `duckdb_destroy_value`.
  */
  def duckdb_create_array_value(`type` : duckdb_logical_type, values : Ptr[duckdb_value], value_count : idx_t): duckdb_value = extern

  /**
   * Creates a value from a blob
  */
  def duckdb_create_blob(data : Ptr[uint8_t], length : idx_t): duckdb_value = extern

  /**
   * Creates a value from a boolean
  */
  def duckdb_create_bool(input : Boolean): duckdb_value = extern

  /**
   * Creates a new cast function object.
  */
  def duckdb_create_cast_function(): duckdb_cast_function = extern

  /**
   * Initializes an empty configuration object that can be used to provide start-up options for the DuckDB instance through `duckdb_open_ext`. The duckdb_config must be destroyed using 'duckdb_destroy_config'
  */
  def duckdb_create_config(out_config : Ptr[duckdb_config]): duckdb_state = extern

  /**
   * Creates an empty data chunk with the specified column types. The result must be destroyed with `duckdb_destroy_data_chunk`.
  */
  def duckdb_create_data_chunk(types : Ptr[duckdb_logical_type], column_count : idx_t): duckdb_data_chunk = extern

  /**
   * Creates a DECIMAL type with the specified width and scale. The resulting type should be destroyed with `duckdb_destroy_logical_type`.
  */
  def duckdb_create_decimal_type(width : uint8_t, scale : uint8_t): duckdb_logical_type = extern

  /**
   * Creates a value from a double
  */
  def duckdb_create_double(input : Double): duckdb_value = extern

  /**
   * Creates an ENUM type from the passed member name array. The resulting type should be destroyed with `duckdb_destroy_logical_type`.
  */
  def duckdb_create_enum_type(member_names : Ptr[CString], member_count : idx_t): duckdb_logical_type = extern

  /**
   * Creates an enum value from a type and a value. Must be destroyed with `duckdb_destroy_value`.
  */
  def duckdb_create_enum_value(`type` : duckdb_logical_type, value : uint64_t): duckdb_value = extern

  /**
   * Creates duckdb_error_data. Must be destroyed with `duckdb_destroy_error_data`.
  */
  def duckdb_create_error_data(`type` : duckdb_error_type, message : CString): duckdb_error_data = extern

  /**
   * Creates a value from a float
  */
  def duckdb_create_float(input : Float): duckdb_value = extern

  /**
   * Creates a new database instance cache. The instance cache is necessary if a client/program (re)opens multiple databases to the same file within the same process. Must be destroyed with 'duckdb_destroy_instance_cache'.
  */
  def duckdb_create_instance_cache(): duckdb_instance_cache = extern

  /**
   * Creates a value from an int16_t (a smallint)
  */
  def duckdb_create_int16(input : int16_t): duckdb_value = extern

  /**
   * Creates a value from an int32_t (an integer)
  */
  def duckdb_create_int32(input : int32_t): duckdb_value = extern

  /**
   * Creates a value from an int64
  */
  def duckdb_create_int64(`val` : int64_t): duckdb_value = extern

  /**
   * Creates a value from an int8_t (a tinyint)
  */
  def duckdb_create_int8(input : int8_t): duckdb_value = extern

  /**
   * Creates a LIST type from its child type. The return type must be destroyed with `duckdb_destroy_logical_type`.
  */
  def duckdb_create_list_type(`type` : duckdb_logical_type): duckdb_logical_type = extern

  /**
   * Creates a list value from a child (element) type and an array of values of length `value_count`. Must be destroyed with `duckdb_destroy_value`.
  */
  def duckdb_create_list_value(`type` : duckdb_logical_type, values : Ptr[duckdb_value], value_count : idx_t): duckdb_value = extern

  /**
   * Creates a `duckdb_logical_type` from a primitive type. The resulting logical type must be destroyed with `duckdb_destroy_logical_type`.
  */
  def duckdb_create_logical_type(`type` : duckdb_type): duckdb_logical_type = extern

  /**
   * Creates a MAP type from its key type and value type. The return type must be destroyed with `duckdb_destroy_logical_type`.
  */
  def duckdb_create_map_type(key_type : duckdb_logical_type, value_type : duckdb_logical_type): duckdb_logical_type = extern

  /**
   * Creates a map value from a map type and two arrays, one for the keys and one for the values, each of length `entry_count`. Must be destroyed with `duckdb_destroy_value`.
  */
  def duckdb_create_map_value(map_type : duckdb_logical_type, keys : Ptr[duckdb_value], values : Ptr[duckdb_value], entry_count : idx_t): duckdb_value = extern

  /**
   * Creates a value of type SQLNULL.
  */
  def duckdb_create_null_value(): duckdb_value = extern

  /**
   * Creates a new empty scalar function.
  */
  def duckdb_create_scalar_function(): duckdb_scalar_function = extern

  /**
   * Creates a new empty scalar function set.
  */
  def duckdb_create_scalar_function_set(name : CString): duckdb_scalar_function_set = extern

  /**
   * Creates a new selection vector of size `size`. Must be destroyed with `duckdb_destroy_selection_vector`.
  */
  def duckdb_create_selection_vector(size : idx_t): duckdb_selection_vector = extern

  /**
   * Creates a STRUCT type based on the member types and names. The resulting type must be destroyed with `duckdb_destroy_logical_type`.
  */
  def duckdb_create_struct_type(member_types : Ptr[duckdb_logical_type], member_names : Ptr[CString], member_count : idx_t): duckdb_logical_type = extern

  /**
   * Creates a struct value from a type and an array of values. Must be destroyed with `duckdb_destroy_value`.
  */
  def duckdb_create_struct_value(`type` : duckdb_logical_type, values : Ptr[duckdb_value]): duckdb_value = extern

  /**
   * Creates a new empty table function.
  */
  def duckdb_create_table_function(): duckdb_table_function = extern

  /**
   * Creates a task state that can be used with duckdb_execute_tasks_state to execute tasks until `duckdb_finish_execution` is called on the state.
  */
  def duckdb_create_task_state(database : duckdb_database): duckdb_task_state = extern

  /**
   * Creates a value from a uint16_t (a usmallint)
  */
  def duckdb_create_uint16(input : uint16_t): duckdb_value = extern

  /**
   * Creates a value from a uint32_t (a uinteger)
  */
  def duckdb_create_uint32(input : uint32_t): duckdb_value = extern

  /**
   * Creates a value from a uint64_t (a ubigint)
  */
  def duckdb_create_uint64(input : uint64_t): duckdb_value = extern

  /**
   * Creates a value from a uint8_t (a utinyint)
  */
  def duckdb_create_uint8(input : uint8_t): duckdb_value = extern

  /**
   * Creates a UNION type from the passed arrays. The return type must be destroyed with `duckdb_destroy_logical_type`.
  */
  def duckdb_create_union_type(member_types : Ptr[duckdb_logical_type], member_names : Ptr[CString], member_count : idx_t): duckdb_logical_type = extern

  /**
   * Creates a union value from a union type, a tag index, and a value. Must be destroyed with `duckdb_destroy_value`.
  */
  def duckdb_create_union_value(union_type : duckdb_logical_type, tag_index : idx_t, value : duckdb_value): duckdb_value = extern

  /**
   * Creates a value from a null-terminated string
  */
  def duckdb_create_varchar(text : CString): duckdb_value = extern

  /**
   * Creates a value from a string
  */
  def duckdb_create_varchar_length(text : CString, length : idx_t): duckdb_value = extern

  /**
   * Creates a flat vector. Must be destroyed with `duckdb_destroy_vector`.
  */
  def duckdb_create_vector(`type` : duckdb_logical_type, capacity : idx_t): duckdb_vector = extern

  /**
   * Transforms an Arrow array into a DuckDB data chunk. The data chunk will retain ownership of the underlying Arrow data.
  */
  def duckdb_data_chunk_from_arrow(connection : duckdb_connection, arrow_array : Ptr[ArrowArray], converted_schema : duckdb_arrow_converted_schema, out_chunk : Ptr[duckdb_data_chunk]): duckdb_error_data = extern

  /**
   * Retrieves the number of columns in a data chunk.
  */
  def duckdb_data_chunk_get_column_count(chunk : duckdb_data_chunk): idx_t = extern

  /**
   * Retrieves the current number of tuples in a data chunk.
  */
  def duckdb_data_chunk_get_size(chunk : duckdb_data_chunk): idx_t = extern

  /**
   * Retrieves the vector at the specified column index in the data chunk.
  */
  def duckdb_data_chunk_get_vector(chunk : duckdb_data_chunk, col_idx : idx_t): duckdb_vector = extern

  /**
   * Resets a data chunk, clearing the validity masks and setting the cardinality of the data chunk to 0. After calling this method, you must call `duckdb_vector_get_validity` and `duckdb_vector_get_data` to obtain current data and validity pointers
  */
  def duckdb_data_chunk_reset(chunk : duckdb_data_chunk): Unit = extern

  /**
   * Sets the current number of tuples in a data chunk.
  */
  def duckdb_data_chunk_set_size(chunk : duckdb_data_chunk, size : idx_t): Unit = extern

  /**
   * Transforms a DuckDB data chunk into an Arrow array.
  */
  def duckdb_data_chunk_to_arrow(arrow_options : duckdb_arrow_options, chunk : duckdb_data_chunk, out_arrow_array : Ptr[ArrowArray]): duckdb_error_data = extern

  /**
   * Retrieves the internal storage type of a decimal type.
  */
  def duckdb_decimal_internal_type(`type` : duckdb_logical_type): duckdb_type = extern

  /**
   * Retrieves the scale of a decimal type.
  */
  def duckdb_decimal_scale(`type` : duckdb_logical_type): uint8_t = extern

  /**
   * Retrieves the width of a decimal type.
  */
  def duckdb_decimal_width(`type` : duckdb_logical_type): uint8_t = extern

  /**
   * Destroys the given aggregate function object.
  */
  def duckdb_destroy_aggregate_function(aggregate_function : Ptr[duckdb_aggregate_function]): Unit = extern

  /**
   * Destroys the given aggregate function set object.
  */
  def duckdb_destroy_aggregate_function_set(aggregate_function_set : Ptr[duckdb_aggregate_function_set]): Unit = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_destroy_arrow(result : Ptr[duckdb_arrow]): Unit = extern

  /**
   * Destroys the arrow converted schema and de-allocates all memory allocated for that arrow converted schema.
  */
  def duckdb_destroy_arrow_converted_schema(arrow_converted_schema : Ptr[duckdb_arrow_converted_schema]): Unit = extern

  /**
   * Destroys the arrow options and deallocates its memory.
  */
  def duckdb_destroy_arrow_options(arrow_options : Ptr[duckdb_arrow_options]): Unit = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_destroy_arrow_stream(stream_p : Ptr[duckdb_arrow_stream]): Unit = extern

  /**
   * Destroys the cast function object.
  */
  def duckdb_destroy_cast_function(cast_function : Ptr[duckdb_cast_function]): Unit = extern

  /**
   * Destroys the client context and deallocates its memory.
  */
  def duckdb_destroy_client_context(context : Ptr[duckdb_client_context]): Unit = extern

  /**
   * Destroys the specified configuration object and de-allocates all memory allocated for the object.
  */
  def duckdb_destroy_config(config : Ptr[duckdb_config]): Unit = extern

  /**
   * Destroys the data chunk and de-allocates all memory allocated for that chunk.
  */
  def duckdb_destroy_data_chunk(chunk : Ptr[duckdb_data_chunk]): Unit = extern

  /**
   * Destroys the error data and deallocates its memory.
  */
  def duckdb_destroy_error_data(error_data : Ptr[duckdb_error_data]): Unit = extern

  /**
   * Destroys the expression and de-allocates its memory.
  */
  def duckdb_destroy_expression(expr : Ptr[duckdb_expression]): Unit = extern

  /**
   * De-allocates all memory allocated for the extracted statements.
  */
  def duckdb_destroy_extracted(extracted_statements : Ptr[duckdb_extracted_statements]): Unit = extern

  /**
   * Destroys an existing database instance cache and de-allocates its memory.
  */
  def duckdb_destroy_instance_cache(instance_cache : Ptr[duckdb_instance_cache]): Unit = extern

  /**
   * Destroys the logical type and de-allocates all memory allocated for that type.
  */
  def duckdb_destroy_logical_type(`type` : Ptr[duckdb_logical_type]): Unit = extern

  /**
   * Closes the pending result and de-allocates all memory allocated for the result.
  */
  def duckdb_destroy_pending(pending_result : Ptr[duckdb_pending_result]): Unit = extern

  /**
   * Closes the prepared statement and de-allocates all memory allocated for the statement.
  */
  def duckdb_destroy_prepare(prepared_statement : Ptr[duckdb_prepared_statement]): Unit = extern

  /**
   * Closes the result and de-allocates all memory allocated for that result.
  */
  def duckdb_destroy_result(result : Ptr[duckdb_result]): Unit = extern

  /**
   * Destroys the given scalar function object.
  */
  def duckdb_destroy_scalar_function(scalar_function : Ptr[duckdb_scalar_function]): Unit = extern

  /**
   * Destroys the given scalar function set object.
  */
  def duckdb_destroy_scalar_function_set(scalar_function_set : Ptr[duckdb_scalar_function_set]): Unit = extern

  /**
   * Destroys the selection vector and de-allocates its memory.
  */
  def duckdb_destroy_selection_vector(sel : duckdb_selection_vector): Unit = extern

  /**
   * Destroys the given table function object.
  */
  def duckdb_destroy_table_function(table_function : Ptr[duckdb_table_function]): Unit = extern

  /**
   * Destroys the task state returned from duckdb_create_task_state.
  */
  def duckdb_destroy_task_state(state : duckdb_task_state): Unit = extern

  /**
   * Destroys the value and de-allocates all memory allocated for that type.
  */
  def duckdb_destroy_value(value : Ptr[duckdb_value]): Unit = extern

  /**
   * Destroys the vector and de-allocates its memory.
  */
  def duckdb_destroy_vector(vector : Ptr[duckdb_vector]): Unit = extern

  /**
   * Closes the specified connection and de-allocates all memory allocated for that connection.
  */
  def duckdb_disconnect(connection : Ptr[duckdb_connection]): Unit = extern

  /**
   * Retrieves the dictionary size of the enum type.
  */
  def duckdb_enum_dictionary_size(`type` : duckdb_logical_type): uint32_t = extern

  /**
   * Retrieves the dictionary value at the specified position from the enum.
  */
  def duckdb_enum_dictionary_value(`type` : duckdb_logical_type, index : idx_t): CString = extern

  /**
   * Retrieves the internal storage type of an enum type.
  */
  def duckdb_enum_internal_type(`type` : duckdb_logical_type): duckdb_type = extern

  /**
   * Returns the duckdb_error_type of the error data.
  */
  def duckdb_error_data_error_type(error_data : duckdb_error_data): duckdb_error_type = extern

  /**
   * Returns whether the error data contains an error or not.
  */
  def duckdb_error_data_has_error(error_data : duckdb_error_data): Boolean = extern

  /**
   * Returns the error message of the error data. Must not be freed.
  */
  def duckdb_error_data_message(error_data : duckdb_error_data): CString = extern

  /**
   * Execute DuckDB tasks on this thread.
  */
  def duckdb_execute_n_tasks_state(state : duckdb_task_state, max_tasks : idx_t): idx_t = extern

  /**
   * Fully execute a pending query result, returning the final query result.
  */
  def duckdb_execute_pending(pending_result : duckdb_pending_result, out_result : Ptr[duckdb_result]): duckdb_state = extern

  /**
   * Executes the prepared statement with the given bound parameters, and returns a materialized query result.
  */
  def duckdb_execute_prepared(prepared_statement : duckdb_prepared_statement, out_result : Ptr[duckdb_result]): duckdb_state = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_execute_prepared_arrow(prepared_statement : duckdb_prepared_statement, out_result : Ptr[duckdb_arrow]): duckdb_state = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_execute_prepared_streaming(prepared_statement : duckdb_prepared_statement, out_result : Ptr[duckdb_result]): duckdb_state = extern

  /**
   * Execute DuckDB tasks on this thread.
  */
  def duckdb_execute_tasks(database : duckdb_database, max_tasks : idx_t): Unit = extern

  /**
   * Execute DuckDB tasks on this thread.
  */
  def duckdb_execute_tasks_state(state : duckdb_task_state): Unit = extern

  /**
   * Returns true if the execution of the current query is finished.
  */
  def duckdb_execution_is_finished(con : duckdb_connection): Boolean = extern

  /**
   * Folds an expression creating a folded value.
  */
  def duckdb_expression_fold(context : duckdb_client_context, expr : duckdb_expression, out_value : Ptr[duckdb_value]): duckdb_error_data = extern

  /**
   * Returns whether the expression is foldable into a value or not.
  */
  def duckdb_expression_is_foldable(expr : duckdb_expression): Boolean = extern

  /**
   * Returns the return type of an expression.
  */
  def duckdb_expression_return_type(expr : duckdb_expression): duckdb_logical_type = extern

  /**
   * Extract all statements from a query. Note that after calling `duckdb_extract_statements`, the extracted statements should always be destroyed using `duckdb_destroy_extracted`, even if no statements were extracted.
  */
  def duckdb_extract_statements(connection : duckdb_connection, query : CString, out_extracted_statements : Ptr[duckdb_extracted_statements]): idx_t = extern

  /**
   * Returns the error message contained within the extracted statements. The result of this function must not be freed. It will be cleaned up when `duckdb_destroy_extracted` is called.
  */
  def duckdb_extract_statements_error(extracted_statements : duckdb_extracted_statements): CString = extern

  /**
   * Finish execution on a specific task.
  */
  def duckdb_finish_execution(state : duckdb_task_state): Unit = extern

  /**
   * Free a value returned from `duckdb_malloc`, `duckdb_value_varchar`, `duckdb_value_blob`, or `duckdb_value_string`.
  */
  def duckdb_free(ptr : Ptr[Byte]): Unit = extern

  /**
   * Gets the table function's bind data set by `duckdb_bind_set_bind_data`.
  */
  def duckdb_function_get_bind_data(info : duckdb_function_info): Ptr[Byte] = extern

  /**
   * Retrieves the extra info of the function as set in `duckdb_table_function_set_extra_info`.
  */
  def duckdb_function_get_extra_info(info : duckdb_function_info): Ptr[Byte] = extern

  /**
   * Gets the init data set by `duckdb_init_set_init_data` during the init.
  */
  def duckdb_function_get_init_data(info : duckdb_function_info): Ptr[Byte] = extern

  /**
   * Gets the thread-local init data set by `duckdb_init_set_init_data` during the local_init.
  */
  def duckdb_function_get_local_init_data(info : duckdb_function_info): Ptr[Byte] = extern

  /**
   * Report that an error has occurred while executing the function.
  */
  def duckdb_function_set_error(info : duckdb_function_info, error : CString): Unit = extern

  /**
   * Returns the boolean value of the given value.
  */
  def duckdb_get_bool(`val` : duckdb_value): Boolean = extern

  /**
   * Obtains a human-readable name and description of a specific configuration option. This can be used to e.g. display configuration options. This will succeed unless `index` is out of range (i.e. `>= duckdb_config_count`).
  */
  def duckdb_get_config_flag(index : size_t, out_name : Ptr[CString], out_description : Ptr[CString]): duckdb_state = extern

  /**
   * Returns the double value of the given value.
  */
  def duckdb_get_double(`val` : duckdb_value): Double = extern

  /**
   * Returns the enum value of the given value.
  */
  def duckdb_get_enum_value(value : duckdb_value): uint64_t = extern

  /**
   * Returns the float value of the given value.
  */
  def duckdb_get_float(`val` : duckdb_value): Float = extern

  /**
   * Returns the int16_t value of the given value.
  */
  def duckdb_get_int16(`val` : duckdb_value): int16_t = extern

  /**
   * Returns the int32_t value of the given value.
  */
  def duckdb_get_int32(`val` : duckdb_value): int32_t = extern

  /**
   * Returns the int64_t value of the given value.
  */
  def duckdb_get_int64(`val` : duckdb_value): int64_t = extern

  /**
   * Returns the int8_t value of the given value.
  */
  def duckdb_get_int8(`val` : duckdb_value): int8_t = extern

  /**
   * Returns the LIST child at index as a duckdb_value.
  */
  def duckdb_get_list_child(value : duckdb_value, index : idx_t): duckdb_value = extern

  /**
   * Returns the number of elements in a LIST value.
  */
  def duckdb_get_list_size(value : duckdb_value): idx_t = extern

  /**
   * Returns the MAP key at index as a duckdb_value.
  */
  def duckdb_get_map_key(value : duckdb_value, index : idx_t): duckdb_value = extern

  /**
   * Returns the number of elements in a MAP value.
  */
  def duckdb_get_map_size(value : duckdb_value): idx_t = extern

  /**
   * Returns the MAP value at index as a duckdb_value.
  */
  def duckdb_get_map_value(value : duckdb_value, index : idx_t): duckdb_value = extern

  /**
   * Creates a new database instance in the instance cache, or retrieves an existing database instance. Must be closed with 'duckdb_close'.
  */
  def duckdb_get_or_create_from_cache(instance_cache : duckdb_instance_cache, path : CString, out_database : Ptr[duckdb_database], config : duckdb_config, out_error : Ptr[CString]): duckdb_state = extern

  /**
   * Returns the root node of the profiling information. Returns nullptr, if profiling is not enabled.
  */
  def duckdb_get_profiling_info(connection : duckdb_connection): duckdb_profiling_info = extern

  /**
   * Returns the STRUCT child at index as a duckdb_value.
  */
  def duckdb_get_struct_child(value : duckdb_value, index : idx_t): duckdb_value = extern

  /**
   * Get the list of (fully qualified) table names of the query.
  */
  def duckdb_get_table_names(connection : duckdb_connection, query : CString, qualified : Boolean): duckdb_value = extern

  /**
   * Retrieves the enum `duckdb_type` of a `duckdb_logical_type`.
  */
  def duckdb_get_type_id(`type` : duckdb_logical_type): duckdb_type = extern

  /**
   * Returns the uint16_t value of the given value.
  */
  def duckdb_get_uint16(`val` : duckdb_value): uint16_t = extern

  /**
   * Returns the uint32_t value of the given value.
  */
  def duckdb_get_uint32(`val` : duckdb_value): uint32_t = extern

  /**
   * Returns the uint64_t value of the given value.
  */
  def duckdb_get_uint64(`val` : duckdb_value): uint64_t = extern

  /**
   * Returns the uint8_t value of the given value.
  */
  def duckdb_get_uint8(`val` : duckdb_value): uint8_t = extern

  /**
   * Returns the type of the given value. The type is valid as long as the value is not destroyed. The type itself must not be destroyed.
  */
  def duckdb_get_value_type(`val` : duckdb_value): duckdb_logical_type = extern

  /**
   * Obtains a string representation of the given value. The result must be destroyed with `duckdb_free`.
  */
  def duckdb_get_varchar(value : duckdb_value): CString = extern

  /**
   * Gets the bind data set by `duckdb_bind_set_bind_data` during the bind.
  */
  def duckdb_init_get_bind_data(info : duckdb_init_info): Ptr[Byte] = extern

  /**
   * Returns the number of projected columns.
  */
  def duckdb_init_get_column_count(info : duckdb_init_info): idx_t = extern

  /**
   * Returns the column index of the projected column at the specified position.
  */
  def duckdb_init_get_column_index(info : duckdb_init_info, column_index : idx_t): idx_t = extern

  /**
   * Retrieves the extra info of the function as set in `duckdb_table_function_set_extra_info`.
  */
  def duckdb_init_get_extra_info(info : duckdb_init_info): Ptr[Byte] = extern

  /**
   * Report that an error has occurred while calling init.
  */
  def duckdb_init_set_error(info : duckdb_init_info, error : CString): Unit = extern

  /**
   * Sets the user-provided init data in the init object. This object can be retrieved again during execution.
  */
  def duckdb_init_set_init_data(info : duckdb_init_info, init_data : Ptr[Byte], destroy : duckdb_delete_callback_t): Unit = extern

  /**
   * Sets how many threads can process this table function in parallel (default: 1)
  */
  def duckdb_init_set_max_threads(info : duckdb_init_info, max_threads : idx_t): Unit = extern

  /**
   * Interrupt running query
  */
  def duckdb_interrupt(connection : duckdb_connection): Unit = extern

  /**
   * Returns whether the value's type is SQLNULL or not.
  */
  def duckdb_is_null_value(value : duckdb_value): Boolean = extern

  /**
   * Returns the version of the linked DuckDB, with a version postfix for dev versions
  */
  def duckdb_library_version(): CString = extern

  /**
   * Retrieves the child type of the given LIST type. Also accepts MAP types. The result must be freed with `duckdb_destroy_logical_type`.
  */
  def duckdb_list_type_child_type(`type` : duckdb_logical_type): duckdb_logical_type = extern

  /**
   * Retrieves the child vector of a list vector.
  */
  def duckdb_list_vector_get_child(vector : duckdb_vector): duckdb_vector = extern

  /**
   * Returns the size of the child vector of the list.
  */
  def duckdb_list_vector_get_size(vector : duckdb_vector): idx_t = extern

  /**
   * Sets the total capacity of the underlying child-vector of a list.
  */
  def duckdb_list_vector_reserve(vector : duckdb_vector, required_capacity : idx_t): duckdb_state = extern

  /**
   * Sets the total size of the underlying child-vector of a list vector.
  */
  def duckdb_list_vector_set_size(vector : duckdb_vector, size : idx_t): duckdb_state = extern

  /**
   * Returns the alias of a duckdb_logical_type, if set, else `nullptr`. The result must be destroyed with `duckdb_free`.
  */
  def duckdb_logical_type_get_alias(`type` : duckdb_logical_type): CString = extern

  /**
   * Sets the alias of a duckdb_logical_type.
  */
  def duckdb_logical_type_set_alias(`type` : duckdb_logical_type, alias : CString): Unit = extern

  /**
   * Allocate `size` bytes of memory using the duckdb internal malloc function. Any memory allocated in this manner should be freed using `duckdb_free`.
  */
  def duckdb_malloc(size : size_t): Ptr[Byte] = extern

  /**
   * Retrieves the key type of the given map type.
  */
  def duckdb_map_type_key_type(`type` : duckdb_logical_type): duckdb_logical_type = extern

  /**
   * Retrieves the value type of the given map type.
  */
  def duckdb_map_type_value_type(`type` : duckdb_logical_type): duckdb_logical_type = extern

  /**
   * Returns the number of parameters that can be provided to the given prepared statement.
  */
  def duckdb_nparams(prepared_statement : duckdb_prepared_statement): idx_t = extern

  /**
   * *DEPRECATED**: Prefer using `duckdb_result_get_chunk` instead.
  */
  def duckdb_nullmask_data(result : Ptr[duckdb_result], col : idx_t): Ptr[Boolean] = extern

  /**
   * Creates a new database or opens an existing database file stored at the given path. If no path is given a new in-memory database is created instead. The database must be closed with 'duckdb_close'.
  */
  def duckdb_open(path : CString, out_database : Ptr[duckdb_database]): duckdb_state = extern

  /**
   * Extended version of duckdb_open. Creates a new database or opens an existing database file stored at the given path. The database must be closed with 'duckdb_close'.
  */
  def duckdb_open_ext(path : CString, out_database : Ptr[duckdb_database], config : duckdb_config, out_error : Ptr[CString]): duckdb_state = extern

  /**
   * Returns the logical type for the parameter at the given index.
  */
  def duckdb_param_logical_type(prepared_statement : duckdb_prepared_statement, param_idx : idx_t): duckdb_logical_type = extern

  /**
   * Returns the parameter type for the parameter at the given index.
  */
  def duckdb_param_type(prepared_statement : duckdb_prepared_statement, param_idx : idx_t): duckdb_type = extern

  /**
   * Returns the name used to identify the parameter The returned string should be freed using `duckdb_free`.
  */
  def duckdb_parameter_name(prepared_statement : duckdb_prepared_statement, index : idx_t): CString = extern

  /**
   * Returns the error message contained within the pending result.
  */
  def duckdb_pending_error(pending_result : duckdb_pending_result): CString = extern

  /**
   * If this returns DUCKDB_PENDING_RESULT_READY, the duckdb_execute_pending function can be called to obtain the result. If this returns DUCKDB_PENDING_RESULT_NOT_READY, the duckdb_pending_execute_check_state function should be called again. If this returns DUCKDB_PENDING_ERROR, an error occurred during execution.
  */
  def duckdb_pending_execute_check_state(pending_result : duckdb_pending_result): duckdb_pending_state = extern

  /**
   * Executes a single task within the query, returning whether or not the query is ready.
  */
  def duckdb_pending_execute_task(pending_result : duckdb_pending_result): duckdb_pending_state = extern

  /**
   * Returns whether a duckdb_pending_state is finished executing. For example if `pending_state` is DUCKDB_PENDING_RESULT_READY, this function will return true.
  */
  def duckdb_pending_execution_is_finished(pending_state : duckdb_pending_state): Boolean = extern

  /**
   * Executes the prepared statement with the given bound parameters, and returns a pending result. The pending result represents an intermediate structure for a query that is not yet fully executed. The pending result can be used to incrementally execute a query, returning control to the client between tasks.
  */
  def duckdb_pending_prepared(prepared_statement : duckdb_prepared_statement, out_result : Ptr[duckdb_pending_result]): duckdb_state = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_pending_prepared_streaming(prepared_statement : duckdb_prepared_statement, out_result : Ptr[duckdb_pending_result]): duckdb_state = extern

  /**
   * Create a prepared statement object from a query.
  */
  def duckdb_prepare(connection : duckdb_connection, query : CString, out_prepared_statement : Ptr[duckdb_prepared_statement]): duckdb_state = extern

  /**
   * Returns the error message associated with the given prepared statement. If the prepared statement has no error message, this returns `nullptr` instead.
  */
  def duckdb_prepare_error(prepared_statement : duckdb_prepared_statement): CString = extern

  /**
   * Prepare an extracted statement. Note that after calling `duckdb_prepare_extracted_statement`, the prepared statement should always be destroyed using `duckdb_destroy_prepare`, even if the prepare fails.
  */
  def duckdb_prepare_extracted_statement(connection : duckdb_connection, extracted_statements : duckdb_extracted_statements, index : idx_t, out_prepared_statement : Ptr[duckdb_prepared_statement]): duckdb_state = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_prepared_arrow_schema(prepared : duckdb_prepared_statement, out_schema : Ptr[duckdb_arrow_schema]): duckdb_state = extern

  /**
   * Returns the number of columns present in a the result of the prepared statement. If any of the column types are invalid, the result will be 1.
  */
  def duckdb_prepared_statement_column_count(prepared_statement : duckdb_prepared_statement): idx_t = extern

  /**
   * Returns the column type of the specified column of the result of the prepared_statement.
  */
  def duckdb_prepared_statement_column_logical_type(prepared_statement : duckdb_prepared_statement, col_idx : idx_t): duckdb_logical_type = extern

  /**
   * Returns the name of the specified column of the result of the prepared_statement. The returned string should be freed using `duckdb_free`.
  */
  def duckdb_prepared_statement_column_name(prepared_statement : duckdb_prepared_statement, col_idx : idx_t): CString = extern

  /**
   * Returns the column type of the specified column of the result of the prepared_statement.
  */
  def duckdb_prepared_statement_column_type(prepared_statement : duckdb_prepared_statement, col_idx : idx_t): duckdb_type = extern

  /**
   * Returns the statement type of the statement to be executed
  */
  def duckdb_prepared_statement_type(statement : duckdb_prepared_statement): duckdb_statement_type = extern

  /**
   * Returns the child node at the specified index.
  */
  def duckdb_profiling_info_get_child(info : duckdb_profiling_info, index : idx_t): duckdb_profiling_info = extern

  /**
   * Returns the number of children in the current profiling info node.
  */
  def duckdb_profiling_info_get_child_count(info : duckdb_profiling_info): idx_t = extern

  /**
   * Returns the key-value metric map of this profiling node as a MAP duckdb_value. The individual elements are accessible via the duckdb_value MAP functions.
  */
  def duckdb_profiling_info_get_metrics(info : duckdb_profiling_info): duckdb_value = extern

  /**
   * Returns the value of the metric of the current profiling info node. Returns nullptr, if the metric does not exist or is not enabled. Currently, the value holds a string, and you can retrieve the string by calling the corresponding function: char *duckdb_get_varchar(duckdb_value value).
  */
  def duckdb_profiling_info_get_value(info : duckdb_profiling_info, key : CString): duckdb_value = extern

  /**
   * Executes a SQL query within a connection and stores the full (materialized) result in the out_result pointer. If the query fails to execute, DuckDBError is returned and the error message can be retrieved by calling `duckdb_result_error`.
  */
  def duckdb_query(connection : duckdb_connection, query : CString, out_result : Ptr[duckdb_result]): duckdb_state = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_query_arrow(connection : duckdb_connection, query : CString, out_result : Ptr[duckdb_arrow]): duckdb_state = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_query_arrow_array(result : duckdb_arrow, out_array : Ptr[duckdb_arrow_array]): duckdb_state = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_query_arrow_error(result : duckdb_arrow): CString = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_query_arrow_schema(result : duckdb_arrow, out_schema : Ptr[duckdb_arrow_schema]): duckdb_state = extern

  /**
   * Register the aggregate function object within the given connection.
  */
  def duckdb_register_aggregate_function(con : duckdb_connection, aggregate_function : duckdb_aggregate_function): duckdb_state = extern

  /**
   * Register the aggregate function set within the given connection.
  */
  def duckdb_register_aggregate_function_set(con : duckdb_connection, set : duckdb_aggregate_function_set): duckdb_state = extern

  /**
   * Registers a cast function within the given connection.
  */
  def duckdb_register_cast_function(con : duckdb_connection, cast_function : duckdb_cast_function): duckdb_state = extern

  /**
   * Registers a custom type within the given connection. The type must have an alias
  */
  def duckdb_register_logical_type(con : duckdb_connection, `type` : duckdb_logical_type, info : duckdb_create_type_info): duckdb_state = extern

  /**
   * Register the scalar function object within the given connection.
  */
  def duckdb_register_scalar_function(con : duckdb_connection, scalar_function : duckdb_scalar_function): duckdb_state = extern

  /**
   * Register the scalar function set within the given connection.
  */
  def duckdb_register_scalar_function_set(con : duckdb_connection, set : duckdb_scalar_function_set): duckdb_state = extern

  /**
   * Register the table function object within the given connection.
  */
  def duckdb_register_table_function(con : duckdb_connection, function : duckdb_table_function): duckdb_state = extern

  /**
   * Adds a parameter to the replacement scan function.
  */
  def duckdb_replacement_scan_add_parameter(info : duckdb_replacement_scan_info, parameter : duckdb_value): Unit = extern

  /**
   * Report that an error has occurred while executing the replacement scan.
  */
  def duckdb_replacement_scan_set_error(info : duckdb_replacement_scan_info, error : CString): Unit = extern

  /**
   * Sets the replacement function name. If this function is called in the replacement callback, the replacement scan is performed. If it is not called, the replacement callback is not performed.
  */
  def duckdb_replacement_scan_set_function_name(info : duckdb_replacement_scan_info, function_name : CString): Unit = extern

  /**
   * Returns the error message contained within the result. The error is only set if `duckdb_query` returns `DuckDBError`.
  */
  def duckdb_result_error(result : Ptr[duckdb_result]): CString = extern

  /**
   * Returns the result error type contained within the result. The error is only set if `duckdb_query` returns `DuckDBError`.
  */
  def duckdb_result_error_type(result : Ptr[duckdb_result]): duckdb_error_type = extern

  /**
   * Returns the arrow options associated with the given result. These options are definitions of how the arrow arrays/schema should be produced.
  */
  def duckdb_result_get_arrow_options(result : Ptr[duckdb_result]): duckdb_arrow_options = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_row_count(result : Ptr[duckdb_result]): idx_t = extern

  /**
   * Returns the number of rows changed by the query stored in the result. This is relevant only for INSERT/UPDATE/DELETE queries. For other queries the rows_changed will be 0.
  */
  def duckdb_rows_changed(result : Ptr[duckdb_result]): idx_t = extern

  /**
   * Adds a parameter to the scalar function.
  */
  def duckdb_scalar_function_add_parameter(scalar_function : duckdb_scalar_function, `type` : duckdb_logical_type): Unit = extern

  /**
   * Returns the input argument at index of the scalar function.
  */
  def duckdb_scalar_function_bind_get_argument(info : duckdb_bind_info, index : idx_t): duckdb_expression = extern

  /**
   * Returns the number of input arguments of the scalar function.
  */
  def duckdb_scalar_function_bind_get_argument_count(info : duckdb_bind_info): idx_t = extern

  /**
   * Retrieves the extra info of the function as set in the bind info.
  */
  def duckdb_scalar_function_bind_get_extra_info(info : duckdb_bind_info): Ptr[Byte] = extern

  /**
   * Report that an error has occurred while calling bind on a scalar function.
  */
  def duckdb_scalar_function_bind_set_error(info : duckdb_bind_info, error : CString): Unit = extern

  /**
   * Gets the scalar function's bind data set by `duckdb_scalar_function_set_bind_data`. Note that the bind data is read-only.
  */
  def duckdb_scalar_function_get_bind_data(info : duckdb_function_info): Ptr[Byte] = extern

  /**
   * Retrieves the client context of the bind info of a scalar function.
  */
  def duckdb_scalar_function_get_client_context(info : duckdb_bind_info, out_context : Ptr[duckdb_client_context]): Unit = extern

  /**
   * Retrieves the extra info of the function as set in `duckdb_scalar_function_set_extra_info`.
  */
  def duckdb_scalar_function_get_extra_info(info : duckdb_function_info): Ptr[Byte] = extern

  /**
   * Sets the (optional) bind function of the scalar function.
  */
  def duckdb_scalar_function_set_bind(scalar_function : duckdb_scalar_function, bind : duckdb_scalar_function_bind_t): Unit = extern

  /**
   * Sets the user-provided bind data in the bind object of the scalar function. The bind data object can be retrieved again during execution. In most case, you also need to set the copy-callback of your bind data via duckdb_scalar_function_set_bind_data_copy.
  */
  def duckdb_scalar_function_set_bind_data(info : duckdb_bind_info, bind_data : Ptr[Byte], destroy : duckdb_delete_callback_t): Unit = extern

  /**
   * Sets the copy-callback for the user-provided bind data in the bind object of the scalar function.
  */
  def duckdb_scalar_function_set_bind_data_copy(info : duckdb_bind_info, copy : duckdb_copy_callback_t): Unit = extern

  /**
   * Report that an error has occurred while executing the scalar function.
  */
  def duckdb_scalar_function_set_error(info : duckdb_function_info, error : CString): Unit = extern

  /**
   * Assigns extra information to the scalar function that can be fetched during binding, etc.
  */
  def duckdb_scalar_function_set_extra_info(scalar_function : duckdb_scalar_function, extra_info : Ptr[Byte], destroy : duckdb_delete_callback_t): Unit = extern

  /**
   * Sets the main function of the scalar function.
  */
  def duckdb_scalar_function_set_function(scalar_function : duckdb_scalar_function, function : duckdb_scalar_function_t): Unit = extern

  /**
   * Sets the name of the given scalar function.
  */
  def duckdb_scalar_function_set_name(scalar_function : duckdb_scalar_function, name : CString): Unit = extern

  /**
   * Sets the return type of the scalar function.
  */
  def duckdb_scalar_function_set_return_type(scalar_function : duckdb_scalar_function, `type` : duckdb_logical_type): Unit = extern

  /**
   * Sets the scalar function's null-handling behavior to special.
  */
  def duckdb_scalar_function_set_special_handling(scalar_function : duckdb_scalar_function): Unit = extern

  /**
   * Sets the parameters of the given scalar function to varargs. Does not require adding parameters with duckdb_scalar_function_add_parameter.
  */
  def duckdb_scalar_function_set_varargs(scalar_function : duckdb_scalar_function, `type` : duckdb_logical_type): Unit = extern

  /**
   * Sets the Function Stability of the scalar function to VOLATILE, indicating the function should be re-run for every row. This limits optimization that can be performed for the function.
  */
  def duckdb_scalar_function_set_volatile(scalar_function : duckdb_scalar_function): Unit = extern

  /**
   * Transforms an Arrow Schema into a DuckDB Schema.
  */
  def duckdb_schema_from_arrow(connection : duckdb_connection, schema : Ptr[ArrowSchema], out_types : Ptr[duckdb_arrow_converted_schema]): duckdb_error_data = extern

  /**
   * Access the data pointer of a selection vector.
  */
  def duckdb_selection_vector_get_data_ptr(sel : duckdb_selection_vector): Ptr[sel_t] = extern

  /**
   * Sets the specified option for the specified configuration. The configuration option is indicated by name. To obtain a list of config options, see `duckdb_get_config_flag`.
  */
  def duckdb_set_config(config : duckdb_config, name : CString, option : CString): duckdb_state = extern

  /**
   * Slice a vector with a selection vector. The length of the selection vector must be less than or equal to the length of the vector. Turns the vector into a dictionary vector.
  */
  def duckdb_slice_vector(vector : duckdb_vector, sel : duckdb_selection_vector, len : idx_t): Unit = extern

  /**
   * Get a pointer to the string data of a string_t
  */
  def duckdb_string_t_data(string : Ptr[duckdb_string_t]): CString = extern

  /**
   * Returns the number of children of a struct type.
  */
  def duckdb_struct_type_child_count(`type` : duckdb_logical_type): idx_t = extern

  /**
   * Retrieves the name of the struct child.
  */
  def duckdb_struct_type_child_name(`type` : duckdb_logical_type, index : idx_t): CString = extern

  /**
   * Retrieves the child type of the given struct type at the specified index.
  */
  def duckdb_struct_type_child_type(`type` : duckdb_logical_type, index : idx_t): duckdb_logical_type = extern

  /**
   * Retrieves the child vector of a struct vector. The resulting vector is valid as long as the parent vector is valid.
  */
  def duckdb_struct_vector_get_child(vector : duckdb_vector, index : idx_t): duckdb_vector = extern

  /**
   * Creates a table description object. Note that `duckdb_table_description_destroy` should always be called on the resulting table_description, even if the function returns `DuckDBError`.
  */
  def duckdb_table_description_create(connection : duckdb_connection, schema : CString, table : CString, out : Ptr[duckdb_table_description]): duckdb_state = extern

  /**
   * Creates a table description object. Note that `duckdb_table_description_destroy` must be called on the resulting table_description, even if the function returns `DuckDBError`.
  */
  def duckdb_table_description_create_ext(connection : duckdb_connection, catalog : CString, schema : CString, table : CString, out : Ptr[duckdb_table_description]): duckdb_state = extern

  /**
   * Destroy the TableDescription object.
  */
  def duckdb_table_description_destroy(table_description : Ptr[duckdb_table_description]): Unit = extern

  /**
   * Returns the error message associated with the given table_description. If the table_description has no error message, this returns `nullptr` instead. The error message should not be freed. It will be de-allocated when `duckdb_table_description_destroy` is called.
  */
  def duckdb_table_description_error(table_description : duckdb_table_description): CString = extern

  /**
   * Obtain the column name at 'index'. The out result must be destroyed with `duckdb_free`.
  */
  def duckdb_table_description_get_column_name(table_description : duckdb_table_description, index : idx_t): CString = extern

  /**
   * Adds a named parameter to the table function.
  */
  def duckdb_table_function_add_named_parameter(table_function : duckdb_table_function, name : CString, `type` : duckdb_logical_type): Unit = extern

  /**
   * Adds a parameter to the table function.
  */
  def duckdb_table_function_add_parameter(table_function : duckdb_table_function, `type` : duckdb_logical_type): Unit = extern

  /**
   * Retrieves the client context of the bind info of a table function.
  */
  def duckdb_table_function_get_client_context(info : duckdb_bind_info, out_context : Ptr[duckdb_client_context]): Unit = extern

  /**
   * Sets the bind function of the table function.
  */
  def duckdb_table_function_set_bind(table_function : duckdb_table_function, bind : duckdb_table_function_bind_t): Unit = extern

  /**
   * Assigns extra information to the table function that can be fetched during binding, etc.
  */
  def duckdb_table_function_set_extra_info(table_function : duckdb_table_function, extra_info : Ptr[Byte], destroy : duckdb_delete_callback_t): Unit = extern

  /**
   * Sets the main function of the table function.
  */
  def duckdb_table_function_set_function(table_function : duckdb_table_function, function : duckdb_table_function_t): Unit = extern

  /**
   * Sets the init function of the table function.
  */
  def duckdb_table_function_set_init(table_function : duckdb_table_function, init : duckdb_table_function_init_t): Unit = extern

  /**
   * Sets the thread-local init function of the table function.
  */
  def duckdb_table_function_set_local_init(table_function : duckdb_table_function, init : duckdb_table_function_init_t): Unit = extern

  /**
   * Sets the name of the given table function.
  */
  def duckdb_table_function_set_name(table_function : duckdb_table_function, name : CString): Unit = extern

  /**
   * Sets whether or not the given table function supports projection pushdown.
  */
  def duckdb_table_function_supports_projection_pushdown(table_function : duckdb_table_function, pushdown : Boolean): Unit = extern

  /**
   * Check if the provided duckdb_task_state has finished execution
  */
  def duckdb_task_state_is_finished(state : duckdb_task_state): Boolean = extern

  /**
   * Transforms a DuckDB Schema into an Arrow Schema
  */
  def duckdb_to_arrow_schema(arrow_options : duckdb_arrow_options, types : Ptr[duckdb_logical_type], names : Ptr[CString], column_count : idx_t, out_schema : Ptr[ArrowSchema]): duckdb_error_data = extern

  /**
   * Returns the number of members that the union type has.
  */
  def duckdb_union_type_member_count(`type` : duckdb_logical_type): idx_t = extern

  /**
   * Retrieves the name of the union member.
  */
  def duckdb_union_type_member_name(`type` : duckdb_logical_type, index : idx_t): CString = extern

  /**
   * Retrieves the child type of the given union member at the specified index.
  */
  def duckdb_union_type_member_type(`type` : duckdb_logical_type, index : idx_t): duckdb_logical_type = extern

  /**
   * Returns whether or not a row is valid (i.e. not NULL) in the given validity mask.
  */
  def duckdb_validity_row_is_valid(validity : Ptr[uint64_t], row : idx_t): Boolean = extern

  /**
   * In a validity mask, sets a specific row to invalid.
  */
  def duckdb_validity_set_row_invalid(validity : Ptr[uint64_t], row : idx_t): Unit = extern

  /**
   * In a validity mask, sets a specific row to valid.
  */
  def duckdb_validity_set_row_valid(validity : Ptr[uint64_t], row : idx_t): Unit = extern

  /**
   * In a validity mask, sets a specific row to either valid or invalid.
  */
  def duckdb_validity_set_row_validity(validity : Ptr[uint64_t], row : idx_t, valid : Boolean): Unit = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_boolean(result : Ptr[duckdb_result], col : idx_t, row : idx_t): Boolean = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_double(result : Ptr[duckdb_result], col : idx_t, row : idx_t): Double = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_float(result : Ptr[duckdb_result], col : idx_t, row : idx_t): Float = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_int16(result : Ptr[duckdb_result], col : idx_t, row : idx_t): int16_t = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_int32(result : Ptr[duckdb_result], col : idx_t, row : idx_t): int32_t = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_int64(result : Ptr[duckdb_result], col : idx_t, row : idx_t): int64_t = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_int8(result : Ptr[duckdb_result], col : idx_t, row : idx_t): int8_t = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_is_null(result : Ptr[duckdb_result], col : idx_t, row : idx_t): Boolean = extern

  /**
   * Returns the SQL string representation of the given value.
  */
  def duckdb_value_to_string(value : duckdb_value): CString = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_uint16(result : Ptr[duckdb_result], col : idx_t, row : idx_t): uint16_t = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_uint32(result : Ptr[duckdb_result], col : idx_t, row : idx_t): uint32_t = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_uint64(result : Ptr[duckdb_result], col : idx_t, row : idx_t): uint64_t = extern

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_uint8(result : Ptr[duckdb_result], col : idx_t, row : idx_t): uint8_t = extern

  /**
   * *DEPRECATED**: Use duckdb_value_string instead. This function does not work correctly if the string contains null bytes.
  */
  def duckdb_value_varchar(result : Ptr[duckdb_result], col : idx_t, row : idx_t): CString = extern

  /**
   * *DEPRECATED**: Use duckdb_value_string_internal instead. This function does not work correctly if the string contains null bytes.
  */
  def duckdb_value_varchar_internal(result : Ptr[duckdb_result], col : idx_t, row : idx_t): CString = extern

  /**
   * Assigns a string element in the vector at the specified location. The vector type must be VARCHAR and the input must be valid UTF-8. Otherwise, undefined behavior is expected at later stages.
  */
  def duckdb_vector_assign_string_element(vector : duckdb_vector, index : idx_t, str : CString): Unit = extern

  /**
   * Assigns a string element in the vector at the specified location. The vector type can be VARCHAR or BLOB. In the case of VARCHAR, you must pass valid UTF-8. Otherwise, undefined behavior is expected at later stages.
  */
  def duckdb_vector_assign_string_element_len(vector : duckdb_vector, index : idx_t, str : CString, str_len : idx_t): Unit = extern

  /**
   * Copy the src vector to the dst with a selection vector that identifies which indices to copy.
  */
  def duckdb_vector_copy_sel(src : duckdb_vector, dst : duckdb_vector, sel : duckdb_selection_vector, src_count : idx_t, src_offset : idx_t, dst_offset : idx_t): Unit = extern

  /**
   * Ensures the validity mask is writable by allocating it.
  */
  def duckdb_vector_ensure_validity_writable(vector : duckdb_vector): Unit = extern

  /**
   * Retrieves the column type of the specified vector.
  */
  def duckdb_vector_get_column_type(vector : duckdb_vector): duckdb_logical_type = extern

  /**
   * Retrieves the data pointer of the vector.
  */
  def duckdb_vector_get_data(vector : duckdb_vector): Ptr[Byte] = extern

  /**
   * Retrieves the validity mask pointer of the specified vector.
  */
  def duckdb_vector_get_validity(vector : duckdb_vector): Ptr[uint64_t] = extern

  /**
   * Copies the value from `value` to `vector`.
  */
  def duckdb_vector_reference_value(vector : duckdb_vector, value : duckdb_value): Unit = extern

  /**
   * Changes `to_vector` to reference `from_vector. After, the vectors share ownership of the data.
  */
  def duckdb_vector_reference_vector(to_vector : duckdb_vector, from_vector : duckdb_vector): Unit = extern

  /**
   * The internal vector size used by DuckDB. This is the amount of tuples that will fit into a data chunk created by `duckdb_create_data_chunk`.
  */
  def duckdb_vector_size(): idx_t = extern


object functions:
  import _root_.duckdb.predef.*
  import _root_.duckdb.enumerations.*
  import _root_.duckdb.aliases.*
  import _root_.duckdb.structs.*
  import extern_functions.*
  export extern_functions.*

  /**
   * Append a duckdb_date value to the appender.
  */
  def duckdb_append_date(appender : duckdb_appender, value : duckdb_date)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_date] = _root_.scala.scalanative.unsafe.alloc[duckdb_date](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_append_date(appender, (__ptr_0 + 0))

  /**
   * Append a duckdb_date value to the appender.
  */
  def duckdb_append_date(appender : duckdb_appender, value : Ptr[duckdb_date]): duckdb_state =
    __sn_wrap_duckdb_duckdb_append_date(appender, value)

  /**
   * Append a duckdb_hugeint value to the appender.
  */
  def duckdb_append_hugeint(appender : duckdb_appender, value : duckdb_hugeint)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_hugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_hugeint](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_append_hugeint(appender, (__ptr_0 + 0))

  /**
   * Append a duckdb_hugeint value to the appender.
  */
  def duckdb_append_hugeint(appender : duckdb_appender, value : Ptr[duckdb_hugeint]): duckdb_state =
    __sn_wrap_duckdb_duckdb_append_hugeint(appender, value)

  /**
   * Append a duckdb_interval value to the appender.
  */
  def duckdb_append_interval(appender : duckdb_appender, value : duckdb_interval)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_interval] = _root_.scala.scalanative.unsafe.alloc[duckdb_interval](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_append_interval(appender, (__ptr_0 + 0))

  /**
   * Append a duckdb_interval value to the appender.
  */
  def duckdb_append_interval(appender : duckdb_appender, value : Ptr[duckdb_interval]): duckdb_state =
    __sn_wrap_duckdb_duckdb_append_interval(appender, value)

  /**
   * Append a duckdb_time value to the appender.
  */
  def duckdb_append_time(appender : duckdb_appender, value : Ptr[duckdb_time]): duckdb_state =
    __sn_wrap_duckdb_duckdb_append_time(appender, value)

  /**
   * Append a duckdb_time value to the appender.
  */
  def duckdb_append_time(appender : duckdb_appender, value : duckdb_time)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_time] = _root_.scala.scalanative.unsafe.alloc[duckdb_time](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_append_time(appender, (__ptr_0 + 0))

  /**
   * Append a duckdb_timestamp value to the appender.
  */
  def duckdb_append_timestamp(appender : duckdb_appender, value : duckdb_timestamp)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_append_timestamp(appender, (__ptr_0 + 0))

  /**
   * Append a duckdb_timestamp value to the appender.
  */
  def duckdb_append_timestamp(appender : duckdb_appender, value : Ptr[duckdb_timestamp]): duckdb_state =
    __sn_wrap_duckdb_duckdb_append_timestamp(appender, value)

  /**
   * Append a duckdb_uhugeint value to the appender.
  */
  def duckdb_append_uhugeint(appender : duckdb_appender, value : duckdb_uhugeint)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_uhugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_uhugeint](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_append_uhugeint(appender, (__ptr_0 + 0))

  /**
   * Append a duckdb_uhugeint value to the appender.
  */
  def duckdb_append_uhugeint(appender : duckdb_appender, value : Ptr[duckdb_uhugeint]): duckdb_state =
    __sn_wrap_duckdb_duckdb_append_uhugeint(appender, value)

  /**
   * Binds a duckdb_date value to the prepared statement at the specified index.
  */
  def duckdb_bind_date(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : duckdb_date)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_date] = _root_.scala.scalanative.unsafe.alloc[duckdb_date](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_date(prepared_statement, param_idx, (__ptr_0 + 0))

  /**
   * Binds a duckdb_date value to the prepared statement at the specified index.
  */
  def duckdb_bind_date(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_date]): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_date(prepared_statement, param_idx, `val`)

  /**
   * Binds a duckdb_decimal value to the prepared statement at the specified index.
  */
  def duckdb_bind_decimal(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : duckdb_decimal)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_decimal] = _root_.scala.scalanative.unsafe.alloc[duckdb_decimal](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_decimal(prepared_statement, param_idx, (__ptr_0 + 0))

  /**
   * Binds a duckdb_decimal value to the prepared statement at the specified index.
  */
  def duckdb_bind_decimal(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_decimal]): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_decimal(prepared_statement, param_idx, `val`)

  /**
   * Binds a duckdb_hugeint value to the prepared statement at the specified index.
  */
  def duckdb_bind_hugeint(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_hugeint]): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_hugeint(prepared_statement, param_idx, `val`)

  /**
   * Binds a duckdb_hugeint value to the prepared statement at the specified index.
  */
  def duckdb_bind_hugeint(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : duckdb_hugeint)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_hugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_hugeint](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_hugeint(prepared_statement, param_idx, (__ptr_0 + 0))

  /**
   * Binds a duckdb_interval value to the prepared statement at the specified index.
  */
  def duckdb_bind_interval(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_interval]): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_interval(prepared_statement, param_idx, `val`)

  /**
   * Binds a duckdb_interval value to the prepared statement at the specified index.
  */
  def duckdb_bind_interval(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : duckdb_interval)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_interval] = _root_.scala.scalanative.unsafe.alloc[duckdb_interval](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_interval(prepared_statement, param_idx, (__ptr_0 + 0))

  /**
   * Binds a duckdb_time value to the prepared statement at the specified index.
  */
  def duckdb_bind_time(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : duckdb_time)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_time] = _root_.scala.scalanative.unsafe.alloc[duckdb_time](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_time(prepared_statement, param_idx, (__ptr_0 + 0))

  /**
   * Binds a duckdb_time value to the prepared statement at the specified index.
  */
  def duckdb_bind_time(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_time]): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_time(prepared_statement, param_idx, `val`)

  /**
   * Binds a duckdb_timestamp value to the prepared statement at the specified index.
  */
  def duckdb_bind_timestamp(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_timestamp]): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_timestamp(prepared_statement, param_idx, `val`)

  /**
   * Binds a duckdb_timestamp value to the prepared statement at the specified index.
  */
  def duckdb_bind_timestamp(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : duckdb_timestamp)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_timestamp(prepared_statement, param_idx, (__ptr_0 + 0))

  /**
   * Binds a duckdb_timestamp value to the prepared statement at the specified index.
  */
  def duckdb_bind_timestamp_tz(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_timestamp]): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_timestamp_tz(prepared_statement, param_idx, `val`)

  /**
   * Binds a duckdb_timestamp value to the prepared statement at the specified index.
  */
  def duckdb_bind_timestamp_tz(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : duckdb_timestamp)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_timestamp_tz(prepared_statement, param_idx, (__ptr_0 + 0))

  /**
   * Binds a duckdb_uhugeint value to the prepared statement at the specified index.
  */
  def duckdb_bind_uhugeint(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : Ptr[duckdb_uhugeint]): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_uhugeint(prepared_statement, param_idx, `val`)

  /**
   * Binds a duckdb_uhugeint value to the prepared statement at the specified index.
  */
  def duckdb_bind_uhugeint(prepared_statement : duckdb_prepared_statement, param_idx : idx_t, `val` : duckdb_uhugeint)(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_uhugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_uhugeint](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_uhugeint(prepared_statement, param_idx, (__ptr_0 + 0))

  /**
   * Creates a BIGNUM value from a duckdb_bignum
  */
  def duckdb_create_bignum(input : Ptr[duckdb_bignum]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_bignum(input)

  /**
   * Creates a BIGNUM value from a duckdb_bignum
  */
  def duckdb_create_bignum(input : duckdb_bignum)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_bignum] = _root_.scala.scalanative.unsafe.alloc[duckdb_bignum](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_bignum((__ptr_0 + 0))

  /**
   * Creates a BIT value from a duckdb_bit
  */
  def duckdb_create_bit(input : Ptr[duckdb_bit]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_bit(input)

  /**
   * Creates a BIT value from a duckdb_bit
  */
  def duckdb_create_bit(input : duckdb_bit)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_bit] = _root_.scala.scalanative.unsafe.alloc[duckdb_bit](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_bit((__ptr_0 + 0))

  /**
   * Creates a value from a date
  */
  def duckdb_create_date(input : Ptr[duckdb_date]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_date(input)

  /**
   * Creates a value from a date
  */
  def duckdb_create_date(input : duckdb_date)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_date] = _root_.scala.scalanative.unsafe.alloc[duckdb_date](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_date((__ptr_0 + 0))

  /**
   * Creates a DECIMAL value from a duckdb_decimal
  */
  def duckdb_create_decimal(input : duckdb_decimal)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_decimal] = _root_.scala.scalanative.unsafe.alloc[duckdb_decimal](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_decimal((__ptr_0 + 0))

  /**
   * Creates a DECIMAL value from a duckdb_decimal
  */
  def duckdb_create_decimal(input : Ptr[duckdb_decimal]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_decimal(input)

  /**
   * Creates a value from a hugeint
  */
  def duckdb_create_hugeint(input : Ptr[duckdb_hugeint]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_hugeint(input)

  /**
   * Creates a value from a hugeint
  */
  def duckdb_create_hugeint(input : duckdb_hugeint)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_hugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_hugeint](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_hugeint((__ptr_0 + 0))

  /**
   * Creates a value from an interval
  */
  def duckdb_create_interval(input : Ptr[duckdb_interval]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_interval(input)

  /**
   * Creates a value from an interval
  */
  def duckdb_create_interval(input : duckdb_interval)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_interval] = _root_.scala.scalanative.unsafe.alloc[duckdb_interval](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_interval((__ptr_0 + 0))

  /**
   * Creates a value from a time
  */
  def duckdb_create_time(input : Ptr[duckdb_time]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_time(input)

  /**
   * Creates a value from a time
  */
  def duckdb_create_time(input : duckdb_time)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_time] = _root_.scala.scalanative.unsafe.alloc[duckdb_time](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_time((__ptr_0 + 0))

  /**
   * Creates a value from a time_ns
  */
  def duckdb_create_time_ns(input : duckdb_time_ns)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_time_ns] = _root_.scala.scalanative.unsafe.alloc[duckdb_time_ns](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_time_ns((__ptr_0 + 0))

  /**
   * Creates a value from a time_ns
  */
  def duckdb_create_time_ns(input : Ptr[duckdb_time_ns]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_time_ns(input)

  /**
   * Create a `duckdb_time_tz` object from micros and a timezone offset.
  */
  def duckdb_create_time_tz(micros : int64_t, offset : int32_t)(__return : Ptr[duckdb_time_tz]): Unit =
    __sn_wrap_duckdb_duckdb_create_time_tz(micros, offset, __return)

  /**
   * Create a `duckdb_time_tz` object from micros and a timezone offset.
  */
  def duckdb_create_time_tz(micros : int64_t, offset : int32_t)(using Zone): duckdb_time_tz =
    val __ptr_0: Ptr[duckdb_time_tz] = _root_.scala.scalanative.unsafe.alloc[duckdb_time_tz](1)
    __sn_wrap_duckdb_duckdb_create_time_tz(micros, offset, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Creates a value from a time_tz. Not to be confused with `duckdb_create_time_tz`, which creates a duckdb_time_tz_t.
  */
  def duckdb_create_time_tz_value(value : duckdb_time_tz)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_time_tz] = _root_.scala.scalanative.unsafe.alloc[duckdb_time_tz](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_create_time_tz_value((__ptr_0 + 0))

  /**
   * Creates a value from a time_tz. Not to be confused with `duckdb_create_time_tz`, which creates a duckdb_time_tz_t.
  */
  def duckdb_create_time_tz_value(value : Ptr[duckdb_time_tz]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_time_tz_value(value)

  /**
   * Creates a TIMESTAMP value from a duckdb_timestamp
  */
  def duckdb_create_timestamp(input : duckdb_timestamp)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_timestamp((__ptr_0 + 0))

  /**
   * Creates a TIMESTAMP value from a duckdb_timestamp
  */
  def duckdb_create_timestamp(input : Ptr[duckdb_timestamp]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_timestamp(input)

  /**
   * Creates a TIMESTAMP_MS value from a duckdb_timestamp_ms
  */
  def duckdb_create_timestamp_ms(input : Ptr[duckdb_timestamp_ms]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_timestamp_ms(input)

  /**
   * Creates a TIMESTAMP_MS value from a duckdb_timestamp_ms
  */
  def duckdb_create_timestamp_ms(input : duckdb_timestamp_ms)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_timestamp_ms] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_ms](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_timestamp_ms((__ptr_0 + 0))

  /**
   * Creates a TIMESTAMP_NS value from a duckdb_timestamp_ns
  */
  def duckdb_create_timestamp_ns(input : Ptr[duckdb_timestamp_ns]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_timestamp_ns(input)

  /**
   * Creates a TIMESTAMP_NS value from a duckdb_timestamp_ns
  */
  def duckdb_create_timestamp_ns(input : duckdb_timestamp_ns)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_timestamp_ns] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_ns](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_timestamp_ns((__ptr_0 + 0))

  /**
   * Creates a TIMESTAMP_S value from a duckdb_timestamp_s
  */
  def duckdb_create_timestamp_s(input : duckdb_timestamp_s)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_timestamp_s] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_s](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_timestamp_s((__ptr_0 + 0))

  /**
   * Creates a TIMESTAMP_S value from a duckdb_timestamp_s
  */
  def duckdb_create_timestamp_s(input : Ptr[duckdb_timestamp_s]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_timestamp_s(input)

  /**
   * Creates a TIMESTAMP_TZ value from a duckdb_timestamp
  */
  def duckdb_create_timestamp_tz(input : Ptr[duckdb_timestamp]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_timestamp_tz(input)

  /**
   * Creates a TIMESTAMP_TZ value from a duckdb_timestamp
  */
  def duckdb_create_timestamp_tz(input : duckdb_timestamp)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_timestamp_tz((__ptr_0 + 0))

  /**
   * Creates a value from a uhugeint
  */
  def duckdb_create_uhugeint(input : duckdb_uhugeint)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_uhugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_uhugeint](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_uhugeint((__ptr_0 + 0))

  /**
   * Creates a value from a uhugeint
  */
  def duckdb_create_uhugeint(input : Ptr[duckdb_uhugeint]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_uhugeint(input)

  /**
   * Creates a UUID value from a uhugeint
  */
  def duckdb_create_uuid(input : Ptr[duckdb_uhugeint]): duckdb_value =
    __sn_wrap_duckdb_duckdb_create_uuid(input)

  /**
   * Creates a UUID value from a uhugeint
  */
  def duckdb_create_uuid(input : duckdb_uhugeint)(using Zone): duckdb_value =
    val __ptr_0: Ptr[duckdb_uhugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_uhugeint](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_duckdb_duckdb_create_uuid((__ptr_0 + 0))

  /**
   * Converts a duckdb_decimal object (as obtained from a `DUCKDB_TYPE_DECIMAL` column) into a double.
  */
  def duckdb_decimal_to_double(`val` : duckdb_decimal)(using Zone): Double =
    val __ptr_0: Ptr[duckdb_decimal] = _root_.scala.scalanative.unsafe.alloc[duckdb_decimal](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_decimal_to_double((__ptr_0 + 0))

  /**
   * Converts a duckdb_decimal object (as obtained from a `DUCKDB_TYPE_DECIMAL` column) into a double.
  */
  def duckdb_decimal_to_double(`val` : Ptr[duckdb_decimal]): Double =
    __sn_wrap_duckdb_duckdb_decimal_to_double(`val`)

  /**
   * Converts a double value to a duckdb_decimal object.
  */
  def duckdb_double_to_decimal(`val` : Double, width : uint8_t, scale : uint8_t)(__return : Ptr[duckdb_decimal]): Unit =
    __sn_wrap_duckdb_duckdb_double_to_decimal(`val`, width, scale, __return)

  /**
   * Converts a double value to a duckdb_decimal object.
  */
  def duckdb_double_to_decimal(`val` : Double, width : uint8_t, scale : uint8_t)(using Zone): duckdb_decimal =
    val __ptr_0: Ptr[duckdb_decimal] = _root_.scala.scalanative.unsafe.alloc[duckdb_decimal](1)
    __sn_wrap_duckdb_duckdb_double_to_decimal(`val`, width, scale, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Converts a double value to a duckdb_hugeint object.
  */
  def duckdb_double_to_hugeint(`val` : Double)(__return : Ptr[duckdb_hugeint]): Unit =
    __sn_wrap_duckdb_duckdb_double_to_hugeint(`val`, __return)

  /**
   * Converts a double value to a duckdb_hugeint object.
  */
  def duckdb_double_to_hugeint(`val` : Double)(using Zone): duckdb_hugeint =
    val __ptr_0: Ptr[duckdb_hugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_hugeint](1)
    __sn_wrap_duckdb_duckdb_double_to_hugeint(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Converts a double value to a duckdb_uhugeint object.
  */
  def duckdb_double_to_uhugeint(`val` : Double)(__return : Ptr[duckdb_uhugeint]): Unit =
    __sn_wrap_duckdb_duckdb_double_to_uhugeint(`val`, __return)

  /**
   * Converts a double value to a duckdb_uhugeint object.
  */
  def duckdb_double_to_uhugeint(`val` : Double)(using Zone): duckdb_uhugeint =
    val __ptr_0: Ptr[duckdb_uhugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_uhugeint](1)
    __sn_wrap_duckdb_duckdb_double_to_uhugeint(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Fetches a data chunk from a duckdb_result. This function should be called repeatedly until the result is exhausted.
  */
  def duckdb_fetch_chunk(result : Ptr[duckdb_result]): duckdb_data_chunk =
    __sn_wrap_duckdb_duckdb_fetch_chunk(result)

  /**
   * Fetches a data chunk from a duckdb_result. This function should be called repeatedly until the result is exhausted.
  */
  def duckdb_fetch_chunk(result : duckdb_result)(using Zone): duckdb_data_chunk =
    val __ptr_0: Ptr[duckdb_result] = _root_.scala.scalanative.unsafe.alloc[duckdb_result](1)
    !(__ptr_0 + 0) = result
    __sn_wrap_duckdb_duckdb_fetch_chunk((__ptr_0 + 0))

  /**
   * Decompose a `duckdb_date` object into year, month and date (stored as `duckdb_date_struct`).
  */
  def duckdb_from_date(date : Ptr[duckdb_date])(using Zone): duckdb_date_struct =
    val __ptr_0: Ptr[duckdb_date_struct] = _root_.scala.scalanative.unsafe.alloc[duckdb_date_struct](1)
    __sn_wrap_duckdb_duckdb_from_date(date, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Decompose a `duckdb_date` object into year, month and date (stored as `duckdb_date_struct`).
  */
  def duckdb_from_date(date : duckdb_date)(using Zone): duckdb_date_struct =
    val __ptr_0: Ptr[duckdb_date_struct] = _root_.scala.scalanative.unsafe.alloc[duckdb_date_struct](1)
    val __ptr_1: Ptr[duckdb_date] = _root_.scala.scalanative.unsafe.alloc[duckdb_date](1)
    !(__ptr_1 + 0) = date
    __sn_wrap_duckdb_duckdb_from_date((__ptr_1 + 0), (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Decompose a `duckdb_date` object into year, month and date (stored as `duckdb_date_struct`).
  */
  def duckdb_from_date(date : Ptr[duckdb_date])(__return : Ptr[duckdb_date_struct]): Unit =
    __sn_wrap_duckdb_duckdb_from_date(date, __return)

  /**
   * Decompose a `duckdb_time` object into hour, minute, second and microsecond (stored as `duckdb_time_struct`).
  */
  def duckdb_from_time(time : duckdb_time)(using Zone): duckdb_time_struct =
    val __ptr_0: Ptr[duckdb_time_struct] = _root_.scala.scalanative.unsafe.alloc[duckdb_time_struct](1)
    val __ptr_1: Ptr[duckdb_time] = _root_.scala.scalanative.unsafe.alloc[duckdb_time](1)
    !(__ptr_1 + 0) = time
    __sn_wrap_duckdb_duckdb_from_time((__ptr_1 + 0), (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Decompose a `duckdb_time` object into hour, minute, second and microsecond (stored as `duckdb_time_struct`).
  */
  def duckdb_from_time(time : Ptr[duckdb_time])(using Zone): duckdb_time_struct =
    val __ptr_0: Ptr[duckdb_time_struct] = _root_.scala.scalanative.unsafe.alloc[duckdb_time_struct](1)
    __sn_wrap_duckdb_duckdb_from_time(time, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Decompose a `duckdb_time` object into hour, minute, second and microsecond (stored as `duckdb_time_struct`).
  */
  def duckdb_from_time(time : Ptr[duckdb_time])(__return : Ptr[duckdb_time_struct]): Unit =
    __sn_wrap_duckdb_duckdb_from_time(time, __return)

  /**
   * Decompose a TIME_TZ objects into micros and a timezone offset.
  */
  def duckdb_from_time_tz(micros : duckdb_time_tz)(using Zone): duckdb_time_tz_struct =
    val __ptr_0: Ptr[duckdb_time_tz] = _root_.scala.scalanative.unsafe.alloc[duckdb_time_tz](1)
    val __ptr_1: Ptr[duckdb_time_tz_struct] = _root_.scala.scalanative.unsafe.alloc[duckdb_time_tz_struct](1)
    !(__ptr_0 + 0) = micros
    __sn_wrap_duckdb_duckdb_from_time_tz((__ptr_0 + 0), (__ptr_1 + 0))
    !(__ptr_1 + 0)

  /**
   * Decompose a TIME_TZ objects into micros and a timezone offset.
  */
  def duckdb_from_time_tz(micros : Ptr[duckdb_time_tz])(using Zone): duckdb_time_tz_struct =
    val __ptr_0: Ptr[duckdb_time_tz_struct] = _root_.scala.scalanative.unsafe.alloc[duckdb_time_tz_struct](1)
    __sn_wrap_duckdb_duckdb_from_time_tz(micros, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Decompose a TIME_TZ objects into micros and a timezone offset.
  */
  def duckdb_from_time_tz(micros : Ptr[duckdb_time_tz])(__return : Ptr[duckdb_time_tz_struct]): Unit =
    __sn_wrap_duckdb_duckdb_from_time_tz(micros, __return)

  /**
   * Decompose a `duckdb_timestamp` object into a `duckdb_timestamp_struct`.
  */
  def duckdb_from_timestamp(ts : duckdb_timestamp)(using Zone): duckdb_timestamp_struct =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    val __ptr_1: Ptr[duckdb_timestamp_struct] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_struct](1)
    !(__ptr_0 + 0) = ts
    __sn_wrap_duckdb_duckdb_from_timestamp((__ptr_0 + 0), (__ptr_1 + 0))
    !(__ptr_1 + 0)

  /**
   * Decompose a `duckdb_timestamp` object into a `duckdb_timestamp_struct`.
  */
  def duckdb_from_timestamp(ts : Ptr[duckdb_timestamp])(using Zone): duckdb_timestamp_struct =
    val __ptr_0: Ptr[duckdb_timestamp_struct] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_struct](1)
    __sn_wrap_duckdb_duckdb_from_timestamp(ts, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Decompose a `duckdb_timestamp` object into a `duckdb_timestamp_struct`.
  */
  def duckdb_from_timestamp(ts : Ptr[duckdb_timestamp])(__return : Ptr[duckdb_timestamp_struct]): Unit =
    __sn_wrap_duckdb_duckdb_from_timestamp(ts, __return)

  /**
   * Returns the duckdb_bignum value of the given value. The `data` field must be destroyed with `duckdb_free`.
  */
  def duckdb_get_bignum(`val` : duckdb_value)(using Zone): duckdb_bignum =
    val __ptr_0: Ptr[duckdb_bignum] = _root_.scala.scalanative.unsafe.alloc[duckdb_bignum](1)
    __sn_wrap_duckdb_duckdb_get_bignum(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the duckdb_bignum value of the given value. The `data` field must be destroyed with `duckdb_free`.
  */
  def duckdb_get_bignum(`val` : duckdb_value)(__return : Ptr[duckdb_bignum]): Unit =
    __sn_wrap_duckdb_duckdb_get_bignum(`val`, __return)

  /**
   * Returns the duckdb_bit value of the given value. The `data` field must be destroyed with `duckdb_free`.
  */
  def duckdb_get_bit(`val` : duckdb_value)(using Zone): duckdb_bit =
    val __ptr_0: Ptr[duckdb_bit] = _root_.scala.scalanative.unsafe.alloc[duckdb_bit](1)
    __sn_wrap_duckdb_duckdb_get_bit(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the duckdb_bit value of the given value. The `data` field must be destroyed with `duckdb_free`.
  */
  def duckdb_get_bit(`val` : duckdb_value)(__return : Ptr[duckdb_bit]): Unit =
    __sn_wrap_duckdb_duckdb_get_bit(`val`, __return)

  /**
   * Returns the blob value of the given value.
  */
  def duckdb_get_blob(`val` : duckdb_value)(__return : Ptr[duckdb_blob]): Unit =
    __sn_wrap_duckdb_duckdb_get_blob(`val`, __return)

  /**
   * Returns the blob value of the given value.
  */
  def duckdb_get_blob(`val` : duckdb_value)(using Zone): duckdb_blob =
    val __ptr_0: Ptr[duckdb_blob] = _root_.scala.scalanative.unsafe.alloc[duckdb_blob](1)
    __sn_wrap_duckdb_duckdb_get_blob(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the date value of the given value.
  */
  def duckdb_get_date(`val` : duckdb_value)(__return : Ptr[duckdb_date]): Unit =
    __sn_wrap_duckdb_duckdb_get_date(`val`, __return)

  /**
   * Returns the date value of the given value.
  */
  def duckdb_get_date(`val` : duckdb_value)(using Zone): duckdb_date =
    val __ptr_0: Ptr[duckdb_date] = _root_.scala.scalanative.unsafe.alloc[duckdb_date](1)
    __sn_wrap_duckdb_duckdb_get_date(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the duckdb_decimal value of the given value.
  */
  def duckdb_get_decimal(`val` : duckdb_value)(__return : Ptr[duckdb_decimal]): Unit =
    __sn_wrap_duckdb_duckdb_get_decimal(`val`, __return)

  /**
   * Returns the duckdb_decimal value of the given value.
  */
  def duckdb_get_decimal(`val` : duckdb_value)(using Zone): duckdb_decimal =
    val __ptr_0: Ptr[duckdb_decimal] = _root_.scala.scalanative.unsafe.alloc[duckdb_decimal](1)
    __sn_wrap_duckdb_duckdb_get_decimal(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the hugeint value of the given value.
  */
  def duckdb_get_hugeint(`val` : duckdb_value)(using Zone): duckdb_hugeint =
    val __ptr_0: Ptr[duckdb_hugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_hugeint](1)
    __sn_wrap_duckdb_duckdb_get_hugeint(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the hugeint value of the given value.
  */
  def duckdb_get_hugeint(`val` : duckdb_value)(__return : Ptr[duckdb_hugeint]): Unit =
    __sn_wrap_duckdb_duckdb_get_hugeint(`val`, __return)

  /**
   * Returns the interval value of the given value.
  */
  def duckdb_get_interval(`val` : duckdb_value)(__return : Ptr[duckdb_interval]): Unit =
    __sn_wrap_duckdb_duckdb_get_interval(`val`, __return)

  /**
   * Returns the interval value of the given value.
  */
  def duckdb_get_interval(`val` : duckdb_value)(using Zone): duckdb_interval =
    val __ptr_0: Ptr[duckdb_interval] = _root_.scala.scalanative.unsafe.alloc[duckdb_interval](1)
    __sn_wrap_duckdb_duckdb_get_interval(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the time value of the given value.
  */
  def duckdb_get_time(`val` : duckdb_value)(__return : Ptr[duckdb_time]): Unit =
    __sn_wrap_duckdb_duckdb_get_time(`val`, __return)

  /**
   * Returns the time value of the given value.
  */
  def duckdb_get_time(`val` : duckdb_value)(using Zone): duckdb_time =
    val __ptr_0: Ptr[duckdb_time] = _root_.scala.scalanative.unsafe.alloc[duckdb_time](1)
    __sn_wrap_duckdb_duckdb_get_time(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the time_ns value of the given value.
  */
  def duckdb_get_time_ns(`val` : duckdb_value)(using Zone): duckdb_time_ns =
    val __ptr_0: Ptr[duckdb_time_ns] = _root_.scala.scalanative.unsafe.alloc[duckdb_time_ns](1)
    __sn_wrap_duckdb_duckdb_get_time_ns(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the time_ns value of the given value.
  */
  def duckdb_get_time_ns(`val` : duckdb_value)(__return : Ptr[duckdb_time_ns]): Unit =
    __sn_wrap_duckdb_duckdb_get_time_ns(`val`, __return)

  /**
   * Returns the time_tz value of the given value.
  */
  def duckdb_get_time_tz(`val` : duckdb_value)(using Zone): duckdb_time_tz =
    val __ptr_0: Ptr[duckdb_time_tz] = _root_.scala.scalanative.unsafe.alloc[duckdb_time_tz](1)
    __sn_wrap_duckdb_duckdb_get_time_tz(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the time_tz value of the given value.
  */
  def duckdb_get_time_tz(`val` : duckdb_value)(__return : Ptr[duckdb_time_tz]): Unit =
    __sn_wrap_duckdb_duckdb_get_time_tz(`val`, __return)

  /**
   * Returns the TIMESTAMP value of the given value.
  */
  def duckdb_get_timestamp(`val` : duckdb_value)(using Zone): duckdb_timestamp =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    __sn_wrap_duckdb_duckdb_get_timestamp(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the TIMESTAMP value of the given value.
  */
  def duckdb_get_timestamp(`val` : duckdb_value)(__return : Ptr[duckdb_timestamp]): Unit =
    __sn_wrap_duckdb_duckdb_get_timestamp(`val`, __return)

  /**
   * Returns the duckdb_timestamp_ms value of the given value.
  */
  def duckdb_get_timestamp_ms(`val` : duckdb_value)(using Zone): duckdb_timestamp_ms =
    val __ptr_0: Ptr[duckdb_timestamp_ms] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_ms](1)
    __sn_wrap_duckdb_duckdb_get_timestamp_ms(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the duckdb_timestamp_ms value of the given value.
  */
  def duckdb_get_timestamp_ms(`val` : duckdb_value)(__return : Ptr[duckdb_timestamp_ms]): Unit =
    __sn_wrap_duckdb_duckdb_get_timestamp_ms(`val`, __return)

  /**
   * Returns the duckdb_timestamp_ns value of the given value.
  */
  def duckdb_get_timestamp_ns(`val` : duckdb_value)(__return : Ptr[duckdb_timestamp_ns]): Unit =
    __sn_wrap_duckdb_duckdb_get_timestamp_ns(`val`, __return)

  /**
   * Returns the duckdb_timestamp_ns value of the given value.
  */
  def duckdb_get_timestamp_ns(`val` : duckdb_value)(using Zone): duckdb_timestamp_ns =
    val __ptr_0: Ptr[duckdb_timestamp_ns] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_ns](1)
    __sn_wrap_duckdb_duckdb_get_timestamp_ns(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the duckdb_timestamp_s value of the given value.
  */
  def duckdb_get_timestamp_s(`val` : duckdb_value)(using Zone): duckdb_timestamp_s =
    val __ptr_0: Ptr[duckdb_timestamp_s] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_s](1)
    __sn_wrap_duckdb_duckdb_get_timestamp_s(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the duckdb_timestamp_s value of the given value.
  */
  def duckdb_get_timestamp_s(`val` : duckdb_value)(__return : Ptr[duckdb_timestamp_s]): Unit =
    __sn_wrap_duckdb_duckdb_get_timestamp_s(`val`, __return)

  /**
   * Returns the TIMESTAMP_TZ value of the given value.
  */
  def duckdb_get_timestamp_tz(`val` : duckdb_value)(using Zone): duckdb_timestamp =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    __sn_wrap_duckdb_duckdb_get_timestamp_tz(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the TIMESTAMP_TZ value of the given value.
  */
  def duckdb_get_timestamp_tz(`val` : duckdb_value)(__return : Ptr[duckdb_timestamp]): Unit =
    __sn_wrap_duckdb_duckdb_get_timestamp_tz(`val`, __return)

  /**
   * Returns the uhugeint value of the given value.
  */
  def duckdb_get_uhugeint(`val` : duckdb_value)(using Zone): duckdb_uhugeint =
    val __ptr_0: Ptr[duckdb_uhugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_uhugeint](1)
    __sn_wrap_duckdb_duckdb_get_uhugeint(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Returns the uhugeint value of the given value.
  */
  def duckdb_get_uhugeint(`val` : duckdb_value)(__return : Ptr[duckdb_uhugeint]): Unit =
    __sn_wrap_duckdb_duckdb_get_uhugeint(`val`, __return)

  /**
   * Returns a duckdb_uhugeint representing the UUID value of the given value.
  */
  def duckdb_get_uuid(`val` : duckdb_value)(__return : Ptr[duckdb_uhugeint]): Unit =
    __sn_wrap_duckdb_duckdb_get_uuid(`val`, __return)

  /**
   * Returns a duckdb_uhugeint representing the UUID value of the given value.
  */
  def duckdb_get_uuid(`val` : duckdb_value)(using Zone): duckdb_uhugeint =
    val __ptr_0: Ptr[duckdb_uhugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_uhugeint](1)
    __sn_wrap_duckdb_duckdb_get_uuid(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Converts a duckdb_hugeint object (as obtained from a `DUCKDB_TYPE_HUGEINT` column) into a double.
  */
  def duckdb_hugeint_to_double(`val` : Ptr[duckdb_hugeint]): Double =
    __sn_wrap_duckdb_duckdb_hugeint_to_double(`val`)

  /**
   * Converts a duckdb_hugeint object (as obtained from a `DUCKDB_TYPE_HUGEINT` column) into a double.
  */
  def duckdb_hugeint_to_double(`val` : duckdb_hugeint)(using Zone): Double =
    val __ptr_0: Ptr[duckdb_hugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_hugeint](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_hugeint_to_double((__ptr_0 + 0))

  /**
   * Test a `duckdb_date` to see if it is a finite value.
  */
  def duckdb_is_finite_date(date : duckdb_date)(using Zone): Boolean =
    val __ptr_0: Ptr[duckdb_date] = _root_.scala.scalanative.unsafe.alloc[duckdb_date](1)
    !(__ptr_0 + 0) = date
    __sn_wrap_duckdb_duckdb_is_finite_date((__ptr_0 + 0))

  /**
   * Test a `duckdb_date` to see if it is a finite value.
  */
  def duckdb_is_finite_date(date : Ptr[duckdb_date]): Boolean =
    __sn_wrap_duckdb_duckdb_is_finite_date(date)

  /**
   * Test a `duckdb_timestamp` to see if it is a finite value.
  */
  def duckdb_is_finite_timestamp(ts : duckdb_timestamp)(using Zone): Boolean =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    !(__ptr_0 + 0) = ts
    __sn_wrap_duckdb_duckdb_is_finite_timestamp((__ptr_0 + 0))

  /**
   * Test a `duckdb_timestamp` to see if it is a finite value.
  */
  def duckdb_is_finite_timestamp(ts : Ptr[duckdb_timestamp]): Boolean =
    __sn_wrap_duckdb_duckdb_is_finite_timestamp(ts)

  /**
   * Test a `duckdb_timestamp_ms` to see if it is a finite value.
  */
  def duckdb_is_finite_timestamp_ms(ts : Ptr[duckdb_timestamp_ms]): Boolean =
    __sn_wrap_duckdb_duckdb_is_finite_timestamp_ms(ts)

  /**
   * Test a `duckdb_timestamp_ms` to see if it is a finite value.
  */
  def duckdb_is_finite_timestamp_ms(ts : duckdb_timestamp_ms)(using Zone): Boolean =
    val __ptr_0: Ptr[duckdb_timestamp_ms] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_ms](1)
    !(__ptr_0 + 0) = ts
    __sn_wrap_duckdb_duckdb_is_finite_timestamp_ms((__ptr_0 + 0))

  /**
   * Test a `duckdb_timestamp_ns` to see if it is a finite value.
  */
  def duckdb_is_finite_timestamp_ns(ts : Ptr[duckdb_timestamp_ns]): Boolean =
    __sn_wrap_duckdb_duckdb_is_finite_timestamp_ns(ts)

  /**
   * Test a `duckdb_timestamp_ns` to see if it is a finite value.
  */
  def duckdb_is_finite_timestamp_ns(ts : duckdb_timestamp_ns)(using Zone): Boolean =
    val __ptr_0: Ptr[duckdb_timestamp_ns] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_ns](1)
    !(__ptr_0 + 0) = ts
    __sn_wrap_duckdb_duckdb_is_finite_timestamp_ns((__ptr_0 + 0))

  /**
   * Test a `duckdb_timestamp_s` to see if it is a finite value.
  */
  def duckdb_is_finite_timestamp_s(ts : duckdb_timestamp_s)(using Zone): Boolean =
    val __ptr_0: Ptr[duckdb_timestamp_s] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_s](1)
    !(__ptr_0 + 0) = ts
    __sn_wrap_duckdb_duckdb_is_finite_timestamp_s((__ptr_0 + 0))

  /**
   * Test a `duckdb_timestamp_s` to see if it is a finite value.
  */
  def duckdb_is_finite_timestamp_s(ts : Ptr[duckdb_timestamp_s]): Boolean =
    __sn_wrap_duckdb_duckdb_is_finite_timestamp_s(ts)

  /**
   * Get progress of the running query
  */
  def duckdb_query_progress(connection : duckdb_connection)(__return : Ptr[duckdb_query_progress_type]): Unit =
    __sn_wrap_duckdb_duckdb_query_progress(connection, __return)

  /**
   * Get progress of the running query
  */
  def duckdb_query_progress(connection : duckdb_connection)(using Zone): duckdb_query_progress_type =
    val __ptr_0: Ptr[duckdb_query_progress_type] = _root_.scala.scalanative.unsafe.alloc[duckdb_query_progress_type](1)
    __sn_wrap_duckdb_duckdb_query_progress(connection, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_result_arrow_array(result : duckdb_result, chunk : duckdb_data_chunk, out_array : Ptr[duckdb_arrow_array])(using Zone): Unit =
    val __ptr_0: Ptr[duckdb_result] = _root_.scala.scalanative.unsafe.alloc[duckdb_result](1)
    !(__ptr_0 + 0) = result
    __sn_wrap_duckdb_duckdb_result_arrow_array((__ptr_0 + 0), chunk, out_array)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_result_arrow_array(result : Ptr[duckdb_result], chunk : duckdb_data_chunk, out_array : Ptr[duckdb_arrow_array]): Unit =
    __sn_wrap_duckdb_duckdb_result_arrow_array(result, chunk, out_array)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_result_chunk_count(result : Ptr[duckdb_result]): idx_t =
    __sn_wrap_duckdb_duckdb_result_chunk_count(result)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_result_chunk_count(result : duckdb_result)(using Zone): idx_t =
    val __ptr_0: Ptr[duckdb_result] = _root_.scala.scalanative.unsafe.alloc[duckdb_result](1)
    !(__ptr_0 + 0) = result
    __sn_wrap_duckdb_duckdb_result_chunk_count((__ptr_0 + 0))

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_result_get_chunk(result : Ptr[duckdb_result], chunk_index : idx_t): duckdb_data_chunk =
    __sn_wrap_duckdb_duckdb_result_get_chunk(result, chunk_index)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_result_get_chunk(result : duckdb_result, chunk_index : idx_t)(using Zone): duckdb_data_chunk =
    val __ptr_0: Ptr[duckdb_result] = _root_.scala.scalanative.unsafe.alloc[duckdb_result](1)
    !(__ptr_0 + 0) = result
    __sn_wrap_duckdb_duckdb_result_get_chunk((__ptr_0 + 0), chunk_index)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_result_is_streaming(result : duckdb_result)(using Zone): Boolean =
    val __ptr_0: Ptr[duckdb_result] = _root_.scala.scalanative.unsafe.alloc[duckdb_result](1)
    !(__ptr_0 + 0) = result
    __sn_wrap_duckdb_duckdb_result_is_streaming((__ptr_0 + 0))

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_result_is_streaming(result : Ptr[duckdb_result]): Boolean =
    __sn_wrap_duckdb_duckdb_result_is_streaming(result)

  /**
   * Returns the return_type of the given result, or DUCKDB_RETURN_TYPE_INVALID on error
  */
  def duckdb_result_return_type(result : duckdb_result)(using Zone): duckdb_result_type =
    val __ptr_0: Ptr[duckdb_result] = _root_.scala.scalanative.unsafe.alloc[duckdb_result](1)
    !(__ptr_0 + 0) = result
    __sn_wrap_duckdb_duckdb_result_return_type((__ptr_0 + 0))

  /**
   * Returns the return_type of the given result, or DUCKDB_RETURN_TYPE_INVALID on error
  */
  def duckdb_result_return_type(result : Ptr[duckdb_result]): duckdb_result_type =
    __sn_wrap_duckdb_duckdb_result_return_type(result)

  /**
   * Returns the statement type of the statement that was executed
  */
  def duckdb_result_statement_type(result : duckdb_result)(using Zone): duckdb_statement_type =
    val __ptr_0: Ptr[duckdb_result] = _root_.scala.scalanative.unsafe.alloc[duckdb_result](1)
    !(__ptr_0 + 0) = result
    __sn_wrap_duckdb_duckdb_result_statement_type((__ptr_0 + 0))

  /**
   * Returns the statement type of the statement that was executed
  */
  def duckdb_result_statement_type(result : Ptr[duckdb_result]): duckdb_statement_type =
    __sn_wrap_duckdb_duckdb_result_statement_type(result)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_stream_fetch_chunk(result : duckdb_result)(using Zone): duckdb_data_chunk =
    val __ptr_0: Ptr[duckdb_result] = _root_.scala.scalanative.unsafe.alloc[duckdb_result](1)
    !(__ptr_0 + 0) = result
    __sn_wrap_duckdb_duckdb_stream_fetch_chunk((__ptr_0 + 0))

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_stream_fetch_chunk(result : Ptr[duckdb_result]): duckdb_data_chunk =
    __sn_wrap_duckdb_duckdb_stream_fetch_chunk(result)

  /**
   * Whether or not the duckdb_string_t value is inlined. This means that the data of the string does not have a separate allocation.
  */
  def duckdb_string_is_inlined(string : Ptr[duckdb_string_t]): Boolean =
    __sn_wrap_duckdb_duckdb_string_is_inlined(string)

  /**
   * Whether or not the duckdb_string_t value is inlined. This means that the data of the string does not have a separate allocation.
  */
  def duckdb_string_is_inlined(string : duckdb_string_t)(using Zone): Boolean =
    val __ptr_0: Ptr[duckdb_string_t] = _root_.scala.scalanative.unsafe.alloc[duckdb_string_t](1)
    !(__ptr_0 + 0) = string
    __sn_wrap_duckdb_duckdb_string_is_inlined((__ptr_0 + 0))

  /**
   * Get the string length of a string_t
  */
  def duckdb_string_t_length(string : duckdb_string_t)(using Zone): uint32_t =
    val __ptr_0: Ptr[duckdb_string_t] = _root_.scala.scalanative.unsafe.alloc[duckdb_string_t](1)
    !(__ptr_0 + 0) = string
    __sn_wrap_duckdb_duckdb_string_t_length((__ptr_0 + 0))

  /**
   * Get the string length of a string_t
  */
  def duckdb_string_t_length(string : Ptr[duckdb_string_t]): uint32_t =
    __sn_wrap_duckdb_duckdb_string_t_length(string)

  /**
   * Re-compose a `duckdb_date` from year, month and date (`duckdb_date_struct`).
  */
  def duckdb_to_date(date : Ptr[duckdb_date_struct])(__return : Ptr[duckdb_date]): Unit =
    __sn_wrap_duckdb_duckdb_to_date(date, __return)

  /**
   * Re-compose a `duckdb_date` from year, month and date (`duckdb_date_struct`).
  */
  def duckdb_to_date(date : Ptr[duckdb_date_struct])(using Zone): duckdb_date =
    val __ptr_0: Ptr[duckdb_date] = _root_.scala.scalanative.unsafe.alloc[duckdb_date](1)
    __sn_wrap_duckdb_duckdb_to_date(date, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Re-compose a `duckdb_date` from year, month and date (`duckdb_date_struct`).
  */
  def duckdb_to_date(date : duckdb_date_struct)(using Zone): duckdb_date =
    val __ptr_0: Ptr[duckdb_date_struct] = _root_.scala.scalanative.unsafe.alloc[duckdb_date_struct](1)
    val __ptr_1: Ptr[duckdb_date] = _root_.scala.scalanative.unsafe.alloc[duckdb_date](1)
    !(__ptr_0 + 0) = date
    __sn_wrap_duckdb_duckdb_to_date((__ptr_0 + 0), (__ptr_1 + 0))
    !(__ptr_1 + 0)

  /**
   * Re-compose a `duckdb_time` from hour, minute, second and microsecond (`duckdb_time_struct`).
  */
  def duckdb_to_time(time : Ptr[duckdb_time_struct])(__return : Ptr[duckdb_time]): Unit =
    __sn_wrap_duckdb_duckdb_to_time(time, __return)

  /**
   * Re-compose a `duckdb_time` from hour, minute, second and microsecond (`duckdb_time_struct`).
  */
  def duckdb_to_time(time : duckdb_time_struct)(using Zone): duckdb_time =
    val __ptr_0: Ptr[duckdb_time_struct] = _root_.scala.scalanative.unsafe.alloc[duckdb_time_struct](1)
    val __ptr_1: Ptr[duckdb_time] = _root_.scala.scalanative.unsafe.alloc[duckdb_time](1)
    !(__ptr_0 + 0) = time
    __sn_wrap_duckdb_duckdb_to_time((__ptr_0 + 0), (__ptr_1 + 0))
    !(__ptr_1 + 0)

  /**
   * Re-compose a `duckdb_time` from hour, minute, second and microsecond (`duckdb_time_struct`).
  */
  def duckdb_to_time(time : Ptr[duckdb_time_struct])(using Zone): duckdb_time =
    val __ptr_0: Ptr[duckdb_time] = _root_.scala.scalanative.unsafe.alloc[duckdb_time](1)
    __sn_wrap_duckdb_duckdb_to_time(time, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Re-compose a `duckdb_timestamp` from a duckdb_timestamp_struct.
  */
  def duckdb_to_timestamp(ts : duckdb_timestamp_struct)(using Zone): duckdb_timestamp =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    val __ptr_1: Ptr[duckdb_timestamp_struct] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp_struct](1)
    !(__ptr_1 + 0) = ts
    __sn_wrap_duckdb_duckdb_to_timestamp((__ptr_1 + 0), (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Re-compose a `duckdb_timestamp` from a duckdb_timestamp_struct.
  */
  def duckdb_to_timestamp(ts : Ptr[duckdb_timestamp_struct])(using Zone): duckdb_timestamp =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    __sn_wrap_duckdb_duckdb_to_timestamp(ts, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Re-compose a `duckdb_timestamp` from a duckdb_timestamp_struct.
  */
  def duckdb_to_timestamp(ts : Ptr[duckdb_timestamp_struct])(__return : Ptr[duckdb_timestamp]): Unit =
    __sn_wrap_duckdb_duckdb_to_timestamp(ts, __return)

  /**
   * Converts a duckdb_uhugeint object (as obtained from a `DUCKDB_TYPE_UHUGEINT` column) into a double.
  */
  def duckdb_uhugeint_to_double(`val` : duckdb_uhugeint)(using Zone): Double =
    val __ptr_0: Ptr[duckdb_uhugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_uhugeint](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_uhugeint_to_double((__ptr_0 + 0))

  /**
   * Converts a duckdb_uhugeint object (as obtained from a `DUCKDB_TYPE_UHUGEINT` column) into a double.
  */
  def duckdb_uhugeint_to_double(`val` : Ptr[duckdb_uhugeint]): Double =
    __sn_wrap_duckdb_duckdb_uhugeint_to_double(`val`)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_blob(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(using Zone): duckdb_blob =
    val __ptr_0: Ptr[duckdb_blob] = _root_.scala.scalanative.unsafe.alloc[duckdb_blob](1)
    __sn_wrap_duckdb_duckdb_value_blob(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_blob(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(__return : Ptr[duckdb_blob]): Unit =
    __sn_wrap_duckdb_duckdb_value_blob(result, col, row, __return)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_date(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(using Zone): duckdb_date =
    val __ptr_0: Ptr[duckdb_date] = _root_.scala.scalanative.unsafe.alloc[duckdb_date](1)
    __sn_wrap_duckdb_duckdb_value_date(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_date(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(__return : Ptr[duckdb_date]): Unit =
    __sn_wrap_duckdb_duckdb_value_date(result, col, row, __return)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_decimal(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(__return : Ptr[duckdb_decimal]): Unit =
    __sn_wrap_duckdb_duckdb_value_decimal(result, col, row, __return)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_decimal(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(using Zone): duckdb_decimal =
    val __ptr_0: Ptr[duckdb_decimal] = _root_.scala.scalanative.unsafe.alloc[duckdb_decimal](1)
    __sn_wrap_duckdb_duckdb_value_decimal(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_hugeint(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(__return : Ptr[duckdb_hugeint]): Unit =
    __sn_wrap_duckdb_duckdb_value_hugeint(result, col, row, __return)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_hugeint(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(using Zone): duckdb_hugeint =
    val __ptr_0: Ptr[duckdb_hugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_hugeint](1)
    __sn_wrap_duckdb_duckdb_value_hugeint(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_interval(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(using Zone): duckdb_interval =
    val __ptr_0: Ptr[duckdb_interval] = _root_.scala.scalanative.unsafe.alloc[duckdb_interval](1)
    __sn_wrap_duckdb_duckdb_value_interval(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_interval(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(__return : Ptr[duckdb_interval]): Unit =
    __sn_wrap_duckdb_duckdb_value_interval(result, col, row, __return)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_string(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(__return : Ptr[duckdb_string]): Unit =
    __sn_wrap_duckdb_duckdb_value_string(result, col, row, __return)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_string(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(using Zone): duckdb_string =
    val __ptr_0: Ptr[duckdb_string] = _root_.scala.scalanative.unsafe.alloc[duckdb_string](1)
    __sn_wrap_duckdb_duckdb_value_string(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * *DEPRECATED**: Use duckdb_value_string_internal instead. This function does not work correctly if the string contains null bytes.
  */
  def duckdb_value_string_internal(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(using Zone): duckdb_string =
    val __ptr_0: Ptr[duckdb_string] = _root_.scala.scalanative.unsafe.alloc[duckdb_string](1)
    __sn_wrap_duckdb_duckdb_value_string_internal(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * *DEPRECATED**: Use duckdb_value_string_internal instead. This function does not work correctly if the string contains null bytes.
  */
  def duckdb_value_string_internal(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(__return : Ptr[duckdb_string]): Unit =
    __sn_wrap_duckdb_duckdb_value_string_internal(result, col, row, __return)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_time(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(__return : Ptr[duckdb_time]): Unit =
    __sn_wrap_duckdb_duckdb_value_time(result, col, row, __return)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_time(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(using Zone): duckdb_time =
    val __ptr_0: Ptr[duckdb_time] = _root_.scala.scalanative.unsafe.alloc[duckdb_time](1)
    __sn_wrap_duckdb_duckdb_value_time(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_timestamp(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(__return : Ptr[duckdb_timestamp]): Unit =
    __sn_wrap_duckdb_duckdb_value_timestamp(result, col, row, __return)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_timestamp(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(using Zone): duckdb_timestamp =
    val __ptr_0: Ptr[duckdb_timestamp] = _root_.scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    __sn_wrap_duckdb_duckdb_value_timestamp(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_uhugeint(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(__return : Ptr[duckdb_uhugeint]): Unit =
    __sn_wrap_duckdb_duckdb_value_uhugeint(result, col, row, __return)

  /**
   * *DEPRECATION NOTICE**: This method is scheduled for removal in a future release.
  */
  def duckdb_value_uhugeint(result : Ptr[duckdb_result], col : idx_t, row : idx_t)(using Zone): duckdb_uhugeint =
    val __ptr_0: Ptr[duckdb_uhugeint] = _root_.scala.scalanative.unsafe.alloc[duckdb_uhugeint](1)
    __sn_wrap_duckdb_duckdb_value_uhugeint(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

object types:
    export _root_.duckdb.structs.*
    export _root_.duckdb.aliases.*
    export _root_.duckdb.enumerations.*

object all:
  export _root_.duckdb.enumerations.DUCKDB_TYPE
  export _root_.duckdb.enumerations.duckdb_cast_mode
  export _root_.duckdb.enumerations.duckdb_error_type
  export _root_.duckdb.enumerations.duckdb_pending_state
  export _root_.duckdb.enumerations.duckdb_result_type
  export _root_.duckdb.enumerations.duckdb_state
  export _root_.duckdb.enumerations.duckdb_statement_type
  export _root_.duckdb.aliases.duckdb_aggregate_combine_t
  export _root_.duckdb.aliases.duckdb_aggregate_destroy_t
  export _root_.duckdb.aliases.duckdb_aggregate_finalize_t
  export _root_.duckdb.aliases.duckdb_aggregate_function
  export _root_.duckdb.aliases.duckdb_aggregate_function_set
  export _root_.duckdb.aliases.duckdb_aggregate_init_t
  export _root_.duckdb.aliases.duckdb_aggregate_state
  export _root_.duckdb.aliases.duckdb_aggregate_state_size
  export _root_.duckdb.aliases.duckdb_aggregate_update_t
  export _root_.duckdb.aliases.duckdb_appender
  export _root_.duckdb.aliases.duckdb_arrow
  export _root_.duckdb.aliases.duckdb_arrow_array
  export _root_.duckdb.aliases.duckdb_arrow_converted_schema
  export _root_.duckdb.aliases.duckdb_arrow_options
  export _root_.duckdb.aliases.duckdb_arrow_schema
  export _root_.duckdb.aliases.duckdb_arrow_stream
  export _root_.duckdb.aliases.duckdb_bind_info
  export _root_.duckdb.aliases.duckdb_cast_function
  export _root_.duckdb.aliases.duckdb_cast_function_t
  export _root_.duckdb.aliases.duckdb_client_context
  export _root_.duckdb.aliases.duckdb_config
  export _root_.duckdb.aliases.duckdb_connection
  export _root_.duckdb.aliases.duckdb_copy_callback_t
  export _root_.duckdb.aliases.duckdb_create_type_info
  export _root_.duckdb.aliases.duckdb_data_chunk
  export _root_.duckdb.aliases.duckdb_database
  export _root_.duckdb.aliases.duckdb_delete_callback_t
  export _root_.duckdb.aliases.duckdb_error_data
  export _root_.duckdb.aliases.duckdb_expression
  export _root_.duckdb.aliases.duckdb_extension_info
  export _root_.duckdb.aliases.duckdb_extracted_statements
  export _root_.duckdb.aliases.duckdb_function_info
  export _root_.duckdb.aliases.duckdb_init_info
  export _root_.duckdb.aliases.duckdb_instance_cache
  export _root_.duckdb.aliases.duckdb_logical_type
  export _root_.duckdb.aliases.duckdb_pending_result
  export _root_.duckdb.aliases.duckdb_prepared_statement
  export _root_.duckdb.aliases.duckdb_profiling_info
  export _root_.duckdb.aliases.duckdb_replacement_callback_t
  export _root_.duckdb.aliases.duckdb_replacement_scan_info
  export _root_.duckdb.aliases.duckdb_scalar_function
  export _root_.duckdb.aliases.duckdb_scalar_function_bind_t
  export _root_.duckdb.aliases.duckdb_scalar_function_set
  export _root_.duckdb.aliases.duckdb_scalar_function_t
  export _root_.duckdb.aliases.duckdb_selection_vector
  export _root_.duckdb.aliases.duckdb_table_description
  export _root_.duckdb.aliases.duckdb_table_function
  export _root_.duckdb.aliases.duckdb_table_function_bind_t
  export _root_.duckdb.aliases.duckdb_table_function_init_t
  export _root_.duckdb.aliases.duckdb_table_function_t
  export _root_.duckdb.aliases.duckdb_task_state
  export _root_.duckdb.aliases.duckdb_type
  export _root_.duckdb.aliases.duckdb_value
  export _root_.duckdb.aliases.duckdb_vector
  export _root_.duckdb.aliases.idx_t
  export _root_.duckdb.aliases.int16_t
  export _root_.duckdb.aliases.int32_t
  export _root_.duckdb.aliases.int64_t
  export _root_.duckdb.aliases.int8_t
  export _root_.duckdb.aliases.sel_t
  export _root_.duckdb.aliases.size_t
  export _root_.duckdb.aliases.uint16_t
  export _root_.duckdb.aliases.uint32_t
  export _root_.duckdb.aliases.uint64_t
  export _root_.duckdb.aliases.uint8_t
  export _root_.duckdb.structs.ArrowArray
  export _root_.duckdb.structs.ArrowSchema
  export _root_.duckdb.structs._duckdb_aggregate_function
  export _root_.duckdb.structs._duckdb_aggregate_function_set
  export _root_.duckdb.structs._duckdb_aggregate_state
  export _root_.duckdb.structs._duckdb_appender
  export _root_.duckdb.structs._duckdb_arrow
  export _root_.duckdb.structs._duckdb_arrow_array
  export _root_.duckdb.structs._duckdb_arrow_converted_schema
  export _root_.duckdb.structs._duckdb_arrow_options
  export _root_.duckdb.structs._duckdb_arrow_schema
  export _root_.duckdb.structs._duckdb_arrow_stream
  export _root_.duckdb.structs._duckdb_bind_info
  export _root_.duckdb.structs._duckdb_cast_function
  export _root_.duckdb.structs._duckdb_client_context
  export _root_.duckdb.structs._duckdb_config
  export _root_.duckdb.structs._duckdb_connection
  export _root_.duckdb.structs._duckdb_create_type_info
  export _root_.duckdb.structs._duckdb_data_chunk
  export _root_.duckdb.structs._duckdb_database
  export _root_.duckdb.structs._duckdb_error_data
  export _root_.duckdb.structs._duckdb_expression
  export _root_.duckdb.structs._duckdb_extension_info
  export _root_.duckdb.structs._duckdb_extracted_statements
  export _root_.duckdb.structs._duckdb_function_info
  export _root_.duckdb.structs._duckdb_init_info
  export _root_.duckdb.structs._duckdb_instance_cache
  export _root_.duckdb.structs._duckdb_logical_type
  export _root_.duckdb.structs._duckdb_pending_result
  export _root_.duckdb.structs._duckdb_prepared_statement
  export _root_.duckdb.structs._duckdb_profiling_info
  export _root_.duckdb.structs._duckdb_replacement_scan_info
  export _root_.duckdb.structs._duckdb_scalar_function
  export _root_.duckdb.structs._duckdb_scalar_function_set
  export _root_.duckdb.structs._duckdb_selection_vector
  export _root_.duckdb.structs._duckdb_table_description
  export _root_.duckdb.structs._duckdb_table_function
  export _root_.duckdb.structs._duckdb_value
  export _root_.duckdb.structs._duckdb_vector
  export _root_.duckdb.structs.duckdb_bignum
  export _root_.duckdb.structs.duckdb_bit
  export _root_.duckdb.structs.duckdb_blob
  export _root_.duckdb.structs.duckdb_column
  export _root_.duckdb.structs.duckdb_date
  export _root_.duckdb.structs.duckdb_date_struct
  export _root_.duckdb.structs.duckdb_decimal
  export _root_.duckdb.structs.duckdb_extension_access
  export _root_.duckdb.structs.duckdb_hugeint
  export _root_.duckdb.structs.duckdb_interval
  export _root_.duckdb.structs.duckdb_list_entry
  export _root_.duckdb.structs.duckdb_query_progress_type
  export _root_.duckdb.structs.duckdb_result
  export _root_.duckdb.structs.duckdb_string
  export _root_.duckdb.structs.duckdb_string_t
  export _root_.duckdb.structs.duckdb_time
  export _root_.duckdb.structs.duckdb_time_ns
  export _root_.duckdb.structs.duckdb_time_struct
  export _root_.duckdb.structs.duckdb_time_tz
  export _root_.duckdb.structs.duckdb_time_tz_struct
  export _root_.duckdb.structs.duckdb_timestamp
  export _root_.duckdb.structs.duckdb_timestamp_ms
  export _root_.duckdb.structs.duckdb_timestamp_ns
  export _root_.duckdb.structs.duckdb_timestamp_s
  export _root_.duckdb.structs.duckdb_timestamp_struct
  export _root_.duckdb.structs.duckdb_uhugeint
  export _root_.duckdb.functions.duckdb_add_aggregate_function_to_set
  export _root_.duckdb.functions.duckdb_add_replacement_scan
  export _root_.duckdb.functions.duckdb_add_scalar_function_to_set
  export _root_.duckdb.functions.duckdb_aggregate_function_add_parameter
  export _root_.duckdb.functions.duckdb_aggregate_function_get_extra_info
  export _root_.duckdb.functions.duckdb_aggregate_function_set_destructor
  export _root_.duckdb.functions.duckdb_aggregate_function_set_error
  export _root_.duckdb.functions.duckdb_aggregate_function_set_extra_info
  export _root_.duckdb.functions.duckdb_aggregate_function_set_functions
  export _root_.duckdb.functions.duckdb_aggregate_function_set_name
  export _root_.duckdb.functions.duckdb_aggregate_function_set_return_type
  export _root_.duckdb.functions.duckdb_aggregate_function_set_special_handling
  export _root_.duckdb.functions.duckdb_append_blob
  export _root_.duckdb.functions.duckdb_append_bool
  export _root_.duckdb.functions.duckdb_append_data_chunk
  export _root_.duckdb.functions.duckdb_append_default
  export _root_.duckdb.functions.duckdb_append_default_to_chunk
  export _root_.duckdb.functions.duckdb_append_double
  export _root_.duckdb.functions.duckdb_append_float
  export _root_.duckdb.functions.duckdb_append_int16
  export _root_.duckdb.functions.duckdb_append_int32
  export _root_.duckdb.functions.duckdb_append_int64
  export _root_.duckdb.functions.duckdb_append_int8
  export _root_.duckdb.functions.duckdb_append_null
  export _root_.duckdb.functions.duckdb_append_uint16
  export _root_.duckdb.functions.duckdb_append_uint32
  export _root_.duckdb.functions.duckdb_append_uint64
  export _root_.duckdb.functions.duckdb_append_uint8
  export _root_.duckdb.functions.duckdb_append_value
  export _root_.duckdb.functions.duckdb_append_varchar
  export _root_.duckdb.functions.duckdb_append_varchar_length
  export _root_.duckdb.functions.duckdb_appender_add_column
  export _root_.duckdb.functions.duckdb_appender_begin_row
  export _root_.duckdb.functions.duckdb_appender_clear_columns
  export _root_.duckdb.functions.duckdb_appender_close
  export _root_.duckdb.functions.duckdb_appender_column_count
  export _root_.duckdb.functions.duckdb_appender_column_type
  export _root_.duckdb.functions.duckdb_appender_create
  export _root_.duckdb.functions.duckdb_appender_create_ext
  export _root_.duckdb.functions.duckdb_appender_create_query
  export _root_.duckdb.functions.duckdb_appender_destroy
  export _root_.duckdb.functions.duckdb_appender_end_row
  export _root_.duckdb.functions.duckdb_appender_error
  export _root_.duckdb.functions.duckdb_appender_error_data
  export _root_.duckdb.functions.duckdb_appender_flush
  export _root_.duckdb.functions.duckdb_array_type_array_size
  export _root_.duckdb.functions.duckdb_array_type_child_type
  export _root_.duckdb.functions.duckdb_array_vector_get_child
  export _root_.duckdb.functions.duckdb_arrow_array_scan
  export _root_.duckdb.functions.duckdb_arrow_column_count
  export _root_.duckdb.functions.duckdb_arrow_row_count
  export _root_.duckdb.functions.duckdb_arrow_rows_changed
  export _root_.duckdb.functions.duckdb_arrow_scan
  export _root_.duckdb.functions.duckdb_bind_add_result_column
  export _root_.duckdb.functions.duckdb_bind_blob
  export _root_.duckdb.functions.duckdb_bind_boolean
  export _root_.duckdb.functions.duckdb_bind_double
  export _root_.duckdb.functions.duckdb_bind_float
  export _root_.duckdb.functions.duckdb_bind_get_extra_info
  export _root_.duckdb.functions.duckdb_bind_get_named_parameter
  export _root_.duckdb.functions.duckdb_bind_get_parameter
  export _root_.duckdb.functions.duckdb_bind_get_parameter_count
  export _root_.duckdb.functions.duckdb_bind_int16
  export _root_.duckdb.functions.duckdb_bind_int32
  export _root_.duckdb.functions.duckdb_bind_int64
  export _root_.duckdb.functions.duckdb_bind_int8
  export _root_.duckdb.functions.duckdb_bind_null
  export _root_.duckdb.functions.duckdb_bind_parameter_index
  export _root_.duckdb.functions.duckdb_bind_set_bind_data
  export _root_.duckdb.functions.duckdb_bind_set_cardinality
  export _root_.duckdb.functions.duckdb_bind_set_error
  export _root_.duckdb.functions.duckdb_bind_uint16
  export _root_.duckdb.functions.duckdb_bind_uint32
  export _root_.duckdb.functions.duckdb_bind_uint64
  export _root_.duckdb.functions.duckdb_bind_uint8
  export _root_.duckdb.functions.duckdb_bind_value
  export _root_.duckdb.functions.duckdb_bind_varchar
  export _root_.duckdb.functions.duckdb_bind_varchar_length
  export _root_.duckdb.functions.duckdb_cast_function_get_cast_mode
  export _root_.duckdb.functions.duckdb_cast_function_get_extra_info
  export _root_.duckdb.functions.duckdb_cast_function_set_error
  export _root_.duckdb.functions.duckdb_cast_function_set_extra_info
  export _root_.duckdb.functions.duckdb_cast_function_set_function
  export _root_.duckdb.functions.duckdb_cast_function_set_implicit_cast_cost
  export _root_.duckdb.functions.duckdb_cast_function_set_row_error
  export _root_.duckdb.functions.duckdb_cast_function_set_source_type
  export _root_.duckdb.functions.duckdb_cast_function_set_target_type
  export _root_.duckdb.functions.duckdb_clear_bindings
  export _root_.duckdb.functions.duckdb_client_context_get_connection_id
  export _root_.duckdb.functions.duckdb_close
  export _root_.duckdb.functions.duckdb_column_count
  export _root_.duckdb.functions.duckdb_column_data
  export _root_.duckdb.functions.duckdb_column_has_default
  export _root_.duckdb.functions.duckdb_column_logical_type
  export _root_.duckdb.functions.duckdb_column_name
  export _root_.duckdb.functions.duckdb_column_type
  export _root_.duckdb.functions.duckdb_config_count
  export _root_.duckdb.functions.duckdb_connect
  export _root_.duckdb.functions.duckdb_connection_get_arrow_options
  export _root_.duckdb.functions.duckdb_connection_get_client_context
  export _root_.duckdb.functions.duckdb_create_aggregate_function
  export _root_.duckdb.functions.duckdb_create_aggregate_function_set
  export _root_.duckdb.functions.duckdb_create_array_type
  export _root_.duckdb.functions.duckdb_create_array_value
  export _root_.duckdb.functions.duckdb_create_blob
  export _root_.duckdb.functions.duckdb_create_bool
  export _root_.duckdb.functions.duckdb_create_cast_function
  export _root_.duckdb.functions.duckdb_create_config
  export _root_.duckdb.functions.duckdb_create_data_chunk
  export _root_.duckdb.functions.duckdb_create_decimal_type
  export _root_.duckdb.functions.duckdb_create_double
  export _root_.duckdb.functions.duckdb_create_enum_type
  export _root_.duckdb.functions.duckdb_create_enum_value
  export _root_.duckdb.functions.duckdb_create_error_data
  export _root_.duckdb.functions.duckdb_create_float
  export _root_.duckdb.functions.duckdb_create_instance_cache
  export _root_.duckdb.functions.duckdb_create_int16
  export _root_.duckdb.functions.duckdb_create_int32
  export _root_.duckdb.functions.duckdb_create_int64
  export _root_.duckdb.functions.duckdb_create_int8
  export _root_.duckdb.functions.duckdb_create_list_type
  export _root_.duckdb.functions.duckdb_create_list_value
  export _root_.duckdb.functions.duckdb_create_logical_type
  export _root_.duckdb.functions.duckdb_create_map_type
  export _root_.duckdb.functions.duckdb_create_map_value
  export _root_.duckdb.functions.duckdb_create_null_value
  export _root_.duckdb.functions.duckdb_create_scalar_function
  export _root_.duckdb.functions.duckdb_create_scalar_function_set
  export _root_.duckdb.functions.duckdb_create_selection_vector
  export _root_.duckdb.functions.duckdb_create_struct_type
  export _root_.duckdb.functions.duckdb_create_struct_value
  export _root_.duckdb.functions.duckdb_create_table_function
  export _root_.duckdb.functions.duckdb_create_task_state
  export _root_.duckdb.functions.duckdb_create_uint16
  export _root_.duckdb.functions.duckdb_create_uint32
  export _root_.duckdb.functions.duckdb_create_uint64
  export _root_.duckdb.functions.duckdb_create_uint8
  export _root_.duckdb.functions.duckdb_create_union_type
  export _root_.duckdb.functions.duckdb_create_union_value
  export _root_.duckdb.functions.duckdb_create_varchar
  export _root_.duckdb.functions.duckdb_create_varchar_length
  export _root_.duckdb.functions.duckdb_create_vector
  export _root_.duckdb.functions.duckdb_data_chunk_from_arrow
  export _root_.duckdb.functions.duckdb_data_chunk_get_column_count
  export _root_.duckdb.functions.duckdb_data_chunk_get_size
  export _root_.duckdb.functions.duckdb_data_chunk_get_vector
  export _root_.duckdb.functions.duckdb_data_chunk_reset
  export _root_.duckdb.functions.duckdb_data_chunk_set_size
  export _root_.duckdb.functions.duckdb_data_chunk_to_arrow
  export _root_.duckdb.functions.duckdb_decimal_internal_type
  export _root_.duckdb.functions.duckdb_decimal_scale
  export _root_.duckdb.functions.duckdb_decimal_width
  export _root_.duckdb.functions.duckdb_destroy_aggregate_function
  export _root_.duckdb.functions.duckdb_destroy_aggregate_function_set
  export _root_.duckdb.functions.duckdb_destroy_arrow
  export _root_.duckdb.functions.duckdb_destroy_arrow_converted_schema
  export _root_.duckdb.functions.duckdb_destroy_arrow_options
  export _root_.duckdb.functions.duckdb_destroy_arrow_stream
  export _root_.duckdb.functions.duckdb_destroy_cast_function
  export _root_.duckdb.functions.duckdb_destroy_client_context
  export _root_.duckdb.functions.duckdb_destroy_config
  export _root_.duckdb.functions.duckdb_destroy_data_chunk
  export _root_.duckdb.functions.duckdb_destroy_error_data
  export _root_.duckdb.functions.duckdb_destroy_expression
  export _root_.duckdb.functions.duckdb_destroy_extracted
  export _root_.duckdb.functions.duckdb_destroy_instance_cache
  export _root_.duckdb.functions.duckdb_destroy_logical_type
  export _root_.duckdb.functions.duckdb_destroy_pending
  export _root_.duckdb.functions.duckdb_destroy_prepare
  export _root_.duckdb.functions.duckdb_destroy_result
  export _root_.duckdb.functions.duckdb_destroy_scalar_function
  export _root_.duckdb.functions.duckdb_destroy_scalar_function_set
  export _root_.duckdb.functions.duckdb_destroy_selection_vector
  export _root_.duckdb.functions.duckdb_destroy_table_function
  export _root_.duckdb.functions.duckdb_destroy_task_state
  export _root_.duckdb.functions.duckdb_destroy_value
  export _root_.duckdb.functions.duckdb_destroy_vector
  export _root_.duckdb.functions.duckdb_disconnect
  export _root_.duckdb.functions.duckdb_enum_dictionary_size
  export _root_.duckdb.functions.duckdb_enum_dictionary_value
  export _root_.duckdb.functions.duckdb_enum_internal_type
  export _root_.duckdb.functions.duckdb_error_data_error_type
  export _root_.duckdb.functions.duckdb_error_data_has_error
  export _root_.duckdb.functions.duckdb_error_data_message
  export _root_.duckdb.functions.duckdb_execute_n_tasks_state
  export _root_.duckdb.functions.duckdb_execute_pending
  export _root_.duckdb.functions.duckdb_execute_prepared
  export _root_.duckdb.functions.duckdb_execute_prepared_arrow
  export _root_.duckdb.functions.duckdb_execute_prepared_streaming
  export _root_.duckdb.functions.duckdb_execute_tasks
  export _root_.duckdb.functions.duckdb_execute_tasks_state
  export _root_.duckdb.functions.duckdb_execution_is_finished
  export _root_.duckdb.functions.duckdb_expression_fold
  export _root_.duckdb.functions.duckdb_expression_is_foldable
  export _root_.duckdb.functions.duckdb_expression_return_type
  export _root_.duckdb.functions.duckdb_extract_statements
  export _root_.duckdb.functions.duckdb_extract_statements_error
  export _root_.duckdb.functions.duckdb_finish_execution
  export _root_.duckdb.functions.duckdb_free
  export _root_.duckdb.functions.duckdb_function_get_bind_data
  export _root_.duckdb.functions.duckdb_function_get_extra_info
  export _root_.duckdb.functions.duckdb_function_get_init_data
  export _root_.duckdb.functions.duckdb_function_get_local_init_data
  export _root_.duckdb.functions.duckdb_function_set_error
  export _root_.duckdb.functions.duckdb_get_bool
  export _root_.duckdb.functions.duckdb_get_config_flag
  export _root_.duckdb.functions.duckdb_get_double
  export _root_.duckdb.functions.duckdb_get_enum_value
  export _root_.duckdb.functions.duckdb_get_float
  export _root_.duckdb.functions.duckdb_get_int16
  export _root_.duckdb.functions.duckdb_get_int32
  export _root_.duckdb.functions.duckdb_get_int64
  export _root_.duckdb.functions.duckdb_get_int8
  export _root_.duckdb.functions.duckdb_get_list_child
  export _root_.duckdb.functions.duckdb_get_list_size
  export _root_.duckdb.functions.duckdb_get_map_key
  export _root_.duckdb.functions.duckdb_get_map_size
  export _root_.duckdb.functions.duckdb_get_map_value
  export _root_.duckdb.functions.duckdb_get_or_create_from_cache
  export _root_.duckdb.functions.duckdb_get_profiling_info
  export _root_.duckdb.functions.duckdb_get_struct_child
  export _root_.duckdb.functions.duckdb_get_table_names
  export _root_.duckdb.functions.duckdb_get_type_id
  export _root_.duckdb.functions.duckdb_get_uint16
  export _root_.duckdb.functions.duckdb_get_uint32
  export _root_.duckdb.functions.duckdb_get_uint64
  export _root_.duckdb.functions.duckdb_get_uint8
  export _root_.duckdb.functions.duckdb_get_value_type
  export _root_.duckdb.functions.duckdb_get_varchar
  export _root_.duckdb.functions.duckdb_init_get_bind_data
  export _root_.duckdb.functions.duckdb_init_get_column_count
  export _root_.duckdb.functions.duckdb_init_get_column_index
  export _root_.duckdb.functions.duckdb_init_get_extra_info
  export _root_.duckdb.functions.duckdb_init_set_error
  export _root_.duckdb.functions.duckdb_init_set_init_data
  export _root_.duckdb.functions.duckdb_init_set_max_threads
  export _root_.duckdb.functions.duckdb_interrupt
  export _root_.duckdb.functions.duckdb_is_null_value
  export _root_.duckdb.functions.duckdb_library_version
  export _root_.duckdb.functions.duckdb_list_type_child_type
  export _root_.duckdb.functions.duckdb_list_vector_get_child
  export _root_.duckdb.functions.duckdb_list_vector_get_size
  export _root_.duckdb.functions.duckdb_list_vector_reserve
  export _root_.duckdb.functions.duckdb_list_vector_set_size
  export _root_.duckdb.functions.duckdb_logical_type_get_alias
  export _root_.duckdb.functions.duckdb_logical_type_set_alias
  export _root_.duckdb.functions.duckdb_malloc
  export _root_.duckdb.functions.duckdb_map_type_key_type
  export _root_.duckdb.functions.duckdb_map_type_value_type
  export _root_.duckdb.functions.duckdb_nparams
  export _root_.duckdb.functions.duckdb_nullmask_data
  export _root_.duckdb.functions.duckdb_open
  export _root_.duckdb.functions.duckdb_open_ext
  export _root_.duckdb.functions.duckdb_param_logical_type
  export _root_.duckdb.functions.duckdb_param_type
  export _root_.duckdb.functions.duckdb_parameter_name
  export _root_.duckdb.functions.duckdb_pending_error
  export _root_.duckdb.functions.duckdb_pending_execute_check_state
  export _root_.duckdb.functions.duckdb_pending_execute_task
  export _root_.duckdb.functions.duckdb_pending_execution_is_finished
  export _root_.duckdb.functions.duckdb_pending_prepared
  export _root_.duckdb.functions.duckdb_pending_prepared_streaming
  export _root_.duckdb.functions.duckdb_prepare
  export _root_.duckdb.functions.duckdb_prepare_error
  export _root_.duckdb.functions.duckdb_prepare_extracted_statement
  export _root_.duckdb.functions.duckdb_prepared_arrow_schema
  export _root_.duckdb.functions.duckdb_prepared_statement_column_count
  export _root_.duckdb.functions.duckdb_prepared_statement_column_logical_type
  export _root_.duckdb.functions.duckdb_prepared_statement_column_name
  export _root_.duckdb.functions.duckdb_prepared_statement_column_type
  export _root_.duckdb.functions.duckdb_prepared_statement_type
  export _root_.duckdb.functions.duckdb_profiling_info_get_child
  export _root_.duckdb.functions.duckdb_profiling_info_get_child_count
  export _root_.duckdb.functions.duckdb_profiling_info_get_metrics
  export _root_.duckdb.functions.duckdb_profiling_info_get_value
  export _root_.duckdb.functions.duckdb_query
  export _root_.duckdb.functions.duckdb_query_arrow
  export _root_.duckdb.functions.duckdb_query_arrow_array
  export _root_.duckdb.functions.duckdb_query_arrow_error
  export _root_.duckdb.functions.duckdb_query_arrow_schema
  export _root_.duckdb.functions.duckdb_register_aggregate_function
  export _root_.duckdb.functions.duckdb_register_aggregate_function_set
  export _root_.duckdb.functions.duckdb_register_cast_function
  export _root_.duckdb.functions.duckdb_register_logical_type
  export _root_.duckdb.functions.duckdb_register_scalar_function
  export _root_.duckdb.functions.duckdb_register_scalar_function_set
  export _root_.duckdb.functions.duckdb_register_table_function
  export _root_.duckdb.functions.duckdb_replacement_scan_add_parameter
  export _root_.duckdb.functions.duckdb_replacement_scan_set_error
  export _root_.duckdb.functions.duckdb_replacement_scan_set_function_name
  export _root_.duckdb.functions.duckdb_result_error
  export _root_.duckdb.functions.duckdb_result_error_type
  export _root_.duckdb.functions.duckdb_result_get_arrow_options
  export _root_.duckdb.functions.duckdb_row_count
  export _root_.duckdb.functions.duckdb_rows_changed
  export _root_.duckdb.functions.duckdb_scalar_function_add_parameter
  export _root_.duckdb.functions.duckdb_scalar_function_bind_get_argument
  export _root_.duckdb.functions.duckdb_scalar_function_bind_get_argument_count
  export _root_.duckdb.functions.duckdb_scalar_function_bind_get_extra_info
  export _root_.duckdb.functions.duckdb_scalar_function_bind_set_error
  export _root_.duckdb.functions.duckdb_scalar_function_get_bind_data
  export _root_.duckdb.functions.duckdb_scalar_function_get_client_context
  export _root_.duckdb.functions.duckdb_scalar_function_get_extra_info
  export _root_.duckdb.functions.duckdb_scalar_function_set_bind
  export _root_.duckdb.functions.duckdb_scalar_function_set_bind_data
  export _root_.duckdb.functions.duckdb_scalar_function_set_bind_data_copy
  export _root_.duckdb.functions.duckdb_scalar_function_set_error
  export _root_.duckdb.functions.duckdb_scalar_function_set_extra_info
  export _root_.duckdb.functions.duckdb_scalar_function_set_function
  export _root_.duckdb.functions.duckdb_scalar_function_set_name
  export _root_.duckdb.functions.duckdb_scalar_function_set_return_type
  export _root_.duckdb.functions.duckdb_scalar_function_set_special_handling
  export _root_.duckdb.functions.duckdb_scalar_function_set_varargs
  export _root_.duckdb.functions.duckdb_scalar_function_set_volatile
  export _root_.duckdb.functions.duckdb_schema_from_arrow
  export _root_.duckdb.functions.duckdb_selection_vector_get_data_ptr
  export _root_.duckdb.functions.duckdb_set_config
  export _root_.duckdb.functions.duckdb_slice_vector
  export _root_.duckdb.functions.duckdb_string_t_data
  export _root_.duckdb.functions.duckdb_struct_type_child_count
  export _root_.duckdb.functions.duckdb_struct_type_child_name
  export _root_.duckdb.functions.duckdb_struct_type_child_type
  export _root_.duckdb.functions.duckdb_struct_vector_get_child
  export _root_.duckdb.functions.duckdb_table_description_create
  export _root_.duckdb.functions.duckdb_table_description_create_ext
  export _root_.duckdb.functions.duckdb_table_description_destroy
  export _root_.duckdb.functions.duckdb_table_description_error
  export _root_.duckdb.functions.duckdb_table_description_get_column_name
  export _root_.duckdb.functions.duckdb_table_function_add_named_parameter
  export _root_.duckdb.functions.duckdb_table_function_add_parameter
  export _root_.duckdb.functions.duckdb_table_function_get_client_context
  export _root_.duckdb.functions.duckdb_table_function_set_bind
  export _root_.duckdb.functions.duckdb_table_function_set_extra_info
  export _root_.duckdb.functions.duckdb_table_function_set_function
  export _root_.duckdb.functions.duckdb_table_function_set_init
  export _root_.duckdb.functions.duckdb_table_function_set_local_init
  export _root_.duckdb.functions.duckdb_table_function_set_name
  export _root_.duckdb.functions.duckdb_table_function_supports_projection_pushdown
  export _root_.duckdb.functions.duckdb_task_state_is_finished
  export _root_.duckdb.functions.duckdb_to_arrow_schema
  export _root_.duckdb.functions.duckdb_union_type_member_count
  export _root_.duckdb.functions.duckdb_union_type_member_name
  export _root_.duckdb.functions.duckdb_union_type_member_type
  export _root_.duckdb.functions.duckdb_validity_row_is_valid
  export _root_.duckdb.functions.duckdb_validity_set_row_invalid
  export _root_.duckdb.functions.duckdb_validity_set_row_valid
  export _root_.duckdb.functions.duckdb_validity_set_row_validity
  export _root_.duckdb.functions.duckdb_value_boolean
  export _root_.duckdb.functions.duckdb_value_double
  export _root_.duckdb.functions.duckdb_value_float
  export _root_.duckdb.functions.duckdb_value_int16
  export _root_.duckdb.functions.duckdb_value_int32
  export _root_.duckdb.functions.duckdb_value_int64
  export _root_.duckdb.functions.duckdb_value_int8
  export _root_.duckdb.functions.duckdb_value_is_null
  export _root_.duckdb.functions.duckdb_value_to_string
  export _root_.duckdb.functions.duckdb_value_uint16
  export _root_.duckdb.functions.duckdb_value_uint32
  export _root_.duckdb.functions.duckdb_value_uint64
  export _root_.duckdb.functions.duckdb_value_uint8
  export _root_.duckdb.functions.duckdb_value_varchar
  export _root_.duckdb.functions.duckdb_value_varchar_internal
  export _root_.duckdb.functions.duckdb_vector_assign_string_element
  export _root_.duckdb.functions.duckdb_vector_assign_string_element_len
  export _root_.duckdb.functions.duckdb_vector_copy_sel
  export _root_.duckdb.functions.duckdb_vector_ensure_validity_writable
  export _root_.duckdb.functions.duckdb_vector_get_column_type
  export _root_.duckdb.functions.duckdb_vector_get_data
  export _root_.duckdb.functions.duckdb_vector_get_validity
  export _root_.duckdb.functions.duckdb_vector_reference_value
  export _root_.duckdb.functions.duckdb_vector_reference_vector
  export _root_.duckdb.functions.duckdb_vector_size
  export _root_.duckdb.functions.duckdb_append_date
  export _root_.duckdb.functions.duckdb_append_hugeint
  export _root_.duckdb.functions.duckdb_append_interval
  export _root_.duckdb.functions.duckdb_append_time
  export _root_.duckdb.functions.duckdb_append_timestamp
  export _root_.duckdb.functions.duckdb_append_uhugeint
  export _root_.duckdb.functions.duckdb_bind_date
  export _root_.duckdb.functions.duckdb_bind_decimal
  export _root_.duckdb.functions.duckdb_bind_hugeint
  export _root_.duckdb.functions.duckdb_bind_interval
  export _root_.duckdb.functions.duckdb_bind_time
  export _root_.duckdb.functions.duckdb_bind_timestamp
  export _root_.duckdb.functions.duckdb_bind_timestamp_tz
  export _root_.duckdb.functions.duckdb_bind_uhugeint
  export _root_.duckdb.functions.duckdb_create_bignum
  export _root_.duckdb.functions.duckdb_create_bit
  export _root_.duckdb.functions.duckdb_create_date
  export _root_.duckdb.functions.duckdb_create_decimal
  export _root_.duckdb.functions.duckdb_create_hugeint
  export _root_.duckdb.functions.duckdb_create_interval
  export _root_.duckdb.functions.duckdb_create_time
  export _root_.duckdb.functions.duckdb_create_time_ns
  export _root_.duckdb.functions.duckdb_create_time_tz
  export _root_.duckdb.functions.duckdb_create_time_tz_value
  export _root_.duckdb.functions.duckdb_create_timestamp
  export _root_.duckdb.functions.duckdb_create_timestamp_ms
  export _root_.duckdb.functions.duckdb_create_timestamp_ns
  export _root_.duckdb.functions.duckdb_create_timestamp_s
  export _root_.duckdb.functions.duckdb_create_timestamp_tz
  export _root_.duckdb.functions.duckdb_create_uhugeint
  export _root_.duckdb.functions.duckdb_create_uuid
  export _root_.duckdb.functions.duckdb_decimal_to_double
  export _root_.duckdb.functions.duckdb_double_to_decimal
  export _root_.duckdb.functions.duckdb_double_to_hugeint
  export _root_.duckdb.functions.duckdb_double_to_uhugeint
  export _root_.duckdb.functions.duckdb_fetch_chunk
  export _root_.duckdb.functions.duckdb_from_date
  export _root_.duckdb.functions.duckdb_from_time
  export _root_.duckdb.functions.duckdb_from_time_tz
  export _root_.duckdb.functions.duckdb_from_timestamp
  export _root_.duckdb.functions.duckdb_get_bignum
  export _root_.duckdb.functions.duckdb_get_bit
  export _root_.duckdb.functions.duckdb_get_blob
  export _root_.duckdb.functions.duckdb_get_date
  export _root_.duckdb.functions.duckdb_get_decimal
  export _root_.duckdb.functions.duckdb_get_hugeint
  export _root_.duckdb.functions.duckdb_get_interval
  export _root_.duckdb.functions.duckdb_get_time
  export _root_.duckdb.functions.duckdb_get_time_ns
  export _root_.duckdb.functions.duckdb_get_time_tz
  export _root_.duckdb.functions.duckdb_get_timestamp
  export _root_.duckdb.functions.duckdb_get_timestamp_ms
  export _root_.duckdb.functions.duckdb_get_timestamp_ns
  export _root_.duckdb.functions.duckdb_get_timestamp_s
  export _root_.duckdb.functions.duckdb_get_timestamp_tz
  export _root_.duckdb.functions.duckdb_get_uhugeint
  export _root_.duckdb.functions.duckdb_get_uuid
  export _root_.duckdb.functions.duckdb_hugeint_to_double
  export _root_.duckdb.functions.duckdb_is_finite_date
  export _root_.duckdb.functions.duckdb_is_finite_timestamp
  export _root_.duckdb.functions.duckdb_is_finite_timestamp_ms
  export _root_.duckdb.functions.duckdb_is_finite_timestamp_ns
  export _root_.duckdb.functions.duckdb_is_finite_timestamp_s
  export _root_.duckdb.functions.duckdb_query_progress
  export _root_.duckdb.functions.duckdb_result_arrow_array
  export _root_.duckdb.functions.duckdb_result_chunk_count
  export _root_.duckdb.functions.duckdb_result_get_chunk
  export _root_.duckdb.functions.duckdb_result_is_streaming
  export _root_.duckdb.functions.duckdb_result_return_type
  export _root_.duckdb.functions.duckdb_result_statement_type
  export _root_.duckdb.functions.duckdb_stream_fetch_chunk
  export _root_.duckdb.functions.duckdb_string_is_inlined
  export _root_.duckdb.functions.duckdb_string_t_length
  export _root_.duckdb.functions.duckdb_to_date
  export _root_.duckdb.functions.duckdb_to_time
  export _root_.duckdb.functions.duckdb_to_timestamp
  export _root_.duckdb.functions.duckdb_uhugeint_to_double
  export _root_.duckdb.functions.duckdb_value_blob
  export _root_.duckdb.functions.duckdb_value_date
  export _root_.duckdb.functions.duckdb_value_decimal
  export _root_.duckdb.functions.duckdb_value_hugeint
  export _root_.duckdb.functions.duckdb_value_interval
  export _root_.duckdb.functions.duckdb_value_string
  export _root_.duckdb.functions.duckdb_value_string_internal
  export _root_.duckdb.functions.duckdb_value_time
  export _root_.duckdb.functions.duckdb_value_timestamp
  export _root_.duckdb.functions.duckdb_value_uhugeint