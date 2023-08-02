package homework.day09;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    Socket socket;

    public Client() {
        try {
            socket = new Socket("localhost", 8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        System.out.println("请输入: ");
        Scanner sc = new Scanner(System.in);
        String line;
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8)), true);
            while (!"exit".equals(line = sc.nextLine())) {
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
