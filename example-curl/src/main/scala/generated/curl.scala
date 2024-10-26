package curl

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[curl] trait CEnum[T](using eq: T =:= Int):
    given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def int: CInt = eq.apply(t)
      inline def value: CInt = eq.apply(t)
  private[curl] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def int: CInt = eq.apply(t).toInt
      inline def uint: CUnsignedInt = eq.apply(t)
      inline def value: CUnsignedInt = eq.apply(t)
end predef

object enumerations:
  import predef.*
  opaque type CURLFORMcode = CUnsignedInt
  object CURLFORMcode extends CEnumU[CURLFORMcode]:
    given _tag: Tag[CURLFORMcode] = Tag.UInt
    inline def define(inline a: Long): CURLFORMcode = a.toUInt
    val CURL_FORMADD_OK = define(0)
    val CURL_FORMADD_MEMORY = define(1)
    val CURL_FORMADD_OPTION_TWICE = define(2)
    val CURL_FORMADD_NULL = define(3)
    val CURL_FORMADD_UNKNOWN_OPTION = define(4)
    val CURL_FORMADD_INCOMPLETE = define(5)
    val CURL_FORMADD_ILLEGAL_ARRAY = define(6)
    val CURL_FORMADD_DISABLED = define(7)
    val CURL_FORMADD_LAST = define(8)
    inline def getName(inline value: CURLFORMcode): Option[String] =
      inline value match
        case CURL_FORMADD_OK             => Some("CURL_FORMADD_OK")
        case CURL_FORMADD_MEMORY         => Some("CURL_FORMADD_MEMORY")
        case CURL_FORMADD_OPTION_TWICE   => Some("CURL_FORMADD_OPTION_TWICE")
        case CURL_FORMADD_NULL           => Some("CURL_FORMADD_NULL")
        case CURL_FORMADD_UNKNOWN_OPTION => Some("CURL_FORMADD_UNKNOWN_OPTION")
        case CURL_FORMADD_INCOMPLETE     => Some("CURL_FORMADD_INCOMPLETE")
        case CURL_FORMADD_ILLEGAL_ARRAY  => Some("CURL_FORMADD_ILLEGAL_ARRAY")
        case CURL_FORMADD_DISABLED       => Some("CURL_FORMADD_DISABLED")
        case CURL_FORMADD_LAST           => Some("CURL_FORMADD_LAST")
        case _                           => None
    extension (a: CURLFORMcode)
      inline def &(b: CURLFORMcode): CURLFORMcode = a & b
      inline def |(b: CURLFORMcode): CURLFORMcode = a | b
      inline def is(b: CURLFORMcode): Boolean = (a & b) == b
  end CURLFORMcode

  opaque type CURLHcode = CUnsignedInt
  object CURLHcode extends CEnumU[CURLHcode]:
    given _tag: Tag[CURLHcode] = Tag.UInt
    inline def define(inline a: Long): CURLHcode = a.toUInt
    val CURLHE_OK = define(0)
    val CURLHE_BADINDEX = define(1)
    val CURLHE_MISSING = define(2)
    val CURLHE_NOHEADERS = define(3)
    val CURLHE_NOREQUEST = define(4)
    val CURLHE_OUT_OF_MEMORY = define(5)
    val CURLHE_BAD_ARGUMENT = define(6)
    val CURLHE_NOT_BUILT_IN = define(7)
    inline def getName(inline value: CURLHcode): Option[String] =
      inline value match
        case CURLHE_OK            => Some("CURLHE_OK")
        case CURLHE_BADINDEX      => Some("CURLHE_BADINDEX")
        case CURLHE_MISSING       => Some("CURLHE_MISSING")
        case CURLHE_NOHEADERS     => Some("CURLHE_NOHEADERS")
        case CURLHE_NOREQUEST     => Some("CURLHE_NOREQUEST")
        case CURLHE_OUT_OF_MEMORY => Some("CURLHE_OUT_OF_MEMORY")
        case CURLHE_BAD_ARGUMENT  => Some("CURLHE_BAD_ARGUMENT")
        case CURLHE_NOT_BUILT_IN  => Some("CURLHE_NOT_BUILT_IN")
        case _                    => None
    extension (a: CURLHcode)
      inline def &(b: CURLHcode): CURLHcode = a & b
      inline def |(b: CURLHcode): CURLHcode = a | b
      inline def is(b: CURLHcode): Boolean = (a & b) == b
  end CURLHcode

  opaque type CURLINFO = CUnsignedInt
  object CURLINFO extends CEnumU[CURLINFO]:
    given _tag: Tag[CURLINFO] = Tag.UInt
    inline def define(inline a: Long): CURLINFO = a.toUInt
    val CURLINFO_NONE = define(0)
    val CURLINFO_EFFECTIVE_URL = define(1048577)
    val CURLINFO_RESPONSE_CODE = define(2097154)
    val CURLINFO_TOTAL_TIME = define(3145731)
    val CURLINFO_NAMELOOKUP_TIME = define(3145732)
    val CURLINFO_CONNECT_TIME = define(3145733)
    val CURLINFO_PRETRANSFER_TIME = define(3145734)
    val CURLINFO_SIZE_UPLOAD = define(3145735)
    val CURLINFO_SIZE_UPLOAD_T = define(6291463)
    val CURLINFO_SIZE_DOWNLOAD = define(3145736)
    val CURLINFO_SIZE_DOWNLOAD_T = define(6291464)
    val CURLINFO_SPEED_DOWNLOAD = define(3145737)
    val CURLINFO_SPEED_DOWNLOAD_T = define(6291465)
    val CURLINFO_SPEED_UPLOAD = define(3145738)
    val CURLINFO_SPEED_UPLOAD_T = define(6291466)
    val CURLINFO_HEADER_SIZE = define(2097163)
    val CURLINFO_REQUEST_SIZE = define(2097164)
    val CURLINFO_SSL_VERIFYRESULT = define(2097165)
    val CURLINFO_FILETIME = define(2097166)
    val CURLINFO_FILETIME_T = define(6291470)
    val CURLINFO_CONTENT_LENGTH_DOWNLOAD = define(3145743)
    val CURLINFO_CONTENT_LENGTH_DOWNLOAD_T = define(6291471)
    val CURLINFO_CONTENT_LENGTH_UPLOAD = define(3145744)
    val CURLINFO_CONTENT_LENGTH_UPLOAD_T = define(6291472)
    val CURLINFO_STARTTRANSFER_TIME = define(3145745)
    val CURLINFO_CONTENT_TYPE = define(1048594)
    val CURLINFO_REDIRECT_TIME = define(3145747)
    val CURLINFO_REDIRECT_COUNT = define(2097172)
    val CURLINFO_PRIVATE = define(1048597)
    val CURLINFO_HTTP_CONNECTCODE = define(2097174)
    val CURLINFO_HTTPAUTH_AVAIL = define(2097175)
    val CURLINFO_PROXYAUTH_AVAIL = define(2097176)
    val CURLINFO_OS_ERRNO = define(2097177)
    val CURLINFO_NUM_CONNECTS = define(2097178)
    val CURLINFO_SSL_ENGINES = define(4194331)
    val CURLINFO_COOKIELIST = define(4194332)
    val CURLINFO_LASTSOCKET = define(2097181)
    val CURLINFO_FTP_ENTRY_PATH = define(1048606)
    val CURLINFO_REDIRECT_URL = define(1048607)
    val CURLINFO_PRIMARY_IP = define(1048608)
    val CURLINFO_APPCONNECT_TIME = define(3145761)
    val CURLINFO_CERTINFO = define(4194338)
    val CURLINFO_CONDITION_UNMET = define(2097187)
    val CURLINFO_RTSP_SESSION_ID = define(1048612)
    val CURLINFO_RTSP_CLIENT_CSEQ = define(2097189)
    val CURLINFO_RTSP_SERVER_CSEQ = define(2097190)
    val CURLINFO_RTSP_CSEQ_RECV = define(2097191)
    val CURLINFO_PRIMARY_PORT = define(2097192)
    val CURLINFO_LOCAL_IP = define(1048617)
    val CURLINFO_LOCAL_PORT = define(2097194)
    val CURLINFO_TLS_SESSION = define(4194347)
    val CURLINFO_ACTIVESOCKET = define(5242924)
    val CURLINFO_TLS_SSL_PTR = define(4194349)
    val CURLINFO_HTTP_VERSION = define(2097198)
    val CURLINFO_PROXY_SSL_VERIFYRESULT = define(2097199)
    val CURLINFO_PROTOCOL = define(2097200)
    val CURLINFO_SCHEME = define(1048625)
    val CURLINFO_TOTAL_TIME_T = define(6291506)
    val CURLINFO_NAMELOOKUP_TIME_T = define(6291507)
    val CURLINFO_CONNECT_TIME_T = define(6291508)
    val CURLINFO_PRETRANSFER_TIME_T = define(6291509)
    val CURLINFO_STARTTRANSFER_TIME_T = define(6291510)
    val CURLINFO_REDIRECT_TIME_T = define(6291511)
    val CURLINFO_APPCONNECT_TIME_T = define(6291512)
    val CURLINFO_RETRY_AFTER = define(6291513)
    val CURLINFO_EFFECTIVE_METHOD = define(1048634)
    val CURLINFO_PROXY_ERROR = define(2097211)
    val CURLINFO_REFERER = define(1048636)
    val CURLINFO_CAINFO = define(1048637)
    val CURLINFO_CAPATH = define(1048638)
    val CURLINFO_XFER_ID = define(6291519)
    val CURLINFO_CONN_ID = define(6291520)
    val CURLINFO_LASTONE = define(64)
    inline def getName(inline value: CURLINFO): Option[String] =
      inline value match
        case CURLINFO_NONE             => Some("CURLINFO_NONE")
        case CURLINFO_EFFECTIVE_URL    => Some("CURLINFO_EFFECTIVE_URL")
        case CURLINFO_RESPONSE_CODE    => Some("CURLINFO_RESPONSE_CODE")
        case CURLINFO_TOTAL_TIME       => Some("CURLINFO_TOTAL_TIME")
        case CURLINFO_NAMELOOKUP_TIME  => Some("CURLINFO_NAMELOOKUP_TIME")
        case CURLINFO_CONNECT_TIME     => Some("CURLINFO_CONNECT_TIME")
        case CURLINFO_PRETRANSFER_TIME => Some("CURLINFO_PRETRANSFER_TIME")
        case CURLINFO_SIZE_UPLOAD      => Some("CURLINFO_SIZE_UPLOAD")
        case CURLINFO_SIZE_UPLOAD_T    => Some("CURLINFO_SIZE_UPLOAD_T")
        case CURLINFO_SIZE_DOWNLOAD    => Some("CURLINFO_SIZE_DOWNLOAD")
        case CURLINFO_SIZE_DOWNLOAD_T  => Some("CURLINFO_SIZE_DOWNLOAD_T")
        case CURLINFO_SPEED_DOWNLOAD   => Some("CURLINFO_SPEED_DOWNLOAD")
        case CURLINFO_SPEED_DOWNLOAD_T => Some("CURLINFO_SPEED_DOWNLOAD_T")
        case CURLINFO_SPEED_UPLOAD     => Some("CURLINFO_SPEED_UPLOAD")
        case CURLINFO_SPEED_UPLOAD_T   => Some("CURLINFO_SPEED_UPLOAD_T")
        case CURLINFO_HEADER_SIZE      => Some("CURLINFO_HEADER_SIZE")
        case CURLINFO_REQUEST_SIZE     => Some("CURLINFO_REQUEST_SIZE")
        case CURLINFO_SSL_VERIFYRESULT => Some("CURLINFO_SSL_VERIFYRESULT")
        case CURLINFO_FILETIME         => Some("CURLINFO_FILETIME")
        case CURLINFO_FILETIME_T       => Some("CURLINFO_FILETIME_T")
        case CURLINFO_CONTENT_LENGTH_DOWNLOAD =>
          Some("CURLINFO_CONTENT_LENGTH_DOWNLOAD")
        case CURLINFO_CONTENT_LENGTH_DOWNLOAD_T =>
          Some("CURLINFO_CONTENT_LENGTH_DOWNLOAD_T")
        case CURLINFO_CONTENT_LENGTH_UPLOAD =>
          Some("CURLINFO_CONTENT_LENGTH_UPLOAD")
        case CURLINFO_CONTENT_LENGTH_UPLOAD_T =>
          Some("CURLINFO_CONTENT_LENGTH_UPLOAD_T")
        case CURLINFO_STARTTRANSFER_TIME => Some("CURLINFO_STARTTRANSFER_TIME")
        case CURLINFO_CONTENT_TYPE       => Some("CURLINFO_CONTENT_TYPE")
        case CURLINFO_REDIRECT_TIME      => Some("CURLINFO_REDIRECT_TIME")
        case CURLINFO_REDIRECT_COUNT     => Some("CURLINFO_REDIRECT_COUNT")
        case CURLINFO_PRIVATE            => Some("CURLINFO_PRIVATE")
        case CURLINFO_HTTP_CONNECTCODE   => Some("CURLINFO_HTTP_CONNECTCODE")
        case CURLINFO_HTTPAUTH_AVAIL     => Some("CURLINFO_HTTPAUTH_AVAIL")
        case CURLINFO_PROXYAUTH_AVAIL    => Some("CURLINFO_PROXYAUTH_AVAIL")
        case CURLINFO_OS_ERRNO           => Some("CURLINFO_OS_ERRNO")
        case CURLINFO_NUM_CONNECTS       => Some("CURLINFO_NUM_CONNECTS")
        case CURLINFO_SSL_ENGINES        => Some("CURLINFO_SSL_ENGINES")
        case CURLINFO_COOKIELIST         => Some("CURLINFO_COOKIELIST")
        case CURLINFO_LASTSOCKET         => Some("CURLINFO_LASTSOCKET")
        case CURLINFO_FTP_ENTRY_PATH     => Some("CURLINFO_FTP_ENTRY_PATH")
        case CURLINFO_REDIRECT_URL       => Some("CURLINFO_REDIRECT_URL")
        case CURLINFO_PRIMARY_IP         => Some("CURLINFO_PRIMARY_IP")
        case CURLINFO_APPCONNECT_TIME    => Some("CURLINFO_APPCONNECT_TIME")
        case CURLINFO_CERTINFO           => Some("CURLINFO_CERTINFO")
        case CURLINFO_CONDITION_UNMET    => Some("CURLINFO_CONDITION_UNMET")
        case CURLINFO_RTSP_SESSION_ID    => Some("CURLINFO_RTSP_SESSION_ID")
        case CURLINFO_RTSP_CLIENT_CSEQ   => Some("CURLINFO_RTSP_CLIENT_CSEQ")
        case CURLINFO_RTSP_SERVER_CSEQ   => Some("CURLINFO_RTSP_SERVER_CSEQ")
        case CURLINFO_RTSP_CSEQ_RECV     => Some("CURLINFO_RTSP_CSEQ_RECV")
        case CURLINFO_PRIMARY_PORT       => Some("CURLINFO_PRIMARY_PORT")
        case CURLINFO_LOCAL_IP           => Some("CURLINFO_LOCAL_IP")
        case CURLINFO_LOCAL_PORT         => Some("CURLINFO_LOCAL_PORT")
        case CURLINFO_TLS_SESSION        => Some("CURLINFO_TLS_SESSION")
        case CURLINFO_ACTIVESOCKET       => Some("CURLINFO_ACTIVESOCKET")
        case CURLINFO_TLS_SSL_PTR        => Some("CURLINFO_TLS_SSL_PTR")
        case CURLINFO_HTTP_VERSION       => Some("CURLINFO_HTTP_VERSION")
        case CURLINFO_PROXY_SSL_VERIFYRESULT =>
          Some("CURLINFO_PROXY_SSL_VERIFYRESULT")
        case CURLINFO_PROTOCOL           => Some("CURLINFO_PROTOCOL")
        case CURLINFO_SCHEME             => Some("CURLINFO_SCHEME")
        case CURLINFO_TOTAL_TIME_T       => Some("CURLINFO_TOTAL_TIME_T")
        case CURLINFO_NAMELOOKUP_TIME_T  => Some("CURLINFO_NAMELOOKUP_TIME_T")
        case CURLINFO_CONNECT_TIME_T     => Some("CURLINFO_CONNECT_TIME_T")
        case CURLINFO_PRETRANSFER_TIME_T => Some("CURLINFO_PRETRANSFER_TIME_T")
        case CURLINFO_STARTTRANSFER_TIME_T =>
          Some("CURLINFO_STARTTRANSFER_TIME_T")
        case CURLINFO_REDIRECT_TIME_T   => Some("CURLINFO_REDIRECT_TIME_T")
        case CURLINFO_APPCONNECT_TIME_T => Some("CURLINFO_APPCONNECT_TIME_T")
        case CURLINFO_RETRY_AFTER       => Some("CURLINFO_RETRY_AFTER")
        case CURLINFO_EFFECTIVE_METHOD  => Some("CURLINFO_EFFECTIVE_METHOD")
        case CURLINFO_PROXY_ERROR       => Some("CURLINFO_PROXY_ERROR")
        case CURLINFO_REFERER           => Some("CURLINFO_REFERER")
        case CURLINFO_CAINFO            => Some("CURLINFO_CAINFO")
        case CURLINFO_CAPATH            => Some("CURLINFO_CAPATH")
        case CURLINFO_XFER_ID           => Some("CURLINFO_XFER_ID")
        case CURLINFO_CONN_ID           => Some("CURLINFO_CONN_ID")
        case CURLINFO_LASTONE           => Some("CURLINFO_LASTONE")
        case _                          => None
    extension (a: CURLINFO)
      inline def &(b: CURLINFO): CURLINFO = a & b
      inline def |(b: CURLINFO): CURLINFO = a | b
      inline def is(b: CURLINFO): Boolean = (a & b) == b
  end CURLINFO

  opaque type CURLMSG = CUnsignedInt
  object CURLMSG extends CEnumU[CURLMSG]:
    given _tag: Tag[CURLMSG] = Tag.UInt
    inline def define(inline a: Long): CURLMSG = a.toUInt
    val CURLMSG_NONE = define(0)
    val CURLMSG_DONE = define(1)
    val CURLMSG_LAST = define(2)
    inline def getName(inline value: CURLMSG): Option[String] =
      inline value match
        case CURLMSG_NONE => Some("CURLMSG_NONE")
        case CURLMSG_DONE => Some("CURLMSG_DONE")
        case CURLMSG_LAST => Some("CURLMSG_LAST")
        case _            => None
    extension (a: CURLMSG)
      inline def &(b: CURLMSG): CURLMSG = a & b
      inline def |(b: CURLMSG): CURLMSG = a | b
      inline def is(b: CURLMSG): Boolean = (a & b) == b
  end CURLMSG

  opaque type CURLMcode = CInt
  object CURLMcode extends CEnum[CURLMcode]:
    given _tag: Tag[CURLMcode] = Tag.Int
    inline def define(inline a: CInt): CURLMcode = a
    val CURLM_CALL_MULTI_PERFORM = define(-1)
    val CURLM_OK = define(0)
    val CURLM_BAD_HANDLE = define(1)
    val CURLM_BAD_EASY_HANDLE = define(2)
    val CURLM_OUT_OF_MEMORY = define(3)
    val CURLM_INTERNAL_ERROR = define(4)
    val CURLM_BAD_SOCKET = define(5)
    val CURLM_UNKNOWN_OPTION = define(6)
    val CURLM_ADDED_ALREADY = define(7)
    val CURLM_RECURSIVE_API_CALL = define(8)
    val CURLM_WAKEUP_FAILURE = define(9)
    val CURLM_BAD_FUNCTION_ARGUMENT = define(10)
    val CURLM_ABORTED_BY_CALLBACK = define(11)
    val CURLM_UNRECOVERABLE_POLL = define(12)
    val CURLM_LAST = define(13)
    inline def getName(inline value: CURLMcode): Option[String] =
      inline value match
        case CURLM_CALL_MULTI_PERFORM    => Some("CURLM_CALL_MULTI_PERFORM")
        case CURLM_OK                    => Some("CURLM_OK")
        case CURLM_BAD_HANDLE            => Some("CURLM_BAD_HANDLE")
        case CURLM_BAD_EASY_HANDLE       => Some("CURLM_BAD_EASY_HANDLE")
        case CURLM_OUT_OF_MEMORY         => Some("CURLM_OUT_OF_MEMORY")
        case CURLM_INTERNAL_ERROR        => Some("CURLM_INTERNAL_ERROR")
        case CURLM_BAD_SOCKET            => Some("CURLM_BAD_SOCKET")
        case CURLM_UNKNOWN_OPTION        => Some("CURLM_UNKNOWN_OPTION")
        case CURLM_ADDED_ALREADY         => Some("CURLM_ADDED_ALREADY")
        case CURLM_RECURSIVE_API_CALL    => Some("CURLM_RECURSIVE_API_CALL")
        case CURLM_WAKEUP_FAILURE        => Some("CURLM_WAKEUP_FAILURE")
        case CURLM_BAD_FUNCTION_ARGUMENT => Some("CURLM_BAD_FUNCTION_ARGUMENT")
        case CURLM_ABORTED_BY_CALLBACK   => Some("CURLM_ABORTED_BY_CALLBACK")
        case CURLM_UNRECOVERABLE_POLL    => Some("CURLM_UNRECOVERABLE_POLL")
        case CURLM_LAST                  => Some("CURLM_LAST")
        case _                           => None
    extension (a: CURLMcode)
      inline def &(b: CURLMcode): CURLMcode = a & b
      inline def |(b: CURLMcode): CURLMcode = a | b
      inline def is(b: CURLMcode): Boolean = (a & b) == b
  end CURLMcode

  opaque type CURLMoption = CUnsignedInt
  object CURLMoption extends CEnumU[CURLMoption]:
    given _tag: Tag[CURLMoption] = Tag.UInt
    inline def define(inline a: Long): CURLMoption = a.toUInt
    val CURLMOPT_SOCKETFUNCTION = define(20001)
    val CURLMOPT_SOCKETDATA = define(10002)
    val CURLMOPT_PIPELINING = define(3)
    val CURLMOPT_TIMERFUNCTION = define(20004)
    val CURLMOPT_TIMERDATA = define(10005)
    val CURLMOPT_MAXCONNECTS = define(6)
    val CURLMOPT_MAX_HOST_CONNECTIONS = define(7)
    val CURLMOPT_MAX_PIPELINE_LENGTH = define(8)
    val CURLMOPT_CONTENT_LENGTH_PENALTY_SIZE = define(30009)
    val CURLMOPT_CHUNK_LENGTH_PENALTY_SIZE = define(30010)
    val CURLMOPT_PIPELINING_SITE_BL = define(10011)
    val CURLMOPT_PIPELINING_SERVER_BL = define(10012)
    val CURLMOPT_MAX_TOTAL_CONNECTIONS = define(13)
    val CURLMOPT_PUSHFUNCTION = define(20014)
    val CURLMOPT_PUSHDATA = define(10015)
    val CURLMOPT_MAX_CONCURRENT_STREAMS = define(16)
    val CURLMOPT_LASTENTRY = define(17)
    inline def getName(inline value: CURLMoption): Option[String] =
      inline value match
        case CURLMOPT_SOCKETFUNCTION => Some("CURLMOPT_SOCKETFUNCTION")
        case CURLMOPT_SOCKETDATA     => Some("CURLMOPT_SOCKETDATA")
        case CURLMOPT_PIPELINING     => Some("CURLMOPT_PIPELINING")
        case CURLMOPT_TIMERFUNCTION  => Some("CURLMOPT_TIMERFUNCTION")
        case CURLMOPT_TIMERDATA      => Some("CURLMOPT_TIMERDATA")
        case CURLMOPT_MAXCONNECTS    => Some("CURLMOPT_MAXCONNECTS")
        case CURLMOPT_MAX_HOST_CONNECTIONS =>
          Some("CURLMOPT_MAX_HOST_CONNECTIONS")
        case CURLMOPT_MAX_PIPELINE_LENGTH =>
          Some("CURLMOPT_MAX_PIPELINE_LENGTH")
        case CURLMOPT_CONTENT_LENGTH_PENALTY_SIZE =>
          Some("CURLMOPT_CONTENT_LENGTH_PENALTY_SIZE")
        case CURLMOPT_CHUNK_LENGTH_PENALTY_SIZE =>
          Some("CURLMOPT_CHUNK_LENGTH_PENALTY_SIZE")
        case CURLMOPT_PIPELINING_SITE_BL => Some("CURLMOPT_PIPELINING_SITE_BL")
        case CURLMOPT_PIPELINING_SERVER_BL =>
          Some("CURLMOPT_PIPELINING_SERVER_BL")
        case CURLMOPT_MAX_TOTAL_CONNECTIONS =>
          Some("CURLMOPT_MAX_TOTAL_CONNECTIONS")
        case CURLMOPT_PUSHFUNCTION => Some("CURLMOPT_PUSHFUNCTION")
        case CURLMOPT_PUSHDATA     => Some("CURLMOPT_PUSHDATA")
        case CURLMOPT_MAX_CONCURRENT_STREAMS =>
          Some("CURLMOPT_MAX_CONCURRENT_STREAMS")
        case CURLMOPT_LASTENTRY => Some("CURLMOPT_LASTENTRY")
        case _                  => None
    extension (a: CURLMoption)
      inline def &(b: CURLMoption): CURLMoption = a & b
      inline def |(b: CURLMoption): CURLMoption = a | b
      inline def is(b: CURLMoption): Boolean = (a & b) == b
  end CURLMoption

  opaque type CURLSHcode = CUnsignedInt
  object CURLSHcode extends CEnumU[CURLSHcode]:
    given _tag: Tag[CURLSHcode] = Tag.UInt
    inline def define(inline a: Long): CURLSHcode = a.toUInt
    val CURLSHE_OK = define(0)
    val CURLSHE_BAD_OPTION = define(1)
    val CURLSHE_IN_USE = define(2)
    val CURLSHE_INVALID = define(3)
    val CURLSHE_NOMEM = define(4)
    val CURLSHE_NOT_BUILT_IN = define(5)
    val CURLSHE_LAST = define(6)
    inline def getName(inline value: CURLSHcode): Option[String] =
      inline value match
        case CURLSHE_OK           => Some("CURLSHE_OK")
        case CURLSHE_BAD_OPTION   => Some("CURLSHE_BAD_OPTION")
        case CURLSHE_IN_USE       => Some("CURLSHE_IN_USE")
        case CURLSHE_INVALID      => Some("CURLSHE_INVALID")
        case CURLSHE_NOMEM        => Some("CURLSHE_NOMEM")
        case CURLSHE_NOT_BUILT_IN => Some("CURLSHE_NOT_BUILT_IN")
        case CURLSHE_LAST         => Some("CURLSHE_LAST")
        case _                    => None
    extension (a: CURLSHcode)
      inline def &(b: CURLSHcode): CURLSHcode = a & b
      inline def |(b: CURLSHcode): CURLSHcode = a | b
      inline def is(b: CURLSHcode): Boolean = (a & b) == b
  end CURLSHcode

  opaque type CURLSHoption = CUnsignedInt
  object CURLSHoption extends CEnumU[CURLSHoption]:
    given _tag: Tag[CURLSHoption] = Tag.UInt
    inline def define(inline a: Long): CURLSHoption = a.toUInt
    val CURLSHOPT_NONE = define(0)
    val CURLSHOPT_SHARE = define(1)
    val CURLSHOPT_UNSHARE = define(2)
    val CURLSHOPT_LOCKFUNC = define(3)
    val CURLSHOPT_UNLOCKFUNC = define(4)
    val CURLSHOPT_USERDATA = define(5)
    val CURLSHOPT_LAST = define(6)
    inline def getName(inline value: CURLSHoption): Option[String] =
      inline value match
        case CURLSHOPT_NONE       => Some("CURLSHOPT_NONE")
        case CURLSHOPT_SHARE      => Some("CURLSHOPT_SHARE")
        case CURLSHOPT_UNSHARE    => Some("CURLSHOPT_UNSHARE")
        case CURLSHOPT_LOCKFUNC   => Some("CURLSHOPT_LOCKFUNC")
        case CURLSHOPT_UNLOCKFUNC => Some("CURLSHOPT_UNLOCKFUNC")
        case CURLSHOPT_USERDATA   => Some("CURLSHOPT_USERDATA")
        case CURLSHOPT_LAST       => Some("CURLSHOPT_LAST")
        case _                    => None
    extension (a: CURLSHoption)
      inline def &(b: CURLSHoption): CURLSHoption = a & b
      inline def |(b: CURLSHoption): CURLSHoption = a | b
      inline def is(b: CURLSHoption): Boolean = (a & b) == b
  end CURLSHoption

  opaque type CURLSTScode = CUnsignedInt
  object CURLSTScode extends CEnumU[CURLSTScode]:
    given _tag: Tag[CURLSTScode] = Tag.UInt
    inline def define(inline a: Long): CURLSTScode = a.toUInt
    val CURLSTS_OK = define(0)
    val CURLSTS_DONE = define(1)
    val CURLSTS_FAIL = define(2)
    inline def getName(inline value: CURLSTScode): Option[String] =
      inline value match
        case CURLSTS_OK   => Some("CURLSTS_OK")
        case CURLSTS_DONE => Some("CURLSTS_DONE")
        case CURLSTS_FAIL => Some("CURLSTS_FAIL")
        case _            => None
    extension (a: CURLSTScode)
      inline def &(b: CURLSTScode): CURLSTScode = a & b
      inline def |(b: CURLSTScode): CURLSTScode = a | b
      inline def is(b: CURLSTScode): Boolean = (a & b) == b
  end CURLSTScode

  opaque type CURLUPart = CUnsignedInt
  object CURLUPart extends CEnumU[CURLUPart]:
    given _tag: Tag[CURLUPart] = Tag.UInt
    inline def define(inline a: Long): CURLUPart = a.toUInt
    val CURLUPART_URL = define(0)
    val CURLUPART_SCHEME = define(1)
    val CURLUPART_USER = define(2)
    val CURLUPART_PASSWORD = define(3)
    val CURLUPART_OPTIONS = define(4)
    val CURLUPART_HOST = define(5)
    val CURLUPART_PORT = define(6)
    val CURLUPART_PATH = define(7)
    val CURLUPART_QUERY = define(8)
    val CURLUPART_FRAGMENT = define(9)
    val CURLUPART_ZONEID = define(10)
    inline def getName(inline value: CURLUPart): Option[String] =
      inline value match
        case CURLUPART_URL      => Some("CURLUPART_URL")
        case CURLUPART_SCHEME   => Some("CURLUPART_SCHEME")
        case CURLUPART_USER     => Some("CURLUPART_USER")
        case CURLUPART_PASSWORD => Some("CURLUPART_PASSWORD")
        case CURLUPART_OPTIONS  => Some("CURLUPART_OPTIONS")
        case CURLUPART_HOST     => Some("CURLUPART_HOST")
        case CURLUPART_PORT     => Some("CURLUPART_PORT")
        case CURLUPART_PATH     => Some("CURLUPART_PATH")
        case CURLUPART_QUERY    => Some("CURLUPART_QUERY")
        case CURLUPART_FRAGMENT => Some("CURLUPART_FRAGMENT")
        case CURLUPART_ZONEID   => Some("CURLUPART_ZONEID")
        case _                  => None
    extension (a: CURLUPart)
      inline def &(b: CURLUPart): CURLUPart = a & b
      inline def |(b: CURLUPart): CURLUPart = a | b
      inline def is(b: CURLUPart): Boolean = (a & b) == b
  end CURLUPart

  opaque type CURLUcode = CUnsignedInt
  object CURLUcode extends CEnumU[CURLUcode]:
    given _tag: Tag[CURLUcode] = Tag.UInt
    inline def define(inline a: Long): CURLUcode = a.toUInt
    val CURLUE_OK = define(0)
    val CURLUE_BAD_HANDLE = define(1)
    val CURLUE_BAD_PARTPOINTER = define(2)
    val CURLUE_MALFORMED_INPUT = define(3)
    val CURLUE_BAD_PORT_NUMBER = define(4)
    val CURLUE_UNSUPPORTED_SCHEME = define(5)
    val CURLUE_URLDECODE = define(6)
    val CURLUE_OUT_OF_MEMORY = define(7)
    val CURLUE_USER_NOT_ALLOWED = define(8)
    val CURLUE_UNKNOWN_PART = define(9)
    val CURLUE_NO_SCHEME = define(10)
    val CURLUE_NO_USER = define(11)
    val CURLUE_NO_PASSWORD = define(12)
    val CURLUE_NO_OPTIONS = define(13)
    val CURLUE_NO_HOST = define(14)
    val CURLUE_NO_PORT = define(15)
    val CURLUE_NO_QUERY = define(16)
    val CURLUE_NO_FRAGMENT = define(17)
    val CURLUE_NO_ZONEID = define(18)
    val CURLUE_BAD_FILE_URL = define(19)
    val CURLUE_BAD_FRAGMENT = define(20)
    val CURLUE_BAD_HOSTNAME = define(21)
    val CURLUE_BAD_IPV6 = define(22)
    val CURLUE_BAD_LOGIN = define(23)
    val CURLUE_BAD_PASSWORD = define(24)
    val CURLUE_BAD_PATH = define(25)
    val CURLUE_BAD_QUERY = define(26)
    val CURLUE_BAD_SCHEME = define(27)
    val CURLUE_BAD_SLASHES = define(28)
    val CURLUE_BAD_USER = define(29)
    val CURLUE_LACKS_IDN = define(30)
    val CURLUE_LAST = define(31)
    inline def getName(inline value: CURLUcode): Option[String] =
      inline value match
        case CURLUE_OK                 => Some("CURLUE_OK")
        case CURLUE_BAD_HANDLE         => Some("CURLUE_BAD_HANDLE")
        case CURLUE_BAD_PARTPOINTER    => Some("CURLUE_BAD_PARTPOINTER")
        case CURLUE_MALFORMED_INPUT    => Some("CURLUE_MALFORMED_INPUT")
        case CURLUE_BAD_PORT_NUMBER    => Some("CURLUE_BAD_PORT_NUMBER")
        case CURLUE_UNSUPPORTED_SCHEME => Some("CURLUE_UNSUPPORTED_SCHEME")
        case CURLUE_URLDECODE          => Some("CURLUE_URLDECODE")
        case CURLUE_OUT_OF_MEMORY      => Some("CURLUE_OUT_OF_MEMORY")
        case CURLUE_USER_NOT_ALLOWED   => Some("CURLUE_USER_NOT_ALLOWED")
        case CURLUE_UNKNOWN_PART       => Some("CURLUE_UNKNOWN_PART")
        case CURLUE_NO_SCHEME          => Some("CURLUE_NO_SCHEME")
        case CURLUE_NO_USER            => Some("CURLUE_NO_USER")
        case CURLUE_NO_PASSWORD        => Some("CURLUE_NO_PASSWORD")
        case CURLUE_NO_OPTIONS         => Some("CURLUE_NO_OPTIONS")
        case CURLUE_NO_HOST            => Some("CURLUE_NO_HOST")
        case CURLUE_NO_PORT            => Some("CURLUE_NO_PORT")
        case CURLUE_NO_QUERY           => Some("CURLUE_NO_QUERY")
        case CURLUE_NO_FRAGMENT        => Some("CURLUE_NO_FRAGMENT")
        case CURLUE_NO_ZONEID          => Some("CURLUE_NO_ZONEID")
        case CURLUE_BAD_FILE_URL       => Some("CURLUE_BAD_FILE_URL")
        case CURLUE_BAD_FRAGMENT       => Some("CURLUE_BAD_FRAGMENT")
        case CURLUE_BAD_HOSTNAME       => Some("CURLUE_BAD_HOSTNAME")
        case CURLUE_BAD_IPV6           => Some("CURLUE_BAD_IPV6")
        case CURLUE_BAD_LOGIN          => Some("CURLUE_BAD_LOGIN")
        case CURLUE_BAD_PASSWORD       => Some("CURLUE_BAD_PASSWORD")
        case CURLUE_BAD_PATH           => Some("CURLUE_BAD_PATH")
        case CURLUE_BAD_QUERY          => Some("CURLUE_BAD_QUERY")
        case CURLUE_BAD_SCHEME         => Some("CURLUE_BAD_SCHEME")
        case CURLUE_BAD_SLASHES        => Some("CURLUE_BAD_SLASHES")
        case CURLUE_BAD_USER           => Some("CURLUE_BAD_USER")
        case CURLUE_LACKS_IDN          => Some("CURLUE_LACKS_IDN")
        case CURLUE_LAST               => Some("CURLUE_LAST")
        case _                         => None
    extension (a: CURLUcode)
      inline def &(b: CURLUcode): CURLUcode = a & b
      inline def |(b: CURLUcode): CURLUcode = a | b
      inline def is(b: CURLUcode): Boolean = (a & b) == b
  end CURLUcode

  opaque type CURL_NETRC_OPTION = CUnsignedInt
  object CURL_NETRC_OPTION extends CEnumU[CURL_NETRC_OPTION]:
    given _tag: Tag[CURL_NETRC_OPTION] = Tag.UInt
    inline def define(inline a: Long): CURL_NETRC_OPTION = a.toUInt
    val CURL_NETRC_IGNORED = define(0)
    val CURL_NETRC_OPTIONAL = define(1)
    val CURL_NETRC_REQUIRED = define(2)
    val CURL_NETRC_LAST = define(3)
    inline def getName(inline value: CURL_NETRC_OPTION): Option[String] =
      inline value match
        case CURL_NETRC_IGNORED  => Some("CURL_NETRC_IGNORED")
        case CURL_NETRC_OPTIONAL => Some("CURL_NETRC_OPTIONAL")
        case CURL_NETRC_REQUIRED => Some("CURL_NETRC_REQUIRED")
        case CURL_NETRC_LAST     => Some("CURL_NETRC_LAST")
        case _                   => None
    extension (a: CURL_NETRC_OPTION)
      inline def &(b: CURL_NETRC_OPTION): CURL_NETRC_OPTION = a & b
      inline def |(b: CURL_NETRC_OPTION): CURL_NETRC_OPTION = a | b
      inline def is(b: CURL_NETRC_OPTION): Boolean = (a & b) == b
  end CURL_NETRC_OPTION

  opaque type CURL_TLSAUTH = CUnsignedInt
  object CURL_TLSAUTH extends CEnumU[CURL_TLSAUTH]:
    given _tag: Tag[CURL_TLSAUTH] = Tag.UInt
    inline def define(inline a: Long): CURL_TLSAUTH = a.toUInt
    val CURL_TLSAUTH_NONE = define(0)
    val CURL_TLSAUTH_SRP = define(1)
    val CURL_TLSAUTH_LAST = define(2)
    inline def getName(inline value: CURL_TLSAUTH): Option[String] =
      inline value match
        case CURL_TLSAUTH_NONE => Some("CURL_TLSAUTH_NONE")
        case CURL_TLSAUTH_SRP  => Some("CURL_TLSAUTH_SRP")
        case CURL_TLSAUTH_LAST => Some("CURL_TLSAUTH_LAST")
        case _                 => None
    extension (a: CURL_TLSAUTH)
      inline def &(b: CURL_TLSAUTH): CURL_TLSAUTH = a & b
      inline def |(b: CURL_TLSAUTH): CURL_TLSAUTH = a | b
      inline def is(b: CURL_TLSAUTH): Boolean = (a & b) == b
  end CURL_TLSAUTH

  opaque type CURLcode = CUnsignedInt
  object CURLcode extends CEnumU[CURLcode]:
    given _tag: Tag[CURLcode] = Tag.UInt
    inline def define(inline a: Long): CURLcode = a.toUInt
    val CURLE_OK = define(0)
    val CURLE_UNSUPPORTED_PROTOCOL = define(1)
    val CURLE_FAILED_INIT = define(2)
    val CURLE_URL_MALFORMAT = define(3)
    val CURLE_NOT_BUILT_IN = define(4)
    val CURLE_COULDNT_RESOLVE_PROXY = define(5)
    val CURLE_COULDNT_RESOLVE_HOST = define(6)
    val CURLE_COULDNT_CONNECT = define(7)
    val CURLE_WEIRD_SERVER_REPLY = define(8)
    val CURLE_REMOTE_ACCESS_DENIED = define(9)
    val CURLE_FTP_ACCEPT_FAILED = define(10)
    val CURLE_FTP_WEIRD_PASS_REPLY = define(11)
    val CURLE_FTP_ACCEPT_TIMEOUT = define(12)
    val CURLE_FTP_WEIRD_PASV_REPLY = define(13)
    val CURLE_FTP_WEIRD_227_FORMAT = define(14)
    val CURLE_FTP_CANT_GET_HOST = define(15)
    val CURLE_HTTP2 = define(16)
    val CURLE_FTP_COULDNT_SET_TYPE = define(17)
    val CURLE_PARTIAL_FILE = define(18)
    val CURLE_FTP_COULDNT_RETR_FILE = define(19)
    val CURLE_OBSOLETE20 = define(20)
    val CURLE_QUOTE_ERROR = define(21)
    val CURLE_HTTP_RETURNED_ERROR = define(22)
    val CURLE_WRITE_ERROR = define(23)
    val CURLE_OBSOLETE24 = define(24)
    val CURLE_UPLOAD_FAILED = define(25)
    val CURLE_READ_ERROR = define(26)
    val CURLE_OUT_OF_MEMORY = define(27)
    val CURLE_OPERATION_TIMEDOUT = define(28)
    val CURLE_OBSOLETE29 = define(29)
    val CURLE_FTP_PORT_FAILED = define(30)
    val CURLE_FTP_COULDNT_USE_REST = define(31)
    val CURLE_OBSOLETE32 = define(32)
    val CURLE_RANGE_ERROR = define(33)
    val CURLE_HTTP_POST_ERROR = define(34)
    val CURLE_SSL_CONNECT_ERROR = define(35)
    val CURLE_BAD_DOWNLOAD_RESUME = define(36)
    val CURLE_FILE_COULDNT_READ_FILE = define(37)
    val CURLE_LDAP_CANNOT_BIND = define(38)
    val CURLE_LDAP_SEARCH_FAILED = define(39)
    val CURLE_OBSOLETE40 = define(40)
    val CURLE_FUNCTION_NOT_FOUND = define(41)
    val CURLE_ABORTED_BY_CALLBACK = define(42)
    val CURLE_BAD_FUNCTION_ARGUMENT = define(43)
    val CURLE_OBSOLETE44 = define(44)
    val CURLE_INTERFACE_FAILED = define(45)
    val CURLE_OBSOLETE46 = define(46)
    val CURLE_TOO_MANY_REDIRECTS = define(47)
    val CURLE_UNKNOWN_OPTION = define(48)
    val CURLE_SETOPT_OPTION_SYNTAX = define(49)
    val CURLE_OBSOLETE50 = define(50)
    val CURLE_OBSOLETE51 = define(51)
    val CURLE_GOT_NOTHING = define(52)
    val CURLE_SSL_ENGINE_NOTFOUND = define(53)
    val CURLE_SSL_ENGINE_SETFAILED = define(54)
    val CURLE_SEND_ERROR = define(55)
    val CURLE_RECV_ERROR = define(56)
    val CURLE_OBSOLETE57 = define(57)
    val CURLE_SSL_CERTPROBLEM = define(58)
    val CURLE_SSL_CIPHER = define(59)
    val CURLE_PEER_FAILED_VERIFICATION = define(60)
    val CURLE_BAD_CONTENT_ENCODING = define(61)
    val CURLE_OBSOLETE62 = define(62)
    val CURLE_FILESIZE_EXCEEDED = define(63)
    val CURLE_USE_SSL_FAILED = define(64)
    val CURLE_SEND_FAIL_REWIND = define(65)
    val CURLE_SSL_ENGINE_INITFAILED = define(66)
    val CURLE_LOGIN_DENIED = define(67)
    val CURLE_TFTP_NOTFOUND = define(68)
    val CURLE_TFTP_PERM = define(69)
    val CURLE_REMOTE_DISK_FULL = define(70)
    val CURLE_TFTP_ILLEGAL = define(71)
    val CURLE_TFTP_UNKNOWNID = define(72)
    val CURLE_REMOTE_FILE_EXISTS = define(73)
    val CURLE_TFTP_NOSUCHUSER = define(74)
    val CURLE_OBSOLETE75 = define(75)
    val CURLE_OBSOLETE76 = define(76)
    val CURLE_SSL_CACERT_BADFILE = define(77)
    val CURLE_REMOTE_FILE_NOT_FOUND = define(78)
    val CURLE_SSH = define(79)
    val CURLE_SSL_SHUTDOWN_FAILED = define(80)
    val CURLE_AGAIN = define(81)
    val CURLE_SSL_CRL_BADFILE = define(82)
    val CURLE_SSL_ISSUER_ERROR = define(83)
    val CURLE_FTP_PRET_FAILED = define(84)
    val CURLE_RTSP_CSEQ_ERROR = define(85)
    val CURLE_RTSP_SESSION_ERROR = define(86)
    val CURLE_FTP_BAD_FILE_LIST = define(87)
    val CURLE_CHUNK_FAILED = define(88)
    val CURLE_NO_CONNECTION_AVAILABLE = define(89)
    val CURLE_SSL_PINNEDPUBKEYNOTMATCH = define(90)
    val CURLE_SSL_INVALIDCERTSTATUS = define(91)
    val CURLE_HTTP2_STREAM = define(92)
    val CURLE_RECURSIVE_API_CALL = define(93)
    val CURLE_AUTH_ERROR = define(94)
    val CURLE_HTTP3 = define(95)
    val CURLE_QUIC_CONNECT_ERROR = define(96)
    val CURLE_PROXY = define(97)
    val CURLE_SSL_CLIENTCERT = define(98)
    val CURLE_UNRECOVERABLE_POLL = define(99)
    val CURL_LAST = define(100)
    inline def getName(inline value: CURLcode): Option[String] =
      inline value match
        case CURLE_OK                    => Some("CURLE_OK")
        case CURLE_UNSUPPORTED_PROTOCOL  => Some("CURLE_UNSUPPORTED_PROTOCOL")
        case CURLE_FAILED_INIT           => Some("CURLE_FAILED_INIT")
        case CURLE_URL_MALFORMAT         => Some("CURLE_URL_MALFORMAT")
        case CURLE_NOT_BUILT_IN          => Some("CURLE_NOT_BUILT_IN")
        case CURLE_COULDNT_RESOLVE_PROXY => Some("CURLE_COULDNT_RESOLVE_PROXY")
        case CURLE_COULDNT_RESOLVE_HOST  => Some("CURLE_COULDNT_RESOLVE_HOST")
        case CURLE_COULDNT_CONNECT       => Some("CURLE_COULDNT_CONNECT")
        case CURLE_WEIRD_SERVER_REPLY    => Some("CURLE_WEIRD_SERVER_REPLY")
        case CURLE_REMOTE_ACCESS_DENIED  => Some("CURLE_REMOTE_ACCESS_DENIED")
        case CURLE_FTP_ACCEPT_FAILED     => Some("CURLE_FTP_ACCEPT_FAILED")
        case CURLE_FTP_WEIRD_PASS_REPLY  => Some("CURLE_FTP_WEIRD_PASS_REPLY")
        case CURLE_FTP_ACCEPT_TIMEOUT    => Some("CURLE_FTP_ACCEPT_TIMEOUT")
        case CURLE_FTP_WEIRD_PASV_REPLY  => Some("CURLE_FTP_WEIRD_PASV_REPLY")
        case CURLE_FTP_WEIRD_227_FORMAT  => Some("CURLE_FTP_WEIRD_227_FORMAT")
        case CURLE_FTP_CANT_GET_HOST     => Some("CURLE_FTP_CANT_GET_HOST")
        case CURLE_HTTP2                 => Some("CURLE_HTTP2")
        case CURLE_FTP_COULDNT_SET_TYPE  => Some("CURLE_FTP_COULDNT_SET_TYPE")
        case CURLE_PARTIAL_FILE          => Some("CURLE_PARTIAL_FILE")
        case CURLE_FTP_COULDNT_RETR_FILE => Some("CURLE_FTP_COULDNT_RETR_FILE")
        case CURLE_OBSOLETE20            => Some("CURLE_OBSOLETE20")
        case CURLE_QUOTE_ERROR           => Some("CURLE_QUOTE_ERROR")
        case CURLE_HTTP_RETURNED_ERROR   => Some("CURLE_HTTP_RETURNED_ERROR")
        case CURLE_WRITE_ERROR           => Some("CURLE_WRITE_ERROR")
        case CURLE_OBSOLETE24            => Some("CURLE_OBSOLETE24")
        case CURLE_UPLOAD_FAILED         => Some("CURLE_UPLOAD_FAILED")
        case CURLE_READ_ERROR            => Some("CURLE_READ_ERROR")
        case CURLE_OUT_OF_MEMORY         => Some("CURLE_OUT_OF_MEMORY")
        case CURLE_OPERATION_TIMEDOUT    => Some("CURLE_OPERATION_TIMEDOUT")
        case CURLE_OBSOLETE29            => Some("CURLE_OBSOLETE29")
        case CURLE_FTP_PORT_FAILED       => Some("CURLE_FTP_PORT_FAILED")
        case CURLE_FTP_COULDNT_USE_REST  => Some("CURLE_FTP_COULDNT_USE_REST")
        case CURLE_OBSOLETE32            => Some("CURLE_OBSOLETE32")
        case CURLE_RANGE_ERROR           => Some("CURLE_RANGE_ERROR")
        case CURLE_HTTP_POST_ERROR       => Some("CURLE_HTTP_POST_ERROR")
        case CURLE_SSL_CONNECT_ERROR     => Some("CURLE_SSL_CONNECT_ERROR")
        case CURLE_BAD_DOWNLOAD_RESUME   => Some("CURLE_BAD_DOWNLOAD_RESUME")
        case CURLE_FILE_COULDNT_READ_FILE =>
          Some("CURLE_FILE_COULDNT_READ_FILE")
        case CURLE_LDAP_CANNOT_BIND      => Some("CURLE_LDAP_CANNOT_BIND")
        case CURLE_LDAP_SEARCH_FAILED    => Some("CURLE_LDAP_SEARCH_FAILED")
        case CURLE_OBSOLETE40            => Some("CURLE_OBSOLETE40")
        case CURLE_FUNCTION_NOT_FOUND    => Some("CURLE_FUNCTION_NOT_FOUND")
        case CURLE_ABORTED_BY_CALLBACK   => Some("CURLE_ABORTED_BY_CALLBACK")
        case CURLE_BAD_FUNCTION_ARGUMENT => Some("CURLE_BAD_FUNCTION_ARGUMENT")
        case CURLE_OBSOLETE44            => Some("CURLE_OBSOLETE44")
        case CURLE_INTERFACE_FAILED      => Some("CURLE_INTERFACE_FAILED")
        case CURLE_OBSOLETE46            => Some("CURLE_OBSOLETE46")
        case CURLE_TOO_MANY_REDIRECTS    => Some("CURLE_TOO_MANY_REDIRECTS")
        case CURLE_UNKNOWN_OPTION        => Some("CURLE_UNKNOWN_OPTION")
        case CURLE_SETOPT_OPTION_SYNTAX  => Some("CURLE_SETOPT_OPTION_SYNTAX")
        case CURLE_OBSOLETE50            => Some("CURLE_OBSOLETE50")
        case CURLE_OBSOLETE51            => Some("CURLE_OBSOLETE51")
        case CURLE_GOT_NOTHING           => Some("CURLE_GOT_NOTHING")
        case CURLE_SSL_ENGINE_NOTFOUND   => Some("CURLE_SSL_ENGINE_NOTFOUND")
        case CURLE_SSL_ENGINE_SETFAILED  => Some("CURLE_SSL_ENGINE_SETFAILED")
        case CURLE_SEND_ERROR            => Some("CURLE_SEND_ERROR")
        case CURLE_RECV_ERROR            => Some("CURLE_RECV_ERROR")
        case CURLE_OBSOLETE57            => Some("CURLE_OBSOLETE57")
        case CURLE_SSL_CERTPROBLEM       => Some("CURLE_SSL_CERTPROBLEM")
        case CURLE_SSL_CIPHER            => Some("CURLE_SSL_CIPHER")
        case CURLE_PEER_FAILED_VERIFICATION =>
          Some("CURLE_PEER_FAILED_VERIFICATION")
        case CURLE_BAD_CONTENT_ENCODING  => Some("CURLE_BAD_CONTENT_ENCODING")
        case CURLE_OBSOLETE62            => Some("CURLE_OBSOLETE62")
        case CURLE_FILESIZE_EXCEEDED     => Some("CURLE_FILESIZE_EXCEEDED")
        case CURLE_USE_SSL_FAILED        => Some("CURLE_USE_SSL_FAILED")
        case CURLE_SEND_FAIL_REWIND      => Some("CURLE_SEND_FAIL_REWIND")
        case CURLE_SSL_ENGINE_INITFAILED => Some("CURLE_SSL_ENGINE_INITFAILED")
        case CURLE_LOGIN_DENIED          => Some("CURLE_LOGIN_DENIED")
        case CURLE_TFTP_NOTFOUND         => Some("CURLE_TFTP_NOTFOUND")
        case CURLE_TFTP_PERM             => Some("CURLE_TFTP_PERM")
        case CURLE_REMOTE_DISK_FULL      => Some("CURLE_REMOTE_DISK_FULL")
        case CURLE_TFTP_ILLEGAL          => Some("CURLE_TFTP_ILLEGAL")
        case CURLE_TFTP_UNKNOWNID        => Some("CURLE_TFTP_UNKNOWNID")
        case CURLE_REMOTE_FILE_EXISTS    => Some("CURLE_REMOTE_FILE_EXISTS")
        case CURLE_TFTP_NOSUCHUSER       => Some("CURLE_TFTP_NOSUCHUSER")
        case CURLE_OBSOLETE75            => Some("CURLE_OBSOLETE75")
        case CURLE_OBSOLETE76            => Some("CURLE_OBSOLETE76")
        case CURLE_SSL_CACERT_BADFILE    => Some("CURLE_SSL_CACERT_BADFILE")
        case CURLE_REMOTE_FILE_NOT_FOUND => Some("CURLE_REMOTE_FILE_NOT_FOUND")
        case CURLE_SSH                   => Some("CURLE_SSH")
        case CURLE_SSL_SHUTDOWN_FAILED   => Some("CURLE_SSL_SHUTDOWN_FAILED")
        case CURLE_AGAIN                 => Some("CURLE_AGAIN")
        case CURLE_SSL_CRL_BADFILE       => Some("CURLE_SSL_CRL_BADFILE")
        case CURLE_SSL_ISSUER_ERROR      => Some("CURLE_SSL_ISSUER_ERROR")
        case CURLE_FTP_PRET_FAILED       => Some("CURLE_FTP_PRET_FAILED")
        case CURLE_RTSP_CSEQ_ERROR       => Some("CURLE_RTSP_CSEQ_ERROR")
        case CURLE_RTSP_SESSION_ERROR    => Some("CURLE_RTSP_SESSION_ERROR")
        case CURLE_FTP_BAD_FILE_LIST     => Some("CURLE_FTP_BAD_FILE_LIST")
        case CURLE_CHUNK_FAILED          => Some("CURLE_CHUNK_FAILED")
        case CURLE_NO_CONNECTION_AVAILABLE =>
          Some("CURLE_NO_CONNECTION_AVAILABLE")
        case CURLE_SSL_PINNEDPUBKEYNOTMATCH =>
          Some("CURLE_SSL_PINNEDPUBKEYNOTMATCH")
        case CURLE_SSL_INVALIDCERTSTATUS => Some("CURLE_SSL_INVALIDCERTSTATUS")
        case CURLE_HTTP2_STREAM          => Some("CURLE_HTTP2_STREAM")
        case CURLE_RECURSIVE_API_CALL    => Some("CURLE_RECURSIVE_API_CALL")
        case CURLE_AUTH_ERROR            => Some("CURLE_AUTH_ERROR")
        case CURLE_HTTP3                 => Some("CURLE_HTTP3")
        case CURLE_QUIC_CONNECT_ERROR    => Some("CURLE_QUIC_CONNECT_ERROR")
        case CURLE_PROXY                 => Some("CURLE_PROXY")
        case CURLE_SSL_CLIENTCERT        => Some("CURLE_SSL_CLIENTCERT")
        case CURLE_UNRECOVERABLE_POLL    => Some("CURLE_UNRECOVERABLE_POLL")
        case CURL_LAST                   => Some("CURL_LAST")
        case _                           => None
    extension (a: CURLcode)
      inline def &(b: CURLcode): CURLcode = a & b
      inline def |(b: CURLcode): CURLcode = a | b
      inline def is(b: CURLcode): Boolean = (a & b) == b
  end CURLcode

  opaque type CURLformoption = CUnsignedInt
  object CURLformoption extends CEnumU[CURLformoption]:
    given _tag: Tag[CURLformoption] = Tag.UInt
    inline def define(inline a: Long): CURLformoption = a.toUInt
    val CURLFORM_NOTHING = define(0)
    val CURLFORM_COPYNAME = define(1)
    val CURLFORM_PTRNAME = define(2)
    val CURLFORM_NAMELENGTH = define(3)
    val CURLFORM_COPYCONTENTS = define(4)
    val CURLFORM_PTRCONTENTS = define(5)
    val CURLFORM_CONTENTSLENGTH = define(6)
    val CURLFORM_FILECONTENT = define(7)
    val CURLFORM_ARRAY = define(8)
    val CURLFORM_OBSOLETE = define(9)
    val CURLFORM_FILE = define(10)
    val CURLFORM_BUFFER = define(11)
    val CURLFORM_BUFFERPTR = define(12)
    val CURLFORM_BUFFERLENGTH = define(13)
    val CURLFORM_CONTENTTYPE = define(14)
    val CURLFORM_CONTENTHEADER = define(15)
    val CURLFORM_FILENAME = define(16)
    val CURLFORM_END = define(17)
    val CURLFORM_OBSOLETE2 = define(18)
    val CURLFORM_STREAM = define(19)
    val CURLFORM_CONTENTLEN = define(20)
    val CURLFORM_LASTENTRY = define(21)
    inline def getName(inline value: CURLformoption): Option[String] =
      inline value match
        case CURLFORM_NOTHING        => Some("CURLFORM_NOTHING")
        case CURLFORM_COPYNAME       => Some("CURLFORM_COPYNAME")
        case CURLFORM_PTRNAME        => Some("CURLFORM_PTRNAME")
        case CURLFORM_NAMELENGTH     => Some("CURLFORM_NAMELENGTH")
        case CURLFORM_COPYCONTENTS   => Some("CURLFORM_COPYCONTENTS")
        case CURLFORM_PTRCONTENTS    => Some("CURLFORM_PTRCONTENTS")
        case CURLFORM_CONTENTSLENGTH => Some("CURLFORM_CONTENTSLENGTH")
        case CURLFORM_FILECONTENT    => Some("CURLFORM_FILECONTENT")
        case CURLFORM_ARRAY          => Some("CURLFORM_ARRAY")
        case CURLFORM_OBSOLETE       => Some("CURLFORM_OBSOLETE")
        case CURLFORM_FILE           => Some("CURLFORM_FILE")
        case CURLFORM_BUFFER         => Some("CURLFORM_BUFFER")
        case CURLFORM_BUFFERPTR      => Some("CURLFORM_BUFFERPTR")
        case CURLFORM_BUFFERLENGTH   => Some("CURLFORM_BUFFERLENGTH")
        case CURLFORM_CONTENTTYPE    => Some("CURLFORM_CONTENTTYPE")
        case CURLFORM_CONTENTHEADER  => Some("CURLFORM_CONTENTHEADER")
        case CURLFORM_FILENAME       => Some("CURLFORM_FILENAME")
        case CURLFORM_END            => Some("CURLFORM_END")
        case CURLFORM_OBSOLETE2      => Some("CURLFORM_OBSOLETE2")
        case CURLFORM_STREAM         => Some("CURLFORM_STREAM")
        case CURLFORM_CONTENTLEN     => Some("CURLFORM_CONTENTLEN")
        case CURLFORM_LASTENTRY      => Some("CURLFORM_LASTENTRY")
        case _                       => None
    extension (a: CURLformoption)
      inline def &(b: CURLformoption): CURLformoption = a & b
      inline def |(b: CURLformoption): CURLformoption = a | b
      inline def is(b: CURLformoption): Boolean = (a & b) == b
  end CURLformoption

  opaque type CURLoption = CUnsignedInt
  object CURLoption extends CEnumU[CURLoption]:
    given _tag: Tag[CURLoption] = Tag.UInt
    inline def define(inline a: Long): CURLoption = a.toUInt
    val CURLOPT_WRITEDATA = define(10001)
    val CURLOPT_URL = define(10002)
    val CURLOPT_PORT = define(3)
    val CURLOPT_PROXY = define(10004)
    val CURLOPT_USERPWD = define(10005)
    val CURLOPT_PROXYUSERPWD = define(10006)
    val CURLOPT_RANGE = define(10007)
    val CURLOPT_READDATA = define(10009)
    val CURLOPT_ERRORBUFFER = define(10010)
    val CURLOPT_WRITEFUNCTION = define(20011)
    val CURLOPT_READFUNCTION = define(20012)
    val CURLOPT_TIMEOUT = define(13)
    val CURLOPT_INFILESIZE = define(14)
    val CURLOPT_POSTFIELDS = define(10015)
    val CURLOPT_REFERER = define(10016)
    val CURLOPT_FTPPORT = define(10017)
    val CURLOPT_USERAGENT = define(10018)
    val CURLOPT_LOW_SPEED_LIMIT = define(19)
    val CURLOPT_LOW_SPEED_TIME = define(20)
    val CURLOPT_RESUME_FROM = define(21)
    val CURLOPT_COOKIE = define(10022)
    val CURLOPT_HTTPHEADER = define(10023)
    val CURLOPT_HTTPPOST = define(10024)
    val CURLOPT_SSLCERT = define(10025)
    val CURLOPT_KEYPASSWD = define(10026)
    val CURLOPT_CRLF = define(27)
    val CURLOPT_QUOTE = define(10028)
    val CURLOPT_HEADERDATA = define(10029)
    val CURLOPT_COOKIEFILE = define(10031)
    val CURLOPT_SSLVERSION = define(32)
    val CURLOPT_TIMECONDITION = define(33)
    val CURLOPT_TIMEVALUE = define(34)
    val CURLOPT_CUSTOMREQUEST = define(10036)
    val CURLOPT_STDERR = define(10037)
    val CURLOPT_POSTQUOTE = define(10039)
    val CURLOPT_OBSOLETE40 = define(10040)
    val CURLOPT_VERBOSE = define(41)
    val CURLOPT_HEADER = define(42)
    val CURLOPT_NOPROGRESS = define(43)
    val CURLOPT_NOBODY = define(44)
    val CURLOPT_FAILONERROR = define(45)
    val CURLOPT_UPLOAD = define(46)
    val CURLOPT_POST = define(47)
    val CURLOPT_DIRLISTONLY = define(48)
    val CURLOPT_APPEND = define(50)
    val CURLOPT_NETRC = define(51)
    val CURLOPT_FOLLOWLOCATION = define(52)
    val CURLOPT_TRANSFERTEXT = define(53)
    val CURLOPT_PUT = define(54)
    val CURLOPT_PROGRESSFUNCTION = define(20056)
    val CURLOPT_XFERINFODATA = define(10057)
    val CURLOPT_AUTOREFERER = define(58)
    val CURLOPT_PROXYPORT = define(59)
    val CURLOPT_POSTFIELDSIZE = define(60)
    val CURLOPT_HTTPPROXYTUNNEL = define(61)
    val CURLOPT_INTERFACE = define(10062)
    val CURLOPT_KRBLEVEL = define(10063)
    val CURLOPT_SSL_VERIFYPEER = define(64)
    val CURLOPT_CAINFO = define(10065)
    val CURLOPT_MAXREDIRS = define(68)
    val CURLOPT_FILETIME = define(69)
    val CURLOPT_TELNETOPTIONS = define(10070)
    val CURLOPT_MAXCONNECTS = define(71)
    val CURLOPT_OBSOLETE72 = define(72)
    val CURLOPT_FRESH_CONNECT = define(74)
    val CURLOPT_FORBID_REUSE = define(75)
    val CURLOPT_RANDOM_FILE = define(10076)
    val CURLOPT_EGDSOCKET = define(10077)
    val CURLOPT_CONNECTTIMEOUT = define(78)
    val CURLOPT_HEADERFUNCTION = define(20079)
    val CURLOPT_HTTPGET = define(80)
    val CURLOPT_SSL_VERIFYHOST = define(81)
    val CURLOPT_COOKIEJAR = define(10082)
    val CURLOPT_SSL_CIPHER_LIST = define(10083)
    val CURLOPT_HTTP_VERSION = define(84)
    val CURLOPT_FTP_USE_EPSV = define(85)
    val CURLOPT_SSLCERTTYPE = define(10086)
    val CURLOPT_SSLKEY = define(10087)
    val CURLOPT_SSLKEYTYPE = define(10088)
    val CURLOPT_SSLENGINE = define(10089)
    val CURLOPT_SSLENGINE_DEFAULT = define(90)
    val CURLOPT_DNS_USE_GLOBAL_CACHE = define(91)
    val CURLOPT_DNS_CACHE_TIMEOUT = define(92)
    val CURLOPT_PREQUOTE = define(10093)
    val CURLOPT_DEBUGFUNCTION = define(20094)
    val CURLOPT_DEBUGDATA = define(10095)
    val CURLOPT_COOKIESESSION = define(96)
    val CURLOPT_CAPATH = define(10097)
    val CURLOPT_BUFFERSIZE = define(98)
    val CURLOPT_NOSIGNAL = define(99)
    val CURLOPT_SHARE = define(10100)
    val CURLOPT_PROXYTYPE = define(101)
    val CURLOPT_ACCEPT_ENCODING = define(10102)
    val CURLOPT_PRIVATE = define(10103)
    val CURLOPT_HTTP200ALIASES = define(10104)
    val CURLOPT_UNRESTRICTED_AUTH = define(105)
    val CURLOPT_FTP_USE_EPRT = define(106)
    val CURLOPT_HTTPAUTH = define(107)
    val CURLOPT_SSL_CTX_FUNCTION = define(20108)
    val CURLOPT_SSL_CTX_DATA = define(10109)
    val CURLOPT_FTP_CREATE_MISSING_DIRS = define(110)
    val CURLOPT_PROXYAUTH = define(111)
    val CURLOPT_SERVER_RESPONSE_TIMEOUT = define(112)
    val CURLOPT_IPRESOLVE = define(113)
    val CURLOPT_MAXFILESIZE = define(114)
    val CURLOPT_INFILESIZE_LARGE = define(30115)
    val CURLOPT_RESUME_FROM_LARGE = define(30116)
    val CURLOPT_MAXFILESIZE_LARGE = define(30117)
    val CURLOPT_NETRC_FILE = define(10118)
    val CURLOPT_USE_SSL = define(119)
    val CURLOPT_POSTFIELDSIZE_LARGE = define(30120)
    val CURLOPT_TCP_NODELAY = define(121)
    val CURLOPT_FTPSSLAUTH = define(129)
    val CURLOPT_IOCTLFUNCTION = define(20130)
    val CURLOPT_IOCTLDATA = define(10131)
    val CURLOPT_FTP_ACCOUNT = define(10134)
    val CURLOPT_COOKIELIST = define(10135)
    val CURLOPT_IGNORE_CONTENT_LENGTH = define(136)
    val CURLOPT_FTP_SKIP_PASV_IP = define(137)
    val CURLOPT_FTP_FILEMETHOD = define(138)
    val CURLOPT_LOCALPORT = define(139)
    val CURLOPT_LOCALPORTRANGE = define(140)
    val CURLOPT_CONNECT_ONLY = define(141)
    val CURLOPT_CONV_FROM_NETWORK_FUNCTION = define(20142)
    val CURLOPT_CONV_TO_NETWORK_FUNCTION = define(20143)
    val CURLOPT_CONV_FROM_UTF8_FUNCTION = define(20144)
    val CURLOPT_MAX_SEND_SPEED_LARGE = define(30145)
    val CURLOPT_MAX_RECV_SPEED_LARGE = define(30146)
    val CURLOPT_FTP_ALTERNATIVE_TO_USER = define(10147)
    val CURLOPT_SOCKOPTFUNCTION = define(20148)
    val CURLOPT_SOCKOPTDATA = define(10149)
    val CURLOPT_SSL_SESSIONID_CACHE = define(150)
    val CURLOPT_SSH_AUTH_TYPES = define(151)
    val CURLOPT_SSH_PUBLIC_KEYFILE = define(10152)
    val CURLOPT_SSH_PRIVATE_KEYFILE = define(10153)
    val CURLOPT_FTP_SSL_CCC = define(154)
    val CURLOPT_TIMEOUT_MS = define(155)
    val CURLOPT_CONNECTTIMEOUT_MS = define(156)
    val CURLOPT_HTTP_TRANSFER_DECODING = define(157)
    val CURLOPT_HTTP_CONTENT_DECODING = define(158)
    val CURLOPT_NEW_FILE_PERMS = define(159)
    val CURLOPT_NEW_DIRECTORY_PERMS = define(160)
    val CURLOPT_POSTREDIR = define(161)
    val CURLOPT_SSH_HOST_PUBLIC_KEY_MD5 = define(10162)
    val CURLOPT_OPENSOCKETFUNCTION = define(20163)
    val CURLOPT_OPENSOCKETDATA = define(10164)
    val CURLOPT_COPYPOSTFIELDS = define(10165)
    val CURLOPT_PROXY_TRANSFER_MODE = define(166)
    val CURLOPT_SEEKFUNCTION = define(20167)
    val CURLOPT_SEEKDATA = define(10168)
    val CURLOPT_CRLFILE = define(10169)
    val CURLOPT_ISSUERCERT = define(10170)
    val CURLOPT_ADDRESS_SCOPE = define(171)
    val CURLOPT_CERTINFO = define(172)
    val CURLOPT_USERNAME = define(10173)
    val CURLOPT_PASSWORD = define(10174)
    val CURLOPT_PROXYUSERNAME = define(10175)
    val CURLOPT_PROXYPASSWORD = define(10176)
    val CURLOPT_NOPROXY = define(10177)
    val CURLOPT_TFTP_BLKSIZE = define(178)
    val CURLOPT_SOCKS5_GSSAPI_SERVICE = define(10179)
    val CURLOPT_SOCKS5_GSSAPI_NEC = define(180)
    val CURLOPT_PROTOCOLS = define(181)
    val CURLOPT_REDIR_PROTOCOLS = define(182)
    val CURLOPT_SSH_KNOWNHOSTS = define(10183)
    val CURLOPT_SSH_KEYFUNCTION = define(20184)
    val CURLOPT_SSH_KEYDATA = define(10185)
    val CURLOPT_MAIL_FROM = define(10186)
    val CURLOPT_MAIL_RCPT = define(10187)
    val CURLOPT_FTP_USE_PRET = define(188)
    val CURLOPT_RTSP_REQUEST = define(189)
    val CURLOPT_RTSP_SESSION_ID = define(10190)
    val CURLOPT_RTSP_STREAM_URI = define(10191)
    val CURLOPT_RTSP_TRANSPORT = define(10192)
    val CURLOPT_RTSP_CLIENT_CSEQ = define(193)
    val CURLOPT_RTSP_SERVER_CSEQ = define(194)
    val CURLOPT_INTERLEAVEDATA = define(10195)
    val CURLOPT_INTERLEAVEFUNCTION = define(20196)
    val CURLOPT_WILDCARDMATCH = define(197)
    val CURLOPT_CHUNK_BGN_FUNCTION = define(20198)
    val CURLOPT_CHUNK_END_FUNCTION = define(20199)
    val CURLOPT_FNMATCH_FUNCTION = define(20200)
    val CURLOPT_CHUNK_DATA = define(10201)
    val CURLOPT_FNMATCH_DATA = define(10202)
    val CURLOPT_RESOLVE = define(10203)
    val CURLOPT_TLSAUTH_USERNAME = define(10204)
    val CURLOPT_TLSAUTH_PASSWORD = define(10205)
    val CURLOPT_TLSAUTH_TYPE = define(10206)
    val CURLOPT_TRANSFER_ENCODING = define(207)
    val CURLOPT_CLOSESOCKETFUNCTION = define(20208)
    val CURLOPT_CLOSESOCKETDATA = define(10209)
    val CURLOPT_GSSAPI_DELEGATION = define(210)
    val CURLOPT_DNS_SERVERS = define(10211)
    val CURLOPT_ACCEPTTIMEOUT_MS = define(212)
    val CURLOPT_TCP_KEEPALIVE = define(213)
    val CURLOPT_TCP_KEEPIDLE = define(214)
    val CURLOPT_TCP_KEEPINTVL = define(215)
    val CURLOPT_SSL_OPTIONS = define(216)
    val CURLOPT_MAIL_AUTH = define(10217)
    val CURLOPT_SASL_IR = define(218)
    val CURLOPT_XFERINFOFUNCTION = define(20219)
    val CURLOPT_XOAUTH2_BEARER = define(10220)
    val CURLOPT_DNS_INTERFACE = define(10221)
    val CURLOPT_DNS_LOCAL_IP4 = define(10222)
    val CURLOPT_DNS_LOCAL_IP6 = define(10223)
    val CURLOPT_LOGIN_OPTIONS = define(10224)
    val CURLOPT_SSL_ENABLE_NPN = define(225)
    val CURLOPT_SSL_ENABLE_ALPN = define(226)
    val CURLOPT_EXPECT_100_TIMEOUT_MS = define(227)
    val CURLOPT_PROXYHEADER = define(10228)
    val CURLOPT_HEADEROPT = define(229)
    val CURLOPT_PINNEDPUBLICKEY = define(10230)
    val CURLOPT_UNIX_SOCKET_PATH = define(10231)
    val CURLOPT_SSL_VERIFYSTATUS = define(232)
    val CURLOPT_SSL_FALSESTART = define(233)
    val CURLOPT_PATH_AS_IS = define(234)
    val CURLOPT_PROXY_SERVICE_NAME = define(10235)
    val CURLOPT_SERVICE_NAME = define(10236)
    val CURLOPT_PIPEWAIT = define(237)
    val CURLOPT_DEFAULT_PROTOCOL = define(10238)
    val CURLOPT_STREAM_WEIGHT = define(239)
    val CURLOPT_STREAM_DEPENDS = define(10240)
    val CURLOPT_STREAM_DEPENDS_E = define(10241)
    val CURLOPT_TFTP_NO_OPTIONS = define(242)
    val CURLOPT_CONNECT_TO = define(10243)
    val CURLOPT_TCP_FASTOPEN = define(244)
    val CURLOPT_KEEP_SENDING_ON_ERROR = define(245)
    val CURLOPT_PROXY_CAINFO = define(10246)
    val CURLOPT_PROXY_CAPATH = define(10247)
    val CURLOPT_PROXY_SSL_VERIFYPEER = define(248)
    val CURLOPT_PROXY_SSL_VERIFYHOST = define(249)
    val CURLOPT_PROXY_SSLVERSION = define(250)
    val CURLOPT_PROXY_TLSAUTH_USERNAME = define(10251)
    val CURLOPT_PROXY_TLSAUTH_PASSWORD = define(10252)
    val CURLOPT_PROXY_TLSAUTH_TYPE = define(10253)
    val CURLOPT_PROXY_SSLCERT = define(10254)
    val CURLOPT_PROXY_SSLCERTTYPE = define(10255)
    val CURLOPT_PROXY_SSLKEY = define(10256)
    val CURLOPT_PROXY_SSLKEYTYPE = define(10257)
    val CURLOPT_PROXY_KEYPASSWD = define(10258)
    val CURLOPT_PROXY_SSL_CIPHER_LIST = define(10259)
    val CURLOPT_PROXY_CRLFILE = define(10260)
    val CURLOPT_PROXY_SSL_OPTIONS = define(261)
    val CURLOPT_PRE_PROXY = define(10262)
    val CURLOPT_PROXY_PINNEDPUBLICKEY = define(10263)
    val CURLOPT_ABSTRACT_UNIX_SOCKET = define(10264)
    val CURLOPT_SUPPRESS_CONNECT_HEADERS = define(265)
    val CURLOPT_REQUEST_TARGET = define(10266)
    val CURLOPT_SOCKS5_AUTH = define(267)
    val CURLOPT_SSH_COMPRESSION = define(268)
    val CURLOPT_MIMEPOST = define(10269)
    val CURLOPT_TIMEVALUE_LARGE = define(30270)
    val CURLOPT_HAPPY_EYEBALLS_TIMEOUT_MS = define(271)
    val CURLOPT_RESOLVER_START_FUNCTION = define(20272)
    val CURLOPT_RESOLVER_START_DATA = define(10273)
    val CURLOPT_HAPROXYPROTOCOL = define(274)
    val CURLOPT_DNS_SHUFFLE_ADDRESSES = define(275)
    val CURLOPT_TLS13_CIPHERS = define(10276)
    val CURLOPT_PROXY_TLS13_CIPHERS = define(10277)
    val CURLOPT_DISALLOW_USERNAME_IN_URL = define(278)
    val CURLOPT_DOH_URL = define(10279)
    val CURLOPT_UPLOAD_BUFFERSIZE = define(280)
    val CURLOPT_UPKEEP_INTERVAL_MS = define(281)
    val CURLOPT_CURLU = define(10282)
    val CURLOPT_TRAILERFUNCTION = define(20283)
    val CURLOPT_TRAILERDATA = define(10284)
    val CURLOPT_HTTP09_ALLOWED = define(285)
    val CURLOPT_ALTSVC_CTRL = define(286)
    val CURLOPT_ALTSVC = define(10287)
    val CURLOPT_MAXAGE_CONN = define(288)
    val CURLOPT_SASL_AUTHZID = define(10289)
    val CURLOPT_MAIL_RCPT_ALLOWFAILS = define(290)
    val CURLOPT_SSLCERT_BLOB = define(40291)
    val CURLOPT_SSLKEY_BLOB = define(40292)
    val CURLOPT_PROXY_SSLCERT_BLOB = define(40293)
    val CURLOPT_PROXY_SSLKEY_BLOB = define(40294)
    val CURLOPT_ISSUERCERT_BLOB = define(40295)
    val CURLOPT_PROXY_ISSUERCERT = define(10296)
    val CURLOPT_PROXY_ISSUERCERT_BLOB = define(40297)
    val CURLOPT_SSL_EC_CURVES = define(10298)
    val CURLOPT_HSTS_CTRL = define(299)
    val CURLOPT_HSTS = define(10300)
    val CURLOPT_HSTSREADFUNCTION = define(20301)
    val CURLOPT_HSTSREADDATA = define(10302)
    val CURLOPT_HSTSWRITEFUNCTION = define(20303)
    val CURLOPT_HSTSWRITEDATA = define(10304)
    val CURLOPT_AWS_SIGV4 = define(10305)
    val CURLOPT_DOH_SSL_VERIFYPEER = define(306)
    val CURLOPT_DOH_SSL_VERIFYHOST = define(307)
    val CURLOPT_DOH_SSL_VERIFYSTATUS = define(308)
    val CURLOPT_CAINFO_BLOB = define(40309)
    val CURLOPT_PROXY_CAINFO_BLOB = define(40310)
    val CURLOPT_SSH_HOST_PUBLIC_KEY_SHA256 = define(10311)
    val CURLOPT_PREREQFUNCTION = define(20312)
    val CURLOPT_PREREQDATA = define(10313)
    val CURLOPT_MAXLIFETIME_CONN = define(314)
    val CURLOPT_MIME_OPTIONS = define(315)
    val CURLOPT_SSH_HOSTKEYFUNCTION = define(20316)
    val CURLOPT_SSH_HOSTKEYDATA = define(10317)
    val CURLOPT_PROTOCOLS_STR = define(10318)
    val CURLOPT_REDIR_PROTOCOLS_STR = define(10319)
    val CURLOPT_WS_OPTIONS = define(320)
    val CURLOPT_CA_CACHE_TIMEOUT = define(321)
    val CURLOPT_QUICK_EXIT = define(322)
    val CURLOPT_HAPROXY_CLIENT_IP = define(10323)
    val CURLOPT_LASTENTRY = define(10324)
    inline def getName(inline value: CURLoption): Option[String] =
      inline value match
        case CURLOPT_WRITEDATA         => Some("CURLOPT_WRITEDATA")
        case CURLOPT_URL               => Some("CURLOPT_URL")
        case CURLOPT_PORT              => Some("CURLOPT_PORT")
        case CURLOPT_PROXY             => Some("CURLOPT_PROXY")
        case CURLOPT_USERPWD           => Some("CURLOPT_USERPWD")
        case CURLOPT_PROXYUSERPWD      => Some("CURLOPT_PROXYUSERPWD")
        case CURLOPT_RANGE             => Some("CURLOPT_RANGE")
        case CURLOPT_READDATA          => Some("CURLOPT_READDATA")
        case CURLOPT_ERRORBUFFER       => Some("CURLOPT_ERRORBUFFER")
        case CURLOPT_WRITEFUNCTION     => Some("CURLOPT_WRITEFUNCTION")
        case CURLOPT_READFUNCTION      => Some("CURLOPT_READFUNCTION")
        case CURLOPT_TIMEOUT           => Some("CURLOPT_TIMEOUT")
        case CURLOPT_INFILESIZE        => Some("CURLOPT_INFILESIZE")
        case CURLOPT_POSTFIELDS        => Some("CURLOPT_POSTFIELDS")
        case CURLOPT_REFERER           => Some("CURLOPT_REFERER")
        case CURLOPT_FTPPORT           => Some("CURLOPT_FTPPORT")
        case CURLOPT_USERAGENT         => Some("CURLOPT_USERAGENT")
        case CURLOPT_LOW_SPEED_LIMIT   => Some("CURLOPT_LOW_SPEED_LIMIT")
        case CURLOPT_LOW_SPEED_TIME    => Some("CURLOPT_LOW_SPEED_TIME")
        case CURLOPT_RESUME_FROM       => Some("CURLOPT_RESUME_FROM")
        case CURLOPT_COOKIE            => Some("CURLOPT_COOKIE")
        case CURLOPT_HTTPHEADER        => Some("CURLOPT_HTTPHEADER")
        case CURLOPT_HTTPPOST          => Some("CURLOPT_HTTPPOST")
        case CURLOPT_SSLCERT           => Some("CURLOPT_SSLCERT")
        case CURLOPT_KEYPASSWD         => Some("CURLOPT_KEYPASSWD")
        case CURLOPT_CRLF              => Some("CURLOPT_CRLF")
        case CURLOPT_QUOTE             => Some("CURLOPT_QUOTE")
        case CURLOPT_HEADERDATA        => Some("CURLOPT_HEADERDATA")
        case CURLOPT_COOKIEFILE        => Some("CURLOPT_COOKIEFILE")
        case CURLOPT_SSLVERSION        => Some("CURLOPT_SSLVERSION")
        case CURLOPT_TIMECONDITION     => Some("CURLOPT_TIMECONDITION")
        case CURLOPT_TIMEVALUE         => Some("CURLOPT_TIMEVALUE")
        case CURLOPT_CUSTOMREQUEST     => Some("CURLOPT_CUSTOMREQUEST")
        case CURLOPT_STDERR            => Some("CURLOPT_STDERR")
        case CURLOPT_POSTQUOTE         => Some("CURLOPT_POSTQUOTE")
        case CURLOPT_OBSOLETE40        => Some("CURLOPT_OBSOLETE40")
        case CURLOPT_VERBOSE           => Some("CURLOPT_VERBOSE")
        case CURLOPT_HEADER            => Some("CURLOPT_HEADER")
        case CURLOPT_NOPROGRESS        => Some("CURLOPT_NOPROGRESS")
        case CURLOPT_NOBODY            => Some("CURLOPT_NOBODY")
        case CURLOPT_FAILONERROR       => Some("CURLOPT_FAILONERROR")
        case CURLOPT_UPLOAD            => Some("CURLOPT_UPLOAD")
        case CURLOPT_POST              => Some("CURLOPT_POST")
        case CURLOPT_DIRLISTONLY       => Some("CURLOPT_DIRLISTONLY")
        case CURLOPT_APPEND            => Some("CURLOPT_APPEND")
        case CURLOPT_NETRC             => Some("CURLOPT_NETRC")
        case CURLOPT_FOLLOWLOCATION    => Some("CURLOPT_FOLLOWLOCATION")
        case CURLOPT_TRANSFERTEXT      => Some("CURLOPT_TRANSFERTEXT")
        case CURLOPT_PUT               => Some("CURLOPT_PUT")
        case CURLOPT_PROGRESSFUNCTION  => Some("CURLOPT_PROGRESSFUNCTION")
        case CURLOPT_XFERINFODATA      => Some("CURLOPT_XFERINFODATA")
        case CURLOPT_AUTOREFERER       => Some("CURLOPT_AUTOREFERER")
        case CURLOPT_PROXYPORT         => Some("CURLOPT_PROXYPORT")
        case CURLOPT_POSTFIELDSIZE     => Some("CURLOPT_POSTFIELDSIZE")
        case CURLOPT_HTTPPROXYTUNNEL   => Some("CURLOPT_HTTPPROXYTUNNEL")
        case CURLOPT_INTERFACE         => Some("CURLOPT_INTERFACE")
        case CURLOPT_KRBLEVEL          => Some("CURLOPT_KRBLEVEL")
        case CURLOPT_SSL_VERIFYPEER    => Some("CURLOPT_SSL_VERIFYPEER")
        case CURLOPT_CAINFO            => Some("CURLOPT_CAINFO")
        case CURLOPT_MAXREDIRS         => Some("CURLOPT_MAXREDIRS")
        case CURLOPT_FILETIME          => Some("CURLOPT_FILETIME")
        case CURLOPT_TELNETOPTIONS     => Some("CURLOPT_TELNETOPTIONS")
        case CURLOPT_MAXCONNECTS       => Some("CURLOPT_MAXCONNECTS")
        case CURLOPT_OBSOLETE72        => Some("CURLOPT_OBSOLETE72")
        case CURLOPT_FRESH_CONNECT     => Some("CURLOPT_FRESH_CONNECT")
        case CURLOPT_FORBID_REUSE      => Some("CURLOPT_FORBID_REUSE")
        case CURLOPT_RANDOM_FILE       => Some("CURLOPT_RANDOM_FILE")
        case CURLOPT_EGDSOCKET         => Some("CURLOPT_EGDSOCKET")
        case CURLOPT_CONNECTTIMEOUT    => Some("CURLOPT_CONNECTTIMEOUT")
        case CURLOPT_HEADERFUNCTION    => Some("CURLOPT_HEADERFUNCTION")
        case CURLOPT_HTTPGET           => Some("CURLOPT_HTTPGET")
        case CURLOPT_SSL_VERIFYHOST    => Some("CURLOPT_SSL_VERIFYHOST")
        case CURLOPT_COOKIEJAR         => Some("CURLOPT_COOKIEJAR")
        case CURLOPT_SSL_CIPHER_LIST   => Some("CURLOPT_SSL_CIPHER_LIST")
        case CURLOPT_HTTP_VERSION      => Some("CURLOPT_HTTP_VERSION")
        case CURLOPT_FTP_USE_EPSV      => Some("CURLOPT_FTP_USE_EPSV")
        case CURLOPT_SSLCERTTYPE       => Some("CURLOPT_SSLCERTTYPE")
        case CURLOPT_SSLKEY            => Some("CURLOPT_SSLKEY")
        case CURLOPT_SSLKEYTYPE        => Some("CURLOPT_SSLKEYTYPE")
        case CURLOPT_SSLENGINE         => Some("CURLOPT_SSLENGINE")
        case CURLOPT_SSLENGINE_DEFAULT => Some("CURLOPT_SSLENGINE_DEFAULT")
        case CURLOPT_DNS_USE_GLOBAL_CACHE =>
          Some("CURLOPT_DNS_USE_GLOBAL_CACHE")
        case CURLOPT_DNS_CACHE_TIMEOUT => Some("CURLOPT_DNS_CACHE_TIMEOUT")
        case CURLOPT_PREQUOTE          => Some("CURLOPT_PREQUOTE")
        case CURLOPT_DEBUGFUNCTION     => Some("CURLOPT_DEBUGFUNCTION")
        case CURLOPT_DEBUGDATA         => Some("CURLOPT_DEBUGDATA")
        case CURLOPT_COOKIESESSION     => Some("CURLOPT_COOKIESESSION")
        case CURLOPT_CAPATH            => Some("CURLOPT_CAPATH")
        case CURLOPT_BUFFERSIZE        => Some("CURLOPT_BUFFERSIZE")
        case CURLOPT_NOSIGNAL          => Some("CURLOPT_NOSIGNAL")
        case CURLOPT_SHARE             => Some("CURLOPT_SHARE")
        case CURLOPT_PROXYTYPE         => Some("CURLOPT_PROXYTYPE")
        case CURLOPT_ACCEPT_ENCODING   => Some("CURLOPT_ACCEPT_ENCODING")
        case CURLOPT_PRIVATE           => Some("CURLOPT_PRIVATE")
        case CURLOPT_HTTP200ALIASES    => Some("CURLOPT_HTTP200ALIASES")
        case CURLOPT_UNRESTRICTED_AUTH => Some("CURLOPT_UNRESTRICTED_AUTH")
        case CURLOPT_FTP_USE_EPRT      => Some("CURLOPT_FTP_USE_EPRT")
        case CURLOPT_HTTPAUTH          => Some("CURLOPT_HTTPAUTH")
        case CURLOPT_SSL_CTX_FUNCTION  => Some("CURLOPT_SSL_CTX_FUNCTION")
        case CURLOPT_SSL_CTX_DATA      => Some("CURLOPT_SSL_CTX_DATA")
        case CURLOPT_FTP_CREATE_MISSING_DIRS =>
          Some("CURLOPT_FTP_CREATE_MISSING_DIRS")
        case CURLOPT_PROXYAUTH => Some("CURLOPT_PROXYAUTH")
        case CURLOPT_SERVER_RESPONSE_TIMEOUT =>
          Some("CURLOPT_SERVER_RESPONSE_TIMEOUT")
        case CURLOPT_IPRESOLVE           => Some("CURLOPT_IPRESOLVE")
        case CURLOPT_MAXFILESIZE         => Some("CURLOPT_MAXFILESIZE")
        case CURLOPT_INFILESIZE_LARGE    => Some("CURLOPT_INFILESIZE_LARGE")
        case CURLOPT_RESUME_FROM_LARGE   => Some("CURLOPT_RESUME_FROM_LARGE")
        case CURLOPT_MAXFILESIZE_LARGE   => Some("CURLOPT_MAXFILESIZE_LARGE")
        case CURLOPT_NETRC_FILE          => Some("CURLOPT_NETRC_FILE")
        case CURLOPT_USE_SSL             => Some("CURLOPT_USE_SSL")
        case CURLOPT_POSTFIELDSIZE_LARGE => Some("CURLOPT_POSTFIELDSIZE_LARGE")
        case CURLOPT_TCP_NODELAY         => Some("CURLOPT_TCP_NODELAY")
        case CURLOPT_FTPSSLAUTH          => Some("CURLOPT_FTPSSLAUTH")
        case CURLOPT_IOCTLFUNCTION       => Some("CURLOPT_IOCTLFUNCTION")
        case CURLOPT_IOCTLDATA           => Some("CURLOPT_IOCTLDATA")
        case CURLOPT_FTP_ACCOUNT         => Some("CURLOPT_FTP_ACCOUNT")
        case CURLOPT_COOKIELIST          => Some("CURLOPT_COOKIELIST")
        case CURLOPT_IGNORE_CONTENT_LENGTH =>
          Some("CURLOPT_IGNORE_CONTENT_LENGTH")
        case CURLOPT_FTP_SKIP_PASV_IP => Some("CURLOPT_FTP_SKIP_PASV_IP")
        case CURLOPT_FTP_FILEMETHOD   => Some("CURLOPT_FTP_FILEMETHOD")
        case CURLOPT_LOCALPORT        => Some("CURLOPT_LOCALPORT")
        case CURLOPT_LOCALPORTRANGE   => Some("CURLOPT_LOCALPORTRANGE")
        case CURLOPT_CONNECT_ONLY     => Some("CURLOPT_CONNECT_ONLY")
        case CURLOPT_CONV_FROM_NETWORK_FUNCTION =>
          Some("CURLOPT_CONV_FROM_NETWORK_FUNCTION")
        case CURLOPT_CONV_TO_NETWORK_FUNCTION =>
          Some("CURLOPT_CONV_TO_NETWORK_FUNCTION")
        case CURLOPT_CONV_FROM_UTF8_FUNCTION =>
          Some("CURLOPT_CONV_FROM_UTF8_FUNCTION")
        case CURLOPT_MAX_SEND_SPEED_LARGE =>
          Some("CURLOPT_MAX_SEND_SPEED_LARGE")
        case CURLOPT_MAX_RECV_SPEED_LARGE =>
          Some("CURLOPT_MAX_RECV_SPEED_LARGE")
        case CURLOPT_FTP_ALTERNATIVE_TO_USER =>
          Some("CURLOPT_FTP_ALTERNATIVE_TO_USER")
        case CURLOPT_SOCKOPTFUNCTION     => Some("CURLOPT_SOCKOPTFUNCTION")
        case CURLOPT_SOCKOPTDATA         => Some("CURLOPT_SOCKOPTDATA")
        case CURLOPT_SSL_SESSIONID_CACHE => Some("CURLOPT_SSL_SESSIONID_CACHE")
        case CURLOPT_SSH_AUTH_TYPES      => Some("CURLOPT_SSH_AUTH_TYPES")
        case CURLOPT_SSH_PUBLIC_KEYFILE  => Some("CURLOPT_SSH_PUBLIC_KEYFILE")
        case CURLOPT_SSH_PRIVATE_KEYFILE => Some("CURLOPT_SSH_PRIVATE_KEYFILE")
        case CURLOPT_FTP_SSL_CCC         => Some("CURLOPT_FTP_SSL_CCC")
        case CURLOPT_TIMEOUT_MS          => Some("CURLOPT_TIMEOUT_MS")
        case CURLOPT_CONNECTTIMEOUT_MS   => Some("CURLOPT_CONNECTTIMEOUT_MS")
        case CURLOPT_HTTP_TRANSFER_DECODING =>
          Some("CURLOPT_HTTP_TRANSFER_DECODING")
        case CURLOPT_HTTP_CONTENT_DECODING =>
          Some("CURLOPT_HTTP_CONTENT_DECODING")
        case CURLOPT_NEW_FILE_PERMS      => Some("CURLOPT_NEW_FILE_PERMS")
        case CURLOPT_NEW_DIRECTORY_PERMS => Some("CURLOPT_NEW_DIRECTORY_PERMS")
        case CURLOPT_POSTREDIR           => Some("CURLOPT_POSTREDIR")
        case CURLOPT_SSH_HOST_PUBLIC_KEY_MD5 =>
          Some("CURLOPT_SSH_HOST_PUBLIC_KEY_MD5")
        case CURLOPT_OPENSOCKETFUNCTION  => Some("CURLOPT_OPENSOCKETFUNCTION")
        case CURLOPT_OPENSOCKETDATA      => Some("CURLOPT_OPENSOCKETDATA")
        case CURLOPT_COPYPOSTFIELDS      => Some("CURLOPT_COPYPOSTFIELDS")
        case CURLOPT_PROXY_TRANSFER_MODE => Some("CURLOPT_PROXY_TRANSFER_MODE")
        case CURLOPT_SEEKFUNCTION        => Some("CURLOPT_SEEKFUNCTION")
        case CURLOPT_SEEKDATA            => Some("CURLOPT_SEEKDATA")
        case CURLOPT_CRLFILE             => Some("CURLOPT_CRLFILE")
        case CURLOPT_ISSUERCERT          => Some("CURLOPT_ISSUERCERT")
        case CURLOPT_ADDRESS_SCOPE       => Some("CURLOPT_ADDRESS_SCOPE")
        case CURLOPT_CERTINFO            => Some("CURLOPT_CERTINFO")
        case CURLOPT_USERNAME            => Some("CURLOPT_USERNAME")
        case CURLOPT_PASSWORD            => Some("CURLOPT_PASSWORD")
        case CURLOPT_PROXYUSERNAME       => Some("CURLOPT_PROXYUSERNAME")
        case CURLOPT_PROXYPASSWORD       => Some("CURLOPT_PROXYPASSWORD")
        case CURLOPT_NOPROXY             => Some("CURLOPT_NOPROXY")
        case CURLOPT_TFTP_BLKSIZE        => Some("CURLOPT_TFTP_BLKSIZE")
        case CURLOPT_SOCKS5_GSSAPI_SERVICE =>
          Some("CURLOPT_SOCKS5_GSSAPI_SERVICE")
        case CURLOPT_SOCKS5_GSSAPI_NEC   => Some("CURLOPT_SOCKS5_GSSAPI_NEC")
        case CURLOPT_PROTOCOLS           => Some("CURLOPT_PROTOCOLS")
        case CURLOPT_REDIR_PROTOCOLS     => Some("CURLOPT_REDIR_PROTOCOLS")
        case CURLOPT_SSH_KNOWNHOSTS      => Some("CURLOPT_SSH_KNOWNHOSTS")
        case CURLOPT_SSH_KEYFUNCTION     => Some("CURLOPT_SSH_KEYFUNCTION")
        case CURLOPT_SSH_KEYDATA         => Some("CURLOPT_SSH_KEYDATA")
        case CURLOPT_MAIL_FROM           => Some("CURLOPT_MAIL_FROM")
        case CURLOPT_MAIL_RCPT           => Some("CURLOPT_MAIL_RCPT")
        case CURLOPT_FTP_USE_PRET        => Some("CURLOPT_FTP_USE_PRET")
        case CURLOPT_RTSP_REQUEST        => Some("CURLOPT_RTSP_REQUEST")
        case CURLOPT_RTSP_SESSION_ID     => Some("CURLOPT_RTSP_SESSION_ID")
        case CURLOPT_RTSP_STREAM_URI     => Some("CURLOPT_RTSP_STREAM_URI")
        case CURLOPT_RTSP_TRANSPORT      => Some("CURLOPT_RTSP_TRANSPORT")
        case CURLOPT_RTSP_CLIENT_CSEQ    => Some("CURLOPT_RTSP_CLIENT_CSEQ")
        case CURLOPT_RTSP_SERVER_CSEQ    => Some("CURLOPT_RTSP_SERVER_CSEQ")
        case CURLOPT_INTERLEAVEDATA      => Some("CURLOPT_INTERLEAVEDATA")
        case CURLOPT_INTERLEAVEFUNCTION  => Some("CURLOPT_INTERLEAVEFUNCTION")
        case CURLOPT_WILDCARDMATCH       => Some("CURLOPT_WILDCARDMATCH")
        case CURLOPT_CHUNK_BGN_FUNCTION  => Some("CURLOPT_CHUNK_BGN_FUNCTION")
        case CURLOPT_CHUNK_END_FUNCTION  => Some("CURLOPT_CHUNK_END_FUNCTION")
        case CURLOPT_FNMATCH_FUNCTION    => Some("CURLOPT_FNMATCH_FUNCTION")
        case CURLOPT_CHUNK_DATA          => Some("CURLOPT_CHUNK_DATA")
        case CURLOPT_FNMATCH_DATA        => Some("CURLOPT_FNMATCH_DATA")
        case CURLOPT_RESOLVE             => Some("CURLOPT_RESOLVE")
        case CURLOPT_TLSAUTH_USERNAME    => Some("CURLOPT_TLSAUTH_USERNAME")
        case CURLOPT_TLSAUTH_PASSWORD    => Some("CURLOPT_TLSAUTH_PASSWORD")
        case CURLOPT_TLSAUTH_TYPE        => Some("CURLOPT_TLSAUTH_TYPE")
        case CURLOPT_TRANSFER_ENCODING   => Some("CURLOPT_TRANSFER_ENCODING")
        case CURLOPT_CLOSESOCKETFUNCTION => Some("CURLOPT_CLOSESOCKETFUNCTION")
        case CURLOPT_CLOSESOCKETDATA     => Some("CURLOPT_CLOSESOCKETDATA")
        case CURLOPT_GSSAPI_DELEGATION   => Some("CURLOPT_GSSAPI_DELEGATION")
        case CURLOPT_DNS_SERVERS         => Some("CURLOPT_DNS_SERVERS")
        case CURLOPT_ACCEPTTIMEOUT_MS    => Some("CURLOPT_ACCEPTTIMEOUT_MS")
        case CURLOPT_TCP_KEEPALIVE       => Some("CURLOPT_TCP_KEEPALIVE")
        case CURLOPT_TCP_KEEPIDLE        => Some("CURLOPT_TCP_KEEPIDLE")
        case CURLOPT_TCP_KEEPINTVL       => Some("CURLOPT_TCP_KEEPINTVL")
        case CURLOPT_SSL_OPTIONS         => Some("CURLOPT_SSL_OPTIONS")
        case CURLOPT_MAIL_AUTH           => Some("CURLOPT_MAIL_AUTH")
        case CURLOPT_SASL_IR             => Some("CURLOPT_SASL_IR")
        case CURLOPT_XFERINFOFUNCTION    => Some("CURLOPT_XFERINFOFUNCTION")
        case CURLOPT_XOAUTH2_BEARER      => Some("CURLOPT_XOAUTH2_BEARER")
        case CURLOPT_DNS_INTERFACE       => Some("CURLOPT_DNS_INTERFACE")
        case CURLOPT_DNS_LOCAL_IP4       => Some("CURLOPT_DNS_LOCAL_IP4")
        case CURLOPT_DNS_LOCAL_IP6       => Some("CURLOPT_DNS_LOCAL_IP6")
        case CURLOPT_LOGIN_OPTIONS       => Some("CURLOPT_LOGIN_OPTIONS")
        case CURLOPT_SSL_ENABLE_NPN      => Some("CURLOPT_SSL_ENABLE_NPN")
        case CURLOPT_SSL_ENABLE_ALPN     => Some("CURLOPT_SSL_ENABLE_ALPN")
        case CURLOPT_EXPECT_100_TIMEOUT_MS =>
          Some("CURLOPT_EXPECT_100_TIMEOUT_MS")
        case CURLOPT_PROXYHEADER        => Some("CURLOPT_PROXYHEADER")
        case CURLOPT_HEADEROPT          => Some("CURLOPT_HEADEROPT")
        case CURLOPT_PINNEDPUBLICKEY    => Some("CURLOPT_PINNEDPUBLICKEY")
        case CURLOPT_UNIX_SOCKET_PATH   => Some("CURLOPT_UNIX_SOCKET_PATH")
        case CURLOPT_SSL_VERIFYSTATUS   => Some("CURLOPT_SSL_VERIFYSTATUS")
        case CURLOPT_SSL_FALSESTART     => Some("CURLOPT_SSL_FALSESTART")
        case CURLOPT_PATH_AS_IS         => Some("CURLOPT_PATH_AS_IS")
        case CURLOPT_PROXY_SERVICE_NAME => Some("CURLOPT_PROXY_SERVICE_NAME")
        case CURLOPT_SERVICE_NAME       => Some("CURLOPT_SERVICE_NAME")
        case CURLOPT_PIPEWAIT           => Some("CURLOPT_PIPEWAIT")
        case CURLOPT_DEFAULT_PROTOCOL   => Some("CURLOPT_DEFAULT_PROTOCOL")
        case CURLOPT_STREAM_WEIGHT      => Some("CURLOPT_STREAM_WEIGHT")
        case CURLOPT_STREAM_DEPENDS     => Some("CURLOPT_STREAM_DEPENDS")
        case CURLOPT_STREAM_DEPENDS_E   => Some("CURLOPT_STREAM_DEPENDS_E")
        case CURLOPT_TFTP_NO_OPTIONS    => Some("CURLOPT_TFTP_NO_OPTIONS")
        case CURLOPT_CONNECT_TO         => Some("CURLOPT_CONNECT_TO")
        case CURLOPT_TCP_FASTOPEN       => Some("CURLOPT_TCP_FASTOPEN")
        case CURLOPT_KEEP_SENDING_ON_ERROR =>
          Some("CURLOPT_KEEP_SENDING_ON_ERROR")
        case CURLOPT_PROXY_CAINFO => Some("CURLOPT_PROXY_CAINFO")
        case CURLOPT_PROXY_CAPATH => Some("CURLOPT_PROXY_CAPATH")
        case CURLOPT_PROXY_SSL_VERIFYPEER =>
          Some("CURLOPT_PROXY_SSL_VERIFYPEER")
        case CURLOPT_PROXY_SSL_VERIFYHOST =>
          Some("CURLOPT_PROXY_SSL_VERIFYHOST")
        case CURLOPT_PROXY_SSLVERSION => Some("CURLOPT_PROXY_SSLVERSION")
        case CURLOPT_PROXY_TLSAUTH_USERNAME =>
          Some("CURLOPT_PROXY_TLSAUTH_USERNAME")
        case CURLOPT_PROXY_TLSAUTH_PASSWORD =>
          Some("CURLOPT_PROXY_TLSAUTH_PASSWORD")
        case CURLOPT_PROXY_TLSAUTH_TYPE => Some("CURLOPT_PROXY_TLSAUTH_TYPE")
        case CURLOPT_PROXY_SSLCERT      => Some("CURLOPT_PROXY_SSLCERT")
        case CURLOPT_PROXY_SSLCERTTYPE  => Some("CURLOPT_PROXY_SSLCERTTYPE")
        case CURLOPT_PROXY_SSLKEY       => Some("CURLOPT_PROXY_SSLKEY")
        case CURLOPT_PROXY_SSLKEYTYPE   => Some("CURLOPT_PROXY_SSLKEYTYPE")
        case CURLOPT_PROXY_KEYPASSWD    => Some("CURLOPT_PROXY_KEYPASSWD")
        case CURLOPT_PROXY_SSL_CIPHER_LIST =>
          Some("CURLOPT_PROXY_SSL_CIPHER_LIST")
        case CURLOPT_PROXY_CRLFILE     => Some("CURLOPT_PROXY_CRLFILE")
        case CURLOPT_PROXY_SSL_OPTIONS => Some("CURLOPT_PROXY_SSL_OPTIONS")
        case CURLOPT_PRE_PROXY         => Some("CURLOPT_PRE_PROXY")
        case CURLOPT_PROXY_PINNEDPUBLICKEY =>
          Some("CURLOPT_PROXY_PINNEDPUBLICKEY")
        case CURLOPT_ABSTRACT_UNIX_SOCKET =>
          Some("CURLOPT_ABSTRACT_UNIX_SOCKET")
        case CURLOPT_SUPPRESS_CONNECT_HEADERS =>
          Some("CURLOPT_SUPPRESS_CONNECT_HEADERS")
        case CURLOPT_REQUEST_TARGET  => Some("CURLOPT_REQUEST_TARGET")
        case CURLOPT_SOCKS5_AUTH     => Some("CURLOPT_SOCKS5_AUTH")
        case CURLOPT_SSH_COMPRESSION => Some("CURLOPT_SSH_COMPRESSION")
        case CURLOPT_MIMEPOST        => Some("CURLOPT_MIMEPOST")
        case CURLOPT_TIMEVALUE_LARGE => Some("CURLOPT_TIMEVALUE_LARGE")
        case CURLOPT_HAPPY_EYEBALLS_TIMEOUT_MS =>
          Some("CURLOPT_HAPPY_EYEBALLS_TIMEOUT_MS")
        case CURLOPT_RESOLVER_START_FUNCTION =>
          Some("CURLOPT_RESOLVER_START_FUNCTION")
        case CURLOPT_RESOLVER_START_DATA => Some("CURLOPT_RESOLVER_START_DATA")
        case CURLOPT_HAPROXYPROTOCOL     => Some("CURLOPT_HAPROXYPROTOCOL")
        case CURLOPT_DNS_SHUFFLE_ADDRESSES =>
          Some("CURLOPT_DNS_SHUFFLE_ADDRESSES")
        case CURLOPT_TLS13_CIPHERS       => Some("CURLOPT_TLS13_CIPHERS")
        case CURLOPT_PROXY_TLS13_CIPHERS => Some("CURLOPT_PROXY_TLS13_CIPHERS")
        case CURLOPT_DISALLOW_USERNAME_IN_URL =>
          Some("CURLOPT_DISALLOW_USERNAME_IN_URL")
        case CURLOPT_DOH_URL            => Some("CURLOPT_DOH_URL")
        case CURLOPT_UPLOAD_BUFFERSIZE  => Some("CURLOPT_UPLOAD_BUFFERSIZE")
        case CURLOPT_UPKEEP_INTERVAL_MS => Some("CURLOPT_UPKEEP_INTERVAL_MS")
        case CURLOPT_CURLU              => Some("CURLOPT_CURLU")
        case CURLOPT_TRAILERFUNCTION    => Some("CURLOPT_TRAILERFUNCTION")
        case CURLOPT_TRAILERDATA        => Some("CURLOPT_TRAILERDATA")
        case CURLOPT_HTTP09_ALLOWED     => Some("CURLOPT_HTTP09_ALLOWED")
        case CURLOPT_ALTSVC_CTRL        => Some("CURLOPT_ALTSVC_CTRL")
        case CURLOPT_ALTSVC             => Some("CURLOPT_ALTSVC")
        case CURLOPT_MAXAGE_CONN        => Some("CURLOPT_MAXAGE_CONN")
        case CURLOPT_SASL_AUTHZID       => Some("CURLOPT_SASL_AUTHZID")
        case CURLOPT_MAIL_RCPT_ALLOWFAILS =>
          Some("CURLOPT_MAIL_RCPT_ALLOWFAILS")
        case CURLOPT_SSLCERT_BLOB       => Some("CURLOPT_SSLCERT_BLOB")
        case CURLOPT_SSLKEY_BLOB        => Some("CURLOPT_SSLKEY_BLOB")
        case CURLOPT_PROXY_SSLCERT_BLOB => Some("CURLOPT_PROXY_SSLCERT_BLOB")
        case CURLOPT_PROXY_SSLKEY_BLOB  => Some("CURLOPT_PROXY_SSLKEY_BLOB")
        case CURLOPT_ISSUERCERT_BLOB    => Some("CURLOPT_ISSUERCERT_BLOB")
        case CURLOPT_PROXY_ISSUERCERT   => Some("CURLOPT_PROXY_ISSUERCERT")
        case CURLOPT_PROXY_ISSUERCERT_BLOB =>
          Some("CURLOPT_PROXY_ISSUERCERT_BLOB")
        case CURLOPT_SSL_EC_CURVES      => Some("CURLOPT_SSL_EC_CURVES")
        case CURLOPT_HSTS_CTRL          => Some("CURLOPT_HSTS_CTRL")
        case CURLOPT_HSTS               => Some("CURLOPT_HSTS")
        case CURLOPT_HSTSREADFUNCTION   => Some("CURLOPT_HSTSREADFUNCTION")
        case CURLOPT_HSTSREADDATA       => Some("CURLOPT_HSTSREADDATA")
        case CURLOPT_HSTSWRITEFUNCTION  => Some("CURLOPT_HSTSWRITEFUNCTION")
        case CURLOPT_HSTSWRITEDATA      => Some("CURLOPT_HSTSWRITEDATA")
        case CURLOPT_AWS_SIGV4          => Some("CURLOPT_AWS_SIGV4")
        case CURLOPT_DOH_SSL_VERIFYPEER => Some("CURLOPT_DOH_SSL_VERIFYPEER")
        case CURLOPT_DOH_SSL_VERIFYHOST => Some("CURLOPT_DOH_SSL_VERIFYHOST")
        case CURLOPT_DOH_SSL_VERIFYSTATUS =>
          Some("CURLOPT_DOH_SSL_VERIFYSTATUS")
        case CURLOPT_CAINFO_BLOB       => Some("CURLOPT_CAINFO_BLOB")
        case CURLOPT_PROXY_CAINFO_BLOB => Some("CURLOPT_PROXY_CAINFO_BLOB")
        case CURLOPT_SSH_HOST_PUBLIC_KEY_SHA256 =>
          Some("CURLOPT_SSH_HOST_PUBLIC_KEY_SHA256")
        case CURLOPT_PREREQFUNCTION      => Some("CURLOPT_PREREQFUNCTION")
        case CURLOPT_PREREQDATA          => Some("CURLOPT_PREREQDATA")
        case CURLOPT_MAXLIFETIME_CONN    => Some("CURLOPT_MAXLIFETIME_CONN")
        case CURLOPT_MIME_OPTIONS        => Some("CURLOPT_MIME_OPTIONS")
        case CURLOPT_SSH_HOSTKEYFUNCTION => Some("CURLOPT_SSH_HOSTKEYFUNCTION")
        case CURLOPT_SSH_HOSTKEYDATA     => Some("CURLOPT_SSH_HOSTKEYDATA")
        case CURLOPT_PROTOCOLS_STR       => Some("CURLOPT_PROTOCOLS_STR")
        case CURLOPT_REDIR_PROTOCOLS_STR => Some("CURLOPT_REDIR_PROTOCOLS_STR")
        case CURLOPT_WS_OPTIONS          => Some("CURLOPT_WS_OPTIONS")
        case CURLOPT_CA_CACHE_TIMEOUT    => Some("CURLOPT_CA_CACHE_TIMEOUT")
        case CURLOPT_QUICK_EXIT          => Some("CURLOPT_QUICK_EXIT")
        case CURLOPT_HAPROXY_CLIENT_IP   => Some("CURLOPT_HAPROXY_CLIENT_IP")
        case CURLOPT_LASTENTRY           => Some("CURLOPT_LASTENTRY")
        case _                           => None
    extension (a: CURLoption)
      inline def &(b: CURLoption): CURLoption = a & b
      inline def |(b: CURLoption): CURLoption = a | b
      inline def is(b: CURLoption): Boolean = (a & b) == b
  end CURLoption

  opaque type CURLproxycode = CUnsignedInt
  object CURLproxycode extends CEnumU[CURLproxycode]:
    given _tag: Tag[CURLproxycode] = Tag.UInt
    inline def define(inline a: Long): CURLproxycode = a.toUInt
    val CURLPX_OK = define(0)
    val CURLPX_BAD_ADDRESS_TYPE = define(1)
    val CURLPX_BAD_VERSION = define(2)
    val CURLPX_CLOSED = define(3)
    val CURLPX_GSSAPI = define(4)
    val CURLPX_GSSAPI_PERMSG = define(5)
    val CURLPX_GSSAPI_PROTECTION = define(6)
    val CURLPX_IDENTD = define(7)
    val CURLPX_IDENTD_DIFFER = define(8)
    val CURLPX_LONG_HOSTNAME = define(9)
    val CURLPX_LONG_PASSWD = define(10)
    val CURLPX_LONG_USER = define(11)
    val CURLPX_NO_AUTH = define(12)
    val CURLPX_RECV_ADDRESS = define(13)
    val CURLPX_RECV_AUTH = define(14)
    val CURLPX_RECV_CONNECT = define(15)
    val CURLPX_RECV_REQACK = define(16)
    val CURLPX_REPLY_ADDRESS_TYPE_NOT_SUPPORTED = define(17)
    val CURLPX_REPLY_COMMAND_NOT_SUPPORTED = define(18)
    val CURLPX_REPLY_CONNECTION_REFUSED = define(19)
    val CURLPX_REPLY_GENERAL_SERVER_FAILURE = define(20)
    val CURLPX_REPLY_HOST_UNREACHABLE = define(21)
    val CURLPX_REPLY_NETWORK_UNREACHABLE = define(22)
    val CURLPX_REPLY_NOT_ALLOWED = define(23)
    val CURLPX_REPLY_TTL_EXPIRED = define(24)
    val CURLPX_REPLY_UNASSIGNED = define(25)
    val CURLPX_REQUEST_FAILED = define(26)
    val CURLPX_RESOLVE_HOST = define(27)
    val CURLPX_SEND_AUTH = define(28)
    val CURLPX_SEND_CONNECT = define(29)
    val CURLPX_SEND_REQUEST = define(30)
    val CURLPX_UNKNOWN_FAIL = define(31)
    val CURLPX_UNKNOWN_MODE = define(32)
    val CURLPX_USER_REJECTED = define(33)
    val CURLPX_LAST = define(34)
    inline def getName(inline value: CURLproxycode): Option[String] =
      inline value match
        case CURLPX_OK                => Some("CURLPX_OK")
        case CURLPX_BAD_ADDRESS_TYPE  => Some("CURLPX_BAD_ADDRESS_TYPE")
        case CURLPX_BAD_VERSION       => Some("CURLPX_BAD_VERSION")
        case CURLPX_CLOSED            => Some("CURLPX_CLOSED")
        case CURLPX_GSSAPI            => Some("CURLPX_GSSAPI")
        case CURLPX_GSSAPI_PERMSG     => Some("CURLPX_GSSAPI_PERMSG")
        case CURLPX_GSSAPI_PROTECTION => Some("CURLPX_GSSAPI_PROTECTION")
        case CURLPX_IDENTD            => Some("CURLPX_IDENTD")
        case CURLPX_IDENTD_DIFFER     => Some("CURLPX_IDENTD_DIFFER")
        case CURLPX_LONG_HOSTNAME     => Some("CURLPX_LONG_HOSTNAME")
        case CURLPX_LONG_PASSWD       => Some("CURLPX_LONG_PASSWD")
        case CURLPX_LONG_USER         => Some("CURLPX_LONG_USER")
        case CURLPX_NO_AUTH           => Some("CURLPX_NO_AUTH")
        case CURLPX_RECV_ADDRESS      => Some("CURLPX_RECV_ADDRESS")
        case CURLPX_RECV_AUTH         => Some("CURLPX_RECV_AUTH")
        case CURLPX_RECV_CONNECT      => Some("CURLPX_RECV_CONNECT")
        case CURLPX_RECV_REQACK       => Some("CURLPX_RECV_REQACK")
        case CURLPX_REPLY_ADDRESS_TYPE_NOT_SUPPORTED =>
          Some("CURLPX_REPLY_ADDRESS_TYPE_NOT_SUPPORTED")
        case CURLPX_REPLY_COMMAND_NOT_SUPPORTED =>
          Some("CURLPX_REPLY_COMMAND_NOT_SUPPORTED")
        case CURLPX_REPLY_CONNECTION_REFUSED =>
          Some("CURLPX_REPLY_CONNECTION_REFUSED")
        case CURLPX_REPLY_GENERAL_SERVER_FAILURE =>
          Some("CURLPX_REPLY_GENERAL_SERVER_FAILURE")
        case CURLPX_REPLY_HOST_UNREACHABLE =>
          Some("CURLPX_REPLY_HOST_UNREACHABLE")
        case CURLPX_REPLY_NETWORK_UNREACHABLE =>
          Some("CURLPX_REPLY_NETWORK_UNREACHABLE")
        case CURLPX_REPLY_NOT_ALLOWED => Some("CURLPX_REPLY_NOT_ALLOWED")
        case CURLPX_REPLY_TTL_EXPIRED => Some("CURLPX_REPLY_TTL_EXPIRED")
        case CURLPX_REPLY_UNASSIGNED  => Some("CURLPX_REPLY_UNASSIGNED")
        case CURLPX_REQUEST_FAILED    => Some("CURLPX_REQUEST_FAILED")
        case CURLPX_RESOLVE_HOST      => Some("CURLPX_RESOLVE_HOST")
        case CURLPX_SEND_AUTH         => Some("CURLPX_SEND_AUTH")
        case CURLPX_SEND_CONNECT      => Some("CURLPX_SEND_CONNECT")
        case CURLPX_SEND_REQUEST      => Some("CURLPX_SEND_REQUEST")
        case CURLPX_UNKNOWN_FAIL      => Some("CURLPX_UNKNOWN_FAIL")
        case CURLPX_UNKNOWN_MODE      => Some("CURLPX_UNKNOWN_MODE")
        case CURLPX_USER_REJECTED     => Some("CURLPX_USER_REJECTED")
        case CURLPX_LAST              => Some("CURLPX_LAST")
        case _                        => None
    extension (a: CURLproxycode)
      inline def &(b: CURLproxycode): CURLproxycode = a & b
      inline def |(b: CURLproxycode): CURLproxycode = a | b
      inline def is(b: CURLproxycode): Boolean = (a & b) == b
  end CURLproxycode

  opaque type CURLsslset = CUnsignedInt
  object CURLsslset extends CEnumU[CURLsslset]:
    given _tag: Tag[CURLsslset] = Tag.UInt
    inline def define(inline a: Long): CURLsslset = a.toUInt
    val CURLSSLSET_OK = define(0)
    val CURLSSLSET_UNKNOWN_BACKEND = define(1)
    val CURLSSLSET_TOO_LATE = define(2)
    val CURLSSLSET_NO_BACKENDS = define(3)
    inline def getName(inline value: CURLsslset): Option[String] =
      inline value match
        case CURLSSLSET_OK              => Some("CURLSSLSET_OK")
        case CURLSSLSET_UNKNOWN_BACKEND => Some("CURLSSLSET_UNKNOWN_BACKEND")
        case CURLSSLSET_TOO_LATE        => Some("CURLSSLSET_TOO_LATE")
        case CURLSSLSET_NO_BACKENDS     => Some("CURLSSLSET_NO_BACKENDS")
        case _                          => None
    extension (a: CURLsslset)
      inline def &(b: CURLsslset): CURLsslset = a & b
      inline def |(b: CURLsslset): CURLsslset = a | b
      inline def is(b: CURLsslset): Boolean = (a & b) == b
  end CURLsslset

  /** **************************************************************************
    * Structures for querying information about the curl library at runtime.
    */
  opaque type CURLversion = CUnsignedInt
  object CURLversion extends CEnumU[CURLversion]:
    given _tag: Tag[CURLversion] = Tag.UInt
    inline def define(inline a: Long): CURLversion = a.toUInt
    val CURLVERSION_FIRST = define(0)
    val CURLVERSION_SECOND = define(1)
    val CURLVERSION_THIRD = define(2)
    val CURLVERSION_FOURTH = define(3)
    val CURLVERSION_FIFTH = define(4)
    val CURLVERSION_SIXTH = define(5)
    val CURLVERSION_SEVENTH = define(6)
    val CURLVERSION_EIGHTH = define(7)
    val CURLVERSION_NINTH = define(8)
    val CURLVERSION_TENTH = define(9)
    val CURLVERSION_ELEVENTH = define(10)
    val CURLVERSION_LAST = define(11)
    inline def getName(inline value: CURLversion): Option[String] =
      inline value match
        case CURLVERSION_FIRST    => Some("CURLVERSION_FIRST")
        case CURLVERSION_SECOND   => Some("CURLVERSION_SECOND")
        case CURLVERSION_THIRD    => Some("CURLVERSION_THIRD")
        case CURLVERSION_FOURTH   => Some("CURLVERSION_FOURTH")
        case CURLVERSION_FIFTH    => Some("CURLVERSION_FIFTH")
        case CURLVERSION_SIXTH    => Some("CURLVERSION_SIXTH")
        case CURLVERSION_SEVENTH  => Some("CURLVERSION_SEVENTH")
        case CURLVERSION_EIGHTH   => Some("CURLVERSION_EIGHTH")
        case CURLVERSION_NINTH    => Some("CURLVERSION_NINTH")
        case CURLVERSION_TENTH    => Some("CURLVERSION_TENTH")
        case CURLVERSION_ELEVENTH => Some("CURLVERSION_ELEVENTH")
        case CURLVERSION_LAST     => Some("CURLVERSION_LAST")
        case _                    => None
    extension (a: CURLversion)
      inline def &(b: CURLversion): CURLversion = a & b
      inline def |(b: CURLversion): CURLversion = a | b
      inline def is(b: CURLversion): Boolean = (a & b) == b
  end CURLversion

  opaque type curl_TimeCond = CUnsignedInt
  object curl_TimeCond extends CEnumU[curl_TimeCond]:
    given _tag: Tag[curl_TimeCond] = Tag.UInt
    inline def define(inline a: Long): curl_TimeCond = a.toUInt
    val CURL_TIMECOND_NONE = define(0)
    val CURL_TIMECOND_IFMODSINCE = define(1)
    val CURL_TIMECOND_IFUNMODSINCE = define(2)
    val CURL_TIMECOND_LASTMOD = define(3)
    val CURL_TIMECOND_LAST = define(4)
    inline def getName(inline value: curl_TimeCond): Option[String] =
      inline value match
        case CURL_TIMECOND_NONE         => Some("CURL_TIMECOND_NONE")
        case CURL_TIMECOND_IFMODSINCE   => Some("CURL_TIMECOND_IFMODSINCE")
        case CURL_TIMECOND_IFUNMODSINCE => Some("CURL_TIMECOND_IFUNMODSINCE")
        case CURL_TIMECOND_LASTMOD      => Some("CURL_TIMECOND_LASTMOD")
        case CURL_TIMECOND_LAST         => Some("CURL_TIMECOND_LAST")
        case _                          => None
    extension (a: curl_TimeCond)
      inline def &(b: curl_TimeCond): curl_TimeCond = a & b
      inline def |(b: curl_TimeCond): curl_TimeCond = a | b
      inline def is(b: curl_TimeCond): Boolean = (a & b) == b
  end curl_TimeCond

  opaque type curl_closepolicy = CUnsignedInt
  object curl_closepolicy extends CEnumU[curl_closepolicy]:
    given _tag: Tag[curl_closepolicy] = Tag.UInt
    inline def define(inline a: Long): curl_closepolicy = a.toUInt
    val CURLCLOSEPOLICY_NONE = define(0)
    val CURLCLOSEPOLICY_OLDEST = define(1)
    val CURLCLOSEPOLICY_LEAST_RECENTLY_USED = define(2)
    val CURLCLOSEPOLICY_LEAST_TRAFFIC = define(3)
    val CURLCLOSEPOLICY_SLOWEST = define(4)
    val CURLCLOSEPOLICY_CALLBACK = define(5)
    val CURLCLOSEPOLICY_LAST = define(6)
    inline def getName(inline value: curl_closepolicy): Option[String] =
      inline value match
        case CURLCLOSEPOLICY_NONE   => Some("CURLCLOSEPOLICY_NONE")
        case CURLCLOSEPOLICY_OLDEST => Some("CURLCLOSEPOLICY_OLDEST")
        case CURLCLOSEPOLICY_LEAST_RECENTLY_USED =>
          Some("CURLCLOSEPOLICY_LEAST_RECENTLY_USED")
        case CURLCLOSEPOLICY_LEAST_TRAFFIC =>
          Some("CURLCLOSEPOLICY_LEAST_TRAFFIC")
        case CURLCLOSEPOLICY_SLOWEST  => Some("CURLCLOSEPOLICY_SLOWEST")
        case CURLCLOSEPOLICY_CALLBACK => Some("CURLCLOSEPOLICY_CALLBACK")
        case CURLCLOSEPOLICY_LAST     => Some("CURLCLOSEPOLICY_LAST")
        case _                        => None
    extension (a: curl_closepolicy)
      inline def &(b: curl_closepolicy): curl_closepolicy = a & b
      inline def |(b: curl_closepolicy): curl_closepolicy = a | b
      inline def is(b: curl_closepolicy): Boolean = (a & b) == b
  end curl_closepolicy

  opaque type curl_easytype = CUnsignedInt
  object curl_easytype extends CEnumU[curl_easytype]:
    given _tag: Tag[curl_easytype] = Tag.UInt
    inline def define(inline a: Long): curl_easytype = a.toUInt
    val CURLOT_LONG = define(0)
    val CURLOT_VALUES = define(1)
    val CURLOT_OFF_T = define(2)
    val CURLOT_OBJECT = define(3)
    val CURLOT_STRING = define(4)
    val CURLOT_SLIST = define(5)
    val CURLOT_CBPTR = define(6)
    val CURLOT_BLOB = define(7)
    val CURLOT_FUNCTION = define(8)
    inline def getName(inline value: curl_easytype): Option[String] =
      inline value match
        case CURLOT_LONG     => Some("CURLOT_LONG")
        case CURLOT_VALUES   => Some("CURLOT_VALUES")
        case CURLOT_OFF_T    => Some("CURLOT_OFF_T")
        case CURLOT_OBJECT   => Some("CURLOT_OBJECT")
        case CURLOT_STRING   => Some("CURLOT_STRING")
        case CURLOT_SLIST    => Some("CURLOT_SLIST")
        case CURLOT_CBPTR    => Some("CURLOT_CBPTR")
        case CURLOT_BLOB     => Some("CURLOT_BLOB")
        case CURLOT_FUNCTION => Some("CURLOT_FUNCTION")
        case _               => None
    extension (a: curl_easytype)
      inline def &(b: curl_easytype): curl_easytype = a & b
      inline def |(b: curl_easytype): curl_easytype = a | b
      inline def is(b: curl_easytype): Boolean = (a & b) == b
  end curl_easytype

  opaque type curl_ftpauth = CUnsignedInt
  object curl_ftpauth extends CEnumU[curl_ftpauth]:
    given _tag: Tag[curl_ftpauth] = Tag.UInt
    inline def define(inline a: Long): curl_ftpauth = a.toUInt
    val CURLFTPAUTH_DEFAULT = define(0)
    val CURLFTPAUTH_SSL = define(1)
    val CURLFTPAUTH_TLS = define(2)
    val CURLFTPAUTH_LAST = define(3)
    inline def getName(inline value: curl_ftpauth): Option[String] =
      inline value match
        case CURLFTPAUTH_DEFAULT => Some("CURLFTPAUTH_DEFAULT")
        case CURLFTPAUTH_SSL     => Some("CURLFTPAUTH_SSL")
        case CURLFTPAUTH_TLS     => Some("CURLFTPAUTH_TLS")
        case CURLFTPAUTH_LAST    => Some("CURLFTPAUTH_LAST")
        case _                   => None
    extension (a: curl_ftpauth)
      inline def &(b: curl_ftpauth): curl_ftpauth = a & b
      inline def |(b: curl_ftpauth): curl_ftpauth = a | b
      inline def is(b: curl_ftpauth): Boolean = (a & b) == b
  end curl_ftpauth

  opaque type curl_ftpccc = CUnsignedInt
  object curl_ftpccc extends CEnumU[curl_ftpccc]:
    given _tag: Tag[curl_ftpccc] = Tag.UInt
    inline def define(inline a: Long): curl_ftpccc = a.toUInt
    val CURLFTPSSL_CCC_NONE = define(0)
    val CURLFTPSSL_CCC_PASSIVE = define(1)
    val CURLFTPSSL_CCC_ACTIVE = define(2)
    val CURLFTPSSL_CCC_LAST = define(3)
    inline def getName(inline value: curl_ftpccc): Option[String] =
      inline value match
        case CURLFTPSSL_CCC_NONE    => Some("CURLFTPSSL_CCC_NONE")
        case CURLFTPSSL_CCC_PASSIVE => Some("CURLFTPSSL_CCC_PASSIVE")
        case CURLFTPSSL_CCC_ACTIVE  => Some("CURLFTPSSL_CCC_ACTIVE")
        case CURLFTPSSL_CCC_LAST    => Some("CURLFTPSSL_CCC_LAST")
        case _                      => None
    extension (a: curl_ftpccc)
      inline def &(b: curl_ftpccc): curl_ftpccc = a & b
      inline def |(b: curl_ftpccc): curl_ftpccc = a | b
      inline def is(b: curl_ftpccc): Boolean = (a & b) == b
  end curl_ftpccc

  opaque type curl_ftpcreatedir = CUnsignedInt
  object curl_ftpcreatedir extends CEnumU[curl_ftpcreatedir]:
    given _tag: Tag[curl_ftpcreatedir] = Tag.UInt
    inline def define(inline a: Long): curl_ftpcreatedir = a.toUInt
    val CURLFTP_CREATE_DIR_NONE = define(0)
    val CURLFTP_CREATE_DIR = define(1)
    val CURLFTP_CREATE_DIR_RETRY = define(2)
    val CURLFTP_CREATE_DIR_LAST = define(3)
    inline def getName(inline value: curl_ftpcreatedir): Option[String] =
      inline value match
        case CURLFTP_CREATE_DIR_NONE  => Some("CURLFTP_CREATE_DIR_NONE")
        case CURLFTP_CREATE_DIR       => Some("CURLFTP_CREATE_DIR")
        case CURLFTP_CREATE_DIR_RETRY => Some("CURLFTP_CREATE_DIR_RETRY")
        case CURLFTP_CREATE_DIR_LAST  => Some("CURLFTP_CREATE_DIR_LAST")
        case _                        => None
    extension (a: curl_ftpcreatedir)
      inline def &(b: curl_ftpcreatedir): curl_ftpcreatedir = a & b
      inline def |(b: curl_ftpcreatedir): curl_ftpcreatedir = a | b
      inline def is(b: curl_ftpcreatedir): Boolean = (a & b) == b
  end curl_ftpcreatedir

  opaque type curl_ftpmethod = CUnsignedInt
  object curl_ftpmethod extends CEnumU[curl_ftpmethod]:
    given _tag: Tag[curl_ftpmethod] = Tag.UInt
    inline def define(inline a: Long): curl_ftpmethod = a.toUInt
    val CURLFTPMETHOD_DEFAULT = define(0)
    val CURLFTPMETHOD_MULTICWD = define(1)
    val CURLFTPMETHOD_NOCWD = define(2)
    val CURLFTPMETHOD_SINGLECWD = define(3)
    val CURLFTPMETHOD_LAST = define(4)
    inline def getName(inline value: curl_ftpmethod): Option[String] =
      inline value match
        case CURLFTPMETHOD_DEFAULT   => Some("CURLFTPMETHOD_DEFAULT")
        case CURLFTPMETHOD_MULTICWD  => Some("CURLFTPMETHOD_MULTICWD")
        case CURLFTPMETHOD_NOCWD     => Some("CURLFTPMETHOD_NOCWD")
        case CURLFTPMETHOD_SINGLECWD => Some("CURLFTPMETHOD_SINGLECWD")
        case CURLFTPMETHOD_LAST      => Some("CURLFTPMETHOD_LAST")
        case _                       => None
    extension (a: curl_ftpmethod)
      inline def &(b: curl_ftpmethod): curl_ftpmethod = a & b
      inline def |(b: curl_ftpmethod): curl_ftpmethod = a | b
      inline def is(b: curl_ftpmethod): Boolean = (a & b) == b
  end curl_ftpmethod

  opaque type curl_infotype = CUnsignedInt
  object curl_infotype extends CEnumU[curl_infotype]:
    given _tag: Tag[curl_infotype] = Tag.UInt
    inline def define(inline a: Long): curl_infotype = a.toUInt
    val CURLINFO_TEXT = define(0)
    val CURLINFO_HEADER_IN = define(1)
    val CURLINFO_HEADER_OUT = define(2)
    val CURLINFO_DATA_IN = define(3)
    val CURLINFO_DATA_OUT = define(4)
    val CURLINFO_SSL_DATA_IN = define(5)
    val CURLINFO_SSL_DATA_OUT = define(6)
    val CURLINFO_END = define(7)
    inline def getName(inline value: curl_infotype): Option[String] =
      inline value match
        case CURLINFO_TEXT         => Some("CURLINFO_TEXT")
        case CURLINFO_HEADER_IN    => Some("CURLINFO_HEADER_IN")
        case CURLINFO_HEADER_OUT   => Some("CURLINFO_HEADER_OUT")
        case CURLINFO_DATA_IN      => Some("CURLINFO_DATA_IN")
        case CURLINFO_DATA_OUT     => Some("CURLINFO_DATA_OUT")
        case CURLINFO_SSL_DATA_IN  => Some("CURLINFO_SSL_DATA_IN")
        case CURLINFO_SSL_DATA_OUT => Some("CURLINFO_SSL_DATA_OUT")
        case CURLINFO_END          => Some("CURLINFO_END")
        case _                     => None
    extension (a: curl_infotype)
      inline def &(b: curl_infotype): curl_infotype = a & b
      inline def |(b: curl_infotype): curl_infotype = a | b
      inline def is(b: curl_infotype): Boolean = (a & b) == b
  end curl_infotype

  opaque type curl_khmatch = CUnsignedInt
  object curl_khmatch extends CEnumU[curl_khmatch]:
    given _tag: Tag[curl_khmatch] = Tag.UInt
    inline def define(inline a: Long): curl_khmatch = a.toUInt
    val CURLKHMATCH_OK = define(0)
    val CURLKHMATCH_MISMATCH = define(1)
    val CURLKHMATCH_MISSING = define(2)
    val CURLKHMATCH_LAST = define(3)
    inline def getName(inline value: curl_khmatch): Option[String] =
      inline value match
        case CURLKHMATCH_OK       => Some("CURLKHMATCH_OK")
        case CURLKHMATCH_MISMATCH => Some("CURLKHMATCH_MISMATCH")
        case CURLKHMATCH_MISSING  => Some("CURLKHMATCH_MISSING")
        case CURLKHMATCH_LAST     => Some("CURLKHMATCH_LAST")
        case _                    => None
    extension (a: curl_khmatch)
      inline def &(b: curl_khmatch): curl_khmatch = a & b
      inline def |(b: curl_khmatch): curl_khmatch = a | b
      inline def is(b: curl_khmatch): Boolean = (a & b) == b
  end curl_khmatch

  opaque type curl_khstat = CUnsignedInt
  object curl_khstat extends CEnumU[curl_khstat]:
    given _tag: Tag[curl_khstat] = Tag.UInt
    inline def define(inline a: Long): curl_khstat = a.toUInt
    val CURLKHSTAT_FINE_ADD_TO_FILE = define(0)
    val CURLKHSTAT_FINE = define(1)
    val CURLKHSTAT_REJECT = define(2)
    val CURLKHSTAT_DEFER = define(3)
    val CURLKHSTAT_FINE_REPLACE = define(4)
    val CURLKHSTAT_LAST = define(5)
    inline def getName(inline value: curl_khstat): Option[String] =
      inline value match
        case CURLKHSTAT_FINE_ADD_TO_FILE => Some("CURLKHSTAT_FINE_ADD_TO_FILE")
        case CURLKHSTAT_FINE             => Some("CURLKHSTAT_FINE")
        case CURLKHSTAT_REJECT           => Some("CURLKHSTAT_REJECT")
        case CURLKHSTAT_DEFER            => Some("CURLKHSTAT_DEFER")
        case CURLKHSTAT_FINE_REPLACE     => Some("CURLKHSTAT_FINE_REPLACE")
        case CURLKHSTAT_LAST             => Some("CURLKHSTAT_LAST")
        case _                           => None
    extension (a: curl_khstat)
      inline def &(b: curl_khstat): curl_khstat = a & b
      inline def |(b: curl_khstat): curl_khstat = a | b
      inline def is(b: curl_khstat): Boolean = (a & b) == b
  end curl_khstat

  opaque type curl_khtype = CUnsignedInt
  object curl_khtype extends CEnumU[curl_khtype]:
    given _tag: Tag[curl_khtype] = Tag.UInt
    inline def define(inline a: Long): curl_khtype = a.toUInt
    val CURLKHTYPE_UNKNOWN = define(0)
    val CURLKHTYPE_RSA1 = define(1)
    val CURLKHTYPE_RSA = define(2)
    val CURLKHTYPE_DSS = define(3)
    val CURLKHTYPE_ECDSA = define(4)
    val CURLKHTYPE_ED25519 = define(5)
    inline def getName(inline value: curl_khtype): Option[String] =
      inline value match
        case CURLKHTYPE_UNKNOWN => Some("CURLKHTYPE_UNKNOWN")
        case CURLKHTYPE_RSA1    => Some("CURLKHTYPE_RSA1")
        case CURLKHTYPE_RSA     => Some("CURLKHTYPE_RSA")
        case CURLKHTYPE_DSS     => Some("CURLKHTYPE_DSS")
        case CURLKHTYPE_ECDSA   => Some("CURLKHTYPE_ECDSA")
        case CURLKHTYPE_ED25519 => Some("CURLKHTYPE_ED25519")
        case _                  => None
    extension (a: curl_khtype)
      inline def &(b: curl_khtype): curl_khtype = a & b
      inline def |(b: curl_khtype): curl_khtype = a | b
      inline def is(b: curl_khtype): Boolean = (a & b) == b
  end curl_khtype

  opaque type curl_lock_access = CUnsignedInt
  object curl_lock_access extends CEnumU[curl_lock_access]:
    given _tag: Tag[curl_lock_access] = Tag.UInt
    inline def define(inline a: Long): curl_lock_access = a.toUInt
    val CURL_LOCK_ACCESS_NONE = define(0)
    val CURL_LOCK_ACCESS_SHARED = define(1)
    val CURL_LOCK_ACCESS_SINGLE = define(2)
    val CURL_LOCK_ACCESS_LAST = define(3)
    inline def getName(inline value: curl_lock_access): Option[String] =
      inline value match
        case CURL_LOCK_ACCESS_NONE   => Some("CURL_LOCK_ACCESS_NONE")
        case CURL_LOCK_ACCESS_SHARED => Some("CURL_LOCK_ACCESS_SHARED")
        case CURL_LOCK_ACCESS_SINGLE => Some("CURL_LOCK_ACCESS_SINGLE")
        case CURL_LOCK_ACCESS_LAST   => Some("CURL_LOCK_ACCESS_LAST")
        case _                       => None
    extension (a: curl_lock_access)
      inline def &(b: curl_lock_access): curl_lock_access = a & b
      inline def |(b: curl_lock_access): curl_lock_access = a | b
      inline def is(b: curl_lock_access): Boolean = (a & b) == b
  end curl_lock_access

  /** ***************************************************************************
    * Setup defines, protos etc for the sharing stuff.
    */
  opaque type curl_lock_data = CUnsignedInt
  object curl_lock_data extends CEnumU[curl_lock_data]:
    given _tag: Tag[curl_lock_data] = Tag.UInt
    inline def define(inline a: Long): curl_lock_data = a.toUInt
    val CURL_LOCK_DATA_NONE = define(0)
    val CURL_LOCK_DATA_SHARE = define(1)
    val CURL_LOCK_DATA_COOKIE = define(2)
    val CURL_LOCK_DATA_DNS = define(3)
    val CURL_LOCK_DATA_SSL_SESSION = define(4)
    val CURL_LOCK_DATA_CONNECT = define(5)
    val CURL_LOCK_DATA_PSL = define(6)
    val CURL_LOCK_DATA_HSTS = define(7)
    val CURL_LOCK_DATA_LAST = define(8)
    inline def getName(inline value: curl_lock_data): Option[String] =
      inline value match
        case CURL_LOCK_DATA_NONE        => Some("CURL_LOCK_DATA_NONE")
        case CURL_LOCK_DATA_SHARE       => Some("CURL_LOCK_DATA_SHARE")
        case CURL_LOCK_DATA_COOKIE      => Some("CURL_LOCK_DATA_COOKIE")
        case CURL_LOCK_DATA_DNS         => Some("CURL_LOCK_DATA_DNS")
        case CURL_LOCK_DATA_SSL_SESSION => Some("CURL_LOCK_DATA_SSL_SESSION")
        case CURL_LOCK_DATA_CONNECT     => Some("CURL_LOCK_DATA_CONNECT")
        case CURL_LOCK_DATA_PSL         => Some("CURL_LOCK_DATA_PSL")
        case CURL_LOCK_DATA_HSTS        => Some("CURL_LOCK_DATA_HSTS")
        case CURL_LOCK_DATA_LAST        => Some("CURL_LOCK_DATA_LAST")
        case _                          => None
    extension (a: curl_lock_data)
      inline def &(b: curl_lock_data): curl_lock_data = a & b
      inline def |(b: curl_lock_data): curl_lock_data = a | b
      inline def is(b: curl_lock_data): Boolean = (a & b) == b
  end curl_lock_data

  opaque type curl_proxytype = CUnsignedInt
  object curl_proxytype extends CEnumU[curl_proxytype]:
    given _tag: Tag[curl_proxytype] = Tag.UInt
    inline def define(inline a: Long): curl_proxytype = a.toUInt
    val CURLPROXY_HTTP = define(0)
    val CURLPROXY_HTTP_1_0 = define(1)
    val CURLPROXY_HTTPS = define(2)
    val CURLPROXY_HTTPS2 = define(3)
    val CURLPROXY_SOCKS4 = define(4)
    val CURLPROXY_SOCKS5 = define(5)
    val CURLPROXY_SOCKS4A = define(6)
    val CURLPROXY_SOCKS5_HOSTNAME = define(7)
    inline def getName(inline value: curl_proxytype): Option[String] =
      inline value match
        case CURLPROXY_HTTP            => Some("CURLPROXY_HTTP")
        case CURLPROXY_HTTP_1_0        => Some("CURLPROXY_HTTP_1_0")
        case CURLPROXY_HTTPS           => Some("CURLPROXY_HTTPS")
        case CURLPROXY_HTTPS2          => Some("CURLPROXY_HTTPS2")
        case CURLPROXY_SOCKS4          => Some("CURLPROXY_SOCKS4")
        case CURLPROXY_SOCKS5          => Some("CURLPROXY_SOCKS5")
        case CURLPROXY_SOCKS4A         => Some("CURLPROXY_SOCKS4A")
        case CURLPROXY_SOCKS5_HOSTNAME => Some("CURLPROXY_SOCKS5_HOSTNAME")
        case _                         => None
    extension (a: curl_proxytype)
      inline def &(b: curl_proxytype): curl_proxytype = a & b
      inline def |(b: curl_proxytype): curl_proxytype = a | b
      inline def is(b: curl_proxytype): Boolean = (a & b) == b
  end curl_proxytype

  opaque type curl_sslbackend = CUnsignedInt
  object curl_sslbackend extends CEnumU[curl_sslbackend]:
    given _tag: Tag[curl_sslbackend] = Tag.UInt
    inline def define(inline a: Long): curl_sslbackend = a.toUInt
    val CURLSSLBACKEND_NONE = define(0)
    val CURLSSLBACKEND_OPENSSL = define(1)
    val CURLSSLBACKEND_GNUTLS = define(2)
    val CURLSSLBACKEND_NSS = define(3)
    val CURLSSLBACKEND_OBSOLETE4 = define(4)
    val CURLSSLBACKEND_GSKIT = define(5)
    val CURLSSLBACKEND_POLARSSL = define(6)
    val CURLSSLBACKEND_WOLFSSL = define(7)
    val CURLSSLBACKEND_SCHANNEL = define(8)
    val CURLSSLBACKEND_SECURETRANSPORT = define(9)
    val CURLSSLBACKEND_AXTLS = define(10)
    val CURLSSLBACKEND_MBEDTLS = define(11)
    val CURLSSLBACKEND_MESALINK = define(12)
    val CURLSSLBACKEND_BEARSSL = define(13)
    val CURLSSLBACKEND_RUSTLS = define(14)
    inline def getName(inline value: curl_sslbackend): Option[String] =
      inline value match
        case CURLSSLBACKEND_NONE      => Some("CURLSSLBACKEND_NONE")
        case CURLSSLBACKEND_OPENSSL   => Some("CURLSSLBACKEND_OPENSSL")
        case CURLSSLBACKEND_GNUTLS    => Some("CURLSSLBACKEND_GNUTLS")
        case CURLSSLBACKEND_NSS       => Some("CURLSSLBACKEND_NSS")
        case CURLSSLBACKEND_OBSOLETE4 => Some("CURLSSLBACKEND_OBSOLETE4")
        case CURLSSLBACKEND_GSKIT     => Some("CURLSSLBACKEND_GSKIT")
        case CURLSSLBACKEND_POLARSSL  => Some("CURLSSLBACKEND_POLARSSL")
        case CURLSSLBACKEND_WOLFSSL   => Some("CURLSSLBACKEND_WOLFSSL")
        case CURLSSLBACKEND_SCHANNEL  => Some("CURLSSLBACKEND_SCHANNEL")
        case CURLSSLBACKEND_SECURETRANSPORT =>
          Some("CURLSSLBACKEND_SECURETRANSPORT")
        case CURLSSLBACKEND_AXTLS    => Some("CURLSSLBACKEND_AXTLS")
        case CURLSSLBACKEND_MBEDTLS  => Some("CURLSSLBACKEND_MBEDTLS")
        case CURLSSLBACKEND_MESALINK => Some("CURLSSLBACKEND_MESALINK")
        case CURLSSLBACKEND_BEARSSL  => Some("CURLSSLBACKEND_BEARSSL")
        case CURLSSLBACKEND_RUSTLS   => Some("CURLSSLBACKEND_RUSTLS")
        case _                       => None
    extension (a: curl_sslbackend)
      inline def &(b: curl_sslbackend): curl_sslbackend = a & b
      inline def |(b: curl_sslbackend): curl_sslbackend = a | b
      inline def is(b: curl_sslbackend): Boolean = (a & b) == b
  end curl_sslbackend

  opaque type curl_usessl = CUnsignedInt
  object curl_usessl extends CEnumU[curl_usessl]:
    given _tag: Tag[curl_usessl] = Tag.UInt
    inline def define(inline a: Long): curl_usessl = a.toUInt
    val CURLUSESSL_NONE = define(0)
    val CURLUSESSL_TRY = define(1)
    val CURLUSESSL_CONTROL = define(2)
    val CURLUSESSL_ALL = define(3)
    val CURLUSESSL_LAST = define(4)
    inline def getName(inline value: curl_usessl): Option[String] =
      inline value match
        case CURLUSESSL_NONE    => Some("CURLUSESSL_NONE")
        case CURLUSESSL_TRY     => Some("CURLUSESSL_TRY")
        case CURLUSESSL_CONTROL => Some("CURLUSESSL_CONTROL")
        case CURLUSESSL_ALL     => Some("CURLUSESSL_ALL")
        case CURLUSESSL_LAST    => Some("CURLUSESSL_LAST")
        case _                  => None
    extension (a: curl_usessl)
      inline def &(b: curl_usessl): curl_usessl = a & b
      inline def |(b: curl_usessl): curl_usessl = a | b
      inline def is(b: curl_usessl): Boolean = (a & b) == b
  end curl_usessl

  opaque type curlfiletype = CUnsignedInt
  object curlfiletype extends CEnumU[curlfiletype]:
    given _tag: Tag[curlfiletype] = Tag.UInt
    inline def define(inline a: Long): curlfiletype = a.toUInt
    val CURLFILETYPE_FILE = define(0)
    val CURLFILETYPE_DIRECTORY = define(1)
    val CURLFILETYPE_SYMLINK = define(2)
    val CURLFILETYPE_DEVICE_BLOCK = define(3)
    val CURLFILETYPE_DEVICE_CHAR = define(4)
    val CURLFILETYPE_NAMEDPIPE = define(5)
    val CURLFILETYPE_SOCKET = define(6)
    val CURLFILETYPE_DOOR = define(7)
    val CURLFILETYPE_UNKNOWN = define(8)
    inline def getName(inline value: curlfiletype): Option[String] =
      inline value match
        case CURLFILETYPE_FILE         => Some("CURLFILETYPE_FILE")
        case CURLFILETYPE_DIRECTORY    => Some("CURLFILETYPE_DIRECTORY")
        case CURLFILETYPE_SYMLINK      => Some("CURLFILETYPE_SYMLINK")
        case CURLFILETYPE_DEVICE_BLOCK => Some("CURLFILETYPE_DEVICE_BLOCK")
        case CURLFILETYPE_DEVICE_CHAR  => Some("CURLFILETYPE_DEVICE_CHAR")
        case CURLFILETYPE_NAMEDPIPE    => Some("CURLFILETYPE_NAMEDPIPE")
        case CURLFILETYPE_SOCKET       => Some("CURLFILETYPE_SOCKET")
        case CURLFILETYPE_DOOR         => Some("CURLFILETYPE_DOOR")
        case CURLFILETYPE_UNKNOWN      => Some("CURLFILETYPE_UNKNOWN")
        case _                         => None
    extension (a: curlfiletype)
      inline def &(b: curlfiletype): curlfiletype = a & b
      inline def |(b: curlfiletype): curlfiletype = a | b
      inline def is(b: curlfiletype): Boolean = (a & b) == b
  end curlfiletype

  opaque type curliocmd = CUnsignedInt
  object curliocmd extends CEnumU[curliocmd]:
    given _tag: Tag[curliocmd] = Tag.UInt
    inline def define(inline a: Long): curliocmd = a.toUInt
    val CURLIOCMD_NOP = define(0)
    val CURLIOCMD_RESTARTREAD = define(1)
    val CURLIOCMD_LAST = define(2)
    inline def getName(inline value: curliocmd): Option[String] =
      inline value match
        case CURLIOCMD_NOP         => Some("CURLIOCMD_NOP")
        case CURLIOCMD_RESTARTREAD => Some("CURLIOCMD_RESTARTREAD")
        case CURLIOCMD_LAST        => Some("CURLIOCMD_LAST")
        case _                     => None
    extension (a: curliocmd)
      inline def &(b: curliocmd): curliocmd = a & b
      inline def |(b: curliocmd): curliocmd = a | b
      inline def is(b: curliocmd): Boolean = (a & b) == b
  end curliocmd

  opaque type curlioerr = CUnsignedInt
  object curlioerr extends CEnumU[curlioerr]:
    given _tag: Tag[curlioerr] = Tag.UInt
    inline def define(inline a: Long): curlioerr = a.toUInt
    val CURLIOE_OK = define(0)
    val CURLIOE_UNKNOWNCMD = define(1)
    val CURLIOE_FAILRESTART = define(2)
    val CURLIOE_LAST = define(3)
    inline def getName(inline value: curlioerr): Option[String] =
      inline value match
        case CURLIOE_OK          => Some("CURLIOE_OK")
        case CURLIOE_UNKNOWNCMD  => Some("CURLIOE_UNKNOWNCMD")
        case CURLIOE_FAILRESTART => Some("CURLIOE_FAILRESTART")
        case CURLIOE_LAST        => Some("CURLIOE_LAST")
        case _                   => None
    extension (a: curlioerr)
      inline def &(b: curlioerr): curlioerr = a & b
      inline def |(b: curlioerr): curlioerr = a | b
      inline def is(b: curlioerr): Boolean = (a & b) == b
  end curlioerr

  opaque type curlsocktype = CUnsignedInt
  object curlsocktype extends CEnumU[curlsocktype]:
    given _tag: Tag[curlsocktype] = Tag.UInt
    inline def define(inline a: Long): curlsocktype = a.toUInt
    val CURLSOCKTYPE_IPCXN = define(0)
    val CURLSOCKTYPE_ACCEPT = define(1)
    val CURLSOCKTYPE_LAST = define(2)
    inline def getName(inline value: curlsocktype): Option[String] =
      inline value match
        case CURLSOCKTYPE_IPCXN  => Some("CURLSOCKTYPE_IPCXN")
        case CURLSOCKTYPE_ACCEPT => Some("CURLSOCKTYPE_ACCEPT")
        case CURLSOCKTYPE_LAST   => Some("CURLSOCKTYPE_LAST")
        case _                   => None
    extension (a: curlsocktype)
      inline def &(b: curlsocktype): curlsocktype = a & b
      inline def |(b: curlsocktype): curlsocktype = a | b
      inline def is(b: curlsocktype): Boolean = (a & b) == b
  end curlsocktype
end enumerations

object aliases:
  import _root_.curl.enumerations.*
  import _root_.curl.predef.*
  import _root_.curl.aliases.*
  import _root_.curl.structs.*
  type CURL = Unit
  object CURL:
    given _tag: Tag[CURL] = Tag.Unit
    inline def apply(inline o: Unit): CURL = o
    extension (v: CURL) inline def value: Unit = v

  type CURLM = Unit
  object CURLM:
    given _tag: Tag[CURLM] = Tag.Unit
    inline def apply(inline o: Unit): CURLM = o
    extension (v: CURLM) inline def value: Unit = v

  type CURLSH = Unit
  object CURLSH:
    given _tag: Tag[CURLSH] = Tag.Unit
    inline def apply(inline o: Unit): CURLSH = o
    extension (v: CURLSH) inline def value: Unit = v

  opaque type curl_calloc_callback = CFuncPtr2[size_t, size_t, Ptr[Byte]]
  object curl_calloc_callback:
    given _tag: Tag[curl_calloc_callback] =
      Tag.materializeCFuncPtr2[size_t, size_t, Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_calloc_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr2[size_t, size_t, Ptr[Byte]]
    ): curl_calloc_callback = o
    extension (v: curl_calloc_callback)
      inline def value: CFuncPtr2[size_t, size_t, Ptr[Byte]] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_calloc_callback

  opaque type curl_chunk_bgn_callback =
    CFuncPtr3[Ptr[Byte], Ptr[Byte], CInt, CLongInt]
  object curl_chunk_bgn_callback:
    given _tag: Tag[curl_chunk_bgn_callback] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], CInt, CLongInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_chunk_bgn_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], CInt, CLongInt]
    ): curl_chunk_bgn_callback = o
    extension (v: curl_chunk_bgn_callback)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[Byte], CInt, CLongInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_chunk_bgn_callback

  opaque type curl_chunk_end_callback = CFuncPtr1[Ptr[Byte], CLongInt]
  object curl_chunk_end_callback:
    given _tag: Tag[curl_chunk_end_callback] =
      Tag.materializeCFuncPtr1[Ptr[Byte], CLongInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_chunk_end_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], CLongInt]
    ): curl_chunk_end_callback = o
    extension (v: curl_chunk_end_callback)
      inline def value: CFuncPtr1[Ptr[Byte], CLongInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_chunk_end_callback

  opaque type curl_closesocket_callback =
    CFuncPtr2[Ptr[Byte], curl_socket_t, CInt]
  object curl_closesocket_callback:
    given _tag: Tag[curl_closesocket_callback] =
      Tag.materializeCFuncPtr2[Ptr[Byte], curl_socket_t, CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_closesocket_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], curl_socket_t, CInt]
    ): curl_closesocket_callback = o
    extension (v: curl_closesocket_callback)
      inline def value: CFuncPtr2[Ptr[Byte], curl_socket_t, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_closesocket_callback

  opaque type curl_conv_callback = CFuncPtr2[CString, size_t, CURLcode]
  object curl_conv_callback:
    given _tag: Tag[curl_conv_callback] =
      Tag.materializeCFuncPtr2[CString, size_t, CURLcode]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_conv_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr2[CString, size_t, CURLcode]
    ): curl_conv_callback = o
    extension (v: curl_conv_callback)
      inline def value: CFuncPtr2[CString, size_t, CURLcode] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_conv_callback

  opaque type curl_debug_callback =
    CFuncPtr5[Ptr[CURL], curl_infotype, CString, size_t, Ptr[Byte], CInt]
  object curl_debug_callback:
    given _tag: Tag[curl_debug_callback] = Tag.materializeCFuncPtr5[Ptr[
      CURL
    ], curl_infotype, CString, size_t, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_debug_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr5[Ptr[CURL], curl_infotype, CString, size_t, Ptr[
          Byte
        ], CInt]
    ): curl_debug_callback = o
    extension (v: curl_debug_callback)
      inline def value: CFuncPtr5[Ptr[
        CURL
      ], curl_infotype, CString, size_t, Ptr[Byte], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_debug_callback

  opaque type curl_fnmatch_callback =
    CFuncPtr3[Ptr[Byte], CString, CString, CInt]
  object curl_fnmatch_callback:
    given _tag: Tag[curl_fnmatch_callback] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CString, CString, CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_fnmatch_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CString, CString, CInt]
    ): curl_fnmatch_callback = o
    extension (v: curl_fnmatch_callback)
      inline def value: CFuncPtr3[Ptr[Byte], CString, CString, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_fnmatch_callback

  opaque type curl_formget_callback =
    CFuncPtr3[Ptr[Byte], CString, size_t, size_t]
  object curl_formget_callback:
    given _tag: Tag[curl_formget_callback] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CString, size_t, size_t]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_formget_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CString, size_t, size_t]
    ): curl_formget_callback = o
    extension (v: curl_formget_callback)
      inline def value: CFuncPtr3[Ptr[Byte], CString, size_t, size_t] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_formget_callback

  opaque type curl_free_callback = CFuncPtr1[Ptr[Byte], Unit]
  object curl_free_callback:
    given _tag: Tag[curl_free_callback] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_free_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): curl_free_callback =
      o
    extension (v: curl_free_callback)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_free_callback

  opaque type curl_hstsread_callback =
    CFuncPtr3[Ptr[CURL], Ptr[curl_hstsentry], Ptr[Byte], CURLSTScode]
  object curl_hstsread_callback:
    given _tag: Tag[curl_hstsread_callback] = Tag.materializeCFuncPtr3[Ptr[
      CURL
    ], Ptr[curl_hstsentry], Ptr[Byte], CURLSTScode]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_hstsread_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[CURL], Ptr[curl_hstsentry], Ptr[
          Byte
        ], CURLSTScode]
    ): curl_hstsread_callback = o
    extension (v: curl_hstsread_callback)
      inline def value
          : CFuncPtr3[Ptr[CURL], Ptr[curl_hstsentry], Ptr[Byte], CURLSTScode] =
        v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_hstsread_callback

  opaque type curl_hstswrite_callback = CFuncPtr4[Ptr[CURL], Ptr[
    curl_hstsentry
  ], Ptr[curl_index], Ptr[Byte], CURLSTScode]
  object curl_hstswrite_callback:
    given _tag: Tag[curl_hstswrite_callback] = Tag.materializeCFuncPtr4[Ptr[
      CURL
    ], Ptr[curl_hstsentry], Ptr[curl_index], Ptr[Byte], CURLSTScode]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_hstswrite_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr4[Ptr[CURL], Ptr[curl_hstsentry], Ptr[
          curl_index
        ], Ptr[Byte], CURLSTScode]
    ): curl_hstswrite_callback = o
    extension (v: curl_hstswrite_callback)
      inline def value: CFuncPtr4[Ptr[CURL], Ptr[curl_hstsentry], Ptr[
        curl_index
      ], Ptr[Byte], CURLSTScode] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_hstswrite_callback

  opaque type curl_ioctl_callback =
    CFuncPtr3[Ptr[CURL], CInt, Ptr[Byte], curlioerr]
  object curl_ioctl_callback:
    given _tag: Tag[curl_ioctl_callback] =
      Tag.materializeCFuncPtr3[Ptr[CURL], CInt, Ptr[Byte], curlioerr]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_ioctl_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[CURL], CInt, Ptr[Byte], curlioerr]
    ): curl_ioctl_callback = o
    extension (v: curl_ioctl_callback)
      inline def value: CFuncPtr3[Ptr[CURL], CInt, Ptr[Byte], curlioerr] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_ioctl_callback

  opaque type curl_lock_function =
    CFuncPtr4[Ptr[CURL], curl_lock_data, curl_lock_access, Ptr[Byte], Unit]
  object curl_lock_function:
    given _tag: Tag[curl_lock_function] = Tag.materializeCFuncPtr4[Ptr[
      CURL
    ], curl_lock_data, curl_lock_access, Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_lock_function =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr4[Ptr[CURL], curl_lock_data, curl_lock_access, Ptr[
          Byte
        ], Unit]
    ): curl_lock_function = o
    extension (v: curl_lock_function)
      inline def value: CFuncPtr4[Ptr[
        CURL
      ], curl_lock_data, curl_lock_access, Ptr[Byte], Unit] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_lock_function

  opaque type curl_malloc_callback = CFuncPtr1[size_t, Ptr[Byte]]
  object curl_malloc_callback:
    given _tag: Tag[curl_malloc_callback] =
      Tag.materializeCFuncPtr1[size_t, Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_malloc_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr1[size_t, Ptr[Byte]]
    ): curl_malloc_callback = o
    extension (v: curl_malloc_callback)
      inline def value: CFuncPtr1[size_t, Ptr[Byte]] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_malloc_callback

  opaque type curl_multi_timer_callback =
    CFuncPtr3[Ptr[CURLM], CLongInt, Ptr[Byte], CInt]
  object curl_multi_timer_callback:
    given _tag: Tag[curl_multi_timer_callback] =
      Tag.materializeCFuncPtr3[Ptr[CURLM], CLongInt, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_multi_timer_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[CURLM], CLongInt, Ptr[Byte], CInt]
    ): curl_multi_timer_callback = o
    extension (v: curl_multi_timer_callback)
      inline def value: CFuncPtr3[Ptr[CURLM], CLongInt, Ptr[Byte], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_multi_timer_callback

  opaque type curl_off_t = CLongInt
  object curl_off_t:
    given _tag: Tag[curl_off_t] = Tag.Size
    inline def apply(inline o: CLongInt): curl_off_t = o
    extension (v: curl_off_t) inline def value: CLongInt = v

  opaque type curl_opensocket_callback =
    CFuncPtr3[Ptr[Byte], curlsocktype, Ptr[curl_sockaddr], curl_socket_t]
  object curl_opensocket_callback:
    given _tag: Tag[curl_opensocket_callback] = Tag.materializeCFuncPtr3[Ptr[
      Byte
    ], curlsocktype, Ptr[curl_sockaddr], curl_socket_t]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_opensocket_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], curlsocktype, Ptr[
          curl_sockaddr
        ], curl_socket_t]
    ): curl_opensocket_callback = o
    extension (v: curl_opensocket_callback)
      inline def value: CFuncPtr3[Ptr[Byte], curlsocktype, Ptr[
        curl_sockaddr
      ], curl_socket_t] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_opensocket_callback

  opaque type curl_prereq_callback =
    CFuncPtr5[Ptr[Byte], CString, CString, CInt, CInt, CInt]
  object curl_prereq_callback:
    given _tag: Tag[curl_prereq_callback] =
      Tag.materializeCFuncPtr5[Ptr[Byte], CString, CString, CInt, CInt, CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_prereq_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], CString, CString, CInt, CInt, CInt]
    ): curl_prereq_callback = o
    extension (v: curl_prereq_callback)
      inline def value
          : CFuncPtr5[Ptr[Byte], CString, CString, CInt, CInt, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_prereq_callback

  opaque type curl_progress_callback =
    CFuncPtr5[Ptr[Byte], Double, Double, Double, Double, CInt]
  object curl_progress_callback:
    given _tag: Tag[curl_progress_callback] =
      Tag.materializeCFuncPtr5[Ptr[Byte], Double, Double, Double, Double, CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_progress_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], Double, Double, Double, Double, CInt]
    ): curl_progress_callback = o
    extension (v: curl_progress_callback)
      inline def value
          : CFuncPtr5[Ptr[Byte], Double, Double, Double, Double, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_progress_callback

  opaque type curl_push_callback = CFuncPtr5[Ptr[CURL], Ptr[CURL], size_t, Ptr[
    curl_pushheaders
  ], Ptr[Byte], CInt]
  object curl_push_callback:
    given _tag: Tag[curl_push_callback] = Tag.materializeCFuncPtr5[Ptr[
      CURL
    ], Ptr[CURL], size_t, Ptr[curl_pushheaders], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_push_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr5[Ptr[CURL], Ptr[CURL], size_t, Ptr[
          curl_pushheaders
        ], Ptr[Byte], CInt]
    ): curl_push_callback = o
    extension (v: curl_push_callback)
      inline def value: CFuncPtr5[Ptr[CURL], Ptr[CURL], size_t, Ptr[
        curl_pushheaders
      ], Ptr[Byte], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_push_callback

  opaque type curl_read_callback =
    CFuncPtr4[CString, size_t, size_t, Ptr[Byte], size_t]
  object curl_read_callback:
    given _tag: Tag[curl_read_callback] =
      Tag.materializeCFuncPtr4[CString, size_t, size_t, Ptr[Byte], size_t]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_read_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr4[CString, size_t, size_t, Ptr[Byte], size_t]
    ): curl_read_callback = o
    extension (v: curl_read_callback)
      inline def value: CFuncPtr4[CString, size_t, size_t, Ptr[Byte], size_t] =
        v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_read_callback

  opaque type curl_realloc_callback = CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]
  object curl_realloc_callback:
    given _tag: Tag[curl_realloc_callback] =
      Tag.materializeCFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_realloc_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]
    ): curl_realloc_callback = o
    extension (v: curl_realloc_callback)
      inline def value: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_realloc_callback

  opaque type curl_resolver_start_callback =
    CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt]
  object curl_resolver_start_callback:
    given _tag: Tag[curl_resolver_start_callback] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt]
    inline def fromPtr(
        ptr: Ptr[Byte] | CVoidPtr
    ): curl_resolver_start_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt]
    ): curl_resolver_start_callback = o
    extension (v: curl_resolver_start_callback)
      inline def value: CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_resolver_start_callback

  opaque type curl_seek_callback = CFuncPtr3[Ptr[Byte], curl_off_t, CInt, CInt]
  object curl_seek_callback:
    given _tag: Tag[curl_seek_callback] =
      Tag.materializeCFuncPtr3[Ptr[Byte], curl_off_t, CInt, CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_seek_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], curl_off_t, CInt, CInt]
    ): curl_seek_callback = o
    extension (v: curl_seek_callback)
      inline def value: CFuncPtr3[Ptr[Byte], curl_off_t, CInt, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_seek_callback

  opaque type curl_socket_callback =
    CFuncPtr5[Ptr[CURL], curl_socket_t, CInt, Ptr[Byte], Ptr[Byte], CInt]
  object curl_socket_callback:
    given _tag: Tag[curl_socket_callback] = Tag.materializeCFuncPtr5[Ptr[
      CURL
    ], curl_socket_t, CInt, Ptr[Byte], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_socket_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr5[Ptr[CURL], curl_socket_t, CInt, Ptr[Byte], Ptr[
          Byte
        ], CInt]
    ): curl_socket_callback = o
    extension (v: curl_socket_callback)
      inline def value: CFuncPtr5[Ptr[CURL], curl_socket_t, CInt, Ptr[
        Byte
      ], Ptr[Byte], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_socket_callback

  opaque type curl_socket_t = CInt
  object curl_socket_t:
    given _tag: Tag[curl_socket_t] = Tag.Int
    inline def apply(inline o: CInt): curl_socket_t = o
    extension (v: curl_socket_t) inline def value: CInt = v

  type curl_socklen_t = socklen_t
  object curl_socklen_t:
    given _tag: Tag[curl_socklen_t] = socklen_t._tag
    inline def apply(inline o: socklen_t): curl_socklen_t = o
    extension (v: curl_socklen_t) inline def value: socklen_t = v

  opaque type curl_sockopt_callback =
    CFuncPtr3[Ptr[Byte], curl_socket_t, curlsocktype, CInt]
  object curl_sockopt_callback:
    given _tag: Tag[curl_sockopt_callback] =
      Tag.materializeCFuncPtr3[Ptr[Byte], curl_socket_t, curlsocktype, CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_sockopt_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], curl_socket_t, curlsocktype, CInt]
    ): curl_sockopt_callback = o
    extension (v: curl_sockopt_callback)
      inline def value
          : CFuncPtr3[Ptr[Byte], curl_socket_t, curlsocktype, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_sockopt_callback

  opaque type curl_sshhostkeycallback =
    CFuncPtr4[Ptr[Byte], CInt, CString, size_t, CInt]
  object curl_sshhostkeycallback:
    given _tag: Tag[curl_sshhostkeycallback] =
      Tag.materializeCFuncPtr4[Ptr[Byte], CInt, CString, size_t, CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_sshhostkeycallback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], CInt, CString, size_t, CInt]
    ): curl_sshhostkeycallback = o
    extension (v: curl_sshhostkeycallback)
      inline def value: CFuncPtr4[Ptr[Byte], CInt, CString, size_t, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_sshhostkeycallback

  opaque type curl_sshkeycallback = CFuncPtr5[Ptr[CURL], Ptr[curl_khkey], Ptr[
    curl_khkey
  ], curl_khmatch, Ptr[Byte], CInt]
  object curl_sshkeycallback:
    given _tag: Tag[curl_sshkeycallback] = Tag.materializeCFuncPtr5[Ptr[
      CURL
    ], Ptr[curl_khkey], Ptr[curl_khkey], curl_khmatch, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_sshkeycallback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr5[Ptr[CURL], Ptr[curl_khkey], Ptr[
          curl_khkey
        ], curl_khmatch, Ptr[Byte], CInt]
    ): curl_sshkeycallback = o
    extension (v: curl_sshkeycallback)
      inline def value: CFuncPtr5[Ptr[CURL], Ptr[curl_khkey], Ptr[
        curl_khkey
      ], curl_khmatch, Ptr[Byte], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_sshkeycallback

  opaque type curl_ssl_ctx_callback =
    CFuncPtr3[Ptr[CURL], Ptr[Byte], Ptr[Byte], CURLcode]
  object curl_ssl_ctx_callback:
    given _tag: Tag[curl_ssl_ctx_callback] =
      Tag.materializeCFuncPtr3[Ptr[CURL], Ptr[Byte], Ptr[Byte], CURLcode]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_ssl_ctx_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[CURL], Ptr[Byte], Ptr[Byte], CURLcode]
    ): curl_ssl_ctx_callback = o
    extension (v: curl_ssl_ctx_callback)
      inline def value: CFuncPtr3[Ptr[CURL], Ptr[Byte], Ptr[Byte], CURLcode] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_ssl_ctx_callback

  opaque type curl_strdup_callback = CFuncPtr1[CString, CString]
  object curl_strdup_callback:
    given _tag: Tag[curl_strdup_callback] =
      Tag.materializeCFuncPtr1[CString, CString]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_strdup_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr1[CString, CString]
    ): curl_strdup_callback = o
    extension (v: curl_strdup_callback)
      inline def value: CFuncPtr1[CString, CString] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_strdup_callback

  opaque type curl_trailer_callback =
    CFuncPtr2[Ptr[Ptr[curl_slist]], Ptr[Byte], CInt]
  object curl_trailer_callback:
    given _tag: Tag[curl_trailer_callback] =
      Tag.materializeCFuncPtr2[Ptr[Ptr[curl_slist]], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_trailer_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr2[Ptr[Ptr[curl_slist]], Ptr[Byte], CInt]
    ): curl_trailer_callback = o
    extension (v: curl_trailer_callback)
      inline def value: CFuncPtr2[Ptr[Ptr[curl_slist]], Ptr[Byte], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_trailer_callback

  opaque type curl_unlock_function =
    CFuncPtr3[Ptr[CURL], curl_lock_data, Ptr[Byte], Unit]
  object curl_unlock_function:
    given _tag: Tag[curl_unlock_function] =
      Tag.materializeCFuncPtr3[Ptr[CURL], curl_lock_data, Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_unlock_function =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr3[Ptr[CURL], curl_lock_data, Ptr[Byte], Unit]
    ): curl_unlock_function = o
    extension (v: curl_unlock_function)
      inline def value: CFuncPtr3[Ptr[CURL], curl_lock_data, Ptr[Byte], Unit] =
        v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_unlock_function

  opaque type curl_write_callback =
    CFuncPtr4[CString, size_t, size_t, Ptr[Byte], size_t]
  object curl_write_callback:
    given _tag: Tag[curl_write_callback] =
      Tag.materializeCFuncPtr4[CString, size_t, size_t, Ptr[Byte], size_t]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_write_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr4[CString, size_t, size_t, Ptr[Byte], size_t]
    ): curl_write_callback = o
    extension (v: curl_write_callback)
      inline def value: CFuncPtr4[CString, size_t, size_t, Ptr[Byte], size_t] =
        v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_write_callback

  opaque type curl_xferinfo_callback =
    CFuncPtr5[Ptr[Byte], curl_off_t, curl_off_t, curl_off_t, curl_off_t, CInt]
  object curl_xferinfo_callback:
    given _tag: Tag[curl_xferinfo_callback] = Tag.materializeCFuncPtr5[Ptr[
      Byte
    ], curl_off_t, curl_off_t, curl_off_t, curl_off_t, CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): curl_xferinfo_callback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr5[Ptr[
          Byte
        ], curl_off_t, curl_off_t, curl_off_t, curl_off_t, CInt]
    ): curl_xferinfo_callback = o
    extension (v: curl_xferinfo_callback)
      inline def value: CFuncPtr5[Ptr[
        Byte
      ], curl_off_t, curl_off_t, curl_off_t, curl_off_t, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end curl_xferinfo_callback

  type fd_set = posix.sys.select.fd_set
  object fd_set:
    val _tag: Tag[fd_set] = summon[Tag[posix.sys.select.fd_set]]
    inline def apply(inline o: posix.sys.select.fd_set): fd_set = o
    extension (v: fd_set) inline def value: posix.sys.select.fd_set = v

  type size_t = libc.stddef.size_t
  object size_t:
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t) inline def value: libc.stddef.size_t = v

  type sockaddr = posix.sys.socket.sockaddr
  object sockaddr:
    val _tag: Tag[sockaddr] = summon[Tag[posix.sys.socket.sockaddr]]
    inline def apply(inline o: posix.sys.socket.sockaddr): sockaddr = o
    extension (v: sockaddr) inline def value: posix.sys.socket.sockaddr = v

  type socklen_t = posix.sys.socket.socklen_t
  object socklen_t:
    val _tag: Tag[socklen_t] = summon[Tag[posix.sys.socket.socklen_t]]
    inline def apply(inline o: posix.sys.socket.socklen_t): socklen_t = o
    extension (v: socklen_t) inline def value: posix.sys.socket.socklen_t = v

  type time_t = posix.sys.types.time_t
  object time_t:
    val _tag: Tag[time_t] = summon[Tag[posix.sys.types.time_t]]
    inline def apply(inline o: posix.sys.types.time_t): time_t = o
    extension (v: time_t) inline def value: posix.sys.types.time_t = v
end aliases

object structs:
  import _root_.curl.enumerations.*
  import _root_.curl.predef.*
  import _root_.curl.aliases.*
  import _root_.curl.structs.*
  opaque type CURLMsg = CStruct3[CURLMSG, Ptr[CURL], CURLMsg.Union0]
  object CURLMsg:
    opaque type Union0 = CArray[Byte, Nat._8]
    object Union0:
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
      def apply()(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_whatever")
      def apply(whatever: Ptr[Byte])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[Byte]]].update(0, whatever)
        ___ptr
      @scala.annotation.targetName("apply_result")
      def apply(result: CURLcode)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CURLcode]].update(0, result)
        ___ptr
      extension (struct: Union0)
        def whatever: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
        def whatever_=(value: Ptr[Byte]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
        def result: CURLcode = !struct.at(0).asInstanceOf[Ptr[CURLcode]]
        def result_=(value: CURLcode): Unit =
          !struct.at(0).asInstanceOf[Ptr[CURLcode]] = value
    end Union0
    given _tag: Tag[CURLMsg] =
      Tag.materializeCStruct3Tag[CURLMSG, Ptr[CURL], CURLMsg.Union0]
    def apply()(using Zone): Ptr[CURLMsg] =
      scala.scalanative.unsafe.alloc[CURLMsg](1)
    def apply(msg: CURLMSG, easy_handle: Ptr[CURL], data: CURLMsg.Union0)(using
        Zone
    ): Ptr[CURLMsg] =
      val ____ptr = apply()
      (!____ptr).msg = msg
      (!____ptr).easy_handle = easy_handle
      (!____ptr).data = data
      ____ptr
    extension (struct: CURLMsg)
      def msg: CURLMSG = struct._1
      def msg_=(value: CURLMSG): Unit = !struct.at1 = value
      def easy_handle: Ptr[CURL] = struct._2
      def easy_handle_=(value: Ptr[CURL]): Unit = !struct.at2 = value
      def data: CURLMsg.Union0 = struct._3
      def data_=(value: CURLMsg.Union0): Unit = !struct.at3 = value
  end CURLMsg

  opaque type CURLU = CStruct0
  object CURLU:
    given _tag: Tag[CURLU] = Tag.materializeCStruct0Tag

  opaque type Curl_URL = CStruct0
  object Curl_URL:
    given _tag: Tag[Curl_URL] = Tag.materializeCStruct0Tag

  opaque type curl_blob = CStruct3[Ptr[Byte], size_t, CUnsignedInt]
  object curl_blob:
    given _tag: Tag[curl_blob] =
      Tag.materializeCStruct3Tag[Ptr[Byte], size_t, CUnsignedInt]
    def apply()(using Zone): Ptr[curl_blob] =
      scala.scalanative.unsafe.alloc[curl_blob](1)
    def apply(data: Ptr[Byte], len: size_t, flags: CUnsignedInt)(using
        Zone
    ): Ptr[curl_blob] =
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).len = len
      (!____ptr).flags = flags
      ____ptr
    extension (struct: curl_blob)
      def data: Ptr[Byte] = struct._1
      def data_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def len: size_t = struct._2
      def len_=(value: size_t): Unit = !struct.at2 = value
      def flags: CUnsignedInt = struct._3
      def flags_=(value: CUnsignedInt): Unit = !struct.at3 = value
  end curl_blob

  opaque type curl_certinfo = CStruct2[CInt, Ptr[Byte]]
  object curl_certinfo:
    given _tag: Tag[curl_certinfo] = Tag.materializeCStruct2Tag[CInt, Ptr[Byte]]
    def apply()(using Zone): Ptr[curl_certinfo] =
      scala.scalanative.unsafe.alloc[curl_certinfo](1)
    def apply(num_of_certs: CInt, certinfo: Ptr[Ptr[curl_slist]])(using
        Zone
    ): Ptr[curl_certinfo] =
      val ____ptr = apply()
      (!____ptr).num_of_certs = num_of_certs
      (!____ptr).certinfo = certinfo
      ____ptr
    extension (struct: curl_certinfo)
      def num_of_certs: CInt = struct._1
      def num_of_certs_=(value: CInt): Unit = !struct.at1 = value
      def certinfo: Ptr[Ptr[curl_slist]] =
        struct._2.asInstanceOf[Ptr[Ptr[curl_slist]]]
      def certinfo_=(value: Ptr[Ptr[curl_slist]]): Unit = !struct.at2 =
        value.asInstanceOf[Ptr[Byte]]
  end curl_certinfo

  opaque type curl_easyoption =
    CStruct4[CString, CURLoption, curl_easytype, CUnsignedInt]
  object curl_easyoption:
    given _tag: Tag[curl_easyoption] = Tag
      .materializeCStruct4Tag[CString, CURLoption, curl_easytype, CUnsignedInt]
    def apply()(using Zone): Ptr[curl_easyoption] =
      scala.scalanative.unsafe.alloc[curl_easyoption](1)
    def apply(
        name: CString,
        id: CURLoption,
        `type`: curl_easytype,
        flags: CUnsignedInt
    )(using Zone): Ptr[curl_easyoption] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).id = id
      (!____ptr).`type` = `type`
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: curl_easyoption)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def id: CURLoption = struct._2
      def id_=(value: CURLoption): Unit = !struct.at2 = value
      def `type`: curl_easytype = struct._3
      def type_=(value: curl_easytype): Unit = !struct.at3 = value
      def flags: CUnsignedInt = struct._4
      def flags_=(value: CUnsignedInt): Unit = !struct.at4 = value
  end curl_easyoption

  opaque type curl_fileinfo = CStruct13[
    CString,
    curlfiletype,
    time_t,
    CUnsignedInt,
    CInt,
    CInt,
    curl_off_t,
    CLongInt,
    curl_fileinfo.Struct0,
    CUnsignedInt,
    CString,
    size_t,
    size_t
  ]
  object curl_fileinfo:
    opaque type Struct0 = CStruct5[CString, CString, CString, CString, CString]
    object Struct0:
      given _tag: Tag[Struct0] =
        Tag.materializeCStruct5Tag[CString, CString, CString, CString, CString]
      def apply()(using Zone): Ptr[Struct0] =
        scala.scalanative.unsafe.alloc[Struct0](1)
      def apply(
          time: CString,
          perm: CString,
          user: CString,
          group: CString,
          target: CString
      )(using Zone): Ptr[Struct0] =
        val ____ptr = apply()
        (!____ptr).time = time
        (!____ptr).perm = perm
        (!____ptr).user = user
        (!____ptr).group = group
        (!____ptr).target = target
        ____ptr
      end apply
      extension (struct: Struct0)
        def time: CString = struct._1
        def time_=(value: CString): Unit = !struct.at1 = value
        def perm: CString = struct._2
        def perm_=(value: CString): Unit = !struct.at2 = value
        def user: CString = struct._3
        def user_=(value: CString): Unit = !struct.at3 = value
        def group: CString = struct._4
        def group_=(value: CString): Unit = !struct.at4 = value
        def target: CString = struct._5
        def target_=(value: CString): Unit = !struct.at5 = value
      end extension
    end Struct0
    given _tag: Tag[curl_fileinfo] = Tag.materializeCStruct13Tag[
      CString,
      curlfiletype,
      time_t,
      CUnsignedInt,
      CInt,
      CInt,
      curl_off_t,
      CLongInt,
      curl_fileinfo.Struct0,
      CUnsignedInt,
      CString,
      size_t,
      size_t
    ]
    def apply()(using Zone): Ptr[curl_fileinfo] =
      scala.scalanative.unsafe.alloc[curl_fileinfo](1)
    def apply(
        filename: CString,
        filetype: curlfiletype,
        time: time_t,
        perm: CUnsignedInt,
        uid: CInt,
        gid: CInt,
        size: curl_off_t,
        hardlinks: CLongInt,
        strings: curl_fileinfo.Struct0,
        flags: CUnsignedInt,
        b_data: CString,
        b_size: size_t,
        b_used: size_t
    )(using Zone): Ptr[curl_fileinfo] =
      val ____ptr = apply()
      (!____ptr).filename = filename
      (!____ptr).filetype = filetype
      (!____ptr).time = time
      (!____ptr).perm = perm
      (!____ptr).uid = uid
      (!____ptr).gid = gid
      (!____ptr).size = size
      (!____ptr).hardlinks = hardlinks
      (!____ptr).strings = strings
      (!____ptr).flags = flags
      (!____ptr).b_data = b_data
      (!____ptr).b_size = b_size
      (!____ptr).b_used = b_used
      ____ptr
    end apply
    extension (struct: curl_fileinfo)
      def filename: CString = struct._1
      def filename_=(value: CString): Unit = !struct.at1 = value
      def filetype: curlfiletype = struct._2
      def filetype_=(value: curlfiletype): Unit = !struct.at2 = value
      def time: time_t = struct._3
      def time_=(value: time_t): Unit = !struct.at3 = value
      def perm: CUnsignedInt = struct._4
      def perm_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def uid: CInt = struct._5
      def uid_=(value: CInt): Unit = !struct.at5 = value
      def gid: CInt = struct._6
      def gid_=(value: CInt): Unit = !struct.at6 = value
      def size: curl_off_t = struct._7
      def size_=(value: curl_off_t): Unit = !struct.at7 = value
      def hardlinks: CLongInt = struct._8
      def hardlinks_=(value: CLongInt): Unit = !struct.at8 = value
      def strings: curl_fileinfo.Struct0 = struct._9
      def strings_=(value: curl_fileinfo.Struct0): Unit = !struct.at9 = value
      def flags: CUnsignedInt = struct._10
      def flags_=(value: CUnsignedInt): Unit = !struct.at10 = value
      def b_data: CString = struct._11
      def b_data_=(value: CString): Unit = !struct.at11 = value
      def b_size: size_t = struct._12
      def b_size_=(value: size_t): Unit = !struct.at12 = value
      def b_used: size_t = struct._13
      def b_used_=(value: size_t): Unit = !struct.at13 = value
    end extension
  end curl_fileinfo

  opaque type curl_forms = CStruct2[CURLformoption, CString]
  object curl_forms:
    given _tag: Tag[curl_forms] =
      Tag.materializeCStruct2Tag[CURLformoption, CString]
    def apply()(using Zone): Ptr[curl_forms] =
      scala.scalanative.unsafe.alloc[curl_forms](1)
    def apply(option: CURLformoption, value: CString)(using
        Zone
    ): Ptr[curl_forms] =
      val ____ptr = apply()
      (!____ptr).option = option
      (!____ptr).value = value
      ____ptr
    extension (struct: curl_forms)
      def option: CURLformoption = struct._1
      def option_=(value: CURLformoption): Unit = !struct.at1 = value
      def value: CString = struct._2
      def value_=(value: CString): Unit = !struct.at2 = value
  end curl_forms

  opaque type curl_header =
    CStruct6[CString, CString, size_t, size_t, CUnsignedInt, Ptr[Byte]]
  object curl_header:
    given _tag: Tag[curl_header] = Tag.materializeCStruct6Tag[
      CString,
      CString,
      size_t,
      size_t,
      CUnsignedInt,
      Ptr[Byte]
    ]
    def apply()(using Zone): Ptr[curl_header] =
      scala.scalanative.unsafe.alloc[curl_header](1)
    def apply(
        name: CString,
        value: CString,
        amount: size_t,
        index: size_t,
        origin: CUnsignedInt,
        anchor: Ptr[Byte]
    )(using Zone): Ptr[curl_header] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).value = value
      (!____ptr).amount = amount
      (!____ptr).index = index
      (!____ptr).origin = origin
      (!____ptr).anchor = anchor
      ____ptr
    end apply
    extension (struct: curl_header)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def value: CString = struct._2
      def value_=(value: CString): Unit = !struct.at2 = value
      def amount: size_t = struct._3
      def amount_=(value: size_t): Unit = !struct.at3 = value
      def index: size_t = struct._4
      def index_=(value: size_t): Unit = !struct.at4 = value
      def origin: CUnsignedInt = struct._5
      def origin_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def anchor: Ptr[Byte] = struct._6
      def anchor_=(value: Ptr[Byte]): Unit = !struct.at6 = value
    end extension
  end curl_header

  opaque type curl_hstsentry = CStruct4[
    CString,
    size_t,
    CUnsignedInt,
    CArray[CChar, Nat.Digit2[Nat._1, Nat._8]]
  ]
  object curl_hstsentry:
    given _tag: Tag[curl_hstsentry] =
      Tag.materializeCStruct4Tag[CString, size_t, CUnsignedInt, CArray[
        CChar,
        Nat.Digit2[Nat._1, Nat._8]
      ]]
    def apply()(using Zone): Ptr[curl_hstsentry] =
      scala.scalanative.unsafe.alloc[curl_hstsentry](1)
    def apply(
        name: CString,
        namelen: size_t,
        includeSubDomains: CUnsignedInt,
        expire: CArray[CChar, Nat.Digit2[Nat._1, Nat._8]]
    )(using Zone): Ptr[curl_hstsentry] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).namelen = namelen
      (!____ptr).includeSubDomains = includeSubDomains
      (!____ptr).expire = expire
      ____ptr
    end apply
    extension (struct: curl_hstsentry)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def namelen: size_t = struct._2
      def namelen_=(value: size_t): Unit = !struct.at2 = value
      def includeSubDomains: CUnsignedInt = struct._3
      def includeSubDomains_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def expire: CArray[CChar, Nat.Digit2[Nat._1, Nat._8]] = struct._4
      def expire_=(value: CArray[CChar, Nat.Digit2[Nat._1, Nat._8]]): Unit =
        !struct.at4 = value
    end extension
  end curl_hstsentry

  opaque type curl_httppost = CStruct14[Ptr[
    Byte
  ], CString, CLongInt, CString, CLongInt, CString, CLongInt, CString, Ptr[
    Byte
  ], Ptr[Byte], CLongInt, CString, Ptr[Byte], curl_off_t]
  object curl_httppost:
    opaque type Struct0 = CStruct0
    object Struct0:
      given _tag: Tag[Struct0] = Tag.materializeCStruct0Tag
    given _tag: Tag[curl_httppost] = Tag.materializeCStruct14Tag[Ptr[
      Byte
    ], CString, CLongInt, CString, CLongInt, CString, CLongInt, CString, Ptr[
      Byte
    ], Ptr[Byte], CLongInt, CString, Ptr[Byte], curl_off_t]
    def apply()(using Zone): Ptr[curl_httppost] =
      scala.scalanative.unsafe.alloc[curl_httppost](1)
    def apply(
        next: Ptr[curl_httppost],
        name: CString,
        namelength: CLongInt,
        contents: CString,
        contentslength: CLongInt,
        buffer: CString,
        bufferlength: CLongInt,
        contenttype: CString,
        contentheader: Ptr[curl_slist],
        more: Ptr[curl_httppost],
        flags: CLongInt,
        showfilename: CString,
        userp: Ptr[Byte],
        contentlen: curl_off_t
    )(using Zone): Ptr[curl_httppost] =
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).name = name
      (!____ptr).namelength = namelength
      (!____ptr).contents = contents
      (!____ptr).contentslength = contentslength
      (!____ptr).buffer = buffer
      (!____ptr).bufferlength = bufferlength
      (!____ptr).contenttype = contenttype
      (!____ptr).contentheader = contentheader
      (!____ptr).more = more
      (!____ptr).flags = flags
      (!____ptr).showfilename = showfilename
      (!____ptr).userp = userp
      (!____ptr).contentlen = contentlen
      ____ptr
    end apply
    extension (struct: curl_httppost)
      def next: Ptr[curl_httppost] = struct._1.asInstanceOf[Ptr[curl_httppost]]
      def next_=(value: Ptr[curl_httppost]): Unit = !struct.at1 =
        value.asInstanceOf[Ptr[Byte]]
      def name: CString = struct._2
      def name_=(value: CString): Unit = !struct.at2 = value
      def namelength: CLongInt = struct._3
      def namelength_=(value: CLongInt): Unit = !struct.at3 = value
      def contents: CString = struct._4
      def contents_=(value: CString): Unit = !struct.at4 = value
      def contentslength: CLongInt = struct._5
      def contentslength_=(value: CLongInt): Unit = !struct.at5 = value
      def buffer: CString = struct._6
      def buffer_=(value: CString): Unit = !struct.at6 = value
      def bufferlength: CLongInt = struct._7
      def bufferlength_=(value: CLongInt): Unit = !struct.at7 = value
      def contenttype: CString = struct._8
      def contenttype_=(value: CString): Unit = !struct.at8 = value
      def contentheader: Ptr[curl_slist] =
        struct._9.asInstanceOf[Ptr[curl_slist]]
      def contentheader_=(value: Ptr[curl_slist]): Unit = !struct.at9 =
        value.asInstanceOf[Ptr[Byte]]
      def more: Ptr[curl_httppost] = struct._10.asInstanceOf[Ptr[curl_httppost]]
      def more_=(value: Ptr[curl_httppost]): Unit = !struct.at10 =
        value.asInstanceOf[Ptr[Byte]]
      def flags: CLongInt = struct._11
      def flags_=(value: CLongInt): Unit = !struct.at11 = value
      def showfilename: CString = struct._12
      def showfilename_=(value: CString): Unit = !struct.at12 = value
      def userp: Ptr[Byte] = struct._13
      def userp_=(value: Ptr[Byte]): Unit = !struct.at13 = value
      def contentlen: curl_off_t = struct._14
      def contentlen_=(value: curl_off_t): Unit = !struct.at14 = value
    end extension
  end curl_httppost

  opaque type curl_index = CStruct2[size_t, size_t]
  object curl_index:
    given _tag: Tag[curl_index] = Tag.materializeCStruct2Tag[size_t, size_t]
    def apply()(using Zone): Ptr[curl_index] =
      scala.scalanative.unsafe.alloc[curl_index](1)
    def apply(index: size_t, total: size_t)(using Zone): Ptr[curl_index] =
      val ____ptr = apply()
      (!____ptr).index = index
      (!____ptr).total = total
      ____ptr
    extension (struct: curl_index)
      def index: size_t = struct._1
      def index_=(value: size_t): Unit = !struct.at1 = value
      def total: size_t = struct._2
      def total_=(value: size_t): Unit = !struct.at2 = value
  end curl_index

  opaque type curl_khkey = CStruct3[CString, size_t, curl_khtype]
  object curl_khkey:
    given _tag: Tag[curl_khkey] =
      Tag.materializeCStruct3Tag[CString, size_t, curl_khtype]
    def apply()(using Zone): Ptr[curl_khkey] =
      scala.scalanative.unsafe.alloc[curl_khkey](1)
    def apply(key: CString, len: size_t, keytype: curl_khtype)(using
        Zone
    ): Ptr[curl_khkey] =
      val ____ptr = apply()
      (!____ptr).key = key
      (!____ptr).len = len
      (!____ptr).keytype = keytype
      ____ptr
    extension (struct: curl_khkey)
      def key: CString = struct._1
      def key_=(value: CString): Unit = !struct.at1 = value
      def len: size_t = struct._2
      def len_=(value: size_t): Unit = !struct.at2 = value
      def keytype: curl_khtype = struct._3
      def keytype_=(value: curl_khtype): Unit = !struct.at3 = value
  end curl_khkey

  opaque type curl_mime = CStruct0
  object curl_mime:
    given _tag: Tag[curl_mime] = Tag.materializeCStruct0Tag

  opaque type curl_mimepart = CStruct0
  object curl_mimepart:
    given _tag: Tag[curl_mimepart] = Tag.materializeCStruct0Tag

  opaque type curl_pushheaders = CStruct0
  object curl_pushheaders:
    given _tag: Tag[curl_pushheaders] = Tag.materializeCStruct0Tag

  opaque type curl_slist = CStruct2[CString, Ptr[Byte]]
  object curl_slist:
    given _tag: Tag[curl_slist] = Tag.materializeCStruct2Tag[CString, Ptr[Byte]]
    def apply()(using Zone): Ptr[curl_slist] =
      scala.scalanative.unsafe.alloc[curl_slist](1)
    def apply(data: CString, next: Ptr[curl_slist])(using
        Zone
    ): Ptr[curl_slist] =
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).next = next
      ____ptr
    extension (struct: curl_slist)
      def data: CString = struct._1
      def data_=(value: CString): Unit = !struct.at1 = value
      def next: Ptr[curl_slist] = struct._2.asInstanceOf[Ptr[curl_slist]]
      def next_=(value: Ptr[curl_slist]): Unit = !struct.at2 =
        value.asInstanceOf[Ptr[Byte]]
  end curl_slist

  opaque type curl_sockaddr = CStruct5[CInt, CInt, CInt, CUnsignedInt, sockaddr]
  object curl_sockaddr:
    given _tag: Tag[curl_sockaddr] =
      Tag.materializeCStruct5Tag[CInt, CInt, CInt, CUnsignedInt, sockaddr]
    def apply()(using Zone): Ptr[curl_sockaddr] =
      scala.scalanative.unsafe.alloc[curl_sockaddr](1)
    def apply(
        family: CInt,
        socktype: CInt,
        protocol: CInt,
        addrlen: CUnsignedInt,
        addr: sockaddr
    )(using Zone): Ptr[curl_sockaddr] =
      val ____ptr = apply()
      (!____ptr).family = family
      (!____ptr).socktype = socktype
      (!____ptr).protocol = protocol
      (!____ptr).addrlen = addrlen
      (!____ptr).addr = addr
      ____ptr
    end apply
    extension (struct: curl_sockaddr)
      def family: CInt = struct._1
      def family_=(value: CInt): Unit = !struct.at1 = value
      def socktype: CInt = struct._2
      def socktype_=(value: CInt): Unit = !struct.at2 = value
      def protocol: CInt = struct._3
      def protocol_=(value: CInt): Unit = !struct.at3 = value
      def addrlen: CUnsignedInt = struct._4
      def addrlen_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def addr: sockaddr = struct._5
      def addr_=(value: sockaddr): Unit = !struct.at5 = value
    end extension
  end curl_sockaddr

  opaque type curl_ssl_backend = CStruct2[curl_sslbackend, CString]
  object curl_ssl_backend:
    given _tag: Tag[curl_ssl_backend] =
      Tag.materializeCStruct2Tag[curl_sslbackend, CString]
    def apply()(using Zone): Ptr[curl_ssl_backend] =
      scala.scalanative.unsafe.alloc[curl_ssl_backend](1)
    def apply(id: curl_sslbackend, name: CString)(using
        Zone
    ): Ptr[curl_ssl_backend] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).name = name
      ____ptr
    extension (struct: curl_ssl_backend)
      def id: curl_sslbackend = struct._1
      def id_=(value: curl_sslbackend): Unit = !struct.at1 = value
      def name: CString = struct._2
      def name_=(value: CString): Unit = !struct.at2 = value
  end curl_ssl_backend

  opaque type curl_tlssessioninfo = CStruct2[curl_sslbackend, Ptr[Byte]]
  object curl_tlssessioninfo:
    given _tag: Tag[curl_tlssessioninfo] =
      Tag.materializeCStruct2Tag[curl_sslbackend, Ptr[Byte]]
    def apply()(using Zone): Ptr[curl_tlssessioninfo] =
      scala.scalanative.unsafe.alloc[curl_tlssessioninfo](1)
    def apply(backend: curl_sslbackend, internals: Ptr[Byte])(using
        Zone
    ): Ptr[curl_tlssessioninfo] =
      val ____ptr = apply()
      (!____ptr).backend = backend
      (!____ptr).internals = internals
      ____ptr
    extension (struct: curl_tlssessioninfo)
      def backend: curl_sslbackend = struct._1
      def backend_=(value: curl_sslbackend): Unit = !struct.at1 = value
      def internals: Ptr[Byte] = struct._2
      def internals_=(value: Ptr[Byte]): Unit = !struct.at2 = value
  end curl_tlssessioninfo

  opaque type curl_version_info_data =
    CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._8]]
  object curl_version_info_data:
    given _tag: Tag[curl_version_info_data] =
      Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._8]](
        Tag.Byte,
        Tag.Digit3[Nat._2, Nat._0, Nat._8](Tag.Nat2, Tag.Nat0, Tag.Nat8)
      )
    def apply()(using Zone): Ptr[curl_version_info_data] =
      scala.scalanative.unsafe.alloc[curl_version_info_data](1)
    def apply(
        age: CURLversion,
        version: CString,
        version_num: CUnsignedInt,
        host: CString,
        features: CInt,
        ssl_version: CString,
        ssl_version_num: CLongInt,
        libz_version: CString,
        protocols: Ptr[CString],
        ares: CString,
        ares_num: CInt,
        libidn: CString,
        iconv_ver_num: CInt,
        libssh_version: CString,
        brotli_ver_num: CUnsignedInt,
        brotli_version: CString,
        nghttp2_ver_num: CUnsignedInt,
        nghttp2_version: CString,
        quic_version: CString,
        cainfo: CString,
        capath: CString,
        zstd_ver_num: CUnsignedInt,
        zstd_version: CString,
        hyper_version: CString,
        gsasl_version: CString,
        feature_names: Ptr[CString]
    )(using Zone): Ptr[curl_version_info_data] =
      val ____ptr = apply()
      (!____ptr).age = age
      (!____ptr).version = version
      (!____ptr).version_num = version_num
      (!____ptr).host = host
      (!____ptr).features = features
      (!____ptr).ssl_version = ssl_version
      (!____ptr).ssl_version_num = ssl_version_num
      (!____ptr).libz_version = libz_version
      (!____ptr).protocols = protocols
      (!____ptr).ares = ares
      (!____ptr).ares_num = ares_num
      (!____ptr).libidn = libidn
      (!____ptr).iconv_ver_num = iconv_ver_num
      (!____ptr).libssh_version = libssh_version
      (!____ptr).brotli_ver_num = brotli_ver_num
      (!____ptr).brotli_version = brotli_version
      (!____ptr).nghttp2_ver_num = nghttp2_ver_num
      (!____ptr).nghttp2_version = nghttp2_version
      (!____ptr).quic_version = quic_version
      (!____ptr).cainfo = cainfo
      (!____ptr).capath = capath
      (!____ptr).zstd_ver_num = zstd_ver_num
      (!____ptr).zstd_version = zstd_version
      (!____ptr).hyper_version = hyper_version
      (!____ptr).gsasl_version = gsasl_version
      (!____ptr).feature_names = feature_names
      ____ptr
    end apply
    extension (struct: curl_version_info_data)
      def age: CURLversion = !struct.at(0).asInstanceOf[Ptr[CURLversion]]
      def age_=(value: CURLversion): Unit =
        !struct.at(0).asInstanceOf[Ptr[CURLversion]] = value
      def version: CString = !struct.at(8).asInstanceOf[Ptr[CString]]
      def version_=(value: CString): Unit =
        !struct.at(8).asInstanceOf[Ptr[CString]] = value
      def version_num: CUnsignedInt =
        !struct.at(16).asInstanceOf[Ptr[CUnsignedInt]]
      def version_num_=(value: CUnsignedInt): Unit =
        !struct.at(16).asInstanceOf[Ptr[CUnsignedInt]] = value
      def host: CString = !struct.at(24).asInstanceOf[Ptr[CString]]
      def host_=(value: CString): Unit =
        !struct.at(24).asInstanceOf[Ptr[CString]] = value
      def features: CInt = !struct.at(32).asInstanceOf[Ptr[CInt]]
      def features_=(value: CInt): Unit =
        !struct.at(32).asInstanceOf[Ptr[CInt]] = value
      def ssl_version: CString = !struct.at(40).asInstanceOf[Ptr[CString]]
      def ssl_version_=(value: CString): Unit =
        !struct.at(40).asInstanceOf[Ptr[CString]] = value
      def ssl_version_num: CLongInt = !struct.at(48).asInstanceOf[Ptr[CLongInt]]
      def ssl_version_num_=(value: CLongInt): Unit =
        !struct.at(48).asInstanceOf[Ptr[CLongInt]] = value
      def libz_version: CString = !struct.at(56).asInstanceOf[Ptr[CString]]
      def libz_version_=(value: CString): Unit =
        !struct.at(56).asInstanceOf[Ptr[CString]] = value
      def protocols: Ptr[CString] =
        !struct.at(64).asInstanceOf[Ptr[Ptr[CString]]]
      def protocols_=(value: Ptr[CString]): Unit =
        !struct.at(64).asInstanceOf[Ptr[Ptr[CString]]] = value
      def ares: CString = !struct.at(72).asInstanceOf[Ptr[CString]]
      def ares_=(value: CString): Unit =
        !struct.at(72).asInstanceOf[Ptr[CString]] = value
      def ares_num: CInt = !struct.at(80).asInstanceOf[Ptr[CInt]]
      def ares_num_=(value: CInt): Unit =
        !struct.at(80).asInstanceOf[Ptr[CInt]] = value
      def libidn: CString = !struct.at(88).asInstanceOf[Ptr[CString]]
      def libidn_=(value: CString): Unit =
        !struct.at(88).asInstanceOf[Ptr[CString]] = value
      def iconv_ver_num: CInt = !struct.at(96).asInstanceOf[Ptr[CInt]]
      def iconv_ver_num_=(value: CInt): Unit =
        !struct.at(96).asInstanceOf[Ptr[CInt]] = value
      def libssh_version: CString = !struct.at(104).asInstanceOf[Ptr[CString]]
      def libssh_version_=(value: CString): Unit =
        !struct.at(104).asInstanceOf[Ptr[CString]] = value
      def brotli_ver_num: CUnsignedInt =
        !struct.at(112).asInstanceOf[Ptr[CUnsignedInt]]
      def brotli_ver_num_=(value: CUnsignedInt): Unit =
        !struct.at(112).asInstanceOf[Ptr[CUnsignedInt]] = value
      def brotli_version: CString = !struct.at(120).asInstanceOf[Ptr[CString]]
      def brotli_version_=(value: CString): Unit =
        !struct.at(120).asInstanceOf[Ptr[CString]] = value
      def nghttp2_ver_num: CUnsignedInt =
        !struct.at(128).asInstanceOf[Ptr[CUnsignedInt]]
      def nghttp2_ver_num_=(value: CUnsignedInt): Unit =
        !struct.at(128).asInstanceOf[Ptr[CUnsignedInt]] = value
      def nghttp2_version: CString = !struct.at(136).asInstanceOf[Ptr[CString]]
      def nghttp2_version_=(value: CString): Unit =
        !struct.at(136).asInstanceOf[Ptr[CString]] = value
      def quic_version: CString = !struct.at(144).asInstanceOf[Ptr[CString]]
      def quic_version_=(value: CString): Unit =
        !struct.at(144).asInstanceOf[Ptr[CString]] = value
      def cainfo: CString = !struct.at(152).asInstanceOf[Ptr[CString]]
      def cainfo_=(value: CString): Unit =
        !struct.at(152).asInstanceOf[Ptr[CString]] = value
      def capath: CString = !struct.at(160).asInstanceOf[Ptr[CString]]
      def capath_=(value: CString): Unit =
        !struct.at(160).asInstanceOf[Ptr[CString]] = value
      def zstd_ver_num: CUnsignedInt =
        !struct.at(168).asInstanceOf[Ptr[CUnsignedInt]]
      def zstd_ver_num_=(value: CUnsignedInt): Unit =
        !struct.at(168).asInstanceOf[Ptr[CUnsignedInt]] = value
      def zstd_version: CString = !struct.at(176).asInstanceOf[Ptr[CString]]
      def zstd_version_=(value: CString): Unit =
        !struct.at(176).asInstanceOf[Ptr[CString]] = value
      def hyper_version: CString = !struct.at(184).asInstanceOf[Ptr[CString]]
      def hyper_version_=(value: CString): Unit =
        !struct.at(184).asInstanceOf[Ptr[CString]] = value
      def gsasl_version: CString = !struct.at(192).asInstanceOf[Ptr[CString]]
      def gsasl_version_=(value: CString): Unit =
        !struct.at(192).asInstanceOf[Ptr[CString]] = value
      def feature_names: Ptr[CString] =
        !struct.at(200).asInstanceOf[Ptr[Ptr[CString]]]
      def feature_names_=(value: Ptr[CString]): Unit =
        !struct.at(200).asInstanceOf[Ptr[Ptr[CString]]] = value
    end extension
  end curl_version_info_data

  opaque type curl_waitfd = CStruct3[curl_socket_t, CShort, CShort]
  object curl_waitfd:
    given _tag: Tag[curl_waitfd] =
      Tag.materializeCStruct3Tag[curl_socket_t, CShort, CShort]
    def apply()(using Zone): Ptr[curl_waitfd] =
      scala.scalanative.unsafe.alloc[curl_waitfd](1)
    def apply(fd: curl_socket_t, events: CShort, revents: CShort)(using
        Zone
    ): Ptr[curl_waitfd] =
      val ____ptr = apply()
      (!____ptr).fd = fd
      (!____ptr).events = events
      (!____ptr).revents = revents
      ____ptr
    extension (struct: curl_waitfd)
      def fd: curl_socket_t = struct._1
      def fd_=(value: curl_socket_t): Unit = !struct.at1 = value
      def events: CShort = struct._2
      def events_=(value: CShort): Unit = !struct.at2 = value
      def revents: CShort = struct._3
      def revents_=(value: CShort): Unit = !struct.at3 = value
  end curl_waitfd

  opaque type curl_ws_frame =
    CStruct5[CInt, CInt, curl_off_t, curl_off_t, size_t]
  object curl_ws_frame:
    given _tag: Tag[curl_ws_frame] =
      Tag.materializeCStruct5Tag[CInt, CInt, curl_off_t, curl_off_t, size_t]
    def apply()(using Zone): Ptr[curl_ws_frame] =
      scala.scalanative.unsafe.alloc[curl_ws_frame](1)
    def apply(
        age: CInt,
        flags: CInt,
        offset: curl_off_t,
        bytesleft: curl_off_t,
        len: size_t
    )(using Zone): Ptr[curl_ws_frame] =
      val ____ptr = apply()
      (!____ptr).age = age
      (!____ptr).flags = flags
      (!____ptr).offset = offset
      (!____ptr).bytesleft = bytesleft
      (!____ptr).len = len
      ____ptr
    end apply
    extension (struct: curl_ws_frame)
      def age: CInt = struct._1
      def age_=(value: CInt): Unit = !struct.at1 = value
      def flags: CInt = struct._2
      def flags_=(value: CInt): Unit = !struct.at2 = value
      def offset: curl_off_t = struct._3
      def offset_=(value: curl_off_t): Unit = !struct.at3 = value
      def bytesleft: curl_off_t = struct._4
      def bytesleft_=(value: curl_off_t): Unit = !struct.at4 = value
      def len: size_t = struct._5
      def len_=(value: size_t): Unit = !struct.at5 = value
    end extension
  end curl_ws_frame
end structs

@extern
private[curl] object extern_functions:
  import _root_.curl.enumerations.*
  import _root_.curl.predef.*
  import _root_.curl.aliases.*
  import _root_.curl.structs.*
  def curl_easy_cleanup(curl: Ptr[CURL]): Unit = extern

  def curl_easy_duphandle(curl: Ptr[CURL]): Ptr[CURL] = extern

  def curl_easy_escape(
      handle: Ptr[CURL],
      string: CString,
      length: CInt
  ): CString = extern

  def curl_easy_getinfo(curl: Ptr[CURL], info: CURLINFO, rest: Any*): CURLcode =
    extern

  def curl_easy_header(
      easy: Ptr[CURL],
      name: CString,
      index: size_t,
      origin: CUnsignedInt,
      request: CInt,
      hout: Ptr[Ptr[curl_header]]
  ): CURLHcode = extern

  def curl_easy_init(): Ptr[CURL] = extern

  def curl_easy_nextheader(
      easy: Ptr[CURL],
      origin: CUnsignedInt,
      request: CInt,
      prev: Ptr[curl_header]
  ): Ptr[curl_header] = extern

  def curl_easy_option_by_id(id: CURLoption): Ptr[curl_easyoption] = extern

  def curl_easy_option_by_name(name: CString): Ptr[curl_easyoption] = extern

  def curl_easy_option_next(prev: Ptr[curl_easyoption]): Ptr[curl_easyoption] =
    extern

  def curl_easy_pause(handle: Ptr[CURL], bitmask: CInt): CURLcode = extern

  def curl_easy_perform(curl: Ptr[CURL]): CURLcode = extern

  def curl_easy_recv(
      curl: Ptr[CURL],
      buffer: Ptr[Byte],
      buflen: size_t,
      n: Ptr[size_t]
  ): CURLcode = extern

  def curl_easy_reset(curl: Ptr[CURL]): Unit = extern

  def curl_easy_send(
      curl: Ptr[CURL],
      buffer: Ptr[Byte],
      buflen: size_t,
      n: Ptr[size_t]
  ): CURLcode = extern

  def curl_easy_setopt(
      curl: Ptr[CURL],
      option: CURLoption,
      rest: Any*
  ): CURLcode = extern

  def curl_easy_strerror(_0: CURLcode): CString = extern

  def curl_easy_unescape(
      handle: Ptr[CURL],
      string: CString,
      length: CInt,
      outlength: Ptr[CInt]
  ): CString = extern

  def curl_easy_upkeep(curl: Ptr[CURL]): CURLcode = extern

  def curl_escape(string: CString, length: CInt): CString = extern

  def curl_formadd(
      httppost: Ptr[Ptr[curl_httppost]],
      last_post: Ptr[Ptr[curl_httppost]],
      rest: Any*
  ): CURLFORMcode = extern

  def curl_formfree(form: Ptr[curl_httppost]): Unit = extern

  def curl_formget(
      form: Ptr[curl_httppost],
      arg: Ptr[Byte],
      append: curl_formget_callback
  ): CInt = extern

  def curl_free(p: Ptr[Byte]): Unit = extern

  def curl_getdate(p: CString, unused: Ptr[time_t]): time_t = extern

  def curl_getenv(variable: CString): CString = extern

  def curl_global_cleanup(): Unit = extern

  def curl_global_init(flags: CLongInt): CURLcode = extern

  def curl_global_init_mem(
      flags: CLongInt,
      m: curl_malloc_callback,
      f: curl_free_callback,
      r: curl_realloc_callback,
      s: curl_strdup_callback,
      c: curl_calloc_callback
  ): CURLcode = extern

  def curl_global_sslset(
      id: curl_sslbackend,
      name: CString,
      avail: Ptr[Ptr[Ptr[curl_ssl_backend]]]
  ): CURLsslset = extern

  def curl_global_trace(config: CString): CURLcode = extern

  def curl_mime_addpart(mime: Ptr[curl_mime]): Ptr[curl_mimepart] = extern

  def curl_mime_data(
      part: Ptr[curl_mimepart],
      data: CString,
      datasize: size_t
  ): CURLcode = extern

  def curl_mime_data_cb(
      part: Ptr[curl_mimepart],
      datasize: curl_off_t,
      readfunc: curl_read_callback,
      seekfunc: curl_seek_callback,
      freefunc: curl_free_callback,
      arg: Ptr[Byte]
  ): CURLcode = extern

  def curl_mime_encoder(part: Ptr[curl_mimepart], encoding: CString): CURLcode =
    extern

  def curl_mime_filedata(
      part: Ptr[curl_mimepart],
      filename: CString
  ): CURLcode = extern

  def curl_mime_filename(
      part: Ptr[curl_mimepart],
      filename: CString
  ): CURLcode = extern

  def curl_mime_free(mime: Ptr[curl_mime]): Unit = extern

  def curl_mime_headers(
      part: Ptr[curl_mimepart],
      headers: Ptr[curl_slist],
      take_ownership: CInt
  ): CURLcode = extern

  def curl_mime_init(easy: Ptr[CURL]): Ptr[curl_mime] = extern

  def curl_mime_name(part: Ptr[curl_mimepart], name: CString): CURLcode = extern

  def curl_mime_subparts(
      part: Ptr[curl_mimepart],
      subparts: Ptr[curl_mime]
  ): CURLcode = extern

  def curl_mime_type(part: Ptr[curl_mimepart], mimetype: CString): CURLcode =
    extern

  def curl_multi_add_handle(
      multi_handle: Ptr[CURLM],
      curl_handle: Ptr[CURL]
  ): CURLMcode = extern

  def curl_multi_assign(
      multi_handle: Ptr[CURLM],
      sockfd: curl_socket_t,
      sockp: Ptr[Byte]
  ): CURLMcode = extern

  def curl_multi_cleanup(multi_handle: Ptr[CURLM]): CURLMcode = extern

  def curl_multi_fdset(
      multi_handle: Ptr[CURLM],
      read_fd_set: Ptr[fd_set],
      write_fd_set: Ptr[fd_set],
      exc_fd_set: Ptr[fd_set],
      max_fd: Ptr[CInt]
  ): CURLMcode = extern

  def curl_multi_get_handles(multi_handle: Ptr[CURLM]): Ptr[Ptr[CURL]] = extern

  def curl_multi_info_read(
      multi_handle: Ptr[CURLM],
      msgs_in_queue: Ptr[CInt]
  ): Ptr[CURLMsg] = extern

  def curl_multi_init(): Ptr[CURLM] = extern

  def curl_multi_perform(
      multi_handle: Ptr[CURLM],
      running_handles: Ptr[CInt]
  ): CURLMcode = extern

  def curl_multi_poll(
      multi_handle: Ptr[CURLM],
      extra_fds: Ptr[curl_waitfd],
      extra_nfds: CUnsignedInt,
      timeout_ms: CInt,
      ret: Ptr[CInt]
  ): CURLMcode = extern

  def curl_multi_remove_handle(
      multi_handle: Ptr[CURLM],
      curl_handle: Ptr[CURL]
  ): CURLMcode = extern

  def curl_multi_setopt(
      multi_handle: Ptr[CURLM],
      option: CURLMoption,
      rest: Any*
  ): CURLMcode = extern

  def curl_multi_socket(
      multi_handle: Ptr[CURLM],
      s: curl_socket_t,
      running_handles: Ptr[CInt]
  ): CURLMcode = extern

  def curl_multi_socket_action(
      multi_handle: Ptr[CURLM],
      s: curl_socket_t,
      ev_bitmask: CInt,
      running_handles: Ptr[CInt]
  ): CURLMcode = extern

  def curl_multi_socket_all(
      multi_handle: Ptr[CURLM],
      running_handles: Ptr[CInt]
  ): CURLMcode = extern

  def curl_multi_strerror(_0: CURLMcode): CString = extern

  def curl_multi_timeout(
      multi_handle: Ptr[CURLM],
      milliseconds: Ptr[CLongInt]
  ): CURLMcode = extern

  def curl_multi_wait(
      multi_handle: Ptr[CURLM],
      extra_fds: Ptr[curl_waitfd],
      extra_nfds: CUnsignedInt,
      timeout_ms: CInt,
      ret: Ptr[CInt]
  ): CURLMcode = extern

  def curl_multi_wakeup(multi_handle: Ptr[CURLM]): CURLMcode = extern

  def curl_pushheader_byname(h: Ptr[curl_pushheaders], name: CString): CString =
    extern

  def curl_pushheader_bynum(h: Ptr[curl_pushheaders], num: size_t): CString =
    extern

  def curl_share_cleanup(share: Ptr[CURLSH]): CURLSHcode = extern

  def curl_share_init(): Ptr[CURLSH] = extern

  def curl_share_setopt(
      share: Ptr[CURLSH],
      option: CURLSHoption,
      rest: Any*
  ): CURLSHcode = extern

  def curl_share_strerror(_0: CURLSHcode): CString = extern

  def curl_slist_append(list: Ptr[curl_slist], data: CString): Ptr[curl_slist] =
    extern

  def curl_slist_free_all(list: Ptr[curl_slist]): Unit = extern

  def curl_strequal(s1: CString, s2: CString): CInt = extern

  def curl_strnequal(s1: CString, s2: CString, n: size_t): CInt = extern

  def curl_unescape(string: CString, length: CInt): CString = extern

  def curl_url(): Ptr[CURLU] = extern

  def curl_url_cleanup(handle: Ptr[CURLU]): Unit = extern

  def curl_url_dup(in: Ptr[CURLU]): Ptr[CURLU] = extern

  def curl_url_get(
      handle: Ptr[CURLU],
      what: CURLUPart,
      part: Ptr[CString],
      flags: CUnsignedInt
  ): CURLUcode = extern

  def curl_url_set(
      handle: Ptr[CURLU],
      what: CURLUPart,
      part: CString,
      flags: CUnsignedInt
  ): CURLUcode = extern

  def curl_url_strerror(_0: CURLUcode): CString = extern

  def curl_version(): CString = extern

  def curl_version_info(_0: CURLversion): Ptr[curl_version_info_data] = extern

  def curl_ws_meta(curl: Ptr[CURL]): Ptr[curl_ws_frame] = extern

  def curl_ws_recv(
      curl: Ptr[CURL],
      buffer: Ptr[Byte],
      buflen: size_t,
      recv: Ptr[size_t],
      metap: Ptr[Ptr[curl_ws_frame]]
  ): CURLcode = extern

  def curl_ws_send(
      curl: Ptr[CURL],
      buffer: Ptr[Byte],
      buflen: size_t,
      sent: Ptr[size_t],
      fragsize: curl_off_t,
      flags: CUnsignedInt
  ): CURLcode = extern
end extern_functions

object functions:
  import _root_.curl.enumerations.*
  import _root_.curl.predef.*
  import _root_.curl.aliases.*
  import _root_.curl.structs.*
  import extern_functions.*
  export extern_functions.*

object constants:
  val CURL_HTTP_VERSION_NONE: CUnsignedInt = 0.toUInt
  val CURL_HTTP_VERSION_1_0: CUnsignedInt = 1.toUInt
  val CURL_HTTP_VERSION_1_1: CUnsignedInt = 2.toUInt
  val CURL_HTTP_VERSION_2_0: CUnsignedInt = 3.toUInt
  val CURL_HTTP_VERSION_2TLS: CUnsignedInt = 4.toUInt
  val CURL_HTTP_VERSION_2_PRIOR_KNOWLEDGE: CUnsignedInt = 5.toUInt
  val CURL_HTTP_VERSION_3: CUnsignedInt = 30.toUInt
  val CURL_HTTP_VERSION_3ONLY: CUnsignedInt = 31.toUInt
  val CURL_HTTP_VERSION_LAST: CUnsignedInt = 32.toUInt

  val CURL_RTSPREQ_NONE: CUnsignedInt = 0.toUInt
  val CURL_RTSPREQ_OPTIONS: CUnsignedInt = 1.toUInt
  val CURL_RTSPREQ_DESCRIBE: CUnsignedInt = 2.toUInt
  val CURL_RTSPREQ_ANNOUNCE: CUnsignedInt = 3.toUInt
  val CURL_RTSPREQ_SETUP: CUnsignedInt = 4.toUInt
  val CURL_RTSPREQ_PLAY: CUnsignedInt = 5.toUInt
  val CURL_RTSPREQ_PAUSE: CUnsignedInt = 6.toUInt
  val CURL_RTSPREQ_TEARDOWN: CUnsignedInt = 7.toUInt
  val CURL_RTSPREQ_GET_PARAMETER: CUnsignedInt = 8.toUInt
  val CURL_RTSPREQ_SET_PARAMETER: CUnsignedInt = 9.toUInt
  val CURL_RTSPREQ_RECORD: CUnsignedInt = 10.toUInt
  val CURL_RTSPREQ_RECEIVE: CUnsignedInt = 11.toUInt
  val CURL_RTSPREQ_LAST: CUnsignedInt = 12.toUInt

  val CURL_SSLVERSION_DEFAULT: CUnsignedInt = 0.toUInt
  val CURL_SSLVERSION_TLSv1: CUnsignedInt = 1.toUInt
  val CURL_SSLVERSION_SSLv2: CUnsignedInt = 2.toUInt
  val CURL_SSLVERSION_SSLv3: CUnsignedInt = 3.toUInt
  val CURL_SSLVERSION_TLSv1_0: CUnsignedInt = 4.toUInt
  val CURL_SSLVERSION_TLSv1_1: CUnsignedInt = 5.toUInt
  val CURL_SSLVERSION_TLSv1_2: CUnsignedInt = 6.toUInt
  val CURL_SSLVERSION_TLSv1_3: CUnsignedInt = 7.toUInt
  val CURL_SSLVERSION_LAST: CUnsignedInt = 8.toUInt

  val CURL_SSLVERSION_MAX_NONE: CUnsignedInt = 0.toUInt
  val CURL_SSLVERSION_MAX_DEFAULT: CUnsignedInt = 65536.toUInt
  val CURL_SSLVERSION_MAX_TLSv1_0: CUnsignedInt = 262144.toUInt
  val CURL_SSLVERSION_MAX_TLSv1_1: CUnsignedInt = 327680.toUInt
  val CURL_SSLVERSION_MAX_TLSv1_2: CUnsignedInt = 393216.toUInt
  val CURL_SSLVERSION_MAX_TLSv1_3: CUnsignedInt = 458752.toUInt
  val CURL_SSLVERSION_MAX_LAST: CUnsignedInt = 524288.toUInt
end constants

object types:
  export _root_.curl.structs.*
  export _root_.curl.aliases.*
  export _root_.curl.enumerations.*

object all:
  export _root_.curl.enumerations.CURLFORMcode
  export _root_.curl.enumerations.CURLHcode
  export _root_.curl.enumerations.CURLINFO
  export _root_.curl.enumerations.CURLMSG
  export _root_.curl.enumerations.CURLMcode
  export _root_.curl.enumerations.CURLMoption
  export _root_.curl.enumerations.CURLSHcode
  export _root_.curl.enumerations.CURLSHoption
  export _root_.curl.enumerations.CURLSTScode
  export _root_.curl.enumerations.CURLUPart
  export _root_.curl.enumerations.CURLUcode
  export _root_.curl.enumerations.CURL_NETRC_OPTION
  export _root_.curl.enumerations.CURL_TLSAUTH
  export _root_.curl.enumerations.CURLcode
  export _root_.curl.enumerations.CURLformoption
  export _root_.curl.enumerations.CURLoption
  export _root_.curl.enumerations.CURLproxycode
  export _root_.curl.enumerations.CURLsslset
  export _root_.curl.enumerations.CURLversion
  export _root_.curl.enumerations.curl_TimeCond
  export _root_.curl.enumerations.curl_closepolicy
  export _root_.curl.enumerations.curl_easytype
  export _root_.curl.enumerations.curl_ftpauth
  export _root_.curl.enumerations.curl_ftpccc
  export _root_.curl.enumerations.curl_ftpcreatedir
  export _root_.curl.enumerations.curl_ftpmethod
  export _root_.curl.enumerations.curl_infotype
  export _root_.curl.enumerations.curl_khmatch
  export _root_.curl.enumerations.curl_khstat
  export _root_.curl.enumerations.curl_khtype
  export _root_.curl.enumerations.curl_lock_access
  export _root_.curl.enumerations.curl_lock_data
  export _root_.curl.enumerations.curl_proxytype
  export _root_.curl.enumerations.curl_sslbackend
  export _root_.curl.enumerations.curl_usessl
  export _root_.curl.enumerations.curlfiletype
  export _root_.curl.enumerations.curliocmd
  export _root_.curl.enumerations.curlioerr
  export _root_.curl.enumerations.curlsocktype
  export _root_.curl.aliases.CURL
  export _root_.curl.aliases.CURLM
  export _root_.curl.aliases.CURLSH
  export _root_.curl.aliases.curl_calloc_callback
  export _root_.curl.aliases.curl_chunk_bgn_callback
  export _root_.curl.aliases.curl_chunk_end_callback
  export _root_.curl.aliases.curl_closesocket_callback
  export _root_.curl.aliases.curl_conv_callback
  export _root_.curl.aliases.curl_debug_callback
  export _root_.curl.aliases.curl_fnmatch_callback
  export _root_.curl.aliases.curl_formget_callback
  export _root_.curl.aliases.curl_free_callback
  export _root_.curl.aliases.curl_hstsread_callback
  export _root_.curl.aliases.curl_hstswrite_callback
  export _root_.curl.aliases.curl_ioctl_callback
  export _root_.curl.aliases.curl_lock_function
  export _root_.curl.aliases.curl_malloc_callback
  export _root_.curl.aliases.curl_multi_timer_callback
  export _root_.curl.aliases.curl_off_t
  export _root_.curl.aliases.curl_opensocket_callback
  export _root_.curl.aliases.curl_prereq_callback
  export _root_.curl.aliases.curl_progress_callback
  export _root_.curl.aliases.curl_push_callback
  export _root_.curl.aliases.curl_read_callback
  export _root_.curl.aliases.curl_realloc_callback
  export _root_.curl.aliases.curl_resolver_start_callback
  export _root_.curl.aliases.curl_seek_callback
  export _root_.curl.aliases.curl_socket_callback
  export _root_.curl.aliases.curl_socket_t
  export _root_.curl.aliases.curl_socklen_t
  export _root_.curl.aliases.curl_sockopt_callback
  export _root_.curl.aliases.curl_sshhostkeycallback
  export _root_.curl.aliases.curl_sshkeycallback
  export _root_.curl.aliases.curl_ssl_ctx_callback
  export _root_.curl.aliases.curl_strdup_callback
  export _root_.curl.aliases.curl_trailer_callback
  export _root_.curl.aliases.curl_unlock_function
  export _root_.curl.aliases.curl_write_callback
  export _root_.curl.aliases.curl_xferinfo_callback
  export _root_.curl.aliases.fd_set
  export _root_.curl.aliases.size_t
  export _root_.curl.aliases.sockaddr
  export _root_.curl.aliases.socklen_t
  export _root_.curl.aliases.time_t
  export _root_.curl.structs.CURLMsg
  export _root_.curl.structs.CURLU
  export _root_.curl.structs.Curl_URL
  export _root_.curl.structs.curl_blob
  export _root_.curl.structs.curl_certinfo
  export _root_.curl.structs.curl_easyoption
  export _root_.curl.structs.curl_fileinfo
  export _root_.curl.structs.curl_forms
  export _root_.curl.structs.curl_header
  export _root_.curl.structs.curl_hstsentry
  export _root_.curl.structs.curl_httppost
  export _root_.curl.structs.curl_index
  export _root_.curl.structs.curl_khkey
  export _root_.curl.structs.curl_mime
  export _root_.curl.structs.curl_mimepart
  export _root_.curl.structs.curl_pushheaders
  export _root_.curl.structs.curl_slist
  export _root_.curl.structs.curl_sockaddr
  export _root_.curl.structs.curl_ssl_backend
  export _root_.curl.structs.curl_tlssessioninfo
  export _root_.curl.structs.curl_version_info_data
  export _root_.curl.structs.curl_waitfd
  export _root_.curl.structs.curl_ws_frame
  export _root_.curl.functions.curl_easy_cleanup
  export _root_.curl.functions.curl_easy_duphandle
  export _root_.curl.functions.curl_easy_escape
  export _root_.curl.functions.curl_easy_getinfo
  export _root_.curl.functions.curl_easy_header
  export _root_.curl.functions.curl_easy_init
  export _root_.curl.functions.curl_easy_nextheader
  export _root_.curl.functions.curl_easy_option_by_id
  export _root_.curl.functions.curl_easy_option_by_name
  export _root_.curl.functions.curl_easy_option_next
  export _root_.curl.functions.curl_easy_pause
  export _root_.curl.functions.curl_easy_perform
  export _root_.curl.functions.curl_easy_recv
  export _root_.curl.functions.curl_easy_reset
  export _root_.curl.functions.curl_easy_send
  export _root_.curl.functions.curl_easy_setopt
  export _root_.curl.functions.curl_easy_strerror
  export _root_.curl.functions.curl_easy_unescape
  export _root_.curl.functions.curl_easy_upkeep
  export _root_.curl.functions.curl_escape
  export _root_.curl.functions.curl_formadd
  export _root_.curl.functions.curl_formfree
  export _root_.curl.functions.curl_formget
  export _root_.curl.functions.curl_free
  export _root_.curl.functions.curl_getdate
  export _root_.curl.functions.curl_getenv
  export _root_.curl.functions.curl_global_cleanup
  export _root_.curl.functions.curl_global_init
  export _root_.curl.functions.curl_global_init_mem
  export _root_.curl.functions.curl_global_sslset
  export _root_.curl.functions.curl_global_trace
  export _root_.curl.functions.curl_mime_addpart
  export _root_.curl.functions.curl_mime_data
  export _root_.curl.functions.curl_mime_data_cb
  export _root_.curl.functions.curl_mime_encoder
  export _root_.curl.functions.curl_mime_filedata
  export _root_.curl.functions.curl_mime_filename
  export _root_.curl.functions.curl_mime_free
  export _root_.curl.functions.curl_mime_headers
  export _root_.curl.functions.curl_mime_init
  export _root_.curl.functions.curl_mime_name
  export _root_.curl.functions.curl_mime_subparts
  export _root_.curl.functions.curl_mime_type
  export _root_.curl.functions.curl_multi_add_handle
  export _root_.curl.functions.curl_multi_assign
  export _root_.curl.functions.curl_multi_cleanup
  export _root_.curl.functions.curl_multi_fdset
  export _root_.curl.functions.curl_multi_get_handles
  export _root_.curl.functions.curl_multi_info_read
  export _root_.curl.functions.curl_multi_init
  export _root_.curl.functions.curl_multi_perform
  export _root_.curl.functions.curl_multi_poll
  export _root_.curl.functions.curl_multi_remove_handle
  export _root_.curl.functions.curl_multi_setopt
  export _root_.curl.functions.curl_multi_socket
  export _root_.curl.functions.curl_multi_socket_action
  export _root_.curl.functions.curl_multi_socket_all
  export _root_.curl.functions.curl_multi_strerror
  export _root_.curl.functions.curl_multi_timeout
  export _root_.curl.functions.curl_multi_wait
  export _root_.curl.functions.curl_multi_wakeup
  export _root_.curl.functions.curl_pushheader_byname
  export _root_.curl.functions.curl_pushheader_bynum
  export _root_.curl.functions.curl_share_cleanup
  export _root_.curl.functions.curl_share_init
  export _root_.curl.functions.curl_share_setopt
  export _root_.curl.functions.curl_share_strerror
  export _root_.curl.functions.curl_slist_append
  export _root_.curl.functions.curl_slist_free_all
  export _root_.curl.functions.curl_strequal
  export _root_.curl.functions.curl_strnequal
  export _root_.curl.functions.curl_unescape
  export _root_.curl.functions.curl_url
  export _root_.curl.functions.curl_url_cleanup
  export _root_.curl.functions.curl_url_dup
  export _root_.curl.functions.curl_url_get
  export _root_.curl.functions.curl_url_set
  export _root_.curl.functions.curl_url_strerror
  export _root_.curl.functions.curl_version
  export _root_.curl.functions.curl_version_info
  export _root_.curl.functions.curl_ws_meta
  export _root_.curl.functions.curl_ws_recv
  export _root_.curl.functions.curl_ws_send
end all
