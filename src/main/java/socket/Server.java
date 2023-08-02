package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private ServerSocket serverSocket;
    private List<PrintWriter> allOut = new ArrayList<>();

    public Server() {
        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了.");
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    private class ClientHandler implements Runnable {
        private Socket socket;
        private String host;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            this.host = socket.getInetAddress().getHostAddress();
        }

        public void run() {
            PrintWriter pw = null;
            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8)), true);
                synchronized (allOut) {
                    allOut.add(pw);
                }
                sendMessage(host + "上线了，当前在线人数：" + allOut.size());

                String line;
                while ((line = br.readLine()) != null) {
                    sendMessage(host + "说：" + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                synchronized (allOut) {
                    allOut.remove(pw);
                }
                sendMessage(host + "下线了。当前在线人数：" + allOut.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("客户端结束了会话");
        }

        private void sendMessage(String message) {
            System.out.println(message);
            synchronized (allOut) {
                for (PrintWriter p: allOut) {
                    p.println(message);
                }
            }
        }
    }
}
