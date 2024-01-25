#include <string.h>
#include "duckdb.h"

duckdb_state __sn_wrap_duckdb_duckdb_append_date(duckdb_appender appender, duckdb_date *value) {
 return duckdb_append_date(appender, *value);
};


duckdb_state __sn_wrap_duckdb_duckdb_append_hugeint(duckdb_appender appender, duckdb_hugeint *value) {
 return duckdb_append_hugeint(appender, *value);
};


duckdb_state __sn_wrap_duckdb_duckdb_append_interval(duckdb_appender appender, duckdb_interval *value) {
 return duckdb_append_interval(appender, *value);
};


duckdb_state __sn_wrap_duckdb_duckdb_append_time(duckdb_appender appender, duckdb_time *value) {
 return duckdb_append_time(appender, *value);
};


duckdb_state __sn_wrap_duckdb_duckdb_append_timestamp(duckdb_appender appender, duckdb_timestamp *value) {
 return duckdb_append_timestamp(appender, *value);
};


duckdb_state __sn_wrap_duckdb_duckdb_bind_date(duckdb_prepared_statement prepared_statement, idx_t param_idx, duckdb_date *val) {
 return duckdb_bind_date(prepared_statement, param_idx, *val);
};


duckdb_state __sn_wrap_duckdb_duckdb_bind_hugeint(duckdb_prepared_statement prepared_statement, idx_t param_idx, duckdb_hugeint *val) {
 return duckdb_bind_hugeint(prepared_statement, param_idx, *val);
};


duckdb_state __sn_wrap_duckdb_duckdb_bind_interval(duckdb_prepared_statement prepared_statement, idx_t param_idx, duckdb_interval *val) {
 return duckdb_bind_interval(prepared_statement, param_idx, *val);
};


duckdb_state __sn_wrap_duckdb_duckdb_bind_time(duckdb_prepared_statement prepared_statement, idx_t param_idx, duckdb_time *val) {
 return duckdb_bind_time(prepared_statement, param_idx, *val);
};


duckdb_state __sn_wrap_duckdb_duckdb_bind_timestamp(duckdb_prepared_statement prepared_statement, idx_t param_idx, duckdb_timestamp *val) {
 return duckdb_bind_timestamp(prepared_statement, param_idx, *val);
};


double __sn_wrap_duckdb_duckdb_decimal_to_double(duckdb_decimal *val) {
 return duckdb_decimal_to_double(*val);
};


void __sn_wrap_duckdb_duckdb_double_to_hugeint(double val, duckdb_hugeint *____return) {
  duckdb_hugeint ____ret = duckdb_double_to_hugeint(val);
  memcpy(____return, &____ret, sizeof(duckdb_hugeint));
}


void __sn_wrap_duckdb_duckdb_from_date(duckdb_date *date, duckdb_date_struct *____return) {
  duckdb_date_struct ____ret = duckdb_from_date(*date);
  memcpy(____return, &____ret, sizeof(duckdb_date_struct));
}


void __sn_wrap_duckdb_duckdb_from_time(duckdb_time *time, duckdb_time_struct *____return) {
  duckdb_time_struct ____ret = duckdb_from_time(*time);
  memcpy(____return, &____ret, sizeof(duckdb_time_struct));
}


void __sn_wrap_duckdb_duckdb_from_timestamp(duckdb_timestamp *ts, duckdb_timestamp_struct *____return) {
  duckdb_timestamp_struct ____ret = duckdb_from_timestamp(*ts);
  memcpy(____return, &____ret, sizeof(duckdb_timestamp_struct));
}


double __sn_wrap_duckdb_duckdb_hugeint_to_double(duckdb_hugeint *val) {
 return duckdb_hugeint_to_double(*val);
};


idx_t __sn_wrap_duckdb_duckdb_result_chunk_count(duckdb_result *result) {
 return duckdb_result_chunk_count(*result);
};


duckdb_data_chunk __sn_wrap_duckdb_duckdb_result_get_chunk(duckdb_result *result, idx_t chunk_index) {
 return duckdb_result_get_chunk(*result, chunk_index);
};


void __sn_wrap_duckdb_duckdb_to_date(duckdb_date_struct *date, duckdb_date *____return) {
  duckdb_date ____ret = duckdb_to_date(*date);
  memcpy(____return, &____ret, sizeof(duckdb_date));
}


void __sn_wrap_duckdb_duckdb_to_time(duckdb_time_struct *time, duckdb_time *____return) {
  duckdb_time ____ret = duckdb_to_time(*time);
  memcpy(____return, &____ret, sizeof(duckdb_time));
}


void __sn_wrap_duckdb_duckdb_to_timestamp(duckdb_timestamp_struct *ts, duckdb_timestamp *____return) {
  duckdb_timestamp ____ret = duckdb_to_timestamp(*ts);
  memcpy(____return, &____ret, sizeof(duckdb_timestamp));
}


void __sn_wrap_duckdb_duckdb_value_blob(duckdb_result * result, idx_t col, idx_t row, duckdb_blob *____return) {
  duckdb_blob ____ret = duckdb_value_blob(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_blob));
}


void __sn_wrap_duckdb_duckdb_value_date(duckdb_result * result, idx_t col, idx_t row, duckdb_date *____return) {
  duckdb_date ____ret = duckdb_value_date(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_date));
}


void __sn_wrap_duckdb_duckdb_value_decimal(duckdb_result * result, idx_t col, idx_t row, duckdb_decimal *____return) {
  duckdb_decimal ____ret = duckdb_value_decimal(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_decimal));
}


void __sn_wrap_duckdb_duckdb_value_hugeint(duckdb_result * result, idx_t col, idx_t row, duckdb_hugeint *____return) {
  duckdb_hugeint ____ret = duckdb_value_hugeint(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_hugeint));
}


void __sn_wrap_duckdb_duckdb_value_interval(duckdb_result * result, idx_t col, idx_t row, duckdb_interval *____return) {
  duckdb_interval ____ret = duckdb_value_interval(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_interval));
}


void __sn_wrap_duckdb_duckdb_value_time(duckdb_result * result, idx_t col, idx_t row, duckdb_time *____return) {
  duckdb_time ____ret = duckdb_value_time(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_time));
}


void __sn_wrap_duckdb_duckdb_value_timestamp(duckdb_result * result, idx_t col, idx_t row, duckdb_timestamp *____return) {
  duckdb_timestamp ____ret = duckdb_value_timestamp(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_timestamp));
}