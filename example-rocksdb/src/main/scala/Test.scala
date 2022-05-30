import rocksdb.functions.*
import rocksdb.types.*

import scalanative.unsafe.*
import scalanative.unsigned.*

import scala.scalanative.libc.string

@main def hello =
  var db = stackalloc[rocksdb_t](1)
  var backup_engine = stackalloc[rocksdb_backup_engine_t](1)
  val options = rocksdb_options_create()

  val err = stackalloc[CString](1)

  // Open database

  rocksdb_options_set_create_if_missing(options, 1.toUByte)
  val DBPath = c"test.rocksdb"
  val DBBackupPath = c"test.rocksdb_backup"
  db = rocksdb_open(options, DBPath, err)
  backup_engine = rocksdb_backup_engine_open(options, DBBackupPath, err)
  assert(!err == null)

  // Write key-value
  val write_options = rocksdb_writeoptions_create()
  val key = c"hello, "
  val value = c"Scala Native!"
  rocksdb_put(
    db,
    write_options,
    key,
    string.strlen(key),
    value,
    string.strlen(value) + 1.toULong,
    err
  )
  assert(!err == null)

  // Read key-value
  val read_options = rocksdb_readoptions_create()
  val len = stackalloc[CSize]()
  val returned_value =
    rocksdb_get(db, read_options, key, string.strlen(key), len, err)
  assert(!err == null)
  assert(fromCString(returned_value) == "Scala Native!")

  // create new backup
  rocksdb_backup_engine_create_new_backup(backup_engine, db, err)
  assert(!err == null)

  rocksdb_close(db)

  // restore backup

  val restore_options = rocksdb_restore_options_create()
  rocksdb_backup_engine_restore_db_from_latest_backup(
    backup_engine,
    DBPath,
    DBPath,
    restore_options,
    err
  )
  assert(!err == null)
  rocksdb_restore_options_destroy(restore_options)

  db = rocksdb_open(options, DBPath, err)
  assert(!err == null)

  // cleanup

  rocksdb_writeoptions_destroy(write_options)
  rocksdb_readoptions_destroy(read_options)
  rocksdb_options_destroy(options)
  rocksdb_backup_engine_close(backup_engine)
  rocksdb_close(db)

end hello
