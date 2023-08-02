package thread;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Thread t1 = new Thread() {
//            public void run() {
//                for (int i = 0; i < 3000; i++) {
//                    list.add(1);
//                }
//            }
//        };
//        Thread t2 = new Thread() {
//            public void run() {
//                for (int i = 0; i < 3000; i++) {
//                    list.add(1);
//                }
//            }
//        };

        Test test = new Test();
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    test.addElement();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    test.addElement();
                }
            }
        };

        t1.start();
        t2.start();
    }
}

class Test {
    ArrayList<Integer> list = new ArrayList<>();
    public void addElement() {
        list.add(1);
    }
}
