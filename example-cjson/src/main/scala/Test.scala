import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.string.strlen
import scala.scalanative.libc.stdio

import cjson.functions.*
import cjson.types.*

@main def hello_cjson =
  val jsonStr = c"""
    {"hello": {"25": 42}, "x": [1,2,3, {"test": 1}, true]}
  """

  val json = cJSON_Parse(jsonStr)
  println(s"Raw json is ${fromCString(cJSON_PrintUnformatted(json))}")
  val helloObj = cJSON_GetObjectItem(json, c"hello")
  val hello_25 = cJSON_GetNumberValue(cJSON_GetObjectItem(helloObj, c"25"))
  val x = cJSON_GetObjectItem(json, c"x")
  println(s"Value of hello.25 is $hello_25")

  println(s"Array size is ${cJSON_GetArraySize(x)}")

  for i <- 0 until cJSON_GetArraySize(x) do
    val serialised = fromCString(
      cJSON_PrintUnformatted(cJSON_GetArrayItem(x, i))
    )
    println(s"x.[$i] is '$serialised'")
end hello_cjson
