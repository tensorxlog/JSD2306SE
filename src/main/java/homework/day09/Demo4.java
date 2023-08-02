package homework.day09;

public class Demo4 {
    public static void main(String[] args) {
        B b = new B();
        Thread t1 = new Thread() {
            public void run() {
                b.test1();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                b.test2();
            }
        };
        t1.start();
        t2.start();
    }
}

class B {
    public synchronized void test1() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " method1 begins");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName() + " method1 ends");
    }

    public synchronized void test2() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " method2 begins");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName() + " method2 ends");
    }
}
