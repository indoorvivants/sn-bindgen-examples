import libmysql.all.*
import scalanative.unsafe.*
import scalanative.unsigned.*

def mysql_assert[A](f: => A, conn: Ptr[MYSQL], msg: String) =
  val result = f
  assert(
    result != null, {
      val err =
        s"$msg: ${fromCString(mysql_error(conn))}"
      mysql_close(conn)
      err
    }
  )
  result
end mysql_assert

@main def hello =
  val conn = mysql_init(null)

  assert(conn != null, "mysql_init failed")

  val newValue = stackalloc[mysql_protocol_type]()
  !newValue = mysql_protocol_type.MYSQL_PROTOCOL_TCP

  mysql_options(
    conn,
    mysql_option.MYSQL_OPT_PROTOCOL,
    newValue.asInstanceOf
  )

  val real_connect =
    mysql_assert(
      mysql_real_connect(
        mysql = conn,
        host = c"localhost",
        user = c"mysql",
        passwd = c"mysql-password",
        db = c"mysql_db",
        port = 3306.toUInt,
        unix_socket = null,
        clientflag = 0.toUInt
      ),
      conn,
      "mysql_real_connect failed"
    )

  mysql_assert(
    mysql_query(conn, c"select 1, 'hello', 'world!'"),
    conn,
    "mysql_query failed"
  )

  val res =
    mysql_assert(mysql_use_result(conn), conn, "mysql_use_result failed")

  var lastRow: MYSQL_ROW = null.asInstanceOf

  inline def fetchRow() =
    lastRow = mysql_fetch_row(res)
    lastRow

  while fetchRow() != null.asInstanceOf do
    val columns = mysql_num_fields(res)
    println("-----")
    for i <- 0 until columns.toInt do
      print(s"${fromCString(lastRow.value(i))} |")

  mysql_free_result(res)
  mysql_close(conn)
end hello
