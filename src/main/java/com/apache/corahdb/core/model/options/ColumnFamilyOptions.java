package com.apache.corahdb.core.model.options;

import java.time.Duration;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class ColumnFamilyOptions {

    private String DBPath;

    private String cfName;

    private String dirPath;

    private long memTableSize;

    private int memTableNums;

    private Duration memSpaceWaitTimeout;

    private String indexerDir;

    private int flushBatchSize;

    private boolean walMMAP;

    private int walBytesFlush;

    private String valueLogDir;

    private long valueLogFileSize;

    private boolean valueLogMMAP;

    private double valueLogGCRation;

    private Duration valueLogGCInterval;

    public String getDBPath() {
        return DBPath;
    }

    public ColumnFamilyOptions setDBPath(String DBPath) {
        this.DBPath = DBPath;
        return this;
    }

    public String getCfName() {
        return cfName;
    }

    public ColumnFamilyOptions setCfName(String cfName) {
        this.cfName = cfName;
        return this;
    }

    public String getDirPath() {
        return dirPath;
    }

    public ColumnFamilyOptions setDirPath(String dirPath) {
        this.dirPath = dirPath;
        return this;
    }

    public long getMemTableSize() {
        return memTableSize;
    }

    public ColumnFamilyOptions setMemTableSize(long memTableSize) {
        this.memTableSize = memTableSize;
        return this;
    }

    public int getMemTableNums() {
        return memTableNums;
    }

    public ColumnFamilyOptions setMemTableNums(int memTableNums) {
        this.memTableNums = memTableNums;
        return this;
    }

    public Duration getMemSpaceWaitTimeout() {
        return memSpaceWaitTimeout;
    }

    public ColumnFamilyOptions setMemSpaceWaitTimeout(Duration memSpaceWaitTimeout) {
        this.memSpaceWaitTimeout = memSpaceWaitTimeout;
        return this;
    }

    public String getIndexerDir() {
        return indexerDir;
    }

    public ColumnFamilyOptions setIndexerDir(String indexerDir) {
        this.indexerDir = indexerDir;
        return this;
    }

    public int getFlushBatchSize() {
        return flushBatchSize;
    }

    public ColumnFamilyOptions setFlushBatchSize(int flushBatchSize) {
        this.flushBatchSize = flushBatchSize;
        return this;
    }

    public boolean isWalMMAP() {
        return walMMAP;
    }

    public ColumnFamilyOptions setWalMMAP(boolean walMMAP) {
        this.walMMAP = walMMAP;
        return this;
    }

    public int getWalBytesFlush() {
        return walBytesFlush;
    }

    public ColumnFamilyOptions setWalBytesFlush(int walBytesFlush) {
        this.walBytesFlush = walBytesFlush;
        return this;
    }

    public String getValueLogDir() {
        return valueLogDir;
    }

    public ColumnFamilyOptions setValueLogDir(String valueLogDir) {
        this.valueLogDir = valueLogDir;
        return this;
    }

    public long getValueLogFileSize() {
        return valueLogFileSize;
    }

    public ColumnFamilyOptions setValueLogFileSize(long valueLogFileSize) {
        this.valueLogFileSize = valueLogFileSize;
        return this;
    }

    public boolean isValueLogMMAP() {
        return valueLogMMAP;
    }

    public ColumnFamilyOptions setValueLogMMAP(boolean valueLogMMAP) {
        this.valueLogMMAP = valueLogMMAP;
        return this;
    }

    public double getValueLogGCRation() {
        return valueLogGCRation;
    }

    public ColumnFamilyOptions setValueLogGCRation(double valueLogGCRation) {
        this.valueLogGCRation = valueLogGCRation;
        return this;
    }

    public Duration getValueLogGCInterval() {
        return valueLogGCInterval;
    }

    public ColumnFamilyOptions setValueLogGCInterval(Duration valueLogGCInterval) {
        this.valueLogGCInterval = valueLogGCInterval;
        return this;
    }
}
