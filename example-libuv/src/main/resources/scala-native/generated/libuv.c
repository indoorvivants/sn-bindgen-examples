#include <string.h>
#include "uv.h"

void __sn_wrap_libuv_uv_buf_init(char * base, unsigned int len, uv_buf_t *____return) {
  uv_buf_t ____ret = uv_buf_init(base, len);
  memcpy(____return, &____ret, sizeof(uv_buf_t));
}