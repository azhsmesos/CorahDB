package com.apache.corahdb.core.index;

import com.apache.corahdb.core.model.IndexerNode;
import com.apache.corahdb.core.model.meta.IndexerMeta;
import com.apache.corahdb.core.model.options.WriteOptions;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 * 索引
 */
public interface Indexer {

    void put(byte[] key, byte[] value);

    int putBatch(IndexerNode[] kv, WriteOptions opts);

    IndexerMeta get(byte[] key);

    void delete(byte[] key);

    void deleteBatch(byte[][] keys, WriteOptions opts);

    void sync();

    void close();
}
