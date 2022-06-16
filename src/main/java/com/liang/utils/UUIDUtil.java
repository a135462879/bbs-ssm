package com.liang.utils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author maliang
 * @create 2019-12-28 17:03
 */
public class UUIDUtil {
    private static final DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

    public static void main(String[] args) throws IOException {
        String path = "E:\\test\\photo\\20220613151322_57ab9e969401b4d718aeb11.jpg";
        File file = new File("E:\\test\\photo\\20220613151322_57ab9e969401b4d718aeb11.jpg");
        System.out.println(file.getAbsolutePath());
        System.out.println(FilenameUtils.getFullPathNoEndSeparator(path));
        System.out.println(FilenameUtils.getPathNoEndSeparator(path));
        System.out.println(FilenameUtils.separatorsToSystem(path));
        String absolutePath = file.getAbsolutePath();
        absolutePath = absolutePath.substring(absolutePath.indexOf(":") + 1, absolutePath.length());
//        System.out.println(FilenameUtils.normalize(path));
        System.out.println(absolutePath.replace("\\", "/"));
    }

    /**
     * 构造uuid（当前时间+uuid）
     * @return
     */
    public static String getRandomUUID(){
        String uuid = format.format(new Date()) + "-" + UUID.randomUUID().toString().replace("-","");

        return uuid;
    }
}
