package com.apache.corahdb.core.model;

import java.util.concurrent.locks.StampedLock;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 * memtable 是一种数据结构（lsm），在数据被刷新到索引管理器和日志时保存数据，目前支持的数据结构时skiplist
 * 新的写入先插入memtable，而读操作会先读memtable，没有再去读磁盘，如果memtable满了，超过默认选项的 {@link com.apache.corahdb.core.model.meta.Options} 的 mem_table_size
 * 就会变得不可写并由新的memtable替换, 然后异步将满了的memtable的数据刷新到索引管理器和磁盘中，之后可以删除该memtable
 */
public class MemTable {

    private StampedLock stampedLock;

    private SkipListIterator sklIter;

    private SkipList skl;

    private LogFile wal;

    private int bytesWritten;  // 写入wal 的字节


}
