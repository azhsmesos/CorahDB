package com.apache.corahdb.core.model;

import com.apache.corahdb.core.model.meta.IndexerMeta;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 * indexer中存储的值，key和meta数据
 */
public class IndexerNode {

    private byte[] key;

    private IndexerMeta meta;

    public byte[] getKey() {
        return key;
    }

    public void setKey(byte[] key) {
        this.key = key;
    }

    public IndexerMeta getMeta() {
        return meta;
    }

    public void setMeta(IndexerMeta meta) {
        this.meta = meta;
    }
}
