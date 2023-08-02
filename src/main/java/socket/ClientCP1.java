package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ClientCP1 {
    private Socket socket;

    public ClientCP1() {
        System.out.println("正在与服务器建立连接...");
        try {
            socket = new Socket("localhost", 8088);
            System.out.println("与服务器建立连接成功.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        try {
            ServerHandler serverHandler = new ServerHandler();
            Thread t = new Thread(serverHandler);
            t.setDaemon(true);
            t.start();
            PrintWriter pw = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream(), StandardCharsets.UTF_8
                            )
                    ), true);
            Scanner sc = new Scanner(System.in);
            String line;
            System.out.println("请说");
            while (!"exit".equals(line = sc.nextLine())) {
                pw.println(line);
                System.out.println("请说");
            }
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
        ClientCP1 client = new ClientCP1();
        client.start();
    }

    private class ServerHandler implements Runnable {
        public void run() {
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), StandardCharsets.UTF_8
                        )
                );
                String message;
                while ((message = br.readLine()) != null) {
                    System.out.println(message);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
