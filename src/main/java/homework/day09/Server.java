package homework.day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    ServerSocket serverSocket;

    public Server() {
        try {
            System.out.println("正在启动服务器...");
            serverSocket = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        System.out.println("正在监听客户端连接...");
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                System.out.println("连接了一个客户端");
                Thread t = new Thread(new ClientHandler(socket));
                t.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}

class ClientHandler implements Runnable {
    Socket socket;
    String host;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        this.host = socket.getInetAddress().getHostAddress();
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(host + ": " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}