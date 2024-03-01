package rocksdb

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object aliases:
  import _root_.rocksdb.aliases.*
  import _root_.rocksdb.structs.*
  type int32_t = scala.scalanative.unsafe.CInt
  object int32_t: 
    val _tag: Tag[int32_t] = summon[Tag[scala.scalanative.unsafe.CInt]]
    inline def apply(inline o: scala.scalanative.unsafe.CInt): int32_t = o
    extension (v: int32_t)
      inline def value: scala.scalanative.unsafe.CInt = v

  type int64_t = scala.Long
  object int64_t: 
    val _tag: Tag[int64_t] = summon[Tag[scala.Long]]
    inline def apply(inline o: scala.Long): int64_t = o
    extension (v: int64_t)
      inline def value: scala.Long = v

  type size_t = libc.stddef.size_t
  object size_t: 
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t)
      inline def value: libc.stddef.size_t = v

  type uint32_t = scala.scalanative.unsigned.UInt
  object uint32_t: 
    val _tag: Tag[uint32_t] = summon[Tag[scala.scalanative.unsigned.UInt]]
    inline def apply(inline o: scala.scalanative.unsigned.UInt): uint32_t = o
    extension (v: uint32_t)
      inline def value: scala.scalanative.unsigned.UInt = v

  type uint64_t = scala.scalanative.unsigned.ULong
  object uint64_t: 
    val _tag: Tag[uint64_t] = summon[Tag[scala.scalanative.unsigned.ULong]]
    inline def apply(inline o: scala.scalanative.unsigned.ULong): uint64_t = o
    extension (v: uint64_t)
      inline def value: scala.scalanative.unsigned.ULong = v

object structs:
  import _root_.rocksdb.aliases.*
  import _root_.rocksdb.structs.*
  /**
  */
  opaque type rocksdb_backup_engine_info_t = CStruct0
  object rocksdb_backup_engine_info_t:
    given _tag: Tag[rocksdb_backup_engine_info_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_backup_engine_options_t = CStruct0
  object rocksdb_backup_engine_options_t:
    given _tag: Tag[rocksdb_backup_engine_options_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_backup_engine_t = CStruct0
  object rocksdb_backup_engine_t:
    given _tag: Tag[rocksdb_backup_engine_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_block_based_table_options_t = CStruct0
  object rocksdb_block_based_table_options_t:
    given _tag: Tag[rocksdb_block_based_table_options_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_cache_t = CStruct0
  object rocksdb_cache_t:
    given _tag: Tag[rocksdb_cache_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_checkpoint_t = CStruct0
  object rocksdb_checkpoint_t:
    given _tag: Tag[rocksdb_checkpoint_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_column_family_handle_t = CStruct0
  object rocksdb_column_family_handle_t:
    given _tag: Tag[rocksdb_column_family_handle_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_column_family_metadata_t = CStruct0
  object rocksdb_column_family_metadata_t:
    given _tag: Tag[rocksdb_column_family_metadata_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_compactionfilter_t = CStruct0
  object rocksdb_compactionfilter_t:
    given _tag: Tag[rocksdb_compactionfilter_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_compactionfiltercontext_t = CStruct0
  object rocksdb_compactionfiltercontext_t:
    given _tag: Tag[rocksdb_compactionfiltercontext_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_compactionfilterfactory_t = CStruct0
  object rocksdb_compactionfilterfactory_t:
    given _tag: Tag[rocksdb_compactionfilterfactory_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_compactoptions_t = CStruct0
  object rocksdb_compactoptions_t:
    given _tag: Tag[rocksdb_compactoptions_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_comparator_t = CStruct0
  object rocksdb_comparator_t:
    given _tag: Tag[rocksdb_comparator_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_cuckoo_table_options_t = CStruct0
  object rocksdb_cuckoo_table_options_t:
    given _tag: Tag[rocksdb_cuckoo_table_options_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_dbpath_t = CStruct0
  object rocksdb_dbpath_t:
    given _tag: Tag[rocksdb_dbpath_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_env_t = CStruct0
  object rocksdb_env_t:
    given _tag: Tag[rocksdb_env_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_envoptions_t = CStruct0
  object rocksdb_envoptions_t:
    given _tag: Tag[rocksdb_envoptions_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_fifo_compaction_options_t = CStruct0
  object rocksdb_fifo_compaction_options_t:
    given _tag: Tag[rocksdb_fifo_compaction_options_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_filelock_t = CStruct0
  object rocksdb_filelock_t:
    given _tag: Tag[rocksdb_filelock_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_filterpolicy_t = CStruct0
  object rocksdb_filterpolicy_t:
    given _tag: Tag[rocksdb_filterpolicy_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_flushoptions_t = CStruct0
  object rocksdb_flushoptions_t:
    given _tag: Tag[rocksdb_flushoptions_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_ingestexternalfileoptions_t = CStruct0
  object rocksdb_ingestexternalfileoptions_t:
    given _tag: Tag[rocksdb_ingestexternalfileoptions_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_iterator_t = CStruct0
  object rocksdb_iterator_t:
    given _tag: Tag[rocksdb_iterator_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_level_metadata_t = CStruct0
  object rocksdb_level_metadata_t:
    given _tag: Tag[rocksdb_level_metadata_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_livefiles_t = CStruct0
  object rocksdb_livefiles_t:
    given _tag: Tag[rocksdb_livefiles_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_logger_t = CStruct0
  object rocksdb_logger_t:
    given _tag: Tag[rocksdb_logger_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_lru_cache_options_t = CStruct0
  object rocksdb_lru_cache_options_t:
    given _tag: Tag[rocksdb_lru_cache_options_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_memory_allocator_t = CStruct0
  object rocksdb_memory_allocator_t:
    given _tag: Tag[rocksdb_memory_allocator_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_memory_consumers_t = CStruct0
  object rocksdb_memory_consumers_t:
    given _tag: Tag[rocksdb_memory_consumers_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_memory_usage_t = CStruct0
  object rocksdb_memory_usage_t:
    given _tag: Tag[rocksdb_memory_usage_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_mergeoperator_t = CStruct0
  object rocksdb_mergeoperator_t:
    given _tag: Tag[rocksdb_mergeoperator_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_optimistictransaction_options_t = CStruct0
  object rocksdb_optimistictransaction_options_t:
    given _tag: Tag[rocksdb_optimistictransaction_options_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_optimistictransactiondb_t = CStruct0
  object rocksdb_optimistictransactiondb_t:
    given _tag: Tag[rocksdb_optimistictransactiondb_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_options_t = CStruct0
  object rocksdb_options_t:
    given _tag: Tag[rocksdb_options_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_perfcontext_t = CStruct0
  object rocksdb_perfcontext_t:
    given _tag: Tag[rocksdb_perfcontext_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_pinnableslice_t = CStruct0
  object rocksdb_pinnableslice_t:
    given _tag: Tag[rocksdb_pinnableslice_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_randomfile_t = CStruct0
  object rocksdb_randomfile_t:
    given _tag: Tag[rocksdb_randomfile_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_ratelimiter_t = CStruct0
  object rocksdb_ratelimiter_t:
    given _tag: Tag[rocksdb_ratelimiter_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_readoptions_t = CStruct0
  object rocksdb_readoptions_t:
    given _tag: Tag[rocksdb_readoptions_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_restore_options_t = CStruct0
  object rocksdb_restore_options_t:
    given _tag: Tag[rocksdb_restore_options_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_seqfile_t = CStruct0
  object rocksdb_seqfile_t:
    given _tag: Tag[rocksdb_seqfile_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_slicetransform_t = CStruct0
  object rocksdb_slicetransform_t:
    given _tag: Tag[rocksdb_slicetransform_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_snapshot_t = CStruct0
  object rocksdb_snapshot_t:
    given _tag: Tag[rocksdb_snapshot_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_sst_file_metadata_t = CStruct0
  object rocksdb_sst_file_metadata_t:
    given _tag: Tag[rocksdb_sst_file_metadata_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_sstfilewriter_t = CStruct0
  object rocksdb_sstfilewriter_t:
    given _tag: Tag[rocksdb_sstfilewriter_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_t = CStruct0
  object rocksdb_t:
    given _tag: Tag[rocksdb_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_transaction_options_t = CStruct0
  object rocksdb_transaction_options_t:
    given _tag: Tag[rocksdb_transaction_options_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_transaction_t = CStruct0
  object rocksdb_transaction_t:
    given _tag: Tag[rocksdb_transaction_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_transactiondb_options_t = CStruct0
  object rocksdb_transactiondb_options_t:
    given _tag: Tag[rocksdb_transactiondb_options_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_transactiondb_t = CStruct0
  object rocksdb_transactiondb_t:
    given _tag: Tag[rocksdb_transactiondb_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_universal_compaction_options_t = CStruct0
  object rocksdb_universal_compaction_options_t:
    given _tag: Tag[rocksdb_universal_compaction_options_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_wal_iterator_t = CStruct0
  object rocksdb_wal_iterator_t:
    given _tag: Tag[rocksdb_wal_iterator_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_wal_readoptions_t = CStruct0
  object rocksdb_wal_readoptions_t:
    given _tag: Tag[rocksdb_wal_readoptions_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_writablefile_t = CStruct0
  object rocksdb_writablefile_t:
    given _tag: Tag[rocksdb_writablefile_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_writebatch_t = CStruct0
  object rocksdb_writebatch_t:
    given _tag: Tag[rocksdb_writebatch_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_writebatch_wi_t = CStruct0
  object rocksdb_writebatch_wi_t:
    given _tag: Tag[rocksdb_writebatch_wi_t] = Tag.materializeCStruct0Tag

  /**
  */
  opaque type rocksdb_writeoptions_t = CStruct0
  object rocksdb_writeoptions_t:
    given _tag: Tag[rocksdb_writeoptions_t] = Tag.materializeCStruct0Tag


@extern
private[rocksdb] object extern_functions:
  import _root_.rocksdb.aliases.*
  import _root_.rocksdb.structs.*
  /**
  */
  def rocksdb_approximate_memory_usage_create(consumers : Ptr[rocksdb_memory_consumers_t], errptr : Ptr[CString]): Ptr[rocksdb_memory_usage_t] = extern

  /**
  */
  def rocksdb_approximate_memory_usage_destroy(usage : Ptr[rocksdb_memory_usage_t]): Unit = extern

  /**
  */
  def rocksdb_approximate_memory_usage_get_cache_total(memory_usage : Ptr[rocksdb_memory_usage_t]): uint64_t = extern

  /**
  */
  def rocksdb_approximate_memory_usage_get_mem_table_readers_total(memory_usage : Ptr[rocksdb_memory_usage_t]): uint64_t = extern

  /**
  */
  def rocksdb_approximate_memory_usage_get_mem_table_total(memory_usage : Ptr[rocksdb_memory_usage_t]): uint64_t = extern

  /**
  */
  def rocksdb_approximate_memory_usage_get_mem_table_unflushed(memory_usage : Ptr[rocksdb_memory_usage_t]): uint64_t = extern

  /**
  */
  def rocksdb_approximate_sizes(db : Ptr[rocksdb_t], num_ranges : CInt, range_start_key : Ptr[CString], range_start_key_len : Ptr[size_t], range_limit_key : Ptr[CString], range_limit_key_len : Ptr[size_t], sizes : Ptr[uint64_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_approximate_sizes_cf(db : Ptr[rocksdb_t], column_family : Ptr[rocksdb_column_family_handle_t], num_ranges : CInt, range_start_key : Ptr[CString], range_start_key_len : Ptr[size_t], range_limit_key : Ptr[CString], range_limit_key_len : Ptr[size_t], sizes : Ptr[uint64_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_backup_engine_close(be : Ptr[rocksdb_backup_engine_t]): Unit = extern

  /**
  */
  def rocksdb_backup_engine_create_new_backup(be : Ptr[rocksdb_backup_engine_t], db : Ptr[rocksdb_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_backup_engine_create_new_backup_flush(be : Ptr[rocksdb_backup_engine_t], db : Ptr[rocksdb_t], flush_before_backup : CUnsignedChar, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_backup_engine_get_backup_info(be : Ptr[rocksdb_backup_engine_t]): Ptr[rocksdb_backup_engine_info_t] = extern

  /**
  */
  def rocksdb_backup_engine_info_backup_id(info : Ptr[rocksdb_backup_engine_info_t], index : CInt): uint32_t = extern

  /**
  */
  def rocksdb_backup_engine_info_count(info : Ptr[rocksdb_backup_engine_info_t]): CInt = extern

  /**
  */
  def rocksdb_backup_engine_info_destroy(info : Ptr[rocksdb_backup_engine_info_t]): Unit = extern

  /**
  */
  def rocksdb_backup_engine_info_number_files(info : Ptr[rocksdb_backup_engine_info_t], index : CInt): uint32_t = extern

  /**
  */
  def rocksdb_backup_engine_info_size(info : Ptr[rocksdb_backup_engine_info_t], index : CInt): uint64_t = extern

  /**
  */
  def rocksdb_backup_engine_info_timestamp(info : Ptr[rocksdb_backup_engine_info_t], index : CInt): int64_t = extern

  /**
  */
  def rocksdb_backup_engine_open(options : Ptr[rocksdb_options_t], path : CString, errptr : Ptr[CString]): Ptr[rocksdb_backup_engine_t] = extern

  /**
  */
  def rocksdb_backup_engine_open_opts(options : Ptr[rocksdb_backup_engine_options_t], env : Ptr[rocksdb_env_t], errptr : Ptr[CString]): Ptr[rocksdb_backup_engine_t] = extern

  /**
  */
  def rocksdb_backup_engine_options_create(backup_dir : CString): Ptr[rocksdb_backup_engine_options_t] = extern

  /**
  */
  def rocksdb_backup_engine_options_destroy(_0 : Ptr[rocksdb_backup_engine_options_t]): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_get_backup_log_files(options : Ptr[rocksdb_backup_engine_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_backup_engine_options_get_backup_rate_limit(options : Ptr[rocksdb_backup_engine_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_backup_engine_options_get_callback_trigger_interval_size(options : Ptr[rocksdb_backup_engine_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_backup_engine_options_get_destroy_old_data(options : Ptr[rocksdb_backup_engine_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_backup_engine_options_get_max_background_operations(options : Ptr[rocksdb_backup_engine_options_t]): CInt = extern

  /**
  */
  def rocksdb_backup_engine_options_get_max_valid_backups_to_open(options : Ptr[rocksdb_backup_engine_options_t]): CInt = extern

  /**
  */
  def rocksdb_backup_engine_options_get_restore_rate_limit(options : Ptr[rocksdb_backup_engine_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_backup_engine_options_get_share_files_with_checksum_naming(options : Ptr[rocksdb_backup_engine_options_t]): CInt = extern

  /**
  */
  def rocksdb_backup_engine_options_get_share_table_files(options : Ptr[rocksdb_backup_engine_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_backup_engine_options_get_sync(options : Ptr[rocksdb_backup_engine_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_backup_engine_options_set_backup_dir(options : Ptr[rocksdb_backup_engine_options_t], backup_dir : CString): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_set_backup_log_files(options : Ptr[rocksdb_backup_engine_options_t], `val` : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_set_backup_rate_limit(options : Ptr[rocksdb_backup_engine_options_t], limit : uint64_t): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_set_callback_trigger_interval_size(options : Ptr[rocksdb_backup_engine_options_t], size : uint64_t): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_set_destroy_old_data(options : Ptr[rocksdb_backup_engine_options_t], `val` : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_set_env(options : Ptr[rocksdb_backup_engine_options_t], env : Ptr[rocksdb_env_t]): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_set_max_background_operations(options : Ptr[rocksdb_backup_engine_options_t], `val` : CInt): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_set_max_valid_backups_to_open(options : Ptr[rocksdb_backup_engine_options_t], `val` : CInt): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_set_restore_rate_limit(options : Ptr[rocksdb_backup_engine_options_t], limit : uint64_t): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_set_share_files_with_checksum_naming(options : Ptr[rocksdb_backup_engine_options_t], `val` : CInt): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_set_share_table_files(options : Ptr[rocksdb_backup_engine_options_t], `val` : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_backup_engine_options_set_sync(options : Ptr[rocksdb_backup_engine_options_t], `val` : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_backup_engine_purge_old_backups(be : Ptr[rocksdb_backup_engine_t], num_backups_to_keep : uint32_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_backup_engine_restore_db_from_backup(be : Ptr[rocksdb_backup_engine_t], db_dir : CString, wal_dir : CString, restore_options : Ptr[rocksdb_restore_options_t], backup_id : uint32_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_backup_engine_restore_db_from_latest_backup(be : Ptr[rocksdb_backup_engine_t], db_dir : CString, wal_dir : CString, restore_options : Ptr[rocksdb_restore_options_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_backup_engine_verify_backup(be : Ptr[rocksdb_backup_engine_t], backup_id : uint32_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_batched_multi_get_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], num_keys : size_t, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], values : Ptr[Ptr[rocksdb_pinnableslice_t]], errs : Ptr[CString], sorted_input : Boolean): Unit = extern

  /**
  */
  def rocksdb_block_based_options_create(): Ptr[rocksdb_block_based_table_options_t] = extern

  /**
  */
  def rocksdb_block_based_options_destroy(options : Ptr[rocksdb_block_based_table_options_t]): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_block_cache(options : Ptr[rocksdb_block_based_table_options_t], block_cache : Ptr[rocksdb_cache_t]): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_block_restart_interval(options : Ptr[rocksdb_block_based_table_options_t], block_restart_interval : CInt): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_block_size(options : Ptr[rocksdb_block_based_table_options_t], block_size : size_t): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_block_size_deviation(options : Ptr[rocksdb_block_based_table_options_t], block_size_deviation : CInt): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_cache_index_and_filter_blocks(_0 : Ptr[rocksdb_block_based_table_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_cache_index_and_filter_blocks_with_high_priority(_0 : Ptr[rocksdb_block_based_table_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_checksum(_0 : Ptr[rocksdb_block_based_table_options_t], _1 : CChar): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_data_block_hash_ratio(options : Ptr[rocksdb_block_based_table_options_t], v : Double): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_data_block_index_type(_0 : Ptr[rocksdb_block_based_table_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_filter_policy(options : Ptr[rocksdb_block_based_table_options_t], filter_policy : Ptr[rocksdb_filterpolicy_t]): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_format_version(_0 : Ptr[rocksdb_block_based_table_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_index_block_restart_interval(options : Ptr[rocksdb_block_based_table_options_t], index_block_restart_interval : CInt): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_index_type(_0 : Ptr[rocksdb_block_based_table_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_metadata_block_size(options : Ptr[rocksdb_block_based_table_options_t], metadata_block_size : uint64_t): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_no_block_cache(options : Ptr[rocksdb_block_based_table_options_t], no_block_cache : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_optimize_filters_for_memory(options : Ptr[rocksdb_block_based_table_options_t], optimize_filters_for_memory : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_partition_filters(options : Ptr[rocksdb_block_based_table_options_t], partition_filters : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_pin_l0_filter_and_index_blocks_in_cache(_0 : Ptr[rocksdb_block_based_table_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_pin_top_level_index_and_filter(_0 : Ptr[rocksdb_block_based_table_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_use_delta_encoding(options : Ptr[rocksdb_block_based_table_options_t], use_delta_encoding : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_block_based_options_set_whole_key_filtering(_0 : Ptr[rocksdb_block_based_table_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_cache_create_lru(capacity : size_t): Ptr[rocksdb_cache_t] = extern

  /**
  */
  def rocksdb_cache_create_lru_opts(_0 : Ptr[rocksdb_lru_cache_options_t]): Ptr[rocksdb_cache_t] = extern

  /**
  */
  def rocksdb_cache_create_lru_with_strict_capacity_limit(capacity : size_t): Ptr[rocksdb_cache_t] = extern

  /**
  */
  def rocksdb_cache_destroy(cache : Ptr[rocksdb_cache_t]): Unit = extern

  /**
  */
  def rocksdb_cache_disown_data(cache : Ptr[rocksdb_cache_t]): Unit = extern

  /**
  */
  def rocksdb_cache_get_capacity(cache : Ptr[rocksdb_cache_t]): size_t = extern

  /**
  */
  def rocksdb_cache_get_pinned_usage(cache : Ptr[rocksdb_cache_t]): size_t = extern

  /**
  */
  def rocksdb_cache_get_usage(cache : Ptr[rocksdb_cache_t]): size_t = extern

  /**
  */
  def rocksdb_cache_set_capacity(cache : Ptr[rocksdb_cache_t], capacity : size_t): Unit = extern

  /**
  */
  def rocksdb_cancel_all_background_work(db : Ptr[rocksdb_t], wait : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_checkpoint_create(checkpoint : Ptr[rocksdb_checkpoint_t], checkpoint_dir : CString, log_size_for_flush : uint64_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_checkpoint_object_create(db : Ptr[rocksdb_t], errptr : Ptr[CString]): Ptr[rocksdb_checkpoint_t] = extern

  /**
  */
  def rocksdb_checkpoint_object_destroy(checkpoint : Ptr[rocksdb_checkpoint_t]): Unit = extern

  /**
  */
  def rocksdb_close(db : Ptr[rocksdb_t]): Unit = extern

  /**
  */
  def rocksdb_column_family_handle_destroy(_0 : Ptr[rocksdb_column_family_handle_t]): Unit = extern

  /**
  */
  def rocksdb_column_family_handle_get_id(handle : Ptr[rocksdb_column_family_handle_t]): uint32_t = extern

  /**
  */
  def rocksdb_column_family_handle_get_name(handle : Ptr[rocksdb_column_family_handle_t], name_len : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_column_family_metadata_destroy(cf_meta : Ptr[rocksdb_column_family_metadata_t]): Unit = extern

  /**
  */
  def rocksdb_column_family_metadata_get_file_count(cf_meta : Ptr[rocksdb_column_family_metadata_t]): size_t = extern

  /**
  */
  def rocksdb_column_family_metadata_get_level_count(cf_meta : Ptr[rocksdb_column_family_metadata_t]): size_t = extern

  /**
   * Returns the rocksdb_level_metadata_t of the ith level from the specified column family metadata.
  */
  def rocksdb_column_family_metadata_get_level_metadata(cf_meta : Ptr[rocksdb_column_family_metadata_t], i : size_t): Ptr[rocksdb_level_metadata_t] = extern

  /**
  */
  def rocksdb_column_family_metadata_get_name(cf_meta : Ptr[rocksdb_column_family_metadata_t]): CString = extern

  /**
  */
  def rocksdb_column_family_metadata_get_size(cf_meta : Ptr[rocksdb_column_family_metadata_t]): uint64_t = extern

  /**
  */
  def rocksdb_compact_range(db : Ptr[rocksdb_t], start_key : CString, start_key_len : size_t, limit_key : CString, limit_key_len : size_t): Unit = extern

  /**
  */
  def rocksdb_compact_range_cf(db : Ptr[rocksdb_t], column_family : Ptr[rocksdb_column_family_handle_t], start_key : CString, start_key_len : size_t, limit_key : CString, limit_key_len : size_t): Unit = extern

  /**
  */
  def rocksdb_compact_range_cf_opt(db : Ptr[rocksdb_t], column_family : Ptr[rocksdb_column_family_handle_t], opt : Ptr[rocksdb_compactoptions_t], start_key : CString, start_key_len : size_t, limit_key : CString, limit_key_len : size_t): Unit = extern

  /**
  */
  def rocksdb_compact_range_opt(db : Ptr[rocksdb_t], opt : Ptr[rocksdb_compactoptions_t], start_key : CString, start_key_len : size_t, limit_key : CString, limit_key_len : size_t): Unit = extern

  /**
  */
  def rocksdb_compactionfilter_create(state : Ptr[Byte], destructor : CFuncPtr1[Ptr[Byte], Unit], filter : CFuncPtr9[Ptr[Byte], CInt, CString, size_t, CString, size_t, Ptr[CString], Ptr[size_t], Ptr[CUnsignedChar], CUnsignedChar], name : CFuncPtr1[Ptr[Byte], CString]): Ptr[rocksdb_compactionfilter_t] = extern

  /**
  */
  def rocksdb_compactionfilter_destroy(_0 : Ptr[rocksdb_compactionfilter_t]): Unit = extern

  /**
  */
  def rocksdb_compactionfilter_set_ignore_snapshots(_0 : Ptr[rocksdb_compactionfilter_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_compactionfiltercontext_is_full_compaction(context : Ptr[rocksdb_compactionfiltercontext_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_compactionfiltercontext_is_manual_compaction(context : Ptr[rocksdb_compactionfiltercontext_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_compactionfilterfactory_create(state : Ptr[Byte], destructor : CFuncPtr1[Ptr[Byte], Unit], create_compaction_filter : CFuncPtr2[Ptr[Byte], Ptr[rocksdb_compactionfiltercontext_t], Ptr[rocksdb_compactionfilter_t]], name : CFuncPtr1[Ptr[Byte], CString]): Ptr[rocksdb_compactionfilterfactory_t] = extern

  /**
  */
  def rocksdb_compactionfilterfactory_destroy(_0 : Ptr[rocksdb_compactionfilterfactory_t]): Unit = extern

  /**
  */
  def rocksdb_compactoptions_create(): Ptr[rocksdb_compactoptions_t] = extern

  /**
  */
  def rocksdb_compactoptions_destroy(_0 : Ptr[rocksdb_compactoptions_t]): Unit = extern

  /**
  */
  def rocksdb_compactoptions_get_bottommost_level_compaction(_0 : Ptr[rocksdb_compactoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_compactoptions_get_change_level(_0 : Ptr[rocksdb_compactoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_compactoptions_get_exclusive_manual_compaction(_0 : Ptr[rocksdb_compactoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_compactoptions_get_target_level(_0 : Ptr[rocksdb_compactoptions_t]): CInt = extern

  /**
  */
  def rocksdb_compactoptions_set_bottommost_level_compaction(_0 : Ptr[rocksdb_compactoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_compactoptions_set_change_level(_0 : Ptr[rocksdb_compactoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_compactoptions_set_exclusive_manual_compaction(_0 : Ptr[rocksdb_compactoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_compactoptions_set_full_history_ts_low(_0 : Ptr[rocksdb_compactoptions_t], ts : CString, tslen : size_t): Unit = extern

  /**
  */
  def rocksdb_compactoptions_set_target_level(_0 : Ptr[rocksdb_compactoptions_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_comparator_create(state : Ptr[Byte], destructor : CFuncPtr1[Ptr[Byte], Unit], compare : CFuncPtr5[Ptr[Byte], CString, size_t, CString, size_t, CInt], name : CFuncPtr1[Ptr[Byte], CString]): Ptr[rocksdb_comparator_t] = extern

  /**
  */
  def rocksdb_comparator_destroy(_0 : Ptr[rocksdb_comparator_t]): Unit = extern

  /**
  */
  def rocksdb_comparator_with_ts_create(state : Ptr[Byte], destructor : CFuncPtr1[Ptr[Byte], Unit], compare : CFuncPtr5[Ptr[Byte], CString, size_t, CString, size_t, CInt], compare_ts : CFuncPtr5[Ptr[Byte], CString, size_t, CString, size_t, CInt], compare_without_ts : CFuncPtr7[Ptr[Byte], CString, size_t, CUnsignedChar, CString, size_t, CUnsignedChar, CInt], name : CFuncPtr1[Ptr[Byte], CString], timestamp_size : size_t): Ptr[rocksdb_comparator_t] = extern

  /**
  */
  def rocksdb_create_column_family(db : Ptr[rocksdb_t], column_family_options : Ptr[rocksdb_options_t], column_family_name : CString, errptr : Ptr[CString]): Ptr[rocksdb_column_family_handle_t] = extern

  /**
  */
  def rocksdb_create_column_family_with_ttl(db : Ptr[rocksdb_t], column_family_options : Ptr[rocksdb_options_t], column_family_name : CString, ttl : CInt, errptr : Ptr[CString]): Ptr[rocksdb_column_family_handle_t] = extern

  /**
  */
  def rocksdb_create_default_env(): Ptr[rocksdb_env_t] = extern

  /**
  */
  def rocksdb_create_dir_if_missing(env : Ptr[rocksdb_env_t], path : CString, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_create_iterator(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t]): Ptr[rocksdb_iterator_t] = extern

  /**
  */
  def rocksdb_create_iterator_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t]): Ptr[rocksdb_iterator_t] = extern

  /**
  */
  def rocksdb_create_iterators(db : Ptr[rocksdb_t], opts : Ptr[rocksdb_readoptions_t], column_families : Ptr[Ptr[rocksdb_column_family_handle_t]], iterators : Ptr[Ptr[rocksdb_iterator_t]], size : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_create_mem_env(): Ptr[rocksdb_env_t] = extern

  /**
  */
  def rocksdb_create_snapshot(db : Ptr[rocksdb_t]): Ptr[rocksdb_snapshot_t] = extern

  /**
  */
  def rocksdb_cuckoo_options_create(): Ptr[rocksdb_cuckoo_table_options_t] = extern

  /**
  */
  def rocksdb_cuckoo_options_destroy(options : Ptr[rocksdb_cuckoo_table_options_t]): Unit = extern

  /**
  */
  def rocksdb_cuckoo_options_set_cuckoo_block_size(options : Ptr[rocksdb_cuckoo_table_options_t], v : uint32_t): Unit = extern

  /**
  */
  def rocksdb_cuckoo_options_set_hash_ratio(options : Ptr[rocksdb_cuckoo_table_options_t], v : Double): Unit = extern

  /**
  */
  def rocksdb_cuckoo_options_set_identity_as_first_hash(options : Ptr[rocksdb_cuckoo_table_options_t], v : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_cuckoo_options_set_max_search_depth(options : Ptr[rocksdb_cuckoo_table_options_t], v : uint32_t): Unit = extern

  /**
  */
  def rocksdb_cuckoo_options_set_use_module_hash(options : Ptr[rocksdb_cuckoo_table_options_t], v : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_dbpath_create(path : CString, target_size : uint64_t): Ptr[rocksdb_dbpath_t] = extern

  /**
  */
  def rocksdb_dbpath_destroy(_0 : Ptr[rocksdb_dbpath_t]): Unit = extern

  /**
  */
  def rocksdb_delete(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], key : CString, keylen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_delete_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_delete_cf_with_ts(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, ts : CString, tslen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_delete_file(db : Ptr[rocksdb_t], name : CString): Unit = extern

  /**
  */
  def rocksdb_delete_file_in_range(db : Ptr[rocksdb_t], start_key : CString, start_key_len : size_t, limit_key : CString, limit_key_len : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_delete_file_in_range_cf(db : Ptr[rocksdb_t], column_family : Ptr[rocksdb_column_family_handle_t], start_key : CString, start_key_len : size_t, limit_key : CString, limit_key_len : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_delete_range_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], start_key : CString, start_key_len : size_t, end_key : CString, end_key_len : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_delete_with_ts(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], key : CString, keylen : size_t, ts : CString, tslen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_destroy_db(options : Ptr[rocksdb_options_t], name : CString, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_disable_file_deletions(db : Ptr[rocksdb_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_disable_manual_compaction(db : Ptr[rocksdb_t]): Unit = extern

  /**
  */
  def rocksdb_drop_column_family(db : Ptr[rocksdb_t], handle : Ptr[rocksdb_column_family_handle_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_enable_file_deletions(db : Ptr[rocksdb_t], force : CUnsignedChar, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_enable_manual_compaction(db : Ptr[rocksdb_t]): Unit = extern

  /**
  */
  def rocksdb_env_destroy(_0 : Ptr[rocksdb_env_t]): Unit = extern

  /**
  */
  def rocksdb_env_get_background_threads(env : Ptr[rocksdb_env_t]): CInt = extern

  /**
  */
  def rocksdb_env_get_bottom_priority_background_threads(env : Ptr[rocksdb_env_t]): CInt = extern

  /**
  */
  def rocksdb_env_get_high_priority_background_threads(env : Ptr[rocksdb_env_t]): CInt = extern

  /**
  */
  def rocksdb_env_get_low_priority_background_threads(env : Ptr[rocksdb_env_t]): CInt = extern

  /**
  */
  def rocksdb_env_join_all_threads(env : Ptr[rocksdb_env_t]): Unit = extern

  /**
  */
  def rocksdb_env_lower_high_priority_thread_pool_cpu_priority(env : Ptr[rocksdb_env_t]): Unit = extern

  /**
  */
  def rocksdb_env_lower_high_priority_thread_pool_io_priority(env : Ptr[rocksdb_env_t]): Unit = extern

  /**
  */
  def rocksdb_env_lower_thread_pool_cpu_priority(env : Ptr[rocksdb_env_t]): Unit = extern

  /**
  */
  def rocksdb_env_lower_thread_pool_io_priority(env : Ptr[rocksdb_env_t]): Unit = extern

  /**
  */
  def rocksdb_env_set_background_threads(env : Ptr[rocksdb_env_t], n : CInt): Unit = extern

  /**
  */
  def rocksdb_env_set_bottom_priority_background_threads(env : Ptr[rocksdb_env_t], n : CInt): Unit = extern

  /**
  */
  def rocksdb_env_set_high_priority_background_threads(env : Ptr[rocksdb_env_t], n : CInt): Unit = extern

  /**
  */
  def rocksdb_env_set_low_priority_background_threads(env : Ptr[rocksdb_env_t], n : CInt): Unit = extern

  /**
  */
  def rocksdb_envoptions_create(): Ptr[rocksdb_envoptions_t] = extern

  /**
  */
  def rocksdb_envoptions_destroy(opt : Ptr[rocksdb_envoptions_t]): Unit = extern

  /**
  */
  def rocksdb_fifo_compaction_options_create(): Ptr[rocksdb_fifo_compaction_options_t] = extern

  /**
  */
  def rocksdb_fifo_compaction_options_destroy(fifo_opts : Ptr[rocksdb_fifo_compaction_options_t]): Unit = extern

  /**
  */
  def rocksdb_fifo_compaction_options_get_max_table_files_size(fifo_opts : Ptr[rocksdb_fifo_compaction_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_fifo_compaction_options_set_max_table_files_size(fifo_opts : Ptr[rocksdb_fifo_compaction_options_t], size : uint64_t): Unit = extern

  /**
  */
  def rocksdb_filterpolicy_create_bloom(bits_per_key : Double): Ptr[rocksdb_filterpolicy_t] = extern

  /**
  */
  def rocksdb_filterpolicy_create_bloom_full(bits_per_key : Double): Ptr[rocksdb_filterpolicy_t] = extern

  /**
  */
  def rocksdb_filterpolicy_create_ribbon(bloom_equivalent_bits_per_key : Double): Ptr[rocksdb_filterpolicy_t] = extern

  /**
  */
  def rocksdb_filterpolicy_create_ribbon_hybrid(bloom_equivalent_bits_per_key : Double, bloom_before_level : CInt): Ptr[rocksdb_filterpolicy_t] = extern

  /**
  */
  def rocksdb_filterpolicy_destroy(_0 : Ptr[rocksdb_filterpolicy_t]): Unit = extern

  /**
  */
  def rocksdb_flush(db : Ptr[rocksdb_t], options : Ptr[rocksdb_flushoptions_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_flush_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_flushoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_flush_wal(db : Ptr[rocksdb_t], sync : CUnsignedChar, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_flushoptions_create(): Ptr[rocksdb_flushoptions_t] = extern

  /**
  */
  def rocksdb_flushoptions_destroy(_0 : Ptr[rocksdb_flushoptions_t]): Unit = extern

  /**
  */
  def rocksdb_flushoptions_get_wait(_0 : Ptr[rocksdb_flushoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_flushoptions_set_wait(_0 : Ptr[rocksdb_flushoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_free(ptr : Ptr[Byte]): Unit = extern

  /**
  */
  def rocksdb_get(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], key : CString, keylen : size_t, vallen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_get_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, vallen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_get_cf_with_ts(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, vallen : Ptr[size_t], ts : Ptr[CString], tslen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_get_column_family_metadata(db : Ptr[rocksdb_t]): Ptr[rocksdb_column_family_metadata_t] = extern

  /**
   * Returns the rocksdb_column_family_metadata_t of the specified column family.
  */
  def rocksdb_get_column_family_metadata_cf(db : Ptr[rocksdb_t], column_family : Ptr[rocksdb_column_family_handle_t]): Ptr[rocksdb_column_family_metadata_t] = extern

  /**
  */
  def rocksdb_get_full_history_ts_low(db : Ptr[rocksdb_t], column_family : Ptr[rocksdb_column_family_handle_t], ts_lowlen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_get_latest_sequence_number(db : Ptr[rocksdb_t]): uint64_t = extern

  /**
  */
  def rocksdb_get_options_from_string(base_options : Ptr[rocksdb_options_t], opts_str : CString, new_options : Ptr[rocksdb_options_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_get_pinned(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], key : CString, keylen : size_t, errptr : Ptr[CString]): Ptr[rocksdb_pinnableslice_t] = extern

  /**
  */
  def rocksdb_get_pinned_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, errptr : Ptr[CString]): Ptr[rocksdb_pinnableslice_t] = extern

  /**
  */
  def rocksdb_get_updates_since(db : Ptr[rocksdb_t], seq_number : uint64_t, options : Ptr[rocksdb_wal_readoptions_t], errptr : Ptr[CString]): Ptr[rocksdb_wal_iterator_t] = extern

  /**
  */
  def rocksdb_get_with_ts(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], key : CString, keylen : size_t, vallen : Ptr[size_t], ts : Ptr[CString], tslen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_increase_full_history_ts_low(db : Ptr[rocksdb_t], column_family : Ptr[rocksdb_column_family_handle_t], ts_low : CString, ts_lowlen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_ingest_external_file(db : Ptr[rocksdb_t], file_list : Ptr[CString], list_len : size_t, opt : Ptr[rocksdb_ingestexternalfileoptions_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_ingest_external_file_cf(db : Ptr[rocksdb_t], handle : Ptr[rocksdb_column_family_handle_t], file_list : Ptr[CString], list_len : size_t, opt : Ptr[rocksdb_ingestexternalfileoptions_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_ingestexternalfileoptions_create(): Ptr[rocksdb_ingestexternalfileoptions_t] = extern

  /**
  */
  def rocksdb_ingestexternalfileoptions_destroy(opt : Ptr[rocksdb_ingestexternalfileoptions_t]): Unit = extern

  /**
  */
  def rocksdb_ingestexternalfileoptions_set_allow_blocking_flush(opt : Ptr[rocksdb_ingestexternalfileoptions_t], allow_blocking_flush : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_ingestexternalfileoptions_set_allow_global_seqno(opt : Ptr[rocksdb_ingestexternalfileoptions_t], allow_global_seqno : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_ingestexternalfileoptions_set_ingest_behind(opt : Ptr[rocksdb_ingestexternalfileoptions_t], ingest_behind : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_ingestexternalfileoptions_set_move_files(opt : Ptr[rocksdb_ingestexternalfileoptions_t], move_files : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_ingestexternalfileoptions_set_snapshot_consistency(opt : Ptr[rocksdb_ingestexternalfileoptions_t], snapshot_consistency : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_iter_destroy(_0 : Ptr[rocksdb_iterator_t]): Unit = extern

  /**
  */
  def rocksdb_iter_get_error(_0 : Ptr[rocksdb_iterator_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_iter_key(_0 : Ptr[rocksdb_iterator_t], klen : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_iter_next(_0 : Ptr[rocksdb_iterator_t]): Unit = extern

  /**
  */
  def rocksdb_iter_prev(_0 : Ptr[rocksdb_iterator_t]): Unit = extern

  /**
  */
  def rocksdb_iter_seek(_0 : Ptr[rocksdb_iterator_t], k : CString, klen : size_t): Unit = extern

  /**
  */
  def rocksdb_iter_seek_for_prev(_0 : Ptr[rocksdb_iterator_t], k : CString, klen : size_t): Unit = extern

  /**
  */
  def rocksdb_iter_seek_to_first(_0 : Ptr[rocksdb_iterator_t]): Unit = extern

  /**
  */
  def rocksdb_iter_seek_to_last(_0 : Ptr[rocksdb_iterator_t]): Unit = extern

  /**
  */
  def rocksdb_iter_timestamp(_0 : Ptr[rocksdb_iterator_t], tslen : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_iter_valid(_0 : Ptr[rocksdb_iterator_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_iter_value(_0 : Ptr[rocksdb_iterator_t], vlen : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_jemalloc_nodump_allocator_create(errptr : Ptr[CString]): Ptr[rocksdb_memory_allocator_t] = extern

  /**
  */
  def rocksdb_key_may_exist(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], key : CString, key_len : size_t, value : Ptr[CString], val_len : Ptr[size_t], timestamp : CString, timestamp_len : size_t, value_found : Ptr[CUnsignedChar]): CUnsignedChar = extern

  /**
  */
  def rocksdb_key_may_exist_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, key_len : size_t, value : Ptr[CString], val_len : Ptr[size_t], timestamp : CString, timestamp_len : size_t, value_found : Ptr[CUnsignedChar]): CUnsignedChar = extern

  /**
   * Releases the specified rocksdb_level_metadata_t.
  */
  def rocksdb_level_metadata_destroy(level_meta : Ptr[rocksdb_level_metadata_t]): Unit = extern

  /**
  */
  def rocksdb_level_metadata_get_file_count(level_meta : Ptr[rocksdb_level_metadata_t]): size_t = extern

  /**
  */
  def rocksdb_level_metadata_get_level(level_meta : Ptr[rocksdb_level_metadata_t]): CInt = extern

  /**
  */
  def rocksdb_level_metadata_get_size(level_meta : Ptr[rocksdb_level_metadata_t]): uint64_t = extern

  /**
   * Returns the sst_file_metadata_t of the ith file from the specified level metadata.
  */
  def rocksdb_level_metadata_get_sst_file_metadata(level_meta : Ptr[rocksdb_level_metadata_t], i : size_t): Ptr[rocksdb_sst_file_metadata_t] = extern

  /**
  */
  def rocksdb_list_column_families(options : Ptr[rocksdb_options_t], name : CString, lencf : Ptr[size_t], errptr : Ptr[CString]): Ptr[CString] = extern

  /**
  */
  def rocksdb_list_column_families_destroy(list : Ptr[CString], len : size_t): Unit = extern

  /**
  */
  def rocksdb_livefiles(db : Ptr[rocksdb_t]): Ptr[rocksdb_livefiles_t] = extern

  /**
  */
  def rocksdb_livefiles_column_family_name(_0 : Ptr[rocksdb_livefiles_t], index : CInt): CString = extern

  /**
  */
  def rocksdb_livefiles_count(_0 : Ptr[rocksdb_livefiles_t]): CInt = extern

  /**
  */
  def rocksdb_livefiles_deletions(_0 : Ptr[rocksdb_livefiles_t], index : CInt): uint64_t = extern

  /**
  */
  def rocksdb_livefiles_destroy(_0 : Ptr[rocksdb_livefiles_t]): Unit = extern

  /**
  */
  def rocksdb_livefiles_entries(_0 : Ptr[rocksdb_livefiles_t], index : CInt): uint64_t = extern

  /**
  */
  def rocksdb_livefiles_largestkey(_0 : Ptr[rocksdb_livefiles_t], index : CInt, size : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_livefiles_level(_0 : Ptr[rocksdb_livefiles_t], index : CInt): CInt = extern

  /**
  */
  def rocksdb_livefiles_name(_0 : Ptr[rocksdb_livefiles_t], index : CInt): CString = extern

  /**
  */
  def rocksdb_livefiles_size(_0 : Ptr[rocksdb_livefiles_t], index : CInt): size_t = extern

  /**
  */
  def rocksdb_livefiles_smallestkey(_0 : Ptr[rocksdb_livefiles_t], index : CInt, size : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_load_latest_options(db_path : CString, env : Ptr[rocksdb_env_t], ignore_unknown_options : Boolean, cache : Ptr[rocksdb_cache_t], db_options : Ptr[Ptr[rocksdb_options_t]], num_column_families : Ptr[size_t], column_family_names : Ptr[Ptr[CString]], column_family_options : Ptr[Ptr[Ptr[rocksdb_options_t]]], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_load_latest_options_destroy(db_options : Ptr[rocksdb_options_t], list_column_family_names : Ptr[CString], list_column_family_options : Ptr[Ptr[rocksdb_options_t]], len : size_t): Unit = extern

  /**
  */
  def rocksdb_lru_cache_options_create(): Ptr[rocksdb_lru_cache_options_t] = extern

  /**
  */
  def rocksdb_lru_cache_options_destroy(_0 : Ptr[rocksdb_lru_cache_options_t]): Unit = extern

  /**
  */
  def rocksdb_lru_cache_options_set_capacity(_0 : Ptr[rocksdb_lru_cache_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_lru_cache_options_set_memory_allocator(_0 : Ptr[rocksdb_lru_cache_options_t], _1 : Ptr[rocksdb_memory_allocator_t]): Unit = extern

  /**
  */
  def rocksdb_lru_cache_options_set_num_shard_bits(_0 : Ptr[rocksdb_lru_cache_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_memory_allocator_destroy(_0 : Ptr[rocksdb_memory_allocator_t]): Unit = extern

  /**
  */
  def rocksdb_memory_consumers_add_cache(consumers : Ptr[rocksdb_memory_consumers_t], cache : Ptr[rocksdb_cache_t]): Unit = extern

  /**
  */
  def rocksdb_memory_consumers_add_db(consumers : Ptr[rocksdb_memory_consumers_t], db : Ptr[rocksdb_t]): Unit = extern

  /**
  */
  def rocksdb_memory_consumers_create(): Ptr[rocksdb_memory_consumers_t] = extern

  /**
  */
  def rocksdb_memory_consumers_destroy(consumers : Ptr[rocksdb_memory_consumers_t]): Unit = extern

  /**
  */
  def rocksdb_merge(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], key : CString, keylen : size_t, `val` : CString, vallen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_merge_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, `val` : CString, vallen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_mergeoperator_create(state : Ptr[Byte], destructor : CFuncPtr1[Ptr[Byte], Unit], full_merge : CFuncPtr10[Ptr[Byte], CString, size_t, CString, size_t, Ptr[CString], Ptr[size_t], CInt, Ptr[CUnsignedChar], Ptr[size_t], CString], partial_merge : CFuncPtr8[Ptr[Byte], CString, size_t, Ptr[CString], Ptr[size_t], CInt, Ptr[CUnsignedChar], Ptr[size_t], CString], delete_value : CFuncPtr3[Ptr[Byte], CString, size_t, Unit], name : CFuncPtr1[Ptr[Byte], CString]): Ptr[rocksdb_mergeoperator_t] = extern

  /**
  */
  def rocksdb_mergeoperator_destroy(_0 : Ptr[rocksdb_mergeoperator_t]): Unit = extern

  /**
  */
  def rocksdb_multi_get(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], num_keys : size_t, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], values_list : Ptr[CString], values_list_sizes : Ptr[size_t], errs : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_multi_get_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], column_families : Ptr[Ptr[rocksdb_column_family_handle_t]], num_keys : size_t, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], values_list : Ptr[CString], values_list_sizes : Ptr[size_t], errs : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_multi_get_cf_with_ts(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], column_families : Ptr[Ptr[rocksdb_column_family_handle_t]], num_keys : size_t, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], values_list : Ptr[CString], values_list_sizes : Ptr[size_t], timestamps_list : Ptr[CString], timestamps_list_sizes : Ptr[size_t], errs : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_multi_get_with_ts(db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], num_keys : size_t, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], values_list : Ptr[CString], values_list_sizes : Ptr[size_t], timestamp_list : Ptr[CString], timestamp_list_sizes : Ptr[size_t], errs : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_open(options : Ptr[rocksdb_options_t], name : CString, errptr : Ptr[CString]): Ptr[rocksdb_t] = extern

  /**
  */
  def rocksdb_open_and_trim_history(options : Ptr[rocksdb_options_t], name : CString, num_column_families : CInt, column_family_names : Ptr[CString], column_family_options : Ptr[Ptr[rocksdb_options_t]], column_family_handles : Ptr[Ptr[rocksdb_column_family_handle_t]], trim_ts : CString, trim_tslen : size_t, errptr : Ptr[CString]): Ptr[rocksdb_t] = extern

  /**
  */
  def rocksdb_open_as_secondary(options : Ptr[rocksdb_options_t], name : CString, secondary_path : CString, errptr : Ptr[CString]): Ptr[rocksdb_t] = extern

  /**
  */
  def rocksdb_open_as_secondary_column_families(options : Ptr[rocksdb_options_t], name : CString, secondary_path : CString, num_column_families : CInt, column_family_names : Ptr[CString], column_family_options : Ptr[Ptr[rocksdb_options_t]], column_family_handles : Ptr[Ptr[rocksdb_column_family_handle_t]], errptr : Ptr[CString]): Ptr[rocksdb_t] = extern

  /**
  */
  def rocksdb_open_column_families(options : Ptr[rocksdb_options_t], name : CString, num_column_families : CInt, column_family_names : Ptr[CString], column_family_options : Ptr[Ptr[rocksdb_options_t]], column_family_handles : Ptr[Ptr[rocksdb_column_family_handle_t]], errptr : Ptr[CString]): Ptr[rocksdb_t] = extern

  /**
  */
  def rocksdb_open_column_families_with_ttl(options : Ptr[rocksdb_options_t], name : CString, num_column_families : CInt, column_family_names : Ptr[CString], column_family_options : Ptr[Ptr[rocksdb_options_t]], column_family_handles : Ptr[Ptr[rocksdb_column_family_handle_t]], ttls : Ptr[CInt], errptr : Ptr[CString]): Ptr[rocksdb_t] = extern

  /**
  */
  def rocksdb_open_for_read_only(options : Ptr[rocksdb_options_t], name : CString, error_if_wal_file_exists : CUnsignedChar, errptr : Ptr[CString]): Ptr[rocksdb_t] = extern

  /**
  */
  def rocksdb_open_for_read_only_column_families(options : Ptr[rocksdb_options_t], name : CString, num_column_families : CInt, column_family_names : Ptr[CString], column_family_options : Ptr[Ptr[rocksdb_options_t]], column_family_handles : Ptr[Ptr[rocksdb_column_family_handle_t]], error_if_wal_file_exists : CUnsignedChar, errptr : Ptr[CString]): Ptr[rocksdb_t] = extern

  /**
  */
  def rocksdb_open_with_ttl(options : Ptr[rocksdb_options_t], name : CString, ttl : CInt, errptr : Ptr[CString]): Ptr[rocksdb_t] = extern

  /**
  */
  def rocksdb_optimistictransaction_begin(otxn_db : Ptr[rocksdb_optimistictransactiondb_t], write_options : Ptr[rocksdb_writeoptions_t], otxn_options : Ptr[rocksdb_optimistictransaction_options_t], old_txn : Ptr[rocksdb_transaction_t]): Ptr[rocksdb_transaction_t] = extern

  /**
  */
  def rocksdb_optimistictransaction_options_create(): Ptr[rocksdb_optimistictransaction_options_t] = extern

  /**
  */
  def rocksdb_optimistictransaction_options_destroy(opt : Ptr[rocksdb_optimistictransaction_options_t]): Unit = extern

  /**
  */
  def rocksdb_optimistictransaction_options_set_set_snapshot(opt : Ptr[rocksdb_optimistictransaction_options_t], v : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_optimistictransactiondb_checkpoint_object_create(otxn_db : Ptr[rocksdb_optimistictransactiondb_t], errptr : Ptr[CString]): Ptr[rocksdb_checkpoint_t] = extern

  /**
  */
  def rocksdb_optimistictransactiondb_close(otxn_db : Ptr[rocksdb_optimistictransactiondb_t]): Unit = extern

  /**
  */
  def rocksdb_optimistictransactiondb_close_base_db(base_db : Ptr[rocksdb_t]): Unit = extern

  /**
  */
  def rocksdb_optimistictransactiondb_get_base_db(otxn_db : Ptr[rocksdb_optimistictransactiondb_t]): Ptr[rocksdb_t] = extern

  /**
  */
  def rocksdb_optimistictransactiondb_open(options : Ptr[rocksdb_options_t], name : CString, errptr : Ptr[CString]): Ptr[rocksdb_optimistictransactiondb_t] = extern

  /**
  */
  def rocksdb_optimistictransactiondb_open_column_families(options : Ptr[rocksdb_options_t], name : CString, num_column_families : CInt, column_family_names : Ptr[CString], column_family_options : Ptr[Ptr[rocksdb_options_t]], column_family_handles : Ptr[Ptr[rocksdb_column_family_handle_t]], errptr : Ptr[CString]): Ptr[rocksdb_optimistictransactiondb_t] = extern

  /**
  */
  def rocksdb_optimistictransactiondb_property_int(db : Ptr[rocksdb_optimistictransactiondb_t], propname : CString, out_val : Ptr[uint64_t]): CInt = extern

  /**
  */
  def rocksdb_optimistictransactiondb_property_value(db : Ptr[rocksdb_optimistictransactiondb_t], propname : CString): CString = extern

  /**
  */
  def rocksdb_optimistictransactiondb_write(otxn_db : Ptr[rocksdb_optimistictransactiondb_t], options : Ptr[rocksdb_writeoptions_t], batch : Ptr[rocksdb_writebatch_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_options_add_compact_on_deletion_collector_factory(_0 : Ptr[rocksdb_options_t], window_size : size_t, num_dels_trigger : size_t): Unit = extern

  /**
  */
  def rocksdb_options_compaction_readahead_size(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_create(): Ptr[rocksdb_options_t] = extern

  /**
  */
  def rocksdb_options_create_copy(_0 : Ptr[rocksdb_options_t]): Ptr[rocksdb_options_t] = extern

  /**
  */
  def rocksdb_options_destroy(_0 : Ptr[rocksdb_options_t]): Unit = extern

  /**
  */
  def rocksdb_options_enable_statistics(_0 : Ptr[rocksdb_options_t]): Unit = extern

  /**
  */
  def rocksdb_options_get_WAL_size_limit_MB(_0 : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_WAL_ttl_seconds(_0 : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_access_hint_on_compaction_start(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_advise_random_on_open(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_allow_concurrent_memtable_write(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_allow_ingest_behind(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_allow_mmap_reads(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_allow_mmap_writes(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_arena_block_size(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_atomic_flush(opt : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_avoid_unnecessary_blocking_io(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_blob_compaction_readahead_size(opt : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_blob_compression_type(opt : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_blob_file_size(opt : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_blob_file_starting_level(opt : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_blob_gc_age_cutoff(opt : Ptr[rocksdb_options_t]): Double = extern

  /**
  */
  def rocksdb_options_get_blob_gc_force_threshold(opt : Ptr[rocksdb_options_t]): Double = extern

  /**
  */
  def rocksdb_options_get_bloom_locality(_0 : Ptr[rocksdb_options_t]): uint32_t = extern

  /**
  */
  def rocksdb_options_get_bottommost_compression(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_bottommost_compression_options_use_zstd_dict_trainer(opt : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_bytes_per_sync(_0 : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_compaction_readahead_size(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_compaction_style(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_compression(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_compression_options_max_dict_buffer_bytes(opt : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_compression_options_parallel_threads(opt : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_compression_options_use_zstd_dict_trainer(opt : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_compression_options_zstd_max_train_bytes(opt : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_create_if_missing(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_create_missing_column_families(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_db_write_buffer_size(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_delete_obsolete_files_period_micros(_0 : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_disable_auto_compactions(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_enable_blob_files(opt : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_enable_blob_gc(opt : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_enable_pipelined_write(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_enable_write_thread_adaptive_yield(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_error_if_exists(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_experimental_mempurge_threshold(_0 : Ptr[rocksdb_options_t]): Double = extern

  /**
  */
  def rocksdb_options_get_hard_pending_compaction_bytes_limit(opt : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_info_log_level(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_inplace_update_num_locks(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_inplace_update_support(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_is_fd_close_on_exec(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_keep_log_file_num(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_level0_file_num_compaction_trigger(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_level0_slowdown_writes_trigger(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_level0_stop_writes_trigger(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_level_compaction_dynamic_level_bytes(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_log_file_time_to_roll(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_manifest_preallocation_size(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_manual_wal_flush(opt : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_max_background_compactions(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_max_background_flushes(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_max_background_jobs(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_max_bytes_for_level_base(_0 : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_max_bytes_for_level_multiplier(_0 : Ptr[rocksdb_options_t]): Double = extern

  /**
  */
  def rocksdb_options_get_max_compaction_bytes(_0 : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_max_file_opening_threads(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_max_log_file_size(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_max_manifest_file_size(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_max_open_files(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_max_sequential_skip_in_iterations(_0 : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_max_subcompactions(_0 : Ptr[rocksdb_options_t]): uint32_t = extern

  /**
  */
  def rocksdb_options_get_max_successive_merges(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_max_total_wal_size(opt : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_max_write_buffer_number(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_max_write_buffer_number_to_maintain(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_max_write_buffer_size_to_maintain(_0 : Ptr[rocksdb_options_t]): int64_t = extern

  /**
  */
  def rocksdb_options_get_memtable_huge_page_size(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_memtable_prefix_bloom_size_ratio(_0 : Ptr[rocksdb_options_t]): Double = extern

  /**
  */
  def rocksdb_options_get_min_blob_size(opt : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_min_write_buffer_number_to_merge(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_num_levels(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_optimize_filters_for_hits(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_paranoid_checks(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_prepopulate_blob_cache(opt : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_recycle_log_file_num(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_report_bg_io_stats(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_skip_checking_sst_file_sizes_on_db_open(opt : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_skip_stats_update_on_db_open(opt : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_soft_pending_compaction_bytes_limit(opt : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_get_stats_dump_period_sec(_0 : Ptr[rocksdb_options_t]): CUnsignedInt = extern

  /**
  */
  def rocksdb_options_get_stats_persist_period_sec(_0 : Ptr[rocksdb_options_t]): CUnsignedInt = extern

  /**
  */
  def rocksdb_options_get_table_cache_numshardbits(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_target_file_size_base(_0 : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_target_file_size_multiplier(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_unordered_write(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_use_adaptive_mutex(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_use_direct_io_for_flush_and_compaction(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_use_direct_reads(_0 : Ptr[rocksdb_options_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_options_get_use_fsync(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_wal_bytes_per_sync(_0 : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_wal_compression(opt : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_wal_recovery_mode(_0 : Ptr[rocksdb_options_t]): CInt = extern

  /**
  */
  def rocksdb_options_get_writable_file_max_buffer_size(_0 : Ptr[rocksdb_options_t]): uint64_t = extern

  /**
  */
  def rocksdb_options_get_write_buffer_size(_0 : Ptr[rocksdb_options_t]): size_t = extern

  /**
  */
  def rocksdb_options_increase_parallelism(opt : Ptr[rocksdb_options_t], total_threads : CInt): Unit = extern

  /**
  */
  def rocksdb_options_optimize_for_point_lookup(opt : Ptr[rocksdb_options_t], block_cache_size_mb : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_optimize_level_style_compaction(opt : Ptr[rocksdb_options_t], memtable_memory_budget : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_optimize_universal_style_compaction(opt : Ptr[rocksdb_options_t], memtable_memory_budget : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_prepare_for_bulk_load(_0 : Ptr[rocksdb_options_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_WAL_size_limit_MB(_0 : Ptr[rocksdb_options_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_WAL_ttl_seconds(_0 : Ptr[rocksdb_options_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_access_hint_on_compaction_start(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_advise_random_on_open(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_allow_concurrent_memtable_write(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_allow_ingest_behind(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_allow_mmap_reads(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_allow_mmap_writes(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_arena_block_size(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_atomic_flush(opt : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_avoid_unnecessary_blocking_io(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_blob_cache(opt : Ptr[rocksdb_options_t], blob_cache : Ptr[rocksdb_cache_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_blob_compaction_readahead_size(opt : Ptr[rocksdb_options_t], `val` : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_blob_compression_type(opt : Ptr[rocksdb_options_t], `val` : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_blob_file_size(opt : Ptr[rocksdb_options_t], `val` : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_blob_file_starting_level(opt : Ptr[rocksdb_options_t], `val` : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_blob_gc_age_cutoff(opt : Ptr[rocksdb_options_t], `val` : Double): Unit = extern

  /**
  */
  def rocksdb_options_set_blob_gc_force_threshold(opt : Ptr[rocksdb_options_t], `val` : Double): Unit = extern

  /**
  */
  def rocksdb_options_set_block_based_table_factory(opt : Ptr[rocksdb_options_t], table_options : Ptr[rocksdb_block_based_table_options_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_bloom_locality(_0 : Ptr[rocksdb_options_t], _1 : uint32_t): Unit = extern

  /**
  */
  def rocksdb_options_set_bottommost_compression(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_bottommost_compression_options(_0 : Ptr[rocksdb_options_t], _1 : CInt, _2 : CInt, _3 : CInt, _4 : CInt, _5 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_bottommost_compression_options_max_dict_buffer_bytes(_0 : Ptr[rocksdb_options_t], _1 : uint64_t, _2 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_bottommost_compression_options_use_zstd_dict_trainer(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar, _2 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_bottommost_compression_options_zstd_max_train_bytes(_0 : Ptr[rocksdb_options_t], _1 : CInt, _2 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_bytes_per_sync(_0 : Ptr[rocksdb_options_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_compaction_filter(_0 : Ptr[rocksdb_options_t], _1 : Ptr[rocksdb_compactionfilter_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_compaction_filter_factory(_0 : Ptr[rocksdb_options_t], _1 : Ptr[rocksdb_compactionfilterfactory_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_compaction_style(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_comparator(_0 : Ptr[rocksdb_options_t], _1 : Ptr[rocksdb_comparator_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_compression(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_compression_options(_0 : Ptr[rocksdb_options_t], _1 : CInt, _2 : CInt, _3 : CInt, _4 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_compression_options_max_dict_buffer_bytes(_0 : Ptr[rocksdb_options_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_compression_options_parallel_threads(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_compression_options_use_zstd_dict_trainer(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_compression_options_zstd_max_train_bytes(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_compression_per_level(opt : Ptr[rocksdb_options_t], level_values : Ptr[CInt], num_levels : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_create_if_missing(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_create_missing_column_families(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_cuckoo_table_factory(opt : Ptr[rocksdb_options_t], table_options : Ptr[rocksdb_cuckoo_table_options_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_db_log_dir(_0 : Ptr[rocksdb_options_t], _1 : CString): Unit = extern

  /**
  */
  def rocksdb_options_set_db_paths(_0 : Ptr[rocksdb_options_t], path_values : Ptr[Ptr[rocksdb_dbpath_t]], num_paths : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_db_write_buffer_size(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_delete_obsolete_files_period_micros(_0 : Ptr[rocksdb_options_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_disable_auto_compactions(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_dump_malloc_stats(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_enable_blob_files(opt : Ptr[rocksdb_options_t], `val` : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_enable_blob_gc(opt : Ptr[rocksdb_options_t], `val` : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_enable_pipelined_write(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_enable_write_thread_adaptive_yield(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_env(_0 : Ptr[rocksdb_options_t], _1 : Ptr[rocksdb_env_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_error_if_exists(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_experimental_mempurge_threshold(_0 : Ptr[rocksdb_options_t], _1 : Double): Unit = extern

  /**
  */
  def rocksdb_options_set_fifo_compaction_options(opt : Ptr[rocksdb_options_t], fifo : Ptr[rocksdb_fifo_compaction_options_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_hard_pending_compaction_bytes_limit(opt : Ptr[rocksdb_options_t], v : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_hash_link_list_rep(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_hash_skip_list_rep(_0 : Ptr[rocksdb_options_t], _1 : size_t, _2 : int32_t, _3 : int32_t): Unit = extern

  /**
  */
  def rocksdb_options_set_info_log(_0 : Ptr[rocksdb_options_t], _1 : Ptr[rocksdb_logger_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_info_log_level(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_inplace_update_num_locks(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_inplace_update_support(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_is_fd_close_on_exec(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_keep_log_file_num(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_level0_file_num_compaction_trigger(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_level0_slowdown_writes_trigger(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_level0_stop_writes_trigger(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_level_compaction_dynamic_level_bytes(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_log_file_time_to_roll(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_manifest_preallocation_size(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_manual_wal_flush(opt : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_max_background_compactions(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_max_background_flushes(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_max_background_jobs(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_max_bytes_for_level_base(_0 : Ptr[rocksdb_options_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_max_bytes_for_level_multiplier(_0 : Ptr[rocksdb_options_t], _1 : Double): Unit = extern

  /**
  */
  def rocksdb_options_set_max_bytes_for_level_multiplier_additional(_0 : Ptr[rocksdb_options_t], level_values : Ptr[CInt], num_levels : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_max_compaction_bytes(_0 : Ptr[rocksdb_options_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_max_file_opening_threads(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_max_log_file_size(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_max_manifest_file_size(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_max_open_files(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_max_sequential_skip_in_iterations(_0 : Ptr[rocksdb_options_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_max_subcompactions(_0 : Ptr[rocksdb_options_t], _1 : uint32_t): Unit = extern

  /**
  */
  def rocksdb_options_set_max_successive_merges(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_max_total_wal_size(opt : Ptr[rocksdb_options_t], n : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_max_write_buffer_number(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_max_write_buffer_number_to_maintain(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_max_write_buffer_size_to_maintain(_0 : Ptr[rocksdb_options_t], _1 : int64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_memtable_huge_page_size(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_memtable_prefix_bloom_size_ratio(_0 : Ptr[rocksdb_options_t], _1 : Double): Unit = extern

  /**
  */
  def rocksdb_options_set_memtable_vector_rep(_0 : Ptr[rocksdb_options_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_memtable_whole_key_filtering(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_merge_operator(_0 : Ptr[rocksdb_options_t], _1 : Ptr[rocksdb_mergeoperator_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_min_blob_size(opt : Ptr[rocksdb_options_t], `val` : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_min_level_to_compress(opt : Ptr[rocksdb_options_t], level : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_min_write_buffer_number_to_merge(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_num_levels(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_optimize_filters_for_hits(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_paranoid_checks(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_plain_table_factory(_0 : Ptr[rocksdb_options_t], _1 : uint32_t, _2 : CInt, _3 : Double, _4 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_prefix_extractor(_0 : Ptr[rocksdb_options_t], _1 : Ptr[rocksdb_slicetransform_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_prepopulate_blob_cache(opt : Ptr[rocksdb_options_t], `val` : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_ratelimiter(opt : Ptr[rocksdb_options_t], limiter : Ptr[rocksdb_ratelimiter_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_recycle_log_file_num(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_report_bg_io_stats(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_row_cache(opt : Ptr[rocksdb_options_t], cache : Ptr[rocksdb_cache_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_skip_checking_sst_file_sizes_on_db_open(opt : Ptr[rocksdb_options_t], `val` : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_skip_stats_update_on_db_open(opt : Ptr[rocksdb_options_t], `val` : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_soft_pending_compaction_bytes_limit(opt : Ptr[rocksdb_options_t], v : size_t): Unit = extern

  /**
  */
  def rocksdb_options_set_stats_dump_period_sec(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedInt): Unit = extern

  /**
  */
  def rocksdb_options_set_stats_persist_period_sec(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedInt): Unit = extern

  /**
  */
  def rocksdb_options_set_table_cache_numshardbits(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_target_file_size_base(_0 : Ptr[rocksdb_options_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_target_file_size_multiplier(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_uint64add_merge_operator(_0 : Ptr[rocksdb_options_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_universal_compaction_options(_0 : Ptr[rocksdb_options_t], _1 : Ptr[rocksdb_universal_compaction_options_t]): Unit = extern

  /**
  */
  def rocksdb_options_set_unordered_write(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_use_adaptive_mutex(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_use_direct_io_for_flush_and_compaction(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_use_direct_reads(_0 : Ptr[rocksdb_options_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_options_set_use_fsync(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_wal_bytes_per_sync(_0 : Ptr[rocksdb_options_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_wal_compression(opt : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_wal_dir(_0 : Ptr[rocksdb_options_t], _1 : CString): Unit = extern

  /**
  */
  def rocksdb_options_set_wal_recovery_mode(_0 : Ptr[rocksdb_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_options_set_writable_file_max_buffer_size(_0 : Ptr[rocksdb_options_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_options_set_write_buffer_size(_0 : Ptr[rocksdb_options_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_options_statistics_get_string(opt : Ptr[rocksdb_options_t]): CString = extern

  /**
  */
  def rocksdb_perfcontext_create(): Ptr[rocksdb_perfcontext_t] = extern

  /**
  */
  def rocksdb_perfcontext_destroy(context : Ptr[rocksdb_perfcontext_t]): Unit = extern

  /**
  */
  def rocksdb_perfcontext_metric(context : Ptr[rocksdb_perfcontext_t], metric : CInt): uint64_t = extern

  /**
  */
  def rocksdb_perfcontext_report(context : Ptr[rocksdb_perfcontext_t], exclude_zero_counters : CUnsignedChar): CString = extern

  /**
  */
  def rocksdb_perfcontext_reset(context : Ptr[rocksdb_perfcontext_t]): Unit = extern

  /**
  */
  def rocksdb_pinnableslice_destroy(v : Ptr[rocksdb_pinnableslice_t]): Unit = extern

  /**
  */
  def rocksdb_pinnableslice_value(t : Ptr[rocksdb_pinnableslice_t], vlen : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_property_int(db : Ptr[rocksdb_t], propname : CString, out_val : Ptr[uint64_t]): CInt = extern

  /**
  */
  def rocksdb_property_int_cf(db : Ptr[rocksdb_t], column_family : Ptr[rocksdb_column_family_handle_t], propname : CString, out_val : Ptr[uint64_t]): CInt = extern

  /**
  */
  def rocksdb_property_value(db : Ptr[rocksdb_t], propname : CString): CString = extern

  /**
  */
  def rocksdb_property_value_cf(db : Ptr[rocksdb_t], column_family : Ptr[rocksdb_column_family_handle_t], propname : CString): CString = extern

  /**
  */
  def rocksdb_put(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], key : CString, keylen : size_t, `val` : CString, vallen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_put_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, `val` : CString, vallen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_put_cf_with_ts(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, ts : CString, tslen : size_t, `val` : CString, vallen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_put_with_ts(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], key : CString, keylen : size_t, ts : CString, tslen : size_t, `val` : CString, vallen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_ratelimiter_create(rate_bytes_per_sec : int64_t, refill_period_us : int64_t, fairness : int32_t): Ptr[rocksdb_ratelimiter_t] = extern

  /**
  */
  def rocksdb_ratelimiter_destroy(_0 : Ptr[rocksdb_ratelimiter_t]): Unit = extern

  /**
  */
  def rocksdb_readoptions_create(): Ptr[rocksdb_readoptions_t] = extern

  /**
  */
  def rocksdb_readoptions_destroy(_0 : Ptr[rocksdb_readoptions_t]): Unit = extern

  /**
  */
  def rocksdb_readoptions_get_async_io(_0 : Ptr[rocksdb_readoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_readoptions_get_background_purge_on_iterator_cleanup(_0 : Ptr[rocksdb_readoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_readoptions_get_deadline(_0 : Ptr[rocksdb_readoptions_t]): uint64_t = extern

  /**
  */
  def rocksdb_readoptions_get_fill_cache(_0 : Ptr[rocksdb_readoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_readoptions_get_ignore_range_deletions(_0 : Ptr[rocksdb_readoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_readoptions_get_io_timeout(_0 : Ptr[rocksdb_readoptions_t]): uint64_t = extern

  /**
  */
  def rocksdb_readoptions_get_max_skippable_internal_keys(_0 : Ptr[rocksdb_readoptions_t]): uint64_t = extern

  /**
  */
  def rocksdb_readoptions_get_pin_data(_0 : Ptr[rocksdb_readoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_readoptions_get_prefix_same_as_start(_0 : Ptr[rocksdb_readoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_readoptions_get_read_tier(_0 : Ptr[rocksdb_readoptions_t]): CInt = extern

  /**
  */
  def rocksdb_readoptions_get_readahead_size(_0 : Ptr[rocksdb_readoptions_t]): size_t = extern

  /**
  */
  def rocksdb_readoptions_get_tailing(_0 : Ptr[rocksdb_readoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_readoptions_get_total_order_seek(_0 : Ptr[rocksdb_readoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_readoptions_get_verify_checksums(_0 : Ptr[rocksdb_readoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_readoptions_set_async_io(_0 : Ptr[rocksdb_readoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_background_purge_on_iterator_cleanup(_0 : Ptr[rocksdb_readoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_deadline(_0 : Ptr[rocksdb_readoptions_t], microseconds : uint64_t): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_fill_cache(_0 : Ptr[rocksdb_readoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_ignore_range_deletions(_0 : Ptr[rocksdb_readoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_io_timeout(_0 : Ptr[rocksdb_readoptions_t], microseconds : uint64_t): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_iter_start_ts(_0 : Ptr[rocksdb_readoptions_t], ts : CString, tslen : size_t): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_iterate_lower_bound(_0 : Ptr[rocksdb_readoptions_t], key : CString, keylen : size_t): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_iterate_upper_bound(_0 : Ptr[rocksdb_readoptions_t], key : CString, keylen : size_t): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_managed(_0 : Ptr[rocksdb_readoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_max_skippable_internal_keys(_0 : Ptr[rocksdb_readoptions_t], _1 : uint64_t): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_pin_data(_0 : Ptr[rocksdb_readoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_prefix_same_as_start(_0 : Ptr[rocksdb_readoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_read_tier(_0 : Ptr[rocksdb_readoptions_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_readahead_size(_0 : Ptr[rocksdb_readoptions_t], _1 : size_t): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_snapshot(_0 : Ptr[rocksdb_readoptions_t], _1 : Ptr[rocksdb_snapshot_t]): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_tailing(_0 : Ptr[rocksdb_readoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_timestamp(_0 : Ptr[rocksdb_readoptions_t], ts : CString, tslen : size_t): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_total_order_seek(_0 : Ptr[rocksdb_readoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_readoptions_set_verify_checksums(_0 : Ptr[rocksdb_readoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_release_snapshot(db : Ptr[rocksdb_t], snapshot : Ptr[rocksdb_snapshot_t]): Unit = extern

  /**
  */
  def rocksdb_repair_db(options : Ptr[rocksdb_options_t], name : CString, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_restore_options_create(): Ptr[rocksdb_restore_options_t] = extern

  /**
  */
  def rocksdb_restore_options_destroy(opt : Ptr[rocksdb_restore_options_t]): Unit = extern

  /**
  */
  def rocksdb_restore_options_set_keep_log_files(opt : Ptr[rocksdb_restore_options_t], v : CInt): Unit = extern

  /**
  */
  def rocksdb_set_options(db : Ptr[rocksdb_t], count : CInt, keys : Ptr[CString], values : Ptr[CString], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_set_options_cf(db : Ptr[rocksdb_t], handle : Ptr[rocksdb_column_family_handle_t], count : CInt, keys : Ptr[CString], values : Ptr[CString], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_set_perf_level(_0 : CInt): Unit = extern

  /**
  */
  def rocksdb_singledelete(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], key : CString, keylen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_singledelete_cf(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_singledelete_cf_with_ts(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, ts : CString, tslen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_singledelete_with_ts(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], key : CString, keylen : size_t, ts : CString, tslen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_slicetransform_create(state : Ptr[Byte], destructor : CFuncPtr1[Ptr[Byte], Unit], transform : CFuncPtr4[Ptr[Byte], CString, size_t, Ptr[size_t], CString], in_domain : CFuncPtr3[Ptr[Byte], CString, size_t, CUnsignedChar], in_range : CFuncPtr3[Ptr[Byte], CString, size_t, CUnsignedChar], name : CFuncPtr1[Ptr[Byte], CString]): Ptr[rocksdb_slicetransform_t] = extern

  /**
  */
  def rocksdb_slicetransform_create_fixed_prefix(_0 : size_t): Ptr[rocksdb_slicetransform_t] = extern

  /**
  */
  def rocksdb_slicetransform_create_noop(): Ptr[rocksdb_slicetransform_t] = extern

  /**
  */
  def rocksdb_slicetransform_destroy(_0 : Ptr[rocksdb_slicetransform_t]): Unit = extern

  /**
   * Releases the specified rocksdb_sst_file_metadata_t.
  */
  def rocksdb_sst_file_metadata_destroy(file_meta : Ptr[rocksdb_sst_file_metadata_t]): Unit = extern

  /**
   * Returns the smallest key of the specified sst file. The caller is responsible for releasing the returned memory.
  */
  def rocksdb_sst_file_metadata_get_largestkey(file_meta : Ptr[rocksdb_sst_file_metadata_t], len : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_sst_file_metadata_get_relative_filename(file_meta : Ptr[rocksdb_sst_file_metadata_t]): CString = extern

  /**
  */
  def rocksdb_sst_file_metadata_get_size(file_meta : Ptr[rocksdb_sst_file_metadata_t]): uint64_t = extern

  /**
   * Returns the smallest key of the specified sst file. The caller is responsible for releasing the returned memory.
  */
  def rocksdb_sst_file_metadata_get_smallestkey(file_meta : Ptr[rocksdb_sst_file_metadata_t], len : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_sstfilewriter_add(writer : Ptr[rocksdb_sstfilewriter_t], key : CString, keylen : size_t, `val` : CString, vallen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_sstfilewriter_create(env : Ptr[rocksdb_envoptions_t], io_options : Ptr[rocksdb_options_t]): Ptr[rocksdb_sstfilewriter_t] = extern

  /**
  */
  def rocksdb_sstfilewriter_create_with_comparator(env : Ptr[rocksdb_envoptions_t], io_options : Ptr[rocksdb_options_t], comparator : Ptr[rocksdb_comparator_t]): Ptr[rocksdb_sstfilewriter_t] = extern

  /**
  */
  def rocksdb_sstfilewriter_delete(writer : Ptr[rocksdb_sstfilewriter_t], key : CString, keylen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_sstfilewriter_delete_range(writer : Ptr[rocksdb_sstfilewriter_t], begin_key : CString, begin_keylen : size_t, end_key : CString, end_keylen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_sstfilewriter_delete_with_ts(writer : Ptr[rocksdb_sstfilewriter_t], key : CString, keylen : size_t, ts : CString, tslen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_sstfilewriter_destroy(writer : Ptr[rocksdb_sstfilewriter_t]): Unit = extern

  /**
  */
  def rocksdb_sstfilewriter_file_size(writer : Ptr[rocksdb_sstfilewriter_t], file_size : Ptr[uint64_t]): Unit = extern

  /**
  */
  def rocksdb_sstfilewriter_finish(writer : Ptr[rocksdb_sstfilewriter_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_sstfilewriter_merge(writer : Ptr[rocksdb_sstfilewriter_t], key : CString, keylen : size_t, `val` : CString, vallen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_sstfilewriter_open(writer : Ptr[rocksdb_sstfilewriter_t], name : CString, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_sstfilewriter_put(writer : Ptr[rocksdb_sstfilewriter_t], key : CString, keylen : size_t, `val` : CString, vallen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_sstfilewriter_put_with_ts(writer : Ptr[rocksdb_sstfilewriter_t], key : CString, keylen : size_t, ts : CString, tslen : size_t, `val` : CString, vallen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_suggest_compact_range(db : Ptr[rocksdb_t], start_key : CString, start_key_len : size_t, limit_key : CString, limit_key_len : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_suggest_compact_range_cf(db : Ptr[rocksdb_t], column_family : Ptr[rocksdb_column_family_handle_t], start_key : CString, start_key_len : size_t, limit_key : CString, limit_key_len : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_begin(txn_db : Ptr[rocksdb_transactiondb_t], write_options : Ptr[rocksdb_writeoptions_t], txn_options : Ptr[rocksdb_transaction_options_t], old_txn : Ptr[rocksdb_transaction_t]): Ptr[rocksdb_transaction_t] = extern

  /**
  */
  def rocksdb_transaction_commit(txn : Ptr[rocksdb_transaction_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_create_iterator(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t]): Ptr[rocksdb_iterator_t] = extern

  /**
  */
  def rocksdb_transaction_create_iterator_cf(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t]): Ptr[rocksdb_iterator_t] = extern

  /**
  */
  def rocksdb_transaction_delete(txn : Ptr[rocksdb_transaction_t], key : CString, klen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_delete_cf(txn : Ptr[rocksdb_transaction_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_destroy(txn : Ptr[rocksdb_transaction_t]): Unit = extern

  /**
  */
  def rocksdb_transaction_get(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t], key : CString, klen : size_t, vlen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_transaction_get_cf(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, vlen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_transaction_get_for_update(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t], key : CString, klen : size_t, vlen : Ptr[size_t], exclusive : CUnsignedChar, errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_transaction_get_for_update_cf(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, vlen : Ptr[size_t], exclusive : CUnsignedChar, errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_transaction_get_name(txn : Ptr[rocksdb_transaction_t], name_len : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_transaction_get_pinned(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t], key : CString, klen : size_t, errptr : Ptr[CString]): Ptr[rocksdb_pinnableslice_t] = extern

  /**
  */
  def rocksdb_transaction_get_pinned_cf(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, errptr : Ptr[CString]): Ptr[rocksdb_pinnableslice_t] = extern

  /**
  */
  def rocksdb_transaction_get_pinned_for_update(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t], key : CString, klen : size_t, exclusive : CUnsignedChar, errptr : Ptr[CString]): Ptr[rocksdb_pinnableslice_t] = extern

  /**
  */
  def rocksdb_transaction_get_pinned_for_update_cf(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, exclusive : CUnsignedChar, errptr : Ptr[CString]): Ptr[rocksdb_pinnableslice_t] = extern

  /**
  */
  def rocksdb_transaction_get_snapshot(txn : Ptr[rocksdb_transaction_t]): Ptr[rocksdb_snapshot_t] = extern

  /**
  */
  def rocksdb_transaction_get_writebatch_wi(txn : Ptr[rocksdb_transaction_t]): Ptr[rocksdb_writebatch_wi_t] = extern

  /**
  */
  def rocksdb_transaction_merge(txn : Ptr[rocksdb_transaction_t], key : CString, klen : size_t, `val` : CString, vlen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_merge_cf(txn : Ptr[rocksdb_transaction_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, `val` : CString, vlen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_multi_get(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t], num_keys : size_t, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], values_list : Ptr[CString], values_list_sizes : Ptr[size_t], errs : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_multi_get_cf(txn : Ptr[rocksdb_transaction_t], options : Ptr[rocksdb_readoptions_t], column_families : Ptr[Ptr[rocksdb_column_family_handle_t]], num_keys : size_t, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], values_list : Ptr[CString], values_list_sizes : Ptr[size_t], errs : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_options_create(): Ptr[rocksdb_transaction_options_t] = extern

  /**
  */
  def rocksdb_transaction_options_destroy(opt : Ptr[rocksdb_transaction_options_t]): Unit = extern

  /**
  */
  def rocksdb_transaction_options_set_deadlock_detect(opt : Ptr[rocksdb_transaction_options_t], v : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_transaction_options_set_deadlock_detect_depth(opt : Ptr[rocksdb_transaction_options_t], depth : int64_t): Unit = extern

  /**
  */
  def rocksdb_transaction_options_set_expiration(opt : Ptr[rocksdb_transaction_options_t], expiration : int64_t): Unit = extern

  /**
  */
  def rocksdb_transaction_options_set_lock_timeout(opt : Ptr[rocksdb_transaction_options_t], lock_timeout : int64_t): Unit = extern

  /**
  */
  def rocksdb_transaction_options_set_max_write_batch_size(opt : Ptr[rocksdb_transaction_options_t], size : size_t): Unit = extern

  /**
  */
  def rocksdb_transaction_options_set_set_snapshot(opt : Ptr[rocksdb_transaction_options_t], v : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_transaction_options_set_skip_prepare(opt : Ptr[rocksdb_transaction_options_t], v : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_transaction_prepare(txn : Ptr[rocksdb_transaction_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_put(txn : Ptr[rocksdb_transaction_t], key : CString, klen : size_t, `val` : CString, vlen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_put_cf(txn : Ptr[rocksdb_transaction_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, `val` : CString, vlen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_rebuild_from_writebatch(txn : Ptr[rocksdb_transaction_t], writebatch : Ptr[rocksdb_writebatch_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_rebuild_from_writebatch_wi(txn : Ptr[rocksdb_transaction_t], wi : Ptr[rocksdb_writebatch_wi_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_rollback(txn : Ptr[rocksdb_transaction_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_rollback_to_savepoint(txn : Ptr[rocksdb_transaction_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_set_commit_timestamp(txn : Ptr[rocksdb_transaction_t], commit_timestamp : uint64_t): Unit = extern

  /**
  */
  def rocksdb_transaction_set_name(txn : Ptr[rocksdb_transaction_t], name : CString, name_len : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transaction_set_read_timestamp_for_validation(txn : Ptr[rocksdb_transaction_t], read_timestamp : uint64_t): Unit = extern

  /**
  */
  def rocksdb_transaction_set_savepoint(txn : Ptr[rocksdb_transaction_t]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_checkpoint_object_create(txn_db : Ptr[rocksdb_transactiondb_t], errptr : Ptr[CString]): Ptr[rocksdb_checkpoint_t] = extern

  /**
  */
  def rocksdb_transactiondb_close(txn_db : Ptr[rocksdb_transactiondb_t]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_create_column_family(txn_db : Ptr[rocksdb_transactiondb_t], column_family_options : Ptr[rocksdb_options_t], column_family_name : CString, errptr : Ptr[CString]): Ptr[rocksdb_column_family_handle_t] = extern

  /**
  */
  def rocksdb_transactiondb_create_iterator(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_readoptions_t]): Ptr[rocksdb_iterator_t] = extern

  /**
  */
  def rocksdb_transactiondb_create_iterator_cf(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t]): Ptr[rocksdb_iterator_t] = extern

  /**
  */
  def rocksdb_transactiondb_create_snapshot(txn_db : Ptr[rocksdb_transactiondb_t]): Ptr[rocksdb_snapshot_t] = extern

  /**
  */
  def rocksdb_transactiondb_delete(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_writeoptions_t], key : CString, klen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_delete_cf(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_writeoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_flush(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_flushoptions_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_flush_cf(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_flushoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_flush_wal(txn_db : Ptr[rocksdb_transactiondb_t], sync : CUnsignedChar, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_get(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_readoptions_t], key : CString, klen : size_t, vlen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_transactiondb_get_cf(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, vallen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_transactiondb_get_pinned(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_readoptions_t], key : CString, klen : size_t, errptr : Ptr[CString]): Ptr[rocksdb_pinnableslice_t] = extern

  /**
  */
  def rocksdb_transactiondb_get_pinned_cf(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, errptr : Ptr[CString]): Ptr[rocksdb_pinnableslice_t] = extern

  /**
  */
  def rocksdb_transactiondb_get_prepared_transactions(txn_db : Ptr[rocksdb_transactiondb_t], cnt : Ptr[size_t]): Ptr[Ptr[rocksdb_transaction_t]] = extern

  /**
  */
  def rocksdb_transactiondb_merge(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_writeoptions_t], key : CString, klen : size_t, `val` : CString, vlen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_merge_cf(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_writeoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, `val` : CString, vlen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_multi_get(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_readoptions_t], num_keys : size_t, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], values_list : Ptr[CString], values_list_sizes : Ptr[size_t], errs : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_multi_get_cf(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_readoptions_t], column_families : Ptr[Ptr[rocksdb_column_family_handle_t]], num_keys : size_t, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], values_list : Ptr[CString], values_list_sizes : Ptr[size_t], errs : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_open(options : Ptr[rocksdb_options_t], txn_db_options : Ptr[rocksdb_transactiondb_options_t], name : CString, errptr : Ptr[CString]): Ptr[rocksdb_transactiondb_t] = extern

  /**
  */
  def rocksdb_transactiondb_open_column_families(options : Ptr[rocksdb_options_t], txn_db_options : Ptr[rocksdb_transactiondb_options_t], name : CString, num_column_families : CInt, column_family_names : Ptr[CString], column_family_options : Ptr[Ptr[rocksdb_options_t]], column_family_handles : Ptr[Ptr[rocksdb_column_family_handle_t]], errptr : Ptr[CString]): Ptr[rocksdb_transactiondb_t] = extern

  /**
  */
  def rocksdb_transactiondb_options_create(): Ptr[rocksdb_transactiondb_options_t] = extern

  /**
  */
  def rocksdb_transactiondb_options_destroy(opt : Ptr[rocksdb_transactiondb_options_t]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_options_set_default_lock_timeout(opt : Ptr[rocksdb_transactiondb_options_t], default_lock_timeout : int64_t): Unit = extern

  /**
  */
  def rocksdb_transactiondb_options_set_max_num_locks(opt : Ptr[rocksdb_transactiondb_options_t], max_num_locks : int64_t): Unit = extern

  /**
  */
  def rocksdb_transactiondb_options_set_num_stripes(opt : Ptr[rocksdb_transactiondb_options_t], num_stripes : size_t): Unit = extern

  /**
  */
  def rocksdb_transactiondb_options_set_transaction_lock_timeout(opt : Ptr[rocksdb_transactiondb_options_t], txn_lock_timeout : int64_t): Unit = extern

  /**
  */
  def rocksdb_transactiondb_property_int(db : Ptr[rocksdb_transactiondb_t], propname : CString, out_val : Ptr[uint64_t]): CInt = extern

  /**
  */
  def rocksdb_transactiondb_property_value(db : Ptr[rocksdb_transactiondb_t], propname : CString): CString = extern

  /**
  */
  def rocksdb_transactiondb_put(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_writeoptions_t], key : CString, klen : size_t, `val` : CString, vlen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_put_cf(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_writeoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, `val` : CString, vallen : size_t, errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_release_snapshot(txn_db : Ptr[rocksdb_transactiondb_t], snapshot : Ptr[rocksdb_snapshot_t]): Unit = extern

  /**
  */
  def rocksdb_transactiondb_write(txn_db : Ptr[rocksdb_transactiondb_t], options : Ptr[rocksdb_writeoptions_t], batch : Ptr[rocksdb_writebatch_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_try_catch_up_with_primary(db : Ptr[rocksdb_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_universal_compaction_options_create(): Ptr[rocksdb_universal_compaction_options_t] = extern

  /**
  */
  def rocksdb_universal_compaction_options_destroy(_0 : Ptr[rocksdb_universal_compaction_options_t]): Unit = extern

  /**
  */
  def rocksdb_universal_compaction_options_get_compression_size_percent(_0 : Ptr[rocksdb_universal_compaction_options_t]): CInt = extern

  /**
  */
  def rocksdb_universal_compaction_options_get_max_merge_width(_0 : Ptr[rocksdb_universal_compaction_options_t]): CInt = extern

  /**
  */
  def rocksdb_universal_compaction_options_get_max_size_amplification_percent(_0 : Ptr[rocksdb_universal_compaction_options_t]): CInt = extern

  /**
  */
  def rocksdb_universal_compaction_options_get_min_merge_width(_0 : Ptr[rocksdb_universal_compaction_options_t]): CInt = extern

  /**
  */
  def rocksdb_universal_compaction_options_get_size_ratio(_0 : Ptr[rocksdb_universal_compaction_options_t]): CInt = extern

  /**
  */
  def rocksdb_universal_compaction_options_get_stop_style(_0 : Ptr[rocksdb_universal_compaction_options_t]): CInt = extern

  /**
  */
  def rocksdb_universal_compaction_options_set_compression_size_percent(_0 : Ptr[rocksdb_universal_compaction_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_universal_compaction_options_set_max_merge_width(_0 : Ptr[rocksdb_universal_compaction_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_universal_compaction_options_set_max_size_amplification_percent(_0 : Ptr[rocksdb_universal_compaction_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_universal_compaction_options_set_min_merge_width(_0 : Ptr[rocksdb_universal_compaction_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_universal_compaction_options_set_size_ratio(_0 : Ptr[rocksdb_universal_compaction_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_universal_compaction_options_set_stop_style(_0 : Ptr[rocksdb_universal_compaction_options_t], _1 : CInt): Unit = extern

  /**
  */
  def rocksdb_wal_iter_destroy(iter : Ptr[rocksdb_wal_iterator_t]): Unit = extern

  /**
  */
  def rocksdb_wal_iter_get_batch(iter : Ptr[rocksdb_wal_iterator_t], seq : Ptr[uint64_t]): Ptr[rocksdb_writebatch_t] = extern

  /**
  */
  def rocksdb_wal_iter_next(iter : Ptr[rocksdb_wal_iterator_t]): Unit = extern

  /**
  */
  def rocksdb_wal_iter_status(iter : Ptr[rocksdb_wal_iterator_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_wal_iter_valid(_0 : Ptr[rocksdb_wal_iterator_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_write(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], batch : Ptr[rocksdb_writebatch_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_write_writebatch_wi(db : Ptr[rocksdb_t], options : Ptr[rocksdb_writeoptions_t], wbwi : Ptr[rocksdb_writebatch_wi_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_writebatch_clear(_0 : Ptr[rocksdb_writebatch_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_count(_0 : Ptr[rocksdb_writebatch_t]): CInt = extern

  /**
  */
  def rocksdb_writebatch_create(): Ptr[rocksdb_writebatch_t] = extern

  /**
  */
  def rocksdb_writebatch_create_from(rep : CString, size : size_t): Ptr[rocksdb_writebatch_t] = extern

  /**
  */
  def rocksdb_writebatch_data(_0 : Ptr[rocksdb_writebatch_t], size : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_writebatch_delete(_0 : Ptr[rocksdb_writebatch_t], key : CString, klen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_delete_cf(_0 : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_delete_cf_with_ts(_0 : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, ts : CString, tslen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_delete_range(b : Ptr[rocksdb_writebatch_t], start_key : CString, start_key_len : size_t, end_key : CString, end_key_len : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_delete_range_cf(b : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], start_key : CString, start_key_len : size_t, end_key : CString, end_key_len : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_delete_rangev(b : Ptr[rocksdb_writebatch_t], num_keys : CInt, start_keys_list : Ptr[CString], start_keys_list_sizes : Ptr[size_t], end_keys_list : Ptr[CString], end_keys_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_delete_rangev_cf(b : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], num_keys : CInt, start_keys_list : Ptr[CString], start_keys_list_sizes : Ptr[size_t], end_keys_list : Ptr[CString], end_keys_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_deletev(b : Ptr[rocksdb_writebatch_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_deletev_cf(b : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_destroy(_0 : Ptr[rocksdb_writebatch_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_iterate(_0 : Ptr[rocksdb_writebatch_t], state : Ptr[Byte], put : CFuncPtr5[Ptr[Byte], CString, size_t, CString, size_t, Unit], deleted : CFuncPtr3[Ptr[Byte], CString, size_t, Unit]): Unit = extern

  /**
  */
  def rocksdb_writebatch_merge(_0 : Ptr[rocksdb_writebatch_t], key : CString, klen : size_t, `val` : CString, vlen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_merge_cf(_0 : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, `val` : CString, vlen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_mergev(b : Ptr[rocksdb_writebatch_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], num_values : CInt, values_list : Ptr[CString], values_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_mergev_cf(b : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], num_values : CInt, values_list : Ptr[CString], values_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_pop_save_point(_0 : Ptr[rocksdb_writebatch_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_writebatch_put(_0 : Ptr[rocksdb_writebatch_t], key : CString, klen : size_t, `val` : CString, vlen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_put_cf(_0 : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, `val` : CString, vlen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_put_cf_with_ts(_0 : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, ts : CString, tslen : size_t, `val` : CString, vlen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_put_log_data(_0 : Ptr[rocksdb_writebatch_t], blob : CString, len : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_putv(b : Ptr[rocksdb_writebatch_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], num_values : CInt, values_list : Ptr[CString], values_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_putv_cf(b : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], num_values : CInt, values_list : Ptr[CString], values_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_rollback_to_save_point(_0 : Ptr[rocksdb_writebatch_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_writebatch_set_save_point(_0 : Ptr[rocksdb_writebatch_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_singledelete(b : Ptr[rocksdb_writebatch_t], key : CString, klen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_singledelete_cf(b : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_singledelete_cf_with_ts(b : Ptr[rocksdb_writebatch_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, ts : CString, tslen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_clear(_0 : Ptr[rocksdb_writebatch_wi_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_count(b : Ptr[rocksdb_writebatch_wi_t]): CInt = extern

  /**
  */
  def rocksdb_writebatch_wi_create(reserved_bytes : size_t, overwrite_keys : CUnsignedChar): Ptr[rocksdb_writebatch_wi_t] = extern

  /**
  */
  def rocksdb_writebatch_wi_create_from(rep : CString, size : size_t): Ptr[rocksdb_writebatch_wi_t] = extern

  /**
  */
  def rocksdb_writebatch_wi_create_iterator_with_base(wbwi : Ptr[rocksdb_writebatch_wi_t], base_iterator : Ptr[rocksdb_iterator_t]): Ptr[rocksdb_iterator_t] = extern

  /**
  */
  def rocksdb_writebatch_wi_create_iterator_with_base_cf(wbwi : Ptr[rocksdb_writebatch_wi_t], base_iterator : Ptr[rocksdb_iterator_t], cf : Ptr[rocksdb_column_family_handle_t]): Ptr[rocksdb_iterator_t] = extern

  /**
  */
  def rocksdb_writebatch_wi_data(b : Ptr[rocksdb_writebatch_wi_t], size : Ptr[size_t]): CString = extern

  /**
  */
  def rocksdb_writebatch_wi_delete(_0 : Ptr[rocksdb_writebatch_wi_t], key : CString, klen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_delete_cf(_0 : Ptr[rocksdb_writebatch_wi_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_delete_range(b : Ptr[rocksdb_writebatch_wi_t], start_key : CString, start_key_len : size_t, end_key : CString, end_key_len : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_delete_range_cf(b : Ptr[rocksdb_writebatch_wi_t], column_family : Ptr[rocksdb_column_family_handle_t], start_key : CString, start_key_len : size_t, end_key : CString, end_key_len : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_delete_rangev(b : Ptr[rocksdb_writebatch_wi_t], num_keys : CInt, start_keys_list : Ptr[CString], start_keys_list_sizes : Ptr[size_t], end_keys_list : Ptr[CString], end_keys_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_delete_rangev_cf(b : Ptr[rocksdb_writebatch_wi_t], column_family : Ptr[rocksdb_column_family_handle_t], num_keys : CInt, start_keys_list : Ptr[CString], start_keys_list_sizes : Ptr[size_t], end_keys_list : Ptr[CString], end_keys_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_deletev(b : Ptr[rocksdb_writebatch_wi_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_deletev_cf(b : Ptr[rocksdb_writebatch_wi_t], column_family : Ptr[rocksdb_column_family_handle_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_destroy(_0 : Ptr[rocksdb_writebatch_wi_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_get_from_batch(wbwi : Ptr[rocksdb_writebatch_wi_t], options : Ptr[rocksdb_options_t], key : CString, keylen : size_t, vallen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_writebatch_wi_get_from_batch_and_db(wbwi : Ptr[rocksdb_writebatch_wi_t], db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], key : CString, keylen : size_t, vallen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_writebatch_wi_get_from_batch_and_db_cf(wbwi : Ptr[rocksdb_writebatch_wi_t], db : Ptr[rocksdb_t], options : Ptr[rocksdb_readoptions_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, vallen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_writebatch_wi_get_from_batch_cf(wbwi : Ptr[rocksdb_writebatch_wi_t], options : Ptr[rocksdb_options_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, keylen : size_t, vallen : Ptr[size_t], errptr : Ptr[CString]): CString = extern

  /**
  */
  def rocksdb_writebatch_wi_iterate(b : Ptr[rocksdb_writebatch_wi_t], state : Ptr[Byte], put : CFuncPtr5[Ptr[Byte], CString, size_t, CString, size_t, Unit], deleted : CFuncPtr3[Ptr[Byte], CString, size_t, Unit]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_merge(_0 : Ptr[rocksdb_writebatch_wi_t], key : CString, klen : size_t, `val` : CString, vlen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_merge_cf(_0 : Ptr[rocksdb_writebatch_wi_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, `val` : CString, vlen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_mergev(b : Ptr[rocksdb_writebatch_wi_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], num_values : CInt, values_list : Ptr[CString], values_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_mergev_cf(b : Ptr[rocksdb_writebatch_wi_t], column_family : Ptr[rocksdb_column_family_handle_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], num_values : CInt, values_list : Ptr[CString], values_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_put(_0 : Ptr[rocksdb_writebatch_wi_t], key : CString, klen : size_t, `val` : CString, vlen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_put_cf(_0 : Ptr[rocksdb_writebatch_wi_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t, `val` : CString, vlen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_put_log_data(_0 : Ptr[rocksdb_writebatch_wi_t], blob : CString, len : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_putv(b : Ptr[rocksdb_writebatch_wi_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], num_values : CInt, values_list : Ptr[CString], values_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_putv_cf(b : Ptr[rocksdb_writebatch_wi_t], column_family : Ptr[rocksdb_column_family_handle_t], num_keys : CInt, keys_list : Ptr[CString], keys_list_sizes : Ptr[size_t], num_values : CInt, values_list : Ptr[CString], values_list_sizes : Ptr[size_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_rollback_to_save_point(_0 : Ptr[rocksdb_writebatch_wi_t], errptr : Ptr[CString]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_set_save_point(_0 : Ptr[rocksdb_writebatch_wi_t]): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_singledelete(_0 : Ptr[rocksdb_writebatch_wi_t], key : CString, klen : size_t): Unit = extern

  /**
  */
  def rocksdb_writebatch_wi_singledelete_cf(_0 : Ptr[rocksdb_writebatch_wi_t], column_family : Ptr[rocksdb_column_family_handle_t], key : CString, klen : size_t): Unit = extern

  /**
  */
  def rocksdb_writeoptions_create(): Ptr[rocksdb_writeoptions_t] = extern

  /**
  */
  def rocksdb_writeoptions_destroy(_0 : Ptr[rocksdb_writeoptions_t]): Unit = extern

  /**
  */
  def rocksdb_writeoptions_disable_WAL(opt : Ptr[rocksdb_writeoptions_t], disable : CInt): Unit = extern

  /**
  */
  def rocksdb_writeoptions_get_disable_WAL(opt : Ptr[rocksdb_writeoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_writeoptions_get_ignore_missing_column_families(_0 : Ptr[rocksdb_writeoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_writeoptions_get_low_pri(_0 : Ptr[rocksdb_writeoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_writeoptions_get_memtable_insert_hint_per_batch(_0 : Ptr[rocksdb_writeoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_writeoptions_get_no_slowdown(_0 : Ptr[rocksdb_writeoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_writeoptions_get_sync(_0 : Ptr[rocksdb_writeoptions_t]): CUnsignedChar = extern

  /**
  */
  def rocksdb_writeoptions_set_ignore_missing_column_families(_0 : Ptr[rocksdb_writeoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_writeoptions_set_low_pri(_0 : Ptr[rocksdb_writeoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_writeoptions_set_memtable_insert_hint_per_batch(_0 : Ptr[rocksdb_writeoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_writeoptions_set_no_slowdown(_0 : Ptr[rocksdb_writeoptions_t], _1 : CUnsignedChar): Unit = extern

  /**
  */
  def rocksdb_writeoptions_set_sync(_0 : Ptr[rocksdb_writeoptions_t], _1 : CUnsignedChar): Unit = extern


object functions:
  import _root_.rocksdb.aliases.*
  import _root_.rocksdb.structs.*
  import extern_functions.*
  export extern_functions.*

object constants:
  val rocksdb_user_key_comparison_count: CUnsignedInt = 0.toUInt
  val rocksdb_block_cache_hit_count: CUnsignedInt = 1.toUInt
  val rocksdb_block_read_count: CUnsignedInt = 2.toUInt
  val rocksdb_block_read_byte: CUnsignedInt = 3.toUInt
  val rocksdb_block_read_time: CUnsignedInt = 4.toUInt
  val rocksdb_block_checksum_time: CUnsignedInt = 5.toUInt
  val rocksdb_block_decompress_time: CUnsignedInt = 6.toUInt
  val rocksdb_get_read_bytes: CUnsignedInt = 7.toUInt
  val rocksdb_multiget_read_bytes: CUnsignedInt = 8.toUInt
  val rocksdb_iter_read_bytes: CUnsignedInt = 9.toUInt
  val rocksdb_internal_key_skipped_count: CUnsignedInt = 10.toUInt
  val rocksdb_internal_delete_skipped_count: CUnsignedInt = 11.toUInt
  val rocksdb_internal_recent_skipped_count: CUnsignedInt = 12.toUInt
  val rocksdb_internal_merge_count: CUnsignedInt = 13.toUInt
  val rocksdb_get_snapshot_time: CUnsignedInt = 14.toUInt
  val rocksdb_get_from_memtable_time: CUnsignedInt = 15.toUInt
  val rocksdb_get_from_memtable_count: CUnsignedInt = 16.toUInt
  val rocksdb_get_post_process_time: CUnsignedInt = 17.toUInt
  val rocksdb_get_from_output_files_time: CUnsignedInt = 18.toUInt
  val rocksdb_seek_on_memtable_time: CUnsignedInt = 19.toUInt
  val rocksdb_seek_on_memtable_count: CUnsignedInt = 20.toUInt
  val rocksdb_next_on_memtable_count: CUnsignedInt = 21.toUInt
  val rocksdb_prev_on_memtable_count: CUnsignedInt = 22.toUInt
  val rocksdb_seek_child_seek_time: CUnsignedInt = 23.toUInt
  val rocksdb_seek_child_seek_count: CUnsignedInt = 24.toUInt
  val rocksdb_seek_min_heap_time: CUnsignedInt = 25.toUInt
  val rocksdb_seek_max_heap_time: CUnsignedInt = 26.toUInt
  val rocksdb_seek_internal_seek_time: CUnsignedInt = 27.toUInt
  val rocksdb_find_next_user_entry_time: CUnsignedInt = 28.toUInt
  val rocksdb_write_wal_time: CUnsignedInt = 29.toUInt
  val rocksdb_write_memtable_time: CUnsignedInt = 30.toUInt
  val rocksdb_write_delay_time: CUnsignedInt = 31.toUInt
  val rocksdb_write_pre_and_post_process_time: CUnsignedInt = 32.toUInt
  val rocksdb_db_mutex_lock_nanos: CUnsignedInt = 33.toUInt
  val rocksdb_db_condition_wait_nanos: CUnsignedInt = 34.toUInt
  val rocksdb_merge_operator_time_nanos: CUnsignedInt = 35.toUInt
  val rocksdb_read_index_block_nanos: CUnsignedInt = 36.toUInt
  val rocksdb_read_filter_block_nanos: CUnsignedInt = 37.toUInt
  val rocksdb_new_table_block_iter_nanos: CUnsignedInt = 38.toUInt
  val rocksdb_new_table_iterator_nanos: CUnsignedInt = 39.toUInt
  val rocksdb_block_seek_nanos: CUnsignedInt = 40.toUInt
  val rocksdb_find_table_nanos: CUnsignedInt = 41.toUInt
  val rocksdb_bloom_memtable_hit_count: CUnsignedInt = 42.toUInt
  val rocksdb_bloom_memtable_miss_count: CUnsignedInt = 43.toUInt
  val rocksdb_bloom_sst_hit_count: CUnsignedInt = 44.toUInt
  val rocksdb_bloom_sst_miss_count: CUnsignedInt = 45.toUInt
  val rocksdb_key_lock_wait_time: CUnsignedInt = 46.toUInt
  val rocksdb_key_lock_wait_count: CUnsignedInt = 47.toUInt
  val rocksdb_env_new_sequential_file_nanos: CUnsignedInt = 48.toUInt
  val rocksdb_env_new_random_access_file_nanos: CUnsignedInt = 49.toUInt
  val rocksdb_env_new_writable_file_nanos: CUnsignedInt = 50.toUInt
  val rocksdb_env_reuse_writable_file_nanos: CUnsignedInt = 51.toUInt
  val rocksdb_env_new_random_rw_file_nanos: CUnsignedInt = 52.toUInt
  val rocksdb_env_new_directory_nanos: CUnsignedInt = 53.toUInt
  val rocksdb_env_file_exists_nanos: CUnsignedInt = 54.toUInt
  val rocksdb_env_get_children_nanos: CUnsignedInt = 55.toUInt
  val rocksdb_env_get_children_file_attributes_nanos: CUnsignedInt = 56.toUInt
  val rocksdb_env_delete_file_nanos: CUnsignedInt = 57.toUInt
  val rocksdb_env_create_dir_nanos: CUnsignedInt = 58.toUInt
  val rocksdb_env_create_dir_if_missing_nanos: CUnsignedInt = 59.toUInt
  val rocksdb_env_delete_dir_nanos: CUnsignedInt = 60.toUInt
  val rocksdb_env_get_file_size_nanos: CUnsignedInt = 61.toUInt
  val rocksdb_env_get_file_modification_time_nanos: CUnsignedInt = 62.toUInt
  val rocksdb_env_rename_file_nanos: CUnsignedInt = 63.toUInt
  val rocksdb_env_link_file_nanos: CUnsignedInt = 64.toUInt
  val rocksdb_env_lock_file_nanos: CUnsignedInt = 65.toUInt
  val rocksdb_env_unlock_file_nanos: CUnsignedInt = 66.toUInt
  val rocksdb_env_new_logger_nanos: CUnsignedInt = 67.toUInt
  val rocksdb_number_async_seek: CUnsignedInt = 68.toUInt
  val rocksdb_blob_cache_hit_count: CUnsignedInt = 69.toUInt
  val rocksdb_blob_read_count: CUnsignedInt = 70.toUInt
  val rocksdb_blob_read_byte: CUnsignedInt = 71.toUInt
  val rocksdb_blob_read_time: CUnsignedInt = 72.toUInt
  val rocksdb_blob_checksum_time: CUnsignedInt = 73.toUInt
  val rocksdb_blob_decompress_time: CUnsignedInt = 74.toUInt
  val rocksdb_internal_range_del_reseek_count: CUnsignedInt = 75.toUInt
  val rocksdb_total_metric_count: CUnsignedInt = 78.toUInt
  
  val rocksdb_prepopulate_blob_disable: CUnsignedInt = 0.toUInt
  val rocksdb_prepopulate_blob_flush_only: CUnsignedInt = 1.toUInt
  
  val rocksdb_level_compaction: CUnsignedInt = 0.toUInt
  val rocksdb_universal_compaction: CUnsignedInt = 1.toUInt
  val rocksdb_fifo_compaction: CUnsignedInt = 2.toUInt
  
  val rocksdb_block_based_table_data_block_index_type_binary_search: CUnsignedInt = 0.toUInt
  val rocksdb_block_based_table_data_block_index_type_binary_search_and_hash: CUnsignedInt = 1.toUInt
  
  val rocksdb_similar_size_compaction_stop_style: CUnsignedInt = 0.toUInt
  val rocksdb_total_size_compaction_stop_style: CUnsignedInt = 1.toUInt
  
  val rocksdb_tolerate_corrupted_tail_records_recovery: CUnsignedInt = 0.toUInt
  val rocksdb_absolute_consistency_recovery: CUnsignedInt = 1.toUInt
  val rocksdb_point_in_time_recovery: CUnsignedInt = 2.toUInt
  val rocksdb_skip_any_corrupted_records_recovery: CUnsignedInt = 3.toUInt
  
  val rocksdb_block_based_table_index_type_binary_search: CUnsignedInt = 0.toUInt
  val rocksdb_block_based_table_index_type_hash_search: CUnsignedInt = 1.toUInt
  val rocksdb_block_based_table_index_type_two_level_index_search: CUnsignedInt = 2.toUInt
  
  val rocksdb_no_compression: CUnsignedInt = 0.toUInt
  val rocksdb_snappy_compression: CUnsignedInt = 1.toUInt
  val rocksdb_zlib_compression: CUnsignedInt = 2.toUInt
  val rocksdb_bz2_compression: CUnsignedInt = 3.toUInt
  val rocksdb_lz4_compression: CUnsignedInt = 4.toUInt
  val rocksdb_lz4hc_compression: CUnsignedInt = 5.toUInt
  val rocksdb_xpress_compression: CUnsignedInt = 6.toUInt
  val rocksdb_zstd_compression: CUnsignedInt = 7.toUInt
  
  val rocksdb_uninitialized: CUnsignedInt = 0.toUInt
  val rocksdb_disable: CUnsignedInt = 1.toUInt
  val rocksdb_enable_count: CUnsignedInt = 2.toUInt
  val rocksdb_enable_time_except_for_mutex: CUnsignedInt = 3.toUInt
  val rocksdb_enable_time: CUnsignedInt = 4.toUInt
  val rocksdb_out_of_bounds: CUnsignedInt = 5.toUInt
  
object types:
  export _root_.rocksdb.structs.*
  export _root_.rocksdb.aliases.*

object all:
  export _root_.rocksdb.aliases.int32_t
  export _root_.rocksdb.aliases.int64_t
  export _root_.rocksdb.aliases.size_t
  export _root_.rocksdb.aliases.uint32_t
  export _root_.rocksdb.aliases.uint64_t
  export _root_.rocksdb.structs.rocksdb_backup_engine_info_t
  export _root_.rocksdb.structs.rocksdb_backup_engine_options_t
  export _root_.rocksdb.structs.rocksdb_backup_engine_t
  export _root_.rocksdb.structs.rocksdb_block_based_table_options_t
  export _root_.rocksdb.structs.rocksdb_cache_t
  export _root_.rocksdb.structs.rocksdb_checkpoint_t
  export _root_.rocksdb.structs.rocksdb_column_family_handle_t
  export _root_.rocksdb.structs.rocksdb_column_family_metadata_t
  export _root_.rocksdb.structs.rocksdb_compactionfilter_t
  export _root_.rocksdb.structs.rocksdb_compactionfiltercontext_t
  export _root_.rocksdb.structs.rocksdb_compactionfilterfactory_t
  export _root_.rocksdb.structs.rocksdb_compactoptions_t
  export _root_.rocksdb.structs.rocksdb_comparator_t
  export _root_.rocksdb.structs.rocksdb_cuckoo_table_options_t
  export _root_.rocksdb.structs.rocksdb_dbpath_t
  export _root_.rocksdb.structs.rocksdb_env_t
  export _root_.rocksdb.structs.rocksdb_envoptions_t
  export _root_.rocksdb.structs.rocksdb_fifo_compaction_options_t
  export _root_.rocksdb.structs.rocksdb_filelock_t
  export _root_.rocksdb.structs.rocksdb_filterpolicy_t
  export _root_.rocksdb.structs.rocksdb_flushoptions_t
  export _root_.rocksdb.structs.rocksdb_ingestexternalfileoptions_t
  export _root_.rocksdb.structs.rocksdb_iterator_t
  export _root_.rocksdb.structs.rocksdb_level_metadata_t
  export _root_.rocksdb.structs.rocksdb_livefiles_t
  export _root_.rocksdb.structs.rocksdb_logger_t
  export _root_.rocksdb.structs.rocksdb_lru_cache_options_t
  export _root_.rocksdb.structs.rocksdb_memory_allocator_t
  export _root_.rocksdb.structs.rocksdb_memory_consumers_t
  export _root_.rocksdb.structs.rocksdb_memory_usage_t
  export _root_.rocksdb.structs.rocksdb_mergeoperator_t
  export _root_.rocksdb.structs.rocksdb_optimistictransaction_options_t
  export _root_.rocksdb.structs.rocksdb_optimistictransactiondb_t
  export _root_.rocksdb.structs.rocksdb_options_t
  export _root_.rocksdb.structs.rocksdb_perfcontext_t
  export _root_.rocksdb.structs.rocksdb_pinnableslice_t
  export _root_.rocksdb.structs.rocksdb_randomfile_t
  export _root_.rocksdb.structs.rocksdb_ratelimiter_t
  export _root_.rocksdb.structs.rocksdb_readoptions_t
  export _root_.rocksdb.structs.rocksdb_restore_options_t
  export _root_.rocksdb.structs.rocksdb_seqfile_t
  export _root_.rocksdb.structs.rocksdb_slicetransform_t
  export _root_.rocksdb.structs.rocksdb_snapshot_t
  export _root_.rocksdb.structs.rocksdb_sst_file_metadata_t
  export _root_.rocksdb.structs.rocksdb_sstfilewriter_t
  export _root_.rocksdb.structs.rocksdb_t
  export _root_.rocksdb.structs.rocksdb_transaction_options_t
  export _root_.rocksdb.structs.rocksdb_transaction_t
  export _root_.rocksdb.structs.rocksdb_transactiondb_options_t
  export _root_.rocksdb.structs.rocksdb_transactiondb_t
  export _root_.rocksdb.structs.rocksdb_universal_compaction_options_t
  export _root_.rocksdb.structs.rocksdb_wal_iterator_t
  export _root_.rocksdb.structs.rocksdb_wal_readoptions_t
  export _root_.rocksdb.structs.rocksdb_writablefile_t
  export _root_.rocksdb.structs.rocksdb_writebatch_t
  export _root_.rocksdb.structs.rocksdb_writebatch_wi_t
  export _root_.rocksdb.structs.rocksdb_writeoptions_t
  export _root_.rocksdb.functions.rocksdb_approximate_memory_usage_create
  export _root_.rocksdb.functions.rocksdb_approximate_memory_usage_destroy
  export _root_.rocksdb.functions.rocksdb_approximate_memory_usage_get_cache_total
  export _root_.rocksdb.functions.rocksdb_approximate_memory_usage_get_mem_table_readers_total
  export _root_.rocksdb.functions.rocksdb_approximate_memory_usage_get_mem_table_total
  export _root_.rocksdb.functions.rocksdb_approximate_memory_usage_get_mem_table_unflushed
  export _root_.rocksdb.functions.rocksdb_approximate_sizes
  export _root_.rocksdb.functions.rocksdb_approximate_sizes_cf
  export _root_.rocksdb.functions.rocksdb_backup_engine_close
  export _root_.rocksdb.functions.rocksdb_backup_engine_create_new_backup
  export _root_.rocksdb.functions.rocksdb_backup_engine_create_new_backup_flush
  export _root_.rocksdb.functions.rocksdb_backup_engine_get_backup_info
  export _root_.rocksdb.functions.rocksdb_backup_engine_info_backup_id
  export _root_.rocksdb.functions.rocksdb_backup_engine_info_count
  export _root_.rocksdb.functions.rocksdb_backup_engine_info_destroy
  export _root_.rocksdb.functions.rocksdb_backup_engine_info_number_files
  export _root_.rocksdb.functions.rocksdb_backup_engine_info_size
  export _root_.rocksdb.functions.rocksdb_backup_engine_info_timestamp
  export _root_.rocksdb.functions.rocksdb_backup_engine_open
  export _root_.rocksdb.functions.rocksdb_backup_engine_open_opts
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_create
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_destroy
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_get_backup_log_files
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_get_backup_rate_limit
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_get_callback_trigger_interval_size
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_get_destroy_old_data
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_get_max_background_operations
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_get_max_valid_backups_to_open
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_get_restore_rate_limit
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_get_share_files_with_checksum_naming
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_get_share_table_files
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_get_sync
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_backup_dir
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_backup_log_files
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_backup_rate_limit
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_callback_trigger_interval_size
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_destroy_old_data
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_env
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_max_background_operations
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_max_valid_backups_to_open
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_restore_rate_limit
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_share_files_with_checksum_naming
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_share_table_files
  export _root_.rocksdb.functions.rocksdb_backup_engine_options_set_sync
  export _root_.rocksdb.functions.rocksdb_backup_engine_purge_old_backups
  export _root_.rocksdb.functions.rocksdb_backup_engine_restore_db_from_backup
  export _root_.rocksdb.functions.rocksdb_backup_engine_restore_db_from_latest_backup
  export _root_.rocksdb.functions.rocksdb_backup_engine_verify_backup
  export _root_.rocksdb.functions.rocksdb_batched_multi_get_cf
  export _root_.rocksdb.functions.rocksdb_block_based_options_create
  export _root_.rocksdb.functions.rocksdb_block_based_options_destroy
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_block_cache
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_block_restart_interval
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_block_size
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_block_size_deviation
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_cache_index_and_filter_blocks
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_cache_index_and_filter_blocks_with_high_priority
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_checksum
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_data_block_hash_ratio
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_data_block_index_type
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_filter_policy
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_format_version
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_index_block_restart_interval
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_index_type
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_metadata_block_size
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_no_block_cache
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_optimize_filters_for_memory
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_partition_filters
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_pin_l0_filter_and_index_blocks_in_cache
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_pin_top_level_index_and_filter
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_use_delta_encoding
  export _root_.rocksdb.functions.rocksdb_block_based_options_set_whole_key_filtering
  export _root_.rocksdb.functions.rocksdb_cache_create_lru
  export _root_.rocksdb.functions.rocksdb_cache_create_lru_opts
  export _root_.rocksdb.functions.rocksdb_cache_create_lru_with_strict_capacity_limit
  export _root_.rocksdb.functions.rocksdb_cache_destroy
  export _root_.rocksdb.functions.rocksdb_cache_disown_data
  export _root_.rocksdb.functions.rocksdb_cache_get_capacity
  export _root_.rocksdb.functions.rocksdb_cache_get_pinned_usage
  export _root_.rocksdb.functions.rocksdb_cache_get_usage
  export _root_.rocksdb.functions.rocksdb_cache_set_capacity
  export _root_.rocksdb.functions.rocksdb_cancel_all_background_work
  export _root_.rocksdb.functions.rocksdb_checkpoint_create
  export _root_.rocksdb.functions.rocksdb_checkpoint_object_create
  export _root_.rocksdb.functions.rocksdb_checkpoint_object_destroy
  export _root_.rocksdb.functions.rocksdb_close
  export _root_.rocksdb.functions.rocksdb_column_family_handle_destroy
  export _root_.rocksdb.functions.rocksdb_column_family_handle_get_id
  export _root_.rocksdb.functions.rocksdb_column_family_handle_get_name
  export _root_.rocksdb.functions.rocksdb_column_family_metadata_destroy
  export _root_.rocksdb.functions.rocksdb_column_family_metadata_get_file_count
  export _root_.rocksdb.functions.rocksdb_column_family_metadata_get_level_count
  export _root_.rocksdb.functions.rocksdb_column_family_metadata_get_level_metadata
  export _root_.rocksdb.functions.rocksdb_column_family_metadata_get_name
  export _root_.rocksdb.functions.rocksdb_column_family_metadata_get_size
  export _root_.rocksdb.functions.rocksdb_compact_range
  export _root_.rocksdb.functions.rocksdb_compact_range_cf
  export _root_.rocksdb.functions.rocksdb_compact_range_cf_opt
  export _root_.rocksdb.functions.rocksdb_compact_range_opt
  export _root_.rocksdb.functions.rocksdb_compactionfilter_create
  export _root_.rocksdb.functions.rocksdb_compactionfilter_destroy
  export _root_.rocksdb.functions.rocksdb_compactionfilter_set_ignore_snapshots
  export _root_.rocksdb.functions.rocksdb_compactionfiltercontext_is_full_compaction
  export _root_.rocksdb.functions.rocksdb_compactionfiltercontext_is_manual_compaction
  export _root_.rocksdb.functions.rocksdb_compactionfilterfactory_create
  export _root_.rocksdb.functions.rocksdb_compactionfilterfactory_destroy
  export _root_.rocksdb.functions.rocksdb_compactoptions_create
  export _root_.rocksdb.functions.rocksdb_compactoptions_destroy
  export _root_.rocksdb.functions.rocksdb_compactoptions_get_bottommost_level_compaction
  export _root_.rocksdb.functions.rocksdb_compactoptions_get_change_level
  export _root_.rocksdb.functions.rocksdb_compactoptions_get_exclusive_manual_compaction
  export _root_.rocksdb.functions.rocksdb_compactoptions_get_target_level
  export _root_.rocksdb.functions.rocksdb_compactoptions_set_bottommost_level_compaction
  export _root_.rocksdb.functions.rocksdb_compactoptions_set_change_level
  export _root_.rocksdb.functions.rocksdb_compactoptions_set_exclusive_manual_compaction
  export _root_.rocksdb.functions.rocksdb_compactoptions_set_full_history_ts_low
  export _root_.rocksdb.functions.rocksdb_compactoptions_set_target_level
  export _root_.rocksdb.functions.rocksdb_comparator_create
  export _root_.rocksdb.functions.rocksdb_comparator_destroy
  export _root_.rocksdb.functions.rocksdb_comparator_with_ts_create
  export _root_.rocksdb.functions.rocksdb_create_column_family
  export _root_.rocksdb.functions.rocksdb_create_column_family_with_ttl
  export _root_.rocksdb.functions.rocksdb_create_default_env
  export _root_.rocksdb.functions.rocksdb_create_dir_if_missing
  export _root_.rocksdb.functions.rocksdb_create_iterator
  export _root_.rocksdb.functions.rocksdb_create_iterator_cf
  export _root_.rocksdb.functions.rocksdb_create_iterators
  export _root_.rocksdb.functions.rocksdb_create_mem_env
  export _root_.rocksdb.functions.rocksdb_create_snapshot
  export _root_.rocksdb.functions.rocksdb_cuckoo_options_create
  export _root_.rocksdb.functions.rocksdb_cuckoo_options_destroy
  export _root_.rocksdb.functions.rocksdb_cuckoo_options_set_cuckoo_block_size
  export _root_.rocksdb.functions.rocksdb_cuckoo_options_set_hash_ratio
  export _root_.rocksdb.functions.rocksdb_cuckoo_options_set_identity_as_first_hash
  export _root_.rocksdb.functions.rocksdb_cuckoo_options_set_max_search_depth
  export _root_.rocksdb.functions.rocksdb_cuckoo_options_set_use_module_hash
  export _root_.rocksdb.functions.rocksdb_dbpath_create
  export _root_.rocksdb.functions.rocksdb_dbpath_destroy
  export _root_.rocksdb.functions.rocksdb_delete
  export _root_.rocksdb.functions.rocksdb_delete_cf
  export _root_.rocksdb.functions.rocksdb_delete_cf_with_ts
  export _root_.rocksdb.functions.rocksdb_delete_file
  export _root_.rocksdb.functions.rocksdb_delete_file_in_range
  export _root_.rocksdb.functions.rocksdb_delete_file_in_range_cf
  export _root_.rocksdb.functions.rocksdb_delete_range_cf
  export _root_.rocksdb.functions.rocksdb_delete_with_ts
  export _root_.rocksdb.functions.rocksdb_destroy_db
  export _root_.rocksdb.functions.rocksdb_disable_file_deletions
  export _root_.rocksdb.functions.rocksdb_disable_manual_compaction
  export _root_.rocksdb.functions.rocksdb_drop_column_family
  export _root_.rocksdb.functions.rocksdb_enable_file_deletions
  export _root_.rocksdb.functions.rocksdb_enable_manual_compaction
  export _root_.rocksdb.functions.rocksdb_env_destroy
  export _root_.rocksdb.functions.rocksdb_env_get_background_threads
  export _root_.rocksdb.functions.rocksdb_env_get_bottom_priority_background_threads
  export _root_.rocksdb.functions.rocksdb_env_get_high_priority_background_threads
  export _root_.rocksdb.functions.rocksdb_env_get_low_priority_background_threads
  export _root_.rocksdb.functions.rocksdb_env_join_all_threads
  export _root_.rocksdb.functions.rocksdb_env_lower_high_priority_thread_pool_cpu_priority
  export _root_.rocksdb.functions.rocksdb_env_lower_high_priority_thread_pool_io_priority
  export _root_.rocksdb.functions.rocksdb_env_lower_thread_pool_cpu_priority
  export _root_.rocksdb.functions.rocksdb_env_lower_thread_pool_io_priority
  export _root_.rocksdb.functions.rocksdb_env_set_background_threads
  export _root_.rocksdb.functions.rocksdb_env_set_bottom_priority_background_threads
  export _root_.rocksdb.functions.rocksdb_env_set_high_priority_background_threads
  export _root_.rocksdb.functions.rocksdb_env_set_low_priority_background_threads
  export _root_.rocksdb.functions.rocksdb_envoptions_create
  export _root_.rocksdb.functions.rocksdb_envoptions_destroy
  export _root_.rocksdb.functions.rocksdb_fifo_compaction_options_create
  export _root_.rocksdb.functions.rocksdb_fifo_compaction_options_destroy
  export _root_.rocksdb.functions.rocksdb_fifo_compaction_options_get_max_table_files_size
  export _root_.rocksdb.functions.rocksdb_fifo_compaction_options_set_max_table_files_size
  export _root_.rocksdb.functions.rocksdb_filterpolicy_create_bloom
  export _root_.rocksdb.functions.rocksdb_filterpolicy_create_bloom_full
  export _root_.rocksdb.functions.rocksdb_filterpolicy_create_ribbon
  export _root_.rocksdb.functions.rocksdb_filterpolicy_create_ribbon_hybrid
  export _root_.rocksdb.functions.rocksdb_filterpolicy_destroy
  export _root_.rocksdb.functions.rocksdb_flush
  export _root_.rocksdb.functions.rocksdb_flush_cf
  export _root_.rocksdb.functions.rocksdb_flush_wal
  export _root_.rocksdb.functions.rocksdb_flushoptions_create
  export _root_.rocksdb.functions.rocksdb_flushoptions_destroy
  export _root_.rocksdb.functions.rocksdb_flushoptions_get_wait
  export _root_.rocksdb.functions.rocksdb_flushoptions_set_wait
  export _root_.rocksdb.functions.rocksdb_free
  export _root_.rocksdb.functions.rocksdb_get
  export _root_.rocksdb.functions.rocksdb_get_cf
  export _root_.rocksdb.functions.rocksdb_get_cf_with_ts
  export _root_.rocksdb.functions.rocksdb_get_column_family_metadata
  export _root_.rocksdb.functions.rocksdb_get_column_family_metadata_cf
  export _root_.rocksdb.functions.rocksdb_get_full_history_ts_low
  export _root_.rocksdb.functions.rocksdb_get_latest_sequence_number
  export _root_.rocksdb.functions.rocksdb_get_options_from_string
  export _root_.rocksdb.functions.rocksdb_get_pinned
  export _root_.rocksdb.functions.rocksdb_get_pinned_cf
  export _root_.rocksdb.functions.rocksdb_get_updates_since
  export _root_.rocksdb.functions.rocksdb_get_with_ts
  export _root_.rocksdb.functions.rocksdb_increase_full_history_ts_low
  export _root_.rocksdb.functions.rocksdb_ingest_external_file
  export _root_.rocksdb.functions.rocksdb_ingest_external_file_cf
  export _root_.rocksdb.functions.rocksdb_ingestexternalfileoptions_create
  export _root_.rocksdb.functions.rocksdb_ingestexternalfileoptions_destroy
  export _root_.rocksdb.functions.rocksdb_ingestexternalfileoptions_set_allow_blocking_flush
  export _root_.rocksdb.functions.rocksdb_ingestexternalfileoptions_set_allow_global_seqno
  export _root_.rocksdb.functions.rocksdb_ingestexternalfileoptions_set_ingest_behind
  export _root_.rocksdb.functions.rocksdb_ingestexternalfileoptions_set_move_files
  export _root_.rocksdb.functions.rocksdb_ingestexternalfileoptions_set_snapshot_consistency
  export _root_.rocksdb.functions.rocksdb_iter_destroy
  export _root_.rocksdb.functions.rocksdb_iter_get_error
  export _root_.rocksdb.functions.rocksdb_iter_key
  export _root_.rocksdb.functions.rocksdb_iter_next
  export _root_.rocksdb.functions.rocksdb_iter_prev
  export _root_.rocksdb.functions.rocksdb_iter_seek
  export _root_.rocksdb.functions.rocksdb_iter_seek_for_prev
  export _root_.rocksdb.functions.rocksdb_iter_seek_to_first
  export _root_.rocksdb.functions.rocksdb_iter_seek_to_last
  export _root_.rocksdb.functions.rocksdb_iter_timestamp
  export _root_.rocksdb.functions.rocksdb_iter_valid
  export _root_.rocksdb.functions.rocksdb_iter_value
  export _root_.rocksdb.functions.rocksdb_jemalloc_nodump_allocator_create
  export _root_.rocksdb.functions.rocksdb_key_may_exist
  export _root_.rocksdb.functions.rocksdb_key_may_exist_cf
  export _root_.rocksdb.functions.rocksdb_level_metadata_destroy
  export _root_.rocksdb.functions.rocksdb_level_metadata_get_file_count
  export _root_.rocksdb.functions.rocksdb_level_metadata_get_level
  export _root_.rocksdb.functions.rocksdb_level_metadata_get_size
  export _root_.rocksdb.functions.rocksdb_level_metadata_get_sst_file_metadata
  export _root_.rocksdb.functions.rocksdb_list_column_families
  export _root_.rocksdb.functions.rocksdb_list_column_families_destroy
  export _root_.rocksdb.functions.rocksdb_livefiles
  export _root_.rocksdb.functions.rocksdb_livefiles_column_family_name
  export _root_.rocksdb.functions.rocksdb_livefiles_count
  export _root_.rocksdb.functions.rocksdb_livefiles_deletions
  export _root_.rocksdb.functions.rocksdb_livefiles_destroy
  export _root_.rocksdb.functions.rocksdb_livefiles_entries
  export _root_.rocksdb.functions.rocksdb_livefiles_largestkey
  export _root_.rocksdb.functions.rocksdb_livefiles_level
  export _root_.rocksdb.functions.rocksdb_livefiles_name
  export _root_.rocksdb.functions.rocksdb_livefiles_size
  export _root_.rocksdb.functions.rocksdb_livefiles_smallestkey
  export _root_.rocksdb.functions.rocksdb_load_latest_options
  export _root_.rocksdb.functions.rocksdb_load_latest_options_destroy
  export _root_.rocksdb.functions.rocksdb_lru_cache_options_create
  export _root_.rocksdb.functions.rocksdb_lru_cache_options_destroy
  export _root_.rocksdb.functions.rocksdb_lru_cache_options_set_capacity
  export _root_.rocksdb.functions.rocksdb_lru_cache_options_set_memory_allocator
  export _root_.rocksdb.functions.rocksdb_lru_cache_options_set_num_shard_bits
  export _root_.rocksdb.functions.rocksdb_memory_allocator_destroy
  export _root_.rocksdb.functions.rocksdb_memory_consumers_add_cache
  export _root_.rocksdb.functions.rocksdb_memory_consumers_add_db
  export _root_.rocksdb.functions.rocksdb_memory_consumers_create
  export _root_.rocksdb.functions.rocksdb_memory_consumers_destroy
  export _root_.rocksdb.functions.rocksdb_merge
  export _root_.rocksdb.functions.rocksdb_merge_cf
  export _root_.rocksdb.functions.rocksdb_mergeoperator_create
  export _root_.rocksdb.functions.rocksdb_mergeoperator_destroy
  export _root_.rocksdb.functions.rocksdb_multi_get
  export _root_.rocksdb.functions.rocksdb_multi_get_cf
  export _root_.rocksdb.functions.rocksdb_multi_get_cf_with_ts
  export _root_.rocksdb.functions.rocksdb_multi_get_with_ts
  export _root_.rocksdb.functions.rocksdb_open
  export _root_.rocksdb.functions.rocksdb_open_and_trim_history
  export _root_.rocksdb.functions.rocksdb_open_as_secondary
  export _root_.rocksdb.functions.rocksdb_open_as_secondary_column_families
  export _root_.rocksdb.functions.rocksdb_open_column_families
  export _root_.rocksdb.functions.rocksdb_open_column_families_with_ttl
  export _root_.rocksdb.functions.rocksdb_open_for_read_only
  export _root_.rocksdb.functions.rocksdb_open_for_read_only_column_families
  export _root_.rocksdb.functions.rocksdb_open_with_ttl
  export _root_.rocksdb.functions.rocksdb_optimistictransaction_begin
  export _root_.rocksdb.functions.rocksdb_optimistictransaction_options_create
  export _root_.rocksdb.functions.rocksdb_optimistictransaction_options_destroy
  export _root_.rocksdb.functions.rocksdb_optimistictransaction_options_set_set_snapshot
  export _root_.rocksdb.functions.rocksdb_optimistictransactiondb_checkpoint_object_create
  export _root_.rocksdb.functions.rocksdb_optimistictransactiondb_close
  export _root_.rocksdb.functions.rocksdb_optimistictransactiondb_close_base_db
  export _root_.rocksdb.functions.rocksdb_optimistictransactiondb_get_base_db
  export _root_.rocksdb.functions.rocksdb_optimistictransactiondb_open
  export _root_.rocksdb.functions.rocksdb_optimistictransactiondb_open_column_families
  export _root_.rocksdb.functions.rocksdb_optimistictransactiondb_property_int
  export _root_.rocksdb.functions.rocksdb_optimistictransactiondb_property_value
  export _root_.rocksdb.functions.rocksdb_optimistictransactiondb_write
  export _root_.rocksdb.functions.rocksdb_options_add_compact_on_deletion_collector_factory
  export _root_.rocksdb.functions.rocksdb_options_compaction_readahead_size
  export _root_.rocksdb.functions.rocksdb_options_create
  export _root_.rocksdb.functions.rocksdb_options_create_copy
  export _root_.rocksdb.functions.rocksdb_options_destroy
  export _root_.rocksdb.functions.rocksdb_options_enable_statistics
  export _root_.rocksdb.functions.rocksdb_options_get_WAL_size_limit_MB
  export _root_.rocksdb.functions.rocksdb_options_get_WAL_ttl_seconds
  export _root_.rocksdb.functions.rocksdb_options_get_access_hint_on_compaction_start
  export _root_.rocksdb.functions.rocksdb_options_get_advise_random_on_open
  export _root_.rocksdb.functions.rocksdb_options_get_allow_concurrent_memtable_write
  export _root_.rocksdb.functions.rocksdb_options_get_allow_ingest_behind
  export _root_.rocksdb.functions.rocksdb_options_get_allow_mmap_reads
  export _root_.rocksdb.functions.rocksdb_options_get_allow_mmap_writes
  export _root_.rocksdb.functions.rocksdb_options_get_arena_block_size
  export _root_.rocksdb.functions.rocksdb_options_get_atomic_flush
  export _root_.rocksdb.functions.rocksdb_options_get_avoid_unnecessary_blocking_io
  export _root_.rocksdb.functions.rocksdb_options_get_blob_compaction_readahead_size
  export _root_.rocksdb.functions.rocksdb_options_get_blob_compression_type
  export _root_.rocksdb.functions.rocksdb_options_get_blob_file_size
  export _root_.rocksdb.functions.rocksdb_options_get_blob_file_starting_level
  export _root_.rocksdb.functions.rocksdb_options_get_blob_gc_age_cutoff
  export _root_.rocksdb.functions.rocksdb_options_get_blob_gc_force_threshold
  export _root_.rocksdb.functions.rocksdb_options_get_bloom_locality
  export _root_.rocksdb.functions.rocksdb_options_get_bottommost_compression
  export _root_.rocksdb.functions.rocksdb_options_get_bottommost_compression_options_use_zstd_dict_trainer
  export _root_.rocksdb.functions.rocksdb_options_get_bytes_per_sync
  export _root_.rocksdb.functions.rocksdb_options_get_compaction_readahead_size
  export _root_.rocksdb.functions.rocksdb_options_get_compaction_style
  export _root_.rocksdb.functions.rocksdb_options_get_compression
  export _root_.rocksdb.functions.rocksdb_options_get_compression_options_max_dict_buffer_bytes
  export _root_.rocksdb.functions.rocksdb_options_get_compression_options_parallel_threads
  export _root_.rocksdb.functions.rocksdb_options_get_compression_options_use_zstd_dict_trainer
  export _root_.rocksdb.functions.rocksdb_options_get_compression_options_zstd_max_train_bytes
  export _root_.rocksdb.functions.rocksdb_options_get_create_if_missing
  export _root_.rocksdb.functions.rocksdb_options_get_create_missing_column_families
  export _root_.rocksdb.functions.rocksdb_options_get_db_write_buffer_size
  export _root_.rocksdb.functions.rocksdb_options_get_delete_obsolete_files_period_micros
  export _root_.rocksdb.functions.rocksdb_options_get_disable_auto_compactions
  export _root_.rocksdb.functions.rocksdb_options_get_enable_blob_files
  export _root_.rocksdb.functions.rocksdb_options_get_enable_blob_gc
  export _root_.rocksdb.functions.rocksdb_options_get_enable_pipelined_write
  export _root_.rocksdb.functions.rocksdb_options_get_enable_write_thread_adaptive_yield
  export _root_.rocksdb.functions.rocksdb_options_get_error_if_exists
  export _root_.rocksdb.functions.rocksdb_options_get_experimental_mempurge_threshold
  export _root_.rocksdb.functions.rocksdb_options_get_hard_pending_compaction_bytes_limit
  export _root_.rocksdb.functions.rocksdb_options_get_info_log_level
  export _root_.rocksdb.functions.rocksdb_options_get_inplace_update_num_locks
  export _root_.rocksdb.functions.rocksdb_options_get_inplace_update_support
  export _root_.rocksdb.functions.rocksdb_options_get_is_fd_close_on_exec
  export _root_.rocksdb.functions.rocksdb_options_get_keep_log_file_num
  export _root_.rocksdb.functions.rocksdb_options_get_level0_file_num_compaction_trigger
  export _root_.rocksdb.functions.rocksdb_options_get_level0_slowdown_writes_trigger
  export _root_.rocksdb.functions.rocksdb_options_get_level0_stop_writes_trigger
  export _root_.rocksdb.functions.rocksdb_options_get_level_compaction_dynamic_level_bytes
  export _root_.rocksdb.functions.rocksdb_options_get_log_file_time_to_roll
  export _root_.rocksdb.functions.rocksdb_options_get_manifest_preallocation_size
  export _root_.rocksdb.functions.rocksdb_options_get_manual_wal_flush
  export _root_.rocksdb.functions.rocksdb_options_get_max_background_compactions
  export _root_.rocksdb.functions.rocksdb_options_get_max_background_flushes
  export _root_.rocksdb.functions.rocksdb_options_get_max_background_jobs
  export _root_.rocksdb.functions.rocksdb_options_get_max_bytes_for_level_base
  export _root_.rocksdb.functions.rocksdb_options_get_max_bytes_for_level_multiplier
  export _root_.rocksdb.functions.rocksdb_options_get_max_compaction_bytes
  export _root_.rocksdb.functions.rocksdb_options_get_max_file_opening_threads
  export _root_.rocksdb.functions.rocksdb_options_get_max_log_file_size
  export _root_.rocksdb.functions.rocksdb_options_get_max_manifest_file_size
  export _root_.rocksdb.functions.rocksdb_options_get_max_open_files
  export _root_.rocksdb.functions.rocksdb_options_get_max_sequential_skip_in_iterations
  export _root_.rocksdb.functions.rocksdb_options_get_max_subcompactions
  export _root_.rocksdb.functions.rocksdb_options_get_max_successive_merges
  export _root_.rocksdb.functions.rocksdb_options_get_max_total_wal_size
  export _root_.rocksdb.functions.rocksdb_options_get_max_write_buffer_number
  export _root_.rocksdb.functions.rocksdb_options_get_max_write_buffer_number_to_maintain
  export _root_.rocksdb.functions.rocksdb_options_get_max_write_buffer_size_to_maintain
  export _root_.rocksdb.functions.rocksdb_options_get_memtable_huge_page_size
  export _root_.rocksdb.functions.rocksdb_options_get_memtable_prefix_bloom_size_ratio
  export _root_.rocksdb.functions.rocksdb_options_get_min_blob_size
  export _root_.rocksdb.functions.rocksdb_options_get_min_write_buffer_number_to_merge
  export _root_.rocksdb.functions.rocksdb_options_get_num_levels
  export _root_.rocksdb.functions.rocksdb_options_get_optimize_filters_for_hits
  export _root_.rocksdb.functions.rocksdb_options_get_paranoid_checks
  export _root_.rocksdb.functions.rocksdb_options_get_prepopulate_blob_cache
  export _root_.rocksdb.functions.rocksdb_options_get_recycle_log_file_num
  export _root_.rocksdb.functions.rocksdb_options_get_report_bg_io_stats
  export _root_.rocksdb.functions.rocksdb_options_get_skip_checking_sst_file_sizes_on_db_open
  export _root_.rocksdb.functions.rocksdb_options_get_skip_stats_update_on_db_open
  export _root_.rocksdb.functions.rocksdb_options_get_soft_pending_compaction_bytes_limit
  export _root_.rocksdb.functions.rocksdb_options_get_stats_dump_period_sec
  export _root_.rocksdb.functions.rocksdb_options_get_stats_persist_period_sec
  export _root_.rocksdb.functions.rocksdb_options_get_table_cache_numshardbits
  export _root_.rocksdb.functions.rocksdb_options_get_target_file_size_base
  export _root_.rocksdb.functions.rocksdb_options_get_target_file_size_multiplier
  export _root_.rocksdb.functions.rocksdb_options_get_unordered_write
  export _root_.rocksdb.functions.rocksdb_options_get_use_adaptive_mutex
  export _root_.rocksdb.functions.rocksdb_options_get_use_direct_io_for_flush_and_compaction
  export _root_.rocksdb.functions.rocksdb_options_get_use_direct_reads
  export _root_.rocksdb.functions.rocksdb_options_get_use_fsync
  export _root_.rocksdb.functions.rocksdb_options_get_wal_bytes_per_sync
  export _root_.rocksdb.functions.rocksdb_options_get_wal_compression
  export _root_.rocksdb.functions.rocksdb_options_get_wal_recovery_mode
  export _root_.rocksdb.functions.rocksdb_options_get_writable_file_max_buffer_size
  export _root_.rocksdb.functions.rocksdb_options_get_write_buffer_size
  export _root_.rocksdb.functions.rocksdb_options_increase_parallelism
  export _root_.rocksdb.functions.rocksdb_options_optimize_for_point_lookup
  export _root_.rocksdb.functions.rocksdb_options_optimize_level_style_compaction
  export _root_.rocksdb.functions.rocksdb_options_optimize_universal_style_compaction
  export _root_.rocksdb.functions.rocksdb_options_prepare_for_bulk_load
  export _root_.rocksdb.functions.rocksdb_options_set_WAL_size_limit_MB
  export _root_.rocksdb.functions.rocksdb_options_set_WAL_ttl_seconds
  export _root_.rocksdb.functions.rocksdb_options_set_access_hint_on_compaction_start
  export _root_.rocksdb.functions.rocksdb_options_set_advise_random_on_open
  export _root_.rocksdb.functions.rocksdb_options_set_allow_concurrent_memtable_write
  export _root_.rocksdb.functions.rocksdb_options_set_allow_ingest_behind
  export _root_.rocksdb.functions.rocksdb_options_set_allow_mmap_reads
  export _root_.rocksdb.functions.rocksdb_options_set_allow_mmap_writes
  export _root_.rocksdb.functions.rocksdb_options_set_arena_block_size
  export _root_.rocksdb.functions.rocksdb_options_set_atomic_flush
  export _root_.rocksdb.functions.rocksdb_options_set_avoid_unnecessary_blocking_io
  export _root_.rocksdb.functions.rocksdb_options_set_blob_cache
  export _root_.rocksdb.functions.rocksdb_options_set_blob_compaction_readahead_size
  export _root_.rocksdb.functions.rocksdb_options_set_blob_compression_type
  export _root_.rocksdb.functions.rocksdb_options_set_blob_file_size
  export _root_.rocksdb.functions.rocksdb_options_set_blob_file_starting_level
  export _root_.rocksdb.functions.rocksdb_options_set_blob_gc_age_cutoff
  export _root_.rocksdb.functions.rocksdb_options_set_blob_gc_force_threshold
  export _root_.rocksdb.functions.rocksdb_options_set_block_based_table_factory
  export _root_.rocksdb.functions.rocksdb_options_set_bloom_locality
  export _root_.rocksdb.functions.rocksdb_options_set_bottommost_compression
  export _root_.rocksdb.functions.rocksdb_options_set_bottommost_compression_options
  export _root_.rocksdb.functions.rocksdb_options_set_bottommost_compression_options_max_dict_buffer_bytes
  export _root_.rocksdb.functions.rocksdb_options_set_bottommost_compression_options_use_zstd_dict_trainer
  export _root_.rocksdb.functions.rocksdb_options_set_bottommost_compression_options_zstd_max_train_bytes
  export _root_.rocksdb.functions.rocksdb_options_set_bytes_per_sync
  export _root_.rocksdb.functions.rocksdb_options_set_compaction_filter
  export _root_.rocksdb.functions.rocksdb_options_set_compaction_filter_factory
  export _root_.rocksdb.functions.rocksdb_options_set_compaction_style
  export _root_.rocksdb.functions.rocksdb_options_set_comparator
  export _root_.rocksdb.functions.rocksdb_options_set_compression
  export _root_.rocksdb.functions.rocksdb_options_set_compression_options
  export _root_.rocksdb.functions.rocksdb_options_set_compression_options_max_dict_buffer_bytes
  export _root_.rocksdb.functions.rocksdb_options_set_compression_options_parallel_threads
  export _root_.rocksdb.functions.rocksdb_options_set_compression_options_use_zstd_dict_trainer
  export _root_.rocksdb.functions.rocksdb_options_set_compression_options_zstd_max_train_bytes
  export _root_.rocksdb.functions.rocksdb_options_set_compression_per_level
  export _root_.rocksdb.functions.rocksdb_options_set_create_if_missing
  export _root_.rocksdb.functions.rocksdb_options_set_create_missing_column_families
  export _root_.rocksdb.functions.rocksdb_options_set_cuckoo_table_factory
  export _root_.rocksdb.functions.rocksdb_options_set_db_log_dir
  export _root_.rocksdb.functions.rocksdb_options_set_db_paths
  export _root_.rocksdb.functions.rocksdb_options_set_db_write_buffer_size
  export _root_.rocksdb.functions.rocksdb_options_set_delete_obsolete_files_period_micros
  export _root_.rocksdb.functions.rocksdb_options_set_disable_auto_compactions
  export _root_.rocksdb.functions.rocksdb_options_set_dump_malloc_stats
  export _root_.rocksdb.functions.rocksdb_options_set_enable_blob_files
  export _root_.rocksdb.functions.rocksdb_options_set_enable_blob_gc
  export _root_.rocksdb.functions.rocksdb_options_set_enable_pipelined_write
  export _root_.rocksdb.functions.rocksdb_options_set_enable_write_thread_adaptive_yield
  export _root_.rocksdb.functions.rocksdb_options_set_env
  export _root_.rocksdb.functions.rocksdb_options_set_error_if_exists
  export _root_.rocksdb.functions.rocksdb_options_set_experimental_mempurge_threshold
  export _root_.rocksdb.functions.rocksdb_options_set_fifo_compaction_options
  export _root_.rocksdb.functions.rocksdb_options_set_hard_pending_compaction_bytes_limit
  export _root_.rocksdb.functions.rocksdb_options_set_hash_link_list_rep
  export _root_.rocksdb.functions.rocksdb_options_set_hash_skip_list_rep
  export _root_.rocksdb.functions.rocksdb_options_set_info_log
  export _root_.rocksdb.functions.rocksdb_options_set_info_log_level
  export _root_.rocksdb.functions.rocksdb_options_set_inplace_update_num_locks
  export _root_.rocksdb.functions.rocksdb_options_set_inplace_update_support
  export _root_.rocksdb.functions.rocksdb_options_set_is_fd_close_on_exec
  export _root_.rocksdb.functions.rocksdb_options_set_keep_log_file_num
  export _root_.rocksdb.functions.rocksdb_options_set_level0_file_num_compaction_trigger
  export _root_.rocksdb.functions.rocksdb_options_set_level0_slowdown_writes_trigger
  export _root_.rocksdb.functions.rocksdb_options_set_level0_stop_writes_trigger
  export _root_.rocksdb.functions.rocksdb_options_set_level_compaction_dynamic_level_bytes
  export _root_.rocksdb.functions.rocksdb_options_set_log_file_time_to_roll
  export _root_.rocksdb.functions.rocksdb_options_set_manifest_preallocation_size
  export _root_.rocksdb.functions.rocksdb_options_set_manual_wal_flush
  export _root_.rocksdb.functions.rocksdb_options_set_max_background_compactions
  export _root_.rocksdb.functions.rocksdb_options_set_max_background_flushes
  export _root_.rocksdb.functions.rocksdb_options_set_max_background_jobs
  export _root_.rocksdb.functions.rocksdb_options_set_max_bytes_for_level_base
  export _root_.rocksdb.functions.rocksdb_options_set_max_bytes_for_level_multiplier
  export _root_.rocksdb.functions.rocksdb_options_set_max_bytes_for_level_multiplier_additional
  export _root_.rocksdb.functions.rocksdb_options_set_max_compaction_bytes
  export _root_.rocksdb.functions.rocksdb_options_set_max_file_opening_threads
  export _root_.rocksdb.functions.rocksdb_options_set_max_log_file_size
  export _root_.rocksdb.functions.rocksdb_options_set_max_manifest_file_size
  export _root_.rocksdb.functions.rocksdb_options_set_max_open_files
  export _root_.rocksdb.functions.rocksdb_options_set_max_sequential_skip_in_iterations
  export _root_.rocksdb.functions.rocksdb_options_set_max_subcompactions
  export _root_.rocksdb.functions.rocksdb_options_set_max_successive_merges
  export _root_.rocksdb.functions.rocksdb_options_set_max_total_wal_size
  export _root_.rocksdb.functions.rocksdb_options_set_max_write_buffer_number
  export _root_.rocksdb.functions.rocksdb_options_set_max_write_buffer_number_to_maintain
  export _root_.rocksdb.functions.rocksdb_options_set_max_write_buffer_size_to_maintain
  export _root_.rocksdb.functions.rocksdb_options_set_memtable_huge_page_size
  export _root_.rocksdb.functions.rocksdb_options_set_memtable_prefix_bloom_size_ratio
  export _root_.rocksdb.functions.rocksdb_options_set_memtable_vector_rep
  export _root_.rocksdb.functions.rocksdb_options_set_memtable_whole_key_filtering
  export _root_.rocksdb.functions.rocksdb_options_set_merge_operator
  export _root_.rocksdb.functions.rocksdb_options_set_min_blob_size
  export _root_.rocksdb.functions.rocksdb_options_set_min_level_to_compress
  export _root_.rocksdb.functions.rocksdb_options_set_min_write_buffer_number_to_merge
  export _root_.rocksdb.functions.rocksdb_options_set_num_levels
  export _root_.rocksdb.functions.rocksdb_options_set_optimize_filters_for_hits
  export _root_.rocksdb.functions.rocksdb_options_set_paranoid_checks
  export _root_.rocksdb.functions.rocksdb_options_set_plain_table_factory
  export _root_.rocksdb.functions.rocksdb_options_set_prefix_extractor
  export _root_.rocksdb.functions.rocksdb_options_set_prepopulate_blob_cache
  export _root_.rocksdb.functions.rocksdb_options_set_ratelimiter
  export _root_.rocksdb.functions.rocksdb_options_set_recycle_log_file_num
  export _root_.rocksdb.functions.rocksdb_options_set_report_bg_io_stats
  export _root_.rocksdb.functions.rocksdb_options_set_row_cache
  export _root_.rocksdb.functions.rocksdb_options_set_skip_checking_sst_file_sizes_on_db_open
  export _root_.rocksdb.functions.rocksdb_options_set_skip_stats_update_on_db_open
  export _root_.rocksdb.functions.rocksdb_options_set_soft_pending_compaction_bytes_limit
  export _root_.rocksdb.functions.rocksdb_options_set_stats_dump_period_sec
  export _root_.rocksdb.functions.rocksdb_options_set_stats_persist_period_sec
  export _root_.rocksdb.functions.rocksdb_options_set_table_cache_numshardbits
  export _root_.rocksdb.functions.rocksdb_options_set_target_file_size_base
  export _root_.rocksdb.functions.rocksdb_options_set_target_file_size_multiplier
  export _root_.rocksdb.functions.rocksdb_options_set_uint64add_merge_operator
  export _root_.rocksdb.functions.rocksdb_options_set_universal_compaction_options
  export _root_.rocksdb.functions.rocksdb_options_set_unordered_write
  export _root_.rocksdb.functions.rocksdb_options_set_use_adaptive_mutex
  export _root_.rocksdb.functions.rocksdb_options_set_use_direct_io_for_flush_and_compaction
  export _root_.rocksdb.functions.rocksdb_options_set_use_direct_reads
  export _root_.rocksdb.functions.rocksdb_options_set_use_fsync
  export _root_.rocksdb.functions.rocksdb_options_set_wal_bytes_per_sync
  export _root_.rocksdb.functions.rocksdb_options_set_wal_compression
  export _root_.rocksdb.functions.rocksdb_options_set_wal_dir
  export _root_.rocksdb.functions.rocksdb_options_set_wal_recovery_mode
  export _root_.rocksdb.functions.rocksdb_options_set_writable_file_max_buffer_size
  export _root_.rocksdb.functions.rocksdb_options_set_write_buffer_size
  export _root_.rocksdb.functions.rocksdb_options_statistics_get_string
  export _root_.rocksdb.functions.rocksdb_perfcontext_create
  export _root_.rocksdb.functions.rocksdb_perfcontext_destroy
  export _root_.rocksdb.functions.rocksdb_perfcontext_metric
  export _root_.rocksdb.functions.rocksdb_perfcontext_report
  export _root_.rocksdb.functions.rocksdb_perfcontext_reset
  export _root_.rocksdb.functions.rocksdb_pinnableslice_destroy
  export _root_.rocksdb.functions.rocksdb_pinnableslice_value
  export _root_.rocksdb.functions.rocksdb_property_int
  export _root_.rocksdb.functions.rocksdb_property_int_cf
  export _root_.rocksdb.functions.rocksdb_property_value
  export _root_.rocksdb.functions.rocksdb_property_value_cf
  export _root_.rocksdb.functions.rocksdb_put
  export _root_.rocksdb.functions.rocksdb_put_cf
  export _root_.rocksdb.functions.rocksdb_put_cf_with_ts
  export _root_.rocksdb.functions.rocksdb_put_with_ts
  export _root_.rocksdb.functions.rocksdb_ratelimiter_create
  export _root_.rocksdb.functions.rocksdb_ratelimiter_destroy
  export _root_.rocksdb.functions.rocksdb_readoptions_create
  export _root_.rocksdb.functions.rocksdb_readoptions_destroy
  export _root_.rocksdb.functions.rocksdb_readoptions_get_async_io
  export _root_.rocksdb.functions.rocksdb_readoptions_get_background_purge_on_iterator_cleanup
  export _root_.rocksdb.functions.rocksdb_readoptions_get_deadline
  export _root_.rocksdb.functions.rocksdb_readoptions_get_fill_cache
  export _root_.rocksdb.functions.rocksdb_readoptions_get_ignore_range_deletions
  export _root_.rocksdb.functions.rocksdb_readoptions_get_io_timeout
  export _root_.rocksdb.functions.rocksdb_readoptions_get_max_skippable_internal_keys
  export _root_.rocksdb.functions.rocksdb_readoptions_get_pin_data
  export _root_.rocksdb.functions.rocksdb_readoptions_get_prefix_same_as_start
  export _root_.rocksdb.functions.rocksdb_readoptions_get_read_tier
  export _root_.rocksdb.functions.rocksdb_readoptions_get_readahead_size
  export _root_.rocksdb.functions.rocksdb_readoptions_get_tailing
  export _root_.rocksdb.functions.rocksdb_readoptions_get_total_order_seek
  export _root_.rocksdb.functions.rocksdb_readoptions_get_verify_checksums
  export _root_.rocksdb.functions.rocksdb_readoptions_set_async_io
  export _root_.rocksdb.functions.rocksdb_readoptions_set_background_purge_on_iterator_cleanup
  export _root_.rocksdb.functions.rocksdb_readoptions_set_deadline
  export _root_.rocksdb.functions.rocksdb_readoptions_set_fill_cache
  export _root_.rocksdb.functions.rocksdb_readoptions_set_ignore_range_deletions
  export _root_.rocksdb.functions.rocksdb_readoptions_set_io_timeout
  export _root_.rocksdb.functions.rocksdb_readoptions_set_iter_start_ts
  export _root_.rocksdb.functions.rocksdb_readoptions_set_iterate_lower_bound
  export _root_.rocksdb.functions.rocksdb_readoptions_set_iterate_upper_bound
  export _root_.rocksdb.functions.rocksdb_readoptions_set_managed
  export _root_.rocksdb.functions.rocksdb_readoptions_set_max_skippable_internal_keys
  export _root_.rocksdb.functions.rocksdb_readoptions_set_pin_data
  export _root_.rocksdb.functions.rocksdb_readoptions_set_prefix_same_as_start
  export _root_.rocksdb.functions.rocksdb_readoptions_set_read_tier
  export _root_.rocksdb.functions.rocksdb_readoptions_set_readahead_size
  export _root_.rocksdb.functions.rocksdb_readoptions_set_snapshot
  export _root_.rocksdb.functions.rocksdb_readoptions_set_tailing
  export _root_.rocksdb.functions.rocksdb_readoptions_set_timestamp
  export _root_.rocksdb.functions.rocksdb_readoptions_set_total_order_seek
  export _root_.rocksdb.functions.rocksdb_readoptions_set_verify_checksums
  export _root_.rocksdb.functions.rocksdb_release_snapshot
  export _root_.rocksdb.functions.rocksdb_repair_db
  export _root_.rocksdb.functions.rocksdb_restore_options_create
  export _root_.rocksdb.functions.rocksdb_restore_options_destroy
  export _root_.rocksdb.functions.rocksdb_restore_options_set_keep_log_files
  export _root_.rocksdb.functions.rocksdb_set_options
  export _root_.rocksdb.functions.rocksdb_set_options_cf
  export _root_.rocksdb.functions.rocksdb_set_perf_level
  export _root_.rocksdb.functions.rocksdb_singledelete
  export _root_.rocksdb.functions.rocksdb_singledelete_cf
  export _root_.rocksdb.functions.rocksdb_singledelete_cf_with_ts
  export _root_.rocksdb.functions.rocksdb_singledelete_with_ts
  export _root_.rocksdb.functions.rocksdb_slicetransform_create
  export _root_.rocksdb.functions.rocksdb_slicetransform_create_fixed_prefix
  export _root_.rocksdb.functions.rocksdb_slicetransform_create_noop
  export _root_.rocksdb.functions.rocksdb_slicetransform_destroy
  export _root_.rocksdb.functions.rocksdb_sst_file_metadata_destroy
  export _root_.rocksdb.functions.rocksdb_sst_file_metadata_get_largestkey
  export _root_.rocksdb.functions.rocksdb_sst_file_metadata_get_relative_filename
  export _root_.rocksdb.functions.rocksdb_sst_file_metadata_get_size
  export _root_.rocksdb.functions.rocksdb_sst_file_metadata_get_smallestkey
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_add
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_create
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_create_with_comparator
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_delete
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_delete_range
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_delete_with_ts
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_destroy
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_file_size
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_finish
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_merge
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_open
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_put
  export _root_.rocksdb.functions.rocksdb_sstfilewriter_put_with_ts
  export _root_.rocksdb.functions.rocksdb_suggest_compact_range
  export _root_.rocksdb.functions.rocksdb_suggest_compact_range_cf
  export _root_.rocksdb.functions.rocksdb_transaction_begin
  export _root_.rocksdb.functions.rocksdb_transaction_commit
  export _root_.rocksdb.functions.rocksdb_transaction_create_iterator
  export _root_.rocksdb.functions.rocksdb_transaction_create_iterator_cf
  export _root_.rocksdb.functions.rocksdb_transaction_delete
  export _root_.rocksdb.functions.rocksdb_transaction_delete_cf
  export _root_.rocksdb.functions.rocksdb_transaction_destroy
  export _root_.rocksdb.functions.rocksdb_transaction_get
  export _root_.rocksdb.functions.rocksdb_transaction_get_cf
  export _root_.rocksdb.functions.rocksdb_transaction_get_for_update
  export _root_.rocksdb.functions.rocksdb_transaction_get_for_update_cf
  export _root_.rocksdb.functions.rocksdb_transaction_get_name
  export _root_.rocksdb.functions.rocksdb_transaction_get_pinned
  export _root_.rocksdb.functions.rocksdb_transaction_get_pinned_cf
  export _root_.rocksdb.functions.rocksdb_transaction_get_pinned_for_update
  export _root_.rocksdb.functions.rocksdb_transaction_get_pinned_for_update_cf
  export _root_.rocksdb.functions.rocksdb_transaction_get_snapshot
  export _root_.rocksdb.functions.rocksdb_transaction_get_writebatch_wi
  export _root_.rocksdb.functions.rocksdb_transaction_merge
  export _root_.rocksdb.functions.rocksdb_transaction_merge_cf
  export _root_.rocksdb.functions.rocksdb_transaction_multi_get
  export _root_.rocksdb.functions.rocksdb_transaction_multi_get_cf
  export _root_.rocksdb.functions.rocksdb_transaction_options_create
  export _root_.rocksdb.functions.rocksdb_transaction_options_destroy
  export _root_.rocksdb.functions.rocksdb_transaction_options_set_deadlock_detect
  export _root_.rocksdb.functions.rocksdb_transaction_options_set_deadlock_detect_depth
  export _root_.rocksdb.functions.rocksdb_transaction_options_set_expiration
  export _root_.rocksdb.functions.rocksdb_transaction_options_set_lock_timeout
  export _root_.rocksdb.functions.rocksdb_transaction_options_set_max_write_batch_size
  export _root_.rocksdb.functions.rocksdb_transaction_options_set_set_snapshot
  export _root_.rocksdb.functions.rocksdb_transaction_options_set_skip_prepare
  export _root_.rocksdb.functions.rocksdb_transaction_prepare
  export _root_.rocksdb.functions.rocksdb_transaction_put
  export _root_.rocksdb.functions.rocksdb_transaction_put_cf
  export _root_.rocksdb.functions.rocksdb_transaction_rebuild_from_writebatch
  export _root_.rocksdb.functions.rocksdb_transaction_rebuild_from_writebatch_wi
  export _root_.rocksdb.functions.rocksdb_transaction_rollback
  export _root_.rocksdb.functions.rocksdb_transaction_rollback_to_savepoint
  export _root_.rocksdb.functions.rocksdb_transaction_set_commit_timestamp
  export _root_.rocksdb.functions.rocksdb_transaction_set_name
  export _root_.rocksdb.functions.rocksdb_transaction_set_read_timestamp_for_validation
  export _root_.rocksdb.functions.rocksdb_transaction_set_savepoint
  export _root_.rocksdb.functions.rocksdb_transactiondb_checkpoint_object_create
  export _root_.rocksdb.functions.rocksdb_transactiondb_close
  export _root_.rocksdb.functions.rocksdb_transactiondb_create_column_family
  export _root_.rocksdb.functions.rocksdb_transactiondb_create_iterator
  export _root_.rocksdb.functions.rocksdb_transactiondb_create_iterator_cf
  export _root_.rocksdb.functions.rocksdb_transactiondb_create_snapshot
  export _root_.rocksdb.functions.rocksdb_transactiondb_delete
  export _root_.rocksdb.functions.rocksdb_transactiondb_delete_cf
  export _root_.rocksdb.functions.rocksdb_transactiondb_flush
  export _root_.rocksdb.functions.rocksdb_transactiondb_flush_cf
  export _root_.rocksdb.functions.rocksdb_transactiondb_flush_wal
  export _root_.rocksdb.functions.rocksdb_transactiondb_get
  export _root_.rocksdb.functions.rocksdb_transactiondb_get_cf
  export _root_.rocksdb.functions.rocksdb_transactiondb_get_pinned
  export _root_.rocksdb.functions.rocksdb_transactiondb_get_pinned_cf
  export _root_.rocksdb.functions.rocksdb_transactiondb_get_prepared_transactions
  export _root_.rocksdb.functions.rocksdb_transactiondb_merge
  export _root_.rocksdb.functions.rocksdb_transactiondb_merge_cf
  export _root_.rocksdb.functions.rocksdb_transactiondb_multi_get
  export _root_.rocksdb.functions.rocksdb_transactiondb_multi_get_cf
  export _root_.rocksdb.functions.rocksdb_transactiondb_open
  export _root_.rocksdb.functions.rocksdb_transactiondb_open_column_families
  export _root_.rocksdb.functions.rocksdb_transactiondb_options_create
  export _root_.rocksdb.functions.rocksdb_transactiondb_options_destroy
  export _root_.rocksdb.functions.rocksdb_transactiondb_options_set_default_lock_timeout
  export _root_.rocksdb.functions.rocksdb_transactiondb_options_set_max_num_locks
  export _root_.rocksdb.functions.rocksdb_transactiondb_options_set_num_stripes
  export _root_.rocksdb.functions.rocksdb_transactiondb_options_set_transaction_lock_timeout
  export _root_.rocksdb.functions.rocksdb_transactiondb_property_int
  export _root_.rocksdb.functions.rocksdb_transactiondb_property_value
  export _root_.rocksdb.functions.rocksdb_transactiondb_put
  export _root_.rocksdb.functions.rocksdb_transactiondb_put_cf
  export _root_.rocksdb.functions.rocksdb_transactiondb_release_snapshot
  export _root_.rocksdb.functions.rocksdb_transactiondb_write
  export _root_.rocksdb.functions.rocksdb_try_catch_up_with_primary
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_create
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_destroy
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_get_compression_size_percent
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_get_max_merge_width
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_get_max_size_amplification_percent
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_get_min_merge_width
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_get_size_ratio
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_get_stop_style
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_set_compression_size_percent
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_set_max_merge_width
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_set_max_size_amplification_percent
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_set_min_merge_width
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_set_size_ratio
  export _root_.rocksdb.functions.rocksdb_universal_compaction_options_set_stop_style
  export _root_.rocksdb.functions.rocksdb_wal_iter_destroy
  export _root_.rocksdb.functions.rocksdb_wal_iter_get_batch
  export _root_.rocksdb.functions.rocksdb_wal_iter_next
  export _root_.rocksdb.functions.rocksdb_wal_iter_status
  export _root_.rocksdb.functions.rocksdb_wal_iter_valid
  export _root_.rocksdb.functions.rocksdb_write
  export _root_.rocksdb.functions.rocksdb_write_writebatch_wi
  export _root_.rocksdb.functions.rocksdb_writebatch_clear
  export _root_.rocksdb.functions.rocksdb_writebatch_count
  export _root_.rocksdb.functions.rocksdb_writebatch_create
  export _root_.rocksdb.functions.rocksdb_writebatch_create_from
  export _root_.rocksdb.functions.rocksdb_writebatch_data
  export _root_.rocksdb.functions.rocksdb_writebatch_delete
  export _root_.rocksdb.functions.rocksdb_writebatch_delete_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_delete_cf_with_ts
  export _root_.rocksdb.functions.rocksdb_writebatch_delete_range
  export _root_.rocksdb.functions.rocksdb_writebatch_delete_range_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_delete_rangev
  export _root_.rocksdb.functions.rocksdb_writebatch_delete_rangev_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_deletev
  export _root_.rocksdb.functions.rocksdb_writebatch_deletev_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_destroy
  export _root_.rocksdb.functions.rocksdb_writebatch_iterate
  export _root_.rocksdb.functions.rocksdb_writebatch_merge
  export _root_.rocksdb.functions.rocksdb_writebatch_merge_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_mergev
  export _root_.rocksdb.functions.rocksdb_writebatch_mergev_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_pop_save_point
  export _root_.rocksdb.functions.rocksdb_writebatch_put
  export _root_.rocksdb.functions.rocksdb_writebatch_put_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_put_cf_with_ts
  export _root_.rocksdb.functions.rocksdb_writebatch_put_log_data
  export _root_.rocksdb.functions.rocksdb_writebatch_putv
  export _root_.rocksdb.functions.rocksdb_writebatch_putv_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_rollback_to_save_point
  export _root_.rocksdb.functions.rocksdb_writebatch_set_save_point
  export _root_.rocksdb.functions.rocksdb_writebatch_singledelete
  export _root_.rocksdb.functions.rocksdb_writebatch_singledelete_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_singledelete_cf_with_ts
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_clear
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_count
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_create
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_create_from
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_create_iterator_with_base
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_create_iterator_with_base_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_data
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_delete
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_delete_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_delete_range
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_delete_range_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_delete_rangev
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_delete_rangev_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_deletev
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_deletev_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_destroy
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_get_from_batch
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_get_from_batch_and_db
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_get_from_batch_and_db_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_get_from_batch_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_iterate
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_merge
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_merge_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_mergev
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_mergev_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_put
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_put_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_put_log_data
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_putv
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_putv_cf
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_rollback_to_save_point
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_set_save_point
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_singledelete
  export _root_.rocksdb.functions.rocksdb_writebatch_wi_singledelete_cf
  export _root_.rocksdb.functions.rocksdb_writeoptions_create
  export _root_.rocksdb.functions.rocksdb_writeoptions_destroy
  export _root_.rocksdb.functions.rocksdb_writeoptions_disable_WAL
  export _root_.rocksdb.functions.rocksdb_writeoptions_get_disable_WAL
  export _root_.rocksdb.functions.rocksdb_writeoptions_get_ignore_missing_column_families
  export _root_.rocksdb.functions.rocksdb_writeoptions_get_low_pri
  export _root_.rocksdb.functions.rocksdb_writeoptions_get_memtable_insert_hint_per_batch
  export _root_.rocksdb.functions.rocksdb_writeoptions_get_no_slowdown
  export _root_.rocksdb.functions.rocksdb_writeoptions_get_sync
  export _root_.rocksdb.functions.rocksdb_writeoptions_set_ignore_missing_column_families
  export _root_.rocksdb.functions.rocksdb_writeoptions_set_low_pri
  export _root_.rocksdb.functions.rocksdb_writeoptions_set_memtable_insert_hint_per_batch
  export _root_.rocksdb.functions.rocksdb_writeoptions_set_no_slowdown
  export _root_.rocksdb.functions.rocksdb_writeoptions_set_sync