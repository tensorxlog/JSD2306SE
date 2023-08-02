package homework.day09;

public class SynchDemo3 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        Thread t1 = new Thread(() -> a1.test());
        Thread t2 = new Thread(() -> a2.test());
        t1.start();
        t2.start();

    }
}

class A {
    public static void test() {
        synchronized (A.class) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " begins to sleep");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getName() + "ends sleeping");
        }
    }
}
