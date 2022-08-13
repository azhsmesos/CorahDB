package com.apache.corahdb.core;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.StampedLock;

import javax.swing.Spring;

import org.apache.commons.lang3.StringUtils;

import com.apache.corahdb.core.model.ColumnFamily;
import com.apache.corahdb.core.model.options.ColumnFamilyOptions;
import com.apache.corahdb.core.util.FileUtils;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class CorahDB {

    private Map<String, ColumnFamily> cfs;

    private ColumnFamilyOptions opts;

    private StampedLock mu;

    public Map<String, ColumnFamily> getCfs() {
        return cfs;
    }

    public void setCfs(Map<String, ColumnFamily> cfs) {
        this.cfs = cfs;
    }

    public ColumnFamilyOptions getOpts() {
        return opts;
    }

    public void setOpts(ColumnFamilyOptions opts) {
        this.opts = opts;
    }

    public StampedLock getMu() {
        return mu;
    }

    public void setMu(StampedLock mu) {
        this.mu = mu;
    }

    public ColumnFamily openColumnFamily() {
        this.opts.setDirPath(StringUtils.join(this.opts.getDirPath(), "/", this.opts.getCfName()))
                .setIndexerDir(this.opts.getIndexerDir())
                .setValueLogDir(this.opts.getDirPath());

        if (this.opts.getValueLogGCRation() >= 1.0 || this.opts.getValueLogGCRation() <= 0.0) {
            throw new IllegalArgumentException("gc ratio not more than 1 or down to 0");
        }

        if (this.cfs.get(this.opts.getCfName()) != null) {
            return this.getCfs().get(opts.getCfName());
        }

        String[] paths = new String[] {opts.getDirPath(), opts.getIndexerDir(), opts.getValueLogDir()};
        Arrays.stream(paths).map(FileUtils::createNewFolder);

        ColumnFamily cf = new ColumnFamily()
                .setOpts(opts)
                // todo 实现文件锁 写到这儿
                .setDirLocks(null);

        return null;
    }
}
