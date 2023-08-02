package homework.day09;

public class SyncDemo {
    public static void main(String[] args) {
        Beans beans = new Beans(10);
        Thread thread1 = new Thread() {
            public void run() {
                while (true) {
                    System.out.println(beans.getBeans());
                }
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
                while (true) {
                    System.out.println(beans.getBeans());
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}

class Beans {
    private int beans;

    public Beans(int beans) {
        this.beans = beans;
    }

    public synchronized int getBeans() {
        if (beans == 0) {
            throw new RuntimeException("no more beans");
        }

        Thread.yield();
        return beans--;
    }


}
