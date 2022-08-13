package com.apache.corahdb.core.util;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-13
 */
public class ArgumentExceptionUtil {

    public static boolean checkNull(String cfName) {
        return cfName == null || cfName.length() == 0;
    }
}
