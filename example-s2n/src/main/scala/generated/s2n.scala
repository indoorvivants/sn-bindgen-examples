package s2n

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[s2n] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
     inline def int: CInt = eq.apply(t).toInt
     inline def uint: CUnsignedInt = eq.apply(t)
     inline def value: CUnsignedInt = eq.apply(t)


object enumerations:
  import predef.*
  /**
   * Sets whether or not a connection should terminate on receiving a WARNING alert from its peer.
  */
  opaque type s2n_alert_behavior = CUnsignedInt
  object s2n_alert_behavior extends CEnumU[s2n_alert_behavior]:
    given _tag: Tag[s2n_alert_behavior] = Tag.UInt
    inline def define(inline a: Long): s2n_alert_behavior = a.toUInt
    val S2N_ALERT_FAIL_ON_WARNINGS = define(0)
    val S2N_ALERT_IGNORE_WARNINGS = define(1)
    inline def getName(inline value: s2n_alert_behavior): Option[String] =
      inline value match
        case S2N_ALERT_FAIL_ON_WARNINGS => Some("S2N_ALERT_FAIL_ON_WARNINGS")
        case S2N_ALERT_IGNORE_WARNINGS => Some("S2N_ALERT_IGNORE_WARNINGS")
        case _ => None
    extension (a: s2n_alert_behavior)
      inline def &(b: s2n_alert_behavior): s2n_alert_behavior = a & b
      inline def |(b: s2n_alert_behavior): s2n_alert_behavior = a | b
      inline def is(b: s2n_alert_behavior): Boolean = (a & b) == b

  /**
   * The type of private key operation
  */
  opaque type s2n_async_pkey_op_type = CUnsignedInt
  object s2n_async_pkey_op_type extends CEnumU[s2n_async_pkey_op_type]:
    given _tag: Tag[s2n_async_pkey_op_type] = Tag.UInt
    inline def define(inline a: Long): s2n_async_pkey_op_type = a.toUInt
    val S2N_ASYNC_DECRYPT = define(0)
    val S2N_ASYNC_SIGN = define(1)
    inline def getName(inline value: s2n_async_pkey_op_type): Option[String] =
      inline value match
        case S2N_ASYNC_DECRYPT => Some("S2N_ASYNC_DECRYPT")
        case S2N_ASYNC_SIGN => Some("S2N_ASYNC_SIGN")
        case _ => None
    extension (a: s2n_async_pkey_op_type)
      inline def &(b: s2n_async_pkey_op_type): s2n_async_pkey_op_type = a & b
      inline def |(b: s2n_async_pkey_op_type): s2n_async_pkey_op_type = a | b
      inline def is(b: s2n_async_pkey_op_type): Boolean = (a & b) == b

  /**
   * Sets whether or not a connection should enforce strict signature validation during the `s2n_async_pkey_op_apply` call.
  */
  opaque type s2n_async_pkey_validation_mode = CUnsignedInt
  object s2n_async_pkey_validation_mode extends CEnumU[s2n_async_pkey_validation_mode]:
    given _tag: Tag[s2n_async_pkey_validation_mode] = Tag.UInt
    inline def define(inline a: Long): s2n_async_pkey_validation_mode = a.toUInt
    val S2N_ASYNC_PKEY_VALIDATION_FAST = define(0)
    val S2N_ASYNC_PKEY_VALIDATION_STRICT = define(1)
    inline def getName(inline value: s2n_async_pkey_validation_mode): Option[String] =
      inline value match
        case S2N_ASYNC_PKEY_VALIDATION_FAST => Some("S2N_ASYNC_PKEY_VALIDATION_FAST")
        case S2N_ASYNC_PKEY_VALIDATION_STRICT => Some("S2N_ASYNC_PKEY_VALIDATION_STRICT")
        case _ => None
    extension (a: s2n_async_pkey_validation_mode)
      inline def &(b: s2n_async_pkey_validation_mode): s2n_async_pkey_validation_mode = a & b
      inline def |(b: s2n_async_pkey_validation_mode): s2n_async_pkey_validation_mode = a | b
      inline def is(b: s2n_async_pkey_validation_mode): Boolean = (a & b) == b

  /**
   * Used to opt-out of s2n-tls's built-in blinding. Blinding is a mitigation against timing side-channels which in some cases can leak information about encrypted data. By default s2n-tls will cause a thread to sleep between 10 and 30 seconds whenever tampering is detected.
  */
  opaque type s2n_blinding = CUnsignedInt
  object s2n_blinding extends CEnumU[s2n_blinding]:
    given _tag: Tag[s2n_blinding] = Tag.UInt
    inline def define(inline a: Long): s2n_blinding = a.toUInt
    val S2N_BUILT_IN_BLINDING = define(0)
    val S2N_SELF_SERVICE_BLINDING = define(1)
    inline def getName(inline value: s2n_blinding): Option[String] =
      inline value match
        case S2N_BUILT_IN_BLINDING => Some("S2N_BUILT_IN_BLINDING")
        case S2N_SELF_SERVICE_BLINDING => Some("S2N_SELF_SERVICE_BLINDING")
        case _ => None
    extension (a: s2n_blinding)
      inline def &(b: s2n_blinding): s2n_blinding = a & b
      inline def |(b: s2n_blinding): s2n_blinding = a | b
      inline def is(b: s2n_blinding): Boolean = (a & b) == b

  /**
   * Used in non-blocking mode to indicate in which direction s2n-tls became blocked on I/O before it returned control to the caller. This allows an application to avoid retrying s2n-tls operations until I/O is possible in that direction.
  */
  opaque type s2n_blocked_status = CUnsignedInt
  object s2n_blocked_status extends CEnumU[s2n_blocked_status]:
    given _tag: Tag[s2n_blocked_status] = Tag.UInt
    inline def define(inline a: Long): s2n_blocked_status = a.toUInt
    val S2N_NOT_BLOCKED = define(0)
    val S2N_BLOCKED_ON_READ = define(1)
    val S2N_BLOCKED_ON_WRITE = define(2)
    val S2N_BLOCKED_ON_APPLICATION_INPUT = define(3)
    val S2N_BLOCKED_ON_EARLY_DATA = define(4)
    inline def getName(inline value: s2n_blocked_status): Option[String] =
      inline value match
        case S2N_NOT_BLOCKED => Some("S2N_NOT_BLOCKED")
        case S2N_BLOCKED_ON_READ => Some("S2N_BLOCKED_ON_READ")
        case S2N_BLOCKED_ON_WRITE => Some("S2N_BLOCKED_ON_WRITE")
        case S2N_BLOCKED_ON_APPLICATION_INPUT => Some("S2N_BLOCKED_ON_APPLICATION_INPUT")
        case S2N_BLOCKED_ON_EARLY_DATA => Some("S2N_BLOCKED_ON_EARLY_DATA")
        case _ => None
    extension (a: s2n_blocked_status)
      inline def &(b: s2n_blocked_status): s2n_blocked_status = a & b
      inline def |(b: s2n_blocked_status): s2n_blocked_status = a | b
      inline def is(b: s2n_blocked_status): Boolean = (a & b) == b

  /**
   * Used to declare what type of client certificate authentication to use.
  */
  opaque type s2n_cert_auth_type = CUnsignedInt
  object s2n_cert_auth_type extends CEnumU[s2n_cert_auth_type]:
    given _tag: Tag[s2n_cert_auth_type] = Tag.UInt
    inline def define(inline a: Long): s2n_cert_auth_type = a.toUInt
    val S2N_CERT_AUTH_NONE = define(0)
    val S2N_CERT_AUTH_REQUIRED = define(1)
    val S2N_CERT_AUTH_OPTIONAL = define(2)
    inline def getName(inline value: s2n_cert_auth_type): Option[String] =
      inline value match
        case S2N_CERT_AUTH_NONE => Some("S2N_CERT_AUTH_NONE")
        case S2N_CERT_AUTH_REQUIRED => Some("S2N_CERT_AUTH_REQUIRED")
        case S2N_CERT_AUTH_OPTIONAL => Some("S2N_CERT_AUTH_OPTIONAL")
        case _ => None
    extension (a: s2n_cert_auth_type)
      inline def &(b: s2n_cert_auth_type): s2n_cert_auth_type = a & b
      inline def |(b: s2n_cert_auth_type): s2n_cert_auth_type = a | b
      inline def is(b: s2n_cert_auth_type): Boolean = (a & b) == b

  /**
   * Client Hello callback modes - `S2N_CLIENT_HELLO_CB_BLOCKING` (default): - In this mode s2n-tls expects the callback to complete its work and return the appropriate response code before the handshake continues. If any of the connection properties were changed based on the server_name extension the callback must either return a value greater than 0 or invoke `s2n_connection_server_name_extension_used`, otherwise the callback returns 0 to continue the handshake. - `S2N_CLIENT_HELLO_CB_NONBLOCKING`: - In non-blocking mode, s2n-tls expects the callback to not complete its work. If the callback returns a response code of 0 s2n-tls will return `S2N_FAILURE` with `S2N_ERR_T_BLOCKED` error type and `s2n_blocked_status` set to `S2N_BLOCKED_ON_APPLICATION_INPUT`. The handshake is paused and further calls to `s2n_negotiate` will continue to return the same error until `s2n_client_hello_cb_done` is invoked for the `s2n_connection` to resume the handshake. This allows s2n-tls clients to process client_hello without blocking and then resume the handshake at a later time. If any of the connection properties were changed on the basis of the server_name extension then `s2n_connection_server_name_extension_used` must be invoked before marking the callback done.
  */
  opaque type s2n_client_hello_cb_mode = CUnsignedInt
  object s2n_client_hello_cb_mode extends CEnumU[s2n_client_hello_cb_mode]:
    given _tag: Tag[s2n_client_hello_cb_mode] = Tag.UInt
    inline def define(inline a: Long): s2n_client_hello_cb_mode = a.toUInt
    val S2N_CLIENT_HELLO_CB_BLOCKING = define(0)
    val S2N_CLIENT_HELLO_CB_NONBLOCKING = define(1)
    inline def getName(inline value: s2n_client_hello_cb_mode): Option[String] =
      inline value match
        case S2N_CLIENT_HELLO_CB_BLOCKING => Some("S2N_CLIENT_HELLO_CB_BLOCKING")
        case S2N_CLIENT_HELLO_CB_NONBLOCKING => Some("S2N_CLIENT_HELLO_CB_NONBLOCKING")
        case _ => None
    extension (a: s2n_client_hello_cb_mode)
      inline def &(b: s2n_client_hello_cb_mode): s2n_client_hello_cb_mode = a & b
      inline def |(b: s2n_client_hello_cb_mode): s2n_client_hello_cb_mode = a | b
      inline def is(b: s2n_client_hello_cb_mode): Boolean = (a & b) == b

  /**
   * Enum to set Certificate Transparency Support level.
  */
  opaque type s2n_ct_support_level = CUnsignedInt
  object s2n_ct_support_level extends CEnumU[s2n_ct_support_level]:
    given _tag: Tag[s2n_ct_support_level] = Tag.UInt
    inline def define(inline a: Long): s2n_ct_support_level = a.toUInt
    val S2N_CT_SUPPORT_NONE = define(0)
    val S2N_CT_SUPPORT_REQUEST = define(1)
    inline def getName(inline value: s2n_ct_support_level): Option[String] =
      inline value match
        case S2N_CT_SUPPORT_NONE => Some("S2N_CT_SUPPORT_NONE")
        case S2N_CT_SUPPORT_REQUEST => Some("S2N_CT_SUPPORT_REQUEST")
        case _ => None
    extension (a: s2n_ct_support_level)
      inline def &(b: s2n_ct_support_level): s2n_ct_support_level = a & b
      inline def |(b: s2n_ct_support_level): s2n_ct_support_level = a | b
      inline def is(b: s2n_ct_support_level): Boolean = (a & b) == b

  /**
   * The status of early data on a connection.
  */
  opaque type s2n_early_data_status_t = CUnsignedInt
  object s2n_early_data_status_t extends CEnumU[s2n_early_data_status_t]:
    given _tag: Tag[s2n_early_data_status_t] = Tag.UInt
    inline def define(inline a: Long): s2n_early_data_status_t = a.toUInt
    val S2N_EARLY_DATA_STATUS_OK = define(0)
    val S2N_EARLY_DATA_STATUS_NOT_REQUESTED = define(1)
    val S2N_EARLY_DATA_STATUS_REJECTED = define(2)
    val S2N_EARLY_DATA_STATUS_END = define(3)
    inline def getName(inline value: s2n_early_data_status_t): Option[String] =
      inline value match
        case S2N_EARLY_DATA_STATUS_OK => Some("S2N_EARLY_DATA_STATUS_OK")
        case S2N_EARLY_DATA_STATUS_NOT_REQUESTED => Some("S2N_EARLY_DATA_STATUS_NOT_REQUESTED")
        case S2N_EARLY_DATA_STATUS_REJECTED => Some("S2N_EARLY_DATA_STATUS_REJECTED")
        case S2N_EARLY_DATA_STATUS_END => Some("S2N_EARLY_DATA_STATUS_END")
        case _ => None
    extension (a: s2n_early_data_status_t)
      inline def &(b: s2n_early_data_status_t): s2n_early_data_status_t = a & b
      inline def |(b: s2n_early_data_status_t): s2n_early_data_status_t = a | b
      inline def is(b: s2n_early_data_status_t): Boolean = (a & b) == b

  /**
   * Used to help applications determine why an s2n-tls function failed.
  */
  opaque type s2n_error_type = CUnsignedInt
  object s2n_error_type extends CEnumU[s2n_error_type]:
    given _tag: Tag[s2n_error_type] = Tag.UInt
    inline def define(inline a: Long): s2n_error_type = a.toUInt
    val S2N_ERR_T_OK = define(0)
    val S2N_ERR_T_IO = define(1)
    val S2N_ERR_T_CLOSED = define(2)
    val S2N_ERR_T_BLOCKED = define(3)
    val S2N_ERR_T_ALERT = define(4)
    val S2N_ERR_T_PROTO = define(5)
    val S2N_ERR_T_INTERNAL = define(6)
    val S2N_ERR_T_USAGE = define(7)
    inline def getName(inline value: s2n_error_type): Option[String] =
      inline value match
        case S2N_ERR_T_OK => Some("S2N_ERR_T_OK")
        case S2N_ERR_T_IO => Some("S2N_ERR_T_IO")
        case S2N_ERR_T_CLOSED => Some("S2N_ERR_T_CLOSED")
        case S2N_ERR_T_BLOCKED => Some("S2N_ERR_T_BLOCKED")
        case S2N_ERR_T_ALERT => Some("S2N_ERR_T_ALERT")
        case S2N_ERR_T_PROTO => Some("S2N_ERR_T_PROTO")
        case S2N_ERR_T_INTERNAL => Some("S2N_ERR_T_INTERNAL")
        case S2N_ERR_T_USAGE => Some("S2N_ERR_T_USAGE")
        case _ => None
    extension (a: s2n_error_type)
      inline def &(b: s2n_error_type): s2n_error_type = a & b
      inline def |(b: s2n_error_type): s2n_error_type = a | b
      inline def is(b: s2n_error_type): Boolean = (a & b) == b

  /**
   * MFL configurations from https://datatracker.ietf.org/doc/html/rfc6066#section-4.
  */
  opaque type s2n_max_frag_len = CUnsignedInt
  object s2n_max_frag_len extends CEnumU[s2n_max_frag_len]:
    given _tag: Tag[s2n_max_frag_len] = Tag.UInt
    inline def define(inline a: Long): s2n_max_frag_len = a.toUInt
    val S2N_TLS_MAX_FRAG_LEN_512 = define(1)
    val S2N_TLS_MAX_FRAG_LEN_1024 = define(2)
    val S2N_TLS_MAX_FRAG_LEN_2048 = define(3)
    val S2N_TLS_MAX_FRAG_LEN_4096 = define(4)
    inline def getName(inline value: s2n_max_frag_len): Option[String] =
      inline value match
        case S2N_TLS_MAX_FRAG_LEN_512 => Some("S2N_TLS_MAX_FRAG_LEN_512")
        case S2N_TLS_MAX_FRAG_LEN_1024 => Some("S2N_TLS_MAX_FRAG_LEN_1024")
        case S2N_TLS_MAX_FRAG_LEN_2048 => Some("S2N_TLS_MAX_FRAG_LEN_2048")
        case S2N_TLS_MAX_FRAG_LEN_4096 => Some("S2N_TLS_MAX_FRAG_LEN_4096")
        case _ => None
    extension (a: s2n_max_frag_len)
      inline def &(b: s2n_max_frag_len): s2n_max_frag_len = a & b
      inline def |(b: s2n_max_frag_len): s2n_max_frag_len = a | b
      inline def is(b: s2n_max_frag_len): Boolean = (a & b) == b

  /**
   * Used to declare connections as server or client type, respectively.
  */
  opaque type s2n_mode = CUnsignedInt
  object s2n_mode extends CEnumU[s2n_mode]:
    given _tag: Tag[s2n_mode] = Tag.UInt
    inline def define(inline a: Long): s2n_mode = a.toUInt
    val S2N_SERVER = define(0)
    val S2N_CLIENT = define(1)
    inline def getName(inline value: s2n_mode): Option[String] =
      inline value match
        case S2N_SERVER => Some("S2N_SERVER")
        case S2N_CLIENT => Some("S2N_CLIENT")
        case _ => None
    extension (a: s2n_mode)
      inline def &(b: s2n_mode): s2n_mode = a & b
      inline def |(b: s2n_mode): s2n_mode = a | b
      inline def is(b: s2n_mode): Boolean = (a & b) == b

  /**
   * Pre-shared key (PSK) Hash Algorithm - RFC 8446 Section-2.2
  */
  opaque type s2n_psk_hmac = CUnsignedInt
  object s2n_psk_hmac extends CEnumU[s2n_psk_hmac]:
    given _tag: Tag[s2n_psk_hmac] = Tag.UInt
    inline def define(inline a: Long): s2n_psk_hmac = a.toUInt
    val S2N_PSK_HMAC_SHA256 = define(0)
    val S2N_PSK_HMAC_SHA384 = define(1)
    inline def getName(inline value: s2n_psk_hmac): Option[String] =
      inline value match
        case S2N_PSK_HMAC_SHA256 => Some("S2N_PSK_HMAC_SHA256")
        case S2N_PSK_HMAC_SHA384 => Some("S2N_PSK_HMAC_SHA384")
        case _ => None
    extension (a: s2n_psk_hmac)
      inline def &(b: s2n_psk_hmac): s2n_psk_hmac = a & b
      inline def |(b: s2n_psk_hmac): s2n_psk_hmac = a | b
      inline def is(b: s2n_psk_hmac): Boolean = (a & b) == b

  /**
   * The list of PSK modes supported by s2n-tls for TLS versions >= TLS1.3. Currently s2n-tls supports two modes - `S2N_PSK_MODE_RESUMPTION`, which represents the PSKs established using the previous connection via session resumption, and `S2N_PSK_MODE_EXTERNAL`, which represents PSKs established out-of-band/externally using a secure mutually agreed upon mechanism.
  */
  opaque type s2n_psk_mode = CUnsignedInt
  object s2n_psk_mode extends CEnumU[s2n_psk_mode]:
    given _tag: Tag[s2n_psk_mode] = Tag.UInt
    inline def define(inline a: Long): s2n_psk_mode = a.toUInt
    val S2N_PSK_MODE_RESUMPTION = define(0)
    val S2N_PSK_MODE_EXTERNAL = define(1)
    inline def getName(inline value: s2n_psk_mode): Option[String] =
      inline value match
        case S2N_PSK_MODE_RESUMPTION => Some("S2N_PSK_MODE_RESUMPTION")
        case S2N_PSK_MODE_EXTERNAL => Some("S2N_PSK_MODE_EXTERNAL")
        case _ => None
    extension (a: s2n_psk_mode)
      inline def &(b: s2n_psk_mode): s2n_psk_mode = a & b
      inline def |(b: s2n_psk_mode): s2n_psk_mode = a | b
      inline def is(b: s2n_psk_mode): Boolean = (a & b) == b

  /**
   * Enum used to define the type, if any, of certificate status request an S2N_CLIENT should make during the handshake. The only supported status request type is OCSP, `S2N_STATUS_REQUEST_OCSP`.
  */
  opaque type s2n_status_request_type = CUnsignedInt
  object s2n_status_request_type extends CEnumU[s2n_status_request_type]:
    given _tag: Tag[s2n_status_request_type] = Tag.UInt
    inline def define(inline a: Long): s2n_status_request_type = a.toUInt
    val S2N_STATUS_REQUEST_NONE = define(0)
    val S2N_STATUS_REQUEST_OCSP = define(1)
    inline def getName(inline value: s2n_status_request_type): Option[String] =
      inline value match
        case S2N_STATUS_REQUEST_NONE => Some("S2N_STATUS_REQUEST_NONE")
        case S2N_STATUS_REQUEST_OCSP => Some("S2N_STATUS_REQUEST_OCSP")
        case _ => None
    extension (a: s2n_status_request_type)
      inline def &(b: s2n_status_request_type): s2n_status_request_type = a & b
      inline def |(b: s2n_status_request_type): s2n_status_request_type = a | b
      inline def is(b: s2n_status_request_type): Boolean = (a & b) == b

  /**
   * TLS extensions supported by s2n-tls
  */
  opaque type s2n_tls_extension_type = CUnsignedInt
  object s2n_tls_extension_type extends CEnumU[s2n_tls_extension_type]:
    given _tag: Tag[s2n_tls_extension_type] = Tag.UInt
    inline def define(inline a: Long): s2n_tls_extension_type = a.toUInt
    val S2N_EXTENSION_SERVER_NAME = define(0)
    val S2N_EXTENSION_MAX_FRAG_LEN = define(1)
    val S2N_EXTENSION_OCSP_STAPLING = define(5)
    val S2N_EXTENSION_SUPPORTED_GROUPS = define(10)
    val S2N_EXTENSION_EC_POINT_FORMATS = define(11)
    val S2N_EXTENSION_SIGNATURE_ALGORITHMS = define(13)
    val S2N_EXTENSION_ALPN = define(16)
    val S2N_EXTENSION_CERTIFICATE_TRANSPARENCY = define(18)
    val S2N_EXTENSION_RENEGOTIATION_INFO = define(65281)
    inline def getName(inline value: s2n_tls_extension_type): Option[String] =
      inline value match
        case S2N_EXTENSION_SERVER_NAME => Some("S2N_EXTENSION_SERVER_NAME")
        case S2N_EXTENSION_MAX_FRAG_LEN => Some("S2N_EXTENSION_MAX_FRAG_LEN")
        case S2N_EXTENSION_OCSP_STAPLING => Some("S2N_EXTENSION_OCSP_STAPLING")
        case S2N_EXTENSION_SUPPORTED_GROUPS => Some("S2N_EXTENSION_SUPPORTED_GROUPS")
        case S2N_EXTENSION_EC_POINT_FORMATS => Some("S2N_EXTENSION_EC_POINT_FORMATS")
        case S2N_EXTENSION_SIGNATURE_ALGORITHMS => Some("S2N_EXTENSION_SIGNATURE_ALGORITHMS")
        case S2N_EXTENSION_ALPN => Some("S2N_EXTENSION_ALPN")
        case S2N_EXTENSION_CERTIFICATE_TRANSPARENCY => Some("S2N_EXTENSION_CERTIFICATE_TRANSPARENCY")
        case S2N_EXTENSION_RENEGOTIATION_INFO => Some("S2N_EXTENSION_RENEGOTIATION_INFO")
        case _ => None
    extension (a: s2n_tls_extension_type)
      inline def &(b: s2n_tls_extension_type): s2n_tls_extension_type = a & b
      inline def |(b: s2n_tls_extension_type): s2n_tls_extension_type = a | b
      inline def is(b: s2n_tls_extension_type): Boolean = (a & b) == b

  /**
   * TLS Hash Algorithms - https://tools.ietf.org/html/rfc5246#section-7.4.1.4.1 https://www.iana.org/assignments/tls-parameters/tls-parameters.xhtml#tls-parameters-18
  */
  opaque type s2n_tls_hash_algorithm = CUnsignedInt
  object s2n_tls_hash_algorithm extends CEnumU[s2n_tls_hash_algorithm]:
    given _tag: Tag[s2n_tls_hash_algorithm] = Tag.UInt
    inline def define(inline a: Long): s2n_tls_hash_algorithm = a.toUInt
    val S2N_TLS_HASH_NONE = define(0)
    val S2N_TLS_HASH_MD5 = define(1)
    val S2N_TLS_HASH_SHA1 = define(2)
    val S2N_TLS_HASH_SHA224 = define(3)
    val S2N_TLS_HASH_SHA256 = define(4)
    val S2N_TLS_HASH_SHA384 = define(5)
    val S2N_TLS_HASH_SHA512 = define(6)
    val S2N_TLS_HASH_MD5_SHA1 = define(224)
    inline def getName(inline value: s2n_tls_hash_algorithm): Option[String] =
      inline value match
        case S2N_TLS_HASH_NONE => Some("S2N_TLS_HASH_NONE")
        case S2N_TLS_HASH_MD5 => Some("S2N_TLS_HASH_MD5")
        case S2N_TLS_HASH_SHA1 => Some("S2N_TLS_HASH_SHA1")
        case S2N_TLS_HASH_SHA224 => Some("S2N_TLS_HASH_SHA224")
        case S2N_TLS_HASH_SHA256 => Some("S2N_TLS_HASH_SHA256")
        case S2N_TLS_HASH_SHA384 => Some("S2N_TLS_HASH_SHA384")
        case S2N_TLS_HASH_SHA512 => Some("S2N_TLS_HASH_SHA512")
        case S2N_TLS_HASH_MD5_SHA1 => Some("S2N_TLS_HASH_MD5_SHA1")
        case _ => None
    extension (a: s2n_tls_hash_algorithm)
      inline def &(b: s2n_tls_hash_algorithm): s2n_tls_hash_algorithm = a & b
      inline def |(b: s2n_tls_hash_algorithm): s2n_tls_hash_algorithm = a | b
      inline def is(b: s2n_tls_hash_algorithm): Boolean = (a & b) == b

  /**
   * TLS Signature Algorithms - RFC 5246 7.4.1.4.1 https://www.iana.org/assignments/tls-parameters/tls-parameters.xhtml#tls-parameters-16
  */
  opaque type s2n_tls_signature_algorithm = CUnsignedInt
  object s2n_tls_signature_algorithm extends CEnumU[s2n_tls_signature_algorithm]:
    given _tag: Tag[s2n_tls_signature_algorithm] = Tag.UInt
    inline def define(inline a: Long): s2n_tls_signature_algorithm = a.toUInt
    val S2N_TLS_SIGNATURE_ANONYMOUS = define(0)
    val S2N_TLS_SIGNATURE_RSA = define(1)
    val S2N_TLS_SIGNATURE_ECDSA = define(3)
    val S2N_TLS_SIGNATURE_RSA_PSS_RSAE = define(224)
    val S2N_TLS_SIGNATURE_RSA_PSS_PSS = define(225)
    inline def getName(inline value: s2n_tls_signature_algorithm): Option[String] =
      inline value match
        case S2N_TLS_SIGNATURE_ANONYMOUS => Some("S2N_TLS_SIGNATURE_ANONYMOUS")
        case S2N_TLS_SIGNATURE_RSA => Some("S2N_TLS_SIGNATURE_RSA")
        case S2N_TLS_SIGNATURE_ECDSA => Some("S2N_TLS_SIGNATURE_ECDSA")
        case S2N_TLS_SIGNATURE_RSA_PSS_RSAE => Some("S2N_TLS_SIGNATURE_RSA_PSS_RSAE")
        case S2N_TLS_SIGNATURE_RSA_PSS_PSS => Some("S2N_TLS_SIGNATURE_RSA_PSS_PSS")
        case _ => None
    extension (a: s2n_tls_signature_algorithm)
      inline def &(b: s2n_tls_signature_algorithm): s2n_tls_signature_algorithm = a & b
      inline def |(b: s2n_tls_signature_algorithm): s2n_tls_signature_algorithm = a | b
      inline def is(b: s2n_tls_signature_algorithm): Boolean = (a & b) == b

  /**
  */
  opaque type s2n_verify_after_sign = CUnsignedInt
  object s2n_verify_after_sign extends CEnumU[s2n_verify_after_sign]:
    given _tag: Tag[s2n_verify_after_sign] = Tag.UInt
    inline def define(inline a: Long): s2n_verify_after_sign = a.toUInt
    val S2N_VERIFY_AFTER_SIGN_DISABLED = define(0)
    val S2N_VERIFY_AFTER_SIGN_ENABLED = define(1)
    inline def getName(inline value: s2n_verify_after_sign): Option[String] =
      inline value match
        case S2N_VERIFY_AFTER_SIGN_DISABLED => Some("S2N_VERIFY_AFTER_SIGN_DISABLED")
        case S2N_VERIFY_AFTER_SIGN_ENABLED => Some("S2N_VERIFY_AFTER_SIGN_ENABLED")
        case _ => None
    extension (a: s2n_verify_after_sign)
      inline def &(b: s2n_verify_after_sign): s2n_verify_after_sign = a & b
      inline def |(b: s2n_verify_after_sign): s2n_verify_after_sign = a | b
      inline def is(b: s2n_verify_after_sign): Boolean = (a & b) == b

object aliases:
  import _root_.s2n.enumerations.*
  import _root_.s2n.predef.*
  import _root_.s2n.aliases.*
  import _root_.s2n.structs.*
  type FILE = libc.stdio.FILE
  object FILE: 
    val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
    inline def apply(inline o: libc.stdio.FILE): FILE = o
    extension (v: FILE)
      inline def value: libc.stdio.FILE = v

  type iovec = posix.sys.uio.iovec
  object iovec: 
    val _tag: Tag[iovec] = summon[Tag[posix.sys.uio.iovec]]
    inline def apply(inline o: posix.sys.uio.iovec): iovec = o
    extension (v: iovec)
      inline def value: posix.sys.uio.iovec = v

  /**
   * Callback function for handling private key operations
  */
  opaque type s2n_async_pkey_fn = CFuncPtr2[Ptr[s2n_connection], Ptr[s2n_async_pkey_op], CInt]
  object s2n_async_pkey_fn: 
    given _tag: Tag[s2n_async_pkey_fn] = Tag.materializeCFuncPtr2[Ptr[s2n_connection], Ptr[s2n_async_pkey_op], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_async_pkey_fn = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[s2n_connection], Ptr[s2n_async_pkey_op], CInt]): s2n_async_pkey_fn = o
    extension (v: s2n_async_pkey_fn)
      inline def value: CFuncPtr2[Ptr[s2n_connection], Ptr[s2n_async_pkey_op], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Cache callback function that allows the caller to set a callback function that will be used to delete SSL session data from a cache.
  */
  opaque type s2n_cache_delete_callback = CFuncPtr4[Ptr[s2n_connection], Ptr[Byte], Ptr[Byte], uint64_t, CInt]
  object s2n_cache_delete_callback: 
    given _tag: Tag[s2n_cache_delete_callback] = Tag.materializeCFuncPtr4[Ptr[s2n_connection], Ptr[Byte], Ptr[Byte], uint64_t, CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_cache_delete_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr4[Ptr[s2n_connection], Ptr[Byte], Ptr[Byte], uint64_t, CInt]): s2n_cache_delete_callback = o
    extension (v: s2n_cache_delete_callback)
      inline def value: CFuncPtr4[Ptr[s2n_connection], Ptr[Byte], Ptr[Byte], uint64_t, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Cache callback function that allows the caller to retrieve SSL session data from a cache.
  */
  opaque type s2n_cache_retrieve_callback = CFuncPtr6[Ptr[s2n_connection], Ptr[Byte], Ptr[Byte], uint64_t, Ptr[Byte], Ptr[uint64_t], CInt]
  object s2n_cache_retrieve_callback: 
    given _tag: Tag[s2n_cache_retrieve_callback] = Tag.materializeCFuncPtr6[Ptr[s2n_connection], Ptr[Byte], Ptr[Byte], uint64_t, Ptr[Byte], Ptr[uint64_t], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_cache_retrieve_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr6[Ptr[s2n_connection], Ptr[Byte], Ptr[Byte], uint64_t, Ptr[Byte], Ptr[uint64_t], CInt]): s2n_cache_retrieve_callback = o
    extension (v: s2n_cache_retrieve_callback)
      inline def value: CFuncPtr6[Ptr[s2n_connection], Ptr[Byte], Ptr[Byte], uint64_t, Ptr[Byte], Ptr[uint64_t], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Cache callback function that allows the caller to store SSL session data in a cache.
  */
  opaque type s2n_cache_store_callback = CFuncPtr7[Ptr[s2n_connection], Ptr[Byte], uint64_t, Ptr[Byte], uint64_t, Ptr[Byte], uint64_t, CInt]
  object s2n_cache_store_callback: 
    given _tag: Tag[s2n_cache_store_callback] = Tag.materializeCFuncPtr7[Ptr[s2n_connection], Ptr[Byte], uint64_t, Ptr[Byte], uint64_t, Ptr[Byte], uint64_t, CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_cache_store_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr7[Ptr[s2n_connection], Ptr[Byte], uint64_t, Ptr[Byte], uint64_t, Ptr[Byte], uint64_t, CInt]): s2n_cache_store_callback = o
    extension (v: s2n_cache_store_callback)
      inline def value: CFuncPtr7[Ptr[s2n_connection], Ptr[Byte], uint64_t, Ptr[Byte], uint64_t, Ptr[Byte], uint64_t, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A callback function that is invoked if s2n-tls cannot resolve a conflict between two certificates with the same domain name. This function is invoked while certificates are added to an `s2n_config`.
  */
  opaque type s2n_cert_tiebreak_callback = CFuncPtr4[Ptr[s2n_cert_chain_and_key], Ptr[s2n_cert_chain_and_key], Ptr[uint8_t], uint32_t, Ptr[s2n_cert_chain_and_key]]
  object s2n_cert_tiebreak_callback: 
    given _tag: Tag[s2n_cert_tiebreak_callback] = Tag.materializeCFuncPtr4[Ptr[s2n_cert_chain_and_key], Ptr[s2n_cert_chain_and_key], Ptr[uint8_t], uint32_t, Ptr[s2n_cert_chain_and_key]]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_cert_tiebreak_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr4[Ptr[s2n_cert_chain_and_key], Ptr[s2n_cert_chain_and_key], Ptr[uint8_t], uint32_t, Ptr[s2n_cert_chain_and_key]]): s2n_cert_tiebreak_callback = o
    extension (v: s2n_cert_tiebreak_callback)
      inline def value: CFuncPtr4[Ptr[s2n_cert_chain_and_key], Ptr[s2n_cert_chain_and_key], Ptr[uint8_t], uint32_t, Ptr[s2n_cert_chain_and_key]] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * The callback function takes a s2n-tls connection as input, which receives the ClientHello and the context previously provided in `s2n_config_set_client_hello_cb`. The callback can access any ClientHello information from the connection and use the `s2n_connection_set_config` call to change the config of the connection.
  */
  type s2n_client_hello_fn = CFuncPtr2[Ptr[s2n_connection], Ptr[Byte], CInt]
  object s2n_client_hello_fn: 
    given _tag: Tag[s2n_client_hello_fn] = Tag.materializeCFuncPtr2[Ptr[s2n_connection], Ptr[Byte], CInt]
    inline def apply(inline o: CFuncPtr2[Ptr[s2n_connection], Ptr[Byte], CInt]): s2n_client_hello_fn = o
    extension (v: s2n_client_hello_fn)
      inline def value: CFuncPtr2[Ptr[s2n_connection], Ptr[Byte], CInt] = v

  /**
   * Callback function type used to get the system time.
  */
  opaque type s2n_clock_time_nanoseconds = CFuncPtr2[Ptr[Byte], Ptr[uint64_t], CInt]
  object s2n_clock_time_nanoseconds: 
    given _tag: Tag[s2n_clock_time_nanoseconds] = Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[uint64_t], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_clock_time_nanoseconds = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[Byte], Ptr[uint64_t], CInt]): s2n_clock_time_nanoseconds = o
    extension (v: s2n_clock_time_nanoseconds)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[uint64_t], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A callback which can be implemented to accept or reject early data.
  */
  opaque type s2n_early_data_cb = CFuncPtr2[Ptr[s2n_connection], Ptr[s2n_offered_early_data], CInt]
  object s2n_early_data_cb: 
    given _tag: Tag[s2n_early_data_cb] = Tag.materializeCFuncPtr2[Ptr[s2n_connection], Ptr[s2n_offered_early_data], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_early_data_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[s2n_connection], Ptr[s2n_offered_early_data], CInt]): s2n_early_data_cb = o
    extension (v: s2n_early_data_cb)
      inline def value: CFuncPtr2[Ptr[s2n_connection], Ptr[s2n_offered_early_data], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Callback function for handling key log events
  */
  opaque type s2n_key_log_fn = CFuncPtr4[Ptr[Byte], Ptr[s2n_connection], Ptr[uint8_t], size_t, CInt]
  object s2n_key_log_fn: 
    given _tag: Tag[s2n_key_log_fn] = Tag.materializeCFuncPtr4[Ptr[Byte], Ptr[s2n_connection], Ptr[uint8_t], size_t, CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_key_log_fn = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr4[Ptr[Byte], Ptr[s2n_connection], Ptr[uint8_t], size_t, CInt]): s2n_key_log_fn = o
    extension (v: s2n_key_log_fn)
      inline def value: CFuncPtr4[Ptr[Byte], Ptr[s2n_connection], Ptr[uint8_t], size_t, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Will be called when `s2n_cleanup` is executed.
  */
  opaque type s2n_mem_cleanup_callback = CFuncPtr0[CInt]
  object s2n_mem_cleanup_callback: 
    given _tag: Tag[s2n_mem_cleanup_callback] = Tag.materializeCFuncPtr0[CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_mem_cleanup_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr0[CInt]): s2n_mem_cleanup_callback = o
    extension (v: s2n_mem_cleanup_callback)
      inline def value: CFuncPtr0[CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Frees memory allocated by s2n_mem_malloc_callback.
  */
  opaque type s2n_mem_free_callback = CFuncPtr2[Ptr[Byte], uint32_t, CInt]
  object s2n_mem_free_callback: 
    given _tag: Tag[s2n_mem_free_callback] = Tag.materializeCFuncPtr2[Ptr[Byte], uint32_t, CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_mem_free_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[Byte], uint32_t, CInt]): s2n_mem_free_callback = o
    extension (v: s2n_mem_free_callback)
      inline def value: CFuncPtr2[Ptr[Byte], uint32_t, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Called when `s2n_init` is executed.
  */
  opaque type s2n_mem_init_callback = CFuncPtr0[CInt]
  object s2n_mem_init_callback: 
    given _tag: Tag[s2n_mem_init_callback] = Tag.materializeCFuncPtr0[CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_mem_init_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr0[CInt]): s2n_mem_init_callback = o
    extension (v: s2n_mem_init_callback)
      inline def value: CFuncPtr0[CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A function that can allocate at least `requested` bytes of memory.
  */
  opaque type s2n_mem_malloc_callback = CFuncPtr3[Ptr[Ptr[Byte]], uint32_t, Ptr[uint32_t], CInt]
  object s2n_mem_malloc_callback: 
    given _tag: Tag[s2n_mem_malloc_callback] = Tag.materializeCFuncPtr3[Ptr[Ptr[Byte]], uint32_t, Ptr[uint32_t], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_mem_malloc_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[Ptr[Ptr[Byte]], uint32_t, Ptr[uint32_t], CInt]): s2n_mem_malloc_callback = o
    extension (v: s2n_mem_malloc_callback)
      inline def value: CFuncPtr3[Ptr[Ptr[Byte]], uint32_t, Ptr[uint32_t], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Callback function to select a PSK from a list of offered PSKs. Use this callback to implement custom PSK selection logic. The s2n-tls default PSK selection logic chooses the first matching PSK from the list of offered PSKs sent by the client.
  */
  opaque type s2n_psk_selection_callback = CFuncPtr3[Ptr[s2n_connection], Ptr[Byte], Ptr[s2n_offered_psk_list], CInt]
  object s2n_psk_selection_callback: 
    given _tag: Tag[s2n_psk_selection_callback] = Tag.materializeCFuncPtr3[Ptr[s2n_connection], Ptr[Byte], Ptr[s2n_offered_psk_list], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_psk_selection_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[Ptr[s2n_connection], Ptr[Byte], Ptr[s2n_offered_psk_list], CInt]): s2n_psk_selection_callback = o
    extension (v: s2n_psk_selection_callback)
      inline def value: CFuncPtr3[Ptr[s2n_connection], Ptr[Byte], Ptr[s2n_offered_psk_list], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A callback function that will be called when `s2n_cleanup` is executed.
  */
  opaque type s2n_rand_cleanup_callback = CFuncPtr0[CInt]
  object s2n_rand_cleanup_callback: 
    given _tag: Tag[s2n_rand_cleanup_callback] = Tag.materializeCFuncPtr0[CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_rand_cleanup_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr0[CInt]): s2n_rand_cleanup_callback = o
    extension (v: s2n_rand_cleanup_callback)
      inline def value: CFuncPtr0[CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A callback function that will be called when s2n-tls is initialized.
  */
  opaque type s2n_rand_init_callback = CFuncPtr0[CInt]
  object s2n_rand_init_callback: 
    given _tag: Tag[s2n_rand_init_callback] = Tag.materializeCFuncPtr0[CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_rand_init_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr0[CInt]): s2n_rand_init_callback = o
    extension (v: s2n_rand_init_callback)
      inline def value: CFuncPtr0[CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A callback function that will be used to mix in entropy every time the RNG is invoked.
  */
  opaque type s2n_rand_mix_callback = CFuncPtr2[Ptr[Byte], uint32_t, CInt]
  object s2n_rand_mix_callback: 
    given _tag: Tag[s2n_rand_mix_callback] = Tag.materializeCFuncPtr2[Ptr[Byte], uint32_t, CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_rand_mix_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[Byte], uint32_t, CInt]): s2n_rand_mix_callback = o
    extension (v: s2n_rand_mix_callback)
      inline def value: CFuncPtr2[Ptr[Byte], uint32_t, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A callback function that will be used to provide entropy to the s2n-tls random number generators.
  */
  opaque type s2n_rand_seed_callback = CFuncPtr2[Ptr[Byte], uint32_t, CInt]
  object s2n_rand_seed_callback: 
    given _tag: Tag[s2n_rand_seed_callback] = Tag.materializeCFuncPtr2[Ptr[Byte], uint32_t, CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_rand_seed_callback = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr2[Ptr[Byte], uint32_t, CInt]): s2n_rand_seed_callback = o
    extension (v: s2n_rand_seed_callback)
      inline def value: CFuncPtr2[Ptr[Byte], uint32_t, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * Function pointer for a user provided send callback.
  */
  type s2n_recv_fn = CFuncPtr3[Ptr[Byte], Ptr[uint8_t], uint32_t, CInt]
  object s2n_recv_fn: 
    given _tag: Tag[s2n_recv_fn] = Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[uint8_t], uint32_t, CInt]
    inline def apply(inline o: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], uint32_t, CInt]): s2n_recv_fn = o
    extension (v: s2n_recv_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], uint32_t, CInt] = v

  /**
   * Function pointer for a user provided send callback.
  */
  type s2n_send_fn = CFuncPtr3[Ptr[Byte], Ptr[uint8_t], uint32_t, CInt]
  object s2n_send_fn: 
    given _tag: Tag[s2n_send_fn] = Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[uint8_t], uint32_t, CInt]
    inline def apply(inline o: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], uint32_t, CInt]): s2n_send_fn = o
    extension (v: s2n_send_fn)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], uint32_t, CInt] = v

  /**
   * Callback function for receiving a session ticket.
  */
  opaque type s2n_session_ticket_fn = CFuncPtr3[Ptr[s2n_connection], Ptr[Byte], Ptr[s2n_session_ticket], CInt]
  object s2n_session_ticket_fn: 
    given _tag: Tag[s2n_session_ticket_fn] = Tag.materializeCFuncPtr3[Ptr[s2n_connection], Ptr[Byte], Ptr[s2n_session_ticket], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_session_ticket_fn = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[Ptr[s2n_connection], Ptr[Byte], Ptr[s2n_session_ticket], CInt]): s2n_session_ticket_fn = o
    extension (v: s2n_session_ticket_fn)
      inline def value: CFuncPtr3[Ptr[s2n_connection], Ptr[Byte], Ptr[s2n_session_ticket], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  /**
   * A callback function invoked (usually multiple times) during X.509 validation for each name encountered in the leaf certificate.
  */
  opaque type s2n_verify_host_fn = CFuncPtr3[CString, size_t, Ptr[Byte], uint8_t]
  object s2n_verify_host_fn: 
    given _tag: Tag[s2n_verify_host_fn] = Tag.materializeCFuncPtr3[CString, size_t, Ptr[Byte], uint8_t]
    inline def fromPtr(ptr: Ptr[Byte]): s2n_verify_host_fn = CFuncPtr.fromPtr(ptr)
    inline def apply(inline o: CFuncPtr3[CString, size_t, Ptr[Byte], uint8_t]): s2n_verify_host_fn = o
    extension (v: s2n_verify_host_fn)
      inline def value: CFuncPtr3[CString, size_t, Ptr[Byte], uint8_t] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

  type size_t = libc.stddef.size_t
  object size_t: 
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t)
      inline def value: libc.stddef.size_t = v

  type ssize_t = posix.sys.types.ssize_t
  object ssize_t: 
    val _tag: Tag[ssize_t] = summon[Tag[posix.sys.types.ssize_t]]
    inline def apply(inline o: posix.sys.types.ssize_t): ssize_t = o
    extension (v: ssize_t)
      inline def value: posix.sys.types.ssize_t = v

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
  import _root_.s2n.enumerations.*
  import _root_.s2n.predef.*
  import _root_.s2n.aliases.*
  import _root_.s2n.structs.*
  /**
   * Opaque async private key operation handle
  */
  opaque type s2n_async_pkey_op = CStruct0
  object s2n_async_pkey_op:
    given _tag: Tag[s2n_async_pkey_op] = Tag.materializeCStruct0Tag

  /**
   * Opaque certificate type.
  */
  opaque type s2n_cert = CStruct0
  object s2n_cert:
    given _tag: Tag[s2n_cert] = Tag.materializeCStruct0Tag

  /**
   * Opaque certificate chain and key type.
  */
  opaque type s2n_cert_chain_and_key = CStruct0
  object s2n_cert_chain_and_key:
    given _tag: Tag[s2n_cert_chain_and_key] = Tag.materializeCStruct0Tag

  /**
   * Opaque key type.
  */
  opaque type s2n_cert_private_key = CStruct0
  object s2n_cert_private_key:
    given _tag: Tag[s2n_cert_private_key] = Tag.materializeCStruct0Tag

  /**
   * Opaque key type.
  */
  opaque type s2n_cert_public_key = CStruct0
  object s2n_cert_public_key:
    given _tag: Tag[s2n_cert_public_key] = Tag.materializeCStruct0Tag

  /**
   * Opaque client hello handle
  */
  opaque type s2n_client_hello = CStruct0
  object s2n_client_hello:
    given _tag: Tag[s2n_client_hello] = Tag.materializeCStruct0Tag

  /**
   * An opaque configuration object, used by clients and servers for holding cryptographic certificates, keys and preferences.
  */
  opaque type s2n_config = CStruct0
  object s2n_config:
    given _tag: Tag[s2n_config] = Tag.materializeCStruct0Tag

  /**
   * An opaque connection. Used to track each s2n connection.
  */
  opaque type s2n_connection = CStruct0
  object s2n_connection:
    given _tag: Tag[s2n_connection] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type s2n_offered_early_data = CStruct0
  object s2n_offered_early_data:
    given _tag: Tag[s2n_offered_early_data] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type s2n_offered_psk = CStruct0
  object s2n_offered_psk:
    given _tag: Tag[s2n_offered_psk] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type s2n_offered_psk_list = CStruct0
  object s2n_offered_psk_list:
    given _tag: Tag[s2n_offered_psk_list] = Tag.materializeCStruct0Tag

  /**
   * Opaque key type.
  */
  opaque type s2n_pkey = CStruct0
  object s2n_pkey:
    given _tag: Tag[s2n_pkey] = Tag.materializeCStruct0Tag

  /**
   * Opaque pre shared key handle
  */
  opaque type s2n_psk = CStruct0
  object s2n_psk:
    given _tag: Tag[s2n_psk] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type s2n_session_ticket = CStruct0
  object s2n_session_ticket:
    given _tag: Tag[s2n_session_ticket] = Tag.materializeCStruct0Tag

  /**
   * Opaque stack trace structure.
  */
  opaque type s2n_stacktrace = CStruct0
  object s2n_stacktrace:
    given _tag: Tag[s2n_stacktrace] = Tag.materializeCStruct0Tag


@extern
private[s2n] object extern_functions:
  import _root_.s2n.enumerations.*
  import _root_.s2n.predef.*
  import _root_.s2n.aliases.*
  import _root_.s2n.structs.*
  /**
   * Finalizes a private key operation and unblocks the connection.
  */
  def s2n_async_pkey_op_apply(op : Ptr[s2n_async_pkey_op], conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Frees the opaque structure representing a private key operation.
  */
  def s2n_async_pkey_op_free(op : Ptr[s2n_async_pkey_op]): CInt = extern

  /**
   * Returns the input to the private key operation.
  */
  def s2n_async_pkey_op_get_input(op : Ptr[s2n_async_pkey_op], data : Ptr[uint8_t], data_len : uint32_t): CInt = extern

  /**
   * Returns the size of the input to the private key operation.
  */
  def s2n_async_pkey_op_get_input_size(op : Ptr[s2n_async_pkey_op], data_len : Ptr[uint32_t]): CInt = extern

  /**
   * Returns the type of the private key operation.
  */
  def s2n_async_pkey_op_get_op_type(op : Ptr[s2n_async_pkey_op], `type` : Ptr[s2n_async_pkey_op_type]): CInt = extern

  /**
   * Performs a private key operation using the given private key.
  */
  def s2n_async_pkey_op_perform(op : Ptr[s2n_async_pkey_op], key : Ptr[s2n_cert_private_key]): CInt = extern

  /**
   * Sets the output of the private key operation.
  */
  def s2n_async_pkey_op_set_output(op : Ptr[s2n_async_pkey_op], data : Ptr[uint8_t], data_len : uint32_t): CInt = extern

  /**
   * Calculates the s2n stack trace.
  */
  def s2n_calculate_stacktrace(): CInt = extern

  /**
   * Frees the memory associated with an `s2n_cert_chain_and_key` object.
  */
  def s2n_cert_chain_and_key_free(cert_and_key : Ptr[s2n_cert_chain_and_key]): CInt = extern

  /**
   * Get the user supplied context from the `s2n_cert_chain_and_key` object.
  */
  def s2n_cert_chain_and_key_get_ctx(cert_and_key : Ptr[s2n_cert_chain_and_key]): Ptr[Byte] = extern

  /**
   * Get the private key from the `s2n_cert_chain_and_key` object.
  */
  def s2n_cert_chain_and_key_get_private_key(cert_and_key : Ptr[s2n_cert_chain_and_key]): Ptr[s2n_cert_private_key] = extern

  /**
   * Associates a certificate chain and private key with an `s2n_cert_chain_and_key` object.
  */
  def s2n_cert_chain_and_key_load_pem(chain_and_key : Ptr[s2n_cert_chain_and_key], chain_pem : CString, private_key_pem : CString): CInt = extern

  /**
   * Associates a certificate chain and private key with an `s2n_cert_chain_and_key` object.
  */
  def s2n_cert_chain_and_key_load_pem_bytes(chain_and_key : Ptr[s2n_cert_chain_and_key], chain_pem : Ptr[uint8_t], chain_pem_len : uint32_t, private_key_pem : Ptr[uint8_t], private_key_pem_len : uint32_t): CInt = extern

  /**
   * Associates a public certificate chain with a `s2n_cert_chain_and_key` object. It does NOT set a private key, so the connection will need to be configured to [offload private key operations](https://github.com/aws/s2n-tls/blob/main/docs/USAGE-GUIDE.md#offloading-asynchronous-private-key-operations).
  */
  def s2n_cert_chain_and_key_load_public_pem_bytes(chain_and_key : Ptr[s2n_cert_chain_and_key], chain_pem : Ptr[uint8_t], chain_pem_len : uint32_t): CInt = extern

  /**
   * Creates a new s2n_cert_chain_and_key object. This object can be associated with many config objects. It is used to represent a certificate and key pair.
  */
  def s2n_cert_chain_and_key_new(): Ptr[s2n_cert_chain_and_key] = extern

  /**
   * Adds a context to the `s2n_cert_chain_and_key` object.
  */
  def s2n_cert_chain_and_key_set_ctx(cert_and_key : Ptr[s2n_cert_chain_and_key], ctx : Ptr[Byte]): CInt = extern

  /**
   * Set the raw OCSP stapling data for a certificate chain.
  */
  def s2n_cert_chain_and_key_set_ocsp_data(chain_and_key : Ptr[s2n_cert_chain_and_key], data : Ptr[uint8_t], length : uint32_t): CInt = extern

  /**
   * Set the signed certificate timestamp (SCT) for a certificate chain. This is used for Certificate Transparency.
  */
  def s2n_cert_chain_and_key_set_sct_list(chain_and_key : Ptr[s2n_cert_chain_and_key], data : Ptr[uint8_t], length : uint32_t): CInt = extern

  /**
   * Returns the certificate `out_cert` present at the index `cert_idx` of the certificate chain `chain_and_key`.
  */
  def s2n_cert_chain_get_cert(chain_and_key : Ptr[s2n_cert_chain_and_key], out_cert : Ptr[Ptr[s2n_cert]], cert_idx : uint32_t): CInt = extern

  /**
   * Returns the length of the s2n certificate chain `chain_and_key`.
  */
  def s2n_cert_chain_get_length(chain_and_key : Ptr[s2n_cert_chain_and_key], cert_length : Ptr[uint32_t]): CInt = extern

  /**
   * Returns the s2n certificate in DER format along with its length.
  */
  def s2n_cert_get_der(cert : Ptr[s2n_cert], out_cert_der : Ptr[Ptr[uint8_t]], cert_length : Ptr[uint32_t]): CInt = extern

  /**
   * Returns the UTF8 String representation of the DER encoded ASN.1 X.509 certificate extension data.
  */
  def s2n_cert_get_utf8_string_from_extension_data(extension_data : Ptr[uint8_t], extension_len : uint32_t, out_data : Ptr[uint8_t], out_len : Ptr[uint32_t]): CInt = extern

  /**
   * Returns the UTF8 String length of the ASN.1 X.509 certificate extension data.
  */
  def s2n_cert_get_utf8_string_from_extension_data_length(extension_data : Ptr[uint8_t], extension_len : uint32_t, utf8_str_len : Ptr[uint32_t]): CInt = extern

  /**
   * Returns the DER encoding of an ASN.1 X.509 certificate extension value, it's length and a boolean critical.
  */
  def s2n_cert_get_x509_extension_value(cert : Ptr[s2n_cert], oid : Ptr[uint8_t], ext_value : Ptr[uint8_t], ext_value_len : Ptr[uint32_t], critical : Ptr[Boolean]): CInt = extern

  /**
   * Returns the length of the DER encoded extension value of the ASN.1 X.509 certificate extension.
  */
  def s2n_cert_get_x509_extension_value_length(cert : Ptr[s2n_cert], oid : Ptr[uint8_t], ext_value_len : Ptr[uint32_t]): CInt = extern

  /**
   * Cleans up any internal resources used by s2n-tls. This function should be called from each thread or process that is created subsequent to calling `s2n_init` when that thread or process is done calling other s2n-tls functions.
  */
  def s2n_cleanup(): CInt = extern

  /**
   * Marks the non-blocking callback as complete. Can be invoked from within the callback when operating in non-blocking mode to continue the handshake.
  */
  def s2n_client_hello_cb_done(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Copies into the `out` buffer `max_length` bytes of the cipher_suites on the ClientHello.
  */
  def s2n_client_hello_get_cipher_suites(ch : Ptr[s2n_client_hello], out : Ptr[uint8_t], max_length : uint32_t): ssize_t = extern

  /**
   * Function to determine the size of the Client Hello cipher suites. This can be used to allocate the `out` buffer for s2n_client_hello_get_cipher_suites().
  */
  def s2n_client_hello_get_cipher_suites_length(ch : Ptr[s2n_client_hello]): ssize_t = extern

  /**
   * Copies into the `out` buffer `max_length` bytes of a given extension type on the ClientHello
  */
  def s2n_client_hello_get_extension_by_id(ch : Ptr[s2n_client_hello], extension_type : s2n_tls_extension_type, out : Ptr[uint8_t], max_length : uint32_t): ssize_t = extern

  /**
   * Query the ClientHello message received by the server. Use this function to allocate the `out` buffer for other client hello extension functions.
  */
  def s2n_client_hello_get_extension_length(ch : Ptr[s2n_client_hello], extension_type : s2n_tls_extension_type): ssize_t = extern

  /**
   * Copies into the `out` buffer `max_length` bytes of the extensions in the ClientHello.
  */
  def s2n_client_hello_get_extensions(ch : Ptr[s2n_client_hello], out : Ptr[uint8_t], max_length : uint32_t): ssize_t = extern

  /**
   * Function to determine the size of the Client Hello extensions. This can be used to allocate the `out` buffer for s2n_client_hello_get_extensions().
  */
  def s2n_client_hello_get_extensions_length(ch : Ptr[s2n_client_hello]): ssize_t = extern

  /**
   * Copies `max_length` bytes of the ClientHello message into the `out` buffer. The ClientHello instrumented using this function will have the Random bytes zero-ed out. For SSLv2 ClientHello messages, the raw message contains only the cipher_specs, session_id and members portions of the hello message (see [RFC5246](https://tools.ietf.org/html/rfc5246#appendix-E.2)). To access other members, you may use s2n_connection_get_client_hello_version(), s2n_connection_get_client_protocol_version() and s2n_connection_get_session_id_length() accessors functions.
  */
  def s2n_client_hello_get_raw_message(ch : Ptr[s2n_client_hello], out : Ptr[uint8_t], max_length : uint32_t): ssize_t = extern

  /**
   * Function to determine the size of the raw Client Hello buffer.
  */
  def s2n_client_hello_get_raw_message_length(ch : Ptr[s2n_client_hello]): ssize_t = extern

  /**
   * Copies up to `max_length` bytes of the ClientHello session_id into the `out` buffer and stores the number of copied bytes in `out_length`.
  */
  def s2n_client_hello_get_session_id(ch : Ptr[s2n_client_hello], out : Ptr[uint8_t], out_length : Ptr[uint32_t], max_length : uint32_t): CInt = extern

  /**
   * Get the the ClientHello session id length in bytes
  */
  def s2n_client_hello_get_session_id_length(ch : Ptr[s2n_client_hello], out_length : Ptr[uint32_t]): CInt = extern

  /**
   * Used to check if a particular extension exists in the client hello.
  */
  def s2n_client_hello_has_extension(ch : Ptr[s2n_client_hello], extension_iana : uint16_t, exists : Ptr[Boolean]): CInt = extern

  /**
   * Allows the server to opt-in to accept client's TLS maximum fragment length extension requests. If this API is not called, and client requests the extension, server will ignore the request and continue TLS handshake with default maximum fragment length of 8k bytes
  */
  def s2n_config_accept_max_fragment_length(config : Ptr[s2n_config]): CInt = extern

  /**
   * Associates a certificate chain and private key with an `s2n_config` object. Using this API, only one cert chain of each type (like ECDSA or RSA) may be associated with a config. `cert_chain_pem` should be a PEM encoded certificate chain, with the first certificate in the chain being your server's certificate. `private_key_pem` should be a PEM encoded private key corresponding to the server certificate.
  */
  def s2n_config_add_cert_chain_and_key(config : Ptr[s2n_config], cert_chain_pem : CString, private_key_pem : CString): CInt = extern

  /**
   * The preferred method of associating a certificate chain and private key pair with an `s2n_config` object. This method may be called multiple times to support multiple key types(RSA, ECDSA) and multiple domains. On the server side, the certificate selected will be based on the incoming SNI value and the client's capabilities(supported ciphers).
  */
  def s2n_config_add_cert_chain_and_key_to_store(config : Ptr[s2n_config], cert_key_pair : Ptr[s2n_cert_chain_and_key]): CInt = extern

  /**
   * Associates a set of Diffie-Hellman parameters with an `s2n_config` object.
  */
  def s2n_config_add_dhparams(config : Ptr[s2n_config], dhparams_pem : CString): CInt = extern

  /**
   * Adds a PEM to the trust store. This will allocate memory, and load PEM into the Trust Store. Note that the trust store will be initialized with the common locations for the host operating system by default. To completely override those locations, call s2n_config_wipe_trust_store before calling this function.
  */
  def s2n_config_add_pem_to_trust_store(config : Ptr[s2n_config], pem : CString): CInt = extern

  /**
   * Adds session ticket key on the server side. It would be ideal to add new keys after every (encrypt_decrypt_key_lifetime_in_nanos/2) nanos because this will allow for gradual and linear transition of a key from encrypt-decrypt state to decrypt-only state.
  */
  def s2n_config_add_ticket_crypto_key(config : Ptr[s2n_config], name : Ptr[uint8_t], name_len : uint32_t, key : Ptr[uint8_t], key_len : uint32_t, intro_time_in_seconds_from_epoch : uint64_t): CInt = extern

  /**
   * Appends the provided application protocol to the preference list
  */
  def s2n_config_append_protocol_preference(config : Ptr[s2n_config], protocol : Ptr[uint8_t], protocol_len : uint8_t): CInt = extern

  /**
   * Turns off all X.509 validation during the negotiation phase of the connection. This should only be used for testing or debugging purposes.
  */
  def s2n_config_disable_x509_verification(config : Ptr[s2n_config]): CInt = extern

  /**
   * s2n_config_enable_cert_req_dss_legacy_compat adds a dss cert type in the server certificate request when being called. It only sends the dss cert type in the cert request but does not succeed the handshake if a dss cert is received. Please DO NOT call this api unless you know you actually need legacy DSS certificate type compatibility
  */
  def s2n_config_enable_cert_req_dss_legacy_compat(config : Ptr[s2n_config]): CInt = extern

  /**
   * Frees the memory associated with an `s2n_config` object.
  */
  def s2n_config_free(config : Ptr[s2n_config]): CInt = extern

  /**
   * Frees the certificate chain and key associated with an `s2n_config` object.
  */
  def s2n_config_free_cert_chain_and_key(config : Ptr[s2n_config]): CInt = extern

  /**
   * Frees the DH params associated with an `s2n_config` object.
  */
  def s2n_config_free_dhparams(config : Ptr[s2n_config]): CInt = extern

  /**
   * Gets Client Certificate authentication method the s2n_config object is using.
  */
  def s2n_config_get_client_auth_type(config : Ptr[s2n_config], client_auth_type : Ptr[s2n_cert_auth_type]): CInt = extern

  /**
   * Gets the user defined context from the `s2n_config` object. The context is set by calling s2n_config_set_ctx()
  */
  def s2n_config_get_ctx(config : Ptr[s2n_config], ctx : Ptr[Ptr[Byte]]): CInt = extern

  /**
   * Create a new s2n_config object. This object can (and should) be associated with many connection objects.
  */
  def s2n_config_new(): Ptr[s2n_config] = extern

  /**
   * Allows the caller to set a TLS Maximum Fragment Length extension that will be used to fragment outgoing messages. s2n-tls currently does not reject fragments larger than the configured maximum when in server mode. The TLS negotiated maximum fragment length overrides the preference set by the `s2n_connection_prefer_throughput` and `s2n_connection_prefer_low_latency`.
  */
  def s2n_config_send_max_fragment_length(config : Ptr[s2n_config], mfl_code : s2n_max_frag_len): CInt = extern

  /**
   * Sets the config's alert behavior based on the `s2n_alert_behavior` enum.
  */
  def s2n_config_set_alert_behavior(config : Ptr[s2n_config], alert_behavior : s2n_alert_behavior): CInt = extern

  /**
   * Sets up the callback to invoke when private key operations occur.
  */
  def s2n_config_set_async_pkey_callback(config : Ptr[s2n_config], fn : s2n_async_pkey_fn): CInt = extern

  /**
   * Configures whether or not s2n-tls will perform potentially expensive validation of the results of a private key operation.
  */
  def s2n_config_set_async_pkey_validation_mode(config : Ptr[s2n_config], mode : s2n_async_pkey_validation_mode): CInt = extern

  /**
   * Allows the caller to set a callback function that will be used to delete SSL session data from a cache.
  */
  def s2n_config_set_cache_delete_callback(config : Ptr[s2n_config], cache_delete_callback : s2n_cache_delete_callback, data : Ptr[Byte]): CInt = extern

  /**
   * Allows the caller to set a callback function that will be used to retrieve SSL session data from a cache.
  */
  def s2n_config_set_cache_retrieve_callback(config : Ptr[s2n_config], cache_retrieve_callback : s2n_cache_retrieve_callback, data : Ptr[Byte]): CInt = extern

  /**
   * Allows the caller to set a callback function that will be used to store SSL session data in a cache.
  */
  def s2n_config_set_cache_store_callback(config : Ptr[s2n_config], cache_store_callback : s2n_cache_store_callback, data : Ptr[Byte]): CInt = extern

  /**
   * Explicitly sets certificate chain and private key pairs to be used as defaults for each auth method (key type). A "default" certificate is used when there is not an SNI match with any other configured certificate.
  */
  def s2n_config_set_cert_chain_and_key_defaults(config : Ptr[s2n_config], cert_key_pairs : Ptr[Ptr[s2n_cert_chain_and_key]], num_cert_key_pairs : uint32_t): CInt = extern

  /**
   * Sets the `s2n_cert_tiebreak_callback` for resolving domain name conflicts. If no callback is set, the first certificate added for a domain name will always be preferred.
  */
  def s2n_config_set_cert_tiebreak_callback(config : Ptr[s2n_config], cert_tiebreak_cb : s2n_cert_tiebreak_callback): CInt = extern

  /**
   * Toggles whether or not to validate stapled OCSP responses.
  */
  def s2n_config_set_check_stapled_ocsp_response(config : Ptr[s2n_config], check_ocsp : uint8_t): CInt = extern

  /**
   * Sets the security policy that includes the cipher/kem/signature/ecc preferences and protocol version.
  */
  def s2n_config_set_cipher_preferences(config : Ptr[s2n_config], version : CString): CInt = extern

  /**
   * Sets whether or not a Client Certificate should be required to complete the TLS Connection.
  */
  def s2n_config_set_client_auth_type(config : Ptr[s2n_config], client_auth_type : s2n_cert_auth_type): CInt = extern

  /**
   * Allows the caller to set a callback function that will be called after ClientHello was parsed.
  */
  def s2n_config_set_client_hello_cb(config : Ptr[s2n_config], client_hello_callback : s2n_client_hello_fn, ctx : Ptr[Byte]): CInt = extern

  /**
   * Sets the callback execution mode.
  */
  def s2n_config_set_client_hello_cb_mode(config : Ptr[s2n_config], cb_mode : s2n_client_hello_cb_mode): CInt = extern

  /**
   * Set the Certificate Transparency Support level.
  */
  def s2n_config_set_ct_support_level(config : Ptr[s2n_config], level : s2n_ct_support_level): CInt = extern

  /**
   * Sets user defined context on the `s2n_config` object.
  */
  def s2n_config_set_ctx(config : Ptr[s2n_config], ctx : Ptr[Byte]): CInt = extern

  /**
   * Set a callback to accept or reject early data.
  */
  def s2n_config_set_early_data_cb(config : Ptr[s2n_config], cb : s2n_early_data_cb): CInt = extern

  /**
   * Sets the extension data in the `s2n_config` object for the specified extension. This method will clear any existing data that is set. If the data and length parameters are set to NULL, no new data is set in the `s2n_config` object, effectively clearing existing data.
  */
  def s2n_config_set_extension_data(config : Ptr[s2n_config], `type` : s2n_tls_extension_type, data : Ptr[uint8_t], length : uint32_t): CInt = extern

  /**
   * Sets the initial number of session tickets to send after a >=TLS1.3 handshake. The default value is one ticket.
  */
  def s2n_config_set_initial_ticket_count(config : Ptr[s2n_config], num : uint8_t): CInt = extern

  /**
   * Sets a key logging callback on the provided config
  */
  def s2n_config_set_key_log_cb(config : Ptr[s2n_config], callback : s2n_key_log_fn, ctx : Ptr[Byte]): CInt = extern

  /**
   * Sets the maximum allowed depth of a cert chain used for X509 validation. The default value is 7. If this limit is exceeded, validation will fail if s2n_config_disable_x509_verification() has not been called. 0 is an illegal value and will return an error. 1 means only a root certificate will be used.
  */
  def s2n_config_set_max_cert_chain_depth(config : Ptr[s2n_config], max_depth : uint16_t): CInt = extern

  /**
   * Allows the caller to set a callback function that will be used to get monotonic time. The monotonic time is the time since an arbitrary, unspecified point. Unlike wall clock time, it MUST never move backwards.
  */
  def s2n_config_set_monotonic_clock(config : Ptr[s2n_config], clock_fn : s2n_clock_time_nanoseconds, ctx : Ptr[Byte]): CInt = extern

  /**
   * Sets the application protocol preferences on an `s2n_config` object. `protocols` is a list in order of preference, with most preferred protocol first, and of length `protocol_count`.
  */
  def s2n_config_set_protocol_preferences(config : Ptr[s2n_config], protocols : Ptr[CString], protocol_count : CInt): CInt = extern

  /**
   * Sets the PSK mode on the s2n config object. The supported PSK modes are listed in the enum `s2n_psk_mode` above.
  */
  def s2n_config_set_psk_mode(config : Ptr[s2n_config], mode : s2n_psk_mode): CInt = extern

  /**
   * Sets the callback to select the matching PSK. If this callback is not set s2n-tls uses a default PSK selection logic that selects the first matching server PSK.
  */
  def s2n_config_set_psk_selection_callback(config : Ptr[s2n_config], cb : s2n_psk_selection_callback, context : Ptr[Byte]): CInt = extern

  /**
   * Enable or disable recieving of multiple TLS records in a single s2n_recv call
  */
  def s2n_config_set_recv_multi_record(config : Ptr[s2n_config], enabled : Boolean): CInt = extern

  /**
   * Set a custom send buffer size.
  */
  def s2n_config_set_send_buffer_size(config : Ptr[s2n_config], size : uint32_t): CInt = extern

  /**
   * Sets the maximum bytes of early data the server will accept.
  */
  def s2n_config_set_server_max_early_data_size(config : Ptr[s2n_config], max_early_data_size : uint32_t): CInt = extern

  /**
   * Enable or disable session caching.
  */
  def s2n_config_set_session_cache_onoff(config : Ptr[s2n_config], enabled : uint8_t): CInt = extern

  /**
   * Sets the lifetime of the cached session state. The default value is 15 hours.
  */
  def s2n_config_set_session_state_lifetime(config : Ptr[s2n_config], lifetime_in_secs : uint64_t): CInt = extern

  /**
   * Sets a session ticket callback to be called when a client receives a new session ticket.
  */
  def s2n_config_set_session_ticket_cb(config : Ptr[s2n_config], callback : s2n_session_ticket_fn, ctx : Ptr[Byte]): CInt = extern

  /**
   * Enable or disable session resumption using session ticket.
  */
  def s2n_config_set_session_tickets_onoff(config : Ptr[s2n_config], enabled : uint8_t): CInt = extern

  /**
   * Sets up an S2N_CLIENT to request the server certificate status during an SSL handshake. If set to S2N_STATUS_REQUEST_NONE, no status request is made.
  */
  def s2n_config_set_status_request_type(config : Ptr[s2n_config], `type` : s2n_status_request_type): CInt = extern

  /**
   * Sets how long a session ticket key will be in a state where it can used just for decryption of already assigned tickets on the server side. Once decrypted, the session will resume and the server will issue a new session ticket encrypted using a key in encrypt-decrypt state.
  */
  def s2n_config_set_ticket_decrypt_key_lifetime(config : Ptr[s2n_config], lifetime_in_secs : uint64_t): CInt = extern

  /**
   * Sets how long a session ticket key will be in a state where it can be used for both encryption and decryption of tickets on the server side.
  */
  def s2n_config_set_ticket_encrypt_decrypt_key_lifetime(config : Ptr[s2n_config], lifetime_in_secs : uint64_t): CInt = extern

  /**
   * Adds to the trust store from a CA file or directory containing trusted certificates. To completely override those locations, call s2n_config_wipe_trust_store() before calling this function.
  */
  def s2n_config_set_verification_ca_location(config : Ptr[s2n_config], ca_pem_filename : CString, ca_dir : CString): CInt = extern

  /**
   * Toggle whether generated signatures are verified before being sent.
  */
  def s2n_config_set_verify_after_sign(config : Ptr[s2n_config], mode : s2n_verify_after_sign): CInt = extern

  /**
   * Sets the callback to use for verifying that a hostname from an X.509 certificate is trusted.
  */
  def s2n_config_set_verify_host_callback(config : Ptr[s2n_config], _1 : s2n_verify_host_fn, data : Ptr[Byte]): CInt = extern

  /**
   * Allows the caller to set a callback function that will be used to get the system time. The time returned should be the number of nanoseconds since the Unix epoch (Midnight, January 1st, 1970).
  */
  def s2n_config_set_wall_clock(config : Ptr[s2n_config], clock_fn : s2n_clock_time_nanoseconds, ctx : Ptr[Byte]): CInt = extern

  /**
   * Clear the trust store.
  */
  def s2n_config_wipe_trust_store(config : Ptr[s2n_config]): CInt = extern

  /**
   * Increases the number of session tickets to send after a >=TLS1.3 handshake.
  */
  def s2n_connection_add_new_tickets_to_send(conn : Ptr[s2n_connection], num : uint8_t): CInt = extern

  /**
   * Appends the provided application protocol to the preference list
  */
  def s2n_connection_append_protocol_preference(conn : Ptr[s2n_connection], protocol : Ptr[uint8_t], protocol_len : uint8_t): CInt = extern

  /**
   * Appends a PSK object to the list of PSKs supported by the s2n connection. If a PSK with a duplicate identity is found, an error is returned and the PSK is not added to the list. Note that a copy of `psk` is stored on the connection. The user is still responsible for freeing the memory associated with `psk`.
  */
  def s2n_connection_append_psk(conn : Ptr[s2n_connection], psk : Ptr[s2n_psk]): CInt = extern

  /**
   * Check if Client Auth was used for a connection.
  */
  def s2n_connection_client_cert_used(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Frees the memory associated with an s2n_connection handle. The handle is considered invalid after `s2n_connection_free` is used. s2n_connection_wipe() does not need to be called prior to this function. `s2n_connection_free` performs its own wipe of sensitive data.
  */
  def s2n_connection_free(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Wipes and releases buffers and memory allocated during the TLS handshake.
  */
  def s2n_connection_free_handshake(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Access the protocol version selected for the connection.
  */
  def s2n_connection_get_actual_protocol_version(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Function to get the alert that caused a connection to close. s2n-tls considers all TLS alerts fatal and shuts down a connection whenever one is received.
  */
  def s2n_connection_get_alert(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * A function that provides a human readable string of the cipher suite that was chosen for a connection.
  */
  def s2n_connection_get_cipher(conn : Ptr[s2n_connection]): CString = extern

  /**
   * Returns the IANA value for the connection's negotiated cipher suite.
  */
  def s2n_connection_get_cipher_iana_value(conn : Ptr[s2n_connection], first : Ptr[uint8_t], second : Ptr[uint8_t]): CInt = extern

  /**
   * Gets Client Certificate authentication method the s2n_connection object is using.
  */
  def s2n_connection_get_client_auth_type(conn : Ptr[s2n_connection], client_auth_type : Ptr[s2n_cert_auth_type]): CInt = extern

  /**
   * Gets the client certificate chain and places it in the `der_cert_chain_out` buffer. `cert_chain_len` is updated to match the size the chain buffer.
  */
  def s2n_connection_get_client_cert_chain(conn : Ptr[s2n_connection], der_cert_chain_out : Ptr[Ptr[uint8_t]], cert_chain_len : Ptr[uint32_t]): CInt = extern

  /**
   * Get the Client Hello from a s2n_connection.
  */
  def s2n_connection_get_client_hello(conn : Ptr[s2n_connection]): Ptr[s2n_client_hello] = extern

  /**
   * Access the client hello protocol version for the connection.
  */
  def s2n_connection_get_client_hello_version(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Access the protocol version supported by the client.
  */
  def s2n_connection_get_client_protocol_version(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Gets user defined context from a `s2n_connection` object.
  */
  def s2n_connection_get_ctx(conn : Ptr[s2n_connection]): Ptr[Byte] = extern

  /**
   * Function to get the human readable elliptic curve name for the connection.
  */
  def s2n_connection_get_curve(conn : Ptr[s2n_connection]): CString = extern

  /**
   * Query the connection object for the configured blinding delay.
  */
  def s2n_connection_get_delay(conn : Ptr[s2n_connection]): uint64_t = extern

  /**
   * Reports the current state of early data for a connection.
  */
  def s2n_connection_get_early_data_status(conn : Ptr[s2n_connection], status : Ptr[s2n_early_data_status_t]): CInt = extern

  /**
   * Function to return the last TLS handshake type that was processed. The returned format is a human readable string.
  */
  def s2n_connection_get_handshake_type_name(conn : Ptr[s2n_connection]): CString = extern

  /**
   * Function to get the human readable KEM group name for the connection.
  */
  def s2n_connection_get_kem_group_name(conn : Ptr[s2n_connection]): CString = extern

  /**
   * Function to get the human readable KEM name for the connection.
  */
  def s2n_connection_get_kem_name(conn : Ptr[s2n_connection]): CString = extern

  /**
   * Function to return the last TLS message that was processed. The returned format is a human readable string.
  */
  def s2n_connection_get_last_message_name(conn : Ptr[s2n_connection]): CString = extern

  /**
   * Reports the maximum size of the early data allowed by a connection.
  */
  def s2n_connection_get_max_early_data_size(conn : Ptr[s2n_connection], max_early_data_size : Ptr[uint32_t]): CInt = extern

  /**
   * Gets the negotiated PSK identity from the s2n connection object. If the negotiated PSK does not exist, the PSK identity will not be obtained and no error will be returned. Prior to this API call, use `s2n_connection_get_negotiated_psk_identity_length` to determine if a negotiated PSK exists or not.
  */
  def s2n_connection_get_negotiated_psk_identity(conn : Ptr[s2n_connection], identity : Ptr[uint8_t], max_identity_length : uint16_t): CInt = extern

  /**
   * Gets the negotiated PSK identity length from the s2n connection object. The negotiated PSK refers to the chosen PSK by the server to be used for the connection.
  */
  def s2n_connection_get_negotiated_psk_identity_length(conn : Ptr[s2n_connection], identity_length : Ptr[uint16_t]): CInt = extern

  /**
   * Query the connection for a buffer containing the OCSP response.
  */
  def s2n_connection_get_ocsp_response(conn : Ptr[s2n_connection], length : Ptr[uint32_t]): Ptr[uint8_t] = extern

  /**
   * Returns the validated peer certificate chain as a `s2n_cert_chain_and_key` opaque object.
  */
  def s2n_connection_get_peer_cert_chain(conn : Ptr[s2n_connection], cert_chain : Ptr[s2n_cert_chain_and_key]): CInt = extern

  /**
   * Gets the assigned file descriptor for the read channel of an s2n connection.
  */
  def s2n_connection_get_read_fd(conn : Ptr[s2n_connection], readfd : Ptr[CInt]): CInt = extern

  /**
   * Reports the remaining size of the early data allowed by a connection.
  */
  def s2n_connection_get_remaining_early_data_size(conn : Ptr[s2n_connection], allowed_early_data_size : Ptr[uint32_t]): CInt = extern

  /**
   * Query the connection for a buffer containing the Certificate Transparency response.
  */
  def s2n_connection_get_sct_list(conn : Ptr[s2n_connection], length : Ptr[uint32_t]): Ptr[uint8_t] = extern

  /**
   * Get the certificate used during the TLS handshake
  */
  def s2n_connection_get_selected_cert(conn : Ptr[s2n_connection]): Ptr[s2n_cert_chain_and_key] = extern

  /**
   * Get the client certificate's digest algorithm.
  */
  def s2n_connection_get_selected_client_cert_digest_algorithm(conn : Ptr[s2n_connection], chosen_alg : Ptr[s2n_tls_hash_algorithm]): CInt = extern

  /**
   * Get the client certificate's signature algorithm.
  */
  def s2n_connection_get_selected_client_cert_signature_algorithm(conn : Ptr[s2n_connection], chosen_alg : Ptr[s2n_tls_signature_algorithm]): CInt = extern

  /**
   * Get the connection's selected digest algorithm.
  */
  def s2n_connection_get_selected_digest_algorithm(conn : Ptr[s2n_connection], chosen_alg : Ptr[s2n_tls_hash_algorithm]): CInt = extern

  /**
   * Get the connection's selected signature algorithm.
  */
  def s2n_connection_get_selected_signature_algorithm(conn : Ptr[s2n_connection], chosen_alg : Ptr[s2n_tls_signature_algorithm]): CInt = extern

  /**
   * Access the protocol version supported by the server.
  */
  def s2n_connection_get_server_protocol_version(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Serializes the session state from connection and copies into the `session` buffer and returns the number of copied bytes
  */
  def s2n_connection_get_session(conn : Ptr[s2n_connection], session : Ptr[uint8_t], max_length : size_t): CInt = extern

  /**
   * Gets the latest session id from the connection, copies it into the `session_id` buffer, and returns the number of copied bytes.
  */
  def s2n_connection_get_session_id(conn : Ptr[s2n_connection], session_id : Ptr[uint8_t], max_length : size_t): CInt = extern

  /**
   * Gets the latest session id's length from the connection.
  */
  def s2n_connection_get_session_id_length(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Use this to query the serialized session state size before copying it into a buffer.
  */
  def s2n_connection_get_session_length(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Retrieves a hint from the server indicating how long this ticket's lifetime is.
  */
  def s2n_connection_get_session_ticket_lifetime_hint(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Returns the number of session tickets issued by the server.
  */
  def s2n_connection_get_tickets_sent(conn : Ptr[s2n_connection], num : Ptr[uint16_t]): CInt = extern

  /**
   * Get the number of bytes the connection has received.
  */
  def s2n_connection_get_wire_bytes_in(conn : Ptr[s2n_connection]): uint64_t = extern

  /**
   * Get the number of bytes the connection has transmitted out.
  */
  def s2n_connection_get_wire_bytes_out(conn : Ptr[s2n_connection]): uint64_t = extern

  /**
   * Gets the assigned file descriptor for the write channel of an s2n connection.
  */
  def s2n_connection_get_write_fd(conn : Ptr[s2n_connection], writefd : Ptr[CInt]): CInt = extern

  /**
   * Check is the connection is OCSP stapled.
  */
  def s2n_connection_is_ocsp_stapled(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Check if the connection was resumed from an earlier handshake.
  */
  def s2n_connection_is_session_resumed(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Function to check if the cipher used by current connection is supported by the current cipher preferences.
  */
  def s2n_connection_is_valid_for_cipher_preferences(conn : Ptr[s2n_connection], version : CString): CInt = extern

  /**
   * Creates a new connection object. Each s2n-tls SSL/TLS connection uses one of these objects. These connection objects can be operated on by up to two threads at a time, one sender and one receiver, but neither sending nor receiving are atomic, so if these objects are being called by multiple sender or receiver threads, you must perform your own locking to ensure that only one sender or receiver is active at a time.
  */
  def s2n_connection_new(mode : s2n_mode): Ptr[s2n_connection] = extern

  /**
   * Change the behavior of s2n-tls when sending data to prefer low latency.
  */
  def s2n_connection_prefer_low_latency(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Change the behavior of s2n-tls when sending data to prefer high throughput.
  */
  def s2n_connection_prefer_throughput(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Wipes and free the `in` and `out` buffers associated with a connection.
  */
  def s2n_connection_release_buffers(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Must be invoked if any of the connection properties were changed on the basis of the server_name extension. This must be invoked before marking the Client Hello callback done.
  */
  def s2n_connection_server_name_extension_used(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Used to configure s2n-tls to either use built-in blinding (set blinding to S2N_BUILT_IN_BLINDING) or self-service blinding (set blinding to S2N_SELF_SERVICE_BLINDING).
  */
  def s2n_connection_set_blinding(conn : Ptr[s2n_connection], blinding : s2n_blinding): CInt = extern

  /**
   * Sets the cipher preference override for the s2n_connection. Calling this function is not necessary unless you want to set the cipher preferences on the connection to something different than what is in the s2n_config.
  */
  def s2n_connection_set_cipher_preferences(conn : Ptr[s2n_connection], version : CString): CInt = extern

  /**
   * Sets whether or not a Client Certificate should be required to complete the TLS Connection.
  */
  def s2n_connection_set_client_auth_type(conn : Ptr[s2n_connection], client_auth_type : s2n_cert_auth_type): CInt = extern

  /**
   * Associates a configuration object with a connection.
  */
  def s2n_connection_set_config(conn : Ptr[s2n_connection], config : Ptr[s2n_config]): CInt = extern

  /**
   * Sets user defined context in `s2n_connection` object.
  */
  def s2n_connection_set_ctx(conn : Ptr[s2n_connection], ctx : Ptr[Byte]): CInt = extern

  /**
   * Configure the connection to free IO buffers when they are not currently in use.
  */
  def s2n_connection_set_dynamic_buffers(conn : Ptr[s2n_connection], enabled : Boolean): CInt = extern

  /**
   * Changes the behavior of s2n-tls when sending data to initially prefer records small enough to fit in single ethernet frames.
  */
  def s2n_connection_set_dynamic_record_threshold(conn : Ptr[s2n_connection], resize_threshold : uint32_t, timeout_threshold : uint16_t): CInt = extern

  /**
   * Sets the file descriptor for a s2n connection.
  */
  def s2n_connection_set_fd(conn : Ptr[s2n_connection], fd : CInt): CInt = extern

  /**
   * Sets the protocol preference override for the s2n_connection. Calling this function is not necessary unless you want to set the protocol preferences on the connection to something different than what is in the s2n_config.
  */
  def s2n_connection_set_protocol_preferences(conn : Ptr[s2n_connection], protocols : Ptr[CString], protocol_count : CInt): CInt = extern

  /**
   * Sets the PSK mode on the s2n connection object. The supported PSK modes are listed in the enum `s2n_psk_mode` above. This API overrides the PSK mode set on config for this connection.
  */
  def s2n_connection_set_psk_mode(conn : Ptr[s2n_connection], mode : s2n_psk_mode): CInt = extern

  /**
   * Sets the file descriptor for the read channel of an s2n connection.
  */
  def s2n_connection_set_read_fd(conn : Ptr[s2n_connection], readfd : CInt): CInt = extern

  /**
   * Configure a connection to use a recv callback to receive data.
  */
  def s2n_connection_set_recv_cb(conn : Ptr[s2n_connection], recv : s2n_recv_fn): CInt = extern

  /**
   * Set a context containing anything needed in the recv callback function (for example, a file descriptor), the buffer holding data to be sent or received, and the length of the buffer.
  */
  def s2n_connection_set_recv_ctx(conn : Ptr[s2n_connection], ctx : Ptr[Byte]): CInt = extern

  /**
   * Configure a connection to use a send callback to send data.
  */
  def s2n_connection_set_send_cb(conn : Ptr[s2n_connection], send : s2n_send_fn): CInt = extern

  /**
   * Set a context containing anything needed in the send callback function (for example, a file descriptor), the buffer holding data to be sent or received, and the length of the buffer.
  */
  def s2n_connection_set_send_ctx(conn : Ptr[s2n_connection], ctx : Ptr[Byte]): CInt = extern

  /**
   * Sets the user context associated with early data on a server.
  */
  def s2n_connection_set_server_early_data_context(conn : Ptr[s2n_connection], context : Ptr[uint8_t], context_size : uint16_t): CInt = extern

  /**
   * Sets the keying material lifetime for >=TLS1.3 session tickets so that one session doesn't get re-used ad infinitum. The default value is one week.
  */
  def s2n_connection_set_server_keying_material_lifetime(conn : Ptr[s2n_connection], lifetime_in_secs : uint32_t): CInt = extern

  /**
   * Sets the maximum bytes of early data the server will accept.
  */
  def s2n_connection_set_server_max_early_data_size(conn : Ptr[s2n_connection], max_early_data_size : uint32_t): CInt = extern

  /**
   * De-serializes the session state and updates the connection accordingly.
  */
  def s2n_connection_set_session(conn : Ptr[s2n_connection], session : Ptr[uint8_t], length : size_t): CInt = extern

  /**
   * Sets the callback to use for verifying that a hostname from an X.509 certificate is trusted.
  */
  def s2n_connection_set_verify_host_callback(conn : Ptr[s2n_connection], host_fn : s2n_verify_host_fn, data : Ptr[Byte]): CInt = extern

  /**
   * Sets the assigned file descriptor for the write channel of an s2n connection.
  */
  def s2n_connection_set_write_fd(conn : Ptr[s2n_connection], writefd : CInt): CInt = extern

  /**
   * Indicates to s2n that the connection is using corked IO.
  */
  def s2n_connection_use_corked_io(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Wipes an existing connection and allows it to be reused. Erases all data associated with a connection including pending reads.
  */
  def s2n_connection_wipe(conn : Ptr[s2n_connection]): CInt = extern

  /**
   * Prevents S2N from calling `OPENSSL_init_crypto`/`OPENSSL_cleanup`/`EVP_cleanup` on OpenSSL versions prior to 1.1.x. This allows applications or languages that also init OpenSSL to interoperate with S2N.
  */
  def s2n_crypto_disable_init(): CInt = extern

  /**
   * Prevents S2N from installing an atexit handler, which allows safe shutdown of S2N from within a re-entrant shared library
  */
  def s2n_disable_atexit(): CInt = extern

  /**
   * This function can be used instead of trying to resolve `s2n_errno` directly in runtimes where thread-local variables may not be easily accessible.
  */
  def s2n_errno_location(): Ptr[CInt] = extern

  /**
   * Gets the category of error from an error.
  */
  def s2n_error_get_type(error : CInt): CInt = extern

  /**
   * Creates a new s2n external pre-shared key (PSK) object with `S2N_PSK_HMAC_SHA256` as the default PSK hash algorithm. An external PSK is a key established outside of TLS using a secure mutually agreed upon mechanism.
  */
  def s2n_external_psk_new(): Ptr[s2n_psk] = extern

  /**
   * Clean up the memory used to contain the stack trace.
  */
  def s2n_free_stacktrace(): CInt = extern

  /**
   * Query the connection for the selected application protocol.
  */
  def s2n_get_application_protocol(conn : Ptr[s2n_connection]): CString = extern

  /**
   * Fetches the OpenSSL version s2n-tls was compiled with. This can be used by applications to validate at runtime that the versions of s2n-tls and Openssl that they have loaded are correct.
  */
  def s2n_get_openssl_version(): CUnsignedLongInt = extern

  /**
   * Query the connection for the selected server name.
  */
  def s2n_get_server_name(conn : Ptr[s2n_connection]): CString = extern

  /**
   * Export the s2n_stacktrace.
  */
  def s2n_get_stacktrace(trace : Ptr[s2n_stacktrace]): CInt = extern

  /**
   * Initializes the s2n-tls library and should be called once in your application, before any other s2n-tls functions are called. Failure to call s2n_init() will result in errors from other s2n-tls functions.
  */
  def s2n_init(): CInt = extern

  /**
   * Allows the caller to override s2n-tls's internal memory handling functions.
  */
  def s2n_mem_set_callbacks(mem_init_callback : s2n_mem_init_callback, mem_cleanup_callback : s2n_mem_cleanup_callback, mem_malloc_callback : s2n_mem_malloc_callback, mem_free_callback : s2n_mem_free_callback): CInt = extern

  /**
   * Performs the initial "handshake" phase of a TLS connection and must be called before any s2n_recv() or s2n_send() calls.
  */
  def s2n_negotiate(conn : Ptr[s2n_connection], blocked : Ptr[s2n_blocked_status]): CInt = extern

  /**
   * Accept early data offered by the client.
  */
  def s2n_offered_early_data_accept(early_data : Ptr[s2n_offered_early_data]): CInt = extern

  /**
   * Get the early data context set by the user.
  */
  def s2n_offered_early_data_get_context(early_data : Ptr[s2n_offered_early_data], context : Ptr[uint8_t], max_len : uint16_t): CInt = extern

  /**
   * Get the length of the early data context set by the user.
  */
  def s2n_offered_early_data_get_context_length(early_data : Ptr[s2n_offered_early_data], context_len : Ptr[uint16_t]): CInt = extern

  /**
   * Reject early data offered by the client.
  */
  def s2n_offered_early_data_reject(early_data : Ptr[s2n_offered_early_data]): CInt = extern

  /**
   * Frees the memory associated with the `s2n_offered_psk` object.
  */
  def s2n_offered_psk_free(psk : Ptr[Ptr[s2n_offered_psk]]): CInt = extern

  /**
   * Gets the PSK identity and PSK identity length for a given offered PSK object.
  */
  def s2n_offered_psk_get_identity(psk : Ptr[s2n_offered_psk], identity : Ptr[Ptr[uint8_t]], size : Ptr[uint16_t]): CInt = extern

  /**
   * Chooses a PSK from the offered PSK list to be used for the connection. This API matches the PSK identity received from the client against the server's known PSK identities list, in order to choose the PSK to be used for the connection. If the PSK identity sent from the client is NULL, no PSK is chosen for the connection. If the client offered PSK identity has no matching PSK identity with the server, an error will be returned. Use this API along with the `s2n_psk_selection_callback` callback to select a PSK identity.
  */
  def s2n_offered_psk_list_choose_psk(psk_list : Ptr[s2n_offered_psk_list], psk : Ptr[s2n_offered_psk]): CInt = extern

  /**
   * Checks whether the offered PSK list has an offered psk object next in line in the list. An offered PSK list contains all the PSKs offered by the client for the server to select.
  */
  def s2n_offered_psk_list_has_next(psk_list : Ptr[s2n_offered_psk_list]): Boolean = extern

  /**
   * Obtains the next offered PSK object from the list of offered PSKs. Use `s2n_offered_psk_list_has_next` prior to this API call to ensure we have not reached the end of the list.
  */
  def s2n_offered_psk_list_next(psk_list : Ptr[s2n_offered_psk_list], psk : Ptr[s2n_offered_psk]): CInt = extern

  /**
   * Returns the offered PSK list to its original read state.
  */
  def s2n_offered_psk_list_reread(psk_list : Ptr[s2n_offered_psk_list]): CInt = extern

  /**
   * Creates a new s2n offered PSK object. An offered PSK object represents a single PSK sent by the client.
  */
  def s2n_offered_psk_new(): Ptr[s2n_offered_psk] = extern

  /**
   * Allows users of s2n-tls to peek inside the data buffer of an s2n-tls connection to see if there more data to be read without actually reading it.
  */
  def s2n_peek(conn : Ptr[s2n_connection]): uint32_t = extern

  /**
   * Prints the s2n stack trace to a file. The file descriptor is expected to be open and ready for writing.
  */
  def s2n_print_stacktrace(fptr : Ptr[FILE]): CInt = extern

  /**
   * Configures a particular pre-shared key to allow early data.
  */
  def s2n_psk_configure_early_data(psk : Ptr[s2n_psk], max_early_data_size : uint32_t, cipher_suite_first_byte : uint8_t, cipher_suite_second_byte : uint8_t): CInt = extern

  /**
   * Frees the memory associated with the external PSK object.
  */
  def s2n_psk_free(psk : Ptr[Ptr[s2n_psk]]): CInt = extern

  /**
   * Sets the optional `application_protocol` associated with the given pre-shared key.
  */
  def s2n_psk_set_application_protocol(psk : Ptr[s2n_psk], application_protocol : Ptr[uint8_t], size : uint8_t): CInt = extern

  /**
   * Sets the optional user early data context associated with the given pre-shared key.
  */
  def s2n_psk_set_early_data_context(psk : Ptr[s2n_psk], context : Ptr[uint8_t], size : uint16_t): CInt = extern

  /**
   * Sets the hash algorithm for a given external PSK object. The supported PSK hash algorithms are as listed in the enum `s2n_psk_hmac` above.
  */
  def s2n_psk_set_hmac(psk : Ptr[s2n_psk], hmac : s2n_psk_hmac): CInt = extern

  /**
   * Sets the identity for a given external PSK object. The identity is a unique identifier for the pre-shared secret. It is a non-secret value represented by raw bytes.
  */
  def s2n_psk_set_identity(psk : Ptr[s2n_psk], identity : Ptr[uint8_t], identity_size : uint16_t): CInt = extern

  /**
   * Sets the out-of-band/externally provisioned secret for a given external PSK object.
  */
  def s2n_psk_set_secret(psk : Ptr[s2n_psk], secret : Ptr[uint8_t], secret_size : uint16_t): CInt = extern

  /**
   * Allows the caller to override s2n-tls's entropy functions.
  */
  def s2n_rand_set_callbacks(rand_init_callback : s2n_rand_init_callback, rand_cleanup_callback : s2n_rand_cleanup_callback, rand_seed_callback : s2n_rand_seed_callback, rand_mix_callback : s2n_rand_mix_callback): CInt = extern

  /**
   * Decrypts and reads **size* to `buf` data from the associated connection.
  */
  def s2n_recv(conn : Ptr[s2n_connection], buf : Ptr[Byte], size : ssize_t, blocked : Ptr[s2n_blocked_status]): ssize_t = extern

  /**
   * Called by the server to begin negotiation and accept any early data the client sends.
  */
  def s2n_recv_early_data(conn : Ptr[s2n_connection], data : Ptr[uint8_t], max_data_len : ssize_t, data_received : Ptr[ssize_t], blocked : Ptr[s2n_blocked_status]): CInt = extern

  /**
   * Writes and encrypts `size` of `buf` data to the associated connection. s2n_send() will return the number of bytes written, and may indicate a partial write.
  */
  def s2n_send(conn : Ptr[s2n_connection], buf : Ptr[Byte], size : ssize_t, blocked : Ptr[s2n_blocked_status]): ssize_t = extern

  /**
   * Called by the client to begin negotiation and send early data.
  */
  def s2n_send_early_data(conn : Ptr[s2n_connection], data : Ptr[uint8_t], data_len : ssize_t, data_sent : Ptr[ssize_t], blocked : Ptr[s2n_blocked_status]): CInt = extern

  /**
   * Works in the same way as s2n_sendv_with_offset() except that the latter's `offs` parameter is implicitly assumed to be 0. Therefore in the partial write case, the caller would have to make sure that `bufs` and `count` fields are modified in a way that takes the partial writes into account.
  */
  def s2n_sendv(conn : Ptr[s2n_connection], bufs : Ptr[iovec], count : ssize_t, blocked : Ptr[s2n_blocked_status]): ssize_t = extern

  /**
   * Works in the same way as s2n_send() except that it accepts vectorized buffers. Will return the number of bytes written, and may indicate a partial write. Partial writes are possible not just for non-blocking I/O, but also for connections aborted while active.
  */
  def s2n_sendv_with_offset(conn : Ptr[s2n_connection], bufs : Ptr[iovec], count : ssize_t, offs : ssize_t, blocked : Ptr[s2n_blocked_status]): ssize_t = extern

  /**
   * Gets the session ticket data from a session ticket object.
  */
  def s2n_session_ticket_get_data(ticket : Ptr[s2n_session_ticket], max_data_len : size_t, data : Ptr[uint8_t]): CInt = extern

  /**
   * Gets the length of the session ticket from a session ticket object.
  */
  def s2n_session_ticket_get_data_len(ticket : Ptr[s2n_session_ticket], data_len : Ptr[size_t]): CInt = extern

  /**
   * Gets the lifetime in seconds of the session ticket from a session ticket object.
  */
  def s2n_session_ticket_get_lifetime(ticket : Ptr[s2n_session_ticket], session_lifetime : Ptr[uint32_t]): CInt = extern

  /**
   * Sets the server name for the connection.
  */
  def s2n_set_server_name(conn : Ptr[s2n_connection], server_name : CString): CInt = extern

  /**
   * Attempts a closure at the TLS layer. Does not close the underlying transport. This call may block in either direction.
  */
  def s2n_shutdown(conn : Ptr[s2n_connection], blocked : Ptr[s2n_blocked_status]): CInt = extern

  /**
   * Checks if s2n stack trace captures are enabled.
  */
  def s2n_stack_traces_enabled(): Boolean = extern

  /**
   * Configures the s2n stack trace captures option.
  */
  def s2n_stack_traces_enabled_set(newval : Boolean): CInt = extern

  /**
   * Translates an s2n_error code to a human readable string explaining the error.
  */
  def s2n_strerror(error : CInt, lang : CString): CString = extern

  /**
   * Translates an s2n_error code to a human readable string containing internal debug information, including file name and line number. This function is useful when reporting issues to the s2n-tls development team.
  */
  def s2n_strerror_debug(error : CInt, lang : CString): CString = extern

  /**
   * Translates an s2n_error code to a human readable string.
  */
  def s2n_strerror_name(error : CInt): CString = extern


object functions:
  import _root_.s2n.enumerations.*
  import _root_.s2n.predef.*
  import _root_.s2n.aliases.*
  import _root_.s2n.structs.*
  import extern_functions.*
  export extern_functions.*

object types:
  export _root_.s2n.structs.*
  export _root_.s2n.aliases.*
  export _root_.s2n.enumerations.*

object all:
  export _root_.s2n.enumerations.s2n_alert_behavior
  export _root_.s2n.enumerations.s2n_async_pkey_op_type
  export _root_.s2n.enumerations.s2n_async_pkey_validation_mode
  export _root_.s2n.enumerations.s2n_blinding
  export _root_.s2n.enumerations.s2n_blocked_status
  export _root_.s2n.enumerations.s2n_cert_auth_type
  export _root_.s2n.enumerations.s2n_client_hello_cb_mode
  export _root_.s2n.enumerations.s2n_ct_support_level
  export _root_.s2n.enumerations.s2n_early_data_status_t
  export _root_.s2n.enumerations.s2n_error_type
  export _root_.s2n.enumerations.s2n_max_frag_len
  export _root_.s2n.enumerations.s2n_mode
  export _root_.s2n.enumerations.s2n_psk_hmac
  export _root_.s2n.enumerations.s2n_psk_mode
  export _root_.s2n.enumerations.s2n_status_request_type
  export _root_.s2n.enumerations.s2n_tls_extension_type
  export _root_.s2n.enumerations.s2n_tls_hash_algorithm
  export _root_.s2n.enumerations.s2n_tls_signature_algorithm
  export _root_.s2n.enumerations.s2n_verify_after_sign
  export _root_.s2n.aliases.FILE
  export _root_.s2n.aliases.iovec
  export _root_.s2n.aliases.s2n_async_pkey_fn
  export _root_.s2n.aliases.s2n_cache_delete_callback
  export _root_.s2n.aliases.s2n_cache_retrieve_callback
  export _root_.s2n.aliases.s2n_cache_store_callback
  export _root_.s2n.aliases.s2n_cert_tiebreak_callback
  export _root_.s2n.aliases.s2n_client_hello_fn
  export _root_.s2n.aliases.s2n_clock_time_nanoseconds
  export _root_.s2n.aliases.s2n_early_data_cb
  export _root_.s2n.aliases.s2n_key_log_fn
  export _root_.s2n.aliases.s2n_mem_cleanup_callback
  export _root_.s2n.aliases.s2n_mem_free_callback
  export _root_.s2n.aliases.s2n_mem_init_callback
  export _root_.s2n.aliases.s2n_mem_malloc_callback
  export _root_.s2n.aliases.s2n_psk_selection_callback
  export _root_.s2n.aliases.s2n_rand_cleanup_callback
  export _root_.s2n.aliases.s2n_rand_init_callback
  export _root_.s2n.aliases.s2n_rand_mix_callback
  export _root_.s2n.aliases.s2n_rand_seed_callback
  export _root_.s2n.aliases.s2n_recv_fn
  export _root_.s2n.aliases.s2n_send_fn
  export _root_.s2n.aliases.s2n_session_ticket_fn
  export _root_.s2n.aliases.s2n_verify_host_fn
  export _root_.s2n.aliases.size_t
  export _root_.s2n.aliases.ssize_t
  export _root_.s2n.aliases.uint16_t
  export _root_.s2n.aliases.uint32_t
  export _root_.s2n.aliases.uint64_t
  export _root_.s2n.aliases.uint8_t
  export _root_.s2n.structs.s2n_async_pkey_op
  export _root_.s2n.structs.s2n_cert
  export _root_.s2n.structs.s2n_cert_chain_and_key
  export _root_.s2n.structs.s2n_cert_private_key
  export _root_.s2n.structs.s2n_cert_public_key
  export _root_.s2n.structs.s2n_client_hello
  export _root_.s2n.structs.s2n_config
  export _root_.s2n.structs.s2n_connection
  export _root_.s2n.structs.s2n_offered_early_data
  export _root_.s2n.structs.s2n_offered_psk
  export _root_.s2n.structs.s2n_offered_psk_list
  export _root_.s2n.structs.s2n_pkey
  export _root_.s2n.structs.s2n_psk
  export _root_.s2n.structs.s2n_session_ticket
  export _root_.s2n.structs.s2n_stacktrace
  export _root_.s2n.functions.s2n_async_pkey_op_apply
  export _root_.s2n.functions.s2n_async_pkey_op_free
  export _root_.s2n.functions.s2n_async_pkey_op_get_input
  export _root_.s2n.functions.s2n_async_pkey_op_get_input_size
  export _root_.s2n.functions.s2n_async_pkey_op_get_op_type
  export _root_.s2n.functions.s2n_async_pkey_op_perform
  export _root_.s2n.functions.s2n_async_pkey_op_set_output
  export _root_.s2n.functions.s2n_calculate_stacktrace
  export _root_.s2n.functions.s2n_cert_chain_and_key_free
  export _root_.s2n.functions.s2n_cert_chain_and_key_get_ctx
  export _root_.s2n.functions.s2n_cert_chain_and_key_get_private_key
  export _root_.s2n.functions.s2n_cert_chain_and_key_load_pem
  export _root_.s2n.functions.s2n_cert_chain_and_key_load_pem_bytes
  export _root_.s2n.functions.s2n_cert_chain_and_key_load_public_pem_bytes
  export _root_.s2n.functions.s2n_cert_chain_and_key_new
  export _root_.s2n.functions.s2n_cert_chain_and_key_set_ctx
  export _root_.s2n.functions.s2n_cert_chain_and_key_set_ocsp_data
  export _root_.s2n.functions.s2n_cert_chain_and_key_set_sct_list
  export _root_.s2n.functions.s2n_cert_chain_get_cert
  export _root_.s2n.functions.s2n_cert_chain_get_length
  export _root_.s2n.functions.s2n_cert_get_der
  export _root_.s2n.functions.s2n_cert_get_utf8_string_from_extension_data
  export _root_.s2n.functions.s2n_cert_get_utf8_string_from_extension_data_length
  export _root_.s2n.functions.s2n_cert_get_x509_extension_value
  export _root_.s2n.functions.s2n_cert_get_x509_extension_value_length
  export _root_.s2n.functions.s2n_cleanup
  export _root_.s2n.functions.s2n_client_hello_cb_done
  export _root_.s2n.functions.s2n_client_hello_get_cipher_suites
  export _root_.s2n.functions.s2n_client_hello_get_cipher_suites_length
  export _root_.s2n.functions.s2n_client_hello_get_extension_by_id
  export _root_.s2n.functions.s2n_client_hello_get_extension_length
  export _root_.s2n.functions.s2n_client_hello_get_extensions
  export _root_.s2n.functions.s2n_client_hello_get_extensions_length
  export _root_.s2n.functions.s2n_client_hello_get_raw_message
  export _root_.s2n.functions.s2n_client_hello_get_raw_message_length
  export _root_.s2n.functions.s2n_client_hello_get_session_id
  export _root_.s2n.functions.s2n_client_hello_get_session_id_length
  export _root_.s2n.functions.s2n_client_hello_has_extension
  export _root_.s2n.functions.s2n_config_accept_max_fragment_length
  export _root_.s2n.functions.s2n_config_add_cert_chain_and_key
  export _root_.s2n.functions.s2n_config_add_cert_chain_and_key_to_store
  export _root_.s2n.functions.s2n_config_add_dhparams
  export _root_.s2n.functions.s2n_config_add_pem_to_trust_store
  export _root_.s2n.functions.s2n_config_add_ticket_crypto_key
  export _root_.s2n.functions.s2n_config_append_protocol_preference
  export _root_.s2n.functions.s2n_config_disable_x509_verification
  export _root_.s2n.functions.s2n_config_enable_cert_req_dss_legacy_compat
  export _root_.s2n.functions.s2n_config_free
  export _root_.s2n.functions.s2n_config_free_cert_chain_and_key
  export _root_.s2n.functions.s2n_config_free_dhparams
  export _root_.s2n.functions.s2n_config_get_client_auth_type
  export _root_.s2n.functions.s2n_config_get_ctx
  export _root_.s2n.functions.s2n_config_new
  export _root_.s2n.functions.s2n_config_send_max_fragment_length
  export _root_.s2n.functions.s2n_config_set_alert_behavior
  export _root_.s2n.functions.s2n_config_set_async_pkey_callback
  export _root_.s2n.functions.s2n_config_set_async_pkey_validation_mode
  export _root_.s2n.functions.s2n_config_set_cache_delete_callback
  export _root_.s2n.functions.s2n_config_set_cache_retrieve_callback
  export _root_.s2n.functions.s2n_config_set_cache_store_callback
  export _root_.s2n.functions.s2n_config_set_cert_chain_and_key_defaults
  export _root_.s2n.functions.s2n_config_set_cert_tiebreak_callback
  export _root_.s2n.functions.s2n_config_set_check_stapled_ocsp_response
  export _root_.s2n.functions.s2n_config_set_cipher_preferences
  export _root_.s2n.functions.s2n_config_set_client_auth_type
  export _root_.s2n.functions.s2n_config_set_client_hello_cb
  export _root_.s2n.functions.s2n_config_set_client_hello_cb_mode
  export _root_.s2n.functions.s2n_config_set_ct_support_level
  export _root_.s2n.functions.s2n_config_set_ctx
  export _root_.s2n.functions.s2n_config_set_early_data_cb
  export _root_.s2n.functions.s2n_config_set_extension_data
  export _root_.s2n.functions.s2n_config_set_initial_ticket_count
  export _root_.s2n.functions.s2n_config_set_key_log_cb
  export _root_.s2n.functions.s2n_config_set_max_cert_chain_depth
  export _root_.s2n.functions.s2n_config_set_monotonic_clock
  export _root_.s2n.functions.s2n_config_set_protocol_preferences
  export _root_.s2n.functions.s2n_config_set_psk_mode
  export _root_.s2n.functions.s2n_config_set_psk_selection_callback
  export _root_.s2n.functions.s2n_config_set_recv_multi_record
  export _root_.s2n.functions.s2n_config_set_send_buffer_size
  export _root_.s2n.functions.s2n_config_set_server_max_early_data_size
  export _root_.s2n.functions.s2n_config_set_session_cache_onoff
  export _root_.s2n.functions.s2n_config_set_session_state_lifetime
  export _root_.s2n.functions.s2n_config_set_session_ticket_cb
  export _root_.s2n.functions.s2n_config_set_session_tickets_onoff
  export _root_.s2n.functions.s2n_config_set_status_request_type
  export _root_.s2n.functions.s2n_config_set_ticket_decrypt_key_lifetime
  export _root_.s2n.functions.s2n_config_set_ticket_encrypt_decrypt_key_lifetime
  export _root_.s2n.functions.s2n_config_set_verification_ca_location
  export _root_.s2n.functions.s2n_config_set_verify_after_sign
  export _root_.s2n.functions.s2n_config_set_verify_host_callback
  export _root_.s2n.functions.s2n_config_set_wall_clock
  export _root_.s2n.functions.s2n_config_wipe_trust_store
  export _root_.s2n.functions.s2n_connection_add_new_tickets_to_send
  export _root_.s2n.functions.s2n_connection_append_protocol_preference
  export _root_.s2n.functions.s2n_connection_append_psk
  export _root_.s2n.functions.s2n_connection_client_cert_used
  export _root_.s2n.functions.s2n_connection_free
  export _root_.s2n.functions.s2n_connection_free_handshake
  export _root_.s2n.functions.s2n_connection_get_actual_protocol_version
  export _root_.s2n.functions.s2n_connection_get_alert
  export _root_.s2n.functions.s2n_connection_get_cipher
  export _root_.s2n.functions.s2n_connection_get_cipher_iana_value
  export _root_.s2n.functions.s2n_connection_get_client_auth_type
  export _root_.s2n.functions.s2n_connection_get_client_cert_chain
  export _root_.s2n.functions.s2n_connection_get_client_hello
  export _root_.s2n.functions.s2n_connection_get_client_hello_version
  export _root_.s2n.functions.s2n_connection_get_client_protocol_version
  export _root_.s2n.functions.s2n_connection_get_ctx
  export _root_.s2n.functions.s2n_connection_get_curve
  export _root_.s2n.functions.s2n_connection_get_delay
  export _root_.s2n.functions.s2n_connection_get_early_data_status
  export _root_.s2n.functions.s2n_connection_get_handshake_type_name
  export _root_.s2n.functions.s2n_connection_get_kem_group_name
  export _root_.s2n.functions.s2n_connection_get_kem_name
  export _root_.s2n.functions.s2n_connection_get_last_message_name
  export _root_.s2n.functions.s2n_connection_get_max_early_data_size
  export _root_.s2n.functions.s2n_connection_get_negotiated_psk_identity
  export _root_.s2n.functions.s2n_connection_get_negotiated_psk_identity_length
  export _root_.s2n.functions.s2n_connection_get_ocsp_response
  export _root_.s2n.functions.s2n_connection_get_peer_cert_chain
  export _root_.s2n.functions.s2n_connection_get_read_fd
  export _root_.s2n.functions.s2n_connection_get_remaining_early_data_size
  export _root_.s2n.functions.s2n_connection_get_sct_list
  export _root_.s2n.functions.s2n_connection_get_selected_cert
  export _root_.s2n.functions.s2n_connection_get_selected_client_cert_digest_algorithm
  export _root_.s2n.functions.s2n_connection_get_selected_client_cert_signature_algorithm
  export _root_.s2n.functions.s2n_connection_get_selected_digest_algorithm
  export _root_.s2n.functions.s2n_connection_get_selected_signature_algorithm
  export _root_.s2n.functions.s2n_connection_get_server_protocol_version
  export _root_.s2n.functions.s2n_connection_get_session
  export _root_.s2n.functions.s2n_connection_get_session_id
  export _root_.s2n.functions.s2n_connection_get_session_id_length
  export _root_.s2n.functions.s2n_connection_get_session_length
  export _root_.s2n.functions.s2n_connection_get_session_ticket_lifetime_hint
  export _root_.s2n.functions.s2n_connection_get_tickets_sent
  export _root_.s2n.functions.s2n_connection_get_wire_bytes_in
  export _root_.s2n.functions.s2n_connection_get_wire_bytes_out
  export _root_.s2n.functions.s2n_connection_get_write_fd
  export _root_.s2n.functions.s2n_connection_is_ocsp_stapled
  export _root_.s2n.functions.s2n_connection_is_session_resumed
  export _root_.s2n.functions.s2n_connection_is_valid_for_cipher_preferences
  export _root_.s2n.functions.s2n_connection_new
  export _root_.s2n.functions.s2n_connection_prefer_low_latency
  export _root_.s2n.functions.s2n_connection_prefer_throughput
  export _root_.s2n.functions.s2n_connection_release_buffers
  export _root_.s2n.functions.s2n_connection_server_name_extension_used
  export _root_.s2n.functions.s2n_connection_set_blinding
  export _root_.s2n.functions.s2n_connection_set_cipher_preferences
  export _root_.s2n.functions.s2n_connection_set_client_auth_type
  export _root_.s2n.functions.s2n_connection_set_config
  export _root_.s2n.functions.s2n_connection_set_ctx
  export _root_.s2n.functions.s2n_connection_set_dynamic_buffers
  export _root_.s2n.functions.s2n_connection_set_dynamic_record_threshold
  export _root_.s2n.functions.s2n_connection_set_fd
  export _root_.s2n.functions.s2n_connection_set_protocol_preferences
  export _root_.s2n.functions.s2n_connection_set_psk_mode
  export _root_.s2n.functions.s2n_connection_set_read_fd
  export _root_.s2n.functions.s2n_connection_set_recv_cb
  export _root_.s2n.functions.s2n_connection_set_recv_ctx
  export _root_.s2n.functions.s2n_connection_set_send_cb
  export _root_.s2n.functions.s2n_connection_set_send_ctx
  export _root_.s2n.functions.s2n_connection_set_server_early_data_context
  export _root_.s2n.functions.s2n_connection_set_server_keying_material_lifetime
  export _root_.s2n.functions.s2n_connection_set_server_max_early_data_size
  export _root_.s2n.functions.s2n_connection_set_session
  export _root_.s2n.functions.s2n_connection_set_verify_host_callback
  export _root_.s2n.functions.s2n_connection_set_write_fd
  export _root_.s2n.functions.s2n_connection_use_corked_io
  export _root_.s2n.functions.s2n_connection_wipe
  export _root_.s2n.functions.s2n_crypto_disable_init
  export _root_.s2n.functions.s2n_disable_atexit
  export _root_.s2n.functions.s2n_errno_location
  export _root_.s2n.functions.s2n_error_get_type
  export _root_.s2n.functions.s2n_external_psk_new
  export _root_.s2n.functions.s2n_free_stacktrace
  export _root_.s2n.functions.s2n_get_application_protocol
  export _root_.s2n.functions.s2n_get_openssl_version
  export _root_.s2n.functions.s2n_get_server_name
  export _root_.s2n.functions.s2n_get_stacktrace
  export _root_.s2n.functions.s2n_init
  export _root_.s2n.functions.s2n_mem_set_callbacks
  export _root_.s2n.functions.s2n_negotiate
  export _root_.s2n.functions.s2n_offered_early_data_accept
  export _root_.s2n.functions.s2n_offered_early_data_get_context
  export _root_.s2n.functions.s2n_offered_early_data_get_context_length
  export _root_.s2n.functions.s2n_offered_early_data_reject
  export _root_.s2n.functions.s2n_offered_psk_free
  export _root_.s2n.functions.s2n_offered_psk_get_identity
  export _root_.s2n.functions.s2n_offered_psk_list_choose_psk
  export _root_.s2n.functions.s2n_offered_psk_list_has_next
  export _root_.s2n.functions.s2n_offered_psk_list_next
  export _root_.s2n.functions.s2n_offered_psk_list_reread
  export _root_.s2n.functions.s2n_offered_psk_new
  export _root_.s2n.functions.s2n_peek
  export _root_.s2n.functions.s2n_print_stacktrace
  export _root_.s2n.functions.s2n_psk_configure_early_data
  export _root_.s2n.functions.s2n_psk_free
  export _root_.s2n.functions.s2n_psk_set_application_protocol
  export _root_.s2n.functions.s2n_psk_set_early_data_context
  export _root_.s2n.functions.s2n_psk_set_hmac
  export _root_.s2n.functions.s2n_psk_set_identity
  export _root_.s2n.functions.s2n_psk_set_secret
  export _root_.s2n.functions.s2n_rand_set_callbacks
  export _root_.s2n.functions.s2n_recv
  export _root_.s2n.functions.s2n_recv_early_data
  export _root_.s2n.functions.s2n_send
  export _root_.s2n.functions.s2n_send_early_data
  export _root_.s2n.functions.s2n_sendv
  export _root_.s2n.functions.s2n_sendv_with_offset
  export _root_.s2n.functions.s2n_session_ticket_get_data
  export _root_.s2n.functions.s2n_session_ticket_get_data_len
  export _root_.s2n.functions.s2n_session_ticket_get_lifetime
  export _root_.s2n.functions.s2n_set_server_name
  export _root_.s2n.functions.s2n_shutdown
  export _root_.s2n.functions.s2n_stack_traces_enabled
  export _root_.s2n.functions.s2n_stack_traces_enabled_set
  export _root_.s2n.functions.s2n_strerror
  export _root_.s2n.functions.s2n_strerror_debug
  export _root_.s2n.functions.s2n_strerror_name