#include <string.h>
#include "hiredis.h"

void __sn_wrap_libredis_hiredisSetAllocators(hiredisAllocFuncs * ha, hiredisAllocFuncs *____return) {
  hiredisAllocFuncs ____ret = hiredisSetAllocators(ha);
  memcpy(____return, &____ret, sizeof(hiredisAllocFuncs));
}