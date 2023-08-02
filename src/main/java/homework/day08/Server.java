package homework.day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    ServerSocket serverSock;

    public Server() {
        try {
            serverSock = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        System.out.println("正在等待客户端连接...");
        while (true) {
            try {
                Socket socket = serverSock.accept();
                System.out.println("有客户端连上了");
                ClientHandler r = new ClientHandler(socket);
                Thread thread = new Thread(r);
                thread.start();
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

    ClientHandler(Socket socket) {
        this.socket = socket;
        this.host = socket.getInetAddress().getHostAddress();
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(host + "说：" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}