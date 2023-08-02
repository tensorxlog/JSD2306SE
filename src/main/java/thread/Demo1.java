package thread;

public class Demo1 {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
        StringBuffer sb = new StringBuffer();
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 3000; i++) {
                    sb.append("1");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 3000; i++) {
                    sb.append("1");
                }
            }
        };

        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sb.length());
    }
}
