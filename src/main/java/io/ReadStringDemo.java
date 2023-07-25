package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        fis.read(bytes);
        String line = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(line);

    }
}
