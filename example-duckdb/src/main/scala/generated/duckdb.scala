package duckdb

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[duckdb] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def int: CInt = eq.apply(t).toInt
      inline def uint: CUnsignedInt = eq.apply(t)
      inline def value: CUnsignedInt = eq.apply(t)

object enumerations:
  import predef.*

  /** */
  opaque type DUCKDB_TYPE = CUnsignedInt
  object DUCKDB_TYPE extends CEnumU[DUCKDB_TYPE]:
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
    val DUCKDB_TYPE_UUID = define(27)
    val DUCKDB_TYPE_JSON = define(28)
    inline def getName(inline value: DUCKDB_TYPE): Option[String] =
      inline value match
        case DUCKDB_TYPE_INVALID      => Some("DUCKDB_TYPE_INVALID")
        case DUCKDB_TYPE_BOOLEAN      => Some("DUCKDB_TYPE_BOOLEAN")
        case DUCKDB_TYPE_TINYINT      => Some("DUCKDB_TYPE_TINYINT")
        case DUCKDB_TYPE_SMALLINT     => Some("DUCKDB_TYPE_SMALLINT")
        case DUCKDB_TYPE_INTEGER      => Some("DUCKDB_TYPE_INTEGER")
        case DUCKDB_TYPE_BIGINT       => Some("DUCKDB_TYPE_BIGINT")
        case DUCKDB_TYPE_UTINYINT     => Some("DUCKDB_TYPE_UTINYINT")
        case DUCKDB_TYPE_USMALLINT    => Some("DUCKDB_TYPE_USMALLINT")
        case DUCKDB_TYPE_UINTEGER     => Some("DUCKDB_TYPE_UINTEGER")
        case DUCKDB_TYPE_UBIGINT      => Some("DUCKDB_TYPE_UBIGINT")
        case DUCKDB_TYPE_FLOAT        => Some("DUCKDB_TYPE_FLOAT")
        case DUCKDB_TYPE_DOUBLE       => Some("DUCKDB_TYPE_DOUBLE")
        case DUCKDB_TYPE_TIMESTAMP    => Some("DUCKDB_TYPE_TIMESTAMP")
        case DUCKDB_TYPE_DATE         => Some("DUCKDB_TYPE_DATE")
        case DUCKDB_TYPE_TIME         => Some("DUCKDB_TYPE_TIME")
        case DUCKDB_TYPE_INTERVAL     => Some("DUCKDB_TYPE_INTERVAL")
        case DUCKDB_TYPE_HUGEINT      => Some("DUCKDB_TYPE_HUGEINT")
        case DUCKDB_TYPE_VARCHAR      => Some("DUCKDB_TYPE_VARCHAR")
        case DUCKDB_TYPE_BLOB         => Some("DUCKDB_TYPE_BLOB")
        case DUCKDB_TYPE_DECIMAL      => Some("DUCKDB_TYPE_DECIMAL")
        case DUCKDB_TYPE_TIMESTAMP_S  => Some("DUCKDB_TYPE_TIMESTAMP_S")
        case DUCKDB_TYPE_TIMESTAMP_MS => Some("DUCKDB_TYPE_TIMESTAMP_MS")
        case DUCKDB_TYPE_TIMESTAMP_NS => Some("DUCKDB_TYPE_TIMESTAMP_NS")
        case DUCKDB_TYPE_ENUM         => Some("DUCKDB_TYPE_ENUM")
        case DUCKDB_TYPE_LIST         => Some("DUCKDB_TYPE_LIST")
        case DUCKDB_TYPE_STRUCT       => Some("DUCKDB_TYPE_STRUCT")
        case DUCKDB_TYPE_MAP          => Some("DUCKDB_TYPE_MAP")
        case DUCKDB_TYPE_UUID         => Some("DUCKDB_TYPE_UUID")
        case DUCKDB_TYPE_JSON         => Some("DUCKDB_TYPE_JSON")
        case _                        => None
    extension (a: DUCKDB_TYPE)
      inline def &(b: DUCKDB_TYPE): DUCKDB_TYPE = a & b
      inline def |(b: DUCKDB_TYPE): DUCKDB_TYPE = a | b
      inline def is(b: DUCKDB_TYPE): Boolean = (a & b) == b
  end DUCKDB_TYPE

  /** */
  opaque type duckdb_state = CUnsignedInt
  object duckdb_state extends CEnumU[duckdb_state]:
    given _tag: Tag[duckdb_state] = Tag.UInt
    inline def define(inline a: Long): duckdb_state = a.toUInt
    val DuckDBSuccess = define(0)
    val DuckDBError = define(1)
    inline def getName(inline value: duckdb_state): Option[String] =
      inline value match
        case DuckDBSuccess => Some("DuckDBSuccess")
        case DuckDBError   => Some("DuckDBError")
        case _             => None
    extension (a: duckdb_state)
      inline def &(b: duckdb_state): duckdb_state = a & b
      inline def |(b: duckdb_state): duckdb_state = a | b
      inline def is(b: duckdb_state): Boolean = (a & b) == b
  end duckdb_state
end enumerations

object aliases:
  import _root_.duckdb.enumerations.*
  import _root_.duckdb.predef.*
  import _root_.duckdb.aliases.*
  import _root_.duckdb.structs.*

  /** */
  opaque type duckdb_appender = Ptr[Byte]
  object duckdb_appender:
    given _tag: Tag[duckdb_appender] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_appender = o
    extension (v: duckdb_appender) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_arrow = Ptr[Byte]
  object duckdb_arrow:
    given _tag: Tag[duckdb_arrow] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_arrow = o
    extension (v: duckdb_arrow) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_arrow_array = Ptr[Byte]
  object duckdb_arrow_array:
    given _tag: Tag[duckdb_arrow_array] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_arrow_array = o
    extension (v: duckdb_arrow_array) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_arrow_schema = Ptr[Byte]
  object duckdb_arrow_schema:
    given _tag: Tag[duckdb_arrow_schema] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_arrow_schema = o
    extension (v: duckdb_arrow_schema) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_bind_info = Ptr[Byte]
  object duckdb_bind_info:
    given _tag: Tag[duckdb_bind_info] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_bind_info = o
    extension (v: duckdb_bind_info) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_config = Ptr[Byte]
  object duckdb_config:
    given _tag: Tag[duckdb_config] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_config = o
    extension (v: duckdb_config) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_connection = Ptr[Byte]
  object duckdb_connection:
    given _tag: Tag[duckdb_connection] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_connection = o
    extension (v: duckdb_connection) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_data_chunk = Ptr[Byte]
  object duckdb_data_chunk:
    given _tag: Tag[duckdb_data_chunk] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_data_chunk = o
    extension (v: duckdb_data_chunk) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_database = Ptr[Byte]
  object duckdb_database:
    given _tag: Tag[duckdb_database] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_database = o
    extension (v: duckdb_database) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_delete_callback_t = CFuncPtr1[Ptr[Byte], Unit]
  object duckdb_delete_callback_t:
    given _tag: Tag[duckdb_delete_callback_t] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): duckdb_delete_callback_t =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): duckdb_delete_callback_t = o
    extension (v: duckdb_delete_callback_t)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end duckdb_delete_callback_t

  /** */
  opaque type duckdb_function_info = Ptr[Byte]
  object duckdb_function_info:
    given _tag: Tag[duckdb_function_info] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_function_info = o
    extension (v: duckdb_function_info) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_init_info = Ptr[Byte]
  object duckdb_init_info:
    given _tag: Tag[duckdb_init_info] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_init_info = o
    extension (v: duckdb_init_info) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_logical_type = Ptr[Byte]
  object duckdb_logical_type:
    given _tag: Tag[duckdb_logical_type] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_logical_type = o
    extension (v: duckdb_logical_type) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_prepared_statement = Ptr[Byte]
  object duckdb_prepared_statement:
    given _tag: Tag[duckdb_prepared_statement] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_prepared_statement = o
    extension (v: duckdb_prepared_statement) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_replacement_callback_t =
    CFuncPtr3[duckdb_replacement_scan_info, CString, Ptr[Byte], Unit]
  object duckdb_replacement_callback_t:
    given _tag: Tag[duckdb_replacement_callback_t] =
      Tag.materializeCFuncPtr3[duckdb_replacement_scan_info, CString, Ptr[
        Byte
      ], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): duckdb_replacement_callback_t =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[duckdb_replacement_scan_info, CString, Ptr[
          Byte
        ], Unit]
    ): duckdb_replacement_callback_t = o
    extension (v: duckdb_replacement_callback_t)
      inline def value
          : CFuncPtr3[duckdb_replacement_scan_info, CString, Ptr[Byte], Unit] =
        v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end duckdb_replacement_callback_t

  /** */
  opaque type duckdb_replacement_scan_info = Ptr[Byte]
  object duckdb_replacement_scan_info:
    given _tag: Tag[duckdb_replacement_scan_info] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_replacement_scan_info = o
    extension (v: duckdb_replacement_scan_info) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_table_function = Ptr[Byte]
  object duckdb_table_function:
    given _tag: Tag[duckdb_table_function] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_table_function = o
    extension (v: duckdb_table_function) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_table_function_bind_t = CFuncPtr1[duckdb_bind_info, Unit]
  object duckdb_table_function_bind_t:
    given _tag: Tag[duckdb_table_function_bind_t] =
      Tag.materializeCFuncPtr1[duckdb_bind_info, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): duckdb_table_function_bind_t =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[duckdb_bind_info, Unit]
    ): duckdb_table_function_bind_t = o
    extension (v: duckdb_table_function_bind_t)
      inline def value: CFuncPtr1[duckdb_bind_info, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end duckdb_table_function_bind_t

  /** */
  opaque type duckdb_table_function_init_t = CFuncPtr1[duckdb_init_info, Unit]
  object duckdb_table_function_init_t:
    given _tag: Tag[duckdb_table_function_init_t] =
      Tag.materializeCFuncPtr1[duckdb_init_info, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): duckdb_table_function_init_t =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[duckdb_init_info, Unit]
    ): duckdb_table_function_init_t = o
    extension (v: duckdb_table_function_init_t)
      inline def value: CFuncPtr1[duckdb_init_info, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end duckdb_table_function_init_t

  /** */
  opaque type duckdb_table_function_t =
    CFuncPtr2[duckdb_function_info, duckdb_data_chunk, Unit]
  object duckdb_table_function_t:
    given _tag: Tag[duckdb_table_function_t] =
      Tag.materializeCFuncPtr2[duckdb_function_info, duckdb_data_chunk, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): duckdb_table_function_t =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[duckdb_function_info, duckdb_data_chunk, Unit]
    ): duckdb_table_function_t = o
    extension (v: duckdb_table_function_t)
      inline def value
          : CFuncPtr2[duckdb_function_info, duckdb_data_chunk, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end duckdb_table_function_t

  /** */
  type duckdb_type = DUCKDB_TYPE
  object duckdb_type:
    given _tag: Tag[duckdb_type] = DUCKDB_TYPE._tag
    inline def apply(inline o: DUCKDB_TYPE): duckdb_type = o
    extension (v: duckdb_type) inline def value: DUCKDB_TYPE = v

  /** */
  opaque type duckdb_value = Ptr[Byte]
  object duckdb_value:
    given _tag: Tag[duckdb_value] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_value = o
    extension (v: duckdb_value) inline def value: Ptr[Byte] = v

  /** */
  opaque type duckdb_vector = Ptr[Byte]
  object duckdb_vector:
    given _tag: Tag[duckdb_vector] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): duckdb_vector = o
    extension (v: duckdb_vector) inline def value: Ptr[Byte] = v

  /** */
  type idx_t = uint64_t
  object idx_t:
    given _tag: Tag[idx_t] = uint64_t._tag
    inline def apply(inline o: uint64_t): idx_t = o
    extension (v: idx_t) inline def value: uint64_t = v

  type int16_t = scala.Short
  object int16_t:
    val _tag: Tag[int16_t] = summon[Tag[scala.Short]]
    inline def apply(inline o: scala.Short): int16_t = o
    extension (v: int16_t) inline def value: scala.Short = v

  type int32_t = scala.scalanative.unsafe.CInt
  object int32_t:
    val _tag: Tag[int32_t] = summon[Tag[scala.scalanative.unsafe.CInt]]
    inline def apply(inline o: scala.scalanative.unsafe.CInt): int32_t = o
    extension (v: int32_t) inline def value: scala.scalanative.unsafe.CInt = v

  type int64_t = scala.Long
  object int64_t:
    val _tag: Tag[int64_t] = summon[Tag[scala.Long]]
    inline def apply(inline o: scala.Long): int64_t = o
    extension (v: int64_t) inline def value: scala.Long = v

  type int8_t = scala.scalanative.unsafe.CChar
  object int8_t:
    val _tag: Tag[int8_t] = summon[Tag[scala.scalanative.unsafe.CChar]]
    inline def apply(inline o: scala.scalanative.unsafe.CChar): int8_t = o
    extension (v: int8_t) inline def value: scala.scalanative.unsafe.CChar = v

  type size_t = libc.stddef.size_t
  object size_t:
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t) inline def value: libc.stddef.size_t = v

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
end aliases

object structs:
  import _root_.duckdb.enumerations.*
  import _root_.duckdb.predef.*
  import _root_.duckdb.aliases.*
  import _root_.duckdb.structs.*

  /** */
  opaque type duckdb_blob = CStruct2[Ptr[Byte], idx_t]
  object duckdb_blob:
    given _tag: Tag[duckdb_blob] = Tag.materializeCStruct2Tag[Ptr[Byte], idx_t]
    def apply()(using Zone): Ptr[duckdb_blob] =
      scala.scalanative.unsafe.alloc[duckdb_blob](1)
    def apply(data: Ptr[Byte], size: idx_t)(using Zone): Ptr[duckdb_blob] =
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).size = size
      ____ptr
    extension (struct: duckdb_blob)
      def data: Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def size: idx_t = struct._2
      def size_=(value: idx_t): Unit = !struct.at2 = value
  end duckdb_blob

  /** */
  opaque type duckdb_column =
    CStruct5[Ptr[Byte], Ptr[Boolean], duckdb_type, CString, Ptr[Byte]]
  object duckdb_column:
    given _tag: Tag[duckdb_column] = Tag.materializeCStruct5Tag[Ptr[Byte], Ptr[
      Boolean
    ], duckdb_type, CString, Ptr[Byte]]
    def apply()(using Zone): Ptr[duckdb_column] =
      scala.scalanative.unsafe.alloc[duckdb_column](1)
    def apply(
        __deprecated_data: Ptr[Byte],
        __deprecated_nullmask: Ptr[Boolean],
        __deprecated_type: duckdb_type,
        __deprecated_name: CString,
        internal_data: Ptr[Byte]
    )(using Zone): Ptr[duckdb_column] =
      val ____ptr = apply()
      (!____ptr).__deprecated_data = __deprecated_data
      (!____ptr).__deprecated_nullmask = __deprecated_nullmask
      (!____ptr).__deprecated_type = __deprecated_type
      (!____ptr).__deprecated_name = __deprecated_name
      (!____ptr).internal_data = internal_data
      ____ptr
    end apply
    extension (struct: duckdb_column)
      def __deprecated_data: Ptr[Byte] = struct._1
      def __deprecated_data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def __deprecated_nullmask: Ptr[Boolean] = struct._2
      def __deprecated_nullmask_=(value: Ptr[Boolean]): Unit = !struct.at2 =
        value
      def __deprecated_type: duckdb_type = struct._3
      def __deprecated_type_=(value: duckdb_type): Unit = !struct.at3 = value
      def __deprecated_name: CString = struct._4
      def __deprecated_name_=(value: CString): Unit = !struct.at4 = value
      def internal_data: Ptr[Byte] = struct._5
      def internal_data_=(value: Ptr[Byte]): Unit = !struct.at5 = value
    end extension
  end duckdb_column

  /** Days are stored as days since 1970-01-01 Use the
    * duckdb_from_date/duckdb_to_date function to extract individual information
    */
  opaque type duckdb_date = CStruct1[int32_t]
  object duckdb_date:
    given _tag: Tag[duckdb_date] = Tag.materializeCStruct1Tag[int32_t]
    def apply()(using Zone): Ptr[duckdb_date] =
      scala.scalanative.unsafe.alloc[duckdb_date](1)
    def apply(days: int32_t)(using Zone): Ptr[duckdb_date] =
      val ____ptr = apply()
      (!____ptr).days = days
      ____ptr
    extension (struct: duckdb_date)
      def days: int32_t = struct._1
      def days_=(value: int32_t): Unit = !struct.at1 = value
  end duckdb_date

  /** */
  opaque type duckdb_date_struct = CStruct3[int32_t, int8_t, int8_t]
  object duckdb_date_struct:
    given _tag: Tag[duckdb_date_struct] =
      Tag.materializeCStruct3Tag[int32_t, int8_t, int8_t]
    def apply()(using Zone): Ptr[duckdb_date_struct] =
      scala.scalanative.unsafe.alloc[duckdb_date_struct](1)
    def apply(year: int32_t, month: int8_t, day: int8_t)(using
        Zone
    ): Ptr[duckdb_date_struct] =
      val ____ptr = apply()
      (!____ptr).year = year
      (!____ptr).month = month
      (!____ptr).day = day
      ____ptr
    extension (struct: duckdb_date_struct)
      def year: int32_t = struct._1
      def year_=(value: int32_t): Unit = !struct.at1 = value
      def month: int8_t = struct._2
      def month_=(value: int8_t): Unit = !struct.at2 = value
      def day: int8_t = struct._3
      def day_=(value: int8_t): Unit = !struct.at3 = value
  end duckdb_date_struct

  /** */
  opaque type duckdb_decimal = CStruct3[uint8_t, uint8_t, duckdb_hugeint]
  object duckdb_decimal:
    given _tag: Tag[duckdb_decimal] =
      Tag.materializeCStruct3Tag[uint8_t, uint8_t, duckdb_hugeint]
    def apply()(using Zone): Ptr[duckdb_decimal] =
      scala.scalanative.unsafe.alloc[duckdb_decimal](1)
    def apply(width: uint8_t, scale: uint8_t, value: duckdb_hugeint)(using
        Zone
    ): Ptr[duckdb_decimal] =
      val ____ptr = apply()
      (!____ptr).width = width
      (!____ptr).scale = scale
      (!____ptr).value = value
      ____ptr
    extension (struct: duckdb_decimal)
      def width: uint8_t = struct._1
      def width_=(value: uint8_t): Unit = !struct.at1 = value
      def scale: uint8_t = struct._2
      def scale_=(value: uint8_t): Unit = !struct.at2 = value
      def value: duckdb_hugeint = struct._3
      def value_=(value: duckdb_hugeint): Unit = !struct.at3 = value
  end duckdb_decimal

  /** Hugeints are composed in a (lower, upper) component The value of the
    * hugeint is upper * 2^64 + lower For easy usage, the functions
    * duckdb_hugeint_to_double/duckdb_double_to_hugeint are recommended
    */
  opaque type duckdb_hugeint = CStruct2[uint64_t, int64_t]
  object duckdb_hugeint:
    given _tag: Tag[duckdb_hugeint] =
      Tag.materializeCStruct2Tag[uint64_t, int64_t]
    def apply()(using Zone): Ptr[duckdb_hugeint] =
      scala.scalanative.unsafe.alloc[duckdb_hugeint](1)
    def apply(lower: uint64_t, upper: int64_t)(using
        Zone
    ): Ptr[duckdb_hugeint] =
      val ____ptr = apply()
      (!____ptr).lower = lower
      (!____ptr).upper = upper
      ____ptr
    extension (struct: duckdb_hugeint)
      def lower: uint64_t = struct._1
      def lower_=(value: uint64_t): Unit = !struct.at1 = value
      def upper: int64_t = struct._2
      def upper_=(value: int64_t): Unit = !struct.at2 = value
  end duckdb_hugeint

  /** */
  opaque type duckdb_interval = CStruct3[int32_t, int32_t, int64_t]
  object duckdb_interval:
    given _tag: Tag[duckdb_interval] =
      Tag.materializeCStruct3Tag[int32_t, int32_t, int64_t]
    def apply()(using Zone): Ptr[duckdb_interval] =
      scala.scalanative.unsafe.alloc[duckdb_interval](1)
    def apply(months: int32_t, days: int32_t, micros: int64_t)(using
        Zone
    ): Ptr[duckdb_interval] =
      val ____ptr = apply()
      (!____ptr).months = months
      (!____ptr).days = days
      (!____ptr).micros = micros
      ____ptr
    extension (struct: duckdb_interval)
      def months: int32_t = struct._1
      def months_=(value: int32_t): Unit = !struct.at1 = value
      def days: int32_t = struct._2
      def days_=(value: int32_t): Unit = !struct.at2 = value
      def micros: int64_t = struct._3
      def micros_=(value: int64_t): Unit = !struct.at3 = value
  end duckdb_interval

  /** */
  opaque type duckdb_result =
    CStruct6[idx_t, idx_t, idx_t, Ptr[duckdb_column], CString, Ptr[Byte]]
  object duckdb_result:
    given _tag: Tag[duckdb_result] =
      Tag.materializeCStruct6Tag[idx_t, idx_t, idx_t, Ptr[
        duckdb_column
      ], CString, Ptr[Byte]]
    def apply()(using Zone): Ptr[duckdb_result] =
      scala.scalanative.unsafe.alloc[duckdb_result](1)
    def apply(
        __deprecated_column_count: idx_t,
        __deprecated_row_count: idx_t,
        __deprecated_rows_changed: idx_t,
        __deprecated_columns: Ptr[duckdb_column],
        __deprecated_error_message: CString,
        internal_data: Ptr[Byte]
    )(using Zone): Ptr[duckdb_result] =
      val ____ptr = apply()
      (!____ptr).__deprecated_column_count = __deprecated_column_count
      (!____ptr).__deprecated_row_count = __deprecated_row_count
      (!____ptr).__deprecated_rows_changed = __deprecated_rows_changed
      (!____ptr).__deprecated_columns = __deprecated_columns
      (!____ptr).__deprecated_error_message = __deprecated_error_message
      (!____ptr).internal_data = internal_data
      ____ptr
    end apply
    extension (struct: duckdb_result)
      def __deprecated_column_count: idx_t = struct._1
      def __deprecated_column_count_=(value: idx_t): Unit = !struct.at1 = value
      def __deprecated_row_count: idx_t = struct._2
      def __deprecated_row_count_=(value: idx_t): Unit = !struct.at2 = value
      def __deprecated_rows_changed: idx_t = struct._3
      def __deprecated_rows_changed_=(value: idx_t): Unit = !struct.at3 = value
      def __deprecated_columns: Ptr[duckdb_column] = struct._4
      def __deprecated_columns_=(value: Ptr[duckdb_column]): Unit =
        !struct.at4 = value
      def __deprecated_error_message: CString = struct._5
      def __deprecated_error_message_=(value: CString): Unit = !struct.at5 =
        value
      def internal_data: Ptr[Byte] = struct._6
      def internal_data_=(value: Ptr[Byte]): Unit = !struct.at6 = value
    end extension
  end duckdb_result

  /** Time is stored as microseconds since 00:00:00 Use the
    * duckdb_from_time/duckdb_to_time function to extract individual information
    */
  opaque type duckdb_time = CStruct1[int64_t]
  object duckdb_time:
    given _tag: Tag[duckdb_time] = Tag.materializeCStruct1Tag[int64_t]
    def apply()(using Zone): Ptr[duckdb_time] =
      scala.scalanative.unsafe.alloc[duckdb_time](1)
    def apply(micros: int64_t)(using Zone): Ptr[duckdb_time] =
      val ____ptr = apply()
      (!____ptr).micros = micros
      ____ptr
    extension (struct: duckdb_time)
      def micros: int64_t = struct._1
      def micros_=(value: int64_t): Unit = !struct.at1 = value
  end duckdb_time

  /** */
  opaque type duckdb_time_struct = CStruct4[int8_t, int8_t, int8_t, int32_t]
  object duckdb_time_struct:
    given _tag: Tag[duckdb_time_struct] =
      Tag.materializeCStruct4Tag[int8_t, int8_t, int8_t, int32_t]
    def apply()(using Zone): Ptr[duckdb_time_struct] =
      scala.scalanative.unsafe.alloc[duckdb_time_struct](1)
    def apply(hour: int8_t, min: int8_t, sec: int8_t, micros: int32_t)(using
        Zone
    ): Ptr[duckdb_time_struct] =
      val ____ptr = apply()
      (!____ptr).hour = hour
      (!____ptr).min = min
      (!____ptr).sec = sec
      (!____ptr).micros = micros
      ____ptr
    extension (struct: duckdb_time_struct)
      def hour: int8_t = struct._1
      def hour_=(value: int8_t): Unit = !struct.at1 = value
      def min: int8_t = struct._2
      def min_=(value: int8_t): Unit = !struct.at2 = value
      def sec: int8_t = struct._3
      def sec_=(value: int8_t): Unit = !struct.at3 = value
      def micros: int32_t = struct._4
      def micros_=(value: int32_t): Unit = !struct.at4 = value
  end duckdb_time_struct

  /** Timestamps are stored as microseconds since 1970-01-01 Use the
    * duckdb_from_timestamp/duckdb_to_timestamp function to extract individual
    * information
    */
  opaque type duckdb_timestamp = CStruct1[int64_t]
  object duckdb_timestamp:
    given _tag: Tag[duckdb_timestamp] = Tag.materializeCStruct1Tag[int64_t]
    def apply()(using Zone): Ptr[duckdb_timestamp] =
      scala.scalanative.unsafe.alloc[duckdb_timestamp](1)
    def apply(micros: int64_t)(using Zone): Ptr[duckdb_timestamp] =
      val ____ptr = apply()
      (!____ptr).micros = micros
      ____ptr
    extension (struct: duckdb_timestamp)
      def micros: int64_t = struct._1
      def micros_=(value: int64_t): Unit = !struct.at1 = value
  end duckdb_timestamp

  /** */
  opaque type duckdb_timestamp_struct =
    CStruct2[duckdb_date_struct, duckdb_time_struct]
  object duckdb_timestamp_struct:
    given _tag: Tag[duckdb_timestamp_struct] =
      Tag.materializeCStruct2Tag[duckdb_date_struct, duckdb_time_struct]
    def apply()(using Zone): Ptr[duckdb_timestamp_struct] =
      scala.scalanative.unsafe.alloc[duckdb_timestamp_struct](1)
    def apply(date: duckdb_date_struct, time: duckdb_time_struct)(using
        Zone
    ): Ptr[duckdb_timestamp_struct] =
      val ____ptr = apply()
      (!____ptr).date = date
      (!____ptr).time = time
      ____ptr
    extension (struct: duckdb_timestamp_struct)
      def date: duckdb_date_struct = struct._1
      def date_=(value: duckdb_date_struct): Unit = !struct.at1 = value
      def time: duckdb_time_struct = struct._2
      def time_=(value: duckdb_time_struct): Unit = !struct.at2 = value
  end duckdb_timestamp_struct
end structs

@link("duckdb")
@extern
private[duckdb] object extern_functions:
  import _root_.duckdb.enumerations.*
  import _root_.duckdb.predef.*
  import _root_.duckdb.aliases.*
  import _root_.duckdb.structs.*
  private[duckdb] def __sn_wrap_duckdb_duckdb_append_date(
      appender: duckdb_appender,
      value: Ptr[duckdb_date]
  ): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_append_hugeint(
      appender: duckdb_appender,
      value: Ptr[duckdb_hugeint]
  ): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_append_interval(
      appender: duckdb_appender,
      value: Ptr[duckdb_interval]
  ): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_append_time(
      appender: duckdb_appender,
      value: Ptr[duckdb_time]
  ): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_append_timestamp(
      appender: duckdb_appender,
      value: Ptr[duckdb_timestamp]
  ): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_date(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Ptr[duckdb_date]
  ): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_hugeint(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Ptr[duckdb_hugeint]
  ): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_interval(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Ptr[duckdb_interval]
  ): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_time(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Ptr[duckdb_time]
  ): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_bind_timestamp(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Ptr[duckdb_timestamp]
  ): duckdb_state = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_decimal_to_double(
      `val`: Ptr[duckdb_decimal]
  ): Double = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_double_to_hugeint(
      `val`: Double,
      __return: Ptr[duckdb_hugeint]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_from_date(
      date: Ptr[duckdb_date],
      __return: Ptr[duckdb_date_struct]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_from_time(
      time: Ptr[duckdb_time],
      __return: Ptr[duckdb_time_struct]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_from_timestamp(
      ts: Ptr[duckdb_timestamp],
      __return: Ptr[duckdb_timestamp_struct]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_hugeint_to_double(
      `val`: Ptr[duckdb_hugeint]
  ): Double = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_result_chunk_count(
      result: Ptr[duckdb_result]
  ): idx_t = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_result_get_chunk(
      result: Ptr[duckdb_result],
      chunk_index: idx_t
  ): duckdb_data_chunk = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_to_date(
      date: Ptr[duckdb_date_struct],
      __return: Ptr[duckdb_date]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_to_time(
      time: Ptr[duckdb_time_struct],
      __return: Ptr[duckdb_time]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_to_timestamp(
      ts: Ptr[duckdb_timestamp_struct],
      __return: Ptr[duckdb_timestamp]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_blob(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t,
      __return: Ptr[duckdb_blob]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_date(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t,
      __return: Ptr[duckdb_date]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_decimal(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t,
      __return: Ptr[duckdb_decimal]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_hugeint(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t,
      __return: Ptr[duckdb_hugeint]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_interval(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t,
      __return: Ptr[duckdb_interval]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_time(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t,
      __return: Ptr[duckdb_time]
  ): Unit = extern

  private[duckdb] def __sn_wrap_duckdb_duckdb_value_timestamp(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t,
      __return: Ptr[duckdb_timestamp]
  ): Unit = extern

  /** Add a replacement scan definition to the specified database
    */
  def duckdb_add_replacement_scan(
      db: duckdb_database,
      replacement: duckdb_replacement_callback_t,
      extra_data: Ptr[Byte],
      delete_callback: duckdb_delete_callback_t
  ): Unit = extern

  /** Append a blob value to the appender.
    */
  def duckdb_append_blob(
      appender: duckdb_appender,
      data: Ptr[Byte],
      length: idx_t
  ): duckdb_state = extern

  /** Append a bool value to the appender.
    */
  def duckdb_append_bool(
      appender: duckdb_appender,
      value: Boolean
  ): duckdb_state = extern

  /** Appends a pre-filled data chunk to the specified appender.
    */
  def duckdb_append_data_chunk(
      appender: duckdb_appender,
      chunk: duckdb_data_chunk
  ): duckdb_state = extern

  /** Append a double value to the appender.
    */
  def duckdb_append_double(
      appender: duckdb_appender,
      value: Double
  ): duckdb_state = extern

  /** Append a float value to the appender.
    */
  def duckdb_append_float(
      appender: duckdb_appender,
      value: Float
  ): duckdb_state = extern

  /** Append an int16_t value to the appender.
    */
  def duckdb_append_int16(
      appender: duckdb_appender,
      value: int16_t
  ): duckdb_state = extern

  /** Append an int32_t value to the appender.
    */
  def duckdb_append_int32(
      appender: duckdb_appender,
      value: int32_t
  ): duckdb_state = extern

  /** Append an int64_t value to the appender.
    */
  def duckdb_append_int64(
      appender: duckdb_appender,
      value: int64_t
  ): duckdb_state = extern

  /** Append an int8_t value to the appender.
    */
  def duckdb_append_int8(
      appender: duckdb_appender,
      value: int8_t
  ): duckdb_state = extern

  /** Append a NULL value to the appender (of any type).
    */
  def duckdb_append_null(appender: duckdb_appender): duckdb_state = extern

  /** Append a uint16_t value to the appender.
    */
  def duckdb_append_uint16(
      appender: duckdb_appender,
      value: uint16_t
  ): duckdb_state = extern

  /** Append a uint32_t value to the appender.
    */
  def duckdb_append_uint32(
      appender: duckdb_appender,
      value: uint32_t
  ): duckdb_state = extern

  /** Append a uint64_t value to the appender.
    */
  def duckdb_append_uint64(
      appender: duckdb_appender,
      value: uint64_t
  ): duckdb_state = extern

  /** Append a uint8_t value to the appender.
    */
  def duckdb_append_uint8(
      appender: duckdb_appender,
      value: uint8_t
  ): duckdb_state = extern

  /** Append a varchar value to the appender.
    */
  def duckdb_append_varchar(
      appender: duckdb_appender,
      `val`: CString
  ): duckdb_state = extern

  /** Append a varchar value to the appender.
    */
  def duckdb_append_varchar_length(
      appender: duckdb_appender,
      `val`: CString,
      length: idx_t
  ): duckdb_state = extern

  /** A nop function, provided for backwards compatibility reasons. Does
    * nothing. Only `duckdb_appender_end_row` is required.
    */
  def duckdb_appender_begin_row(appender: duckdb_appender): duckdb_state =
    extern

  /** Close the appender, flushing all intermediate state in the appender to the
    * table and closing it for further appends.
    */
  def duckdb_appender_close(appender: duckdb_appender): duckdb_state = extern

  /** Creates an appender object.
    */
  def duckdb_appender_create(
      connection: duckdb_connection,
      schema: CString,
      table: CString,
      out_appender: Ptr[duckdb_appender]
  ): duckdb_state = extern

  /** Close the appender and destroy it. Flushing all intermediate state in the
    * appender to the table, and de-allocating all memory associated with the
    * appender.
    */
  def duckdb_appender_destroy(appender: Ptr[duckdb_appender]): duckdb_state =
    extern

  /** Finish the current row of appends. After end_row is called, the next row
    * can be appended.
    */
  def duckdb_appender_end_row(appender: duckdb_appender): duckdb_state = extern

  /** Returns the error message associated with the given appender. If the
    * appender has no error message, this returns `nullptr` instead.
    */
  def duckdb_appender_error(appender: duckdb_appender): CString = extern

  /** Flush the appender to the table, forcing the cache of the appender to be
    * cleared and the data to be appended to the base table.
    */
  def duckdb_appender_flush(appender: duckdb_appender): duckdb_state = extern

  /** Returns the number of columns present in a the arrow result object.
    */
  def duckdb_arrow_column_count(result: duckdb_arrow): idx_t = extern

  /** Returns the number of rows present in a the arrow result object.
    */
  def duckdb_arrow_row_count(result: duckdb_arrow): idx_t = extern

  /** Returns the number of rows changed by the query stored in the arrow
    * result. This is relevant only for INSERT/UPDATE/DELETE queries. For other
    * queries the rows_changed will be 0.
    */
  def duckdb_arrow_rows_changed(result: duckdb_arrow): idx_t = extern

  /** Adds a result column to the output of the table function.
    */
  def duckdb_bind_add_result_column(
      info: duckdb_bind_info,
      name: CString,
      `type`: duckdb_logical_type
  ): Unit = extern

  /** Binds a blob value to the prepared statement at the specified index.
    */
  def duckdb_bind_blob(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      data: Ptr[Byte],
      length: idx_t
  ): duckdb_state = extern

  /** Binds a bool value to the prepared statement at the specified index.
    */
  def duckdb_bind_boolean(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Boolean
  ): duckdb_state = extern

  /** Binds an double value to the prepared statement at the specified index.
    */
  def duckdb_bind_double(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Double
  ): duckdb_state = extern

  /** Binds an float value to the prepared statement at the specified index.
    */
  def duckdb_bind_float(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Float
  ): duckdb_state = extern

  /** Retrieves the extra info of the function as set in
    * `duckdb_table_function_set_extra_info`
    */
  def duckdb_bind_get_extra_info(info: duckdb_bind_info): Ptr[Byte] = extern

  /** Retrieves the parameter at the given index.
    */
  def duckdb_bind_get_parameter(
      info: duckdb_bind_info,
      index: idx_t
  ): duckdb_value = extern

  /** Retrieves the number of regular (non-named) parameters to the function.
    */
  def duckdb_bind_get_parameter_count(info: duckdb_bind_info): idx_t = extern

  /** Binds an int16_t value to the prepared statement at the specified index.
    */
  def duckdb_bind_int16(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: int16_t
  ): duckdb_state = extern

  /** Binds an int32_t value to the prepared statement at the specified index.
    */
  def duckdb_bind_int32(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: int32_t
  ): duckdb_state = extern

  /** Binds an int64_t value to the prepared statement at the specified index.
    */
  def duckdb_bind_int64(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: int64_t
  ): duckdb_state = extern

  /** Binds an int8_t value to the prepared statement at the specified index.
    */
  def duckdb_bind_int8(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: int8_t
  ): duckdb_state = extern

  /** Binds a NULL value to the prepared statement at the specified index.
    */
  def duckdb_bind_null(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t
  ): duckdb_state = extern

  /** Sets the user-provided bind data in the bind object. This object can be
    * retrieved again during execution.
    */
  def duckdb_bind_set_bind_data(
      info: duckdb_bind_info,
      bind_data: Ptr[Byte],
      destroy: duckdb_delete_callback_t
  ): Unit = extern

  /** Report that an error has occurred while calling bind.
    */
  def duckdb_bind_set_error(info: duckdb_bind_info, error: CString): Unit =
    extern

  /** Binds an uint16_t value to the prepared statement at the specified index.
    */
  def duckdb_bind_uint16(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: uint16_t
  ): duckdb_state = extern

  /** Binds an uint32_t value to the prepared statement at the specified index.
    */
  def duckdb_bind_uint32(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: uint32_t
  ): duckdb_state = extern

  /** Binds an uint64_t value to the prepared statement at the specified index.
    */
  def duckdb_bind_uint64(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: uint64_t
  ): duckdb_state = extern

  /** Binds an uint8_t value to the prepared statement at the specified index.
    */
  def duckdb_bind_uint8(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: uint8_t
  ): duckdb_state = extern

  /** Binds a null-terminated varchar value to the prepared statement at the
    * specified index.
    */
  def duckdb_bind_varchar(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: CString
  ): duckdb_state = extern

  /** Binds a varchar value to the prepared statement at the specified index.
    */
  def duckdb_bind_varchar_length(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: CString,
      length: idx_t
  ): duckdb_state = extern

  /** Closes the specified database and de-allocates all memory allocated for
    * that database. This should be called after you are done with any database
    * allocated through `duckdb_open`. Note that failing to call `duckdb_close`
    * (in case of e.g. a program crash) will not cause data corruption. Still it
    * is recommended to always correctly close a database object after you are
    * done with it.
    */
  def duckdb_close(database: Ptr[duckdb_database]): Unit = extern

  /** Returns the number of columns present in a the result object.
    */
  def duckdb_column_count(result: Ptr[duckdb_result]): idx_t = extern

  /** *DEPRECATED**: Prefer using `duckdb_result_get_chunk` instead.
    */
  def duckdb_column_data(result: Ptr[duckdb_result], col: idx_t): Ptr[Byte] =
    extern

  /** Returns the logical column type of the specified column.
    */
  def duckdb_column_logical_type(
      result: Ptr[duckdb_result],
      col: idx_t
  ): duckdb_logical_type = extern

  /** Returns the column name of the specified column. The result should not
    * need be freed; the column names will automatically be destroyed when the
    * result is destroyed.
    */
  def duckdb_column_name(result: Ptr[duckdb_result], col: idx_t): CString =
    extern

  /** Returns the column type of the specified column.
    */
  def duckdb_column_type(result: Ptr[duckdb_result], col: idx_t): duckdb_type =
    extern

  /** This returns the total amount of configuration options available for usage
    * with `duckdb_get_config_flag`.
    */
  def duckdb_config_count(): size_t = extern

  /** Opens a connection to a database. Connections are required to query the
    * database, and store transactional state associated with the connection.
    */
  def duckdb_connect(
      database: duckdb_database,
      out_connection: Ptr[duckdb_connection]
  ): duckdb_state = extern

  /** Initializes an empty configuration object that can be used to provide
    * start-up options for the DuckDB instance through `duckdb_open_ext`.
    */
  def duckdb_create_config(out_config: Ptr[duckdb_config]): duckdb_state =
    extern

  /** Creates an empty DataChunk with the specified set of types.
    */
  def duckdb_create_data_chunk(
      types: Ptr[duckdb_logical_type],
      column_count: idx_t
  ): duckdb_data_chunk = extern

  /** Creates a `duckdb_logical_type` of type decimal with the specified width
    * and scale The resulting type should be destroyed with
    * `duckdb_destroy_logical_type`.
    */
  def duckdb_create_decimal_type(
      width: uint8_t,
      scale: uint8_t
  ): duckdb_logical_type = extern

  /** Creates a value from an int64
    */
  def duckdb_create_int64(`val`: int64_t): duckdb_value = extern

  /** Creates a list type from its child type. The resulting type should be
    * destroyed with `duckdb_destroy_logical_type`.
    */
  def duckdb_create_list_type(
      `type`: duckdb_logical_type
  ): duckdb_logical_type = extern

  /** Creates a `duckdb_logical_type` from a standard primitive type. The
    * resulting type should be destroyed with `duckdb_destroy_logical_type`.
    */
  def duckdb_create_logical_type(`type`: duckdb_type): duckdb_logical_type =
    extern

  /** Creates a map type from its key type and value type. The resulting type
    * should be destroyed with `duckdb_destroy_logical_type`.
    */
  def duckdb_create_map_type(
      key_type: duckdb_logical_type,
      value_type: duckdb_logical_type
  ): duckdb_logical_type = extern

  /** Creates a new empty table function.
    */
  def duckdb_create_table_function(): duckdb_table_function = extern

  /** Creates a value from a null-terminated string
    */
  def duckdb_create_varchar(text: CString): duckdb_value = extern

  /** Creates a value from a string
    */
  def duckdb_create_varchar_length(text: CString, length: idx_t): duckdb_value =
    extern

  /** Retrieves the number of columns in a data chunk.
    */
  def duckdb_data_chunk_get_column_count(chunk: duckdb_data_chunk): idx_t =
    extern

  /** Retrieves the current number of tuples in a data chunk.
    */
  def duckdb_data_chunk_get_size(chunk: duckdb_data_chunk): idx_t = extern

  /** Retrieves the vector at the specified column index in the data chunk.
    */
  def duckdb_data_chunk_get_vector(
      chunk: duckdb_data_chunk,
      col_idx: idx_t
  ): duckdb_vector = extern

  /** Resets a data chunk, clearing the validity masks and setting the
    * cardinality of the data chunk to 0.
    */
  def duckdb_data_chunk_reset(chunk: duckdb_data_chunk): Unit = extern

  /** Sets the current number of tuples in a data chunk.
    */
  def duckdb_data_chunk_set_size(chunk: duckdb_data_chunk, size: idx_t): Unit =
    extern

  /** Retrieves the internal storage type of a decimal type.
    */
  def duckdb_decimal_internal_type(`type`: duckdb_logical_type): duckdb_type =
    extern

  /** Retrieves the scale of a decimal type.
    */
  def duckdb_decimal_scale(`type`: duckdb_logical_type): uint8_t = extern

  /** Retrieves the width of a decimal type.
    */
  def duckdb_decimal_width(`type`: duckdb_logical_type): uint8_t = extern

  /** Closes the result and de-allocates all memory allocated for the arrow
    * result.
    */
  def duckdb_destroy_arrow(result: Ptr[duckdb_arrow]): Unit = extern

  /** Destroys the specified configuration option and de-allocates all memory
    * allocated for the object.
    */
  def duckdb_destroy_config(config: Ptr[duckdb_config]): Unit = extern

  /** Destroys the data chunk and de-allocates all memory allocated for that
    * chunk.
    */
  def duckdb_destroy_data_chunk(chunk: Ptr[duckdb_data_chunk]): Unit = extern

  /** Destroys the logical type and de-allocates all memory allocated for that
    * type.
    */
  def duckdb_destroy_logical_type(`type`: Ptr[duckdb_logical_type]): Unit =
    extern

  /** Closes the prepared statement and de-allocates all memory allocated for
    * the statement.
    */
  def duckdb_destroy_prepare(
      prepared_statement: Ptr[duckdb_prepared_statement]
  ): Unit = extern

  /** Closes the result and de-allocates all memory allocated for that
    * connection.
    */
  def duckdb_destroy_result(result: Ptr[duckdb_result]): Unit = extern

  /** Destroys the given table function object.
    */
  def duckdb_destroy_table_function(
      table_function: Ptr[duckdb_table_function]
  ): Unit = extern

  /** Destroys the value and de-allocates all memory allocated for that type.
    */
  def duckdb_destroy_value(value: Ptr[duckdb_value]): Unit = extern

  /** Closes the specified connection and de-allocates all memory allocated for
    * that connection.
    */
  def duckdb_disconnect(connection: Ptr[duckdb_connection]): Unit = extern

  /** Retrieves the dictionary size of the enum type
    */
  def duckdb_enum_dictionary_size(`type`: duckdb_logical_type): uint32_t =
    extern

  /** Retrieves the dictionary value at the specified position from the enum.
    */
  def duckdb_enum_dictionary_value(
      `type`: duckdb_logical_type,
      index: idx_t
  ): CString = extern

  /** Retrieves the internal storage type of an enum type.
    */
  def duckdb_enum_internal_type(`type`: duckdb_logical_type): duckdb_type =
    extern

  /** Executes the prepared statement with the given bound parameters, and
    * returns a materialized query result.
    */
  def duckdb_execute_prepared(
      prepared_statement: duckdb_prepared_statement,
      out_result: Ptr[duckdb_result]
  ): duckdb_state = extern

  /** Executes the prepared statement with the given bound parameters, and
    * returns an arrow query result.
    */
  def duckdb_execute_prepared_arrow(
      prepared_statement: duckdb_prepared_statement,
      out_result: Ptr[duckdb_arrow]
  ): duckdb_state = extern

  /** Execute DuckDB tasks on this thread.
    */
  def duckdb_execute_tasks(database: duckdb_database, max_tasks: idx_t): Unit =
    extern

  /** Free a value returned from `duckdb_malloc`, `duckdb_value_varchar` or
    * `duckdb_value_blob`.
    */
  def duckdb_free(ptr: Ptr[Byte]): Unit = extern

  /** Gets the bind data set by `duckdb_bind_set_bind_data` during the bind.
    */
  def duckdb_function_get_bind_data(info: duckdb_function_info): Ptr[Byte] =
    extern

  /** Retrieves the extra info of the function as set in
    * `duckdb_table_function_set_extra_info`
    */
  def duckdb_function_get_extra_info(info: duckdb_function_info): Ptr[Byte] =
    extern

  /** Gets the init data set by `duckdb_bind_set_init_data` during the bind.
    */
  def duckdb_function_get_init_data(info: duckdb_function_info): Ptr[Byte] =
    extern

  /** Report that an error has occurred while executing the function.
    */
  def duckdb_function_set_error(
      info: duckdb_function_info,
      error: CString
  ): Unit = extern

  /** Obtains a human-readable name and description of a specific configuration
    * option. This can be used to e.g. display configuration options. This will
    * succeed unless `index` is out of range (i.e. `>= duckdb_config_count`).
    */
  def duckdb_get_config_flag(
      index: size_t,
      out_name: Ptr[CString],
      out_description: Ptr[CString]
  ): duckdb_state = extern

  /** Obtains an int64 of the given value.
    */
  def duckdb_get_int64(value: duckdb_value): int64_t = extern

  /** Retrieves the type class of a `duckdb_logical_type`.
    */
  def duckdb_get_type_id(`type`: duckdb_logical_type): duckdb_type = extern

  /** Obtains a string representation of the given value. The result must be
    * destroyed with `duckdb_free`.
    */
  def duckdb_get_varchar(value: duckdb_value): CString = extern

  /** Gets the bind data set by `duckdb_bind_set_bind_data` during the bind.
    */
  def duckdb_init_get_bind_data(info: duckdb_init_info): Ptr[Byte] = extern

  /** Returns the number of projected columns.
    */
  def duckdb_init_get_column_count(info: duckdb_init_info): idx_t = extern

  /** Returns the column index of the projected column at the specified
    * position.
    */
  def duckdb_init_get_column_index(
      info: duckdb_init_info,
      column_index: idx_t
  ): idx_t = extern

  /** Retrieves the extra info of the function as set in
    * `duckdb_table_function_set_extra_info`
    */
  def duckdb_init_get_extra_info(info: duckdb_init_info): Ptr[Byte] = extern

  /** Report that an error has occurred while calling init.
    */
  def duckdb_init_set_error(info: duckdb_init_info, error: CString): Unit =
    extern

  /** Sets the user-provided init data in the init object. This object can be
    * retrieved again during execution.
    */
  def duckdb_init_set_init_data(
      info: duckdb_init_info,
      init_data: Ptr[Byte],
      destroy: duckdb_delete_callback_t
  ): Unit = extern

  /** Retrieves the child type of the given list type.
    */
  def duckdb_list_type_child_type(
      `type`: duckdb_logical_type
  ): duckdb_logical_type = extern

  /** Retrieves the child vector of a list vector.
    */
  def duckdb_list_vector_get_child(vector: duckdb_vector): duckdb_vector =
    extern

  /** Returns the size of the child vector of the list
    */
  def duckdb_list_vector_get_size(vector: duckdb_vector): idx_t = extern

  /** Allocate `size` bytes of memory using the duckdb internal malloc function.
    * Any memory allocated in this manner should be freed using `duckdb_free`.
    */
  def duckdb_malloc(size: size_t): Ptr[Byte] = extern

  /** Retrieves the key type of the given map type.
    */
  def duckdb_map_type_key_type(
      `type`: duckdb_logical_type
  ): duckdb_logical_type = extern

  /** Retrieves the value type of the given map type.
    */
  def duckdb_map_type_value_type(
      `type`: duckdb_logical_type
  ): duckdb_logical_type = extern

  /** Returns the number of parameters that can be provided to the given
    * prepared statement.
    */
  def duckdb_nparams(prepared_statement: duckdb_prepared_statement): idx_t =
    extern

  /** *DEPRECATED**: Prefer using `duckdb_result_get_chunk` instead.
    */
  def duckdb_nullmask_data(
      result: Ptr[duckdb_result],
      col: idx_t
  ): Ptr[Boolean] = extern

  /** Creates a new database or opens an existing database file stored at the
    * the given path. If no path is given a new in-memory database is created
    * instead.
    */
  def duckdb_open(
      path: CString,
      out_database: Ptr[duckdb_database]
  ): duckdb_state = extern

  /** Extended version of duckdb_open. Creates a new database or opens an
    * existing database file stored at the the given path.
    */
  def duckdb_open_ext(
      path: CString,
      out_database: Ptr[duckdb_database],
      config: duckdb_config,
      out_error: Ptr[CString]
  ): duckdb_state = extern

  /** Returns the parameter type for the parameter at the given index.
    */
  def duckdb_param_type(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t
  ): duckdb_type = extern

  /** Create a prepared statement object from a query.
    */
  def duckdb_prepare(
      connection: duckdb_connection,
      query: CString,
      out_prepared_statement: Ptr[duckdb_prepared_statement]
  ): duckdb_state = extern

  /** Returns the error message associated with the given prepared statement. If
    * the prepared statement has no error message, this returns `nullptr`
    * instead.
    */
  def duckdb_prepare_error(
      prepared_statement: duckdb_prepared_statement
  ): CString = extern

  /** Executes a SQL query within a connection and stores the full
    * (materialized) result in the out_result pointer. If the query fails to
    * execute, DuckDBError is returned and the error message can be retrieved by
    * calling `duckdb_result_error`.
    */
  def duckdb_query(
      connection: duckdb_connection,
      query: CString,
      out_result: Ptr[duckdb_result]
  ): duckdb_state = extern

  /** Executes a SQL query within a connection and stores the full
    * (materialized) result in an arrow structure. If the query fails to
    * execute, DuckDBError is returned and the error message can be retrieved by
    * calling `duckdb_query_arrow_error`.
    */
  def duckdb_query_arrow(
      connection: duckdb_connection,
      query: CString,
      out_result: Ptr[duckdb_arrow]
  ): duckdb_state = extern

  /** Fetch an internal arrow array from the arrow result.
    */
  def duckdb_query_arrow_array(
      result: duckdb_arrow,
      out_array: Ptr[duckdb_arrow_array]
  ): duckdb_state = extern

  /** Returns the error message contained within the result. The error is only
    * set if `duckdb_query_arrow` returns `DuckDBError`.
    */
  def duckdb_query_arrow_error(result: duckdb_arrow): CString = extern

  /** Fetch the internal arrow schema from the arrow result.
    */
  def duckdb_query_arrow_schema(
      result: duckdb_arrow,
      out_schema: Ptr[duckdb_arrow_schema]
  ): duckdb_state = extern

  /** Register the table function object within the given connection.
    */
  def duckdb_register_table_function(
      con: duckdb_connection,
      function: duckdb_table_function
  ): duckdb_state = extern

  /** Adds a parameter to the replacement scan function.
    */
  def duckdb_replacement_scan_add_parameter(
      info: duckdb_replacement_scan_info,
      parameter: duckdb_value
  ): Unit = extern

  /** Sets the replacement function name to use. If this function is called in
    * the replacement callback, the replacement scan is performed. If it is not
    * called, the replacement callback is not performed.
    */
  def duckdb_replacement_scan_set_function_name(
      info: duckdb_replacement_scan_info,
      function_name: CString
  ): Unit = extern

  /** Returns the error message contained within the result. The error is only
    * set if `duckdb_query` returns `DuckDBError`.
    */
  def duckdb_result_error(result: Ptr[duckdb_result]): CString = extern

  /** Returns the number of rows present in a the result object.
    */
  def duckdb_row_count(result: Ptr[duckdb_result]): idx_t = extern

  /** Returns the number of rows changed by the query stored in the result. This
    * is relevant only for INSERT/UPDATE/DELETE queries. For other queries the
    * rows_changed will be 0.
    */
  def duckdb_rows_changed(result: Ptr[duckdb_result]): idx_t = extern

  /** Sets the specified option for the specified configuration. The
    * configuration option is indicated by name. To obtain a list of config
    * options, see `duckdb_get_config_flag`.
    */
  def duckdb_set_config(
      config: duckdb_config,
      name: CString,
      option: CString
  ): duckdb_state = extern

  /** Returns the number of children of a struct type.
    */
  def duckdb_struct_type_child_count(`type`: duckdb_logical_type): idx_t =
    extern

  /** Retrieves the name of the struct child.
    */
  def duckdb_struct_type_child_name(
      `type`: duckdb_logical_type,
      index: idx_t
  ): CString = extern

  /** Retrieves the child type of the given struct type at the specified index.
    */
  def duckdb_struct_type_child_type(
      `type`: duckdb_logical_type,
      index: idx_t
  ): duckdb_logical_type = extern

  /** Retrieves the child vector of a struct vector.
    */
  def duckdb_struct_vector_get_child(
      vector: duckdb_vector,
      index: idx_t
  ): duckdb_vector = extern

  /** Adds a parameter to the table function.
    */
  def duckdb_table_function_add_parameter(
      table_function: duckdb_table_function,
      `type`: duckdb_logical_type
  ): Unit = extern

  /** Sets the bind function of the table function
    */
  def duckdb_table_function_set_bind(
      table_function: duckdb_table_function,
      bind: duckdb_table_function_bind_t
  ): Unit = extern

  /** Assigns extra information to the table function that can be fetched during
    * binding, etc.
    */
  def duckdb_table_function_set_extra_info(
      table_function: duckdb_table_function,
      extra_info: Ptr[Byte],
      destroy: duckdb_delete_callback_t
  ): Unit = extern

  /** Sets the main function of the table function
    */
  def duckdb_table_function_set_function(
      table_function: duckdb_table_function,
      function: duckdb_table_function_t
  ): Unit = extern

  /** Sets the init function of the table function
    */
  def duckdb_table_function_set_init(
      table_function: duckdb_table_function,
      init: duckdb_table_function_init_t
  ): Unit = extern

  /** Sets the name of the given table function.
    */
  def duckdb_table_function_set_name(
      table_function: duckdb_table_function,
      name: CString
  ): Unit = extern

  /** Sets whether or not the given table function supports projection pushdown.
    */
  def duckdb_table_function_supports_projection_pushdown(
      table_function: duckdb_table_function,
      pushdown: Boolean
  ): Unit = extern

  /** Returns whether or not a row is valid (i.e. not NULL) in the given
    * validity mask.
    */
  def duckdb_validity_row_is_valid(
      validity: Ptr[uint64_t],
      row: idx_t
  ): Boolean = extern

  /** In a validity mask, sets a specific row to invalid.
    */
  def duckdb_validity_set_row_invalid(
      validity: Ptr[uint64_t],
      row: idx_t
  ): Unit = extern

  /** In a validity mask, sets a specific row to valid.
    */
  def duckdb_validity_set_row_valid(validity: Ptr[uint64_t], row: idx_t): Unit =
    extern

  /** In a validity mask, sets a specific row to either valid or invalid.
    */
  def duckdb_validity_set_row_validity(
      validity: Ptr[uint64_t],
      row: idx_t,
      valid: Boolean
  ): Unit = extern

  /** returns: The boolean value at the specified location, or false if the
    * value cannot be converted.
    */
  def duckdb_value_boolean(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): Boolean = extern

  /** returns: The double value at the specified location, or 0 if the value
    * cannot be converted.
    */
  def duckdb_value_double(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): Double = extern

  /** returns: The float value at the specified location, or 0 if the value
    * cannot be converted.
    */
  def duckdb_value_float(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): Float = extern

  /** returns: The int16_t value at the specified location, or 0 if the value
    * cannot be converted.
    */
  def duckdb_value_int16(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): int16_t = extern

  /** returns: The int32_t value at the specified location, or 0 if the value
    * cannot be converted.
    */
  def duckdb_value_int32(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): int32_t = extern

  /** returns: The int64_t value at the specified location, or 0 if the value
    * cannot be converted.
    */
  def duckdb_value_int64(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): int64_t = extern

  /** returns: The int8_t value at the specified location, or 0 if the value
    * cannot be converted.
    */
  def duckdb_value_int8(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): int8_t = extern

  /** returns: Returns true if the value at the specified index is NULL, and
    * false otherwise.
    */
  def duckdb_value_is_null(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): Boolean = extern

  /** returns: The uint16_t value at the specified location, or 0 if the value
    * cannot be converted.
    */
  def duckdb_value_uint16(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): uint16_t = extern

  /** returns: The uint32_t value at the specified location, or 0 if the value
    * cannot be converted.
    */
  def duckdb_value_uint32(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): uint32_t = extern

  /** returns: The uint64_t value at the specified location, or 0 if the value
    * cannot be converted.
    */
  def duckdb_value_uint64(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): uint64_t = extern

  /** returns: The uint8_t value at the specified location, or 0 if the value
    * cannot be converted.
    */
  def duckdb_value_uint8(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): uint8_t = extern

  /** returns: The char* value at the specified location, or nullptr if the
    * value cannot be converted. The result must be freed with `duckdb_free`.
    */
  def duckdb_value_varchar(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): CString = extern

  /** returns: The char* value at the specified location. ONLY works on VARCHAR
    * columns and does not auto-cast. If the column is NOT a VARCHAR column this
    * function will return NULL.
    */
  def duckdb_value_varchar_internal(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  ): CString = extern

  /** Assigns a string element in the vector at the specified location.
    */
  def duckdb_vector_assign_string_element(
      vector: duckdb_vector,
      index: idx_t,
      str: CString
  ): Unit = extern

  /** Assigns a string element in the vector at the specified location.
    */
  def duckdb_vector_assign_string_element_len(
      vector: duckdb_vector,
      index: idx_t,
      str: CString,
      str_len: idx_t
  ): Unit = extern

  /** Ensures the validity mask is writable by allocating it.
    */
  def duckdb_vector_ensure_validity_writable(vector: duckdb_vector): Unit =
    extern

  /** Retrieves the column type of the specified vector.
    */
  def duckdb_vector_get_column_type(
      vector: duckdb_vector
  ): duckdb_logical_type = extern

  /** Retrieves the data pointer of the vector.
    */
  def duckdb_vector_get_data(vector: duckdb_vector): Ptr[Byte] = extern

  /** Retrieves the validity mask pointer of the specified vector.
    */
  def duckdb_vector_get_validity(vector: duckdb_vector): Ptr[uint64_t] = extern

  /** The internal vector size used by DuckDB. This is the amount of tuples that
    * will fit into a data chunk created by `duckdb_create_data_chunk`.
    */
  def duckdb_vector_size(): idx_t = extern
end extern_functions

object functions:
  import _root_.duckdb.enumerations.*
  import _root_.duckdb.predef.*
  import _root_.duckdb.aliases.*
  import _root_.duckdb.structs.*
  import extern_functions.*
  export extern_functions.*

  /** Append a duckdb_date value to the appender.
    */
  def duckdb_append_date(appender: duckdb_appender, value: duckdb_date)(using
      Zone
  ): duckdb_state =
    val __ptr_0: Ptr[duckdb_date] = alloc[duckdb_date](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_append_date(appender, (__ptr_0 + 0))

  /** Append a duckdb_date value to the appender.
    */
  def duckdb_append_date(
      appender: duckdb_appender,
      value: Ptr[duckdb_date]
  ): duckdb_state =
    __sn_wrap_duckdb_duckdb_append_date(appender, value)

  /** Append a duckdb_hugeint value to the appender.
    */
  def duckdb_append_hugeint(
      appender: duckdb_appender,
      value: Ptr[duckdb_hugeint]
  ): duckdb_state =
    __sn_wrap_duckdb_duckdb_append_hugeint(appender, value)

  /** Append a duckdb_hugeint value to the appender.
    */
  def duckdb_append_hugeint(appender: duckdb_appender, value: duckdb_hugeint)(
      using Zone
  ): duckdb_state =
    val __ptr_0: Ptr[duckdb_hugeint] = alloc[duckdb_hugeint](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_append_hugeint(appender, (__ptr_0 + 0))

  /** Append a duckdb_interval value to the appender.
    */
  def duckdb_append_interval(
      appender: duckdb_appender,
      value: Ptr[duckdb_interval]
  ): duckdb_state =
    __sn_wrap_duckdb_duckdb_append_interval(appender, value)

  /** Append a duckdb_interval value to the appender.
    */
  def duckdb_append_interval(appender: duckdb_appender, value: duckdb_interval)(
      using Zone
  ): duckdb_state =
    val __ptr_0: Ptr[duckdb_interval] = alloc[duckdb_interval](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_append_interval(appender, (__ptr_0 + 0))

  /** Append a duckdb_time value to the appender.
    */
  def duckdb_append_time(appender: duckdb_appender, value: duckdb_time)(using
      Zone
  ): duckdb_state =
    val __ptr_0: Ptr[duckdb_time] = alloc[duckdb_time](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_append_time(appender, (__ptr_0 + 0))

  /** Append a duckdb_time value to the appender.
    */
  def duckdb_append_time(
      appender: duckdb_appender,
      value: Ptr[duckdb_time]
  ): duckdb_state =
    __sn_wrap_duckdb_duckdb_append_time(appender, value)

  /** Append a duckdb_timestamp value to the appender.
    */
  def duckdb_append_timestamp(
      appender: duckdb_appender,
      value: Ptr[duckdb_timestamp]
  ): duckdb_state =
    __sn_wrap_duckdb_duckdb_append_timestamp(appender, value)

  /** Append a duckdb_timestamp value to the appender.
    */
  def duckdb_append_timestamp(
      appender: duckdb_appender,
      value: duckdb_timestamp
  )(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_timestamp] = alloc[duckdb_timestamp](1)
    !(__ptr_0 + 0) = value
    __sn_wrap_duckdb_duckdb_append_timestamp(appender, (__ptr_0 + 0))

  /** Binds a duckdb_date value to the prepared statement at the specified
    * index.
    */
  def duckdb_bind_date(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: duckdb_date
  )(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_date] = alloc[duckdb_date](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_date(
      prepared_statement,
      param_idx,
      (__ptr_0 + 0)
    )
  end duckdb_bind_date

  /** Binds a duckdb_date value to the prepared statement at the specified
    * index.
    */
  def duckdb_bind_date(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Ptr[duckdb_date]
  ): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_date(prepared_statement, param_idx, `val`)

  /** Binds an duckdb_hugeint value to the prepared statement at the specified
    * index.
    */
  def duckdb_bind_hugeint(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Ptr[duckdb_hugeint]
  ): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_hugeint(prepared_statement, param_idx, `val`)

  /** Binds an duckdb_hugeint value to the prepared statement at the specified
    * index.
    */
  def duckdb_bind_hugeint(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: duckdb_hugeint
  )(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_hugeint] = alloc[duckdb_hugeint](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_hugeint(
      prepared_statement,
      param_idx,
      (__ptr_0 + 0)
    )
  end duckdb_bind_hugeint

  /** Binds a duckdb_interval value to the prepared statement at the specified
    * index.
    */
  def duckdb_bind_interval(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Ptr[duckdb_interval]
  ): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_interval(prepared_statement, param_idx, `val`)

  /** Binds a duckdb_interval value to the prepared statement at the specified
    * index.
    */
  def duckdb_bind_interval(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: duckdb_interval
  )(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_interval] = alloc[duckdb_interval](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_interval(
      prepared_statement,
      param_idx,
      (__ptr_0 + 0)
    )
  end duckdb_bind_interval

  /** Binds a duckdb_time value to the prepared statement at the specified
    * index.
    */
  def duckdb_bind_time(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Ptr[duckdb_time]
  ): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_time(prepared_statement, param_idx, `val`)

  /** Binds a duckdb_time value to the prepared statement at the specified
    * index.
    */
  def duckdb_bind_time(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: duckdb_time
  )(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_time] = alloc[duckdb_time](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_time(
      prepared_statement,
      param_idx,
      (__ptr_0 + 0)
    )
  end duckdb_bind_time

  /** Binds a duckdb_timestamp value to the prepared statement at the specified
    * index.
    */
  def duckdb_bind_timestamp(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: duckdb_timestamp
  )(using Zone): duckdb_state =
    val __ptr_0: Ptr[duckdb_timestamp] = alloc[duckdb_timestamp](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_bind_timestamp(
      prepared_statement,
      param_idx,
      (__ptr_0 + 0)
    )
  end duckdb_bind_timestamp

  /** Binds a duckdb_timestamp value to the prepared statement at the specified
    * index.
    */
  def duckdb_bind_timestamp(
      prepared_statement: duckdb_prepared_statement,
      param_idx: idx_t,
      `val`: Ptr[duckdb_timestamp]
  ): duckdb_state =
    __sn_wrap_duckdb_duckdb_bind_timestamp(prepared_statement, param_idx, `val`)

  /** Converts a duckdb_decimal object (as obtained from a `DUCKDB_TYPE_DECIMAL`
    * column) into a double.
    */
  def duckdb_decimal_to_double(`val`: duckdb_decimal)(using Zone): Double =
    val __ptr_0: Ptr[duckdb_decimal] = alloc[duckdb_decimal](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_decimal_to_double((__ptr_0 + 0))

  /** Converts a duckdb_decimal object (as obtained from a `DUCKDB_TYPE_DECIMAL`
    * column) into a double.
    */
  def duckdb_decimal_to_double(`val`: Ptr[duckdb_decimal]): Double =
    __sn_wrap_duckdb_duckdb_decimal_to_double(`val`)

  /** Converts a double value to a duckdb_hugeint object.
    */
  def duckdb_double_to_hugeint(`val`: Double)(using Zone): duckdb_hugeint =
    val __ptr_0: Ptr[duckdb_hugeint] = alloc[duckdb_hugeint](1)
    __sn_wrap_duckdb_duckdb_double_to_hugeint(`val`, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Converts a double value to a duckdb_hugeint object.
    */
  def duckdb_double_to_hugeint(`val`: Double)(
      __return: Ptr[duckdb_hugeint]
  ): Unit =
    __sn_wrap_duckdb_duckdb_double_to_hugeint(`val`, __return)

  /** Decompose a `duckdb_date` object into year, month and date (stored as
    * `duckdb_date_struct`).
    */
  def duckdb_from_date(date: Ptr[duckdb_date])(using Zone): duckdb_date_struct =
    val __ptr_0: Ptr[duckdb_date_struct] = alloc[duckdb_date_struct](1)
    __sn_wrap_duckdb_duckdb_from_date(date, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Decompose a `duckdb_date` object into year, month and date (stored as
    * `duckdb_date_struct`).
    */
  def duckdb_from_date(date: Ptr[duckdb_date])(
      __return: Ptr[duckdb_date_struct]
  ): Unit =
    __sn_wrap_duckdb_duckdb_from_date(date, __return)

  /** Decompose a `duckdb_date` object into year, month and date (stored as
    * `duckdb_date_struct`).
    */
  def duckdb_from_date(date: duckdb_date)(using Zone): duckdb_date_struct =
    val __ptr_0: Ptr[duckdb_date] = alloc[duckdb_date](1)
    val __ptr_1: Ptr[duckdb_date_struct] = alloc[duckdb_date_struct](1)
    !(__ptr_0 + 0) = date
    __sn_wrap_duckdb_duckdb_from_date((__ptr_0 + 0), (__ptr_1 + 0))
    !(__ptr_1 + 0)

  /** Decompose a `duckdb_time` object into hour, minute, second and microsecond
    * (stored as `duckdb_time_struct`).
    */
  def duckdb_from_time(time: Ptr[duckdb_time])(
      __return: Ptr[duckdb_time_struct]
  ): Unit =
    __sn_wrap_duckdb_duckdb_from_time(time, __return)

  /** Decompose a `duckdb_time` object into hour, minute, second and microsecond
    * (stored as `duckdb_time_struct`).
    */
  def duckdb_from_time(time: duckdb_time)(using Zone): duckdb_time_struct =
    val __ptr_0: Ptr[duckdb_time_struct] = alloc[duckdb_time_struct](1)
    val __ptr_1: Ptr[duckdb_time] = alloc[duckdb_time](1)
    !(__ptr_1 + 0) = time
    __sn_wrap_duckdb_duckdb_from_time((__ptr_1 + 0), (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Decompose a `duckdb_time` object into hour, minute, second and microsecond
    * (stored as `duckdb_time_struct`).
    */
  def duckdb_from_time(time: Ptr[duckdb_time])(using Zone): duckdb_time_struct =
    val __ptr_0: Ptr[duckdb_time_struct] = alloc[duckdb_time_struct](1)
    __sn_wrap_duckdb_duckdb_from_time(time, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Decompose a `duckdb_timestamp` object into a `duckdb_timestamp_struct`.
    */
  def duckdb_from_timestamp(ts: Ptr[duckdb_timestamp])(
      __return: Ptr[duckdb_timestamp_struct]
  ): Unit =
    __sn_wrap_duckdb_duckdb_from_timestamp(ts, __return)

  /** Decompose a `duckdb_timestamp` object into a `duckdb_timestamp_struct`.
    */
  def duckdb_from_timestamp(ts: duckdb_timestamp)(using
      Zone
  ): duckdb_timestamp_struct =
    val __ptr_0: Ptr[duckdb_timestamp] = alloc[duckdb_timestamp](1)
    val __ptr_1: Ptr[duckdb_timestamp_struct] =
      alloc[duckdb_timestamp_struct](1)
    !(__ptr_0 + 0) = ts
    __sn_wrap_duckdb_duckdb_from_timestamp((__ptr_0 + 0), (__ptr_1 + 0))
    !(__ptr_1 + 0)

  /** Decompose a `duckdb_timestamp` object into a `duckdb_timestamp_struct`.
    */
  def duckdb_from_timestamp(ts: Ptr[duckdb_timestamp])(using
      Zone
  ): duckdb_timestamp_struct =
    val __ptr_0: Ptr[duckdb_timestamp_struct] =
      alloc[duckdb_timestamp_struct](1)
    __sn_wrap_duckdb_duckdb_from_timestamp(ts, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Converts a duckdb_hugeint object (as obtained from a `DUCKDB_TYPE_HUGEINT`
    * column) into a double.
    */
  def duckdb_hugeint_to_double(`val`: duckdb_hugeint)(using Zone): Double =
    val __ptr_0: Ptr[duckdb_hugeint] = alloc[duckdb_hugeint](1)
    !(__ptr_0 + 0) = `val`
    __sn_wrap_duckdb_duckdb_hugeint_to_double((__ptr_0 + 0))

  /** Converts a duckdb_hugeint object (as obtained from a `DUCKDB_TYPE_HUGEINT`
    * column) into a double.
    */
  def duckdb_hugeint_to_double(`val`: Ptr[duckdb_hugeint]): Double =
    __sn_wrap_duckdb_duckdb_hugeint_to_double(`val`)

  /** Returns the number of data chunks present in the result.
    */
  def duckdb_result_chunk_count(result: Ptr[duckdb_result]): idx_t =
    __sn_wrap_duckdb_duckdb_result_chunk_count(result)

  /** Returns the number of data chunks present in the result.
    */
  def duckdb_result_chunk_count(result: duckdb_result)(using Zone): idx_t =
    val __ptr_0: Ptr[duckdb_result] = alloc[duckdb_result](1)
    !(__ptr_0 + 0) = result
    __sn_wrap_duckdb_duckdb_result_chunk_count((__ptr_0 + 0))

  /** Fetches a data chunk from the duckdb_result. This function should be
    * called repeatedly until the result is exhausted.
    */
  def duckdb_result_get_chunk(result: duckdb_result, chunk_index: idx_t)(using
      Zone
  ): duckdb_data_chunk =
    val __ptr_0: Ptr[duckdb_result] = alloc[duckdb_result](1)
    !(__ptr_0 + 0) = result
    __sn_wrap_duckdb_duckdb_result_get_chunk((__ptr_0 + 0), chunk_index)

  /** Fetches a data chunk from the duckdb_result. This function should be
    * called repeatedly until the result is exhausted.
    */
  def duckdb_result_get_chunk(
      result: Ptr[duckdb_result],
      chunk_index: idx_t
  ): duckdb_data_chunk =
    __sn_wrap_duckdb_duckdb_result_get_chunk(result, chunk_index)

  /** Re-compose a `duckdb_date` from year, month and date
    * (`duckdb_date_struct`).
    */
  def duckdb_to_date(date: Ptr[duckdb_date_struct])(
      __return: Ptr[duckdb_date]
  ): Unit =
    __sn_wrap_duckdb_duckdb_to_date(date, __return)

  /** Re-compose a `duckdb_date` from year, month and date
    * (`duckdb_date_struct`).
    */
  def duckdb_to_date(date: duckdb_date_struct)(using Zone): duckdb_date =
    val __ptr_0: Ptr[duckdb_date] = alloc[duckdb_date](1)
    val __ptr_1: Ptr[duckdb_date_struct] = alloc[duckdb_date_struct](1)
    !(__ptr_1 + 0) = date
    __sn_wrap_duckdb_duckdb_to_date((__ptr_1 + 0), (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Re-compose a `duckdb_date` from year, month and date
    * (`duckdb_date_struct`).
    */
  def duckdb_to_date(date: Ptr[duckdb_date_struct])(using Zone): duckdb_date =
    val __ptr_0: Ptr[duckdb_date] = alloc[duckdb_date](1)
    __sn_wrap_duckdb_duckdb_to_date(date, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Re-compose a `duckdb_time` from hour, minute, second and microsecond
    * (`duckdb_time_struct`).
    */
  def duckdb_to_time(time: duckdb_time_struct)(using Zone): duckdb_time =
    val __ptr_0: Ptr[duckdb_time_struct] = alloc[duckdb_time_struct](1)
    val __ptr_1: Ptr[duckdb_time] = alloc[duckdb_time](1)
    !(__ptr_0 + 0) = time
    __sn_wrap_duckdb_duckdb_to_time((__ptr_0 + 0), (__ptr_1 + 0))
    !(__ptr_1 + 0)

  /** Re-compose a `duckdb_time` from hour, minute, second and microsecond
    * (`duckdb_time_struct`).
    */
  def duckdb_to_time(time: Ptr[duckdb_time_struct])(using Zone): duckdb_time =
    val __ptr_0: Ptr[duckdb_time] = alloc[duckdb_time](1)
    __sn_wrap_duckdb_duckdb_to_time(time, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Re-compose a `duckdb_time` from hour, minute, second and microsecond
    * (`duckdb_time_struct`).
    */
  def duckdb_to_time(time: Ptr[duckdb_time_struct])(
      __return: Ptr[duckdb_time]
  ): Unit =
    __sn_wrap_duckdb_duckdb_to_time(time, __return)

  /** Re-compose a `duckdb_timestamp` from a duckdb_timestamp_struct.
    */
  def duckdb_to_timestamp(ts: Ptr[duckdb_timestamp_struct])(using
      Zone
  ): duckdb_timestamp =
    val __ptr_0: Ptr[duckdb_timestamp] = alloc[duckdb_timestamp](1)
    __sn_wrap_duckdb_duckdb_to_timestamp(ts, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Re-compose a `duckdb_timestamp` from a duckdb_timestamp_struct.
    */
  def duckdb_to_timestamp(ts: Ptr[duckdb_timestamp_struct])(
      __return: Ptr[duckdb_timestamp]
  ): Unit =
    __sn_wrap_duckdb_duckdb_to_timestamp(ts, __return)

  /** Re-compose a `duckdb_timestamp` from a duckdb_timestamp_struct.
    */
  def duckdb_to_timestamp(ts: duckdb_timestamp_struct)(using
      Zone
  ): duckdb_timestamp =
    val __ptr_0: Ptr[duckdb_timestamp] = alloc[duckdb_timestamp](1)
    val __ptr_1: Ptr[duckdb_timestamp_struct] =
      alloc[duckdb_timestamp_struct](1)
    !(__ptr_1 + 0) = ts
    __sn_wrap_duckdb_duckdb_to_timestamp((__ptr_1 + 0), (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** returns: The duckdb_blob value at the specified location. Returns a blob
    * with blob.data set to nullptr if the value cannot be converted. The
    * resulting "blob.data" must be freed with `duckdb_free.`
    */
  def duckdb_value_blob(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      __return: Ptr[duckdb_blob]
  ): Unit =
    __sn_wrap_duckdb_duckdb_value_blob(result, col, row, __return)

  /** returns: The duckdb_blob value at the specified location. Returns a blob
    * with blob.data set to nullptr if the value cannot be converted. The
    * resulting "blob.data" must be freed with `duckdb_free.`
    */
  def duckdb_value_blob(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      using Zone
  ): duckdb_blob =
    val __ptr_0: Ptr[duckdb_blob] = alloc[duckdb_blob](1)
    __sn_wrap_duckdb_duckdb_value_blob(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** returns: The duckdb_date value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_date(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      using Zone
  ): duckdb_date =
    val __ptr_0: Ptr[duckdb_date] = alloc[duckdb_date](1)
    __sn_wrap_duckdb_duckdb_value_date(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** returns: The duckdb_date value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_date(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      __return: Ptr[duckdb_date]
  ): Unit =
    __sn_wrap_duckdb_duckdb_value_date(result, col, row, __return)

  /** returns: The duckdb_decimal value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_decimal(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      __return: Ptr[duckdb_decimal]
  ): Unit =
    __sn_wrap_duckdb_duckdb_value_decimal(result, col, row, __return)

  /** returns: The duckdb_decimal value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_decimal(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      using Zone
  ): duckdb_decimal =
    val __ptr_0: Ptr[duckdb_decimal] = alloc[duckdb_decimal](1)
    __sn_wrap_duckdb_duckdb_value_decimal(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** returns: The duckdb_hugeint value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_hugeint(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      using Zone
  ): duckdb_hugeint =
    val __ptr_0: Ptr[duckdb_hugeint] = alloc[duckdb_hugeint](1)
    __sn_wrap_duckdb_duckdb_value_hugeint(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** returns: The duckdb_hugeint value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_hugeint(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      __return: Ptr[duckdb_hugeint]
  ): Unit =
    __sn_wrap_duckdb_duckdb_value_hugeint(result, col, row, __return)

  /** returns: The duckdb_interval value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_interval(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      __return: Ptr[duckdb_interval]
  ): Unit =
    __sn_wrap_duckdb_duckdb_value_interval(result, col, row, __return)

  /** returns: The duckdb_interval value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_interval(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      using Zone
  ): duckdb_interval =
    val __ptr_0: Ptr[duckdb_interval] = alloc[duckdb_interval](1)
    __sn_wrap_duckdb_duckdb_value_interval(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** returns: The duckdb_time value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_time(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      using Zone
  ): duckdb_time =
    val __ptr_0: Ptr[duckdb_time] = alloc[duckdb_time](1)
    __sn_wrap_duckdb_duckdb_value_time(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** returns: The duckdb_time value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_time(result: Ptr[duckdb_result], col: idx_t, row: idx_t)(
      __return: Ptr[duckdb_time]
  ): Unit =
    __sn_wrap_duckdb_duckdb_value_time(result, col, row, __return)

  /** returns: The duckdb_timestamp value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_timestamp(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  )(using Zone): duckdb_timestamp =
    val __ptr_0: Ptr[duckdb_timestamp] = alloc[duckdb_timestamp](1)
    __sn_wrap_duckdb_duckdb_value_timestamp(result, col, row, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** returns: The duckdb_timestamp value at the specified location, or 0 if the
    * value cannot be converted.
    */
  def duckdb_value_timestamp(
      result: Ptr[duckdb_result],
      col: idx_t,
      row: idx_t
  )(__return: Ptr[duckdb_timestamp]): Unit =
    __sn_wrap_duckdb_duckdb_value_timestamp(result, col, row, __return)
end functions

object types:
  export _root_.duckdb.structs.*
  export _root_.duckdb.aliases.*
  export _root_.duckdb.enumerations.*

object all:
  export _root_.duckdb.enumerations.DUCKDB_TYPE
  export _root_.duckdb.enumerations.duckdb_state
  export _root_.duckdb.aliases.duckdb_appender
  export _root_.duckdb.aliases.duckdb_arrow
  export _root_.duckdb.aliases.duckdb_arrow_array
  export _root_.duckdb.aliases.duckdb_arrow_schema
  export _root_.duckdb.aliases.duckdb_bind_info
  export _root_.duckdb.aliases.duckdb_config
  export _root_.duckdb.aliases.duckdb_connection
  export _root_.duckdb.aliases.duckdb_data_chunk
  export _root_.duckdb.aliases.duckdb_database
  export _root_.duckdb.aliases.duckdb_delete_callback_t
  export _root_.duckdb.aliases.duckdb_function_info
  export _root_.duckdb.aliases.duckdb_init_info
  export _root_.duckdb.aliases.duckdb_logical_type
  export _root_.duckdb.aliases.duckdb_prepared_statement
  export _root_.duckdb.aliases.duckdb_replacement_callback_t
  export _root_.duckdb.aliases.duckdb_replacement_scan_info
  export _root_.duckdb.aliases.duckdb_table_function
  export _root_.duckdb.aliases.duckdb_table_function_bind_t
  export _root_.duckdb.aliases.duckdb_table_function_init_t
  export _root_.duckdb.aliases.duckdb_table_function_t
  export _root_.duckdb.aliases.duckdb_type
  export _root_.duckdb.aliases.duckdb_value
  export _root_.duckdb.aliases.duckdb_vector
  export _root_.duckdb.aliases.idx_t
  export _root_.duckdb.aliases.int16_t
  export _root_.duckdb.aliases.int32_t
  export _root_.duckdb.aliases.int64_t
  export _root_.duckdb.aliases.int8_t
  export _root_.duckdb.aliases.size_t
  export _root_.duckdb.aliases.uint16_t
  export _root_.duckdb.aliases.uint32_t
  export _root_.duckdb.aliases.uint64_t
  export _root_.duckdb.aliases.uint8_t
  export _root_.duckdb.structs.duckdb_blob
  export _root_.duckdb.structs.duckdb_column
  export _root_.duckdb.structs.duckdb_date
  export _root_.duckdb.structs.duckdb_date_struct
  export _root_.duckdb.structs.duckdb_decimal
  export _root_.duckdb.structs.duckdb_hugeint
  export _root_.duckdb.structs.duckdb_interval
  export _root_.duckdb.structs.duckdb_result
  export _root_.duckdb.structs.duckdb_time
  export _root_.duckdb.structs.duckdb_time_struct
  export _root_.duckdb.structs.duckdb_timestamp
  export _root_.duckdb.structs.duckdb_timestamp_struct
  export _root_.duckdb.functions.duckdb_add_replacement_scan
  export _root_.duckdb.functions.duckdb_append_blob
  export _root_.duckdb.functions.duckdb_append_bool
  export _root_.duckdb.functions.duckdb_append_data_chunk
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
  export _root_.duckdb.functions.duckdb_append_varchar
  export _root_.duckdb.functions.duckdb_append_varchar_length
  export _root_.duckdb.functions.duckdb_appender_begin_row
  export _root_.duckdb.functions.duckdb_appender_close
  export _root_.duckdb.functions.duckdb_appender_create
  export _root_.duckdb.functions.duckdb_appender_destroy
  export _root_.duckdb.functions.duckdb_appender_end_row
  export _root_.duckdb.functions.duckdb_appender_error
  export _root_.duckdb.functions.duckdb_appender_flush
  export _root_.duckdb.functions.duckdb_arrow_column_count
  export _root_.duckdb.functions.duckdb_arrow_row_count
  export _root_.duckdb.functions.duckdb_arrow_rows_changed
  export _root_.duckdb.functions.duckdb_bind_add_result_column
  export _root_.duckdb.functions.duckdb_bind_blob
  export _root_.duckdb.functions.duckdb_bind_boolean
  export _root_.duckdb.functions.duckdb_bind_double
  export _root_.duckdb.functions.duckdb_bind_float
  export _root_.duckdb.functions.duckdb_bind_get_extra_info
  export _root_.duckdb.functions.duckdb_bind_get_parameter
  export _root_.duckdb.functions.duckdb_bind_get_parameter_count
  export _root_.duckdb.functions.duckdb_bind_int16
  export _root_.duckdb.functions.duckdb_bind_int32
  export _root_.duckdb.functions.duckdb_bind_int64
  export _root_.duckdb.functions.duckdb_bind_int8
  export _root_.duckdb.functions.duckdb_bind_null
  export _root_.duckdb.functions.duckdb_bind_set_bind_data
  export _root_.duckdb.functions.duckdb_bind_set_error
  export _root_.duckdb.functions.duckdb_bind_uint16
  export _root_.duckdb.functions.duckdb_bind_uint32
  export _root_.duckdb.functions.duckdb_bind_uint64
  export _root_.duckdb.functions.duckdb_bind_uint8
  export _root_.duckdb.functions.duckdb_bind_varchar
  export _root_.duckdb.functions.duckdb_bind_varchar_length
  export _root_.duckdb.functions.duckdb_close
  export _root_.duckdb.functions.duckdb_column_count
  export _root_.duckdb.functions.duckdb_column_data
  export _root_.duckdb.functions.duckdb_column_logical_type
  export _root_.duckdb.functions.duckdb_column_name
  export _root_.duckdb.functions.duckdb_column_type
  export _root_.duckdb.functions.duckdb_config_count
  export _root_.duckdb.functions.duckdb_connect
  export _root_.duckdb.functions.duckdb_create_config
  export _root_.duckdb.functions.duckdb_create_data_chunk
  export _root_.duckdb.functions.duckdb_create_decimal_type
  export _root_.duckdb.functions.duckdb_create_int64
  export _root_.duckdb.functions.duckdb_create_list_type
  export _root_.duckdb.functions.duckdb_create_logical_type
  export _root_.duckdb.functions.duckdb_create_map_type
  export _root_.duckdb.functions.duckdb_create_table_function
  export _root_.duckdb.functions.duckdb_create_varchar
  export _root_.duckdb.functions.duckdb_create_varchar_length
  export _root_.duckdb.functions.duckdb_data_chunk_get_column_count
  export _root_.duckdb.functions.duckdb_data_chunk_get_size
  export _root_.duckdb.functions.duckdb_data_chunk_get_vector
  export _root_.duckdb.functions.duckdb_data_chunk_reset
  export _root_.duckdb.functions.duckdb_data_chunk_set_size
  export _root_.duckdb.functions.duckdb_decimal_internal_type
  export _root_.duckdb.functions.duckdb_decimal_scale
  export _root_.duckdb.functions.duckdb_decimal_width
  export _root_.duckdb.functions.duckdb_destroy_arrow
  export _root_.duckdb.functions.duckdb_destroy_config
  export _root_.duckdb.functions.duckdb_destroy_data_chunk
  export _root_.duckdb.functions.duckdb_destroy_logical_type
  export _root_.duckdb.functions.duckdb_destroy_prepare
  export _root_.duckdb.functions.duckdb_destroy_result
  export _root_.duckdb.functions.duckdb_destroy_table_function
  export _root_.duckdb.functions.duckdb_destroy_value
  export _root_.duckdb.functions.duckdb_disconnect
  export _root_.duckdb.functions.duckdb_enum_dictionary_size
  export _root_.duckdb.functions.duckdb_enum_dictionary_value
  export _root_.duckdb.functions.duckdb_enum_internal_type
  export _root_.duckdb.functions.duckdb_execute_prepared
  export _root_.duckdb.functions.duckdb_execute_prepared_arrow
  export _root_.duckdb.functions.duckdb_execute_tasks
  export _root_.duckdb.functions.duckdb_free
  export _root_.duckdb.functions.duckdb_function_get_bind_data
  export _root_.duckdb.functions.duckdb_function_get_extra_info
  export _root_.duckdb.functions.duckdb_function_get_init_data
  export _root_.duckdb.functions.duckdb_function_set_error
  export _root_.duckdb.functions.duckdb_get_config_flag
  export _root_.duckdb.functions.duckdb_get_int64
  export _root_.duckdb.functions.duckdb_get_type_id
  export _root_.duckdb.functions.duckdb_get_varchar
  export _root_.duckdb.functions.duckdb_init_get_bind_data
  export _root_.duckdb.functions.duckdb_init_get_column_count
  export _root_.duckdb.functions.duckdb_init_get_column_index
  export _root_.duckdb.functions.duckdb_init_get_extra_info
  export _root_.duckdb.functions.duckdb_init_set_error
  export _root_.duckdb.functions.duckdb_init_set_init_data
  export _root_.duckdb.functions.duckdb_list_type_child_type
  export _root_.duckdb.functions.duckdb_list_vector_get_child
  export _root_.duckdb.functions.duckdb_list_vector_get_size
  export _root_.duckdb.functions.duckdb_malloc
  export _root_.duckdb.functions.duckdb_map_type_key_type
  export _root_.duckdb.functions.duckdb_map_type_value_type
  export _root_.duckdb.functions.duckdb_nparams
  export _root_.duckdb.functions.duckdb_nullmask_data
  export _root_.duckdb.functions.duckdb_open
  export _root_.duckdb.functions.duckdb_open_ext
  export _root_.duckdb.functions.duckdb_param_type
  export _root_.duckdb.functions.duckdb_prepare
  export _root_.duckdb.functions.duckdb_prepare_error
  export _root_.duckdb.functions.duckdb_query
  export _root_.duckdb.functions.duckdb_query_arrow
  export _root_.duckdb.functions.duckdb_query_arrow_array
  export _root_.duckdb.functions.duckdb_query_arrow_error
  export _root_.duckdb.functions.duckdb_query_arrow_schema
  export _root_.duckdb.functions.duckdb_register_table_function
  export _root_.duckdb.functions.duckdb_replacement_scan_add_parameter
  export _root_.duckdb.functions.duckdb_replacement_scan_set_function_name
  export _root_.duckdb.functions.duckdb_result_error
  export _root_.duckdb.functions.duckdb_row_count
  export _root_.duckdb.functions.duckdb_rows_changed
  export _root_.duckdb.functions.duckdb_set_config
  export _root_.duckdb.functions.duckdb_struct_type_child_count
  export _root_.duckdb.functions.duckdb_struct_type_child_name
  export _root_.duckdb.functions.duckdb_struct_type_child_type
  export _root_.duckdb.functions.duckdb_struct_vector_get_child
  export _root_.duckdb.functions.duckdb_table_function_add_parameter
  export _root_.duckdb.functions.duckdb_table_function_set_bind
  export _root_.duckdb.functions.duckdb_table_function_set_extra_info
  export _root_.duckdb.functions.duckdb_table_function_set_function
  export _root_.duckdb.functions.duckdb_table_function_set_init
  export _root_.duckdb.functions.duckdb_table_function_set_name
  export _root_.duckdb.functions.duckdb_table_function_supports_projection_pushdown
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
  export _root_.duckdb.functions.duckdb_value_uint16
  export _root_.duckdb.functions.duckdb_value_uint32
  export _root_.duckdb.functions.duckdb_value_uint64
  export _root_.duckdb.functions.duckdb_value_uint8
  export _root_.duckdb.functions.duckdb_value_varchar
  export _root_.duckdb.functions.duckdb_value_varchar_internal
  export _root_.duckdb.functions.duckdb_vector_assign_string_element
  export _root_.duckdb.functions.duckdb_vector_assign_string_element_len
  export _root_.duckdb.functions.duckdb_vector_ensure_validity_writable
  export _root_.duckdb.functions.duckdb_vector_get_column_type
  export _root_.duckdb.functions.duckdb_vector_get_data
  export _root_.duckdb.functions.duckdb_vector_get_validity
  export _root_.duckdb.functions.duckdb_vector_size
  export _root_.duckdb.functions.duckdb_append_date
  export _root_.duckdb.functions.duckdb_append_hugeint
  export _root_.duckdb.functions.duckdb_append_interval
  export _root_.duckdb.functions.duckdb_append_time
  export _root_.duckdb.functions.duckdb_append_timestamp
  export _root_.duckdb.functions.duckdb_bind_date
  export _root_.duckdb.functions.duckdb_bind_hugeint
  export _root_.duckdb.functions.duckdb_bind_interval
  export _root_.duckdb.functions.duckdb_bind_time
  export _root_.duckdb.functions.duckdb_bind_timestamp
  export _root_.duckdb.functions.duckdb_decimal_to_double
  export _root_.duckdb.functions.duckdb_double_to_hugeint
  export _root_.duckdb.functions.duckdb_from_date
  export _root_.duckdb.functions.duckdb_from_time
  export _root_.duckdb.functions.duckdb_from_timestamp
  export _root_.duckdb.functions.duckdb_hugeint_to_double
  export _root_.duckdb.functions.duckdb_result_chunk_count
  export _root_.duckdb.functions.duckdb_result_get_chunk
  export _root_.duckdb.functions.duckdb_to_date
  export _root_.duckdb.functions.duckdb_to_time
  export _root_.duckdb.functions.duckdb_to_timestamp
  export _root_.duckdb.functions.duckdb_value_blob
  export _root_.duckdb.functions.duckdb_value_date
  export _root_.duckdb.functions.duckdb_value_decimal
  export _root_.duckdb.functions.duckdb_value_hugeint
  export _root_.duckdb.functions.duckdb_value_interval
  export _root_.duckdb.functions.duckdb_value_time
  export _root_.duckdb.functions.duckdb_value_timestamp
end all
