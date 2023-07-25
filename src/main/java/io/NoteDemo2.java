package io;

import java.io.*;
import java.util.Scanner;

public class NoteDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("note.txt"))), true);
        String line;
        while (!(line = sc.nextLine()).equals("exit")) {
            pw.println(line);
        }

        System.out.println("completed");
        pw.close();
    }
}
