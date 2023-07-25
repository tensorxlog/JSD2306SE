package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("clash-windows-amd64.exe");
        FileOutputStream fos = new FileOutputStream("clash-windows-amd64_cp2.exe");
        byte[] buffer = new byte[1024 * 10];
        int d = 0;
        long start = System.currentTimeMillis();
        while ((d = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, d);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
