package libsqlite

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object aliases:
  import _root_.libsqlite.aliases.*
  import _root_.libsqlite.structs.*
  opaque type fts5_extension_function = CFuncPtr5[Ptr[Fts5ExtensionApi], Ptr[Fts5Context], Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit]
  object fts5_extension_function:
    given _tag: Tag[fts5_extension_function] = Tag.materializeCFuncPtr5[Ptr[Fts5ExtensionApi], Ptr[Fts5Context], Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): fts5_extension_function = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr5[Ptr[Fts5ExtensionApi], Ptr[Fts5Context], Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit]): fts5_extension_function = o
    extension (v: fts5_extension_function)
      inline def value: CFuncPtr5[Ptr[Fts5ExtensionApi], Ptr[Fts5Context], Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  opaque type sqlite3_callback = CFuncPtr4[Ptr[Byte], CInt, Ptr[CString], Ptr[CString], CInt]
  object sqlite3_callback:
    given _tag: Tag[sqlite3_callback] = Tag.materializeCFuncPtr4[Ptr[Byte], CInt, Ptr[CString], Ptr[CString], CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): sqlite3_callback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr4[Ptr[Byte], CInt, Ptr[CString], Ptr[CString], CInt]): sqlite3_callback = o
    extension (v: sqlite3_callback)
      inline def value: CFuncPtr4[Ptr[Byte], CInt, Ptr[CString], Ptr[CString], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  opaque type sqlite3_destructor_type = CFuncPtr1[Ptr[Byte], Unit]
  object sqlite3_destructor_type:
    given _tag: Tag[sqlite3_destructor_type] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): sqlite3_destructor_type = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): sqlite3_destructor_type = o
    extension (v: sqlite3_destructor_type)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  opaque type sqlite3_filename = CString
  object sqlite3_filename:
    given _tag: Tag[sqlite3_filename] = Tag.Ptr[CChar](Tag.Byte)
    inline def apply(inline o: CString): sqlite3_filename = o
    extension (v: sqlite3_filename)
      inline def value: CString = v

  type sqlite3_int64 = sqlite_int64
  object sqlite3_int64:
    given _tag: Tag[sqlite3_int64] = sqlite_int64._tag
    inline def apply(inline o: sqlite_int64): sqlite3_int64 = o
    extension (v: sqlite3_int64)
      inline def value: sqlite_int64 = v

  opaque type sqlite3_rtree_dbl = Double
  object sqlite3_rtree_dbl:
    given _tag: Tag[sqlite3_rtree_dbl] = Tag.Double
    inline def apply(inline o: Double): sqlite3_rtree_dbl = o
    extension (v: sqlite3_rtree_dbl)
      inline def value: Double = v

  opaque type sqlite3_syscall_ptr = CFuncPtr0[Unit]
  object sqlite3_syscall_ptr:
    given _tag: Tag[sqlite3_syscall_ptr] = Tag.materializeCFuncPtr0[Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): sqlite3_syscall_ptr = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr0[Unit]): sqlite3_syscall_ptr = o
    extension (v: sqlite3_syscall_ptr)
      inline def value: CFuncPtr0[Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  type sqlite3_uint64 = sqlite_uint64
  object sqlite3_uint64:
    given _tag: Tag[sqlite3_uint64] = sqlite_uint64._tag
    inline def apply(inline o: sqlite_uint64): sqlite3_uint64 = o
    extension (v: sqlite3_uint64)
      inline def value: sqlite_uint64 = v

  opaque type sqlite_int64 = CLongLong
  object sqlite_int64:
    given _tag: Tag[sqlite_int64] = Tag.Long
    inline def apply(inline o: CLongLong): sqlite_int64 = o
    extension (v: sqlite_int64)
      inline def value: CLongLong = v

  opaque type sqlite_uint64 = CUnsignedLongLong
  object sqlite_uint64:
    given _tag: Tag[sqlite_uint64] = Tag.ULong
    inline def apply(inline o: CUnsignedLongLong): sqlite_uint64 = o
    extension (v: sqlite_uint64)
      inline def value: CUnsignedLongLong = v

  type va_list = unsafe.CVarArgList
  object va_list:
    val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
    inline def apply(inline o: unsafe.CVarArgList): va_list = o
    extension (v: va_list)
      inline def value: unsafe.CVarArgList = v

object structs:
  import _root_.libsqlite.aliases.*
  import _root_.libsqlite.structs.*

  opaque type Fts5Context = CStruct0
  
  object Fts5Context:
    given _tag: Tag[Fts5Context] = Tag.materializeCStruct0Tag
    

  opaque type Fts5ExtensionApi = CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]
  
  object Fts5ExtensionApi:
    given _tag: Tag[Fts5ExtensionApi] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]](Tag.Byte, Tag.Digit3[Nat._1, Nat._9, Nat._2](Tag.Nat1, Tag.Nat9, Tag.Nat2))
    
    // Allocates Fts5ExtensionApi on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[Fts5ExtensionApi] = scala.scalanative.unsafe.alloc[Fts5ExtensionApi](1)
    def apply(iVersion : CInt, xUserData : CFuncPtr1[Ptr[Fts5Context], Ptr[Byte]], xColumnCount : CFuncPtr1[Ptr[Fts5Context], CInt], xRowCount : CFuncPtr2[Ptr[Fts5Context], Ptr[sqlite3_int64], CInt], xColumnTotalSize : CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[sqlite3_int64], CInt], xTokenize : CFuncPtr5[Ptr[Fts5Context], CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt], xPhraseCount : CFuncPtr1[Ptr[Fts5Context], CInt], xPhraseSize : CFuncPtr2[Ptr[Fts5Context], CInt, CInt], xInstCount : CFuncPtr2[Ptr[Fts5Context], Ptr[CInt], CInt], xInst : CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], CInt], xRowid : CFuncPtr1[Ptr[Fts5Context], sqlite3_int64], xColumnText : CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt], xColumnSize : CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[CInt], CInt], xQueryPhrase : CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Byte], CFuncPtr3[Ptr[Fts5ExtensionApi], Ptr[Fts5Context], Ptr[Byte], CInt], CInt], xSetAuxdata : CFuncPtr3[Ptr[Fts5Context], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], CInt], xGetAuxdata : CFuncPtr2[Ptr[Fts5Context], CInt, Ptr[Byte]], xPhraseFirst : CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], CInt], xPhraseNext : CFuncPtr4[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], Unit], xPhraseFirstColumn : CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], CInt], xPhraseNextColumn : CFuncPtr3[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Unit], xQueryToken : CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt], xInstToken : CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt], xColumnLocale : CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt], xTokenize_v2 : CFuncPtr7[Ptr[Fts5Context], CString, CInt, CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt])(using Zone): Ptr[Fts5ExtensionApi] =
      val ____ptr = apply()
      (!____ptr).iVersion = iVersion
      (!____ptr).xUserData = xUserData
      (!____ptr).xColumnCount = xColumnCount
      (!____ptr).xRowCount = xRowCount
      (!____ptr).xColumnTotalSize = xColumnTotalSize
      (!____ptr).xTokenize = xTokenize
      (!____ptr).xPhraseCount = xPhraseCount
      (!____ptr).xPhraseSize = xPhraseSize
      (!____ptr).xInstCount = xInstCount
      (!____ptr).xInst = xInst
      (!____ptr).xRowid = xRowid
      (!____ptr).xColumnText = xColumnText
      (!____ptr).xColumnSize = xColumnSize
      (!____ptr).xQueryPhrase = xQueryPhrase
      (!____ptr).xSetAuxdata = xSetAuxdata
      (!____ptr).xGetAuxdata = xGetAuxdata
      (!____ptr).xPhraseFirst = xPhraseFirst
      (!____ptr).xPhraseNext = xPhraseNext
      (!____ptr).xPhraseFirstColumn = xPhraseFirstColumn
      (!____ptr).xPhraseNextColumn = xPhraseNextColumn
      (!____ptr).xQueryToken = xQueryToken
      (!____ptr).xInstToken = xInstToken
      (!____ptr).xColumnLocale = xColumnLocale
      (!____ptr).xTokenize_v2 = xTokenize_v2
      ____ptr
    
    extension (struct: Fts5ExtensionApi)
      def iVersion: CInt = !struct.at(offsets(0)).asInstanceOf[Ptr[CInt]]
      def iVersion_=(value: CInt): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[CInt]] = value
      def xUserData: CFuncPtr1[Ptr[Fts5Context], Ptr[Byte]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[Fts5Context], Ptr[Byte]]]]
      def xUserData_=(value: CFuncPtr1[Ptr[Fts5Context], Ptr[Byte]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[Fts5Context], Ptr[Byte]]]] = value
      def xColumnCount: CFuncPtr1[Ptr[Fts5Context], CInt] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[Fts5Context], CInt]]]
      def xColumnCount_=(value: CFuncPtr1[Ptr[Fts5Context], CInt]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[Fts5Context], CInt]]] = value
      def xRowCount: CFuncPtr2[Ptr[Fts5Context], Ptr[sqlite3_int64], CInt] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[Fts5Context], Ptr[sqlite3_int64], CInt]]]
      def xRowCount_=(value: CFuncPtr2[Ptr[Fts5Context], Ptr[sqlite3_int64], CInt]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[Fts5Context], Ptr[sqlite3_int64], CInt]]] = value
      def xColumnTotalSize: CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[sqlite3_int64], CInt] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[sqlite3_int64], CInt]]]
      def xColumnTotalSize_=(value: CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[sqlite3_int64], CInt]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[sqlite3_int64], CInt]]] = value
      def xTokenize: CFuncPtr5[Ptr[Fts5Context], CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr5[Ptr[Fts5Context], CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]]]
      def xTokenize_=(value: CFuncPtr5[Ptr[Fts5Context], CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr5[Ptr[Fts5Context], CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]]] = value
      def xPhraseCount: CFuncPtr1[Ptr[Fts5Context], CInt] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[Fts5Context], CInt]]]
      def xPhraseCount_=(value: CFuncPtr1[Ptr[Fts5Context], CInt]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[Fts5Context], CInt]]] = value
      def xPhraseSize: CFuncPtr2[Ptr[Fts5Context], CInt, CInt] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[Fts5Context], CInt, CInt]]]
      def xPhraseSize_=(value: CFuncPtr2[Ptr[Fts5Context], CInt, CInt]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[Fts5Context], CInt, CInt]]] = value
      def xInstCount: CFuncPtr2[Ptr[Fts5Context], Ptr[CInt], CInt] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[Fts5Context], Ptr[CInt], CInt]]]
      def xInstCount_=(value: CFuncPtr2[Ptr[Fts5Context], Ptr[CInt], CInt]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[Fts5Context], Ptr[CInt], CInt]]] = value
      def xInst: CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], CInt] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], CInt]]]
      def xInst_=(value: CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], CInt]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], CInt]]] = value
      def xRowid: CFuncPtr1[Ptr[Fts5Context], sqlite3_int64] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[Fts5Context], sqlite3_int64]]]
      def xRowid_=(value: CFuncPtr1[Ptr[Fts5Context], sqlite3_int64]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[Fts5Context], sqlite3_int64]]] = value
      def xColumnText: CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt]]]
      def xColumnText_=(value: CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt]]] = value
      def xColumnSize: CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[CInt], CInt] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[CInt], CInt]]]
      def xColumnSize_=(value: CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[CInt], CInt]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[CInt], CInt]]] = value
      def xQueryPhrase: CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Byte], CFuncPtr3[Ptr[Fts5ExtensionApi], Ptr[Fts5Context], Ptr[Byte], CInt], CInt] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Byte], CFuncPtr3[Ptr[Fts5ExtensionApi], Ptr[Fts5Context], Ptr[Byte], CInt], CInt]]]
      def xQueryPhrase_=(value: CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Byte], CFuncPtr3[Ptr[Fts5ExtensionApi], Ptr[Fts5Context], Ptr[Byte], CInt], CInt]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Byte], CFuncPtr3[Ptr[Fts5ExtensionApi], Ptr[Fts5Context], Ptr[Byte], CInt], CInt]]] = value
      def xSetAuxdata: CFuncPtr3[Ptr[Fts5Context], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], CInt] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr3[Ptr[Fts5Context], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], CInt]]]
      def xSetAuxdata_=(value: CFuncPtr3[Ptr[Fts5Context], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], CInt]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr3[Ptr[Fts5Context], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], CInt]]] = value
      def xGetAuxdata: CFuncPtr2[Ptr[Fts5Context], CInt, Ptr[Byte]] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr2[Ptr[Fts5Context], CInt, Ptr[Byte]]]]
      def xGetAuxdata_=(value: CFuncPtr2[Ptr[Fts5Context], CInt, Ptr[Byte]]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr2[Ptr[Fts5Context], CInt, Ptr[Byte]]]] = value
      def xPhraseFirst: CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], CInt] = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], CInt]]]
      def xPhraseFirst_=(value: CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], CInt]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], CInt]]] = value
      def xPhraseNext: CFuncPtr4[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], Unit] = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], Unit]]]
      def xPhraseNext_=(value: CFuncPtr4[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], Unit]]] = value
      def xPhraseFirstColumn: CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], CInt] = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], CInt]]]
      def xPhraseFirstColumn_=(value: CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], CInt]): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], CInt]]] = value
      def xPhraseNextColumn: CFuncPtr3[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Unit] = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr3[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Unit]]]
      def xPhraseNextColumn_=(value: CFuncPtr3[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Unit]): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr3[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Unit]]] = value
      def xQueryToken: CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt] = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt]]]
      def xQueryToken_=(value: CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt]): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt]]] = value
      def xInstToken: CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt] = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt]]]
      def xInstToken_=(value: CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt]): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt]]] = value
      def xColumnLocale: CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt] = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt]]]
      def xColumnLocale_=(value: CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt]): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt]]] = value
      def xTokenize_v2: CFuncPtr7[Ptr[Fts5Context], CString, CInt, CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt] = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr7[Ptr[Fts5Context], CString, CInt, CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]]]
      def xTokenize_v2_=(value: CFuncPtr7[Ptr[Fts5Context], CString, CInt, CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr7[Ptr[Fts5Context], CString, CInt, CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]]] = value
    val offsets: Array[Int] =
      val res = Array.ofDim[Int](24)
      def align(offset: Int, alignment: Int) = {
        val alignmentMask = alignment - 1
        val padding =
          if ((offset & alignmentMask) == 0) 0
          else alignment - (offset & alignmentMask)
        offset + padding
      }
      
      res(0) = align(0, alignmentof[CInt].toInt)
      res(1) = align(res(0) + sizeof[CInt].toInt, alignmentof[CFuncPtr1[Ptr[Fts5Context], Ptr[Byte]]].toInt)
      res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[Fts5Context], Ptr[Byte]]].toInt, alignmentof[CFuncPtr1[Ptr[Fts5Context], CInt]].toInt)
      res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[Fts5Context], CInt]].toInt, alignmentof[CFuncPtr2[Ptr[Fts5Context], Ptr[sqlite3_int64], CInt]].toInt)
      res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[Fts5Context], Ptr[sqlite3_int64], CInt]].toInt, alignmentof[CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[sqlite3_int64], CInt]].toInt)
      res(5) = align(res(4) + sizeof[CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[sqlite3_int64], CInt]].toInt, alignmentof[CFuncPtr5[Ptr[Fts5Context], CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]].toInt)
      res(6) = align(res(5) + sizeof[CFuncPtr5[Ptr[Fts5Context], CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[Fts5Context], CInt]].toInt)
      res(7) = align(res(6) + sizeof[CFuncPtr1[Ptr[Fts5Context], CInt]].toInt, alignmentof[CFuncPtr2[Ptr[Fts5Context], CInt, CInt]].toInt)
      res(8) = align(res(7) + sizeof[CFuncPtr2[Ptr[Fts5Context], CInt, CInt]].toInt, alignmentof[CFuncPtr2[Ptr[Fts5Context], Ptr[CInt], CInt]].toInt)
      res(9) = align(res(8) + sizeof[CFuncPtr2[Ptr[Fts5Context], Ptr[CInt], CInt]].toInt, alignmentof[CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], CInt]].toInt)
      res(10) = align(res(9) + sizeof[CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[Fts5Context], sqlite3_int64]].toInt)
      res(11) = align(res(10) + sizeof[CFuncPtr1[Ptr[Fts5Context], sqlite3_int64]].toInt, alignmentof[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt]].toInt)
      res(12) = align(res(11) + sizeof[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt]].toInt, alignmentof[CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[CInt], CInt]].toInt)
      res(13) = align(res(12) + sizeof[CFuncPtr3[Ptr[Fts5Context], CInt, Ptr[CInt], CInt]].toInt, alignmentof[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Byte], CFuncPtr3[Ptr[Fts5ExtensionApi], Ptr[Fts5Context], Ptr[Byte], CInt], CInt]].toInt)
      res(14) = align(res(13) + sizeof[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Byte], CFuncPtr3[Ptr[Fts5ExtensionApi], Ptr[Fts5Context], Ptr[Byte], CInt], CInt]].toInt, alignmentof[CFuncPtr3[Ptr[Fts5Context], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], CInt]].toInt)
      res(15) = align(res(14) + sizeof[CFuncPtr3[Ptr[Fts5Context], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], CInt]].toInt, alignmentof[CFuncPtr2[Ptr[Fts5Context], CInt, Ptr[Byte]]].toInt)
      res(16) = align(res(15) + sizeof[CFuncPtr2[Ptr[Fts5Context], CInt, Ptr[Byte]]].toInt, alignmentof[CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], CInt]].toInt)
      res(17) = align(res(16) + sizeof[CFuncPtr5[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], CInt]].toInt, alignmentof[CFuncPtr4[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], Unit]].toInt)
      res(18) = align(res(17) + sizeof[CFuncPtr4[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Ptr[CInt], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], CInt]].toInt)
      res(19) = align(res(18) + sizeof[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[Fts5PhraseIter], Ptr[CInt], CInt]].toInt, alignmentof[CFuncPtr3[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Unit]].toInt)
      res(20) = align(res(19) + sizeof[CFuncPtr3[Ptr[Fts5Context], Ptr[Fts5PhraseIter], Ptr[CInt], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt]].toInt)
      res(21) = align(res(20) + sizeof[CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt]].toInt, alignmentof[CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt]].toInt)
      res(22) = align(res(21) + sizeof[CFuncPtr5[Ptr[Fts5Context], CInt, CInt, Ptr[CString], Ptr[CInt], CInt]].toInt, alignmentof[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt]].toInt)
      res(23) = align(res(22) + sizeof[CFuncPtr4[Ptr[Fts5Context], CInt, Ptr[CString], Ptr[CInt], CInt]].toInt, alignmentof[CFuncPtr7[Ptr[Fts5Context], CString, CInt, CString, CInt, Ptr[Byte], CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]].toInt)
      res
    end offsets
    

  opaque type Fts5PhraseIter = CStruct2[Ptr[CUnsignedChar], Ptr[CUnsignedChar]]
  
  object Fts5PhraseIter:
    given _tag: Tag[Fts5PhraseIter] = Tag.materializeCStruct2Tag[Ptr[CUnsignedChar], Ptr[CUnsignedChar]]
    
    // Allocates Fts5PhraseIter on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[Fts5PhraseIter] = scala.scalanative.unsafe.alloc[Fts5PhraseIter](1)
    def apply(a : Ptr[CUnsignedChar], b : Ptr[CUnsignedChar])(using Zone): Ptr[Fts5PhraseIter] =
      val ____ptr = apply()
      (!____ptr).a = a
      (!____ptr).b = b
      ____ptr
    
    extension (struct: Fts5PhraseIter)
      def a : Ptr[CUnsignedChar] = struct._1
      def a_=(value: Ptr[CUnsignedChar]): Unit = !struct.at1 = value
      def b : Ptr[CUnsignedChar] = struct._2
      def b_=(value: Ptr[CUnsignedChar]): Unit = !struct.at2 = value
    

  opaque type Fts5Tokenizer = CStruct0
  
  object Fts5Tokenizer:
    given _tag: Tag[Fts5Tokenizer] = Tag.materializeCStruct0Tag
    

  opaque type fts5_api = CStruct6[CInt, CFuncPtr5[Ptr[Byte], CString, Ptr[Byte], Ptr[fts5_tokenizer], CFuncPtr1[Ptr[Byte], Unit], CInt], CFuncPtr4[Ptr[Byte], CString, Ptr[Ptr[Byte]], Ptr[fts5_tokenizer], CInt], CFuncPtr5[Ptr[Byte], CString, Ptr[Byte], fts5_extension_function, CFuncPtr1[Ptr[Byte], Unit], CInt], CFuncPtr5[Ptr[Byte], CString, Ptr[Byte], Ptr[fts5_tokenizer_v2], CFuncPtr1[Ptr[Byte], Unit], CInt], CFuncPtr4[Ptr[Byte], CString, Ptr[Ptr[Byte]], Ptr[Ptr[fts5_tokenizer_v2]], CInt]]
  
  object fts5_api:
    given _tag: Tag[fts5_api] = Tag.materializeCStruct6Tag[CInt, CFuncPtr5[Ptr[Byte], CString, Ptr[Byte], Ptr[fts5_tokenizer], CFuncPtr1[Ptr[Byte], Unit], CInt], CFuncPtr4[Ptr[Byte], CString, Ptr[Ptr[Byte]], Ptr[fts5_tokenizer], CInt], CFuncPtr5[Ptr[Byte], CString, Ptr[Byte], fts5_extension_function, CFuncPtr1[Ptr[Byte], Unit], CInt], CFuncPtr5[Ptr[Byte], CString, Ptr[Byte], Ptr[fts5_tokenizer_v2], CFuncPtr1[Ptr[Byte], Unit], CInt], CFuncPtr4[Ptr[Byte], CString, Ptr[Ptr[Byte]], Ptr[Ptr[fts5_tokenizer_v2]], CInt]]
    
    // Allocates fts5_api on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[fts5_api] = scala.scalanative.unsafe.alloc[fts5_api](1)
    def apply(iVersion : CInt, xCreateTokenizer : CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], Ptr[fts5_tokenizer], CFuncPtr1[Ptr[Byte], Unit], CInt], xFindTokenizer : CFuncPtr4[Ptr[fts5_api], CString, Ptr[Ptr[Byte]], Ptr[fts5_tokenizer], CInt], xCreateFunction : CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], fts5_extension_function, CFuncPtr1[Ptr[Byte], Unit], CInt], xCreateTokenizer_v2 : CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], Ptr[fts5_tokenizer_v2], CFuncPtr1[Ptr[Byte], Unit], CInt], xFindTokenizer_v2 : CFuncPtr4[Ptr[fts5_api], CString, Ptr[Ptr[Byte]], Ptr[Ptr[fts5_tokenizer_v2]], CInt])(using Zone): Ptr[fts5_api] =
      val ____ptr = apply()
      (!____ptr).iVersion = iVersion
      (!____ptr).xCreateTokenizer = xCreateTokenizer
      (!____ptr).xFindTokenizer = xFindTokenizer
      (!____ptr).xCreateFunction = xCreateFunction
      (!____ptr).xCreateTokenizer_v2 = xCreateTokenizer_v2
      (!____ptr).xFindTokenizer_v2 = xFindTokenizer_v2
      ____ptr
    
    extension (struct: fts5_api)
      def iVersion : CInt = struct._1
      def iVersion_=(value: CInt): Unit = !struct.at1 = value
      def xCreateTokenizer : CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], Ptr[fts5_tokenizer], CFuncPtr1[Ptr[Byte], Unit], CInt] = struct._2.asInstanceOf[CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], Ptr[fts5_tokenizer], CFuncPtr1[Ptr[Byte], Unit], CInt]]
      def xCreateTokenizer_=(value: CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], Ptr[fts5_tokenizer], CFuncPtr1[Ptr[Byte], Unit], CInt]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr5[Ptr[Byte], CString, Ptr[Byte], Ptr[fts5_tokenizer], CFuncPtr1[Ptr[Byte], Unit], CInt]]
      def xFindTokenizer : CFuncPtr4[Ptr[fts5_api], CString, Ptr[Ptr[Byte]], Ptr[fts5_tokenizer], CInt] = struct._3.asInstanceOf[CFuncPtr4[Ptr[fts5_api], CString, Ptr[Ptr[Byte]], Ptr[fts5_tokenizer], CInt]]
      def xFindTokenizer_=(value: CFuncPtr4[Ptr[fts5_api], CString, Ptr[Ptr[Byte]], Ptr[fts5_tokenizer], CInt]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], CString, Ptr[Ptr[Byte]], Ptr[fts5_tokenizer], CInt]]
      def xCreateFunction : CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], fts5_extension_function, CFuncPtr1[Ptr[Byte], Unit], CInt] = struct._4.asInstanceOf[CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], fts5_extension_function, CFuncPtr1[Ptr[Byte], Unit], CInt]]
      def xCreateFunction_=(value: CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], fts5_extension_function, CFuncPtr1[Ptr[Byte], Unit], CInt]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr5[Ptr[Byte], CString, Ptr[Byte], fts5_extension_function, CFuncPtr1[Ptr[Byte], Unit], CInt]]
      def xCreateTokenizer_v2 : CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], Ptr[fts5_tokenizer_v2], CFuncPtr1[Ptr[Byte], Unit], CInt] = struct._5.asInstanceOf[CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], Ptr[fts5_tokenizer_v2], CFuncPtr1[Ptr[Byte], Unit], CInt]]
      def xCreateTokenizer_v2_=(value: CFuncPtr5[Ptr[fts5_api], CString, Ptr[Byte], Ptr[fts5_tokenizer_v2], CFuncPtr1[Ptr[Byte], Unit], CInt]): Unit = !struct.at5 = value.asInstanceOf[CFuncPtr5[Ptr[Byte], CString, Ptr[Byte], Ptr[fts5_tokenizer_v2], CFuncPtr1[Ptr[Byte], Unit], CInt]]
      def xFindTokenizer_v2 : CFuncPtr4[Ptr[fts5_api], CString, Ptr[Ptr[Byte]], Ptr[Ptr[fts5_tokenizer_v2]], CInt] = struct._6.asInstanceOf[CFuncPtr4[Ptr[fts5_api], CString, Ptr[Ptr[Byte]], Ptr[Ptr[fts5_tokenizer_v2]], CInt]]
      def xFindTokenizer_v2_=(value: CFuncPtr4[Ptr[fts5_api], CString, Ptr[Ptr[Byte]], Ptr[Ptr[fts5_tokenizer_v2]], CInt]): Unit = !struct.at6 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], CString, Ptr[Ptr[Byte]], Ptr[Ptr[fts5_tokenizer_v2]], CInt]]
    

  opaque type fts5_tokenizer = CStruct3[CFuncPtr4[Ptr[Byte], Ptr[CString], CInt, Ptr[Ptr[Fts5Tokenizer]], CInt], CFuncPtr1[Ptr[Fts5Tokenizer], Unit], CFuncPtr6[Ptr[Fts5Tokenizer], Ptr[Byte], CInt, CString, CInt, CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]]
  
  object fts5_tokenizer:
    given _tag: Tag[fts5_tokenizer] = Tag.materializeCStruct3Tag[CFuncPtr4[Ptr[Byte], Ptr[CString], CInt, Ptr[Ptr[Fts5Tokenizer]], CInt], CFuncPtr1[Ptr[Fts5Tokenizer], Unit], CFuncPtr6[Ptr[Fts5Tokenizer], Ptr[Byte], CInt, CString, CInt, CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]]
    
    // Allocates fts5_tokenizer on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[fts5_tokenizer] = scala.scalanative.unsafe.alloc[fts5_tokenizer](1)
    def apply(xCreate : CFuncPtr4[Ptr[Byte], Ptr[CString], CInt, Ptr[Ptr[Fts5Tokenizer]], CInt], xDelete : CFuncPtr1[Ptr[Fts5Tokenizer], Unit], xTokenize : CFuncPtr6[Ptr[Fts5Tokenizer], Ptr[Byte], CInt, CString, CInt, CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt])(using Zone): Ptr[fts5_tokenizer] =
      val ____ptr = apply()
      (!____ptr).xCreate = xCreate
      (!____ptr).xDelete = xDelete
      (!____ptr).xTokenize = xTokenize
      ____ptr
    
    extension (struct: fts5_tokenizer)
      def xCreate : CFuncPtr4[Ptr[Byte], Ptr[CString], CInt, Ptr[Ptr[Fts5Tokenizer]], CInt] = struct._1
      def xCreate_=(value: CFuncPtr4[Ptr[Byte], Ptr[CString], CInt, Ptr[Ptr[Fts5Tokenizer]], CInt]): Unit = !struct.at1 = value
      def xDelete : CFuncPtr1[Ptr[Fts5Tokenizer], Unit] = struct._2
      def xDelete_=(value: CFuncPtr1[Ptr[Fts5Tokenizer], Unit]): Unit = !struct.at2 = value
      def xTokenize : CFuncPtr6[Ptr[Fts5Tokenizer], Ptr[Byte], CInt, CString, CInt, CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt] = struct._3
      def xTokenize_=(value: CFuncPtr6[Ptr[Fts5Tokenizer], Ptr[Byte], CInt, CString, CInt, CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]): Unit = !struct.at3 = value
    

  opaque type fts5_tokenizer_v2 = CStruct4[CInt, CFuncPtr4[Ptr[Byte], Ptr[CString], CInt, Ptr[Ptr[Fts5Tokenizer]], CInt], CFuncPtr1[Ptr[Fts5Tokenizer], Unit], CFuncPtr8[Ptr[Fts5Tokenizer], Ptr[Byte], CInt, CString, CInt, CString, CInt, CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]]
  
  object fts5_tokenizer_v2:
    given _tag: Tag[fts5_tokenizer_v2] = Tag.materializeCStruct4Tag[CInt, CFuncPtr4[Ptr[Byte], Ptr[CString], CInt, Ptr[Ptr[Fts5Tokenizer]], CInt], CFuncPtr1[Ptr[Fts5Tokenizer], Unit], CFuncPtr8[Ptr[Fts5Tokenizer], Ptr[Byte], CInt, CString, CInt, CString, CInt, CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]]
    
    // Allocates fts5_tokenizer_v2 on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[fts5_tokenizer_v2] = scala.scalanative.unsafe.alloc[fts5_tokenizer_v2](1)
    def apply(iVersion : CInt, xCreate : CFuncPtr4[Ptr[Byte], Ptr[CString], CInt, Ptr[Ptr[Fts5Tokenizer]], CInt], xDelete : CFuncPtr1[Ptr[Fts5Tokenizer], Unit], xTokenize : CFuncPtr8[Ptr[Fts5Tokenizer], Ptr[Byte], CInt, CString, CInt, CString, CInt, CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt])(using Zone): Ptr[fts5_tokenizer_v2] =
      val ____ptr = apply()
      (!____ptr).iVersion = iVersion
      (!____ptr).xCreate = xCreate
      (!____ptr).xDelete = xDelete
      (!____ptr).xTokenize = xTokenize
      ____ptr
    
    extension (struct: fts5_tokenizer_v2)
      def iVersion : CInt = struct._1
      def iVersion_=(value: CInt): Unit = !struct.at1 = value
      def xCreate : CFuncPtr4[Ptr[Byte], Ptr[CString], CInt, Ptr[Ptr[Fts5Tokenizer]], CInt] = struct._2
      def xCreate_=(value: CFuncPtr4[Ptr[Byte], Ptr[CString], CInt, Ptr[Ptr[Fts5Tokenizer]], CInt]): Unit = !struct.at2 = value
      def xDelete : CFuncPtr1[Ptr[Fts5Tokenizer], Unit] = struct._3
      def xDelete_=(value: CFuncPtr1[Ptr[Fts5Tokenizer], Unit]): Unit = !struct.at3 = value
      def xTokenize : CFuncPtr8[Ptr[Fts5Tokenizer], Ptr[Byte], CInt, CString, CInt, CString, CInt, CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt] = struct._4
      def xTokenize_=(value: CFuncPtr8[Ptr[Fts5Tokenizer], Ptr[Byte], CInt, CString, CInt, CString, CInt, CFuncPtr6[Ptr[Byte], CInt, CString, CInt, CInt, CInt, CInt], CInt]): Unit = !struct.at4 = value
    

  opaque type sqlite3 = CStruct0
  
  object sqlite3:
    given _tag: Tag[sqlite3] = Tag.materializeCStruct0Tag
    

  opaque type sqlite3_api_routines = CStruct0
  
  object sqlite3_api_routines:
    given _tag: Tag[sqlite3_api_routines] = Tag.materializeCStruct0Tag
    

  opaque type sqlite3_backup = CStruct0
  
  object sqlite3_backup:
    given _tag: Tag[sqlite3_backup] = Tag.materializeCStruct0Tag
    

  opaque type sqlite3_blob = CStruct0
  
  object sqlite3_blob:
    given _tag: Tag[sqlite3_blob] = Tag.materializeCStruct0Tag
    

  opaque type sqlite3_context = CStruct0
  
  object sqlite3_context:
    given _tag: Tag[sqlite3_context] = Tag.materializeCStruct0Tag
    

  opaque type sqlite3_file = CStruct1[Ptr[Byte]]
  
  object sqlite3_file:
    given _tag: Tag[sqlite3_file] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    // Allocates sqlite3_file on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_file] = scala.scalanative.unsafe.alloc[sqlite3_file](1)
    def apply(pMethods : Ptr[sqlite3_io_methods])(using Zone): Ptr[sqlite3_file] =
      val ____ptr = apply()
      (!____ptr).pMethods = pMethods
      ____ptr
    
    extension (struct: sqlite3_file)
      def pMethods : Ptr[sqlite3_io_methods] = struct._1.asInstanceOf[Ptr[sqlite3_io_methods]]
      def pMethods_=(value: Ptr[sqlite3_io_methods]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
    

  opaque type sqlite3_index_constraint = CStruct4[CInt, CUnsignedChar, CUnsignedChar, CInt]
  
  object sqlite3_index_constraint:
    given _tag: Tag[sqlite3_index_constraint] = Tag.materializeCStruct4Tag[CInt, CUnsignedChar, CUnsignedChar, CInt]
    
    // Allocates sqlite3_index_constraint on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_index_constraint] = scala.scalanative.unsafe.alloc[sqlite3_index_constraint](1)
    def apply(iColumn : CInt, op : CUnsignedChar, usable : CUnsignedChar, iTermOffset : CInt)(using Zone): Ptr[sqlite3_index_constraint] =
      val ____ptr = apply()
      (!____ptr).iColumn = iColumn
      (!____ptr).op = op
      (!____ptr).usable = usable
      (!____ptr).iTermOffset = iTermOffset
      ____ptr
    
    extension (struct: sqlite3_index_constraint)
      def iColumn : CInt = struct._1
      def iColumn_=(value: CInt): Unit = !struct.at1 = value
      def op : CUnsignedChar = struct._2
      def op_=(value: CUnsignedChar): Unit = !struct.at2 = value
      def usable : CUnsignedChar = struct._3
      def usable_=(value: CUnsignedChar): Unit = !struct.at3 = value
      def iTermOffset : CInt = struct._4
      def iTermOffset_=(value: CInt): Unit = !struct.at4 = value
    

  opaque type sqlite3_index_constraint_usage = CStruct2[CInt, CUnsignedChar]
  
  object sqlite3_index_constraint_usage:
    given _tag: Tag[sqlite3_index_constraint_usage] = Tag.materializeCStruct2Tag[CInt, CUnsignedChar]
    
    // Allocates sqlite3_index_constraint_usage on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_index_constraint_usage] = scala.scalanative.unsafe.alloc[sqlite3_index_constraint_usage](1)
    def apply(argvIndex : CInt, omit : CUnsignedChar)(using Zone): Ptr[sqlite3_index_constraint_usage] =
      val ____ptr = apply()
      (!____ptr).argvIndex = argvIndex
      (!____ptr).omit = omit
      ____ptr
    
    extension (struct: sqlite3_index_constraint_usage)
      def argvIndex : CInt = struct._1
      def argvIndex_=(value: CInt): Unit = !struct.at1 = value
      def omit : CUnsignedChar = struct._2
      def omit_=(value: CUnsignedChar): Unit = !struct.at2 = value
    

  opaque type sqlite3_index_info = CStruct13[CInt, Ptr[sqlite3_index_constraint], CInt, Ptr[sqlite3_index_orderby], Ptr[sqlite3_index_constraint_usage], CInt, CString, CInt, CInt, Double, sqlite3_int64, CInt, sqlite3_uint64]
  
  object sqlite3_index_info:
    given _tag: Tag[sqlite3_index_info] = Tag.materializeCStruct13Tag[CInt, Ptr[sqlite3_index_constraint], CInt, Ptr[sqlite3_index_orderby], Ptr[sqlite3_index_constraint_usage], CInt, CString, CInt, CInt, Double, sqlite3_int64, CInt, sqlite3_uint64]
    
    // Allocates sqlite3_index_info on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_index_info] = scala.scalanative.unsafe.alloc[sqlite3_index_info](1)
    def apply(nConstraint : CInt, aConstraint : Ptr[sqlite3_index_constraint], nOrderBy : CInt, aOrderBy : Ptr[sqlite3_index_orderby], aConstraintUsage : Ptr[sqlite3_index_constraint_usage], idxNum : CInt, idxStr : CString, needToFreeIdxStr : CInt, orderByConsumed : CInt, estimatedCost : Double, estimatedRows : sqlite3_int64, idxFlags : CInt, colUsed : sqlite3_uint64)(using Zone): Ptr[sqlite3_index_info] =
      val ____ptr = apply()
      (!____ptr).nConstraint = nConstraint
      (!____ptr).aConstraint = aConstraint
      (!____ptr).nOrderBy = nOrderBy
      (!____ptr).aOrderBy = aOrderBy
      (!____ptr).aConstraintUsage = aConstraintUsage
      (!____ptr).idxNum = idxNum
      (!____ptr).idxStr = idxStr
      (!____ptr).needToFreeIdxStr = needToFreeIdxStr
      (!____ptr).orderByConsumed = orderByConsumed
      (!____ptr).estimatedCost = estimatedCost
      (!____ptr).estimatedRows = estimatedRows
      (!____ptr).idxFlags = idxFlags
      (!____ptr).colUsed = colUsed
      ____ptr
    
    extension (struct: sqlite3_index_info)
      def nConstraint : CInt = struct._1
      def nConstraint_=(value: CInt): Unit = !struct.at1 = value
      def aConstraint : Ptr[sqlite3_index_constraint] = struct._2
      def aConstraint_=(value: Ptr[sqlite3_index_constraint]): Unit = !struct.at2 = value
      def nOrderBy : CInt = struct._3
      def nOrderBy_=(value: CInt): Unit = !struct.at3 = value
      def aOrderBy : Ptr[sqlite3_index_orderby] = struct._4
      def aOrderBy_=(value: Ptr[sqlite3_index_orderby]): Unit = !struct.at4 = value
      def aConstraintUsage : Ptr[sqlite3_index_constraint_usage] = struct._5
      def aConstraintUsage_=(value: Ptr[sqlite3_index_constraint_usage]): Unit = !struct.at5 = value
      def idxNum : CInt = struct._6
      def idxNum_=(value: CInt): Unit = !struct.at6 = value
      def idxStr : CString = struct._7
      def idxStr_=(value: CString): Unit = !struct.at7 = value
      def needToFreeIdxStr : CInt = struct._8
      def needToFreeIdxStr_=(value: CInt): Unit = !struct.at8 = value
      def orderByConsumed : CInt = struct._9
      def orderByConsumed_=(value: CInt): Unit = !struct.at9 = value
      def estimatedCost : Double = struct._10
      def estimatedCost_=(value: Double): Unit = !struct.at10 = value
      def estimatedRows : sqlite3_int64 = struct._11
      def estimatedRows_=(value: sqlite3_int64): Unit = !struct.at11 = value
      def idxFlags : CInt = struct._12
      def idxFlags_=(value: CInt): Unit = !struct.at12 = value
      def colUsed : sqlite3_uint64 = struct._13
      def colUsed_=(value: sqlite3_uint64): Unit = !struct.at13 = value
    

  opaque type sqlite3_index_orderby = CStruct2[CInt, CUnsignedChar]
  
  object sqlite3_index_orderby:
    given _tag: Tag[sqlite3_index_orderby] = Tag.materializeCStruct2Tag[CInt, CUnsignedChar]
    
    // Allocates sqlite3_index_orderby on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_index_orderby] = scala.scalanative.unsafe.alloc[sqlite3_index_orderby](1)
    def apply(iColumn : CInt, desc : CUnsignedChar)(using Zone): Ptr[sqlite3_index_orderby] =
      val ____ptr = apply()
      (!____ptr).iColumn = iColumn
      (!____ptr).desc = desc
      ____ptr
    
    extension (struct: sqlite3_index_orderby)
      def iColumn : CInt = struct._1
      def iColumn_=(value: CInt): Unit = !struct.at1 = value
      def desc : CUnsignedChar = struct._2
      def desc_=(value: CUnsignedChar): Unit = !struct.at2 = value
    

  opaque type sqlite3_io_methods = CStruct19[CInt, CFuncPtr1[Ptr[Byte], CInt], CFuncPtr4[Ptr[Byte], Ptr[Byte], CInt, sqlite3_int64, CInt], CFuncPtr4[Ptr[Byte], Ptr[Byte], CInt, sqlite3_int64, CInt], CFuncPtr2[Ptr[Byte], sqlite3_int64, CInt], CFuncPtr2[Ptr[Byte], CInt, CInt], CFuncPtr2[Ptr[Byte], Ptr[sqlite3_int64], CInt], CFuncPtr2[Ptr[Byte], CInt, CInt], CFuncPtr2[Ptr[Byte], CInt, CInt], CFuncPtr2[Ptr[Byte], Ptr[CInt], CInt], CFuncPtr3[Ptr[Byte], CInt, Ptr[Byte], CInt], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr5[Ptr[Byte], CInt, CInt, CInt, Ptr[Ptr[Byte]], CInt], CFuncPtr4[Ptr[Byte], CInt, CInt, CInt, CInt], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], CInt, CInt], CFuncPtr4[Ptr[Byte], sqlite3_int64, CInt, Ptr[Ptr[Byte]], CInt], CFuncPtr3[Ptr[Byte], sqlite3_int64, Ptr[Byte], CInt]]
  
  object sqlite3_io_methods:
    given _tag: Tag[sqlite3_io_methods] = Tag.materializeCStruct19Tag[CInt, CFuncPtr1[Ptr[Byte], CInt], CFuncPtr4[Ptr[Byte], Ptr[Byte], CInt, sqlite3_int64, CInt], CFuncPtr4[Ptr[Byte], Ptr[Byte], CInt, sqlite3_int64, CInt], CFuncPtr2[Ptr[Byte], sqlite3_int64, CInt], CFuncPtr2[Ptr[Byte], CInt, CInt], CFuncPtr2[Ptr[Byte], Ptr[sqlite3_int64], CInt], CFuncPtr2[Ptr[Byte], CInt, CInt], CFuncPtr2[Ptr[Byte], CInt, CInt], CFuncPtr2[Ptr[Byte], Ptr[CInt], CInt], CFuncPtr3[Ptr[Byte], CInt, Ptr[Byte], CInt], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr5[Ptr[Byte], CInt, CInt, CInt, Ptr[Ptr[Byte]], CInt], CFuncPtr4[Ptr[Byte], CInt, CInt, CInt, CInt], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], CInt, CInt], CFuncPtr4[Ptr[Byte], sqlite3_int64, CInt, Ptr[Ptr[Byte]], CInt], CFuncPtr3[Ptr[Byte], sqlite3_int64, Ptr[Byte], CInt]]
    
    // Allocates sqlite3_io_methods on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_io_methods] = scala.scalanative.unsafe.alloc[sqlite3_io_methods](1)
    def apply(iVersion : CInt, xClose : CFuncPtr1[Ptr[sqlite3_file], CInt], xRead : CFuncPtr4[Ptr[sqlite3_file], Ptr[Byte], CInt, sqlite3_int64, CInt], xWrite : CFuncPtr4[Ptr[sqlite3_file], Ptr[Byte], CInt, sqlite3_int64, CInt], xTruncate : CFuncPtr2[Ptr[sqlite3_file], sqlite3_int64, CInt], xSync : CFuncPtr2[Ptr[sqlite3_file], CInt, CInt], xFileSize : CFuncPtr2[Ptr[sqlite3_file], Ptr[sqlite3_int64], CInt], xLock : CFuncPtr2[Ptr[sqlite3_file], CInt, CInt], xUnlock : CFuncPtr2[Ptr[sqlite3_file], CInt, CInt], xCheckReservedLock : CFuncPtr2[Ptr[sqlite3_file], Ptr[CInt], CInt], xFileControl : CFuncPtr3[Ptr[sqlite3_file], CInt, Ptr[Byte], CInt], xSectorSize : CFuncPtr1[Ptr[sqlite3_file], CInt], xDeviceCharacteristics : CFuncPtr1[Ptr[sqlite3_file], CInt], xShmMap : CFuncPtr5[Ptr[sqlite3_file], CInt, CInt, CInt, Ptr[Ptr[Byte]], CInt], xShmLock : CFuncPtr4[Ptr[sqlite3_file], CInt, CInt, CInt, CInt], xShmBarrier : CFuncPtr1[Ptr[sqlite3_file], Unit], xShmUnmap : CFuncPtr2[Ptr[sqlite3_file], CInt, CInt], xFetch : CFuncPtr4[Ptr[sqlite3_file], sqlite3_int64, CInt, Ptr[Ptr[Byte]], CInt], xUnfetch : CFuncPtr3[Ptr[sqlite3_file], sqlite3_int64, Ptr[Byte], CInt])(using Zone): Ptr[sqlite3_io_methods] =
      val ____ptr = apply()
      (!____ptr).iVersion = iVersion
      (!____ptr).xClose = xClose
      (!____ptr).xRead = xRead
      (!____ptr).xWrite = xWrite
      (!____ptr).xTruncate = xTruncate
      (!____ptr).xSync = xSync
      (!____ptr).xFileSize = xFileSize
      (!____ptr).xLock = xLock
      (!____ptr).xUnlock = xUnlock
      (!____ptr).xCheckReservedLock = xCheckReservedLock
      (!____ptr).xFileControl = xFileControl
      (!____ptr).xSectorSize = xSectorSize
      (!____ptr).xDeviceCharacteristics = xDeviceCharacteristics
      (!____ptr).xShmMap = xShmMap
      (!____ptr).xShmLock = xShmLock
      (!____ptr).xShmBarrier = xShmBarrier
      (!____ptr).xShmUnmap = xShmUnmap
      (!____ptr).xFetch = xFetch
      (!____ptr).xUnfetch = xUnfetch
      ____ptr
    
    extension (struct: sqlite3_io_methods)
      def iVersion : CInt = struct._1
      def iVersion_=(value: CInt): Unit = !struct.at1 = value
      def xClose : CFuncPtr1[Ptr[sqlite3_file], CInt] = struct._2.asInstanceOf[CFuncPtr1[Ptr[sqlite3_file], CInt]]
      def xClose_=(value: CFuncPtr1[Ptr[sqlite3_file], CInt]): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], CInt]]
      def xRead : CFuncPtr4[Ptr[sqlite3_file], Ptr[Byte], CInt, sqlite3_int64, CInt] = struct._3.asInstanceOf[CFuncPtr4[Ptr[sqlite3_file], Ptr[Byte], CInt, sqlite3_int64, CInt]]
      def xRead_=(value: CFuncPtr4[Ptr[sqlite3_file], Ptr[Byte], CInt, sqlite3_int64, CInt]): Unit = !struct.at3 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], Ptr[Byte], CInt, sqlite3_int64, CInt]]
      def xWrite : CFuncPtr4[Ptr[sqlite3_file], Ptr[Byte], CInt, sqlite3_int64, CInt] = struct._4.asInstanceOf[CFuncPtr4[Ptr[sqlite3_file], Ptr[Byte], CInt, sqlite3_int64, CInt]]
      def xWrite_=(value: CFuncPtr4[Ptr[sqlite3_file], Ptr[Byte], CInt, sqlite3_int64, CInt]): Unit = !struct.at4 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], Ptr[Byte], CInt, sqlite3_int64, CInt]]
      def xTruncate : CFuncPtr2[Ptr[sqlite3_file], sqlite3_int64, CInt] = struct._5.asInstanceOf[CFuncPtr2[Ptr[sqlite3_file], sqlite3_int64, CInt]]
      def xTruncate_=(value: CFuncPtr2[Ptr[sqlite3_file], sqlite3_int64, CInt]): Unit = !struct.at5 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], sqlite3_int64, CInt]]
      def xSync : CFuncPtr2[Ptr[sqlite3_file], CInt, CInt] = struct._6.asInstanceOf[CFuncPtr2[Ptr[sqlite3_file], CInt, CInt]]
      def xSync_=(value: CFuncPtr2[Ptr[sqlite3_file], CInt, CInt]): Unit = !struct.at6 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], CInt, CInt]]
      def xFileSize : CFuncPtr2[Ptr[sqlite3_file], Ptr[sqlite3_int64], CInt] = struct._7.asInstanceOf[CFuncPtr2[Ptr[sqlite3_file], Ptr[sqlite3_int64], CInt]]
      def xFileSize_=(value: CFuncPtr2[Ptr[sqlite3_file], Ptr[sqlite3_int64], CInt]): Unit = !struct.at7 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[sqlite3_int64], CInt]]
      def xLock : CFuncPtr2[Ptr[sqlite3_file], CInt, CInt] = struct._8.asInstanceOf[CFuncPtr2[Ptr[sqlite3_file], CInt, CInt]]
      def xLock_=(value: CFuncPtr2[Ptr[sqlite3_file], CInt, CInt]): Unit = !struct.at8 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], CInt, CInt]]
      def xUnlock : CFuncPtr2[Ptr[sqlite3_file], CInt, CInt] = struct._9.asInstanceOf[CFuncPtr2[Ptr[sqlite3_file], CInt, CInt]]
      def xUnlock_=(value: CFuncPtr2[Ptr[sqlite3_file], CInt, CInt]): Unit = !struct.at9 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], CInt, CInt]]
      def xCheckReservedLock : CFuncPtr2[Ptr[sqlite3_file], Ptr[CInt], CInt] = struct._10.asInstanceOf[CFuncPtr2[Ptr[sqlite3_file], Ptr[CInt], CInt]]
      def xCheckReservedLock_=(value: CFuncPtr2[Ptr[sqlite3_file], Ptr[CInt], CInt]): Unit = !struct.at10 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[CInt], CInt]]
      def xFileControl : CFuncPtr3[Ptr[sqlite3_file], CInt, Ptr[Byte], CInt] = struct._11.asInstanceOf[CFuncPtr3[Ptr[sqlite3_file], CInt, Ptr[Byte], CInt]]
      def xFileControl_=(value: CFuncPtr3[Ptr[sqlite3_file], CInt, Ptr[Byte], CInt]): Unit = !struct.at11 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], CInt, Ptr[Byte], CInt]]
      def xSectorSize : CFuncPtr1[Ptr[sqlite3_file], CInt] = struct._12.asInstanceOf[CFuncPtr1[Ptr[sqlite3_file], CInt]]
      def xSectorSize_=(value: CFuncPtr1[Ptr[sqlite3_file], CInt]): Unit = !struct.at12 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], CInt]]
      def xDeviceCharacteristics : CFuncPtr1[Ptr[sqlite3_file], CInt] = struct._13.asInstanceOf[CFuncPtr1[Ptr[sqlite3_file], CInt]]
      def xDeviceCharacteristics_=(value: CFuncPtr1[Ptr[sqlite3_file], CInt]): Unit = !struct.at13 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], CInt]]
      def xShmMap : CFuncPtr5[Ptr[sqlite3_file], CInt, CInt, CInt, Ptr[Ptr[Byte]], CInt] = struct._14.asInstanceOf[CFuncPtr5[Ptr[sqlite3_file], CInt, CInt, CInt, Ptr[Ptr[Byte]], CInt]]
      def xShmMap_=(value: CFuncPtr5[Ptr[sqlite3_file], CInt, CInt, CInt, Ptr[Ptr[Byte]], CInt]): Unit = !struct.at14 = value.asInstanceOf[CFuncPtr5[Ptr[Byte], CInt, CInt, CInt, Ptr[Ptr[Byte]], CInt]]
      def xShmLock : CFuncPtr4[Ptr[sqlite3_file], CInt, CInt, CInt, CInt] = struct._15.asInstanceOf[CFuncPtr4[Ptr[sqlite3_file], CInt, CInt, CInt, CInt]]
      def xShmLock_=(value: CFuncPtr4[Ptr[sqlite3_file], CInt, CInt, CInt, CInt]): Unit = !struct.at15 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], CInt, CInt, CInt, CInt]]
      def xShmBarrier : CFuncPtr1[Ptr[sqlite3_file], Unit] = struct._16.asInstanceOf[CFuncPtr1[Ptr[sqlite3_file], Unit]]
      def xShmBarrier_=(value: CFuncPtr1[Ptr[sqlite3_file], Unit]): Unit = !struct.at16 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
      def xShmUnmap : CFuncPtr2[Ptr[sqlite3_file], CInt, CInt] = struct._17.asInstanceOf[CFuncPtr2[Ptr[sqlite3_file], CInt, CInt]]
      def xShmUnmap_=(value: CFuncPtr2[Ptr[sqlite3_file], CInt, CInt]): Unit = !struct.at17 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], CInt, CInt]]
      def xFetch : CFuncPtr4[Ptr[sqlite3_file], sqlite3_int64, CInt, Ptr[Ptr[Byte]], CInt] = struct._18.asInstanceOf[CFuncPtr4[Ptr[sqlite3_file], sqlite3_int64, CInt, Ptr[Ptr[Byte]], CInt]]
      def xFetch_=(value: CFuncPtr4[Ptr[sqlite3_file], sqlite3_int64, CInt, Ptr[Ptr[Byte]], CInt]): Unit = !struct.at18 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], sqlite3_int64, CInt, Ptr[Ptr[Byte]], CInt]]
      def xUnfetch : CFuncPtr3[Ptr[sqlite3_file], sqlite3_int64, Ptr[Byte], CInt] = struct._19.asInstanceOf[CFuncPtr3[Ptr[sqlite3_file], sqlite3_int64, Ptr[Byte], CInt]]
      def xUnfetch_=(value: CFuncPtr3[Ptr[sqlite3_file], sqlite3_int64, Ptr[Byte], CInt]): Unit = !struct.at19 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], sqlite3_int64, Ptr[Byte], CInt]]
    

  opaque type sqlite3_mem_methods = CStruct8[CFuncPtr1[CInt, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr1[CInt, CInt], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr1[Ptr[Byte], Unit], Ptr[Byte]]
  
  object sqlite3_mem_methods:
    given _tag: Tag[sqlite3_mem_methods] = Tag.materializeCStruct8Tag[CFuncPtr1[CInt, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr1[CInt, CInt], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr1[Ptr[Byte], Unit], Ptr[Byte]]
    
    // Allocates sqlite3_mem_methods on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_mem_methods] = scala.scalanative.unsafe.alloc[sqlite3_mem_methods](1)
    def apply(xMalloc : CFuncPtr1[CInt, Ptr[Byte]], xFree : CFuncPtr1[Ptr[Byte], Unit], xRealloc : CFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]], xSize : CFuncPtr1[Ptr[Byte], CInt], xRoundup : CFuncPtr1[CInt, CInt], xInit : CFuncPtr1[Ptr[Byte], CInt], xShutdown : CFuncPtr1[Ptr[Byte], Unit], pAppData : Ptr[Byte])(using Zone): Ptr[sqlite3_mem_methods] =
      val ____ptr = apply()
      (!____ptr).xMalloc = xMalloc
      (!____ptr).xFree = xFree
      (!____ptr).xRealloc = xRealloc
      (!____ptr).xSize = xSize
      (!____ptr).xRoundup = xRoundup
      (!____ptr).xInit = xInit
      (!____ptr).xShutdown = xShutdown
      (!____ptr).pAppData = pAppData
      ____ptr
    
    extension (struct: sqlite3_mem_methods)
      def xMalloc : CFuncPtr1[CInt, Ptr[Byte]] = struct._1
      def xMalloc_=(value: CFuncPtr1[CInt, Ptr[Byte]]): Unit = !struct.at1 = value
      def xFree : CFuncPtr1[Ptr[Byte], Unit] = struct._2
      def xFree_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = !struct.at2 = value
      def xRealloc : CFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]] = struct._3
      def xRealloc_=(value: CFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]]): Unit = !struct.at3 = value
      def xSize : CFuncPtr1[Ptr[Byte], CInt] = struct._4
      def xSize_=(value: CFuncPtr1[Ptr[Byte], CInt]): Unit = !struct.at4 = value
      def xRoundup : CFuncPtr1[CInt, CInt] = struct._5
      def xRoundup_=(value: CFuncPtr1[CInt, CInt]): Unit = !struct.at5 = value
      def xInit : CFuncPtr1[Ptr[Byte], CInt] = struct._6
      def xInit_=(value: CFuncPtr1[Ptr[Byte], CInt]): Unit = !struct.at6 = value
      def xShutdown : CFuncPtr1[Ptr[Byte], Unit] = struct._7
      def xShutdown_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = !struct.at7 = value
      def pAppData : Ptr[Byte] = struct._8
      def pAppData_=(value: Ptr[Byte]): Unit = !struct.at8 = value
    

  opaque type sqlite3_module = CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._0]]
  
  object sqlite3_module:
    given _tag: Tag[sqlite3_module] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._0]](Tag.Byte, Tag.Digit3[Nat._2, Nat._0, Nat._0](Tag.Nat2, Tag.Nat0, Tag.Nat0))
    
    // Allocates sqlite3_module on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_module] = scala.scalanative.unsafe.alloc[sqlite3_module](1)
    def apply(iVersion : CInt, xCreate : CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt], xConnect : CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt], xBestIndex : CFuncPtr2[Ptr[sqlite3_vtab], Ptr[sqlite3_index_info], CInt], xDisconnect : CFuncPtr1[Ptr[sqlite3_vtab], CInt], xDestroy : CFuncPtr1[Ptr[sqlite3_vtab], CInt], xOpen : CFuncPtr2[Ptr[sqlite3_vtab], Ptr[Ptr[sqlite3_vtab_cursor]], CInt], xClose : CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt], xFilter : CFuncPtr5[Ptr[sqlite3_vtab_cursor], CInt, CString, CInt, Ptr[Ptr[sqlite3_value]], CInt], xNext : CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt], xEof : CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt], xColumn : CFuncPtr3[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_context], CInt, CInt], xRowid : CFuncPtr2[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_int64], CInt], xUpdate : CFuncPtr4[Ptr[sqlite3_vtab], CInt, Ptr[Ptr[sqlite3_value]], Ptr[sqlite3_int64], CInt], xBegin : CFuncPtr1[Ptr[sqlite3_vtab], CInt], xSync : CFuncPtr1[Ptr[sqlite3_vtab], CInt], xCommit : CFuncPtr1[Ptr[sqlite3_vtab], CInt], xRollback : CFuncPtr1[Ptr[sqlite3_vtab], CInt], xFindFunction : CFuncPtr5[Ptr[sqlite3_vtab], CInt, CString, Ptr[CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit]], Ptr[Ptr[Byte]], CInt], xRename : CFuncPtr2[Ptr[sqlite3_vtab], CString, CInt], xSavepoint : CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt], xRelease : CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt], xRollbackTo : CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt], xShadowName : CFuncPtr1[CString, CInt], xIntegrity : CFuncPtr5[Ptr[sqlite3_vtab], CString, CString, CInt, Ptr[CString], CInt])(using Zone): Ptr[sqlite3_module] =
      val ____ptr = apply()
      (!____ptr).iVersion = iVersion
      (!____ptr).xCreate = xCreate
      (!____ptr).xConnect = xConnect
      (!____ptr).xBestIndex = xBestIndex
      (!____ptr).xDisconnect = xDisconnect
      (!____ptr).xDestroy = xDestroy
      (!____ptr).xOpen = xOpen
      (!____ptr).xClose = xClose
      (!____ptr).xFilter = xFilter
      (!____ptr).xNext = xNext
      (!____ptr).xEof = xEof
      (!____ptr).xColumn = xColumn
      (!____ptr).xRowid = xRowid
      (!____ptr).xUpdate = xUpdate
      (!____ptr).xBegin = xBegin
      (!____ptr).xSync = xSync
      (!____ptr).xCommit = xCommit
      (!____ptr).xRollback = xRollback
      (!____ptr).xFindFunction = xFindFunction
      (!____ptr).xRename = xRename
      (!____ptr).xSavepoint = xSavepoint
      (!____ptr).xRelease = xRelease
      (!____ptr).xRollbackTo = xRollbackTo
      (!____ptr).xShadowName = xShadowName
      (!____ptr).xIntegrity = xIntegrity
      ____ptr
    
    extension (struct: sqlite3_module)
      def iVersion: CInt = !struct.at(offsets(0)).asInstanceOf[Ptr[CInt]]
      def iVersion_=(value: CInt): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[CInt]] = value
      def xCreate: CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt]]]
      def xCreate_=(value: CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt]]] = value
      def xConnect: CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt]]]
      def xConnect_=(value: CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt]]] = value
      def xBestIndex: CFuncPtr2[Ptr[sqlite3_vtab], Ptr[sqlite3_index_info], CInt] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], Ptr[sqlite3_index_info], CInt]]]
      def xBestIndex_=(value: CFuncPtr2[Ptr[sqlite3_vtab], Ptr[sqlite3_index_info], CInt]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], Ptr[sqlite3_index_info], CInt]]] = value
      def xDisconnect: CFuncPtr1[Ptr[sqlite3_vtab], CInt] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]]
      def xDisconnect_=(value: CFuncPtr1[Ptr[sqlite3_vtab], CInt]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]] = value
      def xDestroy: CFuncPtr1[Ptr[sqlite3_vtab], CInt] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]]
      def xDestroy_=(value: CFuncPtr1[Ptr[sqlite3_vtab], CInt]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]] = value
      def xOpen: CFuncPtr2[Ptr[sqlite3_vtab], Ptr[Ptr[sqlite3_vtab_cursor]], CInt] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], Ptr[Ptr[sqlite3_vtab_cursor]], CInt]]]
      def xOpen_=(value: CFuncPtr2[Ptr[sqlite3_vtab], Ptr[Ptr[sqlite3_vtab_cursor]], CInt]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], Ptr[Ptr[sqlite3_vtab_cursor]], CInt]]] = value
      def xClose: CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]]]
      def xClose_=(value: CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]]] = value
      def xFilter: CFuncPtr5[Ptr[sqlite3_vtab_cursor], CInt, CString, CInt, Ptr[Ptr[sqlite3_value]], CInt] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr5[Ptr[sqlite3_vtab_cursor], CInt, CString, CInt, Ptr[Ptr[sqlite3_value]], CInt]]]
      def xFilter_=(value: CFuncPtr5[Ptr[sqlite3_vtab_cursor], CInt, CString, CInt, Ptr[Ptr[sqlite3_value]], CInt]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr5[Ptr[sqlite3_vtab_cursor], CInt, CString, CInt, Ptr[Ptr[sqlite3_value]], CInt]]] = value
      def xNext: CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]]]
      def xNext_=(value: CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]]] = value
      def xEof: CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]]]
      def xEof_=(value: CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]]] = value
      def xColumn: CFuncPtr3[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_context], CInt, CInt] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr3[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_context], CInt, CInt]]]
      def xColumn_=(value: CFuncPtr3[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_context], CInt, CInt]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr3[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_context], CInt, CInt]]] = value
      def xRowid: CFuncPtr2[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_int64], CInt] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_int64], CInt]]]
      def xRowid_=(value: CFuncPtr2[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_int64], CInt]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_int64], CInt]]] = value
      def xUpdate: CFuncPtr4[Ptr[sqlite3_vtab], CInt, Ptr[Ptr[sqlite3_value]], Ptr[sqlite3_int64], CInt] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr4[Ptr[sqlite3_vtab], CInt, Ptr[Ptr[sqlite3_value]], Ptr[sqlite3_int64], CInt]]]
      def xUpdate_=(value: CFuncPtr4[Ptr[sqlite3_vtab], CInt, Ptr[Ptr[sqlite3_value]], Ptr[sqlite3_int64], CInt]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr4[Ptr[sqlite3_vtab], CInt, Ptr[Ptr[sqlite3_value]], Ptr[sqlite3_int64], CInt]]] = value
      def xBegin: CFuncPtr1[Ptr[sqlite3_vtab], CInt] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]]
      def xBegin_=(value: CFuncPtr1[Ptr[sqlite3_vtab], CInt]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]] = value
      def xSync: CFuncPtr1[Ptr[sqlite3_vtab], CInt] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]]
      def xSync_=(value: CFuncPtr1[Ptr[sqlite3_vtab], CInt]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]] = value
      def xCommit: CFuncPtr1[Ptr[sqlite3_vtab], CInt] = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]]
      def xCommit_=(value: CFuncPtr1[Ptr[sqlite3_vtab], CInt]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]] = value
      def xRollback: CFuncPtr1[Ptr[sqlite3_vtab], CInt] = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]]
      def xRollback_=(value: CFuncPtr1[Ptr[sqlite3_vtab], CInt]): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr1[Ptr[sqlite3_vtab], CInt]]] = value
      def xFindFunction: CFuncPtr5[Ptr[sqlite3_vtab], CInt, CString, Ptr[CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit]], Ptr[Ptr[Byte]], CInt] = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr5[Ptr[sqlite3_vtab], CInt, CString, Ptr[CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit]], Ptr[Ptr[Byte]], CInt]]]
      def xFindFunction_=(value: CFuncPtr5[Ptr[sqlite3_vtab], CInt, CString, Ptr[CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit]], Ptr[Ptr[Byte]], CInt]): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr5[Ptr[sqlite3_vtab], CInt, CString, Ptr[CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit]], Ptr[Ptr[Byte]], CInt]]] = value
      def xRename: CFuncPtr2[Ptr[sqlite3_vtab], CString, CInt] = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], CString, CInt]]]
      def xRename_=(value: CFuncPtr2[Ptr[sqlite3_vtab], CString, CInt]): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], CString, CInt]]] = value
      def xSavepoint: CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt] = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]]]
      def xSavepoint_=(value: CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]]] = value
      def xRelease: CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt] = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]]]
      def xRelease_=(value: CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]]] = value
      def xRollbackTo: CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt] = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]]]
      def xRollbackTo_=(value: CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]]] = value
      def xShadowName: CFuncPtr1[CString, CInt] = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr1[CString, CInt]]]
      def xShadowName_=(value: CFuncPtr1[CString, CInt]): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr1[CString, CInt]]] = value
      def xIntegrity: CFuncPtr5[Ptr[sqlite3_vtab], CString, CString, CInt, Ptr[CString], CInt] = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr5[Ptr[sqlite3_vtab], CString, CString, CInt, Ptr[CString], CInt]]]
      def xIntegrity_=(value: CFuncPtr5[Ptr[sqlite3_vtab], CString, CString, CInt, Ptr[CString], CInt]): Unit = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr5[Ptr[sqlite3_vtab], CString, CString, CInt, Ptr[CString], CInt]]] = value
    val offsets: Array[Int] =
      val res = Array.ofDim[Int](25)
      def align(offset: Int, alignment: Int) = {
        val alignmentMask = alignment - 1
        val padding =
          if ((offset & alignmentMask) == 0) 0
          else alignment - (offset & alignmentMask)
        offset + padding
      }
      
      res(0) = align(0, alignmentof[CInt].toInt)
      res(1) = align(res(0) + sizeof[CInt].toInt, alignmentof[CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt]].toInt)
      res(2) = align(res(1) + sizeof[CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt]].toInt, alignmentof[CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt]].toInt)
      res(3) = align(res(2) + sizeof[CFuncPtr6[Ptr[sqlite3], Ptr[Byte], CInt, Ptr[CString], Ptr[Ptr[sqlite3_vtab]], Ptr[CString], CInt]].toInt, alignmentof[CFuncPtr2[Ptr[sqlite3_vtab], Ptr[sqlite3_index_info], CInt]].toInt)
      res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[sqlite3_vtab], Ptr[sqlite3_index_info], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt)
      res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt)
      res(6) = align(res(5) + sizeof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt, alignmentof[CFuncPtr2[Ptr[sqlite3_vtab], Ptr[Ptr[sqlite3_vtab_cursor]], CInt]].toInt)
      res(7) = align(res(6) + sizeof[CFuncPtr2[Ptr[sqlite3_vtab], Ptr[Ptr[sqlite3_vtab_cursor]], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]].toInt)
      res(8) = align(res(7) + sizeof[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]].toInt, alignmentof[CFuncPtr5[Ptr[sqlite3_vtab_cursor], CInt, CString, CInt, Ptr[Ptr[sqlite3_value]], CInt]].toInt)
      res(9) = align(res(8) + sizeof[CFuncPtr5[Ptr[sqlite3_vtab_cursor], CInt, CString, CInt, Ptr[Ptr[sqlite3_value]], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]].toInt)
      res(10) = align(res(9) + sizeof[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]].toInt)
      res(11) = align(res(10) + sizeof[CFuncPtr1[Ptr[sqlite3_vtab_cursor], CInt]].toInt, alignmentof[CFuncPtr3[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_context], CInt, CInt]].toInt)
      res(12) = align(res(11) + sizeof[CFuncPtr3[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_context], CInt, CInt]].toInt, alignmentof[CFuncPtr2[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_int64], CInt]].toInt)
      res(13) = align(res(12) + sizeof[CFuncPtr2[Ptr[sqlite3_vtab_cursor], Ptr[sqlite3_int64], CInt]].toInt, alignmentof[CFuncPtr4[Ptr[sqlite3_vtab], CInt, Ptr[Ptr[sqlite3_value]], Ptr[sqlite3_int64], CInt]].toInt)
      res(14) = align(res(13) + sizeof[CFuncPtr4[Ptr[sqlite3_vtab], CInt, Ptr[Ptr[sqlite3_value]], Ptr[sqlite3_int64], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt)
      res(15) = align(res(14) + sizeof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt)
      res(16) = align(res(15) + sizeof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt)
      res(17) = align(res(16) + sizeof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt)
      res(18) = align(res(17) + sizeof[CFuncPtr1[Ptr[sqlite3_vtab], CInt]].toInt, alignmentof[CFuncPtr5[Ptr[sqlite3_vtab], CInt, CString, Ptr[CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit]], Ptr[Ptr[Byte]], CInt]].toInt)
      res(19) = align(res(18) + sizeof[CFuncPtr5[Ptr[sqlite3_vtab], CInt, CString, Ptr[CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit]], Ptr[Ptr[Byte]], CInt]].toInt, alignmentof[CFuncPtr2[Ptr[sqlite3_vtab], CString, CInt]].toInt)
      res(20) = align(res(19) + sizeof[CFuncPtr2[Ptr[sqlite3_vtab], CString, CInt]].toInt, alignmentof[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]].toInt)
      res(21) = align(res(20) + sizeof[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]].toInt, alignmentof[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]].toInt)
      res(22) = align(res(21) + sizeof[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]].toInt, alignmentof[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]].toInt)
      res(23) = align(res(22) + sizeof[CFuncPtr2[Ptr[sqlite3_vtab], CInt, CInt]].toInt, alignmentof[CFuncPtr1[CString, CInt]].toInt)
      res(24) = align(res(23) + sizeof[CFuncPtr1[CString, CInt]].toInt, alignmentof[CFuncPtr5[Ptr[sqlite3_vtab], CString, CString, CInt, Ptr[CString], CInt]].toInt)
      res
    end offsets
    

  opaque type sqlite3_mutex = CStruct0
  
  object sqlite3_mutex:
    given _tag: Tag[sqlite3_mutex] = Tag.materializeCStruct0Tag
    

  opaque type sqlite3_mutex_methods = CStruct9[CFuncPtr0[CInt], CFuncPtr0[CInt], CFuncPtr1[CInt, Ptr[sqlite3_mutex]], CFuncPtr1[Ptr[sqlite3_mutex], Unit], CFuncPtr1[Ptr[sqlite3_mutex], Unit], CFuncPtr1[Ptr[sqlite3_mutex], CInt], CFuncPtr1[Ptr[sqlite3_mutex], Unit], CFuncPtr1[Ptr[sqlite3_mutex], CInt], CFuncPtr1[Ptr[sqlite3_mutex], CInt]]
  
  object sqlite3_mutex_methods:
    given _tag: Tag[sqlite3_mutex_methods] = Tag.materializeCStruct9Tag[CFuncPtr0[CInt], CFuncPtr0[CInt], CFuncPtr1[CInt, Ptr[sqlite3_mutex]], CFuncPtr1[Ptr[sqlite3_mutex], Unit], CFuncPtr1[Ptr[sqlite3_mutex], Unit], CFuncPtr1[Ptr[sqlite3_mutex], CInt], CFuncPtr1[Ptr[sqlite3_mutex], Unit], CFuncPtr1[Ptr[sqlite3_mutex], CInt], CFuncPtr1[Ptr[sqlite3_mutex], CInt]]
    
    // Allocates sqlite3_mutex_methods on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_mutex_methods] = scala.scalanative.unsafe.alloc[sqlite3_mutex_methods](1)
    def apply(xMutexInit : CFuncPtr0[CInt], xMutexEnd : CFuncPtr0[CInt], xMutexAlloc : CFuncPtr1[CInt, Ptr[sqlite3_mutex]], xMutexFree : CFuncPtr1[Ptr[sqlite3_mutex], Unit], xMutexEnter : CFuncPtr1[Ptr[sqlite3_mutex], Unit], xMutexTry : CFuncPtr1[Ptr[sqlite3_mutex], CInt], xMutexLeave : CFuncPtr1[Ptr[sqlite3_mutex], Unit], xMutexHeld : CFuncPtr1[Ptr[sqlite3_mutex], CInt], xMutexNotheld : CFuncPtr1[Ptr[sqlite3_mutex], CInt])(using Zone): Ptr[sqlite3_mutex_methods] =
      val ____ptr = apply()
      (!____ptr).xMutexInit = xMutexInit
      (!____ptr).xMutexEnd = xMutexEnd
      (!____ptr).xMutexAlloc = xMutexAlloc
      (!____ptr).xMutexFree = xMutexFree
      (!____ptr).xMutexEnter = xMutexEnter
      (!____ptr).xMutexTry = xMutexTry
      (!____ptr).xMutexLeave = xMutexLeave
      (!____ptr).xMutexHeld = xMutexHeld
      (!____ptr).xMutexNotheld = xMutexNotheld
      ____ptr
    
    extension (struct: sqlite3_mutex_methods)
      def xMutexInit : CFuncPtr0[CInt] = struct._1
      def xMutexInit_=(value: CFuncPtr0[CInt]): Unit = !struct.at1 = value
      def xMutexEnd : CFuncPtr0[CInt] = struct._2
      def xMutexEnd_=(value: CFuncPtr0[CInt]): Unit = !struct.at2 = value
      def xMutexAlloc : CFuncPtr1[CInt, Ptr[sqlite3_mutex]] = struct._3
      def xMutexAlloc_=(value: CFuncPtr1[CInt, Ptr[sqlite3_mutex]]): Unit = !struct.at3 = value
      def xMutexFree : CFuncPtr1[Ptr[sqlite3_mutex], Unit] = struct._4
      def xMutexFree_=(value: CFuncPtr1[Ptr[sqlite3_mutex], Unit]): Unit = !struct.at4 = value
      def xMutexEnter : CFuncPtr1[Ptr[sqlite3_mutex], Unit] = struct._5
      def xMutexEnter_=(value: CFuncPtr1[Ptr[sqlite3_mutex], Unit]): Unit = !struct.at5 = value
      def xMutexTry : CFuncPtr1[Ptr[sqlite3_mutex], CInt] = struct._6
      def xMutexTry_=(value: CFuncPtr1[Ptr[sqlite3_mutex], CInt]): Unit = !struct.at6 = value
      def xMutexLeave : CFuncPtr1[Ptr[sqlite3_mutex], Unit] = struct._7
      def xMutexLeave_=(value: CFuncPtr1[Ptr[sqlite3_mutex], Unit]): Unit = !struct.at7 = value
      def xMutexHeld : CFuncPtr1[Ptr[sqlite3_mutex], CInt] = struct._8
      def xMutexHeld_=(value: CFuncPtr1[Ptr[sqlite3_mutex], CInt]): Unit = !struct.at8 = value
      def xMutexNotheld : CFuncPtr1[Ptr[sqlite3_mutex], CInt] = struct._9
      def xMutexNotheld_=(value: CFuncPtr1[Ptr[sqlite3_mutex], CInt]): Unit = !struct.at9 = value
    

  opaque type sqlite3_pcache = CStruct0
  
  object sqlite3_pcache:
    given _tag: Tag[sqlite3_pcache] = Tag.materializeCStruct0Tag
    

  opaque type sqlite3_pcache_methods = CStruct11[Ptr[Byte], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[CInt, CInt, Ptr[sqlite3_pcache]], CFuncPtr2[Ptr[sqlite3_pcache], CInt, Unit], CFuncPtr1[Ptr[sqlite3_pcache], CInt], CFuncPtr3[Ptr[sqlite3_pcache], CUnsignedInt, CInt, Ptr[Byte]], CFuncPtr3[Ptr[sqlite3_pcache], Ptr[Byte], CInt, Unit], CFuncPtr4[Ptr[sqlite3_pcache], Ptr[Byte], CUnsignedInt, CUnsignedInt, Unit], CFuncPtr2[Ptr[sqlite3_pcache], CUnsignedInt, Unit], CFuncPtr1[Ptr[sqlite3_pcache], Unit]]
  
  object sqlite3_pcache_methods:
    given _tag: Tag[sqlite3_pcache_methods] = Tag.materializeCStruct11Tag[Ptr[Byte], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[CInt, CInt, Ptr[sqlite3_pcache]], CFuncPtr2[Ptr[sqlite3_pcache], CInt, Unit], CFuncPtr1[Ptr[sqlite3_pcache], CInt], CFuncPtr3[Ptr[sqlite3_pcache], CUnsignedInt, CInt, Ptr[Byte]], CFuncPtr3[Ptr[sqlite3_pcache], Ptr[Byte], CInt, Unit], CFuncPtr4[Ptr[sqlite3_pcache], Ptr[Byte], CUnsignedInt, CUnsignedInt, Unit], CFuncPtr2[Ptr[sqlite3_pcache], CUnsignedInt, Unit], CFuncPtr1[Ptr[sqlite3_pcache], Unit]]
    
    // Allocates sqlite3_pcache_methods on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_pcache_methods] = scala.scalanative.unsafe.alloc[sqlite3_pcache_methods](1)
    def apply(pArg : Ptr[Byte], xInit : CFuncPtr1[Ptr[Byte], CInt], xShutdown : CFuncPtr1[Ptr[Byte], Unit], xCreate : CFuncPtr2[CInt, CInt, Ptr[sqlite3_pcache]], xCachesize : CFuncPtr2[Ptr[sqlite3_pcache], CInt, Unit], xPagecount : CFuncPtr1[Ptr[sqlite3_pcache], CInt], xFetch : CFuncPtr3[Ptr[sqlite3_pcache], CUnsignedInt, CInt, Ptr[Byte]], xUnpin : CFuncPtr3[Ptr[sqlite3_pcache], Ptr[Byte], CInt, Unit], xRekey : CFuncPtr4[Ptr[sqlite3_pcache], Ptr[Byte], CUnsignedInt, CUnsignedInt, Unit], xTruncate : CFuncPtr2[Ptr[sqlite3_pcache], CUnsignedInt, Unit], xDestroy : CFuncPtr1[Ptr[sqlite3_pcache], Unit])(using Zone): Ptr[sqlite3_pcache_methods] =
      val ____ptr = apply()
      (!____ptr).pArg = pArg
      (!____ptr).xInit = xInit
      (!____ptr).xShutdown = xShutdown
      (!____ptr).xCreate = xCreate
      (!____ptr).xCachesize = xCachesize
      (!____ptr).xPagecount = xPagecount
      (!____ptr).xFetch = xFetch
      (!____ptr).xUnpin = xUnpin
      (!____ptr).xRekey = xRekey
      (!____ptr).xTruncate = xTruncate
      (!____ptr).xDestroy = xDestroy
      ____ptr
    
    extension (struct: sqlite3_pcache_methods)
      def pArg : Ptr[Byte] = struct._1
      def pArg_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def xInit : CFuncPtr1[Ptr[Byte], CInt] = struct._2
      def xInit_=(value: CFuncPtr1[Ptr[Byte], CInt]): Unit = !struct.at2 = value
      def xShutdown : CFuncPtr1[Ptr[Byte], Unit] = struct._3
      def xShutdown_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = !struct.at3 = value
      def xCreate : CFuncPtr2[CInt, CInt, Ptr[sqlite3_pcache]] = struct._4
      def xCreate_=(value: CFuncPtr2[CInt, CInt, Ptr[sqlite3_pcache]]): Unit = !struct.at4 = value
      def xCachesize : CFuncPtr2[Ptr[sqlite3_pcache], CInt, Unit] = struct._5
      def xCachesize_=(value: CFuncPtr2[Ptr[sqlite3_pcache], CInt, Unit]): Unit = !struct.at5 = value
      def xPagecount : CFuncPtr1[Ptr[sqlite3_pcache], CInt] = struct._6
      def xPagecount_=(value: CFuncPtr1[Ptr[sqlite3_pcache], CInt]): Unit = !struct.at6 = value
      def xFetch : CFuncPtr3[Ptr[sqlite3_pcache], CUnsignedInt, CInt, Ptr[Byte]] = struct._7
      def xFetch_=(value: CFuncPtr3[Ptr[sqlite3_pcache], CUnsignedInt, CInt, Ptr[Byte]]): Unit = !struct.at7 = value
      def xUnpin : CFuncPtr3[Ptr[sqlite3_pcache], Ptr[Byte], CInt, Unit] = struct._8
      def xUnpin_=(value: CFuncPtr3[Ptr[sqlite3_pcache], Ptr[Byte], CInt, Unit]): Unit = !struct.at8 = value
      def xRekey : CFuncPtr4[Ptr[sqlite3_pcache], Ptr[Byte], CUnsignedInt, CUnsignedInt, Unit] = struct._9
      def xRekey_=(value: CFuncPtr4[Ptr[sqlite3_pcache], Ptr[Byte], CUnsignedInt, CUnsignedInt, Unit]): Unit = !struct.at9 = value
      def xTruncate : CFuncPtr2[Ptr[sqlite3_pcache], CUnsignedInt, Unit] = struct._10
      def xTruncate_=(value: CFuncPtr2[Ptr[sqlite3_pcache], CUnsignedInt, Unit]): Unit = !struct.at10 = value
      def xDestroy : CFuncPtr1[Ptr[sqlite3_pcache], Unit] = struct._11
      def xDestroy_=(value: CFuncPtr1[Ptr[sqlite3_pcache], Unit]): Unit = !struct.at11 = value
    

  opaque type sqlite3_pcache_methods2 = CStruct13[CInt, Ptr[Byte], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr3[CInt, CInt, CInt, Ptr[sqlite3_pcache]], CFuncPtr2[Ptr[sqlite3_pcache], CInt, Unit], CFuncPtr1[Ptr[sqlite3_pcache], CInt], CFuncPtr3[Ptr[sqlite3_pcache], CUnsignedInt, CInt, Ptr[sqlite3_pcache_page]], CFuncPtr3[Ptr[sqlite3_pcache], Ptr[sqlite3_pcache_page], CInt, Unit], CFuncPtr4[Ptr[sqlite3_pcache], Ptr[sqlite3_pcache_page], CUnsignedInt, CUnsignedInt, Unit], CFuncPtr2[Ptr[sqlite3_pcache], CUnsignedInt, Unit], CFuncPtr1[Ptr[sqlite3_pcache], Unit], CFuncPtr1[Ptr[sqlite3_pcache], Unit]]
  
  object sqlite3_pcache_methods2:
    given _tag: Tag[sqlite3_pcache_methods2] = Tag.materializeCStruct13Tag[CInt, Ptr[Byte], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr3[CInt, CInt, CInt, Ptr[sqlite3_pcache]], CFuncPtr2[Ptr[sqlite3_pcache], CInt, Unit], CFuncPtr1[Ptr[sqlite3_pcache], CInt], CFuncPtr3[Ptr[sqlite3_pcache], CUnsignedInt, CInt, Ptr[sqlite3_pcache_page]], CFuncPtr3[Ptr[sqlite3_pcache], Ptr[sqlite3_pcache_page], CInt, Unit], CFuncPtr4[Ptr[sqlite3_pcache], Ptr[sqlite3_pcache_page], CUnsignedInt, CUnsignedInt, Unit], CFuncPtr2[Ptr[sqlite3_pcache], CUnsignedInt, Unit], CFuncPtr1[Ptr[sqlite3_pcache], Unit], CFuncPtr1[Ptr[sqlite3_pcache], Unit]]
    
    // Allocates sqlite3_pcache_methods2 on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_pcache_methods2] = scala.scalanative.unsafe.alloc[sqlite3_pcache_methods2](1)
    def apply(iVersion : CInt, pArg : Ptr[Byte], xInit : CFuncPtr1[Ptr[Byte], CInt], xShutdown : CFuncPtr1[Ptr[Byte], Unit], xCreate : CFuncPtr3[CInt, CInt, CInt, Ptr[sqlite3_pcache]], xCachesize : CFuncPtr2[Ptr[sqlite3_pcache], CInt, Unit], xPagecount : CFuncPtr1[Ptr[sqlite3_pcache], CInt], xFetch : CFuncPtr3[Ptr[sqlite3_pcache], CUnsignedInt, CInt, Ptr[sqlite3_pcache_page]], xUnpin : CFuncPtr3[Ptr[sqlite3_pcache], Ptr[sqlite3_pcache_page], CInt, Unit], xRekey : CFuncPtr4[Ptr[sqlite3_pcache], Ptr[sqlite3_pcache_page], CUnsignedInt, CUnsignedInt, Unit], xTruncate : CFuncPtr2[Ptr[sqlite3_pcache], CUnsignedInt, Unit], xDestroy : CFuncPtr1[Ptr[sqlite3_pcache], Unit], xShrink : CFuncPtr1[Ptr[sqlite3_pcache], Unit])(using Zone): Ptr[sqlite3_pcache_methods2] =
      val ____ptr = apply()
      (!____ptr).iVersion = iVersion
      (!____ptr).pArg = pArg
      (!____ptr).xInit = xInit
      (!____ptr).xShutdown = xShutdown
      (!____ptr).xCreate = xCreate
      (!____ptr).xCachesize = xCachesize
      (!____ptr).xPagecount = xPagecount
      (!____ptr).xFetch = xFetch
      (!____ptr).xUnpin = xUnpin
      (!____ptr).xRekey = xRekey
      (!____ptr).xTruncate = xTruncate
      (!____ptr).xDestroy = xDestroy
      (!____ptr).xShrink = xShrink
      ____ptr
    
    extension (struct: sqlite3_pcache_methods2)
      def iVersion : CInt = struct._1
      def iVersion_=(value: CInt): Unit = !struct.at1 = value
      def pArg : Ptr[Byte] = struct._2
      def pArg_=(value: Ptr[Byte]): Unit = !struct.at2 = value
      def xInit : CFuncPtr1[Ptr[Byte], CInt] = struct._3
      def xInit_=(value: CFuncPtr1[Ptr[Byte], CInt]): Unit = !struct.at3 = value
      def xShutdown : CFuncPtr1[Ptr[Byte], Unit] = struct._4
      def xShutdown_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = !struct.at4 = value
      def xCreate : CFuncPtr3[CInt, CInt, CInt, Ptr[sqlite3_pcache]] = struct._5
      def xCreate_=(value: CFuncPtr3[CInt, CInt, CInt, Ptr[sqlite3_pcache]]): Unit = !struct.at5 = value
      def xCachesize : CFuncPtr2[Ptr[sqlite3_pcache], CInt, Unit] = struct._6
      def xCachesize_=(value: CFuncPtr2[Ptr[sqlite3_pcache], CInt, Unit]): Unit = !struct.at6 = value
      def xPagecount : CFuncPtr1[Ptr[sqlite3_pcache], CInt] = struct._7
      def xPagecount_=(value: CFuncPtr1[Ptr[sqlite3_pcache], CInt]): Unit = !struct.at7 = value
      def xFetch : CFuncPtr3[Ptr[sqlite3_pcache], CUnsignedInt, CInt, Ptr[sqlite3_pcache_page]] = struct._8
      def xFetch_=(value: CFuncPtr3[Ptr[sqlite3_pcache], CUnsignedInt, CInt, Ptr[sqlite3_pcache_page]]): Unit = !struct.at8 = value
      def xUnpin : CFuncPtr3[Ptr[sqlite3_pcache], Ptr[sqlite3_pcache_page], CInt, Unit] = struct._9
      def xUnpin_=(value: CFuncPtr3[Ptr[sqlite3_pcache], Ptr[sqlite3_pcache_page], CInt, Unit]): Unit = !struct.at9 = value
      def xRekey : CFuncPtr4[Ptr[sqlite3_pcache], Ptr[sqlite3_pcache_page], CUnsignedInt, CUnsignedInt, Unit] = struct._10
      def xRekey_=(value: CFuncPtr4[Ptr[sqlite3_pcache], Ptr[sqlite3_pcache_page], CUnsignedInt, CUnsignedInt, Unit]): Unit = !struct.at10 = value
      def xTruncate : CFuncPtr2[Ptr[sqlite3_pcache], CUnsignedInt, Unit] = struct._11
      def xTruncate_=(value: CFuncPtr2[Ptr[sqlite3_pcache], CUnsignedInt, Unit]): Unit = !struct.at11 = value
      def xDestroy : CFuncPtr1[Ptr[sqlite3_pcache], Unit] = struct._12
      def xDestroy_=(value: CFuncPtr1[Ptr[sqlite3_pcache], Unit]): Unit = !struct.at12 = value
      def xShrink : CFuncPtr1[Ptr[sqlite3_pcache], Unit] = struct._13
      def xShrink_=(value: CFuncPtr1[Ptr[sqlite3_pcache], Unit]): Unit = !struct.at13 = value
    

  opaque type sqlite3_pcache_page = CStruct2[Ptr[Byte], Ptr[Byte]]
  
  object sqlite3_pcache_page:
    given _tag: Tag[sqlite3_pcache_page] = Tag.materializeCStruct2Tag[Ptr[Byte], Ptr[Byte]]
    
    // Allocates sqlite3_pcache_page on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_pcache_page] = scala.scalanative.unsafe.alloc[sqlite3_pcache_page](1)
    def apply(pBuf : Ptr[Byte], pExtra : Ptr[Byte])(using Zone): Ptr[sqlite3_pcache_page] =
      val ____ptr = apply()
      (!____ptr).pBuf = pBuf
      (!____ptr).pExtra = pExtra
      ____ptr
    
    extension (struct: sqlite3_pcache_page)
      def pBuf : Ptr[Byte] = struct._1
      def pBuf_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def pExtra : Ptr[Byte] = struct._2
      def pExtra_=(value: Ptr[Byte]): Unit = !struct.at2 = value
    

  opaque type sqlite3_rtree_geometry = CStruct5[Ptr[Byte], CInt, Ptr[sqlite3_rtree_dbl], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit]]
  
  object sqlite3_rtree_geometry:
    given _tag: Tag[sqlite3_rtree_geometry] = Tag.materializeCStruct5Tag[Ptr[Byte], CInt, Ptr[sqlite3_rtree_dbl], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit]]
    
    // Allocates sqlite3_rtree_geometry on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_rtree_geometry] = scala.scalanative.unsafe.alloc[sqlite3_rtree_geometry](1)
    def apply(pContext : Ptr[Byte], nParam : CInt, aParam : Ptr[sqlite3_rtree_dbl], pUser : Ptr[Byte], xDelUser : CFuncPtr1[Ptr[Byte], Unit])(using Zone): Ptr[sqlite3_rtree_geometry] =
      val ____ptr = apply()
      (!____ptr).pContext = pContext
      (!____ptr).nParam = nParam
      (!____ptr).aParam = aParam
      (!____ptr).pUser = pUser
      (!____ptr).xDelUser = xDelUser
      ____ptr
    
    extension (struct: sqlite3_rtree_geometry)
      def pContext : Ptr[Byte] = struct._1
      def pContext_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def nParam : CInt = struct._2
      def nParam_=(value: CInt): Unit = !struct.at2 = value
      def aParam : Ptr[sqlite3_rtree_dbl] = struct._3
      def aParam_=(value: Ptr[sqlite3_rtree_dbl]): Unit = !struct.at3 = value
      def pUser : Ptr[Byte] = struct._4
      def pUser_=(value: Ptr[Byte]): Unit = !struct.at4 = value
      def xDelUser : CFuncPtr1[Ptr[Byte], Unit] = struct._5
      def xDelUser_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = !struct.at5 = value
    

  opaque type sqlite3_rtree_query_info = CStruct16[Ptr[Byte], CInt, Ptr[sqlite3_rtree_dbl], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], Ptr[sqlite3_rtree_dbl], Ptr[CUnsignedInt], CInt, CInt, CInt, sqlite3_int64, sqlite3_rtree_dbl, CInt, CInt, sqlite3_rtree_dbl, Ptr[Ptr[sqlite3_value]]]
  
  object sqlite3_rtree_query_info:
    given _tag: Tag[sqlite3_rtree_query_info] = Tag.materializeCStruct16Tag[Ptr[Byte], CInt, Ptr[sqlite3_rtree_dbl], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], Ptr[sqlite3_rtree_dbl], Ptr[CUnsignedInt], CInt, CInt, CInt, sqlite3_int64, sqlite3_rtree_dbl, CInt, CInt, sqlite3_rtree_dbl, Ptr[Ptr[sqlite3_value]]]
    
    // Allocates sqlite3_rtree_query_info on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_rtree_query_info] = scala.scalanative.unsafe.alloc[sqlite3_rtree_query_info](1)
    def apply(pContext : Ptr[Byte], nParam : CInt, aParam : Ptr[sqlite3_rtree_dbl], pUser : Ptr[Byte], xDelUser : CFuncPtr1[Ptr[Byte], Unit], aCoord : Ptr[sqlite3_rtree_dbl], anQueue : Ptr[CUnsignedInt], nCoord : CInt, iLevel : CInt, mxLevel : CInt, iRowid : sqlite3_int64, rParentScore : sqlite3_rtree_dbl, eParentWithin : CInt, eWithin : CInt, rScore : sqlite3_rtree_dbl, apSqlParam : Ptr[Ptr[sqlite3_value]])(using Zone): Ptr[sqlite3_rtree_query_info] =
      val ____ptr = apply()
      (!____ptr).pContext = pContext
      (!____ptr).nParam = nParam
      (!____ptr).aParam = aParam
      (!____ptr).pUser = pUser
      (!____ptr).xDelUser = xDelUser
      (!____ptr).aCoord = aCoord
      (!____ptr).anQueue = anQueue
      (!____ptr).nCoord = nCoord
      (!____ptr).iLevel = iLevel
      (!____ptr).mxLevel = mxLevel
      (!____ptr).iRowid = iRowid
      (!____ptr).rParentScore = rParentScore
      (!____ptr).eParentWithin = eParentWithin
      (!____ptr).eWithin = eWithin
      (!____ptr).rScore = rScore
      (!____ptr).apSqlParam = apSqlParam
      ____ptr
    
    extension (struct: sqlite3_rtree_query_info)
      def pContext : Ptr[Byte] = struct._1
      def pContext_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def nParam : CInt = struct._2
      def nParam_=(value: CInt): Unit = !struct.at2 = value
      def aParam : Ptr[sqlite3_rtree_dbl] = struct._3
      def aParam_=(value: Ptr[sqlite3_rtree_dbl]): Unit = !struct.at3 = value
      def pUser : Ptr[Byte] = struct._4
      def pUser_=(value: Ptr[Byte]): Unit = !struct.at4 = value
      def xDelUser : CFuncPtr1[Ptr[Byte], Unit] = struct._5
      def xDelUser_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = !struct.at5 = value
      def aCoord : Ptr[sqlite3_rtree_dbl] = struct._6
      def aCoord_=(value: Ptr[sqlite3_rtree_dbl]): Unit = !struct.at6 = value
      def anQueue : Ptr[CUnsignedInt] = struct._7
      def anQueue_=(value: Ptr[CUnsignedInt]): Unit = !struct.at7 = value
      def nCoord : CInt = struct._8
      def nCoord_=(value: CInt): Unit = !struct.at8 = value
      def iLevel : CInt = struct._9
      def iLevel_=(value: CInt): Unit = !struct.at9 = value
      def mxLevel : CInt = struct._10
      def mxLevel_=(value: CInt): Unit = !struct.at10 = value
      def iRowid : sqlite3_int64 = struct._11
      def iRowid_=(value: sqlite3_int64): Unit = !struct.at11 = value
      def rParentScore : sqlite3_rtree_dbl = struct._12
      def rParentScore_=(value: sqlite3_rtree_dbl): Unit = !struct.at12 = value
      def eParentWithin : CInt = struct._13
      def eParentWithin_=(value: CInt): Unit = !struct.at13 = value
      def eWithin : CInt = struct._14
      def eWithin_=(value: CInt): Unit = !struct.at14 = value
      def rScore : sqlite3_rtree_dbl = struct._15
      def rScore_=(value: sqlite3_rtree_dbl): Unit = !struct.at15 = value
      def apSqlParam : Ptr[Ptr[sqlite3_value]] = struct._16
      def apSqlParam_=(value: Ptr[Ptr[sqlite3_value]]): Unit = !struct.at16 = value
    

  opaque type sqlite3_snapshot = CStruct1[CArray[CUnsignedChar, Nat.Digit2[Nat._4, Nat._8]]]
  
  object sqlite3_snapshot:
    given _tag: Tag[sqlite3_snapshot] = Tag.materializeCStruct1Tag[CArray[CUnsignedChar, Nat.Digit2[Nat._4, Nat._8]]]
    
    // Allocates sqlite3_snapshot on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_snapshot] = scala.scalanative.unsafe.alloc[sqlite3_snapshot](1)
    def apply(hidden : CArray[CUnsignedChar, Nat.Digit2[Nat._4, Nat._8]])(using Zone): Ptr[sqlite3_snapshot] =
      val ____ptr = apply()
      (!____ptr).hidden = hidden
      ____ptr
    
    extension (struct: sqlite3_snapshot)
      def hidden : CArray[CUnsignedChar, Nat.Digit2[Nat._4, Nat._8]] = struct._1
      def hidden_=(value: CArray[CUnsignedChar, Nat.Digit2[Nat._4, Nat._8]]): Unit = !struct.at1 = value
    

  opaque type sqlite3_stmt = CStruct0
  
  object sqlite3_stmt:
    given _tag: Tag[sqlite3_stmt] = Tag.materializeCStruct0Tag
    

  opaque type sqlite3_str = CStruct0
  
  object sqlite3_str:
    given _tag: Tag[sqlite3_str] = Tag.materializeCStruct0Tag
    

  opaque type sqlite3_value = CStruct0
  
  object sqlite3_value:
    given _tag: Tag[sqlite3_value] = Tag.materializeCStruct0Tag
    

  opaque type sqlite3_vfs = CStruct22[CInt, CInt, CInt, Ptr[Byte], CString, Ptr[Byte], CFuncPtr5[Ptr[Byte], sqlite3_filename, Ptr[Byte], CInt, Ptr[CInt], CInt], CFuncPtr3[Ptr[Byte], CString, CInt, CInt], CFuncPtr4[Ptr[Byte], CString, CInt, Ptr[CInt], CInt], CFuncPtr4[Ptr[Byte], CString, CInt, CString, CInt], CFuncPtr2[Ptr[Byte], CString, Ptr[Byte]], CFuncPtr3[Ptr[Byte], CInt, CString, Unit], CFuncPtr3[Ptr[Byte], Ptr[Byte], CString, CFuncPtr0[Unit]], CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], CInt, CString, CInt], CFuncPtr2[Ptr[Byte], CInt, CInt], CFuncPtr2[Ptr[Byte], Ptr[Double], CInt], CFuncPtr3[Ptr[Byte], CInt, CString, CInt], CFuncPtr2[Ptr[Byte], Ptr[sqlite3_int64], CInt], CFuncPtr3[Ptr[Byte], CString, sqlite3_syscall_ptr, CInt], CFuncPtr2[Ptr[Byte], CString, sqlite3_syscall_ptr], CFuncPtr2[Ptr[Byte], CString, CString]]
  
  object sqlite3_vfs:
    given _tag: Tag[sqlite3_vfs] = Tag.materializeCStruct22Tag[CInt, CInt, CInt, Ptr[Byte], CString, Ptr[Byte], CFuncPtr5[Ptr[Byte], sqlite3_filename, Ptr[Byte], CInt, Ptr[CInt], CInt], CFuncPtr3[Ptr[Byte], CString, CInt, CInt], CFuncPtr4[Ptr[Byte], CString, CInt, Ptr[CInt], CInt], CFuncPtr4[Ptr[Byte], CString, CInt, CString, CInt], CFuncPtr2[Ptr[Byte], CString, Ptr[Byte]], CFuncPtr3[Ptr[Byte], CInt, CString, Unit], CFuncPtr3[Ptr[Byte], Ptr[Byte], CString, CFuncPtr0[Unit]], CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit], CFuncPtr3[Ptr[Byte], CInt, CString, CInt], CFuncPtr2[Ptr[Byte], CInt, CInt], CFuncPtr2[Ptr[Byte], Ptr[Double], CInt], CFuncPtr3[Ptr[Byte], CInt, CString, CInt], CFuncPtr2[Ptr[Byte], Ptr[sqlite3_int64], CInt], CFuncPtr3[Ptr[Byte], CString, sqlite3_syscall_ptr, CInt], CFuncPtr2[Ptr[Byte], CString, sqlite3_syscall_ptr], CFuncPtr2[Ptr[Byte], CString, CString]]
    
    // Allocates sqlite3_vfs on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_vfs] = scala.scalanative.unsafe.alloc[sqlite3_vfs](1)
    def apply(iVersion : CInt, szOsFile : CInt, mxPathname : CInt, pNext : Ptr[sqlite3_vfs], zName : CString, pAppData : Ptr[Byte], xOpen : CFuncPtr5[Ptr[sqlite3_vfs], sqlite3_filename, Ptr[sqlite3_file], CInt, Ptr[CInt], CInt], xDelete : CFuncPtr3[Ptr[sqlite3_vfs], CString, CInt, CInt], xAccess : CFuncPtr4[Ptr[sqlite3_vfs], CString, CInt, Ptr[CInt], CInt], xFullPathname : CFuncPtr4[Ptr[sqlite3_vfs], CString, CInt, CString, CInt], xDlOpen : CFuncPtr2[Ptr[sqlite3_vfs], CString, Ptr[Byte]], xDlError : CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, Unit], xDlSym : CFuncPtr3[Ptr[sqlite3_vfs], Ptr[Byte], CString, CFuncPtr0[Unit]], xDlClose : CFuncPtr2[Ptr[sqlite3_vfs], Ptr[Byte], Unit], xRandomness : CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, CInt], xSleep : CFuncPtr2[Ptr[sqlite3_vfs], CInt, CInt], xCurrentTime : CFuncPtr2[Ptr[sqlite3_vfs], Ptr[Double], CInt], xGetLastError : CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, CInt], xCurrentTimeInt64 : CFuncPtr2[Ptr[sqlite3_vfs], Ptr[sqlite3_int64], CInt], xSetSystemCall : CFuncPtr3[Ptr[sqlite3_vfs], CString, sqlite3_syscall_ptr, CInt], xGetSystemCall : CFuncPtr2[Ptr[sqlite3_vfs], CString, sqlite3_syscall_ptr], xNextSystemCall : CFuncPtr2[Ptr[sqlite3_vfs], CString, CString])(using Zone): Ptr[sqlite3_vfs] =
      val ____ptr = apply()
      (!____ptr).iVersion = iVersion
      (!____ptr).szOsFile = szOsFile
      (!____ptr).mxPathname = mxPathname
      (!____ptr).pNext = pNext
      (!____ptr).zName = zName
      (!____ptr).pAppData = pAppData
      (!____ptr).xOpen = xOpen
      (!____ptr).xDelete = xDelete
      (!____ptr).xAccess = xAccess
      (!____ptr).xFullPathname = xFullPathname
      (!____ptr).xDlOpen = xDlOpen
      (!____ptr).xDlError = xDlError
      (!____ptr).xDlSym = xDlSym
      (!____ptr).xDlClose = xDlClose
      (!____ptr).xRandomness = xRandomness
      (!____ptr).xSleep = xSleep
      (!____ptr).xCurrentTime = xCurrentTime
      (!____ptr).xGetLastError = xGetLastError
      (!____ptr).xCurrentTimeInt64 = xCurrentTimeInt64
      (!____ptr).xSetSystemCall = xSetSystemCall
      (!____ptr).xGetSystemCall = xGetSystemCall
      (!____ptr).xNextSystemCall = xNextSystemCall
      ____ptr
    
    extension (struct: sqlite3_vfs)
      def iVersion : CInt = struct._1
      def iVersion_=(value: CInt): Unit = !struct.at1 = value
      def szOsFile : CInt = struct._2
      def szOsFile_=(value: CInt): Unit = !struct.at2 = value
      def mxPathname : CInt = struct._3
      def mxPathname_=(value: CInt): Unit = !struct.at3 = value
      def pNext : Ptr[sqlite3_vfs] = struct._4.asInstanceOf[Ptr[sqlite3_vfs]]
      def pNext_=(value: Ptr[sqlite3_vfs]): Unit = !struct.at4 = value.asInstanceOf[Ptr[Byte]]
      def zName : CString = struct._5
      def zName_=(value: CString): Unit = !struct.at5 = value
      def pAppData : Ptr[Byte] = struct._6
      def pAppData_=(value: Ptr[Byte]): Unit = !struct.at6 = value
      def xOpen : CFuncPtr5[Ptr[sqlite3_vfs], sqlite3_filename, Ptr[sqlite3_file], CInt, Ptr[CInt], CInt] = struct._7.asInstanceOf[CFuncPtr5[Ptr[sqlite3_vfs], sqlite3_filename, Ptr[sqlite3_file], CInt, Ptr[CInt], CInt]]
      def xOpen_=(value: CFuncPtr5[Ptr[sqlite3_vfs], sqlite3_filename, Ptr[sqlite3_file], CInt, Ptr[CInt], CInt]): Unit = !struct.at7 = value.asInstanceOf[CFuncPtr5[Ptr[Byte], sqlite3_filename, Ptr[Byte], CInt, Ptr[CInt], CInt]]
      def xDelete : CFuncPtr3[Ptr[sqlite3_vfs], CString, CInt, CInt] = struct._8.asInstanceOf[CFuncPtr3[Ptr[sqlite3_vfs], CString, CInt, CInt]]
      def xDelete_=(value: CFuncPtr3[Ptr[sqlite3_vfs], CString, CInt, CInt]): Unit = !struct.at8 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], CString, CInt, CInt]]
      def xAccess : CFuncPtr4[Ptr[sqlite3_vfs], CString, CInt, Ptr[CInt], CInt] = struct._9.asInstanceOf[CFuncPtr4[Ptr[sqlite3_vfs], CString, CInt, Ptr[CInt], CInt]]
      def xAccess_=(value: CFuncPtr4[Ptr[sqlite3_vfs], CString, CInt, Ptr[CInt], CInt]): Unit = !struct.at9 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], CString, CInt, Ptr[CInt], CInt]]
      def xFullPathname : CFuncPtr4[Ptr[sqlite3_vfs], CString, CInt, CString, CInt] = struct._10.asInstanceOf[CFuncPtr4[Ptr[sqlite3_vfs], CString, CInt, CString, CInt]]
      def xFullPathname_=(value: CFuncPtr4[Ptr[sqlite3_vfs], CString, CInt, CString, CInt]): Unit = !struct.at10 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], CString, CInt, CString, CInt]]
      def xDlOpen : CFuncPtr2[Ptr[sqlite3_vfs], CString, Ptr[Byte]] = struct._11.asInstanceOf[CFuncPtr2[Ptr[sqlite3_vfs], CString, Ptr[Byte]]]
      def xDlOpen_=(value: CFuncPtr2[Ptr[sqlite3_vfs], CString, Ptr[Byte]]): Unit = !struct.at11 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], CString, Ptr[Byte]]]
      def xDlError : CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, Unit] = struct._12.asInstanceOf[CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, Unit]]
      def xDlError_=(value: CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, Unit]): Unit = !struct.at12 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], CInt, CString, Unit]]
      def xDlSym : CFuncPtr3[Ptr[sqlite3_vfs], Ptr[Byte], CString, CFuncPtr0[Unit]] = struct._13.asInstanceOf[CFuncPtr3[Ptr[sqlite3_vfs], Ptr[Byte], CString, CFuncPtr0[Unit]]]
      def xDlSym_=(value: CFuncPtr3[Ptr[sqlite3_vfs], Ptr[Byte], CString, CFuncPtr0[Unit]]): Unit = !struct.at13 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], Ptr[Byte], CString, CFuncPtr0[Unit]]]
      def xDlClose : CFuncPtr2[Ptr[sqlite3_vfs], Ptr[Byte], Unit] = struct._14.asInstanceOf[CFuncPtr2[Ptr[sqlite3_vfs], Ptr[Byte], Unit]]
      def xDlClose_=(value: CFuncPtr2[Ptr[sqlite3_vfs], Ptr[Byte], Unit]): Unit = !struct.at14 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit]]
      def xRandomness : CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, CInt] = struct._15.asInstanceOf[CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, CInt]]
      def xRandomness_=(value: CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, CInt]): Unit = !struct.at15 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], CInt, CString, CInt]]
      def xSleep : CFuncPtr2[Ptr[sqlite3_vfs], CInt, CInt] = struct._16.asInstanceOf[CFuncPtr2[Ptr[sqlite3_vfs], CInt, CInt]]
      def xSleep_=(value: CFuncPtr2[Ptr[sqlite3_vfs], CInt, CInt]): Unit = !struct.at16 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], CInt, CInt]]
      def xCurrentTime : CFuncPtr2[Ptr[sqlite3_vfs], Ptr[Double], CInt] = struct._17.asInstanceOf[CFuncPtr2[Ptr[sqlite3_vfs], Ptr[Double], CInt]]
      def xCurrentTime_=(value: CFuncPtr2[Ptr[sqlite3_vfs], Ptr[Double], CInt]): Unit = !struct.at17 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[Double], CInt]]
      def xGetLastError : CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, CInt] = struct._18.asInstanceOf[CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, CInt]]
      def xGetLastError_=(value: CFuncPtr3[Ptr[sqlite3_vfs], CInt, CString, CInt]): Unit = !struct.at18 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], CInt, CString, CInt]]
      def xCurrentTimeInt64 : CFuncPtr2[Ptr[sqlite3_vfs], Ptr[sqlite3_int64], CInt] = struct._19.asInstanceOf[CFuncPtr2[Ptr[sqlite3_vfs], Ptr[sqlite3_int64], CInt]]
      def xCurrentTimeInt64_=(value: CFuncPtr2[Ptr[sqlite3_vfs], Ptr[sqlite3_int64], CInt]): Unit = !struct.at19 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[sqlite3_int64], CInt]]
      def xSetSystemCall : CFuncPtr3[Ptr[sqlite3_vfs], CString, sqlite3_syscall_ptr, CInt] = struct._20.asInstanceOf[CFuncPtr3[Ptr[sqlite3_vfs], CString, sqlite3_syscall_ptr, CInt]]
      def xSetSystemCall_=(value: CFuncPtr3[Ptr[sqlite3_vfs], CString, sqlite3_syscall_ptr, CInt]): Unit = !struct.at20 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], CString, sqlite3_syscall_ptr, CInt]]
      def xGetSystemCall : CFuncPtr2[Ptr[sqlite3_vfs], CString, sqlite3_syscall_ptr] = struct._21.asInstanceOf[CFuncPtr2[Ptr[sqlite3_vfs], CString, sqlite3_syscall_ptr]]
      def xGetSystemCall_=(value: CFuncPtr2[Ptr[sqlite3_vfs], CString, sqlite3_syscall_ptr]): Unit = !struct.at21 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], CString, sqlite3_syscall_ptr]]
      def xNextSystemCall : CFuncPtr2[Ptr[sqlite3_vfs], CString, CString] = struct._22.asInstanceOf[CFuncPtr2[Ptr[sqlite3_vfs], CString, CString]]
      def xNextSystemCall_=(value: CFuncPtr2[Ptr[sqlite3_vfs], CString, CString]): Unit = !struct.at22 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], CString, CString]]
    

  opaque type sqlite3_vtab = CStruct3[Ptr[sqlite3_module], CInt, CString]
  
  object sqlite3_vtab:
    given _tag: Tag[sqlite3_vtab] = Tag.materializeCStruct3Tag[Ptr[sqlite3_module], CInt, CString]
    
    // Allocates sqlite3_vtab on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_vtab] = scala.scalanative.unsafe.alloc[sqlite3_vtab](1)
    def apply(pModule : Ptr[sqlite3_module], nRef : CInt, zErrMsg : CString)(using Zone): Ptr[sqlite3_vtab] =
      val ____ptr = apply()
      (!____ptr).pModule = pModule
      (!____ptr).nRef = nRef
      (!____ptr).zErrMsg = zErrMsg
      ____ptr
    
    extension (struct: sqlite3_vtab)
      def pModule : Ptr[sqlite3_module] = struct._1
      def pModule_=(value: Ptr[sqlite3_module]): Unit = !struct.at1 = value
      def nRef : CInt = struct._2
      def nRef_=(value: CInt): Unit = !struct.at2 = value
      def zErrMsg : CString = struct._3
      def zErrMsg_=(value: CString): Unit = !struct.at3 = value
    

  opaque type sqlite3_vtab_cursor = CStruct1[Ptr[sqlite3_vtab]]
  
  object sqlite3_vtab_cursor:
    given _tag: Tag[sqlite3_vtab_cursor] = Tag.materializeCStruct1Tag[Ptr[sqlite3_vtab]]
    
    // Allocates sqlite3_vtab_cursor on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[sqlite3_vtab_cursor] = scala.scalanative.unsafe.alloc[sqlite3_vtab_cursor](1)
    def apply(pVtab : Ptr[sqlite3_vtab])(using Zone): Ptr[sqlite3_vtab_cursor] =
      val ____ptr = apply()
      (!____ptr).pVtab = pVtab
      ____ptr
    
    extension (struct: sqlite3_vtab_cursor)
      def pVtab : Ptr[sqlite3_vtab] = struct._1
      def pVtab_=(value: Ptr[sqlite3_vtab]): Unit = !struct.at1 = value
    


@extern
private[libsqlite] object extern_functions:
  import _root_.libsqlite.aliases.*
  import _root_.libsqlite.structs.*
  def sqlite3_aggregate_context(_0 : Ptr[sqlite3_context], nBytes : CInt): Ptr[Byte] = extern

  def sqlite3_aggregate_count(_0 : Ptr[sqlite3_context]): CInt = extern

  def sqlite3_auto_extension(xEntryPoint : CFuncPtr0[Unit]): CInt = extern

  def sqlite3_autovacuum_pages(db : Ptr[sqlite3], _1 : CFuncPtr5[Ptr[Byte], CString, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt], _2 : Ptr[Byte], _3 : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_backup_finish(p : Ptr[sqlite3_backup]): CInt = extern

  def sqlite3_backup_init(pDest : Ptr[sqlite3], zDestName : CString, pSource : Ptr[sqlite3], zSourceName : CString): Ptr[sqlite3_backup] = extern

  def sqlite3_backup_pagecount(p : Ptr[sqlite3_backup]): CInt = extern

  def sqlite3_backup_remaining(p : Ptr[sqlite3_backup]): CInt = extern

  def sqlite3_backup_step(p : Ptr[sqlite3_backup], nPage : CInt): CInt = extern

  def sqlite3_bind_blob(_0 : Ptr[sqlite3_stmt], _1 : CInt, _2 : Ptr[Byte], n : CInt, _4 : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_bind_blob64(_0 : Ptr[sqlite3_stmt], _1 : CInt, _2 : Ptr[Byte], _3 : sqlite3_uint64, _4 : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_bind_double(_0 : Ptr[sqlite3_stmt], _1 : CInt, _2 : Double): CInt = extern

  def sqlite3_bind_int(_0 : Ptr[sqlite3_stmt], _1 : CInt, _2 : CInt): CInt = extern

  def sqlite3_bind_int64(_0 : Ptr[sqlite3_stmt], _1 : CInt, _2 : sqlite3_int64): CInt = extern

  def sqlite3_bind_null(_0 : Ptr[sqlite3_stmt], _1 : CInt): CInt = extern

  def sqlite3_bind_parameter_count(_0 : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_bind_parameter_index(_0 : Ptr[sqlite3_stmt], zName : CString): CInt = extern

  def sqlite3_bind_parameter_name(_0 : Ptr[sqlite3_stmt], _1 : CInt): CString = extern

  def sqlite3_bind_pointer(_0 : Ptr[sqlite3_stmt], _1 : CInt, _2 : Ptr[Byte], _3 : CString, _4 : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_bind_text(_0 : Ptr[sqlite3_stmt], _1 : CInt, _2 : CString, _3 : CInt, _4 : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_bind_text16(_0 : Ptr[sqlite3_stmt], _1 : CInt, _2 : Ptr[Byte], _3 : CInt, _4 : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_bind_text64(_0 : Ptr[sqlite3_stmt], _1 : CInt, _2 : CString, _3 : sqlite3_uint64, _4 : CFuncPtr1[Ptr[Byte], Unit], encoding : CUnsignedChar): CInt = extern

  def sqlite3_bind_value(_0 : Ptr[sqlite3_stmt], _1 : CInt, _2 : Ptr[sqlite3_value]): CInt = extern

  def sqlite3_bind_zeroblob(_0 : Ptr[sqlite3_stmt], _1 : CInt, n : CInt): CInt = extern

  def sqlite3_bind_zeroblob64(_0 : Ptr[sqlite3_stmt], _1 : CInt, _2 : sqlite3_uint64): CInt = extern

  def sqlite3_blob_bytes(_0 : Ptr[sqlite3_blob]): CInt = extern

  def sqlite3_blob_close(_0 : Ptr[sqlite3_blob]): CInt = extern

  def sqlite3_blob_open(_0 : Ptr[sqlite3], zDb : CString, zTable : CString, zColumn : CString, iRow : sqlite3_int64, flags : CInt, ppBlob : Ptr[Ptr[sqlite3_blob]]): CInt = extern

  def sqlite3_blob_read(_0 : Ptr[sqlite3_blob], Z : Ptr[Byte], N : CInt, iOffset : CInt): CInt = extern

  def sqlite3_blob_reopen(_0 : Ptr[sqlite3_blob], _1 : sqlite3_int64): CInt = extern

  def sqlite3_blob_write(_0 : Ptr[sqlite3_blob], z : Ptr[Byte], n : CInt, iOffset : CInt): CInt = extern

  def sqlite3_busy_handler(_0 : Ptr[sqlite3], _1 : CFuncPtr2[Ptr[Byte], CInt, CInt], _2 : Ptr[Byte]): CInt = extern

  def sqlite3_busy_timeout(_0 : Ptr[sqlite3], ms : CInt): CInt = extern

  def sqlite3_cancel_auto_extension(xEntryPoint : CFuncPtr0[Unit]): CInt = extern

  def sqlite3_changes(_0 : Ptr[sqlite3]): CInt = extern

  def sqlite3_changes64(_0 : Ptr[sqlite3]): sqlite3_int64 = extern

  def sqlite3_clear_bindings(_0 : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_close(_0 : Ptr[sqlite3]): CInt = extern

  def sqlite3_close_v2(_0 : Ptr[sqlite3]): CInt = extern

  def sqlite3_collation_needed(_0 : Ptr[sqlite3], _1 : Ptr[Byte], _2 : CFuncPtr4[Ptr[Byte], Ptr[sqlite3], CInt, CString, Unit]): CInt = extern

  def sqlite3_collation_needed16(_0 : Ptr[sqlite3], _1 : Ptr[Byte], _2 : CFuncPtr4[Ptr[Byte], Ptr[sqlite3], CInt, Ptr[Byte], Unit]): CInt = extern

  def sqlite3_column_blob(_0 : Ptr[sqlite3_stmt], iCol : CInt): Ptr[Byte] = extern

  def sqlite3_column_bytes(_0 : Ptr[sqlite3_stmt], iCol : CInt): CInt = extern

  def sqlite3_column_bytes16(_0 : Ptr[sqlite3_stmt], iCol : CInt): CInt = extern

  def sqlite3_column_count(pStmt : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_column_database_name(_0 : Ptr[sqlite3_stmt], _1 : CInt): CString = extern

  def sqlite3_column_database_name16(_0 : Ptr[sqlite3_stmt], _1 : CInt): Ptr[Byte] = extern

  def sqlite3_column_decltype(_0 : Ptr[sqlite3_stmt], _1 : CInt): CString = extern

  def sqlite3_column_decltype16(_0 : Ptr[sqlite3_stmt], _1 : CInt): Ptr[Byte] = extern

  def sqlite3_column_double(_0 : Ptr[sqlite3_stmt], iCol : CInt): Double = extern

  def sqlite3_column_int(_0 : Ptr[sqlite3_stmt], iCol : CInt): CInt = extern

  def sqlite3_column_int64(_0 : Ptr[sqlite3_stmt], iCol : CInt): sqlite3_int64 = extern

  def sqlite3_column_name(_0 : Ptr[sqlite3_stmt], N : CInt): CString = extern

  def sqlite3_column_name16(_0 : Ptr[sqlite3_stmt], N : CInt): Ptr[Byte] = extern

  def sqlite3_column_origin_name(_0 : Ptr[sqlite3_stmt], _1 : CInt): CString = extern

  def sqlite3_column_origin_name16(_0 : Ptr[sqlite3_stmt], _1 : CInt): Ptr[Byte] = extern

  def sqlite3_column_table_name(_0 : Ptr[sqlite3_stmt], _1 : CInt): CString = extern

  def sqlite3_column_table_name16(_0 : Ptr[sqlite3_stmt], _1 : CInt): Ptr[Byte] = extern

  def sqlite3_column_text(_0 : Ptr[sqlite3_stmt], iCol : CInt): Ptr[CUnsignedChar] = extern

  def sqlite3_column_text16(_0 : Ptr[sqlite3_stmt], iCol : CInt): Ptr[Byte] = extern

  def sqlite3_column_type(_0 : Ptr[sqlite3_stmt], iCol : CInt): CInt = extern

  def sqlite3_column_value(_0 : Ptr[sqlite3_stmt], iCol : CInt): Ptr[sqlite3_value] = extern

  def sqlite3_commit_hook(_0 : Ptr[sqlite3], _1 : CFuncPtr1[Ptr[Byte], CInt], _2 : Ptr[Byte]): Ptr[Byte] = extern

  def sqlite3_compileoption_get(N : CInt): CString = extern

  def sqlite3_compileoption_used(zOptName : CString): CInt = extern

  def sqlite3_complete(sql : CString): CInt = extern

  def sqlite3_complete16(sql : Ptr[Byte]): CInt = extern

  def sqlite3_config(_0 : CInt, rest: Any*): CInt = extern

  def sqlite3_context_db_handle(_0 : Ptr[sqlite3_context]): Ptr[sqlite3] = extern

  def sqlite3_create_collation(_0 : Ptr[sqlite3], zName : CString, eTextRep : CInt, pArg : Ptr[Byte], xCompare : CFuncPtr5[Ptr[Byte], CInt, Ptr[Byte], CInt, Ptr[Byte], CInt]): CInt = extern

  def sqlite3_create_collation16(_0 : Ptr[sqlite3], zName : Ptr[Byte], eTextRep : CInt, pArg : Ptr[Byte], xCompare : CFuncPtr5[Ptr[Byte], CInt, Ptr[Byte], CInt, Ptr[Byte], CInt]): CInt = extern

  def sqlite3_create_collation_v2(_0 : Ptr[sqlite3], zName : CString, eTextRep : CInt, pArg : Ptr[Byte], xCompare : CFuncPtr5[Ptr[Byte], CInt, Ptr[Byte], CInt, Ptr[Byte], CInt], xDestroy : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_create_filename(zDatabase : CString, zJournal : CString, zWal : CString, nParam : CInt, azParam : Ptr[CString]): sqlite3_filename = extern

  def sqlite3_create_function(db : Ptr[sqlite3], zFunctionName : CString, nArg : CInt, eTextRep : CInt, pApp : Ptr[Byte], xFunc : CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit], xStep : CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit], xFinal : CFuncPtr1[Ptr[sqlite3_context], Unit]): CInt = extern

  def sqlite3_create_function16(db : Ptr[sqlite3], zFunctionName : Ptr[Byte], nArg : CInt, eTextRep : CInt, pApp : Ptr[Byte], xFunc : CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit], xStep : CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit], xFinal : CFuncPtr1[Ptr[sqlite3_context], Unit]): CInt = extern

  def sqlite3_create_function_v2(db : Ptr[sqlite3], zFunctionName : CString, nArg : CInt, eTextRep : CInt, pApp : Ptr[Byte], xFunc : CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit], xStep : CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit], xFinal : CFuncPtr1[Ptr[sqlite3_context], Unit], xDestroy : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_create_module(db : Ptr[sqlite3], zName : CString, p : Ptr[sqlite3_module], pClientData : Ptr[Byte]): CInt = extern

  def sqlite3_create_module_v2(db : Ptr[sqlite3], zName : CString, p : Ptr[sqlite3_module], pClientData : Ptr[Byte], xDestroy : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_create_window_function(db : Ptr[sqlite3], zFunctionName : CString, nArg : CInt, eTextRep : CInt, pApp : Ptr[Byte], xStep : CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit], xFinal : CFuncPtr1[Ptr[sqlite3_context], Unit], xValue : CFuncPtr1[Ptr[sqlite3_context], Unit], xInverse : CFuncPtr3[Ptr[sqlite3_context], CInt, Ptr[Ptr[sqlite3_value]], Unit], xDestroy : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_data_count(pStmt : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_database_file_object(_0 : CString): Ptr[sqlite3_file] = extern

  def sqlite3_db_cacheflush(_0 : Ptr[sqlite3]): CInt = extern

  def sqlite3_db_config(_0 : Ptr[sqlite3], op : CInt, rest: Any*): CInt = extern

  def sqlite3_db_filename(db : Ptr[sqlite3], zDbName : CString): sqlite3_filename = extern

  def sqlite3_db_handle(_0 : Ptr[sqlite3_stmt]): Ptr[sqlite3] = extern

  def sqlite3_db_mutex(_0 : Ptr[sqlite3]): Ptr[sqlite3_mutex] = extern

  def sqlite3_db_name(db : Ptr[sqlite3], N : CInt): CString = extern

  def sqlite3_db_readonly(db : Ptr[sqlite3], zDbName : CString): CInt = extern

  def sqlite3_db_release_memory(_0 : Ptr[sqlite3]): CInt = extern

  def sqlite3_db_status(_0 : Ptr[sqlite3], op : CInt, pCur : Ptr[CInt], pHiwtr : Ptr[CInt], resetFlg : CInt): CInt = extern

  def sqlite3_declare_vtab(_0 : Ptr[sqlite3], zSQL : CString): CInt = extern

  def sqlite3_deserialize(db : Ptr[sqlite3], zSchema : CString, pData : Ptr[CUnsignedChar], szDb : sqlite3_int64, szBuf : sqlite3_int64, mFlags : CUnsignedInt): CInt = extern

  def sqlite3_drop_modules(db : Ptr[sqlite3], azKeep : Ptr[CString]): CInt = extern

  def sqlite3_enable_load_extension(db : Ptr[sqlite3], onoff : CInt): CInt = extern

  def sqlite3_enable_shared_cache(_0 : CInt): CInt = extern

  def sqlite3_errcode(db : Ptr[sqlite3]): CInt = extern

  def sqlite3_errmsg(_0 : Ptr[sqlite3]): CString = extern

  def sqlite3_errmsg16(_0 : Ptr[sqlite3]): Ptr[Byte] = extern

  def sqlite3_error_offset(db : Ptr[sqlite3]): CInt = extern

  def sqlite3_errstr(_0 : CInt): CString = extern

  def sqlite3_exec(_0 : Ptr[sqlite3], sql : CString, callback : CFuncPtr4[Ptr[Byte], CInt, Ptr[CString], Ptr[CString], CInt], _3 : Ptr[Byte], errmsg : Ptr[CString]): CInt = extern

  def sqlite3_expanded_sql(pStmt : Ptr[sqlite3_stmt]): CString = extern

  def sqlite3_expired(_0 : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_extended_errcode(db : Ptr[sqlite3]): CInt = extern

  def sqlite3_extended_result_codes(_0 : Ptr[sqlite3], onoff : CInt): CInt = extern

  def sqlite3_file_control(_0 : Ptr[sqlite3], zDbName : CString, op : CInt, _3 : Ptr[Byte]): CInt = extern

  def sqlite3_filename_database(_0 : sqlite3_filename): CString = extern

  def sqlite3_filename_journal(_0 : sqlite3_filename): CString = extern

  def sqlite3_filename_wal(_0 : sqlite3_filename): CString = extern

  def sqlite3_finalize(pStmt : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_free(_0 : Ptr[Byte]): Unit = extern

  def sqlite3_free_filename(_0 : sqlite3_filename): Unit = extern

  def sqlite3_free_table(result : Ptr[CString]): Unit = extern

  def sqlite3_get_autocommit(_0 : Ptr[sqlite3]): CInt = extern

  def sqlite3_get_auxdata(_0 : Ptr[sqlite3_context], N : CInt): Ptr[Byte] = extern

  def sqlite3_get_clientdata(_0 : Ptr[sqlite3], _1 : CString): Ptr[Byte] = extern

  def sqlite3_get_table(db : Ptr[sqlite3], zSql : CString, pazResult : Ptr[Ptr[CString]], pnRow : Ptr[CInt], pnColumn : Ptr[CInt], pzErrmsg : Ptr[CString]): CInt = extern

  def sqlite3_global_recover(): CInt = extern

  def sqlite3_hard_heap_limit64(N : sqlite3_int64): sqlite3_int64 = extern

  def sqlite3_initialize(): CInt = extern

  def sqlite3_interrupt(_0 : Ptr[sqlite3]): Unit = extern

  def sqlite3_is_interrupted(_0 : Ptr[sqlite3]): CInt = extern

  def sqlite3_keyword_check(_0 : CString, _1 : CInt): CInt = extern

  def sqlite3_keyword_count(): CInt = extern

  def sqlite3_keyword_name(_0 : CInt, _1 : Ptr[CString], _2 : Ptr[CInt]): CInt = extern

  def sqlite3_last_insert_rowid(_0 : Ptr[sqlite3]): sqlite3_int64 = extern

  def sqlite3_libversion(): CString = extern

  def sqlite3_libversion_number(): CInt = extern

  def sqlite3_limit(_0 : Ptr[sqlite3], id : CInt, newVal : CInt): CInt = extern

  def sqlite3_load_extension(db : Ptr[sqlite3], zFile : CString, zProc : CString, pzErrMsg : Ptr[CString]): CInt = extern

  def sqlite3_log(iErrCode : CInt, zFormat : CString, rest: Any*): Unit = extern

  def sqlite3_malloc(_0 : CInt): Ptr[Byte] = extern

  def sqlite3_malloc64(_0 : sqlite3_uint64): Ptr[Byte] = extern

  def sqlite3_memory_alarm(_0 : CFuncPtr3[Ptr[Byte], sqlite3_int64, CInt, Unit], _1 : Ptr[Byte], _2 : sqlite3_int64): CInt = extern

  def sqlite3_memory_highwater(resetFlag : CInt): sqlite3_int64 = extern

  def sqlite3_memory_used(): sqlite3_int64 = extern

  def sqlite3_mprintf(_0 : CString, rest: Any*): CString = extern

  def sqlite3_msize(_0 : Ptr[Byte]): sqlite3_uint64 = extern

  def sqlite3_mutex_alloc(_0 : CInt): Ptr[sqlite3_mutex] = extern

  def sqlite3_mutex_enter(_0 : Ptr[sqlite3_mutex]): Unit = extern

  def sqlite3_mutex_free(_0 : Ptr[sqlite3_mutex]): Unit = extern

  def sqlite3_mutex_held(_0 : Ptr[sqlite3_mutex]): CInt = extern

  def sqlite3_mutex_leave(_0 : Ptr[sqlite3_mutex]): Unit = extern

  def sqlite3_mutex_notheld(_0 : Ptr[sqlite3_mutex]): CInt = extern

  def sqlite3_mutex_try(_0 : Ptr[sqlite3_mutex]): CInt = extern

  def sqlite3_next_stmt(pDb : Ptr[sqlite3], pStmt : Ptr[sqlite3_stmt]): Ptr[sqlite3_stmt] = extern

  def sqlite3_open(filename : CString, ppDb : Ptr[Ptr[sqlite3]]): CInt = extern

  def sqlite3_open16(filename : Ptr[Byte], ppDb : Ptr[Ptr[sqlite3]]): CInt = extern

  def sqlite3_open_v2(filename : CString, ppDb : Ptr[Ptr[sqlite3]], flags : CInt, zVfs : CString): CInt = extern

  def sqlite3_os_end(): CInt = extern

  def sqlite3_os_init(): CInt = extern

  def sqlite3_overload_function(_0 : Ptr[sqlite3], zFuncName : CString, nArg : CInt): CInt = extern

  def sqlite3_prepare(db : Ptr[sqlite3], zSql : CString, nByte : CInt, ppStmt : Ptr[Ptr[sqlite3_stmt]], pzTail : Ptr[CString]): CInt = extern

  def sqlite3_prepare16(db : Ptr[sqlite3], zSql : Ptr[Byte], nByte : CInt, ppStmt : Ptr[Ptr[sqlite3_stmt]], pzTail : Ptr[Ptr[Byte]]): CInt = extern

  def sqlite3_prepare16_v2(db : Ptr[sqlite3], zSql : Ptr[Byte], nByte : CInt, ppStmt : Ptr[Ptr[sqlite3_stmt]], pzTail : Ptr[Ptr[Byte]]): CInt = extern

  def sqlite3_prepare16_v3(db : Ptr[sqlite3], zSql : Ptr[Byte], nByte : CInt, prepFlags : CUnsignedInt, ppStmt : Ptr[Ptr[sqlite3_stmt]], pzTail : Ptr[Ptr[Byte]]): CInt = extern

  def sqlite3_prepare_v2(db : Ptr[sqlite3], zSql : CString, nByte : CInt, ppStmt : Ptr[Ptr[sqlite3_stmt]], pzTail : Ptr[CString]): CInt = extern

  def sqlite3_prepare_v3(db : Ptr[sqlite3], zSql : CString, nByte : CInt, prepFlags : CUnsignedInt, ppStmt : Ptr[Ptr[sqlite3_stmt]], pzTail : Ptr[CString]): CInt = extern

  def sqlite3_profile(_0 : Ptr[sqlite3], xProfile : CFuncPtr3[Ptr[Byte], CString, sqlite3_uint64, Unit], _2 : Ptr[Byte]): Ptr[Byte] = extern

  def sqlite3_progress_handler(_0 : Ptr[sqlite3], _1 : CInt, _2 : CFuncPtr1[Ptr[Byte], CInt], _3 : Ptr[Byte]): Unit = extern

  def sqlite3_randomness(N : CInt, P : Ptr[Byte]): Unit = extern

  def sqlite3_realloc(_0 : Ptr[Byte], _1 : CInt): Ptr[Byte] = extern

  def sqlite3_realloc64(_0 : Ptr[Byte], _1 : sqlite3_uint64): Ptr[Byte] = extern

  def sqlite3_release_memory(_0 : CInt): CInt = extern

  def sqlite3_reset(pStmt : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_reset_auto_extension(): Unit = extern

  def sqlite3_result_blob(_0 : Ptr[sqlite3_context], _1 : Ptr[Byte], _2 : CInt, _3 : CFuncPtr1[Ptr[Byte], Unit]): Unit = extern

  def sqlite3_result_blob64(_0 : Ptr[sqlite3_context], _1 : Ptr[Byte], _2 : sqlite3_uint64, _3 : CFuncPtr1[Ptr[Byte], Unit]): Unit = extern

  def sqlite3_result_double(_0 : Ptr[sqlite3_context], _1 : Double): Unit = extern

  def sqlite3_result_error(_0 : Ptr[sqlite3_context], _1 : CString, _2 : CInt): Unit = extern

  def sqlite3_result_error16(_0 : Ptr[sqlite3_context], _1 : Ptr[Byte], _2 : CInt): Unit = extern

  def sqlite3_result_error_code(_0 : Ptr[sqlite3_context], _1 : CInt): Unit = extern

  def sqlite3_result_error_nomem(_0 : Ptr[sqlite3_context]): Unit = extern

  def sqlite3_result_error_toobig(_0 : Ptr[sqlite3_context]): Unit = extern

  def sqlite3_result_int(_0 : Ptr[sqlite3_context], _1 : CInt): Unit = extern

  def sqlite3_result_int64(_0 : Ptr[sqlite3_context], _1 : sqlite3_int64): Unit = extern

  def sqlite3_result_null(_0 : Ptr[sqlite3_context]): Unit = extern

  def sqlite3_result_pointer(_0 : Ptr[sqlite3_context], _1 : Ptr[Byte], _2 : CString, _3 : CFuncPtr1[Ptr[Byte], Unit]): Unit = extern

  def sqlite3_result_subtype(_0 : Ptr[sqlite3_context], _1 : CUnsignedInt): Unit = extern

  def sqlite3_result_text(_0 : Ptr[sqlite3_context], _1 : CString, _2 : CInt, _3 : CFuncPtr1[Ptr[Byte], Unit]): Unit = extern

  def sqlite3_result_text16(_0 : Ptr[sqlite3_context], _1 : Ptr[Byte], _2 : CInt, _3 : CFuncPtr1[Ptr[Byte], Unit]): Unit = extern

  def sqlite3_result_text16be(_0 : Ptr[sqlite3_context], _1 : Ptr[Byte], _2 : CInt, _3 : CFuncPtr1[Ptr[Byte], Unit]): Unit = extern

  def sqlite3_result_text16le(_0 : Ptr[sqlite3_context], _1 : Ptr[Byte], _2 : CInt, _3 : CFuncPtr1[Ptr[Byte], Unit]): Unit = extern

  def sqlite3_result_text64(_0 : Ptr[sqlite3_context], _1 : CString, _2 : sqlite3_uint64, _3 : CFuncPtr1[Ptr[Byte], Unit], encoding : CUnsignedChar): Unit = extern

  def sqlite3_result_value(_0 : Ptr[sqlite3_context], _1 : Ptr[sqlite3_value]): Unit = extern

  def sqlite3_result_zeroblob(_0 : Ptr[sqlite3_context], n : CInt): Unit = extern

  def sqlite3_result_zeroblob64(_0 : Ptr[sqlite3_context], n : sqlite3_uint64): CInt = extern

  def sqlite3_rollback_hook(_0 : Ptr[sqlite3], _1 : CFuncPtr1[Ptr[Byte], Unit], _2 : Ptr[Byte]): Ptr[Byte] = extern

  def sqlite3_rtree_geometry_callback(db : Ptr[sqlite3], zGeom : CString, xGeom : CFuncPtr4[Ptr[sqlite3_rtree_geometry], CInt, Ptr[sqlite3_rtree_dbl], Ptr[CInt], CInt], pContext : Ptr[Byte]): CInt = extern

  def sqlite3_rtree_query_callback(db : Ptr[sqlite3], zQueryFunc : CString, xQueryFunc : CFuncPtr1[Ptr[sqlite3_rtree_query_info], CInt], pContext : Ptr[Byte], xDestructor : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_serialize(db : Ptr[sqlite3], zSchema : CString, piSize : Ptr[sqlite3_int64], mFlags : CUnsignedInt): Ptr[CUnsignedChar] = extern

  def sqlite3_set_authorizer(_0 : Ptr[sqlite3], xAuth : CFuncPtr6[Ptr[Byte], CInt, CString, CString, CString, CString, CInt], pUserData : Ptr[Byte]): CInt = extern

  def sqlite3_set_auxdata(_0 : Ptr[sqlite3_context], N : CInt, _2 : Ptr[Byte], _3 : CFuncPtr1[Ptr[Byte], Unit]): Unit = extern

  def sqlite3_set_clientdata(_0 : Ptr[sqlite3], _1 : CString, _2 : Ptr[Byte], _3 : CFuncPtr1[Ptr[Byte], Unit]): CInt = extern

  def sqlite3_set_last_insert_rowid(_0 : Ptr[sqlite3], _1 : sqlite3_int64): Unit = extern

  def sqlite3_setlk_timeout(_0 : Ptr[sqlite3], ms : CInt, flags : CInt): CInt = extern

  def sqlite3_shutdown(): CInt = extern

  def sqlite3_sleep(_0 : CInt): CInt = extern

  def sqlite3_snapshot_cmp(p1 : Ptr[sqlite3_snapshot], p2 : Ptr[sqlite3_snapshot]): CInt = extern

  def sqlite3_snapshot_free(_0 : Ptr[sqlite3_snapshot]): Unit = extern

  def sqlite3_snapshot_get(db : Ptr[sqlite3], zSchema : CString, ppSnapshot : Ptr[Ptr[sqlite3_snapshot]]): CInt = extern

  def sqlite3_snapshot_open(db : Ptr[sqlite3], zSchema : CString, pSnapshot : Ptr[sqlite3_snapshot]): CInt = extern

  def sqlite3_snapshot_recover(db : Ptr[sqlite3], zDb : CString): CInt = extern

  def sqlite3_snprintf(_0 : CInt, _1 : CString, _2 : CString, rest: Any*): CString = extern

  def sqlite3_soft_heap_limit(N : CInt): Unit = extern

  def sqlite3_soft_heap_limit64(N : sqlite3_int64): sqlite3_int64 = extern

  def sqlite3_sourceid(): CString = extern

  def sqlite3_sql(pStmt : Ptr[sqlite3_stmt]): CString = extern

  def sqlite3_status(op : CInt, pCurrent : Ptr[CInt], pHighwater : Ptr[CInt], resetFlag : CInt): CInt = extern

  def sqlite3_status64(op : CInt, pCurrent : Ptr[sqlite3_int64], pHighwater : Ptr[sqlite3_int64], resetFlag : CInt): CInt = extern

  def sqlite3_step(_0 : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_stmt_busy(_0 : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_stmt_explain(pStmt : Ptr[sqlite3_stmt], eMode : CInt): CInt = extern

  def sqlite3_stmt_isexplain(pStmt : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_stmt_readonly(pStmt : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_stmt_scanstatus(pStmt : Ptr[sqlite3_stmt], idx : CInt, iScanStatusOp : CInt, pOut : Ptr[Byte]): CInt = extern

  def sqlite3_stmt_scanstatus_reset(_0 : Ptr[sqlite3_stmt]): Unit = extern

  def sqlite3_stmt_scanstatus_v2(pStmt : Ptr[sqlite3_stmt], idx : CInt, iScanStatusOp : CInt, flags : CInt, pOut : Ptr[Byte]): CInt = extern

  def sqlite3_stmt_status(_0 : Ptr[sqlite3_stmt], op : CInt, resetFlg : CInt): CInt = extern

  def sqlite3_str_append(_0 : Ptr[sqlite3_str], zIn : CString, N : CInt): Unit = extern

  def sqlite3_str_appendall(_0 : Ptr[sqlite3_str], zIn : CString): Unit = extern

  def sqlite3_str_appendchar(_0 : Ptr[sqlite3_str], N : CInt, C : CChar): Unit = extern

  def sqlite3_str_appendf(_0 : Ptr[sqlite3_str], zFormat : CString, rest: Any*): Unit = extern

  def sqlite3_str_errcode(_0 : Ptr[sqlite3_str]): CInt = extern

  def sqlite3_str_finish(_0 : Ptr[sqlite3_str]): CString = extern

  def sqlite3_str_length(_0 : Ptr[sqlite3_str]): CInt = extern

  def sqlite3_str_new(_0 : Ptr[sqlite3]): Ptr[sqlite3_str] = extern

  def sqlite3_str_reset(_0 : Ptr[sqlite3_str]): Unit = extern

  def sqlite3_str_value(_0 : Ptr[sqlite3_str]): CString = extern

  def sqlite3_str_vappendf(_0 : Ptr[sqlite3_str], zFormat : CString, _2 : va_list): Unit = extern

  def sqlite3_strglob(zGlob : CString, zStr : CString): CInt = extern

  def sqlite3_stricmp(_0 : CString, _1 : CString): CInt = extern

  def sqlite3_strlike(zGlob : CString, zStr : CString, cEsc : CUnsignedInt): CInt = extern

  def sqlite3_strnicmp(_0 : CString, _1 : CString, _2 : CInt): CInt = extern

  def sqlite3_system_errno(_0 : Ptr[sqlite3]): CInt = extern

  def sqlite3_table_column_metadata(db : Ptr[sqlite3], zDbName : CString, zTableName : CString, zColumnName : CString, pzDataType : Ptr[CString], pzCollSeq : Ptr[CString], pNotNull : Ptr[CInt], pPrimaryKey : Ptr[CInt], pAutoinc : Ptr[CInt]): CInt = extern

  def sqlite3_test_control(op : CInt, rest: Any*): CInt = extern

  def sqlite3_thread_cleanup(): Unit = extern

  def sqlite3_threadsafe(): CInt = extern

  def sqlite3_total_changes(_0 : Ptr[sqlite3]): CInt = extern

  def sqlite3_total_changes64(_0 : Ptr[sqlite3]): sqlite3_int64 = extern

  def sqlite3_trace(_0 : Ptr[sqlite3], xTrace : CFuncPtr2[Ptr[Byte], CString, Unit], _2 : Ptr[Byte]): Ptr[Byte] = extern

  def sqlite3_trace_v2(_0 : Ptr[sqlite3], uMask : CUnsignedInt, xCallback : CFuncPtr4[CUnsignedInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt], pCtx : Ptr[Byte]): CInt = extern

  def sqlite3_transfer_bindings(_0 : Ptr[sqlite3_stmt], _1 : Ptr[sqlite3_stmt]): CInt = extern

  def sqlite3_txn_state(_0 : Ptr[sqlite3], zSchema : CString): CInt = extern

  def sqlite3_unlock_notify(pBlocked : Ptr[sqlite3], xNotify : CFuncPtr2[Ptr[Ptr[Byte]], CInt, Unit], pNotifyArg : Ptr[Byte]): CInt = extern

  def sqlite3_update_hook(_0 : Ptr[sqlite3], _1 : CFuncPtr5[Ptr[Byte], CInt, CString, CString, sqlite3_int64, Unit], _2 : Ptr[Byte]): Ptr[Byte] = extern

  def sqlite3_uri_boolean(z : sqlite3_filename, zParam : CString, bDefault : CInt): CInt = extern

  def sqlite3_uri_int64(_0 : sqlite3_filename, _1 : CString, _2 : sqlite3_int64): sqlite3_int64 = extern

  def sqlite3_uri_key(z : sqlite3_filename, N : CInt): CString = extern

  def sqlite3_uri_parameter(z : sqlite3_filename, zParam : CString): CString = extern

  def sqlite3_user_data(_0 : Ptr[sqlite3_context]): Ptr[Byte] = extern

  def sqlite3_value_blob(_0 : Ptr[sqlite3_value]): Ptr[Byte] = extern

  def sqlite3_value_bytes(_0 : Ptr[sqlite3_value]): CInt = extern

  def sqlite3_value_bytes16(_0 : Ptr[sqlite3_value]): CInt = extern

  def sqlite3_value_double(_0 : Ptr[sqlite3_value]): Double = extern

  def sqlite3_value_dup(_0 : Ptr[sqlite3_value]): Ptr[sqlite3_value] = extern

  def sqlite3_value_encoding(_0 : Ptr[sqlite3_value]): CInt = extern

  def sqlite3_value_free(_0 : Ptr[sqlite3_value]): Unit = extern

  def sqlite3_value_frombind(_0 : Ptr[sqlite3_value]): CInt = extern

  def sqlite3_value_int(_0 : Ptr[sqlite3_value]): CInt = extern

  def sqlite3_value_int64(_0 : Ptr[sqlite3_value]): sqlite3_int64 = extern

  def sqlite3_value_nochange(_0 : Ptr[sqlite3_value]): CInt = extern

  def sqlite3_value_numeric_type(_0 : Ptr[sqlite3_value]): CInt = extern

  def sqlite3_value_pointer(_0 : Ptr[sqlite3_value], _1 : CString): Ptr[Byte] = extern

  def sqlite3_value_subtype(_0 : Ptr[sqlite3_value]): CUnsignedInt = extern

  def sqlite3_value_text(_0 : Ptr[sqlite3_value]): Ptr[CUnsignedChar] = extern

  def sqlite3_value_text16(_0 : Ptr[sqlite3_value]): Ptr[Byte] = extern

  def sqlite3_value_text16be(_0 : Ptr[sqlite3_value]): Ptr[Byte] = extern

  def sqlite3_value_text16le(_0 : Ptr[sqlite3_value]): Ptr[Byte] = extern

  def sqlite3_value_type(_0 : Ptr[sqlite3_value]): CInt = extern

  def sqlite3_vfs_find(zVfsName : CString): Ptr[sqlite3_vfs] = extern

  def sqlite3_vfs_register(_0 : Ptr[sqlite3_vfs], makeDflt : CInt): CInt = extern

  def sqlite3_vfs_unregister(_0 : Ptr[sqlite3_vfs]): CInt = extern

  def sqlite3_vmprintf(_0 : CString, _1 : va_list): CString = extern

  def sqlite3_vsnprintf(_0 : CInt, _1 : CString, _2 : CString, _3 : va_list): CString = extern

  def sqlite3_vtab_collation(_0 : Ptr[sqlite3_index_info], _1 : CInt): CString = extern

  def sqlite3_vtab_config(_0 : Ptr[sqlite3], op : CInt, rest: Any*): CInt = extern

  def sqlite3_vtab_distinct(_0 : Ptr[sqlite3_index_info]): CInt = extern

  def sqlite3_vtab_in(_0 : Ptr[sqlite3_index_info], iCons : CInt, bHandle : CInt): CInt = extern

  def sqlite3_vtab_in_first(pVal : Ptr[sqlite3_value], ppOut : Ptr[Ptr[sqlite3_value]]): CInt = extern

  def sqlite3_vtab_in_next(pVal : Ptr[sqlite3_value], ppOut : Ptr[Ptr[sqlite3_value]]): CInt = extern

  def sqlite3_vtab_nochange(_0 : Ptr[sqlite3_context]): CInt = extern

  def sqlite3_vtab_on_conflict(_0 : Ptr[sqlite3]): CInt = extern

  def sqlite3_vtab_rhs_value(_0 : Ptr[sqlite3_index_info], _1 : CInt, ppVal : Ptr[Ptr[sqlite3_value]]): CInt = extern

  def sqlite3_wal_autocheckpoint(db : Ptr[sqlite3], N : CInt): CInt = extern

  def sqlite3_wal_checkpoint(db : Ptr[sqlite3], zDb : CString): CInt = extern

  def sqlite3_wal_checkpoint_v2(db : Ptr[sqlite3], zDb : CString, eMode : CInt, pnLog : Ptr[CInt], pnCkpt : Ptr[CInt]): CInt = extern

  def sqlite3_wal_hook(_0 : Ptr[sqlite3], _1 : CFuncPtr4[Ptr[Byte], Ptr[sqlite3], CString, CInt, CInt], _2 : Ptr[Byte]): Ptr[Byte] = extern

  def sqlite3_win32_set_directory(`type` : CUnsignedLongInt, zValue : Ptr[Byte]): CInt = extern

  def sqlite3_win32_set_directory16(`type` : CUnsignedLongInt, zValue : Ptr[Byte]): CInt = extern

  def sqlite3_win32_set_directory8(`type` : CUnsignedLongInt, zValue : CString): CInt = extern


object functions:
  import _root_.libsqlite.aliases.*
  import _root_.libsqlite.structs.*
  import extern_functions.*
  export extern_functions.*

object types:
    export _root_.libsqlite.structs.*
    export _root_.libsqlite.aliases.*

object all:
  export _root_.libsqlite.aliases.fts5_extension_function
  export _root_.libsqlite.aliases.sqlite3_callback
  export _root_.libsqlite.aliases.sqlite3_destructor_type
  export _root_.libsqlite.aliases.sqlite3_filename
  export _root_.libsqlite.aliases.sqlite3_int64
  export _root_.libsqlite.aliases.sqlite3_rtree_dbl
  export _root_.libsqlite.aliases.sqlite3_syscall_ptr
  export _root_.libsqlite.aliases.sqlite3_uint64
  export _root_.libsqlite.aliases.sqlite_int64
  export _root_.libsqlite.aliases.sqlite_uint64
  export _root_.libsqlite.aliases.va_list
  export _root_.libsqlite.structs.Fts5Context
  export _root_.libsqlite.structs.Fts5ExtensionApi
  export _root_.libsqlite.structs.Fts5PhraseIter
  export _root_.libsqlite.structs.Fts5Tokenizer
  export _root_.libsqlite.structs.fts5_api
  export _root_.libsqlite.structs.fts5_tokenizer
  export _root_.libsqlite.structs.fts5_tokenizer_v2
  export _root_.libsqlite.structs.sqlite3
  export _root_.libsqlite.structs.sqlite3_api_routines
  export _root_.libsqlite.structs.sqlite3_backup
  export _root_.libsqlite.structs.sqlite3_blob
  export _root_.libsqlite.structs.sqlite3_context
  export _root_.libsqlite.structs.sqlite3_file
  export _root_.libsqlite.structs.sqlite3_index_constraint
  export _root_.libsqlite.structs.sqlite3_index_constraint_usage
  export _root_.libsqlite.structs.sqlite3_index_info
  export _root_.libsqlite.structs.sqlite3_index_orderby
  export _root_.libsqlite.structs.sqlite3_io_methods
  export _root_.libsqlite.structs.sqlite3_mem_methods
  export _root_.libsqlite.structs.sqlite3_module
  export _root_.libsqlite.structs.sqlite3_mutex
  export _root_.libsqlite.structs.sqlite3_mutex_methods
  export _root_.libsqlite.structs.sqlite3_pcache
  export _root_.libsqlite.structs.sqlite3_pcache_methods
  export _root_.libsqlite.structs.sqlite3_pcache_methods2
  export _root_.libsqlite.structs.sqlite3_pcache_page
  export _root_.libsqlite.structs.sqlite3_rtree_geometry
  export _root_.libsqlite.structs.sqlite3_rtree_query_info
  export _root_.libsqlite.structs.sqlite3_snapshot
  export _root_.libsqlite.structs.sqlite3_stmt
  export _root_.libsqlite.structs.sqlite3_str
  export _root_.libsqlite.structs.sqlite3_value
  export _root_.libsqlite.structs.sqlite3_vfs
  export _root_.libsqlite.structs.sqlite3_vtab
  export _root_.libsqlite.structs.sqlite3_vtab_cursor
  export _root_.libsqlite.functions.sqlite3_aggregate_context
  export _root_.libsqlite.functions.sqlite3_aggregate_count
  export _root_.libsqlite.functions.sqlite3_auto_extension
  export _root_.libsqlite.functions.sqlite3_autovacuum_pages
  export _root_.libsqlite.functions.sqlite3_backup_finish
  export _root_.libsqlite.functions.sqlite3_backup_init
  export _root_.libsqlite.functions.sqlite3_backup_pagecount
  export _root_.libsqlite.functions.sqlite3_backup_remaining
  export _root_.libsqlite.functions.sqlite3_backup_step
  export _root_.libsqlite.functions.sqlite3_bind_blob
  export _root_.libsqlite.functions.sqlite3_bind_blob64
  export _root_.libsqlite.functions.sqlite3_bind_double
  export _root_.libsqlite.functions.sqlite3_bind_int
  export _root_.libsqlite.functions.sqlite3_bind_int64
  export _root_.libsqlite.functions.sqlite3_bind_null
  export _root_.libsqlite.functions.sqlite3_bind_parameter_count
  export _root_.libsqlite.functions.sqlite3_bind_parameter_index
  export _root_.libsqlite.functions.sqlite3_bind_parameter_name
  export _root_.libsqlite.functions.sqlite3_bind_pointer
  export _root_.libsqlite.functions.sqlite3_bind_text
  export _root_.libsqlite.functions.sqlite3_bind_text16
  export _root_.libsqlite.functions.sqlite3_bind_text64
  export _root_.libsqlite.functions.sqlite3_bind_value
  export _root_.libsqlite.functions.sqlite3_bind_zeroblob
  export _root_.libsqlite.functions.sqlite3_bind_zeroblob64
  export _root_.libsqlite.functions.sqlite3_blob_bytes
  export _root_.libsqlite.functions.sqlite3_blob_close
  export _root_.libsqlite.functions.sqlite3_blob_open
  export _root_.libsqlite.functions.sqlite3_blob_read
  export _root_.libsqlite.functions.sqlite3_blob_reopen
  export _root_.libsqlite.functions.sqlite3_blob_write
  export _root_.libsqlite.functions.sqlite3_busy_handler
  export _root_.libsqlite.functions.sqlite3_busy_timeout
  export _root_.libsqlite.functions.sqlite3_cancel_auto_extension
  export _root_.libsqlite.functions.sqlite3_changes
  export _root_.libsqlite.functions.sqlite3_changes64
  export _root_.libsqlite.functions.sqlite3_clear_bindings
  export _root_.libsqlite.functions.sqlite3_close
  export _root_.libsqlite.functions.sqlite3_close_v2
  export _root_.libsqlite.functions.sqlite3_collation_needed
  export _root_.libsqlite.functions.sqlite3_collation_needed16
  export _root_.libsqlite.functions.sqlite3_column_blob
  export _root_.libsqlite.functions.sqlite3_column_bytes
  export _root_.libsqlite.functions.sqlite3_column_bytes16
  export _root_.libsqlite.functions.sqlite3_column_count
  export _root_.libsqlite.functions.sqlite3_column_database_name
  export _root_.libsqlite.functions.sqlite3_column_database_name16
  export _root_.libsqlite.functions.sqlite3_column_decltype
  export _root_.libsqlite.functions.sqlite3_column_decltype16
  export _root_.libsqlite.functions.sqlite3_column_double
  export _root_.libsqlite.functions.sqlite3_column_int
  export _root_.libsqlite.functions.sqlite3_column_int64
  export _root_.libsqlite.functions.sqlite3_column_name
  export _root_.libsqlite.functions.sqlite3_column_name16
  export _root_.libsqlite.functions.sqlite3_column_origin_name
  export _root_.libsqlite.functions.sqlite3_column_origin_name16
  export _root_.libsqlite.functions.sqlite3_column_table_name
  export _root_.libsqlite.functions.sqlite3_column_table_name16
  export _root_.libsqlite.functions.sqlite3_column_text
  export _root_.libsqlite.functions.sqlite3_column_text16
  export _root_.libsqlite.functions.sqlite3_column_type
  export _root_.libsqlite.functions.sqlite3_column_value
  export _root_.libsqlite.functions.sqlite3_commit_hook
  export _root_.libsqlite.functions.sqlite3_compileoption_get
  export _root_.libsqlite.functions.sqlite3_compileoption_used
  export _root_.libsqlite.functions.sqlite3_complete
  export _root_.libsqlite.functions.sqlite3_complete16
  export _root_.libsqlite.functions.sqlite3_config
  export _root_.libsqlite.functions.sqlite3_context_db_handle
  export _root_.libsqlite.functions.sqlite3_create_collation
  export _root_.libsqlite.functions.sqlite3_create_collation16
  export _root_.libsqlite.functions.sqlite3_create_collation_v2
  export _root_.libsqlite.functions.sqlite3_create_filename
  export _root_.libsqlite.functions.sqlite3_create_function
  export _root_.libsqlite.functions.sqlite3_create_function16
  export _root_.libsqlite.functions.sqlite3_create_function_v2
  export _root_.libsqlite.functions.sqlite3_create_module
  export _root_.libsqlite.functions.sqlite3_create_module_v2
  export _root_.libsqlite.functions.sqlite3_create_window_function
  export _root_.libsqlite.functions.sqlite3_data_count
  export _root_.libsqlite.functions.sqlite3_database_file_object
  export _root_.libsqlite.functions.sqlite3_db_cacheflush
  export _root_.libsqlite.functions.sqlite3_db_config
  export _root_.libsqlite.functions.sqlite3_db_filename
  export _root_.libsqlite.functions.sqlite3_db_handle
  export _root_.libsqlite.functions.sqlite3_db_mutex
  export _root_.libsqlite.functions.sqlite3_db_name
  export _root_.libsqlite.functions.sqlite3_db_readonly
  export _root_.libsqlite.functions.sqlite3_db_release_memory
  export _root_.libsqlite.functions.sqlite3_db_status
  export _root_.libsqlite.functions.sqlite3_declare_vtab
  export _root_.libsqlite.functions.sqlite3_deserialize
  export _root_.libsqlite.functions.sqlite3_drop_modules
  export _root_.libsqlite.functions.sqlite3_enable_load_extension
  export _root_.libsqlite.functions.sqlite3_enable_shared_cache
  export _root_.libsqlite.functions.sqlite3_errcode
  export _root_.libsqlite.functions.sqlite3_errmsg
  export _root_.libsqlite.functions.sqlite3_errmsg16
  export _root_.libsqlite.functions.sqlite3_error_offset
  export _root_.libsqlite.functions.sqlite3_errstr
  export _root_.libsqlite.functions.sqlite3_exec
  export _root_.libsqlite.functions.sqlite3_expanded_sql
  export _root_.libsqlite.functions.sqlite3_expired
  export _root_.libsqlite.functions.sqlite3_extended_errcode
  export _root_.libsqlite.functions.sqlite3_extended_result_codes
  export _root_.libsqlite.functions.sqlite3_file_control
  export _root_.libsqlite.functions.sqlite3_filename_database
  export _root_.libsqlite.functions.sqlite3_filename_journal
  export _root_.libsqlite.functions.sqlite3_filename_wal
  export _root_.libsqlite.functions.sqlite3_finalize
  export _root_.libsqlite.functions.sqlite3_free
  export _root_.libsqlite.functions.sqlite3_free_filename
  export _root_.libsqlite.functions.sqlite3_free_table
  export _root_.libsqlite.functions.sqlite3_get_autocommit
  export _root_.libsqlite.functions.sqlite3_get_auxdata
  export _root_.libsqlite.functions.sqlite3_get_clientdata
  export _root_.libsqlite.functions.sqlite3_get_table
  export _root_.libsqlite.functions.sqlite3_global_recover
  export _root_.libsqlite.functions.sqlite3_hard_heap_limit64
  export _root_.libsqlite.functions.sqlite3_initialize
  export _root_.libsqlite.functions.sqlite3_interrupt
  export _root_.libsqlite.functions.sqlite3_is_interrupted
  export _root_.libsqlite.functions.sqlite3_keyword_check
  export _root_.libsqlite.functions.sqlite3_keyword_count
  export _root_.libsqlite.functions.sqlite3_keyword_name
  export _root_.libsqlite.functions.sqlite3_last_insert_rowid
  export _root_.libsqlite.functions.sqlite3_libversion
  export _root_.libsqlite.functions.sqlite3_libversion_number
  export _root_.libsqlite.functions.sqlite3_limit
  export _root_.libsqlite.functions.sqlite3_load_extension
  export _root_.libsqlite.functions.sqlite3_log
  export _root_.libsqlite.functions.sqlite3_malloc
  export _root_.libsqlite.functions.sqlite3_malloc64
  export _root_.libsqlite.functions.sqlite3_memory_alarm
  export _root_.libsqlite.functions.sqlite3_memory_highwater
  export _root_.libsqlite.functions.sqlite3_memory_used
  export _root_.libsqlite.functions.sqlite3_mprintf
  export _root_.libsqlite.functions.sqlite3_msize
  export _root_.libsqlite.functions.sqlite3_mutex_alloc
  export _root_.libsqlite.functions.sqlite3_mutex_enter
  export _root_.libsqlite.functions.sqlite3_mutex_free
  export _root_.libsqlite.functions.sqlite3_mutex_held
  export _root_.libsqlite.functions.sqlite3_mutex_leave
  export _root_.libsqlite.functions.sqlite3_mutex_notheld
  export _root_.libsqlite.functions.sqlite3_mutex_try
  export _root_.libsqlite.functions.sqlite3_next_stmt
  export _root_.libsqlite.functions.sqlite3_open
  export _root_.libsqlite.functions.sqlite3_open16
  export _root_.libsqlite.functions.sqlite3_open_v2
  export _root_.libsqlite.functions.sqlite3_os_end
  export _root_.libsqlite.functions.sqlite3_os_init
  export _root_.libsqlite.functions.sqlite3_overload_function
  export _root_.libsqlite.functions.sqlite3_prepare
  export _root_.libsqlite.functions.sqlite3_prepare16
  export _root_.libsqlite.functions.sqlite3_prepare16_v2
  export _root_.libsqlite.functions.sqlite3_prepare16_v3
  export _root_.libsqlite.functions.sqlite3_prepare_v2
  export _root_.libsqlite.functions.sqlite3_prepare_v3
  export _root_.libsqlite.functions.sqlite3_profile
  export _root_.libsqlite.functions.sqlite3_progress_handler
  export _root_.libsqlite.functions.sqlite3_randomness
  export _root_.libsqlite.functions.sqlite3_realloc
  export _root_.libsqlite.functions.sqlite3_realloc64
  export _root_.libsqlite.functions.sqlite3_release_memory
  export _root_.libsqlite.functions.sqlite3_reset
  export _root_.libsqlite.functions.sqlite3_reset_auto_extension
  export _root_.libsqlite.functions.sqlite3_result_blob
  export _root_.libsqlite.functions.sqlite3_result_blob64
  export _root_.libsqlite.functions.sqlite3_result_double
  export _root_.libsqlite.functions.sqlite3_result_error
  export _root_.libsqlite.functions.sqlite3_result_error16
  export _root_.libsqlite.functions.sqlite3_result_error_code
  export _root_.libsqlite.functions.sqlite3_result_error_nomem
  export _root_.libsqlite.functions.sqlite3_result_error_toobig
  export _root_.libsqlite.functions.sqlite3_result_int
  export _root_.libsqlite.functions.sqlite3_result_int64
  export _root_.libsqlite.functions.sqlite3_result_null
  export _root_.libsqlite.functions.sqlite3_result_pointer
  export _root_.libsqlite.functions.sqlite3_result_subtype
  export _root_.libsqlite.functions.sqlite3_result_text
  export _root_.libsqlite.functions.sqlite3_result_text16
  export _root_.libsqlite.functions.sqlite3_result_text16be
  export _root_.libsqlite.functions.sqlite3_result_text16le
  export _root_.libsqlite.functions.sqlite3_result_text64
  export _root_.libsqlite.functions.sqlite3_result_value
  export _root_.libsqlite.functions.sqlite3_result_zeroblob
  export _root_.libsqlite.functions.sqlite3_result_zeroblob64
  export _root_.libsqlite.functions.sqlite3_rollback_hook
  export _root_.libsqlite.functions.sqlite3_rtree_geometry_callback
  export _root_.libsqlite.functions.sqlite3_rtree_query_callback
  export _root_.libsqlite.functions.sqlite3_serialize
  export _root_.libsqlite.functions.sqlite3_set_authorizer
  export _root_.libsqlite.functions.sqlite3_set_auxdata
  export _root_.libsqlite.functions.sqlite3_set_clientdata
  export _root_.libsqlite.functions.sqlite3_set_last_insert_rowid
  export _root_.libsqlite.functions.sqlite3_setlk_timeout
  export _root_.libsqlite.functions.sqlite3_shutdown
  export _root_.libsqlite.functions.sqlite3_sleep
  export _root_.libsqlite.functions.sqlite3_snapshot_cmp
  export _root_.libsqlite.functions.sqlite3_snapshot_free
  export _root_.libsqlite.functions.sqlite3_snapshot_get
  export _root_.libsqlite.functions.sqlite3_snapshot_open
  export _root_.libsqlite.functions.sqlite3_snapshot_recover
  export _root_.libsqlite.functions.sqlite3_snprintf
  export _root_.libsqlite.functions.sqlite3_soft_heap_limit
  export _root_.libsqlite.functions.sqlite3_soft_heap_limit64
  export _root_.libsqlite.functions.sqlite3_sourceid
  export _root_.libsqlite.functions.sqlite3_sql
  export _root_.libsqlite.functions.sqlite3_status
  export _root_.libsqlite.functions.sqlite3_status64
  export _root_.libsqlite.functions.sqlite3_step
  export _root_.libsqlite.functions.sqlite3_stmt_busy
  export _root_.libsqlite.functions.sqlite3_stmt_explain
  export _root_.libsqlite.functions.sqlite3_stmt_isexplain
  export _root_.libsqlite.functions.sqlite3_stmt_readonly
  export _root_.libsqlite.functions.sqlite3_stmt_scanstatus
  export _root_.libsqlite.functions.sqlite3_stmt_scanstatus_reset
  export _root_.libsqlite.functions.sqlite3_stmt_scanstatus_v2
  export _root_.libsqlite.functions.sqlite3_stmt_status
  export _root_.libsqlite.functions.sqlite3_str_append
  export _root_.libsqlite.functions.sqlite3_str_appendall
  export _root_.libsqlite.functions.sqlite3_str_appendchar
  export _root_.libsqlite.functions.sqlite3_str_appendf
  export _root_.libsqlite.functions.sqlite3_str_errcode
  export _root_.libsqlite.functions.sqlite3_str_finish
  export _root_.libsqlite.functions.sqlite3_str_length
  export _root_.libsqlite.functions.sqlite3_str_new
  export _root_.libsqlite.functions.sqlite3_str_reset
  export _root_.libsqlite.functions.sqlite3_str_value
  export _root_.libsqlite.functions.sqlite3_str_vappendf
  export _root_.libsqlite.functions.sqlite3_strglob
  export _root_.libsqlite.functions.sqlite3_stricmp
  export _root_.libsqlite.functions.sqlite3_strlike
  export _root_.libsqlite.functions.sqlite3_strnicmp
  export _root_.libsqlite.functions.sqlite3_system_errno
  export _root_.libsqlite.functions.sqlite3_table_column_metadata
  export _root_.libsqlite.functions.sqlite3_test_control
  export _root_.libsqlite.functions.sqlite3_thread_cleanup
  export _root_.libsqlite.functions.sqlite3_threadsafe
  export _root_.libsqlite.functions.sqlite3_total_changes
  export _root_.libsqlite.functions.sqlite3_total_changes64
  export _root_.libsqlite.functions.sqlite3_trace
  export _root_.libsqlite.functions.sqlite3_trace_v2
  export _root_.libsqlite.functions.sqlite3_transfer_bindings
  export _root_.libsqlite.functions.sqlite3_txn_state
  export _root_.libsqlite.functions.sqlite3_unlock_notify
  export _root_.libsqlite.functions.sqlite3_update_hook
  export _root_.libsqlite.functions.sqlite3_uri_boolean
  export _root_.libsqlite.functions.sqlite3_uri_int64
  export _root_.libsqlite.functions.sqlite3_uri_key
  export _root_.libsqlite.functions.sqlite3_uri_parameter
  export _root_.libsqlite.functions.sqlite3_user_data
  export _root_.libsqlite.functions.sqlite3_value_blob
  export _root_.libsqlite.functions.sqlite3_value_bytes
  export _root_.libsqlite.functions.sqlite3_value_bytes16
  export _root_.libsqlite.functions.sqlite3_value_double
  export _root_.libsqlite.functions.sqlite3_value_dup
  export _root_.libsqlite.functions.sqlite3_value_encoding
  export _root_.libsqlite.functions.sqlite3_value_free
  export _root_.libsqlite.functions.sqlite3_value_frombind
  export _root_.libsqlite.functions.sqlite3_value_int
  export _root_.libsqlite.functions.sqlite3_value_int64
  export _root_.libsqlite.functions.sqlite3_value_nochange
  export _root_.libsqlite.functions.sqlite3_value_numeric_type
  export _root_.libsqlite.functions.sqlite3_value_pointer
  export _root_.libsqlite.functions.sqlite3_value_subtype
  export _root_.libsqlite.functions.sqlite3_value_text
  export _root_.libsqlite.functions.sqlite3_value_text16
  export _root_.libsqlite.functions.sqlite3_value_text16be
  export _root_.libsqlite.functions.sqlite3_value_text16le
  export _root_.libsqlite.functions.sqlite3_value_type
  export _root_.libsqlite.functions.sqlite3_vfs_find
  export _root_.libsqlite.functions.sqlite3_vfs_register
  export _root_.libsqlite.functions.sqlite3_vfs_unregister
  export _root_.libsqlite.functions.sqlite3_vmprintf
  export _root_.libsqlite.functions.sqlite3_vsnprintf
  export _root_.libsqlite.functions.sqlite3_vtab_collation
  export _root_.libsqlite.functions.sqlite3_vtab_config
  export _root_.libsqlite.functions.sqlite3_vtab_distinct
  export _root_.libsqlite.functions.sqlite3_vtab_in
  export _root_.libsqlite.functions.sqlite3_vtab_in_first
  export _root_.libsqlite.functions.sqlite3_vtab_in_next
  export _root_.libsqlite.functions.sqlite3_vtab_nochange
  export _root_.libsqlite.functions.sqlite3_vtab_on_conflict
  export _root_.libsqlite.functions.sqlite3_vtab_rhs_value
  export _root_.libsqlite.functions.sqlite3_wal_autocheckpoint
  export _root_.libsqlite.functions.sqlite3_wal_checkpoint
  export _root_.libsqlite.functions.sqlite3_wal_checkpoint_v2
  export _root_.libsqlite.functions.sqlite3_wal_hook
  export _root_.libsqlite.functions.sqlite3_win32_set_directory
  export _root_.libsqlite.functions.sqlite3_win32_set_directory16
  export _root_.libsqlite.functions.sqlite3_win32_set_directory8