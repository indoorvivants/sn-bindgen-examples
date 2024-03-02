import libredis.functions.*
import libredis.types.*

import scala.scalanative.unsafe.*

@main def hello =
  val c = redisConnect(c"127.0.0.1", 6379)

  Zone:
    if c == null then throw new Exception("Failed to allocated redis context")
    else if (!c).err != 0 then
      throw new Exception(fromCString((!c).errstr.at(0)))
    else
      // The cast is actually a quirk of Redis API - it returns `void *`
      val reply = redisCommand(c, c"SET foo bar").asInstanceOf[Ptr[redisReply]]

      assert(fromCString((!reply).str) == "OK")

      println((!reply).`type`)

  redisFree(c)
end hello
