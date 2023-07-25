package homework.day07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;

    public Server() {
        System.out.println("正在启动服务器...");
        try {
            serverSocket = new ServerSocket(8088);
            System.out.println("服务器启动成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            System.out.println("开始监听客户端请求");
            Socket socket = serverSocket.accept();
            System.out.println("客户端连接了");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
