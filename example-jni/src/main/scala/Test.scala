import jni.all.*
import scalanative.unsafe.*

// these are macros in C and cannot be generate by bindgen, so we define them manually
val JNI_OK = 0 /* success */
val JNI_ERR = (-1) /* unknown error */
val JNI_EDETACHED = (-2) /* thread detached from the VM */
val JNI_EVERSION = (-3) /* JNI version error */
val JNI_ENOMEM = (-4) /* not enough memory */
val JNI_EEXIST = (-5) /* VM already created */
val JNI_EINVAL = (-6) /* invalid arguments */

val JNI_VERSION_1_1 = 0x00010001
val JNI_VERSION_1_2 = 0x00010002
val JNI_VERSION_1_4 = 0x00010004
val JNI_VERSION_1_6 = 0x00010006
val JNI_VERSION_1_8 = 0x00010008
val JNI_VERSION_9 = 0x00090000
val JNI_VERSION_10 = 0x000a0000
val JNI_VERSION_19 = 0x00130000
val JNI_VERSION_20 = 0x00140000
val JNI_VERSION_21 = 0x00150000

@main def hello =
  Zone:
    // Part 1: initialising basic JNI interface
    val iface = JNIInvokeInterface_()
    val args = JavaVMInitArgs()
    (!args).version = jint(JNI_VERSION_1_8)
    (!args).nOptions = jint(0)

    val vm = doublePointer(JavaVM(iface))
    val env = doublePointer[JNIEnv](JNIEnv(null))

    val res = JNI_CreateJavaVM(
      vm,
      env.asInstanceOf[Ptr[Ptr[Byte]]],
      args.asInstanceOf[Ptr[Byte]]
    )
    if res.value != JNI_OK then sys.error("Failed to create Java VMn")

    // just look at this... horrors beyond human comprehension
    val jvm: JNINativeInterface_ = (!(!(!env)).value)

    // Part 2: using JNI interface to invoke built-in Java methods. Cann you guess which ones?
    val system = jvm.FindClass(!env, c"java/lang/System")
    assert(system.value != null, "Failed to find java.lang.System class")

    val outField =
      jvm.GetStaticFieldID(!env, system, c"out", c"Ljava/io/PrintStream;");
    assert(outField.value != null, "Failed to find .out field on System")

    val out = jvm.GetStaticObjectField(!env, system, outField)
    assert(out.value != null)

    val printStream = jvm.GetObjectClass(!env, out)
    assert(printStream.value != null)

    val printlnMethod =
      jvm.GetMethodID(!env, printStream, c"println", c"(Ljava/lang/String;)V")
    assert(printlnMethod.value != null)

    val str =
      jvm.NewStringUTF(!env, c"Hello world from Java from... Scala Native?..")

    val arguments = va_list(toCVarArgList(str))

    jvm.CallVoidMethodV(!env, out, printlnMethod, arguments)

private inline def doublePointer[A: Tag](value: A): Ptr[Ptr[A]] =
  val ptr1 = stackalloc[A]()
  val ptr2 = stackalloc[Ptr[A]]()
  ptr2.update(0, ptr1)(using Tag.materializePtrTag[A])
  !ptr1 = value

  ptr2
