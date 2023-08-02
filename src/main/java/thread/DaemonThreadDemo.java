package thread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread userThread = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("user thread");
                }
            }
        };

        Thread daemonThread = new Thread() {
            public void run() {
                while (true) {
                    System.out.println("daemon thread");
                }
            }
        };
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();
        //while (true);
    }

}
