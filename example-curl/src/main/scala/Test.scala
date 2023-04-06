import curl.all.*
import curl.enumerations.CURLoption.CURLOPT_URL
import scalanative.unsafe.*
import curl.enumerations.CURLoption.CURLOPT_WRITEFUNCTION
import scala.scalanative.libc.string
import scala.scalanative.libc.stdio

@main def hello = 
  val curl = curl_easy_init();
  if(curl != null) {
    curl_easy_setopt(curl, CURLOPT_URL, c"https://httpbin.org/get");

    val write_data_callback = CFuncPtr4.fromScalaFunction {
      (ptr: Ptr[Byte], size: CSize, nmemb: CSize, userdata: Ptr[Byte]) => 
        val chunk = stackalloc[Byte](nmemb)
        string.strncpy(chunk, ptr, nmemb)
        stdio.printf(c"Chunk: %s\n", chunk)
        nmemb * size
    }

    curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, write_data_callback)
    val res = curl_easy_perform(curl)
    assert(res == CURLcode.CURLE_OK, "Expected request to succeed")
    curl_easy_cleanup(curl)
  }
