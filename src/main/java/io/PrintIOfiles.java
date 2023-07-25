package io;

import java.io.*;

public class PrintIOfiles {
    public static void main(String[] args) throws IOException {
        File dir = new File("./src/main/java/io");
        File[] files = dir.listFiles(file -> file.isFile());
        for (File file: files) {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
