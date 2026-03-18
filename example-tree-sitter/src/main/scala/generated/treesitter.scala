package treesitter

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
    private[treesitter] trait _BindgenEnumCUnsignedInt[T](using eq: T =:= CUnsignedInt):
      given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
      extension (inline t: T)
        inline def value: CUnsignedInt = t.asInstanceOf[CUnsignedInt]
        inline def int: CInt = value.toInt
        inline def uint: CUnsignedInt = value


object enumerations:
  import predef.*
  opaque type TSInputEncoding = CUnsignedInt
  object TSInputEncoding extends _BindgenEnumCUnsignedInt[TSInputEncoding]:
    given _tag: Tag[TSInputEncoding] = Tag.UInt
    inline def define(inline a: Long): TSInputEncoding = a.toUInt
    val TSInputEncodingUTF8 = define(0)
    val TSInputEncodingUTF16LE = define(1)
    val TSInputEncodingUTF16BE = define(2)
    val TSInputEncodingCustom = define(3)
    def getName(value: TSInputEncoding): Option[String] =
      value match
        case `TSInputEncodingUTF8` => Some("TSInputEncodingUTF8")
        case `TSInputEncodingUTF16LE` => Some("TSInputEncodingUTF16LE")
        case `TSInputEncodingUTF16BE` => Some("TSInputEncodingUTF16BE")
        case `TSInputEncodingCustom` => Some("TSInputEncodingCustom")
        case _ => _root_.scala.None
    extension (a: TSInputEncoding)
      inline def &(b: TSInputEncoding): TSInputEncoding = a & b
      inline def |(b: TSInputEncoding): TSInputEncoding = a | b
      inline def is(b: TSInputEncoding): Boolean = (a & b) == b

  opaque type TSLogType = CUnsignedInt
  object TSLogType extends _BindgenEnumCUnsignedInt[TSLogType]:
    given _tag: Tag[TSLogType] = Tag.UInt
    inline def define(inline a: Long): TSLogType = a.toUInt
    val TSLogTypeParse = define(0)
    val TSLogTypeLex = define(1)
    def getName(value: TSLogType): Option[String] =
      value match
        case `TSLogTypeParse` => Some("TSLogTypeParse")
        case `TSLogTypeLex` => Some("TSLogTypeLex")
        case _ => _root_.scala.None
    extension (a: TSLogType)
      inline def &(b: TSLogType): TSLogType = a & b
      inline def |(b: TSLogType): TSLogType = a | b
      inline def is(b: TSLogType): Boolean = (a & b) == b

  opaque type TSQuantifier = CUnsignedInt
  object TSQuantifier extends _BindgenEnumCUnsignedInt[TSQuantifier]:
    given _tag: Tag[TSQuantifier] = Tag.UInt
    inline def define(inline a: Long): TSQuantifier = a.toUInt
    val TSQuantifierZero = define(0)
    val TSQuantifierZeroOrOne = define(1)
    val TSQuantifierZeroOrMore = define(2)
    val TSQuantifierOne = define(3)
    val TSQuantifierOneOrMore = define(4)
    def getName(value: TSQuantifier): Option[String] =
      value match
        case `TSQuantifierZero` => Some("TSQuantifierZero")
        case `TSQuantifierZeroOrOne` => Some("TSQuantifierZeroOrOne")
        case `TSQuantifierZeroOrMore` => Some("TSQuantifierZeroOrMore")
        case `TSQuantifierOne` => Some("TSQuantifierOne")
        case `TSQuantifierOneOrMore` => Some("TSQuantifierOneOrMore")
        case _ => _root_.scala.None
    extension (a: TSQuantifier)
      inline def &(b: TSQuantifier): TSQuantifier = a & b
      inline def |(b: TSQuantifier): TSQuantifier = a | b
      inline def is(b: TSQuantifier): Boolean = (a & b) == b

  opaque type TSQueryError = CUnsignedInt
  object TSQueryError extends _BindgenEnumCUnsignedInt[TSQueryError]:
    given _tag: Tag[TSQueryError] = Tag.UInt
    inline def define(inline a: Long): TSQueryError = a.toUInt
    val TSQueryErrorNone = define(0)
    val TSQueryErrorSyntax = define(1)
    val TSQueryErrorNodeType = define(2)
    val TSQueryErrorField = define(3)
    val TSQueryErrorCapture = define(4)
    val TSQueryErrorStructure = define(5)
    val TSQueryErrorLanguage = define(6)
    def getName(value: TSQueryError): Option[String] =
      value match
        case `TSQueryErrorNone` => Some("TSQueryErrorNone")
        case `TSQueryErrorSyntax` => Some("TSQueryErrorSyntax")
        case `TSQueryErrorNodeType` => Some("TSQueryErrorNodeType")
        case `TSQueryErrorField` => Some("TSQueryErrorField")
        case `TSQueryErrorCapture` => Some("TSQueryErrorCapture")
        case `TSQueryErrorStructure` => Some("TSQueryErrorStructure")
        case `TSQueryErrorLanguage` => Some("TSQueryErrorLanguage")
        case _ => _root_.scala.None
    extension (a: TSQueryError)
      inline def &(b: TSQueryError): TSQueryError = a & b
      inline def |(b: TSQueryError): TSQueryError = a | b
      inline def is(b: TSQueryError): Boolean = (a & b) == b

  opaque type TSQueryPredicateStepType = CUnsignedInt
  object TSQueryPredicateStepType extends _BindgenEnumCUnsignedInt[TSQueryPredicateStepType]:
    given _tag: Tag[TSQueryPredicateStepType] = Tag.UInt
    inline def define(inline a: Long): TSQueryPredicateStepType = a.toUInt
    val TSQueryPredicateStepTypeDone = define(0)
    val TSQueryPredicateStepTypeCapture = define(1)
    val TSQueryPredicateStepTypeString = define(2)
    def getName(value: TSQueryPredicateStepType): Option[String] =
      value match
        case `TSQueryPredicateStepTypeDone` => Some("TSQueryPredicateStepTypeDone")
        case `TSQueryPredicateStepTypeCapture` => Some("TSQueryPredicateStepTypeCapture")
        case `TSQueryPredicateStepTypeString` => Some("TSQueryPredicateStepTypeString")
        case _ => _root_.scala.None
    extension (a: TSQueryPredicateStepType)
      inline def &(b: TSQueryPredicateStepType): TSQueryPredicateStepType = a & b
      inline def |(b: TSQueryPredicateStepType): TSQueryPredicateStepType = a | b
      inline def is(b: TSQueryPredicateStepType): Boolean = (a & b) == b

  opaque type TSSymbolType = CUnsignedInt
  object TSSymbolType extends _BindgenEnumCUnsignedInt[TSSymbolType]:
    given _tag: Tag[TSSymbolType] = Tag.UInt
    inline def define(inline a: Long): TSSymbolType = a.toUInt
    val TSSymbolTypeRegular = define(0)
    val TSSymbolTypeAnonymous = define(1)
    val TSSymbolTypeSupertype = define(2)
    val TSSymbolTypeAuxiliary = define(3)
    def getName(value: TSSymbolType): Option[String] =
      value match
        case `TSSymbolTypeRegular` => Some("TSSymbolTypeRegular")
        case `TSSymbolTypeAnonymous` => Some("TSSymbolTypeAnonymous")
        case `TSSymbolTypeSupertype` => Some("TSSymbolTypeSupertype")
        case `TSSymbolTypeAuxiliary` => Some("TSSymbolTypeAuxiliary")
        case _ => _root_.scala.None
    extension (a: TSSymbolType)
      inline def &(b: TSSymbolType): TSSymbolType = a & b
      inline def |(b: TSSymbolType): TSSymbolType = a | b
      inline def is(b: TSSymbolType): Boolean = (a & b) == b

  opaque type TSWasmErrorKind = CUnsignedInt
  object TSWasmErrorKind extends _BindgenEnumCUnsignedInt[TSWasmErrorKind]:
    given _tag: Tag[TSWasmErrorKind] = Tag.UInt
    inline def define(inline a: Long): TSWasmErrorKind = a.toUInt
    val TSWasmErrorKindNone = define(0)
    val TSWasmErrorKindParse = define(1)
    val TSWasmErrorKindCompile = define(2)
    val TSWasmErrorKindInstantiate = define(3)
    val TSWasmErrorKindAllocate = define(4)
    def getName(value: TSWasmErrorKind): Option[String] =
      value match
        case `TSWasmErrorKindNone` => Some("TSWasmErrorKindNone")
        case `TSWasmErrorKindParse` => Some("TSWasmErrorKindParse")
        case `TSWasmErrorKindCompile` => Some("TSWasmErrorKindCompile")
        case `TSWasmErrorKindInstantiate` => Some("TSWasmErrorKindInstantiate")
        case `TSWasmErrorKindAllocate` => Some("TSWasmErrorKindAllocate")
        case _ => _root_.scala.None
    extension (a: TSWasmErrorKind)
      inline def &(b: TSWasmErrorKind): TSWasmErrorKind = a & b
      inline def |(b: TSWasmErrorKind): TSWasmErrorKind = a | b
      inline def is(b: TSWasmErrorKind): Boolean = (a & b) == b

object aliases:
  import _root_.treesitter.predef.*
  import _root_.treesitter.enumerations.*
  import _root_.treesitter.aliases.*
  import _root_.treesitter.structs.*
  type DecodeFunction = TSDecodeFunction
  object DecodeFunction:
    given _tag: Tag[DecodeFunction] = TSDecodeFunction._tag
    inline def apply(inline o: TSDecodeFunction): DecodeFunction = o
    extension (v: DecodeFunction)
      inline def value: TSDecodeFunction = v

  opaque type TSDecodeFunction = CFuncPtr3[Ptr[uint8_t], uint32_t, Ptr[int32_t], uint32_t]
  object TSDecodeFunction:
    given _tag: Tag[TSDecodeFunction] = Tag.materializeCFuncPtr3[Ptr[uint8_t], uint32_t, Ptr[int32_t], uint32_t]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): TSDecodeFunction = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr3[Ptr[uint8_t], uint32_t, Ptr[int32_t], uint32_t]): TSDecodeFunction = o
    extension (v: TSDecodeFunction)
      inline def value: CFuncPtr3[Ptr[uint8_t], uint32_t, Ptr[int32_t], uint32_t] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  type TSFieldId = uint16_t
  object TSFieldId:
    given _tag: Tag[TSFieldId] = uint16_t._tag
    inline def apply(inline o: uint16_t): TSFieldId = o
    extension (v: TSFieldId)
      inline def value: uint16_t = v

  /**
   * ****************
  */
  type TSStateId = uint16_t
  object TSStateId:
    given _tag: Tag[TSStateId] = uint16_t._tag
    inline def apply(inline o: uint16_t): TSStateId = o
    extension (v: TSStateId)
      inline def value: uint16_t = v

  type TSSymbol = uint16_t
  object TSSymbol:
    given _tag: Tag[TSSymbol] = uint16_t._tag
    inline def apply(inline o: uint16_t): TSSymbol = o
    extension (v: TSSymbol)
      inline def value: uint16_t = v

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

  type uint8_t = scala.scalanative.unsigned.UByte
  object uint8_t:
    val _tag: Tag[uint8_t] = summon[Tag[scala.scalanative.unsigned.UByte]]
    inline def apply(inline o: scala.scalanative.unsigned.UByte): uint8_t = o
    extension (v: uint8_t)
      inline def value: scala.scalanative.unsigned.UByte = v

object structs:
  import _root_.treesitter.predef.*
  import _root_.treesitter.enumerations.*
  import _root_.treesitter.aliases.*
  import _root_.treesitter.structs.*

  opaque type TSInput = CStruct4[Ptr[Byte], CFuncPtr4[Ptr[Byte], uint32_t, TSPoint, Ptr[uint32_t], CString], TSInputEncoding, TSDecodeFunction]
  
  object TSInput:
    given _tag: Tag[TSInput] = Tag.materializeCStruct4Tag[Ptr[Byte], CFuncPtr4[Ptr[Byte], uint32_t, TSPoint, Ptr[uint32_t], CString], TSInputEncoding, TSDecodeFunction]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSInput)
        inline def payload : Ptr[Byte] = struct._1
        inline def payload_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def read : CFuncPtr4[Ptr[Byte], uint32_t, TSPoint, Ptr[uint32_t], CString] = struct._2
        inline def read_=(value: CFuncPtr4[Ptr[Byte], uint32_t, TSPoint, Ptr[uint32_t], CString]): Unit = (!struct.at2 = value)
        inline def encoding : TSInputEncoding = struct._3
        inline def encoding_=(value: TSInputEncoding): Unit = (!struct.at3 = value)
        inline def decode : TSDecodeFunction = struct._4
        inline def decode_=(value: TSDecodeFunction): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates TSInput on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSInput] = scala.scalanative.unsafe.alloc[TSInput](1)
    def apply(payload : Ptr[Byte], read : CFuncPtr4[Ptr[Byte], uint32_t, TSPoint, Ptr[uint32_t], CString], encoding : TSInputEncoding, decode : TSDecodeFunction)(using Zone): Ptr[TSInput] =
      val ____ptr = apply()
      (!____ptr).payload = payload
      (!____ptr).read = read
      (!____ptr).encoding = encoding
      (!____ptr).decode = decode
      ____ptr
    
    

  opaque type TSInputEdit = CStruct6[uint32_t, uint32_t, uint32_t, TSPoint, TSPoint, TSPoint]
  
  object TSInputEdit:
    given _tag: Tag[TSInputEdit] = Tag.materializeCStruct6Tag[uint32_t, uint32_t, uint32_t, TSPoint, TSPoint, TSPoint]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSInputEdit)
        inline def start_byte : uint32_t = struct._1
        inline def start_byte_=(value: uint32_t): Unit = (!struct.at1 = value)
        inline def old_end_byte : uint32_t = struct._2
        inline def old_end_byte_=(value: uint32_t): Unit = (!struct.at2 = value)
        inline def new_end_byte : uint32_t = struct._3
        inline def new_end_byte_=(value: uint32_t): Unit = (!struct.at3 = value)
        inline def start_point : TSPoint = struct._4
        inline def start_point_=(value: TSPoint): Unit = (!struct.at4 = value)
        inline def old_end_point : TSPoint = struct._5
        inline def old_end_point_=(value: TSPoint): Unit = (!struct.at5 = value)
        inline def new_end_point : TSPoint = struct._6
        inline def new_end_point_=(value: TSPoint): Unit = (!struct.at6 = value)
      end extension
    
    // Allocates TSInputEdit on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSInputEdit] = scala.scalanative.unsafe.alloc[TSInputEdit](1)
    def apply(start_byte : uint32_t, old_end_byte : uint32_t, new_end_byte : uint32_t, start_point : TSPoint, old_end_point : TSPoint, new_end_point : TSPoint)(using Zone): Ptr[TSInputEdit] =
      val ____ptr = apply()
      (!____ptr).start_byte = start_byte
      (!____ptr).old_end_byte = old_end_byte
      (!____ptr).new_end_byte = new_end_byte
      (!____ptr).start_point = start_point
      (!____ptr).old_end_point = old_end_point
      (!____ptr).new_end_point = new_end_point
      ____ptr
    
    

  opaque type TSLanguage = CStruct0
  
  object TSLanguage:
    given _tag: Tag[TSLanguage] = Tag.materializeCStruct0Tag
    

  /**
   * The metadata associated with a language.
  */
  opaque type TSLanguageMetadata = CStruct3[uint8_t, uint8_t, uint8_t]
  
  object TSLanguageMetadata:
    given _tag: Tag[TSLanguageMetadata] = Tag.materializeCStruct3Tag[uint8_t, uint8_t, uint8_t]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSLanguageMetadata)
        inline def major_version : uint8_t = struct._1
        inline def major_version_=(value: uint8_t): Unit = (!struct.at1 = value)
        inline def minor_version : uint8_t = struct._2
        inline def minor_version_=(value: uint8_t): Unit = (!struct.at2 = value)
        inline def patch_version : uint8_t = struct._3
        inline def patch_version_=(value: uint8_t): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates TSLanguageMetadata on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSLanguageMetadata] = scala.scalanative.unsafe.alloc[TSLanguageMetadata](1)
    def apply(major_version : uint8_t, minor_version : uint8_t, patch_version : uint8_t)(using Zone): Ptr[TSLanguageMetadata] =
      val ____ptr = apply()
      (!____ptr).major_version = major_version
      (!____ptr).minor_version = minor_version
      (!____ptr).patch_version = patch_version
      ____ptr
    
    

  opaque type TSLogger = CStruct2[Ptr[Byte], CFuncPtr3[Ptr[Byte], TSLogType, CString, Unit]]
  
  object TSLogger:
    given _tag: Tag[TSLogger] = Tag.materializeCStruct2Tag[Ptr[Byte], CFuncPtr3[Ptr[Byte], TSLogType, CString, Unit]]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSLogger)
        inline def payload : Ptr[Byte] = struct._1
        inline def payload_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def log : CFuncPtr3[Ptr[Byte], TSLogType, CString, Unit] = struct._2
        inline def log_=(value: CFuncPtr3[Ptr[Byte], TSLogType, CString, Unit]): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates TSLogger on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSLogger] = scala.scalanative.unsafe.alloc[TSLogger](1)
    def apply(payload : Ptr[Byte], log : CFuncPtr3[Ptr[Byte], TSLogType, CString, Unit])(using Zone): Ptr[TSLogger] =
      val ____ptr = apply()
      (!____ptr).payload = payload
      (!____ptr).log = log
      ____ptr
    
    

  opaque type TSLookaheadIterator = CStruct0
  
  object TSLookaheadIterator:
    given _tag: Tag[TSLookaheadIterator] = Tag.materializeCStruct0Tag
    

  opaque type TSNode = CStruct3[CArray[uint32_t, Nat._4], Ptr[Byte], Ptr[TSTree]]
  
  object TSNode:
    given _tag: Tag[TSNode] = Tag.materializeCStruct3Tag[CArray[uint32_t, Nat._4], Ptr[Byte], Ptr[TSTree]]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSNode)
        inline def context : CArray[uint32_t, Nat._4] = struct._1
        inline def context_=(value: CArray[uint32_t, Nat._4]): Unit = (!struct.at1 = value)
        inline def id : Ptr[Byte] = struct._2
        inline def id_=(value: Ptr[Byte]): Unit = (!struct.at2 = value)
        inline def tree : Ptr[TSTree] = struct._3
        inline def tree_=(value: Ptr[TSTree]): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates TSNode on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSNode] = scala.scalanative.unsafe.alloc[TSNode](1)
    def apply(context : CArray[uint32_t, Nat._4], id : Ptr[Byte], tree : Ptr[TSTree])(using Zone): Ptr[TSNode] =
      val ____ptr = apply()
      (!____ptr).context = context
      (!____ptr).id = id
      (!____ptr).tree = tree
      ____ptr
    
    

  opaque type TSParseOptions = CStruct2[Ptr[Byte], CFuncPtr1[Ptr[TSParseState], Boolean]]
  
  object TSParseOptions:
    given _tag: Tag[TSParseOptions] = Tag.materializeCStruct2Tag[Ptr[Byte], CFuncPtr1[Ptr[TSParseState], Boolean]]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSParseOptions)
        inline def payload : Ptr[Byte] = struct._1
        inline def payload_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def progress_callback : CFuncPtr1[Ptr[TSParseState], Boolean] = struct._2
        inline def progress_callback_=(value: CFuncPtr1[Ptr[TSParseState], Boolean]): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates TSParseOptions on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSParseOptions] = scala.scalanative.unsafe.alloc[TSParseOptions](1)
    def apply(payload : Ptr[Byte], progress_callback : CFuncPtr1[Ptr[TSParseState], Boolean])(using Zone): Ptr[TSParseOptions] =
      val ____ptr = apply()
      (!____ptr).payload = payload
      (!____ptr).progress_callback = progress_callback
      ____ptr
    
    

  opaque type TSParseState = CStruct3[Ptr[Byte], uint32_t, Boolean]
  
  object TSParseState:
    given _tag: Tag[TSParseState] = Tag.materializeCStruct3Tag[Ptr[Byte], uint32_t, Boolean]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSParseState)
        inline def payload : Ptr[Byte] = struct._1
        inline def payload_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def current_byte_offset : uint32_t = struct._2
        inline def current_byte_offset_=(value: uint32_t): Unit = (!struct.at2 = value)
        inline def has_error : Boolean = struct._3
        inline def has_error_=(value: Boolean): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates TSParseState on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSParseState] = scala.scalanative.unsafe.alloc[TSParseState](1)
    def apply(payload : Ptr[Byte], current_byte_offset : uint32_t, has_error : Boolean)(using Zone): Ptr[TSParseState] =
      val ____ptr = apply()
      (!____ptr).payload = payload
      (!____ptr).current_byte_offset = current_byte_offset
      (!____ptr).has_error = has_error
      ____ptr
    
    

  opaque type TSParser = CStruct0
  
  object TSParser:
    given _tag: Tag[TSParser] = Tag.materializeCStruct0Tag
    

  opaque type TSPoint = CStruct2[uint32_t, uint32_t]
  
  object TSPoint:
    given _tag: Tag[TSPoint] = Tag.materializeCStruct2Tag[uint32_t, uint32_t]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSPoint)
        inline def row : uint32_t = struct._1
        inline def row_=(value: uint32_t): Unit = (!struct.at1 = value)
        inline def column : uint32_t = struct._2
        inline def column_=(value: uint32_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates TSPoint on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSPoint] = scala.scalanative.unsafe.alloc[TSPoint](1)
    def apply(row : uint32_t, column : uint32_t)(using Zone): Ptr[TSPoint] =
      val ____ptr = apply()
      (!____ptr).row = row
      (!____ptr).column = column
      ____ptr
    
    

  opaque type TSQuery = CStruct0
  
  object TSQuery:
    given _tag: Tag[TSQuery] = Tag.materializeCStruct0Tag
    

  opaque type TSQueryCapture = CStruct2[TSNode, uint32_t]
  
  object TSQueryCapture:
    given _tag: Tag[TSQueryCapture] = Tag.materializeCStruct2Tag[TSNode, uint32_t]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSQueryCapture)
        inline def node : TSNode = struct._1
        inline def node_=(value: TSNode): Unit = (!struct.at1 = value)
        inline def index : uint32_t = struct._2
        inline def index_=(value: uint32_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates TSQueryCapture on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSQueryCapture] = scala.scalanative.unsafe.alloc[TSQueryCapture](1)
    def apply(node : TSNode, index : uint32_t)(using Zone): Ptr[TSQueryCapture] =
      val ____ptr = apply()
      (!____ptr).node = node
      (!____ptr).index = index
      ____ptr
    
    

  opaque type TSQueryCursor = CStruct0
  
  object TSQueryCursor:
    given _tag: Tag[TSQueryCursor] = Tag.materializeCStruct0Tag
    

  opaque type TSQueryCursorOptions = CStruct2[Ptr[Byte], CFuncPtr1[Ptr[TSQueryCursorState], Boolean]]
  
  object TSQueryCursorOptions:
    given _tag: Tag[TSQueryCursorOptions] = Tag.materializeCStruct2Tag[Ptr[Byte], CFuncPtr1[Ptr[TSQueryCursorState], Boolean]]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSQueryCursorOptions)
        inline def payload : Ptr[Byte] = struct._1
        inline def payload_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def progress_callback : CFuncPtr1[Ptr[TSQueryCursorState], Boolean] = struct._2
        inline def progress_callback_=(value: CFuncPtr1[Ptr[TSQueryCursorState], Boolean]): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates TSQueryCursorOptions on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSQueryCursorOptions] = scala.scalanative.unsafe.alloc[TSQueryCursorOptions](1)
    def apply(payload : Ptr[Byte], progress_callback : CFuncPtr1[Ptr[TSQueryCursorState], Boolean])(using Zone): Ptr[TSQueryCursorOptions] =
      val ____ptr = apply()
      (!____ptr).payload = payload
      (!____ptr).progress_callback = progress_callback
      ____ptr
    
    

  opaque type TSQueryCursorState = CStruct2[Ptr[Byte], uint32_t]
  
  object TSQueryCursorState:
    given _tag: Tag[TSQueryCursorState] = Tag.materializeCStruct2Tag[Ptr[Byte], uint32_t]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSQueryCursorState)
        inline def payload : Ptr[Byte] = struct._1
        inline def payload_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def current_byte_offset : uint32_t = struct._2
        inline def current_byte_offset_=(value: uint32_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates TSQueryCursorState on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSQueryCursorState] = scala.scalanative.unsafe.alloc[TSQueryCursorState](1)
    def apply(payload : Ptr[Byte], current_byte_offset : uint32_t)(using Zone): Ptr[TSQueryCursorState] =
      val ____ptr = apply()
      (!____ptr).payload = payload
      (!____ptr).current_byte_offset = current_byte_offset
      ____ptr
    
    

  opaque type TSQueryMatch = CStruct4[uint32_t, uint16_t, uint16_t, Ptr[TSQueryCapture]]
  
  object TSQueryMatch:
    given _tag: Tag[TSQueryMatch] = Tag.materializeCStruct4Tag[uint32_t, uint16_t, uint16_t, Ptr[TSQueryCapture]]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSQueryMatch)
        inline def id : uint32_t = struct._1
        inline def id_=(value: uint32_t): Unit = (!struct.at1 = value)
        inline def pattern_index : uint16_t = struct._2
        inline def pattern_index_=(value: uint16_t): Unit = (!struct.at2 = value)
        inline def capture_count : uint16_t = struct._3
        inline def capture_count_=(value: uint16_t): Unit = (!struct.at3 = value)
        inline def captures : Ptr[TSQueryCapture] = struct._4
        inline def captures_=(value: Ptr[TSQueryCapture]): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates TSQueryMatch on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSQueryMatch] = scala.scalanative.unsafe.alloc[TSQueryMatch](1)
    def apply(id : uint32_t, pattern_index : uint16_t, capture_count : uint16_t, captures : Ptr[TSQueryCapture])(using Zone): Ptr[TSQueryMatch] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).pattern_index = pattern_index
      (!____ptr).capture_count = capture_count
      (!____ptr).captures = captures
      ____ptr
    
    

  opaque type TSQueryPredicateStep = CStruct2[TSQueryPredicateStepType, uint32_t]
  
  object TSQueryPredicateStep:
    given _tag: Tag[TSQueryPredicateStep] = Tag.materializeCStruct2Tag[TSQueryPredicateStepType, uint32_t]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSQueryPredicateStep)
        inline def `type` : TSQueryPredicateStepType = struct._1
        inline def type_=(value: TSQueryPredicateStepType): Unit = (!struct.at1 = value)
        inline def value_id : uint32_t = struct._2
        inline def value_id_=(value: uint32_t): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates TSQueryPredicateStep on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSQueryPredicateStep] = scala.scalanative.unsafe.alloc[TSQueryPredicateStep](1)
    def apply(`type` : TSQueryPredicateStepType, value_id : uint32_t)(using Zone): Ptr[TSQueryPredicateStep] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).value_id = value_id
      ____ptr
    
    

  opaque type TSRange = CStruct4[TSPoint, TSPoint, uint32_t, uint32_t]
  
  object TSRange:
    given _tag: Tag[TSRange] = Tag.materializeCStruct4Tag[TSPoint, TSPoint, uint32_t, uint32_t]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSRange)
        inline def start_point : TSPoint = struct._1
        inline def start_point_=(value: TSPoint): Unit = (!struct.at1 = value)
        inline def end_point : TSPoint = struct._2
        inline def end_point_=(value: TSPoint): Unit = (!struct.at2 = value)
        inline def start_byte : uint32_t = struct._3
        inline def start_byte_=(value: uint32_t): Unit = (!struct.at3 = value)
        inline def end_byte : uint32_t = struct._4
        inline def end_byte_=(value: uint32_t): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates TSRange on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSRange] = scala.scalanative.unsafe.alloc[TSRange](1)
    def apply(start_point : TSPoint, end_point : TSPoint, start_byte : uint32_t, end_byte : uint32_t)(using Zone): Ptr[TSRange] =
      val ____ptr = apply()
      (!____ptr).start_point = start_point
      (!____ptr).end_point = end_point
      (!____ptr).start_byte = start_byte
      (!____ptr).end_byte = end_byte
      ____ptr
    
    

  opaque type TSTree = CStruct0
  
  object TSTree:
    given _tag: Tag[TSTree] = Tag.materializeCStruct0Tag
    

  opaque type TSTreeCursor = CStruct3[Ptr[Byte], Ptr[Byte], CArray[uint32_t, Nat._3]]
  
  object TSTreeCursor:
    given _tag: Tag[TSTreeCursor] = Tag.materializeCStruct3Tag[Ptr[Byte], Ptr[Byte], CArray[uint32_t, Nat._3]]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSTreeCursor)
        inline def tree : Ptr[Byte] = struct._1
        inline def tree_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def id : Ptr[Byte] = struct._2
        inline def id_=(value: Ptr[Byte]): Unit = (!struct.at2 = value)
        inline def context : CArray[uint32_t, Nat._3] = struct._3
        inline def context_=(value: CArray[uint32_t, Nat._3]): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates TSTreeCursor on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSTreeCursor] = scala.scalanative.unsafe.alloc[TSTreeCursor](1)
    def apply(tree : Ptr[Byte], id : Ptr[Byte], context : CArray[uint32_t, Nat._3])(using Zone): Ptr[TSTreeCursor] =
      val ____ptr = apply()
      (!____ptr).tree = tree
      (!____ptr).id = id
      (!____ptr).context = context
      ____ptr
    
    

  opaque type TSWasmEngine = CStruct0
  
  object TSWasmEngine:
    given _tag: Tag[TSWasmEngine] = Tag.materializeCStruct0Tag
    

  opaque type TSWasmError = CStruct2[TSWasmErrorKind, CString]
  
  object TSWasmError:
    given _tag: Tag[TSWasmError] = Tag.materializeCStruct2Tag[TSWasmErrorKind, CString]
    
    export fields.*
    private[treesitter] object fields:
      extension (struct: TSWasmError)
        inline def kind : TSWasmErrorKind = struct._1
        inline def kind_=(value: TSWasmErrorKind): Unit = (!struct.at1 = value)
        inline def message : CString = struct._2
        inline def message_=(value: CString): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates TSWasmError on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[TSWasmError] = scala.scalanative.unsafe.alloc[TSWasmError](1)
    def apply(kind : TSWasmErrorKind, message : CString)(using Zone): Ptr[TSWasmError] =
      val ____ptr = apply()
      (!____ptr).kind = kind
      (!____ptr).message = message
      ____ptr
    
    

  opaque type TSWasmStore = CStruct0
  
  object TSWasmStore:
    given _tag: Tag[TSWasmStore] = Tag.materializeCStruct0Tag
    

  opaque type wasm_engine_t = CStruct0
  
  object wasm_engine_t:
    given _tag: Tag[wasm_engine_t] = Tag.materializeCStruct0Tag
    


@extern
private[treesitter] object extern_functions:
  import _root_.treesitter.predef.*
  import _root_.treesitter.enumerations.*
  import _root_.treesitter.aliases.*
  import _root_.treesitter.structs.*
  private[treesitter] def __sn_wrap_treesitter_ts_node_child(self : Ptr[TSNode], child_index : uint32_t, __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_child_by_field_id(self : Ptr[TSNode], field_id : TSFieldId, __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_child_by_field_name(self : Ptr[TSNode], name : CString, name_length : uint32_t, __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_child_count(self : Ptr[TSNode]): uint32_t = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_child_with_descendant(self : Ptr[TSNode], descendant : Ptr[TSNode], __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_descendant_count(self : Ptr[TSNode]): uint32_t = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_descendant_for_byte_range(self : Ptr[TSNode], start : uint32_t, end : uint32_t, __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_descendant_for_point_range(self : Ptr[TSNode], start : Ptr[TSPoint], end : Ptr[TSPoint], __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_end_byte(self : Ptr[TSNode]): uint32_t = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_end_point(self : Ptr[TSNode], __return : Ptr[TSPoint]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_eq(self : Ptr[TSNode], other : Ptr[TSNode]): Boolean = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_field_name_for_child(self : Ptr[TSNode], child_index : uint32_t): CString = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_field_name_for_named_child(self : Ptr[TSNode], named_child_index : uint32_t): CString = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_first_child_for_byte(self : Ptr[TSNode], byte : uint32_t, __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_first_named_child_for_byte(self : Ptr[TSNode], byte : uint32_t, __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_grammar_symbol(self : Ptr[TSNode]): TSSymbol = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_grammar_type(self : Ptr[TSNode]): CString = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_has_changes(self : Ptr[TSNode]): Boolean = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_has_error(self : Ptr[TSNode]): Boolean = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_is_error(self : Ptr[TSNode]): Boolean = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_is_extra(self : Ptr[TSNode]): Boolean = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_is_missing(self : Ptr[TSNode]): Boolean = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_is_named(self : Ptr[TSNode]): Boolean = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_is_null(self : Ptr[TSNode]): Boolean = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_language(self : Ptr[TSNode]): Ptr[TSLanguage] = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_named_child(self : Ptr[TSNode], child_index : uint32_t, __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_named_child_count(self : Ptr[TSNode]): uint32_t = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_named_descendant_for_byte_range(self : Ptr[TSNode], start : uint32_t, end : uint32_t, __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_named_descendant_for_point_range(self : Ptr[TSNode], start : Ptr[TSPoint], end : Ptr[TSPoint], __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_next_named_sibling(self : Ptr[TSNode], __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_next_parse_state(self : Ptr[TSNode]): TSStateId = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_next_sibling(self : Ptr[TSNode], __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_parent(self : Ptr[TSNode], __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_parse_state(self : Ptr[TSNode]): TSStateId = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_prev_named_sibling(self : Ptr[TSNode], __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_prev_sibling(self : Ptr[TSNode], __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_start_byte(self : Ptr[TSNode]): uint32_t = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_start_point(self : Ptr[TSNode], __return : Ptr[TSPoint]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_string(self : Ptr[TSNode]): CString = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_symbol(self : Ptr[TSNode]): TSSymbol = extern

  private[treesitter] def __sn_wrap_treesitter_ts_node_type(self : Ptr[TSNode]): CString = extern

  private[treesitter] def __sn_wrap_treesitter_ts_parser_logger(self : Ptr[TSParser], __return : Ptr[TSLogger]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_parser_parse(self : Ptr[TSParser], old_tree : Ptr[TSTree], input : Ptr[TSInput]): Ptr[TSTree] = extern

  private[treesitter] def __sn_wrap_treesitter_ts_parser_parse_with_options(self : Ptr[TSParser], old_tree : Ptr[TSTree], input : Ptr[TSInput], parse_options : Ptr[TSParseOptions]): Ptr[TSTree] = extern

  private[treesitter] def __sn_wrap_treesitter_ts_parser_set_logger(self : Ptr[TSParser], logger : Ptr[TSLogger]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_query_cursor_exec(self : Ptr[TSQueryCursor], query : Ptr[TSQuery], node : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_query_cursor_exec_with_options(self : Ptr[TSQueryCursor], query : Ptr[TSQuery], node : Ptr[TSNode], query_options : Ptr[TSQueryCursorOptions]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_query_cursor_set_containing_point_range(self : Ptr[TSQueryCursor], start_point : Ptr[TSPoint], end_point : Ptr[TSPoint]): Boolean = extern

  private[treesitter] def __sn_wrap_treesitter_ts_query_cursor_set_point_range(self : Ptr[TSQueryCursor], start_point : Ptr[TSPoint], end_point : Ptr[TSPoint]): Boolean = extern

  private[treesitter] def __sn_wrap_treesitter_ts_tree_cursor_copy(cursor : Ptr[TSTreeCursor], __return : Ptr[TSTreeCursor]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_tree_cursor_current_node(self : Ptr[TSTreeCursor], __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_tree_cursor_goto_first_child_for_point(self : Ptr[TSTreeCursor], goal_point : Ptr[TSPoint]): int64_t = extern

  private[treesitter] def __sn_wrap_treesitter_ts_tree_cursor_new(node : Ptr[TSNode], __return : Ptr[TSTreeCursor]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_tree_cursor_reset(self : Ptr[TSTreeCursor], node : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_tree_root_node(self : Ptr[TSTree], __return : Ptr[TSNode]): Unit = extern

  private[treesitter] def __sn_wrap_treesitter_ts_tree_root_node_with_offset(self : Ptr[TSTree], offset_bytes : uint32_t, offset_extent : Ptr[TSPoint], __return : Ptr[TSNode]): Unit = extern

  /**
   * Get the ABI version number for this language. This version number is used to ensure that languages were generated by a compatible version of Tree-sitter.
  */
  def ts_language_abi_version(self : Ptr[TSLanguage]): uint32_t = extern

  /**
   * Get another reference to the given language.
  */
  def ts_language_copy(self : Ptr[TSLanguage]): Ptr[TSLanguage] = extern

  /**
   * Free any dynamically-allocated resources for this language, if this is the last reference.
  */
  def ts_language_delete(self : Ptr[TSLanguage]): Unit = extern

  /**
   * Get the number of distinct field names in the language.
  */
  def ts_language_field_count(self : Ptr[TSLanguage]): uint32_t = extern

  /**
   * Get the numerical id for the given field name string.
  */
  def ts_language_field_id_for_name(self : Ptr[TSLanguage], name : CString, name_length : uint32_t): TSFieldId = extern

  /**
   * Get the field name string for the given numerical id.
  */
  def ts_language_field_name_for_id(self : Ptr[TSLanguage], id : TSFieldId): CString = extern

  /**
   * Check if the language came from a Wasm module. If so, then in order to use this language with a Parser, that parser must have a Wasm store assigned.
  */
  def ts_language_is_wasm(_0 : Ptr[TSLanguage]): Boolean = extern

  /**
   * Get the metadata for this language. This information is generated by the CLI, and relies on the language author providing the correct metadata in the language's `tree-sitter.json` file.
  */
  def ts_language_metadata(self : Ptr[TSLanguage]): Ptr[TSLanguageMetadata] = extern

  /**
   * Get the name of this language. This returns `NULL` in older parsers.
  */
  def ts_language_name(self : Ptr[TSLanguage]): CString = extern

  /**
   * Get the next parse state. Combine this with lookahead iterators to generate completion suggestions or valid symbols in error nodes. Use [`ts_node_grammar_symbol`] for valid symbols.
  */
  def ts_language_next_state(self : Ptr[TSLanguage], state : TSStateId, symbol : TSSymbol): TSStateId = extern

  /**
   * Get the number of valid states in this language.
  */
  def ts_language_state_count(self : Ptr[TSLanguage]): uint32_t = extern

  /**
   * Get a list of all subtype symbol ids for a given supertype symbol.
  */
  def ts_language_subtypes(self : Ptr[TSLanguage], supertype : TSSymbol, length : Ptr[uint32_t]): Ptr[TSSymbol] = extern

  /**
   * Get a list of all supertype symbols for the language.
  */
  def ts_language_supertypes(self : Ptr[TSLanguage], length : Ptr[uint32_t]): Ptr[TSSymbol] = extern

  /**
   * Get the number of distinct node types in the language.
  */
  def ts_language_symbol_count(self : Ptr[TSLanguage]): uint32_t = extern

  /**
   * Get the numerical id for the given node type string.
  */
  def ts_language_symbol_for_name(self : Ptr[TSLanguage], string : CString, length : uint32_t, is_named : Boolean): TSSymbol = extern

  /**
   * Get a node type string for the given numerical id.
  */
  def ts_language_symbol_name(self : Ptr[TSLanguage], symbol : TSSymbol): CString = extern

  /**
   * Check whether the given node type id belongs to named nodes, anonymous nodes, or a hidden nodes.
  */
  def ts_language_symbol_type(self : Ptr[TSLanguage], symbol : TSSymbol): TSSymbolType = extern

  /**
   * Get the current symbol of the lookahead iterator;
  */
  def ts_lookahead_iterator_current_symbol(self : Ptr[TSLookaheadIterator]): TSSymbol = extern

  /**
   * Get the current symbol type of the lookahead iterator as a null terminated string.
  */
  def ts_lookahead_iterator_current_symbol_name(self : Ptr[TSLookaheadIterator]): CString = extern

  /**
   * Delete a lookahead iterator freeing all the memory used.
  */
  def ts_lookahead_iterator_delete(self : Ptr[TSLookaheadIterator]): Unit = extern

  /**
   * Get the current language of the lookahead iterator.
  */
  def ts_lookahead_iterator_language(self : Ptr[TSLookaheadIterator]): Ptr[TSLanguage] = extern

  /**
   * Create a new lookahead iterator for the given language and parse state.
  */
  def ts_lookahead_iterator_new(self : Ptr[TSLanguage], state : TSStateId): Ptr[TSLookaheadIterator] = extern

  /**
   * Advance the lookahead iterator to the next symbol.
  */
  def ts_lookahead_iterator_next(self : Ptr[TSLookaheadIterator]): Boolean = extern

  /**
   * Reset the lookahead iterator.
  */
  def ts_lookahead_iterator_reset(self : Ptr[TSLookaheadIterator], language : Ptr[TSLanguage], state : TSStateId): Boolean = extern

  /**
   * Reset the lookahead iterator to another state.
  */
  def ts_lookahead_iterator_reset_state(self : Ptr[TSLookaheadIterator], state : TSStateId): Boolean = extern

  /**
   * Edit the node to keep it in-sync with source code that has been edited.
  */
  def ts_node_edit(self : Ptr[TSNode], edit : Ptr[TSInputEdit]): Unit = extern

  /**
   * Delete the parser, freeing all of the memory that it used.
  */
  def ts_parser_delete(self : Ptr[TSParser]): Unit = extern

  /**
   * Get the ranges of text that the parser will include when parsing.
  */
  def ts_parser_included_ranges(self : Ptr[TSParser], count : Ptr[uint32_t]): Ptr[TSRange] = extern

  /**
   * Get the parser's current language.
  */
  def ts_parser_language(self : Ptr[TSParser]): Ptr[TSLanguage] = extern

  /**
   * Create a new parser.
  */
  def ts_parser_new(): Ptr[TSParser] = extern

  /**
   * Use the parser to parse some source code stored in one contiguous buffer. The first two parameters are the same as in the [`ts_parser_parse`] function above. The second two parameters indicate the location of the buffer and its length in bytes.
  */
  def ts_parser_parse_string(self : Ptr[TSParser], old_tree : Ptr[TSTree], string : CString, length : uint32_t): Ptr[TSTree] = extern

  /**
   * Use the parser to parse some source code stored in one contiguous buffer with a given encoding. The first four parameters work the same as in the [`ts_parser_parse_string`] method above. The final parameter indicates whether the text is encoded as UTF8 or UTF16.
  */
  def ts_parser_parse_string_encoding(self : Ptr[TSParser], old_tree : Ptr[TSTree], string : CString, length : uint32_t, encoding : TSInputEncoding): Ptr[TSTree] = extern

  /**
   * Set the file descriptor to which the parser should write debugging graphs during parsing. The graphs are formatted in the DOT language. You may want to pipe these graphs directly to a `dot(1)` process in order to generate SVG output. You can turn off this logging by passing a negative number.
  */
  def ts_parser_print_dot_graphs(self : Ptr[TSParser], fd : CInt): Unit = extern

  /**
   * Instruct the parser to start the next parse from the beginning.
  */
  def ts_parser_reset(self : Ptr[TSParser]): Unit = extern

  /**
   * Set the ranges of text that the parser should include when parsing.
  */
  def ts_parser_set_included_ranges(self : Ptr[TSParser], ranges : Ptr[TSRange], count : uint32_t): Boolean = extern

  /**
   * Set the language that the parser should use for parsing.
  */
  def ts_parser_set_language(self : Ptr[TSParser], language : Ptr[TSLanguage]): Boolean = extern

  /**
   * Assign the given Wasm store to the parser. A parser must have a Wasm store in order to use Wasm languages.
  */
  def ts_parser_set_wasm_store(_0 : Ptr[TSParser], _1 : Ptr[TSWasmStore]): Unit = extern

  /**
   * Remove the parser's current Wasm store and return it. This returns NULL if the parser doesn't have a Wasm store.
  */
  def ts_parser_take_wasm_store(_0 : Ptr[TSParser]): Ptr[TSWasmStore] = extern

  /**
   * Edit a point to keep it in-sync with source code that has been edited.
  */
  def ts_point_edit(point : Ptr[TSPoint], point_byte : Ptr[uint32_t], edit : Ptr[TSInputEdit]): Unit = extern

  def ts_query_capture_count(self : Ptr[TSQuery]): uint32_t = extern

  /**
   * Get the name and length of one of the query's captures, or one of the query's string literals. Each capture and string is associated with a numeric id based on the order that it appeared in the query's source.
  */
  def ts_query_capture_name_for_id(self : Ptr[TSQuery], index : uint32_t, length : Ptr[uint32_t]): CString = extern

  /**
   * Get the quantifier of the query's captures. Each capture is * associated with a numeric id based on the order that it appeared in the query's source.
  */
  def ts_query_capture_quantifier_for_id(self : Ptr[TSQuery], pattern_index : uint32_t, capture_index : uint32_t): TSQuantifier = extern

  /**
   * Delete a query cursor, freeing all of the memory that it used.
  */
  def ts_query_cursor_delete(self : Ptr[TSQueryCursor]): Unit = extern

  /**
   * Manage the maximum number of in-progress matches allowed by this query cursor.
  */
  def ts_query_cursor_did_exceed_match_limit(self : Ptr[TSQueryCursor]): Boolean = extern

  def ts_query_cursor_match_limit(self : Ptr[TSQueryCursor]): uint32_t = extern

  /**
   * Create a new cursor for executing a given query.
  */
  def ts_query_cursor_new(): Ptr[TSQueryCursor] = extern

  /**
   * Advance to the next capture of the currently running query.
  */
  def ts_query_cursor_next_capture(self : Ptr[TSQueryCursor], `match` : Ptr[TSQueryMatch], capture_index : Ptr[uint32_t]): Boolean = extern

  /**
   * Advance to the next match of the currently running query.
  */
  def ts_query_cursor_next_match(self : Ptr[TSQueryCursor], `match` : Ptr[TSQueryMatch]): Boolean = extern

  def ts_query_cursor_remove_match(self : Ptr[TSQueryCursor], match_id : uint32_t): Unit = extern

  /**
   * Set the range of bytes in which the query will be executed.
  */
  def ts_query_cursor_set_byte_range(self : Ptr[TSQueryCursor], start_byte : uint32_t, end_byte : uint32_t): Boolean = extern

  /**
   * Set the byte range within which all matches must be fully contained.
  */
  def ts_query_cursor_set_containing_byte_range(self : Ptr[TSQueryCursor], start_byte : uint32_t, end_byte : uint32_t): Boolean = extern

  def ts_query_cursor_set_match_limit(self : Ptr[TSQueryCursor], limit : uint32_t): Unit = extern

  /**
   * Set the maximum start depth for a query cursor.
  */
  def ts_query_cursor_set_max_start_depth(self : Ptr[TSQueryCursor], max_start_depth : uint32_t): Unit = extern

  /**
   * Delete a query, freeing all of the memory that it used.
  */
  def ts_query_delete(self : Ptr[TSQuery]): Unit = extern

  /**
   * Disable a certain capture within a query.
  */
  def ts_query_disable_capture(self : Ptr[TSQuery], name : CString, length : uint32_t): Unit = extern

  /**
   * Disable a certain pattern within a query.
  */
  def ts_query_disable_pattern(self : Ptr[TSQuery], pattern_index : uint32_t): Unit = extern

  /**
   * Get the byte offset where the given pattern ends in the query's source.
  */
  def ts_query_end_byte_for_pattern(self : Ptr[TSQuery], pattern_index : uint32_t): uint32_t = extern

  def ts_query_is_pattern_guaranteed_at_step(self : Ptr[TSQuery], byte_offset : uint32_t): Boolean = extern

  def ts_query_is_pattern_non_local(self : Ptr[TSQuery], pattern_index : uint32_t): Boolean = extern

  def ts_query_is_pattern_rooted(self : Ptr[TSQuery], pattern_index : uint32_t): Boolean = extern

  /**
   * Create a new query from a string containing one or more S-expression patterns. The query is associated with a particular language, and can only be run on syntax nodes parsed with that language.
  */
  def ts_query_new(language : Ptr[TSLanguage], source : CString, source_len : uint32_t, error_offset : Ptr[uint32_t], error_type : Ptr[TSQueryError]): Ptr[TSQuery] = extern

  /**
   * Get the number of patterns, captures, or string literals in the query.
  */
  def ts_query_pattern_count(self : Ptr[TSQuery]): uint32_t = extern

  /**
   * Get all of the predicates for the given pattern in the query.
  */
  def ts_query_predicates_for_pattern(self : Ptr[TSQuery], pattern_index : uint32_t, step_count : Ptr[uint32_t]): Ptr[TSQueryPredicateStep] = extern

  /**
   * Get the byte offset where the given pattern starts in the query's source.
  */
  def ts_query_start_byte_for_pattern(self : Ptr[TSQuery], pattern_index : uint32_t): uint32_t = extern

  def ts_query_string_count(self : Ptr[TSQuery]): uint32_t = extern

  def ts_query_string_value_for_id(self : Ptr[TSQuery], index : uint32_t, length : Ptr[uint32_t]): CString = extern

  /**
   * Edit a range to keep it in-sync with source code that has been edited.
  */
  def ts_range_edit(range : Ptr[TSRange], edit : Ptr[TSInputEdit]): Unit = extern

  /**
   * Set the allocation functions used by the library.
  */
  def ts_set_allocator(new_malloc : CFuncPtr1[size_t, Ptr[Byte]], new_calloc : CFuncPtr2[size_t, size_t, Ptr[Byte]], new_realloc : CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]], new_free : CFuncPtr1[Ptr[Byte], Unit]): Unit = extern

  /**
   * Create a shallow copy of the syntax tree. This is very fast.
  */
  def ts_tree_copy(self : Ptr[TSTree]): Ptr[TSTree] = extern

  /**
   * Get the depth of the cursor's current node relative to the original node that the cursor was constructed with.
  */
  def ts_tree_cursor_current_depth(self : Ptr[TSTreeCursor]): uint32_t = extern

  /**
   * Get the index of the cursor's current node out of all of the descendants of the original node that the cursor was constructed with.
  */
  def ts_tree_cursor_current_descendant_index(self : Ptr[TSTreeCursor]): uint32_t = extern

  /**
   * Get the field id of the tree cursor's current node.
  */
  def ts_tree_cursor_current_field_id(self : Ptr[TSTreeCursor]): TSFieldId = extern

  /**
   * Get the field name of the tree cursor's current node.
  */
  def ts_tree_cursor_current_field_name(self : Ptr[TSTreeCursor]): CString = extern

  /**
   * Delete a tree cursor, freeing all of the memory that it used.
  */
  def ts_tree_cursor_delete(self : Ptr[TSTreeCursor]): Unit = extern

  /**
   * Move the cursor to the node that is the nth descendant of the original node that the cursor was constructed with, where zero represents the original node itself.
  */
  def ts_tree_cursor_goto_descendant(self : Ptr[TSTreeCursor], goal_descendant_index : uint32_t): Unit = extern

  /**
   * Move the cursor to the first child of its current node.
  */
  def ts_tree_cursor_goto_first_child(self : Ptr[TSTreeCursor]): Boolean = extern

  /**
   * Move the cursor to the first child of its current node that contains or starts after the given byte offset or point.
  */
  def ts_tree_cursor_goto_first_child_for_byte(self : Ptr[TSTreeCursor], goal_byte : uint32_t): int64_t = extern

  /**
   * Move the cursor to the last child of its current node.
  */
  def ts_tree_cursor_goto_last_child(self : Ptr[TSTreeCursor]): Boolean = extern

  /**
   * Move the cursor to the next sibling of its current node.
  */
  def ts_tree_cursor_goto_next_sibling(self : Ptr[TSTreeCursor]): Boolean = extern

  /**
   * Move the cursor to the parent of its current node.
  */
  def ts_tree_cursor_goto_parent(self : Ptr[TSTreeCursor]): Boolean = extern

  /**
   * Move the cursor to the previous sibling of its current node.
  */
  def ts_tree_cursor_goto_previous_sibling(self : Ptr[TSTreeCursor]): Boolean = extern

  /**
   * Re-initialize a tree cursor to the same position as another cursor.
  */
  def ts_tree_cursor_reset_to(dst : Ptr[TSTreeCursor], src : Ptr[TSTreeCursor]): Unit = extern

  /**
   * Delete the syntax tree, freeing all of the memory that it used.
  */
  def ts_tree_delete(self : Ptr[TSTree]): Unit = extern

  /**
   * Edit the syntax tree to keep it in sync with source code that has been edited.
  */
  def ts_tree_edit(self : Ptr[TSTree], edit : Ptr[TSInputEdit]): Unit = extern

  /**
   * Compare an old edited syntax tree to a new syntax tree representing the same document, returning an array of ranges whose syntactic structure has changed.
  */
  def ts_tree_get_changed_ranges(old_tree : Ptr[TSTree], new_tree : Ptr[TSTree], length : Ptr[uint32_t]): Ptr[TSRange] = extern

  /**
   * Get the array of included ranges that was used to parse the syntax tree.
  */
  def ts_tree_included_ranges(self : Ptr[TSTree], length : Ptr[uint32_t]): Ptr[TSRange] = extern

  /**
   * Get the language that was used to parse the syntax tree.
  */
  def ts_tree_language(self : Ptr[TSTree]): Ptr[TSLanguage] = extern

  /**
   * Write a DOT graph describing the syntax tree to the given file.
  */
  def ts_tree_print_dot_graph(self : Ptr[TSTree], file_descriptor : CInt): Unit = extern

  /**
   * Free the memory associated with the given Wasm store.
  */
  def ts_wasm_store_delete(_0 : Ptr[TSWasmStore]): Unit = extern

  /**
   * Get the number of languages instantiated in the given Wasm store.
  */
  def ts_wasm_store_language_count(_0 : Ptr[TSWasmStore]): size_t = extern

  /**
   * Create a language from a buffer of Wasm. The resulting language behaves like any other Tree-sitter language, except that in order to use it with a parser, that parser must have a Wasm store. Note that the language can be used with any Wasm store, it doesn't need to be the same store that was used to originally load it.
  */
  def ts_wasm_store_load_language(_0 : Ptr[TSWasmStore], name : CString, wasm : CString, wasm_len : uint32_t, error : Ptr[TSWasmError]): Ptr[TSLanguage] = extern

  /**
   * Create a Wasm store.
  */
  def ts_wasm_store_new(engine : Ptr[TSWasmEngine], error : Ptr[TSWasmError]): Ptr[TSWasmStore] = extern


object functions:
  import _root_.treesitter.predef.*
  import _root_.treesitter.enumerations.*
  import _root_.treesitter.aliases.*
  import _root_.treesitter.structs.*
  import extern_functions.*
  export extern_functions.*

  /**
   * Get the node's child at the given index, where zero represents the first child.
  */
  def ts_node_child(self : Ptr[TSNode], child_index : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_child(self, child_index, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the node's child at the given index, where zero represents the first child.
  */
  def ts_node_child(self : Ptr[TSNode], child_index : uint32_t)(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_child(self, child_index, __return)

  /**
   * Get the node's child at the given index, where zero represents the first child.
  */
  def ts_node_child(self : TSNode, child_index : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_child((__ptr_0 + 0), child_index, (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * Get the node's child with the given numerical field id.
  */
  def ts_node_child_by_field_id(self : TSNode, field_id : TSFieldId)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_child_by_field_id((__ptr_0 + 0), field_id, (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * Get the node's child with the given numerical field id.
  */
  def ts_node_child_by_field_id(self : Ptr[TSNode], field_id : TSFieldId)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_child_by_field_id(self, field_id, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the node's child with the given numerical field id.
  */
  def ts_node_child_by_field_id(self : Ptr[TSNode], field_id : TSFieldId)(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_child_by_field_id(self, field_id, __return)

  /**
   * Get the node's child with the given field name.
  */
  def ts_node_child_by_field_name(self : Ptr[TSNode], name : CString, name_length : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_child_by_field_name(self, name, name_length, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the node's child with the given field name.
  */
  def ts_node_child_by_field_name(self : Ptr[TSNode], name : CString, name_length : uint32_t)(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_child_by_field_name(self, name, name_length, __return)

  /**
   * Get the node's child with the given field name.
  */
  def ts_node_child_by_field_name(self : TSNode, name : CString, name_length : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_child_by_field_name((__ptr_0 + 0), name, name_length, (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * Get the node's number of children.
  */
  def ts_node_child_count(self : Ptr[TSNode]): uint32_t =
    __sn_wrap_treesitter_ts_node_child_count(self)

  /**
   * Get the node's number of children.
  */
  def ts_node_child_count(self : TSNode)(using Zone): uint32_t =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_child_count((__ptr_0 + 0))

  /**
   * Get the node that contains `descendant`.
  */
  def ts_node_child_with_descendant(self : Ptr[TSNode], descendant : Ptr[TSNode])(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_child_with_descendant(self, descendant, __return)

  /**
   * Get the node that contains `descendant`.
  */
  def ts_node_child_with_descendant(self : TSNode, descendant : TSNode)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](3)
    !(__ptr_0 + 0) = self
    !(__ptr_0 + 1) = descendant
    __sn_wrap_treesitter_ts_node_child_with_descendant((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
    !(__ptr_0 + 2)

  /**
   * Get the node that contains `descendant`.
  */
  def ts_node_child_with_descendant(self : Ptr[TSNode], descendant : Ptr[TSNode])(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_child_with_descendant(self, descendant, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the node's number of descendants, including one for the node itself.
  */
  def ts_node_descendant_count(self : Ptr[TSNode]): uint32_t =
    __sn_wrap_treesitter_ts_node_descendant_count(self)

  /**
   * Get the node's number of descendants, including one for the node itself.
  */
  def ts_node_descendant_count(self : TSNode)(using Zone): uint32_t =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_descendant_count((__ptr_0 + 0))

  /**
   * Get the smallest node within this node that spans the given range of bytes or (row, column) positions.
  */
  def ts_node_descendant_for_byte_range(self : Ptr[TSNode], start : uint32_t, end : uint32_t)(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_descendant_for_byte_range(self, start, end, __return)

  /**
   * Get the smallest node within this node that spans the given range of bytes or (row, column) positions.
  */
  def ts_node_descendant_for_byte_range(self : Ptr[TSNode], start : uint32_t, end : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_descendant_for_byte_range(self, start, end, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the smallest node within this node that spans the given range of bytes or (row, column) positions.
  */
  def ts_node_descendant_for_byte_range(self : TSNode, start : uint32_t, end : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_descendant_for_byte_range((__ptr_0 + 0), start, end, (__ptr_0 + 1))
    !(__ptr_0 + 1)

  def ts_node_descendant_for_point_range(self : Ptr[TSNode], start : Ptr[TSPoint], end : Ptr[TSPoint])(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_descendant_for_point_range(self, start, end, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def ts_node_descendant_for_point_range(self : TSNode, start : TSPoint, end : TSPoint)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    val __ptr_1: Ptr[TSPoint] = _root_.scala.scalanative.unsafe.alloc[TSPoint](2)
    !(__ptr_0 + 0) = self
    !(__ptr_1 + 0) = start
    !(__ptr_1 + 1) = end
    __sn_wrap_treesitter_ts_node_descendant_for_point_range((__ptr_0 + 0), (__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 1))
    !(__ptr_0 + 1)

  def ts_node_descendant_for_point_range(self : Ptr[TSNode], start : Ptr[TSPoint], end : Ptr[TSPoint])(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_descendant_for_point_range(self, start, end, __return)

  /**
   * Get the node's end byte.
  */
  def ts_node_end_byte(self : TSNode)(using Zone): uint32_t =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_end_byte((__ptr_0 + 0))

  /**
   * Get the node's end byte.
  */
  def ts_node_end_byte(self : Ptr[TSNode]): uint32_t =
    __sn_wrap_treesitter_ts_node_end_byte(self)

  /**
   * Get the node's end position in terms of rows and columns.
  */
  def ts_node_end_point(self : Ptr[TSNode])(__return : Ptr[TSPoint]): Unit =
    __sn_wrap_treesitter_ts_node_end_point(self, __return)

  /**
   * Get the node's end position in terms of rows and columns.
  */
  def ts_node_end_point(self : TSNode)(using Zone): TSPoint =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    val __ptr_1: Ptr[TSPoint] = _root_.scala.scalanative.unsafe.alloc[TSPoint](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_end_point((__ptr_0 + 0), (__ptr_1 + 0))
    !(__ptr_1 + 0)

  /**
   * Get the node's end position in terms of rows and columns.
  */
  def ts_node_end_point(self : Ptr[TSNode])(using Zone): TSPoint =
    val __ptr_0: Ptr[TSPoint] = _root_.scala.scalanative.unsafe.alloc[TSPoint](1)
    __sn_wrap_treesitter_ts_node_end_point(self, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Check if two nodes are identical.
  */
  def ts_node_eq(self : TSNode, other : TSNode)(using Zone): Boolean =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    !(__ptr_0 + 1) = other
    __sn_wrap_treesitter_ts_node_eq((__ptr_0 + 0), (__ptr_0 + 1))

  /**
   * Check if two nodes are identical.
  */
  def ts_node_eq(self : Ptr[TSNode], other : Ptr[TSNode]): Boolean =
    __sn_wrap_treesitter_ts_node_eq(self, other)

  /**
   * Get the field name for node's child at the given index, where zero represents the first child. Returns NULL, if no field is found.
  */
  def ts_node_field_name_for_child(self : TSNode, child_index : uint32_t)(using Zone): CString =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_field_name_for_child((__ptr_0 + 0), child_index)

  /**
   * Get the field name for node's child at the given index, where zero represents the first child. Returns NULL, if no field is found.
  */
  def ts_node_field_name_for_child(self : Ptr[TSNode], child_index : uint32_t): CString =
    __sn_wrap_treesitter_ts_node_field_name_for_child(self, child_index)

  /**
   * Get the field name for node's named child at the given index, where zero represents the first named child. Returns NULL, if no field is found.
  */
  def ts_node_field_name_for_named_child(self : TSNode, named_child_index : uint32_t)(using Zone): CString =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_field_name_for_named_child((__ptr_0 + 0), named_child_index)

  /**
   * Get the field name for node's named child at the given index, where zero represents the first named child. Returns NULL, if no field is found.
  */
  def ts_node_field_name_for_named_child(self : Ptr[TSNode], named_child_index : uint32_t): CString =
    __sn_wrap_treesitter_ts_node_field_name_for_named_child(self, named_child_index)

  /**
   * Get the node's first child that contains or starts after the given byte offset.
  */
  def ts_node_first_child_for_byte(self : TSNode, byte : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_first_child_for_byte((__ptr_0 + 0), byte, (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * Get the node's first child that contains or starts after the given byte offset.
  */
  def ts_node_first_child_for_byte(self : Ptr[TSNode], byte : uint32_t)(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_first_child_for_byte(self, byte, __return)

  /**
   * Get the node's first child that contains or starts after the given byte offset.
  */
  def ts_node_first_child_for_byte(self : Ptr[TSNode], byte : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_first_child_for_byte(self, byte, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the node's first named child that contains or starts after the given byte offset.
  */
  def ts_node_first_named_child_for_byte(self : Ptr[TSNode], byte : uint32_t)(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_first_named_child_for_byte(self, byte, __return)

  /**
   * Get the node's first named child that contains or starts after the given byte offset.
  */
  def ts_node_first_named_child_for_byte(self : Ptr[TSNode], byte : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_first_named_child_for_byte(self, byte, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the node's first named child that contains or starts after the given byte offset.
  */
  def ts_node_first_named_child_for_byte(self : TSNode, byte : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_first_named_child_for_byte((__ptr_0 + 0), byte, (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * Get the node's type as a numerical id as it appears in the grammar ignoring aliases. This should be used in [`ts_language_next_state`] instead of [`ts_node_symbol`].
  */
  def ts_node_grammar_symbol(self : TSNode)(using Zone): TSSymbol =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_grammar_symbol((__ptr_0 + 0))

  /**
   * Get the node's type as a numerical id as it appears in the grammar ignoring aliases. This should be used in [`ts_language_next_state`] instead of [`ts_node_symbol`].
  */
  def ts_node_grammar_symbol(self : Ptr[TSNode]): TSSymbol =
    __sn_wrap_treesitter_ts_node_grammar_symbol(self)

  /**
   * Get the node's type as it appears in the grammar ignoring aliases as a null-terminated string.
  */
  def ts_node_grammar_type(self : Ptr[TSNode]): CString =
    __sn_wrap_treesitter_ts_node_grammar_type(self)

  /**
   * Get the node's type as it appears in the grammar ignoring aliases as a null-terminated string.
  */
  def ts_node_grammar_type(self : TSNode)(using Zone): CString =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_grammar_type((__ptr_0 + 0))

  /**
   * Check if a syntax node has been edited.
  */
  def ts_node_has_changes(self : Ptr[TSNode]): Boolean =
    __sn_wrap_treesitter_ts_node_has_changes(self)

  /**
   * Check if a syntax node has been edited.
  */
  def ts_node_has_changes(self : TSNode)(using Zone): Boolean =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_has_changes((__ptr_0 + 0))

  /**
   * Check if the node is a syntax error or contains any syntax errors.
  */
  def ts_node_has_error(self : Ptr[TSNode]): Boolean =
    __sn_wrap_treesitter_ts_node_has_error(self)

  /**
   * Check if the node is a syntax error or contains any syntax errors.
  */
  def ts_node_has_error(self : TSNode)(using Zone): Boolean =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_has_error((__ptr_0 + 0))

  /**
   * Check if the node is a syntax error.
  */
  def ts_node_is_error(self : TSNode)(using Zone): Boolean =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_is_error((__ptr_0 + 0))

  /**
   * Check if the node is a syntax error.
  */
  def ts_node_is_error(self : Ptr[TSNode]): Boolean =
    __sn_wrap_treesitter_ts_node_is_error(self)

  /**
   * Check if the node is *extra*. Extra nodes represent things like comments, which are not required the grammar, but can appear anywhere.
  */
  def ts_node_is_extra(self : TSNode)(using Zone): Boolean =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_is_extra((__ptr_0 + 0))

  /**
   * Check if the node is *extra*. Extra nodes represent things like comments, which are not required the grammar, but can appear anywhere.
  */
  def ts_node_is_extra(self : Ptr[TSNode]): Boolean =
    __sn_wrap_treesitter_ts_node_is_extra(self)

  /**
   * Check if the node is *missing*. Missing nodes are inserted by the parser in order to recover from certain kinds of syntax errors.
  */
  def ts_node_is_missing(self : Ptr[TSNode]): Boolean =
    __sn_wrap_treesitter_ts_node_is_missing(self)

  /**
   * Check if the node is *missing*. Missing nodes are inserted by the parser in order to recover from certain kinds of syntax errors.
  */
  def ts_node_is_missing(self : TSNode)(using Zone): Boolean =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_is_missing((__ptr_0 + 0))

  /**
   * Check if the node is *named*. Named nodes correspond to named rules in the grammar, whereas *anonymous* nodes correspond to string literals in the grammar.
  */
  def ts_node_is_named(self : Ptr[TSNode]): Boolean =
    __sn_wrap_treesitter_ts_node_is_named(self)

  /**
   * Check if the node is *named*. Named nodes correspond to named rules in the grammar, whereas *anonymous* nodes correspond to string literals in the grammar.
  */
  def ts_node_is_named(self : TSNode)(using Zone): Boolean =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_is_named((__ptr_0 + 0))

  /**
   * Check if the node is null. Functions like [`ts_node_child`] and [`ts_node_next_sibling`] will return a null node to indicate that no such node was found.
  */
  def ts_node_is_null(self : Ptr[TSNode]): Boolean =
    __sn_wrap_treesitter_ts_node_is_null(self)

  /**
   * Check if the node is null. Functions like [`ts_node_child`] and [`ts_node_next_sibling`] will return a null node to indicate that no such node was found.
  */
  def ts_node_is_null(self : TSNode)(using Zone): Boolean =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_is_null((__ptr_0 + 0))

  /**
   * Get the node's language.
  */
  def ts_node_language(self : Ptr[TSNode]): Ptr[TSLanguage] =
    __sn_wrap_treesitter_ts_node_language(self)

  /**
   * Get the node's language.
  */
  def ts_node_language(self : TSNode)(using Zone): Ptr[TSLanguage] =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_language((__ptr_0 + 0))

  /**
   * Get the node's *named* child at the given index.
  */
  def ts_node_named_child(self : Ptr[TSNode], child_index : uint32_t)(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_named_child(self, child_index, __return)

  /**
   * Get the node's *named* child at the given index.
  */
  def ts_node_named_child(self : Ptr[TSNode], child_index : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_named_child(self, child_index, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the node's *named* child at the given index.
  */
  def ts_node_named_child(self : TSNode, child_index : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_named_child((__ptr_0 + 0), child_index, (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * Get the node's number of *named* children.
  */
  def ts_node_named_child_count(self : Ptr[TSNode]): uint32_t =
    __sn_wrap_treesitter_ts_node_named_child_count(self)

  /**
   * Get the node's number of *named* children.
  */
  def ts_node_named_child_count(self : TSNode)(using Zone): uint32_t =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_named_child_count((__ptr_0 + 0))

  /**
   * Get the smallest named node within this node that spans the given range of bytes or (row, column) positions.
  */
  def ts_node_named_descendant_for_byte_range(self : TSNode, start : uint32_t, end : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_named_descendant_for_byte_range((__ptr_0 + 0), start, end, (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * Get the smallest named node within this node that spans the given range of bytes or (row, column) positions.
  */
  def ts_node_named_descendant_for_byte_range(self : Ptr[TSNode], start : uint32_t, end : uint32_t)(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_named_descendant_for_byte_range(self, start, end, __return)

  /**
   * Get the smallest named node within this node that spans the given range of bytes or (row, column) positions.
  */
  def ts_node_named_descendant_for_byte_range(self : Ptr[TSNode], start : uint32_t, end : uint32_t)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_named_descendant_for_byte_range(self, start, end, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def ts_node_named_descendant_for_point_range(self : TSNode, start : TSPoint, end : TSPoint)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    val __ptr_1: Ptr[TSPoint] = _root_.scala.scalanative.unsafe.alloc[TSPoint](2)
    !(__ptr_0 + 0) = self
    !(__ptr_1 + 0) = start
    !(__ptr_1 + 1) = end
    __sn_wrap_treesitter_ts_node_named_descendant_for_point_range((__ptr_0 + 0), (__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 1))
    !(__ptr_0 + 1)

  def ts_node_named_descendant_for_point_range(self : Ptr[TSNode], start : Ptr[TSPoint], end : Ptr[TSPoint])(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_named_descendant_for_point_range(self, start, end, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def ts_node_named_descendant_for_point_range(self : Ptr[TSNode], start : Ptr[TSPoint], end : Ptr[TSPoint])(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_named_descendant_for_point_range(self, start, end, __return)

  /**
   * Get the node's next / previous *named* sibling.
  */
  def ts_node_next_named_sibling(self : Ptr[TSNode])(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_next_named_sibling(self, __return)

  /**
   * Get the node's next / previous *named* sibling.
  */
  def ts_node_next_named_sibling(self : TSNode)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_next_named_sibling((__ptr_0 + 0), (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * Get the node's next / previous *named* sibling.
  */
  def ts_node_next_named_sibling(self : Ptr[TSNode])(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_next_named_sibling(self, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the parse state after this node.
  */
  def ts_node_next_parse_state(self : TSNode)(using Zone): TSStateId =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_next_parse_state((__ptr_0 + 0))

  /**
   * Get the parse state after this node.
  */
  def ts_node_next_parse_state(self : Ptr[TSNode]): TSStateId =
    __sn_wrap_treesitter_ts_node_next_parse_state(self)

  /**
   * Get the node's next / previous sibling.
  */
  def ts_node_next_sibling(self : Ptr[TSNode])(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_next_sibling(self, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the node's next / previous sibling.
  */
  def ts_node_next_sibling(self : Ptr[TSNode])(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_next_sibling(self, __return)

  /**
   * Get the node's next / previous sibling.
  */
  def ts_node_next_sibling(self : TSNode)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_next_sibling((__ptr_0 + 0), (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * Get the node's immediate parent. Prefer [`ts_node_child_with_descendant`] for iterating over the node's ancestors.
  */
  def ts_node_parent(self : Ptr[TSNode])(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_parent(self, __return)

  /**
   * Get the node's immediate parent. Prefer [`ts_node_child_with_descendant`] for iterating over the node's ancestors.
  */
  def ts_node_parent(self : TSNode)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_parent((__ptr_0 + 0), (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * Get the node's immediate parent. Prefer [`ts_node_child_with_descendant`] for iterating over the node's ancestors.
  */
  def ts_node_parent(self : Ptr[TSNode])(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_parent(self, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get this node's parse state.
  */
  def ts_node_parse_state(self : Ptr[TSNode]): TSStateId =
    __sn_wrap_treesitter_ts_node_parse_state(self)

  /**
   * Get this node's parse state.
  */
  def ts_node_parse_state(self : TSNode)(using Zone): TSStateId =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_parse_state((__ptr_0 + 0))

  def ts_node_prev_named_sibling(self : Ptr[TSNode])(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_prev_named_sibling(self, __return)

  def ts_node_prev_named_sibling(self : TSNode)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_prev_named_sibling((__ptr_0 + 0), (__ptr_0 + 1))
    !(__ptr_0 + 1)

  def ts_node_prev_named_sibling(self : Ptr[TSNode])(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_prev_named_sibling(self, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def ts_node_prev_sibling(self : Ptr[TSNode])(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_node_prev_sibling(self, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def ts_node_prev_sibling(self : Ptr[TSNode])(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_node_prev_sibling(self, __return)

  def ts_node_prev_sibling(self : TSNode)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](2)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_prev_sibling((__ptr_0 + 0), (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /**
   * Get the node's start byte.
  */
  def ts_node_start_byte(self : Ptr[TSNode]): uint32_t =
    __sn_wrap_treesitter_ts_node_start_byte(self)

  /**
   * Get the node's start byte.
  */
  def ts_node_start_byte(self : TSNode)(using Zone): uint32_t =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_start_byte((__ptr_0 + 0))

  /**
   * Get the node's start position in terms of rows and columns.
  */
  def ts_node_start_point(self : Ptr[TSNode])(__return : Ptr[TSPoint]): Unit =
    __sn_wrap_treesitter_ts_node_start_point(self, __return)

  /**
   * Get the node's start position in terms of rows and columns.
  */
  def ts_node_start_point(self : Ptr[TSNode])(using Zone): TSPoint =
    val __ptr_0: Ptr[TSPoint] = _root_.scala.scalanative.unsafe.alloc[TSPoint](1)
    __sn_wrap_treesitter_ts_node_start_point(self, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the node's start position in terms of rows and columns.
  */
  def ts_node_start_point(self : TSNode)(using Zone): TSPoint =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    val __ptr_1: Ptr[TSPoint] = _root_.scala.scalanative.unsafe.alloc[TSPoint](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_start_point((__ptr_0 + 0), (__ptr_1 + 0))
    !(__ptr_1 + 0)

  /**
   * Get an S-expression representing the node as a string.
  */
  def ts_node_string(self : Ptr[TSNode]): CString =
    __sn_wrap_treesitter_ts_node_string(self)

  /**
   * Get an S-expression representing the node as a string.
  */
  def ts_node_string(self : TSNode)(using Zone): CString =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_string((__ptr_0 + 0))

  /**
   * Get the node's type as a numerical id.
  */
  def ts_node_symbol(self : Ptr[TSNode]): TSSymbol =
    __sn_wrap_treesitter_ts_node_symbol(self)

  /**
   * Get the node's type as a numerical id.
  */
  def ts_node_symbol(self : TSNode)(using Zone): TSSymbol =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_symbol((__ptr_0 + 0))

  /**
   * Get the node's type as a null-terminated string.
  */
  def ts_node_type(self : TSNode)(using Zone): CString =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = self
    __sn_wrap_treesitter_ts_node_type((__ptr_0 + 0))

  /**
   * Get the node's type as a null-terminated string.
  */
  def ts_node_type(self : Ptr[TSNode]): CString =
    __sn_wrap_treesitter_ts_node_type(self)

  /**
   * Get the parser's current logger.
  */
  def ts_parser_logger(self : Ptr[TSParser])(using Zone): TSLogger =
    val __ptr_0: Ptr[TSLogger] = _root_.scala.scalanative.unsafe.alloc[TSLogger](1)
    __sn_wrap_treesitter_ts_parser_logger(self, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the parser's current logger.
  */
  def ts_parser_logger(self : Ptr[TSParser])(__return : Ptr[TSLogger]): Unit =
    __sn_wrap_treesitter_ts_parser_logger(self, __return)

  /**
   * Use the parser to parse some source code and create a syntax tree.
  */
  def ts_parser_parse(self : Ptr[TSParser], old_tree : Ptr[TSTree], input : TSInput)(using Zone): Ptr[TSTree] =
    val __ptr_0: Ptr[TSInput] = _root_.scala.scalanative.unsafe.alloc[TSInput](1)
    !(__ptr_0 + 0) = input
    __sn_wrap_treesitter_ts_parser_parse(self, old_tree, (__ptr_0 + 0))

  /**
   * Use the parser to parse some source code and create a syntax tree.
  */
  def ts_parser_parse(self : Ptr[TSParser], old_tree : Ptr[TSTree], input : Ptr[TSInput]): Ptr[TSTree] =
    __sn_wrap_treesitter_ts_parser_parse(self, old_tree, input)

  /**
   * Use the parser to parse some source code and create a syntax tree, with some options.
  */
  def ts_parser_parse_with_options(self : Ptr[TSParser], old_tree : Ptr[TSTree], input : TSInput, parse_options : TSParseOptions)(using Zone): Ptr[TSTree] =
    val __ptr_0: Ptr[TSParseOptions] = _root_.scala.scalanative.unsafe.alloc[TSParseOptions](1)
    val __ptr_1: Ptr[TSInput] = _root_.scala.scalanative.unsafe.alloc[TSInput](1)
    !(__ptr_1 + 0) = input
    !(__ptr_0 + 0) = parse_options
    __sn_wrap_treesitter_ts_parser_parse_with_options(self, old_tree, (__ptr_1 + 0), (__ptr_0 + 0))

  /**
   * Use the parser to parse some source code and create a syntax tree, with some options.
  */
  def ts_parser_parse_with_options(self : Ptr[TSParser], old_tree : Ptr[TSTree], input : Ptr[TSInput], parse_options : Ptr[TSParseOptions]): Ptr[TSTree] =
    __sn_wrap_treesitter_ts_parser_parse_with_options(self, old_tree, input, parse_options)

  /**
   * Set the logger that a parser should use during parsing.
  */
  def ts_parser_set_logger(self : Ptr[TSParser], logger : TSLogger)(using Zone): Unit =
    val __ptr_0: Ptr[TSLogger] = _root_.scala.scalanative.unsafe.alloc[TSLogger](1)
    !(__ptr_0 + 0) = logger
    __sn_wrap_treesitter_ts_parser_set_logger(self, (__ptr_0 + 0))

  /**
   * Set the logger that a parser should use during parsing.
  */
  def ts_parser_set_logger(self : Ptr[TSParser], logger : Ptr[TSLogger]): Unit =
    __sn_wrap_treesitter_ts_parser_set_logger(self, logger)

  /**
   * Start running a given query on a given node.
  */
  def ts_query_cursor_exec(self : Ptr[TSQueryCursor], query : Ptr[TSQuery], node : TSNode)(using Zone): Unit =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = node
    __sn_wrap_treesitter_ts_query_cursor_exec(self, query, (__ptr_0 + 0))

  /**
   * Start running a given query on a given node.
  */
  def ts_query_cursor_exec(self : Ptr[TSQueryCursor], query : Ptr[TSQuery], node : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_query_cursor_exec(self, query, node)

  /**
   * Start running a given query on a given node, with some options.
  */
  def ts_query_cursor_exec_with_options(self : Ptr[TSQueryCursor], query : Ptr[TSQuery], node : Ptr[TSNode], query_options : Ptr[TSQueryCursorOptions]): Unit =
    __sn_wrap_treesitter_ts_query_cursor_exec_with_options(self, query, node, query_options)

  /**
   * Start running a given query on a given node, with some options.
  */
  def ts_query_cursor_exec_with_options(self : Ptr[TSQueryCursor], query : Ptr[TSQuery], node : TSNode, query_options : Ptr[TSQueryCursorOptions])(using Zone): Unit =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = node
    __sn_wrap_treesitter_ts_query_cursor_exec_with_options(self, query, (__ptr_0 + 0), query_options)

  /**
   * Set the point range within which all matches must be fully contained.
  */
  def ts_query_cursor_set_containing_point_range(self : Ptr[TSQueryCursor], start_point : TSPoint, end_point : TSPoint)(using Zone): Boolean =
    val __ptr_0: Ptr[TSPoint] = _root_.scala.scalanative.unsafe.alloc[TSPoint](2)
    !(__ptr_0 + 0) = start_point
    !(__ptr_0 + 1) = end_point
    __sn_wrap_treesitter_ts_query_cursor_set_containing_point_range(self, (__ptr_0 + 0), (__ptr_0 + 1))

  /**
   * Set the point range within which all matches must be fully contained.
  */
  def ts_query_cursor_set_containing_point_range(self : Ptr[TSQueryCursor], start_point : Ptr[TSPoint], end_point : Ptr[TSPoint]): Boolean =
    __sn_wrap_treesitter_ts_query_cursor_set_containing_point_range(self, start_point, end_point)

  /**
   * Set the range of (row, column) positions in which the query will be executed.
  */
  def ts_query_cursor_set_point_range(self : Ptr[TSQueryCursor], start_point : TSPoint, end_point : TSPoint)(using Zone): Boolean =
    val __ptr_0: Ptr[TSPoint] = _root_.scala.scalanative.unsafe.alloc[TSPoint](2)
    !(__ptr_0 + 0) = start_point
    !(__ptr_0 + 1) = end_point
    __sn_wrap_treesitter_ts_query_cursor_set_point_range(self, (__ptr_0 + 0), (__ptr_0 + 1))

  /**
   * Set the range of (row, column) positions in which the query will be executed.
  */
  def ts_query_cursor_set_point_range(self : Ptr[TSQueryCursor], start_point : Ptr[TSPoint], end_point : Ptr[TSPoint]): Boolean =
    __sn_wrap_treesitter_ts_query_cursor_set_point_range(self, start_point, end_point)

  def ts_tree_cursor_copy(cursor : Ptr[TSTreeCursor])(__return : Ptr[TSTreeCursor]): Unit =
    __sn_wrap_treesitter_ts_tree_cursor_copy(cursor, __return)

  def ts_tree_cursor_copy(cursor : Ptr[TSTreeCursor])(using Zone): TSTreeCursor =
    val __ptr_0: Ptr[TSTreeCursor] = _root_.scala.scalanative.unsafe.alloc[TSTreeCursor](1)
    __sn_wrap_treesitter_ts_tree_cursor_copy(cursor, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the tree cursor's current node.
  */
  def ts_tree_cursor_current_node(self : Ptr[TSTreeCursor])(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_tree_cursor_current_node(self, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the tree cursor's current node.
  */
  def ts_tree_cursor_current_node(self : Ptr[TSTreeCursor])(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_tree_cursor_current_node(self, __return)

  def ts_tree_cursor_goto_first_child_for_point(self : Ptr[TSTreeCursor], goal_point : Ptr[TSPoint]): int64_t =
    __sn_wrap_treesitter_ts_tree_cursor_goto_first_child_for_point(self, goal_point)

  def ts_tree_cursor_goto_first_child_for_point(self : Ptr[TSTreeCursor], goal_point : TSPoint)(using Zone): int64_t =
    val __ptr_0: Ptr[TSPoint] = _root_.scala.scalanative.unsafe.alloc[TSPoint](1)
    !(__ptr_0 + 0) = goal_point
    __sn_wrap_treesitter_ts_tree_cursor_goto_first_child_for_point(self, (__ptr_0 + 0))

  /**
   * Create a new tree cursor starting from the given node.
  */
  def ts_tree_cursor_new(node : Ptr[TSNode])(__return : Ptr[TSTreeCursor]): Unit =
    __sn_wrap_treesitter_ts_tree_cursor_new(node, __return)

  /**
   * Create a new tree cursor starting from the given node.
  */
  def ts_tree_cursor_new(node : Ptr[TSNode])(using Zone): TSTreeCursor =
    val __ptr_0: Ptr[TSTreeCursor] = _root_.scala.scalanative.unsafe.alloc[TSTreeCursor](1)
    __sn_wrap_treesitter_ts_tree_cursor_new(node, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Create a new tree cursor starting from the given node.
  */
  def ts_tree_cursor_new(node : TSNode)(using Zone): TSTreeCursor =
    val __ptr_0: Ptr[TSTreeCursor] = _root_.scala.scalanative.unsafe.alloc[TSTreeCursor](1)
    val __ptr_1: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_1 + 0) = node
    __sn_wrap_treesitter_ts_tree_cursor_new((__ptr_1 + 0), (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Re-initialize a tree cursor to start at the original node that the cursor was constructed with.
  */
  def ts_tree_cursor_reset(self : Ptr[TSTreeCursor], node : TSNode)(using Zone): Unit =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    !(__ptr_0 + 0) = node
    __sn_wrap_treesitter_ts_tree_cursor_reset(self, (__ptr_0 + 0))

  /**
   * Re-initialize a tree cursor to start at the original node that the cursor was constructed with.
  */
  def ts_tree_cursor_reset(self : Ptr[TSTreeCursor], node : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_tree_cursor_reset(self, node)

  /**
   * Get the root node of the syntax tree.
  */
  def ts_tree_root_node(self : Ptr[TSTree])(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_tree_root_node(self, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the root node of the syntax tree.
  */
  def ts_tree_root_node(self : Ptr[TSTree])(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_tree_root_node(self, __return)

  /**
   * Get the root node of the syntax tree, but with its position shifted forward by the given offset.
  */
  def ts_tree_root_node_with_offset(self : Ptr[TSTree], offset_bytes : uint32_t, offset_extent : Ptr[TSPoint])(__return : Ptr[TSNode]): Unit =
    __sn_wrap_treesitter_ts_tree_root_node_with_offset(self, offset_bytes, offset_extent, __return)

  /**
   * Get the root node of the syntax tree, but with its position shifted forward by the given offset.
  */
  def ts_tree_root_node_with_offset(self : Ptr[TSTree], offset_bytes : uint32_t, offset_extent : Ptr[TSPoint])(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    __sn_wrap_treesitter_ts_tree_root_node_with_offset(self, offset_bytes, offset_extent, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /**
   * Get the root node of the syntax tree, but with its position shifted forward by the given offset.
  */
  def ts_tree_root_node_with_offset(self : Ptr[TSTree], offset_bytes : uint32_t, offset_extent : TSPoint)(using Zone): TSNode =
    val __ptr_0: Ptr[TSNode] = _root_.scala.scalanative.unsafe.alloc[TSNode](1)
    val __ptr_1: Ptr[TSPoint] = _root_.scala.scalanative.unsafe.alloc[TSPoint](1)
    !(__ptr_1 + 0) = offset_extent
    __sn_wrap_treesitter_ts_tree_root_node_with_offset(self, offset_bytes, (__ptr_1 + 0), (__ptr_0 + 0))
    !(__ptr_0 + 0)

object types:
    export _root_.treesitter.structs.*
    export _root_.treesitter.aliases.*
    export _root_.treesitter.enumerations.*

object all:
  export _root_.treesitter.enumerations.TSInputEncoding
  export _root_.treesitter.enumerations.TSLogType
  export _root_.treesitter.enumerations.TSQuantifier
  export _root_.treesitter.enumerations.TSQueryError
  export _root_.treesitter.enumerations.TSQueryPredicateStepType
  export _root_.treesitter.enumerations.TSSymbolType
  export _root_.treesitter.enumerations.TSWasmErrorKind
  export _root_.treesitter.aliases.DecodeFunction
  export _root_.treesitter.aliases.TSDecodeFunction
  export _root_.treesitter.aliases.TSFieldId
  export _root_.treesitter.aliases.TSStateId
  export _root_.treesitter.aliases.TSSymbol
  export _root_.treesitter.aliases.int32_t
  export _root_.treesitter.aliases.int64_t
  export _root_.treesitter.aliases.size_t
  export _root_.treesitter.aliases.uint16_t
  export _root_.treesitter.aliases.uint32_t
  export _root_.treesitter.aliases.uint8_t
  export _root_.treesitter.structs.TSInput
  export _root_.treesitter.structs.TSInputEdit
  export _root_.treesitter.structs.TSLanguage
  export _root_.treesitter.structs.TSLanguageMetadata
  export _root_.treesitter.structs.TSLogger
  export _root_.treesitter.structs.TSLookaheadIterator
  export _root_.treesitter.structs.TSNode
  export _root_.treesitter.structs.TSParseOptions
  export _root_.treesitter.structs.TSParseState
  export _root_.treesitter.structs.TSParser
  export _root_.treesitter.structs.TSPoint
  export _root_.treesitter.structs.TSQuery
  export _root_.treesitter.structs.TSQueryCapture
  export _root_.treesitter.structs.TSQueryCursor
  export _root_.treesitter.structs.TSQueryCursorOptions
  export _root_.treesitter.structs.TSQueryCursorState
  export _root_.treesitter.structs.TSQueryMatch
  export _root_.treesitter.structs.TSQueryPredicateStep
  export _root_.treesitter.structs.TSRange
  export _root_.treesitter.structs.TSTree
  export _root_.treesitter.structs.TSTreeCursor
  export _root_.treesitter.structs.TSWasmEngine
  export _root_.treesitter.structs.TSWasmError
  export _root_.treesitter.structs.TSWasmStore
  export _root_.treesitter.structs.wasm_engine_t
  export _root_.treesitter.functions.ts_language_abi_version
  export _root_.treesitter.functions.ts_language_copy
  export _root_.treesitter.functions.ts_language_delete
  export _root_.treesitter.functions.ts_language_field_count
  export _root_.treesitter.functions.ts_language_field_id_for_name
  export _root_.treesitter.functions.ts_language_field_name_for_id
  export _root_.treesitter.functions.ts_language_is_wasm
  export _root_.treesitter.functions.ts_language_metadata
  export _root_.treesitter.functions.ts_language_name
  export _root_.treesitter.functions.ts_language_next_state
  export _root_.treesitter.functions.ts_language_state_count
  export _root_.treesitter.functions.ts_language_subtypes
  export _root_.treesitter.functions.ts_language_supertypes
  export _root_.treesitter.functions.ts_language_symbol_count
  export _root_.treesitter.functions.ts_language_symbol_for_name
  export _root_.treesitter.functions.ts_language_symbol_name
  export _root_.treesitter.functions.ts_language_symbol_type
  export _root_.treesitter.functions.ts_lookahead_iterator_current_symbol
  export _root_.treesitter.functions.ts_lookahead_iterator_current_symbol_name
  export _root_.treesitter.functions.ts_lookahead_iterator_delete
  export _root_.treesitter.functions.ts_lookahead_iterator_language
  export _root_.treesitter.functions.ts_lookahead_iterator_new
  export _root_.treesitter.functions.ts_lookahead_iterator_next
  export _root_.treesitter.functions.ts_lookahead_iterator_reset
  export _root_.treesitter.functions.ts_lookahead_iterator_reset_state
  export _root_.treesitter.functions.ts_node_edit
  export _root_.treesitter.functions.ts_parser_delete
  export _root_.treesitter.functions.ts_parser_included_ranges
  export _root_.treesitter.functions.ts_parser_language
  export _root_.treesitter.functions.ts_parser_new
  export _root_.treesitter.functions.ts_parser_parse_string
  export _root_.treesitter.functions.ts_parser_parse_string_encoding
  export _root_.treesitter.functions.ts_parser_print_dot_graphs
  export _root_.treesitter.functions.ts_parser_reset
  export _root_.treesitter.functions.ts_parser_set_included_ranges
  export _root_.treesitter.functions.ts_parser_set_language
  export _root_.treesitter.functions.ts_parser_set_wasm_store
  export _root_.treesitter.functions.ts_parser_take_wasm_store
  export _root_.treesitter.functions.ts_point_edit
  export _root_.treesitter.functions.ts_query_capture_count
  export _root_.treesitter.functions.ts_query_capture_name_for_id
  export _root_.treesitter.functions.ts_query_capture_quantifier_for_id
  export _root_.treesitter.functions.ts_query_cursor_delete
  export _root_.treesitter.functions.ts_query_cursor_did_exceed_match_limit
  export _root_.treesitter.functions.ts_query_cursor_match_limit
  export _root_.treesitter.functions.ts_query_cursor_new
  export _root_.treesitter.functions.ts_query_cursor_next_capture
  export _root_.treesitter.functions.ts_query_cursor_next_match
  export _root_.treesitter.functions.ts_query_cursor_remove_match
  export _root_.treesitter.functions.ts_query_cursor_set_byte_range
  export _root_.treesitter.functions.ts_query_cursor_set_containing_byte_range
  export _root_.treesitter.functions.ts_query_cursor_set_match_limit
  export _root_.treesitter.functions.ts_query_cursor_set_max_start_depth
  export _root_.treesitter.functions.ts_query_delete
  export _root_.treesitter.functions.ts_query_disable_capture
  export _root_.treesitter.functions.ts_query_disable_pattern
  export _root_.treesitter.functions.ts_query_end_byte_for_pattern
  export _root_.treesitter.functions.ts_query_is_pattern_guaranteed_at_step
  export _root_.treesitter.functions.ts_query_is_pattern_non_local
  export _root_.treesitter.functions.ts_query_is_pattern_rooted
  export _root_.treesitter.functions.ts_query_new
  export _root_.treesitter.functions.ts_query_pattern_count
  export _root_.treesitter.functions.ts_query_predicates_for_pattern
  export _root_.treesitter.functions.ts_query_start_byte_for_pattern
  export _root_.treesitter.functions.ts_query_string_count
  export _root_.treesitter.functions.ts_query_string_value_for_id
  export _root_.treesitter.functions.ts_range_edit
  export _root_.treesitter.functions.ts_set_allocator
  export _root_.treesitter.functions.ts_tree_copy
  export _root_.treesitter.functions.ts_tree_cursor_current_depth
  export _root_.treesitter.functions.ts_tree_cursor_current_descendant_index
  export _root_.treesitter.functions.ts_tree_cursor_current_field_id
  export _root_.treesitter.functions.ts_tree_cursor_current_field_name
  export _root_.treesitter.functions.ts_tree_cursor_delete
  export _root_.treesitter.functions.ts_tree_cursor_goto_descendant
  export _root_.treesitter.functions.ts_tree_cursor_goto_first_child
  export _root_.treesitter.functions.ts_tree_cursor_goto_first_child_for_byte
  export _root_.treesitter.functions.ts_tree_cursor_goto_last_child
  export _root_.treesitter.functions.ts_tree_cursor_goto_next_sibling
  export _root_.treesitter.functions.ts_tree_cursor_goto_parent
  export _root_.treesitter.functions.ts_tree_cursor_goto_previous_sibling
  export _root_.treesitter.functions.ts_tree_cursor_reset_to
  export _root_.treesitter.functions.ts_tree_delete
  export _root_.treesitter.functions.ts_tree_edit
  export _root_.treesitter.functions.ts_tree_get_changed_ranges
  export _root_.treesitter.functions.ts_tree_included_ranges
  export _root_.treesitter.functions.ts_tree_language
  export _root_.treesitter.functions.ts_tree_print_dot_graph
  export _root_.treesitter.functions.ts_wasm_store_delete
  export _root_.treesitter.functions.ts_wasm_store_language_count
  export _root_.treesitter.functions.ts_wasm_store_load_language
  export _root_.treesitter.functions.ts_wasm_store_new
  export _root_.treesitter.functions.ts_node_child
  export _root_.treesitter.functions.ts_node_child_by_field_id
  export _root_.treesitter.functions.ts_node_child_by_field_name
  export _root_.treesitter.functions.ts_node_child_count
  export _root_.treesitter.functions.ts_node_child_with_descendant
  export _root_.treesitter.functions.ts_node_descendant_count
  export _root_.treesitter.functions.ts_node_descendant_for_byte_range
  export _root_.treesitter.functions.ts_node_descendant_for_point_range
  export _root_.treesitter.functions.ts_node_end_byte
  export _root_.treesitter.functions.ts_node_end_point
  export _root_.treesitter.functions.ts_node_eq
  export _root_.treesitter.functions.ts_node_field_name_for_child
  export _root_.treesitter.functions.ts_node_field_name_for_named_child
  export _root_.treesitter.functions.ts_node_first_child_for_byte
  export _root_.treesitter.functions.ts_node_first_named_child_for_byte
  export _root_.treesitter.functions.ts_node_grammar_symbol
  export _root_.treesitter.functions.ts_node_grammar_type
  export _root_.treesitter.functions.ts_node_has_changes
  export _root_.treesitter.functions.ts_node_has_error
  export _root_.treesitter.functions.ts_node_is_error
  export _root_.treesitter.functions.ts_node_is_extra
  export _root_.treesitter.functions.ts_node_is_missing
  export _root_.treesitter.functions.ts_node_is_named
  export _root_.treesitter.functions.ts_node_is_null
  export _root_.treesitter.functions.ts_node_language
  export _root_.treesitter.functions.ts_node_named_child
  export _root_.treesitter.functions.ts_node_named_child_count
  export _root_.treesitter.functions.ts_node_named_descendant_for_byte_range
  export _root_.treesitter.functions.ts_node_named_descendant_for_point_range
  export _root_.treesitter.functions.ts_node_next_named_sibling
  export _root_.treesitter.functions.ts_node_next_parse_state
  export _root_.treesitter.functions.ts_node_next_sibling
  export _root_.treesitter.functions.ts_node_parent
  export _root_.treesitter.functions.ts_node_parse_state
  export _root_.treesitter.functions.ts_node_prev_named_sibling
  export _root_.treesitter.functions.ts_node_prev_sibling
  export _root_.treesitter.functions.ts_node_start_byte
  export _root_.treesitter.functions.ts_node_start_point
  export _root_.treesitter.functions.ts_node_string
  export _root_.treesitter.functions.ts_node_symbol
  export _root_.treesitter.functions.ts_node_type
  export _root_.treesitter.functions.ts_parser_logger
  export _root_.treesitter.functions.ts_parser_parse
  export _root_.treesitter.functions.ts_parser_parse_with_options
  export _root_.treesitter.functions.ts_parser_set_logger
  export _root_.treesitter.functions.ts_query_cursor_exec
  export _root_.treesitter.functions.ts_query_cursor_exec_with_options
  export _root_.treesitter.functions.ts_query_cursor_set_containing_point_range
  export _root_.treesitter.functions.ts_query_cursor_set_point_range
  export _root_.treesitter.functions.ts_tree_cursor_copy
  export _root_.treesitter.functions.ts_tree_cursor_current_node
  export _root_.treesitter.functions.ts_tree_cursor_goto_first_child_for_point
  export _root_.treesitter.functions.ts_tree_cursor_new
  export _root_.treesitter.functions.ts_tree_cursor_reset
  export _root_.treesitter.functions.ts_tree_root_node
  export _root_.treesitter.functions.ts_tree_root_node_with_offset