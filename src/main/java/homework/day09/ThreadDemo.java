package homework.day09;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new MyThread1();
        Thread thread2 = new MyThread2();

        thread1.start();
        thread2.start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("this is thread1");
        }
    }
}
class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("this is thread2");
        }
    }
}
