package com.apache.corahdb.core.model;

import java.util.concurrent.locks.StampedLock;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 * entry 的读写都会经过它
 */
public class LogFile {

    private StampedLock stampedLock;

    private int fid;

    private long writeAt;

    public StampedLock getStampedLock() {
        return stampedLock;
    }

    public void setStampedLock(StampedLock stampedLock) {
        this.stampedLock = stampedLock;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public long getWriteAt() {
        return writeAt;
    }

    public void setWriteAt(long writeAt) {
        this.writeAt = writeAt;
    }
}
