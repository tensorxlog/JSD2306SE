package homework.day09;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("min");
                }
            }
        };
        Thread max = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("max");
                }
            }
        };
        Thread normal = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("nor");
                }
            }
        };

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);

        min.start();
        normal.start();
        max.start();
    }
}
