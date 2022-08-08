package com.apache.corahdb.core.model;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 * 无锁的
 */
public class Arena {

    private long u;
    private byte[] buf;

    public long getU() {
        return u;
    }

    public void setU(long u) {
        this.u = u;
    }

    public byte[] getBuf() {
        return buf;
    }

    public void setBuf(byte[] buf) {
        this.buf = buf;
    }
}
