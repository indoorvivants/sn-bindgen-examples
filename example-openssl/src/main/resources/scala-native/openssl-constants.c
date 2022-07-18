#include "openssl/evp.h"

int get_EVP_MAC_KEY() { return EVP_PKEY_HMAC; }

int get_EVP_MAX_MD_SIZE() { return EVP_MAX_MD_SIZE; }

void get_OpenSSL_add_all_digests() { OpenSSL_add_all_digests(); }
