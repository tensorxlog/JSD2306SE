package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("pw.txt", "UTF-8");
        pw.println("the fisrt line");
        pw.println("the second line");
        pw.close();
    }
}
