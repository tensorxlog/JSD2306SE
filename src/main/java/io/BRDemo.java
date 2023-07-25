package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./src/main/java/io/BRDemo.java"), StandardCharsets.UTF_8));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }


    }
}
