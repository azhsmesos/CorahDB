package com.apache.corahdb.core.model;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
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

    private ArrayBlockingQueue<Integer> coluseBlocking;

    public MemTable getActiveMem() {
        return activeMem;
    }

    public ColumnFamily setActiveMem(MemTable activeMem) {
        this.activeMem = activeMem;
        return this;
    }

    public MemTable[] getImmuMemtable() {
        return immuMemtable;
    }

    public ColumnFamily setImmuMemtable(MemTable[] immuMemtable) {
        this.immuMemtable = immuMemtable;
        return this;
    }

    public ValueLog getVlog() {
        return vlog;
    }

    public ColumnFamily setVlog(ValueLog vlog) {
        this.vlog = vlog;
        return this;
    }

    public BlockingQueue<MemTable> getFlushMemtable() {
        return flushMemtable;
    }

    public ColumnFamily setFlushMemtable(
            BlockingQueue<MemTable> flushMemtable) {
        this.flushMemtable = flushMemtable;
        return this;
    }

    public StampedLock getFlushLock() {
        return flushLock;
    }

    public ColumnFamily setFlushLock(StampedLock flushLock) {
        this.flushLock = flushLock;
        return this;
    }

    public ColumnFamilyOptions getOpts() {
        return opts;
    }

    public ColumnFamily setOpts(ColumnFamilyOptions opts) {
        this.opts = opts;
        return this;
    }

    public StampedLock getMu() {
        return mu;
    }

    public ColumnFamily setMu(StampedLock mu) {
        this.mu = mu;
        return this;
    }

    public File[] getDirLocks() {
        return dirLocks;
    }

    public ColumnFamily setDirLocks(File[] dirLocks) {
        this.dirLocks = dirLocks;
        return this;
    }

    public int getClosed() {
        return closed;
    }

    public ColumnFamily setClosed(int closed) {
        this.closed = closed;
        return this;
    }

    public ArrayBlockingQueue<Integer> getColuseBlocking() {
        return coluseBlocking;
    }

    public ColumnFamily setColuseBlocking(ArrayBlockingQueue<Integer> coluseBlocking) {
        this.coluseBlocking = coluseBlocking;
        return this;
    }
}
