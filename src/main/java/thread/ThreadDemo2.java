package thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable myRunnable1 = new MyRunnable1();
        Runnable myRunnable2 = new MyRunnable2();

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);
        thread1.start();
        thread2.start();
    }
}

class MyRunnable1 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("This is thread 1");
        }
    }
}
class MyRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("This is thread 2");
        }
    }
}
