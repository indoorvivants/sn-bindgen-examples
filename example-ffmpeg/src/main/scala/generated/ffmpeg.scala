package ffmpeg

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[ffmpeg] trait _BindgenEnumCInt[T](using eq: T =:= CInt):
    given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def value: CInt = eq.apply(t)
      inline def int: CInt = eq.apply(t).toInt
  private[ffmpeg] trait _BindgenEnumCUnsignedInt[T](using
      eq: T =:= CUnsignedInt
  ):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def value: CUnsignedInt = eq.apply(t)
      inline def int: CInt = eq.apply(t).toInt
      inline def uint: CUnsignedInt = eq.apply(t)
end predef

object enumerations:
  import predef.*
  opaque type AVActiveFormatDescription = CUnsignedInt
  object AVActiveFormatDescription
      extends _BindgenEnumCUnsignedInt[AVActiveFormatDescription]:
    given _tag: Tag[AVActiveFormatDescription] = Tag.UInt
    inline def define(inline a: Long): AVActiveFormatDescription = a.toUInt
    val AV_AFD_SAME = define(8)
    val AV_AFD_4_3 = define(9)
    val AV_AFD_16_9 = define(10)
    val AV_AFD_14_9 = define(11)
    val AV_AFD_4_3_SP_14_9 = define(13)
    val AV_AFD_16_9_SP_14_9 = define(14)
    val AV_AFD_SP_4_3 = define(15)
    def getName(value: AVActiveFormatDescription): Option[String] =
      value match
        case `AV_AFD_SAME`         => Some("AV_AFD_SAME")
        case `AV_AFD_4_3`          => Some("AV_AFD_4_3")
        case `AV_AFD_16_9`         => Some("AV_AFD_16_9")
        case `AV_AFD_14_9`         => Some("AV_AFD_14_9")
        case `AV_AFD_4_3_SP_14_9`  => Some("AV_AFD_4_3_SP_14_9")
        case `AV_AFD_16_9_SP_14_9` => Some("AV_AFD_16_9_SP_14_9")
        case `AV_AFD_SP_4_3`       => Some("AV_AFD_SP_4_3")
        case _                     => _root_.scala.None
    extension (a: AVActiveFormatDescription)
      inline def &(b: AVActiveFormatDescription): AVActiveFormatDescription =
        a & b
      inline def |(b: AVActiveFormatDescription): AVActiveFormatDescription =
        a | b
      inline def is(b: AVActiveFormatDescription): Boolean = (a & b) == b
  end AVActiveFormatDescription

  opaque type AVAudioServiceType = CUnsignedInt
  object AVAudioServiceType
      extends _BindgenEnumCUnsignedInt[AVAudioServiceType]:
    given _tag: Tag[AVAudioServiceType] = Tag.UInt
    inline def define(inline a: Long): AVAudioServiceType = a.toUInt
    val AV_AUDIO_SERVICE_TYPE_MAIN = define(0)
    val AV_AUDIO_SERVICE_TYPE_EFFECTS = define(1)
    val AV_AUDIO_SERVICE_TYPE_VISUALLY_IMPAIRED = define(2)
    val AV_AUDIO_SERVICE_TYPE_HEARING_IMPAIRED = define(3)
    val AV_AUDIO_SERVICE_TYPE_DIALOGUE = define(4)
    val AV_AUDIO_SERVICE_TYPE_COMMENTARY = define(5)
    val AV_AUDIO_SERVICE_TYPE_EMERGENCY = define(6)
    val AV_AUDIO_SERVICE_TYPE_VOICE_OVER = define(7)
    val AV_AUDIO_SERVICE_TYPE_KARAOKE = define(8)
    val AV_AUDIO_SERVICE_TYPE_NB = define(9)
    def getName(value: AVAudioServiceType): Option[String] =
      value match
        case `AV_AUDIO_SERVICE_TYPE_MAIN` => Some("AV_AUDIO_SERVICE_TYPE_MAIN")
        case `AV_AUDIO_SERVICE_TYPE_EFFECTS` =>
          Some("AV_AUDIO_SERVICE_TYPE_EFFECTS")
        case `AV_AUDIO_SERVICE_TYPE_VISUALLY_IMPAIRED` =>
          Some("AV_AUDIO_SERVICE_TYPE_VISUALLY_IMPAIRED")
        case `AV_AUDIO_SERVICE_TYPE_HEARING_IMPAIRED` =>
          Some("AV_AUDIO_SERVICE_TYPE_HEARING_IMPAIRED")
        case `AV_AUDIO_SERVICE_TYPE_DIALOGUE` =>
          Some("AV_AUDIO_SERVICE_TYPE_DIALOGUE")
        case `AV_AUDIO_SERVICE_TYPE_COMMENTARY` =>
          Some("AV_AUDIO_SERVICE_TYPE_COMMENTARY")
        case `AV_AUDIO_SERVICE_TYPE_EMERGENCY` =>
          Some("AV_AUDIO_SERVICE_TYPE_EMERGENCY")
        case `AV_AUDIO_SERVICE_TYPE_VOICE_OVER` =>
          Some("AV_AUDIO_SERVICE_TYPE_VOICE_OVER")
        case `AV_AUDIO_SERVICE_TYPE_KARAOKE` =>
          Some("AV_AUDIO_SERVICE_TYPE_KARAOKE")
        case `AV_AUDIO_SERVICE_TYPE_NB` => Some("AV_AUDIO_SERVICE_TYPE_NB")
        case _                          => _root_.scala.None
    extension (a: AVAudioServiceType)
      inline def &(b: AVAudioServiceType): AVAudioServiceType = a & b
      inline def |(b: AVAudioServiceType): AVAudioServiceType = a | b
      inline def is(b: AVAudioServiceType): Boolean = (a & b) == b
  end AVAudioServiceType

  /** Audio channel layout utility functions
    */
  opaque type AVChannel = CInt
  object AVChannel extends _BindgenEnumCInt[AVChannel]:
    given _tag: Tag[AVChannel] = Tag.Int
    inline def define(inline a: CInt): AVChannel = a
    val AV_CHAN_NONE = define(-1)
    val AV_CHAN_FRONT_LEFT = define(0)
    val AV_CHAN_FRONT_RIGHT = define(1)
    val AV_CHAN_FRONT_CENTER = define(2)
    val AV_CHAN_LOW_FREQUENCY = define(3)
    val AV_CHAN_BACK_LEFT = define(4)
    val AV_CHAN_BACK_RIGHT = define(5)
    val AV_CHAN_FRONT_LEFT_OF_CENTER = define(6)
    val AV_CHAN_FRONT_RIGHT_OF_CENTER = define(7)
    val AV_CHAN_BACK_CENTER = define(8)
    val AV_CHAN_SIDE_LEFT = define(9)
    val AV_CHAN_SIDE_RIGHT = define(10)
    val AV_CHAN_TOP_CENTER = define(11)
    val AV_CHAN_TOP_FRONT_LEFT = define(12)
    val AV_CHAN_TOP_FRONT_CENTER = define(13)
    val AV_CHAN_TOP_FRONT_RIGHT = define(14)
    val AV_CHAN_TOP_BACK_LEFT = define(15)
    val AV_CHAN_TOP_BACK_CENTER = define(16)
    val AV_CHAN_TOP_BACK_RIGHT = define(17)
    val AV_CHAN_STEREO_LEFT = define(29)
    val AV_CHAN_STEREO_RIGHT = define(30)
    val AV_CHAN_WIDE_LEFT = define(31)
    val AV_CHAN_WIDE_RIGHT = define(32)
    val AV_CHAN_SURROUND_DIRECT_LEFT = define(33)
    val AV_CHAN_SURROUND_DIRECT_RIGHT = define(34)
    val AV_CHAN_LOW_FREQUENCY_2 = define(35)
    val AV_CHAN_TOP_SIDE_LEFT = define(36)
    val AV_CHAN_TOP_SIDE_RIGHT = define(37)
    val AV_CHAN_BOTTOM_FRONT_CENTER = define(38)
    val AV_CHAN_BOTTOM_FRONT_LEFT = define(39)
    val AV_CHAN_BOTTOM_FRONT_RIGHT = define(40)
    val AV_CHAN_SIDE_SURROUND_LEFT = define(41)
    val AV_CHAN_SIDE_SURROUND_RIGHT = define(42)
    val AV_CHAN_TOP_SURROUND_LEFT = define(43)
    val AV_CHAN_TOP_SURROUND_RIGHT = define(44)
    val AV_CHAN_UNUSED = define(512)
    val AV_CHAN_UNKNOWN = define(768)
    val AV_CHAN_AMBISONIC_BASE = define(1024)
    val AV_CHAN_AMBISONIC_END = define(2047)
    def getName(value: AVChannel): Option[String] =
      value match
        case `AV_CHAN_NONE`                 => Some("AV_CHAN_NONE")
        case `AV_CHAN_FRONT_LEFT`           => Some("AV_CHAN_FRONT_LEFT")
        case `AV_CHAN_FRONT_RIGHT`          => Some("AV_CHAN_FRONT_RIGHT")
        case `AV_CHAN_FRONT_CENTER`         => Some("AV_CHAN_FRONT_CENTER")
        case `AV_CHAN_LOW_FREQUENCY`        => Some("AV_CHAN_LOW_FREQUENCY")
        case `AV_CHAN_BACK_LEFT`            => Some("AV_CHAN_BACK_LEFT")
        case `AV_CHAN_BACK_RIGHT`           => Some("AV_CHAN_BACK_RIGHT")
        case `AV_CHAN_FRONT_LEFT_OF_CENTER` =>
          Some("AV_CHAN_FRONT_LEFT_OF_CENTER")
        case `AV_CHAN_FRONT_RIGHT_OF_CENTER` =>
          Some("AV_CHAN_FRONT_RIGHT_OF_CENTER")
        case `AV_CHAN_BACK_CENTER`          => Some("AV_CHAN_BACK_CENTER")
        case `AV_CHAN_SIDE_LEFT`            => Some("AV_CHAN_SIDE_LEFT")
        case `AV_CHAN_SIDE_RIGHT`           => Some("AV_CHAN_SIDE_RIGHT")
        case `AV_CHAN_TOP_CENTER`           => Some("AV_CHAN_TOP_CENTER")
        case `AV_CHAN_TOP_FRONT_LEFT`       => Some("AV_CHAN_TOP_FRONT_LEFT")
        case `AV_CHAN_TOP_FRONT_CENTER`     => Some("AV_CHAN_TOP_FRONT_CENTER")
        case `AV_CHAN_TOP_FRONT_RIGHT`      => Some("AV_CHAN_TOP_FRONT_RIGHT")
        case `AV_CHAN_TOP_BACK_LEFT`        => Some("AV_CHAN_TOP_BACK_LEFT")
        case `AV_CHAN_TOP_BACK_CENTER`      => Some("AV_CHAN_TOP_BACK_CENTER")
        case `AV_CHAN_TOP_BACK_RIGHT`       => Some("AV_CHAN_TOP_BACK_RIGHT")
        case `AV_CHAN_STEREO_LEFT`          => Some("AV_CHAN_STEREO_LEFT")
        case `AV_CHAN_STEREO_RIGHT`         => Some("AV_CHAN_STEREO_RIGHT")
        case `AV_CHAN_WIDE_LEFT`            => Some("AV_CHAN_WIDE_LEFT")
        case `AV_CHAN_WIDE_RIGHT`           => Some("AV_CHAN_WIDE_RIGHT")
        case `AV_CHAN_SURROUND_DIRECT_LEFT` =>
          Some("AV_CHAN_SURROUND_DIRECT_LEFT")
        case `AV_CHAN_SURROUND_DIRECT_RIGHT` =>
          Some("AV_CHAN_SURROUND_DIRECT_RIGHT")
        case `AV_CHAN_LOW_FREQUENCY_2`     => Some("AV_CHAN_LOW_FREQUENCY_2")
        case `AV_CHAN_TOP_SIDE_LEFT`       => Some("AV_CHAN_TOP_SIDE_LEFT")
        case `AV_CHAN_TOP_SIDE_RIGHT`      => Some("AV_CHAN_TOP_SIDE_RIGHT")
        case `AV_CHAN_BOTTOM_FRONT_CENTER` =>
          Some("AV_CHAN_BOTTOM_FRONT_CENTER")
        case `AV_CHAN_BOTTOM_FRONT_LEFT`   => Some("AV_CHAN_BOTTOM_FRONT_LEFT")
        case `AV_CHAN_BOTTOM_FRONT_RIGHT`  => Some("AV_CHAN_BOTTOM_FRONT_RIGHT")
        case `AV_CHAN_SIDE_SURROUND_LEFT`  => Some("AV_CHAN_SIDE_SURROUND_LEFT")
        case `AV_CHAN_SIDE_SURROUND_RIGHT` =>
          Some("AV_CHAN_SIDE_SURROUND_RIGHT")
        case `AV_CHAN_TOP_SURROUND_LEFT`  => Some("AV_CHAN_TOP_SURROUND_LEFT")
        case `AV_CHAN_TOP_SURROUND_RIGHT` => Some("AV_CHAN_TOP_SURROUND_RIGHT")
        case `AV_CHAN_UNUSED`             => Some("AV_CHAN_UNUSED")
        case `AV_CHAN_UNKNOWN`            => Some("AV_CHAN_UNKNOWN")
        case `AV_CHAN_AMBISONIC_BASE`     => Some("AV_CHAN_AMBISONIC_BASE")
        case `AV_CHAN_AMBISONIC_END`      => Some("AV_CHAN_AMBISONIC_END")
        case _                            => _root_.scala.None
    extension (a: AVChannel)
      inline def &(b: AVChannel): AVChannel = a & b
      inline def |(b: AVChannel): AVChannel = a | b
      inline def is(b: AVChannel): Boolean = (a & b) == b
  end AVChannel

  opaque type AVChannelOrder = CUnsignedInt
  object AVChannelOrder extends _BindgenEnumCUnsignedInt[AVChannelOrder]:
    given _tag: Tag[AVChannelOrder] = Tag.UInt
    inline def define(inline a: Long): AVChannelOrder = a.toUInt
    val AV_CHANNEL_ORDER_UNSPEC = define(0)
    val AV_CHANNEL_ORDER_NATIVE = define(1)
    val AV_CHANNEL_ORDER_CUSTOM = define(2)
    val AV_CHANNEL_ORDER_AMBISONIC = define(3)
    val FF_CHANNEL_ORDER_NB = define(4)
    def getName(value: AVChannelOrder): Option[String] =
      value match
        case `AV_CHANNEL_ORDER_UNSPEC`    => Some("AV_CHANNEL_ORDER_UNSPEC")
        case `AV_CHANNEL_ORDER_NATIVE`    => Some("AV_CHANNEL_ORDER_NATIVE")
        case `AV_CHANNEL_ORDER_CUSTOM`    => Some("AV_CHANNEL_ORDER_CUSTOM")
        case `AV_CHANNEL_ORDER_AMBISONIC` => Some("AV_CHANNEL_ORDER_AMBISONIC")
        case `FF_CHANNEL_ORDER_NB`        => Some("FF_CHANNEL_ORDER_NB")
        case _                            => _root_.scala.None
    extension (a: AVChannelOrder)
      inline def &(b: AVChannelOrder): AVChannelOrder = a & b
      inline def |(b: AVChannelOrder): AVChannelOrder = a | b
      inline def is(b: AVChannelOrder): Boolean = (a & b) == b
  end AVChannelOrder

  /** Location of chroma samples.
    */
  opaque type AVChromaLocation = CUnsignedInt
  object AVChromaLocation extends _BindgenEnumCUnsignedInt[AVChromaLocation]:
    given _tag: Tag[AVChromaLocation] = Tag.UInt
    inline def define(inline a: Long): AVChromaLocation = a.toUInt
    val AVCHROMA_LOC_UNSPECIFIED = define(0)
    val AVCHROMA_LOC_LEFT = define(1)
    val AVCHROMA_LOC_CENTER = define(2)
    val AVCHROMA_LOC_TOPLEFT = define(3)
    val AVCHROMA_LOC_TOP = define(4)
    val AVCHROMA_LOC_BOTTOMLEFT = define(5)
    val AVCHROMA_LOC_BOTTOM = define(6)
    val AVCHROMA_LOC_NB = define(7)
    def getName(value: AVChromaLocation): Option[String] =
      value match
        case `AVCHROMA_LOC_UNSPECIFIED` => Some("AVCHROMA_LOC_UNSPECIFIED")
        case `AVCHROMA_LOC_LEFT`        => Some("AVCHROMA_LOC_LEFT")
        case `AVCHROMA_LOC_CENTER`      => Some("AVCHROMA_LOC_CENTER")
        case `AVCHROMA_LOC_TOPLEFT`     => Some("AVCHROMA_LOC_TOPLEFT")
        case `AVCHROMA_LOC_TOP`         => Some("AVCHROMA_LOC_TOP")
        case `AVCHROMA_LOC_BOTTOMLEFT`  => Some("AVCHROMA_LOC_BOTTOMLEFT")
        case `AVCHROMA_LOC_BOTTOM`      => Some("AVCHROMA_LOC_BOTTOM")
        case `AVCHROMA_LOC_NB`          => Some("AVCHROMA_LOC_NB")
        case _                          => _root_.scala.None
    extension (a: AVChromaLocation)
      inline def &(b: AVChromaLocation): AVChromaLocation = a & b
      inline def |(b: AVChromaLocation): AVChromaLocation = a | b
      inline def is(b: AVChromaLocation): Boolean = (a & b) == b
  end AVChromaLocation

  opaque type AVClassCategory = CUnsignedInt
  object AVClassCategory extends _BindgenEnumCUnsignedInt[AVClassCategory]:
    given _tag: Tag[AVClassCategory] = Tag.UInt
    inline def define(inline a: Long): AVClassCategory = a.toUInt
    val AV_CLASS_CATEGORY_NA = define(0)
    val AV_CLASS_CATEGORY_INPUT = define(1)
    val AV_CLASS_CATEGORY_OUTPUT = define(2)
    val AV_CLASS_CATEGORY_MUXER = define(3)
    val AV_CLASS_CATEGORY_DEMUXER = define(4)
    val AV_CLASS_CATEGORY_ENCODER = define(5)
    val AV_CLASS_CATEGORY_DECODER = define(6)
    val AV_CLASS_CATEGORY_FILTER = define(7)
    val AV_CLASS_CATEGORY_BITSTREAM_FILTER = define(8)
    val AV_CLASS_CATEGORY_SWSCALER = define(9)
    val AV_CLASS_CATEGORY_SWRESAMPLER = define(10)
    val AV_CLASS_CATEGORY_DEVICE_VIDEO_OUTPUT = define(40)
    val AV_CLASS_CATEGORY_DEVICE_VIDEO_INPUT = define(41)
    val AV_CLASS_CATEGORY_DEVICE_AUDIO_OUTPUT = define(42)
    val AV_CLASS_CATEGORY_DEVICE_AUDIO_INPUT = define(43)
    val AV_CLASS_CATEGORY_DEVICE_OUTPUT = define(44)
    val AV_CLASS_CATEGORY_DEVICE_INPUT = define(45)
    val AV_CLASS_CATEGORY_NB = define(46)
    def getName(value: AVClassCategory): Option[String] =
      value match
        case `AV_CLASS_CATEGORY_NA`      => Some("AV_CLASS_CATEGORY_NA")
        case `AV_CLASS_CATEGORY_INPUT`   => Some("AV_CLASS_CATEGORY_INPUT")
        case `AV_CLASS_CATEGORY_OUTPUT`  => Some("AV_CLASS_CATEGORY_OUTPUT")
        case `AV_CLASS_CATEGORY_MUXER`   => Some("AV_CLASS_CATEGORY_MUXER")
        case `AV_CLASS_CATEGORY_DEMUXER` => Some("AV_CLASS_CATEGORY_DEMUXER")
        case `AV_CLASS_CATEGORY_ENCODER` => Some("AV_CLASS_CATEGORY_ENCODER")
        case `AV_CLASS_CATEGORY_DECODER` => Some("AV_CLASS_CATEGORY_DECODER")
        case `AV_CLASS_CATEGORY_FILTER`  => Some("AV_CLASS_CATEGORY_FILTER")
        case `AV_CLASS_CATEGORY_BITSTREAM_FILTER` =>
          Some("AV_CLASS_CATEGORY_BITSTREAM_FILTER")
        case `AV_CLASS_CATEGORY_SWSCALER` => Some("AV_CLASS_CATEGORY_SWSCALER")
        case `AV_CLASS_CATEGORY_SWRESAMPLER` =>
          Some("AV_CLASS_CATEGORY_SWRESAMPLER")
        case `AV_CLASS_CATEGORY_DEVICE_VIDEO_OUTPUT` =>
          Some("AV_CLASS_CATEGORY_DEVICE_VIDEO_OUTPUT")
        case `AV_CLASS_CATEGORY_DEVICE_VIDEO_INPUT` =>
          Some("AV_CLASS_CATEGORY_DEVICE_VIDEO_INPUT")
        case `AV_CLASS_CATEGORY_DEVICE_AUDIO_OUTPUT` =>
          Some("AV_CLASS_CATEGORY_DEVICE_AUDIO_OUTPUT")
        case `AV_CLASS_CATEGORY_DEVICE_AUDIO_INPUT` =>
          Some("AV_CLASS_CATEGORY_DEVICE_AUDIO_INPUT")
        case `AV_CLASS_CATEGORY_DEVICE_OUTPUT` =>
          Some("AV_CLASS_CATEGORY_DEVICE_OUTPUT")
        case `AV_CLASS_CATEGORY_DEVICE_INPUT` =>
          Some("AV_CLASS_CATEGORY_DEVICE_INPUT")
        case `AV_CLASS_CATEGORY_NB` => Some("AV_CLASS_CATEGORY_NB")
        case _                      => _root_.scala.None
    extension (a: AVClassCategory)
      inline def &(b: AVClassCategory): AVClassCategory = a & b
      inline def |(b: AVClassCategory): AVClassCategory = a | b
      inline def is(b: AVClassCategory): Boolean = (a & b) == b
  end AVClassCategory

  opaque type AVCodecConfig = CUnsignedInt
  object AVCodecConfig extends _BindgenEnumCUnsignedInt[AVCodecConfig]:
    given _tag: Tag[AVCodecConfig] = Tag.UInt
    inline def define(inline a: Long): AVCodecConfig = a.toUInt
    val AV_CODEC_CONFIG_PIX_FORMAT = define(0)
    val AV_CODEC_CONFIG_FRAME_RATE = define(1)
    val AV_CODEC_CONFIG_SAMPLE_RATE = define(2)
    val AV_CODEC_CONFIG_SAMPLE_FORMAT = define(3)
    val AV_CODEC_CONFIG_CHANNEL_LAYOUT = define(4)
    val AV_CODEC_CONFIG_COLOR_RANGE = define(5)
    val AV_CODEC_CONFIG_COLOR_SPACE = define(6)
    def getName(value: AVCodecConfig): Option[String] =
      value match
        case `AV_CODEC_CONFIG_PIX_FORMAT`  => Some("AV_CODEC_CONFIG_PIX_FORMAT")
        case `AV_CODEC_CONFIG_FRAME_RATE`  => Some("AV_CODEC_CONFIG_FRAME_RATE")
        case `AV_CODEC_CONFIG_SAMPLE_RATE` =>
          Some("AV_CODEC_CONFIG_SAMPLE_RATE")
        case `AV_CODEC_CONFIG_SAMPLE_FORMAT` =>
          Some("AV_CODEC_CONFIG_SAMPLE_FORMAT")
        case `AV_CODEC_CONFIG_CHANNEL_LAYOUT` =>
          Some("AV_CODEC_CONFIG_CHANNEL_LAYOUT")
        case `AV_CODEC_CONFIG_COLOR_RANGE` =>
          Some("AV_CODEC_CONFIG_COLOR_RANGE")
        case `AV_CODEC_CONFIG_COLOR_SPACE` =>
          Some("AV_CODEC_CONFIG_COLOR_SPACE")
        case _ => _root_.scala.None
    extension (a: AVCodecConfig)
      inline def &(b: AVCodecConfig): AVCodecConfig = a & b
      inline def |(b: AVCodecConfig): AVCodecConfig = a | b
      inline def is(b: AVCodecConfig): Boolean = (a & b) == b
  end AVCodecConfig

  /** Identify the syntax and semantics of the bitstream. The principle is
    * roughly: Two decoders with the same ID can decode the same streams. Two
    * encoders with the same ID can encode compatible streams. There may be
    * slight deviations from the principle due to implementation details.
    */
  opaque type AVCodecID = CUnsignedInt
  object AVCodecID extends _BindgenEnumCUnsignedInt[AVCodecID]:
    given _tag: Tag[AVCodecID] = Tag.UInt
    inline def define(inline a: Long): AVCodecID = a.toUInt
    val AV_CODEC_ID_NONE = define(0)
    val AV_CODEC_ID_MPEG1VIDEO = define(1)
    val AV_CODEC_ID_MPEG2VIDEO = define(2)
    val AV_CODEC_ID_H261 = define(3)
    val AV_CODEC_ID_H263 = define(4)
    val AV_CODEC_ID_RV10 = define(5)
    val AV_CODEC_ID_RV20 = define(6)
    val AV_CODEC_ID_MJPEG = define(7)
    val AV_CODEC_ID_MJPEGB = define(8)
    val AV_CODEC_ID_LJPEG = define(9)
    val AV_CODEC_ID_SP5X = define(10)
    val AV_CODEC_ID_JPEGLS = define(11)
    val AV_CODEC_ID_MPEG4 = define(12)
    val AV_CODEC_ID_RAWVIDEO = define(13)
    val AV_CODEC_ID_MSMPEG4V1 = define(14)
    val AV_CODEC_ID_MSMPEG4V2 = define(15)
    val AV_CODEC_ID_MSMPEG4V3 = define(16)
    val AV_CODEC_ID_WMV1 = define(17)
    val AV_CODEC_ID_WMV2 = define(18)
    val AV_CODEC_ID_H263P = define(19)
    val AV_CODEC_ID_H263I = define(20)
    val AV_CODEC_ID_FLV1 = define(21)
    val AV_CODEC_ID_SVQ1 = define(22)
    val AV_CODEC_ID_SVQ3 = define(23)
    val AV_CODEC_ID_DVVIDEO = define(24)
    val AV_CODEC_ID_HUFFYUV = define(25)
    val AV_CODEC_ID_CYUV = define(26)
    val AV_CODEC_ID_H264 = define(27)
    val AV_CODEC_ID_INDEO3 = define(28)
    val AV_CODEC_ID_VP3 = define(29)
    val AV_CODEC_ID_THEORA = define(30)
    val AV_CODEC_ID_ASV1 = define(31)
    val AV_CODEC_ID_ASV2 = define(32)
    val AV_CODEC_ID_FFV1 = define(33)
    val AV_CODEC_ID_4XM = define(34)
    val AV_CODEC_ID_VCR1 = define(35)
    val AV_CODEC_ID_CLJR = define(36)
    val AV_CODEC_ID_MDEC = define(37)
    val AV_CODEC_ID_ROQ = define(38)
    val AV_CODEC_ID_INTERPLAY_VIDEO = define(39)
    val AV_CODEC_ID_XAN_WC3 = define(40)
    val AV_CODEC_ID_XAN_WC4 = define(41)
    val AV_CODEC_ID_RPZA = define(42)
    val AV_CODEC_ID_CINEPAK = define(43)
    val AV_CODEC_ID_WS_VQA = define(44)
    val AV_CODEC_ID_MSRLE = define(45)
    val AV_CODEC_ID_MSVIDEO1 = define(46)
    val AV_CODEC_ID_IDCIN = define(47)
    val AV_CODEC_ID_8BPS = define(48)
    val AV_CODEC_ID_SMC = define(49)
    val AV_CODEC_ID_FLIC = define(50)
    val AV_CODEC_ID_TRUEMOTION1 = define(51)
    val AV_CODEC_ID_VMDVIDEO = define(52)
    val AV_CODEC_ID_MSZH = define(53)
    val AV_CODEC_ID_ZLIB = define(54)
    val AV_CODEC_ID_QTRLE = define(55)
    val AV_CODEC_ID_TSCC = define(56)
    val AV_CODEC_ID_ULTI = define(57)
    val AV_CODEC_ID_QDRAW = define(58)
    val AV_CODEC_ID_VIXL = define(59)
    val AV_CODEC_ID_QPEG = define(60)
    val AV_CODEC_ID_PNG = define(61)
    val AV_CODEC_ID_PPM = define(62)
    val AV_CODEC_ID_PBM = define(63)
    val AV_CODEC_ID_PGM = define(64)
    val AV_CODEC_ID_PGMYUV = define(65)
    val AV_CODEC_ID_PAM = define(66)
    val AV_CODEC_ID_FFVHUFF = define(67)
    val AV_CODEC_ID_RV30 = define(68)
    val AV_CODEC_ID_RV40 = define(69)
    val AV_CODEC_ID_VC1 = define(70)
    val AV_CODEC_ID_WMV3 = define(71)
    val AV_CODEC_ID_LOCO = define(72)
    val AV_CODEC_ID_WNV1 = define(73)
    val AV_CODEC_ID_AASC = define(74)
    val AV_CODEC_ID_INDEO2 = define(75)
    val AV_CODEC_ID_FRAPS = define(76)
    val AV_CODEC_ID_TRUEMOTION2 = define(77)
    val AV_CODEC_ID_BMP = define(78)
    val AV_CODEC_ID_CSCD = define(79)
    val AV_CODEC_ID_MMVIDEO = define(80)
    val AV_CODEC_ID_ZMBV = define(81)
    val AV_CODEC_ID_AVS = define(82)
    val AV_CODEC_ID_SMACKVIDEO = define(83)
    val AV_CODEC_ID_NUV = define(84)
    val AV_CODEC_ID_KMVC = define(85)
    val AV_CODEC_ID_FLASHSV = define(86)
    val AV_CODEC_ID_CAVS = define(87)
    val AV_CODEC_ID_JPEG2000 = define(88)
    val AV_CODEC_ID_VMNC = define(89)
    val AV_CODEC_ID_VP5 = define(90)
    val AV_CODEC_ID_VP6 = define(91)
    val AV_CODEC_ID_VP6F = define(92)
    val AV_CODEC_ID_TARGA = define(93)
    val AV_CODEC_ID_DSICINVIDEO = define(94)
    val AV_CODEC_ID_TIERTEXSEQVIDEO = define(95)
    val AV_CODEC_ID_TIFF = define(96)
    val AV_CODEC_ID_GIF = define(97)
    val AV_CODEC_ID_DXA = define(98)
    val AV_CODEC_ID_DNXHD = define(99)
    val AV_CODEC_ID_THP = define(100)
    val AV_CODEC_ID_SGI = define(101)
    val AV_CODEC_ID_C93 = define(102)
    val AV_CODEC_ID_BETHSOFTVID = define(103)
    val AV_CODEC_ID_PTX = define(104)
    val AV_CODEC_ID_TXD = define(105)
    val AV_CODEC_ID_VP6A = define(106)
    val AV_CODEC_ID_AMV = define(107)
    val AV_CODEC_ID_VB = define(108)
    val AV_CODEC_ID_PCX = define(109)
    val AV_CODEC_ID_SUNRAST = define(110)
    val AV_CODEC_ID_INDEO4 = define(111)
    val AV_CODEC_ID_INDEO5 = define(112)
    val AV_CODEC_ID_MIMIC = define(113)
    val AV_CODEC_ID_RL2 = define(114)
    val AV_CODEC_ID_ESCAPE124 = define(115)
    val AV_CODEC_ID_DIRAC = define(116)
    val AV_CODEC_ID_BFI = define(117)
    val AV_CODEC_ID_CMV = define(118)
    val AV_CODEC_ID_MOTIONPIXELS = define(119)
    val AV_CODEC_ID_TGV = define(120)
    val AV_CODEC_ID_TGQ = define(121)
    val AV_CODEC_ID_TQI = define(122)
    val AV_CODEC_ID_AURA = define(123)
    val AV_CODEC_ID_AURA2 = define(124)
    val AV_CODEC_ID_V210X = define(125)
    val AV_CODEC_ID_TMV = define(126)
    val AV_CODEC_ID_V210 = define(127)
    val AV_CODEC_ID_DPX = define(128)
    val AV_CODEC_ID_MAD = define(129)
    val AV_CODEC_ID_FRWU = define(130)
    val AV_CODEC_ID_FLASHSV2 = define(131)
    val AV_CODEC_ID_CDGRAPHICS = define(132)
    val AV_CODEC_ID_R210 = define(133)
    val AV_CODEC_ID_ANM = define(134)
    val AV_CODEC_ID_BINKVIDEO = define(135)
    val AV_CODEC_ID_IFF_ILBM = define(136)
    val AV_CODEC_ID_KGV1 = define(137)
    val AV_CODEC_ID_YOP = define(138)
    val AV_CODEC_ID_VP8 = define(139)
    val AV_CODEC_ID_PICTOR = define(140)
    val AV_CODEC_ID_ANSI = define(141)
    val AV_CODEC_ID_A64_MULTI = define(142)
    val AV_CODEC_ID_A64_MULTI5 = define(143)
    val AV_CODEC_ID_R10K = define(144)
    val AV_CODEC_ID_MXPEG = define(145)
    val AV_CODEC_ID_LAGARITH = define(146)
    val AV_CODEC_ID_PRORES = define(147)
    val AV_CODEC_ID_JV = define(148)
    val AV_CODEC_ID_DFA = define(149)
    val AV_CODEC_ID_WMV3IMAGE = define(150)
    val AV_CODEC_ID_VC1IMAGE = define(151)
    val AV_CODEC_ID_UTVIDEO = define(152)
    val AV_CODEC_ID_BMV_VIDEO = define(153)
    val AV_CODEC_ID_VBLE = define(154)
    val AV_CODEC_ID_DXTORY = define(155)
    val AV_CODEC_ID_V410 = define(156)
    val AV_CODEC_ID_XWD = define(157)
    val AV_CODEC_ID_CDXL = define(158)
    val AV_CODEC_ID_XBM = define(159)
    val AV_CODEC_ID_ZEROCODEC = define(160)
    val AV_CODEC_ID_MSS1 = define(161)
    val AV_CODEC_ID_MSA1 = define(162)
    val AV_CODEC_ID_TSCC2 = define(163)
    val AV_CODEC_ID_MTS2 = define(164)
    val AV_CODEC_ID_CLLC = define(165)
    val AV_CODEC_ID_MSS2 = define(166)
    val AV_CODEC_ID_VP9 = define(167)
    val AV_CODEC_ID_AIC = define(168)
    val AV_CODEC_ID_ESCAPE130 = define(169)
    val AV_CODEC_ID_G2M = define(170)
    val AV_CODEC_ID_WEBP = define(171)
    val AV_CODEC_ID_HNM4_VIDEO = define(172)
    val AV_CODEC_ID_HEVC = define(173)
    val AV_CODEC_ID_FIC = define(174)
    val AV_CODEC_ID_ALIAS_PIX = define(175)
    val AV_CODEC_ID_BRENDER_PIX = define(176)
    val AV_CODEC_ID_PAF_VIDEO = define(177)
    val AV_CODEC_ID_EXR = define(178)
    val AV_CODEC_ID_VP7 = define(179)
    val AV_CODEC_ID_SANM = define(180)
    val AV_CODEC_ID_SGIRLE = define(181)
    val AV_CODEC_ID_MVC1 = define(182)
    val AV_CODEC_ID_MVC2 = define(183)
    val AV_CODEC_ID_HQX = define(184)
    val AV_CODEC_ID_TDSC = define(185)
    val AV_CODEC_ID_HQ_HQA = define(186)
    val AV_CODEC_ID_HAP = define(187)
    val AV_CODEC_ID_DDS = define(188)
    val AV_CODEC_ID_DXV = define(189)
    val AV_CODEC_ID_SCREENPRESSO = define(190)
    val AV_CODEC_ID_RSCC = define(191)
    val AV_CODEC_ID_AVS2 = define(192)
    val AV_CODEC_ID_PGX = define(193)
    val AV_CODEC_ID_AVS3 = define(194)
    val AV_CODEC_ID_MSP2 = define(195)
    val AV_CODEC_ID_VVC = define(196)
    val AV_CODEC_ID_Y41P = define(197)
    val AV_CODEC_ID_AVRP = define(198)
    val AV_CODEC_ID_012V = define(199)
    val AV_CODEC_ID_AVUI = define(200)
    val AV_CODEC_ID_TARGA_Y216 = define(201)
    val AV_CODEC_ID_V308 = define(202)
    val AV_CODEC_ID_V408 = define(203)
    val AV_CODEC_ID_YUV4 = define(204)
    val AV_CODEC_ID_AVRN = define(205)
    val AV_CODEC_ID_CPIA = define(206)
    val AV_CODEC_ID_XFACE = define(207)
    val AV_CODEC_ID_SNOW = define(208)
    val AV_CODEC_ID_SMVJPEG = define(209)
    val AV_CODEC_ID_APNG = define(210)
    val AV_CODEC_ID_DAALA = define(211)
    val AV_CODEC_ID_CFHD = define(212)
    val AV_CODEC_ID_TRUEMOTION2RT = define(213)
    val AV_CODEC_ID_M101 = define(214)
    val AV_CODEC_ID_MAGICYUV = define(215)
    val AV_CODEC_ID_SHEERVIDEO = define(216)
    val AV_CODEC_ID_YLC = define(217)
    val AV_CODEC_ID_PSD = define(218)
    val AV_CODEC_ID_PIXLET = define(219)
    val AV_CODEC_ID_SPEEDHQ = define(220)
    val AV_CODEC_ID_FMVC = define(221)
    val AV_CODEC_ID_SCPR = define(222)
    val AV_CODEC_ID_CLEARVIDEO = define(223)
    val AV_CODEC_ID_XPM = define(224)
    val AV_CODEC_ID_AV1 = define(225)
    val AV_CODEC_ID_BITPACKED = define(226)
    val AV_CODEC_ID_MSCC = define(227)
    val AV_CODEC_ID_SRGC = define(228)
    val AV_CODEC_ID_SVG = define(229)
    val AV_CODEC_ID_GDV = define(230)
    val AV_CODEC_ID_FITS = define(231)
    val AV_CODEC_ID_IMM4 = define(232)
    val AV_CODEC_ID_PROSUMER = define(233)
    val AV_CODEC_ID_MWSC = define(234)
    val AV_CODEC_ID_WCMV = define(235)
    val AV_CODEC_ID_RASC = define(236)
    val AV_CODEC_ID_HYMT = define(237)
    val AV_CODEC_ID_ARBC = define(238)
    val AV_CODEC_ID_AGM = define(239)
    val AV_CODEC_ID_LSCR = define(240)
    val AV_CODEC_ID_VP4 = define(241)
    val AV_CODEC_ID_IMM5 = define(242)
    val AV_CODEC_ID_MVDV = define(243)
    val AV_CODEC_ID_MVHA = define(244)
    val AV_CODEC_ID_CDTOONS = define(245)
    val AV_CODEC_ID_MV30 = define(246)
    val AV_CODEC_ID_NOTCHLC = define(247)
    val AV_CODEC_ID_PFM = define(248)
    val AV_CODEC_ID_MOBICLIP = define(249)
    val AV_CODEC_ID_PHOTOCD = define(250)
    val AV_CODEC_ID_IPU = define(251)
    val AV_CODEC_ID_ARGO = define(252)
    val AV_CODEC_ID_CRI = define(253)
    val AV_CODEC_ID_SIMBIOSIS_IMX = define(254)
    val AV_CODEC_ID_SGA_VIDEO = define(255)
    val AV_CODEC_ID_GEM = define(256)
    val AV_CODEC_ID_VBN = define(257)
    val AV_CODEC_ID_JPEGXL = define(258)
    val AV_CODEC_ID_QOI = define(259)
    val AV_CODEC_ID_PHM = define(260)
    val AV_CODEC_ID_RADIANCE_HDR = define(261)
    val AV_CODEC_ID_WBMP = define(262)
    val AV_CODEC_ID_MEDIA100 = define(263)
    val AV_CODEC_ID_VQC = define(264)
    val AV_CODEC_ID_PDV = define(265)
    val AV_CODEC_ID_EVC = define(266)
    val AV_CODEC_ID_RTV1 = define(267)
    val AV_CODEC_ID_VMIX = define(268)
    val AV_CODEC_ID_LEAD = define(269)
    val AV_CODEC_ID_FIRST_AUDIO = define(65536)
    val AV_CODEC_ID_PCM_S16LE = define(65536)
    val AV_CODEC_ID_PCM_S16BE = define(65537)
    val AV_CODEC_ID_PCM_U16LE = define(65538)
    val AV_CODEC_ID_PCM_U16BE = define(65539)
    val AV_CODEC_ID_PCM_S8 = define(65540)
    val AV_CODEC_ID_PCM_U8 = define(65541)
    val AV_CODEC_ID_PCM_MULAW = define(65542)
    val AV_CODEC_ID_PCM_ALAW = define(65543)
    val AV_CODEC_ID_PCM_S32LE = define(65544)
    val AV_CODEC_ID_PCM_S32BE = define(65545)
    val AV_CODEC_ID_PCM_U32LE = define(65546)
    val AV_CODEC_ID_PCM_U32BE = define(65547)
    val AV_CODEC_ID_PCM_S24LE = define(65548)
    val AV_CODEC_ID_PCM_S24BE = define(65549)
    val AV_CODEC_ID_PCM_U24LE = define(65550)
    val AV_CODEC_ID_PCM_U24BE = define(65551)
    val AV_CODEC_ID_PCM_S24DAUD = define(65552)
    val AV_CODEC_ID_PCM_ZORK = define(65553)
    val AV_CODEC_ID_PCM_S16LE_PLANAR = define(65554)
    val AV_CODEC_ID_PCM_DVD = define(65555)
    val AV_CODEC_ID_PCM_F32BE = define(65556)
    val AV_CODEC_ID_PCM_F32LE = define(65557)
    val AV_CODEC_ID_PCM_F64BE = define(65558)
    val AV_CODEC_ID_PCM_F64LE = define(65559)
    val AV_CODEC_ID_PCM_BLURAY = define(65560)
    val AV_CODEC_ID_PCM_LXF = define(65561)
    val AV_CODEC_ID_S302M = define(65562)
    val AV_CODEC_ID_PCM_S8_PLANAR = define(65563)
    val AV_CODEC_ID_PCM_S24LE_PLANAR = define(65564)
    val AV_CODEC_ID_PCM_S32LE_PLANAR = define(65565)
    val AV_CODEC_ID_PCM_S16BE_PLANAR = define(65566)
    val AV_CODEC_ID_PCM_S64LE = define(65567)
    val AV_CODEC_ID_PCM_S64BE = define(65568)
    val AV_CODEC_ID_PCM_F16LE = define(65569)
    val AV_CODEC_ID_PCM_F24LE = define(65570)
    val AV_CODEC_ID_PCM_VIDC = define(65571)
    val AV_CODEC_ID_PCM_SGA = define(65572)
    val AV_CODEC_ID_ADPCM_IMA_QT = define(69632)
    val AV_CODEC_ID_ADPCM_IMA_WAV = define(69633)
    val AV_CODEC_ID_ADPCM_IMA_DK3 = define(69634)
    val AV_CODEC_ID_ADPCM_IMA_DK4 = define(69635)
    val AV_CODEC_ID_ADPCM_IMA_WS = define(69636)
    val AV_CODEC_ID_ADPCM_IMA_SMJPEG = define(69637)
    val AV_CODEC_ID_ADPCM_MS = define(69638)
    val AV_CODEC_ID_ADPCM_4XM = define(69639)
    val AV_CODEC_ID_ADPCM_XA = define(69640)
    val AV_CODEC_ID_ADPCM_ADX = define(69641)
    val AV_CODEC_ID_ADPCM_EA = define(69642)
    val AV_CODEC_ID_ADPCM_G726 = define(69643)
    val AV_CODEC_ID_ADPCM_CT = define(69644)
    val AV_CODEC_ID_ADPCM_SWF = define(69645)
    val AV_CODEC_ID_ADPCM_YAMAHA = define(69646)
    val AV_CODEC_ID_ADPCM_SBPRO_4 = define(69647)
    val AV_CODEC_ID_ADPCM_SBPRO_3 = define(69648)
    val AV_CODEC_ID_ADPCM_SBPRO_2 = define(69649)
    val AV_CODEC_ID_ADPCM_THP = define(69650)
    val AV_CODEC_ID_ADPCM_IMA_AMV = define(69651)
    val AV_CODEC_ID_ADPCM_EA_R1 = define(69652)
    val AV_CODEC_ID_ADPCM_EA_R3 = define(69653)
    val AV_CODEC_ID_ADPCM_EA_R2 = define(69654)
    val AV_CODEC_ID_ADPCM_IMA_EA_SEAD = define(69655)
    val AV_CODEC_ID_ADPCM_IMA_EA_EACS = define(69656)
    val AV_CODEC_ID_ADPCM_EA_XAS = define(69657)
    val AV_CODEC_ID_ADPCM_EA_MAXIS_XA = define(69658)
    val AV_CODEC_ID_ADPCM_IMA_ISS = define(69659)
    val AV_CODEC_ID_ADPCM_G722 = define(69660)
    val AV_CODEC_ID_ADPCM_IMA_APC = define(69661)
    val AV_CODEC_ID_ADPCM_VIMA = define(69662)
    val AV_CODEC_ID_ADPCM_AFC = define(69663)
    val AV_CODEC_ID_ADPCM_IMA_OKI = define(69664)
    val AV_CODEC_ID_ADPCM_DTK = define(69665)
    val AV_CODEC_ID_ADPCM_IMA_RAD = define(69666)
    val AV_CODEC_ID_ADPCM_G726LE = define(69667)
    val AV_CODEC_ID_ADPCM_THP_LE = define(69668)
    val AV_CODEC_ID_ADPCM_PSX = define(69669)
    val AV_CODEC_ID_ADPCM_AICA = define(69670)
    val AV_CODEC_ID_ADPCM_IMA_DAT4 = define(69671)
    val AV_CODEC_ID_ADPCM_MTAF = define(69672)
    val AV_CODEC_ID_ADPCM_AGM = define(69673)
    val AV_CODEC_ID_ADPCM_ARGO = define(69674)
    val AV_CODEC_ID_ADPCM_IMA_SSI = define(69675)
    val AV_CODEC_ID_ADPCM_ZORK = define(69676)
    val AV_CODEC_ID_ADPCM_IMA_APM = define(69677)
    val AV_CODEC_ID_ADPCM_IMA_ALP = define(69678)
    val AV_CODEC_ID_ADPCM_IMA_MTF = define(69679)
    val AV_CODEC_ID_ADPCM_IMA_CUNNING = define(69680)
    val AV_CODEC_ID_ADPCM_IMA_MOFLEX = define(69681)
    val AV_CODEC_ID_ADPCM_IMA_ACORN = define(69682)
    val AV_CODEC_ID_ADPCM_XMD = define(69683)
    val AV_CODEC_ID_AMR_NB = define(73728)
    val AV_CODEC_ID_AMR_WB = define(73729)
    val AV_CODEC_ID_RA_144 = define(77824)
    val AV_CODEC_ID_RA_288 = define(77825)
    val AV_CODEC_ID_ROQ_DPCM = define(81920)
    val AV_CODEC_ID_INTERPLAY_DPCM = define(81921)
    val AV_CODEC_ID_XAN_DPCM = define(81922)
    val AV_CODEC_ID_SOL_DPCM = define(81923)
    val AV_CODEC_ID_SDX2_DPCM = define(81924)
    val AV_CODEC_ID_GREMLIN_DPCM = define(81925)
    val AV_CODEC_ID_DERF_DPCM = define(81926)
    val AV_CODEC_ID_WADY_DPCM = define(81927)
    val AV_CODEC_ID_CBD2_DPCM = define(81928)
    val AV_CODEC_ID_MP2 = define(86016)
    val AV_CODEC_ID_MP3 = define(86017)
    val AV_CODEC_ID_AAC = define(86018)
    val AV_CODEC_ID_AC3 = define(86019)
    val AV_CODEC_ID_DTS = define(86020)
    val AV_CODEC_ID_VORBIS = define(86021)
    val AV_CODEC_ID_DVAUDIO = define(86022)
    val AV_CODEC_ID_WMAV1 = define(86023)
    val AV_CODEC_ID_WMAV2 = define(86024)
    val AV_CODEC_ID_MACE3 = define(86025)
    val AV_CODEC_ID_MACE6 = define(86026)
    val AV_CODEC_ID_VMDAUDIO = define(86027)
    val AV_CODEC_ID_FLAC = define(86028)
    val AV_CODEC_ID_MP3ADU = define(86029)
    val AV_CODEC_ID_MP3ON4 = define(86030)
    val AV_CODEC_ID_SHORTEN = define(86031)
    val AV_CODEC_ID_ALAC = define(86032)
    val AV_CODEC_ID_WESTWOOD_SND1 = define(86033)
    val AV_CODEC_ID_GSM = define(86034)
    val AV_CODEC_ID_QDM2 = define(86035)
    val AV_CODEC_ID_COOK = define(86036)
    val AV_CODEC_ID_TRUESPEECH = define(86037)
    val AV_CODEC_ID_TTA = define(86038)
    val AV_CODEC_ID_SMACKAUDIO = define(86039)
    val AV_CODEC_ID_QCELP = define(86040)
    val AV_CODEC_ID_WAVPACK = define(86041)
    val AV_CODEC_ID_DSICINAUDIO = define(86042)
    val AV_CODEC_ID_IMC = define(86043)
    val AV_CODEC_ID_MUSEPACK7 = define(86044)
    val AV_CODEC_ID_MLP = define(86045)
    val AV_CODEC_ID_GSM_MS = define(86046)
    val AV_CODEC_ID_ATRAC3 = define(86047)
    val AV_CODEC_ID_APE = define(86048)
    val AV_CODEC_ID_NELLYMOSER = define(86049)
    val AV_CODEC_ID_MUSEPACK8 = define(86050)
    val AV_CODEC_ID_SPEEX = define(86051)
    val AV_CODEC_ID_WMAVOICE = define(86052)
    val AV_CODEC_ID_WMAPRO = define(86053)
    val AV_CODEC_ID_WMALOSSLESS = define(86054)
    val AV_CODEC_ID_ATRAC3P = define(86055)
    val AV_CODEC_ID_EAC3 = define(86056)
    val AV_CODEC_ID_SIPR = define(86057)
    val AV_CODEC_ID_MP1 = define(86058)
    val AV_CODEC_ID_TWINVQ = define(86059)
    val AV_CODEC_ID_TRUEHD = define(86060)
    val AV_CODEC_ID_MP4ALS = define(86061)
    val AV_CODEC_ID_ATRAC1 = define(86062)
    val AV_CODEC_ID_BINKAUDIO_RDFT = define(86063)
    val AV_CODEC_ID_BINKAUDIO_DCT = define(86064)
    val AV_CODEC_ID_AAC_LATM = define(86065)
    val AV_CODEC_ID_QDMC = define(86066)
    val AV_CODEC_ID_CELT = define(86067)
    val AV_CODEC_ID_G723_1 = define(86068)
    val AV_CODEC_ID_G729 = define(86069)
    val AV_CODEC_ID_8SVX_EXP = define(86070)
    val AV_CODEC_ID_8SVX_FIB = define(86071)
    val AV_CODEC_ID_BMV_AUDIO = define(86072)
    val AV_CODEC_ID_RALF = define(86073)
    val AV_CODEC_ID_IAC = define(86074)
    val AV_CODEC_ID_ILBC = define(86075)
    val AV_CODEC_ID_OPUS = define(86076)
    val AV_CODEC_ID_COMFORT_NOISE = define(86077)
    val AV_CODEC_ID_TAK = define(86078)
    val AV_CODEC_ID_METASOUND = define(86079)
    val AV_CODEC_ID_PAF_AUDIO = define(86080)
    val AV_CODEC_ID_ON2AVC = define(86081)
    val AV_CODEC_ID_DSS_SP = define(86082)
    val AV_CODEC_ID_CODEC2 = define(86083)
    val AV_CODEC_ID_FFWAVESYNTH = define(86084)
    val AV_CODEC_ID_SONIC = define(86085)
    val AV_CODEC_ID_SONIC_LS = define(86086)
    val AV_CODEC_ID_EVRC = define(86087)
    val AV_CODEC_ID_SMV = define(86088)
    val AV_CODEC_ID_DSD_LSBF = define(86089)
    val AV_CODEC_ID_DSD_MSBF = define(86090)
    val AV_CODEC_ID_DSD_LSBF_PLANAR = define(86091)
    val AV_CODEC_ID_DSD_MSBF_PLANAR = define(86092)
    val AV_CODEC_ID_4GV = define(86093)
    val AV_CODEC_ID_INTERPLAY_ACM = define(86094)
    val AV_CODEC_ID_XMA1 = define(86095)
    val AV_CODEC_ID_XMA2 = define(86096)
    val AV_CODEC_ID_DST = define(86097)
    val AV_CODEC_ID_ATRAC3AL = define(86098)
    val AV_CODEC_ID_ATRAC3PAL = define(86099)
    val AV_CODEC_ID_DOLBY_E = define(86100)
    val AV_CODEC_ID_APTX = define(86101)
    val AV_CODEC_ID_APTX_HD = define(86102)
    val AV_CODEC_ID_SBC = define(86103)
    val AV_CODEC_ID_ATRAC9 = define(86104)
    val AV_CODEC_ID_HCOM = define(86105)
    val AV_CODEC_ID_ACELP_KELVIN = define(86106)
    val AV_CODEC_ID_MPEGH_3D_AUDIO = define(86107)
    val AV_CODEC_ID_SIREN = define(86108)
    val AV_CODEC_ID_HCA = define(86109)
    val AV_CODEC_ID_FASTAUDIO = define(86110)
    val AV_CODEC_ID_MSNSIREN = define(86111)
    val AV_CODEC_ID_DFPWM = define(86112)
    val AV_CODEC_ID_BONK = define(86113)
    val AV_CODEC_ID_MISC4 = define(86114)
    val AV_CODEC_ID_APAC = define(86115)
    val AV_CODEC_ID_FTR = define(86116)
    val AV_CODEC_ID_WAVARC = define(86117)
    val AV_CODEC_ID_RKA = define(86118)
    val AV_CODEC_ID_AC4 = define(86119)
    val AV_CODEC_ID_OSQ = define(86120)
    val AV_CODEC_ID_QOA = define(86121)
    val AV_CODEC_ID_LC3 = define(86122)
    val AV_CODEC_ID_FIRST_SUBTITLE = define(94208)
    val AV_CODEC_ID_DVD_SUBTITLE = define(94208)
    val AV_CODEC_ID_DVB_SUBTITLE = define(94209)
    val AV_CODEC_ID_TEXT = define(94210)
    val AV_CODEC_ID_XSUB = define(94211)
    val AV_CODEC_ID_SSA = define(94212)
    val AV_CODEC_ID_MOV_TEXT = define(94213)
    val AV_CODEC_ID_HDMV_PGS_SUBTITLE = define(94214)
    val AV_CODEC_ID_DVB_TELETEXT = define(94215)
    val AV_CODEC_ID_SRT = define(94216)
    val AV_CODEC_ID_MICRODVD = define(94217)
    val AV_CODEC_ID_EIA_608 = define(94218)
    val AV_CODEC_ID_JACOSUB = define(94219)
    val AV_CODEC_ID_SAMI = define(94220)
    val AV_CODEC_ID_REALTEXT = define(94221)
    val AV_CODEC_ID_STL = define(94222)
    val AV_CODEC_ID_SUBVIEWER1 = define(94223)
    val AV_CODEC_ID_SUBVIEWER = define(94224)
    val AV_CODEC_ID_SUBRIP = define(94225)
    val AV_CODEC_ID_WEBVTT = define(94226)
    val AV_CODEC_ID_MPL2 = define(94227)
    val AV_CODEC_ID_VPLAYER = define(94228)
    val AV_CODEC_ID_PJS = define(94229)
    val AV_CODEC_ID_ASS = define(94230)
    val AV_CODEC_ID_HDMV_TEXT_SUBTITLE = define(94231)
    val AV_CODEC_ID_TTML = define(94232)
    val AV_CODEC_ID_ARIB_CAPTION = define(94233)
    val AV_CODEC_ID_FIRST_UNKNOWN = define(98304)
    val AV_CODEC_ID_TTF = define(98304)
    val AV_CODEC_ID_SCTE_35 = define(98305)
    val AV_CODEC_ID_EPG = define(98306)
    val AV_CODEC_ID_BINTEXT = define(98307)
    val AV_CODEC_ID_XBIN = define(98308)
    val AV_CODEC_ID_IDF = define(98309)
    val AV_CODEC_ID_OTF = define(98310)
    val AV_CODEC_ID_SMPTE_KLV = define(98311)
    val AV_CODEC_ID_DVD_NAV = define(98312)
    val AV_CODEC_ID_TIMED_ID3 = define(98313)
    val AV_CODEC_ID_BIN_DATA = define(98314)
    val AV_CODEC_ID_SMPTE_2038 = define(98315)
    val AV_CODEC_ID_LCEVC = define(98316)
    val AV_CODEC_ID_PROBE = define(102400)
    val AV_CODEC_ID_MPEG2TS = define(131072)
    val AV_CODEC_ID_MPEG4SYSTEMS = define(131073)
    val AV_CODEC_ID_FFMETADATA = define(135168)
    val AV_CODEC_ID_WRAPPED_AVFRAME = define(135169)
    val AV_CODEC_ID_VNULL = define(135170)
    val AV_CODEC_ID_ANULL = define(135171)
    def getName(value: AVCodecID): Option[String] =
      value match
        case `AV_CODEC_ID_NONE`            => Some("AV_CODEC_ID_NONE")
        case `AV_CODEC_ID_MPEG1VIDEO`      => Some("AV_CODEC_ID_MPEG1VIDEO")
        case `AV_CODEC_ID_MPEG2VIDEO`      => Some("AV_CODEC_ID_MPEG2VIDEO")
        case `AV_CODEC_ID_H261`            => Some("AV_CODEC_ID_H261")
        case `AV_CODEC_ID_H263`            => Some("AV_CODEC_ID_H263")
        case `AV_CODEC_ID_RV10`            => Some("AV_CODEC_ID_RV10")
        case `AV_CODEC_ID_RV20`            => Some("AV_CODEC_ID_RV20")
        case `AV_CODEC_ID_MJPEG`           => Some("AV_CODEC_ID_MJPEG")
        case `AV_CODEC_ID_MJPEGB`          => Some("AV_CODEC_ID_MJPEGB")
        case `AV_CODEC_ID_LJPEG`           => Some("AV_CODEC_ID_LJPEG")
        case `AV_CODEC_ID_SP5X`            => Some("AV_CODEC_ID_SP5X")
        case `AV_CODEC_ID_JPEGLS`          => Some("AV_CODEC_ID_JPEGLS")
        case `AV_CODEC_ID_MPEG4`           => Some("AV_CODEC_ID_MPEG4")
        case `AV_CODEC_ID_RAWVIDEO`        => Some("AV_CODEC_ID_RAWVIDEO")
        case `AV_CODEC_ID_MSMPEG4V1`       => Some("AV_CODEC_ID_MSMPEG4V1")
        case `AV_CODEC_ID_MSMPEG4V2`       => Some("AV_CODEC_ID_MSMPEG4V2")
        case `AV_CODEC_ID_MSMPEG4V3`       => Some("AV_CODEC_ID_MSMPEG4V3")
        case `AV_CODEC_ID_WMV1`            => Some("AV_CODEC_ID_WMV1")
        case `AV_CODEC_ID_WMV2`            => Some("AV_CODEC_ID_WMV2")
        case `AV_CODEC_ID_H263P`           => Some("AV_CODEC_ID_H263P")
        case `AV_CODEC_ID_H263I`           => Some("AV_CODEC_ID_H263I")
        case `AV_CODEC_ID_FLV1`            => Some("AV_CODEC_ID_FLV1")
        case `AV_CODEC_ID_SVQ1`            => Some("AV_CODEC_ID_SVQ1")
        case `AV_CODEC_ID_SVQ3`            => Some("AV_CODEC_ID_SVQ3")
        case `AV_CODEC_ID_DVVIDEO`         => Some("AV_CODEC_ID_DVVIDEO")
        case `AV_CODEC_ID_HUFFYUV`         => Some("AV_CODEC_ID_HUFFYUV")
        case `AV_CODEC_ID_CYUV`            => Some("AV_CODEC_ID_CYUV")
        case `AV_CODEC_ID_H264`            => Some("AV_CODEC_ID_H264")
        case `AV_CODEC_ID_INDEO3`          => Some("AV_CODEC_ID_INDEO3")
        case `AV_CODEC_ID_VP3`             => Some("AV_CODEC_ID_VP3")
        case `AV_CODEC_ID_THEORA`          => Some("AV_CODEC_ID_THEORA")
        case `AV_CODEC_ID_ASV1`            => Some("AV_CODEC_ID_ASV1")
        case `AV_CODEC_ID_ASV2`            => Some("AV_CODEC_ID_ASV2")
        case `AV_CODEC_ID_FFV1`            => Some("AV_CODEC_ID_FFV1")
        case `AV_CODEC_ID_4XM`             => Some("AV_CODEC_ID_4XM")
        case `AV_CODEC_ID_VCR1`            => Some("AV_CODEC_ID_VCR1")
        case `AV_CODEC_ID_CLJR`            => Some("AV_CODEC_ID_CLJR")
        case `AV_CODEC_ID_MDEC`            => Some("AV_CODEC_ID_MDEC")
        case `AV_CODEC_ID_ROQ`             => Some("AV_CODEC_ID_ROQ")
        case `AV_CODEC_ID_INTERPLAY_VIDEO` =>
          Some("AV_CODEC_ID_INTERPLAY_VIDEO")
        case `AV_CODEC_ID_XAN_WC3`         => Some("AV_CODEC_ID_XAN_WC3")
        case `AV_CODEC_ID_XAN_WC4`         => Some("AV_CODEC_ID_XAN_WC4")
        case `AV_CODEC_ID_RPZA`            => Some("AV_CODEC_ID_RPZA")
        case `AV_CODEC_ID_CINEPAK`         => Some("AV_CODEC_ID_CINEPAK")
        case `AV_CODEC_ID_WS_VQA`          => Some("AV_CODEC_ID_WS_VQA")
        case `AV_CODEC_ID_MSRLE`           => Some("AV_CODEC_ID_MSRLE")
        case `AV_CODEC_ID_MSVIDEO1`        => Some("AV_CODEC_ID_MSVIDEO1")
        case `AV_CODEC_ID_IDCIN`           => Some("AV_CODEC_ID_IDCIN")
        case `AV_CODEC_ID_8BPS`            => Some("AV_CODEC_ID_8BPS")
        case `AV_CODEC_ID_SMC`             => Some("AV_CODEC_ID_SMC")
        case `AV_CODEC_ID_FLIC`            => Some("AV_CODEC_ID_FLIC")
        case `AV_CODEC_ID_TRUEMOTION1`     => Some("AV_CODEC_ID_TRUEMOTION1")
        case `AV_CODEC_ID_VMDVIDEO`        => Some("AV_CODEC_ID_VMDVIDEO")
        case `AV_CODEC_ID_MSZH`            => Some("AV_CODEC_ID_MSZH")
        case `AV_CODEC_ID_ZLIB`            => Some("AV_CODEC_ID_ZLIB")
        case `AV_CODEC_ID_QTRLE`           => Some("AV_CODEC_ID_QTRLE")
        case `AV_CODEC_ID_TSCC`            => Some("AV_CODEC_ID_TSCC")
        case `AV_CODEC_ID_ULTI`            => Some("AV_CODEC_ID_ULTI")
        case `AV_CODEC_ID_QDRAW`           => Some("AV_CODEC_ID_QDRAW")
        case `AV_CODEC_ID_VIXL`            => Some("AV_CODEC_ID_VIXL")
        case `AV_CODEC_ID_QPEG`            => Some("AV_CODEC_ID_QPEG")
        case `AV_CODEC_ID_PNG`             => Some("AV_CODEC_ID_PNG")
        case `AV_CODEC_ID_PPM`             => Some("AV_CODEC_ID_PPM")
        case `AV_CODEC_ID_PBM`             => Some("AV_CODEC_ID_PBM")
        case `AV_CODEC_ID_PGM`             => Some("AV_CODEC_ID_PGM")
        case `AV_CODEC_ID_PGMYUV`          => Some("AV_CODEC_ID_PGMYUV")
        case `AV_CODEC_ID_PAM`             => Some("AV_CODEC_ID_PAM")
        case `AV_CODEC_ID_FFVHUFF`         => Some("AV_CODEC_ID_FFVHUFF")
        case `AV_CODEC_ID_RV30`            => Some("AV_CODEC_ID_RV30")
        case `AV_CODEC_ID_RV40`            => Some("AV_CODEC_ID_RV40")
        case `AV_CODEC_ID_VC1`             => Some("AV_CODEC_ID_VC1")
        case `AV_CODEC_ID_WMV3`            => Some("AV_CODEC_ID_WMV3")
        case `AV_CODEC_ID_LOCO`            => Some("AV_CODEC_ID_LOCO")
        case `AV_CODEC_ID_WNV1`            => Some("AV_CODEC_ID_WNV1")
        case `AV_CODEC_ID_AASC`            => Some("AV_CODEC_ID_AASC")
        case `AV_CODEC_ID_INDEO2`          => Some("AV_CODEC_ID_INDEO2")
        case `AV_CODEC_ID_FRAPS`           => Some("AV_CODEC_ID_FRAPS")
        case `AV_CODEC_ID_TRUEMOTION2`     => Some("AV_CODEC_ID_TRUEMOTION2")
        case `AV_CODEC_ID_BMP`             => Some("AV_CODEC_ID_BMP")
        case `AV_CODEC_ID_CSCD`            => Some("AV_CODEC_ID_CSCD")
        case `AV_CODEC_ID_MMVIDEO`         => Some("AV_CODEC_ID_MMVIDEO")
        case `AV_CODEC_ID_ZMBV`            => Some("AV_CODEC_ID_ZMBV")
        case `AV_CODEC_ID_AVS`             => Some("AV_CODEC_ID_AVS")
        case `AV_CODEC_ID_SMACKVIDEO`      => Some("AV_CODEC_ID_SMACKVIDEO")
        case `AV_CODEC_ID_NUV`             => Some("AV_CODEC_ID_NUV")
        case `AV_CODEC_ID_KMVC`            => Some("AV_CODEC_ID_KMVC")
        case `AV_CODEC_ID_FLASHSV`         => Some("AV_CODEC_ID_FLASHSV")
        case `AV_CODEC_ID_CAVS`            => Some("AV_CODEC_ID_CAVS")
        case `AV_CODEC_ID_JPEG2000`        => Some("AV_CODEC_ID_JPEG2000")
        case `AV_CODEC_ID_VMNC`            => Some("AV_CODEC_ID_VMNC")
        case `AV_CODEC_ID_VP5`             => Some("AV_CODEC_ID_VP5")
        case `AV_CODEC_ID_VP6`             => Some("AV_CODEC_ID_VP6")
        case `AV_CODEC_ID_VP6F`            => Some("AV_CODEC_ID_VP6F")
        case `AV_CODEC_ID_TARGA`           => Some("AV_CODEC_ID_TARGA")
        case `AV_CODEC_ID_DSICINVIDEO`     => Some("AV_CODEC_ID_DSICINVIDEO")
        case `AV_CODEC_ID_TIERTEXSEQVIDEO` =>
          Some("AV_CODEC_ID_TIERTEXSEQVIDEO")
        case `AV_CODEC_ID_TIFF`             => Some("AV_CODEC_ID_TIFF")
        case `AV_CODEC_ID_GIF`              => Some("AV_CODEC_ID_GIF")
        case `AV_CODEC_ID_DXA`              => Some("AV_CODEC_ID_DXA")
        case `AV_CODEC_ID_DNXHD`            => Some("AV_CODEC_ID_DNXHD")
        case `AV_CODEC_ID_THP`              => Some("AV_CODEC_ID_THP")
        case `AV_CODEC_ID_SGI`              => Some("AV_CODEC_ID_SGI")
        case `AV_CODEC_ID_C93`              => Some("AV_CODEC_ID_C93")
        case `AV_CODEC_ID_BETHSOFTVID`      => Some("AV_CODEC_ID_BETHSOFTVID")
        case `AV_CODEC_ID_PTX`              => Some("AV_CODEC_ID_PTX")
        case `AV_CODEC_ID_TXD`              => Some("AV_CODEC_ID_TXD")
        case `AV_CODEC_ID_VP6A`             => Some("AV_CODEC_ID_VP6A")
        case `AV_CODEC_ID_AMV`              => Some("AV_CODEC_ID_AMV")
        case `AV_CODEC_ID_VB`               => Some("AV_CODEC_ID_VB")
        case `AV_CODEC_ID_PCX`              => Some("AV_CODEC_ID_PCX")
        case `AV_CODEC_ID_SUNRAST`          => Some("AV_CODEC_ID_SUNRAST")
        case `AV_CODEC_ID_INDEO4`           => Some("AV_CODEC_ID_INDEO4")
        case `AV_CODEC_ID_INDEO5`           => Some("AV_CODEC_ID_INDEO5")
        case `AV_CODEC_ID_MIMIC`            => Some("AV_CODEC_ID_MIMIC")
        case `AV_CODEC_ID_RL2`              => Some("AV_CODEC_ID_RL2")
        case `AV_CODEC_ID_ESCAPE124`        => Some("AV_CODEC_ID_ESCAPE124")
        case `AV_CODEC_ID_DIRAC`            => Some("AV_CODEC_ID_DIRAC")
        case `AV_CODEC_ID_BFI`              => Some("AV_CODEC_ID_BFI")
        case `AV_CODEC_ID_CMV`              => Some("AV_CODEC_ID_CMV")
        case `AV_CODEC_ID_MOTIONPIXELS`     => Some("AV_CODEC_ID_MOTIONPIXELS")
        case `AV_CODEC_ID_TGV`              => Some("AV_CODEC_ID_TGV")
        case `AV_CODEC_ID_TGQ`              => Some("AV_CODEC_ID_TGQ")
        case `AV_CODEC_ID_TQI`              => Some("AV_CODEC_ID_TQI")
        case `AV_CODEC_ID_AURA`             => Some("AV_CODEC_ID_AURA")
        case `AV_CODEC_ID_AURA2`            => Some("AV_CODEC_ID_AURA2")
        case `AV_CODEC_ID_V210X`            => Some("AV_CODEC_ID_V210X")
        case `AV_CODEC_ID_TMV`              => Some("AV_CODEC_ID_TMV")
        case `AV_CODEC_ID_V210`             => Some("AV_CODEC_ID_V210")
        case `AV_CODEC_ID_DPX`              => Some("AV_CODEC_ID_DPX")
        case `AV_CODEC_ID_MAD`              => Some("AV_CODEC_ID_MAD")
        case `AV_CODEC_ID_FRWU`             => Some("AV_CODEC_ID_FRWU")
        case `AV_CODEC_ID_FLASHSV2`         => Some("AV_CODEC_ID_FLASHSV2")
        case `AV_CODEC_ID_CDGRAPHICS`       => Some("AV_CODEC_ID_CDGRAPHICS")
        case `AV_CODEC_ID_R210`             => Some("AV_CODEC_ID_R210")
        case `AV_CODEC_ID_ANM`              => Some("AV_CODEC_ID_ANM")
        case `AV_CODEC_ID_BINKVIDEO`        => Some("AV_CODEC_ID_BINKVIDEO")
        case `AV_CODEC_ID_IFF_ILBM`         => Some("AV_CODEC_ID_IFF_ILBM")
        case `AV_CODEC_ID_KGV1`             => Some("AV_CODEC_ID_KGV1")
        case `AV_CODEC_ID_YOP`              => Some("AV_CODEC_ID_YOP")
        case `AV_CODEC_ID_VP8`              => Some("AV_CODEC_ID_VP8")
        case `AV_CODEC_ID_PICTOR`           => Some("AV_CODEC_ID_PICTOR")
        case `AV_CODEC_ID_ANSI`             => Some("AV_CODEC_ID_ANSI")
        case `AV_CODEC_ID_A64_MULTI`        => Some("AV_CODEC_ID_A64_MULTI")
        case `AV_CODEC_ID_A64_MULTI5`       => Some("AV_CODEC_ID_A64_MULTI5")
        case `AV_CODEC_ID_R10K`             => Some("AV_CODEC_ID_R10K")
        case `AV_CODEC_ID_MXPEG`            => Some("AV_CODEC_ID_MXPEG")
        case `AV_CODEC_ID_LAGARITH`         => Some("AV_CODEC_ID_LAGARITH")
        case `AV_CODEC_ID_PRORES`           => Some("AV_CODEC_ID_PRORES")
        case `AV_CODEC_ID_JV`               => Some("AV_CODEC_ID_JV")
        case `AV_CODEC_ID_DFA`              => Some("AV_CODEC_ID_DFA")
        case `AV_CODEC_ID_WMV3IMAGE`        => Some("AV_CODEC_ID_WMV3IMAGE")
        case `AV_CODEC_ID_VC1IMAGE`         => Some("AV_CODEC_ID_VC1IMAGE")
        case `AV_CODEC_ID_UTVIDEO`          => Some("AV_CODEC_ID_UTVIDEO")
        case `AV_CODEC_ID_BMV_VIDEO`        => Some("AV_CODEC_ID_BMV_VIDEO")
        case `AV_CODEC_ID_VBLE`             => Some("AV_CODEC_ID_VBLE")
        case `AV_CODEC_ID_DXTORY`           => Some("AV_CODEC_ID_DXTORY")
        case `AV_CODEC_ID_V410`             => Some("AV_CODEC_ID_V410")
        case `AV_CODEC_ID_XWD`              => Some("AV_CODEC_ID_XWD")
        case `AV_CODEC_ID_CDXL`             => Some("AV_CODEC_ID_CDXL")
        case `AV_CODEC_ID_XBM`              => Some("AV_CODEC_ID_XBM")
        case `AV_CODEC_ID_ZEROCODEC`        => Some("AV_CODEC_ID_ZEROCODEC")
        case `AV_CODEC_ID_MSS1`             => Some("AV_CODEC_ID_MSS1")
        case `AV_CODEC_ID_MSA1`             => Some("AV_CODEC_ID_MSA1")
        case `AV_CODEC_ID_TSCC2`            => Some("AV_CODEC_ID_TSCC2")
        case `AV_CODEC_ID_MTS2`             => Some("AV_CODEC_ID_MTS2")
        case `AV_CODEC_ID_CLLC`             => Some("AV_CODEC_ID_CLLC")
        case `AV_CODEC_ID_MSS2`             => Some("AV_CODEC_ID_MSS2")
        case `AV_CODEC_ID_VP9`              => Some("AV_CODEC_ID_VP9")
        case `AV_CODEC_ID_AIC`              => Some("AV_CODEC_ID_AIC")
        case `AV_CODEC_ID_ESCAPE130`        => Some("AV_CODEC_ID_ESCAPE130")
        case `AV_CODEC_ID_G2M`              => Some("AV_CODEC_ID_G2M")
        case `AV_CODEC_ID_WEBP`             => Some("AV_CODEC_ID_WEBP")
        case `AV_CODEC_ID_HNM4_VIDEO`       => Some("AV_CODEC_ID_HNM4_VIDEO")
        case `AV_CODEC_ID_HEVC`             => Some("AV_CODEC_ID_HEVC")
        case `AV_CODEC_ID_FIC`              => Some("AV_CODEC_ID_FIC")
        case `AV_CODEC_ID_ALIAS_PIX`        => Some("AV_CODEC_ID_ALIAS_PIX")
        case `AV_CODEC_ID_BRENDER_PIX`      => Some("AV_CODEC_ID_BRENDER_PIX")
        case `AV_CODEC_ID_PAF_VIDEO`        => Some("AV_CODEC_ID_PAF_VIDEO")
        case `AV_CODEC_ID_EXR`              => Some("AV_CODEC_ID_EXR")
        case `AV_CODEC_ID_VP7`              => Some("AV_CODEC_ID_VP7")
        case `AV_CODEC_ID_SANM`             => Some("AV_CODEC_ID_SANM")
        case `AV_CODEC_ID_SGIRLE`           => Some("AV_CODEC_ID_SGIRLE")
        case `AV_CODEC_ID_MVC1`             => Some("AV_CODEC_ID_MVC1")
        case `AV_CODEC_ID_MVC2`             => Some("AV_CODEC_ID_MVC2")
        case `AV_CODEC_ID_HQX`              => Some("AV_CODEC_ID_HQX")
        case `AV_CODEC_ID_TDSC`             => Some("AV_CODEC_ID_TDSC")
        case `AV_CODEC_ID_HQ_HQA`           => Some("AV_CODEC_ID_HQ_HQA")
        case `AV_CODEC_ID_HAP`              => Some("AV_CODEC_ID_HAP")
        case `AV_CODEC_ID_DDS`              => Some("AV_CODEC_ID_DDS")
        case `AV_CODEC_ID_DXV`              => Some("AV_CODEC_ID_DXV")
        case `AV_CODEC_ID_SCREENPRESSO`     => Some("AV_CODEC_ID_SCREENPRESSO")
        case `AV_CODEC_ID_RSCC`             => Some("AV_CODEC_ID_RSCC")
        case `AV_CODEC_ID_AVS2`             => Some("AV_CODEC_ID_AVS2")
        case `AV_CODEC_ID_PGX`              => Some("AV_CODEC_ID_PGX")
        case `AV_CODEC_ID_AVS3`             => Some("AV_CODEC_ID_AVS3")
        case `AV_CODEC_ID_MSP2`             => Some("AV_CODEC_ID_MSP2")
        case `AV_CODEC_ID_VVC`              => Some("AV_CODEC_ID_VVC")
        case `AV_CODEC_ID_Y41P`             => Some("AV_CODEC_ID_Y41P")
        case `AV_CODEC_ID_AVRP`             => Some("AV_CODEC_ID_AVRP")
        case `AV_CODEC_ID_012V`             => Some("AV_CODEC_ID_012V")
        case `AV_CODEC_ID_AVUI`             => Some("AV_CODEC_ID_AVUI")
        case `AV_CODEC_ID_TARGA_Y216`       => Some("AV_CODEC_ID_TARGA_Y216")
        case `AV_CODEC_ID_V308`             => Some("AV_CODEC_ID_V308")
        case `AV_CODEC_ID_V408`             => Some("AV_CODEC_ID_V408")
        case `AV_CODEC_ID_YUV4`             => Some("AV_CODEC_ID_YUV4")
        case `AV_CODEC_ID_AVRN`             => Some("AV_CODEC_ID_AVRN")
        case `AV_CODEC_ID_CPIA`             => Some("AV_CODEC_ID_CPIA")
        case `AV_CODEC_ID_XFACE`            => Some("AV_CODEC_ID_XFACE")
        case `AV_CODEC_ID_SNOW`             => Some("AV_CODEC_ID_SNOW")
        case `AV_CODEC_ID_SMVJPEG`          => Some("AV_CODEC_ID_SMVJPEG")
        case `AV_CODEC_ID_APNG`             => Some("AV_CODEC_ID_APNG")
        case `AV_CODEC_ID_DAALA`            => Some("AV_CODEC_ID_DAALA")
        case `AV_CODEC_ID_CFHD`             => Some("AV_CODEC_ID_CFHD")
        case `AV_CODEC_ID_TRUEMOTION2RT`    => Some("AV_CODEC_ID_TRUEMOTION2RT")
        case `AV_CODEC_ID_M101`             => Some("AV_CODEC_ID_M101")
        case `AV_CODEC_ID_MAGICYUV`         => Some("AV_CODEC_ID_MAGICYUV")
        case `AV_CODEC_ID_SHEERVIDEO`       => Some("AV_CODEC_ID_SHEERVIDEO")
        case `AV_CODEC_ID_YLC`              => Some("AV_CODEC_ID_YLC")
        case `AV_CODEC_ID_PSD`              => Some("AV_CODEC_ID_PSD")
        case `AV_CODEC_ID_PIXLET`           => Some("AV_CODEC_ID_PIXLET")
        case `AV_CODEC_ID_SPEEDHQ`          => Some("AV_CODEC_ID_SPEEDHQ")
        case `AV_CODEC_ID_FMVC`             => Some("AV_CODEC_ID_FMVC")
        case `AV_CODEC_ID_SCPR`             => Some("AV_CODEC_ID_SCPR")
        case `AV_CODEC_ID_CLEARVIDEO`       => Some("AV_CODEC_ID_CLEARVIDEO")
        case `AV_CODEC_ID_XPM`              => Some("AV_CODEC_ID_XPM")
        case `AV_CODEC_ID_AV1`              => Some("AV_CODEC_ID_AV1")
        case `AV_CODEC_ID_BITPACKED`        => Some("AV_CODEC_ID_BITPACKED")
        case `AV_CODEC_ID_MSCC`             => Some("AV_CODEC_ID_MSCC")
        case `AV_CODEC_ID_SRGC`             => Some("AV_CODEC_ID_SRGC")
        case `AV_CODEC_ID_SVG`              => Some("AV_CODEC_ID_SVG")
        case `AV_CODEC_ID_GDV`              => Some("AV_CODEC_ID_GDV")
        case `AV_CODEC_ID_FITS`             => Some("AV_CODEC_ID_FITS")
        case `AV_CODEC_ID_IMM4`             => Some("AV_CODEC_ID_IMM4")
        case `AV_CODEC_ID_PROSUMER`         => Some("AV_CODEC_ID_PROSUMER")
        case `AV_CODEC_ID_MWSC`             => Some("AV_CODEC_ID_MWSC")
        case `AV_CODEC_ID_WCMV`             => Some("AV_CODEC_ID_WCMV")
        case `AV_CODEC_ID_RASC`             => Some("AV_CODEC_ID_RASC")
        case `AV_CODEC_ID_HYMT`             => Some("AV_CODEC_ID_HYMT")
        case `AV_CODEC_ID_ARBC`             => Some("AV_CODEC_ID_ARBC")
        case `AV_CODEC_ID_AGM`              => Some("AV_CODEC_ID_AGM")
        case `AV_CODEC_ID_LSCR`             => Some("AV_CODEC_ID_LSCR")
        case `AV_CODEC_ID_VP4`              => Some("AV_CODEC_ID_VP4")
        case `AV_CODEC_ID_IMM5`             => Some("AV_CODEC_ID_IMM5")
        case `AV_CODEC_ID_MVDV`             => Some("AV_CODEC_ID_MVDV")
        case `AV_CODEC_ID_MVHA`             => Some("AV_CODEC_ID_MVHA")
        case `AV_CODEC_ID_CDTOONS`          => Some("AV_CODEC_ID_CDTOONS")
        case `AV_CODEC_ID_MV30`             => Some("AV_CODEC_ID_MV30")
        case `AV_CODEC_ID_NOTCHLC`          => Some("AV_CODEC_ID_NOTCHLC")
        case `AV_CODEC_ID_PFM`              => Some("AV_CODEC_ID_PFM")
        case `AV_CODEC_ID_MOBICLIP`         => Some("AV_CODEC_ID_MOBICLIP")
        case `AV_CODEC_ID_PHOTOCD`          => Some("AV_CODEC_ID_PHOTOCD")
        case `AV_CODEC_ID_IPU`              => Some("AV_CODEC_ID_IPU")
        case `AV_CODEC_ID_ARGO`             => Some("AV_CODEC_ID_ARGO")
        case `AV_CODEC_ID_CRI`              => Some("AV_CODEC_ID_CRI")
        case `AV_CODEC_ID_SIMBIOSIS_IMX`    => Some("AV_CODEC_ID_SIMBIOSIS_IMX")
        case `AV_CODEC_ID_SGA_VIDEO`        => Some("AV_CODEC_ID_SGA_VIDEO")
        case `AV_CODEC_ID_GEM`              => Some("AV_CODEC_ID_GEM")
        case `AV_CODEC_ID_VBN`              => Some("AV_CODEC_ID_VBN")
        case `AV_CODEC_ID_JPEGXL`           => Some("AV_CODEC_ID_JPEGXL")
        case `AV_CODEC_ID_QOI`              => Some("AV_CODEC_ID_QOI")
        case `AV_CODEC_ID_PHM`              => Some("AV_CODEC_ID_PHM")
        case `AV_CODEC_ID_RADIANCE_HDR`     => Some("AV_CODEC_ID_RADIANCE_HDR")
        case `AV_CODEC_ID_WBMP`             => Some("AV_CODEC_ID_WBMP")
        case `AV_CODEC_ID_MEDIA100`         => Some("AV_CODEC_ID_MEDIA100")
        case `AV_CODEC_ID_VQC`              => Some("AV_CODEC_ID_VQC")
        case `AV_CODEC_ID_PDV`              => Some("AV_CODEC_ID_PDV")
        case `AV_CODEC_ID_EVC`              => Some("AV_CODEC_ID_EVC")
        case `AV_CODEC_ID_RTV1`             => Some("AV_CODEC_ID_RTV1")
        case `AV_CODEC_ID_VMIX`             => Some("AV_CODEC_ID_VMIX")
        case `AV_CODEC_ID_LEAD`             => Some("AV_CODEC_ID_LEAD")
        case `AV_CODEC_ID_FIRST_AUDIO`      => Some("AV_CODEC_ID_FIRST_AUDIO")
        case `AV_CODEC_ID_PCM_S16LE`        => Some("AV_CODEC_ID_PCM_S16LE")
        case `AV_CODEC_ID_PCM_S16BE`        => Some("AV_CODEC_ID_PCM_S16BE")
        case `AV_CODEC_ID_PCM_U16LE`        => Some("AV_CODEC_ID_PCM_U16LE")
        case `AV_CODEC_ID_PCM_U16BE`        => Some("AV_CODEC_ID_PCM_U16BE")
        case `AV_CODEC_ID_PCM_S8`           => Some("AV_CODEC_ID_PCM_S8")
        case `AV_CODEC_ID_PCM_U8`           => Some("AV_CODEC_ID_PCM_U8")
        case `AV_CODEC_ID_PCM_MULAW`        => Some("AV_CODEC_ID_PCM_MULAW")
        case `AV_CODEC_ID_PCM_ALAW`         => Some("AV_CODEC_ID_PCM_ALAW")
        case `AV_CODEC_ID_PCM_S32LE`        => Some("AV_CODEC_ID_PCM_S32LE")
        case `AV_CODEC_ID_PCM_S32BE`        => Some("AV_CODEC_ID_PCM_S32BE")
        case `AV_CODEC_ID_PCM_U32LE`        => Some("AV_CODEC_ID_PCM_U32LE")
        case `AV_CODEC_ID_PCM_U32BE`        => Some("AV_CODEC_ID_PCM_U32BE")
        case `AV_CODEC_ID_PCM_S24LE`        => Some("AV_CODEC_ID_PCM_S24LE")
        case `AV_CODEC_ID_PCM_S24BE`        => Some("AV_CODEC_ID_PCM_S24BE")
        case `AV_CODEC_ID_PCM_U24LE`        => Some("AV_CODEC_ID_PCM_U24LE")
        case `AV_CODEC_ID_PCM_U24BE`        => Some("AV_CODEC_ID_PCM_U24BE")
        case `AV_CODEC_ID_PCM_S24DAUD`      => Some("AV_CODEC_ID_PCM_S24DAUD")
        case `AV_CODEC_ID_PCM_ZORK`         => Some("AV_CODEC_ID_PCM_ZORK")
        case `AV_CODEC_ID_PCM_S16LE_PLANAR` =>
          Some("AV_CODEC_ID_PCM_S16LE_PLANAR")
        case `AV_CODEC_ID_PCM_DVD`          => Some("AV_CODEC_ID_PCM_DVD")
        case `AV_CODEC_ID_PCM_F32BE`        => Some("AV_CODEC_ID_PCM_F32BE")
        case `AV_CODEC_ID_PCM_F32LE`        => Some("AV_CODEC_ID_PCM_F32LE")
        case `AV_CODEC_ID_PCM_F64BE`        => Some("AV_CODEC_ID_PCM_F64BE")
        case `AV_CODEC_ID_PCM_F64LE`        => Some("AV_CODEC_ID_PCM_F64LE")
        case `AV_CODEC_ID_PCM_BLURAY`       => Some("AV_CODEC_ID_PCM_BLURAY")
        case `AV_CODEC_ID_PCM_LXF`          => Some("AV_CODEC_ID_PCM_LXF")
        case `AV_CODEC_ID_S302M`            => Some("AV_CODEC_ID_S302M")
        case `AV_CODEC_ID_PCM_S8_PLANAR`    => Some("AV_CODEC_ID_PCM_S8_PLANAR")
        case `AV_CODEC_ID_PCM_S24LE_PLANAR` =>
          Some("AV_CODEC_ID_PCM_S24LE_PLANAR")
        case `AV_CODEC_ID_PCM_S32LE_PLANAR` =>
          Some("AV_CODEC_ID_PCM_S32LE_PLANAR")
        case `AV_CODEC_ID_PCM_S16BE_PLANAR` =>
          Some("AV_CODEC_ID_PCM_S16BE_PLANAR")
        case `AV_CODEC_ID_PCM_S64LE`        => Some("AV_CODEC_ID_PCM_S64LE")
        case `AV_CODEC_ID_PCM_S64BE`        => Some("AV_CODEC_ID_PCM_S64BE")
        case `AV_CODEC_ID_PCM_F16LE`        => Some("AV_CODEC_ID_PCM_F16LE")
        case `AV_CODEC_ID_PCM_F24LE`        => Some("AV_CODEC_ID_PCM_F24LE")
        case `AV_CODEC_ID_PCM_VIDC`         => Some("AV_CODEC_ID_PCM_VIDC")
        case `AV_CODEC_ID_PCM_SGA`          => Some("AV_CODEC_ID_PCM_SGA")
        case `AV_CODEC_ID_ADPCM_IMA_QT`     => Some("AV_CODEC_ID_ADPCM_IMA_QT")
        case `AV_CODEC_ID_ADPCM_IMA_WAV`    => Some("AV_CODEC_ID_ADPCM_IMA_WAV")
        case `AV_CODEC_ID_ADPCM_IMA_DK3`    => Some("AV_CODEC_ID_ADPCM_IMA_DK3")
        case `AV_CODEC_ID_ADPCM_IMA_DK4`    => Some("AV_CODEC_ID_ADPCM_IMA_DK4")
        case `AV_CODEC_ID_ADPCM_IMA_WS`     => Some("AV_CODEC_ID_ADPCM_IMA_WS")
        case `AV_CODEC_ID_ADPCM_IMA_SMJPEG` =>
          Some("AV_CODEC_ID_ADPCM_IMA_SMJPEG")
        case `AV_CODEC_ID_ADPCM_MS`      => Some("AV_CODEC_ID_ADPCM_MS")
        case `AV_CODEC_ID_ADPCM_4XM`     => Some("AV_CODEC_ID_ADPCM_4XM")
        case `AV_CODEC_ID_ADPCM_XA`      => Some("AV_CODEC_ID_ADPCM_XA")
        case `AV_CODEC_ID_ADPCM_ADX`     => Some("AV_CODEC_ID_ADPCM_ADX")
        case `AV_CODEC_ID_ADPCM_EA`      => Some("AV_CODEC_ID_ADPCM_EA")
        case `AV_CODEC_ID_ADPCM_G726`    => Some("AV_CODEC_ID_ADPCM_G726")
        case `AV_CODEC_ID_ADPCM_CT`      => Some("AV_CODEC_ID_ADPCM_CT")
        case `AV_CODEC_ID_ADPCM_SWF`     => Some("AV_CODEC_ID_ADPCM_SWF")
        case `AV_CODEC_ID_ADPCM_YAMAHA`  => Some("AV_CODEC_ID_ADPCM_YAMAHA")
        case `AV_CODEC_ID_ADPCM_SBPRO_4` => Some("AV_CODEC_ID_ADPCM_SBPRO_4")
        case `AV_CODEC_ID_ADPCM_SBPRO_3` => Some("AV_CODEC_ID_ADPCM_SBPRO_3")
        case `AV_CODEC_ID_ADPCM_SBPRO_2` => Some("AV_CODEC_ID_ADPCM_SBPRO_2")
        case `AV_CODEC_ID_ADPCM_THP`     => Some("AV_CODEC_ID_ADPCM_THP")
        case `AV_CODEC_ID_ADPCM_IMA_AMV` => Some("AV_CODEC_ID_ADPCM_IMA_AMV")
        case `AV_CODEC_ID_ADPCM_EA_R1`   => Some("AV_CODEC_ID_ADPCM_EA_R1")
        case `AV_CODEC_ID_ADPCM_EA_R3`   => Some("AV_CODEC_ID_ADPCM_EA_R3")
        case `AV_CODEC_ID_ADPCM_EA_R2`   => Some("AV_CODEC_ID_ADPCM_EA_R2")
        case `AV_CODEC_ID_ADPCM_IMA_EA_SEAD` =>
          Some("AV_CODEC_ID_ADPCM_IMA_EA_SEAD")
        case `AV_CODEC_ID_ADPCM_IMA_EA_EACS` =>
          Some("AV_CODEC_ID_ADPCM_IMA_EA_EACS")
        case `AV_CODEC_ID_ADPCM_EA_XAS`      => Some("AV_CODEC_ID_ADPCM_EA_XAS")
        case `AV_CODEC_ID_ADPCM_EA_MAXIS_XA` =>
          Some("AV_CODEC_ID_ADPCM_EA_MAXIS_XA")
        case `AV_CODEC_ID_ADPCM_IMA_ISS`  => Some("AV_CODEC_ID_ADPCM_IMA_ISS")
        case `AV_CODEC_ID_ADPCM_G722`     => Some("AV_CODEC_ID_ADPCM_G722")
        case `AV_CODEC_ID_ADPCM_IMA_APC`  => Some("AV_CODEC_ID_ADPCM_IMA_APC")
        case `AV_CODEC_ID_ADPCM_VIMA`     => Some("AV_CODEC_ID_ADPCM_VIMA")
        case `AV_CODEC_ID_ADPCM_AFC`      => Some("AV_CODEC_ID_ADPCM_AFC")
        case `AV_CODEC_ID_ADPCM_IMA_OKI`  => Some("AV_CODEC_ID_ADPCM_IMA_OKI")
        case `AV_CODEC_ID_ADPCM_DTK`      => Some("AV_CODEC_ID_ADPCM_DTK")
        case `AV_CODEC_ID_ADPCM_IMA_RAD`  => Some("AV_CODEC_ID_ADPCM_IMA_RAD")
        case `AV_CODEC_ID_ADPCM_G726LE`   => Some("AV_CODEC_ID_ADPCM_G726LE")
        case `AV_CODEC_ID_ADPCM_THP_LE`   => Some("AV_CODEC_ID_ADPCM_THP_LE")
        case `AV_CODEC_ID_ADPCM_PSX`      => Some("AV_CODEC_ID_ADPCM_PSX")
        case `AV_CODEC_ID_ADPCM_AICA`     => Some("AV_CODEC_ID_ADPCM_AICA")
        case `AV_CODEC_ID_ADPCM_IMA_DAT4` => Some("AV_CODEC_ID_ADPCM_IMA_DAT4")
        case `AV_CODEC_ID_ADPCM_MTAF`     => Some("AV_CODEC_ID_ADPCM_MTAF")
        case `AV_CODEC_ID_ADPCM_AGM`      => Some("AV_CODEC_ID_ADPCM_AGM")
        case `AV_CODEC_ID_ADPCM_ARGO`     => Some("AV_CODEC_ID_ADPCM_ARGO")
        case `AV_CODEC_ID_ADPCM_IMA_SSI`  => Some("AV_CODEC_ID_ADPCM_IMA_SSI")
        case `AV_CODEC_ID_ADPCM_ZORK`     => Some("AV_CODEC_ID_ADPCM_ZORK")
        case `AV_CODEC_ID_ADPCM_IMA_APM`  => Some("AV_CODEC_ID_ADPCM_IMA_APM")
        case `AV_CODEC_ID_ADPCM_IMA_ALP`  => Some("AV_CODEC_ID_ADPCM_IMA_ALP")
        case `AV_CODEC_ID_ADPCM_IMA_MTF`  => Some("AV_CODEC_ID_ADPCM_IMA_MTF")
        case `AV_CODEC_ID_ADPCM_IMA_CUNNING` =>
          Some("AV_CODEC_ID_ADPCM_IMA_CUNNING")
        case `AV_CODEC_ID_ADPCM_IMA_MOFLEX` =>
          Some("AV_CODEC_ID_ADPCM_IMA_MOFLEX")
        case `AV_CODEC_ID_ADPCM_IMA_ACORN` =>
          Some("AV_CODEC_ID_ADPCM_IMA_ACORN")
        case `AV_CODEC_ID_ADPCM_XMD`       => Some("AV_CODEC_ID_ADPCM_XMD")
        case `AV_CODEC_ID_AMR_NB`          => Some("AV_CODEC_ID_AMR_NB")
        case `AV_CODEC_ID_AMR_WB`          => Some("AV_CODEC_ID_AMR_WB")
        case `AV_CODEC_ID_RA_144`          => Some("AV_CODEC_ID_RA_144")
        case `AV_CODEC_ID_RA_288`          => Some("AV_CODEC_ID_RA_288")
        case `AV_CODEC_ID_ROQ_DPCM`        => Some("AV_CODEC_ID_ROQ_DPCM")
        case `AV_CODEC_ID_INTERPLAY_DPCM`  => Some("AV_CODEC_ID_INTERPLAY_DPCM")
        case `AV_CODEC_ID_XAN_DPCM`        => Some("AV_CODEC_ID_XAN_DPCM")
        case `AV_CODEC_ID_SOL_DPCM`        => Some("AV_CODEC_ID_SOL_DPCM")
        case `AV_CODEC_ID_SDX2_DPCM`       => Some("AV_CODEC_ID_SDX2_DPCM")
        case `AV_CODEC_ID_GREMLIN_DPCM`    => Some("AV_CODEC_ID_GREMLIN_DPCM")
        case `AV_CODEC_ID_DERF_DPCM`       => Some("AV_CODEC_ID_DERF_DPCM")
        case `AV_CODEC_ID_WADY_DPCM`       => Some("AV_CODEC_ID_WADY_DPCM")
        case `AV_CODEC_ID_CBD2_DPCM`       => Some("AV_CODEC_ID_CBD2_DPCM")
        case `AV_CODEC_ID_MP2`             => Some("AV_CODEC_ID_MP2")
        case `AV_CODEC_ID_MP3`             => Some("AV_CODEC_ID_MP3")
        case `AV_CODEC_ID_AAC`             => Some("AV_CODEC_ID_AAC")
        case `AV_CODEC_ID_AC3`             => Some("AV_CODEC_ID_AC3")
        case `AV_CODEC_ID_DTS`             => Some("AV_CODEC_ID_DTS")
        case `AV_CODEC_ID_VORBIS`          => Some("AV_CODEC_ID_VORBIS")
        case `AV_CODEC_ID_DVAUDIO`         => Some("AV_CODEC_ID_DVAUDIO")
        case `AV_CODEC_ID_WMAV1`           => Some("AV_CODEC_ID_WMAV1")
        case `AV_CODEC_ID_WMAV2`           => Some("AV_CODEC_ID_WMAV2")
        case `AV_CODEC_ID_MACE3`           => Some("AV_CODEC_ID_MACE3")
        case `AV_CODEC_ID_MACE6`           => Some("AV_CODEC_ID_MACE6")
        case `AV_CODEC_ID_VMDAUDIO`        => Some("AV_CODEC_ID_VMDAUDIO")
        case `AV_CODEC_ID_FLAC`            => Some("AV_CODEC_ID_FLAC")
        case `AV_CODEC_ID_MP3ADU`          => Some("AV_CODEC_ID_MP3ADU")
        case `AV_CODEC_ID_MP3ON4`          => Some("AV_CODEC_ID_MP3ON4")
        case `AV_CODEC_ID_SHORTEN`         => Some("AV_CODEC_ID_SHORTEN")
        case `AV_CODEC_ID_ALAC`            => Some("AV_CODEC_ID_ALAC")
        case `AV_CODEC_ID_WESTWOOD_SND1`   => Some("AV_CODEC_ID_WESTWOOD_SND1")
        case `AV_CODEC_ID_GSM`             => Some("AV_CODEC_ID_GSM")
        case `AV_CODEC_ID_QDM2`            => Some("AV_CODEC_ID_QDM2")
        case `AV_CODEC_ID_COOK`            => Some("AV_CODEC_ID_COOK")
        case `AV_CODEC_ID_TRUESPEECH`      => Some("AV_CODEC_ID_TRUESPEECH")
        case `AV_CODEC_ID_TTA`             => Some("AV_CODEC_ID_TTA")
        case `AV_CODEC_ID_SMACKAUDIO`      => Some("AV_CODEC_ID_SMACKAUDIO")
        case `AV_CODEC_ID_QCELP`           => Some("AV_CODEC_ID_QCELP")
        case `AV_CODEC_ID_WAVPACK`         => Some("AV_CODEC_ID_WAVPACK")
        case `AV_CODEC_ID_DSICINAUDIO`     => Some("AV_CODEC_ID_DSICINAUDIO")
        case `AV_CODEC_ID_IMC`             => Some("AV_CODEC_ID_IMC")
        case `AV_CODEC_ID_MUSEPACK7`       => Some("AV_CODEC_ID_MUSEPACK7")
        case `AV_CODEC_ID_MLP`             => Some("AV_CODEC_ID_MLP")
        case `AV_CODEC_ID_GSM_MS`          => Some("AV_CODEC_ID_GSM_MS")
        case `AV_CODEC_ID_ATRAC3`          => Some("AV_CODEC_ID_ATRAC3")
        case `AV_CODEC_ID_APE`             => Some("AV_CODEC_ID_APE")
        case `AV_CODEC_ID_NELLYMOSER`      => Some("AV_CODEC_ID_NELLYMOSER")
        case `AV_CODEC_ID_MUSEPACK8`       => Some("AV_CODEC_ID_MUSEPACK8")
        case `AV_CODEC_ID_SPEEX`           => Some("AV_CODEC_ID_SPEEX")
        case `AV_CODEC_ID_WMAVOICE`        => Some("AV_CODEC_ID_WMAVOICE")
        case `AV_CODEC_ID_WMAPRO`          => Some("AV_CODEC_ID_WMAPRO")
        case `AV_CODEC_ID_WMALOSSLESS`     => Some("AV_CODEC_ID_WMALOSSLESS")
        case `AV_CODEC_ID_ATRAC3P`         => Some("AV_CODEC_ID_ATRAC3P")
        case `AV_CODEC_ID_EAC3`            => Some("AV_CODEC_ID_EAC3")
        case `AV_CODEC_ID_SIPR`            => Some("AV_CODEC_ID_SIPR")
        case `AV_CODEC_ID_MP1`             => Some("AV_CODEC_ID_MP1")
        case `AV_CODEC_ID_TWINVQ`          => Some("AV_CODEC_ID_TWINVQ")
        case `AV_CODEC_ID_TRUEHD`          => Some("AV_CODEC_ID_TRUEHD")
        case `AV_CODEC_ID_MP4ALS`          => Some("AV_CODEC_ID_MP4ALS")
        case `AV_CODEC_ID_ATRAC1`          => Some("AV_CODEC_ID_ATRAC1")
        case `AV_CODEC_ID_BINKAUDIO_RDFT`  => Some("AV_CODEC_ID_BINKAUDIO_RDFT")
        case `AV_CODEC_ID_BINKAUDIO_DCT`   => Some("AV_CODEC_ID_BINKAUDIO_DCT")
        case `AV_CODEC_ID_AAC_LATM`        => Some("AV_CODEC_ID_AAC_LATM")
        case `AV_CODEC_ID_QDMC`            => Some("AV_CODEC_ID_QDMC")
        case `AV_CODEC_ID_CELT`            => Some("AV_CODEC_ID_CELT")
        case `AV_CODEC_ID_G723_1`          => Some("AV_CODEC_ID_G723_1")
        case `AV_CODEC_ID_G729`            => Some("AV_CODEC_ID_G729")
        case `AV_CODEC_ID_8SVX_EXP`        => Some("AV_CODEC_ID_8SVX_EXP")
        case `AV_CODEC_ID_8SVX_FIB`        => Some("AV_CODEC_ID_8SVX_FIB")
        case `AV_CODEC_ID_BMV_AUDIO`       => Some("AV_CODEC_ID_BMV_AUDIO")
        case `AV_CODEC_ID_RALF`            => Some("AV_CODEC_ID_RALF")
        case `AV_CODEC_ID_IAC`             => Some("AV_CODEC_ID_IAC")
        case `AV_CODEC_ID_ILBC`            => Some("AV_CODEC_ID_ILBC")
        case `AV_CODEC_ID_OPUS`            => Some("AV_CODEC_ID_OPUS")
        case `AV_CODEC_ID_COMFORT_NOISE`   => Some("AV_CODEC_ID_COMFORT_NOISE")
        case `AV_CODEC_ID_TAK`             => Some("AV_CODEC_ID_TAK")
        case `AV_CODEC_ID_METASOUND`       => Some("AV_CODEC_ID_METASOUND")
        case `AV_CODEC_ID_PAF_AUDIO`       => Some("AV_CODEC_ID_PAF_AUDIO")
        case `AV_CODEC_ID_ON2AVC`          => Some("AV_CODEC_ID_ON2AVC")
        case `AV_CODEC_ID_DSS_SP`          => Some("AV_CODEC_ID_DSS_SP")
        case `AV_CODEC_ID_CODEC2`          => Some("AV_CODEC_ID_CODEC2")
        case `AV_CODEC_ID_FFWAVESYNTH`     => Some("AV_CODEC_ID_FFWAVESYNTH")
        case `AV_CODEC_ID_SONIC`           => Some("AV_CODEC_ID_SONIC")
        case `AV_CODEC_ID_SONIC_LS`        => Some("AV_CODEC_ID_SONIC_LS")
        case `AV_CODEC_ID_EVRC`            => Some("AV_CODEC_ID_EVRC")
        case `AV_CODEC_ID_SMV`             => Some("AV_CODEC_ID_SMV")
        case `AV_CODEC_ID_DSD_LSBF`        => Some("AV_CODEC_ID_DSD_LSBF")
        case `AV_CODEC_ID_DSD_MSBF`        => Some("AV_CODEC_ID_DSD_MSBF")
        case `AV_CODEC_ID_DSD_LSBF_PLANAR` =>
          Some("AV_CODEC_ID_DSD_LSBF_PLANAR")
        case `AV_CODEC_ID_DSD_MSBF_PLANAR` =>
          Some("AV_CODEC_ID_DSD_MSBF_PLANAR")
        case `AV_CODEC_ID_4GV`            => Some("AV_CODEC_ID_4GV")
        case `AV_CODEC_ID_INTERPLAY_ACM`  => Some("AV_CODEC_ID_INTERPLAY_ACM")
        case `AV_CODEC_ID_XMA1`           => Some("AV_CODEC_ID_XMA1")
        case `AV_CODEC_ID_XMA2`           => Some("AV_CODEC_ID_XMA2")
        case `AV_CODEC_ID_DST`            => Some("AV_CODEC_ID_DST")
        case `AV_CODEC_ID_ATRAC3AL`       => Some("AV_CODEC_ID_ATRAC3AL")
        case `AV_CODEC_ID_ATRAC3PAL`      => Some("AV_CODEC_ID_ATRAC3PAL")
        case `AV_CODEC_ID_DOLBY_E`        => Some("AV_CODEC_ID_DOLBY_E")
        case `AV_CODEC_ID_APTX`           => Some("AV_CODEC_ID_APTX")
        case `AV_CODEC_ID_APTX_HD`        => Some("AV_CODEC_ID_APTX_HD")
        case `AV_CODEC_ID_SBC`            => Some("AV_CODEC_ID_SBC")
        case `AV_CODEC_ID_ATRAC9`         => Some("AV_CODEC_ID_ATRAC9")
        case `AV_CODEC_ID_HCOM`           => Some("AV_CODEC_ID_HCOM")
        case `AV_CODEC_ID_ACELP_KELVIN`   => Some("AV_CODEC_ID_ACELP_KELVIN")
        case `AV_CODEC_ID_MPEGH_3D_AUDIO` => Some("AV_CODEC_ID_MPEGH_3D_AUDIO")
        case `AV_CODEC_ID_SIREN`          => Some("AV_CODEC_ID_SIREN")
        case `AV_CODEC_ID_HCA`            => Some("AV_CODEC_ID_HCA")
        case `AV_CODEC_ID_FASTAUDIO`      => Some("AV_CODEC_ID_FASTAUDIO")
        case `AV_CODEC_ID_MSNSIREN`       => Some("AV_CODEC_ID_MSNSIREN")
        case `AV_CODEC_ID_DFPWM`          => Some("AV_CODEC_ID_DFPWM")
        case `AV_CODEC_ID_BONK`           => Some("AV_CODEC_ID_BONK")
        case `AV_CODEC_ID_MISC4`          => Some("AV_CODEC_ID_MISC4")
        case `AV_CODEC_ID_APAC`           => Some("AV_CODEC_ID_APAC")
        case `AV_CODEC_ID_FTR`            => Some("AV_CODEC_ID_FTR")
        case `AV_CODEC_ID_WAVARC`         => Some("AV_CODEC_ID_WAVARC")
        case `AV_CODEC_ID_RKA`            => Some("AV_CODEC_ID_RKA")
        case `AV_CODEC_ID_AC4`            => Some("AV_CODEC_ID_AC4")
        case `AV_CODEC_ID_OSQ`            => Some("AV_CODEC_ID_OSQ")
        case `AV_CODEC_ID_QOA`            => Some("AV_CODEC_ID_QOA")
        case `AV_CODEC_ID_LC3`            => Some("AV_CODEC_ID_LC3")
        case `AV_CODEC_ID_FIRST_SUBTITLE` => Some("AV_CODEC_ID_FIRST_SUBTITLE")
        case `AV_CODEC_ID_DVD_SUBTITLE`   => Some("AV_CODEC_ID_DVD_SUBTITLE")
        case `AV_CODEC_ID_DVB_SUBTITLE`   => Some("AV_CODEC_ID_DVB_SUBTITLE")
        case `AV_CODEC_ID_TEXT`           => Some("AV_CODEC_ID_TEXT")
        case `AV_CODEC_ID_XSUB`           => Some("AV_CODEC_ID_XSUB")
        case `AV_CODEC_ID_SSA`            => Some("AV_CODEC_ID_SSA")
        case `AV_CODEC_ID_MOV_TEXT`       => Some("AV_CODEC_ID_MOV_TEXT")
        case `AV_CODEC_ID_HDMV_PGS_SUBTITLE` =>
          Some("AV_CODEC_ID_HDMV_PGS_SUBTITLE")
        case `AV_CODEC_ID_DVB_TELETEXT` => Some("AV_CODEC_ID_DVB_TELETEXT")
        case `AV_CODEC_ID_SRT`          => Some("AV_CODEC_ID_SRT")
        case `AV_CODEC_ID_MICRODVD`     => Some("AV_CODEC_ID_MICRODVD")
        case `AV_CODEC_ID_EIA_608`      => Some("AV_CODEC_ID_EIA_608")
        case `AV_CODEC_ID_JACOSUB`      => Some("AV_CODEC_ID_JACOSUB")
        case `AV_CODEC_ID_SAMI`         => Some("AV_CODEC_ID_SAMI")
        case `AV_CODEC_ID_REALTEXT`     => Some("AV_CODEC_ID_REALTEXT")
        case `AV_CODEC_ID_STL`          => Some("AV_CODEC_ID_STL")
        case `AV_CODEC_ID_SUBVIEWER1`   => Some("AV_CODEC_ID_SUBVIEWER1")
        case `AV_CODEC_ID_SUBVIEWER`    => Some("AV_CODEC_ID_SUBVIEWER")
        case `AV_CODEC_ID_SUBRIP`       => Some("AV_CODEC_ID_SUBRIP")
        case `AV_CODEC_ID_WEBVTT`       => Some("AV_CODEC_ID_WEBVTT")
        case `AV_CODEC_ID_MPL2`         => Some("AV_CODEC_ID_MPL2")
        case `AV_CODEC_ID_VPLAYER`      => Some("AV_CODEC_ID_VPLAYER")
        case `AV_CODEC_ID_PJS`          => Some("AV_CODEC_ID_PJS")
        case `AV_CODEC_ID_ASS`          => Some("AV_CODEC_ID_ASS")
        case `AV_CODEC_ID_HDMV_TEXT_SUBTITLE` =>
          Some("AV_CODEC_ID_HDMV_TEXT_SUBTITLE")
        case `AV_CODEC_ID_TTML`            => Some("AV_CODEC_ID_TTML")
        case `AV_CODEC_ID_ARIB_CAPTION`    => Some("AV_CODEC_ID_ARIB_CAPTION")
        case `AV_CODEC_ID_FIRST_UNKNOWN`   => Some("AV_CODEC_ID_FIRST_UNKNOWN")
        case `AV_CODEC_ID_TTF`             => Some("AV_CODEC_ID_TTF")
        case `AV_CODEC_ID_SCTE_35`         => Some("AV_CODEC_ID_SCTE_35")
        case `AV_CODEC_ID_EPG`             => Some("AV_CODEC_ID_EPG")
        case `AV_CODEC_ID_BINTEXT`         => Some("AV_CODEC_ID_BINTEXT")
        case `AV_CODEC_ID_XBIN`            => Some("AV_CODEC_ID_XBIN")
        case `AV_CODEC_ID_IDF`             => Some("AV_CODEC_ID_IDF")
        case `AV_CODEC_ID_OTF`             => Some("AV_CODEC_ID_OTF")
        case `AV_CODEC_ID_SMPTE_KLV`       => Some("AV_CODEC_ID_SMPTE_KLV")
        case `AV_CODEC_ID_DVD_NAV`         => Some("AV_CODEC_ID_DVD_NAV")
        case `AV_CODEC_ID_TIMED_ID3`       => Some("AV_CODEC_ID_TIMED_ID3")
        case `AV_CODEC_ID_BIN_DATA`        => Some("AV_CODEC_ID_BIN_DATA")
        case `AV_CODEC_ID_SMPTE_2038`      => Some("AV_CODEC_ID_SMPTE_2038")
        case `AV_CODEC_ID_LCEVC`           => Some("AV_CODEC_ID_LCEVC")
        case `AV_CODEC_ID_PROBE`           => Some("AV_CODEC_ID_PROBE")
        case `AV_CODEC_ID_MPEG2TS`         => Some("AV_CODEC_ID_MPEG2TS")
        case `AV_CODEC_ID_MPEG4SYSTEMS`    => Some("AV_CODEC_ID_MPEG4SYSTEMS")
        case `AV_CODEC_ID_FFMETADATA`      => Some("AV_CODEC_ID_FFMETADATA")
        case `AV_CODEC_ID_WRAPPED_AVFRAME` =>
          Some("AV_CODEC_ID_WRAPPED_AVFRAME")
        case `AV_CODEC_ID_VNULL` => Some("AV_CODEC_ID_VNULL")
        case `AV_CODEC_ID_ANULL` => Some("AV_CODEC_ID_ANULL")
        case _                   => _root_.scala.None
    extension (a: AVCodecID)
      inline def &(b: AVCodecID): AVCodecID = a & b
      inline def |(b: AVCodecID): AVCodecID = a | b
      inline def is(b: AVCodecID): Boolean = (a & b) == b
  end AVCodecID

  /** Chromaticity coordinates of the source primaries. These values match the
    * ones defined by ISO/IEC 23091-2_2019 subclause 8.1 and ITU-T H.273.
    */
  opaque type AVColorPrimaries = CUnsignedInt
  object AVColorPrimaries extends _BindgenEnumCUnsignedInt[AVColorPrimaries]:
    given _tag: Tag[AVColorPrimaries] = Tag.UInt
    inline def define(inline a: Long): AVColorPrimaries = a.toUInt
    val AVCOL_PRI_RESERVED0 = define(0)
    val AVCOL_PRI_BT709 = define(1)
    val AVCOL_PRI_UNSPECIFIED = define(2)
    val AVCOL_PRI_RESERVED = define(3)
    val AVCOL_PRI_BT470M = define(4)
    val AVCOL_PRI_BT470BG = define(5)
    val AVCOL_PRI_SMPTE170M = define(6)
    val AVCOL_PRI_SMPTE240M = define(7)
    val AVCOL_PRI_FILM = define(8)
    val AVCOL_PRI_BT2020 = define(9)
    val AVCOL_PRI_SMPTE428 = define(10)
    val AVCOL_PRI_SMPTEST428_1 = define(10)
    val AVCOL_PRI_SMPTE431 = define(11)
    val AVCOL_PRI_SMPTE432 = define(12)
    val AVCOL_PRI_EBU3213 = define(22)
    val AVCOL_PRI_JEDEC_P22 = define(22)
    val AVCOL_PRI_NB = define(23)
    def getName(value: AVColorPrimaries): Option[String] =
      value match
        case `AVCOL_PRI_RESERVED0`    => Some("AVCOL_PRI_RESERVED0")
        case `AVCOL_PRI_BT709`        => Some("AVCOL_PRI_BT709")
        case `AVCOL_PRI_UNSPECIFIED`  => Some("AVCOL_PRI_UNSPECIFIED")
        case `AVCOL_PRI_RESERVED`     => Some("AVCOL_PRI_RESERVED")
        case `AVCOL_PRI_BT470M`       => Some("AVCOL_PRI_BT470M")
        case `AVCOL_PRI_BT470BG`      => Some("AVCOL_PRI_BT470BG")
        case `AVCOL_PRI_SMPTE170M`    => Some("AVCOL_PRI_SMPTE170M")
        case `AVCOL_PRI_SMPTE240M`    => Some("AVCOL_PRI_SMPTE240M")
        case `AVCOL_PRI_FILM`         => Some("AVCOL_PRI_FILM")
        case `AVCOL_PRI_BT2020`       => Some("AVCOL_PRI_BT2020")
        case `AVCOL_PRI_SMPTE428`     => Some("AVCOL_PRI_SMPTE428")
        case `AVCOL_PRI_SMPTEST428_1` => Some("AVCOL_PRI_SMPTEST428_1")
        case `AVCOL_PRI_SMPTE431`     => Some("AVCOL_PRI_SMPTE431")
        case `AVCOL_PRI_SMPTE432`     => Some("AVCOL_PRI_SMPTE432")
        case `AVCOL_PRI_EBU3213`      => Some("AVCOL_PRI_EBU3213")
        case `AVCOL_PRI_JEDEC_P22`    => Some("AVCOL_PRI_JEDEC_P22")
        case `AVCOL_PRI_NB`           => Some("AVCOL_PRI_NB")
        case _                        => _root_.scala.None
    extension (a: AVColorPrimaries)
      inline def &(b: AVColorPrimaries): AVColorPrimaries = a & b
      inline def |(b: AVColorPrimaries): AVColorPrimaries = a | b
      inline def is(b: AVColorPrimaries): Boolean = (a & b) == b
  end AVColorPrimaries

  /** Visual content value range.
    */
  opaque type AVColorRange = CUnsignedInt
  object AVColorRange extends _BindgenEnumCUnsignedInt[AVColorRange]:
    given _tag: Tag[AVColorRange] = Tag.UInt
    inline def define(inline a: Long): AVColorRange = a.toUInt
    val AVCOL_RANGE_UNSPECIFIED = define(0)
    val AVCOL_RANGE_MPEG = define(1)
    val AVCOL_RANGE_JPEG = define(2)
    val AVCOL_RANGE_NB = define(3)
    def getName(value: AVColorRange): Option[String] =
      value match
        case `AVCOL_RANGE_UNSPECIFIED` => Some("AVCOL_RANGE_UNSPECIFIED")
        case `AVCOL_RANGE_MPEG`        => Some("AVCOL_RANGE_MPEG")
        case `AVCOL_RANGE_JPEG`        => Some("AVCOL_RANGE_JPEG")
        case `AVCOL_RANGE_NB`          => Some("AVCOL_RANGE_NB")
        case _                         => _root_.scala.None
    extension (a: AVColorRange)
      inline def &(b: AVColorRange): AVColorRange = a & b
      inline def |(b: AVColorRange): AVColorRange = a | b
      inline def is(b: AVColorRange): Boolean = (a & b) == b
  end AVColorRange

  /** YUV colorspace type. These values match the ones defined by ISO/IEC
    * 23091-2_2019 subclause 8.3.
    */
  opaque type AVColorSpace = CUnsignedInt
  object AVColorSpace extends _BindgenEnumCUnsignedInt[AVColorSpace]:
    given _tag: Tag[AVColorSpace] = Tag.UInt
    inline def define(inline a: Long): AVColorSpace = a.toUInt
    val AVCOL_SPC_RGB = define(0)
    val AVCOL_SPC_BT709 = define(1)
    val AVCOL_SPC_UNSPECIFIED = define(2)
    val AVCOL_SPC_RESERVED = define(3)
    val AVCOL_SPC_FCC = define(4)
    val AVCOL_SPC_BT470BG = define(5)
    val AVCOL_SPC_SMPTE170M = define(6)
    val AVCOL_SPC_SMPTE240M = define(7)
    val AVCOL_SPC_YCGCO = define(8)
    val AVCOL_SPC_YCOCG = define(8)
    val AVCOL_SPC_BT2020_NCL = define(9)
    val AVCOL_SPC_BT2020_CL = define(10)
    val AVCOL_SPC_SMPTE2085 = define(11)
    val AVCOL_SPC_CHROMA_DERIVED_NCL = define(12)
    val AVCOL_SPC_CHROMA_DERIVED_CL = define(13)
    val AVCOL_SPC_ICTCP = define(14)
    val AVCOL_SPC_IPT_C2 = define(15)
    val AVCOL_SPC_YCGCO_RE = define(16)
    val AVCOL_SPC_YCGCO_RO = define(17)
    val AVCOL_SPC_NB = define(18)
    def getName(value: AVColorSpace): Option[String] =
      value match
        case `AVCOL_SPC_RGB`                => Some("AVCOL_SPC_RGB")
        case `AVCOL_SPC_BT709`              => Some("AVCOL_SPC_BT709")
        case `AVCOL_SPC_UNSPECIFIED`        => Some("AVCOL_SPC_UNSPECIFIED")
        case `AVCOL_SPC_RESERVED`           => Some("AVCOL_SPC_RESERVED")
        case `AVCOL_SPC_FCC`                => Some("AVCOL_SPC_FCC")
        case `AVCOL_SPC_BT470BG`            => Some("AVCOL_SPC_BT470BG")
        case `AVCOL_SPC_SMPTE170M`          => Some("AVCOL_SPC_SMPTE170M")
        case `AVCOL_SPC_SMPTE240M`          => Some("AVCOL_SPC_SMPTE240M")
        case `AVCOL_SPC_YCGCO`              => Some("AVCOL_SPC_YCGCO")
        case `AVCOL_SPC_YCOCG`              => Some("AVCOL_SPC_YCOCG")
        case `AVCOL_SPC_BT2020_NCL`         => Some("AVCOL_SPC_BT2020_NCL")
        case `AVCOL_SPC_BT2020_CL`          => Some("AVCOL_SPC_BT2020_CL")
        case `AVCOL_SPC_SMPTE2085`          => Some("AVCOL_SPC_SMPTE2085")
        case `AVCOL_SPC_CHROMA_DERIVED_NCL` =>
          Some("AVCOL_SPC_CHROMA_DERIVED_NCL")
        case `AVCOL_SPC_CHROMA_DERIVED_CL` =>
          Some("AVCOL_SPC_CHROMA_DERIVED_CL")
        case `AVCOL_SPC_ICTCP`    => Some("AVCOL_SPC_ICTCP")
        case `AVCOL_SPC_IPT_C2`   => Some("AVCOL_SPC_IPT_C2")
        case `AVCOL_SPC_YCGCO_RE` => Some("AVCOL_SPC_YCGCO_RE")
        case `AVCOL_SPC_YCGCO_RO` => Some("AVCOL_SPC_YCGCO_RO")
        case `AVCOL_SPC_NB`       => Some("AVCOL_SPC_NB")
        case _                    => _root_.scala.None
    extension (a: AVColorSpace)
      inline def &(b: AVColorSpace): AVColorSpace = a & b
      inline def |(b: AVColorSpace): AVColorSpace = a | b
      inline def is(b: AVColorSpace): Boolean = (a & b) == b
  end AVColorSpace

  /** Color Transfer Characteristic. These values match the ones defined by
    * ISO/IEC 23091-2_2019 subclause 8.2.
    */
  opaque type AVColorTransferCharacteristic = CUnsignedInt
  object AVColorTransferCharacteristic
      extends _BindgenEnumCUnsignedInt[AVColorTransferCharacteristic]:
    given _tag: Tag[AVColorTransferCharacteristic] = Tag.UInt
    inline def define(inline a: Long): AVColorTransferCharacteristic = a.toUInt
    val AVCOL_TRC_RESERVED0 = define(0)
    val AVCOL_TRC_BT709 = define(1)
    val AVCOL_TRC_UNSPECIFIED = define(2)
    val AVCOL_TRC_RESERVED = define(3)
    val AVCOL_TRC_GAMMA22 = define(4)
    val AVCOL_TRC_GAMMA28 = define(5)
    val AVCOL_TRC_SMPTE170M = define(6)
    val AVCOL_TRC_SMPTE240M = define(7)
    val AVCOL_TRC_LINEAR = define(8)
    val AVCOL_TRC_LOG = define(9)
    val AVCOL_TRC_LOG_SQRT = define(10)
    val AVCOL_TRC_IEC61966_2_4 = define(11)
    val AVCOL_TRC_BT1361_ECG = define(12)
    val AVCOL_TRC_IEC61966_2_1 = define(13)
    val AVCOL_TRC_BT2020_10 = define(14)
    val AVCOL_TRC_BT2020_12 = define(15)
    val AVCOL_TRC_SMPTE2084 = define(16)
    val AVCOL_TRC_SMPTEST2084 = define(16)
    val AVCOL_TRC_SMPTE428 = define(17)
    val AVCOL_TRC_SMPTEST428_1 = define(17)
    val AVCOL_TRC_ARIB_STD_B67 = define(18)
    val AVCOL_TRC_NB = define(19)
    def getName(value: AVColorTransferCharacteristic): Option[String] =
      value match
        case `AVCOL_TRC_RESERVED0`    => Some("AVCOL_TRC_RESERVED0")
        case `AVCOL_TRC_BT709`        => Some("AVCOL_TRC_BT709")
        case `AVCOL_TRC_UNSPECIFIED`  => Some("AVCOL_TRC_UNSPECIFIED")
        case `AVCOL_TRC_RESERVED`     => Some("AVCOL_TRC_RESERVED")
        case `AVCOL_TRC_GAMMA22`      => Some("AVCOL_TRC_GAMMA22")
        case `AVCOL_TRC_GAMMA28`      => Some("AVCOL_TRC_GAMMA28")
        case `AVCOL_TRC_SMPTE170M`    => Some("AVCOL_TRC_SMPTE170M")
        case `AVCOL_TRC_SMPTE240M`    => Some("AVCOL_TRC_SMPTE240M")
        case `AVCOL_TRC_LINEAR`       => Some("AVCOL_TRC_LINEAR")
        case `AVCOL_TRC_LOG`          => Some("AVCOL_TRC_LOG")
        case `AVCOL_TRC_LOG_SQRT`     => Some("AVCOL_TRC_LOG_SQRT")
        case `AVCOL_TRC_IEC61966_2_4` => Some("AVCOL_TRC_IEC61966_2_4")
        case `AVCOL_TRC_BT1361_ECG`   => Some("AVCOL_TRC_BT1361_ECG")
        case `AVCOL_TRC_IEC61966_2_1` => Some("AVCOL_TRC_IEC61966_2_1")
        case `AVCOL_TRC_BT2020_10`    => Some("AVCOL_TRC_BT2020_10")
        case `AVCOL_TRC_BT2020_12`    => Some("AVCOL_TRC_BT2020_12")
        case `AVCOL_TRC_SMPTE2084`    => Some("AVCOL_TRC_SMPTE2084")
        case `AVCOL_TRC_SMPTEST2084`  => Some("AVCOL_TRC_SMPTEST2084")
        case `AVCOL_TRC_SMPTE428`     => Some("AVCOL_TRC_SMPTE428")
        case `AVCOL_TRC_SMPTEST428_1` => Some("AVCOL_TRC_SMPTEST428_1")
        case `AVCOL_TRC_ARIB_STD_B67` => Some("AVCOL_TRC_ARIB_STD_B67")
        case `AVCOL_TRC_NB`           => Some("AVCOL_TRC_NB")
        case _                        => _root_.scala.None
    extension (a: AVColorTransferCharacteristic)
      inline def &(
          b: AVColorTransferCharacteristic
      ): AVColorTransferCharacteristic = a & b
      inline def |(
          b: AVColorTransferCharacteristic
      ): AVColorTransferCharacteristic = a | b
      inline def is(b: AVColorTransferCharacteristic): Boolean = (a & b) == b
  end AVColorTransferCharacteristic

  opaque type AVDiscard = CInt
  object AVDiscard extends _BindgenEnumCInt[AVDiscard]:
    given _tag: Tag[AVDiscard] = Tag.Int
    inline def define(inline a: CInt): AVDiscard = a
    val AVDISCARD_NONE = define(-16)
    val AVDISCARD_DEFAULT = define(0)
    val AVDISCARD_NONREF = define(8)
    val AVDISCARD_BIDIR = define(16)
    val AVDISCARD_NONINTRA = define(24)
    val AVDISCARD_NONKEY = define(32)
    val AVDISCARD_ALL = define(48)
    def getName(value: AVDiscard): Option[String] =
      value match
        case `AVDISCARD_NONE`     => Some("AVDISCARD_NONE")
        case `AVDISCARD_DEFAULT`  => Some("AVDISCARD_DEFAULT")
        case `AVDISCARD_NONREF`   => Some("AVDISCARD_NONREF")
        case `AVDISCARD_BIDIR`    => Some("AVDISCARD_BIDIR")
        case `AVDISCARD_NONINTRA` => Some("AVDISCARD_NONINTRA")
        case `AVDISCARD_NONKEY`   => Some("AVDISCARD_NONKEY")
        case `AVDISCARD_ALL`      => Some("AVDISCARD_ALL")
        case _                    => _root_.scala.None
    extension (a: AVDiscard)
      inline def &(b: AVDiscard): AVDiscard = a & b
      inline def |(b: AVDiscard): AVDiscard = a | b
      inline def is(b: AVDiscard): Boolean = (a & b) == b
  end AVDiscard

  /** The duration of a video can be estimated through various ways, and this
    * enum can be used to know how the duration was estimated.
    */
  opaque type AVDurationEstimationMethod = CUnsignedInt
  object AVDurationEstimationMethod
      extends _BindgenEnumCUnsignedInt[AVDurationEstimationMethod]:
    given _tag: Tag[AVDurationEstimationMethod] = Tag.UInt
    inline def define(inline a: Long): AVDurationEstimationMethod = a.toUInt
    val AVFMT_DURATION_FROM_PTS = define(0)
    val AVFMT_DURATION_FROM_STREAM = define(1)
    val AVFMT_DURATION_FROM_BITRATE = define(2)
    def getName(value: AVDurationEstimationMethod): Option[String] =
      value match
        case `AVFMT_DURATION_FROM_PTS`     => Some("AVFMT_DURATION_FROM_PTS")
        case `AVFMT_DURATION_FROM_STREAM`  => Some("AVFMT_DURATION_FROM_STREAM")
        case `AVFMT_DURATION_FROM_BITRATE` =>
          Some("AVFMT_DURATION_FROM_BITRATE")
        case _ => _root_.scala.None
    extension (a: AVDurationEstimationMethod)
      inline def &(b: AVDurationEstimationMethod): AVDurationEstimationMethod =
        a & b
      inline def |(b: AVDurationEstimationMethod): AVDurationEstimationMethod =
        a | b
      inline def is(b: AVDurationEstimationMethod): Boolean = (a & b) == b
  end AVDurationEstimationMethod

  opaque type AVFieldOrder = CUnsignedInt
  object AVFieldOrder extends _BindgenEnumCUnsignedInt[AVFieldOrder]:
    given _tag: Tag[AVFieldOrder] = Tag.UInt
    inline def define(inline a: Long): AVFieldOrder = a.toUInt
    val AV_FIELD_UNKNOWN = define(0)
    val AV_FIELD_PROGRESSIVE = define(1)
    val AV_FIELD_TT = define(2)
    val AV_FIELD_BB = define(3)
    val AV_FIELD_TB = define(4)
    val AV_FIELD_BT = define(5)
    def getName(value: AVFieldOrder): Option[String] =
      value match
        case `AV_FIELD_UNKNOWN`     => Some("AV_FIELD_UNKNOWN")
        case `AV_FIELD_PROGRESSIVE` => Some("AV_FIELD_PROGRESSIVE")
        case `AV_FIELD_TT`          => Some("AV_FIELD_TT")
        case `AV_FIELD_BB`          => Some("AV_FIELD_BB")
        case `AV_FIELD_TB`          => Some("AV_FIELD_TB")
        case `AV_FIELD_BT`          => Some("AV_FIELD_BT")
        case _                      => _root_.scala.None
    extension (a: AVFieldOrder)
      inline def &(b: AVFieldOrder): AVFieldOrder = a & b
      inline def |(b: AVFieldOrder): AVFieldOrder = a | b
      inline def is(b: AVFieldOrder): Boolean = (a & b) == b
  end AVFieldOrder

  /** @{
    *   AVFrame is an abstraction for reference-counted raw multimedia data.
    */
  opaque type AVFrameSideDataType = CUnsignedInt
  object AVFrameSideDataType
      extends _BindgenEnumCUnsignedInt[AVFrameSideDataType]:
    given _tag: Tag[AVFrameSideDataType] = Tag.UInt
    inline def define(inline a: Long): AVFrameSideDataType = a.toUInt
    val AV_FRAME_DATA_PANSCAN = define(0)
    val AV_FRAME_DATA_A53_CC = define(1)
    val AV_FRAME_DATA_STEREO3D = define(2)
    val AV_FRAME_DATA_MATRIXENCODING = define(3)
    val AV_FRAME_DATA_DOWNMIX_INFO = define(4)
    val AV_FRAME_DATA_REPLAYGAIN = define(5)
    val AV_FRAME_DATA_DISPLAYMATRIX = define(6)
    val AV_FRAME_DATA_AFD = define(7)
    val AV_FRAME_DATA_MOTION_VECTORS = define(8)
    val AV_FRAME_DATA_SKIP_SAMPLES = define(9)
    val AV_FRAME_DATA_AUDIO_SERVICE_TYPE = define(10)
    val AV_FRAME_DATA_MASTERING_DISPLAY_METADATA = define(11)
    val AV_FRAME_DATA_GOP_TIMECODE = define(12)
    val AV_FRAME_DATA_SPHERICAL = define(13)
    val AV_FRAME_DATA_CONTENT_LIGHT_LEVEL = define(14)
    val AV_FRAME_DATA_ICC_PROFILE = define(15)
    val AV_FRAME_DATA_S12M_TIMECODE = define(16)
    val AV_FRAME_DATA_DYNAMIC_HDR_PLUS = define(17)
    val AV_FRAME_DATA_REGIONS_OF_INTEREST = define(18)
    val AV_FRAME_DATA_VIDEO_ENC_PARAMS = define(19)
    val AV_FRAME_DATA_SEI_UNREGISTERED = define(20)
    val AV_FRAME_DATA_FILM_GRAIN_PARAMS = define(21)
    val AV_FRAME_DATA_DETECTION_BBOXES = define(22)
    val AV_FRAME_DATA_DOVI_RPU_BUFFER = define(23)
    val AV_FRAME_DATA_DOVI_METADATA = define(24)
    val AV_FRAME_DATA_DYNAMIC_HDR_VIVID = define(25)
    val AV_FRAME_DATA_AMBIENT_VIEWING_ENVIRONMENT = define(26)
    val AV_FRAME_DATA_VIDEO_HINT = define(27)
    val AV_FRAME_DATA_LCEVC = define(28)
    val AV_FRAME_DATA_VIEW_ID = define(29)
    def getName(value: AVFrameSideDataType): Option[String] =
      value match
        case `AV_FRAME_DATA_PANSCAN`        => Some("AV_FRAME_DATA_PANSCAN")
        case `AV_FRAME_DATA_A53_CC`         => Some("AV_FRAME_DATA_A53_CC")
        case `AV_FRAME_DATA_STEREO3D`       => Some("AV_FRAME_DATA_STEREO3D")
        case `AV_FRAME_DATA_MATRIXENCODING` =>
          Some("AV_FRAME_DATA_MATRIXENCODING")
        case `AV_FRAME_DATA_DOWNMIX_INFO`  => Some("AV_FRAME_DATA_DOWNMIX_INFO")
        case `AV_FRAME_DATA_REPLAYGAIN`    => Some("AV_FRAME_DATA_REPLAYGAIN")
        case `AV_FRAME_DATA_DISPLAYMATRIX` =>
          Some("AV_FRAME_DATA_DISPLAYMATRIX")
        case `AV_FRAME_DATA_AFD`            => Some("AV_FRAME_DATA_AFD")
        case `AV_FRAME_DATA_MOTION_VECTORS` =>
          Some("AV_FRAME_DATA_MOTION_VECTORS")
        case `AV_FRAME_DATA_SKIP_SAMPLES` => Some("AV_FRAME_DATA_SKIP_SAMPLES")
        case `AV_FRAME_DATA_AUDIO_SERVICE_TYPE` =>
          Some("AV_FRAME_DATA_AUDIO_SERVICE_TYPE")
        case `AV_FRAME_DATA_MASTERING_DISPLAY_METADATA` =>
          Some("AV_FRAME_DATA_MASTERING_DISPLAY_METADATA")
        case `AV_FRAME_DATA_GOP_TIMECODE` => Some("AV_FRAME_DATA_GOP_TIMECODE")
        case `AV_FRAME_DATA_SPHERICAL`    => Some("AV_FRAME_DATA_SPHERICAL")
        case `AV_FRAME_DATA_CONTENT_LIGHT_LEVEL` =>
          Some("AV_FRAME_DATA_CONTENT_LIGHT_LEVEL")
        case `AV_FRAME_DATA_ICC_PROFILE`   => Some("AV_FRAME_DATA_ICC_PROFILE")
        case `AV_FRAME_DATA_S12M_TIMECODE` =>
          Some("AV_FRAME_DATA_S12M_TIMECODE")
        case `AV_FRAME_DATA_DYNAMIC_HDR_PLUS` =>
          Some("AV_FRAME_DATA_DYNAMIC_HDR_PLUS")
        case `AV_FRAME_DATA_REGIONS_OF_INTEREST` =>
          Some("AV_FRAME_DATA_REGIONS_OF_INTEREST")
        case `AV_FRAME_DATA_VIDEO_ENC_PARAMS` =>
          Some("AV_FRAME_DATA_VIDEO_ENC_PARAMS")
        case `AV_FRAME_DATA_SEI_UNREGISTERED` =>
          Some("AV_FRAME_DATA_SEI_UNREGISTERED")
        case `AV_FRAME_DATA_FILM_GRAIN_PARAMS` =>
          Some("AV_FRAME_DATA_FILM_GRAIN_PARAMS")
        case `AV_FRAME_DATA_DETECTION_BBOXES` =>
          Some("AV_FRAME_DATA_DETECTION_BBOXES")
        case `AV_FRAME_DATA_DOVI_RPU_BUFFER` =>
          Some("AV_FRAME_DATA_DOVI_RPU_BUFFER")
        case `AV_FRAME_DATA_DOVI_METADATA` =>
          Some("AV_FRAME_DATA_DOVI_METADATA")
        case `AV_FRAME_DATA_DYNAMIC_HDR_VIVID` =>
          Some("AV_FRAME_DATA_DYNAMIC_HDR_VIVID")
        case `AV_FRAME_DATA_AMBIENT_VIEWING_ENVIRONMENT` =>
          Some("AV_FRAME_DATA_AMBIENT_VIEWING_ENVIRONMENT")
        case `AV_FRAME_DATA_VIDEO_HINT` => Some("AV_FRAME_DATA_VIDEO_HINT")
        case `AV_FRAME_DATA_LCEVC`      => Some("AV_FRAME_DATA_LCEVC")
        case `AV_FRAME_DATA_VIEW_ID`    => Some("AV_FRAME_DATA_VIEW_ID")
        case _                          => _root_.scala.None
    extension (a: AVFrameSideDataType)
      inline def &(b: AVFrameSideDataType): AVFrameSideDataType = a & b
      inline def |(b: AVFrameSideDataType): AVFrameSideDataType = a | b
      inline def is(b: AVFrameSideDataType): Boolean = (a & b) == b
  end AVFrameSideDataType

  opaque type AVHWDeviceType = CUnsignedInt
  object AVHWDeviceType extends _BindgenEnumCUnsignedInt[AVHWDeviceType]:
    given _tag: Tag[AVHWDeviceType] = Tag.UInt
    inline def define(inline a: Long): AVHWDeviceType = a.toUInt
    val AV_HWDEVICE_TYPE_NONE = define(0)
    val AV_HWDEVICE_TYPE_VDPAU = define(1)
    val AV_HWDEVICE_TYPE_CUDA = define(2)
    val AV_HWDEVICE_TYPE_VAAPI = define(3)
    val AV_HWDEVICE_TYPE_DXVA2 = define(4)
    val AV_HWDEVICE_TYPE_QSV = define(5)
    val AV_HWDEVICE_TYPE_VIDEOTOOLBOX = define(6)
    val AV_HWDEVICE_TYPE_D3D11VA = define(7)
    val AV_HWDEVICE_TYPE_DRM = define(8)
    val AV_HWDEVICE_TYPE_OPENCL = define(9)
    val AV_HWDEVICE_TYPE_MEDIACODEC = define(10)
    val AV_HWDEVICE_TYPE_VULKAN = define(11)
    val AV_HWDEVICE_TYPE_D3D12VA = define(12)
    def getName(value: AVHWDeviceType): Option[String] =
      value match
        case `AV_HWDEVICE_TYPE_NONE`         => Some("AV_HWDEVICE_TYPE_NONE")
        case `AV_HWDEVICE_TYPE_VDPAU`        => Some("AV_HWDEVICE_TYPE_VDPAU")
        case `AV_HWDEVICE_TYPE_CUDA`         => Some("AV_HWDEVICE_TYPE_CUDA")
        case `AV_HWDEVICE_TYPE_VAAPI`        => Some("AV_HWDEVICE_TYPE_VAAPI")
        case `AV_HWDEVICE_TYPE_DXVA2`        => Some("AV_HWDEVICE_TYPE_DXVA2")
        case `AV_HWDEVICE_TYPE_QSV`          => Some("AV_HWDEVICE_TYPE_QSV")
        case `AV_HWDEVICE_TYPE_VIDEOTOOLBOX` =>
          Some("AV_HWDEVICE_TYPE_VIDEOTOOLBOX")
        case `AV_HWDEVICE_TYPE_D3D11VA`    => Some("AV_HWDEVICE_TYPE_D3D11VA")
        case `AV_HWDEVICE_TYPE_DRM`        => Some("AV_HWDEVICE_TYPE_DRM")
        case `AV_HWDEVICE_TYPE_OPENCL`     => Some("AV_HWDEVICE_TYPE_OPENCL")
        case `AV_HWDEVICE_TYPE_MEDIACODEC` =>
          Some("AV_HWDEVICE_TYPE_MEDIACODEC")
        case `AV_HWDEVICE_TYPE_VULKAN`  => Some("AV_HWDEVICE_TYPE_VULKAN")
        case `AV_HWDEVICE_TYPE_D3D12VA` => Some("AV_HWDEVICE_TYPE_D3D12VA")
        case _                          => _root_.scala.None
    extension (a: AVHWDeviceType)
      inline def &(b: AVHWDeviceType): AVHWDeviceType = a & b
      inline def |(b: AVHWDeviceType): AVHWDeviceType = a | b
      inline def is(b: AVHWDeviceType): Boolean = (a & b) == b
  end AVHWDeviceType

  opaque type AVHWFrameTransferDirection = CUnsignedInt
  object AVHWFrameTransferDirection
      extends _BindgenEnumCUnsignedInt[AVHWFrameTransferDirection]:
    given _tag: Tag[AVHWFrameTransferDirection] = Tag.UInt
    inline def define(inline a: Long): AVHWFrameTransferDirection = a.toUInt
    val AV_HWFRAME_TRANSFER_DIRECTION_FROM = define(0)
    val AV_HWFRAME_TRANSFER_DIRECTION_TO = define(1)
    def getName(value: AVHWFrameTransferDirection): Option[String] =
      value match
        case `AV_HWFRAME_TRANSFER_DIRECTION_FROM` =>
          Some("AV_HWFRAME_TRANSFER_DIRECTION_FROM")
        case `AV_HWFRAME_TRANSFER_DIRECTION_TO` =>
          Some("AV_HWFRAME_TRANSFER_DIRECTION_TO")
        case _ => _root_.scala.None
    extension (a: AVHWFrameTransferDirection)
      inline def &(b: AVHWFrameTransferDirection): AVHWFrameTransferDirection =
        a & b
      inline def |(b: AVHWFrameTransferDirection): AVHWFrameTransferDirection =
        a | b
      inline def is(b: AVHWFrameTransferDirection): Boolean = (a & b) == b
  end AVHWFrameTransferDirection

  /** Different data types that can be returned via the AVIO write_data_type
    * callback.
    */
  opaque type AVIODataMarkerType = CUnsignedInt
  object AVIODataMarkerType
      extends _BindgenEnumCUnsignedInt[AVIODataMarkerType]:
    given _tag: Tag[AVIODataMarkerType] = Tag.UInt
    inline def define(inline a: Long): AVIODataMarkerType = a.toUInt
    val AVIO_DATA_MARKER_HEADER = define(0)
    val AVIO_DATA_MARKER_SYNC_POINT = define(1)
    val AVIO_DATA_MARKER_BOUNDARY_POINT = define(2)
    val AVIO_DATA_MARKER_UNKNOWN = define(3)
    val AVIO_DATA_MARKER_TRAILER = define(4)
    val AVIO_DATA_MARKER_FLUSH_POINT = define(5)
    def getName(value: AVIODataMarkerType): Option[String] =
      value match
        case `AVIO_DATA_MARKER_HEADER`     => Some("AVIO_DATA_MARKER_HEADER")
        case `AVIO_DATA_MARKER_SYNC_POINT` =>
          Some("AVIO_DATA_MARKER_SYNC_POINT")
        case `AVIO_DATA_MARKER_BOUNDARY_POINT` =>
          Some("AVIO_DATA_MARKER_BOUNDARY_POINT")
        case `AVIO_DATA_MARKER_UNKNOWN`     => Some("AVIO_DATA_MARKER_UNKNOWN")
        case `AVIO_DATA_MARKER_TRAILER`     => Some("AVIO_DATA_MARKER_TRAILER")
        case `AVIO_DATA_MARKER_FLUSH_POINT` =>
          Some("AVIO_DATA_MARKER_FLUSH_POINT")
        case _ => _root_.scala.None
    extension (a: AVIODataMarkerType)
      inline def &(b: AVIODataMarkerType): AVIODataMarkerType = a & b
      inline def |(b: AVIODataMarkerType): AVIODataMarkerType = a | b
      inline def is(b: AVIODataMarkerType): Boolean = (a & b) == b
  end AVIODataMarkerType

  /** Directory entry types.
    */
  opaque type AVIODirEntryType = CUnsignedInt
  object AVIODirEntryType extends _BindgenEnumCUnsignedInt[AVIODirEntryType]:
    given _tag: Tag[AVIODirEntryType] = Tag.UInt
    inline def define(inline a: Long): AVIODirEntryType = a.toUInt
    val AVIO_ENTRY_UNKNOWN = define(0)
    val AVIO_ENTRY_BLOCK_DEVICE = define(1)
    val AVIO_ENTRY_CHARACTER_DEVICE = define(2)
    val AVIO_ENTRY_DIRECTORY = define(3)
    val AVIO_ENTRY_NAMED_PIPE = define(4)
    val AVIO_ENTRY_SYMBOLIC_LINK = define(5)
    val AVIO_ENTRY_SOCKET = define(6)
    val AVIO_ENTRY_FILE = define(7)
    val AVIO_ENTRY_SERVER = define(8)
    val AVIO_ENTRY_SHARE = define(9)
    val AVIO_ENTRY_WORKGROUP = define(10)
    def getName(value: AVIODirEntryType): Option[String] =
      value match
        case `AVIO_ENTRY_UNKNOWN`          => Some("AVIO_ENTRY_UNKNOWN")
        case `AVIO_ENTRY_BLOCK_DEVICE`     => Some("AVIO_ENTRY_BLOCK_DEVICE")
        case `AVIO_ENTRY_CHARACTER_DEVICE` =>
          Some("AVIO_ENTRY_CHARACTER_DEVICE")
        case `AVIO_ENTRY_DIRECTORY`     => Some("AVIO_ENTRY_DIRECTORY")
        case `AVIO_ENTRY_NAMED_PIPE`    => Some("AVIO_ENTRY_NAMED_PIPE")
        case `AVIO_ENTRY_SYMBOLIC_LINK` => Some("AVIO_ENTRY_SYMBOLIC_LINK")
        case `AVIO_ENTRY_SOCKET`        => Some("AVIO_ENTRY_SOCKET")
        case `AVIO_ENTRY_FILE`          => Some("AVIO_ENTRY_FILE")
        case `AVIO_ENTRY_SERVER`        => Some("AVIO_ENTRY_SERVER")
        case `AVIO_ENTRY_SHARE`         => Some("AVIO_ENTRY_SHARE")
        case `AVIO_ENTRY_WORKGROUP`     => Some("AVIO_ENTRY_WORKGROUP")
        case _                          => _root_.scala.None
    extension (a: AVIODirEntryType)
      inline def &(b: AVIODirEntryType): AVIODirEntryType = a & b
      inline def |(b: AVIODirEntryType): AVIODirEntryType = a | b
      inline def is(b: AVIODirEntryType): Boolean = (a & b) == b
  end AVIODirEntryType

  opaque type AVMatrixEncoding = CUnsignedInt
  object AVMatrixEncoding extends _BindgenEnumCUnsignedInt[AVMatrixEncoding]:
    given _tag: Tag[AVMatrixEncoding] = Tag.UInt
    inline def define(inline a: Long): AVMatrixEncoding = a.toUInt
    val AV_MATRIX_ENCODING_NONE = define(0)
    val AV_MATRIX_ENCODING_DOLBY = define(1)
    val AV_MATRIX_ENCODING_DPLII = define(2)
    val AV_MATRIX_ENCODING_DPLIIX = define(3)
    val AV_MATRIX_ENCODING_DPLIIZ = define(4)
    val AV_MATRIX_ENCODING_DOLBYEX = define(5)
    val AV_MATRIX_ENCODING_DOLBYHEADPHONE = define(6)
    val AV_MATRIX_ENCODING_NB = define(7)
    def getName(value: AVMatrixEncoding): Option[String] =
      value match
        case `AV_MATRIX_ENCODING_NONE`    => Some("AV_MATRIX_ENCODING_NONE")
        case `AV_MATRIX_ENCODING_DOLBY`   => Some("AV_MATRIX_ENCODING_DOLBY")
        case `AV_MATRIX_ENCODING_DPLII`   => Some("AV_MATRIX_ENCODING_DPLII")
        case `AV_MATRIX_ENCODING_DPLIIX`  => Some("AV_MATRIX_ENCODING_DPLIIX")
        case `AV_MATRIX_ENCODING_DPLIIZ`  => Some("AV_MATRIX_ENCODING_DPLIIZ")
        case `AV_MATRIX_ENCODING_DOLBYEX` => Some("AV_MATRIX_ENCODING_DOLBYEX")
        case `AV_MATRIX_ENCODING_DOLBYHEADPHONE` =>
          Some("AV_MATRIX_ENCODING_DOLBYHEADPHONE")
        case `AV_MATRIX_ENCODING_NB` => Some("AV_MATRIX_ENCODING_NB")
        case _                       => _root_.scala.None
    extension (a: AVMatrixEncoding)
      inline def &(b: AVMatrixEncoding): AVMatrixEncoding = a & b
      inline def |(b: AVMatrixEncoding): AVMatrixEncoding = a | b
      inline def is(b: AVMatrixEncoding): Boolean = (a & b) == b
  end AVMatrixEncoding

  /** Media Type
    */
  opaque type AVMediaType = CInt
  object AVMediaType extends _BindgenEnumCInt[AVMediaType]:
    given _tag: Tag[AVMediaType] = Tag.Int
    inline def define(inline a: CInt): AVMediaType = a
    val AVMEDIA_TYPE_UNKNOWN = define(-1)
    val AVMEDIA_TYPE_VIDEO = define(0)
    val AVMEDIA_TYPE_AUDIO = define(1)
    val AVMEDIA_TYPE_DATA = define(2)
    val AVMEDIA_TYPE_SUBTITLE = define(3)
    val AVMEDIA_TYPE_ATTACHMENT = define(4)
    val AVMEDIA_TYPE_NB = define(5)
    def getName(value: AVMediaType): Option[String] =
      value match
        case `AVMEDIA_TYPE_UNKNOWN`    => Some("AVMEDIA_TYPE_UNKNOWN")
        case `AVMEDIA_TYPE_VIDEO`      => Some("AVMEDIA_TYPE_VIDEO")
        case `AVMEDIA_TYPE_AUDIO`      => Some("AVMEDIA_TYPE_AUDIO")
        case `AVMEDIA_TYPE_DATA`       => Some("AVMEDIA_TYPE_DATA")
        case `AVMEDIA_TYPE_SUBTITLE`   => Some("AVMEDIA_TYPE_SUBTITLE")
        case `AVMEDIA_TYPE_ATTACHMENT` => Some("AVMEDIA_TYPE_ATTACHMENT")
        case `AVMEDIA_TYPE_NB`         => Some("AVMEDIA_TYPE_NB")
        case _                         => _root_.scala.None
    extension (a: AVMediaType)
      inline def &(b: AVMediaType): AVMediaType = a & b
      inline def |(b: AVMediaType): AVMediaType = a | b
      inline def is(b: AVMediaType): Boolean = (a & b) == b
  end AVMediaType

  /** Types and functions for working with AVPacketSideData. @{
    */
  opaque type AVPacketSideDataType = CUnsignedInt
  object AVPacketSideDataType
      extends _BindgenEnumCUnsignedInt[AVPacketSideDataType]:
    given _tag: Tag[AVPacketSideDataType] = Tag.UInt
    inline def define(inline a: Long): AVPacketSideDataType = a.toUInt
    val AV_PKT_DATA_PALETTE = define(0)
    val AV_PKT_DATA_NEW_EXTRADATA = define(1)
    val AV_PKT_DATA_PARAM_CHANGE = define(2)
    val AV_PKT_DATA_H263_MB_INFO = define(3)
    val AV_PKT_DATA_REPLAYGAIN = define(4)
    val AV_PKT_DATA_DISPLAYMATRIX = define(5)
    val AV_PKT_DATA_STEREO3D = define(6)
    val AV_PKT_DATA_AUDIO_SERVICE_TYPE = define(7)
    val AV_PKT_DATA_QUALITY_STATS = define(8)
    val AV_PKT_DATA_FALLBACK_TRACK = define(9)
    val AV_PKT_DATA_CPB_PROPERTIES = define(10)
    val AV_PKT_DATA_SKIP_SAMPLES = define(11)
    val AV_PKT_DATA_JP_DUALMONO = define(12)
    val AV_PKT_DATA_STRINGS_METADATA = define(13)
    val AV_PKT_DATA_SUBTITLE_POSITION = define(14)
    val AV_PKT_DATA_MATROSKA_BLOCKADDITIONAL = define(15)
    val AV_PKT_DATA_WEBVTT_IDENTIFIER = define(16)
    val AV_PKT_DATA_WEBVTT_SETTINGS = define(17)
    val AV_PKT_DATA_METADATA_UPDATE = define(18)
    val AV_PKT_DATA_MPEGTS_STREAM_ID = define(19)
    val AV_PKT_DATA_MASTERING_DISPLAY_METADATA = define(20)
    val AV_PKT_DATA_SPHERICAL = define(21)
    val AV_PKT_DATA_CONTENT_LIGHT_LEVEL = define(22)
    val AV_PKT_DATA_A53_CC = define(23)
    val AV_PKT_DATA_ENCRYPTION_INIT_INFO = define(24)
    val AV_PKT_DATA_ENCRYPTION_INFO = define(25)
    val AV_PKT_DATA_AFD = define(26)
    val AV_PKT_DATA_PRFT = define(27)
    val AV_PKT_DATA_ICC_PROFILE = define(28)
    val AV_PKT_DATA_DOVI_CONF = define(29)
    val AV_PKT_DATA_S12M_TIMECODE = define(30)
    val AV_PKT_DATA_DYNAMIC_HDR10_PLUS = define(31)
    val AV_PKT_DATA_IAMF_MIX_GAIN_PARAM = define(32)
    val AV_PKT_DATA_IAMF_DEMIXING_INFO_PARAM = define(33)
    val AV_PKT_DATA_IAMF_RECON_GAIN_INFO_PARAM = define(34)
    val AV_PKT_DATA_AMBIENT_VIEWING_ENVIRONMENT = define(35)
    val AV_PKT_DATA_FRAME_CROPPING = define(36)
    val AV_PKT_DATA_LCEVC = define(37)
    val AV_PKT_DATA_NB = define(38)
    def getName(value: AVPacketSideDataType): Option[String] =
      value match
        case `AV_PKT_DATA_PALETTE`       => Some("AV_PKT_DATA_PALETTE")
        case `AV_PKT_DATA_NEW_EXTRADATA` => Some("AV_PKT_DATA_NEW_EXTRADATA")
        case `AV_PKT_DATA_PARAM_CHANGE`  => Some("AV_PKT_DATA_PARAM_CHANGE")
        case `AV_PKT_DATA_H263_MB_INFO`  => Some("AV_PKT_DATA_H263_MB_INFO")
        case `AV_PKT_DATA_REPLAYGAIN`    => Some("AV_PKT_DATA_REPLAYGAIN")
        case `AV_PKT_DATA_DISPLAYMATRIX` => Some("AV_PKT_DATA_DISPLAYMATRIX")
        case `AV_PKT_DATA_STEREO3D`      => Some("AV_PKT_DATA_STEREO3D")
        case `AV_PKT_DATA_AUDIO_SERVICE_TYPE` =>
          Some("AV_PKT_DATA_AUDIO_SERVICE_TYPE")
        case `AV_PKT_DATA_QUALITY_STATS`  => Some("AV_PKT_DATA_QUALITY_STATS")
        case `AV_PKT_DATA_FALLBACK_TRACK` => Some("AV_PKT_DATA_FALLBACK_TRACK")
        case `AV_PKT_DATA_CPB_PROPERTIES` => Some("AV_PKT_DATA_CPB_PROPERTIES")
        case `AV_PKT_DATA_SKIP_SAMPLES`   => Some("AV_PKT_DATA_SKIP_SAMPLES")
        case `AV_PKT_DATA_JP_DUALMONO`    => Some("AV_PKT_DATA_JP_DUALMONO")
        case `AV_PKT_DATA_STRINGS_METADATA` =>
          Some("AV_PKT_DATA_STRINGS_METADATA")
        case `AV_PKT_DATA_SUBTITLE_POSITION` =>
          Some("AV_PKT_DATA_SUBTITLE_POSITION")
        case `AV_PKT_DATA_MATROSKA_BLOCKADDITIONAL` =>
          Some("AV_PKT_DATA_MATROSKA_BLOCKADDITIONAL")
        case `AV_PKT_DATA_WEBVTT_IDENTIFIER` =>
          Some("AV_PKT_DATA_WEBVTT_IDENTIFIER")
        case `AV_PKT_DATA_WEBVTT_SETTINGS` =>
          Some("AV_PKT_DATA_WEBVTT_SETTINGS")
        case `AV_PKT_DATA_METADATA_UPDATE` =>
          Some("AV_PKT_DATA_METADATA_UPDATE")
        case `AV_PKT_DATA_MPEGTS_STREAM_ID` =>
          Some("AV_PKT_DATA_MPEGTS_STREAM_ID")
        case `AV_PKT_DATA_MASTERING_DISPLAY_METADATA` =>
          Some("AV_PKT_DATA_MASTERING_DISPLAY_METADATA")
        case `AV_PKT_DATA_SPHERICAL`           => Some("AV_PKT_DATA_SPHERICAL")
        case `AV_PKT_DATA_CONTENT_LIGHT_LEVEL` =>
          Some("AV_PKT_DATA_CONTENT_LIGHT_LEVEL")
        case `AV_PKT_DATA_A53_CC`               => Some("AV_PKT_DATA_A53_CC")
        case `AV_PKT_DATA_ENCRYPTION_INIT_INFO` =>
          Some("AV_PKT_DATA_ENCRYPTION_INIT_INFO")
        case `AV_PKT_DATA_ENCRYPTION_INFO` =>
          Some("AV_PKT_DATA_ENCRYPTION_INFO")
        case `AV_PKT_DATA_AFD`           => Some("AV_PKT_DATA_AFD")
        case `AV_PKT_DATA_PRFT`          => Some("AV_PKT_DATA_PRFT")
        case `AV_PKT_DATA_ICC_PROFILE`   => Some("AV_PKT_DATA_ICC_PROFILE")
        case `AV_PKT_DATA_DOVI_CONF`     => Some("AV_PKT_DATA_DOVI_CONF")
        case `AV_PKT_DATA_S12M_TIMECODE` => Some("AV_PKT_DATA_S12M_TIMECODE")
        case `AV_PKT_DATA_DYNAMIC_HDR10_PLUS` =>
          Some("AV_PKT_DATA_DYNAMIC_HDR10_PLUS")
        case `AV_PKT_DATA_IAMF_MIX_GAIN_PARAM` =>
          Some("AV_PKT_DATA_IAMF_MIX_GAIN_PARAM")
        case `AV_PKT_DATA_IAMF_DEMIXING_INFO_PARAM` =>
          Some("AV_PKT_DATA_IAMF_DEMIXING_INFO_PARAM")
        case `AV_PKT_DATA_IAMF_RECON_GAIN_INFO_PARAM` =>
          Some("AV_PKT_DATA_IAMF_RECON_GAIN_INFO_PARAM")
        case `AV_PKT_DATA_AMBIENT_VIEWING_ENVIRONMENT` =>
          Some("AV_PKT_DATA_AMBIENT_VIEWING_ENVIRONMENT")
        case `AV_PKT_DATA_FRAME_CROPPING` => Some("AV_PKT_DATA_FRAME_CROPPING")
        case `AV_PKT_DATA_LCEVC`          => Some("AV_PKT_DATA_LCEVC")
        case `AV_PKT_DATA_NB`             => Some("AV_PKT_DATA_NB")
        case _                            => _root_.scala.None
    extension (a: AVPacketSideDataType)
      inline def &(b: AVPacketSideDataType): AVPacketSideDataType = a & b
      inline def |(b: AVPacketSideDataType): AVPacketSideDataType = a | b
      inline def is(b: AVPacketSideDataType): Boolean = (a & b) == b
  end AVPacketSideDataType

  /** @{
    */
  opaque type AVPictureStructure = CUnsignedInt
  object AVPictureStructure
      extends _BindgenEnumCUnsignedInt[AVPictureStructure]:
    given _tag: Tag[AVPictureStructure] = Tag.UInt
    inline def define(inline a: Long): AVPictureStructure = a.toUInt
    val AV_PICTURE_STRUCTURE_UNKNOWN = define(0)
    val AV_PICTURE_STRUCTURE_TOP_FIELD = define(1)
    val AV_PICTURE_STRUCTURE_BOTTOM_FIELD = define(2)
    val AV_PICTURE_STRUCTURE_FRAME = define(3)
    def getName(value: AVPictureStructure): Option[String] =
      value match
        case `AV_PICTURE_STRUCTURE_UNKNOWN` =>
          Some("AV_PICTURE_STRUCTURE_UNKNOWN")
        case `AV_PICTURE_STRUCTURE_TOP_FIELD` =>
          Some("AV_PICTURE_STRUCTURE_TOP_FIELD")
        case `AV_PICTURE_STRUCTURE_BOTTOM_FIELD` =>
          Some("AV_PICTURE_STRUCTURE_BOTTOM_FIELD")
        case `AV_PICTURE_STRUCTURE_FRAME` => Some("AV_PICTURE_STRUCTURE_FRAME")
        case _                            => _root_.scala.None
    extension (a: AVPictureStructure)
      inline def &(b: AVPictureStructure): AVPictureStructure = a & b
      inline def |(b: AVPictureStructure): AVPictureStructure = a | b
      inline def is(b: AVPictureStructure): Boolean = (a & b) == b
  end AVPictureStructure

  /** @} @}
    */
  opaque type AVPictureType = CUnsignedInt
  object AVPictureType extends _BindgenEnumCUnsignedInt[AVPictureType]:
    given _tag: Tag[AVPictureType] = Tag.UInt
    inline def define(inline a: Long): AVPictureType = a.toUInt
    val AV_PICTURE_TYPE_NONE = define(0)
    val AV_PICTURE_TYPE_I = define(1)
    val AV_PICTURE_TYPE_P = define(2)
    val AV_PICTURE_TYPE_B = define(3)
    val AV_PICTURE_TYPE_S = define(4)
    val AV_PICTURE_TYPE_SI = define(5)
    val AV_PICTURE_TYPE_SP = define(6)
    val AV_PICTURE_TYPE_BI = define(7)
    def getName(value: AVPictureType): Option[String] =
      value match
        case `AV_PICTURE_TYPE_NONE` => Some("AV_PICTURE_TYPE_NONE")
        case `AV_PICTURE_TYPE_I`    => Some("AV_PICTURE_TYPE_I")
        case `AV_PICTURE_TYPE_P`    => Some("AV_PICTURE_TYPE_P")
        case `AV_PICTURE_TYPE_B`    => Some("AV_PICTURE_TYPE_B")
        case `AV_PICTURE_TYPE_S`    => Some("AV_PICTURE_TYPE_S")
        case `AV_PICTURE_TYPE_SI`   => Some("AV_PICTURE_TYPE_SI")
        case `AV_PICTURE_TYPE_SP`   => Some("AV_PICTURE_TYPE_SP")
        case `AV_PICTURE_TYPE_BI`   => Some("AV_PICTURE_TYPE_BI")
        case _                      => _root_.scala.None
    extension (a: AVPictureType)
      inline def &(b: AVPictureType): AVPictureType = a & b
      inline def |(b: AVPictureType): AVPictureType = a | b
      inline def is(b: AVPictureType): Boolean = (a & b) == b
  end AVPictureType

  /** Pixel format.
    */
  opaque type AVPixelFormat = CInt
  object AVPixelFormat extends _BindgenEnumCInt[AVPixelFormat]:
    given _tag: Tag[AVPixelFormat] = Tag.Int
    inline def define(inline a: CInt): AVPixelFormat = a
    val AV_PIX_FMT_NONE = define(-1)
    val AV_PIX_FMT_YUV420P = define(0)
    val AV_PIX_FMT_YUYV422 = define(1)
    val AV_PIX_FMT_RGB24 = define(2)
    val AV_PIX_FMT_BGR24 = define(3)
    val AV_PIX_FMT_YUV422P = define(4)
    val AV_PIX_FMT_YUV444P = define(5)
    val AV_PIX_FMT_YUV410P = define(6)
    val AV_PIX_FMT_YUV411P = define(7)
    val AV_PIX_FMT_GRAY8 = define(8)
    val AV_PIX_FMT_MONOWHITE = define(9)
    val AV_PIX_FMT_MONOBLACK = define(10)
    val AV_PIX_FMT_PAL8 = define(11)
    val AV_PIX_FMT_YUVJ420P = define(12)
    val AV_PIX_FMT_YUVJ422P = define(13)
    val AV_PIX_FMT_YUVJ444P = define(14)
    val AV_PIX_FMT_UYVY422 = define(15)
    val AV_PIX_FMT_UYYVYY411 = define(16)
    val AV_PIX_FMT_BGR8 = define(17)
    val AV_PIX_FMT_BGR4 = define(18)
    val AV_PIX_FMT_BGR4_BYTE = define(19)
    val AV_PIX_FMT_RGB8 = define(20)
    val AV_PIX_FMT_RGB4 = define(21)
    val AV_PIX_FMT_RGB4_BYTE = define(22)
    val AV_PIX_FMT_NV12 = define(23)
    val AV_PIX_FMT_NV21 = define(24)
    val AV_PIX_FMT_ARGB = define(25)
    val AV_PIX_FMT_RGBA = define(26)
    val AV_PIX_FMT_ABGR = define(27)
    val AV_PIX_FMT_BGRA = define(28)
    val AV_PIX_FMT_GRAY16BE = define(29)
    val AV_PIX_FMT_GRAY16LE = define(30)
    val AV_PIX_FMT_YUV440P = define(31)
    val AV_PIX_FMT_YUVJ440P = define(32)
    val AV_PIX_FMT_YUVA420P = define(33)
    val AV_PIX_FMT_RGB48BE = define(34)
    val AV_PIX_FMT_RGB48LE = define(35)
    val AV_PIX_FMT_RGB565BE = define(36)
    val AV_PIX_FMT_RGB565LE = define(37)
    val AV_PIX_FMT_RGB555BE = define(38)
    val AV_PIX_FMT_RGB555LE = define(39)
    val AV_PIX_FMT_BGR565BE = define(40)
    val AV_PIX_FMT_BGR565LE = define(41)
    val AV_PIX_FMT_BGR555BE = define(42)
    val AV_PIX_FMT_BGR555LE = define(43)
    val AV_PIX_FMT_VAAPI = define(44)
    val AV_PIX_FMT_YUV420P16LE = define(45)
    val AV_PIX_FMT_YUV420P16BE = define(46)
    val AV_PIX_FMT_YUV422P16LE = define(47)
    val AV_PIX_FMT_YUV422P16BE = define(48)
    val AV_PIX_FMT_YUV444P16LE = define(49)
    val AV_PIX_FMT_YUV444P16BE = define(50)
    val AV_PIX_FMT_DXVA2_VLD = define(51)
    val AV_PIX_FMT_RGB444LE = define(52)
    val AV_PIX_FMT_RGB444BE = define(53)
    val AV_PIX_FMT_BGR444LE = define(54)
    val AV_PIX_FMT_BGR444BE = define(55)
    val AV_PIX_FMT_YA8 = define(56)
    val AV_PIX_FMT_Y400A = define(56)
    val AV_PIX_FMT_GRAY8A = define(56)
    val AV_PIX_FMT_BGR48BE = define(57)
    val AV_PIX_FMT_BGR48LE = define(58)
    val AV_PIX_FMT_YUV420P9BE = define(59)
    val AV_PIX_FMT_YUV420P9LE = define(60)
    val AV_PIX_FMT_YUV420P10BE = define(61)
    val AV_PIX_FMT_YUV420P10LE = define(62)
    val AV_PIX_FMT_YUV422P10BE = define(63)
    val AV_PIX_FMT_YUV422P10LE = define(64)
    val AV_PIX_FMT_YUV444P9BE = define(65)
    val AV_PIX_FMT_YUV444P9LE = define(66)
    val AV_PIX_FMT_YUV444P10BE = define(67)
    val AV_PIX_FMT_YUV444P10LE = define(68)
    val AV_PIX_FMT_YUV422P9BE = define(69)
    val AV_PIX_FMT_YUV422P9LE = define(70)
    val AV_PIX_FMT_GBRP = define(71)
    val AV_PIX_FMT_GBR24P = define(71)
    val AV_PIX_FMT_GBRP9BE = define(72)
    val AV_PIX_FMT_GBRP9LE = define(73)
    val AV_PIX_FMT_GBRP10BE = define(74)
    val AV_PIX_FMT_GBRP10LE = define(75)
    val AV_PIX_FMT_GBRP16BE = define(76)
    val AV_PIX_FMT_GBRP16LE = define(77)
    val AV_PIX_FMT_YUVA422P = define(78)
    val AV_PIX_FMT_YUVA444P = define(79)
    val AV_PIX_FMT_YUVA420P9BE = define(80)
    val AV_PIX_FMT_YUVA420P9LE = define(81)
    val AV_PIX_FMT_YUVA422P9BE = define(82)
    val AV_PIX_FMT_YUVA422P9LE = define(83)
    val AV_PIX_FMT_YUVA444P9BE = define(84)
    val AV_PIX_FMT_YUVA444P9LE = define(85)
    val AV_PIX_FMT_YUVA420P10BE = define(86)
    val AV_PIX_FMT_YUVA420P10LE = define(87)
    val AV_PIX_FMT_YUVA422P10BE = define(88)
    val AV_PIX_FMT_YUVA422P10LE = define(89)
    val AV_PIX_FMT_YUVA444P10BE = define(90)
    val AV_PIX_FMT_YUVA444P10LE = define(91)
    val AV_PIX_FMT_YUVA420P16BE = define(92)
    val AV_PIX_FMT_YUVA420P16LE = define(93)
    val AV_PIX_FMT_YUVA422P16BE = define(94)
    val AV_PIX_FMT_YUVA422P16LE = define(95)
    val AV_PIX_FMT_YUVA444P16BE = define(96)
    val AV_PIX_FMT_YUVA444P16LE = define(97)
    val AV_PIX_FMT_VDPAU = define(98)
    val AV_PIX_FMT_XYZ12LE = define(99)
    val AV_PIX_FMT_XYZ12BE = define(100)
    val AV_PIX_FMT_NV16 = define(101)
    val AV_PIX_FMT_NV20LE = define(102)
    val AV_PIX_FMT_NV20BE = define(103)
    val AV_PIX_FMT_RGBA64BE = define(104)
    val AV_PIX_FMT_RGBA64LE = define(105)
    val AV_PIX_FMT_BGRA64BE = define(106)
    val AV_PIX_FMT_BGRA64LE = define(107)
    val AV_PIX_FMT_YVYU422 = define(108)
    val AV_PIX_FMT_YA16BE = define(109)
    val AV_PIX_FMT_YA16LE = define(110)
    val AV_PIX_FMT_GBRAP = define(111)
    val AV_PIX_FMT_GBRAP16BE = define(112)
    val AV_PIX_FMT_GBRAP16LE = define(113)
    val AV_PIX_FMT_QSV = define(114)
    val AV_PIX_FMT_MMAL = define(115)
    val AV_PIX_FMT_D3D11VA_VLD = define(116)
    val AV_PIX_FMT_CUDA = define(117)
    val AV_PIX_FMT_0RGB = define(118)
    val AV_PIX_FMT_RGB0 = define(119)
    val AV_PIX_FMT_0BGR = define(120)
    val AV_PIX_FMT_BGR0 = define(121)
    val AV_PIX_FMT_YUV420P12BE = define(122)
    val AV_PIX_FMT_YUV420P12LE = define(123)
    val AV_PIX_FMT_YUV420P14BE = define(124)
    val AV_PIX_FMT_YUV420P14LE = define(125)
    val AV_PIX_FMT_YUV422P12BE = define(126)
    val AV_PIX_FMT_YUV422P12LE = define(127)
    val AV_PIX_FMT_YUV422P14BE = define(128)
    val AV_PIX_FMT_YUV422P14LE = define(129)
    val AV_PIX_FMT_YUV444P12BE = define(130)
    val AV_PIX_FMT_YUV444P12LE = define(131)
    val AV_PIX_FMT_YUV444P14BE = define(132)
    val AV_PIX_FMT_YUV444P14LE = define(133)
    val AV_PIX_FMT_GBRP12BE = define(134)
    val AV_PIX_FMT_GBRP12LE = define(135)
    val AV_PIX_FMT_GBRP14BE = define(136)
    val AV_PIX_FMT_GBRP14LE = define(137)
    val AV_PIX_FMT_YUVJ411P = define(138)
    val AV_PIX_FMT_BAYER_BGGR8 = define(139)
    val AV_PIX_FMT_BAYER_RGGB8 = define(140)
    val AV_PIX_FMT_BAYER_GBRG8 = define(141)
    val AV_PIX_FMT_BAYER_GRBG8 = define(142)
    val AV_PIX_FMT_BAYER_BGGR16LE = define(143)
    val AV_PIX_FMT_BAYER_BGGR16BE = define(144)
    val AV_PIX_FMT_BAYER_RGGB16LE = define(145)
    val AV_PIX_FMT_BAYER_RGGB16BE = define(146)
    val AV_PIX_FMT_BAYER_GBRG16LE = define(147)
    val AV_PIX_FMT_BAYER_GBRG16BE = define(148)
    val AV_PIX_FMT_BAYER_GRBG16LE = define(149)
    val AV_PIX_FMT_BAYER_GRBG16BE = define(150)
    val AV_PIX_FMT_YUV440P10LE = define(151)
    val AV_PIX_FMT_YUV440P10BE = define(152)
    val AV_PIX_FMT_YUV440P12LE = define(153)
    val AV_PIX_FMT_YUV440P12BE = define(154)
    val AV_PIX_FMT_AYUV64LE = define(155)
    val AV_PIX_FMT_AYUV64BE = define(156)
    val AV_PIX_FMT_VIDEOTOOLBOX = define(157)
    val AV_PIX_FMT_P010LE = define(158)
    val AV_PIX_FMT_P010BE = define(159)
    val AV_PIX_FMT_GBRAP12BE = define(160)
    val AV_PIX_FMT_GBRAP12LE = define(161)
    val AV_PIX_FMT_GBRAP10BE = define(162)
    val AV_PIX_FMT_GBRAP10LE = define(163)
    val AV_PIX_FMT_MEDIACODEC = define(164)
    val AV_PIX_FMT_GRAY12BE = define(165)
    val AV_PIX_FMT_GRAY12LE = define(166)
    val AV_PIX_FMT_GRAY10BE = define(167)
    val AV_PIX_FMT_GRAY10LE = define(168)
    val AV_PIX_FMT_P016LE = define(169)
    val AV_PIX_FMT_P016BE = define(170)
    val AV_PIX_FMT_D3D11 = define(171)
    val AV_PIX_FMT_GRAY9BE = define(172)
    val AV_PIX_FMT_GRAY9LE = define(173)
    val AV_PIX_FMT_GBRPF32BE = define(174)
    val AV_PIX_FMT_GBRPF32LE = define(175)
    val AV_PIX_FMT_GBRAPF32BE = define(176)
    val AV_PIX_FMT_GBRAPF32LE = define(177)
    val AV_PIX_FMT_DRM_PRIME = define(178)
    val AV_PIX_FMT_OPENCL = define(179)
    val AV_PIX_FMT_GRAY14BE = define(180)
    val AV_PIX_FMT_GRAY14LE = define(181)
    val AV_PIX_FMT_GRAYF32BE = define(182)
    val AV_PIX_FMT_GRAYF32LE = define(183)
    val AV_PIX_FMT_YUVA422P12BE = define(184)
    val AV_PIX_FMT_YUVA422P12LE = define(185)
    val AV_PIX_FMT_YUVA444P12BE = define(186)
    val AV_PIX_FMT_YUVA444P12LE = define(187)
    val AV_PIX_FMT_NV24 = define(188)
    val AV_PIX_FMT_NV42 = define(189)
    val AV_PIX_FMT_VULKAN = define(190)
    val AV_PIX_FMT_Y210BE = define(191)
    val AV_PIX_FMT_Y210LE = define(192)
    val AV_PIX_FMT_X2RGB10LE = define(193)
    val AV_PIX_FMT_X2RGB10BE = define(194)
    val AV_PIX_FMT_X2BGR10LE = define(195)
    val AV_PIX_FMT_X2BGR10BE = define(196)
    val AV_PIX_FMT_P210BE = define(197)
    val AV_PIX_FMT_P210LE = define(198)
    val AV_PIX_FMT_P410BE = define(199)
    val AV_PIX_FMT_P410LE = define(200)
    val AV_PIX_FMT_P216BE = define(201)
    val AV_PIX_FMT_P216LE = define(202)
    val AV_PIX_FMT_P416BE = define(203)
    val AV_PIX_FMT_P416LE = define(204)
    val AV_PIX_FMT_VUYA = define(205)
    val AV_PIX_FMT_RGBAF16BE = define(206)
    val AV_PIX_FMT_RGBAF16LE = define(207)
    val AV_PIX_FMT_VUYX = define(208)
    val AV_PIX_FMT_P012LE = define(209)
    val AV_PIX_FMT_P012BE = define(210)
    val AV_PIX_FMT_Y212BE = define(211)
    val AV_PIX_FMT_Y212LE = define(212)
    val AV_PIX_FMT_XV30BE = define(213)
    val AV_PIX_FMT_XV30LE = define(214)
    val AV_PIX_FMT_XV36BE = define(215)
    val AV_PIX_FMT_XV36LE = define(216)
    val AV_PIX_FMT_RGBF32BE = define(217)
    val AV_PIX_FMT_RGBF32LE = define(218)
    val AV_PIX_FMT_RGBAF32BE = define(219)
    val AV_PIX_FMT_RGBAF32LE = define(220)
    val AV_PIX_FMT_P212BE = define(221)
    val AV_PIX_FMT_P212LE = define(222)
    val AV_PIX_FMT_P412BE = define(223)
    val AV_PIX_FMT_P412LE = define(224)
    val AV_PIX_FMT_GBRAP14BE = define(225)
    val AV_PIX_FMT_GBRAP14LE = define(226)
    val AV_PIX_FMT_D3D12 = define(227)
    val AV_PIX_FMT_NB = define(228)
    def getName(value: AVPixelFormat): Option[String] =
      value match
        case `AV_PIX_FMT_NONE`           => Some("AV_PIX_FMT_NONE")
        case `AV_PIX_FMT_YUV420P`        => Some("AV_PIX_FMT_YUV420P")
        case `AV_PIX_FMT_YUYV422`        => Some("AV_PIX_FMT_YUYV422")
        case `AV_PIX_FMT_RGB24`          => Some("AV_PIX_FMT_RGB24")
        case `AV_PIX_FMT_BGR24`          => Some("AV_PIX_FMT_BGR24")
        case `AV_PIX_FMT_YUV422P`        => Some("AV_PIX_FMT_YUV422P")
        case `AV_PIX_FMT_YUV444P`        => Some("AV_PIX_FMT_YUV444P")
        case `AV_PIX_FMT_YUV410P`        => Some("AV_PIX_FMT_YUV410P")
        case `AV_PIX_FMT_YUV411P`        => Some("AV_PIX_FMT_YUV411P")
        case `AV_PIX_FMT_GRAY8`          => Some("AV_PIX_FMT_GRAY8")
        case `AV_PIX_FMT_MONOWHITE`      => Some("AV_PIX_FMT_MONOWHITE")
        case `AV_PIX_FMT_MONOBLACK`      => Some("AV_PIX_FMT_MONOBLACK")
        case `AV_PIX_FMT_PAL8`           => Some("AV_PIX_FMT_PAL8")
        case `AV_PIX_FMT_YUVJ420P`       => Some("AV_PIX_FMT_YUVJ420P")
        case `AV_PIX_FMT_YUVJ422P`       => Some("AV_PIX_FMT_YUVJ422P")
        case `AV_PIX_FMT_YUVJ444P`       => Some("AV_PIX_FMT_YUVJ444P")
        case `AV_PIX_FMT_UYVY422`        => Some("AV_PIX_FMT_UYVY422")
        case `AV_PIX_FMT_UYYVYY411`      => Some("AV_PIX_FMT_UYYVYY411")
        case `AV_PIX_FMT_BGR8`           => Some("AV_PIX_FMT_BGR8")
        case `AV_PIX_FMT_BGR4`           => Some("AV_PIX_FMT_BGR4")
        case `AV_PIX_FMT_BGR4_BYTE`      => Some("AV_PIX_FMT_BGR4_BYTE")
        case `AV_PIX_FMT_RGB8`           => Some("AV_PIX_FMT_RGB8")
        case `AV_PIX_FMT_RGB4`           => Some("AV_PIX_FMT_RGB4")
        case `AV_PIX_FMT_RGB4_BYTE`      => Some("AV_PIX_FMT_RGB4_BYTE")
        case `AV_PIX_FMT_NV12`           => Some("AV_PIX_FMT_NV12")
        case `AV_PIX_FMT_NV21`           => Some("AV_PIX_FMT_NV21")
        case `AV_PIX_FMT_ARGB`           => Some("AV_PIX_FMT_ARGB")
        case `AV_PIX_FMT_RGBA`           => Some("AV_PIX_FMT_RGBA")
        case `AV_PIX_FMT_ABGR`           => Some("AV_PIX_FMT_ABGR")
        case `AV_PIX_FMT_BGRA`           => Some("AV_PIX_FMT_BGRA")
        case `AV_PIX_FMT_GRAY16BE`       => Some("AV_PIX_FMT_GRAY16BE")
        case `AV_PIX_FMT_GRAY16LE`       => Some("AV_PIX_FMT_GRAY16LE")
        case `AV_PIX_FMT_YUV440P`        => Some("AV_PIX_FMT_YUV440P")
        case `AV_PIX_FMT_YUVJ440P`       => Some("AV_PIX_FMT_YUVJ440P")
        case `AV_PIX_FMT_YUVA420P`       => Some("AV_PIX_FMT_YUVA420P")
        case `AV_PIX_FMT_RGB48BE`        => Some("AV_PIX_FMT_RGB48BE")
        case `AV_PIX_FMT_RGB48LE`        => Some("AV_PIX_FMT_RGB48LE")
        case `AV_PIX_FMT_RGB565BE`       => Some("AV_PIX_FMT_RGB565BE")
        case `AV_PIX_FMT_RGB565LE`       => Some("AV_PIX_FMT_RGB565LE")
        case `AV_PIX_FMT_RGB555BE`       => Some("AV_PIX_FMT_RGB555BE")
        case `AV_PIX_FMT_RGB555LE`       => Some("AV_PIX_FMT_RGB555LE")
        case `AV_PIX_FMT_BGR565BE`       => Some("AV_PIX_FMT_BGR565BE")
        case `AV_PIX_FMT_BGR565LE`       => Some("AV_PIX_FMT_BGR565LE")
        case `AV_PIX_FMT_BGR555BE`       => Some("AV_PIX_FMT_BGR555BE")
        case `AV_PIX_FMT_BGR555LE`       => Some("AV_PIX_FMT_BGR555LE")
        case `AV_PIX_FMT_VAAPI`          => Some("AV_PIX_FMT_VAAPI")
        case `AV_PIX_FMT_YUV420P16LE`    => Some("AV_PIX_FMT_YUV420P16LE")
        case `AV_PIX_FMT_YUV420P16BE`    => Some("AV_PIX_FMT_YUV420P16BE")
        case `AV_PIX_FMT_YUV422P16LE`    => Some("AV_PIX_FMT_YUV422P16LE")
        case `AV_PIX_FMT_YUV422P16BE`    => Some("AV_PIX_FMT_YUV422P16BE")
        case `AV_PIX_FMT_YUV444P16LE`    => Some("AV_PIX_FMT_YUV444P16LE")
        case `AV_PIX_FMT_YUV444P16BE`    => Some("AV_PIX_FMT_YUV444P16BE")
        case `AV_PIX_FMT_DXVA2_VLD`      => Some("AV_PIX_FMT_DXVA2_VLD")
        case `AV_PIX_FMT_RGB444LE`       => Some("AV_PIX_FMT_RGB444LE")
        case `AV_PIX_FMT_RGB444BE`       => Some("AV_PIX_FMT_RGB444BE")
        case `AV_PIX_FMT_BGR444LE`       => Some("AV_PIX_FMT_BGR444LE")
        case `AV_PIX_FMT_BGR444BE`       => Some("AV_PIX_FMT_BGR444BE")
        case `AV_PIX_FMT_YA8`            => Some("AV_PIX_FMT_YA8")
        case `AV_PIX_FMT_Y400A`          => Some("AV_PIX_FMT_Y400A")
        case `AV_PIX_FMT_GRAY8A`         => Some("AV_PIX_FMT_GRAY8A")
        case `AV_PIX_FMT_BGR48BE`        => Some("AV_PIX_FMT_BGR48BE")
        case `AV_PIX_FMT_BGR48LE`        => Some("AV_PIX_FMT_BGR48LE")
        case `AV_PIX_FMT_YUV420P9BE`     => Some("AV_PIX_FMT_YUV420P9BE")
        case `AV_PIX_FMT_YUV420P9LE`     => Some("AV_PIX_FMT_YUV420P9LE")
        case `AV_PIX_FMT_YUV420P10BE`    => Some("AV_PIX_FMT_YUV420P10BE")
        case `AV_PIX_FMT_YUV420P10LE`    => Some("AV_PIX_FMT_YUV420P10LE")
        case `AV_PIX_FMT_YUV422P10BE`    => Some("AV_PIX_FMT_YUV422P10BE")
        case `AV_PIX_FMT_YUV422P10LE`    => Some("AV_PIX_FMT_YUV422P10LE")
        case `AV_PIX_FMT_YUV444P9BE`     => Some("AV_PIX_FMT_YUV444P9BE")
        case `AV_PIX_FMT_YUV444P9LE`     => Some("AV_PIX_FMT_YUV444P9LE")
        case `AV_PIX_FMT_YUV444P10BE`    => Some("AV_PIX_FMT_YUV444P10BE")
        case `AV_PIX_FMT_YUV444P10LE`    => Some("AV_PIX_FMT_YUV444P10LE")
        case `AV_PIX_FMT_YUV422P9BE`     => Some("AV_PIX_FMT_YUV422P9BE")
        case `AV_PIX_FMT_YUV422P9LE`     => Some("AV_PIX_FMT_YUV422P9LE")
        case `AV_PIX_FMT_GBRP`           => Some("AV_PIX_FMT_GBRP")
        case `AV_PIX_FMT_GBR24P`         => Some("AV_PIX_FMT_GBR24P")
        case `AV_PIX_FMT_GBRP9BE`        => Some("AV_PIX_FMT_GBRP9BE")
        case `AV_PIX_FMT_GBRP9LE`        => Some("AV_PIX_FMT_GBRP9LE")
        case `AV_PIX_FMT_GBRP10BE`       => Some("AV_PIX_FMT_GBRP10BE")
        case `AV_PIX_FMT_GBRP10LE`       => Some("AV_PIX_FMT_GBRP10LE")
        case `AV_PIX_FMT_GBRP16BE`       => Some("AV_PIX_FMT_GBRP16BE")
        case `AV_PIX_FMT_GBRP16LE`       => Some("AV_PIX_FMT_GBRP16LE")
        case `AV_PIX_FMT_YUVA422P`       => Some("AV_PIX_FMT_YUVA422P")
        case `AV_PIX_FMT_YUVA444P`       => Some("AV_PIX_FMT_YUVA444P")
        case `AV_PIX_FMT_YUVA420P9BE`    => Some("AV_PIX_FMT_YUVA420P9BE")
        case `AV_PIX_FMT_YUVA420P9LE`    => Some("AV_PIX_FMT_YUVA420P9LE")
        case `AV_PIX_FMT_YUVA422P9BE`    => Some("AV_PIX_FMT_YUVA422P9BE")
        case `AV_PIX_FMT_YUVA422P9LE`    => Some("AV_PIX_FMT_YUVA422P9LE")
        case `AV_PIX_FMT_YUVA444P9BE`    => Some("AV_PIX_FMT_YUVA444P9BE")
        case `AV_PIX_FMT_YUVA444P9LE`    => Some("AV_PIX_FMT_YUVA444P9LE")
        case `AV_PIX_FMT_YUVA420P10BE`   => Some("AV_PIX_FMT_YUVA420P10BE")
        case `AV_PIX_FMT_YUVA420P10LE`   => Some("AV_PIX_FMT_YUVA420P10LE")
        case `AV_PIX_FMT_YUVA422P10BE`   => Some("AV_PIX_FMT_YUVA422P10BE")
        case `AV_PIX_FMT_YUVA422P10LE`   => Some("AV_PIX_FMT_YUVA422P10LE")
        case `AV_PIX_FMT_YUVA444P10BE`   => Some("AV_PIX_FMT_YUVA444P10BE")
        case `AV_PIX_FMT_YUVA444P10LE`   => Some("AV_PIX_FMT_YUVA444P10LE")
        case `AV_PIX_FMT_YUVA420P16BE`   => Some("AV_PIX_FMT_YUVA420P16BE")
        case `AV_PIX_FMT_YUVA420P16LE`   => Some("AV_PIX_FMT_YUVA420P16LE")
        case `AV_PIX_FMT_YUVA422P16BE`   => Some("AV_PIX_FMT_YUVA422P16BE")
        case `AV_PIX_FMT_YUVA422P16LE`   => Some("AV_PIX_FMT_YUVA422P16LE")
        case `AV_PIX_FMT_YUVA444P16BE`   => Some("AV_PIX_FMT_YUVA444P16BE")
        case `AV_PIX_FMT_YUVA444P16LE`   => Some("AV_PIX_FMT_YUVA444P16LE")
        case `AV_PIX_FMT_VDPAU`          => Some("AV_PIX_FMT_VDPAU")
        case `AV_PIX_FMT_XYZ12LE`        => Some("AV_PIX_FMT_XYZ12LE")
        case `AV_PIX_FMT_XYZ12BE`        => Some("AV_PIX_FMT_XYZ12BE")
        case `AV_PIX_FMT_NV16`           => Some("AV_PIX_FMT_NV16")
        case `AV_PIX_FMT_NV20LE`         => Some("AV_PIX_FMT_NV20LE")
        case `AV_PIX_FMT_NV20BE`         => Some("AV_PIX_FMT_NV20BE")
        case `AV_PIX_FMT_RGBA64BE`       => Some("AV_PIX_FMT_RGBA64BE")
        case `AV_PIX_FMT_RGBA64LE`       => Some("AV_PIX_FMT_RGBA64LE")
        case `AV_PIX_FMT_BGRA64BE`       => Some("AV_PIX_FMT_BGRA64BE")
        case `AV_PIX_FMT_BGRA64LE`       => Some("AV_PIX_FMT_BGRA64LE")
        case `AV_PIX_FMT_YVYU422`        => Some("AV_PIX_FMT_YVYU422")
        case `AV_PIX_FMT_YA16BE`         => Some("AV_PIX_FMT_YA16BE")
        case `AV_PIX_FMT_YA16LE`         => Some("AV_PIX_FMT_YA16LE")
        case `AV_PIX_FMT_GBRAP`          => Some("AV_PIX_FMT_GBRAP")
        case `AV_PIX_FMT_GBRAP16BE`      => Some("AV_PIX_FMT_GBRAP16BE")
        case `AV_PIX_FMT_GBRAP16LE`      => Some("AV_PIX_FMT_GBRAP16LE")
        case `AV_PIX_FMT_QSV`            => Some("AV_PIX_FMT_QSV")
        case `AV_PIX_FMT_MMAL`           => Some("AV_PIX_FMT_MMAL")
        case `AV_PIX_FMT_D3D11VA_VLD`    => Some("AV_PIX_FMT_D3D11VA_VLD")
        case `AV_PIX_FMT_CUDA`           => Some("AV_PIX_FMT_CUDA")
        case `AV_PIX_FMT_0RGB`           => Some("AV_PIX_FMT_0RGB")
        case `AV_PIX_FMT_RGB0`           => Some("AV_PIX_FMT_RGB0")
        case `AV_PIX_FMT_0BGR`           => Some("AV_PIX_FMT_0BGR")
        case `AV_PIX_FMT_BGR0`           => Some("AV_PIX_FMT_BGR0")
        case `AV_PIX_FMT_YUV420P12BE`    => Some("AV_PIX_FMT_YUV420P12BE")
        case `AV_PIX_FMT_YUV420P12LE`    => Some("AV_PIX_FMT_YUV420P12LE")
        case `AV_PIX_FMT_YUV420P14BE`    => Some("AV_PIX_FMT_YUV420P14BE")
        case `AV_PIX_FMT_YUV420P14LE`    => Some("AV_PIX_FMT_YUV420P14LE")
        case `AV_PIX_FMT_YUV422P12BE`    => Some("AV_PIX_FMT_YUV422P12BE")
        case `AV_PIX_FMT_YUV422P12LE`    => Some("AV_PIX_FMT_YUV422P12LE")
        case `AV_PIX_FMT_YUV422P14BE`    => Some("AV_PIX_FMT_YUV422P14BE")
        case `AV_PIX_FMT_YUV422P14LE`    => Some("AV_PIX_FMT_YUV422P14LE")
        case `AV_PIX_FMT_YUV444P12BE`    => Some("AV_PIX_FMT_YUV444P12BE")
        case `AV_PIX_FMT_YUV444P12LE`    => Some("AV_PIX_FMT_YUV444P12LE")
        case `AV_PIX_FMT_YUV444P14BE`    => Some("AV_PIX_FMT_YUV444P14BE")
        case `AV_PIX_FMT_YUV444P14LE`    => Some("AV_PIX_FMT_YUV444P14LE")
        case `AV_PIX_FMT_GBRP12BE`       => Some("AV_PIX_FMT_GBRP12BE")
        case `AV_PIX_FMT_GBRP12LE`       => Some("AV_PIX_FMT_GBRP12LE")
        case `AV_PIX_FMT_GBRP14BE`       => Some("AV_PIX_FMT_GBRP14BE")
        case `AV_PIX_FMT_GBRP14LE`       => Some("AV_PIX_FMT_GBRP14LE")
        case `AV_PIX_FMT_YUVJ411P`       => Some("AV_PIX_FMT_YUVJ411P")
        case `AV_PIX_FMT_BAYER_BGGR8`    => Some("AV_PIX_FMT_BAYER_BGGR8")
        case `AV_PIX_FMT_BAYER_RGGB8`    => Some("AV_PIX_FMT_BAYER_RGGB8")
        case `AV_PIX_FMT_BAYER_GBRG8`    => Some("AV_PIX_FMT_BAYER_GBRG8")
        case `AV_PIX_FMT_BAYER_GRBG8`    => Some("AV_PIX_FMT_BAYER_GRBG8")
        case `AV_PIX_FMT_BAYER_BGGR16LE` => Some("AV_PIX_FMT_BAYER_BGGR16LE")
        case `AV_PIX_FMT_BAYER_BGGR16BE` => Some("AV_PIX_FMT_BAYER_BGGR16BE")
        case `AV_PIX_FMT_BAYER_RGGB16LE` => Some("AV_PIX_FMT_BAYER_RGGB16LE")
        case `AV_PIX_FMT_BAYER_RGGB16BE` => Some("AV_PIX_FMT_BAYER_RGGB16BE")
        case `AV_PIX_FMT_BAYER_GBRG16LE` => Some("AV_PIX_FMT_BAYER_GBRG16LE")
        case `AV_PIX_FMT_BAYER_GBRG16BE` => Some("AV_PIX_FMT_BAYER_GBRG16BE")
        case `AV_PIX_FMT_BAYER_GRBG16LE` => Some("AV_PIX_FMT_BAYER_GRBG16LE")
        case `AV_PIX_FMT_BAYER_GRBG16BE` => Some("AV_PIX_FMT_BAYER_GRBG16BE")
        case `AV_PIX_FMT_YUV440P10LE`    => Some("AV_PIX_FMT_YUV440P10LE")
        case `AV_PIX_FMT_YUV440P10BE`    => Some("AV_PIX_FMT_YUV440P10BE")
        case `AV_PIX_FMT_YUV440P12LE`    => Some("AV_PIX_FMT_YUV440P12LE")
        case `AV_PIX_FMT_YUV440P12BE`    => Some("AV_PIX_FMT_YUV440P12BE")
        case `AV_PIX_FMT_AYUV64LE`       => Some("AV_PIX_FMT_AYUV64LE")
        case `AV_PIX_FMT_AYUV64BE`       => Some("AV_PIX_FMT_AYUV64BE")
        case `AV_PIX_FMT_VIDEOTOOLBOX`   => Some("AV_PIX_FMT_VIDEOTOOLBOX")
        case `AV_PIX_FMT_P010LE`         => Some("AV_PIX_FMT_P010LE")
        case `AV_PIX_FMT_P010BE`         => Some("AV_PIX_FMT_P010BE")
        case `AV_PIX_FMT_GBRAP12BE`      => Some("AV_PIX_FMT_GBRAP12BE")
        case `AV_PIX_FMT_GBRAP12LE`      => Some("AV_PIX_FMT_GBRAP12LE")
        case `AV_PIX_FMT_GBRAP10BE`      => Some("AV_PIX_FMT_GBRAP10BE")
        case `AV_PIX_FMT_GBRAP10LE`      => Some("AV_PIX_FMT_GBRAP10LE")
        case `AV_PIX_FMT_MEDIACODEC`     => Some("AV_PIX_FMT_MEDIACODEC")
        case `AV_PIX_FMT_GRAY12BE`       => Some("AV_PIX_FMT_GRAY12BE")
        case `AV_PIX_FMT_GRAY12LE`       => Some("AV_PIX_FMT_GRAY12LE")
        case `AV_PIX_FMT_GRAY10BE`       => Some("AV_PIX_FMT_GRAY10BE")
        case `AV_PIX_FMT_GRAY10LE`       => Some("AV_PIX_FMT_GRAY10LE")
        case `AV_PIX_FMT_P016LE`         => Some("AV_PIX_FMT_P016LE")
        case `AV_PIX_FMT_P016BE`         => Some("AV_PIX_FMT_P016BE")
        case `AV_PIX_FMT_D3D11`          => Some("AV_PIX_FMT_D3D11")
        case `AV_PIX_FMT_GRAY9BE`        => Some("AV_PIX_FMT_GRAY9BE")
        case `AV_PIX_FMT_GRAY9LE`        => Some("AV_PIX_FMT_GRAY9LE")
        case `AV_PIX_FMT_GBRPF32BE`      => Some("AV_PIX_FMT_GBRPF32BE")
        case `AV_PIX_FMT_GBRPF32LE`      => Some("AV_PIX_FMT_GBRPF32LE")
        case `AV_PIX_FMT_GBRAPF32BE`     => Some("AV_PIX_FMT_GBRAPF32BE")
        case `AV_PIX_FMT_GBRAPF32LE`     => Some("AV_PIX_FMT_GBRAPF32LE")
        case `AV_PIX_FMT_DRM_PRIME`      => Some("AV_PIX_FMT_DRM_PRIME")
        case `AV_PIX_FMT_OPENCL`         => Some("AV_PIX_FMT_OPENCL")
        case `AV_PIX_FMT_GRAY14BE`       => Some("AV_PIX_FMT_GRAY14BE")
        case `AV_PIX_FMT_GRAY14LE`       => Some("AV_PIX_FMT_GRAY14LE")
        case `AV_PIX_FMT_GRAYF32BE`      => Some("AV_PIX_FMT_GRAYF32BE")
        case `AV_PIX_FMT_GRAYF32LE`      => Some("AV_PIX_FMT_GRAYF32LE")
        case `AV_PIX_FMT_YUVA422P12BE`   => Some("AV_PIX_FMT_YUVA422P12BE")
        case `AV_PIX_FMT_YUVA422P12LE`   => Some("AV_PIX_FMT_YUVA422P12LE")
        case `AV_PIX_FMT_YUVA444P12BE`   => Some("AV_PIX_FMT_YUVA444P12BE")
        case `AV_PIX_FMT_YUVA444P12LE`   => Some("AV_PIX_FMT_YUVA444P12LE")
        case `AV_PIX_FMT_NV24`           => Some("AV_PIX_FMT_NV24")
        case `AV_PIX_FMT_NV42`           => Some("AV_PIX_FMT_NV42")
        case `AV_PIX_FMT_VULKAN`         => Some("AV_PIX_FMT_VULKAN")
        case `AV_PIX_FMT_Y210BE`         => Some("AV_PIX_FMT_Y210BE")
        case `AV_PIX_FMT_Y210LE`         => Some("AV_PIX_FMT_Y210LE")
        case `AV_PIX_FMT_X2RGB10LE`      => Some("AV_PIX_FMT_X2RGB10LE")
        case `AV_PIX_FMT_X2RGB10BE`      => Some("AV_PIX_FMT_X2RGB10BE")
        case `AV_PIX_FMT_X2BGR10LE`      => Some("AV_PIX_FMT_X2BGR10LE")
        case `AV_PIX_FMT_X2BGR10BE`      => Some("AV_PIX_FMT_X2BGR10BE")
        case `AV_PIX_FMT_P210BE`         => Some("AV_PIX_FMT_P210BE")
        case `AV_PIX_FMT_P210LE`         => Some("AV_PIX_FMT_P210LE")
        case `AV_PIX_FMT_P410BE`         => Some("AV_PIX_FMT_P410BE")
        case `AV_PIX_FMT_P410LE`         => Some("AV_PIX_FMT_P410LE")
        case `AV_PIX_FMT_P216BE`         => Some("AV_PIX_FMT_P216BE")
        case `AV_PIX_FMT_P216LE`         => Some("AV_PIX_FMT_P216LE")
        case `AV_PIX_FMT_P416BE`         => Some("AV_PIX_FMT_P416BE")
        case `AV_PIX_FMT_P416LE`         => Some("AV_PIX_FMT_P416LE")
        case `AV_PIX_FMT_VUYA`           => Some("AV_PIX_FMT_VUYA")
        case `AV_PIX_FMT_RGBAF16BE`      => Some("AV_PIX_FMT_RGBAF16BE")
        case `AV_PIX_FMT_RGBAF16LE`      => Some("AV_PIX_FMT_RGBAF16LE")
        case `AV_PIX_FMT_VUYX`           => Some("AV_PIX_FMT_VUYX")
        case `AV_PIX_FMT_P012LE`         => Some("AV_PIX_FMT_P012LE")
        case `AV_PIX_FMT_P012BE`         => Some("AV_PIX_FMT_P012BE")
        case `AV_PIX_FMT_Y212BE`         => Some("AV_PIX_FMT_Y212BE")
        case `AV_PIX_FMT_Y212LE`         => Some("AV_PIX_FMT_Y212LE")
        case `AV_PIX_FMT_XV30BE`         => Some("AV_PIX_FMT_XV30BE")
        case `AV_PIX_FMT_XV30LE`         => Some("AV_PIX_FMT_XV30LE")
        case `AV_PIX_FMT_XV36BE`         => Some("AV_PIX_FMT_XV36BE")
        case `AV_PIX_FMT_XV36LE`         => Some("AV_PIX_FMT_XV36LE")
        case `AV_PIX_FMT_RGBF32BE`       => Some("AV_PIX_FMT_RGBF32BE")
        case `AV_PIX_FMT_RGBF32LE`       => Some("AV_PIX_FMT_RGBF32LE")
        case `AV_PIX_FMT_RGBAF32BE`      => Some("AV_PIX_FMT_RGBAF32BE")
        case `AV_PIX_FMT_RGBAF32LE`      => Some("AV_PIX_FMT_RGBAF32LE")
        case `AV_PIX_FMT_P212BE`         => Some("AV_PIX_FMT_P212BE")
        case `AV_PIX_FMT_P212LE`         => Some("AV_PIX_FMT_P212LE")
        case `AV_PIX_FMT_P412BE`         => Some("AV_PIX_FMT_P412BE")
        case `AV_PIX_FMT_P412LE`         => Some("AV_PIX_FMT_P412LE")
        case `AV_PIX_FMT_GBRAP14BE`      => Some("AV_PIX_FMT_GBRAP14BE")
        case `AV_PIX_FMT_GBRAP14LE`      => Some("AV_PIX_FMT_GBRAP14LE")
        case `AV_PIX_FMT_D3D12`          => Some("AV_PIX_FMT_D3D12")
        case `AV_PIX_FMT_NB`             => Some("AV_PIX_FMT_NB")
        case _                           => _root_.scala.None
    extension (a: AVPixelFormat)
      inline def &(b: AVPixelFormat): AVPixelFormat = a & b
      inline def |(b: AVPixelFormat): AVPixelFormat = a | b
      inline def is(b: AVPixelFormat): Boolean = (a & b) == b
  end AVPixelFormat

  /** Rounding methods.
    */
  opaque type AVRounding = CUnsignedInt
  object AVRounding extends _BindgenEnumCUnsignedInt[AVRounding]:
    given _tag: Tag[AVRounding] = Tag.UInt
    inline def define(inline a: Long): AVRounding = a.toUInt
    val AV_ROUND_ZERO = define(0)
    val AV_ROUND_INF = define(1)
    val AV_ROUND_DOWN = define(2)
    val AV_ROUND_UP = define(3)
    val AV_ROUND_NEAR_INF = define(5)
    val AV_ROUND_PASS_MINMAX = define(8192)
    def getName(value: AVRounding): Option[String] =
      value match
        case `AV_ROUND_ZERO`        => Some("AV_ROUND_ZERO")
        case `AV_ROUND_INF`         => Some("AV_ROUND_INF")
        case `AV_ROUND_DOWN`        => Some("AV_ROUND_DOWN")
        case `AV_ROUND_UP`          => Some("AV_ROUND_UP")
        case `AV_ROUND_NEAR_INF`    => Some("AV_ROUND_NEAR_INF")
        case `AV_ROUND_PASS_MINMAX` => Some("AV_ROUND_PASS_MINMAX")
        case _                      => _root_.scala.None
    extension (a: AVRounding)
      inline def &(b: AVRounding): AVRounding = a & b
      inline def |(b: AVRounding): AVRounding = a | b
      inline def is(b: AVRounding): Boolean = (a & b) == b
  end AVRounding

  /** Audio sample formats
    */
  opaque type AVSampleFormat = CInt
  object AVSampleFormat extends _BindgenEnumCInt[AVSampleFormat]:
    given _tag: Tag[AVSampleFormat] = Tag.Int
    inline def define(inline a: CInt): AVSampleFormat = a
    val AV_SAMPLE_FMT_NONE = define(-1)
    val AV_SAMPLE_FMT_U8 = define(0)
    val AV_SAMPLE_FMT_S16 = define(1)
    val AV_SAMPLE_FMT_S32 = define(2)
    val AV_SAMPLE_FMT_FLT = define(3)
    val AV_SAMPLE_FMT_DBL = define(4)
    val AV_SAMPLE_FMT_U8P = define(5)
    val AV_SAMPLE_FMT_S16P = define(6)
    val AV_SAMPLE_FMT_S32P = define(7)
    val AV_SAMPLE_FMT_FLTP = define(8)
    val AV_SAMPLE_FMT_DBLP = define(9)
    val AV_SAMPLE_FMT_S64 = define(10)
    val AV_SAMPLE_FMT_S64P = define(11)
    val AV_SAMPLE_FMT_NB = define(12)
    def getName(value: AVSampleFormat): Option[String] =
      value match
        case `AV_SAMPLE_FMT_NONE` => Some("AV_SAMPLE_FMT_NONE")
        case `AV_SAMPLE_FMT_U8`   => Some("AV_SAMPLE_FMT_U8")
        case `AV_SAMPLE_FMT_S16`  => Some("AV_SAMPLE_FMT_S16")
        case `AV_SAMPLE_FMT_S32`  => Some("AV_SAMPLE_FMT_S32")
        case `AV_SAMPLE_FMT_FLT`  => Some("AV_SAMPLE_FMT_FLT")
        case `AV_SAMPLE_FMT_DBL`  => Some("AV_SAMPLE_FMT_DBL")
        case `AV_SAMPLE_FMT_U8P`  => Some("AV_SAMPLE_FMT_U8P")
        case `AV_SAMPLE_FMT_S16P` => Some("AV_SAMPLE_FMT_S16P")
        case `AV_SAMPLE_FMT_S32P` => Some("AV_SAMPLE_FMT_S32P")
        case `AV_SAMPLE_FMT_FLTP` => Some("AV_SAMPLE_FMT_FLTP")
        case `AV_SAMPLE_FMT_DBLP` => Some("AV_SAMPLE_FMT_DBLP")
        case `AV_SAMPLE_FMT_S64`  => Some("AV_SAMPLE_FMT_S64")
        case `AV_SAMPLE_FMT_S64P` => Some("AV_SAMPLE_FMT_S64P")
        case `AV_SAMPLE_FMT_NB`   => Some("AV_SAMPLE_FMT_NB")
        case _                    => _root_.scala.None
    extension (a: AVSampleFormat)
      inline def &(b: AVSampleFormat): AVSampleFormat = a & b
      inline def |(b: AVSampleFormat): AVSampleFormat = a | b
      inline def is(b: AVSampleFormat): Boolean = (a & b) == b
  end AVSampleFormat

  opaque type AVSideDataParamChangeFlags = CUnsignedInt
  object AVSideDataParamChangeFlags
      extends _BindgenEnumCUnsignedInt[AVSideDataParamChangeFlags]:
    given _tag: Tag[AVSideDataParamChangeFlags] = Tag.UInt
    inline def define(inline a: Long): AVSideDataParamChangeFlags = a.toUInt
    val AV_SIDE_DATA_PARAM_CHANGE_SAMPLE_RATE = define(4)
    val AV_SIDE_DATA_PARAM_CHANGE_DIMENSIONS = define(8)
    def getName(value: AVSideDataParamChangeFlags): Option[String] =
      value match
        case `AV_SIDE_DATA_PARAM_CHANGE_SAMPLE_RATE` =>
          Some("AV_SIDE_DATA_PARAM_CHANGE_SAMPLE_RATE")
        case `AV_SIDE_DATA_PARAM_CHANGE_DIMENSIONS` =>
          Some("AV_SIDE_DATA_PARAM_CHANGE_DIMENSIONS")
        case _ => _root_.scala.None
    extension (a: AVSideDataParamChangeFlags)
      inline def &(b: AVSideDataParamChangeFlags): AVSideDataParamChangeFlags =
        a & b
      inline def |(b: AVSideDataParamChangeFlags): AVSideDataParamChangeFlags =
        a | b
      inline def is(b: AVSideDataParamChangeFlags): Boolean = (a & b) == b
  end AVSideDataParamChangeFlags

  opaque type AVSideDataProps = CUnsignedInt
  object AVSideDataProps extends _BindgenEnumCUnsignedInt[AVSideDataProps]:
    given _tag: Tag[AVSideDataProps] = Tag.UInt
    inline def define(inline a: Long): AVSideDataProps = a.toUInt
    val AV_SIDE_DATA_PROP_GLOBAL = define(1)
    val AV_SIDE_DATA_PROP_MULTI = define(2)
    def getName(value: AVSideDataProps): Option[String] =
      value match
        case `AV_SIDE_DATA_PROP_GLOBAL` => Some("AV_SIDE_DATA_PROP_GLOBAL")
        case `AV_SIDE_DATA_PROP_MULTI`  => Some("AV_SIDE_DATA_PROP_MULTI")
        case _                          => _root_.scala.None
    extension (a: AVSideDataProps)
      inline def &(b: AVSideDataProps): AVSideDataProps = a & b
      inline def |(b: AVSideDataProps): AVSideDataProps = a | b
      inline def is(b: AVSideDataProps): Boolean = (a & b) == b
  end AVSideDataProps

  opaque type AVStreamGroupParamsType = CUnsignedInt
  object AVStreamGroupParamsType
      extends _BindgenEnumCUnsignedInt[AVStreamGroupParamsType]:
    given _tag: Tag[AVStreamGroupParamsType] = Tag.UInt
    inline def define(inline a: Long): AVStreamGroupParamsType = a.toUInt
    val AV_STREAM_GROUP_PARAMS_NONE = define(0)
    val AV_STREAM_GROUP_PARAMS_IAMF_AUDIO_ELEMENT = define(1)
    val AV_STREAM_GROUP_PARAMS_IAMF_MIX_PRESENTATION = define(2)
    val AV_STREAM_GROUP_PARAMS_TILE_GRID = define(3)
    val AV_STREAM_GROUP_PARAMS_LCEVC = define(4)
    def getName(value: AVStreamGroupParamsType): Option[String] =
      value match
        case `AV_STREAM_GROUP_PARAMS_NONE` =>
          Some("AV_STREAM_GROUP_PARAMS_NONE")
        case `AV_STREAM_GROUP_PARAMS_IAMF_AUDIO_ELEMENT` =>
          Some("AV_STREAM_GROUP_PARAMS_IAMF_AUDIO_ELEMENT")
        case `AV_STREAM_GROUP_PARAMS_IAMF_MIX_PRESENTATION` =>
          Some("AV_STREAM_GROUP_PARAMS_IAMF_MIX_PRESENTATION")
        case `AV_STREAM_GROUP_PARAMS_TILE_GRID` =>
          Some("AV_STREAM_GROUP_PARAMS_TILE_GRID")
        case `AV_STREAM_GROUP_PARAMS_LCEVC` =>
          Some("AV_STREAM_GROUP_PARAMS_LCEVC")
        case _ => _root_.scala.None
    extension (a: AVStreamGroupParamsType)
      inline def &(b: AVStreamGroupParamsType): AVStreamGroupParamsType = a & b
      inline def |(b: AVStreamGroupParamsType): AVStreamGroupParamsType = a | b
      inline def is(b: AVStreamGroupParamsType): Boolean = (a & b) == b
  end AVStreamGroupParamsType

  /** @}
    */
  opaque type AVStreamParseType = CUnsignedInt
  object AVStreamParseType extends _BindgenEnumCUnsignedInt[AVStreamParseType]:
    given _tag: Tag[AVStreamParseType] = Tag.UInt
    inline def define(inline a: Long): AVStreamParseType = a.toUInt
    val AVSTREAM_PARSE_NONE = define(0)
    val AVSTREAM_PARSE_FULL = define(1)
    val AVSTREAM_PARSE_HEADERS = define(2)
    val AVSTREAM_PARSE_TIMESTAMPS = define(3)
    val AVSTREAM_PARSE_FULL_ONCE = define(4)
    val AVSTREAM_PARSE_FULL_RAW = define(5)
    def getName(value: AVStreamParseType): Option[String] =
      value match
        case `AVSTREAM_PARSE_NONE`       => Some("AVSTREAM_PARSE_NONE")
        case `AVSTREAM_PARSE_FULL`       => Some("AVSTREAM_PARSE_FULL")
        case `AVSTREAM_PARSE_HEADERS`    => Some("AVSTREAM_PARSE_HEADERS")
        case `AVSTREAM_PARSE_TIMESTAMPS` => Some("AVSTREAM_PARSE_TIMESTAMPS")
        case `AVSTREAM_PARSE_FULL_ONCE`  => Some("AVSTREAM_PARSE_FULL_ONCE")
        case `AVSTREAM_PARSE_FULL_RAW`   => Some("AVSTREAM_PARSE_FULL_RAW")
        case _                           => _root_.scala.None
    extension (a: AVStreamParseType)
      inline def &(b: AVStreamParseType): AVStreamParseType = a & b
      inline def |(b: AVStreamParseType): AVStreamParseType = a | b
      inline def is(b: AVStreamParseType): Boolean = (a & b) == b
  end AVStreamParseType

  /** @}
    */
  opaque type AVSubtitleType = CUnsignedInt
  object AVSubtitleType extends _BindgenEnumCUnsignedInt[AVSubtitleType]:
    given _tag: Tag[AVSubtitleType] = Tag.UInt
    inline def define(inline a: Long): AVSubtitleType = a.toUInt
    val SUBTITLE_NONE = define(0)
    val SUBTITLE_BITMAP = define(1)
    val SUBTITLE_TEXT = define(2)
    val SUBTITLE_ASS = define(3)
    def getName(value: AVSubtitleType): Option[String] =
      value match
        case `SUBTITLE_NONE`   => Some("SUBTITLE_NONE")
        case `SUBTITLE_BITMAP` => Some("SUBTITLE_BITMAP")
        case `SUBTITLE_TEXT`   => Some("SUBTITLE_TEXT")
        case `SUBTITLE_ASS`    => Some("SUBTITLE_ASS")
        case _                 => _root_.scala.None
    extension (a: AVSubtitleType)
      inline def &(b: AVSubtitleType): AVSubtitleType = a & b
      inline def |(b: AVSubtitleType): AVSubtitleType = a | b
      inline def is(b: AVSubtitleType): Boolean = (a & b) == b
  end AVSubtitleType

  opaque type AVTimebaseSource = CInt
  object AVTimebaseSource extends _BindgenEnumCInt[AVTimebaseSource]:
    given _tag: Tag[AVTimebaseSource] = Tag.Int
    inline def define(inline a: CInt): AVTimebaseSource = a
    val AVFMT_TBCF_AUTO = define(-1)
    val AVFMT_TBCF_DECODER = define(0)
    val AVFMT_TBCF_DEMUXER = define(1)
    val AVFMT_TBCF_R_FRAMERATE = define(2)
    def getName(value: AVTimebaseSource): Option[String] =
      value match
        case `AVFMT_TBCF_AUTO`        => Some("AVFMT_TBCF_AUTO")
        case `AVFMT_TBCF_DECODER`     => Some("AVFMT_TBCF_DECODER")
        case `AVFMT_TBCF_DEMUXER`     => Some("AVFMT_TBCF_DEMUXER")
        case `AVFMT_TBCF_R_FRAMERATE` => Some("AVFMT_TBCF_R_FRAMERATE")
        case _                        => _root_.scala.None
    extension (a: AVTimebaseSource)
      inline def &(b: AVTimebaseSource): AVTimebaseSource = a & b
      inline def |(b: AVTimebaseSource): AVTimebaseSource = a | b
      inline def is(b: AVTimebaseSource): Boolean = (a & b) == b
  end AVTimebaseSource
end enumerations

object aliases:
  import _root_.ffmpeg.enumerations.*
  import _root_.ffmpeg.predef.*
  import _root_.ffmpeg.aliases.*
  import _root_.ffmpeg.structs.*
  import _root_.ffmpeg.unions.*
  opaque type AVOpenCallback = CFuncPtr6[Ptr[AVFormatContext], Ptr[
    Ptr[AVIOContext]
  ], CString, CInt, Ptr[AVIOInterruptCB], Ptr[Ptr[AVDictionary]], CInt]
  object AVOpenCallback:
    given _tag: Tag[AVOpenCallback] =
      Tag.materializeCFuncPtr6[Ptr[AVFormatContext], Ptr[
        Ptr[AVIOContext]
      ], CString, CInt, Ptr[AVIOInterruptCB], Ptr[Ptr[AVDictionary]], CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): AVOpenCallback =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr6[Ptr[AVFormatContext], Ptr[
          Ptr[AVIOContext]
        ], CString, CInt, Ptr[AVIOInterruptCB], Ptr[Ptr[AVDictionary]], CInt]
    ): AVOpenCallback = o
    extension (v: AVOpenCallback)
      inline def value: CFuncPtr6[Ptr[AVFormatContext], Ptr[
        Ptr[AVIOContext]
      ], CString, CInt, Ptr[AVIOInterruptCB], Ptr[Ptr[AVDictionary]], CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end AVOpenCallback

  type FILE = libc.stdio.FILE
  object FILE:
    val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
    inline def apply(inline o: libc.stdio.FILE): FILE = o
    extension (v: FILE) inline def value: libc.stdio.FILE = v

  /** Callback used by devices to communicate with application.
    */
  opaque type av_format_control_message =
    CFuncPtr4[Ptr[AVFormatContext], CInt, Ptr[Byte], size_t, CInt]
  object av_format_control_message:
    given _tag: Tag[av_format_control_message] = Tag
      .materializeCFuncPtr4[Ptr[AVFormatContext], CInt, Ptr[Byte], size_t, CInt]
    inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): av_format_control_message =
      CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(
        inline o: CFuncPtr4[Ptr[AVFormatContext], CInt, Ptr[Byte], size_t, CInt]
    ): av_format_control_message = o
    extension (v: av_format_control_message)
      inline def value
          : CFuncPtr4[Ptr[AVFormatContext], CInt, Ptr[Byte], size_t, CInt] = v
      inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
  end av_format_control_message

  type int16_t = scala.Short
  object int16_t:
    val _tag: Tag[int16_t] = summon[Tag[scala.Short]]
    inline def apply(inline o: scala.Short): int16_t = o
    extension (v: int16_t) inline def value: scala.Short = v

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

  type int8_t = scala.scalanative.unsafe.CChar
  object int8_t:
    val _tag: Tag[int8_t] = summon[Tag[scala.scalanative.unsafe.CChar]]
    inline def apply(inline o: scala.scalanative.unsafe.CChar): int8_t = o
    extension (v: int8_t) inline def value: scala.scalanative.unsafe.CChar = v

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

  type uint8_t = scala.scalanative.unsigned.UByte
  object uint8_t:
    val _tag: Tag[uint8_t] = summon[Tag[scala.scalanative.unsigned.UByte]]
    inline def apply(inline o: scala.scalanative.unsigned.UByte): uint8_t = o
    extension (v: uint8_t)
      inline def value: scala.scalanative.unsigned.UByte = v

  type va_list = unsafe.CVarArgList
  object va_list:
    val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
    inline def apply(inline o: unsafe.CVarArgList): va_list = o
    extension (v: va_list) inline def value: unsafe.CVarArgList = v
end aliases

object structs:
  import _root_.ffmpeg.enumerations.*
  import _root_.ffmpeg.predef.*
  import _root_.ffmpeg.aliases.*
  import _root_.ffmpeg.structs.*
  import _root_.ffmpeg.unions.*

  /** @}
    */
  opaque type AVBPrint = CStruct0

  object AVBPrint:
    given _tag: Tag[AVBPrint] = Tag.materializeCStruct0Tag

  opaque type AVBuffer = CStruct0

  object AVBuffer:
    given _tag: Tag[AVBuffer] = Tag.materializeCStruct0Tag

  opaque type AVBufferPool = CStruct0

  object AVBufferPool:
    given _tag: Tag[AVBufferPool] = Tag.materializeCStruct0Tag

  /** A reference to a data buffer.
    */
  opaque type AVBufferRef = CStruct3[Ptr[AVBuffer], Ptr[uint8_t], size_t]

  object AVBufferRef:
    given _tag: Tag[AVBufferRef] =
      Tag.materializeCStruct3Tag[Ptr[AVBuffer], Ptr[uint8_t], size_t]

    // Allocates AVBufferRef on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVBufferRef] =
      scala.scalanative.unsafe.alloc[AVBufferRef](1)
    def apply(buffer: Ptr[AVBuffer], data: Ptr[uint8_t], size: size_t)(using
        Zone
    ): Ptr[AVBufferRef] =
      val ____ptr = apply()
      (!____ptr).buffer = buffer
      (!____ptr).data = data
      (!____ptr).size = size
      ____ptr

    extension (struct: AVBufferRef)
      def buffer: Ptr[AVBuffer] = struct._1
      def buffer_=(value: Ptr[AVBuffer]): Unit = !struct.at1 = value
      def data: Ptr[uint8_t] = struct._2
      def data_=(value: Ptr[uint8_t]): Unit = !struct.at2 = value
      def size: size_t = struct._3
      def size_=(value: size_t): Unit = !struct.at3 = value
  end AVBufferRef

  /** This structure describes the bitrate properties of an encoded bitstream.
    * It roughly corresponds to a subset the VBV parameters for MPEG-2 or HRD
    * parameters for H.264/HEVC.
    */
  opaque type AVCPBProperties =
    CStruct5[int64_t, int64_t, int64_t, int64_t, uint64_t]

  object AVCPBProperties:
    given _tag: Tag[AVCPBProperties] =
      Tag.materializeCStruct5Tag[int64_t, int64_t, int64_t, int64_t, uint64_t]

    // Allocates AVCPBProperties on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVCPBProperties] =
      scala.scalanative.unsafe.alloc[AVCPBProperties](1)
    def apply(
        max_bitrate: int64_t,
        min_bitrate: int64_t,
        avg_bitrate: int64_t,
        buffer_size: int64_t,
        vbv_delay: uint64_t
    )(using Zone): Ptr[AVCPBProperties] =
      val ____ptr = apply()
      (!____ptr).max_bitrate = max_bitrate
      (!____ptr).min_bitrate = min_bitrate
      (!____ptr).avg_bitrate = avg_bitrate
      (!____ptr).buffer_size = buffer_size
      (!____ptr).vbv_delay = vbv_delay
      ____ptr
    end apply

    extension (struct: AVCPBProperties)
      def max_bitrate: int64_t = struct._1
      def max_bitrate_=(value: int64_t): Unit = !struct.at1 = value
      def min_bitrate: int64_t = struct._2
      def min_bitrate_=(value: int64_t): Unit = !struct.at2 = value
      def avg_bitrate: int64_t = struct._3
      def avg_bitrate_=(value: int64_t): Unit = !struct.at3 = value
      def buffer_size: int64_t = struct._4
      def buffer_size_=(value: int64_t): Unit = !struct.at4 = value
      def vbv_delay: uint64_t = struct._5
      def vbv_delay_=(value: uint64_t): Unit = !struct.at5 = value
    end extension
  end AVCPBProperties

  /** An AVChannelCustom defines a single channel within a custom order layout
    */
  opaque type AVChannelCustom =
    CStruct3[AVChannel, CArray[CChar, Nat.Digit2[Nat._1, Nat._6]], Ptr[Byte]]

  object AVChannelCustom:
    given _tag: Tag[AVChannelCustom] =
      Tag.materializeCStruct3Tag[AVChannel, CArray[
        CChar,
        Nat.Digit2[Nat._1, Nat._6]
      ], Ptr[Byte]]

    // Allocates AVChannelCustom on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVChannelCustom] =
      scala.scalanative.unsafe.alloc[AVChannelCustom](1)
    def apply(
        id: AVChannel,
        name: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]],
        opaque: Ptr[Byte]
    )(using Zone): Ptr[AVChannelCustom] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).name = name
      (!____ptr).opaque = opaque
      ____ptr
    end apply

    extension (struct: AVChannelCustom)
      def id: AVChannel = struct._1
      def id_=(value: AVChannel): Unit = !struct.at1 = value
      def name: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]] = struct._2
      def name_=(value: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]): Unit =
        !struct.at2 = value
      def opaque: Ptr[Byte] = struct._3
      def opaque_=(value: Ptr[Byte]): Unit = !struct.at3 = value
  end AVChannelCustom

  /** An AVChannelLayout holds information about the channel layout of audio
    * data.
    */
  opaque type AVChannelLayout =
    CStruct4[AVChannelOrder, CInt, AVChannelLayout.U, Ptr[Byte]]

  object AVChannelLayout:
    given _tag: Tag[AVChannelLayout] =
      Tag.materializeCStruct4Tag[AVChannelOrder, CInt, AVChannelLayout.U, Ptr[
        Byte
      ]]

    // Allocates AVChannelLayout on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVChannelLayout] =
      scala.scalanative.unsafe.alloc[AVChannelLayout](1)
    def apply(
        order: AVChannelOrder,
        nb_channels: CInt,
        u: AVChannelLayout.U,
        opaque: Ptr[Byte]
    )(using Zone): Ptr[AVChannelLayout] =
      val ____ptr = apply()
      (!____ptr).order = order
      (!____ptr).nb_channels = nb_channels
      (!____ptr).u = u
      (!____ptr).opaque = opaque
      ____ptr
    end apply

    extension (struct: AVChannelLayout)
      def order: AVChannelOrder = struct._1
      def order_=(value: AVChannelOrder): Unit = !struct.at1 = value
      def nb_channels: CInt = struct._2
      def nb_channels_=(value: CInt): Unit = !struct.at2 = value
      def u: AVChannelLayout.U = struct._3
      def u_=(value: AVChannelLayout.U): Unit = !struct.at3 = value
      def opaque: Ptr[Byte] = struct._4
      def opaque_=(value: Ptr[Byte]): Unit = !struct.at4 = value

    /** Details about which channels are present in this layout. For
      * AV_CHANNEL_ORDER_UNSPEC, this field is undefined and must not be used.
      */
    opaque type U = CArray[Byte, Nat._8]
    object U:
      given _tag: Tag[U] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)

      def apply()(using Zone): Ptr[U] =
        val ___ptr = _root_.scala.scalanative.unsafe.alloc[U](1)
        ___ptr

      @scala.annotation.targetName("apply_mask")
      def apply(mask: uint64_t)(using Zone): Ptr[U] =
        val ___ptr = _root_.scala.scalanative.unsafe.alloc[U](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[uint64_t]].update(0, mask)
        ___ptr

      @scala.annotation.targetName("apply_map")
      def apply(map: Ptr[AVChannelCustom])(using Zone): Ptr[U] =
        val ___ptr = _root_.scala.scalanative.unsafe.alloc[U](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[AVChannelCustom]]].update(0, map)
        ___ptr

      extension (struct: U)
        def mask: uint64_t = !struct.at(0).asInstanceOf[Ptr[uint64_t]]
        def mask_=(value: uint64_t): Unit =
          !struct.at(0).asInstanceOf[Ptr[uint64_t]] = value
        def map: Ptr[AVChannelCustom] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[AVChannelCustom]]]
        def map_=(value: Ptr[AVChannelCustom]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[AVChannelCustom]]] = value
    end U
  end AVChannelLayout

  opaque type AVChapter =
    CStruct5[int64_t, AVRational, int64_t, int64_t, Ptr[AVDictionary]]

  object AVChapter:
    given _tag: Tag[AVChapter] =
      Tag.materializeCStruct5Tag[int64_t, AVRational, int64_t, int64_t, Ptr[
        AVDictionary
      ]]

    // Allocates AVChapter on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVChapter] =
      scala.scalanative.unsafe.alloc[AVChapter](1)
    def apply(
        id: int64_t,
        time_base: AVRational,
        start: int64_t,
        end: int64_t,
        metadata: Ptr[AVDictionary]
    )(using Zone): Ptr[AVChapter] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).time_base = time_base
      (!____ptr).start = start
      (!____ptr).end = end
      (!____ptr).metadata = metadata
      ____ptr
    end apply

    extension (struct: AVChapter)
      def id: int64_t = struct._1
      def id_=(value: int64_t): Unit = !struct.at1 = value
      def time_base: AVRational = struct._2
      def time_base_=(value: AVRational): Unit = !struct.at2 = value
      def start: int64_t = struct._3
      def start_=(value: int64_t): Unit = !struct.at3 = value
      def end: int64_t = struct._4
      def end_=(value: int64_t): Unit = !struct.at4 = value
      def metadata: Ptr[AVDictionary] = struct._5
      def metadata_=(value: Ptr[AVDictionary]): Unit = !struct.at5 = value
    end extension
  end AVChapter

  /** Describe the class of an AVClass context structure. That is an arbitrary
    * struct of which the first field is a pointer to an AVClass struct (e.g.
    * AVCodecContext, AVFormatContext etc.).
    */
  opaque type AVClass = CStruct11[
    CString,
    CFuncPtr1[Ptr[Byte], CString],
    Ptr[AVOption],
    CInt,
    CInt,
    CInt,
    AVClassCategory,
    CFuncPtr1[Ptr[Byte], AVClassCategory],
    CFuncPtr4[Ptr[Ptr[AVOptionRanges]], Ptr[Byte], CString, CInt, CInt],
    CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[Byte]],
    CFuncPtr1[Ptr[Ptr[Byte]], Ptr[Byte]]
  ]

  object AVClass:
    given _tag: Tag[AVClass] = Tag.materializeCStruct11Tag[
      CString,
      CFuncPtr1[Ptr[Byte], CString],
      Ptr[AVOption],
      CInt,
      CInt,
      CInt,
      AVClassCategory,
      CFuncPtr1[Ptr[Byte], AVClassCategory],
      CFuncPtr4[Ptr[Ptr[AVOptionRanges]], Ptr[Byte], CString, CInt, CInt],
      CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[Byte]],
      CFuncPtr1[Ptr[Ptr[Byte]], Ptr[Byte]]
    ]

    // Allocates AVClass on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVClass] =
      scala.scalanative.unsafe.alloc[AVClass](1)
    def apply(
        class_name: CString,
        item_name: CFuncPtr1[Ptr[Byte], CString],
        option: Ptr[AVOption],
        version: CInt,
        log_level_offset_offset: CInt,
        parent_log_context_offset: CInt,
        category: AVClassCategory,
        get_category: CFuncPtr1[Ptr[Byte], AVClassCategory],
        query_ranges: CFuncPtr4[Ptr[Ptr[AVOptionRanges]], Ptr[
          Byte
        ], CString, CInt, CInt],
        child_next: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[Byte]],
        child_class_iterate: CFuncPtr1[Ptr[Ptr[Byte]], Ptr[AVClass]]
    )(using Zone): Ptr[AVClass] =
      val ____ptr = apply()
      (!____ptr).class_name = class_name
      (!____ptr).item_name = item_name
      (!____ptr).option = option
      (!____ptr).version = version
      (!____ptr).log_level_offset_offset = log_level_offset_offset
      (!____ptr).parent_log_context_offset = parent_log_context_offset
      (!____ptr).category = category
      (!____ptr).get_category = get_category
      (!____ptr).query_ranges = query_ranges
      (!____ptr).child_next = child_next
      (!____ptr).child_class_iterate = child_class_iterate
      ____ptr
    end apply

    extension (struct: AVClass)
      def class_name: CString = struct._1
      def class_name_=(value: CString): Unit = !struct.at1 = value
      def item_name: CFuncPtr1[Ptr[Byte], CString] = struct._2
      def item_name_=(value: CFuncPtr1[Ptr[Byte], CString]): Unit =
        !struct.at2 = value
      def option: Ptr[AVOption] = struct._3
      def option_=(value: Ptr[AVOption]): Unit = !struct.at3 = value
      def version: CInt = struct._4
      def version_=(value: CInt): Unit = !struct.at4 = value
      def log_level_offset_offset: CInt = struct._5
      def log_level_offset_offset_=(value: CInt): Unit = !struct.at5 = value
      def parent_log_context_offset: CInt = struct._6
      def parent_log_context_offset_=(value: CInt): Unit = !struct.at6 = value
      def category: AVClassCategory = struct._7
      def category_=(value: AVClassCategory): Unit = !struct.at7 = value
      def get_category: CFuncPtr1[Ptr[Byte], AVClassCategory] = struct._8
      def get_category_=(value: CFuncPtr1[Ptr[Byte], AVClassCategory]): Unit =
        !struct.at8 = value
      def query_ranges: CFuncPtr4[Ptr[Ptr[AVOptionRanges]], Ptr[
        Byte
      ], CString, CInt, CInt] = struct._9
      def query_ranges_=(
          value: CFuncPtr4[Ptr[Ptr[AVOptionRanges]], Ptr[
            Byte
          ], CString, CInt, CInt]
      ): Unit = !struct.at9 = value
      def child_next: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[Byte]] = struct._10
      def child_next_=(
          value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Ptr[Byte]]
      ): Unit = !struct.at10 = value
      def child_class_iterate: CFuncPtr1[Ptr[Ptr[Byte]], Ptr[AVClass]] =
        struct._11.asInstanceOf[CFuncPtr1[Ptr[Ptr[Byte]], Ptr[AVClass]]]
      def child_class_iterate_=(
          value: CFuncPtr1[Ptr[Ptr[Byte]], Ptr[AVClass]]
      ): Unit = !struct.at11 =
        value.asInstanceOf[CFuncPtr1[Ptr[Ptr[Byte]], Ptr[Byte]]]
    end extension
  end AVClass

  /** AVCodec.
    */
  opaque type AVCodec = CStruct14[
    CString,
    CString,
    AVMediaType,
    AVCodecID,
    CInt,
    uint8_t,
    Ptr[AVRational],
    Ptr[AVPixelFormat],
    Ptr[CInt],
    Ptr[AVSampleFormat],
    Ptr[Byte],
    Ptr[AVProfile],
    CString,
    Ptr[AVChannelLayout]
  ]

  object AVCodec:
    given _tag: Tag[AVCodec] = Tag.materializeCStruct14Tag[
      CString,
      CString,
      AVMediaType,
      AVCodecID,
      CInt,
      uint8_t,
      Ptr[AVRational],
      Ptr[AVPixelFormat],
      Ptr[CInt],
      Ptr[AVSampleFormat],
      Ptr[Byte],
      Ptr[AVProfile],
      CString,
      Ptr[AVChannelLayout]
    ]

    // Allocates AVCodec on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVCodec] =
      scala.scalanative.unsafe.alloc[AVCodec](1)
    def apply(
        name: CString,
        long_name: CString,
        `type`: AVMediaType,
        id: AVCodecID,
        capabilities: CInt,
        max_lowres: uint8_t,
        supported_framerates: Ptr[AVRational],
        pix_fmts: Ptr[AVPixelFormat],
        supported_samplerates: Ptr[CInt],
        sample_fmts: Ptr[AVSampleFormat],
        priv_class: Ptr[AVClass],
        profiles: Ptr[AVProfile],
        wrapper_name: CString,
        ch_layouts: Ptr[AVChannelLayout]
    )(using Zone): Ptr[AVCodec] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).long_name = long_name
      (!____ptr).`type` = `type`
      (!____ptr).id = id
      (!____ptr).capabilities = capabilities
      (!____ptr).max_lowres = max_lowres
      (!____ptr).supported_framerates = supported_framerates
      (!____ptr).pix_fmts = pix_fmts
      (!____ptr).supported_samplerates = supported_samplerates
      (!____ptr).sample_fmts = sample_fmts
      (!____ptr).priv_class = priv_class
      (!____ptr).profiles = profiles
      (!____ptr).wrapper_name = wrapper_name
      (!____ptr).ch_layouts = ch_layouts
      ____ptr
    end apply

    extension (struct: AVCodec)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def long_name: CString = struct._2
      def long_name_=(value: CString): Unit = !struct.at2 = value
      def `type`: AVMediaType = struct._3
      def type_=(value: AVMediaType): Unit = !struct.at3 = value
      def id: AVCodecID = struct._4
      def id_=(value: AVCodecID): Unit = !struct.at4 = value
      def capabilities: CInt = struct._5
      def capabilities_=(value: CInt): Unit = !struct.at5 = value
      def max_lowres: uint8_t = struct._6
      def max_lowres_=(value: uint8_t): Unit = !struct.at6 = value
      def supported_framerates: Ptr[AVRational] = struct._7
      def supported_framerates_=(value: Ptr[AVRational]): Unit = !struct.at7 =
        value
      def pix_fmts: Ptr[AVPixelFormat] = struct._8
      def pix_fmts_=(value: Ptr[AVPixelFormat]): Unit = !struct.at8 = value
      def supported_samplerates: Ptr[CInt] = struct._9
      def supported_samplerates_=(value: Ptr[CInt]): Unit = !struct.at9 = value
      def sample_fmts: Ptr[AVSampleFormat] = struct._10
      def sample_fmts_=(value: Ptr[AVSampleFormat]): Unit = !struct.at10 = value
      def priv_class: Ptr[AVClass] = struct._11.asInstanceOf[Ptr[AVClass]]
      def priv_class_=(value: Ptr[AVClass]): Unit = !struct.at11 =
        value.asInstanceOf[Ptr[Byte]]
      def profiles: Ptr[AVProfile] = struct._12
      def profiles_=(value: Ptr[AVProfile]): Unit = !struct.at12 = value
      def wrapper_name: CString = struct._13
      def wrapper_name_=(value: CString): Unit = !struct.at13 = value
      def ch_layouts: Ptr[AVChannelLayout] = struct._14
      def ch_layouts_=(value: Ptr[AVChannelLayout]): Unit = !struct.at14 = value
    end extension
  end AVCodec

  /** main external API structure. New fields can be added to the end with minor
    * version bumps. Removal, reordering and changes to existing fields require
    * a major version bump. You can use AVOptions (av_opt* / av_set/get*()) to
    * access these fields from user applications. The name string for AVOptions
    * options matches the associated command line parameter name and can be
    * found in libavcodec/options_table.h The AVOption/command line parameter
    * names differ in some cases from the C structure field names for historic
    * reasons or brevity. sizeof(AVCodecContext) must not be used outside
    * libav*.
    */
  opaque type AVCodecContext = CArray[CChar, Nat.Digit3[Nat._8, Nat._6, Nat._4]]

  object AVCodecContext:
    given _tag: Tag[AVCodecContext] =
      Tag.CArray[CChar, Nat.Digit3[Nat._8, Nat._6, Nat._4]](
        Tag.Byte,
        Tag.Digit3[Nat._8, Nat._6, Nat._4](Tag.Nat8, Tag.Nat6, Tag.Nat4)
      )

    // Allocates AVCodecContext on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVCodecContext] =
      scala.scalanative.unsafe.alloc[AVCodecContext](1)
    def apply(
        av_class: Ptr[AVClass],
        log_level_offset: CInt,
        codec_type: AVMediaType,
        codec: Ptr[AVCodec],
        codec_id: AVCodecID,
        codec_tag: CUnsignedInt,
        priv_data: Ptr[Byte],
        internal: Ptr[AVCodecInternal],
        opaque: Ptr[Byte],
        bit_rate: int64_t,
        flags: CInt,
        flags2: CInt,
        extradata: Ptr[uint8_t],
        extradata_size: CInt,
        time_base: AVRational,
        pkt_timebase: AVRational,
        framerate: AVRational,
        ticks_per_frame: CInt,
        delay: CInt,
        width: CInt,
        height: CInt,
        coded_width: CInt,
        coded_height: CInt,
        sample_aspect_ratio: AVRational,
        pix_fmt: AVPixelFormat,
        sw_pix_fmt: AVPixelFormat,
        color_primaries: AVColorPrimaries,
        color_trc: AVColorTransferCharacteristic,
        colorspace: AVColorSpace,
        color_range: AVColorRange,
        chroma_sample_location: AVChromaLocation,
        field_order: AVFieldOrder,
        refs: CInt,
        has_b_frames: CInt,
        slice_flags: CInt,
        draw_horiz_band: CFuncPtr6[
          Ptr[AVCodecContext],
          Ptr[AVFrame],
          CArray[CInt, Nat._8],
          CInt,
          CInt,
          CInt,
          Unit
        ],
        get_format: CFuncPtr2[Ptr[AVCodecContext], Ptr[
          AVPixelFormat
        ], AVPixelFormat],
        max_b_frames: CInt,
        b_quant_factor: Float,
        b_quant_offset: Float,
        i_quant_factor: Float,
        i_quant_offset: Float,
        lumi_masking: Float,
        temporal_cplx_masking: Float,
        spatial_cplx_masking: Float,
        p_masking: Float,
        dark_masking: Float,
        nsse_weight: CInt,
        me_cmp: CInt,
        me_sub_cmp: CInt,
        mb_cmp: CInt,
        ildct_cmp: CInt,
        dia_size: CInt,
        last_predictor_count: CInt,
        me_pre_cmp: CInt,
        pre_dia_size: CInt,
        me_subpel_quality: CInt,
        me_range: CInt,
        mb_decision: CInt,
        intra_matrix: Ptr[uint16_t],
        inter_matrix: Ptr[uint16_t],
        chroma_intra_matrix: Ptr[uint16_t],
        intra_dc_precision: CInt,
        mb_lmin: CInt,
        mb_lmax: CInt,
        bidir_refine: CInt,
        keyint_min: CInt,
        gop_size: CInt,
        mv0_threshold: CInt,
        slices: CInt,
        sample_rate: CInt,
        sample_fmt: AVSampleFormat,
        ch_layout: AVChannelLayout,
        frame_size: CInt,
        block_align: CInt,
        cutoff: CInt,
        audio_service_type: AVAudioServiceType,
        request_sample_fmt: AVSampleFormat,
        initial_padding: CInt,
        trailing_padding: CInt,
        seek_preroll: CInt,
        get_buffer2: CFuncPtr3[Ptr[AVCodecContext], Ptr[AVFrame], CInt, CInt],
        bit_rate_tolerance: CInt,
        global_quality: CInt,
        compression_level: CInt,
        qcompress: Float,
        qblur: Float,
        qmin: CInt,
        qmax: CInt,
        max_qdiff: CInt,
        rc_buffer_size: CInt,
        rc_override_count: CInt,
        rc_override: Ptr[RcOverride],
        rc_max_rate: int64_t,
        rc_min_rate: int64_t,
        rc_max_available_vbv_use: Float,
        rc_min_vbv_overflow_use: Float,
        rc_initial_buffer_occupancy: CInt,
        trellis: CInt,
        stats_out: CString,
        stats_in: CString,
        workaround_bugs: CInt,
        strict_std_compliance: CInt,
        error_concealment: CInt,
        debug: CInt,
        err_recognition: CInt,
        hwaccel: Ptr[AVHWAccel],
        hwaccel_context: Ptr[Byte],
        hw_frames_ctx: Ptr[AVBufferRef],
        hw_device_ctx: Ptr[AVBufferRef],
        hwaccel_flags: CInt,
        extra_hw_frames: CInt,
        error: CArray[uint64_t, Nat._8],
        dct_algo: CInt,
        idct_algo: CInt,
        bits_per_coded_sample: CInt,
        bits_per_raw_sample: CInt,
        thread_count: CInt,
        thread_type: CInt,
        active_thread_type: CInt,
        execute: CFuncPtr6[Ptr[AVCodecContext], CFuncPtr2[Ptr[
          AVCodecContext
        ], Ptr[Byte], CInt], Ptr[Byte], Ptr[CInt], CInt, CInt, CInt],
        execute2: CFuncPtr5[Ptr[AVCodecContext], CFuncPtr4[Ptr[
          AVCodecContext
        ], Ptr[Byte], CInt, CInt, CInt], Ptr[Byte], Ptr[CInt], CInt, CInt],
        profile: CInt,
        level: CInt,
        properties: CUnsignedInt,
        skip_loop_filter: AVDiscard,
        skip_idct: AVDiscard,
        skip_frame: AVDiscard,
        skip_alpha: CInt,
        skip_top: CInt,
        skip_bottom: CInt,
        lowres: CInt,
        codec_descriptor: Ptr[AVCodecDescriptor],
        sub_charenc: CString,
        sub_charenc_mode: CInt,
        subtitle_header_size: CInt,
        subtitle_header: Ptr[uint8_t],
        dump_separator: Ptr[uint8_t],
        codec_whitelist: CString,
        coded_side_data: Ptr[AVPacketSideData],
        nb_coded_side_data: CInt,
        export_side_data: CInt,
        max_pixels: int64_t,
        apply_cropping: CInt,
        discard_damaged_percentage: CInt,
        max_samples: int64_t,
        get_encode_buffer: CFuncPtr3[Ptr[AVCodecContext], Ptr[
          AVPacket
        ], CInt, CInt],
        frame_num: int64_t,
        side_data_prefer_packet: Ptr[CInt],
        nb_side_data_prefer_packet: CUnsignedInt,
        decoded_side_data: Ptr[Ptr[AVFrameSideData]],
        nb_decoded_side_data: CInt
    )(using Zone): Ptr[AVCodecContext] =
      val ____ptr = apply()
      (!____ptr).av_class = av_class
      (!____ptr).log_level_offset = log_level_offset
      (!____ptr).codec_type = codec_type
      (!____ptr).codec = codec
      (!____ptr).codec_id = codec_id
      (!____ptr).codec_tag = codec_tag
      (!____ptr).priv_data = priv_data
      (!____ptr).internal = internal
      (!____ptr).opaque = opaque
      (!____ptr).bit_rate = bit_rate
      (!____ptr).flags = flags
      (!____ptr).flags2 = flags2
      (!____ptr).extradata = extradata
      (!____ptr).extradata_size = extradata_size
      (!____ptr).time_base = time_base
      (!____ptr).pkt_timebase = pkt_timebase
      (!____ptr).framerate = framerate
      (!____ptr).ticks_per_frame = ticks_per_frame
      (!____ptr).delay = delay
      (!____ptr).width = width
      (!____ptr).height = height
      (!____ptr).coded_width = coded_width
      (!____ptr).coded_height = coded_height
      (!____ptr).sample_aspect_ratio = sample_aspect_ratio
      (!____ptr).pix_fmt = pix_fmt
      (!____ptr).sw_pix_fmt = sw_pix_fmt
      (!____ptr).color_primaries = color_primaries
      (!____ptr).color_trc = color_trc
      (!____ptr).colorspace = colorspace
      (!____ptr).color_range = color_range
      (!____ptr).chroma_sample_location = chroma_sample_location
      (!____ptr).field_order = field_order
      (!____ptr).refs = refs
      (!____ptr).has_b_frames = has_b_frames
      (!____ptr).slice_flags = slice_flags
      (!____ptr).draw_horiz_band = draw_horiz_band
      (!____ptr).get_format = get_format
      (!____ptr).max_b_frames = max_b_frames
      (!____ptr).b_quant_factor = b_quant_factor
      (!____ptr).b_quant_offset = b_quant_offset
      (!____ptr).i_quant_factor = i_quant_factor
      (!____ptr).i_quant_offset = i_quant_offset
      (!____ptr).lumi_masking = lumi_masking
      (!____ptr).temporal_cplx_masking = temporal_cplx_masking
      (!____ptr).spatial_cplx_masking = spatial_cplx_masking
      (!____ptr).p_masking = p_masking
      (!____ptr).dark_masking = dark_masking
      (!____ptr).nsse_weight = nsse_weight
      (!____ptr).me_cmp = me_cmp
      (!____ptr).me_sub_cmp = me_sub_cmp
      (!____ptr).mb_cmp = mb_cmp
      (!____ptr).ildct_cmp = ildct_cmp
      (!____ptr).dia_size = dia_size
      (!____ptr).last_predictor_count = last_predictor_count
      (!____ptr).me_pre_cmp = me_pre_cmp
      (!____ptr).pre_dia_size = pre_dia_size
      (!____ptr).me_subpel_quality = me_subpel_quality
      (!____ptr).me_range = me_range
      (!____ptr).mb_decision = mb_decision
      (!____ptr).intra_matrix = intra_matrix
      (!____ptr).inter_matrix = inter_matrix
      (!____ptr).chroma_intra_matrix = chroma_intra_matrix
      (!____ptr).intra_dc_precision = intra_dc_precision
      (!____ptr).mb_lmin = mb_lmin
      (!____ptr).mb_lmax = mb_lmax
      (!____ptr).bidir_refine = bidir_refine
      (!____ptr).keyint_min = keyint_min
      (!____ptr).gop_size = gop_size
      (!____ptr).mv0_threshold = mv0_threshold
      (!____ptr).slices = slices
      (!____ptr).sample_rate = sample_rate
      (!____ptr).sample_fmt = sample_fmt
      (!____ptr).ch_layout = ch_layout
      (!____ptr).frame_size = frame_size
      (!____ptr).block_align = block_align
      (!____ptr).cutoff = cutoff
      (!____ptr).audio_service_type = audio_service_type
      (!____ptr).request_sample_fmt = request_sample_fmt
      (!____ptr).initial_padding = initial_padding
      (!____ptr).trailing_padding = trailing_padding
      (!____ptr).seek_preroll = seek_preroll
      (!____ptr).get_buffer2 = get_buffer2
      (!____ptr).bit_rate_tolerance = bit_rate_tolerance
      (!____ptr).global_quality = global_quality
      (!____ptr).compression_level = compression_level
      (!____ptr).qcompress = qcompress
      (!____ptr).qblur = qblur
      (!____ptr).qmin = qmin
      (!____ptr).qmax = qmax
      (!____ptr).max_qdiff = max_qdiff
      (!____ptr).rc_buffer_size = rc_buffer_size
      (!____ptr).rc_override_count = rc_override_count
      (!____ptr).rc_override = rc_override
      (!____ptr).rc_max_rate = rc_max_rate
      (!____ptr).rc_min_rate = rc_min_rate
      (!____ptr).rc_max_available_vbv_use = rc_max_available_vbv_use
      (!____ptr).rc_min_vbv_overflow_use = rc_min_vbv_overflow_use
      (!____ptr).rc_initial_buffer_occupancy = rc_initial_buffer_occupancy
      (!____ptr).trellis = trellis
      (!____ptr).stats_out = stats_out
      (!____ptr).stats_in = stats_in
      (!____ptr).workaround_bugs = workaround_bugs
      (!____ptr).strict_std_compliance = strict_std_compliance
      (!____ptr).error_concealment = error_concealment
      (!____ptr).debug = debug
      (!____ptr).err_recognition = err_recognition
      (!____ptr).hwaccel = hwaccel
      (!____ptr).hwaccel_context = hwaccel_context
      (!____ptr).hw_frames_ctx = hw_frames_ctx
      (!____ptr).hw_device_ctx = hw_device_ctx
      (!____ptr).hwaccel_flags = hwaccel_flags
      (!____ptr).extra_hw_frames = extra_hw_frames
      (!____ptr).error = error
      (!____ptr).dct_algo = dct_algo
      (!____ptr).idct_algo = idct_algo
      (!____ptr).bits_per_coded_sample = bits_per_coded_sample
      (!____ptr).bits_per_raw_sample = bits_per_raw_sample
      (!____ptr).thread_count = thread_count
      (!____ptr).thread_type = thread_type
      (!____ptr).active_thread_type = active_thread_type
      (!____ptr).execute = execute
      (!____ptr).execute2 = execute2
      (!____ptr).profile = profile
      (!____ptr).level = level
      (!____ptr).properties = properties
      (!____ptr).skip_loop_filter = skip_loop_filter
      (!____ptr).skip_idct = skip_idct
      (!____ptr).skip_frame = skip_frame
      (!____ptr).skip_alpha = skip_alpha
      (!____ptr).skip_top = skip_top
      (!____ptr).skip_bottom = skip_bottom
      (!____ptr).lowres = lowres
      (!____ptr).codec_descriptor = codec_descriptor
      (!____ptr).sub_charenc = sub_charenc
      (!____ptr).sub_charenc_mode = sub_charenc_mode
      (!____ptr).subtitle_header_size = subtitle_header_size
      (!____ptr).subtitle_header = subtitle_header
      (!____ptr).dump_separator = dump_separator
      (!____ptr).codec_whitelist = codec_whitelist
      (!____ptr).coded_side_data = coded_side_data
      (!____ptr).nb_coded_side_data = nb_coded_side_data
      (!____ptr).export_side_data = export_side_data
      (!____ptr).max_pixels = max_pixels
      (!____ptr).apply_cropping = apply_cropping
      (!____ptr).discard_damaged_percentage = discard_damaged_percentage
      (!____ptr).max_samples = max_samples
      (!____ptr).get_encode_buffer = get_encode_buffer
      (!____ptr).frame_num = frame_num
      (!____ptr).side_data_prefer_packet = side_data_prefer_packet
      (!____ptr).nb_side_data_prefer_packet = nb_side_data_prefer_packet
      (!____ptr).decoded_side_data = decoded_side_data
      (!____ptr).nb_decoded_side_data = nb_decoded_side_data
      ____ptr
    end apply

    extension (struct: AVCodecContext)
      def av_class: Ptr[AVClass] =
        !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[AVClass]]]
      def av_class_=(value: Ptr[AVClass]): Unit =
        !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[AVClass]]] = value
      def log_level_offset: CInt =
        !struct.at(offsets(1)).asInstanceOf[Ptr[CInt]]
      def log_level_offset_=(value: CInt): Unit =
        !struct.at(offsets(1)).asInstanceOf[Ptr[CInt]] = value
      def codec_type: AVMediaType =
        !struct.at(offsets(2)).asInstanceOf[Ptr[AVMediaType]]
      def codec_type_=(value: AVMediaType): Unit =
        !struct.at(offsets(2)).asInstanceOf[Ptr[AVMediaType]] = value
      def codec: Ptr[AVCodec] =
        !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[AVCodec]]]
      def codec_=(value: Ptr[AVCodec]): Unit =
        !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[AVCodec]]] = value
      def codec_id: AVCodecID =
        !struct.at(offsets(4)).asInstanceOf[Ptr[AVCodecID]]
      def codec_id_=(value: AVCodecID): Unit =
        !struct.at(offsets(4)).asInstanceOf[Ptr[AVCodecID]] = value
      def codec_tag: CUnsignedInt =
        !struct.at(offsets(5)).asInstanceOf[Ptr[CUnsignedInt]]
      def codec_tag_=(value: CUnsignedInt): Unit =
        !struct.at(offsets(5)).asInstanceOf[Ptr[CUnsignedInt]] = value
      def priv_data: Ptr[Byte] =
        !struct.at(offsets(6)).asInstanceOf[Ptr[Ptr[Byte]]]
      def priv_data_=(value: Ptr[Byte]): Unit =
        !struct.at(offsets(6)).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def internal: Ptr[AVCodecInternal] =
        !struct.at(offsets(7)).asInstanceOf[Ptr[Ptr[AVCodecInternal]]]
      def internal_=(value: Ptr[AVCodecInternal]): Unit =
        !struct.at(offsets(7)).asInstanceOf[Ptr[Ptr[AVCodecInternal]]] = value
      def opaque: Ptr[Byte] =
        !struct.at(offsets(8)).asInstanceOf[Ptr[Ptr[Byte]]]
      def opaque_=(value: Ptr[Byte]): Unit =
        !struct.at(offsets(8)).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def bit_rate: int64_t = !struct.at(offsets(9)).asInstanceOf[Ptr[int64_t]]
      def bit_rate_=(value: int64_t): Unit =
        !struct.at(offsets(9)).asInstanceOf[Ptr[int64_t]] = value
      def flags: CInt = !struct.at(offsets(10)).asInstanceOf[Ptr[CInt]]
      def flags_=(value: CInt): Unit =
        !struct.at(offsets(10)).asInstanceOf[Ptr[CInt]] = value
      def flags2: CInt = !struct.at(offsets(11)).asInstanceOf[Ptr[CInt]]
      def flags2_=(value: CInt): Unit =
        !struct.at(offsets(11)).asInstanceOf[Ptr[CInt]] = value
      def extradata: Ptr[uint8_t] =
        !struct.at(offsets(12)).asInstanceOf[Ptr[Ptr[uint8_t]]]
      def extradata_=(value: Ptr[uint8_t]): Unit =
        !struct.at(offsets(12)).asInstanceOf[Ptr[Ptr[uint8_t]]] = value
      def extradata_size: CInt = !struct.at(offsets(13)).asInstanceOf[Ptr[CInt]]
      def extradata_size_=(value: CInt): Unit =
        !struct.at(offsets(13)).asInstanceOf[Ptr[CInt]] = value
      def time_base: AVRational =
        !struct.at(offsets(14)).asInstanceOf[Ptr[AVRational]]
      def time_base_=(value: AVRational): Unit =
        !struct.at(offsets(14)).asInstanceOf[Ptr[AVRational]] = value
      def pkt_timebase: AVRational =
        !struct.at(offsets(15)).asInstanceOf[Ptr[AVRational]]
      def pkt_timebase_=(value: AVRational): Unit =
        !struct.at(offsets(15)).asInstanceOf[Ptr[AVRational]] = value
      def framerate: AVRational =
        !struct.at(offsets(16)).asInstanceOf[Ptr[AVRational]]
      def framerate_=(value: AVRational): Unit =
        !struct.at(offsets(16)).asInstanceOf[Ptr[AVRational]] = value
      def ticks_per_frame: CInt =
        !struct.at(offsets(17)).asInstanceOf[Ptr[CInt]]
      def ticks_per_frame_=(value: CInt): Unit =
        !struct.at(offsets(17)).asInstanceOf[Ptr[CInt]] = value
      def delay: CInt = !struct.at(offsets(18)).asInstanceOf[Ptr[CInt]]
      def delay_=(value: CInt): Unit =
        !struct.at(offsets(18)).asInstanceOf[Ptr[CInt]] = value
      def width: CInt = !struct.at(offsets(19)).asInstanceOf[Ptr[CInt]]
      def width_=(value: CInt): Unit =
        !struct.at(offsets(19)).asInstanceOf[Ptr[CInt]] = value
      def height: CInt = !struct.at(offsets(20)).asInstanceOf[Ptr[CInt]]
      def height_=(value: CInt): Unit =
        !struct.at(offsets(20)).asInstanceOf[Ptr[CInt]] = value
      def coded_width: CInt = !struct.at(offsets(21)).asInstanceOf[Ptr[CInt]]
      def coded_width_=(value: CInt): Unit =
        !struct.at(offsets(21)).asInstanceOf[Ptr[CInt]] = value
      def coded_height: CInt = !struct.at(offsets(22)).asInstanceOf[Ptr[CInt]]
      def coded_height_=(value: CInt): Unit =
        !struct.at(offsets(22)).asInstanceOf[Ptr[CInt]] = value
      def sample_aspect_ratio: AVRational =
        !struct.at(offsets(23)).asInstanceOf[Ptr[AVRational]]
      def sample_aspect_ratio_=(value: AVRational): Unit =
        !struct.at(offsets(23)).asInstanceOf[Ptr[AVRational]] = value
      def pix_fmt: AVPixelFormat =
        !struct.at(offsets(24)).asInstanceOf[Ptr[AVPixelFormat]]
      def pix_fmt_=(value: AVPixelFormat): Unit =
        !struct.at(offsets(24)).asInstanceOf[Ptr[AVPixelFormat]] = value
      def sw_pix_fmt: AVPixelFormat =
        !struct.at(offsets(25)).asInstanceOf[Ptr[AVPixelFormat]]
      def sw_pix_fmt_=(value: AVPixelFormat): Unit =
        !struct.at(offsets(25)).asInstanceOf[Ptr[AVPixelFormat]] = value
      def color_primaries: AVColorPrimaries =
        !struct.at(offsets(26)).asInstanceOf[Ptr[AVColorPrimaries]]
      def color_primaries_=(value: AVColorPrimaries): Unit =
        !struct.at(offsets(26)).asInstanceOf[Ptr[AVColorPrimaries]] = value
      def color_trc: AVColorTransferCharacteristic =
        !struct.at(offsets(27)).asInstanceOf[Ptr[AVColorTransferCharacteristic]]
      def color_trc_=(value: AVColorTransferCharacteristic): Unit = !struct
        .at(offsets(27))
        .asInstanceOf[Ptr[AVColorTransferCharacteristic]] = value
      def colorspace: AVColorSpace =
        !struct.at(offsets(28)).asInstanceOf[Ptr[AVColorSpace]]
      def colorspace_=(value: AVColorSpace): Unit =
        !struct.at(offsets(28)).asInstanceOf[Ptr[AVColorSpace]] = value
      def color_range: AVColorRange =
        !struct.at(offsets(29)).asInstanceOf[Ptr[AVColorRange]]
      def color_range_=(value: AVColorRange): Unit =
        !struct.at(offsets(29)).asInstanceOf[Ptr[AVColorRange]] = value
      def chroma_sample_location: AVChromaLocation =
        !struct.at(offsets(30)).asInstanceOf[Ptr[AVChromaLocation]]
      def chroma_sample_location_=(value: AVChromaLocation): Unit =
        !struct.at(offsets(30)).asInstanceOf[Ptr[AVChromaLocation]] = value
      def field_order: AVFieldOrder =
        !struct.at(offsets(31)).asInstanceOf[Ptr[AVFieldOrder]]
      def field_order_=(value: AVFieldOrder): Unit =
        !struct.at(offsets(31)).asInstanceOf[Ptr[AVFieldOrder]] = value
      def refs: CInt = !struct.at(offsets(32)).asInstanceOf[Ptr[CInt]]
      def refs_=(value: CInt): Unit =
        !struct.at(offsets(32)).asInstanceOf[Ptr[CInt]] = value
      def has_b_frames: CInt = !struct.at(offsets(33)).asInstanceOf[Ptr[CInt]]
      def has_b_frames_=(value: CInt): Unit =
        !struct.at(offsets(33)).asInstanceOf[Ptr[CInt]] = value
      def slice_flags: CInt = !struct.at(offsets(34)).asInstanceOf[Ptr[CInt]]
      def slice_flags_=(value: CInt): Unit =
        !struct.at(offsets(34)).asInstanceOf[Ptr[CInt]] = value
      def draw_horiz_band: CFuncPtr6[Ptr[AVCodecContext], Ptr[AVFrame], CArray[
        CInt,
        Nat._8
      ], CInt, CInt, CInt, Unit] = !struct
        .at(offsets(35))
        .asInstanceOf[Ptr[CFuncPtr6[
          Ptr[AVCodecContext],
          Ptr[AVFrame],
          CArray[CInt, Nat._8],
          CInt,
          CInt,
          CInt,
          Unit
        ]]]
      def draw_horiz_band_=(
          value: CFuncPtr6[
            Ptr[AVCodecContext],
            Ptr[AVFrame],
            CArray[CInt, Nat._8],
            CInt,
            CInt,
            CInt,
            Unit
          ]
      ): Unit = !struct
        .at(offsets(35))
        .asInstanceOf[Ptr[CFuncPtr6[
          Ptr[AVCodecContext],
          Ptr[AVFrame],
          CArray[CInt, Nat._8],
          CInt,
          CInt,
          CInt,
          Unit
        ]]] = value
      def get_format
          : CFuncPtr2[Ptr[AVCodecContext], Ptr[AVPixelFormat], AVPixelFormat] =
        !struct
          .at(offsets(36))
          .asInstanceOf[Ptr[
            CFuncPtr2[Ptr[AVCodecContext], Ptr[AVPixelFormat], AVPixelFormat]
          ]]
      def get_format_=(
          value: CFuncPtr2[Ptr[AVCodecContext], Ptr[
            AVPixelFormat
          ], AVPixelFormat]
      ): Unit = !struct
        .at(offsets(36))
        .asInstanceOf[Ptr[
          CFuncPtr2[Ptr[AVCodecContext], Ptr[AVPixelFormat], AVPixelFormat]
        ]] = value
      def max_b_frames: CInt = !struct.at(offsets(37)).asInstanceOf[Ptr[CInt]]
      def max_b_frames_=(value: CInt): Unit =
        !struct.at(offsets(37)).asInstanceOf[Ptr[CInt]] = value
      def b_quant_factor: Float =
        !struct.at(offsets(38)).asInstanceOf[Ptr[Float]]
      def b_quant_factor_=(value: Float): Unit =
        !struct.at(offsets(38)).asInstanceOf[Ptr[Float]] = value
      def b_quant_offset: Float =
        !struct.at(offsets(39)).asInstanceOf[Ptr[Float]]
      def b_quant_offset_=(value: Float): Unit =
        !struct.at(offsets(39)).asInstanceOf[Ptr[Float]] = value
      def i_quant_factor: Float =
        !struct.at(offsets(40)).asInstanceOf[Ptr[Float]]
      def i_quant_factor_=(value: Float): Unit =
        !struct.at(offsets(40)).asInstanceOf[Ptr[Float]] = value
      def i_quant_offset: Float =
        !struct.at(offsets(41)).asInstanceOf[Ptr[Float]]
      def i_quant_offset_=(value: Float): Unit =
        !struct.at(offsets(41)).asInstanceOf[Ptr[Float]] = value
      def lumi_masking: Float = !struct.at(offsets(42)).asInstanceOf[Ptr[Float]]
      def lumi_masking_=(value: Float): Unit =
        !struct.at(offsets(42)).asInstanceOf[Ptr[Float]] = value
      def temporal_cplx_masking: Float =
        !struct.at(offsets(43)).asInstanceOf[Ptr[Float]]
      def temporal_cplx_masking_=(value: Float): Unit =
        !struct.at(offsets(43)).asInstanceOf[Ptr[Float]] = value
      def spatial_cplx_masking: Float =
        !struct.at(offsets(44)).asInstanceOf[Ptr[Float]]
      def spatial_cplx_masking_=(value: Float): Unit =
        !struct.at(offsets(44)).asInstanceOf[Ptr[Float]] = value
      def p_masking: Float = !struct.at(offsets(45)).asInstanceOf[Ptr[Float]]
      def p_masking_=(value: Float): Unit =
        !struct.at(offsets(45)).asInstanceOf[Ptr[Float]] = value
      def dark_masking: Float = !struct.at(offsets(46)).asInstanceOf[Ptr[Float]]
      def dark_masking_=(value: Float): Unit =
        !struct.at(offsets(46)).asInstanceOf[Ptr[Float]] = value
      def nsse_weight: CInt = !struct.at(offsets(47)).asInstanceOf[Ptr[CInt]]
      def nsse_weight_=(value: CInt): Unit =
        !struct.at(offsets(47)).asInstanceOf[Ptr[CInt]] = value
      def me_cmp: CInt = !struct.at(offsets(48)).asInstanceOf[Ptr[CInt]]
      def me_cmp_=(value: CInt): Unit =
        !struct.at(offsets(48)).asInstanceOf[Ptr[CInt]] = value
      def me_sub_cmp: CInt = !struct.at(offsets(49)).asInstanceOf[Ptr[CInt]]
      def me_sub_cmp_=(value: CInt): Unit =
        !struct.at(offsets(49)).asInstanceOf[Ptr[CInt]] = value
      def mb_cmp: CInt = !struct.at(offsets(50)).asInstanceOf[Ptr[CInt]]
      def mb_cmp_=(value: CInt): Unit =
        !struct.at(offsets(50)).asInstanceOf[Ptr[CInt]] = value
      def ildct_cmp: CInt = !struct.at(offsets(51)).asInstanceOf[Ptr[CInt]]
      def ildct_cmp_=(value: CInt): Unit =
        !struct.at(offsets(51)).asInstanceOf[Ptr[CInt]] = value
      def dia_size: CInt = !struct.at(offsets(52)).asInstanceOf[Ptr[CInt]]
      def dia_size_=(value: CInt): Unit =
        !struct.at(offsets(52)).asInstanceOf[Ptr[CInt]] = value
      def last_predictor_count: CInt =
        !struct.at(offsets(53)).asInstanceOf[Ptr[CInt]]
      def last_predictor_count_=(value: CInt): Unit =
        !struct.at(offsets(53)).asInstanceOf[Ptr[CInt]] = value
      def me_pre_cmp: CInt = !struct.at(offsets(54)).asInstanceOf[Ptr[CInt]]
      def me_pre_cmp_=(value: CInt): Unit =
        !struct.at(offsets(54)).asInstanceOf[Ptr[CInt]] = value
      def pre_dia_size: CInt = !struct.at(offsets(55)).asInstanceOf[Ptr[CInt]]
      def pre_dia_size_=(value: CInt): Unit =
        !struct.at(offsets(55)).asInstanceOf[Ptr[CInt]] = value
      def me_subpel_quality: CInt =
        !struct.at(offsets(56)).asInstanceOf[Ptr[CInt]]
      def me_subpel_quality_=(value: CInt): Unit =
        !struct.at(offsets(56)).asInstanceOf[Ptr[CInt]] = value
      def me_range: CInt = !struct.at(offsets(57)).asInstanceOf[Ptr[CInt]]
      def me_range_=(value: CInt): Unit =
        !struct.at(offsets(57)).asInstanceOf[Ptr[CInt]] = value
      def mb_decision: CInt = !struct.at(offsets(58)).asInstanceOf[Ptr[CInt]]
      def mb_decision_=(value: CInt): Unit =
        !struct.at(offsets(58)).asInstanceOf[Ptr[CInt]] = value
      def intra_matrix: Ptr[uint16_t] =
        !struct.at(offsets(59)).asInstanceOf[Ptr[Ptr[uint16_t]]]
      def intra_matrix_=(value: Ptr[uint16_t]): Unit =
        !struct.at(offsets(59)).asInstanceOf[Ptr[Ptr[uint16_t]]] = value
      def inter_matrix: Ptr[uint16_t] =
        !struct.at(offsets(60)).asInstanceOf[Ptr[Ptr[uint16_t]]]
      def inter_matrix_=(value: Ptr[uint16_t]): Unit =
        !struct.at(offsets(60)).asInstanceOf[Ptr[Ptr[uint16_t]]] = value
      def chroma_intra_matrix: Ptr[uint16_t] =
        !struct.at(offsets(61)).asInstanceOf[Ptr[Ptr[uint16_t]]]
      def chroma_intra_matrix_=(value: Ptr[uint16_t]): Unit =
        !struct.at(offsets(61)).asInstanceOf[Ptr[Ptr[uint16_t]]] = value
      def intra_dc_precision: CInt =
        !struct.at(offsets(62)).asInstanceOf[Ptr[CInt]]
      def intra_dc_precision_=(value: CInt): Unit =
        !struct.at(offsets(62)).asInstanceOf[Ptr[CInt]] = value
      def mb_lmin: CInt = !struct.at(offsets(63)).asInstanceOf[Ptr[CInt]]
      def mb_lmin_=(value: CInt): Unit =
        !struct.at(offsets(63)).asInstanceOf[Ptr[CInt]] = value
      def mb_lmax: CInt = !struct.at(offsets(64)).asInstanceOf[Ptr[CInt]]
      def mb_lmax_=(value: CInt): Unit =
        !struct.at(offsets(64)).asInstanceOf[Ptr[CInt]] = value
      def bidir_refine: CInt = !struct.at(offsets(65)).asInstanceOf[Ptr[CInt]]
      def bidir_refine_=(value: CInt): Unit =
        !struct.at(offsets(65)).asInstanceOf[Ptr[CInt]] = value
      def keyint_min: CInt = !struct.at(offsets(66)).asInstanceOf[Ptr[CInt]]
      def keyint_min_=(value: CInt): Unit =
        !struct.at(offsets(66)).asInstanceOf[Ptr[CInt]] = value
      def gop_size: CInt = !struct.at(offsets(67)).asInstanceOf[Ptr[CInt]]
      def gop_size_=(value: CInt): Unit =
        !struct.at(offsets(67)).asInstanceOf[Ptr[CInt]] = value
      def mv0_threshold: CInt = !struct.at(offsets(68)).asInstanceOf[Ptr[CInt]]
      def mv0_threshold_=(value: CInt): Unit =
        !struct.at(offsets(68)).asInstanceOf[Ptr[CInt]] = value
      def slices: CInt = !struct.at(offsets(69)).asInstanceOf[Ptr[CInt]]
      def slices_=(value: CInt): Unit =
        !struct.at(offsets(69)).asInstanceOf[Ptr[CInt]] = value
      def sample_rate: CInt = !struct.at(offsets(70)).asInstanceOf[Ptr[CInt]]
      def sample_rate_=(value: CInt): Unit =
        !struct.at(offsets(70)).asInstanceOf[Ptr[CInt]] = value
      def sample_fmt: AVSampleFormat =
        !struct.at(offsets(71)).asInstanceOf[Ptr[AVSampleFormat]]
      def sample_fmt_=(value: AVSampleFormat): Unit =
        !struct.at(offsets(71)).asInstanceOf[Ptr[AVSampleFormat]] = value
      def ch_layout: AVChannelLayout =
        !struct.at(offsets(72)).asInstanceOf[Ptr[AVChannelLayout]]
      def ch_layout_=(value: AVChannelLayout): Unit =
        !struct.at(offsets(72)).asInstanceOf[Ptr[AVChannelLayout]] = value
      def frame_size: CInt = !struct.at(offsets(73)).asInstanceOf[Ptr[CInt]]
      def frame_size_=(value: CInt): Unit =
        !struct.at(offsets(73)).asInstanceOf[Ptr[CInt]] = value
      def block_align: CInt = !struct.at(offsets(74)).asInstanceOf[Ptr[CInt]]
      def block_align_=(value: CInt): Unit =
        !struct.at(offsets(74)).asInstanceOf[Ptr[CInt]] = value
      def cutoff: CInt = !struct.at(offsets(75)).asInstanceOf[Ptr[CInt]]
      def cutoff_=(value: CInt): Unit =
        !struct.at(offsets(75)).asInstanceOf[Ptr[CInt]] = value
      def audio_service_type: AVAudioServiceType =
        !struct.at(offsets(76)).asInstanceOf[Ptr[AVAudioServiceType]]
      def audio_service_type_=(value: AVAudioServiceType): Unit =
        !struct.at(offsets(76)).asInstanceOf[Ptr[AVAudioServiceType]] = value
      def request_sample_fmt: AVSampleFormat =
        !struct.at(offsets(77)).asInstanceOf[Ptr[AVSampleFormat]]
      def request_sample_fmt_=(value: AVSampleFormat): Unit =
        !struct.at(offsets(77)).asInstanceOf[Ptr[AVSampleFormat]] = value
      def initial_padding: CInt =
        !struct.at(offsets(78)).asInstanceOf[Ptr[CInt]]
      def initial_padding_=(value: CInt): Unit =
        !struct.at(offsets(78)).asInstanceOf[Ptr[CInt]] = value
      def trailing_padding: CInt =
        !struct.at(offsets(79)).asInstanceOf[Ptr[CInt]]
      def trailing_padding_=(value: CInt): Unit =
        !struct.at(offsets(79)).asInstanceOf[Ptr[CInt]] = value
      def seek_preroll: CInt = !struct.at(offsets(80)).asInstanceOf[Ptr[CInt]]
      def seek_preroll_=(value: CInt): Unit =
        !struct.at(offsets(80)).asInstanceOf[Ptr[CInt]] = value
      def get_buffer2
          : CFuncPtr3[Ptr[AVCodecContext], Ptr[AVFrame], CInt, CInt] = !struct
        .at(offsets(81))
        .asInstanceOf[Ptr[
          CFuncPtr3[Ptr[AVCodecContext], Ptr[AVFrame], CInt, CInt]
        ]]
      def get_buffer2_=(
          value: CFuncPtr3[Ptr[AVCodecContext], Ptr[AVFrame], CInt, CInt]
      ): Unit = !struct
        .at(offsets(81))
        .asInstanceOf[Ptr[
          CFuncPtr3[Ptr[AVCodecContext], Ptr[AVFrame], CInt, CInt]
        ]] = value
      def bit_rate_tolerance: CInt =
        !struct.at(offsets(82)).asInstanceOf[Ptr[CInt]]
      def bit_rate_tolerance_=(value: CInt): Unit =
        !struct.at(offsets(82)).asInstanceOf[Ptr[CInt]] = value
      def global_quality: CInt = !struct.at(offsets(83)).asInstanceOf[Ptr[CInt]]
      def global_quality_=(value: CInt): Unit =
        !struct.at(offsets(83)).asInstanceOf[Ptr[CInt]] = value
      def compression_level: CInt =
        !struct.at(offsets(84)).asInstanceOf[Ptr[CInt]]
      def compression_level_=(value: CInt): Unit =
        !struct.at(offsets(84)).asInstanceOf[Ptr[CInt]] = value
      def qcompress: Float = !struct.at(offsets(85)).asInstanceOf[Ptr[Float]]
      def qcompress_=(value: Float): Unit =
        !struct.at(offsets(85)).asInstanceOf[Ptr[Float]] = value
      def qblur: Float = !struct.at(offsets(86)).asInstanceOf[Ptr[Float]]
      def qblur_=(value: Float): Unit =
        !struct.at(offsets(86)).asInstanceOf[Ptr[Float]] = value
      def qmin: CInt = !struct.at(offsets(87)).asInstanceOf[Ptr[CInt]]
      def qmin_=(value: CInt): Unit =
        !struct.at(offsets(87)).asInstanceOf[Ptr[CInt]] = value
      def qmax: CInt = !struct.at(offsets(88)).asInstanceOf[Ptr[CInt]]
      def qmax_=(value: CInt): Unit =
        !struct.at(offsets(88)).asInstanceOf[Ptr[CInt]] = value
      def max_qdiff: CInt = !struct.at(offsets(89)).asInstanceOf[Ptr[CInt]]
      def max_qdiff_=(value: CInt): Unit =
        !struct.at(offsets(89)).asInstanceOf[Ptr[CInt]] = value
      def rc_buffer_size: CInt = !struct.at(offsets(90)).asInstanceOf[Ptr[CInt]]
      def rc_buffer_size_=(value: CInt): Unit =
        !struct.at(offsets(90)).asInstanceOf[Ptr[CInt]] = value
      def rc_override_count: CInt =
        !struct.at(offsets(91)).asInstanceOf[Ptr[CInt]]
      def rc_override_count_=(value: CInt): Unit =
        !struct.at(offsets(91)).asInstanceOf[Ptr[CInt]] = value
      def rc_override: Ptr[RcOverride] =
        !struct.at(offsets(92)).asInstanceOf[Ptr[Ptr[RcOverride]]]
      def rc_override_=(value: Ptr[RcOverride]): Unit =
        !struct.at(offsets(92)).asInstanceOf[Ptr[Ptr[RcOverride]]] = value
      def rc_max_rate: int64_t =
        !struct.at(offsets(93)).asInstanceOf[Ptr[int64_t]]
      def rc_max_rate_=(value: int64_t): Unit =
        !struct.at(offsets(93)).asInstanceOf[Ptr[int64_t]] = value
      def rc_min_rate: int64_t =
        !struct.at(offsets(94)).asInstanceOf[Ptr[int64_t]]
      def rc_min_rate_=(value: int64_t): Unit =
        !struct.at(offsets(94)).asInstanceOf[Ptr[int64_t]] = value
      def rc_max_available_vbv_use: Float =
        !struct.at(offsets(95)).asInstanceOf[Ptr[Float]]
      def rc_max_available_vbv_use_=(value: Float): Unit =
        !struct.at(offsets(95)).asInstanceOf[Ptr[Float]] = value
      def rc_min_vbv_overflow_use: Float =
        !struct.at(offsets(96)).asInstanceOf[Ptr[Float]]
      def rc_min_vbv_overflow_use_=(value: Float): Unit =
        !struct.at(offsets(96)).asInstanceOf[Ptr[Float]] = value
      def rc_initial_buffer_occupancy: CInt =
        !struct.at(offsets(97)).asInstanceOf[Ptr[CInt]]
      def rc_initial_buffer_occupancy_=(value: CInt): Unit =
        !struct.at(offsets(97)).asInstanceOf[Ptr[CInt]] = value
      def trellis: CInt = !struct.at(offsets(98)).asInstanceOf[Ptr[CInt]]
      def trellis_=(value: CInt): Unit =
        !struct.at(offsets(98)).asInstanceOf[Ptr[CInt]] = value
      def stats_out: CString =
        !struct.at(offsets(99)).asInstanceOf[Ptr[CString]]
      def stats_out_=(value: CString): Unit =
        !struct.at(offsets(99)).asInstanceOf[Ptr[CString]] = value
      def stats_in: CString =
        !struct.at(offsets(100)).asInstanceOf[Ptr[CString]]
      def stats_in_=(value: CString): Unit =
        !struct.at(offsets(100)).asInstanceOf[Ptr[CString]] = value
      def workaround_bugs: CInt =
        !struct.at(offsets(101)).asInstanceOf[Ptr[CInt]]
      def workaround_bugs_=(value: CInt): Unit =
        !struct.at(offsets(101)).asInstanceOf[Ptr[CInt]] = value
      def strict_std_compliance: CInt =
        !struct.at(offsets(102)).asInstanceOf[Ptr[CInt]]
      def strict_std_compliance_=(value: CInt): Unit =
        !struct.at(offsets(102)).asInstanceOf[Ptr[CInt]] = value
      def error_concealment: CInt =
        !struct.at(offsets(103)).asInstanceOf[Ptr[CInt]]
      def error_concealment_=(value: CInt): Unit =
        !struct.at(offsets(103)).asInstanceOf[Ptr[CInt]] = value
      def debug: CInt = !struct.at(offsets(104)).asInstanceOf[Ptr[CInt]]
      def debug_=(value: CInt): Unit =
        !struct.at(offsets(104)).asInstanceOf[Ptr[CInt]] = value
      def err_recognition: CInt =
        !struct.at(offsets(105)).asInstanceOf[Ptr[CInt]]
      def err_recognition_=(value: CInt): Unit =
        !struct.at(offsets(105)).asInstanceOf[Ptr[CInt]] = value
      def hwaccel: Ptr[AVHWAccel] =
        !struct.at(offsets(106)).asInstanceOf[Ptr[Ptr[AVHWAccel]]]
      def hwaccel_=(value: Ptr[AVHWAccel]): Unit =
        !struct.at(offsets(106)).asInstanceOf[Ptr[Ptr[AVHWAccel]]] = value
      def hwaccel_context: Ptr[Byte] =
        !struct.at(offsets(107)).asInstanceOf[Ptr[Ptr[Byte]]]
      def hwaccel_context_=(value: Ptr[Byte]): Unit =
        !struct.at(offsets(107)).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def hw_frames_ctx: Ptr[AVBufferRef] =
        !struct.at(offsets(108)).asInstanceOf[Ptr[Ptr[AVBufferRef]]]
      def hw_frames_ctx_=(value: Ptr[AVBufferRef]): Unit =
        !struct.at(offsets(108)).asInstanceOf[Ptr[Ptr[AVBufferRef]]] = value
      def hw_device_ctx: Ptr[AVBufferRef] =
        !struct.at(offsets(109)).asInstanceOf[Ptr[Ptr[AVBufferRef]]]
      def hw_device_ctx_=(value: Ptr[AVBufferRef]): Unit =
        !struct.at(offsets(109)).asInstanceOf[Ptr[Ptr[AVBufferRef]]] = value
      def hwaccel_flags: CInt = !struct.at(offsets(110)).asInstanceOf[Ptr[CInt]]
      def hwaccel_flags_=(value: CInt): Unit =
        !struct.at(offsets(110)).asInstanceOf[Ptr[CInt]] = value
      def extra_hw_frames: CInt =
        !struct.at(offsets(111)).asInstanceOf[Ptr[CInt]]
      def extra_hw_frames_=(value: CInt): Unit =
        !struct.at(offsets(111)).asInstanceOf[Ptr[CInt]] = value
      def error: CArray[uint64_t, Nat._8] =
        !struct.at(offsets(112)).asInstanceOf[Ptr[CArray[uint64_t, Nat._8]]]
      def error_=(value: CArray[uint64_t, Nat._8]): Unit =
        !struct.at(offsets(112)).asInstanceOf[Ptr[CArray[uint64_t, Nat._8]]] =
          value
      def dct_algo: CInt = !struct.at(offsets(113)).asInstanceOf[Ptr[CInt]]
      def dct_algo_=(value: CInt): Unit =
        !struct.at(offsets(113)).asInstanceOf[Ptr[CInt]] = value
      def idct_algo: CInt = !struct.at(offsets(114)).asInstanceOf[Ptr[CInt]]
      def idct_algo_=(value: CInt): Unit =
        !struct.at(offsets(114)).asInstanceOf[Ptr[CInt]] = value
      def bits_per_coded_sample: CInt =
        !struct.at(offsets(115)).asInstanceOf[Ptr[CInt]]
      def bits_per_coded_sample_=(value: CInt): Unit =
        !struct.at(offsets(115)).asInstanceOf[Ptr[CInt]] = value
      def bits_per_raw_sample: CInt =
        !struct.at(offsets(116)).asInstanceOf[Ptr[CInt]]
      def bits_per_raw_sample_=(value: CInt): Unit =
        !struct.at(offsets(116)).asInstanceOf[Ptr[CInt]] = value
      def thread_count: CInt = !struct.at(offsets(117)).asInstanceOf[Ptr[CInt]]
      def thread_count_=(value: CInt): Unit =
        !struct.at(offsets(117)).asInstanceOf[Ptr[CInt]] = value
      def thread_type: CInt = !struct.at(offsets(118)).asInstanceOf[Ptr[CInt]]
      def thread_type_=(value: CInt): Unit =
        !struct.at(offsets(118)).asInstanceOf[Ptr[CInt]] = value
      def active_thread_type: CInt =
        !struct.at(offsets(119)).asInstanceOf[Ptr[CInt]]
      def active_thread_type_=(value: CInt): Unit =
        !struct.at(offsets(119)).asInstanceOf[Ptr[CInt]] = value
      def execute: CFuncPtr6[Ptr[AVCodecContext], CFuncPtr2[Ptr[
        AVCodecContext
      ], Ptr[Byte], CInt], Ptr[Byte], Ptr[CInt], CInt, CInt, CInt] = !struct
        .at(offsets(120))
        .asInstanceOf[Ptr[CFuncPtr6[Ptr[AVCodecContext], CFuncPtr2[Ptr[
          AVCodecContext
        ], Ptr[Byte], CInt], Ptr[Byte], Ptr[CInt], CInt, CInt, CInt]]]
      def execute_=(
          value: CFuncPtr6[Ptr[AVCodecContext], CFuncPtr2[Ptr[
            AVCodecContext
          ], Ptr[Byte], CInt], Ptr[Byte], Ptr[CInt], CInt, CInt, CInt]
      ): Unit = !struct
        .at(offsets(120))
        .asInstanceOf[Ptr[CFuncPtr6[Ptr[AVCodecContext], CFuncPtr2[Ptr[
          AVCodecContext
        ], Ptr[Byte], CInt], Ptr[Byte], Ptr[CInt], CInt, CInt, CInt]]] = value
      def execute2: CFuncPtr5[Ptr[AVCodecContext], CFuncPtr4[Ptr[
        AVCodecContext
      ], Ptr[Byte], CInt, CInt, CInt], Ptr[Byte], Ptr[CInt], CInt, CInt] =
        !struct
          .at(offsets(121))
          .asInstanceOf[Ptr[CFuncPtr5[Ptr[AVCodecContext], CFuncPtr4[Ptr[
            AVCodecContext
          ], Ptr[Byte], CInt, CInt, CInt], Ptr[Byte], Ptr[CInt], CInt, CInt]]]
      def execute2_=(
          value: CFuncPtr5[Ptr[AVCodecContext], CFuncPtr4[Ptr[
            AVCodecContext
          ], Ptr[Byte], CInt, CInt, CInt], Ptr[Byte], Ptr[CInt], CInt, CInt]
      ): Unit = !struct
        .at(offsets(121))
        .asInstanceOf[Ptr[CFuncPtr5[Ptr[AVCodecContext], CFuncPtr4[Ptr[
          AVCodecContext
        ], Ptr[Byte], CInt, CInt, CInt], Ptr[Byte], Ptr[CInt], CInt, CInt]]] =
        value
      def profile: CInt = !struct.at(offsets(122)).asInstanceOf[Ptr[CInt]]
      def profile_=(value: CInt): Unit =
        !struct.at(offsets(122)).asInstanceOf[Ptr[CInt]] = value
      def level: CInt = !struct.at(offsets(123)).asInstanceOf[Ptr[CInt]]
      def level_=(value: CInt): Unit =
        !struct.at(offsets(123)).asInstanceOf[Ptr[CInt]] = value
      def properties: CUnsignedInt =
        !struct.at(offsets(124)).asInstanceOf[Ptr[CUnsignedInt]]
      def properties_=(value: CUnsignedInt): Unit =
        !struct.at(offsets(124)).asInstanceOf[Ptr[CUnsignedInt]] = value
      def skip_loop_filter: AVDiscard =
        !struct.at(offsets(125)).asInstanceOf[Ptr[AVDiscard]]
      def skip_loop_filter_=(value: AVDiscard): Unit =
        !struct.at(offsets(125)).asInstanceOf[Ptr[AVDiscard]] = value
      def skip_idct: AVDiscard =
        !struct.at(offsets(126)).asInstanceOf[Ptr[AVDiscard]]
      def skip_idct_=(value: AVDiscard): Unit =
        !struct.at(offsets(126)).asInstanceOf[Ptr[AVDiscard]] = value
      def skip_frame: AVDiscard =
        !struct.at(offsets(127)).asInstanceOf[Ptr[AVDiscard]]
      def skip_frame_=(value: AVDiscard): Unit =
        !struct.at(offsets(127)).asInstanceOf[Ptr[AVDiscard]] = value
      def skip_alpha: CInt = !struct.at(offsets(128)).asInstanceOf[Ptr[CInt]]
      def skip_alpha_=(value: CInt): Unit =
        !struct.at(offsets(128)).asInstanceOf[Ptr[CInt]] = value
      def skip_top: CInt = !struct.at(offsets(129)).asInstanceOf[Ptr[CInt]]
      def skip_top_=(value: CInt): Unit =
        !struct.at(offsets(129)).asInstanceOf[Ptr[CInt]] = value
      def skip_bottom: CInt = !struct.at(offsets(130)).asInstanceOf[Ptr[CInt]]
      def skip_bottom_=(value: CInt): Unit =
        !struct.at(offsets(130)).asInstanceOf[Ptr[CInt]] = value
      def lowres: CInt = !struct.at(offsets(131)).asInstanceOf[Ptr[CInt]]
      def lowres_=(value: CInt): Unit =
        !struct.at(offsets(131)).asInstanceOf[Ptr[CInt]] = value
      def codec_descriptor: Ptr[AVCodecDescriptor] =
        !struct.at(offsets(132)).asInstanceOf[Ptr[Ptr[AVCodecDescriptor]]]
      def codec_descriptor_=(value: Ptr[AVCodecDescriptor]): Unit =
        !struct.at(offsets(132)).asInstanceOf[Ptr[Ptr[AVCodecDescriptor]]] =
          value
      def sub_charenc: CString =
        !struct.at(offsets(133)).asInstanceOf[Ptr[CString]]
      def sub_charenc_=(value: CString): Unit =
        !struct.at(offsets(133)).asInstanceOf[Ptr[CString]] = value
      def sub_charenc_mode: CInt =
        !struct.at(offsets(134)).asInstanceOf[Ptr[CInt]]
      def sub_charenc_mode_=(value: CInt): Unit =
        !struct.at(offsets(134)).asInstanceOf[Ptr[CInt]] = value
      def subtitle_header_size: CInt =
        !struct.at(offsets(135)).asInstanceOf[Ptr[CInt]]
      def subtitle_header_size_=(value: CInt): Unit =
        !struct.at(offsets(135)).asInstanceOf[Ptr[CInt]] = value
      def subtitle_header: Ptr[uint8_t] =
        !struct.at(offsets(136)).asInstanceOf[Ptr[Ptr[uint8_t]]]
      def subtitle_header_=(value: Ptr[uint8_t]): Unit =
        !struct.at(offsets(136)).asInstanceOf[Ptr[Ptr[uint8_t]]] = value
      def dump_separator: Ptr[uint8_t] =
        !struct.at(offsets(137)).asInstanceOf[Ptr[Ptr[uint8_t]]]
      def dump_separator_=(value: Ptr[uint8_t]): Unit =
        !struct.at(offsets(137)).asInstanceOf[Ptr[Ptr[uint8_t]]] = value
      def codec_whitelist: CString =
        !struct.at(offsets(138)).asInstanceOf[Ptr[CString]]
      def codec_whitelist_=(value: CString): Unit =
        !struct.at(offsets(138)).asInstanceOf[Ptr[CString]] = value
      def coded_side_data: Ptr[AVPacketSideData] =
        !struct.at(offsets(139)).asInstanceOf[Ptr[Ptr[AVPacketSideData]]]
      def coded_side_data_=(value: Ptr[AVPacketSideData]): Unit =
        !struct.at(offsets(139)).asInstanceOf[Ptr[Ptr[AVPacketSideData]]] =
          value
      def nb_coded_side_data: CInt =
        !struct.at(offsets(140)).asInstanceOf[Ptr[CInt]]
      def nb_coded_side_data_=(value: CInt): Unit =
        !struct.at(offsets(140)).asInstanceOf[Ptr[CInt]] = value
      def export_side_data: CInt =
        !struct.at(offsets(141)).asInstanceOf[Ptr[CInt]]
      def export_side_data_=(value: CInt): Unit =
        !struct.at(offsets(141)).asInstanceOf[Ptr[CInt]] = value
      def max_pixels: int64_t =
        !struct.at(offsets(142)).asInstanceOf[Ptr[int64_t]]
      def max_pixels_=(value: int64_t): Unit =
        !struct.at(offsets(142)).asInstanceOf[Ptr[int64_t]] = value
      def apply_cropping: CInt =
        !struct.at(offsets(143)).asInstanceOf[Ptr[CInt]]
      def apply_cropping_=(value: CInt): Unit =
        !struct.at(offsets(143)).asInstanceOf[Ptr[CInt]] = value
      def discard_damaged_percentage: CInt =
        !struct.at(offsets(144)).asInstanceOf[Ptr[CInt]]
      def discard_damaged_percentage_=(value: CInt): Unit =
        !struct.at(offsets(144)).asInstanceOf[Ptr[CInt]] = value
      def max_samples: int64_t =
        !struct.at(offsets(145)).asInstanceOf[Ptr[int64_t]]
      def max_samples_=(value: int64_t): Unit =
        !struct.at(offsets(145)).asInstanceOf[Ptr[int64_t]] = value
      def get_encode_buffer
          : CFuncPtr3[Ptr[AVCodecContext], Ptr[AVPacket], CInt, CInt] = !struct
        .at(offsets(146))
        .asInstanceOf[Ptr[
          CFuncPtr3[Ptr[AVCodecContext], Ptr[AVPacket], CInt, CInt]
        ]]
      def get_encode_buffer_=(
          value: CFuncPtr3[Ptr[AVCodecContext], Ptr[AVPacket], CInt, CInt]
      ): Unit = !struct
        .at(offsets(146))
        .asInstanceOf[Ptr[
          CFuncPtr3[Ptr[AVCodecContext], Ptr[AVPacket], CInt, CInt]
        ]] = value
      def frame_num: int64_t =
        !struct.at(offsets(147)).asInstanceOf[Ptr[int64_t]]
      def frame_num_=(value: int64_t): Unit =
        !struct.at(offsets(147)).asInstanceOf[Ptr[int64_t]] = value
      def side_data_prefer_packet: Ptr[CInt] =
        !struct.at(offsets(148)).asInstanceOf[Ptr[Ptr[CInt]]]
      def side_data_prefer_packet_=(value: Ptr[CInt]): Unit =
        !struct.at(offsets(148)).asInstanceOf[Ptr[Ptr[CInt]]] = value
      def nb_side_data_prefer_packet: CUnsignedInt =
        !struct.at(offsets(149)).asInstanceOf[Ptr[CUnsignedInt]]
      def nb_side_data_prefer_packet_=(value: CUnsignedInt): Unit =
        !struct.at(offsets(149)).asInstanceOf[Ptr[CUnsignedInt]] = value
      def decoded_side_data: Ptr[Ptr[AVFrameSideData]] =
        !struct.at(offsets(150)).asInstanceOf[Ptr[Ptr[Ptr[AVFrameSideData]]]]
      def decoded_side_data_=(value: Ptr[Ptr[AVFrameSideData]]): Unit =
        !struct.at(offsets(150)).asInstanceOf[Ptr[Ptr[Ptr[AVFrameSideData]]]] =
          value
      def nb_decoded_side_data: CInt =
        !struct.at(offsets(151)).asInstanceOf[Ptr[CInt]]
      def nb_decoded_side_data_=(value: CInt): Unit =
        !struct.at(offsets(151)).asInstanceOf[Ptr[CInt]] = value
    end extension
    val offsets: Array[Int] =
      val res = Array.ofDim[Int](152)
      def align(offset: Int, alignment: Int) =
        val alignmentMask = alignment - 1
        val padding =
          if (offset & alignmentMask) == 0 then 0
          else alignment - (offset & alignmentMask)
        offset + padding

      res(0) = align(0, alignmentof[Ptr[AVClass]].toInt)
      res(1) =
        align(res(0) + sizeof[Ptr[AVClass]].toInt, alignmentof[CInt].toInt)
      res(2) =
        align(res(1) + sizeof[CInt].toInt, alignmentof[AVMediaType].toInt)
      res(3) = align(
        res(2) + sizeof[AVMediaType].toInt,
        alignmentof[Ptr[AVCodec]].toInt
      )
      res(4) =
        align(res(3) + sizeof[Ptr[AVCodec]].toInt, alignmentof[AVCodecID].toInt)
      res(5) =
        align(res(4) + sizeof[AVCodecID].toInt, alignmentof[CUnsignedInt].toInt)
      res(6) =
        align(res(5) + sizeof[CUnsignedInt].toInt, alignmentof[Ptr[Byte]].toInt)
      res(7) = align(
        res(6) + sizeof[Ptr[Byte]].toInt,
        alignmentof[Ptr[AVCodecInternal]].toInt
      )
      res(8) = align(
        res(7) + sizeof[Ptr[AVCodecInternal]].toInt,
        alignmentof[Ptr[Byte]].toInt
      )
      res(9) =
        align(res(8) + sizeof[Ptr[Byte]].toInt, alignmentof[int64_t].toInt)
      res(10) = align(res(9) + sizeof[int64_t].toInt, alignmentof[CInt].toInt)
      res(11) = align(res(10) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(12) =
        align(res(11) + sizeof[CInt].toInt, alignmentof[Ptr[uint8_t]].toInt)
      res(13) =
        align(res(12) + sizeof[Ptr[uint8_t]].toInt, alignmentof[CInt].toInt)
      res(14) =
        align(res(13) + sizeof[CInt].toInt, alignmentof[AVRational].toInt)
      res(15) =
        align(res(14) + sizeof[AVRational].toInt, alignmentof[AVRational].toInt)
      res(16) =
        align(res(15) + sizeof[AVRational].toInt, alignmentof[AVRational].toInt)
      res(17) =
        align(res(16) + sizeof[AVRational].toInt, alignmentof[CInt].toInt)
      res(18) = align(res(17) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(19) = align(res(18) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(20) = align(res(19) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(21) = align(res(20) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(22) = align(res(21) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(23) =
        align(res(22) + sizeof[CInt].toInt, alignmentof[AVRational].toInt)
      res(24) = align(
        res(23) + sizeof[AVRational].toInt,
        alignmentof[AVPixelFormat].toInt
      )
      res(25) = align(
        res(24) + sizeof[AVPixelFormat].toInt,
        alignmentof[AVPixelFormat].toInt
      )
      res(26) = align(
        res(25) + sizeof[AVPixelFormat].toInt,
        alignmentof[AVColorPrimaries].toInt
      )
      res(27) = align(
        res(26) + sizeof[AVColorPrimaries].toInt,
        alignmentof[AVColorTransferCharacteristic].toInt
      )
      res(28) = align(
        res(27) + sizeof[AVColorTransferCharacteristic].toInt,
        alignmentof[AVColorSpace].toInt
      )
      res(29) = align(
        res(28) + sizeof[AVColorSpace].toInt,
        alignmentof[AVColorRange].toInt
      )
      res(30) = align(
        res(29) + sizeof[AVColorRange].toInt,
        alignmentof[AVChromaLocation].toInt
      )
      res(31) = align(
        res(30) + sizeof[AVChromaLocation].toInt,
        alignmentof[AVFieldOrder].toInt
      )
      res(32) =
        align(res(31) + sizeof[AVFieldOrder].toInt, alignmentof[CInt].toInt)
      res(33) = align(res(32) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(34) = align(res(33) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(35) = align(
        res(34) + sizeof[CInt].toInt,
        alignmentof[CFuncPtr6[
          Ptr[AVCodecContext],
          Ptr[AVFrame],
          CArray[CInt, Nat._8],
          CInt,
          CInt,
          CInt,
          Unit
        ]].toInt
      )
      res(36) = align(
        res(35) + sizeof[CFuncPtr6[
          Ptr[AVCodecContext],
          Ptr[AVFrame],
          CArray[CInt, Nat._8],
          CInt,
          CInt,
          CInt,
          Unit
        ]].toInt,
        alignmentof[
          CFuncPtr2[Ptr[AVCodecContext], Ptr[AVPixelFormat], AVPixelFormat]
        ].toInt
      )
      res(37) = align(
        res(36) + sizeof[
          CFuncPtr2[Ptr[AVCodecContext], Ptr[AVPixelFormat], AVPixelFormat]
        ].toInt,
        alignmentof[CInt].toInt
      )
      res(38) = align(res(37) + sizeof[CInt].toInt, alignmentof[Float].toInt)
      res(39) = align(res(38) + sizeof[Float].toInt, alignmentof[Float].toInt)
      res(40) = align(res(39) + sizeof[Float].toInt, alignmentof[Float].toInt)
      res(41) = align(res(40) + sizeof[Float].toInt, alignmentof[Float].toInt)
      res(42) = align(res(41) + sizeof[Float].toInt, alignmentof[Float].toInt)
      res(43) = align(res(42) + sizeof[Float].toInt, alignmentof[Float].toInt)
      res(44) = align(res(43) + sizeof[Float].toInt, alignmentof[Float].toInt)
      res(45) = align(res(44) + sizeof[Float].toInt, alignmentof[Float].toInt)
      res(46) = align(res(45) + sizeof[Float].toInt, alignmentof[Float].toInt)
      res(47) = align(res(46) + sizeof[Float].toInt, alignmentof[CInt].toInt)
      res(48) = align(res(47) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(49) = align(res(48) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(50) = align(res(49) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(51) = align(res(50) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(52) = align(res(51) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(53) = align(res(52) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(54) = align(res(53) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(55) = align(res(54) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(56) = align(res(55) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(57) = align(res(56) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(58) = align(res(57) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(59) =
        align(res(58) + sizeof[CInt].toInt, alignmentof[Ptr[uint16_t]].toInt)
      res(60) = align(
        res(59) + sizeof[Ptr[uint16_t]].toInt,
        alignmentof[Ptr[uint16_t]].toInt
      )
      res(61) = align(
        res(60) + sizeof[Ptr[uint16_t]].toInt,
        alignmentof[Ptr[uint16_t]].toInt
      )
      res(62) =
        align(res(61) + sizeof[Ptr[uint16_t]].toInt, alignmentof[CInt].toInt)
      res(63) = align(res(62) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(64) = align(res(63) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(65) = align(res(64) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(66) = align(res(65) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(67) = align(res(66) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(68) = align(res(67) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(69) = align(res(68) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(70) = align(res(69) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(71) =
        align(res(70) + sizeof[CInt].toInt, alignmentof[AVSampleFormat].toInt)
      res(72) = align(
        res(71) + sizeof[AVSampleFormat].toInt,
        alignmentof[AVChannelLayout].toInt
      )
      res(73) =
        align(res(72) + sizeof[AVChannelLayout].toInt, alignmentof[CInt].toInt)
      res(74) = align(res(73) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(75) = align(res(74) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(76) = align(
        res(75) + sizeof[CInt].toInt,
        alignmentof[AVAudioServiceType].toInt
      )
      res(77) = align(
        res(76) + sizeof[AVAudioServiceType].toInt,
        alignmentof[AVSampleFormat].toInt
      )
      res(78) =
        align(res(77) + sizeof[AVSampleFormat].toInt, alignmentof[CInt].toInt)
      res(79) = align(res(78) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(80) = align(res(79) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(81) = align(
        res(80) + sizeof[CInt].toInt,
        alignmentof[
          CFuncPtr3[Ptr[AVCodecContext], Ptr[AVFrame], CInt, CInt]
        ].toInt
      )
      res(82) = align(
        res(81) + sizeof[
          CFuncPtr3[Ptr[AVCodecContext], Ptr[AVFrame], CInt, CInt]
        ].toInt,
        alignmentof[CInt].toInt
      )
      res(83) = align(res(82) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(84) = align(res(83) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(85) = align(res(84) + sizeof[CInt].toInt, alignmentof[Float].toInt)
      res(86) = align(res(85) + sizeof[Float].toInt, alignmentof[Float].toInt)
      res(87) = align(res(86) + sizeof[Float].toInt, alignmentof[CInt].toInt)
      res(88) = align(res(87) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(89) = align(res(88) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(90) = align(res(89) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(91) = align(res(90) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(92) =
        align(res(91) + sizeof[CInt].toInt, alignmentof[Ptr[RcOverride]].toInt)
      res(93) = align(
        res(92) + sizeof[Ptr[RcOverride]].toInt,
        alignmentof[int64_t].toInt
      )
      res(94) =
        align(res(93) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res(95) = align(res(94) + sizeof[int64_t].toInt, alignmentof[Float].toInt)
      res(96) = align(res(95) + sizeof[Float].toInt, alignmentof[Float].toInt)
      res(97) = align(res(96) + sizeof[Float].toInt, alignmentof[CInt].toInt)
      res(98) = align(res(97) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(99) = align(res(98) + sizeof[CInt].toInt, alignmentof[CString].toInt)
      res(100) =
        align(res(99) + sizeof[CString].toInt, alignmentof[CString].toInt)
      res(101) =
        align(res(100) + sizeof[CString].toInt, alignmentof[CInt].toInt)
      res(102) = align(res(101) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(103) = align(res(102) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(104) = align(res(103) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(105) = align(res(104) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(106) =
        align(res(105) + sizeof[CInt].toInt, alignmentof[Ptr[AVHWAccel]].toInt)
      res(107) = align(
        res(106) + sizeof[Ptr[AVHWAccel]].toInt,
        alignmentof[Ptr[Byte]].toInt
      )
      res(108) = align(
        res(107) + sizeof[Ptr[Byte]].toInt,
        alignmentof[Ptr[AVBufferRef]].toInt
      )
      res(109) = align(
        res(108) + sizeof[Ptr[AVBufferRef]].toInt,
        alignmentof[Ptr[AVBufferRef]].toInt
      )
      res(110) = align(
        res(109) + sizeof[Ptr[AVBufferRef]].toInt,
        alignmentof[CInt].toInt
      )
      res(111) = align(res(110) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(112) =
        align(res(111) + sizeof[CInt].toInt, alignmentof[uint64_t].toInt)
      res(113) = align(
        res(112) + sizeof[CArray[uint64_t, Nat._8]].toInt,
        alignmentof[CInt].toInt
      )
      res(114) = align(res(113) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(115) = align(res(114) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(116) = align(res(115) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(117) = align(res(116) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(118) = align(res(117) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(119) = align(res(118) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(120) = align(
        res(119) + sizeof[CInt].toInt,
        alignmentof[CFuncPtr6[Ptr[AVCodecContext], CFuncPtr2[Ptr[
          AVCodecContext
        ], Ptr[Byte], CInt], Ptr[Byte], Ptr[CInt], CInt, CInt, CInt]].toInt
      )
      res(121) = align(
        res(120) + sizeof[CFuncPtr6[Ptr[AVCodecContext], CFuncPtr2[Ptr[
          AVCodecContext
        ], Ptr[Byte], CInt], Ptr[Byte], Ptr[CInt], CInt, CInt, CInt]].toInt,
        alignmentof[CFuncPtr5[
          Ptr[AVCodecContext],
          CFuncPtr4[Ptr[AVCodecContext], Ptr[Byte], CInt, CInt, CInt],
          Ptr[Byte],
          Ptr[CInt],
          CInt,
          CInt
        ]].toInt
      )
      res(122) = align(
        res(121) + sizeof[CFuncPtr5[
          Ptr[AVCodecContext],
          CFuncPtr4[Ptr[AVCodecContext], Ptr[Byte], CInt, CInt, CInt],
          Ptr[Byte],
          Ptr[CInt],
          CInt,
          CInt
        ]].toInt,
        alignmentof[CInt].toInt
      )
      res(123) = align(res(122) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(124) =
        align(res(123) + sizeof[CInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(125) = align(
        res(124) + sizeof[CUnsignedInt].toInt,
        alignmentof[AVDiscard].toInt
      )
      res(126) =
        align(res(125) + sizeof[AVDiscard].toInt, alignmentof[AVDiscard].toInt)
      res(127) =
        align(res(126) + sizeof[AVDiscard].toInt, alignmentof[AVDiscard].toInt)
      res(128) =
        align(res(127) + sizeof[AVDiscard].toInt, alignmentof[CInt].toInt)
      res(129) = align(res(128) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(130) = align(res(129) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(131) = align(res(130) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(132) = align(
        res(131) + sizeof[CInt].toInt,
        alignmentof[Ptr[AVCodecDescriptor]].toInt
      )
      res(133) = align(
        res(132) + sizeof[Ptr[AVCodecDescriptor]].toInt,
        alignmentof[CString].toInt
      )
      res(134) =
        align(res(133) + sizeof[CString].toInt, alignmentof[CInt].toInt)
      res(135) = align(res(134) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(136) =
        align(res(135) + sizeof[CInt].toInt, alignmentof[Ptr[uint8_t]].toInt)
      res(137) = align(
        res(136) + sizeof[Ptr[uint8_t]].toInt,
        alignmentof[Ptr[uint8_t]].toInt
      )
      res(138) =
        align(res(137) + sizeof[Ptr[uint8_t]].toInt, alignmentof[CString].toInt)
      res(139) = align(
        res(138) + sizeof[CString].toInt,
        alignmentof[Ptr[AVPacketSideData]].toInt
      )
      res(140) = align(
        res(139) + sizeof[Ptr[AVPacketSideData]].toInt,
        alignmentof[CInt].toInt
      )
      res(141) = align(res(140) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(142) =
        align(res(141) + sizeof[CInt].toInt, alignmentof[int64_t].toInt)
      res(143) =
        align(res(142) + sizeof[int64_t].toInt, alignmentof[CInt].toInt)
      res(144) = align(res(143) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(145) =
        align(res(144) + sizeof[CInt].toInt, alignmentof[int64_t].toInt)
      res(146) = align(
        res(145) + sizeof[int64_t].toInt,
        alignmentof[
          CFuncPtr3[Ptr[AVCodecContext], Ptr[AVPacket], CInt, CInt]
        ].toInt
      )
      res(147) = align(
        res(146) + sizeof[
          CFuncPtr3[Ptr[AVCodecContext], Ptr[AVPacket], CInt, CInt]
        ].toInt,
        alignmentof[int64_t].toInt
      )
      res(148) =
        align(res(147) + sizeof[int64_t].toInt, alignmentof[Ptr[CInt]].toInt)
      res(149) = align(
        res(148) + sizeof[Ptr[CInt]].toInt,
        alignmentof[CUnsignedInt].toInt
      )
      res(150) = align(
        res(149) + sizeof[CUnsignedInt].toInt,
        alignmentof[Ptr[Ptr[AVFrameSideData]]].toInt
      )
      res(151) = align(
        res(150) + sizeof[Ptr[Ptr[AVFrameSideData]]].toInt,
        alignmentof[CInt].toInt
      )
      res
    end offsets
  end AVCodecContext

  /** This struct describes the properties of a single codec described by an
    * AVCodecID.
    */
  opaque type AVCodecDescriptor =
    CStruct7[AVCodecID, AVMediaType, CString, CString, CInt, Ptr[CString], Ptr[
      AVProfile
    ]]

  object AVCodecDescriptor:
    given _tag: Tag[AVCodecDescriptor] = Tag.materializeCStruct7Tag[
      AVCodecID,
      AVMediaType,
      CString,
      CString,
      CInt,
      Ptr[CString],
      Ptr[AVProfile]
    ]

    // Allocates AVCodecDescriptor on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVCodecDescriptor] =
      scala.scalanative.unsafe.alloc[AVCodecDescriptor](1)
    def apply(
        id: AVCodecID,
        `type`: AVMediaType,
        name: CString,
        long_name: CString,
        props: CInt,
        mime_types: Ptr[CString],
        profiles: Ptr[AVProfile]
    )(using Zone): Ptr[AVCodecDescriptor] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).`type` = `type`
      (!____ptr).name = name
      (!____ptr).long_name = long_name
      (!____ptr).props = props
      (!____ptr).mime_types = mime_types
      (!____ptr).profiles = profiles
      ____ptr
    end apply

    extension (struct: AVCodecDescriptor)
      def id: AVCodecID = struct._1
      def id_=(value: AVCodecID): Unit = !struct.at1 = value
      def `type`: AVMediaType = struct._2
      def type_=(value: AVMediaType): Unit = !struct.at2 = value
      def name: CString = struct._3
      def name_=(value: CString): Unit = !struct.at3 = value
      def long_name: CString = struct._4
      def long_name_=(value: CString): Unit = !struct.at4 = value
      def props: CInt = struct._5
      def props_=(value: CInt): Unit = !struct.at5 = value
      def mime_types: Ptr[CString] = struct._6
      def mime_types_=(value: Ptr[CString]): Unit = !struct.at6 = value
      def profiles: Ptr[AVProfile] = struct._7
      def profiles_=(value: Ptr[AVProfile]): Unit = !struct.at7 = value
    end extension
  end AVCodecDescriptor

  opaque type AVCodecHWConfig = CStruct3[AVPixelFormat, CInt, AVHWDeviceType]

  object AVCodecHWConfig:
    given _tag: Tag[AVCodecHWConfig] =
      Tag.materializeCStruct3Tag[AVPixelFormat, CInt, AVHWDeviceType]

    // Allocates AVCodecHWConfig on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVCodecHWConfig] =
      scala.scalanative.unsafe.alloc[AVCodecHWConfig](1)
    def apply(
        pix_fmt: AVPixelFormat,
        methods: CInt,
        device_type: AVHWDeviceType
    )(using Zone): Ptr[AVCodecHWConfig] =
      val ____ptr = apply()
      (!____ptr).pix_fmt = pix_fmt
      (!____ptr).methods = methods
      (!____ptr).device_type = device_type
      ____ptr
    end apply

    extension (struct: AVCodecHWConfig)
      def pix_fmt: AVPixelFormat = struct._1
      def pix_fmt_=(value: AVPixelFormat): Unit = !struct.at1 = value
      def methods: CInt = struct._2
      def methods_=(value: CInt): Unit = !struct.at2 = value
      def device_type: AVHWDeviceType = struct._3
      def device_type_=(value: AVHWDeviceType): Unit = !struct.at3 = value
  end AVCodecHWConfig

  opaque type AVCodecInternal = CStruct0

  object AVCodecInternal:
    given _tag: Tag[AVCodecInternal] = Tag.materializeCStruct0Tag

  /** This struct describes the properties of an encoded stream.
    */
  opaque type AVCodecParameters = CStruct0

  object AVCodecParameters:
    given _tag: Tag[AVCodecParameters] = Tag.materializeCStruct0Tag

  opaque type AVCodecParser = CStruct6[
    CArray[CInt, Nat._7],
    CInt,
    CFuncPtr1[Ptr[AVCodecParserContext], CInt],
    CFuncPtr6[Ptr[AVCodecParserContext], Ptr[AVCodecContext], Ptr[
      Ptr[uint8_t]
    ], Ptr[CInt], Ptr[uint8_t], CInt, CInt],
    CFuncPtr1[Ptr[AVCodecParserContext], Unit],
    CFuncPtr3[Ptr[AVCodecContext], Ptr[uint8_t], CInt, CInt]
  ]

  object AVCodecParser:
    given _tag: Tag[AVCodecParser] = Tag.materializeCStruct6Tag[
      CArray[CInt, Nat._7],
      CInt,
      CFuncPtr1[Ptr[AVCodecParserContext], CInt],
      CFuncPtr6[Ptr[AVCodecParserContext], Ptr[AVCodecContext], Ptr[
        Ptr[uint8_t]
      ], Ptr[CInt], Ptr[uint8_t], CInt, CInt],
      CFuncPtr1[Ptr[AVCodecParserContext], Unit],
      CFuncPtr3[Ptr[AVCodecContext], Ptr[uint8_t], CInt, CInt]
    ]

    // Allocates AVCodecParser on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVCodecParser] =
      scala.scalanative.unsafe.alloc[AVCodecParser](1)
    def apply(
        codec_ids: CArray[CInt, Nat._7],
        priv_data_size: CInt,
        parser_init: CFuncPtr1[Ptr[AVCodecParserContext], CInt],
        parser_parse: CFuncPtr6[Ptr[AVCodecParserContext], Ptr[
          AVCodecContext
        ], Ptr[Ptr[uint8_t]], Ptr[CInt], Ptr[uint8_t], CInt, CInt],
        parser_close: CFuncPtr1[Ptr[AVCodecParserContext], Unit],
        split: CFuncPtr3[Ptr[AVCodecContext], Ptr[uint8_t], CInt, CInt]
    )(using Zone): Ptr[AVCodecParser] =
      val ____ptr = apply()
      (!____ptr).codec_ids = codec_ids
      (!____ptr).priv_data_size = priv_data_size
      (!____ptr).parser_init = parser_init
      (!____ptr).parser_parse = parser_parse
      (!____ptr).parser_close = parser_close
      (!____ptr).split = split
      ____ptr
    end apply

    extension (struct: AVCodecParser)
      def codec_ids: CArray[CInt, Nat._7] = struct._1
      def codec_ids_=(value: CArray[CInt, Nat._7]): Unit = !struct.at1 = value
      def priv_data_size: CInt = struct._2
      def priv_data_size_=(value: CInt): Unit = !struct.at2 = value
      def parser_init: CFuncPtr1[Ptr[AVCodecParserContext], CInt] = struct._3
      def parser_init_=(
          value: CFuncPtr1[Ptr[AVCodecParserContext], CInt]
      ): Unit = !struct.at3 = value
      def parser_parse: CFuncPtr6[Ptr[AVCodecParserContext], Ptr[
        AVCodecContext
      ], Ptr[Ptr[uint8_t]], Ptr[CInt], Ptr[uint8_t], CInt, CInt] = struct._4
      def parser_parse_=(
          value: CFuncPtr6[Ptr[AVCodecParserContext], Ptr[AVCodecContext], Ptr[
            Ptr[uint8_t]
          ], Ptr[CInt], Ptr[uint8_t], CInt, CInt]
      ): Unit = !struct.at4 = value
      def parser_close: CFuncPtr1[Ptr[AVCodecParserContext], Unit] = struct._5
      def parser_close_=(
          value: CFuncPtr1[Ptr[AVCodecParserContext], Unit]
      ): Unit = !struct.at5 = value
      def split: CFuncPtr3[Ptr[AVCodecContext], Ptr[uint8_t], CInt, CInt] =
        struct._6
      def split_=(
          value: CFuncPtr3[Ptr[AVCodecContext], Ptr[uint8_t], CInt, CInt]
      ): Unit = !struct.at6 = value
    end extension
  end AVCodecParser

  opaque type AVCodecParserContext =
    CArray[CChar, Nat.Digit3[Nat._3, Nat._3, Nat._6]]

  object AVCodecParserContext:
    given _tag: Tag[AVCodecParserContext] =
      Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._3, Nat._6]](
        Tag.Byte,
        Tag.Digit3[Nat._3, Nat._3, Nat._6](Tag.Nat3, Tag.Nat3, Tag.Nat6)
      )

    // Allocates AVCodecParserContext on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVCodecParserContext] =
      scala.scalanative.unsafe.alloc[AVCodecParserContext](1)
    def apply(
        priv_data: Ptr[Byte],
        parser: Ptr[AVCodecParser],
        frame_offset: int64_t,
        cur_offset: int64_t,
        next_frame_offset: int64_t,
        pict_type: CInt,
        repeat_pict: CInt,
        pts: int64_t,
        dts: int64_t,
        last_pts: int64_t,
        last_dts: int64_t,
        fetch_timestamp: CInt,
        cur_frame_start_index: CInt,
        cur_frame_offset: CArray[int64_t, Nat._4],
        cur_frame_pts: CArray[int64_t, Nat._4],
        cur_frame_dts: CArray[int64_t, Nat._4],
        flags: CInt,
        offset: int64_t,
        cur_frame_end: CArray[int64_t, Nat._4],
        key_frame: CInt,
        dts_sync_point: CInt,
        dts_ref_dts_delta: CInt,
        pts_dts_delta: CInt,
        cur_frame_pos: CArray[int64_t, Nat._4],
        pos: int64_t,
        last_pos: int64_t,
        duration: CInt,
        field_order: AVFieldOrder,
        picture_structure: AVPictureStructure,
        output_picture_number: CInt,
        width: CInt,
        height: CInt,
        coded_width: CInt,
        coded_height: CInt,
        format: CInt
    )(using Zone): Ptr[AVCodecParserContext] =
      val ____ptr = apply()
      (!____ptr).priv_data = priv_data
      (!____ptr).parser = parser
      (!____ptr).frame_offset = frame_offset
      (!____ptr).cur_offset = cur_offset
      (!____ptr).next_frame_offset = next_frame_offset
      (!____ptr).pict_type = pict_type
      (!____ptr).repeat_pict = repeat_pict
      (!____ptr).pts = pts
      (!____ptr).dts = dts
      (!____ptr).last_pts = last_pts
      (!____ptr).last_dts = last_dts
      (!____ptr).fetch_timestamp = fetch_timestamp
      (!____ptr).cur_frame_start_index = cur_frame_start_index
      (!____ptr).cur_frame_offset = cur_frame_offset
      (!____ptr).cur_frame_pts = cur_frame_pts
      (!____ptr).cur_frame_dts = cur_frame_dts
      (!____ptr).flags = flags
      (!____ptr).offset = offset
      (!____ptr).cur_frame_end = cur_frame_end
      (!____ptr).key_frame = key_frame
      (!____ptr).dts_sync_point = dts_sync_point
      (!____ptr).dts_ref_dts_delta = dts_ref_dts_delta
      (!____ptr).pts_dts_delta = pts_dts_delta
      (!____ptr).cur_frame_pos = cur_frame_pos
      (!____ptr).pos = pos
      (!____ptr).last_pos = last_pos
      (!____ptr).duration = duration
      (!____ptr).field_order = field_order
      (!____ptr).picture_structure = picture_structure
      (!____ptr).output_picture_number = output_picture_number
      (!____ptr).width = width
      (!____ptr).height = height
      (!____ptr).coded_width = coded_width
      (!____ptr).coded_height = coded_height
      (!____ptr).format = format
      ____ptr
    end apply

    extension (struct: AVCodecParserContext)
      def priv_data: Ptr[Byte] =
        !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[Byte]]]
      def priv_data_=(value: Ptr[Byte]): Unit =
        !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def parser: Ptr[AVCodecParser] =
        !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[AVCodecParser]]]
      def parser_=(value: Ptr[AVCodecParser]): Unit =
        !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[AVCodecParser]]] = value
      def frame_offset: int64_t =
        !struct.at(offsets(2)).asInstanceOf[Ptr[int64_t]]
      def frame_offset_=(value: int64_t): Unit =
        !struct.at(offsets(2)).asInstanceOf[Ptr[int64_t]] = value
      def cur_offset: int64_t =
        !struct.at(offsets(3)).asInstanceOf[Ptr[int64_t]]
      def cur_offset_=(value: int64_t): Unit =
        !struct.at(offsets(3)).asInstanceOf[Ptr[int64_t]] = value
      def next_frame_offset: int64_t =
        !struct.at(offsets(4)).asInstanceOf[Ptr[int64_t]]
      def next_frame_offset_=(value: int64_t): Unit =
        !struct.at(offsets(4)).asInstanceOf[Ptr[int64_t]] = value
      def pict_type: CInt = !struct.at(offsets(5)).asInstanceOf[Ptr[CInt]]
      def pict_type_=(value: CInt): Unit =
        !struct.at(offsets(5)).asInstanceOf[Ptr[CInt]] = value
      def repeat_pict: CInt = !struct.at(offsets(6)).asInstanceOf[Ptr[CInt]]
      def repeat_pict_=(value: CInt): Unit =
        !struct.at(offsets(6)).asInstanceOf[Ptr[CInt]] = value
      def pts: int64_t = !struct.at(offsets(7)).asInstanceOf[Ptr[int64_t]]
      def pts_=(value: int64_t): Unit =
        !struct.at(offsets(7)).asInstanceOf[Ptr[int64_t]] = value
      def dts: int64_t = !struct.at(offsets(8)).asInstanceOf[Ptr[int64_t]]
      def dts_=(value: int64_t): Unit =
        !struct.at(offsets(8)).asInstanceOf[Ptr[int64_t]] = value
      def last_pts: int64_t = !struct.at(offsets(9)).asInstanceOf[Ptr[int64_t]]
      def last_pts_=(value: int64_t): Unit =
        !struct.at(offsets(9)).asInstanceOf[Ptr[int64_t]] = value
      def last_dts: int64_t = !struct.at(offsets(10)).asInstanceOf[Ptr[int64_t]]
      def last_dts_=(value: int64_t): Unit =
        !struct.at(offsets(10)).asInstanceOf[Ptr[int64_t]] = value
      def fetch_timestamp: CInt =
        !struct.at(offsets(11)).asInstanceOf[Ptr[CInt]]
      def fetch_timestamp_=(value: CInt): Unit =
        !struct.at(offsets(11)).asInstanceOf[Ptr[CInt]] = value
      def cur_frame_start_index: CInt =
        !struct.at(offsets(12)).asInstanceOf[Ptr[CInt]]
      def cur_frame_start_index_=(value: CInt): Unit =
        !struct.at(offsets(12)).asInstanceOf[Ptr[CInt]] = value
      def cur_frame_offset: CArray[int64_t, Nat._4] =
        !struct.at(offsets(13)).asInstanceOf[Ptr[CArray[int64_t, Nat._4]]]
      def cur_frame_offset_=(value: CArray[int64_t, Nat._4]): Unit =
        !struct.at(offsets(13)).asInstanceOf[Ptr[CArray[int64_t, Nat._4]]] =
          value
      def cur_frame_pts: CArray[int64_t, Nat._4] =
        !struct.at(offsets(14)).asInstanceOf[Ptr[CArray[int64_t, Nat._4]]]
      def cur_frame_pts_=(value: CArray[int64_t, Nat._4]): Unit =
        !struct.at(offsets(14)).asInstanceOf[Ptr[CArray[int64_t, Nat._4]]] =
          value
      def cur_frame_dts: CArray[int64_t, Nat._4] =
        !struct.at(offsets(15)).asInstanceOf[Ptr[CArray[int64_t, Nat._4]]]
      def cur_frame_dts_=(value: CArray[int64_t, Nat._4]): Unit =
        !struct.at(offsets(15)).asInstanceOf[Ptr[CArray[int64_t, Nat._4]]] =
          value
      def flags: CInt = !struct.at(offsets(16)).asInstanceOf[Ptr[CInt]]
      def flags_=(value: CInt): Unit =
        !struct.at(offsets(16)).asInstanceOf[Ptr[CInt]] = value
      def offset: int64_t = !struct.at(offsets(17)).asInstanceOf[Ptr[int64_t]]
      def offset_=(value: int64_t): Unit =
        !struct.at(offsets(17)).asInstanceOf[Ptr[int64_t]] = value
      def cur_frame_end: CArray[int64_t, Nat._4] =
        !struct.at(offsets(18)).asInstanceOf[Ptr[CArray[int64_t, Nat._4]]]
      def cur_frame_end_=(value: CArray[int64_t, Nat._4]): Unit =
        !struct.at(offsets(18)).asInstanceOf[Ptr[CArray[int64_t, Nat._4]]] =
          value
      def key_frame: CInt = !struct.at(offsets(19)).asInstanceOf[Ptr[CInt]]
      def key_frame_=(value: CInt): Unit =
        !struct.at(offsets(19)).asInstanceOf[Ptr[CInt]] = value
      def dts_sync_point: CInt = !struct.at(offsets(20)).asInstanceOf[Ptr[CInt]]
      def dts_sync_point_=(value: CInt): Unit =
        !struct.at(offsets(20)).asInstanceOf[Ptr[CInt]] = value
      def dts_ref_dts_delta: CInt =
        !struct.at(offsets(21)).asInstanceOf[Ptr[CInt]]
      def dts_ref_dts_delta_=(value: CInt): Unit =
        !struct.at(offsets(21)).asInstanceOf[Ptr[CInt]] = value
      def pts_dts_delta: CInt = !struct.at(offsets(22)).asInstanceOf[Ptr[CInt]]
      def pts_dts_delta_=(value: CInt): Unit =
        !struct.at(offsets(22)).asInstanceOf[Ptr[CInt]] = value
      def cur_frame_pos: CArray[int64_t, Nat._4] =
        !struct.at(offsets(23)).asInstanceOf[Ptr[CArray[int64_t, Nat._4]]]
      def cur_frame_pos_=(value: CArray[int64_t, Nat._4]): Unit =
        !struct.at(offsets(23)).asInstanceOf[Ptr[CArray[int64_t, Nat._4]]] =
          value
      def pos: int64_t = !struct.at(offsets(24)).asInstanceOf[Ptr[int64_t]]
      def pos_=(value: int64_t): Unit =
        !struct.at(offsets(24)).asInstanceOf[Ptr[int64_t]] = value
      def last_pos: int64_t = !struct.at(offsets(25)).asInstanceOf[Ptr[int64_t]]
      def last_pos_=(value: int64_t): Unit =
        !struct.at(offsets(25)).asInstanceOf[Ptr[int64_t]] = value
      def duration: CInt = !struct.at(offsets(26)).asInstanceOf[Ptr[CInt]]
      def duration_=(value: CInt): Unit =
        !struct.at(offsets(26)).asInstanceOf[Ptr[CInt]] = value
      def field_order: AVFieldOrder =
        !struct.at(offsets(27)).asInstanceOf[Ptr[AVFieldOrder]]
      def field_order_=(value: AVFieldOrder): Unit =
        !struct.at(offsets(27)).asInstanceOf[Ptr[AVFieldOrder]] = value
      def picture_structure: AVPictureStructure =
        !struct.at(offsets(28)).asInstanceOf[Ptr[AVPictureStructure]]
      def picture_structure_=(value: AVPictureStructure): Unit =
        !struct.at(offsets(28)).asInstanceOf[Ptr[AVPictureStructure]] = value
      def output_picture_number: CInt =
        !struct.at(offsets(29)).asInstanceOf[Ptr[CInt]]
      def output_picture_number_=(value: CInt): Unit =
        !struct.at(offsets(29)).asInstanceOf[Ptr[CInt]] = value
      def width: CInt = !struct.at(offsets(30)).asInstanceOf[Ptr[CInt]]
      def width_=(value: CInt): Unit =
        !struct.at(offsets(30)).asInstanceOf[Ptr[CInt]] = value
      def height: CInt = !struct.at(offsets(31)).asInstanceOf[Ptr[CInt]]
      def height_=(value: CInt): Unit =
        !struct.at(offsets(31)).asInstanceOf[Ptr[CInt]] = value
      def coded_width: CInt = !struct.at(offsets(32)).asInstanceOf[Ptr[CInt]]
      def coded_width_=(value: CInt): Unit =
        !struct.at(offsets(32)).asInstanceOf[Ptr[CInt]] = value
      def coded_height: CInt = !struct.at(offsets(33)).asInstanceOf[Ptr[CInt]]
      def coded_height_=(value: CInt): Unit =
        !struct.at(offsets(33)).asInstanceOf[Ptr[CInt]] = value
      def format: CInt = !struct.at(offsets(34)).asInstanceOf[Ptr[CInt]]
      def format_=(value: CInt): Unit =
        !struct.at(offsets(34)).asInstanceOf[Ptr[CInt]] = value
    end extension
    val offsets: Array[Int] =
      val res = Array.ofDim[Int](35)
      def align(offset: Int, alignment: Int) =
        val alignmentMask = alignment - 1
        val padding =
          if (offset & alignmentMask) == 0 then 0
          else alignment - (offset & alignmentMask)
        offset + padding

      res(0) = align(0, alignmentof[Ptr[Byte]].toInt)
      res(1) = align(
        res(0) + sizeof[Ptr[Byte]].toInt,
        alignmentof[Ptr[AVCodecParser]].toInt
      )
      res(2) = align(
        res(1) + sizeof[Ptr[AVCodecParser]].toInt,
        alignmentof[int64_t].toInt
      )
      res(3) = align(res(2) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res(4) = align(res(3) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res(5) = align(res(4) + sizeof[int64_t].toInt, alignmentof[CInt].toInt)
      res(6) = align(res(5) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(7) = align(res(6) + sizeof[CInt].toInt, alignmentof[int64_t].toInt)
      res(8) = align(res(7) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res(9) = align(res(8) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res(10) =
        align(res(9) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res(11) = align(res(10) + sizeof[int64_t].toInt, alignmentof[CInt].toInt)
      res(12) = align(res(11) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(13) = align(res(12) + sizeof[CInt].toInt, alignmentof[int64_t].toInt)
      res(14) = align(
        res(13) + sizeof[CArray[int64_t, Nat._4]].toInt,
        alignmentof[int64_t].toInt
      )
      res(15) = align(
        res(14) + sizeof[CArray[int64_t, Nat._4]].toInt,
        alignmentof[int64_t].toInt
      )
      res(16) = align(
        res(15) + sizeof[CArray[int64_t, Nat._4]].toInt,
        alignmentof[CInt].toInt
      )
      res(17) = align(res(16) + sizeof[CInt].toInt, alignmentof[int64_t].toInt)
      res(18) =
        align(res(17) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res(19) = align(
        res(18) + sizeof[CArray[int64_t, Nat._4]].toInt,
        alignmentof[CInt].toInt
      )
      res(20) = align(res(19) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(21) = align(res(20) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(22) = align(res(21) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(23) = align(res(22) + sizeof[CInt].toInt, alignmentof[int64_t].toInt)
      res(24) = align(
        res(23) + sizeof[CArray[int64_t, Nat._4]].toInt,
        alignmentof[int64_t].toInt
      )
      res(25) =
        align(res(24) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res(26) = align(res(25) + sizeof[int64_t].toInt, alignmentof[CInt].toInt)
      res(27) =
        align(res(26) + sizeof[CInt].toInt, alignmentof[AVFieldOrder].toInt)
      res(28) = align(
        res(27) + sizeof[AVFieldOrder].toInt,
        alignmentof[AVPictureStructure].toInt
      )
      res(29) = align(
        res(28) + sizeof[AVPictureStructure].toInt,
        alignmentof[CInt].toInt
      )
      res(30) = align(res(29) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(31) = align(res(30) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(32) = align(res(31) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(33) = align(res(32) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(34) = align(res(33) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res
    end offsets
  end AVCodecParserContext

  /** **********************************************
    */
  opaque type AVCodecTag = CStruct0

  object AVCodecTag:
    given _tag: Tag[AVCodecTag] = Tag.materializeCStruct0Tag

  opaque type AVDictionary = CStruct0

  object AVDictionary:
    given _tag: Tag[AVDictionary] = Tag.materializeCStruct0Tag

  /** @}
    */
  opaque type AVDictionaryEntry = CStruct2[CString, CString]

  object AVDictionaryEntry:
    given _tag: Tag[AVDictionaryEntry] =
      Tag.materializeCStruct2Tag[CString, CString]

    // Allocates AVDictionaryEntry on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVDictionaryEntry] =
      scala.scalanative.unsafe.alloc[AVDictionaryEntry](1)
    def apply(key: CString, value: CString)(using
        Zone
    ): Ptr[AVDictionaryEntry] =
      val ____ptr = apply()
      (!____ptr).key = key
      (!____ptr).value = value
      ____ptr

    extension (struct: AVDictionaryEntry)
      def key: CString = struct._1
      def key_=(value: CString): Unit = !struct.at1 = value
      def value: CString = struct._2
      def value_=(value: CString): Unit = !struct.at2 = value
  end AVDictionaryEntry

  /** Format I/O context. New fields can be added to the end with minor version
    * bumps. Removal, reordering and changes to existing fields require a major
    * version bump. sizeof(AVFormatContext) must not be used outside libav*, use
    * avformat_alloc_context() to create an AVFormatContext.
    */
  opaque type AVFormatContext =
    CArray[CChar, Nat.Digit3[Nat._4, Nat._7, Nat._2]]

  object AVFormatContext:
    given _tag: Tag[AVFormatContext] =
      Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._7, Nat._2]](
        Tag.Byte,
        Tag.Digit3[Nat._4, Nat._7, Nat._2](Tag.Nat4, Tag.Nat7, Tag.Nat2)
      )

    // Allocates AVFormatContext on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVFormatContext] =
      scala.scalanative.unsafe.alloc[AVFormatContext](1)
    def apply(
        av_class: Ptr[AVClass],
        iformat: Ptr[AVInputFormat],
        oformat: Ptr[AVOutputFormat],
        priv_data: Ptr[Byte],
        pb: Ptr[AVIOContext],
        ctx_flags: CInt,
        nb_streams: CUnsignedInt,
        streams: Ptr[Ptr[AVStream]],
        nb_stream_groups: CUnsignedInt,
        stream_groups: Ptr[Ptr[AVStreamGroup]],
        nb_chapters: CUnsignedInt,
        chapters: Ptr[Ptr[AVChapter]],
        url: CString,
        start_time: int64_t,
        duration: int64_t,
        bit_rate: int64_t,
        packet_size: CUnsignedInt,
        max_delay: CInt,
        flags: CInt,
        probesize: int64_t,
        max_analyze_duration: int64_t,
        key: Ptr[uint8_t],
        keylen: CInt,
        nb_programs: CUnsignedInt,
        programs: Ptr[Ptr[AVProgram]],
        video_codec_id: AVCodecID,
        audio_codec_id: AVCodecID,
        subtitle_codec_id: AVCodecID,
        data_codec_id: AVCodecID,
        metadata: Ptr[AVDictionary],
        start_time_realtime: int64_t,
        fps_probe_size: CInt,
        error_recognition: CInt,
        interrupt_callback: AVIOInterruptCB,
        debug: CInt,
        max_streams: CInt,
        max_index_size: CUnsignedInt,
        max_picture_buffer: CUnsignedInt,
        max_interleave_delta: int64_t,
        max_ts_probe: CInt,
        max_chunk_duration: CInt,
        max_chunk_size: CInt,
        max_probe_packets: CInt,
        strict_std_compliance: CInt,
        event_flags: CInt,
        avoid_negative_ts: CInt,
        audio_preload: CInt,
        use_wallclock_as_timestamps: CInt,
        skip_estimate_duration_from_pts: CInt,
        avio_flags: CInt,
        duration_estimation_method: AVDurationEstimationMethod,
        skip_initial_bytes: int64_t,
        correct_ts_overflow: CUnsignedInt,
        seek2any: CInt,
        flush_packets: CInt,
        probe_score: CInt,
        format_probesize: CInt,
        codec_whitelist: CString,
        format_whitelist: CString,
        protocol_whitelist: CString,
        protocol_blacklist: CString,
        io_repositioned: CInt,
        video_codec: Ptr[AVCodec],
        audio_codec: Ptr[AVCodec],
        subtitle_codec: Ptr[AVCodec],
        data_codec: Ptr[AVCodec],
        metadata_header_padding: CInt,
        opaque: Ptr[Byte],
        control_message_cb: av_format_control_message,
        output_ts_offset: int64_t,
        dump_separator: Ptr[uint8_t],
        io_open: CFuncPtr5[Ptr[AVFormatContext], Ptr[
          Ptr[AVIOContext]
        ], CString, CInt, Ptr[Ptr[AVDictionary]], CInt],
        io_close2: CFuncPtr2[Ptr[AVFormatContext], Ptr[AVIOContext], CInt],
        duration_probesize: int64_t
    )(using Zone): Ptr[AVFormatContext] =
      val ____ptr = apply()
      (!____ptr).av_class = av_class
      (!____ptr).iformat = iformat
      (!____ptr).oformat = oformat
      (!____ptr).priv_data = priv_data
      (!____ptr).pb = pb
      (!____ptr).ctx_flags = ctx_flags
      (!____ptr).nb_streams = nb_streams
      (!____ptr).streams = streams
      (!____ptr).nb_stream_groups = nb_stream_groups
      (!____ptr).stream_groups = stream_groups
      (!____ptr).nb_chapters = nb_chapters
      (!____ptr).chapters = chapters
      (!____ptr).url = url
      (!____ptr).start_time = start_time
      (!____ptr).duration = duration
      (!____ptr).bit_rate = bit_rate
      (!____ptr).packet_size = packet_size
      (!____ptr).max_delay = max_delay
      (!____ptr).flags = flags
      (!____ptr).probesize = probesize
      (!____ptr).max_analyze_duration = max_analyze_duration
      (!____ptr).key = key
      (!____ptr).keylen = keylen
      (!____ptr).nb_programs = nb_programs
      (!____ptr).programs = programs
      (!____ptr).video_codec_id = video_codec_id
      (!____ptr).audio_codec_id = audio_codec_id
      (!____ptr).subtitle_codec_id = subtitle_codec_id
      (!____ptr).data_codec_id = data_codec_id
      (!____ptr).metadata = metadata
      (!____ptr).start_time_realtime = start_time_realtime
      (!____ptr).fps_probe_size = fps_probe_size
      (!____ptr).error_recognition = error_recognition
      (!____ptr).interrupt_callback = interrupt_callback
      (!____ptr).debug = debug
      (!____ptr).max_streams = max_streams
      (!____ptr).max_index_size = max_index_size
      (!____ptr).max_picture_buffer = max_picture_buffer
      (!____ptr).max_interleave_delta = max_interleave_delta
      (!____ptr).max_ts_probe = max_ts_probe
      (!____ptr).max_chunk_duration = max_chunk_duration
      (!____ptr).max_chunk_size = max_chunk_size
      (!____ptr).max_probe_packets = max_probe_packets
      (!____ptr).strict_std_compliance = strict_std_compliance
      (!____ptr).event_flags = event_flags
      (!____ptr).avoid_negative_ts = avoid_negative_ts
      (!____ptr).audio_preload = audio_preload
      (!____ptr).use_wallclock_as_timestamps = use_wallclock_as_timestamps
      (!____ptr).skip_estimate_duration_from_pts =
        skip_estimate_duration_from_pts
      (!____ptr).avio_flags = avio_flags
      (!____ptr).duration_estimation_method = duration_estimation_method
      (!____ptr).skip_initial_bytes = skip_initial_bytes
      (!____ptr).correct_ts_overflow = correct_ts_overflow
      (!____ptr).seek2any = seek2any
      (!____ptr).flush_packets = flush_packets
      (!____ptr).probe_score = probe_score
      (!____ptr).format_probesize = format_probesize
      (!____ptr).codec_whitelist = codec_whitelist
      (!____ptr).format_whitelist = format_whitelist
      (!____ptr).protocol_whitelist = protocol_whitelist
      (!____ptr).protocol_blacklist = protocol_blacklist
      (!____ptr).io_repositioned = io_repositioned
      (!____ptr).video_codec = video_codec
      (!____ptr).audio_codec = audio_codec
      (!____ptr).subtitle_codec = subtitle_codec
      (!____ptr).data_codec = data_codec
      (!____ptr).metadata_header_padding = metadata_header_padding
      (!____ptr).opaque = opaque
      (!____ptr).control_message_cb = control_message_cb
      (!____ptr).output_ts_offset = output_ts_offset
      (!____ptr).dump_separator = dump_separator
      (!____ptr).io_open = io_open
      (!____ptr).io_close2 = io_close2
      (!____ptr).duration_probesize = duration_probesize
      ____ptr
    end apply

    extension (struct: AVFormatContext)
      def av_class: Ptr[AVClass] =
        !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[AVClass]]]
      def av_class_=(value: Ptr[AVClass]): Unit =
        !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[AVClass]]] = value
      def iformat: Ptr[AVInputFormat] =
        !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[AVInputFormat]]]
      def iformat_=(value: Ptr[AVInputFormat]): Unit =
        !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[AVInputFormat]]] = value
      def oformat: Ptr[AVOutputFormat] =
        !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[AVOutputFormat]]]
      def oformat_=(value: Ptr[AVOutputFormat]): Unit =
        !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[AVOutputFormat]]] = value
      def priv_data: Ptr[Byte] =
        !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Byte]]]
      def priv_data_=(value: Ptr[Byte]): Unit =
        !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def pb: Ptr[AVIOContext] =
        !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[AVIOContext]]]
      def pb_=(value: Ptr[AVIOContext]): Unit =
        !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[AVIOContext]]] = value
      def ctx_flags: CInt = !struct.at(offsets(5)).asInstanceOf[Ptr[CInt]]
      def ctx_flags_=(value: CInt): Unit =
        !struct.at(offsets(5)).asInstanceOf[Ptr[CInt]] = value
      def nb_streams: CUnsignedInt =
        !struct.at(offsets(6)).asInstanceOf[Ptr[CUnsignedInt]]
      def nb_streams_=(value: CUnsignedInt): Unit =
        !struct.at(offsets(6)).asInstanceOf[Ptr[CUnsignedInt]] = value
      def streams: Ptr[Ptr[AVStream]] =
        !struct.at(offsets(7)).asInstanceOf[Ptr[Ptr[Ptr[AVStream]]]]
      def streams_=(value: Ptr[Ptr[AVStream]]): Unit =
        !struct.at(offsets(7)).asInstanceOf[Ptr[Ptr[Ptr[AVStream]]]] = value
      def nb_stream_groups: CUnsignedInt =
        !struct.at(offsets(8)).asInstanceOf[Ptr[CUnsignedInt]]
      def nb_stream_groups_=(value: CUnsignedInt): Unit =
        !struct.at(offsets(8)).asInstanceOf[Ptr[CUnsignedInt]] = value
      def stream_groups: Ptr[Ptr[AVStreamGroup]] =
        !struct.at(offsets(9)).asInstanceOf[Ptr[Ptr[Ptr[AVStreamGroup]]]]
      def stream_groups_=(value: Ptr[Ptr[AVStreamGroup]]): Unit =
        !struct.at(offsets(9)).asInstanceOf[Ptr[Ptr[Ptr[AVStreamGroup]]]] =
          value
      def nb_chapters: CUnsignedInt =
        !struct.at(offsets(10)).asInstanceOf[Ptr[CUnsignedInt]]
      def nb_chapters_=(value: CUnsignedInt): Unit =
        !struct.at(offsets(10)).asInstanceOf[Ptr[CUnsignedInt]] = value
      def chapters: Ptr[Ptr[AVChapter]] =
        !struct.at(offsets(11)).asInstanceOf[Ptr[Ptr[Ptr[AVChapter]]]]
      def chapters_=(value: Ptr[Ptr[AVChapter]]): Unit =
        !struct.at(offsets(11)).asInstanceOf[Ptr[Ptr[Ptr[AVChapter]]]] = value
      def url: CString = !struct.at(offsets(12)).asInstanceOf[Ptr[CString]]
      def url_=(value: CString): Unit =
        !struct.at(offsets(12)).asInstanceOf[Ptr[CString]] = value
      def start_time: int64_t =
        !struct.at(offsets(13)).asInstanceOf[Ptr[int64_t]]
      def start_time_=(value: int64_t): Unit =
        !struct.at(offsets(13)).asInstanceOf[Ptr[int64_t]] = value
      def duration: int64_t = !struct.at(offsets(14)).asInstanceOf[Ptr[int64_t]]
      def duration_=(value: int64_t): Unit =
        !struct.at(offsets(14)).asInstanceOf[Ptr[int64_t]] = value
      def bit_rate: int64_t = !struct.at(offsets(15)).asInstanceOf[Ptr[int64_t]]
      def bit_rate_=(value: int64_t): Unit =
        !struct.at(offsets(15)).asInstanceOf[Ptr[int64_t]] = value
      def packet_size: CUnsignedInt =
        !struct.at(offsets(16)).asInstanceOf[Ptr[CUnsignedInt]]
      def packet_size_=(value: CUnsignedInt): Unit =
        !struct.at(offsets(16)).asInstanceOf[Ptr[CUnsignedInt]] = value
      def max_delay: CInt = !struct.at(offsets(17)).asInstanceOf[Ptr[CInt]]
      def max_delay_=(value: CInt): Unit =
        !struct.at(offsets(17)).asInstanceOf[Ptr[CInt]] = value
      def flags: CInt = !struct.at(offsets(18)).asInstanceOf[Ptr[CInt]]
      def flags_=(value: CInt): Unit =
        !struct.at(offsets(18)).asInstanceOf[Ptr[CInt]] = value
      def probesize: int64_t =
        !struct.at(offsets(19)).asInstanceOf[Ptr[int64_t]]
      def probesize_=(value: int64_t): Unit =
        !struct.at(offsets(19)).asInstanceOf[Ptr[int64_t]] = value
      def max_analyze_duration: int64_t =
        !struct.at(offsets(20)).asInstanceOf[Ptr[int64_t]]
      def max_analyze_duration_=(value: int64_t): Unit =
        !struct.at(offsets(20)).asInstanceOf[Ptr[int64_t]] = value
      def key: Ptr[uint8_t] =
        !struct.at(offsets(21)).asInstanceOf[Ptr[Ptr[uint8_t]]]
      def key_=(value: Ptr[uint8_t]): Unit =
        !struct.at(offsets(21)).asInstanceOf[Ptr[Ptr[uint8_t]]] = value
      def keylen: CInt = !struct.at(offsets(22)).asInstanceOf[Ptr[CInt]]
      def keylen_=(value: CInt): Unit =
        !struct.at(offsets(22)).asInstanceOf[Ptr[CInt]] = value
      def nb_programs: CUnsignedInt =
        !struct.at(offsets(23)).asInstanceOf[Ptr[CUnsignedInt]]
      def nb_programs_=(value: CUnsignedInt): Unit =
        !struct.at(offsets(23)).asInstanceOf[Ptr[CUnsignedInt]] = value
      def programs: Ptr[Ptr[AVProgram]] =
        !struct.at(offsets(24)).asInstanceOf[Ptr[Ptr[Ptr[AVProgram]]]]
      def programs_=(value: Ptr[Ptr[AVProgram]]): Unit =
        !struct.at(offsets(24)).asInstanceOf[Ptr[Ptr[Ptr[AVProgram]]]] = value
      def video_codec_id: AVCodecID =
        !struct.at(offsets(25)).asInstanceOf[Ptr[AVCodecID]]
      def video_codec_id_=(value: AVCodecID): Unit =
        !struct.at(offsets(25)).asInstanceOf[Ptr[AVCodecID]] = value
      def audio_codec_id: AVCodecID =
        !struct.at(offsets(26)).asInstanceOf[Ptr[AVCodecID]]
      def audio_codec_id_=(value: AVCodecID): Unit =
        !struct.at(offsets(26)).asInstanceOf[Ptr[AVCodecID]] = value
      def subtitle_codec_id: AVCodecID =
        !struct.at(offsets(27)).asInstanceOf[Ptr[AVCodecID]]
      def subtitle_codec_id_=(value: AVCodecID): Unit =
        !struct.at(offsets(27)).asInstanceOf[Ptr[AVCodecID]] = value
      def data_codec_id: AVCodecID =
        !struct.at(offsets(28)).asInstanceOf[Ptr[AVCodecID]]
      def data_codec_id_=(value: AVCodecID): Unit =
        !struct.at(offsets(28)).asInstanceOf[Ptr[AVCodecID]] = value
      def metadata: Ptr[AVDictionary] =
        !struct.at(offsets(29)).asInstanceOf[Ptr[Ptr[AVDictionary]]]
      def metadata_=(value: Ptr[AVDictionary]): Unit =
        !struct.at(offsets(29)).asInstanceOf[Ptr[Ptr[AVDictionary]]] = value
      def start_time_realtime: int64_t =
        !struct.at(offsets(30)).asInstanceOf[Ptr[int64_t]]
      def start_time_realtime_=(value: int64_t): Unit =
        !struct.at(offsets(30)).asInstanceOf[Ptr[int64_t]] = value
      def fps_probe_size: CInt = !struct.at(offsets(31)).asInstanceOf[Ptr[CInt]]
      def fps_probe_size_=(value: CInt): Unit =
        !struct.at(offsets(31)).asInstanceOf[Ptr[CInt]] = value
      def error_recognition: CInt =
        !struct.at(offsets(32)).asInstanceOf[Ptr[CInt]]
      def error_recognition_=(value: CInt): Unit =
        !struct.at(offsets(32)).asInstanceOf[Ptr[CInt]] = value
      def interrupt_callback: AVIOInterruptCB =
        !struct.at(offsets(33)).asInstanceOf[Ptr[AVIOInterruptCB]]
      def interrupt_callback_=(value: AVIOInterruptCB): Unit =
        !struct.at(offsets(33)).asInstanceOf[Ptr[AVIOInterruptCB]] = value
      def debug: CInt = !struct.at(offsets(34)).asInstanceOf[Ptr[CInt]]
      def debug_=(value: CInt): Unit =
        !struct.at(offsets(34)).asInstanceOf[Ptr[CInt]] = value
      def max_streams: CInt = !struct.at(offsets(35)).asInstanceOf[Ptr[CInt]]
      def max_streams_=(value: CInt): Unit =
        !struct.at(offsets(35)).asInstanceOf[Ptr[CInt]] = value
      def max_index_size: CUnsignedInt =
        !struct.at(offsets(36)).asInstanceOf[Ptr[CUnsignedInt]]
      def max_index_size_=(value: CUnsignedInt): Unit =
        !struct.at(offsets(36)).asInstanceOf[Ptr[CUnsignedInt]] = value
      def max_picture_buffer: CUnsignedInt =
        !struct.at(offsets(37)).asInstanceOf[Ptr[CUnsignedInt]]
      def max_picture_buffer_=(value: CUnsignedInt): Unit =
        !struct.at(offsets(37)).asInstanceOf[Ptr[CUnsignedInt]] = value
      def max_interleave_delta: int64_t =
        !struct.at(offsets(38)).asInstanceOf[Ptr[int64_t]]
      def max_interleave_delta_=(value: int64_t): Unit =
        !struct.at(offsets(38)).asInstanceOf[Ptr[int64_t]] = value
      def max_ts_probe: CInt = !struct.at(offsets(39)).asInstanceOf[Ptr[CInt]]
      def max_ts_probe_=(value: CInt): Unit =
        !struct.at(offsets(39)).asInstanceOf[Ptr[CInt]] = value
      def max_chunk_duration: CInt =
        !struct.at(offsets(40)).asInstanceOf[Ptr[CInt]]
      def max_chunk_duration_=(value: CInt): Unit =
        !struct.at(offsets(40)).asInstanceOf[Ptr[CInt]] = value
      def max_chunk_size: CInt = !struct.at(offsets(41)).asInstanceOf[Ptr[CInt]]
      def max_chunk_size_=(value: CInt): Unit =
        !struct.at(offsets(41)).asInstanceOf[Ptr[CInt]] = value
      def max_probe_packets: CInt =
        !struct.at(offsets(42)).asInstanceOf[Ptr[CInt]]
      def max_probe_packets_=(value: CInt): Unit =
        !struct.at(offsets(42)).asInstanceOf[Ptr[CInt]] = value
      def strict_std_compliance: CInt =
        !struct.at(offsets(43)).asInstanceOf[Ptr[CInt]]
      def strict_std_compliance_=(value: CInt): Unit =
        !struct.at(offsets(43)).asInstanceOf[Ptr[CInt]] = value
      def event_flags: CInt = !struct.at(offsets(44)).asInstanceOf[Ptr[CInt]]
      def event_flags_=(value: CInt): Unit =
        !struct.at(offsets(44)).asInstanceOf[Ptr[CInt]] = value
      def avoid_negative_ts: CInt =
        !struct.at(offsets(45)).asInstanceOf[Ptr[CInt]]
      def avoid_negative_ts_=(value: CInt): Unit =
        !struct.at(offsets(45)).asInstanceOf[Ptr[CInt]] = value
      def audio_preload: CInt = !struct.at(offsets(46)).asInstanceOf[Ptr[CInt]]
      def audio_preload_=(value: CInt): Unit =
        !struct.at(offsets(46)).asInstanceOf[Ptr[CInt]] = value
      def use_wallclock_as_timestamps: CInt =
        !struct.at(offsets(47)).asInstanceOf[Ptr[CInt]]
      def use_wallclock_as_timestamps_=(value: CInt): Unit =
        !struct.at(offsets(47)).asInstanceOf[Ptr[CInt]] = value
      def skip_estimate_duration_from_pts: CInt =
        !struct.at(offsets(48)).asInstanceOf[Ptr[CInt]]
      def skip_estimate_duration_from_pts_=(value: CInt): Unit =
        !struct.at(offsets(48)).asInstanceOf[Ptr[CInt]] = value
      def avio_flags: CInt = !struct.at(offsets(49)).asInstanceOf[Ptr[CInt]]
      def avio_flags_=(value: CInt): Unit =
        !struct.at(offsets(49)).asInstanceOf[Ptr[CInt]] = value
      def duration_estimation_method: AVDurationEstimationMethod =
        !struct.at(offsets(50)).asInstanceOf[Ptr[AVDurationEstimationMethod]]
      def duration_estimation_method_=(
          value: AVDurationEstimationMethod
      ): Unit =
        !struct.at(offsets(50)).asInstanceOf[Ptr[AVDurationEstimationMethod]] =
          value
      def skip_initial_bytes: int64_t =
        !struct.at(offsets(51)).asInstanceOf[Ptr[int64_t]]
      def skip_initial_bytes_=(value: int64_t): Unit =
        !struct.at(offsets(51)).asInstanceOf[Ptr[int64_t]] = value
      def correct_ts_overflow: CUnsignedInt =
        !struct.at(offsets(52)).asInstanceOf[Ptr[CUnsignedInt]]
      def correct_ts_overflow_=(value: CUnsignedInt): Unit =
        !struct.at(offsets(52)).asInstanceOf[Ptr[CUnsignedInt]] = value
      def seek2any: CInt = !struct.at(offsets(53)).asInstanceOf[Ptr[CInt]]
      def seek2any_=(value: CInt): Unit =
        !struct.at(offsets(53)).asInstanceOf[Ptr[CInt]] = value
      def flush_packets: CInt = !struct.at(offsets(54)).asInstanceOf[Ptr[CInt]]
      def flush_packets_=(value: CInt): Unit =
        !struct.at(offsets(54)).asInstanceOf[Ptr[CInt]] = value
      def probe_score: CInt = !struct.at(offsets(55)).asInstanceOf[Ptr[CInt]]
      def probe_score_=(value: CInt): Unit =
        !struct.at(offsets(55)).asInstanceOf[Ptr[CInt]] = value
      def format_probesize: CInt =
        !struct.at(offsets(56)).asInstanceOf[Ptr[CInt]]
      def format_probesize_=(value: CInt): Unit =
        !struct.at(offsets(56)).asInstanceOf[Ptr[CInt]] = value
      def codec_whitelist: CString =
        !struct.at(offsets(57)).asInstanceOf[Ptr[CString]]
      def codec_whitelist_=(value: CString): Unit =
        !struct.at(offsets(57)).asInstanceOf[Ptr[CString]] = value
      def format_whitelist: CString =
        !struct.at(offsets(58)).asInstanceOf[Ptr[CString]]
      def format_whitelist_=(value: CString): Unit =
        !struct.at(offsets(58)).asInstanceOf[Ptr[CString]] = value
      def protocol_whitelist: CString =
        !struct.at(offsets(59)).asInstanceOf[Ptr[CString]]
      def protocol_whitelist_=(value: CString): Unit =
        !struct.at(offsets(59)).asInstanceOf[Ptr[CString]] = value
      def protocol_blacklist: CString =
        !struct.at(offsets(60)).asInstanceOf[Ptr[CString]]
      def protocol_blacklist_=(value: CString): Unit =
        !struct.at(offsets(60)).asInstanceOf[Ptr[CString]] = value
      def io_repositioned: CInt =
        !struct.at(offsets(61)).asInstanceOf[Ptr[CInt]]
      def io_repositioned_=(value: CInt): Unit =
        !struct.at(offsets(61)).asInstanceOf[Ptr[CInt]] = value
      def video_codec: Ptr[AVCodec] =
        !struct.at(offsets(62)).asInstanceOf[Ptr[Ptr[AVCodec]]]
      def video_codec_=(value: Ptr[AVCodec]): Unit =
        !struct.at(offsets(62)).asInstanceOf[Ptr[Ptr[AVCodec]]] = value
      def audio_codec: Ptr[AVCodec] =
        !struct.at(offsets(63)).asInstanceOf[Ptr[Ptr[AVCodec]]]
      def audio_codec_=(value: Ptr[AVCodec]): Unit =
        !struct.at(offsets(63)).asInstanceOf[Ptr[Ptr[AVCodec]]] = value
      def subtitle_codec: Ptr[AVCodec] =
        !struct.at(offsets(64)).asInstanceOf[Ptr[Ptr[AVCodec]]]
      def subtitle_codec_=(value: Ptr[AVCodec]): Unit =
        !struct.at(offsets(64)).asInstanceOf[Ptr[Ptr[AVCodec]]] = value
      def data_codec: Ptr[AVCodec] =
        !struct.at(offsets(65)).asInstanceOf[Ptr[Ptr[AVCodec]]]
      def data_codec_=(value: Ptr[AVCodec]): Unit =
        !struct.at(offsets(65)).asInstanceOf[Ptr[Ptr[AVCodec]]] = value
      def metadata_header_padding: CInt =
        !struct.at(offsets(66)).asInstanceOf[Ptr[CInt]]
      def metadata_header_padding_=(value: CInt): Unit =
        !struct.at(offsets(66)).asInstanceOf[Ptr[CInt]] = value
      def opaque: Ptr[Byte] =
        !struct.at(offsets(67)).asInstanceOf[Ptr[Ptr[Byte]]]
      def opaque_=(value: Ptr[Byte]): Unit =
        !struct.at(offsets(67)).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def control_message_cb: av_format_control_message =
        !struct.at(offsets(68)).asInstanceOf[Ptr[av_format_control_message]]
      def control_message_cb_=(value: av_format_control_message): Unit =
        !struct.at(offsets(68)).asInstanceOf[Ptr[av_format_control_message]] =
          value
      def output_ts_offset: int64_t =
        !struct.at(offsets(69)).asInstanceOf[Ptr[int64_t]]
      def output_ts_offset_=(value: int64_t): Unit =
        !struct.at(offsets(69)).asInstanceOf[Ptr[int64_t]] = value
      def dump_separator: Ptr[uint8_t] =
        !struct.at(offsets(70)).asInstanceOf[Ptr[Ptr[uint8_t]]]
      def dump_separator_=(value: Ptr[uint8_t]): Unit =
        !struct.at(offsets(70)).asInstanceOf[Ptr[Ptr[uint8_t]]] = value
      def io_open: CFuncPtr5[Ptr[AVFormatContext], Ptr[
        Ptr[AVIOContext]
      ], CString, CInt, Ptr[Ptr[AVDictionary]], CInt] = !struct
        .at(offsets(71))
        .asInstanceOf[Ptr[CFuncPtr5[Ptr[AVFormatContext], Ptr[
          Ptr[AVIOContext]
        ], CString, CInt, Ptr[Ptr[AVDictionary]], CInt]]]
      def io_open_=(
          value: CFuncPtr5[Ptr[AVFormatContext], Ptr[
            Ptr[AVIOContext]
          ], CString, CInt, Ptr[Ptr[AVDictionary]], CInt]
      ): Unit = !struct
        .at(offsets(71))
        .asInstanceOf[Ptr[CFuncPtr5[Ptr[AVFormatContext], Ptr[
          Ptr[AVIOContext]
        ], CString, CInt, Ptr[Ptr[AVDictionary]], CInt]]] = value
      def io_close2: CFuncPtr2[Ptr[AVFormatContext], Ptr[AVIOContext], CInt] =
        !struct
          .at(offsets(72))
          .asInstanceOf[Ptr[
            CFuncPtr2[Ptr[AVFormatContext], Ptr[AVIOContext], CInt]
          ]]
      def io_close2_=(
          value: CFuncPtr2[Ptr[AVFormatContext], Ptr[AVIOContext], CInt]
      ): Unit = !struct
        .at(offsets(72))
        .asInstanceOf[Ptr[
          CFuncPtr2[Ptr[AVFormatContext], Ptr[AVIOContext], CInt]
        ]] = value
      def duration_probesize: int64_t =
        !struct.at(offsets(73)).asInstanceOf[Ptr[int64_t]]
      def duration_probesize_=(value: int64_t): Unit =
        !struct.at(offsets(73)).asInstanceOf[Ptr[int64_t]] = value
    end extension
    val offsets: Array[Int] =
      val res = Array.ofDim[Int](74)
      def align(offset: Int, alignment: Int) =
        val alignmentMask = alignment - 1
        val padding =
          if (offset & alignmentMask) == 0 then 0
          else alignment - (offset & alignmentMask)
        offset + padding

      res(0) = align(0, alignmentof[Ptr[AVClass]].toInt)
      res(1) = align(
        res(0) + sizeof[Ptr[AVClass]].toInt,
        alignmentof[Ptr[AVInputFormat]].toInt
      )
      res(2) = align(
        res(1) + sizeof[Ptr[AVInputFormat]].toInt,
        alignmentof[Ptr[AVOutputFormat]].toInt
      )
      res(3) = align(
        res(2) + sizeof[Ptr[AVOutputFormat]].toInt,
        alignmentof[Ptr[Byte]].toInt
      )
      res(4) = align(
        res(3) + sizeof[Ptr[Byte]].toInt,
        alignmentof[Ptr[AVIOContext]].toInt
      )
      res(5) =
        align(res(4) + sizeof[Ptr[AVIOContext]].toInt, alignmentof[CInt].toInt)
      res(6) =
        align(res(5) + sizeof[CInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(7) = align(
        res(6) + sizeof[CUnsignedInt].toInt,
        alignmentof[Ptr[Ptr[AVStream]]].toInt
      )
      res(8) = align(
        res(7) + sizeof[Ptr[Ptr[AVStream]]].toInt,
        alignmentof[CUnsignedInt].toInt
      )
      res(9) = align(
        res(8) + sizeof[CUnsignedInt].toInt,
        alignmentof[Ptr[Ptr[AVStreamGroup]]].toInt
      )
      res(10) = align(
        res(9) + sizeof[Ptr[Ptr[AVStreamGroup]]].toInt,
        alignmentof[CUnsignedInt].toInt
      )
      res(11) = align(
        res(10) + sizeof[CUnsignedInt].toInt,
        alignmentof[Ptr[Ptr[AVChapter]]].toInt
      )
      res(12) = align(
        res(11) + sizeof[Ptr[Ptr[AVChapter]]].toInt,
        alignmentof[CString].toInt
      )
      res(13) =
        align(res(12) + sizeof[CString].toInt, alignmentof[int64_t].toInt)
      res(14) =
        align(res(13) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res(15) =
        align(res(14) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res(16) =
        align(res(15) + sizeof[int64_t].toInt, alignmentof[CUnsignedInt].toInt)
      res(17) =
        align(res(16) + sizeof[CUnsignedInt].toInt, alignmentof[CInt].toInt)
      res(18) = align(res(17) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(19) = align(res(18) + sizeof[CInt].toInt, alignmentof[int64_t].toInt)
      res(20) =
        align(res(19) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res(21) =
        align(res(20) + sizeof[int64_t].toInt, alignmentof[Ptr[uint8_t]].toInt)
      res(22) =
        align(res(21) + sizeof[Ptr[uint8_t]].toInt, alignmentof[CInt].toInt)
      res(23) =
        align(res(22) + sizeof[CInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(24) = align(
        res(23) + sizeof[CUnsignedInt].toInt,
        alignmentof[Ptr[Ptr[AVProgram]]].toInt
      )
      res(25) = align(
        res(24) + sizeof[Ptr[Ptr[AVProgram]]].toInt,
        alignmentof[AVCodecID].toInt
      )
      res(26) =
        align(res(25) + sizeof[AVCodecID].toInt, alignmentof[AVCodecID].toInt)
      res(27) =
        align(res(26) + sizeof[AVCodecID].toInt, alignmentof[AVCodecID].toInt)
      res(28) =
        align(res(27) + sizeof[AVCodecID].toInt, alignmentof[AVCodecID].toInt)
      res(29) = align(
        res(28) + sizeof[AVCodecID].toInt,
        alignmentof[Ptr[AVDictionary]].toInt
      )
      res(30) = align(
        res(29) + sizeof[Ptr[AVDictionary]].toInt,
        alignmentof[int64_t].toInt
      )
      res(31) = align(res(30) + sizeof[int64_t].toInt, alignmentof[CInt].toInt)
      res(32) = align(res(31) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(33) =
        align(res(32) + sizeof[CInt].toInt, alignmentof[AVIOInterruptCB].toInt)
      res(34) =
        align(res(33) + sizeof[AVIOInterruptCB].toInt, alignmentof[CInt].toInt)
      res(35) = align(res(34) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(36) =
        align(res(35) + sizeof[CInt].toInt, alignmentof[CUnsignedInt].toInt)
      res(37) = align(
        res(36) + sizeof[CUnsignedInt].toInt,
        alignmentof[CUnsignedInt].toInt
      )
      res(38) =
        align(res(37) + sizeof[CUnsignedInt].toInt, alignmentof[int64_t].toInt)
      res(39) = align(res(38) + sizeof[int64_t].toInt, alignmentof[CInt].toInt)
      res(40) = align(res(39) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(41) = align(res(40) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(42) = align(res(41) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(43) = align(res(42) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(44) = align(res(43) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(45) = align(res(44) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(46) = align(res(45) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(47) = align(res(46) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(48) = align(res(47) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(49) = align(res(48) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(50) = align(
        res(49) + sizeof[CInt].toInt,
        alignmentof[AVDurationEstimationMethod].toInt
      )
      res(51) = align(
        res(50) + sizeof[AVDurationEstimationMethod].toInt,
        alignmentof[int64_t].toInt
      )
      res(52) =
        align(res(51) + sizeof[int64_t].toInt, alignmentof[CUnsignedInt].toInt)
      res(53) =
        align(res(52) + sizeof[CUnsignedInt].toInt, alignmentof[CInt].toInt)
      res(54) = align(res(53) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(55) = align(res(54) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(56) = align(res(55) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(57) = align(res(56) + sizeof[CInt].toInt, alignmentof[CString].toInt)
      res(58) =
        align(res(57) + sizeof[CString].toInt, alignmentof[CString].toInt)
      res(59) =
        align(res(58) + sizeof[CString].toInt, alignmentof[CString].toInt)
      res(60) =
        align(res(59) + sizeof[CString].toInt, alignmentof[CString].toInt)
      res(61) = align(res(60) + sizeof[CString].toInt, alignmentof[CInt].toInt)
      res(62) =
        align(res(61) + sizeof[CInt].toInt, alignmentof[Ptr[AVCodec]].toInt)
      res(63) = align(
        res(62) + sizeof[Ptr[AVCodec]].toInt,
        alignmentof[Ptr[AVCodec]].toInt
      )
      res(64) = align(
        res(63) + sizeof[Ptr[AVCodec]].toInt,
        alignmentof[Ptr[AVCodec]].toInt
      )
      res(65) = align(
        res(64) + sizeof[Ptr[AVCodec]].toInt,
        alignmentof[Ptr[AVCodec]].toInt
      )
      res(66) =
        align(res(65) + sizeof[Ptr[AVCodec]].toInt, alignmentof[CInt].toInt)
      res(67) =
        align(res(66) + sizeof[CInt].toInt, alignmentof[Ptr[Byte]].toInt)
      res(68) = align(
        res(67) + sizeof[Ptr[Byte]].toInt,
        alignmentof[av_format_control_message].toInt
      )
      res(69) = align(
        res(68) + sizeof[av_format_control_message].toInt,
        alignmentof[int64_t].toInt
      )
      res(70) =
        align(res(69) + sizeof[int64_t].toInt, alignmentof[Ptr[uint8_t]].toInt)
      res(71) = align(
        res(70) + sizeof[Ptr[uint8_t]].toInt,
        alignmentof[CFuncPtr5[Ptr[AVFormatContext], Ptr[
          Ptr[AVIOContext]
        ], CString, CInt, Ptr[Ptr[AVDictionary]], CInt]].toInt
      )
      res(72) = align(
        res(71) + sizeof[CFuncPtr5[Ptr[AVFormatContext], Ptr[
          Ptr[AVIOContext]
        ], CString, CInt, Ptr[Ptr[AVDictionary]], CInt]].toInt,
        alignmentof[
          CFuncPtr2[Ptr[AVFormatContext], Ptr[AVIOContext], CInt]
        ].toInt
      )
      res(73) = align(
        res(72) + sizeof[
          CFuncPtr2[Ptr[AVFormatContext], Ptr[AVIOContext], CInt]
        ].toInt,
        alignmentof[int64_t].toInt
      )
      res
    end offsets
  end AVFormatContext

  /** This structure describes decoded (raw) audio or video data.
    */
  opaque type AVFrame = CStruct0

  object AVFrame:
    given _tag: Tag[AVFrame] = Tag.materializeCStruct0Tag

  /** Structure to hold side data for an AVFrame.
    */
  opaque type AVFrameSideData = CStruct5[AVFrameSideDataType, Ptr[
    uint8_t
  ], size_t, Ptr[AVDictionary], Ptr[AVBufferRef]]

  object AVFrameSideData:
    given _tag: Tag[AVFrameSideData] =
      Tag.materializeCStruct5Tag[AVFrameSideDataType, Ptr[uint8_t], size_t, Ptr[
        AVDictionary
      ], Ptr[AVBufferRef]]

    // Allocates AVFrameSideData on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVFrameSideData] =
      scala.scalanative.unsafe.alloc[AVFrameSideData](1)
    def apply(
        `type`: AVFrameSideDataType,
        data: Ptr[uint8_t],
        size: size_t,
        metadata: Ptr[AVDictionary],
        buf: Ptr[AVBufferRef]
    )(using Zone): Ptr[AVFrameSideData] =
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).data = data
      (!____ptr).size = size
      (!____ptr).metadata = metadata
      (!____ptr).buf = buf
      ____ptr
    end apply

    extension (struct: AVFrameSideData)
      def `type`: AVFrameSideDataType = struct._1
      def type_=(value: AVFrameSideDataType): Unit = !struct.at1 = value
      def data: Ptr[uint8_t] = struct._2
      def data_=(value: Ptr[uint8_t]): Unit = !struct.at2 = value
      def size: size_t = struct._3
      def size_=(value: size_t): Unit = !struct.at3 = value
      def metadata: Ptr[AVDictionary] = struct._4
      def metadata_=(value: Ptr[AVDictionary]): Unit = !struct.at4 = value
      def buf: Ptr[AVBufferRef] = struct._5
      def buf_=(value: Ptr[AVBufferRef]): Unit = !struct.at5 = value
    end extension
  end AVFrameSideData

  opaque type AVHWAccel =
    CStruct5[CString, AVMediaType, AVCodecID, AVPixelFormat, CInt]

  object AVHWAccel:
    given _tag: Tag[AVHWAccel] = Tag.materializeCStruct5Tag[
      CString,
      AVMediaType,
      AVCodecID,
      AVPixelFormat,
      CInt
    ]

    // Allocates AVHWAccel on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVHWAccel] =
      scala.scalanative.unsafe.alloc[AVHWAccel](1)
    def apply(
        name: CString,
        `type`: AVMediaType,
        id: AVCodecID,
        pix_fmt: AVPixelFormat,
        capabilities: CInt
    )(using Zone): Ptr[AVHWAccel] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).`type` = `type`
      (!____ptr).id = id
      (!____ptr).pix_fmt = pix_fmt
      (!____ptr).capabilities = capabilities
      ____ptr
    end apply

    extension (struct: AVHWAccel)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def `type`: AVMediaType = struct._2
      def type_=(value: AVMediaType): Unit = !struct.at2 = value
      def id: AVCodecID = struct._3
      def id_=(value: AVCodecID): Unit = !struct.at3 = value
      def pix_fmt: AVPixelFormat = struct._4
      def pix_fmt_=(value: AVPixelFormat): Unit = !struct.at4 = value
      def capabilities: CInt = struct._5
      def capabilities_=(value: CInt): Unit = !struct.at5 = value
    end extension
  end AVHWAccel

  /** This struct aggregates all the (hardware/vendor-specific) "high-level"
    * state, i.e. state that is not tied to a concrete processing configuration.
    * E.g., in an API that supports hardware-accelerated encoding and decoding,
    * this struct will (if possible) wrap the state that is common to both
    * encoding and decoding and from which specific instances of encoders or
    * decoders can be derived.
    */
  opaque type AVHWDeviceContext = CStruct5[Ptr[Byte], AVHWDeviceType, Ptr[
    Byte
  ], CFuncPtr1[Ptr[Byte], Unit], Ptr[Byte]]

  object AVHWDeviceContext:
    given _tag: Tag[AVHWDeviceContext] = Tag.materializeCStruct5Tag[Ptr[
      Byte
    ], AVHWDeviceType, Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], Ptr[Byte]]

    // Allocates AVHWDeviceContext on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVHWDeviceContext] =
      scala.scalanative.unsafe.alloc[AVHWDeviceContext](1)
    def apply(
        av_class: Ptr[AVClass],
        `type`: AVHWDeviceType,
        hwctx: Ptr[Byte],
        free: CFuncPtr1[Ptr[AVHWDeviceContext], Unit],
        user_opaque: Ptr[Byte]
    )(using Zone): Ptr[AVHWDeviceContext] =
      val ____ptr = apply()
      (!____ptr).av_class = av_class
      (!____ptr).`type` = `type`
      (!____ptr).hwctx = hwctx
      (!____ptr).free = free
      (!____ptr).user_opaque = user_opaque
      ____ptr
    end apply

    extension (struct: AVHWDeviceContext)
      def av_class: Ptr[AVClass] = struct._1.asInstanceOf[Ptr[AVClass]]
      def av_class_=(value: Ptr[AVClass]): Unit = !struct.at1 =
        value.asInstanceOf[Ptr[Byte]]
      def `type`: AVHWDeviceType = struct._2
      def type_=(value: AVHWDeviceType): Unit = !struct.at2 = value
      def hwctx: Ptr[Byte] = struct._3
      def hwctx_=(value: Ptr[Byte]): Unit = !struct.at3 = value
      def free: CFuncPtr1[Ptr[AVHWDeviceContext], Unit] =
        struct._4.asInstanceOf[CFuncPtr1[Ptr[AVHWDeviceContext], Unit]]
      def free_=(value: CFuncPtr1[Ptr[AVHWDeviceContext], Unit]): Unit =
        !struct.at4 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
      def user_opaque: Ptr[Byte] = struct._5
      def user_opaque_=(value: Ptr[Byte]): Unit = !struct.at5 = value
    end extension
  end AVHWDeviceContext

  /** This struct describes the constraints on hardware frames attached to a
    * given device with a hardware-specific configuration. This is returned by
    * av_hwdevice_get_hwframe_constraints() and must be freed by
    * av_hwframe_constraints_free() after use.
    */
  opaque type AVHWFramesConstraints =
    CStruct6[Ptr[AVPixelFormat], Ptr[AVPixelFormat], CInt, CInt, CInt, CInt]

  object AVHWFramesConstraints:
    given _tag: Tag[AVHWFramesConstraints] = Tag.materializeCStruct6Tag[Ptr[
      AVPixelFormat
    ], Ptr[AVPixelFormat], CInt, CInt, CInt, CInt]

    // Allocates AVHWFramesConstraints on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVHWFramesConstraints] =
      scala.scalanative.unsafe.alloc[AVHWFramesConstraints](1)
    def apply(
        valid_hw_formats: Ptr[AVPixelFormat],
        valid_sw_formats: Ptr[AVPixelFormat],
        min_width: CInt,
        min_height: CInt,
        max_width: CInt,
        max_height: CInt
    )(using Zone): Ptr[AVHWFramesConstraints] =
      val ____ptr = apply()
      (!____ptr).valid_hw_formats = valid_hw_formats
      (!____ptr).valid_sw_formats = valid_sw_formats
      (!____ptr).min_width = min_width
      (!____ptr).min_height = min_height
      (!____ptr).max_width = max_width
      (!____ptr).max_height = max_height
      ____ptr
    end apply

    extension (struct: AVHWFramesConstraints)
      def valid_hw_formats: Ptr[AVPixelFormat] = struct._1
      def valid_hw_formats_=(value: Ptr[AVPixelFormat]): Unit = !struct.at1 =
        value
      def valid_sw_formats: Ptr[AVPixelFormat] = struct._2
      def valid_sw_formats_=(value: Ptr[AVPixelFormat]): Unit = !struct.at2 =
        value
      def min_width: CInt = struct._3
      def min_width_=(value: CInt): Unit = !struct.at3 = value
      def min_height: CInt = struct._4
      def min_height_=(value: CInt): Unit = !struct.at4 = value
      def max_width: CInt = struct._5
      def max_width_=(value: CInt): Unit = !struct.at5 = value
      def max_height: CInt = struct._6
      def max_height_=(value: CInt): Unit = !struct.at6 = value
    end extension
  end AVHWFramesConstraints

  /** This struct describes a set or pool of "hardware" frames (i.e. those with
    * data not located in normal system memory). All the frames in the pool are
    * assumed to be allocated in the same way and interchangeable.
    */
  opaque type AVHWFramesContext = CStruct12[
    Ptr[Byte],
    Ptr[AVBufferRef],
    Ptr[Byte],
    Ptr[Byte],
    CFuncPtr1[Ptr[Byte], Unit],
    Ptr[Byte],
    Ptr[AVBufferPool],
    CInt,
    AVPixelFormat,
    AVPixelFormat,
    CInt,
    CInt
  ]

  object AVHWFramesContext:
    given _tag: Tag[AVHWFramesContext] = Tag.materializeCStruct12Tag[Ptr[
      Byte
    ], Ptr[AVBufferRef], Ptr[Byte], Ptr[Byte], CFuncPtr1[Ptr[Byte], Unit], Ptr[
      Byte
    ], Ptr[AVBufferPool], CInt, AVPixelFormat, AVPixelFormat, CInt, CInt]

    // Allocates AVHWFramesContext on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVHWFramesContext] =
      scala.scalanative.unsafe.alloc[AVHWFramesContext](1)
    def apply(
        av_class: Ptr[AVClass],
        device_ref: Ptr[AVBufferRef],
        device_ctx: Ptr[AVHWDeviceContext],
        hwctx: Ptr[Byte],
        free: CFuncPtr1[Ptr[AVHWFramesContext], Unit],
        user_opaque: Ptr[Byte],
        pool: Ptr[AVBufferPool],
        initial_pool_size: CInt,
        format: AVPixelFormat,
        sw_format: AVPixelFormat,
        width: CInt,
        height: CInt
    )(using Zone): Ptr[AVHWFramesContext] =
      val ____ptr = apply()
      (!____ptr).av_class = av_class
      (!____ptr).device_ref = device_ref
      (!____ptr).device_ctx = device_ctx
      (!____ptr).hwctx = hwctx
      (!____ptr).free = free
      (!____ptr).user_opaque = user_opaque
      (!____ptr).pool = pool
      (!____ptr).initial_pool_size = initial_pool_size
      (!____ptr).format = format
      (!____ptr).sw_format = sw_format
      (!____ptr).width = width
      (!____ptr).height = height
      ____ptr
    end apply

    extension (struct: AVHWFramesContext)
      def av_class: Ptr[AVClass] = struct._1.asInstanceOf[Ptr[AVClass]]
      def av_class_=(value: Ptr[AVClass]): Unit = !struct.at1 =
        value.asInstanceOf[Ptr[Byte]]
      def device_ref: Ptr[AVBufferRef] = struct._2
      def device_ref_=(value: Ptr[AVBufferRef]): Unit = !struct.at2 = value
      def device_ctx: Ptr[AVHWDeviceContext] =
        struct._3.asInstanceOf[Ptr[AVHWDeviceContext]]
      def device_ctx_=(value: Ptr[AVHWDeviceContext]): Unit = !struct.at3 =
        value.asInstanceOf[Ptr[Byte]]
      def hwctx: Ptr[Byte] = struct._4
      def hwctx_=(value: Ptr[Byte]): Unit = !struct.at4 = value
      def free: CFuncPtr1[Ptr[AVHWFramesContext], Unit] =
        struct._5.asInstanceOf[CFuncPtr1[Ptr[AVHWFramesContext], Unit]]
      def free_=(value: CFuncPtr1[Ptr[AVHWFramesContext], Unit]): Unit =
        !struct.at5 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]]
      def user_opaque: Ptr[Byte] = struct._6
      def user_opaque_=(value: Ptr[Byte]): Unit = !struct.at6 = value
      def pool: Ptr[AVBufferPool] = struct._7
      def pool_=(value: Ptr[AVBufferPool]): Unit = !struct.at7 = value
      def initial_pool_size: CInt = struct._8
      def initial_pool_size_=(value: CInt): Unit = !struct.at8 = value
      def format: AVPixelFormat = struct._9
      def format_=(value: AVPixelFormat): Unit = !struct.at9 = value
      def sw_format: AVPixelFormat = struct._10
      def sw_format_=(value: AVPixelFormat): Unit = !struct.at10 = value
      def width: CInt = struct._11
      def width_=(value: CInt): Unit = !struct.at11 = value
      def height: CInt = struct._12
      def height_=(value: CInt): Unit = !struct.at12 = value
    end extension
  end AVHWFramesContext

  opaque type AVIAMFAudioElement = CStruct0

  object AVIAMFAudioElement:
    given _tag: Tag[AVIAMFAudioElement] = Tag.materializeCStruct0Tag

  opaque type AVIAMFMixPresentation = CStruct0

  object AVIAMFMixPresentation:
    given _tag: Tag[AVIAMFMixPresentation] = Tag.materializeCStruct0Tag

  /** Bytestream IO Context. New public fields can be added with minor version
    * bumps. Removal, reordering and changes to existing public fields require a
    * major version bump. sizeof(AVIOContext) must not be used outside libav*.
    */
  opaque type AVIOContext = CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._8]]

  object AVIOContext:
    given _tag: Tag[AVIOContext] =
      Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._8]](
        Tag.Byte,
        Tag.Digit3[Nat._2, Nat._0, Nat._8](Tag.Nat2, Tag.Nat0, Tag.Nat8)
      )

    // Allocates AVIOContext on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVIOContext] =
      scala.scalanative.unsafe.alloc[AVIOContext](1)
    def apply(
        av_class: Ptr[AVClass],
        buffer: Ptr[CUnsignedChar],
        buffer_size: CInt,
        buf_ptr: Ptr[CUnsignedChar],
        buf_end: Ptr[CUnsignedChar],
        opaque: Ptr[Byte],
        read_packet: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt],
        write_packet: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt],
        seek: CFuncPtr3[Ptr[Byte], int64_t, CInt, int64_t],
        pos: int64_t,
        eof_reached: CInt,
        error: CInt,
        write_flag: CInt,
        max_packet_size: CInt,
        min_packet_size: CInt,
        checksum: CUnsignedLongInt,
        checksum_ptr: Ptr[CUnsignedChar],
        update_checksum: CFuncPtr3[CUnsignedLongInt, Ptr[
          uint8_t
        ], CUnsignedInt, CUnsignedLongInt],
        read_pause: CFuncPtr2[Ptr[Byte], CInt, CInt],
        read_seek: CFuncPtr4[Ptr[Byte], CInt, int64_t, CInt, int64_t],
        seekable: CInt,
        direct: CInt,
        protocol_whitelist: CString,
        protocol_blacklist: CString,
        write_data_type: CFuncPtr5[Ptr[Byte], Ptr[
          uint8_t
        ], CInt, AVIODataMarkerType, int64_t, CInt],
        ignore_boundary_point: CInt,
        buf_ptr_max: Ptr[CUnsignedChar],
        bytes_read: int64_t,
        bytes_written: int64_t
    )(using Zone): Ptr[AVIOContext] =
      val ____ptr = apply()
      (!____ptr).av_class = av_class
      (!____ptr).buffer = buffer
      (!____ptr).buffer_size = buffer_size
      (!____ptr).buf_ptr = buf_ptr
      (!____ptr).buf_end = buf_end
      (!____ptr).opaque = opaque
      (!____ptr).read_packet = read_packet
      (!____ptr).write_packet = write_packet
      (!____ptr).seek = seek
      (!____ptr).pos = pos
      (!____ptr).eof_reached = eof_reached
      (!____ptr).error = error
      (!____ptr).write_flag = write_flag
      (!____ptr).max_packet_size = max_packet_size
      (!____ptr).min_packet_size = min_packet_size
      (!____ptr).checksum = checksum
      (!____ptr).checksum_ptr = checksum_ptr
      (!____ptr).update_checksum = update_checksum
      (!____ptr).read_pause = read_pause
      (!____ptr).read_seek = read_seek
      (!____ptr).seekable = seekable
      (!____ptr).direct = direct
      (!____ptr).protocol_whitelist = protocol_whitelist
      (!____ptr).protocol_blacklist = protocol_blacklist
      (!____ptr).write_data_type = write_data_type
      (!____ptr).ignore_boundary_point = ignore_boundary_point
      (!____ptr).buf_ptr_max = buf_ptr_max
      (!____ptr).bytes_read = bytes_read
      (!____ptr).bytes_written = bytes_written
      ____ptr
    end apply

    extension (struct: AVIOContext)
      def av_class: Ptr[AVClass] =
        !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[AVClass]]]
      def av_class_=(value: Ptr[AVClass]): Unit =
        !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[AVClass]]] = value
      def buffer: Ptr[CUnsignedChar] =
        !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[CUnsignedChar]]]
      def buffer_=(value: Ptr[CUnsignedChar]): Unit =
        !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[CUnsignedChar]]] = value
      def buffer_size: CInt = !struct.at(offsets(2)).asInstanceOf[Ptr[CInt]]
      def buffer_size_=(value: CInt): Unit =
        !struct.at(offsets(2)).asInstanceOf[Ptr[CInt]] = value
      def buf_ptr: Ptr[CUnsignedChar] =
        !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[CUnsignedChar]]]
      def buf_ptr_=(value: Ptr[CUnsignedChar]): Unit =
        !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[CUnsignedChar]]] = value
      def buf_end: Ptr[CUnsignedChar] =
        !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[CUnsignedChar]]]
      def buf_end_=(value: Ptr[CUnsignedChar]): Unit =
        !struct.at(offsets(4)).asInstanceOf[Ptr[Ptr[CUnsignedChar]]] = value
      def opaque: Ptr[Byte] =
        !struct.at(offsets(5)).asInstanceOf[Ptr[Ptr[Byte]]]
      def opaque_=(value: Ptr[Byte]): Unit =
        !struct.at(offsets(5)).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def read_packet: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt] = !struct
        .at(offsets(6))
        .asInstanceOf[Ptr[CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt]]]
      def read_packet_=(
          value: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt]
      ): Unit = !struct
        .at(offsets(6))
        .asInstanceOf[Ptr[CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt]]] =
        value
      def write_packet: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt] = !struct
        .at(offsets(7))
        .asInstanceOf[Ptr[CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt]]]
      def write_packet_=(
          value: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt]
      ): Unit = !struct
        .at(offsets(7))
        .asInstanceOf[Ptr[CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt]]] =
        value
      def seek: CFuncPtr3[Ptr[Byte], int64_t, CInt, int64_t] = !struct
        .at(offsets(8))
        .asInstanceOf[Ptr[CFuncPtr3[Ptr[Byte], int64_t, CInt, int64_t]]]
      def seek_=(value: CFuncPtr3[Ptr[Byte], int64_t, CInt, int64_t]): Unit =
        !struct
          .at(offsets(8))
          .asInstanceOf[Ptr[CFuncPtr3[Ptr[Byte], int64_t, CInt, int64_t]]] =
          value
      def pos: int64_t = !struct.at(offsets(9)).asInstanceOf[Ptr[int64_t]]
      def pos_=(value: int64_t): Unit =
        !struct.at(offsets(9)).asInstanceOf[Ptr[int64_t]] = value
      def eof_reached: CInt = !struct.at(offsets(10)).asInstanceOf[Ptr[CInt]]
      def eof_reached_=(value: CInt): Unit =
        !struct.at(offsets(10)).asInstanceOf[Ptr[CInt]] = value
      def error: CInt = !struct.at(offsets(11)).asInstanceOf[Ptr[CInt]]
      def error_=(value: CInt): Unit =
        !struct.at(offsets(11)).asInstanceOf[Ptr[CInt]] = value
      def write_flag: CInt = !struct.at(offsets(12)).asInstanceOf[Ptr[CInt]]
      def write_flag_=(value: CInt): Unit =
        !struct.at(offsets(12)).asInstanceOf[Ptr[CInt]] = value
      def max_packet_size: CInt =
        !struct.at(offsets(13)).asInstanceOf[Ptr[CInt]]
      def max_packet_size_=(value: CInt): Unit =
        !struct.at(offsets(13)).asInstanceOf[Ptr[CInt]] = value
      def min_packet_size: CInt =
        !struct.at(offsets(14)).asInstanceOf[Ptr[CInt]]
      def min_packet_size_=(value: CInt): Unit =
        !struct.at(offsets(14)).asInstanceOf[Ptr[CInt]] = value
      def checksum: CUnsignedLongInt =
        !struct.at(offsets(15)).asInstanceOf[Ptr[CUnsignedLongInt]]
      def checksum_=(value: CUnsignedLongInt): Unit =
        !struct.at(offsets(15)).asInstanceOf[Ptr[CUnsignedLongInt]] = value
      def checksum_ptr: Ptr[CUnsignedChar] =
        !struct.at(offsets(16)).asInstanceOf[Ptr[Ptr[CUnsignedChar]]]
      def checksum_ptr_=(value: Ptr[CUnsignedChar]): Unit =
        !struct.at(offsets(16)).asInstanceOf[Ptr[Ptr[CUnsignedChar]]] = value
      def update_checksum: CFuncPtr3[CUnsignedLongInt, Ptr[
        uint8_t
      ], CUnsignedInt, CUnsignedLongInt] = !struct
        .at(offsets(17))
        .asInstanceOf[Ptr[CFuncPtr3[CUnsignedLongInt, Ptr[
          uint8_t
        ], CUnsignedInt, CUnsignedLongInt]]]
      def update_checksum_=(
          value: CFuncPtr3[CUnsignedLongInt, Ptr[
            uint8_t
          ], CUnsignedInt, CUnsignedLongInt]
      ): Unit = !struct
        .at(offsets(17))
        .asInstanceOf[Ptr[CFuncPtr3[CUnsignedLongInt, Ptr[
          uint8_t
        ], CUnsignedInt, CUnsignedLongInt]]] = value
      def read_pause: CFuncPtr2[Ptr[Byte], CInt, CInt] = !struct
        .at(offsets(18))
        .asInstanceOf[Ptr[CFuncPtr2[Ptr[Byte], CInt, CInt]]]
      def read_pause_=(value: CFuncPtr2[Ptr[Byte], CInt, CInt]): Unit = !struct
        .at(offsets(18))
        .asInstanceOf[Ptr[CFuncPtr2[Ptr[Byte], CInt, CInt]]] = value
      def read_seek: CFuncPtr4[Ptr[Byte], CInt, int64_t, CInt, int64_t] =
        !struct
          .at(offsets(19))
          .asInstanceOf[Ptr[CFuncPtr4[Ptr[Byte], CInt, int64_t, CInt, int64_t]]]
      def read_seek_=(
          value: CFuncPtr4[Ptr[Byte], CInt, int64_t, CInt, int64_t]
      ): Unit = !struct
        .at(offsets(19))
        .asInstanceOf[Ptr[CFuncPtr4[Ptr[Byte], CInt, int64_t, CInt, int64_t]]] =
        value
      def seekable: CInt = !struct.at(offsets(20)).asInstanceOf[Ptr[CInt]]
      def seekable_=(value: CInt): Unit =
        !struct.at(offsets(20)).asInstanceOf[Ptr[CInt]] = value
      def direct: CInt = !struct.at(offsets(21)).asInstanceOf[Ptr[CInt]]
      def direct_=(value: CInt): Unit =
        !struct.at(offsets(21)).asInstanceOf[Ptr[CInt]] = value
      def protocol_whitelist: CString =
        !struct.at(offsets(22)).asInstanceOf[Ptr[CString]]
      def protocol_whitelist_=(value: CString): Unit =
        !struct.at(offsets(22)).asInstanceOf[Ptr[CString]] = value
      def protocol_blacklist: CString =
        !struct.at(offsets(23)).asInstanceOf[Ptr[CString]]
      def protocol_blacklist_=(value: CString): Unit =
        !struct.at(offsets(23)).asInstanceOf[Ptr[CString]] = value
      def write_data_type: CFuncPtr5[Ptr[Byte], Ptr[
        uint8_t
      ], CInt, AVIODataMarkerType, int64_t, CInt] = !struct
        .at(offsets(24))
        .asInstanceOf[Ptr[CFuncPtr5[Ptr[Byte], Ptr[
          uint8_t
        ], CInt, AVIODataMarkerType, int64_t, CInt]]]
      def write_data_type_=(
          value: CFuncPtr5[Ptr[Byte], Ptr[
            uint8_t
          ], CInt, AVIODataMarkerType, int64_t, CInt]
      ): Unit = !struct
        .at(offsets(24))
        .asInstanceOf[Ptr[CFuncPtr5[Ptr[Byte], Ptr[
          uint8_t
        ], CInt, AVIODataMarkerType, int64_t, CInt]]] = value
      def ignore_boundary_point: CInt =
        !struct.at(offsets(25)).asInstanceOf[Ptr[CInt]]
      def ignore_boundary_point_=(value: CInt): Unit =
        !struct.at(offsets(25)).asInstanceOf[Ptr[CInt]] = value
      def buf_ptr_max: Ptr[CUnsignedChar] =
        !struct.at(offsets(26)).asInstanceOf[Ptr[Ptr[CUnsignedChar]]]
      def buf_ptr_max_=(value: Ptr[CUnsignedChar]): Unit =
        !struct.at(offsets(26)).asInstanceOf[Ptr[Ptr[CUnsignedChar]]] = value
      def bytes_read: int64_t =
        !struct.at(offsets(27)).asInstanceOf[Ptr[int64_t]]
      def bytes_read_=(value: int64_t): Unit =
        !struct.at(offsets(27)).asInstanceOf[Ptr[int64_t]] = value
      def bytes_written: int64_t =
        !struct.at(offsets(28)).asInstanceOf[Ptr[int64_t]]
      def bytes_written_=(value: int64_t): Unit =
        !struct.at(offsets(28)).asInstanceOf[Ptr[int64_t]] = value
    end extension
    val offsets: Array[Int] =
      val res = Array.ofDim[Int](29)
      def align(offset: Int, alignment: Int) =
        val alignmentMask = alignment - 1
        val padding =
          if (offset & alignmentMask) == 0 then 0
          else alignment - (offset & alignmentMask)
        offset + padding

      res(0) = align(0, alignmentof[Ptr[AVClass]].toInt)
      res(1) = align(
        res(0) + sizeof[Ptr[AVClass]].toInt,
        alignmentof[Ptr[CUnsignedChar]].toInt
      )
      res(2) = align(
        res(1) + sizeof[Ptr[CUnsignedChar]].toInt,
        alignmentof[CInt].toInt
      )
      res(3) = align(
        res(2) + sizeof[CInt].toInt,
        alignmentof[Ptr[CUnsignedChar]].toInt
      )
      res(4) = align(
        res(3) + sizeof[Ptr[CUnsignedChar]].toInt,
        alignmentof[Ptr[CUnsignedChar]].toInt
      )
      res(5) = align(
        res(4) + sizeof[Ptr[CUnsignedChar]].toInt,
        alignmentof[Ptr[Byte]].toInt
      )
      res(6) = align(
        res(5) + sizeof[Ptr[Byte]].toInt,
        alignmentof[CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt]].toInt
      )
      res(7) = align(
        res(6) + sizeof[CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt]].toInt,
        alignmentof[CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt]].toInt
      )
      res(8) = align(
        res(7) + sizeof[CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt]].toInt,
        alignmentof[CFuncPtr3[Ptr[Byte], int64_t, CInt, int64_t]].toInt
      )
      res(9) = align(
        res(8) + sizeof[CFuncPtr3[Ptr[Byte], int64_t, CInt, int64_t]].toInt,
        alignmentof[int64_t].toInt
      )
      res(10) = align(res(9) + sizeof[int64_t].toInt, alignmentof[CInt].toInt)
      res(11) = align(res(10) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(12) = align(res(11) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(13) = align(res(12) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(14) = align(res(13) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(15) =
        align(res(14) + sizeof[CInt].toInt, alignmentof[CUnsignedLongInt].toInt)
      res(16) = align(
        res(15) + sizeof[CUnsignedLongInt].toInt,
        alignmentof[Ptr[CUnsignedChar]].toInt
      )
      res(17) = align(
        res(16) + sizeof[Ptr[CUnsignedChar]].toInt,
        alignmentof[CFuncPtr3[CUnsignedLongInt, Ptr[
          uint8_t
        ], CUnsignedInt, CUnsignedLongInt]].toInt
      )
      res(18) = align(
        res(17) + sizeof[CFuncPtr3[CUnsignedLongInt, Ptr[
          uint8_t
        ], CUnsignedInt, CUnsignedLongInt]].toInt,
        alignmentof[CFuncPtr2[Ptr[Byte], CInt, CInt]].toInt
      )
      res(19) = align(
        res(18) + sizeof[CFuncPtr2[Ptr[Byte], CInt, CInt]].toInt,
        alignmentof[CFuncPtr4[Ptr[Byte], CInt, int64_t, CInt, int64_t]].toInt
      )
      res(20) = align(
        res(19) + sizeof[
          CFuncPtr4[Ptr[Byte], CInt, int64_t, CInt, int64_t]
        ].toInt,
        alignmentof[CInt].toInt
      )
      res(21) = align(res(20) + sizeof[CInt].toInt, alignmentof[CInt].toInt)
      res(22) = align(res(21) + sizeof[CInt].toInt, alignmentof[CString].toInt)
      res(23) =
        align(res(22) + sizeof[CString].toInt, alignmentof[CString].toInt)
      res(24) = align(
        res(23) + sizeof[CString].toInt,
        alignmentof[CFuncPtr5[Ptr[Byte], Ptr[
          uint8_t
        ], CInt, AVIODataMarkerType, int64_t, CInt]].toInt
      )
      res(25) = align(
        res(24) + sizeof[CFuncPtr5[Ptr[Byte], Ptr[
          uint8_t
        ], CInt, AVIODataMarkerType, int64_t, CInt]].toInt,
        alignmentof[CInt].toInt
      )
      res(26) = align(
        res(25) + sizeof[CInt].toInt,
        alignmentof[Ptr[CUnsignedChar]].toInt
      )
      res(27) = align(
        res(26) + sizeof[Ptr[CUnsignedChar]].toInt,
        alignmentof[int64_t].toInt
      )
      res(28) =
        align(res(27) + sizeof[int64_t].toInt, alignmentof[int64_t].toInt)
      res
    end offsets
  end AVIOContext

  opaque type AVIODirContext = CStruct0

  object AVIODirContext:
    given _tag: Tag[AVIODirContext] = Tag.materializeCStruct0Tag

  /** Describes single entry of the directory.
    */
  opaque type AVIODirEntry = CStruct10[
    CString,
    CInt,
    CInt,
    int64_t,
    int64_t,
    int64_t,
    int64_t,
    int64_t,
    int64_t,
    int64_t
  ]

  object AVIODirEntry:
    given _tag: Tag[AVIODirEntry] = Tag.materializeCStruct10Tag[
      CString,
      CInt,
      CInt,
      int64_t,
      int64_t,
      int64_t,
      int64_t,
      int64_t,
      int64_t,
      int64_t
    ]

    // Allocates AVIODirEntry on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVIODirEntry] =
      scala.scalanative.unsafe.alloc[AVIODirEntry](1)
    def apply(
        name: CString,
        `type`: CInt,
        utf8: CInt,
        size: int64_t,
        modification_timestamp: int64_t,
        access_timestamp: int64_t,
        status_change_timestamp: int64_t,
        user_id: int64_t,
        group_id: int64_t,
        filemode: int64_t
    )(using Zone): Ptr[AVIODirEntry] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).`type` = `type`
      (!____ptr).utf8 = utf8
      (!____ptr).size = size
      (!____ptr).modification_timestamp = modification_timestamp
      (!____ptr).access_timestamp = access_timestamp
      (!____ptr).status_change_timestamp = status_change_timestamp
      (!____ptr).user_id = user_id
      (!____ptr).group_id = group_id
      (!____ptr).filemode = filemode
      ____ptr
    end apply

    extension (struct: AVIODirEntry)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def `type`: CInt = struct._2
      def type_=(value: CInt): Unit = !struct.at2 = value
      def utf8: CInt = struct._3
      def utf8_=(value: CInt): Unit = !struct.at3 = value
      def size: int64_t = struct._4
      def size_=(value: int64_t): Unit = !struct.at4 = value
      def modification_timestamp: int64_t = struct._5
      def modification_timestamp_=(value: int64_t): Unit = !struct.at5 = value
      def access_timestamp: int64_t = struct._6
      def access_timestamp_=(value: int64_t): Unit = !struct.at6 = value
      def status_change_timestamp: int64_t = struct._7
      def status_change_timestamp_=(value: int64_t): Unit = !struct.at7 = value
      def user_id: int64_t = struct._8
      def user_id_=(value: int64_t): Unit = !struct.at8 = value
      def group_id: int64_t = struct._9
      def group_id_=(value: int64_t): Unit = !struct.at9 = value
      def filemode: int64_t = struct._10
      def filemode_=(value: int64_t): Unit = !struct.at10 = value
    end extension
  end AVIODirEntry

  /** Callback for checking whether to abort blocking functions. AVERROR_EXIT is
    * returned in this case by the interrupted function. During blocking
    * operations, callback is called with opaque as parameter. If the callback
    * returns 1, the blocking operation will be aborted.
    */
  opaque type AVIOInterruptCB = CStruct2[CFuncPtr1[Ptr[Byte], CInt], Ptr[Byte]]

  object AVIOInterruptCB:
    given _tag: Tag[AVIOInterruptCB] =
      Tag.materializeCStruct2Tag[CFuncPtr1[Ptr[Byte], CInt], Ptr[Byte]]

    // Allocates AVIOInterruptCB on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVIOInterruptCB] =
      scala.scalanative.unsafe.alloc[AVIOInterruptCB](1)
    def apply(callback: CFuncPtr1[Ptr[Byte], CInt], opaque: Ptr[Byte])(using
        Zone
    ): Ptr[AVIOInterruptCB] =
      val ____ptr = apply()
      (!____ptr).callback = callback
      (!____ptr).opaque = opaque
      ____ptr

    extension (struct: AVIOInterruptCB)
      def callback: CFuncPtr1[Ptr[Byte], CInt] = struct._1
      def callback_=(value: CFuncPtr1[Ptr[Byte], CInt]): Unit = !struct.at1 =
        value
      def opaque: Ptr[Byte] = struct._2
      def opaque_=(value: Ptr[Byte]): Unit = !struct.at2 = value
  end AVIOInterruptCB

  opaque type AVIndexEntry = CStruct5[int64_t, int64_t, CInt, CInt, CInt]

  object AVIndexEntry:
    given _tag: Tag[AVIndexEntry] =
      Tag.materializeCStruct5Tag[int64_t, int64_t, CInt, CInt, CInt]

    // Allocates AVIndexEntry on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVIndexEntry] =
      scala.scalanative.unsafe.alloc[AVIndexEntry](1)
    def apply(
        pos: int64_t,
        timestamp: int64_t,
        flags: CInt,
        size: CInt,
        min_distance: CInt
    )(using Zone): Ptr[AVIndexEntry] =
      val ____ptr = apply()
      (!____ptr).pos = pos
      (!____ptr).timestamp = timestamp
      (!____ptr).flags = flags
      (!____ptr).size = size
      (!____ptr).min_distance = min_distance
      ____ptr
    end apply

    extension (struct: AVIndexEntry)
      def pos: int64_t = struct._1
      def pos_=(value: int64_t): Unit = !struct.at1 = value
      def timestamp: int64_t = struct._2
      def timestamp_=(value: int64_t): Unit = !struct.at2 = value
      def flags: CInt = struct._3
      def flags_=(value: CInt): Unit = !struct.at3 = value
      def size: CInt = struct._4
      def size_=(value: CInt): Unit = !struct.at4 = value
      def min_distance: CInt = struct._5
      def min_distance_=(value: CInt): Unit = !struct.at5 = value
    end extension
  end AVIndexEntry

  /** @{
    */
  opaque type AVInputFormat = CStruct7[CString, CString, CInt, CString, Ptr[
    Ptr[AVCodecTag]
  ], Ptr[Byte], CString]

  object AVInputFormat:
    given _tag: Tag[AVInputFormat] =
      Tag.materializeCStruct7Tag[CString, CString, CInt, CString, Ptr[
        Ptr[AVCodecTag]
      ], Ptr[Byte], CString]

    // Allocates AVInputFormat on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVInputFormat] =
      scala.scalanative.unsafe.alloc[AVInputFormat](1)
    def apply(
        name: CString,
        long_name: CString,
        flags: CInt,
        extensions: CString,
        codec_tag: Ptr[Ptr[AVCodecTag]],
        priv_class: Ptr[AVClass],
        mime_type: CString
    )(using Zone): Ptr[AVInputFormat] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).long_name = long_name
      (!____ptr).flags = flags
      (!____ptr).extensions = extensions
      (!____ptr).codec_tag = codec_tag
      (!____ptr).priv_class = priv_class
      (!____ptr).mime_type = mime_type
      ____ptr
    end apply

    extension (struct: AVInputFormat)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def long_name: CString = struct._2
      def long_name_=(value: CString): Unit = !struct.at2 = value
      def flags: CInt = struct._3
      def flags_=(value: CInt): Unit = !struct.at3 = value
      def extensions: CString = struct._4
      def extensions_=(value: CString): Unit = !struct.at4 = value
      def codec_tag: Ptr[Ptr[AVCodecTag]] = struct._5
      def codec_tag_=(value: Ptr[Ptr[AVCodecTag]]): Unit = !struct.at5 = value
      def priv_class: Ptr[AVClass] = struct._6.asInstanceOf[Ptr[AVClass]]
      def priv_class_=(value: Ptr[AVClass]): Unit = !struct.at6 =
        value.asInstanceOf[Ptr[Byte]]
      def mime_type: CString = struct._7
      def mime_type_=(value: CString): Unit = !struct.at7 = value
    end extension
  end AVInputFormat

  opaque type AVOption = CStruct0

  object AVOption:
    given _tag: Tag[AVOption] = Tag.materializeCStruct0Tag

  opaque type AVOptionRanges = CStruct0

  object AVOptionRanges:
    given _tag: Tag[AVOptionRanges] = Tag.materializeCStruct0Tag

  /** @{
    */
  opaque type AVOutputFormat = CStruct10[
    CString,
    CString,
    CString,
    CString,
    AVCodecID,
    AVCodecID,
    AVCodecID,
    CInt,
    Ptr[Ptr[AVCodecTag]],
    Ptr[Byte]
  ]

  object AVOutputFormat:
    given _tag: Tag[AVOutputFormat] = Tag.materializeCStruct10Tag[
      CString,
      CString,
      CString,
      CString,
      AVCodecID,
      AVCodecID,
      AVCodecID,
      CInt,
      Ptr[Ptr[AVCodecTag]],
      Ptr[Byte]
    ]

    // Allocates AVOutputFormat on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVOutputFormat] =
      scala.scalanative.unsafe.alloc[AVOutputFormat](1)
    def apply(
        name: CString,
        long_name: CString,
        mime_type: CString,
        extensions: CString,
        audio_codec: AVCodecID,
        video_codec: AVCodecID,
        subtitle_codec: AVCodecID,
        flags: CInt,
        codec_tag: Ptr[Ptr[AVCodecTag]],
        priv_class: Ptr[AVClass]
    )(using Zone): Ptr[AVOutputFormat] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).long_name = long_name
      (!____ptr).mime_type = mime_type
      (!____ptr).extensions = extensions
      (!____ptr).audio_codec = audio_codec
      (!____ptr).video_codec = video_codec
      (!____ptr).subtitle_codec = subtitle_codec
      (!____ptr).flags = flags
      (!____ptr).codec_tag = codec_tag
      (!____ptr).priv_class = priv_class
      ____ptr
    end apply

    extension (struct: AVOutputFormat)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def long_name: CString = struct._2
      def long_name_=(value: CString): Unit = !struct.at2 = value
      def mime_type: CString = struct._3
      def mime_type_=(value: CString): Unit = !struct.at3 = value
      def extensions: CString = struct._4
      def extensions_=(value: CString): Unit = !struct.at4 = value
      def audio_codec: AVCodecID = struct._5
      def audio_codec_=(value: AVCodecID): Unit = !struct.at5 = value
      def video_codec: AVCodecID = struct._6
      def video_codec_=(value: AVCodecID): Unit = !struct.at6 = value
      def subtitle_codec: AVCodecID = struct._7
      def subtitle_codec_=(value: AVCodecID): Unit = !struct.at7 = value
      def flags: CInt = struct._8
      def flags_=(value: CInt): Unit = !struct.at8 = value
      def codec_tag: Ptr[Ptr[AVCodecTag]] = struct._9
      def codec_tag_=(value: Ptr[Ptr[AVCodecTag]]): Unit = !struct.at9 = value
      def priv_class: Ptr[AVClass] = struct._10.asInstanceOf[Ptr[AVClass]]
      def priv_class_=(value: Ptr[AVClass]): Unit = !struct.at10 =
        value.asInstanceOf[Ptr[Byte]]
    end extension
  end AVOutputFormat

  /** This structure stores compressed data. It is typically exported by
    * demuxers and then passed as input to decoders, or received as output from
    * encoders and then passed to muxers.
    */
  opaque type AVPacket = CStruct14[
    Ptr[AVBufferRef],
    int64_t,
    int64_t,
    Ptr[uint8_t],
    CInt,
    CInt,
    CInt,
    Ptr[AVPacketSideData],
    CInt,
    int64_t,
    int64_t,
    Ptr[Byte],
    Ptr[AVBufferRef],
    AVRational
  ]

  object AVPacket:
    given _tag: Tag[AVPacket] = Tag.materializeCStruct14Tag[Ptr[
      AVBufferRef
    ], int64_t, int64_t, Ptr[uint8_t], CInt, CInt, CInt, Ptr[
      AVPacketSideData
    ], CInt, int64_t, int64_t, Ptr[Byte], Ptr[AVBufferRef], AVRational]

    // Allocates AVPacket on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVPacket] =
      scala.scalanative.unsafe.alloc[AVPacket](1)
    def apply(
        buf: Ptr[AVBufferRef],
        pts: int64_t,
        dts: int64_t,
        data: Ptr[uint8_t],
        size: CInt,
        stream_index: CInt,
        flags: CInt,
        side_data: Ptr[AVPacketSideData],
        side_data_elems: CInt,
        duration: int64_t,
        pos: int64_t,
        opaque: Ptr[Byte],
        opaque_ref: Ptr[AVBufferRef],
        time_base: AVRational
    )(using Zone): Ptr[AVPacket] =
      val ____ptr = apply()
      (!____ptr).buf = buf
      (!____ptr).pts = pts
      (!____ptr).dts = dts
      (!____ptr).data = data
      (!____ptr).size = size
      (!____ptr).stream_index = stream_index
      (!____ptr).flags = flags
      (!____ptr).side_data = side_data
      (!____ptr).side_data_elems = side_data_elems
      (!____ptr).duration = duration
      (!____ptr).pos = pos
      (!____ptr).opaque = opaque
      (!____ptr).opaque_ref = opaque_ref
      (!____ptr).time_base = time_base
      ____ptr
    end apply

    extension (struct: AVPacket)
      def buf: Ptr[AVBufferRef] = struct._1
      def buf_=(value: Ptr[AVBufferRef]): Unit = !struct.at1 = value
      def pts: int64_t = struct._2
      def pts_=(value: int64_t): Unit = !struct.at2 = value
      def dts: int64_t = struct._3
      def dts_=(value: int64_t): Unit = !struct.at3 = value
      def data: Ptr[uint8_t] = struct._4
      def data_=(value: Ptr[uint8_t]): Unit = !struct.at4 = value
      def size: CInt = struct._5
      def size_=(value: CInt): Unit = !struct.at5 = value
      def stream_index: CInt = struct._6
      def stream_index_=(value: CInt): Unit = !struct.at6 = value
      def flags: CInt = struct._7
      def flags_=(value: CInt): Unit = !struct.at7 = value
      def side_data: Ptr[AVPacketSideData] = struct._8
      def side_data_=(value: Ptr[AVPacketSideData]): Unit = !struct.at8 = value
      def side_data_elems: CInt = struct._9
      def side_data_elems_=(value: CInt): Unit = !struct.at9 = value
      def duration: int64_t = struct._10
      def duration_=(value: int64_t): Unit = !struct.at10 = value
      def pos: int64_t = struct._11
      def pos_=(value: int64_t): Unit = !struct.at11 = value
      def opaque: Ptr[Byte] = struct._12
      def opaque_=(value: Ptr[Byte]): Unit = !struct.at12 = value
      def opaque_ref: Ptr[AVBufferRef] = struct._13
      def opaque_ref_=(value: Ptr[AVBufferRef]): Unit = !struct.at13 = value
      def time_base: AVRational = struct._14
      def time_base_=(value: AVRational): Unit = !struct.at14 = value
    end extension
  end AVPacket

  opaque type AVPacketList = CStruct2[AVPacket, Ptr[Byte]]

  object AVPacketList:
    given _tag: Tag[AVPacketList] =
      Tag.materializeCStruct2Tag[AVPacket, Ptr[Byte]]

    // Allocates AVPacketList on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVPacketList] =
      scala.scalanative.unsafe.alloc[AVPacketList](1)
    def apply(pkt: AVPacket, next: Ptr[AVPacketList])(using
        Zone
    ): Ptr[AVPacketList] =
      val ____ptr = apply()
      (!____ptr).pkt = pkt
      (!____ptr).next = next
      ____ptr

    extension (struct: AVPacketList)
      def pkt: AVPacket = struct._1
      def pkt_=(value: AVPacket): Unit = !struct.at1 = value
      def next: Ptr[AVPacketList] = struct._2.asInstanceOf[Ptr[AVPacketList]]
      def next_=(value: Ptr[AVPacketList]): Unit = !struct.at2 =
        value.asInstanceOf[Ptr[Byte]]
  end AVPacketList

  /** This structure stores auxiliary information for decoding, presenting, or
    * otherwise processing the coded stream. It is typically exported by
    * demuxers and encoders and can be fed to decoders and muxers either in a
    * per packet basis, or as global side data (applying to the entire coded
    * stream).
    */
  opaque type AVPacketSideData =
    CStruct3[Ptr[uint8_t], size_t, AVPacketSideDataType]

  object AVPacketSideData:
    given _tag: Tag[AVPacketSideData] =
      Tag.materializeCStruct3Tag[Ptr[uint8_t], size_t, AVPacketSideDataType]

    // Allocates AVPacketSideData on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVPacketSideData] =
      scala.scalanative.unsafe.alloc[AVPacketSideData](1)
    def apply(data: Ptr[uint8_t], size: size_t, `type`: AVPacketSideDataType)(
        using Zone
    ): Ptr[AVPacketSideData] =
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).size = size
      (!____ptr).`type` = `type`
      ____ptr

    extension (struct: AVPacketSideData)
      def data: Ptr[uint8_t] = struct._1
      def data_=(value: Ptr[uint8_t]): Unit = !struct.at1 = value
      def size: size_t = struct._2
      def size_=(value: size_t): Unit = !struct.at2 = value
      def `type`: AVPacketSideDataType = struct._3
      def type_=(value: AVPacketSideDataType): Unit = !struct.at3 = value
  end AVPacketSideData

  /** Pan Scan area. This specifies the area which should be displayed. Note
    * there may be multiple such areas for one frame.
    */
  opaque type AVPanScan =
    CStruct4[CInt, CInt, CInt, CArray[CArray[int16_t, Nat._2], Nat._3]]

  object AVPanScan:
    given _tag: Tag[AVPanScan] =
      Tag.materializeCStruct4Tag[CInt, CInt, CInt, CArray[
        CArray[int16_t, Nat._2],
        Nat._3
      ]]

    // Allocates AVPanScan on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVPanScan] =
      scala.scalanative.unsafe.alloc[AVPanScan](1)
    def apply(
        id: CInt,
        width: CInt,
        height: CInt,
        position: CArray[CArray[int16_t, Nat._2], Nat._3]
    )(using Zone): Ptr[AVPanScan] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).width = width
      (!____ptr).height = height
      (!____ptr).position = position
      ____ptr
    end apply

    extension (struct: AVPanScan)
      def id: CInt = struct._1
      def id_=(value: CInt): Unit = !struct.at1 = value
      def width: CInt = struct._2
      def width_=(value: CInt): Unit = !struct.at2 = value
      def height: CInt = struct._3
      def height_=(value: CInt): Unit = !struct.at3 = value
      def position: CArray[CArray[int16_t, Nat._2], Nat._3] = struct._4
      def position_=(value: CArray[CArray[int16_t, Nat._2], Nat._3]): Unit =
        !struct.at4 = value
    end extension
  end AVPanScan

  /** This structure contains the data a format has to probe a file.
    */
  opaque type AVProbeData = CStruct4[CString, Ptr[CUnsignedChar], CInt, CString]

  object AVProbeData:
    given _tag: Tag[AVProbeData] =
      Tag.materializeCStruct4Tag[CString, Ptr[CUnsignedChar], CInt, CString]

    // Allocates AVProbeData on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVProbeData] =
      scala.scalanative.unsafe.alloc[AVProbeData](1)
    def apply(
        filename: CString,
        buf: Ptr[CUnsignedChar],
        buf_size: CInt,
        mime_type: CString
    )(using Zone): Ptr[AVProbeData] =
      val ____ptr = apply()
      (!____ptr).filename = filename
      (!____ptr).buf = buf
      (!____ptr).buf_size = buf_size
      (!____ptr).mime_type = mime_type
      ____ptr
    end apply

    extension (struct: AVProbeData)
      def filename: CString = struct._1
      def filename_=(value: CString): Unit = !struct.at1 = value
      def buf: Ptr[CUnsignedChar] = struct._2
      def buf_=(value: Ptr[CUnsignedChar]): Unit = !struct.at2 = value
      def buf_size: CInt = struct._3
      def buf_size_=(value: CInt): Unit = !struct.at3 = value
      def mime_type: CString = struct._4
      def mime_type_=(value: CString): Unit = !struct.at4 = value
  end AVProbeData

  /** This structure supplies correlation between a packet timestamp and a wall
    * clock production time. The definition follows the Producer Reference Time
    * ('prft') as defined in ISO/IEC 14496-12
    */
  opaque type AVProducerReferenceTime = CStruct2[int64_t, CInt]

  object AVProducerReferenceTime:
    given _tag: Tag[AVProducerReferenceTime] =
      Tag.materializeCStruct2Tag[int64_t, CInt]

    // Allocates AVProducerReferenceTime on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVProducerReferenceTime] =
      scala.scalanative.unsafe.alloc[AVProducerReferenceTime](1)
    def apply(wallclock: int64_t, flags: CInt)(using
        Zone
    ): Ptr[AVProducerReferenceTime] =
      val ____ptr = apply()
      (!____ptr).wallclock = wallclock
      (!____ptr).flags = flags
      ____ptr

    extension (struct: AVProducerReferenceTime)
      def wallclock: int64_t = struct._1
      def wallclock_=(value: int64_t): Unit = !struct.at1 = value
      def flags: CInt = struct._2
      def flags_=(value: CInt): Unit = !struct.at2 = value
  end AVProducerReferenceTime

  /** AVProfile.
    */
  opaque type AVProfile = CStruct2[CInt, CString]

  object AVProfile:
    given _tag: Tag[AVProfile] = Tag.materializeCStruct2Tag[CInt, CString]

    // Allocates AVProfile on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVProfile] =
      scala.scalanative.unsafe.alloc[AVProfile](1)
    def apply(profile: CInt, name: CString)(using Zone): Ptr[AVProfile] =
      val ____ptr = apply()
      (!____ptr).profile = profile
      (!____ptr).name = name
      ____ptr

    extension (struct: AVProfile)
      def profile: CInt = struct._1
      def profile_=(value: CInt): Unit = !struct.at1 = value
      def name: CString = struct._2
      def name_=(value: CString): Unit = !struct.at2 = value
  end AVProfile

  /** New fields can be added to the end with minor version bumps. Removal,
    * reordering and changes to existing fields require a major version bump.
    * sizeof(AVProgram) must not be used outside libav*.
    */
  opaque type AVProgram =
    CStruct14[CInt, CInt, AVDiscard, Ptr[CUnsignedInt], CUnsignedInt, Ptr[
      AVDictionary
    ], CInt, CInt, CInt, CInt, int64_t, int64_t, int64_t, CInt]

  object AVProgram:
    given _tag: Tag[AVProgram] =
      Tag.materializeCStruct14Tag[CInt, CInt, AVDiscard, Ptr[
        CUnsignedInt
      ], CUnsignedInt, Ptr[
        AVDictionary
      ], CInt, CInt, CInt, CInt, int64_t, int64_t, int64_t, CInt]

    // Allocates AVProgram on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVProgram] =
      scala.scalanative.unsafe.alloc[AVProgram](1)
    def apply(
        id: CInt,
        flags: CInt,
        discard: AVDiscard,
        stream_index: Ptr[CUnsignedInt],
        nb_stream_indexes: CUnsignedInt,
        metadata: Ptr[AVDictionary],
        program_num: CInt,
        pmt_pid: CInt,
        pcr_pid: CInt,
        pmt_version: CInt,
        start_time: int64_t,
        end_time: int64_t,
        pts_wrap_reference: int64_t,
        pts_wrap_behavior: CInt
    )(using Zone): Ptr[AVProgram] =
      val ____ptr = apply()
      (!____ptr).id = id
      (!____ptr).flags = flags
      (!____ptr).discard = discard
      (!____ptr).stream_index = stream_index
      (!____ptr).nb_stream_indexes = nb_stream_indexes
      (!____ptr).metadata = metadata
      (!____ptr).program_num = program_num
      (!____ptr).pmt_pid = pmt_pid
      (!____ptr).pcr_pid = pcr_pid
      (!____ptr).pmt_version = pmt_version
      (!____ptr).start_time = start_time
      (!____ptr).end_time = end_time
      (!____ptr).pts_wrap_reference = pts_wrap_reference
      (!____ptr).pts_wrap_behavior = pts_wrap_behavior
      ____ptr
    end apply

    extension (struct: AVProgram)
      def id: CInt = struct._1
      def id_=(value: CInt): Unit = !struct.at1 = value
      def flags: CInt = struct._2
      def flags_=(value: CInt): Unit = !struct.at2 = value
      def discard: AVDiscard = struct._3
      def discard_=(value: AVDiscard): Unit = !struct.at3 = value
      def stream_index: Ptr[CUnsignedInt] = struct._4
      def stream_index_=(value: Ptr[CUnsignedInt]): Unit = !struct.at4 = value
      def nb_stream_indexes: CUnsignedInt = struct._5
      def nb_stream_indexes_=(value: CUnsignedInt): Unit = !struct.at5 = value
      def metadata: Ptr[AVDictionary] = struct._6
      def metadata_=(value: Ptr[AVDictionary]): Unit = !struct.at6 = value
      def program_num: CInt = struct._7
      def program_num_=(value: CInt): Unit = !struct.at7 = value
      def pmt_pid: CInt = struct._8
      def pmt_pid_=(value: CInt): Unit = !struct.at8 = value
      def pcr_pid: CInt = struct._9
      def pcr_pid_=(value: CInt): Unit = !struct.at9 = value
      def pmt_version: CInt = struct._10
      def pmt_version_=(value: CInt): Unit = !struct.at10 = value
      def start_time: int64_t = struct._11
      def start_time_=(value: int64_t): Unit = !struct.at11 = value
      def end_time: int64_t = struct._12
      def end_time_=(value: int64_t): Unit = !struct.at12 = value
      def pts_wrap_reference: int64_t = struct._13
      def pts_wrap_reference_=(value: int64_t): Unit = !struct.at13 = value
      def pts_wrap_behavior: CInt = struct._14
      def pts_wrap_behavior_=(value: CInt): Unit = !struct.at14 = value
    end extension
  end AVProgram

  /** Rational number (pair of numerator and denominator).
    */
  opaque type AVRational = CStruct2[CInt, CInt]

  object AVRational:
    given _tag: Tag[AVRational] = Tag.materializeCStruct2Tag[CInt, CInt]

    // Allocates AVRational on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVRational] =
      scala.scalanative.unsafe.alloc[AVRational](1)
    def apply(num: CInt, den: CInt)(using Zone): Ptr[AVRational] =
      val ____ptr = apply()
      (!____ptr).num = num
      (!____ptr).den = den
      ____ptr

    extension (struct: AVRational)
      def num: CInt = struct._1
      def num_=(value: CInt): Unit = !struct.at1 = value
      def den: CInt = struct._2
      def den_=(value: CInt): Unit = !struct.at2 = value
  end AVRational

  /** Structure describing a single Region Of Interest.
    */
  opaque type AVRegionOfInterest =
    CStruct6[uint32_t, CInt, CInt, CInt, CInt, AVRational]

  object AVRegionOfInterest:
    given _tag: Tag[AVRegionOfInterest] =
      Tag.materializeCStruct6Tag[uint32_t, CInt, CInt, CInt, CInt, AVRational]

    // Allocates AVRegionOfInterest on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVRegionOfInterest] =
      scala.scalanative.unsafe.alloc[AVRegionOfInterest](1)
    def apply(
        self_size: uint32_t,
        top: CInt,
        bottom: CInt,
        left: CInt,
        right: CInt,
        qoffset: AVRational
    )(using Zone): Ptr[AVRegionOfInterest] =
      val ____ptr = apply()
      (!____ptr).self_size = self_size
      (!____ptr).top = top
      (!____ptr).bottom = bottom
      (!____ptr).left = left
      (!____ptr).right = right
      (!____ptr).qoffset = qoffset
      ____ptr
    end apply

    extension (struct: AVRegionOfInterest)
      def self_size: uint32_t = struct._1
      def self_size_=(value: uint32_t): Unit = !struct.at1 = value
      def top: CInt = struct._2
      def top_=(value: CInt): Unit = !struct.at2 = value
      def bottom: CInt = struct._3
      def bottom_=(value: CInt): Unit = !struct.at3 = value
      def left: CInt = struct._4
      def left_=(value: CInt): Unit = !struct.at4 = value
      def right: CInt = struct._5
      def right_=(value: CInt): Unit = !struct.at5 = value
      def qoffset: AVRational = struct._6
      def qoffset_=(value: AVRational): Unit = !struct.at6 = value
    end extension
  end AVRegionOfInterest

  /** This struct describes the properties of a side data type. Its instance
    * corresponding to a given type can be obtained from
    * av_frame_side_data_desc().
    */
  opaque type AVSideDataDescriptor = CStruct2[CString, CUnsignedInt]

  object AVSideDataDescriptor:
    given _tag: Tag[AVSideDataDescriptor] =
      Tag.materializeCStruct2Tag[CString, CUnsignedInt]

    // Allocates AVSideDataDescriptor on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVSideDataDescriptor] =
      scala.scalanative.unsafe.alloc[AVSideDataDescriptor](1)
    def apply(name: CString, props: CUnsignedInt)(using
        Zone
    ): Ptr[AVSideDataDescriptor] =
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).props = props
      ____ptr

    extension (struct: AVSideDataDescriptor)
      def name: CString = struct._1
      def name_=(value: CString): Unit = !struct.at1 = value
      def props: CUnsignedInt = struct._2
      def props_=(value: CUnsignedInt): Unit = !struct.at2 = value
  end AVSideDataDescriptor

  /** Stream structure. New fields can be added to the end with minor version
    * bumps. Removal, reordering and changes to existing fields require a major
    * version bump. sizeof(AVStream) must not be used outside libav*.
    */
  opaque type AVStream = CStruct20[
    Ptr[Byte],
    CInt,
    CInt,
    Ptr[AVCodecParameters],
    Ptr[Byte],
    AVRational,
    int64_t,
    int64_t,
    int64_t,
    CInt,
    AVDiscard,
    AVRational,
    Ptr[AVDictionary],
    AVRational,
    AVPacket,
    Ptr[AVPacketSideData],
    CInt,
    CInt,
    AVRational,
    CInt
  ]

  object AVStream:
    given _tag: Tag[AVStream] = Tag.materializeCStruct20Tag[
      Ptr[Byte],
      CInt,
      CInt,
      Ptr[AVCodecParameters],
      Ptr[Byte],
      AVRational,
      int64_t,
      int64_t,
      int64_t,
      CInt,
      AVDiscard,
      AVRational,
      Ptr[AVDictionary],
      AVRational,
      AVPacket,
      Ptr[AVPacketSideData],
      CInt,
      CInt,
      AVRational,
      CInt
    ]

    // Allocates AVStream on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVStream] =
      scala.scalanative.unsafe.alloc[AVStream](1)
    def apply(
        av_class: Ptr[AVClass],
        index: CInt,
        id: CInt,
        codecpar: Ptr[AVCodecParameters],
        priv_data: Ptr[Byte],
        time_base: AVRational,
        start_time: int64_t,
        duration: int64_t,
        nb_frames: int64_t,
        disposition: CInt,
        discard: AVDiscard,
        sample_aspect_ratio: AVRational,
        metadata: Ptr[AVDictionary],
        avg_frame_rate: AVRational,
        attached_pic: AVPacket,
        side_data: Ptr[AVPacketSideData],
        nb_side_data: CInt,
        event_flags: CInt,
        r_frame_rate: AVRational,
        pts_wrap_bits: CInt
    )(using Zone): Ptr[AVStream] =
      val ____ptr = apply()
      (!____ptr).av_class = av_class
      (!____ptr).index = index
      (!____ptr).id = id
      (!____ptr).codecpar = codecpar
      (!____ptr).priv_data = priv_data
      (!____ptr).time_base = time_base
      (!____ptr).start_time = start_time
      (!____ptr).duration = duration
      (!____ptr).nb_frames = nb_frames
      (!____ptr).disposition = disposition
      (!____ptr).discard = discard
      (!____ptr).sample_aspect_ratio = sample_aspect_ratio
      (!____ptr).metadata = metadata
      (!____ptr).avg_frame_rate = avg_frame_rate
      (!____ptr).attached_pic = attached_pic
      (!____ptr).side_data = side_data
      (!____ptr).nb_side_data = nb_side_data
      (!____ptr).event_flags = event_flags
      (!____ptr).r_frame_rate = r_frame_rate
      (!____ptr).pts_wrap_bits = pts_wrap_bits
      ____ptr
    end apply

    extension (struct: AVStream)
      def av_class: Ptr[AVClass] = struct._1.asInstanceOf[Ptr[AVClass]]
      def av_class_=(value: Ptr[AVClass]): Unit = !struct.at1 =
        value.asInstanceOf[Ptr[Byte]]
      def index: CInt = struct._2
      def index_=(value: CInt): Unit = !struct.at2 = value
      def id: CInt = struct._3
      def id_=(value: CInt): Unit = !struct.at3 = value
      def codecpar: Ptr[AVCodecParameters] = struct._4
      def codecpar_=(value: Ptr[AVCodecParameters]): Unit = !struct.at4 = value
      def priv_data: Ptr[Byte] = struct._5
      def priv_data_=(value: Ptr[Byte]): Unit = !struct.at5 = value
      def time_base: AVRational = struct._6
      def time_base_=(value: AVRational): Unit = !struct.at6 = value
      def start_time: int64_t = struct._7
      def start_time_=(value: int64_t): Unit = !struct.at7 = value
      def duration: int64_t = struct._8
      def duration_=(value: int64_t): Unit = !struct.at8 = value
      def nb_frames: int64_t = struct._9
      def nb_frames_=(value: int64_t): Unit = !struct.at9 = value
      def disposition: CInt = struct._10
      def disposition_=(value: CInt): Unit = !struct.at10 = value
      def discard: AVDiscard = struct._11
      def discard_=(value: AVDiscard): Unit = !struct.at11 = value
      def sample_aspect_ratio: AVRational = struct._12
      def sample_aspect_ratio_=(value: AVRational): Unit = !struct.at12 = value
      def metadata: Ptr[AVDictionary] = struct._13
      def metadata_=(value: Ptr[AVDictionary]): Unit = !struct.at13 = value
      def avg_frame_rate: AVRational = struct._14
      def avg_frame_rate_=(value: AVRational): Unit = !struct.at14 = value
      def attached_pic: AVPacket = struct._15
      def attached_pic_=(value: AVPacket): Unit = !struct.at15 = value
      def side_data: Ptr[AVPacketSideData] = struct._16
      def side_data_=(value: Ptr[AVPacketSideData]): Unit = !struct.at16 = value
      def nb_side_data: CInt = struct._17
      def nb_side_data_=(value: CInt): Unit = !struct.at17 = value
      def event_flags: CInt = struct._18
      def event_flags_=(value: CInt): Unit = !struct.at18 = value
      def r_frame_rate: AVRational = struct._19
      def r_frame_rate_=(value: AVRational): Unit = !struct.at19 = value
      def pts_wrap_bits: CInt = struct._20
      def pts_wrap_bits_=(value: CInt): Unit = !struct.at20 = value
    end extension
  end AVStream

  opaque type AVStreamGroup = CStruct10[
    Ptr[Byte],
    Ptr[Byte],
    CUnsignedInt,
    int64_t,
    AVStreamGroupParamsType,
    AVStreamGroup.Params,
    Ptr[AVDictionary],
    CUnsignedInt,
    Ptr[Byte],
    CInt
  ]

  object AVStreamGroup:
    given _tag: Tag[AVStreamGroup] = Tag.materializeCStruct10Tag[
      Ptr[Byte],
      Ptr[Byte],
      CUnsignedInt,
      int64_t,
      AVStreamGroupParamsType,
      AVStreamGroup.Params,
      Ptr[AVDictionary],
      CUnsignedInt,
      Ptr[Byte],
      CInt
    ]

    // Allocates AVStreamGroup on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVStreamGroup] =
      scala.scalanative.unsafe.alloc[AVStreamGroup](1)
    def apply(
        av_class: Ptr[AVClass],
        priv_data: Ptr[Byte],
        index: CUnsignedInt,
        id: int64_t,
        `type`: AVStreamGroupParamsType,
        params: AVStreamGroup.Params,
        metadata: Ptr[AVDictionary],
        nb_streams: CUnsignedInt,
        streams: Ptr[Ptr[AVStream]],
        disposition: CInt
    )(using Zone): Ptr[AVStreamGroup] =
      val ____ptr = apply()
      (!____ptr).av_class = av_class
      (!____ptr).priv_data = priv_data
      (!____ptr).index = index
      (!____ptr).id = id
      (!____ptr).`type` = `type`
      (!____ptr).params = params
      (!____ptr).metadata = metadata
      (!____ptr).nb_streams = nb_streams
      (!____ptr).streams = streams
      (!____ptr).disposition = disposition
      ____ptr
    end apply

    extension (struct: AVStreamGroup)
      def av_class: Ptr[AVClass] = struct._1.asInstanceOf[Ptr[AVClass]]
      def av_class_=(value: Ptr[AVClass]): Unit = !struct.at1 =
        value.asInstanceOf[Ptr[Byte]]
      def priv_data: Ptr[Byte] = struct._2
      def priv_data_=(value: Ptr[Byte]): Unit = !struct.at2 = value
      def index: CUnsignedInt = struct._3
      def index_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def id: int64_t = struct._4
      def id_=(value: int64_t): Unit = !struct.at4 = value
      def `type`: AVStreamGroupParamsType = struct._5
      def type_=(value: AVStreamGroupParamsType): Unit = !struct.at5 = value
      def params: AVStreamGroup.Params = struct._6
      def params_=(value: AVStreamGroup.Params): Unit = !struct.at6 = value
      def metadata: Ptr[AVDictionary] = struct._7
      def metadata_=(value: Ptr[AVDictionary]): Unit = !struct.at7 = value
      def nb_streams: CUnsignedInt = struct._8
      def nb_streams_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def streams: Ptr[Ptr[AVStream]] =
        struct._9.asInstanceOf[Ptr[Ptr[AVStream]]]
      def streams_=(value: Ptr[Ptr[AVStream]]): Unit = !struct.at9 =
        value.asInstanceOf[Ptr[Byte]]
      def disposition: CInt = struct._10
      def disposition_=(value: CInt): Unit = !struct.at10 = value
    end extension

    /** Group type-specific parameters
      */
    opaque type Params = CArray[Byte, Nat._8]
    object Params:
      given _tag: Tag[Params] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)

      def apply()(using Zone): Ptr[Params] =
        val ___ptr = _root_.scala.scalanative.unsafe.alloc[Params](1)
        ___ptr

      @scala.annotation.targetName("apply_iamf_audio_element")
      def apply(iamf_audio_element: Ptr[AVIAMFAudioElement])(using
          Zone
      ): Ptr[Params] =
        val ___ptr = _root_.scala.scalanative.unsafe.alloc[Params](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[AVIAMFAudioElement]]]
          .update(0, iamf_audio_element)
        ___ptr
      end apply

      @scala.annotation.targetName("apply_iamf_mix_presentation")
      def apply(iamf_mix_presentation: Ptr[AVIAMFMixPresentation])(using
          Zone
      ): Ptr[Params] =
        val ___ptr = _root_.scala.scalanative.unsafe.alloc[Params](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[AVIAMFMixPresentation]]]
          .update(0, iamf_mix_presentation)
        ___ptr
      end apply

      @scala.annotation.targetName("apply_tile_grid")
      def apply(tile_grid: Ptr[AVStreamGroupTileGrid])(using
          Zone
      ): Ptr[Params] =
        val ___ptr = _root_.scala.scalanative.unsafe.alloc[Params](1)
        val un = !___ptr
        un.at(0)
          .asInstanceOf[Ptr[Ptr[AVStreamGroupTileGrid]]]
          .update(0, tile_grid)
        ___ptr
      end apply

      @scala.annotation.targetName("apply_lcevc")
      def apply(lcevc: Ptr[AVStreamGroupLCEVC])(using Zone): Ptr[Params] =
        val ___ptr = _root_.scala.scalanative.unsafe.alloc[Params](1)
        val un = !___ptr
        un.at(0).asInstanceOf[Ptr[Ptr[AVStreamGroupLCEVC]]].update(0, lcevc)
        ___ptr

      extension (struct: Params)
        def iamf_audio_element: Ptr[AVIAMFAudioElement] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[AVIAMFAudioElement]]]
        def iamf_audio_element_=(value: Ptr[AVIAMFAudioElement]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[AVIAMFAudioElement]]] = value
        def iamf_mix_presentation: Ptr[AVIAMFMixPresentation] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[AVIAMFMixPresentation]]]
        def iamf_mix_presentation_=(value: Ptr[AVIAMFMixPresentation]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[AVIAMFMixPresentation]]] = value
        def tile_grid: Ptr[AVStreamGroupTileGrid] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[AVStreamGroupTileGrid]]]
        def tile_grid_=(value: Ptr[AVStreamGroupTileGrid]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[AVStreamGroupTileGrid]]] = value
        def lcevc: Ptr[AVStreamGroupLCEVC] =
          !struct.at(0).asInstanceOf[Ptr[Ptr[AVStreamGroupLCEVC]]]
        def lcevc_=(value: Ptr[AVStreamGroupLCEVC]): Unit =
          !struct.at(0).asInstanceOf[Ptr[Ptr[AVStreamGroupLCEVC]]] = value
      end extension
    end Params
  end AVStreamGroup

  /** AVStreamGroupLCEVC is meant to define the relation between video streams
    * and a data stream containing LCEVC enhancement layer NALUs.
    */
  opaque type AVStreamGroupLCEVC = CStruct4[Ptr[Byte], CUnsignedInt, CInt, CInt]

  object AVStreamGroupLCEVC:
    given _tag: Tag[AVStreamGroupLCEVC] =
      Tag.materializeCStruct4Tag[Ptr[Byte], CUnsignedInt, CInt, CInt]

    // Allocates AVStreamGroupLCEVC on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVStreamGroupLCEVC] =
      scala.scalanative.unsafe.alloc[AVStreamGroupLCEVC](1)
    def apply(
        av_class: Ptr[AVClass],
        lcevc_index: CUnsignedInt,
        width: CInt,
        height: CInt
    )(using Zone): Ptr[AVStreamGroupLCEVC] =
      val ____ptr = apply()
      (!____ptr).av_class = av_class
      (!____ptr).lcevc_index = lcevc_index
      (!____ptr).width = width
      (!____ptr).height = height
      ____ptr
    end apply

    extension (struct: AVStreamGroupLCEVC)
      def av_class: Ptr[AVClass] = struct._1.asInstanceOf[Ptr[AVClass]]
      def av_class_=(value: Ptr[AVClass]): Unit = !struct.at1 =
        value.asInstanceOf[Ptr[Byte]]
      def lcevc_index: CUnsignedInt = struct._2
      def lcevc_index_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def width: CInt = struct._3
      def width_=(value: CInt): Unit = !struct.at3 = value
      def height: CInt = struct._4
      def height_=(value: CInt): Unit = !struct.at4 = value
    end extension
  end AVStreamGroupLCEVC

  /** AVStreamGroupTileGrid holds information on how to combine several
    * independent images on a single canvas for presentation.
    */
  opaque type AVStreamGroupTileGrid =
    CStruct10[Ptr[Byte], CUnsignedInt, CInt, CInt, Ptr[
      AVStreamGroupTileGrid.Offsets
    ], CArray[uint8_t, Nat._4], CInt, CInt, CInt, CInt]

  object AVStreamGroupTileGrid:
    given _tag: Tag[AVStreamGroupTileGrid] =
      Tag.materializeCStruct10Tag[Ptr[Byte], CUnsignedInt, CInt, CInt, Ptr[
        AVStreamGroupTileGrid.Offsets
      ], CArray[uint8_t, Nat._4], CInt, CInt, CInt, CInt]

    // Allocates AVStreamGroupTileGrid on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVStreamGroupTileGrid] =
      scala.scalanative.unsafe.alloc[AVStreamGroupTileGrid](1)
    def apply(
        av_class: Ptr[AVClass],
        nb_tiles: CUnsignedInt,
        coded_width: CInt,
        coded_height: CInt,
        offsets: Ptr[AVStreamGroupTileGrid.Offsets],
        background: CArray[uint8_t, Nat._4],
        horizontal_offset: CInt,
        vertical_offset: CInt,
        width: CInt,
        height: CInt
    )(using Zone): Ptr[AVStreamGroupTileGrid] =
      val ____ptr = apply()
      (!____ptr).av_class = av_class
      (!____ptr).nb_tiles = nb_tiles
      (!____ptr).coded_width = coded_width
      (!____ptr).coded_height = coded_height
      (!____ptr).offsets = offsets
      (!____ptr).background = background
      (!____ptr).horizontal_offset = horizontal_offset
      (!____ptr).vertical_offset = vertical_offset
      (!____ptr).width = width
      (!____ptr).height = height
      ____ptr
    end apply

    extension (struct: AVStreamGroupTileGrid)
      def av_class: Ptr[AVClass] = struct._1.asInstanceOf[Ptr[AVClass]]
      def av_class_=(value: Ptr[AVClass]): Unit = !struct.at1 =
        value.asInstanceOf[Ptr[Byte]]
      def nb_tiles: CUnsignedInt = struct._2
      def nb_tiles_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def coded_width: CInt = struct._3
      def coded_width_=(value: CInt): Unit = !struct.at3 = value
      def coded_height: CInt = struct._4
      def coded_height_=(value: CInt): Unit = !struct.at4 = value
      def offsets: Ptr[AVStreamGroupTileGrid.Offsets] = struct._5
      def offsets_=(value: Ptr[AVStreamGroupTileGrid.Offsets]): Unit =
        !struct.at5 = value
      def background: CArray[uint8_t, Nat._4] = struct._6
      def background_=(value: CArray[uint8_t, Nat._4]): Unit = !struct.at6 =
        value
      def horizontal_offset: CInt = struct._7
      def horizontal_offset_=(value: CInt): Unit = !struct.at7 = value
      def vertical_offset: CInt = struct._8
      def vertical_offset_=(value: CInt): Unit = !struct.at8 = value
      def width: CInt = struct._9
      def width_=(value: CInt): Unit = !struct.at9 = value
      def height: CInt = struct._10
      def height_=(value: CInt): Unit = !struct.at10 = value
    end extension

    /** An nb_tiles sized array of offsets in pixels from the topleft edge of
      * the canvas, indicating where each stream should be placed. It must be
      * allocated with the av_malloc() family of functions.
      */
    opaque type Offsets = CStruct3[CUnsignedInt, CInt, CInt]

    object Offsets:
      given _tag: Tag[Offsets] =
        Tag.materializeCStruct3Tag[CUnsignedInt, CInt, CInt]

      // Allocates Offsets on the heap – fields are not initalised or zeroed out
      def apply()(using Zone): Ptr[Offsets] =
        scala.scalanative.unsafe.alloc[Offsets](1)
      def apply(idx: CUnsignedInt, horizontal: CInt, vertical: CInt)(using
          Zone
      ): Ptr[Offsets] =
        val ____ptr = apply()
        (!____ptr).idx = idx
        (!____ptr).horizontal = horizontal
        (!____ptr).vertical = vertical
        ____ptr

      extension (struct: Offsets)
        def idx: CUnsignedInt = struct._1
        def idx_=(value: CUnsignedInt): Unit = !struct.at1 = value
        def horizontal: CInt = struct._2
        def horizontal_=(value: CInt): Unit = !struct.at2 = value
        def vertical: CInt = struct._3
        def vertical_=(value: CInt): Unit = !struct.at3 = value
    end Offsets
  end AVStreamGroupTileGrid

  opaque type AVSubtitle =
    CStruct6[uint16_t, uint32_t, uint32_t, CUnsignedInt, Ptr[
      Ptr[AVSubtitleRect]
    ], int64_t]

  object AVSubtitle:
    given _tag: Tag[AVSubtitle] = Tag
      .materializeCStruct6Tag[uint16_t, uint32_t, uint32_t, CUnsignedInt, Ptr[
        Ptr[AVSubtitleRect]
      ], int64_t]

    // Allocates AVSubtitle on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVSubtitle] =
      scala.scalanative.unsafe.alloc[AVSubtitle](1)
    def apply(
        format: uint16_t,
        start_display_time: uint32_t,
        end_display_time: uint32_t,
        num_rects: CUnsignedInt,
        rects: Ptr[Ptr[AVSubtitleRect]],
        pts: int64_t
    )(using Zone): Ptr[AVSubtitle] =
      val ____ptr = apply()
      (!____ptr).format = format
      (!____ptr).start_display_time = start_display_time
      (!____ptr).end_display_time = end_display_time
      (!____ptr).num_rects = num_rects
      (!____ptr).rects = rects
      (!____ptr).pts = pts
      ____ptr
    end apply

    extension (struct: AVSubtitle)
      def format: uint16_t = struct._1
      def format_=(value: uint16_t): Unit = !struct.at1 = value
      def start_display_time: uint32_t = struct._2
      def start_display_time_=(value: uint32_t): Unit = !struct.at2 = value
      def end_display_time: uint32_t = struct._3
      def end_display_time_=(value: uint32_t): Unit = !struct.at3 = value
      def num_rects: CUnsignedInt = struct._4
      def num_rects_=(value: CUnsignedInt): Unit = !struct.at4 = value
      def rects: Ptr[Ptr[AVSubtitleRect]] = struct._5
      def rects_=(value: Ptr[Ptr[AVSubtitleRect]]): Unit = !struct.at5 = value
      def pts: int64_t = struct._6
      def pts_=(value: int64_t): Unit = !struct.at6 = value
    end extension
  end AVSubtitle

  opaque type AVSubtitleRect = CStruct11[
    CInt,
    CInt,
    CInt,
    CInt,
    CInt,
    CArray[Ptr[uint8_t], Nat._4],
    CArray[CInt, Nat._4],
    CInt,
    AVSubtitleType,
    CString,
    CString
  ]

  object AVSubtitleRect:
    given _tag: Tag[AVSubtitleRect] =
      Tag.materializeCStruct11Tag[CInt, CInt, CInt, CInt, CInt, CArray[Ptr[
        uint8_t
      ], Nat._4], CArray[CInt, Nat._4], CInt, AVSubtitleType, CString, CString]

    // Allocates AVSubtitleRect on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[AVSubtitleRect] =
      scala.scalanative.unsafe.alloc[AVSubtitleRect](1)
    def apply(
        x: CInt,
        y: CInt,
        w: CInt,
        h: CInt,
        nb_colors: CInt,
        data: CArray[Ptr[uint8_t], Nat._4],
        linesize: CArray[CInt, Nat._4],
        flags: CInt,
        `type`: AVSubtitleType,
        text: CString,
        ass: CString
    )(using Zone): Ptr[AVSubtitleRect] =
      val ____ptr = apply()
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).nb_colors = nb_colors
      (!____ptr).data = data
      (!____ptr).linesize = linesize
      (!____ptr).flags = flags
      (!____ptr).`type` = `type`
      (!____ptr).text = text
      (!____ptr).ass = ass
      ____ptr
    end apply

    extension (struct: AVSubtitleRect)
      def x: CInt = struct._1
      def x_=(value: CInt): Unit = !struct.at1 = value
      def y: CInt = struct._2
      def y_=(value: CInt): Unit = !struct.at2 = value
      def w: CInt = struct._3
      def w_=(value: CInt): Unit = !struct.at3 = value
      def h: CInt = struct._4
      def h_=(value: CInt): Unit = !struct.at4 = value
      def nb_colors: CInt = struct._5
      def nb_colors_=(value: CInt): Unit = !struct.at5 = value
      def data: CArray[Ptr[uint8_t], Nat._4] = struct._6
      def data_=(value: CArray[Ptr[uint8_t], Nat._4]): Unit = !struct.at6 =
        value
      def linesize: CArray[CInt, Nat._4] = struct._7
      def linesize_=(value: CArray[CInt, Nat._4]): Unit = !struct.at7 = value
      def flags: CInt = struct._8
      def flags_=(value: CInt): Unit = !struct.at8 = value
      def `type`: AVSubtitleType = struct._9
      def type_=(value: AVSubtitleType): Unit = !struct.at9 = value
      def text: CString = struct._10
      def text_=(value: CString): Unit = !struct.at10 = value
      def ass: CString = struct._11
      def ass_=(value: CString): Unit = !struct.at11 = value
    end extension
  end AVSubtitleRect

  opaque type RcOverride = CStruct4[CInt, CInt, CInt, Float]

  object RcOverride:
    given _tag: Tag[RcOverride] =
      Tag.materializeCStruct4Tag[CInt, CInt, CInt, Float]

    // Allocates RcOverride on the heap – fields are not initalised or zeroed out
    def apply()(using Zone): Ptr[RcOverride] =
      scala.scalanative.unsafe.alloc[RcOverride](1)
    def apply(
        start_frame: CInt,
        end_frame: CInt,
        qscale: CInt,
        quality_factor: Float
    )(using Zone): Ptr[RcOverride] =
      val ____ptr = apply()
      (!____ptr).start_frame = start_frame
      (!____ptr).end_frame = end_frame
      (!____ptr).qscale = qscale
      (!____ptr).quality_factor = quality_factor
      ____ptr
    end apply

    extension (struct: RcOverride)
      def start_frame: CInt = struct._1
      def start_frame_=(value: CInt): Unit = !struct.at1 = value
      def end_frame: CInt = struct._2
      def end_frame_=(value: CInt): Unit = !struct.at2 = value
      def qscale: CInt = struct._3
      def qscale_=(value: CInt): Unit = !struct.at3 = value
      def quality_factor: Float = struct._4
      def quality_factor_=(value: Float): Unit = !struct.at4 = value
  end RcOverride
end structs

object unions:
  import _root_.ffmpeg.enumerations.*
  import _root_.ffmpeg.predef.*
  import _root_.ffmpeg.aliases.*
  import _root_.ffmpeg.structs.*
  import _root_.ffmpeg.unions.*

  opaque type av_intfloat32 = CArray[Byte, Nat._4]
  object av_intfloat32:
    given _tag: Tag[av_intfloat32] =
      Tag.CArray[CChar, Nat._4](Tag.Byte, Tag.Nat4)

    def apply()(using Zone): Ptr[av_intfloat32] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[av_intfloat32](1)
      ___ptr

    @scala.annotation.targetName("apply_i")
    def apply(i: uint32_t)(using Zone): Ptr[av_intfloat32] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[av_intfloat32](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uint32_t]].update(0, i)
      ___ptr

    @scala.annotation.targetName("apply_f")
    def apply(f: Float)(using Zone): Ptr[av_intfloat32] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[av_intfloat32](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Float]].update(0, f)
      ___ptr

    extension (struct: av_intfloat32)
      def i: uint32_t = !struct.at(0).asInstanceOf[Ptr[uint32_t]]
      def i_=(value: uint32_t): Unit =
        !struct.at(0).asInstanceOf[Ptr[uint32_t]] = value
      def f: Float = !struct.at(0).asInstanceOf[Ptr[Float]]
      def f_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] =
        value
  end av_intfloat32

  opaque type av_intfloat64 = CArray[Byte, Nat._8]
  object av_intfloat64:
    given _tag: Tag[av_intfloat64] =
      Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)

    def apply()(using Zone): Ptr[av_intfloat64] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[av_intfloat64](1)
      ___ptr

    @scala.annotation.targetName("apply_i")
    def apply(i: uint64_t)(using Zone): Ptr[av_intfloat64] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[av_intfloat64](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uint64_t]].update(0, i)
      ___ptr

    @scala.annotation.targetName("apply_f")
    def apply(f: Double)(using Zone): Ptr[av_intfloat64] =
      val ___ptr = _root_.scala.scalanative.unsafe.alloc[av_intfloat64](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Double]].update(0, f)
      ___ptr

    extension (struct: av_intfloat64)
      def i: uint64_t = !struct.at(0).asInstanceOf[Ptr[uint64_t]]
      def i_=(value: uint64_t): Unit =
        !struct.at(0).asInstanceOf[Ptr[uint64_t]] = value
      def f: Double = !struct.at(0).asInstanceOf[Ptr[Double]]
      def f_=(value: Double): Unit = !struct.at(0).asInstanceOf[Ptr[Double]] =
        value
  end av_intfloat64
end unions

@extern
private[ffmpeg] object extern_functions:
  import _root_.ffmpeg.enumerations.*
  import _root_.ffmpeg.predef.*
  import _root_.ffmpeg.aliases.*
  import _root_.ffmpeg.structs.*
  import _root_.ffmpeg.unions.*
  private[ffmpeg] def __sn_wrap_ffmpeg_av_add_q(
      b: Ptr[AVRational],
      c: Ptr[AVRational],
      __return: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_add_stable(
      ts_tb: Ptr[AVRational],
      ts: int64_t,
      inc_tb: Ptr[AVRational],
      inc: int64_t
  ): int64_t = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_cmp_q(
      a: Ptr[AVRational],
      b: Ptr[AVRational]
  ): CInt = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_compare_ts(
      ts_a: int64_t,
      tb_a: Ptr[AVRational],
      ts_b: int64_t,
      tb_b: Ptr[AVRational]
  ): CInt = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_d2q(
      d: Double,
      max: CInt,
      __return: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_div_q(
      b: Ptr[AVRational],
      c: Ptr[AVRational],
      __return: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_find_nearest_q_idx(
      q: Ptr[AVRational],
      q_list: Ptr[AVRational]
  ): CInt = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_gcd_q(
      a: Ptr[AVRational],
      b: Ptr[AVRational],
      max_den: CInt,
      `def`: Ptr[AVRational],
      __return: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_get_time_base_q(
      __return: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_guess_frame_rate(
      ctx: Ptr[AVFormatContext],
      stream: Ptr[AVStream],
      frame: Ptr[AVFrame],
      __return: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_guess_sample_aspect_ratio(
      format: Ptr[AVFormatContext],
      stream: Ptr[AVStream],
      frame: Ptr[AVFrame],
      __return: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_inv_q(
      q: Ptr[AVRational],
      __return: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_make_q(
      num: CInt,
      den: CInt,
      __return: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_mul_q(
      b: Ptr[AVRational],
      c: Ptr[AVRational],
      __return: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_nearer_q(
      q: Ptr[AVRational],
      q1: Ptr[AVRational],
      q2: Ptr[AVRational]
  ): CInt = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_packet_rescale_ts(
      pkt: Ptr[AVPacket],
      tb_src: Ptr[AVRational],
      tb_dst: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_q2d(a: Ptr[AVRational]): Double =
    extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_q2intfloat(
      q: Ptr[AVRational]
  ): uint32_t = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_rescale_delta(
      in_tb: Ptr[AVRational],
      in_ts: int64_t,
      fs_tb: Ptr[AVRational],
      duration: CInt,
      last: Ptr[int64_t],
      out_tb: Ptr[AVRational]
  ): int64_t = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_rescale_q(
      a: int64_t,
      bq: Ptr[AVRational],
      cq: Ptr[AVRational]
  ): int64_t = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_rescale_q_rnd(
      a: int64_t,
      bq: Ptr[AVRational],
      cq: Ptr[AVRational],
      rnd: AVRounding
  ): int64_t = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_stream_get_codec_timebase(
      st: Ptr[AVStream],
      __return: Ptr[AVRational]
  ): Unit = extern

  private[ffmpeg] def __sn_wrap_ffmpeg_av_sub_q(
      b: Ptr[AVRational],
      c: Ptr[AVRational],
      __return: Ptr[AVRational]
  ): Unit = extern

  /** Add an index entry into a sorted list. Update the entry if the list
    * already contains it.
    */
  def av_add_index_entry(
      st: Ptr[AVStream],
      pos: int64_t,
      timestamp: int64_t,
      size: CInt,
      distance: CInt,
      flags: CInt
  ): CInt = extern

  /** Read data and append it to the current content of the AVPacket. If
    * pkt->size is 0 this is identical to av_get_packet. Note that this uses
    * av_grow_packet and thus involves a realloc which is inefficient. Thus this
    * function should only be used when there is no reasonable way to know (an
    * upper bound of) the final size.
    */
  def av_append_packet(
      s: Ptr[AVIOContext],
      pkt: Ptr[AVPacket],
      size: CInt
  ): CInt = extern

  /** 0th order modified bessel function of the first kind.
    */
  def av_bessel_i0(x: Double): Double = extern

  /** Allocate an AVBuffer of the given size using av_malloc().
    */
  def av_buffer_alloc(size: size_t): Ptr[AVBufferRef] = extern

  /** Same as av_buffer_alloc(), except the returned buffer will be initialized
    * to zero.
    */
  def av_buffer_allocz(size: size_t): Ptr[AVBufferRef] = extern

  /** Create an AVBuffer from an existing array.
    */
  def av_buffer_create(
      data: Ptr[uint8_t],
      size: size_t,
      free: CFuncPtr2[Ptr[Byte], Ptr[uint8_t], Unit],
      opaque: Ptr[Byte],
      flags: CInt
  ): Ptr[AVBufferRef] = extern

  /** Default free callback, which calls av_free() on the buffer data. This
    * function is meant to be passed to av_buffer_create(), not called directly.
    */
  def av_buffer_default_free(opaque: Ptr[Byte], data: Ptr[uint8_t]): Unit =
    extern

  /** Returns the opaque parameter set by av_buffer_create.
    */
  def av_buffer_get_opaque(buf: Ptr[AVBufferRef]): Ptr[Byte] = extern

  def av_buffer_get_ref_count(buf: Ptr[AVBufferRef]): CInt = extern

  /** Returns 1 if the caller may write to the data referred to by buf (which is
    * true if and only if buf is the only reference to the underlying AVBuffer).
    * Return 0 otherwise. A positive answer is valid until av_buffer_ref() is
    * called on buf.
    */
  def av_buffer_is_writable(buf: Ptr[AVBufferRef]): CInt = extern

  /** Create a writable reference from a given buffer reference, avoiding data
    * copy if possible.
    */
  def av_buffer_make_writable(buf: Ptr[Ptr[AVBufferRef]]): CInt = extern

  /** Query the original opaque parameter of an allocated buffer in the pool.
    */
  def av_buffer_pool_buffer_get_opaque(ref: Ptr[AVBufferRef]): Ptr[Byte] =
    extern

  /** Allocate a new AVBuffer, reusing an old buffer from the pool when
    * available. This function may be called simultaneously from multiple
    * threads.
    */
  def av_buffer_pool_get(pool: Ptr[AVBufferPool]): Ptr[AVBufferRef] = extern

  /** Allocate and initialize a buffer pool.
    */
  def av_buffer_pool_init(
      size: size_t,
      alloc: CFuncPtr1[size_t, Ptr[AVBufferRef]]
  ): Ptr[AVBufferPool] = extern

  /** Allocate and initialize a buffer pool with a more complex allocator.
    */
  def av_buffer_pool_init2(
      size: size_t,
      opaque: Ptr[Byte],
      alloc: CFuncPtr2[Ptr[Byte], size_t, Ptr[AVBufferRef]],
      pool_free: CFuncPtr1[Ptr[Byte], Unit]
  ): Ptr[AVBufferPool] = extern

  /** Mark the pool as being available for freeing. It will actually be freed
    * only once all the allocated buffers associated with the pool are released.
    * Thus it is safe to call this function while some of the allocated buffers
    * are still in use.
    */
  def av_buffer_pool_uninit(pool: Ptr[Ptr[AVBufferPool]]): Unit = extern

  /** Reallocate a given buffer.
    */
  def av_buffer_realloc(buf: Ptr[Ptr[AVBufferRef]], size: size_t): CInt = extern

  /** Create a new reference to an AVBuffer.
    */
  def av_buffer_ref(buf: Ptr[AVBufferRef]): Ptr[AVBufferRef] = extern

  /** Ensure dst refers to the same data as src.
    */
  def av_buffer_replace(
      dst: Ptr[Ptr[AVBufferRef]],
      src: Ptr[AVBufferRef]
  ): CInt = extern

  /** Free a given reference and automatically free the buffer if there are no
    * more references to it.
    */
  def av_buffer_unref(buf: Ptr[Ptr[AVBufferRef]]): Unit = extern

  /** Allocate a memory block for an array with av_mallocz().
    */
  def av_calloc(nmemb: size_t, size: size_t): Ptr[Byte] = extern

  /** Compute ceil(log2(x)).
    */
  def av_ceil_log2_c(x: CInt): CInt = extern

  /** Get a human readable string describing a given channel.
    */
  def av_channel_description(
      buf: CString,
      buf_size: size_t,
      channel: AVChannel
  ): CInt = extern

  /** bprint variant of av_channel_description().
    */
  def av_channel_description_bprint(
      bp: Ptr[AVBPrint],
      channel_id: AVChannel
  ): Unit = extern

  /** This is the inverse function of av_channel_name().
    */
  def av_channel_from_string(name: CString): AVChannel = extern

  /** Return the order if the layout is n-th order standard-order ambisonic. The
    * presence of optional extra non-diegetic channels at the end is not taken
    * into account.
    */
  def av_channel_layout_ambisonic_order(
      channel_layout: Ptr[AVChannelLayout]
  ): CInt = extern

  /** Get the channel with the given index in a channel layout.
    */
  def av_channel_layout_channel_from_index(
      channel_layout: Ptr[AVChannelLayout],
      idx: CUnsignedInt
  ): AVChannel = extern

  /** Get a channel described by the given string.
    */
  def av_channel_layout_channel_from_string(
      channel_layout: Ptr[AVChannelLayout],
      name: CString
  ): AVChannel = extern

  /** Check whether a channel layout is valid, i.e. can possibly describe audio
    * data.
    */
  def av_channel_layout_check(channel_layout: Ptr[AVChannelLayout]): CInt =
    extern

  /** Check whether two channel layouts are semantically the same, i.e. the same
    * channels are present on the same positions in both.
    */
  def av_channel_layout_compare(
      chl: Ptr[AVChannelLayout],
      chl1: Ptr[AVChannelLayout]
  ): CInt = extern

  /** Make a copy of a channel layout. This differs from just assigning src to
    * dst in that it allocates and copies the map for AV_CHANNEL_ORDER_CUSTOM.
    */
  def av_channel_layout_copy(
      dst: Ptr[AVChannelLayout],
      src: Ptr[AVChannelLayout]
  ): CInt = extern

  /** Initialize a custom channel layout with the specified number of channels.
    * The channel map will be allocated and the designation of all channels will
    * be set to AV_CHAN_UNKNOWN.
    */
  def av_channel_layout_custom_init(
      channel_layout: Ptr[AVChannelLayout],
      nb_channels: CInt
  ): CInt = extern

  /** Get the default channel layout for a given number of channels.
    */
  def av_channel_layout_default(
      ch_layout: Ptr[AVChannelLayout],
      nb_channels: CInt
  ): Unit = extern

  /** Get a human-readable string describing the channel layout properties. The
    * string will be in the same format that is accepted by
    * av_channel_layout_from_string(), allowing to rebuild the same channel
    * layout, except for opaque pointers.
    */
  def av_channel_layout_describe(
      channel_layout: Ptr[AVChannelLayout],
      buf: CString,
      buf_size: size_t
  ): CInt = extern

  /** bprint variant of av_channel_layout_describe().
    */
  def av_channel_layout_describe_bprint(
      channel_layout: Ptr[AVChannelLayout],
      bp: Ptr[AVBPrint]
  ): CInt = extern

  /** Initialize a native channel layout from a bitmask indicating which
    * channels are present.
    */
  def av_channel_layout_from_mask(
      channel_layout: Ptr[AVChannelLayout],
      mask: uint64_t
  ): CInt = extern

  /** Initialize a channel layout from a given string description. The input
    * string can be represented by: - the formal channel layout name (returned
    * by av_channel_layout_describe()) - single or multiple channel names
    * (returned by av_channel_name(), eg. "FL", or concatenated with "+", each
    * optionally containing a custom name after a "@", eg.
    * "FL@Left+FR@Right+LFE") - a decimal or hexadecimal value of a native
    * channel layout (eg. "4" or "0x4") - the number of channels with default
    * layout (eg. "4c") - the number of unordered channels (eg. "4C" or "4
    * channels") - the ambisonic order followed by optional non-diegetic
    * channels (eg. "ambisonic 2+stereo") On error, the channel layout will
    * remain uninitialized, but not necessarily untouched.
    */
  def av_channel_layout_from_string(
      channel_layout: Ptr[AVChannelLayout],
      str: CString
  ): CInt = extern

  /** Get the index of a given channel in a channel layout. In case multiple
    * channels are found, only the first match will be returned.
    */
  def av_channel_layout_index_from_channel(
      channel_layout: Ptr[AVChannelLayout],
      channel: AVChannel
  ): CInt = extern

  /** Get the index in a channel layout of a channel described by the given
    * string. In case multiple channels are found, only the first match will be
    * returned.
    */
  def av_channel_layout_index_from_string(
      channel_layout: Ptr[AVChannelLayout],
      name: CString
  ): CInt = extern

  /** Change the AVChannelOrder of a channel layout.
    */
  def av_channel_layout_retype(
      channel_layout: Ptr[AVChannelLayout],
      order: AVChannelOrder,
      flags: CInt
  ): CInt = extern

  /** Iterate over all standard channel layouts.
    */
  def av_channel_layout_standard(opaque: Ptr[Ptr[Byte]]): Ptr[AVChannelLayout] =
    extern

  /** Find out what channels from a given set are present in a channel layout,
    * without regard for their positions.
    */
  def av_channel_layout_subset(
      channel_layout: Ptr[AVChannelLayout],
      mask: uint64_t
  ): uint64_t = extern

  /** Free any allocated data in the channel layout and reset the channel count
    * to 0.
    */
  def av_channel_layout_uninit(channel_layout: Ptr[AVChannelLayout]): Unit =
    extern

  /** Get a human readable string in an abbreviated form describing a given
    * channel. This is the inverse function of av_channel_from_string().
    */
  def av_channel_name(
      buf: CString,
      buf_size: size_t,
      channel: AVChannel
  ): CInt = extern

  /** bprint variant of av_channel_name().
    */
  def av_channel_name_bprint(bp: Ptr[AVBPrint], channel_id: AVChannel): Unit =
    extern

  /** Clip a signed 64bit integer value into the amin-amax range.
    */
  def av_clip64_c(a: int64_t, amin: int64_t, amax: int64_t): int64_t = extern

  /** Clip a signed integer value into the amin-amax range.
    */
  def av_clip_c(a: CInt, amin: CInt, amax: CInt): CInt = extern

  /** Clip a signed integer value into the -32768,32767 range.
    */
  def av_clip_int16_c(a: CInt): int16_t = extern

  /** Clip a signed integer value into the -128,127 range.
    */
  def av_clip_int8_c(a: CInt): int8_t = extern

  /** Clip a signed integer into the -(2^p),(2^p-1) range.
    */
  def av_clip_intp2_c(a: CInt, p: CInt): CInt = extern

  /** Clip a signed integer value into the 0-65535 range.
    */
  def av_clip_uint16_c(a: CInt): uint16_t = extern

  /** Clip a signed integer value into the 0-255 range.
    */
  def av_clip_uint8_c(a: CInt): uint8_t = extern

  /** Clip a signed integer to an unsigned power of two range.
    */
  def av_clip_uintp2_c(a: CInt, p: CInt): CUnsignedInt = extern

  /** Clip a double value into the amin-amax range. If a is nan or -inf amin
    * will be returned. If a is +inf amax will be returned.
    */
  def av_clipd_c(a: Double, amin: Double, amax: Double): Double = extern

  /** Clip a float value into the amin-amax range. If a is nan or -inf amin will
    * be returned. If a is +inf amax will be returned.
    */
  def av_clipf_c(a: Float, amin: Float, amax: Float): Float = extern

  /** Clip a signed 64-bit integer value into the -2147483648,2147483647 range.
    */
  def av_clipl_int32_c(a: int64_t): int32_t = extern

  /** Get the AVCodecID for the given codec tag tag. If no codec id is found
    * returns AV_CODEC_ID_NONE.
    */
  def av_codec_get_id(
      tags: Ptr[Ptr[AVCodecTag]],
      tag: CUnsignedInt
  ): AVCodecID = extern

  /** Get the codec tag for the given codec id id. If no codec tag is found
    * returns 0.
    */
  def av_codec_get_tag(
      tags: Ptr[Ptr[AVCodecTag]],
      id: AVCodecID
  ): CUnsignedInt = extern

  /** Get the codec tag for the given codec id.
    */
  def av_codec_get_tag2(
      tags: Ptr[Ptr[AVCodecTag]],
      id: AVCodecID,
      tag: Ptr[CUnsignedInt]
  ): CInt = extern

  /** Returns a non-zero number if codec is a decoder, zero otherwise
    */
  def av_codec_is_decoder(codec: Ptr[AVCodec]): CInt = extern

  /** Returns a non-zero number if codec is an encoder, zero otherwise
    */
  def av_codec_is_encoder(codec: Ptr[AVCodec]): CInt = extern

  /** Iterate over all registered codecs.
    */
  def av_codec_iterate(opaque: Ptr[Ptr[Byte]]): Ptr[AVCodec] = extern

  /** Compare the remainders of two integer operands divided by a common
    * divisor.
    */
  def av_compare_mod(a: uint64_t, b: uint64_t, mod: uint64_t): int64_t = extern

  /** Allocate a CPB properties structure and initialize its fields to default
    * values.
    */
  def av_cpb_properties_alloc(size: Ptr[size_t]): Ptr[AVCPBProperties] = extern

  def av_default_get_category(ptr: Ptr[Byte]): AVClassCategory = extern

  /** Return the context name
    */
  def av_default_item_name(ctx: Ptr[Byte]): CString = extern

  /** Iterate over all registered demuxers.
    */
  def av_demuxer_iterate(opaque: Ptr[Ptr[Byte]]): Ptr[AVInputFormat] = extern

  /** Copy entries from one AVDictionary struct into another.
    */
  def av_dict_copy(
      dst: Ptr[Ptr[AVDictionary]],
      src: Ptr[AVDictionary],
      flags: CInt
  ): CInt = extern

  /** Get number of entries in dictionary.
    */
  def av_dict_count(m: Ptr[AVDictionary]): CInt = extern

  /** Free all the memory allocated for an AVDictionary struct and all keys and
    * values.
    */
  def av_dict_free(m: Ptr[Ptr[AVDictionary]]): Unit = extern

  /** Get a dictionary entry with matching key.
    */
  def av_dict_get(
      m: Ptr[AVDictionary],
      key: CString,
      prev: Ptr[AVDictionaryEntry],
      flags: CInt
  ): Ptr[AVDictionaryEntry] = extern

  /** Get dictionary entries as a string.
    */
  def av_dict_get_string(
      m: Ptr[AVDictionary],
      buffer: Ptr[CString],
      key_val_sep: CChar,
      pairs_sep: CChar
  ): CInt = extern

  /** Iterate over a dictionary
    */
  def av_dict_iterate(
      m: Ptr[AVDictionary],
      prev: Ptr[AVDictionaryEntry]
  ): Ptr[AVDictionaryEntry] = extern

  /** Parse the key/value pairs list and add the parsed entries to a dictionary.
    */
  def av_dict_parse_string(
      pm: Ptr[Ptr[AVDictionary]],
      str: CString,
      key_val_sep: CString,
      pairs_sep: CString,
      flags: CInt
  ): CInt = extern

  /** Set the given entry in *pm, overwriting an existing entry.
    */
  def av_dict_set(
      pm: Ptr[Ptr[AVDictionary]],
      key: CString,
      value: CString,
      flags: CInt
  ): CInt = extern

  /** Convenience wrapper for av_dict_set() that converts the value to a string
    * and stores it.
    */
  def av_dict_set_int(
      pm: Ptr[Ptr[AVDictionary]],
      key: CString,
      value: int64_t,
      flags: CInt
  ): CInt = extern

  /** Returns The AV_DISPOSITION_* flag corresponding to disp or a negative
    * error code if disp does not correspond to a known stream disposition.
    */
  def av_disposition_from_string(disp: CString): CInt = extern

  /** Returns The string description corresponding to the lowest set bit in
    * disposition. NULL when the lowest set bit does not correspond to a known
    * disposition or when disposition is 0.
    */
  def av_disposition_to_string(disposition: CInt): CString = extern

  /** Reinterpret a double as a 64-bit integer.
    */
  def av_double2int(f: Double): uint64_t = extern

  /** Print detailed information about the input or output format, such as
    * duration, bitrate, streams, container, programs, metadata, side data,
    * codec and time base.
    */
  def av_dump_format(
      ic: Ptr[AVFormatContext],
      index: CInt,
      url: CString,
      is_output: CInt
  ): Unit = extern

  /** Add an element of size `elem_size` to a dynamic array.
    */
  def av_dynarray2_add(
      tab_ptr: Ptr[Ptr[Byte]],
      nb_ptr: Ptr[CInt],
      elem_size: size_t,
      elem_data: Ptr[uint8_t]
  ): Ptr[Byte] = extern

  /** Add the pointer to an element to a dynamic array.
    */
  def av_dynarray_add(
      tab_ptr: Ptr[Byte],
      nb_ptr: Ptr[CInt],
      elem: Ptr[Byte]
  ): Unit = extern

  /** Add an element to a dynamic array.
    */
  def av_dynarray_add_nofree(
      tab_ptr: Ptr[Byte],
      nb_ptr: Ptr[CInt],
      elem: Ptr[Byte]
  ): CInt = extern

  /** Allocate a buffer, reusing the given one if large enough.
    */
  def av_fast_malloc(
      ptr: Ptr[Byte],
      size: Ptr[CUnsignedInt],
      min_size: size_t
  ): Unit = extern

  /** Allocate and clear a buffer, reusing the given one if large enough.
    */
  def av_fast_mallocz(
      ptr: Ptr[Byte],
      size: Ptr[CUnsignedInt],
      min_size: size_t
  ): Unit = extern

  /** Same behaviour av_fast_malloc but the buffer has additional
    * AV_INPUT_BUFFER_PADDING_SIZE at the end which will always be 0.
    */
  def av_fast_padded_malloc(
      ptr: Ptr[Byte],
      size: Ptr[CUnsignedInt],
      min_size: size_t
  ): Unit = extern

  /** Same behaviour av_fast_padded_malloc except that buffer will always be
    * 0-initialized after call.
    */
  def av_fast_padded_mallocz(
      ptr: Ptr[Byte],
      size: Ptr[CUnsignedInt],
      min_size: size_t
  ): Unit = extern

  /** Reallocate the given buffer if it is not large enough, otherwise do
    * nothing.
    */
  def av_fast_realloc(
      ptr: Ptr[Byte],
      size: Ptr[CUnsignedInt],
      min_size: size_t
  ): Ptr[Byte] = extern

  /** Check whether filename actually is a numbered sequence generator.
    */
  def av_filename_number_test(filename: CString): CInt = extern

  /** Find the "best" stream in the file. The best stream is determined
    * according to various heuristics as the most likely to be what the user
    * expects. If the decoder parameter is non-NULL, av_find_best_stream will
    * find the default decoder for the stream's codec; streams for which no
    * decoder can be found are ignored.
    */
  def av_find_best_stream(
      ic: Ptr[AVFormatContext],
      `type`: AVMediaType,
      wanted_stream_nb: CInt,
      related_stream: CInt,
      decoder_ret: Ptr[Ptr[AVCodec]],
      flags: CInt
  ): CInt = extern

  def av_find_default_stream_index(s: Ptr[AVFormatContext]): CInt = extern

  /** Find AVInputFormat based on the short name of the input format.
    */
  def av_find_input_format(short_name: CString): Ptr[AVInputFormat] = extern

  /** Find the programs which belong to a given stream.
    */
  def av_find_program_from_stream(
      ic: Ptr[AVFormatContext],
      last: Ptr[AVProgram],
      s: CInt
  ): Ptr[AVProgram] = extern

  /** Reinterpret a float as a 32-bit integer.
    */
  def av_float2int(f: Float): uint32_t = extern

  /** Returns the method used to set ctx->duration.
    */
  def av_fmt_ctx_get_duration_estimation_method(
      ctx: Ptr[AVFormatContext]
  ): AVDurationEstimationMethod = extern

  /** This function will cause global side data to be injected in the next
    * packet of each stream as well as after any subsequent seek.
    */
  def av_format_inject_global_side_data(s: Ptr[AVFormatContext]): Unit = extern

  /** Fill the provided buffer with a string containing a FourCC (four-character
    * code) representation.
    */
  def av_fourcc_make_string(buf: CString, fourcc: uint32_t): CString = extern

  /** Allocate an AVFrame and set its fields to default values. The resulting
    * struct must be freed using av_frame_free().
    */
  def av_frame_alloc(): Ptr[AVFrame] = extern

  /** Crop the given video AVFrame according to its
    * crop_left/crop_top/crop_right/ crop_bottom fields. If cropping is
    * successful, the function will adjust the data pointers and the
    * width/height fields, and set the crop fields to 0.
    */
  def av_frame_apply_cropping(frame: Ptr[AVFrame], flags: CInt): CInt = extern

  /** Create a new frame that references the same data as src.
    */
  def av_frame_clone(src: Ptr[AVFrame]): Ptr[AVFrame] = extern

  /** Copy the frame data from src to dst.
    */
  def av_frame_copy(dst: Ptr[AVFrame], src: Ptr[AVFrame]): CInt = extern

  /** Copy only "metadata" fields from src to dst.
    */
  def av_frame_copy_props(dst: Ptr[AVFrame], src: Ptr[AVFrame]): CInt = extern

  /** Free the frame and any dynamically allocated objects in it, e.g.
    * extended_data. If the frame is reference counted, it will be unreferenced
    * first.
    */
  def av_frame_free(frame: Ptr[Ptr[AVFrame]]): Unit = extern

  /** Allocate new buffer(s) for audio or video data.
    */
  def av_frame_get_buffer(frame: Ptr[AVFrame], align: CInt): CInt = extern

  /** Get the buffer reference a given data plane is stored in.
    */
  def av_frame_get_plane_buffer(
      frame: Ptr[AVFrame],
      plane: CInt
  ): Ptr[AVBufferRef] = extern

  /** Returns a pointer to the side data of a given type on success, NULL if
    * there is no side data with such type in this frame.
    */
  def av_frame_get_side_data(
      frame: Ptr[AVFrame],
      `type`: AVFrameSideDataType
  ): Ptr[AVFrameSideData] = extern

  /** Check if the frame data is writable.
    */
  def av_frame_is_writable(frame: Ptr[AVFrame]): CInt = extern

  /** Ensure that the frame data is writable, avoiding data copy if possible.
    */
  def av_frame_make_writable(frame: Ptr[AVFrame]): CInt = extern

  /** Move everything contained in src to dst and reset src.
    */
  def av_frame_move_ref(dst: Ptr[AVFrame], src: Ptr[AVFrame]): Unit = extern

  /** Add a new side data to a frame.
    */
  def av_frame_new_side_data(
      frame: Ptr[AVFrame],
      `type`: AVFrameSideDataType,
      size: size_t
  ): Ptr[AVFrameSideData] = extern

  /** Add a new side data to a frame from an existing AVBufferRef
    */
  def av_frame_new_side_data_from_buf(
      frame: Ptr[AVFrame],
      `type`: AVFrameSideDataType,
      buf: Ptr[AVBufferRef]
  ): Ptr[AVFrameSideData] = extern

  /** Set up a new reference to the data described by the source frame.
    */
  def av_frame_ref(dst: Ptr[AVFrame], src: Ptr[AVFrame]): CInt = extern

  /** Remove and free all side data instances of the given type.
    */
  def av_frame_remove_side_data(
      frame: Ptr[AVFrame],
      `type`: AVFrameSideDataType
  ): Unit = extern

  /** Ensure the destination frame refers to the same data described by the
    * source frame, either by creating a new reference for each AVBufferRef from
    * src if they differ from those in dst, by allocating new buffers and
    * copying data if src is not reference counted, or by unrefencing it if src
    * is empty.
    */
  def av_frame_replace(dst: Ptr[AVFrame], src: Ptr[AVFrame]): CInt = extern

  /** Add a new side data entry to an array from an existing AVBufferRef.
    */
  def av_frame_side_data_add(
      sd: Ptr[Ptr[Ptr[AVFrameSideData]]],
      nb_sd: Ptr[CInt],
      `type`: AVFrameSideDataType,
      buf: Ptr[Ptr[AVBufferRef]],
      flags: CUnsignedInt
  ): Ptr[AVFrameSideData] = extern

  /** Add a new side data entry to an array based on existing side data, taking
    * a reference towards the contained AVBufferRef.
    */
  def av_frame_side_data_clone(
      sd: Ptr[Ptr[Ptr[AVFrameSideData]]],
      nb_sd: Ptr[CInt],
      src: Ptr[AVFrameSideData],
      flags: CUnsignedInt
  ): CInt = extern

  /** Returns side data descriptor corresponding to a given side data type, NULL
    * when not available.
    */
  def av_frame_side_data_desc(
      `type`: AVFrameSideDataType
  ): Ptr[AVSideDataDescriptor] = extern

  /** Free all side data entries and their contents, then zeroes out the values
    * which the pointers are pointing to.
    */
  def av_frame_side_data_free(
      sd: Ptr[Ptr[Ptr[AVFrameSideData]]],
      nb_sd: Ptr[CInt]
  ): Unit = extern

  /** Wrapper around av_frame_side_data_get_c() to workaround the limitation
    * that for any type T the conversion from T * const * to const T * const *
    * is not performed automatically in C.
    */
  def av_frame_side_data_get(
      sd: Ptr[Ptr[AVFrameSideData]],
      nb_sd: CInt,
      `type`: AVFrameSideDataType
  ): Ptr[AVFrameSideData] = extern

  /** Get a side data entry of a specific type from an array.
    */
  def av_frame_side_data_get_c(
      sd: Ptr[Ptr[AVFrameSideData]],
      nb_sd: CInt,
      `type`: AVFrameSideDataType
  ): Ptr[AVFrameSideData] = extern

  /** Returns a string identifying the side data type
    */
  def av_frame_side_data_name(`type`: AVFrameSideDataType): CString = extern

  /** Add new side data entry to an array.
    */
  def av_frame_side_data_new(
      sd: Ptr[Ptr[Ptr[AVFrameSideData]]],
      nb_sd: Ptr[CInt],
      `type`: AVFrameSideDataType,
      size: size_t,
      flags: CUnsignedInt
  ): Ptr[AVFrameSideData] = extern

  /** Remove and free all side data instances of the given type from an array.
    */
  def av_frame_side_data_remove(
      sd: Ptr[Ptr[Ptr[AVFrameSideData]]],
      nb_sd: Ptr[CInt],
      `type`: AVFrameSideDataType
  ): Unit = extern

  /** Unreference all the buffers referenced by frame and reset the frame
    * fields.
    */
  def av_frame_unref(frame: Ptr[AVFrame]): Unit = extern

  /** Free a memory block which has been allocated with a function of
    * av_malloc() or av_realloc() family.
    */
  def av_free(ptr: Ptr[Byte]): Unit = extern

  /** Free a memory block which has been allocated with a function of
    * av_malloc() or av_realloc() family, and set the pointer pointing to it to
    * `NULL`.
    */
  def av_freep(ptr: Ptr[Byte]): Unit = extern

  /** Compute the greatest common divisor of two integer operands.
    */
  def av_gcd(a: int64_t, b: int64_t): int64_t = extern

  /** Return the planar<->packed alternative form of the given sample format, or
    * AV_SAMPLE_FMT_NONE on error. If the passed sample_fmt is already in the
    * requested planar/packed format, the format returned is the same as the
    * input.
    */
  def av_get_alt_sample_fmt(
      sample_fmt: AVSampleFormat,
      planar: CInt
  ): AVSampleFormat = extern

  /** Return audio frame duration.
    */
  def av_get_audio_frame_duration(
      avctx: Ptr[AVCodecContext],
      frame_bytes: CInt
  ): CInt = extern

  /** This function is the same as av_get_audio_frame_duration(), except it
    * works with AVCodecParameters instead of an AVCodecContext.
    */
  def av_get_audio_frame_duration2(
      par: Ptr[AVCodecParameters],
      frame_bytes: CInt
  ): CInt = extern

  /** Return codec bits per sample.
    */
  def av_get_bits_per_sample(codec_id: AVCodecID): CInt = extern

  /** Return number of bytes per sample.
    */
  def av_get_bytes_per_sample(sample_fmt: AVSampleFormat): CInt = extern

  /** Return codec bits per sample. Only return non-zero if the bits per sample
    * is exactly correct, not an approximation.
    */
  def av_get_exact_bits_per_sample(codec_id: AVCodecID): CInt = extern

  def av_get_frame_filename(
      buf: CString,
      buf_size: CInt,
      path: CString,
      number: CInt
  ): CInt = extern

  /** Return in 'buf' the path with '%d' replaced by a number.
    */
  def av_get_frame_filename2(
      buf: CString,
      buf_size: CInt,
      path: CString,
      number: CInt,
      flags: CInt
  ): CInt = extern

  /** Return a string describing the media_type enum, NULL if media_type is
    * unknown.
    */
  def av_get_media_type_string(media_type: AVMediaType): CString = extern

  /** Get timing information for the data currently output. The exact meaning of
    * "currently output" depends on the format. It is mostly relevant for
    * devices that have an internal buffer and/or work in real time.
    */
  def av_get_output_timestamp(
      s: Ptr[AVFormatContext],
      stream: CInt,
      dts: Ptr[int64_t],
      wall: Ptr[int64_t]
  ): CInt = extern

  /** Get the packed alternative form of the given sample format.
    */
  def av_get_packed_sample_fmt(sample_fmt: AVSampleFormat): AVSampleFormat =
    extern

  /** Allocate and read the payload of a packet and initialize its fields with
    * default values.
    */
  def av_get_packet(s: Ptr[AVIOContext], pkt: Ptr[AVPacket], size: CInt): CInt =
    extern

  /** Return the PCM codec associated with a sample format.
    */
  def av_get_pcm_codec(fmt: AVSampleFormat, be: CInt): AVCodecID = extern

  /** Return a single letter to describe the given picture type pict_type.
    */
  def av_get_picture_type_char(pict_type: AVPictureType): CChar = extern

  /** Get the planar alternative form of the given sample format.
    */
  def av_get_planar_sample_fmt(sample_fmt: AVSampleFormat): AVSampleFormat =
    extern

  /** Return a name for the specified profile, if available.
    */
  def av_get_profile_name(codec: Ptr[AVCodec], profile: CInt): CString = extern

  /** Return a sample format corresponding to name, or AV_SAMPLE_FMT_NONE on
    * error.
    */
  def av_get_sample_fmt(name: CString): AVSampleFormat = extern

  /** Return the name of sample_fmt, or NULL if sample_fmt is not recognized.
    */
  def av_get_sample_fmt_name(sample_fmt: AVSampleFormat): CString = extern

  /** Generate a string corresponding to the sample format with sample_fmt, or a
    * header if sample_fmt is negative.
    */
  def av_get_sample_fmt_string(
      buf: CString,
      buf_size: CInt,
      sample_fmt: AVSampleFormat
  ): CString = extern

  /** Increase packet size, correctly zeroing padding
    */
  def av_grow_packet(pkt: Ptr[AVPacket], grow_by: CInt): CInt = extern

  /** Guess the codec ID based upon muxer and filename.
    */
  def av_guess_codec(
      fmt: Ptr[AVOutputFormat],
      short_name: CString,
      filename: CString,
      mime_type: CString,
      `type`: AVMediaType
  ): AVCodecID = extern

  /** Return the output format in the list of registered output formats which
    * best matches the provided parameters, or return NULL if there is no match.
    */
  def av_guess_format(
      short_name: CString,
      filename: CString,
      mime_type: CString
  ): Ptr[AVOutputFormat] = extern

  /** Send a nice hexadecimal dump of a buffer to the specified file stream.
    */
  def av_hex_dump(f: Ptr[FILE], buf: Ptr[uint8_t], size: CInt): Unit = extern

  /** Send a nice hexadecimal dump of a buffer to the log.
    */
  def av_hex_dump_log(
      avcl: Ptr[Byte],
      level: CInt,
      buf: Ptr[uint8_t],
      size: CInt
  ): Unit = extern

  /** Allocate an AVHWDeviceContext for a given hardware type.
    */
  def av_hwdevice_ctx_alloc(`type`: AVHWDeviceType): Ptr[AVBufferRef] = extern

  /** Open a device of the specified type and create an AVHWDeviceContext for
    * it.
    */
  def av_hwdevice_ctx_create(
      device_ctx: Ptr[Ptr[AVBufferRef]],
      `type`: AVHWDeviceType,
      device: CString,
      opts: Ptr[AVDictionary],
      flags: CInt
  ): CInt = extern

  /** Create a new device of the specified type from an existing device.
    */
  def av_hwdevice_ctx_create_derived(
      dst_ctx: Ptr[Ptr[AVBufferRef]],
      `type`: AVHWDeviceType,
      src_ctx: Ptr[AVBufferRef],
      flags: CInt
  ): CInt = extern

  /** Create a new device of the specified type from an existing device.
    */
  def av_hwdevice_ctx_create_derived_opts(
      dst_ctx: Ptr[Ptr[AVBufferRef]],
      `type`: AVHWDeviceType,
      src_ctx: Ptr[AVBufferRef],
      options: Ptr[AVDictionary],
      flags: CInt
  ): CInt = extern

  /** Finalize the device context before use. This function must be called after
    * the context is filled with all the required information and before it is
    * used in any way.
    */
  def av_hwdevice_ctx_init(ref: Ptr[AVBufferRef]): CInt = extern

  /** Look up an AVHWDeviceType by name.
    */
  def av_hwdevice_find_type_by_name(name: CString): AVHWDeviceType = extern

  /** Get the constraints on HW frames given a device and the HW-specific
    * configuration to be used with that device. If no HW-specific configuration
    * is provided, returns the maximum possible capabilities of the device.
    */
  def av_hwdevice_get_hwframe_constraints(
      ref: Ptr[AVBufferRef],
      hwconfig: Ptr[Byte]
  ): Ptr[AVHWFramesConstraints] = extern

  /** Get the string name of an AVHWDeviceType.
    */
  def av_hwdevice_get_type_name(`type`: AVHWDeviceType): CString = extern

  /** Allocate a HW-specific configuration structure for a given HW device.
    * After use, the user must free all members as required by the specific
    * hardware structure being used, then free the structure itself with
    * av_free().
    */
  def av_hwdevice_hwconfig_alloc(device_ctx: Ptr[AVBufferRef]): Ptr[Byte] =
    extern

  /** Iterate over supported device types.
    */
  def av_hwdevice_iterate_types(prev: AVHWDeviceType): AVHWDeviceType = extern

  /** Free an AVHWFrameConstraints structure.
    */
  def av_hwframe_constraints_free(
      constraints: Ptr[Ptr[AVHWFramesConstraints]]
  ): Unit = extern

  /** Allocate an AVHWFramesContext tied to a given device context.
    */
  def av_hwframe_ctx_alloc(device_ctx: Ptr[AVBufferRef]): Ptr[AVBufferRef] =
    extern

  /** Create and initialise an AVHWFramesContext as a mapping of another
    * existing AVHWFramesContext on a different device.
    */
  def av_hwframe_ctx_create_derived(
      derived_frame_ctx: Ptr[Ptr[AVBufferRef]],
      format: AVPixelFormat,
      derived_device_ctx: Ptr[AVBufferRef],
      source_frame_ctx: Ptr[AVBufferRef],
      flags: CInt
  ): CInt = extern

  /** Finalize the context before use. This function must be called after the
    * context is filled with all the required information and before it is
    * attached to any frames.
    */
  def av_hwframe_ctx_init(ref: Ptr[AVBufferRef]): CInt = extern

  /** Allocate a new frame attached to the given AVHWFramesContext.
    */
  def av_hwframe_get_buffer(
      hwframe_ctx: Ptr[AVBufferRef],
      frame: Ptr[AVFrame],
      flags: CInt
  ): CInt = extern

  /** Map a hardware frame.
    */
  def av_hwframe_map(dst: Ptr[AVFrame], src: Ptr[AVFrame], flags: CInt): CInt =
    extern

  /** Copy data to or from a hw surface. At least one of dst/src must have an
    * AVHWFramesContext attached.
    */
  def av_hwframe_transfer_data(
      dst: Ptr[AVFrame],
      src: Ptr[AVFrame],
      flags: CInt
  ): CInt = extern

  /** Get a list of possible source or target formats usable in
    * av_hwframe_transfer_data().
    */
  def av_hwframe_transfer_get_formats(
      hwframe_ctx: Ptr[AVBufferRef],
      dir: AVHWFrameTransferDirection,
      formats: Ptr[Ptr[AVPixelFormat]],
      flags: CInt
  ): CInt = extern

  /** Get the index for a specific timestamp.
    */
  def av_index_search_timestamp(
      st: Ptr[AVStream],
      timestamp: int64_t,
      flags: CInt
  ): CInt = extern

  /** Initialize optional fields of a packet with default values.
    */
  def av_init_packet(pkt: Ptr[AVPacket]): Unit = extern

  /** Reinterpret a 64-bit integer as a double.
    */
  def av_int2double(i: uint64_t): Double = extern

  /** Reinterpret a 32-bit integer as a float.
    */
  def av_int2float(i: uint32_t): Float = extern

  /** Compute the length of an integer list.
    */
  def av_int_list_length_for_size(
      elsize: CUnsignedInt,
      list: Ptr[Byte],
      term: uint64_t
  ): CUnsignedInt = extern

  /** Write a packet to an output media file ensuring correct interleaving.
    */
  def av_interleaved_write_frame(
      s: Ptr[AVFormatContext],
      pkt: Ptr[AVPacket]
  ): CInt = extern

  /** Write an uncoded frame to an output media file.
    */
  def av_interleaved_write_uncoded_frame(
      s: Ptr[AVFormatContext],
      stream_index: CInt,
      frame: Ptr[AVFrame]
  ): CInt = extern

  /** Send the specified message to the log if the level is less than or equal
    * to the current av_log_level. By default, all logging messages are sent to
    * stderr. This behavior can be altered by setting a different logging
    * callback function.
    */
  def av_log(avcl: Ptr[Byte], level: CInt, fmt: CString, rest: Any*): Unit =
    extern

  def av_log2(v: CUnsignedInt): CInt = extern

  def av_log2_16bit(v: CUnsignedInt): CInt = extern

  /** Default logging callback
    */
  def av_log_default_callback(
      avcl: Ptr[Byte],
      level: CInt,
      fmt: CString,
      vl: va_list
  ): Unit = extern

  /** Format a line of log the same way as the default callback.
    */
  def av_log_format_line(
      ptr: Ptr[Byte],
      level: CInt,
      fmt: CString,
      vl: va_list,
      line: CString,
      line_size: CInt,
      print_prefix: Ptr[CInt]
  ): Unit = extern

  /** Format a line of log the same way as the default callback.
    */
  def av_log_format_line2(
      ptr: Ptr[Byte],
      level: CInt,
      fmt: CString,
      vl: va_list,
      line: CString,
      line_size: CInt,
      print_prefix: Ptr[CInt]
  ): CInt = extern

  def av_log_get_flags(): CInt = extern

  /** Get the current log level
    */
  def av_log_get_level(): CInt = extern

  /** Send the specified message to the log once with the initial_level and then
    * with the subsequent_level. By default, all logging messages are sent to
    * stderr. This behavior can be altered by setting a different logging
    * callback function.
    */
  def av_log_once(
      avcl: Ptr[Byte],
      initial_level: CInt,
      subsequent_level: CInt,
      state: Ptr[CInt],
      fmt: CString,
      rest: Any*
  ): Unit = extern

  /** Set the logging callback
    */
  def av_log_set_callback(
      callback: CFuncPtr4[Ptr[Byte], CInt, CString, va_list, Unit]
  ): Unit = extern

  def av_log_set_flags(arg: CInt): Unit = extern

  /** Set the log level
    */
  def av_log_set_level(level: CInt): Unit = extern

  /** Fill the provided buffer with a string containing an error string
    * corresponding to the AVERROR code errnum.
    */
  def av_make_error_string(
      errbuf: CString,
      errbuf_size: size_t,
      errnum: CInt
  ): CString = extern

  /** Allocate a memory block with alignment suitable for all memory accesses
    * (including vectors if available on the CPU).
    */
  def av_malloc(size: size_t): Ptr[Byte] = extern

  /** Allocate a memory block for an array with av_malloc().
    */
  def av_malloc_array(nmemb: size_t, size: size_t): Ptr[Byte] = extern

  /** Allocate a memory block with alignment suitable for all memory accesses
    * (including vectors if available on the CPU) and zero all the bytes of the
    * block.
    */
  def av_mallocz(size: size_t): Ptr[Byte] = extern

  /** Return a positive value if the given filename has one of the given
    * extensions, 0 otherwise.
    */
  def av_match_ext(filename: CString, extensions: CString): CInt = extern

  /** Set the maximum size that may be allocated in one block.
    */
  def av_max_alloc(max: size_t): Unit = extern

  /** Overlapping memcpy() implementation.
    */
  def av_memcpy_backptr(dst: Ptr[uint8_t], back: CInt, cnt: CInt): Unit = extern

  /** Duplicate a buffer with av_malloc().
    */
  def av_memdup(p: Ptr[Byte], size: size_t): Ptr[Byte] = extern

  def av_mod_uintp2_c(a: CUnsignedInt, p: CUnsignedInt): CUnsignedInt = extern

  /** Iterate over all registered muxers.
    */
  def av_muxer_iterate(opaque: Ptr[Ptr[Byte]]): Ptr[AVOutputFormat] = extern

  /** Allocate the payload of a packet and initialize its fields with default
    * values.
    */
  def av_new_packet(pkt: Ptr[AVPacket], size: CInt): CInt = extern

  def av_new_program(s: Ptr[AVFormatContext], id: CInt): Ptr[AVProgram] = extern

  /** Wrap an existing array as a packet side data.
    */
  def av_packet_add_side_data(
      pkt: Ptr[AVPacket],
      `type`: AVPacketSideDataType,
      data: Ptr[uint8_t],
      size: size_t
  ): CInt = extern

  /** Allocate an AVPacket and set its fields to default values. The resulting
    * struct must be freed using av_packet_free().
    */
  def av_packet_alloc(): Ptr[AVPacket] = extern

  /** Create a new packet that references the same data as src.
    */
  def av_packet_clone(src: Ptr[AVPacket]): Ptr[AVPacket] = extern

  /** Copy only "properties" fields from src to dst.
    */
  def av_packet_copy_props(dst: Ptr[AVPacket], src: Ptr[AVPacket]): CInt =
    extern

  /** Free the packet, if the packet is reference counted, it will be
    * unreferenced first.
    */
  def av_packet_free(pkt: Ptr[Ptr[AVPacket]]): Unit = extern

  /** Convenience function to free all the side data stored. All the other
    * fields stay untouched.
    */
  def av_packet_free_side_data(pkt: Ptr[AVPacket]): Unit = extern

  /** Initialize a reference-counted packet from av_malloc()ed data.
    */
  def av_packet_from_data(
      pkt: Ptr[AVPacket],
      data: Ptr[uint8_t],
      size: CInt
  ): CInt = extern

  /** Get side information from packet.
    */
  def av_packet_get_side_data(
      pkt: Ptr[AVPacket],
      `type`: AVPacketSideDataType,
      size: Ptr[size_t]
  ): Ptr[uint8_t] = extern

  /** Ensure the data described by a given packet is reference counted.
    */
  def av_packet_make_refcounted(pkt: Ptr[AVPacket]): CInt = extern

  /** Create a writable reference for the data described by a given packet,
    * avoiding data copy if possible.
    */
  def av_packet_make_writable(pkt: Ptr[AVPacket]): CInt = extern

  /** Move every field in src to dst and reset src.
    */
  def av_packet_move_ref(dst: Ptr[AVPacket], src: Ptr[AVPacket]): Unit = extern

  /** Allocate new information of a packet.
    */
  def av_packet_new_side_data(
      pkt: Ptr[AVPacket],
      `type`: AVPacketSideDataType,
      size: size_t
  ): Ptr[uint8_t] = extern

  /** Pack a dictionary for use in side_data.
    */
  def av_packet_pack_dictionary(
      dict: Ptr[AVDictionary],
      size: Ptr[size_t]
  ): Ptr[uint8_t] = extern

  /** Setup a new reference to the data described by a given packet
    */
  def av_packet_ref(dst: Ptr[AVPacket], src: Ptr[AVPacket]): CInt = extern

  /** Shrink the already allocated side data buffer
    */
  def av_packet_shrink_side_data(
      pkt: Ptr[AVPacket],
      `type`: AVPacketSideDataType,
      size: size_t
  ): CInt = extern

  /** Wrap existing data as packet side data.
    */
  def av_packet_side_data_add(
      sd: Ptr[Ptr[AVPacketSideData]],
      nb_sd: Ptr[CInt],
      `type`: AVPacketSideDataType,
      data: Ptr[Byte],
      size: size_t,
      flags: CInt
  ): Ptr[AVPacketSideData] = extern

  /** Convenience function to free all the side data stored in an array, and the
    * array itself.
    */
  def av_packet_side_data_free(
      sd: Ptr[Ptr[AVPacketSideData]],
      nb_sd: Ptr[CInt]
  ): Unit = extern

  /** Get side information from a side data array.
    */
  def av_packet_side_data_get(
      sd: Ptr[AVPacketSideData],
      nb_sd: CInt,
      `type`: AVPacketSideDataType
  ): Ptr[AVPacketSideData] = extern

  def av_packet_side_data_name(`type`: AVPacketSideDataType): CString = extern

  /** Allocate a new packet side data.
    */
  def av_packet_side_data_new(
      psd: Ptr[Ptr[AVPacketSideData]],
      pnb_sd: Ptr[CInt],
      `type`: AVPacketSideDataType,
      size: size_t,
      flags: CInt
  ): Ptr[AVPacketSideData] = extern

  /** Remove side data of the given type from a side data array.
    */
  def av_packet_side_data_remove(
      sd: Ptr[AVPacketSideData],
      nb_sd: Ptr[CInt],
      `type`: AVPacketSideDataType
  ): Unit = extern

  /** Unpack a dictionary from side_data.
    */
  def av_packet_unpack_dictionary(
      data: Ptr[uint8_t],
      size: size_t,
      dict: Ptr[Ptr[AVDictionary]]
  ): CInt = extern

  /** Wipe the packet.
    */
  def av_packet_unref(pkt: Ptr[AVPacket]): Unit = extern

  def av_parity_c(v: uint32_t): CInt = extern

  def av_parser_close(s: Ptr[AVCodecParserContext]): Unit = extern

  def av_parser_init(codec_id: CInt): Ptr[AVCodecParserContext] = extern

  /** Iterate over all registered codec parsers.
    */
  def av_parser_iterate(opaque: Ptr[Ptr[Byte]]): Ptr[AVCodecParser] = extern

  /** Parse a packet.
    */
  def av_parser_parse2(
      s: Ptr[AVCodecParserContext],
      avctx: Ptr[AVCodecContext],
      poutbuf: Ptr[Ptr[uint8_t]],
      poutbuf_size: Ptr[CInt],
      buf: Ptr[uint8_t],
      buf_size: CInt,
      pts: int64_t,
      dts: int64_t,
      pos: int64_t
  ): CInt = extern

  /** Send a nice dump of a packet to the specified file stream.
    */
  def av_pkt_dump2(
      f: Ptr[FILE],
      pkt: Ptr[AVPacket],
      dump_payload: CInt,
      st: Ptr[AVStream]
  ): Unit = extern

  /** Send a nice dump of a packet to the log.
    */
  def av_pkt_dump_log2(
      avcl: Ptr[Byte],
      level: CInt,
      pkt: Ptr[AVPacket],
      dump_payload: CInt,
      st: Ptr[AVStream]
  ): Unit = extern

  /** Count number of bits set to one in x
    */
  def av_popcount64_c(x: uint64_t): CInt = extern

  /** Count number of bits set to one in x
    */
  def av_popcount_c(x: uint32_t): CInt = extern

  /** Like av_probe_input_buffer2() but returns 0 on success
    */
  def av_probe_input_buffer(
      pb: Ptr[AVIOContext],
      fmt: Ptr[Ptr[AVInputFormat]],
      url: CString,
      logctx: Ptr[Byte],
      offset: CUnsignedInt,
      max_probe_size: CUnsignedInt
  ): CInt = extern

  /** Probe a bytestream to determine the input format. Each time a probe
    * returns with a score that is too low, the probe buffer size is increased
    * and another attempt is made. When the maximum probe size is reached, the
    * input format with the highest score is returned.
    */
  def av_probe_input_buffer2(
      pb: Ptr[AVIOContext],
      fmt: Ptr[Ptr[AVInputFormat]],
      url: CString,
      logctx: Ptr[Byte],
      offset: CUnsignedInt,
      max_probe_size: CUnsignedInt
  ): CInt = extern

  /** Guess the file format.
    */
  def av_probe_input_format(
      pd: Ptr[AVProbeData],
      is_opened: CInt
  ): Ptr[AVInputFormat] = extern

  /** Guess the file format.
    */
  def av_probe_input_format2(
      pd: Ptr[AVProbeData],
      is_opened: CInt,
      score_max: Ptr[CInt]
  ): Ptr[AVInputFormat] = extern

  /** Guess the file format.
    */
  def av_probe_input_format3(
      pd: Ptr[AVProbeData],
      is_opened: CInt,
      score_ret: Ptr[CInt]
  ): Ptr[AVInputFormat] = extern

  def av_program_add_stream_index(
      ac: Ptr[AVFormatContext],
      progid: CInt,
      idx: CUnsignedInt
  ): Unit = extern

  /** Return the next frame of a stream. This function returns what is stored in
    * the file, and does not validate that what is there are valid frames for
    * the decoder. It will split what is stored in the file into frames and
    * return one for each call. It will not omit invalid data between valid
    * frames so as to give the decoder the maximum information possible for
    * decoding.
    */
  def av_read_frame(s: Ptr[AVFormatContext], pkt: Ptr[AVPacket]): CInt = extern

  /** Pause a network-based stream (e.g. RTSP stream).
    */
  def av_read_pause(s: Ptr[AVFormatContext]): CInt = extern

  /** Start playing a network-based stream (e.g. RTSP stream) at the current
    * position.
    */
  def av_read_play(s: Ptr[AVFormatContext]): CInt = extern

  /** Allocate, reallocate, or free a block of memory.
    */
  def av_realloc(ptr: Ptr[Byte], size: size_t): Ptr[Byte] = extern

  /** Allocate, reallocate, or free an array.
    */
  def av_realloc_array(ptr: Ptr[Byte], nmemb: size_t, size: size_t): Ptr[Byte] =
    extern

  /** Allocate, reallocate, or free a block of memory.
    */
  def av_realloc_f(ptr: Ptr[Byte], nelem: size_t, elsize: size_t): Ptr[Byte] =
    extern

  /** Allocate, reallocate, or free a block of memory through a pointer to a
    * pointer.
    */
  def av_reallocp(ptr: Ptr[Byte], size: size_t): CInt = extern

  /** Allocate, reallocate an array through a pointer to a pointer.
    */
  def av_reallocp_array(ptr: Ptr[Byte], nmemb: size_t, size: size_t): CInt =
    extern

  /** Reduce a fraction.
    */
  def av_reduce(
      dst_num: Ptr[CInt],
      dst_den: Ptr[CInt],
      num: int64_t,
      den: int64_t,
      max: int64_t
  ): CInt = extern

  /** Rescale a 64-bit integer with rounding to nearest.
    */
  def av_rescale(a: int64_t, b: int64_t, c: int64_t): int64_t = extern

  /** Rescale a 64-bit integer with specified rounding.
    */
  def av_rescale_rnd(
      a: int64_t,
      b: int64_t,
      c: int64_t,
      rnd: AVRounding
  ): int64_t = extern

  /** Check if the sample format is planar.
    */
  def av_sample_fmt_is_planar(sample_fmt: AVSampleFormat): CInt = extern

  /** Allocate a samples buffer for nb_samples samples, and fill data pointers
    * and linesize accordingly. The allocated samples buffer can be freed by
    * using av_freep(&audio_data[0]) Allocated data will be initialized to
    * silence.
    */
  def av_samples_alloc(
      audio_data: Ptr[Ptr[uint8_t]],
      linesize: Ptr[CInt],
      nb_channels: CInt,
      nb_samples: CInt,
      sample_fmt: AVSampleFormat,
      align: CInt
  ): CInt = extern

  /** Allocate a data pointers array, samples buffer for nb_samples samples, and
    * fill data pointers and linesize accordingly.
    */
  def av_samples_alloc_array_and_samples(
      audio_data: Ptr[Ptr[Ptr[uint8_t]]],
      linesize: Ptr[CInt],
      nb_channels: CInt,
      nb_samples: CInt,
      sample_fmt: AVSampleFormat,
      align: CInt
  ): CInt = extern

  /** Copy samples from src to dst.
    */
  def av_samples_copy(
      dst: Ptr[Ptr[uint8_t]],
      src: Ptr[Ptr[uint8_t]],
      dst_offset: CInt,
      src_offset: CInt,
      nb_samples: CInt,
      nb_channels: CInt,
      sample_fmt: AVSampleFormat
  ): CInt = extern

  /** Fill plane data pointers and linesize for samples with sample format
    * sample_fmt.
    */
  def av_samples_fill_arrays(
      audio_data: Ptr[Ptr[uint8_t]],
      linesize: Ptr[CInt],
      buf: Ptr[uint8_t],
      nb_channels: CInt,
      nb_samples: CInt,
      sample_fmt: AVSampleFormat,
      align: CInt
  ): CInt = extern

  /** Get the required buffer size for the given audio parameters.
    */
  def av_samples_get_buffer_size(
      linesize: Ptr[CInt],
      nb_channels: CInt,
      nb_samples: CInt,
      sample_fmt: AVSampleFormat,
      align: CInt
  ): CInt = extern

  /** Fill an audio buffer with silence.
    */
  def av_samples_set_silence(
      audio_data: Ptr[Ptr[uint8_t]],
      offset: CInt,
      nb_samples: CInt,
      nb_channels: CInt,
      sample_fmt: AVSampleFormat
  ): CInt = extern

  /** Add two signed 32-bit values with saturation.
    */
  def av_sat_add32_c(a: CInt, b: CInt): CInt = extern

  /** Add two signed 64-bit values with saturation.
    */
  def av_sat_add64_c(a: int64_t, b: int64_t): int64_t = extern

  /** Add a doubled value to another value with saturation at both stages.
    */
  def av_sat_dadd32_c(a: CInt, b: CInt): CInt = extern

  /** Subtract a doubled value from another value with saturation at both
    * stages.
    */
  def av_sat_dsub32_c(a: CInt, b: CInt): CInt = extern

  /** Subtract two signed 32-bit values with saturation.
    */
  def av_sat_sub32_c(a: CInt, b: CInt): CInt = extern

  /** Subtract two signed 64-bit values with saturation.
    */
  def av_sat_sub64_c(a: int64_t, b: int64_t): int64_t = extern

  /** Generate an SDP for an RTP session.
    */
  def av_sdp_create(
      ac: Ptr[Ptr[AVFormatContext]],
      n_files: CInt,
      buf: CString,
      size: CInt
  ): CInt = extern

  /** Seek to the keyframe at timestamp. 'timestamp' in 'stream_index'.
    */
  def av_seek_frame(
      s: Ptr[AVFormatContext],
      stream_index: CInt,
      timestamp: int64_t,
      flags: CInt
  ): CInt = extern

  /** Reduce packet size, correctly zeroing padding
    */
  def av_shrink_packet(pkt: Ptr[AVPacket], size: CInt): Unit = extern

  /** Multiply two `size_t` values checking for overflow.
    */
  def av_size_mult(a: size_t, b: size_t, r: Ptr[size_t]): CInt = extern

  /** Duplicate a string.
    */
  def av_strdup(s: CString): CString = extern

  /** Wrap an existing array as stream side data.
    */
  def av_stream_add_side_data(
      st: Ptr[AVStream],
      `type`: AVPacketSideDataType,
      data: Ptr[uint8_t],
      size: size_t
  ): CInt = extern

  /** Get the AVClass for AVStream. It can be used in combination with
    * AV_OPT_SEARCH_FAKE_OBJ for examining options.
    */
  def av_stream_get_class(): Ptr[AVClass] = extern

  def av_stream_get_first_dts(st: Ptr[AVStream]): int64_t = extern

  def av_stream_get_parser(s: Ptr[AVStream]): Ptr[AVCodecParserContext] = extern

  /** Get side information from stream.
    */
  def av_stream_get_side_data(
      stream: Ptr[AVStream],
      `type`: AVPacketSideDataType,
      size: Ptr[size_t]
  ): Ptr[uint8_t] = extern

  /** Get the AVClass for AVStreamGroup. It can be used in combination with
    * AV_OPT_SEARCH_FAKE_OBJ for examining options.
    */
  def av_stream_group_get_class(): Ptr[AVClass] = extern

  /** Allocate new information from stream.
    */
  def av_stream_new_side_data(
      stream: Ptr[AVStream],
      `type`: AVPacketSideDataType,
      size: size_t
  ): Ptr[uint8_t] = extern

  /** Put a description of the AVERROR code errnum in errbuf. In case of failure
    * the global variable errno is set to indicate the error. Even in case of
    * failure av_strerror() will print a generic error message indicating the
    * errnum provided to errbuf.
    */
  def av_strerror(errnum: CInt, errbuf: CString, errbuf_size: size_t): CInt =
    extern

  /** Duplicate a substring of a string.
    */
  def av_strndup(s: CString, len: size_t): CString = extern

  /** Split a URL string into components.
    */
  def av_url_split(
      proto: CString,
      proto_size: CInt,
      authorization: CString,
      authorization_size: CInt,
      hostname: CString,
      hostname_size: CInt,
      port_ptr: Ptr[CInt],
      path: CString,
      path_size: CInt,
      url: CString
  ): Unit = extern

  /** Return an informative version string. This usually is the actual release
    * version number or a git commit description. This string has no fixed
    * format and can change any time. It should never be parsed by code.
    */
  def av_version_info(): CString = extern

  /** Send the specified message to the log if the level is less than or equal
    * to the current av_log_level. By default, all logging messages are sent to
    * stderr. This behavior can be altered by setting a different logging
    * callback function.
    */
  def av_vlog(avcl: Ptr[Byte], level: CInt, fmt: CString, vl: va_list): Unit =
    extern

  /** Write a packet to an output media file.
    */
  def av_write_frame(s: Ptr[AVFormatContext], pkt: Ptr[AVPacket]): CInt = extern

  /** Write the stream trailer to an output media file and free the file private
    * data.
    */
  def av_write_trailer(s: Ptr[AVFormatContext]): CInt = extern

  /** Write an uncoded frame to an output media file.
    */
  def av_write_uncoded_frame(
      s: Ptr[AVFormatContext],
      stream_index: CInt,
      frame: Ptr[AVFrame]
  ): CInt = extern

  /** Test whether a muxer supports uncoded frame.
    */
  def av_write_uncoded_frame_query(
      s: Ptr[AVFormatContext],
      stream_index: CInt
  ): CInt = extern

  /** Return x default pointer in case p is NULL.
    */
  def av_x_if_null(p: Ptr[Byte], x: Ptr[Byte]): Ptr[Byte] = extern

  /** Encode extradata length to a buffer. Used by xiph codecs.
    */
  def av_xiphlacing(s: Ptr[CUnsignedChar], v: CUnsignedInt): CUnsignedInt =
    extern

  /** Clear high bits from an unsigned integer starting with specific bit
    * position
    */
  def av_zero_extend_c(a: CUnsignedInt, p: CUnsignedInt): CUnsignedInt = extern

  /** Modify width and height values so that they will result in a memory buffer
    * that is acceptable for the codec if you do not use any horizontal padding.
    */
  def avcodec_align_dimensions(
      s: Ptr[AVCodecContext],
      width: Ptr[CInt],
      height: Ptr[CInt]
  ): Unit = extern

  /** Modify width and height values so that they will result in a memory buffer
    * that is acceptable for the codec if you also ensure that all line sizes
    * are a multiple of the respective linesize_align[i].
    */
  def avcodec_align_dimensions2(
      s: Ptr[AVCodecContext],
      width: Ptr[CInt],
      height: Ptr[CInt],
      linesize_align: CArray[CInt, Nat._8]
  ): Unit = extern

  /** Allocate an AVCodecContext and set its fields to default values. The
    * resulting struct should be freed with avcodec_free_context().
    */
  def avcodec_alloc_context3(codec: Ptr[AVCodec]): Ptr[AVCodecContext] = extern

  /** Close a given AVCodecContext and free all the data associated with it (but
    * not the AVCodecContext itself).
    */
  def avcodec_close(avctx: Ptr[AVCodecContext]): CInt = extern

  /** Return the libavcodec build-time configuration.
    */
  def avcodec_configuration(): CString = extern

  /** Decode a subtitle message. Return a negative value on error, otherwise
    * return the number of bytes used. If no subtitle could be decompressed,
    * got_sub_ptr is zero. Otherwise, the subtitle is stored in *sub. Note that
    * AV_CODEC_CAP_DR1 is not available for subtitle codecs. This is for
    * simplicity, because the performance difference is expected to be
    * negligible and reusing a get_buffer written for video codecs would
    * probably perform badly due to a potentially very different allocation
    * pattern.
    */
  def avcodec_decode_subtitle2(
      avctx: Ptr[AVCodecContext],
      sub: Ptr[AVSubtitle],
      got_sub_ptr: Ptr[CInt],
      avpkt: Ptr[AVPacket]
  ): CInt = extern

  def avcodec_default_execute(
      c: Ptr[AVCodecContext],
      func: CFuncPtr2[Ptr[AVCodecContext], Ptr[Byte], CInt],
      arg: Ptr[Byte],
      ret: Ptr[CInt],
      count: CInt,
      size: CInt
  ): CInt = extern

  def avcodec_default_execute2(
      c: Ptr[AVCodecContext],
      func: CFuncPtr4[Ptr[AVCodecContext], Ptr[Byte], CInt, CInt, CInt],
      arg: Ptr[Byte],
      ret: Ptr[CInt],
      count: CInt
  ): CInt = extern

  /** The default callback for AVCodecContext.get_buffer2(). It is made public
    * so it can be called by custom get_buffer2() implementations for decoders
    * without AV_CODEC_CAP_DR1 set.
    */
  def avcodec_default_get_buffer2(
      s: Ptr[AVCodecContext],
      frame: Ptr[AVFrame],
      flags: CInt
  ): CInt = extern

  /** The default callback for AVCodecContext.get_encode_buffer(). It is made
    * public so it can be called by custom get_encode_buffer() implementations
    * for encoders without AV_CODEC_CAP_DR1 set.
    */
  def avcodec_default_get_encode_buffer(
      s: Ptr[AVCodecContext],
      pkt: Ptr[AVPacket],
      flags: CInt
  ): CInt = extern

  def avcodec_default_get_format(
      s: Ptr[AVCodecContext],
      fmt: Ptr[AVPixelFormat]
  ): AVPixelFormat = extern

  /** Returns descriptor for given codec ID or NULL if no descriptor exists.
    */
  def avcodec_descriptor_get(id: AVCodecID): Ptr[AVCodecDescriptor] = extern

  /** Returns codec descriptor with the given name or NULL if no such descriptor
    * exists.
    */
  def avcodec_descriptor_get_by_name(name: CString): Ptr[AVCodecDescriptor] =
    extern

  /** Iterate over all codec descriptors known to libavcodec.
    */
  def avcodec_descriptor_next(
      prev: Ptr[AVCodecDescriptor]
  ): Ptr[AVCodecDescriptor] = extern

  /** @{
    */
  def avcodec_encode_subtitle(
      avctx: Ptr[AVCodecContext],
      buf: Ptr[uint8_t],
      buf_size: CInt,
      sub: Ptr[AVSubtitle]
  ): CInt = extern

  /** Fill AVFrame audio data and linesize pointers.
    */
  def avcodec_fill_audio_frame(
      frame: Ptr[AVFrame],
      nb_channels: CInt,
      sample_fmt: AVSampleFormat,
      buf: Ptr[uint8_t],
      buf_size: CInt,
      align: CInt
  ): CInt = extern

  /** Find the best pixel format to convert to given a certain source pixel
    * format. When converting from one pixel format to another, information loss
    * may occur. For example, when converting from RGB24 to GRAY, the color
    * information will be lost. Similarly, other losses occur when converting
    * from some formats to other formats. avcodec_find_best_pix_fmt_of_2()
    * searches which of the given pixel formats should be used to suffer the
    * least amount of loss. The pixel formats from which it chooses one, are
    * determined by the pix_fmt_list parameter.
    */
  def avcodec_find_best_pix_fmt_of_list(
      pix_fmt_list: Ptr[AVPixelFormat],
      src_pix_fmt: AVPixelFormat,
      has_alpha: CInt,
      loss_ptr: Ptr[CInt]
  ): AVPixelFormat = extern

  /** Find a registered decoder with a matching codec ID.
    */
  def avcodec_find_decoder(id: AVCodecID): Ptr[AVCodec] = extern

  /** Find a registered decoder with the specified name.
    */
  def avcodec_find_decoder_by_name(name: CString): Ptr[AVCodec] = extern

  /** Find a registered encoder with a matching codec ID.
    */
  def avcodec_find_encoder(id: AVCodecID): Ptr[AVCodec] = extern

  /** Find a registered encoder with the specified name.
    */
  def avcodec_find_encoder_by_name(name: CString): Ptr[AVCodec] = extern

  /** Reset the internal codec state / flush internal buffers. Should be called
    * e.g. when seeking or when switching to a different stream.
    */
  def avcodec_flush_buffers(avctx: Ptr[AVCodecContext]): Unit = extern

  /** Free the codec context and everything associated with it and write NULL to
    * the provided pointer.
    */
  def avcodec_free_context(avctx: Ptr[Ptr[AVCodecContext]]): Unit = extern

  /** Get the AVClass for AVCodecContext. It can be used in combination with
    * AV_OPT_SEARCH_FAKE_OBJ for examining options.
    */
  def avcodec_get_class(): Ptr[AVClass] = extern

  /** Retrieve supported hardware configurations for a codec.
    */
  def avcodec_get_hw_config(
      codec: Ptr[AVCodec],
      index: CInt
  ): Ptr[AVCodecHWConfig] = extern

  /** Create and return a AVHWFramesContext with values adequate for hardware
    * decoding. This is meant to get called from the get_format callback, and is
    * a helper for preparing a AVHWFramesContext for
    * AVCodecContext.hw_frames_ctx. This API is for decoding with certain
    * hardware acceleration modes/APIs only.
    */
  def avcodec_get_hw_frames_parameters(
      avctx: Ptr[AVCodecContext],
      device_ref: Ptr[AVBufferRef],
      hw_pix_fmt: AVPixelFormat,
      out_frames_ref: Ptr[Ptr[AVBufferRef]]
  ): CInt = extern

  /** Get the name of a codec.
    */
  def avcodec_get_name(id: AVCodecID): CString = extern

  /** Get the AVClass for AVSubtitleRect. It can be used in combination with
    * AV_OPT_SEARCH_FAKE_OBJ for examining options.
    */
  def avcodec_get_subtitle_rect_class(): Ptr[AVClass] = extern

  /** Retrieve a list of all supported values for a given configuration type.
    */
  def avcodec_get_supported_config(
      avctx: Ptr[AVCodecContext],
      codec: Ptr[AVCodec],
      config: AVCodecConfig,
      flags: CUnsignedInt,
      out_configs: Ptr[Ptr[Byte]],
      out_num_configs: Ptr[CInt]
  ): CInt = extern

  /** Get the type of the given codec.
    */
  def avcodec_get_type(codec_id: AVCodecID): AVMediaType = extern

  /** Returns a positive value if s is open (i.e. avcodec_open2() was called on
    * it with no corresponding avcodec_close()), 0 otherwise.
    */
  def avcodec_is_open(s: Ptr[AVCodecContext]): CInt = extern

  /** Return the libavcodec license.
    */
  def avcodec_license(): CString = extern

  /** Initialize the AVCodecContext to use the given AVCodec. Prior to using
    * this function the context has to be allocated with
    * avcodec_alloc_context3().
    */
  def avcodec_open2(
      avctx: Ptr[AVCodecContext],
      codec: Ptr[AVCodec],
      options: Ptr[Ptr[AVDictionary]]
  ): CInt = extern

  /** Allocate a new AVCodecParameters and set its fields to default values
    * (unknown/invalid/0). The returned struct must be freed with
    * avcodec_parameters_free().
    */
  def avcodec_parameters_alloc(): Ptr[AVCodecParameters] = extern

  /** Copy the contents of src to dst. Any allocated fields in dst are freed and
    * replaced with newly allocated duplicates of the corresponding fields in
    * src.
    */
  def avcodec_parameters_copy(
      dst: Ptr[AVCodecParameters],
      src: Ptr[AVCodecParameters]
  ): CInt = extern

  /** Free an AVCodecParameters instance and everything associated with it and
    * write NULL to the supplied pointer.
    */
  def avcodec_parameters_free(par: Ptr[Ptr[AVCodecParameters]]): Unit = extern

  /** Fill the parameters struct based on the values from the supplied codec
    * context. Any allocated fields in par are freed and replaced with
    * duplicates of the corresponding fields in codec.
    */
  def avcodec_parameters_from_context(
      par: Ptr[AVCodecParameters],
      codec: Ptr[AVCodecContext]
  ): CInt = extern

  /** Fill the codec context based on the values from the supplied codec
    * parameters. Any allocated fields in codec that have a corresponding field
    * in par are freed and replaced with duplicates of the corresponding field
    * in par. Fields in codec that do not have a counterpart in par are not
    * touched.
    */
  def avcodec_parameters_to_context(
      codec: Ptr[AVCodecContext],
      par: Ptr[AVCodecParameters]
  ): CInt = extern

  /** Return a value representing the fourCC code associated to the pixel format
    * pix_fmt, or 0 if no associated fourCC code can be found.
    */
  def avcodec_pix_fmt_to_codec_tag(pix_fmt: AVPixelFormat): CUnsignedInt =
    extern

  /** Return a name for the specified profile, if available.
    */
  def avcodec_profile_name(codec_id: AVCodecID, profile: CInt): CString = extern

  /** Return decoded output data from a decoder or encoder (when the
    * AV_CODEC_FLAG_RECON_FRAME flag is used).
    */
  def avcodec_receive_frame(
      avctx: Ptr[AVCodecContext],
      frame: Ptr[AVFrame]
  ): CInt = extern

  /** Read encoded data from the encoder.
    */
  def avcodec_receive_packet(
      avctx: Ptr[AVCodecContext],
      avpkt: Ptr[AVPacket]
  ): CInt = extern

  /** Supply a raw video or audio frame to the encoder. Use
    * avcodec_receive_packet() to retrieve buffered output packets.
    */
  def avcodec_send_frame(
      avctx: Ptr[AVCodecContext],
      frame: Ptr[AVFrame]
  ): CInt = extern

  /** Supply raw packet data as input to a decoder.
    */
  def avcodec_send_packet(
      avctx: Ptr[AVCodecContext],
      avpkt: Ptr[AVPacket]
  ): CInt = extern

  /** @}
    */
  def avcodec_string(
      buf: CString,
      buf_size: CInt,
      enc: Ptr[AVCodecContext],
      encode: CInt
  ): Unit = extern

  /** Return the LIBAVCODEC_VERSION_INT constant.
    */
  def avcodec_version(): CUnsignedInt = extern

  /** Allocate an AVFormatContext. avformat_free_context() can be used to free
    * the context and everything allocated by the framework within it.
    */
  def avformat_alloc_context(): Ptr[AVFormatContext] = extern

  /** Allocate an AVFormatContext for an output format. avformat_free_context()
    * can be used to free the context and everything allocated by the framework
    * within it.
    */
  def avformat_alloc_output_context2(
      ctx: Ptr[Ptr[AVFormatContext]],
      oformat: Ptr[AVOutputFormat],
      format_name: CString,
      filename: CString
  ): CInt = extern

  /** Close an opened input AVFormatContext. Free it and all its contents and
    * set *s to NULL.
    */
  def avformat_close_input(s: Ptr[Ptr[AVFormatContext]]): Unit = extern

  /** Return the libavformat build-time configuration.
    */
  def avformat_configuration(): CString = extern

  /** Read packets of a media file to get stream information. This is useful for
    * file formats with no headers such as MPEG. This function also computes the
    * real framerate in case of MPEG-2 repeat frame mode. The logical file
    * position is not changed by this function; examined packets may be buffered
    * for later processing.
    */
  def avformat_find_stream_info(
      ic: Ptr[AVFormatContext],
      options: Ptr[Ptr[AVDictionary]]
  ): CInt = extern

  /** Discard all internally buffered data. This can be useful when dealing with
    * discontinuities in the byte stream. Generally works only with formats that
    * can resync. This includes headerless formats like MPEG-TS/TS but should
    * also work with NUT, Ogg and in a limited way AVI for example.
    */
  def avformat_flush(s: Ptr[AVFormatContext]): CInt = extern

  /** Free an AVFormatContext and all its streams.
    */
  def avformat_free_context(s: Ptr[AVFormatContext]): Unit = extern

  /** Get the AVClass for AVFormatContext. It can be used in combination with
    * AV_OPT_SEARCH_FAKE_OBJ for examining options.
    */
  def avformat_get_class(): Ptr[AVClass] = extern

  /** Returns the table mapping MOV FourCCs for audio to AVCodecID.
    */
  def avformat_get_mov_audio_tags(): Ptr[AVCodecTag] = extern

  /** Returns the table mapping MOV FourCCs for video to libavcodec AVCodecID.
    */
  def avformat_get_mov_video_tags(): Ptr[AVCodecTag] = extern

  /** Returns the table mapping RIFF FourCCs for audio to AVCodecID.
    */
  def avformat_get_riff_audio_tags(): Ptr[AVCodecTag] = extern

  /** @{
    *   Get the tables mapping RIFF FourCCs to libavcodec AVCodecIDs. The tables
    *   are meant to be passed to av_codec_get_id()/av_codec_get_tag() as in the
    *   following code:
    */
  def avformat_get_riff_video_tags(): Ptr[AVCodecTag] = extern

  /** Get the index entry count for the given AVStream.
    */
  def avformat_index_get_entries_count(st: Ptr[AVStream]): CInt = extern

  /** Get the AVIndexEntry corresponding to the given index.
    */
  def avformat_index_get_entry(
      st: Ptr[AVStream],
      idx: CInt
  ): Ptr[AVIndexEntry] = extern

  /** Get the AVIndexEntry corresponding to the given timestamp.
    */
  def avformat_index_get_entry_from_timestamp(
      st: Ptr[AVStream],
      wanted_timestamp: int64_t,
      flags: CInt
  ): Ptr[AVIndexEntry] = extern

  /** Allocate the stream private data and initialize the codec, but do not
    * write the header. May optionally be used before avformat_write_header() to
    * initialize stream parameters before actually writing the header. If using
    * this function, do not pass the same options to avformat_write_header().
    */
  def avformat_init_output(
      s: Ptr[AVFormatContext],
      options: Ptr[Ptr[AVDictionary]]
  ): CInt = extern

  /** Return the libavformat license.
    */
  def avformat_license(): CString = extern

  /** Check if the stream st contained in s is matched by the stream specifier
    * spec.
    */
  def avformat_match_stream_specifier(
      s: Ptr[AVFormatContext],
      st: Ptr[AVStream],
      spec: CString
  ): CInt = extern

  /** Undo the initialization done by avformat_network_init. Call it only once
    * for each time you called avformat_network_init.
    */
  def avformat_network_deinit(): CInt = extern

  /** Do global initialization of network libraries. This is optional, and not
    * recommended anymore.
    */
  def avformat_network_init(): CInt = extern

  /** Add a new stream to a media file.
    */
  def avformat_new_stream(
      s: Ptr[AVFormatContext],
      c: Ptr[AVCodec]
  ): Ptr[AVStream] = extern

  /** Open an input stream and read the header. The codecs are not opened. The
    * stream must be closed with avformat_close_input().
    */
  def avformat_open_input(
      ps: Ptr[Ptr[AVFormatContext]],
      url: CString,
      fmt: Ptr[AVInputFormat],
      options: Ptr[Ptr[AVDictionary]]
  ): CInt = extern

  /** Test if the given container can store a codec.
    */
  def avformat_query_codec(
      ofmt: Ptr[AVOutputFormat],
      codec_id: AVCodecID,
      std_compliance: CInt
  ): CInt = extern

  def avformat_queue_attached_pictures(s: Ptr[AVFormatContext]): CInt = extern

  /** Seek to timestamp ts. Seeking will be done so that the point from which
    * all active streams can be presented successfully will be closest to ts and
    * within min/max_ts. Active streams are all streams that have
    * AVStream.discard < AVDISCARD_ALL.
    */
  def avformat_seek_file(
      s: Ptr[AVFormatContext],
      stream_index: CInt,
      min_ts: int64_t,
      ts: int64_t,
      max_ts: int64_t,
      flags: CInt
  ): CInt = extern

  /** Add an already allocated stream to a stream group.
    */
  def avformat_stream_group_add_stream(
      stg: Ptr[AVStreamGroup],
      st: Ptr[AVStream]
  ): CInt = extern

  /** Add a new empty stream group to a media file.
    */
  def avformat_stream_group_create(
      s: Ptr[AVFormatContext],
      `type`: AVStreamGroupParamsType,
      options: Ptr[Ptr[AVDictionary]]
  ): Ptr[AVStreamGroup] = extern

  /** Returns a string identifying the stream group type, or NULL if unknown
    */
  def avformat_stream_group_name(`type`: AVStreamGroupParamsType): CString =
    extern

  def avformat_transfer_internal_stream_timing_info(
      ofmt: Ptr[AVOutputFormat],
      ost: Ptr[AVStream],
      ist: Ptr[AVStream],
      copy_tb: AVTimebaseSource
  ): CInt = extern

  /** Return the LIBAVFORMAT_VERSION_INT constant.
    */
  def avformat_version(): CUnsignedInt = extern

  /** Allocate the stream private data and write the stream header to an output
    * media file.
    */
  def avformat_write_header(
      s: Ptr[AVFormatContext],
      options: Ptr[Ptr[AVDictionary]]
  ): CInt = extern

  /** Accept and allocate a client context on a server context.
    */
  def avio_accept(s: Ptr[AVIOContext], c: Ptr[Ptr[AVIOContext]]): CInt = extern

  /** Allocate and initialize an AVIOContext for buffered I/O. It must be later
    * freed with avio_context_free().
    */
  def avio_alloc_context(
      buffer: Ptr[CUnsignedChar],
      buffer_size: CInt,
      write_flag: CInt,
      opaque: Ptr[Byte],
      read_packet: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt],
      write_packet: CFuncPtr3[Ptr[Byte], Ptr[uint8_t], CInt, CInt],
      seek: CFuncPtr3[Ptr[Byte], int64_t, CInt, int64_t]
  ): Ptr[AVIOContext] = extern

  /** Return AVIO_FLAG_* access flags corresponding to the access permissions of
    * the resource in url, or a negative value corresponding to an AVERROR code
    * in case of failure. The returned access flags are masked by the value in
    * flags.
    */
  def avio_check(url: CString, flags: CInt): CInt = extern

  /** Close the resource accessed by the AVIOContext s and free it. This
    * function can only be used if s was opened by avio_open().
    */
  def avio_close(s: Ptr[AVIOContext]): CInt = extern

  /** Close directory.
    */
  def avio_close_dir(s: Ptr[Ptr[AVIODirContext]]): CInt = extern

  /** Return the written size and a pointer to the buffer. The buffer must be
    * freed with av_free(). Padding of AV_INPUT_BUFFER_PADDING_SIZE is added to
    * the buffer.
    */
  def avio_close_dyn_buf(
      s: Ptr[AVIOContext],
      pbuffer: Ptr[Ptr[uint8_t]]
  ): CInt = extern

  /** Close the resource accessed by the AVIOContext *s, free it and set the
    * pointer pointing to it to NULL. This function can only be used if s was
    * opened by avio_open().
    */
  def avio_closep(s: Ptr[Ptr[AVIOContext]]): CInt = extern

  /** Free the supplied IO context and everything associated with it.
    */
  def avio_context_free(s: Ptr[Ptr[AVIOContext]]): Unit = extern

  /** Iterate through names of available protocols.
    */
  def avio_enum_protocols(opaque: Ptr[Ptr[Byte]], output: CInt): CString =
    extern

  /** Similar to feof() but also returns nonzero on read errors.
    */
  def avio_feof(s: Ptr[AVIOContext]): CInt = extern

  /** Return the name of the protocol that will handle the passed URL.
    */
  def avio_find_protocol_name(url: CString): CString = extern

  /** Force flushing of buffered data.
    */
  def avio_flush(s: Ptr[AVIOContext]): Unit = extern

  /** Free entry allocated by avio_read_dir().
    */
  def avio_free_directory_entry(entry: Ptr[Ptr[AVIODirEntry]]): Unit = extern

  /** Return the written size and a pointer to the buffer. The AVIOContext
    * stream is left intact. The buffer must NOT be freed. No padding is added
    * to the buffer.
    */
  def avio_get_dyn_buf(s: Ptr[AVIOContext], pbuffer: Ptr[Ptr[uint8_t]]): CInt =
    extern

  /** Read a string from pb into buf. The reading will terminate when either a
    * NULL character was encountered, maxlen bytes have been read, or nothing
    * more can be read from pb. The result is guaranteed to be NULL-terminated,
    * it will be truncated if buf is too small. Note that the string is not
    * interpreted or validated in any way, it might get truncated in the middle
    * of a sequence for multi-byte encodings.
    */
  def avio_get_str(
      pb: Ptr[AVIOContext],
      maxlen: CInt,
      buf: CString,
      buflen: CInt
  ): CInt = extern

  def avio_get_str16be(
      pb: Ptr[AVIOContext],
      maxlen: CInt,
      buf: CString,
      buflen: CInt
  ): CInt = extern

  /** Read a UTF-16 string from pb and convert it to UTF-8. The reading will
    * terminate when either a null or invalid character was encountered or
    * maxlen bytes have been read.
    */
  def avio_get_str16le(
      pb: Ptr[AVIOContext],
      maxlen: CInt,
      buf: CString,
      buflen: CInt
  ): CInt = extern

  /** Perform one step of the protocol handshake to accept a new client. This
    * function must be called on a client returned by avio_accept() before using
    * it as a read/write context. It is separate from avio_accept() because it
    * may block. A step of the handshake is defined by places where the
    * application may decide to change the proceedings. For example, on a
    * protocol with a request header and a reply header, each one can constitute
    * a step because the application may use the parameters from the request to
    * change parameters in the reply; or each individual chunk of the request
    * can constitute a step. If the handshake is already finished,
    * avio_handshake() does nothing and returns 0 immediately.
    */
  def avio_handshake(c: Ptr[AVIOContext]): CInt = extern

  /** Create and initialize a AVIOContext for accessing the resource indicated
    * by url.
    */
  def avio_open(s: Ptr[Ptr[AVIOContext]], url: CString, flags: CInt): CInt =
    extern

  /** Create and initialize a AVIOContext for accessing the resource indicated
    * by url.
    */
  def avio_open2(
      s: Ptr[Ptr[AVIOContext]],
      url: CString,
      flags: CInt,
      int_cb: Ptr[AVIOInterruptCB],
      options: Ptr[Ptr[AVDictionary]]
  ): CInt = extern

  /** Open directory for reading.
    */
  def avio_open_dir(
      s: Ptr[Ptr[AVIODirContext]],
      url: CString,
      options: Ptr[Ptr[AVDictionary]]
  ): CInt = extern

  /** Open a write only memory stream.
    */
  def avio_open_dyn_buf(s: Ptr[Ptr[AVIOContext]]): CInt = extern

  /** Pause and resume playing - only meaningful if using a network streaming
    * protocol (e.g. MMS).
    */
  def avio_pause(h: Ptr[AVIOContext], pause: CInt): CInt = extern

  /** Write a NULL terminated array of strings to the context. Usually you don't
    * need to use this function directly but its macro wrapper, avio_print.
    */
  def avio_print_string_array(
      s: Ptr[AVIOContext],
      strings: Ptr[CString]
  ): Unit = extern

  /** Writes a formatted string to the context.
    */
  def avio_printf(s: Ptr[AVIOContext], fmt: CString, rest: Any*): CInt = extern

  /** Get AVClass by names of available protocols.
    */
  def avio_protocol_get_class(name: CString): Ptr[AVClass] = extern

  /** Write a NULL-terminated string.
    */
  def avio_put_str(s: Ptr[AVIOContext], str: CString): CInt = extern

  /** Convert an UTF-8 string to UTF-16BE and write it.
    */
  def avio_put_str16be(s: Ptr[AVIOContext], str: CString): CInt = extern

  /** Convert an UTF-8 string to UTF-16LE and write it.
    */
  def avio_put_str16le(s: Ptr[AVIOContext], str: CString): CInt = extern

  /** @{
    */
  def avio_r8(s: Ptr[AVIOContext]): CInt = extern

  def avio_rb16(s: Ptr[AVIOContext]): CUnsignedInt = extern

  def avio_rb24(s: Ptr[AVIOContext]): CUnsignedInt = extern

  def avio_rb32(s: Ptr[AVIOContext]): CUnsignedInt = extern

  def avio_rb64(s: Ptr[AVIOContext]): uint64_t = extern

  /** Read size bytes from AVIOContext into buf.
    */
  def avio_read(
      s: Ptr[AVIOContext],
      buf: Ptr[CUnsignedChar],
      size: CInt
  ): CInt = extern

  /** Get next directory entry.
    */
  def avio_read_dir(
      s: Ptr[AVIODirContext],
      next: Ptr[Ptr[AVIODirEntry]]
  ): CInt = extern

  /** Read size bytes from AVIOContext into buf. Unlike avio_read(), this is
    * allowed to read fewer bytes than requested. The missing bytes can be read
    * in the next call. This always tries to read at least 1 byte. Useful to
    * reduce latency in certain cases.
    */
  def avio_read_partial(
      s: Ptr[AVIOContext],
      buf: Ptr[CUnsignedChar],
      size: CInt
  ): CInt = extern

  /** Read contents of h into print buffer, up to max_size bytes, or up to EOF.
    */
  def avio_read_to_bprint(
      h: Ptr[AVIOContext],
      pb: Ptr[AVBPrint],
      max_size: size_t
  ): CInt = extern

  def avio_rl16(s: Ptr[AVIOContext]): CUnsignedInt = extern

  def avio_rl24(s: Ptr[AVIOContext]): CUnsignedInt = extern

  def avio_rl32(s: Ptr[AVIOContext]): CUnsignedInt = extern

  def avio_rl64(s: Ptr[AVIOContext]): uint64_t = extern

  /** fseek() equivalent for AVIOContext.
    */
  def avio_seek(s: Ptr[AVIOContext], offset: int64_t, whence: CInt): int64_t =
    extern

  /** Seek to a given timestamp relative to some component stream. Only
    * meaningful if using a network streaming protocol (e.g. MMS.).
    */
  def avio_seek_time(
      h: Ptr[AVIOContext],
      stream_index: CInt,
      timestamp: int64_t,
      flags: CInt
  ): int64_t = extern

  /** Get the filesize.
    */
  def avio_size(s: Ptr[AVIOContext]): int64_t = extern

  /** Skip given number of bytes forward
    */
  def avio_skip(s: Ptr[AVIOContext], offset: int64_t): int64_t = extern

  /** ftell() equivalent for AVIOContext.
    */
  def avio_tell(s: Ptr[AVIOContext]): int64_t = extern

  /** Writes a formatted string to the context taking a va_list.
    */
  def avio_vprintf(s: Ptr[AVIOContext], fmt: CString, ap: va_list): CInt =
    extern

  def avio_w8(s: Ptr[AVIOContext], b: CInt): Unit = extern

  def avio_wb16(s: Ptr[AVIOContext], `val`: CUnsignedInt): Unit = extern

  def avio_wb24(s: Ptr[AVIOContext], `val`: CUnsignedInt): Unit = extern

  def avio_wb32(s: Ptr[AVIOContext], `val`: CUnsignedInt): Unit = extern

  def avio_wb64(s: Ptr[AVIOContext], `val`: uint64_t): Unit = extern

  def avio_wl16(s: Ptr[AVIOContext], `val`: CUnsignedInt): Unit = extern

  def avio_wl24(s: Ptr[AVIOContext], `val`: CUnsignedInt): Unit = extern

  def avio_wl32(s: Ptr[AVIOContext], `val`: CUnsignedInt): Unit = extern

  def avio_wl64(s: Ptr[AVIOContext], `val`: uint64_t): Unit = extern

  def avio_write(
      s: Ptr[AVIOContext],
      buf: Ptr[CUnsignedChar],
      size: CInt
  ): Unit = extern

  /** Mark the written bytestream as a specific type.
    */
  def avio_write_marker(
      s: Ptr[AVIOContext],
      time: int64_t,
      `type`: AVIODataMarkerType
  ): Unit = extern

  /** Free all allocated data in the given subtitle struct.
    */
  def avsubtitle_free(sub: Ptr[AVSubtitle]): Unit = extern

  /** Return the libavutil build-time configuration.
    */
  def avutil_configuration(): CString = extern

  /** Return the libavutil license.
    */
  def avutil_license(): CString = extern

  /** Return the LIBAVUTIL_VERSION_INT constant.
    */
  def avutil_version(): CUnsignedInt = extern
end extern_functions

object functions:
  import _root_.ffmpeg.enumerations.*
  import _root_.ffmpeg.predef.*
  import _root_.ffmpeg.aliases.*
  import _root_.ffmpeg.structs.*
  import _root_.ffmpeg.unions.*
  import extern_functions.*
  export extern_functions.*

  /** Add two rationals.
    */
  def av_add_q(b: Ptr[AVRational], c: Ptr[AVRational])(
      __return: Ptr[AVRational]
  ): Unit =
    __sn_wrap_ffmpeg_av_add_q(b, c, __return)

  /** Add two rationals.
    */
  def av_add_q(b: Ptr[AVRational], c: Ptr[AVRational])(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_add_q(b, c, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Add two rationals.
    */
  def av_add_q(b: AVRational, c: AVRational)(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](3)
    !(__ptr_0 + 0) = b
    !(__ptr_0 + 1) = c
    __sn_wrap_ffmpeg_av_add_q((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
    !(__ptr_0 + 2)

  /** Add a value to a timestamp.
    */
  def av_add_stable(
      ts_tb: Ptr[AVRational],
      ts: int64_t,
      inc_tb: Ptr[AVRational],
      inc: int64_t
  ): int64_t =
    __sn_wrap_ffmpeg_av_add_stable(ts_tb, ts, inc_tb, inc)

  /** Add a value to a timestamp.
    */
  def av_add_stable(
      ts_tb: AVRational,
      ts: int64_t,
      inc_tb: AVRational,
      inc: int64_t
  )(using Zone): int64_t =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](2)
    !(__ptr_0 + 0) = ts_tb
    !(__ptr_0 + 1) = inc_tb
    __sn_wrap_ffmpeg_av_add_stable((__ptr_0 + 0), ts, (__ptr_0 + 1), inc)
  end av_add_stable

  /** Compare two rationals.
    */
  def av_cmp_q(a: AVRational, b: AVRational)(using Zone): CInt =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](2)
    !(__ptr_0 + 0) = a
    !(__ptr_0 + 1) = b
    __sn_wrap_ffmpeg_av_cmp_q((__ptr_0 + 0), (__ptr_0 + 1))

  /** Compare two rationals.
    */
  def av_cmp_q(a: Ptr[AVRational], b: Ptr[AVRational]): CInt =
    __sn_wrap_ffmpeg_av_cmp_q(a, b)

  /** Compare two timestamps each in its own time base.
    */
  def av_compare_ts(
      ts_a: int64_t,
      tb_a: AVRational,
      ts_b: int64_t,
      tb_b: AVRational
  )(using Zone): CInt =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](2)
    !(__ptr_0 + 0) = tb_a
    !(__ptr_0 + 1) = tb_b
    __sn_wrap_ffmpeg_av_compare_ts(ts_a, (__ptr_0 + 0), ts_b, (__ptr_0 + 1))
  end av_compare_ts

  /** Compare two timestamps each in its own time base.
    */
  def av_compare_ts(
      ts_a: int64_t,
      tb_a: Ptr[AVRational],
      ts_b: int64_t,
      tb_b: Ptr[AVRational]
  ): CInt =
    __sn_wrap_ffmpeg_av_compare_ts(ts_a, tb_a, ts_b, tb_b)

  /** Convert a double precision floating point number to a rational.
    */
  def av_d2q(d: Double, max: CInt)(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_d2q(d, max, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Convert a double precision floating point number to a rational.
    */
  def av_d2q(d: Double, max: CInt)(__return: Ptr[AVRational]): Unit =
    __sn_wrap_ffmpeg_av_d2q(d, max, __return)

  /** Divide one rational by another.
    */
  def av_div_q(b: Ptr[AVRational], c: Ptr[AVRational])(
      __return: Ptr[AVRational]
  ): Unit =
    __sn_wrap_ffmpeg_av_div_q(b, c, __return)

  /** Divide one rational by another.
    */
  def av_div_q(b: Ptr[AVRational], c: Ptr[AVRational])(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_div_q(b, c, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Divide one rational by another.
    */
  def av_div_q(b: AVRational, c: AVRational)(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](3)
    !(__ptr_0 + 0) = b
    !(__ptr_0 + 1) = c
    __sn_wrap_ffmpeg_av_div_q((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
    !(__ptr_0 + 2)

  /** Find the value in a list of rationals nearest a given reference rational.
    */
  def av_find_nearest_q_idx(q: AVRational, q_list: Ptr[AVRational])(using
      Zone
  ): CInt =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    !(__ptr_0 + 0) = q
    __sn_wrap_ffmpeg_av_find_nearest_q_idx((__ptr_0 + 0), q_list)

  /** Find the value in a list of rationals nearest a given reference rational.
    */
  def av_find_nearest_q_idx(q: Ptr[AVRational], q_list: Ptr[AVRational]): CInt =
    __sn_wrap_ffmpeg_av_find_nearest_q_idx(q, q_list)

  /** Return the best rational so that a and b are multiple of it. If the
    * resulting denominator is larger than max_den, return def.
    */
  def av_gcd_q(
      a: Ptr[AVRational],
      b: Ptr[AVRational],
      max_den: CInt,
      `def`: Ptr[AVRational]
  )(__return: Ptr[AVRational]): Unit =
    __sn_wrap_ffmpeg_av_gcd_q(a, b, max_den, `def`, __return)

  /** Return the best rational so that a and b are multiple of it. If the
    * resulting denominator is larger than max_den, return def.
    */
  def av_gcd_q(
      a: Ptr[AVRational],
      b: Ptr[AVRational],
      max_den: CInt,
      `def`: Ptr[AVRational]
  )(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_gcd_q(a, b, max_den, `def`, (__ptr_0 + 0))
    !(__ptr_0 + 0)
  end av_gcd_q

  /** Return the best rational so that a and b are multiple of it. If the
    * resulting denominator is larger than max_den, return def.
    */
  def av_gcd_q(a: AVRational, b: AVRational, max_den: CInt, `def`: AVRational)(
      using Zone
  ): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](4)
    !(__ptr_0 + 0) = a
    !(__ptr_0 + 1) = b
    !(__ptr_0 + 2) = `def`
    __sn_wrap_ffmpeg_av_gcd_q(
      (__ptr_0 + 0),
      (__ptr_0 + 1),
      max_den,
      (__ptr_0 + 2),
      (__ptr_0 + 3)
    )
    !(__ptr_0 + 3)
  end av_gcd_q

  /** Return the fractional representation of the internal time base.
    */
  def av_get_time_base_q()(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_get_time_base_q((__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Return the fractional representation of the internal time base.
    */
  def av_get_time_base_q()(__return: Ptr[AVRational]): Unit =
    __sn_wrap_ffmpeg_av_get_time_base_q(__return)

  /** Guess the frame rate, based on both the container and codec information.
    */
  def av_guess_frame_rate(
      ctx: Ptr[AVFormatContext],
      stream: Ptr[AVStream],
      frame: Ptr[AVFrame]
  )(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_guess_frame_rate(ctx, stream, frame, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Guess the frame rate, based on both the container and codec information.
    */
  def av_guess_frame_rate(
      ctx: Ptr[AVFormatContext],
      stream: Ptr[AVStream],
      frame: Ptr[AVFrame]
  )(__return: Ptr[AVRational]): Unit =
    __sn_wrap_ffmpeg_av_guess_frame_rate(ctx, stream, frame, __return)

  /** Guess the sample aspect ratio of a frame, based on both the stream and the
    * frame aspect ratio.
    */
  def av_guess_sample_aspect_ratio(
      format: Ptr[AVFormatContext],
      stream: Ptr[AVStream],
      frame: Ptr[AVFrame]
  )(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_guess_sample_aspect_ratio(
      format,
      stream,
      frame,
      (__ptr_0 + 0)
    )
    !(__ptr_0 + 0)
  end av_guess_sample_aspect_ratio

  /** Guess the sample aspect ratio of a frame, based on both the stream and the
    * frame aspect ratio.
    */
  def av_guess_sample_aspect_ratio(
      format: Ptr[AVFormatContext],
      stream: Ptr[AVStream],
      frame: Ptr[AVFrame]
  )(__return: Ptr[AVRational]): Unit =
    __sn_wrap_ffmpeg_av_guess_sample_aspect_ratio(
      format,
      stream,
      frame,
      __return
    )

  /** Invert a rational.
    */
  def av_inv_q(q: Ptr[AVRational])(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_inv_q(q, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Invert a rational.
    */
  def av_inv_q(q: Ptr[AVRational])(__return: Ptr[AVRational]): Unit =
    __sn_wrap_ffmpeg_av_inv_q(q, __return)

  /** Invert a rational.
    */
  def av_inv_q(q: AVRational)(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](2)
    !(__ptr_0 + 0) = q
    __sn_wrap_ffmpeg_av_inv_q((__ptr_0 + 0), (__ptr_0 + 1))
    !(__ptr_0 + 1)

  /** Create an AVRational.
    */
  def av_make_q(num: CInt, den: CInt)(__return: Ptr[AVRational]): Unit =
    __sn_wrap_ffmpeg_av_make_q(num, den, __return)

  /** Create an AVRational.
    */
  def av_make_q(num: CInt, den: CInt)(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_make_q(num, den, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Multiply two rationals.
    */
  def av_mul_q(b: Ptr[AVRational], c: Ptr[AVRational])(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_mul_q(b, c, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Multiply two rationals.
    */
  def av_mul_q(b: Ptr[AVRational], c: Ptr[AVRational])(
      __return: Ptr[AVRational]
  ): Unit =
    __sn_wrap_ffmpeg_av_mul_q(b, c, __return)

  /** Multiply two rationals.
    */
  def av_mul_q(b: AVRational, c: AVRational)(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](3)
    !(__ptr_0 + 0) = b
    !(__ptr_0 + 1) = c
    __sn_wrap_ffmpeg_av_mul_q((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
    !(__ptr_0 + 2)

  /** Find which of the two rationals is closer to another rational.
    */
  def av_nearer_q(q: AVRational, q1: AVRational, q2: AVRational)(using
      Zone
  ): CInt =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](3)
    !(__ptr_0 + 0) = q
    !(__ptr_0 + 1) = q1
    !(__ptr_0 + 2) = q2
    __sn_wrap_ffmpeg_av_nearer_q((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))

  /** Find which of the two rationals is closer to another rational.
    */
  def av_nearer_q(
      q: Ptr[AVRational],
      q1: Ptr[AVRational],
      q2: Ptr[AVRational]
  ): CInt =
    __sn_wrap_ffmpeg_av_nearer_q(q, q1, q2)

  /** Convert valid timing fields (timestamps / durations) in a packet from one
    * timebase to another. Timestamps with unknown values (AV_NOPTS_VALUE) will
    * be ignored.
    */
  def av_packet_rescale_ts(
      pkt: Ptr[AVPacket],
      tb_src: Ptr[AVRational],
      tb_dst: Ptr[AVRational]
  ): Unit =
    __sn_wrap_ffmpeg_av_packet_rescale_ts(pkt, tb_src, tb_dst)

  /** Convert valid timing fields (timestamps / durations) in a packet from one
    * timebase to another. Timestamps with unknown values (AV_NOPTS_VALUE) will
    * be ignored.
    */
  def av_packet_rescale_ts(
      pkt: Ptr[AVPacket],
      tb_src: AVRational,
      tb_dst: AVRational
  )(using Zone): Unit =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](2)
    !(__ptr_0 + 0) = tb_src
    !(__ptr_0 + 1) = tb_dst
    __sn_wrap_ffmpeg_av_packet_rescale_ts(pkt, (__ptr_0 + 0), (__ptr_0 + 1))
  end av_packet_rescale_ts

  /** Convert an AVRational to a `double`.
    */
  def av_q2d(a: AVRational)(using Zone): Double =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    !(__ptr_0 + 0) = a
    __sn_wrap_ffmpeg_av_q2d((__ptr_0 + 0))

  /** Convert an AVRational to a `double`.
    */
  def av_q2d(a: Ptr[AVRational]): Double =
    __sn_wrap_ffmpeg_av_q2d(a)

  /** Convert an AVRational to a IEEE 32-bit `float` expressed in fixed-point
    * format.
    */
  def av_q2intfloat(q: AVRational)(using Zone): uint32_t =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    !(__ptr_0 + 0) = q
    __sn_wrap_ffmpeg_av_q2intfloat((__ptr_0 + 0))

  /** Convert an AVRational to a IEEE 32-bit `float` expressed in fixed-point
    * format.
    */
  def av_q2intfloat(q: Ptr[AVRational]): uint32_t =
    __sn_wrap_ffmpeg_av_q2intfloat(q)

  /** Rescale a timestamp while preserving known durations.
    */
  def av_rescale_delta(
      in_tb: Ptr[AVRational],
      in_ts: int64_t,
      fs_tb: Ptr[AVRational],
      duration: CInt,
      last: Ptr[int64_t],
      out_tb: Ptr[AVRational]
  ): int64_t =
    __sn_wrap_ffmpeg_av_rescale_delta(
      in_tb,
      in_ts,
      fs_tb,
      duration,
      last,
      out_tb
    )

  /** Rescale a timestamp while preserving known durations.
    */
  def av_rescale_delta(
      in_tb: AVRational,
      in_ts: int64_t,
      fs_tb: AVRational,
      duration: CInt,
      last: Ptr[int64_t],
      out_tb: AVRational
  )(using Zone): int64_t =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](3)
    !(__ptr_0 + 0) = in_tb
    !(__ptr_0 + 1) = fs_tb
    !(__ptr_0 + 2) = out_tb
    __sn_wrap_ffmpeg_av_rescale_delta(
      (__ptr_0 + 0),
      in_ts,
      (__ptr_0 + 1),
      duration,
      last,
      (__ptr_0 + 2)
    )
  end av_rescale_delta

  /** Rescale a 64-bit integer by 2 rational numbers.
    */
  def av_rescale_q(a: int64_t, bq: AVRational, cq: AVRational)(using
      Zone
  ): int64_t =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](2)
    !(__ptr_0 + 0) = bq
    !(__ptr_0 + 1) = cq
    __sn_wrap_ffmpeg_av_rescale_q(a, (__ptr_0 + 0), (__ptr_0 + 1))

  /** Rescale a 64-bit integer by 2 rational numbers.
    */
  def av_rescale_q(
      a: int64_t,
      bq: Ptr[AVRational],
      cq: Ptr[AVRational]
  ): int64_t =
    __sn_wrap_ffmpeg_av_rescale_q(a, bq, cq)

  /** Rescale a 64-bit integer by 2 rational numbers with specified rounding.
    */
  def av_rescale_q_rnd(
      a: int64_t,
      bq: AVRational,
      cq: AVRational,
      rnd: AVRounding
  )(using Zone): int64_t =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](2)
    !(__ptr_0 + 0) = bq
    !(__ptr_0 + 1) = cq
    __sn_wrap_ffmpeg_av_rescale_q_rnd(a, (__ptr_0 + 0), (__ptr_0 + 1), rnd)
  end av_rescale_q_rnd

  /** Rescale a 64-bit integer by 2 rational numbers with specified rounding.
    */
  def av_rescale_q_rnd(
      a: int64_t,
      bq: Ptr[AVRational],
      cq: Ptr[AVRational],
      rnd: AVRounding
  ): int64_t =
    __sn_wrap_ffmpeg_av_rescale_q_rnd(a, bq, cq, rnd)

  def av_stream_get_codec_timebase(st: Ptr[AVStream])(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_stream_get_codec_timebase(st, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def av_stream_get_codec_timebase(st: Ptr[AVStream])(
      __return: Ptr[AVRational]
  ): Unit =
    __sn_wrap_ffmpeg_av_stream_get_codec_timebase(st, __return)

  /** Subtract one rational from another.
    */
  def av_sub_q(b: Ptr[AVRational], c: Ptr[AVRational])(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](1)
    __sn_wrap_ffmpeg_av_sub_q(b, c, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  /** Subtract one rational from another.
    */
  def av_sub_q(b: Ptr[AVRational], c: Ptr[AVRational])(
      __return: Ptr[AVRational]
  ): Unit =
    __sn_wrap_ffmpeg_av_sub_q(b, c, __return)

  /** Subtract one rational from another.
    */
  def av_sub_q(b: AVRational, c: AVRational)(using Zone): AVRational =
    val __ptr_0: Ptr[AVRational] =
      _root_.scala.scalanative.unsafe.alloc[AVRational](3)
    !(__ptr_0 + 0) = b
    !(__ptr_0 + 1) = c
    __sn_wrap_ffmpeg_av_sub_q((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
    !(__ptr_0 + 2)
end functions

object constants:
  val AV_FRAME_CROP_UNALIGNED: CUnsignedInt = 1.toUInt

  val AV_HWFRAME_MAP_READ: CUnsignedInt = 1.toUInt
  val AV_HWFRAME_MAP_WRITE: CUnsignedInt = 2.toUInt
  val AV_HWFRAME_MAP_OVERWRITE: CUnsignedInt = 4.toUInt
  val AV_HWFRAME_MAP_DIRECT: CUnsignedInt = 8.toUInt

  val AV_CODEC_HW_CONFIG_METHOD_HW_DEVICE_CTX: CUnsignedInt = 1.toUInt
  val AV_CODEC_HW_CONFIG_METHOD_HW_FRAMES_CTX: CUnsignedInt = 2.toUInt
  val AV_CODEC_HW_CONFIG_METHOD_INTERNAL: CUnsignedInt = 4.toUInt
  val AV_CODEC_HW_CONFIG_METHOD_AD_HOC: CUnsignedInt = 8.toUInt
end constants

object types:
  export _root_.ffmpeg.structs.*
  export _root_.ffmpeg.aliases.*
  export _root_.ffmpeg.unions.*
  export _root_.ffmpeg.enumerations.*

object all:
  export _root_.ffmpeg.enumerations.AVActiveFormatDescription
  export _root_.ffmpeg.enumerations.AVAudioServiceType
  export _root_.ffmpeg.enumerations.AVChannel
  export _root_.ffmpeg.enumerations.AVChannelOrder
  export _root_.ffmpeg.enumerations.AVChromaLocation
  export _root_.ffmpeg.enumerations.AVClassCategory
  export _root_.ffmpeg.enumerations.AVCodecConfig
  export _root_.ffmpeg.enumerations.AVCodecID
  export _root_.ffmpeg.enumerations.AVColorPrimaries
  export _root_.ffmpeg.enumerations.AVColorRange
  export _root_.ffmpeg.enumerations.AVColorSpace
  export _root_.ffmpeg.enumerations.AVColorTransferCharacteristic
  export _root_.ffmpeg.enumerations.AVDiscard
  export _root_.ffmpeg.enumerations.AVDurationEstimationMethod
  export _root_.ffmpeg.enumerations.AVFieldOrder
  export _root_.ffmpeg.enumerations.AVFrameSideDataType
  export _root_.ffmpeg.enumerations.AVHWDeviceType
  export _root_.ffmpeg.enumerations.AVHWFrameTransferDirection
  export _root_.ffmpeg.enumerations.AVIODataMarkerType
  export _root_.ffmpeg.enumerations.AVIODirEntryType
  export _root_.ffmpeg.enumerations.AVMatrixEncoding
  export _root_.ffmpeg.enumerations.AVMediaType
  export _root_.ffmpeg.enumerations.AVPacketSideDataType
  export _root_.ffmpeg.enumerations.AVPictureStructure
  export _root_.ffmpeg.enumerations.AVPictureType
  export _root_.ffmpeg.enumerations.AVPixelFormat
  export _root_.ffmpeg.enumerations.AVRounding
  export _root_.ffmpeg.enumerations.AVSampleFormat
  export _root_.ffmpeg.enumerations.AVSideDataParamChangeFlags
  export _root_.ffmpeg.enumerations.AVSideDataProps
  export _root_.ffmpeg.enumerations.AVStreamGroupParamsType
  export _root_.ffmpeg.enumerations.AVStreamParseType
  export _root_.ffmpeg.enumerations.AVSubtitleType
  export _root_.ffmpeg.enumerations.AVTimebaseSource
  export _root_.ffmpeg.aliases.AVOpenCallback
  export _root_.ffmpeg.aliases.FILE
  export _root_.ffmpeg.aliases.av_format_control_message
  export _root_.ffmpeg.aliases.int16_t
  export _root_.ffmpeg.aliases.int32_t
  export _root_.ffmpeg.aliases.int64_t
  export _root_.ffmpeg.aliases.int8_t
  export _root_.ffmpeg.aliases.size_t
  export _root_.ffmpeg.aliases.uint16_t
  export _root_.ffmpeg.aliases.uint32_t
  export _root_.ffmpeg.aliases.uint64_t
  export _root_.ffmpeg.aliases.uint8_t
  export _root_.ffmpeg.aliases.va_list
  export _root_.ffmpeg.structs.AVBPrint
  export _root_.ffmpeg.structs.AVBuffer
  export _root_.ffmpeg.structs.AVBufferPool
  export _root_.ffmpeg.structs.AVBufferRef
  export _root_.ffmpeg.structs.AVCPBProperties
  export _root_.ffmpeg.structs.AVChannelCustom
  export _root_.ffmpeg.structs.AVChannelLayout
  export _root_.ffmpeg.structs.AVChapter
  export _root_.ffmpeg.structs.AVClass
  export _root_.ffmpeg.structs.AVCodec
  export _root_.ffmpeg.structs.AVCodecContext
  export _root_.ffmpeg.structs.AVCodecDescriptor
  export _root_.ffmpeg.structs.AVCodecHWConfig
  export _root_.ffmpeg.structs.AVCodecInternal
  export _root_.ffmpeg.structs.AVCodecParameters
  export _root_.ffmpeg.structs.AVCodecParser
  export _root_.ffmpeg.structs.AVCodecParserContext
  export _root_.ffmpeg.structs.AVCodecTag
  export _root_.ffmpeg.structs.AVDictionary
  export _root_.ffmpeg.structs.AVDictionaryEntry
  export _root_.ffmpeg.structs.AVFormatContext
  export _root_.ffmpeg.structs.AVFrame
  export _root_.ffmpeg.structs.AVFrameSideData
  export _root_.ffmpeg.structs.AVHWAccel
  export _root_.ffmpeg.structs.AVHWDeviceContext
  export _root_.ffmpeg.structs.AVHWFramesConstraints
  export _root_.ffmpeg.structs.AVHWFramesContext
  export _root_.ffmpeg.structs.AVIAMFAudioElement
  export _root_.ffmpeg.structs.AVIAMFMixPresentation
  export _root_.ffmpeg.structs.AVIOContext
  export _root_.ffmpeg.structs.AVIODirContext
  export _root_.ffmpeg.structs.AVIODirEntry
  export _root_.ffmpeg.structs.AVIOInterruptCB
  export _root_.ffmpeg.structs.AVIndexEntry
  export _root_.ffmpeg.structs.AVInputFormat
  export _root_.ffmpeg.structs.AVOption
  export _root_.ffmpeg.structs.AVOptionRanges
  export _root_.ffmpeg.structs.AVOutputFormat
  export _root_.ffmpeg.structs.AVPacket
  export _root_.ffmpeg.structs.AVPacketList
  export _root_.ffmpeg.structs.AVPacketSideData
  export _root_.ffmpeg.structs.AVPanScan
  export _root_.ffmpeg.structs.AVProbeData
  export _root_.ffmpeg.structs.AVProducerReferenceTime
  export _root_.ffmpeg.structs.AVProfile
  export _root_.ffmpeg.structs.AVProgram
  export _root_.ffmpeg.structs.AVRational
  export _root_.ffmpeg.structs.AVRegionOfInterest
  export _root_.ffmpeg.structs.AVSideDataDescriptor
  export _root_.ffmpeg.structs.AVStream
  export _root_.ffmpeg.structs.AVStreamGroup
  export _root_.ffmpeg.structs.AVStreamGroupLCEVC
  export _root_.ffmpeg.structs.AVStreamGroupTileGrid
  export _root_.ffmpeg.structs.AVSubtitle
  export _root_.ffmpeg.structs.AVSubtitleRect
  export _root_.ffmpeg.structs.RcOverride
  export _root_.ffmpeg.unions.av_intfloat32
  export _root_.ffmpeg.unions.av_intfloat64
  export _root_.ffmpeg.functions.av_add_index_entry
  export _root_.ffmpeg.functions.av_append_packet
  export _root_.ffmpeg.functions.av_bessel_i0
  export _root_.ffmpeg.functions.av_buffer_alloc
  export _root_.ffmpeg.functions.av_buffer_allocz
  export _root_.ffmpeg.functions.av_buffer_create
  export _root_.ffmpeg.functions.av_buffer_default_free
  export _root_.ffmpeg.functions.av_buffer_get_opaque
  export _root_.ffmpeg.functions.av_buffer_get_ref_count
  export _root_.ffmpeg.functions.av_buffer_is_writable
  export _root_.ffmpeg.functions.av_buffer_make_writable
  export _root_.ffmpeg.functions.av_buffer_pool_buffer_get_opaque
  export _root_.ffmpeg.functions.av_buffer_pool_get
  export _root_.ffmpeg.functions.av_buffer_pool_init
  export _root_.ffmpeg.functions.av_buffer_pool_init2
  export _root_.ffmpeg.functions.av_buffer_pool_uninit
  export _root_.ffmpeg.functions.av_buffer_realloc
  export _root_.ffmpeg.functions.av_buffer_ref
  export _root_.ffmpeg.functions.av_buffer_replace
  export _root_.ffmpeg.functions.av_buffer_unref
  export _root_.ffmpeg.functions.av_calloc
  export _root_.ffmpeg.functions.av_ceil_log2_c
  export _root_.ffmpeg.functions.av_channel_description
  export _root_.ffmpeg.functions.av_channel_description_bprint
  export _root_.ffmpeg.functions.av_channel_from_string
  export _root_.ffmpeg.functions.av_channel_layout_ambisonic_order
  export _root_.ffmpeg.functions.av_channel_layout_channel_from_index
  export _root_.ffmpeg.functions.av_channel_layout_channel_from_string
  export _root_.ffmpeg.functions.av_channel_layout_check
  export _root_.ffmpeg.functions.av_channel_layout_compare
  export _root_.ffmpeg.functions.av_channel_layout_copy
  export _root_.ffmpeg.functions.av_channel_layout_custom_init
  export _root_.ffmpeg.functions.av_channel_layout_default
  export _root_.ffmpeg.functions.av_channel_layout_describe
  export _root_.ffmpeg.functions.av_channel_layout_describe_bprint
  export _root_.ffmpeg.functions.av_channel_layout_from_mask
  export _root_.ffmpeg.functions.av_channel_layout_from_string
  export _root_.ffmpeg.functions.av_channel_layout_index_from_channel
  export _root_.ffmpeg.functions.av_channel_layout_index_from_string
  export _root_.ffmpeg.functions.av_channel_layout_retype
  export _root_.ffmpeg.functions.av_channel_layout_standard
  export _root_.ffmpeg.functions.av_channel_layout_subset
  export _root_.ffmpeg.functions.av_channel_layout_uninit
  export _root_.ffmpeg.functions.av_channel_name
  export _root_.ffmpeg.functions.av_channel_name_bprint
  export _root_.ffmpeg.functions.av_clip64_c
  export _root_.ffmpeg.functions.av_clip_c
  export _root_.ffmpeg.functions.av_clip_int16_c
  export _root_.ffmpeg.functions.av_clip_int8_c
  export _root_.ffmpeg.functions.av_clip_intp2_c
  export _root_.ffmpeg.functions.av_clip_uint16_c
  export _root_.ffmpeg.functions.av_clip_uint8_c
  export _root_.ffmpeg.functions.av_clip_uintp2_c
  export _root_.ffmpeg.functions.av_clipd_c
  export _root_.ffmpeg.functions.av_clipf_c
  export _root_.ffmpeg.functions.av_clipl_int32_c
  export _root_.ffmpeg.functions.av_codec_get_id
  export _root_.ffmpeg.functions.av_codec_get_tag
  export _root_.ffmpeg.functions.av_codec_get_tag2
  export _root_.ffmpeg.functions.av_codec_is_decoder
  export _root_.ffmpeg.functions.av_codec_is_encoder
  export _root_.ffmpeg.functions.av_codec_iterate
  export _root_.ffmpeg.functions.av_compare_mod
  export _root_.ffmpeg.functions.av_cpb_properties_alloc
  export _root_.ffmpeg.functions.av_default_get_category
  export _root_.ffmpeg.functions.av_default_item_name
  export _root_.ffmpeg.functions.av_demuxer_iterate
  export _root_.ffmpeg.functions.av_dict_copy
  export _root_.ffmpeg.functions.av_dict_count
  export _root_.ffmpeg.functions.av_dict_free
  export _root_.ffmpeg.functions.av_dict_get
  export _root_.ffmpeg.functions.av_dict_get_string
  export _root_.ffmpeg.functions.av_dict_iterate
  export _root_.ffmpeg.functions.av_dict_parse_string
  export _root_.ffmpeg.functions.av_dict_set
  export _root_.ffmpeg.functions.av_dict_set_int
  export _root_.ffmpeg.functions.av_disposition_from_string
  export _root_.ffmpeg.functions.av_disposition_to_string
  export _root_.ffmpeg.functions.av_double2int
  export _root_.ffmpeg.functions.av_dump_format
  export _root_.ffmpeg.functions.av_dynarray2_add
  export _root_.ffmpeg.functions.av_dynarray_add
  export _root_.ffmpeg.functions.av_dynarray_add_nofree
  export _root_.ffmpeg.functions.av_fast_malloc
  export _root_.ffmpeg.functions.av_fast_mallocz
  export _root_.ffmpeg.functions.av_fast_padded_malloc
  export _root_.ffmpeg.functions.av_fast_padded_mallocz
  export _root_.ffmpeg.functions.av_fast_realloc
  export _root_.ffmpeg.functions.av_filename_number_test
  export _root_.ffmpeg.functions.av_find_best_stream
  export _root_.ffmpeg.functions.av_find_default_stream_index
  export _root_.ffmpeg.functions.av_find_input_format
  export _root_.ffmpeg.functions.av_find_program_from_stream
  export _root_.ffmpeg.functions.av_float2int
  export _root_.ffmpeg.functions.av_fmt_ctx_get_duration_estimation_method
  export _root_.ffmpeg.functions.av_format_inject_global_side_data
  export _root_.ffmpeg.functions.av_fourcc_make_string
  export _root_.ffmpeg.functions.av_frame_alloc
  export _root_.ffmpeg.functions.av_frame_apply_cropping
  export _root_.ffmpeg.functions.av_frame_clone
  export _root_.ffmpeg.functions.av_frame_copy
  export _root_.ffmpeg.functions.av_frame_copy_props
  export _root_.ffmpeg.functions.av_frame_free
  export _root_.ffmpeg.functions.av_frame_get_buffer
  export _root_.ffmpeg.functions.av_frame_get_plane_buffer
  export _root_.ffmpeg.functions.av_frame_get_side_data
  export _root_.ffmpeg.functions.av_frame_is_writable
  export _root_.ffmpeg.functions.av_frame_make_writable
  export _root_.ffmpeg.functions.av_frame_move_ref
  export _root_.ffmpeg.functions.av_frame_new_side_data
  export _root_.ffmpeg.functions.av_frame_new_side_data_from_buf
  export _root_.ffmpeg.functions.av_frame_ref
  export _root_.ffmpeg.functions.av_frame_remove_side_data
  export _root_.ffmpeg.functions.av_frame_replace
  export _root_.ffmpeg.functions.av_frame_side_data_add
  export _root_.ffmpeg.functions.av_frame_side_data_clone
  export _root_.ffmpeg.functions.av_frame_side_data_desc
  export _root_.ffmpeg.functions.av_frame_side_data_free
  export _root_.ffmpeg.functions.av_frame_side_data_get
  export _root_.ffmpeg.functions.av_frame_side_data_get_c
  export _root_.ffmpeg.functions.av_frame_side_data_name
  export _root_.ffmpeg.functions.av_frame_side_data_new
  export _root_.ffmpeg.functions.av_frame_side_data_remove
  export _root_.ffmpeg.functions.av_frame_unref
  export _root_.ffmpeg.functions.av_free
  export _root_.ffmpeg.functions.av_freep
  export _root_.ffmpeg.functions.av_gcd
  export _root_.ffmpeg.functions.av_get_alt_sample_fmt
  export _root_.ffmpeg.functions.av_get_audio_frame_duration
  export _root_.ffmpeg.functions.av_get_audio_frame_duration2
  export _root_.ffmpeg.functions.av_get_bits_per_sample
  export _root_.ffmpeg.functions.av_get_bytes_per_sample
  export _root_.ffmpeg.functions.av_get_exact_bits_per_sample
  export _root_.ffmpeg.functions.av_get_frame_filename
  export _root_.ffmpeg.functions.av_get_frame_filename2
  export _root_.ffmpeg.functions.av_get_media_type_string
  export _root_.ffmpeg.functions.av_get_output_timestamp
  export _root_.ffmpeg.functions.av_get_packed_sample_fmt
  export _root_.ffmpeg.functions.av_get_packet
  export _root_.ffmpeg.functions.av_get_pcm_codec
  export _root_.ffmpeg.functions.av_get_picture_type_char
  export _root_.ffmpeg.functions.av_get_planar_sample_fmt
  export _root_.ffmpeg.functions.av_get_profile_name
  export _root_.ffmpeg.functions.av_get_sample_fmt
  export _root_.ffmpeg.functions.av_get_sample_fmt_name
  export _root_.ffmpeg.functions.av_get_sample_fmt_string
  export _root_.ffmpeg.functions.av_grow_packet
  export _root_.ffmpeg.functions.av_guess_codec
  export _root_.ffmpeg.functions.av_guess_format
  export _root_.ffmpeg.functions.av_hex_dump
  export _root_.ffmpeg.functions.av_hex_dump_log
  export _root_.ffmpeg.functions.av_hwdevice_ctx_alloc
  export _root_.ffmpeg.functions.av_hwdevice_ctx_create
  export _root_.ffmpeg.functions.av_hwdevice_ctx_create_derived
  export _root_.ffmpeg.functions.av_hwdevice_ctx_create_derived_opts
  export _root_.ffmpeg.functions.av_hwdevice_ctx_init
  export _root_.ffmpeg.functions.av_hwdevice_find_type_by_name
  export _root_.ffmpeg.functions.av_hwdevice_get_hwframe_constraints
  export _root_.ffmpeg.functions.av_hwdevice_get_type_name
  export _root_.ffmpeg.functions.av_hwdevice_hwconfig_alloc
  export _root_.ffmpeg.functions.av_hwdevice_iterate_types
  export _root_.ffmpeg.functions.av_hwframe_constraints_free
  export _root_.ffmpeg.functions.av_hwframe_ctx_alloc
  export _root_.ffmpeg.functions.av_hwframe_ctx_create_derived
  export _root_.ffmpeg.functions.av_hwframe_ctx_init
  export _root_.ffmpeg.functions.av_hwframe_get_buffer
  export _root_.ffmpeg.functions.av_hwframe_map
  export _root_.ffmpeg.functions.av_hwframe_transfer_data
  export _root_.ffmpeg.functions.av_hwframe_transfer_get_formats
  export _root_.ffmpeg.functions.av_index_search_timestamp
  export _root_.ffmpeg.functions.av_init_packet
  export _root_.ffmpeg.functions.av_int2double
  export _root_.ffmpeg.functions.av_int2float
  export _root_.ffmpeg.functions.av_int_list_length_for_size
  export _root_.ffmpeg.functions.av_interleaved_write_frame
  export _root_.ffmpeg.functions.av_interleaved_write_uncoded_frame
  export _root_.ffmpeg.functions.av_log
  export _root_.ffmpeg.functions.av_log2
  export _root_.ffmpeg.functions.av_log2_16bit
  export _root_.ffmpeg.functions.av_log_default_callback
  export _root_.ffmpeg.functions.av_log_format_line
  export _root_.ffmpeg.functions.av_log_format_line2
  export _root_.ffmpeg.functions.av_log_get_flags
  export _root_.ffmpeg.functions.av_log_get_level
  export _root_.ffmpeg.functions.av_log_once
  export _root_.ffmpeg.functions.av_log_set_callback
  export _root_.ffmpeg.functions.av_log_set_flags
  export _root_.ffmpeg.functions.av_log_set_level
  export _root_.ffmpeg.functions.av_make_error_string
  export _root_.ffmpeg.functions.av_malloc
  export _root_.ffmpeg.functions.av_malloc_array
  export _root_.ffmpeg.functions.av_mallocz
  export _root_.ffmpeg.functions.av_match_ext
  export _root_.ffmpeg.functions.av_max_alloc
  export _root_.ffmpeg.functions.av_memcpy_backptr
  export _root_.ffmpeg.functions.av_memdup
  export _root_.ffmpeg.functions.av_mod_uintp2_c
  export _root_.ffmpeg.functions.av_muxer_iterate
  export _root_.ffmpeg.functions.av_new_packet
  export _root_.ffmpeg.functions.av_new_program
  export _root_.ffmpeg.functions.av_packet_add_side_data
  export _root_.ffmpeg.functions.av_packet_alloc
  export _root_.ffmpeg.functions.av_packet_clone
  export _root_.ffmpeg.functions.av_packet_copy_props
  export _root_.ffmpeg.functions.av_packet_free
  export _root_.ffmpeg.functions.av_packet_free_side_data
  export _root_.ffmpeg.functions.av_packet_from_data
  export _root_.ffmpeg.functions.av_packet_get_side_data
  export _root_.ffmpeg.functions.av_packet_make_refcounted
  export _root_.ffmpeg.functions.av_packet_make_writable
  export _root_.ffmpeg.functions.av_packet_move_ref
  export _root_.ffmpeg.functions.av_packet_new_side_data
  export _root_.ffmpeg.functions.av_packet_pack_dictionary
  export _root_.ffmpeg.functions.av_packet_ref
  export _root_.ffmpeg.functions.av_packet_shrink_side_data
  export _root_.ffmpeg.functions.av_packet_side_data_add
  export _root_.ffmpeg.functions.av_packet_side_data_free
  export _root_.ffmpeg.functions.av_packet_side_data_get
  export _root_.ffmpeg.functions.av_packet_side_data_name
  export _root_.ffmpeg.functions.av_packet_side_data_new
  export _root_.ffmpeg.functions.av_packet_side_data_remove
  export _root_.ffmpeg.functions.av_packet_unpack_dictionary
  export _root_.ffmpeg.functions.av_packet_unref
  export _root_.ffmpeg.functions.av_parity_c
  export _root_.ffmpeg.functions.av_parser_close
  export _root_.ffmpeg.functions.av_parser_init
  export _root_.ffmpeg.functions.av_parser_iterate
  export _root_.ffmpeg.functions.av_parser_parse2
  export _root_.ffmpeg.functions.av_pkt_dump2
  export _root_.ffmpeg.functions.av_pkt_dump_log2
  export _root_.ffmpeg.functions.av_popcount64_c
  export _root_.ffmpeg.functions.av_popcount_c
  export _root_.ffmpeg.functions.av_probe_input_buffer
  export _root_.ffmpeg.functions.av_probe_input_buffer2
  export _root_.ffmpeg.functions.av_probe_input_format
  export _root_.ffmpeg.functions.av_probe_input_format2
  export _root_.ffmpeg.functions.av_probe_input_format3
  export _root_.ffmpeg.functions.av_program_add_stream_index
  export _root_.ffmpeg.functions.av_read_frame
  export _root_.ffmpeg.functions.av_read_pause
  export _root_.ffmpeg.functions.av_read_play
  export _root_.ffmpeg.functions.av_realloc
  export _root_.ffmpeg.functions.av_realloc_array
  export _root_.ffmpeg.functions.av_realloc_f
  export _root_.ffmpeg.functions.av_reallocp
  export _root_.ffmpeg.functions.av_reallocp_array
  export _root_.ffmpeg.functions.av_reduce
  export _root_.ffmpeg.functions.av_rescale
  export _root_.ffmpeg.functions.av_rescale_rnd
  export _root_.ffmpeg.functions.av_sample_fmt_is_planar
  export _root_.ffmpeg.functions.av_samples_alloc
  export _root_.ffmpeg.functions.av_samples_alloc_array_and_samples
  export _root_.ffmpeg.functions.av_samples_copy
  export _root_.ffmpeg.functions.av_samples_fill_arrays
  export _root_.ffmpeg.functions.av_samples_get_buffer_size
  export _root_.ffmpeg.functions.av_samples_set_silence
  export _root_.ffmpeg.functions.av_sat_add32_c
  export _root_.ffmpeg.functions.av_sat_add64_c
  export _root_.ffmpeg.functions.av_sat_dadd32_c
  export _root_.ffmpeg.functions.av_sat_dsub32_c
  export _root_.ffmpeg.functions.av_sat_sub32_c
  export _root_.ffmpeg.functions.av_sat_sub64_c
  export _root_.ffmpeg.functions.av_sdp_create
  export _root_.ffmpeg.functions.av_seek_frame
  export _root_.ffmpeg.functions.av_shrink_packet
  export _root_.ffmpeg.functions.av_size_mult
  export _root_.ffmpeg.functions.av_strdup
  export _root_.ffmpeg.functions.av_stream_add_side_data
  export _root_.ffmpeg.functions.av_stream_get_class
  export _root_.ffmpeg.functions.av_stream_get_first_dts
  export _root_.ffmpeg.functions.av_stream_get_parser
  export _root_.ffmpeg.functions.av_stream_get_side_data
  export _root_.ffmpeg.functions.av_stream_group_get_class
  export _root_.ffmpeg.functions.av_stream_new_side_data
  export _root_.ffmpeg.functions.av_strerror
  export _root_.ffmpeg.functions.av_strndup
  export _root_.ffmpeg.functions.av_url_split
  export _root_.ffmpeg.functions.av_version_info
  export _root_.ffmpeg.functions.av_vlog
  export _root_.ffmpeg.functions.av_write_frame
  export _root_.ffmpeg.functions.av_write_trailer
  export _root_.ffmpeg.functions.av_write_uncoded_frame
  export _root_.ffmpeg.functions.av_write_uncoded_frame_query
  export _root_.ffmpeg.functions.av_x_if_null
  export _root_.ffmpeg.functions.av_xiphlacing
  export _root_.ffmpeg.functions.av_zero_extend_c
  export _root_.ffmpeg.functions.avcodec_align_dimensions
  export _root_.ffmpeg.functions.avcodec_align_dimensions2
  export _root_.ffmpeg.functions.avcodec_alloc_context3
  export _root_.ffmpeg.functions.avcodec_close
  export _root_.ffmpeg.functions.avcodec_configuration
  export _root_.ffmpeg.functions.avcodec_decode_subtitle2
  export _root_.ffmpeg.functions.avcodec_default_execute
  export _root_.ffmpeg.functions.avcodec_default_execute2
  export _root_.ffmpeg.functions.avcodec_default_get_buffer2
  export _root_.ffmpeg.functions.avcodec_default_get_encode_buffer
  export _root_.ffmpeg.functions.avcodec_default_get_format
  export _root_.ffmpeg.functions.avcodec_descriptor_get
  export _root_.ffmpeg.functions.avcodec_descriptor_get_by_name
  export _root_.ffmpeg.functions.avcodec_descriptor_next
  export _root_.ffmpeg.functions.avcodec_encode_subtitle
  export _root_.ffmpeg.functions.avcodec_fill_audio_frame
  export _root_.ffmpeg.functions.avcodec_find_best_pix_fmt_of_list
  export _root_.ffmpeg.functions.avcodec_find_decoder
  export _root_.ffmpeg.functions.avcodec_find_decoder_by_name
  export _root_.ffmpeg.functions.avcodec_find_encoder
  export _root_.ffmpeg.functions.avcodec_find_encoder_by_name
  export _root_.ffmpeg.functions.avcodec_flush_buffers
  export _root_.ffmpeg.functions.avcodec_free_context
  export _root_.ffmpeg.functions.avcodec_get_class
  export _root_.ffmpeg.functions.avcodec_get_hw_config
  export _root_.ffmpeg.functions.avcodec_get_hw_frames_parameters
  export _root_.ffmpeg.functions.avcodec_get_name
  export _root_.ffmpeg.functions.avcodec_get_subtitle_rect_class
  export _root_.ffmpeg.functions.avcodec_get_supported_config
  export _root_.ffmpeg.functions.avcodec_get_type
  export _root_.ffmpeg.functions.avcodec_is_open
  export _root_.ffmpeg.functions.avcodec_license
  export _root_.ffmpeg.functions.avcodec_open2
  export _root_.ffmpeg.functions.avcodec_parameters_alloc
  export _root_.ffmpeg.functions.avcodec_parameters_copy
  export _root_.ffmpeg.functions.avcodec_parameters_free
  export _root_.ffmpeg.functions.avcodec_parameters_from_context
  export _root_.ffmpeg.functions.avcodec_parameters_to_context
  export _root_.ffmpeg.functions.avcodec_pix_fmt_to_codec_tag
  export _root_.ffmpeg.functions.avcodec_profile_name
  export _root_.ffmpeg.functions.avcodec_receive_frame
  export _root_.ffmpeg.functions.avcodec_receive_packet
  export _root_.ffmpeg.functions.avcodec_send_frame
  export _root_.ffmpeg.functions.avcodec_send_packet
  export _root_.ffmpeg.functions.avcodec_string
  export _root_.ffmpeg.functions.avcodec_version
  export _root_.ffmpeg.functions.avformat_alloc_context
  export _root_.ffmpeg.functions.avformat_alloc_output_context2
  export _root_.ffmpeg.functions.avformat_close_input
  export _root_.ffmpeg.functions.avformat_configuration
  export _root_.ffmpeg.functions.avformat_find_stream_info
  export _root_.ffmpeg.functions.avformat_flush
  export _root_.ffmpeg.functions.avformat_free_context
  export _root_.ffmpeg.functions.avformat_get_class
  export _root_.ffmpeg.functions.avformat_get_mov_audio_tags
  export _root_.ffmpeg.functions.avformat_get_mov_video_tags
  export _root_.ffmpeg.functions.avformat_get_riff_audio_tags
  export _root_.ffmpeg.functions.avformat_get_riff_video_tags
  export _root_.ffmpeg.functions.avformat_index_get_entries_count
  export _root_.ffmpeg.functions.avformat_index_get_entry
  export _root_.ffmpeg.functions.avformat_index_get_entry_from_timestamp
  export _root_.ffmpeg.functions.avformat_init_output
  export _root_.ffmpeg.functions.avformat_license
  export _root_.ffmpeg.functions.avformat_match_stream_specifier
  export _root_.ffmpeg.functions.avformat_network_deinit
  export _root_.ffmpeg.functions.avformat_network_init
  export _root_.ffmpeg.functions.avformat_new_stream
  export _root_.ffmpeg.functions.avformat_open_input
  export _root_.ffmpeg.functions.avformat_query_codec
  export _root_.ffmpeg.functions.avformat_queue_attached_pictures
  export _root_.ffmpeg.functions.avformat_seek_file
  export _root_.ffmpeg.functions.avformat_stream_group_add_stream
  export _root_.ffmpeg.functions.avformat_stream_group_create
  export _root_.ffmpeg.functions.avformat_stream_group_name
  export _root_.ffmpeg.functions.avformat_transfer_internal_stream_timing_info
  export _root_.ffmpeg.functions.avformat_version
  export _root_.ffmpeg.functions.avformat_write_header
  export _root_.ffmpeg.functions.avio_accept
  export _root_.ffmpeg.functions.avio_alloc_context
  export _root_.ffmpeg.functions.avio_check
  export _root_.ffmpeg.functions.avio_close
  export _root_.ffmpeg.functions.avio_close_dir
  export _root_.ffmpeg.functions.avio_close_dyn_buf
  export _root_.ffmpeg.functions.avio_closep
  export _root_.ffmpeg.functions.avio_context_free
  export _root_.ffmpeg.functions.avio_enum_protocols
  export _root_.ffmpeg.functions.avio_feof
  export _root_.ffmpeg.functions.avio_find_protocol_name
  export _root_.ffmpeg.functions.avio_flush
  export _root_.ffmpeg.functions.avio_free_directory_entry
  export _root_.ffmpeg.functions.avio_get_dyn_buf
  export _root_.ffmpeg.functions.avio_get_str
  export _root_.ffmpeg.functions.avio_get_str16be
  export _root_.ffmpeg.functions.avio_get_str16le
  export _root_.ffmpeg.functions.avio_handshake
  export _root_.ffmpeg.functions.avio_open
  export _root_.ffmpeg.functions.avio_open2
  export _root_.ffmpeg.functions.avio_open_dir
  export _root_.ffmpeg.functions.avio_open_dyn_buf
  export _root_.ffmpeg.functions.avio_pause
  export _root_.ffmpeg.functions.avio_print_string_array
  export _root_.ffmpeg.functions.avio_printf
  export _root_.ffmpeg.functions.avio_protocol_get_class
  export _root_.ffmpeg.functions.avio_put_str
  export _root_.ffmpeg.functions.avio_put_str16be
  export _root_.ffmpeg.functions.avio_put_str16le
  export _root_.ffmpeg.functions.avio_r8
  export _root_.ffmpeg.functions.avio_rb16
  export _root_.ffmpeg.functions.avio_rb24
  export _root_.ffmpeg.functions.avio_rb32
  export _root_.ffmpeg.functions.avio_rb64
  export _root_.ffmpeg.functions.avio_read
  export _root_.ffmpeg.functions.avio_read_dir
  export _root_.ffmpeg.functions.avio_read_partial
  export _root_.ffmpeg.functions.avio_read_to_bprint
  export _root_.ffmpeg.functions.avio_rl16
  export _root_.ffmpeg.functions.avio_rl24
  export _root_.ffmpeg.functions.avio_rl32
  export _root_.ffmpeg.functions.avio_rl64
  export _root_.ffmpeg.functions.avio_seek
  export _root_.ffmpeg.functions.avio_seek_time
  export _root_.ffmpeg.functions.avio_size
  export _root_.ffmpeg.functions.avio_skip
  export _root_.ffmpeg.functions.avio_tell
  export _root_.ffmpeg.functions.avio_vprintf
  export _root_.ffmpeg.functions.avio_w8
  export _root_.ffmpeg.functions.avio_wb16
  export _root_.ffmpeg.functions.avio_wb24
  export _root_.ffmpeg.functions.avio_wb32
  export _root_.ffmpeg.functions.avio_wb64
  export _root_.ffmpeg.functions.avio_wl16
  export _root_.ffmpeg.functions.avio_wl24
  export _root_.ffmpeg.functions.avio_wl32
  export _root_.ffmpeg.functions.avio_wl64
  export _root_.ffmpeg.functions.avio_write
  export _root_.ffmpeg.functions.avio_write_marker
  export _root_.ffmpeg.functions.avsubtitle_free
  export _root_.ffmpeg.functions.avutil_configuration
  export _root_.ffmpeg.functions.avutil_license
  export _root_.ffmpeg.functions.avutil_version
  export _root_.ffmpeg.functions.av_add_q
  export _root_.ffmpeg.functions.av_add_stable
  export _root_.ffmpeg.functions.av_cmp_q
  export _root_.ffmpeg.functions.av_compare_ts
  export _root_.ffmpeg.functions.av_d2q
  export _root_.ffmpeg.functions.av_div_q
  export _root_.ffmpeg.functions.av_find_nearest_q_idx
  export _root_.ffmpeg.functions.av_gcd_q
  export _root_.ffmpeg.functions.av_get_time_base_q
  export _root_.ffmpeg.functions.av_guess_frame_rate
  export _root_.ffmpeg.functions.av_guess_sample_aspect_ratio
  export _root_.ffmpeg.functions.av_inv_q
  export _root_.ffmpeg.functions.av_make_q
  export _root_.ffmpeg.functions.av_mul_q
  export _root_.ffmpeg.functions.av_nearer_q
  export _root_.ffmpeg.functions.av_packet_rescale_ts
  export _root_.ffmpeg.functions.av_q2d
  export _root_.ffmpeg.functions.av_q2intfloat
  export _root_.ffmpeg.functions.av_rescale_delta
  export _root_.ffmpeg.functions.av_rescale_q
  export _root_.ffmpeg.functions.av_rescale_q_rnd
  export _root_.ffmpeg.functions.av_stream_get_codec_timebase
  export _root_.ffmpeg.functions.av_sub_q
end all
