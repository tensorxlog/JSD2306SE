package homework.day08;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    Socket socket;

    public Client() {
        try {
            System.out.println("正在启动客户端...");
            socket = new Socket("localhost", 8088);
            System.out.println("客户端启动成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8)), true);
            Scanner sc = new Scanner(System.in);
            String line = null;
            System.out.println("请输入: ");
            while (!"exit".equals(line = sc.nextLine())) {
                pw.println(line);
                System.out.println("请输入: ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
