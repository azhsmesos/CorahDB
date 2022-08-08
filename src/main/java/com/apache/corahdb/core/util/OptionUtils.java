package com.apache.corahdb.core.util;

import static com.apache.corahdb.core.model.meta.Options.default_column_family_name;
import static com.apache.corahdb.core.model.meta.Options.flush_batch_size;
import static com.apache.corahdb.core.model.meta.Options.mem_space_wait_timeout;
import static com.apache.corahdb.core.model.meta.Options.mem_table_nums;
import static com.apache.corahdb.core.model.meta.Options.mem_table_size;
import static com.apache.corahdb.core.model.meta.Options.value_log_file_size;
import static com.apache.corahdb.core.model.meta.Options.value_log_gc_interval;
import static com.apache.corahdb.core.model.meta.Options.value_log_gc_ratio;
import static com.apache.corahdb.core.model.meta.Options.value_log_mmap;
import static com.apache.corahdb.core.model.meta.Options.wal_mmap;

import com.apache.corahdb.core.model.options.ColumnFamilyOptions;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class OptionUtils {

    public static ColumnFamilyOptions defaultOptions(String path, String cfName) {
        return new ColumnFamilyOptions()
                .setDBPath(path)
                .setCfName(StringToRevert.replaceDefaultStr(default_column_family_name, cfName))
                .setMemTableSize(mem_table_size)
                .setMemTableNums(mem_table_nums)
                .setMemSpaceWaitTimeout(mem_space_wait_timeout)
                .setFlushBatchSize(flush_batch_size)
                .setWalMMAP(wal_mmap)
                .setValueLogFileSize(value_log_file_size)
                .setValueLogMMAP(value_log_mmap)
                .setValueLogGCRation(value_log_gc_ratio)
                .setValueLogGCInterval(value_log_gc_interval);
    }

}
