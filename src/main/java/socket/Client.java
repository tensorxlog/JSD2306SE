package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;

    public Client() {
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
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);

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
        Client client = new Client();
        client.start();
    }
}
