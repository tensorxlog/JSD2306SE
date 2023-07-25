package thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        test();
    }

    public static void test() {
        System.out.println(Thread.currentThread());
    }
}
