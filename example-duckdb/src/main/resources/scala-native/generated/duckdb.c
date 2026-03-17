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


duckdb_state __sn_wrap_duckdb_duckdb_append_uhugeint(duckdb_appender appender, duckdb_uhugeint *value) {
 return duckdb_append_uhugeint(appender, *value);
};


duckdb_state __sn_wrap_duckdb_duckdb_bind_date(duckdb_prepared_statement prepared_statement, idx_t param_idx, duckdb_date *val) {
 return duckdb_bind_date(prepared_statement, param_idx, *val);
};


duckdb_state __sn_wrap_duckdb_duckdb_bind_decimal(duckdb_prepared_statement prepared_statement, idx_t param_idx, duckdb_decimal *val) {
 return duckdb_bind_decimal(prepared_statement, param_idx, *val);
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


duckdb_state __sn_wrap_duckdb_duckdb_bind_timestamp_tz(duckdb_prepared_statement prepared_statement, idx_t param_idx, duckdb_timestamp *val) {
 return duckdb_bind_timestamp_tz(prepared_statement, param_idx, *val);
};


duckdb_state __sn_wrap_duckdb_duckdb_bind_uhugeint(duckdb_prepared_statement prepared_statement, idx_t param_idx, duckdb_uhugeint *val) {
 return duckdb_bind_uhugeint(prepared_statement, param_idx, *val);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_bignum(duckdb_bignum *input) {
 return duckdb_create_bignum(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_bit(duckdb_bit *input) {
 return duckdb_create_bit(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_date(duckdb_date *input) {
 return duckdb_create_date(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_decimal(duckdb_decimal *input) {
 return duckdb_create_decimal(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_hugeint(duckdb_hugeint *input) {
 return duckdb_create_hugeint(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_interval(duckdb_interval *input) {
 return duckdb_create_interval(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_time(duckdb_time *input) {
 return duckdb_create_time(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_time_ns(duckdb_time_ns *input) {
 return duckdb_create_time_ns(*input);
};


void __sn_wrap_duckdb_duckdb_create_time_tz(int64_t micros, int32_t offset, duckdb_time_tz *____return) {
  duckdb_time_tz ____ret = duckdb_create_time_tz(micros, offset);
  memcpy(____return, &____ret, sizeof(duckdb_time_tz));
}


duckdb_value __sn_wrap_duckdb_duckdb_create_time_tz_value(duckdb_time_tz *value) {
 return duckdb_create_time_tz_value(*value);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_timestamp(duckdb_timestamp *input) {
 return duckdb_create_timestamp(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_timestamp_ms(duckdb_timestamp_ms *input) {
 return duckdb_create_timestamp_ms(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_timestamp_ns(duckdb_timestamp_ns *input) {
 return duckdb_create_timestamp_ns(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_timestamp_s(duckdb_timestamp_s *input) {
 return duckdb_create_timestamp_s(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_timestamp_tz(duckdb_timestamp *input) {
 return duckdb_create_timestamp_tz(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_uhugeint(duckdb_uhugeint *input) {
 return duckdb_create_uhugeint(*input);
};


duckdb_value __sn_wrap_duckdb_duckdb_create_uuid(duckdb_uhugeint *input) {
 return duckdb_create_uuid(*input);
};


double __sn_wrap_duckdb_duckdb_decimal_to_double(duckdb_decimal *val) {
 return duckdb_decimal_to_double(*val);
};


void __sn_wrap_duckdb_duckdb_double_to_decimal(double val, uint8_t width, uint8_t scale, duckdb_decimal *____return) {
  duckdb_decimal ____ret = duckdb_double_to_decimal(val, width, scale);
  memcpy(____return, &____ret, sizeof(duckdb_decimal));
}


void __sn_wrap_duckdb_duckdb_double_to_hugeint(double val, duckdb_hugeint *____return) {
  duckdb_hugeint ____ret = duckdb_double_to_hugeint(val);
  memcpy(____return, &____ret, sizeof(duckdb_hugeint));
}


void __sn_wrap_duckdb_duckdb_double_to_uhugeint(double val, duckdb_uhugeint *____return) {
  duckdb_uhugeint ____ret = duckdb_double_to_uhugeint(val);
  memcpy(____return, &____ret, sizeof(duckdb_uhugeint));
}


duckdb_data_chunk __sn_wrap_duckdb_duckdb_fetch_chunk(duckdb_result *result) {
 return duckdb_fetch_chunk(*result);
};


void __sn_wrap_duckdb_duckdb_from_date(duckdb_date *date, duckdb_date_struct *____return) {
  duckdb_date_struct ____ret = duckdb_from_date(*date);
  memcpy(____return, &____ret, sizeof(duckdb_date_struct));
}


void __sn_wrap_duckdb_duckdb_from_time(duckdb_time *time, duckdb_time_struct *____return) {
  duckdb_time_struct ____ret = duckdb_from_time(*time);
  memcpy(____return, &____ret, sizeof(duckdb_time_struct));
}


void __sn_wrap_duckdb_duckdb_from_time_tz(duckdb_time_tz *micros, duckdb_time_tz_struct *____return) {
  duckdb_time_tz_struct ____ret = duckdb_from_time_tz(*micros);
  memcpy(____return, &____ret, sizeof(duckdb_time_tz_struct));
}


void __sn_wrap_duckdb_duckdb_from_timestamp(duckdb_timestamp *ts, duckdb_timestamp_struct *____return) {
  duckdb_timestamp_struct ____ret = duckdb_from_timestamp(*ts);
  memcpy(____return, &____ret, sizeof(duckdb_timestamp_struct));
}


void __sn_wrap_duckdb_duckdb_get_bignum(duckdb_value val, duckdb_bignum *____return) {
  duckdb_bignum ____ret = duckdb_get_bignum(val);
  memcpy(____return, &____ret, sizeof(duckdb_bignum));
}


void __sn_wrap_duckdb_duckdb_get_bit(duckdb_value val, duckdb_bit *____return) {
  duckdb_bit ____ret = duckdb_get_bit(val);
  memcpy(____return, &____ret, sizeof(duckdb_bit));
}


void __sn_wrap_duckdb_duckdb_get_blob(duckdb_value val, duckdb_blob *____return) {
  duckdb_blob ____ret = duckdb_get_blob(val);
  memcpy(____return, &____ret, sizeof(duckdb_blob));
}


void __sn_wrap_duckdb_duckdb_get_date(duckdb_value val, duckdb_date *____return) {
  duckdb_date ____ret = duckdb_get_date(val);
  memcpy(____return, &____ret, sizeof(duckdb_date));
}


void __sn_wrap_duckdb_duckdb_get_decimal(duckdb_value val, duckdb_decimal *____return) {
  duckdb_decimal ____ret = duckdb_get_decimal(val);
  memcpy(____return, &____ret, sizeof(duckdb_decimal));
}


void __sn_wrap_duckdb_duckdb_get_hugeint(duckdb_value val, duckdb_hugeint *____return) {
  duckdb_hugeint ____ret = duckdb_get_hugeint(val);
  memcpy(____return, &____ret, sizeof(duckdb_hugeint));
}


void __sn_wrap_duckdb_duckdb_get_interval(duckdb_value val, duckdb_interval *____return) {
  duckdb_interval ____ret = duckdb_get_interval(val);
  memcpy(____return, &____ret, sizeof(duckdb_interval));
}


void __sn_wrap_duckdb_duckdb_get_time(duckdb_value val, duckdb_time *____return) {
  duckdb_time ____ret = duckdb_get_time(val);
  memcpy(____return, &____ret, sizeof(duckdb_time));
}


void __sn_wrap_duckdb_duckdb_get_time_ns(duckdb_value val, duckdb_time_ns *____return) {
  duckdb_time_ns ____ret = duckdb_get_time_ns(val);
  memcpy(____return, &____ret, sizeof(duckdb_time_ns));
}


void __sn_wrap_duckdb_duckdb_get_time_tz(duckdb_value val, duckdb_time_tz *____return) {
  duckdb_time_tz ____ret = duckdb_get_time_tz(val);
  memcpy(____return, &____ret, sizeof(duckdb_time_tz));
}


void __sn_wrap_duckdb_duckdb_get_timestamp(duckdb_value val, duckdb_timestamp *____return) {
  duckdb_timestamp ____ret = duckdb_get_timestamp(val);
  memcpy(____return, &____ret, sizeof(duckdb_timestamp));
}


void __sn_wrap_duckdb_duckdb_get_timestamp_ms(duckdb_value val, duckdb_timestamp_ms *____return) {
  duckdb_timestamp_ms ____ret = duckdb_get_timestamp_ms(val);
  memcpy(____return, &____ret, sizeof(duckdb_timestamp_ms));
}


void __sn_wrap_duckdb_duckdb_get_timestamp_ns(duckdb_value val, duckdb_timestamp_ns *____return) {
  duckdb_timestamp_ns ____ret = duckdb_get_timestamp_ns(val);
  memcpy(____return, &____ret, sizeof(duckdb_timestamp_ns));
}


void __sn_wrap_duckdb_duckdb_get_timestamp_s(duckdb_value val, duckdb_timestamp_s *____return) {
  duckdb_timestamp_s ____ret = duckdb_get_timestamp_s(val);
  memcpy(____return, &____ret, sizeof(duckdb_timestamp_s));
}


void __sn_wrap_duckdb_duckdb_get_timestamp_tz(duckdb_value val, duckdb_timestamp *____return) {
  duckdb_timestamp ____ret = duckdb_get_timestamp_tz(val);
  memcpy(____return, &____ret, sizeof(duckdb_timestamp));
}


void __sn_wrap_duckdb_duckdb_get_uhugeint(duckdb_value val, duckdb_uhugeint *____return) {
  duckdb_uhugeint ____ret = duckdb_get_uhugeint(val);
  memcpy(____return, &____ret, sizeof(duckdb_uhugeint));
}


void __sn_wrap_duckdb_duckdb_get_uuid(duckdb_value val, duckdb_uhugeint *____return) {
  duckdb_uhugeint ____ret = duckdb_get_uuid(val);
  memcpy(____return, &____ret, sizeof(duckdb_uhugeint));
}


double __sn_wrap_duckdb_duckdb_hugeint_to_double(duckdb_hugeint *val) {
 return duckdb_hugeint_to_double(*val);
};


_Bool __sn_wrap_duckdb_duckdb_is_finite_date(duckdb_date *date) {
 return duckdb_is_finite_date(*date);
};


_Bool __sn_wrap_duckdb_duckdb_is_finite_timestamp(duckdb_timestamp *ts) {
 return duckdb_is_finite_timestamp(*ts);
};


_Bool __sn_wrap_duckdb_duckdb_is_finite_timestamp_ms(duckdb_timestamp_ms *ts) {
 return duckdb_is_finite_timestamp_ms(*ts);
};


_Bool __sn_wrap_duckdb_duckdb_is_finite_timestamp_ns(duckdb_timestamp_ns *ts) {
 return duckdb_is_finite_timestamp_ns(*ts);
};


_Bool __sn_wrap_duckdb_duckdb_is_finite_timestamp_s(duckdb_timestamp_s *ts) {
 return duckdb_is_finite_timestamp_s(*ts);
};


void __sn_wrap_duckdb_duckdb_query_progress(duckdb_connection connection, duckdb_query_progress_type *____return) {
  duckdb_query_progress_type ____ret = duckdb_query_progress(connection);
  memcpy(____return, &____ret, sizeof(duckdb_query_progress_type));
}


void __sn_wrap_duckdb_duckdb_result_arrow_array(duckdb_result *result, duckdb_data_chunk chunk, duckdb_arrow_array * out_array) {
 duckdb_result_arrow_array(*result, chunk, out_array);
};


idx_t __sn_wrap_duckdb_duckdb_result_chunk_count(duckdb_result *result) {
 return duckdb_result_chunk_count(*result);
};


duckdb_data_chunk __sn_wrap_duckdb_duckdb_result_get_chunk(duckdb_result *result, idx_t chunk_index) {
 return duckdb_result_get_chunk(*result, chunk_index);
};


_Bool __sn_wrap_duckdb_duckdb_result_is_streaming(duckdb_result *result) {
 return duckdb_result_is_streaming(*result);
};


duckdb_result_type __sn_wrap_duckdb_duckdb_result_return_type(duckdb_result *result) {
 return duckdb_result_return_type(*result);
};


duckdb_statement_type __sn_wrap_duckdb_duckdb_result_statement_type(duckdb_result *result) {
 return duckdb_result_statement_type(*result);
};


duckdb_data_chunk __sn_wrap_duckdb_duckdb_stream_fetch_chunk(duckdb_result *result) {
 return duckdb_stream_fetch_chunk(*result);
};


_Bool __sn_wrap_duckdb_duckdb_string_is_inlined(duckdb_string_t *string) {
 return duckdb_string_is_inlined(*string);
};


uint32_t __sn_wrap_duckdb_duckdb_string_t_length(duckdb_string_t *string) {
 return duckdb_string_t_length(*string);
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


double __sn_wrap_duckdb_duckdb_uhugeint_to_double(duckdb_uhugeint *val) {
 return duckdb_uhugeint_to_double(*val);
};


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


void __sn_wrap_duckdb_duckdb_value_string(duckdb_result * result, idx_t col, idx_t row, duckdb_string *____return) {
  duckdb_string ____ret = duckdb_value_string(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_string));
}


void __sn_wrap_duckdb_duckdb_value_string_internal(duckdb_result * result, idx_t col, idx_t row, duckdb_string *____return) {
  duckdb_string ____ret = duckdb_value_string_internal(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_string));
}


void __sn_wrap_duckdb_duckdb_value_time(duckdb_result * result, idx_t col, idx_t row, duckdb_time *____return) {
  duckdb_time ____ret = duckdb_value_time(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_time));
}


void __sn_wrap_duckdb_duckdb_value_timestamp(duckdb_result * result, idx_t col, idx_t row, duckdb_timestamp *____return) {
  duckdb_timestamp ____ret = duckdb_value_timestamp(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_timestamp));
}


void __sn_wrap_duckdb_duckdb_value_uhugeint(duckdb_result * result, idx_t col, idx_t row, duckdb_uhugeint *____return) {
  duckdb_uhugeint ____ret = duckdb_value_uhugeint(result, col, row);
  memcpy(____return, &____ret, sizeof(duckdb_uhugeint));
}