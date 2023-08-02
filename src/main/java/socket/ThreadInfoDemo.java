package socket;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println("name: " + main.getName());
        System.out.println("id: " + main.getId());
        System.out.println("priority: " + main.getPriority());
        System.out.println("isDaemon: " + main.isDaemon());
        System.out.println("isAlive: " + main.isAlive());
        System.out.println("isInterrupted: " + main.isInterrupted());
    }
}
