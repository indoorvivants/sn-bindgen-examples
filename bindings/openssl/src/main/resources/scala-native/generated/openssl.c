#include <string.h>
#include "openssl/sha.h"
#include "openssl/evp.h"

void __sn_wrap_openssl_OSSL_PARAM_construct_BN(const char * key, unsigned char * buf, size_t bsize, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_BN(key, buf, bsize);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_double(const char * key, double * buf, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_double(key, buf);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_end(OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_end();
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_int(const char * key, int * buf, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_int(key, buf);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_int32(const char * key, int32_t * buf, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_int32(key, buf);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_int64(const char * key, int64_t * buf, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_int64(key, buf);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_long(const char * key, long * buf, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_long(key, buf);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_octet_ptr(const char * key, void ** buf, size_t bsize, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_octet_ptr(key, buf, bsize);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_octet_string(const char * key, void * buf, size_t bsize, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_octet_string(key, buf, bsize);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_size_t(const char * key, size_t * buf, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_size_t(key, buf);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_time_t(const char * key, time_t * buf, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_time_t(key, buf);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_uint(const char * key, unsigned int * buf, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_uint(key, buf);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_uint32(const char * key, uint32_t * buf, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_uint32(key, buf);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_uint64(const char * key, uint64_t * buf, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_uint64(key, buf);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_ulong(const char * key, unsigned long * buf, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_ulong(key, buf);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_utf8_ptr(const char * key, char ** buf, size_t bsize, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_utf8_ptr(key, buf, bsize);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}


void __sn_wrap_openssl_OSSL_PARAM_construct_utf8_string(const char * key, char * buf, size_t bsize, OSSL_PARAM *____return) {
  OSSL_PARAM ____ret = OSSL_PARAM_construct_utf8_string(key, buf, bsize);
  memcpy(____return, &____ret, sizeof(OSSL_PARAM));
}