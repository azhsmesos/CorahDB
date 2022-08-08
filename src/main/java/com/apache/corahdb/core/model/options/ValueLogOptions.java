package com.apache.corahdb.core.model.options;

import java.time.Duration;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class ValueLogOptions {

    private String path;

    private long blockSize;

    private int ioType;

    private double gcRatio;

    private Duration gcInterval;


    public String getPath() {
        return path;
    }

    public ValueLogOptions setPath(String path) {
        this.path = path;
        return this;
    }

    public long getBlockSize() {
        return blockSize;
    }

    public ValueLogOptions setBlockSize(long blockSize) {
        this.blockSize = blockSize;
        return this;
    }

    public int getIoType() {
        return ioType;
    }

    public ValueLogOptions setIoType(int ioType) {
        this.ioType = ioType;
        return this;
    }

    public double getGcRatio() {
        return gcRatio;
    }

    public ValueLogOptions setGcRatio(double gcRatio) {
        this.gcRatio = gcRatio;
        return this;
    }

    public Duration getGcInterval() {
        return gcInterval;
    }

    public ValueLogOptions setGcInterval(Duration gcInterval) {
        this.gcInterval = gcInterval;
        return this;
    }
}
