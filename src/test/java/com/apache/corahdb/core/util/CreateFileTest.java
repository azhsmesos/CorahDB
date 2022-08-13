package com.apache.corahdb.core.util;


import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class CreateFileTest {

    private String path = "/Users/zhaozhenhang/Desktop/test/summer-code/com.apache.corahdb.core.CorahDB/src/test/resources";
    private static final Logger logger = LoggerFactory.getLogger(CreateFileTest.class);

    @Test
    public void testCreateFile() {
        String filePath = FileUtils.createNewFolder(path);
        String cfName = "cf_name";
        logger.info("file path: {}", filePath);
        logger.info("file options: {}", OptionUtils.defaultOptions(filePath, "name"));
        String paht = StringUtils.join(filePath, "/", cfName);
        System.out.println(paht);
    }
}
