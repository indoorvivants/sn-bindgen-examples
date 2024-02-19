package lua

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object aliases:
  import _root_.lua.aliases.*
  import _root_.lua.structs.*
  type FILE = libc.stdio.FILE
  object FILE:
    val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
    inline def apply(inline o: libc.stdio.FILE): FILE = o
    extension (v: FILE) inline def value: libc.stdio.FILE = v

  /** */
  opaque type __darwin_intptr_t = CLongInt
  object __darwin_intptr_t:
    given _tag: Tag[__darwin_intptr_t] = Tag.Long
    inline def apply(inline o: CLongInt): __darwin_intptr_t = o
    extension (v: __darwin_intptr_t) inline def value: CLongInt = v

  /** */
  type intptr_t = __darwin_intptr_t
  object intptr_t:
    given _tag: Tag[intptr_t] = __darwin_intptr_t._tag
    inline def apply(inline o: __darwin_intptr_t): intptr_t = o
    extension (v: intptr_t) inline def value: __darwin_intptr_t = v

  /** */
  opaque type lua_Alloc =
    CFuncPtr4[Ptr[Byte], Ptr[Byte], size_t, size_t, Ptr[Byte]]
  object lua_Alloc:
    given _tag: Tag[lua_Alloc] =
      Tag.materializeCFuncPtr4[Ptr[Byte], Ptr[Byte], size_t, size_t, Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte]): lua_Alloc = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], Ptr[Byte], size_t, size_t, Ptr[Byte]]
    ): lua_Alloc = o
    extension (v: lua_Alloc)
      inline def value
          : CFuncPtr4[Ptr[Byte], Ptr[Byte], size_t, size_t, Ptr[Byte]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end lua_Alloc

  /** */
  opaque type lua_CFunction = CFuncPtr1[Ptr[lua_State], CInt]
  object lua_CFunction:
    given _tag: Tag[lua_CFunction] =
      Tag.materializeCFuncPtr1[Ptr[lua_State], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): lua_CFunction = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[lua_State], CInt]): lua_CFunction =
      o
    extension (v: lua_CFunction)
      inline def value: CFuncPtr1[Ptr[lua_State], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /** */
  opaque type lua_Hook = CFuncPtr2[Ptr[lua_State], Ptr[lua_Debug], Unit]
  object lua_Hook:
    given _tag: Tag[lua_Hook] =
      Tag.materializeCFuncPtr2[Ptr[lua_State], Ptr[lua_Debug], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): lua_Hook = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[lua_State], Ptr[lua_Debug], Unit]
    ): lua_Hook = o
    extension (v: lua_Hook)
      inline def value: CFuncPtr2[Ptr[lua_State], Ptr[lua_Debug], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end lua_Hook

  /** */
  opaque type lua_Integer = CLongLong
  object lua_Integer:
    given _tag: Tag[lua_Integer] = Tag.Long
    inline def apply(inline o: CLongLong): lua_Integer = o
    extension (v: lua_Integer) inline def value: CLongLong = v

  /** */
  type lua_KContext = intptr_t
  object lua_KContext:
    given _tag: Tag[lua_KContext] = intptr_t._tag
    inline def apply(inline o: intptr_t): lua_KContext = o
    extension (v: lua_KContext) inline def value: intptr_t = v

  /** */
  opaque type lua_KFunction =
    CFuncPtr3[Ptr[lua_State], CInt, lua_KContext, CInt]
  object lua_KFunction:
    given _tag: Tag[lua_KFunction] =
      Tag.materializeCFuncPtr3[Ptr[lua_State], CInt, lua_KContext, CInt]
    inline def fromPtr(ptr: Ptr[Byte]): lua_KFunction = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[lua_State], CInt, lua_KContext, CInt]
    ): lua_KFunction = o
    extension (v: lua_KFunction)
      inline def value: CFuncPtr3[Ptr[lua_State], CInt, lua_KContext, CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end lua_KFunction

  /** */
  opaque type lua_Number = Double
  object lua_Number:
    given _tag: Tag[lua_Number] = Tag.Double
    inline def apply(inline o: Double): lua_Number = o
    extension (v: lua_Number) inline def value: Double = v

  /** */
  opaque type lua_Reader =
    CFuncPtr3[Ptr[lua_State], Ptr[Byte], Ptr[size_t], CString]
  object lua_Reader:
    given _tag: Tag[lua_Reader] =
      Tag.materializeCFuncPtr3[Ptr[lua_State], Ptr[Byte], Ptr[size_t], CString]
    inline def fromPtr(ptr: Ptr[Byte]): lua_Reader = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[lua_State], Ptr[Byte], Ptr[size_t], CString]
    ): lua_Reader = o
    extension (v: lua_Reader)
      inline def value
          : CFuncPtr3[Ptr[lua_State], Ptr[Byte], Ptr[size_t], CString] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end lua_Reader

  /** */
  opaque type lua_Unsigned = CUnsignedLongLong
  object lua_Unsigned:
    given _tag: Tag[lua_Unsigned] = Tag.ULong
    inline def apply(inline o: CUnsignedLongLong): lua_Unsigned = o
    extension (v: lua_Unsigned) inline def value: CUnsignedLongLong = v

  /** */
  opaque type lua_WarnFunction = CFuncPtr3[Ptr[Byte], CString, CInt, Unit]
  object lua_WarnFunction:
    given _tag: Tag[lua_WarnFunction] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CString, CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): lua_WarnFunction = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CString, CInt, Unit]
    ): lua_WarnFunction = o
    extension (v: lua_WarnFunction)
      inline def value: CFuncPtr3[Ptr[Byte], CString, CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end lua_WarnFunction

  /** */
  opaque type lua_Writer =
    CFuncPtr4[Ptr[lua_State], Ptr[Byte], size_t, Ptr[Byte], CInt]
  object lua_Writer:
    given _tag: Tag[lua_Writer] = Tag
      .materializeCFuncPtr4[Ptr[lua_State], Ptr[Byte], size_t, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): lua_Writer = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[Ptr[lua_State], Ptr[Byte], size_t, Ptr[Byte], CInt]
    ): lua_Writer = o
    extension (v: lua_Writer)
      inline def value
          : CFuncPtr4[Ptr[lua_State], Ptr[Byte], size_t, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end lua_Writer

  type size_t = libc.stddef.size_t
  object size_t:
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t) inline def value: libc.stddef.size_t = v

  type va_list = unsafe.CVarArgList
  object va_list:
    val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
    inline def apply(inline o: unsafe.CVarArgList): va_list = o
    extension (v: va_list) inline def value: unsafe.CVarArgList = v
end aliases

object structs:
  import _root_.lua.aliases.*
  import _root_.lua.structs.*

  /** */
  opaque type CallInfo = CStruct0
  object CallInfo:
    given _tag: Tag[CallInfo] = Tag.materializeCStruct0Tag

  /** */
  opaque type luaL_Buffer =
    CStruct5[CString, size_t, size_t, Ptr[lua_State], luaL_Buffer.Union0]
  object luaL_Buffer:
    /** */
    opaque type Union0 =
      CArray[Byte, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]]
    object Union0:
      given _tag: Tag[Union0] =
        Tag.CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]](
          Tag.Byte,
          Tag.Digit4[Nat._1, Nat._0, Nat._2, Nat._4](
            Tag.Nat1,
            Tag.Nat0,
            Tag.Nat2,
            Tag.Nat4
          )
        )
      def apply()(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_n")
      def apply(n: lua_Number)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[lua_Number]].update(0, n)
        ___ptr
      @scala.annotation.targetName("apply_u")
      def apply(u: Double)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Double]].update(0, u)
        ___ptr
      @scala.annotation.targetName("apply_s")
      def apply(s: Ptr[Byte])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[Byte]]].update(0, s)
        ___ptr
      @scala.annotation.targetName("apply_i")
      def apply(i: lua_Integer)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[lua_Integer]].update(0, i)
        ___ptr
      @scala.annotation.targetName("apply_l")
      def apply(l: CLongInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CLongInt]].update(0, l)
        ___ptr
      @scala.annotation.targetName("apply_b")
      def apply(b: CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]])(
          using Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[
            CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]]
          ]]
          .update(0, b)
        ___ptr
      end apply
      extension (struct: Union0)
        def n: lua_Number = !struct.at(0).asInstanceOf[Ptr[lua_Number]]
        def n_=(value: lua_Number): Unit =
          !struct.at(0).asInstanceOf[Ptr[lua_Number]] = value
        def u: Double = !struct.at(0).asInstanceOf[Ptr[Double]]
        def u_=(value: Double): Unit = !struct.at(0).asInstanceOf[Ptr[Double]] =
          value
        def s: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
        def s_=(value: Ptr[Byte]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
        def i: lua_Integer = !struct.at(0).asInstanceOf[Ptr[lua_Integer]]
        def i_=(value: lua_Integer): Unit =
          !struct.at(0).asInstanceOf[Ptr[lua_Integer]] = value
        def l: CLongInt = !struct.at(0).asInstanceOf[Ptr[CLongInt]]
        def l_=(value: CLongInt): Unit =
          !struct.at(0).asInstanceOf[Ptr[CLongInt]] = value
        def b: CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]] =
          !struct
            .at(0)
            .asInstanceOf[Ptr[
              CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]]
            ]]
        def b_=(
            value: CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]]
        ): Unit = !struct
          .at(0)
          .asInstanceOf[Ptr[
            CArray[CChar, Nat.Digit4[Nat._1, Nat._0, Nat._2, Nat._4]]
          ]] = value
      end extension
    end Union0
    given _tag: Tag[luaL_Buffer] =
      Tag.materializeCStruct5Tag[CString, size_t, size_t, Ptr[
        lua_State
      ], luaL_Buffer.Union0]
    def apply()(using Zone): Ptr[luaL_Buffer] =
      scala.scalanative.unsafe.alloc[luaL_Buffer](1)
    def apply(
        b: CString,
        size: size_t,
        n: size_t,
        L: Ptr[lua_State],
        init: luaL_Buffer.Union0
    )(using Zone): Ptr[luaL_Buffer] =
      val ____ptr = apply()
      (!____ptr).b = b
      (!____ptr).size = size
      (!____ptr).n = n
      (!____ptr).L = L
      (!____ptr).init = init
      ____ptr
    end apply
    extension (struct: luaL_Buffer)
      def b: CString = struct._1
      def b_=(value: CString): Unit = !struct.at1 = value
      def size: size_t = struct._2
      def size_=(value: size_t): Unit = !struct.at2 = value
      def n: size_t = struct._3
      def n_=(value: size_t): Unit = !struct.at3 = value
      def L: Ptr[lua_State] = struct._4
      def L_=(value: Ptr[lua_State]): Unit = !struct.at4 = value
      def init: luaL_Buffer.Union0 = struct._5
      def init_=(value: luaL_Buffer.Union0): Unit = !struct.at5 = value
    end extension
  end luaL_Buffer

  /** */
  opaque type luaL_Reg = CStruct2[CString, lua_CFunction]
  object luaL_Reg:
    given _tag: Tag[luaL_Reg] =
      Tag.materializeCStruct2Tag[CString, lua_CFunction]
    def apply()(using Zone): Ptr[luaL_Reg] =
      scala.scalanative.unsafe.alloc[luaL_Reg](1)
    def apply(name: CString, func: lua_CFunction)(using Zone): Ptr[luaL_Reg] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).func = func
      ____ptr
    extension (struct: luaL_Reg)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def func: lua_CFunction = struct._2
      def func_=(value: lua_CFunction): Unit = !struct.at2 = value
  end luaL_Reg

  /** */
  opaque type luaL_Stream = CStruct2[Ptr[FILE], lua_CFunction]
  object luaL_Stream:
    given _tag: Tag[luaL_Stream] =
      Tag.materializeCStruct2Tag[Ptr[FILE], lua_CFunction]
    def apply()(using Zone): Ptr[luaL_Stream] =
      scala.scalanative.unsafe.alloc[luaL_Stream](1)
    def apply(f: Ptr[FILE], closef: lua_CFunction)(using
        Zone
    ): Ptr[luaL_Stream] =
      val ____ptr = apply()
      (!____ptr).f = f
      (!____ptr).closef = closef
      ____ptr
    extension (struct: luaL_Stream)
      def f: Ptr[FILE] = struct._1
      def f_=(value: Ptr[FILE]): Unit = !struct.at1 = value
      def closef: lua_CFunction = struct._2
      def closef_=(value: lua_CFunction): Unit = !struct.at2 = value
  end luaL_Stream

  /** */
  opaque type lua_Debug = CStruct17[
    CInt,
    CString,
    CString,
    CString,
    CString,
    size_t,
    CInt,
    CInt,
    CInt,
    CUnsignedChar,
    CUnsignedChar,
    CChar,
    CChar,
    CUnsignedShort,
    CUnsignedShort,
    CArray[CChar, Nat.Digit2[Nat._6, Nat._0]],
    Ptr[CallInfo]
  ]
  object lua_Debug:
    /** */
    opaque type Struct0 = CStruct0
    object Struct0:
      given _tag: Tag[Struct0] = Tag.materializeCStruct0Tag
    given _tag: Tag[lua_Debug] = Tag.materializeCStruct17Tag[
      CInt,
      CString,
      CString,
      CString,
      CString,
      size_t,
      CInt,
      CInt,
      CInt,
      CUnsignedChar,
      CUnsignedChar,
      CChar,
      CChar,
      CUnsignedShort,
      CUnsignedShort,
      CArray[CChar, Nat.Digit2[Nat._6, Nat._0]],
      Ptr[CallInfo]
    ]
    def apply()(using Zone): Ptr[lua_Debug] =
      scala.scalanative.unsafe.alloc[lua_Debug](1)
    def apply(
        event: CInt,
        name: CString,
        namewhat: CString,
        what: CString,
        source: CString,
        srclen: size_t,
        currentline: CInt,
        linedefined: CInt,
        lastlinedefined: CInt,
        nups: CUnsignedChar,
        nparams: CUnsignedChar,
        isvararg: CChar,
        istailcall: CChar,
        ftransfer: CUnsignedShort,
        ntransfer: CUnsignedShort,
        short_src: CArray[CChar, Nat.Digit2[Nat._6, Nat._0]],
        i_ci: Ptr[CallInfo]
    )(using Zone): Ptr[lua_Debug] =
      val ____ptr = apply()
      (!____ptr).event = event
      (!____ptr).name = name
      (!____ptr).namewhat = namewhat
      (!____ptr).what = what
      (!____ptr).source = source
      (!____ptr).srclen = srclen
      (!____ptr).currentline = currentline
      (!____ptr).linedefined = linedefined
      (!____ptr).lastlinedefined = lastlinedefined
      (!____ptr).nups = nups
      (!____ptr).nparams = nparams
      (!____ptr).isvararg = isvararg
      (!____ptr).istailcall = istailcall
      (!____ptr).ftransfer = ftransfer
      (!____ptr).ntransfer = ntransfer
      (!____ptr).short_src = short_src
      (!____ptr).i_ci = i_ci
      ____ptr
    end apply
    extension (struct: lua_Debug)
      def event: CInt = struct._1
      def event_=(value: CInt): Unit = !struct.at1 = value
      def name: CString = struct._2
      def name_=(value: CString): Unit = !struct.at2 = value
      def namewhat: CString = struct._3
      def namewhat_=(value: CString): Unit = !struct.at3 = value
      def what: CString = struct._4
      def what_=(value: CString): Unit = !struct.at4 = value
      def source: CString = struct._5
      def source_=(value: CString): Unit = !struct.at5 = value
      def srclen: size_t = struct._6
      def srclen_=(value: size_t): Unit = !struct.at6 = value
      def currentline: CInt = struct._7
      def currentline_=(value: CInt): Unit = !struct.at7 = value
      def linedefined: CInt = struct._8
      def linedefined_=(value: CInt): Unit = !struct.at8 = value
      def lastlinedefined: CInt = struct._9
      def lastlinedefined_=(value: CInt): Unit = !struct.at9 = value
      def nups: CUnsignedChar = struct._10
      def nups_=(value: CUnsignedChar): Unit = !struct.at10 = value
      def nparams: CUnsignedChar = struct._11
      def nparams_=(value: CUnsignedChar): Unit = !struct.at11 = value
      def isvararg: CChar = struct._12
      def isvararg_=(value: CChar): Unit = !struct.at12 = value
      def istailcall: CChar = struct._13
      def istailcall_=(value: CChar): Unit = !struct.at13 = value
      def ftransfer: CUnsignedShort = struct._14
      def ftransfer_=(value: CUnsignedShort): Unit = !struct.at14 = value
      def ntransfer: CUnsignedShort = struct._15
      def ntransfer_=(value: CUnsignedShort): Unit = !struct.at15 = value
      def short_src: CArray[CChar, Nat.Digit2[Nat._6, Nat._0]] = struct._16
      def short_src_=(value: CArray[CChar, Nat.Digit2[Nat._6, Nat._0]]): Unit =
        !struct.at16 = value
      def i_ci: Ptr[CallInfo] = struct._17
      def i_ci_=(value: Ptr[CallInfo]): Unit = !struct.at17 = value
    end extension
  end lua_Debug

  /** */
  opaque type lua_State = CStruct0
  object lua_State:
    given _tag: Tag[lua_State] = Tag.materializeCStruct0Tag
end structs

@extern
private[lua] object extern_functions:
  import _root_.lua.aliases.*
  import _root_.lua.structs.*

  /** */
  def luaL_addgsub(
      b: Ptr[luaL_Buffer],
      s: CString,
      p: CString,
      r: CString
  ): Unit = extern

  /** */
  def luaL_addlstring(B: Ptr[luaL_Buffer], s: CString, l: size_t): Unit = extern

  /** */
  def luaL_addstring(B: Ptr[luaL_Buffer], s: CString): Unit = extern

  /** */
  def luaL_addvalue(B: Ptr[luaL_Buffer]): Unit = extern

  /** */
  def luaL_argerror(L: Ptr[lua_State], arg: CInt, extramsg: CString): CInt =
    extern

  /** */
  def luaL_buffinit(L: Ptr[lua_State], B: Ptr[luaL_Buffer]): Unit = extern

  /** */
  def luaL_buffinitsize(
      L: Ptr[lua_State],
      B: Ptr[luaL_Buffer],
      sz: size_t
  ): CString = extern

  /** */
  def luaL_callmeta(L: Ptr[lua_State], obj: CInt, e: CString): CInt = extern

  /** */
  def luaL_checkany(L: Ptr[lua_State], arg: CInt): Unit = extern

  /** */
  def luaL_checkinteger(L: Ptr[lua_State], arg: CInt): lua_Integer = extern

  /** */
  def luaL_checklstring(L: Ptr[lua_State], arg: CInt, l: Ptr[size_t]): CString =
    extern

  /** */
  def luaL_checknumber(L: Ptr[lua_State], arg: CInt): lua_Number = extern

  /** */
  def luaL_checkoption(
      L: Ptr[lua_State],
      arg: CInt,
      `def`: CString,
      lst: Ptr[CString]
  ): CInt = extern

  /** */
  def luaL_checkstack(L: Ptr[lua_State], sz: CInt, msg: CString): Unit = extern

  /** */
  def luaL_checktype(L: Ptr[lua_State], arg: CInt, t: CInt): Unit = extern

  /** */
  def luaL_checkudata(L: Ptr[lua_State], ud: CInt, tname: CString): Ptr[Byte] =
    extern

  /** */
  def luaL_checkversion_(L: Ptr[lua_State], ver: lua_Number, sz: size_t): Unit =
    extern

  /** */
  def luaL_error(L: Ptr[lua_State], fmt: CString, rest: Any*): CInt = extern

  /** */
  def luaL_execresult(L: Ptr[lua_State], stat: CInt): CInt = extern

  /** */
  def luaL_fileresult(L: Ptr[lua_State], stat: CInt, fname: CString): CInt =
    extern

  /** */
  def luaL_getmetafield(L: Ptr[lua_State], obj: CInt, e: CString): CInt = extern

  /** */
  def luaL_getsubtable(L: Ptr[lua_State], idx: CInt, fname: CString): CInt =
    extern

  /** */
  def luaL_gsub(
      L: Ptr[lua_State],
      s: CString,
      p: CString,
      r: CString
  ): CString = extern

  /** */
  def luaL_len(L: Ptr[lua_State], idx: CInt): lua_Integer = extern

  /** */
  def luaL_loadbufferx(
      L: Ptr[lua_State],
      buff: CString,
      sz: size_t,
      name: CString,
      mode: CString
  ): CInt = extern

  /** */
  def luaL_loadfilex(
      L: Ptr[lua_State],
      filename: CString,
      mode: CString
  ): CInt = extern

  /** */
  def luaL_loadstring(L: Ptr[lua_State], s: CString): CInt = extern

  /** */
  def luaL_newmetatable(L: Ptr[lua_State], tname: CString): CInt = extern

  /** */
  def luaL_newstate(): Ptr[lua_State] = extern

  /** */
  def luaL_openlibs(L: Ptr[lua_State]): Unit = extern

  /** */
  def luaL_optinteger(
      L: Ptr[lua_State],
      arg: CInt,
      `def`: lua_Integer
  ): lua_Integer = extern

  /** */
  def luaL_optlstring(
      L: Ptr[lua_State],
      arg: CInt,
      `def`: CString,
      l: Ptr[size_t]
  ): CString = extern

  /** */
  def luaL_optnumber(
      L: Ptr[lua_State],
      arg: CInt,
      `def`: lua_Number
  ): lua_Number = extern

  /** */
  def luaL_prepbuffsize(B: Ptr[luaL_Buffer], sz: size_t): CString = extern

  /** */
  def luaL_pushresult(B: Ptr[luaL_Buffer]): Unit = extern

  /** */
  def luaL_pushresultsize(B: Ptr[luaL_Buffer], sz: size_t): Unit = extern

  /** */
  def luaL_ref(L: Ptr[lua_State], t: CInt): CInt = extern

  /** */
  def luaL_requiref(
      L: Ptr[lua_State],
      modname: CString,
      openf: lua_CFunction,
      glb: CInt
  ): Unit = extern

  /** */
  def luaL_setfuncs(L: Ptr[lua_State], l: Ptr[luaL_Reg], nup: CInt): Unit =
    extern

  /** */
  def luaL_setmetatable(L: Ptr[lua_State], tname: CString): Unit = extern

  /** */
  def luaL_testudata(L: Ptr[lua_State], ud: CInt, tname: CString): Ptr[Byte] =
    extern

  /** */
  def luaL_tolstring(L: Ptr[lua_State], idx: CInt, len: Ptr[size_t]): CString =
    extern

  /** */
  def luaL_traceback(
      L: Ptr[lua_State],
      L1: Ptr[lua_State],
      msg: CString,
      level: CInt
  ): Unit = extern

  /** */
  def luaL_typeerror(L: Ptr[lua_State], arg: CInt, tname: CString): CInt =
    extern

  /** */
  def luaL_unref(L: Ptr[lua_State], t: CInt, ref: CInt): Unit = extern

  /** */
  def luaL_where(L: Ptr[lua_State], lvl: CInt): Unit = extern

  /** */
  def lua_absindex(L: Ptr[lua_State], idx: CInt): CInt = extern

  /** */
  def lua_arith(L: Ptr[lua_State], op: CInt): Unit = extern

  /** */
  def lua_atpanic(L: Ptr[lua_State], panicf: lua_CFunction): lua_CFunction =
    extern

  /** */
  def lua_callk(
      L: Ptr[lua_State],
      nargs: CInt,
      nresults: CInt,
      ctx: lua_KContext,
      k: lua_KFunction
  ): Unit = extern

  /** */
  def lua_checkstack(L: Ptr[lua_State], n: CInt): CInt = extern

  /** */
  def lua_close(L: Ptr[lua_State]): Unit = extern

  /** */
  def lua_closeslot(L: Ptr[lua_State], idx: CInt): Unit = extern

  /** */
  def lua_closethread(L: Ptr[lua_State], from: Ptr[lua_State]): CInt = extern

  /** */
  def lua_compare(L: Ptr[lua_State], idx1: CInt, idx2: CInt, op: CInt): CInt =
    extern

  /** */
  def lua_concat(L: Ptr[lua_State], n: CInt): Unit = extern

  /** */
  def lua_copy(L: Ptr[lua_State], fromidx: CInt, toidx: CInt): Unit = extern

  /** */
  def lua_createtable(L: Ptr[lua_State], narr: CInt, nrec: CInt): Unit = extern

  /** */
  def lua_dump(
      L: Ptr[lua_State],
      writer: lua_Writer,
      data: Ptr[Byte],
      strip: CInt
  ): CInt = extern

  /** */
  def lua_error(L: Ptr[lua_State]): CInt = extern

  /** */
  def lua_gc(L: Ptr[lua_State], what: CInt, rest: Any*): CInt = extern

  /** */
  def lua_getallocf(L: Ptr[lua_State], ud: Ptr[Ptr[Byte]]): lua_Alloc = extern

  /** */
  def lua_getfield(L: Ptr[lua_State], idx: CInt, k: CString): CInt = extern

  /** */
  def lua_getglobal(L: Ptr[lua_State], name: CString): CInt = extern

  /** */
  def lua_gethook(L: Ptr[lua_State]): lua_Hook = extern

  /** */
  def lua_gethookcount(L: Ptr[lua_State]): CInt = extern

  /** */
  def lua_gethookmask(L: Ptr[lua_State]): CInt = extern

  /** */
  def lua_geti(L: Ptr[lua_State], idx: CInt, n: lua_Integer): CInt = extern

  /** */
  def lua_getinfo(L: Ptr[lua_State], what: CString, ar: Ptr[lua_Debug]): CInt =
    extern

  /** */
  def lua_getiuservalue(L: Ptr[lua_State], idx: CInt, n: CInt): CInt = extern

  /** */
  def lua_getlocal(L: Ptr[lua_State], ar: Ptr[lua_Debug], n: CInt): CString =
    extern

  /** */
  def lua_getmetatable(L: Ptr[lua_State], objindex: CInt): CInt = extern

  /** */
  def lua_getstack(L: Ptr[lua_State], level: CInt, ar: Ptr[lua_Debug]): CInt =
    extern

  /** */
  def lua_gettable(L: Ptr[lua_State], idx: CInt): CInt = extern

  /** */
  def lua_gettop(L: Ptr[lua_State]): CInt = extern

  /** */
  def lua_getupvalue(L: Ptr[lua_State], funcindex: CInt, n: CInt): CString =
    extern

  /** */
  def lua_iscfunction(L: Ptr[lua_State], idx: CInt): CInt = extern

  /** */
  def lua_isinteger(L: Ptr[lua_State], idx: CInt): CInt = extern

  /** */
  def lua_isnumber(L: Ptr[lua_State], idx: CInt): CInt = extern

  /** */
  def lua_isstring(L: Ptr[lua_State], idx: CInt): CInt = extern

  /** */
  def lua_isuserdata(L: Ptr[lua_State], idx: CInt): CInt = extern

  /** */
  def lua_isyieldable(L: Ptr[lua_State]): CInt = extern

  /** */
  def lua_len(L: Ptr[lua_State], idx: CInt): Unit = extern

  /** */
  def lua_load(
      L: Ptr[lua_State],
      reader: lua_Reader,
      dt: Ptr[Byte],
      chunkname: CString,
      mode: CString
  ): CInt = extern

  /** */
  def lua_newstate(f: lua_Alloc, ud: Ptr[Byte]): Ptr[lua_State] = extern

  /** */
  def lua_newthread(L: Ptr[lua_State]): Ptr[lua_State] = extern

  /** */
  def lua_newuserdatauv(
      L: Ptr[lua_State],
      sz: size_t,
      nuvalue: CInt
  ): Ptr[Byte] = extern

  /** */
  def lua_next(L: Ptr[lua_State], idx: CInt): CInt = extern

  /** */
  def lua_pcallk(
      L: Ptr[lua_State],
      nargs: CInt,
      nresults: CInt,
      errfunc: CInt,
      ctx: lua_KContext,
      k: lua_KFunction
  ): CInt = extern

  /** */
  def lua_pushboolean(L: Ptr[lua_State], b: CInt): Unit = extern

  /** */
  def lua_pushcclosure(L: Ptr[lua_State], fn: lua_CFunction, n: CInt): Unit =
    extern

  /** */
  def lua_pushfstring(L: Ptr[lua_State], fmt: CString, rest: Any*): CString =
    extern

  /** */
  def lua_pushinteger(L: Ptr[lua_State], n: lua_Integer): Unit = extern

  /** */
  def lua_pushlightuserdata(L: Ptr[lua_State], p: Ptr[Byte]): Unit = extern

  /** */
  def lua_pushlstring(L: Ptr[lua_State], s: CString, len: size_t): CString =
    extern

  /** */
  def lua_pushnil(L: Ptr[lua_State]): Unit = extern

  /** */
  def lua_pushnumber(L: Ptr[lua_State], n: lua_Number): Unit = extern

  /** */
  def lua_pushstring(L: Ptr[lua_State], s: CString): CString = extern

  /** */
  def lua_pushthread(L: Ptr[lua_State]): CInt = extern

  /** */
  def lua_pushvalue(L: Ptr[lua_State], idx: CInt): Unit = extern

  /** */
  def lua_pushvfstring(
      L: Ptr[lua_State],
      fmt: CString,
      argp: va_list
  ): CString = extern

  /** */
  def lua_rawequal(L: Ptr[lua_State], idx1: CInt, idx2: CInt): CInt = extern

  /** */
  def lua_rawget(L: Ptr[lua_State], idx: CInt): CInt = extern

  /** */
  def lua_rawgeti(L: Ptr[lua_State], idx: CInt, n: lua_Integer): CInt = extern

  /** */
  def lua_rawgetp(L: Ptr[lua_State], idx: CInt, p: Ptr[Byte]): CInt = extern

  /** */
  def lua_rawlen(L: Ptr[lua_State], idx: CInt): lua_Unsigned = extern

  /** */
  def lua_rawset(L: Ptr[lua_State], idx: CInt): Unit = extern

  /** */
  def lua_rawseti(L: Ptr[lua_State], idx: CInt, n: lua_Integer): Unit = extern

  /** */
  def lua_rawsetp(L: Ptr[lua_State], idx: CInt, p: Ptr[Byte]): Unit = extern

  /** */
  def lua_resetthread(L: Ptr[lua_State]): CInt = extern

  /** */
  def lua_resume(
      L: Ptr[lua_State],
      from: Ptr[lua_State],
      narg: CInt,
      nres: Ptr[CInt]
  ): CInt = extern

  /** */
  def lua_rotate(L: Ptr[lua_State], idx: CInt, n: CInt): Unit = extern

  /** */
  def lua_setallocf(L: Ptr[lua_State], f: lua_Alloc, ud: Ptr[Byte]): Unit =
    extern

  /** */
  def lua_setcstacklimit(L: Ptr[lua_State], limit: CUnsignedInt): CInt = extern

  /** */
  def lua_setfield(L: Ptr[lua_State], idx: CInt, k: CString): Unit = extern

  /** */
  def lua_setglobal(L: Ptr[lua_State], name: CString): Unit = extern

  /** */
  def lua_sethook(
      L: Ptr[lua_State],
      func: lua_Hook,
      mask: CInt,
      count: CInt
  ): Unit = extern

  /** */
  def lua_seti(L: Ptr[lua_State], idx: CInt, n: lua_Integer): Unit = extern

  /** */
  def lua_setiuservalue(L: Ptr[lua_State], idx: CInt, n: CInt): CInt = extern

  /** */
  def lua_setlocal(L: Ptr[lua_State], ar: Ptr[lua_Debug], n: CInt): CString =
    extern

  /** */
  def lua_setmetatable(L: Ptr[lua_State], objindex: CInt): CInt = extern

  /** */
  def lua_settable(L: Ptr[lua_State], idx: CInt): Unit = extern

  /** */
  def lua_settop(L: Ptr[lua_State], idx: CInt): Unit = extern

  /** */
  def lua_setupvalue(L: Ptr[lua_State], funcindex: CInt, n: CInt): CString =
    extern

  /** */
  def lua_setwarnf(
      L: Ptr[lua_State],
      f: lua_WarnFunction,
      ud: Ptr[Byte]
  ): Unit = extern

  /** */
  def lua_status(L: Ptr[lua_State]): CInt = extern

  /** */
  def lua_stringtonumber(L: Ptr[lua_State], s: CString): size_t = extern

  /** */
  def lua_toboolean(L: Ptr[lua_State], idx: CInt): CInt = extern

  /** */
  def lua_tocfunction(L: Ptr[lua_State], idx: CInt): lua_CFunction = extern

  /** */
  def lua_toclose(L: Ptr[lua_State], idx: CInt): Unit = extern

  /** */
  def lua_tointegerx(
      L: Ptr[lua_State],
      idx: CInt,
      isnum: Ptr[CInt]
  ): lua_Integer = extern

  /** */
  def lua_tolstring(L: Ptr[lua_State], idx: CInt, len: Ptr[size_t]): CString =
    extern

  /** */
  def lua_tonumberx(
      L: Ptr[lua_State],
      idx: CInt,
      isnum: Ptr[CInt]
  ): lua_Number = extern

  /** */
  def lua_topointer(L: Ptr[lua_State], idx: CInt): Ptr[Byte] = extern

  /** */
  def lua_tothread(L: Ptr[lua_State], idx: CInt): Ptr[lua_State] = extern

  /** */
  def lua_touserdata(L: Ptr[lua_State], idx: CInt): Ptr[Byte] = extern

  /** */
  def lua_type(L: Ptr[lua_State], idx: CInt): CInt = extern

  /** */
  def lua_typename(L: Ptr[lua_State], tp: CInt): CString = extern

  /** */
  def lua_upvalueid(L: Ptr[lua_State], fidx: CInt, n: CInt): Ptr[Byte] = extern

  /** */
  def lua_upvaluejoin(
      L: Ptr[lua_State],
      fidx1: CInt,
      n1: CInt,
      fidx2: CInt,
      n2: CInt
  ): Unit = extern

  /** */
  def lua_version(L: Ptr[lua_State]): lua_Number = extern

  /** */
  def lua_warning(L: Ptr[lua_State], msg: CString, tocont: CInt): Unit = extern

  /** */
  def lua_xmove(from: Ptr[lua_State], to: Ptr[lua_State], n: CInt): Unit =
    extern

  /** */
  def lua_yieldk(
      L: Ptr[lua_State],
      nresults: CInt,
      ctx: lua_KContext,
      k: lua_KFunction
  ): CInt = extern

  /** */
  def luaopen_base(L: Ptr[lua_State]): CInt = extern

  /** */
  def luaopen_coroutine(L: Ptr[lua_State]): CInt = extern

  /** */
  def luaopen_debug(L: Ptr[lua_State]): CInt = extern

  /** */
  def luaopen_io(L: Ptr[lua_State]): CInt = extern

  /** */
  def luaopen_math(L: Ptr[lua_State]): CInt = extern

  /** */
  def luaopen_os(L: Ptr[lua_State]): CInt = extern

  /** */
  def luaopen_package(L: Ptr[lua_State]): CInt = extern

  /** */
  def luaopen_string(L: Ptr[lua_State]): CInt = extern

  /** */
  def luaopen_table(L: Ptr[lua_State]): CInt = extern

  /** */
  def luaopen_utf8(L: Ptr[lua_State]): CInt = extern
end extern_functions

object functions:
  import _root_.lua.aliases.*
  import _root_.lua.structs.*
  import extern_functions.*
  export extern_functions.*

object types:
  export _root_.lua.structs.*
  export _root_.lua.aliases.*

object all:
  export _root_.lua.aliases.FILE
  export _root_.lua.aliases.__darwin_intptr_t
  export _root_.lua.aliases.intptr_t
  export _root_.lua.aliases.lua_Alloc
  export _root_.lua.aliases.lua_CFunction
  export _root_.lua.aliases.lua_Hook
  export _root_.lua.aliases.lua_Integer
  export _root_.lua.aliases.lua_KContext
  export _root_.lua.aliases.lua_KFunction
  export _root_.lua.aliases.lua_Number
  export _root_.lua.aliases.lua_Reader
  export _root_.lua.aliases.lua_Unsigned
  export _root_.lua.aliases.lua_WarnFunction
  export _root_.lua.aliases.lua_Writer
  export _root_.lua.aliases.size_t
  export _root_.lua.aliases.va_list
  export _root_.lua.structs.CallInfo
  export _root_.lua.structs.luaL_Buffer
  export _root_.lua.structs.luaL_Reg
  export _root_.lua.structs.luaL_Stream
  export _root_.lua.structs.lua_Debug
  export _root_.lua.structs.lua_State
  export _root_.lua.functions.luaL_addgsub
  export _root_.lua.functions.luaL_addlstring
  export _root_.lua.functions.luaL_addstring
  export _root_.lua.functions.luaL_addvalue
  export _root_.lua.functions.luaL_argerror
  export _root_.lua.functions.luaL_buffinit
  export _root_.lua.functions.luaL_buffinitsize
  export _root_.lua.functions.luaL_callmeta
  export _root_.lua.functions.luaL_checkany
  export _root_.lua.functions.luaL_checkinteger
  export _root_.lua.functions.luaL_checklstring
  export _root_.lua.functions.luaL_checknumber
  export _root_.lua.functions.luaL_checkoption
  export _root_.lua.functions.luaL_checkstack
  export _root_.lua.functions.luaL_checktype
  export _root_.lua.functions.luaL_checkudata
  export _root_.lua.functions.luaL_checkversion_
  export _root_.lua.functions.luaL_error
  export _root_.lua.functions.luaL_execresult
  export _root_.lua.functions.luaL_fileresult
  export _root_.lua.functions.luaL_getmetafield
  export _root_.lua.functions.luaL_getsubtable
  export _root_.lua.functions.luaL_gsub
  export _root_.lua.functions.luaL_len
  export _root_.lua.functions.luaL_loadbufferx
  export _root_.lua.functions.luaL_loadfilex
  export _root_.lua.functions.luaL_loadstring
  export _root_.lua.functions.luaL_newmetatable
  export _root_.lua.functions.luaL_newstate
  export _root_.lua.functions.luaL_openlibs
  export _root_.lua.functions.luaL_optinteger
  export _root_.lua.functions.luaL_optlstring
  export _root_.lua.functions.luaL_optnumber
  export _root_.lua.functions.luaL_prepbuffsize
  export _root_.lua.functions.luaL_pushresult
  export _root_.lua.functions.luaL_pushresultsize
  export _root_.lua.functions.luaL_ref
  export _root_.lua.functions.luaL_requiref
  export _root_.lua.functions.luaL_setfuncs
  export _root_.lua.functions.luaL_setmetatable
  export _root_.lua.functions.luaL_testudata
  export _root_.lua.functions.luaL_tolstring
  export _root_.lua.functions.luaL_traceback
  export _root_.lua.functions.luaL_typeerror
  export _root_.lua.functions.luaL_unref
  export _root_.lua.functions.luaL_where
  export _root_.lua.functions.lua_absindex
  export _root_.lua.functions.lua_arith
  export _root_.lua.functions.lua_atpanic
  export _root_.lua.functions.lua_callk
  export _root_.lua.functions.lua_checkstack
  export _root_.lua.functions.lua_close
  export _root_.lua.functions.lua_closeslot
  export _root_.lua.functions.lua_closethread
  export _root_.lua.functions.lua_compare
  export _root_.lua.functions.lua_concat
  export _root_.lua.functions.lua_copy
  export _root_.lua.functions.lua_createtable
  export _root_.lua.functions.lua_dump
  export _root_.lua.functions.lua_error
  export _root_.lua.functions.lua_gc
  export _root_.lua.functions.lua_getallocf
  export _root_.lua.functions.lua_getfield
  export _root_.lua.functions.lua_getglobal
  export _root_.lua.functions.lua_gethook
  export _root_.lua.functions.lua_gethookcount
  export _root_.lua.functions.lua_gethookmask
  export _root_.lua.functions.lua_geti
  export _root_.lua.functions.lua_getinfo
  export _root_.lua.functions.lua_getiuservalue
  export _root_.lua.functions.lua_getlocal
  export _root_.lua.functions.lua_getmetatable
  export _root_.lua.functions.lua_getstack
  export _root_.lua.functions.lua_gettable
  export _root_.lua.functions.lua_gettop
  export _root_.lua.functions.lua_getupvalue
  export _root_.lua.functions.lua_iscfunction
  export _root_.lua.functions.lua_isinteger
  export _root_.lua.functions.lua_isnumber
  export _root_.lua.functions.lua_isstring
  export _root_.lua.functions.lua_isuserdata
  export _root_.lua.functions.lua_isyieldable
  export _root_.lua.functions.lua_len
  export _root_.lua.functions.lua_load
  export _root_.lua.functions.lua_newstate
  export _root_.lua.functions.lua_newthread
  export _root_.lua.functions.lua_newuserdatauv
  export _root_.lua.functions.lua_next
  export _root_.lua.functions.lua_pcallk
  export _root_.lua.functions.lua_pushboolean
  export _root_.lua.functions.lua_pushcclosure
  export _root_.lua.functions.lua_pushfstring
  export _root_.lua.functions.lua_pushinteger
  export _root_.lua.functions.lua_pushlightuserdata
  export _root_.lua.functions.lua_pushlstring
  export _root_.lua.functions.lua_pushnil
  export _root_.lua.functions.lua_pushnumber
  export _root_.lua.functions.lua_pushstring
  export _root_.lua.functions.lua_pushthread
  export _root_.lua.functions.lua_pushvalue
  export _root_.lua.functions.lua_pushvfstring
  export _root_.lua.functions.lua_rawequal
  export _root_.lua.functions.lua_rawget
  export _root_.lua.functions.lua_rawgeti
  export _root_.lua.functions.lua_rawgetp
  export _root_.lua.functions.lua_rawlen
  export _root_.lua.functions.lua_rawset
  export _root_.lua.functions.lua_rawseti
  export _root_.lua.functions.lua_rawsetp
  export _root_.lua.functions.lua_resetthread
  export _root_.lua.functions.lua_resume
  export _root_.lua.functions.lua_rotate
  export _root_.lua.functions.lua_setallocf
  export _root_.lua.functions.lua_setcstacklimit
  export _root_.lua.functions.lua_setfield
  export _root_.lua.functions.lua_setglobal
  export _root_.lua.functions.lua_sethook
  export _root_.lua.functions.lua_seti
  export _root_.lua.functions.lua_setiuservalue
  export _root_.lua.functions.lua_setlocal
  export _root_.lua.functions.lua_setmetatable
  export _root_.lua.functions.lua_settable
  export _root_.lua.functions.lua_settop
  export _root_.lua.functions.lua_setupvalue
  export _root_.lua.functions.lua_setwarnf
  export _root_.lua.functions.lua_status
  export _root_.lua.functions.lua_stringtonumber
  export _root_.lua.functions.lua_toboolean
  export _root_.lua.functions.lua_tocfunction
  export _root_.lua.functions.lua_toclose
  export _root_.lua.functions.lua_tointegerx
  export _root_.lua.functions.lua_tolstring
  export _root_.lua.functions.lua_tonumberx
  export _root_.lua.functions.lua_topointer
  export _root_.lua.functions.lua_tothread
  export _root_.lua.functions.lua_touserdata
  export _root_.lua.functions.lua_type
  export _root_.lua.functions.lua_typename
  export _root_.lua.functions.lua_upvalueid
  export _root_.lua.functions.lua_upvaluejoin
  export _root_.lua.functions.lua_version
  export _root_.lua.functions.lua_warning
  export _root_.lua.functions.lua_xmove
  export _root_.lua.functions.lua_yieldk
  export _root_.lua.functions.luaopen_base
  export _root_.lua.functions.luaopen_coroutine
  export _root_.lua.functions.luaopen_debug
  export _root_.lua.functions.luaopen_io
  export _root_.lua.functions.luaopen_math
  export _root_.lua.functions.luaopen_os
  export _root_.lua.functions.luaopen_package
  export _root_.lua.functions.luaopen_string
  export _root_.lua.functions.luaopen_table
  export _root_.lua.functions.luaopen_utf8
end all
