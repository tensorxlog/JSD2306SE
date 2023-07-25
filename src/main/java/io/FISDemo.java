package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("out.dat");
        fos.write(1);
        fos.write(2);
        fos.close();

        FileInputStream fis = new FileInputStream("out.dat");

        int a1 = fis.read();
        System.out.println(a1);
        int a2 = fis.read();
        System.out.println(a2);
        int a3 = fis.read();
        System.out.println(a3);

        fis.close();

    }
}
