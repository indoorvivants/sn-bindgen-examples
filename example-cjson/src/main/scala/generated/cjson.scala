package cjson

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object aliases:
  import _root_.cjson.aliases.*
  import _root_.cjson.structs.*
  /**
  */
  opaque type cJSON_bool = CInt
  object cJSON_bool: 
    given _tag: Tag[cJSON_bool] = Tag.Int
    inline def apply(inline o: CInt): cJSON_bool = o
    extension (v: cJSON_bool)
      inline def value: CInt = v

  type size_t = libc.stddef.size_t
  object size_t: 
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t)
      inline def value: libc.stddef.size_t = v

object structs:
  import _root_.cjson.aliases.*
  import _root_.cjson.structs.*
  /**
  */
  opaque type cJSON = CStruct8[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt, CString, CInt, Double, CString]
  object cJSON:
    given _tag: Tag[cJSON] = Tag.materializeCStruct8Tag[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt, CString, CInt, Double, CString]
    def apply()(using Zone): Ptr[cJSON] = scala.scalanative.unsafe.alloc[cJSON](1)
    def apply(next : Ptr[cJSON], prev : Ptr[cJSON], child : Ptr[cJSON], `type` : CInt, valuestring : CString, valueint : CInt, valuedouble : Double, string : CString)(using Zone): Ptr[cJSON] = 
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).prev = prev
      (!____ptr).child = child
      (!____ptr).`type` = `type`
      (!____ptr).valuestring = valuestring
      (!____ptr).valueint = valueint
      (!____ptr).valuedouble = valuedouble
      (!____ptr).string = string
      ____ptr
    extension (struct: cJSON)
      def next : Ptr[cJSON] = struct._1.asInstanceOf[Ptr[cJSON]]
      def next_=(value: Ptr[cJSON]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def prev : Ptr[cJSON] = struct._2.asInstanceOf[Ptr[cJSON]]
      def prev_=(value: Ptr[cJSON]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
      def child : Ptr[cJSON] = struct._3.asInstanceOf[Ptr[cJSON]]
      def child_=(value: Ptr[cJSON]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]
      def `type` : CInt = struct._4
      def type_=(value: CInt): Unit = !struct.at4 = value
      def valuestring : CString = struct._5
      def valuestring_=(value: CString): Unit = !struct.at5 = value
      def valueint : CInt = struct._6
      def valueint_=(value: CInt): Unit = !struct.at6 = value
      def valuedouble : Double = struct._7
      def valuedouble_=(value: Double): Unit = !struct.at7 = value
      def string : CString = struct._8
      def string_=(value: CString): Unit = !struct.at8 = value

  /**
  */
  opaque type cJSON_Hooks = CStruct2[CFuncPtr1[size_t, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit]]
  object cJSON_Hooks:
    given _tag: Tag[cJSON_Hooks] = Tag.materializeCStruct2Tag[CFuncPtr1[size_t, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit]]
    def apply()(using Zone): Ptr[cJSON_Hooks] = scala.scalanative.unsafe.alloc[cJSON_Hooks](1)
    def apply(malloc_fn : CFuncPtr1[size_t, Ptr[Byte]], free_fn : CFuncPtr1[Ptr[Byte], Unit])(using Zone): Ptr[cJSON_Hooks] = 
      val ____ptr = apply()
      (!____ptr).malloc_fn = malloc_fn
      (!____ptr).free_fn = free_fn
      ____ptr
    extension (struct: cJSON_Hooks)
      def malloc_fn : CFuncPtr1[size_t, Ptr[Byte]] = struct._1
      def malloc_fn_=(value: CFuncPtr1[size_t, Ptr[Byte]]): Unit = !struct.at1 = value
      def free_fn : CFuncPtr1[Ptr[Byte], Unit] = struct._2
      def free_fn_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = !struct.at2 = value


@extern
private[cjson] object extern_functions:
  import _root_.cjson.aliases.*
  import _root_.cjson.structs.*
  /**
  */
  def cJSON_AddArrayToObject(`object` : Ptr[cJSON], name : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_AddBoolToObject(`object` : Ptr[cJSON], name : CString, boolean : cJSON_bool): Ptr[cJSON] = extern

  /**
  */
  def cJSON_AddFalseToObject(`object` : Ptr[cJSON], name : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_AddItemReferenceToArray(array : Ptr[cJSON], item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_AddItemReferenceToObject(`object` : Ptr[cJSON], string : CString, item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_AddItemToArray(array : Ptr[cJSON], item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_AddItemToObject(`object` : Ptr[cJSON], string : CString, item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_AddItemToObjectCS(`object` : Ptr[cJSON], string : CString, item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_AddNullToObject(`object` : Ptr[cJSON], name : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_AddNumberToObject(`object` : Ptr[cJSON], name : CString, number : Double): Ptr[cJSON] = extern

  /**
  */
  def cJSON_AddObjectToObject(`object` : Ptr[cJSON], name : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_AddRawToObject(`object` : Ptr[cJSON], name : CString, raw : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_AddStringToObject(`object` : Ptr[cJSON], name : CString, string : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_AddTrueToObject(`object` : Ptr[cJSON], name : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_Compare(a : Ptr[cJSON], b : Ptr[cJSON], case_sensitive : cJSON_bool): cJSON_bool = extern

  /**
  */
  def cJSON_CreateArray(): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateArrayReference(child : Ptr[cJSON]): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateBool(boolean : cJSON_bool): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateDoubleArray(numbers : Ptr[Double], count : CInt): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateFalse(): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateFloatArray(numbers : Ptr[Float], count : CInt): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateIntArray(numbers : Ptr[CInt], count : CInt): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateNull(): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateNumber(num : Double): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateObject(): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateObjectReference(child : Ptr[cJSON]): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateRaw(raw : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateString(string : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateStringArray(strings : Ptr[CString], count : CInt): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateStringReference(string : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_CreateTrue(): Ptr[cJSON] = extern

  /**
  */
  def cJSON_Delete(item : Ptr[cJSON]): Unit = extern

  /**
  */
  def cJSON_DeleteItemFromArray(array : Ptr[cJSON], which : CInt): Unit = extern

  /**
  */
  def cJSON_DeleteItemFromObject(`object` : Ptr[cJSON], string : CString): Unit = extern

  /**
  */
  def cJSON_DeleteItemFromObjectCaseSensitive(`object` : Ptr[cJSON], string : CString): Unit = extern

  /**
  */
  def cJSON_DetachItemFromArray(array : Ptr[cJSON], which : CInt): Ptr[cJSON] = extern

  /**
  */
  def cJSON_DetachItemFromObject(`object` : Ptr[cJSON], string : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_DetachItemFromObjectCaseSensitive(`object` : Ptr[cJSON], string : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_DetachItemViaPointer(parent : Ptr[cJSON], item : Ptr[cJSON]): Ptr[cJSON] = extern

  /**
  */
  def cJSON_Duplicate(item : Ptr[cJSON], recurse : cJSON_bool): Ptr[cJSON] = extern

  /**
  */
  def cJSON_GetArrayItem(array : Ptr[cJSON], index : CInt): Ptr[cJSON] = extern

  /**
  */
  def cJSON_GetArraySize(array : Ptr[cJSON]): CInt = extern

  /**
  */
  def cJSON_GetErrorPtr(): CString = extern

  /**
  */
  def cJSON_GetNumberValue(item : Ptr[cJSON]): Double = extern

  /**
  */
  def cJSON_GetObjectItem(`object` : Ptr[cJSON], string : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_GetObjectItemCaseSensitive(`object` : Ptr[cJSON], string : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_GetStringValue(item : Ptr[cJSON]): CString = extern

  /**
  */
  def cJSON_HasObjectItem(`object` : Ptr[cJSON], string : CString): cJSON_bool = extern

  /**
  */
  def cJSON_InitHooks(hooks : Ptr[cJSON_Hooks]): Unit = extern

  /**
  */
  def cJSON_InsertItemInArray(array : Ptr[cJSON], which : CInt, newitem : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_IsArray(item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_IsBool(item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_IsFalse(item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_IsInvalid(item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_IsNull(item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_IsNumber(item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_IsObject(item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_IsRaw(item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_IsString(item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_IsTrue(item : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_Minify(json : CString): Unit = extern

  /**
  */
  def cJSON_Parse(value : CString): Ptr[cJSON] = extern

  /**
  */
  def cJSON_ParseWithLength(value : CString, buffer_length : size_t): Ptr[cJSON] = extern

  /**
  */
  def cJSON_ParseWithLengthOpts(value : CString, buffer_length : size_t, return_parse_end : Ptr[CString], require_null_terminated : cJSON_bool): Ptr[cJSON] = extern

  /**
  */
  def cJSON_ParseWithOpts(value : CString, return_parse_end : Ptr[CString], require_null_terminated : cJSON_bool): Ptr[cJSON] = extern

  /**
  */
  def cJSON_Print(item : Ptr[cJSON]): CString = extern

  /**
  */
  def cJSON_PrintBuffered(item : Ptr[cJSON], prebuffer : CInt, fmt : cJSON_bool): CString = extern

  /**
  */
  def cJSON_PrintPreallocated(item : Ptr[cJSON], buffer : CString, length : CInt, format : cJSON_bool): cJSON_bool = extern

  /**
  */
  def cJSON_PrintUnformatted(item : Ptr[cJSON]): CString = extern

  /**
  */
  def cJSON_ReplaceItemInArray(array : Ptr[cJSON], which : CInt, newitem : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_ReplaceItemInObject(`object` : Ptr[cJSON], string : CString, newitem : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_ReplaceItemInObjectCaseSensitive(`object` : Ptr[cJSON], string : CString, newitem : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_ReplaceItemViaPointer(parent : Ptr[cJSON], item : Ptr[cJSON], replacement : Ptr[cJSON]): cJSON_bool = extern

  /**
  */
  def cJSON_SetNumberHelper(`object` : Ptr[cJSON], number : Double): Double = extern

  /**
  */
  def cJSON_SetValuestring(`object` : Ptr[cJSON], valuestring : CString): CString = extern

  /**
  */
  def cJSON_Version(): CString = extern

  /**
  */
  def cJSON_free(`object` : Ptr[Byte]): Unit = extern

  /**
  */
  def cJSON_malloc(size : size_t): Ptr[Byte] = extern


object functions:
  import _root_.cjson.aliases.*
  import _root_.cjson.structs.*
  import extern_functions.*
  export extern_functions.*

object types:
  export _root_.cjson.structs.*
  export _root_.cjson.aliases.*

object all:
  export _root_.cjson.aliases.cJSON_bool
  export _root_.cjson.aliases.size_t
  export _root_.cjson.structs.cJSON
  export _root_.cjson.structs.cJSON_Hooks
  export _root_.cjson.functions.cJSON_AddArrayToObject
  export _root_.cjson.functions.cJSON_AddBoolToObject
  export _root_.cjson.functions.cJSON_AddFalseToObject
  export _root_.cjson.functions.cJSON_AddItemReferenceToArray
  export _root_.cjson.functions.cJSON_AddItemReferenceToObject
  export _root_.cjson.functions.cJSON_AddItemToArray
  export _root_.cjson.functions.cJSON_AddItemToObject
  export _root_.cjson.functions.cJSON_AddItemToObjectCS
  export _root_.cjson.functions.cJSON_AddNullToObject
  export _root_.cjson.functions.cJSON_AddNumberToObject
  export _root_.cjson.functions.cJSON_AddObjectToObject
  export _root_.cjson.functions.cJSON_AddRawToObject
  export _root_.cjson.functions.cJSON_AddStringToObject
  export _root_.cjson.functions.cJSON_AddTrueToObject
  export _root_.cjson.functions.cJSON_Compare
  export _root_.cjson.functions.cJSON_CreateArray
  export _root_.cjson.functions.cJSON_CreateArrayReference
  export _root_.cjson.functions.cJSON_CreateBool
  export _root_.cjson.functions.cJSON_CreateDoubleArray
  export _root_.cjson.functions.cJSON_CreateFalse
  export _root_.cjson.functions.cJSON_CreateFloatArray
  export _root_.cjson.functions.cJSON_CreateIntArray
  export _root_.cjson.functions.cJSON_CreateNull
  export _root_.cjson.functions.cJSON_CreateNumber
  export _root_.cjson.functions.cJSON_CreateObject
  export _root_.cjson.functions.cJSON_CreateObjectReference
  export _root_.cjson.functions.cJSON_CreateRaw
  export _root_.cjson.functions.cJSON_CreateString
  export _root_.cjson.functions.cJSON_CreateStringArray
  export _root_.cjson.functions.cJSON_CreateStringReference
  export _root_.cjson.functions.cJSON_CreateTrue
  export _root_.cjson.functions.cJSON_Delete
  export _root_.cjson.functions.cJSON_DeleteItemFromArray
  export _root_.cjson.functions.cJSON_DeleteItemFromObject
  export _root_.cjson.functions.cJSON_DeleteItemFromObjectCaseSensitive
  export _root_.cjson.functions.cJSON_DetachItemFromArray
  export _root_.cjson.functions.cJSON_DetachItemFromObject
  export _root_.cjson.functions.cJSON_DetachItemFromObjectCaseSensitive
  export _root_.cjson.functions.cJSON_DetachItemViaPointer
  export _root_.cjson.functions.cJSON_Duplicate
  export _root_.cjson.functions.cJSON_GetArrayItem
  export _root_.cjson.functions.cJSON_GetArraySize
  export _root_.cjson.functions.cJSON_GetErrorPtr
  export _root_.cjson.functions.cJSON_GetNumberValue
  export _root_.cjson.functions.cJSON_GetObjectItem
  export _root_.cjson.functions.cJSON_GetObjectItemCaseSensitive
  export _root_.cjson.functions.cJSON_GetStringValue
  export _root_.cjson.functions.cJSON_HasObjectItem
  export _root_.cjson.functions.cJSON_InitHooks
  export _root_.cjson.functions.cJSON_InsertItemInArray
  export _root_.cjson.functions.cJSON_IsArray
  export _root_.cjson.functions.cJSON_IsBool
  export _root_.cjson.functions.cJSON_IsFalse
  export _root_.cjson.functions.cJSON_IsInvalid
  export _root_.cjson.functions.cJSON_IsNull
  export _root_.cjson.functions.cJSON_IsNumber
  export _root_.cjson.functions.cJSON_IsObject
  export _root_.cjson.functions.cJSON_IsRaw
  export _root_.cjson.functions.cJSON_IsString
  export _root_.cjson.functions.cJSON_IsTrue
  export _root_.cjson.functions.cJSON_Minify
  export _root_.cjson.functions.cJSON_Parse
  export _root_.cjson.functions.cJSON_ParseWithLength
  export _root_.cjson.functions.cJSON_ParseWithLengthOpts
  export _root_.cjson.functions.cJSON_ParseWithOpts
  export _root_.cjson.functions.cJSON_Print
  export _root_.cjson.functions.cJSON_PrintBuffered
  export _root_.cjson.functions.cJSON_PrintPreallocated
  export _root_.cjson.functions.cJSON_PrintUnformatted
  export _root_.cjson.functions.cJSON_ReplaceItemInArray
  export _root_.cjson.functions.cJSON_ReplaceItemInObject
  export _root_.cjson.functions.cJSON_ReplaceItemInObjectCaseSensitive
  export _root_.cjson.functions.cJSON_ReplaceItemViaPointer
  export _root_.cjson.functions.cJSON_SetNumberHelper
  export _root_.cjson.functions.cJSON_SetValuestring
  export _root_.cjson.functions.cJSON_Version
  export _root_.cjson.functions.cJSON_free
  export _root_.cjson.functions.cJSON_malloc