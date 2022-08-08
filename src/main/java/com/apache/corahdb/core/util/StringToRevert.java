package com.apache.corahdb.core.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class StringToRevert {

    public static String replaceDefaultStr(String defaultStr, String str) {
        if (StringUtils.isBlank(str)) {
            return defaultStr;
        }
        return str;
    }
}
