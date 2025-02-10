import librdkafka.all.*

import scalanative.unsafe.*
import scalanative.unsigned.*

@main def hello =
  val conf = rd_kafka_conf_new()
  val errstr = stackalloc[Byte](512)
  val producer =
    rd_kafka_new(rd_kafka_type_t.RD_KAFKA_PRODUCER, conf, errstr, 512.toUInt)

  val topic = "purchases"

  println(producer)
