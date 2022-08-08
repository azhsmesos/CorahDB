package com.apache.corahdb.core.model;

import java.util.Map;
import java.util.concurrent.locks.StampedLock;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 * 记录丢弃大小和日志大小，用于compacted
 */
public class Discard {

    private StampedLock stampedLock;

    private byte[][] valChan;

    private long[] freeList;

    private Map<Integer, Long> location;

    public StampedLock getStampedLock() {
        return stampedLock;
    }

    public void setStampedLock(StampedLock stampedLock) {
        this.stampedLock = stampedLock;
    }

    public byte[][] getValChan() {
        return valChan;
    }

    public void setValChan(byte[][] valChan) {
        this.valChan = valChan;
    }

    public long[] getFreeList() {
        return freeList;
    }

    public void setFreeList(long[] freeList) {
        this.freeList = freeList;
    }

    public Map<Integer, Long> getLocation() {
        return location;
    }

    public void setLocation(Map<Integer, Long> location) {
        this.location = location;
    }
}
