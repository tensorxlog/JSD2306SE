package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        int d;
        while ((d = fis.read()) != -1) {
            System.out.print((char) d);
        }

    }
}
