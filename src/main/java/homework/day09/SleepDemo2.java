package homework.day09;

public class SleepDemo2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            public void run() {
                System.out.println(getName() + ": begin to sleep");
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + ": wakes up");
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                System.out.println(getName() + " starts");
                for (int i = 0; i < 5; i++) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName() + ": ends");
                thread1.interrupt();
            }
        };

        thread1.start();
        thread2.start();
    }
}
