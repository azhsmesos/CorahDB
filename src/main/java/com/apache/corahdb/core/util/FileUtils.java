package com.apache.corahdb.core.util;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class FileUtils {

    private static final Logger logger = LoggerFactory.getLogger(FileUtils.class);

    public static String createNewFile(String dir, String fileName) {
        return init(dir, fileName);
    }

    private static String init(String dir, String fileName) {
        File file = new File(dir, fileName);
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                boolean mkdirsFile = file.getParentFile().mkdirs();
                if (!mkdirsFile) {
                    logger.error("Failed to create folder: {}", dir);
                }
            }
            try {
                boolean isCreateSuccess = file.createNewFile();
                if (!isCreateSuccess) {
                    logger.error("create file error: {}", fileName);
                    return "";
                }
                return file.getPath();
            } catch (IOException e) {
                logger.error("create file error: {}", fileName);
                e.printStackTrace();
                return "";
            }
        }
        return file.getPath();
    }
}
