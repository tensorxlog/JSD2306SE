package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NoteDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line;
        FileOutputStream fos = new FileOutputStream("notes.txt", true);
        System.out.println("请输入：");
        while (!(line = sc.nextLine()).equals("exit")) {
            fos.write(line.getBytes(StandardCharsets.UTF_8));
        }
        fos.close();


    }
}
