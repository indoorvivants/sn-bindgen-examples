import duckdb.functions.*
import duckdb.types.*

import scalanative.unsafe.*

import duckdb_state.*

@main def hello =
  val con = stackalloc[duckdb_connection]()
  val db = stackalloc[duckdb_database]()
  val result = stackalloc[duckdb_result]()

  assert(duckdb_open(null, db) == duckdb_state.DuckDBSuccess)
  assert(duckdb_connect(!db, con) == duckdb_state.DuckDBSuccess)
  assert(
    duckdb_query(
      !con,
      c"CREATE TABLE integers(i INTEGER, j INTEGER);",
      null
    ) == duckdb_state.DuckDBSuccess
  )

  assert(
    duckdb_query(
      !con,
      c"INSERT INTO integers VALUES (3, 4), (5, 6), (7, NULL);",
      null
    ) == duckdb_state.DuckDBSuccess
  )

  assert(duckdb_query(!con, c"SELECT * FROM integers", result) == DuckDBSuccess)

  import scalanative.unsigned.*

  val rows = duckdb_row_count(result).asInstanceOf[ULong]
  val columns = duckdb_column_count(result).asInstanceOf[ULong]

  for
    row <- 0L until rows.toLong
    col <- 0L until columns.toLong

    r = row.toULong.asInstanceOf[uint64_t]
    c = col.toULong.asInstanceOf[uint64_t]
  do
    val value = duckdb_value_varchar(result, c, r)
    println(s"Row = $r, Col = $c   ==   ${fromCString(value)}")
    duckdb_free(value)
  end for

  duckdb_destroy_result(result)
  duckdb_disconnect(con)
  duckdb_close(db)
end hello
