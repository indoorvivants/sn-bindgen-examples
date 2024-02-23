package openssl

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[openssl] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def int: CInt = eq.apply(t).toInt
      inline def uint: CUnsignedInt = eq.apply(t)
      inline def value: CUnsignedInt = eq.apply(t)

object enumerations:
  import predef.*

  /** */
  opaque type BIO_hostserv_priorities = CUnsignedInt
  object BIO_hostserv_priorities extends CEnumU[BIO_hostserv_priorities]:
    given _tag: Tag[BIO_hostserv_priorities] = Tag.UInt
    inline def define(inline a: Long): BIO_hostserv_priorities = a.toUInt
    val BIO_PARSE_PRIO_HOST = define(0)
    val BIO_PARSE_PRIO_SERV = define(1)
    inline def getName(inline value: BIO_hostserv_priorities): Option[String] =
      inline value match
        case BIO_PARSE_PRIO_HOST => Some("BIO_PARSE_PRIO_HOST")
        case BIO_PARSE_PRIO_SERV => Some("BIO_PARSE_PRIO_SERV")
        case _                   => None
    extension (a: BIO_hostserv_priorities)
      inline def &(b: BIO_hostserv_priorities): BIO_hostserv_priorities = a & b
      inline def |(b: BIO_hostserv_priorities): BIO_hostserv_priorities = a | b
      inline def is(b: BIO_hostserv_priorities): Boolean = (a & b) == b
  end BIO_hostserv_priorities

  /** */
  opaque type BIO_lookup_type = CUnsignedInt
  object BIO_lookup_type extends CEnumU[BIO_lookup_type]:
    given _tag: Tag[BIO_lookup_type] = Tag.UInt
    inline def define(inline a: Long): BIO_lookup_type = a.toUInt
    val BIO_LOOKUP_CLIENT = define(0)
    val BIO_LOOKUP_SERVER = define(1)
    inline def getName(inline value: BIO_lookup_type): Option[String] =
      inline value match
        case BIO_LOOKUP_CLIENT => Some("BIO_LOOKUP_CLIENT")
        case BIO_LOOKUP_SERVER => Some("BIO_LOOKUP_SERVER")
        case _                 => None
    extension (a: BIO_lookup_type)
      inline def &(b: BIO_lookup_type): BIO_lookup_type = a & b
      inline def |(b: BIO_lookup_type): BIO_lookup_type = a | b
      inline def is(b: BIO_lookup_type): Boolean = (a & b) == b
  end BIO_lookup_type

  /** */
  opaque type BIO_sock_info_type = CUnsignedInt
  object BIO_sock_info_type extends CEnumU[BIO_sock_info_type]:
    given _tag: Tag[BIO_sock_info_type] = Tag.UInt
    inline def define(inline a: Long): BIO_sock_info_type = a.toUInt
    val BIO_SOCK_INFO_ADDRESS = define(0)
    inline def getName(inline value: BIO_sock_info_type): Option[String] =
      inline value match
        case BIO_SOCK_INFO_ADDRESS => Some("BIO_SOCK_INFO_ADDRESS")
        case _                     => None
    extension (a: BIO_sock_info_type)
      inline def &(b: BIO_sock_info_type): BIO_sock_info_type = a & b
      inline def |(b: BIO_sock_info_type): BIO_sock_info_type = a | b
      inline def is(b: BIO_sock_info_type): Boolean = (a & b) == b
  end BIO_sock_info_type
end enumerations

object aliases:
  import _root_.openssl.enumerations.*
  import _root_.openssl.predef.*
  import _root_.openssl.aliases.*
  import _root_.openssl.structs.*
  import _root_.openssl.unions.*

  /** */
  opaque type ASN1_BOOLEAN = CInt
  object ASN1_BOOLEAN:
    given _tag: Tag[ASN1_BOOLEAN] = Tag.Int
    inline def apply(inline o: CInt): ASN1_BOOLEAN = o
    extension (v: ASN1_BOOLEAN) inline def value: CInt = v

  /** */
  type ASN1_ITEM_EXP = CFuncPtr0[Ptr[ASN1_ITEM]]
  object ASN1_ITEM_EXP:
    given _tag: Tag[ASN1_ITEM_EXP] = Tag.materializeCFuncPtr0[Ptr[ASN1_ITEM]]
    inline def apply(inline o: CFuncPtr0[Ptr[ASN1_ITEM]]): ASN1_ITEM_EXP = o
    extension (v: ASN1_ITEM_EXP) inline def value: CFuncPtr0[Ptr[ASN1_ITEM]] = v

  /** */
  opaque type ASN1_NULL = CInt
  object ASN1_NULL:
    given _tag: Tag[ASN1_NULL] = Tag.Int
    inline def apply(inline o: CInt): ASN1_NULL = o
    extension (v: ASN1_NULL) inline def value: CInt = v

  /** */
  opaque type BIO_callback_fn =
    CFuncPtr6[Ptr[BIO], CInt, CString, CInt, CLongInt, CLongInt, CLongInt]
  object BIO_callback_fn:
    given _tag: Tag[BIO_callback_fn] = Tag.materializeCFuncPtr6[Ptr[
      BIO
    ], CInt, CString, CInt, CLongInt, CLongInt, CLongInt]
    inline def fromPtr(ptr: Ptr[Byte]): BIO_callback_fn = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr6[Ptr[
          BIO
        ], CInt, CString, CInt, CLongInt, CLongInt, CLongInt]
    ): BIO_callback_fn = o
    extension (v: BIO_callback_fn)
      inline def value: CFuncPtr6[Ptr[
        BIO
      ], CInt, CString, CInt, CLongInt, CLongInt, CLongInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end BIO_callback_fn

  /** */
  opaque type BIO_callback_fn_ex = CFuncPtr8[Ptr[
    BIO
  ], CInt, CString, size_t, CInt, CLongInt, CInt, Ptr[size_t], CLongInt]
  object BIO_callback_fn_ex:
    given _tag: Tag[BIO_callback_fn_ex] = Tag.materializeCFuncPtr8[Ptr[
      BIO
    ], CInt, CString, size_t, CInt, CLongInt, CInt, Ptr[size_t], CLongInt]
    inline def fromPtr(ptr: Ptr[Byte]): BIO_callback_fn_ex =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr8[Ptr[
          BIO
        ], CInt, CString, size_t, CInt, CLongInt, CInt, Ptr[size_t], CLongInt]
    ): BIO_callback_fn_ex = o
    extension (v: BIO_callback_fn_ex)
      inline def value: CFuncPtr8[Ptr[
        BIO
      ], CInt, CString, size_t, CInt, CLongInt, CInt, Ptr[size_t], CLongInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end BIO_callback_fn_ex

  /** */
  opaque type BIO_dgram_sctp_notification_handler_fn =
    CFuncPtr3[Ptr[BIO], Ptr[Byte], Ptr[Byte], Unit]
  object BIO_dgram_sctp_notification_handler_fn:
    given _tag: Tag[BIO_dgram_sctp_notification_handler_fn] =
      Tag.materializeCFuncPtr3[Ptr[BIO], Ptr[Byte], Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): BIO_dgram_sctp_notification_handler_fn =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[BIO], Ptr[Byte], Ptr[Byte], Unit]
    ): BIO_dgram_sctp_notification_handler_fn = o
    extension (v: BIO_dgram_sctp_notification_handler_fn)
      inline def value: CFuncPtr3[Ptr[BIO], Ptr[Byte], Ptr[Byte], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end BIO_dgram_sctp_notification_handler_fn

  /** */
  type BIO_info_cb = CFuncPtr3[Ptr[BIO], CInt, CInt, CInt]
  object BIO_info_cb:
    given _tag: Tag[BIO_info_cb] =
      Tag.materializeCFuncPtr3[Ptr[BIO], CInt, CInt, CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[BIO], CInt, CInt, CInt]
    ): BIO_info_cb = o
    extension (v: BIO_info_cb)
      inline def value: CFuncPtr3[Ptr[BIO], CInt, CInt, CInt] = v

  /** */
  type CRYPTO_EX_dup = CFuncPtr6[Ptr[CRYPTO_EX_DATA], Ptr[CRYPTO_EX_DATA], Ptr[
    Ptr[Byte]
  ], CInt, CLongInt, Ptr[Byte], CInt]
  object CRYPTO_EX_dup:
    given _tag: Tag[CRYPTO_EX_dup] = Tag.materializeCFuncPtr6[Ptr[
      CRYPTO_EX_DATA
    ], Ptr[CRYPTO_EX_DATA], Ptr[Ptr[Byte]], CInt, CLongInt, Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[CRYPTO_EX_DATA], Ptr[CRYPTO_EX_DATA], Ptr[
          Ptr[Byte]
        ], CInt, CLongInt, Ptr[Byte], CInt]
    ): CRYPTO_EX_dup = o
    extension (v: CRYPTO_EX_dup)
      inline def value: CFuncPtr6[Ptr[CRYPTO_EX_DATA], Ptr[CRYPTO_EX_DATA], Ptr[
        Ptr[Byte]
      ], CInt, CLongInt, Ptr[Byte], CInt] = v
  end CRYPTO_EX_dup

  /** */
  type CRYPTO_EX_free = CFuncPtr6[Ptr[Byte], Ptr[Byte], Ptr[
    CRYPTO_EX_DATA
  ], CInt, CLongInt, Ptr[Byte], Unit]
  object CRYPTO_EX_free:
    given _tag: Tag[CRYPTO_EX_free] = Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[
      Byte
    ], Ptr[CRYPTO_EX_DATA], CInt, CLongInt, Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[Byte], Ptr[
          CRYPTO_EX_DATA
        ], CInt, CLongInt, Ptr[Byte], Unit]
    ): CRYPTO_EX_free = o
    extension (v: CRYPTO_EX_free)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[Byte], Ptr[
        CRYPTO_EX_DATA
      ], CInt, CLongInt, Ptr[Byte], Unit] = v
  end CRYPTO_EX_free

  /** */
  type CRYPTO_EX_new = CFuncPtr6[Ptr[Byte], Ptr[Byte], Ptr[
    CRYPTO_EX_DATA
  ], CInt, CLongInt, Ptr[Byte], Unit]
  object CRYPTO_EX_new:
    given _tag: Tag[CRYPTO_EX_new] = Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[
      Byte
    ], Ptr[CRYPTO_EX_DATA], CInt, CLongInt, Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[Byte], Ptr[
          CRYPTO_EX_DATA
        ], CInt, CLongInt, Ptr[Byte], Unit]
    ): CRYPTO_EX_new = o
    extension (v: CRYPTO_EX_new)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[Byte], Ptr[
        CRYPTO_EX_DATA
      ], CInt, CLongInt, Ptr[Byte], Unit] = v
  end CRYPTO_EX_new

  /** */
  type CRYPTO_ONCE = pthread_once_t
  object CRYPTO_ONCE:
    given _tag: Tag[CRYPTO_ONCE] = pthread_once_t._tag
    inline def apply(inline o: pthread_once_t): CRYPTO_ONCE = o
    extension (v: CRYPTO_ONCE) inline def value: pthread_once_t = v

  /** */
  type CRYPTO_RWLOCK = Unit
  object CRYPTO_RWLOCK:
    given _tag: Tag[CRYPTO_RWLOCK] = Tag.Unit
    inline def apply(inline o: Unit): CRYPTO_RWLOCK = o
    extension (v: CRYPTO_RWLOCK) inline def value: Unit = v

  /** */
  type CRYPTO_THREAD_ID = pthread_t
  object CRYPTO_THREAD_ID:
    given _tag: Tag[CRYPTO_THREAD_ID] = pthread_t._tag
    inline def apply(inline o: pthread_t): CRYPTO_THREAD_ID = o
    extension (v: CRYPTO_THREAD_ID) inline def value: pthread_t = v

  /** */
  type CRYPTO_THREAD_LOCAL = pthread_key_t
  object CRYPTO_THREAD_LOCAL:
    given _tag: Tag[CRYPTO_THREAD_LOCAL] = pthread_key_t._tag
    inline def apply(inline o: pthread_key_t): CRYPTO_THREAD_LOCAL = o
    extension (v: CRYPTO_THREAD_LOCAL) inline def value: pthread_key_t = v

  /** */
  opaque type CRYPTO_free_fn = CFuncPtr3[Ptr[Byte], CString, CInt, Unit]
  object CRYPTO_free_fn:
    given _tag: Tag[CRYPTO_free_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CString, CInt, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): CRYPTO_free_fn = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CString, CInt, Unit]
    ): CRYPTO_free_fn = o
    extension (v: CRYPTO_free_fn)
      inline def value: CFuncPtr3[Ptr[Byte], CString, CInt, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end CRYPTO_free_fn

  /** */
  opaque type CRYPTO_malloc_fn = CFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
  object CRYPTO_malloc_fn:
    given _tag: Tag[CRYPTO_malloc_fn] =
      Tag.materializeCFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte]): CRYPTO_malloc_fn = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
    ): CRYPTO_malloc_fn = o
    extension (v: CRYPTO_malloc_fn)
      inline def value: CFuncPtr3[size_t, CString, CInt, Ptr[Byte]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end CRYPTO_malloc_fn

  /** */
  opaque type CRYPTO_realloc_fn =
    CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Ptr[Byte]]
  object CRYPTO_realloc_fn:
    given _tag: Tag[CRYPTO_realloc_fn] =
      Tag.materializeCFuncPtr4[Ptr[Byte], size_t, CString, CInt, Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte]): CRYPTO_realloc_fn =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Ptr[Byte]]
    ): CRYPTO_realloc_fn = o
    extension (v: CRYPTO_realloc_fn)
      inline def value: CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Ptr[Byte]] =
        v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end CRYPTO_realloc_fn

  /** */
  type EVP_PBE_KEYGEN = CFuncPtr7[Ptr[EVP_CIPHER_CTX], CString, CInt, Ptr[
    ASN1_TYPE
  ], Ptr[EVP_CIPHER], Ptr[EVP_MD], CInt, CInt]
  object EVP_PBE_KEYGEN:
    given _tag: Tag[EVP_PBE_KEYGEN] = Tag.materializeCFuncPtr7[Ptr[
      EVP_CIPHER_CTX
    ], CString, CInt, Ptr[ASN1_TYPE], Ptr[EVP_CIPHER], Ptr[EVP_MD], CInt, CInt]
    inline def apply(
        inline o: CFuncPtr7[Ptr[EVP_CIPHER_CTX], CString, CInt, Ptr[
          ASN1_TYPE
        ], Ptr[EVP_CIPHER], Ptr[EVP_MD], CInt, CInt]
    ): EVP_PBE_KEYGEN = o
    extension (v: EVP_PBE_KEYGEN)
      inline def value: CFuncPtr7[Ptr[EVP_CIPHER_CTX], CString, CInt, Ptr[
        ASN1_TYPE
      ], Ptr[EVP_CIPHER], Ptr[EVP_MD], CInt, CInt] = v
  end EVP_PBE_KEYGEN

  /** */
  type EVP_PBE_KEYGEN_EX = CFuncPtr9[Ptr[EVP_CIPHER_CTX], CString, CInt, Ptr[
    ASN1_TYPE
  ], Ptr[EVP_CIPHER], Ptr[EVP_MD], CInt, Ptr[OSSL_LIB_CTX], CString, CInt]
  object EVP_PBE_KEYGEN_EX:
    given _tag: Tag[EVP_PBE_KEYGEN_EX] =
      Tag.materializeCFuncPtr9[Ptr[EVP_CIPHER_CTX], CString, CInt, Ptr[
        ASN1_TYPE
      ], Ptr[EVP_CIPHER], Ptr[EVP_MD], CInt, Ptr[OSSL_LIB_CTX], CString, CInt]
    inline def apply(
        inline o: CFuncPtr9[Ptr[EVP_CIPHER_CTX], CString, CInt, Ptr[
          ASN1_TYPE
        ], Ptr[EVP_CIPHER], Ptr[EVP_MD], CInt, Ptr[OSSL_LIB_CTX], CString, CInt]
    ): EVP_PBE_KEYGEN_EX = o
    extension (v: EVP_PBE_KEYGEN_EX)
      inline def value: CFuncPtr9[Ptr[EVP_CIPHER_CTX], CString, CInt, Ptr[
        ASN1_TYPE
      ], Ptr[EVP_CIPHER], Ptr[EVP_MD], CInt, Ptr[OSSL_LIB_CTX], CString, CInt] =
        v
  end EVP_PBE_KEYGEN_EX

  /** */
  type EVP_PKEY_gen_cb = CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]
  object EVP_PKEY_gen_cb:
    given _tag: Tag[EVP_PKEY_gen_cb] =
      Tag.materializeCFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]
    ): EVP_PKEY_gen_cb = o
    extension (v: EVP_PKEY_gen_cb)
      inline def value: CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt] = v

  type FILE = libc.stdio.FILE
  object FILE:
    val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
    inline def apply(inline o: libc.stdio.FILE): FILE = o
    extension (v: FILE) inline def value: libc.stdio.FILE = v

  /** */
  opaque type OPENSSL_BLOCK = Ptr[Byte]
  object OPENSSL_BLOCK:
    given _tag: Tag[OPENSSL_BLOCK] = Tag.Ptr(Tag.Byte)
    inline def apply(inline o: Ptr[Byte]): OPENSSL_BLOCK = o
    extension (v: OPENSSL_BLOCK) inline def value: Ptr[Byte] = v

  /** */
  opaque type OPENSSL_CSTRING = CString
  object OPENSSL_CSTRING:
    given _tag: Tag[OPENSSL_CSTRING] = Tag.Ptr[CChar](Tag.Byte)
    inline def apply(inline o: CString): OPENSSL_CSTRING = o
    extension (v: OPENSSL_CSTRING) inline def value: CString = v

  /** */
  opaque type OPENSSL_STRING = CString
  object OPENSSL_STRING:
    given _tag: Tag[OPENSSL_STRING] = Tag.Ptr[CChar](Tag.Byte)
    inline def apply(inline o: CString): OPENSSL_STRING = o
    extension (v: OPENSSL_STRING) inline def value: CString = v

  /** */
  opaque type OPENSSL_sk_compfunc = CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
  object OPENSSL_sk_compfunc:
    given _tag: Tag[OPENSSL_sk_compfunc] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): OPENSSL_sk_compfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
    ): OPENSSL_sk_compfunc = o
    extension (v: OPENSSL_sk_compfunc)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end OPENSSL_sk_compfunc

  /** */
  opaque type OPENSSL_sk_copyfunc = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OPENSSL_sk_copyfunc:
    given _tag: Tag[OPENSSL_sk_copyfunc] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte]): OPENSSL_sk_copyfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OPENSSL_sk_copyfunc = o
    extension (v: OPENSSL_sk_copyfunc)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end OPENSSL_sk_copyfunc

  /** */
  opaque type OPENSSL_sk_freefunc = CFuncPtr1[Ptr[Byte], Unit]
  object OPENSSL_sk_freefunc:
    given _tag: Tag[OPENSSL_sk_freefunc] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): OPENSSL_sk_freefunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OPENSSL_sk_freefunc = o
    extension (v: OPENSSL_sk_freefunc)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end OPENSSL_sk_freefunc

  /** */
  type OSSL_CALLBACK = CFuncPtr2[Ptr[OSSL_PARAM], Ptr[Byte], CInt]
  object OSSL_CALLBACK:
    given _tag: Tag[OSSL_CALLBACK] =
      Tag.materializeCFuncPtr2[Ptr[OSSL_PARAM], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[OSSL_PARAM], Ptr[Byte], CInt]
    ): OSSL_CALLBACK = o
    extension (v: OSSL_CALLBACK)
      inline def value: CFuncPtr2[Ptr[OSSL_PARAM], Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_BIO_ctrl_fn =
    CFuncPtr4[Ptr[OSSL_CORE_BIO], CInt, CLongInt, Ptr[Byte], CInt]
  object OSSL_FUNC_BIO_ctrl_fn:
    given _tag: Tag[OSSL_FUNC_BIO_ctrl_fn] = Tag
      .materializeCFuncPtr4[Ptr[OSSL_CORE_BIO], CInt, CLongInt, Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[OSSL_CORE_BIO], CInt, CLongInt, Ptr[Byte], CInt]
    ): OSSL_FUNC_BIO_ctrl_fn = o
    extension (v: OSSL_FUNC_BIO_ctrl_fn)
      inline def value
          : CFuncPtr4[Ptr[OSSL_CORE_BIO], CInt, CLongInt, Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_BIO_free_fn = CFuncPtr1[Ptr[OSSL_CORE_BIO], CInt]
  object OSSL_FUNC_BIO_free_fn:
    given _tag: Tag[OSSL_FUNC_BIO_free_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_BIO], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_BIO], CInt]
    ): OSSL_FUNC_BIO_free_fn = o
    extension (v: OSSL_FUNC_BIO_free_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_CORE_BIO], CInt] = v

  /** */
  type OSSL_FUNC_BIO_gets_fn =
    CFuncPtr3[Ptr[OSSL_CORE_BIO], CString, CInt, CInt]
  object OSSL_FUNC_BIO_gets_fn:
    given _tag: Tag[OSSL_FUNC_BIO_gets_fn] =
      Tag.materializeCFuncPtr3[Ptr[OSSL_CORE_BIO], CString, CInt, CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[OSSL_CORE_BIO], CString, CInt, CInt]
    ): OSSL_FUNC_BIO_gets_fn = o
    extension (v: OSSL_FUNC_BIO_gets_fn)
      inline def value: CFuncPtr3[Ptr[OSSL_CORE_BIO], CString, CInt, CInt] = v

  /** */
  type OSSL_FUNC_BIO_new_file_fn =
    CFuncPtr2[CString, CString, Ptr[OSSL_CORE_BIO]]
  object OSSL_FUNC_BIO_new_file_fn:
    given _tag: Tag[OSSL_FUNC_BIO_new_file_fn] =
      Tag.materializeCFuncPtr2[CString, CString, Ptr[OSSL_CORE_BIO]]
    inline def apply(
        inline o: CFuncPtr2[CString, CString, Ptr[OSSL_CORE_BIO]]
    ): OSSL_FUNC_BIO_new_file_fn = o
    extension (v: OSSL_FUNC_BIO_new_file_fn)
      inline def value: CFuncPtr2[CString, CString, Ptr[OSSL_CORE_BIO]] = v

  /** */
  type OSSL_FUNC_BIO_new_membuf_fn =
    CFuncPtr2[Ptr[Byte], CInt, Ptr[OSSL_CORE_BIO]]
  object OSSL_FUNC_BIO_new_membuf_fn:
    given _tag: Tag[OSSL_FUNC_BIO_new_membuf_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], CInt, Ptr[OSSL_CORE_BIO]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], CInt, Ptr[OSSL_CORE_BIO]]
    ): OSSL_FUNC_BIO_new_membuf_fn = o
    extension (v: OSSL_FUNC_BIO_new_membuf_fn)
      inline def value: CFuncPtr2[Ptr[Byte], CInt, Ptr[OSSL_CORE_BIO]] = v

  /** */
  type OSSL_FUNC_BIO_puts_fn = CFuncPtr2[Ptr[OSSL_CORE_BIO], CString, CInt]
  object OSSL_FUNC_BIO_puts_fn:
    given _tag: Tag[OSSL_FUNC_BIO_puts_fn] =
      Tag.materializeCFuncPtr2[Ptr[OSSL_CORE_BIO], CString, CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[OSSL_CORE_BIO], CString, CInt]
    ): OSSL_FUNC_BIO_puts_fn = o
    extension (v: OSSL_FUNC_BIO_puts_fn)
      inline def value: CFuncPtr2[Ptr[OSSL_CORE_BIO], CString, CInt] = v

  /** */
  type OSSL_FUNC_BIO_read_ex_fn =
    CFuncPtr4[Ptr[OSSL_CORE_BIO], Ptr[Byte], size_t, Ptr[size_t], CInt]
  object OSSL_FUNC_BIO_read_ex_fn:
    given _tag: Tag[OSSL_FUNC_BIO_read_ex_fn] = Tag.materializeCFuncPtr4[Ptr[
      OSSL_CORE_BIO
    ], Ptr[Byte], size_t, Ptr[size_t], CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[OSSL_CORE_BIO], Ptr[Byte], size_t, Ptr[
          size_t
        ], CInt]
    ): OSSL_FUNC_BIO_read_ex_fn = o
    extension (v: OSSL_FUNC_BIO_read_ex_fn)
      inline def value: CFuncPtr4[Ptr[OSSL_CORE_BIO], Ptr[Byte], size_t, Ptr[
        size_t
      ], CInt] = v
  end OSSL_FUNC_BIO_read_ex_fn

  /** */
  type OSSL_FUNC_BIO_up_ref_fn = CFuncPtr1[Ptr[OSSL_CORE_BIO], CInt]
  object OSSL_FUNC_BIO_up_ref_fn:
    given _tag: Tag[OSSL_FUNC_BIO_up_ref_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_BIO], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_BIO], CInt]
    ): OSSL_FUNC_BIO_up_ref_fn = o
    extension (v: OSSL_FUNC_BIO_up_ref_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_CORE_BIO], CInt] = v

  /** */
  type OSSL_FUNC_BIO_vprintf_fn =
    CFuncPtr3[Ptr[OSSL_CORE_BIO], CString, va_list, CInt]
  object OSSL_FUNC_BIO_vprintf_fn:
    given _tag: Tag[OSSL_FUNC_BIO_vprintf_fn] =
      Tag.materializeCFuncPtr3[Ptr[OSSL_CORE_BIO], CString, va_list, CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[OSSL_CORE_BIO], CString, va_list, CInt]
    ): OSSL_FUNC_BIO_vprintf_fn = o
    extension (v: OSSL_FUNC_BIO_vprintf_fn)
      inline def value: CFuncPtr3[Ptr[OSSL_CORE_BIO], CString, va_list, CInt] =
        v

  /** */
  type OSSL_FUNC_BIO_vsnprintf_fn =
    CFuncPtr4[CString, size_t, CString, va_list, CInt]
  object OSSL_FUNC_BIO_vsnprintf_fn:
    given _tag: Tag[OSSL_FUNC_BIO_vsnprintf_fn] =
      Tag.materializeCFuncPtr4[CString, size_t, CString, va_list, CInt]
    inline def apply(
        inline o: CFuncPtr4[CString, size_t, CString, va_list, CInt]
    ): OSSL_FUNC_BIO_vsnprintf_fn = o
    extension (v: OSSL_FUNC_BIO_vsnprintf_fn)
      inline def value: CFuncPtr4[CString, size_t, CString, va_list, CInt] = v

  /** */
  type OSSL_FUNC_BIO_write_ex_fn =
    CFuncPtr4[Ptr[OSSL_CORE_BIO], Ptr[Byte], size_t, Ptr[size_t], CInt]
  object OSSL_FUNC_BIO_write_ex_fn:
    given _tag: Tag[OSSL_FUNC_BIO_write_ex_fn] = Tag.materializeCFuncPtr4[Ptr[
      OSSL_CORE_BIO
    ], Ptr[Byte], size_t, Ptr[size_t], CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[OSSL_CORE_BIO], Ptr[Byte], size_t, Ptr[
          size_t
        ], CInt]
    ): OSSL_FUNC_BIO_write_ex_fn = o
    extension (v: OSSL_FUNC_BIO_write_ex_fn)
      inline def value: CFuncPtr4[Ptr[OSSL_CORE_BIO], Ptr[Byte], size_t, Ptr[
        size_t
      ], CInt] = v
  end OSSL_FUNC_BIO_write_ex_fn

  /** */
  type OSSL_FUNC_CRYPTO_clear_free_fn =
    CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Unit]
  object OSSL_FUNC_CRYPTO_clear_free_fn:
    given _tag: Tag[OSSL_FUNC_CRYPTO_clear_free_fn] =
      Tag.materializeCFuncPtr4[Ptr[Byte], size_t, CString, CInt, Unit]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Unit]
    ): OSSL_FUNC_CRYPTO_clear_free_fn = o
    extension (v: OSSL_FUNC_CRYPTO_clear_free_fn)
      inline def value: CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Unit] = v

  /** */
  type OSSL_FUNC_CRYPTO_clear_realloc_fn =
    CFuncPtr5[Ptr[Byte], size_t, size_t, CString, CInt, Ptr[Byte]]
  object OSSL_FUNC_CRYPTO_clear_realloc_fn:
    given _tag: Tag[OSSL_FUNC_CRYPTO_clear_realloc_fn] = Tag
      .materializeCFuncPtr5[Ptr[Byte], size_t, size_t, CString, CInt, Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], size_t, size_t, CString, CInt, Ptr[Byte]]
    ): OSSL_FUNC_CRYPTO_clear_realloc_fn = o
    extension (v: OSSL_FUNC_CRYPTO_clear_realloc_fn)
      inline def value
          : CFuncPtr5[Ptr[Byte], size_t, size_t, CString, CInt, Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_CRYPTO_free_fn = CFuncPtr3[Ptr[Byte], CString, CInt, Unit]
  object OSSL_FUNC_CRYPTO_free_fn:
    given _tag: Tag[OSSL_FUNC_CRYPTO_free_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CString, CInt, Unit]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CString, CInt, Unit]
    ): OSSL_FUNC_CRYPTO_free_fn = o
    extension (v: OSSL_FUNC_CRYPTO_free_fn)
      inline def value: CFuncPtr3[Ptr[Byte], CString, CInt, Unit] = v

  /** */
  type OSSL_FUNC_CRYPTO_malloc_fn = CFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
  object OSSL_FUNC_CRYPTO_malloc_fn:
    given _tag: Tag[OSSL_FUNC_CRYPTO_malloc_fn] =
      Tag.materializeCFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
    ): OSSL_FUNC_CRYPTO_malloc_fn = o
    extension (v: OSSL_FUNC_CRYPTO_malloc_fn)
      inline def value: CFuncPtr3[size_t, CString, CInt, Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_CRYPTO_realloc_fn =
    CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Ptr[Byte]]
  object OSSL_FUNC_CRYPTO_realloc_fn:
    given _tag: Tag[OSSL_FUNC_CRYPTO_realloc_fn] =
      Tag.materializeCFuncPtr4[Ptr[Byte], size_t, CString, CInt, Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Ptr[Byte]]
    ): OSSL_FUNC_CRYPTO_realloc_fn = o
    extension (v: OSSL_FUNC_CRYPTO_realloc_fn)
      inline def value: CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Ptr[Byte]] =
        v

  /** */
  type OSSL_FUNC_CRYPTO_secure_allocated_fn = CFuncPtr1[Ptr[Byte], CInt]
  object OSSL_FUNC_CRYPTO_secure_allocated_fn:
    given _tag: Tag[OSSL_FUNC_CRYPTO_secure_allocated_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], CInt]
    ): OSSL_FUNC_CRYPTO_secure_allocated_fn = o
    extension (v: OSSL_FUNC_CRYPTO_secure_allocated_fn)
      inline def value: CFuncPtr1[Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_CRYPTO_secure_clear_free_fn =
    CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Unit]
  object OSSL_FUNC_CRYPTO_secure_clear_free_fn:
    given _tag: Tag[OSSL_FUNC_CRYPTO_secure_clear_free_fn] =
      Tag.materializeCFuncPtr4[Ptr[Byte], size_t, CString, CInt, Unit]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Unit]
    ): OSSL_FUNC_CRYPTO_secure_clear_free_fn = o
    extension (v: OSSL_FUNC_CRYPTO_secure_clear_free_fn)
      inline def value: CFuncPtr4[Ptr[Byte], size_t, CString, CInt, Unit] = v

  /** */
  type OSSL_FUNC_CRYPTO_secure_free_fn =
    CFuncPtr3[Ptr[Byte], CString, CInt, Unit]
  object OSSL_FUNC_CRYPTO_secure_free_fn:
    given _tag: Tag[OSSL_FUNC_CRYPTO_secure_free_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CString, CInt, Unit]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CString, CInt, Unit]
    ): OSSL_FUNC_CRYPTO_secure_free_fn = o
    extension (v: OSSL_FUNC_CRYPTO_secure_free_fn)
      inline def value: CFuncPtr3[Ptr[Byte], CString, CInt, Unit] = v

  /** */
  type OSSL_FUNC_CRYPTO_secure_malloc_fn =
    CFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
  object OSSL_FUNC_CRYPTO_secure_malloc_fn:
    given _tag: Tag[OSSL_FUNC_CRYPTO_secure_malloc_fn] =
      Tag.materializeCFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
    ): OSSL_FUNC_CRYPTO_secure_malloc_fn = o
    extension (v: OSSL_FUNC_CRYPTO_secure_malloc_fn)
      inline def value: CFuncPtr3[size_t, CString, CInt, Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_CRYPTO_secure_zalloc_fn =
    CFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
  object OSSL_FUNC_CRYPTO_secure_zalloc_fn:
    given _tag: Tag[OSSL_FUNC_CRYPTO_secure_zalloc_fn] =
      Tag.materializeCFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
    ): OSSL_FUNC_CRYPTO_secure_zalloc_fn = o
    extension (v: OSSL_FUNC_CRYPTO_secure_zalloc_fn)
      inline def value: CFuncPtr3[size_t, CString, CInt, Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_CRYPTO_zalloc_fn = CFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
  object OSSL_FUNC_CRYPTO_zalloc_fn:
    given _tag: Tag[OSSL_FUNC_CRYPTO_zalloc_fn] =
      Tag.materializeCFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr3[size_t, CString, CInt, Ptr[Byte]]
    ): OSSL_FUNC_CRYPTO_zalloc_fn = o
    extension (v: OSSL_FUNC_CRYPTO_zalloc_fn)
      inline def value: CFuncPtr3[size_t, CString, CInt, Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_OPENSSL_cleanse_fn = CFuncPtr2[Ptr[Byte], size_t, Unit]
  object OSSL_FUNC_OPENSSL_cleanse_fn:
    given _tag: Tag[OSSL_FUNC_OPENSSL_cleanse_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], size_t, Unit]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], size_t, Unit]
    ): OSSL_FUNC_OPENSSL_cleanse_fn = o
    extension (v: OSSL_FUNC_OPENSSL_cleanse_fn)
      inline def value: CFuncPtr2[Ptr[Byte], size_t, Unit] = v

  /** */
  type OSSL_FUNC_asym_cipher_decrypt_fn = CFuncPtr6[Ptr[Byte], Ptr[
    CUnsignedChar
  ], Ptr[size_t], size_t, Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_asym_cipher_decrypt_fn:
    given _tag: Tag[OSSL_FUNC_asym_cipher_decrypt_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_asym_cipher_decrypt_fn = o
    extension (v: OSSL_FUNC_asym_cipher_decrypt_fn)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt] = v
  end OSSL_FUNC_asym_cipher_decrypt_fn

  /** */
  type OSSL_FUNC_asym_cipher_decrypt_init_fn =
    CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_asym_cipher_decrypt_init_fn:
    given _tag: Tag[OSSL_FUNC_asym_cipher_decrypt_init_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_asym_cipher_decrypt_init_fn = o
    extension (v: OSSL_FUNC_asym_cipher_decrypt_init_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt] =
        v

  /** */
  type OSSL_FUNC_asym_cipher_dupctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_asym_cipher_dupctx_fn:
    given _tag: Tag[OSSL_FUNC_asym_cipher_dupctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_asym_cipher_dupctx_fn = o
    extension (v: OSSL_FUNC_asym_cipher_dupctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_asym_cipher_encrypt_fn = CFuncPtr6[Ptr[Byte], Ptr[
    CUnsignedChar
  ], Ptr[size_t], size_t, Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_asym_cipher_encrypt_fn:
    given _tag: Tag[OSSL_FUNC_asym_cipher_encrypt_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_asym_cipher_encrypt_fn = o
    extension (v: OSSL_FUNC_asym_cipher_encrypt_fn)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt] = v
  end OSSL_FUNC_asym_cipher_encrypt_fn

  /** */
  type OSSL_FUNC_asym_cipher_encrypt_init_fn =
    CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_asym_cipher_encrypt_init_fn:
    given _tag: Tag[OSSL_FUNC_asym_cipher_encrypt_init_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_asym_cipher_encrypt_init_fn = o
    extension (v: OSSL_FUNC_asym_cipher_encrypt_init_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt] =
        v

  /** */
  type OSSL_FUNC_asym_cipher_freectx_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_asym_cipher_freectx_fn:
    given _tag: Tag[OSSL_FUNC_asym_cipher_freectx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_asym_cipher_freectx_fn = o
    extension (v: OSSL_FUNC_asym_cipher_freectx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_asym_cipher_get_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_asym_cipher_get_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_asym_cipher_get_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_asym_cipher_get_ctx_params_fn = o
    extension (v: OSSL_FUNC_asym_cipher_get_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_asym_cipher_gettable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_asym_cipher_gettable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_asym_cipher_gettable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_asym_cipher_gettable_ctx_params_fn = o
    extension (v: OSSL_FUNC_asym_cipher_gettable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_asym_cipher_newctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_asym_cipher_newctx_fn:
    given _tag: Tag[OSSL_FUNC_asym_cipher_newctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_asym_cipher_newctx_fn = o
    extension (v: OSSL_FUNC_asym_cipher_newctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_asym_cipher_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_asym_cipher_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_asym_cipher_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_asym_cipher_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_asym_cipher_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_asym_cipher_settable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_asym_cipher_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_asym_cipher_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_asym_cipher_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_asym_cipher_settable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_cipher_cipher_fn = CFuncPtr6[Ptr[Byte], Ptr[
    CUnsignedChar
  ], Ptr[size_t], size_t, Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_cipher_cipher_fn:
    given _tag: Tag[OSSL_FUNC_cipher_cipher_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_cipher_cipher_fn = o
    extension (v: OSSL_FUNC_cipher_cipher_fn)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt] = v
  end OSSL_FUNC_cipher_cipher_fn

  /** */
  type OSSL_FUNC_cipher_decrypt_init_fn = CFuncPtr6[Ptr[Byte], Ptr[
    CUnsignedChar
  ], size_t, Ptr[CUnsignedChar], size_t, Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_cipher_decrypt_init_fn:
    given _tag: Tag[OSSL_FUNC_cipher_decrypt_init_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], size_t, Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
          CUnsignedChar
        ], size_t, Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_cipher_decrypt_init_fn = o
    extension (v: OSSL_FUNC_cipher_decrypt_init_fn)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], size_t, Ptr[OSSL_PARAM], CInt] = v
  end OSSL_FUNC_cipher_decrypt_init_fn

  /** */
  type OSSL_FUNC_cipher_dupctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_cipher_dupctx_fn:
    given _tag: Tag[OSSL_FUNC_cipher_dupctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_cipher_dupctx_fn = o
    extension (v: OSSL_FUNC_cipher_dupctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_cipher_encrypt_init_fn = CFuncPtr6[Ptr[Byte], Ptr[
    CUnsignedChar
  ], size_t, Ptr[CUnsignedChar], size_t, Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_cipher_encrypt_init_fn:
    given _tag: Tag[OSSL_FUNC_cipher_encrypt_init_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], size_t, Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
          CUnsignedChar
        ], size_t, Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_cipher_encrypt_init_fn = o
    extension (v: OSSL_FUNC_cipher_encrypt_init_fn)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], size_t, Ptr[OSSL_PARAM], CInt] = v
  end OSSL_FUNC_cipher_encrypt_init_fn

  /** */
  type OSSL_FUNC_cipher_final_fn =
    CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[size_t], size_t, CInt]
  object OSSL_FUNC_cipher_final_fn:
    given _tag: Tag[OSSL_FUNC_cipher_final_fn] = Tag.materializeCFuncPtr4[Ptr[
      Byte
    ], Ptr[CUnsignedChar], Ptr[size_t], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, CInt]
    ): OSSL_FUNC_cipher_final_fn = o
    extension (v: OSSL_FUNC_cipher_final_fn)
      inline def value: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, CInt] = v
  end OSSL_FUNC_cipher_final_fn

  /** */
  type OSSL_FUNC_cipher_freectx_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_cipher_freectx_fn:
    given _tag: Tag[OSSL_FUNC_cipher_freectx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_cipher_freectx_fn = o
    extension (v: OSSL_FUNC_cipher_freectx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_cipher_get_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_cipher_get_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_cipher_get_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_cipher_get_ctx_params_fn = o
    extension (v: OSSL_FUNC_cipher_get_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_cipher_get_params_fn = CFuncPtr1[Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_cipher_get_params_fn:
    given _tag: Tag[OSSL_FUNC_cipher_get_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_cipher_get_params_fn = o
    extension (v: OSSL_FUNC_cipher_get_params_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_cipher_gettable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_cipher_gettable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_cipher_gettable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_cipher_gettable_ctx_params_fn = o
    extension (v: OSSL_FUNC_cipher_gettable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_cipher_gettable_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_cipher_gettable_params_fn:
    given _tag: Tag[OSSL_FUNC_cipher_gettable_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_cipher_gettable_params_fn = o
    extension (v: OSSL_FUNC_cipher_gettable_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_cipher_newctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_cipher_newctx_fn:
    given _tag: Tag[OSSL_FUNC_cipher_newctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_cipher_newctx_fn = o
    extension (v: OSSL_FUNC_cipher_newctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_cipher_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_cipher_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_cipher_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_cipher_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_cipher_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_cipher_settable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_cipher_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_cipher_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_cipher_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_cipher_settable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_cipher_update_fn = CFuncPtr6[Ptr[Byte], Ptr[
    CUnsignedChar
  ], Ptr[size_t], size_t, Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_cipher_update_fn:
    given _tag: Tag[OSSL_FUNC_cipher_update_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_cipher_update_fn = o
    extension (v: OSSL_FUNC_cipher_update_fn)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt] = v
  end OSSL_FUNC_cipher_update_fn

  /** */
  type OSSL_FUNC_cleanup_entropy_fn =
    CFuncPtr3[Ptr[OSSL_CORE_HANDLE], Ptr[CUnsignedChar], size_t, Unit]
  object OSSL_FUNC_cleanup_entropy_fn:
    given _tag: Tag[OSSL_FUNC_cleanup_entropy_fn] =
      Tag.materializeCFuncPtr3[Ptr[OSSL_CORE_HANDLE], Ptr[
        CUnsignedChar
      ], size_t, Unit]
    inline def apply(
        inline o: CFuncPtr3[Ptr[OSSL_CORE_HANDLE], Ptr[
          CUnsignedChar
        ], size_t, Unit]
    ): OSSL_FUNC_cleanup_entropy_fn = o
    extension (v: OSSL_FUNC_cleanup_entropy_fn)
      inline def value
          : CFuncPtr3[Ptr[OSSL_CORE_HANDLE], Ptr[CUnsignedChar], size_t, Unit] =
        v
  end OSSL_FUNC_cleanup_entropy_fn

  /** */
  type OSSL_FUNC_cleanup_nonce_fn =
    CFuncPtr3[Ptr[OSSL_CORE_HANDLE], Ptr[CUnsignedChar], size_t, Unit]
  object OSSL_FUNC_cleanup_nonce_fn:
    given _tag: Tag[OSSL_FUNC_cleanup_nonce_fn] = Tag.materializeCFuncPtr3[Ptr[
      OSSL_CORE_HANDLE
    ], Ptr[CUnsignedChar], size_t, Unit]
    inline def apply(
        inline o: CFuncPtr3[Ptr[OSSL_CORE_HANDLE], Ptr[
          CUnsignedChar
        ], size_t, Unit]
    ): OSSL_FUNC_cleanup_nonce_fn = o
    extension (v: OSSL_FUNC_cleanup_nonce_fn)
      inline def value
          : CFuncPtr3[Ptr[OSSL_CORE_HANDLE], Ptr[CUnsignedChar], size_t, Unit] =
        v
  end OSSL_FUNC_cleanup_nonce_fn

  /** */
  type OSSL_FUNC_core_clear_last_error_mark_fn =
    CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt]
  object OSSL_FUNC_core_clear_last_error_mark_fn:
    given _tag: Tag[OSSL_FUNC_core_clear_last_error_mark_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt]
    ): OSSL_FUNC_core_clear_last_error_mark_fn = o
    extension (v: OSSL_FUNC_core_clear_last_error_mark_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt] = v

  /** */
  type OSSL_FUNC_core_get_libctx_fn =
    CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OPENSSL_CORE_CTX]]
  object OSSL_FUNC_core_get_libctx_fn:
    given _tag: Tag[OSSL_FUNC_core_get_libctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OPENSSL_CORE_CTX]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OPENSSL_CORE_CTX]]
    ): OSSL_FUNC_core_get_libctx_fn = o
    extension (v: OSSL_FUNC_core_get_libctx_fn)
      inline def value
          : CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OPENSSL_CORE_CTX]] = v

  /** */
  type OSSL_FUNC_core_get_params_fn =
    CFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_core_get_params_fn:
    given _tag: Tag[OSSL_FUNC_core_get_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_core_get_params_fn = o
    extension (v: OSSL_FUNC_core_get_params_fn)
      inline def value
          : CFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_core_gettable_params_fn =
    CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_core_gettable_params_fn:
    given _tag: Tag[OSSL_FUNC_core_gettable_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_core_gettable_params_fn = o
    extension (v: OSSL_FUNC_core_gettable_params_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_core_new_error_fn = CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Unit]
  object OSSL_FUNC_core_new_error_fn:
    given _tag: Tag[OSSL_FUNC_core_new_error_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_HANDLE], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Unit]
    ): OSSL_FUNC_core_new_error_fn = o
    extension (v: OSSL_FUNC_core_new_error_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Unit] = v

  /** */
  type OSSL_FUNC_core_obj_add_sigid_fn =
    CFuncPtr4[Ptr[OSSL_CORE_HANDLE], CString, CString, CString, CInt]
  object OSSL_FUNC_core_obj_add_sigid_fn:
    given _tag: Tag[OSSL_FUNC_core_obj_add_sigid_fn] =
      Tag.materializeCFuncPtr4[Ptr[
        OSSL_CORE_HANDLE
      ], CString, CString, CString, CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[
          OSSL_CORE_HANDLE
        ], CString, CString, CString, CInt]
    ): OSSL_FUNC_core_obj_add_sigid_fn = o
    extension (v: OSSL_FUNC_core_obj_add_sigid_fn)
      inline def value
          : CFuncPtr4[Ptr[OSSL_CORE_HANDLE], CString, CString, CString, CInt] =
        v
  end OSSL_FUNC_core_obj_add_sigid_fn

  /** */
  type OSSL_FUNC_core_obj_create_fn =
    CFuncPtr4[Ptr[OSSL_CORE_HANDLE], CString, CString, CString, CInt]
  object OSSL_FUNC_core_obj_create_fn:
    given _tag: Tag[OSSL_FUNC_core_obj_create_fn] =
      Tag.materializeCFuncPtr4[Ptr[
        OSSL_CORE_HANDLE
      ], CString, CString, CString, CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[
          OSSL_CORE_HANDLE
        ], CString, CString, CString, CInt]
    ): OSSL_FUNC_core_obj_create_fn = o
    extension (v: OSSL_FUNC_core_obj_create_fn)
      inline def value
          : CFuncPtr4[Ptr[OSSL_CORE_HANDLE], CString, CString, CString, CInt] =
        v
  end OSSL_FUNC_core_obj_create_fn

  /** */
  type OSSL_FUNC_core_pop_error_to_mark_fn =
    CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt]
  object OSSL_FUNC_core_pop_error_to_mark_fn:
    given _tag: Tag[OSSL_FUNC_core_pop_error_to_mark_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt]
    ): OSSL_FUNC_core_pop_error_to_mark_fn = o
    extension (v: OSSL_FUNC_core_pop_error_to_mark_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt] = v

  /** */
  type OSSL_FUNC_core_set_error_debug_fn =
    CFuncPtr4[Ptr[OSSL_CORE_HANDLE], CString, CInt, CString, Unit]
  object OSSL_FUNC_core_set_error_debug_fn:
    given _tag: Tag[OSSL_FUNC_core_set_error_debug_fn] = Tag
      .materializeCFuncPtr4[Ptr[OSSL_CORE_HANDLE], CString, CInt, CString, Unit]
    inline def apply(
        inline o: CFuncPtr4[Ptr[OSSL_CORE_HANDLE], CString, CInt, CString, Unit]
    ): OSSL_FUNC_core_set_error_debug_fn = o
    extension (v: OSSL_FUNC_core_set_error_debug_fn)
      inline def value
          : CFuncPtr4[Ptr[OSSL_CORE_HANDLE], CString, CInt, CString, Unit] = v

  /** */
  type OSSL_FUNC_core_set_error_mark_fn = CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt]
  object OSSL_FUNC_core_set_error_mark_fn:
    given _tag: Tag[OSSL_FUNC_core_set_error_mark_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt]
    ): OSSL_FUNC_core_set_error_mark_fn = o
    extension (v: OSSL_FUNC_core_set_error_mark_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CInt] = v

  /** */
  type OSSL_FUNC_core_thread_start_fn = CFuncPtr3[Ptr[
    OSSL_CORE_HANDLE
  ], OSSL_thread_stop_handler_fn, Ptr[Byte], CInt]
  object OSSL_FUNC_core_thread_start_fn:
    given _tag: Tag[OSSL_FUNC_core_thread_start_fn] =
      Tag.materializeCFuncPtr3[Ptr[
        OSSL_CORE_HANDLE
      ], OSSL_thread_stop_handler_fn, Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[
          OSSL_CORE_HANDLE
        ], OSSL_thread_stop_handler_fn, Ptr[Byte], CInt]
    ): OSSL_FUNC_core_thread_start_fn = o
    extension (v: OSSL_FUNC_core_thread_start_fn)
      inline def value: CFuncPtr3[Ptr[
        OSSL_CORE_HANDLE
      ], OSSL_thread_stop_handler_fn, Ptr[Byte], CInt] = v
  end OSSL_FUNC_core_thread_start_fn

  /** */
  type OSSL_FUNC_core_vset_error_fn =
    CFuncPtr4[Ptr[OSSL_CORE_HANDLE], uint32_t, CString, va_list, Unit]
  object OSSL_FUNC_core_vset_error_fn:
    given _tag: Tag[OSSL_FUNC_core_vset_error_fn] =
      Tag.materializeCFuncPtr4[Ptr[
        OSSL_CORE_HANDLE
      ], uint32_t, CString, va_list, Unit]
    inline def apply(
        inline o: CFuncPtr4[Ptr[
          OSSL_CORE_HANDLE
        ], uint32_t, CString, va_list, Unit]
    ): OSSL_FUNC_core_vset_error_fn = o
    extension (v: OSSL_FUNC_core_vset_error_fn)
      inline def value
          : CFuncPtr4[Ptr[OSSL_CORE_HANDLE], uint32_t, CString, va_list, Unit] =
        v
  end OSSL_FUNC_core_vset_error_fn

  /** */
  type OSSL_FUNC_decoder_decode_fn =
    CFuncPtr7[Ptr[Byte], Ptr[OSSL_CORE_BIO], CInt, Ptr[OSSL_CALLBACK], Ptr[
      Byte
    ], Ptr[OSSL_PASSPHRASE_CALLBACK], Ptr[Byte], CInt]
  object OSSL_FUNC_decoder_decode_fn:
    given _tag: Tag[OSSL_FUNC_decoder_decode_fn] =
      Tag.materializeCFuncPtr7[Ptr[Byte], Ptr[OSSL_CORE_BIO], CInt, Ptr[
        OSSL_CALLBACK
      ], Ptr[Byte], Ptr[OSSL_PASSPHRASE_CALLBACK], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr7[Ptr[Byte], Ptr[OSSL_CORE_BIO], CInt, Ptr[
          OSSL_CALLBACK
        ], Ptr[Byte], Ptr[OSSL_PASSPHRASE_CALLBACK], Ptr[Byte], CInt]
    ): OSSL_FUNC_decoder_decode_fn = o
    extension (v: OSSL_FUNC_decoder_decode_fn)
      inline def value: CFuncPtr7[Ptr[Byte], Ptr[OSSL_CORE_BIO], CInt, Ptr[
        OSSL_CALLBACK
      ], Ptr[Byte], Ptr[OSSL_PASSPHRASE_CALLBACK], Ptr[Byte], CInt] = v
  end OSSL_FUNC_decoder_decode_fn

  /** */
  type OSSL_FUNC_decoder_does_selection_fn = CFuncPtr2[Ptr[Byte], CInt, CInt]
  object OSSL_FUNC_decoder_does_selection_fn:
    given _tag: Tag[OSSL_FUNC_decoder_does_selection_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], CInt, CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], CInt, CInt]
    ): OSSL_FUNC_decoder_does_selection_fn = o
    extension (v: OSSL_FUNC_decoder_does_selection_fn)
      inline def value: CFuncPtr2[Ptr[Byte], CInt, CInt] = v

  /** */
  type OSSL_FUNC_decoder_export_object_fn =
    CFuncPtr5[Ptr[Byte], Ptr[Byte], size_t, Ptr[OSSL_CALLBACK], Ptr[Byte], CInt]
  object OSSL_FUNC_decoder_export_object_fn:
    given _tag: Tag[OSSL_FUNC_decoder_export_object_fn] =
      Tag.materializeCFuncPtr5[Ptr[Byte], Ptr[Byte], size_t, Ptr[
        OSSL_CALLBACK
      ], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], Ptr[Byte], size_t, Ptr[
          OSSL_CALLBACK
        ], Ptr[Byte], CInt]
    ): OSSL_FUNC_decoder_export_object_fn = o
    extension (v: OSSL_FUNC_decoder_export_object_fn)
      inline def value: CFuncPtr5[Ptr[Byte], Ptr[Byte], size_t, Ptr[
        OSSL_CALLBACK
      ], Ptr[Byte], CInt] = v
  end OSSL_FUNC_decoder_export_object_fn

  /** */
  type OSSL_FUNC_decoder_freectx_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_decoder_freectx_fn:
    given _tag: Tag[OSSL_FUNC_decoder_freectx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_decoder_freectx_fn = o
    extension (v: OSSL_FUNC_decoder_freectx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_decoder_get_params_fn = CFuncPtr1[Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_decoder_get_params_fn:
    given _tag: Tag[OSSL_FUNC_decoder_get_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_decoder_get_params_fn = o
    extension (v: OSSL_FUNC_decoder_get_params_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_decoder_gettable_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_decoder_gettable_params_fn:
    given _tag: Tag[OSSL_FUNC_decoder_gettable_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_decoder_gettable_params_fn = o
    extension (v: OSSL_FUNC_decoder_gettable_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_decoder_newctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_decoder_newctx_fn:
    given _tag: Tag[OSSL_FUNC_decoder_newctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_decoder_newctx_fn = o
    extension (v: OSSL_FUNC_decoder_newctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_decoder_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_decoder_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_decoder_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_decoder_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_decoder_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_decoder_settable_ctx_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_decoder_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_decoder_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_decoder_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_decoder_settable_ctx_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_digest_digest_fn = CFuncPtr6[Ptr[Byte], Ptr[
    CUnsignedChar
  ], size_t, Ptr[CUnsignedChar], Ptr[size_t], size_t, CInt]
  object OSSL_FUNC_digest_digest_fn:
    given _tag: Tag[OSSL_FUNC_digest_digest_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], Ptr[size_t], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
          CUnsignedChar
        ], Ptr[size_t], size_t, CInt]
    ): OSSL_FUNC_digest_digest_fn = o
    extension (v: OSSL_FUNC_digest_digest_fn)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], Ptr[size_t], size_t, CInt] = v
  end OSSL_FUNC_digest_digest_fn

  /** */
  type OSSL_FUNC_digest_dupctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_digest_dupctx_fn:
    given _tag: Tag[OSSL_FUNC_digest_dupctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_digest_dupctx_fn = o
    extension (v: OSSL_FUNC_digest_dupctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_digest_final_fn =
    CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[size_t], size_t, CInt]
  object OSSL_FUNC_digest_final_fn:
    given _tag: Tag[OSSL_FUNC_digest_final_fn] = Tag.materializeCFuncPtr4[Ptr[
      Byte
    ], Ptr[CUnsignedChar], Ptr[size_t], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, CInt]
    ): OSSL_FUNC_digest_final_fn = o
    extension (v: OSSL_FUNC_digest_final_fn)
      inline def value: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, CInt] = v
  end OSSL_FUNC_digest_final_fn

  /** */
  type OSSL_FUNC_digest_freectx_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_digest_freectx_fn:
    given _tag: Tag[OSSL_FUNC_digest_freectx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_digest_freectx_fn = o
    extension (v: OSSL_FUNC_digest_freectx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_digest_get_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_digest_get_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_digest_get_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_digest_get_ctx_params_fn = o
    extension (v: OSSL_FUNC_digest_get_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_digest_get_params_fn = CFuncPtr1[Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_digest_get_params_fn:
    given _tag: Tag[OSSL_FUNC_digest_get_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_digest_get_params_fn = o
    extension (v: OSSL_FUNC_digest_get_params_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_digest_gettable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_digest_gettable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_digest_gettable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_digest_gettable_ctx_params_fn = o
    extension (v: OSSL_FUNC_digest_gettable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_digest_gettable_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_digest_gettable_params_fn:
    given _tag: Tag[OSSL_FUNC_digest_gettable_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_digest_gettable_params_fn = o
    extension (v: OSSL_FUNC_digest_gettable_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_digest_init_fn = CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_digest_init_fn:
    given _tag: Tag[OSSL_FUNC_digest_init_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_digest_init_fn = o
    extension (v: OSSL_FUNC_digest_init_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_digest_newctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_digest_newctx_fn:
    given _tag: Tag[OSSL_FUNC_digest_newctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_digest_newctx_fn = o
    extension (v: OSSL_FUNC_digest_newctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_digest_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_digest_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_digest_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_digest_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_digest_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_digest_settable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_digest_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_digest_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_digest_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_digest_settable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_digest_update_fn =
    CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_digest_update_fn:
    given _tag: Tag[OSSL_FUNC_digest_update_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_digest_update_fn = o
    extension (v: OSSL_FUNC_digest_update_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt] =
        v

  /** */
  type OSSL_FUNC_encoder_does_selection_fn = CFuncPtr2[Ptr[Byte], CInt, CInt]
  object OSSL_FUNC_encoder_does_selection_fn:
    given _tag: Tag[OSSL_FUNC_encoder_does_selection_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], CInt, CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], CInt, CInt]
    ): OSSL_FUNC_encoder_does_selection_fn = o
    extension (v: OSSL_FUNC_encoder_does_selection_fn)
      inline def value: CFuncPtr2[Ptr[Byte], CInt, CInt] = v

  /** */
  type OSSL_FUNC_encoder_encode_fn =
    CFuncPtr7[Ptr[Byte], Ptr[OSSL_CORE_BIO], Ptr[Byte], Ptr[
      OSSL_PARAM
    ], CInt, Ptr[OSSL_PASSPHRASE_CALLBACK], Ptr[Byte], CInt]
  object OSSL_FUNC_encoder_encode_fn:
    given _tag: Tag[OSSL_FUNC_encoder_encode_fn] =
      Tag.materializeCFuncPtr7[Ptr[Byte], Ptr[OSSL_CORE_BIO], Ptr[Byte], Ptr[
        OSSL_PARAM
      ], CInt, Ptr[OSSL_PASSPHRASE_CALLBACK], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr7[Ptr[Byte], Ptr[OSSL_CORE_BIO], Ptr[Byte], Ptr[
          OSSL_PARAM
        ], CInt, Ptr[OSSL_PASSPHRASE_CALLBACK], Ptr[Byte], CInt]
    ): OSSL_FUNC_encoder_encode_fn = o
    extension (v: OSSL_FUNC_encoder_encode_fn)
      inline def value: CFuncPtr7[Ptr[Byte], Ptr[OSSL_CORE_BIO], Ptr[Byte], Ptr[
        OSSL_PARAM
      ], CInt, Ptr[OSSL_PASSPHRASE_CALLBACK], Ptr[Byte], CInt] = v
  end OSSL_FUNC_encoder_encode_fn

  /** */
  type OSSL_FUNC_encoder_free_object_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_encoder_free_object_fn:
    given _tag: Tag[OSSL_FUNC_encoder_free_object_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_encoder_free_object_fn = o
    extension (v: OSSL_FUNC_encoder_free_object_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_encoder_freectx_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_encoder_freectx_fn:
    given _tag: Tag[OSSL_FUNC_encoder_freectx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_encoder_freectx_fn = o
    extension (v: OSSL_FUNC_encoder_freectx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_encoder_get_params_fn = CFuncPtr1[Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_encoder_get_params_fn:
    given _tag: Tag[OSSL_FUNC_encoder_get_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_encoder_get_params_fn = o
    extension (v: OSSL_FUNC_encoder_get_params_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_encoder_gettable_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_encoder_gettable_params_fn:
    given _tag: Tag[OSSL_FUNC_encoder_gettable_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_encoder_gettable_params_fn = o
    extension (v: OSSL_FUNC_encoder_gettable_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_encoder_import_object_fn =
    CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], Ptr[Byte]]
  object OSSL_FUNC_encoder_import_object_fn:
    given _tag: Tag[OSSL_FUNC_encoder_import_object_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], Ptr[Byte]]
    ): OSSL_FUNC_encoder_import_object_fn = o
    extension (v: OSSL_FUNC_encoder_import_object_fn)
      inline def value: CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], Ptr[Byte]] =
        v

  /** */
  type OSSL_FUNC_encoder_newctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_encoder_newctx_fn:
    given _tag: Tag[OSSL_FUNC_encoder_newctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_encoder_newctx_fn = o
    extension (v: OSSL_FUNC_encoder_newctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_encoder_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_encoder_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_encoder_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_encoder_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_encoder_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_encoder_settable_ctx_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_encoder_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_encoder_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_encoder_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_encoder_settable_ctx_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_get_entropy_fn = CFuncPtr5[Ptr[OSSL_CORE_HANDLE], Ptr[
    Ptr[CUnsignedChar]
  ], CInt, size_t, size_t, size_t]
  object OSSL_FUNC_get_entropy_fn:
    given _tag: Tag[OSSL_FUNC_get_entropy_fn] = Tag.materializeCFuncPtr5[Ptr[
      OSSL_CORE_HANDLE
    ], Ptr[Ptr[CUnsignedChar]], CInt, size_t, size_t, size_t]
    inline def apply(
        inline o: CFuncPtr5[Ptr[OSSL_CORE_HANDLE], Ptr[
          Ptr[CUnsignedChar]
        ], CInt, size_t, size_t, size_t]
    ): OSSL_FUNC_get_entropy_fn = o
    extension (v: OSSL_FUNC_get_entropy_fn)
      inline def value: CFuncPtr5[Ptr[OSSL_CORE_HANDLE], Ptr[
        Ptr[CUnsignedChar]
      ], CInt, size_t, size_t, size_t] = v
  end OSSL_FUNC_get_entropy_fn

  /** */
  type OSSL_FUNC_get_nonce_fn = CFuncPtr6[Ptr[OSSL_CORE_HANDLE], Ptr[
    Ptr[CUnsignedChar]
  ], size_t, size_t, Ptr[Byte], size_t, size_t]
  object OSSL_FUNC_get_nonce_fn:
    given _tag: Tag[OSSL_FUNC_get_nonce_fn] = Tag.materializeCFuncPtr6[Ptr[
      OSSL_CORE_HANDLE
    ], Ptr[Ptr[CUnsignedChar]], size_t, size_t, Ptr[Byte], size_t, size_t]
    inline def apply(
        inline o: CFuncPtr6[Ptr[OSSL_CORE_HANDLE], Ptr[
          Ptr[CUnsignedChar]
        ], size_t, size_t, Ptr[Byte], size_t, size_t]
    ): OSSL_FUNC_get_nonce_fn = o
    extension (v: OSSL_FUNC_get_nonce_fn)
      inline def value: CFuncPtr6[Ptr[OSSL_CORE_HANDLE], Ptr[
        Ptr[CUnsignedChar]
      ], size_t, size_t, Ptr[Byte], size_t, size_t] = v
  end OSSL_FUNC_get_nonce_fn

  /** */
  type OSSL_FUNC_kdf_derive_fn =
    CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_kdf_derive_fn:
    given _tag: Tag[OSSL_FUNC_kdf_derive_fn] = Tag.materializeCFuncPtr4[Ptr[
      Byte
    ], Ptr[CUnsignedChar], size_t, Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
          OSSL_PARAM
        ], CInt]
    ): OSSL_FUNC_kdf_derive_fn = o
    extension (v: OSSL_FUNC_kdf_derive_fn)
      inline def value: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        OSSL_PARAM
      ], CInt] = v
  end OSSL_FUNC_kdf_derive_fn

  /** */
  type OSSL_FUNC_kdf_dupctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_kdf_dupctx_fn:
    given _tag: Tag[OSSL_FUNC_kdf_dupctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_kdf_dupctx_fn = o
    extension (v: OSSL_FUNC_kdf_dupctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_kdf_freectx_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_kdf_freectx_fn:
    given _tag: Tag[OSSL_FUNC_kdf_freectx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_kdf_freectx_fn = o
    extension (v: OSSL_FUNC_kdf_freectx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_kdf_get_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_kdf_get_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_kdf_get_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_kdf_get_ctx_params_fn = o
    extension (v: OSSL_FUNC_kdf_get_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_kdf_get_params_fn = CFuncPtr1[Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_kdf_get_params_fn:
    given _tag: Tag[OSSL_FUNC_kdf_get_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_kdf_get_params_fn = o
    extension (v: OSSL_FUNC_kdf_get_params_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_kdf_gettable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_kdf_gettable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_kdf_gettable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_kdf_gettable_ctx_params_fn = o
    extension (v: OSSL_FUNC_kdf_gettable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_kdf_gettable_params_fn = CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_kdf_gettable_params_fn:
    given _tag: Tag[OSSL_FUNC_kdf_gettable_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_kdf_gettable_params_fn = o
    extension (v: OSSL_FUNC_kdf_gettable_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_kdf_newctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_kdf_newctx_fn:
    given _tag: Tag[OSSL_FUNC_kdf_newctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_kdf_newctx_fn = o
    extension (v: OSSL_FUNC_kdf_newctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_kdf_reset_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_kdf_reset_fn:
    given _tag: Tag[OSSL_FUNC_kdf_reset_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_kdf_reset_fn = o
    extension (v: OSSL_FUNC_kdf_reset_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_kdf_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_kdf_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_kdf_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_kdf_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_kdf_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_kdf_settable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_kdf_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_kdf_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_kdf_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_kdf_settable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_kem_decapsulate_fn = CFuncPtr5[Ptr[Byte], Ptr[
    CUnsignedChar
  ], Ptr[size_t], Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_kem_decapsulate_fn:
    given _tag: Tag[OSSL_FUNC_kem_decapsulate_fn] =
      Tag.materializeCFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], Ptr[size_t], Ptr[
        CUnsignedChar
      ], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], Ptr[size_t], Ptr[
          CUnsignedChar
        ], size_t, CInt]
    ): OSSL_FUNC_kem_decapsulate_fn = o
    extension (v: OSSL_FUNC_kem_decapsulate_fn)
      inline def value: CFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[CUnsignedChar], size_t, CInt] = v
  end OSSL_FUNC_kem_decapsulate_fn

  /** */
  type OSSL_FUNC_kem_decapsulate_init_fn =
    CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_kem_decapsulate_init_fn:
    given _tag: Tag[OSSL_FUNC_kem_decapsulate_init_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_kem_decapsulate_init_fn = o
    extension (v: OSSL_FUNC_kem_decapsulate_init_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt] =
        v

  /** */
  type OSSL_FUNC_kem_dupctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_kem_dupctx_fn:
    given _tag: Tag[OSSL_FUNC_kem_dupctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_kem_dupctx_fn = o
    extension (v: OSSL_FUNC_kem_dupctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_kem_encapsulate_fn = CFuncPtr5[Ptr[Byte], Ptr[
    CUnsignedChar
  ], Ptr[size_t], Ptr[CUnsignedChar], Ptr[size_t], CInt]
  object OSSL_FUNC_kem_encapsulate_fn:
    given _tag: Tag[OSSL_FUNC_kem_encapsulate_fn] =
      Tag.materializeCFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], Ptr[size_t], Ptr[
        CUnsignedChar
      ], Ptr[size_t], CInt]
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], Ptr[size_t], Ptr[
          CUnsignedChar
        ], Ptr[size_t], CInt]
    ): OSSL_FUNC_kem_encapsulate_fn = o
    extension (v: OSSL_FUNC_kem_encapsulate_fn)
      inline def value: CFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[CUnsignedChar], Ptr[size_t], CInt] = v
  end OSSL_FUNC_kem_encapsulate_fn

  /** */
  type OSSL_FUNC_kem_encapsulate_init_fn =
    CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_kem_encapsulate_init_fn:
    given _tag: Tag[OSSL_FUNC_kem_encapsulate_init_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_kem_encapsulate_init_fn = o
    extension (v: OSSL_FUNC_kem_encapsulate_init_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt] =
        v

  /** */
  type OSSL_FUNC_kem_freectx_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_kem_freectx_fn:
    given _tag: Tag[OSSL_FUNC_kem_freectx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_kem_freectx_fn = o
    extension (v: OSSL_FUNC_kem_freectx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_kem_get_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_kem_get_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_kem_get_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_kem_get_ctx_params_fn = o
    extension (v: OSSL_FUNC_kem_get_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_kem_gettable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_kem_gettable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_kem_gettable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_kem_gettable_ctx_params_fn = o
    extension (v: OSSL_FUNC_kem_gettable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_kem_newctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_kem_newctx_fn:
    given _tag: Tag[OSSL_FUNC_kem_newctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_kem_newctx_fn = o
    extension (v: OSSL_FUNC_kem_newctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_kem_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_kem_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_kem_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_kem_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_kem_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_kem_settable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_kem_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_kem_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_kem_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_kem_settable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_keyexch_derive_fn =
    CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[size_t], size_t, CInt]
  object OSSL_FUNC_keyexch_derive_fn:
    given _tag: Tag[OSSL_FUNC_keyexch_derive_fn] = Tag.materializeCFuncPtr4[Ptr[
      Byte
    ], Ptr[CUnsignedChar], Ptr[size_t], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, CInt]
    ): OSSL_FUNC_keyexch_derive_fn = o
    extension (v: OSSL_FUNC_keyexch_derive_fn)
      inline def value: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, CInt] = v
  end OSSL_FUNC_keyexch_derive_fn

  /** */
  type OSSL_FUNC_keyexch_dupctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_keyexch_dupctx_fn:
    given _tag: Tag[OSSL_FUNC_keyexch_dupctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_keyexch_dupctx_fn = o
    extension (v: OSSL_FUNC_keyexch_dupctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_keyexch_freectx_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_keyexch_freectx_fn:
    given _tag: Tag[OSSL_FUNC_keyexch_freectx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_keyexch_freectx_fn = o
    extension (v: OSSL_FUNC_keyexch_freectx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_keyexch_get_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_keyexch_get_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_keyexch_get_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_keyexch_get_ctx_params_fn = o
    extension (v: OSSL_FUNC_keyexch_get_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_keyexch_gettable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_keyexch_gettable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_keyexch_gettable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_keyexch_gettable_ctx_params_fn = o
    extension (v: OSSL_FUNC_keyexch_gettable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_keyexch_init_fn =
    CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_keyexch_init_fn:
    given _tag: Tag[OSSL_FUNC_keyexch_init_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_keyexch_init_fn = o
    extension (v: OSSL_FUNC_keyexch_init_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt] =
        v

  /** */
  type OSSL_FUNC_keyexch_newctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_keyexch_newctx_fn:
    given _tag: Tag[OSSL_FUNC_keyexch_newctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_keyexch_newctx_fn = o
    extension (v: OSSL_FUNC_keyexch_newctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_keyexch_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_keyexch_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_keyexch_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_keyexch_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_keyexch_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_keyexch_set_peer_fn = CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
  object OSSL_FUNC_keyexch_set_peer_fn:
    given _tag: Tag[OSSL_FUNC_keyexch_set_peer_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
    ): OSSL_FUNC_keyexch_set_peer_fn = o
    extension (v: OSSL_FUNC_keyexch_set_peer_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_keyexch_settable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_keyexch_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_keyexch_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_keyexch_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_keyexch_settable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_keymgmt_dup_fn = CFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]]
  object OSSL_FUNC_keymgmt_dup_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_dup_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]]
    ): OSSL_FUNC_keymgmt_dup_fn = o
    extension (v: OSSL_FUNC_keymgmt_dup_fn)
      inline def value: CFuncPtr2[Ptr[Byte], CInt, Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_keymgmt_export_fn =
    CFuncPtr4[Ptr[Byte], CInt, Ptr[OSSL_CALLBACK], Ptr[Byte], CInt]
  object OSSL_FUNC_keymgmt_export_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_export_fn] = Tag.materializeCFuncPtr4[Ptr[
      Byte
    ], CInt, Ptr[OSSL_CALLBACK], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], CInt, Ptr[OSSL_CALLBACK], Ptr[
          Byte
        ], CInt]
    ): OSSL_FUNC_keymgmt_export_fn = o
    extension (v: OSSL_FUNC_keymgmt_export_fn)
      inline def value
          : CFuncPtr4[Ptr[Byte], CInt, Ptr[OSSL_CALLBACK], Ptr[Byte], CInt] = v
  end OSSL_FUNC_keymgmt_export_fn

  /** */
  type OSSL_FUNC_keymgmt_export_types_fn = CFuncPtr1[CInt, Ptr[OSSL_PARAM]]
  object OSSL_FUNC_keymgmt_export_types_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_export_types_fn] =
      Tag.materializeCFuncPtr1[CInt, Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[CInt, Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_keymgmt_export_types_fn = o
    extension (v: OSSL_FUNC_keymgmt_export_types_fn)
      inline def value: CFuncPtr1[CInt, Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_keymgmt_free_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_keymgmt_free_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_free_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_keymgmt_free_fn = o
    extension (v: OSSL_FUNC_keymgmt_free_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_keymgmt_gen_cleanup_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_keymgmt_gen_cleanup_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_gen_cleanup_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_keymgmt_gen_cleanup_fn = o
    extension (v: OSSL_FUNC_keymgmt_gen_cleanup_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_keymgmt_gen_fn =
    CFuncPtr3[Ptr[Byte], Ptr[OSSL_CALLBACK], Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_keymgmt_gen_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_gen_fn] = Tag
      .materializeCFuncPtr3[Ptr[Byte], Ptr[OSSL_CALLBACK], Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[OSSL_CALLBACK], Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_keymgmt_gen_fn = o
    extension (v: OSSL_FUNC_keymgmt_gen_fn)
      inline def value
          : CFuncPtr3[Ptr[Byte], Ptr[OSSL_CALLBACK], Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_keymgmt_gen_init_fn =
    CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], Ptr[Byte]]
  object OSSL_FUNC_keymgmt_gen_init_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_gen_init_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], Ptr[Byte]]
    ): OSSL_FUNC_keymgmt_gen_init_fn = o
    extension (v: OSSL_FUNC_keymgmt_gen_init_fn)
      inline def value: CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], Ptr[Byte]] =
        v

  /** */
  type OSSL_FUNC_keymgmt_gen_set_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_keymgmt_gen_set_params_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_gen_set_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_keymgmt_gen_set_params_fn = o
    extension (v: OSSL_FUNC_keymgmt_gen_set_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_keymgmt_gen_set_template_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
  object OSSL_FUNC_keymgmt_gen_set_template_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_gen_set_template_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
    ): OSSL_FUNC_keymgmt_gen_set_template_fn = o
    extension (v: OSSL_FUNC_keymgmt_gen_set_template_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_keymgmt_gen_settable_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_keymgmt_gen_settable_params_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_gen_settable_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_keymgmt_gen_settable_params_fn = o
    extension (v: OSSL_FUNC_keymgmt_gen_settable_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_keymgmt_get_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_keymgmt_get_params_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_get_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_keymgmt_get_params_fn = o
    extension (v: OSSL_FUNC_keymgmt_get_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_keymgmt_gettable_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_keymgmt_gettable_params_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_gettable_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_keymgmt_gettable_params_fn = o
    extension (v: OSSL_FUNC_keymgmt_gettable_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_keymgmt_has_fn = CFuncPtr2[Ptr[Byte], CInt, CInt]
  object OSSL_FUNC_keymgmt_has_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_has_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], CInt, CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], CInt, CInt]
    ): OSSL_FUNC_keymgmt_has_fn = o
    extension (v: OSSL_FUNC_keymgmt_has_fn)
      inline def value: CFuncPtr2[Ptr[Byte], CInt, CInt] = v

  /** */
  type OSSL_FUNC_keymgmt_import_fn =
    CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_keymgmt_import_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_import_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_keymgmt_import_fn = o
    extension (v: OSSL_FUNC_keymgmt_import_fn)
      inline def value: CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_keymgmt_import_types_fn = CFuncPtr1[CInt, Ptr[OSSL_PARAM]]
  object OSSL_FUNC_keymgmt_import_types_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_import_types_fn] =
      Tag.materializeCFuncPtr1[CInt, Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[CInt, Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_keymgmt_import_types_fn = o
    extension (v: OSSL_FUNC_keymgmt_import_types_fn)
      inline def value: CFuncPtr1[CInt, Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_keymgmt_load_fn = CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]
  object OSSL_FUNC_keymgmt_load_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_load_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]
    ): OSSL_FUNC_keymgmt_load_fn = o
    extension (v: OSSL_FUNC_keymgmt_load_fn)
      inline def value: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_keymgmt_match_fn = CFuncPtr3[Ptr[Byte], Ptr[Byte], CInt, CInt]
  object OSSL_FUNC_keymgmt_match_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_match_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], CInt, CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], CInt, CInt]
    ): OSSL_FUNC_keymgmt_match_fn = o
    extension (v: OSSL_FUNC_keymgmt_match_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[Byte], CInt, CInt] = v

  /** */
  type OSSL_FUNC_keymgmt_new_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_keymgmt_new_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_new_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_keymgmt_new_fn = o
    extension (v: OSSL_FUNC_keymgmt_new_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_keymgmt_query_operation_name_fn = CFuncPtr1[CInt, CString]
  object OSSL_FUNC_keymgmt_query_operation_name_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_query_operation_name_fn] =
      Tag.materializeCFuncPtr1[CInt, CString]
    inline def apply(
        inline o: CFuncPtr1[CInt, CString]
    ): OSSL_FUNC_keymgmt_query_operation_name_fn = o
    extension (v: OSSL_FUNC_keymgmt_query_operation_name_fn)
      inline def value: CFuncPtr1[CInt, CString] = v

  /** */
  type OSSL_FUNC_keymgmt_set_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_keymgmt_set_params_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_set_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_keymgmt_set_params_fn = o
    extension (v: OSSL_FUNC_keymgmt_set_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_keymgmt_settable_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_keymgmt_settable_params_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_settable_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_keymgmt_settable_params_fn = o
    extension (v: OSSL_FUNC_keymgmt_settable_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_keymgmt_validate_fn = CFuncPtr3[Ptr[Byte], CInt, CInt, CInt]
  object OSSL_FUNC_keymgmt_validate_fn:
    given _tag: Tag[OSSL_FUNC_keymgmt_validate_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CInt, CInt, CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CInt, CInt, CInt]
    ): OSSL_FUNC_keymgmt_validate_fn = o
    extension (v: OSSL_FUNC_keymgmt_validate_fn)
      inline def value: CFuncPtr3[Ptr[Byte], CInt, CInt, CInt] = v

  /** */
  type OSSL_FUNC_mac_dupctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_mac_dupctx_fn:
    given _tag: Tag[OSSL_FUNC_mac_dupctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_mac_dupctx_fn = o
    extension (v: OSSL_FUNC_mac_dupctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_mac_final_fn =
    CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[size_t], size_t, CInt]
  object OSSL_FUNC_mac_final_fn:
    given _tag: Tag[OSSL_FUNC_mac_final_fn] = Tag.materializeCFuncPtr4[Ptr[
      Byte
    ], Ptr[CUnsignedChar], Ptr[size_t], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, CInt]
    ): OSSL_FUNC_mac_final_fn = o
    extension (v: OSSL_FUNC_mac_final_fn)
      inline def value: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, CInt] = v
  end OSSL_FUNC_mac_final_fn

  /** */
  type OSSL_FUNC_mac_freectx_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_mac_freectx_fn:
    given _tag: Tag[OSSL_FUNC_mac_freectx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_mac_freectx_fn = o
    extension (v: OSSL_FUNC_mac_freectx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_mac_get_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_mac_get_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_mac_get_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_mac_get_ctx_params_fn = o
    extension (v: OSSL_FUNC_mac_get_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_mac_get_params_fn = CFuncPtr1[Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_mac_get_params_fn:
    given _tag: Tag[OSSL_FUNC_mac_get_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_mac_get_params_fn = o
    extension (v: OSSL_FUNC_mac_get_params_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_mac_gettable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_mac_gettable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_mac_gettable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_mac_gettable_ctx_params_fn = o
    extension (v: OSSL_FUNC_mac_gettable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_mac_gettable_params_fn = CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_mac_gettable_params_fn:
    given _tag: Tag[OSSL_FUNC_mac_gettable_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_mac_gettable_params_fn = o
    extension (v: OSSL_FUNC_mac_gettable_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_mac_init_fn =
    CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_mac_init_fn:
    given _tag: Tag[OSSL_FUNC_mac_init_fn] = Tag.materializeCFuncPtr4[Ptr[
      Byte
    ], Ptr[CUnsignedChar], size_t, Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
          OSSL_PARAM
        ], CInt]
    ): OSSL_FUNC_mac_init_fn = o
    extension (v: OSSL_FUNC_mac_init_fn)
      inline def value: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        OSSL_PARAM
      ], CInt] = v
  end OSSL_FUNC_mac_init_fn

  /** */
  type OSSL_FUNC_mac_newctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_mac_newctx_fn:
    given _tag: Tag[OSSL_FUNC_mac_newctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_mac_newctx_fn = o
    extension (v: OSSL_FUNC_mac_newctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_mac_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_mac_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_mac_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_mac_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_mac_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_mac_settable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_mac_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_mac_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_mac_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_mac_settable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_mac_update_fn =
    CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_mac_update_fn:
    given _tag: Tag[OSSL_FUNC_mac_update_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_mac_update_fn = o
    extension (v: OSSL_FUNC_mac_update_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt] =
        v

  /** */
  type OSSL_FUNC_provider_deregister_child_cb_fn =
    CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Unit]
  object OSSL_FUNC_provider_deregister_child_cb_fn:
    given _tag: Tag[OSSL_FUNC_provider_deregister_child_cb_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_HANDLE], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Unit]
    ): OSSL_FUNC_provider_deregister_child_cb_fn = o
    extension (v: OSSL_FUNC_provider_deregister_child_cb_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Unit] = v

  /** */
  type OSSL_FUNC_provider_free_fn = CFuncPtr2[Ptr[OSSL_CORE_HANDLE], CInt, CInt]
  object OSSL_FUNC_provider_free_fn:
    given _tag: Tag[OSSL_FUNC_provider_free_fn] =
      Tag.materializeCFuncPtr2[Ptr[OSSL_CORE_HANDLE], CInt, CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[OSSL_CORE_HANDLE], CInt, CInt]
    ): OSSL_FUNC_provider_free_fn = o
    extension (v: OSSL_FUNC_provider_free_fn)
      inline def value: CFuncPtr2[Ptr[OSSL_CORE_HANDLE], CInt, CInt] = v

  /** */
  type OSSL_FUNC_provider_get0_dispatch_fn =
    CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_DISPATCH]]
  object OSSL_FUNC_provider_get0_dispatch_fn:
    given _tag: Tag[OSSL_FUNC_provider_get0_dispatch_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_DISPATCH]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_DISPATCH]]
    ): OSSL_FUNC_provider_get0_dispatch_fn = o
    extension (v: OSSL_FUNC_provider_get0_dispatch_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_DISPATCH]] = v

  /** */
  type OSSL_FUNC_provider_get0_provider_ctx_fn =
    CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[Byte]]
  object OSSL_FUNC_provider_get0_provider_ctx_fn:
    given _tag: Tag[OSSL_FUNC_provider_get0_provider_ctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[Byte]]
    ): OSSL_FUNC_provider_get0_provider_ctx_fn = o
    extension (v: OSSL_FUNC_provider_get0_provider_ctx_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_provider_get_capabilities_fn =
    CFuncPtr4[Ptr[Byte], CString, Ptr[OSSL_CALLBACK], Ptr[Byte], CInt]
  object OSSL_FUNC_provider_get_capabilities_fn:
    given _tag: Tag[OSSL_FUNC_provider_get_capabilities_fn] =
      Tag.materializeCFuncPtr4[Ptr[Byte], CString, Ptr[OSSL_CALLBACK], Ptr[
        Byte
      ], CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], CString, Ptr[OSSL_CALLBACK], Ptr[
          Byte
        ], CInt]
    ): OSSL_FUNC_provider_get_capabilities_fn = o
    extension (v: OSSL_FUNC_provider_get_capabilities_fn)
      inline def value
          : CFuncPtr4[Ptr[Byte], CString, Ptr[OSSL_CALLBACK], Ptr[Byte], CInt] =
        v
  end OSSL_FUNC_provider_get_capabilities_fn

  /** */
  type OSSL_FUNC_provider_get_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_provider_get_params_fn:
    given _tag: Tag[OSSL_FUNC_provider_get_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_provider_get_params_fn = o
    extension (v: OSSL_FUNC_provider_get_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_provider_get_reason_strings_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_ITEM]]
  object OSSL_FUNC_provider_get_reason_strings_fn:
    given _tag: Tag[OSSL_FUNC_provider_get_reason_strings_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_ITEM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_ITEM]]
    ): OSSL_FUNC_provider_get_reason_strings_fn = o
    extension (v: OSSL_FUNC_provider_get_reason_strings_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_ITEM]] = v

  /** */
  type OSSL_FUNC_provider_gettable_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_provider_gettable_params_fn:
    given _tag: Tag[OSSL_FUNC_provider_gettable_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_provider_gettable_params_fn = o
    extension (v: OSSL_FUNC_provider_gettable_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_provider_name_fn = CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CString]
  object OSSL_FUNC_provider_name_fn:
    given _tag: Tag[OSSL_FUNC_provider_name_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_CORE_HANDLE], CString]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CString]
    ): OSSL_FUNC_provider_name_fn = o
    extension (v: OSSL_FUNC_provider_name_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_CORE_HANDLE], CString] = v

  /** */
  type OSSL_FUNC_provider_query_operation_fn =
    CFuncPtr3[Ptr[Byte], CInt, Ptr[CInt], Ptr[OSSL_ALGORITHM]]
  object OSSL_FUNC_provider_query_operation_fn:
    given _tag: Tag[OSSL_FUNC_provider_query_operation_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CInt, Ptr[CInt], Ptr[OSSL_ALGORITHM]]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CInt, Ptr[CInt], Ptr[OSSL_ALGORITHM]]
    ): OSSL_FUNC_provider_query_operation_fn = o
    extension (v: OSSL_FUNC_provider_query_operation_fn)
      inline def value
          : CFuncPtr3[Ptr[Byte], CInt, Ptr[CInt], Ptr[OSSL_ALGORITHM]] = v

  /** */
  type OSSL_FUNC_provider_register_child_cb_fn = CFuncPtr5[
    Ptr[OSSL_CORE_HANDLE],
    CFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[Byte], CInt],
    CFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[Byte], CInt],
    CFuncPtr2[CString, Ptr[Byte], CInt],
    Ptr[Byte],
    CInt
  ]
  object OSSL_FUNC_provider_register_child_cb_fn:
    given _tag: Tag[OSSL_FUNC_provider_register_child_cb_fn] =
      Tag.materializeCFuncPtr5[
        Ptr[OSSL_CORE_HANDLE],
        CFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[Byte], CInt],
        CFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[Byte], CInt],
        CFuncPtr2[CString, Ptr[Byte], CInt],
        Ptr[Byte],
        CInt
      ]
    inline def apply(
        inline o: CFuncPtr5[
          Ptr[OSSL_CORE_HANDLE],
          CFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[Byte], CInt],
          CFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[Byte], CInt],
          CFuncPtr2[CString, Ptr[Byte], CInt],
          Ptr[Byte],
          CInt
        ]
    ): OSSL_FUNC_provider_register_child_cb_fn = o
    extension (v: OSSL_FUNC_provider_register_child_cb_fn)
      inline def value: CFuncPtr5[
        Ptr[OSSL_CORE_HANDLE],
        CFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[Byte], CInt],
        CFuncPtr2[Ptr[OSSL_CORE_HANDLE], Ptr[Byte], CInt],
        CFuncPtr2[CString, Ptr[Byte], CInt],
        Ptr[Byte],
        CInt
      ] = v
  end OSSL_FUNC_provider_register_child_cb_fn

  /** */
  type OSSL_FUNC_provider_self_test_fn = CFuncPtr1[Ptr[Byte], CInt]
  object OSSL_FUNC_provider_self_test_fn:
    given _tag: Tag[OSSL_FUNC_provider_self_test_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], CInt]
    ): OSSL_FUNC_provider_self_test_fn = o
    extension (v: OSSL_FUNC_provider_self_test_fn)
      inline def value: CFuncPtr1[Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_provider_teardown_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_provider_teardown_fn:
    given _tag: Tag[OSSL_FUNC_provider_teardown_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_provider_teardown_fn = o
    extension (v: OSSL_FUNC_provider_teardown_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_provider_unquery_operation_fn =
    CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_ALGORITHM], Unit]
  object OSSL_FUNC_provider_unquery_operation_fn:
    given _tag: Tag[OSSL_FUNC_provider_unquery_operation_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_ALGORITHM], Unit]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_ALGORITHM], Unit]
    ): OSSL_FUNC_provider_unquery_operation_fn = o
    extension (v: OSSL_FUNC_provider_unquery_operation_fn)
      inline def value: CFuncPtr3[Ptr[Byte], CInt, Ptr[OSSL_ALGORITHM], Unit] =
        v

  /** */
  type OSSL_FUNC_provider_up_ref_fn =
    CFuncPtr2[Ptr[OSSL_CORE_HANDLE], CInt, CInt]
  object OSSL_FUNC_provider_up_ref_fn:
    given _tag: Tag[OSSL_FUNC_provider_up_ref_fn] =
      Tag.materializeCFuncPtr2[Ptr[OSSL_CORE_HANDLE], CInt, CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[OSSL_CORE_HANDLE], CInt, CInt]
    ): OSSL_FUNC_provider_up_ref_fn = o
    extension (v: OSSL_FUNC_provider_up_ref_fn)
      inline def value: CFuncPtr2[Ptr[OSSL_CORE_HANDLE], CInt, CInt] = v

  /** */
  type OSSL_FUNC_rand_clear_seed_fn =
    CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, Unit]
  object OSSL_FUNC_rand_clear_seed_fn:
    given _tag: Tag[OSSL_FUNC_rand_clear_seed_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, Unit]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, Unit]
    ): OSSL_FUNC_rand_clear_seed_fn = o
    extension (v: OSSL_FUNC_rand_clear_seed_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, Unit] =
        v

  /** */
  type OSSL_FUNC_rand_enable_locking_fn = CFuncPtr1[Ptr[Byte], CInt]
  object OSSL_FUNC_rand_enable_locking_fn:
    given _tag: Tag[OSSL_FUNC_rand_enable_locking_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], CInt]
    ): OSSL_FUNC_rand_enable_locking_fn = o
    extension (v: OSSL_FUNC_rand_enable_locking_fn)
      inline def value: CFuncPtr1[Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_rand_freectx_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_rand_freectx_fn:
    given _tag: Tag[OSSL_FUNC_rand_freectx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_rand_freectx_fn = o
    extension (v: OSSL_FUNC_rand_freectx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_rand_generate_fn = CFuncPtr7[Ptr[Byte], Ptr[
    CUnsignedChar
  ], size_t, CUnsignedInt, CInt, Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_rand_generate_fn:
    given _tag: Tag[OSSL_FUNC_rand_generate_fn] =
      Tag.materializeCFuncPtr7[Ptr[Byte], Ptr[
        CUnsignedChar
      ], size_t, CUnsignedInt, CInt, Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr7[Ptr[Byte], Ptr[
          CUnsignedChar
        ], size_t, CUnsignedInt, CInt, Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_rand_generate_fn = o
    extension (v: OSSL_FUNC_rand_generate_fn)
      inline def value: CFuncPtr7[Ptr[Byte], Ptr[
        CUnsignedChar
      ], size_t, CUnsignedInt, CInt, Ptr[CUnsignedChar], size_t, CInt] = v
  end OSSL_FUNC_rand_generate_fn

  /** */
  type OSSL_FUNC_rand_get_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_rand_get_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_rand_get_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_rand_get_ctx_params_fn = o
    extension (v: OSSL_FUNC_rand_get_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_rand_get_params_fn = CFuncPtr1[Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_rand_get_params_fn:
    given _tag: Tag[OSSL_FUNC_rand_get_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_rand_get_params_fn = o
    extension (v: OSSL_FUNC_rand_get_params_fn)
      inline def value: CFuncPtr1[Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_rand_get_seed_fn = CFuncPtr8[Ptr[Byte], Ptr[
    Ptr[CUnsignedChar]
  ], CInt, size_t, size_t, CInt, Ptr[CUnsignedChar], size_t, size_t]
  object OSSL_FUNC_rand_get_seed_fn:
    given _tag: Tag[OSSL_FUNC_rand_get_seed_fn] =
      Tag.materializeCFuncPtr8[Ptr[Byte], Ptr[
        Ptr[CUnsignedChar]
      ], CInt, size_t, size_t, CInt, Ptr[CUnsignedChar], size_t, size_t]
    inline def apply(
        inline o: CFuncPtr8[Ptr[Byte], Ptr[
          Ptr[CUnsignedChar]
        ], CInt, size_t, size_t, CInt, Ptr[CUnsignedChar], size_t, size_t]
    ): OSSL_FUNC_rand_get_seed_fn = o
    extension (v: OSSL_FUNC_rand_get_seed_fn)
      inline def value: CFuncPtr8[Ptr[Byte], Ptr[
        Ptr[CUnsignedChar]
      ], CInt, size_t, size_t, CInt, Ptr[CUnsignedChar], size_t, size_t] = v
  end OSSL_FUNC_rand_get_seed_fn

  /** */
  type OSSL_FUNC_rand_gettable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_rand_gettable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_rand_gettable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_rand_gettable_ctx_params_fn = o
    extension (v: OSSL_FUNC_rand_gettable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_rand_gettable_params_fn = CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_rand_gettable_params_fn:
    given _tag: Tag[OSSL_FUNC_rand_gettable_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_rand_gettable_params_fn = o
    extension (v: OSSL_FUNC_rand_gettable_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_rand_instantiate_fn = CFuncPtr6[Ptr[
    Byte
  ], CUnsignedInt, CInt, Ptr[CUnsignedChar], size_t, Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_rand_instantiate_fn:
    given _tag: Tag[OSSL_FUNC_rand_instantiate_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], CUnsignedInt, CInt, Ptr[
        CUnsignedChar
      ], size_t, Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], CUnsignedInt, CInt, Ptr[
          CUnsignedChar
        ], size_t, Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_rand_instantiate_fn = o
    extension (v: OSSL_FUNC_rand_instantiate_fn)
      inline def value: CFuncPtr6[Ptr[Byte], CUnsignedInt, CInt, Ptr[
        CUnsignedChar
      ], size_t, Ptr[OSSL_PARAM], CInt] = v
  end OSSL_FUNC_rand_instantiate_fn

  /** */
  type OSSL_FUNC_rand_lock_fn = CFuncPtr1[Ptr[Byte], CInt]
  object OSSL_FUNC_rand_lock_fn:
    given _tag: Tag[OSSL_FUNC_rand_lock_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], CInt]
    ): OSSL_FUNC_rand_lock_fn = o
    extension (v: OSSL_FUNC_rand_lock_fn)
      inline def value: CFuncPtr1[Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_rand_newctx_fn =
    CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_DISPATCH], Ptr[Byte]]
  object OSSL_FUNC_rand_newctx_fn:
    given _tag: Tag[OSSL_FUNC_rand_newctx_fn] = Tag
      .materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_DISPATCH], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_DISPATCH], Ptr[Byte]]
    ): OSSL_FUNC_rand_newctx_fn = o
    extension (v: OSSL_FUNC_rand_newctx_fn)
      inline def value
          : CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_DISPATCH], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_rand_nonce_fn = CFuncPtr5[Ptr[Byte], Ptr[
    CUnsignedChar
  ], CUnsignedInt, size_t, size_t, size_t]
  object OSSL_FUNC_rand_nonce_fn:
    given _tag: Tag[OSSL_FUNC_rand_nonce_fn] = Tag.materializeCFuncPtr5[Ptr[
      Byte
    ], Ptr[CUnsignedChar], CUnsignedInt, size_t, size_t, size_t]
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], Ptr[
          CUnsignedChar
        ], CUnsignedInt, size_t, size_t, size_t]
    ): OSSL_FUNC_rand_nonce_fn = o
    extension (v: OSSL_FUNC_rand_nonce_fn)
      inline def value: CFuncPtr5[Ptr[Byte], Ptr[
        CUnsignedChar
      ], CUnsignedInt, size_t, size_t, size_t] = v
  end OSSL_FUNC_rand_nonce_fn

  /** */
  type OSSL_FUNC_rand_reseed_fn = CFuncPtr6[Ptr[Byte], CInt, Ptr[
    CUnsignedChar
  ], size_t, Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_rand_reseed_fn:
    given _tag: Tag[OSSL_FUNC_rand_reseed_fn] = Tag.materializeCFuncPtr6[Ptr[
      Byte
    ], CInt, Ptr[CUnsignedChar], size_t, Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], CInt, Ptr[CUnsignedChar], size_t, Ptr[
          CUnsignedChar
        ], size_t, CInt]
    ): OSSL_FUNC_rand_reseed_fn = o
    extension (v: OSSL_FUNC_rand_reseed_fn)
      inline def value: CFuncPtr6[Ptr[Byte], CInt, Ptr[
        CUnsignedChar
      ], size_t, Ptr[CUnsignedChar], size_t, CInt] = v
  end OSSL_FUNC_rand_reseed_fn

  /** */
  type OSSL_FUNC_rand_set_callbacks_fn =
    CFuncPtr6[Ptr[Byte], Ptr[OSSL_INOUT_CALLBACK], Ptr[OSSL_CALLBACK], Ptr[
      OSSL_INOUT_CALLBACK
    ], Ptr[OSSL_CALLBACK], Ptr[Byte], Unit]
  object OSSL_FUNC_rand_set_callbacks_fn:
    given _tag: Tag[OSSL_FUNC_rand_set_callbacks_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[OSSL_INOUT_CALLBACK], Ptr[
        OSSL_CALLBACK
      ], Ptr[OSSL_INOUT_CALLBACK], Ptr[OSSL_CALLBACK], Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[OSSL_INOUT_CALLBACK], Ptr[
          OSSL_CALLBACK
        ], Ptr[OSSL_INOUT_CALLBACK], Ptr[OSSL_CALLBACK], Ptr[Byte], Unit]
    ): OSSL_FUNC_rand_set_callbacks_fn = o
    extension (v: OSSL_FUNC_rand_set_callbacks_fn)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[OSSL_INOUT_CALLBACK], Ptr[
        OSSL_CALLBACK
      ], Ptr[OSSL_INOUT_CALLBACK], Ptr[OSSL_CALLBACK], Ptr[Byte], Unit] = v
  end OSSL_FUNC_rand_set_callbacks_fn

  /** */
  type OSSL_FUNC_rand_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_rand_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_rand_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_rand_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_rand_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_rand_settable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_rand_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_rand_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_rand_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_rand_settable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_rand_uninstantiate_fn = CFuncPtr1[Ptr[Byte], CInt]
  object OSSL_FUNC_rand_uninstantiate_fn:
    given _tag: Tag[OSSL_FUNC_rand_uninstantiate_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], CInt]
    ): OSSL_FUNC_rand_uninstantiate_fn = o
    extension (v: OSSL_FUNC_rand_uninstantiate_fn)
      inline def value: CFuncPtr1[Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_rand_unlock_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_rand_unlock_fn:
    given _tag: Tag[OSSL_FUNC_rand_unlock_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_rand_unlock_fn = o
    extension (v: OSSL_FUNC_rand_unlock_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_rand_verify_zeroization_fn = CFuncPtr1[Ptr[Byte], CInt]
  object OSSL_FUNC_rand_verify_zeroization_fn:
    given _tag: Tag[OSSL_FUNC_rand_verify_zeroization_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], CInt]
    ): OSSL_FUNC_rand_verify_zeroization_fn = o
    extension (v: OSSL_FUNC_rand_verify_zeroization_fn)
      inline def value: CFuncPtr1[Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_self_test_cb_fn = CFuncPtr3[Ptr[OPENSSL_CORE_CTX], Ptr[
    Ptr[OSSL_CALLBACK]
  ], Ptr[Ptr[Byte]], Unit]
  object OSSL_FUNC_self_test_cb_fn:
    given _tag: Tag[OSSL_FUNC_self_test_cb_fn] = Tag.materializeCFuncPtr3[Ptr[
      OPENSSL_CORE_CTX
    ], Ptr[Ptr[OSSL_CALLBACK]], Ptr[Ptr[Byte]], Unit]
    inline def apply(
        inline o: CFuncPtr3[Ptr[OPENSSL_CORE_CTX], Ptr[Ptr[OSSL_CALLBACK]], Ptr[
          Ptr[Byte]
        ], Unit]
    ): OSSL_FUNC_self_test_cb_fn = o
    extension (v: OSSL_FUNC_self_test_cb_fn)
      inline def value: CFuncPtr3[Ptr[OPENSSL_CORE_CTX], Ptr[
        Ptr[OSSL_CALLBACK]
      ], Ptr[Ptr[Byte]], Unit] = v
  end OSSL_FUNC_self_test_cb_fn

  /** */
  type OSSL_FUNC_signature_digest_sign_final_fn =
    CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[size_t], size_t, CInt]
  object OSSL_FUNC_signature_digest_sign_final_fn:
    given _tag: Tag[OSSL_FUNC_signature_digest_sign_final_fn] =
      Tag.materializeCFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, CInt]
    ): OSSL_FUNC_signature_digest_sign_final_fn = o
    extension (v: OSSL_FUNC_signature_digest_sign_final_fn)
      inline def value: CFuncPtr4[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, CInt] = v
  end OSSL_FUNC_signature_digest_sign_final_fn

  /** */
  type OSSL_FUNC_signature_digest_sign_fn = CFuncPtr6[Ptr[Byte], Ptr[
    CUnsignedChar
  ], Ptr[size_t], size_t, Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_signature_digest_sign_fn:
    given _tag: Tag[OSSL_FUNC_signature_digest_sign_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_signature_digest_sign_fn = o
    extension (v: OSSL_FUNC_signature_digest_sign_fn)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt] = v
  end OSSL_FUNC_signature_digest_sign_fn

  /** */
  type OSSL_FUNC_signature_digest_sign_init_fn =
    CFuncPtr4[Ptr[Byte], CString, Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_signature_digest_sign_init_fn:
    given _tag: Tag[OSSL_FUNC_signature_digest_sign_init_fn] =
      Tag.materializeCFuncPtr4[Ptr[Byte], CString, Ptr[Byte], Ptr[
        OSSL_PARAM
      ], CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], CString, Ptr[Byte], Ptr[
          OSSL_PARAM
        ], CInt]
    ): OSSL_FUNC_signature_digest_sign_init_fn = o
    extension (v: OSSL_FUNC_signature_digest_sign_init_fn)
      inline def value
          : CFuncPtr4[Ptr[Byte], CString, Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v
  end OSSL_FUNC_signature_digest_sign_init_fn

  /** */
  type OSSL_FUNC_signature_digest_sign_update_fn =
    CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_signature_digest_sign_update_fn:
    given _tag: Tag[OSSL_FUNC_signature_digest_sign_update_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_signature_digest_sign_update_fn = o
    extension (v: OSSL_FUNC_signature_digest_sign_update_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt] =
        v

  /** */
  type OSSL_FUNC_signature_digest_verify_final_fn =
    CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_signature_digest_verify_final_fn:
    given _tag: Tag[OSSL_FUNC_signature_digest_verify_final_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_signature_digest_verify_final_fn = o
    extension (v: OSSL_FUNC_signature_digest_verify_final_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt] =
        v

  /** */
  type OSSL_FUNC_signature_digest_verify_fn = CFuncPtr5[Ptr[Byte], Ptr[
    CUnsignedChar
  ], size_t, Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_signature_digest_verify_fn:
    given _tag: Tag[OSSL_FUNC_signature_digest_verify_fn] =
      Tag.materializeCFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
          CUnsignedChar
        ], size_t, CInt]
    ): OSSL_FUNC_signature_digest_verify_fn = o
    extension (v: OSSL_FUNC_signature_digest_verify_fn)
      inline def value: CFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], size_t, CInt] = v
  end OSSL_FUNC_signature_digest_verify_fn

  /** */
  type OSSL_FUNC_signature_digest_verify_init_fn =
    CFuncPtr4[Ptr[Byte], CString, Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_signature_digest_verify_init_fn:
    given _tag: Tag[OSSL_FUNC_signature_digest_verify_init_fn] =
      Tag.materializeCFuncPtr4[Ptr[Byte], CString, Ptr[Byte], Ptr[
        OSSL_PARAM
      ], CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], CString, Ptr[Byte], Ptr[
          OSSL_PARAM
        ], CInt]
    ): OSSL_FUNC_signature_digest_verify_init_fn = o
    extension (v: OSSL_FUNC_signature_digest_verify_init_fn)
      inline def value
          : CFuncPtr4[Ptr[Byte], CString, Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v
  end OSSL_FUNC_signature_digest_verify_init_fn

  /** */
  type OSSL_FUNC_signature_digest_verify_update_fn =
    CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_signature_digest_verify_update_fn:
    given _tag: Tag[OSSL_FUNC_signature_digest_verify_update_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_signature_digest_verify_update_fn = o
    extension (v: OSSL_FUNC_signature_digest_verify_update_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], size_t, CInt] =
        v

  /** */
  type OSSL_FUNC_signature_dupctx_fn = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object OSSL_FUNC_signature_dupctx_fn:
    given _tag: Tag[OSSL_FUNC_signature_dupctx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): OSSL_FUNC_signature_dupctx_fn = o
    extension (v: OSSL_FUNC_signature_dupctx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_signature_freectx_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_FUNC_signature_freectx_fn:
    given _tag: Tag[OSSL_FUNC_signature_freectx_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_FUNC_signature_freectx_fn = o
    extension (v: OSSL_FUNC_signature_freectx_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** */
  type OSSL_FUNC_signature_get_ctx_md_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_signature_get_ctx_md_params_fn:
    given _tag: Tag[OSSL_FUNC_signature_get_ctx_md_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_signature_get_ctx_md_params_fn = o
    extension (v: OSSL_FUNC_signature_get_ctx_md_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_signature_get_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_signature_get_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_signature_get_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_signature_get_ctx_params_fn = o
    extension (v: OSSL_FUNC_signature_get_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_signature_gettable_ctx_md_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_signature_gettable_ctx_md_params_fn:
    given _tag: Tag[OSSL_FUNC_signature_gettable_ctx_md_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_signature_gettable_ctx_md_params_fn = o
    extension (v: OSSL_FUNC_signature_gettable_ctx_md_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_signature_gettable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_signature_gettable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_signature_gettable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_signature_gettable_ctx_params_fn = o
    extension (v: OSSL_FUNC_signature_gettable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_signature_newctx_fn = CFuncPtr2[Ptr[Byte], CString, Ptr[Byte]]
  object OSSL_FUNC_signature_newctx_fn:
    given _tag: Tag[OSSL_FUNC_signature_newctx_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], CString, Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], CString, Ptr[Byte]]
    ): OSSL_FUNC_signature_newctx_fn = o
    extension (v: OSSL_FUNC_signature_newctx_fn)
      inline def value: CFuncPtr2[Ptr[Byte], CString, Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_signature_set_ctx_md_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_signature_set_ctx_md_params_fn:
    given _tag: Tag[OSSL_FUNC_signature_set_ctx_md_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_signature_set_ctx_md_params_fn = o
    extension (v: OSSL_FUNC_signature_set_ctx_md_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_signature_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_signature_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_signature_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_signature_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_signature_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_signature_settable_ctx_md_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_signature_settable_ctx_md_params_fn:
    given _tag: Tag[OSSL_FUNC_signature_settable_ctx_md_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_signature_settable_ctx_md_params_fn = o
    extension (v: OSSL_FUNC_signature_settable_ctx_md_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_signature_settable_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_signature_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_signature_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_signature_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_signature_settable_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_FUNC_signature_sign_fn = CFuncPtr6[Ptr[Byte], Ptr[
    CUnsignedChar
  ], Ptr[size_t], size_t, Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_signature_sign_fn:
    given _tag: Tag[OSSL_FUNC_signature_sign_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_signature_sign_fn = o
    extension (v: OSSL_FUNC_signature_sign_fn)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt] = v
  end OSSL_FUNC_signature_sign_fn

  /** */
  type OSSL_FUNC_signature_sign_init_fn =
    CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_signature_sign_init_fn:
    given _tag: Tag[OSSL_FUNC_signature_sign_init_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_signature_sign_init_fn = o
    extension (v: OSSL_FUNC_signature_sign_init_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt] =
        v

  /** */
  type OSSL_FUNC_signature_verify_fn = CFuncPtr5[Ptr[Byte], Ptr[
    CUnsignedChar
  ], size_t, Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_signature_verify_fn:
    given _tag: Tag[OSSL_FUNC_signature_verify_fn] =
      Tag.materializeCFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
          CUnsignedChar
        ], size_t, CInt]
    ): OSSL_FUNC_signature_verify_fn = o
    extension (v: OSSL_FUNC_signature_verify_fn)
      inline def value: CFuncPtr5[Ptr[Byte], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], size_t, CInt] = v
  end OSSL_FUNC_signature_verify_fn

  /** */
  type OSSL_FUNC_signature_verify_init_fn =
    CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_signature_verify_init_fn:
    given _tag: Tag[OSSL_FUNC_signature_verify_init_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_signature_verify_init_fn = o
    extension (v: OSSL_FUNC_signature_verify_init_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt] =
        v

  /** */
  type OSSL_FUNC_signature_verify_recover_fn = CFuncPtr6[Ptr[Byte], Ptr[
    CUnsignedChar
  ], Ptr[size_t], size_t, Ptr[CUnsignedChar], size_t, CInt]
  object OSSL_FUNC_signature_verify_recover_fn:
    given _tag: Tag[OSSL_FUNC_signature_verify_recover_fn] =
      Tag.materializeCFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    inline def apply(
        inline o: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
          size_t
        ], size_t, Ptr[CUnsignedChar], size_t, CInt]
    ): OSSL_FUNC_signature_verify_recover_fn = o
    extension (v: OSSL_FUNC_signature_verify_recover_fn)
      inline def value: CFuncPtr6[Ptr[Byte], Ptr[CUnsignedChar], Ptr[
        size_t
      ], size_t, Ptr[CUnsignedChar], size_t, CInt] = v
  end OSSL_FUNC_signature_verify_recover_fn

  /** */
  type OSSL_FUNC_signature_verify_recover_init_fn =
    CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_signature_verify_recover_init_fn:
    given _tag: Tag[OSSL_FUNC_signature_verify_recover_init_fn] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_signature_verify_recover_init_fn = o
    extension (v: OSSL_FUNC_signature_verify_recover_init_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[OSSL_PARAM], CInt] =
        v

  /** */
  type OSSL_FUNC_store_attach_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_CORE_BIO], Ptr[Byte]]
  object OSSL_FUNC_store_attach_fn:
    given _tag: Tag[OSSL_FUNC_store_attach_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_CORE_BIO], Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_CORE_BIO], Ptr[Byte]]
    ): OSSL_FUNC_store_attach_fn = o
    extension (v: OSSL_FUNC_store_attach_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_CORE_BIO], Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_store_close_fn = CFuncPtr1[Ptr[Byte], CInt]
  object OSSL_FUNC_store_close_fn:
    given _tag: Tag[OSSL_FUNC_store_close_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], CInt]
    ): OSSL_FUNC_store_close_fn = o
    extension (v: OSSL_FUNC_store_close_fn)
      inline def value: CFuncPtr1[Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_store_eof_fn = CFuncPtr1[Ptr[Byte], CInt]
  object OSSL_FUNC_store_eof_fn:
    given _tag: Tag[OSSL_FUNC_store_eof_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], CInt]
    ): OSSL_FUNC_store_eof_fn = o
    extension (v: OSSL_FUNC_store_eof_fn)
      inline def value: CFuncPtr1[Ptr[Byte], CInt] = v

  /** */
  type OSSL_FUNC_store_export_object_fn =
    CFuncPtr5[Ptr[Byte], Ptr[Byte], size_t, Ptr[OSSL_CALLBACK], Ptr[Byte], CInt]
  object OSSL_FUNC_store_export_object_fn:
    given _tag: Tag[OSSL_FUNC_store_export_object_fn] =
      Tag.materializeCFuncPtr5[Ptr[Byte], Ptr[Byte], size_t, Ptr[
        OSSL_CALLBACK
      ], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], Ptr[Byte], size_t, Ptr[
          OSSL_CALLBACK
        ], Ptr[Byte], CInt]
    ): OSSL_FUNC_store_export_object_fn = o
    extension (v: OSSL_FUNC_store_export_object_fn)
      inline def value: CFuncPtr5[Ptr[Byte], Ptr[Byte], size_t, Ptr[
        OSSL_CALLBACK
      ], Ptr[Byte], CInt] = v
  end OSSL_FUNC_store_export_object_fn

  /** */
  type OSSL_FUNC_store_load_fn = CFuncPtr5[Ptr[Byte], Ptr[OSSL_CALLBACK], Ptr[
    Byte
  ], Ptr[OSSL_PASSPHRASE_CALLBACK], Ptr[Byte], CInt]
  object OSSL_FUNC_store_load_fn:
    given _tag: Tag[OSSL_FUNC_store_load_fn] =
      Tag.materializeCFuncPtr5[Ptr[Byte], Ptr[OSSL_CALLBACK], Ptr[Byte], Ptr[
        OSSL_PASSPHRASE_CALLBACK
      ], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], Ptr[OSSL_CALLBACK], Ptr[Byte], Ptr[
          OSSL_PASSPHRASE_CALLBACK
        ], Ptr[Byte], CInt]
    ): OSSL_FUNC_store_load_fn = o
    extension (v: OSSL_FUNC_store_load_fn)
      inline def value: CFuncPtr5[Ptr[Byte], Ptr[OSSL_CALLBACK], Ptr[Byte], Ptr[
        OSSL_PASSPHRASE_CALLBACK
      ], Ptr[Byte], CInt] = v
  end OSSL_FUNC_store_load_fn

  /** */
  type OSSL_FUNC_store_open_fn = CFuncPtr2[Ptr[Byte], CString, Ptr[Byte]]
  object OSSL_FUNC_store_open_fn:
    given _tag: Tag[OSSL_FUNC_store_open_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], CString, Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], CString, Ptr[Byte]]
    ): OSSL_FUNC_store_open_fn = o
    extension (v: OSSL_FUNC_store_open_fn)
      inline def value: CFuncPtr2[Ptr[Byte], CString, Ptr[Byte]] = v

  /** */
  type OSSL_FUNC_store_set_ctx_params_fn =
    CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
  object OSSL_FUNC_store_set_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_store_set_ctx_params_fn] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt]
    ): OSSL_FUNC_store_set_ctx_params_fn = o
    extension (v: OSSL_FUNC_store_set_ctx_params_fn)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[OSSL_PARAM], CInt] = v

  /** */
  type OSSL_FUNC_store_settable_ctx_params_fn =
    CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
  object OSSL_FUNC_store_settable_ctx_params_fn:
    given _tag: Tag[OSSL_FUNC_store_settable_ctx_params_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]]
    ): OSSL_FUNC_store_settable_ctx_params_fn = o
    extension (v: OSSL_FUNC_store_settable_ctx_params_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[OSSL_PARAM]] = v

  /** */
  type OSSL_INOUT_CALLBACK =
    CFuncPtr3[Ptr[OSSL_PARAM], Ptr[OSSL_PARAM], Ptr[Byte], CInt]
  object OSSL_INOUT_CALLBACK:
    given _tag: Tag[OSSL_INOUT_CALLBACK] = Tag
      .materializeCFuncPtr3[Ptr[OSSL_PARAM], Ptr[OSSL_PARAM], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr3[Ptr[OSSL_PARAM], Ptr[OSSL_PARAM], Ptr[Byte], CInt]
    ): OSSL_INOUT_CALLBACK = o
    extension (v: OSSL_INOUT_CALLBACK)
      inline def value
          : CFuncPtr3[Ptr[OSSL_PARAM], Ptr[OSSL_PARAM], Ptr[Byte], CInt] = v

  /** */
  type OSSL_PASSPHRASE_CALLBACK =
    CFuncPtr5[CString, size_t, Ptr[size_t], Ptr[OSSL_PARAM], Ptr[Byte], CInt]
  object OSSL_PASSPHRASE_CALLBACK:
    given _tag: Tag[OSSL_PASSPHRASE_CALLBACK] =
      Tag.materializeCFuncPtr5[CString, size_t, Ptr[size_t], Ptr[
        OSSL_PARAM
      ], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr5[CString, size_t, Ptr[size_t], Ptr[OSSL_PARAM], Ptr[
          Byte
        ], CInt]
    ): OSSL_PASSPHRASE_CALLBACK = o
    extension (v: OSSL_PASSPHRASE_CALLBACK)
      inline def value: CFuncPtr5[CString, size_t, Ptr[size_t], Ptr[
        OSSL_PARAM
      ], Ptr[Byte], CInt] = v
  end OSSL_PASSPHRASE_CALLBACK

  /** */
  type OSSL_provider_init_fn = CFuncPtr4[Ptr[OSSL_CORE_HANDLE], Ptr[
    OSSL_DISPATCH
  ], Ptr[Ptr[OSSL_DISPATCH]], Ptr[Ptr[Byte]], CInt]
  object OSSL_provider_init_fn:
    given _tag: Tag[OSSL_provider_init_fn] = Tag.materializeCFuncPtr4[Ptr[
      OSSL_CORE_HANDLE
    ], Ptr[OSSL_DISPATCH], Ptr[Ptr[OSSL_DISPATCH]], Ptr[Ptr[Byte]], CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[OSSL_CORE_HANDLE], Ptr[OSSL_DISPATCH], Ptr[
          Ptr[OSSL_DISPATCH]
        ], Ptr[Ptr[Byte]], CInt]
    ): OSSL_provider_init_fn = o
    extension (v: OSSL_provider_init_fn)
      inline def value: CFuncPtr4[Ptr[OSSL_CORE_HANDLE], Ptr[
        OSSL_DISPATCH
      ], Ptr[Ptr[OSSL_DISPATCH]], Ptr[Ptr[Byte]], CInt] = v
  end OSSL_provider_init_fn

  /** */
  opaque type OSSL_thread_stop_handler_fn = CFuncPtr1[Ptr[Byte], Unit]
  object OSSL_thread_stop_handler_fn:
    given _tag: Tag[OSSL_thread_stop_handler_fn] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): OSSL_thread_stop_handler_fn =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): OSSL_thread_stop_handler_fn = o
    extension (v: OSSL_thread_stop_handler_fn)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end OSSL_thread_stop_handler_fn

  /** */
  type asn1_ps_func =
    CFuncPtr4[Ptr[BIO], Ptr[Ptr[CUnsignedChar]], Ptr[CInt], Ptr[Byte], CInt]
  object asn1_ps_func:
    given _tag: Tag[asn1_ps_func] = Tag.materializeCFuncPtr4[Ptr[BIO], Ptr[
      Ptr[CUnsignedChar]
    ], Ptr[CInt], Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr4[Ptr[BIO], Ptr[Ptr[CUnsignedChar]], Ptr[CInt], Ptr[
          Byte
        ], CInt]
    ): asn1_ps_func = o
    extension (v: asn1_ps_func)
      inline def value: CFuncPtr4[Ptr[BIO], Ptr[Ptr[CUnsignedChar]], Ptr[
        CInt
      ], Ptr[Byte], CInt] = v
  end asn1_ps_func

  /** */
  type bio_info_cb = BIO_info_cb
  object bio_info_cb:
    given _tag: Tag[bio_info_cb] = BIO_info_cb._tag
    inline def apply(inline o: BIO_info_cb): bio_info_cb = o
    extension (v: bio_info_cb) inline def value: BIO_info_cb = v

  /** */
  type d2i_of_void =
    CFuncPtr3[Ptr[Ptr[Byte]], Ptr[Ptr[CUnsignedChar]], CLongInt, Ptr[Byte]]
  object d2i_of_void:
    given _tag: Tag[d2i_of_void] = Tag.materializeCFuncPtr3[Ptr[Ptr[Byte]], Ptr[
      Ptr[CUnsignedChar]
    ], CLongInt, Ptr[Byte]]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Ptr[Byte]], Ptr[
          Ptr[CUnsignedChar]
        ], CLongInt, Ptr[Byte]]
    ): d2i_of_void = o
    extension (v: d2i_of_void)
      inline def value: CFuncPtr3[Ptr[Ptr[Byte]], Ptr[
        Ptr[CUnsignedChar]
      ], CLongInt, Ptr[Byte]] = v
  end d2i_of_void

  /** */
  type i2d_of_void = CFuncPtr2[Ptr[Byte], Ptr[Ptr[CUnsignedChar]], CInt]
  object i2d_of_void:
    given _tag: Tag[i2d_of_void] =
      Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Ptr[CUnsignedChar]], CInt]
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], Ptr[Ptr[CUnsignedChar]], CInt]
    ): i2d_of_void = o
    extension (v: i2d_of_void)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[Ptr[CUnsignedChar]], CInt] = v

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

  type intmax_t = libc.stdint.intmax_t
  object intmax_t:
    val _tag: Tag[intmax_t] = summon[Tag[libc.stdint.intmax_t]]
    inline def apply(inline o: libc.stdint.intmax_t): intmax_t = o
    extension (v: intmax_t) inline def value: libc.stdint.intmax_t = v

  /** */
  type ossl_intmax_t = intmax_t
  object ossl_intmax_t:
    given _tag: Tag[ossl_intmax_t] = intmax_t._tag
    inline def apply(inline o: intmax_t): ossl_intmax_t = o
    extension (v: ossl_intmax_t) inline def value: intmax_t = v

  /** */
  type ossl_uintmax_t = uintmax_t
  object ossl_uintmax_t:
    given _tag: Tag[ossl_uintmax_t] = uintmax_t._tag
    inline def apply(inline o: uintmax_t): ossl_uintmax_t = o
    extension (v: ossl_uintmax_t) inline def value: uintmax_t = v

  /** */
  type pem_password_cb = CFuncPtr4[CString, CInt, CInt, Ptr[Byte], CInt]
  object pem_password_cb:
    given _tag: Tag[pem_password_cb] =
      Tag.materializeCFuncPtr4[CString, CInt, CInt, Ptr[Byte], CInt]
    inline def apply(
        inline o: CFuncPtr4[CString, CInt, CInt, Ptr[Byte], CInt]
    ): pem_password_cb = o
    extension (v: pem_password_cb)
      inline def value: CFuncPtr4[CString, CInt, CInt, Ptr[Byte], CInt] = v

  type pthread_key_t = posix.sys.types.pthread_key_t
  object pthread_key_t:
    val _tag: Tag[pthread_key_t] = summon[Tag[posix.sys.types.pthread_key_t]]
    inline def apply(inline o: posix.sys.types.pthread_key_t): pthread_key_t = o
    extension (v: pthread_key_t)
      inline def value: posix.sys.types.pthread_key_t = v

  type pthread_once_t = posix.sys.types.pthread_once_t
  object pthread_once_t:
    val _tag: Tag[pthread_once_t] = summon[Tag[posix.sys.types.pthread_once_t]]
    inline def apply(inline o: posix.sys.types.pthread_once_t): pthread_once_t =
      o
    extension (v: pthread_once_t)
      inline def value: posix.sys.types.pthread_once_t = v

  type pthread_t = posix.sys.types.pthread_t
  object pthread_t:
    val _tag: Tag[pthread_t] = summon[Tag[posix.sys.types.pthread_t]]
    inline def apply(inline o: posix.sys.types.pthread_t): pthread_t = o
    extension (v: pthread_t) inline def value: posix.sys.types.pthread_t = v

  type size_t = libc.stddef.size_t
  object size_t:
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t) inline def value: libc.stddef.size_t = v

  /** */
  opaque type sk_ASN1_GENERALSTRING_compfunc =
    CFuncPtr2[Ptr[Ptr[ASN1_GENERALSTRING]], Ptr[Ptr[ASN1_GENERALSTRING]], CInt]
  object sk_ASN1_GENERALSTRING_compfunc:
    given _tag: Tag[sk_ASN1_GENERALSTRING_compfunc] =
      Tag.materializeCFuncPtr2[Ptr[Ptr[ASN1_GENERALSTRING]], Ptr[
        Ptr[ASN1_GENERALSTRING]
      ], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_GENERALSTRING_compfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[Ptr[ASN1_GENERALSTRING]], Ptr[
          Ptr[ASN1_GENERALSTRING]
        ], CInt]
    ): sk_ASN1_GENERALSTRING_compfunc = o
    extension (v: sk_ASN1_GENERALSTRING_compfunc)
      inline def value: CFuncPtr2[Ptr[Ptr[ASN1_GENERALSTRING]], Ptr[
        Ptr[ASN1_GENERALSTRING]
      ], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_GENERALSTRING_compfunc

  /** */
  opaque type sk_ASN1_GENERALSTRING_copyfunc =
    CFuncPtr1[Ptr[ASN1_GENERALSTRING], Ptr[ASN1_GENERALSTRING]]
  object sk_ASN1_GENERALSTRING_copyfunc:
    given _tag: Tag[sk_ASN1_GENERALSTRING_copyfunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_GENERALSTRING], Ptr[ASN1_GENERALSTRING]]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_GENERALSTRING_copyfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_GENERALSTRING], Ptr[ASN1_GENERALSTRING]]
    ): sk_ASN1_GENERALSTRING_copyfunc = o
    extension (v: sk_ASN1_GENERALSTRING_copyfunc)
      inline def value
          : CFuncPtr1[Ptr[ASN1_GENERALSTRING], Ptr[ASN1_GENERALSTRING]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_GENERALSTRING_copyfunc

  /** */
  opaque type sk_ASN1_GENERALSTRING_freefunc =
    CFuncPtr1[Ptr[ASN1_GENERALSTRING], Unit]
  object sk_ASN1_GENERALSTRING_freefunc:
    given _tag: Tag[sk_ASN1_GENERALSTRING_freefunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_GENERALSTRING], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_GENERALSTRING_freefunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_GENERALSTRING], Unit]
    ): sk_ASN1_GENERALSTRING_freefunc = o
    extension (v: sk_ASN1_GENERALSTRING_freefunc)
      inline def value: CFuncPtr1[Ptr[ASN1_GENERALSTRING], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_GENERALSTRING_freefunc

  /** */
  opaque type sk_ASN1_INTEGER_compfunc =
    CFuncPtr2[Ptr[Ptr[ASN1_INTEGER]], Ptr[Ptr[ASN1_INTEGER]], CInt]
  object sk_ASN1_INTEGER_compfunc:
    given _tag: Tag[sk_ASN1_INTEGER_compfunc] = Tag.materializeCFuncPtr2[Ptr[
      Ptr[ASN1_INTEGER]
    ], Ptr[Ptr[ASN1_INTEGER]], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_INTEGER_compfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[Ptr[ASN1_INTEGER]], Ptr[
          Ptr[ASN1_INTEGER]
        ], CInt]
    ): sk_ASN1_INTEGER_compfunc = o
    extension (v: sk_ASN1_INTEGER_compfunc)
      inline def value
          : CFuncPtr2[Ptr[Ptr[ASN1_INTEGER]], Ptr[Ptr[ASN1_INTEGER]], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_INTEGER_compfunc

  /** */
  opaque type sk_ASN1_INTEGER_copyfunc =
    CFuncPtr1[Ptr[ASN1_INTEGER], Ptr[ASN1_INTEGER]]
  object sk_ASN1_INTEGER_copyfunc:
    given _tag: Tag[sk_ASN1_INTEGER_copyfunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_INTEGER], Ptr[ASN1_INTEGER]]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_INTEGER_copyfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_INTEGER], Ptr[ASN1_INTEGER]]
    ): sk_ASN1_INTEGER_copyfunc = o
    extension (v: sk_ASN1_INTEGER_copyfunc)
      inline def value: CFuncPtr1[Ptr[ASN1_INTEGER], Ptr[ASN1_INTEGER]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_INTEGER_copyfunc

  /** */
  opaque type sk_ASN1_INTEGER_freefunc = CFuncPtr1[Ptr[ASN1_INTEGER], Unit]
  object sk_ASN1_INTEGER_freefunc:
    given _tag: Tag[sk_ASN1_INTEGER_freefunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_INTEGER], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_INTEGER_freefunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_INTEGER], Unit]
    ): sk_ASN1_INTEGER_freefunc = o
    extension (v: sk_ASN1_INTEGER_freefunc)
      inline def value: CFuncPtr1[Ptr[ASN1_INTEGER], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_INTEGER_freefunc

  /** */
  opaque type sk_ASN1_OBJECT_compfunc =
    CFuncPtr2[Ptr[Ptr[ASN1_OBJECT]], Ptr[Ptr[ASN1_OBJECT]], CInt]
  object sk_ASN1_OBJECT_compfunc:
    given _tag: Tag[sk_ASN1_OBJECT_compfunc] = Tag
      .materializeCFuncPtr2[Ptr[Ptr[ASN1_OBJECT]], Ptr[Ptr[ASN1_OBJECT]], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_OBJECT_compfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[Ptr[ASN1_OBJECT]], Ptr[Ptr[ASN1_OBJECT]], CInt]
    ): sk_ASN1_OBJECT_compfunc = o
    extension (v: sk_ASN1_OBJECT_compfunc)
      inline def value
          : CFuncPtr2[Ptr[Ptr[ASN1_OBJECT]], Ptr[Ptr[ASN1_OBJECT]], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_OBJECT_compfunc

  /** */
  opaque type sk_ASN1_OBJECT_copyfunc =
    CFuncPtr1[Ptr[ASN1_OBJECT], Ptr[ASN1_OBJECT]]
  object sk_ASN1_OBJECT_copyfunc:
    given _tag: Tag[sk_ASN1_OBJECT_copyfunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_OBJECT], Ptr[ASN1_OBJECT]]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_OBJECT_copyfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_OBJECT], Ptr[ASN1_OBJECT]]
    ): sk_ASN1_OBJECT_copyfunc = o
    extension (v: sk_ASN1_OBJECT_copyfunc)
      inline def value: CFuncPtr1[Ptr[ASN1_OBJECT], Ptr[ASN1_OBJECT]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_OBJECT_copyfunc

  /** */
  opaque type sk_ASN1_OBJECT_freefunc = CFuncPtr1[Ptr[ASN1_OBJECT], Unit]
  object sk_ASN1_OBJECT_freefunc:
    given _tag: Tag[sk_ASN1_OBJECT_freefunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_OBJECT], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_OBJECT_freefunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_OBJECT], Unit]
    ): sk_ASN1_OBJECT_freefunc = o
    extension (v: sk_ASN1_OBJECT_freefunc)
      inline def value: CFuncPtr1[Ptr[ASN1_OBJECT], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_OBJECT_freefunc

  /** */
  opaque type sk_ASN1_STRING_TABLE_compfunc =
    CFuncPtr2[Ptr[Ptr[ASN1_STRING_TABLE]], Ptr[Ptr[ASN1_STRING_TABLE]], CInt]
  object sk_ASN1_STRING_TABLE_compfunc:
    given _tag: Tag[sk_ASN1_STRING_TABLE_compfunc] =
      Tag.materializeCFuncPtr2[Ptr[Ptr[ASN1_STRING_TABLE]], Ptr[
        Ptr[ASN1_STRING_TABLE]
      ], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_STRING_TABLE_compfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[Ptr[ASN1_STRING_TABLE]], Ptr[
          Ptr[ASN1_STRING_TABLE]
        ], CInt]
    ): sk_ASN1_STRING_TABLE_compfunc = o
    extension (v: sk_ASN1_STRING_TABLE_compfunc)
      inline def value: CFuncPtr2[Ptr[Ptr[ASN1_STRING_TABLE]], Ptr[
        Ptr[ASN1_STRING_TABLE]
      ], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_STRING_TABLE_compfunc

  /** */
  opaque type sk_ASN1_STRING_TABLE_copyfunc =
    CFuncPtr1[Ptr[ASN1_STRING_TABLE], Ptr[ASN1_STRING_TABLE]]
  object sk_ASN1_STRING_TABLE_copyfunc:
    given _tag: Tag[sk_ASN1_STRING_TABLE_copyfunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_STRING_TABLE], Ptr[ASN1_STRING_TABLE]]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_STRING_TABLE_copyfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_STRING_TABLE], Ptr[ASN1_STRING_TABLE]]
    ): sk_ASN1_STRING_TABLE_copyfunc = o
    extension (v: sk_ASN1_STRING_TABLE_copyfunc)
      inline def value
          : CFuncPtr1[Ptr[ASN1_STRING_TABLE], Ptr[ASN1_STRING_TABLE]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_STRING_TABLE_copyfunc

  /** */
  opaque type sk_ASN1_STRING_TABLE_freefunc =
    CFuncPtr1[Ptr[ASN1_STRING_TABLE], Unit]
  object sk_ASN1_STRING_TABLE_freefunc:
    given _tag: Tag[sk_ASN1_STRING_TABLE_freefunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_STRING_TABLE], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_STRING_TABLE_freefunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_STRING_TABLE], Unit]
    ): sk_ASN1_STRING_TABLE_freefunc = o
    extension (v: sk_ASN1_STRING_TABLE_freefunc)
      inline def value: CFuncPtr1[Ptr[ASN1_STRING_TABLE], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_STRING_TABLE_freefunc

  /** */
  opaque type sk_ASN1_TYPE_compfunc =
    CFuncPtr2[Ptr[Ptr[ASN1_TYPE]], Ptr[Ptr[ASN1_TYPE]], CInt]
  object sk_ASN1_TYPE_compfunc:
    given _tag: Tag[sk_ASN1_TYPE_compfunc] =
      Tag.materializeCFuncPtr2[Ptr[Ptr[ASN1_TYPE]], Ptr[Ptr[ASN1_TYPE]], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_TYPE_compfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[Ptr[ASN1_TYPE]], Ptr[Ptr[ASN1_TYPE]], CInt]
    ): sk_ASN1_TYPE_compfunc = o
    extension (v: sk_ASN1_TYPE_compfunc)
      inline def value
          : CFuncPtr2[Ptr[Ptr[ASN1_TYPE]], Ptr[Ptr[ASN1_TYPE]], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_TYPE_compfunc

  /** */
  opaque type sk_ASN1_TYPE_copyfunc = CFuncPtr1[Ptr[ASN1_TYPE], Ptr[ASN1_TYPE]]
  object sk_ASN1_TYPE_copyfunc:
    given _tag: Tag[sk_ASN1_TYPE_copyfunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_TYPE], Ptr[ASN1_TYPE]]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_TYPE_copyfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_TYPE], Ptr[ASN1_TYPE]]
    ): sk_ASN1_TYPE_copyfunc = o
    extension (v: sk_ASN1_TYPE_copyfunc)
      inline def value: CFuncPtr1[Ptr[ASN1_TYPE], Ptr[ASN1_TYPE]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_TYPE_copyfunc

  /** */
  opaque type sk_ASN1_TYPE_freefunc = CFuncPtr1[Ptr[ASN1_TYPE], Unit]
  object sk_ASN1_TYPE_freefunc:
    given _tag: Tag[sk_ASN1_TYPE_freefunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_TYPE], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_TYPE_freefunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_TYPE], Unit]
    ): sk_ASN1_TYPE_freefunc = o
    extension (v: sk_ASN1_TYPE_freefunc)
      inline def value: CFuncPtr1[Ptr[ASN1_TYPE], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_TYPE_freefunc

  /** */
  opaque type sk_ASN1_UTF8STRING_compfunc =
    CFuncPtr2[Ptr[Ptr[ASN1_UTF8STRING]], Ptr[Ptr[ASN1_UTF8STRING]], CInt]
  object sk_ASN1_UTF8STRING_compfunc:
    given _tag: Tag[sk_ASN1_UTF8STRING_compfunc] = Tag.materializeCFuncPtr2[Ptr[
      Ptr[ASN1_UTF8STRING]
    ], Ptr[Ptr[ASN1_UTF8STRING]], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_UTF8STRING_compfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[Ptr[ASN1_UTF8STRING]], Ptr[
          Ptr[ASN1_UTF8STRING]
        ], CInt]
    ): sk_ASN1_UTF8STRING_compfunc = o
    extension (v: sk_ASN1_UTF8STRING_compfunc)
      inline def value: CFuncPtr2[Ptr[Ptr[ASN1_UTF8STRING]], Ptr[
        Ptr[ASN1_UTF8STRING]
      ], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_UTF8STRING_compfunc

  /** */
  opaque type sk_ASN1_UTF8STRING_copyfunc =
    CFuncPtr1[Ptr[ASN1_UTF8STRING], Ptr[ASN1_UTF8STRING]]
  object sk_ASN1_UTF8STRING_copyfunc:
    given _tag: Tag[sk_ASN1_UTF8STRING_copyfunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_UTF8STRING], Ptr[ASN1_UTF8STRING]]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_UTF8STRING_copyfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_UTF8STRING], Ptr[ASN1_UTF8STRING]]
    ): sk_ASN1_UTF8STRING_copyfunc = o
    extension (v: sk_ASN1_UTF8STRING_copyfunc)
      inline def value: CFuncPtr1[Ptr[ASN1_UTF8STRING], Ptr[ASN1_UTF8STRING]] =
        v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_UTF8STRING_copyfunc

  /** */
  opaque type sk_ASN1_UTF8STRING_freefunc =
    CFuncPtr1[Ptr[ASN1_UTF8STRING], Unit]
  object sk_ASN1_UTF8STRING_freefunc:
    given _tag: Tag[sk_ASN1_UTF8STRING_freefunc] =
      Tag.materializeCFuncPtr1[Ptr[ASN1_UTF8STRING], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_ASN1_UTF8STRING_freefunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[ASN1_UTF8STRING], Unit]
    ): sk_ASN1_UTF8STRING_freefunc = o
    extension (v: sk_ASN1_UTF8STRING_freefunc)
      inline def value: CFuncPtr1[Ptr[ASN1_UTF8STRING], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_ASN1_UTF8STRING_freefunc

  /** */
  opaque type sk_BIO_compfunc = CFuncPtr2[Ptr[Ptr[BIO]], Ptr[Ptr[BIO]], CInt]
  object sk_BIO_compfunc:
    given _tag: Tag[sk_BIO_compfunc] =
      Tag.materializeCFuncPtr2[Ptr[Ptr[BIO]], Ptr[Ptr[BIO]], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_BIO_compfunc = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[Ptr[BIO]], Ptr[Ptr[BIO]], CInt]
    ): sk_BIO_compfunc = o
    extension (v: sk_BIO_compfunc)
      inline def value: CFuncPtr2[Ptr[Ptr[BIO]], Ptr[Ptr[BIO]], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_BIO_compfunc

  /** */
  opaque type sk_BIO_copyfunc = CFuncPtr1[Ptr[BIO], Ptr[BIO]]
  object sk_BIO_copyfunc:
    given _tag: Tag[sk_BIO_copyfunc] =
      Tag.materializeCFuncPtr1[Ptr[BIO], Ptr[BIO]]
    inline def fromPtr(ptr: Ptr[Byte]): sk_BIO_copyfunc = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[BIO], Ptr[BIO]]): sk_BIO_copyfunc =
      o
    extension (v: sk_BIO_copyfunc)
      inline def value: CFuncPtr1[Ptr[BIO], Ptr[BIO]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /** */
  opaque type sk_BIO_freefunc = CFuncPtr1[Ptr[BIO], Unit]
  object sk_BIO_freefunc:
    given _tag: Tag[sk_BIO_freefunc] = Tag.materializeCFuncPtr1[Ptr[BIO], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_BIO_freefunc = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[BIO], Unit]): sk_BIO_freefunc = o
    extension (v: sk_BIO_freefunc)
      inline def value: CFuncPtr1[Ptr[BIO], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  /** */
  opaque type sk_OPENSSL_BLOCK_compfunc =
    CFuncPtr2[Ptr[Ptr[Byte]], Ptr[Ptr[Byte]], CInt]
  object sk_OPENSSL_BLOCK_compfunc:
    given _tag: Tag[sk_OPENSSL_BLOCK_compfunc] =
      Tag.materializeCFuncPtr2[Ptr[Ptr[Byte]], Ptr[Ptr[Byte]], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_OPENSSL_BLOCK_compfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[Ptr[Byte]], Ptr[Ptr[Byte]], CInt]
    ): sk_OPENSSL_BLOCK_compfunc = o
    extension (v: sk_OPENSSL_BLOCK_compfunc)
      inline def value: CFuncPtr2[Ptr[Ptr[Byte]], Ptr[Ptr[Byte]], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_OPENSSL_BLOCK_compfunc

  /** */
  opaque type sk_OPENSSL_BLOCK_copyfunc = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object sk_OPENSSL_BLOCK_copyfunc:
    given _tag: Tag[sk_OPENSSL_BLOCK_copyfunc] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte]): sk_OPENSSL_BLOCK_copyfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): sk_OPENSSL_BLOCK_copyfunc = o
    extension (v: sk_OPENSSL_BLOCK_copyfunc)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_OPENSSL_BLOCK_copyfunc

  /** */
  opaque type sk_OPENSSL_BLOCK_freefunc = CFuncPtr1[Ptr[Byte], Unit]
  object sk_OPENSSL_BLOCK_freefunc:
    given _tag: Tag[sk_OPENSSL_BLOCK_freefunc] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_OPENSSL_BLOCK_freefunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): sk_OPENSSL_BLOCK_freefunc = o
    extension (v: sk_OPENSSL_BLOCK_freefunc)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_OPENSSL_BLOCK_freefunc

  /** */
  opaque type sk_OPENSSL_CSTRING_compfunc =
    CFuncPtr2[Ptr[CString], Ptr[CString], CInt]
  object sk_OPENSSL_CSTRING_compfunc:
    given _tag: Tag[sk_OPENSSL_CSTRING_compfunc] =
      Tag.materializeCFuncPtr2[Ptr[CString], Ptr[CString], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_OPENSSL_CSTRING_compfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[CString], Ptr[CString], CInt]
    ): sk_OPENSSL_CSTRING_compfunc = o
    extension (v: sk_OPENSSL_CSTRING_compfunc)
      inline def value: CFuncPtr2[Ptr[CString], Ptr[CString], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_OPENSSL_CSTRING_compfunc

  /** */
  opaque type sk_OPENSSL_CSTRING_copyfunc = CFuncPtr1[CString, CString]
  object sk_OPENSSL_CSTRING_copyfunc:
    given _tag: Tag[sk_OPENSSL_CSTRING_copyfunc] =
      Tag.materializeCFuncPtr1[CString, CString]
    inline def fromPtr(ptr: Ptr[Byte]): sk_OPENSSL_CSTRING_copyfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[CString, CString]
    ): sk_OPENSSL_CSTRING_copyfunc = o
    extension (v: sk_OPENSSL_CSTRING_copyfunc)
      inline def value: CFuncPtr1[CString, CString] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_OPENSSL_CSTRING_copyfunc

  /** */
  opaque type sk_OPENSSL_CSTRING_freefunc = CFuncPtr1[CString, Unit]
  object sk_OPENSSL_CSTRING_freefunc:
    given _tag: Tag[sk_OPENSSL_CSTRING_freefunc] =
      Tag.materializeCFuncPtr1[CString, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_OPENSSL_CSTRING_freefunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[CString, Unit]
    ): sk_OPENSSL_CSTRING_freefunc = o
    extension (v: sk_OPENSSL_CSTRING_freefunc)
      inline def value: CFuncPtr1[CString, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_OPENSSL_CSTRING_freefunc

  /** */
  opaque type sk_OPENSSL_STRING_compfunc =
    CFuncPtr2[Ptr[CString], Ptr[CString], CInt]
  object sk_OPENSSL_STRING_compfunc:
    given _tag: Tag[sk_OPENSSL_STRING_compfunc] =
      Tag.materializeCFuncPtr2[Ptr[CString], Ptr[CString], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_OPENSSL_STRING_compfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[CString], Ptr[CString], CInt]
    ): sk_OPENSSL_STRING_compfunc = o
    extension (v: sk_OPENSSL_STRING_compfunc)
      inline def value: CFuncPtr2[Ptr[CString], Ptr[CString], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_OPENSSL_STRING_compfunc

  /** */
  opaque type sk_OPENSSL_STRING_copyfunc = CFuncPtr1[CString, CString]
  object sk_OPENSSL_STRING_copyfunc:
    given _tag: Tag[sk_OPENSSL_STRING_copyfunc] =
      Tag.materializeCFuncPtr1[CString, CString]
    inline def fromPtr(ptr: Ptr[Byte]): sk_OPENSSL_STRING_copyfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[CString, CString]
    ): sk_OPENSSL_STRING_copyfunc = o
    extension (v: sk_OPENSSL_STRING_copyfunc)
      inline def value: CFuncPtr1[CString, CString] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_OPENSSL_STRING_copyfunc

  /** */
  opaque type sk_OPENSSL_STRING_freefunc = CFuncPtr1[CString, Unit]
  object sk_OPENSSL_STRING_freefunc:
    given _tag: Tag[sk_OPENSSL_STRING_freefunc] =
      Tag.materializeCFuncPtr1[CString, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_OPENSSL_STRING_freefunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[CString, Unit]
    ): sk_OPENSSL_STRING_freefunc = o
    extension (v: sk_OPENSSL_STRING_freefunc)
      inline def value: CFuncPtr1[CString, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_OPENSSL_STRING_freefunc

  /** */
  opaque type sk_X509_ALGOR_compfunc =
    CFuncPtr2[Ptr[Ptr[X509_ALGOR]], Ptr[Ptr[X509_ALGOR]], CInt]
  object sk_X509_ALGOR_compfunc:
    given _tag: Tag[sk_X509_ALGOR_compfunc] =
      Tag.materializeCFuncPtr2[Ptr[Ptr[X509_ALGOR]], Ptr[Ptr[X509_ALGOR]], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_X509_ALGOR_compfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[Ptr[X509_ALGOR]], Ptr[Ptr[X509_ALGOR]], CInt]
    ): sk_X509_ALGOR_compfunc = o
    extension (v: sk_X509_ALGOR_compfunc)
      inline def value
          : CFuncPtr2[Ptr[Ptr[X509_ALGOR]], Ptr[Ptr[X509_ALGOR]], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_X509_ALGOR_compfunc

  /** */
  opaque type sk_X509_ALGOR_copyfunc =
    CFuncPtr1[Ptr[X509_ALGOR], Ptr[X509_ALGOR]]
  object sk_X509_ALGOR_copyfunc:
    given _tag: Tag[sk_X509_ALGOR_copyfunc] =
      Tag.materializeCFuncPtr1[Ptr[X509_ALGOR], Ptr[X509_ALGOR]]
    inline def fromPtr(ptr: Ptr[Byte]): sk_X509_ALGOR_copyfunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[X509_ALGOR], Ptr[X509_ALGOR]]
    ): sk_X509_ALGOR_copyfunc = o
    extension (v: sk_X509_ALGOR_copyfunc)
      inline def value: CFuncPtr1[Ptr[X509_ALGOR], Ptr[X509_ALGOR]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_X509_ALGOR_copyfunc

  /** */
  opaque type sk_X509_ALGOR_freefunc = CFuncPtr1[Ptr[X509_ALGOR], Unit]
  object sk_X509_ALGOR_freefunc:
    given _tag: Tag[sk_X509_ALGOR_freefunc] =
      Tag.materializeCFuncPtr1[Ptr[X509_ALGOR], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_X509_ALGOR_freefunc =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[X509_ALGOR], Unit]
    ): sk_X509_ALGOR_freefunc = o
    extension (v: sk_X509_ALGOR_freefunc)
      inline def value: CFuncPtr1[Ptr[X509_ALGOR], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_X509_ALGOR_freefunc

  /** */
  opaque type sk_void_compfunc = CFuncPtr2[Ptr[Ptr[Byte]], Ptr[Ptr[Byte]], CInt]
  object sk_void_compfunc:
    given _tag: Tag[sk_void_compfunc] =
      Tag.materializeCFuncPtr2[Ptr[Ptr[Byte]], Ptr[Ptr[Byte]], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): sk_void_compfunc = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[Ptr[Byte]], Ptr[Ptr[Byte]], CInt]
    ): sk_void_compfunc = o
    extension (v: sk_void_compfunc)
      inline def value: CFuncPtr2[Ptr[Ptr[Byte]], Ptr[Ptr[Byte]], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_void_compfunc

  /** */
  opaque type sk_void_copyfunc = CFuncPtr1[Ptr[Byte], Ptr[Byte]]
  object sk_void_copyfunc:
    given _tag: Tag[sk_void_copyfunc] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte]): sk_void_copyfunc = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Ptr[Byte]]
    ): sk_void_copyfunc = o
    extension (v: sk_void_copyfunc)
      inline def value: CFuncPtr1[Ptr[Byte], Ptr[Byte]] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end sk_void_copyfunc

  /** */
  opaque type sk_void_freefunc = CFuncPtr1[Ptr[Byte], Unit]
  object sk_void_freefunc:
    given _tag: Tag[sk_void_freefunc] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): sk_void_freefunc = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): sk_void_freefunc = o
    extension (v: sk_void_freefunc)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)

  type time_t = posix.sys.types.time_t
  object time_t:
    val _tag: Tag[time_t] = summon[Tag[posix.sys.types.time_t]]
    inline def apply(inline o: posix.sys.types.time_t): time_t = o
    extension (v: time_t) inline def value: posix.sys.types.time_t = v

  type tm = posix.time.tm
  object tm:
    val _tag: Tag[tm] = summon[Tag[posix.time.tm]]
    inline def apply(inline o: posix.time.tm): tm = o
    extension (v: tm) inline def value: posix.time.tm = v

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

  type uintmax_t = libc.stdint.uintmax_t
  object uintmax_t:
    val _tag: Tag[uintmax_t] = summon[Tag[libc.stdint.uintmax_t]]
    inline def apply(inline o: libc.stdint.uintmax_t): uintmax_t = o
    extension (v: uintmax_t) inline def value: libc.stdint.uintmax_t = v

  type va_list = unsafe.CVarArgList
  object va_list:
    val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
    inline def apply(inline o: unsafe.CVarArgList): va_list = o
    extension (v: va_list) inline def value: unsafe.CVarArgList = v
end aliases

object structs:
  import _root_.openssl.enumerations.*
  import _root_.openssl.predef.*
  import _root_.openssl.aliases.*
  import _root_.openssl.structs.*
  import _root_.openssl.unions.*

  /** */
  opaque type ASN1_BIT_STRING =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_BIT_STRING:
    given _tag: Tag[ASN1_BIT_STRING] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_BIT_STRING] =
      scala.scalanative.unsafe.alloc[ASN1_BIT_STRING](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_BIT_STRING] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_BIT_STRING)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_BIT_STRING

  /** */
  opaque type ASN1_BMPSTRING =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_BMPSTRING:
    given _tag: Tag[ASN1_BMPSTRING] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_BMPSTRING] =
      scala.scalanative.unsafe.alloc[ASN1_BMPSTRING](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_BMPSTRING] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_BMPSTRING)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_BMPSTRING

  /** */
  opaque type ASN1_ENCODING = CStruct3[Ptr[CUnsignedChar], CLongInt, CInt]
  object ASN1_ENCODING:
    given _tag: Tag[ASN1_ENCODING] =
      Tag.materializeCStruct3Tag[Ptr[CUnsignedChar], CLongInt, CInt]
    def apply()(using Zone): Ptr[ASN1_ENCODING] =
      scala.scalanative.unsafe.alloc[ASN1_ENCODING](1)
    def apply(enc: Ptr[CUnsignedChar], len: CLongInt, modified: CInt)(using
        Zone
    ): Ptr[ASN1_ENCODING] =
      val ____ptr = apply()
      (!____ptr).enc = enc
      (!____ptr).len = len
      (!____ptr).modified = modified
      ____ptr
    extension (struct: ASN1_ENCODING)
      def enc: Ptr[CUnsignedChar] = struct._1
      def enc_=(value: Ptr[CUnsignedChar]): Unit = !struct.at1 = value
      def len: CLongInt = struct._2
      def len_=(value: CLongInt): Unit = !struct.at2 = value
      def modified: CInt = struct._3
      def modified_=(value: CInt): Unit = !struct.at3 = value
  end ASN1_ENCODING

  /** */
  opaque type ASN1_ENCODING_st = CStruct3[Ptr[CUnsignedChar], CLongInt, CInt]
  object ASN1_ENCODING_st:
    given _tag: Tag[ASN1_ENCODING_st] =
      Tag.materializeCStruct3Tag[Ptr[CUnsignedChar], CLongInt, CInt]
    def apply()(using Zone): Ptr[ASN1_ENCODING_st] =
      scala.scalanative.unsafe.alloc[ASN1_ENCODING_st](1)
    def apply(enc: Ptr[CUnsignedChar], len: CLongInt, modified: CInt)(using
        Zone
    ): Ptr[ASN1_ENCODING_st] =
      val ____ptr = apply()
      (!____ptr).enc = enc
      (!____ptr).len = len
      (!____ptr).modified = modified
      ____ptr
    extension (struct: ASN1_ENCODING_st)
      def enc: Ptr[CUnsignedChar] = struct._1
      def enc_=(value: Ptr[CUnsignedChar]): Unit = !struct.at1 = value
      def len: CLongInt = struct._2
      def len_=(value: CLongInt): Unit = !struct.at2 = value
      def modified: CInt = struct._3
      def modified_=(value: CInt): Unit = !struct.at3 = value
  end ASN1_ENCODING_st

  /** */
  opaque type ASN1_ENUMERATED =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_ENUMERATED:
    given _tag: Tag[ASN1_ENUMERATED] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_ENUMERATED] =
      scala.scalanative.unsafe.alloc[ASN1_ENUMERATED](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_ENUMERATED] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_ENUMERATED)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_ENUMERATED

  /** */
  opaque type ASN1_GENERALIZEDTIME =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_GENERALIZEDTIME:
    given _tag: Tag[ASN1_GENERALIZEDTIME] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_GENERALIZEDTIME] =
      scala.scalanative.unsafe.alloc[ASN1_GENERALIZEDTIME](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_GENERALIZEDTIME] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_GENERALIZEDTIME)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_GENERALIZEDTIME

  /** */
  opaque type ASN1_GENERALSTRING =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_GENERALSTRING:
    given _tag: Tag[ASN1_GENERALSTRING] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_GENERALSTRING] =
      scala.scalanative.unsafe.alloc[ASN1_GENERALSTRING](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_GENERALSTRING] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_GENERALSTRING)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_GENERALSTRING

  /** */
  opaque type ASN1_IA5STRING =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_IA5STRING:
    given _tag: Tag[ASN1_IA5STRING] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_IA5STRING] =
      scala.scalanative.unsafe.alloc[ASN1_IA5STRING](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_IA5STRING] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_IA5STRING)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_IA5STRING

  /** */
  opaque type ASN1_INTEGER = CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_INTEGER:
    given _tag: Tag[ASN1_INTEGER] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_INTEGER] =
      scala.scalanative.unsafe.alloc[ASN1_INTEGER](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_INTEGER] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_INTEGER)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_INTEGER

  /** */
  opaque type ASN1_ITEM = CStruct0
  object ASN1_ITEM:
    given _tag: Tag[ASN1_ITEM] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_ITEM_st = CStruct0
  object ASN1_ITEM_st:
    given _tag: Tag[ASN1_ITEM_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_OBJECT = CStruct0
  object ASN1_OBJECT:
    given _tag: Tag[ASN1_OBJECT] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_OCTET_STRING =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_OCTET_STRING:
    given _tag: Tag[ASN1_OCTET_STRING] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_OCTET_STRING] =
      scala.scalanative.unsafe.alloc[ASN1_OCTET_STRING](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_OCTET_STRING] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_OCTET_STRING)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_OCTET_STRING

  /** */
  opaque type ASN1_PCTX = CStruct0
  object ASN1_PCTX:
    given _tag: Tag[ASN1_PCTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_PRINTABLESTRING =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_PRINTABLESTRING:
    given _tag: Tag[ASN1_PRINTABLESTRING] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_PRINTABLESTRING] =
      scala.scalanative.unsafe.alloc[ASN1_PRINTABLESTRING](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_PRINTABLESTRING] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_PRINTABLESTRING)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_PRINTABLESTRING

  /** */
  opaque type ASN1_SCTX = CStruct0
  object ASN1_SCTX:
    given _tag: Tag[ASN1_SCTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_SEQUENCE_ANY = CStruct0
  object ASN1_SEQUENCE_ANY:
    given _tag: Tag[ASN1_SEQUENCE_ANY] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_STRING = CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_STRING:
    given _tag: Tag[ASN1_STRING] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_STRING] =
      scala.scalanative.unsafe.alloc[ASN1_STRING](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_STRING] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_STRING)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_STRING

  /** */
  opaque type ASN1_STRING_TABLE =
    CStruct5[CInt, CLongInt, CLongInt, CUnsignedLongInt, CUnsignedLongInt]
  object ASN1_STRING_TABLE:
    given _tag: Tag[ASN1_STRING_TABLE] = Tag.materializeCStruct5Tag[
      CInt,
      CLongInt,
      CLongInt,
      CUnsignedLongInt,
      CUnsignedLongInt
    ]
    def apply()(using Zone): Ptr[ASN1_STRING_TABLE] =
      scala.scalanative.unsafe.alloc[ASN1_STRING_TABLE](1)
    def apply(
        nid: CInt,
        minsize: CLongInt,
        maxsize: CLongInt,
        mask: CUnsignedLongInt,
        flags: CUnsignedLongInt
    )(using Zone): Ptr[ASN1_STRING_TABLE] =
      val ____ptr = apply()
      (!____ptr).nid = nid
      (!____ptr).minsize = minsize
      (!____ptr).maxsize = maxsize
      (!____ptr).mask = mask
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_STRING_TABLE)
      def nid: CInt = struct._1
      def nid_=(value: CInt): Unit = !struct.at1 = value
      def minsize: CLongInt = struct._2
      def minsize_=(value: CLongInt): Unit = !struct.at2 = value
      def maxsize: CLongInt = struct._3
      def maxsize_=(value: CLongInt): Unit = !struct.at3 = value
      def mask: CUnsignedLongInt = struct._4
      def mask_=(value: CUnsignedLongInt): Unit = !struct.at4 = value
      def flags: CUnsignedLongInt = struct._5
      def flags_=(value: CUnsignedLongInt): Unit = !struct.at5 = value
    end extension
  end ASN1_STRING_TABLE

  /** */
  opaque type ASN1_T61STRING =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_T61STRING:
    given _tag: Tag[ASN1_T61STRING] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_T61STRING] =
      scala.scalanative.unsafe.alloc[ASN1_T61STRING](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_T61STRING] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_T61STRING)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_T61STRING

  /** */
  opaque type ASN1_TEMPLATE = CStruct0
  object ASN1_TEMPLATE:
    given _tag: Tag[ASN1_TEMPLATE] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_TEMPLATE_st = CStruct0
  object ASN1_TEMPLATE_st:
    given _tag: Tag[ASN1_TEMPLATE_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_TIME = CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_TIME:
    given _tag: Tag[ASN1_TIME] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_TIME] =
      scala.scalanative.unsafe.alloc[ASN1_TIME](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_TIME] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_TIME)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_TIME

  /** */
  opaque type ASN1_TLC = CStruct0
  object ASN1_TLC:
    given _tag: Tag[ASN1_TLC] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_TLC_st = CStruct0
  object ASN1_TLC_st:
    given _tag: Tag[ASN1_TLC_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_TYPE = CStruct2[CInt, ASN1_TYPE.Union0]
  object ASN1_TYPE:
    /** */
    opaque type Union0 = CArray[Byte, Nat._8]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
      def apply()(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_ptr")
      def apply(ptr: CString)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CString]].update(0, ptr)
        ___ptr
      @scala.annotation.targetName("apply_boolean")
      def apply(boolean: ASN1_BOOLEAN)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[ASN1_BOOLEAN]].update(0, boolean)
        ___ptr
      @scala.annotation.targetName("apply_asn1_string")
      def apply(asn1_string: Ptr[ASN1_STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]].update(0, asn1_string)
        ___ptr
      @scala.annotation.targetName("apply_object")
      def apply(`object`: Ptr[ASN1_OBJECT])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_OBJECT]]].update(0, `object`)
        ___ptr
      @scala.annotation.targetName("apply_integer")
      def apply(integer: Ptr[ASN1_INTEGER])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_INTEGER]]].update(0, integer)
        ___ptr
      @scala.annotation.targetName("apply_enumerated")
      def apply(enumerated: Ptr[ASN1_ENUMERATED])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_ENUMERATED]]].update(0, enumerated)
        ___ptr
      @scala.annotation.targetName("apply_bit_string")
      def apply(bit_string: Ptr[ASN1_BIT_STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_BIT_STRING]]].update(0, bit_string)
        ___ptr
      @scala.annotation.targetName("apply_octet_string")
      def apply(octet_string: Ptr[ASN1_OCTET_STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_OCTET_STRING]]]
          .update(0, octet_string)
        ___ptr
      @scala.annotation.targetName("apply_printablestring")
      def apply(printablestring: Ptr[ASN1_PRINTABLESTRING])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_PRINTABLESTRING]]]
          .update(0, printablestring)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_t61string")
      def apply(t61string: Ptr[ASN1_T61STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_T61STRING]]].update(0, t61string)
        ___ptr
      @scala.annotation.targetName("apply_ia5string")
      def apply(ia5string: Ptr[ASN1_IA5STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_IA5STRING]]].update(0, ia5string)
        ___ptr
      @scala.annotation.targetName("apply_generalstring")
      def apply(generalstring: Ptr[ASN1_GENERALSTRING])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_GENERALSTRING]]]
          .update(0, generalstring)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_bmpstring")
      def apply(bmpstring: Ptr[ASN1_BMPSTRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_BMPSTRING]]].update(0, bmpstring)
        ___ptr
      @scala.annotation.targetName("apply_universalstring")
      def apply(universalstring: Ptr[ASN1_UNIVERSALSTRING])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_UNIVERSALSTRING]]]
          .update(0, universalstring)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_utctime")
      def apply(utctime: Ptr[ASN1_UTCTIME])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTCTIME]]].update(0, utctime)
        ___ptr
      @scala.annotation.targetName("apply_generalizedtime")
      def apply(generalizedtime: Ptr[ASN1_GENERALIZEDTIME])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_GENERALIZEDTIME]]]
          .update(0, generalizedtime)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_visiblestring")
      def apply(visiblestring: Ptr[ASN1_VISIBLESTRING])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_VISIBLESTRING]]]
          .update(0, visiblestring)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_utf8string")
      def apply(utf8string: Ptr[ASN1_UTF8STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTF8STRING]]].update(0, utf8string)
        ___ptr
      @scala.annotation.targetName("apply_set")
      def apply(set: Ptr[ASN1_STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]].update(0, set)
        ___ptr
      @scala.annotation.targetName("apply_sequence")
      def apply(sequence: Ptr[ASN1_STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]].update(0, sequence)
        ___ptr
      @scala.annotation.targetName("apply_asn1_value")
      def apply(asn1_value: Ptr[ASN1_VALUE])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_VALUE]]].update(0, asn1_value)
        ___ptr
      extension (struct: Union0)
        def ptr: CString = !struct.at(0).asInstanceOf[Ptr[CString]]
        def ptr_=(value: CString): Unit =
          !struct.at(0).asInstanceOf[Ptr[CString]] = value
        def boolean: ASN1_BOOLEAN =
          !struct.at(0).asInstanceOf[Ptr[ASN1_BOOLEAN]]
        def boolean_=(value: ASN1_BOOLEAN): Unit =
          !struct.at(0).asInstanceOf[Ptr[ASN1_BOOLEAN]] = value
        def asn1_string: Ptr[ASN1_STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]]
        def asn1_string_=(value: Ptr[ASN1_STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]] = value
        def `object`: Ptr[ASN1_OBJECT] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_OBJECT]]]
        def object_=(value: Ptr[ASN1_OBJECT]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_OBJECT]]] = value
        def integer: Ptr[ASN1_INTEGER] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_INTEGER]]]
        def integer_=(value: Ptr[ASN1_INTEGER]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_INTEGER]]] = value
        def enumerated: Ptr[ASN1_ENUMERATED] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_ENUMERATED]]]
        def enumerated_=(value: Ptr[ASN1_ENUMERATED]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_ENUMERATED]]] = value
        def bit_string: Ptr[ASN1_BIT_STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_BIT_STRING]]]
        def bit_string_=(value: Ptr[ASN1_BIT_STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_BIT_STRING]]] = value
        def octet_string: Ptr[ASN1_OCTET_STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_OCTET_STRING]]]
        def octet_string_=(value: Ptr[ASN1_OCTET_STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_OCTET_STRING]]] = value
        def printablestring: Ptr[ASN1_PRINTABLESTRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_PRINTABLESTRING]]]
        def printablestring_=(value: Ptr[ASN1_PRINTABLESTRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_PRINTABLESTRING]]] = value
        def t61string: Ptr[ASN1_T61STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_T61STRING]]]
        def t61string_=(value: Ptr[ASN1_T61STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_T61STRING]]] = value
        def ia5string: Ptr[ASN1_IA5STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_IA5STRING]]]
        def ia5string_=(value: Ptr[ASN1_IA5STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_IA5STRING]]] = value
        def generalstring: Ptr[ASN1_GENERALSTRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_GENERALSTRING]]]
        def generalstring_=(value: Ptr[ASN1_GENERALSTRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_GENERALSTRING]]] = value
        def bmpstring: Ptr[ASN1_BMPSTRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_BMPSTRING]]]
        def bmpstring_=(value: Ptr[ASN1_BMPSTRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_BMPSTRING]]] = value
        def universalstring: Ptr[ASN1_UNIVERSALSTRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UNIVERSALSTRING]]]
        def universalstring_=(value: Ptr[ASN1_UNIVERSALSTRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UNIVERSALSTRING]]] = value
        def utctime: Ptr[ASN1_UTCTIME] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTCTIME]]]
        def utctime_=(value: Ptr[ASN1_UTCTIME]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTCTIME]]] = value
        def generalizedtime: Ptr[ASN1_GENERALIZEDTIME] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_GENERALIZEDTIME]]]
        def generalizedtime_=(value: Ptr[ASN1_GENERALIZEDTIME]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_GENERALIZEDTIME]]] = value
        def visiblestring: Ptr[ASN1_VISIBLESTRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_VISIBLESTRING]]]
        def visiblestring_=(value: Ptr[ASN1_VISIBLESTRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_VISIBLESTRING]]] = value
        def utf8string: Ptr[ASN1_UTF8STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTF8STRING]]]
        def utf8string_=(value: Ptr[ASN1_UTF8STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTF8STRING]]] = value
        def set: Ptr[ASN1_STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]]
        def set_=(value: Ptr[ASN1_STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]] = value
        def sequence: Ptr[ASN1_STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]]
        def sequence_=(value: Ptr[ASN1_STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]] = value
        def asn1_value: Ptr[ASN1_VALUE] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_VALUE]]]
        def asn1_value_=(value: Ptr[ASN1_VALUE]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_VALUE]]] = value
      end extension
    end Union0
    given _tag: Tag[ASN1_TYPE] =
      Tag.materializeCStruct2Tag[CInt, ASN1_TYPE.Union0]
    def apply()(using Zone): Ptr[ASN1_TYPE] =
      scala.scalanative.unsafe.alloc[ASN1_TYPE](1)
    def apply(`type`: CInt, value: ASN1_TYPE.Union0)(using
        Zone
    ): Ptr[ASN1_TYPE] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).value = value
      ____ptr
    extension (struct: ASN1_TYPE)
      def `type`: CInt = struct._1
      def type_=(value: CInt): Unit = !struct.at1 = value
      def value: ASN1_TYPE.Union0 = struct._2
      def value_=(value: ASN1_TYPE.Union0): Unit = !struct.at2 = value
  end ASN1_TYPE

  /** */
  opaque type ASN1_UNIVERSALSTRING =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_UNIVERSALSTRING:
    given _tag: Tag[ASN1_UNIVERSALSTRING] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_UNIVERSALSTRING] =
      scala.scalanative.unsafe.alloc[ASN1_UNIVERSALSTRING](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_UNIVERSALSTRING] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_UNIVERSALSTRING)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_UNIVERSALSTRING

  /** */
  opaque type ASN1_UTCTIME = CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_UTCTIME:
    given _tag: Tag[ASN1_UTCTIME] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_UTCTIME] =
      scala.scalanative.unsafe.alloc[ASN1_UTCTIME](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_UTCTIME] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_UTCTIME)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_UTCTIME

  /** */
  opaque type ASN1_UTF8STRING =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_UTF8STRING:
    given _tag: Tag[ASN1_UTF8STRING] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_UTF8STRING] =
      scala.scalanative.unsafe.alloc[ASN1_UTF8STRING](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_UTF8STRING] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_UTF8STRING)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_UTF8STRING

  /** */
  opaque type ASN1_VALUE = CStruct0
  object ASN1_VALUE:
    given _tag: Tag[ASN1_VALUE] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_VALUE_st = CStruct0
  object ASN1_VALUE_st:
    given _tag: Tag[ASN1_VALUE_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ASN1_VISIBLESTRING =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object ASN1_VISIBLESTRING:
    given _tag: Tag[ASN1_VISIBLESTRING] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[ASN1_VISIBLESTRING] =
      scala.scalanative.unsafe.alloc[ASN1_VISIBLESTRING](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[ASN1_VISIBLESTRING] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: ASN1_VISIBLESTRING)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end ASN1_VISIBLESTRING

  /** */
  opaque type AUTHORITY_KEYID = CStruct0
  object AUTHORITY_KEYID:
    given _tag: Tag[AUTHORITY_KEYID] = Tag.materializeCStruct0Tag

  /** */
  opaque type AUTHORITY_KEYID_st = CStruct0
  object AUTHORITY_KEYID_st:
    given _tag: Tag[AUTHORITY_KEYID_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type BIGNUM = CStruct0
  object BIGNUM:
    given _tag: Tag[BIGNUM] = Tag.materializeCStruct0Tag

  /** */
  opaque type BIO = CStruct0
  object BIO:
    given _tag: Tag[BIO] = Tag.materializeCStruct0Tag

  /** */
  opaque type BIO_ADDRINFO = CStruct0
  object BIO_ADDRINFO:
    given _tag: Tag[BIO_ADDRINFO] = Tag.materializeCStruct0Tag

  /** */
  opaque type BIO_METHOD = CStruct0
  object BIO_METHOD:
    given _tag: Tag[BIO_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type BIT_STRING_BITNAME = CStruct3[CInt, CString, CString]
  object BIT_STRING_BITNAME:
    given _tag: Tag[BIT_STRING_BITNAME] =
      Tag.materializeCStruct3Tag[CInt, CString, CString]
    def apply()(using Zone): Ptr[BIT_STRING_BITNAME] =
      scala.scalanative.unsafe.alloc[BIT_STRING_BITNAME](1)
    def apply(bitnum: CInt, lname: CString, sname: CString)(using
        Zone
    ): Ptr[BIT_STRING_BITNAME] =
      val ____ptr = apply()
      (!____ptr).bitnum = bitnum
      (!____ptr).lname = lname
      (!____ptr).sname = sname
      ____ptr
    extension (struct: BIT_STRING_BITNAME)
      def bitnum: CInt = struct._1
      def bitnum_=(value: CInt): Unit = !struct.at1 = value
      def lname: CString = struct._2
      def lname_=(value: CString): Unit = !struct.at2 = value
      def sname: CString = struct._3
      def sname_=(value: CString): Unit = !struct.at3 = value
  end BIT_STRING_BITNAME

  /** */
  opaque type BIT_STRING_BITNAME_st = CStruct3[CInt, CString, CString]
  object BIT_STRING_BITNAME_st:
    given _tag: Tag[BIT_STRING_BITNAME_st] =
      Tag.materializeCStruct3Tag[CInt, CString, CString]
    def apply()(using Zone): Ptr[BIT_STRING_BITNAME_st] =
      scala.scalanative.unsafe.alloc[BIT_STRING_BITNAME_st](1)
    def apply(bitnum: CInt, lname: CString, sname: CString)(using
        Zone
    ): Ptr[BIT_STRING_BITNAME_st] =
      val ____ptr = apply()
      (!____ptr).bitnum = bitnum
      (!____ptr).lname = lname
      (!____ptr).sname = sname
      ____ptr
    extension (struct: BIT_STRING_BITNAME_st)
      def bitnum: CInt = struct._1
      def bitnum_=(value: CInt): Unit = !struct.at1 = value
      def lname: CString = struct._2
      def lname_=(value: CString): Unit = !struct.at2 = value
      def sname: CString = struct._3
      def sname_=(value: CString): Unit = !struct.at3 = value
  end BIT_STRING_BITNAME_st

  /** */
  opaque type BN_BLINDING = CStruct0
  object BN_BLINDING:
    given _tag: Tag[BN_BLINDING] = Tag.materializeCStruct0Tag

  /** */
  opaque type BN_CTX = CStruct0
  object BN_CTX:
    given _tag: Tag[BN_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type BN_GENCB = CStruct0
  object BN_GENCB:
    given _tag: Tag[BN_GENCB] = Tag.materializeCStruct0Tag

  /** */
  opaque type BN_MONT_CTX = CStruct0
  object BN_MONT_CTX:
    given _tag: Tag[BN_MONT_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type BN_RECP_CTX = CStruct0
  object BN_RECP_CTX:
    given _tag: Tag[BN_RECP_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type BUF_MEM = CStruct0
  object BUF_MEM:
    given _tag: Tag[BUF_MEM] = Tag.materializeCStruct0Tag

  /** */
  opaque type COMP_CTX = CStruct0
  object COMP_CTX:
    given _tag: Tag[COMP_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type COMP_METHOD = CStruct0
  object COMP_METHOD:
    given _tag: Tag[COMP_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type CONF = CStruct0
  object CONF:
    given _tag: Tag[CONF] = Tag.materializeCStruct0Tag

  /** */
  opaque type CRYPTO_EX_DATA = CStruct2[Ptr[OSSL_LIB_CTX], Ptr[stack_st_void]]
  object CRYPTO_EX_DATA:
    /** */
    opaque type Struct0 = CStruct0
    object Struct0:
      given _tag: Tag[Struct0] = Tag.materializeCStruct0Tag
    given _tag: Tag[CRYPTO_EX_DATA] =
      Tag.materializeCStruct2Tag[Ptr[OSSL_LIB_CTX], Ptr[stack_st_void]]
    def apply()(using Zone): Ptr[CRYPTO_EX_DATA] =
      scala.scalanative.unsafe.alloc[CRYPTO_EX_DATA](1)
    def apply(ctx: Ptr[OSSL_LIB_CTX], sk: Ptr[stack_st_void])(using
        Zone
    ): Ptr[CRYPTO_EX_DATA] =
      val ____ptr = apply()
      (!____ptr).ctx = ctx
      (!____ptr).sk = sk
      ____ptr
    extension (struct: CRYPTO_EX_DATA)
      def ctx: Ptr[OSSL_LIB_CTX] = struct._1
      def ctx_=(value: Ptr[OSSL_LIB_CTX]): Unit = !struct.at1 = value
      def sk: Ptr[stack_st_void] = struct._2
      def sk_=(value: Ptr[stack_st_void]): Unit = !struct.at2 = value
  end CRYPTO_EX_DATA

  /** */
  opaque type CRYPTO_THREADID = CStruct1[CInt]
  object CRYPTO_THREADID:
    given _tag: Tag[CRYPTO_THREADID] = Tag.materializeCStruct1Tag[CInt]
    def apply()(using Zone): Ptr[CRYPTO_THREADID] =
      scala.scalanative.unsafe.alloc[CRYPTO_THREADID](1)
    def apply(dummy: CInt)(using Zone): Ptr[CRYPTO_THREADID] =
      val ____ptr = apply()
      (!____ptr).dummy = dummy
      ____ptr
    extension (struct: CRYPTO_THREADID)
      def dummy: CInt = struct._1
      def dummy_=(value: CInt): Unit = !struct.at1 = value
  end CRYPTO_THREADID

  /** */
  opaque type CRYPTO_dynlock = CStruct1[CInt]
  object CRYPTO_dynlock:
    given _tag: Tag[CRYPTO_dynlock] = Tag.materializeCStruct1Tag[CInt]
    def apply()(using Zone): Ptr[CRYPTO_dynlock] =
      scala.scalanative.unsafe.alloc[CRYPTO_dynlock](1)
    def apply(dummy: CInt)(using Zone): Ptr[CRYPTO_dynlock] =
      val ____ptr = apply()
      (!____ptr).dummy = dummy
      ____ptr
    extension (struct: CRYPTO_dynlock)
      def dummy: CInt = struct._1
      def dummy_=(value: CInt): Unit = !struct.at1 = value
  end CRYPTO_dynlock

  /** */
  opaque type CTLOG = CStruct0
  object CTLOG:
    given _tag: Tag[CTLOG] = Tag.materializeCStruct0Tag

  /** */
  opaque type CTLOG_STORE = CStruct0
  object CTLOG_STORE:
    given _tag: Tag[CTLOG_STORE] = Tag.materializeCStruct0Tag

  /** */
  opaque type CT_POLICY_EVAL_CTX = CStruct0
  object CT_POLICY_EVAL_CTX:
    given _tag: Tag[CT_POLICY_EVAL_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type DH = CStruct0
  object DH:
    given _tag: Tag[DH] = Tag.materializeCStruct0Tag

  /** */
  opaque type DH_METHOD = CStruct0
  object DH_METHOD:
    given _tag: Tag[DH_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type DIST_POINT = CStruct0
  object DIST_POINT:
    given _tag: Tag[DIST_POINT] = Tag.materializeCStruct0Tag

  /** */
  opaque type DIST_POINT_st = CStruct0
  object DIST_POINT_st:
    given _tag: Tag[DIST_POINT_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type DSA = CStruct0
  object DSA:
    given _tag: Tag[DSA] = Tag.materializeCStruct0Tag

  /** */
  opaque type DSA_METHOD = CStruct0
  object DSA_METHOD:
    given _tag: Tag[DSA_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type EC_KEY = CStruct0
  object EC_KEY:
    given _tag: Tag[EC_KEY] = Tag.materializeCStruct0Tag

  /** */
  opaque type EC_KEY_METHOD = CStruct0
  object EC_KEY_METHOD:
    given _tag: Tag[EC_KEY_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type ENGINE = CStruct0
  object ENGINE:
    given _tag: Tag[ENGINE] = Tag.materializeCStruct0Tag

  /** */
  opaque type ERR_STATE = CStruct0
  object ERR_STATE:
    given _tag: Tag[ERR_STATE] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_ASYM_CIPHER = CStruct0
  object EVP_ASYM_CIPHER:
    given _tag: Tag[EVP_ASYM_CIPHER] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_CIPHER = CStruct0
  object EVP_CIPHER:
    given _tag: Tag[EVP_CIPHER] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_CIPHER_CTX = CStruct0
  object EVP_CIPHER_CTX:
    given _tag: Tag[EVP_CIPHER_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_CIPHER_INFO =
    CStruct2[Ptr[EVP_CIPHER], CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]]
  object EVP_CIPHER_INFO:
    given _tag: Tag[EVP_CIPHER_INFO] = Tag.materializeCStruct2Tag[Ptr[
      EVP_CIPHER
    ], CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]]
    def apply()(using Zone): Ptr[EVP_CIPHER_INFO] =
      scala.scalanative.unsafe.alloc[EVP_CIPHER_INFO](1)
    def apply(
        cipher: Ptr[EVP_CIPHER],
        iv: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]
    )(using Zone): Ptr[EVP_CIPHER_INFO] =
      val ____ptr = apply()
      (!____ptr).cipher = cipher
      (!____ptr).iv = iv
      ____ptr
    extension (struct: EVP_CIPHER_INFO)
      def cipher: Ptr[EVP_CIPHER] = struct._1
      def cipher_=(value: Ptr[EVP_CIPHER]): Unit = !struct.at1 = value
      def iv: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]] = struct._2
      def iv_=(value: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]): Unit =
        !struct.at2 = value
  end EVP_CIPHER_INFO

  /** */
  opaque type EVP_CTRL_TLS1_1_MULTIBLOCK_PARAM =
    CStruct4[Ptr[CUnsignedChar], Ptr[CUnsignedChar], size_t, CUnsignedInt]
  object EVP_CTRL_TLS1_1_MULTIBLOCK_PARAM:
    given _tag: Tag[EVP_CTRL_TLS1_1_MULTIBLOCK_PARAM] =
      Tag.materializeCStruct4Tag[Ptr[CUnsignedChar], Ptr[
        CUnsignedChar
      ], size_t, CUnsignedInt]
    def apply()(using Zone): Ptr[EVP_CTRL_TLS1_1_MULTIBLOCK_PARAM] =
      scala.scalanative.unsafe.alloc[EVP_CTRL_TLS1_1_MULTIBLOCK_PARAM](1)
    def apply(
        out: Ptr[CUnsignedChar],
        inp: Ptr[CUnsignedChar],
        len: size_t,
        interleave: CUnsignedInt
    )(using Zone): Ptr[EVP_CTRL_TLS1_1_MULTIBLOCK_PARAM] =
      val ____ptr = apply()
      (!____ptr).out = out
      (!____ptr).inp = inp
      (!____ptr).len = len
      (!____ptr).interleave = interleave
      ____ptr
    end apply
    extension (struct: EVP_CTRL_TLS1_1_MULTIBLOCK_PARAM)
      def out: Ptr[CUnsignedChar] = struct._1
      def out_=(value: Ptr[CUnsignedChar]): Unit = !struct.at1 = value
      def inp: Ptr[CUnsignedChar] = struct._2
      def inp_=(value: Ptr[CUnsignedChar]): Unit = !struct.at2 = value
      def len: size_t = struct._3
      def len_=(value: size_t): Unit = !struct.at3 = value
      def interleave: CUnsignedInt = struct._4
      def interleave_=(value: CUnsignedInt): Unit = !struct.at4 = value
  end EVP_CTRL_TLS1_1_MULTIBLOCK_PARAM

  /** */
  opaque type EVP_ENCODE_CTX = CStruct0
  object EVP_ENCODE_CTX:
    given _tag: Tag[EVP_ENCODE_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_KDF = CStruct0
  object EVP_KDF:
    given _tag: Tag[EVP_KDF] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_KDF_CTX = CStruct0
  object EVP_KDF_CTX:
    given _tag: Tag[EVP_KDF_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_KEM = CStruct0
  object EVP_KEM:
    given _tag: Tag[EVP_KEM] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_KEYEXCH = CStruct0
  object EVP_KEYEXCH:
    given _tag: Tag[EVP_KEYEXCH] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_KEYMGMT = CStruct0
  object EVP_KEYMGMT:
    given _tag: Tag[EVP_KEYMGMT] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_MAC = CStruct0
  object EVP_MAC:
    given _tag: Tag[EVP_MAC] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_MAC_CTX = CStruct0
  object EVP_MAC_CTX:
    given _tag: Tag[EVP_MAC_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_MD = CStruct0
  object EVP_MD:
    given _tag: Tag[EVP_MD] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_MD_CTX = CStruct0
  object EVP_MD_CTX:
    given _tag: Tag[EVP_MD_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_PKEY = CStruct0
  object EVP_PKEY:
    given _tag: Tag[EVP_PKEY] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_PKEY_ASN1_METHOD = CStruct0
  object EVP_PKEY_ASN1_METHOD:
    given _tag: Tag[EVP_PKEY_ASN1_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_PKEY_CTX = CStruct0
  object EVP_PKEY_CTX:
    given _tag: Tag[EVP_PKEY_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_PKEY_METHOD = CStruct0
  object EVP_PKEY_METHOD:
    given _tag: Tag[EVP_PKEY_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_RAND = CStruct0
  object EVP_RAND:
    given _tag: Tag[EVP_RAND] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_RAND_CTX = CStruct0
  object EVP_RAND_CTX:
    given _tag: Tag[EVP_RAND_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type EVP_SIGNATURE = CStruct0
  object EVP_SIGNATURE:
    given _tag: Tag[EVP_SIGNATURE] = Tag.materializeCStruct0Tag

  /** */
  opaque type HMAC_CTX = CStruct0
  object HMAC_CTX:
    given _tag: Tag[HMAC_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type ISSUING_DIST_POINT = CStruct0
  object ISSUING_DIST_POINT:
    given _tag: Tag[ISSUING_DIST_POINT] = Tag.materializeCStruct0Tag

  /** */
  opaque type ISSUING_DIST_POINT_st = CStruct0
  object ISSUING_DIST_POINT_st:
    given _tag: Tag[ISSUING_DIST_POINT_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type NAME_CONSTRAINTS = CStruct0
  object NAME_CONSTRAINTS:
    given _tag: Tag[NAME_CONSTRAINTS] = Tag.materializeCStruct0Tag

  /** */
  opaque type NAME_CONSTRAINTS_st = CStruct0
  object NAME_CONSTRAINTS_st:
    given _tag: Tag[NAME_CONSTRAINTS_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type OBJ_NAME = CStruct4[CInt, CInt, CString, CString]
  object OBJ_NAME:
    given _tag: Tag[OBJ_NAME] =
      Tag.materializeCStruct4Tag[CInt, CInt, CString, CString]
    def apply()(using Zone): Ptr[OBJ_NAME] =
      scala.scalanative.unsafe.alloc[OBJ_NAME](1)
    def apply(`type`: CInt, alias: CInt, name: CString, data: CString)(using
        Zone
    ): Ptr[OBJ_NAME] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).alias = alias
      (!____ptr).name = name
      (!____ptr).data = data
      ____ptr
    extension (struct: OBJ_NAME)
      def `type`: CInt = struct._1
      def type_=(value: CInt): Unit = !struct.at1 = value
      def alias: CInt = struct._2
      def alias_=(value: CInt): Unit = !struct.at2 = value
      def name: CString = struct._3
      def name_=(value: CString): Unit = !struct.at3 = value
      def data: CString = struct._4
      def data_=(value: CString): Unit = !struct.at4 = value
  end OBJ_NAME

  /** */
  opaque type OCSP_RESPID = CStruct0
  object OCSP_RESPID:
    given _tag: Tag[OCSP_RESPID] = Tag.materializeCStruct0Tag

  /** */
  opaque type OCSP_RESPONSE = CStruct0
  object OCSP_RESPONSE:
    given _tag: Tag[OCSP_RESPONSE] = Tag.materializeCStruct0Tag

  /** */
  opaque type OPENSSL_CORE_CTX = CStruct0
  object OPENSSL_CORE_CTX:
    given _tag: Tag[OPENSSL_CORE_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type OPENSSL_INIT_SETTINGS = CStruct0
  object OPENSSL_INIT_SETTINGS:
    given _tag: Tag[OPENSSL_INIT_SETTINGS] = Tag.materializeCStruct0Tag

  /** */
  opaque type OPENSSL_STACK = CStruct0
  object OPENSSL_STACK:
    given _tag: Tag[OPENSSL_STACK] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_ALGORITHM =
    CStruct4[CString, CString, Ptr[OSSL_DISPATCH], CString]
  object OSSL_ALGORITHM:
    given _tag: Tag[OSSL_ALGORITHM] =
      Tag.materializeCStruct4Tag[CString, CString, Ptr[OSSL_DISPATCH], CString]
    def apply()(using Zone): Ptr[OSSL_ALGORITHM] =
      scala.scalanative.unsafe.alloc[OSSL_ALGORITHM](1)
    def apply(
        algorithm_names: CString,
        property_definition: CString,
        implementation: Ptr[OSSL_DISPATCH],
        algorithm_description: CString
    )(using Zone): Ptr[OSSL_ALGORITHM] =
      val ____ptr = apply()
      (!____ptr).algorithm_names = algorithm_names
      (!____ptr).property_definition = property_definition
      (!____ptr).implementation = implementation
      (!____ptr).algorithm_description = algorithm_description
      ____ptr
    end apply
    extension (struct: OSSL_ALGORITHM)
      def algorithm_names: CString = struct._1
      def algorithm_names_=(value: CString): Unit = !struct.at1 = value
      def property_definition: CString = struct._2
      def property_definition_=(value: CString): Unit = !struct.at2 = value
      def implementation: Ptr[OSSL_DISPATCH] = struct._3
      def implementation_=(value: Ptr[OSSL_DISPATCH]): Unit = !struct.at3 =
        value
      def algorithm_description: CString = struct._4
      def algorithm_description_=(value: CString): Unit = !struct.at4 = value
    end extension
  end OSSL_ALGORITHM

  /** */
  opaque type OSSL_CORE_BIO = CStruct0
  object OSSL_CORE_BIO:
    given _tag: Tag[OSSL_CORE_BIO] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_CORE_HANDLE = CStruct0
  object OSSL_CORE_HANDLE:
    given _tag: Tag[OSSL_CORE_HANDLE] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_DECODER = CStruct0
  object OSSL_DECODER:
    given _tag: Tag[OSSL_DECODER] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_DECODER_CTX = CStruct0
  object OSSL_DECODER_CTX:
    given _tag: Tag[OSSL_DECODER_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_DISPATCH = CStruct2[CInt, CFuncPtr0[Unit]]
  object OSSL_DISPATCH:
    given _tag: Tag[OSSL_DISPATCH] =
      Tag.materializeCStruct2Tag[CInt, CFuncPtr0[Unit]]
    def apply()(using Zone): Ptr[OSSL_DISPATCH] =
      scala.scalanative.unsafe.alloc[OSSL_DISPATCH](1)
    def apply(function_id: CInt, function: CFuncPtr0[Unit])(using
        Zone
    ): Ptr[OSSL_DISPATCH] =
      val ____ptr = apply()
      (!____ptr).function_id = function_id
      (!____ptr).function = function
      ____ptr
    extension (struct: OSSL_DISPATCH)
      def function_id: CInt = struct._1
      def function_id_=(value: CInt): Unit = !struct.at1 = value
      def function: CFuncPtr0[Unit] = struct._2
      def function_=(value: CFuncPtr0[Unit]): Unit = !struct.at2 = value
  end OSSL_DISPATCH

  /** */
  opaque type OSSL_ENCODER = CStruct0
  object OSSL_ENCODER:
    given _tag: Tag[OSSL_ENCODER] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_ENCODER_CTX = CStruct0
  object OSSL_ENCODER_CTX:
    given _tag: Tag[OSSL_ENCODER_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_HTTP_REQ_CTX = CStruct0
  object OSSL_HTTP_REQ_CTX:
    given _tag: Tag[OSSL_HTTP_REQ_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_ITEM = CStruct2[CUnsignedInt, Ptr[Byte]]
  object OSSL_ITEM:
    given _tag: Tag[OSSL_ITEM] =
      Tag.materializeCStruct2Tag[CUnsignedInt, Ptr[Byte]]
    def apply()(using Zone): Ptr[OSSL_ITEM] =
      scala.scalanative.unsafe.alloc[OSSL_ITEM](1)
    def apply(id: CUnsignedInt, ptr: Ptr[Byte])(using Zone): Ptr[OSSL_ITEM] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).ptr = ptr
      ____ptr
    extension (struct: OSSL_ITEM)
      def id: CUnsignedInt = struct._1
      def id_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def ptr: Ptr[Byte] = struct._2
      def ptr_=(value: Ptr[Byte]): Unit = !struct.at2 = value
  end OSSL_ITEM

  /** */
  opaque type OSSL_LIB_CTX = CStruct0
  object OSSL_LIB_CTX:
    given _tag: Tag[OSSL_LIB_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_PARAM =
    CStruct5[CString, CUnsignedInt, Ptr[Byte], size_t, size_t]
  object OSSL_PARAM:
    given _tag: Tag[OSSL_PARAM] = Tag
      .materializeCStruct5Tag[CString, CUnsignedInt, Ptr[Byte], size_t, size_t]
    def apply()(using Zone): Ptr[OSSL_PARAM] =
      scala.scalanative.unsafe.alloc[OSSL_PARAM](1)
    def apply(
        key: CString,
        data_type: CUnsignedInt,
        data: Ptr[Byte],
        data_size: size_t,
        return_size: size_t
    )(using Zone): Ptr[OSSL_PARAM] =
      val ____ptr = apply()
      (!____ptr).key = key
      (!____ptr).data_type = data_type
      (!____ptr).data = data
      (!____ptr).data_size = data_size
      (!____ptr).return_size = return_size
      ____ptr
    end apply
    extension (struct: OSSL_PARAM)
      def key: CString = struct._1
      def key_=(value: CString): Unit = !struct.at1 = value
      def data_type: CUnsignedInt = struct._2
      def data_type_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def data: Ptr[Byte] = struct._3
      def data_=(value: Ptr[Byte]): Unit = !struct.at3 = value
      def data_size: size_t = struct._4
      def data_size_=(value: size_t): Unit = !struct.at4 = value
      def return_size: size_t = struct._5
      def return_size_=(value: size_t): Unit = !struct.at5 = value
    end extension
  end OSSL_PARAM

  /** */
  opaque type OSSL_PARAM_BLD = CStruct0
  object OSSL_PARAM_BLD:
    given _tag: Tag[OSSL_PARAM_BLD] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_PROVIDER = CStruct0
  object OSSL_PROVIDER:
    given _tag: Tag[OSSL_PROVIDER] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_SELF_TEST = CStruct0
  object OSSL_SELF_TEST:
    given _tag: Tag[OSSL_SELF_TEST] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_STORE_INFO = CStruct0
  object OSSL_STORE_INFO:
    given _tag: Tag[OSSL_STORE_INFO] = Tag.materializeCStruct0Tag

  /** */
  opaque type OSSL_STORE_SEARCH = CStruct0
  object OSSL_STORE_SEARCH:
    given _tag: Tag[OSSL_STORE_SEARCH] = Tag.materializeCStruct0Tag

  /** */
  opaque type PKCS8_PRIV_KEY_INFO = CStruct0
  object PKCS8_PRIV_KEY_INFO:
    given _tag: Tag[PKCS8_PRIV_KEY_INFO] = Tag.materializeCStruct0Tag

  /** */
  opaque type RAND_DRBG = CStruct0
  object RAND_DRBG:
    given _tag: Tag[RAND_DRBG] = Tag.materializeCStruct0Tag

  /** */
  opaque type RAND_METHOD = CStruct0
  object RAND_METHOD:
    given _tag: Tag[RAND_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type RSA = CStruct0
  object RSA:
    given _tag: Tag[RSA] = Tag.materializeCStruct0Tag

  /** */
  opaque type RSA_METHOD = CStruct0
  object RSA_METHOD:
    given _tag: Tag[RSA_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type RSA_PSS_PARAMS = CStruct0
  object RSA_PSS_PARAMS:
    given _tag: Tag[RSA_PSS_PARAMS] = Tag.materializeCStruct0Tag

  /** */
  opaque type SCT = CStruct0
  object SCT:
    given _tag: Tag[SCT] = Tag.materializeCStruct0Tag

  /** */
  opaque type SCT_CTX = CStruct0
  object SCT_CTX:
    given _tag: Tag[SCT_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type SHA256_CTX = CStruct6[
    CArray[CUnsignedInt, Nat._8],
    CUnsignedInt,
    CUnsignedInt,
    CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]],
    CUnsignedInt,
    CUnsignedInt
  ]
  object SHA256_CTX:
    given _tag: Tag[SHA256_CTX] = Tag.materializeCStruct6Tag[CArray[
      CUnsignedInt,
      Nat._8
    ], CUnsignedInt, CUnsignedInt, CArray[
      CUnsignedInt,
      Nat.Digit2[Nat._1, Nat._6]
    ], CUnsignedInt, CUnsignedInt]
    def apply()(using Zone): Ptr[SHA256_CTX] =
      scala.scalanative.unsafe.alloc[SHA256_CTX](1)
    def apply(
        h: CArray[CUnsignedInt, Nat._8],
        Nl: CUnsignedInt,
        Nh: CUnsignedInt,
        data: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]],
        num: CUnsignedInt,
        md_len: CUnsignedInt
    )(using Zone): Ptr[SHA256_CTX] =
      val ____ptr = apply()
      (!____ptr).h = h
      (!____ptr).Nl = Nl
      (!____ptr).Nh = Nh
      (!____ptr).data = data
      (!____ptr).num = num
      (!____ptr).md_len = md_len
      ____ptr
    end apply
    extension (struct: SHA256_CTX)
      def h: CArray[CUnsignedInt, Nat._8] = struct._1
      def h_=(value: CArray[CUnsignedInt, Nat._8]): Unit = !struct.at1 = value
      def Nl: CUnsignedInt = struct._2
      def Nl_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def Nh: CUnsignedInt = struct._3
      def Nh_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def data: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]] = struct._4
      def data_=(
          value: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]]
      ): Unit = !struct.at4 = value
      def num: CUnsignedInt = struct._5
      def num_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def md_len: CUnsignedInt = struct._6
      def md_len_=(value: CUnsignedInt): Unit = !struct.at6 = value
    end extension
  end SHA256_CTX

  /** */
  opaque type SHA256state_st = CStruct6[
    CArray[CUnsignedInt, Nat._8],
    CUnsignedInt,
    CUnsignedInt,
    CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]],
    CUnsignedInt,
    CUnsignedInt
  ]
  object SHA256state_st:
    given _tag: Tag[SHA256state_st] = Tag.materializeCStruct6Tag[CArray[
      CUnsignedInt,
      Nat._8
    ], CUnsignedInt, CUnsignedInt, CArray[
      CUnsignedInt,
      Nat.Digit2[Nat._1, Nat._6]
    ], CUnsignedInt, CUnsignedInt]
    def apply()(using Zone): Ptr[SHA256state_st] =
      scala.scalanative.unsafe.alloc[SHA256state_st](1)
    def apply(
        h: CArray[CUnsignedInt, Nat._8],
        Nl: CUnsignedInt,
        Nh: CUnsignedInt,
        data: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]],
        num: CUnsignedInt,
        md_len: CUnsignedInt
    )(using Zone): Ptr[SHA256state_st] =
      val ____ptr = apply()
      (!____ptr).h = h
      (!____ptr).Nl = Nl
      (!____ptr).Nh = Nh
      (!____ptr).data = data
      (!____ptr).num = num
      (!____ptr).md_len = md_len
      ____ptr
    end apply
    extension (struct: SHA256state_st)
      def h: CArray[CUnsignedInt, Nat._8] = struct._1
      def h_=(value: CArray[CUnsignedInt, Nat._8]): Unit = !struct.at1 = value
      def Nl: CUnsignedInt = struct._2
      def Nl_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def Nh: CUnsignedInt = struct._3
      def Nh_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def data: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]] = struct._4
      def data_=(
          value: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]]
      ): Unit = !struct.at4 = value
      def num: CUnsignedInt = struct._5
      def num_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def md_len: CUnsignedInt = struct._6
      def md_len_=(value: CUnsignedInt): Unit = !struct.at6 = value
    end extension
  end SHA256state_st

  /** */
  opaque type SHA512_CTX = CStruct6[
    CArray[CUnsignedLongLong, Nat._8],
    CUnsignedLongLong,
    CUnsignedLongLong,
    SHA512_CTX.Union0,
    CUnsignedInt,
    CUnsignedInt
  ]
  object SHA512_CTX:
    /** */
    opaque type Union0 = CArray[Byte, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
    object Union0:
      given _tag: Tag[Union0] =
        Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](
          Tag.Byte,
          Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8)
        )
      def apply()(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_d")
      def apply(d: CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[
            CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]]
          ]]
          .update(0, d)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_p")
      def apply(p: CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]])(
          using Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[
            CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
          ]]
          .update(0, p)
        ___ptr
      end apply
      extension (struct: Union0)
        def d: CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]] = !struct
          .at(0)
          .asInstanceOf[Ptr[
            CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]]
          ]]
        def d_=(
            value: CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]]
        ): Unit = !struct
          .at(0)
          .asInstanceOf[Ptr[
            CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]]
          ]] = value
        def p: CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]] =
          !struct
            .at(0)
            .asInstanceOf[Ptr[
              CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
            ]]
        def p_=(
            value: CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
        ): Unit = !struct
          .at(0)
          .asInstanceOf[Ptr[
            CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
          ]] = value
      end extension
    end Union0
    given _tag: Tag[SHA512_CTX] = Tag.materializeCStruct6Tag[CArray[
      CUnsignedLongLong,
      Nat._8
    ], CUnsignedLongLong, CUnsignedLongLong, SHA512_CTX.Union0, CUnsignedInt, CUnsignedInt]
    def apply()(using Zone): Ptr[SHA512_CTX] =
      scala.scalanative.unsafe.alloc[SHA512_CTX](1)
    def apply(
        h: CArray[CUnsignedLongLong, Nat._8],
        Nl: CUnsignedLongLong,
        Nh: CUnsignedLongLong,
        u: SHA512_CTX.Union0,
        num: CUnsignedInt,
        md_len: CUnsignedInt
    )(using Zone): Ptr[SHA512_CTX] =
      val ____ptr = apply()
      (!____ptr).h = h
      (!____ptr).Nl = Nl
      (!____ptr).Nh = Nh
      (!____ptr).u = u
      (!____ptr).num = num
      (!____ptr).md_len = md_len
      ____ptr
    end apply
    extension (struct: SHA512_CTX)
      def h: CArray[CUnsignedLongLong, Nat._8] = struct._1
      def h_=(value: CArray[CUnsignedLongLong, Nat._8]): Unit = !struct.at1 =
        value
      def Nl: CUnsignedLongLong = struct._2
      def Nl_=(value: CUnsignedLongLong): Unit = !struct.at2 = value
      def Nh: CUnsignedLongLong = struct._3
      def Nh_=(value: CUnsignedLongLong): Unit = !struct.at3 = value
      def u: SHA512_CTX.Union0 = struct._4
      def u_=(value: SHA512_CTX.Union0): Unit = !struct.at4 = value
      def num: CUnsignedInt = struct._5
      def num_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def md_len: CUnsignedInt = struct._6
      def md_len_=(value: CUnsignedInt): Unit = !struct.at6 = value
    end extension
  end SHA512_CTX

  /** */
  opaque type SHA512state_st = CStruct6[
    CArray[CUnsignedLongLong, Nat._8],
    CUnsignedLongLong,
    CUnsignedLongLong,
    SHA512state_st.Union0,
    CUnsignedInt,
    CUnsignedInt
  ]
  object SHA512state_st:
    /** */
    opaque type Union0 = CArray[Byte, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
    object Union0:
      given _tag: Tag[Union0] =
        Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](
          Tag.Byte,
          Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8)
        )
      def apply()(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_d")
      def apply(d: CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[
            CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]]
          ]]
          .update(0, d)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_p")
      def apply(p: CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]])(
          using Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[
            CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
          ]]
          .update(0, p)
        ___ptr
      end apply
      extension (struct: Union0)
        def d: CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]] = !struct
          .at(0)
          .asInstanceOf[Ptr[
            CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]]
          ]]
        def d_=(
            value: CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]]
        ): Unit = !struct
          .at(0)
          .asInstanceOf[Ptr[
            CArray[CUnsignedLongLong, Nat.Digit2[Nat._1, Nat._6]]
          ]] = value
        def p: CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]] =
          !struct
            .at(0)
            .asInstanceOf[Ptr[
              CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
            ]]
        def p_=(
            value: CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
        ): Unit = !struct
          .at(0)
          .asInstanceOf[Ptr[
            CArray[CUnsignedChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
          ]] = value
      end extension
    end Union0
    given _tag: Tag[SHA512state_st] = Tag.materializeCStruct6Tag[CArray[
      CUnsignedLongLong,
      Nat._8
    ], CUnsignedLongLong, CUnsignedLongLong, SHA512state_st.Union0, CUnsignedInt, CUnsignedInt]
    def apply()(using Zone): Ptr[SHA512state_st] =
      scala.scalanative.unsafe.alloc[SHA512state_st](1)
    def apply(
        h: CArray[CUnsignedLongLong, Nat._8],
        Nl: CUnsignedLongLong,
        Nh: CUnsignedLongLong,
        u: SHA512state_st.Union0,
        num: CUnsignedInt,
        md_len: CUnsignedInt
    )(using Zone): Ptr[SHA512state_st] =
      val ____ptr = apply()
      (!____ptr).h = h
      (!____ptr).Nl = Nl
      (!____ptr).Nh = Nh
      (!____ptr).u = u
      (!____ptr).num = num
      (!____ptr).md_len = md_len
      ____ptr
    end apply
    extension (struct: SHA512state_st)
      def h: CArray[CUnsignedLongLong, Nat._8] = struct._1
      def h_=(value: CArray[CUnsignedLongLong, Nat._8]): Unit = !struct.at1 =
        value
      def Nl: CUnsignedLongLong = struct._2
      def Nl_=(value: CUnsignedLongLong): Unit = !struct.at2 = value
      def Nh: CUnsignedLongLong = struct._3
      def Nh_=(value: CUnsignedLongLong): Unit = !struct.at3 = value
      def u: SHA512state_st.Union0 = struct._4
      def u_=(value: SHA512state_st.Union0): Unit = !struct.at4 = value
      def num: CUnsignedInt = struct._5
      def num_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def md_len: CUnsignedInt = struct._6
      def md_len_=(value: CUnsignedInt): Unit = !struct.at6 = value
    end extension
  end SHA512state_st

  /** */
  opaque type SHA_CTX = CStruct9[
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]],
    CUnsignedInt
  ]
  object SHA_CTX:
    given _tag: Tag[SHA_CTX] = Tag.materializeCStruct9Tag[
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]],
      CUnsignedInt
    ]
    def apply()(using Zone): Ptr[SHA_CTX] =
      scala.scalanative.unsafe.alloc[SHA_CTX](1)
    def apply(
        h0: CUnsignedInt,
        h1: CUnsignedInt,
        h2: CUnsignedInt,
        h3: CUnsignedInt,
        h4: CUnsignedInt,
        Nl: CUnsignedInt,
        Nh: CUnsignedInt,
        data: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]],
        num: CUnsignedInt
    )(using Zone): Ptr[SHA_CTX] =
      val ____ptr = apply()
      (!____ptr).h0 = h0
      (!____ptr).h1 = h1
      (!____ptr).h2 = h2
      (!____ptr).h3 = h3
      (!____ptr).h4 = h4
      (!____ptr).Nl = Nl
      (!____ptr).Nh = Nh
      (!____ptr).data = data
      (!____ptr).num = num
      ____ptr
    end apply
    extension (struct: SHA_CTX)
      def h0: CUnsignedInt = struct._1
      def h0_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def h1: CUnsignedInt = struct._2
      def h1_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def h2: CUnsignedInt = struct._3
      def h2_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def h3: CUnsignedInt = struct._4
      def h3_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def h4: CUnsignedInt = struct._5
      def h4_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def Nl: CUnsignedInt = struct._6
      def Nl_=(value: CUnsignedInt): Unit = !struct.at6 = value
      def Nh: CUnsignedInt = struct._7
      def Nh_=(value: CUnsignedInt): Unit = !struct.at7 = value
      def data: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]] = struct._8
      def data_=(
          value: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]]
      ): Unit = !struct.at8 = value
      def num: CUnsignedInt = struct._9
      def num_=(value: CUnsignedInt): Unit = !struct.at9 = value
    end extension
  end SHA_CTX

  /** */
  opaque type SHAstate_st = CStruct9[
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]],
    CUnsignedInt
  ]
  object SHAstate_st:
    given _tag: Tag[SHAstate_st] = Tag.materializeCStruct9Tag[
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]],
      CUnsignedInt
    ]
    def apply()(using Zone): Ptr[SHAstate_st] =
      scala.scalanative.unsafe.alloc[SHAstate_st](1)
    def apply(
        h0: CUnsignedInt,
        h1: CUnsignedInt,
        h2: CUnsignedInt,
        h3: CUnsignedInt,
        h4: CUnsignedInt,
        Nl: CUnsignedInt,
        Nh: CUnsignedInt,
        data: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]],
        num: CUnsignedInt
    )(using Zone): Ptr[SHAstate_st] =
      val ____ptr = apply()
      (!____ptr).h0 = h0
      (!____ptr).h1 = h1
      (!____ptr).h2 = h2
      (!____ptr).h3 = h3
      (!____ptr).h4 = h4
      (!____ptr).Nl = Nl
      (!____ptr).Nh = Nh
      (!____ptr).data = data
      (!____ptr).num = num
      ____ptr
    end apply
    extension (struct: SHAstate_st)
      def h0: CUnsignedInt = struct._1
      def h0_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def h1: CUnsignedInt = struct._2
      def h1_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def h2: CUnsignedInt = struct._3
      def h2_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def h3: CUnsignedInt = struct._4
      def h3_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def h4: CUnsignedInt = struct._5
      def h4_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def Nl: CUnsignedInt = struct._6
      def Nl_=(value: CUnsignedInt): Unit = !struct.at6 = value
      def Nh: CUnsignedInt = struct._7
      def Nh_=(value: CUnsignedInt): Unit = !struct.at7 = value
      def data: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]] = struct._8
      def data_=(
          value: CArray[CUnsignedInt, Nat.Digit2[Nat._1, Nat._6]]
      ): Unit = !struct.at8 = value
      def num: CUnsignedInt = struct._9
      def num_=(value: CUnsignedInt): Unit = !struct.at9 = value
    end extension
  end SHAstate_st

  /** */
  opaque type SSL = CStruct0
  object SSL:
    given _tag: Tag[SSL] = Tag.materializeCStruct0Tag

  /** */
  opaque type SSL_CTX = CStruct0
  object SSL_CTX:
    given _tag: Tag[SSL_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type SSL_DANE = CStruct0
  object SSL_DANE:
    given _tag: Tag[SSL_DANE] = Tag.materializeCStruct0Tag

  /** */
  opaque type UI = CStruct0
  object UI:
    given _tag: Tag[UI] = Tag.materializeCStruct0Tag

  /** */
  opaque type UI_METHOD = CStruct0
  object UI_METHOD:
    given _tag: Tag[UI_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509 = CStruct0
  object X509:
    given _tag: Tag[X509] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509V3_CTX = CStruct0
  object X509V3_CTX:
    given _tag: Tag[X509V3_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_ALGOR = CStruct0
  object X509_ALGOR:
    given _tag: Tag[X509_ALGOR] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_CRL = CStruct0
  object X509_CRL:
    given _tag: Tag[X509_CRL] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_CRL_METHOD = CStruct0
  object X509_CRL_METHOD:
    given _tag: Tag[X509_CRL_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_LOOKUP = CStruct0
  object X509_LOOKUP:
    given _tag: Tag[X509_LOOKUP] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_LOOKUP_METHOD = CStruct0
  object X509_LOOKUP_METHOD:
    given _tag: Tag[X509_LOOKUP_METHOD] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_NAME = CStruct0
  object X509_NAME:
    given _tag: Tag[X509_NAME] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_OBJECT = CStruct0
  object X509_OBJECT:
    given _tag: Tag[X509_OBJECT] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_POLICY_CACHE = CStruct0
  object X509_POLICY_CACHE:
    given _tag: Tag[X509_POLICY_CACHE] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_POLICY_CACHE_st = CStruct0
  object X509_POLICY_CACHE_st:
    given _tag: Tag[X509_POLICY_CACHE_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_POLICY_LEVEL = CStruct0
  object X509_POLICY_LEVEL:
    given _tag: Tag[X509_POLICY_LEVEL] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_POLICY_LEVEL_st = CStruct0
  object X509_POLICY_LEVEL_st:
    given _tag: Tag[X509_POLICY_LEVEL_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_POLICY_NODE = CStruct0
  object X509_POLICY_NODE:
    given _tag: Tag[X509_POLICY_NODE] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_POLICY_NODE_st = CStruct0
  object X509_POLICY_NODE_st:
    given _tag: Tag[X509_POLICY_NODE_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_POLICY_TREE = CStruct0
  object X509_POLICY_TREE:
    given _tag: Tag[X509_POLICY_TREE] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_POLICY_TREE_st = CStruct0
  object X509_POLICY_TREE_st:
    given _tag: Tag[X509_POLICY_TREE_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_PUBKEY = CStruct0
  object X509_PUBKEY:
    given _tag: Tag[X509_PUBKEY] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_REVOKED = CStruct0
  object X509_REVOKED:
    given _tag: Tag[X509_REVOKED] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_SIG_INFO = CStruct0
  object X509_SIG_INFO:
    given _tag: Tag[X509_SIG_INFO] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_STORE = CStruct0
  object X509_STORE:
    given _tag: Tag[X509_STORE] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_STORE_CTX = CStruct0
  object X509_STORE_CTX:
    given _tag: Tag[X509_STORE_CTX] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_VERIFY_PARAM = CStruct0
  object X509_VERIFY_PARAM:
    given _tag: Tag[X509_VERIFY_PARAM] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_VERIFY_PARAM_st = CStruct0
  object X509_VERIFY_PARAM_st:
    given _tag: Tag[X509_VERIFY_PARAM_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_algor_st = CStruct0
  object X509_algor_st:
    given _tag: Tag[X509_algor_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_crl_st = CStruct0
  object X509_crl_st:
    given _tag: Tag[X509_crl_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_name_st = CStruct0
  object X509_name_st:
    given _tag: Tag[X509_name_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type X509_pubkey_st = CStruct0
  object X509_pubkey_st:
    given _tag: Tag[X509_pubkey_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type asn1_object_st = CStruct0
  object asn1_object_st:
    given _tag: Tag[asn1_object_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type asn1_pctx_st = CStruct0
  object asn1_pctx_st:
    given _tag: Tag[asn1_pctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type asn1_sctx_st = CStruct0
  object asn1_sctx_st:
    given _tag: Tag[asn1_sctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type asn1_string_st =
    CStruct4[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
  object asn1_string_st:
    given _tag: Tag[asn1_string_st] =
      Tag.materializeCStruct4Tag[CInt, CInt, Ptr[CUnsignedChar], CLongInt]
    def apply()(using Zone): Ptr[asn1_string_st] =
      scala.scalanative.unsafe.alloc[asn1_string_st](1)
    def apply(
        length: CInt,
        `type`: CInt,
        data: Ptr[CUnsignedChar],
        flags: CLongInt
    )(using Zone): Ptr[asn1_string_st] =
      val ____ptr = apply()
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: asn1_string_st)
      def length: CInt = struct._1
      def length_=(value: CInt): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def data: Ptr[CUnsignedChar] = struct._3
      def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
      def flags: CLongInt = struct._4
      def flags_=(value: CLongInt): Unit = !struct.at4 = value
  end asn1_string_st

  /** */
  opaque type asn1_string_table_st =
    CStruct5[CInt, CLongInt, CLongInt, CUnsignedLongInt, CUnsignedLongInt]
  object asn1_string_table_st:
    given _tag: Tag[asn1_string_table_st] = Tag.materializeCStruct5Tag[
      CInt,
      CLongInt,
      CLongInt,
      CUnsignedLongInt,
      CUnsignedLongInt
    ]
    def apply()(using Zone): Ptr[asn1_string_table_st] =
      scala.scalanative.unsafe.alloc[asn1_string_table_st](1)
    def apply(
        nid: CInt,
        minsize: CLongInt,
        maxsize: CLongInt,
        mask: CUnsignedLongInt,
        flags: CUnsignedLongInt
    )(using Zone): Ptr[asn1_string_table_st] =
      val ____ptr = apply()
      (!____ptr).nid = nid
      (!____ptr).minsize = minsize
      (!____ptr).maxsize = maxsize
      (!____ptr).mask = mask
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: asn1_string_table_st)
      def nid: CInt = struct._1
      def nid_=(value: CInt): Unit = !struct.at1 = value
      def minsize: CLongInt = struct._2
      def minsize_=(value: CLongInt): Unit = !struct.at2 = value
      def maxsize: CLongInt = struct._3
      def maxsize_=(value: CLongInt): Unit = !struct.at3 = value
      def mask: CUnsignedLongInt = struct._4
      def mask_=(value: CUnsignedLongInt): Unit = !struct.at4 = value
      def flags: CUnsignedLongInt = struct._5
      def flags_=(value: CUnsignedLongInt): Unit = !struct.at5 = value
    end extension
  end asn1_string_table_st

  /** */
  opaque type asn1_type_st = CStruct2[CInt, asn1_type_st.Union0]
  object asn1_type_st:
    /** */
    opaque type Union0 = CArray[Byte, Nat._8]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
      def apply()(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_ptr")
      def apply(ptr: CString)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CString]].update(0, ptr)
        ___ptr
      @scala.annotation.targetName("apply_boolean")
      def apply(boolean: ASN1_BOOLEAN)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[ASN1_BOOLEAN]].update(0, boolean)
        ___ptr
      @scala.annotation.targetName("apply_asn1_string")
      def apply(asn1_string: Ptr[ASN1_STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]].update(0, asn1_string)
        ___ptr
      @scala.annotation.targetName("apply_object")
      def apply(`object`: Ptr[ASN1_OBJECT])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_OBJECT]]].update(0, `object`)
        ___ptr
      @scala.annotation.targetName("apply_integer")
      def apply(integer: Ptr[ASN1_INTEGER])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_INTEGER]]].update(0, integer)
        ___ptr
      @scala.annotation.targetName("apply_enumerated")
      def apply(enumerated: Ptr[ASN1_ENUMERATED])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_ENUMERATED]]].update(0, enumerated)
        ___ptr
      @scala.annotation.targetName("apply_bit_string")
      def apply(bit_string: Ptr[ASN1_BIT_STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_BIT_STRING]]].update(0, bit_string)
        ___ptr
      @scala.annotation.targetName("apply_octet_string")
      def apply(octet_string: Ptr[ASN1_OCTET_STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_OCTET_STRING]]]
          .update(0, octet_string)
        ___ptr
      @scala.annotation.targetName("apply_printablestring")
      def apply(printablestring: Ptr[ASN1_PRINTABLESTRING])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_PRINTABLESTRING]]]
          .update(0, printablestring)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_t61string")
      def apply(t61string: Ptr[ASN1_T61STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_T61STRING]]].update(0, t61string)
        ___ptr
      @scala.annotation.targetName("apply_ia5string")
      def apply(ia5string: Ptr[ASN1_IA5STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_IA5STRING]]].update(0, ia5string)
        ___ptr
      @scala.annotation.targetName("apply_generalstring")
      def apply(generalstring: Ptr[ASN1_GENERALSTRING])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_GENERALSTRING]]]
          .update(0, generalstring)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_bmpstring")
      def apply(bmpstring: Ptr[ASN1_BMPSTRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_BMPSTRING]]].update(0, bmpstring)
        ___ptr
      @scala.annotation.targetName("apply_universalstring")
      def apply(universalstring: Ptr[ASN1_UNIVERSALSTRING])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_UNIVERSALSTRING]]]
          .update(0, universalstring)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_utctime")
      def apply(utctime: Ptr[ASN1_UTCTIME])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTCTIME]]].update(0, utctime)
        ___ptr
      @scala.annotation.targetName("apply_generalizedtime")
      def apply(generalizedtime: Ptr[ASN1_GENERALIZEDTIME])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_GENERALIZEDTIME]]]
          .update(0, generalizedtime)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_visiblestring")
      def apply(visiblestring: Ptr[ASN1_VISIBLESTRING])(using
          Zone
      ): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[ASN1_VISIBLESTRING]]]
          .update(0, visiblestring)
        ___ptr
      end apply
      @scala.annotation.targetName("apply_utf8string")
      def apply(utf8string: Ptr[ASN1_UTF8STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTF8STRING]]].update(0, utf8string)
        ___ptr
      @scala.annotation.targetName("apply_set")
      def apply(set: Ptr[ASN1_STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]].update(0, set)
        ___ptr
      @scala.annotation.targetName("apply_sequence")
      def apply(sequence: Ptr[ASN1_STRING])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]].update(0, sequence)
        ___ptr
      @scala.annotation.targetName("apply_asn1_value")
      def apply(asn1_value: Ptr[ASN1_VALUE])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[ASN1_VALUE]]].update(0, asn1_value)
        ___ptr
      extension (struct: Union0)
        def ptr: CString = !struct.at(0).asInstanceOf[Ptr[CString]]
        def ptr_=(value: CString): Unit =
          !struct.at(0).asInstanceOf[Ptr[CString]] = value
        def boolean: ASN1_BOOLEAN =
          !struct.at(0).asInstanceOf[Ptr[ASN1_BOOLEAN]]
        def boolean_=(value: ASN1_BOOLEAN): Unit =
          !struct.at(0).asInstanceOf[Ptr[ASN1_BOOLEAN]] = value
        def asn1_string: Ptr[ASN1_STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]]
        def asn1_string_=(value: Ptr[ASN1_STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]] = value
        def `object`: Ptr[ASN1_OBJECT] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_OBJECT]]]
        def object_=(value: Ptr[ASN1_OBJECT]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_OBJECT]]] = value
        def integer: Ptr[ASN1_INTEGER] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_INTEGER]]]
        def integer_=(value: Ptr[ASN1_INTEGER]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_INTEGER]]] = value
        def enumerated: Ptr[ASN1_ENUMERATED] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_ENUMERATED]]]
        def enumerated_=(value: Ptr[ASN1_ENUMERATED]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_ENUMERATED]]] = value
        def bit_string: Ptr[ASN1_BIT_STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_BIT_STRING]]]
        def bit_string_=(value: Ptr[ASN1_BIT_STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_BIT_STRING]]] = value
        def octet_string: Ptr[ASN1_OCTET_STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_OCTET_STRING]]]
        def octet_string_=(value: Ptr[ASN1_OCTET_STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_OCTET_STRING]]] = value
        def printablestring: Ptr[ASN1_PRINTABLESTRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_PRINTABLESTRING]]]
        def printablestring_=(value: Ptr[ASN1_PRINTABLESTRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_PRINTABLESTRING]]] = value
        def t61string: Ptr[ASN1_T61STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_T61STRING]]]
        def t61string_=(value: Ptr[ASN1_T61STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_T61STRING]]] = value
        def ia5string: Ptr[ASN1_IA5STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_IA5STRING]]]
        def ia5string_=(value: Ptr[ASN1_IA5STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_IA5STRING]]] = value
        def generalstring: Ptr[ASN1_GENERALSTRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_GENERALSTRING]]]
        def generalstring_=(value: Ptr[ASN1_GENERALSTRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_GENERALSTRING]]] = value
        def bmpstring: Ptr[ASN1_BMPSTRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_BMPSTRING]]]
        def bmpstring_=(value: Ptr[ASN1_BMPSTRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_BMPSTRING]]] = value
        def universalstring: Ptr[ASN1_UNIVERSALSTRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UNIVERSALSTRING]]]
        def universalstring_=(value: Ptr[ASN1_UNIVERSALSTRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UNIVERSALSTRING]]] = value
        def utctime: Ptr[ASN1_UTCTIME] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTCTIME]]]
        def utctime_=(value: Ptr[ASN1_UTCTIME]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTCTIME]]] = value
        def generalizedtime: Ptr[ASN1_GENERALIZEDTIME] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_GENERALIZEDTIME]]]
        def generalizedtime_=(value: Ptr[ASN1_GENERALIZEDTIME]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_GENERALIZEDTIME]]] = value
        def visiblestring: Ptr[ASN1_VISIBLESTRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_VISIBLESTRING]]]
        def visiblestring_=(value: Ptr[ASN1_VISIBLESTRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_VISIBLESTRING]]] = value
        def utf8string: Ptr[ASN1_UTF8STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTF8STRING]]]
        def utf8string_=(value: Ptr[ASN1_UTF8STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_UTF8STRING]]] = value
        def set: Ptr[ASN1_STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]]
        def set_=(value: Ptr[ASN1_STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]] = value
        def sequence: Ptr[ASN1_STRING] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]]
        def sequence_=(value: Ptr[ASN1_STRING]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_STRING]]] = value
        def asn1_value: Ptr[ASN1_VALUE] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_VALUE]]]
        def asn1_value_=(value: Ptr[ASN1_VALUE]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[ASN1_VALUE]]] = value
      end extension
    end Union0
    given _tag: Tag[asn1_type_st] =
      Tag.materializeCStruct2Tag[CInt, asn1_type_st.Union0]
    def apply()(using Zone): Ptr[asn1_type_st] =
      scala.scalanative.unsafe.alloc[asn1_type_st](1)
    def apply(`type`: CInt, value: asn1_type_st.Union0)(using
        Zone
    ): Ptr[asn1_type_st] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).value = value
      ____ptr
    extension (struct: asn1_type_st)
      def `type`: CInt = struct._1
      def type_=(value: CInt): Unit = !struct.at1 = value
      def value: asn1_type_st.Union0 = struct._2
      def value_=(value: asn1_type_st.Union0): Unit = !struct.at2 = value
  end asn1_type_st

  /** */
  opaque type bignum_ctx = CStruct0
  object bignum_ctx:
    given _tag: Tag[bignum_ctx] = Tag.materializeCStruct0Tag

  /** */
  opaque type bignum_st = CStruct0
  object bignum_st:
    given _tag: Tag[bignum_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type bio_addrinfo_st = CStruct0
  object bio_addrinfo_st:
    given _tag: Tag[bio_addrinfo_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type bio_method_st = CStruct0
  object bio_method_st:
    given _tag: Tag[bio_method_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type bio_st = CStruct0
  object bio_st:
    given _tag: Tag[bio_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type bn_blinding_st = CStruct0
  object bn_blinding_st:
    given _tag: Tag[bn_blinding_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type bn_gencb_st = CStruct0
  object bn_gencb_st:
    given _tag: Tag[bn_gencb_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type bn_mont_ctx_st = CStruct0
  object bn_mont_ctx_st:
    given _tag: Tag[bn_mont_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type bn_recp_ctx_st = CStruct0
  object bn_recp_ctx_st:
    given _tag: Tag[bn_recp_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type buf_mem_st = CStruct0
  object buf_mem_st:
    given _tag: Tag[buf_mem_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type comp_ctx_st = CStruct0
  object comp_ctx_st:
    given _tag: Tag[comp_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type comp_method_st = CStruct0
  object comp_method_st:
    given _tag: Tag[comp_method_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type conf_st = CStruct0
  object conf_st:
    given _tag: Tag[conf_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type crypto_ex_data_st =
    CStruct2[Ptr[OSSL_LIB_CTX], Ptr[stack_st_void]]
  object crypto_ex_data_st:
    /** */
    opaque type Struct0 = CStruct0
    object Struct0:
      given _tag: Tag[Struct0] = Tag.materializeCStruct0Tag
    given _tag: Tag[crypto_ex_data_st] =
      Tag.materializeCStruct2Tag[Ptr[OSSL_LIB_CTX], Ptr[stack_st_void]]
    def apply()(using Zone): Ptr[crypto_ex_data_st] =
      scala.scalanative.unsafe.alloc[crypto_ex_data_st](1)
    def apply(ctx: Ptr[OSSL_LIB_CTX], sk: Ptr[stack_st_void])(using
        Zone
    ): Ptr[crypto_ex_data_st] =
      val ____ptr = apply()
      (!____ptr).ctx = ctx
      (!____ptr).sk = sk
      ____ptr
    extension (struct: crypto_ex_data_st)
      def ctx: Ptr[OSSL_LIB_CTX] = struct._1
      def ctx_=(value: Ptr[OSSL_LIB_CTX]): Unit = !struct.at1 = value
      def sk: Ptr[stack_st_void] = struct._2
      def sk_=(value: Ptr[stack_st_void]): Unit = !struct.at2 = value
  end crypto_ex_data_st

  /** */
  opaque type crypto_threadid_st = CStruct1[CInt]
  object crypto_threadid_st:
    given _tag: Tag[crypto_threadid_st] = Tag.materializeCStruct1Tag[CInt]
    def apply()(using Zone): Ptr[crypto_threadid_st] =
      scala.scalanative.unsafe.alloc[crypto_threadid_st](1)
    def apply(dummy: CInt)(using Zone): Ptr[crypto_threadid_st] =
      val ____ptr = apply()
      (!____ptr).dummy = dummy
      ____ptr
    extension (struct: crypto_threadid_st)
      def dummy: CInt = struct._1
      def dummy_=(value: CInt): Unit = !struct.at1 = value
  end crypto_threadid_st

  /** */
  opaque type ct_policy_eval_ctx_st = CStruct0
  object ct_policy_eval_ctx_st:
    given _tag: Tag[ct_policy_eval_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ctlog_st = CStruct0
  object ctlog_st:
    given _tag: Tag[ctlog_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ctlog_store_st = CStruct0
  object ctlog_store_st:
    given _tag: Tag[ctlog_store_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type dh_method = CStruct0
  object dh_method:
    given _tag: Tag[dh_method] = Tag.materializeCStruct0Tag

  /** */
  opaque type dh_st = CStruct0
  object dh_st:
    given _tag: Tag[dh_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type dsa_method = CStruct0
  object dsa_method:
    given _tag: Tag[dsa_method] = Tag.materializeCStruct0Tag

  /** */
  opaque type dsa_st = CStruct0
  object dsa_st:
    given _tag: Tag[dsa_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ec_key_method_st = CStruct0
  object ec_key_method_st:
    given _tag: Tag[ec_key_method_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ec_key_st = CStruct0
  object ec_key_st:
    given _tag: Tag[ec_key_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type engine_st = CStruct0
  object engine_st:
    given _tag: Tag[engine_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type err_state_st = CStruct0
  object err_state_st:
    given _tag: Tag[err_state_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_Encode_Ctx_st = CStruct0
  object evp_Encode_Ctx_st:
    given _tag: Tag[evp_Encode_Ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_asym_cipher_st = CStruct0
  object evp_asym_cipher_st:
    given _tag: Tag[evp_asym_cipher_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_cipher_ctx_st = CStruct0
  object evp_cipher_ctx_st:
    given _tag: Tag[evp_cipher_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_cipher_info_st =
    CStruct2[Ptr[EVP_CIPHER], CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]]
  object evp_cipher_info_st:
    given _tag: Tag[evp_cipher_info_st] = Tag.materializeCStruct2Tag[Ptr[
      EVP_CIPHER
    ], CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]]
    def apply()(using Zone): Ptr[evp_cipher_info_st] =
      scala.scalanative.unsafe.alloc[evp_cipher_info_st](1)
    def apply(
        cipher: Ptr[EVP_CIPHER],
        iv: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]
    )(using Zone): Ptr[evp_cipher_info_st] =
      val ____ptr = apply()
      (!____ptr).cipher = cipher
      (!____ptr).iv = iv
      ____ptr
    extension (struct: evp_cipher_info_st)
      def cipher: Ptr[EVP_CIPHER] = struct._1
      def cipher_=(value: Ptr[EVP_CIPHER]): Unit = !struct.at1 = value
      def iv: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]] = struct._2
      def iv_=(value: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]): Unit =
        !struct.at2 = value
  end evp_cipher_info_st

  /** */
  opaque type evp_cipher_st = CStruct0
  object evp_cipher_st:
    given _tag: Tag[evp_cipher_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_kdf_ctx_st = CStruct0
  object evp_kdf_ctx_st:
    given _tag: Tag[evp_kdf_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_kdf_st = CStruct0
  object evp_kdf_st:
    given _tag: Tag[evp_kdf_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_kem_st = CStruct0
  object evp_kem_st:
    given _tag: Tag[evp_kem_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_keyexch_st = CStruct0
  object evp_keyexch_st:
    given _tag: Tag[evp_keyexch_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_keymgmt_st = CStruct0
  object evp_keymgmt_st:
    given _tag: Tag[evp_keymgmt_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_mac_ctx_st = CStruct0
  object evp_mac_ctx_st:
    given _tag: Tag[evp_mac_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_mac_st = CStruct0
  object evp_mac_st:
    given _tag: Tag[evp_mac_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_md_ctx_st = CStruct0
  object evp_md_ctx_st:
    given _tag: Tag[evp_md_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_md_st = CStruct0
  object evp_md_st:
    given _tag: Tag[evp_md_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_pkey_asn1_method_st = CStruct0
  object evp_pkey_asn1_method_st:
    given _tag: Tag[evp_pkey_asn1_method_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_pkey_ctx_st = CStruct0
  object evp_pkey_ctx_st:
    given _tag: Tag[evp_pkey_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_pkey_method_st = CStruct0
  object evp_pkey_method_st:
    given _tag: Tag[evp_pkey_method_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_pkey_st = CStruct0
  object evp_pkey_st:
    given _tag: Tag[evp_pkey_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_rand_ctx_st = CStruct0
  object evp_rand_ctx_st:
    given _tag: Tag[evp_rand_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_rand_st = CStruct0
  object evp_rand_st:
    given _tag: Tag[evp_rand_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type evp_signature_st = CStruct0
  object evp_signature_st:
    given _tag: Tag[evp_signature_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type hmac_ctx_st = CStruct0
  object hmac_ctx_st:
    given _tag: Tag[hmac_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type hostent = CStruct0
  object hostent:
    given _tag: Tag[hostent] = Tag.materializeCStruct0Tag

  /** */
  opaque type obj_name_st = CStruct4[CInt, CInt, CString, CString]
  object obj_name_st:
    given _tag: Tag[obj_name_st] =
      Tag.materializeCStruct4Tag[CInt, CInt, CString, CString]
    def apply()(using Zone): Ptr[obj_name_st] =
      scala.scalanative.unsafe.alloc[obj_name_st](1)
    def apply(`type`: CInt, alias: CInt, name: CString, data: CString)(using
        Zone
    ): Ptr[obj_name_st] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).alias = alias
      (!____ptr).name = name
      (!____ptr).data = data
      ____ptr
    extension (struct: obj_name_st)
      def `type`: CInt = struct._1
      def type_=(value: CInt): Unit = !struct.at1 = value
      def alias: CInt = struct._2
      def alias_=(value: CInt): Unit = !struct.at2 = value
      def name: CString = struct._3
      def name_=(value: CString): Unit = !struct.at3 = value
      def data: CString = struct._4
      def data_=(value: CString): Unit = !struct.at4 = value
  end obj_name_st

  /** */
  opaque type ocsp_responder_id_st = CStruct0
  object ocsp_responder_id_st:
    given _tag: Tag[ocsp_responder_id_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ocsp_response_st = CStruct0
  object ocsp_response_st:
    given _tag: Tag[ocsp_response_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type openssl_core_ctx_st = CStruct0
  object openssl_core_ctx_st:
    given _tag: Tag[openssl_core_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_algorithm_st =
    CStruct4[CString, CString, Ptr[OSSL_DISPATCH], CString]
  object ossl_algorithm_st:
    given _tag: Tag[ossl_algorithm_st] =
      Tag.materializeCStruct4Tag[CString, CString, Ptr[OSSL_DISPATCH], CString]
    def apply()(using Zone): Ptr[ossl_algorithm_st] =
      scala.scalanative.unsafe.alloc[ossl_algorithm_st](1)
    def apply(
        algorithm_names: CString,
        property_definition: CString,
        implementation: Ptr[OSSL_DISPATCH],
        algorithm_description: CString
    )(using Zone): Ptr[ossl_algorithm_st] =
      val ____ptr = apply()
      (!____ptr).algorithm_names = algorithm_names
      (!____ptr).property_definition = property_definition
      (!____ptr).implementation = implementation
      (!____ptr).algorithm_description = algorithm_description
      ____ptr
    end apply
    extension (struct: ossl_algorithm_st)
      def algorithm_names: CString = struct._1
      def algorithm_names_=(value: CString): Unit = !struct.at1 = value
      def property_definition: CString = struct._2
      def property_definition_=(value: CString): Unit = !struct.at2 = value
      def implementation: Ptr[OSSL_DISPATCH] = struct._3
      def implementation_=(value: Ptr[OSSL_DISPATCH]): Unit = !struct.at3 =
        value
      def algorithm_description: CString = struct._4
      def algorithm_description_=(value: CString): Unit = !struct.at4 = value
    end extension
  end ossl_algorithm_st

  /** */
  opaque type ossl_core_bio_st = CStruct0
  object ossl_core_bio_st:
    given _tag: Tag[ossl_core_bio_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_core_handle_st = CStruct0
  object ossl_core_handle_st:
    given _tag: Tag[ossl_core_handle_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_decoder_ctx_st = CStruct0
  object ossl_decoder_ctx_st:
    given _tag: Tag[ossl_decoder_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_decoder_st = CStruct0
  object ossl_decoder_st:
    given _tag: Tag[ossl_decoder_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_dispatch_st = CStruct2[CInt, CFuncPtr0[Unit]]
  object ossl_dispatch_st:
    given _tag: Tag[ossl_dispatch_st] =
      Tag.materializeCStruct2Tag[CInt, CFuncPtr0[Unit]]
    def apply()(using Zone): Ptr[ossl_dispatch_st] =
      scala.scalanative.unsafe.alloc[ossl_dispatch_st](1)
    def apply(function_id: CInt, function: CFuncPtr0[Unit])(using
        Zone
    ): Ptr[ossl_dispatch_st] =
      val ____ptr = apply()
      (!____ptr).function_id = function_id
      (!____ptr).function = function
      ____ptr
    extension (struct: ossl_dispatch_st)
      def function_id: CInt = struct._1
      def function_id_=(value: CInt): Unit = !struct.at1 = value
      def function: CFuncPtr0[Unit] = struct._2
      def function_=(value: CFuncPtr0[Unit]): Unit = !struct.at2 = value
  end ossl_dispatch_st

  /** */
  opaque type ossl_encoder_ctx_st = CStruct0
  object ossl_encoder_ctx_st:
    given _tag: Tag[ossl_encoder_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_encoder_st = CStruct0
  object ossl_encoder_st:
    given _tag: Tag[ossl_encoder_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_http_req_ctx_st = CStruct0
  object ossl_http_req_ctx_st:
    given _tag: Tag[ossl_http_req_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_init_settings_st = CStruct0
  object ossl_init_settings_st:
    given _tag: Tag[ossl_init_settings_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_item_st = CStruct2[CUnsignedInt, Ptr[Byte]]
  object ossl_item_st:
    given _tag: Tag[ossl_item_st] =
      Tag.materializeCStruct2Tag[CUnsignedInt, Ptr[Byte]]
    def apply()(using Zone): Ptr[ossl_item_st] =
      scala.scalanative.unsafe.alloc[ossl_item_st](1)
    def apply(id: CUnsignedInt, ptr: Ptr[Byte])(using Zone): Ptr[ossl_item_st] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).ptr = ptr
      ____ptr
    extension (struct: ossl_item_st)
      def id: CUnsignedInt = struct._1
      def id_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def ptr: Ptr[Byte] = struct._2
      def ptr_=(value: Ptr[Byte]): Unit = !struct.at2 = value
  end ossl_item_st

  /** */
  opaque type ossl_lib_ctx_st = CStruct0
  object ossl_lib_ctx_st:
    given _tag: Tag[ossl_lib_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_param_bld_st = CStruct0
  object ossl_param_bld_st:
    given _tag: Tag[ossl_param_bld_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_param_st =
    CStruct5[CString, CUnsignedInt, Ptr[Byte], size_t, size_t]
  object ossl_param_st:
    given _tag: Tag[ossl_param_st] = Tag
      .materializeCStruct5Tag[CString, CUnsignedInt, Ptr[Byte], size_t, size_t]
    def apply()(using Zone): Ptr[ossl_param_st] =
      scala.scalanative.unsafe.alloc[ossl_param_st](1)
    def apply(
        key: CString,
        data_type: CUnsignedInt,
        data: Ptr[Byte],
        data_size: size_t,
        return_size: size_t
    )(using Zone): Ptr[ossl_param_st] =
      val ____ptr = apply()
      (!____ptr).key = key
      (!____ptr).data_type = data_type
      (!____ptr).data = data
      (!____ptr).data_size = data_size
      (!____ptr).return_size = return_size
      ____ptr
    end apply
    extension (struct: ossl_param_st)
      def key: CString = struct._1
      def key_=(value: CString): Unit = !struct.at1 = value
      def data_type: CUnsignedInt = struct._2
      def data_type_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def data: Ptr[Byte] = struct._3
      def data_=(value: Ptr[Byte]): Unit = !struct.at3 = value
      def data_size: size_t = struct._4
      def data_size_=(value: size_t): Unit = !struct.at4 = value
      def return_size: size_t = struct._5
      def return_size_=(value: size_t): Unit = !struct.at5 = value
    end extension
  end ossl_param_st

  /** */
  opaque type ossl_provider_st = CStruct0
  object ossl_provider_st:
    given _tag: Tag[ossl_provider_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_self_test_st = CStruct0
  object ossl_self_test_st:
    given _tag: Tag[ossl_self_test_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_store_info_st = CStruct0
  object ossl_store_info_st:
    given _tag: Tag[ossl_store_info_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ossl_store_search_st = CStruct0
  object ossl_store_search_st:
    given _tag: Tag[ossl_store_search_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type pkcs8_priv_key_info_st = CStruct0
  object pkcs8_priv_key_info_st:
    given _tag: Tag[pkcs8_priv_key_info_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type rand_drbg_st = CStruct0
  object rand_drbg_st:
    given _tag: Tag[rand_drbg_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type rand_meth_st = CStruct0
  object rand_meth_st:
    given _tag: Tag[rand_meth_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type rsa_meth_st = CStruct0
  object rsa_meth_st:
    given _tag: Tag[rsa_meth_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type rsa_pss_params_st = CStruct0
  object rsa_pss_params_st:
    given _tag: Tag[rsa_pss_params_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type rsa_st = CStruct0
  object rsa_st:
    given _tag: Tag[rsa_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type sct_ctx_st = CStruct0
  object sct_ctx_st:
    given _tag: Tag[sct_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type sct_st = CStruct0
  object sct_st:
    given _tag: Tag[sct_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ssl_ctx_st = CStruct0
  object ssl_ctx_st:
    given _tag: Tag[ssl_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ssl_dane_st = CStruct0
  object ssl_dane_st:
    given _tag: Tag[ssl_dane_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ssl_st = CStruct0
  object ssl_st:
    given _tag: Tag[ssl_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st = CStruct0
  object stack_st:
    given _tag: Tag[stack_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_ASN1_GENERALSTRING = CStruct0
  object stack_st_ASN1_GENERALSTRING:
    given _tag: Tag[stack_st_ASN1_GENERALSTRING] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_ASN1_INTEGER = CStruct0
  object stack_st_ASN1_INTEGER:
    given _tag: Tag[stack_st_ASN1_INTEGER] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_ASN1_OBJECT = CStruct0
  object stack_st_ASN1_OBJECT:
    given _tag: Tag[stack_st_ASN1_OBJECT] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_ASN1_STRING_TABLE = CStruct0
  object stack_st_ASN1_STRING_TABLE:
    given _tag: Tag[stack_st_ASN1_STRING_TABLE] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_ASN1_TYPE = CStruct0
  object stack_st_ASN1_TYPE:
    given _tag: Tag[stack_st_ASN1_TYPE] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_ASN1_UTF8STRING = CStruct0
  object stack_st_ASN1_UTF8STRING:
    given _tag: Tag[stack_st_ASN1_UTF8STRING] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_BIGNUM = CStruct0
  object stack_st_BIGNUM:
    given _tag: Tag[stack_st_BIGNUM] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_BIGNUM_const = CStruct0
  object stack_st_BIGNUM_const:
    given _tag: Tag[stack_st_BIGNUM_const] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_BIO = CStruct0
  object stack_st_BIO:
    given _tag: Tag[stack_st_BIO] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_OPENSSL_BLOCK = CStruct0
  object stack_st_OPENSSL_BLOCK:
    given _tag: Tag[stack_st_OPENSSL_BLOCK] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_OPENSSL_CSTRING = CStruct0
  object stack_st_OPENSSL_CSTRING:
    given _tag: Tag[stack_st_OPENSSL_CSTRING] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_OPENSSL_STRING = CStruct0
  object stack_st_OPENSSL_STRING:
    given _tag: Tag[stack_st_OPENSSL_STRING] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_X509_ALGOR = CStruct0
  object stack_st_X509_ALGOR:
    given _tag: Tag[stack_st_X509_ALGOR] = Tag.materializeCStruct0Tag

  /** */
  opaque type stack_st_void = CStruct0
  object stack_st_void:
    given _tag: Tag[stack_st_void] = Tag.materializeCStruct0Tag

  /** */
  opaque type ui_method_st = CStruct0
  object ui_method_st:
    given _tag: Tag[ui_method_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type ui_st = CStruct0
  object ui_st:
    given _tag: Tag[ui_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type v3_ext_ctx = CStruct0
  object v3_ext_ctx:
    given _tag: Tag[v3_ext_ctx] = Tag.materializeCStruct0Tag

  /** */
  opaque type x509_crl_method_st = CStruct0
  object x509_crl_method_st:
    given _tag: Tag[x509_crl_method_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type x509_lookup_method_st = CStruct0
  object x509_lookup_method_st:
    given _tag: Tag[x509_lookup_method_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type x509_lookup_st = CStruct0
  object x509_lookup_st:
    given _tag: Tag[x509_lookup_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type x509_object_st = CStruct0
  object x509_object_st:
    given _tag: Tag[x509_object_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type x509_revoked_st = CStruct0
  object x509_revoked_st:
    given _tag: Tag[x509_revoked_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type x509_sig_info_st = CStruct0
  object x509_sig_info_st:
    given _tag: Tag[x509_sig_info_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type x509_st = CStruct0
  object x509_st:
    given _tag: Tag[x509_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type x509_store_ctx_st = CStruct0
  object x509_store_ctx_st:
    given _tag: Tag[x509_store_ctx_st] = Tag.materializeCStruct0Tag

  /** */
  opaque type x509_store_st = CStruct0
  object x509_store_st:
    given _tag: Tag[x509_store_st] = Tag.materializeCStruct0Tag
end structs

object unions:
  import _root_.openssl.enumerations.*
  import _root_.openssl.predef.*
  import _root_.openssl.aliases.*
  import _root_.openssl.structs.*
  import _root_.openssl.unions.*

  /** */
  opaque type BIO_ADDR = CArray[Byte, Nat._1]
  object BIO_ADDR:
    given _tag: Tag[BIO_ADDR] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)

  /** */
  opaque type BIO_sock_info_u = CArray[Byte, Nat._8]
  object BIO_sock_info_u:
    given _tag: Tag[BIO_sock_info_u] =
      Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    def apply()(using Zone): Ptr[BIO_sock_info_u] =
      val ___ptr = alloc[BIO_sock_info_u](1)
      ___ptr
    @scala.annotation.targetName("apply_addr")
    def apply(addr: Ptr[BIO_ADDR])(using Zone): Ptr[BIO_sock_info_u] =
      val ___ptr = alloc[BIO_sock_info_u](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Ptr[BIO_ADDR]]].update(0, addr)
      ___ptr
    extension (struct: BIO_sock_info_u)
      def addr: Ptr[BIO_ADDR] = !struct.at(0).asInstanceOf[Ptr[Ptr[BIO_ADDR]]]
      def addr_=(value: Ptr[BIO_ADDR]): Unit =
        !struct.at(0).asInstanceOf[Ptr[Ptr[BIO_ADDR]]] = value
  end BIO_sock_info_u

  /** */
  opaque type bio_addr_st = CArray[Byte, Nat._1]
  object bio_addr_st:
    given _tag: Tag[bio_addr_st] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)
end unions

@extern
private[openssl] object extern_functions:
  import _root_.openssl.enumerations.*
  import _root_.openssl.predef.*
  import _root_.openssl.aliases.*
  import _root_.openssl.structs.*
  import _root_.openssl.unions.*

  /** */
  def ASN1_ANY_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_BIT_STRING_check(
      a: Ptr[ASN1_BIT_STRING],
      flags: Ptr[CUnsignedChar],
      flags_len: CInt
  ): CInt = extern

  /** */
  def ASN1_BIT_STRING_free(a: Ptr[ASN1_BIT_STRING]): Unit = extern

  /** */
  def ASN1_BIT_STRING_get_bit(a: Ptr[ASN1_BIT_STRING], n: CInt): CInt = extern

  /** */
  def ASN1_BIT_STRING_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_BIT_STRING_name_print(
      out: Ptr[BIO],
      bs: Ptr[ASN1_BIT_STRING],
      tbl: Ptr[BIT_STRING_BITNAME],
      indent: CInt
  ): CInt = extern

  /** */
  def ASN1_BIT_STRING_new(): Ptr[ASN1_BIT_STRING] = extern

  /** */
  def ASN1_BIT_STRING_num_asc(
      name: CString,
      tbl: Ptr[BIT_STRING_BITNAME]
  ): CInt = extern

  /** */
  def ASN1_BIT_STRING_set(
      a: Ptr[ASN1_BIT_STRING],
      d: Ptr[CUnsignedChar],
      length: CInt
  ): CInt = extern

  /** */
  def ASN1_BIT_STRING_set_asc(
      bs: Ptr[ASN1_BIT_STRING],
      name: CString,
      value: CInt,
      tbl: Ptr[BIT_STRING_BITNAME]
  ): CInt = extern

  /** */
  def ASN1_BIT_STRING_set_bit(
      a: Ptr[ASN1_BIT_STRING],
      n: CInt,
      value: CInt
  ): CInt = extern

  /** */
  def ASN1_BMPSTRING_free(a: Ptr[ASN1_BMPSTRING]): Unit = extern

  /** */
  def ASN1_BMPSTRING_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_BMPSTRING_new(): Ptr[ASN1_BMPSTRING] = extern

  /** */
  def ASN1_ENUMERATED_free(a: Ptr[ASN1_ENUMERATED]): Unit = extern

  /** */
  def ASN1_ENUMERATED_get(a: Ptr[ASN1_ENUMERATED]): CLongInt = extern

  /** */
  def ASN1_ENUMERATED_get_int64(
      pr: Ptr[int64_t],
      a: Ptr[ASN1_ENUMERATED]
  ): CInt = extern

  /** */
  def ASN1_ENUMERATED_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_ENUMERATED_new(): Ptr[ASN1_ENUMERATED] = extern

  /** */
  def ASN1_ENUMERATED_set(a: Ptr[ASN1_ENUMERATED], v: CLongInt): CInt = extern

  /** */
  def ASN1_ENUMERATED_set_int64(a: Ptr[ASN1_ENUMERATED], r: int64_t): CInt =
    extern

  /** */
  def ASN1_ENUMERATED_to_BN(
      ai: Ptr[ASN1_ENUMERATED],
      bn: Ptr[BIGNUM]
  ): Ptr[BIGNUM] = extern

  /** */
  def ASN1_GENERALIZEDTIME_adj(
      s: Ptr[ASN1_GENERALIZEDTIME],
      t: time_t,
      offset_day: CInt,
      offset_sec: CLongInt
  ): Ptr[ASN1_GENERALIZEDTIME] = extern

  /** */
  def ASN1_GENERALIZEDTIME_check(a: Ptr[ASN1_GENERALIZEDTIME]): CInt = extern

  /** */
  def ASN1_GENERALIZEDTIME_dup(
      a: Ptr[ASN1_GENERALIZEDTIME]
  ): Ptr[ASN1_GENERALIZEDTIME] = extern

  /** */
  def ASN1_GENERALIZEDTIME_free(a: Ptr[ASN1_GENERALIZEDTIME]): Unit = extern

  /** */
  def ASN1_GENERALIZEDTIME_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_GENERALIZEDTIME_new(): Ptr[ASN1_GENERALIZEDTIME] = extern

  /** */
  def ASN1_GENERALIZEDTIME_print(
      fp: Ptr[BIO],
      a: Ptr[ASN1_GENERALIZEDTIME]
  ): CInt = extern

  /** */
  def ASN1_GENERALIZEDTIME_set(
      s: Ptr[ASN1_GENERALIZEDTIME],
      t: time_t
  ): Ptr[ASN1_GENERALIZEDTIME] = extern

  /** */
  def ASN1_GENERALIZEDTIME_set_string(
      s: Ptr[ASN1_GENERALIZEDTIME],
      str: CString
  ): CInt = extern

  /** */
  def ASN1_GENERALSTRING_free(a: Ptr[ASN1_GENERALSTRING]): Unit = extern

  /** */
  def ASN1_GENERALSTRING_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_GENERALSTRING_new(): Ptr[ASN1_GENERALSTRING] = extern

  /** */
  def ASN1_IA5STRING_free(a: Ptr[ASN1_IA5STRING]): Unit = extern

  /** */
  def ASN1_IA5STRING_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_IA5STRING_new(): Ptr[ASN1_IA5STRING] = extern

  /** */
  def ASN1_INTEGER_cmp(x: Ptr[ASN1_INTEGER], y: Ptr[ASN1_INTEGER]): CInt =
    extern

  /** */
  def ASN1_INTEGER_dup(a: Ptr[ASN1_INTEGER]): Ptr[ASN1_INTEGER] = extern

  /** */
  def ASN1_INTEGER_free(a: Ptr[ASN1_INTEGER]): Unit = extern

  /** */
  def ASN1_INTEGER_get(a: Ptr[ASN1_INTEGER]): CLongInt = extern

  /** */
  def ASN1_INTEGER_get_int64(pr: Ptr[int64_t], a: Ptr[ASN1_INTEGER]): CInt =
    extern

  /** */
  def ASN1_INTEGER_get_uint64(pr: Ptr[uint64_t], a: Ptr[ASN1_INTEGER]): CInt =
    extern

  /** */
  def ASN1_INTEGER_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_INTEGER_new(): Ptr[ASN1_INTEGER] = extern

  /** */
  def ASN1_INTEGER_set(a: Ptr[ASN1_INTEGER], v: CLongInt): CInt = extern

  /** */
  def ASN1_INTEGER_set_int64(a: Ptr[ASN1_INTEGER], r: int64_t): CInt = extern

  /** */
  def ASN1_INTEGER_set_uint64(a: Ptr[ASN1_INTEGER], r: uint64_t): CInt = extern

  /** */
  def ASN1_INTEGER_to_BN(ai: Ptr[ASN1_INTEGER], bn: Ptr[BIGNUM]): Ptr[BIGNUM] =
    extern

  /** */
  def ASN1_ITEM_get(i: size_t): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_ITEM_lookup(name: CString): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_NULL_free(a: Ptr[ASN1_NULL]): Unit = extern

  /** */
  def ASN1_NULL_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_NULL_new(): Ptr[ASN1_NULL] = extern

  /** */
  def ASN1_OBJECT_create(
      nid: CInt,
      data: Ptr[CUnsignedChar],
      len: CInt,
      sn: CString,
      ln: CString
  ): Ptr[ASN1_OBJECT] = extern

  /** */
  def ASN1_OBJECT_free(a: Ptr[ASN1_OBJECT]): Unit = extern

  /** */
  def ASN1_OBJECT_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_OBJECT_new(): Ptr[ASN1_OBJECT] = extern

  /** */
  def ASN1_OCTET_STRING_NDEF_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_OCTET_STRING_cmp(
      a: Ptr[ASN1_OCTET_STRING],
      b: Ptr[ASN1_OCTET_STRING]
  ): CInt = extern

  /** */
  def ASN1_OCTET_STRING_dup(a: Ptr[ASN1_OCTET_STRING]): Ptr[ASN1_OCTET_STRING] =
    extern

  /** */
  def ASN1_OCTET_STRING_free(a: Ptr[ASN1_OCTET_STRING]): Unit = extern

  /** */
  def ASN1_OCTET_STRING_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_OCTET_STRING_new(): Ptr[ASN1_OCTET_STRING] = extern

  /** */
  def ASN1_OCTET_STRING_set(
      str: Ptr[ASN1_OCTET_STRING],
      data: Ptr[CUnsignedChar],
      len: CInt
  ): CInt = extern

  /** */
  def ASN1_PCTX_free(p: Ptr[ASN1_PCTX]): Unit = extern

  /** */
  def ASN1_PCTX_get_cert_flags(p: Ptr[ASN1_PCTX]): CUnsignedLongInt = extern

  /** */
  def ASN1_PCTX_get_flags(p: Ptr[ASN1_PCTX]): CUnsignedLongInt = extern

  /** */
  def ASN1_PCTX_get_nm_flags(p: Ptr[ASN1_PCTX]): CUnsignedLongInt = extern

  /** */
  def ASN1_PCTX_get_oid_flags(p: Ptr[ASN1_PCTX]): CUnsignedLongInt = extern

  /** */
  def ASN1_PCTX_get_str_flags(p: Ptr[ASN1_PCTX]): CUnsignedLongInt = extern

  /** */
  def ASN1_PCTX_new(): Ptr[ASN1_PCTX] = extern

  /** */
  def ASN1_PCTX_set_cert_flags(
      p: Ptr[ASN1_PCTX],
      flags: CUnsignedLongInt
  ): Unit = extern

  /** */
  def ASN1_PCTX_set_flags(p: Ptr[ASN1_PCTX], flags: CUnsignedLongInt): Unit =
    extern

  /** */
  def ASN1_PCTX_set_nm_flags(p: Ptr[ASN1_PCTX], flags: CUnsignedLongInt): Unit =
    extern

  /** */
  def ASN1_PCTX_set_oid_flags(
      p: Ptr[ASN1_PCTX],
      flags: CUnsignedLongInt
  ): Unit = extern

  /** */
  def ASN1_PCTX_set_str_flags(
      p: Ptr[ASN1_PCTX],
      flags: CUnsignedLongInt
  ): Unit = extern

  /** */
  def ASN1_PRINTABLESTRING_free(a: Ptr[ASN1_PRINTABLESTRING]): Unit = extern

  /** */
  def ASN1_PRINTABLESTRING_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_PRINTABLESTRING_new(): Ptr[ASN1_PRINTABLESTRING] = extern

  /** */
  def ASN1_PRINTABLE_free(a: Ptr[ASN1_STRING]): Unit = extern

  /** */
  def ASN1_PRINTABLE_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_PRINTABLE_new(): Ptr[ASN1_STRING] = extern

  /** */
  def ASN1_PRINTABLE_type(s: Ptr[CUnsignedChar], max: CInt): CInt = extern

  /** */
  def ASN1_SCTX_free(p: Ptr[ASN1_SCTX]): Unit = extern

  /** */
  def ASN1_SCTX_get_app_data(p: Ptr[ASN1_SCTX]): Ptr[Byte] = extern

  /** */
  def ASN1_SCTX_get_flags(p: Ptr[ASN1_SCTX]): CUnsignedLongInt = extern

  /** */
  def ASN1_SCTX_get_item(p: Ptr[ASN1_SCTX]): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_SCTX_get_template(p: Ptr[ASN1_SCTX]): Ptr[ASN1_TEMPLATE] = extern

  /** */
  def ASN1_SCTX_new(scan_cb: CFuncPtr1[Ptr[ASN1_SCTX], CInt]): Ptr[ASN1_SCTX] =
    extern

  /** */
  def ASN1_SCTX_set_app_data(p: Ptr[ASN1_SCTX], data: Ptr[Byte]): Unit = extern

  /** */
  def ASN1_SEQUENCE_ANY_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_SET_ANY_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_STRING_TABLE_add(
      _0: CInt,
      _1: CLongInt,
      _2: CLongInt,
      _3: CUnsignedLongInt,
      _4: CUnsignedLongInt
  ): CInt = extern

  /** */
  def ASN1_STRING_TABLE_cleanup(): Unit = extern

  /** */
  def ASN1_STRING_TABLE_get(nid: CInt): Ptr[ASN1_STRING_TABLE] = extern

  /** */
  def ASN1_STRING_clear_free(a: Ptr[ASN1_STRING]): Unit = extern

  /** */
  def ASN1_STRING_cmp(a: Ptr[ASN1_STRING], b: Ptr[ASN1_STRING]): CInt = extern

  /** */
  def ASN1_STRING_copy(dst: Ptr[ASN1_STRING], str: Ptr[ASN1_STRING]): CInt =
    extern

  /** */
  def ASN1_STRING_data(x: Ptr[ASN1_STRING]): Ptr[CUnsignedChar] = extern

  /** */
  def ASN1_STRING_dup(a: Ptr[ASN1_STRING]): Ptr[ASN1_STRING] = extern

  /** */
  def ASN1_STRING_free(a: Ptr[ASN1_STRING]): Unit = extern

  /** */
  def ASN1_STRING_get0_data(x: Ptr[ASN1_STRING]): Ptr[CUnsignedChar] = extern

  /** */
  def ASN1_STRING_get_default_mask(): CUnsignedLongInt = extern

  /** */
  def ASN1_STRING_length(x: Ptr[ASN1_STRING]): CInt = extern

  /** */
  def ASN1_STRING_length_set(x: Ptr[ASN1_STRING], n: CInt): Unit = extern

  /** */
  def ASN1_STRING_new(): Ptr[ASN1_STRING] = extern

  /** */
  def ASN1_STRING_print(bp: Ptr[BIO], v: Ptr[ASN1_STRING]): CInt = extern

  /** */
  def ASN1_STRING_print_ex(
      out: Ptr[BIO],
      str: Ptr[ASN1_STRING],
      flags: CUnsignedLongInt
  ): CInt = extern

  /** */
  def ASN1_STRING_print_ex_fp(
      fp: Ptr[FILE],
      str: Ptr[ASN1_STRING],
      flags: CUnsignedLongInt
  ): CInt = extern

  /** */
  def ASN1_STRING_set(str: Ptr[ASN1_STRING], data: Ptr[Byte], len: CInt): CInt =
    extern

  /** */
  def ASN1_STRING_set0(
      str: Ptr[ASN1_STRING],
      data: Ptr[Byte],
      len: CInt
  ): Unit = extern

  /** */
  def ASN1_STRING_set_by_NID(
      out: Ptr[Ptr[ASN1_STRING]],
      in: Ptr[CUnsignedChar],
      inlen: CInt,
      inform: CInt,
      nid: CInt
  ): Ptr[ASN1_STRING] = extern

  /** */
  def ASN1_STRING_set_default_mask(mask: CUnsignedLongInt): Unit = extern

  /** */
  def ASN1_STRING_set_default_mask_asc(p: CString): CInt = extern

  /** */
  def ASN1_STRING_to_UTF8(
      out: Ptr[Ptr[CUnsignedChar]],
      in: Ptr[ASN1_STRING]
  ): CInt = extern

  /** */
  def ASN1_STRING_type(x: Ptr[ASN1_STRING]): CInt = extern

  /** */
  def ASN1_STRING_type_new(`type`: CInt): Ptr[ASN1_STRING] = extern

  /** */
  def ASN1_T61STRING_free(a: Ptr[ASN1_T61STRING]): Unit = extern

  /** */
  def ASN1_T61STRING_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_T61STRING_new(): Ptr[ASN1_T61STRING] = extern

  /** */
  def ASN1_TIME_adj(
      s: Ptr[ASN1_TIME],
      t: time_t,
      offset_day: CInt,
      offset_sec: CLongInt
  ): Ptr[ASN1_TIME] = extern

  /** */
  def ASN1_TIME_check(t: Ptr[ASN1_TIME]): CInt = extern

  /** */
  def ASN1_TIME_cmp_time_t(s: Ptr[ASN1_TIME], t: time_t): CInt = extern

  /** */
  def ASN1_TIME_compare(a: Ptr[ASN1_TIME], b: Ptr[ASN1_TIME]): CInt = extern

  /** */
  def ASN1_TIME_diff(
      pday: Ptr[CInt],
      psec: Ptr[CInt],
      from: Ptr[ASN1_TIME],
      to: Ptr[ASN1_TIME]
  ): CInt = extern

  /** */
  def ASN1_TIME_dup(a: Ptr[ASN1_TIME]): Ptr[ASN1_TIME] = extern

  /** */
  def ASN1_TIME_free(a: Ptr[ASN1_TIME]): Unit = extern

  /** */
  def ASN1_TIME_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_TIME_new(): Ptr[ASN1_TIME] = extern

  /** */
  def ASN1_TIME_normalize(s: Ptr[ASN1_TIME]): CInt = extern

  /** */
  def ASN1_TIME_print(bp: Ptr[BIO], tm: Ptr[ASN1_TIME]): CInt = extern

  /** */
  def ASN1_TIME_print_ex(
      bp: Ptr[BIO],
      tm: Ptr[ASN1_TIME],
      flags: CUnsignedLongInt
  ): CInt = extern

  /** */
  def ASN1_TIME_set(s: Ptr[ASN1_TIME], t: time_t): Ptr[ASN1_TIME] = extern

  /** */
  def ASN1_TIME_set_string(s: Ptr[ASN1_TIME], str: CString): CInt = extern

  /** */
  def ASN1_TIME_set_string_X509(s: Ptr[ASN1_TIME], str: CString): CInt = extern

  /** */
  def ASN1_TIME_to_generalizedtime(
      t: Ptr[ASN1_TIME],
      out: Ptr[Ptr[ASN1_GENERALIZEDTIME]]
  ): Ptr[ASN1_GENERALIZEDTIME] = extern

  /** */
  def ASN1_TIME_to_tm(s: Ptr[ASN1_TIME], tm: Ptr[tm]): CInt = extern

  /** */
  def ASN1_TYPE_cmp(a: Ptr[ASN1_TYPE], b: Ptr[ASN1_TYPE]): CInt = extern

  /** */
  def ASN1_TYPE_free(a: Ptr[ASN1_TYPE]): Unit = extern

  /** */
  def ASN1_TYPE_get(a: Ptr[ASN1_TYPE]): CInt = extern

  /** */
  def ASN1_TYPE_get_int_octetstring(
      a: Ptr[ASN1_TYPE],
      num: Ptr[CLongInt],
      data: Ptr[CUnsignedChar],
      max_len: CInt
  ): CInt = extern

  /** */
  def ASN1_TYPE_get_octetstring(
      a: Ptr[ASN1_TYPE],
      data: Ptr[CUnsignedChar],
      max_len: CInt
  ): CInt = extern

  /** */
  def ASN1_TYPE_new(): Ptr[ASN1_TYPE] = extern

  /** */
  def ASN1_TYPE_pack_sequence(
      it: Ptr[ASN1_ITEM],
      s: Ptr[Byte],
      t: Ptr[Ptr[ASN1_TYPE]]
  ): Ptr[ASN1_TYPE] = extern

  /** */
  def ASN1_TYPE_set(a: Ptr[ASN1_TYPE], `type`: CInt, value: Ptr[Byte]): Unit =
    extern

  /** */
  def ASN1_TYPE_set1(a: Ptr[ASN1_TYPE], `type`: CInt, value: Ptr[Byte]): CInt =
    extern

  /** */
  def ASN1_TYPE_set_int_octetstring(
      a: Ptr[ASN1_TYPE],
      num: CLongInt,
      data: Ptr[CUnsignedChar],
      len: CInt
  ): CInt = extern

  /** */
  def ASN1_TYPE_set_octetstring(
      a: Ptr[ASN1_TYPE],
      data: Ptr[CUnsignedChar],
      len: CInt
  ): CInt = extern

  /** */
  def ASN1_TYPE_unpack_sequence(
      it: Ptr[ASN1_ITEM],
      t: Ptr[ASN1_TYPE]
  ): Ptr[Byte] = extern

  /** */
  def ASN1_UNIVERSALSTRING_free(a: Ptr[ASN1_UNIVERSALSTRING]): Unit = extern

  /** */
  def ASN1_UNIVERSALSTRING_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_UNIVERSALSTRING_new(): Ptr[ASN1_UNIVERSALSTRING] = extern

  /** */
  def ASN1_UNIVERSALSTRING_to_string(s: Ptr[ASN1_UNIVERSALSTRING]): CInt =
    extern

  /** */
  def ASN1_UTCTIME_adj(
      s: Ptr[ASN1_UTCTIME],
      t: time_t,
      offset_day: CInt,
      offset_sec: CLongInt
  ): Ptr[ASN1_UTCTIME] = extern

  /** */
  def ASN1_UTCTIME_check(a: Ptr[ASN1_UTCTIME]): CInt = extern

  /** */
  def ASN1_UTCTIME_cmp_time_t(s: Ptr[ASN1_UTCTIME], t: time_t): CInt = extern

  /** */
  def ASN1_UTCTIME_dup(a: Ptr[ASN1_UTCTIME]): Ptr[ASN1_UTCTIME] = extern

  /** */
  def ASN1_UTCTIME_free(a: Ptr[ASN1_UTCTIME]): Unit = extern

  /** */
  def ASN1_UTCTIME_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_UTCTIME_new(): Ptr[ASN1_UTCTIME] = extern

  /** */
  def ASN1_UTCTIME_print(fp: Ptr[BIO], a: Ptr[ASN1_UTCTIME]): CInt = extern

  /** */
  def ASN1_UTCTIME_set(s: Ptr[ASN1_UTCTIME], t: time_t): Ptr[ASN1_UTCTIME] =
    extern

  /** */
  def ASN1_UTCTIME_set_string(s: Ptr[ASN1_UTCTIME], str: CString): CInt = extern

  /** */
  def ASN1_UTF8STRING_free(a: Ptr[ASN1_UTF8STRING]): Unit = extern

  /** */
  def ASN1_UTF8STRING_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_UTF8STRING_new(): Ptr[ASN1_UTF8STRING] = extern

  /** */
  def ASN1_VISIBLESTRING_free(a: Ptr[ASN1_VISIBLESTRING]): Unit = extern

  /** */
  def ASN1_VISIBLESTRING_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def ASN1_VISIBLESTRING_new(): Ptr[ASN1_VISIBLESTRING] = extern

  /** */
  def ASN1_add_oid_module(): Unit = extern

  /** */
  def ASN1_add_stable_module(): Unit = extern

  /** */
  def ASN1_bn_print(
      bp: Ptr[BIO],
      number: CString,
      num: Ptr[BIGNUM],
      buf: Ptr[CUnsignedChar],
      off: CInt
  ): CInt = extern

  /** */
  def ASN1_buf_print(
      bp: Ptr[BIO],
      buf: Ptr[CUnsignedChar],
      buflen: size_t,
      off: CInt
  ): CInt = extern

  /** */
  def ASN1_check_infinite_end(p: Ptr[Ptr[CUnsignedChar]], len: CLongInt): CInt =
    extern

  /** */
  def ASN1_const_check_infinite_end(
      p: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): CInt = extern

  /** */
  def ASN1_d2i_bio(
      xnew: CFuncPtr0[Ptr[Byte]],
      d2i: Ptr[d2i_of_void],
      in: Ptr[BIO],
      x: Ptr[Ptr[Byte]]
  ): Ptr[Byte] = extern

  /** */
  def ASN1_d2i_fp(
      xnew: CFuncPtr0[Ptr[Byte]],
      d2i: Ptr[d2i_of_void],
      in: Ptr[FILE],
      x: Ptr[Ptr[Byte]]
  ): Ptr[Byte] = extern

  /** */
  def ASN1_dup(
      i2d: Ptr[i2d_of_void],
      d2i: Ptr[d2i_of_void],
      x: Ptr[Byte]
  ): Ptr[Byte] = extern

  /** */
  def ASN1_generate_nconf(str: CString, nconf: Ptr[CONF]): Ptr[ASN1_TYPE] =
    extern

  /** */
  def ASN1_generate_v3(str: CString, cnf: Ptr[X509V3_CTX]): Ptr[ASN1_TYPE] =
    extern

  /** */
  def ASN1_get_object(
      pp: Ptr[Ptr[CUnsignedChar]],
      plength: Ptr[CLongInt],
      ptag: Ptr[CInt],
      pclass: Ptr[CInt],
      omax: CLongInt
  ): CInt = extern

  /** */
  def ASN1_i2d_bio(i2d: Ptr[i2d_of_void], out: Ptr[BIO], x: Ptr[Byte]): CInt =
    extern

  /** */
  def ASN1_i2d_fp(i2d: Ptr[i2d_of_void], out: Ptr[FILE], x: Ptr[Byte]): CInt =
    extern

  /** */
  def ASN1_item_d2i(
      `val`: Ptr[Ptr[ASN1_VALUE]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt,
      it: Ptr[ASN1_ITEM]
  ): Ptr[ASN1_VALUE] = extern

  /** */
  def ASN1_item_d2i_bio(
      it: Ptr[ASN1_ITEM],
      in: Ptr[BIO],
      pval: Ptr[Byte]
  ): Ptr[Byte] = extern

  /** */
  def ASN1_item_d2i_bio_ex(
      it: Ptr[ASN1_ITEM],
      in: Ptr[BIO],
      pval: Ptr[Byte],
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): Ptr[Byte] = extern

  /** */
  def ASN1_item_d2i_ex(
      `val`: Ptr[Ptr[ASN1_VALUE]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt,
      it: Ptr[ASN1_ITEM],
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): Ptr[ASN1_VALUE] = extern

  /** */
  def ASN1_item_d2i_fp(
      it: Ptr[ASN1_ITEM],
      in: Ptr[FILE],
      x: Ptr[Byte]
  ): Ptr[Byte] = extern

  /** */
  def ASN1_item_d2i_fp_ex(
      it: Ptr[ASN1_ITEM],
      in: Ptr[FILE],
      x: Ptr[Byte],
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): Ptr[Byte] = extern

  /** */
  def ASN1_item_dup(it: Ptr[ASN1_ITEM], x: Ptr[Byte]): Ptr[Byte] = extern

  /** */
  def ASN1_item_free(`val`: Ptr[ASN1_VALUE], it: Ptr[ASN1_ITEM]): Unit = extern

  /** */
  def ASN1_item_i2d(
      `val`: Ptr[ASN1_VALUE],
      out: Ptr[Ptr[CUnsignedChar]],
      it: Ptr[ASN1_ITEM]
  ): CInt = extern

  /** */
  def ASN1_item_i2d_bio(it: Ptr[ASN1_ITEM], out: Ptr[BIO], x: Ptr[Byte]): CInt =
    extern

  /** */
  def ASN1_item_i2d_fp(it: Ptr[ASN1_ITEM], out: Ptr[FILE], x: Ptr[Byte]): CInt =
    extern

  /** */
  def ASN1_item_i2d_mem_bio(
      it: Ptr[ASN1_ITEM],
      `val`: Ptr[ASN1_VALUE]
  ): Ptr[BIO] = extern

  /** */
  def ASN1_item_ndef_i2d(
      `val`: Ptr[ASN1_VALUE],
      out: Ptr[Ptr[CUnsignedChar]],
      it: Ptr[ASN1_ITEM]
  ): CInt = extern

  /** */
  def ASN1_item_new(it: Ptr[ASN1_ITEM]): Ptr[ASN1_VALUE] = extern

  /** */
  def ASN1_item_new_ex(
      it: Ptr[ASN1_ITEM],
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): Ptr[ASN1_VALUE] = extern

  /** */
  def ASN1_item_pack(
      obj: Ptr[Byte],
      it: Ptr[ASN1_ITEM],
      oct: Ptr[Ptr[ASN1_OCTET_STRING]]
  ): Ptr[ASN1_STRING] = extern

  /** */
  def ASN1_item_print(
      out: Ptr[BIO],
      ifld: Ptr[ASN1_VALUE],
      indent: CInt,
      it: Ptr[ASN1_ITEM],
      pctx: Ptr[ASN1_PCTX]
  ): CInt = extern

  /** */
  def ASN1_item_sign_ex(
      it: Ptr[ASN1_ITEM],
      algor1: Ptr[X509_ALGOR],
      algor2: Ptr[X509_ALGOR],
      signature: Ptr[ASN1_BIT_STRING],
      data: Ptr[Byte],
      id: Ptr[ASN1_OCTET_STRING],
      pkey: Ptr[EVP_PKEY],
      md: Ptr[EVP_MD],
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): CInt = extern

  /** */
  def ASN1_item_unpack(oct: Ptr[ASN1_STRING], it: Ptr[ASN1_ITEM]): Ptr[Byte] =
    extern

  /** */
  def ASN1_item_verify_ex(
      it: Ptr[ASN1_ITEM],
      alg: Ptr[X509_ALGOR],
      signature: Ptr[ASN1_BIT_STRING],
      data: Ptr[Byte],
      id: Ptr[ASN1_OCTET_STRING],
      pkey: Ptr[EVP_PKEY],
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): CInt = extern

  /** */
  def ASN1_mbstring_copy(
      out: Ptr[Ptr[ASN1_STRING]],
      in: Ptr[CUnsignedChar],
      len: CInt,
      inform: CInt,
      mask: CUnsignedLongInt
  ): CInt = extern

  /** */
  def ASN1_mbstring_ncopy(
      out: Ptr[Ptr[ASN1_STRING]],
      in: Ptr[CUnsignedChar],
      len: CInt,
      inform: CInt,
      mask: CUnsignedLongInt,
      minsize: CLongInt,
      maxsize: CLongInt
  ): CInt = extern

  /** */
  def ASN1_object_size(constructed: CInt, length: CInt, tag: CInt): CInt =
    extern

  /** */
  def ASN1_parse(
      bp: Ptr[BIO],
      pp: Ptr[CUnsignedChar],
      len: CLongInt,
      indent: CInt
  ): CInt = extern

  /** */
  def ASN1_parse_dump(
      bp: Ptr[BIO],
      pp: Ptr[CUnsignedChar],
      len: CLongInt,
      indent: CInt,
      dump: CInt
  ): CInt = extern

  /** */
  def ASN1_put_eoc(pp: Ptr[Ptr[CUnsignedChar]]): CInt = extern

  /** */
  def ASN1_put_object(
      pp: Ptr[Ptr[CUnsignedChar]],
      constructed: CInt,
      length: CInt,
      tag: CInt,
      xclass: CInt
  ): Unit = extern

  /** */
  def ASN1_str2mask(str: CString, pmask: Ptr[CUnsignedLongInt]): CInt = extern

  /** */
  def ASN1_tag2bit(tag: CInt): CUnsignedLongInt = extern

  /** */
  def ASN1_tag2str(tag: CInt): CString = extern

  /** */
  def BIO_ADDRINFO_address(bai: Ptr[BIO_ADDRINFO]): Ptr[BIO_ADDR] = extern

  /** */
  def BIO_ADDRINFO_family(bai: Ptr[BIO_ADDRINFO]): CInt = extern

  /** */
  def BIO_ADDRINFO_free(bai: Ptr[BIO_ADDRINFO]): Unit = extern

  /** */
  def BIO_ADDRINFO_next(bai: Ptr[BIO_ADDRINFO]): Ptr[BIO_ADDRINFO] = extern

  /** */
  def BIO_ADDRINFO_protocol(bai: Ptr[BIO_ADDRINFO]): CInt = extern

  /** */
  def BIO_ADDRINFO_socktype(bai: Ptr[BIO_ADDRINFO]): CInt = extern

  /** */
  def BIO_ADDR_clear(ap: Ptr[BIO_ADDR]): Unit = extern

  /** */
  def BIO_ADDR_family(ap: Ptr[BIO_ADDR]): CInt = extern

  /** */
  def BIO_ADDR_free(_0: Ptr[BIO_ADDR]): Unit = extern

  /** */
  def BIO_ADDR_hostname_string(ap: Ptr[BIO_ADDR], numeric: CInt): CString =
    extern

  /** */
  def BIO_ADDR_new(): Ptr[BIO_ADDR] = extern

  /** */
  def BIO_ADDR_path_string(ap: Ptr[BIO_ADDR]): CString = extern

  /** */
  def BIO_ADDR_rawaddress(
      ap: Ptr[BIO_ADDR],
      p: Ptr[Byte],
      l: Ptr[size_t]
  ): CInt = extern

  /** */
  def BIO_ADDR_rawmake(
      ap: Ptr[BIO_ADDR],
      family: CInt,
      where: Ptr[Byte],
      wherelen: size_t,
      port: CUnsignedShort
  ): CInt = extern

  /** */
  def BIO_ADDR_rawport(ap: Ptr[BIO_ADDR]): CUnsignedShort = extern

  /** */
  def BIO_ADDR_service_string(ap: Ptr[BIO_ADDR], numeric: CInt): CString =
    extern

  /** */
  def BIO_accept(sock: CInt, ip_port: Ptr[CString]): CInt = extern

  /** */
  def BIO_accept_ex(
      accept_sock: CInt,
      addr: Ptr[BIO_ADDR],
      options: CInt
  ): CInt = extern

  /** */
  def BIO_asn1_get_prefix(
      b: Ptr[BIO],
      pprefix: Ptr[Ptr[asn1_ps_func]],
      pprefix_free: Ptr[Ptr[asn1_ps_func]]
  ): CInt = extern

  /** */
  def BIO_asn1_get_suffix(
      b: Ptr[BIO],
      psuffix: Ptr[Ptr[asn1_ps_func]],
      psuffix_free: Ptr[Ptr[asn1_ps_func]]
  ): CInt = extern

  /** */
  def BIO_asn1_set_prefix(
      b: Ptr[BIO],
      prefix: Ptr[asn1_ps_func],
      prefix_free: Ptr[asn1_ps_func]
  ): CInt = extern

  /** */
  def BIO_asn1_set_suffix(
      b: Ptr[BIO],
      suffix: Ptr[asn1_ps_func],
      suffix_free: Ptr[asn1_ps_func]
  ): CInt = extern

  /** */
  def BIO_bind(sock: CInt, addr: Ptr[BIO_ADDR], options: CInt): CInt = extern

  /** */
  def BIO_callback_ctrl(
      b: Ptr[BIO],
      cmd: CInt,
      fp: Ptr[BIO_info_cb]
  ): CLongInt = extern

  /** */
  def BIO_clear_flags(b: Ptr[BIO], flags: CInt): Unit = extern

  /** */
  def BIO_closesocket(sock: CInt): CInt = extern

  /** */
  def BIO_connect(sock: CInt, addr: Ptr[BIO_ADDR], options: CInt): CInt = extern

  /** */
  def BIO_copy_next_retry(b: Ptr[BIO]): Unit = extern

  /** */
  def BIO_ctrl(
      bp: Ptr[BIO],
      cmd: CInt,
      larg: CLongInt,
      parg: Ptr[Byte]
  ): CLongInt = extern

  /** */
  def BIO_ctrl_get_read_request(b: Ptr[BIO]): size_t = extern

  /** */
  def BIO_ctrl_get_write_guarantee(b: Ptr[BIO]): size_t = extern

  /** */
  def BIO_ctrl_pending(b: Ptr[BIO]): size_t = extern

  /** */
  def BIO_ctrl_reset_read_request(b: Ptr[BIO]): CInt = extern

  /** */
  def BIO_ctrl_wpending(b: Ptr[BIO]): size_t = extern

  /** */
  def BIO_debug_callback(
      bio: Ptr[BIO],
      cmd: CInt,
      argp: CString,
      argi: CInt,
      argl: CLongInt,
      ret: CLongInt
  ): CLongInt = extern

  /** */
  def BIO_debug_callback_ex(
      bio: Ptr[BIO],
      oper: CInt,
      argp: CString,
      len: size_t,
      argi: CInt,
      argl: CLongInt,
      ret: CInt,
      processed: Ptr[size_t]
  ): CLongInt = extern

  /** */
  def BIO_dgram_non_fatal_error(error: CInt): CInt = extern

  /** */
  def BIO_do_connect_retry(
      bio: Ptr[BIO],
      timeout: CInt,
      nap_milliseconds: CInt
  ): CInt = extern

  /** */
  def BIO_dump(b: Ptr[BIO], bytes: Ptr[Byte], len: CInt): CInt = extern

  /** */
  def BIO_dump_cb(
      cb: CFuncPtr3[Ptr[Byte], size_t, Ptr[Byte], CInt],
      u: Ptr[Byte],
      s: Ptr[Byte],
      len: CInt
  ): CInt = extern

  /** */
  def BIO_dump_fp(fp: Ptr[FILE], s: Ptr[Byte], len: CInt): CInt = extern

  /** */
  def BIO_dump_indent(
      b: Ptr[BIO],
      bytes: Ptr[Byte],
      len: CInt,
      indent: CInt
  ): CInt = extern

  /** */
  def BIO_dump_indent_cb(
      cb: CFuncPtr3[Ptr[Byte], size_t, Ptr[Byte], CInt],
      u: Ptr[Byte],
      s: Ptr[Byte],
      len: CInt,
      indent: CInt
  ): CInt = extern

  /** */
  def BIO_dump_indent_fp(
      fp: Ptr[FILE],
      s: Ptr[Byte],
      len: CInt,
      indent: CInt
  ): CInt = extern

  /** */
  def BIO_dup_chain(in: Ptr[BIO]): Ptr[BIO] = extern

  /** */
  def BIO_f_asn1(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_f_base64(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_f_buffer(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_f_cipher(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_f_linebuffer(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_f_md(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_f_nbio_test(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_f_null(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_f_prefix(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_f_readbuffer(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_f_reliable(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_fd_non_fatal_error(error: CInt): CInt = extern

  /** */
  def BIO_fd_should_retry(i: CInt): CInt = extern

  /** */
  def BIO_find_type(b: Ptr[BIO], bio_type: CInt): Ptr[BIO] = extern

  /** */
  def BIO_free(a: Ptr[BIO]): CInt = extern

  /** */
  def BIO_free_all(a: Ptr[BIO]): Unit = extern

  /** */
  def BIO_get_accept_socket(host_port: CString, mode: CInt): CInt = extern

  /** */
  def BIO_get_callback(b: Ptr[BIO]): BIO_callback_fn = extern

  /** */
  def BIO_get_callback_arg(b: Ptr[BIO]): CString = extern

  /** */
  def BIO_get_callback_ex(b: Ptr[BIO]): BIO_callback_fn_ex = extern

  /** */
  def BIO_get_data(a: Ptr[BIO]): Ptr[Byte] = extern

  /** */
  def BIO_get_ex_data(bio: Ptr[BIO], idx: CInt): Ptr[Byte] = extern

  /** */
  def BIO_get_host_ip(str: CString, ip: Ptr[CUnsignedChar]): CInt = extern

  /** */
  def BIO_get_init(a: Ptr[BIO]): CInt = extern

  /** */
  def BIO_get_line(bio: Ptr[BIO], buf: CString, size: CInt): CInt = extern

  /** */
  def BIO_get_new_index(): CInt = extern

  /** */
  def BIO_get_port(str: CString, port_ptr: Ptr[CUnsignedShort]): CInt = extern

  /** */
  def BIO_get_retry_BIO(bio: Ptr[BIO], reason: Ptr[CInt]): Ptr[BIO] = extern

  /** */
  def BIO_get_retry_reason(bio: Ptr[BIO]): CInt = extern

  /** */
  def BIO_get_shutdown(a: Ptr[BIO]): CInt = extern

  /** */
  def BIO_gethostbyname(name: CString): Ptr[hostent] = extern

  /** */
  def BIO_gets(bp: Ptr[BIO], buf: CString, size: CInt): CInt = extern

  /** */
  def BIO_hex_string(
      out: Ptr[BIO],
      indent: CInt,
      width: CInt,
      data: Ptr[Byte],
      datalen: CInt
  ): CInt = extern

  /** */
  def BIO_indent(b: Ptr[BIO], indent: CInt, max: CInt): CInt = extern

  /** */
  def BIO_int_ctrl(
      bp: Ptr[BIO],
      cmd: CInt,
      larg: CLongInt,
      iarg: CInt
  ): CLongInt = extern

  /** */
  def BIO_listen(sock: CInt, addr: Ptr[BIO_ADDR], options: CInt): CInt = extern

  /** */
  def BIO_lookup(
      host: CString,
      service: CString,
      lookup_type: BIO_lookup_type,
      family: CInt,
      socktype: CInt,
      res: Ptr[Ptr[BIO_ADDRINFO]]
  ): CInt = extern

  /** */
  def BIO_lookup_ex(
      host: CString,
      service: CString,
      lookup_type: CInt,
      family: CInt,
      socktype: CInt,
      protocol: CInt,
      res: Ptr[Ptr[BIO_ADDRINFO]]
  ): CInt = extern

  /** */
  def BIO_meth_free(biom: Ptr[BIO_METHOD]): Unit = extern

  /** */
  def BIO_meth_get_callback_ctrl(
      _0: Ptr[BIO]
  ): CFuncPtr3[Ptr[BIO], CInt, Ptr[BIO_info_cb], CLongInt] = extern

  /** */
  def BIO_meth_get_create(_0: Ptr[BIO]): CFuncPtr1[Ptr[BIO], CInt] = extern

  /** */
  def BIO_meth_get_ctrl(
      _0: Ptr[BIO]
  ): CFuncPtr4[Ptr[BIO], CInt, CLongInt, Ptr[Byte], CLongInt] = extern

  /** */
  def BIO_meth_get_destroy(_0: Ptr[BIO]): CFuncPtr1[Ptr[BIO], CInt] = extern

  /** */
  def BIO_meth_get_gets(
      _0: Ptr[BIO]
  ): CFuncPtr3[Ptr[BIO], CString, CInt, CInt] = extern

  /** */
  def BIO_meth_get_puts(_0: Ptr[BIO]): CFuncPtr2[Ptr[BIO], CString, CInt] =
    extern

  /** */
  def BIO_meth_get_read(
      _0: Ptr[BIO]
  ): CFuncPtr3[Ptr[BIO], CString, CInt, CInt] = extern

  /** */
  def BIO_meth_get_read_ex(
      _0: Ptr[BIO]
  ): CFuncPtr4[Ptr[BIO], CString, size_t, Ptr[size_t], CInt] = extern

  /** */
  def BIO_meth_get_write(
      _0: Ptr[BIO]
  ): CFuncPtr3[Ptr[BIO], CString, CInt, CInt] = extern

  /** */
  def BIO_meth_get_write_ex(
      _0: Ptr[BIO]
  ): CFuncPtr4[Ptr[BIO], CString, size_t, Ptr[size_t], CInt] = extern

  /** */
  def BIO_meth_new(`type`: CInt, name: CString): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_meth_set_callback_ctrl(
      biom: Ptr[BIO_METHOD],
      callback_ctrl: CFuncPtr3[Ptr[BIO], CInt, Ptr[BIO_info_cb], CLongInt]
  ): CInt = extern

  /** */
  def BIO_meth_set_create(
      biom: Ptr[BIO_METHOD],
      create: CFuncPtr1[Ptr[BIO], CInt]
  ): CInt = extern

  /** */
  def BIO_meth_set_ctrl(
      biom: Ptr[BIO_METHOD],
      ctrl: CFuncPtr4[Ptr[BIO], CInt, CLongInt, Ptr[Byte], CLongInt]
  ): CInt = extern

  /** */
  def BIO_meth_set_destroy(
      biom: Ptr[BIO_METHOD],
      destroy: CFuncPtr1[Ptr[BIO], CInt]
  ): CInt = extern

  /** */
  def BIO_meth_set_gets(
      biom: Ptr[BIO_METHOD],
      gets: CFuncPtr3[Ptr[BIO], CString, CInt, CInt]
  ): CInt = extern

  /** */
  def BIO_meth_set_puts(
      biom: Ptr[BIO_METHOD],
      puts: CFuncPtr2[Ptr[BIO], CString, CInt]
  ): CInt = extern

  /** */
  def BIO_meth_set_read(
      biom: Ptr[BIO_METHOD],
      read: CFuncPtr3[Ptr[BIO], CString, CInt, CInt]
  ): CInt = extern

  /** */
  def BIO_meth_set_read_ex(
      biom: Ptr[BIO_METHOD],
      bread: CFuncPtr4[Ptr[BIO], CString, size_t, Ptr[size_t], CInt]
  ): CInt = extern

  /** */
  def BIO_meth_set_write(
      biom: Ptr[BIO_METHOD],
      write: CFuncPtr3[Ptr[BIO], CString, CInt, CInt]
  ): CInt = extern

  /** */
  def BIO_meth_set_write_ex(
      biom: Ptr[BIO_METHOD],
      bwrite: CFuncPtr4[Ptr[BIO], CString, size_t, Ptr[size_t], CInt]
  ): CInt = extern

  /** */
  def BIO_method_name(b: Ptr[BIO]): CString = extern

  /** */
  def BIO_method_type(b: Ptr[BIO]): CInt = extern

  /** */
  def BIO_new(`type`: Ptr[BIO_METHOD]): Ptr[BIO] = extern

  /** */
  def BIO_new_NDEF(
      out: Ptr[BIO],
      `val`: Ptr[ASN1_VALUE],
      it: Ptr[ASN1_ITEM]
  ): Ptr[BIO] = extern

  /** */
  def BIO_new_accept(host_port: CString): Ptr[BIO] = extern

  /** */
  def BIO_new_bio_pair(
      bio1: Ptr[Ptr[BIO]],
      writebuf1: size_t,
      bio2: Ptr[Ptr[BIO]],
      writebuf2: size_t
  ): CInt = extern

  /** */
  def BIO_new_connect(host_port: CString): Ptr[BIO] = extern

  /** */
  def BIO_new_dgram(fd: CInt, close_flag: CInt): Ptr[BIO] = extern

  /** */
  def BIO_new_ex(libctx: Ptr[OSSL_LIB_CTX], method: Ptr[BIO_METHOD]): Ptr[BIO] =
    extern

  /** */
  def BIO_new_fd(fd: CInt, close_flag: CInt): Ptr[BIO] = extern

  /** */
  def BIO_new_file(filename: CString, mode: CString): Ptr[BIO] = extern

  /** */
  def BIO_new_fp(stream: Ptr[FILE], close_flag: CInt): Ptr[BIO] = extern

  /** */
  def BIO_new_from_core_bio(
      libctx: Ptr[OSSL_LIB_CTX],
      corebio: Ptr[OSSL_CORE_BIO]
  ): Ptr[BIO] = extern

  /** */
  def BIO_new_mem_buf(buf: Ptr[Byte], len: CInt): Ptr[BIO] = extern

  /** */
  def BIO_new_socket(sock: CInt, close_flag: CInt): Ptr[BIO] = extern

  /** */
  def BIO_next(b: Ptr[BIO]): Ptr[BIO] = extern

  /** */
  def BIO_nread(bio: Ptr[BIO], buf: Ptr[CString], num: CInt): CInt = extern

  /** */
  def BIO_nread0(bio: Ptr[BIO], buf: Ptr[CString]): CInt = extern

  /** */
  def BIO_number_read(bio: Ptr[BIO]): uint64_t = extern

  /** */
  def BIO_number_written(bio: Ptr[BIO]): uint64_t = extern

  /** */
  def BIO_nwrite(bio: Ptr[BIO], buf: Ptr[CString], num: CInt): CInt = extern

  /** */
  def BIO_nwrite0(bio: Ptr[BIO], buf: Ptr[CString]): CInt = extern

  /** */
  def BIO_parse_hostserv(
      hostserv: CString,
      host: Ptr[CString],
      service: Ptr[CString],
      hostserv_prio: BIO_hostserv_priorities
  ): CInt = extern

  /** */
  def BIO_pop(b: Ptr[BIO]): Ptr[BIO] = extern

  /** */
  def BIO_printf(bio: Ptr[BIO], format: CString, rest: Any*): CInt = extern

  /** */
  def BIO_ptr_ctrl(bp: Ptr[BIO], cmd: CInt, larg: CLongInt): Ptr[Byte] = extern

  /** */
  def BIO_push(b: Ptr[BIO], append: Ptr[BIO]): Ptr[BIO] = extern

  /** */
  def BIO_puts(bp: Ptr[BIO], buf: CString): CInt = extern

  /** */
  def BIO_read(b: Ptr[BIO], data: Ptr[Byte], dlen: CInt): CInt = extern

  /** */
  def BIO_read_ex(
      b: Ptr[BIO],
      data: Ptr[Byte],
      dlen: size_t,
      readbytes: Ptr[size_t]
  ): CInt = extern

  /** */
  def BIO_s_accept(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_s_bio(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_s_connect(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_s_core(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_s_datagram(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_s_fd(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_s_file(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_s_log(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_s_mem(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_s_null(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_s_secmem(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_s_socket(): Ptr[BIO_METHOD] = extern

  /** */
  def BIO_set_callback(b: Ptr[BIO], callback: BIO_callback_fn): Unit = extern

  /** */
  def BIO_set_callback_arg(b: Ptr[BIO], arg: CString): Unit = extern

  /** */
  def BIO_set_callback_ex(b: Ptr[BIO], callback: BIO_callback_fn_ex): Unit =
    extern

  /** */
  def BIO_set_cipher(
      b: Ptr[BIO],
      c: Ptr[EVP_CIPHER],
      k: Ptr[CUnsignedChar],
      i: Ptr[CUnsignedChar],
      enc: CInt
  ): CInt = extern

  /** */
  def BIO_set_data(a: Ptr[BIO], ptr: Ptr[Byte]): Unit = extern

  /** */
  def BIO_set_ex_data(bio: Ptr[BIO], idx: CInt, data: Ptr[Byte]): CInt = extern

  /** */
  def BIO_set_flags(b: Ptr[BIO], flags: CInt): Unit = extern

  /** */
  def BIO_set_init(a: Ptr[BIO], init: CInt): Unit = extern

  /** */
  def BIO_set_next(b: Ptr[BIO], next: Ptr[BIO]): Unit = extern

  /** */
  def BIO_set_retry_reason(bio: Ptr[BIO], reason: CInt): Unit = extern

  /** */
  def BIO_set_shutdown(a: Ptr[BIO], shut: CInt): Unit = extern

  /** */
  def BIO_set_tcp_ndelay(sock: CInt, turn_on: CInt): CInt = extern

  /** */
  def BIO_snprintf(buf: CString, n: size_t, format: CString, rest: Any*): CInt =
    extern

  /** */
  def BIO_sock_error(sock: CInt): CInt = extern

  /** */
  def BIO_sock_info(
      sock: CInt,
      `type`: BIO_sock_info_type,
      info: Ptr[BIO_sock_info_u]
  ): CInt = extern

  /** */
  def BIO_sock_init(): CInt = extern

  /** */
  def BIO_sock_non_fatal_error(error: CInt): CInt = extern

  /** */
  def BIO_sock_should_retry(i: CInt): CInt = extern

  /** */
  def BIO_socket(
      domain: CInt,
      socktype: CInt,
      protocol: CInt,
      options: CInt
  ): CInt = extern

  /** */
  def BIO_socket_ioctl(fd: CInt, `type`: CLongInt, arg: Ptr[Byte]): CInt =
    extern

  /** */
  def BIO_socket_nbio(fd: CInt, mode: CInt): CInt = extern

  /** */
  def BIO_socket_wait(fd: CInt, for_read: CInt, max_time: time_t): CInt = extern

  /** */
  def BIO_test_flags(b: Ptr[BIO], flags: CInt): CInt = extern

  /** */
  def BIO_up_ref(a: Ptr[BIO]): CInt = extern

  /** */
  def BIO_vfree(a: Ptr[BIO]): Unit = extern

  /** */
  def BIO_vprintf(bio: Ptr[BIO], format: CString, args: va_list): CInt = extern

  /** */
  def BIO_vsnprintf(
      buf: CString,
      n: size_t,
      format: CString,
      args: va_list
  ): CInt = extern

  /** */
  def BIO_wait(
      bio: Ptr[BIO],
      max_time: time_t,
      nap_milliseconds: CUnsignedInt
  ): CInt = extern

  /** */
  def BIO_write(b: Ptr[BIO], data: Ptr[Byte], dlen: CInt): CInt = extern

  /** */
  def BIO_write_ex(
      b: Ptr[BIO],
      data: Ptr[Byte],
      dlen: size_t,
      written: Ptr[size_t]
  ): CInt = extern

  /** */
  def BN_BLINDING_convert(
      n: Ptr[BIGNUM],
      b: Ptr[BN_BLINDING],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_BLINDING_convert_ex(
      n: Ptr[BIGNUM],
      r: Ptr[BIGNUM],
      b: Ptr[BN_BLINDING],
      _3: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_BLINDING_create_param(
      b: Ptr[BN_BLINDING],
      e: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX],
      bn_mod_exp: CFuncPtr6[Ptr[BIGNUM], Ptr[BIGNUM], Ptr[BIGNUM], Ptr[
        BIGNUM
      ], Ptr[BN_CTX], Ptr[BN_MONT_CTX], CInt],
      m_ctx: Ptr[BN_MONT_CTX]
  ): Ptr[BN_BLINDING] = extern

  /** */
  def BN_BLINDING_free(b: Ptr[BN_BLINDING]): Unit = extern

  /** */
  def BN_BLINDING_get_flags(_0: Ptr[BN_BLINDING]): CUnsignedLongInt = extern

  /** */
  def BN_BLINDING_invert(
      n: Ptr[BIGNUM],
      b: Ptr[BN_BLINDING],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_BLINDING_invert_ex(
      n: Ptr[BIGNUM],
      r: Ptr[BIGNUM],
      b: Ptr[BN_BLINDING],
      _3: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_BLINDING_is_current_thread(b: Ptr[BN_BLINDING]): CInt = extern

  /** */
  def BN_BLINDING_lock(b: Ptr[BN_BLINDING]): CInt = extern

  /** */
  def BN_BLINDING_new(
      A: Ptr[BIGNUM],
      Ai: Ptr[BIGNUM],
      mod: Ptr[BIGNUM]
  ): Ptr[BN_BLINDING] = extern

  /** */
  def BN_BLINDING_set_current_thread(b: Ptr[BN_BLINDING]): Unit = extern

  /** */
  def BN_BLINDING_set_flags(_0: Ptr[BN_BLINDING], _1: CUnsignedLongInt): Unit =
    extern

  /** */
  def BN_BLINDING_unlock(b: Ptr[BN_BLINDING]): CInt = extern

  /** */
  def BN_BLINDING_update(b: Ptr[BN_BLINDING], ctx: Ptr[BN_CTX]): CInt = extern

  /** */
  def BN_CTX_end(ctx: Ptr[BN_CTX]): Unit = extern

  /** */
  def BN_CTX_free(c: Ptr[BN_CTX]): Unit = extern

  /** */
  def BN_CTX_get(ctx: Ptr[BN_CTX]): Ptr[BIGNUM] = extern

  /** */
  def BN_CTX_new(): Ptr[BN_CTX] = extern

  /** */
  def BN_CTX_new_ex(ctx: Ptr[OSSL_LIB_CTX]): Ptr[BN_CTX] = extern

  /** */
  def BN_CTX_secure_new(): Ptr[BN_CTX] = extern

  /** */
  def BN_CTX_secure_new_ex(ctx: Ptr[OSSL_LIB_CTX]): Ptr[BN_CTX] = extern

  /** */
  def BN_CTX_start(ctx: Ptr[BN_CTX]): Unit = extern

  /** */
  def BN_GENCB_call(cb: Ptr[BN_GENCB], a: CInt, b: CInt): CInt = extern

  /** */
  def BN_GENCB_free(cb: Ptr[BN_GENCB]): Unit = extern

  /** */
  def BN_GENCB_get_arg(cb: Ptr[BN_GENCB]): Ptr[Byte] = extern

  /** */
  def BN_GENCB_new(): Ptr[BN_GENCB] = extern

  /** */
  def BN_GENCB_set(
      gencb: Ptr[BN_GENCB],
      callback: CFuncPtr3[CInt, CInt, Ptr[BN_GENCB], CInt],
      cb_arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def BN_GENCB_set_old(
      gencb: Ptr[BN_GENCB],
      callback: CFuncPtr3[CInt, CInt, Ptr[Byte], Unit],
      cb_arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def BN_GF2m_add(r: Ptr[BIGNUM], a: Ptr[BIGNUM], b: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_GF2m_arr2poly(p: Ptr[CInt], a: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_GF2m_mod(r: Ptr[BIGNUM], a: Ptr[BIGNUM], p: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_GF2m_mod_arr(r: Ptr[BIGNUM], a: Ptr[BIGNUM], p: Ptr[CInt]): CInt =
    extern

  /** */
  def BN_GF2m_mod_div(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_div_arr(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      p: Ptr[CInt],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_exp(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_exp_arr(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      p: Ptr[CInt],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_inv(
      r: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_inv_arr(
      r: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      p: Ptr[CInt],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_mul(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_mul_arr(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      p: Ptr[CInt],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_solve_quad(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_solve_quad_arr(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[CInt],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_sqr(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_sqr_arr(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[CInt],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_sqrt(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_mod_sqrt_arr(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[CInt],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_GF2m_poly2arr(a: Ptr[BIGNUM], p: Ptr[CInt], max: CInt): CInt = extern

  /** */
  def BN_MONT_CTX_copy(
      to: Ptr[BN_MONT_CTX],
      from: Ptr[BN_MONT_CTX]
  ): Ptr[BN_MONT_CTX] = extern

  /** */
  def BN_MONT_CTX_free(mont: Ptr[BN_MONT_CTX]): Unit = extern

  /** */
  def BN_MONT_CTX_new(): Ptr[BN_MONT_CTX] = extern

  /** */
  def BN_MONT_CTX_set(
      mont: Ptr[BN_MONT_CTX],
      mod: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_MONT_CTX_set_locked(
      pmont: Ptr[Ptr[BN_MONT_CTX]],
      lock: Ptr[CRYPTO_RWLOCK],
      mod: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): Ptr[BN_MONT_CTX] = extern

  /** */
  def BN_RECP_CTX_free(recp: Ptr[BN_RECP_CTX]): Unit = extern

  /** */
  def BN_RECP_CTX_new(): Ptr[BN_RECP_CTX] = extern

  /** */
  def BN_RECP_CTX_set(
      recp: Ptr[BN_RECP_CTX],
      rdiv: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_X931_derive_prime_ex(
      p: Ptr[BIGNUM],
      p1: Ptr[BIGNUM],
      p2: Ptr[BIGNUM],
      Xp: Ptr[BIGNUM],
      Xp1: Ptr[BIGNUM],
      Xp2: Ptr[BIGNUM],
      e: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX],
      cb: Ptr[BN_GENCB]
  ): CInt = extern

  /** */
  def BN_X931_generate_Xpq(
      Xp: Ptr[BIGNUM],
      Xq: Ptr[BIGNUM],
      nbits: CInt,
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_X931_generate_prime_ex(
      p: Ptr[BIGNUM],
      p1: Ptr[BIGNUM],
      p2: Ptr[BIGNUM],
      Xp1: Ptr[BIGNUM],
      Xp2: Ptr[BIGNUM],
      Xp: Ptr[BIGNUM],
      e: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX],
      cb: Ptr[BN_GENCB]
  ): CInt = extern

  /** */
  def BN_abs_is_word(a: Ptr[BIGNUM], w: CUnsignedLongInt): CInt = extern

  /** */
  def BN_add(r: Ptr[BIGNUM], a: Ptr[BIGNUM], b: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_add_word(a: Ptr[BIGNUM], w: CUnsignedLongInt): CInt = extern

  /** */
  def BN_are_coprime(a: Ptr[BIGNUM], b: Ptr[BIGNUM], ctx: Ptr[BN_CTX]): CInt =
    extern

  /** */
  def BN_asc2bn(a: Ptr[Ptr[BIGNUM]], str: CString): CInt = extern

  /** */
  def BN_bin2bn(
      s: Ptr[CUnsignedChar],
      len: CInt,
      ret: Ptr[BIGNUM]
  ): Ptr[BIGNUM] = extern

  /** */
  def BN_bn2bin(a: Ptr[BIGNUM], to: Ptr[CUnsignedChar]): CInt = extern

  /** */
  def BN_bn2binpad(a: Ptr[BIGNUM], to: Ptr[CUnsignedChar], tolen: CInt): CInt =
    extern

  /** */
  def BN_bn2dec(a: Ptr[BIGNUM]): CString = extern

  /** */
  def BN_bn2hex(a: Ptr[BIGNUM]): CString = extern

  /** */
  def BN_bn2lebinpad(
      a: Ptr[BIGNUM],
      to: Ptr[CUnsignedChar],
      tolen: CInt
  ): CInt = extern

  /** */
  def BN_bn2mpi(a: Ptr[BIGNUM], to: Ptr[CUnsignedChar]): CInt = extern

  /** */
  def BN_bn2nativepad(
      a: Ptr[BIGNUM],
      to: Ptr[CUnsignedChar],
      tolen: CInt
  ): CInt = extern

  /** */
  def BN_bntest_rand(
      rnd: Ptr[BIGNUM],
      bits: CInt,
      top: CInt,
      bottom: CInt
  ): CInt = extern

  /** */
  def BN_check_prime(
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX],
      cb: Ptr[BN_GENCB]
  ): CInt = extern

  /** */
  def BN_clear(a: Ptr[BIGNUM]): Unit = extern

  /** */
  def BN_clear_bit(a: Ptr[BIGNUM], n: CInt): CInt = extern

  /** */
  def BN_clear_free(a: Ptr[BIGNUM]): Unit = extern

  /** */
  def BN_cmp(a: Ptr[BIGNUM], b: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_consttime_swap(
      swap: CUnsignedLongInt,
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      nwords: CInt
  ): Unit = extern

  /** */
  def BN_copy(a: Ptr[BIGNUM], b: Ptr[BIGNUM]): Ptr[BIGNUM] = extern

  /** */
  def BN_dec2bn(a: Ptr[Ptr[BIGNUM]], str: CString): CInt = extern

  /** */
  def BN_div(
      dv: Ptr[BIGNUM],
      rem: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      d: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_div_recp(
      dv: Ptr[BIGNUM],
      rem: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      recp: Ptr[BN_RECP_CTX],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_div_word(a: Ptr[BIGNUM], w: CUnsignedLongInt): CUnsignedLongInt =
    extern

  /** */
  def BN_dup(a: Ptr[BIGNUM]): Ptr[BIGNUM] = extern

  /** */
  def BN_exp(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_free(a: Ptr[BIGNUM]): Unit = extern

  /** */
  def BN_from_montgomery(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      mont: Ptr[BN_MONT_CTX],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_gcd(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_generate_dsa_nonce(
      out: Ptr[BIGNUM],
      range: Ptr[BIGNUM],
      priv: Ptr[BIGNUM],
      message: Ptr[CUnsignedChar],
      message_len: size_t,
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_generate_prime(
      ret: Ptr[BIGNUM],
      bits: CInt,
      safe: CInt,
      add: Ptr[BIGNUM],
      rem: Ptr[BIGNUM],
      callback: CFuncPtr3[CInt, CInt, Ptr[Byte], Unit],
      cb_arg: Ptr[Byte]
  ): Ptr[BIGNUM] = extern

  /** */
  def BN_generate_prime_ex(
      ret: Ptr[BIGNUM],
      bits: CInt,
      safe: CInt,
      add: Ptr[BIGNUM],
      rem: Ptr[BIGNUM],
      cb: Ptr[BN_GENCB]
  ): CInt = extern

  /** */
  def BN_generate_prime_ex2(
      ret: Ptr[BIGNUM],
      bits: CInt,
      safe: CInt,
      add: Ptr[BIGNUM],
      rem: Ptr[BIGNUM],
      cb: Ptr[BN_GENCB],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_get0_nist_prime_192(): Ptr[BIGNUM] = extern

  /** */
  def BN_get0_nist_prime_224(): Ptr[BIGNUM] = extern

  /** */
  def BN_get0_nist_prime_256(): Ptr[BIGNUM] = extern

  /** */
  def BN_get0_nist_prime_384(): Ptr[BIGNUM] = extern

  /** */
  def BN_get0_nist_prime_521(): Ptr[BIGNUM] = extern

  /** */
  def BN_get_flags(b: Ptr[BIGNUM], n: CInt): CInt = extern

  /** */
  def BN_get_params(which: CInt): CInt = extern

  /** */
  def BN_get_rfc2409_prime_1024(bn: Ptr[BIGNUM]): Ptr[BIGNUM] = extern

  /** */
  def BN_get_rfc2409_prime_768(bn: Ptr[BIGNUM]): Ptr[BIGNUM] = extern

  /** */
  def BN_get_rfc3526_prime_1536(bn: Ptr[BIGNUM]): Ptr[BIGNUM] = extern

  /** */
  def BN_get_rfc3526_prime_2048(bn: Ptr[BIGNUM]): Ptr[BIGNUM] = extern

  /** */
  def BN_get_rfc3526_prime_3072(bn: Ptr[BIGNUM]): Ptr[BIGNUM] = extern

  /** */
  def BN_get_rfc3526_prime_4096(bn: Ptr[BIGNUM]): Ptr[BIGNUM] = extern

  /** */
  def BN_get_rfc3526_prime_6144(bn: Ptr[BIGNUM]): Ptr[BIGNUM] = extern

  /** */
  def BN_get_rfc3526_prime_8192(bn: Ptr[BIGNUM]): Ptr[BIGNUM] = extern

  /** */
  def BN_get_word(a: Ptr[BIGNUM]): CUnsignedLongInt = extern

  /** */
  def BN_hex2bn(a: Ptr[Ptr[BIGNUM]], str: CString): CInt = extern

  /** */
  def BN_is_bit_set(a: Ptr[BIGNUM], n: CInt): CInt = extern

  /** BN_is_negative returns 1 if the BIGNUM is negative
    */
  def BN_is_negative(b: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_is_odd(a: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_is_one(a: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_is_prime(
      p: Ptr[BIGNUM],
      nchecks: CInt,
      callback: CFuncPtr3[CInt, CInt, Ptr[Byte], Unit],
      ctx: Ptr[BN_CTX],
      cb_arg: Ptr[Byte]
  ): CInt = extern

  /** */
  def BN_is_prime_ex(
      p: Ptr[BIGNUM],
      nchecks: CInt,
      ctx: Ptr[BN_CTX],
      cb: Ptr[BN_GENCB]
  ): CInt = extern

  /** */
  def BN_is_prime_fasttest(
      p: Ptr[BIGNUM],
      nchecks: CInt,
      callback: CFuncPtr3[CInt, CInt, Ptr[Byte], Unit],
      ctx: Ptr[BN_CTX],
      cb_arg: Ptr[Byte],
      do_trial_division: CInt
  ): CInt = extern

  /** */
  def BN_is_prime_fasttest_ex(
      p: Ptr[BIGNUM],
      nchecks: CInt,
      ctx: Ptr[BN_CTX],
      do_trial_division: CInt,
      cb: Ptr[BN_GENCB]
  ): CInt = extern

  /** */
  def BN_is_word(a: Ptr[BIGNUM], w: CUnsignedLongInt): CInt = extern

  /** */
  def BN_is_zero(a: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_kronecker(a: Ptr[BIGNUM], b: Ptr[BIGNUM], ctx: Ptr[BN_CTX]): CInt =
    extern

  /** */
  def BN_lebin2bn(
      s: Ptr[CUnsignedChar],
      len: CInt,
      ret: Ptr[BIGNUM]
  ): Ptr[BIGNUM] = extern

  /** */
  def BN_lshift(r: Ptr[BIGNUM], a: Ptr[BIGNUM], n: CInt): CInt = extern

  /** */
  def BN_lshift1(r: Ptr[BIGNUM], a: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_mask_bits(a: Ptr[BIGNUM], n: CInt): CInt = extern

  /** */
  def BN_mod_add(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_add_quick(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      m: Ptr[BIGNUM]
  ): CInt = extern

  /** */
  def BN_mod_exp(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_exp2_mont(
      r: Ptr[BIGNUM],
      a1: Ptr[BIGNUM],
      p1: Ptr[BIGNUM],
      a2: Ptr[BIGNUM],
      p2: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX],
      m_ctx: Ptr[BN_MONT_CTX]
  ): CInt = extern

  /** */
  def BN_mod_exp_mont(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX],
      m_ctx: Ptr[BN_MONT_CTX]
  ): CInt = extern

  /** */
  def BN_mod_exp_mont_consttime(
      rr: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX],
      in_mont: Ptr[BN_MONT_CTX]
  ): CInt = extern

  /** */
  def BN_mod_exp_mont_consttime_x2(
      rr1: Ptr[BIGNUM],
      a1: Ptr[BIGNUM],
      p1: Ptr[BIGNUM],
      m1: Ptr[BIGNUM],
      in_mont1: Ptr[BN_MONT_CTX],
      rr2: Ptr[BIGNUM],
      a2: Ptr[BIGNUM],
      p2: Ptr[BIGNUM],
      m2: Ptr[BIGNUM],
      in_mont2: Ptr[BN_MONT_CTX],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_exp_mont_word(
      r: Ptr[BIGNUM],
      a: CUnsignedLongInt,
      p: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX],
      m_ctx: Ptr[BN_MONT_CTX]
  ): CInt = extern

  /** */
  def BN_mod_exp_recp(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_exp_simple(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_inverse(
      ret: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      n: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): Ptr[BIGNUM] = extern

  /** */
  def BN_mod_lshift(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      n: CInt,
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_lshift1(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_lshift1_quick(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      m: Ptr[BIGNUM]
  ): CInt = extern

  /** */
  def BN_mod_lshift_quick(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      n: CInt,
      m: Ptr[BIGNUM]
  ): CInt = extern

  /** */
  def BN_mod_mul(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_mul_montgomery(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      mont: Ptr[BN_MONT_CTX],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_mul_reciprocal(
      r: Ptr[BIGNUM],
      x: Ptr[BIGNUM],
      y: Ptr[BIGNUM],
      recp: Ptr[BN_RECP_CTX],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_sqr(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_sqrt(
      ret: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      n: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): Ptr[BIGNUM] = extern

  /** */
  def BN_mod_sub(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mod_sub_quick(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      m: Ptr[BIGNUM]
  ): CInt = extern

  /** */
  def BN_mod_word(a: Ptr[BIGNUM], w: CUnsignedLongInt): CUnsignedLongInt =
    extern

  /** */
  def BN_mpi2bn(
      s: Ptr[CUnsignedChar],
      len: CInt,
      ret: Ptr[BIGNUM]
  ): Ptr[BIGNUM] = extern

  /** */
  def BN_mul(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      b: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_mul_word(a: Ptr[BIGNUM], w: CUnsignedLongInt): CInt = extern

  /** */
  def BN_native2bn(
      s: Ptr[CUnsignedChar],
      len: CInt,
      ret: Ptr[BIGNUM]
  ): Ptr[BIGNUM] = extern

  /** */
  def BN_new(): Ptr[BIGNUM] = extern

  /** */
  def BN_nist_mod_192(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_nist_mod_224(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_nist_mod_256(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_nist_mod_384(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_nist_mod_521(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      p: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_nist_mod_func(
      r: Ptr[BIGNUM]
  ): CFuncPtr4[Ptr[BIGNUM], Ptr[BIGNUM], Ptr[BIGNUM], Ptr[BN_CTX], CInt] =
    extern

  /** */
  def BN_nnmod(
      r: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      d: Ptr[BIGNUM],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_num_bits(a: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_num_bits_word(l: CUnsignedLongInt): CInt = extern

  /** */
  def BN_options(): CString = extern

  /** */
  def BN_print(bio: Ptr[BIO], a: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_print_fp(fp: Ptr[FILE], a: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_priv_rand(
      rnd: Ptr[BIGNUM],
      bits: CInt,
      top: CInt,
      bottom: CInt
  ): CInt = extern

  /** */
  def BN_priv_rand_ex(
      rnd: Ptr[BIGNUM],
      bits: CInt,
      top: CInt,
      bottom: CInt,
      strength: CUnsignedInt,
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_priv_rand_range(rnd: Ptr[BIGNUM], range: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_priv_rand_range_ex(
      r: Ptr[BIGNUM],
      range: Ptr[BIGNUM],
      strength: CUnsignedInt,
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_pseudo_rand(
      rnd: Ptr[BIGNUM],
      bits: CInt,
      top: CInt,
      bottom: CInt
  ): CInt = extern

  /** */
  def BN_pseudo_rand_range(rnd: Ptr[BIGNUM], range: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_rand(rnd: Ptr[BIGNUM], bits: CInt, top: CInt, bottom: CInt): CInt =
    extern

  /** */
  def BN_rand_ex(
      rnd: Ptr[BIGNUM],
      bits: CInt,
      top: CInt,
      bottom: CInt,
      strength: CUnsignedInt,
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_rand_range(rnd: Ptr[BIGNUM], range: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_rand_range_ex(
      r: Ptr[BIGNUM],
      range: Ptr[BIGNUM],
      strength: CUnsignedInt,
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_reciprocal(
      r: Ptr[BIGNUM],
      m: Ptr[BIGNUM],
      len: CInt,
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_rshift(r: Ptr[BIGNUM], a: Ptr[BIGNUM], n: CInt): CInt = extern

  /** */
  def BN_rshift1(r: Ptr[BIGNUM], a: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_secure_new(): Ptr[BIGNUM] = extern

  /** */
  def BN_security_bits(L: CInt, N: CInt): CInt = extern

  /** */
  def BN_set_bit(a: Ptr[BIGNUM], n: CInt): CInt = extern

  /** */
  def BN_set_flags(b: Ptr[BIGNUM], n: CInt): Unit = extern

  /** BN_set_negative sets sign of a BIGNUM
    */
  def BN_set_negative(b: Ptr[BIGNUM], n: CInt): Unit = extern

  /** */
  def BN_set_params(mul: CInt, high: CInt, low: CInt, mont: CInt): Unit = extern

  /** */
  def BN_set_word(a: Ptr[BIGNUM], w: CUnsignedLongInt): CInt = extern

  /** */
  def BN_sqr(r: Ptr[BIGNUM], a: Ptr[BIGNUM], ctx: Ptr[BN_CTX]): CInt = extern

  /** */
  def BN_sub(r: Ptr[BIGNUM], a: Ptr[BIGNUM], b: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_sub_word(a: Ptr[BIGNUM], w: CUnsignedLongInt): CInt = extern

  /** */
  def BN_swap(a: Ptr[BIGNUM], b: Ptr[BIGNUM]): Unit = extern

  /** */
  def BN_to_ASN1_ENUMERATED(
      bn: Ptr[BIGNUM],
      ai: Ptr[ASN1_ENUMERATED]
  ): Ptr[ASN1_ENUMERATED] = extern

  /** */
  def BN_to_ASN1_INTEGER(
      bn: Ptr[BIGNUM],
      ai: Ptr[ASN1_INTEGER]
  ): Ptr[ASN1_INTEGER] = extern

  /** */
  def BN_to_montgomery(
      r: Ptr[BIGNUM],
      a: Ptr[BIGNUM],
      mont: Ptr[BN_MONT_CTX],
      ctx: Ptr[BN_CTX]
  ): CInt = extern

  /** */
  def BN_uadd(r: Ptr[BIGNUM], a: Ptr[BIGNUM], b: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_ucmp(a: Ptr[BIGNUM], b: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_usub(r: Ptr[BIGNUM], a: Ptr[BIGNUM], b: Ptr[BIGNUM]): CInt = extern

  /** */
  def BN_value_one(): Ptr[BIGNUM] = extern

  /** */
  def BN_with_flags(dest: Ptr[BIGNUM], b: Ptr[BIGNUM], flags: CInt): Unit =
    extern

  /** */
  def BN_zero_ex(a: Ptr[BIGNUM]): Unit = extern

  /** */
  def CRYPTO_THREAD_cleanup_local(key: Ptr[CRYPTO_THREAD_LOCAL]): CInt = extern

  /** */
  def CRYPTO_THREAD_compare_id(a: CRYPTO_THREAD_ID, b: CRYPTO_THREAD_ID): CInt =
    extern

  /** */
  def CRYPTO_THREAD_get_current_id(): CRYPTO_THREAD_ID = extern

  /** */
  def CRYPTO_THREAD_get_local(key: Ptr[CRYPTO_THREAD_LOCAL]): Ptr[Byte] = extern

  /** */
  def CRYPTO_THREAD_init_local(
      key: Ptr[CRYPTO_THREAD_LOCAL],
      cleanup: CFuncPtr1[Ptr[Byte], Unit]
  ): CInt = extern

  /** */
  def CRYPTO_THREAD_lock_free(lock: Ptr[CRYPTO_RWLOCK]): Unit = extern

  /** */
  def CRYPTO_THREAD_lock_new(): Ptr[CRYPTO_RWLOCK] = extern

  /** */
  def CRYPTO_THREAD_read_lock(lock: Ptr[CRYPTO_RWLOCK]): CInt = extern

  /** */
  def CRYPTO_THREAD_run_once(
      once: Ptr[CRYPTO_ONCE],
      init: CFuncPtr0[Unit]
  ): CInt = extern

  /** */
  def CRYPTO_THREAD_set_local(
      key: Ptr[CRYPTO_THREAD_LOCAL],
      `val`: Ptr[Byte]
  ): CInt = extern

  /** */
  def CRYPTO_THREAD_unlock(lock: Ptr[CRYPTO_RWLOCK]): CInt = extern

  /** */
  def CRYPTO_THREAD_write_lock(lock: Ptr[CRYPTO_RWLOCK]): CInt = extern

  /** */
  def CRYPTO_alloc_ex_data(
      class_index: CInt,
      obj: Ptr[Byte],
      ad: Ptr[CRYPTO_EX_DATA],
      idx: CInt
  ): CInt = extern

  /** */
  def CRYPTO_atomic_add(
      `val`: Ptr[CInt],
      amount: CInt,
      ret: Ptr[CInt],
      lock: Ptr[CRYPTO_RWLOCK]
  ): CInt = extern

  /** */
  def CRYPTO_atomic_load(
      `val`: Ptr[uint64_t],
      ret: Ptr[uint64_t],
      lock: Ptr[CRYPTO_RWLOCK]
  ): CInt = extern

  /** */
  def CRYPTO_atomic_or(
      `val`: Ptr[uint64_t],
      op: uint64_t,
      ret: Ptr[uint64_t],
      lock: Ptr[CRYPTO_RWLOCK]
  ): CInt = extern

  /** */
  def CRYPTO_clear_free(
      ptr: Ptr[Byte],
      num: size_t,
      file: CString,
      line: CInt
  ): Unit = extern

  /** */
  def CRYPTO_clear_realloc(
      addr: Ptr[Byte],
      old_num: size_t,
      num: size_t,
      file: CString,
      line: CInt
  ): Ptr[Byte] = extern

  /** */
  def CRYPTO_dup_ex_data(
      class_index: CInt,
      to: Ptr[CRYPTO_EX_DATA],
      from: Ptr[CRYPTO_EX_DATA]
  ): CInt = extern

  /** */
  def CRYPTO_free(ptr: Ptr[Byte], file: CString, line: CInt): Unit = extern

  /** */
  def CRYPTO_free_ex_data(
      class_index: CInt,
      obj: Ptr[Byte],
      ad: Ptr[CRYPTO_EX_DATA]
  ): Unit = extern

  /** */
  def CRYPTO_free_ex_index(class_index: CInt, idx: CInt): CInt = extern

  /** */
  def CRYPTO_get_ex_data(ad: Ptr[CRYPTO_EX_DATA], idx: CInt): Ptr[Byte] = extern

  /** */
  def CRYPTO_get_ex_new_index(
      class_index: CInt,
      argl: CLongInt,
      argp: Ptr[Byte],
      new_func: Ptr[CRYPTO_EX_new],
      dup_func: Ptr[CRYPTO_EX_dup],
      free_func: Ptr[CRYPTO_EX_free]
  ): CInt = extern

  /** */
  def CRYPTO_get_mem_functions(
      malloc_fn: Ptr[CRYPTO_malloc_fn],
      realloc_fn: Ptr[CRYPTO_realloc_fn],
      free_fn: Ptr[CRYPTO_free_fn]
  ): Unit = extern

  /** */
  def CRYPTO_malloc(num: size_t, file: CString, line: CInt): Ptr[Byte] = extern

  /** */
  def CRYPTO_memcmp(in_a: Ptr[Byte], in_b: Ptr[Byte], len: size_t): CInt =
    extern

  /** */
  def CRYPTO_memdup(
      str: Ptr[Byte],
      siz: size_t,
      file: CString,
      line: CInt
  ): Ptr[Byte] = extern

  /** */
  def CRYPTO_new_ex_data(
      class_index: CInt,
      obj: Ptr[Byte],
      ad: Ptr[CRYPTO_EX_DATA]
  ): CInt = extern

  /** */
  def CRYPTO_realloc(
      addr: Ptr[Byte],
      num: size_t,
      file: CString,
      line: CInt
  ): Ptr[Byte] = extern

  /** */
  def CRYPTO_secure_actual_size(ptr: Ptr[Byte]): size_t = extern

  /** */
  def CRYPTO_secure_allocated(ptr: Ptr[Byte]): CInt = extern

  /** */
  def CRYPTO_secure_clear_free(
      ptr: Ptr[Byte],
      num: size_t,
      file: CString,
      line: CInt
  ): Unit = extern

  /** */
  def CRYPTO_secure_free(ptr: Ptr[Byte], file: CString, line: CInt): Unit =
    extern

  /** */
  def CRYPTO_secure_malloc(num: size_t, file: CString, line: CInt): Ptr[Byte] =
    extern

  /** */
  def CRYPTO_secure_malloc_done(): CInt = extern

  /** */
  def CRYPTO_secure_malloc_init(sz: size_t, minsize: size_t): CInt = extern

  /** */
  def CRYPTO_secure_malloc_initialized(): CInt = extern

  /** */
  def CRYPTO_secure_used(): size_t = extern

  /** */
  def CRYPTO_secure_zalloc(num: size_t, file: CString, line: CInt): Ptr[Byte] =
    extern

  /** */
  def CRYPTO_set_ex_data(
      ad: Ptr[CRYPTO_EX_DATA],
      idx: CInt,
      `val`: Ptr[Byte]
  ): CInt = extern

  /** */
  def CRYPTO_set_mem_functions(
      malloc_fn: CRYPTO_malloc_fn,
      realloc_fn: CRYPTO_realloc_fn,
      free_fn: CRYPTO_free_fn
  ): CInt = extern

  /** */
  def CRYPTO_strdup(str: CString, file: CString, line: CInt): CString = extern

  /** */
  def CRYPTO_strndup(
      str: CString,
      s: size_t,
      file: CString,
      line: CInt
  ): CString = extern

  /** */
  def CRYPTO_zalloc(num: size_t, file: CString, line: CInt): Ptr[Byte] = extern

  /** */
  def DIRECTORYSTRING_free(a: Ptr[ASN1_STRING]): Unit = extern

  /** */
  def DIRECTORYSTRING_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def DIRECTORYSTRING_new(): Ptr[ASN1_STRING] = extern

  /** */
  def DISPLAYTEXT_free(a: Ptr[ASN1_STRING]): Unit = extern

  /** */
  def DISPLAYTEXT_it(): Ptr[ASN1_ITEM] = extern

  /** */
  def DISPLAYTEXT_new(): Ptr[ASN1_STRING] = extern

  /** */
  def ERR_load_ASN1_strings(): CInt = extern

  /** */
  def ERR_load_ASYNC_strings(): CInt = extern

  /** */
  def ERR_load_BIO_strings(): CInt = extern

  /** */
  def ERR_load_BN_strings(): CInt = extern

  /** */
  def ERR_load_BUF_strings(): CInt = extern

  /** */
  def ERR_load_CMS_strings(): CInt = extern

  /** */
  def ERR_load_COMP_strings(): CInt = extern

  /** */
  def ERR_load_CONF_strings(): CInt = extern

  /** */
  def ERR_load_CRYPTO_strings(): CInt = extern

  /** */
  def ERR_load_CT_strings(): CInt = extern

  /** */
  def ERR_load_DH_strings(): CInt = extern

  /** */
  def ERR_load_DSA_strings(): CInt = extern

  /** */
  def ERR_load_EC_strings(): CInt = extern

  /** */
  def ERR_load_ENGINE_strings(): CInt = extern

  /** */
  def ERR_load_ERR_strings(): CInt = extern

  /** */
  def ERR_load_EVP_strings(): CInt = extern

  /** */
  def ERR_load_KDF_strings(): CInt = extern

  /** */
  def ERR_load_OBJ_strings(): CInt = extern

  /** */
  def ERR_load_OCSP_strings(): CInt = extern

  /** */
  def ERR_load_OSSL_STORE_strings(): CInt = extern

  /** */
  def ERR_load_PEM_strings(): CInt = extern

  /** */
  def ERR_load_PKCS12_strings(): CInt = extern

  /** */
  def ERR_load_PKCS7_strings(): CInt = extern

  /** */
  def ERR_load_RAND_strings(): CInt = extern

  /** */
  def ERR_load_RSA_strings(): CInt = extern

  /** */
  def ERR_load_TS_strings(): CInt = extern

  /** */
  def ERR_load_UI_strings(): CInt = extern

  /** */
  def ERR_load_X509V3_strings(): CInt = extern

  /** */
  def ERR_load_X509_strings(): CInt = extern

  /** */
  def EVP_ASYM_CIPHER_do_all_provided(
      libctx: Ptr[OSSL_LIB_CTX],
      fn: CFuncPtr2[Ptr[EVP_ASYM_CIPHER], Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_ASYM_CIPHER_fetch(
      ctx: Ptr[OSSL_LIB_CTX],
      algorithm: CString,
      properties: CString
  ): Ptr[EVP_ASYM_CIPHER] = extern

  /** */
  def EVP_ASYM_CIPHER_free(cipher: Ptr[EVP_ASYM_CIPHER]): Unit = extern

  /** */
  def EVP_ASYM_CIPHER_get0_description(cipher: Ptr[EVP_ASYM_CIPHER]): CString =
    extern

  /** */
  def EVP_ASYM_CIPHER_get0_name(cipher: Ptr[EVP_ASYM_CIPHER]): CString = extern

  /** */
  def EVP_ASYM_CIPHER_get0_provider(
      cipher: Ptr[EVP_ASYM_CIPHER]
  ): Ptr[OSSL_PROVIDER] = extern

  /** */
  def EVP_ASYM_CIPHER_gettable_ctx_params(
      ciph: Ptr[EVP_ASYM_CIPHER]
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_ASYM_CIPHER_is_a(cipher: Ptr[EVP_ASYM_CIPHER], name: CString): CInt =
    extern

  /** */
  def EVP_ASYM_CIPHER_names_do_all(
      cipher: Ptr[EVP_ASYM_CIPHER],
      fn: CFuncPtr2[CString, Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_ASYM_CIPHER_settable_ctx_params(
      ciph: Ptr[EVP_ASYM_CIPHER]
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_ASYM_CIPHER_up_ref(cipher: Ptr[EVP_ASYM_CIPHER]): CInt = extern

  /** */
  def EVP_BytesToKey(
      `type`: Ptr[EVP_CIPHER],
      md: Ptr[EVP_MD],
      salt: Ptr[CUnsignedChar],
      data: Ptr[CUnsignedChar],
      datal: CInt,
      count: CInt,
      key: Ptr[CUnsignedChar],
      iv: Ptr[CUnsignedChar]
  ): CInt = extern

  /** */
  def EVP_CIPHER_CTX_buf_noconst(ctx: Ptr[EVP_CIPHER_CTX]): Ptr[CUnsignedChar] =
    extern

  /** */
  def EVP_CIPHER_CTX_cipher(ctx: Ptr[EVP_CIPHER_CTX]): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_CIPHER_CTX_clear_flags(ctx: Ptr[EVP_CIPHER_CTX], flags: CInt): Unit =
    extern

  /** */
  def EVP_CIPHER_CTX_copy(
      out: Ptr[EVP_CIPHER_CTX],
      in: Ptr[EVP_CIPHER_CTX]
  ): CInt = extern

  /** */
  def EVP_CIPHER_CTX_ctrl(
      ctx: Ptr[EVP_CIPHER_CTX],
      `type`: CInt,
      arg: CInt,
      ptr: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_CIPHER_CTX_dup(in: Ptr[EVP_CIPHER_CTX]): Ptr[EVP_CIPHER_CTX] = extern

  /** */
  def EVP_CIPHER_CTX_free(c: Ptr[EVP_CIPHER_CTX]): Unit = extern

  /** */
  def EVP_CIPHER_CTX_get0_cipher(ctx: Ptr[EVP_CIPHER_CTX]): Ptr[EVP_CIPHER] =
    extern

  /** */
  def EVP_CIPHER_CTX_get1_cipher(ctx: Ptr[EVP_CIPHER_CTX]): Ptr[EVP_CIPHER] =
    extern

  /** */
  def EVP_CIPHER_CTX_get_app_data(ctx: Ptr[EVP_CIPHER_CTX]): Ptr[Byte] = extern

  /** */
  def EVP_CIPHER_CTX_get_block_size(ctx: Ptr[EVP_CIPHER_CTX]): CInt = extern

  /** */
  def EVP_CIPHER_CTX_get_cipher_data(ctx: Ptr[EVP_CIPHER_CTX]): Ptr[Byte] =
    extern

  /** */
  def EVP_CIPHER_CTX_get_iv_length(ctx: Ptr[EVP_CIPHER_CTX]): CInt = extern

  /** */
  def EVP_CIPHER_CTX_get_key_length(ctx: Ptr[EVP_CIPHER_CTX]): CInt = extern

  /** */
  def EVP_CIPHER_CTX_get_nid(ctx: Ptr[EVP_CIPHER_CTX]): CInt = extern

  /** */
  def EVP_CIPHER_CTX_get_num(ctx: Ptr[EVP_CIPHER_CTX]): CInt = extern

  /** */
  def EVP_CIPHER_CTX_get_original_iv(
      ctx: Ptr[EVP_CIPHER_CTX],
      buf: Ptr[Byte],
      len: size_t
  ): CInt = extern

  /** */
  def EVP_CIPHER_CTX_get_params(
      ctx: Ptr[EVP_CIPHER_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_CIPHER_CTX_get_tag_length(ctx: Ptr[EVP_CIPHER_CTX]): CInt = extern

  /** */
  def EVP_CIPHER_CTX_get_updated_iv(
      ctx: Ptr[EVP_CIPHER_CTX],
      buf: Ptr[Byte],
      len: size_t
  ): CInt = extern

  /** */
  def EVP_CIPHER_CTX_gettable_params(
      ctx: Ptr[EVP_CIPHER_CTX]
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_CIPHER_CTX_is_encrypting(ctx: Ptr[EVP_CIPHER_CTX]): CInt = extern

  /** */
  def EVP_CIPHER_CTX_iv(ctx: Ptr[EVP_CIPHER_CTX]): Ptr[CUnsignedChar] = extern

  /** */
  def EVP_CIPHER_CTX_iv_noconst(ctx: Ptr[EVP_CIPHER_CTX]): Ptr[CUnsignedChar] =
    extern

  /** */
  def EVP_CIPHER_CTX_new(): Ptr[EVP_CIPHER_CTX] = extern

  /** */
  def EVP_CIPHER_CTX_original_iv(ctx: Ptr[EVP_CIPHER_CTX]): Ptr[CUnsignedChar] =
    extern

  /** */
  def EVP_CIPHER_CTX_rand_key(
      ctx: Ptr[EVP_CIPHER_CTX],
      key: Ptr[CUnsignedChar]
  ): CInt = extern

  /** */
  def EVP_CIPHER_CTX_reset(c: Ptr[EVP_CIPHER_CTX]): CInt = extern

  /** */
  def EVP_CIPHER_CTX_set_app_data(
      ctx: Ptr[EVP_CIPHER_CTX],
      data: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_CIPHER_CTX_set_cipher_data(
      ctx: Ptr[EVP_CIPHER_CTX],
      cipher_data: Ptr[Byte]
  ): Ptr[Byte] = extern

  /** */
  def EVP_CIPHER_CTX_set_flags(ctx: Ptr[EVP_CIPHER_CTX], flags: CInt): Unit =
    extern

  /** */
  def EVP_CIPHER_CTX_set_key_length(
      x: Ptr[EVP_CIPHER_CTX],
      keylen: CInt
  ): CInt = extern

  /** */
  def EVP_CIPHER_CTX_set_num(ctx: Ptr[EVP_CIPHER_CTX], num: CInt): CInt = extern

  /** */
  def EVP_CIPHER_CTX_set_padding(c: Ptr[EVP_CIPHER_CTX], pad: CInt): CInt =
    extern

  /** */
  def EVP_CIPHER_CTX_set_params(
      ctx: Ptr[EVP_CIPHER_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_CIPHER_CTX_settable_params(
      ctx: Ptr[EVP_CIPHER_CTX]
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_CIPHER_CTX_test_flags(ctx: Ptr[EVP_CIPHER_CTX], flags: CInt): CInt =
    extern

  /** */
  def EVP_CIPHER_asn1_to_param(
      c: Ptr[EVP_CIPHER_CTX],
      `type`: Ptr[ASN1_TYPE]
  ): CInt = extern

  /** */
  def EVP_CIPHER_do_all(
      fn: CFuncPtr4[Ptr[EVP_CIPHER], CString, CString, Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_CIPHER_do_all_provided(
      libctx: Ptr[OSSL_LIB_CTX],
      fn: CFuncPtr2[Ptr[EVP_CIPHER], Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_CIPHER_do_all_sorted(
      fn: CFuncPtr4[Ptr[EVP_CIPHER], CString, CString, Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_CIPHER_fetch(
      ctx: Ptr[OSSL_LIB_CTX],
      algorithm: CString,
      properties: CString
  ): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_CIPHER_free(cipher: Ptr[EVP_CIPHER]): Unit = extern

  /** */
  def EVP_CIPHER_get0_description(cipher: Ptr[EVP_CIPHER]): CString = extern

  /** */
  def EVP_CIPHER_get0_name(cipher: Ptr[EVP_CIPHER]): CString = extern

  /** */
  def EVP_CIPHER_get0_provider(cipher: Ptr[EVP_CIPHER]): Ptr[OSSL_PROVIDER] =
    extern

  /** */
  def EVP_CIPHER_get_asn1_iv(
      c: Ptr[EVP_CIPHER_CTX],
      `type`: Ptr[ASN1_TYPE]
  ): CInt = extern

  /** */
  def EVP_CIPHER_get_block_size(cipher: Ptr[EVP_CIPHER]): CInt = extern

  /** */
  def EVP_CIPHER_get_flags(cipher: Ptr[EVP_CIPHER]): CUnsignedLongInt = extern

  /** */
  def EVP_CIPHER_get_iv_length(cipher: Ptr[EVP_CIPHER]): CInt = extern

  /** */
  def EVP_CIPHER_get_key_length(cipher: Ptr[EVP_CIPHER]): CInt = extern

  /** */
  def EVP_CIPHER_get_mode(cipher: Ptr[EVP_CIPHER]): CInt = extern

  /** */
  def EVP_CIPHER_get_nid(cipher: Ptr[EVP_CIPHER]): CInt = extern

  /** */
  def EVP_CIPHER_get_params(
      cipher: Ptr[EVP_CIPHER],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_CIPHER_get_type(cipher: Ptr[EVP_CIPHER]): CInt = extern

  /** */
  def EVP_CIPHER_gettable_ctx_params(cipher: Ptr[EVP_CIPHER]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_CIPHER_gettable_params(cipher: Ptr[EVP_CIPHER]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_CIPHER_impl_ctx_size(cipher: Ptr[EVP_CIPHER]): CInt = extern

  /** */
  def EVP_CIPHER_is_a(cipher: Ptr[EVP_CIPHER], name: CString): CInt = extern

  /** */
  def EVP_CIPHER_meth_dup(cipher: Ptr[EVP_CIPHER]): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_CIPHER_meth_free(cipher: Ptr[EVP_CIPHER]): Unit = extern

  /** */
  def EVP_CIPHER_meth_get_cleanup(
      _0: Ptr[EVP_CIPHER_CTX]
  ): CFuncPtr1[Ptr[EVP_CIPHER_CTX], CInt] = extern

  /** */
  def EVP_CIPHER_meth_get_ctrl(
      _0: Ptr[EVP_CIPHER_CTX]
  ): CFuncPtr4[Ptr[EVP_CIPHER_CTX], CInt, CInt, Ptr[Byte], CInt] = extern

  /** */
  def EVP_CIPHER_meth_get_do_cipher(ctx: Ptr[EVP_CIPHER_CTX]): CFuncPtr4[Ptr[
    EVP_CIPHER_CTX
  ], Ptr[CUnsignedChar], Ptr[CUnsignedChar], size_t, CInt] = extern

  /** */
  def EVP_CIPHER_meth_get_get_asn1_params(
      _0: Ptr[EVP_CIPHER_CTX]
  ): CFuncPtr2[Ptr[EVP_CIPHER_CTX], Ptr[ASN1_TYPE], CInt] = extern

  /** */
  def EVP_CIPHER_meth_get_init(ctx: Ptr[EVP_CIPHER_CTX]): CFuncPtr4[Ptr[
    EVP_CIPHER_CTX
  ], Ptr[CUnsignedChar], Ptr[CUnsignedChar], CInt, CInt] = extern

  /** */
  def EVP_CIPHER_meth_get_set_asn1_params(
      _0: Ptr[EVP_CIPHER_CTX]
  ): CFuncPtr2[Ptr[EVP_CIPHER_CTX], Ptr[ASN1_TYPE], CInt] = extern

  /** */
  def EVP_CIPHER_meth_new(
      cipher_type: CInt,
      block_size: CInt,
      key_len: CInt
  ): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_CIPHER_meth_set_cleanup(
      cipher: Ptr[EVP_CIPHER],
      cleanup: CFuncPtr1[Ptr[EVP_CIPHER_CTX], CInt]
  ): CInt = extern

  /** */
  def EVP_CIPHER_meth_set_ctrl(
      cipher: Ptr[EVP_CIPHER],
      ctrl: CFuncPtr4[Ptr[EVP_CIPHER_CTX], CInt, CInt, Ptr[Byte], CInt]
  ): CInt = extern

  /** */
  def EVP_CIPHER_meth_set_do_cipher(
      cipher: Ptr[EVP_CIPHER],
      do_cipher: CFuncPtr4[Ptr[EVP_CIPHER_CTX], Ptr[CUnsignedChar], Ptr[
        CUnsignedChar
      ], size_t, CInt]
  ): CInt = extern

  /** */
  def EVP_CIPHER_meth_set_flags(
      cipher: Ptr[EVP_CIPHER],
      flags: CUnsignedLongInt
  ): CInt = extern

  /** */
  def EVP_CIPHER_meth_set_get_asn1_params(
      cipher: Ptr[EVP_CIPHER],
      get_asn1_parameters: CFuncPtr2[Ptr[EVP_CIPHER_CTX], Ptr[ASN1_TYPE], CInt]
  ): CInt = extern

  /** */
  def EVP_CIPHER_meth_set_impl_ctx_size(
      cipher: Ptr[EVP_CIPHER],
      ctx_size: CInt
  ): CInt = extern

  /** */
  def EVP_CIPHER_meth_set_init(
      cipher: Ptr[EVP_CIPHER],
      init: CFuncPtr4[Ptr[EVP_CIPHER_CTX], Ptr[CUnsignedChar], Ptr[
        CUnsignedChar
      ], CInt, CInt]
  ): CInt = extern

  /** */
  def EVP_CIPHER_meth_set_iv_length(
      cipher: Ptr[EVP_CIPHER],
      iv_len: CInt
  ): CInt = extern

  /** */
  def EVP_CIPHER_meth_set_set_asn1_params(
      cipher: Ptr[EVP_CIPHER],
      set_asn1_parameters: CFuncPtr2[Ptr[EVP_CIPHER_CTX], Ptr[ASN1_TYPE], CInt]
  ): CInt = extern

  /** */
  def EVP_CIPHER_names_do_all(
      cipher: Ptr[EVP_CIPHER],
      fn: CFuncPtr2[CString, Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_CIPHER_param_to_asn1(
      c: Ptr[EVP_CIPHER_CTX],
      `type`: Ptr[ASN1_TYPE]
  ): CInt = extern

  /** */
  def EVP_CIPHER_set_asn1_iv(
      c: Ptr[EVP_CIPHER_CTX],
      `type`: Ptr[ASN1_TYPE]
  ): CInt = extern

  /** */
  def EVP_CIPHER_settable_ctx_params(cipher: Ptr[EVP_CIPHER]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_CIPHER_up_ref(cipher: Ptr[EVP_CIPHER]): CInt = extern

  /** */
  def EVP_Cipher(
      c: Ptr[EVP_CIPHER_CTX],
      out: Ptr[CUnsignedChar],
      in: Ptr[CUnsignedChar],
      inl: CUnsignedInt
  ): CInt = extern

  /** */
  def EVP_CipherFinal(
      ctx: Ptr[EVP_CIPHER_CTX],
      outm: Ptr[CUnsignedChar],
      outl: Ptr[CInt]
  ): CInt = extern

  /** */
  def EVP_CipherFinal_ex(
      ctx: Ptr[EVP_CIPHER_CTX],
      outm: Ptr[CUnsignedChar],
      outl: Ptr[CInt]
  ): CInt = extern

  /** */
  def EVP_CipherInit(
      ctx: Ptr[EVP_CIPHER_CTX],
      cipher: Ptr[EVP_CIPHER],
      key: Ptr[CUnsignedChar],
      iv: Ptr[CUnsignedChar],
      enc: CInt
  ): CInt = extern

  /** */
  def EVP_CipherInit_ex(
      ctx: Ptr[EVP_CIPHER_CTX],
      cipher: Ptr[EVP_CIPHER],
      impl: Ptr[ENGINE],
      key: Ptr[CUnsignedChar],
      iv: Ptr[CUnsignedChar],
      enc: CInt
  ): CInt = extern

  /** */
  def EVP_CipherInit_ex2(
      ctx: Ptr[EVP_CIPHER_CTX],
      cipher: Ptr[EVP_CIPHER],
      key: Ptr[CUnsignedChar],
      iv: Ptr[CUnsignedChar],
      enc: CInt,
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_CipherUpdate(
      ctx: Ptr[EVP_CIPHER_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[CInt],
      in: Ptr[CUnsignedChar],
      inl: CInt
  ): CInt = extern

  /** */
  def EVP_DecodeBlock(
      t: Ptr[CUnsignedChar],
      f: Ptr[CUnsignedChar],
      n: CInt
  ): CInt = extern

  /** */
  def EVP_DecodeFinal(
      ctx: Ptr[EVP_ENCODE_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[CInt]
  ): CInt = extern

  /** */
  def EVP_DecodeInit(ctx: Ptr[EVP_ENCODE_CTX]): Unit = extern

  /** */
  def EVP_DecodeUpdate(
      ctx: Ptr[EVP_ENCODE_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[CInt],
      in: Ptr[CUnsignedChar],
      inl: CInt
  ): CInt = extern

  /** */
  def EVP_DecryptFinal(
      ctx: Ptr[EVP_CIPHER_CTX],
      outm: Ptr[CUnsignedChar],
      outl: Ptr[CInt]
  ): CInt = extern

  /** */
  def EVP_DecryptFinal_ex(
      ctx: Ptr[EVP_CIPHER_CTX],
      outm: Ptr[CUnsignedChar],
      outl: Ptr[CInt]
  ): CInt = extern

  /** */
  def EVP_DecryptInit(
      ctx: Ptr[EVP_CIPHER_CTX],
      cipher: Ptr[EVP_CIPHER],
      key: Ptr[CUnsignedChar],
      iv: Ptr[CUnsignedChar]
  ): CInt = extern

  /** */
  def EVP_DecryptInit_ex(
      ctx: Ptr[EVP_CIPHER_CTX],
      cipher: Ptr[EVP_CIPHER],
      impl: Ptr[ENGINE],
      key: Ptr[CUnsignedChar],
      iv: Ptr[CUnsignedChar]
  ): CInt = extern

  /** */
  def EVP_DecryptInit_ex2(
      ctx: Ptr[EVP_CIPHER_CTX],
      cipher: Ptr[EVP_CIPHER],
      key: Ptr[CUnsignedChar],
      iv: Ptr[CUnsignedChar],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_DecryptUpdate(
      ctx: Ptr[EVP_CIPHER_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[CInt],
      in: Ptr[CUnsignedChar],
      inl: CInt
  ): CInt = extern

  /** */
  def EVP_Digest(
      data: Ptr[Byte],
      count: size_t,
      md: Ptr[CUnsignedChar],
      size: Ptr[CUnsignedInt],
      `type`: Ptr[EVP_MD],
      impl: Ptr[ENGINE]
  ): CInt = extern

  /** */
  def EVP_DigestFinal(
      ctx: Ptr[EVP_MD_CTX],
      md: Ptr[CUnsignedChar],
      s: Ptr[CUnsignedInt]
  ): CInt = extern

  /** */
  def EVP_DigestFinalXOF(
      ctx: Ptr[EVP_MD_CTX],
      md: Ptr[CUnsignedChar],
      len: size_t
  ): CInt = extern

  /** */
  def EVP_DigestFinal_ex(
      ctx: Ptr[EVP_MD_CTX],
      md: Ptr[CUnsignedChar],
      s: Ptr[CUnsignedInt]
  ): CInt = extern

  /** */
  def EVP_DigestInit(ctx: Ptr[EVP_MD_CTX], `type`: Ptr[EVP_MD]): CInt = extern

  /** */
  def EVP_DigestInit_ex(
      ctx: Ptr[EVP_MD_CTX],
      `type`: Ptr[EVP_MD],
      impl: Ptr[ENGINE]
  ): CInt = extern

  /** */
  def EVP_DigestInit_ex2(
      ctx: Ptr[EVP_MD_CTX],
      `type`: Ptr[EVP_MD],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_DigestSign(
      ctx: Ptr[EVP_MD_CTX],
      sigret: Ptr[CUnsignedChar],
      siglen: Ptr[size_t],
      tbs: Ptr[CUnsignedChar],
      tbslen: size_t
  ): CInt = extern

  /** */
  def EVP_DigestSignFinal(
      ctx: Ptr[EVP_MD_CTX],
      sigret: Ptr[CUnsignedChar],
      siglen: Ptr[size_t]
  ): CInt = extern

  /** */
  def EVP_DigestSignInit(
      ctx: Ptr[EVP_MD_CTX],
      pctx: Ptr[Ptr[EVP_PKEY_CTX]],
      `type`: Ptr[EVP_MD],
      e: Ptr[ENGINE],
      pkey: Ptr[EVP_PKEY]
  ): CInt = extern

  /** */
  def EVP_DigestSignInit_ex(
      ctx: Ptr[EVP_MD_CTX],
      pctx: Ptr[Ptr[EVP_PKEY_CTX]],
      mdname: CString,
      libctx: Ptr[OSSL_LIB_CTX],
      props: CString,
      pkey: Ptr[EVP_PKEY],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_DigestSignUpdate(
      ctx: Ptr[EVP_MD_CTX],
      data: Ptr[Byte],
      dsize: size_t
  ): CInt = extern

  /** */
  def EVP_DigestUpdate(ctx: Ptr[EVP_MD_CTX], d: Ptr[Byte], cnt: size_t): CInt =
    extern

  /** */
  def EVP_DigestVerify(
      ctx: Ptr[EVP_MD_CTX],
      sigret: Ptr[CUnsignedChar],
      siglen: size_t,
      tbs: Ptr[CUnsignedChar],
      tbslen: size_t
  ): CInt = extern

  /** */
  def EVP_DigestVerifyFinal(
      ctx: Ptr[EVP_MD_CTX],
      sig: Ptr[CUnsignedChar],
      siglen: size_t
  ): CInt = extern

  /** */
  def EVP_DigestVerifyInit(
      ctx: Ptr[EVP_MD_CTX],
      pctx: Ptr[Ptr[EVP_PKEY_CTX]],
      `type`: Ptr[EVP_MD],
      e: Ptr[ENGINE],
      pkey: Ptr[EVP_PKEY]
  ): CInt = extern

  /** */
  def EVP_DigestVerifyInit_ex(
      ctx: Ptr[EVP_MD_CTX],
      pctx: Ptr[Ptr[EVP_PKEY_CTX]],
      mdname: CString,
      libctx: Ptr[OSSL_LIB_CTX],
      props: CString,
      pkey: Ptr[EVP_PKEY],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_DigestVerifyUpdate(
      ctx: Ptr[EVP_MD_CTX],
      data: Ptr[Byte],
      dsize: size_t
  ): CInt = extern

  /** */
  def EVP_ENCODE_CTX_copy(
      dctx: Ptr[EVP_ENCODE_CTX],
      sctx: Ptr[EVP_ENCODE_CTX]
  ): CInt = extern

  /** */
  def EVP_ENCODE_CTX_free(ctx: Ptr[EVP_ENCODE_CTX]): Unit = extern

  /** */
  def EVP_ENCODE_CTX_new(): Ptr[EVP_ENCODE_CTX] = extern

  /** */
  def EVP_ENCODE_CTX_num(ctx: Ptr[EVP_ENCODE_CTX]): CInt = extern

  /** */
  def EVP_EncodeBlock(
      t: Ptr[CUnsignedChar],
      f: Ptr[CUnsignedChar],
      n: CInt
  ): CInt = extern

  /** */
  def EVP_EncodeFinal(
      ctx: Ptr[EVP_ENCODE_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[CInt]
  ): Unit = extern

  /** */
  def EVP_EncodeInit(ctx: Ptr[EVP_ENCODE_CTX]): Unit = extern

  /** */
  def EVP_EncodeUpdate(
      ctx: Ptr[EVP_ENCODE_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[CInt],
      in: Ptr[CUnsignedChar],
      inl: CInt
  ): CInt = extern

  /** */
  def EVP_EncryptFinal(
      ctx: Ptr[EVP_CIPHER_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[CInt]
  ): CInt = extern

  /** */
  def EVP_EncryptFinal_ex(
      ctx: Ptr[EVP_CIPHER_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[CInt]
  ): CInt = extern

  /** */
  def EVP_EncryptInit(
      ctx: Ptr[EVP_CIPHER_CTX],
      cipher: Ptr[EVP_CIPHER],
      key: Ptr[CUnsignedChar],
      iv: Ptr[CUnsignedChar]
  ): CInt = extern

  /** */
  def EVP_EncryptInit_ex(
      ctx: Ptr[EVP_CIPHER_CTX],
      cipher: Ptr[EVP_CIPHER],
      impl: Ptr[ENGINE],
      key: Ptr[CUnsignedChar],
      iv: Ptr[CUnsignedChar]
  ): CInt = extern

  /** */
  def EVP_EncryptInit_ex2(
      ctx: Ptr[EVP_CIPHER_CTX],
      cipher: Ptr[EVP_CIPHER],
      key: Ptr[CUnsignedChar],
      iv: Ptr[CUnsignedChar],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_EncryptUpdate(
      ctx: Ptr[EVP_CIPHER_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[CInt],
      in: Ptr[CUnsignedChar],
      inl: CInt
  ): CInt = extern

  /** */
  def EVP_KEM_do_all_provided(
      libctx: Ptr[OSSL_LIB_CTX],
      fn: CFuncPtr2[Ptr[EVP_KEM], Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_KEM_fetch(
      ctx: Ptr[OSSL_LIB_CTX],
      algorithm: CString,
      properties: CString
  ): Ptr[EVP_KEM] = extern

  /** */
  def EVP_KEM_free(wrap: Ptr[EVP_KEM]): Unit = extern

  /** */
  def EVP_KEM_get0_description(wrap: Ptr[EVP_KEM]): CString = extern

  /** */
  def EVP_KEM_get0_name(wrap: Ptr[EVP_KEM]): CString = extern

  /** */
  def EVP_KEM_get0_provider(wrap: Ptr[EVP_KEM]): Ptr[OSSL_PROVIDER] = extern

  /** */
  def EVP_KEM_gettable_ctx_params(kem: Ptr[EVP_KEM]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_KEM_is_a(wrap: Ptr[EVP_KEM], name: CString): CInt = extern

  /** */
  def EVP_KEM_names_do_all(
      wrap: Ptr[EVP_KEM],
      fn: CFuncPtr2[CString, Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_KEM_settable_ctx_params(kem: Ptr[EVP_KEM]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_KEM_up_ref(wrap: Ptr[EVP_KEM]): CInt = extern

  /** */
  def EVP_KEYEXCH_do_all_provided(
      libctx: Ptr[OSSL_LIB_CTX],
      fn: CFuncPtr2[Ptr[EVP_KEYEXCH], Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_KEYEXCH_fetch(
      ctx: Ptr[OSSL_LIB_CTX],
      algorithm: CString,
      properties: CString
  ): Ptr[EVP_KEYEXCH] = extern

  /** */
  def EVP_KEYEXCH_free(exchange: Ptr[EVP_KEYEXCH]): Unit = extern

  /** */
  def EVP_KEYEXCH_get0_description(keyexch: Ptr[EVP_KEYEXCH]): CString = extern

  /** */
  def EVP_KEYEXCH_get0_name(keyexch: Ptr[EVP_KEYEXCH]): CString = extern

  /** */
  def EVP_KEYEXCH_get0_provider(
      exchange: Ptr[EVP_KEYEXCH]
  ): Ptr[OSSL_PROVIDER] = extern

  /** */
  def EVP_KEYEXCH_gettable_ctx_params(
      keyexch: Ptr[EVP_KEYEXCH]
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_KEYEXCH_is_a(keyexch: Ptr[EVP_KEYEXCH], name: CString): CInt = extern

  /** */
  def EVP_KEYEXCH_names_do_all(
      keyexch: Ptr[EVP_KEYEXCH],
      fn: CFuncPtr2[CString, Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_KEYEXCH_settable_ctx_params(
      keyexch: Ptr[EVP_KEYEXCH]
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_KEYEXCH_up_ref(exchange: Ptr[EVP_KEYEXCH]): CInt = extern

  /** */
  def EVP_KEYMGMT_do_all_provided(
      libctx: Ptr[OSSL_LIB_CTX],
      fn: CFuncPtr2[Ptr[EVP_KEYMGMT], Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_KEYMGMT_fetch(
      ctx: Ptr[OSSL_LIB_CTX],
      algorithm: CString,
      properties: CString
  ): Ptr[EVP_KEYMGMT] = extern

  /** */
  def EVP_KEYMGMT_free(keymgmt: Ptr[EVP_KEYMGMT]): Unit = extern

  /** */
  def EVP_KEYMGMT_gen_settable_params(
      keymgmt: Ptr[EVP_KEYMGMT]
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_KEYMGMT_get0_description(keymgmt: Ptr[EVP_KEYMGMT]): CString = extern

  /** */
  def EVP_KEYMGMT_get0_name(keymgmt: Ptr[EVP_KEYMGMT]): CString = extern

  /** */
  def EVP_KEYMGMT_get0_provider(keymgmt: Ptr[EVP_KEYMGMT]): Ptr[OSSL_PROVIDER] =
    extern

  /** */
  def EVP_KEYMGMT_gettable_params(keymgmt: Ptr[EVP_KEYMGMT]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_KEYMGMT_is_a(keymgmt: Ptr[EVP_KEYMGMT], name: CString): CInt = extern

  /** */
  def EVP_KEYMGMT_names_do_all(
      keymgmt: Ptr[EVP_KEYMGMT],
      fn: CFuncPtr2[CString, Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_KEYMGMT_settable_params(keymgmt: Ptr[EVP_KEYMGMT]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_KEYMGMT_up_ref(keymgmt: Ptr[EVP_KEYMGMT]): CInt = extern

  /** */
  def EVP_MAC_CTX_dup(src: Ptr[EVP_MAC_CTX]): Ptr[EVP_MAC_CTX] = extern

  /** */
  def EVP_MAC_CTX_free(ctx: Ptr[EVP_MAC_CTX]): Unit = extern

  /** */
  def EVP_MAC_CTX_get0_mac(ctx: Ptr[EVP_MAC_CTX]): Ptr[EVP_MAC] = extern

  /** */
  def EVP_MAC_CTX_get_block_size(ctx: Ptr[EVP_MAC_CTX]): size_t = extern

  /** */
  def EVP_MAC_CTX_get_mac_size(ctx: Ptr[EVP_MAC_CTX]): size_t = extern

  /** */
  def EVP_MAC_CTX_get_params(
      ctx: Ptr[EVP_MAC_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_MAC_CTX_gettable_params(ctx: Ptr[EVP_MAC_CTX]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_MAC_CTX_new(mac: Ptr[EVP_MAC]): Ptr[EVP_MAC_CTX] = extern

  /** */
  def EVP_MAC_CTX_set_params(
      ctx: Ptr[EVP_MAC_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_MAC_CTX_settable_params(ctx: Ptr[EVP_MAC_CTX]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_MAC_do_all_provided(
      libctx: Ptr[OSSL_LIB_CTX],
      fn: CFuncPtr2[Ptr[EVP_MAC], Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_MAC_fetch(
      libctx: Ptr[OSSL_LIB_CTX],
      algorithm: CString,
      properties: CString
  ): Ptr[EVP_MAC] = extern

  /** */
  def EVP_MAC_final(
      ctx: Ptr[EVP_MAC_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[size_t],
      outsize: size_t
  ): CInt = extern

  /** */
  def EVP_MAC_finalXOF(
      ctx: Ptr[EVP_MAC_CTX],
      out: Ptr[CUnsignedChar],
      outsize: size_t
  ): CInt = extern

  /** */
  def EVP_MAC_free(mac: Ptr[EVP_MAC]): Unit = extern

  /** */
  def EVP_MAC_get0_description(mac: Ptr[EVP_MAC]): CString = extern

  /** */
  def EVP_MAC_get0_name(mac: Ptr[EVP_MAC]): CString = extern

  /** */
  def EVP_MAC_get0_provider(mac: Ptr[EVP_MAC]): Ptr[OSSL_PROVIDER] = extern

  /** */
  def EVP_MAC_get_params(mac: Ptr[EVP_MAC], params: Ptr[OSSL_PARAM]): CInt =
    extern

  /** */
  def EVP_MAC_gettable_ctx_params(mac: Ptr[EVP_MAC]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_MAC_gettable_params(mac: Ptr[EVP_MAC]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_MAC_init(
      ctx: Ptr[EVP_MAC_CTX],
      key: Ptr[CUnsignedChar],
      keylen: size_t,
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_MAC_is_a(mac: Ptr[EVP_MAC], name: CString): CInt = extern

  /** */
  def EVP_MAC_names_do_all(
      mac: Ptr[EVP_MAC],
      fn: CFuncPtr2[CString, Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_MAC_settable_ctx_params(mac: Ptr[EVP_MAC]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_MAC_up_ref(mac: Ptr[EVP_MAC]): CInt = extern

  /** */
  def EVP_MAC_update(
      ctx: Ptr[EVP_MAC_CTX],
      data: Ptr[CUnsignedChar],
      datalen: size_t
  ): CInt = extern

  /** */
  def EVP_MD_CTX_clear_flags(ctx: Ptr[EVP_MD_CTX], flags: CInt): Unit = extern

  /** */
  def EVP_MD_CTX_copy(out: Ptr[EVP_MD_CTX], in: Ptr[EVP_MD_CTX]): CInt = extern

  /** */
  def EVP_MD_CTX_copy_ex(out: Ptr[EVP_MD_CTX], in: Ptr[EVP_MD_CTX]): CInt =
    extern

  /** */
  def EVP_MD_CTX_ctrl(
      ctx: Ptr[EVP_MD_CTX],
      cmd: CInt,
      p1: CInt,
      p2: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_MD_CTX_dup(in: Ptr[EVP_MD_CTX]): Ptr[EVP_MD_CTX] = extern

  /** */
  def EVP_MD_CTX_free(ctx: Ptr[EVP_MD_CTX]): Unit = extern

  /** */
  def EVP_MD_CTX_get0_md(ctx: Ptr[EVP_MD_CTX]): Ptr[EVP_MD] = extern

  /** */
  def EVP_MD_CTX_get0_md_data(ctx: Ptr[EVP_MD_CTX]): Ptr[Byte] = extern

  /** */
  def EVP_MD_CTX_get1_md(ctx: Ptr[EVP_MD_CTX]): Ptr[EVP_MD] = extern

  /** */
  def EVP_MD_CTX_get_params(
      ctx: Ptr[EVP_MD_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_MD_CTX_get_pkey_ctx(ctx: Ptr[EVP_MD_CTX]): Ptr[EVP_PKEY_CTX] = extern

  /** */
  def EVP_MD_CTX_gettable_params(ctx: Ptr[EVP_MD_CTX]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_MD_CTX_md(ctx: Ptr[EVP_MD_CTX]): Ptr[EVP_MD] = extern

  /** */
  def EVP_MD_CTX_new(): Ptr[EVP_MD_CTX] = extern

  /** */
  def EVP_MD_CTX_reset(ctx: Ptr[EVP_MD_CTX]): CInt = extern

  /** */
  def EVP_MD_CTX_set_flags(ctx: Ptr[EVP_MD_CTX], flags: CInt): Unit = extern

  /** */
  def EVP_MD_CTX_set_params(
      ctx: Ptr[EVP_MD_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_MD_CTX_set_pkey_ctx(
      ctx: Ptr[EVP_MD_CTX],
      pctx: Ptr[EVP_PKEY_CTX]
  ): Unit = extern

  /** */
  def EVP_MD_CTX_set_update_fn(
      ctx: Ptr[EVP_MD_CTX],
      update: CFuncPtr3[Ptr[EVP_MD_CTX], Ptr[Byte], size_t, CInt]
  ): Unit = extern

  /** */
  def EVP_MD_CTX_settable_params(ctx: Ptr[EVP_MD_CTX]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_MD_CTX_test_flags(ctx: Ptr[EVP_MD_CTX], flags: CInt): CInt = extern

  /** */
  def EVP_MD_CTX_update_fn(
      ctx: Ptr[EVP_MD_CTX]
  ): CFuncPtr3[Ptr[EVP_MD_CTX], Ptr[Byte], size_t, CInt] = extern

  /** */
  def EVP_MD_do_all(
      fn: CFuncPtr4[Ptr[EVP_MD], CString, CString, Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_MD_do_all_provided(
      libctx: Ptr[OSSL_LIB_CTX],
      fn: CFuncPtr2[Ptr[EVP_MD], Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_MD_do_all_sorted(
      fn: CFuncPtr4[Ptr[EVP_MD], CString, CString, Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_MD_fetch(
      ctx: Ptr[OSSL_LIB_CTX],
      algorithm: CString,
      properties: CString
  ): Ptr[EVP_MD] = extern

  /** */
  def EVP_MD_free(md: Ptr[EVP_MD]): Unit = extern

  /** */
  def EVP_MD_get0_description(md: Ptr[EVP_MD]): CString = extern

  /** */
  def EVP_MD_get0_name(md: Ptr[EVP_MD]): CString = extern

  /** */
  def EVP_MD_get0_provider(md: Ptr[EVP_MD]): Ptr[OSSL_PROVIDER] = extern

  /** */
  def EVP_MD_get_block_size(md: Ptr[EVP_MD]): CInt = extern

  /** */
  def EVP_MD_get_flags(md: Ptr[EVP_MD]): CUnsignedLongInt = extern

  /** */
  def EVP_MD_get_params(digest: Ptr[EVP_MD], params: Ptr[OSSL_PARAM]): CInt =
    extern

  /** */
  def EVP_MD_get_pkey_type(md: Ptr[EVP_MD]): CInt = extern

  /** */
  def EVP_MD_get_size(md: Ptr[EVP_MD]): CInt = extern

  /** */
  def EVP_MD_get_type(md: Ptr[EVP_MD]): CInt = extern

  /** */
  def EVP_MD_gettable_ctx_params(md: Ptr[EVP_MD]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_MD_gettable_params(digest: Ptr[EVP_MD]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_MD_is_a(md: Ptr[EVP_MD], name: CString): CInt = extern

  /** */
  def EVP_MD_meth_dup(md: Ptr[EVP_MD]): Ptr[EVP_MD] = extern

  /** */
  def EVP_MD_meth_free(md: Ptr[EVP_MD]): Unit = extern

  /** */
  def EVP_MD_meth_get_app_datasize(md: Ptr[EVP_MD]): CInt = extern

  /** */
  def EVP_MD_meth_get_cleanup(
      ctx: Ptr[EVP_MD_CTX]
  ): CFuncPtr1[Ptr[EVP_MD_CTX], CInt] = extern

  /** */
  def EVP_MD_meth_get_copy(
      to: Ptr[EVP_MD_CTX]
  ): CFuncPtr2[Ptr[EVP_MD_CTX], Ptr[EVP_MD_CTX], CInt] = extern

  /** */
  def EVP_MD_meth_get_ctrl(
      ctx: Ptr[EVP_MD_CTX]
  ): CFuncPtr4[Ptr[EVP_MD_CTX], CInt, CInt, Ptr[Byte], CInt] = extern

  /** */
  def EVP_MD_meth_get_final(
      ctx: Ptr[EVP_MD_CTX]
  ): CFuncPtr2[Ptr[EVP_MD_CTX], Ptr[CUnsignedChar], CInt] = extern

  /** */
  def EVP_MD_meth_get_flags(md: Ptr[EVP_MD]): CUnsignedLongInt = extern

  /** */
  def EVP_MD_meth_get_init(
      ctx: Ptr[EVP_MD_CTX]
  ): CFuncPtr1[Ptr[EVP_MD_CTX], CInt] = extern

  /** */
  def EVP_MD_meth_get_input_blocksize(md: Ptr[EVP_MD]): CInt = extern

  /** */
  def EVP_MD_meth_get_result_size(md: Ptr[EVP_MD]): CInt = extern

  /** */
  def EVP_MD_meth_get_update(
      ctx: Ptr[EVP_MD_CTX]
  ): CFuncPtr3[Ptr[EVP_MD_CTX], Ptr[Byte], size_t, CInt] = extern

  /** */
  def EVP_MD_meth_new(md_type: CInt, pkey_type: CInt): Ptr[EVP_MD] = extern

  /** */
  def EVP_MD_meth_set_app_datasize(md: Ptr[EVP_MD], datasize: CInt): CInt =
    extern

  /** */
  def EVP_MD_meth_set_cleanup(
      md: Ptr[EVP_MD],
      cleanup: CFuncPtr1[Ptr[EVP_MD_CTX], CInt]
  ): CInt = extern

  /** */
  def EVP_MD_meth_set_copy(
      md: Ptr[EVP_MD],
      copy: CFuncPtr2[Ptr[EVP_MD_CTX], Ptr[EVP_MD_CTX], CInt]
  ): CInt = extern

  /** */
  def EVP_MD_meth_set_ctrl(
      md: Ptr[EVP_MD],
      ctrl: CFuncPtr4[Ptr[EVP_MD_CTX], CInt, CInt, Ptr[Byte], CInt]
  ): CInt = extern

  /** */
  def EVP_MD_meth_set_final(
      md: Ptr[EVP_MD],
      `final`: CFuncPtr2[Ptr[EVP_MD_CTX], Ptr[CUnsignedChar], CInt]
  ): CInt = extern

  /** */
  def EVP_MD_meth_set_flags(md: Ptr[EVP_MD], flags: CUnsignedLongInt): CInt =
    extern

  /** */
  def EVP_MD_meth_set_init(
      md: Ptr[EVP_MD],
      init: CFuncPtr1[Ptr[EVP_MD_CTX], CInt]
  ): CInt = extern

  /** */
  def EVP_MD_meth_set_input_blocksize(md: Ptr[EVP_MD], blocksize: CInt): CInt =
    extern

  /** */
  def EVP_MD_meth_set_result_size(md: Ptr[EVP_MD], resultsize: CInt): CInt =
    extern

  /** */
  def EVP_MD_meth_set_update(
      md: Ptr[EVP_MD],
      update: CFuncPtr3[Ptr[EVP_MD_CTX], Ptr[Byte], size_t, CInt]
  ): CInt = extern

  /** */
  def EVP_MD_names_do_all(
      md: Ptr[EVP_MD],
      fn: CFuncPtr2[CString, Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_MD_settable_ctx_params(md: Ptr[EVP_MD]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_MD_up_ref(md: Ptr[EVP_MD]): CInt = extern

  /** */
  def EVP_OpenFinal(
      ctx: Ptr[EVP_CIPHER_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[CInt]
  ): CInt = extern

  /** */
  def EVP_OpenInit(
      ctx: Ptr[EVP_CIPHER_CTX],
      `type`: Ptr[EVP_CIPHER],
      ek: Ptr[CUnsignedChar],
      ekl: CInt,
      iv: Ptr[CUnsignedChar],
      priv: Ptr[EVP_PKEY]
  ): CInt = extern

  /** */
  def EVP_PBE_CipherInit(
      pbe_obj: Ptr[ASN1_OBJECT],
      pass: CString,
      passlen: CInt,
      param: Ptr[ASN1_TYPE],
      ctx: Ptr[EVP_CIPHER_CTX],
      en_de: CInt
  ): CInt = extern

  /** */
  def EVP_PBE_CipherInit_ex(
      pbe_obj: Ptr[ASN1_OBJECT],
      pass: CString,
      passlen: CInt,
      param: Ptr[ASN1_TYPE],
      ctx: Ptr[EVP_CIPHER_CTX],
      en_de: CInt,
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): CInt = extern

  /** */
  def EVP_PBE_alg_add(
      nid: CInt,
      cipher: Ptr[EVP_CIPHER],
      md: Ptr[EVP_MD],
      keygen: Ptr[EVP_PBE_KEYGEN]
  ): CInt = extern

  /** */
  def EVP_PBE_alg_add_type(
      pbe_type: CInt,
      pbe_nid: CInt,
      cipher_nid: CInt,
      md_nid: CInt,
      keygen: Ptr[EVP_PBE_KEYGEN]
  ): CInt = extern

  /** */
  def EVP_PBE_cleanup(): Unit = extern

  /** */
  def EVP_PBE_find(
      `type`: CInt,
      pbe_nid: CInt,
      pcnid: Ptr[CInt],
      pmnid: Ptr[CInt],
      pkeygen: Ptr[Ptr[EVP_PBE_KEYGEN]]
  ): CInt = extern

  /** */
  def EVP_PBE_find_ex(
      `type`: CInt,
      pbe_nid: CInt,
      pcnid: Ptr[CInt],
      pmnid: Ptr[CInt],
      pkeygen: Ptr[Ptr[EVP_PBE_KEYGEN]],
      pkeygen_ex: Ptr[Ptr[EVP_PBE_KEYGEN_EX]]
  ): CInt = extern

  /** */
  def EVP_PBE_get(ptype: Ptr[CInt], ppbe_nid: Ptr[CInt], num: size_t): CInt =
    extern

  /** */
  def EVP_PBE_scrypt(
      pass: CString,
      passlen: size_t,
      salt: Ptr[CUnsignedChar],
      saltlen: size_t,
      N: uint64_t,
      r: uint64_t,
      p: uint64_t,
      maxmem: uint64_t,
      key: Ptr[CUnsignedChar],
      keylen: size_t
  ): CInt = extern

  /** */
  def EVP_PBE_scrypt_ex(
      pass: CString,
      passlen: size_t,
      salt: Ptr[CUnsignedChar],
      saltlen: size_t,
      N: uint64_t,
      r: uint64_t,
      p: uint64_t,
      maxmem: uint64_t,
      key: Ptr[CUnsignedChar],
      keylen: size_t,
      ctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_ctrl(
      ctx: Ptr[EVP_PKEY_CTX],
      keytype: CInt,
      optype: CInt,
      cmd: CInt,
      p1: CInt,
      p2: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_ctrl_str(
      ctx: Ptr[EVP_PKEY_CTX],
      `type`: CString,
      value: CString
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_ctrl_uint64(
      ctx: Ptr[EVP_PKEY_CTX],
      keytype: CInt,
      optype: CInt,
      cmd: CInt,
      value: uint64_t
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_dup(ctx: Ptr[EVP_PKEY_CTX]): Ptr[EVP_PKEY_CTX] = extern

  /** */
  def EVP_PKEY_CTX_free(ctx: Ptr[EVP_PKEY_CTX]): Unit = extern

  /** */
  def EVP_PKEY_CTX_get0_libctx(ctx: Ptr[EVP_PKEY_CTX]): Ptr[OSSL_LIB_CTX] =
    extern

  /** */
  def EVP_PKEY_CTX_get0_peerkey(ctx: Ptr[EVP_PKEY_CTX]): Ptr[EVP_PKEY] = extern

  /** */
  def EVP_PKEY_CTX_get0_pkey(ctx: Ptr[EVP_PKEY_CTX]): Ptr[EVP_PKEY] = extern

  /** */
  def EVP_PKEY_CTX_get0_propq(ctx: Ptr[EVP_PKEY_CTX]): CString = extern

  /** */
  def EVP_PKEY_CTX_get0_provider(ctx: Ptr[EVP_PKEY_CTX]): Ptr[OSSL_PROVIDER] =
    extern

  /** */
  def EVP_PKEY_CTX_get1_id(ctx: Ptr[EVP_PKEY_CTX], id: Ptr[Byte]): CInt = extern

  /** */
  def EVP_PKEY_CTX_get1_id_len(
      ctx: Ptr[EVP_PKEY_CTX],
      id_len: Ptr[size_t]
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_get_app_data(ctx: Ptr[EVP_PKEY_CTX]): Ptr[Byte] = extern

  /** */
  def EVP_PKEY_CTX_get_cb(ctx: Ptr[EVP_PKEY_CTX]): Ptr[EVP_PKEY_gen_cb] = extern

  /** */
  def EVP_PKEY_CTX_get_data(ctx: Ptr[EVP_PKEY_CTX]): Ptr[Byte] = extern

  /** */
  def EVP_PKEY_CTX_get_group_name(
      ctx: Ptr[EVP_PKEY_CTX],
      name: CString,
      namelen: size_t
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_get_keygen_info(ctx: Ptr[EVP_PKEY_CTX], idx: CInt): CInt =
    extern

  /** */
  def EVP_PKEY_CTX_get_operation(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_CTX_get_params(
      ctx: Ptr[EVP_PKEY_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_get_signature_md(
      ctx: Ptr[EVP_PKEY_CTX],
      md: Ptr[Ptr[EVP_MD]]
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_gettable_params(ctx: Ptr[EVP_PKEY_CTX]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_PKEY_CTX_hex2ctrl(
      ctx: Ptr[EVP_PKEY_CTX],
      cmd: CInt,
      hex: CString
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_is_a(ctx: Ptr[EVP_PKEY_CTX], keytype: CString): CInt = extern

  /** */
  def EVP_PKEY_CTX_md(
      ctx: Ptr[EVP_PKEY_CTX],
      optype: CInt,
      cmd: CInt,
      md: CString
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_new(pkey: Ptr[EVP_PKEY], e: Ptr[ENGINE]): Ptr[EVP_PKEY_CTX] =
    extern

  /** */
  def EVP_PKEY_CTX_new_from_name(
      libctx: Ptr[OSSL_LIB_CTX],
      name: CString,
      propquery: CString
  ): Ptr[EVP_PKEY_CTX] = extern

  /** */
  def EVP_PKEY_CTX_new_from_pkey(
      libctx: Ptr[OSSL_LIB_CTX],
      pkey: Ptr[EVP_PKEY],
      propquery: CString
  ): Ptr[EVP_PKEY_CTX] = extern

  /** */
  def EVP_PKEY_CTX_new_id(id: CInt, e: Ptr[ENGINE]): Ptr[EVP_PKEY_CTX] = extern

  /** */
  def EVP_PKEY_CTX_set0_keygen_info(
      ctx: Ptr[EVP_PKEY_CTX],
      dat: Ptr[CInt],
      datlen: CInt
  ): Unit = extern

  /** */
  def EVP_PKEY_CTX_set1_id(
      ctx: Ptr[EVP_PKEY_CTX],
      id: Ptr[Byte],
      len: CInt
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_set_app_data(ctx: Ptr[EVP_PKEY_CTX], data: Ptr[Byte]): Unit =
    extern

  /** */
  def EVP_PKEY_CTX_set_cb(
      ctx: Ptr[EVP_PKEY_CTX],
      cb: Ptr[EVP_PKEY_gen_cb]
  ): Unit = extern

  /** */
  def EVP_PKEY_CTX_set_data(ctx: Ptr[EVP_PKEY_CTX], data: Ptr[Byte]): Unit =
    extern

  /** */
  def EVP_PKEY_CTX_set_group_name(ctx: Ptr[EVP_PKEY_CTX], name: CString): CInt =
    extern

  /** */
  def EVP_PKEY_CTX_set_kem_op(ctx: Ptr[EVP_PKEY_CTX], op: CString): CInt =
    extern

  /** */
  def EVP_PKEY_CTX_set_mac_key(
      ctx: Ptr[EVP_PKEY_CTX],
      key: Ptr[CUnsignedChar],
      keylen: CInt
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_set_params(
      ctx: Ptr[EVP_PKEY_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_set_signature_md(
      ctx: Ptr[EVP_PKEY_CTX],
      md: Ptr[EVP_MD]
  ): CInt = extern

  /** */
  def EVP_PKEY_CTX_settable_params(ctx: Ptr[EVP_PKEY_CTX]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_PKEY_CTX_str2ctrl(
      ctx: Ptr[EVP_PKEY_CTX],
      cmd: CInt,
      str: CString
  ): CInt = extern

  /** */
  def EVP_PKEY_Q_keygen(
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString,
      `type`: CString,
      rest: Any*
  ): Ptr[EVP_PKEY] = extern

  /** */
  def EVP_PKEY_asn1_add0(ameth: Ptr[EVP_PKEY_ASN1_METHOD]): CInt = extern

  /** */
  def EVP_PKEY_asn1_add_alias(to: CInt, from: CInt): CInt = extern

  /** */
  def EVP_PKEY_asn1_copy(
      dst: Ptr[EVP_PKEY_ASN1_METHOD],
      src: Ptr[EVP_PKEY_ASN1_METHOD]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_find(
      pe: Ptr[Ptr[ENGINE]],
      `type`: CInt
  ): Ptr[EVP_PKEY_ASN1_METHOD] = extern

  /** */
  def EVP_PKEY_asn1_find_str(
      pe: Ptr[Ptr[ENGINE]],
      str: CString,
      len: CInt
  ): Ptr[EVP_PKEY_ASN1_METHOD] = extern

  /** */
  def EVP_PKEY_asn1_free(ameth: Ptr[EVP_PKEY_ASN1_METHOD]): Unit = extern

  /** */
  def EVP_PKEY_asn1_get0(idx: CInt): Ptr[EVP_PKEY_ASN1_METHOD] = extern

  /** */
  def EVP_PKEY_asn1_get0_info(
      ppkey_id: Ptr[CInt],
      pkey_base_id: Ptr[CInt],
      ppkey_flags: Ptr[CInt],
      pinfo: Ptr[CString],
      ppem_str: Ptr[CString],
      ameth: Ptr[EVP_PKEY_ASN1_METHOD]
  ): CInt = extern

  /** */
  def EVP_PKEY_asn1_get_count(): CInt = extern

  /** */
  def EVP_PKEY_asn1_new(
      id: CInt,
      flags: CInt,
      pem_str: CString,
      info: CString
  ): Ptr[EVP_PKEY_ASN1_METHOD] = extern

  /** */
  def EVP_PKEY_asn1_set_check(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      pkey_check: CFuncPtr1[Ptr[EVP_PKEY], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_ctrl(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      pkey_ctrl: CFuncPtr4[Ptr[EVP_PKEY], CInt, CLongInt, Ptr[Byte], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_free(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      pkey_free: CFuncPtr1[Ptr[EVP_PKEY], Unit]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_get_priv_key(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      get_priv_key: CFuncPtr3[Ptr[EVP_PKEY], Ptr[CUnsignedChar], Ptr[
        size_t
      ], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_get_pub_key(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      get_pub_key: CFuncPtr3[Ptr[EVP_PKEY], Ptr[CUnsignedChar], Ptr[
        size_t
      ], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_item(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      item_verify: CFuncPtr6[Ptr[EVP_MD_CTX], Ptr[ASN1_ITEM], Ptr[Byte], Ptr[
        X509_ALGOR
      ], Ptr[ASN1_BIT_STRING], Ptr[EVP_PKEY], CInt],
      item_sign: CFuncPtr6[Ptr[EVP_MD_CTX], Ptr[ASN1_ITEM], Ptr[Byte], Ptr[
        X509_ALGOR
      ], Ptr[X509_ALGOR], Ptr[ASN1_BIT_STRING], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_param(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      param_decode: CFuncPtr3[Ptr[EVP_PKEY], Ptr[
        Ptr[CUnsignedChar]
      ], CInt, CInt],
      param_encode: CFuncPtr2[Ptr[EVP_PKEY], Ptr[Ptr[CUnsignedChar]], CInt],
      param_missing: CFuncPtr1[Ptr[EVP_PKEY], CInt],
      param_copy: CFuncPtr2[Ptr[EVP_PKEY], Ptr[EVP_PKEY], CInt],
      param_cmp: CFuncPtr2[Ptr[EVP_PKEY], Ptr[EVP_PKEY], CInt],
      param_print: CFuncPtr4[Ptr[BIO], Ptr[EVP_PKEY], CInt, Ptr[
        ASN1_PCTX
      ], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_param_check(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      pkey_param_check: CFuncPtr1[Ptr[EVP_PKEY], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_private(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      priv_decode: CFuncPtr2[Ptr[EVP_PKEY], Ptr[PKCS8_PRIV_KEY_INFO], CInt],
      priv_encode: CFuncPtr2[Ptr[PKCS8_PRIV_KEY_INFO], Ptr[EVP_PKEY], CInt],
      priv_print: CFuncPtr4[Ptr[BIO], Ptr[EVP_PKEY], CInt, Ptr[ASN1_PCTX], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_public(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      pub_decode: CFuncPtr2[Ptr[EVP_PKEY], Ptr[X509_PUBKEY], CInt],
      pub_encode: CFuncPtr2[Ptr[X509_PUBKEY], Ptr[EVP_PKEY], CInt],
      pub_cmp: CFuncPtr2[Ptr[EVP_PKEY], Ptr[EVP_PKEY], CInt],
      pub_print: CFuncPtr4[Ptr[BIO], Ptr[EVP_PKEY], CInt, Ptr[ASN1_PCTX], CInt],
      pkey_size: CFuncPtr1[Ptr[EVP_PKEY], CInt],
      pkey_bits: CFuncPtr1[Ptr[EVP_PKEY], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_public_check(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      pkey_pub_check: CFuncPtr1[Ptr[EVP_PKEY], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_security_bits(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      pkey_security_bits: CFuncPtr1[Ptr[EVP_PKEY], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_set_priv_key(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      set_priv_key: CFuncPtr3[Ptr[EVP_PKEY], Ptr[CUnsignedChar], size_t, CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_set_pub_key(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      set_pub_key: CFuncPtr3[Ptr[EVP_PKEY], Ptr[CUnsignedChar], size_t, CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_asn1_set_siginf(
      ameth: Ptr[EVP_PKEY_ASN1_METHOD],
      siginf_set: CFuncPtr3[Ptr[X509_SIG_INFO], Ptr[X509_ALGOR], Ptr[
        ASN1_STRING
      ], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_assign(pkey: Ptr[EVP_PKEY], `type`: CInt, key: Ptr[Byte]): CInt =
    extern

  /** */
  def EVP_PKEY_can_sign(pkey: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_check(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_cmp(a: Ptr[EVP_PKEY], b: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_cmp_parameters(a: Ptr[EVP_PKEY], b: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_copy_parameters(to: Ptr[EVP_PKEY], from: Ptr[EVP_PKEY]): CInt =
    extern

  /** */
  def EVP_PKEY_decapsulate(
      ctx: Ptr[EVP_PKEY_CTX],
      unwrapped: Ptr[CUnsignedChar],
      unwrappedlen: Ptr[size_t],
      wrapped: Ptr[CUnsignedChar],
      wrappedlen: size_t
  ): CInt = extern

  /** */
  def EVP_PKEY_decapsulate_init(
      ctx: Ptr[EVP_PKEY_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_PKEY_decrypt(
      ctx: Ptr[EVP_PKEY_CTX],
      out: Ptr[CUnsignedChar],
      outlen: Ptr[size_t],
      in: Ptr[CUnsignedChar],
      inlen: size_t
  ): CInt = extern

  /** */
  def EVP_PKEY_decrypt_init(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_decrypt_init_ex(
      ctx: Ptr[EVP_PKEY_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_PKEY_decrypt_old(
      dec_key: Ptr[CUnsignedChar],
      enc_key: Ptr[CUnsignedChar],
      enc_key_len: CInt,
      private_key: Ptr[EVP_PKEY]
  ): CInt = extern

  /** */
  def EVP_PKEY_derive(
      ctx: Ptr[EVP_PKEY_CTX],
      key: Ptr[CUnsignedChar],
      keylen: Ptr[size_t]
  ): CInt = extern

  /** */
  def EVP_PKEY_derive_init(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_derive_init_ex(
      ctx: Ptr[EVP_PKEY_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_PKEY_derive_set_peer(
      ctx: Ptr[EVP_PKEY_CTX],
      peer: Ptr[EVP_PKEY]
  ): CInt = extern

  /** */
  def EVP_PKEY_derive_set_peer_ex(
      ctx: Ptr[EVP_PKEY_CTX],
      peer: Ptr[EVP_PKEY],
      validate_peer: CInt
  ): CInt = extern

  /** */
  def EVP_PKEY_digestsign_supports_digest(
      pkey: Ptr[EVP_PKEY],
      libctx: Ptr[OSSL_LIB_CTX],
      name: CString,
      propq: CString
  ): CInt = extern

  /** */
  def EVP_PKEY_dup(pkey: Ptr[EVP_PKEY]): Ptr[EVP_PKEY] = extern

  /** */
  def EVP_PKEY_encapsulate(
      ctx: Ptr[EVP_PKEY_CTX],
      wrappedkey: Ptr[CUnsignedChar],
      wrappedkeylen: Ptr[size_t],
      genkey: Ptr[CUnsignedChar],
      genkeylen: Ptr[size_t]
  ): CInt = extern

  /** */
  def EVP_PKEY_encapsulate_init(
      ctx: Ptr[EVP_PKEY_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_PKEY_encrypt(
      ctx: Ptr[EVP_PKEY_CTX],
      out: Ptr[CUnsignedChar],
      outlen: Ptr[size_t],
      in: Ptr[CUnsignedChar],
      inlen: size_t
  ): CInt = extern

  /** */
  def EVP_PKEY_encrypt_init(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_encrypt_init_ex(
      ctx: Ptr[EVP_PKEY_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_PKEY_encrypt_old(
      enc_key: Ptr[CUnsignedChar],
      key: Ptr[CUnsignedChar],
      key_len: CInt,
      pub_key: Ptr[EVP_PKEY]
  ): CInt = extern

  /** */
  def EVP_PKEY_eq(a: Ptr[EVP_PKEY], b: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_export(
      pkey: Ptr[EVP_PKEY],
      selection: CInt,
      export_cb: Ptr[OSSL_CALLBACK],
      export_cbarg: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_PKEY_free(pkey: Ptr[EVP_PKEY]): Unit = extern

  /** */
  def EVP_PKEY_fromdata(
      ctx: Ptr[EVP_PKEY_CTX],
      ppkey: Ptr[Ptr[EVP_PKEY]],
      selection: CInt,
      param: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_PKEY_fromdata_init(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_fromdata_settable(
      ctx: Ptr[EVP_PKEY_CTX],
      selection: CInt
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_PKEY_generate(
      ctx: Ptr[EVP_PKEY_CTX],
      ppkey: Ptr[Ptr[EVP_PKEY]]
  ): CInt = extern

  /** */
  def EVP_PKEY_get0(pkey: Ptr[EVP_PKEY]): Ptr[Byte] = extern

  /** */
  def EVP_PKEY_get0_DH(pkey: Ptr[EVP_PKEY]): Ptr[dh_st] = extern

  /** */
  def EVP_PKEY_get0_DSA(pkey: Ptr[EVP_PKEY]): Ptr[dsa_st] = extern

  /** */
  def EVP_PKEY_get0_EC_KEY(pkey: Ptr[EVP_PKEY]): Ptr[ec_key_st] = extern

  /** */
  def EVP_PKEY_get0_RSA(pkey: Ptr[EVP_PKEY]): Ptr[rsa_st] = extern

  /** */
  def EVP_PKEY_get0_asn1(pkey: Ptr[EVP_PKEY]): Ptr[EVP_PKEY_ASN1_METHOD] =
    extern

  /** */
  def EVP_PKEY_get0_description(pkey: Ptr[EVP_PKEY]): CString = extern

  /** */
  def EVP_PKEY_get0_engine(pkey: Ptr[EVP_PKEY]): Ptr[ENGINE] = extern

  /** */
  def EVP_PKEY_get0_hmac(
      pkey: Ptr[EVP_PKEY],
      len: Ptr[size_t]
  ): Ptr[CUnsignedChar] = extern

  /** */
  def EVP_PKEY_get0_poly1305(
      pkey: Ptr[EVP_PKEY],
      len: Ptr[size_t]
  ): Ptr[CUnsignedChar] = extern

  /** */
  def EVP_PKEY_get0_provider(key: Ptr[EVP_PKEY]): Ptr[OSSL_PROVIDER] = extern

  /** */
  def EVP_PKEY_get0_siphash(
      pkey: Ptr[EVP_PKEY],
      len: Ptr[size_t]
  ): Ptr[CUnsignedChar] = extern

  /** */
  def EVP_PKEY_get0_type_name(key: Ptr[EVP_PKEY]): CString = extern

  /** */
  def EVP_PKEY_get1_DH(pkey: Ptr[EVP_PKEY]): Ptr[dh_st] = extern

  /** */
  def EVP_PKEY_get1_DSA(pkey: Ptr[EVP_PKEY]): Ptr[dsa_st] = extern

  /** */
  def EVP_PKEY_get1_EC_KEY(pkey: Ptr[EVP_PKEY]): Ptr[ec_key_st] = extern

  /** */
  def EVP_PKEY_get1_RSA(pkey: Ptr[EVP_PKEY]): Ptr[rsa_st] = extern

  /** */
  def EVP_PKEY_get1_encoded_public_key(
      pkey: Ptr[EVP_PKEY],
      ppub: Ptr[Ptr[CUnsignedChar]]
  ): size_t = extern

  /** */
  def EVP_PKEY_get_base_id(pkey: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_get_bits(pkey: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_get_bn_param(
      pkey: Ptr[EVP_PKEY],
      key_name: CString,
      bn: Ptr[Ptr[BIGNUM]]
  ): CInt = extern

  /** */
  def EVP_PKEY_get_default_digest_name(
      pkey: Ptr[EVP_PKEY],
      mdname: CString,
      mdname_sz: size_t
  ): CInt = extern

  /** */
  def EVP_PKEY_get_default_digest_nid(
      pkey: Ptr[EVP_PKEY],
      pnid: Ptr[CInt]
  ): CInt = extern

  /** */
  def EVP_PKEY_get_ec_point_conv_form(pkey: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_get_ex_data(key: Ptr[EVP_PKEY], idx: CInt): Ptr[Byte] = extern

  /** */
  def EVP_PKEY_get_field_type(pkey: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_get_group_name(
      pkey: Ptr[EVP_PKEY],
      name: CString,
      name_sz: size_t,
      gname_len: Ptr[size_t]
  ): CInt = extern

  /** */
  def EVP_PKEY_get_id(pkey: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_get_int_param(
      pkey: Ptr[EVP_PKEY],
      key_name: CString,
      out: Ptr[CInt]
  ): CInt = extern

  /** */
  def EVP_PKEY_get_octet_string_param(
      pkey: Ptr[EVP_PKEY],
      key_name: CString,
      buf: Ptr[CUnsignedChar],
      max_buf_sz: size_t,
      out_sz: Ptr[size_t]
  ): CInt = extern

  /** */
  def EVP_PKEY_get_params(pkey: Ptr[EVP_PKEY], params: Ptr[OSSL_PARAM]): CInt =
    extern

  /** */
  def EVP_PKEY_get_raw_private_key(
      pkey: Ptr[EVP_PKEY],
      priv: Ptr[CUnsignedChar],
      len: Ptr[size_t]
  ): CInt = extern

  /** */
  def EVP_PKEY_get_raw_public_key(
      pkey: Ptr[EVP_PKEY],
      pub: Ptr[CUnsignedChar],
      len: Ptr[size_t]
  ): CInt = extern

  /** */
  def EVP_PKEY_get_security_bits(pkey: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_get_size(pkey: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_get_size_t_param(
      pkey: Ptr[EVP_PKEY],
      key_name: CString,
      out: Ptr[size_t]
  ): CInt = extern

  /** */
  def EVP_PKEY_get_utf8_string_param(
      pkey: Ptr[EVP_PKEY],
      key_name: CString,
      str: CString,
      max_buf_sz: size_t,
      out_sz: Ptr[size_t]
  ): CInt = extern

  /** */
  def EVP_PKEY_gettable_params(pkey: Ptr[EVP_PKEY]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_PKEY_is_a(pkey: Ptr[EVP_PKEY], name: CString): CInt = extern

  /** */
  def EVP_PKEY_keygen(ctx: Ptr[EVP_PKEY_CTX], ppkey: Ptr[Ptr[EVP_PKEY]]): CInt =
    extern

  /** */
  def EVP_PKEY_keygen_init(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_meth_add0(pmeth: Ptr[EVP_PKEY_METHOD]): CInt = extern

  /** */
  def EVP_PKEY_meth_copy(
      dst: Ptr[EVP_PKEY_METHOD],
      src: Ptr[EVP_PKEY_METHOD]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_find(`type`: CInt): Ptr[EVP_PKEY_METHOD] = extern

  /** */
  def EVP_PKEY_meth_free(pmeth: Ptr[EVP_PKEY_METHOD]): Unit = extern

  /** */
  def EVP_PKEY_meth_get0(idx: size_t): Ptr[EVP_PKEY_METHOD] = extern

  /** */
  def EVP_PKEY_meth_get0_info(
      ppkey_id: Ptr[CInt],
      pflags: Ptr[CInt],
      meth: Ptr[EVP_PKEY_METHOD]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_check(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pcheck: Ptr[CFuncPtr1[Ptr[EVP_PKEY], CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_cleanup(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pcleanup: Ptr[CFuncPtr1[Ptr[EVP_PKEY_CTX], Unit]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_copy(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pcopy: Ptr[CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_PKEY_CTX], CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_count(): size_t = extern

  /** */
  def EVP_PKEY_meth_get_ctrl(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pctrl: Ptr[CFuncPtr4[Ptr[EVP_PKEY_CTX], CInt, CInt, Ptr[Byte], CInt]],
      pctrl_str: Ptr[CFuncPtr3[Ptr[EVP_PKEY_CTX], CString, CString, CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_decrypt(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pdecrypt_init: Ptr[CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]],
      pdecrypt: Ptr[CFuncPtr5[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[CUnsignedChar], size_t, CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_derive(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pderive_init: Ptr[CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]],
      pderive: Ptr[
        CFuncPtr3[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[size_t], CInt]
      ]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_digest_custom(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pdigest_custom: Ptr[CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_MD_CTX], CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_digestsign(
      pmeth: Ptr[EVP_PKEY_METHOD],
      digestsign: Ptr[CFuncPtr5[Ptr[EVP_MD_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[CUnsignedChar], size_t, CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_digestverify(
      pmeth: Ptr[EVP_PKEY_METHOD],
      digestverify: Ptr[CFuncPtr5[Ptr[EVP_MD_CTX], Ptr[
        CUnsignedChar
      ], size_t, Ptr[CUnsignedChar], size_t, CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_encrypt(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pencrypt_init: Ptr[CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]],
      pencryptfn: Ptr[CFuncPtr5[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[CUnsignedChar], size_t, CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_init(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pinit: Ptr[CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_keygen(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pkeygen_init: Ptr[CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]],
      pkeygen: Ptr[CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_PKEY], CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_param_check(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pcheck: Ptr[CFuncPtr1[Ptr[EVP_PKEY], CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_paramgen(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pparamgen_init: Ptr[CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]],
      pparamgen: Ptr[CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_PKEY], CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_public_check(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pcheck: Ptr[CFuncPtr1[Ptr[EVP_PKEY], CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_sign(
      pmeth: Ptr[EVP_PKEY_METHOD],
      psign_init: Ptr[CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]],
      psign: Ptr[CFuncPtr5[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[CUnsignedChar], size_t, CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_signctx(
      pmeth: Ptr[EVP_PKEY_METHOD],
      psignctx_init: Ptr[CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_MD_CTX], CInt]],
      psignctx: Ptr[CFuncPtr4[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[EVP_MD_CTX], CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_verify(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pverify_init: Ptr[CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]],
      pverify: Ptr[CFuncPtr5[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], size_t, CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_verify_recover(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pverify_recover_init: Ptr[CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]],
      pverify_recover: Ptr[CFuncPtr5[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[CUnsignedChar], size_t, CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_get_verifyctx(
      pmeth: Ptr[EVP_PKEY_METHOD],
      pverifyctx_init: Ptr[CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_MD_CTX], CInt]],
      pverifyctx: Ptr[CFuncPtr4[Ptr[EVP_PKEY_CTX], Ptr[
        CUnsignedChar
      ], CInt, Ptr[EVP_MD_CTX], CInt]]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_new(id: CInt, flags: CInt): Ptr[EVP_PKEY_METHOD] = extern

  /** */
  def EVP_PKEY_meth_remove(pmeth: Ptr[EVP_PKEY_METHOD]): CInt = extern

  /** */
  def EVP_PKEY_meth_set_check(
      pmeth: Ptr[EVP_PKEY_METHOD],
      check: CFuncPtr1[Ptr[EVP_PKEY], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_cleanup(
      pmeth: Ptr[EVP_PKEY_METHOD],
      cleanup: CFuncPtr1[Ptr[EVP_PKEY_CTX], Unit]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_copy(
      pmeth: Ptr[EVP_PKEY_METHOD],
      copy: CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_PKEY_CTX], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_ctrl(
      pmeth: Ptr[EVP_PKEY_METHOD],
      ctrl: CFuncPtr4[Ptr[EVP_PKEY_CTX], CInt, CInt, Ptr[Byte], CInt],
      ctrl_str: CFuncPtr3[Ptr[EVP_PKEY_CTX], CString, CString, CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_decrypt(
      pmeth: Ptr[EVP_PKEY_METHOD],
      decrypt_init: CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt],
      decrypt: CFuncPtr5[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[CUnsignedChar], size_t, CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_derive(
      pmeth: Ptr[EVP_PKEY_METHOD],
      derive_init: CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt],
      derive: CFuncPtr3[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_digest_custom(
      pmeth: Ptr[EVP_PKEY_METHOD],
      digest_custom: CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_MD_CTX], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_digestsign(
      pmeth: Ptr[EVP_PKEY_METHOD],
      digestsign: CFuncPtr5[Ptr[EVP_MD_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[CUnsignedChar], size_t, CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_digestverify(
      pmeth: Ptr[EVP_PKEY_METHOD],
      digestverify: CFuncPtr5[Ptr[EVP_MD_CTX], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], size_t, CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_encrypt(
      pmeth: Ptr[EVP_PKEY_METHOD],
      encrypt_init: CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt],
      encryptfn: CFuncPtr5[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[CUnsignedChar], size_t, CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_init(
      pmeth: Ptr[EVP_PKEY_METHOD],
      init: CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_keygen(
      pmeth: Ptr[EVP_PKEY_METHOD],
      keygen_init: CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt],
      keygen: CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_PKEY], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_param_check(
      pmeth: Ptr[EVP_PKEY_METHOD],
      check: CFuncPtr1[Ptr[EVP_PKEY], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_paramgen(
      pmeth: Ptr[EVP_PKEY_METHOD],
      paramgen_init: CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt],
      paramgen: CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_PKEY], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_public_check(
      pmeth: Ptr[EVP_PKEY_METHOD],
      check: CFuncPtr1[Ptr[EVP_PKEY], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_sign(
      pmeth: Ptr[EVP_PKEY_METHOD],
      sign_init: CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt],
      sign: CFuncPtr5[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[size_t], Ptr[
        CUnsignedChar
      ], size_t, CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_signctx(
      pmeth: Ptr[EVP_PKEY_METHOD],
      signctx_init: CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_MD_CTX], CInt],
      signctx: CFuncPtr4[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[EVP_MD_CTX], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_verify(
      pmeth: Ptr[EVP_PKEY_METHOD],
      verify_init: CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt],
      verify: CFuncPtr5[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], size_t, Ptr[
        CUnsignedChar
      ], size_t, CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_verify_recover(
      pmeth: Ptr[EVP_PKEY_METHOD],
      verify_recover_init: CFuncPtr1[Ptr[EVP_PKEY_CTX], CInt],
      verify_recover: CFuncPtr5[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], Ptr[
        size_t
      ], Ptr[CUnsignedChar], size_t, CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_meth_set_verifyctx(
      pmeth: Ptr[EVP_PKEY_METHOD],
      verifyctx_init: CFuncPtr2[Ptr[EVP_PKEY_CTX], Ptr[EVP_MD_CTX], CInt],
      verifyctx: CFuncPtr4[Ptr[EVP_PKEY_CTX], Ptr[CUnsignedChar], CInt, Ptr[
        EVP_MD_CTX
      ], CInt]
  ): Unit = extern

  /** */
  def EVP_PKEY_missing_parameters(pkey: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_new(): Ptr[EVP_PKEY] = extern

  /** */
  def EVP_PKEY_new_CMAC_key(
      e: Ptr[ENGINE],
      priv: Ptr[CUnsignedChar],
      len: size_t,
      cipher: Ptr[EVP_CIPHER]
  ): Ptr[EVP_PKEY] = extern

  /** */
  def EVP_PKEY_new_mac_key(
      `type`: CInt,
      e: Ptr[ENGINE],
      key: Ptr[CUnsignedChar],
      keylen: CInt
  ): Ptr[EVP_PKEY] = extern

  /** */
  def EVP_PKEY_new_raw_private_key(
      `type`: CInt,
      e: Ptr[ENGINE],
      priv: Ptr[CUnsignedChar],
      len: size_t
  ): Ptr[EVP_PKEY] = extern

  /** */
  def EVP_PKEY_new_raw_private_key_ex(
      libctx: Ptr[OSSL_LIB_CTX],
      keytype: CString,
      propq: CString,
      priv: Ptr[CUnsignedChar],
      len: size_t
  ): Ptr[EVP_PKEY] = extern

  /** */
  def EVP_PKEY_new_raw_public_key(
      `type`: CInt,
      e: Ptr[ENGINE],
      pub: Ptr[CUnsignedChar],
      len: size_t
  ): Ptr[EVP_PKEY] = extern

  /** */
  def EVP_PKEY_new_raw_public_key_ex(
      libctx: Ptr[OSSL_LIB_CTX],
      keytype: CString,
      propq: CString,
      pub: Ptr[CUnsignedChar],
      len: size_t
  ): Ptr[EVP_PKEY] = extern

  /** */
  def EVP_PKEY_pairwise_check(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_param_check(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_param_check_quick(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_parameters_eq(a: Ptr[EVP_PKEY], b: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_paramgen(
      ctx: Ptr[EVP_PKEY_CTX],
      ppkey: Ptr[Ptr[EVP_PKEY]]
  ): CInt = extern

  /** */
  def EVP_PKEY_paramgen_init(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_print_params(
      out: Ptr[BIO],
      pkey: Ptr[EVP_PKEY],
      indent: CInt,
      pctx: Ptr[ASN1_PCTX]
  ): CInt = extern

  /** */
  def EVP_PKEY_print_params_fp(
      fp: Ptr[FILE],
      pkey: Ptr[EVP_PKEY],
      indent: CInt,
      pctx: Ptr[ASN1_PCTX]
  ): CInt = extern

  /** */
  def EVP_PKEY_print_private(
      out: Ptr[BIO],
      pkey: Ptr[EVP_PKEY],
      indent: CInt,
      pctx: Ptr[ASN1_PCTX]
  ): CInt = extern

  /** */
  def EVP_PKEY_print_private_fp(
      fp: Ptr[FILE],
      pkey: Ptr[EVP_PKEY],
      indent: CInt,
      pctx: Ptr[ASN1_PCTX]
  ): CInt = extern

  /** */
  def EVP_PKEY_print_public(
      out: Ptr[BIO],
      pkey: Ptr[EVP_PKEY],
      indent: CInt,
      pctx: Ptr[ASN1_PCTX]
  ): CInt = extern

  /** */
  def EVP_PKEY_print_public_fp(
      fp: Ptr[FILE],
      pkey: Ptr[EVP_PKEY],
      indent: CInt,
      pctx: Ptr[ASN1_PCTX]
  ): CInt = extern

  /** */
  def EVP_PKEY_private_check(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_public_check(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_public_check_quick(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_save_parameters(pkey: Ptr[EVP_PKEY], mode: CInt): CInt = extern

  /** */
  def EVP_PKEY_set1_DH(pkey: Ptr[EVP_PKEY], key: Ptr[dh_st]): CInt = extern

  /** */
  def EVP_PKEY_set1_DSA(pkey: Ptr[EVP_PKEY], key: Ptr[dsa_st]): CInt = extern

  /** */
  def EVP_PKEY_set1_EC_KEY(pkey: Ptr[EVP_PKEY], key: Ptr[ec_key_st]): CInt =
    extern

  /** */
  def EVP_PKEY_set1_RSA(pkey: Ptr[EVP_PKEY], key: Ptr[rsa_st]): CInt = extern

  /** */
  def EVP_PKEY_set1_encoded_public_key(
      pkey: Ptr[EVP_PKEY],
      pub: Ptr[CUnsignedChar],
      publen: size_t
  ): CInt = extern

  /** */
  def EVP_PKEY_set1_engine(pkey: Ptr[EVP_PKEY], e: Ptr[ENGINE]): CInt = extern

  /** */
  def EVP_PKEY_set_bn_param(
      pkey: Ptr[EVP_PKEY],
      key_name: CString,
      bn: Ptr[BIGNUM]
  ): CInt = extern

  /** */
  def EVP_PKEY_set_ex_data(
      key: Ptr[EVP_PKEY],
      idx: CInt,
      arg: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_PKEY_set_int_param(
      pkey: Ptr[EVP_PKEY],
      key_name: CString,
      in: CInt
  ): CInt = extern

  /** */
  def EVP_PKEY_set_octet_string_param(
      pkey: Ptr[EVP_PKEY],
      key_name: CString,
      buf: Ptr[CUnsignedChar],
      bsize: size_t
  ): CInt = extern

  /** */
  def EVP_PKEY_set_params(pkey: Ptr[EVP_PKEY], params: Ptr[OSSL_PARAM]): CInt =
    extern

  /** */
  def EVP_PKEY_set_size_t_param(
      pkey: Ptr[EVP_PKEY],
      key_name: CString,
      in: size_t
  ): CInt = extern

  /** */
  def EVP_PKEY_set_type(pkey: Ptr[EVP_PKEY], `type`: CInt): CInt = extern

  /** */
  def EVP_PKEY_set_type_by_keymgmt(
      pkey: Ptr[EVP_PKEY],
      keymgmt: Ptr[EVP_KEYMGMT]
  ): CInt = extern

  /** */
  def EVP_PKEY_set_type_str(
      pkey: Ptr[EVP_PKEY],
      str: CString,
      len: CInt
  ): CInt = extern

  /** */
  def EVP_PKEY_set_utf8_string_param(
      pkey: Ptr[EVP_PKEY],
      key_name: CString,
      str: CString
  ): CInt = extern

  /** */
  def EVP_PKEY_settable_params(pkey: Ptr[EVP_PKEY]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_PKEY_sign(
      ctx: Ptr[EVP_PKEY_CTX],
      sig: Ptr[CUnsignedChar],
      siglen: Ptr[size_t],
      tbs: Ptr[CUnsignedChar],
      tbslen: size_t
  ): CInt = extern

  /** */
  def EVP_PKEY_sign_init(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_sign_init_ex(
      ctx: Ptr[EVP_PKEY_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_PKEY_todata(
      pkey: Ptr[EVP_PKEY],
      selection: CInt,
      params: Ptr[Ptr[OSSL_PARAM]]
  ): CInt = extern

  /** */
  def EVP_PKEY_type(`type`: CInt): CInt = extern

  /** */
  def EVP_PKEY_type_names_do_all(
      pkey: Ptr[EVP_PKEY],
      fn: CFuncPtr2[CString, Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_PKEY_up_ref(pkey: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def EVP_PKEY_verify(
      ctx: Ptr[EVP_PKEY_CTX],
      sig: Ptr[CUnsignedChar],
      siglen: size_t,
      tbs: Ptr[CUnsignedChar],
      tbslen: size_t
  ): CInt = extern

  /** */
  def EVP_PKEY_verify_init(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_verify_init_ex(
      ctx: Ptr[EVP_PKEY_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_PKEY_verify_recover(
      ctx: Ptr[EVP_PKEY_CTX],
      rout: Ptr[CUnsignedChar],
      routlen: Ptr[size_t],
      sig: Ptr[CUnsignedChar],
      siglen: size_t
  ): CInt = extern

  /** */
  def EVP_PKEY_verify_recover_init(ctx: Ptr[EVP_PKEY_CTX]): CInt = extern

  /** */
  def EVP_PKEY_verify_recover_init_ex(
      ctx: Ptr[EVP_PKEY_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_Q_digest(
      libctx: Ptr[OSSL_LIB_CTX],
      name: CString,
      propq: CString,
      data: Ptr[Byte],
      datalen: size_t,
      md: Ptr[CUnsignedChar],
      mdlen: Ptr[size_t]
  ): CInt = extern

  /** */
  def EVP_Q_mac(
      libctx: Ptr[OSSL_LIB_CTX],
      name: CString,
      propq: CString,
      subalg: CString,
      params: Ptr[OSSL_PARAM],
      key: Ptr[Byte],
      keylen: size_t,
      data: Ptr[CUnsignedChar],
      datalen: size_t,
      out: Ptr[CUnsignedChar],
      outsize: size_t,
      outlen: Ptr[size_t]
  ): Ptr[CUnsignedChar] = extern

  /** */
  def EVP_RAND_CTX_free(ctx: Ptr[EVP_RAND_CTX]): Unit = extern

  /** */
  def EVP_RAND_CTX_get0_rand(ctx: Ptr[EVP_RAND_CTX]): Ptr[EVP_RAND] = extern

  /** */
  def EVP_RAND_CTX_get_params(
      ctx: Ptr[EVP_RAND_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_RAND_CTX_gettable_params(ctx: Ptr[EVP_RAND_CTX]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_RAND_CTX_new(
      rand: Ptr[EVP_RAND],
      parent: Ptr[EVP_RAND_CTX]
  ): Ptr[EVP_RAND_CTX] = extern

  /** */
  def EVP_RAND_CTX_set_params(
      ctx: Ptr[EVP_RAND_CTX],
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_RAND_CTX_settable_params(ctx: Ptr[EVP_RAND_CTX]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_RAND_CTX_up_ref(ctx: Ptr[EVP_RAND_CTX]): CInt = extern

  /** */
  def EVP_RAND_do_all_provided(
      libctx: Ptr[OSSL_LIB_CTX],
      fn: CFuncPtr2[Ptr[EVP_RAND], Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_RAND_enable_locking(ctx: Ptr[EVP_RAND_CTX]): CInt = extern

  /** */
  def EVP_RAND_fetch(
      libctx: Ptr[OSSL_LIB_CTX],
      algorithm: CString,
      properties: CString
  ): Ptr[EVP_RAND] = extern

  /** */
  def EVP_RAND_free(rand: Ptr[EVP_RAND]): Unit = extern

  /** */
  def EVP_RAND_generate(
      ctx: Ptr[EVP_RAND_CTX],
      out: Ptr[CUnsignedChar],
      outlen: size_t,
      strength: CUnsignedInt,
      prediction_resistance: CInt,
      addin: Ptr[CUnsignedChar],
      addin_len: size_t
  ): CInt = extern

  /** */
  def EVP_RAND_get0_description(md: Ptr[EVP_RAND]): CString = extern

  /** */
  def EVP_RAND_get0_name(rand: Ptr[EVP_RAND]): CString = extern

  /** */
  def EVP_RAND_get0_provider(rand: Ptr[EVP_RAND]): Ptr[OSSL_PROVIDER] = extern

  /** */
  def EVP_RAND_get_params(rand: Ptr[EVP_RAND], params: Ptr[OSSL_PARAM]): CInt =
    extern

  /** */
  def EVP_RAND_get_state(ctx: Ptr[EVP_RAND_CTX]): CInt = extern

  /** */
  def EVP_RAND_get_strength(ctx: Ptr[EVP_RAND_CTX]): CUnsignedInt = extern

  /** */
  def EVP_RAND_gettable_ctx_params(rand: Ptr[EVP_RAND]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_RAND_gettable_params(rand: Ptr[EVP_RAND]): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_RAND_instantiate(
      ctx: Ptr[EVP_RAND_CTX],
      strength: CUnsignedInt,
      prediction_resistance: CInt,
      pstr: Ptr[CUnsignedChar],
      pstr_len: size_t,
      params: Ptr[OSSL_PARAM]
  ): CInt = extern

  /** */
  def EVP_RAND_is_a(rand: Ptr[EVP_RAND], name: CString): CInt = extern

  /** */
  def EVP_RAND_names_do_all(
      rand: Ptr[EVP_RAND],
      fn: CFuncPtr2[CString, Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_RAND_nonce(
      ctx: Ptr[EVP_RAND_CTX],
      out: Ptr[CUnsignedChar],
      outlen: size_t
  ): CInt = extern

  /** */
  def EVP_RAND_reseed(
      ctx: Ptr[EVP_RAND_CTX],
      prediction_resistance: CInt,
      ent: Ptr[CUnsignedChar],
      ent_len: size_t,
      addin: Ptr[CUnsignedChar],
      addin_len: size_t
  ): CInt = extern

  /** */
  def EVP_RAND_settable_ctx_params(rand: Ptr[EVP_RAND]): Ptr[OSSL_PARAM] =
    extern

  /** */
  def EVP_RAND_uninstantiate(ctx: Ptr[EVP_RAND_CTX]): CInt = extern

  /** */
  def EVP_RAND_up_ref(rand: Ptr[EVP_RAND]): CInt = extern

  /** */
  def EVP_RAND_verify_zeroization(ctx: Ptr[EVP_RAND_CTX]): CInt = extern

  /** */
  def EVP_SIGNATURE_do_all_provided(
      libctx: Ptr[OSSL_LIB_CTX],
      fn: CFuncPtr2[Ptr[EVP_SIGNATURE], Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): Unit = extern

  /** */
  def EVP_SIGNATURE_fetch(
      ctx: Ptr[OSSL_LIB_CTX],
      algorithm: CString,
      properties: CString
  ): Ptr[EVP_SIGNATURE] = extern

  /** */
  def EVP_SIGNATURE_free(signature: Ptr[EVP_SIGNATURE]): Unit = extern

  /** */
  def EVP_SIGNATURE_get0_description(signature: Ptr[EVP_SIGNATURE]): CString =
    extern

  /** */
  def EVP_SIGNATURE_get0_name(signature: Ptr[EVP_SIGNATURE]): CString = extern

  /** */
  def EVP_SIGNATURE_get0_provider(
      signature: Ptr[EVP_SIGNATURE]
  ): Ptr[OSSL_PROVIDER] = extern

  /** */
  def EVP_SIGNATURE_gettable_ctx_params(
      sig: Ptr[EVP_SIGNATURE]
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_SIGNATURE_is_a(signature: Ptr[EVP_SIGNATURE], name: CString): CInt =
    extern

  /** */
  def EVP_SIGNATURE_names_do_all(
      signature: Ptr[EVP_SIGNATURE],
      fn: CFuncPtr2[CString, Ptr[Byte], Unit],
      data: Ptr[Byte]
  ): CInt = extern

  /** */
  def EVP_SIGNATURE_settable_ctx_params(
      sig: Ptr[EVP_SIGNATURE]
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def EVP_SIGNATURE_up_ref(signature: Ptr[EVP_SIGNATURE]): CInt = extern

  /** */
  def EVP_SealFinal(
      ctx: Ptr[EVP_CIPHER_CTX],
      out: Ptr[CUnsignedChar],
      outl: Ptr[CInt]
  ): CInt = extern

  /** */
  def EVP_SealInit(
      ctx: Ptr[EVP_CIPHER_CTX],
      `type`: Ptr[EVP_CIPHER],
      ek: Ptr[Ptr[CUnsignedChar]],
      ekl: Ptr[CInt],
      iv: Ptr[CUnsignedChar],
      pubk: Ptr[Ptr[EVP_PKEY]],
      npubk: CInt
  ): CInt = extern

  /** */
  def EVP_SignFinal(
      ctx: Ptr[EVP_MD_CTX],
      md: Ptr[CUnsignedChar],
      s: Ptr[CUnsignedInt],
      pkey: Ptr[EVP_PKEY]
  ): CInt = extern

  /** */
  def EVP_SignFinal_ex(
      ctx: Ptr[EVP_MD_CTX],
      md: Ptr[CUnsignedChar],
      s: Ptr[CUnsignedInt],
      pkey: Ptr[EVP_PKEY],
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): CInt = extern

  /** */
  def EVP_VerifyFinal(
      ctx: Ptr[EVP_MD_CTX],
      sigbuf: Ptr[CUnsignedChar],
      siglen: CUnsignedInt,
      pkey: Ptr[EVP_PKEY]
  ): CInt = extern

  /** */
  def EVP_VerifyFinal_ex(
      ctx: Ptr[EVP_MD_CTX],
      sigbuf: Ptr[CUnsignedChar],
      siglen: CUnsignedInt,
      pkey: Ptr[EVP_PKEY],
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): CInt = extern

  /** */
  def EVP_add_alg_module(): Unit = extern

  /** */
  def EVP_add_cipher(cipher: Ptr[EVP_CIPHER]): CInt = extern

  /** */
  def EVP_add_digest(digest: Ptr[EVP_MD]): CInt = extern

  /** */
  def EVP_aes_128_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_cbc_hmac_sha1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_cbc_hmac_sha256(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_ccm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_cfb1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_cfb128(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_cfb8(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_ctr(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_gcm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_ocb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_wrap(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_wrap_pad(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_128_xts(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_ccm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_cfb1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_cfb128(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_cfb8(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_ctr(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_gcm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_ocb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_wrap(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_192_wrap_pad(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_cbc_hmac_sha1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_cbc_hmac_sha256(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_ccm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_cfb1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_cfb128(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_cfb8(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_ctr(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_gcm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_ocb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_wrap(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_wrap_pad(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aes_256_xts(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_128_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_128_ccm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_128_cfb1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_128_cfb128(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_128_cfb8(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_128_ctr(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_128_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_128_gcm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_128_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_192_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_192_ccm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_192_cfb1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_192_cfb128(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_192_cfb8(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_192_ctr(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_192_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_192_gcm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_192_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_256_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_256_ccm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_256_cfb1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_256_cfb128(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_256_cfb8(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_256_ctr(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_256_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_256_gcm(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_aria_256_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_bf_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_bf_cfb64(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_bf_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_bf_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_blake2b512(): Ptr[EVP_MD] = extern

  /** */
  def EVP_blake2s256(): Ptr[EVP_MD] = extern

  /** */
  def EVP_camellia_128_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_128_cfb1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_128_cfb128(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_128_cfb8(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_128_ctr(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_128_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_128_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_192_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_192_cfb1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_192_cfb128(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_192_cfb8(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_192_ctr(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_192_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_192_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_256_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_256_cfb1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_256_cfb128(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_256_cfb8(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_256_ctr(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_256_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_camellia_256_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_cast5_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_cast5_cfb64(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_cast5_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_cast5_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_chacha20(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_chacha20_poly1305(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_default_properties_enable_fips(
      libctx: Ptr[OSSL_LIB_CTX],
      enable: CInt
  ): CInt = extern

  /** */
  def EVP_default_properties_is_fips_enabled(libctx: Ptr[OSSL_LIB_CTX]): CInt =
    extern

  /** */
  def EVP_des_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_cfb1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_cfb64(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_cfb8(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede3(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede3_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede3_cfb1(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede3_cfb64(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede3_cfb8(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede3_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede3_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede3_wrap(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede_cfb64(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ede_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_des_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_desx_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_enc_null(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_get_cipherbyname(name: CString): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_get_digestbyname(name: CString): Ptr[EVP_MD] = extern

  /** */
  def EVP_get_pw_prompt(): CString = extern

  /** */
  def EVP_idea_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_idea_cfb64(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_idea_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_idea_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_md4(): Ptr[EVP_MD] = extern

  /** */
  def EVP_md5(): Ptr[EVP_MD] = extern

  /** */
  def EVP_md5_sha1(): Ptr[EVP_MD] = extern

  /** */
  def EVP_md_null(): Ptr[EVP_MD] = extern

  /** */
  def EVP_mdc2(): Ptr[EVP_MD] = extern

  /** */
  def EVP_rc2_40_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_rc2_64_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_rc2_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_rc2_cfb64(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_rc2_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_rc2_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_rc4(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_rc4_40(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_rc4_hmac_md5(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_read_pw_string(
      buf: CString,
      length: CInt,
      prompt: CString,
      verify: CInt
  ): CInt = extern

  /** */
  def EVP_read_pw_string_min(
      buf: CString,
      minlen: CInt,
      maxlen: CInt,
      prompt: CString,
      verify: CInt
  ): CInt = extern

  /** */
  def EVP_ripemd160(): Ptr[EVP_MD] = extern

  /** */
  def EVP_seed_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_seed_cfb128(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_seed_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_seed_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_set_default_properties(
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): CInt = extern

  /** */
  def EVP_set_pw_prompt(prompt: CString): Unit = extern

  /** */
  def EVP_sha1(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sha224(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sha256(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sha384(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sha3_224(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sha3_256(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sha3_384(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sha3_512(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sha512(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sha512_224(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sha512_256(): Ptr[EVP_MD] = extern

  /** */
  def EVP_shake128(): Ptr[EVP_MD] = extern

  /** */
  def EVP_shake256(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sm3(): Ptr[EVP_MD] = extern

  /** */
  def EVP_sm4_cbc(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_sm4_cfb128(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_sm4_ctr(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_sm4_ecb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_sm4_ofb(): Ptr[EVP_CIPHER] = extern

  /** */
  def EVP_whirlpool(): Ptr[EVP_MD] = extern

  /** */
  def OBJ_NAME_add(name: CString, `type`: CInt, data: CString): CInt = extern

  /** */
  def OBJ_NAME_cleanup(`type`: CInt): Unit = extern

  /** */
  def OBJ_NAME_do_all(
      `type`: CInt,
      fn: CFuncPtr2[Ptr[OBJ_NAME], Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def OBJ_NAME_do_all_sorted(
      `type`: CInt,
      fn: CFuncPtr2[Ptr[OBJ_NAME], Ptr[Byte], Unit],
      arg: Ptr[Byte]
  ): Unit = extern

  /** */
  def OBJ_NAME_get(name: CString, `type`: CInt): CString = extern

  /** */
  def OBJ_NAME_init(): CInt = extern

  /** */
  def OBJ_NAME_new_index(
      hash_func: CFuncPtr1[CString, CUnsignedLongInt],
      cmp_func: CFuncPtr2[CString, CString, CInt],
      free_func: CFuncPtr3[CString, CInt, CString, Unit]
  ): CInt = extern

  /** */
  def OBJ_NAME_remove(name: CString, `type`: CInt): CInt = extern

  /** */
  def OBJ_add_object(obj: Ptr[ASN1_OBJECT]): CInt = extern

  /** */
  def OBJ_add_sigid(signid: CInt, dig_id: CInt, pkey_id: CInt): CInt = extern

  /** */
  def OBJ_bsearch_(
      key: Ptr[Byte],
      base: Ptr[Byte],
      num: CInt,
      size: CInt,
      cmp: CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt]
  ): Ptr[Byte] = extern

  /** */
  def OBJ_bsearch_ex_(
      key: Ptr[Byte],
      base: Ptr[Byte],
      num: CInt,
      size: CInt,
      cmp: CFuncPtr2[Ptr[Byte], Ptr[Byte], CInt],
      flags: CInt
  ): Ptr[Byte] = extern

  /** */
  def OBJ_cmp(a: Ptr[ASN1_OBJECT], b: Ptr[ASN1_OBJECT]): CInt = extern

  /** */
  def OBJ_create(oid: CString, sn: CString, ln: CString): CInt = extern

  /** */
  def OBJ_create_objects(in: Ptr[BIO]): CInt = extern

  /** */
  def OBJ_dup(a: Ptr[ASN1_OBJECT]): Ptr[ASN1_OBJECT] = extern

  /** */
  def OBJ_find_sigid_algs(
      signid: CInt,
      pdig_nid: Ptr[CInt],
      ppkey_nid: Ptr[CInt]
  ): CInt = extern

  /** */
  def OBJ_find_sigid_by_algs(
      psignid: Ptr[CInt],
      dig_nid: CInt,
      pkey_nid: CInt
  ): CInt = extern

  /** */
  def OBJ_get0_data(obj: Ptr[ASN1_OBJECT]): Ptr[CUnsignedChar] = extern

  /** */
  def OBJ_length(obj: Ptr[ASN1_OBJECT]): size_t = extern

  /** */
  def OBJ_ln2nid(s: CString): CInt = extern

  /** */
  def OBJ_new_nid(num: CInt): CInt = extern

  /** */
  def OBJ_nid2ln(n: CInt): CString = extern

  /** */
  def OBJ_nid2obj(n: CInt): Ptr[ASN1_OBJECT] = extern

  /** */
  def OBJ_nid2sn(n: CInt): CString = extern

  /** */
  def OBJ_obj2nid(o: Ptr[ASN1_OBJECT]): CInt = extern

  /** */
  def OBJ_obj2txt(
      buf: CString,
      buf_len: CInt,
      a: Ptr[ASN1_OBJECT],
      no_name: CInt
  ): CInt = extern

  /** */
  def OBJ_sigid_free(): Unit = extern

  /** */
  def OBJ_sn2nid(s: CString): CInt = extern

  /** */
  def OBJ_txt2nid(s: CString): CInt = extern

  /** */
  def OBJ_txt2obj(s: CString, no_name: CInt): Ptr[ASN1_OBJECT] = extern

  /** */
  def OPENSSL_INIT_free(settings: Ptr[OPENSSL_INIT_SETTINGS]): Unit = extern

  /** */
  def OPENSSL_INIT_new(): Ptr[OPENSSL_INIT_SETTINGS] = extern

  /** */
  def OPENSSL_INIT_set_config_appname(
      settings: Ptr[OPENSSL_INIT_SETTINGS],
      config_appname: CString
  ): CInt = extern

  /** */
  def OPENSSL_INIT_set_config_file_flags(
      settings: Ptr[OPENSSL_INIT_SETTINGS],
      flags: CUnsignedLongInt
  ): Unit = extern

  /** */
  def OPENSSL_INIT_set_config_filename(
      settings: Ptr[OPENSSL_INIT_SETTINGS],
      config_filename: CString
  ): CInt = extern

  /** */
  def OPENSSL_atexit(handler: CFuncPtr0[Unit]): CInt = extern

  /** */
  def OPENSSL_buf2hexstr(buf: Ptr[CUnsignedChar], buflen: CLongInt): CString =
    extern

  /** */
  def OPENSSL_buf2hexstr_ex(
      str: CString,
      str_n: size_t,
      strlength: Ptr[size_t],
      buf: Ptr[CUnsignedChar],
      buflen: size_t,
      sep: CChar
  ): CInt = extern

  /** */
  def OPENSSL_cleanse(ptr: Ptr[Byte], len: size_t): Unit = extern

  /** */
  def OPENSSL_cleanup(): Unit = extern

  /** */
  def OPENSSL_die(assertion: CString, file: CString, line: CInt): Unit = extern

  /** */
  def OPENSSL_fork_child(): Unit = extern

  /** */
  def OPENSSL_fork_parent(): Unit = extern

  /** */
  def OPENSSL_fork_prepare(): Unit = extern

  /** */
  def OPENSSL_gmtime(timer: Ptr[time_t], result: Ptr[tm]): Ptr[tm] = extern

  /** */
  def OPENSSL_gmtime_adj(
      tm: Ptr[tm],
      offset_day: CInt,
      offset_sec: CLongInt
  ): CInt = extern

  /** */
  def OPENSSL_gmtime_diff(
      pday: Ptr[CInt],
      psec: Ptr[CInt],
      from: Ptr[tm],
      to: Ptr[tm]
  ): CInt = extern

  /** */
  def OPENSSL_hexchar2int(c: CUnsignedChar): CInt = extern

  /** */
  def OPENSSL_hexstr2buf(
      str: CString,
      buflen: Ptr[CLongInt]
  ): Ptr[CUnsignedChar] = extern

  /** */
  def OPENSSL_hexstr2buf_ex(
      buf: Ptr[CUnsignedChar],
      buf_n: size_t,
      buflen: Ptr[size_t],
      str: CString,
      sep: CChar
  ): CInt = extern

  /** */
  def OPENSSL_info(`type`: CInt): CString = extern

  /** */
  def OPENSSL_init(): Unit = extern

  /** */
  def OPENSSL_init_crypto(
      opts: uint64_t,
      settings: Ptr[OPENSSL_INIT_SETTINGS]
  ): CInt = extern

  /** */
  def OPENSSL_isservice(): CInt = extern

  /** */
  def OPENSSL_issetugid(): CInt = extern

  /** */
  def OPENSSL_sk_deep_copy(
      _0: Ptr[OPENSSL_STACK],
      c: OPENSSL_sk_copyfunc,
      f: OPENSSL_sk_freefunc
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def OPENSSL_sk_delete(st: Ptr[OPENSSL_STACK], loc: CInt): Ptr[Byte] = extern

  /** */
  def OPENSSL_sk_delete_ptr(st: Ptr[OPENSSL_STACK], p: Ptr[Byte]): Ptr[Byte] =
    extern

  /** */
  def OPENSSL_sk_dup(st: Ptr[OPENSSL_STACK]): Ptr[OPENSSL_STACK] = extern

  /** */
  def OPENSSL_sk_find(st: Ptr[OPENSSL_STACK], data: Ptr[Byte]): CInt = extern

  /** */
  def OPENSSL_sk_find_all(
      st: Ptr[OPENSSL_STACK],
      data: Ptr[Byte],
      pnum: Ptr[CInt]
  ): CInt = extern

  /** */
  def OPENSSL_sk_find_ex(st: Ptr[OPENSSL_STACK], data: Ptr[Byte]): CInt = extern

  /** */
  def OPENSSL_sk_free(_0: Ptr[OPENSSL_STACK]): Unit = extern

  /** */
  def OPENSSL_sk_insert(
      sk: Ptr[OPENSSL_STACK],
      data: Ptr[Byte],
      where: CInt
  ): CInt = extern

  /** */
  def OPENSSL_sk_is_sorted(st: Ptr[OPENSSL_STACK]): CInt = extern

  /** */
  def OPENSSL_sk_new(cmp: OPENSSL_sk_compfunc): Ptr[OPENSSL_STACK] = extern

  /** */
  def OPENSSL_sk_new_null(): Ptr[OPENSSL_STACK] = extern

  /** */
  def OPENSSL_sk_new_reserve(
      c: OPENSSL_sk_compfunc,
      n: CInt
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def OPENSSL_sk_num(_0: Ptr[OPENSSL_STACK]): CInt = extern

  /** */
  def OPENSSL_sk_pop(st: Ptr[OPENSSL_STACK]): Ptr[Byte] = extern

  /** */
  def OPENSSL_sk_pop_free(
      st: Ptr[OPENSSL_STACK],
      func: CFuncPtr1[Ptr[Byte], Unit]
  ): Unit = extern

  /** */
  def OPENSSL_sk_push(st: Ptr[OPENSSL_STACK], data: Ptr[Byte]): CInt = extern

  /** */
  def OPENSSL_sk_reserve(st: Ptr[OPENSSL_STACK], n: CInt): CInt = extern

  /** */
  def OPENSSL_sk_set(
      st: Ptr[OPENSSL_STACK],
      i: CInt,
      data: Ptr[Byte]
  ): Ptr[Byte] = extern

  /** */
  def OPENSSL_sk_set_cmp_func(
      sk: Ptr[OPENSSL_STACK],
      cmp: OPENSSL_sk_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def OPENSSL_sk_shift(st: Ptr[OPENSSL_STACK]): Ptr[Byte] = extern

  /** */
  def OPENSSL_sk_sort(st: Ptr[OPENSSL_STACK]): Unit = extern

  /** */
  def OPENSSL_sk_unshift(st: Ptr[OPENSSL_STACK], data: Ptr[Byte]): CInt = extern

  /** */
  def OPENSSL_sk_value(_0: Ptr[OPENSSL_STACK], _1: CInt): Ptr[Byte] = extern

  /** */
  def OPENSSL_sk_zero(st: Ptr[OPENSSL_STACK]): Unit = extern

  /** */
  def OPENSSL_strcasecmp(s1: CString, s2: CString): CInt = extern

  /** */
  def OPENSSL_strlcat(dst: CString, src: CString, siz: size_t): size_t = extern

  /** */
  def OPENSSL_strlcpy(dst: CString, src: CString, siz: size_t): size_t = extern

  /** */
  def OPENSSL_strncasecmp(s1: CString, s2: CString, n: size_t): CInt = extern

  /** */
  def OPENSSL_strnlen(str: CString, maxlen: size_t): size_t = extern

  /** */
  def OPENSSL_thread_stop(): Unit = extern

  /** */
  def OPENSSL_thread_stop_ex(ctx: Ptr[OSSL_LIB_CTX]): Unit = extern

  /** */
  def OPENSSL_version_build_metadata(): CString = extern

  /** */
  def OPENSSL_version_major(): CUnsignedInt = extern

  /** */
  def OPENSSL_version_minor(): CUnsignedInt = extern

  /** */
  def OPENSSL_version_patch(): CUnsignedInt = extern

  /** */
  def OPENSSL_version_pre_release(): CString = extern

  /** */
  def OSSL_FUNC_BIO_ctrl(opf: Ptr[OSSL_DISPATCH]): Ptr[OSSL_FUNC_BIO_ctrl_fn] =
    extern

  /** */
  def OSSL_FUNC_BIO_free(opf: Ptr[OSSL_DISPATCH]): Ptr[OSSL_FUNC_BIO_free_fn] =
    extern

  /** */
  def OSSL_FUNC_BIO_gets(opf: Ptr[OSSL_DISPATCH]): Ptr[OSSL_FUNC_BIO_gets_fn] =
    extern

  /** */
  def OSSL_FUNC_BIO_new_file(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_BIO_new_file_fn] = extern

  /** */
  def OSSL_FUNC_BIO_new_membuf(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_BIO_new_membuf_fn] = extern

  /** */
  def OSSL_FUNC_BIO_puts(opf: Ptr[OSSL_DISPATCH]): Ptr[OSSL_FUNC_BIO_puts_fn] =
    extern

  /** */
  def OSSL_FUNC_BIO_read_ex(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_BIO_read_ex_fn] = extern

  /** */
  def OSSL_FUNC_BIO_up_ref(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_BIO_up_ref_fn] = extern

  /** */
  def OSSL_FUNC_BIO_vprintf(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_BIO_vprintf_fn] = extern

  /** */
  def OSSL_FUNC_BIO_vsnprintf(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_BIO_vsnprintf_fn] = extern

  /** */
  def OSSL_FUNC_BIO_write_ex(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_BIO_write_ex_fn] = extern

  /** */
  def OSSL_FUNC_CRYPTO_clear_free(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_CRYPTO_clear_free_fn] = extern

  /** */
  def OSSL_FUNC_CRYPTO_clear_realloc(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_CRYPTO_clear_realloc_fn] = extern

  /** */
  def OSSL_FUNC_CRYPTO_free(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_CRYPTO_free_fn] = extern

  /** */
  def OSSL_FUNC_CRYPTO_malloc(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_CRYPTO_malloc_fn] = extern

  /** */
  def OSSL_FUNC_CRYPTO_realloc(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_CRYPTO_realloc_fn] = extern

  /** */
  def OSSL_FUNC_CRYPTO_secure_allocated(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_CRYPTO_secure_allocated_fn] = extern

  /** */
  def OSSL_FUNC_CRYPTO_secure_clear_free(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_CRYPTO_secure_clear_free_fn] = extern

  /** */
  def OSSL_FUNC_CRYPTO_secure_free(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_CRYPTO_secure_free_fn] = extern

  /** */
  def OSSL_FUNC_CRYPTO_secure_malloc(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_CRYPTO_secure_malloc_fn] = extern

  /** */
  def OSSL_FUNC_CRYPTO_secure_zalloc(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_CRYPTO_secure_zalloc_fn] = extern

  /** */
  def OSSL_FUNC_CRYPTO_zalloc(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_CRYPTO_zalloc_fn] = extern

  /** */
  def OSSL_FUNC_OPENSSL_cleanse(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_OPENSSL_cleanse_fn] = extern

  /** */
  def OSSL_FUNC_asym_cipher_decrypt(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_asym_cipher_decrypt_fn] = extern

  /** */
  def OSSL_FUNC_asym_cipher_decrypt_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_asym_cipher_decrypt_init_fn] = extern

  /** */
  def OSSL_FUNC_asym_cipher_dupctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_asym_cipher_dupctx_fn] = extern

  /** */
  def OSSL_FUNC_asym_cipher_encrypt(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_asym_cipher_encrypt_fn] = extern

  /** */
  def OSSL_FUNC_asym_cipher_encrypt_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_asym_cipher_encrypt_init_fn] = extern

  /** */
  def OSSL_FUNC_asym_cipher_freectx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_asym_cipher_freectx_fn] = extern

  /** */
  def OSSL_FUNC_asym_cipher_get_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_asym_cipher_get_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_asym_cipher_gettable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_asym_cipher_gettable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_asym_cipher_newctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_asym_cipher_newctx_fn] = extern

  /** */
  def OSSL_FUNC_asym_cipher_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_asym_cipher_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_asym_cipher_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_asym_cipher_settable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_cipher_cipher(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_cipher_fn] = extern

  /** */
  def OSSL_FUNC_cipher_decrypt_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_decrypt_init_fn] = extern

  /** */
  def OSSL_FUNC_cipher_dupctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_dupctx_fn] = extern

  /** */
  def OSSL_FUNC_cipher_encrypt_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_encrypt_init_fn] = extern

  /** */
  def OSSL_FUNC_cipher_final(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_final_fn] = extern

  /** */
  def OSSL_FUNC_cipher_freectx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_freectx_fn] = extern

  /** */
  def OSSL_FUNC_cipher_get_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_get_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_cipher_get_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_get_params_fn] = extern

  /** */
  def OSSL_FUNC_cipher_gettable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_gettable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_cipher_gettable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_gettable_params_fn] = extern

  /** */
  def OSSL_FUNC_cipher_newctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_newctx_fn] = extern

  /** */
  def OSSL_FUNC_cipher_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_cipher_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_settable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_cipher_update(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cipher_update_fn] = extern

  /** */
  def OSSL_FUNC_cleanup_entropy(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cleanup_entropy_fn] = extern

  /** */
  def OSSL_FUNC_cleanup_nonce(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_cleanup_nonce_fn] = extern

  /** */
  def OSSL_FUNC_core_clear_last_error_mark(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_clear_last_error_mark_fn] = extern

  /** */
  def OSSL_FUNC_core_get_libctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_get_libctx_fn] = extern

  /** */
  def OSSL_FUNC_core_get_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_get_params_fn] = extern

  /** */
  def OSSL_FUNC_core_gettable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_gettable_params_fn] = extern

  /** */
  def OSSL_FUNC_core_new_error(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_new_error_fn] = extern

  /** */
  def OSSL_FUNC_core_obj_add_sigid(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_obj_add_sigid_fn] = extern

  /** */
  def OSSL_FUNC_core_obj_create(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_obj_create_fn] = extern

  /** */
  def OSSL_FUNC_core_pop_error_to_mark(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_pop_error_to_mark_fn] = extern

  /** */
  def OSSL_FUNC_core_set_error_debug(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_set_error_debug_fn] = extern

  /** */
  def OSSL_FUNC_core_set_error_mark(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_set_error_mark_fn] = extern

  /** */
  def OSSL_FUNC_core_thread_start(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_thread_start_fn] = extern

  /** */
  def OSSL_FUNC_core_vset_error(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_core_vset_error_fn] = extern

  /** */
  def OSSL_FUNC_decoder_decode(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_decoder_decode_fn] = extern

  /** */
  def OSSL_FUNC_decoder_does_selection(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_decoder_does_selection_fn] = extern

  /** */
  def OSSL_FUNC_decoder_export_object(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_decoder_export_object_fn] = extern

  /** */
  def OSSL_FUNC_decoder_freectx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_decoder_freectx_fn] = extern

  /** */
  def OSSL_FUNC_decoder_get_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_decoder_get_params_fn] = extern

  /** */
  def OSSL_FUNC_decoder_gettable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_decoder_gettable_params_fn] = extern

  /** */
  def OSSL_FUNC_decoder_newctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_decoder_newctx_fn] = extern

  /** */
  def OSSL_FUNC_decoder_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_decoder_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_decoder_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_decoder_settable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_digest_digest(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_digest_fn] = extern

  /** */
  def OSSL_FUNC_digest_dupctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_dupctx_fn] = extern

  /** */
  def OSSL_FUNC_digest_final(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_final_fn] = extern

  /** */
  def OSSL_FUNC_digest_freectx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_freectx_fn] = extern

  /** */
  def OSSL_FUNC_digest_get_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_get_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_digest_get_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_get_params_fn] = extern

  /** */
  def OSSL_FUNC_digest_gettable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_gettable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_digest_gettable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_gettable_params_fn] = extern

  /** */
  def OSSL_FUNC_digest_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_init_fn] = extern

  /** */
  def OSSL_FUNC_digest_newctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_newctx_fn] = extern

  /** */
  def OSSL_FUNC_digest_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_digest_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_settable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_digest_update(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_digest_update_fn] = extern

  /** */
  def OSSL_FUNC_encoder_does_selection(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_encoder_does_selection_fn] = extern

  /** */
  def OSSL_FUNC_encoder_encode(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_encoder_encode_fn] = extern

  /** */
  def OSSL_FUNC_encoder_free_object(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_encoder_free_object_fn] = extern

  /** */
  def OSSL_FUNC_encoder_freectx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_encoder_freectx_fn] = extern

  /** */
  def OSSL_FUNC_encoder_get_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_encoder_get_params_fn] = extern

  /** */
  def OSSL_FUNC_encoder_gettable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_encoder_gettable_params_fn] = extern

  /** */
  def OSSL_FUNC_encoder_import_object(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_encoder_import_object_fn] = extern

  /** */
  def OSSL_FUNC_encoder_newctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_encoder_newctx_fn] = extern

  /** */
  def OSSL_FUNC_encoder_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_encoder_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_encoder_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_encoder_settable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_get_entropy(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_get_entropy_fn] = extern

  /** */
  def OSSL_FUNC_get_nonce(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_get_nonce_fn] = extern

  /** */
  def OSSL_FUNC_kdf_derive(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kdf_derive_fn] = extern

  /** */
  def OSSL_FUNC_kdf_dupctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kdf_dupctx_fn] = extern

  /** */
  def OSSL_FUNC_kdf_freectx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kdf_freectx_fn] = extern

  /** */
  def OSSL_FUNC_kdf_get_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kdf_get_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_kdf_get_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kdf_get_params_fn] = extern

  /** */
  def OSSL_FUNC_kdf_gettable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kdf_gettable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_kdf_gettable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kdf_gettable_params_fn] = extern

  /** */
  def OSSL_FUNC_kdf_newctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kdf_newctx_fn] = extern

  /** */
  def OSSL_FUNC_kdf_reset(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kdf_reset_fn] = extern

  /** */
  def OSSL_FUNC_kdf_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kdf_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_kdf_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kdf_settable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_kem_decapsulate(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kem_decapsulate_fn] = extern

  /** */
  def OSSL_FUNC_kem_decapsulate_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kem_decapsulate_init_fn] = extern

  /** */
  def OSSL_FUNC_kem_dupctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kem_dupctx_fn] = extern

  /** */
  def OSSL_FUNC_kem_encapsulate(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kem_encapsulate_fn] = extern

  /** */
  def OSSL_FUNC_kem_encapsulate_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kem_encapsulate_init_fn] = extern

  /** */
  def OSSL_FUNC_kem_freectx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kem_freectx_fn] = extern

  /** */
  def OSSL_FUNC_kem_get_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kem_get_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_kem_gettable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kem_gettable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_kem_newctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kem_newctx_fn] = extern

  /** */
  def OSSL_FUNC_kem_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kem_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_kem_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_kem_settable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_keyexch_derive(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keyexch_derive_fn] = extern

  /** */
  def OSSL_FUNC_keyexch_dupctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keyexch_dupctx_fn] = extern

  /** */
  def OSSL_FUNC_keyexch_freectx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keyexch_freectx_fn] = extern

  /** */
  def OSSL_FUNC_keyexch_get_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keyexch_get_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_keyexch_gettable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keyexch_gettable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_keyexch_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keyexch_init_fn] = extern

  /** */
  def OSSL_FUNC_keyexch_newctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keyexch_newctx_fn] = extern

  /** */
  def OSSL_FUNC_keyexch_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keyexch_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_keyexch_set_peer(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keyexch_set_peer_fn] = extern

  /** */
  def OSSL_FUNC_keyexch_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keyexch_settable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_dup(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_dup_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_export(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_export_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_export_types(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_export_types_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_free(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_free_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_gen(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_gen_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_gen_cleanup(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_gen_cleanup_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_gen_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_gen_init_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_gen_set_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_gen_set_params_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_gen_set_template(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_gen_set_template_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_gen_settable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_gen_settable_params_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_get_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_get_params_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_gettable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_gettable_params_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_has(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_has_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_import(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_import_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_import_types(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_import_types_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_load(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_load_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_match(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_match_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_new(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_new_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_query_operation_name(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_query_operation_name_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_set_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_set_params_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_settable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_settable_params_fn] = extern

  /** */
  def OSSL_FUNC_keymgmt_validate(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_keymgmt_validate_fn] = extern

  /** */
  def OSSL_FUNC_mac_dupctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_mac_dupctx_fn] = extern

  /** */
  def OSSL_FUNC_mac_final(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_mac_final_fn] = extern

  /** */
  def OSSL_FUNC_mac_freectx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_mac_freectx_fn] = extern

  /** */
  def OSSL_FUNC_mac_get_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_mac_get_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_mac_get_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_mac_get_params_fn] = extern

  /** */
  def OSSL_FUNC_mac_gettable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_mac_gettable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_mac_gettable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_mac_gettable_params_fn] = extern

  /** */
  def OSSL_FUNC_mac_init(opf: Ptr[OSSL_DISPATCH]): Ptr[OSSL_FUNC_mac_init_fn] =
    extern

  /** */
  def OSSL_FUNC_mac_newctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_mac_newctx_fn] = extern

  /** */
  def OSSL_FUNC_mac_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_mac_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_mac_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_mac_settable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_mac_update(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_mac_update_fn] = extern

  /** */
  def OSSL_FUNC_provider_deregister_child_cb(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_deregister_child_cb_fn] = extern

  /** */
  def OSSL_FUNC_provider_free(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_free_fn] = extern

  /** */
  def OSSL_FUNC_provider_get0_dispatch(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_get0_dispatch_fn] = extern

  /** */
  def OSSL_FUNC_provider_get0_provider_ctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_get0_provider_ctx_fn] = extern

  /** */
  def OSSL_FUNC_provider_get_capabilities(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_get_capabilities_fn] = extern

  /** */
  def OSSL_FUNC_provider_get_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_get_params_fn] = extern

  /** */
  def OSSL_FUNC_provider_get_reason_strings(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_get_reason_strings_fn] = extern

  /** */
  def OSSL_FUNC_provider_gettable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_gettable_params_fn] = extern

  /** */
  def OSSL_FUNC_provider_name(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_name_fn] = extern

  /** */
  def OSSL_FUNC_provider_query_operation(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_query_operation_fn] = extern

  /** */
  def OSSL_FUNC_provider_register_child_cb(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_register_child_cb_fn] = extern

  /** */
  def OSSL_FUNC_provider_self_test(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_self_test_fn] = extern

  /** */
  def OSSL_FUNC_provider_teardown(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_teardown_fn] = extern

  /** */
  def OSSL_FUNC_provider_unquery_operation(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_unquery_operation_fn] = extern

  /** */
  def OSSL_FUNC_provider_up_ref(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_provider_up_ref_fn] = extern

  /** */
  def OSSL_FUNC_rand_clear_seed(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_clear_seed_fn] = extern

  /** */
  def OSSL_FUNC_rand_enable_locking(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_enable_locking_fn] = extern

  /** */
  def OSSL_FUNC_rand_freectx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_freectx_fn] = extern

  /** */
  def OSSL_FUNC_rand_generate(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_generate_fn] = extern

  /** */
  def OSSL_FUNC_rand_get_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_get_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_rand_get_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_get_params_fn] = extern

  /** */
  def OSSL_FUNC_rand_get_seed(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_get_seed_fn] = extern

  /** */
  def OSSL_FUNC_rand_gettable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_gettable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_rand_gettable_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_gettable_params_fn] = extern

  /** */
  def OSSL_FUNC_rand_instantiate(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_instantiate_fn] = extern

  /** */
  def OSSL_FUNC_rand_lock(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_lock_fn] = extern

  /** */
  def OSSL_FUNC_rand_newctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_newctx_fn] = extern

  /** */
  def OSSL_FUNC_rand_nonce(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_nonce_fn] = extern

  /** */
  def OSSL_FUNC_rand_reseed(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_reseed_fn] = extern

  /** */
  def OSSL_FUNC_rand_set_callbacks(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_set_callbacks_fn] = extern

  /** */
  def OSSL_FUNC_rand_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_rand_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_settable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_rand_uninstantiate(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_uninstantiate_fn] = extern

  /** */
  def OSSL_FUNC_rand_unlock(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_unlock_fn] = extern

  /** */
  def OSSL_FUNC_rand_verify_zeroization(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_rand_verify_zeroization_fn] = extern

  /** */
  def OSSL_FUNC_self_test_cb(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_self_test_cb_fn] = extern

  /** */
  def OSSL_FUNC_signature_digest_sign(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_digest_sign_fn] = extern

  /** */
  def OSSL_FUNC_signature_digest_sign_final(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_digest_sign_final_fn] = extern

  /** */
  def OSSL_FUNC_signature_digest_sign_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_digest_sign_init_fn] = extern

  /** */
  def OSSL_FUNC_signature_digest_sign_update(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_digest_sign_update_fn] = extern

  /** */
  def OSSL_FUNC_signature_digest_verify(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_digest_verify_fn] = extern

  /** */
  def OSSL_FUNC_signature_digest_verify_final(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_digest_verify_final_fn] = extern

  /** */
  def OSSL_FUNC_signature_digest_verify_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_digest_verify_init_fn] = extern

  /** */
  def OSSL_FUNC_signature_digest_verify_update(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_digest_verify_update_fn] = extern

  /** */
  def OSSL_FUNC_signature_dupctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_dupctx_fn] = extern

  /** */
  def OSSL_FUNC_signature_freectx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_freectx_fn] = extern

  /** */
  def OSSL_FUNC_signature_get_ctx_md_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_get_ctx_md_params_fn] = extern

  /** */
  def OSSL_FUNC_signature_get_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_get_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_signature_gettable_ctx_md_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_gettable_ctx_md_params_fn] = extern

  /** */
  def OSSL_FUNC_signature_gettable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_gettable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_signature_newctx(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_newctx_fn] = extern

  /** */
  def OSSL_FUNC_signature_set_ctx_md_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_set_ctx_md_params_fn] = extern

  /** */
  def OSSL_FUNC_signature_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_signature_settable_ctx_md_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_settable_ctx_md_params_fn] = extern

  /** */
  def OSSL_FUNC_signature_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_settable_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_signature_sign(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_sign_fn] = extern

  /** */
  def OSSL_FUNC_signature_sign_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_sign_init_fn] = extern

  /** */
  def OSSL_FUNC_signature_verify(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_verify_fn] = extern

  /** */
  def OSSL_FUNC_signature_verify_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_verify_init_fn] = extern

  /** */
  def OSSL_FUNC_signature_verify_recover(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_verify_recover_fn] = extern

  /** */
  def OSSL_FUNC_signature_verify_recover_init(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_signature_verify_recover_init_fn] = extern

  /** */
  def OSSL_FUNC_store_attach(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_store_attach_fn] = extern

  /** */
  def OSSL_FUNC_store_close(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_store_close_fn] = extern

  /** */
  def OSSL_FUNC_store_eof(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_store_eof_fn] = extern

  /** */
  def OSSL_FUNC_store_export_object(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_store_export_object_fn] = extern

  /** */
  def OSSL_FUNC_store_load(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_store_load_fn] = extern

  /** */
  def OSSL_FUNC_store_open(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_store_open_fn] = extern

  /** */
  def OSSL_FUNC_store_set_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_store_set_ctx_params_fn] = extern

  /** */
  def OSSL_FUNC_store_settable_ctx_params(
      opf: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_FUNC_store_settable_ctx_params_fn] = extern

  /** */
  def OSSL_LIB_CTX_free(_0: Ptr[OSSL_LIB_CTX]): Unit = extern

  /** */
  def OSSL_LIB_CTX_get0_global_default(): Ptr[OSSL_LIB_CTX] = extern

  /** */
  def OSSL_LIB_CTX_load_config(
      ctx: Ptr[OSSL_LIB_CTX],
      config_file: CString
  ): CInt = extern

  /** */
  def OSSL_LIB_CTX_new(): Ptr[OSSL_LIB_CTX] = extern

  /** */
  def OSSL_LIB_CTX_new_child(
      handle: Ptr[OSSL_CORE_HANDLE],
      in: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_LIB_CTX] = extern

  /** */
  def OSSL_LIB_CTX_new_from_dispatch(
      handle: Ptr[OSSL_CORE_HANDLE],
      in: Ptr[OSSL_DISPATCH]
  ): Ptr[OSSL_LIB_CTX] = extern

  /** */
  def OSSL_LIB_CTX_set0_default(libctx: Ptr[OSSL_LIB_CTX]): Ptr[OSSL_LIB_CTX] =
    extern

  /** */
  def OSSL_PARAM_allocate_from_text(
      to: Ptr[OSSL_PARAM],
      paramdefs: Ptr[OSSL_PARAM],
      key: CString,
      value: CString,
      value_n: size_t,
      found: Ptr[CInt]
  ): CInt = extern

  /** */
  def OSSL_PARAM_dup(p: Ptr[OSSL_PARAM]): Ptr[OSSL_PARAM] = extern

  /** */
  def OSSL_PARAM_free(p: Ptr[OSSL_PARAM]): Unit = extern

  /** */
  def OSSL_PARAM_get_BN(p: Ptr[OSSL_PARAM], `val`: Ptr[Ptr[BIGNUM]]): CInt =
    extern

  /** */
  def OSSL_PARAM_get_double(p: Ptr[OSSL_PARAM], `val`: Ptr[Double]): CInt =
    extern

  /** */
  def OSSL_PARAM_get_int(p: Ptr[OSSL_PARAM], `val`: Ptr[CInt]): CInt = extern

  /** */
  def OSSL_PARAM_get_int32(p: Ptr[OSSL_PARAM], `val`: Ptr[int32_t]): CInt =
    extern

  /** */
  def OSSL_PARAM_get_int64(p: Ptr[OSSL_PARAM], `val`: Ptr[int64_t]): CInt =
    extern

  /** */
  def OSSL_PARAM_get_long(p: Ptr[OSSL_PARAM], `val`: Ptr[CLongInt]): CInt =
    extern

  /** */
  def OSSL_PARAM_get_octet_ptr(
      p: Ptr[OSSL_PARAM],
      `val`: Ptr[Ptr[Byte]],
      used_len: Ptr[size_t]
  ): CInt = extern

  /** */
  def OSSL_PARAM_get_octet_string(
      p: Ptr[OSSL_PARAM],
      `val`: Ptr[Ptr[Byte]],
      max_len: size_t,
      used_len: Ptr[size_t]
  ): CInt = extern

  /** */
  def OSSL_PARAM_get_octet_string_ptr(
      p: Ptr[OSSL_PARAM],
      `val`: Ptr[Ptr[Byte]],
      used_len: Ptr[size_t]
  ): CInt = extern

  /** */
  def OSSL_PARAM_get_size_t(p: Ptr[OSSL_PARAM], `val`: Ptr[size_t]): CInt =
    extern

  /** */
  def OSSL_PARAM_get_time_t(p: Ptr[OSSL_PARAM], `val`: Ptr[time_t]): CInt =
    extern

  /** */
  def OSSL_PARAM_get_uint(p: Ptr[OSSL_PARAM], `val`: Ptr[CUnsignedInt]): CInt =
    extern

  /** */
  def OSSL_PARAM_get_uint32(p: Ptr[OSSL_PARAM], `val`: Ptr[uint32_t]): CInt =
    extern

  /** */
  def OSSL_PARAM_get_uint64(p: Ptr[OSSL_PARAM], `val`: Ptr[uint64_t]): CInt =
    extern

  /** */
  def OSSL_PARAM_get_ulong(
      p: Ptr[OSSL_PARAM],
      `val`: Ptr[CUnsignedLongInt]
  ): CInt = extern

  /** */
  def OSSL_PARAM_get_utf8_ptr(p: Ptr[OSSL_PARAM], `val`: Ptr[CString]): CInt =
    extern

  /** */
  def OSSL_PARAM_get_utf8_string(
      p: Ptr[OSSL_PARAM],
      `val`: Ptr[CString],
      max_len: size_t
  ): CInt = extern

  /** */
  def OSSL_PARAM_get_utf8_string_ptr(
      p: Ptr[OSSL_PARAM],
      `val`: Ptr[CString]
  ): CInt = extern

  /** */
  def OSSL_PARAM_locate(p: Ptr[OSSL_PARAM], key: CString): Ptr[OSSL_PARAM] =
    extern

  /** */
  def OSSL_PARAM_locate_const(
      p: Ptr[OSSL_PARAM],
      key: CString
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def OSSL_PARAM_merge(
      p1: Ptr[OSSL_PARAM],
      p2: Ptr[OSSL_PARAM]
  ): Ptr[OSSL_PARAM] = extern

  /** */
  def OSSL_PARAM_modified(p: Ptr[OSSL_PARAM]): CInt = extern

  /** */
  def OSSL_PARAM_set_BN(p: Ptr[OSSL_PARAM], `val`: Ptr[BIGNUM]): CInt = extern

  /** */
  def OSSL_PARAM_set_all_unmodified(p: Ptr[OSSL_PARAM]): Unit = extern

  /** */
  def OSSL_PARAM_set_double(p: Ptr[OSSL_PARAM], `val`: Double): CInt = extern

  /** */
  def OSSL_PARAM_set_int(p: Ptr[OSSL_PARAM], `val`: CInt): CInt = extern

  /** */
  def OSSL_PARAM_set_int32(p: Ptr[OSSL_PARAM], `val`: int32_t): CInt = extern

  /** */
  def OSSL_PARAM_set_int64(p: Ptr[OSSL_PARAM], `val`: int64_t): CInt = extern

  /** */
  def OSSL_PARAM_set_long(p: Ptr[OSSL_PARAM], `val`: CLongInt): CInt = extern

  /** */
  def OSSL_PARAM_set_octet_ptr(
      p: Ptr[OSSL_PARAM],
      `val`: Ptr[Byte],
      used_len: size_t
  ): CInt = extern

  /** */
  def OSSL_PARAM_set_octet_string(
      p: Ptr[OSSL_PARAM],
      `val`: Ptr[Byte],
      len: size_t
  ): CInt = extern

  /** */
  def OSSL_PARAM_set_size_t(p: Ptr[OSSL_PARAM], `val`: size_t): CInt = extern

  /** */
  def OSSL_PARAM_set_time_t(p: Ptr[OSSL_PARAM], `val`: time_t): CInt = extern

  /** */
  def OSSL_PARAM_set_uint(p: Ptr[OSSL_PARAM], `val`: CUnsignedInt): CInt =
    extern

  /** */
  def OSSL_PARAM_set_uint32(p: Ptr[OSSL_PARAM], `val`: uint32_t): CInt = extern

  /** */
  def OSSL_PARAM_set_uint64(p: Ptr[OSSL_PARAM], `val`: uint64_t): CInt = extern

  /** */
  def OSSL_PARAM_set_ulong(p: Ptr[OSSL_PARAM], `val`: CUnsignedLongInt): CInt =
    extern

  /** */
  def OSSL_PARAM_set_utf8_ptr(p: Ptr[OSSL_PARAM], `val`: CString): CInt = extern

  /** */
  def OSSL_PARAM_set_utf8_string(p: Ptr[OSSL_PARAM], `val`: CString): CInt =
    extern

  /** */
  def OSSL_provider_init(): CInt = extern

  /** */
  def OpenSSL_version(`type`: CInt): CString = extern

  /** */
  def OpenSSL_version_num(): CUnsignedLongInt = extern

  /** */
  def PEM_write_bio_ASN1_stream(
      out: Ptr[BIO],
      `val`: Ptr[ASN1_VALUE],
      in: Ptr[BIO],
      flags: CInt,
      hdr: CString,
      it: Ptr[ASN1_ITEM]
  ): CInt = extern

  /** */
  def PKCS5_PBE_add(): Unit = extern

  /** */
  def PKCS5_PBE_keyivgen(
      ctx: Ptr[EVP_CIPHER_CTX],
      pass: CString,
      passlen: CInt,
      param: Ptr[ASN1_TYPE],
      cipher: Ptr[EVP_CIPHER],
      md: Ptr[EVP_MD],
      en_de: CInt
  ): CInt = extern

  /** */
  def PKCS5_PBE_keyivgen_ex(
      cctx: Ptr[EVP_CIPHER_CTX],
      pass: CString,
      passlen: CInt,
      param: Ptr[ASN1_TYPE],
      cipher: Ptr[EVP_CIPHER],
      md: Ptr[EVP_MD],
      en_de: CInt,
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): CInt = extern

  /** */
  def PKCS5_PBKDF2_HMAC(
      pass: CString,
      passlen: CInt,
      salt: Ptr[CUnsignedChar],
      saltlen: CInt,
      iter: CInt,
      digest: Ptr[EVP_MD],
      keylen: CInt,
      out: Ptr[CUnsignedChar]
  ): CInt = extern

  /** */
  def PKCS5_PBKDF2_HMAC_SHA1(
      pass: CString,
      passlen: CInt,
      salt: Ptr[CUnsignedChar],
      saltlen: CInt,
      iter: CInt,
      keylen: CInt,
      out: Ptr[CUnsignedChar]
  ): CInt = extern

  /** */
  def PKCS5_v2_PBE_keyivgen(
      ctx: Ptr[EVP_CIPHER_CTX],
      pass: CString,
      passlen: CInt,
      param: Ptr[ASN1_TYPE],
      cipher: Ptr[EVP_CIPHER],
      md: Ptr[EVP_MD],
      en_de: CInt
  ): CInt = extern

  /** */
  def PKCS5_v2_PBE_keyivgen_ex(
      ctx: Ptr[EVP_CIPHER_CTX],
      pass: CString,
      passlen: CInt,
      param: Ptr[ASN1_TYPE],
      cipher: Ptr[EVP_CIPHER],
      md: Ptr[EVP_MD],
      en_de: CInt,
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): CInt = extern

  /** */
  def PKCS5_v2_scrypt_keyivgen(
      ctx: Ptr[EVP_CIPHER_CTX],
      pass: CString,
      passlen: CInt,
      param: Ptr[ASN1_TYPE],
      c: Ptr[EVP_CIPHER],
      md: Ptr[EVP_MD],
      en_de: CInt
  ): CInt = extern

  /** */
  def PKCS5_v2_scrypt_keyivgen_ex(
      ctx: Ptr[EVP_CIPHER_CTX],
      pass: CString,
      passlen: CInt,
      param: Ptr[ASN1_TYPE],
      c: Ptr[EVP_CIPHER],
      md: Ptr[EVP_MD],
      en_de: CInt,
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): CInt = extern

  /** */
  def SHA1(
      d: Ptr[CUnsignedChar],
      n: size_t,
      md: Ptr[CUnsignedChar]
  ): Ptr[CUnsignedChar] = extern

  /** */
  def SHA1_Final(md: Ptr[CUnsignedChar], c: Ptr[SHA_CTX]): CInt = extern

  /** */
  def SHA1_Init(c: Ptr[SHA_CTX]): CInt = extern

  /** */
  def SHA1_Transform(c: Ptr[SHA_CTX], data: Ptr[CUnsignedChar]): Unit = extern

  /** */
  def SHA1_Update(c: Ptr[SHA_CTX], data: Ptr[Byte], len: size_t): CInt = extern

  /** */
  def SHA224(
      d: Ptr[CUnsignedChar],
      n: size_t,
      md: Ptr[CUnsignedChar]
  ): Ptr[CUnsignedChar] = extern

  /** */
  def SHA224_Final(md: Ptr[CUnsignedChar], c: Ptr[SHA256_CTX]): CInt = extern

  /** */
  def SHA224_Init(c: Ptr[SHA256_CTX]): CInt = extern

  /** */
  def SHA224_Update(c: Ptr[SHA256_CTX], data: Ptr[Byte], len: size_t): CInt =
    extern

  /** */
  def SHA256(
      d: Ptr[CUnsignedChar],
      n: size_t,
      md: Ptr[CUnsignedChar]
  ): Ptr[CUnsignedChar] = extern

  /** */
  def SHA256_Final(md: Ptr[CUnsignedChar], c: Ptr[SHA256_CTX]): CInt = extern

  /** */
  def SHA256_Init(c: Ptr[SHA256_CTX]): CInt = extern

  /** */
  def SHA256_Transform(c: Ptr[SHA256_CTX], data: Ptr[CUnsignedChar]): Unit =
    extern

  /** */
  def SHA256_Update(c: Ptr[SHA256_CTX], data: Ptr[Byte], len: size_t): CInt =
    extern

  /** */
  def SHA384(
      d: Ptr[CUnsignedChar],
      n: size_t,
      md: Ptr[CUnsignedChar]
  ): Ptr[CUnsignedChar] = extern

  /** */
  def SHA384_Final(md: Ptr[CUnsignedChar], c: Ptr[SHA512_CTX]): CInt = extern

  /** */
  def SHA384_Init(c: Ptr[SHA512_CTX]): CInt = extern

  /** */
  def SHA384_Update(c: Ptr[SHA512_CTX], data: Ptr[Byte], len: size_t): CInt =
    extern

  /** */
  def SHA512(
      d: Ptr[CUnsignedChar],
      n: size_t,
      md: Ptr[CUnsignedChar]
  ): Ptr[CUnsignedChar] = extern

  /** */
  def SHA512_Final(md: Ptr[CUnsignedChar], c: Ptr[SHA512_CTX]): CInt = extern

  /** */
  def SHA512_Init(c: Ptr[SHA512_CTX]): CInt = extern

  /** */
  def SHA512_Transform(c: Ptr[SHA512_CTX], data: Ptr[CUnsignedChar]): Unit =
    extern

  /** */
  def SHA512_Update(c: Ptr[SHA512_CTX], data: Ptr[Byte], len: size_t): CInt =
    extern

  /** */
  def SMIME_crlf_copy(in: Ptr[BIO], out: Ptr[BIO], flags: CInt): CInt = extern

  /** */
  def SMIME_read_ASN1(
      bio: Ptr[BIO],
      bcont: Ptr[Ptr[BIO]],
      it: Ptr[ASN1_ITEM]
  ): Ptr[ASN1_VALUE] = extern

  /** */
  def SMIME_read_ASN1_ex(
      bio: Ptr[BIO],
      flags: CInt,
      bcont: Ptr[Ptr[BIO]],
      it: Ptr[ASN1_ITEM],
      x: Ptr[Ptr[ASN1_VALUE]],
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): Ptr[ASN1_VALUE] = extern

  /** */
  def SMIME_text(in: Ptr[BIO], out: Ptr[BIO]): CInt = extern

  /** */
  def SMIME_write_ASN1(
      bio: Ptr[BIO],
      `val`: Ptr[ASN1_VALUE],
      data: Ptr[BIO],
      flags: CInt,
      ctype_nid: CInt,
      econt_nid: CInt,
      mdalgs: Ptr[stack_st_X509_ALGOR],
      it: Ptr[ASN1_ITEM]
  ): CInt = extern

  /** */
  def SMIME_write_ASN1_ex(
      bio: Ptr[BIO],
      `val`: Ptr[ASN1_VALUE],
      data: Ptr[BIO],
      flags: CInt,
      ctype_nid: CInt,
      econt_nid: CInt,
      mdalgs: Ptr[stack_st_X509_ALGOR],
      it: Ptr[ASN1_ITEM],
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): CInt = extern

  /** */
  def UTF8_getc(
      str: Ptr[CUnsignedChar],
      len: CInt,
      `val`: Ptr[CUnsignedLongInt]
  ): CInt = extern

  /** */
  def UTF8_putc(
      str: Ptr[CUnsignedChar],
      len: CInt,
      value: CUnsignedLongInt
  ): CInt = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_BN(
      key: CString,
      buf: Ptr[CUnsignedChar],
      bsize: size_t,
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_double(
      key: CString,
      buf: Ptr[Double],
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_end(
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_int(
      key: CString,
      buf: Ptr[CInt],
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_int32(
      key: CString,
      buf: Ptr[int32_t],
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_int64(
      key: CString,
      buf: Ptr[int64_t],
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_long(
      key: CString,
      buf: Ptr[CLongInt],
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_octet_ptr(
      key: CString,
      buf: Ptr[Ptr[Byte]],
      bsize: size_t,
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_octet_string(
      key: CString,
      buf: Ptr[Byte],
      bsize: size_t,
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_size_t(
      key: CString,
      buf: Ptr[size_t],
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_time_t(
      key: CString,
      buf: Ptr[time_t],
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_uint(
      key: CString,
      buf: Ptr[CUnsignedInt],
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_uint32(
      key: CString,
      buf: Ptr[uint32_t],
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_uint64(
      key: CString,
      buf: Ptr[uint64_t],
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_ulong(
      key: CString,
      buf: Ptr[CUnsignedLongInt],
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_utf8_ptr(
      key: CString,
      buf: Ptr[CString],
      bsize: size_t,
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  private[openssl] def __sn_wrap_openssl_OSSL_PARAM_construct_utf8_string(
      key: CString,
      buf: CString,
      bsize: size_t,
      __return: Ptr[OSSL_PARAM]
  ): Unit = extern

  /** */
  def a2d_ASN1_OBJECT(
      out: Ptr[CUnsignedChar],
      olen: CInt,
      buf: CString,
      num: CInt
  ): CInt = extern

  /** */
  def a2i_ASN1_ENUMERATED(
      bp: Ptr[BIO],
      bs: Ptr[ASN1_ENUMERATED],
      buf: CString,
      size: CInt
  ): CInt = extern

  /** */
  def a2i_ASN1_INTEGER(
      bp: Ptr[BIO],
      bs: Ptr[ASN1_INTEGER],
      buf: CString,
      size: CInt
  ): CInt = extern

  /** */
  def a2i_ASN1_STRING(
      bp: Ptr[BIO],
      bs: Ptr[ASN1_STRING],
      buf: CString,
      size: CInt
  ): CInt = extern

  /** */
  def d2i_ASN1_BIT_STRING(
      a: Ptr[Ptr[ASN1_BIT_STRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_BIT_STRING] = extern

  /** */
  def d2i_ASN1_BMPSTRING(
      a: Ptr[Ptr[ASN1_BMPSTRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_BMPSTRING] = extern

  /** */
  def d2i_ASN1_ENUMERATED(
      a: Ptr[Ptr[ASN1_ENUMERATED]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_ENUMERATED] = extern

  /** */
  def d2i_ASN1_GENERALIZEDTIME(
      a: Ptr[Ptr[ASN1_GENERALIZEDTIME]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_GENERALIZEDTIME] = extern

  /** */
  def d2i_ASN1_GENERALSTRING(
      a: Ptr[Ptr[ASN1_GENERALSTRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_GENERALSTRING] = extern

  /** */
  def d2i_ASN1_IA5STRING(
      a: Ptr[Ptr[ASN1_IA5STRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_IA5STRING] = extern

  /** */
  def d2i_ASN1_INTEGER(
      a: Ptr[Ptr[ASN1_INTEGER]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_INTEGER] = extern

  /** */
  def d2i_ASN1_NULL(
      a: Ptr[Ptr[ASN1_NULL]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_NULL] = extern

  /** */
  def d2i_ASN1_OBJECT(
      a: Ptr[Ptr[ASN1_OBJECT]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_OBJECT] = extern

  /** */
  def d2i_ASN1_OCTET_STRING(
      a: Ptr[Ptr[ASN1_OCTET_STRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_OCTET_STRING] = extern

  /** */
  def d2i_ASN1_PRINTABLE(
      a: Ptr[Ptr[ASN1_STRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_STRING] = extern

  /** */
  def d2i_ASN1_PRINTABLESTRING(
      a: Ptr[Ptr[ASN1_PRINTABLESTRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_PRINTABLESTRING] = extern

  /** */
  def d2i_ASN1_SEQUENCE_ANY(
      a: Ptr[Ptr[ASN1_SEQUENCE_ANY]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_SEQUENCE_ANY] = extern

  /** */
  def d2i_ASN1_SET_ANY(
      a: Ptr[Ptr[ASN1_SEQUENCE_ANY]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_SEQUENCE_ANY] = extern

  /** */
  def d2i_ASN1_T61STRING(
      a: Ptr[Ptr[ASN1_T61STRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_T61STRING] = extern

  /** */
  def d2i_ASN1_TIME(
      a: Ptr[Ptr[ASN1_TIME]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_TIME] = extern

  /** */
  def d2i_ASN1_TYPE(
      a: Ptr[Ptr[ASN1_TYPE]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_TYPE] = extern

  /** */
  def d2i_ASN1_UINTEGER(
      a: Ptr[Ptr[ASN1_INTEGER]],
      pp: Ptr[Ptr[CUnsignedChar]],
      length: CLongInt
  ): Ptr[ASN1_INTEGER] = extern

  /** */
  def d2i_ASN1_UNIVERSALSTRING(
      a: Ptr[Ptr[ASN1_UNIVERSALSTRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_UNIVERSALSTRING] = extern

  /** */
  def d2i_ASN1_UTCTIME(
      a: Ptr[Ptr[ASN1_UTCTIME]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_UTCTIME] = extern

  /** */
  def d2i_ASN1_UTF8STRING(
      a: Ptr[Ptr[ASN1_UTF8STRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_UTF8STRING] = extern

  /** */
  def d2i_ASN1_VISIBLESTRING(
      a: Ptr[Ptr[ASN1_VISIBLESTRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_VISIBLESTRING] = extern

  /** */
  def d2i_AutoPrivateKey(
      a: Ptr[Ptr[EVP_PKEY]],
      pp: Ptr[Ptr[CUnsignedChar]],
      length: CLongInt
  ): Ptr[EVP_PKEY] = extern

  /** */
  def d2i_AutoPrivateKey_ex(
      a: Ptr[Ptr[EVP_PKEY]],
      pp: Ptr[Ptr[CUnsignedChar]],
      length: CLongInt,
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): Ptr[EVP_PKEY] = extern

  /** */
  def d2i_DIRECTORYSTRING(
      a: Ptr[Ptr[ASN1_STRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_STRING] = extern

  /** */
  def d2i_DISPLAYTEXT(
      a: Ptr[Ptr[ASN1_STRING]],
      in: Ptr[Ptr[CUnsignedChar]],
      len: CLongInt
  ): Ptr[ASN1_STRING] = extern

  /** */
  def d2i_KeyParams(
      `type`: CInt,
      a: Ptr[Ptr[EVP_PKEY]],
      pp: Ptr[Ptr[CUnsignedChar]],
      length: CLongInt
  ): Ptr[EVP_PKEY] = extern

  /** */
  def d2i_KeyParams_bio(
      `type`: CInt,
      a: Ptr[Ptr[EVP_PKEY]],
      in: Ptr[BIO]
  ): Ptr[EVP_PKEY] = extern

  /** */
  def d2i_PrivateKey(
      `type`: CInt,
      a: Ptr[Ptr[EVP_PKEY]],
      pp: Ptr[Ptr[CUnsignedChar]],
      length: CLongInt
  ): Ptr[EVP_PKEY] = extern

  /** */
  def d2i_PrivateKey_ex(
      `type`: CInt,
      a: Ptr[Ptr[EVP_PKEY]],
      pp: Ptr[Ptr[CUnsignedChar]],
      length: CLongInt,
      libctx: Ptr[OSSL_LIB_CTX],
      propq: CString
  ): Ptr[EVP_PKEY] = extern

  /** */
  def d2i_PublicKey(
      `type`: CInt,
      a: Ptr[Ptr[EVP_PKEY]],
      pp: Ptr[Ptr[CUnsignedChar]],
      length: CLongInt
  ): Ptr[EVP_PKEY] = extern

  /** */
  def i2a_ASN1_ENUMERATED(bp: Ptr[BIO], a: Ptr[ASN1_ENUMERATED]): CInt = extern

  /** */
  def i2a_ASN1_INTEGER(bp: Ptr[BIO], a: Ptr[ASN1_INTEGER]): CInt = extern

  /** */
  def i2a_ASN1_OBJECT(bp: Ptr[BIO], a: Ptr[ASN1_OBJECT]): CInt = extern

  /** */
  def i2a_ASN1_STRING(bp: Ptr[BIO], a: Ptr[ASN1_STRING], `type`: CInt): CInt =
    extern

  /** */
  def i2d_ASN1_BIT_STRING(
      a: Ptr[ASN1_BIT_STRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_BMPSTRING(
      a: Ptr[ASN1_BMPSTRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_ENUMERATED(
      a: Ptr[ASN1_ENUMERATED],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_GENERALIZEDTIME(
      a: Ptr[ASN1_GENERALIZEDTIME],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_GENERALSTRING(
      a: Ptr[ASN1_GENERALSTRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_IA5STRING(
      a: Ptr[ASN1_IA5STRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_INTEGER(
      a: Ptr[ASN1_INTEGER],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_NULL(a: Ptr[ASN1_NULL], out: Ptr[Ptr[CUnsignedChar]]): CInt =
    extern

  /** */
  def i2d_ASN1_OBJECT(a: Ptr[ASN1_OBJECT], out: Ptr[Ptr[CUnsignedChar]]): CInt =
    extern

  /** */
  def i2d_ASN1_OCTET_STRING(
      a: Ptr[ASN1_OCTET_STRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_PRINTABLE(
      a: Ptr[ASN1_STRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_PRINTABLESTRING(
      a: Ptr[ASN1_PRINTABLESTRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_SEQUENCE_ANY(
      a: Ptr[ASN1_SEQUENCE_ANY],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_SET_ANY(
      a: Ptr[ASN1_SEQUENCE_ANY],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_T61STRING(
      a: Ptr[ASN1_T61STRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_TIME(a: Ptr[ASN1_TIME], out: Ptr[Ptr[CUnsignedChar]]): CInt =
    extern

  /** */
  def i2d_ASN1_TYPE(a: Ptr[ASN1_TYPE], out: Ptr[Ptr[CUnsignedChar]]): CInt =
    extern

  /** */
  def i2d_ASN1_UNIVERSALSTRING(
      a: Ptr[ASN1_UNIVERSALSTRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_UTCTIME(
      a: Ptr[ASN1_UTCTIME],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_UTF8STRING(
      a: Ptr[ASN1_UTF8STRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_VISIBLESTRING(
      a: Ptr[ASN1_VISIBLESTRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_ASN1_bio_stream(
      out: Ptr[BIO],
      `val`: Ptr[ASN1_VALUE],
      in: Ptr[BIO],
      flags: CInt,
      it: Ptr[ASN1_ITEM]
  ): CInt = extern

  /** */
  def i2d_DIRECTORYSTRING(
      a: Ptr[ASN1_STRING],
      out: Ptr[Ptr[CUnsignedChar]]
  ): CInt = extern

  /** */
  def i2d_DISPLAYTEXT(a: Ptr[ASN1_STRING], out: Ptr[Ptr[CUnsignedChar]]): CInt =
    extern

  /** */
  def i2d_KeyParams(a: Ptr[EVP_PKEY], pp: Ptr[Ptr[CUnsignedChar]]): CInt =
    extern

  /** */
  def i2d_KeyParams_bio(bp: Ptr[BIO], pkey: Ptr[EVP_PKEY]): CInt = extern

  /** */
  def i2d_PrivateKey(a: Ptr[EVP_PKEY], pp: Ptr[Ptr[CUnsignedChar]]): CInt =
    extern

  /** */
  def i2d_PublicKey(a: Ptr[EVP_PKEY], pp: Ptr[Ptr[CUnsignedChar]]): CInt =
    extern

  /** */
  def i2t_ASN1_OBJECT(buf: CString, buf_len: CInt, a: Ptr[ASN1_OBJECT]): CInt =
    extern

  /** */
  def ossl_check_ASN1_GENERALSTRING_compfunc_type(
      cmp: sk_ASN1_GENERALSTRING_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def ossl_check_ASN1_GENERALSTRING_copyfunc_type(
      cpy: sk_ASN1_GENERALSTRING_copyfunc
  ): OPENSSL_sk_copyfunc = extern

  /** */
  def ossl_check_ASN1_GENERALSTRING_freefunc_type(
      fr: sk_ASN1_GENERALSTRING_freefunc
  ): OPENSSL_sk_freefunc = extern

  /** */
  def ossl_check_ASN1_GENERALSTRING_sk_type(
      sk: Ptr[stack_st_ASN1_GENERALSTRING]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_ASN1_GENERALSTRING_type(
      ptr: Ptr[ASN1_GENERALSTRING]
  ): Ptr[ASN1_GENERALSTRING] = extern

  /** */
  def ossl_check_ASN1_INTEGER_compfunc_type(
      cmp: sk_ASN1_INTEGER_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def ossl_check_ASN1_INTEGER_copyfunc_type(
      cpy: sk_ASN1_INTEGER_copyfunc
  ): OPENSSL_sk_copyfunc = extern

  /** */
  def ossl_check_ASN1_INTEGER_freefunc_type(
      fr: sk_ASN1_INTEGER_freefunc
  ): OPENSSL_sk_freefunc = extern

  /** */
  def ossl_check_ASN1_INTEGER_sk_type(
      sk: Ptr[stack_st_ASN1_INTEGER]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_ASN1_INTEGER_type(ptr: Ptr[ASN1_INTEGER]): Ptr[ASN1_INTEGER] =
    extern

  /** */
  def ossl_check_ASN1_OBJECT_compfunc_type(
      cmp: sk_ASN1_OBJECT_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def ossl_check_ASN1_OBJECT_copyfunc_type(
      cpy: sk_ASN1_OBJECT_copyfunc
  ): OPENSSL_sk_copyfunc = extern

  /** */
  def ossl_check_ASN1_OBJECT_freefunc_type(
      fr: sk_ASN1_OBJECT_freefunc
  ): OPENSSL_sk_freefunc = extern

  /** */
  def ossl_check_ASN1_OBJECT_sk_type(
      sk: Ptr[stack_st_ASN1_OBJECT]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_ASN1_OBJECT_type(ptr: Ptr[ASN1_OBJECT]): Ptr[ASN1_OBJECT] =
    extern

  /** */
  def ossl_check_ASN1_STRING_TABLE_compfunc_type(
      cmp: sk_ASN1_STRING_TABLE_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def ossl_check_ASN1_STRING_TABLE_copyfunc_type(
      cpy: sk_ASN1_STRING_TABLE_copyfunc
  ): OPENSSL_sk_copyfunc = extern

  /** */
  def ossl_check_ASN1_STRING_TABLE_freefunc_type(
      fr: sk_ASN1_STRING_TABLE_freefunc
  ): OPENSSL_sk_freefunc = extern

  /** */
  def ossl_check_ASN1_STRING_TABLE_sk_type(
      sk: Ptr[stack_st_ASN1_STRING_TABLE]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_ASN1_STRING_TABLE_type(
      ptr: Ptr[ASN1_STRING_TABLE]
  ): Ptr[ASN1_STRING_TABLE] = extern

  /** */
  def ossl_check_ASN1_TYPE_compfunc_type(
      cmp: sk_ASN1_TYPE_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def ossl_check_ASN1_TYPE_copyfunc_type(
      cpy: sk_ASN1_TYPE_copyfunc
  ): OPENSSL_sk_copyfunc = extern

  /** */
  def ossl_check_ASN1_TYPE_freefunc_type(
      fr: sk_ASN1_TYPE_freefunc
  ): OPENSSL_sk_freefunc = extern

  /** */
  def ossl_check_ASN1_TYPE_sk_type(
      sk: Ptr[stack_st_ASN1_TYPE]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_ASN1_TYPE_type(ptr: Ptr[ASN1_TYPE]): Ptr[ASN1_TYPE] = extern

  /** */
  def ossl_check_ASN1_UTF8STRING_compfunc_type(
      cmp: sk_ASN1_UTF8STRING_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def ossl_check_ASN1_UTF8STRING_copyfunc_type(
      cpy: sk_ASN1_UTF8STRING_copyfunc
  ): OPENSSL_sk_copyfunc = extern

  /** */
  def ossl_check_ASN1_UTF8STRING_freefunc_type(
      fr: sk_ASN1_UTF8STRING_freefunc
  ): OPENSSL_sk_freefunc = extern

  /** */
  def ossl_check_ASN1_UTF8STRING_sk_type(
      sk: Ptr[stack_st_ASN1_UTF8STRING]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_ASN1_UTF8STRING_type(
      ptr: Ptr[ASN1_UTF8STRING]
  ): Ptr[ASN1_UTF8STRING] = extern

  /** */
  def ossl_check_BIO_compfunc_type(cmp: sk_BIO_compfunc): OPENSSL_sk_compfunc =
    extern

  /** */
  def ossl_check_BIO_copyfunc_type(cpy: sk_BIO_copyfunc): OPENSSL_sk_copyfunc =
    extern

  /** */
  def ossl_check_BIO_freefunc_type(fr: sk_BIO_freefunc): OPENSSL_sk_freefunc =
    extern

  /** */
  def ossl_check_BIO_sk_type(sk: Ptr[stack_st_BIO]): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_BIO_type(ptr: Ptr[BIO]): Ptr[BIO] = extern

  /** */
  def ossl_check_OPENSSL_BLOCK_compfunc_type(
      cmp: sk_OPENSSL_BLOCK_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def ossl_check_OPENSSL_BLOCK_copyfunc_type(
      cpy: sk_OPENSSL_BLOCK_copyfunc
  ): OPENSSL_sk_copyfunc = extern

  /** */
  def ossl_check_OPENSSL_BLOCK_freefunc_type(
      fr: sk_OPENSSL_BLOCK_freefunc
  ): OPENSSL_sk_freefunc = extern

  /** */
  def ossl_check_OPENSSL_BLOCK_sk_type(
      sk: Ptr[stack_st_OPENSSL_BLOCK]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_OPENSSL_BLOCK_type(ptr: Ptr[Byte]): Ptr[Byte] = extern

  /** */
  def ossl_check_OPENSSL_CSTRING_compfunc_type(
      cmp: sk_OPENSSL_CSTRING_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def ossl_check_OPENSSL_CSTRING_copyfunc_type(
      cpy: sk_OPENSSL_CSTRING_copyfunc
  ): OPENSSL_sk_copyfunc = extern

  /** */
  def ossl_check_OPENSSL_CSTRING_freefunc_type(
      fr: sk_OPENSSL_CSTRING_freefunc
  ): OPENSSL_sk_freefunc = extern

  /** */
  def ossl_check_OPENSSL_CSTRING_sk_type(
      sk: Ptr[stack_st_OPENSSL_CSTRING]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_OPENSSL_CSTRING_type(ptr: CString): CString = extern

  /** */
  def ossl_check_OPENSSL_STRING_compfunc_type(
      cmp: sk_OPENSSL_STRING_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def ossl_check_OPENSSL_STRING_copyfunc_type(
      cpy: sk_OPENSSL_STRING_copyfunc
  ): OPENSSL_sk_copyfunc = extern

  /** */
  def ossl_check_OPENSSL_STRING_freefunc_type(
      fr: sk_OPENSSL_STRING_freefunc
  ): OPENSSL_sk_freefunc = extern

  /** */
  def ossl_check_OPENSSL_STRING_sk_type(
      sk: Ptr[stack_st_OPENSSL_STRING]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_OPENSSL_STRING_type(ptr: CString): CString = extern

  /** */
  def ossl_check_X509_ALGOR_compfunc_type(
      cmp: sk_X509_ALGOR_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def ossl_check_X509_ALGOR_copyfunc_type(
      cpy: sk_X509_ALGOR_copyfunc
  ): OPENSSL_sk_copyfunc = extern

  /** */
  def ossl_check_X509_ALGOR_freefunc_type(
      fr: sk_X509_ALGOR_freefunc
  ): OPENSSL_sk_freefunc = extern

  /** */
  def ossl_check_X509_ALGOR_sk_type(
      sk: Ptr[stack_st_X509_ALGOR]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_X509_ALGOR_type(ptr: Ptr[X509_ALGOR]): Ptr[X509_ALGOR] = extern

  /** */
  def ossl_check_const_ASN1_GENERALSTRING_sk_type(
      sk: Ptr[stack_st_ASN1_GENERALSTRING]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_const_ASN1_INTEGER_sk_type(
      sk: Ptr[stack_st_ASN1_INTEGER]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_const_ASN1_OBJECT_sk_type(
      sk: Ptr[stack_st_ASN1_OBJECT]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_const_ASN1_STRING_TABLE_sk_type(
      sk: Ptr[stack_st_ASN1_STRING_TABLE]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_const_ASN1_TYPE_sk_type(
      sk: Ptr[stack_st_ASN1_TYPE]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_const_ASN1_UTF8STRING_sk_type(
      sk: Ptr[stack_st_ASN1_UTF8STRING]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_const_BIO_sk_type(sk: Ptr[stack_st_BIO]): Ptr[OPENSSL_STACK] =
    extern

  /** */
  def ossl_check_const_OPENSSL_BLOCK_sk_type(
      sk: Ptr[stack_st_OPENSSL_BLOCK]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_const_OPENSSL_CSTRING_sk_type(
      sk: Ptr[stack_st_OPENSSL_CSTRING]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_const_OPENSSL_STRING_sk_type(
      sk: Ptr[stack_st_OPENSSL_STRING]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_const_X509_ALGOR_sk_type(
      sk: Ptr[stack_st_X509_ALGOR]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_const_void_sk_type(
      sk: Ptr[stack_st_void]
  ): Ptr[OPENSSL_STACK] = extern

  /** */
  def ossl_check_void_compfunc_type(
      cmp: sk_void_compfunc
  ): OPENSSL_sk_compfunc = extern

  /** */
  def ossl_check_void_copyfunc_type(
      cpy: sk_void_copyfunc
  ): OPENSSL_sk_copyfunc = extern

  /** */
  def ossl_check_void_freefunc_type(fr: sk_void_freefunc): OPENSSL_sk_freefunc =
    extern

  /** */
  def ossl_check_void_sk_type(sk: Ptr[stack_st_void]): Ptr[OPENSSL_STACK] =
    extern

  /** */
  def ossl_check_void_type(ptr: Ptr[Byte]): Ptr[Byte] = extern
end extern_functions

object functions:
  import _root_.openssl.enumerations.*
  import _root_.openssl.predef.*
  import _root_.openssl.aliases.*
  import _root_.openssl.structs.*
  import _root_.openssl.unions.*
  import extern_functions.*
  export extern_functions.*

  /** */
  def OSSL_PARAM_construct_BN(
      key: CString,
      buf: Ptr[CUnsignedChar],
      bsize: size_t
  )(using Zone): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_BN(key, buf, bsize, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_BN(
      key: CString,
      buf: Ptr[CUnsignedChar],
      bsize: size_t
  )(__return: Ptr[OSSL_PARAM]): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_BN(key, buf, bsize, __return)

  /** */
  def OSSL_PARAM_construct_double(key: CString, buf: Ptr[Double])(using
      Zone
  ): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_double(key, buf, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_double(key: CString, buf: Ptr[Double])(
      __return: Ptr[OSSL_PARAM]
  ): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_double(key, buf, __return)

  /** */
  def OSSL_PARAM_construct_end()(using Zone): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_end((__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_end()(__return: Ptr[OSSL_PARAM]): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_end(__return)

  /** */
  def OSSL_PARAM_construct_int(key: CString, buf: Ptr[CInt])(
      __return: Ptr[OSSL_PARAM]
  ): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_int(key, buf, __return)

  /** */
  def OSSL_PARAM_construct_int(key: CString, buf: Ptr[CInt])(using
      Zone
  ): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_int(key, buf, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_int32(key: CString, buf: Ptr[int32_t])(
      __return: Ptr[OSSL_PARAM]
  ): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_int32(key, buf, __return)

  /** */
  def OSSL_PARAM_construct_int32(key: CString, buf: Ptr[int32_t])(using
      Zone
  ): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_int32(key, buf, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_int64(key: CString, buf: Ptr[int64_t])(
      __return: Ptr[OSSL_PARAM]
  ): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_int64(key, buf, __return)

  /** */
  def OSSL_PARAM_construct_int64(key: CString, buf: Ptr[int64_t])(using
      Zone
  ): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_int64(key, buf, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_long(key: CString, buf: Ptr[CLongInt])(
      __return: Ptr[OSSL_PARAM]
  ): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_long(key, buf, __return)

  /** */
  def OSSL_PARAM_construct_long(key: CString, buf: Ptr[CLongInt])(using
      Zone
  ): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_long(key, buf, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_octet_ptr(
      key: CString,
      buf: Ptr[Ptr[Byte]],
      bsize: size_t
  )(__return: Ptr[OSSL_PARAM]): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_octet_ptr(key, buf, bsize, __return)

  /** */
  def OSSL_PARAM_construct_octet_ptr(
      key: CString,
      buf: Ptr[Ptr[Byte]],
      bsize: size_t
  )(using Zone): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_octet_ptr(
      key,
      buf,
      bsize,
      (__ptr_0 + 0)
    )
    !(__ptr_0 + 0)
  end OSSL_PARAM_construct_octet_ptr

  /** */
  def OSSL_PARAM_construct_octet_string(
      key: CString,
      buf: Ptr[Byte],
      bsize: size_t
  )(using Zone): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_octet_string(
      key,
      buf,
      bsize,
      (__ptr_0 + 0)
    )
    !(__ptr_0 + 0)
  end OSSL_PARAM_construct_octet_string

  /** */
  def OSSL_PARAM_construct_octet_string(
      key: CString,
      buf: Ptr[Byte],
      bsize: size_t
  )(__return: Ptr[OSSL_PARAM]): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_octet_string(
      key,
      buf,
      bsize,
      __return
    )

  /** */
  def OSSL_PARAM_construct_size_t(key: CString, buf: Ptr[size_t])(using
      Zone
  ): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_size_t(key, buf, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_size_t(key: CString, buf: Ptr[size_t])(
      __return: Ptr[OSSL_PARAM]
  ): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_size_t(key, buf, __return)

  /** */
  def OSSL_PARAM_construct_time_t(key: CString, buf: Ptr[time_t])(using
      Zone
  ): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_time_t(key, buf, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_time_t(key: CString, buf: Ptr[time_t])(
      __return: Ptr[OSSL_PARAM]
  ): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_time_t(key, buf, __return)

  /** */
  def OSSL_PARAM_construct_uint(key: CString, buf: Ptr[CUnsignedInt])(
      __return: Ptr[OSSL_PARAM]
  ): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_uint(key, buf, __return)

  /** */
  def OSSL_PARAM_construct_uint(key: CString, buf: Ptr[CUnsignedInt])(using
      Zone
  ): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_uint(key, buf, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_uint32(key: CString, buf: Ptr[uint32_t])(using
      Zone
  ): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_uint32(key, buf, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_uint32(key: CString, buf: Ptr[uint32_t])(
      __return: Ptr[OSSL_PARAM]
  ): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_uint32(key, buf, __return)

  /** */
  def OSSL_PARAM_construct_uint64(key: CString, buf: Ptr[uint64_t])(
      __return: Ptr[OSSL_PARAM]
  ): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_uint64(key, buf, __return)

  /** */
  def OSSL_PARAM_construct_uint64(key: CString, buf: Ptr[uint64_t])(using
      Zone
  ): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_uint64(key, buf, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_ulong(key: CString, buf: Ptr[CUnsignedLongInt])(
      __return: Ptr[OSSL_PARAM]
  ): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_ulong(key, buf, __return)

  /** */
  def OSSL_PARAM_construct_ulong(key: CString, buf: Ptr[CUnsignedLongInt])(using
      Zone
  ): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_ulong(key, buf, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** */
  def OSSL_PARAM_construct_utf8_ptr(
      key: CString,
      buf: Ptr[CString],
      bsize: size_t
  )(__return: Ptr[OSSL_PARAM]): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_utf8_ptr(key, buf, bsize, __return)

  /** */
  def OSSL_PARAM_construct_utf8_ptr(
      key: CString,
      buf: Ptr[CString],
      bsize: size_t
  )(using Zone): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_utf8_ptr(
      key,
      buf,
      bsize,
      (__ptr_0 + 0)
    )
    !(__ptr_0 + 0)
  end OSSL_PARAM_construct_utf8_ptr

  /** */
  def OSSL_PARAM_construct_utf8_string(
      key: CString,
      buf: CString,
      bsize: size_t
  )(__return: Ptr[OSSL_PARAM]): Unit =
    __sn_wrap_openssl_OSSL_PARAM_construct_utf8_string(
      key,
      buf,
      bsize,
      __return
    )

  /** */
  def OSSL_PARAM_construct_utf8_string(
      key: CString,
      buf: CString,
      bsize: size_t
  )(using Zone): OSSL_PARAM =
    val __ptr_0: Ptr[OSSL_PARAM] = alloc[OSSL_PARAM](1)
    __sn_wrap_openssl_OSSL_PARAM_construct_utf8_string(
      key,
      buf,
      bsize,
      (__ptr_0 + 0)
    )
    !(__ptr_0 + 0)
  end OSSL_PARAM_construct_utf8_string
end functions

object types:
  export _root_.openssl.structs.*
  export _root_.openssl.aliases.*
  export _root_.openssl.unions.*
  export _root_.openssl.enumerations.*

object all:
  export _root_.openssl.enumerations.BIO_hostserv_priorities
  export _root_.openssl.enumerations.BIO_lookup_type
  export _root_.openssl.enumerations.BIO_sock_info_type
  export _root_.openssl.aliases.ASN1_BOOLEAN
  export _root_.openssl.aliases.ASN1_ITEM_EXP
  export _root_.openssl.aliases.ASN1_NULL
  export _root_.openssl.aliases.BIO_callback_fn
  export _root_.openssl.aliases.BIO_callback_fn_ex
  export _root_.openssl.aliases.BIO_dgram_sctp_notification_handler_fn
  export _root_.openssl.aliases.BIO_info_cb
  export _root_.openssl.aliases.CRYPTO_EX_dup
  export _root_.openssl.aliases.CRYPTO_EX_free
  export _root_.openssl.aliases.CRYPTO_EX_new
  export _root_.openssl.aliases.CRYPTO_ONCE
  export _root_.openssl.aliases.CRYPTO_RWLOCK
  export _root_.openssl.aliases.CRYPTO_THREAD_ID
  export _root_.openssl.aliases.CRYPTO_THREAD_LOCAL
  export _root_.openssl.aliases.CRYPTO_free_fn
  export _root_.openssl.aliases.CRYPTO_malloc_fn
  export _root_.openssl.aliases.CRYPTO_realloc_fn
  export _root_.openssl.aliases.EVP_PBE_KEYGEN
  export _root_.openssl.aliases.EVP_PBE_KEYGEN_EX
  export _root_.openssl.aliases.EVP_PKEY_gen_cb
  export _root_.openssl.aliases.FILE
  export _root_.openssl.aliases.OPENSSL_BLOCK
  export _root_.openssl.aliases.OPENSSL_CSTRING
  export _root_.openssl.aliases.OPENSSL_STRING
  export _root_.openssl.aliases.OPENSSL_sk_compfunc
  export _root_.openssl.aliases.OPENSSL_sk_copyfunc
  export _root_.openssl.aliases.OPENSSL_sk_freefunc
  export _root_.openssl.aliases.OSSL_CALLBACK
  export _root_.openssl.aliases.OSSL_FUNC_BIO_ctrl_fn
  export _root_.openssl.aliases.OSSL_FUNC_BIO_free_fn
  export _root_.openssl.aliases.OSSL_FUNC_BIO_gets_fn
  export _root_.openssl.aliases.OSSL_FUNC_BIO_new_file_fn
  export _root_.openssl.aliases.OSSL_FUNC_BIO_new_membuf_fn
  export _root_.openssl.aliases.OSSL_FUNC_BIO_puts_fn
  export _root_.openssl.aliases.OSSL_FUNC_BIO_read_ex_fn
  export _root_.openssl.aliases.OSSL_FUNC_BIO_up_ref_fn
  export _root_.openssl.aliases.OSSL_FUNC_BIO_vprintf_fn
  export _root_.openssl.aliases.OSSL_FUNC_BIO_vsnprintf_fn
  export _root_.openssl.aliases.OSSL_FUNC_BIO_write_ex_fn
  export _root_.openssl.aliases.OSSL_FUNC_CRYPTO_clear_free_fn
  export _root_.openssl.aliases.OSSL_FUNC_CRYPTO_clear_realloc_fn
  export _root_.openssl.aliases.OSSL_FUNC_CRYPTO_free_fn
  export _root_.openssl.aliases.OSSL_FUNC_CRYPTO_malloc_fn
  export _root_.openssl.aliases.OSSL_FUNC_CRYPTO_realloc_fn
  export _root_.openssl.aliases.OSSL_FUNC_CRYPTO_secure_allocated_fn
  export _root_.openssl.aliases.OSSL_FUNC_CRYPTO_secure_clear_free_fn
  export _root_.openssl.aliases.OSSL_FUNC_CRYPTO_secure_free_fn
  export _root_.openssl.aliases.OSSL_FUNC_CRYPTO_secure_malloc_fn
  export _root_.openssl.aliases.OSSL_FUNC_CRYPTO_secure_zalloc_fn
  export _root_.openssl.aliases.OSSL_FUNC_CRYPTO_zalloc_fn
  export _root_.openssl.aliases.OSSL_FUNC_OPENSSL_cleanse_fn
  export _root_.openssl.aliases.OSSL_FUNC_asym_cipher_decrypt_fn
  export _root_.openssl.aliases.OSSL_FUNC_asym_cipher_decrypt_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_asym_cipher_dupctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_asym_cipher_encrypt_fn
  export _root_.openssl.aliases.OSSL_FUNC_asym_cipher_encrypt_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_asym_cipher_freectx_fn
  export _root_.openssl.aliases.OSSL_FUNC_asym_cipher_get_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_asym_cipher_gettable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_asym_cipher_newctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_asym_cipher_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_asym_cipher_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_cipher_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_decrypt_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_dupctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_encrypt_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_final_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_freectx_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_get_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_get_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_gettable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_gettable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_newctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_cipher_update_fn
  export _root_.openssl.aliases.OSSL_FUNC_cleanup_entropy_fn
  export _root_.openssl.aliases.OSSL_FUNC_cleanup_nonce_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_clear_last_error_mark_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_get_libctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_get_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_gettable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_new_error_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_obj_add_sigid_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_obj_create_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_pop_error_to_mark_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_set_error_debug_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_set_error_mark_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_thread_start_fn
  export _root_.openssl.aliases.OSSL_FUNC_core_vset_error_fn
  export _root_.openssl.aliases.OSSL_FUNC_decoder_decode_fn
  export _root_.openssl.aliases.OSSL_FUNC_decoder_does_selection_fn
  export _root_.openssl.aliases.OSSL_FUNC_decoder_export_object_fn
  export _root_.openssl.aliases.OSSL_FUNC_decoder_freectx_fn
  export _root_.openssl.aliases.OSSL_FUNC_decoder_get_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_decoder_gettable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_decoder_newctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_decoder_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_decoder_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_digest_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_dupctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_final_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_freectx_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_get_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_get_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_gettable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_gettable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_newctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_digest_update_fn
  export _root_.openssl.aliases.OSSL_FUNC_encoder_does_selection_fn
  export _root_.openssl.aliases.OSSL_FUNC_encoder_encode_fn
  export _root_.openssl.aliases.OSSL_FUNC_encoder_free_object_fn
  export _root_.openssl.aliases.OSSL_FUNC_encoder_freectx_fn
  export _root_.openssl.aliases.OSSL_FUNC_encoder_get_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_encoder_gettable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_encoder_import_object_fn
  export _root_.openssl.aliases.OSSL_FUNC_encoder_newctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_encoder_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_encoder_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_get_entropy_fn
  export _root_.openssl.aliases.OSSL_FUNC_get_nonce_fn
  export _root_.openssl.aliases.OSSL_FUNC_kdf_derive_fn
  export _root_.openssl.aliases.OSSL_FUNC_kdf_dupctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_kdf_freectx_fn
  export _root_.openssl.aliases.OSSL_FUNC_kdf_get_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_kdf_get_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_kdf_gettable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_kdf_gettable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_kdf_newctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_kdf_reset_fn
  export _root_.openssl.aliases.OSSL_FUNC_kdf_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_kdf_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_kem_decapsulate_fn
  export _root_.openssl.aliases.OSSL_FUNC_kem_decapsulate_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_kem_dupctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_kem_encapsulate_fn
  export _root_.openssl.aliases.OSSL_FUNC_kem_encapsulate_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_kem_freectx_fn
  export _root_.openssl.aliases.OSSL_FUNC_kem_get_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_kem_gettable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_kem_newctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_kem_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_kem_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_keyexch_derive_fn
  export _root_.openssl.aliases.OSSL_FUNC_keyexch_dupctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_keyexch_freectx_fn
  export _root_.openssl.aliases.OSSL_FUNC_keyexch_get_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_keyexch_gettable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_keyexch_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_keyexch_newctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_keyexch_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_keyexch_set_peer_fn
  export _root_.openssl.aliases.OSSL_FUNC_keyexch_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_dup_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_export_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_export_types_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_free_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_gen_cleanup_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_gen_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_gen_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_gen_set_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_gen_set_template_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_gen_settable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_get_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_gettable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_has_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_import_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_import_types_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_load_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_match_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_new_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_query_operation_name_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_set_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_settable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_keymgmt_validate_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_dupctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_final_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_freectx_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_get_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_get_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_gettable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_gettable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_newctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_mac_update_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_deregister_child_cb_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_free_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_get0_dispatch_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_get0_provider_ctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_get_capabilities_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_get_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_get_reason_strings_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_gettable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_name_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_query_operation_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_register_child_cb_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_self_test_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_teardown_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_unquery_operation_fn
  export _root_.openssl.aliases.OSSL_FUNC_provider_up_ref_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_clear_seed_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_enable_locking_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_freectx_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_generate_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_get_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_get_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_get_seed_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_gettable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_gettable_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_instantiate_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_lock_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_newctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_nonce_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_reseed_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_set_callbacks_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_uninstantiate_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_unlock_fn
  export _root_.openssl.aliases.OSSL_FUNC_rand_verify_zeroization_fn
  export _root_.openssl.aliases.OSSL_FUNC_self_test_cb_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_digest_sign_final_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_digest_sign_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_digest_sign_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_digest_sign_update_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_digest_verify_final_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_digest_verify_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_digest_verify_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_digest_verify_update_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_dupctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_freectx_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_get_ctx_md_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_get_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_gettable_ctx_md_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_gettable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_newctx_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_set_ctx_md_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_settable_ctx_md_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_sign_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_sign_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_verify_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_verify_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_verify_recover_fn
  export _root_.openssl.aliases.OSSL_FUNC_signature_verify_recover_init_fn
  export _root_.openssl.aliases.OSSL_FUNC_store_attach_fn
  export _root_.openssl.aliases.OSSL_FUNC_store_close_fn
  export _root_.openssl.aliases.OSSL_FUNC_store_eof_fn
  export _root_.openssl.aliases.OSSL_FUNC_store_export_object_fn
  export _root_.openssl.aliases.OSSL_FUNC_store_load_fn
  export _root_.openssl.aliases.OSSL_FUNC_store_open_fn
  export _root_.openssl.aliases.OSSL_FUNC_store_set_ctx_params_fn
  export _root_.openssl.aliases.OSSL_FUNC_store_settable_ctx_params_fn
  export _root_.openssl.aliases.OSSL_INOUT_CALLBACK
  export _root_.openssl.aliases.OSSL_PASSPHRASE_CALLBACK
  export _root_.openssl.aliases.OSSL_provider_init_fn
  export _root_.openssl.aliases.OSSL_thread_stop_handler_fn
  export _root_.openssl.aliases.asn1_ps_func
  export _root_.openssl.aliases.bio_info_cb
  export _root_.openssl.aliases.d2i_of_void
  export _root_.openssl.aliases.i2d_of_void
  export _root_.openssl.aliases.int32_t
  export _root_.openssl.aliases.int64_t
  export _root_.openssl.aliases.intmax_t
  export _root_.openssl.aliases.ossl_intmax_t
  export _root_.openssl.aliases.ossl_uintmax_t
  export _root_.openssl.aliases.pem_password_cb
  export _root_.openssl.aliases.pthread_key_t
  export _root_.openssl.aliases.pthread_once_t
  export _root_.openssl.aliases.pthread_t
  export _root_.openssl.aliases.size_t
  export _root_.openssl.aliases.sk_ASN1_GENERALSTRING_compfunc
  export _root_.openssl.aliases.sk_ASN1_GENERALSTRING_copyfunc
  export _root_.openssl.aliases.sk_ASN1_GENERALSTRING_freefunc
  export _root_.openssl.aliases.sk_ASN1_INTEGER_compfunc
  export _root_.openssl.aliases.sk_ASN1_INTEGER_copyfunc
  export _root_.openssl.aliases.sk_ASN1_INTEGER_freefunc
  export _root_.openssl.aliases.sk_ASN1_OBJECT_compfunc
  export _root_.openssl.aliases.sk_ASN1_OBJECT_copyfunc
  export _root_.openssl.aliases.sk_ASN1_OBJECT_freefunc
  export _root_.openssl.aliases.sk_ASN1_STRING_TABLE_compfunc
  export _root_.openssl.aliases.sk_ASN1_STRING_TABLE_copyfunc
  export _root_.openssl.aliases.sk_ASN1_STRING_TABLE_freefunc
  export _root_.openssl.aliases.sk_ASN1_TYPE_compfunc
  export _root_.openssl.aliases.sk_ASN1_TYPE_copyfunc
  export _root_.openssl.aliases.sk_ASN1_TYPE_freefunc
  export _root_.openssl.aliases.sk_ASN1_UTF8STRING_compfunc
  export _root_.openssl.aliases.sk_ASN1_UTF8STRING_copyfunc
  export _root_.openssl.aliases.sk_ASN1_UTF8STRING_freefunc
  export _root_.openssl.aliases.sk_BIO_compfunc
  export _root_.openssl.aliases.sk_BIO_copyfunc
  export _root_.openssl.aliases.sk_BIO_freefunc
  export _root_.openssl.aliases.sk_OPENSSL_BLOCK_compfunc
  export _root_.openssl.aliases.sk_OPENSSL_BLOCK_copyfunc
  export _root_.openssl.aliases.sk_OPENSSL_BLOCK_freefunc
  export _root_.openssl.aliases.sk_OPENSSL_CSTRING_compfunc
  export _root_.openssl.aliases.sk_OPENSSL_CSTRING_copyfunc
  export _root_.openssl.aliases.sk_OPENSSL_CSTRING_freefunc
  export _root_.openssl.aliases.sk_OPENSSL_STRING_compfunc
  export _root_.openssl.aliases.sk_OPENSSL_STRING_copyfunc
  export _root_.openssl.aliases.sk_OPENSSL_STRING_freefunc
  export _root_.openssl.aliases.sk_X509_ALGOR_compfunc
  export _root_.openssl.aliases.sk_X509_ALGOR_copyfunc
  export _root_.openssl.aliases.sk_X509_ALGOR_freefunc
  export _root_.openssl.aliases.sk_void_compfunc
  export _root_.openssl.aliases.sk_void_copyfunc
  export _root_.openssl.aliases.sk_void_freefunc
  export _root_.openssl.aliases.time_t
  export _root_.openssl.aliases.tm
  export _root_.openssl.aliases.uint32_t
  export _root_.openssl.aliases.uint64_t
  export _root_.openssl.aliases.uintmax_t
  export _root_.openssl.aliases.va_list
  export _root_.openssl.structs.ASN1_BIT_STRING
  export _root_.openssl.structs.ASN1_BMPSTRING
  export _root_.openssl.structs.ASN1_ENCODING
  export _root_.openssl.structs.ASN1_ENCODING_st
  export _root_.openssl.structs.ASN1_ENUMERATED
  export _root_.openssl.structs.ASN1_GENERALIZEDTIME
  export _root_.openssl.structs.ASN1_GENERALSTRING
  export _root_.openssl.structs.ASN1_IA5STRING
  export _root_.openssl.structs.ASN1_INTEGER
  export _root_.openssl.structs.ASN1_ITEM
  export _root_.openssl.structs.ASN1_ITEM_st
  export _root_.openssl.structs.ASN1_OBJECT
  export _root_.openssl.structs.ASN1_OCTET_STRING
  export _root_.openssl.structs.ASN1_PCTX
  export _root_.openssl.structs.ASN1_PRINTABLESTRING
  export _root_.openssl.structs.ASN1_SCTX
  export _root_.openssl.structs.ASN1_SEQUENCE_ANY
  export _root_.openssl.structs.ASN1_STRING
  export _root_.openssl.structs.ASN1_STRING_TABLE
  export _root_.openssl.structs.ASN1_T61STRING
  export _root_.openssl.structs.ASN1_TEMPLATE
  export _root_.openssl.structs.ASN1_TEMPLATE_st
  export _root_.openssl.structs.ASN1_TIME
  export _root_.openssl.structs.ASN1_TLC
  export _root_.openssl.structs.ASN1_TLC_st
  export _root_.openssl.structs.ASN1_TYPE
  export _root_.openssl.structs.ASN1_UNIVERSALSTRING
  export _root_.openssl.structs.ASN1_UTCTIME
  export _root_.openssl.structs.ASN1_UTF8STRING
  export _root_.openssl.structs.ASN1_VALUE
  export _root_.openssl.structs.ASN1_VALUE_st
  export _root_.openssl.structs.ASN1_VISIBLESTRING
  export _root_.openssl.structs.AUTHORITY_KEYID
  export _root_.openssl.structs.AUTHORITY_KEYID_st
  export _root_.openssl.structs.BIGNUM
  export _root_.openssl.structs.BIO
  export _root_.openssl.structs.BIO_ADDRINFO
  export _root_.openssl.structs.BIO_METHOD
  export _root_.openssl.structs.BIT_STRING_BITNAME
  export _root_.openssl.structs.BIT_STRING_BITNAME_st
  export _root_.openssl.structs.BN_BLINDING
  export _root_.openssl.structs.BN_CTX
  export _root_.openssl.structs.BN_GENCB
  export _root_.openssl.structs.BN_MONT_CTX
  export _root_.openssl.structs.BN_RECP_CTX
  export _root_.openssl.structs.BUF_MEM
  export _root_.openssl.structs.COMP_CTX
  export _root_.openssl.structs.COMP_METHOD
  export _root_.openssl.structs.CONF
  export _root_.openssl.structs.CRYPTO_EX_DATA
  export _root_.openssl.structs.CRYPTO_THREADID
  export _root_.openssl.structs.CRYPTO_dynlock
  export _root_.openssl.structs.CTLOG
  export _root_.openssl.structs.CTLOG_STORE
  export _root_.openssl.structs.CT_POLICY_EVAL_CTX
  export _root_.openssl.structs.DH
  export _root_.openssl.structs.DH_METHOD
  export _root_.openssl.structs.DIST_POINT
  export _root_.openssl.structs.DIST_POINT_st
  export _root_.openssl.structs.DSA
  export _root_.openssl.structs.DSA_METHOD
  export _root_.openssl.structs.EC_KEY
  export _root_.openssl.structs.EC_KEY_METHOD
  export _root_.openssl.structs.ENGINE
  export _root_.openssl.structs.ERR_STATE
  export _root_.openssl.structs.EVP_ASYM_CIPHER
  export _root_.openssl.structs.EVP_CIPHER
  export _root_.openssl.structs.EVP_CIPHER_CTX
  export _root_.openssl.structs.EVP_CIPHER_INFO
  export _root_.openssl.structs.EVP_CTRL_TLS1_1_MULTIBLOCK_PARAM
  export _root_.openssl.structs.EVP_ENCODE_CTX
  export _root_.openssl.structs.EVP_KDF
  export _root_.openssl.structs.EVP_KDF_CTX
  export _root_.openssl.structs.EVP_KEM
  export _root_.openssl.structs.EVP_KEYEXCH
  export _root_.openssl.structs.EVP_KEYMGMT
  export _root_.openssl.structs.EVP_MAC
  export _root_.openssl.structs.EVP_MAC_CTX
  export _root_.openssl.structs.EVP_MD
  export _root_.openssl.structs.EVP_MD_CTX
  export _root_.openssl.structs.EVP_PKEY
  export _root_.openssl.structs.EVP_PKEY_ASN1_METHOD
  export _root_.openssl.structs.EVP_PKEY_CTX
  export _root_.openssl.structs.EVP_PKEY_METHOD
  export _root_.openssl.structs.EVP_RAND
  export _root_.openssl.structs.EVP_RAND_CTX
  export _root_.openssl.structs.EVP_SIGNATURE
  export _root_.openssl.structs.HMAC_CTX
  export _root_.openssl.structs.ISSUING_DIST_POINT
  export _root_.openssl.structs.ISSUING_DIST_POINT_st
  export _root_.openssl.structs.NAME_CONSTRAINTS
  export _root_.openssl.structs.NAME_CONSTRAINTS_st
  export _root_.openssl.structs.OBJ_NAME
  export _root_.openssl.structs.OCSP_RESPID
  export _root_.openssl.structs.OCSP_RESPONSE
  export _root_.openssl.structs.OPENSSL_CORE_CTX
  export _root_.openssl.structs.OPENSSL_INIT_SETTINGS
  export _root_.openssl.structs.OPENSSL_STACK
  export _root_.openssl.structs.OSSL_ALGORITHM
  export _root_.openssl.structs.OSSL_CORE_BIO
  export _root_.openssl.structs.OSSL_CORE_HANDLE
  export _root_.openssl.structs.OSSL_DECODER
  export _root_.openssl.structs.OSSL_DECODER_CTX
  export _root_.openssl.structs.OSSL_DISPATCH
  export _root_.openssl.structs.OSSL_ENCODER
  export _root_.openssl.structs.OSSL_ENCODER_CTX
  export _root_.openssl.structs.OSSL_HTTP_REQ_CTX
  export _root_.openssl.structs.OSSL_ITEM
  export _root_.openssl.structs.OSSL_LIB_CTX
  export _root_.openssl.structs.OSSL_PARAM
  export _root_.openssl.structs.OSSL_PARAM_BLD
  export _root_.openssl.structs.OSSL_PROVIDER
  export _root_.openssl.structs.OSSL_SELF_TEST
  export _root_.openssl.structs.OSSL_STORE_INFO
  export _root_.openssl.structs.OSSL_STORE_SEARCH
  export _root_.openssl.structs.PKCS8_PRIV_KEY_INFO
  export _root_.openssl.structs.RAND_DRBG
  export _root_.openssl.structs.RAND_METHOD
  export _root_.openssl.structs.RSA
  export _root_.openssl.structs.RSA_METHOD
  export _root_.openssl.structs.RSA_PSS_PARAMS
  export _root_.openssl.structs.SCT
  export _root_.openssl.structs.SCT_CTX
  export _root_.openssl.structs.SHA256_CTX
  export _root_.openssl.structs.SHA256state_st
  export _root_.openssl.structs.SHA512_CTX
  export _root_.openssl.structs.SHA512state_st
  export _root_.openssl.structs.SHA_CTX
  export _root_.openssl.structs.SHAstate_st
  export _root_.openssl.structs.SSL
  export _root_.openssl.structs.SSL_CTX
  export _root_.openssl.structs.SSL_DANE
  export _root_.openssl.structs.UI
  export _root_.openssl.structs.UI_METHOD
  export _root_.openssl.structs.X509
  export _root_.openssl.structs.X509V3_CTX
  export _root_.openssl.structs.X509_ALGOR
  export _root_.openssl.structs.X509_CRL
  export _root_.openssl.structs.X509_CRL_METHOD
  export _root_.openssl.structs.X509_LOOKUP
  export _root_.openssl.structs.X509_LOOKUP_METHOD
  export _root_.openssl.structs.X509_NAME
  export _root_.openssl.structs.X509_OBJECT
  export _root_.openssl.structs.X509_POLICY_CACHE
  export _root_.openssl.structs.X509_POLICY_CACHE_st
  export _root_.openssl.structs.X509_POLICY_LEVEL
  export _root_.openssl.structs.X509_POLICY_LEVEL_st
  export _root_.openssl.structs.X509_POLICY_NODE
  export _root_.openssl.structs.X509_POLICY_NODE_st
  export _root_.openssl.structs.X509_POLICY_TREE
  export _root_.openssl.structs.X509_POLICY_TREE_st
  export _root_.openssl.structs.X509_PUBKEY
  export _root_.openssl.structs.X509_REVOKED
  export _root_.openssl.structs.X509_SIG_INFO
  export _root_.openssl.structs.X509_STORE
  export _root_.openssl.structs.X509_STORE_CTX
  export _root_.openssl.structs.X509_VERIFY_PARAM
  export _root_.openssl.structs.X509_VERIFY_PARAM_st
  export _root_.openssl.structs.X509_algor_st
  export _root_.openssl.structs.X509_crl_st
  export _root_.openssl.structs.X509_name_st
  export _root_.openssl.structs.X509_pubkey_st
  export _root_.openssl.structs.asn1_object_st
  export _root_.openssl.structs.asn1_pctx_st
  export _root_.openssl.structs.asn1_sctx_st
  export _root_.openssl.structs.asn1_string_st
  export _root_.openssl.structs.asn1_string_table_st
  export _root_.openssl.structs.asn1_type_st
  export _root_.openssl.structs.bignum_ctx
  export _root_.openssl.structs.bignum_st
  export _root_.openssl.structs.bio_addrinfo_st
  export _root_.openssl.structs.bio_method_st
  export _root_.openssl.structs.bio_st
  export _root_.openssl.structs.bn_blinding_st
  export _root_.openssl.structs.bn_gencb_st
  export _root_.openssl.structs.bn_mont_ctx_st
  export _root_.openssl.structs.bn_recp_ctx_st
  export _root_.openssl.structs.buf_mem_st
  export _root_.openssl.structs.comp_ctx_st
  export _root_.openssl.structs.comp_method_st
  export _root_.openssl.structs.conf_st
  export _root_.openssl.structs.crypto_ex_data_st
  export _root_.openssl.structs.crypto_threadid_st
  export _root_.openssl.structs.ct_policy_eval_ctx_st
  export _root_.openssl.structs.ctlog_st
  export _root_.openssl.structs.ctlog_store_st
  export _root_.openssl.structs.dh_method
  export _root_.openssl.structs.dh_st
  export _root_.openssl.structs.dsa_method
  export _root_.openssl.structs.dsa_st
  export _root_.openssl.structs.ec_key_method_st
  export _root_.openssl.structs.ec_key_st
  export _root_.openssl.structs.engine_st
  export _root_.openssl.structs.err_state_st
  export _root_.openssl.structs.evp_Encode_Ctx_st
  export _root_.openssl.structs.evp_asym_cipher_st
  export _root_.openssl.structs.evp_cipher_ctx_st
  export _root_.openssl.structs.evp_cipher_info_st
  export _root_.openssl.structs.evp_cipher_st
  export _root_.openssl.structs.evp_kdf_ctx_st
  export _root_.openssl.structs.evp_kdf_st
  export _root_.openssl.structs.evp_kem_st
  export _root_.openssl.structs.evp_keyexch_st
  export _root_.openssl.structs.evp_keymgmt_st
  export _root_.openssl.structs.evp_mac_ctx_st
  export _root_.openssl.structs.evp_mac_st
  export _root_.openssl.structs.evp_md_ctx_st
  export _root_.openssl.structs.evp_md_st
  export _root_.openssl.structs.evp_pkey_asn1_method_st
  export _root_.openssl.structs.evp_pkey_ctx_st
  export _root_.openssl.structs.evp_pkey_method_st
  export _root_.openssl.structs.evp_pkey_st
  export _root_.openssl.structs.evp_rand_ctx_st
  export _root_.openssl.structs.evp_rand_st
  export _root_.openssl.structs.evp_signature_st
  export _root_.openssl.structs.hmac_ctx_st
  export _root_.openssl.structs.hostent
  export _root_.openssl.structs.obj_name_st
  export _root_.openssl.structs.ocsp_responder_id_st
  export _root_.openssl.structs.ocsp_response_st
  export _root_.openssl.structs.openssl_core_ctx_st
  export _root_.openssl.structs.ossl_algorithm_st
  export _root_.openssl.structs.ossl_core_bio_st
  export _root_.openssl.structs.ossl_core_handle_st
  export _root_.openssl.structs.ossl_decoder_ctx_st
  export _root_.openssl.structs.ossl_decoder_st
  export _root_.openssl.structs.ossl_dispatch_st
  export _root_.openssl.structs.ossl_encoder_ctx_st
  export _root_.openssl.structs.ossl_encoder_st
  export _root_.openssl.structs.ossl_http_req_ctx_st
  export _root_.openssl.structs.ossl_init_settings_st
  export _root_.openssl.structs.ossl_item_st
  export _root_.openssl.structs.ossl_lib_ctx_st
  export _root_.openssl.structs.ossl_param_bld_st
  export _root_.openssl.structs.ossl_param_st
  export _root_.openssl.structs.ossl_provider_st
  export _root_.openssl.structs.ossl_self_test_st
  export _root_.openssl.structs.ossl_store_info_st
  export _root_.openssl.structs.ossl_store_search_st
  export _root_.openssl.structs.pkcs8_priv_key_info_st
  export _root_.openssl.structs.rand_drbg_st
  export _root_.openssl.structs.rand_meth_st
  export _root_.openssl.structs.rsa_meth_st
  export _root_.openssl.structs.rsa_pss_params_st
  export _root_.openssl.structs.rsa_st
  export _root_.openssl.structs.sct_ctx_st
  export _root_.openssl.structs.sct_st
  export _root_.openssl.structs.ssl_ctx_st
  export _root_.openssl.structs.ssl_dane_st
  export _root_.openssl.structs.ssl_st
  export _root_.openssl.structs.stack_st
  export _root_.openssl.structs.stack_st_ASN1_GENERALSTRING
  export _root_.openssl.structs.stack_st_ASN1_INTEGER
  export _root_.openssl.structs.stack_st_ASN1_OBJECT
  export _root_.openssl.structs.stack_st_ASN1_STRING_TABLE
  export _root_.openssl.structs.stack_st_ASN1_TYPE
  export _root_.openssl.structs.stack_st_ASN1_UTF8STRING
  export _root_.openssl.structs.stack_st_BIGNUM
  export _root_.openssl.structs.stack_st_BIGNUM_const
  export _root_.openssl.structs.stack_st_BIO
  export _root_.openssl.structs.stack_st_OPENSSL_BLOCK
  export _root_.openssl.structs.stack_st_OPENSSL_CSTRING
  export _root_.openssl.structs.stack_st_OPENSSL_STRING
  export _root_.openssl.structs.stack_st_X509_ALGOR
  export _root_.openssl.structs.stack_st_void
  export _root_.openssl.structs.ui_method_st
  export _root_.openssl.structs.ui_st
  export _root_.openssl.structs.v3_ext_ctx
  export _root_.openssl.structs.x509_crl_method_st
  export _root_.openssl.structs.x509_lookup_method_st
  export _root_.openssl.structs.x509_lookup_st
  export _root_.openssl.structs.x509_object_st
  export _root_.openssl.structs.x509_revoked_st
  export _root_.openssl.structs.x509_sig_info_st
  export _root_.openssl.structs.x509_st
  export _root_.openssl.structs.x509_store_ctx_st
  export _root_.openssl.structs.x509_store_st
  export _root_.openssl.unions.BIO_ADDR
  export _root_.openssl.unions.BIO_sock_info_u
  export _root_.openssl.unions.bio_addr_st
  export _root_.openssl.functions.ASN1_ANY_it
  export _root_.openssl.functions.ASN1_BIT_STRING_check
  export _root_.openssl.functions.ASN1_BIT_STRING_free
  export _root_.openssl.functions.ASN1_BIT_STRING_get_bit
  export _root_.openssl.functions.ASN1_BIT_STRING_it
  export _root_.openssl.functions.ASN1_BIT_STRING_name_print
  export _root_.openssl.functions.ASN1_BIT_STRING_new
  export _root_.openssl.functions.ASN1_BIT_STRING_num_asc
  export _root_.openssl.functions.ASN1_BIT_STRING_set
  export _root_.openssl.functions.ASN1_BIT_STRING_set_asc
  export _root_.openssl.functions.ASN1_BIT_STRING_set_bit
  export _root_.openssl.functions.ASN1_BMPSTRING_free
  export _root_.openssl.functions.ASN1_BMPSTRING_it
  export _root_.openssl.functions.ASN1_BMPSTRING_new
  export _root_.openssl.functions.ASN1_ENUMERATED_free
  export _root_.openssl.functions.ASN1_ENUMERATED_get
  export _root_.openssl.functions.ASN1_ENUMERATED_get_int64
  export _root_.openssl.functions.ASN1_ENUMERATED_it
  export _root_.openssl.functions.ASN1_ENUMERATED_new
  export _root_.openssl.functions.ASN1_ENUMERATED_set
  export _root_.openssl.functions.ASN1_ENUMERATED_set_int64
  export _root_.openssl.functions.ASN1_ENUMERATED_to_BN
  export _root_.openssl.functions.ASN1_GENERALIZEDTIME_adj
  export _root_.openssl.functions.ASN1_GENERALIZEDTIME_check
  export _root_.openssl.functions.ASN1_GENERALIZEDTIME_dup
  export _root_.openssl.functions.ASN1_GENERALIZEDTIME_free
  export _root_.openssl.functions.ASN1_GENERALIZEDTIME_it
  export _root_.openssl.functions.ASN1_GENERALIZEDTIME_new
  export _root_.openssl.functions.ASN1_GENERALIZEDTIME_print
  export _root_.openssl.functions.ASN1_GENERALIZEDTIME_set
  export _root_.openssl.functions.ASN1_GENERALIZEDTIME_set_string
  export _root_.openssl.functions.ASN1_GENERALSTRING_free
  export _root_.openssl.functions.ASN1_GENERALSTRING_it
  export _root_.openssl.functions.ASN1_GENERALSTRING_new
  export _root_.openssl.functions.ASN1_IA5STRING_free
  export _root_.openssl.functions.ASN1_IA5STRING_it
  export _root_.openssl.functions.ASN1_IA5STRING_new
  export _root_.openssl.functions.ASN1_INTEGER_cmp
  export _root_.openssl.functions.ASN1_INTEGER_dup
  export _root_.openssl.functions.ASN1_INTEGER_free
  export _root_.openssl.functions.ASN1_INTEGER_get
  export _root_.openssl.functions.ASN1_INTEGER_get_int64
  export _root_.openssl.functions.ASN1_INTEGER_get_uint64
  export _root_.openssl.functions.ASN1_INTEGER_it
  export _root_.openssl.functions.ASN1_INTEGER_new
  export _root_.openssl.functions.ASN1_INTEGER_set
  export _root_.openssl.functions.ASN1_INTEGER_set_int64
  export _root_.openssl.functions.ASN1_INTEGER_set_uint64
  export _root_.openssl.functions.ASN1_INTEGER_to_BN
  export _root_.openssl.functions.ASN1_ITEM_get
  export _root_.openssl.functions.ASN1_ITEM_lookup
  export _root_.openssl.functions.ASN1_NULL_free
  export _root_.openssl.functions.ASN1_NULL_it
  export _root_.openssl.functions.ASN1_NULL_new
  export _root_.openssl.functions.ASN1_OBJECT_create
  export _root_.openssl.functions.ASN1_OBJECT_free
  export _root_.openssl.functions.ASN1_OBJECT_it
  export _root_.openssl.functions.ASN1_OBJECT_new
  export _root_.openssl.functions.ASN1_OCTET_STRING_NDEF_it
  export _root_.openssl.functions.ASN1_OCTET_STRING_cmp
  export _root_.openssl.functions.ASN1_OCTET_STRING_dup
  export _root_.openssl.functions.ASN1_OCTET_STRING_free
  export _root_.openssl.functions.ASN1_OCTET_STRING_it
  export _root_.openssl.functions.ASN1_OCTET_STRING_new
  export _root_.openssl.functions.ASN1_OCTET_STRING_set
  export _root_.openssl.functions.ASN1_PCTX_free
  export _root_.openssl.functions.ASN1_PCTX_get_cert_flags
  export _root_.openssl.functions.ASN1_PCTX_get_flags
  export _root_.openssl.functions.ASN1_PCTX_get_nm_flags
  export _root_.openssl.functions.ASN1_PCTX_get_oid_flags
  export _root_.openssl.functions.ASN1_PCTX_get_str_flags
  export _root_.openssl.functions.ASN1_PCTX_new
  export _root_.openssl.functions.ASN1_PCTX_set_cert_flags
  export _root_.openssl.functions.ASN1_PCTX_set_flags
  export _root_.openssl.functions.ASN1_PCTX_set_nm_flags
  export _root_.openssl.functions.ASN1_PCTX_set_oid_flags
  export _root_.openssl.functions.ASN1_PCTX_set_str_flags
  export _root_.openssl.functions.ASN1_PRINTABLESTRING_free
  export _root_.openssl.functions.ASN1_PRINTABLESTRING_it
  export _root_.openssl.functions.ASN1_PRINTABLESTRING_new
  export _root_.openssl.functions.ASN1_PRINTABLE_free
  export _root_.openssl.functions.ASN1_PRINTABLE_it
  export _root_.openssl.functions.ASN1_PRINTABLE_new
  export _root_.openssl.functions.ASN1_PRINTABLE_type
  export _root_.openssl.functions.ASN1_SCTX_free
  export _root_.openssl.functions.ASN1_SCTX_get_app_data
  export _root_.openssl.functions.ASN1_SCTX_get_flags
  export _root_.openssl.functions.ASN1_SCTX_get_item
  export _root_.openssl.functions.ASN1_SCTX_get_template
  export _root_.openssl.functions.ASN1_SCTX_new
  export _root_.openssl.functions.ASN1_SCTX_set_app_data
  export _root_.openssl.functions.ASN1_SEQUENCE_ANY_it
  export _root_.openssl.functions.ASN1_SET_ANY_it
  export _root_.openssl.functions.ASN1_STRING_TABLE_add
  export _root_.openssl.functions.ASN1_STRING_TABLE_cleanup
  export _root_.openssl.functions.ASN1_STRING_TABLE_get
  export _root_.openssl.functions.ASN1_STRING_clear_free
  export _root_.openssl.functions.ASN1_STRING_cmp
  export _root_.openssl.functions.ASN1_STRING_copy
  export _root_.openssl.functions.ASN1_STRING_data
  export _root_.openssl.functions.ASN1_STRING_dup
  export _root_.openssl.functions.ASN1_STRING_free
  export _root_.openssl.functions.ASN1_STRING_get0_data
  export _root_.openssl.functions.ASN1_STRING_get_default_mask
  export _root_.openssl.functions.ASN1_STRING_length
  export _root_.openssl.functions.ASN1_STRING_length_set
  export _root_.openssl.functions.ASN1_STRING_new
  export _root_.openssl.functions.ASN1_STRING_print
  export _root_.openssl.functions.ASN1_STRING_print_ex
  export _root_.openssl.functions.ASN1_STRING_print_ex_fp
  export _root_.openssl.functions.ASN1_STRING_set
  export _root_.openssl.functions.ASN1_STRING_set0
  export _root_.openssl.functions.ASN1_STRING_set_by_NID
  export _root_.openssl.functions.ASN1_STRING_set_default_mask
  export _root_.openssl.functions.ASN1_STRING_set_default_mask_asc
  export _root_.openssl.functions.ASN1_STRING_to_UTF8
  export _root_.openssl.functions.ASN1_STRING_type
  export _root_.openssl.functions.ASN1_STRING_type_new
  export _root_.openssl.functions.ASN1_T61STRING_free
  export _root_.openssl.functions.ASN1_T61STRING_it
  export _root_.openssl.functions.ASN1_T61STRING_new
  export _root_.openssl.functions.ASN1_TIME_adj
  export _root_.openssl.functions.ASN1_TIME_check
  export _root_.openssl.functions.ASN1_TIME_cmp_time_t
  export _root_.openssl.functions.ASN1_TIME_compare
  export _root_.openssl.functions.ASN1_TIME_diff
  export _root_.openssl.functions.ASN1_TIME_dup
  export _root_.openssl.functions.ASN1_TIME_free
  export _root_.openssl.functions.ASN1_TIME_it
  export _root_.openssl.functions.ASN1_TIME_new
  export _root_.openssl.functions.ASN1_TIME_normalize
  export _root_.openssl.functions.ASN1_TIME_print
  export _root_.openssl.functions.ASN1_TIME_print_ex
  export _root_.openssl.functions.ASN1_TIME_set
  export _root_.openssl.functions.ASN1_TIME_set_string
  export _root_.openssl.functions.ASN1_TIME_set_string_X509
  export _root_.openssl.functions.ASN1_TIME_to_generalizedtime
  export _root_.openssl.functions.ASN1_TIME_to_tm
  export _root_.openssl.functions.ASN1_TYPE_cmp
  export _root_.openssl.functions.ASN1_TYPE_free
  export _root_.openssl.functions.ASN1_TYPE_get
  export _root_.openssl.functions.ASN1_TYPE_get_int_octetstring
  export _root_.openssl.functions.ASN1_TYPE_get_octetstring
  export _root_.openssl.functions.ASN1_TYPE_new
  export _root_.openssl.functions.ASN1_TYPE_pack_sequence
  export _root_.openssl.functions.ASN1_TYPE_set
  export _root_.openssl.functions.ASN1_TYPE_set1
  export _root_.openssl.functions.ASN1_TYPE_set_int_octetstring
  export _root_.openssl.functions.ASN1_TYPE_set_octetstring
  export _root_.openssl.functions.ASN1_TYPE_unpack_sequence
  export _root_.openssl.functions.ASN1_UNIVERSALSTRING_free
  export _root_.openssl.functions.ASN1_UNIVERSALSTRING_it
  export _root_.openssl.functions.ASN1_UNIVERSALSTRING_new
  export _root_.openssl.functions.ASN1_UNIVERSALSTRING_to_string
  export _root_.openssl.functions.ASN1_UTCTIME_adj
  export _root_.openssl.functions.ASN1_UTCTIME_check
  export _root_.openssl.functions.ASN1_UTCTIME_cmp_time_t
  export _root_.openssl.functions.ASN1_UTCTIME_dup
  export _root_.openssl.functions.ASN1_UTCTIME_free
  export _root_.openssl.functions.ASN1_UTCTIME_it
  export _root_.openssl.functions.ASN1_UTCTIME_new
  export _root_.openssl.functions.ASN1_UTCTIME_print
  export _root_.openssl.functions.ASN1_UTCTIME_set
  export _root_.openssl.functions.ASN1_UTCTIME_set_string
  export _root_.openssl.functions.ASN1_UTF8STRING_free
  export _root_.openssl.functions.ASN1_UTF8STRING_it
  export _root_.openssl.functions.ASN1_UTF8STRING_new
  export _root_.openssl.functions.ASN1_VISIBLESTRING_free
  export _root_.openssl.functions.ASN1_VISIBLESTRING_it
  export _root_.openssl.functions.ASN1_VISIBLESTRING_new
  export _root_.openssl.functions.ASN1_add_oid_module
  export _root_.openssl.functions.ASN1_add_stable_module
  export _root_.openssl.functions.ASN1_bn_print
  export _root_.openssl.functions.ASN1_buf_print
  export _root_.openssl.functions.ASN1_check_infinite_end
  export _root_.openssl.functions.ASN1_const_check_infinite_end
  export _root_.openssl.functions.ASN1_d2i_bio
  export _root_.openssl.functions.ASN1_d2i_fp
  export _root_.openssl.functions.ASN1_dup
  export _root_.openssl.functions.ASN1_generate_nconf
  export _root_.openssl.functions.ASN1_generate_v3
  export _root_.openssl.functions.ASN1_get_object
  export _root_.openssl.functions.ASN1_i2d_bio
  export _root_.openssl.functions.ASN1_i2d_fp
  export _root_.openssl.functions.ASN1_item_d2i
  export _root_.openssl.functions.ASN1_item_d2i_bio
  export _root_.openssl.functions.ASN1_item_d2i_bio_ex
  export _root_.openssl.functions.ASN1_item_d2i_ex
  export _root_.openssl.functions.ASN1_item_d2i_fp
  export _root_.openssl.functions.ASN1_item_d2i_fp_ex
  export _root_.openssl.functions.ASN1_item_dup
  export _root_.openssl.functions.ASN1_item_free
  export _root_.openssl.functions.ASN1_item_i2d
  export _root_.openssl.functions.ASN1_item_i2d_bio
  export _root_.openssl.functions.ASN1_item_i2d_fp
  export _root_.openssl.functions.ASN1_item_i2d_mem_bio
  export _root_.openssl.functions.ASN1_item_ndef_i2d
  export _root_.openssl.functions.ASN1_item_new
  export _root_.openssl.functions.ASN1_item_new_ex
  export _root_.openssl.functions.ASN1_item_pack
  export _root_.openssl.functions.ASN1_item_print
  export _root_.openssl.functions.ASN1_item_sign_ex
  export _root_.openssl.functions.ASN1_item_unpack
  export _root_.openssl.functions.ASN1_item_verify_ex
  export _root_.openssl.functions.ASN1_mbstring_copy
  export _root_.openssl.functions.ASN1_mbstring_ncopy
  export _root_.openssl.functions.ASN1_object_size
  export _root_.openssl.functions.ASN1_parse
  export _root_.openssl.functions.ASN1_parse_dump
  export _root_.openssl.functions.ASN1_put_eoc
  export _root_.openssl.functions.ASN1_put_object
  export _root_.openssl.functions.ASN1_str2mask
  export _root_.openssl.functions.ASN1_tag2bit
  export _root_.openssl.functions.ASN1_tag2str
  export _root_.openssl.functions.BIO_ADDRINFO_address
  export _root_.openssl.functions.BIO_ADDRINFO_family
  export _root_.openssl.functions.BIO_ADDRINFO_free
  export _root_.openssl.functions.BIO_ADDRINFO_next
  export _root_.openssl.functions.BIO_ADDRINFO_protocol
  export _root_.openssl.functions.BIO_ADDRINFO_socktype
  export _root_.openssl.functions.BIO_ADDR_clear
  export _root_.openssl.functions.BIO_ADDR_family
  export _root_.openssl.functions.BIO_ADDR_free
  export _root_.openssl.functions.BIO_ADDR_hostname_string
  export _root_.openssl.functions.BIO_ADDR_new
  export _root_.openssl.functions.BIO_ADDR_path_string
  export _root_.openssl.functions.BIO_ADDR_rawaddress
  export _root_.openssl.functions.BIO_ADDR_rawmake
  export _root_.openssl.functions.BIO_ADDR_rawport
  export _root_.openssl.functions.BIO_ADDR_service_string
  export _root_.openssl.functions.BIO_accept
  export _root_.openssl.functions.BIO_accept_ex
  export _root_.openssl.functions.BIO_asn1_get_prefix
  export _root_.openssl.functions.BIO_asn1_get_suffix
  export _root_.openssl.functions.BIO_asn1_set_prefix
  export _root_.openssl.functions.BIO_asn1_set_suffix
  export _root_.openssl.functions.BIO_bind
  export _root_.openssl.functions.BIO_callback_ctrl
  export _root_.openssl.functions.BIO_clear_flags
  export _root_.openssl.functions.BIO_closesocket
  export _root_.openssl.functions.BIO_connect
  export _root_.openssl.functions.BIO_copy_next_retry
  export _root_.openssl.functions.BIO_ctrl
  export _root_.openssl.functions.BIO_ctrl_get_read_request
  export _root_.openssl.functions.BIO_ctrl_get_write_guarantee
  export _root_.openssl.functions.BIO_ctrl_pending
  export _root_.openssl.functions.BIO_ctrl_reset_read_request
  export _root_.openssl.functions.BIO_ctrl_wpending
  export _root_.openssl.functions.BIO_debug_callback
  export _root_.openssl.functions.BIO_debug_callback_ex
  export _root_.openssl.functions.BIO_dgram_non_fatal_error
  export _root_.openssl.functions.BIO_do_connect_retry
  export _root_.openssl.functions.BIO_dump
  export _root_.openssl.functions.BIO_dump_cb
  export _root_.openssl.functions.BIO_dump_fp
  export _root_.openssl.functions.BIO_dump_indent
  export _root_.openssl.functions.BIO_dump_indent_cb
  export _root_.openssl.functions.BIO_dump_indent_fp
  export _root_.openssl.functions.BIO_dup_chain
  export _root_.openssl.functions.BIO_f_asn1
  export _root_.openssl.functions.BIO_f_base64
  export _root_.openssl.functions.BIO_f_buffer
  export _root_.openssl.functions.BIO_f_cipher
  export _root_.openssl.functions.BIO_f_linebuffer
  export _root_.openssl.functions.BIO_f_md
  export _root_.openssl.functions.BIO_f_nbio_test
  export _root_.openssl.functions.BIO_f_null
  export _root_.openssl.functions.BIO_f_prefix
  export _root_.openssl.functions.BIO_f_readbuffer
  export _root_.openssl.functions.BIO_f_reliable
  export _root_.openssl.functions.BIO_fd_non_fatal_error
  export _root_.openssl.functions.BIO_fd_should_retry
  export _root_.openssl.functions.BIO_find_type
  export _root_.openssl.functions.BIO_free
  export _root_.openssl.functions.BIO_free_all
  export _root_.openssl.functions.BIO_get_accept_socket
  export _root_.openssl.functions.BIO_get_callback
  export _root_.openssl.functions.BIO_get_callback_arg
  export _root_.openssl.functions.BIO_get_callback_ex
  export _root_.openssl.functions.BIO_get_data
  export _root_.openssl.functions.BIO_get_ex_data
  export _root_.openssl.functions.BIO_get_host_ip
  export _root_.openssl.functions.BIO_get_init
  export _root_.openssl.functions.BIO_get_line
  export _root_.openssl.functions.BIO_get_new_index
  export _root_.openssl.functions.BIO_get_port
  export _root_.openssl.functions.BIO_get_retry_BIO
  export _root_.openssl.functions.BIO_get_retry_reason
  export _root_.openssl.functions.BIO_get_shutdown
  export _root_.openssl.functions.BIO_gethostbyname
  export _root_.openssl.functions.BIO_gets
  export _root_.openssl.functions.BIO_hex_string
  export _root_.openssl.functions.BIO_indent
  export _root_.openssl.functions.BIO_int_ctrl
  export _root_.openssl.functions.BIO_listen
  export _root_.openssl.functions.BIO_lookup
  export _root_.openssl.functions.BIO_lookup_ex
  export _root_.openssl.functions.BIO_meth_free
  export _root_.openssl.functions.BIO_meth_get_callback_ctrl
  export _root_.openssl.functions.BIO_meth_get_create
  export _root_.openssl.functions.BIO_meth_get_ctrl
  export _root_.openssl.functions.BIO_meth_get_destroy
  export _root_.openssl.functions.BIO_meth_get_gets
  export _root_.openssl.functions.BIO_meth_get_puts
  export _root_.openssl.functions.BIO_meth_get_read
  export _root_.openssl.functions.BIO_meth_get_read_ex
  export _root_.openssl.functions.BIO_meth_get_write
  export _root_.openssl.functions.BIO_meth_get_write_ex
  export _root_.openssl.functions.BIO_meth_new
  export _root_.openssl.functions.BIO_meth_set_callback_ctrl
  export _root_.openssl.functions.BIO_meth_set_create
  export _root_.openssl.functions.BIO_meth_set_ctrl
  export _root_.openssl.functions.BIO_meth_set_destroy
  export _root_.openssl.functions.BIO_meth_set_gets
  export _root_.openssl.functions.BIO_meth_set_puts
  export _root_.openssl.functions.BIO_meth_set_read
  export _root_.openssl.functions.BIO_meth_set_read_ex
  export _root_.openssl.functions.BIO_meth_set_write
  export _root_.openssl.functions.BIO_meth_set_write_ex
  export _root_.openssl.functions.BIO_method_name
  export _root_.openssl.functions.BIO_method_type
  export _root_.openssl.functions.BIO_new
  export _root_.openssl.functions.BIO_new_NDEF
  export _root_.openssl.functions.BIO_new_accept
  export _root_.openssl.functions.BIO_new_bio_pair
  export _root_.openssl.functions.BIO_new_connect
  export _root_.openssl.functions.BIO_new_dgram
  export _root_.openssl.functions.BIO_new_ex
  export _root_.openssl.functions.BIO_new_fd
  export _root_.openssl.functions.BIO_new_file
  export _root_.openssl.functions.BIO_new_fp
  export _root_.openssl.functions.BIO_new_from_core_bio
  export _root_.openssl.functions.BIO_new_mem_buf
  export _root_.openssl.functions.BIO_new_socket
  export _root_.openssl.functions.BIO_next
  export _root_.openssl.functions.BIO_nread
  export _root_.openssl.functions.BIO_nread0
  export _root_.openssl.functions.BIO_number_read
  export _root_.openssl.functions.BIO_number_written
  export _root_.openssl.functions.BIO_nwrite
  export _root_.openssl.functions.BIO_nwrite0
  export _root_.openssl.functions.BIO_parse_hostserv
  export _root_.openssl.functions.BIO_pop
  export _root_.openssl.functions.BIO_printf
  export _root_.openssl.functions.BIO_ptr_ctrl
  export _root_.openssl.functions.BIO_push
  export _root_.openssl.functions.BIO_puts
  export _root_.openssl.functions.BIO_read
  export _root_.openssl.functions.BIO_read_ex
  export _root_.openssl.functions.BIO_s_accept
  export _root_.openssl.functions.BIO_s_bio
  export _root_.openssl.functions.BIO_s_connect
  export _root_.openssl.functions.BIO_s_core
  export _root_.openssl.functions.BIO_s_datagram
  export _root_.openssl.functions.BIO_s_fd
  export _root_.openssl.functions.BIO_s_file
  export _root_.openssl.functions.BIO_s_log
  export _root_.openssl.functions.BIO_s_mem
  export _root_.openssl.functions.BIO_s_null
  export _root_.openssl.functions.BIO_s_secmem
  export _root_.openssl.functions.BIO_s_socket
  export _root_.openssl.functions.BIO_set_callback
  export _root_.openssl.functions.BIO_set_callback_arg
  export _root_.openssl.functions.BIO_set_callback_ex
  export _root_.openssl.functions.BIO_set_cipher
  export _root_.openssl.functions.BIO_set_data
  export _root_.openssl.functions.BIO_set_ex_data
  export _root_.openssl.functions.BIO_set_flags
  export _root_.openssl.functions.BIO_set_init
  export _root_.openssl.functions.BIO_set_next
  export _root_.openssl.functions.BIO_set_retry_reason
  export _root_.openssl.functions.BIO_set_shutdown
  export _root_.openssl.functions.BIO_set_tcp_ndelay
  export _root_.openssl.functions.BIO_snprintf
  export _root_.openssl.functions.BIO_sock_error
  export _root_.openssl.functions.BIO_sock_info
  export _root_.openssl.functions.BIO_sock_init
  export _root_.openssl.functions.BIO_sock_non_fatal_error
  export _root_.openssl.functions.BIO_sock_should_retry
  export _root_.openssl.functions.BIO_socket
  export _root_.openssl.functions.BIO_socket_ioctl
  export _root_.openssl.functions.BIO_socket_nbio
  export _root_.openssl.functions.BIO_socket_wait
  export _root_.openssl.functions.BIO_test_flags
  export _root_.openssl.functions.BIO_up_ref
  export _root_.openssl.functions.BIO_vfree
  export _root_.openssl.functions.BIO_vprintf
  export _root_.openssl.functions.BIO_vsnprintf
  export _root_.openssl.functions.BIO_wait
  export _root_.openssl.functions.BIO_write
  export _root_.openssl.functions.BIO_write_ex
  export _root_.openssl.functions.BN_BLINDING_convert
  export _root_.openssl.functions.BN_BLINDING_convert_ex
  export _root_.openssl.functions.BN_BLINDING_create_param
  export _root_.openssl.functions.BN_BLINDING_free
  export _root_.openssl.functions.BN_BLINDING_get_flags
  export _root_.openssl.functions.BN_BLINDING_invert
  export _root_.openssl.functions.BN_BLINDING_invert_ex
  export _root_.openssl.functions.BN_BLINDING_is_current_thread
  export _root_.openssl.functions.BN_BLINDING_lock
  export _root_.openssl.functions.BN_BLINDING_new
  export _root_.openssl.functions.BN_BLINDING_set_current_thread
  export _root_.openssl.functions.BN_BLINDING_set_flags
  export _root_.openssl.functions.BN_BLINDING_unlock
  export _root_.openssl.functions.BN_BLINDING_update
  export _root_.openssl.functions.BN_CTX_end
  export _root_.openssl.functions.BN_CTX_free
  export _root_.openssl.functions.BN_CTX_get
  export _root_.openssl.functions.BN_CTX_new
  export _root_.openssl.functions.BN_CTX_new_ex
  export _root_.openssl.functions.BN_CTX_secure_new
  export _root_.openssl.functions.BN_CTX_secure_new_ex
  export _root_.openssl.functions.BN_CTX_start
  export _root_.openssl.functions.BN_GENCB_call
  export _root_.openssl.functions.BN_GENCB_free
  export _root_.openssl.functions.BN_GENCB_get_arg
  export _root_.openssl.functions.BN_GENCB_new
  export _root_.openssl.functions.BN_GENCB_set
  export _root_.openssl.functions.BN_GENCB_set_old
  export _root_.openssl.functions.BN_GF2m_add
  export _root_.openssl.functions.BN_GF2m_arr2poly
  export _root_.openssl.functions.BN_GF2m_mod
  export _root_.openssl.functions.BN_GF2m_mod_arr
  export _root_.openssl.functions.BN_GF2m_mod_div
  export _root_.openssl.functions.BN_GF2m_mod_div_arr
  export _root_.openssl.functions.BN_GF2m_mod_exp
  export _root_.openssl.functions.BN_GF2m_mod_exp_arr
  export _root_.openssl.functions.BN_GF2m_mod_inv
  export _root_.openssl.functions.BN_GF2m_mod_inv_arr
  export _root_.openssl.functions.BN_GF2m_mod_mul
  export _root_.openssl.functions.BN_GF2m_mod_mul_arr
  export _root_.openssl.functions.BN_GF2m_mod_solve_quad
  export _root_.openssl.functions.BN_GF2m_mod_solve_quad_arr
  export _root_.openssl.functions.BN_GF2m_mod_sqr
  export _root_.openssl.functions.BN_GF2m_mod_sqr_arr
  export _root_.openssl.functions.BN_GF2m_mod_sqrt
  export _root_.openssl.functions.BN_GF2m_mod_sqrt_arr
  export _root_.openssl.functions.BN_GF2m_poly2arr
  export _root_.openssl.functions.BN_MONT_CTX_copy
  export _root_.openssl.functions.BN_MONT_CTX_free
  export _root_.openssl.functions.BN_MONT_CTX_new
  export _root_.openssl.functions.BN_MONT_CTX_set
  export _root_.openssl.functions.BN_MONT_CTX_set_locked
  export _root_.openssl.functions.BN_RECP_CTX_free
  export _root_.openssl.functions.BN_RECP_CTX_new
  export _root_.openssl.functions.BN_RECP_CTX_set
  export _root_.openssl.functions.BN_X931_derive_prime_ex
  export _root_.openssl.functions.BN_X931_generate_Xpq
  export _root_.openssl.functions.BN_X931_generate_prime_ex
  export _root_.openssl.functions.BN_abs_is_word
  export _root_.openssl.functions.BN_add
  export _root_.openssl.functions.BN_add_word
  export _root_.openssl.functions.BN_are_coprime
  export _root_.openssl.functions.BN_asc2bn
  export _root_.openssl.functions.BN_bin2bn
  export _root_.openssl.functions.BN_bn2bin
  export _root_.openssl.functions.BN_bn2binpad
  export _root_.openssl.functions.BN_bn2dec
  export _root_.openssl.functions.BN_bn2hex
  export _root_.openssl.functions.BN_bn2lebinpad
  export _root_.openssl.functions.BN_bn2mpi
  export _root_.openssl.functions.BN_bn2nativepad
  export _root_.openssl.functions.BN_bntest_rand
  export _root_.openssl.functions.BN_check_prime
  export _root_.openssl.functions.BN_clear
  export _root_.openssl.functions.BN_clear_bit
  export _root_.openssl.functions.BN_clear_free
  export _root_.openssl.functions.BN_cmp
  export _root_.openssl.functions.BN_consttime_swap
  export _root_.openssl.functions.BN_copy
  export _root_.openssl.functions.BN_dec2bn
  export _root_.openssl.functions.BN_div
  export _root_.openssl.functions.BN_div_recp
  export _root_.openssl.functions.BN_div_word
  export _root_.openssl.functions.BN_dup
  export _root_.openssl.functions.BN_exp
  export _root_.openssl.functions.BN_free
  export _root_.openssl.functions.BN_from_montgomery
  export _root_.openssl.functions.BN_gcd
  export _root_.openssl.functions.BN_generate_dsa_nonce
  export _root_.openssl.functions.BN_generate_prime
  export _root_.openssl.functions.BN_generate_prime_ex
  export _root_.openssl.functions.BN_generate_prime_ex2
  export _root_.openssl.functions.BN_get0_nist_prime_192
  export _root_.openssl.functions.BN_get0_nist_prime_224
  export _root_.openssl.functions.BN_get0_nist_prime_256
  export _root_.openssl.functions.BN_get0_nist_prime_384
  export _root_.openssl.functions.BN_get0_nist_prime_521
  export _root_.openssl.functions.BN_get_flags
  export _root_.openssl.functions.BN_get_params
  export _root_.openssl.functions.BN_get_rfc2409_prime_1024
  export _root_.openssl.functions.BN_get_rfc2409_prime_768
  export _root_.openssl.functions.BN_get_rfc3526_prime_1536
  export _root_.openssl.functions.BN_get_rfc3526_prime_2048
  export _root_.openssl.functions.BN_get_rfc3526_prime_3072
  export _root_.openssl.functions.BN_get_rfc3526_prime_4096
  export _root_.openssl.functions.BN_get_rfc3526_prime_6144
  export _root_.openssl.functions.BN_get_rfc3526_prime_8192
  export _root_.openssl.functions.BN_get_word
  export _root_.openssl.functions.BN_hex2bn
  export _root_.openssl.functions.BN_is_bit_set
  export _root_.openssl.functions.BN_is_negative
  export _root_.openssl.functions.BN_is_odd
  export _root_.openssl.functions.BN_is_one
  export _root_.openssl.functions.BN_is_prime
  export _root_.openssl.functions.BN_is_prime_ex
  export _root_.openssl.functions.BN_is_prime_fasttest
  export _root_.openssl.functions.BN_is_prime_fasttest_ex
  export _root_.openssl.functions.BN_is_word
  export _root_.openssl.functions.BN_is_zero
  export _root_.openssl.functions.BN_kronecker
  export _root_.openssl.functions.BN_lebin2bn
  export _root_.openssl.functions.BN_lshift
  export _root_.openssl.functions.BN_lshift1
  export _root_.openssl.functions.BN_mask_bits
  export _root_.openssl.functions.BN_mod_add
  export _root_.openssl.functions.BN_mod_add_quick
  export _root_.openssl.functions.BN_mod_exp
  export _root_.openssl.functions.BN_mod_exp2_mont
  export _root_.openssl.functions.BN_mod_exp_mont
  export _root_.openssl.functions.BN_mod_exp_mont_consttime
  export _root_.openssl.functions.BN_mod_exp_mont_consttime_x2
  export _root_.openssl.functions.BN_mod_exp_mont_word
  export _root_.openssl.functions.BN_mod_exp_recp
  export _root_.openssl.functions.BN_mod_exp_simple
  export _root_.openssl.functions.BN_mod_inverse
  export _root_.openssl.functions.BN_mod_lshift
  export _root_.openssl.functions.BN_mod_lshift1
  export _root_.openssl.functions.BN_mod_lshift1_quick
  export _root_.openssl.functions.BN_mod_lshift_quick
  export _root_.openssl.functions.BN_mod_mul
  export _root_.openssl.functions.BN_mod_mul_montgomery
  export _root_.openssl.functions.BN_mod_mul_reciprocal
  export _root_.openssl.functions.BN_mod_sqr
  export _root_.openssl.functions.BN_mod_sqrt
  export _root_.openssl.functions.BN_mod_sub
  export _root_.openssl.functions.BN_mod_sub_quick
  export _root_.openssl.functions.BN_mod_word
  export _root_.openssl.functions.BN_mpi2bn
  export _root_.openssl.functions.BN_mul
  export _root_.openssl.functions.BN_mul_word
  export _root_.openssl.functions.BN_native2bn
  export _root_.openssl.functions.BN_new
  export _root_.openssl.functions.BN_nist_mod_192
  export _root_.openssl.functions.BN_nist_mod_224
  export _root_.openssl.functions.BN_nist_mod_256
  export _root_.openssl.functions.BN_nist_mod_384
  export _root_.openssl.functions.BN_nist_mod_521
  export _root_.openssl.functions.BN_nist_mod_func
  export _root_.openssl.functions.BN_nnmod
  export _root_.openssl.functions.BN_num_bits
  export _root_.openssl.functions.BN_num_bits_word
  export _root_.openssl.functions.BN_options
  export _root_.openssl.functions.BN_print
  export _root_.openssl.functions.BN_print_fp
  export _root_.openssl.functions.BN_priv_rand
  export _root_.openssl.functions.BN_priv_rand_ex
  export _root_.openssl.functions.BN_priv_rand_range
  export _root_.openssl.functions.BN_priv_rand_range_ex
  export _root_.openssl.functions.BN_pseudo_rand
  export _root_.openssl.functions.BN_pseudo_rand_range
  export _root_.openssl.functions.BN_rand
  export _root_.openssl.functions.BN_rand_ex
  export _root_.openssl.functions.BN_rand_range
  export _root_.openssl.functions.BN_rand_range_ex
  export _root_.openssl.functions.BN_reciprocal
  export _root_.openssl.functions.BN_rshift
  export _root_.openssl.functions.BN_rshift1
  export _root_.openssl.functions.BN_secure_new
  export _root_.openssl.functions.BN_security_bits
  export _root_.openssl.functions.BN_set_bit
  export _root_.openssl.functions.BN_set_flags
  export _root_.openssl.functions.BN_set_negative
  export _root_.openssl.functions.BN_set_params
  export _root_.openssl.functions.BN_set_word
  export _root_.openssl.functions.BN_sqr
  export _root_.openssl.functions.BN_sub
  export _root_.openssl.functions.BN_sub_word
  export _root_.openssl.functions.BN_swap
  export _root_.openssl.functions.BN_to_ASN1_ENUMERATED
  export _root_.openssl.functions.BN_to_ASN1_INTEGER
  export _root_.openssl.functions.BN_to_montgomery
  export _root_.openssl.functions.BN_uadd
  export _root_.openssl.functions.BN_ucmp
  export _root_.openssl.functions.BN_usub
  export _root_.openssl.functions.BN_value_one
  export _root_.openssl.functions.BN_with_flags
  export _root_.openssl.functions.BN_zero_ex
  export _root_.openssl.functions.CRYPTO_THREAD_cleanup_local
  export _root_.openssl.functions.CRYPTO_THREAD_compare_id
  export _root_.openssl.functions.CRYPTO_THREAD_get_current_id
  export _root_.openssl.functions.CRYPTO_THREAD_get_local
  export _root_.openssl.functions.CRYPTO_THREAD_init_local
  export _root_.openssl.functions.CRYPTO_THREAD_lock_free
  export _root_.openssl.functions.CRYPTO_THREAD_lock_new
  export _root_.openssl.functions.CRYPTO_THREAD_read_lock
  export _root_.openssl.functions.CRYPTO_THREAD_run_once
  export _root_.openssl.functions.CRYPTO_THREAD_set_local
  export _root_.openssl.functions.CRYPTO_THREAD_unlock
  export _root_.openssl.functions.CRYPTO_THREAD_write_lock
  export _root_.openssl.functions.CRYPTO_alloc_ex_data
  export _root_.openssl.functions.CRYPTO_atomic_add
  export _root_.openssl.functions.CRYPTO_atomic_load
  export _root_.openssl.functions.CRYPTO_atomic_or
  export _root_.openssl.functions.CRYPTO_clear_free
  export _root_.openssl.functions.CRYPTO_clear_realloc
  export _root_.openssl.functions.CRYPTO_dup_ex_data
  export _root_.openssl.functions.CRYPTO_free
  export _root_.openssl.functions.CRYPTO_free_ex_data
  export _root_.openssl.functions.CRYPTO_free_ex_index
  export _root_.openssl.functions.CRYPTO_get_ex_data
  export _root_.openssl.functions.CRYPTO_get_ex_new_index
  export _root_.openssl.functions.CRYPTO_get_mem_functions
  export _root_.openssl.functions.CRYPTO_malloc
  export _root_.openssl.functions.CRYPTO_memcmp
  export _root_.openssl.functions.CRYPTO_memdup
  export _root_.openssl.functions.CRYPTO_new_ex_data
  export _root_.openssl.functions.CRYPTO_realloc
  export _root_.openssl.functions.CRYPTO_secure_actual_size
  export _root_.openssl.functions.CRYPTO_secure_allocated
  export _root_.openssl.functions.CRYPTO_secure_clear_free
  export _root_.openssl.functions.CRYPTO_secure_free
  export _root_.openssl.functions.CRYPTO_secure_malloc
  export _root_.openssl.functions.CRYPTO_secure_malloc_done
  export _root_.openssl.functions.CRYPTO_secure_malloc_init
  export _root_.openssl.functions.CRYPTO_secure_malloc_initialized
  export _root_.openssl.functions.CRYPTO_secure_used
  export _root_.openssl.functions.CRYPTO_secure_zalloc
  export _root_.openssl.functions.CRYPTO_set_ex_data
  export _root_.openssl.functions.CRYPTO_set_mem_functions
  export _root_.openssl.functions.CRYPTO_strdup
  export _root_.openssl.functions.CRYPTO_strndup
  export _root_.openssl.functions.CRYPTO_zalloc
  export _root_.openssl.functions.DIRECTORYSTRING_free
  export _root_.openssl.functions.DIRECTORYSTRING_it
  export _root_.openssl.functions.DIRECTORYSTRING_new
  export _root_.openssl.functions.DISPLAYTEXT_free
  export _root_.openssl.functions.DISPLAYTEXT_it
  export _root_.openssl.functions.DISPLAYTEXT_new
  export _root_.openssl.functions.ERR_load_ASN1_strings
  export _root_.openssl.functions.ERR_load_ASYNC_strings
  export _root_.openssl.functions.ERR_load_BIO_strings
  export _root_.openssl.functions.ERR_load_BN_strings
  export _root_.openssl.functions.ERR_load_BUF_strings
  export _root_.openssl.functions.ERR_load_CMS_strings
  export _root_.openssl.functions.ERR_load_COMP_strings
  export _root_.openssl.functions.ERR_load_CONF_strings
  export _root_.openssl.functions.ERR_load_CRYPTO_strings
  export _root_.openssl.functions.ERR_load_CT_strings
  export _root_.openssl.functions.ERR_load_DH_strings
  export _root_.openssl.functions.ERR_load_DSA_strings
  export _root_.openssl.functions.ERR_load_EC_strings
  export _root_.openssl.functions.ERR_load_ENGINE_strings
  export _root_.openssl.functions.ERR_load_ERR_strings
  export _root_.openssl.functions.ERR_load_EVP_strings
  export _root_.openssl.functions.ERR_load_KDF_strings
  export _root_.openssl.functions.ERR_load_OBJ_strings
  export _root_.openssl.functions.ERR_load_OCSP_strings
  export _root_.openssl.functions.ERR_load_OSSL_STORE_strings
  export _root_.openssl.functions.ERR_load_PEM_strings
  export _root_.openssl.functions.ERR_load_PKCS12_strings
  export _root_.openssl.functions.ERR_load_PKCS7_strings
  export _root_.openssl.functions.ERR_load_RAND_strings
  export _root_.openssl.functions.ERR_load_RSA_strings
  export _root_.openssl.functions.ERR_load_TS_strings
  export _root_.openssl.functions.ERR_load_UI_strings
  export _root_.openssl.functions.ERR_load_X509V3_strings
  export _root_.openssl.functions.ERR_load_X509_strings
  export _root_.openssl.functions.EVP_ASYM_CIPHER_do_all_provided
  export _root_.openssl.functions.EVP_ASYM_CIPHER_fetch
  export _root_.openssl.functions.EVP_ASYM_CIPHER_free
  export _root_.openssl.functions.EVP_ASYM_CIPHER_get0_description
  export _root_.openssl.functions.EVP_ASYM_CIPHER_get0_name
  export _root_.openssl.functions.EVP_ASYM_CIPHER_get0_provider
  export _root_.openssl.functions.EVP_ASYM_CIPHER_gettable_ctx_params
  export _root_.openssl.functions.EVP_ASYM_CIPHER_is_a
  export _root_.openssl.functions.EVP_ASYM_CIPHER_names_do_all
  export _root_.openssl.functions.EVP_ASYM_CIPHER_settable_ctx_params
  export _root_.openssl.functions.EVP_ASYM_CIPHER_up_ref
  export _root_.openssl.functions.EVP_BytesToKey
  export _root_.openssl.functions.EVP_CIPHER_CTX_buf_noconst
  export _root_.openssl.functions.EVP_CIPHER_CTX_cipher
  export _root_.openssl.functions.EVP_CIPHER_CTX_clear_flags
  export _root_.openssl.functions.EVP_CIPHER_CTX_copy
  export _root_.openssl.functions.EVP_CIPHER_CTX_ctrl
  export _root_.openssl.functions.EVP_CIPHER_CTX_dup
  export _root_.openssl.functions.EVP_CIPHER_CTX_free
  export _root_.openssl.functions.EVP_CIPHER_CTX_get0_cipher
  export _root_.openssl.functions.EVP_CIPHER_CTX_get1_cipher
  export _root_.openssl.functions.EVP_CIPHER_CTX_get_app_data
  export _root_.openssl.functions.EVP_CIPHER_CTX_get_block_size
  export _root_.openssl.functions.EVP_CIPHER_CTX_get_cipher_data
  export _root_.openssl.functions.EVP_CIPHER_CTX_get_iv_length
  export _root_.openssl.functions.EVP_CIPHER_CTX_get_key_length
  export _root_.openssl.functions.EVP_CIPHER_CTX_get_nid
  export _root_.openssl.functions.EVP_CIPHER_CTX_get_num
  export _root_.openssl.functions.EVP_CIPHER_CTX_get_original_iv
  export _root_.openssl.functions.EVP_CIPHER_CTX_get_params
  export _root_.openssl.functions.EVP_CIPHER_CTX_get_tag_length
  export _root_.openssl.functions.EVP_CIPHER_CTX_get_updated_iv
  export _root_.openssl.functions.EVP_CIPHER_CTX_gettable_params
  export _root_.openssl.functions.EVP_CIPHER_CTX_is_encrypting
  export _root_.openssl.functions.EVP_CIPHER_CTX_iv
  export _root_.openssl.functions.EVP_CIPHER_CTX_iv_noconst
  export _root_.openssl.functions.EVP_CIPHER_CTX_new
  export _root_.openssl.functions.EVP_CIPHER_CTX_original_iv
  export _root_.openssl.functions.EVP_CIPHER_CTX_rand_key
  export _root_.openssl.functions.EVP_CIPHER_CTX_reset
  export _root_.openssl.functions.EVP_CIPHER_CTX_set_app_data
  export _root_.openssl.functions.EVP_CIPHER_CTX_set_cipher_data
  export _root_.openssl.functions.EVP_CIPHER_CTX_set_flags
  export _root_.openssl.functions.EVP_CIPHER_CTX_set_key_length
  export _root_.openssl.functions.EVP_CIPHER_CTX_set_num
  export _root_.openssl.functions.EVP_CIPHER_CTX_set_padding
  export _root_.openssl.functions.EVP_CIPHER_CTX_set_params
  export _root_.openssl.functions.EVP_CIPHER_CTX_settable_params
  export _root_.openssl.functions.EVP_CIPHER_CTX_test_flags
  export _root_.openssl.functions.EVP_CIPHER_asn1_to_param
  export _root_.openssl.functions.EVP_CIPHER_do_all
  export _root_.openssl.functions.EVP_CIPHER_do_all_provided
  export _root_.openssl.functions.EVP_CIPHER_do_all_sorted
  export _root_.openssl.functions.EVP_CIPHER_fetch
  export _root_.openssl.functions.EVP_CIPHER_free
  export _root_.openssl.functions.EVP_CIPHER_get0_description
  export _root_.openssl.functions.EVP_CIPHER_get0_name
  export _root_.openssl.functions.EVP_CIPHER_get0_provider
  export _root_.openssl.functions.EVP_CIPHER_get_asn1_iv
  export _root_.openssl.functions.EVP_CIPHER_get_block_size
  export _root_.openssl.functions.EVP_CIPHER_get_flags
  export _root_.openssl.functions.EVP_CIPHER_get_iv_length
  export _root_.openssl.functions.EVP_CIPHER_get_key_length
  export _root_.openssl.functions.EVP_CIPHER_get_mode
  export _root_.openssl.functions.EVP_CIPHER_get_nid
  export _root_.openssl.functions.EVP_CIPHER_get_params
  export _root_.openssl.functions.EVP_CIPHER_get_type
  export _root_.openssl.functions.EVP_CIPHER_gettable_ctx_params
  export _root_.openssl.functions.EVP_CIPHER_gettable_params
  export _root_.openssl.functions.EVP_CIPHER_impl_ctx_size
  export _root_.openssl.functions.EVP_CIPHER_is_a
  export _root_.openssl.functions.EVP_CIPHER_meth_dup
  export _root_.openssl.functions.EVP_CIPHER_meth_free
  export _root_.openssl.functions.EVP_CIPHER_meth_get_cleanup
  export _root_.openssl.functions.EVP_CIPHER_meth_get_ctrl
  export _root_.openssl.functions.EVP_CIPHER_meth_get_do_cipher
  export _root_.openssl.functions.EVP_CIPHER_meth_get_get_asn1_params
  export _root_.openssl.functions.EVP_CIPHER_meth_get_init
  export _root_.openssl.functions.EVP_CIPHER_meth_get_set_asn1_params
  export _root_.openssl.functions.EVP_CIPHER_meth_new
  export _root_.openssl.functions.EVP_CIPHER_meth_set_cleanup
  export _root_.openssl.functions.EVP_CIPHER_meth_set_ctrl
  export _root_.openssl.functions.EVP_CIPHER_meth_set_do_cipher
  export _root_.openssl.functions.EVP_CIPHER_meth_set_flags
  export _root_.openssl.functions.EVP_CIPHER_meth_set_get_asn1_params
  export _root_.openssl.functions.EVP_CIPHER_meth_set_impl_ctx_size
  export _root_.openssl.functions.EVP_CIPHER_meth_set_init
  export _root_.openssl.functions.EVP_CIPHER_meth_set_iv_length
  export _root_.openssl.functions.EVP_CIPHER_meth_set_set_asn1_params
  export _root_.openssl.functions.EVP_CIPHER_names_do_all
  export _root_.openssl.functions.EVP_CIPHER_param_to_asn1
  export _root_.openssl.functions.EVP_CIPHER_set_asn1_iv
  export _root_.openssl.functions.EVP_CIPHER_settable_ctx_params
  export _root_.openssl.functions.EVP_CIPHER_up_ref
  export _root_.openssl.functions.EVP_Cipher
  export _root_.openssl.functions.EVP_CipherFinal
  export _root_.openssl.functions.EVP_CipherFinal_ex
  export _root_.openssl.functions.EVP_CipherInit
  export _root_.openssl.functions.EVP_CipherInit_ex
  export _root_.openssl.functions.EVP_CipherInit_ex2
  export _root_.openssl.functions.EVP_CipherUpdate
  export _root_.openssl.functions.EVP_DecodeBlock
  export _root_.openssl.functions.EVP_DecodeFinal
  export _root_.openssl.functions.EVP_DecodeInit
  export _root_.openssl.functions.EVP_DecodeUpdate
  export _root_.openssl.functions.EVP_DecryptFinal
  export _root_.openssl.functions.EVP_DecryptFinal_ex
  export _root_.openssl.functions.EVP_DecryptInit
  export _root_.openssl.functions.EVP_DecryptInit_ex
  export _root_.openssl.functions.EVP_DecryptInit_ex2
  export _root_.openssl.functions.EVP_DecryptUpdate
  export _root_.openssl.functions.EVP_Digest
  export _root_.openssl.functions.EVP_DigestFinal
  export _root_.openssl.functions.EVP_DigestFinalXOF
  export _root_.openssl.functions.EVP_DigestFinal_ex
  export _root_.openssl.functions.EVP_DigestInit
  export _root_.openssl.functions.EVP_DigestInit_ex
  export _root_.openssl.functions.EVP_DigestInit_ex2
  export _root_.openssl.functions.EVP_DigestSign
  export _root_.openssl.functions.EVP_DigestSignFinal
  export _root_.openssl.functions.EVP_DigestSignInit
  export _root_.openssl.functions.EVP_DigestSignInit_ex
  export _root_.openssl.functions.EVP_DigestSignUpdate
  export _root_.openssl.functions.EVP_DigestUpdate
  export _root_.openssl.functions.EVP_DigestVerify
  export _root_.openssl.functions.EVP_DigestVerifyFinal
  export _root_.openssl.functions.EVP_DigestVerifyInit
  export _root_.openssl.functions.EVP_DigestVerifyInit_ex
  export _root_.openssl.functions.EVP_DigestVerifyUpdate
  export _root_.openssl.functions.EVP_ENCODE_CTX_copy
  export _root_.openssl.functions.EVP_ENCODE_CTX_free
  export _root_.openssl.functions.EVP_ENCODE_CTX_new
  export _root_.openssl.functions.EVP_ENCODE_CTX_num
  export _root_.openssl.functions.EVP_EncodeBlock
  export _root_.openssl.functions.EVP_EncodeFinal
  export _root_.openssl.functions.EVP_EncodeInit
  export _root_.openssl.functions.EVP_EncodeUpdate
  export _root_.openssl.functions.EVP_EncryptFinal
  export _root_.openssl.functions.EVP_EncryptFinal_ex
  export _root_.openssl.functions.EVP_EncryptInit
  export _root_.openssl.functions.EVP_EncryptInit_ex
  export _root_.openssl.functions.EVP_EncryptInit_ex2
  export _root_.openssl.functions.EVP_EncryptUpdate
  export _root_.openssl.functions.EVP_KEM_do_all_provided
  export _root_.openssl.functions.EVP_KEM_fetch
  export _root_.openssl.functions.EVP_KEM_free
  export _root_.openssl.functions.EVP_KEM_get0_description
  export _root_.openssl.functions.EVP_KEM_get0_name
  export _root_.openssl.functions.EVP_KEM_get0_provider
  export _root_.openssl.functions.EVP_KEM_gettable_ctx_params
  export _root_.openssl.functions.EVP_KEM_is_a
  export _root_.openssl.functions.EVP_KEM_names_do_all
  export _root_.openssl.functions.EVP_KEM_settable_ctx_params
  export _root_.openssl.functions.EVP_KEM_up_ref
  export _root_.openssl.functions.EVP_KEYEXCH_do_all_provided
  export _root_.openssl.functions.EVP_KEYEXCH_fetch
  export _root_.openssl.functions.EVP_KEYEXCH_free
  export _root_.openssl.functions.EVP_KEYEXCH_get0_description
  export _root_.openssl.functions.EVP_KEYEXCH_get0_name
  export _root_.openssl.functions.EVP_KEYEXCH_get0_provider
  export _root_.openssl.functions.EVP_KEYEXCH_gettable_ctx_params
  export _root_.openssl.functions.EVP_KEYEXCH_is_a
  export _root_.openssl.functions.EVP_KEYEXCH_names_do_all
  export _root_.openssl.functions.EVP_KEYEXCH_settable_ctx_params
  export _root_.openssl.functions.EVP_KEYEXCH_up_ref
  export _root_.openssl.functions.EVP_KEYMGMT_do_all_provided
  export _root_.openssl.functions.EVP_KEYMGMT_fetch
  export _root_.openssl.functions.EVP_KEYMGMT_free
  export _root_.openssl.functions.EVP_KEYMGMT_gen_settable_params
  export _root_.openssl.functions.EVP_KEYMGMT_get0_description
  export _root_.openssl.functions.EVP_KEYMGMT_get0_name
  export _root_.openssl.functions.EVP_KEYMGMT_get0_provider
  export _root_.openssl.functions.EVP_KEYMGMT_gettable_params
  export _root_.openssl.functions.EVP_KEYMGMT_is_a
  export _root_.openssl.functions.EVP_KEYMGMT_names_do_all
  export _root_.openssl.functions.EVP_KEYMGMT_settable_params
  export _root_.openssl.functions.EVP_KEYMGMT_up_ref
  export _root_.openssl.functions.EVP_MAC_CTX_dup
  export _root_.openssl.functions.EVP_MAC_CTX_free
  export _root_.openssl.functions.EVP_MAC_CTX_get0_mac
  export _root_.openssl.functions.EVP_MAC_CTX_get_block_size
  export _root_.openssl.functions.EVP_MAC_CTX_get_mac_size
  export _root_.openssl.functions.EVP_MAC_CTX_get_params
  export _root_.openssl.functions.EVP_MAC_CTX_gettable_params
  export _root_.openssl.functions.EVP_MAC_CTX_new
  export _root_.openssl.functions.EVP_MAC_CTX_set_params
  export _root_.openssl.functions.EVP_MAC_CTX_settable_params
  export _root_.openssl.functions.EVP_MAC_do_all_provided
  export _root_.openssl.functions.EVP_MAC_fetch
  export _root_.openssl.functions.EVP_MAC_final
  export _root_.openssl.functions.EVP_MAC_finalXOF
  export _root_.openssl.functions.EVP_MAC_free
  export _root_.openssl.functions.EVP_MAC_get0_description
  export _root_.openssl.functions.EVP_MAC_get0_name
  export _root_.openssl.functions.EVP_MAC_get0_provider
  export _root_.openssl.functions.EVP_MAC_get_params
  export _root_.openssl.functions.EVP_MAC_gettable_ctx_params
  export _root_.openssl.functions.EVP_MAC_gettable_params
  export _root_.openssl.functions.EVP_MAC_init
  export _root_.openssl.functions.EVP_MAC_is_a
  export _root_.openssl.functions.EVP_MAC_names_do_all
  export _root_.openssl.functions.EVP_MAC_settable_ctx_params
  export _root_.openssl.functions.EVP_MAC_up_ref
  export _root_.openssl.functions.EVP_MAC_update
  export _root_.openssl.functions.EVP_MD_CTX_clear_flags
  export _root_.openssl.functions.EVP_MD_CTX_copy
  export _root_.openssl.functions.EVP_MD_CTX_copy_ex
  export _root_.openssl.functions.EVP_MD_CTX_ctrl
  export _root_.openssl.functions.EVP_MD_CTX_dup
  export _root_.openssl.functions.EVP_MD_CTX_free
  export _root_.openssl.functions.EVP_MD_CTX_get0_md
  export _root_.openssl.functions.EVP_MD_CTX_get0_md_data
  export _root_.openssl.functions.EVP_MD_CTX_get1_md
  export _root_.openssl.functions.EVP_MD_CTX_get_params
  export _root_.openssl.functions.EVP_MD_CTX_get_pkey_ctx
  export _root_.openssl.functions.EVP_MD_CTX_gettable_params
  export _root_.openssl.functions.EVP_MD_CTX_md
  export _root_.openssl.functions.EVP_MD_CTX_new
  export _root_.openssl.functions.EVP_MD_CTX_reset
  export _root_.openssl.functions.EVP_MD_CTX_set_flags
  export _root_.openssl.functions.EVP_MD_CTX_set_params
  export _root_.openssl.functions.EVP_MD_CTX_set_pkey_ctx
  export _root_.openssl.functions.EVP_MD_CTX_set_update_fn
  export _root_.openssl.functions.EVP_MD_CTX_settable_params
  export _root_.openssl.functions.EVP_MD_CTX_test_flags
  export _root_.openssl.functions.EVP_MD_CTX_update_fn
  export _root_.openssl.functions.EVP_MD_do_all
  export _root_.openssl.functions.EVP_MD_do_all_provided
  export _root_.openssl.functions.EVP_MD_do_all_sorted
  export _root_.openssl.functions.EVP_MD_fetch
  export _root_.openssl.functions.EVP_MD_free
  export _root_.openssl.functions.EVP_MD_get0_description
  export _root_.openssl.functions.EVP_MD_get0_name
  export _root_.openssl.functions.EVP_MD_get0_provider
  export _root_.openssl.functions.EVP_MD_get_block_size
  export _root_.openssl.functions.EVP_MD_get_flags
  export _root_.openssl.functions.EVP_MD_get_params
  export _root_.openssl.functions.EVP_MD_get_pkey_type
  export _root_.openssl.functions.EVP_MD_get_size
  export _root_.openssl.functions.EVP_MD_get_type
  export _root_.openssl.functions.EVP_MD_gettable_ctx_params
  export _root_.openssl.functions.EVP_MD_gettable_params
  export _root_.openssl.functions.EVP_MD_is_a
  export _root_.openssl.functions.EVP_MD_meth_dup
  export _root_.openssl.functions.EVP_MD_meth_free
  export _root_.openssl.functions.EVP_MD_meth_get_app_datasize
  export _root_.openssl.functions.EVP_MD_meth_get_cleanup
  export _root_.openssl.functions.EVP_MD_meth_get_copy
  export _root_.openssl.functions.EVP_MD_meth_get_ctrl
  export _root_.openssl.functions.EVP_MD_meth_get_final
  export _root_.openssl.functions.EVP_MD_meth_get_flags
  export _root_.openssl.functions.EVP_MD_meth_get_init
  export _root_.openssl.functions.EVP_MD_meth_get_input_blocksize
  export _root_.openssl.functions.EVP_MD_meth_get_result_size
  export _root_.openssl.functions.EVP_MD_meth_get_update
  export _root_.openssl.functions.EVP_MD_meth_new
  export _root_.openssl.functions.EVP_MD_meth_set_app_datasize
  export _root_.openssl.functions.EVP_MD_meth_set_cleanup
  export _root_.openssl.functions.EVP_MD_meth_set_copy
  export _root_.openssl.functions.EVP_MD_meth_set_ctrl
  export _root_.openssl.functions.EVP_MD_meth_set_final
  export _root_.openssl.functions.EVP_MD_meth_set_flags
  export _root_.openssl.functions.EVP_MD_meth_set_init
  export _root_.openssl.functions.EVP_MD_meth_set_input_blocksize
  export _root_.openssl.functions.EVP_MD_meth_set_result_size
  export _root_.openssl.functions.EVP_MD_meth_set_update
  export _root_.openssl.functions.EVP_MD_names_do_all
  export _root_.openssl.functions.EVP_MD_settable_ctx_params
  export _root_.openssl.functions.EVP_MD_up_ref
  export _root_.openssl.functions.EVP_OpenFinal
  export _root_.openssl.functions.EVP_OpenInit
  export _root_.openssl.functions.EVP_PBE_CipherInit
  export _root_.openssl.functions.EVP_PBE_CipherInit_ex
  export _root_.openssl.functions.EVP_PBE_alg_add
  export _root_.openssl.functions.EVP_PBE_alg_add_type
  export _root_.openssl.functions.EVP_PBE_cleanup
  export _root_.openssl.functions.EVP_PBE_find
  export _root_.openssl.functions.EVP_PBE_find_ex
  export _root_.openssl.functions.EVP_PBE_get
  export _root_.openssl.functions.EVP_PBE_scrypt
  export _root_.openssl.functions.EVP_PBE_scrypt_ex
  export _root_.openssl.functions.EVP_PKEY_CTX_ctrl
  export _root_.openssl.functions.EVP_PKEY_CTX_ctrl_str
  export _root_.openssl.functions.EVP_PKEY_CTX_ctrl_uint64
  export _root_.openssl.functions.EVP_PKEY_CTX_dup
  export _root_.openssl.functions.EVP_PKEY_CTX_free
  export _root_.openssl.functions.EVP_PKEY_CTX_get0_libctx
  export _root_.openssl.functions.EVP_PKEY_CTX_get0_peerkey
  export _root_.openssl.functions.EVP_PKEY_CTX_get0_pkey
  export _root_.openssl.functions.EVP_PKEY_CTX_get0_propq
  export _root_.openssl.functions.EVP_PKEY_CTX_get0_provider
  export _root_.openssl.functions.EVP_PKEY_CTX_get1_id
  export _root_.openssl.functions.EVP_PKEY_CTX_get1_id_len
  export _root_.openssl.functions.EVP_PKEY_CTX_get_app_data
  export _root_.openssl.functions.EVP_PKEY_CTX_get_cb
  export _root_.openssl.functions.EVP_PKEY_CTX_get_data
  export _root_.openssl.functions.EVP_PKEY_CTX_get_group_name
  export _root_.openssl.functions.EVP_PKEY_CTX_get_keygen_info
  export _root_.openssl.functions.EVP_PKEY_CTX_get_operation
  export _root_.openssl.functions.EVP_PKEY_CTX_get_params
  export _root_.openssl.functions.EVP_PKEY_CTX_get_signature_md
  export _root_.openssl.functions.EVP_PKEY_CTX_gettable_params
  export _root_.openssl.functions.EVP_PKEY_CTX_hex2ctrl
  export _root_.openssl.functions.EVP_PKEY_CTX_is_a
  export _root_.openssl.functions.EVP_PKEY_CTX_md
  export _root_.openssl.functions.EVP_PKEY_CTX_new
  export _root_.openssl.functions.EVP_PKEY_CTX_new_from_name
  export _root_.openssl.functions.EVP_PKEY_CTX_new_from_pkey
  export _root_.openssl.functions.EVP_PKEY_CTX_new_id
  export _root_.openssl.functions.EVP_PKEY_CTX_set0_keygen_info
  export _root_.openssl.functions.EVP_PKEY_CTX_set1_id
  export _root_.openssl.functions.EVP_PKEY_CTX_set_app_data
  export _root_.openssl.functions.EVP_PKEY_CTX_set_cb
  export _root_.openssl.functions.EVP_PKEY_CTX_set_data
  export _root_.openssl.functions.EVP_PKEY_CTX_set_group_name
  export _root_.openssl.functions.EVP_PKEY_CTX_set_kem_op
  export _root_.openssl.functions.EVP_PKEY_CTX_set_mac_key
  export _root_.openssl.functions.EVP_PKEY_CTX_set_params
  export _root_.openssl.functions.EVP_PKEY_CTX_set_signature_md
  export _root_.openssl.functions.EVP_PKEY_CTX_settable_params
  export _root_.openssl.functions.EVP_PKEY_CTX_str2ctrl
  export _root_.openssl.functions.EVP_PKEY_Q_keygen
  export _root_.openssl.functions.EVP_PKEY_asn1_add0
  export _root_.openssl.functions.EVP_PKEY_asn1_add_alias
  export _root_.openssl.functions.EVP_PKEY_asn1_copy
  export _root_.openssl.functions.EVP_PKEY_asn1_find
  export _root_.openssl.functions.EVP_PKEY_asn1_find_str
  export _root_.openssl.functions.EVP_PKEY_asn1_free
  export _root_.openssl.functions.EVP_PKEY_asn1_get0
  export _root_.openssl.functions.EVP_PKEY_asn1_get0_info
  export _root_.openssl.functions.EVP_PKEY_asn1_get_count
  export _root_.openssl.functions.EVP_PKEY_asn1_new
  export _root_.openssl.functions.EVP_PKEY_asn1_set_check
  export _root_.openssl.functions.EVP_PKEY_asn1_set_ctrl
  export _root_.openssl.functions.EVP_PKEY_asn1_set_free
  export _root_.openssl.functions.EVP_PKEY_asn1_set_get_priv_key
  export _root_.openssl.functions.EVP_PKEY_asn1_set_get_pub_key
  export _root_.openssl.functions.EVP_PKEY_asn1_set_item
  export _root_.openssl.functions.EVP_PKEY_asn1_set_param
  export _root_.openssl.functions.EVP_PKEY_asn1_set_param_check
  export _root_.openssl.functions.EVP_PKEY_asn1_set_private
  export _root_.openssl.functions.EVP_PKEY_asn1_set_public
  export _root_.openssl.functions.EVP_PKEY_asn1_set_public_check
  export _root_.openssl.functions.EVP_PKEY_asn1_set_security_bits
  export _root_.openssl.functions.EVP_PKEY_asn1_set_set_priv_key
  export _root_.openssl.functions.EVP_PKEY_asn1_set_set_pub_key
  export _root_.openssl.functions.EVP_PKEY_asn1_set_siginf
  export _root_.openssl.functions.EVP_PKEY_assign
  export _root_.openssl.functions.EVP_PKEY_can_sign
  export _root_.openssl.functions.EVP_PKEY_check
  export _root_.openssl.functions.EVP_PKEY_cmp
  export _root_.openssl.functions.EVP_PKEY_cmp_parameters
  export _root_.openssl.functions.EVP_PKEY_copy_parameters
  export _root_.openssl.functions.EVP_PKEY_decapsulate
  export _root_.openssl.functions.EVP_PKEY_decapsulate_init
  export _root_.openssl.functions.EVP_PKEY_decrypt
  export _root_.openssl.functions.EVP_PKEY_decrypt_init
  export _root_.openssl.functions.EVP_PKEY_decrypt_init_ex
  export _root_.openssl.functions.EVP_PKEY_decrypt_old
  export _root_.openssl.functions.EVP_PKEY_derive
  export _root_.openssl.functions.EVP_PKEY_derive_init
  export _root_.openssl.functions.EVP_PKEY_derive_init_ex
  export _root_.openssl.functions.EVP_PKEY_derive_set_peer
  export _root_.openssl.functions.EVP_PKEY_derive_set_peer_ex
  export _root_.openssl.functions.EVP_PKEY_digestsign_supports_digest
  export _root_.openssl.functions.EVP_PKEY_dup
  export _root_.openssl.functions.EVP_PKEY_encapsulate
  export _root_.openssl.functions.EVP_PKEY_encapsulate_init
  export _root_.openssl.functions.EVP_PKEY_encrypt
  export _root_.openssl.functions.EVP_PKEY_encrypt_init
  export _root_.openssl.functions.EVP_PKEY_encrypt_init_ex
  export _root_.openssl.functions.EVP_PKEY_encrypt_old
  export _root_.openssl.functions.EVP_PKEY_eq
  export _root_.openssl.functions.EVP_PKEY_export
  export _root_.openssl.functions.EVP_PKEY_free
  export _root_.openssl.functions.EVP_PKEY_fromdata
  export _root_.openssl.functions.EVP_PKEY_fromdata_init
  export _root_.openssl.functions.EVP_PKEY_fromdata_settable
  export _root_.openssl.functions.EVP_PKEY_generate
  export _root_.openssl.functions.EVP_PKEY_get0
  export _root_.openssl.functions.EVP_PKEY_get0_DH
  export _root_.openssl.functions.EVP_PKEY_get0_DSA
  export _root_.openssl.functions.EVP_PKEY_get0_EC_KEY
  export _root_.openssl.functions.EVP_PKEY_get0_RSA
  export _root_.openssl.functions.EVP_PKEY_get0_asn1
  export _root_.openssl.functions.EVP_PKEY_get0_description
  export _root_.openssl.functions.EVP_PKEY_get0_engine
  export _root_.openssl.functions.EVP_PKEY_get0_hmac
  export _root_.openssl.functions.EVP_PKEY_get0_poly1305
  export _root_.openssl.functions.EVP_PKEY_get0_provider
  export _root_.openssl.functions.EVP_PKEY_get0_siphash
  export _root_.openssl.functions.EVP_PKEY_get0_type_name
  export _root_.openssl.functions.EVP_PKEY_get1_DH
  export _root_.openssl.functions.EVP_PKEY_get1_DSA
  export _root_.openssl.functions.EVP_PKEY_get1_EC_KEY
  export _root_.openssl.functions.EVP_PKEY_get1_RSA
  export _root_.openssl.functions.EVP_PKEY_get1_encoded_public_key
  export _root_.openssl.functions.EVP_PKEY_get_base_id
  export _root_.openssl.functions.EVP_PKEY_get_bits
  export _root_.openssl.functions.EVP_PKEY_get_bn_param
  export _root_.openssl.functions.EVP_PKEY_get_default_digest_name
  export _root_.openssl.functions.EVP_PKEY_get_default_digest_nid
  export _root_.openssl.functions.EVP_PKEY_get_ec_point_conv_form
  export _root_.openssl.functions.EVP_PKEY_get_ex_data
  export _root_.openssl.functions.EVP_PKEY_get_field_type
  export _root_.openssl.functions.EVP_PKEY_get_group_name
  export _root_.openssl.functions.EVP_PKEY_get_id
  export _root_.openssl.functions.EVP_PKEY_get_int_param
  export _root_.openssl.functions.EVP_PKEY_get_octet_string_param
  export _root_.openssl.functions.EVP_PKEY_get_params
  export _root_.openssl.functions.EVP_PKEY_get_raw_private_key
  export _root_.openssl.functions.EVP_PKEY_get_raw_public_key
  export _root_.openssl.functions.EVP_PKEY_get_security_bits
  export _root_.openssl.functions.EVP_PKEY_get_size
  export _root_.openssl.functions.EVP_PKEY_get_size_t_param
  export _root_.openssl.functions.EVP_PKEY_get_utf8_string_param
  export _root_.openssl.functions.EVP_PKEY_gettable_params
  export _root_.openssl.functions.EVP_PKEY_is_a
  export _root_.openssl.functions.EVP_PKEY_keygen
  export _root_.openssl.functions.EVP_PKEY_keygen_init
  export _root_.openssl.functions.EVP_PKEY_meth_add0
  export _root_.openssl.functions.EVP_PKEY_meth_copy
  export _root_.openssl.functions.EVP_PKEY_meth_find
  export _root_.openssl.functions.EVP_PKEY_meth_free
  export _root_.openssl.functions.EVP_PKEY_meth_get0
  export _root_.openssl.functions.EVP_PKEY_meth_get0_info
  export _root_.openssl.functions.EVP_PKEY_meth_get_check
  export _root_.openssl.functions.EVP_PKEY_meth_get_cleanup
  export _root_.openssl.functions.EVP_PKEY_meth_get_copy
  export _root_.openssl.functions.EVP_PKEY_meth_get_count
  export _root_.openssl.functions.EVP_PKEY_meth_get_ctrl
  export _root_.openssl.functions.EVP_PKEY_meth_get_decrypt
  export _root_.openssl.functions.EVP_PKEY_meth_get_derive
  export _root_.openssl.functions.EVP_PKEY_meth_get_digest_custom
  export _root_.openssl.functions.EVP_PKEY_meth_get_digestsign
  export _root_.openssl.functions.EVP_PKEY_meth_get_digestverify
  export _root_.openssl.functions.EVP_PKEY_meth_get_encrypt
  export _root_.openssl.functions.EVP_PKEY_meth_get_init
  export _root_.openssl.functions.EVP_PKEY_meth_get_keygen
  export _root_.openssl.functions.EVP_PKEY_meth_get_param_check
  export _root_.openssl.functions.EVP_PKEY_meth_get_paramgen
  export _root_.openssl.functions.EVP_PKEY_meth_get_public_check
  export _root_.openssl.functions.EVP_PKEY_meth_get_sign
  export _root_.openssl.functions.EVP_PKEY_meth_get_signctx
  export _root_.openssl.functions.EVP_PKEY_meth_get_verify
  export _root_.openssl.functions.EVP_PKEY_meth_get_verify_recover
  export _root_.openssl.functions.EVP_PKEY_meth_get_verifyctx
  export _root_.openssl.functions.EVP_PKEY_meth_new
  export _root_.openssl.functions.EVP_PKEY_meth_remove
  export _root_.openssl.functions.EVP_PKEY_meth_set_check
  export _root_.openssl.functions.EVP_PKEY_meth_set_cleanup
  export _root_.openssl.functions.EVP_PKEY_meth_set_copy
  export _root_.openssl.functions.EVP_PKEY_meth_set_ctrl
  export _root_.openssl.functions.EVP_PKEY_meth_set_decrypt
  export _root_.openssl.functions.EVP_PKEY_meth_set_derive
  export _root_.openssl.functions.EVP_PKEY_meth_set_digest_custom
  export _root_.openssl.functions.EVP_PKEY_meth_set_digestsign
  export _root_.openssl.functions.EVP_PKEY_meth_set_digestverify
  export _root_.openssl.functions.EVP_PKEY_meth_set_encrypt
  export _root_.openssl.functions.EVP_PKEY_meth_set_init
  export _root_.openssl.functions.EVP_PKEY_meth_set_keygen
  export _root_.openssl.functions.EVP_PKEY_meth_set_param_check
  export _root_.openssl.functions.EVP_PKEY_meth_set_paramgen
  export _root_.openssl.functions.EVP_PKEY_meth_set_public_check
  export _root_.openssl.functions.EVP_PKEY_meth_set_sign
  export _root_.openssl.functions.EVP_PKEY_meth_set_signctx
  export _root_.openssl.functions.EVP_PKEY_meth_set_verify
  export _root_.openssl.functions.EVP_PKEY_meth_set_verify_recover
  export _root_.openssl.functions.EVP_PKEY_meth_set_verifyctx
  export _root_.openssl.functions.EVP_PKEY_missing_parameters
  export _root_.openssl.functions.EVP_PKEY_new
  export _root_.openssl.functions.EVP_PKEY_new_CMAC_key
  export _root_.openssl.functions.EVP_PKEY_new_mac_key
  export _root_.openssl.functions.EVP_PKEY_new_raw_private_key
  export _root_.openssl.functions.EVP_PKEY_new_raw_private_key_ex
  export _root_.openssl.functions.EVP_PKEY_new_raw_public_key
  export _root_.openssl.functions.EVP_PKEY_new_raw_public_key_ex
  export _root_.openssl.functions.EVP_PKEY_pairwise_check
  export _root_.openssl.functions.EVP_PKEY_param_check
  export _root_.openssl.functions.EVP_PKEY_param_check_quick
  export _root_.openssl.functions.EVP_PKEY_parameters_eq
  export _root_.openssl.functions.EVP_PKEY_paramgen
  export _root_.openssl.functions.EVP_PKEY_paramgen_init
  export _root_.openssl.functions.EVP_PKEY_print_params
  export _root_.openssl.functions.EVP_PKEY_print_params_fp
  export _root_.openssl.functions.EVP_PKEY_print_private
  export _root_.openssl.functions.EVP_PKEY_print_private_fp
  export _root_.openssl.functions.EVP_PKEY_print_public
  export _root_.openssl.functions.EVP_PKEY_print_public_fp
  export _root_.openssl.functions.EVP_PKEY_private_check
  export _root_.openssl.functions.EVP_PKEY_public_check
  export _root_.openssl.functions.EVP_PKEY_public_check_quick
  export _root_.openssl.functions.EVP_PKEY_save_parameters
  export _root_.openssl.functions.EVP_PKEY_set1_DH
  export _root_.openssl.functions.EVP_PKEY_set1_DSA
  export _root_.openssl.functions.EVP_PKEY_set1_EC_KEY
  export _root_.openssl.functions.EVP_PKEY_set1_RSA
  export _root_.openssl.functions.EVP_PKEY_set1_encoded_public_key
  export _root_.openssl.functions.EVP_PKEY_set1_engine
  export _root_.openssl.functions.EVP_PKEY_set_bn_param
  export _root_.openssl.functions.EVP_PKEY_set_ex_data
  export _root_.openssl.functions.EVP_PKEY_set_int_param
  export _root_.openssl.functions.EVP_PKEY_set_octet_string_param
  export _root_.openssl.functions.EVP_PKEY_set_params
  export _root_.openssl.functions.EVP_PKEY_set_size_t_param
  export _root_.openssl.functions.EVP_PKEY_set_type
  export _root_.openssl.functions.EVP_PKEY_set_type_by_keymgmt
  export _root_.openssl.functions.EVP_PKEY_set_type_str
  export _root_.openssl.functions.EVP_PKEY_set_utf8_string_param
  export _root_.openssl.functions.EVP_PKEY_settable_params
  export _root_.openssl.functions.EVP_PKEY_sign
  export _root_.openssl.functions.EVP_PKEY_sign_init
  export _root_.openssl.functions.EVP_PKEY_sign_init_ex
  export _root_.openssl.functions.EVP_PKEY_todata
  export _root_.openssl.functions.EVP_PKEY_type
  export _root_.openssl.functions.EVP_PKEY_type_names_do_all
  export _root_.openssl.functions.EVP_PKEY_up_ref
  export _root_.openssl.functions.EVP_PKEY_verify
  export _root_.openssl.functions.EVP_PKEY_verify_init
  export _root_.openssl.functions.EVP_PKEY_verify_init_ex
  export _root_.openssl.functions.EVP_PKEY_verify_recover
  export _root_.openssl.functions.EVP_PKEY_verify_recover_init
  export _root_.openssl.functions.EVP_PKEY_verify_recover_init_ex
  export _root_.openssl.functions.EVP_Q_digest
  export _root_.openssl.functions.EVP_Q_mac
  export _root_.openssl.functions.EVP_RAND_CTX_free
  export _root_.openssl.functions.EVP_RAND_CTX_get0_rand
  export _root_.openssl.functions.EVP_RAND_CTX_get_params
  export _root_.openssl.functions.EVP_RAND_CTX_gettable_params
  export _root_.openssl.functions.EVP_RAND_CTX_new
  export _root_.openssl.functions.EVP_RAND_CTX_set_params
  export _root_.openssl.functions.EVP_RAND_CTX_settable_params
  export _root_.openssl.functions.EVP_RAND_CTX_up_ref
  export _root_.openssl.functions.EVP_RAND_do_all_provided
  export _root_.openssl.functions.EVP_RAND_enable_locking
  export _root_.openssl.functions.EVP_RAND_fetch
  export _root_.openssl.functions.EVP_RAND_free
  export _root_.openssl.functions.EVP_RAND_generate
  export _root_.openssl.functions.EVP_RAND_get0_description
  export _root_.openssl.functions.EVP_RAND_get0_name
  export _root_.openssl.functions.EVP_RAND_get0_provider
  export _root_.openssl.functions.EVP_RAND_get_params
  export _root_.openssl.functions.EVP_RAND_get_state
  export _root_.openssl.functions.EVP_RAND_get_strength
  export _root_.openssl.functions.EVP_RAND_gettable_ctx_params
  export _root_.openssl.functions.EVP_RAND_gettable_params
  export _root_.openssl.functions.EVP_RAND_instantiate
  export _root_.openssl.functions.EVP_RAND_is_a
  export _root_.openssl.functions.EVP_RAND_names_do_all
  export _root_.openssl.functions.EVP_RAND_nonce
  export _root_.openssl.functions.EVP_RAND_reseed
  export _root_.openssl.functions.EVP_RAND_settable_ctx_params
  export _root_.openssl.functions.EVP_RAND_uninstantiate
  export _root_.openssl.functions.EVP_RAND_up_ref
  export _root_.openssl.functions.EVP_RAND_verify_zeroization
  export _root_.openssl.functions.EVP_SIGNATURE_do_all_provided
  export _root_.openssl.functions.EVP_SIGNATURE_fetch
  export _root_.openssl.functions.EVP_SIGNATURE_free
  export _root_.openssl.functions.EVP_SIGNATURE_get0_description
  export _root_.openssl.functions.EVP_SIGNATURE_get0_name
  export _root_.openssl.functions.EVP_SIGNATURE_get0_provider
  export _root_.openssl.functions.EVP_SIGNATURE_gettable_ctx_params
  export _root_.openssl.functions.EVP_SIGNATURE_is_a
  export _root_.openssl.functions.EVP_SIGNATURE_names_do_all
  export _root_.openssl.functions.EVP_SIGNATURE_settable_ctx_params
  export _root_.openssl.functions.EVP_SIGNATURE_up_ref
  export _root_.openssl.functions.EVP_SealFinal
  export _root_.openssl.functions.EVP_SealInit
  export _root_.openssl.functions.EVP_SignFinal
  export _root_.openssl.functions.EVP_SignFinal_ex
  export _root_.openssl.functions.EVP_VerifyFinal
  export _root_.openssl.functions.EVP_VerifyFinal_ex
  export _root_.openssl.functions.EVP_add_alg_module
  export _root_.openssl.functions.EVP_add_cipher
  export _root_.openssl.functions.EVP_add_digest
  export _root_.openssl.functions.EVP_aes_128_cbc
  export _root_.openssl.functions.EVP_aes_128_cbc_hmac_sha1
  export _root_.openssl.functions.EVP_aes_128_cbc_hmac_sha256
  export _root_.openssl.functions.EVP_aes_128_ccm
  export _root_.openssl.functions.EVP_aes_128_cfb1
  export _root_.openssl.functions.EVP_aes_128_cfb128
  export _root_.openssl.functions.EVP_aes_128_cfb8
  export _root_.openssl.functions.EVP_aes_128_ctr
  export _root_.openssl.functions.EVP_aes_128_ecb
  export _root_.openssl.functions.EVP_aes_128_gcm
  export _root_.openssl.functions.EVP_aes_128_ocb
  export _root_.openssl.functions.EVP_aes_128_ofb
  export _root_.openssl.functions.EVP_aes_128_wrap
  export _root_.openssl.functions.EVP_aes_128_wrap_pad
  export _root_.openssl.functions.EVP_aes_128_xts
  export _root_.openssl.functions.EVP_aes_192_cbc
  export _root_.openssl.functions.EVP_aes_192_ccm
  export _root_.openssl.functions.EVP_aes_192_cfb1
  export _root_.openssl.functions.EVP_aes_192_cfb128
  export _root_.openssl.functions.EVP_aes_192_cfb8
  export _root_.openssl.functions.EVP_aes_192_ctr
  export _root_.openssl.functions.EVP_aes_192_ecb
  export _root_.openssl.functions.EVP_aes_192_gcm
  export _root_.openssl.functions.EVP_aes_192_ocb
  export _root_.openssl.functions.EVP_aes_192_ofb
  export _root_.openssl.functions.EVP_aes_192_wrap
  export _root_.openssl.functions.EVP_aes_192_wrap_pad
  export _root_.openssl.functions.EVP_aes_256_cbc
  export _root_.openssl.functions.EVP_aes_256_cbc_hmac_sha1
  export _root_.openssl.functions.EVP_aes_256_cbc_hmac_sha256
  export _root_.openssl.functions.EVP_aes_256_ccm
  export _root_.openssl.functions.EVP_aes_256_cfb1
  export _root_.openssl.functions.EVP_aes_256_cfb128
  export _root_.openssl.functions.EVP_aes_256_cfb8
  export _root_.openssl.functions.EVP_aes_256_ctr
  export _root_.openssl.functions.EVP_aes_256_ecb
  export _root_.openssl.functions.EVP_aes_256_gcm
  export _root_.openssl.functions.EVP_aes_256_ocb
  export _root_.openssl.functions.EVP_aes_256_ofb
  export _root_.openssl.functions.EVP_aes_256_wrap
  export _root_.openssl.functions.EVP_aes_256_wrap_pad
  export _root_.openssl.functions.EVP_aes_256_xts
  export _root_.openssl.functions.EVP_aria_128_cbc
  export _root_.openssl.functions.EVP_aria_128_ccm
  export _root_.openssl.functions.EVP_aria_128_cfb1
  export _root_.openssl.functions.EVP_aria_128_cfb128
  export _root_.openssl.functions.EVP_aria_128_cfb8
  export _root_.openssl.functions.EVP_aria_128_ctr
  export _root_.openssl.functions.EVP_aria_128_ecb
  export _root_.openssl.functions.EVP_aria_128_gcm
  export _root_.openssl.functions.EVP_aria_128_ofb
  export _root_.openssl.functions.EVP_aria_192_cbc
  export _root_.openssl.functions.EVP_aria_192_ccm
  export _root_.openssl.functions.EVP_aria_192_cfb1
  export _root_.openssl.functions.EVP_aria_192_cfb128
  export _root_.openssl.functions.EVP_aria_192_cfb8
  export _root_.openssl.functions.EVP_aria_192_ctr
  export _root_.openssl.functions.EVP_aria_192_ecb
  export _root_.openssl.functions.EVP_aria_192_gcm
  export _root_.openssl.functions.EVP_aria_192_ofb
  export _root_.openssl.functions.EVP_aria_256_cbc
  export _root_.openssl.functions.EVP_aria_256_ccm
  export _root_.openssl.functions.EVP_aria_256_cfb1
  export _root_.openssl.functions.EVP_aria_256_cfb128
  export _root_.openssl.functions.EVP_aria_256_cfb8
  export _root_.openssl.functions.EVP_aria_256_ctr
  export _root_.openssl.functions.EVP_aria_256_ecb
  export _root_.openssl.functions.EVP_aria_256_gcm
  export _root_.openssl.functions.EVP_aria_256_ofb
  export _root_.openssl.functions.EVP_bf_cbc
  export _root_.openssl.functions.EVP_bf_cfb64
  export _root_.openssl.functions.EVP_bf_ecb
  export _root_.openssl.functions.EVP_bf_ofb
  export _root_.openssl.functions.EVP_blake2b512
  export _root_.openssl.functions.EVP_blake2s256
  export _root_.openssl.functions.EVP_camellia_128_cbc
  export _root_.openssl.functions.EVP_camellia_128_cfb1
  export _root_.openssl.functions.EVP_camellia_128_cfb128
  export _root_.openssl.functions.EVP_camellia_128_cfb8
  export _root_.openssl.functions.EVP_camellia_128_ctr
  export _root_.openssl.functions.EVP_camellia_128_ecb
  export _root_.openssl.functions.EVP_camellia_128_ofb
  export _root_.openssl.functions.EVP_camellia_192_cbc
  export _root_.openssl.functions.EVP_camellia_192_cfb1
  export _root_.openssl.functions.EVP_camellia_192_cfb128
  export _root_.openssl.functions.EVP_camellia_192_cfb8
  export _root_.openssl.functions.EVP_camellia_192_ctr
  export _root_.openssl.functions.EVP_camellia_192_ecb
  export _root_.openssl.functions.EVP_camellia_192_ofb
  export _root_.openssl.functions.EVP_camellia_256_cbc
  export _root_.openssl.functions.EVP_camellia_256_cfb1
  export _root_.openssl.functions.EVP_camellia_256_cfb128
  export _root_.openssl.functions.EVP_camellia_256_cfb8
  export _root_.openssl.functions.EVP_camellia_256_ctr
  export _root_.openssl.functions.EVP_camellia_256_ecb
  export _root_.openssl.functions.EVP_camellia_256_ofb
  export _root_.openssl.functions.EVP_cast5_cbc
  export _root_.openssl.functions.EVP_cast5_cfb64
  export _root_.openssl.functions.EVP_cast5_ecb
  export _root_.openssl.functions.EVP_cast5_ofb
  export _root_.openssl.functions.EVP_chacha20
  export _root_.openssl.functions.EVP_chacha20_poly1305
  export _root_.openssl.functions.EVP_default_properties_enable_fips
  export _root_.openssl.functions.EVP_default_properties_is_fips_enabled
  export _root_.openssl.functions.EVP_des_cbc
  export _root_.openssl.functions.EVP_des_cfb1
  export _root_.openssl.functions.EVP_des_cfb64
  export _root_.openssl.functions.EVP_des_cfb8
  export _root_.openssl.functions.EVP_des_ecb
  export _root_.openssl.functions.EVP_des_ede
  export _root_.openssl.functions.EVP_des_ede3
  export _root_.openssl.functions.EVP_des_ede3_cbc
  export _root_.openssl.functions.EVP_des_ede3_cfb1
  export _root_.openssl.functions.EVP_des_ede3_cfb64
  export _root_.openssl.functions.EVP_des_ede3_cfb8
  export _root_.openssl.functions.EVP_des_ede3_ecb
  export _root_.openssl.functions.EVP_des_ede3_ofb
  export _root_.openssl.functions.EVP_des_ede3_wrap
  export _root_.openssl.functions.EVP_des_ede_cbc
  export _root_.openssl.functions.EVP_des_ede_cfb64
  export _root_.openssl.functions.EVP_des_ede_ecb
  export _root_.openssl.functions.EVP_des_ede_ofb
  export _root_.openssl.functions.EVP_des_ofb
  export _root_.openssl.functions.EVP_desx_cbc
  export _root_.openssl.functions.EVP_enc_null
  export _root_.openssl.functions.EVP_get_cipherbyname
  export _root_.openssl.functions.EVP_get_digestbyname
  export _root_.openssl.functions.EVP_get_pw_prompt
  export _root_.openssl.functions.EVP_idea_cbc
  export _root_.openssl.functions.EVP_idea_cfb64
  export _root_.openssl.functions.EVP_idea_ecb
  export _root_.openssl.functions.EVP_idea_ofb
  export _root_.openssl.functions.EVP_md4
  export _root_.openssl.functions.EVP_md5
  export _root_.openssl.functions.EVP_md5_sha1
  export _root_.openssl.functions.EVP_md_null
  export _root_.openssl.functions.EVP_mdc2
  export _root_.openssl.functions.EVP_rc2_40_cbc
  export _root_.openssl.functions.EVP_rc2_64_cbc
  export _root_.openssl.functions.EVP_rc2_cbc
  export _root_.openssl.functions.EVP_rc2_cfb64
  export _root_.openssl.functions.EVP_rc2_ecb
  export _root_.openssl.functions.EVP_rc2_ofb
  export _root_.openssl.functions.EVP_rc4
  export _root_.openssl.functions.EVP_rc4_40
  export _root_.openssl.functions.EVP_rc4_hmac_md5
  export _root_.openssl.functions.EVP_read_pw_string
  export _root_.openssl.functions.EVP_read_pw_string_min
  export _root_.openssl.functions.EVP_ripemd160
  export _root_.openssl.functions.EVP_seed_cbc
  export _root_.openssl.functions.EVP_seed_cfb128
  export _root_.openssl.functions.EVP_seed_ecb
  export _root_.openssl.functions.EVP_seed_ofb
  export _root_.openssl.functions.EVP_set_default_properties
  export _root_.openssl.functions.EVP_set_pw_prompt
  export _root_.openssl.functions.EVP_sha1
  export _root_.openssl.functions.EVP_sha224
  export _root_.openssl.functions.EVP_sha256
  export _root_.openssl.functions.EVP_sha384
  export _root_.openssl.functions.EVP_sha3_224
  export _root_.openssl.functions.EVP_sha3_256
  export _root_.openssl.functions.EVP_sha3_384
  export _root_.openssl.functions.EVP_sha3_512
  export _root_.openssl.functions.EVP_sha512
  export _root_.openssl.functions.EVP_sha512_224
  export _root_.openssl.functions.EVP_sha512_256
  export _root_.openssl.functions.EVP_shake128
  export _root_.openssl.functions.EVP_shake256
  export _root_.openssl.functions.EVP_sm3
  export _root_.openssl.functions.EVP_sm4_cbc
  export _root_.openssl.functions.EVP_sm4_cfb128
  export _root_.openssl.functions.EVP_sm4_ctr
  export _root_.openssl.functions.EVP_sm4_ecb
  export _root_.openssl.functions.EVP_sm4_ofb
  export _root_.openssl.functions.EVP_whirlpool
  export _root_.openssl.functions.OBJ_NAME_add
  export _root_.openssl.functions.OBJ_NAME_cleanup
  export _root_.openssl.functions.OBJ_NAME_do_all
  export _root_.openssl.functions.OBJ_NAME_do_all_sorted
  export _root_.openssl.functions.OBJ_NAME_get
  export _root_.openssl.functions.OBJ_NAME_init
  export _root_.openssl.functions.OBJ_NAME_new_index
  export _root_.openssl.functions.OBJ_NAME_remove
  export _root_.openssl.functions.OBJ_add_object
  export _root_.openssl.functions.OBJ_add_sigid
  export _root_.openssl.functions.OBJ_bsearch_
  export _root_.openssl.functions.OBJ_bsearch_ex_
  export _root_.openssl.functions.OBJ_cmp
  export _root_.openssl.functions.OBJ_create
  export _root_.openssl.functions.OBJ_create_objects
  export _root_.openssl.functions.OBJ_dup
  export _root_.openssl.functions.OBJ_find_sigid_algs
  export _root_.openssl.functions.OBJ_find_sigid_by_algs
  export _root_.openssl.functions.OBJ_get0_data
  export _root_.openssl.functions.OBJ_length
  export _root_.openssl.functions.OBJ_ln2nid
  export _root_.openssl.functions.OBJ_new_nid
  export _root_.openssl.functions.OBJ_nid2ln
  export _root_.openssl.functions.OBJ_nid2obj
  export _root_.openssl.functions.OBJ_nid2sn
  export _root_.openssl.functions.OBJ_obj2nid
  export _root_.openssl.functions.OBJ_obj2txt
  export _root_.openssl.functions.OBJ_sigid_free
  export _root_.openssl.functions.OBJ_sn2nid
  export _root_.openssl.functions.OBJ_txt2nid
  export _root_.openssl.functions.OBJ_txt2obj
  export _root_.openssl.functions.OPENSSL_INIT_free
  export _root_.openssl.functions.OPENSSL_INIT_new
  export _root_.openssl.functions.OPENSSL_INIT_set_config_appname
  export _root_.openssl.functions.OPENSSL_INIT_set_config_file_flags
  export _root_.openssl.functions.OPENSSL_INIT_set_config_filename
  export _root_.openssl.functions.OPENSSL_atexit
  export _root_.openssl.functions.OPENSSL_buf2hexstr
  export _root_.openssl.functions.OPENSSL_buf2hexstr_ex
  export _root_.openssl.functions.OPENSSL_cleanse
  export _root_.openssl.functions.OPENSSL_cleanup
  export _root_.openssl.functions.OPENSSL_die
  export _root_.openssl.functions.OPENSSL_fork_child
  export _root_.openssl.functions.OPENSSL_fork_parent
  export _root_.openssl.functions.OPENSSL_fork_prepare
  export _root_.openssl.functions.OPENSSL_gmtime
  export _root_.openssl.functions.OPENSSL_gmtime_adj
  export _root_.openssl.functions.OPENSSL_gmtime_diff
  export _root_.openssl.functions.OPENSSL_hexchar2int
  export _root_.openssl.functions.OPENSSL_hexstr2buf
  export _root_.openssl.functions.OPENSSL_hexstr2buf_ex
  export _root_.openssl.functions.OPENSSL_info
  export _root_.openssl.functions.OPENSSL_init
  export _root_.openssl.functions.OPENSSL_init_crypto
  export _root_.openssl.functions.OPENSSL_isservice
  export _root_.openssl.functions.OPENSSL_issetugid
  export _root_.openssl.functions.OPENSSL_sk_deep_copy
  export _root_.openssl.functions.OPENSSL_sk_delete
  export _root_.openssl.functions.OPENSSL_sk_delete_ptr
  export _root_.openssl.functions.OPENSSL_sk_dup
  export _root_.openssl.functions.OPENSSL_sk_find
  export _root_.openssl.functions.OPENSSL_sk_find_all
  export _root_.openssl.functions.OPENSSL_sk_find_ex
  export _root_.openssl.functions.OPENSSL_sk_free
  export _root_.openssl.functions.OPENSSL_sk_insert
  export _root_.openssl.functions.OPENSSL_sk_is_sorted
  export _root_.openssl.functions.OPENSSL_sk_new
  export _root_.openssl.functions.OPENSSL_sk_new_null
  export _root_.openssl.functions.OPENSSL_sk_new_reserve
  export _root_.openssl.functions.OPENSSL_sk_num
  export _root_.openssl.functions.OPENSSL_sk_pop
  export _root_.openssl.functions.OPENSSL_sk_pop_free
  export _root_.openssl.functions.OPENSSL_sk_push
  export _root_.openssl.functions.OPENSSL_sk_reserve
  export _root_.openssl.functions.OPENSSL_sk_set
  export _root_.openssl.functions.OPENSSL_sk_set_cmp_func
  export _root_.openssl.functions.OPENSSL_sk_shift
  export _root_.openssl.functions.OPENSSL_sk_sort
  export _root_.openssl.functions.OPENSSL_sk_unshift
  export _root_.openssl.functions.OPENSSL_sk_value
  export _root_.openssl.functions.OPENSSL_sk_zero
  export _root_.openssl.functions.OPENSSL_strcasecmp
  export _root_.openssl.functions.OPENSSL_strlcat
  export _root_.openssl.functions.OPENSSL_strlcpy
  export _root_.openssl.functions.OPENSSL_strncasecmp
  export _root_.openssl.functions.OPENSSL_strnlen
  export _root_.openssl.functions.OPENSSL_thread_stop
  export _root_.openssl.functions.OPENSSL_thread_stop_ex
  export _root_.openssl.functions.OPENSSL_version_build_metadata
  export _root_.openssl.functions.OPENSSL_version_major
  export _root_.openssl.functions.OPENSSL_version_minor
  export _root_.openssl.functions.OPENSSL_version_patch
  export _root_.openssl.functions.OPENSSL_version_pre_release
  export _root_.openssl.functions.OSSL_FUNC_BIO_ctrl
  export _root_.openssl.functions.OSSL_FUNC_BIO_free
  export _root_.openssl.functions.OSSL_FUNC_BIO_gets
  export _root_.openssl.functions.OSSL_FUNC_BIO_new_file
  export _root_.openssl.functions.OSSL_FUNC_BIO_new_membuf
  export _root_.openssl.functions.OSSL_FUNC_BIO_puts
  export _root_.openssl.functions.OSSL_FUNC_BIO_read_ex
  export _root_.openssl.functions.OSSL_FUNC_BIO_up_ref
  export _root_.openssl.functions.OSSL_FUNC_BIO_vprintf
  export _root_.openssl.functions.OSSL_FUNC_BIO_vsnprintf
  export _root_.openssl.functions.OSSL_FUNC_BIO_write_ex
  export _root_.openssl.functions.OSSL_FUNC_CRYPTO_clear_free
  export _root_.openssl.functions.OSSL_FUNC_CRYPTO_clear_realloc
  export _root_.openssl.functions.OSSL_FUNC_CRYPTO_free
  export _root_.openssl.functions.OSSL_FUNC_CRYPTO_malloc
  export _root_.openssl.functions.OSSL_FUNC_CRYPTO_realloc
  export _root_.openssl.functions.OSSL_FUNC_CRYPTO_secure_allocated
  export _root_.openssl.functions.OSSL_FUNC_CRYPTO_secure_clear_free
  export _root_.openssl.functions.OSSL_FUNC_CRYPTO_secure_free
  export _root_.openssl.functions.OSSL_FUNC_CRYPTO_secure_malloc
  export _root_.openssl.functions.OSSL_FUNC_CRYPTO_secure_zalloc
  export _root_.openssl.functions.OSSL_FUNC_CRYPTO_zalloc
  export _root_.openssl.functions.OSSL_FUNC_OPENSSL_cleanse
  export _root_.openssl.functions.OSSL_FUNC_asym_cipher_decrypt
  export _root_.openssl.functions.OSSL_FUNC_asym_cipher_decrypt_init
  export _root_.openssl.functions.OSSL_FUNC_asym_cipher_dupctx
  export _root_.openssl.functions.OSSL_FUNC_asym_cipher_encrypt
  export _root_.openssl.functions.OSSL_FUNC_asym_cipher_encrypt_init
  export _root_.openssl.functions.OSSL_FUNC_asym_cipher_freectx
  export _root_.openssl.functions.OSSL_FUNC_asym_cipher_get_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_asym_cipher_gettable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_asym_cipher_newctx
  export _root_.openssl.functions.OSSL_FUNC_asym_cipher_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_asym_cipher_settable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_cipher_cipher
  export _root_.openssl.functions.OSSL_FUNC_cipher_decrypt_init
  export _root_.openssl.functions.OSSL_FUNC_cipher_dupctx
  export _root_.openssl.functions.OSSL_FUNC_cipher_encrypt_init
  export _root_.openssl.functions.OSSL_FUNC_cipher_final
  export _root_.openssl.functions.OSSL_FUNC_cipher_freectx
  export _root_.openssl.functions.OSSL_FUNC_cipher_get_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_cipher_get_params
  export _root_.openssl.functions.OSSL_FUNC_cipher_gettable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_cipher_gettable_params
  export _root_.openssl.functions.OSSL_FUNC_cipher_newctx
  export _root_.openssl.functions.OSSL_FUNC_cipher_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_cipher_settable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_cipher_update
  export _root_.openssl.functions.OSSL_FUNC_cleanup_entropy
  export _root_.openssl.functions.OSSL_FUNC_cleanup_nonce
  export _root_.openssl.functions.OSSL_FUNC_core_clear_last_error_mark
  export _root_.openssl.functions.OSSL_FUNC_core_get_libctx
  export _root_.openssl.functions.OSSL_FUNC_core_get_params
  export _root_.openssl.functions.OSSL_FUNC_core_gettable_params
  export _root_.openssl.functions.OSSL_FUNC_core_new_error
  export _root_.openssl.functions.OSSL_FUNC_core_obj_add_sigid
  export _root_.openssl.functions.OSSL_FUNC_core_obj_create
  export _root_.openssl.functions.OSSL_FUNC_core_pop_error_to_mark
  export _root_.openssl.functions.OSSL_FUNC_core_set_error_debug
  export _root_.openssl.functions.OSSL_FUNC_core_set_error_mark
  export _root_.openssl.functions.OSSL_FUNC_core_thread_start
  export _root_.openssl.functions.OSSL_FUNC_core_vset_error
  export _root_.openssl.functions.OSSL_FUNC_decoder_decode
  export _root_.openssl.functions.OSSL_FUNC_decoder_does_selection
  export _root_.openssl.functions.OSSL_FUNC_decoder_export_object
  export _root_.openssl.functions.OSSL_FUNC_decoder_freectx
  export _root_.openssl.functions.OSSL_FUNC_decoder_get_params
  export _root_.openssl.functions.OSSL_FUNC_decoder_gettable_params
  export _root_.openssl.functions.OSSL_FUNC_decoder_newctx
  export _root_.openssl.functions.OSSL_FUNC_decoder_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_decoder_settable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_digest_digest
  export _root_.openssl.functions.OSSL_FUNC_digest_dupctx
  export _root_.openssl.functions.OSSL_FUNC_digest_final
  export _root_.openssl.functions.OSSL_FUNC_digest_freectx
  export _root_.openssl.functions.OSSL_FUNC_digest_get_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_digest_get_params
  export _root_.openssl.functions.OSSL_FUNC_digest_gettable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_digest_gettable_params
  export _root_.openssl.functions.OSSL_FUNC_digest_init
  export _root_.openssl.functions.OSSL_FUNC_digest_newctx
  export _root_.openssl.functions.OSSL_FUNC_digest_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_digest_settable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_digest_update
  export _root_.openssl.functions.OSSL_FUNC_encoder_does_selection
  export _root_.openssl.functions.OSSL_FUNC_encoder_encode
  export _root_.openssl.functions.OSSL_FUNC_encoder_free_object
  export _root_.openssl.functions.OSSL_FUNC_encoder_freectx
  export _root_.openssl.functions.OSSL_FUNC_encoder_get_params
  export _root_.openssl.functions.OSSL_FUNC_encoder_gettable_params
  export _root_.openssl.functions.OSSL_FUNC_encoder_import_object
  export _root_.openssl.functions.OSSL_FUNC_encoder_newctx
  export _root_.openssl.functions.OSSL_FUNC_encoder_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_encoder_settable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_get_entropy
  export _root_.openssl.functions.OSSL_FUNC_get_nonce
  export _root_.openssl.functions.OSSL_FUNC_kdf_derive
  export _root_.openssl.functions.OSSL_FUNC_kdf_dupctx
  export _root_.openssl.functions.OSSL_FUNC_kdf_freectx
  export _root_.openssl.functions.OSSL_FUNC_kdf_get_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_kdf_get_params
  export _root_.openssl.functions.OSSL_FUNC_kdf_gettable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_kdf_gettable_params
  export _root_.openssl.functions.OSSL_FUNC_kdf_newctx
  export _root_.openssl.functions.OSSL_FUNC_kdf_reset
  export _root_.openssl.functions.OSSL_FUNC_kdf_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_kdf_settable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_kem_decapsulate
  export _root_.openssl.functions.OSSL_FUNC_kem_decapsulate_init
  export _root_.openssl.functions.OSSL_FUNC_kem_dupctx
  export _root_.openssl.functions.OSSL_FUNC_kem_encapsulate
  export _root_.openssl.functions.OSSL_FUNC_kem_encapsulate_init
  export _root_.openssl.functions.OSSL_FUNC_kem_freectx
  export _root_.openssl.functions.OSSL_FUNC_kem_get_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_kem_gettable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_kem_newctx
  export _root_.openssl.functions.OSSL_FUNC_kem_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_kem_settable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_keyexch_derive
  export _root_.openssl.functions.OSSL_FUNC_keyexch_dupctx
  export _root_.openssl.functions.OSSL_FUNC_keyexch_freectx
  export _root_.openssl.functions.OSSL_FUNC_keyexch_get_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_keyexch_gettable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_keyexch_init
  export _root_.openssl.functions.OSSL_FUNC_keyexch_newctx
  export _root_.openssl.functions.OSSL_FUNC_keyexch_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_keyexch_set_peer
  export _root_.openssl.functions.OSSL_FUNC_keyexch_settable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_dup
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_export
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_export_types
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_free
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_gen
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_gen_cleanup
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_gen_init
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_gen_set_params
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_gen_set_template
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_gen_settable_params
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_get_params
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_gettable_params
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_has
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_import
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_import_types
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_load
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_match
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_new
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_query_operation_name
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_set_params
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_settable_params
  export _root_.openssl.functions.OSSL_FUNC_keymgmt_validate
  export _root_.openssl.functions.OSSL_FUNC_mac_dupctx
  export _root_.openssl.functions.OSSL_FUNC_mac_final
  export _root_.openssl.functions.OSSL_FUNC_mac_freectx
  export _root_.openssl.functions.OSSL_FUNC_mac_get_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_mac_get_params
  export _root_.openssl.functions.OSSL_FUNC_mac_gettable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_mac_gettable_params
  export _root_.openssl.functions.OSSL_FUNC_mac_init
  export _root_.openssl.functions.OSSL_FUNC_mac_newctx
  export _root_.openssl.functions.OSSL_FUNC_mac_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_mac_settable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_mac_update
  export _root_.openssl.functions.OSSL_FUNC_provider_deregister_child_cb
  export _root_.openssl.functions.OSSL_FUNC_provider_free
  export _root_.openssl.functions.OSSL_FUNC_provider_get0_dispatch
  export _root_.openssl.functions.OSSL_FUNC_provider_get0_provider_ctx
  export _root_.openssl.functions.OSSL_FUNC_provider_get_capabilities
  export _root_.openssl.functions.OSSL_FUNC_provider_get_params
  export _root_.openssl.functions.OSSL_FUNC_provider_get_reason_strings
  export _root_.openssl.functions.OSSL_FUNC_provider_gettable_params
  export _root_.openssl.functions.OSSL_FUNC_provider_name
  export _root_.openssl.functions.OSSL_FUNC_provider_query_operation
  export _root_.openssl.functions.OSSL_FUNC_provider_register_child_cb
  export _root_.openssl.functions.OSSL_FUNC_provider_self_test
  export _root_.openssl.functions.OSSL_FUNC_provider_teardown
  export _root_.openssl.functions.OSSL_FUNC_provider_unquery_operation
  export _root_.openssl.functions.OSSL_FUNC_provider_up_ref
  export _root_.openssl.functions.OSSL_FUNC_rand_clear_seed
  export _root_.openssl.functions.OSSL_FUNC_rand_enable_locking
  export _root_.openssl.functions.OSSL_FUNC_rand_freectx
  export _root_.openssl.functions.OSSL_FUNC_rand_generate
  export _root_.openssl.functions.OSSL_FUNC_rand_get_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_rand_get_params
  export _root_.openssl.functions.OSSL_FUNC_rand_get_seed
  export _root_.openssl.functions.OSSL_FUNC_rand_gettable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_rand_gettable_params
  export _root_.openssl.functions.OSSL_FUNC_rand_instantiate
  export _root_.openssl.functions.OSSL_FUNC_rand_lock
  export _root_.openssl.functions.OSSL_FUNC_rand_newctx
  export _root_.openssl.functions.OSSL_FUNC_rand_nonce
  export _root_.openssl.functions.OSSL_FUNC_rand_reseed
  export _root_.openssl.functions.OSSL_FUNC_rand_set_callbacks
  export _root_.openssl.functions.OSSL_FUNC_rand_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_rand_settable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_rand_uninstantiate
  export _root_.openssl.functions.OSSL_FUNC_rand_unlock
  export _root_.openssl.functions.OSSL_FUNC_rand_verify_zeroization
  export _root_.openssl.functions.OSSL_FUNC_self_test_cb
  export _root_.openssl.functions.OSSL_FUNC_signature_digest_sign
  export _root_.openssl.functions.OSSL_FUNC_signature_digest_sign_final
  export _root_.openssl.functions.OSSL_FUNC_signature_digest_sign_init
  export _root_.openssl.functions.OSSL_FUNC_signature_digest_sign_update
  export _root_.openssl.functions.OSSL_FUNC_signature_digest_verify
  export _root_.openssl.functions.OSSL_FUNC_signature_digest_verify_final
  export _root_.openssl.functions.OSSL_FUNC_signature_digest_verify_init
  export _root_.openssl.functions.OSSL_FUNC_signature_digest_verify_update
  export _root_.openssl.functions.OSSL_FUNC_signature_dupctx
  export _root_.openssl.functions.OSSL_FUNC_signature_freectx
  export _root_.openssl.functions.OSSL_FUNC_signature_get_ctx_md_params
  export _root_.openssl.functions.OSSL_FUNC_signature_get_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_signature_gettable_ctx_md_params
  export _root_.openssl.functions.OSSL_FUNC_signature_gettable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_signature_newctx
  export _root_.openssl.functions.OSSL_FUNC_signature_set_ctx_md_params
  export _root_.openssl.functions.OSSL_FUNC_signature_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_signature_settable_ctx_md_params
  export _root_.openssl.functions.OSSL_FUNC_signature_settable_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_signature_sign
  export _root_.openssl.functions.OSSL_FUNC_signature_sign_init
  export _root_.openssl.functions.OSSL_FUNC_signature_verify
  export _root_.openssl.functions.OSSL_FUNC_signature_verify_init
  export _root_.openssl.functions.OSSL_FUNC_signature_verify_recover
  export _root_.openssl.functions.OSSL_FUNC_signature_verify_recover_init
  export _root_.openssl.functions.OSSL_FUNC_store_attach
  export _root_.openssl.functions.OSSL_FUNC_store_close
  export _root_.openssl.functions.OSSL_FUNC_store_eof
  export _root_.openssl.functions.OSSL_FUNC_store_export_object
  export _root_.openssl.functions.OSSL_FUNC_store_load
  export _root_.openssl.functions.OSSL_FUNC_store_open
  export _root_.openssl.functions.OSSL_FUNC_store_set_ctx_params
  export _root_.openssl.functions.OSSL_FUNC_store_settable_ctx_params
  export _root_.openssl.functions.OSSL_LIB_CTX_free
  export _root_.openssl.functions.OSSL_LIB_CTX_get0_global_default
  export _root_.openssl.functions.OSSL_LIB_CTX_load_config
  export _root_.openssl.functions.OSSL_LIB_CTX_new
  export _root_.openssl.functions.OSSL_LIB_CTX_new_child
  export _root_.openssl.functions.OSSL_LIB_CTX_new_from_dispatch
  export _root_.openssl.functions.OSSL_LIB_CTX_set0_default
  export _root_.openssl.functions.OSSL_PARAM_allocate_from_text
  export _root_.openssl.functions.OSSL_PARAM_dup
  export _root_.openssl.functions.OSSL_PARAM_free
  export _root_.openssl.functions.OSSL_PARAM_get_BN
  export _root_.openssl.functions.OSSL_PARAM_get_double
  export _root_.openssl.functions.OSSL_PARAM_get_int
  export _root_.openssl.functions.OSSL_PARAM_get_int32
  export _root_.openssl.functions.OSSL_PARAM_get_int64
  export _root_.openssl.functions.OSSL_PARAM_get_long
  export _root_.openssl.functions.OSSL_PARAM_get_octet_ptr
  export _root_.openssl.functions.OSSL_PARAM_get_octet_string
  export _root_.openssl.functions.OSSL_PARAM_get_octet_string_ptr
  export _root_.openssl.functions.OSSL_PARAM_get_size_t
  export _root_.openssl.functions.OSSL_PARAM_get_time_t
  export _root_.openssl.functions.OSSL_PARAM_get_uint
  export _root_.openssl.functions.OSSL_PARAM_get_uint32
  export _root_.openssl.functions.OSSL_PARAM_get_uint64
  export _root_.openssl.functions.OSSL_PARAM_get_ulong
  export _root_.openssl.functions.OSSL_PARAM_get_utf8_ptr
  export _root_.openssl.functions.OSSL_PARAM_get_utf8_string
  export _root_.openssl.functions.OSSL_PARAM_get_utf8_string_ptr
  export _root_.openssl.functions.OSSL_PARAM_locate
  export _root_.openssl.functions.OSSL_PARAM_locate_const
  export _root_.openssl.functions.OSSL_PARAM_merge
  export _root_.openssl.functions.OSSL_PARAM_modified
  export _root_.openssl.functions.OSSL_PARAM_set_BN
  export _root_.openssl.functions.OSSL_PARAM_set_all_unmodified
  export _root_.openssl.functions.OSSL_PARAM_set_double
  export _root_.openssl.functions.OSSL_PARAM_set_int
  export _root_.openssl.functions.OSSL_PARAM_set_int32
  export _root_.openssl.functions.OSSL_PARAM_set_int64
  export _root_.openssl.functions.OSSL_PARAM_set_long
  export _root_.openssl.functions.OSSL_PARAM_set_octet_ptr
  export _root_.openssl.functions.OSSL_PARAM_set_octet_string
  export _root_.openssl.functions.OSSL_PARAM_set_size_t
  export _root_.openssl.functions.OSSL_PARAM_set_time_t
  export _root_.openssl.functions.OSSL_PARAM_set_uint
  export _root_.openssl.functions.OSSL_PARAM_set_uint32
  export _root_.openssl.functions.OSSL_PARAM_set_uint64
  export _root_.openssl.functions.OSSL_PARAM_set_ulong
  export _root_.openssl.functions.OSSL_PARAM_set_utf8_ptr
  export _root_.openssl.functions.OSSL_PARAM_set_utf8_string
  export _root_.openssl.functions.OSSL_provider_init
  export _root_.openssl.functions.OpenSSL_version
  export _root_.openssl.functions.OpenSSL_version_num
  export _root_.openssl.functions.PEM_write_bio_ASN1_stream
  export _root_.openssl.functions.PKCS5_PBE_add
  export _root_.openssl.functions.PKCS5_PBE_keyivgen
  export _root_.openssl.functions.PKCS5_PBE_keyivgen_ex
  export _root_.openssl.functions.PKCS5_PBKDF2_HMAC
  export _root_.openssl.functions.PKCS5_PBKDF2_HMAC_SHA1
  export _root_.openssl.functions.PKCS5_v2_PBE_keyivgen
  export _root_.openssl.functions.PKCS5_v2_PBE_keyivgen_ex
  export _root_.openssl.functions.PKCS5_v2_scrypt_keyivgen
  export _root_.openssl.functions.PKCS5_v2_scrypt_keyivgen_ex
  export _root_.openssl.functions.SHA1
  export _root_.openssl.functions.SHA1_Final
  export _root_.openssl.functions.SHA1_Init
  export _root_.openssl.functions.SHA1_Transform
  export _root_.openssl.functions.SHA1_Update
  export _root_.openssl.functions.SHA224
  export _root_.openssl.functions.SHA224_Final
  export _root_.openssl.functions.SHA224_Init
  export _root_.openssl.functions.SHA224_Update
  export _root_.openssl.functions.SHA256
  export _root_.openssl.functions.SHA256_Final
  export _root_.openssl.functions.SHA256_Init
  export _root_.openssl.functions.SHA256_Transform
  export _root_.openssl.functions.SHA256_Update
  export _root_.openssl.functions.SHA384
  export _root_.openssl.functions.SHA384_Final
  export _root_.openssl.functions.SHA384_Init
  export _root_.openssl.functions.SHA384_Update
  export _root_.openssl.functions.SHA512
  export _root_.openssl.functions.SHA512_Final
  export _root_.openssl.functions.SHA512_Init
  export _root_.openssl.functions.SHA512_Transform
  export _root_.openssl.functions.SHA512_Update
  export _root_.openssl.functions.SMIME_crlf_copy
  export _root_.openssl.functions.SMIME_read_ASN1
  export _root_.openssl.functions.SMIME_read_ASN1_ex
  export _root_.openssl.functions.SMIME_text
  export _root_.openssl.functions.SMIME_write_ASN1
  export _root_.openssl.functions.SMIME_write_ASN1_ex
  export _root_.openssl.functions.UTF8_getc
  export _root_.openssl.functions.UTF8_putc
  export _root_.openssl.functions.a2d_ASN1_OBJECT
  export _root_.openssl.functions.a2i_ASN1_ENUMERATED
  export _root_.openssl.functions.a2i_ASN1_INTEGER
  export _root_.openssl.functions.a2i_ASN1_STRING
  export _root_.openssl.functions.d2i_ASN1_BIT_STRING
  export _root_.openssl.functions.d2i_ASN1_BMPSTRING
  export _root_.openssl.functions.d2i_ASN1_ENUMERATED
  export _root_.openssl.functions.d2i_ASN1_GENERALIZEDTIME
  export _root_.openssl.functions.d2i_ASN1_GENERALSTRING
  export _root_.openssl.functions.d2i_ASN1_IA5STRING
  export _root_.openssl.functions.d2i_ASN1_INTEGER
  export _root_.openssl.functions.d2i_ASN1_NULL
  export _root_.openssl.functions.d2i_ASN1_OBJECT
  export _root_.openssl.functions.d2i_ASN1_OCTET_STRING
  export _root_.openssl.functions.d2i_ASN1_PRINTABLE
  export _root_.openssl.functions.d2i_ASN1_PRINTABLESTRING
  export _root_.openssl.functions.d2i_ASN1_SEQUENCE_ANY
  export _root_.openssl.functions.d2i_ASN1_SET_ANY
  export _root_.openssl.functions.d2i_ASN1_T61STRING
  export _root_.openssl.functions.d2i_ASN1_TIME
  export _root_.openssl.functions.d2i_ASN1_TYPE
  export _root_.openssl.functions.d2i_ASN1_UINTEGER
  export _root_.openssl.functions.d2i_ASN1_UNIVERSALSTRING
  export _root_.openssl.functions.d2i_ASN1_UTCTIME
  export _root_.openssl.functions.d2i_ASN1_UTF8STRING
  export _root_.openssl.functions.d2i_ASN1_VISIBLESTRING
  export _root_.openssl.functions.d2i_AutoPrivateKey
  export _root_.openssl.functions.d2i_AutoPrivateKey_ex
  export _root_.openssl.functions.d2i_DIRECTORYSTRING
  export _root_.openssl.functions.d2i_DISPLAYTEXT
  export _root_.openssl.functions.d2i_KeyParams
  export _root_.openssl.functions.d2i_KeyParams_bio
  export _root_.openssl.functions.d2i_PrivateKey
  export _root_.openssl.functions.d2i_PrivateKey_ex
  export _root_.openssl.functions.d2i_PublicKey
  export _root_.openssl.functions.i2a_ASN1_ENUMERATED
  export _root_.openssl.functions.i2a_ASN1_INTEGER
  export _root_.openssl.functions.i2a_ASN1_OBJECT
  export _root_.openssl.functions.i2a_ASN1_STRING
  export _root_.openssl.functions.i2d_ASN1_BIT_STRING
  export _root_.openssl.functions.i2d_ASN1_BMPSTRING
  export _root_.openssl.functions.i2d_ASN1_ENUMERATED
  export _root_.openssl.functions.i2d_ASN1_GENERALIZEDTIME
  export _root_.openssl.functions.i2d_ASN1_GENERALSTRING
  export _root_.openssl.functions.i2d_ASN1_IA5STRING
  export _root_.openssl.functions.i2d_ASN1_INTEGER
  export _root_.openssl.functions.i2d_ASN1_NULL
  export _root_.openssl.functions.i2d_ASN1_OBJECT
  export _root_.openssl.functions.i2d_ASN1_OCTET_STRING
  export _root_.openssl.functions.i2d_ASN1_PRINTABLE
  export _root_.openssl.functions.i2d_ASN1_PRINTABLESTRING
  export _root_.openssl.functions.i2d_ASN1_SEQUENCE_ANY
  export _root_.openssl.functions.i2d_ASN1_SET_ANY
  export _root_.openssl.functions.i2d_ASN1_T61STRING
  export _root_.openssl.functions.i2d_ASN1_TIME
  export _root_.openssl.functions.i2d_ASN1_TYPE
  export _root_.openssl.functions.i2d_ASN1_UNIVERSALSTRING
  export _root_.openssl.functions.i2d_ASN1_UTCTIME
  export _root_.openssl.functions.i2d_ASN1_UTF8STRING
  export _root_.openssl.functions.i2d_ASN1_VISIBLESTRING
  export _root_.openssl.functions.i2d_ASN1_bio_stream
  export _root_.openssl.functions.i2d_DIRECTORYSTRING
  export _root_.openssl.functions.i2d_DISPLAYTEXT
  export _root_.openssl.functions.i2d_KeyParams
  export _root_.openssl.functions.i2d_KeyParams_bio
  export _root_.openssl.functions.i2d_PrivateKey
  export _root_.openssl.functions.i2d_PublicKey
  export _root_.openssl.functions.i2t_ASN1_OBJECT
  export _root_.openssl.functions.ossl_check_ASN1_GENERALSTRING_compfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_GENERALSTRING_copyfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_GENERALSTRING_freefunc_type
  export _root_.openssl.functions.ossl_check_ASN1_GENERALSTRING_sk_type
  export _root_.openssl.functions.ossl_check_ASN1_GENERALSTRING_type
  export _root_.openssl.functions.ossl_check_ASN1_INTEGER_compfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_INTEGER_copyfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_INTEGER_freefunc_type
  export _root_.openssl.functions.ossl_check_ASN1_INTEGER_sk_type
  export _root_.openssl.functions.ossl_check_ASN1_INTEGER_type
  export _root_.openssl.functions.ossl_check_ASN1_OBJECT_compfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_OBJECT_copyfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_OBJECT_freefunc_type
  export _root_.openssl.functions.ossl_check_ASN1_OBJECT_sk_type
  export _root_.openssl.functions.ossl_check_ASN1_OBJECT_type
  export _root_.openssl.functions.ossl_check_ASN1_STRING_TABLE_compfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_STRING_TABLE_copyfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_STRING_TABLE_freefunc_type
  export _root_.openssl.functions.ossl_check_ASN1_STRING_TABLE_sk_type
  export _root_.openssl.functions.ossl_check_ASN1_STRING_TABLE_type
  export _root_.openssl.functions.ossl_check_ASN1_TYPE_compfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_TYPE_copyfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_TYPE_freefunc_type
  export _root_.openssl.functions.ossl_check_ASN1_TYPE_sk_type
  export _root_.openssl.functions.ossl_check_ASN1_TYPE_type
  export _root_.openssl.functions.ossl_check_ASN1_UTF8STRING_compfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_UTF8STRING_copyfunc_type
  export _root_.openssl.functions.ossl_check_ASN1_UTF8STRING_freefunc_type
  export _root_.openssl.functions.ossl_check_ASN1_UTF8STRING_sk_type
  export _root_.openssl.functions.ossl_check_ASN1_UTF8STRING_type
  export _root_.openssl.functions.ossl_check_BIO_compfunc_type
  export _root_.openssl.functions.ossl_check_BIO_copyfunc_type
  export _root_.openssl.functions.ossl_check_BIO_freefunc_type
  export _root_.openssl.functions.ossl_check_BIO_sk_type
  export _root_.openssl.functions.ossl_check_BIO_type
  export _root_.openssl.functions.ossl_check_OPENSSL_BLOCK_compfunc_type
  export _root_.openssl.functions.ossl_check_OPENSSL_BLOCK_copyfunc_type
  export _root_.openssl.functions.ossl_check_OPENSSL_BLOCK_freefunc_type
  export _root_.openssl.functions.ossl_check_OPENSSL_BLOCK_sk_type
  export _root_.openssl.functions.ossl_check_OPENSSL_BLOCK_type
  export _root_.openssl.functions.ossl_check_OPENSSL_CSTRING_compfunc_type
  export _root_.openssl.functions.ossl_check_OPENSSL_CSTRING_copyfunc_type
  export _root_.openssl.functions.ossl_check_OPENSSL_CSTRING_freefunc_type
  export _root_.openssl.functions.ossl_check_OPENSSL_CSTRING_sk_type
  export _root_.openssl.functions.ossl_check_OPENSSL_CSTRING_type
  export _root_.openssl.functions.ossl_check_OPENSSL_STRING_compfunc_type
  export _root_.openssl.functions.ossl_check_OPENSSL_STRING_copyfunc_type
  export _root_.openssl.functions.ossl_check_OPENSSL_STRING_freefunc_type
  export _root_.openssl.functions.ossl_check_OPENSSL_STRING_sk_type
  export _root_.openssl.functions.ossl_check_OPENSSL_STRING_type
  export _root_.openssl.functions.ossl_check_X509_ALGOR_compfunc_type
  export _root_.openssl.functions.ossl_check_X509_ALGOR_copyfunc_type
  export _root_.openssl.functions.ossl_check_X509_ALGOR_freefunc_type
  export _root_.openssl.functions.ossl_check_X509_ALGOR_sk_type
  export _root_.openssl.functions.ossl_check_X509_ALGOR_type
  export _root_.openssl.functions.ossl_check_const_ASN1_GENERALSTRING_sk_type
  export _root_.openssl.functions.ossl_check_const_ASN1_INTEGER_sk_type
  export _root_.openssl.functions.ossl_check_const_ASN1_OBJECT_sk_type
  export _root_.openssl.functions.ossl_check_const_ASN1_STRING_TABLE_sk_type
  export _root_.openssl.functions.ossl_check_const_ASN1_TYPE_sk_type
  export _root_.openssl.functions.ossl_check_const_ASN1_UTF8STRING_sk_type
  export _root_.openssl.functions.ossl_check_const_BIO_sk_type
  export _root_.openssl.functions.ossl_check_const_OPENSSL_BLOCK_sk_type
  export _root_.openssl.functions.ossl_check_const_OPENSSL_CSTRING_sk_type
  export _root_.openssl.functions.ossl_check_const_OPENSSL_STRING_sk_type
  export _root_.openssl.functions.ossl_check_const_X509_ALGOR_sk_type
  export _root_.openssl.functions.ossl_check_const_void_sk_type
  export _root_.openssl.functions.ossl_check_void_compfunc_type
  export _root_.openssl.functions.ossl_check_void_copyfunc_type
  export _root_.openssl.functions.ossl_check_void_freefunc_type
  export _root_.openssl.functions.ossl_check_void_sk_type
  export _root_.openssl.functions.ossl_check_void_type
  export _root_.openssl.functions.OSSL_PARAM_construct_BN
  export _root_.openssl.functions.OSSL_PARAM_construct_double
  export _root_.openssl.functions.OSSL_PARAM_construct_end
  export _root_.openssl.functions.OSSL_PARAM_construct_int
  export _root_.openssl.functions.OSSL_PARAM_construct_int32
  export _root_.openssl.functions.OSSL_PARAM_construct_int64
  export _root_.openssl.functions.OSSL_PARAM_construct_long
  export _root_.openssl.functions.OSSL_PARAM_construct_octet_ptr
  export _root_.openssl.functions.OSSL_PARAM_construct_octet_string
  export _root_.openssl.functions.OSSL_PARAM_construct_size_t
  export _root_.openssl.functions.OSSL_PARAM_construct_time_t
  export _root_.openssl.functions.OSSL_PARAM_construct_uint
  export _root_.openssl.functions.OSSL_PARAM_construct_uint32
  export _root_.openssl.functions.OSSL_PARAM_construct_uint64
  export _root_.openssl.functions.OSSL_PARAM_construct_ulong
  export _root_.openssl.functions.OSSL_PARAM_construct_utf8_ptr
  export _root_.openssl.functions.OSSL_PARAM_construct_utf8_string
end all
