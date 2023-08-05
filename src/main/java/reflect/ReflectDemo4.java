package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the class name:");
        String className = sc.nextLine();
        System.out.println("enter the method name:");
        String methodName = sc.nextLine();

        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);

//        Class cls = Class.forName("reflect.B");
//        Object obj = cls.newInstance();
//        C c = new C();
//        c.test(obj);
    }
}

class A {
    static int a = 0;

    public void test() {
        System.out.println(a);
    }
}

class B extends A {
    static int a = 1;
}

class C {
    public void test(B b) {
        System.out.println("Type B");
    }
}