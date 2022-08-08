package com.apache.corahdb.core.model;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class Node {

    private int keyOffset;
    private int keySize;

    private long value;

    static class Links {
        private int nextOffset;
        private int prevOffset;

        public int getNextOffset() {
            return nextOffset;
        }

        public void setNextOffset(int nextOffset) {
            this.nextOffset = nextOffset;
        }

        public int getPrevOffset() {
            return prevOffset;
        }

        public void setPrevOffset(int prevOffset) {
            this.prevOffset = prevOffset;
        }
    }

    public int getKeyOffset() {
        return keyOffset;
    }

    public void setKeyOffset(int keyOffset) {
        this.keyOffset = keyOffset;
    }

    public int getKeySize() {
        return keySize;
    }

    public void setKeySize(int keySize) {
        this.keySize = keySize;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
