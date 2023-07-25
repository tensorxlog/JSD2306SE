package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("clash-windows-amd64.exe");
        FileOutputStream fos = new FileOutputStream("clash-windows-amd64_cp.exe");
        int d;
        long start = System.currentTimeMillis();
        while ((d = fis.read()) != -1) {
            fos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
