package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String line = "test thsi line";
        byte[] bytes = line.getBytes(StandardCharsets.UTF_8);
        bos.write(bytes);
        //bos.flush();
        bos.close();
    }
}
