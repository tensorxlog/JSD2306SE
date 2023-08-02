package homework.day09;

public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop1 = new Shop();
        Shop shop2 = new Shop();
        Thread t1 = new Thread() {
            public void run() {
                shop1.buy();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                shop2.buy();
            }
        };
        t1.start();
        t2.start();
    }

}

class Shop {
    public void buy() {
        Thread t = Thread.currentThread();
        try {
            System.out.println(t.getName() + "正在挑衣服");
            t.sleep(2000);
            synchronized(this) {
                System.out.println(t.getName() + "正在试衣服");
                t.sleep(2000);
            }
            System.out.println(t.getName() + "正在结账");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}