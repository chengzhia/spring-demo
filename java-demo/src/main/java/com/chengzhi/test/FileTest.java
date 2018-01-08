package com.chengzhi.test;

import org.junit.Test;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by xebest on 2017/12/7.
 */
public class FileTest {

    @Test
    public void test1() throws Exception{
        File file = new File("E:/file/qq.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        if (file.canRead()) {
            System.out.println("can read");
        }
        if (file.canWrite()) {
            System.out.println("can write");
        }
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getParent());
        System.out.println(file.isHidden());
        System.out.println(file.lastModified());
        file.renameTo(new File("E:/file/file.txt"));
    }
    @Test
    public void test2() throws Exception{
        FileOutputStream fos = new FileOutputStream("E:/file/file.txt");
        byte[] arr = "这是个文件".getBytes();
        fos.write(arr);
        fos.flush();
        fos.close();
    }
    @Test
    public void test3() throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("E:/file/123.txt")));
        BufferedReader br = new BufferedReader(new FileReader(new File("E:/file/file.txt")));
        char[] arr = new char[1024];
        if (br.read(arr,0,arr.length) != -1) {
            bw.write(arr,0,arr.length);
            bw.flush();
        }
        br.close();
        bw.close();
    }
    @Test
    public void test4() throws Exception{
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("E:/123.zip"));
        zip(new File("E:/file"),zos,"");
        zos.close();
    }
    public void zip (File file,ZipOutputStream zos,String base) throws Exception{
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            zos.putNextEntry(new ZipEntry(base+"/"));
            base = base.length() == 0 ? "" : base + "/";
            for (File fi : files) {
                zip(fi, zos,base+fi);
            }
        } else {
            zos.putNextEntry(new ZipEntry(base));
            FileInputStream fis = new FileInputStream(file);
            int b;
            while ((b = fis.read()) != -1) {
                zos.write(b);
            }
            fis.close();
        }
    }
    @Test
    public void test5() throws Exception{
        ZipInputStream zis = new ZipInputStream(new FileInputStream("E:/123.zip"));
        ZipEntry nextEntry = zis.getNextEntry();
        while (((nextEntry = zis.getNextEntry()) != null) && !nextEntry.isDirectory()) {
            File file = new File(nextEntry.getName());
            if (!file.exists()) {
                file.createNewFile();
            }
            zis.closeEntry();
        }
        zis.close();
    }
}
