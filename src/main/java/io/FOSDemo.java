package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FOSDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("./out.dat");
    }
}
