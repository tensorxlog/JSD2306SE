package temp;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
//        B b1 = new B();
//        A b2 = new B();
//        A a = new A();
//        b1.f();
//        b2.f();
//        a.f();
//        System.out.println(b1.c);
//        System.out.println(b2.c);
//        System.out.println(a.c);

//        Collection<Integer> c = new ArrayList<>();
//        c.add(200);
//        System.out.println(c.equals(200));
//        Object o = new Object();
//        System.out.println(o.equals(200));
//        System.out.println("200".equals(200));

        f(100);
    }

    public static void f(Object o) {
        System.out.println(o.getClass());
        System.out.println("100".equals(String.valueOf(o)));
    }
}

class A {
    char c = 'a';
    public void f() {
        System.out.println("A");
    }

}

class B extends A {
    char c = 'b';
    public void f() {
        System.out.println("B");
    }
}
