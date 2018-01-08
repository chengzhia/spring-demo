package com.chengzhi.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by ruanchengzhi on 2017/12/8.
 */
public class ZipFileUtils {
    /**
     *  压缩文件
     * @param path 压缩文件/文件夹
     * @param zipPath /压缩文件目录.zip
     */
    public static void compressedFile(String path,String targetZipPathAndName) throws Exception{
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(targetZipPathAndName));
        File file = new File(path);
        zip(zos,file,"",targetZipPathAndName);
        zos.close();
    }
    private static void zip(ZipOutputStream zos,File file,String base,String zipPath) throws Exception{
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (null != files) {
                zos.putNextEntry(new ZipEntry(base + "/"));
                base = base.length() == 0 ? "" : base + "/";
                for (File fi : files) {
                    zip(zos, fi, base + fi, zipPath);
                }
            }
        } else {
            zos.putNextEntry(new ZipEntry(base));
            FileInputStream fis = new FileInputStream(zipPath);
            int length;
            while ((length = fis.read()) != -1) {
                zos.write(length);
            }
            fis.close();
        }
    }
    private static void compressedFileList(List<String> paths, String targetZipPathAndName) throws Exception{
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(targetZipPathAndName));
        byte[] buffer = new byte[1024];
        for (String path : paths) {
            File file  = new File(path);
            ZipEntry entry = new ZipEntry(path.substring("".length() + 1,path.length()));
            FileInputStream fis = new FileInputStream(file);
            zos.putNextEntry(entry);
            int read = 0;
            while ((read = fis.read(buffer)) != -1) {
                zos.write(buffer,0,read);
            }
            zos.closeEntry();
            fis.close();
        }
        zos.close();
    }
    public static void main(String[] args){
        try {
//            ZipFileUtils.compressedFile("E:/file","E:/demo.zip");
            List<String> list = new ArrayList<String>();
            list.add("E:/file");
            ZipFileUtils.compressedFileList(list,"E:/dem.zip");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
