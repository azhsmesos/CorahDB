package com.apache.corahdb.core.model;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 * @SkipListIterator 是skiplist的迭代器，所有方法都是线程安全的
 */
public class SkipListIterator {

    private SkipList list;

    private Arena arena;

    private Node nd;

    private long value;

    public SkipList getList() {
        return list;
    }

    public void setList(SkipList list) {
        this.list = list;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public Node getNd() {
        return nd;
    }

    public void setNd(Node nd) {
        this.nd = nd;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
