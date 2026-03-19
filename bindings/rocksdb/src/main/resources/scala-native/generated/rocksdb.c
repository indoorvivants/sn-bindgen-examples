#include <string.h>
#include "rocksdb/c.h"

void __sn_wrap_rocksdb_rocksdb_iter_key_slice(const rocksdb_iterator_t * iter, rocksdb_slice_t *____return) {
  rocksdb_slice_t ____ret = rocksdb_iter_key_slice(iter);
  memcpy(____return, &____ret, sizeof(rocksdb_slice_t));
}


void __sn_wrap_rocksdb_rocksdb_iter_timestamp_slice(const rocksdb_iterator_t * iter, rocksdb_slice_t *____return) {
  rocksdb_slice_t ____ret = rocksdb_iter_timestamp_slice(iter);
  memcpy(____return, &____ret, sizeof(rocksdb_slice_t));
}


void __sn_wrap_rocksdb_rocksdb_iter_value_slice(const rocksdb_iterator_t * iter, rocksdb_slice_t *____return) {
  rocksdb_slice_t ____ret = rocksdb_iter_value_slice(iter);
  memcpy(____return, &____ret, sizeof(rocksdb_slice_t));
}