package com.apache.corahdb.core.model.options;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class MemOptions {

    private String path;

    private int fid;

    private long fsize;

    // todo 用枚举实现
    private int ioType;

    private int memSize;

    private int bytesFlush;

    public String getPath() {
        return path;
    }

    public MemOptions setPath(String path) {
        this.path = path;
        return this;
    }

    public int getFid() {
        return fid;
    }

    public MemOptions setFid(int fid) {
        this.fid = fid;
        return this;
    }

    public long getFsize() {
        return fsize;
    }

    public MemOptions setFsize(long fsize) {
        this.fsize = fsize;
        return this;
    }

    public int getIoType() {
        return ioType;
    }

    public MemOptions setIoType(int ioType) {
        this.ioType = ioType;
        return this;
    }

    public int getMemSize() {
        return memSize;
    }

    public MemOptions setMemSize(int memSize) {
        this.memSize = memSize;
        return this;
    }

    public int getBytesFlush() {
        return bytesFlush;
    }

    public MemOptions setBytesFlush(int bytesFlush) {
        this.bytesFlush = bytesFlush;
        return this;
    }
}
