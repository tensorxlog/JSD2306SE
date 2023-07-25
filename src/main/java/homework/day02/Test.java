package homework.day02;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = ",,a,";
        System.out.println(Arrays.toString(s.split(",")));
        A instance = new B();
        instance.test();
    }
}


class A {
    int a = 0;

    public void test() {
        System.out.println("A");
    }
}

class B extends A {
    int a = 1;

    public void test() {
        System.out.println("B");
    }
}