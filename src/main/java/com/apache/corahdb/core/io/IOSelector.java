package com.apache.corahdb.core.io;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public interface IOSelector {

    // 在offset 处将 字节数组写入文件，返回写入长度
    int write(byte[] b, long offset);

    // 读取字节数组，返回读取长度
    int read(byte[] b, long offset);

    void sync();

    void close();

    void delete();
}
