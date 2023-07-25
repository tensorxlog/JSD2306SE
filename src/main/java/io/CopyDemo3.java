package io;

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("clash-windows-amd64.exe");
        FileOutputStream fos = new FileOutputStream("clash-windows-amd64_cp.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int d;
        long start = System.currentTimeMillis();
        while ((d = bis.read()) != -1) {
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start) + "ms");
    }
}
