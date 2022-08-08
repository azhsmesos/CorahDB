package com.apache.corahdb.core.model;

import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.StampedLock;

import com.apache.corahdb.core.model.options.ColumnFamilyOptions;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 * key/value 命名空间，CorahDB中的每个键都与一个列族关联，如果没有指定默认就是cf_default
 */
public class ColumnFamily {

    private MemTable activeMem;

    private MemTable[] immuMemtable;

    private ValueLog vlog;

    private BlockingQueue<MemTable> flushMemtable; // 当active的memtable满了时，将其放入queue中去进行异步flush

    private StampedLock flushLock;

    private ColumnFamilyOptions opts;

    private StampedLock mu;

    private File[] dirLocks;

    private int closed;

    // todo 写到这儿
}
