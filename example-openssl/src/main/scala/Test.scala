import openssl.functions.*
import openssl.types.*

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.*
import java.util.Base64

@main def hello =
  Zone { implicit z =>
    println(s"SHA256(helloworld) = ${OpenSSL.sha256("helloworld")}")
    println(
      s"HMAC(helloworld, secret) = ${OpenSSL.hmac("helloworld", "secret")}"
    )
  }

@extern
object Crypto:
  def get_EVP_MAC_KEY(): CInt = extern

  def get_EVP_MAX_MD_SIZE(): CInt = extern

  def get_OpenSSL_add_all_digests(): Unit = extern

import Crypto.*

object OpenSSL:
  val SHA256_DIGEST_LENGTH = 32
  private val enc = Base64.getUrlEncoder().withoutPadding()

  def sha256(plaintext: String)(using Zone): String =
    val str = toCString(plaintext)
    val sha256_ctx = stackalloc[SHA256_CTX](1)
    val hash = stackalloc[CUnsignedChar](SHA256_DIGEST_LENGTH)
    val outputBuffer = stackalloc[CChar](65)

    assert(
      SHA256_Init(sha256_ctx) == 1,
      "failed to initialise sha context"
    )
    assert(
      SHA256_Update(sha256_ctx, str, string.strlen(str).asInstanceOf[size_t]) == 1,
      "failed to update sha context"
    )
    assert(
      SHA256_Final(hash, sha256_ctx) == 1,
      "failed to finalise sha context"
    )

    for i <- 0 until SHA256_DIGEST_LENGTH do
      stdio.sprintf(outputBuffer + (i * 2), c"%02x", hash(i))
    outputBuffer(64) = 0.toByte

    fromCString(outputBuffer)
  end sha256

  def hmac(plaintext: String, key: String)(using Zone) =
    val message = toCString(plaintext)
    val ckey = toCString(key)
    val mdctx = EVP_MD_CTX_new()
    val pkey = EVP_PKEY_new_mac_key(
      Crypto.get_EVP_MAC_KEY(),
      null,
      ckey.asInstanceOf[Ptr[CUnsignedChar]],
      string.strlen(ckey).toInt
    )

    assert(pkey != null, "EVP PKEY is null")
    assert(mdctx != null, "EVP ctx is null")

    val md_len = stackalloc[size_t](1)

    assert(EVP_DigestSignInit(mdctx, null, EVP_sha256(), null, pkey) == 1)
    assert(EVP_DigestUpdate(mdctx, message, string.strlen(message).asInstanceOf[size_t]) == 1)
    assert(EVP_DigestSignFinal(mdctx, null, md_len) == 1)
    val md_value = stackalloc[CUnsignedChar]((!md_len).asInstanceOf[ULong])

    assert(EVP_DigestSignFinal(mdctx, md_value, md_len) == 1)

    val ar = Array.newBuilder[Byte]

    for i <- 0 until (!md_len).asInstanceOf[ULong].toInt do ar.addOne(md_value(i).toByte)

    EVP_MD_CTX_free(mdctx)

    EVP_PKEY_free(pkey)

    new String(enc.encode(ar.result()))
  end hmac

end OpenSSL
