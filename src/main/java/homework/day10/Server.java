package homework.day10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Server {
    ServerSocket serverSocket;
    List<PrintWriter> clientWriters = new ArrayList<>();

    public Server() {
        try {
            serverSocket = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        System.out.println("开始监听客户端连接");
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket);
                System.out.println("客户端 " + clientHandler.host + " 连接了");
                Thread t = new Thread(clientHandler);
                t.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Server().start();
    }

    private class ClientHandler implements Runnable {
        Socket socket;
        String host;

        ClientHandler(Socket socket) {
            this.socket = socket;
            this.host = socket.getInetAddress().getHostAddress();
        }

        public void run() {
            PrintWriter pw = null;
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8)), true);
                synchronized (clientWriters) {
                    clientWriters.add(pw);
                }
                broadcast(host + " 上线了. 当前人数为"  + clientWriters.size());
                String line;
                while ((line = br.readLine()) != null) {
                    broadcast(host + "说:" + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                synchronized (clientWriters) {
                    clientWriters.remove(pw);
                }
                broadcast(host + " 下线了. 当前人数为" + clientWriters.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void broadcast(String s) {
            System.out.println(s);
            synchronized (clientWriters) {
                for (PrintWriter pw: clientWriters) {
                    pw.println(s);
                }
            }
        }
    }
}
