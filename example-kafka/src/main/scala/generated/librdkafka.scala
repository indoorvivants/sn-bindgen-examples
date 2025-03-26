package librdkafka

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[librdkafka] trait CEnum[T](using eq: T =:= Int):
    given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
    extension (inline t: T) 
      inline def int: CInt = eq.apply(t)
      inline def value: CInt = eq.apply(t)
  private[librdkafka] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
     inline def int: CInt = eq.apply(t).toInt
     inline def uint: CUnsignedInt = eq.apply(t)
     inline def value: CUnsignedInt = eq.apply(t)


object enumerations:
  import predef.*
  /**
   * Apache Kafka ACL operation types.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_AclOperation_t = CUnsignedInt
  object rd_kafka_AclOperation_t extends CEnumU[rd_kafka_AclOperation_t]:
    given _tag: Tag[rd_kafka_AclOperation_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_AclOperation_t = a.toUInt
    val RD_KAFKA_ACL_OPERATION_UNKNOWN = define(0)
    val RD_KAFKA_ACL_OPERATION_ANY = define(1)
    val RD_KAFKA_ACL_OPERATION_ALL = define(2)
    val RD_KAFKA_ACL_OPERATION_READ = define(3)
    val RD_KAFKA_ACL_OPERATION_WRITE = define(4)
    val RD_KAFKA_ACL_OPERATION_CREATE = define(5)
    val RD_KAFKA_ACL_OPERATION_DELETE = define(6)
    val RD_KAFKA_ACL_OPERATION_ALTER = define(7)
    val RD_KAFKA_ACL_OPERATION_DESCRIBE = define(8)
    val RD_KAFKA_ACL_OPERATION_CLUSTER_ACTION = define(9)
    val RD_KAFKA_ACL_OPERATION_DESCRIBE_CONFIGS = define(10)
    val RD_KAFKA_ACL_OPERATION_ALTER_CONFIGS = define(11)
    val RD_KAFKA_ACL_OPERATION_IDEMPOTENT_WRITE = define(12)
    val RD_KAFKA_ACL_OPERATION__CNT = define(13)
    inline def getName(inline value: rd_kafka_AclOperation_t): Option[String] =
      inline value match
        case RD_KAFKA_ACL_OPERATION_UNKNOWN => Some("RD_KAFKA_ACL_OPERATION_UNKNOWN")
        case RD_KAFKA_ACL_OPERATION_ANY => Some("RD_KAFKA_ACL_OPERATION_ANY")
        case RD_KAFKA_ACL_OPERATION_ALL => Some("RD_KAFKA_ACL_OPERATION_ALL")
        case RD_KAFKA_ACL_OPERATION_READ => Some("RD_KAFKA_ACL_OPERATION_READ")
        case RD_KAFKA_ACL_OPERATION_WRITE => Some("RD_KAFKA_ACL_OPERATION_WRITE")
        case RD_KAFKA_ACL_OPERATION_CREATE => Some("RD_KAFKA_ACL_OPERATION_CREATE")
        case RD_KAFKA_ACL_OPERATION_DELETE => Some("RD_KAFKA_ACL_OPERATION_DELETE")
        case RD_KAFKA_ACL_OPERATION_ALTER => Some("RD_KAFKA_ACL_OPERATION_ALTER")
        case RD_KAFKA_ACL_OPERATION_DESCRIBE => Some("RD_KAFKA_ACL_OPERATION_DESCRIBE")
        case RD_KAFKA_ACL_OPERATION_CLUSTER_ACTION => Some("RD_KAFKA_ACL_OPERATION_CLUSTER_ACTION")
        case RD_KAFKA_ACL_OPERATION_DESCRIBE_CONFIGS => Some("RD_KAFKA_ACL_OPERATION_DESCRIBE_CONFIGS")
        case RD_KAFKA_ACL_OPERATION_ALTER_CONFIGS => Some("RD_KAFKA_ACL_OPERATION_ALTER_CONFIGS")
        case RD_KAFKA_ACL_OPERATION_IDEMPOTENT_WRITE => Some("RD_KAFKA_ACL_OPERATION_IDEMPOTENT_WRITE")
        case RD_KAFKA_ACL_OPERATION__CNT => Some("RD_KAFKA_ACL_OPERATION__CNT")
        case _ => None
    extension (a: rd_kafka_AclOperation_t)
      inline def &(b: rd_kafka_AclOperation_t): rd_kafka_AclOperation_t = a & b
      inline def |(b: rd_kafka_AclOperation_t): rd_kafka_AclOperation_t = a | b
      inline def is(b: rd_kafka_AclOperation_t): Boolean = (a & b) == b

  /**
   * Apache Kafka ACL permission types.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_AclPermissionType_t = CUnsignedInt
  object rd_kafka_AclPermissionType_t extends CEnumU[rd_kafka_AclPermissionType_t]:
    given _tag: Tag[rd_kafka_AclPermissionType_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_AclPermissionType_t = a.toUInt
    val RD_KAFKA_ACL_PERMISSION_TYPE_UNKNOWN = define(0)
    val RD_KAFKA_ACL_PERMISSION_TYPE_ANY = define(1)
    val RD_KAFKA_ACL_PERMISSION_TYPE_DENY = define(2)
    val RD_KAFKA_ACL_PERMISSION_TYPE_ALLOW = define(3)
    val RD_KAFKA_ACL_PERMISSION_TYPE__CNT = define(4)
    inline def getName(inline value: rd_kafka_AclPermissionType_t): Option[String] =
      inline value match
        case RD_KAFKA_ACL_PERMISSION_TYPE_UNKNOWN => Some("RD_KAFKA_ACL_PERMISSION_TYPE_UNKNOWN")
        case RD_KAFKA_ACL_PERMISSION_TYPE_ANY => Some("RD_KAFKA_ACL_PERMISSION_TYPE_ANY")
        case RD_KAFKA_ACL_PERMISSION_TYPE_DENY => Some("RD_KAFKA_ACL_PERMISSION_TYPE_DENY")
        case RD_KAFKA_ACL_PERMISSION_TYPE_ALLOW => Some("RD_KAFKA_ACL_PERMISSION_TYPE_ALLOW")
        case RD_KAFKA_ACL_PERMISSION_TYPE__CNT => Some("RD_KAFKA_ACL_PERMISSION_TYPE__CNT")
        case _ => None
    extension (a: rd_kafka_AclPermissionType_t)
      inline def &(b: rd_kafka_AclPermissionType_t): rd_kafka_AclPermissionType_t = a & b
      inline def |(b: rd_kafka_AclPermissionType_t): rd_kafka_AclPermissionType_t = a | b
      inline def is(b: rd_kafka_AclPermissionType_t): Boolean = (a & b) == b

  /**
   * Apache Kafka config sources.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ConfigSource_t = CUnsignedInt
  object rd_kafka_ConfigSource_t extends CEnumU[rd_kafka_ConfigSource_t]:
    given _tag: Tag[rd_kafka_ConfigSource_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_ConfigSource_t = a.toUInt
    val RD_KAFKA_CONFIG_SOURCE_UNKNOWN_CONFIG = define(0)
    val RD_KAFKA_CONFIG_SOURCE_DYNAMIC_TOPIC_CONFIG = define(1)
    val RD_KAFKA_CONFIG_SOURCE_DYNAMIC_BROKER_CONFIG = define(2)
    val RD_KAFKA_CONFIG_SOURCE_DYNAMIC_DEFAULT_BROKER_CONFIG = define(3)
    val RD_KAFKA_CONFIG_SOURCE_STATIC_BROKER_CONFIG = define(4)
    val RD_KAFKA_CONFIG_SOURCE_DEFAULT_CONFIG = define(5)
    val RD_KAFKA_CONFIG_SOURCE__CNT = define(6)
    inline def getName(inline value: rd_kafka_ConfigSource_t): Option[String] =
      inline value match
        case RD_KAFKA_CONFIG_SOURCE_UNKNOWN_CONFIG => Some("RD_KAFKA_CONFIG_SOURCE_UNKNOWN_CONFIG")
        case RD_KAFKA_CONFIG_SOURCE_DYNAMIC_TOPIC_CONFIG => Some("RD_KAFKA_CONFIG_SOURCE_DYNAMIC_TOPIC_CONFIG")
        case RD_KAFKA_CONFIG_SOURCE_DYNAMIC_BROKER_CONFIG => Some("RD_KAFKA_CONFIG_SOURCE_DYNAMIC_BROKER_CONFIG")
        case RD_KAFKA_CONFIG_SOURCE_DYNAMIC_DEFAULT_BROKER_CONFIG => Some("RD_KAFKA_CONFIG_SOURCE_DYNAMIC_DEFAULT_BROKER_CONFIG")
        case RD_KAFKA_CONFIG_SOURCE_STATIC_BROKER_CONFIG => Some("RD_KAFKA_CONFIG_SOURCE_STATIC_BROKER_CONFIG")
        case RD_KAFKA_CONFIG_SOURCE_DEFAULT_CONFIG => Some("RD_KAFKA_CONFIG_SOURCE_DEFAULT_CONFIG")
        case RD_KAFKA_CONFIG_SOURCE__CNT => Some("RD_KAFKA_CONFIG_SOURCE__CNT")
        case _ => None
    extension (a: rd_kafka_ConfigSource_t)
      inline def &(b: rd_kafka_ConfigSource_t): rd_kafka_ConfigSource_t = a & b
      inline def |(b: rd_kafka_ConfigSource_t): rd_kafka_ConfigSource_t = a | b
      inline def is(b: rd_kafka_ConfigSource_t): Boolean = (a & b) == b

  /**
   * Apache Kafka pattern types
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ResourcePatternType_t = CUnsignedInt
  object rd_kafka_ResourcePatternType_t extends CEnumU[rd_kafka_ResourcePatternType_t]:
    given _tag: Tag[rd_kafka_ResourcePatternType_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_ResourcePatternType_t = a.toUInt
    val RD_KAFKA_RESOURCE_PATTERN_UNKNOWN = define(0)
    val RD_KAFKA_RESOURCE_PATTERN_ANY = define(1)
    val RD_KAFKA_RESOURCE_PATTERN_MATCH = define(2)
    val RD_KAFKA_RESOURCE_PATTERN_LITERAL = define(3)
    val RD_KAFKA_RESOURCE_PATTERN_PREFIXED = define(4)
    val RD_KAFKA_RESOURCE_PATTERN_TYPE__CNT = define(5)
    inline def getName(inline value: rd_kafka_ResourcePatternType_t): Option[String] =
      inline value match
        case RD_KAFKA_RESOURCE_PATTERN_UNKNOWN => Some("RD_KAFKA_RESOURCE_PATTERN_UNKNOWN")
        case RD_KAFKA_RESOURCE_PATTERN_ANY => Some("RD_KAFKA_RESOURCE_PATTERN_ANY")
        case RD_KAFKA_RESOURCE_PATTERN_MATCH => Some("RD_KAFKA_RESOURCE_PATTERN_MATCH")
        case RD_KAFKA_RESOURCE_PATTERN_LITERAL => Some("RD_KAFKA_RESOURCE_PATTERN_LITERAL")
        case RD_KAFKA_RESOURCE_PATTERN_PREFIXED => Some("RD_KAFKA_RESOURCE_PATTERN_PREFIXED")
        case RD_KAFKA_RESOURCE_PATTERN_TYPE__CNT => Some("RD_KAFKA_RESOURCE_PATTERN_TYPE__CNT")
        case _ => None
    extension (a: rd_kafka_ResourcePatternType_t)
      inline def &(b: rd_kafka_ResourcePatternType_t): rd_kafka_ResourcePatternType_t = a & b
      inline def |(b: rd_kafka_ResourcePatternType_t): rd_kafka_ResourcePatternType_t = a | b
      inline def is(b: rd_kafka_ResourcePatternType_t): Boolean = (a & b) == b

  /**
   * Apache Kafka resource types
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ResourceType_t = CUnsignedInt
  object rd_kafka_ResourceType_t extends CEnumU[rd_kafka_ResourceType_t]:
    given _tag: Tag[rd_kafka_ResourceType_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_ResourceType_t = a.toUInt
    val RD_KAFKA_RESOURCE_UNKNOWN = define(0)
    val RD_KAFKA_RESOURCE_ANY = define(1)
    val RD_KAFKA_RESOURCE_TOPIC = define(2)
    val RD_KAFKA_RESOURCE_GROUP = define(3)
    val RD_KAFKA_RESOURCE_BROKER = define(4)
    val RD_KAFKA_RESOURCE__CNT = define(5)
    inline def getName(inline value: rd_kafka_ResourceType_t): Option[String] =
      inline value match
        case RD_KAFKA_RESOURCE_UNKNOWN => Some("RD_KAFKA_RESOURCE_UNKNOWN")
        case RD_KAFKA_RESOURCE_ANY => Some("RD_KAFKA_RESOURCE_ANY")
        case RD_KAFKA_RESOURCE_TOPIC => Some("RD_KAFKA_RESOURCE_TOPIC")
        case RD_KAFKA_RESOURCE_GROUP => Some("RD_KAFKA_RESOURCE_GROUP")
        case RD_KAFKA_RESOURCE_BROKER => Some("RD_KAFKA_RESOURCE_BROKER")
        case RD_KAFKA_RESOURCE__CNT => Some("RD_KAFKA_RESOURCE__CNT")
        case _ => None
    extension (a: rd_kafka_ResourceType_t)
      inline def &(b: rd_kafka_ResourceType_t): rd_kafka_ResourceType_t = a & b
      inline def |(b: rd_kafka_ResourceType_t): rd_kafka_ResourceType_t = a | b
      inline def is(b: rd_kafka_ResourceType_t): Boolean = (a & b) == b

  /**
   * Admin operation enum name for use with rd_kafka_AdminOptions_new()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_admin_op_t = CUnsignedInt
  object rd_kafka_admin_op_t extends CEnumU[rd_kafka_admin_op_t]:
    given _tag: Tag[rd_kafka_admin_op_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_admin_op_t = a.toUInt
    val RD_KAFKA_ADMIN_OP_ANY = define(0)
    val RD_KAFKA_ADMIN_OP_CREATETOPICS = define(1)
    val RD_KAFKA_ADMIN_OP_DELETETOPICS = define(2)
    val RD_KAFKA_ADMIN_OP_CREATEPARTITIONS = define(3)
    val RD_KAFKA_ADMIN_OP_ALTERCONFIGS = define(4)
    val RD_KAFKA_ADMIN_OP_DESCRIBECONFIGS = define(5)
    val RD_KAFKA_ADMIN_OP_DELETERECORDS = define(6)
    val RD_KAFKA_ADMIN_OP_DELETEGROUPS = define(7)
    val RD_KAFKA_ADMIN_OP_DELETECONSUMERGROUPOFFSETS = define(8)
    val RD_KAFKA_ADMIN_OP_CREATEACLS = define(9)
    val RD_KAFKA_ADMIN_OP_DESCRIBEACLS = define(10)
    val RD_KAFKA_ADMIN_OP_DELETEACLS = define(11)
    val RD_KAFKA_ADMIN_OP_LISTCONSUMERGROUPS = define(12)
    val RD_KAFKA_ADMIN_OP_DESCRIBECONSUMERGROUPS = define(13)
    val RD_KAFKA_ADMIN_OP_LISTCONSUMERGROUPOFFSETS = define(14)
    val RD_KAFKA_ADMIN_OP_ALTERCONSUMERGROUPOFFSETS = define(15)
    val RD_KAFKA_ADMIN_OP__CNT = define(16)
    inline def getName(inline value: rd_kafka_admin_op_t): Option[String] =
      inline value match
        case RD_KAFKA_ADMIN_OP_ANY => Some("RD_KAFKA_ADMIN_OP_ANY")
        case RD_KAFKA_ADMIN_OP_CREATETOPICS => Some("RD_KAFKA_ADMIN_OP_CREATETOPICS")
        case RD_KAFKA_ADMIN_OP_DELETETOPICS => Some("RD_KAFKA_ADMIN_OP_DELETETOPICS")
        case RD_KAFKA_ADMIN_OP_CREATEPARTITIONS => Some("RD_KAFKA_ADMIN_OP_CREATEPARTITIONS")
        case RD_KAFKA_ADMIN_OP_ALTERCONFIGS => Some("RD_KAFKA_ADMIN_OP_ALTERCONFIGS")
        case RD_KAFKA_ADMIN_OP_DESCRIBECONFIGS => Some("RD_KAFKA_ADMIN_OP_DESCRIBECONFIGS")
        case RD_KAFKA_ADMIN_OP_DELETERECORDS => Some("RD_KAFKA_ADMIN_OP_DELETERECORDS")
        case RD_KAFKA_ADMIN_OP_DELETEGROUPS => Some("RD_KAFKA_ADMIN_OP_DELETEGROUPS")
        case RD_KAFKA_ADMIN_OP_DELETECONSUMERGROUPOFFSETS => Some("RD_KAFKA_ADMIN_OP_DELETECONSUMERGROUPOFFSETS")
        case RD_KAFKA_ADMIN_OP_CREATEACLS => Some("RD_KAFKA_ADMIN_OP_CREATEACLS")
        case RD_KAFKA_ADMIN_OP_DESCRIBEACLS => Some("RD_KAFKA_ADMIN_OP_DESCRIBEACLS")
        case RD_KAFKA_ADMIN_OP_DELETEACLS => Some("RD_KAFKA_ADMIN_OP_DELETEACLS")
        case RD_KAFKA_ADMIN_OP_LISTCONSUMERGROUPS => Some("RD_KAFKA_ADMIN_OP_LISTCONSUMERGROUPS")
        case RD_KAFKA_ADMIN_OP_DESCRIBECONSUMERGROUPS => Some("RD_KAFKA_ADMIN_OP_DESCRIBECONSUMERGROUPS")
        case RD_KAFKA_ADMIN_OP_LISTCONSUMERGROUPOFFSETS => Some("RD_KAFKA_ADMIN_OP_LISTCONSUMERGROUPOFFSETS")
        case RD_KAFKA_ADMIN_OP_ALTERCONSUMERGROUPOFFSETS => Some("RD_KAFKA_ADMIN_OP_ALTERCONSUMERGROUPOFFSETS")
        case RD_KAFKA_ADMIN_OP__CNT => Some("RD_KAFKA_ADMIN_OP__CNT")
        case _ => None
    extension (a: rd_kafka_admin_op_t)
      inline def &(b: rd_kafka_admin_op_t): rd_kafka_admin_op_t = a & b
      inline def |(b: rd_kafka_admin_op_t): rd_kafka_admin_op_t = a | b
      inline def is(b: rd_kafka_admin_op_t): Boolean = (a & b) == b

  /**
   * SSL certificate encoding
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_cert_enc_t = CUnsignedInt
  object rd_kafka_cert_enc_t extends CEnumU[rd_kafka_cert_enc_t]:
    given _tag: Tag[rd_kafka_cert_enc_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_cert_enc_t = a.toUInt
    val RD_KAFKA_CERT_ENC_PKCS12 = define(0)
    val RD_KAFKA_CERT_ENC_DER = define(1)
    val RD_KAFKA_CERT_ENC_PEM = define(2)
    val RD_KAFKA_CERT_ENC__CNT = define(3)
    inline def getName(inline value: rd_kafka_cert_enc_t): Option[String] =
      inline value match
        case RD_KAFKA_CERT_ENC_PKCS12 => Some("RD_KAFKA_CERT_ENC_PKCS12")
        case RD_KAFKA_CERT_ENC_DER => Some("RD_KAFKA_CERT_ENC_DER")
        case RD_KAFKA_CERT_ENC_PEM => Some("RD_KAFKA_CERT_ENC_PEM")
        case RD_KAFKA_CERT_ENC__CNT => Some("RD_KAFKA_CERT_ENC__CNT")
        case _ => None
    extension (a: rd_kafka_cert_enc_t)
      inline def &(b: rd_kafka_cert_enc_t): rd_kafka_cert_enc_t = a & b
      inline def |(b: rd_kafka_cert_enc_t): rd_kafka_cert_enc_t = a | b
      inline def is(b: rd_kafka_cert_enc_t): Boolean = (a & b) == b

  /**
   * SSL certificate type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_cert_type_t = CUnsignedInt
  object rd_kafka_cert_type_t extends CEnumU[rd_kafka_cert_type_t]:
    given _tag: Tag[rd_kafka_cert_type_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_cert_type_t = a.toUInt
    val RD_KAFKA_CERT_PUBLIC_KEY = define(0)
    val RD_KAFKA_CERT_PRIVATE_KEY = define(1)
    val RD_KAFKA_CERT_CA = define(2)
    val RD_KAFKA_CERT__CNT = define(3)
    inline def getName(inline value: rd_kafka_cert_type_t): Option[String] =
      inline value match
        case RD_KAFKA_CERT_PUBLIC_KEY => Some("RD_KAFKA_CERT_PUBLIC_KEY")
        case RD_KAFKA_CERT_PRIVATE_KEY => Some("RD_KAFKA_CERT_PRIVATE_KEY")
        case RD_KAFKA_CERT_CA => Some("RD_KAFKA_CERT_CA")
        case RD_KAFKA_CERT__CNT => Some("RD_KAFKA_CERT__CNT")
        case _ => None
    extension (a: rd_kafka_cert_type_t)
      inline def &(b: rd_kafka_cert_type_t): rd_kafka_cert_type_t = a & b
      inline def |(b: rd_kafka_cert_type_t): rd_kafka_cert_type_t = a | b
      inline def is(b: rd_kafka_cert_type_t): Boolean = (a & b) == b

  /**
   * Configuration result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_conf_res_t = CInt
  object rd_kafka_conf_res_t extends CEnum[rd_kafka_conf_res_t]:
    given _tag: Tag[rd_kafka_conf_res_t] = Tag.Int
    inline def define(inline a: CInt): rd_kafka_conf_res_t = a
    val RD_KAFKA_CONF_UNKNOWN = define(-2)
    val RD_KAFKA_CONF_INVALID = define(-1)
    val RD_KAFKA_CONF_OK = define(0)
    inline def getName(inline value: rd_kafka_conf_res_t): Option[String] =
      inline value match
        case RD_KAFKA_CONF_UNKNOWN => Some("RD_KAFKA_CONF_UNKNOWN")
        case RD_KAFKA_CONF_INVALID => Some("RD_KAFKA_CONF_INVALID")
        case RD_KAFKA_CONF_OK => Some("RD_KAFKA_CONF_OK")
        case _ => None
    extension (a: rd_kafka_conf_res_t)
      inline def &(b: rd_kafka_conf_res_t): rd_kafka_conf_res_t = a & b
      inline def |(b: rd_kafka_conf_res_t): rd_kafka_conf_res_t = a | b
      inline def is(b: rd_kafka_conf_res_t): Boolean = (a & b) == b

  /**
   * Consumer group state.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_consumer_group_state_t = CUnsignedInt
  object rd_kafka_consumer_group_state_t extends CEnumU[rd_kafka_consumer_group_state_t]:
    given _tag: Tag[rd_kafka_consumer_group_state_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_consumer_group_state_t = a.toUInt
    val RD_KAFKA_CONSUMER_GROUP_STATE_UNKNOWN = define(0)
    val RD_KAFKA_CONSUMER_GROUP_STATE_PREPARING_REBALANCE = define(1)
    val RD_KAFKA_CONSUMER_GROUP_STATE_COMPLETING_REBALANCE = define(2)
    val RD_KAFKA_CONSUMER_GROUP_STATE_STABLE = define(3)
    val RD_KAFKA_CONSUMER_GROUP_STATE_DEAD = define(4)
    val RD_KAFKA_CONSUMER_GROUP_STATE_EMPTY = define(5)
    val RD_KAFKA_CONSUMER_GROUP_STATE__CNT = define(6)
    inline def getName(inline value: rd_kafka_consumer_group_state_t): Option[String] =
      inline value match
        case RD_KAFKA_CONSUMER_GROUP_STATE_UNKNOWN => Some("RD_KAFKA_CONSUMER_GROUP_STATE_UNKNOWN")
        case RD_KAFKA_CONSUMER_GROUP_STATE_PREPARING_REBALANCE => Some("RD_KAFKA_CONSUMER_GROUP_STATE_PREPARING_REBALANCE")
        case RD_KAFKA_CONSUMER_GROUP_STATE_COMPLETING_REBALANCE => Some("RD_KAFKA_CONSUMER_GROUP_STATE_COMPLETING_REBALANCE")
        case RD_KAFKA_CONSUMER_GROUP_STATE_STABLE => Some("RD_KAFKA_CONSUMER_GROUP_STATE_STABLE")
        case RD_KAFKA_CONSUMER_GROUP_STATE_DEAD => Some("RD_KAFKA_CONSUMER_GROUP_STATE_DEAD")
        case RD_KAFKA_CONSUMER_GROUP_STATE_EMPTY => Some("RD_KAFKA_CONSUMER_GROUP_STATE_EMPTY")
        case RD_KAFKA_CONSUMER_GROUP_STATE__CNT => Some("RD_KAFKA_CONSUMER_GROUP_STATE__CNT")
        case _ => None
    extension (a: rd_kafka_consumer_group_state_t)
      inline def &(b: rd_kafka_consumer_group_state_t): rd_kafka_consumer_group_state_t = a & b
      inline def |(b: rd_kafka_consumer_group_state_t): rd_kafka_consumer_group_state_t = a | b
      inline def is(b: rd_kafka_consumer_group_state_t): Boolean = (a & b) == b

  /**
   * Message persistence status can be used by the application to find out if a produced message was persisted in the topic log.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_msg_status_t = CUnsignedInt
  object rd_kafka_msg_status_t extends CEnumU[rd_kafka_msg_status_t]:
    given _tag: Tag[rd_kafka_msg_status_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_msg_status_t = a.toUInt
    val RD_KAFKA_MSG_STATUS_NOT_PERSISTED = define(0)
    val RD_KAFKA_MSG_STATUS_POSSIBLY_PERSISTED = define(1)
    val RD_KAFKA_MSG_STATUS_PERSISTED = define(2)
    inline def getName(inline value: rd_kafka_msg_status_t): Option[String] =
      inline value match
        case RD_KAFKA_MSG_STATUS_NOT_PERSISTED => Some("RD_KAFKA_MSG_STATUS_NOT_PERSISTED")
        case RD_KAFKA_MSG_STATUS_POSSIBLY_PERSISTED => Some("RD_KAFKA_MSG_STATUS_POSSIBLY_PERSISTED")
        case RD_KAFKA_MSG_STATUS_PERSISTED => Some("RD_KAFKA_MSG_STATUS_PERSISTED")
        case _ => None
    extension (a: rd_kafka_msg_status_t)
      inline def &(b: rd_kafka_msg_status_t): rd_kafka_msg_status_t = a & b
      inline def |(b: rd_kafka_msg_status_t): rd_kafka_msg_status_t = a | b
      inline def is(b: rd_kafka_msg_status_t): Boolean = (a & b) == b

  /**
   * Error codes.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_resp_err_t = CInt
  object rd_kafka_resp_err_t extends CEnum[rd_kafka_resp_err_t]:
    given _tag: Tag[rd_kafka_resp_err_t] = Tag.Int
    inline def define(inline a: CInt): rd_kafka_resp_err_t = a
    val RD_KAFKA_RESP_ERR__BEGIN = define(-200)
    val RD_KAFKA_RESP_ERR__BAD_MSG = define(-199)
    val RD_KAFKA_RESP_ERR__BAD_COMPRESSION = define(-198)
    val RD_KAFKA_RESP_ERR__DESTROY = define(-197)
    val RD_KAFKA_RESP_ERR__FAIL = define(-196)
    val RD_KAFKA_RESP_ERR__TRANSPORT = define(-195)
    val RD_KAFKA_RESP_ERR__CRIT_SYS_RESOURCE = define(-194)
    val RD_KAFKA_RESP_ERR__RESOLVE = define(-193)
    val RD_KAFKA_RESP_ERR__MSG_TIMED_OUT = define(-192)
    val RD_KAFKA_RESP_ERR__PARTITION_EOF = define(-191)
    val RD_KAFKA_RESP_ERR__UNKNOWN_PARTITION = define(-190)
    val RD_KAFKA_RESP_ERR__FS = define(-189)
    val RD_KAFKA_RESP_ERR__UNKNOWN_TOPIC = define(-188)
    val RD_KAFKA_RESP_ERR__ALL_BROKERS_DOWN = define(-187)
    val RD_KAFKA_RESP_ERR__INVALID_ARG = define(-186)
    val RD_KAFKA_RESP_ERR__TIMED_OUT = define(-185)
    val RD_KAFKA_RESP_ERR__QUEUE_FULL = define(-184)
    val RD_KAFKA_RESP_ERR__ISR_INSUFF = define(-183)
    val RD_KAFKA_RESP_ERR__NODE_UPDATE = define(-182)
    val RD_KAFKA_RESP_ERR__SSL = define(-181)
    val RD_KAFKA_RESP_ERR__WAIT_COORD = define(-180)
    val RD_KAFKA_RESP_ERR__UNKNOWN_GROUP = define(-179)
    val RD_KAFKA_RESP_ERR__IN_PROGRESS = define(-178)
    val RD_KAFKA_RESP_ERR__PREV_IN_PROGRESS = define(-177)
    val RD_KAFKA_RESP_ERR__EXISTING_SUBSCRIPTION = define(-176)
    val RD_KAFKA_RESP_ERR__ASSIGN_PARTITIONS = define(-175)
    val RD_KAFKA_RESP_ERR__REVOKE_PARTITIONS = define(-174)
    val RD_KAFKA_RESP_ERR__CONFLICT = define(-173)
    val RD_KAFKA_RESP_ERR__STATE = define(-172)
    val RD_KAFKA_RESP_ERR__UNKNOWN_PROTOCOL = define(-171)
    val RD_KAFKA_RESP_ERR__NOT_IMPLEMENTED = define(-170)
    val RD_KAFKA_RESP_ERR__AUTHENTICATION = define(-169)
    val RD_KAFKA_RESP_ERR__NO_OFFSET = define(-168)
    val RD_KAFKA_RESP_ERR__OUTDATED = define(-167)
    val RD_KAFKA_RESP_ERR__TIMED_OUT_QUEUE = define(-166)
    val RD_KAFKA_RESP_ERR__UNSUPPORTED_FEATURE = define(-165)
    val RD_KAFKA_RESP_ERR__WAIT_CACHE = define(-164)
    val RD_KAFKA_RESP_ERR__INTR = define(-163)
    val RD_KAFKA_RESP_ERR__KEY_SERIALIZATION = define(-162)
    val RD_KAFKA_RESP_ERR__VALUE_SERIALIZATION = define(-161)
    val RD_KAFKA_RESP_ERR__KEY_DESERIALIZATION = define(-160)
    val RD_KAFKA_RESP_ERR__VALUE_DESERIALIZATION = define(-159)
    val RD_KAFKA_RESP_ERR__PARTIAL = define(-158)
    val RD_KAFKA_RESP_ERR__READ_ONLY = define(-157)
    val RD_KAFKA_RESP_ERR__NOENT = define(-156)
    val RD_KAFKA_RESP_ERR__UNDERFLOW = define(-155)
    val RD_KAFKA_RESP_ERR__INVALID_TYPE = define(-154)
    val RD_KAFKA_RESP_ERR__RETRY = define(-153)
    val RD_KAFKA_RESP_ERR__PURGE_QUEUE = define(-152)
    val RD_KAFKA_RESP_ERR__PURGE_INFLIGHT = define(-151)
    val RD_KAFKA_RESP_ERR__FATAL = define(-150)
    val RD_KAFKA_RESP_ERR__INCONSISTENT = define(-149)
    val RD_KAFKA_RESP_ERR__GAPLESS_GUARANTEE = define(-148)
    val RD_KAFKA_RESP_ERR__MAX_POLL_EXCEEDED = define(-147)
    val RD_KAFKA_RESP_ERR__UNKNOWN_BROKER = define(-146)
    val RD_KAFKA_RESP_ERR__NOT_CONFIGURED = define(-145)
    val RD_KAFKA_RESP_ERR__FENCED = define(-144)
    val RD_KAFKA_RESP_ERR__APPLICATION = define(-143)
    val RD_KAFKA_RESP_ERR__ASSIGNMENT_LOST = define(-142)
    val RD_KAFKA_RESP_ERR__NOOP = define(-141)
    val RD_KAFKA_RESP_ERR__AUTO_OFFSET_RESET = define(-140)
    val RD_KAFKA_RESP_ERR__LOG_TRUNCATION = define(-139)
    val RD_KAFKA_RESP_ERR__END = define(-100)
    val RD_KAFKA_RESP_ERR_UNKNOWN = define(-1)
    val RD_KAFKA_RESP_ERR_NO_ERROR = define(0)
    val RD_KAFKA_RESP_ERR_OFFSET_OUT_OF_RANGE = define(1)
    val RD_KAFKA_RESP_ERR_INVALID_MSG = define(2)
    val RD_KAFKA_RESP_ERR_UNKNOWN_TOPIC_OR_PART = define(3)
    val RD_KAFKA_RESP_ERR_INVALID_MSG_SIZE = define(4)
    val RD_KAFKA_RESP_ERR_LEADER_NOT_AVAILABLE = define(5)
    val RD_KAFKA_RESP_ERR_NOT_LEADER_FOR_PARTITION = define(6)
    val RD_KAFKA_RESP_ERR_REQUEST_TIMED_OUT = define(7)
    val RD_KAFKA_RESP_ERR_BROKER_NOT_AVAILABLE = define(8)
    val RD_KAFKA_RESP_ERR_REPLICA_NOT_AVAILABLE = define(9)
    val RD_KAFKA_RESP_ERR_MSG_SIZE_TOO_LARGE = define(10)
    val RD_KAFKA_RESP_ERR_STALE_CTRL_EPOCH = define(11)
    val RD_KAFKA_RESP_ERR_OFFSET_METADATA_TOO_LARGE = define(12)
    val RD_KAFKA_RESP_ERR_NETWORK_EXCEPTION = define(13)
    val RD_KAFKA_RESP_ERR_COORDINATOR_LOAD_IN_PROGRESS = define(14)
    val RD_KAFKA_RESP_ERR_COORDINATOR_NOT_AVAILABLE = define(15)
    val RD_KAFKA_RESP_ERR_NOT_COORDINATOR = define(16)
    val RD_KAFKA_RESP_ERR_TOPIC_EXCEPTION = define(17)
    val RD_KAFKA_RESP_ERR_RECORD_LIST_TOO_LARGE = define(18)
    val RD_KAFKA_RESP_ERR_NOT_ENOUGH_REPLICAS = define(19)
    val RD_KAFKA_RESP_ERR_NOT_ENOUGH_REPLICAS_AFTER_APPEND = define(20)
    val RD_KAFKA_RESP_ERR_INVALID_REQUIRED_ACKS = define(21)
    val RD_KAFKA_RESP_ERR_ILLEGAL_GENERATION = define(22)
    val RD_KAFKA_RESP_ERR_INCONSISTENT_GROUP_PROTOCOL = define(23)
    val RD_KAFKA_RESP_ERR_INVALID_GROUP_ID = define(24)
    val RD_KAFKA_RESP_ERR_UNKNOWN_MEMBER_ID = define(25)
    val RD_KAFKA_RESP_ERR_INVALID_SESSION_TIMEOUT = define(26)
    val RD_KAFKA_RESP_ERR_REBALANCE_IN_PROGRESS = define(27)
    val RD_KAFKA_RESP_ERR_INVALID_COMMIT_OFFSET_SIZE = define(28)
    val RD_KAFKA_RESP_ERR_TOPIC_AUTHORIZATION_FAILED = define(29)
    val RD_KAFKA_RESP_ERR_GROUP_AUTHORIZATION_FAILED = define(30)
    val RD_KAFKA_RESP_ERR_CLUSTER_AUTHORIZATION_FAILED = define(31)
    val RD_KAFKA_RESP_ERR_INVALID_TIMESTAMP = define(32)
    val RD_KAFKA_RESP_ERR_UNSUPPORTED_SASL_MECHANISM = define(33)
    val RD_KAFKA_RESP_ERR_ILLEGAL_SASL_STATE = define(34)
    val RD_KAFKA_RESP_ERR_UNSUPPORTED_VERSION = define(35)
    val RD_KAFKA_RESP_ERR_TOPIC_ALREADY_EXISTS = define(36)
    val RD_KAFKA_RESP_ERR_INVALID_PARTITIONS = define(37)
    val RD_KAFKA_RESP_ERR_INVALID_REPLICATION_FACTOR = define(38)
    val RD_KAFKA_RESP_ERR_INVALID_REPLICA_ASSIGNMENT = define(39)
    val RD_KAFKA_RESP_ERR_INVALID_CONFIG = define(40)
    val RD_KAFKA_RESP_ERR_NOT_CONTROLLER = define(41)
    val RD_KAFKA_RESP_ERR_INVALID_REQUEST = define(42)
    val RD_KAFKA_RESP_ERR_UNSUPPORTED_FOR_MESSAGE_FORMAT = define(43)
    val RD_KAFKA_RESP_ERR_POLICY_VIOLATION = define(44)
    val RD_KAFKA_RESP_ERR_OUT_OF_ORDER_SEQUENCE_NUMBER = define(45)
    val RD_KAFKA_RESP_ERR_DUPLICATE_SEQUENCE_NUMBER = define(46)
    val RD_KAFKA_RESP_ERR_INVALID_PRODUCER_EPOCH = define(47)
    val RD_KAFKA_RESP_ERR_INVALID_TXN_STATE = define(48)
    val RD_KAFKA_RESP_ERR_INVALID_PRODUCER_ID_MAPPING = define(49)
    val RD_KAFKA_RESP_ERR_INVALID_TRANSACTION_TIMEOUT = define(50)
    val RD_KAFKA_RESP_ERR_CONCURRENT_TRANSACTIONS = define(51)
    val RD_KAFKA_RESP_ERR_TRANSACTION_COORDINATOR_FENCED = define(52)
    val RD_KAFKA_RESP_ERR_TRANSACTIONAL_ID_AUTHORIZATION_FAILED = define(53)
    val RD_KAFKA_RESP_ERR_SECURITY_DISABLED = define(54)
    val RD_KAFKA_RESP_ERR_OPERATION_NOT_ATTEMPTED = define(55)
    val RD_KAFKA_RESP_ERR_KAFKA_STORAGE_ERROR = define(56)
    val RD_KAFKA_RESP_ERR_LOG_DIR_NOT_FOUND = define(57)
    val RD_KAFKA_RESP_ERR_SASL_AUTHENTICATION_FAILED = define(58)
    val RD_KAFKA_RESP_ERR_UNKNOWN_PRODUCER_ID = define(59)
    val RD_KAFKA_RESP_ERR_REASSIGNMENT_IN_PROGRESS = define(60)
    val RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_AUTH_DISABLED = define(61)
    val RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_NOT_FOUND = define(62)
    val RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_OWNER_MISMATCH = define(63)
    val RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_REQUEST_NOT_ALLOWED = define(64)
    val RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_AUTHORIZATION_FAILED = define(65)
    val RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_EXPIRED = define(66)
    val RD_KAFKA_RESP_ERR_INVALID_PRINCIPAL_TYPE = define(67)
    val RD_KAFKA_RESP_ERR_NON_EMPTY_GROUP = define(68)
    val RD_KAFKA_RESP_ERR_GROUP_ID_NOT_FOUND = define(69)
    val RD_KAFKA_RESP_ERR_FETCH_SESSION_ID_NOT_FOUND = define(70)
    val RD_KAFKA_RESP_ERR_INVALID_FETCH_SESSION_EPOCH = define(71)
    val RD_KAFKA_RESP_ERR_LISTENER_NOT_FOUND = define(72)
    val RD_KAFKA_RESP_ERR_TOPIC_DELETION_DISABLED = define(73)
    val RD_KAFKA_RESP_ERR_FENCED_LEADER_EPOCH = define(74)
    val RD_KAFKA_RESP_ERR_UNKNOWN_LEADER_EPOCH = define(75)
    val RD_KAFKA_RESP_ERR_UNSUPPORTED_COMPRESSION_TYPE = define(76)
    val RD_KAFKA_RESP_ERR_STALE_BROKER_EPOCH = define(77)
    val RD_KAFKA_RESP_ERR_OFFSET_NOT_AVAILABLE = define(78)
    val RD_KAFKA_RESP_ERR_MEMBER_ID_REQUIRED = define(79)
    val RD_KAFKA_RESP_ERR_PREFERRED_LEADER_NOT_AVAILABLE = define(80)
    val RD_KAFKA_RESP_ERR_GROUP_MAX_SIZE_REACHED = define(81)
    val RD_KAFKA_RESP_ERR_FENCED_INSTANCE_ID = define(82)
    val RD_KAFKA_RESP_ERR_ELIGIBLE_LEADERS_NOT_AVAILABLE = define(83)
    val RD_KAFKA_RESP_ERR_ELECTION_NOT_NEEDED = define(84)
    val RD_KAFKA_RESP_ERR_NO_REASSIGNMENT_IN_PROGRESS = define(85)
    val RD_KAFKA_RESP_ERR_GROUP_SUBSCRIBED_TO_TOPIC = define(86)
    val RD_KAFKA_RESP_ERR_INVALID_RECORD = define(87)
    val RD_KAFKA_RESP_ERR_UNSTABLE_OFFSET_COMMIT = define(88)
    val RD_KAFKA_RESP_ERR_THROTTLING_QUOTA_EXCEEDED = define(89)
    val RD_KAFKA_RESP_ERR_PRODUCER_FENCED = define(90)
    val RD_KAFKA_RESP_ERR_RESOURCE_NOT_FOUND = define(91)
    val RD_KAFKA_RESP_ERR_DUPLICATE_RESOURCE = define(92)
    val RD_KAFKA_RESP_ERR_UNACCEPTABLE_CREDENTIAL = define(93)
    val RD_KAFKA_RESP_ERR_INCONSISTENT_VOTER_SET = define(94)
    val RD_KAFKA_RESP_ERR_INVALID_UPDATE_VERSION = define(95)
    val RD_KAFKA_RESP_ERR_FEATURE_UPDATE_FAILED = define(96)
    val RD_KAFKA_RESP_ERR_PRINCIPAL_DESERIALIZATION_FAILURE = define(97)
    val RD_KAFKA_RESP_ERR_END_ALL = define(98)
    inline def getName(inline value: rd_kafka_resp_err_t): Option[String] =
      inline value match
        case RD_KAFKA_RESP_ERR__BEGIN => Some("RD_KAFKA_RESP_ERR__BEGIN")
        case RD_KAFKA_RESP_ERR__BAD_MSG => Some("RD_KAFKA_RESP_ERR__BAD_MSG")
        case RD_KAFKA_RESP_ERR__BAD_COMPRESSION => Some("RD_KAFKA_RESP_ERR__BAD_COMPRESSION")
        case RD_KAFKA_RESP_ERR__DESTROY => Some("RD_KAFKA_RESP_ERR__DESTROY")
        case RD_KAFKA_RESP_ERR__FAIL => Some("RD_KAFKA_RESP_ERR__FAIL")
        case RD_KAFKA_RESP_ERR__TRANSPORT => Some("RD_KAFKA_RESP_ERR__TRANSPORT")
        case RD_KAFKA_RESP_ERR__CRIT_SYS_RESOURCE => Some("RD_KAFKA_RESP_ERR__CRIT_SYS_RESOURCE")
        case RD_KAFKA_RESP_ERR__RESOLVE => Some("RD_KAFKA_RESP_ERR__RESOLVE")
        case RD_KAFKA_RESP_ERR__MSG_TIMED_OUT => Some("RD_KAFKA_RESP_ERR__MSG_TIMED_OUT")
        case RD_KAFKA_RESP_ERR__PARTITION_EOF => Some("RD_KAFKA_RESP_ERR__PARTITION_EOF")
        case RD_KAFKA_RESP_ERR__UNKNOWN_PARTITION => Some("RD_KAFKA_RESP_ERR__UNKNOWN_PARTITION")
        case RD_KAFKA_RESP_ERR__FS => Some("RD_KAFKA_RESP_ERR__FS")
        case RD_KAFKA_RESP_ERR__UNKNOWN_TOPIC => Some("RD_KAFKA_RESP_ERR__UNKNOWN_TOPIC")
        case RD_KAFKA_RESP_ERR__ALL_BROKERS_DOWN => Some("RD_KAFKA_RESP_ERR__ALL_BROKERS_DOWN")
        case RD_KAFKA_RESP_ERR__INVALID_ARG => Some("RD_KAFKA_RESP_ERR__INVALID_ARG")
        case RD_KAFKA_RESP_ERR__TIMED_OUT => Some("RD_KAFKA_RESP_ERR__TIMED_OUT")
        case RD_KAFKA_RESP_ERR__QUEUE_FULL => Some("RD_KAFKA_RESP_ERR__QUEUE_FULL")
        case RD_KAFKA_RESP_ERR__ISR_INSUFF => Some("RD_KAFKA_RESP_ERR__ISR_INSUFF")
        case RD_KAFKA_RESP_ERR__NODE_UPDATE => Some("RD_KAFKA_RESP_ERR__NODE_UPDATE")
        case RD_KAFKA_RESP_ERR__SSL => Some("RD_KAFKA_RESP_ERR__SSL")
        case RD_KAFKA_RESP_ERR__WAIT_COORD => Some("RD_KAFKA_RESP_ERR__WAIT_COORD")
        case RD_KAFKA_RESP_ERR__UNKNOWN_GROUP => Some("RD_KAFKA_RESP_ERR__UNKNOWN_GROUP")
        case RD_KAFKA_RESP_ERR__IN_PROGRESS => Some("RD_KAFKA_RESP_ERR__IN_PROGRESS")
        case RD_KAFKA_RESP_ERR__PREV_IN_PROGRESS => Some("RD_KAFKA_RESP_ERR__PREV_IN_PROGRESS")
        case RD_KAFKA_RESP_ERR__EXISTING_SUBSCRIPTION => Some("RD_KAFKA_RESP_ERR__EXISTING_SUBSCRIPTION")
        case RD_KAFKA_RESP_ERR__ASSIGN_PARTITIONS => Some("RD_KAFKA_RESP_ERR__ASSIGN_PARTITIONS")
        case RD_KAFKA_RESP_ERR__REVOKE_PARTITIONS => Some("RD_KAFKA_RESP_ERR__REVOKE_PARTITIONS")
        case RD_KAFKA_RESP_ERR__CONFLICT => Some("RD_KAFKA_RESP_ERR__CONFLICT")
        case RD_KAFKA_RESP_ERR__STATE => Some("RD_KAFKA_RESP_ERR__STATE")
        case RD_KAFKA_RESP_ERR__UNKNOWN_PROTOCOL => Some("RD_KAFKA_RESP_ERR__UNKNOWN_PROTOCOL")
        case RD_KAFKA_RESP_ERR__NOT_IMPLEMENTED => Some("RD_KAFKA_RESP_ERR__NOT_IMPLEMENTED")
        case RD_KAFKA_RESP_ERR__AUTHENTICATION => Some("RD_KAFKA_RESP_ERR__AUTHENTICATION")
        case RD_KAFKA_RESP_ERR__NO_OFFSET => Some("RD_KAFKA_RESP_ERR__NO_OFFSET")
        case RD_KAFKA_RESP_ERR__OUTDATED => Some("RD_KAFKA_RESP_ERR__OUTDATED")
        case RD_KAFKA_RESP_ERR__TIMED_OUT_QUEUE => Some("RD_KAFKA_RESP_ERR__TIMED_OUT_QUEUE")
        case RD_KAFKA_RESP_ERR__UNSUPPORTED_FEATURE => Some("RD_KAFKA_RESP_ERR__UNSUPPORTED_FEATURE")
        case RD_KAFKA_RESP_ERR__WAIT_CACHE => Some("RD_KAFKA_RESP_ERR__WAIT_CACHE")
        case RD_KAFKA_RESP_ERR__INTR => Some("RD_KAFKA_RESP_ERR__INTR")
        case RD_KAFKA_RESP_ERR__KEY_SERIALIZATION => Some("RD_KAFKA_RESP_ERR__KEY_SERIALIZATION")
        case RD_KAFKA_RESP_ERR__VALUE_SERIALIZATION => Some("RD_KAFKA_RESP_ERR__VALUE_SERIALIZATION")
        case RD_KAFKA_RESP_ERR__KEY_DESERIALIZATION => Some("RD_KAFKA_RESP_ERR__KEY_DESERIALIZATION")
        case RD_KAFKA_RESP_ERR__VALUE_DESERIALIZATION => Some("RD_KAFKA_RESP_ERR__VALUE_DESERIALIZATION")
        case RD_KAFKA_RESP_ERR__PARTIAL => Some("RD_KAFKA_RESP_ERR__PARTIAL")
        case RD_KAFKA_RESP_ERR__READ_ONLY => Some("RD_KAFKA_RESP_ERR__READ_ONLY")
        case RD_KAFKA_RESP_ERR__NOENT => Some("RD_KAFKA_RESP_ERR__NOENT")
        case RD_KAFKA_RESP_ERR__UNDERFLOW => Some("RD_KAFKA_RESP_ERR__UNDERFLOW")
        case RD_KAFKA_RESP_ERR__INVALID_TYPE => Some("RD_KAFKA_RESP_ERR__INVALID_TYPE")
        case RD_KAFKA_RESP_ERR__RETRY => Some("RD_KAFKA_RESP_ERR__RETRY")
        case RD_KAFKA_RESP_ERR__PURGE_QUEUE => Some("RD_KAFKA_RESP_ERR__PURGE_QUEUE")
        case RD_KAFKA_RESP_ERR__PURGE_INFLIGHT => Some("RD_KAFKA_RESP_ERR__PURGE_INFLIGHT")
        case RD_KAFKA_RESP_ERR__FATAL => Some("RD_KAFKA_RESP_ERR__FATAL")
        case RD_KAFKA_RESP_ERR__INCONSISTENT => Some("RD_KAFKA_RESP_ERR__INCONSISTENT")
        case RD_KAFKA_RESP_ERR__GAPLESS_GUARANTEE => Some("RD_KAFKA_RESP_ERR__GAPLESS_GUARANTEE")
        case RD_KAFKA_RESP_ERR__MAX_POLL_EXCEEDED => Some("RD_KAFKA_RESP_ERR__MAX_POLL_EXCEEDED")
        case RD_KAFKA_RESP_ERR__UNKNOWN_BROKER => Some("RD_KAFKA_RESP_ERR__UNKNOWN_BROKER")
        case RD_KAFKA_RESP_ERR__NOT_CONFIGURED => Some("RD_KAFKA_RESP_ERR__NOT_CONFIGURED")
        case RD_KAFKA_RESP_ERR__FENCED => Some("RD_KAFKA_RESP_ERR__FENCED")
        case RD_KAFKA_RESP_ERR__APPLICATION => Some("RD_KAFKA_RESP_ERR__APPLICATION")
        case RD_KAFKA_RESP_ERR__ASSIGNMENT_LOST => Some("RD_KAFKA_RESP_ERR__ASSIGNMENT_LOST")
        case RD_KAFKA_RESP_ERR__NOOP => Some("RD_KAFKA_RESP_ERR__NOOP")
        case RD_KAFKA_RESP_ERR__AUTO_OFFSET_RESET => Some("RD_KAFKA_RESP_ERR__AUTO_OFFSET_RESET")
        case RD_KAFKA_RESP_ERR__LOG_TRUNCATION => Some("RD_KAFKA_RESP_ERR__LOG_TRUNCATION")
        case RD_KAFKA_RESP_ERR__END => Some("RD_KAFKA_RESP_ERR__END")
        case RD_KAFKA_RESP_ERR_UNKNOWN => Some("RD_KAFKA_RESP_ERR_UNKNOWN")
        case RD_KAFKA_RESP_ERR_NO_ERROR => Some("RD_KAFKA_RESP_ERR_NO_ERROR")
        case RD_KAFKA_RESP_ERR_OFFSET_OUT_OF_RANGE => Some("RD_KAFKA_RESP_ERR_OFFSET_OUT_OF_RANGE")
        case RD_KAFKA_RESP_ERR_INVALID_MSG => Some("RD_KAFKA_RESP_ERR_INVALID_MSG")
        case RD_KAFKA_RESP_ERR_UNKNOWN_TOPIC_OR_PART => Some("RD_KAFKA_RESP_ERR_UNKNOWN_TOPIC_OR_PART")
        case RD_KAFKA_RESP_ERR_INVALID_MSG_SIZE => Some("RD_KAFKA_RESP_ERR_INVALID_MSG_SIZE")
        case RD_KAFKA_RESP_ERR_LEADER_NOT_AVAILABLE => Some("RD_KAFKA_RESP_ERR_LEADER_NOT_AVAILABLE")
        case RD_KAFKA_RESP_ERR_NOT_LEADER_FOR_PARTITION => Some("RD_KAFKA_RESP_ERR_NOT_LEADER_FOR_PARTITION")
        case RD_KAFKA_RESP_ERR_REQUEST_TIMED_OUT => Some("RD_KAFKA_RESP_ERR_REQUEST_TIMED_OUT")
        case RD_KAFKA_RESP_ERR_BROKER_NOT_AVAILABLE => Some("RD_KAFKA_RESP_ERR_BROKER_NOT_AVAILABLE")
        case RD_KAFKA_RESP_ERR_REPLICA_NOT_AVAILABLE => Some("RD_KAFKA_RESP_ERR_REPLICA_NOT_AVAILABLE")
        case RD_KAFKA_RESP_ERR_MSG_SIZE_TOO_LARGE => Some("RD_KAFKA_RESP_ERR_MSG_SIZE_TOO_LARGE")
        case RD_KAFKA_RESP_ERR_STALE_CTRL_EPOCH => Some("RD_KAFKA_RESP_ERR_STALE_CTRL_EPOCH")
        case RD_KAFKA_RESP_ERR_OFFSET_METADATA_TOO_LARGE => Some("RD_KAFKA_RESP_ERR_OFFSET_METADATA_TOO_LARGE")
        case RD_KAFKA_RESP_ERR_NETWORK_EXCEPTION => Some("RD_KAFKA_RESP_ERR_NETWORK_EXCEPTION")
        case RD_KAFKA_RESP_ERR_COORDINATOR_LOAD_IN_PROGRESS => Some("RD_KAFKA_RESP_ERR_COORDINATOR_LOAD_IN_PROGRESS")
        case RD_KAFKA_RESP_ERR_COORDINATOR_NOT_AVAILABLE => Some("RD_KAFKA_RESP_ERR_COORDINATOR_NOT_AVAILABLE")
        case RD_KAFKA_RESP_ERR_NOT_COORDINATOR => Some("RD_KAFKA_RESP_ERR_NOT_COORDINATOR")
        case RD_KAFKA_RESP_ERR_TOPIC_EXCEPTION => Some("RD_KAFKA_RESP_ERR_TOPIC_EXCEPTION")
        case RD_KAFKA_RESP_ERR_RECORD_LIST_TOO_LARGE => Some("RD_KAFKA_RESP_ERR_RECORD_LIST_TOO_LARGE")
        case RD_KAFKA_RESP_ERR_NOT_ENOUGH_REPLICAS => Some("RD_KAFKA_RESP_ERR_NOT_ENOUGH_REPLICAS")
        case RD_KAFKA_RESP_ERR_NOT_ENOUGH_REPLICAS_AFTER_APPEND => Some("RD_KAFKA_RESP_ERR_NOT_ENOUGH_REPLICAS_AFTER_APPEND")
        case RD_KAFKA_RESP_ERR_INVALID_REQUIRED_ACKS => Some("RD_KAFKA_RESP_ERR_INVALID_REQUIRED_ACKS")
        case RD_KAFKA_RESP_ERR_ILLEGAL_GENERATION => Some("RD_KAFKA_RESP_ERR_ILLEGAL_GENERATION")
        case RD_KAFKA_RESP_ERR_INCONSISTENT_GROUP_PROTOCOL => Some("RD_KAFKA_RESP_ERR_INCONSISTENT_GROUP_PROTOCOL")
        case RD_KAFKA_RESP_ERR_INVALID_GROUP_ID => Some("RD_KAFKA_RESP_ERR_INVALID_GROUP_ID")
        case RD_KAFKA_RESP_ERR_UNKNOWN_MEMBER_ID => Some("RD_KAFKA_RESP_ERR_UNKNOWN_MEMBER_ID")
        case RD_KAFKA_RESP_ERR_INVALID_SESSION_TIMEOUT => Some("RD_KAFKA_RESP_ERR_INVALID_SESSION_TIMEOUT")
        case RD_KAFKA_RESP_ERR_REBALANCE_IN_PROGRESS => Some("RD_KAFKA_RESP_ERR_REBALANCE_IN_PROGRESS")
        case RD_KAFKA_RESP_ERR_INVALID_COMMIT_OFFSET_SIZE => Some("RD_KAFKA_RESP_ERR_INVALID_COMMIT_OFFSET_SIZE")
        case RD_KAFKA_RESP_ERR_TOPIC_AUTHORIZATION_FAILED => Some("RD_KAFKA_RESP_ERR_TOPIC_AUTHORIZATION_FAILED")
        case RD_KAFKA_RESP_ERR_GROUP_AUTHORIZATION_FAILED => Some("RD_KAFKA_RESP_ERR_GROUP_AUTHORIZATION_FAILED")
        case RD_KAFKA_RESP_ERR_CLUSTER_AUTHORIZATION_FAILED => Some("RD_KAFKA_RESP_ERR_CLUSTER_AUTHORIZATION_FAILED")
        case RD_KAFKA_RESP_ERR_INVALID_TIMESTAMP => Some("RD_KAFKA_RESP_ERR_INVALID_TIMESTAMP")
        case RD_KAFKA_RESP_ERR_UNSUPPORTED_SASL_MECHANISM => Some("RD_KAFKA_RESP_ERR_UNSUPPORTED_SASL_MECHANISM")
        case RD_KAFKA_RESP_ERR_ILLEGAL_SASL_STATE => Some("RD_KAFKA_RESP_ERR_ILLEGAL_SASL_STATE")
        case RD_KAFKA_RESP_ERR_UNSUPPORTED_VERSION => Some("RD_KAFKA_RESP_ERR_UNSUPPORTED_VERSION")
        case RD_KAFKA_RESP_ERR_TOPIC_ALREADY_EXISTS => Some("RD_KAFKA_RESP_ERR_TOPIC_ALREADY_EXISTS")
        case RD_KAFKA_RESP_ERR_INVALID_PARTITIONS => Some("RD_KAFKA_RESP_ERR_INVALID_PARTITIONS")
        case RD_KAFKA_RESP_ERR_INVALID_REPLICATION_FACTOR => Some("RD_KAFKA_RESP_ERR_INVALID_REPLICATION_FACTOR")
        case RD_KAFKA_RESP_ERR_INVALID_REPLICA_ASSIGNMENT => Some("RD_KAFKA_RESP_ERR_INVALID_REPLICA_ASSIGNMENT")
        case RD_KAFKA_RESP_ERR_INVALID_CONFIG => Some("RD_KAFKA_RESP_ERR_INVALID_CONFIG")
        case RD_KAFKA_RESP_ERR_NOT_CONTROLLER => Some("RD_KAFKA_RESP_ERR_NOT_CONTROLLER")
        case RD_KAFKA_RESP_ERR_INVALID_REQUEST => Some("RD_KAFKA_RESP_ERR_INVALID_REQUEST")
        case RD_KAFKA_RESP_ERR_UNSUPPORTED_FOR_MESSAGE_FORMAT => Some("RD_KAFKA_RESP_ERR_UNSUPPORTED_FOR_MESSAGE_FORMAT")
        case RD_KAFKA_RESP_ERR_POLICY_VIOLATION => Some("RD_KAFKA_RESP_ERR_POLICY_VIOLATION")
        case RD_KAFKA_RESP_ERR_OUT_OF_ORDER_SEQUENCE_NUMBER => Some("RD_KAFKA_RESP_ERR_OUT_OF_ORDER_SEQUENCE_NUMBER")
        case RD_KAFKA_RESP_ERR_DUPLICATE_SEQUENCE_NUMBER => Some("RD_KAFKA_RESP_ERR_DUPLICATE_SEQUENCE_NUMBER")
        case RD_KAFKA_RESP_ERR_INVALID_PRODUCER_EPOCH => Some("RD_KAFKA_RESP_ERR_INVALID_PRODUCER_EPOCH")
        case RD_KAFKA_RESP_ERR_INVALID_TXN_STATE => Some("RD_KAFKA_RESP_ERR_INVALID_TXN_STATE")
        case RD_KAFKA_RESP_ERR_INVALID_PRODUCER_ID_MAPPING => Some("RD_KAFKA_RESP_ERR_INVALID_PRODUCER_ID_MAPPING")
        case RD_KAFKA_RESP_ERR_INVALID_TRANSACTION_TIMEOUT => Some("RD_KAFKA_RESP_ERR_INVALID_TRANSACTION_TIMEOUT")
        case RD_KAFKA_RESP_ERR_CONCURRENT_TRANSACTIONS => Some("RD_KAFKA_RESP_ERR_CONCURRENT_TRANSACTIONS")
        case RD_KAFKA_RESP_ERR_TRANSACTION_COORDINATOR_FENCED => Some("RD_KAFKA_RESP_ERR_TRANSACTION_COORDINATOR_FENCED")
        case RD_KAFKA_RESP_ERR_TRANSACTIONAL_ID_AUTHORIZATION_FAILED => Some("RD_KAFKA_RESP_ERR_TRANSACTIONAL_ID_AUTHORIZATION_FAILED")
        case RD_KAFKA_RESP_ERR_SECURITY_DISABLED => Some("RD_KAFKA_RESP_ERR_SECURITY_DISABLED")
        case RD_KAFKA_RESP_ERR_OPERATION_NOT_ATTEMPTED => Some("RD_KAFKA_RESP_ERR_OPERATION_NOT_ATTEMPTED")
        case RD_KAFKA_RESP_ERR_KAFKA_STORAGE_ERROR => Some("RD_KAFKA_RESP_ERR_KAFKA_STORAGE_ERROR")
        case RD_KAFKA_RESP_ERR_LOG_DIR_NOT_FOUND => Some("RD_KAFKA_RESP_ERR_LOG_DIR_NOT_FOUND")
        case RD_KAFKA_RESP_ERR_SASL_AUTHENTICATION_FAILED => Some("RD_KAFKA_RESP_ERR_SASL_AUTHENTICATION_FAILED")
        case RD_KAFKA_RESP_ERR_UNKNOWN_PRODUCER_ID => Some("RD_KAFKA_RESP_ERR_UNKNOWN_PRODUCER_ID")
        case RD_KAFKA_RESP_ERR_REASSIGNMENT_IN_PROGRESS => Some("RD_KAFKA_RESP_ERR_REASSIGNMENT_IN_PROGRESS")
        case RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_AUTH_DISABLED => Some("RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_AUTH_DISABLED")
        case RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_NOT_FOUND => Some("RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_NOT_FOUND")
        case RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_OWNER_MISMATCH => Some("RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_OWNER_MISMATCH")
        case RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_REQUEST_NOT_ALLOWED => Some("RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_REQUEST_NOT_ALLOWED")
        case RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_AUTHORIZATION_FAILED => Some("RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_AUTHORIZATION_FAILED")
        case RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_EXPIRED => Some("RD_KAFKA_RESP_ERR_DELEGATION_TOKEN_EXPIRED")
        case RD_KAFKA_RESP_ERR_INVALID_PRINCIPAL_TYPE => Some("RD_KAFKA_RESP_ERR_INVALID_PRINCIPAL_TYPE")
        case RD_KAFKA_RESP_ERR_NON_EMPTY_GROUP => Some("RD_KAFKA_RESP_ERR_NON_EMPTY_GROUP")
        case RD_KAFKA_RESP_ERR_GROUP_ID_NOT_FOUND => Some("RD_KAFKA_RESP_ERR_GROUP_ID_NOT_FOUND")
        case RD_KAFKA_RESP_ERR_FETCH_SESSION_ID_NOT_FOUND => Some("RD_KAFKA_RESP_ERR_FETCH_SESSION_ID_NOT_FOUND")
        case RD_KAFKA_RESP_ERR_INVALID_FETCH_SESSION_EPOCH => Some("RD_KAFKA_RESP_ERR_INVALID_FETCH_SESSION_EPOCH")
        case RD_KAFKA_RESP_ERR_LISTENER_NOT_FOUND => Some("RD_KAFKA_RESP_ERR_LISTENER_NOT_FOUND")
        case RD_KAFKA_RESP_ERR_TOPIC_DELETION_DISABLED => Some("RD_KAFKA_RESP_ERR_TOPIC_DELETION_DISABLED")
        case RD_KAFKA_RESP_ERR_FENCED_LEADER_EPOCH => Some("RD_KAFKA_RESP_ERR_FENCED_LEADER_EPOCH")
        case RD_KAFKA_RESP_ERR_UNKNOWN_LEADER_EPOCH => Some("RD_KAFKA_RESP_ERR_UNKNOWN_LEADER_EPOCH")
        case RD_KAFKA_RESP_ERR_UNSUPPORTED_COMPRESSION_TYPE => Some("RD_KAFKA_RESP_ERR_UNSUPPORTED_COMPRESSION_TYPE")
        case RD_KAFKA_RESP_ERR_STALE_BROKER_EPOCH => Some("RD_KAFKA_RESP_ERR_STALE_BROKER_EPOCH")
        case RD_KAFKA_RESP_ERR_OFFSET_NOT_AVAILABLE => Some("RD_KAFKA_RESP_ERR_OFFSET_NOT_AVAILABLE")
        case RD_KAFKA_RESP_ERR_MEMBER_ID_REQUIRED => Some("RD_KAFKA_RESP_ERR_MEMBER_ID_REQUIRED")
        case RD_KAFKA_RESP_ERR_PREFERRED_LEADER_NOT_AVAILABLE => Some("RD_KAFKA_RESP_ERR_PREFERRED_LEADER_NOT_AVAILABLE")
        case RD_KAFKA_RESP_ERR_GROUP_MAX_SIZE_REACHED => Some("RD_KAFKA_RESP_ERR_GROUP_MAX_SIZE_REACHED")
        case RD_KAFKA_RESP_ERR_FENCED_INSTANCE_ID => Some("RD_KAFKA_RESP_ERR_FENCED_INSTANCE_ID")
        case RD_KAFKA_RESP_ERR_ELIGIBLE_LEADERS_NOT_AVAILABLE => Some("RD_KAFKA_RESP_ERR_ELIGIBLE_LEADERS_NOT_AVAILABLE")
        case RD_KAFKA_RESP_ERR_ELECTION_NOT_NEEDED => Some("RD_KAFKA_RESP_ERR_ELECTION_NOT_NEEDED")
        case RD_KAFKA_RESP_ERR_NO_REASSIGNMENT_IN_PROGRESS => Some("RD_KAFKA_RESP_ERR_NO_REASSIGNMENT_IN_PROGRESS")
        case RD_KAFKA_RESP_ERR_GROUP_SUBSCRIBED_TO_TOPIC => Some("RD_KAFKA_RESP_ERR_GROUP_SUBSCRIBED_TO_TOPIC")
        case RD_KAFKA_RESP_ERR_INVALID_RECORD => Some("RD_KAFKA_RESP_ERR_INVALID_RECORD")
        case RD_KAFKA_RESP_ERR_UNSTABLE_OFFSET_COMMIT => Some("RD_KAFKA_RESP_ERR_UNSTABLE_OFFSET_COMMIT")
        case RD_KAFKA_RESP_ERR_THROTTLING_QUOTA_EXCEEDED => Some("RD_KAFKA_RESP_ERR_THROTTLING_QUOTA_EXCEEDED")
        case RD_KAFKA_RESP_ERR_PRODUCER_FENCED => Some("RD_KAFKA_RESP_ERR_PRODUCER_FENCED")
        case RD_KAFKA_RESP_ERR_RESOURCE_NOT_FOUND => Some("RD_KAFKA_RESP_ERR_RESOURCE_NOT_FOUND")
        case RD_KAFKA_RESP_ERR_DUPLICATE_RESOURCE => Some("RD_KAFKA_RESP_ERR_DUPLICATE_RESOURCE")
        case RD_KAFKA_RESP_ERR_UNACCEPTABLE_CREDENTIAL => Some("RD_KAFKA_RESP_ERR_UNACCEPTABLE_CREDENTIAL")
        case RD_KAFKA_RESP_ERR_INCONSISTENT_VOTER_SET => Some("RD_KAFKA_RESP_ERR_INCONSISTENT_VOTER_SET")
        case RD_KAFKA_RESP_ERR_INVALID_UPDATE_VERSION => Some("RD_KAFKA_RESP_ERR_INVALID_UPDATE_VERSION")
        case RD_KAFKA_RESP_ERR_FEATURE_UPDATE_FAILED => Some("RD_KAFKA_RESP_ERR_FEATURE_UPDATE_FAILED")
        case RD_KAFKA_RESP_ERR_PRINCIPAL_DESERIALIZATION_FAILURE => Some("RD_KAFKA_RESP_ERR_PRINCIPAL_DESERIALIZATION_FAILURE")
        case RD_KAFKA_RESP_ERR_END_ALL => Some("RD_KAFKA_RESP_ERR_END_ALL")
        case _ => None
    extension (a: rd_kafka_resp_err_t)
      inline def &(b: rd_kafka_resp_err_t): rd_kafka_resp_err_t = a & b
      inline def |(b: rd_kafka_resp_err_t): rd_kafka_resp_err_t = a | b
      inline def is(b: rd_kafka_resp_err_t): Boolean = (a & b) == b

  /**
   * librdkafka internal thread type.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_thread_type_t = CUnsignedInt
  object rd_kafka_thread_type_t extends CEnumU[rd_kafka_thread_type_t]:
    given _tag: Tag[rd_kafka_thread_type_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_thread_type_t = a.toUInt
    val RD_KAFKA_THREAD_MAIN = define(0)
    val RD_KAFKA_THREAD_BACKGROUND = define(1)
    val RD_KAFKA_THREAD_BROKER = define(2)
    inline def getName(inline value: rd_kafka_thread_type_t): Option[String] =
      inline value match
        case RD_KAFKA_THREAD_MAIN => Some("RD_KAFKA_THREAD_MAIN")
        case RD_KAFKA_THREAD_BACKGROUND => Some("RD_KAFKA_THREAD_BACKGROUND")
        case RD_KAFKA_THREAD_BROKER => Some("RD_KAFKA_THREAD_BROKER")
        case _ => None
    extension (a: rd_kafka_thread_type_t)
      inline def &(b: rd_kafka_thread_type_t): rd_kafka_thread_type_t = a & b
      inline def |(b: rd_kafka_thread_type_t): rd_kafka_thread_type_t = a | b
      inline def is(b: rd_kafka_thread_type_t): Boolean = (a & b) == b

  /**
   * Timestamp types
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_timestamp_type_t = CUnsignedInt
  object rd_kafka_timestamp_type_t extends CEnumU[rd_kafka_timestamp_type_t]:
    given _tag: Tag[rd_kafka_timestamp_type_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_timestamp_type_t = a.toUInt
    val RD_KAFKA_TIMESTAMP_NOT_AVAILABLE = define(0)
    val RD_KAFKA_TIMESTAMP_CREATE_TIME = define(1)
    val RD_KAFKA_TIMESTAMP_LOG_APPEND_TIME = define(2)
    inline def getName(inline value: rd_kafka_timestamp_type_t): Option[String] =
      inline value match
        case RD_KAFKA_TIMESTAMP_NOT_AVAILABLE => Some("RD_KAFKA_TIMESTAMP_NOT_AVAILABLE")
        case RD_KAFKA_TIMESTAMP_CREATE_TIME => Some("RD_KAFKA_TIMESTAMP_CREATE_TIME")
        case RD_KAFKA_TIMESTAMP_LOG_APPEND_TIME => Some("RD_KAFKA_TIMESTAMP_LOG_APPEND_TIME")
        case _ => None
    extension (a: rd_kafka_timestamp_type_t)
      inline def &(b: rd_kafka_timestamp_type_t): rd_kafka_timestamp_type_t = a & b
      inline def |(b: rd_kafka_timestamp_type_t): rd_kafka_timestamp_type_t = a | b
      inline def is(b: rd_kafka_timestamp_type_t): Boolean = (a & b) == b

  /**
   * rd_kafka_t handle type.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_type_t = CUnsignedInt
  object rd_kafka_type_t extends CEnumU[rd_kafka_type_t]:
    given _tag: Tag[rd_kafka_type_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_type_t = a.toUInt
    val RD_KAFKA_PRODUCER = define(0)
    val RD_KAFKA_CONSUMER = define(1)
    inline def getName(inline value: rd_kafka_type_t): Option[String] =
      inline value match
        case RD_KAFKA_PRODUCER => Some("RD_KAFKA_PRODUCER")
        case RD_KAFKA_CONSUMER => Some("RD_KAFKA_CONSUMER")
        case _ => None
    extension (a: rd_kafka_type_t)
      inline def &(b: rd_kafka_type_t): rd_kafka_type_t = a & b
      inline def |(b: rd_kafka_type_t): rd_kafka_type_t = a | b
      inline def is(b: rd_kafka_type_t): Boolean = (a & b) == b

  /**
   * Var-arg tag types
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_vtype_t = CUnsignedInt
  object rd_kafka_vtype_t extends CEnumU[rd_kafka_vtype_t]:
    given _tag: Tag[rd_kafka_vtype_t] = Tag.UInt
    inline def define(inline a: Long): rd_kafka_vtype_t = a.toUInt
    val RD_KAFKA_VTYPE_END = define(0)
    val RD_KAFKA_VTYPE_TOPIC = define(1)
    val RD_KAFKA_VTYPE_RKT = define(2)
    val RD_KAFKA_VTYPE_PARTITION = define(3)
    val RD_KAFKA_VTYPE_VALUE = define(4)
    val RD_KAFKA_VTYPE_KEY = define(5)
    val RD_KAFKA_VTYPE_OPAQUE = define(6)
    val RD_KAFKA_VTYPE_MSGFLAGS = define(7)
    val RD_KAFKA_VTYPE_TIMESTAMP = define(8)
    val RD_KAFKA_VTYPE_HEADER = define(9)
    val RD_KAFKA_VTYPE_HEADERS = define(10)
    inline def getName(inline value: rd_kafka_vtype_t): Option[String] =
      inline value match
        case RD_KAFKA_VTYPE_END => Some("RD_KAFKA_VTYPE_END")
        case RD_KAFKA_VTYPE_TOPIC => Some("RD_KAFKA_VTYPE_TOPIC")
        case RD_KAFKA_VTYPE_RKT => Some("RD_KAFKA_VTYPE_RKT")
        case RD_KAFKA_VTYPE_PARTITION => Some("RD_KAFKA_VTYPE_PARTITION")
        case RD_KAFKA_VTYPE_VALUE => Some("RD_KAFKA_VTYPE_VALUE")
        case RD_KAFKA_VTYPE_KEY => Some("RD_KAFKA_VTYPE_KEY")
        case RD_KAFKA_VTYPE_OPAQUE => Some("RD_KAFKA_VTYPE_OPAQUE")
        case RD_KAFKA_VTYPE_MSGFLAGS => Some("RD_KAFKA_VTYPE_MSGFLAGS")
        case RD_KAFKA_VTYPE_TIMESTAMP => Some("RD_KAFKA_VTYPE_TIMESTAMP")
        case RD_KAFKA_VTYPE_HEADER => Some("RD_KAFKA_VTYPE_HEADER")
        case RD_KAFKA_VTYPE_HEADERS => Some("RD_KAFKA_VTYPE_HEADERS")
        case _ => None
    extension (a: rd_kafka_vtype_t)
      inline def &(b: rd_kafka_vtype_t): rd_kafka_vtype_t = a & b
      inline def |(b: rd_kafka_vtype_t): rd_kafka_vtype_t = a | b
      inline def is(b: rd_kafka_vtype_t): Boolean = (a & b) == b

object aliases:
  import _root_.librdkafka.enumerations.*
  import _root_.librdkafka.aliases.*
  import _root_.librdkafka.structs.*

  type FILE = libc.stdio.FILE
  object FILE: 
    val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
    inline def apply(inline o: libc.stdio.FILE): FILE = o
    extension (v: FILE)
      inline def value: libc.stdio.FILE = v

  type int16_t = scala.Short
  object int16_t: 
    val _tag: Tag[int16_t] = summon[Tag[scala.Short]]
    inline def apply(inline o: scala.Short): int16_t = o
    extension (v: int16_t)
      inline def value: scala.Short = v

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

  type mode_t = posix.sys.types.mode_t
  object mode_t: 
    val _tag: Tag[mode_t] = summon[Tag[posix.sys.types.mode_t]]
    inline def apply(inline o: posix.sys.types.mode_t): mode_t = o
    extension (v: mode_t)
      inline def value: posix.sys.types.mode_t = v

  /**
   * ACL Binding filter is used to filter access control lists.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_AclBindingFilter_t = rd_kafka_AclBinding_t
  object rd_kafka_AclBindingFilter_t: 
    given _tag: Tag[rd_kafka_AclBindingFilter_t] = rd_kafka_AclBinding_t._tag
    inline def apply(inline o: rd_kafka_AclBinding_t): rd_kafka_AclBindingFilter_t = o
    extension (v: rd_kafka_AclBindingFilter_t)
      inline def value: rd_kafka_AclBinding_t = v

  /**
   * AlterConfigs result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_AlterConfigs_result_t = rd_kafka_event_t
  object rd_kafka_AlterConfigs_result_t: 
    given _tag: Tag[rd_kafka_AlterConfigs_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_AlterConfigs_result_t = o
    extension (v: rd_kafka_AlterConfigs_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * AlterConsumerGroupOffsets result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_AlterConsumerGroupOffsets_result_t = rd_kafka_event_t
  object rd_kafka_AlterConsumerGroupOffsets_result_t: 
    given _tag: Tag[rd_kafka_AlterConsumerGroupOffsets_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_AlterConsumerGroupOffsets_result_t = o
    extension (v: rd_kafka_AlterConsumerGroupOffsets_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * CreateAcls result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_CreateAcls_result_t = rd_kafka_event_t
  object rd_kafka_CreateAcls_result_t: 
    given _tag: Tag[rd_kafka_CreateAcls_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_CreateAcls_result_t = o
    extension (v: rd_kafka_CreateAcls_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * CreatePartitions result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_CreatePartitions_result_t = rd_kafka_event_t
  object rd_kafka_CreatePartitions_result_t: 
    given _tag: Tag[rd_kafka_CreatePartitions_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_CreatePartitions_result_t = o
    extension (v: rd_kafka_CreatePartitions_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * CreateTopics result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_CreateTopics_result_t = rd_kafka_event_t
  object rd_kafka_CreateTopics_result_t: 
    given _tag: Tag[rd_kafka_CreateTopics_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_CreateTopics_result_t = o
    extension (v: rd_kafka_CreateTopics_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * DeleteAcls result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_DeleteAcls_result_t = rd_kafka_event_t
  object rd_kafka_DeleteAcls_result_t: 
    given _tag: Tag[rd_kafka_DeleteAcls_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_DeleteAcls_result_t = o
    extension (v: rd_kafka_DeleteAcls_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * DeleteConsumerGroupOffsets result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_DeleteConsumerGroupOffsets_result_t = rd_kafka_event_t
  object rd_kafka_DeleteConsumerGroupOffsets_result_t: 
    given _tag: Tag[rd_kafka_DeleteConsumerGroupOffsets_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_DeleteConsumerGroupOffsets_result_t = o
    extension (v: rd_kafka_DeleteConsumerGroupOffsets_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * DeleteGroups result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_DeleteGroups_result_t = rd_kafka_event_t
  object rd_kafka_DeleteGroups_result_t: 
    given _tag: Tag[rd_kafka_DeleteGroups_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_DeleteGroups_result_t = o
    extension (v: rd_kafka_DeleteGroups_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * DeleteRecords result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_DeleteRecords_result_t = rd_kafka_event_t
  object rd_kafka_DeleteRecords_result_t: 
    given _tag: Tag[rd_kafka_DeleteRecords_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_DeleteRecords_result_t = o
    extension (v: rd_kafka_DeleteRecords_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * DeleteTopics result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_DeleteTopics_result_t = rd_kafka_event_t
  object rd_kafka_DeleteTopics_result_t: 
    given _tag: Tag[rd_kafka_DeleteTopics_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_DeleteTopics_result_t = o
    extension (v: rd_kafka_DeleteTopics_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * DescribeAcls result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_DescribeAcls_result_t = rd_kafka_event_t
  object rd_kafka_DescribeAcls_result_t: 
    given _tag: Tag[rd_kafka_DescribeAcls_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_DescribeAcls_result_t = o
    extension (v: rd_kafka_DescribeAcls_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * CreateTopics result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_DescribeConfigs_result_t = rd_kafka_event_t
  object rd_kafka_DescribeConfigs_result_t: 
    given _tag: Tag[rd_kafka_DescribeConfigs_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_DescribeConfigs_result_t = o
    extension (v: rd_kafka_DescribeConfigs_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * DescribeConsumerGroups result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_DescribeConsumerGroups_result_t = rd_kafka_event_t
  object rd_kafka_DescribeConsumerGroups_result_t: 
    given _tag: Tag[rd_kafka_DescribeConsumerGroups_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_DescribeConsumerGroups_result_t = o
    extension (v: rd_kafka_DescribeConsumerGroups_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * ListConsumerGroupOffsets result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_ListConsumerGroupOffsets_result_t = rd_kafka_event_t
  object rd_kafka_ListConsumerGroupOffsets_result_t: 
    given _tag: Tag[rd_kafka_ListConsumerGroupOffsets_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_ListConsumerGroupOffsets_result_t = o
    extension (v: rd_kafka_ListConsumerGroupOffsets_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * ListConsumerGroups result type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_ListConsumerGroups_result_t = rd_kafka_event_t
  object rd_kafka_ListConsumerGroups_result_t: 
    given _tag: Tag[rd_kafka_ListConsumerGroups_result_t] = rd_kafka_event_t._tag
    inline def apply(inline o: rd_kafka_event_t): rd_kafka_ListConsumerGroups_result_t = o
    extension (v: rd_kafka_ListConsumerGroups_result_t)
      inline def value: rd_kafka_event_t = v

  /**
   * Event types
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_event_type_t = CInt
  object rd_kafka_event_type_t: 
    given _tag: Tag[rd_kafka_event_type_t] = Tag.Int
    inline def apply(inline o: CInt): rd_kafka_event_type_t = o
    extension (v: rd_kafka_event_type_t)
      inline def value: CInt = v

  /**
   * on_acknowledgement() is called to inform interceptors that a message was succesfully delivered or permanently failed delivery. The interceptor chain is called from internal librdkafka background threads, or rd_kafka_produce*() if the partitioner failed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_acknowledgement_t = CFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_acknowledgement_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_acknowledgement_t] = Tag.materializeCFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_acknowledgement_t = o
    extension (v: rd_kafka_interceptor_f_on_acknowledgement_t)
      inline def value: CFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * on_broker_state_change() is called just after a broker has been created or its state has been changed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_broker_state_change_t = CFuncPtr7[Ptr[rd_kafka_t], int32_t, CString, CString, CInt, CString, Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_broker_state_change_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_broker_state_change_t] = Tag.materializeCFuncPtr7[Ptr[rd_kafka_t], int32_t, CString, CString, CInt, CString, Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr7[Ptr[rd_kafka_t], int32_t, CString, CString, CInt, CString, Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_broker_state_change_t = o
    extension (v: rd_kafka_interceptor_f_on_broker_state_change_t)
      inline def value: CFuncPtr7[Ptr[rd_kafka_t], int32_t, CString, CString, CInt, CString, Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * on_commit() is called on completed or failed offset commit. It is called from internal librdkafka threads.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_commit_t = CFuncPtr4[Ptr[rd_kafka_t], Ptr[rd_kafka_topic_partition_list_t], rd_kafka_resp_err_t, Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_commit_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_commit_t] = Tag.materializeCFuncPtr4[Ptr[rd_kafka_t], Ptr[rd_kafka_topic_partition_list_t], rd_kafka_resp_err_t, Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr4[Ptr[rd_kafka_t], Ptr[rd_kafka_topic_partition_list_t], rd_kafka_resp_err_t, Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_commit_t = o
    extension (v: rd_kafka_interceptor_f_on_commit_t)
      inline def value: CFuncPtr4[Ptr[rd_kafka_t], Ptr[rd_kafka_topic_partition_list_t], rd_kafka_resp_err_t, Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * on_conf_destroy() is called from rd_kafka_*_conf_destroy() in the order the interceptors were added.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_conf_destroy_t = CFuncPtr1[Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_conf_destroy_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_conf_destroy_t] = Tag.materializeCFuncPtr1[Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr1[Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_conf_destroy_t = o
    extension (v: rd_kafka_interceptor_f_on_conf_destroy_t)
      inline def value: CFuncPtr1[Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * on_conf_dup() is called from rd_kafka_conf_dup() in the order the interceptors were added and is used to let an interceptor re-register its conf interecptors with a new opaque value. The on_conf_dup() method is called prior to the configuration from old_conf being copied to new_conf.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_conf_dup_t = CFuncPtr5[Ptr[rd_kafka_conf_t], Ptr[rd_kafka_conf_t], size_t, Ptr[CString], Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_conf_dup_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_conf_dup_t] = Tag.materializeCFuncPtr5[Ptr[rd_kafka_conf_t], Ptr[rd_kafka_conf_t], size_t, Ptr[CString], Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr5[Ptr[rd_kafka_conf_t], Ptr[rd_kafka_conf_t], size_t, Ptr[CString], Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_conf_dup_t = o
    extension (v: rd_kafka_interceptor_f_on_conf_dup_t)
      inline def value: CFuncPtr5[Ptr[rd_kafka_conf_t], Ptr[rd_kafka_conf_t], size_t, Ptr[CString], Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * on_conf_set() is called from rd_kafka_*_conf_set() in the order the interceptors were added.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_conf_set_t = CFuncPtr6[Ptr[rd_kafka_conf_t], CString, CString, CString, size_t, Ptr[Byte], rd_kafka_conf_res_t]
  object rd_kafka_interceptor_f_on_conf_set_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_conf_set_t] = Tag.materializeCFuncPtr6[Ptr[rd_kafka_conf_t], CString, CString, CString, size_t, Ptr[Byte], rd_kafka_conf_res_t]
    inline def apply(inline o: CFuncPtr6[Ptr[rd_kafka_conf_t], CString, CString, CString, size_t, Ptr[Byte], rd_kafka_conf_res_t]): rd_kafka_interceptor_f_on_conf_set_t = o
    extension (v: rd_kafka_interceptor_f_on_conf_set_t)
      inline def value: CFuncPtr6[Ptr[rd_kafka_conf_t], CString, CString, CString, size_t, Ptr[Byte], rd_kafka_conf_res_t] = v

  /**
   * on_consume() is called just prior to passing the message to the application in rd_kafka_consumer_poll(), rd_kafka_consume*(), the event interface, etc.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_consume_t = CFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_consume_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_consume_t] = Tag.materializeCFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_consume_t = o
    extension (v: rd_kafka_interceptor_f_on_consume_t)
      inline def value: CFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * on_destroy() is called from rd_kafka_destroy() or (rd_kafka_new() if rd_kafka_new() fails during initialization).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_destroy_t = CFuncPtr2[Ptr[rd_kafka_t], Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_destroy_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_destroy_t] = Tag.materializeCFuncPtr2[Ptr[rd_kafka_t], Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr2[Ptr[rd_kafka_t], Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_destroy_t = o
    extension (v: rd_kafka_interceptor_f_on_destroy_t)
      inline def value: CFuncPtr2[Ptr[rd_kafka_t], Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * on_new() is called from rd_kafka_new() prior toreturning the newly created client instance to the application.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_new_t = CFuncPtr5[Ptr[rd_kafka_t], Ptr[rd_kafka_conf_t], Ptr[Byte], CString, size_t, rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_new_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_new_t] = Tag.materializeCFuncPtr5[Ptr[rd_kafka_t], Ptr[rd_kafka_conf_t], Ptr[Byte], CString, size_t, rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr5[Ptr[rd_kafka_t], Ptr[rd_kafka_conf_t], Ptr[Byte], CString, size_t, rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_new_t = o
    extension (v: rd_kafka_interceptor_f_on_new_t)
      inline def value: CFuncPtr5[Ptr[rd_kafka_t], Ptr[rd_kafka_conf_t], Ptr[Byte], CString, size_t, rd_kafka_resp_err_t] = v

  /**
   * on_request_sent() is called when a request has been fully written to a broker TCP connections socket.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_request_sent_t = CFuncPtr9[Ptr[rd_kafka_t], CInt, CString, int32_t, int16_t, int16_t, int32_t, size_t, Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_request_sent_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_request_sent_t] = Tag.materializeCFuncPtr9[Ptr[rd_kafka_t], CInt, CString, int32_t, int16_t, int16_t, int32_t, size_t, Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr9[Ptr[rd_kafka_t], CInt, CString, int32_t, int16_t, int16_t, int32_t, size_t, Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_request_sent_t = o
    extension (v: rd_kafka_interceptor_f_on_request_sent_t)
      inline def value: CFuncPtr9[Ptr[rd_kafka_t], CInt, CString, int32_t, int16_t, int16_t, int32_t, size_t, Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * on_response_received() is called when a protocol response has been fully received from a broker TCP connection socket but before the response payload is parsed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_response_received_t = CFuncPtr11[Ptr[rd_kafka_t], CInt, CString, int32_t, int16_t, int16_t, int32_t, size_t, int64_t, rd_kafka_resp_err_t, Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_response_received_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_response_received_t] = Tag.materializeCFuncPtr11[Ptr[rd_kafka_t], CInt, CString, int32_t, int16_t, int16_t, int32_t, size_t, int64_t, rd_kafka_resp_err_t, Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr11[Ptr[rd_kafka_t], CInt, CString, int32_t, int16_t, int16_t, int32_t, size_t, int64_t, rd_kafka_resp_err_t, Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_response_received_t = o
    extension (v: rd_kafka_interceptor_f_on_response_received_t)
      inline def value: CFuncPtr11[Ptr[rd_kafka_t], CInt, CString, int32_t, int16_t, int16_t, int32_t, size_t, int64_t, rd_kafka_resp_err_t, Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * on_send() is called from rd_kafka_produce*() (et.al) prior to the partitioner being called.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_send_t = CFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_send_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_send_t] = Tag.materializeCFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_send_t = o
    extension (v: rd_kafka_interceptor_f_on_send_t)
      inline def value: CFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * on_thread_exit() is called just prior to a librdkafka-managed thread exiting from the exiting thread itself.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_thread_exit_t = CFuncPtr4[Ptr[rd_kafka_t], rd_kafka_thread_type_t, CString, Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_thread_exit_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_thread_exit_t] = Tag.materializeCFuncPtr4[Ptr[rd_kafka_t], rd_kafka_thread_type_t, CString, Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr4[Ptr[rd_kafka_t], rd_kafka_thread_type_t, CString, Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_thread_exit_t = o
    extension (v: rd_kafka_interceptor_f_on_thread_exit_t)
      inline def value: CFuncPtr4[Ptr[rd_kafka_t], rd_kafka_thread_type_t, CString, Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * on_thread_start() is called from a newly created librdkafka-managed thread.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_interceptor_f_on_thread_start_t = CFuncPtr4[Ptr[rd_kafka_t], rd_kafka_thread_type_t, CString, Ptr[Byte], rd_kafka_resp_err_t]
  object rd_kafka_interceptor_f_on_thread_start_t: 
    given _tag: Tag[rd_kafka_interceptor_f_on_thread_start_t] = Tag.materializeCFuncPtr4[Ptr[rd_kafka_t], rd_kafka_thread_type_t, CString, Ptr[Byte], rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr4[Ptr[rd_kafka_t], rd_kafka_thread_type_t, CString, Ptr[Byte], rd_kafka_resp_err_t]): rd_kafka_interceptor_f_on_thread_start_t = o
    extension (v: rd_kafka_interceptor_f_on_thread_start_t)
      inline def value: CFuncPtr4[Ptr[rd_kafka_t], rd_kafka_thread_type_t, CString, Ptr[Byte], rd_kafka_resp_err_t] = v

  /**
   * Plugin's configuration initializer method called each time the library is referenced from configuration (even if previously loaded by another client instance).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  type rd_kafka_plugin_f_conf_init_t = CFuncPtr4[Ptr[rd_kafka_conf_t], Ptr[Ptr[Byte]], CString, size_t, rd_kafka_resp_err_t]
  object rd_kafka_plugin_f_conf_init_t: 
    given _tag: Tag[rd_kafka_plugin_f_conf_init_t] = Tag.materializeCFuncPtr4[Ptr[rd_kafka_conf_t], Ptr[Ptr[Byte]], CString, size_t, rd_kafka_resp_err_t]
    inline def apply(inline o: CFuncPtr4[Ptr[rd_kafka_conf_t], Ptr[Ptr[Byte]], CString, size_t, rd_kafka_resp_err_t]): rd_kafka_plugin_f_conf_init_t = o
    extension (v: rd_kafka_plugin_f_conf_init_t)
      inline def value: CFuncPtr4[Ptr[rd_kafka_conf_t], Ptr[Ptr[Byte]], CString, size_t, rd_kafka_resp_err_t] = v

  type size_t = libc.stddef.size_t
  object size_t: 
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t)
      inline def value: libc.stddef.size_t = v

  type sockaddr = posix.sys.socket.sockaddr
  object sockaddr: 
    val _tag: Tag[sockaddr] = summon[Tag[posix.sys.socket.sockaddr]]
    inline def apply(inline o: posix.sys.socket.sockaddr): sockaddr = o
    extension (v: sockaddr)
      inline def value: posix.sys.socket.sockaddr = v

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

object structs:
  import _root_.librdkafka.enumerations.*
  import _root_.librdkafka.aliases.*
  import _root_.librdkafka.structs.*

  /**
   * Forward declaration to avoid netdb.h or winsock includes
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type addrinfo = CStruct0
  object addrinfo:
    given _tag: Tag[addrinfo] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_AclBinding_s = CStruct0
  object rd_kafka_AclBinding_s:
    given _tag: Tag[rd_kafka_AclBinding_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_AclBinding_t = CStruct0
  object rd_kafka_AclBinding_t:
    given _tag: Tag[rd_kafka_AclBinding_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_AdminOptions_s = CStruct0
  object rd_kafka_AdminOptions_s:
    given _tag: Tag[rd_kafka_AdminOptions_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_AdminOptions_t = CStruct0
  object rd_kafka_AdminOptions_t:
    given _tag: Tag[rd_kafka_AdminOptions_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_AlterConsumerGroupOffsets_s = CStruct0
  object rd_kafka_AlterConsumerGroupOffsets_s:
    given _tag: Tag[rd_kafka_AlterConsumerGroupOffsets_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_AlterConsumerGroupOffsets_t = CStruct0
  object rd_kafka_AlterConsumerGroupOffsets_t:
    given _tag: Tag[rd_kafka_AlterConsumerGroupOffsets_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ConfigEntry_s = CStruct0
  object rd_kafka_ConfigEntry_s:
    given _tag: Tag[rd_kafka_ConfigEntry_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ConfigEntry_t = CStruct0
  object rd_kafka_ConfigEntry_t:
    given _tag: Tag[rd_kafka_ConfigEntry_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ConfigResource_s = CStruct0
  object rd_kafka_ConfigResource_s:
    given _tag: Tag[rd_kafka_ConfigResource_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ConfigResource_t = CStruct0
  object rd_kafka_ConfigResource_t:
    given _tag: Tag[rd_kafka_ConfigResource_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ConsumerGroupDescription_s = CStruct0
  object rd_kafka_ConsumerGroupDescription_s:
    given _tag: Tag[rd_kafka_ConsumerGroupDescription_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ConsumerGroupDescription_t = CStruct0
  object rd_kafka_ConsumerGroupDescription_t:
    given _tag: Tag[rd_kafka_ConsumerGroupDescription_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ConsumerGroupListing_s = CStruct0
  object rd_kafka_ConsumerGroupListing_s:
    given _tag: Tag[rd_kafka_ConsumerGroupListing_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ConsumerGroupListing_t = CStruct0
  object rd_kafka_ConsumerGroupListing_t:
    given _tag: Tag[rd_kafka_ConsumerGroupListing_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_DeleteAcls_result_response_s = CStruct0
  object rd_kafka_DeleteAcls_result_response_s:
    given _tag: Tag[rd_kafka_DeleteAcls_result_response_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_DeleteAcls_result_response_t = CStruct0
  object rd_kafka_DeleteAcls_result_response_t:
    given _tag: Tag[rd_kafka_DeleteAcls_result_response_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_DeleteConsumerGroupOffsets_s = CStruct0
  object rd_kafka_DeleteConsumerGroupOffsets_s:
    given _tag: Tag[rd_kafka_DeleteConsumerGroupOffsets_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_DeleteConsumerGroupOffsets_t = CStruct0
  object rd_kafka_DeleteConsumerGroupOffsets_t:
    given _tag: Tag[rd_kafka_DeleteConsumerGroupOffsets_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_DeleteGroup_s = CStruct0
  object rd_kafka_DeleteGroup_s:
    given _tag: Tag[rd_kafka_DeleteGroup_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_DeleteGroup_t = CStruct0
  object rd_kafka_DeleteGroup_t:
    given _tag: Tag[rd_kafka_DeleteGroup_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_DeleteRecords_s = CStruct0
  object rd_kafka_DeleteRecords_s:
    given _tag: Tag[rd_kafka_DeleteRecords_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_DeleteRecords_t = CStruct0
  object rd_kafka_DeleteRecords_t:
    given _tag: Tag[rd_kafka_DeleteRecords_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_DeleteTopic_s = CStruct0
  object rd_kafka_DeleteTopic_s:
    given _tag: Tag[rd_kafka_DeleteTopic_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_DeleteTopic_t = CStruct0
  object rd_kafka_DeleteTopic_t:
    given _tag: Tag[rd_kafka_DeleteTopic_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ListConsumerGroupOffsets_s = CStruct0
  object rd_kafka_ListConsumerGroupOffsets_s:
    given _tag: Tag[rd_kafka_ListConsumerGroupOffsets_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ListConsumerGroupOffsets_t = CStruct0
  object rd_kafka_ListConsumerGroupOffsets_t:
    given _tag: Tag[rd_kafka_ListConsumerGroupOffsets_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ListConsumerGroupsResult_s = CStruct0
  object rd_kafka_ListConsumerGroupsResult_s:
    given _tag: Tag[rd_kafka_ListConsumerGroupsResult_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_ListConsumerGroupsResult_t = CStruct0
  object rd_kafka_ListConsumerGroupsResult_t:
    given _tag: Tag[rd_kafka_ListConsumerGroupsResult_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_MemberAssignment_s = CStruct0
  object rd_kafka_MemberAssignment_s:
    given _tag: Tag[rd_kafka_MemberAssignment_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_MemberAssignment_t = CStruct0
  object rd_kafka_MemberAssignment_t:
    given _tag: Tag[rd_kafka_MemberAssignment_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_MemberDescription_s = CStruct0
  object rd_kafka_MemberDescription_s:
    given _tag: Tag[rd_kafka_MemberDescription_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_MemberDescription_t = CStruct0
  object rd_kafka_MemberDescription_t:
    given _tag: Tag[rd_kafka_MemberDescription_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_NewPartitions_s = CStruct0
  object rd_kafka_NewPartitions_s:
    given _tag: Tag[rd_kafka_NewPartitions_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_NewPartitions_t = CStruct0
  object rd_kafka_NewPartitions_t:
    given _tag: Tag[rd_kafka_NewPartitions_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_NewTopic_s = CStruct0
  object rd_kafka_NewTopic_s:
    given _tag: Tag[rd_kafka_NewTopic_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_NewTopic_t = CStruct0
  object rd_kafka_NewTopic_t:
    given _tag: Tag[rd_kafka_NewTopic_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_Node_s = CStruct0
  object rd_kafka_Node_s:
    given _tag: Tag[rd_kafka_Node_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_Node_t = CStruct0
  object rd_kafka_Node_t:
    given _tag: Tag[rd_kafka_Node_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_acl_result_s = CStruct0
  object rd_kafka_acl_result_s:
    given _tag: Tag[rd_kafka_acl_result_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_acl_result_t = CStruct0
  object rd_kafka_acl_result_t:
    given _tag: Tag[rd_kafka_acl_result_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_conf_s = CStruct0
  object rd_kafka_conf_s:
    given _tag: Tag[rd_kafka_conf_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_conf_t = CStruct0
  object rd_kafka_conf_t:
    given _tag: Tag[rd_kafka_conf_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_consumer_group_metadata_s = CStruct0
  object rd_kafka_consumer_group_metadata_s:
    given _tag: Tag[rd_kafka_consumer_group_metadata_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_consumer_group_metadata_t = CStruct0
  object rd_kafka_consumer_group_metadata_t:
    given _tag: Tag[rd_kafka_consumer_group_metadata_t] = Tag.materializeCStruct0Tag

  /**
   * Error code value, name and description. Typically for use with language bindings to automatically expose the full set of librdkafka error codes.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_err_desc = CStruct3[rd_kafka_resp_err_t, CString, CString]
  object rd_kafka_err_desc:
    given _tag: Tag[rd_kafka_err_desc] = Tag.materializeCStruct3Tag[rd_kafka_resp_err_t, CString, CString]
    def apply()(using Zone): Ptr[rd_kafka_err_desc] = scala.scalanative.unsafe.alloc[rd_kafka_err_desc](1)
    def apply(code : rd_kafka_resp_err_t, name : CString, desc : CString)(using Zone): Ptr[rd_kafka_err_desc] = 
      val ____ptr = apply()
      (!____ptr).code = code
      (!____ptr).name = name
      (!____ptr).desc = desc
      ____ptr
    extension (struct: rd_kafka_err_desc)
      def code : rd_kafka_resp_err_t = struct._1
      def code_=(value: rd_kafka_resp_err_t): Unit = !struct.at1 = value
      def name : CString = struct._2
      def name_=(value: CString): Unit = !struct.at2 = value
      def desc : CString = struct._3
      def desc_=(value: CString): Unit = !struct.at3 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_error_s = CStruct0
  object rd_kafka_error_s:
    given _tag: Tag[rd_kafka_error_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_error_t = CStruct0
  object rd_kafka_error_t:
    given _tag: Tag[rd_kafka_error_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_event_t = CStruct0
  object rd_kafka_event_t:
    given _tag: Tag[rd_kafka_event_t] = Tag.materializeCStruct0Tag

  /**
   * Group information
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_group_info = CStruct8[rd_kafka_metadata_broker, CString, rd_kafka_resp_err_t, CString, CString, CString, Ptr[rd_kafka_group_member_info], CInt]
  object rd_kafka_group_info:
    given _tag: Tag[rd_kafka_group_info] = Tag.materializeCStruct8Tag[rd_kafka_metadata_broker, CString, rd_kafka_resp_err_t, CString, CString, CString, Ptr[rd_kafka_group_member_info], CInt]
    def apply()(using Zone): Ptr[rd_kafka_group_info] = scala.scalanative.unsafe.alloc[rd_kafka_group_info](1)
    def apply(broker : rd_kafka_metadata_broker, group : CString, err : rd_kafka_resp_err_t, state : CString, protocol_type : CString, protocol : CString, members : Ptr[rd_kafka_group_member_info], member_cnt : CInt)(using Zone): Ptr[rd_kafka_group_info] = 
      val ____ptr = apply()
      (!____ptr).broker = broker
      (!____ptr).group = group
      (!____ptr).err = err
      (!____ptr).state = state
      (!____ptr).protocol_type = protocol_type
      (!____ptr).protocol = protocol
      (!____ptr).members = members
      (!____ptr).member_cnt = member_cnt
      ____ptr
    extension (struct: rd_kafka_group_info)
      def broker : rd_kafka_metadata_broker = struct._1
      def broker_=(value: rd_kafka_metadata_broker): Unit = !struct.at1 = value
      def group : CString = struct._2
      def group_=(value: CString): Unit = !struct.at2 = value
      def err : rd_kafka_resp_err_t = struct._3
      def err_=(value: rd_kafka_resp_err_t): Unit = !struct.at3 = value
      def state : CString = struct._4
      def state_=(value: CString): Unit = !struct.at4 = value
      def protocol_type : CString = struct._5
      def protocol_type_=(value: CString): Unit = !struct.at5 = value
      def protocol : CString = struct._6
      def protocol_=(value: CString): Unit = !struct.at6 = value
      def members : Ptr[rd_kafka_group_member_info] = struct._7
      def members_=(value: Ptr[rd_kafka_group_member_info]): Unit = !struct.at7 = value
      def member_cnt : CInt = struct._8
      def member_cnt_=(value: CInt): Unit = !struct.at8 = value

  /**
   * List of groups
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_group_list = CStruct2[Ptr[rd_kafka_group_info], CInt]
  object rd_kafka_group_list:
    given _tag: Tag[rd_kafka_group_list] = Tag.materializeCStruct2Tag[Ptr[rd_kafka_group_info], CInt]
    def apply()(using Zone): Ptr[rd_kafka_group_list] = scala.scalanative.unsafe.alloc[rd_kafka_group_list](1)
    def apply(groups : Ptr[rd_kafka_group_info], group_cnt : CInt)(using Zone): Ptr[rd_kafka_group_list] = 
      val ____ptr = apply()
      (!____ptr).groups = groups
      (!____ptr).group_cnt = group_cnt
      ____ptr
    extension (struct: rd_kafka_group_list)
      def groups : Ptr[rd_kafka_group_info] = struct._1
      def groups_=(value: Ptr[rd_kafka_group_info]): Unit = !struct.at1 = value
      def group_cnt : CInt = struct._2
      def group_cnt_=(value: CInt): Unit = !struct.at2 = value

  /**
   * Group member information
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_group_member_info = CStruct7[CString, CString, CString, Ptr[Byte], CInt, Ptr[Byte], CInt]
  object rd_kafka_group_member_info:
    given _tag: Tag[rd_kafka_group_member_info] = Tag.materializeCStruct7Tag[CString, CString, CString, Ptr[Byte], CInt, Ptr[Byte], CInt]
    def apply()(using Zone): Ptr[rd_kafka_group_member_info] = scala.scalanative.unsafe.alloc[rd_kafka_group_member_info](1)
    def apply(member_id : CString, client_id : CString, client_host : CString, member_metadata : Ptr[Byte], member_metadata_size : CInt, member_assignment : Ptr[Byte], member_assignment_size : CInt)(using Zone): Ptr[rd_kafka_group_member_info] = 
      val ____ptr = apply()
      (!____ptr).member_id = member_id
      (!____ptr).client_id = client_id
      (!____ptr).client_host = client_host
      (!____ptr).member_metadata = member_metadata
      (!____ptr).member_metadata_size = member_metadata_size
      (!____ptr).member_assignment = member_assignment
      (!____ptr).member_assignment_size = member_assignment_size
      ____ptr
    extension (struct: rd_kafka_group_member_info)
      def member_id : CString = struct._1
      def member_id_=(value: CString): Unit = !struct.at1 = value
      def client_id : CString = struct._2
      def client_id_=(value: CString): Unit = !struct.at2 = value
      def client_host : CString = struct._3
      def client_host_=(value: CString): Unit = !struct.at3 = value
      def member_metadata : Ptr[Byte] = struct._4
      def member_metadata_=(value: Ptr[Byte]): Unit = !struct.at4 = value
      def member_metadata_size : CInt = struct._5
      def member_metadata_size_=(value: CInt): Unit = !struct.at5 = value
      def member_assignment : Ptr[Byte] = struct._6
      def member_assignment_=(value: Ptr[Byte]): Unit = !struct.at6 = value
      def member_assignment_size : CInt = struct._7
      def member_assignment_size_=(value: CInt): Unit = !struct.at7 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_group_result_s = CStruct0
  object rd_kafka_group_result_s:
    given _tag: Tag[rd_kafka_group_result_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_group_result_t = CStruct0
  object rd_kafka_group_result_t:
    given _tag: Tag[rd_kafka_group_result_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_headers_s = CStruct0
  object rd_kafka_headers_s:
    given _tag: Tag[rd_kafka_headers_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_headers_t = CStruct0
  object rd_kafka_headers_t:
    given _tag: Tag[rd_kafka_headers_t] = Tag.materializeCStruct0Tag

  /**
   * A Kafka message as returned by the rd_kafka_consume*() family of functions as well as provided to the Producer dr_msg_cb().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_message_s = CStruct9[rd_kafka_resp_err_t, Ptr[rd_kafka_topic_t], int32_t, Ptr[Byte], size_t, Ptr[Byte], size_t, int64_t, Ptr[Byte]]
  object rd_kafka_message_s:
    given _tag: Tag[rd_kafka_message_s] = Tag.materializeCStruct9Tag[rd_kafka_resp_err_t, Ptr[rd_kafka_topic_t], int32_t, Ptr[Byte], size_t, Ptr[Byte], size_t, int64_t, Ptr[Byte]]
    def apply()(using Zone): Ptr[rd_kafka_message_s] = scala.scalanative.unsafe.alloc[rd_kafka_message_s](1)
    def apply(err : rd_kafka_resp_err_t, rkt : Ptr[rd_kafka_topic_t], partition : int32_t, payload : Ptr[Byte], len : size_t, key : Ptr[Byte], key_len : size_t, offset : int64_t, _private : Ptr[Byte])(using Zone): Ptr[rd_kafka_message_s] = 
      val ____ptr = apply()
      (!____ptr).err = err
      (!____ptr).rkt = rkt
      (!____ptr).partition = partition
      (!____ptr).payload = payload
      (!____ptr).len = len
      (!____ptr).key = key
      (!____ptr).key_len = key_len
      (!____ptr).offset = offset
      (!____ptr)._private = _private
      ____ptr
    extension (struct: rd_kafka_message_s)
      def err : rd_kafka_resp_err_t = struct._1
      def err_=(value: rd_kafka_resp_err_t): Unit = !struct.at1 = value
      def rkt : Ptr[rd_kafka_topic_t] = struct._2
      def rkt_=(value: Ptr[rd_kafka_topic_t]): Unit = !struct.at2 = value
      def partition : int32_t = struct._3
      def partition_=(value: int32_t): Unit = !struct.at3 = value
      def payload : Ptr[Byte] = struct._4
      def payload_=(value: Ptr[Byte]): Unit = !struct.at4 = value
      def len : size_t = struct._5
      def len_=(value: size_t): Unit = !struct.at5 = value
      def key : Ptr[Byte] = struct._6
      def key_=(value: Ptr[Byte]): Unit = !struct.at6 = value
      def key_len : size_t = struct._7
      def key_len_=(value: size_t): Unit = !struct.at7 = value
      def offset : int64_t = struct._8
      def offset_=(value: int64_t): Unit = !struct.at8 = value
      def _private : Ptr[Byte] = struct._9
      def _private_=(value: Ptr[Byte]): Unit = !struct.at9 = value

  /**
   * A Kafka message as returned by the rd_kafka_consume*() family of functions as well as provided to the Producer dr_msg_cb().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_message_t = CStruct9[rd_kafka_resp_err_t, Ptr[rd_kafka_topic_t], int32_t, Ptr[Byte], size_t, Ptr[Byte], size_t, int64_t, Ptr[Byte]]
  object rd_kafka_message_t:
    given _tag: Tag[rd_kafka_message_t] = Tag.materializeCStruct9Tag[rd_kafka_resp_err_t, Ptr[rd_kafka_topic_t], int32_t, Ptr[Byte], size_t, Ptr[Byte], size_t, int64_t, Ptr[Byte]]
    def apply()(using Zone): Ptr[rd_kafka_message_t] = scala.scalanative.unsafe.alloc[rd_kafka_message_t](1)
    def apply(err : rd_kafka_resp_err_t, rkt : Ptr[rd_kafka_topic_t], partition : int32_t, payload : Ptr[Byte], len : size_t, key : Ptr[Byte], key_len : size_t, offset : int64_t, _private : Ptr[Byte])(using Zone): Ptr[rd_kafka_message_t] = 
      val ____ptr = apply()
      (!____ptr).err = err
      (!____ptr).rkt = rkt
      (!____ptr).partition = partition
      (!____ptr).payload = payload
      (!____ptr).len = len
      (!____ptr).key = key
      (!____ptr).key_len = key_len
      (!____ptr).offset = offset
      (!____ptr)._private = _private
      ____ptr
    extension (struct: rd_kafka_message_t)
      def err : rd_kafka_resp_err_t = struct._1
      def err_=(value: rd_kafka_resp_err_t): Unit = !struct.at1 = value
      def rkt : Ptr[rd_kafka_topic_t] = struct._2
      def rkt_=(value: Ptr[rd_kafka_topic_t]): Unit = !struct.at2 = value
      def partition : int32_t = struct._3
      def partition_=(value: int32_t): Unit = !struct.at3 = value
      def payload : Ptr[Byte] = struct._4
      def payload_=(value: Ptr[Byte]): Unit = !struct.at4 = value
      def len : size_t = struct._5
      def len_=(value: size_t): Unit = !struct.at5 = value
      def key : Ptr[Byte] = struct._6
      def key_=(value: Ptr[Byte]): Unit = !struct.at6 = value
      def key_len : size_t = struct._7
      def key_len_=(value: size_t): Unit = !struct.at7 = value
      def offset : int64_t = struct._8
      def offset_=(value: int64_t): Unit = !struct.at8 = value
      def _private : Ptr[Byte] = struct._9
      def _private_=(value: Ptr[Byte]): Unit = !struct.at9 = value

  /**
   * Metadata container
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_metadata = CStruct6[CInt, Ptr[rd_kafka_metadata_broker], CInt, Ptr[rd_kafka_metadata_topic], int32_t, CString]
  object rd_kafka_metadata:
    given _tag: Tag[rd_kafka_metadata] = Tag.materializeCStruct6Tag[CInt, Ptr[rd_kafka_metadata_broker], CInt, Ptr[rd_kafka_metadata_topic], int32_t, CString]
    def apply()(using Zone): Ptr[rd_kafka_metadata] = scala.scalanative.unsafe.alloc[rd_kafka_metadata](1)
    def apply(broker_cnt : CInt, brokers : Ptr[rd_kafka_metadata_broker], topic_cnt : CInt, topics : Ptr[rd_kafka_metadata_topic], orig_broker_id : int32_t, orig_broker_name : CString)(using Zone): Ptr[rd_kafka_metadata] = 
      val ____ptr = apply()
      (!____ptr).broker_cnt = broker_cnt
      (!____ptr).brokers = brokers
      (!____ptr).topic_cnt = topic_cnt
      (!____ptr).topics = topics
      (!____ptr).orig_broker_id = orig_broker_id
      (!____ptr).orig_broker_name = orig_broker_name
      ____ptr
    extension (struct: rd_kafka_metadata)
      def broker_cnt : CInt = struct._1
      def broker_cnt_=(value: CInt): Unit = !struct.at1 = value
      def brokers : Ptr[rd_kafka_metadata_broker] = struct._2
      def brokers_=(value: Ptr[rd_kafka_metadata_broker]): Unit = !struct.at2 = value
      def topic_cnt : CInt = struct._3
      def topic_cnt_=(value: CInt): Unit = !struct.at3 = value
      def topics : Ptr[rd_kafka_metadata_topic] = struct._4
      def topics_=(value: Ptr[rd_kafka_metadata_topic]): Unit = !struct.at4 = value
      def orig_broker_id : int32_t = struct._5
      def orig_broker_id_=(value: int32_t): Unit = !struct.at5 = value
      def orig_broker_name : CString = struct._6
      def orig_broker_name_=(value: CString): Unit = !struct.at6 = value

  /**
   * Broker information
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_metadata_broker = CStruct3[int32_t, CString, CInt]
  object rd_kafka_metadata_broker:
    given _tag: Tag[rd_kafka_metadata_broker] = Tag.materializeCStruct3Tag[int32_t, CString, CInt]
    def apply()(using Zone): Ptr[rd_kafka_metadata_broker] = scala.scalanative.unsafe.alloc[rd_kafka_metadata_broker](1)
    def apply(id : int32_t, host : CString, port : CInt)(using Zone): Ptr[rd_kafka_metadata_broker] = 
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).host = host
      (!____ptr).port = port
      ____ptr
    extension (struct: rd_kafka_metadata_broker)
      def id : int32_t = struct._1
      def id_=(value: int32_t): Unit = !struct.at1 = value
      def host : CString = struct._2
      def host_=(value: CString): Unit = !struct.at2 = value
      def port : CInt = struct._3
      def port_=(value: CInt): Unit = !struct.at3 = value

  /**
   * Broker information
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_metadata_broker_t = CStruct3[int32_t, CString, CInt]
  object rd_kafka_metadata_broker_t:
    given _tag: Tag[rd_kafka_metadata_broker_t] = Tag.materializeCStruct3Tag[int32_t, CString, CInt]
    def apply()(using Zone): Ptr[rd_kafka_metadata_broker_t] = scala.scalanative.unsafe.alloc[rd_kafka_metadata_broker_t](1)
    def apply(id : int32_t, host : CString, port : CInt)(using Zone): Ptr[rd_kafka_metadata_broker_t] = 
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).host = host
      (!____ptr).port = port
      ____ptr
    extension (struct: rd_kafka_metadata_broker_t)
      def id : int32_t = struct._1
      def id_=(value: int32_t): Unit = !struct.at1 = value
      def host : CString = struct._2
      def host_=(value: CString): Unit = !struct.at2 = value
      def port : CInt = struct._3
      def port_=(value: CInt): Unit = !struct.at3 = value

  /**
   * Partition information
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_metadata_partition = CStruct7[int32_t, rd_kafka_resp_err_t, int32_t, CInt, Ptr[int32_t], CInt, Ptr[int32_t]]
  object rd_kafka_metadata_partition:
    given _tag: Tag[rd_kafka_metadata_partition] = Tag.materializeCStruct7Tag[int32_t, rd_kafka_resp_err_t, int32_t, CInt, Ptr[int32_t], CInt, Ptr[int32_t]]
    def apply()(using Zone): Ptr[rd_kafka_metadata_partition] = scala.scalanative.unsafe.alloc[rd_kafka_metadata_partition](1)
    def apply(id : int32_t, err : rd_kafka_resp_err_t, leader : int32_t, replica_cnt : CInt, replicas : Ptr[int32_t], isr_cnt : CInt, isrs : Ptr[int32_t])(using Zone): Ptr[rd_kafka_metadata_partition] = 
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).err = err
      (!____ptr).leader = leader
      (!____ptr).replica_cnt = replica_cnt
      (!____ptr).replicas = replicas
      (!____ptr).isr_cnt = isr_cnt
      (!____ptr).isrs = isrs
      ____ptr
    extension (struct: rd_kafka_metadata_partition)
      def id : int32_t = struct._1
      def id_=(value: int32_t): Unit = !struct.at1 = value
      def err : rd_kafka_resp_err_t = struct._2
      def err_=(value: rd_kafka_resp_err_t): Unit = !struct.at2 = value
      def leader : int32_t = struct._3
      def leader_=(value: int32_t): Unit = !struct.at3 = value
      def replica_cnt : CInt = struct._4
      def replica_cnt_=(value: CInt): Unit = !struct.at4 = value
      def replicas : Ptr[int32_t] = struct._5
      def replicas_=(value: Ptr[int32_t]): Unit = !struct.at5 = value
      def isr_cnt : CInt = struct._6
      def isr_cnt_=(value: CInt): Unit = !struct.at6 = value
      def isrs : Ptr[int32_t] = struct._7
      def isrs_=(value: Ptr[int32_t]): Unit = !struct.at7 = value

  /**
   * Partition information
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_metadata_partition_t = CStruct7[int32_t, rd_kafka_resp_err_t, int32_t, CInt, Ptr[int32_t], CInt, Ptr[int32_t]]
  object rd_kafka_metadata_partition_t:
    given _tag: Tag[rd_kafka_metadata_partition_t] = Tag.materializeCStruct7Tag[int32_t, rd_kafka_resp_err_t, int32_t, CInt, Ptr[int32_t], CInt, Ptr[int32_t]]
    def apply()(using Zone): Ptr[rd_kafka_metadata_partition_t] = scala.scalanative.unsafe.alloc[rd_kafka_metadata_partition_t](1)
    def apply(id : int32_t, err : rd_kafka_resp_err_t, leader : int32_t, replica_cnt : CInt, replicas : Ptr[int32_t], isr_cnt : CInt, isrs : Ptr[int32_t])(using Zone): Ptr[rd_kafka_metadata_partition_t] = 
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).err = err
      (!____ptr).leader = leader
      (!____ptr).replica_cnt = replica_cnt
      (!____ptr).replicas = replicas
      (!____ptr).isr_cnt = isr_cnt
      (!____ptr).isrs = isrs
      ____ptr
    extension (struct: rd_kafka_metadata_partition_t)
      def id : int32_t = struct._1
      def id_=(value: int32_t): Unit = !struct.at1 = value
      def err : rd_kafka_resp_err_t = struct._2
      def err_=(value: rd_kafka_resp_err_t): Unit = !struct.at2 = value
      def leader : int32_t = struct._3
      def leader_=(value: int32_t): Unit = !struct.at3 = value
      def replica_cnt : CInt = struct._4
      def replica_cnt_=(value: CInt): Unit = !struct.at4 = value
      def replicas : Ptr[int32_t] = struct._5
      def replicas_=(value: Ptr[int32_t]): Unit = !struct.at5 = value
      def isr_cnt : CInt = struct._6
      def isr_cnt_=(value: CInt): Unit = !struct.at6 = value
      def isrs : Ptr[int32_t] = struct._7
      def isrs_=(value: Ptr[int32_t]): Unit = !struct.at7 = value

  /**
   * Metadata container
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_metadata_t = CStruct6[CInt, Ptr[rd_kafka_metadata_broker], CInt, Ptr[rd_kafka_metadata_topic], int32_t, CString]
  object rd_kafka_metadata_t:
    given _tag: Tag[rd_kafka_metadata_t] = Tag.materializeCStruct6Tag[CInt, Ptr[rd_kafka_metadata_broker], CInt, Ptr[rd_kafka_metadata_topic], int32_t, CString]
    def apply()(using Zone): Ptr[rd_kafka_metadata_t] = scala.scalanative.unsafe.alloc[rd_kafka_metadata_t](1)
    def apply(broker_cnt : CInt, brokers : Ptr[rd_kafka_metadata_broker], topic_cnt : CInt, topics : Ptr[rd_kafka_metadata_topic], orig_broker_id : int32_t, orig_broker_name : CString)(using Zone): Ptr[rd_kafka_metadata_t] = 
      val ____ptr = apply()
      (!____ptr).broker_cnt = broker_cnt
      (!____ptr).brokers = brokers
      (!____ptr).topic_cnt = topic_cnt
      (!____ptr).topics = topics
      (!____ptr).orig_broker_id = orig_broker_id
      (!____ptr).orig_broker_name = orig_broker_name
      ____ptr
    extension (struct: rd_kafka_metadata_t)
      def broker_cnt : CInt = struct._1
      def broker_cnt_=(value: CInt): Unit = !struct.at1 = value
      def brokers : Ptr[rd_kafka_metadata_broker] = struct._2
      def brokers_=(value: Ptr[rd_kafka_metadata_broker]): Unit = !struct.at2 = value
      def topic_cnt : CInt = struct._3
      def topic_cnt_=(value: CInt): Unit = !struct.at3 = value
      def topics : Ptr[rd_kafka_metadata_topic] = struct._4
      def topics_=(value: Ptr[rd_kafka_metadata_topic]): Unit = !struct.at4 = value
      def orig_broker_id : int32_t = struct._5
      def orig_broker_id_=(value: int32_t): Unit = !struct.at5 = value
      def orig_broker_name : CString = struct._6
      def orig_broker_name_=(value: CString): Unit = !struct.at6 = value

  /**
   * Topic information
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_metadata_topic = CStruct4[CString, CInt, Ptr[rd_kafka_metadata_partition], rd_kafka_resp_err_t]
  object rd_kafka_metadata_topic:
    given _tag: Tag[rd_kafka_metadata_topic] = Tag.materializeCStruct4Tag[CString, CInt, Ptr[rd_kafka_metadata_partition], rd_kafka_resp_err_t]
    def apply()(using Zone): Ptr[rd_kafka_metadata_topic] = scala.scalanative.unsafe.alloc[rd_kafka_metadata_topic](1)
    def apply(topic : CString, partition_cnt : CInt, partitions : Ptr[rd_kafka_metadata_partition], err : rd_kafka_resp_err_t)(using Zone): Ptr[rd_kafka_metadata_topic] = 
      val ____ptr = apply()
      (!____ptr).topic = topic
      (!____ptr).partition_cnt = partition_cnt
      (!____ptr).partitions = partitions
      (!____ptr).err = err
      ____ptr
    extension (struct: rd_kafka_metadata_topic)
      def topic : CString = struct._1
      def topic_=(value: CString): Unit = !struct.at1 = value
      def partition_cnt : CInt = struct._2
      def partition_cnt_=(value: CInt): Unit = !struct.at2 = value
      def partitions : Ptr[rd_kafka_metadata_partition] = struct._3
      def partitions_=(value: Ptr[rd_kafka_metadata_partition]): Unit = !struct.at3 = value
      def err : rd_kafka_resp_err_t = struct._4
      def err_=(value: rd_kafka_resp_err_t): Unit = !struct.at4 = value

  /**
   * Topic information
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_metadata_topic_t = CStruct4[CString, CInt, Ptr[rd_kafka_metadata_partition], rd_kafka_resp_err_t]
  object rd_kafka_metadata_topic_t:
    given _tag: Tag[rd_kafka_metadata_topic_t] = Tag.materializeCStruct4Tag[CString, CInt, Ptr[rd_kafka_metadata_partition], rd_kafka_resp_err_t]
    def apply()(using Zone): Ptr[rd_kafka_metadata_topic_t] = scala.scalanative.unsafe.alloc[rd_kafka_metadata_topic_t](1)
    def apply(topic : CString, partition_cnt : CInt, partitions : Ptr[rd_kafka_metadata_partition], err : rd_kafka_resp_err_t)(using Zone): Ptr[rd_kafka_metadata_topic_t] = 
      val ____ptr = apply()
      (!____ptr).topic = topic
      (!____ptr).partition_cnt = partition_cnt
      (!____ptr).partitions = partitions
      (!____ptr).err = err
      ____ptr
    extension (struct: rd_kafka_metadata_topic_t)
      def topic : CString = struct._1
      def topic_=(value: CString): Unit = !struct.at1 = value
      def partition_cnt : CInt = struct._2
      def partition_cnt_=(value: CInt): Unit = !struct.at2 = value
      def partitions : Ptr[rd_kafka_metadata_partition] = struct._3
      def partitions_=(value: Ptr[rd_kafka_metadata_partition]): Unit = !struct.at3 = value
      def err : rd_kafka_resp_err_t = struct._4
      def err_=(value: rd_kafka_resp_err_t): Unit = !struct.at4 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_op_s = CStruct0
  object rd_kafka_op_s:
    given _tag: Tag[rd_kafka_op_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_queue_s = CStruct0
  object rd_kafka_queue_s:
    given _tag: Tag[rd_kafka_queue_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_queue_t = CStruct0
  object rd_kafka_queue_t:
    given _tag: Tag[rd_kafka_queue_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_s = CStruct0
  object rd_kafka_s:
    given _tag: Tag[rd_kafka_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_t = CStruct0
  object rd_kafka_t:
    given _tag: Tag[rd_kafka_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_topic_conf_s = CStruct0
  object rd_kafka_topic_conf_s:
    given _tag: Tag[rd_kafka_topic_conf_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_topic_conf_t = CStruct0
  object rd_kafka_topic_conf_t:
    given _tag: Tag[rd_kafka_topic_conf_t] = Tag.materializeCStruct0Tag

  /**
   * A growable list of Topic+Partitions.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_topic_partition_list_s = CStruct3[CInt, CInt, Ptr[rd_kafka_topic_partition_t]]
  object rd_kafka_topic_partition_list_s:
    given _tag: Tag[rd_kafka_topic_partition_list_s] = Tag.materializeCStruct3Tag[CInt, CInt, Ptr[rd_kafka_topic_partition_t]]
    def apply()(using Zone): Ptr[rd_kafka_topic_partition_list_s] = scala.scalanative.unsafe.alloc[rd_kafka_topic_partition_list_s](1)
    def apply(cnt : CInt, size : CInt, elems : Ptr[rd_kafka_topic_partition_t])(using Zone): Ptr[rd_kafka_topic_partition_list_s] = 
      val ____ptr = apply()
      (!____ptr).cnt = cnt
      (!____ptr).size = size
      (!____ptr).elems = elems
      ____ptr
    extension (struct: rd_kafka_topic_partition_list_s)
      def cnt : CInt = struct._1
      def cnt_=(value: CInt): Unit = !struct.at1 = value
      def size : CInt = struct._2
      def size_=(value: CInt): Unit = !struct.at2 = value
      def elems : Ptr[rd_kafka_topic_partition_t] = struct._3
      def elems_=(value: Ptr[rd_kafka_topic_partition_t]): Unit = !struct.at3 = value

  /**
   * A growable list of Topic+Partitions.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_topic_partition_list_t = CStruct3[CInt, CInt, Ptr[rd_kafka_topic_partition_t]]
  object rd_kafka_topic_partition_list_t:
    given _tag: Tag[rd_kafka_topic_partition_list_t] = Tag.materializeCStruct3Tag[CInt, CInt, Ptr[rd_kafka_topic_partition_t]]
    def apply()(using Zone): Ptr[rd_kafka_topic_partition_list_t] = scala.scalanative.unsafe.alloc[rd_kafka_topic_partition_list_t](1)
    def apply(cnt : CInt, size : CInt, elems : Ptr[rd_kafka_topic_partition_t])(using Zone): Ptr[rd_kafka_topic_partition_list_t] = 
      val ____ptr = apply()
      (!____ptr).cnt = cnt
      (!____ptr).size = size
      (!____ptr).elems = elems
      ____ptr
    extension (struct: rd_kafka_topic_partition_list_t)
      def cnt : CInt = struct._1
      def cnt_=(value: CInt): Unit = !struct.at1 = value
      def size : CInt = struct._2
      def size_=(value: CInt): Unit = !struct.at2 = value
      def elems : Ptr[rd_kafka_topic_partition_t] = struct._3
      def elems_=(value: Ptr[rd_kafka_topic_partition_t]): Unit = !struct.at3 = value

  /**
   * Generic place holder for a specific Topic+Partition.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_topic_partition_s = CStruct8[CString, int32_t, int64_t, Ptr[Byte], size_t, Ptr[Byte], rd_kafka_resp_err_t, Ptr[Byte]]
  object rd_kafka_topic_partition_s:
    given _tag: Tag[rd_kafka_topic_partition_s] = Tag.materializeCStruct8Tag[CString, int32_t, int64_t, Ptr[Byte], size_t, Ptr[Byte], rd_kafka_resp_err_t, Ptr[Byte]]
    def apply()(using Zone): Ptr[rd_kafka_topic_partition_s] = scala.scalanative.unsafe.alloc[rd_kafka_topic_partition_s](1)
    def apply(topic : CString, partition : int32_t, offset : int64_t, metadata : Ptr[Byte], metadata_size : size_t, opaque : Ptr[Byte], err : rd_kafka_resp_err_t, _private : Ptr[Byte])(using Zone): Ptr[rd_kafka_topic_partition_s] = 
      val ____ptr = apply()
      (!____ptr).topic = topic
      (!____ptr).partition = partition
      (!____ptr).offset = offset
      (!____ptr).metadata = metadata
      (!____ptr).metadata_size = metadata_size
      (!____ptr).opaque = opaque
      (!____ptr).err = err
      (!____ptr)._private = _private
      ____ptr
    extension (struct: rd_kafka_topic_partition_s)
      def topic : CString = struct._1
      def topic_=(value: CString): Unit = !struct.at1 = value
      def partition : int32_t = struct._2
      def partition_=(value: int32_t): Unit = !struct.at2 = value
      def offset : int64_t = struct._3
      def offset_=(value: int64_t): Unit = !struct.at3 = value
      def metadata : Ptr[Byte] = struct._4
      def metadata_=(value: Ptr[Byte]): Unit = !struct.at4 = value
      def metadata_size : size_t = struct._5
      def metadata_size_=(value: size_t): Unit = !struct.at5 = value
      def opaque : Ptr[Byte] = struct._6
      def opaque_=(value: Ptr[Byte]): Unit = !struct.at6 = value
      def err : rd_kafka_resp_err_t = struct._7
      def err_=(value: rd_kafka_resp_err_t): Unit = !struct.at7 = value
      def _private : Ptr[Byte] = struct._8
      def _private_=(value: Ptr[Byte]): Unit = !struct.at8 = value

  /**
   * Generic place holder for a specific Topic+Partition.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_topic_partition_t = CStruct8[CString, int32_t, int64_t, Ptr[Byte], size_t, Ptr[Byte], rd_kafka_resp_err_t, Ptr[Byte]]
  object rd_kafka_topic_partition_t:
    given _tag: Tag[rd_kafka_topic_partition_t] = Tag.materializeCStruct8Tag[CString, int32_t, int64_t, Ptr[Byte], size_t, Ptr[Byte], rd_kafka_resp_err_t, Ptr[Byte]]
    def apply()(using Zone): Ptr[rd_kafka_topic_partition_t] = scala.scalanative.unsafe.alloc[rd_kafka_topic_partition_t](1)
    def apply(topic : CString, partition : int32_t, offset : int64_t, metadata : Ptr[Byte], metadata_size : size_t, opaque : Ptr[Byte], err : rd_kafka_resp_err_t, _private : Ptr[Byte])(using Zone): Ptr[rd_kafka_topic_partition_t] = 
      val ____ptr = apply()
      (!____ptr).topic = topic
      (!____ptr).partition = partition
      (!____ptr).offset = offset
      (!____ptr).metadata = metadata
      (!____ptr).metadata_size = metadata_size
      (!____ptr).opaque = opaque
      (!____ptr).err = err
      (!____ptr)._private = _private
      ____ptr
    extension (struct: rd_kafka_topic_partition_t)
      def topic : CString = struct._1
      def topic_=(value: CString): Unit = !struct.at1 = value
      def partition : int32_t = struct._2
      def partition_=(value: int32_t): Unit = !struct.at2 = value
      def offset : int64_t = struct._3
      def offset_=(value: int64_t): Unit = !struct.at3 = value
      def metadata : Ptr[Byte] = struct._4
      def metadata_=(value: Ptr[Byte]): Unit = !struct.at4 = value
      def metadata_size : size_t = struct._5
      def metadata_size_=(value: size_t): Unit = !struct.at5 = value
      def opaque : Ptr[Byte] = struct._6
      def opaque_=(value: Ptr[Byte]): Unit = !struct.at6 = value
      def err : rd_kafka_resp_err_t = struct._7
      def err_=(value: rd_kafka_resp_err_t): Unit = !struct.at7 = value
      def _private : Ptr[Byte] = struct._8
      def _private_=(value: Ptr[Byte]): Unit = !struct.at8 = value

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_topic_result_s = CStruct0
  object rd_kafka_topic_result_s:
    given _tag: Tag[rd_kafka_topic_result_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_topic_result_t = CStruct0
  object rd_kafka_topic_result_t:
    given _tag: Tag[rd_kafka_topic_result_t] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_topic_s = CStruct0
  object rd_kafka_topic_s:
    given _tag: Tag[rd_kafka_topic_s] = Tag.materializeCStruct0Tag

  /**
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_topic_t = CStruct0
  object rd_kafka_topic_t:
    given _tag: Tag[rd_kafka_topic_t] = Tag.materializeCStruct0Tag

  /**
   * VTYPE + argument container for use with rd_kafka_produce_va()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_vu_s = CStruct2[rd_kafka_vtype_t, rd_kafka_vu_s.Union0]
  object rd_kafka_vu_s:
    /**
     * Value union, see RD_KAFKA_V_.. macros for which field to use.
    
     * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._6, Nat._4]]
    object Union0:
      /**
       * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
      */
      opaque type Struct0 = CStruct2[Ptr[Byte], size_t]
      object Struct0:
        given _tag: Tag[Struct0] = Tag.materializeCStruct2Tag[Ptr[Byte], size_t]
        def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
        def apply(ptr : Ptr[Byte], size : size_t)(using Zone): Ptr[Struct0] = 
          val ____ptr = apply()
          (!____ptr).ptr = ptr
          (!____ptr).size = size
          ____ptr
        extension (struct: Struct0)
          def ptr : Ptr[Byte] = struct._1
          def ptr_=(value: Ptr[Byte]): Unit = !struct.at1 = value
          def size : size_t = struct._2
          def size_=(value: size_t): Unit = !struct.at2 = value
      /**
       * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
      */
      opaque type Struct1 = CStruct3[CString, Ptr[Byte], ssize_t]
      object Struct1:
        given _tag: Tag[Struct1] = Tag.materializeCStruct3Tag[CString, Ptr[Byte], ssize_t]
        def apply()(using Zone): Ptr[Struct1] = scala.scalanative.unsafe.alloc[Struct1](1)
        def apply(name : CString, `val` : Ptr[Byte], size : ssize_t)(using Zone): Ptr[Struct1] = 
          val ____ptr = apply()
          (!____ptr).name = name
          (!____ptr).`val` = `val`
          (!____ptr).size = size
          ____ptr
        extension (struct: Struct1)
          def name : CString = struct._1
          def name_=(value: CString): Unit = !struct.at1 = value
          def `val` : Ptr[Byte] = struct._2
          def val_=(value: Ptr[Byte]): Unit = !struct.at2 = value
          def size : ssize_t = struct._3
          def size_=(value: ssize_t): Unit = !struct.at3 = value
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._6, Nat._4]](Tag.Byte, Tag.Digit2[Nat._6, Nat._4](Tag.Nat6, Tag.Nat4))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_cstr")
      def apply(cstr: CString)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CString]].update(0, cstr)
        ___ptr
      @scala.annotation.targetName("apply_rkt")
      def apply(rkt: Ptr[rd_kafka_topic_t])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_topic_t]]].update(0, rkt)
        ___ptr
      @scala.annotation.targetName("apply_i")
      def apply(i: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, i)
        ___ptr
      @scala.annotation.targetName("apply_i32")
      def apply(i32: int32_t)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[int32_t]].update(0, i32)
        ___ptr
      @scala.annotation.targetName("apply_i64")
      def apply(i64: int64_t)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[int64_t]].update(0, i64)
        ___ptr
      @scala.annotation.targetName("apply_mem")
      def apply(mem: rd_kafka_vu_s.Union0.Struct0)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[rd_kafka_vu_s.Union0.Struct0]].update(0, mem)
        ___ptr
      @scala.annotation.targetName("apply_header")
      def apply(header: rd_kafka_vu_s.Union0.Struct1)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[rd_kafka_vu_s.Union0.Struct1]].update(0, header)
        ___ptr
      @scala.annotation.targetName("apply_headers")
      def apply(headers: Ptr[rd_kafka_headers_t])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_headers_t]]].update(0, headers)
        ___ptr
      @scala.annotation.targetName("apply_ptr")
      def apply(ptr: Ptr[Byte])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[Byte]]].update(0, ptr)
        ___ptr
      @scala.annotation.targetName("apply__pad")
      def apply(_pad: CArray[CChar, Nat.Digit2[Nat._6, Nat._4]])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]]].update(0, _pad)
        ___ptr
      extension (struct: Union0)
        def cstr : CString = !struct.at(0).asInstanceOf[Ptr[CString]]
        def cstr_=(value: CString): Unit = !struct.at(0).asInstanceOf[Ptr[CString]] = value
        def rkt : Ptr[rd_kafka_topic_t] = !struct.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_topic_t]]]
        def rkt_=(value: Ptr[rd_kafka_topic_t]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_topic_t]]] = value
        def i : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def i_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def i32 : int32_t = !struct.at(0).asInstanceOf[Ptr[int32_t]]
        def i32_=(value: int32_t): Unit = !struct.at(0).asInstanceOf[Ptr[int32_t]] = value
        def i64 : int64_t = !struct.at(0).asInstanceOf[Ptr[int64_t]]
        def i64_=(value: int64_t): Unit = !struct.at(0).asInstanceOf[Ptr[int64_t]] = value
        def mem : rd_kafka_vu_s.Union0.Struct0 = !struct.at(0).asInstanceOf[Ptr[rd_kafka_vu_s.Union0.Struct0]]
        def mem_=(value: rd_kafka_vu_s.Union0.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[rd_kafka_vu_s.Union0.Struct0]] = value
        def header : rd_kafka_vu_s.Union0.Struct1 = !struct.at(0).asInstanceOf[Ptr[rd_kafka_vu_s.Union0.Struct1]]
        def header_=(value: rd_kafka_vu_s.Union0.Struct1): Unit = !struct.at(0).asInstanceOf[Ptr[rd_kafka_vu_s.Union0.Struct1]] = value
        def headers : Ptr[rd_kafka_headers_t] = !struct.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_headers_t]]]
        def headers_=(value: Ptr[rd_kafka_headers_t]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_headers_t]]] = value
        def ptr : Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
        def ptr_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
        def _pad : CArray[CChar, Nat.Digit2[Nat._6, Nat._4]] = !struct.at(0).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]]]
        def _pad_=(value: CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]]] = value
    given _tag: Tag[rd_kafka_vu_s] = Tag.materializeCStruct2Tag[rd_kafka_vtype_t, rd_kafka_vu_s.Union0]
    def apply()(using Zone): Ptr[rd_kafka_vu_s] = scala.scalanative.unsafe.alloc[rd_kafka_vu_s](1)
    def apply(vtype : rd_kafka_vtype_t, u : rd_kafka_vu_s.Union0)(using Zone): Ptr[rd_kafka_vu_s] = 
      val ____ptr = apply()
      (!____ptr).vtype = vtype
      (!____ptr).u = u
      ____ptr
    extension (struct: rd_kafka_vu_s)
      def vtype : rd_kafka_vtype_t = struct._1
      def vtype_=(value: rd_kafka_vtype_t): Unit = !struct.at1 = value
      def u : rd_kafka_vu_s.Union0 = struct._2
      def u_=(value: rd_kafka_vu_s.Union0): Unit = !struct.at2 = value

  /**
   * VTYPE + argument container for use with rd_kafka_produce_va()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  opaque type rd_kafka_vu_t = CStruct2[rd_kafka_vtype_t, rd_kafka_vu_t.Union0]
  object rd_kafka_vu_t:
    /**
     * Value union, see RD_KAFKA_V_.. macros for which field to use.
    
     * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
    */
    opaque type Union0 = CArray[Byte, Nat.Digit2[Nat._6, Nat._4]]
    object Union0:
      /**
       * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
      */
      opaque type Struct0 = CStruct2[Ptr[Byte], size_t]
      object Struct0:
        given _tag: Tag[Struct0] = Tag.materializeCStruct2Tag[Ptr[Byte], size_t]
        def apply()(using Zone): Ptr[Struct0] = scala.scalanative.unsafe.alloc[Struct0](1)
        def apply(ptr : Ptr[Byte], size : size_t)(using Zone): Ptr[Struct0] = 
          val ____ptr = apply()
          (!____ptr).ptr = ptr
          (!____ptr).size = size
          ____ptr
        extension (struct: Struct0)
          def ptr : Ptr[Byte] = struct._1
          def ptr_=(value: Ptr[Byte]): Unit = !struct.at1 = value
          def size : size_t = struct._2
          def size_=(value: size_t): Unit = !struct.at2 = value
      /**
       * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
      */
      opaque type Struct1 = CStruct3[CString, Ptr[Byte], ssize_t]
      object Struct1:
        given _tag: Tag[Struct1] = Tag.materializeCStruct3Tag[CString, Ptr[Byte], ssize_t]
        def apply()(using Zone): Ptr[Struct1] = scala.scalanative.unsafe.alloc[Struct1](1)
        def apply(name : CString, `val` : Ptr[Byte], size : ssize_t)(using Zone): Ptr[Struct1] = 
          val ____ptr = apply()
          (!____ptr).name = name
          (!____ptr).`val` = `val`
          (!____ptr).size = size
          ____ptr
        extension (struct: Struct1)
          def name : CString = struct._1
          def name_=(value: CString): Unit = !struct.at1 = value
          def `val` : Ptr[Byte] = struct._2
          def val_=(value: Ptr[Byte]): Unit = !struct.at2 = value
          def size : ssize_t = struct._3
          def size_=(value: ssize_t): Unit = !struct.at3 = value
      given _tag: Tag[Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._6, Nat._4]](Tag.Byte, Tag.Digit2[Nat._6, Nat._4](Tag.Nat6, Tag.Nat4))
      def apply()(using Zone): Ptr[Union0] = 
        val ___ptr = alloc[Union0](1)
        ___ptr
      @scala.annotation.targetName("apply_cstr")
      def apply(cstr: CString)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CString]].update(0, cstr)
        ___ptr
      @scala.annotation.targetName("apply_rkt")
      def apply(rkt: Ptr[rd_kafka_topic_t])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_topic_t]]].update(0, rkt)
        ___ptr
      @scala.annotation.targetName("apply_i")
      def apply(i: CInt)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CInt]].update(0, i)
        ___ptr
      @scala.annotation.targetName("apply_i32")
      def apply(i32: int32_t)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[int32_t]].update(0, i32)
        ___ptr
      @scala.annotation.targetName("apply_i64")
      def apply(i64: int64_t)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[int64_t]].update(0, i64)
        ___ptr
      @scala.annotation.targetName("apply_mem")
      def apply(mem: rd_kafka_vu_t.Union0.Struct0)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[rd_kafka_vu_t.Union0.Struct0]].update(0, mem)
        ___ptr
      @scala.annotation.targetName("apply_header")
      def apply(header: rd_kafka_vu_t.Union0.Struct1)(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[rd_kafka_vu_t.Union0.Struct1]].update(0, header)
        ___ptr
      @scala.annotation.targetName("apply_headers")
      def apply(headers: Ptr[rd_kafka_headers_t])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_headers_t]]].update(0, headers)
        ___ptr
      @scala.annotation.targetName("apply_ptr")
      def apply(ptr: Ptr[Byte])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[Byte]]].update(0, ptr)
        ___ptr
      @scala.annotation.targetName("apply__pad")
      def apply(_pad: CArray[CChar, Nat.Digit2[Nat._6, Nat._4]])(using Zone): Ptr[Union0] =
        val ___ptr = alloc[Union0](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]]].update(0, _pad)
        ___ptr
      extension (struct: Union0)
        def cstr : CString = !struct.at(0).asInstanceOf[Ptr[CString]]
        def cstr_=(value: CString): Unit = !struct.at(0).asInstanceOf[Ptr[CString]] = value
        def rkt : Ptr[rd_kafka_topic_t] = !struct.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_topic_t]]]
        def rkt_=(value: Ptr[rd_kafka_topic_t]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_topic_t]]] = value
        def i : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
        def i_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
        def i32 : int32_t = !struct.at(0).asInstanceOf[Ptr[int32_t]]
        def i32_=(value: int32_t): Unit = !struct.at(0).asInstanceOf[Ptr[int32_t]] = value
        def i64 : int64_t = !struct.at(0).asInstanceOf[Ptr[int64_t]]
        def i64_=(value: int64_t): Unit = !struct.at(0).asInstanceOf[Ptr[int64_t]] = value
        def mem : rd_kafka_vu_t.Union0.Struct0 = !struct.at(0).asInstanceOf[Ptr[rd_kafka_vu_t.Union0.Struct0]]
        def mem_=(value: rd_kafka_vu_t.Union0.Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[rd_kafka_vu_t.Union0.Struct0]] = value
        def header : rd_kafka_vu_t.Union0.Struct1 = !struct.at(0).asInstanceOf[Ptr[rd_kafka_vu_t.Union0.Struct1]]
        def header_=(value: rd_kafka_vu_t.Union0.Struct1): Unit = !struct.at(0).asInstanceOf[Ptr[rd_kafka_vu_t.Union0.Struct1]] = value
        def headers : Ptr[rd_kafka_headers_t] = !struct.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_headers_t]]]
        def headers_=(value: Ptr[rd_kafka_headers_t]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[rd_kafka_headers_t]]] = value
        def ptr : Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
        def ptr_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
        def _pad : CArray[CChar, Nat.Digit2[Nat._6, Nat._4]] = !struct.at(0).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]]]
        def _pad_=(value: CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]]] = value
    given _tag: Tag[rd_kafka_vu_t] = Tag.materializeCStruct2Tag[rd_kafka_vtype_t, rd_kafka_vu_t.Union0]
    def apply()(using Zone): Ptr[rd_kafka_vu_t] = scala.scalanative.unsafe.alloc[rd_kafka_vu_t](1)
    def apply(vtype : rd_kafka_vtype_t, u : rd_kafka_vu_t.Union0)(using Zone): Ptr[rd_kafka_vu_t] = 
      val ____ptr = apply()
      (!____ptr).vtype = vtype
      (!____ptr).u = u
      ____ptr
    extension (struct: rd_kafka_vu_t)
      def vtype : rd_kafka_vtype_t = struct._1
      def vtype_=(value: rd_kafka_vtype_t): Unit = !struct.at1 = value
      def u : rd_kafka_vu_t.Union0 = struct._2
      def u_=(value: rd_kafka_vu_t.Union0): Unit = !struct.at2 = value

@link("rdkafka")
@extern
private[librdkafka] object extern_functions:
  import _root_.librdkafka.enumerations.*
  import _root_.librdkafka.aliases.*
  import _root_.librdkafka.structs.*

  /**
   * Create a new AclBindingFilter object. This object is later passed to rd_kafka_DescribeAcls() or rd_kafka_DeletesAcls() in order to filter the acls to retrieve or to delete. Use the same rd_kafka_AclBinding functions to query or destroy it.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBindingFilter_new(restype : rd_kafka_ResourceType_t, name : CString, resource_pattern_type : rd_kafka_ResourcePatternType_t, principal : CString, host : CString, operation : rd_kafka_AclOperation_t, permission_type : rd_kafka_AclPermissionType_t, errstr : CString, errstr_size : size_t): Ptr[rd_kafka_AclBindingFilter_t] = extern

  /**
   * Destroy and free an AclBinding object previously created with rd_kafka_AclBinding_new()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBinding_destroy(acl_binding : Ptr[rd_kafka_AclBinding_t]): Unit = extern

  /**
   * Helper function to destroy all AclBinding objects in the acl_bindings array (of acl_bindings_cnt elements). The array itself is not freed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBinding_destroy_array(acl_bindings : Ptr[Ptr[rd_kafka_AclBinding_t]], acl_bindings_cnt : size_t): Unit = extern

  /**
   * Returns the error object for the given acl binding, or NULL on success.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBinding_error(acl : Ptr[rd_kafka_AclBinding_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Returns the host for the given acl binding.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBinding_host(acl : Ptr[rd_kafka_AclBinding_t]): CString = extern

  /**
   * Returns the resource name for the given acl binding.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBinding_name(acl : Ptr[rd_kafka_AclBinding_t]): CString = extern

  /**
   * Create a new AclBinding object. This object is later passed to rd_kafka_CreateAcls().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBinding_new(restype : rd_kafka_ResourceType_t, name : CString, resource_pattern_type : rd_kafka_ResourcePatternType_t, principal : CString, host : CString, operation : rd_kafka_AclOperation_t, permission_type : rd_kafka_AclPermissionType_t, errstr : CString, errstr_size : size_t): Ptr[rd_kafka_AclBinding_t] = extern

  /**
   * Returns the acl operation for the given acl binding.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBinding_operation(acl : Ptr[rd_kafka_AclBinding_t]): rd_kafka_AclOperation_t = extern

  /**
   * Returns the permission type for the given acl binding.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBinding_permission_type(acl : Ptr[rd_kafka_AclBinding_t]): rd_kafka_AclPermissionType_t = extern

  /**
   * Returns the principal for the given acl binding.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBinding_principal(acl : Ptr[rd_kafka_AclBinding_t]): CString = extern

  /**
   * Returns the resource pattern type for the given acl binding.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBinding_resource_pattern_type(acl : Ptr[rd_kafka_AclBinding_t]): rd_kafka_ResourcePatternType_t = extern

  /**
   * Returns the resource type for the given acl binding.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclBinding_restype(acl : Ptr[rd_kafka_AclBinding_t]): rd_kafka_ResourceType_t = extern

  /**
   * Returns a string representation of the acl_operation
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclOperation_name(acl_operation : rd_kafka_AclOperation_t): CString = extern

  /**
   * Returns a string representation of the acl_permission_type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AclPermissionType_name(acl_permission_type : rd_kafka_AclPermissionType_t): CString = extern

  /**
   * Destroy a AdminOptions object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AdminOptions_destroy(options : Ptr[rd_kafka_AdminOptions_t]): Unit = extern

  /**
   * Create a new AdminOptions object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AdminOptions_new(rk : Ptr[rd_kafka_t], for_api : rd_kafka_admin_op_t): Ptr[rd_kafka_AdminOptions_t] = extern

  /**
   * Override what broker the Admin request will be sent to.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AdminOptions_set_broker(options : Ptr[rd_kafka_AdminOptions_t], broker_id : int32_t, errstr : CString, errstr_size : size_t): rd_kafka_resp_err_t = extern

  /**
   * Set consumer groups states to query for.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AdminOptions_set_match_consumer_group_states(options : Ptr[rd_kafka_AdminOptions_t], consumer_group_states : Ptr[rd_kafka_consumer_group_state_t], consumer_group_states_cnt : size_t): Ptr[rd_kafka_error_t] = extern

  /**
   * Set application opaque value that can be extracted from the result event using rd_kafka_event_opaque()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AdminOptions_set_opaque(options : Ptr[rd_kafka_AdminOptions_t], ev_opaque : Ptr[Byte]): Unit = extern

  /**
   * Sets the broker's operation timeout, such as the timeout for CreateTopics to complete the creation of topics on the controller before returning a result to the application.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AdminOptions_set_operation_timeout(options : Ptr[rd_kafka_AdminOptions_t], timeout_ms : CInt, errstr : CString, errstr_size : size_t): rd_kafka_resp_err_t = extern

  /**
   * Sets the overall request timeout, including broker lookup, request transmission, operation time on broker, and response.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AdminOptions_set_request_timeout(options : Ptr[rd_kafka_AdminOptions_t], timeout_ms : CInt, errstr : CString, errstr_size : size_t): rd_kafka_resp_err_t = extern

  /**
   * Whether broker should return stable offsets (transaction-committed).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AdminOptions_set_require_stable_offsets(options : Ptr[rd_kafka_AdminOptions_t], true_or_false : CInt): Ptr[rd_kafka_error_t] = extern

  /**
   * Tell broker to only validate the request, without performing the requested operation (create topics, etc).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AdminOptions_set_validate_only(options : Ptr[rd_kafka_AdminOptions_t], true_or_false : CInt, errstr : CString, errstr_size : size_t): rd_kafka_resp_err_t = extern

  /**
   * Update the configuration for the specified resources. Updates are not transactional so they may succeed for a subset of the provided resources while the others fail. The configuration for a particular resource is updated atomically, replacing values using the provided ConfigEntrys and reverting unspecified ConfigEntrys to their default values.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AlterConfigs(rk : Ptr[rd_kafka_t], configs : Ptr[Ptr[rd_kafka_ConfigResource_t]], config_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Get an array of resource results from a AlterConfigs result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AlterConfigs_result_resources(result : Ptr[rd_kafka_AlterConfigs_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_ConfigResource_t]] = extern

  /**
   * Alter committed offsets for a set of partitions in a consumer group. This will succeed at the partition level only if the group is not actively subscribed to the corresponding topic.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AlterConsumerGroupOffsets(rk : Ptr[rd_kafka_t], alter_grpoffsets : Ptr[Ptr[rd_kafka_AlterConsumerGroupOffsets_t]], alter_grpoffsets_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Destroy and free a AlterConsumerGroupOffsets object previously created with rd_kafka_AlterConsumerGroupOffsets_new()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AlterConsumerGroupOffsets_destroy(alter_grpoffsets : Ptr[rd_kafka_AlterConsumerGroupOffsets_t]): Unit = extern

  /**
   * Helper function to destroy all AlterConsumerGroupOffsets objects in the alter_grpoffsets array (of alter_grpoffsets_cnt elements). The array itself is not freed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AlterConsumerGroupOffsets_destroy_array(alter_grpoffsets : Ptr[Ptr[rd_kafka_AlterConsumerGroupOffsets_t]], alter_grpoffset_cnt : size_t): Unit = extern

  /**
   * Create a new AlterConsumerGroupOffsets object. This object is later passed to rd_kafka_AlterConsumerGroupOffsets().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AlterConsumerGroupOffsets_new(group_id : CString, partitions : Ptr[rd_kafka_topic_partition_list_t]): Ptr[rd_kafka_AlterConsumerGroupOffsets_t] = extern

  /**
   * Get an array of results from a AlterConsumerGroupOffsets result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_AlterConsumerGroupOffsets_result_groups(result : Ptr[rd_kafka_AlterConsumerGroupOffsets_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_group_result_t]] = extern

  /**
   * Returns 1 if the config property is set to its default value on the broker, else 0. Shall only be used on a DescribeConfigs result, otherwise returns -1.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigEntry_is_default(entry : Ptr[rd_kafka_ConfigEntry_t]): CInt = extern

  /**
   * Returns 1 if the config property is read-only on the broker, else 0. Shall only be used on a DescribeConfigs result, otherwise returns -1.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigEntry_is_read_only(entry : Ptr[rd_kafka_ConfigEntry_t]): CInt = extern

  /**
   * Returns 1 if the config property contains sensitive information (such as security configuration), else 0. An application should take care not to include the value of sensitive configuration entries in its output. Shall only be used on a DescribeConfigs result, otherwise returns -1.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigEntry_is_sensitive(entry : Ptr[rd_kafka_ConfigEntry_t]): CInt = extern

  /**
   * Returns 1 if this entry is a synonym, else 0.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigEntry_is_synonym(entry : Ptr[rd_kafka_ConfigEntry_t]): CInt = extern

  /**
   * Returns the configuration property name
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigEntry_name(entry : Ptr[rd_kafka_ConfigEntry_t]): CString = extern

  /**
   * Returns the config source.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigEntry_source(entry : Ptr[rd_kafka_ConfigEntry_t]): rd_kafka_ConfigSource_t = extern

  /**
   * Returns the synonym config entry array.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigEntry_synonyms(entry : Ptr[rd_kafka_ConfigEntry_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_ConfigEntry_t]] = extern

  /**
   * Returns the configuration value, may be NULL for sensitive or unset properties.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigEntry_value(entry : Ptr[rd_kafka_ConfigEntry_t]): CString = extern

  /**
   * Get an array of config entries from a ConfigResource object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigResource_configs(config : Ptr[rd_kafka_ConfigResource_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_ConfigEntry_t]] = extern

  /**
   * Destroy and free a ConfigResource object previously created with rd_kafka_ConfigResource_new()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigResource_destroy(config : Ptr[rd_kafka_ConfigResource_t]): Unit = extern

  /**
   * Helper function to destroy all ConfigResource objects in the configs array (of config_cnt elements). The array itself is not freed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigResource_destroy_array(config : Ptr[Ptr[rd_kafka_ConfigResource_t]], config_cnt : size_t): Unit = extern

  /**
   * Returns the error for this resource from an AlterConfigs request
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigResource_error(config : Ptr[rd_kafka_ConfigResource_t]): rd_kafka_resp_err_t = extern

  /**
   * Returns the error string for this resource from an AlterConfigs request, or NULL if no error.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigResource_error_string(config : Ptr[rd_kafka_ConfigResource_t]): CString = extern

  /**
   * Returns the name for config
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigResource_name(config : Ptr[rd_kafka_ConfigResource_t]): CString = extern

  /**
   * Create new ConfigResource object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigResource_new(restype : rd_kafka_ResourceType_t, resname : CString): Ptr[rd_kafka_ConfigResource_t] = extern

  /**
   * Set configuration name value pair.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigResource_set_config(config : Ptr[rd_kafka_ConfigResource_t], name : CString, value : CString): rd_kafka_resp_err_t = extern

  /**
   * Returns the ResourceType for config
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigResource_type(config : Ptr[rd_kafka_ConfigResource_t]): rd_kafka_ResourceType_t = extern

  /**
   * Returns a string representation of the confsource.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConfigSource_name(confsource : rd_kafka_ConfigSource_t): CString = extern

  /**
   * Gets the coordinator for the grpdesc group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConsumerGroupDescription_coordinator(grpdesc : Ptr[rd_kafka_ConsumerGroupDescription_t]): Ptr[rd_kafka_Node_t] = extern

  /**
   * Gets the error for the grpdesc group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConsumerGroupDescription_error(grpdesc : Ptr[rd_kafka_ConsumerGroupDescription_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Gets the group id for the grpdesc group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConsumerGroupDescription_group_id(grpdesc : Ptr[rd_kafka_ConsumerGroupDescription_t]): CString = extern

  /**
   * Is the grpdesc group a simple consumer group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConsumerGroupDescription_is_simple_consumer_group(grpdesc : Ptr[rd_kafka_ConsumerGroupDescription_t]): CInt = extern

  /**
   * Gets a member of grpdesc group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConsumerGroupDescription_member(grpdesc : Ptr[rd_kafka_ConsumerGroupDescription_t], idx : size_t): Ptr[rd_kafka_MemberDescription_t] = extern

  /**
   * Gets the members count of grpdesc group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConsumerGroupDescription_member_count(grpdesc : Ptr[rd_kafka_ConsumerGroupDescription_t]): size_t = extern

  /**
   * Gets the partition assignor for the grpdesc group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConsumerGroupDescription_partition_assignor(grpdesc : Ptr[rd_kafka_ConsumerGroupDescription_t]): CString = extern

  /**
   * Gets state for the grpdesc group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConsumerGroupDescription_state(grpdesc : Ptr[rd_kafka_ConsumerGroupDescription_t]): rd_kafka_consumer_group_state_t = extern

  /**
   * Gets the group id for the grplist group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConsumerGroupListing_group_id(grplist : Ptr[rd_kafka_ConsumerGroupListing_t]): CString = extern

  /**
   * Is the grplist group a simple consumer group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConsumerGroupListing_is_simple_consumer_group(grplist : Ptr[rd_kafka_ConsumerGroupListing_t]): CInt = extern

  /**
   * Gets state for the grplist group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ConsumerGroupListing_state(grplist : Ptr[rd_kafka_ConsumerGroupListing_t]): rd_kafka_consumer_group_state_t = extern

  /**
   * Create acls as specified by the new_acls array of size new_topic_cnt elements.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_CreateAcls(rk : Ptr[rd_kafka_t], new_acls : Ptr[Ptr[rd_kafka_AclBinding_t]], new_acls_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Get an array of acl results from a CreateAcls result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_CreateAcls_result_acls(result : Ptr[rd_kafka_CreateAcls_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_acl_result_t]] = extern

  /**
   * Create additional partitions for the given topics, as specified by the new_parts array of size new_parts_cnt elements.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_CreatePartitions(rk : Ptr[rd_kafka_t], new_parts : Ptr[Ptr[rd_kafka_NewPartitions_t]], new_parts_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Get an array of topic results from a CreatePartitions result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_CreatePartitions_result_topics(result : Ptr[rd_kafka_CreatePartitions_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_topic_result_t]] = extern

  /**
   * Create topics in cluster as specified by the new_topics array of size new_topic_cnt elements.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_CreateTopics(rk : Ptr[rd_kafka_t], new_topics : Ptr[Ptr[rd_kafka_NewTopic_t]], new_topic_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Get an array of topic results from a CreateTopics result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_CreateTopics_result_topics(result : Ptr[rd_kafka_CreateTopics_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_topic_result_t]] = extern

  /**
   * Delete acls matching the filteres provided in del_acls array of size del_acls_cnt.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteAcls(rk : Ptr[rd_kafka_t], del_acls : Ptr[Ptr[rd_kafka_AclBindingFilter_t]], del_acls_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Returns the error object for the given DeleteAcls result response, or NULL on success.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteAcls_result_response_error(result_response : Ptr[rd_kafka_DeleteAcls_result_response_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Returns the matching acls array for the given DeleteAcls result response.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteAcls_result_response_matching_acls(result_response : Ptr[rd_kafka_DeleteAcls_result_response_t], matching_acls_cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_AclBinding_t]] = extern

  /**
   * Get an array of DeleteAcls result responses from a DeleteAcls result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteAcls_result_responses(result : Ptr[rd_kafka_DeleteAcls_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_DeleteAcls_result_response_t]] = extern

  /**
   * Delete committed offsets for a set of partitions in a consumer group. This will succeed at the partition level only if the group is not actively subscribed to the corresponding topic.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteConsumerGroupOffsets(rk : Ptr[rd_kafka_t], del_grpoffsets : Ptr[Ptr[rd_kafka_DeleteConsumerGroupOffsets_t]], del_grpoffsets_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Destroy and free a DeleteConsumerGroupOffsets object previously created with rd_kafka_DeleteConsumerGroupOffsets_new()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteConsumerGroupOffsets_destroy(del_grpoffsets : Ptr[rd_kafka_DeleteConsumerGroupOffsets_t]): Unit = extern

  /**
   * Helper function to destroy all DeleteConsumerGroupOffsets objects in the del_grpoffsets array (of del_grpoffsets_cnt elements). The array itself is not freed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteConsumerGroupOffsets_destroy_array(del_grpoffsets : Ptr[Ptr[rd_kafka_DeleteConsumerGroupOffsets_t]], del_grpoffset_cnt : size_t): Unit = extern

  /**
   * Create a new DeleteConsumerGroupOffsets object. This object is later passed to rd_kafka_DeleteConsumerGroupOffsets().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteConsumerGroupOffsets_new(group : CString, partitions : Ptr[rd_kafka_topic_partition_list_t]): Ptr[rd_kafka_DeleteConsumerGroupOffsets_t] = extern

  /**
   * Get an array of results from a DeleteConsumerGroupOffsets result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteConsumerGroupOffsets_result_groups(result : Ptr[rd_kafka_DeleteConsumerGroupOffsets_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_group_result_t]] = extern

  /**
   * Destroy and free a DeleteGroup object previously created with rd_kafka_DeleteGroup_new()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteGroup_destroy(del_group : Ptr[rd_kafka_DeleteGroup_t]): Unit = extern

  /**
   * Helper function to destroy all DeleteGroup objects in the del_groups array (of del_group_cnt elements). The array itself is not freed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteGroup_destroy_array(del_groups : Ptr[Ptr[rd_kafka_DeleteGroup_t]], del_group_cnt : size_t): Unit = extern

  /**
   * Create a new DeleteGroup object. This object is later passed to rd_kafka_DeleteGroups().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteGroup_new(group : CString): Ptr[rd_kafka_DeleteGroup_t] = extern

  /**
   * Delete groups from cluster as specified by the del_groups array of size del_group_cnt elements.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteGroups(rk : Ptr[rd_kafka_t], del_groups : Ptr[Ptr[rd_kafka_DeleteGroup_t]], del_group_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Get an array of group results from a DeleteGroups result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteGroups_result_groups(result : Ptr[rd_kafka_DeleteGroups_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_group_result_t]] = extern

  /**
   * Delete records (messages) in topic partitions older than the offsets provided.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteRecords(rk : Ptr[rd_kafka_t], del_records : Ptr[Ptr[rd_kafka_DeleteRecords_t]], del_record_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Destroy and free a DeleteRecords object previously created with rd_kafka_DeleteRecords_new()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteRecords_destroy(del_records : Ptr[rd_kafka_DeleteRecords_t]): Unit = extern

  /**
   * Helper function to destroy all DeleteRecords objects in the del_groups array (of del_group_cnt elements). The array itself is not freed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteRecords_destroy_array(del_records : Ptr[Ptr[rd_kafka_DeleteRecords_t]], del_record_cnt : size_t): Unit = extern

  /**
   * Create a new DeleteRecords object. This object is later passed to rd_kafka_DeleteRecords().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteRecords_new(before_offsets : Ptr[rd_kafka_topic_partition_list_t]): Ptr[rd_kafka_DeleteRecords_t] = extern

  /**
   * Get a list of topic and partition results from a DeleteRecords result. The returned objects will contain topic, partition, offset and err. offset will be set to the post-deletion low-watermark (smallest available offset of all live replicas). err will be set per-partition if deletion failed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteRecords_result_offsets(result : Ptr[rd_kafka_DeleteRecords_result_t]): Ptr[rd_kafka_topic_partition_list_t] = extern

  /**
   * Destroy and free a DeleteTopic object previously created with rd_kafka_DeleteTopic_new()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteTopic_destroy(del_topic : Ptr[rd_kafka_DeleteTopic_t]): Unit = extern

  /**
   * Helper function to destroy all DeleteTopic objects in the del_topics array (of del_topic_cnt elements). The array itself is not freed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteTopic_destroy_array(del_topics : Ptr[Ptr[rd_kafka_DeleteTopic_t]], del_topic_cnt : size_t): Unit = extern

  /**
   * Create a new DeleteTopic object. This object is later passed to rd_kafka_DeleteTopics().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteTopic_new(topic : CString): Ptr[rd_kafka_DeleteTopic_t] = extern

  /**
   * Delete topics from cluster as specified by the topics array of size topic_cnt elements.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteTopics(rk : Ptr[rd_kafka_t], del_topics : Ptr[Ptr[rd_kafka_DeleteTopic_t]], del_topic_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Get an array of topic results from a DeleteTopics result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DeleteTopics_result_topics(result : Ptr[rd_kafka_DeleteTopics_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_topic_result_t]] = extern

  /**
   * Describe acls matching the filter provided in acl_filter
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DescribeAcls(rk : Ptr[rd_kafka_t], acl_filter : Ptr[rd_kafka_AclBindingFilter_t], options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Get an array of resource results from a DescribeAcls result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DescribeAcls_result_acls(result : Ptr[rd_kafka_DescribeAcls_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_AclBinding_t]] = extern

  /**
   * Get configuration for the specified resources in configs.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DescribeConfigs(rk : Ptr[rd_kafka_t], configs : Ptr[Ptr[rd_kafka_ConfigResource_t]], config_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Get an array of resource results from a DescribeConfigs result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DescribeConfigs_result_resources(result : Ptr[rd_kafka_DescribeConfigs_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_ConfigResource_t]] = extern

  /**
   * Describe groups from cluster as specified by the groups array of size groups_cnt elements.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DescribeConsumerGroups(rk : Ptr[rd_kafka_t], groups : Ptr[CString], groups_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Get an array of group results from a DescribeConsumerGroups result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_DescribeConsumerGroups_result_groups(result : Ptr[rd_kafka_DescribeConsumerGroups_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_ConsumerGroupDescription_t]] = extern

  /**
   * List committed offsets for a set of partitions in a consumer group.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ListConsumerGroupOffsets(rk : Ptr[rd_kafka_t], list_grpoffsets : Ptr[Ptr[rd_kafka_ListConsumerGroupOffsets_t]], list_grpoffsets_cnt : size_t, options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Destroy and free a ListConsumerGroupOffsets object previously created with rd_kafka_ListConsumerGroupOffsets_new()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ListConsumerGroupOffsets_destroy(list_grpoffsets : Ptr[rd_kafka_ListConsumerGroupOffsets_t]): Unit = extern

  /**
   * Helper function to destroy all ListConsumerGroupOffsets objects in the list_grpoffsets array (of list_grpoffsets_cnt elements). The array itself is not freed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ListConsumerGroupOffsets_destroy_array(list_grpoffsets : Ptr[Ptr[rd_kafka_ListConsumerGroupOffsets_t]], list_grpoffset_cnt : size_t): Unit = extern

  /**
   * Create a new ListConsumerGroupOffsets object. This object is later passed to rd_kafka_ListConsumerGroupOffsets().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ListConsumerGroupOffsets_new(group_id : CString, partitions : Ptr[rd_kafka_topic_partition_list_t]): Ptr[rd_kafka_ListConsumerGroupOffsets_t] = extern

  /**
   * Get an array of results from a ListConsumerGroupOffsets result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ListConsumerGroupOffsets_result_groups(result : Ptr[rd_kafka_ListConsumerGroupOffsets_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_group_result_t]] = extern

  /**
   * List the consumer groups available in the cluster.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ListConsumerGroups(rk : Ptr[rd_kafka_t], options : Ptr[rd_kafka_AdminOptions_t], rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Get an array of errors from a ListConsumerGroups call result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ListConsumerGroups_result_errors(result : Ptr[rd_kafka_ListConsumerGroups_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_error_t]] = extern

  /**
   * Get an array of valid list groups from a ListConsumerGroups result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ListConsumerGroups_result_valid(result : Ptr[rd_kafka_ListConsumerGroups_result_t], cntp : Ptr[size_t]): Ptr[Ptr[rd_kafka_ConsumerGroupListing_t]] = extern

  /**
   * Gets assigned partitions of a member assignment.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_MemberAssignment_partitions(assignment : Ptr[rd_kafka_MemberAssignment_t]): Ptr[rd_kafka_topic_partition_list_t] = extern

  /**
   * Gets assignment of member.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_MemberDescription_assignment(member : Ptr[rd_kafka_MemberDescription_t]): Ptr[rd_kafka_MemberAssignment_t] = extern

  /**
   * Gets client id of member.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_MemberDescription_client_id(member : Ptr[rd_kafka_MemberDescription_t]): CString = extern

  /**
   * Gets consumer id of member.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_MemberDescription_consumer_id(member : Ptr[rd_kafka_MemberDescription_t]): CString = extern

  /**
   * Gets group instance id of member.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_MemberDescription_group_instance_id(member : Ptr[rd_kafka_MemberDescription_t]): CString = extern

  /**
   * Gets host of member.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_MemberDescription_host(member : Ptr[rd_kafka_MemberDescription_t]): CString = extern

  /**
   * Destroy and free a NewPartitions object previously created with rd_kafka_NewPartitions_new()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_NewPartitions_destroy(new_parts : Ptr[rd_kafka_NewPartitions_t]): Unit = extern

  /**
   * Helper function to destroy all NewPartitions objects in the new_parts array (of new_parts_cnt elements). The array itself is not freed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_NewPartitions_destroy_array(new_parts : Ptr[Ptr[rd_kafka_NewPartitions_t]], new_parts_cnt : size_t): Unit = extern

  /**
   * Create a new NewPartitions. This object is later passed to rd_kafka_CreatePartitions() to increase the number of partitions to new_total_cnt for an existing topic.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_NewPartitions_new(topic : CString, new_total_cnt : size_t, errstr : CString, errstr_size : size_t): Ptr[rd_kafka_NewPartitions_t] = extern

  /**
   * Set the replica (broker id) assignment for new_partition_idx to the replica set in broker_ids (of broker_id_cnt elements).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_NewPartitions_set_replica_assignment(new_parts : Ptr[rd_kafka_NewPartitions_t], new_partition_idx : int32_t, broker_ids : Ptr[int32_t], broker_id_cnt : size_t, errstr : CString, errstr_size : size_t): rd_kafka_resp_err_t = extern

  /**
   * Destroy and free a NewTopic object previously created with rd_kafka_NewTopic_new()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_NewTopic_destroy(new_topic : Ptr[rd_kafka_NewTopic_t]): Unit = extern

  /**
   * Helper function to destroy all NewTopic objects in the new_topics array (of new_topic_cnt elements). The array itself is not freed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_NewTopic_destroy_array(new_topics : Ptr[Ptr[rd_kafka_NewTopic_t]], new_topic_cnt : size_t): Unit = extern

  /**
   * Create a new NewTopic object. This object is later passed to rd_kafka_CreateTopics().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_NewTopic_new(topic : CString, num_partitions : CInt, replication_factor : CInt, errstr : CString, errstr_size : size_t): Ptr[rd_kafka_NewTopic_t] = extern

  /**
   * Set (broker-side) topic configuration name/value pair.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_NewTopic_set_config(new_topic : Ptr[rd_kafka_NewTopic_t], name : CString, value : CString): rd_kafka_resp_err_t = extern

  /**
   * Set the replica (broker) assignment for partition to the replica set in broker_ids (of broker_id_cnt elements).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_NewTopic_set_replica_assignment(new_topic : Ptr[rd_kafka_NewTopic_t], partition : int32_t, broker_ids : Ptr[int32_t], broker_id_cnt : size_t, errstr : CString, errstr_size : size_t): rd_kafka_resp_err_t = extern

  /**
   * Get the host of node.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_Node_host(node : Ptr[rd_kafka_Node_t]): CString = extern

  /**
   * Get the id of node.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_Node_id(node : Ptr[rd_kafka_Node_t]): CInt = extern

  /**
   * Get the port of node.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_Node_port(node : Ptr[rd_kafka_Node_t]): uint16_t = extern

  /**
   * Returns a string representation of the resource_pattern_type
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ResourcePatternType_name(resource_pattern_type : rd_kafka_ResourcePatternType_t): CString = extern

  /**
   * Returns a string representation of the restype
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_ResourceType_name(restype : rd_kafka_ResourceType_t): CString = extern

  /**
   * Aborts the ongoing transaction.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_abort_transaction(rk : Ptr[rd_kafka_t], timeout_ms : CInt): Ptr[rd_kafka_error_t] = extern

  /**
   * Returns the error object for the given acl result, or NULL on success.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_acl_result_error(aclres : Ptr[rd_kafka_acl_result_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Atomic assignment of partitions to consume.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_assign(rk : Ptr[rd_kafka_t], partitions : Ptr[rd_kafka_topic_partition_list_t]): rd_kafka_resp_err_t = extern

  /**
   * Returns the current partition assignment as set by rd_kafka_assign() or rd_kafka_incremental_assign().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_assignment(rk : Ptr[rd_kafka_t], partitions : Ptr[Ptr[rd_kafka_topic_partition_list_t]]): rd_kafka_resp_err_t = extern

  /**
   * Check whether the consumer considers the current assignment to have been lost involuntarily. This method is only applicable for use with a high level subscribing consumer. Assignments are revoked immediately when determined to have been lost, so this method is only useful when reacting to a RD_KAFKA_EVENT_REBALANCE event or from within a rebalance_cb. Partitions that have been lost may already be owned by other members in the group and therefore commiting offsets, for example, may fail.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_assignment_lost(rk : Ptr[rd_kafka_t]): CInt = extern

  /**
   * Begin a new transaction.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_begin_transaction(rk : Ptr[rd_kafka_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Adds one or more brokers to the kafka handle's list of initial bootstrap brokers.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_brokers_add(rk : Ptr[rd_kafka_t], brokerlist : CString): CInt = extern

  /**
   * Returns the ClusterId as reported in broker metadata.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_clusterid(rk : Ptr[rd_kafka_t], timeout_ms : CInt): CString = extern

  /**
   * Commit offsets on broker for the provided list of partitions.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_commit(rk : Ptr[rd_kafka_t], offsets : Ptr[rd_kafka_topic_partition_list_t], async : CInt): rd_kafka_resp_err_t = extern

  /**
   * Commit message's offset on broker for the message's partition. The committed offset is the message's offset + 1.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_commit_message(rk : Ptr[rd_kafka_t], rkmessage : Ptr[rd_kafka_message_t], async : CInt): rd_kafka_resp_err_t = extern

  /**
   * Commit offsets on broker for the provided list of partitions.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_commit_queue(rk : Ptr[rd_kafka_t], offsets : Ptr[rd_kafka_topic_partition_list_t], rkqu : Ptr[rd_kafka_queue_t], cb : CFuncPtr4[Ptr[rd_kafka_t], rd_kafka_resp_err_t, Ptr[rd_kafka_topic_partition_list_t], Ptr[Byte], Unit], commit_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Commit the current transaction (as started with rd_kafka_begin_transaction()).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_commit_transaction(rk : Ptr[rd_kafka_t], timeout_ms : CInt): Ptr[rd_kafka_error_t] = extern

  /**
   * Retrieve committed offsets for topics+partitions.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_committed(rk : Ptr[rd_kafka_t], partitions : Ptr[rd_kafka_topic_partition_list_t], timeout_ms : CInt): rd_kafka_resp_err_t = extern

  /**
   * Returns the configuration object used by an rd_kafka_t instance. For use with rd_kafka_conf_get(), et.al., to extract configuration properties from a running client.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf(rk : Ptr[rd_kafka_t]): Ptr[rd_kafka_conf_t] = extern

  /**
   * Destroys a conf object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_destroy(conf : Ptr[rd_kafka_conf_t]): Unit = extern

  /**
   * Dump the configuration properties and values of conf to an array with "key", "value" pairs.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_dump(conf : Ptr[rd_kafka_conf_t], cntp : Ptr[size_t]): Ptr[CString] = extern

  /**
   * Frees a configuration dump returned from `rd_kafka_conf_dump()` or `rd_kafka_topic_conf_dump().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_dump_free(arr : Ptr[CString], cnt : size_t): Unit = extern

  /**
   * Creates a copy/duplicate of configuration object conf
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_dup(conf : Ptr[rd_kafka_conf_t]): Ptr[rd_kafka_conf_t] = extern

  /**
   * Same as rd_kafka_conf_dup() but with an array of property name prefixes to filter out (ignore) when copying.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_dup_filter(conf : Ptr[rd_kafka_conf_t], filter_cnt : size_t, filter : Ptr[CString]): Ptr[rd_kafka_conf_t] = extern

  /**
   * Enable/disable creation of a queue specific to SASL events and callbacks.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_enable_sasl_queue(conf : Ptr[rd_kafka_conf_t], enable : CInt): Unit = extern

  /**
   * Retrieve configuration value for property name.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_get(conf : Ptr[rd_kafka_conf_t], name : CString, dest : CString, dest_size : Ptr[size_t]): rd_kafka_conf_res_t = extern

  /**
   * Gets the default topic configuration as previously set with rd_kafka_conf_set_default_topic_conf() or that was implicitly created by configuring a topic-level property on the global conf object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_get_default_topic_conf(conf : Ptr[rd_kafka_conf_t]): Ptr[rd_kafka_topic_conf_t] = extern

  /**
   * Append an on_conf_destroy() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_interceptor_add_on_conf_destroy(conf : Ptr[rd_kafka_conf_t], ic_name : CString, on_conf_destroy : Ptr[rd_kafka_interceptor_f_on_conf_destroy_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_conf_dup() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_interceptor_add_on_conf_dup(conf : Ptr[rd_kafka_conf_t], ic_name : CString, on_conf_dup : Ptr[rd_kafka_interceptor_f_on_conf_dup_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_conf_set() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_interceptor_add_on_conf_set(conf : Ptr[rd_kafka_conf_t], ic_name : CString, on_conf_set : Ptr[rd_kafka_interceptor_f_on_conf_set_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_new() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_interceptor_add_on_new(conf : Ptr[rd_kafka_conf_t], ic_name : CString, on_new : Ptr[rd_kafka_interceptor_f_on_new_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Create configuration object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_new(): Ptr[rd_kafka_conf_t] = extern

  /**
   * Prints a table to fp of all supported configuration properties, their default values as well as a description.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_properties_show(fp : Ptr[FILE]): Unit = extern

  /**
   * Sets a configuration property.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set(conf : Ptr[rd_kafka_conf_t], name : CString, value : CString, errstr : CString, errstr_size : size_t): rd_kafka_conf_res_t = extern

  /**
   * Generic event callback to be used with the event API to trigger callbacks for rd_kafka_event_t objects from a background thread serving the background queue.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_background_event_cb(conf : Ptr[rd_kafka_conf_t], event_cb : CFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_event_t], Ptr[Byte], Unit]): Unit = extern

  /**
   * Set close socket callback.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_closesocket_cb(conf : Ptr[rd_kafka_conf_t], closesocket_cb : CFuncPtr2[CInt, Ptr[Byte], CInt]): Unit = extern

  /**
   * Set connect callback.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_connect_cb(conf : Ptr[rd_kafka_conf_t], connect_cb : CFuncPtr5[CInt, Ptr[sockaddr], CInt, CString, Ptr[Byte], CInt]): Unit = extern

  /**
   * Consumer: Set consume callback for use with rd_kafka_consumer_poll()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_consume_cb(conf : Ptr[rd_kafka_conf_t], consume_cb : CFuncPtr2[Ptr[rd_kafka_message_t], Ptr[Byte], Unit]): Unit = extern

  /**
   * Sets the default topic configuration to use for automatically subscribed topics (e.g., through pattern-matched topics). The topic config object is not usable after this call.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_default_topic_conf(conf : Ptr[rd_kafka_conf_t], tconf : Ptr[rd_kafka_topic_conf_t]): Unit = extern

  /**
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_dr_cb(conf : Ptr[rd_kafka_conf_t], dr_cb : CFuncPtr6[Ptr[rd_kafka_t], Ptr[Byte], size_t, rd_kafka_resp_err_t, Ptr[Byte], Ptr[Byte], Unit]): Unit = extern

  /**
   * Producer: Set delivery report callback in provided conf object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_dr_msg_cb(conf : Ptr[rd_kafka_conf_t], dr_msg_cb : CFuncPtr3[Ptr[rd_kafka_t], Ptr[rd_kafka_message_t], Ptr[Byte], Unit]): Unit = extern

  /**
   * Set callback_data for OpenSSL engine.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_engine_callback_data(conf : Ptr[rd_kafka_conf_t], callback_data : Ptr[Byte]): Unit = extern

  /**
   * Set error callback in provided conf object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_error_cb(conf : Ptr[rd_kafka_conf_t], error_cb : CFuncPtr4[Ptr[rd_kafka_t], CInt, CString, Ptr[Byte], Unit]): Unit = extern

  /**
   * Enable event sourcing. events is a bitmask of RD_KAFKA_EVENT_* of events to enable for consumption by `rd_kafka_queue_poll()`.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_events(conf : Ptr[rd_kafka_conf_t], events : CInt): Unit = extern

  /**
   * Set logger callback.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_log_cb(conf : Ptr[rd_kafka_conf_t], log_cb : CFuncPtr4[Ptr[rd_kafka_t], CInt, CString, CString, Unit]): Unit = extern

  /**
   * Set SASL/OAUTHBEARER token refresh callback in provided conf object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_oauthbearer_token_refresh_cb(conf : Ptr[rd_kafka_conf_t], oauthbearer_token_refresh_cb : CFuncPtr3[Ptr[rd_kafka_t], CString, Ptr[Byte], Unit]): Unit = extern

  /**
   * Consumer: Set offset commit callback for use with consumer groups.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_offset_commit_cb(conf : Ptr[rd_kafka_conf_t], offset_commit_cb : CFuncPtr4[Ptr[rd_kafka_t], rd_kafka_resp_err_t, Ptr[rd_kafka_topic_partition_list_t], Ptr[Byte], Unit]): Unit = extern

  /**
   * Sets the application's opaque pointer that will be passed to callbacks
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_opaque(conf : Ptr[rd_kafka_conf_t], opaque : Ptr[Byte]): Unit = extern

  /**
   * Set open callback.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_open_cb(conf : Ptr[rd_kafka_conf_t], open_cb : CFuncPtr4[CString, CInt, mode_t, Ptr[Byte], CInt]): Unit = extern

  /**
   * Consumer: Set rebalance callback for use with coordinated consumer group balancing.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_rebalance_cb(conf : Ptr[rd_kafka_conf_t], rebalance_cb : CFuncPtr4[Ptr[rd_kafka_t], rd_kafka_resp_err_t, Ptr[rd_kafka_topic_partition_list_t], Ptr[Byte], Unit]): Unit = extern

  /**
   * Set address resolution callback.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_resolve_cb(conf : Ptr[rd_kafka_conf_t], resolve_cb : CFuncPtr5[CString, CString, Ptr[addrinfo], Ptr[Ptr[addrinfo]], Ptr[Byte], CInt]): Unit = extern

  /**
   * Set socket callback.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_socket_cb(conf : Ptr[rd_kafka_conf_t], socket_cb : CFuncPtr4[CInt, CInt, CInt, Ptr[Byte], CInt]): Unit = extern

  /**
   * Set certificate/key cert_type from the cert_enc encoded memory at buffer of size bytes.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_ssl_cert(conf : Ptr[rd_kafka_conf_t], cert_type : rd_kafka_cert_type_t, cert_enc : rd_kafka_cert_enc_t, buffer : Ptr[Byte], size : size_t, errstr : CString, errstr_size : size_t): rd_kafka_conf_res_t = extern

  /**
   * Sets the verification callback of the broker certificate
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_ssl_cert_verify_cb(conf : Ptr[rd_kafka_conf_t], ssl_cert_verify_cb : CFuncPtr10[Ptr[rd_kafka_t], CString, int32_t, Ptr[CInt], CInt, CString, size_t, CString, size_t, Ptr[Byte], CInt]): rd_kafka_conf_res_t = extern

  /**
   * Set statistics callback in provided conf object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_stats_cb(conf : Ptr[rd_kafka_conf_t], stats_cb : CFuncPtr4[Ptr[rd_kafka_t], CString, size_t, Ptr[Byte], CInt]): Unit = extern

  /**
   * Set throttle callback.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_conf_set_throttle_cb(conf : Ptr[rd_kafka_conf_t], throttle_cb : CFuncPtr5[Ptr[rd_kafka_t], CString, int32_t, CInt, Ptr[Byte], Unit]): Unit = extern

  /**
   * Consume a single message from topic rkt and partition
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consume(rkt : Ptr[rd_kafka_topic_t], partition : int32_t, timeout_ms : CInt): Ptr[rd_kafka_message_t] = extern

  /**
   * Consume up to rkmessages_size from topic rkt and partition putting a pointer to each message in the application provided array rkmessages (of size rkmessages_size entries).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consume_batch(rkt : Ptr[rd_kafka_topic_t], partition : int32_t, timeout_ms : CInt, rkmessages : Ptr[Ptr[rd_kafka_message_t]], rkmessages_size : size_t): ssize_t = extern

  /**
   * Consume batch of messages from queue
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consume_batch_queue(rkqu : Ptr[rd_kafka_queue_t], timeout_ms : CInt, rkmessages : Ptr[Ptr[rd_kafka_message_t]], rkmessages_size : size_t): ssize_t = extern

  /**
   * Consumes messages from topic rkt and partition, calling the provided callback for each consumed messsage.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consume_callback(rkt : Ptr[rd_kafka_topic_t], partition : int32_t, timeout_ms : CInt, consume_cb : CFuncPtr2[Ptr[rd_kafka_message_t], Ptr[Byte], Unit], commit_opaque : Ptr[Byte]): CInt = extern

  /**
   * Consume multiple messages from queue with callback
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consume_callback_queue(rkqu : Ptr[rd_kafka_queue_t], timeout_ms : CInt, consume_cb : CFuncPtr2[Ptr[rd_kafka_message_t], Ptr[Byte], Unit], commit_opaque : Ptr[Byte]): CInt = extern

  /**
   * Consume from queue
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consume_queue(rkqu : Ptr[rd_kafka_queue_t], timeout_ms : CInt): Ptr[rd_kafka_message_t] = extern

  /**
   * Start consuming messages for topic rkt and partition at offset offset which may either be an absolute (0..N) or one of the logical offsets: - RD_KAFKA_OFFSET_BEGINNING - RD_KAFKA_OFFSET_END - RD_KAFKA_OFFSET_STORED - RD_KAFKA_OFFSET_TAIL
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consume_start(rkt : Ptr[rd_kafka_topic_t], partition : int32_t, offset : int64_t): CInt = extern

  /**
   * Same as rd_kafka_consume_start() but re-routes incoming messages to the provided queue rkqu (which must have been previously allocated with `rd_kafka_queue_new()`.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consume_start_queue(rkt : Ptr[rd_kafka_topic_t], partition : int32_t, offset : int64_t, rkqu : Ptr[rd_kafka_queue_t]): CInt = extern

  /**
   * Stop consuming messages for topic rkt and partition, purging all messages currently in the local queue.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consume_stop(rkt : Ptr[rd_kafka_topic_t], partition : int32_t): CInt = extern

  /**
   * Close the consumer.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_close(rk : Ptr[rd_kafka_t]): rd_kafka_resp_err_t = extern

  /**
   * Asynchronously close the consumer.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_close_queue(rk : Ptr[rd_kafka_t], rkqu : Ptr[rd_kafka_queue_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Returns 1 if the consumer is closed, else 0.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_closed(rk : Ptr[rd_kafka_t]): CInt = extern

  /**
   * Returns the current consumer group metadata associated with this consumer, or NULL if rk is not a consumer configured with a group.id. This metadata object should be passed to the transactional producer's rd_kafka_send_offsets_to_transaction() API.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_group_metadata(rk : Ptr[rd_kafka_t]): Ptr[rd_kafka_consumer_group_metadata_t] = extern

  /**
   * Frees the consumer group metadata object as returned by rd_kafka_consumer_group_metadata().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_group_metadata_destroy(_0 : Ptr[rd_kafka_consumer_group_metadata_t]): Unit = extern

  /**
   * Create a new consumer group metadata object. This is typically only used for writing tests.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_group_metadata_new(group_id : CString): Ptr[rd_kafka_consumer_group_metadata_t] = extern

  /**
   * Create a new consumer group metadata object. This is typically only used for writing tests.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_group_metadata_new_with_genid(group_id : CString, generation_id : int32_t, member_id : CString, group_instance_id : CString): Ptr[rd_kafka_consumer_group_metadata_t] = extern

  /**
   * Reads serialized consumer group metadata and returns a consumer group metadata object. This is mainly for client binding use and not for application use.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_group_metadata_read(cgmdp : Ptr[Ptr[rd_kafka_consumer_group_metadata_t]], buffer : Ptr[Byte], size : size_t): Ptr[rd_kafka_error_t] = extern

  /**
   * Serialize the consumer group metadata to a binary format. This is mainly for client binding use and not for application use.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_group_metadata_write(cgmd : Ptr[rd_kafka_consumer_group_metadata_t], bufferp : Ptr[Ptr[Byte]], sizep : Ptr[size_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Returns a code for a state name.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_group_state_code(name : CString): rd_kafka_consumer_group_state_t = extern

  /**
   * Returns a name for a state code.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_group_state_name(state : rd_kafka_consumer_group_state_t): CString = extern

  /**
   * Poll the consumer for messages or events.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_consumer_poll(rk : Ptr[rd_kafka_t], timeout_ms : CInt): Ptr[rd_kafka_message_t] = extern

  /**
   * Returns the current ControllerId as reported in broker metadata.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_controllerid(rk : Ptr[rd_kafka_t], timeout_ms : CInt): int32_t = extern

  /**
   * Creates a copy/duplicate of rk 's default topic configuration object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_default_topic_conf_dup(rk : Ptr[rd_kafka_t]): Ptr[rd_kafka_topic_conf_t] = extern

  /**
   * Destroy Kafka handle.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_destroy(rk : Ptr[rd_kafka_t]): Unit = extern

  /**
   * Destroy Kafka handle according to specified destroy flags
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_destroy_flags(rk : Ptr[rd_kafka_t], flags : CInt): Unit = extern

  /**
   * Dumps rdkafka's internal state for handle rk to stream fp
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_dump(fp : Ptr[FILE], rk : Ptr[rd_kafka_t]): Unit = extern

  /**
   * Returns the error code name (enum name).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_err2name(err : rd_kafka_resp_err_t): CString = extern

  /**
   * Returns a human readable representation of a kafka error.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_err2str(err : rd_kafka_resp_err_t): CString = extern

  /**
   * Returns the thread-local system errno
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_errno(): CInt = extern

  /**
   * Converts the system errno value errnox to a rd_kafka_resp_err_t error code upon failure from the following functions: - rd_kafka_topic_new() - rd_kafka_consume_start() - rd_kafka_consume_stop() - rd_kafka_consume() - rd_kafka_consume_batch() - rd_kafka_consume_callback() - rd_kafka_consume_queue() - rd_kafka_produce()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_errno2err(errnox : CInt): rd_kafka_resp_err_t = extern

  /**
   * Returns the error code for error or RD_KAFKA_RESP_ERR_NO_ERROR if error is NULL.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_error_code(error : Ptr[rd_kafka_error_t]): rd_kafka_resp_err_t = extern

  /**
   * Free and destroy an error object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_error_destroy(error : Ptr[rd_kafka_error_t]): Unit = extern

  /**
   * Returns 1 if the error is a fatal error, indicating that the client instance is no longer usable, else 0 (also if error is NULL).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_error_is_fatal(error : Ptr[rd_kafka_error_t]): CInt = extern

  /**
   * Returns 1 if the operation may be retried, else 0 (also if error is NULL).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_error_is_retriable(error : Ptr[rd_kafka_error_t]): CInt = extern

  /**
   * Returns the error code name for error, e.g, "ERR_UNKNOWN_MEMBER_ID", or an empty string if error is NULL.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_error_name(error : Ptr[rd_kafka_error_t]): CString = extern

  /**
   * Create a new error object with error code and optional human readable error string in fmt.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_error_new(code : rd_kafka_resp_err_t, fmt : CString, rest: Any*): Ptr[rd_kafka_error_t] = extern

  /**
   * Returns a human readable error string for error, or an empty string if error is NULL.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_error_string(error : Ptr[rd_kafka_error_t]): CString = extern

  /**
   * Returns 1 if the error is an abortable transaction error in which case the application must call rd_kafka_abort_transaction() and start a new transaction with rd_kafka_begin_transaction() if it wishes to proceed with transactions. Else returns 0 (also if error is NULL).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_error_txn_requires_abort(error : Ptr[rd_kafka_error_t]): CInt = extern

  /**
   * Get AlterConfigs result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_AlterConfigs_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_AlterConfigs_result_t] = extern

  /**
   * Get AlterConsumerGroupOffsets result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_AlterConsumerGroupOffsets_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_AlterConsumerGroupOffsets_result_t] = extern

  /**
   * Returns the result of a CreateAcls request, or NULL if event is of different type.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_CreateAcls_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_CreateAcls_result_t] = extern

  /**
   * Get CreatePartitions result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_CreatePartitions_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_CreatePartitions_result_t] = extern

  /**
   * Get CreateTopics result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_CreateTopics_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_CreateTopics_result_t] = extern

  /**
   * Returns the result of a DeleteAcls request, or NULL if event is of different type.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_DeleteAcls_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_DeleteAcls_result_t] = extern

  /**
   * Get DeleteConsumerGroupOffsets result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_DeleteConsumerGroupOffsets_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_DeleteConsumerGroupOffsets_result_t] = extern

  /**
   * Get DeleteGroups result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_DeleteGroups_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_DeleteGroups_result_t] = extern

  /**
   * Returns the result of a DeleteRecords request, or NULL if event is of different type.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_DeleteRecords_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_DeleteRecords_result_t] = extern

  /**
   * Get DeleteTopics result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_DeleteTopics_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_DeleteTopics_result_t] = extern

  /**
   * Returns the result of a DescribeAcls request, or NULL if event is of different type.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_DescribeAcls_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_DescribeAcls_result_t] = extern

  /**
   * Get DescribeConfigs result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_DescribeConfigs_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_DescribeConfigs_result_t] = extern

  /**
   * Get DescribeConsumerGroups result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_DescribeConsumerGroups_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_DescribeConsumerGroups_result_t] = extern

  /**
   * Get ListConsumerGroupOffsets result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_ListConsumerGroupOffsets_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_ListConsumerGroupOffsets_result_t] = extern

  /**
   * Get ListConsumerGroups result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_ListConsumerGroups_result(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_ListConsumerGroups_result_t] = extern

  /**
   * Returns the associated configuration string for the event, or NULL if the configuration property is not set or if not applicable for the given event type.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_config_string(rkev : Ptr[rd_kafka_event_t]): CString = extern

  /**
   * Extract log debug context from event.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_debug_contexts(rkev : Ptr[rd_kafka_event_t], dst : CString, dstsize : size_t): CInt = extern

  /**
   * Destroy an event.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_destroy(rkev : Ptr[rd_kafka_event_t]): Unit = extern

  /**
   * Returns the error code for the event.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_error(rkev : Ptr[rd_kafka_event_t]): rd_kafka_resp_err_t = extern

  /**
   * Returns 1 if the error is a fatal error, else 0.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_error_is_fatal(rkev : Ptr[rd_kafka_event_t]): CInt = extern

  /**
   * Returns the error string (if any). An application should check that rd_kafka_event_error() returns non-zero before calling this function.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_error_string(rkev : Ptr[rd_kafka_event_t]): CString = extern

  /**
   * Extract log message from the event.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_log(rkev : Ptr[rd_kafka_event_t], fac : Ptr[CString], str : Ptr[CString], level : Ptr[CInt]): CInt = extern

  /**
   * Extacts size message(s) from the event into the pre-allocated array rkmessages.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_message_array(rkev : Ptr[rd_kafka_event_t], rkmessages : Ptr[Ptr[rd_kafka_message_t]], size : size_t): size_t = extern

  /**
   * Returns the number of remaining messages in the event.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_message_count(rkev : Ptr[rd_kafka_event_t]): size_t = extern

  /**
   * Returns the next message from an event.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_message_next(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_message_t] = extern

  /**
   * Returns the event type's name for the given event.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_name(rkev : Ptr[rd_kafka_event_t]): CString = extern

  /**
   * Returns the event opaque (if any) as passed to rd_kafka_commit() (et.al) or rd_kafka_AdminOptions_set_opaque(), depending on event type.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_opaque(rkev : Ptr[rd_kafka_event_t]): Ptr[Byte] = extern

  /**
   * Extract stats from the event.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_stats(rkev : Ptr[rd_kafka_event_t]): CString = extern

  /**
   * Returns a newly allocated topic_partition container, if applicable for the event type, else NULL.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_topic_partition(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_topic_partition_t] = extern

  /**
   * Returns the topic partition list from the event.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_topic_partition_list(rkev : Ptr[rd_kafka_event_t]): Ptr[rd_kafka_topic_partition_list_t] = extern

  /**
   * Returns the event type for the given event.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_event_type(rkev : Ptr[rd_kafka_event_t]): rd_kafka_event_type_t = extern

  /**
   * Returns the first fatal error set on this client instance, or RD_KAFKA_RESP_ERR_NO_ERROR if no fatal error has occurred.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_fatal_error(rk : Ptr[rd_kafka_t], errstr : CString, errstr_size : size_t): rd_kafka_resp_err_t = extern

  /**
   * Wait until all outstanding produce requests, et.al, are completed. This should typically be done prior to destroying a producer instance to make sure all queued and in-flight produce requests are completed before terminating.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_flush(rk : Ptr[rd_kafka_t], timeout_ms : CInt): rd_kafka_resp_err_t = extern

  /**
   * Retrieve supported debug contexts for use with the "debug" configuration property. (runtime)
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_get_debug_contexts(): CString = extern

  /**
   * Returns the full list of error codes.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_get_err_descs(errdescs : Ptr[Ptr[rd_kafka_err_desc]], cntp : Ptr[size_t]): Unit = extern

  /**
   * Get last known low (oldest/beginning) and high (newest/end) offsets for partition.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_get_watermark_offsets(rk : Ptr[rd_kafka_t], topic : CString, partition : int32_t, low : Ptr[int64_t], high : Ptr[int64_t]): rd_kafka_resp_err_t = extern

  /**
   * Release list memory
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_group_list_destroy(grplist : Ptr[rd_kafka_group_list]): Unit = extern

  /**
   * Returns the error for the given group result, or NULL on success. lifetime of the returned error is the same as the groupres.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_group_result_error(groupres : Ptr[rd_kafka_group_result_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Returns the name of the group for the given group result. lifetime of the returned string is the same as the groupres.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_group_result_name(groupres : Ptr[rd_kafka_group_result_t]): CString = extern

  /**
   * Returns the partitions/offsets for the given group result, if applicable to the request type, else NULL. lifetime of the returned list is the same as the groupres.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_group_result_partitions(groupres : Ptr[rd_kafka_group_result_t]): Ptr[rd_kafka_topic_partition_list_t] = extern

  /**
   * Add header with name name and value val (copied) of size size (not including null-terminator).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_header_add(hdrs : Ptr[rd_kafka_headers_t], name : CString, name_size : ssize_t, value : Ptr[Byte], value_size : ssize_t): rd_kafka_resp_err_t = extern

  /**
   * Returns the number of header key/value pairs
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_header_cnt(hdrs : Ptr[rd_kafka_headers_t]): size_t = extern

  /**
   * Iterator for headers matching name.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_header_get(hdrs : Ptr[rd_kafka_headers_t], idx : size_t, name : CString, valuep : Ptr[Ptr[Byte]], sizep : Ptr[size_t]): rd_kafka_resp_err_t = extern

  /**
   * Iterator for all headers.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_header_get_all(hdrs : Ptr[rd_kafka_headers_t], idx : size_t, namep : Ptr[CString], valuep : Ptr[Ptr[Byte]], sizep : Ptr[size_t]): rd_kafka_resp_err_t = extern

  /**
   * Find last header in list hdrs matching name.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_header_get_last(hdrs : Ptr[rd_kafka_headers_t], name : CString, valuep : Ptr[Ptr[Byte]], sizep : Ptr[size_t]): rd_kafka_resp_err_t = extern

  /**
   * Remove all headers for the given key (if any).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_header_remove(hdrs : Ptr[rd_kafka_headers_t], name : CString): rd_kafka_resp_err_t = extern

  /**
   * Make a copy of headers list src.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_headers_copy(src : Ptr[rd_kafka_headers_t]): Ptr[rd_kafka_headers_t] = extern

  /**
   * Destroy the headers list. The object and any returned value pointers are not usable after this call.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_headers_destroy(hdrs : Ptr[rd_kafka_headers_t]): Unit = extern

  /**
   * Create a new headers list.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_headers_new(initial_count : size_t): Ptr[rd_kafka_headers_t] = extern

  /**
   * Incrementally add partitions to the current assignment.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_incremental_assign(rk : Ptr[rd_kafka_t], partitions : Ptr[rd_kafka_topic_partition_list_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Incrementally remove partitions from the current assignment.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_incremental_unassign(rk : Ptr[rd_kafka_t], partitions : Ptr[rd_kafka_topic_partition_list_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Initialize transactions for the producer instance.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_init_transactions(rk : Ptr[rd_kafka_t], timeout_ms : CInt): Ptr[rd_kafka_error_t] = extern

  /**
   * Append an on_acknowledgement() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_interceptor_add_on_acknowledgement(rk : Ptr[rd_kafka_t], ic_name : CString, on_acknowledgement : Ptr[rd_kafka_interceptor_f_on_acknowledgement_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_broker_state_change() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_interceptor_add_on_broker_state_change(rk : Ptr[rd_kafka_t], ic_name : CString, on_broker_state_change : Ptr[rd_kafka_interceptor_f_on_broker_state_change_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_commit() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_interceptor_add_on_commit(rk : Ptr[rd_kafka_t], ic_name : CString, on_commit : Ptr[rd_kafka_interceptor_f_on_commit_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_consume() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_interceptor_add_on_consume(rk : Ptr[rd_kafka_t], ic_name : CString, on_consume : Ptr[rd_kafka_interceptor_f_on_consume_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_destroy() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_interceptor_add_on_destroy(rk : Ptr[rd_kafka_t], ic_name : CString, on_destroy : Ptr[rd_kafka_interceptor_f_on_destroy_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_request_sent() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_interceptor_add_on_request_sent(rk : Ptr[rd_kafka_t], ic_name : CString, on_request_sent : Ptr[rd_kafka_interceptor_f_on_request_sent_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_response_received() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_interceptor_add_on_response_received(rk : Ptr[rd_kafka_t], ic_name : CString, on_response_received : Ptr[rd_kafka_interceptor_f_on_response_received_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_send() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_interceptor_add_on_send(rk : Ptr[rd_kafka_t], ic_name : CString, on_send : Ptr[rd_kafka_interceptor_f_on_send_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_thread_exit() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_interceptor_add_on_thread_exit(rk : Ptr[rd_kafka_t], ic_name : CString, on_thread_exit : Ptr[rd_kafka_interceptor_f_on_thread_exit_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Append an on_thread_start() interceptor.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_interceptor_add_on_thread_start(rk : Ptr[rd_kafka_t], ic_name : CString, on_thread_start : Ptr[rd_kafka_interceptor_f_on_thread_start_t], ic_opaque : Ptr[Byte]): rd_kafka_resp_err_t = extern

  /**
   * Returns the last error code generated by a legacy API call in the current thread.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_last_error(): rd_kafka_resp_err_t = extern

  /**
   * List and describe client groups in cluster.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_list_groups(rk : Ptr[rd_kafka_t], group : CString, grplistp : Ptr[Ptr[rd_kafka_group_list]], timeout_ms : CInt): rd_kafka_resp_err_t = extern

  /**
   * Builtin (default) log sink: print to stderr
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_log_print(rk : Ptr[rd_kafka_t], level : CInt, fac : CString, buf : CString): Unit = extern

  /**
   * Builtin log sink: print to syslog.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_log_syslog(rk : Ptr[rd_kafka_t], level : CInt, fac : CString, buf : CString): Unit = extern

  /**
   * Allocate and zero memory using the same allocator librdkafka uses.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_mem_calloc(rk : Ptr[rd_kafka_t], num : size_t, size : size_t): Ptr[Byte] = extern

  /**
   * Free pointer returned by librdkafka
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_mem_free(rk : Ptr[rd_kafka_t], ptr : Ptr[Byte]): Unit = extern

  /**
   * Allocate memory using the same allocator librdkafka uses.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_mem_malloc(rk : Ptr[rd_kafka_t], size : size_t): Ptr[Byte] = extern

  /**
   * Returns this client's broker-assigned group member id.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_memberid(rk : Ptr[rd_kafka_t]): CString = extern

  /**
   * Returns the broker id of the broker the message was produced to or fetched from.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_message_broker_id(rkmessage : Ptr[rd_kafka_message_t]): int32_t = extern

  /**
   * Frees resources for rkmessage and hands ownership back to rdkafka.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_message_destroy(rkmessage : Ptr[rd_kafka_message_t]): Unit = extern

  /**
   * Get the message header list and detach the list from the message making the application the owner of the headers. The application must eventually destroy the headers using rd_kafka_headers_destroy(). The message's headers will be set to NULL.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_message_detach_headers(rkmessage : Ptr[rd_kafka_message_t], hdrsp : Ptr[Ptr[rd_kafka_headers_t]]): rd_kafka_resp_err_t = extern

  /**
   * Returns the error string for an errored rd_kafka_message_t or NULL if there was no error.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_message_errstr(rkmessage : Ptr[rd_kafka_message_t]): CString = extern

  /**
   * Get the message header list.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_message_headers(rkmessage : Ptr[rd_kafka_message_t], hdrsp : Ptr[Ptr[rd_kafka_headers_t]]): rd_kafka_resp_err_t = extern

  /**
   * Returns the latency for a produced message measured from the produce() call.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_message_latency(rkmessage : Ptr[rd_kafka_message_t]): int64_t = extern

  /**
   * Returns the message's partition leader epoch at the time the message was fetched and if known, else -1.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_message_leader_epoch(rkmessage : Ptr[rd_kafka_message_t]): int32_t = extern

  /**
   * Replace the message's current headers with a new list.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_message_set_headers(rkmessage : Ptr[rd_kafka_message_t], hdrs : Ptr[rd_kafka_headers_t]): Unit = extern

  /**
   * Returns the message's persistence status in the topic log.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_message_status(rkmessage : Ptr[rd_kafka_message_t]): rd_kafka_msg_status_t = extern

  /**
   * Returns the message timestamp for a consumed message.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_message_timestamp(rkmessage : Ptr[rd_kafka_message_t], tstype : Ptr[rd_kafka_timestamp_type_t]): int64_t = extern

  /**
   * Request Metadata from broker.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_metadata(rk : Ptr[rd_kafka_t], all_topics : CInt, only_rkt : Ptr[rd_kafka_topic_t], metadatap : Ptr[Ptr[rd_kafka_metadata]], timeout_ms : CInt): rd_kafka_resp_err_t = extern

  /**
   * Release metadata memory.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_metadata_destroy(metadata : Ptr[rd_kafka_metadata]): Unit = extern

  /**
   * Consistent partitioner.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_msg_partitioner_consistent(rkt : Ptr[rd_kafka_topic_t], key : Ptr[Byte], keylen : size_t, partition_cnt : int32_t, rkt_opaque : Ptr[Byte], msg_opaque : Ptr[Byte]): int32_t = extern

  /**
   * Consistent-Random partitioner.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_msg_partitioner_consistent_random(rkt : Ptr[rd_kafka_topic_t], key : Ptr[Byte], keylen : size_t, partition_cnt : int32_t, rkt_opaque : Ptr[Byte], msg_opaque : Ptr[Byte]): int32_t = extern

  /**
   * FNV-1a partitioner.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_msg_partitioner_fnv1a(rkt : Ptr[rd_kafka_topic_t], key : Ptr[Byte], keylen : size_t, partition_cnt : int32_t, rkt_opaque : Ptr[Byte], msg_opaque : Ptr[Byte]): int32_t = extern

  /**
   * Consistent-Random FNV-1a partitioner.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_msg_partitioner_fnv1a_random(rkt : Ptr[rd_kafka_topic_t], key : Ptr[Byte], keylen : size_t, partition_cnt : int32_t, rkt_opaque : Ptr[Byte], msg_opaque : Ptr[Byte]): int32_t = extern

  /**
   * Murmur2 partitioner (Java compatible).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_msg_partitioner_murmur2(rkt : Ptr[rd_kafka_topic_t], key : Ptr[Byte], keylen : size_t, partition_cnt : int32_t, rkt_opaque : Ptr[Byte], msg_opaque : Ptr[Byte]): int32_t = extern

  /**
   * Consistent-Random Murmur2 partitioner (Java compatible).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_msg_partitioner_murmur2_random(rkt : Ptr[rd_kafka_topic_t], key : Ptr[Byte], keylen : size_t, partition_cnt : int32_t, rkt_opaque : Ptr[Byte], msg_opaque : Ptr[Byte]): int32_t = extern

  /**
   * Random partitioner.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_msg_partitioner_random(rkt : Ptr[rd_kafka_topic_t], key : Ptr[Byte], keylen : size_t, partition_cnt : int32_t, rkt_opaque : Ptr[Byte], msg_opaque : Ptr[Byte]): int32_t = extern

  /**
   * Returns Kafka handle name.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_name(rk : Ptr[rd_kafka_t]): CString = extern

  /**
   * Creates a new Kafka handle and starts its operation according to the specified type ( RD_KAFKA_CONSUMER or RD_KAFKA_PRODUCER).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_new(`type` : rd_kafka_type_t, conf : Ptr[rd_kafka_conf_t], errstr : CString, errstr_size : size_t): Ptr[rd_kafka_t] = extern

  /**
   * Set SASL/OAUTHBEARER token and metadata
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_oauthbearer_set_token(rk : Ptr[rd_kafka_t], token_value : CString, md_lifetime_ms : int64_t, md_principal_name : CString, extensions : Ptr[CString], extension_size : size_t, errstr : CString, errstr_size : size_t): rd_kafka_resp_err_t = extern

  /**
   * SASL/OAUTHBEARER token refresh failure indicator.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_oauthbearer_set_token_failure(rk : Ptr[rd_kafka_t], errstr : CString): rd_kafka_resp_err_t = extern

  /**
   * Store offset offset + 1 for topic rkt partition partition.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_offset_store(rkt : Ptr[rd_kafka_topic_t], partition : int32_t, offset : int64_t): rd_kafka_resp_err_t = extern

  /**
   * Store offset +1 for the consumed message.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_offset_store_message(rkmessage : Ptr[rd_kafka_message_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Look up the offsets for the given partitions by timestamp.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_offsets_for_times(rk : Ptr[rd_kafka_t], offsets : Ptr[rd_kafka_topic_partition_list_t], timeout_ms : CInt): rd_kafka_resp_err_t = extern

  /**
   * Store offsets for next auto-commit for one or more partitions.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_offsets_store(rk : Ptr[rd_kafka_t], offsets : Ptr[rd_kafka_topic_partition_list_t]): rd_kafka_resp_err_t = extern

  /**
   * Retrieves the opaque pointer previously set with rd_kafka_conf_set_opaque()
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_opaque(rk : Ptr[rd_kafka_t]): Ptr[Byte] = extern

  /**
   * Returns the current out queue length.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_outq_len(rk : Ptr[rd_kafka_t]): CInt = extern

  /**
   * Pause producing or consumption for the provided list of partitions.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_pause_partitions(rk : Ptr[rd_kafka_t], partitions : Ptr[rd_kafka_topic_partition_list_t]): rd_kafka_resp_err_t = extern

  /**
   * Polls the provided kafka handle for events.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_poll(rk : Ptr[rd_kafka_t], timeout_ms : CInt): CInt = extern

  /**
   * Redirect the main (rd_kafka_poll()) queue to the KafkaConsumer's queue (rd_kafka_consumer_poll()).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_poll_set_consumer(rk : Ptr[rd_kafka_t]): rd_kafka_resp_err_t = extern

  /**
   * Retrieve current positions (offsets) for topics+partitions.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_position(rk : Ptr[rd_kafka_t], partitions : Ptr[rd_kafka_topic_partition_list_t]): rd_kafka_resp_err_t = extern

  /**
   * Produce and send a single message to broker.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_produce(rkt : Ptr[rd_kafka_topic_t], partition : int32_t, msgflags : CInt, payload : Ptr[Byte], len : size_t, key : Ptr[Byte], keylen : size_t, msg_opaque : Ptr[Byte]): CInt = extern

  /**
   * Produce multiple messages.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_produce_batch(rkt : Ptr[rd_kafka_topic_t], partition : int32_t, msgflags : CInt, rkmessages : Ptr[rd_kafka_message_t], message_cnt : CInt): CInt = extern

  /**
   * Produce and send a single message to broker.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_producev(rk : Ptr[rd_kafka_t], rest: Any*): rd_kafka_resp_err_t = extern

  /**
   * Produce and send a single message to broker.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_produceva(rk : Ptr[rd_kafka_t], vus : Ptr[rd_kafka_vu_t], cnt : size_t): Ptr[rd_kafka_error_t] = extern

  /**
   * Purge messages currently handled by the producer instance.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_purge(rk : Ptr[rd_kafka_t], purge_flags : CInt): rd_kafka_resp_err_t = extern

  /**
   * Query broker for low (oldest/beginning) and high (newest/end) offsets for partition.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_query_watermark_offsets(rk : Ptr[rd_kafka_t], topic : CString, partition : int32_t, low : Ptr[int64_t], high : Ptr[int64_t], timeout_ms : CInt): rd_kafka_resp_err_t = extern

  /**
   * Enable callback event triggering for queue.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_cb_event_enable(rkqu : Ptr[rd_kafka_queue_t], event_cb : CFuncPtr2[Ptr[rd_kafka_t], Ptr[Byte], Unit], qev_opaque : Ptr[Byte]): Unit = extern

  /**
   * Destroy a queue, purging all of its enqueued messages.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_destroy(rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Forward/re-route queue src to dst. If dst is NULL the forwarding is removed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_forward(src : Ptr[rd_kafka_queue_t], dst : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * Returns a reference to the background thread queue, or NULL if the background queue is not enabled.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_get_background(rk : Ptr[rd_kafka_t]): Ptr[rd_kafka_queue_t] = extern

  /**
   * Returns a reference to the librdkafka consumer queue. This is the queue served by rd_kafka_consumer_poll().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_get_consumer(rk : Ptr[rd_kafka_t]): Ptr[rd_kafka_queue_t] = extern

  /**
   * Returns a reference to the main librdkafka event queue. This is the queue served by rd_kafka_poll().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_get_main(rk : Ptr[rd_kafka_t]): Ptr[rd_kafka_queue_t] = extern

  /**
   * Returns a reference to the partition's queue, or NULL if partition is invalid.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_get_partition(rk : Ptr[rd_kafka_t], topic : CString, partition : int32_t): Ptr[rd_kafka_queue_t] = extern

  /**
   * Returns a reference to the SASL callback queue, if a SASL mechanism with callbacks is configured (currently only OAUTHBEARER), else returns NULL.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_get_sasl(rk : Ptr[rd_kafka_t]): Ptr[rd_kafka_queue_t] = extern

  /**
   * Enable IO event triggering for queue.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_io_event_enable(rkqu : Ptr[rd_kafka_queue_t], fd : CInt, payload : Ptr[Byte], size : size_t): Unit = extern

  /**
   * Returns the current number of elements in queue.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_length(rkqu : Ptr[rd_kafka_queue_t]): size_t = extern

  /**
   * Create a new message queue.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_new(rk : Ptr[rd_kafka_t]): Ptr[rd_kafka_queue_t] = extern

  /**
   * Poll a queue for an event for max timeout_ms.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_poll(rkqu : Ptr[rd_kafka_queue_t], timeout_ms : CInt): Ptr[rd_kafka_event_t] = extern

  /**
   * Poll a queue for events served through callbacks for max timeout_ms.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_poll_callback(rkqu : Ptr[rd_kafka_queue_t], timeout_ms : CInt): CInt = extern

  /**
   * Cancels the current rd_kafka_queue_poll() on rkqu.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_queue_yield(rkqu : Ptr[rd_kafka_queue_t]): Unit = extern

  /**
   * The rebalance protocol currently in use. This will be "NONE" if the consumer has not (yet) joined a group, else it will match the rebalance protocol ("EAGER", "COOPERATIVE") of the configured and selected assignor(s). All configured assignors must have the same protocol type, meaning online migration of a consumer group from using one protocol to another (in particular upgading from EAGER to COOPERATIVE) without a restart is not currently supported.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_rebalance_protocol(rk : Ptr[rd_kafka_t]): CString = extern

  /**
   * Resume producing consumption for the provided list of partitions.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_resume_partitions(rk : Ptr[rd_kafka_t], partitions : Ptr[rd_kafka_topic_partition_list_t]): rd_kafka_resp_err_t = extern

  /**
   * Enable SASL OAUTHBEARER refresh callbacks on the librdkafka background thread.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_sasl_background_callbacks_enable(rk : Ptr[rd_kafka_t]): Ptr[rd_kafka_error_t] = extern

  /**
   * Sets SASL credentials used for SASL PLAIN and SCRAM mechanisms by this Kafka client.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_sasl_set_credentials(rk : Ptr[rd_kafka_t], username : CString, password : CString): Ptr[rd_kafka_error_t] = extern

  /**
   * Seek consumer for topic+partition to offset which is either an absolute or logical offset.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_seek(rkt : Ptr[rd_kafka_topic_t], partition : int32_t, offset : int64_t, timeout_ms : CInt): rd_kafka_resp_err_t = extern

  /**
   * Seek consumer for partitions in partitions to the per-partition offset in the .offset field of partitions.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_seek_partitions(rk : Ptr[rd_kafka_t], partitions : Ptr[rd_kafka_topic_partition_list_t], timeout_ms : CInt): Ptr[rd_kafka_error_t] = extern

  /**
   * Sends a list of topic partition offsets to the consumer group coordinator for cgmetadata, and marks the offsets as part part of the current transaction. These offsets will be considered committed only if the transaction is committed successfully.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_send_offsets_to_transaction(rk : Ptr[rd_kafka_t], offsets : Ptr[rd_kafka_topic_partition_list_t], cgmetadata : Ptr[rd_kafka_consumer_group_metadata_t], timeout_ms : CInt): Ptr[rd_kafka_error_t] = extern

  /**
   * Specifies the maximum logging level emitted by internal kafka logging and debugging.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_set_log_level(rk : Ptr[rd_kafka_t], level : CInt): Unit = extern

  /**
   * Forward librdkafka logs (and debug) to the specified queue for serving with one of the ..poll() calls.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_set_log_queue(rk : Ptr[rd_kafka_t], rkqu : Ptr[rd_kafka_queue_t]): rd_kafka_resp_err_t = extern

  /**
   * Set logger function.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_set_logger(rk : Ptr[rd_kafka_t], func : CFuncPtr4[Ptr[rd_kafka_t], CInt, CString, CString, Unit]): Unit = extern

  /**
   * Subscribe to topic set using balanced consumer groups.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_subscribe(rk : Ptr[rd_kafka_t], topics : Ptr[rd_kafka_topic_partition_list_t]): rd_kafka_resp_err_t = extern

  /**
   * Returns the current topic subscription
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_subscription(rk : Ptr[rd_kafka_t], topics : Ptr[Ptr[rd_kafka_topic_partition_list_t]]): rd_kafka_resp_err_t = extern

  /**
   * Trigger a fatal error for testing purposes.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_test_fatal_error(rk : Ptr[rd_kafka_t], err : rd_kafka_resp_err_t, reason : CString): rd_kafka_resp_err_t = extern

  /**
   * Retrieve the current number of threads in use by librdkafka.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_thread_cnt(): CInt = extern

  /**
   * Destroys a topic conf object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_conf_destroy(topic_conf : Ptr[rd_kafka_topic_conf_t]): Unit = extern

  /**
   * Dump the topic configuration properties and values of conf to an array with "key", "value" pairs.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_conf_dump(conf : Ptr[rd_kafka_topic_conf_t], cntp : Ptr[size_t]): Ptr[CString] = extern

  /**
   * Creates a copy/duplicate of topic configuration object conf.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_conf_dup(conf : Ptr[rd_kafka_topic_conf_t]): Ptr[rd_kafka_topic_conf_t] = extern

  /**
   * Retrieve topic configuration value for property name.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_conf_get(conf : Ptr[rd_kafka_topic_conf_t], name : CString, dest : CString, dest_size : Ptr[size_t]): rd_kafka_conf_res_t = extern

  /**
   * Create topic configuration object
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_conf_new(): Ptr[rd_kafka_topic_conf_t] = extern

  /**
   * Sets a single rd_kafka_topic_conf_t value by property name.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_conf_set(conf : Ptr[rd_kafka_topic_conf_t], name : CString, value : CString, errstr : CString, errstr_size : size_t): rd_kafka_conf_res_t = extern

  /**
   * Producer: Set message queueing order comparator callback.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_conf_set_msg_order_cmp(topic_conf : Ptr[rd_kafka_topic_conf_t], msg_order_cmp : CFuncPtr2[Ptr[rd_kafka_message_t], Ptr[rd_kafka_message_t], CInt]): Unit = extern

  /**
   * Sets the application's opaque pointer that will be passed to all topic callbacks as the rkt_opaque argument.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_conf_set_opaque(conf : Ptr[rd_kafka_topic_conf_t], rkt_opaque : Ptr[Byte]): Unit = extern

  /**
   * Producer: Set partitioner callback in provided topic conf object.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_conf_set_partitioner_cb(topic_conf : Ptr[rd_kafka_topic_conf_t], partitioner : CFuncPtr6[Ptr[rd_kafka_topic_t], Ptr[Byte], size_t, int32_t, Ptr[Byte], Ptr[Byte], int32_t]): Unit = extern

  /**
   * Loose application's topic handle refcount as previously created with `rd_kafka_topic_new()`.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_destroy(rkt : Ptr[rd_kafka_topic_t]): Unit = extern

  /**
   * Returns the topic name.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_name(rkt : Ptr[rd_kafka_topic_t]): CString = extern

  /**
   * Creates a new topic handle for topic named topic.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_new(rk : Ptr[rd_kafka_t], topic : CString, conf : Ptr[rd_kafka_topic_conf_t]): Ptr[rd_kafka_topic_t] = extern

  /**
   * Get the rkt_opaque pointer that was set in the topic configuration with rd_kafka_topic_conf_set_opaque().
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_opaque(rkt : Ptr[rd_kafka_topic_t]): Ptr[Byte] = extern

  /**
   * Check if partition is available (has a leader broker).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_available(rkt : Ptr[rd_kafka_topic_t], partition : int32_t): CInt = extern

  /**
   * Destroy a rd_kafka_topic_partition_t.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_destroy(rktpar : Ptr[rd_kafka_topic_partition_t]): Unit = extern

  /**
   * Returns the offset leader epoch, if relevant and known, else -1.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_get_leader_epoch(rktpar : Ptr[rd_kafka_topic_partition_t]): int32_t = extern

  /**
   * Add topic+partition to list
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_list_add(rktparlist : Ptr[rd_kafka_topic_partition_list_t], topic : CString, partition : int32_t): Ptr[rd_kafka_topic_partition_t] = extern

  /**
   * Add range of partitions from start to stop inclusive.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_list_add_range(rktparlist : Ptr[rd_kafka_topic_partition_list_t], topic : CString, start : int32_t, stop : int32_t): Unit = extern

  /**
   * Make a copy of an existing list.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_list_copy(src : Ptr[rd_kafka_topic_partition_list_t]): Ptr[rd_kafka_topic_partition_list_t] = extern

  /**
   * Delete partition from list.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_list_del(rktparlist : Ptr[rd_kafka_topic_partition_list_t], topic : CString, partition : int32_t): CInt = extern

  /**
   * Delete partition from list by elems[] index.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_list_del_by_idx(rktparlist : Ptr[rd_kafka_topic_partition_list_t], idx : CInt): CInt = extern

  /**
   * Free all resources used by the list and the list itself.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_list_destroy(rkparlist : Ptr[rd_kafka_topic_partition_list_t]): Unit = extern

  /**
   * Find element by topic and partition.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_list_find(rktparlist : Ptr[rd_kafka_topic_partition_list_t], topic : CString, partition : int32_t): Ptr[rd_kafka_topic_partition_t] = extern

  /**
   * Create a new list/vector Topic+Partition container.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_list_new(size : CInt): Ptr[rd_kafka_topic_partition_list_t] = extern

  /**
   * Set offset to offset for topic and partition
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_list_set_offset(rktparlist : Ptr[rd_kafka_topic_partition_list_t], topic : CString, partition : int32_t, offset : int64_t): rd_kafka_resp_err_t = extern

  /**
   * Sort list using comparator cmp.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_list_sort(rktparlist : Ptr[rd_kafka_topic_partition_list_t], cmp : CFuncPtr3[Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt], cmp_opaque : Ptr[Byte]): Unit = extern

  /**
   * Sets the offset leader epoch (use -1 to clear).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_partition_set_leader_epoch(rktpar : Ptr[rd_kafka_topic_partition_t], leader_epoch : int32_t): Unit = extern

  /**
   * Returns the error code for the given topic result.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_result_error(topicres : Ptr[rd_kafka_topic_result_t]): rd_kafka_resp_err_t = extern

  /**
   * Returns the human readable error string for the given topic result, or NULL if there was no error.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_result_error_string(topicres : Ptr[rd_kafka_topic_result_t]): CString = extern

  /**
   * Returns the name of the topic for the given topic result. lifetime of the returned string is the same as the topicres.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_topic_result_name(topicres : Ptr[rd_kafka_topic_result_t]): CString = extern

  /**
   * Returns Kafka handle type.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_type(rk : Ptr[rd_kafka_t]): rd_kafka_type_t = extern

  /**
   * Run librdkafka's built-in unit-tests.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_unittest(): CInt = extern

  /**
   * Unsubscribe from the current subscription set.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_unsubscribe(rk : Ptr[rd_kafka_t]): rd_kafka_resp_err_t = extern

  /**
   * Returns the librdkafka version as integer.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_version(): CInt = extern

  /**
   * Returns the librdkafka version as string.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_version_str(): CString = extern

  /**
   * Wait for all rd_kafka_t objects to be destroyed.
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_wait_destroyed(timeout_ms : CInt): CInt = extern

  /**
   * Cancels the current callback dispatcher (rd_kafka_poll(), rd_kafka_consume_callback(), etc).
  
   * [bindgen] header: /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg/packages/librdkafka_arm64-osx/include/librdkafka/rdkafka.h
  */
  def rd_kafka_yield(rk : Ptr[rd_kafka_t]): Unit = extern


object functions:
  import _root_.librdkafka.enumerations.*
  import _root_.librdkafka.aliases.*
  import _root_.librdkafka.structs.*

  import extern_functions.*
  export extern_functions.*

object types:
  export _root_.librdkafka.structs.*
  export _root_.librdkafka.aliases.*
  export _root_.librdkafka.enumerations.*

object all:
  export _root_.librdkafka.enumerations.rd_kafka_AclOperation_t
  export _root_.librdkafka.enumerations.rd_kafka_AclPermissionType_t
  export _root_.librdkafka.enumerations.rd_kafka_ConfigSource_t
  export _root_.librdkafka.enumerations.rd_kafka_ResourcePatternType_t
  export _root_.librdkafka.enumerations.rd_kafka_ResourceType_t
  export _root_.librdkafka.enumerations.rd_kafka_admin_op_t
  export _root_.librdkafka.enumerations.rd_kafka_cert_enc_t
  export _root_.librdkafka.enumerations.rd_kafka_cert_type_t
  export _root_.librdkafka.enumerations.rd_kafka_conf_res_t
  export _root_.librdkafka.enumerations.rd_kafka_consumer_group_state_t
  export _root_.librdkafka.enumerations.rd_kafka_msg_status_t
  export _root_.librdkafka.enumerations.rd_kafka_resp_err_t
  export _root_.librdkafka.enumerations.rd_kafka_thread_type_t
  export _root_.librdkafka.enumerations.rd_kafka_timestamp_type_t
  export _root_.librdkafka.enumerations.rd_kafka_type_t
  export _root_.librdkafka.enumerations.rd_kafka_vtype_t
  export _root_.librdkafka.aliases.FILE
  export _root_.librdkafka.aliases.int16_t
  export _root_.librdkafka.aliases.int32_t
  export _root_.librdkafka.aliases.int64_t
  export _root_.librdkafka.aliases.mode_t
  export _root_.librdkafka.aliases.rd_kafka_AclBindingFilter_t
  export _root_.librdkafka.aliases.rd_kafka_AlterConfigs_result_t
  export _root_.librdkafka.aliases.rd_kafka_AlterConsumerGroupOffsets_result_t
  export _root_.librdkafka.aliases.rd_kafka_CreateAcls_result_t
  export _root_.librdkafka.aliases.rd_kafka_CreatePartitions_result_t
  export _root_.librdkafka.aliases.rd_kafka_CreateTopics_result_t
  export _root_.librdkafka.aliases.rd_kafka_DeleteAcls_result_t
  export _root_.librdkafka.aliases.rd_kafka_DeleteConsumerGroupOffsets_result_t
  export _root_.librdkafka.aliases.rd_kafka_DeleteGroups_result_t
  export _root_.librdkafka.aliases.rd_kafka_DeleteRecords_result_t
  export _root_.librdkafka.aliases.rd_kafka_DeleteTopics_result_t
  export _root_.librdkafka.aliases.rd_kafka_DescribeAcls_result_t
  export _root_.librdkafka.aliases.rd_kafka_DescribeConfigs_result_t
  export _root_.librdkafka.aliases.rd_kafka_DescribeConsumerGroups_result_t
  export _root_.librdkafka.aliases.rd_kafka_ListConsumerGroupOffsets_result_t
  export _root_.librdkafka.aliases.rd_kafka_ListConsumerGroups_result_t
  export _root_.librdkafka.aliases.rd_kafka_event_type_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_acknowledgement_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_broker_state_change_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_commit_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_conf_destroy_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_conf_dup_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_conf_set_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_consume_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_destroy_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_new_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_request_sent_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_response_received_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_send_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_thread_exit_t
  export _root_.librdkafka.aliases.rd_kafka_interceptor_f_on_thread_start_t
  export _root_.librdkafka.aliases.rd_kafka_plugin_f_conf_init_t
  export _root_.librdkafka.aliases.size_t
  export _root_.librdkafka.aliases.sockaddr
  export _root_.librdkafka.aliases.ssize_t
  export _root_.librdkafka.aliases.uint16_t
  export _root_.librdkafka.structs.addrinfo
  export _root_.librdkafka.structs.rd_kafka_AclBinding_s
  export _root_.librdkafka.structs.rd_kafka_AclBinding_t
  export _root_.librdkafka.structs.rd_kafka_AdminOptions_s
  export _root_.librdkafka.structs.rd_kafka_AdminOptions_t
  export _root_.librdkafka.structs.rd_kafka_AlterConsumerGroupOffsets_s
  export _root_.librdkafka.structs.rd_kafka_AlterConsumerGroupOffsets_t
  export _root_.librdkafka.structs.rd_kafka_ConfigEntry_s
  export _root_.librdkafka.structs.rd_kafka_ConfigEntry_t
  export _root_.librdkafka.structs.rd_kafka_ConfigResource_s
  export _root_.librdkafka.structs.rd_kafka_ConfigResource_t
  export _root_.librdkafka.structs.rd_kafka_ConsumerGroupDescription_s
  export _root_.librdkafka.structs.rd_kafka_ConsumerGroupDescription_t
  export _root_.librdkafka.structs.rd_kafka_ConsumerGroupListing_s
  export _root_.librdkafka.structs.rd_kafka_ConsumerGroupListing_t
  export _root_.librdkafka.structs.rd_kafka_DeleteAcls_result_response_s
  export _root_.librdkafka.structs.rd_kafka_DeleteAcls_result_response_t
  export _root_.librdkafka.structs.rd_kafka_DeleteConsumerGroupOffsets_s
  export _root_.librdkafka.structs.rd_kafka_DeleteConsumerGroupOffsets_t
  export _root_.librdkafka.structs.rd_kafka_DeleteGroup_s
  export _root_.librdkafka.structs.rd_kafka_DeleteGroup_t
  export _root_.librdkafka.structs.rd_kafka_DeleteRecords_s
  export _root_.librdkafka.structs.rd_kafka_DeleteRecords_t
  export _root_.librdkafka.structs.rd_kafka_DeleteTopic_s
  export _root_.librdkafka.structs.rd_kafka_DeleteTopic_t
  export _root_.librdkafka.structs.rd_kafka_ListConsumerGroupOffsets_s
  export _root_.librdkafka.structs.rd_kafka_ListConsumerGroupOffsets_t
  export _root_.librdkafka.structs.rd_kafka_ListConsumerGroupsResult_s
  export _root_.librdkafka.structs.rd_kafka_ListConsumerGroupsResult_t
  export _root_.librdkafka.structs.rd_kafka_MemberAssignment_s
  export _root_.librdkafka.structs.rd_kafka_MemberAssignment_t
  export _root_.librdkafka.structs.rd_kafka_MemberDescription_s
  export _root_.librdkafka.structs.rd_kafka_MemberDescription_t
  export _root_.librdkafka.structs.rd_kafka_NewPartitions_s
  export _root_.librdkafka.structs.rd_kafka_NewPartitions_t
  export _root_.librdkafka.structs.rd_kafka_NewTopic_s
  export _root_.librdkafka.structs.rd_kafka_NewTopic_t
  export _root_.librdkafka.structs.rd_kafka_Node_s
  export _root_.librdkafka.structs.rd_kafka_Node_t
  export _root_.librdkafka.structs.rd_kafka_acl_result_s
  export _root_.librdkafka.structs.rd_kafka_acl_result_t
  export _root_.librdkafka.structs.rd_kafka_conf_s
  export _root_.librdkafka.structs.rd_kafka_conf_t
  export _root_.librdkafka.structs.rd_kafka_consumer_group_metadata_s
  export _root_.librdkafka.structs.rd_kafka_consumer_group_metadata_t
  export _root_.librdkafka.structs.rd_kafka_err_desc
  export _root_.librdkafka.structs.rd_kafka_error_s
  export _root_.librdkafka.structs.rd_kafka_error_t
  export _root_.librdkafka.structs.rd_kafka_event_t
  export _root_.librdkafka.structs.rd_kafka_group_info
  export _root_.librdkafka.structs.rd_kafka_group_list
  export _root_.librdkafka.structs.rd_kafka_group_member_info
  export _root_.librdkafka.structs.rd_kafka_group_result_s
  export _root_.librdkafka.structs.rd_kafka_group_result_t
  export _root_.librdkafka.structs.rd_kafka_headers_s
  export _root_.librdkafka.structs.rd_kafka_headers_t
  export _root_.librdkafka.structs.rd_kafka_message_s
  export _root_.librdkafka.structs.rd_kafka_message_t
  export _root_.librdkafka.structs.rd_kafka_metadata
  export _root_.librdkafka.structs.rd_kafka_metadata_broker
  export _root_.librdkafka.structs.rd_kafka_metadata_broker_t
  export _root_.librdkafka.structs.rd_kafka_metadata_partition
  export _root_.librdkafka.structs.rd_kafka_metadata_partition_t
  export _root_.librdkafka.structs.rd_kafka_metadata_t
  export _root_.librdkafka.structs.rd_kafka_metadata_topic
  export _root_.librdkafka.structs.rd_kafka_metadata_topic_t
  export _root_.librdkafka.structs.rd_kafka_op_s
  export _root_.librdkafka.structs.rd_kafka_queue_s
  export _root_.librdkafka.structs.rd_kafka_queue_t
  export _root_.librdkafka.structs.rd_kafka_s
  export _root_.librdkafka.structs.rd_kafka_t
  export _root_.librdkafka.structs.rd_kafka_topic_conf_s
  export _root_.librdkafka.structs.rd_kafka_topic_conf_t
  export _root_.librdkafka.structs.rd_kafka_topic_partition_list_s
  export _root_.librdkafka.structs.rd_kafka_topic_partition_list_t
  export _root_.librdkafka.structs.rd_kafka_topic_partition_s
  export _root_.librdkafka.structs.rd_kafka_topic_partition_t
  export _root_.librdkafka.structs.rd_kafka_topic_result_s
  export _root_.librdkafka.structs.rd_kafka_topic_result_t
  export _root_.librdkafka.structs.rd_kafka_topic_s
  export _root_.librdkafka.structs.rd_kafka_topic_t
  export _root_.librdkafka.structs.rd_kafka_vu_s
  export _root_.librdkafka.structs.rd_kafka_vu_t
  export _root_.librdkafka.functions.rd_kafka_AclBindingFilter_new
  export _root_.librdkafka.functions.rd_kafka_AclBinding_destroy
  export _root_.librdkafka.functions.rd_kafka_AclBinding_destroy_array
  export _root_.librdkafka.functions.rd_kafka_AclBinding_error
  export _root_.librdkafka.functions.rd_kafka_AclBinding_host
  export _root_.librdkafka.functions.rd_kafka_AclBinding_name
  export _root_.librdkafka.functions.rd_kafka_AclBinding_new
  export _root_.librdkafka.functions.rd_kafka_AclBinding_operation
  export _root_.librdkafka.functions.rd_kafka_AclBinding_permission_type
  export _root_.librdkafka.functions.rd_kafka_AclBinding_principal
  export _root_.librdkafka.functions.rd_kafka_AclBinding_resource_pattern_type
  export _root_.librdkafka.functions.rd_kafka_AclBinding_restype
  export _root_.librdkafka.functions.rd_kafka_AclOperation_name
  export _root_.librdkafka.functions.rd_kafka_AclPermissionType_name
  export _root_.librdkafka.functions.rd_kafka_AdminOptions_destroy
  export _root_.librdkafka.functions.rd_kafka_AdminOptions_new
  export _root_.librdkafka.functions.rd_kafka_AdminOptions_set_broker
  export _root_.librdkafka.functions.rd_kafka_AdminOptions_set_match_consumer_group_states
  export _root_.librdkafka.functions.rd_kafka_AdminOptions_set_opaque
  export _root_.librdkafka.functions.rd_kafka_AdminOptions_set_operation_timeout
  export _root_.librdkafka.functions.rd_kafka_AdminOptions_set_request_timeout
  export _root_.librdkafka.functions.rd_kafka_AdminOptions_set_require_stable_offsets
  export _root_.librdkafka.functions.rd_kafka_AdminOptions_set_validate_only
  export _root_.librdkafka.functions.rd_kafka_AlterConfigs
  export _root_.librdkafka.functions.rd_kafka_AlterConfigs_result_resources
  export _root_.librdkafka.functions.rd_kafka_AlterConsumerGroupOffsets
  export _root_.librdkafka.functions.rd_kafka_AlterConsumerGroupOffsets_destroy
  export _root_.librdkafka.functions.rd_kafka_AlterConsumerGroupOffsets_destroy_array
  export _root_.librdkafka.functions.rd_kafka_AlterConsumerGroupOffsets_new
  export _root_.librdkafka.functions.rd_kafka_AlterConsumerGroupOffsets_result_groups
  export _root_.librdkafka.functions.rd_kafka_ConfigEntry_is_default
  export _root_.librdkafka.functions.rd_kafka_ConfigEntry_is_read_only
  export _root_.librdkafka.functions.rd_kafka_ConfigEntry_is_sensitive
  export _root_.librdkafka.functions.rd_kafka_ConfigEntry_is_synonym
  export _root_.librdkafka.functions.rd_kafka_ConfigEntry_name
  export _root_.librdkafka.functions.rd_kafka_ConfigEntry_source
  export _root_.librdkafka.functions.rd_kafka_ConfigEntry_synonyms
  export _root_.librdkafka.functions.rd_kafka_ConfigEntry_value
  export _root_.librdkafka.functions.rd_kafka_ConfigResource_configs
  export _root_.librdkafka.functions.rd_kafka_ConfigResource_destroy
  export _root_.librdkafka.functions.rd_kafka_ConfigResource_destroy_array
  export _root_.librdkafka.functions.rd_kafka_ConfigResource_error
  export _root_.librdkafka.functions.rd_kafka_ConfigResource_error_string
  export _root_.librdkafka.functions.rd_kafka_ConfigResource_name
  export _root_.librdkafka.functions.rd_kafka_ConfigResource_new
  export _root_.librdkafka.functions.rd_kafka_ConfigResource_set_config
  export _root_.librdkafka.functions.rd_kafka_ConfigResource_type
  export _root_.librdkafka.functions.rd_kafka_ConfigSource_name
  export _root_.librdkafka.functions.rd_kafka_ConsumerGroupDescription_coordinator
  export _root_.librdkafka.functions.rd_kafka_ConsumerGroupDescription_error
  export _root_.librdkafka.functions.rd_kafka_ConsumerGroupDescription_group_id
  export _root_.librdkafka.functions.rd_kafka_ConsumerGroupDescription_is_simple_consumer_group
  export _root_.librdkafka.functions.rd_kafka_ConsumerGroupDescription_member
  export _root_.librdkafka.functions.rd_kafka_ConsumerGroupDescription_member_count
  export _root_.librdkafka.functions.rd_kafka_ConsumerGroupDescription_partition_assignor
  export _root_.librdkafka.functions.rd_kafka_ConsumerGroupDescription_state
  export _root_.librdkafka.functions.rd_kafka_ConsumerGroupListing_group_id
  export _root_.librdkafka.functions.rd_kafka_ConsumerGroupListing_is_simple_consumer_group
  export _root_.librdkafka.functions.rd_kafka_ConsumerGroupListing_state
  export _root_.librdkafka.functions.rd_kafka_CreateAcls
  export _root_.librdkafka.functions.rd_kafka_CreateAcls_result_acls
  export _root_.librdkafka.functions.rd_kafka_CreatePartitions
  export _root_.librdkafka.functions.rd_kafka_CreatePartitions_result_topics
  export _root_.librdkafka.functions.rd_kafka_CreateTopics
  export _root_.librdkafka.functions.rd_kafka_CreateTopics_result_topics
  export _root_.librdkafka.functions.rd_kafka_DeleteAcls
  export _root_.librdkafka.functions.rd_kafka_DeleteAcls_result_response_error
  export _root_.librdkafka.functions.rd_kafka_DeleteAcls_result_response_matching_acls
  export _root_.librdkafka.functions.rd_kafka_DeleteAcls_result_responses
  export _root_.librdkafka.functions.rd_kafka_DeleteConsumerGroupOffsets
  export _root_.librdkafka.functions.rd_kafka_DeleteConsumerGroupOffsets_destroy
  export _root_.librdkafka.functions.rd_kafka_DeleteConsumerGroupOffsets_destroy_array
  export _root_.librdkafka.functions.rd_kafka_DeleteConsumerGroupOffsets_new
  export _root_.librdkafka.functions.rd_kafka_DeleteConsumerGroupOffsets_result_groups
  export _root_.librdkafka.functions.rd_kafka_DeleteGroup_destroy
  export _root_.librdkafka.functions.rd_kafka_DeleteGroup_destroy_array
  export _root_.librdkafka.functions.rd_kafka_DeleteGroup_new
  export _root_.librdkafka.functions.rd_kafka_DeleteGroups
  export _root_.librdkafka.functions.rd_kafka_DeleteGroups_result_groups
  export _root_.librdkafka.functions.rd_kafka_DeleteRecords
  export _root_.librdkafka.functions.rd_kafka_DeleteRecords_destroy
  export _root_.librdkafka.functions.rd_kafka_DeleteRecords_destroy_array
  export _root_.librdkafka.functions.rd_kafka_DeleteRecords_new
  export _root_.librdkafka.functions.rd_kafka_DeleteRecords_result_offsets
  export _root_.librdkafka.functions.rd_kafka_DeleteTopic_destroy
  export _root_.librdkafka.functions.rd_kafka_DeleteTopic_destroy_array
  export _root_.librdkafka.functions.rd_kafka_DeleteTopic_new
  export _root_.librdkafka.functions.rd_kafka_DeleteTopics
  export _root_.librdkafka.functions.rd_kafka_DeleteTopics_result_topics
  export _root_.librdkafka.functions.rd_kafka_DescribeAcls
  export _root_.librdkafka.functions.rd_kafka_DescribeAcls_result_acls
  export _root_.librdkafka.functions.rd_kafka_DescribeConfigs
  export _root_.librdkafka.functions.rd_kafka_DescribeConfigs_result_resources
  export _root_.librdkafka.functions.rd_kafka_DescribeConsumerGroups
  export _root_.librdkafka.functions.rd_kafka_DescribeConsumerGroups_result_groups
  export _root_.librdkafka.functions.rd_kafka_ListConsumerGroupOffsets
  export _root_.librdkafka.functions.rd_kafka_ListConsumerGroupOffsets_destroy
  export _root_.librdkafka.functions.rd_kafka_ListConsumerGroupOffsets_destroy_array
  export _root_.librdkafka.functions.rd_kafka_ListConsumerGroupOffsets_new
  export _root_.librdkafka.functions.rd_kafka_ListConsumerGroupOffsets_result_groups
  export _root_.librdkafka.functions.rd_kafka_ListConsumerGroups
  export _root_.librdkafka.functions.rd_kafka_ListConsumerGroups_result_errors
  export _root_.librdkafka.functions.rd_kafka_ListConsumerGroups_result_valid
  export _root_.librdkafka.functions.rd_kafka_MemberAssignment_partitions
  export _root_.librdkafka.functions.rd_kafka_MemberDescription_assignment
  export _root_.librdkafka.functions.rd_kafka_MemberDescription_client_id
  export _root_.librdkafka.functions.rd_kafka_MemberDescription_consumer_id
  export _root_.librdkafka.functions.rd_kafka_MemberDescription_group_instance_id
  export _root_.librdkafka.functions.rd_kafka_MemberDescription_host
  export _root_.librdkafka.functions.rd_kafka_NewPartitions_destroy
  export _root_.librdkafka.functions.rd_kafka_NewPartitions_destroy_array
  export _root_.librdkafka.functions.rd_kafka_NewPartitions_new
  export _root_.librdkafka.functions.rd_kafka_NewPartitions_set_replica_assignment
  export _root_.librdkafka.functions.rd_kafka_NewTopic_destroy
  export _root_.librdkafka.functions.rd_kafka_NewTopic_destroy_array
  export _root_.librdkafka.functions.rd_kafka_NewTopic_new
  export _root_.librdkafka.functions.rd_kafka_NewTopic_set_config
  export _root_.librdkafka.functions.rd_kafka_NewTopic_set_replica_assignment
  export _root_.librdkafka.functions.rd_kafka_Node_host
  export _root_.librdkafka.functions.rd_kafka_Node_id
  export _root_.librdkafka.functions.rd_kafka_Node_port
  export _root_.librdkafka.functions.rd_kafka_ResourcePatternType_name
  export _root_.librdkafka.functions.rd_kafka_ResourceType_name
  export _root_.librdkafka.functions.rd_kafka_abort_transaction
  export _root_.librdkafka.functions.rd_kafka_acl_result_error
  export _root_.librdkafka.functions.rd_kafka_assign
  export _root_.librdkafka.functions.rd_kafka_assignment
  export _root_.librdkafka.functions.rd_kafka_assignment_lost
  export _root_.librdkafka.functions.rd_kafka_begin_transaction
  export _root_.librdkafka.functions.rd_kafka_brokers_add
  export _root_.librdkafka.functions.rd_kafka_clusterid
  export _root_.librdkafka.functions.rd_kafka_commit
  export _root_.librdkafka.functions.rd_kafka_commit_message
  export _root_.librdkafka.functions.rd_kafka_commit_queue
  export _root_.librdkafka.functions.rd_kafka_commit_transaction
  export _root_.librdkafka.functions.rd_kafka_committed
  export _root_.librdkafka.functions.rd_kafka_conf
  export _root_.librdkafka.functions.rd_kafka_conf_destroy
  export _root_.librdkafka.functions.rd_kafka_conf_dump
  export _root_.librdkafka.functions.rd_kafka_conf_dump_free
  export _root_.librdkafka.functions.rd_kafka_conf_dup
  export _root_.librdkafka.functions.rd_kafka_conf_dup_filter
  export _root_.librdkafka.functions.rd_kafka_conf_enable_sasl_queue
  export _root_.librdkafka.functions.rd_kafka_conf_get
  export _root_.librdkafka.functions.rd_kafka_conf_get_default_topic_conf
  export _root_.librdkafka.functions.rd_kafka_conf_interceptor_add_on_conf_destroy
  export _root_.librdkafka.functions.rd_kafka_conf_interceptor_add_on_conf_dup
  export _root_.librdkafka.functions.rd_kafka_conf_interceptor_add_on_conf_set
  export _root_.librdkafka.functions.rd_kafka_conf_interceptor_add_on_new
  export _root_.librdkafka.functions.rd_kafka_conf_new
  export _root_.librdkafka.functions.rd_kafka_conf_properties_show
  export _root_.librdkafka.functions.rd_kafka_conf_set
  export _root_.librdkafka.functions.rd_kafka_conf_set_background_event_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_closesocket_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_connect_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_consume_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_default_topic_conf
  export _root_.librdkafka.functions.rd_kafka_conf_set_dr_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_dr_msg_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_engine_callback_data
  export _root_.librdkafka.functions.rd_kafka_conf_set_error_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_events
  export _root_.librdkafka.functions.rd_kafka_conf_set_log_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_oauthbearer_token_refresh_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_offset_commit_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_opaque
  export _root_.librdkafka.functions.rd_kafka_conf_set_open_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_rebalance_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_resolve_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_socket_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_ssl_cert
  export _root_.librdkafka.functions.rd_kafka_conf_set_ssl_cert_verify_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_stats_cb
  export _root_.librdkafka.functions.rd_kafka_conf_set_throttle_cb
  export _root_.librdkafka.functions.rd_kafka_consume
  export _root_.librdkafka.functions.rd_kafka_consume_batch
  export _root_.librdkafka.functions.rd_kafka_consume_batch_queue
  export _root_.librdkafka.functions.rd_kafka_consume_callback
  export _root_.librdkafka.functions.rd_kafka_consume_callback_queue
  export _root_.librdkafka.functions.rd_kafka_consume_queue
  export _root_.librdkafka.functions.rd_kafka_consume_start
  export _root_.librdkafka.functions.rd_kafka_consume_start_queue
  export _root_.librdkafka.functions.rd_kafka_consume_stop
  export _root_.librdkafka.functions.rd_kafka_consumer_close
  export _root_.librdkafka.functions.rd_kafka_consumer_close_queue
  export _root_.librdkafka.functions.rd_kafka_consumer_closed
  export _root_.librdkafka.functions.rd_kafka_consumer_group_metadata
  export _root_.librdkafka.functions.rd_kafka_consumer_group_metadata_destroy
  export _root_.librdkafka.functions.rd_kafka_consumer_group_metadata_new
  export _root_.librdkafka.functions.rd_kafka_consumer_group_metadata_new_with_genid
  export _root_.librdkafka.functions.rd_kafka_consumer_group_metadata_read
  export _root_.librdkafka.functions.rd_kafka_consumer_group_metadata_write
  export _root_.librdkafka.functions.rd_kafka_consumer_group_state_code
  export _root_.librdkafka.functions.rd_kafka_consumer_group_state_name
  export _root_.librdkafka.functions.rd_kafka_consumer_poll
  export _root_.librdkafka.functions.rd_kafka_controllerid
  export _root_.librdkafka.functions.rd_kafka_default_topic_conf_dup
  export _root_.librdkafka.functions.rd_kafka_destroy
  export _root_.librdkafka.functions.rd_kafka_destroy_flags
  export _root_.librdkafka.functions.rd_kafka_dump
  export _root_.librdkafka.functions.rd_kafka_err2name
  export _root_.librdkafka.functions.rd_kafka_err2str
  export _root_.librdkafka.functions.rd_kafka_errno
  export _root_.librdkafka.functions.rd_kafka_errno2err
  export _root_.librdkafka.functions.rd_kafka_error_code
  export _root_.librdkafka.functions.rd_kafka_error_destroy
  export _root_.librdkafka.functions.rd_kafka_error_is_fatal
  export _root_.librdkafka.functions.rd_kafka_error_is_retriable
  export _root_.librdkafka.functions.rd_kafka_error_name
  export _root_.librdkafka.functions.rd_kafka_error_new
  export _root_.librdkafka.functions.rd_kafka_error_string
  export _root_.librdkafka.functions.rd_kafka_error_txn_requires_abort
  export _root_.librdkafka.functions.rd_kafka_event_AlterConfigs_result
  export _root_.librdkafka.functions.rd_kafka_event_AlterConsumerGroupOffsets_result
  export _root_.librdkafka.functions.rd_kafka_event_CreateAcls_result
  export _root_.librdkafka.functions.rd_kafka_event_CreatePartitions_result
  export _root_.librdkafka.functions.rd_kafka_event_CreateTopics_result
  export _root_.librdkafka.functions.rd_kafka_event_DeleteAcls_result
  export _root_.librdkafka.functions.rd_kafka_event_DeleteConsumerGroupOffsets_result
  export _root_.librdkafka.functions.rd_kafka_event_DeleteGroups_result
  export _root_.librdkafka.functions.rd_kafka_event_DeleteRecords_result
  export _root_.librdkafka.functions.rd_kafka_event_DeleteTopics_result
  export _root_.librdkafka.functions.rd_kafka_event_DescribeAcls_result
  export _root_.librdkafka.functions.rd_kafka_event_DescribeConfigs_result
  export _root_.librdkafka.functions.rd_kafka_event_DescribeConsumerGroups_result
  export _root_.librdkafka.functions.rd_kafka_event_ListConsumerGroupOffsets_result
  export _root_.librdkafka.functions.rd_kafka_event_ListConsumerGroups_result
  export _root_.librdkafka.functions.rd_kafka_event_config_string
  export _root_.librdkafka.functions.rd_kafka_event_debug_contexts
  export _root_.librdkafka.functions.rd_kafka_event_destroy
  export _root_.librdkafka.functions.rd_kafka_event_error
  export _root_.librdkafka.functions.rd_kafka_event_error_is_fatal
  export _root_.librdkafka.functions.rd_kafka_event_error_string
  export _root_.librdkafka.functions.rd_kafka_event_log
  export _root_.librdkafka.functions.rd_kafka_event_message_array
  export _root_.librdkafka.functions.rd_kafka_event_message_count
  export _root_.librdkafka.functions.rd_kafka_event_message_next
  export _root_.librdkafka.functions.rd_kafka_event_name
  export _root_.librdkafka.functions.rd_kafka_event_opaque
  export _root_.librdkafka.functions.rd_kafka_event_stats
  export _root_.librdkafka.functions.rd_kafka_event_topic_partition
  export _root_.librdkafka.functions.rd_kafka_event_topic_partition_list
  export _root_.librdkafka.functions.rd_kafka_event_type
  export _root_.librdkafka.functions.rd_kafka_fatal_error
  export _root_.librdkafka.functions.rd_kafka_flush
  export _root_.librdkafka.functions.rd_kafka_get_debug_contexts
  export _root_.librdkafka.functions.rd_kafka_get_err_descs
  export _root_.librdkafka.functions.rd_kafka_get_watermark_offsets
  export _root_.librdkafka.functions.rd_kafka_group_list_destroy
  export _root_.librdkafka.functions.rd_kafka_group_result_error
  export _root_.librdkafka.functions.rd_kafka_group_result_name
  export _root_.librdkafka.functions.rd_kafka_group_result_partitions
  export _root_.librdkafka.functions.rd_kafka_header_add
  export _root_.librdkafka.functions.rd_kafka_header_cnt
  export _root_.librdkafka.functions.rd_kafka_header_get
  export _root_.librdkafka.functions.rd_kafka_header_get_all
  export _root_.librdkafka.functions.rd_kafka_header_get_last
  export _root_.librdkafka.functions.rd_kafka_header_remove
  export _root_.librdkafka.functions.rd_kafka_headers_copy
  export _root_.librdkafka.functions.rd_kafka_headers_destroy
  export _root_.librdkafka.functions.rd_kafka_headers_new
  export _root_.librdkafka.functions.rd_kafka_incremental_assign
  export _root_.librdkafka.functions.rd_kafka_incremental_unassign
  export _root_.librdkafka.functions.rd_kafka_init_transactions
  export _root_.librdkafka.functions.rd_kafka_interceptor_add_on_acknowledgement
  export _root_.librdkafka.functions.rd_kafka_interceptor_add_on_broker_state_change
  export _root_.librdkafka.functions.rd_kafka_interceptor_add_on_commit
  export _root_.librdkafka.functions.rd_kafka_interceptor_add_on_consume
  export _root_.librdkafka.functions.rd_kafka_interceptor_add_on_destroy
  export _root_.librdkafka.functions.rd_kafka_interceptor_add_on_request_sent
  export _root_.librdkafka.functions.rd_kafka_interceptor_add_on_response_received
  export _root_.librdkafka.functions.rd_kafka_interceptor_add_on_send
  export _root_.librdkafka.functions.rd_kafka_interceptor_add_on_thread_exit
  export _root_.librdkafka.functions.rd_kafka_interceptor_add_on_thread_start
  export _root_.librdkafka.functions.rd_kafka_last_error
  export _root_.librdkafka.functions.rd_kafka_list_groups
  export _root_.librdkafka.functions.rd_kafka_log_print
  export _root_.librdkafka.functions.rd_kafka_log_syslog
  export _root_.librdkafka.functions.rd_kafka_mem_calloc
  export _root_.librdkafka.functions.rd_kafka_mem_free
  export _root_.librdkafka.functions.rd_kafka_mem_malloc
  export _root_.librdkafka.functions.rd_kafka_memberid
  export _root_.librdkafka.functions.rd_kafka_message_broker_id
  export _root_.librdkafka.functions.rd_kafka_message_destroy
  export _root_.librdkafka.functions.rd_kafka_message_detach_headers
  export _root_.librdkafka.functions.rd_kafka_message_errstr
  export _root_.librdkafka.functions.rd_kafka_message_headers
  export _root_.librdkafka.functions.rd_kafka_message_latency
  export _root_.librdkafka.functions.rd_kafka_message_leader_epoch
  export _root_.librdkafka.functions.rd_kafka_message_set_headers
  export _root_.librdkafka.functions.rd_kafka_message_status
  export _root_.librdkafka.functions.rd_kafka_message_timestamp
  export _root_.librdkafka.functions.rd_kafka_metadata
  export _root_.librdkafka.functions.rd_kafka_metadata_destroy
  export _root_.librdkafka.functions.rd_kafka_msg_partitioner_consistent
  export _root_.librdkafka.functions.rd_kafka_msg_partitioner_consistent_random
  export _root_.librdkafka.functions.rd_kafka_msg_partitioner_fnv1a
  export _root_.librdkafka.functions.rd_kafka_msg_partitioner_fnv1a_random
  export _root_.librdkafka.functions.rd_kafka_msg_partitioner_murmur2
  export _root_.librdkafka.functions.rd_kafka_msg_partitioner_murmur2_random
  export _root_.librdkafka.functions.rd_kafka_msg_partitioner_random
  export _root_.librdkafka.functions.rd_kafka_name
  export _root_.librdkafka.functions.rd_kafka_new
  export _root_.librdkafka.functions.rd_kafka_oauthbearer_set_token
  export _root_.librdkafka.functions.rd_kafka_oauthbearer_set_token_failure
  export _root_.librdkafka.functions.rd_kafka_offset_store
  export _root_.librdkafka.functions.rd_kafka_offset_store_message
  export _root_.librdkafka.functions.rd_kafka_offsets_for_times
  export _root_.librdkafka.functions.rd_kafka_offsets_store
  export _root_.librdkafka.functions.rd_kafka_opaque
  export _root_.librdkafka.functions.rd_kafka_outq_len
  export _root_.librdkafka.functions.rd_kafka_pause_partitions
  export _root_.librdkafka.functions.rd_kafka_poll
  export _root_.librdkafka.functions.rd_kafka_poll_set_consumer
  export _root_.librdkafka.functions.rd_kafka_position
  export _root_.librdkafka.functions.rd_kafka_produce
  export _root_.librdkafka.functions.rd_kafka_produce_batch
  export _root_.librdkafka.functions.rd_kafka_producev
  export _root_.librdkafka.functions.rd_kafka_produceva
  export _root_.librdkafka.functions.rd_kafka_purge
  export _root_.librdkafka.functions.rd_kafka_query_watermark_offsets
  export _root_.librdkafka.functions.rd_kafka_queue_cb_event_enable
  export _root_.librdkafka.functions.rd_kafka_queue_destroy
  export _root_.librdkafka.functions.rd_kafka_queue_forward
  export _root_.librdkafka.functions.rd_kafka_queue_get_background
  export _root_.librdkafka.functions.rd_kafka_queue_get_consumer
  export _root_.librdkafka.functions.rd_kafka_queue_get_main
  export _root_.librdkafka.functions.rd_kafka_queue_get_partition
  export _root_.librdkafka.functions.rd_kafka_queue_get_sasl
  export _root_.librdkafka.functions.rd_kafka_queue_io_event_enable
  export _root_.librdkafka.functions.rd_kafka_queue_length
  export _root_.librdkafka.functions.rd_kafka_queue_new
  export _root_.librdkafka.functions.rd_kafka_queue_poll
  export _root_.librdkafka.functions.rd_kafka_queue_poll_callback
  export _root_.librdkafka.functions.rd_kafka_queue_yield
  export _root_.librdkafka.functions.rd_kafka_rebalance_protocol
  export _root_.librdkafka.functions.rd_kafka_resume_partitions
  export _root_.librdkafka.functions.rd_kafka_sasl_background_callbacks_enable
  export _root_.librdkafka.functions.rd_kafka_sasl_set_credentials
  export _root_.librdkafka.functions.rd_kafka_seek
  export _root_.librdkafka.functions.rd_kafka_seek_partitions
  export _root_.librdkafka.functions.rd_kafka_send_offsets_to_transaction
  export _root_.librdkafka.functions.rd_kafka_set_log_level
  export _root_.librdkafka.functions.rd_kafka_set_log_queue
  export _root_.librdkafka.functions.rd_kafka_set_logger
  export _root_.librdkafka.functions.rd_kafka_subscribe
  export _root_.librdkafka.functions.rd_kafka_subscription
  export _root_.librdkafka.functions.rd_kafka_test_fatal_error
  export _root_.librdkafka.functions.rd_kafka_thread_cnt
  export _root_.librdkafka.functions.rd_kafka_topic_conf_destroy
  export _root_.librdkafka.functions.rd_kafka_topic_conf_dump
  export _root_.librdkafka.functions.rd_kafka_topic_conf_dup
  export _root_.librdkafka.functions.rd_kafka_topic_conf_get
  export _root_.librdkafka.functions.rd_kafka_topic_conf_new
  export _root_.librdkafka.functions.rd_kafka_topic_conf_set
  export _root_.librdkafka.functions.rd_kafka_topic_conf_set_msg_order_cmp
  export _root_.librdkafka.functions.rd_kafka_topic_conf_set_opaque
  export _root_.librdkafka.functions.rd_kafka_topic_conf_set_partitioner_cb
  export _root_.librdkafka.functions.rd_kafka_topic_destroy
  export _root_.librdkafka.functions.rd_kafka_topic_name
  export _root_.librdkafka.functions.rd_kafka_topic_new
  export _root_.librdkafka.functions.rd_kafka_topic_opaque
  export _root_.librdkafka.functions.rd_kafka_topic_partition_available
  export _root_.librdkafka.functions.rd_kafka_topic_partition_destroy
  export _root_.librdkafka.functions.rd_kafka_topic_partition_get_leader_epoch
  export _root_.librdkafka.functions.rd_kafka_topic_partition_list_add
  export _root_.librdkafka.functions.rd_kafka_topic_partition_list_add_range
  export _root_.librdkafka.functions.rd_kafka_topic_partition_list_copy
  export _root_.librdkafka.functions.rd_kafka_topic_partition_list_del
  export _root_.librdkafka.functions.rd_kafka_topic_partition_list_del_by_idx
  export _root_.librdkafka.functions.rd_kafka_topic_partition_list_destroy
  export _root_.librdkafka.functions.rd_kafka_topic_partition_list_find
  export _root_.librdkafka.functions.rd_kafka_topic_partition_list_new
  export _root_.librdkafka.functions.rd_kafka_topic_partition_list_set_offset
  export _root_.librdkafka.functions.rd_kafka_topic_partition_list_sort
  export _root_.librdkafka.functions.rd_kafka_topic_partition_set_leader_epoch
  export _root_.librdkafka.functions.rd_kafka_topic_result_error
  export _root_.librdkafka.functions.rd_kafka_topic_result_error_string
  export _root_.librdkafka.functions.rd_kafka_topic_result_name
  export _root_.librdkafka.functions.rd_kafka_type
  export _root_.librdkafka.functions.rd_kafka_unittest
  export _root_.librdkafka.functions.rd_kafka_unsubscribe
  export _root_.librdkafka.functions.rd_kafka_version
  export _root_.librdkafka.functions.rd_kafka_version_str
  export _root_.librdkafka.functions.rd_kafka_wait_destroyed
  export _root_.librdkafka.functions.rd_kafka_yield
