import libpq.functions.*
import libpq.types.*

import scala.scalanative.unsafe.*
import scala.scalanative.libc.*

@main def hello =
  val conninfo =
    c"postgresql://postgres:mysecretpassword@localhost:5432/postgres"

  given conn: Ptr[PGconn] = PQconnectdb(conninfo)

  def exit_nicely(using conn: Ptr[PGconn]) =
    PQfinish(conn)
    sys.exit(1)

  def execute(statement: CString, expected: ExecStatusType)(using
      conn: Ptr[PGconn]
  ): Ptr[PGresult] =
    var res = PQexec(conn, statement)
    if PQresultStatus(res) != expected then
      stdio.printf(c"Failed to execute %s: %s\n", PQerrorMessage(conn))
      PQclear(res)
      exit_nicely
    res
  end execute

  if PQstatus(conn) != ConnStatusType.CONNECTION_OK then
    stdio.printf(c"Failed to connect to postgres: %s\n", PQerrorMessage(conn))
  else
    var res = execute(c"BEGIN", ExecStatusType.PGRES_COMMAND_OK)
    PQclear(res)

    res = execute(
      c"DECLARE myportal CURSOR FOR select * from pg_database",
      ExecStatusType.PGRES_COMMAND_OK
    )
    PQclear(res)

    res = execute(c"FETCH ALL in myportal", ExecStatusType.PGRES_TUPLES_OK)
    val nFields = PQnfields(res) min 8 // my screen is just no wide enough
    for i <- 0 until nFields do stdio.printf(c"%-15s", PQfname(res, i))
    stdio.printf(c"\n")

    val nTuples = PQntuples(res)

    for row <- 0 until nTuples do
      for field <- 0 until nFields do
        stdio.printf(c"%-15s", PQgetvalue(res, row, field))
      stdio.printf(c"\n\n")

    res = PQexec(conn, c"CLOSE myportal")
    PQclear(res)

    res = PQexec(conn, c"END")
    PQclear(res)
  end if

end hello
