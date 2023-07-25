package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        fos.write("test this shit.".getBytes(StandardCharsets.UTF_8));
        fos.write("the second sentence".getBytes(StandardCharsets.UTF_8));
        fos.close();
    }
}
