import libsqlite.functions.*
import libsqlite.types.*
import scala.scalanative.unsafe.*
import scala.scalanative.libc.*

@main def hello =
  Zone { implicit z =>
    val db = alloc[Ptr[sqlite3]](1)
    val errMsg = alloc[CString](1)

    val rc = sqlite3_open(c"hello.db", db)
    val sql =
      c"""CREATE TABLE COMPANY(
      ID INT PRIMARY KEY     NOT NULL,
      NAME           TEXT    NOT NULL,
      AGE            INT     NOT NULL,
      ADDRESS        CHAR(50),
      SALARY         REAL )"""

    sqlite3_exec(!db, sql, null, null, errMsg)

    sqlite3_exec(
      !db,
      c"DELETE FROM COMPANY;",
      null,
      null,
      errMsg
    )

    sqlite3_exec(
      !db,
      c"""insert into COMPANY (ID,NAME,AGE,ADDRESS,SALARY) values 
      (1, 'Martin Odersky', 21, 'EPFL', 100000.00), 
      (-1, 'Ortin Modersky', 99, 'LIFP', -100000.00);""",
      null,
      null,
      errMsg
    )

    type Func = CFuncPtr3[Ptr[Byte], Ptr[CString], Ptr[CString], Int]

    val f: Func = (
        stuff: Ptr[Byte],
        fields: Ptr[CString],
        columns: Ptr[CString]
    ) => 1

    type Func1 =
      CFuncPtr4[Ptr[Byte], CUnsignedInt, Ptr[CString], Ptr[CString], Int]

    type FuncDesired =
      CFuncPtr4[Ptr[Byte], CInt, Ptr[CString], Ptr[CString], Int]

    val f1: Func1 = (
        stuff: Ptr[Byte],
        cnt: CUnsignedInt,
        fields: Ptr[CString],
        columns: Ptr[CString]
    ) =>
      for i <- 0 until cnt.toInt do
        stdio.printf(c"%s = %s\n", columns(i), fields(i))

      0

    sqlite3_exec(
      !db,
      c"SELECT * FROM COMPANY;",
      f1.asInstanceOf[FuncDesired],
      null,
      errMsg
    )

    println(fromCString(!errMsg))

    sqlite3_close(!db)
  }
end hello
