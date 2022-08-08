package com.apache.corahdb.core.model.meta;

import java.time.Duration;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class Options {

    public final static String default_column_family_name = "cf_default";

    public final static long mem_table_size = 64 << 20;

    public final static int mem_table_nums = 5;

    // millisecond 100
    public final static Duration mem_space_wait_timeout = Duration.ofMillis(100);

    public final static int flush_batch_size = 100000;

    public final static boolean wal_mmap = false;

    public final static long value_log_file_size = 1024 << 20;

    public final static boolean value_log_mmap = false;

    public final static double value_log_gc_ratio = 0.5;

    public final static Duration value_log_gc_interval = Duration.ofMinutes(10);
}
