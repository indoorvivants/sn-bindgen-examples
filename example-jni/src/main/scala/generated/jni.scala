package jni

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
    private[jni] trait _BindgenEnumCUnsignedInt[T](using eq: T =:= CUnsignedInt):
      given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
      extension (inline t: T)
        inline def value: CUnsignedInt = t.asInstanceOf[CUnsignedInt]
        inline def int: CInt = value.toInt
        inline def uint: CUnsignedInt = value


object enumerations:
  import predef.*
  opaque type _jobjectType = CUnsignedInt
  object _jobjectType extends _BindgenEnumCUnsignedInt[_jobjectType]:
    given _tag: Tag[_jobjectType] = Tag.UInt
    inline def define(inline a: Long): _jobjectType = a.toUInt
    val JNIInvalidRefType = define(0)
    val JNILocalRefType = define(1)
    val JNIGlobalRefType = define(2)
    val JNIWeakGlobalRefType = define(3)
    def getName(value: _jobjectType): Option[String] =
      value match
        case `JNIInvalidRefType` => Some("JNIInvalidRefType")
        case `JNILocalRefType` => Some("JNILocalRefType")
        case `JNIGlobalRefType` => Some("JNIGlobalRefType")
        case `JNIWeakGlobalRefType` => Some("JNIWeakGlobalRefType")
        case _ => _root_.scala.None
    extension (a: _jobjectType)
      inline def &(b: _jobjectType): _jobjectType = a & b
      inline def |(b: _jobjectType): _jobjectType = a | b
      inline def is(b: _jobjectType): Boolean = (a & b) == b

object aliases:
  import _root_.jni.predef.*
  import _root_.jni.enumerations.*
  import _root_.jni.aliases.*
  import _root_.jni.structs.*
  import _root_.jni.unions.*
  opaque type JNIEnv = Ptr[JNINativeInterface_]
  object JNIEnv:
    given _tag: Tag[JNIEnv] = Tag.Ptr[JNINativeInterface_](JNINativeInterface_._tag)
    inline def apply(inline o: Ptr[JNINativeInterface_]): JNIEnv = o
    extension (v: JNIEnv)
      inline def value: Ptr[JNINativeInterface_] = v

  opaque type JavaVM = Ptr[JNIInvokeInterface_]
  object JavaVM:
    given _tag: Tag[JavaVM] = Tag.Ptr[JNIInvokeInterface_](JNIInvokeInterface_._tag)
    inline def apply(inline o: Ptr[JNIInvokeInterface_]): JavaVM = o
    extension (v: JavaVM)
      inline def value: Ptr[JNIInvokeInterface_] = v

  type jarray = jobject
  object jarray:
    given _tag: Tag[jarray] = jobject._tag
    inline def apply(inline o: jobject): jarray = o
    extension (v: jarray)
      inline def value: jobject = v

  opaque type jboolean = CUnsignedChar
  object jboolean:
    given _tag: Tag[jboolean] = Tag.UByte
    inline def apply(inline o: CUnsignedChar): jboolean = o
    extension (v: jboolean)
      inline def value: CUnsignedChar = v

  type jbooleanArray = jarray
  object jbooleanArray:
    given _tag: Tag[jbooleanArray] = jarray._tag
    inline def apply(inline o: jarray): jbooleanArray = o
    extension (v: jbooleanArray)
      inline def value: jarray = v

  opaque type jbyte = CChar
  object jbyte:
    given _tag: Tag[jbyte] = Tag.Byte
    inline def apply(inline o: CChar): jbyte = o
    extension (v: jbyte)
      inline def value: CChar = v

  type jbyteArray = jarray
  object jbyteArray:
    given _tag: Tag[jbyteArray] = jarray._tag
    inline def apply(inline o: jarray): jbyteArray = o
    extension (v: jbyteArray)
      inline def value: jarray = v

  opaque type jchar = CUnsignedShort
  object jchar:
    given _tag: Tag[jchar] = Tag.UShort
    inline def apply(inline o: CUnsignedShort): jchar = o
    extension (v: jchar)
      inline def value: CUnsignedShort = v

  type jcharArray = jarray
  object jcharArray:
    given _tag: Tag[jcharArray] = jarray._tag
    inline def apply(inline o: jarray): jcharArray = o
    extension (v: jcharArray)
      inline def value: jarray = v

  type jclass = jobject
  object jclass:
    given _tag: Tag[jclass] = jobject._tag
    inline def apply(inline o: jobject): jclass = o
    extension (v: jclass)
      inline def value: jobject = v

  opaque type jdouble = Double
  object jdouble:
    given _tag: Tag[jdouble] = Tag.Double
    inline def apply(inline o: Double): jdouble = o
    extension (v: jdouble)
      inline def value: Double = v

  type jdoubleArray = jarray
  object jdoubleArray:
    given _tag: Tag[jdoubleArray] = jarray._tag
    inline def apply(inline o: jarray): jdoubleArray = o
    extension (v: jdoubleArray)
      inline def value: jarray = v

  opaque type jfieldID = Ptr[_jfieldID]
  object jfieldID:
    given _tag: Tag[jfieldID] = Tag.Ptr[_jfieldID](_jfieldID._tag)
    inline def apply(inline o: Ptr[_jfieldID]): jfieldID = o
    extension (v: jfieldID)
      inline def value: Ptr[_jfieldID] = v

  opaque type jfloat = Float
  object jfloat:
    given _tag: Tag[jfloat] = Tag.Float
    inline def apply(inline o: Float): jfloat = o
    extension (v: jfloat)
      inline def value: Float = v

  type jfloatArray = jarray
  object jfloatArray:
    given _tag: Tag[jfloatArray] = jarray._tag
    inline def apply(inline o: jarray): jfloatArray = o
    extension (v: jfloatArray)
      inline def value: jarray = v

  opaque type jint = CInt
  object jint:
    given _tag: Tag[jint] = Tag.Int
    inline def apply(inline o: CInt): jint = o
    extension (v: jint)
      inline def value: CInt = v

  type jintArray = jarray
  object jintArray:
    given _tag: Tag[jintArray] = jarray._tag
    inline def apply(inline o: jarray): jintArray = o
    extension (v: jintArray)
      inline def value: jarray = v

  opaque type jlong = CLongInt
  object jlong:
    given _tag: Tag[jlong] = Tag.Size
    inline def apply(inline o: CLongInt): jlong = o
    extension (v: jlong)
      inline def value: CLongInt = v

  type jlongArray = jarray
  object jlongArray:
    given _tag: Tag[jlongArray] = jarray._tag
    inline def apply(inline o: jarray): jlongArray = o
    extension (v: jlongArray)
      inline def value: jarray = v

  opaque type jmethodID = Ptr[_jmethodID]
  object jmethodID:
    given _tag: Tag[jmethodID] = Tag.Ptr[_jmethodID](_jmethodID._tag)
    inline def apply(inline o: Ptr[_jmethodID]): jmethodID = o
    extension (v: jmethodID)
      inline def value: Ptr[_jmethodID] = v

  opaque type jobject = Ptr[_jobject]
  object jobject:
    given _tag: Tag[jobject] = Tag.Ptr[_jobject](_jobject._tag)
    inline def apply(inline o: Ptr[_jobject]): jobject = o
    extension (v: jobject)
      inline def value: Ptr[_jobject] = v

  type jobjectArray = jarray
  object jobjectArray:
    given _tag: Tag[jobjectArray] = jarray._tag
    inline def apply(inline o: jarray): jobjectArray = o
    extension (v: jobjectArray)
      inline def value: jarray = v

  type jobjectRefType = _jobjectType
  object jobjectRefType:
    given _tag: Tag[jobjectRefType] = _jobjectType._tag
    inline def apply(inline o: _jobjectType): jobjectRefType = o
    extension (v: jobjectRefType)
      inline def value: _jobjectType = v

  opaque type jshort = CShort
  object jshort:
    given _tag: Tag[jshort] = Tag.Short
    inline def apply(inline o: CShort): jshort = o
    extension (v: jshort)
      inline def value: CShort = v

  type jshortArray = jarray
  object jshortArray:
    given _tag: Tag[jshortArray] = jarray._tag
    inline def apply(inline o: jarray): jshortArray = o
    extension (v: jshortArray)
      inline def value: jarray = v

  type jsize = jint
  object jsize:
    given _tag: Tag[jsize] = jint._tag
    inline def apply(inline o: jint): jsize = o
    extension (v: jsize)
      inline def value: jint = v

  type jstring = jobject
  object jstring:
    given _tag: Tag[jstring] = jobject._tag
    inline def apply(inline o: jobject): jstring = o
    extension (v: jstring)
      inline def value: jobject = v

  type jthrowable = jobject
  object jthrowable:
    given _tag: Tag[jthrowable] = jobject._tag
    inline def apply(inline o: jobject): jthrowable = o
    extension (v: jthrowable)
      inline def value: jobject = v

  type jweak = jobject
  object jweak:
    given _tag: Tag[jweak] = jobject._tag
    inline def apply(inline o: jobject): jweak = o
    extension (v: jweak)
      inline def value: jobject = v

  type va_list = unsafe.CVarArgList
  object va_list:
    val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
    inline def apply(inline o: unsafe.CVarArgList): va_list = o
    extension (v: va_list)
      inline def value: unsafe.CVarArgList = v

object structs:
  import _root_.jni.predef.*
  import _root_.jni.enumerations.*
  import _root_.jni.aliases.*
  import _root_.jni.structs.*
  import _root_.jni.unions.*

  opaque type JNIEnv_ = CStruct1[Ptr[JNINativeInterface_]]
  
  object JNIEnv_ :
    given _tag: Tag[JNIEnv_] = Tag.materializeCStruct1Tag[Ptr[JNINativeInterface_]]
    
    export fields.*
    private[jni] object fields:
      extension (struct: JNIEnv_)
        inline def functions : Ptr[JNINativeInterface_] = struct._1
        inline def functions_=(value: Ptr[JNINativeInterface_]): Unit = (!struct.at1 = value)
      end extension
    
    // Allocates JNIEnv_ on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[JNIEnv_] = scala.scalanative.unsafe.alloc[JNIEnv_](1)
    def apply(functions : Ptr[JNINativeInterface_])(using Zone): Ptr[JNIEnv_] =
      val ____ptr = apply()
      (!____ptr).functions = functions
      ____ptr
    
    

  opaque type JNIInvokeInterface_ = CStruct8[Ptr[Byte], Ptr[Byte], Ptr[Byte], CFuncPtr1[Ptr[Byte], jint], CFuncPtr3[Ptr[Byte], Ptr[Ptr[Byte]], Ptr[Byte], jint], CFuncPtr1[Ptr[Byte], jint], CFuncPtr3[Ptr[Byte], Ptr[Ptr[Byte]], jint, jint], CFuncPtr3[Ptr[Byte], Ptr[Ptr[Byte]], Ptr[Byte], jint]]
  
  object JNIInvokeInterface_ :
    given _tag: Tag[JNIInvokeInterface_] = Tag.materializeCStruct8Tag[Ptr[Byte], Ptr[Byte], Ptr[Byte], CFuncPtr1[Ptr[Byte], jint], CFuncPtr3[Ptr[Byte], Ptr[Ptr[Byte]], Ptr[Byte], jint], CFuncPtr1[Ptr[Byte], jint], CFuncPtr3[Ptr[Byte], Ptr[Ptr[Byte]], jint, jint], CFuncPtr3[Ptr[Byte], Ptr[Ptr[Byte]], Ptr[Byte], jint]]
    
    export fields.*
    private[jni] object fields:
      extension (struct: JNIInvokeInterface_)
        inline def reserved0 : Ptr[Byte] = struct._1
        inline def reserved0_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
        inline def reserved1 : Ptr[Byte] = struct._2
        inline def reserved1_=(value: Ptr[Byte]): Unit = (!struct.at2 = value)
        inline def reserved2 : Ptr[Byte] = struct._3
        inline def reserved2_=(value: Ptr[Byte]): Unit = (!struct.at3 = value)
        inline def DestroyJavaVM : CFuncPtr1[Ptr[JavaVM], jint] = struct._4.asInstanceOf[CFuncPtr1[Ptr[JavaVM], jint]]
        inline def DestroyJavaVM_=(value: CFuncPtr1[Ptr[JavaVM], jint]): Unit = (!struct.at4 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], jint]])
        inline def AttachCurrentThread : CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], Ptr[Byte], jint] = struct._5.asInstanceOf[CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], Ptr[Byte], jint]]
        inline def AttachCurrentThread_=(value: CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], Ptr[Byte], jint]): Unit = (!struct.at5 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], Ptr[Ptr[Byte]], Ptr[Byte], jint]])
        inline def DetachCurrentThread : CFuncPtr1[Ptr[JavaVM], jint] = struct._6.asInstanceOf[CFuncPtr1[Ptr[JavaVM], jint]]
        inline def DetachCurrentThread_=(value: CFuncPtr1[Ptr[JavaVM], jint]): Unit = (!struct.at6 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], jint]])
        inline def GetEnv : CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], jint, jint] = struct._7.asInstanceOf[CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], jint, jint]]
        inline def GetEnv_=(value: CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], jint, jint]): Unit = (!struct.at7 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], Ptr[Ptr[Byte]], jint, jint]])
        inline def AttachCurrentThreadAsDaemon : CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], Ptr[Byte], jint] = struct._8.asInstanceOf[CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], Ptr[Byte], jint]]
        inline def AttachCurrentThreadAsDaemon_=(value: CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], Ptr[Byte], jint]): Unit = (!struct.at8 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], Ptr[Ptr[Byte]], Ptr[Byte], jint]])
      end extension
    
    // Allocates JNIInvokeInterface_ on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[JNIInvokeInterface_] = scala.scalanative.unsafe.alloc[JNIInvokeInterface_](1)
    def apply(reserved0 : Ptr[Byte], reserved1 : Ptr[Byte], reserved2 : Ptr[Byte], DestroyJavaVM : CFuncPtr1[Ptr[JavaVM], jint], AttachCurrentThread : CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], Ptr[Byte], jint], DetachCurrentThread : CFuncPtr1[Ptr[JavaVM], jint], GetEnv : CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], jint, jint], AttachCurrentThreadAsDaemon : CFuncPtr3[Ptr[JavaVM], Ptr[Ptr[Byte]], Ptr[Byte], jint])(using Zone): Ptr[JNIInvokeInterface_] =
      val ____ptr = apply()
      (!____ptr).reserved0 = reserved0
      (!____ptr).reserved1 = reserved1
      (!____ptr).reserved2 = reserved2
      (!____ptr).DestroyJavaVM = DestroyJavaVM
      (!____ptr).AttachCurrentThread = AttachCurrentThread
      (!____ptr).DetachCurrentThread = DetachCurrentThread
      (!____ptr).GetEnv = GetEnv
      (!____ptr).AttachCurrentThreadAsDaemon = AttachCurrentThreadAsDaemon
      ____ptr
    
    

  opaque type JNINativeInterface_ = CArray[CChar, Nat.Digit4[Nat._1, Nat._8, Nat._8, Nat._0]]
  
  object JNINativeInterface_ :
    given _tag: Tag[JNINativeInterface_] = Tag.CArray[CChar, Nat.Digit4[Nat._1, Nat._8, Nat._8, Nat._0]](Tag.Byte, Tag.Digit4[Nat._1, Nat._8, Nat._8, Nat._0](Tag.Nat1, Tag.Nat8, Tag.Nat8, Tag.Nat0))
    
    export fields.*
    private[jni] object fields:
      extension (struct: JNINativeInterface_)
        inline def reserved0: Ptr[Byte] = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[Byte]]]
        inline def reserved0_=(value: Ptr[Byte]): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[Byte]]] = value
        inline def reserved1: Ptr[Byte] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[Byte]]]
        inline def reserved1_=(value: Ptr[Byte]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[Byte]]] = value
        inline def reserved2: Ptr[Byte] = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[Byte]]]
        inline def reserved2_=(value: Ptr[Byte]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[Byte]]] = value
        inline def reserved3: Ptr[Byte] = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Byte]]]
        inline def reserved3_=(value: Ptr[Byte]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Byte]]] = value
        inline def GetVersion: CFuncPtr1[Ptr[JNIEnv], jint] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[JNIEnv], jint]]]
        inline def GetVersion_=(value: CFuncPtr1[Ptr[JNIEnv], jint]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[JNIEnv], jint]]] = value
        inline def DefineClass: CFuncPtr5[Ptr[JNIEnv], CString, jobject, Ptr[jbyte], jsize, jclass] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], CString, jobject, Ptr[jbyte], jsize, jclass]]]
        inline def DefineClass_=(value: CFuncPtr5[Ptr[JNIEnv], CString, jobject, Ptr[jbyte], jsize, jclass]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], CString, jobject, Ptr[jbyte], jsize, jclass]]] = value
        inline def FindClass: CFuncPtr2[Ptr[JNIEnv], CString, jclass] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], CString, jclass]]]
        inline def FindClass_=(value: CFuncPtr2[Ptr[JNIEnv], CString, jclass]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], CString, jclass]]] = value
        inline def FromReflectedMethod: CFuncPtr2[Ptr[JNIEnv], jobject, jmethodID] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jmethodID]]]
        inline def FromReflectedMethod_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jmethodID]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jmethodID]]] = value
        inline def FromReflectedField: CFuncPtr2[Ptr[JNIEnv], jobject, jfieldID] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jfieldID]]]
        inline def FromReflectedField_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jfieldID]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jfieldID]]] = value
        inline def ToReflectedMethod: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, jboolean, jobject] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, jboolean, jobject]]]
        inline def ToReflectedMethod_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, jboolean, jobject]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, jboolean, jobject]]] = value
        inline def GetSuperclass: CFuncPtr2[Ptr[JNIEnv], jclass, jclass] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jclass, jclass]]]
        inline def GetSuperclass_=(value: CFuncPtr2[Ptr[JNIEnv], jclass, jclass]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jclass, jclass]]] = value
        inline def IsAssignableFrom: CFuncPtr3[Ptr[JNIEnv], jclass, jclass, jboolean] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jclass, jboolean]]]
        inline def IsAssignableFrom_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jclass, jboolean]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jclass, jboolean]]] = value
        inline def ToReflectedField: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, jobject] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, jobject]]]
        inline def ToReflectedField_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, jobject]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, jobject]]] = value
        inline def Throw: CFuncPtr2[Ptr[JNIEnv], jthrowable, jint] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jthrowable, jint]]]
        inline def Throw_=(value: CFuncPtr2[Ptr[JNIEnv], jthrowable, jint]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jthrowable, jint]]] = value
        inline def ThrowNew: CFuncPtr3[Ptr[JNIEnv], jclass, CString, jint] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, CString, jint]]]
        inline def ThrowNew_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, CString, jint]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, CString, jint]]] = value
        inline def ExceptionOccurred: CFuncPtr1[Ptr[JNIEnv], jthrowable] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr1[Ptr[JNIEnv], jthrowable]]]
        inline def ExceptionOccurred_=(value: CFuncPtr1[Ptr[JNIEnv], jthrowable]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr1[Ptr[JNIEnv], jthrowable]]] = value
        inline def ExceptionDescribe: CFuncPtr1[Ptr[JNIEnv], Unit] = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr1[Ptr[JNIEnv], Unit]]]
        inline def ExceptionDescribe_=(value: CFuncPtr1[Ptr[JNIEnv], Unit]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr1[Ptr[JNIEnv], Unit]]] = value
        inline def ExceptionClear: CFuncPtr1[Ptr[JNIEnv], Unit] = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr1[Ptr[JNIEnv], Unit]]]
        inline def ExceptionClear_=(value: CFuncPtr1[Ptr[JNIEnv], Unit]): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr1[Ptr[JNIEnv], Unit]]] = value
        inline def FatalError: CFuncPtr2[Ptr[JNIEnv], CString, Unit] = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], CString, Unit]]]
        inline def FatalError_=(value: CFuncPtr2[Ptr[JNIEnv], CString, Unit]): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], CString, Unit]]] = value
        inline def PushLocalFrame: CFuncPtr2[Ptr[JNIEnv], jint, jint] = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jint, jint]]]
        inline def PushLocalFrame_=(value: CFuncPtr2[Ptr[JNIEnv], jint, jint]): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jint, jint]]] = value
        inline def PopLocalFrame: CFuncPtr2[Ptr[JNIEnv], jobject, jobject] = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]]]
        inline def PopLocalFrame_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jobject]): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]]] = value
        inline def NewGlobalRef: CFuncPtr2[Ptr[JNIEnv], jobject, jobject] = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]]]
        inline def NewGlobalRef_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jobject]): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]]] = value
        inline def DeleteGlobalRef: CFuncPtr2[Ptr[JNIEnv], jobject, Unit] = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, Unit]]]
        inline def DeleteGlobalRef_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, Unit]): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, Unit]]] = value
        inline def DeleteLocalRef: CFuncPtr2[Ptr[JNIEnv], jobject, Unit] = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, Unit]]]
        inline def DeleteLocalRef_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, Unit]): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, Unit]]] = value
        inline def IsSameObject: CFuncPtr3[Ptr[JNIEnv], jobject, jobject, jboolean] = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jobject, jboolean]]]
        inline def IsSameObject_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jobject, jboolean]): Unit = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jobject, jboolean]]] = value
        inline def NewLocalRef: CFuncPtr2[Ptr[JNIEnv], jobject, jobject] = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]]]
        inline def NewLocalRef_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jobject]): Unit = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]]] = value
        inline def EnsureLocalCapacity: CFuncPtr2[Ptr[JNIEnv], jint, jint] = !struct.at(offsets(26)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jint, jint]]]
        inline def EnsureLocalCapacity_=(value: CFuncPtr2[Ptr[JNIEnv], jint, jint]): Unit = !struct.at(offsets(26)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jint, jint]]] = value
        inline def AllocObject: CFuncPtr2[Ptr[JNIEnv], jclass, jobject] = !struct.at(offsets(27)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jclass, jobject]]]
        inline def AllocObject_=(value: CFuncPtr2[Ptr[JNIEnv], jclass, jobject]): Unit = !struct.at(offsets(27)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jclass, jobject]]] = value
        inline def NewObject: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject] = !struct.at(offsets(28)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject]]]
        inline def NewObject_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject]): Unit = !struct.at(offsets(28)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject]]] = value
        inline def NewObjectV: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject] = !struct.at(offsets(29)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject]]]
        inline def NewObjectV_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject]): Unit = !struct.at(offsets(29)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject]]] = value
        inline def NewObjectA: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject] = !struct.at(offsets(30)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject]]]
        inline def NewObjectA_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject]): Unit = !struct.at(offsets(30)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject]]] = value
        inline def GetObjectClass: CFuncPtr2[Ptr[JNIEnv], jobject, jclass] = !struct.at(offsets(31)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jclass]]]
        inline def GetObjectClass_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jclass]): Unit = !struct.at(offsets(31)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jclass]]] = value
        inline def IsInstanceOf: CFuncPtr3[Ptr[JNIEnv], jobject, jclass, jboolean] = !struct.at(offsets(32)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jclass, jboolean]]]
        inline def IsInstanceOf_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jclass, jboolean]): Unit = !struct.at(offsets(32)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jclass, jboolean]]] = value
        inline def GetMethodID: CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID] = !struct.at(offsets(33)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID]]]
        inline def GetMethodID_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID]): Unit = !struct.at(offsets(33)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID]]] = value
        inline def CallObjectMethod: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jobject] = !struct.at(offsets(34)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jobject]]]
        inline def CallObjectMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jobject]): Unit = !struct.at(offsets(34)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jobject]]] = value
        inline def CallObjectMethodV: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jobject] = !struct.at(offsets(35)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jobject]]]
        inline def CallObjectMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jobject]): Unit = !struct.at(offsets(35)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jobject]]] = value
        inline def CallObjectMethodA: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jobject] = !struct.at(offsets(36)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jobject]]]
        inline def CallObjectMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jobject]): Unit = !struct.at(offsets(36)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jobject]]] = value
        inline def CallBooleanMethod: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jboolean] = !struct.at(offsets(37)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jboolean]]]
        inline def CallBooleanMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jboolean]): Unit = !struct.at(offsets(37)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jboolean]]] = value
        inline def CallBooleanMethodV: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jboolean] = !struct.at(offsets(38)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jboolean]]]
        inline def CallBooleanMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jboolean]): Unit = !struct.at(offsets(38)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jboolean]]] = value
        inline def CallBooleanMethodA: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jboolean] = !struct.at(offsets(39)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jboolean]]]
        inline def CallBooleanMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jboolean]): Unit = !struct.at(offsets(39)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jboolean]]] = value
        inline def CallByteMethod: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jbyte] = !struct.at(offsets(40)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jbyte]]]
        inline def CallByteMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jbyte]): Unit = !struct.at(offsets(40)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jbyte]]] = value
        inline def CallByteMethodV: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jbyte] = !struct.at(offsets(41)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jbyte]]]
        inline def CallByteMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jbyte]): Unit = !struct.at(offsets(41)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jbyte]]] = value
        inline def CallByteMethodA: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jbyte] = !struct.at(offsets(42)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jbyte]]]
        inline def CallByteMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jbyte]): Unit = !struct.at(offsets(42)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jbyte]]] = value
        inline def CallCharMethod: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jchar] = !struct.at(offsets(43)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jchar]]]
        inline def CallCharMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jchar]): Unit = !struct.at(offsets(43)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jchar]]] = value
        inline def CallCharMethodV: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jchar] = !struct.at(offsets(44)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jchar]]]
        inline def CallCharMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jchar]): Unit = !struct.at(offsets(44)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jchar]]] = value
        inline def CallCharMethodA: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jchar] = !struct.at(offsets(45)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jchar]]]
        inline def CallCharMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jchar]): Unit = !struct.at(offsets(45)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jchar]]] = value
        inline def CallShortMethod: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jshort] = !struct.at(offsets(46)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jshort]]]
        inline def CallShortMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jshort]): Unit = !struct.at(offsets(46)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jshort]]] = value
        inline def CallShortMethodV: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jshort] = !struct.at(offsets(47)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jshort]]]
        inline def CallShortMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jshort]): Unit = !struct.at(offsets(47)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jshort]]] = value
        inline def CallShortMethodA: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jshort] = !struct.at(offsets(48)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jshort]]]
        inline def CallShortMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jshort]): Unit = !struct.at(offsets(48)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jshort]]] = value
        inline def CallIntMethod: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jint] = !struct.at(offsets(49)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jint]]]
        inline def CallIntMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jint]): Unit = !struct.at(offsets(49)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jint]]] = value
        inline def CallIntMethodV: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jint] = !struct.at(offsets(50)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jint]]]
        inline def CallIntMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jint]): Unit = !struct.at(offsets(50)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jint]]] = value
        inline def CallIntMethodA: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jint] = !struct.at(offsets(51)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jint]]]
        inline def CallIntMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jint]): Unit = !struct.at(offsets(51)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jint]]] = value
        inline def CallLongMethod: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jlong] = !struct.at(offsets(52)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jlong]]]
        inline def CallLongMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jlong]): Unit = !struct.at(offsets(52)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jlong]]] = value
        inline def CallLongMethodV: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jlong] = !struct.at(offsets(53)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jlong]]]
        inline def CallLongMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jlong]): Unit = !struct.at(offsets(53)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jlong]]] = value
        inline def CallLongMethodA: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jlong] = !struct.at(offsets(54)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jlong]]]
        inline def CallLongMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jlong]): Unit = !struct.at(offsets(54)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jlong]]] = value
        inline def CallFloatMethod: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jfloat] = !struct.at(offsets(55)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jfloat]]]
        inline def CallFloatMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jfloat]): Unit = !struct.at(offsets(55)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jfloat]]] = value
        inline def CallFloatMethodV: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jfloat] = !struct.at(offsets(56)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jfloat]]]
        inline def CallFloatMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jfloat]): Unit = !struct.at(offsets(56)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jfloat]]] = value
        inline def CallFloatMethodA: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jfloat] = !struct.at(offsets(57)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jfloat]]]
        inline def CallFloatMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jfloat]): Unit = !struct.at(offsets(57)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jfloat]]] = value
        inline def CallDoubleMethod: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jdouble] = !struct.at(offsets(58)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jdouble]]]
        inline def CallDoubleMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jdouble]): Unit = !struct.at(offsets(58)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jdouble]]] = value
        inline def CallDoubleMethodV: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jdouble] = !struct.at(offsets(59)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jdouble]]]
        inline def CallDoubleMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jdouble]): Unit = !struct.at(offsets(59)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jdouble]]] = value
        inline def CallDoubleMethodA: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jdouble] = !struct.at(offsets(60)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jdouble]]]
        inline def CallDoubleMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jdouble]): Unit = !struct.at(offsets(60)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jdouble]]] = value
        inline def CallVoidMethod: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, Unit] = !struct.at(offsets(61)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, Unit]]]
        inline def CallVoidMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, Unit]): Unit = !struct.at(offsets(61)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, Unit]]] = value
        inline def CallVoidMethodV: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, Unit] = !struct.at(offsets(62)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, Unit]]]
        inline def CallVoidMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, Unit]): Unit = !struct.at(offsets(62)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, Unit]]] = value
        inline def CallVoidMethodA: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], Unit] = !struct.at(offsets(63)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], Unit]]]
        inline def CallVoidMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], Unit]): Unit = !struct.at(offsets(63)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], Unit]]] = value
        inline def CallNonvirtualObjectMethod: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jobject] = !struct.at(offsets(64)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jobject]]]
        inline def CallNonvirtualObjectMethod_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jobject]): Unit = !struct.at(offsets(64)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jobject]]] = value
        inline def CallNonvirtualObjectMethodV: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jobject] = !struct.at(offsets(65)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jobject]]]
        inline def CallNonvirtualObjectMethodV_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jobject]): Unit = !struct.at(offsets(65)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jobject]]] = value
        inline def CallNonvirtualObjectMethodA: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jobject] = !struct.at(offsets(66)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jobject]]]
        inline def CallNonvirtualObjectMethodA_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jobject]): Unit = !struct.at(offsets(66)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jobject]]] = value
        inline def CallNonvirtualBooleanMethod: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jboolean] = !struct.at(offsets(67)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jboolean]]]
        inline def CallNonvirtualBooleanMethod_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jboolean]): Unit = !struct.at(offsets(67)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jboolean]]] = value
        inline def CallNonvirtualBooleanMethodV: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jboolean] = !struct.at(offsets(68)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jboolean]]]
        inline def CallNonvirtualBooleanMethodV_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jboolean]): Unit = !struct.at(offsets(68)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jboolean]]] = value
        inline def CallNonvirtualBooleanMethodA: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jboolean] = !struct.at(offsets(69)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jboolean]]]
        inline def CallNonvirtualBooleanMethodA_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jboolean]): Unit = !struct.at(offsets(69)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jboolean]]] = value
        inline def CallNonvirtualByteMethod: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jbyte] = !struct.at(offsets(70)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jbyte]]]
        inline def CallNonvirtualByteMethod_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jbyte]): Unit = !struct.at(offsets(70)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jbyte]]] = value
        inline def CallNonvirtualByteMethodV: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jbyte] = !struct.at(offsets(71)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jbyte]]]
        inline def CallNonvirtualByteMethodV_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jbyte]): Unit = !struct.at(offsets(71)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jbyte]]] = value
        inline def CallNonvirtualByteMethodA: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jbyte] = !struct.at(offsets(72)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jbyte]]]
        inline def CallNonvirtualByteMethodA_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jbyte]): Unit = !struct.at(offsets(72)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jbyte]]] = value
        inline def CallNonvirtualCharMethod: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jchar] = !struct.at(offsets(73)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jchar]]]
        inline def CallNonvirtualCharMethod_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jchar]): Unit = !struct.at(offsets(73)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jchar]]] = value
        inline def CallNonvirtualCharMethodV: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jchar] = !struct.at(offsets(74)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jchar]]]
        inline def CallNonvirtualCharMethodV_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jchar]): Unit = !struct.at(offsets(74)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jchar]]] = value
        inline def CallNonvirtualCharMethodA: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jchar] = !struct.at(offsets(75)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jchar]]]
        inline def CallNonvirtualCharMethodA_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jchar]): Unit = !struct.at(offsets(75)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jchar]]] = value
        inline def CallNonvirtualShortMethod: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jshort] = !struct.at(offsets(76)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jshort]]]
        inline def CallNonvirtualShortMethod_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jshort]): Unit = !struct.at(offsets(76)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jshort]]] = value
        inline def CallNonvirtualShortMethodV: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jshort] = !struct.at(offsets(77)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jshort]]]
        inline def CallNonvirtualShortMethodV_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jshort]): Unit = !struct.at(offsets(77)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jshort]]] = value
        inline def CallNonvirtualShortMethodA: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jshort] = !struct.at(offsets(78)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jshort]]]
        inline def CallNonvirtualShortMethodA_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jshort]): Unit = !struct.at(offsets(78)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jshort]]] = value
        inline def CallNonvirtualIntMethod: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jint] = !struct.at(offsets(79)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jint]]]
        inline def CallNonvirtualIntMethod_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jint]): Unit = !struct.at(offsets(79)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jint]]] = value
        inline def CallNonvirtualIntMethodV: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jint] = !struct.at(offsets(80)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jint]]]
        inline def CallNonvirtualIntMethodV_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jint]): Unit = !struct.at(offsets(80)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jint]]] = value
        inline def CallNonvirtualIntMethodA: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jint] = !struct.at(offsets(81)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jint]]]
        inline def CallNonvirtualIntMethodA_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jint]): Unit = !struct.at(offsets(81)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jint]]] = value
        inline def CallNonvirtualLongMethod: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jlong] = !struct.at(offsets(82)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jlong]]]
        inline def CallNonvirtualLongMethod_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jlong]): Unit = !struct.at(offsets(82)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jlong]]] = value
        inline def CallNonvirtualLongMethodV: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jlong] = !struct.at(offsets(83)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jlong]]]
        inline def CallNonvirtualLongMethodV_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jlong]): Unit = !struct.at(offsets(83)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jlong]]] = value
        inline def CallNonvirtualLongMethodA: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jlong] = !struct.at(offsets(84)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jlong]]]
        inline def CallNonvirtualLongMethodA_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jlong]): Unit = !struct.at(offsets(84)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jlong]]] = value
        inline def CallNonvirtualFloatMethod: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jfloat] = !struct.at(offsets(85)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jfloat]]]
        inline def CallNonvirtualFloatMethod_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jfloat]): Unit = !struct.at(offsets(85)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jfloat]]] = value
        inline def CallNonvirtualFloatMethodV: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jfloat] = !struct.at(offsets(86)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jfloat]]]
        inline def CallNonvirtualFloatMethodV_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jfloat]): Unit = !struct.at(offsets(86)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jfloat]]] = value
        inline def CallNonvirtualFloatMethodA: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jfloat] = !struct.at(offsets(87)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jfloat]]]
        inline def CallNonvirtualFloatMethodA_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jfloat]): Unit = !struct.at(offsets(87)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jfloat]]] = value
        inline def CallNonvirtualDoubleMethod: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jdouble] = !struct.at(offsets(88)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jdouble]]]
        inline def CallNonvirtualDoubleMethod_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jdouble]): Unit = !struct.at(offsets(88)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jdouble]]] = value
        inline def CallNonvirtualDoubleMethodV: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jdouble] = !struct.at(offsets(89)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jdouble]]]
        inline def CallNonvirtualDoubleMethodV_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jdouble]): Unit = !struct.at(offsets(89)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jdouble]]] = value
        inline def CallNonvirtualDoubleMethodA: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jdouble] = !struct.at(offsets(90)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jdouble]]]
        inline def CallNonvirtualDoubleMethodA_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jdouble]): Unit = !struct.at(offsets(90)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jdouble]]] = value
        inline def CallNonvirtualVoidMethod: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, Unit] = !struct.at(offsets(91)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, Unit]]]
        inline def CallNonvirtualVoidMethod_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, Unit]): Unit = !struct.at(offsets(91)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, Unit]]] = value
        inline def CallNonvirtualVoidMethodV: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, Unit] = !struct.at(offsets(92)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, Unit]]]
        inline def CallNonvirtualVoidMethodV_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, Unit]): Unit = !struct.at(offsets(92)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, Unit]]] = value
        inline def CallNonvirtualVoidMethodA: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], Unit] = !struct.at(offsets(93)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], Unit]]]
        inline def CallNonvirtualVoidMethodA_=(value: CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], Unit]): Unit = !struct.at(offsets(93)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], Unit]]] = value
        inline def GetFieldID: CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID] = !struct.at(offsets(94)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID]]]
        inline def GetFieldID_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID]): Unit = !struct.at(offsets(94)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID]]] = value
        inline def GetObjectField: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jobject] = !struct.at(offsets(95)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jobject]]]
        inline def GetObjectField_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jobject]): Unit = !struct.at(offsets(95)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jobject]]] = value
        inline def GetBooleanField: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jboolean] = !struct.at(offsets(96)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jboolean]]]
        inline def GetBooleanField_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jboolean]): Unit = !struct.at(offsets(96)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jboolean]]] = value
        inline def GetByteField: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jbyte] = !struct.at(offsets(97)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jbyte]]]
        inline def GetByteField_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jbyte]): Unit = !struct.at(offsets(97)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jbyte]]] = value
        inline def GetCharField: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jchar] = !struct.at(offsets(98)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jchar]]]
        inline def GetCharField_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jchar]): Unit = !struct.at(offsets(98)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jchar]]] = value
        inline def GetShortField: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jshort] = !struct.at(offsets(99)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jshort]]]
        inline def GetShortField_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jshort]): Unit = !struct.at(offsets(99)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jshort]]] = value
        inline def GetIntField: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jint] = !struct.at(offsets(100)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jint]]]
        inline def GetIntField_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jint]): Unit = !struct.at(offsets(100)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jint]]] = value
        inline def GetLongField: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jlong] = !struct.at(offsets(101)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jlong]]]
        inline def GetLongField_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jlong]): Unit = !struct.at(offsets(101)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jlong]]] = value
        inline def GetFloatField: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jfloat] = !struct.at(offsets(102)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jfloat]]]
        inline def GetFloatField_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jfloat]): Unit = !struct.at(offsets(102)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jfloat]]] = value
        inline def GetDoubleField: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jdouble] = !struct.at(offsets(103)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jdouble]]]
        inline def GetDoubleField_=(value: CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jdouble]): Unit = !struct.at(offsets(103)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jdouble]]] = value
        inline def SetObjectField: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jobject, Unit] = !struct.at(offsets(104)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jobject, Unit]]]
        inline def SetObjectField_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jobject, Unit]): Unit = !struct.at(offsets(104)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jobject, Unit]]] = value
        inline def SetBooleanField: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jboolean, Unit] = !struct.at(offsets(105)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jboolean, Unit]]]
        inline def SetBooleanField_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jboolean, Unit]): Unit = !struct.at(offsets(105)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jboolean, Unit]]] = value
        inline def SetByteField: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jbyte, Unit] = !struct.at(offsets(106)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jbyte, Unit]]]
        inline def SetByteField_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jbyte, Unit]): Unit = !struct.at(offsets(106)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jbyte, Unit]]] = value
        inline def SetCharField: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jchar, Unit] = !struct.at(offsets(107)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jchar, Unit]]]
        inline def SetCharField_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jchar, Unit]): Unit = !struct.at(offsets(107)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jchar, Unit]]] = value
        inline def SetShortField: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jshort, Unit] = !struct.at(offsets(108)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jshort, Unit]]]
        inline def SetShortField_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jshort, Unit]): Unit = !struct.at(offsets(108)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jshort, Unit]]] = value
        inline def SetIntField: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jint, Unit] = !struct.at(offsets(109)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jint, Unit]]]
        inline def SetIntField_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jint, Unit]): Unit = !struct.at(offsets(109)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jint, Unit]]] = value
        inline def SetLongField: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jlong, Unit] = !struct.at(offsets(110)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jlong, Unit]]]
        inline def SetLongField_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jlong, Unit]): Unit = !struct.at(offsets(110)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jlong, Unit]]] = value
        inline def SetFloatField: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jfloat, Unit] = !struct.at(offsets(111)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jfloat, Unit]]]
        inline def SetFloatField_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jfloat, Unit]): Unit = !struct.at(offsets(111)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jfloat, Unit]]] = value
        inline def SetDoubleField: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jdouble, Unit] = !struct.at(offsets(112)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jdouble, Unit]]]
        inline def SetDoubleField_=(value: CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jdouble, Unit]): Unit = !struct.at(offsets(112)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jdouble, Unit]]] = value
        inline def GetStaticMethodID: CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID] = !struct.at(offsets(113)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID]]]
        inline def GetStaticMethodID_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID]): Unit = !struct.at(offsets(113)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID]]] = value
        inline def CallStaticObjectMethod: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject] = !struct.at(offsets(114)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject]]]
        inline def CallStaticObjectMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject]): Unit = !struct.at(offsets(114)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject]]] = value
        inline def CallStaticObjectMethodV: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject] = !struct.at(offsets(115)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject]]]
        inline def CallStaticObjectMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject]): Unit = !struct.at(offsets(115)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject]]] = value
        inline def CallStaticObjectMethodA: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject] = !struct.at(offsets(116)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject]]]
        inline def CallStaticObjectMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject]): Unit = !struct.at(offsets(116)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject]]] = value
        inline def CallStaticBooleanMethod: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jboolean] = !struct.at(offsets(117)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jboolean]]]
        inline def CallStaticBooleanMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jboolean]): Unit = !struct.at(offsets(117)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jboolean]]] = value
        inline def CallStaticBooleanMethodV: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jboolean] = !struct.at(offsets(118)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jboolean]]]
        inline def CallStaticBooleanMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jboolean]): Unit = !struct.at(offsets(118)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jboolean]]] = value
        inline def CallStaticBooleanMethodA: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jboolean] = !struct.at(offsets(119)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jboolean]]]
        inline def CallStaticBooleanMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jboolean]): Unit = !struct.at(offsets(119)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jboolean]]] = value
        inline def CallStaticByteMethod: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jbyte] = !struct.at(offsets(120)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jbyte]]]
        inline def CallStaticByteMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jbyte]): Unit = !struct.at(offsets(120)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jbyte]]] = value
        inline def CallStaticByteMethodV: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jbyte] = !struct.at(offsets(121)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jbyte]]]
        inline def CallStaticByteMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jbyte]): Unit = !struct.at(offsets(121)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jbyte]]] = value
        inline def CallStaticByteMethodA: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jbyte] = !struct.at(offsets(122)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jbyte]]]
        inline def CallStaticByteMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jbyte]): Unit = !struct.at(offsets(122)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jbyte]]] = value
        inline def CallStaticCharMethod: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jchar] = !struct.at(offsets(123)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jchar]]]
        inline def CallStaticCharMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jchar]): Unit = !struct.at(offsets(123)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jchar]]] = value
        inline def CallStaticCharMethodV: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jchar] = !struct.at(offsets(124)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jchar]]]
        inline def CallStaticCharMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jchar]): Unit = !struct.at(offsets(124)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jchar]]] = value
        inline def CallStaticCharMethodA: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jchar] = !struct.at(offsets(125)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jchar]]]
        inline def CallStaticCharMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jchar]): Unit = !struct.at(offsets(125)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jchar]]] = value
        inline def CallStaticShortMethod: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jshort] = !struct.at(offsets(126)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jshort]]]
        inline def CallStaticShortMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jshort]): Unit = !struct.at(offsets(126)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jshort]]] = value
        inline def CallStaticShortMethodV: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jshort] = !struct.at(offsets(127)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jshort]]]
        inline def CallStaticShortMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jshort]): Unit = !struct.at(offsets(127)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jshort]]] = value
        inline def CallStaticShortMethodA: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jshort] = !struct.at(offsets(128)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jshort]]]
        inline def CallStaticShortMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jshort]): Unit = !struct.at(offsets(128)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jshort]]] = value
        inline def CallStaticIntMethod: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jint] = !struct.at(offsets(129)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jint]]]
        inline def CallStaticIntMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jint]): Unit = !struct.at(offsets(129)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jint]]] = value
        inline def CallStaticIntMethodV: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jint] = !struct.at(offsets(130)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jint]]]
        inline def CallStaticIntMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jint]): Unit = !struct.at(offsets(130)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jint]]] = value
        inline def CallStaticIntMethodA: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jint] = !struct.at(offsets(131)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jint]]]
        inline def CallStaticIntMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jint]): Unit = !struct.at(offsets(131)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jint]]] = value
        inline def CallStaticLongMethod: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jlong] = !struct.at(offsets(132)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jlong]]]
        inline def CallStaticLongMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jlong]): Unit = !struct.at(offsets(132)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jlong]]] = value
        inline def CallStaticLongMethodV: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jlong] = !struct.at(offsets(133)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jlong]]]
        inline def CallStaticLongMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jlong]): Unit = !struct.at(offsets(133)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jlong]]] = value
        inline def CallStaticLongMethodA: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jlong] = !struct.at(offsets(134)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jlong]]]
        inline def CallStaticLongMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jlong]): Unit = !struct.at(offsets(134)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jlong]]] = value
        inline def CallStaticFloatMethod: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jfloat] = !struct.at(offsets(135)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jfloat]]]
        inline def CallStaticFloatMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jfloat]): Unit = !struct.at(offsets(135)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jfloat]]] = value
        inline def CallStaticFloatMethodV: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jfloat] = !struct.at(offsets(136)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jfloat]]]
        inline def CallStaticFloatMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jfloat]): Unit = !struct.at(offsets(136)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jfloat]]] = value
        inline def CallStaticFloatMethodA: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jfloat] = !struct.at(offsets(137)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jfloat]]]
        inline def CallStaticFloatMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jfloat]): Unit = !struct.at(offsets(137)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jfloat]]] = value
        inline def CallStaticDoubleMethod: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jdouble] = !struct.at(offsets(138)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jdouble]]]
        inline def CallStaticDoubleMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jdouble]): Unit = !struct.at(offsets(138)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jdouble]]] = value
        inline def CallStaticDoubleMethodV: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jdouble] = !struct.at(offsets(139)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jdouble]]]
        inline def CallStaticDoubleMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jdouble]): Unit = !struct.at(offsets(139)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jdouble]]] = value
        inline def CallStaticDoubleMethodA: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jdouble] = !struct.at(offsets(140)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jdouble]]]
        inline def CallStaticDoubleMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jdouble]): Unit = !struct.at(offsets(140)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jdouble]]] = value
        inline def CallStaticVoidMethod: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, Unit] = !struct.at(offsets(141)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, Unit]]]
        inline def CallStaticVoidMethod_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, Unit]): Unit = !struct.at(offsets(141)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, Unit]]] = value
        inline def CallStaticVoidMethodV: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, Unit] = !struct.at(offsets(142)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, Unit]]]
        inline def CallStaticVoidMethodV_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, Unit]): Unit = !struct.at(offsets(142)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, Unit]]] = value
        inline def CallStaticVoidMethodA: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], Unit] = !struct.at(offsets(143)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], Unit]]]
        inline def CallStaticVoidMethodA_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], Unit]): Unit = !struct.at(offsets(143)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], Unit]]] = value
        inline def GetStaticFieldID: CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID] = !struct.at(offsets(144)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID]]]
        inline def GetStaticFieldID_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID]): Unit = !struct.at(offsets(144)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID]]] = value
        inline def GetStaticObjectField: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jobject] = !struct.at(offsets(145)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jobject]]]
        inline def GetStaticObjectField_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jobject]): Unit = !struct.at(offsets(145)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jobject]]] = value
        inline def GetStaticBooleanField: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jboolean] = !struct.at(offsets(146)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jboolean]]]
        inline def GetStaticBooleanField_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jboolean]): Unit = !struct.at(offsets(146)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jboolean]]] = value
        inline def GetStaticByteField: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jbyte] = !struct.at(offsets(147)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jbyte]]]
        inline def GetStaticByteField_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jbyte]): Unit = !struct.at(offsets(147)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jbyte]]] = value
        inline def GetStaticCharField: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jchar] = !struct.at(offsets(148)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jchar]]]
        inline def GetStaticCharField_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jchar]): Unit = !struct.at(offsets(148)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jchar]]] = value
        inline def GetStaticShortField: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jshort] = !struct.at(offsets(149)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jshort]]]
        inline def GetStaticShortField_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jshort]): Unit = !struct.at(offsets(149)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jshort]]] = value
        inline def GetStaticIntField: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jint] = !struct.at(offsets(150)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jint]]]
        inline def GetStaticIntField_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jint]): Unit = !struct.at(offsets(150)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jint]]] = value
        inline def GetStaticLongField: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jlong] = !struct.at(offsets(151)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jlong]]]
        inline def GetStaticLongField_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jlong]): Unit = !struct.at(offsets(151)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jlong]]] = value
        inline def GetStaticFloatField: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jfloat] = !struct.at(offsets(152)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jfloat]]]
        inline def GetStaticFloatField_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jfloat]): Unit = !struct.at(offsets(152)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jfloat]]] = value
        inline def GetStaticDoubleField: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jdouble] = !struct.at(offsets(153)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jdouble]]]
        inline def GetStaticDoubleField_=(value: CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jdouble]): Unit = !struct.at(offsets(153)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jdouble]]] = value
        inline def SetStaticObjectField: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jobject, Unit] = !struct.at(offsets(154)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jobject, Unit]]]
        inline def SetStaticObjectField_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jobject, Unit]): Unit = !struct.at(offsets(154)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jobject, Unit]]] = value
        inline def SetStaticBooleanField: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, Unit] = !struct.at(offsets(155)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, Unit]]]
        inline def SetStaticBooleanField_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, Unit]): Unit = !struct.at(offsets(155)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, Unit]]] = value
        inline def SetStaticByteField: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jbyte, Unit] = !struct.at(offsets(156)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jbyte, Unit]]]
        inline def SetStaticByteField_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jbyte, Unit]): Unit = !struct.at(offsets(156)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jbyte, Unit]]] = value
        inline def SetStaticCharField: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jchar, Unit] = !struct.at(offsets(157)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jchar, Unit]]]
        inline def SetStaticCharField_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jchar, Unit]): Unit = !struct.at(offsets(157)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jchar, Unit]]] = value
        inline def SetStaticShortField: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jshort, Unit] = !struct.at(offsets(158)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jshort, Unit]]]
        inline def SetStaticShortField_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jshort, Unit]): Unit = !struct.at(offsets(158)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jshort, Unit]]] = value
        inline def SetStaticIntField: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jint, Unit] = !struct.at(offsets(159)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jint, Unit]]]
        inline def SetStaticIntField_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jint, Unit]): Unit = !struct.at(offsets(159)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jint, Unit]]] = value
        inline def SetStaticLongField: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jlong, Unit] = !struct.at(offsets(160)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jlong, Unit]]]
        inline def SetStaticLongField_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jlong, Unit]): Unit = !struct.at(offsets(160)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jlong, Unit]]] = value
        inline def SetStaticFloatField: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jfloat, Unit] = !struct.at(offsets(161)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jfloat, Unit]]]
        inline def SetStaticFloatField_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jfloat, Unit]): Unit = !struct.at(offsets(161)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jfloat, Unit]]] = value
        inline def SetStaticDoubleField: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jdouble, Unit] = !struct.at(offsets(162)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jdouble, Unit]]]
        inline def SetStaticDoubleField_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jdouble, Unit]): Unit = !struct.at(offsets(162)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jdouble, Unit]]] = value
        inline def NewString: CFuncPtr3[Ptr[JNIEnv], Ptr[jchar], jsize, jstring] = !struct.at(offsets(163)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], Ptr[jchar], jsize, jstring]]]
        inline def NewString_=(value: CFuncPtr3[Ptr[JNIEnv], Ptr[jchar], jsize, jstring]): Unit = !struct.at(offsets(163)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], Ptr[jchar], jsize, jstring]]] = value
        inline def GetStringLength: CFuncPtr2[Ptr[JNIEnv], jstring, jsize] = !struct.at(offsets(164)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jstring, jsize]]]
        inline def GetStringLength_=(value: CFuncPtr2[Ptr[JNIEnv], jstring, jsize]): Unit = !struct.at(offsets(164)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jstring, jsize]]] = value
        inline def GetStringChars: CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]] = !struct.at(offsets(165)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]]]]
        inline def GetStringChars_=(value: CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]]): Unit = !struct.at(offsets(165)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]]]] = value
        inline def ReleaseStringChars: CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit] = !struct.at(offsets(166)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit]]]
        inline def ReleaseStringChars_=(value: CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit]): Unit = !struct.at(offsets(166)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit]]] = value
        inline def NewStringUTF: CFuncPtr2[Ptr[JNIEnv], CString, jstring] = !struct.at(offsets(167)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], CString, jstring]]]
        inline def NewStringUTF_=(value: CFuncPtr2[Ptr[JNIEnv], CString, jstring]): Unit = !struct.at(offsets(167)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], CString, jstring]]] = value
        inline def GetStringUTFLength: CFuncPtr2[Ptr[JNIEnv], jstring, jsize] = !struct.at(offsets(168)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jstring, jsize]]]
        inline def GetStringUTFLength_=(value: CFuncPtr2[Ptr[JNIEnv], jstring, jsize]): Unit = !struct.at(offsets(168)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jstring, jsize]]] = value
        inline def GetStringUTFChars: CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], CString] = !struct.at(offsets(169)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], CString]]]
        inline def GetStringUTFChars_=(value: CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], CString]): Unit = !struct.at(offsets(169)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], CString]]] = value
        inline def ReleaseStringUTFChars: CFuncPtr3[Ptr[JNIEnv], jstring, CString, Unit] = !struct.at(offsets(170)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, CString, Unit]]]
        inline def ReleaseStringUTFChars_=(value: CFuncPtr3[Ptr[JNIEnv], jstring, CString, Unit]): Unit = !struct.at(offsets(170)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, CString, Unit]]] = value
        inline def GetArrayLength: CFuncPtr2[Ptr[JNIEnv], jarray, jsize] = !struct.at(offsets(171)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jarray, jsize]]]
        inline def GetArrayLength_=(value: CFuncPtr2[Ptr[JNIEnv], jarray, jsize]): Unit = !struct.at(offsets(171)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jarray, jsize]]] = value
        inline def NewObjectArray: CFuncPtr4[Ptr[JNIEnv], jsize, jclass, jobject, jobjectArray] = !struct.at(offsets(172)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jsize, jclass, jobject, jobjectArray]]]
        inline def NewObjectArray_=(value: CFuncPtr4[Ptr[JNIEnv], jsize, jclass, jobject, jobjectArray]): Unit = !struct.at(offsets(172)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jsize, jclass, jobject, jobjectArray]]] = value
        inline def GetObjectArrayElement: CFuncPtr3[Ptr[JNIEnv], jobjectArray, jsize, jobject] = !struct.at(offsets(173)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobjectArray, jsize, jobject]]]
        inline def GetObjectArrayElement_=(value: CFuncPtr3[Ptr[JNIEnv], jobjectArray, jsize, jobject]): Unit = !struct.at(offsets(173)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jobjectArray, jsize, jobject]]] = value
        inline def SetObjectArrayElement: CFuncPtr4[Ptr[JNIEnv], jobjectArray, jsize, jobject, Unit] = !struct.at(offsets(174)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobjectArray, jsize, jobject, Unit]]]
        inline def SetObjectArrayElement_=(value: CFuncPtr4[Ptr[JNIEnv], jobjectArray, jsize, jobject, Unit]): Unit = !struct.at(offsets(174)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jobjectArray, jsize, jobject, Unit]]] = value
        inline def NewBooleanArray: CFuncPtr2[Ptr[JNIEnv], jsize, jbooleanArray] = !struct.at(offsets(175)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jbooleanArray]]]
        inline def NewBooleanArray_=(value: CFuncPtr2[Ptr[JNIEnv], jsize, jbooleanArray]): Unit = !struct.at(offsets(175)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jbooleanArray]]] = value
        inline def NewByteArray: CFuncPtr2[Ptr[JNIEnv], jsize, jbyteArray] = !struct.at(offsets(176)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jbyteArray]]]
        inline def NewByteArray_=(value: CFuncPtr2[Ptr[JNIEnv], jsize, jbyteArray]): Unit = !struct.at(offsets(176)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jbyteArray]]] = value
        inline def NewCharArray: CFuncPtr2[Ptr[JNIEnv], jsize, jcharArray] = !struct.at(offsets(177)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jcharArray]]]
        inline def NewCharArray_=(value: CFuncPtr2[Ptr[JNIEnv], jsize, jcharArray]): Unit = !struct.at(offsets(177)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jcharArray]]] = value
        inline def NewShortArray: CFuncPtr2[Ptr[JNIEnv], jsize, jshortArray] = !struct.at(offsets(178)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jshortArray]]]
        inline def NewShortArray_=(value: CFuncPtr2[Ptr[JNIEnv], jsize, jshortArray]): Unit = !struct.at(offsets(178)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jshortArray]]] = value
        inline def NewIntArray: CFuncPtr2[Ptr[JNIEnv], jsize, jintArray] = !struct.at(offsets(179)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jintArray]]]
        inline def NewIntArray_=(value: CFuncPtr2[Ptr[JNIEnv], jsize, jintArray]): Unit = !struct.at(offsets(179)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jintArray]]] = value
        inline def NewLongArray: CFuncPtr2[Ptr[JNIEnv], jsize, jlongArray] = !struct.at(offsets(180)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jlongArray]]]
        inline def NewLongArray_=(value: CFuncPtr2[Ptr[JNIEnv], jsize, jlongArray]): Unit = !struct.at(offsets(180)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jlongArray]]] = value
        inline def NewFloatArray: CFuncPtr2[Ptr[JNIEnv], jsize, jfloatArray] = !struct.at(offsets(181)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jfloatArray]]]
        inline def NewFloatArray_=(value: CFuncPtr2[Ptr[JNIEnv], jsize, jfloatArray]): Unit = !struct.at(offsets(181)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jfloatArray]]] = value
        inline def NewDoubleArray: CFuncPtr2[Ptr[JNIEnv], jsize, jdoubleArray] = !struct.at(offsets(182)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jdoubleArray]]]
        inline def NewDoubleArray_=(value: CFuncPtr2[Ptr[JNIEnv], jsize, jdoubleArray]): Unit = !struct.at(offsets(182)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jsize, jdoubleArray]]] = value
        inline def GetBooleanArrayElements: CFuncPtr3[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], Ptr[jboolean]] = !struct.at(offsets(183)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], Ptr[jboolean]]]]
        inline def GetBooleanArrayElements_=(value: CFuncPtr3[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], Ptr[jboolean]]): Unit = !struct.at(offsets(183)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], Ptr[jboolean]]]] = value
        inline def GetByteArrayElements: CFuncPtr3[Ptr[JNIEnv], jbyteArray, Ptr[jboolean], Ptr[jbyte]] = !struct.at(offsets(184)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jbyteArray, Ptr[jboolean], Ptr[jbyte]]]]
        inline def GetByteArrayElements_=(value: CFuncPtr3[Ptr[JNIEnv], jbyteArray, Ptr[jboolean], Ptr[jbyte]]): Unit = !struct.at(offsets(184)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jbyteArray, Ptr[jboolean], Ptr[jbyte]]]] = value
        inline def GetCharArrayElements: CFuncPtr3[Ptr[JNIEnv], jcharArray, Ptr[jboolean], Ptr[jchar]] = !struct.at(offsets(185)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jcharArray, Ptr[jboolean], Ptr[jchar]]]]
        inline def GetCharArrayElements_=(value: CFuncPtr3[Ptr[JNIEnv], jcharArray, Ptr[jboolean], Ptr[jchar]]): Unit = !struct.at(offsets(185)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jcharArray, Ptr[jboolean], Ptr[jchar]]]] = value
        inline def GetShortArrayElements: CFuncPtr3[Ptr[JNIEnv], jshortArray, Ptr[jboolean], Ptr[jshort]] = !struct.at(offsets(186)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jshortArray, Ptr[jboolean], Ptr[jshort]]]]
        inline def GetShortArrayElements_=(value: CFuncPtr3[Ptr[JNIEnv], jshortArray, Ptr[jboolean], Ptr[jshort]]): Unit = !struct.at(offsets(186)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jshortArray, Ptr[jboolean], Ptr[jshort]]]] = value
        inline def GetIntArrayElements: CFuncPtr3[Ptr[JNIEnv], jintArray, Ptr[jboolean], Ptr[jint]] = !struct.at(offsets(187)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jintArray, Ptr[jboolean], Ptr[jint]]]]
        inline def GetIntArrayElements_=(value: CFuncPtr3[Ptr[JNIEnv], jintArray, Ptr[jboolean], Ptr[jint]]): Unit = !struct.at(offsets(187)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jintArray, Ptr[jboolean], Ptr[jint]]]] = value
        inline def GetLongArrayElements: CFuncPtr3[Ptr[JNIEnv], jlongArray, Ptr[jboolean], Ptr[jlong]] = !struct.at(offsets(188)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jlongArray, Ptr[jboolean], Ptr[jlong]]]]
        inline def GetLongArrayElements_=(value: CFuncPtr3[Ptr[JNIEnv], jlongArray, Ptr[jboolean], Ptr[jlong]]): Unit = !struct.at(offsets(188)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jlongArray, Ptr[jboolean], Ptr[jlong]]]] = value
        inline def GetFloatArrayElements: CFuncPtr3[Ptr[JNIEnv], jfloatArray, Ptr[jboolean], Ptr[jfloat]] = !struct.at(offsets(189)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jfloatArray, Ptr[jboolean], Ptr[jfloat]]]]
        inline def GetFloatArrayElements_=(value: CFuncPtr3[Ptr[JNIEnv], jfloatArray, Ptr[jboolean], Ptr[jfloat]]): Unit = !struct.at(offsets(189)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jfloatArray, Ptr[jboolean], Ptr[jfloat]]]] = value
        inline def GetDoubleArrayElements: CFuncPtr3[Ptr[JNIEnv], jdoubleArray, Ptr[jboolean], Ptr[jdouble]] = !struct.at(offsets(190)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jdoubleArray, Ptr[jboolean], Ptr[jdouble]]]]
        inline def GetDoubleArrayElements_=(value: CFuncPtr3[Ptr[JNIEnv], jdoubleArray, Ptr[jboolean], Ptr[jdouble]]): Unit = !struct.at(offsets(190)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jdoubleArray, Ptr[jboolean], Ptr[jdouble]]]] = value
        inline def ReleaseBooleanArrayElements: CFuncPtr4[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], jint, Unit] = !struct.at(offsets(191)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], jint, Unit]]]
        inline def ReleaseBooleanArrayElements_=(value: CFuncPtr4[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], jint, Unit]): Unit = !struct.at(offsets(191)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], jint, Unit]]] = value
        inline def ReleaseByteArrayElements: CFuncPtr4[Ptr[JNIEnv], jbyteArray, Ptr[jbyte], jint, Unit] = !struct.at(offsets(192)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jbyteArray, Ptr[jbyte], jint, Unit]]]
        inline def ReleaseByteArrayElements_=(value: CFuncPtr4[Ptr[JNIEnv], jbyteArray, Ptr[jbyte], jint, Unit]): Unit = !struct.at(offsets(192)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jbyteArray, Ptr[jbyte], jint, Unit]]] = value
        inline def ReleaseCharArrayElements: CFuncPtr4[Ptr[JNIEnv], jcharArray, Ptr[jchar], jint, Unit] = !struct.at(offsets(193)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jcharArray, Ptr[jchar], jint, Unit]]]
        inline def ReleaseCharArrayElements_=(value: CFuncPtr4[Ptr[JNIEnv], jcharArray, Ptr[jchar], jint, Unit]): Unit = !struct.at(offsets(193)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jcharArray, Ptr[jchar], jint, Unit]]] = value
        inline def ReleaseShortArrayElements: CFuncPtr4[Ptr[JNIEnv], jshortArray, Ptr[jshort], jint, Unit] = !struct.at(offsets(194)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jshortArray, Ptr[jshort], jint, Unit]]]
        inline def ReleaseShortArrayElements_=(value: CFuncPtr4[Ptr[JNIEnv], jshortArray, Ptr[jshort], jint, Unit]): Unit = !struct.at(offsets(194)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jshortArray, Ptr[jshort], jint, Unit]]] = value
        inline def ReleaseIntArrayElements: CFuncPtr4[Ptr[JNIEnv], jintArray, Ptr[jint], jint, Unit] = !struct.at(offsets(195)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jintArray, Ptr[jint], jint, Unit]]]
        inline def ReleaseIntArrayElements_=(value: CFuncPtr4[Ptr[JNIEnv], jintArray, Ptr[jint], jint, Unit]): Unit = !struct.at(offsets(195)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jintArray, Ptr[jint], jint, Unit]]] = value
        inline def ReleaseLongArrayElements: CFuncPtr4[Ptr[JNIEnv], jlongArray, Ptr[jlong], jint, Unit] = !struct.at(offsets(196)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jlongArray, Ptr[jlong], jint, Unit]]]
        inline def ReleaseLongArrayElements_=(value: CFuncPtr4[Ptr[JNIEnv], jlongArray, Ptr[jlong], jint, Unit]): Unit = !struct.at(offsets(196)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jlongArray, Ptr[jlong], jint, Unit]]] = value
        inline def ReleaseFloatArrayElements: CFuncPtr4[Ptr[JNIEnv], jfloatArray, Ptr[jfloat], jint, Unit] = !struct.at(offsets(197)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jfloatArray, Ptr[jfloat], jint, Unit]]]
        inline def ReleaseFloatArrayElements_=(value: CFuncPtr4[Ptr[JNIEnv], jfloatArray, Ptr[jfloat], jint, Unit]): Unit = !struct.at(offsets(197)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jfloatArray, Ptr[jfloat], jint, Unit]]] = value
        inline def ReleaseDoubleArrayElements: CFuncPtr4[Ptr[JNIEnv], jdoubleArray, Ptr[jdouble], jint, Unit] = !struct.at(offsets(198)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jdoubleArray, Ptr[jdouble], jint, Unit]]]
        inline def ReleaseDoubleArrayElements_=(value: CFuncPtr4[Ptr[JNIEnv], jdoubleArray, Ptr[jdouble], jint, Unit]): Unit = !struct.at(offsets(198)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jdoubleArray, Ptr[jdouble], jint, Unit]]] = value
        inline def GetBooleanArrayRegion: CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit] = !struct.at(offsets(199)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit]]]
        inline def GetBooleanArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit]): Unit = !struct.at(offsets(199)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit]]] = value
        inline def GetByteArrayRegion: CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit] = !struct.at(offsets(200)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit]]]
        inline def GetByteArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit]): Unit = !struct.at(offsets(200)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit]]] = value
        inline def GetCharArrayRegion: CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit] = !struct.at(offsets(201)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit]]]
        inline def GetCharArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit]): Unit = !struct.at(offsets(201)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit]]] = value
        inline def GetShortArrayRegion: CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit] = !struct.at(offsets(202)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit]]]
        inline def GetShortArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit]): Unit = !struct.at(offsets(202)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit]]] = value
        inline def GetIntArrayRegion: CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit] = !struct.at(offsets(203)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit]]]
        inline def GetIntArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit]): Unit = !struct.at(offsets(203)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit]]] = value
        inline def GetLongArrayRegion: CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit] = !struct.at(offsets(204)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit]]]
        inline def GetLongArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit]): Unit = !struct.at(offsets(204)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit]]] = value
        inline def GetFloatArrayRegion: CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit] = !struct.at(offsets(205)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit]]]
        inline def GetFloatArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit]): Unit = !struct.at(offsets(205)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit]]] = value
        inline def GetDoubleArrayRegion: CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit] = !struct.at(offsets(206)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit]]]
        inline def GetDoubleArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit]): Unit = !struct.at(offsets(206)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit]]] = value
        inline def SetBooleanArrayRegion: CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit] = !struct.at(offsets(207)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit]]]
        inline def SetBooleanArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit]): Unit = !struct.at(offsets(207)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit]]] = value
        inline def SetByteArrayRegion: CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit] = !struct.at(offsets(208)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit]]]
        inline def SetByteArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit]): Unit = !struct.at(offsets(208)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit]]] = value
        inline def SetCharArrayRegion: CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit] = !struct.at(offsets(209)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit]]]
        inline def SetCharArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit]): Unit = !struct.at(offsets(209)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit]]] = value
        inline def SetShortArrayRegion: CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit] = !struct.at(offsets(210)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit]]]
        inline def SetShortArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit]): Unit = !struct.at(offsets(210)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit]]] = value
        inline def SetIntArrayRegion: CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit] = !struct.at(offsets(211)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit]]]
        inline def SetIntArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit]): Unit = !struct.at(offsets(211)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit]]] = value
        inline def SetLongArrayRegion: CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit] = !struct.at(offsets(212)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit]]]
        inline def SetLongArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit]): Unit = !struct.at(offsets(212)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit]]] = value
        inline def SetFloatArrayRegion: CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit] = !struct.at(offsets(213)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit]]]
        inline def SetFloatArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit]): Unit = !struct.at(offsets(213)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit]]] = value
        inline def SetDoubleArrayRegion: CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit] = !struct.at(offsets(214)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit]]]
        inline def SetDoubleArrayRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit]): Unit = !struct.at(offsets(214)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit]]] = value
        inline def RegisterNatives: CFuncPtr4[Ptr[JNIEnv], jclass, Ptr[JNINativeMethod], jint, jint] = !struct.at(offsets(215)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, Ptr[JNINativeMethod], jint, jint]]]
        inline def RegisterNatives_=(value: CFuncPtr4[Ptr[JNIEnv], jclass, Ptr[JNINativeMethod], jint, jint]): Unit = !struct.at(offsets(215)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jclass, Ptr[JNINativeMethod], jint, jint]]] = value
        inline def UnregisterNatives: CFuncPtr2[Ptr[JNIEnv], jclass, jint] = !struct.at(offsets(216)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jclass, jint]]]
        inline def UnregisterNatives_=(value: CFuncPtr2[Ptr[JNIEnv], jclass, jint]): Unit = !struct.at(offsets(216)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jclass, jint]]] = value
        inline def MonitorEnter: CFuncPtr2[Ptr[JNIEnv], jobject, jint] = !struct.at(offsets(217)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jint]]]
        inline def MonitorEnter_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jint]): Unit = !struct.at(offsets(217)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jint]]] = value
        inline def MonitorExit: CFuncPtr2[Ptr[JNIEnv], jobject, jint] = !struct.at(offsets(218)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jint]]]
        inline def MonitorExit_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jint]): Unit = !struct.at(offsets(218)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jint]]] = value
        inline def GetJavaVM: CFuncPtr2[Ptr[JNIEnv], Ptr[Ptr[JavaVM]], jint] = !struct.at(offsets(219)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], Ptr[Ptr[JavaVM]], jint]]]
        inline def GetJavaVM_=(value: CFuncPtr2[Ptr[JNIEnv], Ptr[Ptr[JavaVM]], jint]): Unit = !struct.at(offsets(219)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], Ptr[Ptr[JavaVM]], jint]]] = value
        inline def GetStringRegion: CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, Ptr[jchar], Unit] = !struct.at(offsets(220)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, Ptr[jchar], Unit]]]
        inline def GetStringRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, Ptr[jchar], Unit]): Unit = !struct.at(offsets(220)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, Ptr[jchar], Unit]]] = value
        inline def GetStringUTFRegion: CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, CString, Unit] = !struct.at(offsets(221)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, CString, Unit]]]
        inline def GetStringUTFRegion_=(value: CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, CString, Unit]): Unit = !struct.at(offsets(221)).asInstanceOf[Ptr[CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, CString, Unit]]] = value
        inline def GetPrimitiveArrayCritical: CFuncPtr3[Ptr[JNIEnv], jarray, Ptr[jboolean], Ptr[Byte]] = !struct.at(offsets(222)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jarray, Ptr[jboolean], Ptr[Byte]]]]
        inline def GetPrimitiveArrayCritical_=(value: CFuncPtr3[Ptr[JNIEnv], jarray, Ptr[jboolean], Ptr[Byte]]): Unit = !struct.at(offsets(222)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jarray, Ptr[jboolean], Ptr[Byte]]]] = value
        inline def ReleasePrimitiveArrayCritical: CFuncPtr4[Ptr[JNIEnv], jarray, Ptr[Byte], jint, Unit] = !struct.at(offsets(223)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jarray, Ptr[Byte], jint, Unit]]]
        inline def ReleasePrimitiveArrayCritical_=(value: CFuncPtr4[Ptr[JNIEnv], jarray, Ptr[Byte], jint, Unit]): Unit = !struct.at(offsets(223)).asInstanceOf[Ptr[CFuncPtr4[Ptr[JNIEnv], jarray, Ptr[Byte], jint, Unit]]] = value
        inline def GetStringCritical: CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]] = !struct.at(offsets(224)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]]]]
        inline def GetStringCritical_=(value: CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]]): Unit = !struct.at(offsets(224)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]]]] = value
        inline def ReleaseStringCritical: CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit] = !struct.at(offsets(225)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit]]]
        inline def ReleaseStringCritical_=(value: CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit]): Unit = !struct.at(offsets(225)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit]]] = value
        inline def NewWeakGlobalRef: CFuncPtr2[Ptr[JNIEnv], jobject, jweak] = !struct.at(offsets(226)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jweak]]]
        inline def NewWeakGlobalRef_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jweak]): Unit = !struct.at(offsets(226)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jweak]]] = value
        inline def DeleteWeakGlobalRef: CFuncPtr2[Ptr[JNIEnv], jweak, Unit] = !struct.at(offsets(227)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jweak, Unit]]]
        inline def DeleteWeakGlobalRef_=(value: CFuncPtr2[Ptr[JNIEnv], jweak, Unit]): Unit = !struct.at(offsets(227)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jweak, Unit]]] = value
        inline def ExceptionCheck: CFuncPtr1[Ptr[JNIEnv], jboolean] = !struct.at(offsets(228)).asInstanceOf[Ptr[CFuncPtr1[Ptr[JNIEnv], jboolean]]]
        inline def ExceptionCheck_=(value: CFuncPtr1[Ptr[JNIEnv], jboolean]): Unit = !struct.at(offsets(228)).asInstanceOf[Ptr[CFuncPtr1[Ptr[JNIEnv], jboolean]]] = value
        inline def NewDirectByteBuffer: CFuncPtr3[Ptr[JNIEnv], Ptr[Byte], jlong, jobject] = !struct.at(offsets(229)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], Ptr[Byte], jlong, jobject]]]
        inline def NewDirectByteBuffer_=(value: CFuncPtr3[Ptr[JNIEnv], Ptr[Byte], jlong, jobject]): Unit = !struct.at(offsets(229)).asInstanceOf[Ptr[CFuncPtr3[Ptr[JNIEnv], Ptr[Byte], jlong, jobject]]] = value
        inline def GetDirectBufferAddress: CFuncPtr2[Ptr[JNIEnv], jobject, Ptr[Byte]] = !struct.at(offsets(230)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, Ptr[Byte]]]]
        inline def GetDirectBufferAddress_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, Ptr[Byte]]): Unit = !struct.at(offsets(230)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, Ptr[Byte]]]] = value
        inline def GetDirectBufferCapacity: CFuncPtr2[Ptr[JNIEnv], jobject, jlong] = !struct.at(offsets(231)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jlong]]]
        inline def GetDirectBufferCapacity_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jlong]): Unit = !struct.at(offsets(231)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jlong]]] = value
        inline def GetObjectRefType: CFuncPtr2[Ptr[JNIEnv], jobject, jobjectRefType] = !struct.at(offsets(232)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jobjectRefType]]]
        inline def GetObjectRefType_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jobjectRefType]): Unit = !struct.at(offsets(232)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jobjectRefType]]] = value
        inline def GetModule: CFuncPtr2[Ptr[JNIEnv], jclass, jobject] = !struct.at(offsets(233)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jclass, jobject]]]
        inline def GetModule_=(value: CFuncPtr2[Ptr[JNIEnv], jclass, jobject]): Unit = !struct.at(offsets(233)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jclass, jobject]]] = value
        inline def IsVirtualThread: CFuncPtr2[Ptr[JNIEnv], jobject, jboolean] = !struct.at(offsets(234)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jboolean]]]
        inline def IsVirtualThread_=(value: CFuncPtr2[Ptr[JNIEnv], jobject, jboolean]): Unit = !struct.at(offsets(234)).asInstanceOf[Ptr[CFuncPtr2[Ptr[JNIEnv], jobject, jboolean]]] = value
      end extension
    
    // Allocates JNINativeInterface_ on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[JNINativeInterface_] = scala.scalanative.unsafe.alloc[JNINativeInterface_](1)
    
    val offsets: Array[Int] =
      val res = Array.ofDim[Int](235)
      def align(offset: Int, alignment: Int) = {
        val alignmentMask = alignment - 1
        val padding =
          if ((offset & alignmentMask) == 0) 0
          else alignment - (offset & alignmentMask)
        offset + padding
      }
      
      res(0) = align(0, alignmentof[Ptr[Byte]].toInt)
      res(1) = align(res(0) + sizeof[Ptr[Byte]].toInt, alignmentof[Ptr[Byte]].toInt)
      res(2) = align(res(1) + sizeof[Ptr[Byte]].toInt, alignmentof[Ptr[Byte]].toInt)
      res(3) = align(res(2) + sizeof[Ptr[Byte]].toInt, alignmentof[Ptr[Byte]].toInt)
      res(4) = align(res(3) + sizeof[Ptr[Byte]].toInt, alignmentof[CFuncPtr1[Ptr[JNIEnv], jint]].toInt)
      res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[JNIEnv], jint]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], CString, jobject, Ptr[jbyte], jsize, jclass]].toInt)
      res(6) = align(res(5) + sizeof[CFuncPtr5[Ptr[JNIEnv], CString, jobject, Ptr[jbyte], jsize, jclass]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], CString, jclass]].toInt)
      res(7) = align(res(6) + sizeof[CFuncPtr2[Ptr[JNIEnv], CString, jclass]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jmethodID]].toInt)
      res(8) = align(res(7) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, jmethodID]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jfieldID]].toInt)
      res(9) = align(res(8) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, jfieldID]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, jboolean, jobject]].toInt)
      res(10) = align(res(9) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, jboolean, jobject]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jclass, jclass]].toInt)
      res(11) = align(res(10) + sizeof[CFuncPtr2[Ptr[JNIEnv], jclass, jclass]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jclass, jboolean]].toInt)
      res(12) = align(res(11) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jclass, jboolean]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, jobject]].toInt)
      res(13) = align(res(12) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, jobject]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jthrowable, jint]].toInt)
      res(14) = align(res(13) + sizeof[CFuncPtr2[Ptr[JNIEnv], jthrowable, jint]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, CString, jint]].toInt)
      res(15) = align(res(14) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, CString, jint]].toInt, alignmentof[CFuncPtr1[Ptr[JNIEnv], jthrowable]].toInt)
      res(16) = align(res(15) + sizeof[CFuncPtr1[Ptr[JNIEnv], jthrowable]].toInt, alignmentof[CFuncPtr1[Ptr[JNIEnv], Unit]].toInt)
      res(17) = align(res(16) + sizeof[CFuncPtr1[Ptr[JNIEnv], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[JNIEnv], Unit]].toInt)
      res(18) = align(res(17) + sizeof[CFuncPtr1[Ptr[JNIEnv], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], CString, Unit]].toInt)
      res(19) = align(res(18) + sizeof[CFuncPtr2[Ptr[JNIEnv], CString, Unit]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jint, jint]].toInt)
      res(20) = align(res(19) + sizeof[CFuncPtr2[Ptr[JNIEnv], jint, jint]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]].toInt)
      res(21) = align(res(20) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]].toInt)
      res(22) = align(res(21) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, Unit]].toInt)
      res(23) = align(res(22) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, Unit]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, Unit]].toInt)
      res(24) = align(res(23) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jobject, jboolean]].toInt)
      res(25) = align(res(24) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jobject, jboolean]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]].toInt)
      res(26) = align(res(25) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, jobject]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jint, jint]].toInt)
      res(27) = align(res(26) + sizeof[CFuncPtr2[Ptr[JNIEnv], jint, jint]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jclass, jobject]].toInt)
      res(28) = align(res(27) + sizeof[CFuncPtr2[Ptr[JNIEnv], jclass, jobject]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject]].toInt)
      res(29) = align(res(28) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject]].toInt)
      res(30) = align(res(29) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject]].toInt)
      res(31) = align(res(30) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jclass]].toInt)
      res(32) = align(res(31) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, jclass]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jclass, jboolean]].toInt)
      res(33) = align(res(32) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jclass, jboolean]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID]].toInt)
      res(34) = align(res(33) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jobject]].toInt)
      res(35) = align(res(34) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jobject]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jobject]].toInt)
      res(36) = align(res(35) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jobject]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jobject]].toInt)
      res(37) = align(res(36) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jobject]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jboolean]].toInt)
      res(38) = align(res(37) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jboolean]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jboolean]].toInt)
      res(39) = align(res(38) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jboolean]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jboolean]].toInt)
      res(40) = align(res(39) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jboolean]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jbyte]].toInt)
      res(41) = align(res(40) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jbyte]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jbyte]].toInt)
      res(42) = align(res(41) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jbyte]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jbyte]].toInt)
      res(43) = align(res(42) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jbyte]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jchar]].toInt)
      res(44) = align(res(43) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jchar]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jchar]].toInt)
      res(45) = align(res(44) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jchar]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jchar]].toInt)
      res(46) = align(res(45) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jchar]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jshort]].toInt)
      res(47) = align(res(46) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jshort]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jshort]].toInt)
      res(48) = align(res(47) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jshort]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jshort]].toInt)
      res(49) = align(res(48) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jshort]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jint]].toInt)
      res(50) = align(res(49) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jint]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jint]].toInt)
      res(51) = align(res(50) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jint]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jint]].toInt)
      res(52) = align(res(51) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jint]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jlong]].toInt)
      res(53) = align(res(52) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jlong]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jlong]].toInt)
      res(54) = align(res(53) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jlong]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jlong]].toInt)
      res(55) = align(res(54) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jlong]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jfloat]].toInt)
      res(56) = align(res(55) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jfloat]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jfloat]].toInt)
      res(57) = align(res(56) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jfloat]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jfloat]].toInt)
      res(58) = align(res(57) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jfloat]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jdouble]].toInt)
      res(59) = align(res(58) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, jdouble]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jdouble]].toInt)
      res(60) = align(res(59) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, jdouble]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jdouble]].toInt)
      res(61) = align(res(60) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], jdouble]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, Unit]].toInt)
      res(62) = align(res(61) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jmethodID, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, Unit]].toInt)
      res(63) = align(res(62) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, va_list, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], Unit]].toInt)
      res(64) = align(res(63) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jmethodID, Ptr[jvalue], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jobject]].toInt)
      res(65) = align(res(64) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jobject]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jobject]].toInt)
      res(66) = align(res(65) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jobject]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jobject]].toInt)
      res(67) = align(res(66) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jobject]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jboolean]].toInt)
      res(68) = align(res(67) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jboolean]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jboolean]].toInt)
      res(69) = align(res(68) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jboolean]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jboolean]].toInt)
      res(70) = align(res(69) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jboolean]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jbyte]].toInt)
      res(71) = align(res(70) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jbyte]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jbyte]].toInt)
      res(72) = align(res(71) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jbyte]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jbyte]].toInt)
      res(73) = align(res(72) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jbyte]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jchar]].toInt)
      res(74) = align(res(73) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jchar]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jchar]].toInt)
      res(75) = align(res(74) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jchar]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jchar]].toInt)
      res(76) = align(res(75) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jchar]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jshort]].toInt)
      res(77) = align(res(76) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jshort]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jshort]].toInt)
      res(78) = align(res(77) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jshort]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jshort]].toInt)
      res(79) = align(res(78) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jshort]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jint]].toInt)
      res(80) = align(res(79) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jint]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jint]].toInt)
      res(81) = align(res(80) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jint]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jint]].toInt)
      res(82) = align(res(81) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jint]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jlong]].toInt)
      res(83) = align(res(82) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jlong]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jlong]].toInt)
      res(84) = align(res(83) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jlong]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jlong]].toInt)
      res(85) = align(res(84) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jlong]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jfloat]].toInt)
      res(86) = align(res(85) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jfloat]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jfloat]].toInt)
      res(87) = align(res(86) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jfloat]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jfloat]].toInt)
      res(88) = align(res(87) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jfloat]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jdouble]].toInt)
      res(89) = align(res(88) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, jdouble]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jdouble]].toInt)
      res(90) = align(res(89) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, jdouble]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jdouble]].toInt)
      res(91) = align(res(90) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], jdouble]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, Unit]].toInt)
      res(92) = align(res(91) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jclass, jmethodID, Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, Unit]].toInt)
      res(93) = align(res(92) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, va_list, Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], Unit]].toInt)
      res(94) = align(res(93) + sizeof[CFuncPtr5[Ptr[JNIEnv], jobject, jclass, jmethodID, Ptr[jvalue], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID]].toInt)
      res(95) = align(res(94) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jobject]].toInt)
      res(96) = align(res(95) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jobject]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jboolean]].toInt)
      res(97) = align(res(96) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jboolean]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jbyte]].toInt)
      res(98) = align(res(97) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jbyte]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jchar]].toInt)
      res(99) = align(res(98) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jchar]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jshort]].toInt)
      res(100) = align(res(99) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jshort]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jint]].toInt)
      res(101) = align(res(100) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jint]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jlong]].toInt)
      res(102) = align(res(101) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jlong]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jfloat]].toInt)
      res(103) = align(res(102) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jfloat]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jdouble]].toInt)
      res(104) = align(res(103) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobject, jfieldID, jdouble]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jobject, Unit]].toInt)
      res(105) = align(res(104) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jobject, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jboolean, Unit]].toInt)
      res(106) = align(res(105) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jboolean, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jbyte, Unit]].toInt)
      res(107) = align(res(106) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jbyte, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jchar, Unit]].toInt)
      res(108) = align(res(107) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jchar, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jshort, Unit]].toInt)
      res(109) = align(res(108) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jshort, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jint, Unit]].toInt)
      res(110) = align(res(109) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jint, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jlong, Unit]].toInt)
      res(111) = align(res(110) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jlong, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jfloat, Unit]].toInt)
      res(112) = align(res(111) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jfloat, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jdouble, Unit]].toInt)
      res(113) = align(res(112) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobject, jfieldID, jdouble, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID]].toInt)
      res(114) = align(res(113) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jmethodID]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject]].toInt)
      res(115) = align(res(114) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jobject]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject]].toInt)
      res(116) = align(res(115) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jobject]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject]].toInt)
      res(117) = align(res(116) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jobject]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jboolean]].toInt)
      res(118) = align(res(117) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jboolean]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jboolean]].toInt)
      res(119) = align(res(118) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jboolean]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jboolean]].toInt)
      res(120) = align(res(119) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jboolean]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jbyte]].toInt)
      res(121) = align(res(120) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jbyte]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jbyte]].toInt)
      res(122) = align(res(121) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jbyte]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jbyte]].toInt)
      res(123) = align(res(122) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jbyte]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jchar]].toInt)
      res(124) = align(res(123) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jchar]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jchar]].toInt)
      res(125) = align(res(124) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jchar]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jchar]].toInt)
      res(126) = align(res(125) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jchar]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jshort]].toInt)
      res(127) = align(res(126) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jshort]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jshort]].toInt)
      res(128) = align(res(127) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jshort]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jshort]].toInt)
      res(129) = align(res(128) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jshort]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jint]].toInt)
      res(130) = align(res(129) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jint]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jint]].toInt)
      res(131) = align(res(130) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jint]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jint]].toInt)
      res(132) = align(res(131) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jint]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jlong]].toInt)
      res(133) = align(res(132) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jlong]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jlong]].toInt)
      res(134) = align(res(133) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jlong]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jlong]].toInt)
      res(135) = align(res(134) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jlong]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jfloat]].toInt)
      res(136) = align(res(135) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jfloat]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jfloat]].toInt)
      res(137) = align(res(136) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jfloat]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jfloat]].toInt)
      res(138) = align(res(137) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jfloat]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jdouble]].toInt)
      res(139) = align(res(138) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, jdouble]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jdouble]].toInt)
      res(140) = align(res(139) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, jdouble]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jdouble]].toInt)
      res(141) = align(res(140) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], jdouble]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, Unit]].toInt)
      res(142) = align(res(141) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jmethodID, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, Unit]].toInt)
      res(143) = align(res(142) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, va_list, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], Unit]].toInt)
      res(144) = align(res(143) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jmethodID, Ptr[jvalue], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID]].toInt)
      res(145) = align(res(144) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, CString, CString, jfieldID]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jobject]].toInt)
      res(146) = align(res(145) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jobject]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jboolean]].toInt)
      res(147) = align(res(146) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jboolean]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jbyte]].toInt)
      res(148) = align(res(147) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jbyte]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jchar]].toInt)
      res(149) = align(res(148) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jchar]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jshort]].toInt)
      res(150) = align(res(149) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jshort]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jint]].toInt)
      res(151) = align(res(150) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jint]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jlong]].toInt)
      res(152) = align(res(151) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jlong]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jfloat]].toInt)
      res(153) = align(res(152) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jfloat]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jdouble]].toInt)
      res(154) = align(res(153) + sizeof[CFuncPtr3[Ptr[JNIEnv], jclass, jfieldID, jdouble]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jobject, Unit]].toInt)
      res(155) = align(res(154) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jobject, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, Unit]].toInt)
      res(156) = align(res(155) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jboolean, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jbyte, Unit]].toInt)
      res(157) = align(res(156) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jbyte, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jchar, Unit]].toInt)
      res(158) = align(res(157) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jchar, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jshort, Unit]].toInt)
      res(159) = align(res(158) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jshort, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jint, Unit]].toInt)
      res(160) = align(res(159) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jint, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jlong, Unit]].toInt)
      res(161) = align(res(160) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jlong, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jfloat, Unit]].toInt)
      res(162) = align(res(161) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jfloat, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jdouble, Unit]].toInt)
      res(163) = align(res(162) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, jfieldID, jdouble, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], Ptr[jchar], jsize, jstring]].toInt)
      res(164) = align(res(163) + sizeof[CFuncPtr3[Ptr[JNIEnv], Ptr[jchar], jsize, jstring]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jstring, jsize]].toInt)
      res(165) = align(res(164) + sizeof[CFuncPtr2[Ptr[JNIEnv], jstring, jsize]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]]].toInt)
      res(166) = align(res(165) + sizeof[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit]].toInt)
      res(167) = align(res(166) + sizeof[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], CString, jstring]].toInt)
      res(168) = align(res(167) + sizeof[CFuncPtr2[Ptr[JNIEnv], CString, jstring]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jstring, jsize]].toInt)
      res(169) = align(res(168) + sizeof[CFuncPtr2[Ptr[JNIEnv], jstring, jsize]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], CString]].toInt)
      res(170) = align(res(169) + sizeof[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], CString]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jstring, CString, Unit]].toInt)
      res(171) = align(res(170) + sizeof[CFuncPtr3[Ptr[JNIEnv], jstring, CString, Unit]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jarray, jsize]].toInt)
      res(172) = align(res(171) + sizeof[CFuncPtr2[Ptr[JNIEnv], jarray, jsize]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jsize, jclass, jobject, jobjectArray]].toInt)
      res(173) = align(res(172) + sizeof[CFuncPtr4[Ptr[JNIEnv], jsize, jclass, jobject, jobjectArray]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jobjectArray, jsize, jobject]].toInt)
      res(174) = align(res(173) + sizeof[CFuncPtr3[Ptr[JNIEnv], jobjectArray, jsize, jobject]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jobjectArray, jsize, jobject, Unit]].toInt)
      res(175) = align(res(174) + sizeof[CFuncPtr4[Ptr[JNIEnv], jobjectArray, jsize, jobject, Unit]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jsize, jbooleanArray]].toInt)
      res(176) = align(res(175) + sizeof[CFuncPtr2[Ptr[JNIEnv], jsize, jbooleanArray]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jsize, jbyteArray]].toInt)
      res(177) = align(res(176) + sizeof[CFuncPtr2[Ptr[JNIEnv], jsize, jbyteArray]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jsize, jcharArray]].toInt)
      res(178) = align(res(177) + sizeof[CFuncPtr2[Ptr[JNIEnv], jsize, jcharArray]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jsize, jshortArray]].toInt)
      res(179) = align(res(178) + sizeof[CFuncPtr2[Ptr[JNIEnv], jsize, jshortArray]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jsize, jintArray]].toInt)
      res(180) = align(res(179) + sizeof[CFuncPtr2[Ptr[JNIEnv], jsize, jintArray]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jsize, jlongArray]].toInt)
      res(181) = align(res(180) + sizeof[CFuncPtr2[Ptr[JNIEnv], jsize, jlongArray]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jsize, jfloatArray]].toInt)
      res(182) = align(res(181) + sizeof[CFuncPtr2[Ptr[JNIEnv], jsize, jfloatArray]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jsize, jdoubleArray]].toInt)
      res(183) = align(res(182) + sizeof[CFuncPtr2[Ptr[JNIEnv], jsize, jdoubleArray]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], Ptr[jboolean]]].toInt)
      res(184) = align(res(183) + sizeof[CFuncPtr3[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], Ptr[jboolean]]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jbyteArray, Ptr[jboolean], Ptr[jbyte]]].toInt)
      res(185) = align(res(184) + sizeof[CFuncPtr3[Ptr[JNIEnv], jbyteArray, Ptr[jboolean], Ptr[jbyte]]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jcharArray, Ptr[jboolean], Ptr[jchar]]].toInt)
      res(186) = align(res(185) + sizeof[CFuncPtr3[Ptr[JNIEnv], jcharArray, Ptr[jboolean], Ptr[jchar]]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jshortArray, Ptr[jboolean], Ptr[jshort]]].toInt)
      res(187) = align(res(186) + sizeof[CFuncPtr3[Ptr[JNIEnv], jshortArray, Ptr[jboolean], Ptr[jshort]]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jintArray, Ptr[jboolean], Ptr[jint]]].toInt)
      res(188) = align(res(187) + sizeof[CFuncPtr3[Ptr[JNIEnv], jintArray, Ptr[jboolean], Ptr[jint]]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jlongArray, Ptr[jboolean], Ptr[jlong]]].toInt)
      res(189) = align(res(188) + sizeof[CFuncPtr3[Ptr[JNIEnv], jlongArray, Ptr[jboolean], Ptr[jlong]]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jfloatArray, Ptr[jboolean], Ptr[jfloat]]].toInt)
      res(190) = align(res(189) + sizeof[CFuncPtr3[Ptr[JNIEnv], jfloatArray, Ptr[jboolean], Ptr[jfloat]]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jdoubleArray, Ptr[jboolean], Ptr[jdouble]]].toInt)
      res(191) = align(res(190) + sizeof[CFuncPtr3[Ptr[JNIEnv], jdoubleArray, Ptr[jboolean], Ptr[jdouble]]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], jint, Unit]].toInt)
      res(192) = align(res(191) + sizeof[CFuncPtr4[Ptr[JNIEnv], jbooleanArray, Ptr[jboolean], jint, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jbyteArray, Ptr[jbyte], jint, Unit]].toInt)
      res(193) = align(res(192) + sizeof[CFuncPtr4[Ptr[JNIEnv], jbyteArray, Ptr[jbyte], jint, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jcharArray, Ptr[jchar], jint, Unit]].toInt)
      res(194) = align(res(193) + sizeof[CFuncPtr4[Ptr[JNIEnv], jcharArray, Ptr[jchar], jint, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jshortArray, Ptr[jshort], jint, Unit]].toInt)
      res(195) = align(res(194) + sizeof[CFuncPtr4[Ptr[JNIEnv], jshortArray, Ptr[jshort], jint, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jintArray, Ptr[jint], jint, Unit]].toInt)
      res(196) = align(res(195) + sizeof[CFuncPtr4[Ptr[JNIEnv], jintArray, Ptr[jint], jint, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jlongArray, Ptr[jlong], jint, Unit]].toInt)
      res(197) = align(res(196) + sizeof[CFuncPtr4[Ptr[JNIEnv], jlongArray, Ptr[jlong], jint, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jfloatArray, Ptr[jfloat], jint, Unit]].toInt)
      res(198) = align(res(197) + sizeof[CFuncPtr4[Ptr[JNIEnv], jfloatArray, Ptr[jfloat], jint, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jdoubleArray, Ptr[jdouble], jint, Unit]].toInt)
      res(199) = align(res(198) + sizeof[CFuncPtr4[Ptr[JNIEnv], jdoubleArray, Ptr[jdouble], jint, Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit]].toInt)
      res(200) = align(res(199) + sizeof[CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit]].toInt)
      res(201) = align(res(200) + sizeof[CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit]].toInt)
      res(202) = align(res(201) + sizeof[CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit]].toInt)
      res(203) = align(res(202) + sizeof[CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit]].toInt)
      res(204) = align(res(203) + sizeof[CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit]].toInt)
      res(205) = align(res(204) + sizeof[CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit]].toInt)
      res(206) = align(res(205) + sizeof[CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit]].toInt)
      res(207) = align(res(206) + sizeof[CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit]].toInt)
      res(208) = align(res(207) + sizeof[CFuncPtr5[Ptr[JNIEnv], jbooleanArray, jsize, jsize, Ptr[jboolean], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit]].toInt)
      res(209) = align(res(208) + sizeof[CFuncPtr5[Ptr[JNIEnv], jbyteArray, jsize, jsize, Ptr[jbyte], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit]].toInt)
      res(210) = align(res(209) + sizeof[CFuncPtr5[Ptr[JNIEnv], jcharArray, jsize, jsize, Ptr[jchar], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit]].toInt)
      res(211) = align(res(210) + sizeof[CFuncPtr5[Ptr[JNIEnv], jshortArray, jsize, jsize, Ptr[jshort], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit]].toInt)
      res(212) = align(res(211) + sizeof[CFuncPtr5[Ptr[JNIEnv], jintArray, jsize, jsize, Ptr[jint], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit]].toInt)
      res(213) = align(res(212) + sizeof[CFuncPtr5[Ptr[JNIEnv], jlongArray, jsize, jsize, Ptr[jlong], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit]].toInt)
      res(214) = align(res(213) + sizeof[CFuncPtr5[Ptr[JNIEnv], jfloatArray, jsize, jsize, Ptr[jfloat], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit]].toInt)
      res(215) = align(res(214) + sizeof[CFuncPtr5[Ptr[JNIEnv], jdoubleArray, jsize, jsize, Ptr[jdouble], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jclass, Ptr[JNINativeMethod], jint, jint]].toInt)
      res(216) = align(res(215) + sizeof[CFuncPtr4[Ptr[JNIEnv], jclass, Ptr[JNINativeMethod], jint, jint]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jclass, jint]].toInt)
      res(217) = align(res(216) + sizeof[CFuncPtr2[Ptr[JNIEnv], jclass, jint]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jint]].toInt)
      res(218) = align(res(217) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, jint]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jint]].toInt)
      res(219) = align(res(218) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, jint]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], Ptr[Ptr[JavaVM]], jint]].toInt)
      res(220) = align(res(219) + sizeof[CFuncPtr2[Ptr[JNIEnv], Ptr[Ptr[JavaVM]], jint]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, Ptr[jchar], Unit]].toInt)
      res(221) = align(res(220) + sizeof[CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, Ptr[jchar], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, CString, Unit]].toInt)
      res(222) = align(res(221) + sizeof[CFuncPtr5[Ptr[JNIEnv], jstring, jsize, jsize, CString, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jarray, Ptr[jboolean], Ptr[Byte]]].toInt)
      res(223) = align(res(222) + sizeof[CFuncPtr3[Ptr[JNIEnv], jarray, Ptr[jboolean], Ptr[Byte]]].toInt, alignmentof[CFuncPtr4[Ptr[JNIEnv], jarray, Ptr[Byte], jint, Unit]].toInt)
      res(224) = align(res(223) + sizeof[CFuncPtr4[Ptr[JNIEnv], jarray, Ptr[Byte], jint, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]]].toInt)
      res(225) = align(res(224) + sizeof[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jboolean], Ptr[jchar]]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit]].toInt)
      res(226) = align(res(225) + sizeof[CFuncPtr3[Ptr[JNIEnv], jstring, Ptr[jchar], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jweak]].toInt)
      res(227) = align(res(226) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, jweak]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jweak, Unit]].toInt)
      res(228) = align(res(227) + sizeof[CFuncPtr2[Ptr[JNIEnv], jweak, Unit]].toInt, alignmentof[CFuncPtr1[Ptr[JNIEnv], jboolean]].toInt)
      res(229) = align(res(228) + sizeof[CFuncPtr1[Ptr[JNIEnv], jboolean]].toInt, alignmentof[CFuncPtr3[Ptr[JNIEnv], Ptr[Byte], jlong, jobject]].toInt)
      res(230) = align(res(229) + sizeof[CFuncPtr3[Ptr[JNIEnv], Ptr[Byte], jlong, jobject]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, Ptr[Byte]]].toInt)
      res(231) = align(res(230) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, Ptr[Byte]]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jlong]].toInt)
      res(232) = align(res(231) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, jlong]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jobjectRefType]].toInt)
      res(233) = align(res(232) + sizeof[CFuncPtr2[Ptr[JNIEnv], jobject, jobjectRefType]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jclass, jobject]].toInt)
      res(234) = align(res(233) + sizeof[CFuncPtr2[Ptr[JNIEnv], jclass, jobject]].toInt, alignmentof[CFuncPtr2[Ptr[JNIEnv], jobject, jboolean]].toInt)
      res
    end offsets
    

  opaque type JNINativeMethod = CStruct3[CString, CString, Ptr[Byte]]
  
  object JNINativeMethod:
    given _tag: Tag[JNINativeMethod] = Tag.materializeCStruct3Tag[CString, CString, Ptr[Byte]]
    
    export fields.*
    private[jni] object fields:
      extension (struct: JNINativeMethod)
        inline def name : CString = struct._1
        inline def name_=(value: CString): Unit = (!struct.at1 = value)
        inline def signature : CString = struct._2
        inline def signature_=(value: CString): Unit = (!struct.at2 = value)
        inline def fnPtr : Ptr[Byte] = struct._3
        inline def fnPtr_=(value: Ptr[Byte]): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates JNINativeMethod on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[JNINativeMethod] = scala.scalanative.unsafe.alloc[JNINativeMethod](1)
    def apply(name : CString, signature : CString, fnPtr : Ptr[Byte])(using Zone): Ptr[JNINativeMethod] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).signature = signature
      (!____ptr).fnPtr = fnPtr
      ____ptr
    
    

  opaque type JavaVMAttachArgs = CStruct3[jint, CString, jobject]
  
  object JavaVMAttachArgs:
    given _tag: Tag[JavaVMAttachArgs] = Tag.materializeCStruct3Tag[jint, CString, jobject]
    
    export fields.*
    private[jni] object fields:
      extension (struct: JavaVMAttachArgs)
        inline def version : jint = struct._1
        inline def version_=(value: jint): Unit = (!struct.at1 = value)
        inline def name : CString = struct._2
        inline def name_=(value: CString): Unit = (!struct.at2 = value)
        inline def group : jobject = struct._3
        inline def group_=(value: jobject): Unit = (!struct.at3 = value)
      end extension
    
    // Allocates JavaVMAttachArgs on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[JavaVMAttachArgs] = scala.scalanative.unsafe.alloc[JavaVMAttachArgs](1)
    def apply(version : jint, name : CString, group : jobject)(using Zone): Ptr[JavaVMAttachArgs] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).name = name
      (!____ptr).group = group
      ____ptr
    
    

  opaque type JavaVMInitArgs = CStruct4[jint, jint, Ptr[JavaVMOption], jboolean]
  
  object JavaVMInitArgs:
    given _tag: Tag[JavaVMInitArgs] = Tag.materializeCStruct4Tag[jint, jint, Ptr[JavaVMOption], jboolean]
    
    export fields.*
    private[jni] object fields:
      extension (struct: JavaVMInitArgs)
        inline def version : jint = struct._1
        inline def version_=(value: jint): Unit = (!struct.at1 = value)
        inline def nOptions : jint = struct._2
        inline def nOptions_=(value: jint): Unit = (!struct.at2 = value)
        inline def options : Ptr[JavaVMOption] = struct._3
        inline def options_=(value: Ptr[JavaVMOption]): Unit = (!struct.at3 = value)
        inline def ignoreUnrecognized : jboolean = struct._4
        inline def ignoreUnrecognized_=(value: jboolean): Unit = (!struct.at4 = value)
      end extension
    
    // Allocates JavaVMInitArgs on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[JavaVMInitArgs] = scala.scalanative.unsafe.alloc[JavaVMInitArgs](1)
    def apply(version : jint, nOptions : jint, options : Ptr[JavaVMOption], ignoreUnrecognized : jboolean)(using Zone): Ptr[JavaVMInitArgs] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).nOptions = nOptions
      (!____ptr).options = options
      (!____ptr).ignoreUnrecognized = ignoreUnrecognized
      ____ptr
    
    

  opaque type JavaVMOption = CStruct2[CString, Ptr[Byte]]
  
  object JavaVMOption:
    given _tag: Tag[JavaVMOption] = Tag.materializeCStruct2Tag[CString, Ptr[Byte]]
    
    export fields.*
    private[jni] object fields:
      extension (struct: JavaVMOption)
        inline def optionString : CString = struct._1
        inline def optionString_=(value: CString): Unit = (!struct.at1 = value)
        inline def extraInfo : Ptr[Byte] = struct._2
        inline def extraInfo_=(value: Ptr[Byte]): Unit = (!struct.at2 = value)
      end extension
    
    // Allocates JavaVMOption on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[JavaVMOption] = scala.scalanative.unsafe.alloc[JavaVMOption](1)
    def apply(optionString : CString, extraInfo : Ptr[Byte])(using Zone): Ptr[JavaVMOption] =
      val ____ptr = apply()
      (!____ptr).optionString = optionString
      (!____ptr).extraInfo = extraInfo
      ____ptr
    
    

  opaque type JavaVM_ = CStruct1[Ptr[Byte]]
  
  object JavaVM_ :
    given _tag: Tag[JavaVM_] = Tag.materializeCStruct1Tag[Ptr[Byte]]
    
    export fields.*
    private[jni] object fields:
      extension (struct: JavaVM_)
        inline def functions : Ptr[JNIInvokeInterface_] = struct._1.asInstanceOf[Ptr[JNIInvokeInterface_]]
        inline def functions_=(value: Ptr[JNIInvokeInterface_]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
      end extension
    
    // Allocates JavaVM_ on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[JavaVM_] = scala.scalanative.unsafe.alloc[JavaVM_](1)
    def apply(functions : Ptr[JNIInvokeInterface_])(using Zone): Ptr[JavaVM_] =
      val ____ptr = apply()
      (!____ptr).functions = functions
      ____ptr
    
    

  opaque type _jfieldID = CStruct0
  
  object _jfieldID:
    given _tag: Tag[_jfieldID] = Tag.materializeCStruct0Tag
    

  opaque type _jmethodID = CStruct0
  
  object _jmethodID:
    given _tag: Tag[_jmethodID] = Tag.materializeCStruct0Tag
    

  opaque type _jobject = CStruct0
  
  object _jobject:
    given _tag: Tag[_jobject] = Tag.materializeCStruct0Tag
    

object unions:
  import _root_.jni.predef.*
  import _root_.jni.enumerations.*
  import _root_.jni.aliases.*
  import _root_.jni.structs.*
  import _root_.jni.unions.*

  opaque type jvalue = CArray[Byte, Nat._8]
  object jvalue:
    given _tag: Tag[jvalue] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    
    def apply()(using Zone): Ptr[jvalue] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[jvalue](1)
      ___ptr
    
    @scala.annotation.targetName("apply_z")
    def apply(z: jboolean)(using Zone): Ptr[jvalue] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[jvalue](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[jboolean]].update(0, z)
      ___ptr
    
    @scala.annotation.targetName("apply_b")
    def apply(b: jbyte)(using Zone): Ptr[jvalue] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[jvalue](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[jbyte]].update(0, b)
      ___ptr
    
    @scala.annotation.targetName("apply_c")
    def apply(c: jchar)(using Zone): Ptr[jvalue] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[jvalue](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[jchar]].update(0, c)
      ___ptr
    
    @scala.annotation.targetName("apply_s")
    def apply(s: jshort)(using Zone): Ptr[jvalue] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[jvalue](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[jshort]].update(0, s)
      ___ptr
    
    @scala.annotation.targetName("apply_i")
    def apply(i: jint)(using Zone): Ptr[jvalue] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[jvalue](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[jint]].update(0, i)
      ___ptr
    
    @scala.annotation.targetName("apply_j")
    def apply(j: jlong)(using Zone): Ptr[jvalue] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[jvalue](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[jlong]].update(0, j)
      ___ptr
    
    @scala.annotation.targetName("apply_f")
    def apply(f: jfloat)(using Zone): Ptr[jvalue] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[jvalue](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[jfloat]].update(0, f)
      ___ptr
    
    @scala.annotation.targetName("apply_d")
    def apply(d: jdouble)(using Zone): Ptr[jvalue] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[jvalue](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[jdouble]].update(0, d)
      ___ptr
    
    @scala.annotation.targetName("apply_l")
    def apply(l: jobject)(using Zone): Ptr[jvalue] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[jvalue](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[jobject]].update(0, l)
      ___ptr
    
    extension (struct: jvalue)
      inline def z : jboolean = !struct.at(0).asInstanceOf[Ptr[jboolean]]
      inline def z_=(value: jboolean): Unit = !struct.at(0).asInstanceOf[Ptr[jboolean]] = value
      inline def b : jbyte = !struct.at(0).asInstanceOf[Ptr[jbyte]]
      inline def b_=(value: jbyte): Unit = !struct.at(0).asInstanceOf[Ptr[jbyte]] = value
      inline def c : jchar = !struct.at(0).asInstanceOf[Ptr[jchar]]
      inline def c_=(value: jchar): Unit = !struct.at(0).asInstanceOf[Ptr[jchar]] = value
      inline def s : jshort = !struct.at(0).asInstanceOf[Ptr[jshort]]
      inline def s_=(value: jshort): Unit = !struct.at(0).asInstanceOf[Ptr[jshort]] = value
      inline def i : jint = !struct.at(0).asInstanceOf[Ptr[jint]]
      inline def i_=(value: jint): Unit = !struct.at(0).asInstanceOf[Ptr[jint]] = value
      inline def j : jlong = !struct.at(0).asInstanceOf[Ptr[jlong]]
      inline def j_=(value: jlong): Unit = !struct.at(0).asInstanceOf[Ptr[jlong]] = value
      inline def f : jfloat = !struct.at(0).asInstanceOf[Ptr[jfloat]]
      inline def f_=(value: jfloat): Unit = !struct.at(0).asInstanceOf[Ptr[jfloat]] = value
      inline def d : jdouble = !struct.at(0).asInstanceOf[Ptr[jdouble]]
      inline def d_=(value: jdouble): Unit = !struct.at(0).asInstanceOf[Ptr[jdouble]] = value
      inline def l : jobject = !struct.at(0).asInstanceOf[Ptr[jobject]]
      inline def l_=(value: jobject): Unit = !struct.at(0).asInstanceOf[Ptr[jobject]] = value


@extern
private[jni] object extern_functions:
  import _root_.jni.predef.*
  import _root_.jni.enumerations.*
  import _root_.jni.aliases.*
  import _root_.jni.structs.*
  import _root_.jni.unions.*
  def JNI_CreateJavaVM(pvm : Ptr[Ptr[JavaVM]], penv : Ptr[Ptr[Byte]], args : Ptr[Byte]): jint = extern

  def JNI_GetCreatedJavaVMs(_0 : Ptr[Ptr[JavaVM]], _1 : jsize, _2 : Ptr[jsize]): jint = extern

  def JNI_GetDefaultJavaVMInitArgs(args : Ptr[Byte]): jint = extern

  def JNI_OnLoad(vm : Ptr[JavaVM], reserved : Ptr[Byte]): jint = extern

  def JNI_OnUnload(vm : Ptr[JavaVM], reserved : Ptr[Byte]): Unit = extern


object functions:
  import _root_.jni.predef.*
  import _root_.jni.enumerations.*
  import _root_.jni.aliases.*
  import _root_.jni.structs.*
  import _root_.jni.unions.*
  import extern_functions.*
  export extern_functions.*

object types:
    export _root_.jni.structs.*
    export _root_.jni.aliases.*
    export _root_.jni.unions.*
    export _root_.jni.enumerations.*

object all:
  export _root_.jni.enumerations._jobjectType
  export _root_.jni.aliases.JNIEnv
  export _root_.jni.aliases.JavaVM
  export _root_.jni.aliases.jarray
  export _root_.jni.aliases.jboolean
  export _root_.jni.aliases.jbooleanArray
  export _root_.jni.aliases.jbyte
  export _root_.jni.aliases.jbyteArray
  export _root_.jni.aliases.jchar
  export _root_.jni.aliases.jcharArray
  export _root_.jni.aliases.jclass
  export _root_.jni.aliases.jdouble
  export _root_.jni.aliases.jdoubleArray
  export _root_.jni.aliases.jfieldID
  export _root_.jni.aliases.jfloat
  export _root_.jni.aliases.jfloatArray
  export _root_.jni.aliases.jint
  export _root_.jni.aliases.jintArray
  export _root_.jni.aliases.jlong
  export _root_.jni.aliases.jlongArray
  export _root_.jni.aliases.jmethodID
  export _root_.jni.aliases.jobject
  export _root_.jni.aliases.jobjectArray
  export _root_.jni.aliases.jobjectRefType
  export _root_.jni.aliases.jshort
  export _root_.jni.aliases.jshortArray
  export _root_.jni.aliases.jsize
  export _root_.jni.aliases.jstring
  export _root_.jni.aliases.jthrowable
  export _root_.jni.aliases.jweak
  export _root_.jni.aliases.va_list
  export _root_.jni.structs.JNIEnv_
  export _root_.jni.structs.JNIInvokeInterface_
  export _root_.jni.structs.JNINativeInterface_
  export _root_.jni.structs.JNINativeMethod
  export _root_.jni.structs.JavaVMAttachArgs
  export _root_.jni.structs.JavaVMInitArgs
  export _root_.jni.structs.JavaVMOption
  export _root_.jni.structs.JavaVM_
  export _root_.jni.structs._jfieldID
  export _root_.jni.structs._jmethodID
  export _root_.jni.structs._jobject
  export _root_.jni.unions.jvalue
  export _root_.jni.functions.JNI_CreateJavaVM
  export _root_.jni.functions.JNI_GetCreatedJavaVMs
  export _root_.jni.functions.JNI_GetDefaultJavaVMInitArgs
  export _root_.jni.functions.JNI_OnLoad
  export _root_.jni.functions.JNI_OnUnload