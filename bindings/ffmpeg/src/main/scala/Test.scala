import ffmpeg.all.*

@main def hello =
  val pFormatContext = avformat_alloc_context()

  assert(pFormatContext != null, "could not allocate memory for formatContext")

  avformat_free_context(pFormatContext)

  // Note(Anton): I don't have it in me to write a full ffmpeg example,
  // may be someone can port https://github.com/leandromoreira/ffmpeg-libav-tutorial/blob/8263d4d83e69620fb9028354e26f22c891e6770c/0_hello_world.c
  // I'm leaving this just to be able to test linkage and running
end hello
