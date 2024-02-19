package libgit

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[libgit] trait CEnum[T](using eq: T =:= Int):
    given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def int: CInt = eq.apply(t)
      inline def value: CInt = eq.apply(t)
  private[libgit] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def int: CInt = eq.apply(t).toInt
      inline def uint: CUnsignedInt = eq.apply(t)
      inline def value: CUnsignedInt = eq.apply(t)
end predef

object enumerations:
  import predef.*

  /** Flags controlling the behavior of git_apply
    */
  opaque type git_apply_flags_t = CUnsignedInt
  object git_apply_flags_t extends CEnumU[git_apply_flags_t]:
    given _tag: Tag[git_apply_flags_t] = Tag.UInt
    inline def define(inline a: Long): git_apply_flags_t = a.toUInt
    val GIT_APPLY_CHECK = define(1)
    inline def getName(inline value: git_apply_flags_t): Option[String] =
      inline value match
        case GIT_APPLY_CHECK => Some("GIT_APPLY_CHECK")
        case _               => None
    extension (a: git_apply_flags_t)
      inline def &(b: git_apply_flags_t): git_apply_flags_t = a & b
      inline def |(b: git_apply_flags_t): git_apply_flags_t = a | b
      inline def is(b: git_apply_flags_t): Boolean = (a & b) == b
  end git_apply_flags_t

  /** Possible application locations for git_apply
    */
  opaque type git_apply_location_t = CUnsignedInt
  object git_apply_location_t extends CEnumU[git_apply_location_t]:
    given _tag: Tag[git_apply_location_t] = Tag.UInt
    inline def define(inline a: Long): git_apply_location_t = a.toUInt
    val GIT_APPLY_LOCATION_WORKDIR = define(0)
    val GIT_APPLY_LOCATION_INDEX = define(1)
    val GIT_APPLY_LOCATION_BOTH = define(2)
    inline def getName(inline value: git_apply_location_t): Option[String] =
      inline value match
        case GIT_APPLY_LOCATION_WORKDIR => Some("GIT_APPLY_LOCATION_WORKDIR")
        case GIT_APPLY_LOCATION_INDEX   => Some("GIT_APPLY_LOCATION_INDEX")
        case GIT_APPLY_LOCATION_BOTH    => Some("GIT_APPLY_LOCATION_BOTH")
        case _                          => None
    extension (a: git_apply_location_t)
      inline def &(b: git_apply_location_t): git_apply_location_t = a & b
      inline def |(b: git_apply_location_t): git_apply_location_t = a | b
      inline def is(b: git_apply_location_t): Boolean = (a & b) == b
  end git_apply_location_t

  /** Possible states for an attribute
    */
  opaque type git_attr_value_t = CUnsignedInt
  object git_attr_value_t extends CEnumU[git_attr_value_t]:
    given _tag: Tag[git_attr_value_t] = Tag.UInt
    inline def define(inline a: Long): git_attr_value_t = a.toUInt
    val GIT_ATTR_VALUE_UNSPECIFIED = define(0)
    val GIT_ATTR_VALUE_TRUE = define(1)
    val GIT_ATTR_VALUE_FALSE = define(2)
    val GIT_ATTR_VALUE_STRING = define(3)
    inline def getName(inline value: git_attr_value_t): Option[String] =
      inline value match
        case GIT_ATTR_VALUE_UNSPECIFIED => Some("GIT_ATTR_VALUE_UNSPECIFIED")
        case GIT_ATTR_VALUE_TRUE        => Some("GIT_ATTR_VALUE_TRUE")
        case GIT_ATTR_VALUE_FALSE       => Some("GIT_ATTR_VALUE_FALSE")
        case GIT_ATTR_VALUE_STRING      => Some("GIT_ATTR_VALUE_STRING")
        case _                          => None
    extension (a: git_attr_value_t)
      inline def &(b: git_attr_value_t): git_attr_value_t = a & b
      inline def |(b: git_attr_value_t): git_attr_value_t = a | b
      inline def is(b: git_attr_value_t): Boolean = (a & b) == b
  end git_attr_value_t

  /** Flags for indicating option behavior for git_blame APIs.
    */
  opaque type git_blame_flag_t = CUnsignedInt
  object git_blame_flag_t extends CEnumU[git_blame_flag_t]:
    given _tag: Tag[git_blame_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_blame_flag_t = a.toUInt
    val GIT_BLAME_NORMAL = define(0)
    val GIT_BLAME_TRACK_COPIES_SAME_FILE = define(1)
    val GIT_BLAME_TRACK_COPIES_SAME_COMMIT_MOVES = define(2)
    val GIT_BLAME_TRACK_COPIES_SAME_COMMIT_COPIES = define(4)
    val GIT_BLAME_TRACK_COPIES_ANY_COMMIT_COPIES = define(8)
    val GIT_BLAME_FIRST_PARENT = define(16)
    val GIT_BLAME_USE_MAILMAP = define(32)
    val GIT_BLAME_IGNORE_WHITESPACE = define(64)
    inline def getName(inline value: git_blame_flag_t): Option[String] =
      inline value match
        case GIT_BLAME_NORMAL => Some("GIT_BLAME_NORMAL")
        case GIT_BLAME_TRACK_COPIES_SAME_FILE =>
          Some("GIT_BLAME_TRACK_COPIES_SAME_FILE")
        case GIT_BLAME_TRACK_COPIES_SAME_COMMIT_MOVES =>
          Some("GIT_BLAME_TRACK_COPIES_SAME_COMMIT_MOVES")
        case GIT_BLAME_TRACK_COPIES_SAME_COMMIT_COPIES =>
          Some("GIT_BLAME_TRACK_COPIES_SAME_COMMIT_COPIES")
        case GIT_BLAME_TRACK_COPIES_ANY_COMMIT_COPIES =>
          Some("GIT_BLAME_TRACK_COPIES_ANY_COMMIT_COPIES")
        case GIT_BLAME_FIRST_PARENT      => Some("GIT_BLAME_FIRST_PARENT")
        case GIT_BLAME_USE_MAILMAP       => Some("GIT_BLAME_USE_MAILMAP")
        case GIT_BLAME_IGNORE_WHITESPACE => Some("GIT_BLAME_IGNORE_WHITESPACE")
        case _                           => None
    extension (a: git_blame_flag_t)
      inline def &(b: git_blame_flag_t): git_blame_flag_t = a & b
      inline def |(b: git_blame_flag_t): git_blame_flag_t = a | b
      inline def is(b: git_blame_flag_t): Boolean = (a & b) == b
  end git_blame_flag_t

  /** Flags to control the functionality of `git_blob_filter`.
    */
  opaque type git_blob_filter_flag_t = CUnsignedInt
  object git_blob_filter_flag_t extends CEnumU[git_blob_filter_flag_t]:
    given _tag: Tag[git_blob_filter_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_blob_filter_flag_t = a.toUInt
    val GIT_BLOB_FILTER_CHECK_FOR_BINARY = define(1)
    val GIT_BLOB_FILTER_NO_SYSTEM_ATTRIBUTES = define(2)
    val GIT_BLOB_FILTER_ATTRIBUTES_FROM_HEAD = define(4)
    val GIT_BLOB_FILTER_ATTRIBUTES_FROM_COMMIT = define(8)
    inline def getName(inline value: git_blob_filter_flag_t): Option[String] =
      inline value match
        case GIT_BLOB_FILTER_CHECK_FOR_BINARY =>
          Some("GIT_BLOB_FILTER_CHECK_FOR_BINARY")
        case GIT_BLOB_FILTER_NO_SYSTEM_ATTRIBUTES =>
          Some("GIT_BLOB_FILTER_NO_SYSTEM_ATTRIBUTES")
        case GIT_BLOB_FILTER_ATTRIBUTES_FROM_HEAD =>
          Some("GIT_BLOB_FILTER_ATTRIBUTES_FROM_HEAD")
        case GIT_BLOB_FILTER_ATTRIBUTES_FROM_COMMIT =>
          Some("GIT_BLOB_FILTER_ATTRIBUTES_FROM_COMMIT")
        case _ => None
    extension (a: git_blob_filter_flag_t)
      inline def &(b: git_blob_filter_flag_t): git_blob_filter_flag_t = a & b
      inline def |(b: git_blob_filter_flag_t): git_blob_filter_flag_t = a | b
      inline def is(b: git_blob_filter_flag_t): Boolean = (a & b) == b
  end git_blob_filter_flag_t

  /** Basic type of any Git branch.
    */
  opaque type git_branch_t = CUnsignedInt
  object git_branch_t extends CEnumU[git_branch_t]:
    given _tag: Tag[git_branch_t] = Tag.UInt
    inline def define(inline a: Long): git_branch_t = a.toUInt
    val GIT_BRANCH_LOCAL = define(1)
    val GIT_BRANCH_REMOTE = define(2)
    val GIT_BRANCH_ALL = define(3)
    inline def getName(inline value: git_branch_t): Option[String] =
      inline value match
        case GIT_BRANCH_LOCAL  => Some("GIT_BRANCH_LOCAL")
        case GIT_BRANCH_REMOTE => Some("GIT_BRANCH_REMOTE")
        case GIT_BRANCH_ALL    => Some("GIT_BRANCH_ALL")
        case _                 => None
    extension (a: git_branch_t)
      inline def &(b: git_branch_t): git_branch_t = a & b
      inline def |(b: git_branch_t): git_branch_t = a | b
      inline def is(b: git_branch_t): Boolean = (a & b) == b
  end git_branch_t

  /** */
  opaque type git_cert_ssh_raw_type_t = CUnsignedInt
  object git_cert_ssh_raw_type_t extends CEnumU[git_cert_ssh_raw_type_t]:
    given _tag: Tag[git_cert_ssh_raw_type_t] = Tag.UInt
    inline def define(inline a: Long): git_cert_ssh_raw_type_t = a.toUInt
    val GIT_CERT_SSH_RAW_TYPE_UNKNOWN = define(0)
    val GIT_CERT_SSH_RAW_TYPE_RSA = define(1)
    val GIT_CERT_SSH_RAW_TYPE_DSS = define(2)
    val GIT_CERT_SSH_RAW_TYPE_KEY_ECDSA_256 = define(3)
    val GIT_CERT_SSH_RAW_TYPE_KEY_ECDSA_384 = define(4)
    val GIT_CERT_SSH_RAW_TYPE_KEY_ECDSA_521 = define(5)
    val GIT_CERT_SSH_RAW_TYPE_KEY_ED25519 = define(6)
    inline def getName(inline value: git_cert_ssh_raw_type_t): Option[String] =
      inline value match
        case GIT_CERT_SSH_RAW_TYPE_UNKNOWN =>
          Some("GIT_CERT_SSH_RAW_TYPE_UNKNOWN")
        case GIT_CERT_SSH_RAW_TYPE_RSA => Some("GIT_CERT_SSH_RAW_TYPE_RSA")
        case GIT_CERT_SSH_RAW_TYPE_DSS => Some("GIT_CERT_SSH_RAW_TYPE_DSS")
        case GIT_CERT_SSH_RAW_TYPE_KEY_ECDSA_256 =>
          Some("GIT_CERT_SSH_RAW_TYPE_KEY_ECDSA_256")
        case GIT_CERT_SSH_RAW_TYPE_KEY_ECDSA_384 =>
          Some("GIT_CERT_SSH_RAW_TYPE_KEY_ECDSA_384")
        case GIT_CERT_SSH_RAW_TYPE_KEY_ECDSA_521 =>
          Some("GIT_CERT_SSH_RAW_TYPE_KEY_ECDSA_521")
        case GIT_CERT_SSH_RAW_TYPE_KEY_ED25519 =>
          Some("GIT_CERT_SSH_RAW_TYPE_KEY_ED25519")
        case _ => None
    extension (a: git_cert_ssh_raw_type_t)
      inline def &(b: git_cert_ssh_raw_type_t): git_cert_ssh_raw_type_t = a & b
      inline def |(b: git_cert_ssh_raw_type_t): git_cert_ssh_raw_type_t = a | b
      inline def is(b: git_cert_ssh_raw_type_t): Boolean = (a & b) == b
  end git_cert_ssh_raw_type_t

  /** Type of SSH host fingerprint
    */
  opaque type git_cert_ssh_t = CUnsignedInt
  object git_cert_ssh_t extends CEnumU[git_cert_ssh_t]:
    given _tag: Tag[git_cert_ssh_t] = Tag.UInt
    inline def define(inline a: Long): git_cert_ssh_t = a.toUInt
    val GIT_CERT_SSH_MD5 = define(1)
    val GIT_CERT_SSH_SHA1 = define(2)
    val GIT_CERT_SSH_SHA256 = define(4)
    val GIT_CERT_SSH_RAW = define(8)
    inline def getName(inline value: git_cert_ssh_t): Option[String] =
      inline value match
        case GIT_CERT_SSH_MD5    => Some("GIT_CERT_SSH_MD5")
        case GIT_CERT_SSH_SHA1   => Some("GIT_CERT_SSH_SHA1")
        case GIT_CERT_SSH_SHA256 => Some("GIT_CERT_SSH_SHA256")
        case GIT_CERT_SSH_RAW    => Some("GIT_CERT_SSH_RAW")
        case _                   => None
    extension (a: git_cert_ssh_t)
      inline def &(b: git_cert_ssh_t): git_cert_ssh_t = a & b
      inline def |(b: git_cert_ssh_t): git_cert_ssh_t = a | b
      inline def is(b: git_cert_ssh_t): Boolean = (a & b) == b
  end git_cert_ssh_t

  /** Type of host certificate structure that is passed to the check callback
    */
  opaque type git_cert_t = CUnsignedInt
  object git_cert_t extends CEnumU[git_cert_t]:
    given _tag: Tag[git_cert_t] = Tag.UInt
    inline def define(inline a: Long): git_cert_t = a.toUInt
    val GIT_CERT_NONE = define(0)
    val GIT_CERT_X509 = define(1)
    val GIT_CERT_HOSTKEY_LIBSSH2 = define(2)
    val GIT_CERT_STRARRAY = define(3)
    inline def getName(inline value: git_cert_t): Option[String] =
      inline value match
        case GIT_CERT_NONE            => Some("GIT_CERT_NONE")
        case GIT_CERT_X509            => Some("GIT_CERT_X509")
        case GIT_CERT_HOSTKEY_LIBSSH2 => Some("GIT_CERT_HOSTKEY_LIBSSH2")
        case GIT_CERT_STRARRAY        => Some("GIT_CERT_STRARRAY")
        case _                        => None
    extension (a: git_cert_t)
      inline def &(b: git_cert_t): git_cert_t = a & b
      inline def |(b: git_cert_t): git_cert_t = a | b
      inline def is(b: git_cert_t): Boolean = (a & b) == b
  end git_cert_t

  /** Checkout notification flags
    */
  opaque type git_checkout_notify_t = CUnsignedInt
  object git_checkout_notify_t extends CEnumU[git_checkout_notify_t]:
    given _tag: Tag[git_checkout_notify_t] = Tag.UInt
    inline def define(inline a: Long): git_checkout_notify_t = a.toUInt
    val GIT_CHECKOUT_NOTIFY_NONE = define(0)
    val GIT_CHECKOUT_NOTIFY_CONFLICT = define(1)
    val GIT_CHECKOUT_NOTIFY_DIRTY = define(2)
    val GIT_CHECKOUT_NOTIFY_UPDATED = define(4)
    val GIT_CHECKOUT_NOTIFY_UNTRACKED = define(8)
    val GIT_CHECKOUT_NOTIFY_IGNORED = define(16)
    val GIT_CHECKOUT_NOTIFY_ALL = define(65535)
    inline def getName(inline value: git_checkout_notify_t): Option[String] =
      inline value match
        case GIT_CHECKOUT_NOTIFY_NONE => Some("GIT_CHECKOUT_NOTIFY_NONE")
        case GIT_CHECKOUT_NOTIFY_CONFLICT =>
          Some("GIT_CHECKOUT_NOTIFY_CONFLICT")
        case GIT_CHECKOUT_NOTIFY_DIRTY   => Some("GIT_CHECKOUT_NOTIFY_DIRTY")
        case GIT_CHECKOUT_NOTIFY_UPDATED => Some("GIT_CHECKOUT_NOTIFY_UPDATED")
        case GIT_CHECKOUT_NOTIFY_UNTRACKED =>
          Some("GIT_CHECKOUT_NOTIFY_UNTRACKED")
        case GIT_CHECKOUT_NOTIFY_IGNORED => Some("GIT_CHECKOUT_NOTIFY_IGNORED")
        case GIT_CHECKOUT_NOTIFY_ALL     => Some("GIT_CHECKOUT_NOTIFY_ALL")
        case _                           => None
    extension (a: git_checkout_notify_t)
      inline def &(b: git_checkout_notify_t): git_checkout_notify_t = a & b
      inline def |(b: git_checkout_notify_t): git_checkout_notify_t = a | b
      inline def is(b: git_checkout_notify_t): Boolean = (a & b) == b
  end git_checkout_notify_t

  /** Checkout behavior flags
    */
  opaque type git_checkout_strategy_t = CUnsignedInt
  object git_checkout_strategy_t extends CEnumU[git_checkout_strategy_t]:
    given _tag: Tag[git_checkout_strategy_t] = Tag.UInt
    inline def define(inline a: Long): git_checkout_strategy_t = a.toUInt
    val GIT_CHECKOUT_NONE = define(0)
    val GIT_CHECKOUT_SAFE = define(1)
    val GIT_CHECKOUT_FORCE = define(2)
    val GIT_CHECKOUT_RECREATE_MISSING = define(4)
    val GIT_CHECKOUT_ALLOW_CONFLICTS = define(16)
    val GIT_CHECKOUT_REMOVE_UNTRACKED = define(32)
    val GIT_CHECKOUT_REMOVE_IGNORED = define(64)
    val GIT_CHECKOUT_UPDATE_ONLY = define(128)
    val GIT_CHECKOUT_DONT_UPDATE_INDEX = define(256)
    val GIT_CHECKOUT_NO_REFRESH = define(512)
    val GIT_CHECKOUT_SKIP_UNMERGED = define(1024)
    val GIT_CHECKOUT_USE_OURS = define(2048)
    val GIT_CHECKOUT_USE_THEIRS = define(4096)
    val GIT_CHECKOUT_DISABLE_PATHSPEC_MATCH = define(8192)
    val GIT_CHECKOUT_SKIP_LOCKED_DIRECTORIES = define(262144)
    val GIT_CHECKOUT_DONT_OVERWRITE_IGNORED = define(524288)
    val GIT_CHECKOUT_CONFLICT_STYLE_MERGE = define(1048576)
    val GIT_CHECKOUT_CONFLICT_STYLE_DIFF3 = define(2097152)
    val GIT_CHECKOUT_DONT_REMOVE_EXISTING = define(4194304)
    val GIT_CHECKOUT_DONT_WRITE_INDEX = define(8388608)
    val GIT_CHECKOUT_DRY_RUN = define(16777216)
    val GIT_CHECKOUT_CONFLICT_STYLE_ZDIFF3 = define(33554432)
    val GIT_CHECKOUT_UPDATE_SUBMODULES = define(65536)
    val GIT_CHECKOUT_UPDATE_SUBMODULES_IF_CHANGED = define(131072)
    inline def getName(inline value: git_checkout_strategy_t): Option[String] =
      inline value match
        case GIT_CHECKOUT_NONE  => Some("GIT_CHECKOUT_NONE")
        case GIT_CHECKOUT_SAFE  => Some("GIT_CHECKOUT_SAFE")
        case GIT_CHECKOUT_FORCE => Some("GIT_CHECKOUT_FORCE")
        case GIT_CHECKOUT_RECREATE_MISSING =>
          Some("GIT_CHECKOUT_RECREATE_MISSING")
        case GIT_CHECKOUT_ALLOW_CONFLICTS =>
          Some("GIT_CHECKOUT_ALLOW_CONFLICTS")
        case GIT_CHECKOUT_REMOVE_UNTRACKED =>
          Some("GIT_CHECKOUT_REMOVE_UNTRACKED")
        case GIT_CHECKOUT_REMOVE_IGNORED => Some("GIT_CHECKOUT_REMOVE_IGNORED")
        case GIT_CHECKOUT_UPDATE_ONLY    => Some("GIT_CHECKOUT_UPDATE_ONLY")
        case GIT_CHECKOUT_DONT_UPDATE_INDEX =>
          Some("GIT_CHECKOUT_DONT_UPDATE_INDEX")
        case GIT_CHECKOUT_NO_REFRESH    => Some("GIT_CHECKOUT_NO_REFRESH")
        case GIT_CHECKOUT_SKIP_UNMERGED => Some("GIT_CHECKOUT_SKIP_UNMERGED")
        case GIT_CHECKOUT_USE_OURS      => Some("GIT_CHECKOUT_USE_OURS")
        case GIT_CHECKOUT_USE_THEIRS    => Some("GIT_CHECKOUT_USE_THEIRS")
        case GIT_CHECKOUT_DISABLE_PATHSPEC_MATCH =>
          Some("GIT_CHECKOUT_DISABLE_PATHSPEC_MATCH")
        case GIT_CHECKOUT_SKIP_LOCKED_DIRECTORIES =>
          Some("GIT_CHECKOUT_SKIP_LOCKED_DIRECTORIES")
        case GIT_CHECKOUT_DONT_OVERWRITE_IGNORED =>
          Some("GIT_CHECKOUT_DONT_OVERWRITE_IGNORED")
        case GIT_CHECKOUT_CONFLICT_STYLE_MERGE =>
          Some("GIT_CHECKOUT_CONFLICT_STYLE_MERGE")
        case GIT_CHECKOUT_CONFLICT_STYLE_DIFF3 =>
          Some("GIT_CHECKOUT_CONFLICT_STYLE_DIFF3")
        case GIT_CHECKOUT_DONT_REMOVE_EXISTING =>
          Some("GIT_CHECKOUT_DONT_REMOVE_EXISTING")
        case GIT_CHECKOUT_DONT_WRITE_INDEX =>
          Some("GIT_CHECKOUT_DONT_WRITE_INDEX")
        case GIT_CHECKOUT_DRY_RUN => Some("GIT_CHECKOUT_DRY_RUN")
        case GIT_CHECKOUT_CONFLICT_STYLE_ZDIFF3 =>
          Some("GIT_CHECKOUT_CONFLICT_STYLE_ZDIFF3")
        case GIT_CHECKOUT_UPDATE_SUBMODULES =>
          Some("GIT_CHECKOUT_UPDATE_SUBMODULES")
        case GIT_CHECKOUT_UPDATE_SUBMODULES_IF_CHANGED =>
          Some("GIT_CHECKOUT_UPDATE_SUBMODULES_IF_CHANGED")
        case _ => None
    extension (a: git_checkout_strategy_t)
      inline def &(b: git_checkout_strategy_t): git_checkout_strategy_t = a & b
      inline def |(b: git_checkout_strategy_t): git_checkout_strategy_t = a | b
      inline def is(b: git_checkout_strategy_t): Boolean = (a & b) == b
  end git_checkout_strategy_t

  /** Options for bypassing the git-aware transport on clone. Bypassing it means
    * that instead of a fetch, libgit2 will copy the object database directory
    * instead of figuring out what it needs, which is faster. If possible, it
    * will hardlink the files to save space.
    */
  opaque type git_clone_local_t = CUnsignedInt
  object git_clone_local_t extends CEnumU[git_clone_local_t]:
    given _tag: Tag[git_clone_local_t] = Tag.UInt
    inline def define(inline a: Long): git_clone_local_t = a.toUInt
    val GIT_CLONE_LOCAL_AUTO = define(0)
    val GIT_CLONE_LOCAL = define(1)
    val GIT_CLONE_NO_LOCAL = define(2)
    val GIT_CLONE_LOCAL_NO_LINKS = define(3)
    inline def getName(inline value: git_clone_local_t): Option[String] =
      inline value match
        case GIT_CLONE_LOCAL_AUTO     => Some("GIT_CLONE_LOCAL_AUTO")
        case GIT_CLONE_LOCAL          => Some("GIT_CLONE_LOCAL")
        case GIT_CLONE_NO_LOCAL       => Some("GIT_CLONE_NO_LOCAL")
        case GIT_CLONE_LOCAL_NO_LINKS => Some("GIT_CLONE_LOCAL_NO_LINKS")
        case _                        => None
    extension (a: git_clone_local_t)
      inline def &(b: git_clone_local_t): git_clone_local_t = a & b
      inline def |(b: git_clone_local_t): git_clone_local_t = a | b
      inline def is(b: git_clone_local_t): Boolean = (a & b) == b
  end git_clone_local_t

  /** Priority level of a config file. These priority levels correspond to the
    * natural escalation logic (from higher to lower) when searching for config
    * entries in git.git.
    */
  opaque type git_config_level_t = CInt
  object git_config_level_t extends CEnum[git_config_level_t]:
    given _tag: Tag[git_config_level_t] = Tag.Int
    inline def define(inline a: CInt): git_config_level_t = a
    val GIT_CONFIG_LEVEL_PROGRAMDATA = define(1)
    val GIT_CONFIG_LEVEL_SYSTEM = define(2)
    val GIT_CONFIG_LEVEL_XDG = define(3)
    val GIT_CONFIG_LEVEL_GLOBAL = define(4)
    val GIT_CONFIG_LEVEL_LOCAL = define(5)
    val GIT_CONFIG_LEVEL_APP = define(6)
    val GIT_CONFIG_HIGHEST_LEVEL = define(-1)
    inline def getName(inline value: git_config_level_t): Option[String] =
      inline value match
        case GIT_CONFIG_LEVEL_PROGRAMDATA =>
          Some("GIT_CONFIG_LEVEL_PROGRAMDATA")
        case GIT_CONFIG_LEVEL_SYSTEM  => Some("GIT_CONFIG_LEVEL_SYSTEM")
        case GIT_CONFIG_LEVEL_XDG     => Some("GIT_CONFIG_LEVEL_XDG")
        case GIT_CONFIG_LEVEL_GLOBAL  => Some("GIT_CONFIG_LEVEL_GLOBAL")
        case GIT_CONFIG_LEVEL_LOCAL   => Some("GIT_CONFIG_LEVEL_LOCAL")
        case GIT_CONFIG_LEVEL_APP     => Some("GIT_CONFIG_LEVEL_APP")
        case GIT_CONFIG_HIGHEST_LEVEL => Some("GIT_CONFIG_HIGHEST_LEVEL")
        case _                        => None
    extension (a: git_config_level_t)
      inline def &(b: git_config_level_t): git_config_level_t = a & b
      inline def |(b: git_config_level_t): git_config_level_t = a | b
      inline def is(b: git_config_level_t): Boolean = (a & b) == b
  end git_config_level_t

  /** Config var type
    */
  opaque type git_configmap_t = CUnsignedInt
  object git_configmap_t extends CEnumU[git_configmap_t]:
    given _tag: Tag[git_configmap_t] = Tag.UInt
    inline def define(inline a: Long): git_configmap_t = a.toUInt
    val GIT_CONFIGMAP_FALSE = define(0)
    val GIT_CONFIGMAP_TRUE = define(1)
    val GIT_CONFIGMAP_INT32 = define(2)
    val GIT_CONFIGMAP_STRING = define(3)
    inline def getName(inline value: git_configmap_t): Option[String] =
      inline value match
        case GIT_CONFIGMAP_FALSE  => Some("GIT_CONFIGMAP_FALSE")
        case GIT_CONFIGMAP_TRUE   => Some("GIT_CONFIGMAP_TRUE")
        case GIT_CONFIGMAP_INT32  => Some("GIT_CONFIGMAP_INT32")
        case GIT_CONFIGMAP_STRING => Some("GIT_CONFIGMAP_STRING")
        case _                    => None
    extension (a: git_configmap_t)
      inline def &(b: git_configmap_t): git_configmap_t = a & b
      inline def |(b: git_configmap_t): git_configmap_t = a | b
      inline def is(b: git_configmap_t): Boolean = (a & b) == b
  end git_configmap_t

  /** Supported credential types
    */
  opaque type git_credential_t = CUnsignedInt
  object git_credential_t extends CEnumU[git_credential_t]:
    given _tag: Tag[git_credential_t] = Tag.UInt
    inline def define(inline a: Long): git_credential_t = a.toUInt
    val GIT_CREDENTIAL_USERPASS_PLAINTEXT = define(1)
    val GIT_CREDENTIAL_SSH_KEY = define(2)
    val GIT_CREDENTIAL_SSH_CUSTOM = define(4)
    val GIT_CREDENTIAL_DEFAULT = define(8)
    val GIT_CREDENTIAL_SSH_INTERACTIVE = define(16)
    val GIT_CREDENTIAL_USERNAME = define(32)
    val GIT_CREDENTIAL_SSH_MEMORY = define(64)
    inline def getName(inline value: git_credential_t): Option[String] =
      inline value match
        case GIT_CREDENTIAL_USERPASS_PLAINTEXT =>
          Some("GIT_CREDENTIAL_USERPASS_PLAINTEXT")
        case GIT_CREDENTIAL_SSH_KEY    => Some("GIT_CREDENTIAL_SSH_KEY")
        case GIT_CREDENTIAL_SSH_CUSTOM => Some("GIT_CREDENTIAL_SSH_CUSTOM")
        case GIT_CREDENTIAL_DEFAULT    => Some("GIT_CREDENTIAL_DEFAULT")
        case GIT_CREDENTIAL_SSH_INTERACTIVE =>
          Some("GIT_CREDENTIAL_SSH_INTERACTIVE")
        case GIT_CREDENTIAL_USERNAME   => Some("GIT_CREDENTIAL_USERNAME")
        case GIT_CREDENTIAL_SSH_MEMORY => Some("GIT_CREDENTIAL_SSH_MEMORY")
        case _                         => None
    extension (a: git_credential_t)
      inline def &(b: git_credential_t): git_credential_t = a & b
      inline def |(b: git_credential_t): git_credential_t = a | b
      inline def is(b: git_credential_t): Boolean = (a & b) == b
  end git_credential_t

  /** What type of change is described by a git_diff_delta?
    */
  opaque type git_delta_t = CUnsignedInt
  object git_delta_t extends CEnumU[git_delta_t]:
    given _tag: Tag[git_delta_t] = Tag.UInt
    inline def define(inline a: Long): git_delta_t = a.toUInt
    val GIT_DELTA_UNMODIFIED = define(0)
    val GIT_DELTA_ADDED = define(1)
    val GIT_DELTA_DELETED = define(2)
    val GIT_DELTA_MODIFIED = define(3)
    val GIT_DELTA_RENAMED = define(4)
    val GIT_DELTA_COPIED = define(5)
    val GIT_DELTA_IGNORED = define(6)
    val GIT_DELTA_UNTRACKED = define(7)
    val GIT_DELTA_TYPECHANGE = define(8)
    val GIT_DELTA_UNREADABLE = define(9)
    val GIT_DELTA_CONFLICTED = define(10)
    inline def getName(inline value: git_delta_t): Option[String] =
      inline value match
        case GIT_DELTA_UNMODIFIED => Some("GIT_DELTA_UNMODIFIED")
        case GIT_DELTA_ADDED      => Some("GIT_DELTA_ADDED")
        case GIT_DELTA_DELETED    => Some("GIT_DELTA_DELETED")
        case GIT_DELTA_MODIFIED   => Some("GIT_DELTA_MODIFIED")
        case GIT_DELTA_RENAMED    => Some("GIT_DELTA_RENAMED")
        case GIT_DELTA_COPIED     => Some("GIT_DELTA_COPIED")
        case GIT_DELTA_IGNORED    => Some("GIT_DELTA_IGNORED")
        case GIT_DELTA_UNTRACKED  => Some("GIT_DELTA_UNTRACKED")
        case GIT_DELTA_TYPECHANGE => Some("GIT_DELTA_TYPECHANGE")
        case GIT_DELTA_UNREADABLE => Some("GIT_DELTA_UNREADABLE")
        case GIT_DELTA_CONFLICTED => Some("GIT_DELTA_CONFLICTED")
        case _                    => None
    extension (a: git_delta_t)
      inline def &(b: git_delta_t): git_delta_t = a & b
      inline def |(b: git_delta_t): git_delta_t = a | b
      inline def is(b: git_delta_t): Boolean = (a & b) == b
  end git_delta_t

  /** Reference lookup strategy
    */
  opaque type git_describe_strategy_t = CUnsignedInt
  object git_describe_strategy_t extends CEnumU[git_describe_strategy_t]:
    given _tag: Tag[git_describe_strategy_t] = Tag.UInt
    inline def define(inline a: Long): git_describe_strategy_t = a.toUInt
    val GIT_DESCRIBE_DEFAULT = define(0)
    val GIT_DESCRIBE_TAGS = define(1)
    val GIT_DESCRIBE_ALL = define(2)
    inline def getName(inline value: git_describe_strategy_t): Option[String] =
      inline value match
        case GIT_DESCRIBE_DEFAULT => Some("GIT_DESCRIBE_DEFAULT")
        case GIT_DESCRIBE_TAGS    => Some("GIT_DESCRIBE_TAGS")
        case GIT_DESCRIBE_ALL     => Some("GIT_DESCRIBE_ALL")
        case _                    => None
    extension (a: git_describe_strategy_t)
      inline def &(b: git_describe_strategy_t): git_describe_strategy_t = a & b
      inline def |(b: git_describe_strategy_t): git_describe_strategy_t = a | b
      inline def is(b: git_describe_strategy_t): Boolean = (a & b) == b
  end git_describe_strategy_t

  /** When producing a binary diff, the binary data returned will be either the
    * deflated full ("literal") contents of the file, or the deflated binary
    * delta between the two sides (whichever is smaller).
    */
  opaque type git_diff_binary_t = CUnsignedInt
  object git_diff_binary_t extends CEnumU[git_diff_binary_t]:
    given _tag: Tag[git_diff_binary_t] = Tag.UInt
    inline def define(inline a: Long): git_diff_binary_t = a.toUInt
    val GIT_DIFF_BINARY_NONE = define(0)
    val GIT_DIFF_BINARY_LITERAL = define(1)
    val GIT_DIFF_BINARY_DELTA = define(2)
    inline def getName(inline value: git_diff_binary_t): Option[String] =
      inline value match
        case GIT_DIFF_BINARY_NONE    => Some("GIT_DIFF_BINARY_NONE")
        case GIT_DIFF_BINARY_LITERAL => Some("GIT_DIFF_BINARY_LITERAL")
        case GIT_DIFF_BINARY_DELTA   => Some("GIT_DIFF_BINARY_DELTA")
        case _                       => None
    extension (a: git_diff_binary_t)
      inline def &(b: git_diff_binary_t): git_diff_binary_t = a & b
      inline def |(b: git_diff_binary_t): git_diff_binary_t = a | b
      inline def is(b: git_diff_binary_t): Boolean = (a & b) == b
  end git_diff_binary_t

  /** Flags to control the behavior of diff rename/copy detection.
    */
  opaque type git_diff_find_t = CUnsignedInt
  object git_diff_find_t extends CEnumU[git_diff_find_t]:
    given _tag: Tag[git_diff_find_t] = Tag.UInt
    inline def define(inline a: Long): git_diff_find_t = a.toUInt
    val GIT_DIFF_FIND_BY_CONFIG = define(0)
    val GIT_DIFF_FIND_RENAMES = define(1)
    val GIT_DIFF_FIND_RENAMES_FROM_REWRITES = define(2)
    val GIT_DIFF_FIND_COPIES = define(4)
    val GIT_DIFF_FIND_COPIES_FROM_UNMODIFIED = define(8)
    val GIT_DIFF_FIND_REWRITES = define(16)
    val GIT_DIFF_BREAK_REWRITES = define(32)
    val GIT_DIFF_FIND_AND_BREAK_REWRITES = define(48)
    val GIT_DIFF_FIND_FOR_UNTRACKED = define(64)
    val GIT_DIFF_FIND_ALL = define(255)
    val GIT_DIFF_FIND_IGNORE_LEADING_WHITESPACE = define(0)
    val GIT_DIFF_FIND_IGNORE_WHITESPACE = define(4096)
    val GIT_DIFF_FIND_DONT_IGNORE_WHITESPACE = define(8192)
    val GIT_DIFF_FIND_EXACT_MATCH_ONLY = define(16384)
    val GIT_DIFF_BREAK_REWRITES_FOR_RENAMES_ONLY = define(32768)
    val GIT_DIFF_FIND_REMOVE_UNMODIFIED = define(65536)
    inline def getName(inline value: git_diff_find_t): Option[String] =
      inline value match
        case GIT_DIFF_FIND_BY_CONFIG => Some("GIT_DIFF_FIND_BY_CONFIG")
        case GIT_DIFF_FIND_RENAMES   => Some("GIT_DIFF_FIND_RENAMES")
        case GIT_DIFF_FIND_RENAMES_FROM_REWRITES =>
          Some("GIT_DIFF_FIND_RENAMES_FROM_REWRITES")
        case GIT_DIFF_FIND_COPIES => Some("GIT_DIFF_FIND_COPIES")
        case GIT_DIFF_FIND_COPIES_FROM_UNMODIFIED =>
          Some("GIT_DIFF_FIND_COPIES_FROM_UNMODIFIED")
        case GIT_DIFF_FIND_REWRITES  => Some("GIT_DIFF_FIND_REWRITES")
        case GIT_DIFF_BREAK_REWRITES => Some("GIT_DIFF_BREAK_REWRITES")
        case GIT_DIFF_FIND_AND_BREAK_REWRITES =>
          Some("GIT_DIFF_FIND_AND_BREAK_REWRITES")
        case GIT_DIFF_FIND_FOR_UNTRACKED => Some("GIT_DIFF_FIND_FOR_UNTRACKED")
        case GIT_DIFF_FIND_ALL           => Some("GIT_DIFF_FIND_ALL")
        case GIT_DIFF_FIND_IGNORE_LEADING_WHITESPACE =>
          Some("GIT_DIFF_FIND_IGNORE_LEADING_WHITESPACE")
        case GIT_DIFF_FIND_IGNORE_WHITESPACE =>
          Some("GIT_DIFF_FIND_IGNORE_WHITESPACE")
        case GIT_DIFF_FIND_DONT_IGNORE_WHITESPACE =>
          Some("GIT_DIFF_FIND_DONT_IGNORE_WHITESPACE")
        case GIT_DIFF_FIND_EXACT_MATCH_ONLY =>
          Some("GIT_DIFF_FIND_EXACT_MATCH_ONLY")
        case GIT_DIFF_BREAK_REWRITES_FOR_RENAMES_ONLY =>
          Some("GIT_DIFF_BREAK_REWRITES_FOR_RENAMES_ONLY")
        case GIT_DIFF_FIND_REMOVE_UNMODIFIED =>
          Some("GIT_DIFF_FIND_REMOVE_UNMODIFIED")
        case _ => None
    extension (a: git_diff_find_t)
      inline def &(b: git_diff_find_t): git_diff_find_t = a & b
      inline def |(b: git_diff_find_t): git_diff_find_t = a | b
      inline def is(b: git_diff_find_t): Boolean = (a & b) == b
  end git_diff_find_t

  /** Flags for the delta object and the file objects on each side.
    */
  opaque type git_diff_flag_t = CUnsignedInt
  object git_diff_flag_t extends CEnumU[git_diff_flag_t]:
    given _tag: Tag[git_diff_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_diff_flag_t = a.toUInt
    val GIT_DIFF_FLAG_BINARY = define(1)
    val GIT_DIFF_FLAG_NOT_BINARY = define(2)
    val GIT_DIFF_FLAG_VALID_ID = define(4)
    val GIT_DIFF_FLAG_EXISTS = define(8)
    val GIT_DIFF_FLAG_VALID_SIZE = define(16)
    inline def getName(inline value: git_diff_flag_t): Option[String] =
      inline value match
        case GIT_DIFF_FLAG_BINARY     => Some("GIT_DIFF_FLAG_BINARY")
        case GIT_DIFF_FLAG_NOT_BINARY => Some("GIT_DIFF_FLAG_NOT_BINARY")
        case GIT_DIFF_FLAG_VALID_ID   => Some("GIT_DIFF_FLAG_VALID_ID")
        case GIT_DIFF_FLAG_EXISTS     => Some("GIT_DIFF_FLAG_EXISTS")
        case GIT_DIFF_FLAG_VALID_SIZE => Some("GIT_DIFF_FLAG_VALID_SIZE")
        case _                        => None
    extension (a: git_diff_flag_t)
      inline def &(b: git_diff_flag_t): git_diff_flag_t = a & b
      inline def |(b: git_diff_flag_t): git_diff_flag_t = a | b
      inline def is(b: git_diff_flag_t): Boolean = (a & b) == b
  end git_diff_flag_t

  /** Formatting options for diff e-mail generation
    */
  opaque type git_diff_format_email_flags_t = CUnsignedInt
  object git_diff_format_email_flags_t
      extends CEnumU[git_diff_format_email_flags_t]:
    given _tag: Tag[git_diff_format_email_flags_t] = Tag.UInt
    inline def define(inline a: Long): git_diff_format_email_flags_t = a.toUInt
    val GIT_DIFF_FORMAT_EMAIL_NONE = define(0)
    val GIT_DIFF_FORMAT_EMAIL_EXCLUDE_SUBJECT_PATCH_MARKER = define(1)
    inline def getName(
        inline value: git_diff_format_email_flags_t
    ): Option[String] =
      inline value match
        case GIT_DIFF_FORMAT_EMAIL_NONE => Some("GIT_DIFF_FORMAT_EMAIL_NONE")
        case GIT_DIFF_FORMAT_EMAIL_EXCLUDE_SUBJECT_PATCH_MARKER =>
          Some("GIT_DIFF_FORMAT_EMAIL_EXCLUDE_SUBJECT_PATCH_MARKER")
        case _ => None
    extension (a: git_diff_format_email_flags_t)
      inline def &(
          b: git_diff_format_email_flags_t
      ): git_diff_format_email_flags_t = a & b
      inline def |(
          b: git_diff_format_email_flags_t
      ): git_diff_format_email_flags_t = a | b
      inline def is(b: git_diff_format_email_flags_t): Boolean = (a & b) == b
  end git_diff_format_email_flags_t

  /** Possible output formats for diff data
    */
  opaque type git_diff_format_t = CUnsignedInt
  object git_diff_format_t extends CEnumU[git_diff_format_t]:
    given _tag: Tag[git_diff_format_t] = Tag.UInt
    inline def define(inline a: Long): git_diff_format_t = a.toUInt
    val GIT_DIFF_FORMAT_PATCH = define(1)
    val GIT_DIFF_FORMAT_PATCH_HEADER = define(2)
    val GIT_DIFF_FORMAT_RAW = define(3)
    val GIT_DIFF_FORMAT_NAME_ONLY = define(4)
    val GIT_DIFF_FORMAT_NAME_STATUS = define(5)
    val GIT_DIFF_FORMAT_PATCH_ID = define(6)
    inline def getName(inline value: git_diff_format_t): Option[String] =
      inline value match
        case GIT_DIFF_FORMAT_PATCH => Some("GIT_DIFF_FORMAT_PATCH")
        case GIT_DIFF_FORMAT_PATCH_HEADER =>
          Some("GIT_DIFF_FORMAT_PATCH_HEADER")
        case GIT_DIFF_FORMAT_RAW         => Some("GIT_DIFF_FORMAT_RAW")
        case GIT_DIFF_FORMAT_NAME_ONLY   => Some("GIT_DIFF_FORMAT_NAME_ONLY")
        case GIT_DIFF_FORMAT_NAME_STATUS => Some("GIT_DIFF_FORMAT_NAME_STATUS")
        case GIT_DIFF_FORMAT_PATCH_ID    => Some("GIT_DIFF_FORMAT_PATCH_ID")
        case _                           => None
    extension (a: git_diff_format_t)
      inline def &(b: git_diff_format_t): git_diff_format_t = a & b
      inline def |(b: git_diff_format_t): git_diff_format_t = a | b
      inline def is(b: git_diff_format_t): Boolean = (a & b) == b
  end git_diff_format_t

  /** Line origin constants.
    */
  opaque type git_diff_line_t = CUnsignedInt
  object git_diff_line_t extends CEnumU[git_diff_line_t]:
    given _tag: Tag[git_diff_line_t] = Tag.UInt
    inline def define(inline a: Long): git_diff_line_t = a.toUInt
    val GIT_DIFF_LINE_CONTEXT = define(32)
    val GIT_DIFF_LINE_ADDITION = define(43)
    val GIT_DIFF_LINE_DELETION = define(45)
    val GIT_DIFF_LINE_CONTEXT_EOFNL = define(61)
    val GIT_DIFF_LINE_ADD_EOFNL = define(62)
    val GIT_DIFF_LINE_DEL_EOFNL = define(60)
    val GIT_DIFF_LINE_FILE_HDR = define(70)
    val GIT_DIFF_LINE_HUNK_HDR = define(72)
    val GIT_DIFF_LINE_BINARY = define(66)
    inline def getName(inline value: git_diff_line_t): Option[String] =
      inline value match
        case GIT_DIFF_LINE_CONTEXT       => Some("GIT_DIFF_LINE_CONTEXT")
        case GIT_DIFF_LINE_ADDITION      => Some("GIT_DIFF_LINE_ADDITION")
        case GIT_DIFF_LINE_DELETION      => Some("GIT_DIFF_LINE_DELETION")
        case GIT_DIFF_LINE_CONTEXT_EOFNL => Some("GIT_DIFF_LINE_CONTEXT_EOFNL")
        case GIT_DIFF_LINE_ADD_EOFNL     => Some("GIT_DIFF_LINE_ADD_EOFNL")
        case GIT_DIFF_LINE_DEL_EOFNL     => Some("GIT_DIFF_LINE_DEL_EOFNL")
        case GIT_DIFF_LINE_FILE_HDR      => Some("GIT_DIFF_LINE_FILE_HDR")
        case GIT_DIFF_LINE_HUNK_HDR      => Some("GIT_DIFF_LINE_HUNK_HDR")
        case GIT_DIFF_LINE_BINARY        => Some("GIT_DIFF_LINE_BINARY")
        case _                           => None
    extension (a: git_diff_line_t)
      inline def &(b: git_diff_line_t): git_diff_line_t = a & b
      inline def |(b: git_diff_line_t): git_diff_line_t = a | b
      inline def is(b: git_diff_line_t): Boolean = (a & b) == b
  end git_diff_line_t

  /** Flags for diff options. A combination of these flags can be passed in via
    * the `flags` value in the `git_diff_options`.
    */
  opaque type git_diff_option_t = CUnsignedInt
  object git_diff_option_t extends CEnumU[git_diff_option_t]:
    given _tag: Tag[git_diff_option_t] = Tag.UInt
    inline def define(inline a: Long): git_diff_option_t = a.toUInt
    val GIT_DIFF_NORMAL = define(0)
    val GIT_DIFF_REVERSE = define(1)
    val GIT_DIFF_INCLUDE_IGNORED = define(2)
    val GIT_DIFF_RECURSE_IGNORED_DIRS = define(4)
    val GIT_DIFF_INCLUDE_UNTRACKED = define(8)
    val GIT_DIFF_RECURSE_UNTRACKED_DIRS = define(16)
    val GIT_DIFF_INCLUDE_UNMODIFIED = define(32)
    val GIT_DIFF_INCLUDE_TYPECHANGE = define(64)
    val GIT_DIFF_INCLUDE_TYPECHANGE_TREES = define(128)
    val GIT_DIFF_IGNORE_FILEMODE = define(256)
    val GIT_DIFF_IGNORE_SUBMODULES = define(512)
    val GIT_DIFF_IGNORE_CASE = define(1024)
    val GIT_DIFF_INCLUDE_CASECHANGE = define(2048)
    val GIT_DIFF_DISABLE_PATHSPEC_MATCH = define(4096)
    val GIT_DIFF_SKIP_BINARY_CHECK = define(8192)
    val GIT_DIFF_ENABLE_FAST_UNTRACKED_DIRS = define(16384)
    val GIT_DIFF_UPDATE_INDEX = define(32768)
    val GIT_DIFF_INCLUDE_UNREADABLE = define(65536)
    val GIT_DIFF_INCLUDE_UNREADABLE_AS_UNTRACKED = define(131072)
    val GIT_DIFF_INDENT_HEURISTIC = define(262144)
    val GIT_DIFF_IGNORE_BLANK_LINES = define(524288)
    val GIT_DIFF_FORCE_TEXT = define(1048576)
    val GIT_DIFF_FORCE_BINARY = define(2097152)
    val GIT_DIFF_IGNORE_WHITESPACE = define(4194304)
    val GIT_DIFF_IGNORE_WHITESPACE_CHANGE = define(8388608)
    val GIT_DIFF_IGNORE_WHITESPACE_EOL = define(16777216)
    val GIT_DIFF_SHOW_UNTRACKED_CONTENT = define(33554432)
    val GIT_DIFF_SHOW_UNMODIFIED = define(67108864)
    val GIT_DIFF_PATIENCE = define(268435456)
    val GIT_DIFF_MINIMAL = define(536870912)
    val GIT_DIFF_SHOW_BINARY = define(1073741824)
    inline def getName(inline value: git_diff_option_t): Option[String] =
      inline value match
        case GIT_DIFF_NORMAL          => Some("GIT_DIFF_NORMAL")
        case GIT_DIFF_REVERSE         => Some("GIT_DIFF_REVERSE")
        case GIT_DIFF_INCLUDE_IGNORED => Some("GIT_DIFF_INCLUDE_IGNORED")
        case GIT_DIFF_RECURSE_IGNORED_DIRS =>
          Some("GIT_DIFF_RECURSE_IGNORED_DIRS")
        case GIT_DIFF_INCLUDE_UNTRACKED => Some("GIT_DIFF_INCLUDE_UNTRACKED")
        case GIT_DIFF_RECURSE_UNTRACKED_DIRS =>
          Some("GIT_DIFF_RECURSE_UNTRACKED_DIRS")
        case GIT_DIFF_INCLUDE_UNMODIFIED => Some("GIT_DIFF_INCLUDE_UNMODIFIED")
        case GIT_DIFF_INCLUDE_TYPECHANGE => Some("GIT_DIFF_INCLUDE_TYPECHANGE")
        case GIT_DIFF_INCLUDE_TYPECHANGE_TREES =>
          Some("GIT_DIFF_INCLUDE_TYPECHANGE_TREES")
        case GIT_DIFF_IGNORE_FILEMODE    => Some("GIT_DIFF_IGNORE_FILEMODE")
        case GIT_DIFF_IGNORE_SUBMODULES  => Some("GIT_DIFF_IGNORE_SUBMODULES")
        case GIT_DIFF_IGNORE_CASE        => Some("GIT_DIFF_IGNORE_CASE")
        case GIT_DIFF_INCLUDE_CASECHANGE => Some("GIT_DIFF_INCLUDE_CASECHANGE")
        case GIT_DIFF_DISABLE_PATHSPEC_MATCH =>
          Some("GIT_DIFF_DISABLE_PATHSPEC_MATCH")
        case GIT_DIFF_SKIP_BINARY_CHECK => Some("GIT_DIFF_SKIP_BINARY_CHECK")
        case GIT_DIFF_ENABLE_FAST_UNTRACKED_DIRS =>
          Some("GIT_DIFF_ENABLE_FAST_UNTRACKED_DIRS")
        case GIT_DIFF_UPDATE_INDEX       => Some("GIT_DIFF_UPDATE_INDEX")
        case GIT_DIFF_INCLUDE_UNREADABLE => Some("GIT_DIFF_INCLUDE_UNREADABLE")
        case GIT_DIFF_INCLUDE_UNREADABLE_AS_UNTRACKED =>
          Some("GIT_DIFF_INCLUDE_UNREADABLE_AS_UNTRACKED")
        case GIT_DIFF_INDENT_HEURISTIC   => Some("GIT_DIFF_INDENT_HEURISTIC")
        case GIT_DIFF_IGNORE_BLANK_LINES => Some("GIT_DIFF_IGNORE_BLANK_LINES")
        case GIT_DIFF_FORCE_TEXT         => Some("GIT_DIFF_FORCE_TEXT")
        case GIT_DIFF_FORCE_BINARY       => Some("GIT_DIFF_FORCE_BINARY")
        case GIT_DIFF_IGNORE_WHITESPACE  => Some("GIT_DIFF_IGNORE_WHITESPACE")
        case GIT_DIFF_IGNORE_WHITESPACE_CHANGE =>
          Some("GIT_DIFF_IGNORE_WHITESPACE_CHANGE")
        case GIT_DIFF_IGNORE_WHITESPACE_EOL =>
          Some("GIT_DIFF_IGNORE_WHITESPACE_EOL")
        case GIT_DIFF_SHOW_UNTRACKED_CONTENT =>
          Some("GIT_DIFF_SHOW_UNTRACKED_CONTENT")
        case GIT_DIFF_SHOW_UNMODIFIED => Some("GIT_DIFF_SHOW_UNMODIFIED")
        case GIT_DIFF_PATIENCE        => Some("GIT_DIFF_PATIENCE")
        case GIT_DIFF_MINIMAL         => Some("GIT_DIFF_MINIMAL")
        case GIT_DIFF_SHOW_BINARY     => Some("GIT_DIFF_SHOW_BINARY")
        case _                        => None
    extension (a: git_diff_option_t)
      inline def &(b: git_diff_option_t): git_diff_option_t = a & b
      inline def |(b: git_diff_option_t): git_diff_option_t = a | b
      inline def is(b: git_diff_option_t): Boolean = (a & b) == b
  end git_diff_option_t

  /** Formatting options for diff stats
    */
  opaque type git_diff_stats_format_t = CUnsignedInt
  object git_diff_stats_format_t extends CEnumU[git_diff_stats_format_t]:
    given _tag: Tag[git_diff_stats_format_t] = Tag.UInt
    inline def define(inline a: Long): git_diff_stats_format_t = a.toUInt
    val GIT_DIFF_STATS_NONE = define(0)
    val GIT_DIFF_STATS_FULL = define(1)
    val GIT_DIFF_STATS_SHORT = define(2)
    val GIT_DIFF_STATS_NUMBER = define(4)
    val GIT_DIFF_STATS_INCLUDE_SUMMARY = define(8)
    inline def getName(inline value: git_diff_stats_format_t): Option[String] =
      inline value match
        case GIT_DIFF_STATS_NONE   => Some("GIT_DIFF_STATS_NONE")
        case GIT_DIFF_STATS_FULL   => Some("GIT_DIFF_STATS_FULL")
        case GIT_DIFF_STATS_SHORT  => Some("GIT_DIFF_STATS_SHORT")
        case GIT_DIFF_STATS_NUMBER => Some("GIT_DIFF_STATS_NUMBER")
        case GIT_DIFF_STATS_INCLUDE_SUMMARY =>
          Some("GIT_DIFF_STATS_INCLUDE_SUMMARY")
        case _ => None
    extension (a: git_diff_stats_format_t)
      inline def &(b: git_diff_stats_format_t): git_diff_stats_format_t = a & b
      inline def |(b: git_diff_stats_format_t): git_diff_stats_format_t = a | b
      inline def is(b: git_diff_stats_format_t): Boolean = (a & b) == b
  end git_diff_stats_format_t

  /** Direction of the connection.
    */
  opaque type git_direction = CUnsignedInt
  object git_direction extends CEnumU[git_direction]:
    given _tag: Tag[git_direction] = Tag.UInt
    inline def define(inline a: Long): git_direction = a.toUInt
    val GIT_DIRECTION_FETCH = define(0)
    val GIT_DIRECTION_PUSH = define(1)
    inline def getName(inline value: git_direction): Option[String] =
      inline value match
        case GIT_DIRECTION_FETCH => Some("GIT_DIRECTION_FETCH")
        case GIT_DIRECTION_PUSH  => Some("GIT_DIRECTION_PUSH")
        case _                   => None
    extension (a: git_direction)
      inline def &(b: git_direction): git_direction = a & b
      inline def |(b: git_direction): git_direction = a | b
      inline def is(b: git_direction): Boolean = (a & b) == b
  end git_direction

  /** Formatting options for diff e-mail generation
    */
  opaque type git_email_create_flags_t = CUnsignedInt
  object git_email_create_flags_t extends CEnumU[git_email_create_flags_t]:
    given _tag: Tag[git_email_create_flags_t] = Tag.UInt
    inline def define(inline a: Long): git_email_create_flags_t = a.toUInt
    val GIT_EMAIL_CREATE_DEFAULT = define(0)
    val GIT_EMAIL_CREATE_OMIT_NUMBERS = define(1)
    val GIT_EMAIL_CREATE_ALWAYS_NUMBER = define(2)
    val GIT_EMAIL_CREATE_NO_RENAMES = define(4)
    inline def getName(inline value: git_email_create_flags_t): Option[String] =
      inline value match
        case GIT_EMAIL_CREATE_DEFAULT => Some("GIT_EMAIL_CREATE_DEFAULT")
        case GIT_EMAIL_CREATE_OMIT_NUMBERS =>
          Some("GIT_EMAIL_CREATE_OMIT_NUMBERS")
        case GIT_EMAIL_CREATE_ALWAYS_NUMBER =>
          Some("GIT_EMAIL_CREATE_ALWAYS_NUMBER")
        case GIT_EMAIL_CREATE_NO_RENAMES => Some("GIT_EMAIL_CREATE_NO_RENAMES")
        case _                           => None
    extension (a: git_email_create_flags_t)
      inline def &(b: git_email_create_flags_t): git_email_create_flags_t =
        a & b
      inline def |(b: git_email_create_flags_t): git_email_create_flags_t =
        a | b
      inline def is(b: git_email_create_flags_t): Boolean = (a & b) == b
  end git_email_create_flags_t

  /** Generic return codes
    */
  opaque type git_error_code = CInt
  object git_error_code extends CEnum[git_error_code]:
    given _tag: Tag[git_error_code] = Tag.Int
    inline def define(inline a: CInt): git_error_code = a
    val GIT_OK = define(0)
    val GIT_ERROR = define(-1)
    val GIT_ENOTFOUND = define(-3)
    val GIT_EEXISTS = define(-4)
    val GIT_EAMBIGUOUS = define(-5)
    val GIT_EBUFS = define(-6)
    val GIT_EUSER = define(-7)
    val GIT_EBAREREPO = define(-8)
    val GIT_EUNBORNBRANCH = define(-9)
    val GIT_EUNMERGED = define(-10)
    val GIT_ENONFASTFORWARD = define(-11)
    val GIT_EINVALIDSPEC = define(-12)
    val GIT_ECONFLICT = define(-13)
    val GIT_ELOCKED = define(-14)
    val GIT_EMODIFIED = define(-15)
    val GIT_EAUTH = define(-16)
    val GIT_ECERTIFICATE = define(-17)
    val GIT_EAPPLIED = define(-18)
    val GIT_EPEEL = define(-19)
    val GIT_EEOF = define(-20)
    val GIT_EINVALID = define(-21)
    val GIT_EUNCOMMITTED = define(-22)
    val GIT_EDIRECTORY = define(-23)
    val GIT_EMERGECONFLICT = define(-24)
    val GIT_PASSTHROUGH = define(-30)
    val GIT_ITEROVER = define(-31)
    val GIT_RETRY = define(-32)
    val GIT_EMISMATCH = define(-33)
    val GIT_EINDEXDIRTY = define(-34)
    val GIT_EAPPLYFAIL = define(-35)
    val GIT_EOWNER = define(-36)
    inline def getName(inline value: git_error_code): Option[String] =
      inline value match
        case GIT_OK              => Some("GIT_OK")
        case GIT_ERROR           => Some("GIT_ERROR")
        case GIT_ENOTFOUND       => Some("GIT_ENOTFOUND")
        case GIT_EEXISTS         => Some("GIT_EEXISTS")
        case GIT_EAMBIGUOUS      => Some("GIT_EAMBIGUOUS")
        case GIT_EBUFS           => Some("GIT_EBUFS")
        case GIT_EUSER           => Some("GIT_EUSER")
        case GIT_EBAREREPO       => Some("GIT_EBAREREPO")
        case GIT_EUNBORNBRANCH   => Some("GIT_EUNBORNBRANCH")
        case GIT_EUNMERGED       => Some("GIT_EUNMERGED")
        case GIT_ENONFASTFORWARD => Some("GIT_ENONFASTFORWARD")
        case GIT_EINVALIDSPEC    => Some("GIT_EINVALIDSPEC")
        case GIT_ECONFLICT       => Some("GIT_ECONFLICT")
        case GIT_ELOCKED         => Some("GIT_ELOCKED")
        case GIT_EMODIFIED       => Some("GIT_EMODIFIED")
        case GIT_EAUTH           => Some("GIT_EAUTH")
        case GIT_ECERTIFICATE    => Some("GIT_ECERTIFICATE")
        case GIT_EAPPLIED        => Some("GIT_EAPPLIED")
        case GIT_EPEEL           => Some("GIT_EPEEL")
        case GIT_EEOF            => Some("GIT_EEOF")
        case GIT_EINVALID        => Some("GIT_EINVALID")
        case GIT_EUNCOMMITTED    => Some("GIT_EUNCOMMITTED")
        case GIT_EDIRECTORY      => Some("GIT_EDIRECTORY")
        case GIT_EMERGECONFLICT  => Some("GIT_EMERGECONFLICT")
        case GIT_PASSTHROUGH     => Some("GIT_PASSTHROUGH")
        case GIT_ITEROVER        => Some("GIT_ITEROVER")
        case GIT_RETRY           => Some("GIT_RETRY")
        case GIT_EMISMATCH       => Some("GIT_EMISMATCH")
        case GIT_EINDEXDIRTY     => Some("GIT_EINDEXDIRTY")
        case GIT_EAPPLYFAIL      => Some("GIT_EAPPLYFAIL")
        case GIT_EOWNER          => Some("GIT_EOWNER")
        case _                   => None
    extension (a: git_error_code)
      inline def &(b: git_error_code): git_error_code = a & b
      inline def |(b: git_error_code): git_error_code = a | b
      inline def is(b: git_error_code): Boolean = (a & b) == b
  end git_error_code

  /** Error classes
    */
  opaque type git_error_t = CUnsignedInt
  object git_error_t extends CEnumU[git_error_t]:
    given _tag: Tag[git_error_t] = Tag.UInt
    inline def define(inline a: Long): git_error_t = a.toUInt
    val GIT_ERROR_NONE = define(0)
    val GIT_ERROR_NOMEMORY = define(1)
    val GIT_ERROR_OS = define(2)
    val GIT_ERROR_INVALID = define(3)
    val GIT_ERROR_REFERENCE = define(4)
    val GIT_ERROR_ZLIB = define(5)
    val GIT_ERROR_REPOSITORY = define(6)
    val GIT_ERROR_CONFIG = define(7)
    val GIT_ERROR_REGEX = define(8)
    val GIT_ERROR_ODB = define(9)
    val GIT_ERROR_INDEX = define(10)
    val GIT_ERROR_OBJECT = define(11)
    val GIT_ERROR_NET = define(12)
    val GIT_ERROR_TAG = define(13)
    val GIT_ERROR_TREE = define(14)
    val GIT_ERROR_INDEXER = define(15)
    val GIT_ERROR_SSL = define(16)
    val GIT_ERROR_SUBMODULE = define(17)
    val GIT_ERROR_THREAD = define(18)
    val GIT_ERROR_STASH = define(19)
    val GIT_ERROR_CHECKOUT = define(20)
    val GIT_ERROR_FETCHHEAD = define(21)
    val GIT_ERROR_MERGE = define(22)
    val GIT_ERROR_SSH = define(23)
    val GIT_ERROR_FILTER = define(24)
    val GIT_ERROR_REVERT = define(25)
    val GIT_ERROR_CALLBACK = define(26)
    val GIT_ERROR_CHERRYPICK = define(27)
    val GIT_ERROR_DESCRIBE = define(28)
    val GIT_ERROR_REBASE = define(29)
    val GIT_ERROR_FILESYSTEM = define(30)
    val GIT_ERROR_PATCH = define(31)
    val GIT_ERROR_WORKTREE = define(32)
    val GIT_ERROR_SHA = define(33)
    val GIT_ERROR_HTTP = define(34)
    val GIT_ERROR_INTERNAL = define(35)
    inline def getName(inline value: git_error_t): Option[String] =
      inline value match
        case GIT_ERROR_NONE       => Some("GIT_ERROR_NONE")
        case GIT_ERROR_NOMEMORY   => Some("GIT_ERROR_NOMEMORY")
        case GIT_ERROR_OS         => Some("GIT_ERROR_OS")
        case GIT_ERROR_INVALID    => Some("GIT_ERROR_INVALID")
        case GIT_ERROR_REFERENCE  => Some("GIT_ERROR_REFERENCE")
        case GIT_ERROR_ZLIB       => Some("GIT_ERROR_ZLIB")
        case GIT_ERROR_REPOSITORY => Some("GIT_ERROR_REPOSITORY")
        case GIT_ERROR_CONFIG     => Some("GIT_ERROR_CONFIG")
        case GIT_ERROR_REGEX      => Some("GIT_ERROR_REGEX")
        case GIT_ERROR_ODB        => Some("GIT_ERROR_ODB")
        case GIT_ERROR_INDEX      => Some("GIT_ERROR_INDEX")
        case GIT_ERROR_OBJECT     => Some("GIT_ERROR_OBJECT")
        case GIT_ERROR_NET        => Some("GIT_ERROR_NET")
        case GIT_ERROR_TAG        => Some("GIT_ERROR_TAG")
        case GIT_ERROR_TREE       => Some("GIT_ERROR_TREE")
        case GIT_ERROR_INDEXER    => Some("GIT_ERROR_INDEXER")
        case GIT_ERROR_SSL        => Some("GIT_ERROR_SSL")
        case GIT_ERROR_SUBMODULE  => Some("GIT_ERROR_SUBMODULE")
        case GIT_ERROR_THREAD     => Some("GIT_ERROR_THREAD")
        case GIT_ERROR_STASH      => Some("GIT_ERROR_STASH")
        case GIT_ERROR_CHECKOUT   => Some("GIT_ERROR_CHECKOUT")
        case GIT_ERROR_FETCHHEAD  => Some("GIT_ERROR_FETCHHEAD")
        case GIT_ERROR_MERGE      => Some("GIT_ERROR_MERGE")
        case GIT_ERROR_SSH        => Some("GIT_ERROR_SSH")
        case GIT_ERROR_FILTER     => Some("GIT_ERROR_FILTER")
        case GIT_ERROR_REVERT     => Some("GIT_ERROR_REVERT")
        case GIT_ERROR_CALLBACK   => Some("GIT_ERROR_CALLBACK")
        case GIT_ERROR_CHERRYPICK => Some("GIT_ERROR_CHERRYPICK")
        case GIT_ERROR_DESCRIBE   => Some("GIT_ERROR_DESCRIBE")
        case GIT_ERROR_REBASE     => Some("GIT_ERROR_REBASE")
        case GIT_ERROR_FILESYSTEM => Some("GIT_ERROR_FILESYSTEM")
        case GIT_ERROR_PATCH      => Some("GIT_ERROR_PATCH")
        case GIT_ERROR_WORKTREE   => Some("GIT_ERROR_WORKTREE")
        case GIT_ERROR_SHA        => Some("GIT_ERROR_SHA")
        case GIT_ERROR_HTTP       => Some("GIT_ERROR_HTTP")
        case GIT_ERROR_INTERNAL   => Some("GIT_ERROR_INTERNAL")
        case _                    => None
    extension (a: git_error_t)
      inline def &(b: git_error_t): git_error_t = a & b
      inline def |(b: git_error_t): git_error_t = a | b
      inline def is(b: git_error_t): Boolean = (a & b) == b
  end git_error_t

  /** Combinations of these values describe the features with which libgit2 was
    * compiled
    */
  opaque type git_feature_t = CUnsignedInt
  object git_feature_t extends CEnumU[git_feature_t]:
    given _tag: Tag[git_feature_t] = Tag.UInt
    inline def define(inline a: Long): git_feature_t = a.toUInt
    val GIT_FEATURE_THREADS = define(1)
    val GIT_FEATURE_HTTPS = define(2)
    val GIT_FEATURE_SSH = define(4)
    val GIT_FEATURE_NSEC = define(8)
    inline def getName(inline value: git_feature_t): Option[String] =
      inline value match
        case GIT_FEATURE_THREADS => Some("GIT_FEATURE_THREADS")
        case GIT_FEATURE_HTTPS   => Some("GIT_FEATURE_HTTPS")
        case GIT_FEATURE_SSH     => Some("GIT_FEATURE_SSH")
        case GIT_FEATURE_NSEC    => Some("GIT_FEATURE_NSEC")
        case _                   => None
    extension (a: git_feature_t)
      inline def &(b: git_feature_t): git_feature_t = a & b
      inline def |(b: git_feature_t): git_feature_t = a | b
      inline def is(b: git_feature_t): Boolean = (a & b) == b
  end git_feature_t

  /** Acceptable prune settings when fetching
    */
  opaque type git_fetch_prune_t = CUnsignedInt
  object git_fetch_prune_t extends CEnumU[git_fetch_prune_t]:
    given _tag: Tag[git_fetch_prune_t] = Tag.UInt
    inline def define(inline a: Long): git_fetch_prune_t = a.toUInt
    val GIT_FETCH_PRUNE_UNSPECIFIED = define(0)
    val GIT_FETCH_PRUNE = define(1)
    val GIT_FETCH_NO_PRUNE = define(2)
    inline def getName(inline value: git_fetch_prune_t): Option[String] =
      inline value match
        case GIT_FETCH_PRUNE_UNSPECIFIED => Some("GIT_FETCH_PRUNE_UNSPECIFIED")
        case GIT_FETCH_PRUNE             => Some("GIT_FETCH_PRUNE")
        case GIT_FETCH_NO_PRUNE          => Some("GIT_FETCH_NO_PRUNE")
        case _                           => None
    extension (a: git_fetch_prune_t)
      inline def &(b: git_fetch_prune_t): git_fetch_prune_t = a & b
      inline def |(b: git_fetch_prune_t): git_fetch_prune_t = a | b
      inline def is(b: git_fetch_prune_t): Boolean = (a & b) == b
  end git_fetch_prune_t

  /** Valid modes for index and tree entries.
    */
  opaque type git_filemode_t = CUnsignedInt
  object git_filemode_t extends CEnumU[git_filemode_t]:
    given _tag: Tag[git_filemode_t] = Tag.UInt
    inline def define(inline a: Long): git_filemode_t = a.toUInt
    val GIT_FILEMODE_UNREADABLE = define(0)
    val GIT_FILEMODE_TREE = define(16384)
    val GIT_FILEMODE_BLOB = define(33188)
    val GIT_FILEMODE_BLOB_EXECUTABLE = define(33261)
    val GIT_FILEMODE_LINK = define(40960)
    val GIT_FILEMODE_COMMIT = define(57344)
    inline def getName(inline value: git_filemode_t): Option[String] =
      inline value match
        case GIT_FILEMODE_UNREADABLE => Some("GIT_FILEMODE_UNREADABLE")
        case GIT_FILEMODE_TREE       => Some("GIT_FILEMODE_TREE")
        case GIT_FILEMODE_BLOB       => Some("GIT_FILEMODE_BLOB")
        case GIT_FILEMODE_BLOB_EXECUTABLE =>
          Some("GIT_FILEMODE_BLOB_EXECUTABLE")
        case GIT_FILEMODE_LINK   => Some("GIT_FILEMODE_LINK")
        case GIT_FILEMODE_COMMIT => Some("GIT_FILEMODE_COMMIT")
        case _                   => None
    extension (a: git_filemode_t)
      inline def &(b: git_filemode_t): git_filemode_t = a & b
      inline def |(b: git_filemode_t): git_filemode_t = a | b
      inline def is(b: git_filemode_t): Boolean = (a & b) == b
  end git_filemode_t

  /** Filter option flags.
    */
  opaque type git_filter_flag_t = CUnsignedInt
  object git_filter_flag_t extends CEnumU[git_filter_flag_t]:
    given _tag: Tag[git_filter_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_filter_flag_t = a.toUInt
    val GIT_FILTER_DEFAULT = define(0)
    val GIT_FILTER_ALLOW_UNSAFE = define(1)
    val GIT_FILTER_NO_SYSTEM_ATTRIBUTES = define(2)
    val GIT_FILTER_ATTRIBUTES_FROM_HEAD = define(4)
    val GIT_FILTER_ATTRIBUTES_FROM_COMMIT = define(8)
    inline def getName(inline value: git_filter_flag_t): Option[String] =
      inline value match
        case GIT_FILTER_DEFAULT      => Some("GIT_FILTER_DEFAULT")
        case GIT_FILTER_ALLOW_UNSAFE => Some("GIT_FILTER_ALLOW_UNSAFE")
        case GIT_FILTER_NO_SYSTEM_ATTRIBUTES =>
          Some("GIT_FILTER_NO_SYSTEM_ATTRIBUTES")
        case GIT_FILTER_ATTRIBUTES_FROM_HEAD =>
          Some("GIT_FILTER_ATTRIBUTES_FROM_HEAD")
        case GIT_FILTER_ATTRIBUTES_FROM_COMMIT =>
          Some("GIT_FILTER_ATTRIBUTES_FROM_COMMIT")
        case _ => None
    extension (a: git_filter_flag_t)
      inline def &(b: git_filter_flag_t): git_filter_flag_t = a & b
      inline def |(b: git_filter_flag_t): git_filter_flag_t = a | b
      inline def is(b: git_filter_flag_t): Boolean = (a & b) == b
  end git_filter_flag_t

  /** Filters are applied in one of two directions: smudging - which is
    * exporting a file from the Git object database to the working directory,
    * and cleaning - which is importing a file from the working directory to the
    * Git object database. These values control which direction of change is
    * being applied.
    */
  opaque type git_filter_mode_t = CUnsignedInt
  object git_filter_mode_t extends CEnumU[git_filter_mode_t]:
    given _tag: Tag[git_filter_mode_t] = Tag.UInt
    inline def define(inline a: Long): git_filter_mode_t = a.toUInt
    val GIT_FILTER_TO_WORKTREE = define(0)
    val GIT_FILTER_SMUDGE = define(0)
    val GIT_FILTER_TO_ODB = define(1)
    val GIT_FILTER_CLEAN = define(1)
    inline def getName(inline value: git_filter_mode_t): Option[String] =
      inline value match
        case GIT_FILTER_TO_WORKTREE => Some("GIT_FILTER_TO_WORKTREE")
        case GIT_FILTER_SMUDGE      => Some("GIT_FILTER_SMUDGE")
        case GIT_FILTER_TO_ODB      => Some("GIT_FILTER_TO_ODB")
        case GIT_FILTER_CLEAN       => Some("GIT_FILTER_CLEAN")
        case _                      => None
    extension (a: git_filter_mode_t)
      inline def &(b: git_filter_mode_t): git_filter_mode_t = a & b
      inline def |(b: git_filter_mode_t): git_filter_mode_t = a | b
      inline def is(b: git_filter_mode_t): Boolean = (a & b) == b
  end git_filter_mode_t

  /** Flags for APIs that add files matching pathspec
    */
  opaque type git_index_add_option_t = CUnsignedInt
  object git_index_add_option_t extends CEnumU[git_index_add_option_t]:
    given _tag: Tag[git_index_add_option_t] = Tag.UInt
    inline def define(inline a: Long): git_index_add_option_t = a.toUInt
    val GIT_INDEX_ADD_DEFAULT = define(0)
    val GIT_INDEX_ADD_FORCE = define(1)
    val GIT_INDEX_ADD_DISABLE_PATHSPEC_MATCH = define(2)
    val GIT_INDEX_ADD_CHECK_PATHSPEC = define(4)
    inline def getName(inline value: git_index_add_option_t): Option[String] =
      inline value match
        case GIT_INDEX_ADD_DEFAULT => Some("GIT_INDEX_ADD_DEFAULT")
        case GIT_INDEX_ADD_FORCE   => Some("GIT_INDEX_ADD_FORCE")
        case GIT_INDEX_ADD_DISABLE_PATHSPEC_MATCH =>
          Some("GIT_INDEX_ADD_DISABLE_PATHSPEC_MATCH")
        case GIT_INDEX_ADD_CHECK_PATHSPEC =>
          Some("GIT_INDEX_ADD_CHECK_PATHSPEC")
        case _ => None
    extension (a: git_index_add_option_t)
      inline def &(b: git_index_add_option_t): git_index_add_option_t = a & b
      inline def |(b: git_index_add_option_t): git_index_add_option_t = a | b
      inline def is(b: git_index_add_option_t): Boolean = (a & b) == b
  end git_index_add_option_t

  /** Capabilities of system that affect index actions.
    */
  opaque type git_index_capability_t = CInt
  object git_index_capability_t extends CEnum[git_index_capability_t]:
    given _tag: Tag[git_index_capability_t] = Tag.Int
    inline def define(inline a: CInt): git_index_capability_t = a
    val GIT_INDEX_CAPABILITY_IGNORE_CASE = define(1)
    val GIT_INDEX_CAPABILITY_NO_FILEMODE = define(2)
    val GIT_INDEX_CAPABILITY_NO_SYMLINKS = define(4)
    val GIT_INDEX_CAPABILITY_FROM_OWNER = define(-1)
    inline def getName(inline value: git_index_capability_t): Option[String] =
      inline value match
        case GIT_INDEX_CAPABILITY_IGNORE_CASE =>
          Some("GIT_INDEX_CAPABILITY_IGNORE_CASE")
        case GIT_INDEX_CAPABILITY_NO_FILEMODE =>
          Some("GIT_INDEX_CAPABILITY_NO_FILEMODE")
        case GIT_INDEX_CAPABILITY_NO_SYMLINKS =>
          Some("GIT_INDEX_CAPABILITY_NO_SYMLINKS")
        case GIT_INDEX_CAPABILITY_FROM_OWNER =>
          Some("GIT_INDEX_CAPABILITY_FROM_OWNER")
        case _ => None
    extension (a: git_index_capability_t)
      inline def &(b: git_index_capability_t): git_index_capability_t = a & b
      inline def |(b: git_index_capability_t): git_index_capability_t = a | b
      inline def is(b: git_index_capability_t): Boolean = (a & b) == b
  end git_index_capability_t

  /** Bitmasks for on-disk fields of `git_index_entry`'s `flags_extended`
    */
  opaque type git_index_entry_extended_flag_t = CUnsignedInt
  object git_index_entry_extended_flag_t
      extends CEnumU[git_index_entry_extended_flag_t]:
    given _tag: Tag[git_index_entry_extended_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_index_entry_extended_flag_t =
      a.toUInt
    val GIT_INDEX_ENTRY_INTENT_TO_ADD = define(8192)
    val GIT_INDEX_ENTRY_SKIP_WORKTREE = define(16384)
    val GIT_INDEX_ENTRY_EXTENDED_FLAGS = define(24576)
    val GIT_INDEX_ENTRY_UPTODATE = define(4)
    inline def getName(
        inline value: git_index_entry_extended_flag_t
    ): Option[String] =
      inline value match
        case GIT_INDEX_ENTRY_INTENT_TO_ADD =>
          Some("GIT_INDEX_ENTRY_INTENT_TO_ADD")
        case GIT_INDEX_ENTRY_SKIP_WORKTREE =>
          Some("GIT_INDEX_ENTRY_SKIP_WORKTREE")
        case GIT_INDEX_ENTRY_EXTENDED_FLAGS =>
          Some("GIT_INDEX_ENTRY_EXTENDED_FLAGS")
        case GIT_INDEX_ENTRY_UPTODATE => Some("GIT_INDEX_ENTRY_UPTODATE")
        case _                        => None
    extension (a: git_index_entry_extended_flag_t)
      inline def &(
          b: git_index_entry_extended_flag_t
      ): git_index_entry_extended_flag_t = a & b
      inline def |(
          b: git_index_entry_extended_flag_t
      ): git_index_entry_extended_flag_t = a | b
      inline def is(b: git_index_entry_extended_flag_t): Boolean = (a & b) == b
  end git_index_entry_extended_flag_t

  /** Flags for index entries
    */
  opaque type git_index_entry_flag_t = CUnsignedInt
  object git_index_entry_flag_t extends CEnumU[git_index_entry_flag_t]:
    given _tag: Tag[git_index_entry_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_index_entry_flag_t = a.toUInt
    val GIT_INDEX_ENTRY_EXTENDED = define(16384)
    val GIT_INDEX_ENTRY_VALID = define(32768)
    inline def getName(inline value: git_index_entry_flag_t): Option[String] =
      inline value match
        case GIT_INDEX_ENTRY_EXTENDED => Some("GIT_INDEX_ENTRY_EXTENDED")
        case GIT_INDEX_ENTRY_VALID    => Some("GIT_INDEX_ENTRY_VALID")
        case _                        => None
    extension (a: git_index_entry_flag_t)
      inline def &(b: git_index_entry_flag_t): git_index_entry_flag_t = a & b
      inline def |(b: git_index_entry_flag_t): git_index_entry_flag_t = a | b
      inline def is(b: git_index_entry_flag_t): Boolean = (a & b) == b
  end git_index_entry_flag_t

  /** Git index stage states
    */
  opaque type git_index_stage_t = CInt
  object git_index_stage_t extends CEnum[git_index_stage_t]:
    given _tag: Tag[git_index_stage_t] = Tag.Int
    inline def define(inline a: CInt): git_index_stage_t = a
    val GIT_INDEX_STAGE_ANY = define(-1)
    val GIT_INDEX_STAGE_NORMAL = define(0)
    val GIT_INDEX_STAGE_ANCESTOR = define(1)
    val GIT_INDEX_STAGE_OURS = define(2)
    val GIT_INDEX_STAGE_THEIRS = define(3)
    inline def getName(inline value: git_index_stage_t): Option[String] =
      inline value match
        case GIT_INDEX_STAGE_ANY      => Some("GIT_INDEX_STAGE_ANY")
        case GIT_INDEX_STAGE_NORMAL   => Some("GIT_INDEX_STAGE_NORMAL")
        case GIT_INDEX_STAGE_ANCESTOR => Some("GIT_INDEX_STAGE_ANCESTOR")
        case GIT_INDEX_STAGE_OURS     => Some("GIT_INDEX_STAGE_OURS")
        case GIT_INDEX_STAGE_THEIRS   => Some("GIT_INDEX_STAGE_THEIRS")
        case _                        => None
    extension (a: git_index_stage_t)
      inline def &(b: git_index_stage_t): git_index_stage_t = a & b
      inline def |(b: git_index_stage_t): git_index_stage_t = a | b
      inline def is(b: git_index_stage_t): Boolean = (a & b) == b
  end git_index_stage_t

  /** Global library options
    */
  opaque type git_libgit2_opt_t = CUnsignedInt
  object git_libgit2_opt_t extends CEnumU[git_libgit2_opt_t]:
    given _tag: Tag[git_libgit2_opt_t] = Tag.UInt
    inline def define(inline a: Long): git_libgit2_opt_t = a.toUInt
    val GIT_OPT_GET_MWINDOW_SIZE = define(0)
    val GIT_OPT_SET_MWINDOW_SIZE = define(1)
    val GIT_OPT_GET_MWINDOW_MAPPED_LIMIT = define(2)
    val GIT_OPT_SET_MWINDOW_MAPPED_LIMIT = define(3)
    val GIT_OPT_GET_SEARCH_PATH = define(4)
    val GIT_OPT_SET_SEARCH_PATH = define(5)
    val GIT_OPT_SET_CACHE_OBJECT_LIMIT = define(6)
    val GIT_OPT_SET_CACHE_MAX_SIZE = define(7)
    val GIT_OPT_ENABLE_CACHING = define(8)
    val GIT_OPT_GET_CACHED_MEMORY = define(9)
    val GIT_OPT_GET_TEMPLATE_PATH = define(10)
    val GIT_OPT_SET_TEMPLATE_PATH = define(11)
    val GIT_OPT_SET_SSL_CERT_LOCATIONS = define(12)
    val GIT_OPT_SET_USER_AGENT = define(13)
    val GIT_OPT_ENABLE_STRICT_OBJECT_CREATION = define(14)
    val GIT_OPT_ENABLE_STRICT_SYMBOLIC_REF_CREATION = define(15)
    val GIT_OPT_SET_SSL_CIPHERS = define(16)
    val GIT_OPT_GET_USER_AGENT = define(17)
    val GIT_OPT_ENABLE_OFS_DELTA = define(18)
    val GIT_OPT_ENABLE_FSYNC_GITDIR = define(19)
    val GIT_OPT_GET_WINDOWS_SHAREMODE = define(20)
    val GIT_OPT_SET_WINDOWS_SHAREMODE = define(21)
    val GIT_OPT_ENABLE_STRICT_HASH_VERIFICATION = define(22)
    val GIT_OPT_SET_ALLOCATOR = define(23)
    val GIT_OPT_ENABLE_UNSAVED_INDEX_SAFETY = define(24)
    val GIT_OPT_GET_PACK_MAX_OBJECTS = define(25)
    val GIT_OPT_SET_PACK_MAX_OBJECTS = define(26)
    val GIT_OPT_DISABLE_PACK_KEEP_FILE_CHECKS = define(27)
    val GIT_OPT_ENABLE_HTTP_EXPECT_CONTINUE = define(28)
    val GIT_OPT_GET_MWINDOW_FILE_LIMIT = define(29)
    val GIT_OPT_SET_MWINDOW_FILE_LIMIT = define(30)
    val GIT_OPT_SET_ODB_PACKED_PRIORITY = define(31)
    val GIT_OPT_SET_ODB_LOOSE_PRIORITY = define(32)
    val GIT_OPT_GET_EXTENSIONS = define(33)
    val GIT_OPT_SET_EXTENSIONS = define(34)
    val GIT_OPT_GET_OWNER_VALIDATION = define(35)
    val GIT_OPT_SET_OWNER_VALIDATION = define(36)
    val GIT_OPT_GET_HOMEDIR = define(37)
    val GIT_OPT_SET_HOMEDIR = define(38)
    inline def getName(inline value: git_libgit2_opt_t): Option[String] =
      inline value match
        case GIT_OPT_GET_MWINDOW_SIZE => Some("GIT_OPT_GET_MWINDOW_SIZE")
        case GIT_OPT_SET_MWINDOW_SIZE => Some("GIT_OPT_SET_MWINDOW_SIZE")
        case GIT_OPT_GET_MWINDOW_MAPPED_LIMIT =>
          Some("GIT_OPT_GET_MWINDOW_MAPPED_LIMIT")
        case GIT_OPT_SET_MWINDOW_MAPPED_LIMIT =>
          Some("GIT_OPT_SET_MWINDOW_MAPPED_LIMIT")
        case GIT_OPT_GET_SEARCH_PATH => Some("GIT_OPT_GET_SEARCH_PATH")
        case GIT_OPT_SET_SEARCH_PATH => Some("GIT_OPT_SET_SEARCH_PATH")
        case GIT_OPT_SET_CACHE_OBJECT_LIMIT =>
          Some("GIT_OPT_SET_CACHE_OBJECT_LIMIT")
        case GIT_OPT_SET_CACHE_MAX_SIZE => Some("GIT_OPT_SET_CACHE_MAX_SIZE")
        case GIT_OPT_ENABLE_CACHING     => Some("GIT_OPT_ENABLE_CACHING")
        case GIT_OPT_GET_CACHED_MEMORY  => Some("GIT_OPT_GET_CACHED_MEMORY")
        case GIT_OPT_GET_TEMPLATE_PATH  => Some("GIT_OPT_GET_TEMPLATE_PATH")
        case GIT_OPT_SET_TEMPLATE_PATH  => Some("GIT_OPT_SET_TEMPLATE_PATH")
        case GIT_OPT_SET_SSL_CERT_LOCATIONS =>
          Some("GIT_OPT_SET_SSL_CERT_LOCATIONS")
        case GIT_OPT_SET_USER_AGENT => Some("GIT_OPT_SET_USER_AGENT")
        case GIT_OPT_ENABLE_STRICT_OBJECT_CREATION =>
          Some("GIT_OPT_ENABLE_STRICT_OBJECT_CREATION")
        case GIT_OPT_ENABLE_STRICT_SYMBOLIC_REF_CREATION =>
          Some("GIT_OPT_ENABLE_STRICT_SYMBOLIC_REF_CREATION")
        case GIT_OPT_SET_SSL_CIPHERS     => Some("GIT_OPT_SET_SSL_CIPHERS")
        case GIT_OPT_GET_USER_AGENT      => Some("GIT_OPT_GET_USER_AGENT")
        case GIT_OPT_ENABLE_OFS_DELTA    => Some("GIT_OPT_ENABLE_OFS_DELTA")
        case GIT_OPT_ENABLE_FSYNC_GITDIR => Some("GIT_OPT_ENABLE_FSYNC_GITDIR")
        case GIT_OPT_GET_WINDOWS_SHAREMODE =>
          Some("GIT_OPT_GET_WINDOWS_SHAREMODE")
        case GIT_OPT_SET_WINDOWS_SHAREMODE =>
          Some("GIT_OPT_SET_WINDOWS_SHAREMODE")
        case GIT_OPT_ENABLE_STRICT_HASH_VERIFICATION =>
          Some("GIT_OPT_ENABLE_STRICT_HASH_VERIFICATION")
        case GIT_OPT_SET_ALLOCATOR => Some("GIT_OPT_SET_ALLOCATOR")
        case GIT_OPT_ENABLE_UNSAVED_INDEX_SAFETY =>
          Some("GIT_OPT_ENABLE_UNSAVED_INDEX_SAFETY")
        case GIT_OPT_GET_PACK_MAX_OBJECTS =>
          Some("GIT_OPT_GET_PACK_MAX_OBJECTS")
        case GIT_OPT_SET_PACK_MAX_OBJECTS =>
          Some("GIT_OPT_SET_PACK_MAX_OBJECTS")
        case GIT_OPT_DISABLE_PACK_KEEP_FILE_CHECKS =>
          Some("GIT_OPT_DISABLE_PACK_KEEP_FILE_CHECKS")
        case GIT_OPT_ENABLE_HTTP_EXPECT_CONTINUE =>
          Some("GIT_OPT_ENABLE_HTTP_EXPECT_CONTINUE")
        case GIT_OPT_GET_MWINDOW_FILE_LIMIT =>
          Some("GIT_OPT_GET_MWINDOW_FILE_LIMIT")
        case GIT_OPT_SET_MWINDOW_FILE_LIMIT =>
          Some("GIT_OPT_SET_MWINDOW_FILE_LIMIT")
        case GIT_OPT_SET_ODB_PACKED_PRIORITY =>
          Some("GIT_OPT_SET_ODB_PACKED_PRIORITY")
        case GIT_OPT_SET_ODB_LOOSE_PRIORITY =>
          Some("GIT_OPT_SET_ODB_LOOSE_PRIORITY")
        case GIT_OPT_GET_EXTENSIONS => Some("GIT_OPT_GET_EXTENSIONS")
        case GIT_OPT_SET_EXTENSIONS => Some("GIT_OPT_SET_EXTENSIONS")
        case GIT_OPT_GET_OWNER_VALIDATION =>
          Some("GIT_OPT_GET_OWNER_VALIDATION")
        case GIT_OPT_SET_OWNER_VALIDATION =>
          Some("GIT_OPT_SET_OWNER_VALIDATION")
        case GIT_OPT_GET_HOMEDIR => Some("GIT_OPT_GET_HOMEDIR")
        case GIT_OPT_SET_HOMEDIR => Some("GIT_OPT_SET_HOMEDIR")
        case _                   => None
    extension (a: git_libgit2_opt_t)
      inline def &(b: git_libgit2_opt_t): git_libgit2_opt_t = a & b
      inline def |(b: git_libgit2_opt_t): git_libgit2_opt_t = a | b
      inline def is(b: git_libgit2_opt_t): Boolean = (a & b) == b
  end git_libgit2_opt_t

  /** The results of `git_merge_analysis` indicate the merge opportunities.
    */
  opaque type git_merge_analysis_t = CUnsignedInt
  object git_merge_analysis_t extends CEnumU[git_merge_analysis_t]:
    given _tag: Tag[git_merge_analysis_t] = Tag.UInt
    inline def define(inline a: Long): git_merge_analysis_t = a.toUInt
    val GIT_MERGE_ANALYSIS_NONE = define(0)
    val GIT_MERGE_ANALYSIS_NORMAL = define(1)
    val GIT_MERGE_ANALYSIS_UP_TO_DATE = define(2)
    val GIT_MERGE_ANALYSIS_FASTFORWARD = define(4)
    val GIT_MERGE_ANALYSIS_UNBORN = define(8)
    inline def getName(inline value: git_merge_analysis_t): Option[String] =
      inline value match
        case GIT_MERGE_ANALYSIS_NONE   => Some("GIT_MERGE_ANALYSIS_NONE")
        case GIT_MERGE_ANALYSIS_NORMAL => Some("GIT_MERGE_ANALYSIS_NORMAL")
        case GIT_MERGE_ANALYSIS_UP_TO_DATE =>
          Some("GIT_MERGE_ANALYSIS_UP_TO_DATE")
        case GIT_MERGE_ANALYSIS_FASTFORWARD =>
          Some("GIT_MERGE_ANALYSIS_FASTFORWARD")
        case GIT_MERGE_ANALYSIS_UNBORN => Some("GIT_MERGE_ANALYSIS_UNBORN")
        case _                         => None
    extension (a: git_merge_analysis_t)
      inline def &(b: git_merge_analysis_t): git_merge_analysis_t = a & b
      inline def |(b: git_merge_analysis_t): git_merge_analysis_t = a | b
      inline def is(b: git_merge_analysis_t): Boolean = (a & b) == b
  end git_merge_analysis_t

  /** Merge file favor options for `git_merge_options` instruct the file-level
    * merging functionality how to deal with conflicting regions of the files.
    */
  opaque type git_merge_file_favor_t = CUnsignedInt
  object git_merge_file_favor_t extends CEnumU[git_merge_file_favor_t]:
    given _tag: Tag[git_merge_file_favor_t] = Tag.UInt
    inline def define(inline a: Long): git_merge_file_favor_t = a.toUInt
    val GIT_MERGE_FILE_FAVOR_NORMAL = define(0)
    val GIT_MERGE_FILE_FAVOR_OURS = define(1)
    val GIT_MERGE_FILE_FAVOR_THEIRS = define(2)
    val GIT_MERGE_FILE_FAVOR_UNION = define(3)
    inline def getName(inline value: git_merge_file_favor_t): Option[String] =
      inline value match
        case GIT_MERGE_FILE_FAVOR_NORMAL => Some("GIT_MERGE_FILE_FAVOR_NORMAL")
        case GIT_MERGE_FILE_FAVOR_OURS   => Some("GIT_MERGE_FILE_FAVOR_OURS")
        case GIT_MERGE_FILE_FAVOR_THEIRS => Some("GIT_MERGE_FILE_FAVOR_THEIRS")
        case GIT_MERGE_FILE_FAVOR_UNION  => Some("GIT_MERGE_FILE_FAVOR_UNION")
        case _                           => None
    extension (a: git_merge_file_favor_t)
      inline def &(b: git_merge_file_favor_t): git_merge_file_favor_t = a & b
      inline def |(b: git_merge_file_favor_t): git_merge_file_favor_t = a | b
      inline def is(b: git_merge_file_favor_t): Boolean = (a & b) == b
  end git_merge_file_favor_t

  /** File merging flags
    */
  opaque type git_merge_file_flag_t = CUnsignedInt
  object git_merge_file_flag_t extends CEnumU[git_merge_file_flag_t]:
    given _tag: Tag[git_merge_file_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_merge_file_flag_t = a.toUInt
    val GIT_MERGE_FILE_DEFAULT = define(0)
    val GIT_MERGE_FILE_STYLE_MERGE = define(1)
    val GIT_MERGE_FILE_STYLE_DIFF3 = define(2)
    val GIT_MERGE_FILE_SIMPLIFY_ALNUM = define(4)
    val GIT_MERGE_FILE_IGNORE_WHITESPACE = define(8)
    val GIT_MERGE_FILE_IGNORE_WHITESPACE_CHANGE = define(16)
    val GIT_MERGE_FILE_IGNORE_WHITESPACE_EOL = define(32)
    val GIT_MERGE_FILE_DIFF_PATIENCE = define(64)
    val GIT_MERGE_FILE_DIFF_MINIMAL = define(128)
    val GIT_MERGE_FILE_STYLE_ZDIFF3 = define(256)
    val GIT_MERGE_FILE_ACCEPT_CONFLICTS = define(512)
    inline def getName(inline value: git_merge_file_flag_t): Option[String] =
      inline value match
        case GIT_MERGE_FILE_DEFAULT     => Some("GIT_MERGE_FILE_DEFAULT")
        case GIT_MERGE_FILE_STYLE_MERGE => Some("GIT_MERGE_FILE_STYLE_MERGE")
        case GIT_MERGE_FILE_STYLE_DIFF3 => Some("GIT_MERGE_FILE_STYLE_DIFF3")
        case GIT_MERGE_FILE_SIMPLIFY_ALNUM =>
          Some("GIT_MERGE_FILE_SIMPLIFY_ALNUM")
        case GIT_MERGE_FILE_IGNORE_WHITESPACE =>
          Some("GIT_MERGE_FILE_IGNORE_WHITESPACE")
        case GIT_MERGE_FILE_IGNORE_WHITESPACE_CHANGE =>
          Some("GIT_MERGE_FILE_IGNORE_WHITESPACE_CHANGE")
        case GIT_MERGE_FILE_IGNORE_WHITESPACE_EOL =>
          Some("GIT_MERGE_FILE_IGNORE_WHITESPACE_EOL")
        case GIT_MERGE_FILE_DIFF_PATIENCE =>
          Some("GIT_MERGE_FILE_DIFF_PATIENCE")
        case GIT_MERGE_FILE_DIFF_MINIMAL => Some("GIT_MERGE_FILE_DIFF_MINIMAL")
        case GIT_MERGE_FILE_STYLE_ZDIFF3 => Some("GIT_MERGE_FILE_STYLE_ZDIFF3")
        case GIT_MERGE_FILE_ACCEPT_CONFLICTS =>
          Some("GIT_MERGE_FILE_ACCEPT_CONFLICTS")
        case _ => None
    extension (a: git_merge_file_flag_t)
      inline def &(b: git_merge_file_flag_t): git_merge_file_flag_t = a & b
      inline def |(b: git_merge_file_flag_t): git_merge_file_flag_t = a | b
      inline def is(b: git_merge_file_flag_t): Boolean = (a & b) == b
  end git_merge_file_flag_t

  /** Flags for `git_merge` options. A combination of these flags can be passed
    * in via the `flags` value in the `git_merge_options`.
    */
  opaque type git_merge_flag_t = CUnsignedInt
  object git_merge_flag_t extends CEnumU[git_merge_flag_t]:
    given _tag: Tag[git_merge_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_merge_flag_t = a.toUInt
    val GIT_MERGE_FIND_RENAMES = define(1)
    val GIT_MERGE_FAIL_ON_CONFLICT = define(2)
    val GIT_MERGE_SKIP_REUC = define(4)
    val GIT_MERGE_NO_RECURSIVE = define(8)
    val GIT_MERGE_VIRTUAL_BASE = define(16)
    inline def getName(inline value: git_merge_flag_t): Option[String] =
      inline value match
        case GIT_MERGE_FIND_RENAMES     => Some("GIT_MERGE_FIND_RENAMES")
        case GIT_MERGE_FAIL_ON_CONFLICT => Some("GIT_MERGE_FAIL_ON_CONFLICT")
        case GIT_MERGE_SKIP_REUC        => Some("GIT_MERGE_SKIP_REUC")
        case GIT_MERGE_NO_RECURSIVE     => Some("GIT_MERGE_NO_RECURSIVE")
        case GIT_MERGE_VIRTUAL_BASE     => Some("GIT_MERGE_VIRTUAL_BASE")
        case _                          => None
    extension (a: git_merge_flag_t)
      inline def &(b: git_merge_flag_t): git_merge_flag_t = a & b
      inline def |(b: git_merge_flag_t): git_merge_flag_t = a | b
      inline def is(b: git_merge_flag_t): Boolean = (a & b) == b
  end git_merge_flag_t

  /** The user's stated preference for merges.
    */
  opaque type git_merge_preference_t = CUnsignedInt
  object git_merge_preference_t extends CEnumU[git_merge_preference_t]:
    given _tag: Tag[git_merge_preference_t] = Tag.UInt
    inline def define(inline a: Long): git_merge_preference_t = a.toUInt
    val GIT_MERGE_PREFERENCE_NONE = define(0)
    val GIT_MERGE_PREFERENCE_NO_FASTFORWARD = define(1)
    val GIT_MERGE_PREFERENCE_FASTFORWARD_ONLY = define(2)
    inline def getName(inline value: git_merge_preference_t): Option[String] =
      inline value match
        case GIT_MERGE_PREFERENCE_NONE => Some("GIT_MERGE_PREFERENCE_NONE")
        case GIT_MERGE_PREFERENCE_NO_FASTFORWARD =>
          Some("GIT_MERGE_PREFERENCE_NO_FASTFORWARD")
        case GIT_MERGE_PREFERENCE_FASTFORWARD_ONLY =>
          Some("GIT_MERGE_PREFERENCE_FASTFORWARD_ONLY")
        case _ => None
    extension (a: git_merge_preference_t)
      inline def &(b: git_merge_preference_t): git_merge_preference_t = a & b
      inline def |(b: git_merge_preference_t): git_merge_preference_t = a | b
      inline def is(b: git_merge_preference_t): Boolean = (a & b) == b
  end git_merge_preference_t

  /** Basic type (loose or packed) of any Git object.
    */
  opaque type git_object_t = CInt
  object git_object_t extends CEnum[git_object_t]:
    given _tag: Tag[git_object_t] = Tag.Int
    inline def define(inline a: CInt): git_object_t = a
    val GIT_OBJECT_ANY = define(-2)
    val GIT_OBJECT_INVALID = define(-1)
    val GIT_OBJECT_COMMIT = define(1)
    val GIT_OBJECT_TREE = define(2)
    val GIT_OBJECT_BLOB = define(3)
    val GIT_OBJECT_TAG = define(4)
    val GIT_OBJECT_OFS_DELTA = define(6)
    val GIT_OBJECT_REF_DELTA = define(7)
    inline def getName(inline value: git_object_t): Option[String] =
      inline value match
        case GIT_OBJECT_ANY       => Some("GIT_OBJECT_ANY")
        case GIT_OBJECT_INVALID   => Some("GIT_OBJECT_INVALID")
        case GIT_OBJECT_COMMIT    => Some("GIT_OBJECT_COMMIT")
        case GIT_OBJECT_TREE      => Some("GIT_OBJECT_TREE")
        case GIT_OBJECT_BLOB      => Some("GIT_OBJECT_BLOB")
        case GIT_OBJECT_TAG       => Some("GIT_OBJECT_TAG")
        case GIT_OBJECT_OFS_DELTA => Some("GIT_OBJECT_OFS_DELTA")
        case GIT_OBJECT_REF_DELTA => Some("GIT_OBJECT_REF_DELTA")
        case _                    => None
    extension (a: git_object_t)
      inline def &(b: git_object_t): git_object_t = a & b
      inline def |(b: git_object_t): git_object_t = a | b
      inline def is(b: git_object_t): Boolean = (a & b) == b
  end git_object_t

  /** */
  opaque type git_odb_backend_loose_flag_t = CUnsignedInt
  object git_odb_backend_loose_flag_t
      extends CEnumU[git_odb_backend_loose_flag_t]:
    given _tag: Tag[git_odb_backend_loose_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_odb_backend_loose_flag_t = a.toUInt
    val GIT_ODB_BACKEND_LOOSE_FSYNC = define(1)
    inline def getName(
        inline value: git_odb_backend_loose_flag_t
    ): Option[String] =
      inline value match
        case GIT_ODB_BACKEND_LOOSE_FSYNC => Some("GIT_ODB_BACKEND_LOOSE_FSYNC")
        case _                           => None
    extension (a: git_odb_backend_loose_flag_t)
      inline def &(
          b: git_odb_backend_loose_flag_t
      ): git_odb_backend_loose_flag_t = a & b
      inline def |(
          b: git_odb_backend_loose_flag_t
      ): git_odb_backend_loose_flag_t = a | b
      inline def is(b: git_odb_backend_loose_flag_t): Boolean = (a & b) == b
  end git_odb_backend_loose_flag_t

  /** Flags controlling the behavior of ODB lookup operations
    */
  opaque type git_odb_lookup_flags_t = CUnsignedInt
  object git_odb_lookup_flags_t extends CEnumU[git_odb_lookup_flags_t]:
    given _tag: Tag[git_odb_lookup_flags_t] = Tag.UInt
    inline def define(inline a: Long): git_odb_lookup_flags_t = a.toUInt
    val GIT_ODB_LOOKUP_NO_REFRESH = define(1)
    inline def getName(inline value: git_odb_lookup_flags_t): Option[String] =
      inline value match
        case GIT_ODB_LOOKUP_NO_REFRESH => Some("GIT_ODB_LOOKUP_NO_REFRESH")
        case _                         => None
    extension (a: git_odb_lookup_flags_t)
      inline def &(b: git_odb_lookup_flags_t): git_odb_lookup_flags_t = a & b
      inline def |(b: git_odb_lookup_flags_t): git_odb_lookup_flags_t = a | b
      inline def is(b: git_odb_lookup_flags_t): Boolean = (a & b) == b
  end git_odb_lookup_flags_t

  /** Streaming mode
    */
  opaque type git_odb_stream_t = CUnsignedInt
  object git_odb_stream_t extends CEnumU[git_odb_stream_t]:
    given _tag: Tag[git_odb_stream_t] = Tag.UInt
    inline def define(inline a: Long): git_odb_stream_t = a.toUInt
    val GIT_STREAM_RDONLY = define(2)
    val GIT_STREAM_WRONLY = define(4)
    val GIT_STREAM_RW = define(6)
    inline def getName(inline value: git_odb_stream_t): Option[String] =
      inline value match
        case GIT_STREAM_RDONLY => Some("GIT_STREAM_RDONLY")
        case GIT_STREAM_WRONLY => Some("GIT_STREAM_WRONLY")
        case GIT_STREAM_RW     => Some("GIT_STREAM_RW")
        case _                 => None
    extension (a: git_odb_stream_t)
      inline def &(b: git_odb_stream_t): git_odb_stream_t = a & b
      inline def |(b: git_odb_stream_t): git_odb_stream_t = a | b
      inline def is(b: git_odb_stream_t): Boolean = (a & b) == b
  end git_odb_stream_t

  /** The type of object id.
    */
  opaque type git_oid_t = CUnsignedInt
  object git_oid_t extends CEnumU[git_oid_t]:
    given _tag: Tag[git_oid_t] = Tag.UInt
    inline def define(inline a: Long): git_oid_t = a.toUInt
    val GIT_OID_SHA1 = define(1)
    inline def getName(inline value: git_oid_t): Option[String] =
      inline value match
        case GIT_OID_SHA1 => Some("GIT_OID_SHA1")
        case _            => None
    extension (a: git_oid_t)
      inline def &(b: git_oid_t): git_oid_t = a & b
      inline def |(b: git_oid_t): git_oid_t = a | b
      inline def is(b: git_oid_t): Boolean = (a & b) == b
  end git_oid_t

  /** Stages that are reported by the packbuilder progress callback.
    */
  opaque type git_packbuilder_stage_t = CUnsignedInt
  object git_packbuilder_stage_t extends CEnumU[git_packbuilder_stage_t]:
    given _tag: Tag[git_packbuilder_stage_t] = Tag.UInt
    inline def define(inline a: Long): git_packbuilder_stage_t = a.toUInt
    val GIT_PACKBUILDER_ADDING_OBJECTS = define(0)
    val GIT_PACKBUILDER_DELTAFICATION = define(1)
    inline def getName(inline value: git_packbuilder_stage_t): Option[String] =
      inline value match
        case GIT_PACKBUILDER_ADDING_OBJECTS =>
          Some("GIT_PACKBUILDER_ADDING_OBJECTS")
        case GIT_PACKBUILDER_DELTAFICATION =>
          Some("GIT_PACKBUILDER_DELTAFICATION")
        case _ => None
    extension (a: git_packbuilder_stage_t)
      inline def &(b: git_packbuilder_stage_t): git_packbuilder_stage_t = a & b
      inline def |(b: git_packbuilder_stage_t): git_packbuilder_stage_t = a | b
      inline def is(b: git_packbuilder_stage_t): Boolean = (a & b) == b
  end git_packbuilder_stage_t

  /** Options controlling how pathspec match should be executed
    */
  opaque type git_pathspec_flag_t = CUnsignedInt
  object git_pathspec_flag_t extends CEnumU[git_pathspec_flag_t]:
    given _tag: Tag[git_pathspec_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_pathspec_flag_t = a.toUInt
    val GIT_PATHSPEC_DEFAULT = define(0)
    val GIT_PATHSPEC_IGNORE_CASE = define(1)
    val GIT_PATHSPEC_USE_CASE = define(2)
    val GIT_PATHSPEC_NO_GLOB = define(4)
    val GIT_PATHSPEC_NO_MATCH_ERROR = define(8)
    val GIT_PATHSPEC_FIND_FAILURES = define(16)
    val GIT_PATHSPEC_FAILURES_ONLY = define(32)
    inline def getName(inline value: git_pathspec_flag_t): Option[String] =
      inline value match
        case GIT_PATHSPEC_DEFAULT        => Some("GIT_PATHSPEC_DEFAULT")
        case GIT_PATHSPEC_IGNORE_CASE    => Some("GIT_PATHSPEC_IGNORE_CASE")
        case GIT_PATHSPEC_USE_CASE       => Some("GIT_PATHSPEC_USE_CASE")
        case GIT_PATHSPEC_NO_GLOB        => Some("GIT_PATHSPEC_NO_GLOB")
        case GIT_PATHSPEC_NO_MATCH_ERROR => Some("GIT_PATHSPEC_NO_MATCH_ERROR")
        case GIT_PATHSPEC_FIND_FAILURES  => Some("GIT_PATHSPEC_FIND_FAILURES")
        case GIT_PATHSPEC_FAILURES_ONLY  => Some("GIT_PATHSPEC_FAILURES_ONLY")
        case _                           => None
    extension (a: git_pathspec_flag_t)
      inline def &(b: git_pathspec_flag_t): git_pathspec_flag_t = a & b
      inline def |(b: git_pathspec_flag_t): git_pathspec_flag_t = a | b
      inline def is(b: git_pathspec_flag_t): Boolean = (a & b) == b
  end git_pathspec_flag_t

  /** The type of proxy to use.
    */
  opaque type git_proxy_t = CUnsignedInt
  object git_proxy_t extends CEnumU[git_proxy_t]:
    given _tag: Tag[git_proxy_t] = Tag.UInt
    inline def define(inline a: Long): git_proxy_t = a.toUInt
    val GIT_PROXY_NONE = define(0)
    val GIT_PROXY_AUTO = define(1)
    val GIT_PROXY_SPECIFIED = define(2)
    inline def getName(inline value: git_proxy_t): Option[String] =
      inline value match
        case GIT_PROXY_NONE      => Some("GIT_PROXY_NONE")
        case GIT_PROXY_AUTO      => Some("GIT_PROXY_AUTO")
        case GIT_PROXY_SPECIFIED => Some("GIT_PROXY_SPECIFIED")
        case _                   => None
    extension (a: git_proxy_t)
      inline def &(b: git_proxy_t): git_proxy_t = a & b
      inline def |(b: git_proxy_t): git_proxy_t = a | b
      inline def is(b: git_proxy_t): Boolean = (a & b) == b
  end git_proxy_t

  /** Type of rebase operation in-progress after calling `git_rebase_next`.
    */
  opaque type git_rebase_operation_t = CUnsignedInt
  object git_rebase_operation_t extends CEnumU[git_rebase_operation_t]:
    given _tag: Tag[git_rebase_operation_t] = Tag.UInt
    inline def define(inline a: Long): git_rebase_operation_t = a.toUInt
    val GIT_REBASE_OPERATION_PICK = define(0)
    val GIT_REBASE_OPERATION_REWORD = define(1)
    val GIT_REBASE_OPERATION_EDIT = define(2)
    val GIT_REBASE_OPERATION_SQUASH = define(3)
    val GIT_REBASE_OPERATION_FIXUP = define(4)
    val GIT_REBASE_OPERATION_EXEC = define(5)
    inline def getName(inline value: git_rebase_operation_t): Option[String] =
      inline value match
        case GIT_REBASE_OPERATION_PICK   => Some("GIT_REBASE_OPERATION_PICK")
        case GIT_REBASE_OPERATION_REWORD => Some("GIT_REBASE_OPERATION_REWORD")
        case GIT_REBASE_OPERATION_EDIT   => Some("GIT_REBASE_OPERATION_EDIT")
        case GIT_REBASE_OPERATION_SQUASH => Some("GIT_REBASE_OPERATION_SQUASH")
        case GIT_REBASE_OPERATION_FIXUP  => Some("GIT_REBASE_OPERATION_FIXUP")
        case GIT_REBASE_OPERATION_EXEC   => Some("GIT_REBASE_OPERATION_EXEC")
        case _                           => None
    extension (a: git_rebase_operation_t)
      inline def &(b: git_rebase_operation_t): git_rebase_operation_t = a & b
      inline def |(b: git_rebase_operation_t): git_rebase_operation_t = a | b
      inline def is(b: git_rebase_operation_t): Boolean = (a & b) == b
  end git_rebase_operation_t

  /** Normalization options for reference lookup
    */
  opaque type git_reference_format_t = CUnsignedInt
  object git_reference_format_t extends CEnumU[git_reference_format_t]:
    given _tag: Tag[git_reference_format_t] = Tag.UInt
    inline def define(inline a: Long): git_reference_format_t = a.toUInt
    val GIT_REFERENCE_FORMAT_NORMAL = define(0)
    val GIT_REFERENCE_FORMAT_ALLOW_ONELEVEL = define(1)
    val GIT_REFERENCE_FORMAT_REFSPEC_PATTERN = define(2)
    val GIT_REFERENCE_FORMAT_REFSPEC_SHORTHAND = define(4)
    inline def getName(inline value: git_reference_format_t): Option[String] =
      inline value match
        case GIT_REFERENCE_FORMAT_NORMAL => Some("GIT_REFERENCE_FORMAT_NORMAL")
        case GIT_REFERENCE_FORMAT_ALLOW_ONELEVEL =>
          Some("GIT_REFERENCE_FORMAT_ALLOW_ONELEVEL")
        case GIT_REFERENCE_FORMAT_REFSPEC_PATTERN =>
          Some("GIT_REFERENCE_FORMAT_REFSPEC_PATTERN")
        case GIT_REFERENCE_FORMAT_REFSPEC_SHORTHAND =>
          Some("GIT_REFERENCE_FORMAT_REFSPEC_SHORTHAND")
        case _ => None
    extension (a: git_reference_format_t)
      inline def &(b: git_reference_format_t): git_reference_format_t = a & b
      inline def |(b: git_reference_format_t): git_reference_format_t = a | b
      inline def is(b: git_reference_format_t): Boolean = (a & b) == b
  end git_reference_format_t

  /** Basic type of any Git reference.
    */
  opaque type git_reference_t = CUnsignedInt
  object git_reference_t extends CEnumU[git_reference_t]:
    given _tag: Tag[git_reference_t] = Tag.UInt
    inline def define(inline a: Long): git_reference_t = a.toUInt
    val GIT_REFERENCE_INVALID = define(0)
    val GIT_REFERENCE_DIRECT = define(1)
    val GIT_REFERENCE_SYMBOLIC = define(2)
    val GIT_REFERENCE_ALL = define(3)
    inline def getName(inline value: git_reference_t): Option[String] =
      inline value match
        case GIT_REFERENCE_INVALID  => Some("GIT_REFERENCE_INVALID")
        case GIT_REFERENCE_DIRECT   => Some("GIT_REFERENCE_DIRECT")
        case GIT_REFERENCE_SYMBOLIC => Some("GIT_REFERENCE_SYMBOLIC")
        case GIT_REFERENCE_ALL      => Some("GIT_REFERENCE_ALL")
        case _                      => None
    extension (a: git_reference_t)
      inline def &(b: git_reference_t): git_reference_t = a & b
      inline def |(b: git_reference_t): git_reference_t = a | b
      inline def is(b: git_reference_t): Boolean = (a & b) == b
  end git_reference_t

  /** Automatic tag following option
    */
  opaque type git_remote_autotag_option_t = CUnsignedInt
  object git_remote_autotag_option_t
      extends CEnumU[git_remote_autotag_option_t]:
    given _tag: Tag[git_remote_autotag_option_t] = Tag.UInt
    inline def define(inline a: Long): git_remote_autotag_option_t = a.toUInt
    val GIT_REMOTE_DOWNLOAD_TAGS_UNSPECIFIED = define(0)
    val GIT_REMOTE_DOWNLOAD_TAGS_AUTO = define(1)
    val GIT_REMOTE_DOWNLOAD_TAGS_NONE = define(2)
    val GIT_REMOTE_DOWNLOAD_TAGS_ALL = define(3)
    inline def getName(
        inline value: git_remote_autotag_option_t
    ): Option[String] =
      inline value match
        case GIT_REMOTE_DOWNLOAD_TAGS_UNSPECIFIED =>
          Some("GIT_REMOTE_DOWNLOAD_TAGS_UNSPECIFIED")
        case GIT_REMOTE_DOWNLOAD_TAGS_AUTO =>
          Some("GIT_REMOTE_DOWNLOAD_TAGS_AUTO")
        case GIT_REMOTE_DOWNLOAD_TAGS_NONE =>
          Some("GIT_REMOTE_DOWNLOAD_TAGS_NONE")
        case GIT_REMOTE_DOWNLOAD_TAGS_ALL =>
          Some("GIT_REMOTE_DOWNLOAD_TAGS_ALL")
        case _ => None
    extension (a: git_remote_autotag_option_t)
      inline def &(
          b: git_remote_autotag_option_t
      ): git_remote_autotag_option_t = a & b
      inline def |(
          b: git_remote_autotag_option_t
      ): git_remote_autotag_option_t = a | b
      inline def is(b: git_remote_autotag_option_t): Boolean = (a & b) == b
  end git_remote_autotag_option_t

  /** Argument to the completion callback which tells it which operation
    * finished.
    */
  opaque type git_remote_completion_t = CUnsignedInt
  object git_remote_completion_t extends CEnumU[git_remote_completion_t]:
    given _tag: Tag[git_remote_completion_t] = Tag.UInt
    inline def define(inline a: Long): git_remote_completion_t = a.toUInt
    val GIT_REMOTE_COMPLETION_DOWNLOAD = define(0)
    val GIT_REMOTE_COMPLETION_INDEXING = define(1)
    val GIT_REMOTE_COMPLETION_ERROR = define(2)
    inline def getName(inline value: git_remote_completion_t): Option[String] =
      inline value match
        case GIT_REMOTE_COMPLETION_DOWNLOAD =>
          Some("GIT_REMOTE_COMPLETION_DOWNLOAD")
        case GIT_REMOTE_COMPLETION_INDEXING =>
          Some("GIT_REMOTE_COMPLETION_INDEXING")
        case GIT_REMOTE_COMPLETION_ERROR => Some("GIT_REMOTE_COMPLETION_ERROR")
        case _                           => None
    extension (a: git_remote_completion_t)
      inline def &(b: git_remote_completion_t): git_remote_completion_t = a & b
      inline def |(b: git_remote_completion_t): git_remote_completion_t = a | b
      inline def is(b: git_remote_completion_t): Boolean = (a & b) == b
  end git_remote_completion_t

  /** Remote creation options flags
    */
  opaque type git_remote_create_flags = CUnsignedInt
  object git_remote_create_flags extends CEnumU[git_remote_create_flags]:
    given _tag: Tag[git_remote_create_flags] = Tag.UInt
    inline def define(inline a: Long): git_remote_create_flags = a.toUInt
    val GIT_REMOTE_CREATE_SKIP_INSTEADOF = define(1)
    val GIT_REMOTE_CREATE_SKIP_DEFAULT_FETCHSPEC = define(2)
    inline def getName(inline value: git_remote_create_flags): Option[String] =
      inline value match
        case GIT_REMOTE_CREATE_SKIP_INSTEADOF =>
          Some("GIT_REMOTE_CREATE_SKIP_INSTEADOF")
        case GIT_REMOTE_CREATE_SKIP_DEFAULT_FETCHSPEC =>
          Some("GIT_REMOTE_CREATE_SKIP_DEFAULT_FETCHSPEC")
        case _ => None
    extension (a: git_remote_create_flags)
      inline def &(b: git_remote_create_flags): git_remote_create_flags = a & b
      inline def |(b: git_remote_create_flags): git_remote_create_flags = a | b
      inline def is(b: git_remote_create_flags): Boolean = (a & b) == b
  end git_remote_create_flags

  /** Remote redirection settings; whether redirects to another host are
    * permitted. By default, git will follow a redirect on the initial request
    * (`/info/refs`), but not subsequent requests.
    */
  opaque type git_remote_redirect_t = CUnsignedInt
  object git_remote_redirect_t extends CEnumU[git_remote_redirect_t]:
    given _tag: Tag[git_remote_redirect_t] = Tag.UInt
    inline def define(inline a: Long): git_remote_redirect_t = a.toUInt
    val GIT_REMOTE_REDIRECT_NONE = define(1)
    val GIT_REMOTE_REDIRECT_INITIAL = define(2)
    val GIT_REMOTE_REDIRECT_ALL = define(4)
    inline def getName(inline value: git_remote_redirect_t): Option[String] =
      inline value match
        case GIT_REMOTE_REDIRECT_NONE    => Some("GIT_REMOTE_REDIRECT_NONE")
        case GIT_REMOTE_REDIRECT_INITIAL => Some("GIT_REMOTE_REDIRECT_INITIAL")
        case GIT_REMOTE_REDIRECT_ALL     => Some("GIT_REMOTE_REDIRECT_ALL")
        case _                           => None
    extension (a: git_remote_redirect_t)
      inline def &(b: git_remote_redirect_t): git_remote_redirect_t = a & b
      inline def |(b: git_remote_redirect_t): git_remote_redirect_t = a | b
      inline def is(b: git_remote_redirect_t): Boolean = (a & b) == b
  end git_remote_redirect_t

  /** Option flags for `git_repository_init_ext`.
    */
  opaque type git_repository_init_flag_t = CUnsignedInt
  object git_repository_init_flag_t extends CEnumU[git_repository_init_flag_t]:
    given _tag: Tag[git_repository_init_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_repository_init_flag_t = a.toUInt
    val GIT_REPOSITORY_INIT_BARE = define(1)
    val GIT_REPOSITORY_INIT_NO_REINIT = define(2)
    val GIT_REPOSITORY_INIT_NO_DOTGIT_DIR = define(4)
    val GIT_REPOSITORY_INIT_MKDIR = define(8)
    val GIT_REPOSITORY_INIT_MKPATH = define(16)
    val GIT_REPOSITORY_INIT_EXTERNAL_TEMPLATE = define(32)
    val GIT_REPOSITORY_INIT_RELATIVE_GITLINK = define(64)
    inline def getName(
        inline value: git_repository_init_flag_t
    ): Option[String] =
      inline value match
        case GIT_REPOSITORY_INIT_BARE => Some("GIT_REPOSITORY_INIT_BARE")
        case GIT_REPOSITORY_INIT_NO_REINIT =>
          Some("GIT_REPOSITORY_INIT_NO_REINIT")
        case GIT_REPOSITORY_INIT_NO_DOTGIT_DIR =>
          Some("GIT_REPOSITORY_INIT_NO_DOTGIT_DIR")
        case GIT_REPOSITORY_INIT_MKDIR  => Some("GIT_REPOSITORY_INIT_MKDIR")
        case GIT_REPOSITORY_INIT_MKPATH => Some("GIT_REPOSITORY_INIT_MKPATH")
        case GIT_REPOSITORY_INIT_EXTERNAL_TEMPLATE =>
          Some("GIT_REPOSITORY_INIT_EXTERNAL_TEMPLATE")
        case GIT_REPOSITORY_INIT_RELATIVE_GITLINK =>
          Some("GIT_REPOSITORY_INIT_RELATIVE_GITLINK")
        case _ => None
    extension (a: git_repository_init_flag_t)
      inline def &(b: git_repository_init_flag_t): git_repository_init_flag_t =
        a & b
      inline def |(b: git_repository_init_flag_t): git_repository_init_flag_t =
        a | b
      inline def is(b: git_repository_init_flag_t): Boolean = (a & b) == b
  end git_repository_init_flag_t

  /** Mode options for `git_repository_init_ext`.
    */
  opaque type git_repository_init_mode_t = CUnsignedInt
  object git_repository_init_mode_t extends CEnumU[git_repository_init_mode_t]:
    given _tag: Tag[git_repository_init_mode_t] = Tag.UInt
    inline def define(inline a: Long): git_repository_init_mode_t = a.toUInt
    val GIT_REPOSITORY_INIT_SHARED_UMASK = define(0)
    val GIT_REPOSITORY_INIT_SHARED_GROUP = define(1533)
    val GIT_REPOSITORY_INIT_SHARED_ALL = define(1535)
    inline def getName(
        inline value: git_repository_init_mode_t
    ): Option[String] =
      inline value match
        case GIT_REPOSITORY_INIT_SHARED_UMASK =>
          Some("GIT_REPOSITORY_INIT_SHARED_UMASK")
        case GIT_REPOSITORY_INIT_SHARED_GROUP =>
          Some("GIT_REPOSITORY_INIT_SHARED_GROUP")
        case GIT_REPOSITORY_INIT_SHARED_ALL =>
          Some("GIT_REPOSITORY_INIT_SHARED_ALL")
        case _ => None
    extension (a: git_repository_init_mode_t)
      inline def &(b: git_repository_init_mode_t): git_repository_init_mode_t =
        a & b
      inline def |(b: git_repository_init_mode_t): git_repository_init_mode_t =
        a | b
      inline def is(b: git_repository_init_mode_t): Boolean = (a & b) == b
  end git_repository_init_mode_t

  /** List of items which belong to the git repository layout
    */
  opaque type git_repository_item_t = CUnsignedInt
  object git_repository_item_t extends CEnumU[git_repository_item_t]:
    given _tag: Tag[git_repository_item_t] = Tag.UInt
    inline def define(inline a: Long): git_repository_item_t = a.toUInt
    val GIT_REPOSITORY_ITEM_GITDIR = define(0)
    val GIT_REPOSITORY_ITEM_WORKDIR = define(1)
    val GIT_REPOSITORY_ITEM_COMMONDIR = define(2)
    val GIT_REPOSITORY_ITEM_INDEX = define(3)
    val GIT_REPOSITORY_ITEM_OBJECTS = define(4)
    val GIT_REPOSITORY_ITEM_REFS = define(5)
    val GIT_REPOSITORY_ITEM_PACKED_REFS = define(6)
    val GIT_REPOSITORY_ITEM_REMOTES = define(7)
    val GIT_REPOSITORY_ITEM_CONFIG = define(8)
    val GIT_REPOSITORY_ITEM_INFO = define(9)
    val GIT_REPOSITORY_ITEM_HOOKS = define(10)
    val GIT_REPOSITORY_ITEM_LOGS = define(11)
    val GIT_REPOSITORY_ITEM_MODULES = define(12)
    val GIT_REPOSITORY_ITEM_WORKTREES = define(13)
    val GIT_REPOSITORY_ITEM__LAST = define(14)
    inline def getName(inline value: git_repository_item_t): Option[String] =
      inline value match
        case GIT_REPOSITORY_ITEM_GITDIR  => Some("GIT_REPOSITORY_ITEM_GITDIR")
        case GIT_REPOSITORY_ITEM_WORKDIR => Some("GIT_REPOSITORY_ITEM_WORKDIR")
        case GIT_REPOSITORY_ITEM_COMMONDIR =>
          Some("GIT_REPOSITORY_ITEM_COMMONDIR")
        case GIT_REPOSITORY_ITEM_INDEX   => Some("GIT_REPOSITORY_ITEM_INDEX")
        case GIT_REPOSITORY_ITEM_OBJECTS => Some("GIT_REPOSITORY_ITEM_OBJECTS")
        case GIT_REPOSITORY_ITEM_REFS    => Some("GIT_REPOSITORY_ITEM_REFS")
        case GIT_REPOSITORY_ITEM_PACKED_REFS =>
          Some("GIT_REPOSITORY_ITEM_PACKED_REFS")
        case GIT_REPOSITORY_ITEM_REMOTES => Some("GIT_REPOSITORY_ITEM_REMOTES")
        case GIT_REPOSITORY_ITEM_CONFIG  => Some("GIT_REPOSITORY_ITEM_CONFIG")
        case GIT_REPOSITORY_ITEM_INFO    => Some("GIT_REPOSITORY_ITEM_INFO")
        case GIT_REPOSITORY_ITEM_HOOKS   => Some("GIT_REPOSITORY_ITEM_HOOKS")
        case GIT_REPOSITORY_ITEM_LOGS    => Some("GIT_REPOSITORY_ITEM_LOGS")
        case GIT_REPOSITORY_ITEM_MODULES => Some("GIT_REPOSITORY_ITEM_MODULES")
        case GIT_REPOSITORY_ITEM_WORKTREES =>
          Some("GIT_REPOSITORY_ITEM_WORKTREES")
        case GIT_REPOSITORY_ITEM__LAST => Some("GIT_REPOSITORY_ITEM__LAST")
        case _                         => None
    extension (a: git_repository_item_t)
      inline def &(b: git_repository_item_t): git_repository_item_t = a & b
      inline def |(b: git_repository_item_t): git_repository_item_t = a | b
      inline def is(b: git_repository_item_t): Boolean = (a & b) == b
  end git_repository_item_t

  /** Option flags for `git_repository_open_ext`.
    */
  opaque type git_repository_open_flag_t = CUnsignedInt
  object git_repository_open_flag_t extends CEnumU[git_repository_open_flag_t]:
    given _tag: Tag[git_repository_open_flag_t] = Tag.UInt
    inline def define(inline a: Long): git_repository_open_flag_t = a.toUInt
    val GIT_REPOSITORY_OPEN_NO_SEARCH = define(1)
    val GIT_REPOSITORY_OPEN_CROSS_FS = define(2)
    val GIT_REPOSITORY_OPEN_BARE = define(4)
    val GIT_REPOSITORY_OPEN_NO_DOTGIT = define(8)
    val GIT_REPOSITORY_OPEN_FROM_ENV = define(16)
    inline def getName(
        inline value: git_repository_open_flag_t
    ): Option[String] =
      inline value match
        case GIT_REPOSITORY_OPEN_NO_SEARCH =>
          Some("GIT_REPOSITORY_OPEN_NO_SEARCH")
        case GIT_REPOSITORY_OPEN_CROSS_FS =>
          Some("GIT_REPOSITORY_OPEN_CROSS_FS")
        case GIT_REPOSITORY_OPEN_BARE => Some("GIT_REPOSITORY_OPEN_BARE")
        case GIT_REPOSITORY_OPEN_NO_DOTGIT =>
          Some("GIT_REPOSITORY_OPEN_NO_DOTGIT")
        case GIT_REPOSITORY_OPEN_FROM_ENV =>
          Some("GIT_REPOSITORY_OPEN_FROM_ENV")
        case _ => None
    extension (a: git_repository_open_flag_t)
      inline def &(b: git_repository_open_flag_t): git_repository_open_flag_t =
        a & b
      inline def |(b: git_repository_open_flag_t): git_repository_open_flag_t =
        a | b
      inline def is(b: git_repository_open_flag_t): Boolean = (a & b) == b
  end git_repository_open_flag_t

  /** Repository state
    */
  opaque type git_repository_state_t = CUnsignedInt
  object git_repository_state_t extends CEnumU[git_repository_state_t]:
    given _tag: Tag[git_repository_state_t] = Tag.UInt
    inline def define(inline a: Long): git_repository_state_t = a.toUInt
    val GIT_REPOSITORY_STATE_NONE = define(0)
    val GIT_REPOSITORY_STATE_MERGE = define(1)
    val GIT_REPOSITORY_STATE_REVERT = define(2)
    val GIT_REPOSITORY_STATE_REVERT_SEQUENCE = define(3)
    val GIT_REPOSITORY_STATE_CHERRYPICK = define(4)
    val GIT_REPOSITORY_STATE_CHERRYPICK_SEQUENCE = define(5)
    val GIT_REPOSITORY_STATE_BISECT = define(6)
    val GIT_REPOSITORY_STATE_REBASE = define(7)
    val GIT_REPOSITORY_STATE_REBASE_INTERACTIVE = define(8)
    val GIT_REPOSITORY_STATE_REBASE_MERGE = define(9)
    val GIT_REPOSITORY_STATE_APPLY_MAILBOX = define(10)
    val GIT_REPOSITORY_STATE_APPLY_MAILBOX_OR_REBASE = define(11)
    inline def getName(inline value: git_repository_state_t): Option[String] =
      inline value match
        case GIT_REPOSITORY_STATE_NONE   => Some("GIT_REPOSITORY_STATE_NONE")
        case GIT_REPOSITORY_STATE_MERGE  => Some("GIT_REPOSITORY_STATE_MERGE")
        case GIT_REPOSITORY_STATE_REVERT => Some("GIT_REPOSITORY_STATE_REVERT")
        case GIT_REPOSITORY_STATE_REVERT_SEQUENCE =>
          Some("GIT_REPOSITORY_STATE_REVERT_SEQUENCE")
        case GIT_REPOSITORY_STATE_CHERRYPICK =>
          Some("GIT_REPOSITORY_STATE_CHERRYPICK")
        case GIT_REPOSITORY_STATE_CHERRYPICK_SEQUENCE =>
          Some("GIT_REPOSITORY_STATE_CHERRYPICK_SEQUENCE")
        case GIT_REPOSITORY_STATE_BISECT => Some("GIT_REPOSITORY_STATE_BISECT")
        case GIT_REPOSITORY_STATE_REBASE => Some("GIT_REPOSITORY_STATE_REBASE")
        case GIT_REPOSITORY_STATE_REBASE_INTERACTIVE =>
          Some("GIT_REPOSITORY_STATE_REBASE_INTERACTIVE")
        case GIT_REPOSITORY_STATE_REBASE_MERGE =>
          Some("GIT_REPOSITORY_STATE_REBASE_MERGE")
        case GIT_REPOSITORY_STATE_APPLY_MAILBOX =>
          Some("GIT_REPOSITORY_STATE_APPLY_MAILBOX")
        case GIT_REPOSITORY_STATE_APPLY_MAILBOX_OR_REBASE =>
          Some("GIT_REPOSITORY_STATE_APPLY_MAILBOX_OR_REBASE")
        case _ => None
    extension (a: git_repository_state_t)
      inline def &(b: git_repository_state_t): git_repository_state_t = a & b
      inline def |(b: git_repository_state_t): git_repository_state_t = a | b
      inline def is(b: git_repository_state_t): Boolean = (a & b) == b
  end git_repository_state_t

  /** Kinds of reset operation
    */
  opaque type git_reset_t = CUnsignedInt
  object git_reset_t extends CEnumU[git_reset_t]:
    given _tag: Tag[git_reset_t] = Tag.UInt
    inline def define(inline a: Long): git_reset_t = a.toUInt
    val GIT_RESET_SOFT = define(1)
    val GIT_RESET_MIXED = define(2)
    val GIT_RESET_HARD = define(3)
    inline def getName(inline value: git_reset_t): Option[String] =
      inline value match
        case GIT_RESET_SOFT  => Some("GIT_RESET_SOFT")
        case GIT_RESET_MIXED => Some("GIT_RESET_MIXED")
        case GIT_RESET_HARD  => Some("GIT_RESET_HARD")
        case _               => None
    extension (a: git_reset_t)
      inline def &(b: git_reset_t): git_reset_t = a & b
      inline def |(b: git_reset_t): git_reset_t = a | b
      inline def is(b: git_reset_t): Boolean = (a & b) == b
  end git_reset_t

  /** Revparse flags. These indicate the intended behavior of the spec passed to
    * git_revparse.
    */
  opaque type git_revspec_t = CUnsignedInt
  object git_revspec_t extends CEnumU[git_revspec_t]:
    given _tag: Tag[git_revspec_t] = Tag.UInt
    inline def define(inline a: Long): git_revspec_t = a.toUInt
    val GIT_REVSPEC_SINGLE = define(1)
    val GIT_REVSPEC_RANGE = define(2)
    val GIT_REVSPEC_MERGE_BASE = define(4)
    inline def getName(inline value: git_revspec_t): Option[String] =
      inline value match
        case GIT_REVSPEC_SINGLE     => Some("GIT_REVSPEC_SINGLE")
        case GIT_REVSPEC_RANGE      => Some("GIT_REVSPEC_RANGE")
        case GIT_REVSPEC_MERGE_BASE => Some("GIT_REVSPEC_MERGE_BASE")
        case _                      => None
    extension (a: git_revspec_t)
      inline def &(b: git_revspec_t): git_revspec_t = a & b
      inline def |(b: git_revspec_t): git_revspec_t = a | b
      inline def is(b: git_revspec_t): Boolean = (a & b) == b
  end git_revspec_t

  /** Flags to specify the sorting which a revwalk should perform.
    */
  opaque type git_sort_t = CUnsignedInt
  object git_sort_t extends CEnumU[git_sort_t]:
    given _tag: Tag[git_sort_t] = Tag.UInt
    inline def define(inline a: Long): git_sort_t = a.toUInt
    val GIT_SORT_NONE = define(0)
    val GIT_SORT_TOPOLOGICAL = define(1)
    val GIT_SORT_TIME = define(2)
    val GIT_SORT_REVERSE = define(4)
    inline def getName(inline value: git_sort_t): Option[String] =
      inline value match
        case GIT_SORT_NONE        => Some("GIT_SORT_NONE")
        case GIT_SORT_TOPOLOGICAL => Some("GIT_SORT_TOPOLOGICAL")
        case GIT_SORT_TIME        => Some("GIT_SORT_TIME")
        case GIT_SORT_REVERSE     => Some("GIT_SORT_REVERSE")
        case _                    => None
    extension (a: git_sort_t)
      inline def &(b: git_sort_t): git_sort_t = a & b
      inline def |(b: git_sort_t): git_sort_t = a | b
      inline def is(b: git_sort_t): Boolean = (a & b) == b
  end git_sort_t

  /** Stash application flags.
    */
  opaque type git_stash_apply_flags = CUnsignedInt
  object git_stash_apply_flags extends CEnumU[git_stash_apply_flags]:
    given _tag: Tag[git_stash_apply_flags] = Tag.UInt
    inline def define(inline a: Long): git_stash_apply_flags = a.toUInt
    val GIT_STASH_APPLY_DEFAULT = define(0)
    val GIT_STASH_APPLY_REINSTATE_INDEX = define(1)
    inline def getName(inline value: git_stash_apply_flags): Option[String] =
      inline value match
        case GIT_STASH_APPLY_DEFAULT => Some("GIT_STASH_APPLY_DEFAULT")
        case GIT_STASH_APPLY_REINSTATE_INDEX =>
          Some("GIT_STASH_APPLY_REINSTATE_INDEX")
        case _ => None
    extension (a: git_stash_apply_flags)
      inline def &(b: git_stash_apply_flags): git_stash_apply_flags = a & b
      inline def |(b: git_stash_apply_flags): git_stash_apply_flags = a | b
      inline def is(b: git_stash_apply_flags): Boolean = (a & b) == b
  end git_stash_apply_flags

  /** Stash apply progression states
    */
  opaque type git_stash_apply_progress_t = CUnsignedInt
  object git_stash_apply_progress_t extends CEnumU[git_stash_apply_progress_t]:
    given _tag: Tag[git_stash_apply_progress_t] = Tag.UInt
    inline def define(inline a: Long): git_stash_apply_progress_t = a.toUInt
    val GIT_STASH_APPLY_PROGRESS_NONE = define(0)
    val GIT_STASH_APPLY_PROGRESS_LOADING_STASH = define(1)
    val GIT_STASH_APPLY_PROGRESS_ANALYZE_INDEX = define(2)
    val GIT_STASH_APPLY_PROGRESS_ANALYZE_MODIFIED = define(3)
    val GIT_STASH_APPLY_PROGRESS_ANALYZE_UNTRACKED = define(4)
    val GIT_STASH_APPLY_PROGRESS_CHECKOUT_UNTRACKED = define(5)
    val GIT_STASH_APPLY_PROGRESS_CHECKOUT_MODIFIED = define(6)
    val GIT_STASH_APPLY_PROGRESS_DONE = define(7)
    inline def getName(
        inline value: git_stash_apply_progress_t
    ): Option[String] =
      inline value match
        case GIT_STASH_APPLY_PROGRESS_NONE =>
          Some("GIT_STASH_APPLY_PROGRESS_NONE")
        case GIT_STASH_APPLY_PROGRESS_LOADING_STASH =>
          Some("GIT_STASH_APPLY_PROGRESS_LOADING_STASH")
        case GIT_STASH_APPLY_PROGRESS_ANALYZE_INDEX =>
          Some("GIT_STASH_APPLY_PROGRESS_ANALYZE_INDEX")
        case GIT_STASH_APPLY_PROGRESS_ANALYZE_MODIFIED =>
          Some("GIT_STASH_APPLY_PROGRESS_ANALYZE_MODIFIED")
        case GIT_STASH_APPLY_PROGRESS_ANALYZE_UNTRACKED =>
          Some("GIT_STASH_APPLY_PROGRESS_ANALYZE_UNTRACKED")
        case GIT_STASH_APPLY_PROGRESS_CHECKOUT_UNTRACKED =>
          Some("GIT_STASH_APPLY_PROGRESS_CHECKOUT_UNTRACKED")
        case GIT_STASH_APPLY_PROGRESS_CHECKOUT_MODIFIED =>
          Some("GIT_STASH_APPLY_PROGRESS_CHECKOUT_MODIFIED")
        case GIT_STASH_APPLY_PROGRESS_DONE =>
          Some("GIT_STASH_APPLY_PROGRESS_DONE")
        case _ => None
    extension (a: git_stash_apply_progress_t)
      inline def &(b: git_stash_apply_progress_t): git_stash_apply_progress_t =
        a & b
      inline def |(b: git_stash_apply_progress_t): git_stash_apply_progress_t =
        a | b
      inline def is(b: git_stash_apply_progress_t): Boolean = (a & b) == b
  end git_stash_apply_progress_t

  /** Stash flags
    */
  opaque type git_stash_flags = CUnsignedInt
  object git_stash_flags extends CEnumU[git_stash_flags]:
    given _tag: Tag[git_stash_flags] = Tag.UInt
    inline def define(inline a: Long): git_stash_flags = a.toUInt
    val GIT_STASH_DEFAULT = define(0)
    val GIT_STASH_KEEP_INDEX = define(1)
    val GIT_STASH_INCLUDE_UNTRACKED = define(2)
    val GIT_STASH_INCLUDE_IGNORED = define(4)
    val GIT_STASH_KEEP_ALL = define(8)
    inline def getName(inline value: git_stash_flags): Option[String] =
      inline value match
        case GIT_STASH_DEFAULT           => Some("GIT_STASH_DEFAULT")
        case GIT_STASH_KEEP_INDEX        => Some("GIT_STASH_KEEP_INDEX")
        case GIT_STASH_INCLUDE_UNTRACKED => Some("GIT_STASH_INCLUDE_UNTRACKED")
        case GIT_STASH_INCLUDE_IGNORED   => Some("GIT_STASH_INCLUDE_IGNORED")
        case GIT_STASH_KEEP_ALL          => Some("GIT_STASH_KEEP_ALL")
        case _                           => None
    extension (a: git_stash_flags)
      inline def &(b: git_stash_flags): git_stash_flags = a & b
      inline def |(b: git_stash_flags): git_stash_flags = a | b
      inline def is(b: git_stash_flags): Boolean = (a & b) == b
  end git_stash_flags

  /** Flags to control status callbacks
    */
  opaque type git_status_opt_t = CUnsignedInt
  object git_status_opt_t extends CEnumU[git_status_opt_t]:
    given _tag: Tag[git_status_opt_t] = Tag.UInt
    inline def define(inline a: Long): git_status_opt_t = a.toUInt
    val GIT_STATUS_OPT_INCLUDE_UNTRACKED = define(1)
    val GIT_STATUS_OPT_INCLUDE_IGNORED = define(2)
    val GIT_STATUS_OPT_INCLUDE_UNMODIFIED = define(4)
    val GIT_STATUS_OPT_EXCLUDE_SUBMODULES = define(8)
    val GIT_STATUS_OPT_RECURSE_UNTRACKED_DIRS = define(16)
    val GIT_STATUS_OPT_DISABLE_PATHSPEC_MATCH = define(32)
    val GIT_STATUS_OPT_RECURSE_IGNORED_DIRS = define(64)
    val GIT_STATUS_OPT_RENAMES_HEAD_TO_INDEX = define(128)
    val GIT_STATUS_OPT_RENAMES_INDEX_TO_WORKDIR = define(256)
    val GIT_STATUS_OPT_SORT_CASE_SENSITIVELY = define(512)
    val GIT_STATUS_OPT_SORT_CASE_INSENSITIVELY = define(1024)
    val GIT_STATUS_OPT_RENAMES_FROM_REWRITES = define(2048)
    val GIT_STATUS_OPT_NO_REFRESH = define(4096)
    val GIT_STATUS_OPT_UPDATE_INDEX = define(8192)
    val GIT_STATUS_OPT_INCLUDE_UNREADABLE = define(16384)
    val GIT_STATUS_OPT_INCLUDE_UNREADABLE_AS_UNTRACKED = define(32768)
    inline def getName(inline value: git_status_opt_t): Option[String] =
      inline value match
        case GIT_STATUS_OPT_INCLUDE_UNTRACKED =>
          Some("GIT_STATUS_OPT_INCLUDE_UNTRACKED")
        case GIT_STATUS_OPT_INCLUDE_IGNORED =>
          Some("GIT_STATUS_OPT_INCLUDE_IGNORED")
        case GIT_STATUS_OPT_INCLUDE_UNMODIFIED =>
          Some("GIT_STATUS_OPT_INCLUDE_UNMODIFIED")
        case GIT_STATUS_OPT_EXCLUDE_SUBMODULES =>
          Some("GIT_STATUS_OPT_EXCLUDE_SUBMODULES")
        case GIT_STATUS_OPT_RECURSE_UNTRACKED_DIRS =>
          Some("GIT_STATUS_OPT_RECURSE_UNTRACKED_DIRS")
        case GIT_STATUS_OPT_DISABLE_PATHSPEC_MATCH =>
          Some("GIT_STATUS_OPT_DISABLE_PATHSPEC_MATCH")
        case GIT_STATUS_OPT_RECURSE_IGNORED_DIRS =>
          Some("GIT_STATUS_OPT_RECURSE_IGNORED_DIRS")
        case GIT_STATUS_OPT_RENAMES_HEAD_TO_INDEX =>
          Some("GIT_STATUS_OPT_RENAMES_HEAD_TO_INDEX")
        case GIT_STATUS_OPT_RENAMES_INDEX_TO_WORKDIR =>
          Some("GIT_STATUS_OPT_RENAMES_INDEX_TO_WORKDIR")
        case GIT_STATUS_OPT_SORT_CASE_SENSITIVELY =>
          Some("GIT_STATUS_OPT_SORT_CASE_SENSITIVELY")
        case GIT_STATUS_OPT_SORT_CASE_INSENSITIVELY =>
          Some("GIT_STATUS_OPT_SORT_CASE_INSENSITIVELY")
        case GIT_STATUS_OPT_RENAMES_FROM_REWRITES =>
          Some("GIT_STATUS_OPT_RENAMES_FROM_REWRITES")
        case GIT_STATUS_OPT_NO_REFRESH   => Some("GIT_STATUS_OPT_NO_REFRESH")
        case GIT_STATUS_OPT_UPDATE_INDEX => Some("GIT_STATUS_OPT_UPDATE_INDEX")
        case GIT_STATUS_OPT_INCLUDE_UNREADABLE =>
          Some("GIT_STATUS_OPT_INCLUDE_UNREADABLE")
        case GIT_STATUS_OPT_INCLUDE_UNREADABLE_AS_UNTRACKED =>
          Some("GIT_STATUS_OPT_INCLUDE_UNREADABLE_AS_UNTRACKED")
        case _ => None
    extension (a: git_status_opt_t)
      inline def &(b: git_status_opt_t): git_status_opt_t = a & b
      inline def |(b: git_status_opt_t): git_status_opt_t = a | b
      inline def is(b: git_status_opt_t): Boolean = (a & b) == b
  end git_status_opt_t

  /** Select the files on which to report status.
    */
  opaque type git_status_show_t = CUnsignedInt
  object git_status_show_t extends CEnumU[git_status_show_t]:
    given _tag: Tag[git_status_show_t] = Tag.UInt
    inline def define(inline a: Long): git_status_show_t = a.toUInt
    val GIT_STATUS_SHOW_INDEX_AND_WORKDIR = define(0)
    val GIT_STATUS_SHOW_INDEX_ONLY = define(1)
    val GIT_STATUS_SHOW_WORKDIR_ONLY = define(2)
    inline def getName(inline value: git_status_show_t): Option[String] =
      inline value match
        case GIT_STATUS_SHOW_INDEX_AND_WORKDIR =>
          Some("GIT_STATUS_SHOW_INDEX_AND_WORKDIR")
        case GIT_STATUS_SHOW_INDEX_ONLY => Some("GIT_STATUS_SHOW_INDEX_ONLY")
        case GIT_STATUS_SHOW_WORKDIR_ONLY =>
          Some("GIT_STATUS_SHOW_WORKDIR_ONLY")
        case _ => None
    extension (a: git_status_show_t)
      inline def &(b: git_status_show_t): git_status_show_t = a & b
      inline def |(b: git_status_show_t): git_status_show_t = a | b
      inline def is(b: git_status_show_t): Boolean = (a & b) == b
  end git_status_show_t

  /** Status flags for a single file.
    */
  opaque type git_status_t = CUnsignedInt
  object git_status_t extends CEnumU[git_status_t]:
    given _tag: Tag[git_status_t] = Tag.UInt
    inline def define(inline a: Long): git_status_t = a.toUInt
    val GIT_STATUS_CURRENT = define(0)
    val GIT_STATUS_INDEX_NEW = define(1)
    val GIT_STATUS_INDEX_MODIFIED = define(2)
    val GIT_STATUS_INDEX_DELETED = define(4)
    val GIT_STATUS_INDEX_RENAMED = define(8)
    val GIT_STATUS_INDEX_TYPECHANGE = define(16)
    val GIT_STATUS_WT_NEW = define(128)
    val GIT_STATUS_WT_MODIFIED = define(256)
    val GIT_STATUS_WT_DELETED = define(512)
    val GIT_STATUS_WT_TYPECHANGE = define(1024)
    val GIT_STATUS_WT_RENAMED = define(2048)
    val GIT_STATUS_WT_UNREADABLE = define(4096)
    val GIT_STATUS_IGNORED = define(16384)
    val GIT_STATUS_CONFLICTED = define(32768)
    inline def getName(inline value: git_status_t): Option[String] =
      inline value match
        case GIT_STATUS_CURRENT          => Some("GIT_STATUS_CURRENT")
        case GIT_STATUS_INDEX_NEW        => Some("GIT_STATUS_INDEX_NEW")
        case GIT_STATUS_INDEX_MODIFIED   => Some("GIT_STATUS_INDEX_MODIFIED")
        case GIT_STATUS_INDEX_DELETED    => Some("GIT_STATUS_INDEX_DELETED")
        case GIT_STATUS_INDEX_RENAMED    => Some("GIT_STATUS_INDEX_RENAMED")
        case GIT_STATUS_INDEX_TYPECHANGE => Some("GIT_STATUS_INDEX_TYPECHANGE")
        case GIT_STATUS_WT_NEW           => Some("GIT_STATUS_WT_NEW")
        case GIT_STATUS_WT_MODIFIED      => Some("GIT_STATUS_WT_MODIFIED")
        case GIT_STATUS_WT_DELETED       => Some("GIT_STATUS_WT_DELETED")
        case GIT_STATUS_WT_TYPECHANGE    => Some("GIT_STATUS_WT_TYPECHANGE")
        case GIT_STATUS_WT_RENAMED       => Some("GIT_STATUS_WT_RENAMED")
        case GIT_STATUS_WT_UNREADABLE    => Some("GIT_STATUS_WT_UNREADABLE")
        case GIT_STATUS_IGNORED          => Some("GIT_STATUS_IGNORED")
        case GIT_STATUS_CONFLICTED       => Some("GIT_STATUS_CONFLICTED")
        case _                           => None
    extension (a: git_status_t)
      inline def &(b: git_status_t): git_status_t = a & b
      inline def |(b: git_status_t): git_status_t = a | b
      inline def is(b: git_status_t): Boolean = (a & b) == b
  end git_status_t

  /** Submodule ignore values
    */
  opaque type git_submodule_ignore_t = CInt
  object git_submodule_ignore_t extends CEnum[git_submodule_ignore_t]:
    given _tag: Tag[git_submodule_ignore_t] = Tag.Int
    inline def define(inline a: CInt): git_submodule_ignore_t = a
    val GIT_SUBMODULE_IGNORE_UNSPECIFIED = define(-1)
    val GIT_SUBMODULE_IGNORE_NONE = define(1)
    val GIT_SUBMODULE_IGNORE_UNTRACKED = define(2)
    val GIT_SUBMODULE_IGNORE_DIRTY = define(3)
    val GIT_SUBMODULE_IGNORE_ALL = define(4)
    inline def getName(inline value: git_submodule_ignore_t): Option[String] =
      inline value match
        case GIT_SUBMODULE_IGNORE_UNSPECIFIED =>
          Some("GIT_SUBMODULE_IGNORE_UNSPECIFIED")
        case GIT_SUBMODULE_IGNORE_NONE => Some("GIT_SUBMODULE_IGNORE_NONE")
        case GIT_SUBMODULE_IGNORE_UNTRACKED =>
          Some("GIT_SUBMODULE_IGNORE_UNTRACKED")
        case GIT_SUBMODULE_IGNORE_DIRTY => Some("GIT_SUBMODULE_IGNORE_DIRTY")
        case GIT_SUBMODULE_IGNORE_ALL   => Some("GIT_SUBMODULE_IGNORE_ALL")
        case _                          => None
    extension (a: git_submodule_ignore_t)
      inline def &(b: git_submodule_ignore_t): git_submodule_ignore_t = a & b
      inline def |(b: git_submodule_ignore_t): git_submodule_ignore_t = a | b
      inline def is(b: git_submodule_ignore_t): Boolean = (a & b) == b
  end git_submodule_ignore_t

  /** Options for submodule recurse.
    */
  opaque type git_submodule_recurse_t = CUnsignedInt
  object git_submodule_recurse_t extends CEnumU[git_submodule_recurse_t]:
    given _tag: Tag[git_submodule_recurse_t] = Tag.UInt
    inline def define(inline a: Long): git_submodule_recurse_t = a.toUInt
    val GIT_SUBMODULE_RECURSE_NO = define(0)
    val GIT_SUBMODULE_RECURSE_YES = define(1)
    val GIT_SUBMODULE_RECURSE_ONDEMAND = define(2)
    inline def getName(inline value: git_submodule_recurse_t): Option[String] =
      inline value match
        case GIT_SUBMODULE_RECURSE_NO  => Some("GIT_SUBMODULE_RECURSE_NO")
        case GIT_SUBMODULE_RECURSE_YES => Some("GIT_SUBMODULE_RECURSE_YES")
        case GIT_SUBMODULE_RECURSE_ONDEMAND =>
          Some("GIT_SUBMODULE_RECURSE_ONDEMAND")
        case _ => None
    extension (a: git_submodule_recurse_t)
      inline def &(b: git_submodule_recurse_t): git_submodule_recurse_t = a & b
      inline def |(b: git_submodule_recurse_t): git_submodule_recurse_t = a | b
      inline def is(b: git_submodule_recurse_t): Boolean = (a & b) == b
  end git_submodule_recurse_t

  /** Return codes for submodule status.
    */
  opaque type git_submodule_status_t = CUnsignedInt
  object git_submodule_status_t extends CEnumU[git_submodule_status_t]:
    given _tag: Tag[git_submodule_status_t] = Tag.UInt
    inline def define(inline a: Long): git_submodule_status_t = a.toUInt
    val GIT_SUBMODULE_STATUS_IN_HEAD = define(1)
    val GIT_SUBMODULE_STATUS_IN_INDEX = define(2)
    val GIT_SUBMODULE_STATUS_IN_CONFIG = define(4)
    val GIT_SUBMODULE_STATUS_IN_WD = define(8)
    val GIT_SUBMODULE_STATUS_INDEX_ADDED = define(16)
    val GIT_SUBMODULE_STATUS_INDEX_DELETED = define(32)
    val GIT_SUBMODULE_STATUS_INDEX_MODIFIED = define(64)
    val GIT_SUBMODULE_STATUS_WD_UNINITIALIZED = define(128)
    val GIT_SUBMODULE_STATUS_WD_ADDED = define(256)
    val GIT_SUBMODULE_STATUS_WD_DELETED = define(512)
    val GIT_SUBMODULE_STATUS_WD_MODIFIED = define(1024)
    val GIT_SUBMODULE_STATUS_WD_INDEX_MODIFIED = define(2048)
    val GIT_SUBMODULE_STATUS_WD_WD_MODIFIED = define(4096)
    val GIT_SUBMODULE_STATUS_WD_UNTRACKED = define(8192)
    inline def getName(inline value: git_submodule_status_t): Option[String] =
      inline value match
        case GIT_SUBMODULE_STATUS_IN_HEAD =>
          Some("GIT_SUBMODULE_STATUS_IN_HEAD")
        case GIT_SUBMODULE_STATUS_IN_INDEX =>
          Some("GIT_SUBMODULE_STATUS_IN_INDEX")
        case GIT_SUBMODULE_STATUS_IN_CONFIG =>
          Some("GIT_SUBMODULE_STATUS_IN_CONFIG")
        case GIT_SUBMODULE_STATUS_IN_WD => Some("GIT_SUBMODULE_STATUS_IN_WD")
        case GIT_SUBMODULE_STATUS_INDEX_ADDED =>
          Some("GIT_SUBMODULE_STATUS_INDEX_ADDED")
        case GIT_SUBMODULE_STATUS_INDEX_DELETED =>
          Some("GIT_SUBMODULE_STATUS_INDEX_DELETED")
        case GIT_SUBMODULE_STATUS_INDEX_MODIFIED =>
          Some("GIT_SUBMODULE_STATUS_INDEX_MODIFIED")
        case GIT_SUBMODULE_STATUS_WD_UNINITIALIZED =>
          Some("GIT_SUBMODULE_STATUS_WD_UNINITIALIZED")
        case GIT_SUBMODULE_STATUS_WD_ADDED =>
          Some("GIT_SUBMODULE_STATUS_WD_ADDED")
        case GIT_SUBMODULE_STATUS_WD_DELETED =>
          Some("GIT_SUBMODULE_STATUS_WD_DELETED")
        case GIT_SUBMODULE_STATUS_WD_MODIFIED =>
          Some("GIT_SUBMODULE_STATUS_WD_MODIFIED")
        case GIT_SUBMODULE_STATUS_WD_INDEX_MODIFIED =>
          Some("GIT_SUBMODULE_STATUS_WD_INDEX_MODIFIED")
        case GIT_SUBMODULE_STATUS_WD_WD_MODIFIED =>
          Some("GIT_SUBMODULE_STATUS_WD_WD_MODIFIED")
        case GIT_SUBMODULE_STATUS_WD_UNTRACKED =>
          Some("GIT_SUBMODULE_STATUS_WD_UNTRACKED")
        case _ => None
    extension (a: git_submodule_status_t)
      inline def &(b: git_submodule_status_t): git_submodule_status_t = a & b
      inline def |(b: git_submodule_status_t): git_submodule_status_t = a | b
      inline def is(b: git_submodule_status_t): Boolean = (a & b) == b
  end git_submodule_status_t

  /** Submodule update values
    */
  opaque type git_submodule_update_t = CUnsignedInt
  object git_submodule_update_t extends CEnumU[git_submodule_update_t]:
    given _tag: Tag[git_submodule_update_t] = Tag.UInt
    inline def define(inline a: Long): git_submodule_update_t = a.toUInt
    val GIT_SUBMODULE_UPDATE_CHECKOUT = define(1)
    val GIT_SUBMODULE_UPDATE_REBASE = define(2)
    val GIT_SUBMODULE_UPDATE_MERGE = define(3)
    val GIT_SUBMODULE_UPDATE_NONE = define(4)
    val GIT_SUBMODULE_UPDATE_DEFAULT = define(0)
    inline def getName(inline value: git_submodule_update_t): Option[String] =
      inline value match
        case GIT_SUBMODULE_UPDATE_CHECKOUT =>
          Some("GIT_SUBMODULE_UPDATE_CHECKOUT")
        case GIT_SUBMODULE_UPDATE_REBASE => Some("GIT_SUBMODULE_UPDATE_REBASE")
        case GIT_SUBMODULE_UPDATE_MERGE  => Some("GIT_SUBMODULE_UPDATE_MERGE")
        case GIT_SUBMODULE_UPDATE_NONE   => Some("GIT_SUBMODULE_UPDATE_NONE")
        case GIT_SUBMODULE_UPDATE_DEFAULT =>
          Some("GIT_SUBMODULE_UPDATE_DEFAULT")
        case _ => None
    extension (a: git_submodule_update_t)
      inline def &(b: git_submodule_update_t): git_submodule_update_t = a & b
      inline def |(b: git_submodule_update_t): git_submodule_update_t = a | b
      inline def is(b: git_submodule_update_t): Boolean = (a & b) == b
  end git_submodule_update_t

  /** Available tracing levels. When tracing is set to a particular level,
    * callers will be provided tracing at the given level and all lower levels.
    */
  opaque type git_trace_level_t = CUnsignedInt
  object git_trace_level_t extends CEnumU[git_trace_level_t]:
    given _tag: Tag[git_trace_level_t] = Tag.UInt
    inline def define(inline a: Long): git_trace_level_t = a.toUInt
    val GIT_TRACE_NONE = define(0)
    val GIT_TRACE_FATAL = define(1)
    val GIT_TRACE_ERROR = define(2)
    val GIT_TRACE_WARN = define(3)
    val GIT_TRACE_INFO = define(4)
    val GIT_TRACE_DEBUG = define(5)
    val GIT_TRACE_TRACE = define(6)
    inline def getName(inline value: git_trace_level_t): Option[String] =
      inline value match
        case GIT_TRACE_NONE  => Some("GIT_TRACE_NONE")
        case GIT_TRACE_FATAL => Some("GIT_TRACE_FATAL")
        case GIT_TRACE_ERROR => Some("GIT_TRACE_ERROR")
        case GIT_TRACE_WARN  => Some("GIT_TRACE_WARN")
        case GIT_TRACE_INFO  => Some("GIT_TRACE_INFO")
        case GIT_TRACE_DEBUG => Some("GIT_TRACE_DEBUG")
        case GIT_TRACE_TRACE => Some("GIT_TRACE_TRACE")
        case _               => None
    extension (a: git_trace_level_t)
      inline def &(b: git_trace_level_t): git_trace_level_t = a & b
      inline def |(b: git_trace_level_t): git_trace_level_t = a | b
      inline def is(b: git_trace_level_t): Boolean = (a & b) == b
  end git_trace_level_t

  /** The kind of update to perform
    */
  opaque type git_tree_update_t = CUnsignedInt
  object git_tree_update_t extends CEnumU[git_tree_update_t]:
    given _tag: Tag[git_tree_update_t] = Tag.UInt
    inline def define(inline a: Long): git_tree_update_t = a.toUInt
    val GIT_TREE_UPDATE_UPSERT = define(0)
    val GIT_TREE_UPDATE_REMOVE = define(1)
    inline def getName(inline value: git_tree_update_t): Option[String] =
      inline value match
        case GIT_TREE_UPDATE_UPSERT => Some("GIT_TREE_UPDATE_UPSERT")
        case GIT_TREE_UPDATE_REMOVE => Some("GIT_TREE_UPDATE_REMOVE")
        case _                      => None
    extension (a: git_tree_update_t)
      inline def &(b: git_tree_update_t): git_tree_update_t = a & b
      inline def |(b: git_tree_update_t): git_tree_update_t = a | b
      inline def is(b: git_tree_update_t): Boolean = (a & b) == b
  end git_tree_update_t

  /** Tree traversal modes
    */
  opaque type git_treewalk_mode = CUnsignedInt
  object git_treewalk_mode extends CEnumU[git_treewalk_mode]:
    given _tag: Tag[git_treewalk_mode] = Tag.UInt
    inline def define(inline a: Long): git_treewalk_mode = a.toUInt
    val GIT_TREEWALK_PRE = define(0)
    val GIT_TREEWALK_POST = define(1)
    inline def getName(inline value: git_treewalk_mode): Option[String] =
      inline value match
        case GIT_TREEWALK_PRE  => Some("GIT_TREEWALK_PRE")
        case GIT_TREEWALK_POST => Some("GIT_TREEWALK_POST")
        case _                 => None
    extension (a: git_treewalk_mode)
      inline def &(b: git_treewalk_mode): git_treewalk_mode = a & b
      inline def |(b: git_treewalk_mode): git_treewalk_mode = a | b
      inline def is(b: git_treewalk_mode): Boolean = (a & b) == b
  end git_treewalk_mode

  /** Flags which can be passed to git_worktree_prune to alter its behavior.
    */
  opaque type git_worktree_prune_t = CUnsignedInt
  object git_worktree_prune_t extends CEnumU[git_worktree_prune_t]:
    given _tag: Tag[git_worktree_prune_t] = Tag.UInt
    inline def define(inline a: Long): git_worktree_prune_t = a.toUInt
    val GIT_WORKTREE_PRUNE_VALID = define(1)
    val GIT_WORKTREE_PRUNE_LOCKED = define(2)
    val GIT_WORKTREE_PRUNE_WORKING_TREE = define(4)
    inline def getName(inline value: git_worktree_prune_t): Option[String] =
      inline value match
        case GIT_WORKTREE_PRUNE_VALID  => Some("GIT_WORKTREE_PRUNE_VALID")
        case GIT_WORKTREE_PRUNE_LOCKED => Some("GIT_WORKTREE_PRUNE_LOCKED")
        case GIT_WORKTREE_PRUNE_WORKING_TREE =>
          Some("GIT_WORKTREE_PRUNE_WORKING_TREE")
        case _ => None
    extension (a: git_worktree_prune_t)
      inline def &(b: git_worktree_prune_t): git_worktree_prune_t = a & b
      inline def |(b: git_worktree_prune_t): git_worktree_prune_t = a | b
      inline def is(b: git_worktree_prune_t): Boolean = (a & b) == b
  end git_worktree_prune_t
end enumerations

object aliases:
  import _root_.libgit.enumerations.*
  import _root_.libgit.predef.*
  import _root_.libgit.aliases.*
  import _root_.libgit.structs.*

  /** When applying a patch, callback that will be made per delta (file).
    */
  opaque type git_apply_delta_cb =
    CFuncPtr2[Ptr[git_diff_delta], Ptr[Byte], CInt]
  object git_apply_delta_cb:
    given _tag: Tag[git_apply_delta_cb] =
      Tag.materializeCFuncPtr2[Ptr[git_diff_delta], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_apply_delta_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[git_diff_delta], Ptr[Byte], CInt]
    ): git_apply_delta_cb = o
    extension (v: git_apply_delta_cb)
      inline def value: CFuncPtr2[Ptr[git_diff_delta], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_apply_delta_cb

  /** When applying a patch, callback that will be made per hunk.
    */
  opaque type git_apply_hunk_cb = CFuncPtr2[Ptr[git_diff_hunk], Ptr[Byte], CInt]
  object git_apply_hunk_cb:
    given _tag: Tag[git_apply_hunk_cb] =
      Tag.materializeCFuncPtr2[Ptr[git_diff_hunk], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_apply_hunk_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[git_diff_hunk], Ptr[Byte], CInt]
    ): git_apply_hunk_cb = o
    extension (v: git_apply_hunk_cb)
      inline def value: CFuncPtr2[Ptr[git_diff_hunk], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_apply_hunk_cb

  /** The callback used with git_attr_foreach.
    */
  opaque type git_attr_foreach_cb = CFuncPtr3[CString, CString, Ptr[Byte], CInt]
  object git_attr_foreach_cb:
    given _tag: Tag[git_attr_foreach_cb] =
      Tag.materializeCFuncPtr3[CString, CString, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_attr_foreach_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[CString, CString, Ptr[Byte], CInt]
    ): git_attr_foreach_cb = o
    extension (v: git_attr_foreach_cb)
      inline def value: CFuncPtr3[CString, CString, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_attr_foreach_cb

  /** */
  type git_attr_t = git_attr_value_t
  object git_attr_t:
    given _tag: Tag[git_attr_t] = git_attr_value_t._tag
    inline def apply(inline o: git_attr_value_t): git_attr_t = o
    extension (v: git_attr_t) inline def value: git_attr_value_t = v

  /** Checkout notification callback function
    */
  opaque type git_checkout_notify_cb =
    CFuncPtr6[git_checkout_notify_t, CString, Ptr[git_diff_file], Ptr[
      git_diff_file
    ], Ptr[git_diff_file], Ptr[Byte], CInt]
  object git_checkout_notify_cb:
    given _tag: Tag[git_checkout_notify_cb] =
      Tag.materializeCFuncPtr6[git_checkout_notify_t, CString, Ptr[
        git_diff_file
      ], Ptr[git_diff_file], Ptr[git_diff_file], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_checkout_notify_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr6[git_checkout_notify_t, CString, Ptr[
          git_diff_file
        ], Ptr[git_diff_file], Ptr[git_diff_file], Ptr[Byte], CInt]
    ): git_checkout_notify_cb = o
    extension (v: git_checkout_notify_cb)
      inline def value: CFuncPtr6[git_checkout_notify_t, CString, Ptr[
        git_diff_file
      ], Ptr[git_diff_file], Ptr[git_diff_file], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_checkout_notify_cb

  /** Checkout perfdata notification function
    */
  opaque type git_checkout_perfdata_cb =
    CFuncPtr2[Ptr[git_checkout_perfdata], Ptr[Byte], Unit]
  object git_checkout_perfdata_cb:
    given _tag: Tag[git_checkout_perfdata_cb] =
      Tag.materializeCFuncPtr2[Ptr[git_checkout_perfdata], Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): git_checkout_perfdata_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[git_checkout_perfdata], Ptr[Byte], Unit]
    ): git_checkout_perfdata_cb = o
    extension (v: git_checkout_perfdata_cb)
      inline def value: CFuncPtr2[Ptr[git_checkout_perfdata], Ptr[Byte], Unit] =
        v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_checkout_perfdata_cb

  /** Checkout progress notification function
    */
  opaque type git_checkout_progress_cb =
    CFuncPtr4[CString, size_t, size_t, Ptr[Byte], Unit]
  object git_checkout_progress_cb:
    given _tag: Tag[git_checkout_progress_cb] =
      Tag.materializeCFuncPtr4[CString, size_t, size_t, Ptr[Byte], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): git_checkout_progress_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[CString, size_t, size_t, Ptr[Byte], Unit]
    ): git_checkout_progress_cb = o
    extension (v: git_checkout_progress_cb)
      inline def value: CFuncPtr4[CString, size_t, size_t, Ptr[Byte], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_checkout_progress_cb

  /** Commit creation callback: used when a function is going to create commits
    * (for example, in `git_rebase_commit`) to allow callers to override the
    * commit creation behavior. For example, users may wish to sign commits by
    * providing this information to `git_commit_create_buffer`, signing that
    * buffer, then calling `git_commit_create_with_signature`. The resultant
    * commit id should be set in the `out` object id parameter.
    */
  opaque type git_commit_create_cb = CFuncPtr9[Ptr[git_oid], Ptr[
    git_signature
  ], Ptr[git_signature], CString, CString, Ptr[git_tree], size_t, Ptr[
    Ptr[git_commit]
  ], Ptr[Byte], CInt]
  object git_commit_create_cb:
    given _tag: Tag[git_commit_create_cb] = Tag.materializeCFuncPtr9[Ptr[
      git_oid
    ], Ptr[git_signature], Ptr[git_signature], CString, CString, Ptr[
      git_tree
    ], size_t, Ptr[Ptr[git_commit]], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_commit_create_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr9[Ptr[git_oid], Ptr[git_signature], Ptr[
          git_signature
        ], CString, CString, Ptr[git_tree], size_t, Ptr[Ptr[git_commit]], Ptr[
          Byte
        ], CInt]
    ): git_commit_create_cb = o
    extension (v: git_commit_create_cb)
      inline def value: CFuncPtr9[Ptr[git_oid], Ptr[git_signature], Ptr[
        git_signature
      ], CString, CString, Ptr[git_tree], size_t, Ptr[Ptr[git_commit]], Ptr[
        Byte
      ], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_commit_create_cb

  /** Provide a commit signature during commit creation.
    */
  opaque type git_commit_signing_cb =
    CFuncPtr4[Ptr[git_buf], Ptr[git_buf], CString, Ptr[Byte], CInt]
  object git_commit_signing_cb:
    given _tag: Tag[git_commit_signing_cb] = Tag.materializeCFuncPtr4[Ptr[
      git_buf
    ], Ptr[git_buf], CString, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_commit_signing_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[Ptr[git_buf], Ptr[git_buf], CString, Ptr[
          Byte
        ], CInt]
    ): git_commit_signing_cb = o
    extension (v: git_commit_signing_cb)
      inline def value
          : CFuncPtr4[Ptr[git_buf], Ptr[git_buf], CString, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_commit_signing_cb

  /** A config enumeration callback
    */
  opaque type git_config_foreach_cb =
    CFuncPtr2[Ptr[git_config_entry], Ptr[Byte], CInt]
  object git_config_foreach_cb:
    given _tag: Tag[git_config_foreach_cb] =
      Tag.materializeCFuncPtr2[Ptr[git_config_entry], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_config_foreach_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[git_config_entry], Ptr[Byte], CInt]
    ): git_config_foreach_cb = o
    extension (v: git_config_foreach_cb)
      inline def value: CFuncPtr2[Ptr[git_config_entry], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_config_foreach_cb

  /** These types are retained for backward compatibility. The newer versions of
    * these values should be preferred in all new code.
    */
  type git_cred = git_credential
  object git_cred:
    given _tag: Tag[git_cred] = git_credential._tag
    inline def apply(inline o: git_credential): git_cred = o
    extension (v: git_cred) inline def value: git_credential = v

  /** */
  type git_cred_acquire_cb = git_credential_acquire_cb
  object git_cred_acquire_cb:
    given _tag: Tag[git_cred_acquire_cb] = git_credential_acquire_cb._tag
    inline def apply(inline o: git_credential_acquire_cb): git_cred_acquire_cb =
      o
    extension (v: git_cred_acquire_cb)
      inline def value: git_credential_acquire_cb = v

  /** */
  type git_cred_default = git_credential_default
  object git_cred_default:
    given _tag: Tag[git_cred_default] = git_credential_default._tag
    inline def apply(inline o: git_credential_default): git_cred_default = o
    extension (v: git_cred_default) inline def value: git_credential_default = v

  /** */
  type git_cred_sign_callback = git_credential_sign_cb
  object git_cred_sign_callback:
    given _tag: Tag[git_cred_sign_callback] = git_credential_sign_cb._tag
    inline def apply(inline o: git_credential_sign_cb): git_cred_sign_callback =
      o
    extension (v: git_cred_sign_callback)
      inline def value: git_credential_sign_cb = v

  /** */
  type git_cred_sign_cb = git_credential_sign_cb
  object git_cred_sign_cb:
    given _tag: Tag[git_cred_sign_cb] = git_credential_sign_cb._tag
    inline def apply(inline o: git_credential_sign_cb): git_cred_sign_cb = o
    extension (v: git_cred_sign_cb) inline def value: git_credential_sign_cb = v

  /** */
  type git_cred_ssh_custom = git_credential_ssh_custom
  object git_cred_ssh_custom:
    given _tag: Tag[git_cred_ssh_custom] = git_credential_ssh_custom._tag
    inline def apply(inline o: git_credential_ssh_custom): git_cred_ssh_custom =
      o
    extension (v: git_cred_ssh_custom)
      inline def value: git_credential_ssh_custom = v

  /** */
  type git_cred_ssh_interactive = git_credential_ssh_interactive
  object git_cred_ssh_interactive:
    given _tag: Tag[git_cred_ssh_interactive] =
      git_credential_ssh_interactive._tag
    inline def apply(
        inline o: git_credential_ssh_interactive
    ): git_cred_ssh_interactive = o
    extension (v: git_cred_ssh_interactive)
      inline def value: git_credential_ssh_interactive = v

  /** */
  type git_cred_ssh_interactive_callback = git_credential_ssh_interactive_cb
  object git_cred_ssh_interactive_callback:
    given _tag: Tag[git_cred_ssh_interactive_callback] =
      git_credential_ssh_interactive_cb._tag
    inline def apply(
        inline o: git_credential_ssh_interactive_cb
    ): git_cred_ssh_interactive_callback = o
    extension (v: git_cred_ssh_interactive_callback)
      inline def value: git_credential_ssh_interactive_cb = v

  /** */
  type git_cred_ssh_interactive_cb = git_credential_ssh_interactive_cb
  object git_cred_ssh_interactive_cb:
    given _tag: Tag[git_cred_ssh_interactive_cb] =
      git_credential_ssh_interactive_cb._tag
    inline def apply(
        inline o: git_credential_ssh_interactive_cb
    ): git_cred_ssh_interactive_cb = o
    extension (v: git_cred_ssh_interactive_cb)
      inline def value: git_credential_ssh_interactive_cb = v

  /** */
  type git_cred_ssh_key = git_credential_ssh_key
  object git_cred_ssh_key:
    given _tag: Tag[git_cred_ssh_key] = git_credential_ssh_key._tag
    inline def apply(inline o: git_credential_ssh_key): git_cred_ssh_key = o
    extension (v: git_cred_ssh_key) inline def value: git_credential_ssh_key = v

  /** */
  type git_cred_username = git_credential_username
  object git_cred_username:
    given _tag: Tag[git_cred_username] = git_credential_username._tag
    inline def apply(inline o: git_credential_username): git_cred_username = o
    extension (v: git_cred_username)
      inline def value: git_credential_username = v

  /** */
  type git_cred_userpass_payload = git_credential_userpass_payload
  object git_cred_userpass_payload:
    given _tag: Tag[git_cred_userpass_payload] =
      git_credential_userpass_payload._tag
    inline def apply(
        inline o: git_credential_userpass_payload
    ): git_cred_userpass_payload = o
    extension (v: git_cred_userpass_payload)
      inline def value: git_credential_userpass_payload = v

  /** */
  type git_cred_userpass_plaintext = git_credential_userpass_plaintext
  object git_cred_userpass_plaintext:
    given _tag: Tag[git_cred_userpass_plaintext] =
      git_credential_userpass_plaintext._tag
    inline def apply(
        inline o: git_credential_userpass_plaintext
    ): git_cred_userpass_plaintext = o
    extension (v: git_cred_userpass_plaintext)
      inline def value: git_credential_userpass_plaintext = v

  /** Credential acquisition callback.
    */
  opaque type git_credential_acquire_cb = CFuncPtr5[Ptr[
    Ptr[git_credential]
  ], CString, CString, CUnsignedInt, Ptr[Byte], CInt]
  object git_credential_acquire_cb:
    given _tag: Tag[git_credential_acquire_cb] = Tag.materializeCFuncPtr5[Ptr[
      Ptr[git_credential]
    ], CString, CString, CUnsignedInt, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_credential_acquire_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr5[Ptr[
          Ptr[git_credential]
        ], CString, CString, CUnsignedInt, Ptr[Byte], CInt]
    ): git_credential_acquire_cb = o
    extension (v: git_credential_acquire_cb)
      inline def value: CFuncPtr5[Ptr[
        Ptr[git_credential]
      ], CString, CString, CUnsignedInt, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_credential_acquire_cb

  /** */
  opaque type git_credential_sign_cb = CFuncPtr6[Ptr[LIBSSH2_SESSION], Ptr[
    Ptr[CUnsignedChar]
  ], Ptr[size_t], Ptr[CUnsignedChar], size_t, Ptr[Ptr[Byte]], CInt]
  object git_credential_sign_cb:
    given _tag: Tag[git_credential_sign_cb] =
      Tag.materializeCFuncPtr6[Ptr[LIBSSH2_SESSION], Ptr[
        Ptr[CUnsignedChar]
      ], Ptr[size_t], Ptr[CUnsignedChar], size_t, Ptr[Ptr[Byte]], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_credential_sign_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr6[Ptr[LIBSSH2_SESSION], Ptr[Ptr[CUnsignedChar]], Ptr[
          size_t
        ], Ptr[CUnsignedChar], size_t, Ptr[Ptr[Byte]], CInt]
    ): git_credential_sign_cb = o
    extension (v: git_credential_sign_cb)
      inline def value: CFuncPtr6[Ptr[LIBSSH2_SESSION], Ptr[
        Ptr[CUnsignedChar]
      ], Ptr[size_t], Ptr[CUnsignedChar], size_t, Ptr[Ptr[Byte]], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_credential_sign_cb

  /** */
  opaque type git_credential_ssh_interactive_cb =
    CFuncPtr8[CString, CInt, CString, CInt, CInt, Ptr[
      LIBSSH2_USERAUTH_KBDINT_PROMPT
    ], Ptr[LIBSSH2_USERAUTH_KBDINT_RESPONSE], Ptr[Ptr[Byte]], Unit]
  object git_credential_ssh_interactive_cb:
    given _tag: Tag[git_credential_ssh_interactive_cb] =
      Tag.materializeCFuncPtr8[CString, CInt, CString, CInt, CInt, Ptr[
        LIBSSH2_USERAUTH_KBDINT_PROMPT
      ], Ptr[LIBSSH2_USERAUTH_KBDINT_RESPONSE], Ptr[Ptr[Byte]], Unit]
    inline def fromPtr(ptr: Ptr[Byte]): git_credential_ssh_interactive_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr8[CString, CInt, CString, CInt, CInt, Ptr[
          LIBSSH2_USERAUTH_KBDINT_PROMPT
        ], Ptr[LIBSSH2_USERAUTH_KBDINT_RESPONSE], Ptr[Ptr[Byte]], Unit]
    ): git_credential_ssh_interactive_cb = o
    extension (v: git_credential_ssh_interactive_cb)
      inline def value: CFuncPtr8[CString, CInt, CString, CInt, CInt, Ptr[
        LIBSSH2_USERAUTH_KBDINT_PROMPT
      ], Ptr[LIBSSH2_USERAUTH_KBDINT_RESPONSE], Ptr[Ptr[Byte]], Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_credential_ssh_interactive_cb

  /** */
  type git_cvar_map = git_configmap
  object git_cvar_map:
    given _tag: Tag[git_cvar_map] = git_configmap._tag
    inline def apply(inline o: git_configmap): git_cvar_map = o
    extension (v: git_cvar_map) inline def value: git_configmap = v

  /** When iterating over a diff, callback that will be made for binary content
    * within the diff.
    */
  opaque type git_diff_binary_cb =
    CFuncPtr3[Ptr[git_diff_delta], Ptr[git_diff_binary], Ptr[Byte], CInt]
  object git_diff_binary_cb:
    given _tag: Tag[git_diff_binary_cb] = Tag.materializeCFuncPtr3[Ptr[
      git_diff_delta
    ], Ptr[git_diff_binary], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_diff_binary_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[git_diff_delta], Ptr[git_diff_binary], Ptr[
          Byte
        ], CInt]
    ): git_diff_binary_cb = o
    extension (v: git_diff_binary_cb)
      inline def value: CFuncPtr3[Ptr[git_diff_delta], Ptr[
        git_diff_binary
      ], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_diff_binary_cb

  /** When iterating over a diff, callback that will be made per file.
    */
  opaque type git_diff_file_cb =
    CFuncPtr3[Ptr[git_diff_delta], Float, Ptr[Byte], CInt]
  object git_diff_file_cb:
    given _tag: Tag[git_diff_file_cb] =
      Tag.materializeCFuncPtr3[Ptr[git_diff_delta], Float, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_diff_file_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[git_diff_delta], Float, Ptr[Byte], CInt]
    ): git_diff_file_cb = o
    extension (v: git_diff_file_cb)
      inline def value: CFuncPtr3[Ptr[git_diff_delta], Float, Ptr[Byte], CInt] =
        v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_diff_file_cb

  /** When iterating over a diff, callback that will be made per hunk.
    */
  opaque type git_diff_hunk_cb =
    CFuncPtr3[Ptr[git_diff_delta], Ptr[git_diff_hunk], Ptr[Byte], CInt]
  object git_diff_hunk_cb:
    given _tag: Tag[git_diff_hunk_cb] = Tag.materializeCFuncPtr3[Ptr[
      git_diff_delta
    ], Ptr[git_diff_hunk], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_diff_hunk_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[git_diff_delta], Ptr[git_diff_hunk], Ptr[
          Byte
        ], CInt]
    ): git_diff_hunk_cb = o
    extension (v: git_diff_hunk_cb)
      inline def value: CFuncPtr3[Ptr[git_diff_delta], Ptr[git_diff_hunk], Ptr[
        Byte
      ], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_diff_hunk_cb

  /** When iterating over a diff, callback that will be made per text diff line.
    * In this context, the provided range will be NULL.
    */
  opaque type git_diff_line_cb = CFuncPtr4[Ptr[git_diff_delta], Ptr[
    git_diff_hunk
  ], Ptr[git_diff_line], Ptr[Byte], CInt]
  object git_diff_line_cb:
    given _tag: Tag[git_diff_line_cb] = Tag.materializeCFuncPtr4[Ptr[
      git_diff_delta
    ], Ptr[git_diff_hunk], Ptr[git_diff_line], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_diff_line_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[Ptr[git_diff_delta], Ptr[git_diff_hunk], Ptr[
          git_diff_line
        ], Ptr[Byte], CInt]
    ): git_diff_line_cb = o
    extension (v: git_diff_line_cb)
      inline def value: CFuncPtr4[Ptr[git_diff_delta], Ptr[git_diff_hunk], Ptr[
        git_diff_line
      ], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_diff_line_cb

  /** Diff notification callback function.
    */
  opaque type git_diff_notify_cb =
    CFuncPtr4[Ptr[git_diff], Ptr[git_diff_delta], CString, Ptr[Byte], CInt]
  object git_diff_notify_cb:
    given _tag: Tag[git_diff_notify_cb] = Tag.materializeCFuncPtr4[Ptr[
      git_diff
    ], Ptr[git_diff_delta], CString, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_diff_notify_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[Ptr[git_diff], Ptr[git_diff_delta], CString, Ptr[
          Byte
        ], CInt]
    ): git_diff_notify_cb = o
    extension (v: git_diff_notify_cb)
      inline def value: CFuncPtr4[Ptr[git_diff], Ptr[
        git_diff_delta
      ], CString, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_diff_notify_cb

  /** Diff progress callback.
    */
  opaque type git_diff_progress_cb =
    CFuncPtr4[Ptr[git_diff], CString, CString, Ptr[Byte], CInt]
  object git_diff_progress_cb:
    given _tag: Tag[git_diff_progress_cb] =
      Tag.materializeCFuncPtr4[Ptr[git_diff], CString, CString, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_diff_progress_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[Ptr[git_diff], CString, CString, Ptr[Byte], CInt]
    ): git_diff_progress_cb = o
    extension (v: git_diff_progress_cb)
      inline def value
          : CFuncPtr4[Ptr[git_diff], CString, CString, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_diff_progress_cb

  /** Callback for listing the remote heads
    */
  opaque type git_headlist_cb = CFuncPtr2[Ptr[git_remote_head], Ptr[Byte], CInt]
  object git_headlist_cb:
    given _tag: Tag[git_headlist_cb] =
      Tag.materializeCFuncPtr2[Ptr[git_remote_head], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_headlist_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[git_remote_head], Ptr[Byte], CInt]
    ): git_headlist_cb = o
    extension (v: git_headlist_cb)
      inline def value: CFuncPtr2[Ptr[git_remote_head], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_headlist_cb

  /** Callback for APIs that add/remove/update files matching pathspec
    */
  opaque type git_index_matched_path_cb =
    CFuncPtr3[CString, CString, Ptr[Byte], CInt]
  object git_index_matched_path_cb:
    given _tag: Tag[git_index_matched_path_cb] =
      Tag.materializeCFuncPtr3[CString, CString, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_index_matched_path_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[CString, CString, Ptr[Byte], CInt]
    ): git_index_matched_path_cb = o
    extension (v: git_index_matched_path_cb)
      inline def value: CFuncPtr3[CString, CString, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_index_matched_path_cb

  /** Type for progress callbacks during indexing. Return a value less than zero
    * to cancel the indexing or download.
    */
  opaque type git_indexer_progress_cb =
    CFuncPtr2[Ptr[git_indexer_progress], Ptr[Byte], CInt]
  object git_indexer_progress_cb:
    given _tag: Tag[git_indexer_progress_cb] =
      Tag.materializeCFuncPtr2[Ptr[git_indexer_progress], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_indexer_progress_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[git_indexer_progress], Ptr[Byte], CInt]
    ): git_indexer_progress_cb = o
    extension (v: git_indexer_progress_cb)
      inline def value: CFuncPtr2[Ptr[git_indexer_progress], Ptr[Byte], CInt] =
        v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_indexer_progress_cb

  /** Callback for git_note_foreach.
    */
  opaque type git_note_foreach_cb =
    CFuncPtr3[Ptr[git_oid], Ptr[git_oid], Ptr[Byte], CInt]
  object git_note_foreach_cb:
    given _tag: Tag[git_note_foreach_cb] =
      Tag.materializeCFuncPtr3[Ptr[git_oid], Ptr[git_oid], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_note_foreach_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[git_oid], Ptr[git_oid], Ptr[Byte], CInt]
    ): git_note_foreach_cb = o
    extension (v: git_note_foreach_cb)
      inline def value: CFuncPtr3[Ptr[git_oid], Ptr[git_oid], Ptr[Byte], CInt] =
        v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_note_foreach_cb

  /** The maximum size of an object
    */
  type git_object_size_t = uint64_t
  object git_object_size_t:
    given _tag: Tag[git_object_size_t] = uint64_t._tag
    inline def apply(inline o: uint64_t): git_object_size_t = o
    extension (v: git_object_size_t) inline def value: uint64_t = v

  /** Function type for callbacks from git_odb_foreach.
    */
  opaque type git_odb_foreach_cb = CFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt]
  object git_odb_foreach_cb:
    given _tag: Tag[git_odb_foreach_cb] =
      Tag.materializeCFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_odb_foreach_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt]
    ): git_odb_foreach_cb = o
    extension (v: git_odb_foreach_cb)
      inline def value: CFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_odb_foreach_cb

  /** */
  type git_off_t = int64_t
  object git_off_t:
    given _tag: Tag[git_off_t] = int64_t._tag
    inline def apply(inline o: int64_t): git_off_t = o
    extension (v: git_off_t) inline def value: int64_t = v

  /** Callback used to iterate over packed objects
    */
  opaque type git_packbuilder_foreach_cb =
    CFuncPtr3[Ptr[Byte], size_t, Ptr[Byte], CInt]
  object git_packbuilder_foreach_cb:
    given _tag: Tag[git_packbuilder_foreach_cb] =
      Tag.materializeCFuncPtr3[Ptr[Byte], size_t, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_packbuilder_foreach_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], size_t, Ptr[Byte], CInt]
    ): git_packbuilder_foreach_cb = o
    extension (v: git_packbuilder_foreach_cb)
      inline def value: CFuncPtr3[Ptr[Byte], size_t, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_packbuilder_foreach_cb

  /** Packbuilder progress notification function
    */
  opaque type git_packbuilder_progress =
    CFuncPtr4[CInt, uint32_t, uint32_t, Ptr[Byte], CInt]
  object git_packbuilder_progress:
    given _tag: Tag[git_packbuilder_progress] =
      Tag.materializeCFuncPtr4[CInt, uint32_t, uint32_t, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_packbuilder_progress =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[CInt, uint32_t, uint32_t, Ptr[Byte], CInt]
    ): git_packbuilder_progress = o
    extension (v: git_packbuilder_progress)
      inline def value: CFuncPtr4[CInt, uint32_t, uint32_t, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_packbuilder_progress

  /** Callback used to inform of upcoming updates.
    */
  opaque type git_push_negotiation =
    CFuncPtr3[Ptr[Ptr[git_push_update]], size_t, Ptr[Byte], CInt]
  object git_push_negotiation:
    given _tag: Tag[git_push_negotiation] = Tag
      .materializeCFuncPtr3[Ptr[Ptr[git_push_update]], size_t, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_push_negotiation =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[Ptr[git_push_update]], size_t, Ptr[Byte], CInt]
    ): git_push_negotiation = o
    extension (v: git_push_negotiation)
      inline def value
          : CFuncPtr3[Ptr[Ptr[git_push_update]], size_t, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_push_negotiation

  /** Type definition for push transfer progress callbacks.
    */
  type git_push_transfer_progress = git_push_transfer_progress_cb
  object git_push_transfer_progress:
    given _tag: Tag[git_push_transfer_progress] =
      git_push_transfer_progress_cb._tag
    inline def apply(
        inline o: git_push_transfer_progress_cb
    ): git_push_transfer_progress = o
    extension (v: git_push_transfer_progress)
      inline def value: git_push_transfer_progress_cb = v

  /** Push network progress notification function
    */
  opaque type git_push_transfer_progress_cb =
    CFuncPtr4[CUnsignedInt, CUnsignedInt, size_t, Ptr[Byte], CInt]
  object git_push_transfer_progress_cb:
    given _tag: Tag[git_push_transfer_progress_cb] = Tag
      .materializeCFuncPtr4[CUnsignedInt, CUnsignedInt, size_t, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_push_transfer_progress_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[CUnsignedInt, CUnsignedInt, size_t, Ptr[Byte], CInt]
    ): git_push_transfer_progress_cb = o
    extension (v: git_push_transfer_progress_cb)
      inline def value
          : CFuncPtr4[CUnsignedInt, CUnsignedInt, size_t, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_push_transfer_progress_cb

  /** Callback used to inform of the update status from the remote.
    */
  opaque type git_push_update_reference_cb =
    CFuncPtr3[CString, CString, Ptr[Byte], CInt]
  object git_push_update_reference_cb:
    given _tag: Tag[git_push_update_reference_cb] =
      Tag.materializeCFuncPtr3[CString, CString, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_push_update_reference_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[CString, CString, Ptr[Byte], CInt]
    ): git_push_update_reference_cb = o
    extension (v: git_push_update_reference_cb)
      inline def value: CFuncPtr3[CString, CString, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_push_update_reference_cb

  /** Callback used to iterate over references
    */
  opaque type git_reference_foreach_cb =
    CFuncPtr2[Ptr[git_reference], Ptr[Byte], CInt]
  object git_reference_foreach_cb:
    given _tag: Tag[git_reference_foreach_cb] =
      Tag.materializeCFuncPtr2[Ptr[git_reference], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_reference_foreach_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[git_reference], Ptr[Byte], CInt]
    ): git_reference_foreach_cb = o
    extension (v: git_reference_foreach_cb)
      inline def value: CFuncPtr2[Ptr[git_reference], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_reference_foreach_cb

  /** Callback used to iterate over reference names
    */
  opaque type git_reference_foreach_name_cb =
    CFuncPtr2[CString, Ptr[Byte], CInt]
  object git_reference_foreach_name_cb:
    given _tag: Tag[git_reference_foreach_name_cb] =
      Tag.materializeCFuncPtr2[CString, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_reference_foreach_name_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[CString, Ptr[Byte], CInt]
    ): git_reference_foreach_name_cb = o
    extension (v: git_reference_foreach_name_cb)
      inline def value: CFuncPtr2[CString, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_reference_foreach_name_cb

  /** The signature of a function matching git_remote_create, with an additional
    * void* as a callback payload.
    */
  opaque type git_remote_create_cb = CFuncPtr5[Ptr[Ptr[git_remote]], Ptr[
    git_repository
  ], CString, CString, Ptr[Byte], CInt]
  object git_remote_create_cb:
    given _tag: Tag[git_remote_create_cb] = Tag.materializeCFuncPtr5[Ptr[
      Ptr[git_remote]
    ], Ptr[git_repository], CString, CString, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_remote_create_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr5[Ptr[Ptr[git_remote]], Ptr[
          git_repository
        ], CString, CString, Ptr[Byte], CInt]
    ): git_remote_create_cb = o
    extension (v: git_remote_create_cb)
      inline def value: CFuncPtr5[Ptr[Ptr[git_remote]], Ptr[
        git_repository
      ], CString, CString, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_remote_create_cb

  /** Callback invoked immediately before we attempt to connect to the given
    * url. Callers may change the URL before the connection by calling
    * `git_remote_set_instance_url` in the callback.
    */
  opaque type git_remote_ready_cb =
    CFuncPtr3[Ptr[git_remote], CInt, Ptr[Byte], CInt]
  object git_remote_ready_cb:
    given _tag: Tag[git_remote_ready_cb] =
      Tag.materializeCFuncPtr3[Ptr[git_remote], CInt, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_remote_ready_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[git_remote], CInt, Ptr[Byte], CInt]
    ): git_remote_ready_cb = o
    extension (v: git_remote_ready_cb)
      inline def value: CFuncPtr3[Ptr[git_remote], CInt, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_remote_ready_cb

  /** The signature of a function matching git_repository_init, with an
    * additional void * as callback payload.
    */
  opaque type git_repository_create_cb =
    CFuncPtr4[Ptr[Ptr[git_repository]], CString, CInt, Ptr[Byte], CInt]
  object git_repository_create_cb:
    given _tag: Tag[git_repository_create_cb] = Tag.materializeCFuncPtr4[Ptr[
      Ptr[git_repository]
    ], CString, CInt, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_repository_create_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[Ptr[Ptr[git_repository]], CString, CInt, Ptr[
          Byte
        ], CInt]
    ): git_repository_create_cb = o
    extension (v: git_repository_create_cb)
      inline def value: CFuncPtr4[Ptr[Ptr[git_repository]], CString, CInt, Ptr[
        Byte
      ], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_repository_create_cb

  /** Callback used to iterate over each FETCH_HEAD entry
    */
  opaque type git_repository_fetchhead_foreach_cb =
    CFuncPtr5[CString, CString, Ptr[git_oid], CUnsignedInt, Ptr[Byte], CInt]
  object git_repository_fetchhead_foreach_cb:
    given _tag: Tag[git_repository_fetchhead_foreach_cb] =
      Tag.materializeCFuncPtr5[CString, CString, Ptr[
        git_oid
      ], CUnsignedInt, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_repository_fetchhead_foreach_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr5[CString, CString, Ptr[git_oid], CUnsignedInt, Ptr[
          Byte
        ], CInt]
    ): git_repository_fetchhead_foreach_cb = o
    extension (v: git_repository_fetchhead_foreach_cb)
      inline def value: CFuncPtr5[CString, CString, Ptr[
        git_oid
      ], CUnsignedInt, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_repository_fetchhead_foreach_cb

  /** Callback used to iterate over each MERGE_HEAD entry
    */
  opaque type git_repository_mergehead_foreach_cb =
    CFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt]
  object git_repository_mergehead_foreach_cb:
    given _tag: Tag[git_repository_mergehead_foreach_cb] =
      Tag.materializeCFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_repository_mergehead_foreach_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt]
    ): git_repository_mergehead_foreach_cb = o
    extension (v: git_repository_mergehead_foreach_cb)
      inline def value: CFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_repository_mergehead_foreach_cb

  /** These enumeration values are retained for backward compatibility. The
    * newer versions of these values should be preferred in all new code.
    */
  type git_revparse_mode_t = git_revspec_t
  object git_revparse_mode_t:
    given _tag: Tag[git_revparse_mode_t] = git_revspec_t._tag
    inline def apply(inline o: git_revspec_t): git_revparse_mode_t = o
    extension (v: git_revparse_mode_t) inline def value: git_revspec_t = v

  /** This is a callback function that user can provide to hide a commit and its
    * parents. If the callback function returns non-zero value, then this commit
    * and its parents will be hidden.
    */
  opaque type git_revwalk_hide_cb = CFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt]
  object git_revwalk_hide_cb:
    given _tag: Tag[git_revwalk_hide_cb] =
      Tag.materializeCFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_revwalk_hide_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt]
    ): git_revwalk_hide_cb = o
    extension (v: git_revwalk_hide_cb)
      inline def value: CFuncPtr2[Ptr[git_oid], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_revwalk_hide_cb

  /** Stash application progress notification function. Return 0 to continue
    * processing, or a negative value to abort the stash application.
    */
  opaque type git_stash_apply_progress_cb =
    CFuncPtr2[git_stash_apply_progress_t, Ptr[Byte], CInt]
  object git_stash_apply_progress_cb:
    given _tag: Tag[git_stash_apply_progress_cb] =
      Tag.materializeCFuncPtr2[git_stash_apply_progress_t, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_stash_apply_progress_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[git_stash_apply_progress_t, Ptr[Byte], CInt]
    ): git_stash_apply_progress_cb = o
    extension (v: git_stash_apply_progress_cb)
      inline def value: CFuncPtr2[git_stash_apply_progress_t, Ptr[Byte], CInt] =
        v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_stash_apply_progress_cb

  /** This is a callback function you can provide to iterate over all the
    * stashed states that will be invoked per entry.
    */
  opaque type git_stash_cb =
    CFuncPtr4[size_t, CString, Ptr[git_oid], Ptr[Byte], CInt]
  object git_stash_cb:
    given _tag: Tag[git_stash_cb] =
      Tag.materializeCFuncPtr4[size_t, CString, Ptr[git_oid], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_stash_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[size_t, CString, Ptr[git_oid], Ptr[Byte], CInt]
    ): git_stash_cb = o
    extension (v: git_stash_cb)
      inline def value
          : CFuncPtr4[size_t, CString, Ptr[git_oid], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_stash_cb

  /** Function pointer to receive status on individual files
    */
  opaque type git_status_cb = CFuncPtr3[CString, CUnsignedInt, Ptr[Byte], CInt]
  object git_status_cb:
    given _tag: Tag[git_status_cb] =
      Tag.materializeCFuncPtr3[CString, CUnsignedInt, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_status_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[CString, CUnsignedInt, Ptr[Byte], CInt]
    ): git_status_cb = o
    extension (v: git_status_cb)
      inline def value: CFuncPtr3[CString, CUnsignedInt, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_status_cb

  /** Function pointer to receive each submodule
    */
  opaque type git_submodule_cb =
    CFuncPtr3[Ptr[git_submodule], CString, Ptr[Byte], CInt]
  object git_submodule_cb:
    given _tag: Tag[git_submodule_cb] =
      Tag.materializeCFuncPtr3[Ptr[git_submodule], CString, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_submodule_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[git_submodule], CString, Ptr[Byte], CInt]
    ): git_submodule_cb = o
    extension (v: git_submodule_cb)
      inline def value
          : CFuncPtr3[Ptr[git_submodule], CString, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_submodule_cb

  /** Callback used to iterate over tag names
    */
  opaque type git_tag_foreach_cb =
    CFuncPtr3[CString, Ptr[git_oid], Ptr[Byte], CInt]
  object git_tag_foreach_cb:
    given _tag: Tag[git_tag_foreach_cb] =
      Tag.materializeCFuncPtr3[CString, Ptr[git_oid], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_tag_foreach_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[CString, Ptr[git_oid], Ptr[Byte], CInt]
    ): git_tag_foreach_cb = o
    extension (v: git_tag_foreach_cb)
      inline def value: CFuncPtr3[CString, Ptr[git_oid], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_tag_foreach_cb

  /** */
  type git_time_t = int64_t
  object git_time_t:
    given _tag: Tag[git_time_t] = int64_t._tag
    inline def apply(inline o: int64_t): git_time_t = o
    extension (v: git_time_t) inline def value: int64_t = v

  /** These types are retained for backward compatibility. The newer versions of
    * these values should be preferred in all new code.
    */
  type git_trace_callback = git_trace_cb
  object git_trace_callback:
    given _tag: Tag[git_trace_callback] = git_trace_cb._tag
    inline def apply(inline o: git_trace_cb): git_trace_callback = o
    extension (v: git_trace_callback) inline def value: git_trace_cb = v

  /** An instance for a tracing function
    */
  opaque type git_trace_cb = CFuncPtr2[git_trace_level_t, CString, Unit]
  object git_trace_cb:
    given _tag: Tag[git_trace_cb] =
      Tag.materializeCFuncPtr2[git_trace_level_t, CString, Unit]
    inline def fromPtr(ptr: Ptr[Byte]): git_trace_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[git_trace_level_t, CString, Unit]
    ): git_trace_cb = o
    extension (v: git_trace_cb)
      inline def value: CFuncPtr2[git_trace_level_t, CString, Unit] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_trace_cb

  /** This structure is used to provide callers information about the progress
    * of indexing a packfile.
    */
  type git_transfer_progress = git_indexer_progress
  object git_transfer_progress:
    given _tag: Tag[git_transfer_progress] = git_indexer_progress._tag
    inline def apply(inline o: git_indexer_progress): git_transfer_progress = o
    extension (v: git_transfer_progress)
      inline def value: git_indexer_progress = v

  /** Type definition for progress callbacks during indexing.
    */
  type git_transfer_progress_cb = git_indexer_progress_cb
  object git_transfer_progress_cb:
    given _tag: Tag[git_transfer_progress_cb] = git_indexer_progress_cb._tag
    inline def apply(
        inline o: git_indexer_progress_cb
    ): git_transfer_progress_cb = o
    extension (v: git_transfer_progress_cb)
      inline def value: git_indexer_progress_cb = v

  /** Signature of a function which creates a transport
    */
  opaque type git_transport_cb =
    CFuncPtr3[Ptr[Ptr[git_transport]], Ptr[git_remote], Ptr[Byte], CInt]
  object git_transport_cb:
    given _tag: Tag[git_transport_cb] = Tag.materializeCFuncPtr3[Ptr[
      Ptr[git_transport]
    ], Ptr[git_remote], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_transport_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[Ptr[Ptr[git_transport]], Ptr[git_remote], Ptr[
          Byte
        ], CInt]
    ): git_transport_cb = o
    extension (v: git_transport_cb)
      inline def value: CFuncPtr3[Ptr[Ptr[git_transport]], Ptr[git_remote], Ptr[
        Byte
      ], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_transport_cb

  /** Callback for the user's custom certificate checks.
    */
  opaque type git_transport_certificate_check_cb =
    CFuncPtr4[Ptr[git_cert], CInt, CString, Ptr[Byte], CInt]
  object git_transport_certificate_check_cb:
    given _tag: Tag[git_transport_certificate_check_cb] =
      Tag.materializeCFuncPtr4[Ptr[git_cert], CInt, CString, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_transport_certificate_check_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[Ptr[git_cert], CInt, CString, Ptr[Byte], CInt]
    ): git_transport_certificate_check_cb = o
    extension (v: git_transport_certificate_check_cb)
      inline def value
          : CFuncPtr4[Ptr[git_cert], CInt, CString, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_transport_certificate_check_cb

  /** Callback for messages received by the transport.
    */
  opaque type git_transport_message_cb =
    CFuncPtr3[CString, CInt, Ptr[Byte], CInt]
  object git_transport_message_cb:
    given _tag: Tag[git_transport_message_cb] =
      Tag.materializeCFuncPtr3[CString, CInt, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_transport_message_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[CString, CInt, Ptr[Byte], CInt]
    ): git_transport_message_cb = o
    extension (v: git_transport_message_cb)
      inline def value: CFuncPtr3[CString, CInt, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_transport_message_cb

  /** Callback for git_treebuilder_filter
    */
  opaque type git_treebuilder_filter_cb =
    CFuncPtr2[Ptr[git_tree_entry], Ptr[Byte], CInt]
  object git_treebuilder_filter_cb:
    given _tag: Tag[git_treebuilder_filter_cb] =
      Tag.materializeCFuncPtr2[Ptr[git_tree_entry], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_treebuilder_filter_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr2[Ptr[git_tree_entry], Ptr[Byte], CInt]
    ): git_treebuilder_filter_cb = o
    extension (v: git_treebuilder_filter_cb)
      inline def value: CFuncPtr2[Ptr[git_tree_entry], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_treebuilder_filter_cb

  /** Callback for the tree traversal method
    */
  opaque type git_treewalk_cb =
    CFuncPtr3[CString, Ptr[git_tree_entry], Ptr[Byte], CInt]
  object git_treewalk_cb:
    given _tag: Tag[git_treewalk_cb] =
      Tag.materializeCFuncPtr3[CString, Ptr[git_tree_entry], Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_treewalk_cb = CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr3[CString, Ptr[git_tree_entry], Ptr[Byte], CInt]
    ): git_treewalk_cb = o
    extension (v: git_treewalk_cb)
      inline def value
          : CFuncPtr3[CString, Ptr[git_tree_entry], Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_treewalk_cb

  /** Callback to resolve URLs before connecting to remote
    */
  opaque type git_url_resolve_cb =
    CFuncPtr4[Ptr[git_buf], CString, CInt, Ptr[Byte], CInt]
  object git_url_resolve_cb:
    given _tag: Tag[git_url_resolve_cb] =
      Tag.materializeCFuncPtr4[Ptr[git_buf], CString, CInt, Ptr[Byte], CInt]
    inline def fromPtr(ptr: Ptr[Byte]): git_url_resolve_cb =
      CFuncPtr.fromPtr(ptr)
    inline def apply(
        inline o: CFuncPtr4[Ptr[git_buf], CString, CInt, Ptr[Byte], CInt]
    ): git_url_resolve_cb = o
    extension (v: git_url_resolve_cb)
      inline def value
          : CFuncPtr4[Ptr[git_buf], CString, CInt, Ptr[Byte], CInt] = v
      inline def toPtr: Ptr[Byte] = CFuncPtr.toPtr(v)
  end git_url_resolve_cb

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

  type size_t = libc.stddef.size_t
  object size_t:
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t) inline def value: libc.stddef.size_t = v

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
end aliases

object structs:
  import _root_.libgit.enumerations.*
  import _root_.libgit.predef.*
  import _root_.libgit.aliases.*
  import _root_.libgit.structs.*

  /** */
  opaque type LIBSSH2_SESSION = CStruct0
  object LIBSSH2_SESSION:
    given _tag: Tag[LIBSSH2_SESSION] = Tag.materializeCStruct0Tag

  /** */
  opaque type LIBSSH2_USERAUTH_KBDINT_PROMPT = CStruct0
  object LIBSSH2_USERAUTH_KBDINT_PROMPT:
    given _tag: Tag[LIBSSH2_USERAUTH_KBDINT_PROMPT] = Tag.materializeCStruct0Tag

  /** */
  opaque type LIBSSH2_USERAUTH_KBDINT_RESPONSE = CStruct0
  object LIBSSH2_USERAUTH_KBDINT_RESPONSE:
    given _tag: Tag[LIBSSH2_USERAUTH_KBDINT_RESPONSE] =
      Tag.materializeCStruct0Tag

  /** */
  opaque type _LIBSSH2_SESSION = CStruct0
  object _LIBSSH2_SESSION:
    given _tag: Tag[_LIBSSH2_SESSION] = Tag.materializeCStruct0Tag

  /** */
  opaque type _LIBSSH2_USERAUTH_KBDINT_PROMPT = CStruct0
  object _LIBSSH2_USERAUTH_KBDINT_PROMPT:
    given _tag: Tag[_LIBSSH2_USERAUTH_KBDINT_PROMPT] =
      Tag.materializeCStruct0Tag

  /** */
  opaque type _LIBSSH2_USERAUTH_KBDINT_RESPONSE = CStruct0
  object _LIBSSH2_USERAUTH_KBDINT_RESPONSE:
    given _tag: Tag[_LIBSSH2_USERAUTH_KBDINT_RESPONSE] =
      Tag.materializeCStruct0Tag

  /** */
  opaque type git_annotated_commit = CStruct0
  object git_annotated_commit:
    given _tag: Tag[git_annotated_commit] = Tag.materializeCStruct0Tag

  /** Apply options structure
    */
  opaque type git_apply_options =
    CStruct5[CUnsignedInt, git_apply_delta_cb, git_apply_hunk_cb, Ptr[
      Byte
    ], CUnsignedInt]
  object git_apply_options:
    given _tag: Tag[git_apply_options] = Tag.materializeCStruct5Tag[
      CUnsignedInt,
      git_apply_delta_cb,
      git_apply_hunk_cb,
      Ptr[Byte],
      CUnsignedInt
    ]
    def apply()(using Zone): Ptr[git_apply_options] =
      scala.scalanative.unsafe.alloc[git_apply_options](1)
    def apply(
        version: CUnsignedInt,
        delta_cb: git_apply_delta_cb,
        hunk_cb: git_apply_hunk_cb,
        payload: Ptr[Byte],
        flags: CUnsignedInt
    )(using Zone): Ptr[git_apply_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).delta_cb = delta_cb
      (!____ptr).hunk_cb = hunk_cb
      (!____ptr).payload = payload
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: git_apply_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def delta_cb: git_apply_delta_cb = struct._2
      def delta_cb_=(value: git_apply_delta_cb): Unit = !struct.at2 = value
      def hunk_cb: git_apply_hunk_cb = struct._3
      def hunk_cb_=(value: git_apply_hunk_cb): Unit = !struct.at3 = value
      def payload: Ptr[Byte] = struct._4
      def payload_=(value: Ptr[Byte]): Unit = !struct.at4 = value
      def flags: CUnsignedInt = struct._5
      def flags_=(value: CUnsignedInt): Unit = !struct.at5 = value
    end extension
  end git_apply_options

  /** An options structure for querying attributes.
    */
  opaque type git_attr_options =
    CStruct4[CUnsignedInt, CUnsignedInt, Ptr[git_oid], git_oid]
  object git_attr_options:
    given _tag: Tag[git_attr_options] = Tag
      .materializeCStruct4Tag[CUnsignedInt, CUnsignedInt, Ptr[git_oid], git_oid]
    def apply()(using Zone): Ptr[git_attr_options] =
      scala.scalanative.unsafe.alloc[git_attr_options](1)
    def apply(
        version: CUnsignedInt,
        flags: CUnsignedInt,
        commit_id: Ptr[git_oid],
        attr_commit_id: git_oid
    )(using Zone): Ptr[git_attr_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).commit_id = commit_id
      (!____ptr).attr_commit_id = attr_commit_id
      ____ptr
    end apply
    extension (struct: git_attr_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: CUnsignedInt = struct._2
      def flags_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def commit_id: Ptr[git_oid] = struct._3
      def commit_id_=(value: Ptr[git_oid]): Unit = !struct.at3 = value
      def attr_commit_id: git_oid = struct._4
      def attr_commit_id_=(value: git_oid): Unit = !struct.at4 = value
  end git_attr_options

  /** */
  opaque type git_blame = CStruct0
  object git_blame:
    given _tag: Tag[git_blame] = Tag.materializeCStruct0Tag

  /** Structure that represents a blame hunk.
    */
  opaque type git_blame_hunk = CStruct9[size_t, git_oid, size_t, Ptr[
    git_signature
  ], git_oid, CString, size_t, Ptr[git_signature], CChar]
  object git_blame_hunk:
    given _tag: Tag[git_blame_hunk] =
      Tag.materializeCStruct9Tag[size_t, git_oid, size_t, Ptr[
        git_signature
      ], git_oid, CString, size_t, Ptr[git_signature], CChar]
    def apply()(using Zone): Ptr[git_blame_hunk] =
      scala.scalanative.unsafe.alloc[git_blame_hunk](1)
    def apply(
        lines_in_hunk: size_t,
        final_commit_id: git_oid,
        final_start_line_number: size_t,
        final_signature: Ptr[git_signature],
        orig_commit_id: git_oid,
        orig_path: CString,
        orig_start_line_number: size_t,
        orig_signature: Ptr[git_signature],
        boundary: CChar
    )(using Zone): Ptr[git_blame_hunk] =
      val ____ptr = apply()
      (!____ptr).lines_in_hunk = lines_in_hunk
      (!____ptr).final_commit_id = final_commit_id
      (!____ptr).final_start_line_number = final_start_line_number
      (!____ptr).final_signature = final_signature
      (!____ptr).orig_commit_id = orig_commit_id
      (!____ptr).orig_path = orig_path
      (!____ptr).orig_start_line_number = orig_start_line_number
      (!____ptr).orig_signature = orig_signature
      (!____ptr).boundary = boundary
      ____ptr
    end apply
    extension (struct: git_blame_hunk)
      def lines_in_hunk: size_t = struct._1
      def lines_in_hunk_=(value: size_t): Unit = !struct.at1 = value
      def final_commit_id: git_oid = struct._2
      def final_commit_id_=(value: git_oid): Unit = !struct.at2 = value
      def final_start_line_number: size_t = struct._3
      def final_start_line_number_=(value: size_t): Unit = !struct.at3 = value
      def final_signature: Ptr[git_signature] = struct._4
      def final_signature_=(value: Ptr[git_signature]): Unit = !struct.at4 =
        value
      def orig_commit_id: git_oid = struct._5
      def orig_commit_id_=(value: git_oid): Unit = !struct.at5 = value
      def orig_path: CString = struct._6
      def orig_path_=(value: CString): Unit = !struct.at6 = value
      def orig_start_line_number: size_t = struct._7
      def orig_start_line_number_=(value: size_t): Unit = !struct.at7 = value
      def orig_signature: Ptr[git_signature] = struct._8
      def orig_signature_=(value: Ptr[git_signature]): Unit = !struct.at8 =
        value
      def boundary: CChar = struct._9
      def boundary_=(value: CChar): Unit = !struct.at9 = value
    end extension
  end git_blame_hunk

  /** Blame options structure
    */
  opaque type git_blame_options =
    CStruct7[CUnsignedInt, uint32_t, uint16_t, git_oid, git_oid, size_t, size_t]
  object git_blame_options:
    given _tag: Tag[git_blame_options] = Tag.materializeCStruct7Tag[
      CUnsignedInt,
      uint32_t,
      uint16_t,
      git_oid,
      git_oid,
      size_t,
      size_t
    ]
    def apply()(using Zone): Ptr[git_blame_options] =
      scala.scalanative.unsafe.alloc[git_blame_options](1)
    def apply(
        version: CUnsignedInt,
        flags: uint32_t,
        min_match_characters: uint16_t,
        newest_commit: git_oid,
        oldest_commit: git_oid,
        min_line: size_t,
        max_line: size_t
    )(using Zone): Ptr[git_blame_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).min_match_characters = min_match_characters
      (!____ptr).newest_commit = newest_commit
      (!____ptr).oldest_commit = oldest_commit
      (!____ptr).min_line = min_line
      (!____ptr).max_line = max_line
      ____ptr
    end apply
    extension (struct: git_blame_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def min_match_characters: uint16_t = struct._3
      def min_match_characters_=(value: uint16_t): Unit = !struct.at3 = value
      def newest_commit: git_oid = struct._4
      def newest_commit_=(value: git_oid): Unit = !struct.at4 = value
      def oldest_commit: git_oid = struct._5
      def oldest_commit_=(value: git_oid): Unit = !struct.at5 = value
      def min_line: size_t = struct._6
      def min_line_=(value: size_t): Unit = !struct.at6 = value
      def max_line: size_t = struct._7
      def max_line_=(value: size_t): Unit = !struct.at7 = value
    end extension
  end git_blame_options

  /** */
  opaque type git_blob = CStruct0
  object git_blob:
    given _tag: Tag[git_blob] = Tag.materializeCStruct0Tag

  /** The options used when applying filter options to a file.
    */
  opaque type git_blob_filter_options =
    CStruct4[CInt, uint32_t, Ptr[git_oid], git_oid]
  object git_blob_filter_options:
    given _tag: Tag[git_blob_filter_options] =
      Tag.materializeCStruct4Tag[CInt, uint32_t, Ptr[git_oid], git_oid]
    def apply()(using Zone): Ptr[git_blob_filter_options] =
      scala.scalanative.unsafe.alloc[git_blob_filter_options](1)
    def apply(
        version: CInt,
        flags: uint32_t,
        commit_id: Ptr[git_oid],
        attr_commit_id: git_oid
    )(using Zone): Ptr[git_blob_filter_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).commit_id = commit_id
      (!____ptr).attr_commit_id = attr_commit_id
      ____ptr
    end apply
    extension (struct: git_blob_filter_options)
      def version: CInt = struct._1
      def version_=(value: CInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def commit_id: Ptr[git_oid] = struct._3
      def commit_id_=(value: Ptr[git_oid]): Unit = !struct.at3 = value
      def attr_commit_id: git_oid = struct._4
      def attr_commit_id_=(value: git_oid): Unit = !struct.at4 = value
  end git_blob_filter_options

  /** */
  opaque type git_branch_iterator = CStruct0
  object git_branch_iterator:
    given _tag: Tag[git_branch_iterator] = Tag.materializeCStruct0Tag

  /** A data buffer for exporting data from libgit2
    */
  opaque type git_buf = CStruct3[CString, size_t, size_t]
  object git_buf:
    given _tag: Tag[git_buf] =
      Tag.materializeCStruct3Tag[CString, size_t, size_t]
    def apply()(using Zone): Ptr[git_buf] =
      scala.scalanative.unsafe.alloc[git_buf](1)
    def apply(ptr: CString, reserved: size_t, size: size_t)(using
        Zone
    ): Ptr[git_buf] =
      val ____ptr = apply()
      (!____ptr).ptr = ptr
      (!____ptr).reserved = reserved
      (!____ptr).size = size
      ____ptr
    extension (struct: git_buf)
      def ptr: CString = struct._1
      def ptr_=(value: CString): Unit = !struct.at1 = value
      def reserved: size_t = struct._2
      def reserved_=(value: size_t): Unit = !struct.at2 = value
      def size: size_t = struct._3
      def size_=(value: size_t): Unit = !struct.at3 = value
  end git_buf

  /** Parent type for `git_cert_hostkey` and `git_cert_x509`.
    */
  opaque type git_cert = CStruct1[git_cert_t]
  object git_cert:
    given _tag: Tag[git_cert] = Tag.materializeCStruct1Tag[git_cert_t]
    def apply()(using Zone): Ptr[git_cert] =
      scala.scalanative.unsafe.alloc[git_cert](1)
    def apply(cert_type: git_cert_t)(using Zone): Ptr[git_cert] =
      val ____ptr = apply()
      (!____ptr).cert_type = cert_type
      ____ptr
    extension (struct: git_cert)
      def cert_type: git_cert_t = struct._1
      def cert_type_=(value: git_cert_t): Unit = !struct.at1 = value
  end git_cert

  /** Hostkey information taken from libssh2
    */
  opaque type git_cert_hostkey = CStruct8[
    git_cert,
    git_cert_ssh_t,
    CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]],
    CArray[CUnsignedChar, Nat.Digit2[Nat._2, Nat._0]],
    CArray[CUnsignedChar, Nat.Digit2[Nat._3, Nat._2]],
    git_cert_ssh_raw_type_t,
    CString,
    size_t
  ]
  object git_cert_hostkey:
    given _tag: Tag[git_cert_hostkey] = Tag.materializeCStruct8Tag[
      git_cert,
      git_cert_ssh_t,
      CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]],
      CArray[CUnsignedChar, Nat.Digit2[Nat._2, Nat._0]],
      CArray[CUnsignedChar, Nat.Digit2[Nat._3, Nat._2]],
      git_cert_ssh_raw_type_t,
      CString,
      size_t
    ]
    def apply()(using Zone): Ptr[git_cert_hostkey] =
      scala.scalanative.unsafe.alloc[git_cert_hostkey](1)
    def apply(
        parent: git_cert,
        `type`: git_cert_ssh_t,
        hash_md5: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]],
        hash_sha1: CArray[CUnsignedChar, Nat.Digit2[Nat._2, Nat._0]],
        hash_sha256: CArray[CUnsignedChar, Nat.Digit2[Nat._3, Nat._2]],
        raw_type: git_cert_ssh_raw_type_t,
        hostkey: CString,
        hostkey_len: size_t
    )(using Zone): Ptr[git_cert_hostkey] =
      val ____ptr = apply()
      (!____ptr).parent = parent
      (!____ptr).`type` = `type`
      (!____ptr).hash_md5 = hash_md5
      (!____ptr).hash_sha1 = hash_sha1
      (!____ptr).hash_sha256 = hash_sha256
      (!____ptr).raw_type = raw_type
      (!____ptr).hostkey = hostkey
      (!____ptr).hostkey_len = hostkey_len
      ____ptr
    end apply
    extension (struct: git_cert_hostkey)
      def parent: git_cert = struct._1
      def parent_=(value: git_cert): Unit = !struct.at1 = value
      def `type`: git_cert_ssh_t = struct._2
      def type_=(value: git_cert_ssh_t): Unit = !struct.at2 = value
      def hash_md5: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]] =
        struct._3
      def hash_md5_=(
          value: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._6]]
      ): Unit = !struct.at3 = value
      def hash_sha1: CArray[CUnsignedChar, Nat.Digit2[Nat._2, Nat._0]] =
        struct._4
      def hash_sha1_=(
          value: CArray[CUnsignedChar, Nat.Digit2[Nat._2, Nat._0]]
      ): Unit = !struct.at4 = value
      def hash_sha256: CArray[CUnsignedChar, Nat.Digit2[Nat._3, Nat._2]] =
        struct._5
      def hash_sha256_=(
          value: CArray[CUnsignedChar, Nat.Digit2[Nat._3, Nat._2]]
      ): Unit = !struct.at5 = value
      def raw_type: git_cert_ssh_raw_type_t = struct._6
      def raw_type_=(value: git_cert_ssh_raw_type_t): Unit = !struct.at6 = value
      def hostkey: CString = struct._7
      def hostkey_=(value: CString): Unit = !struct.at7 = value
      def hostkey_len: size_t = struct._8
      def hostkey_len_=(value: size_t): Unit = !struct.at8 = value
    end extension
  end git_cert_hostkey

  /** X.509 certificate information
    */
  opaque type git_cert_x509 = CStruct3[git_cert, Ptr[Byte], size_t]
  object git_cert_x509:
    given _tag: Tag[git_cert_x509] =
      Tag.materializeCStruct3Tag[git_cert, Ptr[Byte], size_t]
    def apply()(using Zone): Ptr[git_cert_x509] =
      scala.scalanative.unsafe.alloc[git_cert_x509](1)
    def apply(parent: git_cert, data: Ptr[Byte], len: size_t)(using
        Zone
    ): Ptr[git_cert_x509] =
      val ____ptr = apply()
      (!____ptr).parent = parent
      (!____ptr).data = data
      (!____ptr).len = len
      ____ptr
    extension (struct: git_cert_x509)
      def parent: git_cert = struct._1
      def parent_=(value: git_cert): Unit = !struct.at1 = value
      def data: Ptr[Byte] = struct._2
      def data_=(value: Ptr[Byte]): Unit = !struct.at2 = value
      def len: size_t = struct._3
      def len_=(value: size_t): Unit = !struct.at3 = value
  end git_cert_x509

  /** Checkout options structure
    */
  opaque type git_checkout_options = CStruct20[
    CUnsignedInt,
    CUnsignedInt,
    CInt,
    CUnsignedInt,
    CUnsignedInt,
    CInt,
    CUnsignedInt,
    git_checkout_notify_cb,
    Ptr[Byte],
    git_checkout_progress_cb,
    Ptr[Byte],
    git_strarray,
    Ptr[git_tree],
    Ptr[git_index],
    CString,
    CString,
    CString,
    CString,
    git_checkout_perfdata_cb,
    Ptr[Byte]
  ]
  object git_checkout_options:
    given _tag: Tag[git_checkout_options] = Tag.materializeCStruct20Tag[
      CUnsignedInt,
      CUnsignedInt,
      CInt,
      CUnsignedInt,
      CUnsignedInt,
      CInt,
      CUnsignedInt,
      git_checkout_notify_cb,
      Ptr[Byte],
      git_checkout_progress_cb,
      Ptr[Byte],
      git_strarray,
      Ptr[git_tree],
      Ptr[git_index],
      CString,
      CString,
      CString,
      CString,
      git_checkout_perfdata_cb,
      Ptr[Byte]
    ]
    def apply()(using Zone): Ptr[git_checkout_options] =
      scala.scalanative.unsafe.alloc[git_checkout_options](1)
    def apply(
        version: CUnsignedInt,
        checkout_strategy: CUnsignedInt,
        disable_filters: CInt,
        dir_mode: CUnsignedInt,
        file_mode: CUnsignedInt,
        file_open_flags: CInt,
        notify_flags: CUnsignedInt,
        notify_cb: git_checkout_notify_cb,
        notify_payload: Ptr[Byte],
        progress_cb: git_checkout_progress_cb,
        progress_payload: Ptr[Byte],
        paths: git_strarray,
        baseline: Ptr[git_tree],
        baseline_index: Ptr[git_index],
        target_directory: CString,
        ancestor_label: CString,
        our_label: CString,
        their_label: CString,
        perfdata_cb: git_checkout_perfdata_cb,
        perfdata_payload: Ptr[Byte]
    )(using Zone): Ptr[git_checkout_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).checkout_strategy = checkout_strategy
      (!____ptr).disable_filters = disable_filters
      (!____ptr).dir_mode = dir_mode
      (!____ptr).file_mode = file_mode
      (!____ptr).file_open_flags = file_open_flags
      (!____ptr).notify_flags = notify_flags
      (!____ptr).notify_cb = notify_cb
      (!____ptr).notify_payload = notify_payload
      (!____ptr).progress_cb = progress_cb
      (!____ptr).progress_payload = progress_payload
      (!____ptr).paths = paths
      (!____ptr).baseline = baseline
      (!____ptr).baseline_index = baseline_index
      (!____ptr).target_directory = target_directory
      (!____ptr).ancestor_label = ancestor_label
      (!____ptr).our_label = our_label
      (!____ptr).their_label = their_label
      (!____ptr).perfdata_cb = perfdata_cb
      (!____ptr).perfdata_payload = perfdata_payload
      ____ptr
    end apply
    extension (struct: git_checkout_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def checkout_strategy: CUnsignedInt = struct._2
      def checkout_strategy_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def disable_filters: CInt = struct._3
      def disable_filters_=(value: CInt): Unit = !struct.at3 = value
      def dir_mode: CUnsignedInt = struct._4
      def dir_mode_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def file_mode: CUnsignedInt = struct._5
      def file_mode_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def file_open_flags: CInt = struct._6
      def file_open_flags_=(value: CInt): Unit = !struct.at6 = value
      def notify_flags: CUnsignedInt = struct._7
      def notify_flags_=(value: CUnsignedInt): Unit = !struct.at7 = value
      def notify_cb: git_checkout_notify_cb = struct._8
      def notify_cb_=(value: git_checkout_notify_cb): Unit = !struct.at8 = value
      def notify_payload: Ptr[Byte] = struct._9
      def notify_payload_=(value: Ptr[Byte]): Unit = !struct.at9 = value
      def progress_cb: git_checkout_progress_cb = struct._10
      def progress_cb_=(value: git_checkout_progress_cb): Unit = !struct.at10 =
        value
      def progress_payload: Ptr[Byte] = struct._11
      def progress_payload_=(value: Ptr[Byte]): Unit = !struct.at11 = value
      def paths: git_strarray = struct._12
      def paths_=(value: git_strarray): Unit = !struct.at12 = value
      def baseline: Ptr[git_tree] = struct._13
      def baseline_=(value: Ptr[git_tree]): Unit = !struct.at13 = value
      def baseline_index: Ptr[git_index] = struct._14
      def baseline_index_=(value: Ptr[git_index]): Unit = !struct.at14 = value
      def target_directory: CString = struct._15
      def target_directory_=(value: CString): Unit = !struct.at15 = value
      def ancestor_label: CString = struct._16
      def ancestor_label_=(value: CString): Unit = !struct.at16 = value
      def our_label: CString = struct._17
      def our_label_=(value: CString): Unit = !struct.at17 = value
      def their_label: CString = struct._18
      def their_label_=(value: CString): Unit = !struct.at18 = value
      def perfdata_cb: git_checkout_perfdata_cb = struct._19
      def perfdata_cb_=(value: git_checkout_perfdata_cb): Unit = !struct.at19 =
        value
      def perfdata_payload: Ptr[Byte] = struct._20
      def perfdata_payload_=(value: Ptr[Byte]): Unit = !struct.at20 = value
    end extension
  end git_checkout_options

  /** Checkout performance-reporting structure
    */
  opaque type git_checkout_perfdata = CStruct3[size_t, size_t, size_t]
  object git_checkout_perfdata:
    given _tag: Tag[git_checkout_perfdata] =
      Tag.materializeCStruct3Tag[size_t, size_t, size_t]
    def apply()(using Zone): Ptr[git_checkout_perfdata] =
      scala.scalanative.unsafe.alloc[git_checkout_perfdata](1)
    def apply(mkdir_calls: size_t, stat_calls: size_t, chmod_calls: size_t)(
        using Zone
    ): Ptr[git_checkout_perfdata] =
      val ____ptr = apply()
      (!____ptr).mkdir_calls = mkdir_calls
      (!____ptr).stat_calls = stat_calls
      (!____ptr).chmod_calls = chmod_calls
      ____ptr
    extension (struct: git_checkout_perfdata)
      def mkdir_calls: size_t = struct._1
      def mkdir_calls_=(value: size_t): Unit = !struct.at1 = value
      def stat_calls: size_t = struct._2
      def stat_calls_=(value: size_t): Unit = !struct.at2 = value
      def chmod_calls: size_t = struct._3
      def chmod_calls_=(value: size_t): Unit = !struct.at3 = value
  end git_checkout_perfdata

  /** Cherry-pick options
    */
  opaque type git_cherrypick_options = CStruct4[
    CUnsignedInt,
    CUnsignedInt,
    git_merge_options,
    git_checkout_options
  ]
  object git_cherrypick_options:
    given _tag: Tag[git_cherrypick_options] = Tag.materializeCStruct4Tag[
      CUnsignedInt,
      CUnsignedInt,
      git_merge_options,
      git_checkout_options
    ]
    def apply()(using Zone): Ptr[git_cherrypick_options] =
      scala.scalanative.unsafe.alloc[git_cherrypick_options](1)
    def apply(
        version: CUnsignedInt,
        mainline: CUnsignedInt,
        merge_opts: git_merge_options,
        checkout_opts: git_checkout_options
    )(using Zone): Ptr[git_cherrypick_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).mainline = mainline
      (!____ptr).merge_opts = merge_opts
      (!____ptr).checkout_opts = checkout_opts
      ____ptr
    end apply
    extension (struct: git_cherrypick_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def mainline: CUnsignedInt = struct._2
      def mainline_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def merge_opts: git_merge_options = struct._3
      def merge_opts_=(value: git_merge_options): Unit = !struct.at3 = value
      def checkout_opts: git_checkout_options = struct._4
      def checkout_opts_=(value: git_checkout_options): Unit = !struct.at4 =
        value
    end extension
  end git_cherrypick_options

  /** Clone options structure
    */
  opaque type git_clone_options = CStruct10[
    CUnsignedInt,
    git_checkout_options,
    git_fetch_options,
    CInt,
    git_clone_local_t,
    CString,
    git_repository_create_cb,
    Ptr[Byte],
    git_remote_create_cb,
    Ptr[Byte]
  ]
  object git_clone_options:
    given _tag: Tag[git_clone_options] = Tag.materializeCStruct10Tag[
      CUnsignedInt,
      git_checkout_options,
      git_fetch_options,
      CInt,
      git_clone_local_t,
      CString,
      git_repository_create_cb,
      Ptr[Byte],
      git_remote_create_cb,
      Ptr[Byte]
    ]
    def apply()(using Zone): Ptr[git_clone_options] =
      scala.scalanative.unsafe.alloc[git_clone_options](1)
    def apply(
        version: CUnsignedInt,
        checkout_opts: git_checkout_options,
        fetch_opts: git_fetch_options,
        bare: CInt,
        local: git_clone_local_t,
        checkout_branch: CString,
        repository_cb: git_repository_create_cb,
        repository_cb_payload: Ptr[Byte],
        remote_cb: git_remote_create_cb,
        remote_cb_payload: Ptr[Byte]
    )(using Zone): Ptr[git_clone_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).checkout_opts = checkout_opts
      (!____ptr).fetch_opts = fetch_opts
      (!____ptr).bare = bare
      (!____ptr).local = local
      (!____ptr).checkout_branch = checkout_branch
      (!____ptr).repository_cb = repository_cb
      (!____ptr).repository_cb_payload = repository_cb_payload
      (!____ptr).remote_cb = remote_cb
      (!____ptr).remote_cb_payload = remote_cb_payload
      ____ptr
    end apply
    extension (struct: git_clone_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def checkout_opts: git_checkout_options = struct._2
      def checkout_opts_=(value: git_checkout_options): Unit = !struct.at2 =
        value
      def fetch_opts: git_fetch_options = struct._3
      def fetch_opts_=(value: git_fetch_options): Unit = !struct.at3 = value
      def bare: CInt = struct._4
      def bare_=(value: CInt): Unit = !struct.at4 = value
      def local: git_clone_local_t = struct._5
      def local_=(value: git_clone_local_t): Unit = !struct.at5 = value
      def checkout_branch: CString = struct._6
      def checkout_branch_=(value: CString): Unit = !struct.at6 = value
      def repository_cb: git_repository_create_cb = struct._7
      def repository_cb_=(value: git_repository_create_cb): Unit = !struct.at7 =
        value
      def repository_cb_payload: Ptr[Byte] = struct._8
      def repository_cb_payload_=(value: Ptr[Byte]): Unit = !struct.at8 = value
      def remote_cb: git_remote_create_cb = struct._9
      def remote_cb_=(value: git_remote_create_cb): Unit = !struct.at9 = value
      def remote_cb_payload: Ptr[Byte] = struct._10
      def remote_cb_payload_=(value: Ptr[Byte]): Unit = !struct.at10 = value
    end extension
  end git_clone_options

  /** */
  opaque type git_commit = CStruct0
  object git_commit:
    given _tag: Tag[git_commit] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_commit_graph = CStruct0
  object git_commit_graph:
    given _tag: Tag[git_commit_graph] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_commit_graph_writer = CStruct0
  object git_commit_graph_writer:
    given _tag: Tag[git_commit_graph_writer] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_config = CStruct0
  object git_config:
    given _tag: Tag[git_config] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_config_backend = CStruct0
  object git_config_backend:
    given _tag: Tag[git_config_backend] = Tag.materializeCStruct0Tag

  /** An entry in a configuration file
    */
  opaque type git_config_entry =
    CStruct6[CString, CString, CUnsignedInt, git_config_level_t, CFuncPtr1[Ptr[
      Byte
    ], Unit], Ptr[Byte]]
  object git_config_entry:
    given _tag: Tag[git_config_entry] = Tag.materializeCStruct6Tag[
      CString,
      CString,
      CUnsignedInt,
      git_config_level_t,
      CFuncPtr1[Ptr[Byte], Unit],
      Ptr[Byte]
    ]
    def apply()(using Zone): Ptr[git_config_entry] =
      scala.scalanative.unsafe.alloc[git_config_entry](1)
    def apply(
        name: CString,
        value: CString,
        include_depth: CUnsignedInt,
        level: git_config_level_t,
        free: CFuncPtr1[Ptr[git_config_entry], Unit],
        payload: Ptr[Byte]
    )(using Zone): Ptr[git_config_entry] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).value = value
      (!____ptr).include_depth = include_depth
      (!____ptr).level = level
      (!____ptr).free = free
      (!____ptr).payload = payload
      ____ptr
    end apply
    extension (struct: git_config_entry)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def value: CString = struct._2
      def value_=(value: CString): Unit = !struct.at2 = value
      def include_depth: CUnsignedInt = struct._3
      def include_depth_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def level: git_config_level_t = struct._4
      def level_=(value: git_config_level_t): Unit = !struct.at4 = value
      def free: CFuncPtr1[Ptr[git_config_entry], Unit] =
        struct._5.asInstanceOf[CFuncPtr1[Ptr[git_config_entry], Unit]]
      def free_=(value: CFuncPtr1[Ptr[git_config_entry], Unit]): Unit =
        !struct.at5 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
      def payload: Ptr[Byte] = struct._6
      def payload_=(value: Ptr[Byte]): Unit = !struct.at6 = value
    end extension
  end git_config_entry

  /** */
  opaque type git_config_iterator = CStruct0
  object git_config_iterator:
    given _tag: Tag[git_config_iterator] = Tag.materializeCStruct0Tag

  /** Mapping from config variables to values.
    */
  opaque type git_configmap = CStruct3[git_configmap_t, CString, CInt]
  object git_configmap:
    given _tag: Tag[git_configmap] =
      Tag.materializeCStruct3Tag[git_configmap_t, CString, CInt]
    def apply()(using Zone): Ptr[git_configmap] =
      scala.scalanative.unsafe.alloc[git_configmap](1)
    def apply(`type`: git_configmap_t, str_match: CString, map_value: CInt)(
        using Zone
    ): Ptr[git_configmap] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).str_match = str_match
      (!____ptr).map_value = map_value
      ____ptr
    extension (struct: git_configmap)
      def `type`: git_configmap_t = struct._1
      def type_=(value: git_configmap_t): Unit = !struct.at1 = value
      def str_match: CString = struct._2
      def str_match_=(value: CString): Unit = !struct.at2 = value
      def map_value: CInt = struct._3
      def map_value_=(value: CInt): Unit = !struct.at3 = value
  end git_configmap

  /** The base structure for all credential types
    */
  opaque type git_credential =
    CStruct2[git_credential_t, CFuncPtr1[Ptr[Byte], Unit]]
  object git_credential:
    given _tag: Tag[git_credential] =
      Tag.materializeCStruct2Tag[git_credential_t, CFuncPtr1[Ptr[Byte], Unit]]
    def apply()(using Zone): Ptr[git_credential] =
      scala.scalanative.unsafe.alloc[git_credential](1)
    def apply(
        credtype: git_credential_t,
        free: CFuncPtr1[Ptr[git_credential], Unit]
    )(using Zone): Ptr[git_credential] =
      val ____ptr = apply()
      (!____ptr).credtype = credtype
      (!____ptr).free = free
      ____ptr
    extension (struct: git_credential)
      def credtype: git_credential_t = struct._1
      def credtype_=(value: git_credential_t): Unit = !struct.at1 = value
      def free: CFuncPtr1[Ptr[git_credential], Unit] =
        struct._2.asInstanceOf[CFuncPtr1[Ptr[git_credential], Unit]]
      def free_=(value: CFuncPtr1[Ptr[git_credential], Unit]): Unit =
        !struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
  end git_credential

  /** The base structure for all credential types
    */
  opaque type git_credential_default =
    CStruct2[git_credential_t, CFuncPtr1[Ptr[Byte], Unit]]
  object git_credential_default:
    given _tag: Tag[git_credential_default] =
      Tag.materializeCStruct2Tag[git_credential_t, CFuncPtr1[Ptr[Byte], Unit]]
    def apply()(using Zone): Ptr[git_credential_default] =
      scala.scalanative.unsafe.alloc[git_credential_default](1)
    def apply(
        credtype: git_credential_t,
        free: CFuncPtr1[Ptr[git_credential], Unit]
    )(using Zone): Ptr[git_credential_default] =
      val ____ptr = apply()
      (!____ptr).credtype = credtype
      (!____ptr).free = free
      ____ptr
    extension (struct: git_credential_default)
      def credtype: git_credential_t = struct._1
      def credtype_=(value: git_credential_t): Unit = !struct.at1 = value
      def free: CFuncPtr1[Ptr[git_credential], Unit] =
        struct._2.asInstanceOf[CFuncPtr1[Ptr[git_credential], Unit]]
      def free_=(value: CFuncPtr1[Ptr[git_credential], Unit]): Unit =
        !struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
  end git_credential_default

  /** A key with a custom signature function
    */
  opaque type git_credential_ssh_custom = CStruct6[
    git_credential,
    CString,
    CString,
    size_t,
    git_credential_sign_cb,
    Ptr[Byte]
  ]
  object git_credential_ssh_custom:
    given _tag: Tag[git_credential_ssh_custom] = Tag.materializeCStruct6Tag[
      git_credential,
      CString,
      CString,
      size_t,
      git_credential_sign_cb,
      Ptr[Byte]
    ]
    def apply()(using Zone): Ptr[git_credential_ssh_custom] =
      scala.scalanative.unsafe.alloc[git_credential_ssh_custom](1)
    def apply(
        parent: git_credential,
        username: CString,
        publickey: CString,
        publickey_len: size_t,
        sign_callback: git_credential_sign_cb,
        payload: Ptr[Byte]
    )(using Zone): Ptr[git_credential_ssh_custom] =
      val ____ptr = apply()
      (!____ptr).parent = parent
      (!____ptr).username = username
      (!____ptr).publickey = publickey
      (!____ptr).publickey_len = publickey_len
      (!____ptr).sign_callback = sign_callback
      (!____ptr).payload = payload
      ____ptr
    end apply
    extension (struct: git_credential_ssh_custom)
      def parent: git_credential = struct._1
      def parent_=(value: git_credential): Unit = !struct.at1 = value
      def username: CString = struct._2
      def username_=(value: CString): Unit = !struct.at2 = value
      def publickey: CString = struct._3
      def publickey_=(value: CString): Unit = !struct.at3 = value
      def publickey_len: size_t = struct._4
      def publickey_len_=(value: size_t): Unit = !struct.at4 = value
      def sign_callback: git_credential_sign_cb = struct._5
      def sign_callback_=(value: git_credential_sign_cb): Unit = !struct.at5 =
        value
      def payload: Ptr[Byte] = struct._6
      def payload_=(value: Ptr[Byte]): Unit = !struct.at6 = value
    end extension
  end git_credential_ssh_custom

  /** Keyboard-interactive based ssh authentication
    */
  opaque type git_credential_ssh_interactive =
    CStruct4[git_credential, CString, git_credential_ssh_interactive_cb, Ptr[
      Byte
    ]]
  object git_credential_ssh_interactive:
    given _tag: Tag[git_credential_ssh_interactive] =
      Tag.materializeCStruct4Tag[
        git_credential,
        CString,
        git_credential_ssh_interactive_cb,
        Ptr[Byte]
      ]
    def apply()(using Zone): Ptr[git_credential_ssh_interactive] =
      scala.scalanative.unsafe.alloc[git_credential_ssh_interactive](1)
    def apply(
        parent: git_credential,
        username: CString,
        prompt_callback: git_credential_ssh_interactive_cb,
        payload: Ptr[Byte]
    )(using Zone): Ptr[git_credential_ssh_interactive] =
      val ____ptr = apply()
      (!____ptr).parent = parent
      (!____ptr).username = username
      (!____ptr).prompt_callback = prompt_callback
      (!____ptr).payload = payload
      ____ptr
    end apply
    extension (struct: git_credential_ssh_interactive)
      def parent: git_credential = struct._1
      def parent_=(value: git_credential): Unit = !struct.at1 = value
      def username: CString = struct._2
      def username_=(value: CString): Unit = !struct.at2 = value
      def prompt_callback: git_credential_ssh_interactive_cb = struct._3
      def prompt_callback_=(value: git_credential_ssh_interactive_cb): Unit =
        !struct.at3 = value
      def payload: Ptr[Byte] = struct._4
      def payload_=(value: Ptr[Byte]): Unit = !struct.at4 = value
    end extension
  end git_credential_ssh_interactive

  /** A ssh key from disk
    */
  opaque type git_credential_ssh_key =
    CStruct5[git_credential, CString, CString, CString, CString]
  object git_credential_ssh_key:
    given _tag: Tag[git_credential_ssh_key] = Tag.materializeCStruct5Tag[
      git_credential,
      CString,
      CString,
      CString,
      CString
    ]
    def apply()(using Zone): Ptr[git_credential_ssh_key] =
      scala.scalanative.unsafe.alloc[git_credential_ssh_key](1)
    def apply(
        parent: git_credential,
        username: CString,
        publickey: CString,
        privatekey: CString,
        passphrase: CString
    )(using Zone): Ptr[git_credential_ssh_key] =
      val ____ptr = apply()
      (!____ptr).parent = parent
      (!____ptr).username = username
      (!____ptr).publickey = publickey
      (!____ptr).privatekey = privatekey
      (!____ptr).passphrase = passphrase
      ____ptr
    end apply
    extension (struct: git_credential_ssh_key)
      def parent: git_credential = struct._1
      def parent_=(value: git_credential): Unit = !struct.at1 = value
      def username: CString = struct._2
      def username_=(value: CString): Unit = !struct.at2 = value
      def publickey: CString = struct._3
      def publickey_=(value: CString): Unit = !struct.at3 = value
      def privatekey: CString = struct._4
      def privatekey_=(value: CString): Unit = !struct.at4 = value
      def passphrase: CString = struct._5
      def passphrase_=(value: CString): Unit = !struct.at5 = value
    end extension
  end git_credential_ssh_key

  /** Username-only credential information
    */
  opaque type git_credential_username =
    CStruct2[git_credential, CArray[CChar, Nat._1]]
  object git_credential_username:
    given _tag: Tag[git_credential_username] =
      Tag.materializeCStruct2Tag[git_credential, CArray[CChar, Nat._1]]
    def apply()(using Zone): Ptr[git_credential_username] =
      scala.scalanative.unsafe.alloc[git_credential_username](1)
    def apply(parent: git_credential, username: CArray[CChar, Nat._1])(using
        Zone
    ): Ptr[git_credential_username] =
      val ____ptr = apply()
      (!____ptr).parent = parent
      (!____ptr).username = username
      ____ptr
    extension (struct: git_credential_username)
      def parent: git_credential = struct._1
      def parent_=(value: git_credential): Unit = !struct.at1 = value
      def username: CArray[CChar, Nat._1] = struct._2
      def username_=(value: CArray[CChar, Nat._1]): Unit = !struct.at2 = value
  end git_credential_username

  /** Payload for git_credential_userpass_plaintext.
    */
  opaque type git_credential_userpass_payload = CStruct2[CString, CString]
  object git_credential_userpass_payload:
    given _tag: Tag[git_credential_userpass_payload] =
      Tag.materializeCStruct2Tag[CString, CString]
    def apply()(using Zone): Ptr[git_credential_userpass_payload] =
      scala.scalanative.unsafe.alloc[git_credential_userpass_payload](1)
    def apply(username: CString, password: CString)(using
        Zone
    ): Ptr[git_credential_userpass_payload] =
      val ____ptr = apply()
      (!____ptr).username = username
      (!____ptr).password = password
      ____ptr
    extension (struct: git_credential_userpass_payload)
      def username: CString = struct._1
      def username_=(value: CString): Unit = !struct.at1 = value
      def password: CString = struct._2
      def password_=(value: CString): Unit = !struct.at2 = value
  end git_credential_userpass_payload

  /** A plaintext username and password
    */
  opaque type git_credential_userpass_plaintext =
    CStruct3[git_credential, CString, CString]
  object git_credential_userpass_plaintext:
    given _tag: Tag[git_credential_userpass_plaintext] =
      Tag.materializeCStruct3Tag[git_credential, CString, CString]
    def apply()(using Zone): Ptr[git_credential_userpass_plaintext] =
      scala.scalanative.unsafe.alloc[git_credential_userpass_plaintext](1)
    def apply(parent: git_credential, username: CString, password: CString)(
        using Zone
    ): Ptr[git_credential_userpass_plaintext] =
      val ____ptr = apply()
      (!____ptr).parent = parent
      (!____ptr).username = username
      (!____ptr).password = password
      ____ptr
    extension (struct: git_credential_userpass_plaintext)
      def parent: git_credential = struct._1
      def parent_=(value: git_credential): Unit = !struct.at1 = value
      def username: CString = struct._2
      def username_=(value: CString): Unit = !struct.at2 = value
      def password: CString = struct._3
      def password_=(value: CString): Unit = !struct.at3 = value
  end git_credential_userpass_plaintext

  /** Describe format options structure
    */
  opaque type git_describe_format_options =
    CStruct4[CUnsignedInt, CUnsignedInt, CInt, CString]
  object git_describe_format_options:
    given _tag: Tag[git_describe_format_options] =
      Tag.materializeCStruct4Tag[CUnsignedInt, CUnsignedInt, CInt, CString]
    def apply()(using Zone): Ptr[git_describe_format_options] =
      scala.scalanative.unsafe.alloc[git_describe_format_options](1)
    def apply(
        version: CUnsignedInt,
        abbreviated_size: CUnsignedInt,
        always_use_long_format: CInt,
        dirty_suffix: CString
    )(using Zone): Ptr[git_describe_format_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).abbreviated_size = abbreviated_size
      (!____ptr).always_use_long_format = always_use_long_format
      (!____ptr).dirty_suffix = dirty_suffix
      ____ptr
    end apply
    extension (struct: git_describe_format_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def abbreviated_size: CUnsignedInt = struct._2
      def abbreviated_size_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def always_use_long_format: CInt = struct._3
      def always_use_long_format_=(value: CInt): Unit = !struct.at3 = value
      def dirty_suffix: CString = struct._4
      def dirty_suffix_=(value: CString): Unit = !struct.at4 = value
  end git_describe_format_options

  /** Describe options structure
    */
  opaque type git_describe_options =
    CStruct6[CUnsignedInt, CUnsignedInt, CUnsignedInt, CString, CInt, CInt]
  object git_describe_options:
    given _tag: Tag[git_describe_options] = Tag.materializeCStruct6Tag[
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CString,
      CInt,
      CInt
    ]
    def apply()(using Zone): Ptr[git_describe_options] =
      scala.scalanative.unsafe.alloc[git_describe_options](1)
    def apply(
        version: CUnsignedInt,
        max_candidates_tags: CUnsignedInt,
        describe_strategy: CUnsignedInt,
        pattern: CString,
        only_follow_first_parent: CInt,
        show_commit_oid_as_fallback: CInt
    )(using Zone): Ptr[git_describe_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).max_candidates_tags = max_candidates_tags
      (!____ptr).describe_strategy = describe_strategy
      (!____ptr).pattern = pattern
      (!____ptr).only_follow_first_parent = only_follow_first_parent
      (!____ptr).show_commit_oid_as_fallback = show_commit_oid_as_fallback
      ____ptr
    end apply
    extension (struct: git_describe_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def max_candidates_tags: CUnsignedInt = struct._2
      def max_candidates_tags_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def describe_strategy: CUnsignedInt = struct._3
      def describe_strategy_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def pattern: CString = struct._4
      def pattern_=(value: CString): Unit = !struct.at4 = value
      def only_follow_first_parent: CInt = struct._5
      def only_follow_first_parent_=(value: CInt): Unit = !struct.at5 = value
      def show_commit_oid_as_fallback: CInt = struct._6
      def show_commit_oid_as_fallback_=(value: CInt): Unit = !struct.at6 = value
    end extension
  end git_describe_options

  /** */
  opaque type git_describe_result = CStruct0
  object git_describe_result:
    given _tag: Tag[git_describe_result] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_diff = CStruct0
  object git_diff:
    given _tag: Tag[git_diff] = Tag.materializeCStruct0Tag

  /** Structure describing the binary contents of a diff.
    */
  opaque type git_diff_binary =
    CStruct3[CUnsignedInt, git_diff_binary_file, git_diff_binary_file]
  object git_diff_binary:
    given _tag: Tag[git_diff_binary] = Tag.materializeCStruct3Tag[
      CUnsignedInt,
      git_diff_binary_file,
      git_diff_binary_file
    ]
    def apply()(using Zone): Ptr[git_diff_binary] =
      scala.scalanative.unsafe.alloc[git_diff_binary](1)
    def apply(
        contains_data: CUnsignedInt,
        old_file: git_diff_binary_file,
        new_file: git_diff_binary_file
    )(using Zone): Ptr[git_diff_binary] =
      val ____ptr = apply()
      (!____ptr).contains_data = contains_data
      (!____ptr).old_file = old_file
      (!____ptr).new_file = new_file
      ____ptr
    end apply
    extension (struct: git_diff_binary)
      def contains_data: CUnsignedInt = struct._1
      def contains_data_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def old_file: git_diff_binary_file = struct._2
      def old_file_=(value: git_diff_binary_file): Unit = !struct.at2 = value
      def new_file: git_diff_binary_file = struct._3
      def new_file_=(value: git_diff_binary_file): Unit = !struct.at3 = value
  end git_diff_binary

  /** The contents of one of the files in a binary diff.
    */
  opaque type git_diff_binary_file =
    CStruct4[git_diff_binary_t, CString, size_t, size_t]
  object git_diff_binary_file:
    given _tag: Tag[git_diff_binary_file] =
      Tag.materializeCStruct4Tag[git_diff_binary_t, CString, size_t, size_t]
    def apply()(using Zone): Ptr[git_diff_binary_file] =
      scala.scalanative.unsafe.alloc[git_diff_binary_file](1)
    def apply(
        `type`: git_diff_binary_t,
        data: CString,
        datalen: size_t,
        inflatedlen: size_t
    )(using Zone): Ptr[git_diff_binary_file] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).datalen = datalen
      (!____ptr).inflatedlen = inflatedlen
      ____ptr
    end apply
    extension (struct: git_diff_binary_file)
      def `type`: git_diff_binary_t = struct._1
      def type_=(value: git_diff_binary_t): Unit = !struct.at1 = value
      def data: CString = struct._2
      def data_=(value: CString): Unit = !struct.at2 = value
      def datalen: size_t = struct._3
      def datalen_=(value: size_t): Unit = !struct.at3 = value
      def inflatedlen: size_t = struct._4
      def inflatedlen_=(value: size_t): Unit = !struct.at4 = value
  end git_diff_binary_file

  /** Description of changes to one entry.
    */
  opaque type git_diff_delta = CStruct6[
    git_delta_t,
    uint32_t,
    uint16_t,
    uint16_t,
    git_diff_file,
    git_diff_file
  ]
  object git_diff_delta:
    given _tag: Tag[git_diff_delta] = Tag.materializeCStruct6Tag[
      git_delta_t,
      uint32_t,
      uint16_t,
      uint16_t,
      git_diff_file,
      git_diff_file
    ]
    def apply()(using Zone): Ptr[git_diff_delta] =
      scala.scalanative.unsafe.alloc[git_diff_delta](1)
    def apply(
        status: git_delta_t,
        flags: uint32_t,
        similarity: uint16_t,
        nfiles: uint16_t,
        old_file: git_diff_file,
        new_file: git_diff_file
    )(using Zone): Ptr[git_diff_delta] =
      val ____ptr = apply()
      (!____ptr).status = status
      (!____ptr).flags = flags
      (!____ptr).similarity = similarity
      (!____ptr).nfiles = nfiles
      (!____ptr).old_file = old_file
      (!____ptr).new_file = new_file
      ____ptr
    end apply
    extension (struct: git_diff_delta)
      def status: git_delta_t = struct._1
      def status_=(value: git_delta_t): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def similarity: uint16_t = struct._3
      def similarity_=(value: uint16_t): Unit = !struct.at3 = value
      def nfiles: uint16_t = struct._4
      def nfiles_=(value: uint16_t): Unit = !struct.at4 = value
      def old_file: git_diff_file = struct._5
      def old_file_=(value: git_diff_file): Unit = !struct.at5 = value
      def new_file: git_diff_file = struct._6
      def new_file_=(value: git_diff_file): Unit = !struct.at6 = value
    end extension
  end git_diff_delta

  /** Description of one side of a delta.
    */
  opaque type git_diff_file =
    CStruct6[git_oid, CString, git_object_size_t, uint32_t, uint16_t, uint16_t]
  object git_diff_file:
    given _tag: Tag[git_diff_file] = Tag.materializeCStruct6Tag[
      git_oid,
      CString,
      git_object_size_t,
      uint32_t,
      uint16_t,
      uint16_t
    ]
    def apply()(using Zone): Ptr[git_diff_file] =
      scala.scalanative.unsafe.alloc[git_diff_file](1)
    def apply(
        id: git_oid,
        path: CString,
        size: git_object_size_t,
        flags: uint32_t,
        mode: uint16_t,
        id_abbrev: uint16_t
    )(using Zone): Ptr[git_diff_file] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).path = path
      (!____ptr).size = size
      (!____ptr).flags = flags
      (!____ptr).mode = mode
      (!____ptr).id_abbrev = id_abbrev
      ____ptr
    end apply
    extension (struct: git_diff_file)
      def id: git_oid = struct._1
      def id_=(value: git_oid): Unit = !struct.at1 = value
      def path: CString = struct._2
      def path_=(value: CString): Unit = !struct.at2 = value
      def size: git_object_size_t = struct._3
      def size_=(value: git_object_size_t): Unit = !struct.at3 = value
      def flags: uint32_t = struct._4
      def flags_=(value: uint32_t): Unit = !struct.at4 = value
      def mode: uint16_t = struct._5
      def mode_=(value: uint16_t): Unit = !struct.at5 = value
      def id_abbrev: uint16_t = struct._6
      def id_abbrev_=(value: uint16_t): Unit = !struct.at6 = value
    end extension
  end git_diff_file

  /** Control behavior of rename and copy detection
    */
  opaque type git_diff_find_options = CStruct8[
    CUnsignedInt,
    uint32_t,
    uint16_t,
    uint16_t,
    uint16_t,
    uint16_t,
    size_t,
    Ptr[git_diff_similarity_metric]
  ]
  object git_diff_find_options:
    given _tag: Tag[git_diff_find_options] = Tag.materializeCStruct8Tag[
      CUnsignedInt,
      uint32_t,
      uint16_t,
      uint16_t,
      uint16_t,
      uint16_t,
      size_t,
      Ptr[git_diff_similarity_metric]
    ]
    def apply()(using Zone): Ptr[git_diff_find_options] =
      scala.scalanative.unsafe.alloc[git_diff_find_options](1)
    def apply(
        version: CUnsignedInt,
        flags: uint32_t,
        rename_threshold: uint16_t,
        rename_from_rewrite_threshold: uint16_t,
        copy_threshold: uint16_t,
        break_rewrite_threshold: uint16_t,
        rename_limit: size_t,
        metric: Ptr[git_diff_similarity_metric]
    )(using Zone): Ptr[git_diff_find_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).rename_threshold = rename_threshold
      (!____ptr).rename_from_rewrite_threshold = rename_from_rewrite_threshold
      (!____ptr).copy_threshold = copy_threshold
      (!____ptr).break_rewrite_threshold = break_rewrite_threshold
      (!____ptr).rename_limit = rename_limit
      (!____ptr).metric = metric
      ____ptr
    end apply
    extension (struct: git_diff_find_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def rename_threshold: uint16_t = struct._3
      def rename_threshold_=(value: uint16_t): Unit = !struct.at3 = value
      def rename_from_rewrite_threshold: uint16_t = struct._4
      def rename_from_rewrite_threshold_=(value: uint16_t): Unit = !struct.at4 =
        value
      def copy_threshold: uint16_t = struct._5
      def copy_threshold_=(value: uint16_t): Unit = !struct.at5 = value
      def break_rewrite_threshold: uint16_t = struct._6
      def break_rewrite_threshold_=(value: uint16_t): Unit = !struct.at6 = value
      def rename_limit: size_t = struct._7
      def rename_limit_=(value: size_t): Unit = !struct.at7 = value
      def metric: Ptr[git_diff_similarity_metric] = struct._8
      def metric_=(value: Ptr[git_diff_similarity_metric]): Unit = !struct.at8 =
        value
    end extension
  end git_diff_find_options

  /** Options for controlling the formatting of the generated e-mail.
    */
  opaque type git_diff_format_email_options =
    CStruct8[CUnsignedInt, uint32_t, size_t, size_t, Ptr[
      git_oid
    ], CString, CString, Ptr[git_signature]]
  object git_diff_format_email_options:
    given _tag: Tag[git_diff_format_email_options] =
      Tag.materializeCStruct8Tag[CUnsignedInt, uint32_t, size_t, size_t, Ptr[
        git_oid
      ], CString, CString, Ptr[git_signature]]
    def apply()(using Zone): Ptr[git_diff_format_email_options] =
      scala.scalanative.unsafe.alloc[git_diff_format_email_options](1)
    def apply(
        version: CUnsignedInt,
        flags: uint32_t,
        patch_no: size_t,
        total_patches: size_t,
        id: Ptr[git_oid],
        summary: CString,
        body: CString,
        author: Ptr[git_signature]
    )(using Zone): Ptr[git_diff_format_email_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).patch_no = patch_no
      (!____ptr).total_patches = total_patches
      (!____ptr).id = id
      (!____ptr).summary = summary
      (!____ptr).body = body
      (!____ptr).author = author
      ____ptr
    end apply
    extension (struct: git_diff_format_email_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def patch_no: size_t = struct._3
      def patch_no_=(value: size_t): Unit = !struct.at3 = value
      def total_patches: size_t = struct._4
      def total_patches_=(value: size_t): Unit = !struct.at4 = value
      def id: Ptr[git_oid] = struct._5
      def id_=(value: Ptr[git_oid]): Unit = !struct.at5 = value
      def summary: CString = struct._6
      def summary_=(value: CString): Unit = !struct.at6 = value
      def body: CString = struct._7
      def body_=(value: CString): Unit = !struct.at7 = value
      def author: Ptr[git_signature] = struct._8
      def author_=(value: Ptr[git_signature]): Unit = !struct.at8 = value
    end extension
  end git_diff_format_email_options

  /** Structure describing a hunk of a diff.
    */
  opaque type git_diff_hunk = CStruct6[
    CInt,
    CInt,
    CInt,
    CInt,
    size_t,
    CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
  ]
  object git_diff_hunk:
    given _tag: Tag[git_diff_hunk] =
      Tag.materializeCStruct6Tag[CInt, CInt, CInt, CInt, size_t, CArray[
        CChar,
        Nat.Digit3[Nat._1, Nat._2, Nat._8]
      ]]
    def apply()(using Zone): Ptr[git_diff_hunk] =
      scala.scalanative.unsafe.alloc[git_diff_hunk](1)
    def apply(
        old_start: CInt,
        old_lines: CInt,
        new_start: CInt,
        new_lines: CInt,
        header_len: size_t,
        header: CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
    )(using Zone): Ptr[git_diff_hunk] =
      val ____ptr = apply()
      (!____ptr).old_start = old_start
      (!____ptr).old_lines = old_lines
      (!____ptr).new_start = new_start
      (!____ptr).new_lines = new_lines
      (!____ptr).header_len = header_len
      (!____ptr).header = header
      ____ptr
    end apply
    extension (struct: git_diff_hunk)
      def old_start: CInt = struct._1
      def old_start_=(value: CInt): Unit = !struct.at1 = value
      def old_lines: CInt = struct._2
      def old_lines_=(value: CInt): Unit = !struct.at2 = value
      def new_start: CInt = struct._3
      def new_start_=(value: CInt): Unit = !struct.at3 = value
      def new_lines: CInt = struct._4
      def new_lines_=(value: CInt): Unit = !struct.at4 = value
      def header_len: size_t = struct._5
      def header_len_=(value: size_t): Unit = !struct.at5 = value
      def header: CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]] = struct._6
      def header_=(
          value: CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
      ): Unit = !struct.at6 = value
    end extension
  end git_diff_hunk

  /** Structure describing a line (or data span) of a diff.
    */
  opaque type git_diff_line =
    CStruct7[CChar, CInt, CInt, CInt, size_t, git_off_t, CString]
  object git_diff_line:
    given _tag: Tag[git_diff_line] = Tag.materializeCStruct7Tag[
      CChar,
      CInt,
      CInt,
      CInt,
      size_t,
      git_off_t,
      CString
    ]
    def apply()(using Zone): Ptr[git_diff_line] =
      scala.scalanative.unsafe.alloc[git_diff_line](1)
    def apply(
        origin: CChar,
        old_lineno: CInt,
        new_lineno: CInt,
        num_lines: CInt,
        content_len: size_t,
        content_offset: git_off_t,
        content: CString
    )(using Zone): Ptr[git_diff_line] =
      val ____ptr = apply()
      (!____ptr).origin = origin
      (!____ptr).old_lineno = old_lineno
      (!____ptr).new_lineno = new_lineno
      (!____ptr).num_lines = num_lines
      (!____ptr).content_len = content_len
      (!____ptr).content_offset = content_offset
      (!____ptr).content = content
      ____ptr
    end apply
    extension (struct: git_diff_line)
      def origin: CChar = struct._1
      def origin_=(value: CChar): Unit = !struct.at1 = value
      def old_lineno: CInt = struct._2
      def old_lineno_=(value: CInt): Unit = !struct.at2 = value
      def new_lineno: CInt = struct._3
      def new_lineno_=(value: CInt): Unit = !struct.at3 = value
      def num_lines: CInt = struct._4
      def num_lines_=(value: CInt): Unit = !struct.at4 = value
      def content_len: size_t = struct._5
      def content_len_=(value: size_t): Unit = !struct.at5 = value
      def content_offset: git_off_t = struct._6
      def content_offset_=(value: git_off_t): Unit = !struct.at6 = value
      def content: CString = struct._7
      def content_=(value: CString): Unit = !struct.at7 = value
    end extension
  end git_diff_line

  /** Structure describing options about how the diff should be executed.
    */
  opaque type git_diff_options = CStruct13[
    CUnsignedInt,
    uint32_t,
    git_submodule_ignore_t,
    git_strarray,
    git_diff_notify_cb,
    git_diff_progress_cb,
    Ptr[Byte],
    uint32_t,
    uint32_t,
    uint16_t,
    git_off_t,
    CString,
    CString
  ]
  object git_diff_options:
    given _tag: Tag[git_diff_options] = Tag.materializeCStruct13Tag[
      CUnsignedInt,
      uint32_t,
      git_submodule_ignore_t,
      git_strarray,
      git_diff_notify_cb,
      git_diff_progress_cb,
      Ptr[Byte],
      uint32_t,
      uint32_t,
      uint16_t,
      git_off_t,
      CString,
      CString
    ]
    def apply()(using Zone): Ptr[git_diff_options] =
      scala.scalanative.unsafe.alloc[git_diff_options](1)
    def apply(
        version: CUnsignedInt,
        flags: uint32_t,
        ignore_submodules: git_submodule_ignore_t,
        pathspec: git_strarray,
        notify_cb: git_diff_notify_cb,
        progress_cb: git_diff_progress_cb,
        payload: Ptr[Byte],
        context_lines: uint32_t,
        interhunk_lines: uint32_t,
        id_abbrev: uint16_t,
        max_size: git_off_t,
        old_prefix: CString,
        new_prefix: CString
    )(using Zone): Ptr[git_diff_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).ignore_submodules = ignore_submodules
      (!____ptr).pathspec = pathspec
      (!____ptr).notify_cb = notify_cb
      (!____ptr).progress_cb = progress_cb
      (!____ptr).payload = payload
      (!____ptr).context_lines = context_lines
      (!____ptr).interhunk_lines = interhunk_lines
      (!____ptr).id_abbrev = id_abbrev
      (!____ptr).max_size = max_size
      (!____ptr).old_prefix = old_prefix
      (!____ptr).new_prefix = new_prefix
      ____ptr
    end apply
    extension (struct: git_diff_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def ignore_submodules: git_submodule_ignore_t = struct._3
      def ignore_submodules_=(value: git_submodule_ignore_t): Unit =
        !struct.at3 = value
      def pathspec: git_strarray = struct._4
      def pathspec_=(value: git_strarray): Unit = !struct.at4 = value
      def notify_cb: git_diff_notify_cb = struct._5
      def notify_cb_=(value: git_diff_notify_cb): Unit = !struct.at5 = value
      def progress_cb: git_diff_progress_cb = struct._6
      def progress_cb_=(value: git_diff_progress_cb): Unit = !struct.at6 = value
      def payload: Ptr[Byte] = struct._7
      def payload_=(value: Ptr[Byte]): Unit = !struct.at7 = value
      def context_lines: uint32_t = struct._8
      def context_lines_=(value: uint32_t): Unit = !struct.at8 = value
      def interhunk_lines: uint32_t = struct._9
      def interhunk_lines_=(value: uint32_t): Unit = !struct.at9 = value
      def id_abbrev: uint16_t = struct._10
      def id_abbrev_=(value: uint16_t): Unit = !struct.at10 = value
      def max_size: git_off_t = struct._11
      def max_size_=(value: git_off_t): Unit = !struct.at11 = value
      def old_prefix: CString = struct._12
      def old_prefix_=(value: CString): Unit = !struct.at12 = value
      def new_prefix: CString = struct._13
      def new_prefix_=(value: CString): Unit = !struct.at13 = value
    end extension
  end git_diff_options

  /** Patch ID options structure
    */
  opaque type git_diff_patchid_options = CStruct1[CUnsignedInt]
  object git_diff_patchid_options:
    given _tag: Tag[git_diff_patchid_options] =
      Tag.materializeCStruct1Tag[CUnsignedInt]
    def apply()(using Zone): Ptr[git_diff_patchid_options] =
      scala.scalanative.unsafe.alloc[git_diff_patchid_options](1)
    def apply(version: CUnsignedInt)(using
        Zone
    ): Ptr[git_diff_patchid_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      ____ptr
    extension (struct: git_diff_patchid_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
  end git_diff_patchid_options

  /** Pluggable similarity metric
    */
  opaque type git_diff_similarity_metric = CStruct5[
    CFuncPtr4[Ptr[Ptr[Byte]], Ptr[git_diff_file], CString, Ptr[Byte], CInt],
    CFuncPtr5[Ptr[Ptr[Byte]], Ptr[git_diff_file], CString, size_t, Ptr[
      Byte
    ], CInt],
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit],
    CFuncPtr4[Ptr[CInt], Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt],
    Ptr[Byte]
  ]
  object git_diff_similarity_metric:
    given _tag: Tag[git_diff_similarity_metric] = Tag.materializeCStruct5Tag[
      CFuncPtr4[Ptr[Ptr[Byte]], Ptr[git_diff_file], CString, Ptr[Byte], CInt],
      CFuncPtr5[Ptr[Ptr[Byte]], Ptr[git_diff_file], CString, size_t, Ptr[
        Byte
      ], CInt],
      CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit],
      CFuncPtr4[Ptr[CInt], Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt],
      Ptr[Byte]
    ]
    def apply()(using Zone): Ptr[git_diff_similarity_metric] =
      scala.scalanative.unsafe.alloc[git_diff_similarity_metric](1)
    def apply(
        file_signature: CFuncPtr4[Ptr[Ptr[Byte]], Ptr[
          git_diff_file
        ], CString, Ptr[Byte], CInt],
        buffer_signature: CFuncPtr5[Ptr[Ptr[Byte]], Ptr[
          git_diff_file
        ], CString, size_t, Ptr[Byte], CInt],
        free_signature: CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit],
        similarity: CFuncPtr4[Ptr[CInt], Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt],
        payload: Ptr[Byte]
    )(using Zone): Ptr[git_diff_similarity_metric] =
      val ____ptr = apply()
      (!____ptr).file_signature = file_signature
      (!____ptr).buffer_signature = buffer_signature
      (!____ptr).free_signature = free_signature
      (!____ptr).similarity = similarity
      (!____ptr).payload = payload
      ____ptr
    end apply
    extension (struct: git_diff_similarity_metric)
      def file_signature: CFuncPtr4[Ptr[Ptr[Byte]], Ptr[
        git_diff_file
      ], CString, Ptr[Byte], CInt] = struct._1
      def file_signature_=(
          value: CFuncPtr4[Ptr[Ptr[Byte]], Ptr[git_diff_file], CString, Ptr[
            Byte
          ], CInt]
      ): Unit = !struct.at1 = value
      def buffer_signature: CFuncPtr5[Ptr[Ptr[Byte]], Ptr[
        git_diff_file
      ], CString, size_t, Ptr[Byte], CInt] = struct._2
      def buffer_signature_=(
          value: CFuncPtr5[Ptr[Ptr[Byte]], Ptr[
            git_diff_file
          ], CString, size_t, Ptr[Byte], CInt]
      ): Unit = !struct.at2 = value
      def free_signature: CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit] = struct._3
      def free_signature_=(value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit]): Unit =
        !struct.at3 = value
      def similarity
          : CFuncPtr4[Ptr[CInt], Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt] =
        struct._4
      def similarity_=(
          value: CFuncPtr4[Ptr[CInt], Ptr[Byte], Ptr[Byte], Ptr[Byte], CInt]
      ): Unit = !struct.at4 = value
      def payload: Ptr[Byte] = struct._5
      def payload_=(value: Ptr[Byte]): Unit = !struct.at5 = value
    end extension
  end git_diff_similarity_metric

  /** */
  opaque type git_diff_stats = CStruct0
  object git_diff_stats:
    given _tag: Tag[git_diff_stats] = Tag.materializeCStruct0Tag

  /** Options for controlling the formatting of the generated e-mail.
    */
  opaque type git_email_create_options = CStruct7[
    CUnsignedInt,
    uint32_t,
    git_diff_options,
    git_diff_find_options,
    CString,
    size_t,
    size_t
  ]
  object git_email_create_options:
    given _tag: Tag[git_email_create_options] = Tag.materializeCStruct7Tag[
      CUnsignedInt,
      uint32_t,
      git_diff_options,
      git_diff_find_options,
      CString,
      size_t,
      size_t
    ]
    def apply()(using Zone): Ptr[git_email_create_options] =
      scala.scalanative.unsafe.alloc[git_email_create_options](1)
    def apply(
        version: CUnsignedInt,
        flags: uint32_t,
        diff_opts: git_diff_options,
        diff_find_opts: git_diff_find_options,
        subject_prefix: CString,
        start_number: size_t,
        reroll_number: size_t
    )(using Zone): Ptr[git_email_create_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).diff_opts = diff_opts
      (!____ptr).diff_find_opts = diff_find_opts
      (!____ptr).subject_prefix = subject_prefix
      (!____ptr).start_number = start_number
      (!____ptr).reroll_number = reroll_number
      ____ptr
    end apply
    extension (struct: git_email_create_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def diff_opts: git_diff_options = struct._3
      def diff_opts_=(value: git_diff_options): Unit = !struct.at3 = value
      def diff_find_opts: git_diff_find_options = struct._4
      def diff_find_opts_=(value: git_diff_find_options): Unit = !struct.at4 =
        value
      def subject_prefix: CString = struct._5
      def subject_prefix_=(value: CString): Unit = !struct.at5 = value
      def start_number: size_t = struct._6
      def start_number_=(value: size_t): Unit = !struct.at6 = value
      def reroll_number: size_t = struct._7
      def reroll_number_=(value: size_t): Unit = !struct.at7 = value
    end extension
  end git_email_create_options

  /** Structure to store extra details of the last error that occurred.
    */
  opaque type git_error = CStruct2[CString, CInt]
  object git_error:
    given _tag: Tag[git_error] = Tag.materializeCStruct2Tag[CString, CInt]
    def apply()(using Zone): Ptr[git_error] =
      scala.scalanative.unsafe.alloc[git_error](1)
    def apply(message: CString, klass: CInt)(using Zone): Ptr[git_error] =
      val ____ptr = apply()
      (!____ptr).message = message
      (!____ptr).klass = klass
      ____ptr
    extension (struct: git_error)
      def message: CString = struct._1
      def message_=(value: CString): Unit = !struct.at1 = value
      def klass: CInt = struct._2
      def klass_=(value: CInt): Unit = !struct.at2 = value
  end git_error

  /** Fetch options structure.
    */
  opaque type git_fetch_options = CStruct8[
    CInt,
    git_remote_callbacks,
    git_fetch_prune_t,
    CInt,
    git_remote_autotag_option_t,
    git_proxy_options,
    git_remote_redirect_t,
    git_strarray
  ]
  object git_fetch_options:
    given _tag: Tag[git_fetch_options] = Tag.materializeCStruct8Tag[
      CInt,
      git_remote_callbacks,
      git_fetch_prune_t,
      CInt,
      git_remote_autotag_option_t,
      git_proxy_options,
      git_remote_redirect_t,
      git_strarray
    ]
    def apply()(using Zone): Ptr[git_fetch_options] =
      scala.scalanative.unsafe.alloc[git_fetch_options](1)
    def apply(
        version: CInt,
        callbacks: git_remote_callbacks,
        prune: git_fetch_prune_t,
        update_fetchhead: CInt,
        download_tags: git_remote_autotag_option_t,
        proxy_opts: git_proxy_options,
        follow_redirects: git_remote_redirect_t,
        custom_headers: git_strarray
    )(using Zone): Ptr[git_fetch_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).callbacks = callbacks
      (!____ptr).prune = prune
      (!____ptr).update_fetchhead = update_fetchhead
      (!____ptr).download_tags = download_tags
      (!____ptr).proxy_opts = proxy_opts
      (!____ptr).follow_redirects = follow_redirects
      (!____ptr).custom_headers = custom_headers
      ____ptr
    end apply
    extension (struct: git_fetch_options)
      def version: CInt = struct._1
      def version_=(value: CInt): Unit = !struct.at1 = value
      def callbacks: git_remote_callbacks = struct._2
      def callbacks_=(value: git_remote_callbacks): Unit = !struct.at2 = value
      def prune: git_fetch_prune_t = struct._3
      def prune_=(value: git_fetch_prune_t): Unit = !struct.at3 = value
      def update_fetchhead: CInt = struct._4
      def update_fetchhead_=(value: CInt): Unit = !struct.at4 = value
      def download_tags: git_remote_autotag_option_t = struct._5
      def download_tags_=(value: git_remote_autotag_option_t): Unit =
        !struct.at5 = value
      def proxy_opts: git_proxy_options = struct._6
      def proxy_opts_=(value: git_proxy_options): Unit = !struct.at6 = value
      def follow_redirects: git_remote_redirect_t = struct._7
      def follow_redirects_=(value: git_remote_redirect_t): Unit = !struct.at7 =
        value
      def custom_headers: git_strarray = struct._8
      def custom_headers_=(value: git_strarray): Unit = !struct.at8 = value
    end extension
  end git_fetch_options

  /** */
  opaque type git_filter = CStruct0
  object git_filter:
    given _tag: Tag[git_filter] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_filter_list = CStruct0
  object git_filter_list:
    given _tag: Tag[git_filter_list] = Tag.materializeCStruct0Tag

  /** Filtering options
    */
  opaque type git_filter_options =
    CStruct4[CUnsignedInt, uint32_t, Ptr[git_oid], git_oid]
  object git_filter_options:
    given _tag: Tag[git_filter_options] =
      Tag.materializeCStruct4Tag[CUnsignedInt, uint32_t, Ptr[git_oid], git_oid]
    def apply()(using Zone): Ptr[git_filter_options] =
      scala.scalanative.unsafe.alloc[git_filter_options](1)
    def apply(
        version: CUnsignedInt,
        flags: uint32_t,
        commit_id: Ptr[git_oid],
        attr_commit_id: git_oid
    )(using Zone): Ptr[git_filter_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).commit_id = commit_id
      (!____ptr).attr_commit_id = attr_commit_id
      ____ptr
    end apply
    extension (struct: git_filter_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def commit_id: Ptr[git_oid] = struct._3
      def commit_id_=(value: Ptr[git_oid]): Unit = !struct.at3 = value
      def attr_commit_id: git_oid = struct._4
      def attr_commit_id_=(value: git_oid): Unit = !struct.at4 = value
  end git_filter_options

  /** */
  opaque type git_index = CStruct0
  object git_index:
    given _tag: Tag[git_index] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_index_conflict_iterator = CStruct0
  object git_index_conflict_iterator:
    given _tag: Tag[git_index_conflict_iterator] = Tag.materializeCStruct0Tag

  /** In-memory representation of a file entry in the index.
    */
  opaque type git_index_entry = CStruct12[
    git_index_time,
    git_index_time,
    uint32_t,
    uint32_t,
    uint32_t,
    uint32_t,
    uint32_t,
    uint32_t,
    git_oid,
    uint16_t,
    uint16_t,
    CString
  ]
  object git_index_entry:
    given _tag: Tag[git_index_entry] = Tag.materializeCStruct12Tag[
      git_index_time,
      git_index_time,
      uint32_t,
      uint32_t,
      uint32_t,
      uint32_t,
      uint32_t,
      uint32_t,
      git_oid,
      uint16_t,
      uint16_t,
      CString
    ]
    def apply()(using Zone): Ptr[git_index_entry] =
      scala.scalanative.unsafe.alloc[git_index_entry](1)
    def apply(
        ctime: git_index_time,
        mtime: git_index_time,
        dev: uint32_t,
        ino: uint32_t,
        mode: uint32_t,
        uid: uint32_t,
        gid: uint32_t,
        file_size: uint32_t,
        id: git_oid,
        flags: uint16_t,
        flags_extended: uint16_t,
        path: CString
    )(using Zone): Ptr[git_index_entry] =
      val ____ptr = apply()
      (!____ptr).ctime = ctime
      (!____ptr).mtime = mtime
      (!____ptr).dev = dev
      (!____ptr).ino = ino
      (!____ptr).mode = mode
      (!____ptr).uid = uid
      (!____ptr).gid = gid
      (!____ptr).file_size = file_size
      (!____ptr).id = id
      (!____ptr).flags = flags
      (!____ptr).flags_extended = flags_extended
      (!____ptr).path = path
      ____ptr
    end apply
    extension (struct: git_index_entry)
      def ctime: git_index_time = struct._1
      def ctime_=(value: git_index_time): Unit = !struct.at1 = value
      def mtime: git_index_time = struct._2
      def mtime_=(value: git_index_time): Unit = !struct.at2 = value
      def dev: uint32_t = struct._3
      def dev_=(value: uint32_t): Unit = !struct.at3 = value
      def ino: uint32_t = struct._4
      def ino_=(value: uint32_t): Unit = !struct.at4 = value
      def mode: uint32_t = struct._5
      def mode_=(value: uint32_t): Unit = !struct.at5 = value
      def uid: uint32_t = struct._6
      def uid_=(value: uint32_t): Unit = !struct.at6 = value
      def gid: uint32_t = struct._7
      def gid_=(value: uint32_t): Unit = !struct.at7 = value
      def file_size: uint32_t = struct._8
      def file_size_=(value: uint32_t): Unit = !struct.at8 = value
      def id: git_oid = struct._9
      def id_=(value: git_oid): Unit = !struct.at9 = value
      def flags: uint16_t = struct._10
      def flags_=(value: uint16_t): Unit = !struct.at10 = value
      def flags_extended: uint16_t = struct._11
      def flags_extended_=(value: uint16_t): Unit = !struct.at11 = value
      def path: CString = struct._12
      def path_=(value: CString): Unit = !struct.at12 = value
    end extension
  end git_index_entry

  /** */
  opaque type git_index_iterator = CStruct0
  object git_index_iterator:
    given _tag: Tag[git_index_iterator] = Tag.materializeCStruct0Tag

  /** Time structure used in a git index entry
    */
  opaque type git_index_time = CStruct2[int32_t, uint32_t]
  object git_index_time:
    given _tag: Tag[git_index_time] =
      Tag.materializeCStruct2Tag[int32_t, uint32_t]
    def apply()(using Zone): Ptr[git_index_time] =
      scala.scalanative.unsafe.alloc[git_index_time](1)
    def apply(seconds: int32_t, nanoseconds: uint32_t)(using
        Zone
    ): Ptr[git_index_time] =
      val ____ptr = apply()
      (!____ptr).seconds = seconds
      (!____ptr).nanoseconds = nanoseconds
      ____ptr
    extension (struct: git_index_time)
      def seconds: int32_t = struct._1
      def seconds_=(value: int32_t): Unit = !struct.at1 = value
      def nanoseconds: uint32_t = struct._2
      def nanoseconds_=(value: uint32_t): Unit = !struct.at2 = value
  end git_index_time

  /** */
  opaque type git_indexer = CStruct0
  object git_indexer:
    given _tag: Tag[git_indexer] = Tag.materializeCStruct0Tag

  /** Options for indexer configuration
    */
  opaque type git_indexer_options =
    CStruct4[CUnsignedInt, git_indexer_progress_cb, Ptr[Byte], CUnsignedChar]
  object git_indexer_options:
    given _tag: Tag[git_indexer_options] =
      Tag.materializeCStruct4Tag[CUnsignedInt, git_indexer_progress_cb, Ptr[
        Byte
      ], CUnsignedChar]
    def apply()(using Zone): Ptr[git_indexer_options] =
      scala.scalanative.unsafe.alloc[git_indexer_options](1)
    def apply(
        version: CUnsignedInt,
        progress_cb: git_indexer_progress_cb,
        progress_cb_payload: Ptr[Byte],
        verify: CUnsignedChar
    )(using Zone): Ptr[git_indexer_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).progress_cb = progress_cb
      (!____ptr).progress_cb_payload = progress_cb_payload
      (!____ptr).verify = verify
      ____ptr
    end apply
    extension (struct: git_indexer_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def progress_cb: git_indexer_progress_cb = struct._2
      def progress_cb_=(value: git_indexer_progress_cb): Unit = !struct.at2 =
        value
      def progress_cb_payload: Ptr[Byte] = struct._3
      def progress_cb_payload_=(value: Ptr[Byte]): Unit = !struct.at3 = value
      def verify: CUnsignedChar = struct._4
      def verify_=(value: CUnsignedChar): Unit = !struct.at4 = value
    end extension
  end git_indexer_options

  /** This structure is used to provide callers information about the progress
    * of indexing a packfile, either directly or part of a fetch or clone that
    * downloads a packfile.
    */
  opaque type git_indexer_progress = CStruct7[
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    CUnsignedInt,
    size_t
  ]
  object git_indexer_progress:
    given _tag: Tag[git_indexer_progress] = Tag.materializeCStruct7Tag[
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      CUnsignedInt,
      size_t
    ]
    def apply()(using Zone): Ptr[git_indexer_progress] =
      scala.scalanative.unsafe.alloc[git_indexer_progress](1)
    def apply(
        total_objects: CUnsignedInt,
        indexed_objects: CUnsignedInt,
        received_objects: CUnsignedInt,
        local_objects: CUnsignedInt,
        total_deltas: CUnsignedInt,
        indexed_deltas: CUnsignedInt,
        received_bytes: size_t
    )(using Zone): Ptr[git_indexer_progress] =
      val ____ptr = apply()
      (!____ptr).total_objects = total_objects
      (!____ptr).indexed_objects = indexed_objects
      (!____ptr).received_objects = received_objects
      (!____ptr).local_objects = local_objects
      (!____ptr).total_deltas = total_deltas
      (!____ptr).indexed_deltas = indexed_deltas
      (!____ptr).received_bytes = received_bytes
      ____ptr
    end apply
    extension (struct: git_indexer_progress)
      def total_objects: CUnsignedInt = struct._1
      def total_objects_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def indexed_objects: CUnsignedInt = struct._2
      def indexed_objects_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def received_objects: CUnsignedInt = struct._3
      def received_objects_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def local_objects: CUnsignedInt = struct._4
      def local_objects_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def total_deltas: CUnsignedInt = struct._5
      def total_deltas_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def indexed_deltas: CUnsignedInt = struct._6
      def indexed_deltas_=(value: CUnsignedInt): Unit = !struct.at6 = value
      def received_bytes: size_t = struct._7
      def received_bytes_=(value: size_t): Unit = !struct.at7 = value
    end extension
  end git_indexer_progress

  /** */
  opaque type git_iterator = CStruct0
  object git_iterator:
    given _tag: Tag[git_iterator] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_mailmap = CStruct0
  object git_mailmap:
    given _tag: Tag[git_mailmap] = Tag.materializeCStruct0Tag

  /** The file inputs to `git_merge_file`. Callers should populate the
    * `git_merge_file_input` structure with descriptions of the files in each
    * side of the conflict for use in producing the merge file.
    */
  opaque type git_merge_file_input =
    CStruct5[CUnsignedInt, CString, size_t, CString, CUnsignedInt]
  object git_merge_file_input:
    given _tag: Tag[git_merge_file_input] = Tag.materializeCStruct5Tag[
      CUnsignedInt,
      CString,
      size_t,
      CString,
      CUnsignedInt
    ]
    def apply()(using Zone): Ptr[git_merge_file_input] =
      scala.scalanative.unsafe.alloc[git_merge_file_input](1)
    def apply(
        version: CUnsignedInt,
        ptr: CString,
        size: size_t,
        path: CString,
        mode: CUnsignedInt
    )(using Zone): Ptr[git_merge_file_input] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).ptr = ptr
      (!____ptr).size = size
      (!____ptr).path = path
      (!____ptr).mode = mode
      ____ptr
    end apply
    extension (struct: git_merge_file_input)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def ptr: CString = struct._2
      def ptr_=(value: CString): Unit = !struct.at2 = value
      def size: size_t = struct._3
      def size_=(value: size_t): Unit = !struct.at3 = value
      def path: CString = struct._4
      def path_=(value: CString): Unit = !struct.at4 = value
      def mode: CUnsignedInt = struct._5
      def mode_=(value: CUnsignedInt): Unit = !struct.at5 = value
    end extension
  end git_merge_file_input

  /** Options for merging a file
    */
  opaque type git_merge_file_options = CStruct7[
    CUnsignedInt,
    CString,
    CString,
    CString,
    git_merge_file_favor_t,
    uint32_t,
    CUnsignedShort
  ]
  object git_merge_file_options:
    given _tag: Tag[git_merge_file_options] = Tag.materializeCStruct7Tag[
      CUnsignedInt,
      CString,
      CString,
      CString,
      git_merge_file_favor_t,
      uint32_t,
      CUnsignedShort
    ]
    def apply()(using Zone): Ptr[git_merge_file_options] =
      scala.scalanative.unsafe.alloc[git_merge_file_options](1)
    def apply(
        version: CUnsignedInt,
        ancestor_label: CString,
        our_label: CString,
        their_label: CString,
        favor: git_merge_file_favor_t,
        flags: uint32_t,
        marker_size: CUnsignedShort
    )(using Zone): Ptr[git_merge_file_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).ancestor_label = ancestor_label
      (!____ptr).our_label = our_label
      (!____ptr).their_label = their_label
      (!____ptr).favor = favor
      (!____ptr).flags = flags
      (!____ptr).marker_size = marker_size
      ____ptr
    end apply
    extension (struct: git_merge_file_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def ancestor_label: CString = struct._2
      def ancestor_label_=(value: CString): Unit = !struct.at2 = value
      def our_label: CString = struct._3
      def our_label_=(value: CString): Unit = !struct.at3 = value
      def their_label: CString = struct._4
      def their_label_=(value: CString): Unit = !struct.at4 = value
      def favor: git_merge_file_favor_t = struct._5
      def favor_=(value: git_merge_file_favor_t): Unit = !struct.at5 = value
      def flags: uint32_t = struct._6
      def flags_=(value: uint32_t): Unit = !struct.at6 = value
      def marker_size: CUnsignedShort = struct._7
      def marker_size_=(value: CUnsignedShort): Unit = !struct.at7 = value
    end extension
  end git_merge_file_options

  /** Information about file-level merging
    */
  opaque type git_merge_file_result =
    CStruct5[CUnsignedInt, CString, CUnsignedInt, CString, size_t]
  object git_merge_file_result:
    given _tag: Tag[git_merge_file_result] = Tag.materializeCStruct5Tag[
      CUnsignedInt,
      CString,
      CUnsignedInt,
      CString,
      size_t
    ]
    def apply()(using Zone): Ptr[git_merge_file_result] =
      scala.scalanative.unsafe.alloc[git_merge_file_result](1)
    def apply(
        automergeable: CUnsignedInt,
        path: CString,
        mode: CUnsignedInt,
        ptr: CString,
        len: size_t
    )(using Zone): Ptr[git_merge_file_result] =
      val ____ptr = apply()
      (!____ptr).automergeable = automergeable
      (!____ptr).path = path
      (!____ptr).mode = mode
      (!____ptr).ptr = ptr
      (!____ptr).len = len
      ____ptr
    end apply
    extension (struct: git_merge_file_result)
      def automergeable: CUnsignedInt = struct._1
      def automergeable_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def path: CString = struct._2
      def path_=(value: CString): Unit = !struct.at2 = value
      def mode: CUnsignedInt = struct._3
      def mode_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def ptr: CString = struct._4
      def ptr_=(value: CString): Unit = !struct.at4 = value
      def len: size_t = struct._5
      def len_=(value: size_t): Unit = !struct.at5 = value
    end extension
  end git_merge_file_result

  /** Merging options
    */
  opaque type git_merge_options =
    CStruct9[CUnsignedInt, uint32_t, CUnsignedInt, CUnsignedInt, Ptr[
      git_diff_similarity_metric
    ], CUnsignedInt, CString, git_merge_file_favor_t, uint32_t]
  object git_merge_options:
    given _tag: Tag[git_merge_options] = Tag.materializeCStruct9Tag[
      CUnsignedInt,
      uint32_t,
      CUnsignedInt,
      CUnsignedInt,
      Ptr[git_diff_similarity_metric],
      CUnsignedInt,
      CString,
      git_merge_file_favor_t,
      uint32_t
    ]
    def apply()(using Zone): Ptr[git_merge_options] =
      scala.scalanative.unsafe.alloc[git_merge_options](1)
    def apply(
        version: CUnsignedInt,
        flags: uint32_t,
        rename_threshold: CUnsignedInt,
        target_limit: CUnsignedInt,
        metric: Ptr[git_diff_similarity_metric],
        recursion_limit: CUnsignedInt,
        default_driver: CString,
        file_favor: git_merge_file_favor_t,
        file_flags: uint32_t
    )(using Zone): Ptr[git_merge_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).rename_threshold = rename_threshold
      (!____ptr).target_limit = target_limit
      (!____ptr).metric = metric
      (!____ptr).recursion_limit = recursion_limit
      (!____ptr).default_driver = default_driver
      (!____ptr).file_favor = file_favor
      (!____ptr).file_flags = file_flags
      ____ptr
    end apply
    extension (struct: git_merge_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def rename_threshold: CUnsignedInt = struct._3
      def rename_threshold_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def target_limit: CUnsignedInt = struct._4
      def target_limit_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def metric: Ptr[git_diff_similarity_metric] = struct._5
      def metric_=(value: Ptr[git_diff_similarity_metric]): Unit = !struct.at5 =
        value
      def recursion_limit: CUnsignedInt = struct._6
      def recursion_limit_=(value: CUnsignedInt): Unit = !struct.at6 = value
      def default_driver: CString = struct._7
      def default_driver_=(value: CString): Unit = !struct.at7 = value
      def file_favor: git_merge_file_favor_t = struct._8
      def file_favor_=(value: git_merge_file_favor_t): Unit = !struct.at8 =
        value
      def file_flags: uint32_t = struct._9
      def file_flags_=(value: uint32_t): Unit = !struct.at9 = value
    end extension
  end git_merge_options

  /** Represents a single git message trailer.
    */
  opaque type git_message_trailer = CStruct2[CString, CString]
  object git_message_trailer:
    given _tag: Tag[git_message_trailer] =
      Tag.materializeCStruct2Tag[CString, CString]
    def apply()(using Zone): Ptr[git_message_trailer] =
      scala.scalanative.unsafe.alloc[git_message_trailer](1)
    def apply(key: CString, value: CString)(using
        Zone
    ): Ptr[git_message_trailer] =
      val ____ptr = apply()
      (!____ptr).key = key
      (!____ptr).value = value
      ____ptr
    extension (struct: git_message_trailer)
      def key: CString = struct._1
      def key_=(value: CString): Unit = !struct.at1 = value
      def value: CString = struct._2
      def value_=(value: CString): Unit = !struct.at2 = value
  end git_message_trailer

  /** Represents an array of git message trailers.
    */
  opaque type git_message_trailer_array =
    CStruct3[Ptr[git_message_trailer], size_t, CString]
  object git_message_trailer_array:
    given _tag: Tag[git_message_trailer_array] =
      Tag.materializeCStruct3Tag[Ptr[git_message_trailer], size_t, CString]
    def apply()(using Zone): Ptr[git_message_trailer_array] =
      scala.scalanative.unsafe.alloc[git_message_trailer_array](1)
    def apply(
        trailers: Ptr[git_message_trailer],
        count: size_t,
        _trailer_block: CString
    )(using Zone): Ptr[git_message_trailer_array] =
      val ____ptr = apply()
      (!____ptr).trailers = trailers
      (!____ptr).count = count
      (!____ptr)._trailer_block = _trailer_block
      ____ptr
    end apply
    extension (struct: git_message_trailer_array)
      def trailers: Ptr[git_message_trailer] = struct._1
      def trailers_=(value: Ptr[git_message_trailer]): Unit = !struct.at1 =
        value
      def count: size_t = struct._2
      def count_=(value: size_t): Unit = !struct.at2 = value
      def _trailer_block: CString = struct._3
      def _trailer_block_=(value: CString): Unit = !struct.at3 = value
  end git_message_trailer_array

  /** */
  opaque type git_midx_writer = CStruct0
  object git_midx_writer:
    given _tag: Tag[git_midx_writer] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_note = CStruct0
  object git_note:
    given _tag: Tag[git_note] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_note_iterator = CStruct0
  object git_note_iterator:
    given _tag: Tag[git_note_iterator] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_object = CStruct0
  object git_object:
    given _tag: Tag[git_object] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_odb = CStruct0
  object git_odb:
    given _tag: Tag[git_odb] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_odb_backend = CStruct0
  object git_odb_backend:
    given _tag: Tag[git_odb_backend] = Tag.materializeCStruct0Tag

  /** Options for configuring a loose object backend.
    */
  opaque type git_odb_backend_loose_options = CStruct6[
    CUnsignedInt,
    uint32_t,
    CInt,
    CUnsignedInt,
    CUnsignedInt,
    git_oid_t
  ]
  object git_odb_backend_loose_options:
    given _tag: Tag[git_odb_backend_loose_options] = Tag.materializeCStruct6Tag[
      CUnsignedInt,
      uint32_t,
      CInt,
      CUnsignedInt,
      CUnsignedInt,
      git_oid_t
    ]
    def apply()(using Zone): Ptr[git_odb_backend_loose_options] =
      scala.scalanative.unsafe.alloc[git_odb_backend_loose_options](1)
    def apply(
        version: CUnsignedInt,
        flags: uint32_t,
        compression_level: CInt,
        dir_mode: CUnsignedInt,
        file_mode: CUnsignedInt,
        oid_type: git_oid_t
    )(using Zone): Ptr[git_odb_backend_loose_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).compression_level = compression_level
      (!____ptr).dir_mode = dir_mode
      (!____ptr).file_mode = file_mode
      (!____ptr).oid_type = oid_type
      ____ptr
    end apply
    extension (struct: git_odb_backend_loose_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def compression_level: CInt = struct._3
      def compression_level_=(value: CInt): Unit = !struct.at3 = value
      def dir_mode: CUnsignedInt = struct._4
      def dir_mode_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def file_mode: CUnsignedInt = struct._5
      def file_mode_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def oid_type: git_oid_t = struct._6
      def oid_type_=(value: git_oid_t): Unit = !struct.at6 = value
    end extension
  end git_odb_backend_loose_options

  /** Options for configuring a packfile object backend.
    */
  opaque type git_odb_backend_pack_options = CStruct2[CUnsignedInt, git_oid_t]
  object git_odb_backend_pack_options:
    given _tag: Tag[git_odb_backend_pack_options] =
      Tag.materializeCStruct2Tag[CUnsignedInt, git_oid_t]
    def apply()(using Zone): Ptr[git_odb_backend_pack_options] =
      scala.scalanative.unsafe.alloc[git_odb_backend_pack_options](1)
    def apply(version: CUnsignedInt, oid_type: git_oid_t)(using
        Zone
    ): Ptr[git_odb_backend_pack_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).oid_type = oid_type
      ____ptr
    extension (struct: git_odb_backend_pack_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def oid_type: git_oid_t = struct._2
      def oid_type_=(value: git_oid_t): Unit = !struct.at2 = value
  end git_odb_backend_pack_options

  /** The information about object IDs to query in `git_odb_expand_ids`, which
    * will be populated upon return.
    */
  opaque type git_odb_expand_id =
    CStruct3[git_oid, CUnsignedShort, git_object_t]
  object git_odb_expand_id:
    given _tag: Tag[git_odb_expand_id] =
      Tag.materializeCStruct3Tag[git_oid, CUnsignedShort, git_object_t]
    def apply()(using Zone): Ptr[git_odb_expand_id] =
      scala.scalanative.unsafe.alloc[git_odb_expand_id](1)
    def apply(id: git_oid, length: CUnsignedShort, `type`: git_object_t)(using
        Zone
    ): Ptr[git_odb_expand_id] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).length = length
      (!____ptr).`type` = `type`
      ____ptr
    extension (struct: git_odb_expand_id)
      def id: git_oid = struct._1
      def id_=(value: git_oid): Unit = !struct.at1 = value
      def length: CUnsignedShort = struct._2
      def length_=(value: CUnsignedShort): Unit = !struct.at2 = value
      def `type`: git_object_t = struct._3
      def type_=(value: git_object_t): Unit = !struct.at3 = value
  end git_odb_expand_id

  /** */
  opaque type git_odb_object = CStruct0
  object git_odb_object:
    given _tag: Tag[git_odb_object] = Tag.materializeCStruct0Tag

  /** Options for configuring a loose object backend.
    */
  opaque type git_odb_options = CStruct2[CUnsignedInt, git_oid_t]
  object git_odb_options:
    given _tag: Tag[git_odb_options] =
      Tag.materializeCStruct2Tag[CUnsignedInt, git_oid_t]
    def apply()(using Zone): Ptr[git_odb_options] =
      scala.scalanative.unsafe.alloc[git_odb_options](1)
    def apply(version: CUnsignedInt, oid_type: git_oid_t)(using
        Zone
    ): Ptr[git_odb_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).oid_type = oid_type
      ____ptr
    extension (struct: git_odb_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def oid_type: git_oid_t = struct._2
      def oid_type_=(value: git_oid_t): Unit = !struct.at2 = value
  end git_odb_options

  /** A stream to read/write from a backend.
    */
  opaque type git_odb_stream = CStruct9[
    Ptr[git_odb_backend],
    CUnsignedInt,
    Ptr[Byte],
    git_object_size_t,
    git_object_size_t,
    CFuncPtr3[Ptr[Byte], CString, size_t, CInt],
    CFuncPtr3[Ptr[Byte], CString, size_t, CInt],
    CFuncPtr2[Ptr[Byte], Ptr[git_oid], CInt],
    CFuncPtr1[Ptr[Byte], Unit]
  ]
  object git_odb_stream:
    given _tag: Tag[git_odb_stream] = Tag.materializeCStruct9Tag[
      Ptr[git_odb_backend],
      CUnsignedInt,
      Ptr[Byte],
      git_object_size_t,
      git_object_size_t,
      CFuncPtr3[Ptr[Byte], CString, size_t, CInt],
      CFuncPtr3[Ptr[Byte], CString, size_t, CInt],
      CFuncPtr2[Ptr[Byte], Ptr[git_oid], CInt],
      CFuncPtr1[Ptr[Byte], Unit]
    ]
    def apply()(using Zone): Ptr[git_odb_stream] =
      scala.scalanative.unsafe.alloc[git_odb_stream](1)
    def apply(
        backend: Ptr[git_odb_backend],
        mode: CUnsignedInt,
        hash_ctx: Ptr[Byte],
        declared_size: git_object_size_t,
        received_bytes: git_object_size_t,
        read: CFuncPtr3[Ptr[git_odb_stream], CString, size_t, CInt],
        write: CFuncPtr3[Ptr[git_odb_stream], CString, size_t, CInt],
        finalize_write: CFuncPtr2[Ptr[git_odb_stream], Ptr[git_oid], CInt],
        free: CFuncPtr1[Ptr[git_odb_stream], Unit]
    )(using Zone): Ptr[git_odb_stream] =
      val ____ptr = apply()
      (!____ptr).backend = backend
      (!____ptr).mode = mode
      (!____ptr).hash_ctx = hash_ctx
      (!____ptr).declared_size = declared_size
      (!____ptr).received_bytes = received_bytes
      (!____ptr).read = read
      (!____ptr).write = write
      (!____ptr).finalize_write = finalize_write
      (!____ptr).free = free
      ____ptr
    end apply
    extension (struct: git_odb_stream)
      def backend: Ptr[git_odb_backend] = struct._1
      def backend_=(value: Ptr[git_odb_backend]): Unit = !struct.at1 = value
      def mode: CUnsignedInt = struct._2
      def mode_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def hash_ctx: Ptr[Byte] = struct._3
      def hash_ctx_=(value: Ptr[Byte]): Unit = !struct.at3 = value
      def declared_size: git_object_size_t = struct._4
      def declared_size_=(value: git_object_size_t): Unit = !struct.at4 = value
      def received_bytes: git_object_size_t = struct._5
      def received_bytes_=(value: git_object_size_t): Unit = !struct.at5 = value
      def read: CFuncPtr3[Ptr[git_odb_stream], CString, size_t, CInt] =
        struct._6
          .asInstanceOf[CFuncPtr3[Ptr[git_odb_stream], CString, size_t, CInt]]
      def read_=(
          value: CFuncPtr3[Ptr[git_odb_stream], CString, size_t, CInt]
      ): Unit = !struct.at6 =
        value.asInstanceOf[CFuncPtr3[Ptr[Byte], CString, size_t, CInt]]
      def write: CFuncPtr3[Ptr[git_odb_stream], CString, size_t, CInt] =
        struct._7
          .asInstanceOf[CFuncPtr3[Ptr[git_odb_stream], CString, size_t, CInt]]
      def write_=(
          value: CFuncPtr3[Ptr[git_odb_stream], CString, size_t, CInt]
      ): Unit = !struct.at7 =
        value.asInstanceOf[CFuncPtr3[Ptr[Byte], CString, size_t, CInt]]
      def finalize_write: CFuncPtr2[Ptr[git_odb_stream], Ptr[git_oid], CInt] =
        struct._8
          .asInstanceOf[CFuncPtr2[Ptr[git_odb_stream], Ptr[git_oid], CInt]]
      def finalize_write_=(
          value: CFuncPtr2[Ptr[git_odb_stream], Ptr[git_oid], CInt]
      ): Unit = !struct.at8 =
        value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[git_oid], CInt]]
      def free: CFuncPtr1[Ptr[git_odb_stream], Unit] =
        struct._9.asInstanceOf[CFuncPtr1[Ptr[git_odb_stream], Unit]]
      def free_=(value: CFuncPtr1[Ptr[git_odb_stream], Unit]): Unit =
        !struct.at9 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
    end extension
  end git_odb_stream

  /** A stream to write a pack file to the ODB
    */
  opaque type git_odb_writepack = CStruct4[
    Ptr[git_odb_backend],
    CFuncPtr4[Ptr[Byte], Ptr[Byte], size_t, Ptr[git_indexer_progress], CInt],
    CFuncPtr2[Ptr[Byte], Ptr[git_indexer_progress], CInt],
    CFuncPtr1[Ptr[Byte], Unit]
  ]
  object git_odb_writepack:
    given _tag: Tag[git_odb_writepack] = Tag.materializeCStruct4Tag[
      Ptr[git_odb_backend],
      CFuncPtr4[Ptr[Byte], Ptr[Byte], size_t, Ptr[git_indexer_progress], CInt],
      CFuncPtr2[Ptr[Byte], Ptr[git_indexer_progress], CInt],
      CFuncPtr1[Ptr[Byte], Unit]
    ]
    def apply()(using Zone): Ptr[git_odb_writepack] =
      scala.scalanative.unsafe.alloc[git_odb_writepack](1)
    def apply(
        backend: Ptr[git_odb_backend],
        append: CFuncPtr4[Ptr[git_odb_writepack], Ptr[Byte], size_t, Ptr[
          git_indexer_progress
        ], CInt],
        commit: CFuncPtr2[Ptr[git_odb_writepack], Ptr[
          git_indexer_progress
        ], CInt],
        free: CFuncPtr1[Ptr[git_odb_writepack], Unit]
    )(using Zone): Ptr[git_odb_writepack] =
      val ____ptr = apply()
      (!____ptr).backend = backend
      (!____ptr).append = append
      (!____ptr).commit = commit
      (!____ptr).free = free
      ____ptr
    end apply
    extension (struct: git_odb_writepack)
      def backend: Ptr[git_odb_backend] = struct._1
      def backend_=(value: Ptr[git_odb_backend]): Unit = !struct.at1 = value
      def append: CFuncPtr4[Ptr[git_odb_writepack], Ptr[Byte], size_t, Ptr[
        git_indexer_progress
      ], CInt] = struct._2.asInstanceOf[CFuncPtr4[Ptr[git_odb_writepack], Ptr[
        Byte
      ], size_t, Ptr[git_indexer_progress], CInt]]
      def append_=(
          value: CFuncPtr4[Ptr[git_odb_writepack], Ptr[Byte], size_t, Ptr[
            git_indexer_progress
          ], CInt]
      ): Unit = !struct.at2 = value.asInstanceOf[CFuncPtr4[Ptr[Byte], Ptr[
        Byte
      ], size_t, Ptr[git_indexer_progress], CInt]]
      def commit
          : CFuncPtr2[Ptr[git_odb_writepack], Ptr[git_indexer_progress], CInt] =
        struct._3.asInstanceOf[CFuncPtr2[Ptr[git_odb_writepack], Ptr[
          git_indexer_progress
        ], CInt]]
      def commit_=(
          value: CFuncPtr2[Ptr[git_odb_writepack], Ptr[
            git_indexer_progress
          ], CInt]
      ): Unit = !struct.at3 = value
        .asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[git_indexer_progress], CInt]]
      def free: CFuncPtr1[Ptr[git_odb_writepack], Unit] =
        struct._4.asInstanceOf[CFuncPtr1[Ptr[git_odb_writepack], Unit]]
      def free_=(value: CFuncPtr1[Ptr[git_odb_writepack], Unit]): Unit =
        !struct.at4 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
    end extension
  end git_odb_writepack

  /** Unique identity of any object (commit, tree, blob, tag).
    */
  opaque type git_oid =
    CStruct1[CArray[CUnsignedChar, Nat.Digit2[Nat._2, Nat._0]]]
  object git_oid:
    given _tag: Tag[git_oid] = Tag
      .materializeCStruct1Tag[CArray[CUnsignedChar, Nat.Digit2[Nat._2, Nat._0]]]
    def apply()(using Zone): Ptr[git_oid] =
      scala.scalanative.unsafe.alloc[git_oid](1)
    def apply(id: CArray[CUnsignedChar, Nat.Digit2[Nat._2, Nat._0]])(using
        Zone
    ): Ptr[git_oid] =
      val ____ptr = apply()
      (!____ptr).id = id
      ____ptr
    extension (struct: git_oid)
      def id: CArray[CUnsignedChar, Nat.Digit2[Nat._2, Nat._0]] = struct._1
      def id_=(value: CArray[CUnsignedChar, Nat.Digit2[Nat._2, Nat._0]]): Unit =
        !struct.at1 = value
  end git_oid

  /** */
  opaque type git_oid_shorten = CStruct0
  object git_oid_shorten:
    given _tag: Tag[git_oid_shorten] = Tag.materializeCStruct0Tag

  /** Array of object ids
    */
  opaque type git_oidarray = CStruct2[Ptr[git_oid], size_t]
  object git_oidarray:
    given _tag: Tag[git_oidarray] =
      Tag.materializeCStruct2Tag[Ptr[git_oid], size_t]
    def apply()(using Zone): Ptr[git_oidarray] =
      scala.scalanative.unsafe.alloc[git_oidarray](1)
    def apply(ids: Ptr[git_oid], count: size_t)(using Zone): Ptr[git_oidarray] =
      val ____ptr = apply()
      (!____ptr).ids = ids
      (!____ptr).count = count
      ____ptr
    extension (struct: git_oidarray)
      def ids: Ptr[git_oid] = struct._1
      def ids_=(value: Ptr[git_oid]): Unit = !struct.at1 = value
      def count: size_t = struct._2
      def count_=(value: size_t): Unit = !struct.at2 = value
  end git_oidarray

  /** */
  opaque type git_packbuilder = CStruct0
  object git_packbuilder:
    given _tag: Tag[git_packbuilder] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_patch = CStruct0
  object git_patch:
    given _tag: Tag[git_patch] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_pathspec = CStruct0
  object git_pathspec:
    given _tag: Tag[git_pathspec] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_pathspec_match_list = CStruct0
  object git_pathspec_match_list:
    given _tag: Tag[git_pathspec_match_list] = Tag.materializeCStruct0Tag

  /** Options for connecting through a proxy
    */
  opaque type git_proxy_options =
    CStruct6[CUnsignedInt, git_proxy_t, CString, Ptr[
      Byte
    ], git_transport_certificate_check_cb, Ptr[Byte]]
  object git_proxy_options:
    given _tag: Tag[git_proxy_options] =
      Tag.materializeCStruct6Tag[CUnsignedInt, git_proxy_t, CString, Ptr[
        Byte
      ], git_transport_certificate_check_cb, Ptr[Byte]]
    def apply()(using Zone): Ptr[git_proxy_options] =
      scala.scalanative.unsafe.alloc[git_proxy_options](1)
    def apply(
        version: CUnsignedInt,
        `type`: git_proxy_t,
        url: CString,
        credentials: git_credential_acquire_cb,
        certificate_check: git_transport_certificate_check_cb,
        payload: Ptr[Byte]
    )(using Zone): Ptr[git_proxy_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).`type` = `type`
      (!____ptr).url = url
      (!____ptr).credentials = credentials
      (!____ptr).certificate_check = certificate_check
      (!____ptr).payload = payload
      ____ptr
    end apply
    extension (struct: git_proxy_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def `type`: git_proxy_t = struct._2
      def type_=(value: git_proxy_t): Unit = !struct.at2 = value
      def url: CString = struct._3
      def url_=(value: CString): Unit = !struct.at3 = value
      def credentials: git_credential_acquire_cb =
        struct._4.asInstanceOf[git_credential_acquire_cb]
      def credentials_=(value: git_credential_acquire_cb): Unit = !struct.at4 =
        value.asInstanceOf[Ptr[Byte]]
      def certificate_check: git_transport_certificate_check_cb = struct._5
      def certificate_check_=(value: git_transport_certificate_check_cb): Unit =
        !struct.at5 = value
      def payload: Ptr[Byte] = struct._6
      def payload_=(value: Ptr[Byte]): Unit = !struct.at6 = value
    end extension
  end git_proxy_options

  /** */
  opaque type git_push = CStruct0
  object git_push:
    given _tag: Tag[git_push] = Tag.materializeCStruct0Tag

  /** Controls the behavior of a git_push object.
    */
  opaque type git_push_options = CStruct6[
    CUnsignedInt,
    CUnsignedInt,
    git_remote_callbacks,
    git_proxy_options,
    git_remote_redirect_t,
    git_strarray
  ]
  object git_push_options:
    given _tag: Tag[git_push_options] = Tag.materializeCStruct6Tag[
      CUnsignedInt,
      CUnsignedInt,
      git_remote_callbacks,
      git_proxy_options,
      git_remote_redirect_t,
      git_strarray
    ]
    def apply()(using Zone): Ptr[git_push_options] =
      scala.scalanative.unsafe.alloc[git_push_options](1)
    def apply(
        version: CUnsignedInt,
        pb_parallelism: CUnsignedInt,
        callbacks: git_remote_callbacks,
        proxy_opts: git_proxy_options,
        follow_redirects: git_remote_redirect_t,
        custom_headers: git_strarray
    )(using Zone): Ptr[git_push_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).pb_parallelism = pb_parallelism
      (!____ptr).callbacks = callbacks
      (!____ptr).proxy_opts = proxy_opts
      (!____ptr).follow_redirects = follow_redirects
      (!____ptr).custom_headers = custom_headers
      ____ptr
    end apply
    extension (struct: git_push_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def pb_parallelism: CUnsignedInt = struct._2
      def pb_parallelism_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def callbacks: git_remote_callbacks = struct._3
      def callbacks_=(value: git_remote_callbacks): Unit = !struct.at3 = value
      def proxy_opts: git_proxy_options = struct._4
      def proxy_opts_=(value: git_proxy_options): Unit = !struct.at4 = value
      def follow_redirects: git_remote_redirect_t = struct._5
      def follow_redirects_=(value: git_remote_redirect_t): Unit = !struct.at5 =
        value
      def custom_headers: git_strarray = struct._6
      def custom_headers_=(value: git_strarray): Unit = !struct.at6 = value
    end extension
  end git_push_options

  /** Represents an update which will be performed on the remote during push
    */
  opaque type git_push_update = CStruct4[CString, CString, git_oid, git_oid]
  object git_push_update:
    given _tag: Tag[git_push_update] =
      Tag.materializeCStruct4Tag[CString, CString, git_oid, git_oid]
    def apply()(using Zone): Ptr[git_push_update] =
      scala.scalanative.unsafe.alloc[git_push_update](1)
    def apply(
        src_refname: CString,
        dst_refname: CString,
        src: git_oid,
        dst: git_oid
    )(using Zone): Ptr[git_push_update] =
      val ____ptr = apply()
      (!____ptr).src_refname = src_refname
      (!____ptr).dst_refname = dst_refname
      (!____ptr).src = src
      (!____ptr).dst = dst
      ____ptr
    end apply
    extension (struct: git_push_update)
      def src_refname: CString = struct._1
      def src_refname_=(value: CString): Unit = !struct.at1 = value
      def dst_refname: CString = struct._2
      def dst_refname_=(value: CString): Unit = !struct.at2 = value
      def src: git_oid = struct._3
      def src_=(value: git_oid): Unit = !struct.at3 = value
      def dst: git_oid = struct._4
      def dst_=(value: git_oid): Unit = !struct.at4 = value
  end git_push_update

  /** */
  opaque type git_rebase = CStruct0
  object git_rebase:
    given _tag: Tag[git_rebase] = Tag.materializeCStruct0Tag

  /** A rebase operation
    */
  opaque type git_rebase_operation =
    CStruct3[git_rebase_operation_t, git_oid, CString]
  object git_rebase_operation:
    given _tag: Tag[git_rebase_operation] =
      Tag.materializeCStruct3Tag[git_rebase_operation_t, git_oid, CString]
    def apply()(using Zone): Ptr[git_rebase_operation] =
      scala.scalanative.unsafe.alloc[git_rebase_operation](1)
    def apply(`type`: git_rebase_operation_t, id: git_oid, exec: CString)(using
        Zone
    ): Ptr[git_rebase_operation] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).id = id
      (!____ptr).exec = exec
      ____ptr
    extension (struct: git_rebase_operation)
      def `type`: git_rebase_operation_t = struct._1
      def type_=(value: git_rebase_operation_t): Unit = !struct.at1 = value
      def id: git_oid = struct._2
      def id_=(value: git_oid): Unit = !struct.at2 = value
      def exec: CString = struct._3
      def exec_=(value: CString): Unit = !struct.at3 = value
  end git_rebase_operation

  /** Rebase options
    */
  opaque type git_rebase_options = CStruct9[
    CUnsignedInt,
    CInt,
    CInt,
    CString,
    git_merge_options,
    git_checkout_options,
    git_commit_create_cb,
    CFuncPtr4[Ptr[git_buf], Ptr[git_buf], CString, Ptr[Byte], CInt],
    Ptr[Byte]
  ]
  object git_rebase_options:
    given _tag: Tag[git_rebase_options] = Tag.materializeCStruct9Tag[
      CUnsignedInt,
      CInt,
      CInt,
      CString,
      git_merge_options,
      git_checkout_options,
      git_commit_create_cb,
      CFuncPtr4[Ptr[git_buf], Ptr[git_buf], CString, Ptr[Byte], CInt],
      Ptr[Byte]
    ]
    def apply()(using Zone): Ptr[git_rebase_options] =
      scala.scalanative.unsafe.alloc[git_rebase_options](1)
    def apply(
        version: CUnsignedInt,
        quiet: CInt,
        inmemory: CInt,
        rewrite_notes_ref: CString,
        merge_options: git_merge_options,
        checkout_options: git_checkout_options,
        commit_create_cb: git_commit_create_cb,
        signing_cb: CFuncPtr4[Ptr[git_buf], Ptr[git_buf], CString, Ptr[
          Byte
        ], CInt],
        payload: Ptr[Byte]
    )(using Zone): Ptr[git_rebase_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).quiet = quiet
      (!____ptr).inmemory = inmemory
      (!____ptr).rewrite_notes_ref = rewrite_notes_ref
      (!____ptr).merge_options = merge_options
      (!____ptr).checkout_options = checkout_options
      (!____ptr).commit_create_cb = commit_create_cb
      (!____ptr).signing_cb = signing_cb
      (!____ptr).payload = payload
      ____ptr
    end apply
    extension (struct: git_rebase_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def quiet: CInt = struct._2
      def quiet_=(value: CInt): Unit = !struct.at2 = value
      def inmemory: CInt = struct._3
      def inmemory_=(value: CInt): Unit = !struct.at3 = value
      def rewrite_notes_ref: CString = struct._4
      def rewrite_notes_ref_=(value: CString): Unit = !struct.at4 = value
      def merge_options: git_merge_options = struct._5
      def merge_options_=(value: git_merge_options): Unit = !struct.at5 = value
      def checkout_options: git_checkout_options = struct._6
      def checkout_options_=(value: git_checkout_options): Unit = !struct.at6 =
        value
      def commit_create_cb: git_commit_create_cb = struct._7
      def commit_create_cb_=(value: git_commit_create_cb): Unit = !struct.at7 =
        value
      def signing_cb
          : CFuncPtr4[Ptr[git_buf], Ptr[git_buf], CString, Ptr[Byte], CInt] =
        struct._8
      def signing_cb_=(
          value: CFuncPtr4[Ptr[git_buf], Ptr[git_buf], CString, Ptr[Byte], CInt]
      ): Unit = !struct.at8 = value
      def payload: Ptr[Byte] = struct._9
      def payload_=(value: Ptr[Byte]): Unit = !struct.at9 = value
    end extension
  end git_rebase_options

  /** */
  opaque type git_refdb = CStruct0
  object git_refdb:
    given _tag: Tag[git_refdb] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_refdb_backend = CStruct0
  object git_refdb_backend:
    given _tag: Tag[git_refdb_backend] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_reference = CStruct0
  object git_reference:
    given _tag: Tag[git_reference] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_reference_iterator = CStruct0
  object git_reference_iterator:
    given _tag: Tag[git_reference_iterator] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_reflog = CStruct0
  object git_reflog:
    given _tag: Tag[git_reflog] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_reflog_entry = CStruct0
  object git_reflog_entry:
    given _tag: Tag[git_reflog_entry] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_refspec = CStruct0
  object git_refspec:
    given _tag: Tag[git_refspec] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_remote = CStruct0
  object git_remote:
    given _tag: Tag[git_remote] = Tag.materializeCStruct0Tag

  /** The callback settings structure
    */
  opaque type git_remote_callbacks = CStruct15[
    CUnsignedInt,
    git_transport_message_cb,
    CFuncPtr2[git_remote_completion_t, Ptr[Byte], CInt],
    Ptr[Byte],
    git_transport_certificate_check_cb,
    git_indexer_progress_cb,
    CFuncPtr4[CString, Ptr[git_oid], Ptr[git_oid], Ptr[Byte], CInt],
    git_packbuilder_progress,
    git_push_transfer_progress_cb,
    git_push_update_reference_cb,
    git_push_negotiation,
    git_transport_cb,
    git_remote_ready_cb,
    Ptr[Byte],
    git_url_resolve_cb
  ]
  object git_remote_callbacks:
    given _tag: Tag[git_remote_callbacks] = Tag.materializeCStruct15Tag[
      CUnsignedInt,
      git_transport_message_cb,
      CFuncPtr2[git_remote_completion_t, Ptr[Byte], CInt],
      Ptr[Byte],
      git_transport_certificate_check_cb,
      git_indexer_progress_cb,
      CFuncPtr4[CString, Ptr[git_oid], Ptr[git_oid], Ptr[Byte], CInt],
      git_packbuilder_progress,
      git_push_transfer_progress_cb,
      git_push_update_reference_cb,
      git_push_negotiation,
      git_transport_cb,
      git_remote_ready_cb,
      Ptr[Byte],
      git_url_resolve_cb
    ]
    def apply()(using Zone): Ptr[git_remote_callbacks] =
      scala.scalanative.unsafe.alloc[git_remote_callbacks](1)
    def apply(
        version: CUnsignedInt,
        sideband_progress: git_transport_message_cb,
        completion: CFuncPtr2[git_remote_completion_t, Ptr[Byte], CInt],
        credentials: git_credential_acquire_cb,
        certificate_check: git_transport_certificate_check_cb,
        transfer_progress: git_indexer_progress_cb,
        update_tips: CFuncPtr4[CString, Ptr[git_oid], Ptr[git_oid], Ptr[
          Byte
        ], CInt],
        pack_progress: git_packbuilder_progress,
        push_transfer_progress: git_push_transfer_progress_cb,
        push_update_reference: git_push_update_reference_cb,
        push_negotiation: git_push_negotiation,
        transport: git_transport_cb,
        remote_ready: git_remote_ready_cb,
        payload: Ptr[Byte],
        resolve_url: git_url_resolve_cb
    )(using Zone): Ptr[git_remote_callbacks] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).sideband_progress = sideband_progress
      (!____ptr).completion = completion
      (!____ptr).credentials = credentials
      (!____ptr).certificate_check = certificate_check
      (!____ptr).transfer_progress = transfer_progress
      (!____ptr).update_tips = update_tips
      (!____ptr).pack_progress = pack_progress
      (!____ptr).push_transfer_progress = push_transfer_progress
      (!____ptr).push_update_reference = push_update_reference
      (!____ptr).push_negotiation = push_negotiation
      (!____ptr).transport = transport
      (!____ptr).remote_ready = remote_ready
      (!____ptr).payload = payload
      (!____ptr).resolve_url = resolve_url
      ____ptr
    end apply
    extension (struct: git_remote_callbacks)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def sideband_progress: git_transport_message_cb = struct._2
      def sideband_progress_=(value: git_transport_message_cb): Unit =
        !struct.at2 = value
      def completion: CFuncPtr2[git_remote_completion_t, Ptr[Byte], CInt] =
        struct._3
      def completion_=(
          value: CFuncPtr2[git_remote_completion_t, Ptr[Byte], CInt]
      ): Unit = !struct.at3 = value
      def credentials: git_credential_acquire_cb =
        struct._4.asInstanceOf[git_credential_acquire_cb]
      def credentials_=(value: git_credential_acquire_cb): Unit = !struct.at4 =
        value.asInstanceOf[Ptr[Byte]]
      def certificate_check: git_transport_certificate_check_cb = struct._5
      def certificate_check_=(value: git_transport_certificate_check_cb): Unit =
        !struct.at5 = value
      def transfer_progress: git_indexer_progress_cb = struct._6
      def transfer_progress_=(value: git_indexer_progress_cb): Unit =
        !struct.at6 = value
      def update_tips
          : CFuncPtr4[CString, Ptr[git_oid], Ptr[git_oid], Ptr[Byte], CInt] =
        struct._7
      def update_tips_=(
          value: CFuncPtr4[CString, Ptr[git_oid], Ptr[git_oid], Ptr[Byte], CInt]
      ): Unit = !struct.at7 = value
      def pack_progress: git_packbuilder_progress = struct._8
      def pack_progress_=(value: git_packbuilder_progress): Unit = !struct.at8 =
        value
      def push_transfer_progress: git_push_transfer_progress_cb = struct._9
      def push_transfer_progress_=(value: git_push_transfer_progress_cb): Unit =
        !struct.at9 = value
      def push_update_reference: git_push_update_reference_cb = struct._10
      def push_update_reference_=(value: git_push_update_reference_cb): Unit =
        !struct.at10 = value
      def push_negotiation: git_push_negotiation = struct._11
      def push_negotiation_=(value: git_push_negotiation): Unit = !struct.at11 =
        value
      def transport: git_transport_cb = struct._12
      def transport_=(value: git_transport_cb): Unit = !struct.at12 = value
      def remote_ready: git_remote_ready_cb = struct._13
      def remote_ready_=(value: git_remote_ready_cb): Unit = !struct.at13 =
        value
      def payload: Ptr[Byte] = struct._14
      def payload_=(value: Ptr[Byte]): Unit = !struct.at14 = value
      def resolve_url: git_url_resolve_cb = struct._15
      def resolve_url_=(value: git_url_resolve_cb): Unit = !struct.at15 = value
    end extension
  end git_remote_callbacks

  /** Remote creation options structure
    */
  opaque type git_remote_connect_options = CStruct5[
    CUnsignedInt,
    git_remote_callbacks,
    git_proxy_options,
    git_remote_redirect_t,
    git_strarray
  ]
  object git_remote_connect_options:
    given _tag: Tag[git_remote_connect_options] = Tag.materializeCStruct5Tag[
      CUnsignedInt,
      git_remote_callbacks,
      git_proxy_options,
      git_remote_redirect_t,
      git_strarray
    ]
    def apply()(using Zone): Ptr[git_remote_connect_options] =
      scala.scalanative.unsafe.alloc[git_remote_connect_options](1)
    def apply(
        version: CUnsignedInt,
        callbacks: git_remote_callbacks,
        proxy_opts: git_proxy_options,
        follow_redirects: git_remote_redirect_t,
        custom_headers: git_strarray
    )(using Zone): Ptr[git_remote_connect_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).callbacks = callbacks
      (!____ptr).proxy_opts = proxy_opts
      (!____ptr).follow_redirects = follow_redirects
      (!____ptr).custom_headers = custom_headers
      ____ptr
    end apply
    extension (struct: git_remote_connect_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def callbacks: git_remote_callbacks = struct._2
      def callbacks_=(value: git_remote_callbacks): Unit = !struct.at2 = value
      def proxy_opts: git_proxy_options = struct._3
      def proxy_opts_=(value: git_proxy_options): Unit = !struct.at3 = value
      def follow_redirects: git_remote_redirect_t = struct._4
      def follow_redirects_=(value: git_remote_redirect_t): Unit = !struct.at4 =
        value
      def custom_headers: git_strarray = struct._5
      def custom_headers_=(value: git_strarray): Unit = !struct.at5 = value
    end extension
  end git_remote_connect_options

  /** Remote creation options structure
    */
  opaque type git_remote_create_options =
    CStruct5[CUnsignedInt, Ptr[git_repository], CString, CString, CUnsignedInt]
  object git_remote_create_options:
    given _tag: Tag[git_remote_create_options] =
      Tag.materializeCStruct5Tag[CUnsignedInt, Ptr[
        git_repository
      ], CString, CString, CUnsignedInt]
    def apply()(using Zone): Ptr[git_remote_create_options] =
      scala.scalanative.unsafe.alloc[git_remote_create_options](1)
    def apply(
        version: CUnsignedInt,
        repository: Ptr[git_repository],
        name: CString,
        fetchspec: CString,
        flags: CUnsignedInt
    )(using Zone): Ptr[git_remote_create_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).repository = repository
      (!____ptr).name = name
      (!____ptr).fetchspec = fetchspec
      (!____ptr).flags = flags
      ____ptr
    end apply
    extension (struct: git_remote_create_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def repository: Ptr[git_repository] = struct._2
      def repository_=(value: Ptr[git_repository]): Unit = !struct.at2 = value
      def name: CString = struct._3
      def name_=(value: CString): Unit = !struct.at3 = value
      def fetchspec: CString = struct._4
      def fetchspec_=(value: CString): Unit = !struct.at4 = value
      def flags: CUnsignedInt = struct._5
      def flags_=(value: CUnsignedInt): Unit = !struct.at5 = value
    end extension
  end git_remote_create_options

  /** Description of a reference advertised by a remote server, given out on
    * `ls` calls.
    */
  opaque type git_remote_head =
    CStruct5[CInt, git_oid, git_oid, CString, CString]
  object git_remote_head:
    given _tag: Tag[git_remote_head] =
      Tag.materializeCStruct5Tag[CInt, git_oid, git_oid, CString, CString]
    def apply()(using Zone): Ptr[git_remote_head] =
      scala.scalanative.unsafe.alloc[git_remote_head](1)
    def apply(
        local: CInt,
        oid: git_oid,
        loid: git_oid,
        name: CString,
        symref_target: CString
    )(using Zone): Ptr[git_remote_head] =
      val ____ptr = apply()
      (!____ptr).local = local
      (!____ptr).oid = oid
      (!____ptr).loid = loid
      (!____ptr).name = name
      (!____ptr).symref_target = symref_target
      ____ptr
    end apply
    extension (struct: git_remote_head)
      def local: CInt = struct._1
      def local_=(value: CInt): Unit = !struct.at1 = value
      def oid: git_oid = struct._2
      def oid_=(value: git_oid): Unit = !struct.at2 = value
      def loid: git_oid = struct._3
      def loid_=(value: git_oid): Unit = !struct.at3 = value
      def name: CString = struct._4
      def name_=(value: CString): Unit = !struct.at4 = value
      def symref_target: CString = struct._5
      def symref_target_=(value: CString): Unit = !struct.at5 = value
    end extension
  end git_remote_head

  /** */
  opaque type git_repository = CStruct0
  object git_repository:
    given _tag: Tag[git_repository] = Tag.materializeCStruct0Tag

  /** Extended options structure for `git_repository_init_ext`.
    */
  opaque type git_repository_init_options = CStruct8[
    CUnsignedInt,
    uint32_t,
    uint32_t,
    CString,
    CString,
    CString,
    CString,
    CString
  ]
  object git_repository_init_options:
    given _tag: Tag[git_repository_init_options] = Tag.materializeCStruct8Tag[
      CUnsignedInt,
      uint32_t,
      uint32_t,
      CString,
      CString,
      CString,
      CString,
      CString
    ]
    def apply()(using Zone): Ptr[git_repository_init_options] =
      scala.scalanative.unsafe.alloc[git_repository_init_options](1)
    def apply(
        version: CUnsignedInt,
        flags: uint32_t,
        mode: uint32_t,
        workdir_path: CString,
        description: CString,
        template_path: CString,
        initial_head: CString,
        origin_url: CString
    )(using Zone): Ptr[git_repository_init_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).mode = mode
      (!____ptr).workdir_path = workdir_path
      (!____ptr).description = description
      (!____ptr).template_path = template_path
      (!____ptr).initial_head = initial_head
      (!____ptr).origin_url = origin_url
      ____ptr
    end apply
    extension (struct: git_repository_init_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def mode: uint32_t = struct._3
      def mode_=(value: uint32_t): Unit = !struct.at3 = value
      def workdir_path: CString = struct._4
      def workdir_path_=(value: CString): Unit = !struct.at4 = value
      def description: CString = struct._5
      def description_=(value: CString): Unit = !struct.at5 = value
      def template_path: CString = struct._6
      def template_path_=(value: CString): Unit = !struct.at6 = value
      def initial_head: CString = struct._7
      def initial_head_=(value: CString): Unit = !struct.at7 = value
      def origin_url: CString = struct._8
      def origin_url_=(value: CString): Unit = !struct.at8 = value
    end extension
  end git_repository_init_options

  /** Options for revert
    */
  opaque type git_revert_options = CStruct4[
    CUnsignedInt,
    CUnsignedInt,
    git_merge_options,
    git_checkout_options
  ]
  object git_revert_options:
    given _tag: Tag[git_revert_options] = Tag.materializeCStruct4Tag[
      CUnsignedInt,
      CUnsignedInt,
      git_merge_options,
      git_checkout_options
    ]
    def apply()(using Zone): Ptr[git_revert_options] =
      scala.scalanative.unsafe.alloc[git_revert_options](1)
    def apply(
        version: CUnsignedInt,
        mainline: CUnsignedInt,
        merge_opts: git_merge_options,
        checkout_opts: git_checkout_options
    )(using Zone): Ptr[git_revert_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).mainline = mainline
      (!____ptr).merge_opts = merge_opts
      (!____ptr).checkout_opts = checkout_opts
      ____ptr
    end apply
    extension (struct: git_revert_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def mainline: CUnsignedInt = struct._2
      def mainline_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def merge_opts: git_merge_options = struct._3
      def merge_opts_=(value: git_merge_options): Unit = !struct.at3 = value
      def checkout_opts: git_checkout_options = struct._4
      def checkout_opts_=(value: git_checkout_options): Unit = !struct.at4 =
        value
    end extension
  end git_revert_options

  /** Git Revision Spec: output of a `git_revparse` operation
    */
  opaque type git_revspec =
    CStruct3[Ptr[git_object], Ptr[git_object], CUnsignedInt]
  object git_revspec:
    given _tag: Tag[git_revspec] =
      Tag.materializeCStruct3Tag[Ptr[git_object], Ptr[git_object], CUnsignedInt]
    def apply()(using Zone): Ptr[git_revspec] =
      scala.scalanative.unsafe.alloc[git_revspec](1)
    def apply(from: Ptr[git_object], to: Ptr[git_object], flags: CUnsignedInt)(
        using Zone
    ): Ptr[git_revspec] =
      val ____ptr = apply()
      (!____ptr).from = from
      (!____ptr).to = to
      (!____ptr).flags = flags
      ____ptr
    extension (struct: git_revspec)
      def from: Ptr[git_object] = struct._1
      def from_=(value: Ptr[git_object]): Unit = !struct.at1 = value
      def to: Ptr[git_object] = struct._2
      def to_=(value: Ptr[git_object]): Unit = !struct.at2 = value
      def flags: CUnsignedInt = struct._3
      def flags_=(value: CUnsignedInt): Unit = !struct.at3 = value
  end git_revspec

  /** */
  opaque type git_revwalk = CStruct0
  object git_revwalk:
    given _tag: Tag[git_revwalk] = Tag.materializeCStruct0Tag

  /** An action signature (e.g. for committers, taggers, etc)
    */
  opaque type git_signature = CStruct3[CString, CString, git_time]
  object git_signature:
    given _tag: Tag[git_signature] =
      Tag.materializeCStruct3Tag[CString, CString, git_time]
    def apply()(using Zone): Ptr[git_signature] =
      scala.scalanative.unsafe.alloc[git_signature](1)
    def apply(name: CString, email: CString, when: git_time)(using
        Zone
    ): Ptr[git_signature] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).email = email
      (!____ptr).when = when
      ____ptr
    extension (struct: git_signature)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def email: CString = struct._2
      def email_=(value: CString): Unit = !struct.at2 = value
      def when: git_time = struct._3
      def when_=(value: git_time): Unit = !struct.at3 = value
  end git_signature

  /** Stash application options structure
    */
  opaque type git_stash_apply_options = CStruct5[
    CUnsignedInt,
    uint32_t,
    git_checkout_options,
    git_stash_apply_progress_cb,
    Ptr[Byte]
  ]
  object git_stash_apply_options:
    given _tag: Tag[git_stash_apply_options] = Tag.materializeCStruct5Tag[
      CUnsignedInt,
      uint32_t,
      git_checkout_options,
      git_stash_apply_progress_cb,
      Ptr[Byte]
    ]
    def apply()(using Zone): Ptr[git_stash_apply_options] =
      scala.scalanative.unsafe.alloc[git_stash_apply_options](1)
    def apply(
        version: CUnsignedInt,
        flags: uint32_t,
        checkout_options: git_checkout_options,
        progress_cb: git_stash_apply_progress_cb,
        progress_payload: Ptr[Byte]
    )(using Zone): Ptr[git_stash_apply_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).checkout_options = checkout_options
      (!____ptr).progress_cb = progress_cb
      (!____ptr).progress_payload = progress_payload
      ____ptr
    end apply
    extension (struct: git_stash_apply_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def checkout_options: git_checkout_options = struct._3
      def checkout_options_=(value: git_checkout_options): Unit = !struct.at3 =
        value
      def progress_cb: git_stash_apply_progress_cb = struct._4
      def progress_cb_=(value: git_stash_apply_progress_cb): Unit =
        !struct.at4 = value
      def progress_payload: Ptr[Byte] = struct._5
      def progress_payload_=(value: Ptr[Byte]): Unit = !struct.at5 = value
    end extension
  end git_stash_apply_options

  /** Stash save options structure
    */
  opaque type git_stash_save_options =
    CStruct5[CUnsignedInt, uint32_t, Ptr[git_signature], CString, git_strarray]
  object git_stash_save_options:
    given _tag: Tag[git_stash_save_options] =
      Tag.materializeCStruct5Tag[CUnsignedInt, uint32_t, Ptr[
        git_signature
      ], CString, git_strarray]
    def apply()(using Zone): Ptr[git_stash_save_options] =
      scala.scalanative.unsafe.alloc[git_stash_save_options](1)
    def apply(
        version: CUnsignedInt,
        flags: uint32_t,
        stasher: Ptr[git_signature],
        message: CString,
        paths: git_strarray
    )(using Zone): Ptr[git_stash_save_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      (!____ptr).stasher = stasher
      (!____ptr).message = message
      (!____ptr).paths = paths
      ____ptr
    end apply
    extension (struct: git_stash_save_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
      def stasher: Ptr[git_signature] = struct._3
      def stasher_=(value: Ptr[git_signature]): Unit = !struct.at3 = value
      def message: CString = struct._4
      def message_=(value: CString): Unit = !struct.at4 = value
      def paths: git_strarray = struct._5
      def paths_=(value: git_strarray): Unit = !struct.at5 = value
    end extension
  end git_stash_save_options

  /** A status entry, providing the differences between the file as it exists in
    * HEAD and the index, and providing the differences between the index and
    * the working directory.
    */
  opaque type git_status_entry =
    CStruct3[git_status_t, Ptr[git_diff_delta], Ptr[git_diff_delta]]
  object git_status_entry:
    given _tag: Tag[git_status_entry] =
      Tag.materializeCStruct3Tag[git_status_t, Ptr[git_diff_delta], Ptr[
        git_diff_delta
      ]]
    def apply()(using Zone): Ptr[git_status_entry] =
      scala.scalanative.unsafe.alloc[git_status_entry](1)
    def apply(
        status: git_status_t,
        head_to_index: Ptr[git_diff_delta],
        index_to_workdir: Ptr[git_diff_delta]
    )(using Zone): Ptr[git_status_entry] =
      val ____ptr = apply()
      (!____ptr).status = status
      (!____ptr).head_to_index = head_to_index
      (!____ptr).index_to_workdir = index_to_workdir
      ____ptr
    end apply
    extension (struct: git_status_entry)
      def status: git_status_t = struct._1
      def status_=(value: git_status_t): Unit = !struct.at1 = value
      def head_to_index: Ptr[git_diff_delta] = struct._2
      def head_to_index_=(value: Ptr[git_diff_delta]): Unit = !struct.at2 =
        value
      def index_to_workdir: Ptr[git_diff_delta] = struct._3
      def index_to_workdir_=(value: Ptr[git_diff_delta]): Unit = !struct.at3 =
        value
  end git_status_entry

  /** */
  opaque type git_status_list = CStruct0
  object git_status_list:
    given _tag: Tag[git_status_list] = Tag.materializeCStruct0Tag

  /** Options to control how `git_status_foreach_ext()` will issue callbacks.
    */
  opaque type git_status_options =
    CStruct6[CUnsignedInt, git_status_show_t, CUnsignedInt, git_strarray, Ptr[
      git_tree
    ], uint16_t]
  object git_status_options:
    given _tag: Tag[git_status_options] = Tag.materializeCStruct6Tag[
      CUnsignedInt,
      git_status_show_t,
      CUnsignedInt,
      git_strarray,
      Ptr[git_tree],
      uint16_t
    ]
    def apply()(using Zone): Ptr[git_status_options] =
      scala.scalanative.unsafe.alloc[git_status_options](1)
    def apply(
        version: CUnsignedInt,
        show: git_status_show_t,
        flags: CUnsignedInt,
        pathspec: git_strarray,
        baseline: Ptr[git_tree],
        rename_threshold: uint16_t
    )(using Zone): Ptr[git_status_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).show = show
      (!____ptr).flags = flags
      (!____ptr).pathspec = pathspec
      (!____ptr).baseline = baseline
      (!____ptr).rename_threshold = rename_threshold
      ____ptr
    end apply
    extension (struct: git_status_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def show: git_status_show_t = struct._2
      def show_=(value: git_status_show_t): Unit = !struct.at2 = value
      def flags: CUnsignedInt = struct._3
      def flags_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def pathspec: git_strarray = struct._4
      def pathspec_=(value: git_strarray): Unit = !struct.at4 = value
      def baseline: Ptr[git_tree] = struct._5
      def baseline_=(value: Ptr[git_tree]): Unit = !struct.at5 = value
      def rename_threshold: uint16_t = struct._6
      def rename_threshold_=(value: uint16_t): Unit = !struct.at6 = value
    end extension
  end git_status_options

  /** Array of strings
    */
  opaque type git_strarray = CStruct2[Ptr[CString], size_t]
  object git_strarray:
    given _tag: Tag[git_strarray] =
      Tag.materializeCStruct2Tag[Ptr[CString], size_t]
    def apply()(using Zone): Ptr[git_strarray] =
      scala.scalanative.unsafe.alloc[git_strarray](1)
    def apply(strings: Ptr[CString], count: size_t)(using
        Zone
    ): Ptr[git_strarray] =
      val ____ptr = apply()
      (!____ptr).strings = strings
      (!____ptr).count = count
      ____ptr
    extension (struct: git_strarray)
      def strings: Ptr[CString] = struct._1
      def strings_=(value: Ptr[CString]): Unit = !struct.at1 = value
      def count: size_t = struct._2
      def count_=(value: size_t): Unit = !struct.at2 = value
  end git_strarray

  /** */
  opaque type git_submodule = CStruct0
  object git_submodule:
    given _tag: Tag[git_submodule] = Tag.materializeCStruct0Tag

  /** Submodule update options structure
    */
  opaque type git_submodule_update_options =
    CStruct4[CUnsignedInt, git_checkout_options, git_fetch_options, CInt]
  object git_submodule_update_options:
    given _tag: Tag[git_submodule_update_options] = Tag.materializeCStruct4Tag[
      CUnsignedInt,
      git_checkout_options,
      git_fetch_options,
      CInt
    ]
    def apply()(using Zone): Ptr[git_submodule_update_options] =
      scala.scalanative.unsafe.alloc[git_submodule_update_options](1)
    def apply(
        version: CUnsignedInt,
        checkout_opts: git_checkout_options,
        fetch_opts: git_fetch_options,
        allow_fetch: CInt
    )(using Zone): Ptr[git_submodule_update_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).checkout_opts = checkout_opts
      (!____ptr).fetch_opts = fetch_opts
      (!____ptr).allow_fetch = allow_fetch
      ____ptr
    end apply
    extension (struct: git_submodule_update_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def checkout_opts: git_checkout_options = struct._2
      def checkout_opts_=(value: git_checkout_options): Unit = !struct.at2 =
        value
      def fetch_opts: git_fetch_options = struct._3
      def fetch_opts_=(value: git_fetch_options): Unit = !struct.at3 = value
      def allow_fetch: CInt = struct._4
      def allow_fetch_=(value: CInt): Unit = !struct.at4 = value
    end extension
  end git_submodule_update_options

  /** */
  opaque type git_tag = CStruct0
  object git_tag:
    given _tag: Tag[git_tag] = Tag.materializeCStruct0Tag

  /** Time in a signature
    */
  opaque type git_time = CStruct3[git_time_t, CInt, CChar]
  object git_time:
    given _tag: Tag[git_time] =
      Tag.materializeCStruct3Tag[git_time_t, CInt, CChar]
    def apply()(using Zone): Ptr[git_time] =
      scala.scalanative.unsafe.alloc[git_time](1)
    def apply(time: git_time_t, offset: CInt, sign: CChar)(using
        Zone
    ): Ptr[git_time] =
      val ____ptr = apply()
      (!____ptr).time = time
      (!____ptr).offset = offset
      (!____ptr).sign = sign
      ____ptr
    extension (struct: git_time)
      def time: git_time_t = struct._1
      def time_=(value: git_time_t): Unit = !struct.at1 = value
      def offset: CInt = struct._2
      def offset_=(value: CInt): Unit = !struct.at2 = value
      def sign: CChar = struct._3
      def sign_=(value: CChar): Unit = !struct.at3 = value
  end git_time

  /** */
  opaque type git_transaction = CStruct0
  object git_transaction:
    given _tag: Tag[git_transaction] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_transport = CStruct0
  object git_transport:
    given _tag: Tag[git_transport] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_tree = CStruct0
  object git_tree:
    given _tag: Tag[git_tree] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_tree_entry = CStruct0
  object git_tree_entry:
    given _tag: Tag[git_tree_entry] = Tag.materializeCStruct0Tag

  /** An action to perform during the update of a tree
    */
  opaque type git_tree_update =
    CStruct4[git_tree_update_t, git_oid, git_filemode_t, CString]
  object git_tree_update:
    given _tag: Tag[git_tree_update] = Tag.materializeCStruct4Tag[
      git_tree_update_t,
      git_oid,
      git_filemode_t,
      CString
    ]
    def apply()(using Zone): Ptr[git_tree_update] =
      scala.scalanative.unsafe.alloc[git_tree_update](1)
    def apply(
        action: git_tree_update_t,
        id: git_oid,
        filemode: git_filemode_t,
        path: CString
    )(using Zone): Ptr[git_tree_update] =
      val ____ptr = apply()
      (!____ptr).action = action
      (!____ptr).id = id
      (!____ptr).filemode = filemode
      (!____ptr).path = path
      ____ptr
    end apply
    extension (struct: git_tree_update)
      def action: git_tree_update_t = struct._1
      def action_=(value: git_tree_update_t): Unit = !struct.at1 = value
      def id: git_oid = struct._2
      def id_=(value: git_oid): Unit = !struct.at2 = value
      def filemode: git_filemode_t = struct._3
      def filemode_=(value: git_filemode_t): Unit = !struct.at3 = value
      def path: CString = struct._4
      def path_=(value: CString): Unit = !struct.at4 = value
  end git_tree_update

  /** */
  opaque type git_treebuilder = CStruct0
  object git_treebuilder:
    given _tag: Tag[git_treebuilder] = Tag.materializeCStruct0Tag

  /** */
  opaque type git_worktree = CStruct0
  object git_worktree:
    given _tag: Tag[git_worktree] = Tag.materializeCStruct0Tag

  /** Worktree add options structure
    */
  opaque type git_worktree_add_options =
    CStruct4[CUnsignedInt, CInt, Ptr[git_reference], git_checkout_options]
  object git_worktree_add_options:
    given _tag: Tag[git_worktree_add_options] =
      Tag.materializeCStruct4Tag[CUnsignedInt, CInt, Ptr[
        git_reference
      ], git_checkout_options]
    def apply()(using Zone): Ptr[git_worktree_add_options] =
      scala.scalanative.unsafe.alloc[git_worktree_add_options](1)
    def apply(
        version: CUnsignedInt,
        lock: CInt,
        ref: Ptr[git_reference],
        checkout_options: git_checkout_options
    )(using Zone): Ptr[git_worktree_add_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).lock = lock
      (!____ptr).ref = ref
      (!____ptr).checkout_options = checkout_options
      ____ptr
    end apply
    extension (struct: git_worktree_add_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def lock: CInt = struct._2
      def lock_=(value: CInt): Unit = !struct.at2 = value
      def ref: Ptr[git_reference] = struct._3
      def ref_=(value: Ptr[git_reference]): Unit = !struct.at3 = value
      def checkout_options: git_checkout_options = struct._4
      def checkout_options_=(value: git_checkout_options): Unit = !struct.at4 =
        value
    end extension
  end git_worktree_add_options

  /** Worktree prune options structure
    */
  opaque type git_worktree_prune_options = CStruct2[CUnsignedInt, uint32_t]
  object git_worktree_prune_options:
    given _tag: Tag[git_worktree_prune_options] =
      Tag.materializeCStruct2Tag[CUnsignedInt, uint32_t]
    def apply()(using Zone): Ptr[git_worktree_prune_options] =
      scala.scalanative.unsafe.alloc[git_worktree_prune_options](1)
    def apply(version: CUnsignedInt, flags: uint32_t)(using
        Zone
    ): Ptr[git_worktree_prune_options] =
      val ____ptr = apply()
      (!____ptr).version = version
      (!____ptr).flags = flags
      ____ptr
    extension (struct: git_worktree_prune_options)
      def version: CUnsignedInt = struct._1
      def version_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def flags: uint32_t = struct._2
      def flags_=(value: uint32_t): Unit = !struct.at2 = value
  end git_worktree_prune_options

  /** A type to write in a streaming fashion, for example, for filters.
    */
  opaque type git_writestream =
    CStruct3[CFuncPtr3[Ptr[Byte], CString, size_t, CInt], CFuncPtr1[Ptr[
      Byte
    ], CInt], CFuncPtr1[Ptr[Byte], Unit]]
  object git_writestream:
    given _tag: Tag[git_writestream] = Tag.materializeCStruct3Tag[CFuncPtr3[
      Ptr[Byte],
      CString,
      size_t,
      CInt
    ], CFuncPtr1[Ptr[Byte], CInt], CFuncPtr1[Ptr[Byte], Unit]]
    def apply()(using Zone): Ptr[git_writestream] =
      scala.scalanative.unsafe.alloc[git_writestream](1)
    def apply(
        write: CFuncPtr3[Ptr[git_writestream], CString, size_t, CInt],
        close: CFuncPtr1[Ptr[git_writestream], CInt],
        free: CFuncPtr1[Ptr[git_writestream], Unit]
    )(using Zone): Ptr[git_writestream] =
      val ____ptr = apply()
      (!____ptr).write = write
      (!____ptr).close = close
      (!____ptr).free = free
      ____ptr
    end apply
    extension (struct: git_writestream)
      def write: CFuncPtr3[Ptr[git_writestream], CString, size_t, CInt] =
        struct._1
          .asInstanceOf[CFuncPtr3[Ptr[git_writestream], CString, size_t, CInt]]
      def write_=(
          value: CFuncPtr3[Ptr[git_writestream], CString, size_t, CInt]
      ): Unit = !struct.at1 =
        value.asInstanceOf[CFuncPtr3[Ptr[Byte], CString, size_t, CInt]]
      def close: CFuncPtr1[Ptr[git_writestream], CInt] =
        struct._2.asInstanceOf[CFuncPtr1[Ptr[git_writestream], CInt]]
      def close_=(value: CFuncPtr1[Ptr[git_writestream], CInt]): Unit =
        !struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], CInt]]
      def free: CFuncPtr1[Ptr[git_writestream], Unit] =
        struct._3.asInstanceOf[CFuncPtr1[Ptr[git_writestream], Unit]]
      def free_=(value: CFuncPtr1[Ptr[git_writestream], Unit]): Unit =
        !struct.at3 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
    end extension
  end git_writestream
end structs

@link("git2")
@extern
private[libgit] object extern_functions:
  import _root_.libgit.enumerations.*
  import _root_.libgit.predef.*
  import _root_.libgit.aliases.*
  import _root_.libgit.structs.*

  /** Frees a `git_annotated_commit`.
    */
  def git_annotated_commit_free(commit: Ptr[git_annotated_commit]): Unit =
    extern

  /** Creates a `git_annotated_commit` from the given fetch head data. The
    * resulting git_annotated_commit must be freed with
    * `git_annotated_commit_free`.
    */
  def git_annotated_commit_from_fetchhead(
      out: Ptr[Ptr[git_annotated_commit]],
      repo: Ptr[git_repository],
      branch_name: CString,
      remote_url: CString,
      id: Ptr[git_oid]
  ): CInt = extern

  /** Creates a `git_annotated_commit` from the given reference. The resulting
    * git_annotated_commit must be freed with `git_annotated_commit_free`.
    */
  def git_annotated_commit_from_ref(
      out: Ptr[Ptr[git_annotated_commit]],
      repo: Ptr[git_repository],
      ref: Ptr[git_reference]
  ): CInt = extern

  /** Creates a `git_annotated_commit` from a revision string.
    */
  def git_annotated_commit_from_revspec(
      out: Ptr[Ptr[git_annotated_commit]],
      repo: Ptr[git_repository],
      revspec: CString
  ): CInt = extern

  /** Gets the commit ID that the given `git_annotated_commit` refers to.
    */
  def git_annotated_commit_id(commit: Ptr[git_annotated_commit]): Ptr[git_oid] =
    extern

  /** Creates a `git_annotated_commit` from the given commit id. The resulting
    * git_annotated_commit must be freed with `git_annotated_commit_free`.
    */
  def git_annotated_commit_lookup(
      out: Ptr[Ptr[git_annotated_commit]],
      repo: Ptr[git_repository],
      id: Ptr[git_oid]
  ): CInt = extern

  /** Get the refname that the given `git_annotated_commit` refers to.
    */
  def git_annotated_commit_ref(commit: Ptr[git_annotated_commit]): CString =
    extern

  /** Apply a `git_diff` to the given repository, making changes directly in the
    * working directory, the index, or both.
    */
  def git_apply(
      repo: Ptr[git_repository],
      diff: Ptr[git_diff],
      location: git_apply_location_t,
      options: Ptr[git_apply_options]
  ): CInt = extern

  /** Initialize git_apply_options structure
    */
  def git_apply_options_init(
      opts: Ptr[git_apply_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Apply a `git_diff` to a `git_tree`, and return the resulting image as an
    * index.
    */
  def git_apply_to_tree(
      out: Ptr[Ptr[git_index]],
      repo: Ptr[git_repository],
      preimage: Ptr[git_tree],
      diff: Ptr[git_diff],
      options: Ptr[git_apply_options]
  ): CInt = extern

  /** Add a macro definition.
    */
  def git_attr_add_macro(
      repo: Ptr[git_repository],
      name: CString,
      values: CString
  ): CInt = extern

  /** Flush the gitattributes cache.
    */
  def git_attr_cache_flush(repo: Ptr[git_repository]): CInt = extern

  /** Loop over all the git attributes for a path.
    */
  def git_attr_foreach(
      repo: Ptr[git_repository],
      flags: uint32_t,
      path: CString,
      callback: git_attr_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Loop over all the git attributes for a path with extended options.
    */
  def git_attr_foreach_ext(
      repo: Ptr[git_repository],
      opts: Ptr[git_attr_options],
      path: CString,
      callback: git_attr_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Look up the value of one git attribute for path.
    */
  def git_attr_get(
      value_out: Ptr[CString],
      repo: Ptr[git_repository],
      flags: uint32_t,
      path: CString,
      name: CString
  ): CInt = extern

  /** Look up the value of one git attribute for path with extended options.
    */
  def git_attr_get_ext(
      value_out: Ptr[CString],
      repo: Ptr[git_repository],
      opts: Ptr[git_attr_options],
      path: CString,
      name: CString
  ): CInt = extern

  /** Look up a list of git attributes for path.
    */
  def git_attr_get_many(
      values_out: Ptr[CString],
      repo: Ptr[git_repository],
      flags: uint32_t,
      path: CString,
      num_attr: size_t,
      names: Ptr[CString]
  ): CInt = extern

  /** Look up a list of git attributes for path with extended options.
    */
  def git_attr_get_many_ext(
      values_out: Ptr[CString],
      repo: Ptr[git_repository],
      opts: Ptr[git_attr_options],
      path: CString,
      num_attr: size_t,
      names: Ptr[CString]
  ): CInt = extern

  /** Return the value type for a given attribute.
    */
  def git_attr_value(attr: CString): git_attr_value_t = extern

  /** Get blame data for a file that has been modified in memory. The
    * `reference` parameter is a pre-calculated blame for the in-odb history of
    * the file. This means that once a file blame is completed (which can be
    * expensive), updating the buffer blame is very fast.
    */
  def git_blame_buffer(
      out: Ptr[Ptr[git_blame]],
      reference: Ptr[git_blame],
      buffer: CString,
      buffer_len: size_t
  ): CInt = extern

  /** Get the blame for a single file.
    */
  def git_blame_file(
      out: Ptr[Ptr[git_blame]],
      repo: Ptr[git_repository],
      path: CString,
      options: Ptr[git_blame_options]
  ): CInt = extern

  /** Free memory allocated by git_blame_file or git_blame_buffer.
    */
  def git_blame_free(blame: Ptr[git_blame]): Unit = extern

  /** Gets the blame hunk at the given index.
    */
  def git_blame_get_hunk_byindex(
      blame: Ptr[git_blame],
      index: uint32_t
  ): Ptr[git_blame_hunk] = extern

  /** Gets the hunk that relates to the given line number in the newest commit.
    */
  def git_blame_get_hunk_byline(
      blame: Ptr[git_blame],
      lineno: size_t
  ): Ptr[git_blame_hunk] = extern

  /** Gets the number of hunks that exist in the blame structure.
    */
  def git_blame_get_hunk_count(blame: Ptr[git_blame]): uint32_t = extern

  /** These functions are retained for backward compatibility. The newer
    * versions of these functions should be preferred in all new code.
    */
  def git_blame_init_options(
      opts: Ptr[git_blame_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_blame_options structure
    */
  def git_blame_options_init(
      opts: Ptr[git_blame_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Write an in-memory buffer to the ODB as a blob
    */
  def git_blob_create_from_buffer(
      id: Ptr[git_oid],
      repo: Ptr[git_repository],
      buffer: Ptr[Byte],
      len: size_t
  ): CInt = extern

  /** Read a file from the filesystem and write its content to the Object
    * Database as a loose blob
    */
  def git_blob_create_from_disk(
      id: Ptr[git_oid],
      repo: Ptr[git_repository],
      path: CString
  ): CInt = extern

  /** Create a stream to write a new blob into the object db
    */
  def git_blob_create_from_stream(
      out: Ptr[Ptr[git_writestream]],
      repo: Ptr[git_repository],
      hintpath: CString
  ): CInt = extern

  /** Close the stream and write the blob to the object db
    */
  def git_blob_create_from_stream_commit(
      out: Ptr[git_oid],
      stream: Ptr[git_writestream]
  ): CInt = extern

  /** Read a file from the working folder of a repository and write it to the
    * Object Database as a loose blob
    */
  def git_blob_create_from_workdir(
      id: Ptr[git_oid],
      repo: Ptr[git_repository],
      relative_path: CString
  ): CInt = extern

  /** */
  def git_blob_create_frombuffer(
      id: Ptr[git_oid],
      repo: Ptr[git_repository],
      buffer: Ptr[Byte],
      len: size_t
  ): CInt = extern

  /** */
  def git_blob_create_fromdisk(
      id: Ptr[git_oid],
      repo: Ptr[git_repository],
      path: CString
  ): CInt = extern

  /** */
  def git_blob_create_fromstream(
      out: Ptr[Ptr[git_writestream]],
      repo: Ptr[git_repository],
      hintpath: CString
  ): CInt = extern

  /** */
  def git_blob_create_fromstream_commit(
      out: Ptr[git_oid],
      stream: Ptr[git_writestream]
  ): CInt = extern

  /** */
  def git_blob_create_fromworkdir(
      id: Ptr[git_oid],
      repo: Ptr[git_repository],
      relative_path: CString
  ): CInt = extern

  /** Determine if the given content is most certainly binary or not; this is
    * the same mechanism used by `git_blob_is_binary` but only looking at raw
    * data.
    */
  def git_blob_data_is_binary(data: CString, len: size_t): CInt = extern

  /** Create an in-memory copy of a blob. The copy must be explicitly free'd or
    * it will leak.
    */
  def git_blob_dup(out: Ptr[Ptr[git_blob]], source: Ptr[git_blob]): CInt =
    extern

  /** Get a buffer with the filtered content of a blob.
    */
  def git_blob_filter(
      out: Ptr[git_buf],
      blob: Ptr[git_blob],
      as_path: CString,
      opts: Ptr[git_blob_filter_options]
  ): CInt = extern

  /** Initialize git_blob_filter_options structure
    */
  def git_blob_filter_options_init(
      opts: Ptr[git_blob_filter_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Deprecated in favor of `git_blob_filter`.
    */
  def git_blob_filtered_content(
      out: Ptr[git_buf],
      blob: Ptr[git_blob],
      as_path: CString,
      check_for_binary_data: CInt
  ): CInt = extern

  /** Close an open blob
    */
  def git_blob_free(blob: Ptr[git_blob]): Unit = extern

  /** Get the id of a blob.
    */
  def git_blob_id(blob: Ptr[git_blob]): Ptr[git_oid] = extern

  /** Determine if the blob content is most certainly binary or not.
    */
  def git_blob_is_binary(blob: Ptr[git_blob]): CInt = extern

  /** Lookup a blob object from a repository.
    */
  def git_blob_lookup(
      blob: Ptr[Ptr[git_blob]],
      repo: Ptr[git_repository],
      id: Ptr[git_oid]
  ): CInt = extern

  /** Lookup a blob object from a repository, given a prefix of its identifier
    * (short id).
    */
  def git_blob_lookup_prefix(
      blob: Ptr[Ptr[git_blob]],
      repo: Ptr[git_repository],
      id: Ptr[git_oid],
      len: size_t
  ): CInt = extern

  /** Get the repository that contains the blob.
    */
  def git_blob_owner(blob: Ptr[git_blob]): Ptr[git_repository] = extern

  /** Get a read-only buffer with the raw content of a blob.
    */
  def git_blob_rawcontent(blob: Ptr[git_blob]): Ptr[Byte] = extern

  /** Get the size in bytes of the contents of a blob
    */
  def git_blob_rawsize(blob: Ptr[git_blob]): git_object_size_t = extern

  /** Create a new branch pointing at a target commit
    */
  def git_branch_create(
      out: Ptr[Ptr[git_reference]],
      repo: Ptr[git_repository],
      branch_name: CString,
      target: Ptr[git_commit],
      force: CInt
  ): CInt = extern

  /** Create a new branch pointing at a target commit
    */
  def git_branch_create_from_annotated(
      ref_out: Ptr[Ptr[git_reference]],
      repository: Ptr[git_repository],
      branch_name: CString,
      commit: Ptr[git_annotated_commit],
      force: CInt
  ): CInt = extern

  /** Delete an existing branch reference.
    */
  def git_branch_delete(branch: Ptr[git_reference]): CInt = extern

  /** Determine if any HEAD points to the current branch
    */
  def git_branch_is_checked_out(branch: Ptr[git_reference]): CInt = extern

  /** Determine if HEAD points to the given branch
    */
  def git_branch_is_head(branch: Ptr[git_reference]): CInt = extern

  /** Free a branch iterator
    */
  def git_branch_iterator_free(iter: Ptr[git_branch_iterator]): Unit = extern

  /** Create an iterator which loops over the requested branches.
    */
  def git_branch_iterator_new(
      out: Ptr[Ptr[git_branch_iterator]],
      repo: Ptr[git_repository],
      list_flags: git_branch_t
  ): CInt = extern

  /** Lookup a branch by its name in a repository.
    */
  def git_branch_lookup(
      out: Ptr[Ptr[git_reference]],
      repo: Ptr[git_repository],
      branch_name: CString,
      branch_type: git_branch_t
  ): CInt = extern

  /** Move/rename an existing local branch reference.
    */
  def git_branch_move(
      out: Ptr[Ptr[git_reference]],
      branch: Ptr[git_reference],
      new_branch_name: CString,
      force: CInt
  ): CInt = extern

  /** Get the branch name
    */
  def git_branch_name(out: Ptr[CString], ref: Ptr[git_reference]): CInt = extern

  /** Determine whether a branch name is valid, meaning that (when prefixed with
    * `refs/heads/`) that it is a valid reference name, and that any additional
    * branch name restrictions are imposed (eg, it cannot start with a `-`).
    */
  def git_branch_name_is_valid(valid: Ptr[CInt], name: CString): CInt = extern

  /** Retrieve the next branch from the iterator
    */
  def git_branch_next(
      out: Ptr[Ptr[git_reference]],
      out_type: Ptr[git_branch_t],
      iter: Ptr[git_branch_iterator]
  ): CInt = extern

  /** Find the remote name of a remote-tracking branch
    */
  def git_branch_remote_name(
      out: Ptr[git_buf],
      repo: Ptr[git_repository],
      refname: CString
  ): CInt = extern

  /** Set a branch's upstream branch
    */
  def git_branch_set_upstream(
      branch: Ptr[git_reference],
      branch_name: CString
  ): CInt = extern

  /** Get the upstream of a branch
    */
  def git_branch_upstream(
      out: Ptr[Ptr[git_reference]],
      branch: Ptr[git_reference]
  ): CInt = extern

  /** Retrieve the upstream merge of a local branch
    */
  def git_branch_upstream_merge(
      buf: Ptr[git_buf],
      repo: Ptr[git_repository],
      refname: CString
  ): CInt = extern

  /** Get the upstream name of a branch
    */
  def git_branch_upstream_name(
      out: Ptr[git_buf],
      repo: Ptr[git_repository],
      refname: CString
  ): CInt = extern

  /** Retrieve the upstream remote of a local branch
    */
  def git_branch_upstream_remote(
      buf: Ptr[git_buf],
      repo: Ptr[git_repository],
      refname: CString
  ): CInt = extern

  /** Check quickly if buffer contains a NUL byte
    */
  def git_buf_contains_nul(buf: Ptr[git_buf]): CInt = extern

  /** Free the memory referred to by the git_buf.
    */
  def git_buf_dispose(buffer: Ptr[git_buf]): Unit = extern

  /** Free the memory referred to by the git_buf. This is an alias of
    * `git_buf_dispose` and is preserved for backward compatibility.
    */
  def git_buf_free(buffer: Ptr[git_buf]): Unit = extern

  /** Resize the buffer allocation to make more space.
    */
  def git_buf_grow(buffer: Ptr[git_buf], target_size: size_t): CInt = extern

  /** Check quickly if buffer looks like it contains binary data
    */
  def git_buf_is_binary(buf: Ptr[git_buf]): CInt = extern

  /** Set buffer to a copy of some raw data.
    */
  def git_buf_set(
      buffer: Ptr[git_buf],
      data: Ptr[Byte],
      datalen: size_t
  ): CInt = extern

  /** Updates files in the index and the working tree to match the content of
    * the commit pointed at by HEAD.
    */
  def git_checkout_head(
      repo: Ptr[git_repository],
      opts: Ptr[git_checkout_options]
  ): CInt = extern

  /** Updates files in the working tree to match the content of the index.
    */
  def git_checkout_index(
      repo: Ptr[git_repository],
      index: Ptr[git_index],
      opts: Ptr[git_checkout_options]
  ): CInt = extern

  /** */
  def git_checkout_init_options(
      opts: Ptr[git_checkout_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_checkout_options structure
    */
  def git_checkout_options_init(
      opts: Ptr[git_checkout_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Updates files in the index and working tree to match the content of the
    * tree pointed at by the treeish.
    */
  def git_checkout_tree(
      repo: Ptr[git_repository],
      treeish: Ptr[git_object],
      opts: Ptr[git_checkout_options]
  ): CInt = extern

  /** Cherry-pick the given commit, producing changes in the index and working
    * directory.
    */
  def git_cherrypick(
      repo: Ptr[git_repository],
      commit: Ptr[git_commit],
      cherrypick_options: Ptr[git_cherrypick_options]
  ): CInt = extern

  /** Cherry-picks the given commit against the given "our" commit, producing an
    * index that reflects the result of the cherry-pick.
    */
  def git_cherrypick_commit(
      out: Ptr[Ptr[git_index]],
      repo: Ptr[git_repository],
      cherrypick_commit: Ptr[git_commit],
      our_commit: Ptr[git_commit],
      mainline: CUnsignedInt,
      merge_options: Ptr[git_merge_options]
  ): CInt = extern

  /** */
  def git_cherrypick_init_options(
      opts: Ptr[git_cherrypick_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_cherrypick_options structure
    */
  def git_cherrypick_options_init(
      opts: Ptr[git_cherrypick_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Clone a remote repository.
    */
  def git_clone(
      out: Ptr[Ptr[git_repository]],
      url: CString,
      local_path: CString,
      options: Ptr[git_clone_options]
  ): CInt = extern

  /** */
  def git_clone_init_options(
      opts: Ptr[git_clone_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_clone_options structure
    */
  def git_clone_options_init(
      opts: Ptr[git_clone_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Amend an existing commit by replacing only non-NULL values.
    */
  def git_commit_amend(
      id: Ptr[git_oid],
      commit_to_amend: Ptr[git_commit],
      update_ref: CString,
      author: Ptr[git_signature],
      committer: Ptr[git_signature],
      message_encoding: CString,
      message: CString,
      tree: Ptr[git_tree]
  ): CInt = extern

  /** Get the author of a commit.
    */
  def git_commit_author(commit: Ptr[git_commit]): Ptr[git_signature] = extern

  /** Get the author of a commit, using the mailmap to map names and email
    * addresses to canonical real names and email addresses.
    */
  def git_commit_author_with_mailmap(
      out: Ptr[Ptr[git_signature]],
      commit: Ptr[git_commit],
      mailmap: Ptr[git_mailmap]
  ): CInt = extern

  /** Get the long "body" of the git commit message.
    */
  def git_commit_body(commit: Ptr[git_commit]): CString = extern

  /** Get the committer of a commit.
    */
  def git_commit_committer(commit: Ptr[git_commit]): Ptr[git_signature] = extern

  /** Get the committer of a commit, using the mailmap to map names and email
    * addresses to canonical real names and email addresses.
    */
  def git_commit_committer_with_mailmap(
      out: Ptr[Ptr[git_signature]],
      commit: Ptr[git_commit],
      mailmap: Ptr[git_mailmap]
  ): CInt = extern

  /** Create new commit in the repository from a list of `git_object` pointers
    */
  def git_commit_create(
      id: Ptr[git_oid],
      repo: Ptr[git_repository],
      update_ref: CString,
      author: Ptr[git_signature],
      committer: Ptr[git_signature],
      message_encoding: CString,
      message: CString,
      tree: Ptr[git_tree],
      parent_count: size_t,
      parents: Ptr[Ptr[git_commit]]
  ): CInt = extern

  /** Create a commit and write it into a buffer
    */
  def git_commit_create_buffer(
      out: Ptr[git_buf],
      repo: Ptr[git_repository],
      author: Ptr[git_signature],
      committer: Ptr[git_signature],
      message_encoding: CString,
      message: CString,
      tree: Ptr[git_tree],
      parent_count: size_t,
      parents: Ptr[Ptr[git_commit]]
  ): CInt = extern

  /** Create new commit in the repository using a variable argument list.
    */
  def git_commit_create_v(
      id: Ptr[git_oid],
      repo: Ptr[git_repository],
      update_ref: CString,
      author: Ptr[git_signature],
      committer: Ptr[git_signature],
      message_encoding: CString,
      message: CString,
      tree: Ptr[git_tree],
      parent_count: size_t,
      rest: Any*
  ): CInt = extern

  /** Create a commit object from the given buffer and signature
    */
  def git_commit_create_with_signature(
      out: Ptr[git_oid],
      repo: Ptr[git_repository],
      commit_content: CString,
      signature: CString,
      signature_field: CString
  ): CInt = extern

  /** Create an in-memory copy of a commit. The copy must be explicitly free'd
    * or it will leak.
    */
  def git_commit_dup(out: Ptr[Ptr[git_commit]], source: Ptr[git_commit]): CInt =
    extern

  /** Extract the signature from a commit
    */
  def git_commit_extract_signature(
      signature: Ptr[git_buf],
      signed_data: Ptr[git_buf],
      repo: Ptr[git_repository],
      commit_id: Ptr[git_oid],
      field: CString
  ): CInt = extern

  /** Close an open commit
    */
  def git_commit_free(commit: Ptr[git_commit]): Unit = extern

  /** Get an arbitrary header field
    */
  def git_commit_header_field(
      out: Ptr[git_buf],
      commit: Ptr[git_commit],
      field: CString
  ): CInt = extern

  /** Get the id of a commit.
    */
  def git_commit_id(commit: Ptr[git_commit]): Ptr[git_oid] = extern

  /** Lookup a commit object from a repository.
    */
  def git_commit_lookup(
      commit: Ptr[Ptr[git_commit]],
      repo: Ptr[git_repository],
      id: Ptr[git_oid]
  ): CInt = extern

  /** Lookup a commit object from a repository, given a prefix of its identifier
    * (short id).
    */
  def git_commit_lookup_prefix(
      commit: Ptr[Ptr[git_commit]],
      repo: Ptr[git_repository],
      id: Ptr[git_oid],
      len: size_t
  ): CInt = extern

  /** Get the full message of a commit.
    */
  def git_commit_message(commit: Ptr[git_commit]): CString = extern

  /** Get the encoding for the message of a commit, as a string representing a
    * standard encoding name.
    */
  def git_commit_message_encoding(commit: Ptr[git_commit]): CString = extern

  /** Get the full raw message of a commit.
    */
  def git_commit_message_raw(commit: Ptr[git_commit]): CString = extern

  /** Get the commit object that is the <n>th generation ancestor of the named
    * commit object, following only the first parents. The returned commit has
    * to be freed by the caller.
    */
  def git_commit_nth_gen_ancestor(
      ancestor: Ptr[Ptr[git_commit]],
      commit: Ptr[git_commit],
      n: CUnsignedInt
  ): CInt = extern

  /** Get the repository that contains the commit.
    */
  def git_commit_owner(commit: Ptr[git_commit]): Ptr[git_repository] = extern

  /** Get the specified parent of the commit.
    */
  def git_commit_parent(
      out: Ptr[Ptr[git_commit]],
      commit: Ptr[git_commit],
      n: CUnsignedInt
  ): CInt = extern

  /** Get the oid of a specified parent for a commit. This is different from
    * `git_commit_parent`, which will attempt to load the parent commit from the
    * ODB.
    */
  def git_commit_parent_id(
      commit: Ptr[git_commit],
      n: CUnsignedInt
  ): Ptr[git_oid] = extern

  /** Get the number of parents of this commit
    */
  def git_commit_parentcount(commit: Ptr[git_commit]): CUnsignedInt = extern

  /** Get the full raw text of the commit header.
    */
  def git_commit_raw_header(commit: Ptr[git_commit]): CString = extern

  /** Get the short "summary" of the git commit message.
    */
  def git_commit_summary(commit: Ptr[git_commit]): CString = extern

  /** Get the commit time (i.e. committer time) of a commit.
    */
  def git_commit_time(commit: Ptr[git_commit]): git_time_t = extern

  /** Get the commit timezone offset (i.e. committer's preferred timezone) of a
    * commit.
    */
  def git_commit_time_offset(commit: Ptr[git_commit]): CInt = extern

  /** Get the tree pointed to by a commit.
    */
  def git_commit_tree(
      tree_out: Ptr[Ptr[git_tree]],
      commit: Ptr[git_commit]
  ): CInt = extern

  /** Get the id of the tree pointed to by a commit. This differs from
    * `git_commit_tree` in that no attempts are made to fetch an object from the
    * ODB.
    */
  def git_commit_tree_id(commit: Ptr[git_commit]): Ptr[git_oid] = extern

  /** Add an on-disk config file instance to an existing config
    */
  def git_config_add_file_ondisk(
      cfg: Ptr[git_config],
      path: CString,
      level: git_config_level_t,
      repo: Ptr[git_repository],
      force: CInt
  ): CInt = extern

  /** Perform an operation on each config variable in a given config backend,
    * matching a regular expression.
    */
  def git_config_backend_foreach_match(
      backend: Ptr[git_config_backend],
      regexp: CString,
      callback: git_config_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Delete a config variable from the config file with the highest level
    * (usually the local one).
    */
  def git_config_delete_entry(cfg: Ptr[git_config], name: CString): CInt =
    extern

  /** Deletes one or several entries from a multivar in the local config file.
    */
  def git_config_delete_multivar(
      cfg: Ptr[git_config],
      name: CString,
      regexp: CString
  ): CInt = extern

  /** Free a config entry
    */
  def git_config_entry_free(entry: Ptr[git_config_entry]): Unit = extern

  /** Locate the path to the global configuration file
    */
  def git_config_find_global(out: Ptr[git_buf]): CInt = extern

  /** Locate the path to the configuration file in ProgramData
    */
  def git_config_find_programdata(out: Ptr[git_buf]): CInt = extern

  /** Locate the path to the system configuration file
    */
  def git_config_find_system(out: Ptr[git_buf]): CInt = extern

  /** Locate the path to the global xdg compatible configuration file
    */
  def git_config_find_xdg(out: Ptr[git_buf]): CInt = extern

  /** Perform an operation on each config variable.
    */
  def git_config_foreach(
      cfg: Ptr[git_config],
      callback: git_config_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Perform an operation on each config variable matching a regular
    * expression.
    */
  def git_config_foreach_match(
      cfg: Ptr[git_config],
      regexp: CString,
      callback: git_config_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Free the configuration and its associated memory and files
    */
  def git_config_free(cfg: Ptr[git_config]): Unit = extern

  /** Get the value of a boolean config variable.
    */
  def git_config_get_bool(
      out: Ptr[CInt],
      cfg: Ptr[git_config],
      name: CString
  ): CInt = extern

  /** Get the git_config_entry of a config variable.
    */
  def git_config_get_entry(
      out: Ptr[Ptr[git_config_entry]],
      cfg: Ptr[git_config],
      name: CString
  ): CInt = extern

  /** Get the value of an integer config variable.
    */
  def git_config_get_int32(
      out: Ptr[int32_t],
      cfg: Ptr[git_config],
      name: CString
  ): CInt = extern

  /** Get the value of a long integer config variable.
    */
  def git_config_get_int64(
      out: Ptr[int64_t],
      cfg: Ptr[git_config],
      name: CString
  ): CInt = extern

  /** Query the value of a config variable and return it mapped to an integer
    * constant.
    */
  def git_config_get_mapped(
      out: Ptr[CInt],
      cfg: Ptr[git_config],
      name: CString,
      maps: Ptr[git_configmap],
      map_n: size_t
  ): CInt = extern

  /** Get each value of a multivar in a foreach callback
    */
  def git_config_get_multivar_foreach(
      cfg: Ptr[git_config],
      name: CString,
      regexp: CString,
      callback: git_config_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Get the value of a path config variable.
    */
  def git_config_get_path(
      out: Ptr[git_buf],
      cfg: Ptr[git_config],
      name: CString
  ): CInt = extern

  /** Get the value of a string config variable.
    */
  def git_config_get_string(
      out: Ptr[CString],
      cfg: Ptr[git_config],
      name: CString
  ): CInt = extern

  /** Get the value of a string config variable.
    */
  def git_config_get_string_buf(
      out: Ptr[git_buf],
      cfg: Ptr[git_config],
      name: CString
  ): CInt = extern

  /** Free a config iterator
    */
  def git_config_iterator_free(iter: Ptr[git_config_iterator]): Unit = extern

  /** Iterate over all the config variables whose name matches a pattern
    */
  def git_config_iterator_glob_new(
      out: Ptr[Ptr[git_config_iterator]],
      cfg: Ptr[git_config],
      regexp: CString
  ): CInt = extern

  /** Iterate over all the config variables
    */
  def git_config_iterator_new(
      out: Ptr[Ptr[git_config_iterator]],
      cfg: Ptr[git_config]
  ): CInt = extern

  /** Lock the backend with the highest priority
    */
  def git_config_lock(
      tx: Ptr[Ptr[git_transaction]],
      cfg: Ptr[git_config]
  ): CInt = extern

  /** Maps a string value to an integer constant
    */
  def git_config_lookup_map_value(
      out: Ptr[CInt],
      maps: Ptr[git_configmap],
      map_n: size_t,
      value: CString
  ): CInt = extern

  /** Get each value of a multivar
    */
  def git_config_multivar_iterator_new(
      out: Ptr[Ptr[git_config_iterator]],
      cfg: Ptr[git_config],
      name: CString,
      regexp: CString
  ): CInt = extern

  /** Allocate a new configuration object
    */
  def git_config_new(out: Ptr[Ptr[git_config]]): CInt = extern

  /** Return the current entry and advance the iterator
    */
  def git_config_next(
      entry: Ptr[Ptr[git_config_entry]],
      iter: Ptr[git_config_iterator]
  ): CInt = extern

  /** Open the global, XDG and system configuration files
    */
  def git_config_open_default(out: Ptr[Ptr[git_config]]): CInt = extern

  /** Open the global/XDG configuration file according to git's rules
    */
  def git_config_open_global(
      out: Ptr[Ptr[git_config]],
      config: Ptr[git_config]
  ): CInt = extern

  /** Build a single-level focused config object from a multi-level one.
    */
  def git_config_open_level(
      out: Ptr[Ptr[git_config]],
      parent: Ptr[git_config],
      level: git_config_level_t
  ): CInt = extern

  /** Create a new config instance containing a single on-disk file
    */
  def git_config_open_ondisk(out: Ptr[Ptr[git_config]], path: CString): CInt =
    extern

  /** Parse a string value as a bool.
    */
  def git_config_parse_bool(out: Ptr[CInt], value: CString): CInt = extern

  /** Parse a string value as an int32.
    */
  def git_config_parse_int32(out: Ptr[int32_t], value: CString): CInt = extern

  /** Parse a string value as an int64.
    */
  def git_config_parse_int64(out: Ptr[int64_t], value: CString): CInt = extern

  /** Parse a string value as a path.
    */
  def git_config_parse_path(out: Ptr[git_buf], value: CString): CInt = extern

  /** Set the value of a boolean config variable in the config file with the
    * highest level (usually the local one).
    */
  def git_config_set_bool(
      cfg: Ptr[git_config],
      name: CString,
      value: CInt
  ): CInt = extern

  /** Set the value of an integer config variable in the config file with the
    * highest level (usually the local one).
    */
  def git_config_set_int32(
      cfg: Ptr[git_config],
      name: CString,
      value: int32_t
  ): CInt = extern

  /** Set the value of a long integer config variable in the config file with
    * the highest level (usually the local one).
    */
  def git_config_set_int64(
      cfg: Ptr[git_config],
      name: CString,
      value: int64_t
  ): CInt = extern

  /** Set a multivar in the local config file.
    */
  def git_config_set_multivar(
      cfg: Ptr[git_config],
      name: CString,
      regexp: CString,
      value: CString
  ): CInt = extern

  /** Set the value of a string config variable in the config file with the
    * highest level (usually the local one).
    */
  def git_config_set_string(
      cfg: Ptr[git_config],
      name: CString,
      value: CString
  ): CInt = extern

  /** Create a snapshot of the configuration
    */
  def git_config_snapshot(
      out: Ptr[Ptr[git_config]],
      config: Ptr[git_config]
  ): CInt = extern

  /** */
  def git_cred_default_new(out: Ptr[Ptr[git_credential]]): CInt = extern

  /** */
  def git_cred_free(cred: Ptr[git_credential]): Unit = extern

  /** */
  def git_cred_get_username(cred: Ptr[git_credential]): CString = extern

  /** */
  def git_cred_has_username(cred: Ptr[git_credential]): CInt = extern

  /** */
  def git_cred_ssh_custom_new(
      out: Ptr[Ptr[git_credential]],
      username: CString,
      publickey: CString,
      publickey_len: size_t,
      sign_callback: git_credential_sign_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** */
  def git_cred_ssh_interactive_new(
      out: Ptr[Ptr[git_credential]],
      username: CString,
      prompt_callback: git_credential_ssh_interactive_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** */
  def git_cred_ssh_key_from_agent(
      out: Ptr[Ptr[git_credential]],
      username: CString
  ): CInt = extern

  /** */
  def git_cred_ssh_key_memory_new(
      out: Ptr[Ptr[git_credential]],
      username: CString,
      publickey: CString,
      privatekey: CString,
      passphrase: CString
  ): CInt = extern

  /** */
  def git_cred_ssh_key_new(
      out: Ptr[Ptr[git_credential]],
      username: CString,
      publickey: CString,
      privatekey: CString,
      passphrase: CString
  ): CInt = extern

  /** */
  def git_cred_username_new(
      out: Ptr[Ptr[git_credential]],
      username: CString
  ): CInt = extern

  /** */
  def git_cred_userpass(
      out: Ptr[Ptr[git_credential]],
      url: CString,
      user_from_url: CString,
      allowed_types: CUnsignedInt,
      payload: Ptr[Byte]
  ): CInt = extern

  /** */
  def git_cred_userpass_plaintext_new(
      out: Ptr[Ptr[git_credential]],
      username: CString,
      password: CString
  ): CInt = extern

  /** Create a "default" credential usable for Negotiate mechanisms like NTLM or
    * Kerberos authentication.
    */
  def git_credential_default_new(out: Ptr[Ptr[git_credential]]): CInt = extern

  /** Free a credential.
    */
  def git_credential_free(cred: Ptr[git_credential]): Unit = extern

  /** Return the username associated with a credential object.
    */
  def git_credential_get_username(cred: Ptr[git_credential]): CString = extern

  /** Check whether a credential object contains username information.
    */
  def git_credential_has_username(cred: Ptr[git_credential]): CInt = extern

  /** Create an ssh key credential with a custom signing function.
    */
  def git_credential_ssh_custom_new(
      out: Ptr[Ptr[git_credential]],
      username: CString,
      publickey: CString,
      publickey_len: size_t,
      sign_callback: git_credential_sign_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Create a new ssh keyboard-interactive based credential object. The
    * supplied credential parameter will be internally duplicated.
    */
  def git_credential_ssh_interactive_new(
      out: Ptr[Ptr[git_credential]],
      username: CString,
      prompt_callback: git_credential_ssh_interactive_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Create a new ssh key credential object used for querying an ssh-agent. The
    * supplied credential parameter will be internally duplicated.
    */
  def git_credential_ssh_key_from_agent(
      out: Ptr[Ptr[git_credential]],
      username: CString
  ): CInt = extern

  /** Create a new ssh key credential object reading the keys from memory.
    */
  def git_credential_ssh_key_memory_new(
      out: Ptr[Ptr[git_credential]],
      username: CString,
      publickey: CString,
      privatekey: CString,
      passphrase: CString
  ): CInt = extern

  /** Create a new passphrase-protected ssh key credential object. The supplied
    * credential parameter will be internally duplicated.
    */
  def git_credential_ssh_key_new(
      out: Ptr[Ptr[git_credential]],
      username: CString,
      publickey: CString,
      privatekey: CString,
      passphrase: CString
  ): CInt = extern

  /** Create a credential to specify a username.
    */
  def git_credential_username_new(
      out: Ptr[Ptr[git_credential]],
      username: CString
  ): CInt = extern

  /** Stock callback usable as a git_credential_acquire_cb. This calls
    * git_cred_userpass_plaintext_new unless the protocol has not specified
    * `GIT_CREDENTIAL_USERPASS_PLAINTEXT` as an allowed type.
    */
  def git_credential_userpass(
      out: Ptr[Ptr[git_credential]],
      url: CString,
      user_from_url: CString,
      allowed_types: CUnsignedInt,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Create a new plain-text username and password credential object. The
    * supplied credential parameter will be internally duplicated.
    */
  def git_credential_userpass_plaintext_new(
      out: Ptr[Ptr[git_credential]],
      username: CString,
      password: CString
  ): CInt = extern

  /** Describe a commit
    */
  def git_describe_commit(
      result: Ptr[Ptr[git_describe_result]],
      committish: Ptr[git_object],
      opts: Ptr[git_describe_options]
  ): CInt = extern

  /** Print the describe result to a buffer
    */
  def git_describe_format(
      out: Ptr[git_buf],
      result: Ptr[git_describe_result],
      opts: Ptr[git_describe_format_options]
  ): CInt = extern

  /** Initialize git_describe_format_options structure
    */
  def git_describe_format_options_init(
      opts: Ptr[git_describe_format_options],
      version: CUnsignedInt
  ): CInt = extern

  /** */
  def git_describe_init_format_options(
      opts: Ptr[git_describe_format_options],
      version: CUnsignedInt
  ): CInt = extern

  /** */
  def git_describe_init_options(
      opts: Ptr[git_describe_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_describe_options structure
    */
  def git_describe_options_init(
      opts: Ptr[git_describe_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Free the describe result.
    */
  def git_describe_result_free(result: Ptr[git_describe_result]): Unit = extern

  /** Describe a commit
    */
  def git_describe_workdir(
      out: Ptr[Ptr[git_describe_result]],
      repo: Ptr[git_repository],
      opts: Ptr[git_describe_options]
  ): CInt = extern

  /** Directly run a diff between a blob and a buffer.
    */
  def git_diff_blob_to_buffer(
      old_blob: Ptr[git_blob],
      old_as_path: CString,
      buffer: CString,
      buffer_len: size_t,
      buffer_as_path: CString,
      options: Ptr[git_diff_options],
      file_cb: git_diff_file_cb,
      binary_cb: git_diff_binary_cb,
      hunk_cb: git_diff_hunk_cb,
      line_cb: git_diff_line_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Directly run a diff on two blobs.
    */
  def git_diff_blobs(
      old_blob: Ptr[git_blob],
      old_as_path: CString,
      new_blob: Ptr[git_blob],
      new_as_path: CString,
      options: Ptr[git_diff_options],
      file_cb: git_diff_file_cb,
      binary_cb: git_diff_binary_cb,
      hunk_cb: git_diff_hunk_cb,
      line_cb: git_diff_line_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Directly run a diff between two buffers.
    */
  def git_diff_buffers(
      old_buffer: Ptr[Byte],
      old_len: size_t,
      old_as_path: CString,
      new_buffer: Ptr[Byte],
      new_len: size_t,
      new_as_path: CString,
      options: Ptr[git_diff_options],
      file_cb: git_diff_file_cb,
      binary_cb: git_diff_binary_cb,
      hunk_cb: git_diff_hunk_cb,
      line_cb: git_diff_line_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Create an e-mail ready patch for a commit.
    */
  def git_diff_commit_as_email(
      out: Ptr[git_buf],
      repo: Ptr[git_repository],
      commit: Ptr[git_commit],
      patch_no: size_t,
      total_patches: size_t,
      flags: uint32_t,
      diff_opts: Ptr[git_diff_options]
  ): CInt = extern

  /** */
  def git_diff_find_init_options(
      opts: Ptr[git_diff_find_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_diff_find_options structure
    */
  def git_diff_find_options_init(
      opts: Ptr[git_diff_find_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Transform a diff marking file renames, copies, etc.
    */
  def git_diff_find_similar(
      diff: Ptr[git_diff],
      options: Ptr[git_diff_find_options]
  ): CInt = extern

  /** Loop over all deltas in a diff issuing callbacks.
    */
  def git_diff_foreach(
      diff: Ptr[git_diff],
      file_cb: git_diff_file_cb,
      binary_cb: git_diff_binary_cb,
      hunk_cb: git_diff_hunk_cb,
      line_cb: git_diff_line_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Create an e-mail ready patch from a diff.
    */
  def git_diff_format_email(
      out: Ptr[git_buf],
      diff: Ptr[git_diff],
      opts: Ptr[git_diff_format_email_options]
  ): CInt = extern

  /** */
  def git_diff_format_email_init_options(
      opts: Ptr[git_diff_format_email_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_diff_format_email_options structure
    */
  def git_diff_format_email_options_init(
      opts: Ptr[git_diff_format_email_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Deallocate a diff.
    */
  def git_diff_free(diff: Ptr[git_diff]): Unit = extern

  /** Read the contents of a git patch file into a `git_diff` object.
    */
  def git_diff_from_buffer(
      out: Ptr[Ptr[git_diff]],
      content: CString,
      content_len: size_t
  ): CInt = extern

  /** Return the diff delta for an entry in the diff list.
    */
  def git_diff_get_delta(
      diff: Ptr[git_diff],
      idx: size_t
  ): Ptr[git_diff_delta] = extern

  /** Accumulate diff statistics for all patches.
    */
  def git_diff_get_stats(
      out: Ptr[Ptr[git_diff_stats]],
      diff: Ptr[git_diff]
  ): CInt = extern

  /** Create a diff with the difference between two index objects.
    */
  def git_diff_index_to_index(
      diff: Ptr[Ptr[git_diff]],
      repo: Ptr[git_repository],
      old_index: Ptr[git_index],
      new_index: Ptr[git_index],
      opts: Ptr[git_diff_options]
  ): CInt = extern

  /** Create a diff between the repository index and the workdir directory.
    */
  def git_diff_index_to_workdir(
      diff: Ptr[Ptr[git_diff]],
      repo: Ptr[git_repository],
      index: Ptr[git_index],
      opts: Ptr[git_diff_options]
  ): CInt = extern

  /** */
  def git_diff_init_options(
      opts: Ptr[git_diff_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Check if deltas are sorted case sensitively or insensitively.
    */
  def git_diff_is_sorted_icase(diff: Ptr[git_diff]): CInt = extern

  /** Merge one diff into another.
    */
  def git_diff_merge(onto: Ptr[git_diff], from: Ptr[git_diff]): CInt = extern

  /** Query how many diff records are there in a diff.
    */
  def git_diff_num_deltas(diff: Ptr[git_diff]): size_t = extern

  /** Query how many diff deltas are there in a diff filtered by type.
    */
  def git_diff_num_deltas_of_type(
      diff: Ptr[git_diff],
      `type`: git_delta_t
  ): size_t = extern

  /** Initialize git_diff_options structure
    */
  def git_diff_options_init(
      opts: Ptr[git_diff_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Calculate the patch ID for the given patch.
    */
  def git_diff_patchid(
      out: Ptr[git_oid],
      diff: Ptr[git_diff],
      opts: Ptr[git_diff_patchid_options]
  ): CInt = extern

  /** */
  def git_diff_patchid_init_options(
      opts: Ptr[git_diff_patchid_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_diff_patchid_options structure
    */
  def git_diff_patchid_options_init(
      opts: Ptr[git_diff_patchid_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Iterate over a diff generating formatted text output.
    */
  def git_diff_print(
      diff: Ptr[git_diff],
      format: git_diff_format_t,
      print_cb: git_diff_line_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Get the total number of deletions in a diff
    */
  def git_diff_stats_deletions(stats: Ptr[git_diff_stats]): size_t = extern

  /** Get the total number of files changed in a diff
    */
  def git_diff_stats_files_changed(stats: Ptr[git_diff_stats]): size_t = extern

  /** Deallocate a `git_diff_stats`.
    */
  def git_diff_stats_free(stats: Ptr[git_diff_stats]): Unit = extern

  /** Get the total number of insertions in a diff
    */
  def git_diff_stats_insertions(stats: Ptr[git_diff_stats]): size_t = extern

  /** Print diff statistics to a `git_buf`.
    */
  def git_diff_stats_to_buf(
      out: Ptr[git_buf],
      stats: Ptr[git_diff_stats],
      format: git_diff_stats_format_t,
      width: size_t
  ): CInt = extern

  /** Look up the single character abbreviation for a delta status code.
    */
  def git_diff_status_char(status: git_delta_t): CChar = extern

  /** Produce the complete formatted text output from a diff into a buffer.
    */
  def git_diff_to_buf(
      out: Ptr[git_buf],
      diff: Ptr[git_diff],
      format: git_diff_format_t
  ): CInt = extern

  /** Create a diff between a tree and repository index.
    */
  def git_diff_tree_to_index(
      diff: Ptr[Ptr[git_diff]],
      repo: Ptr[git_repository],
      old_tree: Ptr[git_tree],
      index: Ptr[git_index],
      opts: Ptr[git_diff_options]
  ): CInt = extern

  /** Create a diff with the difference between two tree objects.
    */
  def git_diff_tree_to_tree(
      diff: Ptr[Ptr[git_diff]],
      repo: Ptr[git_repository],
      old_tree: Ptr[git_tree],
      new_tree: Ptr[git_tree],
      opts: Ptr[git_diff_options]
  ): CInt = extern

  /** Create a diff between a tree and the working directory.
    */
  def git_diff_tree_to_workdir(
      diff: Ptr[Ptr[git_diff]],
      repo: Ptr[git_repository],
      old_tree: Ptr[git_tree],
      opts: Ptr[git_diff_options]
  ): CInt = extern

  /** Create a diff between a tree and the working directory using index data to
    * account for staged deletes, tracked files, etc.
    */
  def git_diff_tree_to_workdir_with_index(
      diff: Ptr[Ptr[git_diff]],
      repo: Ptr[git_repository],
      old_tree: Ptr[git_tree],
      opts: Ptr[git_diff_options]
  ): CInt = extern

  /** Create a diff for a commit in mbox format for sending via email. The
    * commit must not be a merge commit.
    */
  def git_email_create_from_commit(
      out: Ptr[git_buf],
      commit: Ptr[git_commit],
      opts: Ptr[git_email_create_options]
  ): CInt = extern

  /** Create a diff for a commit in mbox format for sending via email.
    */
  def git_email_create_from_diff(
      out: Ptr[git_buf],
      diff: Ptr[git_diff],
      patch_idx: size_t,
      patch_count: size_t,
      commit_id: Ptr[git_oid],
      summary: CString,
      body: CString,
      author: Ptr[git_signature],
      opts: Ptr[git_email_create_options]
  ): CInt = extern

  /** Clear the last library error that occurred for this thread.
    */
  def git_error_clear(): Unit = extern

  /** Return the last `git_error` object that was generated for the current
    * thread.
    */
  def git_error_last(): Ptr[git_error] = extern

  /** Set the error message string for this thread, using `printf`-style
    * formatting.
    */
  def git_error_set(error_class: CInt, fmt: CString, rest: Any*): Unit = extern

  /** Set the error message to a special value for memory allocation failure.
    */
  def git_error_set_oom(): Unit = extern

  /** Set the error message string for this thread. This function is like
    * `git_error_set` but takes a static string instead of a `printf`-style
    * format.
    */
  def git_error_set_str(error_class: CInt, string: CString): CInt = extern

  /** */
  def git_fetch_init_options(
      opts: Ptr[git_fetch_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_fetch_options structure
    */
  def git_fetch_options_init(
      opts: Ptr[git_fetch_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Apply a filter list to the contents of a blob
    */
  def git_filter_list_apply_to_blob(
      out: Ptr[git_buf],
      filters: Ptr[git_filter_list],
      blob: Ptr[git_blob]
  ): CInt = extern

  /** Apply filter list to a data buffer.
    */
  def git_filter_list_apply_to_buffer(
      out: Ptr[git_buf],
      filters: Ptr[git_filter_list],
      in: CString,
      in_len: size_t
  ): CInt = extern

  /** Deprecated in favor of `git_filter_list_apply_to_buffer`.
    */
  def git_filter_list_apply_to_data(
      out: Ptr[git_buf],
      filters: Ptr[git_filter_list],
      in: Ptr[git_buf]
  ): CInt = extern

  /** Apply a filter list to the contents of a file on disk
    */
  def git_filter_list_apply_to_file(
      out: Ptr[git_buf],
      filters: Ptr[git_filter_list],
      repo: Ptr[git_repository],
      path: CString
  ): CInt = extern

  /** Query the filter list to see if a given filter (by name) will run. The
    * built-in filters "crlf" and "ident" can be queried, otherwise this is the
    * name of the filter specified by the filter attribute.
    */
  def git_filter_list_contains(
      filters: Ptr[git_filter_list],
      name: CString
  ): CInt = extern

  /** Free a git_filter_list
    */
  def git_filter_list_free(filters: Ptr[git_filter_list]): Unit = extern

  /** Load the filter list for a given path.
    */
  def git_filter_list_load(
      filters: Ptr[Ptr[git_filter_list]],
      repo: Ptr[git_repository],
      blob: Ptr[git_blob],
      path: CString,
      mode: git_filter_mode_t,
      flags: uint32_t
  ): CInt = extern

  /** Load the filter list for a given path.
    */
  def git_filter_list_load_ext(
      filters: Ptr[Ptr[git_filter_list]],
      repo: Ptr[git_repository],
      blob: Ptr[git_blob],
      path: CString,
      mode: git_filter_mode_t,
      opts: Ptr[git_filter_options]
  ): CInt = extern

  /** Apply a filter list to a blob as a stream
    */
  def git_filter_list_stream_blob(
      filters: Ptr[git_filter_list],
      blob: Ptr[git_blob],
      target: Ptr[git_writestream]
  ): CInt = extern

  /** Apply a filter list to an arbitrary buffer as a stream
    */
  def git_filter_list_stream_buffer(
      filters: Ptr[git_filter_list],
      buffer: CString,
      len: size_t,
      target: Ptr[git_writestream]
  ): CInt = extern

  /** Deprecated in favor of `git_filter_list_stream_buffer`.
    */
  def git_filter_list_stream_data(
      filters: Ptr[git_filter_list],
      data: Ptr[git_buf],
      target: Ptr[git_writestream]
  ): CInt = extern

  /** Apply a filter list to a file as a stream
    */
  def git_filter_list_stream_file(
      filters: Ptr[git_filter_list],
      repo: Ptr[git_repository],
      path: CString,
      target: Ptr[git_writestream]
  ): CInt = extern

  /** Count the number of unique commits between two commit objects
    */
  def git_graph_ahead_behind(
      ahead: Ptr[size_t],
      behind: Ptr[size_t],
      repo: Ptr[git_repository],
      local: Ptr[git_oid],
      upstream: Ptr[git_oid]
  ): CInt = extern

  /** Determine if a commit is the descendant of another commit.
    */
  def git_graph_descendant_of(
      repo: Ptr[git_repository],
      commit: Ptr[git_oid],
      ancestor: Ptr[git_oid]
  ): CInt = extern

  /** Determine if a commit is reachable from any of a list of commits by
    * following parent edges.
    */
  def git_graph_reachable_from_any(
      repo: Ptr[git_repository],
      commit: Ptr[git_oid],
      descendant_array: Ptr[git_oid],
      length: size_t
  ): CInt = extern

  /** Add ignore rules for a repository.
    */
  def git_ignore_add_rule(repo: Ptr[git_repository], rules: CString): CInt =
    extern

  /** Clear ignore rules that were explicitly added.
    */
  def git_ignore_clear_internal_rules(repo: Ptr[git_repository]): CInt = extern

  /** Test if the ignore rules apply to a given path.
    */
  def git_ignore_path_is_ignored(
      ignored: Ptr[CInt],
      repo: Ptr[git_repository],
      path: CString
  ): CInt = extern

  /** Add or update an index entry from an in-memory struct
    */
  def git_index_add(
      index: Ptr[git_index],
      source_entry: Ptr[git_index_entry]
  ): CInt = extern

  /** Add or update index entries matching files in the working directory.
    */
  def git_index_add_all(
      index: Ptr[git_index],
      pathspec: Ptr[git_strarray],
      flags: CUnsignedInt,
      callback: git_index_matched_path_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Add or update an index entry from a file on disk
    */
  def git_index_add_bypath(index: Ptr[git_index], path: CString): CInt = extern

  /** Add or update an index entry from a buffer in memory
    */
  def git_index_add_from_buffer(
      index: Ptr[git_index],
      entry: Ptr[git_index_entry],
      buffer: Ptr[Byte],
      len: size_t
  ): CInt = extern

  /** */
  def git_index_add_frombuffer(
      index: Ptr[git_index],
      entry: Ptr[git_index_entry],
      buffer: Ptr[Byte],
      len: size_t
  ): CInt = extern

  /** Read index capabilities flags.
    */
  def git_index_caps(index: Ptr[git_index]): CInt = extern

  /** Get the checksum of the index
    */
  def git_index_checksum(index: Ptr[git_index]): Ptr[git_oid] = extern

  /** Clear the contents (all the entries) of an index object.
    */
  def git_index_clear(index: Ptr[git_index]): CInt = extern

  /** Add or update index entries to represent a conflict. Any staged entries
    * that exist at the given paths will be removed.
    */
  def git_index_conflict_add(
      index: Ptr[git_index],
      ancestor_entry: Ptr[git_index_entry],
      our_entry: Ptr[git_index_entry],
      their_entry: Ptr[git_index_entry]
  ): CInt = extern

  /** Remove all conflicts in the index (entries with a stage greater than 0).
    */
  def git_index_conflict_cleanup(index: Ptr[git_index]): CInt = extern

  /** Get the index entries that represent a conflict of a single file.
    */
  def git_index_conflict_get(
      ancestor_out: Ptr[Ptr[git_index_entry]],
      our_out: Ptr[Ptr[git_index_entry]],
      their_out: Ptr[Ptr[git_index_entry]],
      index: Ptr[git_index],
      path: CString
  ): CInt = extern

  /** Frees a `git_index_conflict_iterator`.
    */
  def git_index_conflict_iterator_free(
      iterator: Ptr[git_index_conflict_iterator]
  ): Unit = extern

  /** Create an iterator for the conflicts in the index.
    */
  def git_index_conflict_iterator_new(
      iterator_out: Ptr[Ptr[git_index_conflict_iterator]],
      index: Ptr[git_index]
  ): CInt = extern

  /** Returns the current conflict (ancestor, ours and theirs entry) and advance
    * the iterator internally to the next value.
    */
  def git_index_conflict_next(
      ancestor_out: Ptr[Ptr[git_index_entry]],
      our_out: Ptr[Ptr[git_index_entry]],
      their_out: Ptr[Ptr[git_index_entry]],
      iterator: Ptr[git_index_conflict_iterator]
  ): CInt = extern

  /** Removes the index entries that represent a conflict of a single file.
    */
  def git_index_conflict_remove(index: Ptr[git_index], path: CString): CInt =
    extern

  /** Return whether the given index entry is a conflict (has a high stage
    * entry). This is simply shorthand for `git_index_entry_stage > 0`.
    */
  def git_index_entry_is_conflict(entry: Ptr[git_index_entry]): CInt = extern

  /** Return the stage number from a git index entry
    */
  def git_index_entry_stage(entry: Ptr[git_index_entry]): CInt = extern

  /** Get the count of entries currently in the index
    */
  def git_index_entrycount(index: Ptr[git_index]): size_t = extern

  /** Find the first position of any entries which point to given path in the
    * Git index.
    */
  def git_index_find(
      at_pos: Ptr[size_t],
      index: Ptr[git_index],
      path: CString
  ): CInt = extern

  /** Find the first position of any entries matching a prefix. To find the
    * first position of a path inside a given folder, suffix the prefix with a
    * '/'.
    */
  def git_index_find_prefix(
      at_pos: Ptr[size_t],
      index: Ptr[git_index],
      prefix: CString
  ): CInt = extern

  /** Free an existing index object.
    */
  def git_index_free(index: Ptr[git_index]): Unit = extern

  /** Get a pointer to one of the entries in the index
    */
  def git_index_get_byindex(
      index: Ptr[git_index],
      n: size_t
  ): Ptr[git_index_entry] = extern

  /** Get a pointer to one of the entries in the index
    */
  def git_index_get_bypath(
      index: Ptr[git_index],
      path: CString,
      stage: CInt
  ): Ptr[git_index_entry] = extern

  /** Determine if the index contains entries representing file conflicts.
    */
  def git_index_has_conflicts(index: Ptr[git_index]): CInt = extern

  /** Free the index iterator
    */
  def git_index_iterator_free(iterator: Ptr[git_index_iterator]): Unit = extern

  /** Create an iterator that will return every entry contained in the index at
    * the time of creation. Entries are returned in order, sorted by path. This
    * iterator is backed by a snapshot that allows callers to modify the index
    * while iterating without affecting the iterator.
    */
  def git_index_iterator_new(
      iterator_out: Ptr[Ptr[git_index_iterator]],
      index: Ptr[git_index]
  ): CInt = extern

  /** Return the next index entry in-order from the iterator.
    */
  def git_index_iterator_next(
      out: Ptr[Ptr[git_index_entry]],
      iterator: Ptr[git_index_iterator]
  ): CInt = extern

  /** Create an in-memory index object.
    */
  def git_index_new(out: Ptr[Ptr[git_index]]): CInt = extern

  /** Create a new bare Git index object as a memory representation of the Git
    * index file in 'index_path', without a repository to back it.
    */
  def git_index_open(out: Ptr[Ptr[git_index]], index_path: CString): CInt =
    extern

  /** Get the repository this index relates to
    */
  def git_index_owner(index: Ptr[git_index]): Ptr[git_repository] = extern

  /** Get the full path to the index file on disk.
    */
  def git_index_path(index: Ptr[git_index]): CString = extern

  /** Update the contents of an existing index object in memory by reading from
    * the hard disk.
    */
  def git_index_read(index: Ptr[git_index], force: CInt): CInt = extern

  /** Read a tree into the index file with stats
    */
  def git_index_read_tree(index: Ptr[git_index], tree: Ptr[git_tree]): CInt =
    extern

  /** Remove an entry from the index
    */
  def git_index_remove(
      index: Ptr[git_index],
      path: CString,
      stage: CInt
  ): CInt = extern

  /** Remove all matching index entries.
    */
  def git_index_remove_all(
      index: Ptr[git_index],
      pathspec: Ptr[git_strarray],
      callback: git_index_matched_path_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Remove an index entry corresponding to a file on disk
    */
  def git_index_remove_bypath(index: Ptr[git_index], path: CString): CInt =
    extern

  /** Remove all entries from the index under a given directory
    */
  def git_index_remove_directory(
      index: Ptr[git_index],
      dir: CString,
      stage: CInt
  ): CInt = extern

  /** Set index capabilities flags.
    */
  def git_index_set_caps(index: Ptr[git_index], caps: CInt): CInt = extern

  /** Set index on-disk version.
    */
  def git_index_set_version(
      index: Ptr[git_index],
      version: CUnsignedInt
  ): CInt = extern

  /** Update all index entries to match the working directory
    */
  def git_index_update_all(
      index: Ptr[git_index],
      pathspec: Ptr[git_strarray],
      callback: git_index_matched_path_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Get index on-disk version.
    */
  def git_index_version(index: Ptr[git_index]): CUnsignedInt = extern

  /** Write an existing index object from memory back to disk using an atomic
    * file lock.
    */
  def git_index_write(index: Ptr[git_index]): CInt = extern

  /** Write the index as a tree
    */
  def git_index_write_tree(out: Ptr[git_oid], index: Ptr[git_index]): CInt =
    extern

  /** Write the index as a tree to the given repository
    */
  def git_index_write_tree_to(
      out: Ptr[git_oid],
      index: Ptr[git_index],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Add data to the indexer
    */
  def git_indexer_append(
      idx: Ptr[git_indexer],
      data: Ptr[Byte],
      size: size_t,
      stats: Ptr[git_indexer_progress]
  ): CInt = extern

  /** Finalize the pack and index
    */
  def git_indexer_commit(
      idx: Ptr[git_indexer],
      stats: Ptr[git_indexer_progress]
  ): CInt = extern

  /** Free the indexer and its resources
    */
  def git_indexer_free(idx: Ptr[git_indexer]): Unit = extern

  /** Get the packfile's hash
    */
  def git_indexer_hash(idx: Ptr[git_indexer]): Ptr[git_oid] = extern

  /** */
  def git_indexer_init_options(
      opts: Ptr[git_indexer_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Get the unique name for the resulting packfile.
    */
  def git_indexer_name(idx: Ptr[git_indexer]): CString = extern

  /** Create a new indexer instance
    */
  def git_indexer_new(
      out: Ptr[Ptr[git_indexer]],
      path: CString,
      mode: CUnsignedInt,
      odb: Ptr[git_odb],
      opts: Ptr[git_indexer_options]
  ): CInt = extern

  /** Initializes a `git_indexer_options` with default values. Equivalent to
    * creating an instance with GIT_INDEXER_OPTIONS_INIT.
    */
  def git_indexer_options_init(
      opts: Ptr[git_indexer_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Query compile time options for libgit2.
    */
  def git_libgit2_features(): CInt = extern

  /** Init the global state
    */
  def git_libgit2_init(): CInt = extern

  /** Set or query a library global option
    */
  def git_libgit2_opts(option: CInt, rest: Any*): CInt = extern

  /** Return the prerelease state of the libgit2 library currently being used.
    * For nightly builds during active development, this will be "alpha".
    * Releases may have a "beta" or release candidate ("rc1", "rc2", etc)
    * prerelease. For a final release, this function returns NULL.
    */
  def git_libgit2_prerelease(): CString = extern

  /** Shutdown the global state
    */
  def git_libgit2_shutdown(): CInt = extern

  /** Return the version of the libgit2 library being currently used.
    */
  def git_libgit2_version(
      major: Ptr[CInt],
      minor: Ptr[CInt],
      rev: Ptr[CInt]
  ): CInt = extern

  /** Add a single entry to the given mailmap object. If the entry already
    * exists, it will be replaced with the new entry.
    */
  def git_mailmap_add_entry(
      mm: Ptr[git_mailmap],
      real_name: CString,
      real_email: CString,
      replace_name: CString,
      replace_email: CString
  ): CInt = extern

  /** Free the mailmap and its associated memory.
    */
  def git_mailmap_free(mm: Ptr[git_mailmap]): Unit = extern

  /** Create a new mailmap instance containing a single mailmap file
    */
  def git_mailmap_from_buffer(
      out: Ptr[Ptr[git_mailmap]],
      buf: CString,
      len: size_t
  ): CInt = extern

  /** Create a new mailmap instance from a repository, loading mailmap files
    * based on the repository's configuration.
    */
  def git_mailmap_from_repository(
      out: Ptr[Ptr[git_mailmap]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Allocate a new mailmap object.
    */
  def git_mailmap_new(out: Ptr[Ptr[git_mailmap]]): CInt = extern

  /** Resolve a name and email to the corresponding real name and email.
    */
  def git_mailmap_resolve(
      real_name: Ptr[CString],
      real_email: Ptr[CString],
      mm: Ptr[git_mailmap],
      name: CString,
      email: CString
  ): CInt = extern

  /** Resolve a signature to use real names and emails with a mailmap.
    */
  def git_mailmap_resolve_signature(
      out: Ptr[Ptr[git_signature]],
      mm: Ptr[git_mailmap],
      sig: Ptr[git_signature]
  ): CInt = extern

  /** Merges the given commit(s) into HEAD, writing the results into the working
    * directory. Any changes are staged for commit and any conflicts are written
    * to the index. Callers should inspect the repository's index after this
    * completes, resolve any conflicts and prepare a commit.
    */
  def git_merge(
      repo: Ptr[git_repository],
      their_heads: Ptr[Ptr[git_annotated_commit]],
      their_heads_len: size_t,
      merge_opts: Ptr[git_merge_options],
      checkout_opts: Ptr[git_checkout_options]
  ): CInt = extern

  /** Analyzes the given branch(es) and determines the opportunities for merging
    * them into the HEAD of the repository.
    */
  def git_merge_analysis(
      analysis_out: Ptr[git_merge_analysis_t],
      preference_out: Ptr[git_merge_preference_t],
      repo: Ptr[git_repository],
      their_heads: Ptr[Ptr[git_annotated_commit]],
      their_heads_len: size_t
  ): CInt = extern

  /** Analyzes the given branch(es) and determines the opportunities for merging
    * them into a reference.
    */
  def git_merge_analysis_for_ref(
      analysis_out: Ptr[git_merge_analysis_t],
      preference_out: Ptr[git_merge_preference_t],
      repo: Ptr[git_repository],
      our_ref: Ptr[git_reference],
      their_heads: Ptr[Ptr[git_annotated_commit]],
      their_heads_len: size_t
  ): CInt = extern

  /** Find a merge base between two commits
    */
  def git_merge_base(
      out: Ptr[git_oid],
      repo: Ptr[git_repository],
      one: Ptr[git_oid],
      two: Ptr[git_oid]
  ): CInt = extern

  /** Find a merge base given a list of commits
    */
  def git_merge_base_many(
      out: Ptr[git_oid],
      repo: Ptr[git_repository],
      length: size_t,
      input_array: Ptr[git_oid]
  ): CInt = extern

  /** Find a merge base in preparation for an octopus merge
    */
  def git_merge_base_octopus(
      out: Ptr[git_oid],
      repo: Ptr[git_repository],
      length: size_t,
      input_array: Ptr[git_oid]
  ): CInt = extern

  /** Find merge bases between two commits
    */
  def git_merge_bases(
      out: Ptr[git_oidarray],
      repo: Ptr[git_repository],
      one: Ptr[git_oid],
      two: Ptr[git_oid]
  ): CInt = extern

  /** Find all merge bases given a list of commits
    */
  def git_merge_bases_many(
      out: Ptr[git_oidarray],
      repo: Ptr[git_repository],
      length: size_t,
      input_array: Ptr[git_oid]
  ): CInt = extern

  /** Merge two commits, producing a `git_index` that reflects the result of the
    * merge. The index may be written as-is to the working directory or checked
    * out. If the index is to be converted to a tree, the caller should resolve
    * any conflicts that arose as part of the merge.
    */
  def git_merge_commits(
      out: Ptr[Ptr[git_index]],
      repo: Ptr[git_repository],
      our_commit: Ptr[git_commit],
      their_commit: Ptr[git_commit],
      opts: Ptr[git_merge_options]
  ): CInt = extern

  /** Merge two files as they exist in the in-memory data structures, using the
    * given common ancestor as the baseline, producing a `git_merge_file_result`
    * that reflects the merge result. The `git_merge_file_result` must be freed
    * with `git_merge_file_result_free`.
    */
  def git_merge_file(
      out: Ptr[git_merge_file_result],
      ancestor: Ptr[git_merge_file_input],
      ours: Ptr[git_merge_file_input],
      theirs: Ptr[git_merge_file_input],
      opts: Ptr[git_merge_file_options]
  ): CInt = extern

  /** Merge two files as they exist in the index, using the given common
    * ancestor as the baseline, producing a `git_merge_file_result` that
    * reflects the merge result. The `git_merge_file_result` must be freed with
    * `git_merge_file_result_free`.
    */
  def git_merge_file_from_index(
      out: Ptr[git_merge_file_result],
      repo: Ptr[git_repository],
      ancestor: Ptr[git_index_entry],
      ours: Ptr[git_index_entry],
      theirs: Ptr[git_index_entry],
      opts: Ptr[git_merge_file_options]
  ): CInt = extern

  /** */
  def git_merge_file_init_input(
      input: Ptr[git_merge_file_input],
      version: CUnsignedInt
  ): CInt = extern

  /** */
  def git_merge_file_init_options(
      opts: Ptr[git_merge_file_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initializes a `git_merge_file_input` with default values. Equivalent to
    * creating an instance with GIT_MERGE_FILE_INPUT_INIT.
    */
  def git_merge_file_input_init(
      opts: Ptr[git_merge_file_input],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_merge_file_options structure
    */
  def git_merge_file_options_init(
      opts: Ptr[git_merge_file_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Frees a `git_merge_file_result`.
    */
  def git_merge_file_result_free(result: Ptr[git_merge_file_result]): Unit =
    extern

  /** */
  def git_merge_init_options(
      opts: Ptr[git_merge_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_merge_options structure
    */
  def git_merge_options_init(
      opts: Ptr[git_merge_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Merge two trees, producing a `git_index` that reflects the result of the
    * merge. The index may be written as-is to the working directory or checked
    * out. If the index is to be converted to a tree, the caller should resolve
    * any conflicts that arose as part of the merge.
    */
  def git_merge_trees(
      out: Ptr[Ptr[git_index]],
      repo: Ptr[git_repository],
      ancestor_tree: Ptr[git_tree],
      our_tree: Ptr[git_tree],
      their_tree: Ptr[git_tree],
      opts: Ptr[git_merge_options]
  ): CInt = extern

  /** Clean up excess whitespace and make sure there is a trailing newline in
    * the message.
    */
  def git_message_prettify(
      out: Ptr[git_buf],
      message: CString,
      strip_comments: CInt,
      comment_char: CChar
  ): CInt = extern

  /** Clean's up any allocated memory in the git_message_trailer_array filled by
    * a call to git_message_trailers.
    */
  def git_message_trailer_array_free(
      arr: Ptr[git_message_trailer_array]
  ): Unit = extern

  /** Parse trailers out of a message, filling the array pointed to by +arr+.
    */
  def git_message_trailers(
      arr: Ptr[git_message_trailer_array],
      message: CString
  ): CInt = extern

  /** Get the note author
    */
  def git_note_author(note: Ptr[git_note]): Ptr[git_signature] = extern

  /** Add a note for an object from a commit
    */
  def git_note_commit_create(
      notes_commit_out: Ptr[git_oid],
      notes_blob_out: Ptr[git_oid],
      repo: Ptr[git_repository],
      parent: Ptr[git_commit],
      author: Ptr[git_signature],
      committer: Ptr[git_signature],
      oid: Ptr[git_oid],
      note: CString,
      allow_note_overwrite: CInt
  ): CInt = extern

  /** Creates a new iterator for notes from a commit
    */
  def git_note_commit_iterator_new(
      out: Ptr[Ptr[git_note_iterator]],
      notes_commit: Ptr[git_commit]
  ): CInt = extern

  /** Read the note for an object from a note commit
    */
  def git_note_commit_read(
      out: Ptr[Ptr[git_note]],
      repo: Ptr[git_repository],
      notes_commit: Ptr[git_commit],
      oid: Ptr[git_oid]
  ): CInt = extern

  /** Remove the note for an object
    */
  def git_note_commit_remove(
      notes_commit_out: Ptr[git_oid],
      repo: Ptr[git_repository],
      notes_commit: Ptr[git_commit],
      author: Ptr[git_signature],
      committer: Ptr[git_signature],
      oid: Ptr[git_oid]
  ): CInt = extern

  /** Get the note committer
    */
  def git_note_committer(note: Ptr[git_note]): Ptr[git_signature] = extern

  /** Add a note for an object
    */
  def git_note_create(
      out: Ptr[git_oid],
      repo: Ptr[git_repository],
      notes_ref: CString,
      author: Ptr[git_signature],
      committer: Ptr[git_signature],
      oid: Ptr[git_oid],
      note: CString,
      force: CInt
  ): CInt = extern

  /** Get the default notes reference for a repository
    */
  def git_note_default_ref(out: Ptr[git_buf], repo: Ptr[git_repository]): CInt =
    extern

  /** Loop over all the notes within a specified namespace and issue a callback
    * for each one.
    */
  def git_note_foreach(
      repo: Ptr[git_repository],
      notes_ref: CString,
      note_cb: git_note_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Free a git_note object
    */
  def git_note_free(note: Ptr[git_note]): Unit = extern

  /** Get the note object's id
    */
  def git_note_id(note: Ptr[git_note]): Ptr[git_oid] = extern

  /** Frees an git_note_iterator
    */
  def git_note_iterator_free(it: Ptr[git_note_iterator]): Unit = extern

  /** Creates a new iterator for notes
    */
  def git_note_iterator_new(
      out: Ptr[Ptr[git_note_iterator]],
      repo: Ptr[git_repository],
      notes_ref: CString
  ): CInt = extern

  /** Get the note message
    */
  def git_note_message(note: Ptr[git_note]): CString = extern

  /** Return the current item (note_id and annotated_id) and advance the
    * iterator internally to the next value
    */
  def git_note_next(
      note_id: Ptr[git_oid],
      annotated_id: Ptr[git_oid],
      it: Ptr[git_note_iterator]
  ): CInt = extern

  /** Read the note for an object
    */
  def git_note_read(
      out: Ptr[Ptr[git_note]],
      repo: Ptr[git_repository],
      notes_ref: CString,
      oid: Ptr[git_oid]
  ): CInt = extern

  /** Remove the note for an object
    */
  def git_note_remove(
      repo: Ptr[git_repository],
      notes_ref: CString,
      author: Ptr[git_signature],
      committer: Ptr[git_signature],
      oid: Ptr[git_oid]
  ): CInt = extern

  /** Get the size in bytes for the structure which acts as an in-memory
    * representation of any given object type.
    */
  def git_object__size(`type`: git_object_t): size_t = extern

  /** Create an in-memory copy of a Git object. The copy must be explicitly
    * free'd or it will leak.
    */
  def git_object_dup(
      dest: Ptr[Ptr[git_object]],
      source: Ptr[git_object]
  ): CInt = extern

  /** Close an open object
    */
  def git_object_free(`object`: Ptr[git_object]): Unit = extern

  /** Get the id (SHA1) of a repository object
    */
  def git_object_id(obj: Ptr[git_object]): Ptr[git_oid] = extern

  /** Lookup a reference to one of the objects in a repository.
    */
  def git_object_lookup(
      `object`: Ptr[Ptr[git_object]],
      repo: Ptr[git_repository],
      id: Ptr[git_oid],
      `type`: git_object_t
  ): CInt = extern

  /** Lookup an object that represents a tree entry.
    */
  def git_object_lookup_bypath(
      out: Ptr[Ptr[git_object]],
      treeish: Ptr[git_object],
      path: CString,
      `type`: git_object_t
  ): CInt = extern

  /** Lookup a reference to one of the objects in a repository, given a prefix
    * of its identifier (short id).
    */
  def git_object_lookup_prefix(
      object_out: Ptr[Ptr[git_object]],
      repo: Ptr[git_repository],
      id: Ptr[git_oid],
      len: size_t,
      `type`: git_object_t
  ): CInt = extern

  /** Get the repository that owns this object
    */
  def git_object_owner(obj: Ptr[git_object]): Ptr[git_repository] = extern

  /** Recursively peel an object until an object of the specified type is met.
    */
  def git_object_peel(
      peeled: Ptr[Ptr[git_object]],
      `object`: Ptr[git_object],
      target_type: git_object_t
  ): CInt = extern

  /** Analyzes a buffer of raw object content and determines its validity. Tree,
    * commit, and tag objects will be parsed and ensured that they are valid,
    * parseable content. (Blobs are always valid by definition.) An error
    * message will be set with an informative message if the object is not
    * valid.
    */
  def git_object_rawcontent_is_valid(
      valid: Ptr[CInt],
      buf: CString,
      len: size_t,
      object_type: git_object_t
  ): CInt = extern

  /** Get a short abbreviated OID string for the object
    */
  def git_object_short_id(out: Ptr[git_buf], obj: Ptr[git_object]): CInt =
    extern

  /** Convert a string object type representation to it's git_object_t.
    */
  def git_object_string2type(str: CString): git_object_t = extern

  /** Get the object type of an object
    */
  def git_object_type(obj: Ptr[git_object]): git_object_t = extern

  /** Convert an object type to its string representation.
    */
  def git_object_type2string(`type`: git_object_t): CString = extern

  /** Determine if the given git_object_t is a valid loose object type.
    */
  def git_object_typeisloose(`type`: git_object_t): CInt = extern

  /** Add a custom backend to an existing Object DB; this backend will work as
    * an alternate.
    */
  def git_odb_add_alternate(
      odb: Ptr[git_odb],
      backend: Ptr[git_odb_backend],
      priority: CInt
  ): CInt = extern

  /** Add a custom backend to an existing Object DB
    */
  def git_odb_add_backend(
      odb: Ptr[git_odb],
      backend: Ptr[git_odb_backend],
      priority: CInt
  ): CInt = extern

  /** Add an on-disk alternate to an existing Object DB.
    */
  def git_odb_add_disk_alternate(odb: Ptr[git_odb], path: CString): CInt =
    extern

  /** */
  def git_odb_backend_loose(
      out: Ptr[Ptr[git_odb_backend]],
      objects_dir: CString,
      compression_level: CInt,
      do_fsync: CInt,
      dir_mode: CUnsignedInt,
      file_mode: CUnsignedInt
  ): CInt = extern

  /** */
  def git_odb_backend_one_pack(
      out: Ptr[Ptr[git_odb_backend]],
      index_file: CString
  ): CInt = extern

  /** */
  def git_odb_backend_pack(
      out: Ptr[Ptr[git_odb_backend]],
      objects_dir: CString
  ): CInt = extern

  /** Determine if the given object can be found in the object database.
    */
  def git_odb_exists(db: Ptr[git_odb], id: Ptr[git_oid]): CInt = extern

  /** Determine if the given object can be found in the object database, with
    * extended options.
    */
  def git_odb_exists_ext(
      db: Ptr[git_odb],
      id: Ptr[git_oid],
      flags: CUnsignedInt
  ): CInt = extern

  /** Determine if an object can be found in the object database by an
    * abbreviated object ID.
    */
  def git_odb_exists_prefix(
      out: Ptr[git_oid],
      db: Ptr[git_odb],
      short_id: Ptr[git_oid],
      len: size_t
  ): CInt = extern

  /** Determine if one or more objects can be found in the object database by
    * their abbreviated object ID and type.
    */
  def git_odb_expand_ids(
      db: Ptr[git_odb],
      ids: Ptr[git_odb_expand_id],
      count: size_t
  ): CInt = extern

  /** List all objects available in the database
    */
  def git_odb_foreach(
      db: Ptr[git_odb],
      cb: git_odb_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Close an open object database.
    */
  def git_odb_free(db: Ptr[git_odb]): Unit = extern

  /** Lookup an ODB backend object by index
    */
  def git_odb_get_backend(
      out: Ptr[Ptr[git_odb_backend]],
      odb: Ptr[git_odb],
      pos: size_t
  ): CInt = extern

  /** */
  def git_odb_hash(
      out: Ptr[git_oid],
      data: Ptr[Byte],
      len: size_t,
      `type`: git_object_t
  ): CInt = extern

  /** */
  def git_odb_hashfile(
      out: Ptr[git_oid],
      path: CString,
      `type`: git_object_t
  ): CInt = extern

  /** */
  def git_odb_new(out: Ptr[Ptr[git_odb]]): CInt = extern

  /** Get the number of ODB backend objects
    */
  def git_odb_num_backends(odb: Ptr[git_odb]): size_t = extern

  /** Return the data of an ODB object
    */
  def git_odb_object_data(`object`: Ptr[git_odb_object]): Ptr[Byte] = extern

  /** Create a copy of an odb_object
    */
  def git_odb_object_dup(
      dest: Ptr[Ptr[git_odb_object]],
      source: Ptr[git_odb_object]
  ): CInt = extern

  /** Close an ODB object
    */
  def git_odb_object_free(`object`: Ptr[git_odb_object]): Unit = extern

  /** Return the OID of an ODB object
    */
  def git_odb_object_id(`object`: Ptr[git_odb_object]): Ptr[git_oid] = extern

  /** Return the size of an ODB object
    */
  def git_odb_object_size(`object`: Ptr[git_odb_object]): size_t = extern

  /** Return the type of an ODB object
    */
  def git_odb_object_type(`object`: Ptr[git_odb_object]): git_object_t = extern

  /** */
  def git_odb_open(out: Ptr[Ptr[git_odb]], objects_dir: CString): CInt = extern

  /** Open a stream to read an object from the ODB
    */
  def git_odb_open_rstream(
      out: Ptr[Ptr[git_odb_stream]],
      len: Ptr[size_t],
      `type`: Ptr[git_object_t],
      db: Ptr[git_odb],
      oid: Ptr[git_oid]
  ): CInt = extern

  /** Open a stream to write an object into the ODB
    */
  def git_odb_open_wstream(
      out: Ptr[Ptr[git_odb_stream]],
      db: Ptr[git_odb],
      size: git_object_size_t,
      `type`: git_object_t
  ): CInt = extern

  /** Read an object from the database.
    */
  def git_odb_read(
      out: Ptr[Ptr[git_odb_object]],
      db: Ptr[git_odb],
      id: Ptr[git_oid]
  ): CInt = extern

  /** Read the header of an object from the database, without reading its full
    * contents.
    */
  def git_odb_read_header(
      len_out: Ptr[size_t],
      type_out: Ptr[git_object_t],
      db: Ptr[git_odb],
      id: Ptr[git_oid]
  ): CInt = extern

  /** Read an object from the database, given a prefix of its identifier.
    */
  def git_odb_read_prefix(
      out: Ptr[Ptr[git_odb_object]],
      db: Ptr[git_odb],
      short_id: Ptr[git_oid],
      len: size_t
  ): CInt = extern

  /** Refresh the object database to load newly added files.
    */
  def git_odb_refresh(db: Ptr[git_odb]): CInt = extern

  /** Set the git commit-graph for the ODB.
    */
  def git_odb_set_commit_graph(
      odb: Ptr[git_odb],
      cgraph: Ptr[git_commit_graph]
  ): CInt = extern

  /** Finish writing to an odb stream
    */
  def git_odb_stream_finalize_write(
      out: Ptr[git_oid],
      stream: Ptr[git_odb_stream]
  ): CInt = extern

  /** Free an odb stream
    */
  def git_odb_stream_free(stream: Ptr[git_odb_stream]): Unit = extern

  /** Read from an odb stream
    */
  def git_odb_stream_read(
      stream: Ptr[git_odb_stream],
      buffer: CString,
      len: size_t
  ): CInt = extern

  /** Write to an odb stream
    */
  def git_odb_stream_write(
      stream: Ptr[git_odb_stream],
      buffer: CString,
      len: size_t
  ): CInt = extern

  /** Write an object directly into the ODB
    */
  def git_odb_write(
      out: Ptr[git_oid],
      odb: Ptr[git_odb],
      data: Ptr[Byte],
      len: size_t,
      `type`: git_object_t
  ): CInt = extern

  /** Write a `multi-pack-index` file from all the `.pack` files in the ODB.
    */
  def git_odb_write_multi_pack_index(db: Ptr[git_odb]): CInt = extern

  /** Open a stream for writing a pack file to the ODB.
    */
  def git_odb_write_pack(
      out: Ptr[Ptr[git_odb_writepack]],
      db: Ptr[git_odb],
      progress_cb: git_indexer_progress_cb,
      progress_payload: Ptr[Byte]
  ): CInt = extern

  /** Compare two oid structures.
    */
  def git_oid_cmp(a: Ptr[git_oid], b: Ptr[git_oid]): CInt = extern

  /** Copy an oid from one structure to another.
    */
  def git_oid_cpy(out: Ptr[git_oid], src: Ptr[git_oid]): CInt = extern

  /** Compare two oid structures for equality
    */
  def git_oid_equal(a: Ptr[git_oid], b: Ptr[git_oid]): CInt = extern

  /** Format a git_oid into a hex string.
    */
  def git_oid_fmt(out: CString, id: Ptr[git_oid]): CInt = extern

  /** */
  def git_oid_fromraw(out: Ptr[git_oid], raw: Ptr[CUnsignedChar]): CInt = extern

  /** */
  def git_oid_fromstr(out: Ptr[git_oid], str: CString): CInt = extern

  /** */
  def git_oid_fromstrn(out: Ptr[git_oid], str: CString, length: size_t): CInt =
    extern

  /** */
  def git_oid_fromstrp(out: Ptr[git_oid], str: CString): CInt = extern

  /** Check is an oid is all zeros.
    */
  def git_oid_is_zero(id: Ptr[git_oid]): CInt = extern

  /** */
  def git_oid_iszero(id: Ptr[git_oid]): CInt = extern

  /** Compare the first 'len' hexadecimal characters (packets of 4 bits) of two
    * oid structures.
    */
  def git_oid_ncmp(a: Ptr[git_oid], b: Ptr[git_oid], len: size_t): CInt = extern

  /** Format a git_oid into a partial hex string.
    */
  def git_oid_nfmt(out: CString, n: size_t, id: Ptr[git_oid]): CInt = extern

  /** Format a git_oid into a loose-object path string.
    */
  def git_oid_pathfmt(out: CString, id: Ptr[git_oid]): CInt = extern

  /** Add a new OID to set of shortened OIDs and calculate the minimal length to
    * uniquely identify all the OIDs in the set.
    */
  def git_oid_shorten_add(os: Ptr[git_oid_shorten], text_id: CString): CInt =
    extern

  /** Free an OID shortener instance
    */
  def git_oid_shorten_free(os: Ptr[git_oid_shorten]): Unit = extern

  /** Create a new OID shortener.
    */
  def git_oid_shorten_new(min_length: size_t): Ptr[git_oid_shorten] = extern

  /** Compare an oid to an hex formatted object id.
    */
  def git_oid_strcmp(id: Ptr[git_oid], str: CString): CInt = extern

  /** Check if an oid equals an hex formatted object id.
    */
  def git_oid_streq(id: Ptr[git_oid], str: CString): CInt = extern

  /** Format a git_oid into a buffer as a hex format c-string.
    */
  def git_oid_tostr(out: CString, n: size_t, id: Ptr[git_oid]): CString = extern

  /** Format a git_oid into a statically allocated c-string.
    */
  def git_oid_tostr_s(oid: Ptr[git_oid]): CString = extern

  /** Free the object IDs contained in an oid_array. This method should be
    * called on `git_oidarray` objects that were provided by the library. Not
    * doing so will result in a memory leak.
    */
  def git_oidarray_dispose(array: Ptr[git_oidarray]): Unit = extern

  /** Free the memory referred to by the git_oidarray. This is an alias of
    * `git_oidarray_dispose` and is preserved for backward compatibility.
    */
  def git_oidarray_free(array: Ptr[git_oidarray]): Unit = extern

  /** Create the new pack and pass each object to the callback
    */
  def git_packbuilder_foreach(
      pb: Ptr[git_packbuilder],
      cb: git_packbuilder_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Free the packbuilder and all associated data
    */
  def git_packbuilder_free(pb: Ptr[git_packbuilder]): Unit = extern

  /** Get the packfile's hash
    */
  def git_packbuilder_hash(pb: Ptr[git_packbuilder]): Ptr[git_oid] = extern

  /** Insert a single object
    */
  def git_packbuilder_insert(
      pb: Ptr[git_packbuilder],
      id: Ptr[git_oid],
      name: CString
  ): CInt = extern

  /** Insert a commit object
    */
  def git_packbuilder_insert_commit(
      pb: Ptr[git_packbuilder],
      id: Ptr[git_oid]
  ): CInt = extern

  /** Recursively insert an object and its referenced objects
    */
  def git_packbuilder_insert_recur(
      pb: Ptr[git_packbuilder],
      id: Ptr[git_oid],
      name: CString
  ): CInt = extern

  /** Insert a root tree object
    */
  def git_packbuilder_insert_tree(
      pb: Ptr[git_packbuilder],
      id: Ptr[git_oid]
  ): CInt = extern

  /** Insert objects as given by the walk
    */
  def git_packbuilder_insert_walk(
      pb: Ptr[git_packbuilder],
      walk: Ptr[git_revwalk]
  ): CInt = extern

  /** Get the unique name for the resulting packfile.
    */
  def git_packbuilder_name(pb: Ptr[git_packbuilder]): CString = extern

  /** Initialize a new packbuilder
    */
  def git_packbuilder_new(
      out: Ptr[Ptr[git_packbuilder]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Get the total number of objects the packbuilder will write out
    */
  def git_packbuilder_object_count(pb: Ptr[git_packbuilder]): size_t = extern

  /** Set the callbacks for a packbuilder
    */
  def git_packbuilder_set_callbacks(
      pb: Ptr[git_packbuilder],
      progress_cb: git_packbuilder_progress,
      progress_cb_payload: Ptr[Byte]
  ): CInt = extern

  /** Set number of threads to spawn
    */
  def git_packbuilder_set_threads(
      pb: Ptr[git_packbuilder],
      n: CUnsignedInt
  ): CUnsignedInt = extern

  /** Write the new pack and corresponding index file to path.
    */
  def git_packbuilder_write(
      pb: Ptr[git_packbuilder],
      path: CString,
      mode: CUnsignedInt,
      progress_cb: git_indexer_progress_cb,
      progress_cb_payload: Ptr[Byte]
  ): CInt = extern

  /** Write the contents of the packfile to an in-memory buffer
    */
  def git_packbuilder_write_buf(
      buf: Ptr[git_buf],
      pb: Ptr[git_packbuilder]
  ): CInt = extern

  /** Get the number of objects the packbuilder has already written out
    */
  def git_packbuilder_written(pb: Ptr[git_packbuilder]): size_t = extern

  /** Free a git_patch object.
    */
  def git_patch_free(patch: Ptr[git_patch]): Unit = extern

  /** Directly generate a patch from the difference between a blob and a buffer.
    */
  def git_patch_from_blob_and_buffer(
      out: Ptr[Ptr[git_patch]],
      old_blob: Ptr[git_blob],
      old_as_path: CString,
      buffer: Ptr[Byte],
      buffer_len: size_t,
      buffer_as_path: CString,
      opts: Ptr[git_diff_options]
  ): CInt = extern

  /** Directly generate a patch from the difference between two blobs.
    */
  def git_patch_from_blobs(
      out: Ptr[Ptr[git_patch]],
      old_blob: Ptr[git_blob],
      old_as_path: CString,
      new_blob: Ptr[git_blob],
      new_as_path: CString,
      opts: Ptr[git_diff_options]
  ): CInt = extern

  /** Directly generate a patch from the difference between two buffers.
    */
  def git_patch_from_buffers(
      out: Ptr[Ptr[git_patch]],
      old_buffer: Ptr[Byte],
      old_len: size_t,
      old_as_path: CString,
      new_buffer: Ptr[Byte],
      new_len: size_t,
      new_as_path: CString,
      opts: Ptr[git_diff_options]
  ): CInt = extern

  /** Return a patch for an entry in the diff list.
    */
  def git_patch_from_diff(
      out: Ptr[Ptr[git_patch]],
      diff: Ptr[git_diff],
      idx: size_t
  ): CInt = extern

  /** Get the delta associated with a patch. This delta points to internal data
    * and you do not have to release it when you are done with it.
    */
  def git_patch_get_delta(patch: Ptr[git_patch]): Ptr[git_diff_delta] = extern

  /** Get the information about a hunk in a patch
    */
  def git_patch_get_hunk(
      out: Ptr[Ptr[git_diff_hunk]],
      lines_in_hunk: Ptr[size_t],
      patch: Ptr[git_patch],
      hunk_idx: size_t
  ): CInt = extern

  /** Get data about a line in a hunk of a patch.
    */
  def git_patch_get_line_in_hunk(
      out: Ptr[Ptr[git_diff_line]],
      patch: Ptr[git_patch],
      hunk_idx: size_t,
      line_of_hunk: size_t
  ): CInt = extern

  /** Get line counts of each type in a patch.
    */
  def git_patch_line_stats(
      total_context: Ptr[size_t],
      total_additions: Ptr[size_t],
      total_deletions: Ptr[size_t],
      patch: Ptr[git_patch]
  ): CInt = extern

  /** Get the number of hunks in a patch
    */
  def git_patch_num_hunks(patch: Ptr[git_patch]): size_t = extern

  /** Get the number of lines in a hunk.
    */
  def git_patch_num_lines_in_hunk(
      patch: Ptr[git_patch],
      hunk_idx: size_t
  ): CInt = extern

  /** Get the repository associated with this patch. May be NULL.
    */
  def git_patch_owner(patch: Ptr[git_patch]): Ptr[git_repository] = extern

  /** Serialize the patch to text via callback.
    */
  def git_patch_print(
      patch: Ptr[git_patch],
      print_cb: git_diff_line_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Look up size of patch diff data in bytes
    */
  def git_patch_size(
      patch: Ptr[git_patch],
      include_context: CInt,
      include_hunk_headers: CInt,
      include_file_headers: CInt
  ): size_t = extern

  /** Get the content of a patch as a single diff text.
    */
  def git_patch_to_buf(out: Ptr[git_buf], patch: Ptr[git_patch]): CInt = extern

  /** Free a pathspec
    */
  def git_pathspec_free(ps: Ptr[git_pathspec]): Unit = extern

  /** Match a pathspec against files in a diff list.
    */
  def git_pathspec_match_diff(
      out: Ptr[Ptr[git_pathspec_match_list]],
      diff: Ptr[git_diff],
      flags: uint32_t,
      ps: Ptr[git_pathspec]
  ): CInt = extern

  /** Match a pathspec against entries in an index.
    */
  def git_pathspec_match_index(
      out: Ptr[Ptr[git_pathspec_match_list]],
      index: Ptr[git_index],
      flags: uint32_t,
      ps: Ptr[git_pathspec]
  ): CInt = extern

  /** Get a matching diff delta by position.
    */
  def git_pathspec_match_list_diff_entry(
      m: Ptr[git_pathspec_match_list],
      pos: size_t
  ): Ptr[git_diff_delta] = extern

  /** Get a matching filename by position.
    */
  def git_pathspec_match_list_entry(
      m: Ptr[git_pathspec_match_list],
      pos: size_t
  ): CString = extern

  /** Get the number of items in a match list.
    */
  def git_pathspec_match_list_entrycount(
      m: Ptr[git_pathspec_match_list]
  ): size_t = extern

  /** Get an original pathspec string that had no matches.
    */
  def git_pathspec_match_list_failed_entry(
      m: Ptr[git_pathspec_match_list],
      pos: size_t
  ): CString = extern

  /** Get the number of pathspec items that did not match.
    */
  def git_pathspec_match_list_failed_entrycount(
      m: Ptr[git_pathspec_match_list]
  ): size_t = extern

  /** Free memory associates with a git_pathspec_match_list
    */
  def git_pathspec_match_list_free(m: Ptr[git_pathspec_match_list]): Unit =
    extern

  /** Match a pathspec against files in a tree.
    */
  def git_pathspec_match_tree(
      out: Ptr[Ptr[git_pathspec_match_list]],
      tree: Ptr[git_tree],
      flags: uint32_t,
      ps: Ptr[git_pathspec]
  ): CInt = extern

  /** Match a pathspec against the working directory of a repository.
    */
  def git_pathspec_match_workdir(
      out: Ptr[Ptr[git_pathspec_match_list]],
      repo: Ptr[git_repository],
      flags: uint32_t,
      ps: Ptr[git_pathspec]
  ): CInt = extern

  /** Try to match a path against a pathspec
    */
  def git_pathspec_matches_path(
      ps: Ptr[git_pathspec],
      flags: uint32_t,
      path: CString
  ): CInt = extern

  /** Compile a pathspec
    */
  def git_pathspec_new(
      out: Ptr[Ptr[git_pathspec]],
      pathspec: Ptr[git_strarray]
  ): CInt = extern

  /** */
  def git_proxy_init_options(
      opts: Ptr[git_proxy_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_proxy_options structure
    */
  def git_proxy_options_init(
      opts: Ptr[git_proxy_options],
      version: CUnsignedInt
  ): CInt = extern

  /** */
  def git_push_init_options(
      opts: Ptr[git_push_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_push_options structure
    */
  def git_push_options_init(
      opts: Ptr[git_push_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Aborts a rebase that is currently in progress, resetting the repository
    * and working directory to their state before rebase began.
    */
  def git_rebase_abort(rebase: Ptr[git_rebase]): CInt = extern

  /** Commits the current patch. You must have resolved any conflicts that were
    * introduced during the patch application from the `git_rebase_next`
    * invocation.
    */
  def git_rebase_commit(
      id: Ptr[git_oid],
      rebase: Ptr[git_rebase],
      author: Ptr[git_signature],
      committer: Ptr[git_signature],
      message_encoding: CString,
      message: CString
  ): CInt = extern

  /** Finishes a rebase that is currently in progress once all patches have been
    * applied.
    */
  def git_rebase_finish(
      rebase: Ptr[git_rebase],
      signature: Ptr[git_signature]
  ): CInt = extern

  /** Frees the `git_rebase` object.
    */
  def git_rebase_free(rebase: Ptr[git_rebase]): Unit = extern

  /** Initializes a rebase operation to rebase the changes in `branch` relative
    * to `upstream` onto another branch. To begin the rebase process, call
    * `git_rebase_next`. When you have finished with this object, call
    * `git_rebase_free`.
    */
  def git_rebase_init(
      out: Ptr[Ptr[git_rebase]],
      repo: Ptr[git_repository],
      branch: Ptr[git_annotated_commit],
      upstream: Ptr[git_annotated_commit],
      onto: Ptr[git_annotated_commit],
      opts: Ptr[git_rebase_options]
  ): CInt = extern

  /** */
  def git_rebase_init_options(
      opts: Ptr[git_rebase_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Gets the index produced by the last operation, which is the result of
    * `git_rebase_next` and which will be committed by the next invocation of
    * `git_rebase_commit`. This is useful for resolving conflicts in an
    * in-memory rebase before committing them. You must call `git_index_free`
    * when you are finished with this.
    */
  def git_rebase_inmemory_index(
      index: Ptr[Ptr[git_index]],
      rebase: Ptr[git_rebase]
  ): CInt = extern

  /** Performs the next rebase operation and returns the information about it.
    * If the operation is one that applies a patch (which is any operation
    * except GIT_REBASE_OPERATION_EXEC) then the patch will be applied and the
    * index and working directory will be updated with the changes. If there are
    * conflicts, you will need to address those before committing the changes.
    */
  def git_rebase_next(
      operation: Ptr[Ptr[git_rebase_operation]],
      rebase: Ptr[git_rebase]
  ): CInt = extern

  /** Gets the `onto` id for merge rebases.
    */
  def git_rebase_onto_id(rebase: Ptr[git_rebase]): Ptr[git_oid] = extern

  /** Gets the `onto` ref name for merge rebases.
    */
  def git_rebase_onto_name(rebase: Ptr[git_rebase]): CString = extern

  /** Opens an existing rebase that was previously started by either an
    * invocation of `git_rebase_init` or by another client.
    */
  def git_rebase_open(
      out: Ptr[Ptr[git_rebase]],
      repo: Ptr[git_repository],
      opts: Ptr[git_rebase_options]
  ): CInt = extern

  /** Gets the rebase operation specified by the given index.
    */
  def git_rebase_operation_byindex(
      rebase: Ptr[git_rebase],
      idx: size_t
  ): Ptr[git_rebase_operation] = extern

  /** Gets the index of the rebase operation that is currently being applied. If
    * the first operation has not yet been applied (because you have called
    * `init` but not yet `next`) then this returns `GIT_REBASE_NO_OPERATION`.
    */
  def git_rebase_operation_current(rebase: Ptr[git_rebase]): size_t = extern

  /** Gets the count of rebase operations that are to be applied.
    */
  def git_rebase_operation_entrycount(rebase: Ptr[git_rebase]): size_t = extern

  /** Initialize git_rebase_options structure
    */
  def git_rebase_options_init(
      opts: Ptr[git_rebase_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Gets the original `HEAD` id for merge rebases.
    */
  def git_rebase_orig_head_id(rebase: Ptr[git_rebase]): Ptr[git_oid] = extern

  /** Gets the original `HEAD` ref name for merge rebases.
    */
  def git_rebase_orig_head_name(rebase: Ptr[git_rebase]): CString = extern

  /** Suggests that the given refdb compress or optimize its references. This
    * mechanism is implementation specific. For on-disk reference databases, for
    * example, this may pack all loose references.
    */
  def git_refdb_compress(refdb: Ptr[git_refdb]): CInt = extern

  /** Close an open reference database.
    */
  def git_refdb_free(refdb: Ptr[git_refdb]): Unit = extern

  /** Create a new reference database with no backends.
    */
  def git_refdb_new(out: Ptr[Ptr[git_refdb]], repo: Ptr[git_repository]): CInt =
    extern

  /** Create a new reference database and automatically add the default
    * backends:
    */
  def git_refdb_open(
      out: Ptr[Ptr[git_refdb]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Compare two references.
    */
  def git_reference_cmp(
      ref1: Ptr[git_reference],
      ref2: Ptr[git_reference]
  ): CInt = extern

  /** Create a new direct reference.
    */
  def git_reference_create(
      out: Ptr[Ptr[git_reference]],
      repo: Ptr[git_repository],
      name: CString,
      id: Ptr[git_oid],
      force: CInt,
      log_message: CString
  ): CInt = extern

  /** Conditionally create new direct reference
    */
  def git_reference_create_matching(
      out: Ptr[Ptr[git_reference]],
      repo: Ptr[git_repository],
      name: CString,
      id: Ptr[git_oid],
      force: CInt,
      current_id: Ptr[git_oid],
      log_message: CString
  ): CInt = extern

  /** Delete an existing reference.
    */
  def git_reference_delete(ref: Ptr[git_reference]): CInt = extern

  /** Create a copy of an existing reference.
    */
  def git_reference_dup(
      dest: Ptr[Ptr[git_reference]],
      source: Ptr[git_reference]
  ): CInt = extern

  /** Lookup a reference by DWIMing its short name
    */
  def git_reference_dwim(
      out: Ptr[Ptr[git_reference]],
      repo: Ptr[git_repository],
      shorthand: CString
  ): CInt = extern

  /** Ensure there is a reflog for a particular reference.
    */
  def git_reference_ensure_log(
      repo: Ptr[git_repository],
      refname: CString
  ): CInt = extern

  /** Perform a callback on each reference in the repository.
    */
  def git_reference_foreach(
      repo: Ptr[git_repository],
      callback: git_reference_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Perform a callback on each reference in the repository whose name matches
    * the given pattern.
    */
  def git_reference_foreach_glob(
      repo: Ptr[git_repository],
      glob: CString,
      callback: git_reference_foreach_name_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Perform a callback on the fully-qualified name of each reference.
    */
  def git_reference_foreach_name(
      repo: Ptr[git_repository],
      callback: git_reference_foreach_name_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Free the given reference.
    */
  def git_reference_free(ref: Ptr[git_reference]): Unit = extern

  /** Check if a reflog exists for the specified reference.
    */
  def git_reference_has_log(repo: Ptr[git_repository], refname: CString): CInt =
    extern

  /** Check if a reference is a local branch.
    */
  def git_reference_is_branch(ref: Ptr[git_reference]): CInt = extern

  /** Check if a reference is a note
    */
  def git_reference_is_note(ref: Ptr[git_reference]): CInt = extern

  /** Check if a reference is a remote tracking branch
    */
  def git_reference_is_remote(ref: Ptr[git_reference]): CInt = extern

  /** Check if a reference is a tag
    */
  def git_reference_is_tag(ref: Ptr[git_reference]): CInt = extern

  /** Ensure the reference name is well-formed.
    */
  def git_reference_is_valid_name(refname: CString): CInt = extern

  /** Free the iterator and its associated resources
    */
  def git_reference_iterator_free(iter: Ptr[git_reference_iterator]): Unit =
    extern

  /** Create an iterator for the repo's references that match the specified glob
    */
  def git_reference_iterator_glob_new(
      out: Ptr[Ptr[git_reference_iterator]],
      repo: Ptr[git_repository],
      glob: CString
  ): CInt = extern

  /** Create an iterator for the repo's references
    */
  def git_reference_iterator_new(
      out: Ptr[Ptr[git_reference_iterator]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Fill a list with all the references that can be found in a repository.
    */
  def git_reference_list(
      array: Ptr[git_strarray],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Lookup a reference by name in a repository.
    */
  def git_reference_lookup(
      out: Ptr[Ptr[git_reference]],
      repo: Ptr[git_repository],
      name: CString
  ): CInt = extern

  /** Get the full name of a reference.
    */
  def git_reference_name(ref: Ptr[git_reference]): CString = extern

  /** Ensure the reference name is well-formed.
    */
  def git_reference_name_is_valid(valid: Ptr[CInt], refname: CString): CInt =
    extern

  /** Lookup a reference by name and resolve immediately to OID.
    */
  def git_reference_name_to_id(
      out: Ptr[git_oid],
      repo: Ptr[git_repository],
      name: CString
  ): CInt = extern

  /** Get the next reference
    */
  def git_reference_next(
      out: Ptr[Ptr[git_reference]],
      iter: Ptr[git_reference_iterator]
  ): CInt = extern

  /** Get the next reference's name
    */
  def git_reference_next_name(
      out: Ptr[CString],
      iter: Ptr[git_reference_iterator]
  ): CInt = extern

  /** Normalize reference name and check validity.
    */
  def git_reference_normalize_name(
      buffer_out: CString,
      buffer_size: size_t,
      name: CString,
      flags: CUnsignedInt
  ): CInt = extern

  /** Get the repository where a reference resides.
    */
  def git_reference_owner(ref: Ptr[git_reference]): Ptr[git_repository] = extern

  /** Recursively peel reference until object of the specified type is found.
    */
  def git_reference_peel(
      out: Ptr[Ptr[git_object]],
      ref: Ptr[git_reference],
      `type`: git_object_t
  ): CInt = extern

  /** Delete an existing reference by name
    */
  def git_reference_remove(repo: Ptr[git_repository], name: CString): CInt =
    extern

  /** Rename an existing reference.
    */
  def git_reference_rename(
      new_ref: Ptr[Ptr[git_reference]],
      ref: Ptr[git_reference],
      new_name: CString,
      force: CInt,
      log_message: CString
  ): CInt = extern

  /** Resolve a symbolic reference to a direct reference.
    */
  def git_reference_resolve(
      out: Ptr[Ptr[git_reference]],
      ref: Ptr[git_reference]
  ): CInt = extern

  /** Conditionally create a new reference with the same name as the given
    * reference but a different OID target. The reference must be a direct
    * reference, otherwise this will fail.
    */
  def git_reference_set_target(
      out: Ptr[Ptr[git_reference]],
      ref: Ptr[git_reference],
      id: Ptr[git_oid],
      log_message: CString
  ): CInt = extern

  /** Get the reference's short name
    */
  def git_reference_shorthand(ref: Ptr[git_reference]): CString = extern

  /** Create a new symbolic reference.
    */
  def git_reference_symbolic_create(
      out: Ptr[Ptr[git_reference]],
      repo: Ptr[git_repository],
      name: CString,
      target: CString,
      force: CInt,
      log_message: CString
  ): CInt = extern

  /** Conditionally create a new symbolic reference.
    */
  def git_reference_symbolic_create_matching(
      out: Ptr[Ptr[git_reference]],
      repo: Ptr[git_repository],
      name: CString,
      target: CString,
      force: CInt,
      current_value: CString,
      log_message: CString
  ): CInt = extern

  /** Create a new reference with the same name as the given reference but a
    * different symbolic target. The reference must be a symbolic reference,
    * otherwise this will fail.
    */
  def git_reference_symbolic_set_target(
      out: Ptr[Ptr[git_reference]],
      ref: Ptr[git_reference],
      target: CString,
      log_message: CString
  ): CInt = extern

  /** Get full name to the reference pointed to by a symbolic reference.
    */
  def git_reference_symbolic_target(ref: Ptr[git_reference]): CString = extern

  /** Get the OID pointed to by a direct reference.
    */
  def git_reference_target(ref: Ptr[git_reference]): Ptr[git_oid] = extern

  /** Return the peeled OID target of this reference.
    */
  def git_reference_target_peel(ref: Ptr[git_reference]): Ptr[git_oid] = extern

  /** Get the type of a reference.
    */
  def git_reference_type(ref: Ptr[git_reference]): git_reference_t = extern

  /** Add a new entry to the in-memory reflog.
    */
  def git_reflog_append(
      reflog: Ptr[git_reflog],
      id: Ptr[git_oid],
      committer: Ptr[git_signature],
      msg: CString
  ): CInt = extern

  /** Delete the reflog for the given reference
    */
  def git_reflog_delete(repo: Ptr[git_repository], name: CString): CInt = extern

  /** Remove an entry from the reflog by its index
    */
  def git_reflog_drop(
      reflog: Ptr[git_reflog],
      idx: size_t,
      rewrite_previous_entry: CInt
  ): CInt = extern

  /** Lookup an entry by its index
    */
  def git_reflog_entry_byindex(
      reflog: Ptr[git_reflog],
      idx: size_t
  ): Ptr[git_reflog_entry] = extern

  /** Get the committer of this entry
    */
  def git_reflog_entry_committer(
      entry: Ptr[git_reflog_entry]
  ): Ptr[git_signature] = extern

  /** Get the new oid
    */
  def git_reflog_entry_id_new(entry: Ptr[git_reflog_entry]): Ptr[git_oid] =
    extern

  /** Get the old oid
    */
  def git_reflog_entry_id_old(entry: Ptr[git_reflog_entry]): Ptr[git_oid] =
    extern

  /** Get the log message
    */
  def git_reflog_entry_message(entry: Ptr[git_reflog_entry]): CString = extern

  /** Get the number of log entries in a reflog
    */
  def git_reflog_entrycount(reflog: Ptr[git_reflog]): size_t = extern

  /** Free the reflog
    */
  def git_reflog_free(reflog: Ptr[git_reflog]): Unit = extern

  /** Read the reflog for the given reference
    */
  def git_reflog_read(
      out: Ptr[Ptr[git_reflog]],
      repo: Ptr[git_repository],
      name: CString
  ): CInt = extern

  /** Rename a reflog
    */
  def git_reflog_rename(
      repo: Ptr[git_repository],
      old_name: CString,
      name: CString
  ): CInt = extern

  /** Write an existing in-memory reflog object back to disk using an atomic
    * file lock.
    */
  def git_reflog_write(reflog: Ptr[git_reflog]): CInt = extern

  /** Get the refspec's direction.
    */
  def git_refspec_direction(spec: Ptr[git_refspec]): git_direction = extern

  /** Get the destination specifier
    */
  def git_refspec_dst(refspec: Ptr[git_refspec]): CString = extern

  /** Check if a refspec's destination descriptor matches a reference
    */
  def git_refspec_dst_matches(
      refspec: Ptr[git_refspec],
      refname: CString
  ): CInt = extern

  /** Get the force update setting
    */
  def git_refspec_force(refspec: Ptr[git_refspec]): CInt = extern

  /** Free a refspec object which has been created by git_refspec_parse
    */
  def git_refspec_free(refspec: Ptr[git_refspec]): Unit = extern

  /** Parse a given refspec string
    */
  def git_refspec_parse(
      refspec: Ptr[Ptr[git_refspec]],
      input: CString,
      is_fetch: CInt
  ): CInt = extern

  /** Transform a target reference to its source reference following the
    * refspec's rules
    */
  def git_refspec_rtransform(
      out: Ptr[git_buf],
      spec: Ptr[git_refspec],
      name: CString
  ): CInt = extern

  /** Get the source specifier
    */
  def git_refspec_src(refspec: Ptr[git_refspec]): CString = extern

  /** Check if a refspec's source descriptor matches a reference
    */
  def git_refspec_src_matches(
      refspec: Ptr[git_refspec],
      refname: CString
  ): CInt = extern

  /** Get the refspec's string
    */
  def git_refspec_string(refspec: Ptr[git_refspec]): CString = extern

  /** Transform a reference to its target following the refspec's rules
    */
  def git_refspec_transform(
      out: Ptr[git_buf],
      spec: Ptr[git_refspec],
      name: CString
  ): CInt = extern

  /** Add a fetch refspec to the remote's configuration
    */
  def git_remote_add_fetch(
      repo: Ptr[git_repository],
      remote: CString,
      refspec: CString
  ): CInt = extern

  /** Add a push refspec to the remote's configuration
    */
  def git_remote_add_push(
      repo: Ptr[git_repository],
      remote: CString,
      refspec: CString
  ): CInt = extern

  /** Retrieve the tag auto-follow setting
    */
  def git_remote_autotag(remote: Ptr[git_remote]): git_remote_autotag_option_t =
    extern

  /** Open a connection to a remote.
    */
  def git_remote_connect(
      remote: Ptr[git_remote],
      direction: git_direction,
      callbacks: Ptr[git_remote_callbacks],
      proxy_opts: Ptr[git_proxy_options],
      custom_headers: Ptr[git_strarray]
  ): CInt = extern

  /** Open a connection to a remote with extended options.
    */
  def git_remote_connect_ext(
      remote: Ptr[git_remote],
      direction: git_direction,
      opts: Ptr[git_remote_connect_options]
  ): CInt = extern

  /** Initialize git_remote_connect_options structure.
    */
  def git_remote_connect_options_init(
      opts: Ptr[git_remote_connect_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Check whether the remote is connected
    */
  def git_remote_connected(remote: Ptr[git_remote]): CInt = extern

  /** Add a remote with the default fetch refspec to the repository's
    * configuration.
    */
  def git_remote_create(
      out: Ptr[Ptr[git_remote]],
      repo: Ptr[git_repository],
      name: CString,
      url: CString
  ): CInt = extern

  /** Create an anonymous remote
    */
  def git_remote_create_anonymous(
      out: Ptr[Ptr[git_remote]],
      repo: Ptr[git_repository],
      url: CString
  ): CInt = extern

  /** Create a remote without a connected local repo
    */
  def git_remote_create_detached(
      out: Ptr[Ptr[git_remote]],
      url: CString
  ): CInt = extern

  /** */
  def git_remote_create_init_options(
      opts: Ptr[git_remote_create_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_remote_create_options structure
    */
  def git_remote_create_options_init(
      opts: Ptr[git_remote_create_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Add a remote with the provided fetch refspec (or default if NULL) to the
    * repository's configuration.
    */
  def git_remote_create_with_fetchspec(
      out: Ptr[Ptr[git_remote]],
      repo: Ptr[git_repository],
      name: CString,
      url: CString,
      fetch: CString
  ): CInt = extern

  /** Create a remote, with options.
    */
  def git_remote_create_with_opts(
      out: Ptr[Ptr[git_remote]],
      url: CString,
      opts: Ptr[git_remote_create_options]
  ): CInt = extern

  /** Retrieve the name of the remote's default branch
    */
  def git_remote_default_branch(
      out: Ptr[git_buf],
      remote: Ptr[git_remote]
  ): CInt = extern

  /** Delete an existing persisted remote.
    */
  def git_remote_delete(repo: Ptr[git_repository], name: CString): CInt = extern

  /** Disconnect from the remote
    */
  def git_remote_disconnect(remote: Ptr[git_remote]): CInt = extern

  /** Download and index the packfile.
    */
  def git_remote_download(
      remote: Ptr[git_remote],
      refspecs: Ptr[git_strarray],
      opts: Ptr[git_fetch_options]
  ): CInt = extern

  /** Create a copy of an existing remote. All internal strings are also
    * duplicated. Callbacks are not duplicated.
    */
  def git_remote_dup(
      dest: Ptr[Ptr[git_remote]],
      source: Ptr[git_remote]
  ): CInt = extern

  /** Download new data and update tips.
    */
  def git_remote_fetch(
      remote: Ptr[git_remote],
      refspecs: Ptr[git_strarray],
      opts: Ptr[git_fetch_options],
      reflog_message: CString
  ): CInt = extern

  /** Free the memory associated with a remote
    */
  def git_remote_free(remote: Ptr[git_remote]): Unit = extern

  /** Get the remote's list of fetch refspecs
    */
  def git_remote_get_fetch_refspecs(
      array: Ptr[git_strarray],
      remote: Ptr[git_remote]
  ): CInt = extern

  /** Get the remote's list of push refspecs
    */
  def git_remote_get_push_refspecs(
      array: Ptr[git_strarray],
      remote: Ptr[git_remote]
  ): CInt = extern

  /** Get a refspec from the remote
    */
  def git_remote_get_refspec(
      remote: Ptr[git_remote],
      n: size_t
  ): Ptr[git_refspec] = extern

  /** Initializes a `git_remote_callbacks` with default values. Equivalent to
    * creating an instance with GIT_REMOTE_CALLBACKS_INIT.
    */
  def git_remote_init_callbacks(
      opts: Ptr[git_remote_callbacks],
      version: CUnsignedInt
  ): CInt = extern

  /** Ensure the remote name is well-formed.
    */
  def git_remote_is_valid_name(remote_name: CString): CInt = extern

  /** Get a list of the configured remotes for a repo
    */
  def git_remote_list(out: Ptr[git_strarray], repo: Ptr[git_repository]): CInt =
    extern

  /** Get the information for a particular remote
    */
  def git_remote_lookup(
      out: Ptr[Ptr[git_remote]],
      repo: Ptr[git_repository],
      name: CString
  ): CInt = extern

  /** Get the remote repository's reference advertisement list
    */
  def git_remote_ls(
      out: Ptr[Ptr[Ptr[git_remote_head]]],
      size: Ptr[size_t],
      remote: Ptr[git_remote]
  ): CInt = extern

  /** Get the remote's name
    */
  def git_remote_name(remote: Ptr[git_remote]): CString = extern

  /** Ensure the remote name is well-formed.
    */
  def git_remote_name_is_valid(valid: Ptr[CInt], remote_name: CString): CInt =
    extern

  /** Get the remote's repository
    */
  def git_remote_owner(remote: Ptr[git_remote]): Ptr[git_repository] = extern

  /** Prune tracking refs that are no longer present on remote.
    */
  def git_remote_prune(
      remote: Ptr[git_remote],
      callbacks: Ptr[git_remote_callbacks]
  ): CInt = extern

  /** Retrieve the ref-prune setting
    */
  def git_remote_prune_refs(remote: Ptr[git_remote]): CInt = extern

  /** Perform a push.
    */
  def git_remote_push(
      remote: Ptr[git_remote],
      refspecs: Ptr[git_strarray],
      opts: Ptr[git_push_options]
  ): CInt = extern

  /** Get the remote's url for pushing.
    */
  def git_remote_pushurl(remote: Ptr[git_remote]): CString = extern

  /** Get the number of refspecs for a remote
    */
  def git_remote_refspec_count(remote: Ptr[git_remote]): size_t = extern

  /** Give the remote a new name
    */
  def git_remote_rename(
      problems: Ptr[git_strarray],
      repo: Ptr[git_repository],
      name: CString,
      new_name: CString
  ): CInt = extern

  /** Set the remote's tag following setting.
    */
  def git_remote_set_autotag(
      repo: Ptr[git_repository],
      remote: CString,
      value: git_remote_autotag_option_t
  ): CInt = extern

  /** Set the push url for this particular url instance. The URL in the
    * configuration will be ignored, and will not be changed.
    */
  def git_remote_set_instance_pushurl(
      remote: Ptr[git_remote],
      url: CString
  ): CInt = extern

  /** Set the url for this particular url instance. The URL in the configuration
    * will be ignored, and will not be changed.
    */
  def git_remote_set_instance_url(remote: Ptr[git_remote], url: CString): CInt =
    extern

  /** Set the remote's url for pushing in the configuration.
    */
  def git_remote_set_pushurl(
      repo: Ptr[git_repository],
      remote: CString,
      url: CString
  ): CInt = extern

  /** Set the remote's url in the configuration
    */
  def git_remote_set_url(
      repo: Ptr[git_repository],
      remote: CString,
      url: CString
  ): CInt = extern

  /** Get the statistics structure that is filled in by the fetch operation.
    */
  def git_remote_stats(remote: Ptr[git_remote]): Ptr[git_indexer_progress] =
    extern

  /** Cancel the operation
    */
  def git_remote_stop(remote: Ptr[git_remote]): CInt = extern

  /** Update the tips to the new state.
    */
  def git_remote_update_tips(
      remote: Ptr[git_remote],
      callbacks: Ptr[git_remote_callbacks],
      update_fetchhead: CInt,
      download_tags: git_remote_autotag_option_t,
      reflog_message: CString
  ): CInt = extern

  /** Create a packfile and send it to the server
    */
  def git_remote_upload(
      remote: Ptr[git_remote],
      refspecs: Ptr[git_strarray],
      opts: Ptr[git_push_options]
  ): CInt = extern

  /** Get the remote's url
    */
  def git_remote_url(remote: Ptr[git_remote]): CString = extern

  /** Get the path of the shared common directory for this repository.
    */
  def git_repository_commondir(repo: Ptr[git_repository]): CString = extern

  /** Get the configuration file for this repository.
    */
  def git_repository_config(
      out: Ptr[Ptr[git_config]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Get a snapshot of the repository's configuration
    */
  def git_repository_config_snapshot(
      out: Ptr[Ptr[git_config]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Detach the HEAD.
    */
  def git_repository_detach_head(repo: Ptr[git_repository]): CInt = extern

  /** Look for a git repository and copy its path in the given buffer. The
    * lookup start from base_path and walk across parent directories if nothing
    * has been found. The lookup ends when the first repository is found, or
    * when reaching a directory referenced in ceiling_dirs or when the
    * filesystem changes (in case across_fs is true).
    */
  def git_repository_discover(
      out: Ptr[git_buf],
      start_path: CString,
      across_fs: CInt,
      ceiling_dirs: CString
  ): CInt = extern

  /** Invoke 'callback' for each entry in the given FETCH_HEAD file.
    */
  def git_repository_fetchhead_foreach(
      repo: Ptr[git_repository],
      callback: git_repository_fetchhead_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Free a previously allocated repository
    */
  def git_repository_free(repo: Ptr[git_repository]): Unit = extern

  /** Get the currently active namespace for this repository
    */
  def git_repository_get_namespace(repo: Ptr[git_repository]): CString = extern

  /** Calculate hash of file using repository filtering rules.
    */
  def git_repository_hashfile(
      out: Ptr[git_oid],
      repo: Ptr[git_repository],
      path: CString,
      `type`: git_object_t,
      as_path: CString
  ): CInt = extern

  /** Retrieve and resolve the reference pointed at by HEAD.
    */
  def git_repository_head(
      out: Ptr[Ptr[git_reference]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Check if a repository's HEAD is detached
    */
  def git_repository_head_detached(repo: Ptr[git_repository]): CInt = extern

  /** Check if a worktree's HEAD is detached
    */
  def git_repository_head_detached_for_worktree(
      repo: Ptr[git_repository],
      name: CString
  ): CInt = extern

  /** Retrieve the referenced HEAD for the worktree
    */
  def git_repository_head_for_worktree(
      out: Ptr[Ptr[git_reference]],
      repo: Ptr[git_repository],
      name: CString
  ): CInt = extern

  /** Check if the current branch is unborn
    */
  def git_repository_head_unborn(repo: Ptr[git_repository]): CInt = extern

  /** Retrieve the configured identity to use for reflogs
    */
  def git_repository_ident(
      name: Ptr[CString],
      email: Ptr[CString],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Get the Index file for this repository.
    */
  def git_repository_index(
      out: Ptr[Ptr[git_index]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Creates a new Git repository in the given folder.
    */
  def git_repository_init(
      out: Ptr[Ptr[git_repository]],
      path: CString,
      is_bare: CUnsignedInt
  ): CInt = extern

  /** Create a new Git repository in the given folder with extended controls.
    */
  def git_repository_init_ext(
      out: Ptr[Ptr[git_repository]],
      repo_path: CString,
      opts: Ptr[git_repository_init_options]
  ): CInt = extern

  /** */
  def git_repository_init_init_options(
      opts: Ptr[git_repository_init_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_repository_init_options structure
    */
  def git_repository_init_options_init(
      opts: Ptr[git_repository_init_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Check if a repository is bare
    */
  def git_repository_is_bare(repo: Ptr[git_repository]): CInt = extern

  /** Check if a repository is empty
    */
  def git_repository_is_empty(repo: Ptr[git_repository]): CInt = extern

  /** Determine if the repository was a shallow clone
    */
  def git_repository_is_shallow(repo: Ptr[git_repository]): CInt = extern

  /** Check if a repository is a linked work tree
    */
  def git_repository_is_worktree(repo: Ptr[git_repository]): CInt = extern

  /** Get the location of a specific repository file or directory
    */
  def git_repository_item_path(
      out: Ptr[git_buf],
      repo: Ptr[git_repository],
      item: git_repository_item_t
  ): CInt = extern

  /** If a merge is in progress, invoke 'callback' for each commit ID in the
    * MERGE_HEAD file.
    */
  def git_repository_mergehead_foreach(
      repo: Ptr[git_repository],
      callback: git_repository_mergehead_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Retrieve git's prepared message
    */
  def git_repository_message(
      out: Ptr[git_buf],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Remove git's prepared message.
    */
  def git_repository_message_remove(repo: Ptr[git_repository]): CInt = extern

  /** Get the Object Database for this repository.
    */
  def git_repository_odb(
      out: Ptr[Ptr[git_odb]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Gets the object type used by this repository.
    */
  def git_repository_oid_type(repo: Ptr[git_repository]): git_oid_t = extern

  /** Open a git repository.
    */
  def git_repository_open(out: Ptr[Ptr[git_repository]], path: CString): CInt =
    extern

  /** Open a bare repository on the serverside.
    */
  def git_repository_open_bare(
      out: Ptr[Ptr[git_repository]],
      bare_path: CString
  ): CInt = extern

  /** Find and open a repository with extended controls.
    */
  def git_repository_open_ext(
      out: Ptr[Ptr[git_repository]],
      path: CString,
      flags: CUnsignedInt,
      ceiling_dirs: CString
  ): CInt = extern

  /** Open working tree as a repository
    */
  def git_repository_open_from_worktree(
      out: Ptr[Ptr[git_repository]],
      wt: Ptr[git_worktree]
  ): CInt = extern

  /** Get the path of this repository
    */
  def git_repository_path(repo: Ptr[git_repository]): CString = extern

  /** Get the Reference Database Backend for this repository.
    */
  def git_repository_refdb(
      out: Ptr[Ptr[git_refdb]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Make the repository HEAD point to the specified reference.
    */
  def git_repository_set_head(
      repo: Ptr[git_repository],
      refname: CString
  ): CInt = extern

  /** Make the repository HEAD directly point to the Commit.
    */
  def git_repository_set_head_detached(
      repo: Ptr[git_repository],
      committish: Ptr[git_oid]
  ): CInt = extern

  /** Make the repository HEAD directly point to the Commit.
    */
  def git_repository_set_head_detached_from_annotated(
      repo: Ptr[git_repository],
      committish: Ptr[git_annotated_commit]
  ): CInt = extern

  /** Set the identity to be used for writing reflogs
    */
  def git_repository_set_ident(
      repo: Ptr[git_repository],
      name: CString,
      email: CString
  ): CInt = extern

  /** Sets the active namespace for this Git Repository
    */
  def git_repository_set_namespace(
      repo: Ptr[git_repository],
      nmspace: CString
  ): CInt = extern

  /** Set the path to the working directory for this repository
    */
  def git_repository_set_workdir(
      repo: Ptr[git_repository],
      workdir: CString,
      update_gitlink: CInt
  ): CInt = extern

  /** Determines the status of a git repository - ie, whether an operation
    * (merge, cherry-pick, etc) is in progress.
    */
  def git_repository_state(repo: Ptr[git_repository]): CInt = extern

  /** Remove all the metadata associated with an ongoing command like merge,
    * revert, cherry-pick, etc. For example: MERGE_HEAD, MERGE_MSG, etc.
    */
  def git_repository_state_cleanup(repo: Ptr[git_repository]): CInt = extern

  /** Get the path of the working directory for this repository
    */
  def git_repository_workdir(repo: Ptr[git_repository]): CString = extern

  /** Create a "fake" repository to wrap an object database
    */
  def git_repository_wrap_odb(
      out: Ptr[Ptr[git_repository]],
      odb: Ptr[git_odb]
  ): CInt = extern

  /** Sets the current head to the specified commit oid and optionally resets
    * the index and working tree to match.
    */
  def git_reset(
      repo: Ptr[git_repository],
      target: Ptr[git_object],
      reset_type: git_reset_t,
      checkout_opts: Ptr[git_checkout_options]
  ): CInt = extern

  /** Updates some entries in the index from the target commit tree.
    */
  def git_reset_default(
      repo: Ptr[git_repository],
      target: Ptr[git_object],
      pathspecs: Ptr[git_strarray]
  ): CInt = extern

  /** Sets the current head to the specified commit oid and optionally resets
    * the index and working tree to match.
    */
  def git_reset_from_annotated(
      repo: Ptr[git_repository],
      commit: Ptr[git_annotated_commit],
      reset_type: git_reset_t,
      checkout_opts: Ptr[git_checkout_options]
  ): CInt = extern

  /** Reverts the given commit, producing changes in the index and working
    * directory.
    */
  def git_revert(
      repo: Ptr[git_repository],
      commit: Ptr[git_commit],
      given_opts: Ptr[git_revert_options]
  ): CInt = extern

  /** Reverts the given commit against the given "our" commit, producing an
    * index that reflects the result of the revert.
    */
  def git_revert_commit(
      out: Ptr[Ptr[git_index]],
      repo: Ptr[git_repository],
      revert_commit: Ptr[git_commit],
      our_commit: Ptr[git_commit],
      mainline: CUnsignedInt,
      merge_options: Ptr[git_merge_options]
  ): CInt = extern

  /** */
  def git_revert_init_options(
      opts: Ptr[git_revert_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_revert_options structure
    */
  def git_revert_options_init(
      opts: Ptr[git_revert_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Parse a revision string for `from`, `to`, and intent.
    */
  def git_revparse(
      revspec: Ptr[git_revspec],
      repo: Ptr[git_repository],
      spec: CString
  ): CInt = extern

  /** Find a single object and intermediate reference by a revision string.
    */
  def git_revparse_ext(
      object_out: Ptr[Ptr[git_object]],
      reference_out: Ptr[Ptr[git_reference]],
      repo: Ptr[git_repository],
      spec: CString
  ): CInt = extern

  /** Find a single object, as specified by a revision string.
    */
  def git_revparse_single(
      out: Ptr[Ptr[git_object]],
      repo: Ptr[git_repository],
      spec: CString
  ): CInt = extern

  /** Adds, changes or removes a callback function to hide a commit and its
    * parents
    */
  def git_revwalk_add_hide_cb(
      walk: Ptr[git_revwalk],
      hide_cb: git_revwalk_hide_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Free a revision walker previously allocated.
    */
  def git_revwalk_free(walk: Ptr[git_revwalk]): Unit = extern

  /** Mark a commit (and its ancestors) uninteresting for the output.
    */
  def git_revwalk_hide(walk: Ptr[git_revwalk], commit_id: Ptr[git_oid]): CInt =
    extern

  /** Hide matching references.
    */
  def git_revwalk_hide_glob(walk: Ptr[git_revwalk], glob: CString): CInt =
    extern

  /** Hide the repository's HEAD
    */
  def git_revwalk_hide_head(walk: Ptr[git_revwalk]): CInt = extern

  /** Hide the OID pointed to by a reference
    */
  def git_revwalk_hide_ref(walk: Ptr[git_revwalk], refname: CString): CInt =
    extern

  /** Allocate a new revision walker to iterate through a repo.
    */
  def git_revwalk_new(
      out: Ptr[Ptr[git_revwalk]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Get the next commit from the revision walk.
    */
  def git_revwalk_next(out: Ptr[git_oid], walk: Ptr[git_revwalk]): CInt = extern

  /** Add a new root for the traversal
    */
  def git_revwalk_push(walk: Ptr[git_revwalk], id: Ptr[git_oid]): CInt = extern

  /** Push matching references
    */
  def git_revwalk_push_glob(walk: Ptr[git_revwalk], glob: CString): CInt =
    extern

  /** Push the repository's HEAD
    */
  def git_revwalk_push_head(walk: Ptr[git_revwalk]): CInt = extern

  /** Push and hide the respective endpoints of the given range.
    */
  def git_revwalk_push_range(walk: Ptr[git_revwalk], range: CString): CInt =
    extern

  /** Push the OID pointed to by a reference
    */
  def git_revwalk_push_ref(walk: Ptr[git_revwalk], refname: CString): CInt =
    extern

  /** Return the repository on which this walker is operating.
    */
  def git_revwalk_repository(walk: Ptr[git_revwalk]): Ptr[git_repository] =
    extern

  /** Reset the revision walker for reuse.
    */
  def git_revwalk_reset(walker: Ptr[git_revwalk]): CInt = extern

  /** Simplify the history by first-parent
    */
  def git_revwalk_simplify_first_parent(walk: Ptr[git_revwalk]): CInt = extern

  /** Change the sorting mode when iterating through the repository's contents.
    */
  def git_revwalk_sorting(
      walk: Ptr[git_revwalk],
      sort_mode: CUnsignedInt
  ): CInt = extern

  /** Create a new action signature with default user and now timestamp.
    */
  def git_signature_default(
      out: Ptr[Ptr[git_signature]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Create a copy of an existing signature. All internal strings are also
    * duplicated.
    */
  def git_signature_dup(
      dest: Ptr[Ptr[git_signature]],
      sig: Ptr[git_signature]
  ): CInt = extern

  /** Free an existing signature.
    */
  def git_signature_free(sig: Ptr[git_signature]): Unit = extern

  /** Create a new signature by parsing the given buffer, which is expected to
    * be in the format "Real Name <email> timestamp tzoffset", where `timestamp`
    * is the number of seconds since the Unix epoch and `tzoffset` is the
    * timezone offset in `hhmm` format (note the lack of a colon separator).
    */
  def git_signature_from_buffer(
      out: Ptr[Ptr[git_signature]],
      buf: CString
  ): CInt = extern

  /** Create a new action signature.
    */
  def git_signature_new(
      out: Ptr[Ptr[git_signature]],
      name: CString,
      email: CString,
      time: git_time_t,
      offset: CInt
  ): CInt = extern

  /** Create a new action signature with a timestamp of 'now'.
    */
  def git_signature_now(
      out: Ptr[Ptr[git_signature]],
      name: CString,
      email: CString
  ): CInt = extern

  /** Apply a single stashed state from the stash list.
    */
  def git_stash_apply(
      repo: Ptr[git_repository],
      index: size_t,
      options: Ptr[git_stash_apply_options]
  ): CInt = extern

  /** */
  def git_stash_apply_init_options(
      opts: Ptr[git_stash_apply_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_stash_apply_options structure
    */
  def git_stash_apply_options_init(
      opts: Ptr[git_stash_apply_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Remove a single stashed state from the stash list.
    */
  def git_stash_drop(repo: Ptr[git_repository], index: size_t): CInt = extern

  /** Loop over all the stashed states and issue a callback for each one.
    */
  def git_stash_foreach(
      repo: Ptr[git_repository],
      callback: git_stash_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Apply a single stashed state from the stash list and remove it from the
    * list if successful.
    */
  def git_stash_pop(
      repo: Ptr[git_repository],
      index: size_t,
      options: Ptr[git_stash_apply_options]
  ): CInt = extern

  /** Save the local modifications to a new stash.
    */
  def git_stash_save(
      out: Ptr[git_oid],
      repo: Ptr[git_repository],
      stasher: Ptr[git_signature],
      message: CString,
      flags: uint32_t
  ): CInt = extern

  /** Initialize git_stash_save_options structure
    */
  def git_stash_save_options_init(
      opts: Ptr[git_stash_save_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Save the local modifications to a new stash, with options.
    */
  def git_stash_save_with_opts(
      out: Ptr[git_oid],
      repo: Ptr[git_repository],
      opts: Ptr[git_stash_save_options]
  ): CInt = extern

  /** Get a pointer to one of the entries in the status list.
    */
  def git_status_byindex(
      statuslist: Ptr[git_status_list],
      idx: size_t
  ): Ptr[git_status_entry] = extern

  /** Get file status for a single file.
    */
  def git_status_file(
      status_flags: Ptr[CUnsignedInt],
      repo: Ptr[git_repository],
      path: CString
  ): CInt = extern

  /** Gather file statuses and run a callback for each one.
    */
  def git_status_foreach(
      repo: Ptr[git_repository],
      callback: git_status_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Gather file status information and run callbacks as requested.
    */
  def git_status_foreach_ext(
      repo: Ptr[git_repository],
      opts: Ptr[git_status_options],
      callback: git_status_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** */
  def git_status_init_options(
      opts: Ptr[git_status_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Gets the count of status entries in this list.
    */
  def git_status_list_entrycount(statuslist: Ptr[git_status_list]): size_t =
    extern

  /** Free an existing status list
    */
  def git_status_list_free(statuslist: Ptr[git_status_list]): Unit = extern

  /** Gather file status information and populate the `git_status_list`.
    */
  def git_status_list_new(
      out: Ptr[Ptr[git_status_list]],
      repo: Ptr[git_repository],
      opts: Ptr[git_status_options]
  ): CInt = extern

  /** Initialize git_status_options structure
    */
  def git_status_options_init(
      opts: Ptr[git_status_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Test if the ignore rules apply to a given file.
    */
  def git_status_should_ignore(
      ignored: Ptr[CInt],
      repo: Ptr[git_repository],
      path: CString
  ): CInt = extern

  /** Copy a string array object from source to target.
    */
  def git_strarray_copy(tgt: Ptr[git_strarray], src: Ptr[git_strarray]): CInt =
    extern

  /** Free the strings contained in a string array. This method should be called
    * on `git_strarray` objects that were provided by the library. Not doing so,
    * will result in a memory leak.
    */
  def git_strarray_dispose(array: Ptr[git_strarray]): Unit = extern

  /** Free the memory referred to by the git_strarray. This is an alias of
    * `git_strarray_dispose` and is preserved for backward compatibility.
    */
  def git_strarray_free(array: Ptr[git_strarray]): Unit = extern

  /** Resolve the setup of a new git submodule.
    */
  def git_submodule_add_finalize(submodule: Ptr[git_submodule]): CInt = extern

  /** Set up a new git submodule for checkout.
    */
  def git_submodule_add_setup(
      out: Ptr[Ptr[git_submodule]],
      repo: Ptr[git_repository],
      url: CString,
      path: CString,
      use_gitlink: CInt
  ): CInt = extern

  /** Add current submodule HEAD commit to index of superproject.
    */
  def git_submodule_add_to_index(
      submodule: Ptr[git_submodule],
      write_index: CInt
  ): CInt = extern

  /** Get the branch for the submodule.
    */
  def git_submodule_branch(submodule: Ptr[git_submodule]): CString = extern

  /** Perform the clone step for a newly created submodule.
    */
  def git_submodule_clone(
      out: Ptr[Ptr[git_repository]],
      submodule: Ptr[git_submodule],
      opts: Ptr[git_submodule_update_options]
  ): CInt = extern

  /** Create an in-memory copy of a submodule. The copy must be explicitly
    * free'd or it will leak.
    */
  def git_submodule_dup(
      out: Ptr[Ptr[git_submodule]],
      source: Ptr[git_submodule]
  ): CInt = extern

  /** Read the fetchRecurseSubmodules rule for a submodule.
    */
  def git_submodule_fetch_recurse_submodules(
      submodule: Ptr[git_submodule]
  ): git_submodule_recurse_t = extern

  /** Iterate over all tracked submodules of a repository.
    */
  def git_submodule_foreach(
      repo: Ptr[git_repository],
      callback: git_submodule_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Release a submodule
    */
  def git_submodule_free(submodule: Ptr[git_submodule]): Unit = extern

  /** Get the OID for the submodule in the current HEAD tree.
    */
  def git_submodule_head_id(submodule: Ptr[git_submodule]): Ptr[git_oid] =
    extern

  /** Get the ignore rule that will be used for the submodule.
    */
  def git_submodule_ignore(
      submodule: Ptr[git_submodule]
  ): git_submodule_ignore_t = extern

  /** Get the OID for the submodule in the index.
    */
  def git_submodule_index_id(submodule: Ptr[git_submodule]): Ptr[git_oid] =
    extern

  /** Copy submodule info into ".git/config" file.
    */
  def git_submodule_init(submodule: Ptr[git_submodule], overwrite: CInt): CInt =
    extern

  /** Get the locations of submodule information.
    */
  def git_submodule_location(
      location_status: Ptr[CUnsignedInt],
      submodule: Ptr[git_submodule]
  ): CInt = extern

  /** Lookup submodule information by name or path.
    */
  def git_submodule_lookup(
      out: Ptr[Ptr[git_submodule]],
      repo: Ptr[git_repository],
      name: CString
  ): CInt = extern

  /** Get the name of submodule.
    */
  def git_submodule_name(submodule: Ptr[git_submodule]): CString = extern

  /** Open the repository for a submodule.
    */
  def git_submodule_open(
      repo: Ptr[Ptr[git_repository]],
      submodule: Ptr[git_submodule]
  ): CInt = extern

  /** Get the containing repository for a submodule.
    */
  def git_submodule_owner(submodule: Ptr[git_submodule]): Ptr[git_repository] =
    extern

  /** Get the path to the submodule.
    */
  def git_submodule_path(submodule: Ptr[git_submodule]): CString = extern

  /** Reread submodule info from config, index, and HEAD.
    */
  def git_submodule_reload(submodule: Ptr[git_submodule], force: CInt): CInt =
    extern

  /** Set up the subrepository for a submodule in preparation for clone.
    */
  def git_submodule_repo_init(
      out: Ptr[Ptr[git_repository]],
      sm: Ptr[git_submodule],
      use_gitlink: CInt
  ): CInt = extern

  /** Resolve a submodule url relative to the given repository.
    */
  def git_submodule_resolve_url(
      out: Ptr[git_buf],
      repo: Ptr[git_repository],
      url: CString
  ): CInt = extern

  /** Set the branch for the submodule in the configuration
    */
  def git_submodule_set_branch(
      repo: Ptr[git_repository],
      name: CString,
      branch: CString
  ): CInt = extern

  /** Set the fetchRecurseSubmodules rule for a submodule in the configuration
    */
  def git_submodule_set_fetch_recurse_submodules(
      repo: Ptr[git_repository],
      name: CString,
      fetch_recurse_submodules: git_submodule_recurse_t
  ): CInt = extern

  /** Set the ignore rule for the submodule in the configuration
    */
  def git_submodule_set_ignore(
      repo: Ptr[git_repository],
      name: CString,
      ignore: git_submodule_ignore_t
  ): CInt = extern

  /** Set the update rule for the submodule in the configuration
    */
  def git_submodule_set_update(
      repo: Ptr[git_repository],
      name: CString,
      update: git_submodule_update_t
  ): CInt = extern

  /** Set the URL for the submodule in the configuration
    */
  def git_submodule_set_url(
      repo: Ptr[git_repository],
      name: CString,
      url: CString
  ): CInt = extern

  /** Get the status for a submodule.
    */
  def git_submodule_status(
      status: Ptr[CUnsignedInt],
      repo: Ptr[git_repository],
      name: CString,
      ignore: git_submodule_ignore_t
  ): CInt = extern

  /** Copy submodule remote info into submodule repo.
    */
  def git_submodule_sync(submodule: Ptr[git_submodule]): CInt = extern

  /** Update a submodule. This will clone a missing submodule and checkout the
    * subrepository to the commit specified in the index of the containing
    * repository. If the submodule repository doesn't contain the target commit
    * (e.g. because fetchRecurseSubmodules isn't set), then the submodule is
    * fetched using the fetch options supplied in options.
    */
  def git_submodule_update(
      submodule: Ptr[git_submodule],
      init: CInt,
      options: Ptr[git_submodule_update_options]
  ): CInt = extern

  /** */
  def git_submodule_update_init_options(
      opts: Ptr[git_submodule_update_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_submodule_update_options structure
    */
  def git_submodule_update_options_init(
      opts: Ptr[git_submodule_update_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Get the update rule that will be used for the submodule.
    */
  def git_submodule_update_strategy(
      submodule: Ptr[git_submodule]
  ): git_submodule_update_t = extern

  /** Get the URL for the submodule.
    */
  def git_submodule_url(submodule: Ptr[git_submodule]): CString = extern

  /** Get the OID for the submodule in the current working directory.
    */
  def git_submodule_wd_id(submodule: Ptr[git_submodule]): Ptr[git_oid] = extern

  /** Create a new tag in the object database pointing to a git_object
    */
  def git_tag_annotation_create(
      oid: Ptr[git_oid],
      repo: Ptr[git_repository],
      tag_name: CString,
      target: Ptr[git_object],
      tagger: Ptr[git_signature],
      message: CString
  ): CInt = extern

  /** Create a new tag in the repository from an object
    */
  def git_tag_create(
      oid: Ptr[git_oid],
      repo: Ptr[git_repository],
      tag_name: CString,
      target: Ptr[git_object],
      tagger: Ptr[git_signature],
      message: CString,
      force: CInt
  ): CInt = extern

  /** Create a new tag in the repository from a buffer
    */
  def git_tag_create_from_buffer(
      oid: Ptr[git_oid],
      repo: Ptr[git_repository],
      buffer: CString,
      force: CInt
  ): CInt = extern

  /** */
  def git_tag_create_frombuffer(
      oid: Ptr[git_oid],
      repo: Ptr[git_repository],
      buffer: CString,
      force: CInt
  ): CInt = extern

  /** Create a new lightweight tag pointing at a target object
    */
  def git_tag_create_lightweight(
      oid: Ptr[git_oid],
      repo: Ptr[git_repository],
      tag_name: CString,
      target: Ptr[git_object],
      force: CInt
  ): CInt = extern

  /** Delete an existing tag reference.
    */
  def git_tag_delete(repo: Ptr[git_repository], tag_name: CString): CInt =
    extern

  /** Create an in-memory copy of a tag. The copy must be explicitly free'd or
    * it will leak.
    */
  def git_tag_dup(out: Ptr[Ptr[git_tag]], source: Ptr[git_tag]): CInt = extern

  /** Call callback `cb' for each tag in the repository
    */
  def git_tag_foreach(
      repo: Ptr[git_repository],
      callback: git_tag_foreach_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Close an open tag
    */
  def git_tag_free(tag: Ptr[git_tag]): Unit = extern

  /** Get the id of a tag.
    */
  def git_tag_id(tag: Ptr[git_tag]): Ptr[git_oid] = extern

  /** Fill a list with all the tags in the Repository
    */
  def git_tag_list(
      tag_names: Ptr[git_strarray],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Fill a list with all the tags in the Repository which name match a defined
    * pattern
    */
  def git_tag_list_match(
      tag_names: Ptr[git_strarray],
      pattern: CString,
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Lookup a tag object from the repository.
    */
  def git_tag_lookup(
      out: Ptr[Ptr[git_tag]],
      repo: Ptr[git_repository],
      id: Ptr[git_oid]
  ): CInt = extern

  /** Lookup a tag object from the repository, given a prefix of its identifier
    * (short id).
    */
  def git_tag_lookup_prefix(
      out: Ptr[Ptr[git_tag]],
      repo: Ptr[git_repository],
      id: Ptr[git_oid],
      len: size_t
  ): CInt = extern

  /** Get the message of a tag
    */
  def git_tag_message(tag: Ptr[git_tag]): CString = extern

  /** Get the name of a tag
    */
  def git_tag_name(tag: Ptr[git_tag]): CString = extern

  /** Determine whether a tag name is valid, meaning that (when prefixed with
    * `refs/tags/`) that it is a valid reference name, and that any additional
    * tag name restrictions are imposed (eg, it cannot start with a `-`).
    */
  def git_tag_name_is_valid(valid: Ptr[CInt], name: CString): CInt = extern

  /** Get the repository that contains the tag.
    */
  def git_tag_owner(tag: Ptr[git_tag]): Ptr[git_repository] = extern

  /** Recursively peel a tag until a non tag git_object is found
    */
  def git_tag_peel(
      tag_target_out: Ptr[Ptr[git_object]],
      tag: Ptr[git_tag]
  ): CInt = extern

  /** Get the tagger (author) of a tag
    */
  def git_tag_tagger(tag: Ptr[git_tag]): Ptr[git_signature] = extern

  /** Get the tagged object of a tag
    */
  def git_tag_target(
      target_out: Ptr[Ptr[git_object]],
      tag: Ptr[git_tag]
  ): CInt = extern

  /** Get the OID of the tagged object of a tag
    */
  def git_tag_target_id(tag: Ptr[git_tag]): Ptr[git_oid] = extern

  /** Get the type of a tag's tagged object
    */
  def git_tag_target_type(tag: Ptr[git_tag]): git_object_t = extern

  /** Sets the system tracing configuration to the specified level with the
    * specified callback. When system events occur at a level equal to, or lower
    * than, the given level they will be reported to the given callback.
    */
  def git_trace_set(level: git_trace_level_t, cb: git_trace_cb): CInt = extern

  /** Commit the changes from the transaction
    */
  def git_transaction_commit(tx: Ptr[git_transaction]): CInt = extern

  /** Free the resources allocated by this transaction
    */
  def git_transaction_free(tx: Ptr[git_transaction]): Unit = extern

  /** Lock a reference
    */
  def git_transaction_lock_ref(
      tx: Ptr[git_transaction],
      refname: CString
  ): CInt = extern

  /** Create a new transaction object
    */
  def git_transaction_new(
      out: Ptr[Ptr[git_transaction]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Remove a reference
    */
  def git_transaction_remove(tx: Ptr[git_transaction], refname: CString): CInt =
    extern

  /** Set the reflog of a reference
    */
  def git_transaction_set_reflog(
      tx: Ptr[git_transaction],
      refname: CString,
      reflog: Ptr[git_reflog]
  ): CInt = extern

  /** Set the target of a reference
    */
  def git_transaction_set_symbolic_target(
      tx: Ptr[git_transaction],
      refname: CString,
      target: CString,
      sig: Ptr[git_signature],
      msg: CString
  ): CInt = extern

  /** Set the target of a reference
    */
  def git_transaction_set_target(
      tx: Ptr[git_transaction],
      refname: CString,
      target: Ptr[git_oid],
      sig: Ptr[git_signature],
      msg: CString
  ): CInt = extern

  /** Create a tree based on another one with the specified modifications
    */
  def git_tree_create_updated(
      out: Ptr[git_oid],
      repo: Ptr[git_repository],
      baseline: Ptr[git_tree],
      nupdates: size_t,
      updates: Ptr[git_tree_update]
  ): CInt = extern

  /** Create an in-memory copy of a tree. The copy must be explicitly free'd or
    * it will leak.
    */
  def git_tree_dup(out: Ptr[Ptr[git_tree]], source: Ptr[git_tree]): CInt =
    extern

  /** Lookup a tree entry by SHA value.
    */
  def git_tree_entry_byid(
      tree: Ptr[git_tree],
      id: Ptr[git_oid]
  ): Ptr[git_tree_entry] = extern

  /** Lookup a tree entry by its position in the tree
    */
  def git_tree_entry_byindex(
      tree: Ptr[git_tree],
      idx: size_t
  ): Ptr[git_tree_entry] = extern

  /** Lookup a tree entry by its filename
    */
  def git_tree_entry_byname(
      tree: Ptr[git_tree],
      filename: CString
  ): Ptr[git_tree_entry] = extern

  /** Retrieve a tree entry contained in a tree or in any of its subtrees, given
    * its relative path.
    */
  def git_tree_entry_bypath(
      out: Ptr[Ptr[git_tree_entry]],
      root: Ptr[git_tree],
      path: CString
  ): CInt = extern

  /** Compare two tree entries
    */
  def git_tree_entry_cmp(
      e1: Ptr[git_tree_entry],
      e2: Ptr[git_tree_entry]
  ): CInt = extern

  /** Duplicate a tree entry
    */
  def git_tree_entry_dup(
      dest: Ptr[Ptr[git_tree_entry]],
      source: Ptr[git_tree_entry]
  ): CInt = extern

  /** Get the UNIX file attributes of a tree entry
    */
  def git_tree_entry_filemode(entry: Ptr[git_tree_entry]): git_filemode_t =
    extern

  /** Get the raw UNIX file attributes of a tree entry
    */
  def git_tree_entry_filemode_raw(entry: Ptr[git_tree_entry]): git_filemode_t =
    extern

  /** Free a user-owned tree entry
    */
  def git_tree_entry_free(entry: Ptr[git_tree_entry]): Unit = extern

  /** Get the id of the object pointed by the entry
    */
  def git_tree_entry_id(entry: Ptr[git_tree_entry]): Ptr[git_oid] = extern

  /** Get the filename of a tree entry
    */
  def git_tree_entry_name(entry: Ptr[git_tree_entry]): CString = extern

  /** Convert a tree entry to the git_object it points to.
    */
  def git_tree_entry_to_object(
      object_out: Ptr[Ptr[git_object]],
      repo: Ptr[git_repository],
      entry: Ptr[git_tree_entry]
  ): CInt = extern

  /** Get the type of the object pointed by the entry
    */
  def git_tree_entry_type(entry: Ptr[git_tree_entry]): git_object_t = extern

  /** Get the number of entries listed in a tree
    */
  def git_tree_entrycount(tree: Ptr[git_tree]): size_t = extern

  /** Close an open tree
    */
  def git_tree_free(tree: Ptr[git_tree]): Unit = extern

  /** Get the id of a tree.
    */
  def git_tree_id(tree: Ptr[git_tree]): Ptr[git_oid] = extern

  /** Lookup a tree object from the repository.
    */
  def git_tree_lookup(
      out: Ptr[Ptr[git_tree]],
      repo: Ptr[git_repository],
      id: Ptr[git_oid]
  ): CInt = extern

  /** Lookup a tree object from the repository, given a prefix of its identifier
    * (short id).
    */
  def git_tree_lookup_prefix(
      out: Ptr[Ptr[git_tree]],
      repo: Ptr[git_repository],
      id: Ptr[git_oid],
      len: size_t
  ): CInt = extern

  /** Get the repository that contains the tree.
    */
  def git_tree_owner(tree: Ptr[git_tree]): Ptr[git_repository] = extern

  /** Traverse the entries in a tree and its subtrees in post or pre order.
    */
  def git_tree_walk(
      tree: Ptr[git_tree],
      mode: git_treewalk_mode,
      callback: git_treewalk_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Clear all the entries in the builder
    */
  def git_treebuilder_clear(bld: Ptr[git_treebuilder]): CInt = extern

  /** Get the number of entries listed in a treebuilder
    */
  def git_treebuilder_entrycount(bld: Ptr[git_treebuilder]): size_t = extern

  /** Selectively remove entries in the tree
    */
  def git_treebuilder_filter(
      bld: Ptr[git_treebuilder],
      filter: git_treebuilder_filter_cb,
      payload: Ptr[Byte]
  ): CInt = extern

  /** Free a tree builder
    */
  def git_treebuilder_free(bld: Ptr[git_treebuilder]): Unit = extern

  /** Get an entry from the builder from its filename
    */
  def git_treebuilder_get(
      bld: Ptr[git_treebuilder],
      filename: CString
  ): Ptr[git_tree_entry] = extern

  /** Add or update an entry to the builder
    */
  def git_treebuilder_insert(
      out: Ptr[Ptr[git_tree_entry]],
      bld: Ptr[git_treebuilder],
      filename: CString,
      id: Ptr[git_oid],
      filemode: git_filemode_t
  ): CInt = extern

  /** Create a new tree builder.
    */
  def git_treebuilder_new(
      out: Ptr[Ptr[git_treebuilder]],
      repo: Ptr[git_repository],
      source: Ptr[git_tree]
  ): CInt = extern

  /** Remove an entry from the builder by its filename
    */
  def git_treebuilder_remove(
      bld: Ptr[git_treebuilder],
      filename: CString
  ): CInt = extern

  /** Write the contents of the tree builder as a tree object
    */
  def git_treebuilder_write(id: Ptr[git_oid], bld: Ptr[git_treebuilder]): CInt =
    extern

  /** Write the contents of the tree builder as a tree object. This is an alias
    * of `git_treebuilder_write` and is preserved for backward compatibility.
    */
  def git_treebuilder_write_with_buffer(
      oid: Ptr[git_oid],
      bld: Ptr[git_treebuilder],
      tree: Ptr[git_buf]
  ): CInt = extern

  /** Add a new working tree
    */
  def git_worktree_add(
      out: Ptr[Ptr[git_worktree]],
      repo: Ptr[git_repository],
      name: CString,
      path: CString,
      opts: Ptr[git_worktree_add_options]
  ): CInt = extern

  /** */
  def git_worktree_add_init_options(
      opts: Ptr[git_worktree_add_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_worktree_add_options structure
    */
  def git_worktree_add_options_init(
      opts: Ptr[git_worktree_add_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Free a previously allocated worktree
    */
  def git_worktree_free(wt: Ptr[git_worktree]): Unit = extern

  /** Check if worktree is locked
    */
  def git_worktree_is_locked(
      reason: Ptr[git_buf],
      wt: Ptr[git_worktree]
  ): CInt = extern

  /** Is the worktree prunable with the given options?
    */
  def git_worktree_is_prunable(
      wt: Ptr[git_worktree],
      opts: Ptr[git_worktree_prune_options]
  ): CInt = extern

  /** List names of linked working trees
    */
  def git_worktree_list(
      out: Ptr[git_strarray],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Lock worktree if not already locked
    */
  def git_worktree_lock(wt: Ptr[git_worktree], reason: CString): CInt = extern

  /** Lookup a working tree by its name for a given repository
    */
  def git_worktree_lookup(
      out: Ptr[Ptr[git_worktree]],
      repo: Ptr[git_repository],
      name: CString
  ): CInt = extern

  /** Retrieve the name of the worktree
    */
  def git_worktree_name(wt: Ptr[git_worktree]): CString = extern

  /** Open a worktree of a given repository
    */
  def git_worktree_open_from_repository(
      out: Ptr[Ptr[git_worktree]],
      repo: Ptr[git_repository]
  ): CInt = extern

  /** Retrieve the filesystem path for the worktree
    */
  def git_worktree_path(wt: Ptr[git_worktree]): CString = extern

  /** Prune working tree
    */
  def git_worktree_prune(
      wt: Ptr[git_worktree],
      opts: Ptr[git_worktree_prune_options]
  ): CInt = extern

  /** */
  def git_worktree_prune_init_options(
      opts: Ptr[git_worktree_prune_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Initialize git_worktree_prune_options structure
    */
  def git_worktree_prune_options_init(
      opts: Ptr[git_worktree_prune_options],
      version: CUnsignedInt
  ): CInt = extern

  /** Unlock a locked worktree
    */
  def git_worktree_unlock(wt: Ptr[git_worktree]): CInt = extern

  /** Check if worktree is valid
    */
  def git_worktree_validate(wt: Ptr[git_worktree]): CInt = extern

  /** Clear the last error. This is an alias of `git_error_last` and is
    * preserved for backward compatibility.
    */
  def giterr_clear(): Unit = extern

  /** Return the last `git_error` object that was generated for the current
    * thread. This is an alias of `git_error_last` and is preserved for backward
    * compatibility.
    */
  def giterr_last(): Ptr[git_error] = extern

  /** Indicates that an out-of-memory situation occurred. This is an alias of
    * `git_error_set_oom` and is preserved for backward compatibility.
    */
  def giterr_set_oom(): Unit = extern

  /** Sets the error message to the given string. This is an alias of
    * `git_error_set_str` and is preserved for backward compatibility.
    */
  def giterr_set_str(error_class: CInt, string: CString): Unit = extern
end extern_functions

object functions:
  import _root_.libgit.enumerations.*
  import _root_.libgit.predef.*
  import _root_.libgit.aliases.*
  import _root_.libgit.structs.*
  import extern_functions.*
  export extern_functions.*

object types:
  export _root_.libgit.structs.*
  export _root_.libgit.aliases.*
  export _root_.libgit.enumerations.*

object all:
  export _root_.libgit.enumerations.git_apply_flags_t
  export _root_.libgit.enumerations.git_apply_location_t
  export _root_.libgit.enumerations.git_attr_value_t
  export _root_.libgit.enumerations.git_blame_flag_t
  export _root_.libgit.enumerations.git_blob_filter_flag_t
  export _root_.libgit.enumerations.git_branch_t
  export _root_.libgit.enumerations.git_cert_ssh_raw_type_t
  export _root_.libgit.enumerations.git_cert_ssh_t
  export _root_.libgit.enumerations.git_cert_t
  export _root_.libgit.enumerations.git_checkout_notify_t
  export _root_.libgit.enumerations.git_checkout_strategy_t
  export _root_.libgit.enumerations.git_clone_local_t
  export _root_.libgit.enumerations.git_config_level_t
  export _root_.libgit.enumerations.git_configmap_t
  export _root_.libgit.enumerations.git_credential_t
  export _root_.libgit.enumerations.git_delta_t
  export _root_.libgit.enumerations.git_describe_strategy_t
  export _root_.libgit.enumerations.git_diff_binary_t
  export _root_.libgit.enumerations.git_diff_find_t
  export _root_.libgit.enumerations.git_diff_flag_t
  export _root_.libgit.enumerations.git_diff_format_email_flags_t
  export _root_.libgit.enumerations.git_diff_format_t
  export _root_.libgit.enumerations.git_diff_line_t
  export _root_.libgit.enumerations.git_diff_option_t
  export _root_.libgit.enumerations.git_diff_stats_format_t
  export _root_.libgit.enumerations.git_direction
  export _root_.libgit.enumerations.git_email_create_flags_t
  export _root_.libgit.enumerations.git_error_code
  export _root_.libgit.enumerations.git_error_t
  export _root_.libgit.enumerations.git_feature_t
  export _root_.libgit.enumerations.git_fetch_prune_t
  export _root_.libgit.enumerations.git_filemode_t
  export _root_.libgit.enumerations.git_filter_flag_t
  export _root_.libgit.enumerations.git_filter_mode_t
  export _root_.libgit.enumerations.git_index_add_option_t
  export _root_.libgit.enumerations.git_index_capability_t
  export _root_.libgit.enumerations.git_index_entry_extended_flag_t
  export _root_.libgit.enumerations.git_index_entry_flag_t
  export _root_.libgit.enumerations.git_index_stage_t
  export _root_.libgit.enumerations.git_libgit2_opt_t
  export _root_.libgit.enumerations.git_merge_analysis_t
  export _root_.libgit.enumerations.git_merge_file_favor_t
  export _root_.libgit.enumerations.git_merge_file_flag_t
  export _root_.libgit.enumerations.git_merge_flag_t
  export _root_.libgit.enumerations.git_merge_preference_t
  export _root_.libgit.enumerations.git_object_t
  export _root_.libgit.enumerations.git_odb_backend_loose_flag_t
  export _root_.libgit.enumerations.git_odb_lookup_flags_t
  export _root_.libgit.enumerations.git_odb_stream_t
  export _root_.libgit.enumerations.git_oid_t
  export _root_.libgit.enumerations.git_packbuilder_stage_t
  export _root_.libgit.enumerations.git_pathspec_flag_t
  export _root_.libgit.enumerations.git_proxy_t
  export _root_.libgit.enumerations.git_rebase_operation_t
  export _root_.libgit.enumerations.git_reference_format_t
  export _root_.libgit.enumerations.git_reference_t
  export _root_.libgit.enumerations.git_remote_autotag_option_t
  export _root_.libgit.enumerations.git_remote_completion_t
  export _root_.libgit.enumerations.git_remote_create_flags
  export _root_.libgit.enumerations.git_remote_redirect_t
  export _root_.libgit.enumerations.git_repository_init_flag_t
  export _root_.libgit.enumerations.git_repository_init_mode_t
  export _root_.libgit.enumerations.git_repository_item_t
  export _root_.libgit.enumerations.git_repository_open_flag_t
  export _root_.libgit.enumerations.git_repository_state_t
  export _root_.libgit.enumerations.git_reset_t
  export _root_.libgit.enumerations.git_revspec_t
  export _root_.libgit.enumerations.git_sort_t
  export _root_.libgit.enumerations.git_stash_apply_flags
  export _root_.libgit.enumerations.git_stash_apply_progress_t
  export _root_.libgit.enumerations.git_stash_flags
  export _root_.libgit.enumerations.git_status_opt_t
  export _root_.libgit.enumerations.git_status_show_t
  export _root_.libgit.enumerations.git_status_t
  export _root_.libgit.enumerations.git_submodule_ignore_t
  export _root_.libgit.enumerations.git_submodule_recurse_t
  export _root_.libgit.enumerations.git_submodule_status_t
  export _root_.libgit.enumerations.git_submodule_update_t
  export _root_.libgit.enumerations.git_trace_level_t
  export _root_.libgit.enumerations.git_tree_update_t
  export _root_.libgit.enumerations.git_treewalk_mode
  export _root_.libgit.enumerations.git_worktree_prune_t
  export _root_.libgit.aliases.git_apply_delta_cb
  export _root_.libgit.aliases.git_apply_hunk_cb
  export _root_.libgit.aliases.git_attr_foreach_cb
  export _root_.libgit.aliases.git_attr_t
  export _root_.libgit.aliases.git_checkout_notify_cb
  export _root_.libgit.aliases.git_checkout_perfdata_cb
  export _root_.libgit.aliases.git_checkout_progress_cb
  export _root_.libgit.aliases.git_commit_create_cb
  export _root_.libgit.aliases.git_commit_signing_cb
  export _root_.libgit.aliases.git_config_foreach_cb
  export _root_.libgit.aliases.git_cred
  export _root_.libgit.aliases.git_cred_acquire_cb
  export _root_.libgit.aliases.git_cred_default
  export _root_.libgit.aliases.git_cred_sign_callback
  export _root_.libgit.aliases.git_cred_sign_cb
  export _root_.libgit.aliases.git_cred_ssh_custom
  export _root_.libgit.aliases.git_cred_ssh_interactive
  export _root_.libgit.aliases.git_cred_ssh_interactive_callback
  export _root_.libgit.aliases.git_cred_ssh_interactive_cb
  export _root_.libgit.aliases.git_cred_ssh_key
  export _root_.libgit.aliases.git_cred_username
  export _root_.libgit.aliases.git_cred_userpass_payload
  export _root_.libgit.aliases.git_cred_userpass_plaintext
  export _root_.libgit.aliases.git_credential_acquire_cb
  export _root_.libgit.aliases.git_credential_sign_cb
  export _root_.libgit.aliases.git_credential_ssh_interactive_cb
  export _root_.libgit.aliases.git_cvar_map
  export _root_.libgit.aliases.git_diff_binary_cb
  export _root_.libgit.aliases.git_diff_file_cb
  export _root_.libgit.aliases.git_diff_hunk_cb
  export _root_.libgit.aliases.git_diff_line_cb
  export _root_.libgit.aliases.git_diff_notify_cb
  export _root_.libgit.aliases.git_diff_progress_cb
  export _root_.libgit.aliases.git_headlist_cb
  export _root_.libgit.aliases.git_index_matched_path_cb
  export _root_.libgit.aliases.git_indexer_progress_cb
  export _root_.libgit.aliases.git_note_foreach_cb
  export _root_.libgit.aliases.git_object_size_t
  export _root_.libgit.aliases.git_odb_foreach_cb
  export _root_.libgit.aliases.git_off_t
  export _root_.libgit.aliases.git_packbuilder_foreach_cb
  export _root_.libgit.aliases.git_packbuilder_progress
  export _root_.libgit.aliases.git_push_negotiation
  export _root_.libgit.aliases.git_push_transfer_progress
  export _root_.libgit.aliases.git_push_transfer_progress_cb
  export _root_.libgit.aliases.git_push_update_reference_cb
  export _root_.libgit.aliases.git_reference_foreach_cb
  export _root_.libgit.aliases.git_reference_foreach_name_cb
  export _root_.libgit.aliases.git_remote_create_cb
  export _root_.libgit.aliases.git_remote_ready_cb
  export _root_.libgit.aliases.git_repository_create_cb
  export _root_.libgit.aliases.git_repository_fetchhead_foreach_cb
  export _root_.libgit.aliases.git_repository_mergehead_foreach_cb
  export _root_.libgit.aliases.git_revparse_mode_t
  export _root_.libgit.aliases.git_revwalk_hide_cb
  export _root_.libgit.aliases.git_stash_apply_progress_cb
  export _root_.libgit.aliases.git_stash_cb
  export _root_.libgit.aliases.git_status_cb
  export _root_.libgit.aliases.git_submodule_cb
  export _root_.libgit.aliases.git_tag_foreach_cb
  export _root_.libgit.aliases.git_time_t
  export _root_.libgit.aliases.git_trace_callback
  export _root_.libgit.aliases.git_trace_cb
  export _root_.libgit.aliases.git_transfer_progress
  export _root_.libgit.aliases.git_transfer_progress_cb
  export _root_.libgit.aliases.git_transport_cb
  export _root_.libgit.aliases.git_transport_certificate_check_cb
  export _root_.libgit.aliases.git_transport_message_cb
  export _root_.libgit.aliases.git_treebuilder_filter_cb
  export _root_.libgit.aliases.git_treewalk_cb
  export _root_.libgit.aliases.git_url_resolve_cb
  export _root_.libgit.aliases.int32_t
  export _root_.libgit.aliases.int64_t
  export _root_.libgit.aliases.size_t
  export _root_.libgit.aliases.uint16_t
  export _root_.libgit.aliases.uint32_t
  export _root_.libgit.aliases.uint64_t
  export _root_.libgit.structs.LIBSSH2_SESSION
  export _root_.libgit.structs.LIBSSH2_USERAUTH_KBDINT_PROMPT
  export _root_.libgit.structs.LIBSSH2_USERAUTH_KBDINT_RESPONSE
  export _root_.libgit.structs._LIBSSH2_SESSION
  export _root_.libgit.structs._LIBSSH2_USERAUTH_KBDINT_PROMPT
  export _root_.libgit.structs._LIBSSH2_USERAUTH_KBDINT_RESPONSE
  export _root_.libgit.structs.git_annotated_commit
  export _root_.libgit.structs.git_apply_options
  export _root_.libgit.structs.git_attr_options
  export _root_.libgit.structs.git_blame
  export _root_.libgit.structs.git_blame_hunk
  export _root_.libgit.structs.git_blame_options
  export _root_.libgit.structs.git_blob
  export _root_.libgit.structs.git_blob_filter_options
  export _root_.libgit.structs.git_branch_iterator
  export _root_.libgit.structs.git_buf
  export _root_.libgit.structs.git_cert
  export _root_.libgit.structs.git_cert_hostkey
  export _root_.libgit.structs.git_cert_x509
  export _root_.libgit.structs.git_checkout_options
  export _root_.libgit.structs.git_checkout_perfdata
  export _root_.libgit.structs.git_cherrypick_options
  export _root_.libgit.structs.git_clone_options
  export _root_.libgit.structs.git_commit
  export _root_.libgit.structs.git_commit_graph
  export _root_.libgit.structs.git_commit_graph_writer
  export _root_.libgit.structs.git_config
  export _root_.libgit.structs.git_config_backend
  export _root_.libgit.structs.git_config_entry
  export _root_.libgit.structs.git_config_iterator
  export _root_.libgit.structs.git_configmap
  export _root_.libgit.structs.git_credential
  export _root_.libgit.structs.git_credential_default
  export _root_.libgit.structs.git_credential_ssh_custom
  export _root_.libgit.structs.git_credential_ssh_interactive
  export _root_.libgit.structs.git_credential_ssh_key
  export _root_.libgit.structs.git_credential_username
  export _root_.libgit.structs.git_credential_userpass_payload
  export _root_.libgit.structs.git_credential_userpass_plaintext
  export _root_.libgit.structs.git_describe_format_options
  export _root_.libgit.structs.git_describe_options
  export _root_.libgit.structs.git_describe_result
  export _root_.libgit.structs.git_diff
  export _root_.libgit.structs.git_diff_binary
  export _root_.libgit.structs.git_diff_binary_file
  export _root_.libgit.structs.git_diff_delta
  export _root_.libgit.structs.git_diff_file
  export _root_.libgit.structs.git_diff_find_options
  export _root_.libgit.structs.git_diff_format_email_options
  export _root_.libgit.structs.git_diff_hunk
  export _root_.libgit.structs.git_diff_line
  export _root_.libgit.structs.git_diff_options
  export _root_.libgit.structs.git_diff_patchid_options
  export _root_.libgit.structs.git_diff_similarity_metric
  export _root_.libgit.structs.git_diff_stats
  export _root_.libgit.structs.git_email_create_options
  export _root_.libgit.structs.git_error
  export _root_.libgit.structs.git_fetch_options
  export _root_.libgit.structs.git_filter
  export _root_.libgit.structs.git_filter_list
  export _root_.libgit.structs.git_filter_options
  export _root_.libgit.structs.git_index
  export _root_.libgit.structs.git_index_conflict_iterator
  export _root_.libgit.structs.git_index_entry
  export _root_.libgit.structs.git_index_iterator
  export _root_.libgit.structs.git_index_time
  export _root_.libgit.structs.git_indexer
  export _root_.libgit.structs.git_indexer_options
  export _root_.libgit.structs.git_indexer_progress
  export _root_.libgit.structs.git_iterator
  export _root_.libgit.structs.git_mailmap
  export _root_.libgit.structs.git_merge_file_input
  export _root_.libgit.structs.git_merge_file_options
  export _root_.libgit.structs.git_merge_file_result
  export _root_.libgit.structs.git_merge_options
  export _root_.libgit.structs.git_message_trailer
  export _root_.libgit.structs.git_message_trailer_array
  export _root_.libgit.structs.git_midx_writer
  export _root_.libgit.structs.git_note
  export _root_.libgit.structs.git_note_iterator
  export _root_.libgit.structs.git_object
  export _root_.libgit.structs.git_odb
  export _root_.libgit.structs.git_odb_backend
  export _root_.libgit.structs.git_odb_backend_loose_options
  export _root_.libgit.structs.git_odb_backend_pack_options
  export _root_.libgit.structs.git_odb_expand_id
  export _root_.libgit.structs.git_odb_object
  export _root_.libgit.structs.git_odb_options
  export _root_.libgit.structs.git_odb_stream
  export _root_.libgit.structs.git_odb_writepack
  export _root_.libgit.structs.git_oid
  export _root_.libgit.structs.git_oid_shorten
  export _root_.libgit.structs.git_oidarray
  export _root_.libgit.structs.git_packbuilder
  export _root_.libgit.structs.git_patch
  export _root_.libgit.structs.git_pathspec
  export _root_.libgit.structs.git_pathspec_match_list
  export _root_.libgit.structs.git_proxy_options
  export _root_.libgit.structs.git_push
  export _root_.libgit.structs.git_push_options
  export _root_.libgit.structs.git_push_update
  export _root_.libgit.structs.git_rebase
  export _root_.libgit.structs.git_rebase_operation
  export _root_.libgit.structs.git_rebase_options
  export _root_.libgit.structs.git_refdb
  export _root_.libgit.structs.git_refdb_backend
  export _root_.libgit.structs.git_reference
  export _root_.libgit.structs.git_reference_iterator
  export _root_.libgit.structs.git_reflog
  export _root_.libgit.structs.git_reflog_entry
  export _root_.libgit.structs.git_refspec
  export _root_.libgit.structs.git_remote
  export _root_.libgit.structs.git_remote_callbacks
  export _root_.libgit.structs.git_remote_connect_options
  export _root_.libgit.structs.git_remote_create_options
  export _root_.libgit.structs.git_remote_head
  export _root_.libgit.structs.git_repository
  export _root_.libgit.structs.git_repository_init_options
  export _root_.libgit.structs.git_revert_options
  export _root_.libgit.structs.git_revspec
  export _root_.libgit.structs.git_revwalk
  export _root_.libgit.structs.git_signature
  export _root_.libgit.structs.git_stash_apply_options
  export _root_.libgit.structs.git_stash_save_options
  export _root_.libgit.structs.git_status_entry
  export _root_.libgit.structs.git_status_list
  export _root_.libgit.structs.git_status_options
  export _root_.libgit.structs.git_strarray
  export _root_.libgit.structs.git_submodule
  export _root_.libgit.structs.git_submodule_update_options
  export _root_.libgit.structs.git_tag
  export _root_.libgit.structs.git_time
  export _root_.libgit.structs.git_transaction
  export _root_.libgit.structs.git_transport
  export _root_.libgit.structs.git_tree
  export _root_.libgit.structs.git_tree_entry
  export _root_.libgit.structs.git_tree_update
  export _root_.libgit.structs.git_treebuilder
  export _root_.libgit.structs.git_worktree
  export _root_.libgit.structs.git_worktree_add_options
  export _root_.libgit.structs.git_worktree_prune_options
  export _root_.libgit.structs.git_writestream
  export _root_.libgit.functions.git_annotated_commit_free
  export _root_.libgit.functions.git_annotated_commit_from_fetchhead
  export _root_.libgit.functions.git_annotated_commit_from_ref
  export _root_.libgit.functions.git_annotated_commit_from_revspec
  export _root_.libgit.functions.git_annotated_commit_id
  export _root_.libgit.functions.git_annotated_commit_lookup
  export _root_.libgit.functions.git_annotated_commit_ref
  export _root_.libgit.functions.git_apply
  export _root_.libgit.functions.git_apply_options_init
  export _root_.libgit.functions.git_apply_to_tree
  export _root_.libgit.functions.git_attr_add_macro
  export _root_.libgit.functions.git_attr_cache_flush
  export _root_.libgit.functions.git_attr_foreach
  export _root_.libgit.functions.git_attr_foreach_ext
  export _root_.libgit.functions.git_attr_get
  export _root_.libgit.functions.git_attr_get_ext
  export _root_.libgit.functions.git_attr_get_many
  export _root_.libgit.functions.git_attr_get_many_ext
  export _root_.libgit.functions.git_attr_value
  export _root_.libgit.functions.git_blame_buffer
  export _root_.libgit.functions.git_blame_file
  export _root_.libgit.functions.git_blame_free
  export _root_.libgit.functions.git_blame_get_hunk_byindex
  export _root_.libgit.functions.git_blame_get_hunk_byline
  export _root_.libgit.functions.git_blame_get_hunk_count
  export _root_.libgit.functions.git_blame_init_options
  export _root_.libgit.functions.git_blame_options_init
  export _root_.libgit.functions.git_blob_create_from_buffer
  export _root_.libgit.functions.git_blob_create_from_disk
  export _root_.libgit.functions.git_blob_create_from_stream
  export _root_.libgit.functions.git_blob_create_from_stream_commit
  export _root_.libgit.functions.git_blob_create_from_workdir
  export _root_.libgit.functions.git_blob_create_frombuffer
  export _root_.libgit.functions.git_blob_create_fromdisk
  export _root_.libgit.functions.git_blob_create_fromstream
  export _root_.libgit.functions.git_blob_create_fromstream_commit
  export _root_.libgit.functions.git_blob_create_fromworkdir
  export _root_.libgit.functions.git_blob_data_is_binary
  export _root_.libgit.functions.git_blob_dup
  export _root_.libgit.functions.git_blob_filter
  export _root_.libgit.functions.git_blob_filter_options_init
  export _root_.libgit.functions.git_blob_filtered_content
  export _root_.libgit.functions.git_blob_free
  export _root_.libgit.functions.git_blob_id
  export _root_.libgit.functions.git_blob_is_binary
  export _root_.libgit.functions.git_blob_lookup
  export _root_.libgit.functions.git_blob_lookup_prefix
  export _root_.libgit.functions.git_blob_owner
  export _root_.libgit.functions.git_blob_rawcontent
  export _root_.libgit.functions.git_blob_rawsize
  export _root_.libgit.functions.git_branch_create
  export _root_.libgit.functions.git_branch_create_from_annotated
  export _root_.libgit.functions.git_branch_delete
  export _root_.libgit.functions.git_branch_is_checked_out
  export _root_.libgit.functions.git_branch_is_head
  export _root_.libgit.functions.git_branch_iterator_free
  export _root_.libgit.functions.git_branch_iterator_new
  export _root_.libgit.functions.git_branch_lookup
  export _root_.libgit.functions.git_branch_move
  export _root_.libgit.functions.git_branch_name
  export _root_.libgit.functions.git_branch_name_is_valid
  export _root_.libgit.functions.git_branch_next
  export _root_.libgit.functions.git_branch_remote_name
  export _root_.libgit.functions.git_branch_set_upstream
  export _root_.libgit.functions.git_branch_upstream
  export _root_.libgit.functions.git_branch_upstream_merge
  export _root_.libgit.functions.git_branch_upstream_name
  export _root_.libgit.functions.git_branch_upstream_remote
  export _root_.libgit.functions.git_buf_contains_nul
  export _root_.libgit.functions.git_buf_dispose
  export _root_.libgit.functions.git_buf_free
  export _root_.libgit.functions.git_buf_grow
  export _root_.libgit.functions.git_buf_is_binary
  export _root_.libgit.functions.git_buf_set
  export _root_.libgit.functions.git_checkout_head
  export _root_.libgit.functions.git_checkout_index
  export _root_.libgit.functions.git_checkout_init_options
  export _root_.libgit.functions.git_checkout_options_init
  export _root_.libgit.functions.git_checkout_tree
  export _root_.libgit.functions.git_cherrypick
  export _root_.libgit.functions.git_cherrypick_commit
  export _root_.libgit.functions.git_cherrypick_init_options
  export _root_.libgit.functions.git_cherrypick_options_init
  export _root_.libgit.functions.git_clone
  export _root_.libgit.functions.git_clone_init_options
  export _root_.libgit.functions.git_clone_options_init
  export _root_.libgit.functions.git_commit_amend
  export _root_.libgit.functions.git_commit_author
  export _root_.libgit.functions.git_commit_author_with_mailmap
  export _root_.libgit.functions.git_commit_body
  export _root_.libgit.functions.git_commit_committer
  export _root_.libgit.functions.git_commit_committer_with_mailmap
  export _root_.libgit.functions.git_commit_create
  export _root_.libgit.functions.git_commit_create_buffer
  export _root_.libgit.functions.git_commit_create_v
  export _root_.libgit.functions.git_commit_create_with_signature
  export _root_.libgit.functions.git_commit_dup
  export _root_.libgit.functions.git_commit_extract_signature
  export _root_.libgit.functions.git_commit_free
  export _root_.libgit.functions.git_commit_header_field
  export _root_.libgit.functions.git_commit_id
  export _root_.libgit.functions.git_commit_lookup
  export _root_.libgit.functions.git_commit_lookup_prefix
  export _root_.libgit.functions.git_commit_message
  export _root_.libgit.functions.git_commit_message_encoding
  export _root_.libgit.functions.git_commit_message_raw
  export _root_.libgit.functions.git_commit_nth_gen_ancestor
  export _root_.libgit.functions.git_commit_owner
  export _root_.libgit.functions.git_commit_parent
  export _root_.libgit.functions.git_commit_parent_id
  export _root_.libgit.functions.git_commit_parentcount
  export _root_.libgit.functions.git_commit_raw_header
  export _root_.libgit.functions.git_commit_summary
  export _root_.libgit.functions.git_commit_time
  export _root_.libgit.functions.git_commit_time_offset
  export _root_.libgit.functions.git_commit_tree
  export _root_.libgit.functions.git_commit_tree_id
  export _root_.libgit.functions.git_config_add_file_ondisk
  export _root_.libgit.functions.git_config_backend_foreach_match
  export _root_.libgit.functions.git_config_delete_entry
  export _root_.libgit.functions.git_config_delete_multivar
  export _root_.libgit.functions.git_config_entry_free
  export _root_.libgit.functions.git_config_find_global
  export _root_.libgit.functions.git_config_find_programdata
  export _root_.libgit.functions.git_config_find_system
  export _root_.libgit.functions.git_config_find_xdg
  export _root_.libgit.functions.git_config_foreach
  export _root_.libgit.functions.git_config_foreach_match
  export _root_.libgit.functions.git_config_free
  export _root_.libgit.functions.git_config_get_bool
  export _root_.libgit.functions.git_config_get_entry
  export _root_.libgit.functions.git_config_get_int32
  export _root_.libgit.functions.git_config_get_int64
  export _root_.libgit.functions.git_config_get_mapped
  export _root_.libgit.functions.git_config_get_multivar_foreach
  export _root_.libgit.functions.git_config_get_path
  export _root_.libgit.functions.git_config_get_string
  export _root_.libgit.functions.git_config_get_string_buf
  export _root_.libgit.functions.git_config_iterator_free
  export _root_.libgit.functions.git_config_iterator_glob_new
  export _root_.libgit.functions.git_config_iterator_new
  export _root_.libgit.functions.git_config_lock
  export _root_.libgit.functions.git_config_lookup_map_value
  export _root_.libgit.functions.git_config_multivar_iterator_new
  export _root_.libgit.functions.git_config_new
  export _root_.libgit.functions.git_config_next
  export _root_.libgit.functions.git_config_open_default
  export _root_.libgit.functions.git_config_open_global
  export _root_.libgit.functions.git_config_open_level
  export _root_.libgit.functions.git_config_open_ondisk
  export _root_.libgit.functions.git_config_parse_bool
  export _root_.libgit.functions.git_config_parse_int32
  export _root_.libgit.functions.git_config_parse_int64
  export _root_.libgit.functions.git_config_parse_path
  export _root_.libgit.functions.git_config_set_bool
  export _root_.libgit.functions.git_config_set_int32
  export _root_.libgit.functions.git_config_set_int64
  export _root_.libgit.functions.git_config_set_multivar
  export _root_.libgit.functions.git_config_set_string
  export _root_.libgit.functions.git_config_snapshot
  export _root_.libgit.functions.git_cred_default_new
  export _root_.libgit.functions.git_cred_free
  export _root_.libgit.functions.git_cred_get_username
  export _root_.libgit.functions.git_cred_has_username
  export _root_.libgit.functions.git_cred_ssh_custom_new
  export _root_.libgit.functions.git_cred_ssh_interactive_new
  export _root_.libgit.functions.git_cred_ssh_key_from_agent
  export _root_.libgit.functions.git_cred_ssh_key_memory_new
  export _root_.libgit.functions.git_cred_ssh_key_new
  export _root_.libgit.functions.git_cred_username_new
  export _root_.libgit.functions.git_cred_userpass
  export _root_.libgit.functions.git_cred_userpass_plaintext_new
  export _root_.libgit.functions.git_credential_default_new
  export _root_.libgit.functions.git_credential_free
  export _root_.libgit.functions.git_credential_get_username
  export _root_.libgit.functions.git_credential_has_username
  export _root_.libgit.functions.git_credential_ssh_custom_new
  export _root_.libgit.functions.git_credential_ssh_interactive_new
  export _root_.libgit.functions.git_credential_ssh_key_from_agent
  export _root_.libgit.functions.git_credential_ssh_key_memory_new
  export _root_.libgit.functions.git_credential_ssh_key_new
  export _root_.libgit.functions.git_credential_username_new
  export _root_.libgit.functions.git_credential_userpass
  export _root_.libgit.functions.git_credential_userpass_plaintext_new
  export _root_.libgit.functions.git_describe_commit
  export _root_.libgit.functions.git_describe_format
  export _root_.libgit.functions.git_describe_format_options_init
  export _root_.libgit.functions.git_describe_init_format_options
  export _root_.libgit.functions.git_describe_init_options
  export _root_.libgit.functions.git_describe_options_init
  export _root_.libgit.functions.git_describe_result_free
  export _root_.libgit.functions.git_describe_workdir
  export _root_.libgit.functions.git_diff_blob_to_buffer
  export _root_.libgit.functions.git_diff_blobs
  export _root_.libgit.functions.git_diff_buffers
  export _root_.libgit.functions.git_diff_commit_as_email
  export _root_.libgit.functions.git_diff_find_init_options
  export _root_.libgit.functions.git_diff_find_options_init
  export _root_.libgit.functions.git_diff_find_similar
  export _root_.libgit.functions.git_diff_foreach
  export _root_.libgit.functions.git_diff_format_email
  export _root_.libgit.functions.git_diff_format_email_init_options
  export _root_.libgit.functions.git_diff_format_email_options_init
  export _root_.libgit.functions.git_diff_free
  export _root_.libgit.functions.git_diff_from_buffer
  export _root_.libgit.functions.git_diff_get_delta
  export _root_.libgit.functions.git_diff_get_stats
  export _root_.libgit.functions.git_diff_index_to_index
  export _root_.libgit.functions.git_diff_index_to_workdir
  export _root_.libgit.functions.git_diff_init_options
  export _root_.libgit.functions.git_diff_is_sorted_icase
  export _root_.libgit.functions.git_diff_merge
  export _root_.libgit.functions.git_diff_num_deltas
  export _root_.libgit.functions.git_diff_num_deltas_of_type
  export _root_.libgit.functions.git_diff_options_init
  export _root_.libgit.functions.git_diff_patchid
  export _root_.libgit.functions.git_diff_patchid_init_options
  export _root_.libgit.functions.git_diff_patchid_options_init
  export _root_.libgit.functions.git_diff_print
  export _root_.libgit.functions.git_diff_stats_deletions
  export _root_.libgit.functions.git_diff_stats_files_changed
  export _root_.libgit.functions.git_diff_stats_free
  export _root_.libgit.functions.git_diff_stats_insertions
  export _root_.libgit.functions.git_diff_stats_to_buf
  export _root_.libgit.functions.git_diff_status_char
  export _root_.libgit.functions.git_diff_to_buf
  export _root_.libgit.functions.git_diff_tree_to_index
  export _root_.libgit.functions.git_diff_tree_to_tree
  export _root_.libgit.functions.git_diff_tree_to_workdir
  export _root_.libgit.functions.git_diff_tree_to_workdir_with_index
  export _root_.libgit.functions.git_email_create_from_commit
  export _root_.libgit.functions.git_email_create_from_diff
  export _root_.libgit.functions.git_error_clear
  export _root_.libgit.functions.git_error_last
  export _root_.libgit.functions.git_error_set
  export _root_.libgit.functions.git_error_set_oom
  export _root_.libgit.functions.git_error_set_str
  export _root_.libgit.functions.git_fetch_init_options
  export _root_.libgit.functions.git_fetch_options_init
  export _root_.libgit.functions.git_filter_list_apply_to_blob
  export _root_.libgit.functions.git_filter_list_apply_to_buffer
  export _root_.libgit.functions.git_filter_list_apply_to_data
  export _root_.libgit.functions.git_filter_list_apply_to_file
  export _root_.libgit.functions.git_filter_list_contains
  export _root_.libgit.functions.git_filter_list_free
  export _root_.libgit.functions.git_filter_list_load
  export _root_.libgit.functions.git_filter_list_load_ext
  export _root_.libgit.functions.git_filter_list_stream_blob
  export _root_.libgit.functions.git_filter_list_stream_buffer
  export _root_.libgit.functions.git_filter_list_stream_data
  export _root_.libgit.functions.git_filter_list_stream_file
  export _root_.libgit.functions.git_graph_ahead_behind
  export _root_.libgit.functions.git_graph_descendant_of
  export _root_.libgit.functions.git_graph_reachable_from_any
  export _root_.libgit.functions.git_ignore_add_rule
  export _root_.libgit.functions.git_ignore_clear_internal_rules
  export _root_.libgit.functions.git_ignore_path_is_ignored
  export _root_.libgit.functions.git_index_add
  export _root_.libgit.functions.git_index_add_all
  export _root_.libgit.functions.git_index_add_bypath
  export _root_.libgit.functions.git_index_add_from_buffer
  export _root_.libgit.functions.git_index_add_frombuffer
  export _root_.libgit.functions.git_index_caps
  export _root_.libgit.functions.git_index_checksum
  export _root_.libgit.functions.git_index_clear
  export _root_.libgit.functions.git_index_conflict_add
  export _root_.libgit.functions.git_index_conflict_cleanup
  export _root_.libgit.functions.git_index_conflict_get
  export _root_.libgit.functions.git_index_conflict_iterator_free
  export _root_.libgit.functions.git_index_conflict_iterator_new
  export _root_.libgit.functions.git_index_conflict_next
  export _root_.libgit.functions.git_index_conflict_remove
  export _root_.libgit.functions.git_index_entry_is_conflict
  export _root_.libgit.functions.git_index_entry_stage
  export _root_.libgit.functions.git_index_entrycount
  export _root_.libgit.functions.git_index_find
  export _root_.libgit.functions.git_index_find_prefix
  export _root_.libgit.functions.git_index_free
  export _root_.libgit.functions.git_index_get_byindex
  export _root_.libgit.functions.git_index_get_bypath
  export _root_.libgit.functions.git_index_has_conflicts
  export _root_.libgit.functions.git_index_iterator_free
  export _root_.libgit.functions.git_index_iterator_new
  export _root_.libgit.functions.git_index_iterator_next
  export _root_.libgit.functions.git_index_new
  export _root_.libgit.functions.git_index_open
  export _root_.libgit.functions.git_index_owner
  export _root_.libgit.functions.git_index_path
  export _root_.libgit.functions.git_index_read
  export _root_.libgit.functions.git_index_read_tree
  export _root_.libgit.functions.git_index_remove
  export _root_.libgit.functions.git_index_remove_all
  export _root_.libgit.functions.git_index_remove_bypath
  export _root_.libgit.functions.git_index_remove_directory
  export _root_.libgit.functions.git_index_set_caps
  export _root_.libgit.functions.git_index_set_version
  export _root_.libgit.functions.git_index_update_all
  export _root_.libgit.functions.git_index_version
  export _root_.libgit.functions.git_index_write
  export _root_.libgit.functions.git_index_write_tree
  export _root_.libgit.functions.git_index_write_tree_to
  export _root_.libgit.functions.git_indexer_append
  export _root_.libgit.functions.git_indexer_commit
  export _root_.libgit.functions.git_indexer_free
  export _root_.libgit.functions.git_indexer_hash
  export _root_.libgit.functions.git_indexer_init_options
  export _root_.libgit.functions.git_indexer_name
  export _root_.libgit.functions.git_indexer_new
  export _root_.libgit.functions.git_indexer_options_init
  export _root_.libgit.functions.git_libgit2_features
  export _root_.libgit.functions.git_libgit2_init
  export _root_.libgit.functions.git_libgit2_opts
  export _root_.libgit.functions.git_libgit2_prerelease
  export _root_.libgit.functions.git_libgit2_shutdown
  export _root_.libgit.functions.git_libgit2_version
  export _root_.libgit.functions.git_mailmap_add_entry
  export _root_.libgit.functions.git_mailmap_free
  export _root_.libgit.functions.git_mailmap_from_buffer
  export _root_.libgit.functions.git_mailmap_from_repository
  export _root_.libgit.functions.git_mailmap_new
  export _root_.libgit.functions.git_mailmap_resolve
  export _root_.libgit.functions.git_mailmap_resolve_signature
  export _root_.libgit.functions.git_merge
  export _root_.libgit.functions.git_merge_analysis
  export _root_.libgit.functions.git_merge_analysis_for_ref
  export _root_.libgit.functions.git_merge_base
  export _root_.libgit.functions.git_merge_base_many
  export _root_.libgit.functions.git_merge_base_octopus
  export _root_.libgit.functions.git_merge_bases
  export _root_.libgit.functions.git_merge_bases_many
  export _root_.libgit.functions.git_merge_commits
  export _root_.libgit.functions.git_merge_file
  export _root_.libgit.functions.git_merge_file_from_index
  export _root_.libgit.functions.git_merge_file_init_input
  export _root_.libgit.functions.git_merge_file_init_options
  export _root_.libgit.functions.git_merge_file_input_init
  export _root_.libgit.functions.git_merge_file_options_init
  export _root_.libgit.functions.git_merge_file_result_free
  export _root_.libgit.functions.git_merge_init_options
  export _root_.libgit.functions.git_merge_options_init
  export _root_.libgit.functions.git_merge_trees
  export _root_.libgit.functions.git_message_prettify
  export _root_.libgit.functions.git_message_trailer_array_free
  export _root_.libgit.functions.git_message_trailers
  export _root_.libgit.functions.git_note_author
  export _root_.libgit.functions.git_note_commit_create
  export _root_.libgit.functions.git_note_commit_iterator_new
  export _root_.libgit.functions.git_note_commit_read
  export _root_.libgit.functions.git_note_commit_remove
  export _root_.libgit.functions.git_note_committer
  export _root_.libgit.functions.git_note_create
  export _root_.libgit.functions.git_note_default_ref
  export _root_.libgit.functions.git_note_foreach
  export _root_.libgit.functions.git_note_free
  export _root_.libgit.functions.git_note_id
  export _root_.libgit.functions.git_note_iterator_free
  export _root_.libgit.functions.git_note_iterator_new
  export _root_.libgit.functions.git_note_message
  export _root_.libgit.functions.git_note_next
  export _root_.libgit.functions.git_note_read
  export _root_.libgit.functions.git_note_remove
  export _root_.libgit.functions.git_object__size
  export _root_.libgit.functions.git_object_dup
  export _root_.libgit.functions.git_object_free
  export _root_.libgit.functions.git_object_id
  export _root_.libgit.functions.git_object_lookup
  export _root_.libgit.functions.git_object_lookup_bypath
  export _root_.libgit.functions.git_object_lookup_prefix
  export _root_.libgit.functions.git_object_owner
  export _root_.libgit.functions.git_object_peel
  export _root_.libgit.functions.git_object_rawcontent_is_valid
  export _root_.libgit.functions.git_object_short_id
  export _root_.libgit.functions.git_object_string2type
  export _root_.libgit.functions.git_object_type
  export _root_.libgit.functions.git_object_type2string
  export _root_.libgit.functions.git_object_typeisloose
  export _root_.libgit.functions.git_odb_add_alternate
  export _root_.libgit.functions.git_odb_add_backend
  export _root_.libgit.functions.git_odb_add_disk_alternate
  export _root_.libgit.functions.git_odb_backend_loose
  export _root_.libgit.functions.git_odb_backend_one_pack
  export _root_.libgit.functions.git_odb_backend_pack
  export _root_.libgit.functions.git_odb_exists
  export _root_.libgit.functions.git_odb_exists_ext
  export _root_.libgit.functions.git_odb_exists_prefix
  export _root_.libgit.functions.git_odb_expand_ids
  export _root_.libgit.functions.git_odb_foreach
  export _root_.libgit.functions.git_odb_free
  export _root_.libgit.functions.git_odb_get_backend
  export _root_.libgit.functions.git_odb_hash
  export _root_.libgit.functions.git_odb_hashfile
  export _root_.libgit.functions.git_odb_new
  export _root_.libgit.functions.git_odb_num_backends
  export _root_.libgit.functions.git_odb_object_data
  export _root_.libgit.functions.git_odb_object_dup
  export _root_.libgit.functions.git_odb_object_free
  export _root_.libgit.functions.git_odb_object_id
  export _root_.libgit.functions.git_odb_object_size
  export _root_.libgit.functions.git_odb_object_type
  export _root_.libgit.functions.git_odb_open
  export _root_.libgit.functions.git_odb_open_rstream
  export _root_.libgit.functions.git_odb_open_wstream
  export _root_.libgit.functions.git_odb_read
  export _root_.libgit.functions.git_odb_read_header
  export _root_.libgit.functions.git_odb_read_prefix
  export _root_.libgit.functions.git_odb_refresh
  export _root_.libgit.functions.git_odb_set_commit_graph
  export _root_.libgit.functions.git_odb_stream_finalize_write
  export _root_.libgit.functions.git_odb_stream_free
  export _root_.libgit.functions.git_odb_stream_read
  export _root_.libgit.functions.git_odb_stream_write
  export _root_.libgit.functions.git_odb_write
  export _root_.libgit.functions.git_odb_write_multi_pack_index
  export _root_.libgit.functions.git_odb_write_pack
  export _root_.libgit.functions.git_oid_cmp
  export _root_.libgit.functions.git_oid_cpy
  export _root_.libgit.functions.git_oid_equal
  export _root_.libgit.functions.git_oid_fmt
  export _root_.libgit.functions.git_oid_fromraw
  export _root_.libgit.functions.git_oid_fromstr
  export _root_.libgit.functions.git_oid_fromstrn
  export _root_.libgit.functions.git_oid_fromstrp
  export _root_.libgit.functions.git_oid_is_zero
  export _root_.libgit.functions.git_oid_iszero
  export _root_.libgit.functions.git_oid_ncmp
  export _root_.libgit.functions.git_oid_nfmt
  export _root_.libgit.functions.git_oid_pathfmt
  export _root_.libgit.functions.git_oid_shorten_add
  export _root_.libgit.functions.git_oid_shorten_free
  export _root_.libgit.functions.git_oid_shorten_new
  export _root_.libgit.functions.git_oid_strcmp
  export _root_.libgit.functions.git_oid_streq
  export _root_.libgit.functions.git_oid_tostr
  export _root_.libgit.functions.git_oid_tostr_s
  export _root_.libgit.functions.git_oidarray_dispose
  export _root_.libgit.functions.git_oidarray_free
  export _root_.libgit.functions.git_packbuilder_foreach
  export _root_.libgit.functions.git_packbuilder_free
  export _root_.libgit.functions.git_packbuilder_hash
  export _root_.libgit.functions.git_packbuilder_insert
  export _root_.libgit.functions.git_packbuilder_insert_commit
  export _root_.libgit.functions.git_packbuilder_insert_recur
  export _root_.libgit.functions.git_packbuilder_insert_tree
  export _root_.libgit.functions.git_packbuilder_insert_walk
  export _root_.libgit.functions.git_packbuilder_name
  export _root_.libgit.functions.git_packbuilder_new
  export _root_.libgit.functions.git_packbuilder_object_count
  export _root_.libgit.functions.git_packbuilder_set_callbacks
  export _root_.libgit.functions.git_packbuilder_set_threads
  export _root_.libgit.functions.git_packbuilder_write
  export _root_.libgit.functions.git_packbuilder_write_buf
  export _root_.libgit.functions.git_packbuilder_written
  export _root_.libgit.functions.git_patch_free
  export _root_.libgit.functions.git_patch_from_blob_and_buffer
  export _root_.libgit.functions.git_patch_from_blobs
  export _root_.libgit.functions.git_patch_from_buffers
  export _root_.libgit.functions.git_patch_from_diff
  export _root_.libgit.functions.git_patch_get_delta
  export _root_.libgit.functions.git_patch_get_hunk
  export _root_.libgit.functions.git_patch_get_line_in_hunk
  export _root_.libgit.functions.git_patch_line_stats
  export _root_.libgit.functions.git_patch_num_hunks
  export _root_.libgit.functions.git_patch_num_lines_in_hunk
  export _root_.libgit.functions.git_patch_owner
  export _root_.libgit.functions.git_patch_print
  export _root_.libgit.functions.git_patch_size
  export _root_.libgit.functions.git_patch_to_buf
  export _root_.libgit.functions.git_pathspec_free
  export _root_.libgit.functions.git_pathspec_match_diff
  export _root_.libgit.functions.git_pathspec_match_index
  export _root_.libgit.functions.git_pathspec_match_list_diff_entry
  export _root_.libgit.functions.git_pathspec_match_list_entry
  export _root_.libgit.functions.git_pathspec_match_list_entrycount
  export _root_.libgit.functions.git_pathspec_match_list_failed_entry
  export _root_.libgit.functions.git_pathspec_match_list_failed_entrycount
  export _root_.libgit.functions.git_pathspec_match_list_free
  export _root_.libgit.functions.git_pathspec_match_tree
  export _root_.libgit.functions.git_pathspec_match_workdir
  export _root_.libgit.functions.git_pathspec_matches_path
  export _root_.libgit.functions.git_pathspec_new
  export _root_.libgit.functions.git_proxy_init_options
  export _root_.libgit.functions.git_proxy_options_init
  export _root_.libgit.functions.git_push_init_options
  export _root_.libgit.functions.git_push_options_init
  export _root_.libgit.functions.git_rebase_abort
  export _root_.libgit.functions.git_rebase_commit
  export _root_.libgit.functions.git_rebase_finish
  export _root_.libgit.functions.git_rebase_free
  export _root_.libgit.functions.git_rebase_init
  export _root_.libgit.functions.git_rebase_init_options
  export _root_.libgit.functions.git_rebase_inmemory_index
  export _root_.libgit.functions.git_rebase_next
  export _root_.libgit.functions.git_rebase_onto_id
  export _root_.libgit.functions.git_rebase_onto_name
  export _root_.libgit.functions.git_rebase_open
  export _root_.libgit.functions.git_rebase_operation_byindex
  export _root_.libgit.functions.git_rebase_operation_current
  export _root_.libgit.functions.git_rebase_operation_entrycount
  export _root_.libgit.functions.git_rebase_options_init
  export _root_.libgit.functions.git_rebase_orig_head_id
  export _root_.libgit.functions.git_rebase_orig_head_name
  export _root_.libgit.functions.git_refdb_compress
  export _root_.libgit.functions.git_refdb_free
  export _root_.libgit.functions.git_refdb_new
  export _root_.libgit.functions.git_refdb_open
  export _root_.libgit.functions.git_reference_cmp
  export _root_.libgit.functions.git_reference_create
  export _root_.libgit.functions.git_reference_create_matching
  export _root_.libgit.functions.git_reference_delete
  export _root_.libgit.functions.git_reference_dup
  export _root_.libgit.functions.git_reference_dwim
  export _root_.libgit.functions.git_reference_ensure_log
  export _root_.libgit.functions.git_reference_foreach
  export _root_.libgit.functions.git_reference_foreach_glob
  export _root_.libgit.functions.git_reference_foreach_name
  export _root_.libgit.functions.git_reference_free
  export _root_.libgit.functions.git_reference_has_log
  export _root_.libgit.functions.git_reference_is_branch
  export _root_.libgit.functions.git_reference_is_note
  export _root_.libgit.functions.git_reference_is_remote
  export _root_.libgit.functions.git_reference_is_tag
  export _root_.libgit.functions.git_reference_is_valid_name
  export _root_.libgit.functions.git_reference_iterator_free
  export _root_.libgit.functions.git_reference_iterator_glob_new
  export _root_.libgit.functions.git_reference_iterator_new
  export _root_.libgit.functions.git_reference_list
  export _root_.libgit.functions.git_reference_lookup
  export _root_.libgit.functions.git_reference_name
  export _root_.libgit.functions.git_reference_name_is_valid
  export _root_.libgit.functions.git_reference_name_to_id
  export _root_.libgit.functions.git_reference_next
  export _root_.libgit.functions.git_reference_next_name
  export _root_.libgit.functions.git_reference_normalize_name
  export _root_.libgit.functions.git_reference_owner
  export _root_.libgit.functions.git_reference_peel
  export _root_.libgit.functions.git_reference_remove
  export _root_.libgit.functions.git_reference_rename
  export _root_.libgit.functions.git_reference_resolve
  export _root_.libgit.functions.git_reference_set_target
  export _root_.libgit.functions.git_reference_shorthand
  export _root_.libgit.functions.git_reference_symbolic_create
  export _root_.libgit.functions.git_reference_symbolic_create_matching
  export _root_.libgit.functions.git_reference_symbolic_set_target
  export _root_.libgit.functions.git_reference_symbolic_target
  export _root_.libgit.functions.git_reference_target
  export _root_.libgit.functions.git_reference_target_peel
  export _root_.libgit.functions.git_reference_type
  export _root_.libgit.functions.git_reflog_append
  export _root_.libgit.functions.git_reflog_delete
  export _root_.libgit.functions.git_reflog_drop
  export _root_.libgit.functions.git_reflog_entry_byindex
  export _root_.libgit.functions.git_reflog_entry_committer
  export _root_.libgit.functions.git_reflog_entry_id_new
  export _root_.libgit.functions.git_reflog_entry_id_old
  export _root_.libgit.functions.git_reflog_entry_message
  export _root_.libgit.functions.git_reflog_entrycount
  export _root_.libgit.functions.git_reflog_free
  export _root_.libgit.functions.git_reflog_read
  export _root_.libgit.functions.git_reflog_rename
  export _root_.libgit.functions.git_reflog_write
  export _root_.libgit.functions.git_refspec_direction
  export _root_.libgit.functions.git_refspec_dst
  export _root_.libgit.functions.git_refspec_dst_matches
  export _root_.libgit.functions.git_refspec_force
  export _root_.libgit.functions.git_refspec_free
  export _root_.libgit.functions.git_refspec_parse
  export _root_.libgit.functions.git_refspec_rtransform
  export _root_.libgit.functions.git_refspec_src
  export _root_.libgit.functions.git_refspec_src_matches
  export _root_.libgit.functions.git_refspec_string
  export _root_.libgit.functions.git_refspec_transform
  export _root_.libgit.functions.git_remote_add_fetch
  export _root_.libgit.functions.git_remote_add_push
  export _root_.libgit.functions.git_remote_autotag
  export _root_.libgit.functions.git_remote_connect
  export _root_.libgit.functions.git_remote_connect_ext
  export _root_.libgit.functions.git_remote_connect_options_init
  export _root_.libgit.functions.git_remote_connected
  export _root_.libgit.functions.git_remote_create
  export _root_.libgit.functions.git_remote_create_anonymous
  export _root_.libgit.functions.git_remote_create_detached
  export _root_.libgit.functions.git_remote_create_init_options
  export _root_.libgit.functions.git_remote_create_options_init
  export _root_.libgit.functions.git_remote_create_with_fetchspec
  export _root_.libgit.functions.git_remote_create_with_opts
  export _root_.libgit.functions.git_remote_default_branch
  export _root_.libgit.functions.git_remote_delete
  export _root_.libgit.functions.git_remote_disconnect
  export _root_.libgit.functions.git_remote_download
  export _root_.libgit.functions.git_remote_dup
  export _root_.libgit.functions.git_remote_fetch
  export _root_.libgit.functions.git_remote_free
  export _root_.libgit.functions.git_remote_get_fetch_refspecs
  export _root_.libgit.functions.git_remote_get_push_refspecs
  export _root_.libgit.functions.git_remote_get_refspec
  export _root_.libgit.functions.git_remote_init_callbacks
  export _root_.libgit.functions.git_remote_is_valid_name
  export _root_.libgit.functions.git_remote_list
  export _root_.libgit.functions.git_remote_lookup
  export _root_.libgit.functions.git_remote_ls
  export _root_.libgit.functions.git_remote_name
  export _root_.libgit.functions.git_remote_name_is_valid
  export _root_.libgit.functions.git_remote_owner
  export _root_.libgit.functions.git_remote_prune
  export _root_.libgit.functions.git_remote_prune_refs
  export _root_.libgit.functions.git_remote_push
  export _root_.libgit.functions.git_remote_pushurl
  export _root_.libgit.functions.git_remote_refspec_count
  export _root_.libgit.functions.git_remote_rename
  export _root_.libgit.functions.git_remote_set_autotag
  export _root_.libgit.functions.git_remote_set_instance_pushurl
  export _root_.libgit.functions.git_remote_set_instance_url
  export _root_.libgit.functions.git_remote_set_pushurl
  export _root_.libgit.functions.git_remote_set_url
  export _root_.libgit.functions.git_remote_stats
  export _root_.libgit.functions.git_remote_stop
  export _root_.libgit.functions.git_remote_update_tips
  export _root_.libgit.functions.git_remote_upload
  export _root_.libgit.functions.git_remote_url
  export _root_.libgit.functions.git_repository_commondir
  export _root_.libgit.functions.git_repository_config
  export _root_.libgit.functions.git_repository_config_snapshot
  export _root_.libgit.functions.git_repository_detach_head
  export _root_.libgit.functions.git_repository_discover
  export _root_.libgit.functions.git_repository_fetchhead_foreach
  export _root_.libgit.functions.git_repository_free
  export _root_.libgit.functions.git_repository_get_namespace
  export _root_.libgit.functions.git_repository_hashfile
  export _root_.libgit.functions.git_repository_head
  export _root_.libgit.functions.git_repository_head_detached
  export _root_.libgit.functions.git_repository_head_detached_for_worktree
  export _root_.libgit.functions.git_repository_head_for_worktree
  export _root_.libgit.functions.git_repository_head_unborn
  export _root_.libgit.functions.git_repository_ident
  export _root_.libgit.functions.git_repository_index
  export _root_.libgit.functions.git_repository_init
  export _root_.libgit.functions.git_repository_init_ext
  export _root_.libgit.functions.git_repository_init_init_options
  export _root_.libgit.functions.git_repository_init_options_init
  export _root_.libgit.functions.git_repository_is_bare
  export _root_.libgit.functions.git_repository_is_empty
  export _root_.libgit.functions.git_repository_is_shallow
  export _root_.libgit.functions.git_repository_is_worktree
  export _root_.libgit.functions.git_repository_item_path
  export _root_.libgit.functions.git_repository_mergehead_foreach
  export _root_.libgit.functions.git_repository_message
  export _root_.libgit.functions.git_repository_message_remove
  export _root_.libgit.functions.git_repository_odb
  export _root_.libgit.functions.git_repository_oid_type
  export _root_.libgit.functions.git_repository_open
  export _root_.libgit.functions.git_repository_open_bare
  export _root_.libgit.functions.git_repository_open_ext
  export _root_.libgit.functions.git_repository_open_from_worktree
  export _root_.libgit.functions.git_repository_path
  export _root_.libgit.functions.git_repository_refdb
  export _root_.libgit.functions.git_repository_set_head
  export _root_.libgit.functions.git_repository_set_head_detached
  export _root_.libgit.functions.git_repository_set_head_detached_from_annotated
  export _root_.libgit.functions.git_repository_set_ident
  export _root_.libgit.functions.git_repository_set_namespace
  export _root_.libgit.functions.git_repository_set_workdir
  export _root_.libgit.functions.git_repository_state
  export _root_.libgit.functions.git_repository_state_cleanup
  export _root_.libgit.functions.git_repository_workdir
  export _root_.libgit.functions.git_repository_wrap_odb
  export _root_.libgit.functions.git_reset
  export _root_.libgit.functions.git_reset_default
  export _root_.libgit.functions.git_reset_from_annotated
  export _root_.libgit.functions.git_revert
  export _root_.libgit.functions.git_revert_commit
  export _root_.libgit.functions.git_revert_init_options
  export _root_.libgit.functions.git_revert_options_init
  export _root_.libgit.functions.git_revparse
  export _root_.libgit.functions.git_revparse_ext
  export _root_.libgit.functions.git_revparse_single
  export _root_.libgit.functions.git_revwalk_add_hide_cb
  export _root_.libgit.functions.git_revwalk_free
  export _root_.libgit.functions.git_revwalk_hide
  export _root_.libgit.functions.git_revwalk_hide_glob
  export _root_.libgit.functions.git_revwalk_hide_head
  export _root_.libgit.functions.git_revwalk_hide_ref
  export _root_.libgit.functions.git_revwalk_new
  export _root_.libgit.functions.git_revwalk_next
  export _root_.libgit.functions.git_revwalk_push
  export _root_.libgit.functions.git_revwalk_push_glob
  export _root_.libgit.functions.git_revwalk_push_head
  export _root_.libgit.functions.git_revwalk_push_range
  export _root_.libgit.functions.git_revwalk_push_ref
  export _root_.libgit.functions.git_revwalk_repository
  export _root_.libgit.functions.git_revwalk_reset
  export _root_.libgit.functions.git_revwalk_simplify_first_parent
  export _root_.libgit.functions.git_revwalk_sorting
  export _root_.libgit.functions.git_signature_default
  export _root_.libgit.functions.git_signature_dup
  export _root_.libgit.functions.git_signature_free
  export _root_.libgit.functions.git_signature_from_buffer
  export _root_.libgit.functions.git_signature_new
  export _root_.libgit.functions.git_signature_now
  export _root_.libgit.functions.git_stash_apply
  export _root_.libgit.functions.git_stash_apply_init_options
  export _root_.libgit.functions.git_stash_apply_options_init
  export _root_.libgit.functions.git_stash_drop
  export _root_.libgit.functions.git_stash_foreach
  export _root_.libgit.functions.git_stash_pop
  export _root_.libgit.functions.git_stash_save
  export _root_.libgit.functions.git_stash_save_options_init
  export _root_.libgit.functions.git_stash_save_with_opts
  export _root_.libgit.functions.git_status_byindex
  export _root_.libgit.functions.git_status_file
  export _root_.libgit.functions.git_status_foreach
  export _root_.libgit.functions.git_status_foreach_ext
  export _root_.libgit.functions.git_status_init_options
  export _root_.libgit.functions.git_status_list_entrycount
  export _root_.libgit.functions.git_status_list_free
  export _root_.libgit.functions.git_status_list_new
  export _root_.libgit.functions.git_status_options_init
  export _root_.libgit.functions.git_status_should_ignore
  export _root_.libgit.functions.git_strarray_copy
  export _root_.libgit.functions.git_strarray_dispose
  export _root_.libgit.functions.git_strarray_free
  export _root_.libgit.functions.git_submodule_add_finalize
  export _root_.libgit.functions.git_submodule_add_setup
  export _root_.libgit.functions.git_submodule_add_to_index
  export _root_.libgit.functions.git_submodule_branch
  export _root_.libgit.functions.git_submodule_clone
  export _root_.libgit.functions.git_submodule_dup
  export _root_.libgit.functions.git_submodule_fetch_recurse_submodules
  export _root_.libgit.functions.git_submodule_foreach
  export _root_.libgit.functions.git_submodule_free
  export _root_.libgit.functions.git_submodule_head_id
  export _root_.libgit.functions.git_submodule_ignore
  export _root_.libgit.functions.git_submodule_index_id
  export _root_.libgit.functions.git_submodule_init
  export _root_.libgit.functions.git_submodule_location
  export _root_.libgit.functions.git_submodule_lookup
  export _root_.libgit.functions.git_submodule_name
  export _root_.libgit.functions.git_submodule_open
  export _root_.libgit.functions.git_submodule_owner
  export _root_.libgit.functions.git_submodule_path
  export _root_.libgit.functions.git_submodule_reload
  export _root_.libgit.functions.git_submodule_repo_init
  export _root_.libgit.functions.git_submodule_resolve_url
  export _root_.libgit.functions.git_submodule_set_branch
  export _root_.libgit.functions.git_submodule_set_fetch_recurse_submodules
  export _root_.libgit.functions.git_submodule_set_ignore
  export _root_.libgit.functions.git_submodule_set_update
  export _root_.libgit.functions.git_submodule_set_url
  export _root_.libgit.functions.git_submodule_status
  export _root_.libgit.functions.git_submodule_sync
  export _root_.libgit.functions.git_submodule_update
  export _root_.libgit.functions.git_submodule_update_init_options
  export _root_.libgit.functions.git_submodule_update_options_init
  export _root_.libgit.functions.git_submodule_update_strategy
  export _root_.libgit.functions.git_submodule_url
  export _root_.libgit.functions.git_submodule_wd_id
  export _root_.libgit.functions.git_tag_annotation_create
  export _root_.libgit.functions.git_tag_create
  export _root_.libgit.functions.git_tag_create_from_buffer
  export _root_.libgit.functions.git_tag_create_frombuffer
  export _root_.libgit.functions.git_tag_create_lightweight
  export _root_.libgit.functions.git_tag_delete
  export _root_.libgit.functions.git_tag_dup
  export _root_.libgit.functions.git_tag_foreach
  export _root_.libgit.functions.git_tag_free
  export _root_.libgit.functions.git_tag_id
  export _root_.libgit.functions.git_tag_list
  export _root_.libgit.functions.git_tag_list_match
  export _root_.libgit.functions.git_tag_lookup
  export _root_.libgit.functions.git_tag_lookup_prefix
  export _root_.libgit.functions.git_tag_message
  export _root_.libgit.functions.git_tag_name
  export _root_.libgit.functions.git_tag_name_is_valid
  export _root_.libgit.functions.git_tag_owner
  export _root_.libgit.functions.git_tag_peel
  export _root_.libgit.functions.git_tag_tagger
  export _root_.libgit.functions.git_tag_target
  export _root_.libgit.functions.git_tag_target_id
  export _root_.libgit.functions.git_tag_target_type
  export _root_.libgit.functions.git_trace_set
  export _root_.libgit.functions.git_transaction_commit
  export _root_.libgit.functions.git_transaction_free
  export _root_.libgit.functions.git_transaction_lock_ref
  export _root_.libgit.functions.git_transaction_new
  export _root_.libgit.functions.git_transaction_remove
  export _root_.libgit.functions.git_transaction_set_reflog
  export _root_.libgit.functions.git_transaction_set_symbolic_target
  export _root_.libgit.functions.git_transaction_set_target
  export _root_.libgit.functions.git_tree_create_updated
  export _root_.libgit.functions.git_tree_dup
  export _root_.libgit.functions.git_tree_entry_byid
  export _root_.libgit.functions.git_tree_entry_byindex
  export _root_.libgit.functions.git_tree_entry_byname
  export _root_.libgit.functions.git_tree_entry_bypath
  export _root_.libgit.functions.git_tree_entry_cmp
  export _root_.libgit.functions.git_tree_entry_dup
  export _root_.libgit.functions.git_tree_entry_filemode
  export _root_.libgit.functions.git_tree_entry_filemode_raw
  export _root_.libgit.functions.git_tree_entry_free
  export _root_.libgit.functions.git_tree_entry_id
  export _root_.libgit.functions.git_tree_entry_name
  export _root_.libgit.functions.git_tree_entry_to_object
  export _root_.libgit.functions.git_tree_entry_type
  export _root_.libgit.functions.git_tree_entrycount
  export _root_.libgit.functions.git_tree_free
  export _root_.libgit.functions.git_tree_id
  export _root_.libgit.functions.git_tree_lookup
  export _root_.libgit.functions.git_tree_lookup_prefix
  export _root_.libgit.functions.git_tree_owner
  export _root_.libgit.functions.git_tree_walk
  export _root_.libgit.functions.git_treebuilder_clear
  export _root_.libgit.functions.git_treebuilder_entrycount
  export _root_.libgit.functions.git_treebuilder_filter
  export _root_.libgit.functions.git_treebuilder_free
  export _root_.libgit.functions.git_treebuilder_get
  export _root_.libgit.functions.git_treebuilder_insert
  export _root_.libgit.functions.git_treebuilder_new
  export _root_.libgit.functions.git_treebuilder_remove
  export _root_.libgit.functions.git_treebuilder_write
  export _root_.libgit.functions.git_treebuilder_write_with_buffer
  export _root_.libgit.functions.git_worktree_add
  export _root_.libgit.functions.git_worktree_add_init_options
  export _root_.libgit.functions.git_worktree_add_options_init
  export _root_.libgit.functions.git_worktree_free
  export _root_.libgit.functions.git_worktree_is_locked
  export _root_.libgit.functions.git_worktree_is_prunable
  export _root_.libgit.functions.git_worktree_list
  export _root_.libgit.functions.git_worktree_lock
  export _root_.libgit.functions.git_worktree_lookup
  export _root_.libgit.functions.git_worktree_name
  export _root_.libgit.functions.git_worktree_open_from_repository
  export _root_.libgit.functions.git_worktree_path
  export _root_.libgit.functions.git_worktree_prune
  export _root_.libgit.functions.git_worktree_prune_init_options
  export _root_.libgit.functions.git_worktree_prune_options_init
  export _root_.libgit.functions.git_worktree_unlock
  export _root_.libgit.functions.git_worktree_validate
  export _root_.libgit.functions.giterr_clear
  export _root_.libgit.functions.giterr_last
  export _root_.libgit.functions.giterr_set_oom
  export _root_.libgit.functions.giterr_set_str
end all
