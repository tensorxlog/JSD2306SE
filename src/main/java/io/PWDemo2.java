package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.txt"))));
        pw.println("the first line");
        pw.println("the second line");
        System.out.println("completed");
        pw.close();

    }
}
