package homework.day10;

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
        ServerHandler serverHandler = new ServerHandler(socket);
        Thread t = new Thread(serverHandler);
        t.setDaemon(true);
        t.start();
        Scanner sc = new Scanner(System.in);
        String line;
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8)), true);
            System.out.println("请输入:");
            while (!"exit".equals(line = sc.nextLine())) {
                System.out.println("请输入:");
                pw.println(line);
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Client().start();
    }

    private class ServerHandler implements Runnable {
        Socket socket;

        ServerHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
