package com.apache.corahdb.core.model;

import java.util.Map;
import java.util.concurrent.locks.StampedLock;

import com.apache.corahdb.core.model.options.ValueLogOptions;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 * 按照 WiscKey论文命名 https://www.usenix.org/system/files/conference/fast16/fast16-papers-lu.pdf
 */
public class ValueLog {

    private StampedLock stampedLock;

    private ValueLogOptions opt;

    private LogFile activeLogFile;

    private Map<Integer, LogFile> logFiles;

    private ColumnFamily cf;

    private Discard discard;
}
