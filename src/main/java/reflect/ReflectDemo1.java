package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class cls = String.class;
        //System.out.println(cls.getName());
        //System.out.println(cls.getSimpleName());
        //Package pack = cls.getPackage();
        //System.out.println(pack.getName());

        //Method[] methods = cls.getMethods();
        //for (Method method: methods) {
        //    System.out.println(method.getName());
        //}

        //Class clsArrL = ArrayList.class;
        //Method[] methods1 = clsArrL.getMethods();
        //for (Method method: methods1) {
        //    System.out.println(method);
        //}

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Class cls = Class.forName(line);
        Method[] methods = cls.getMethods();
        for (Method method: methods) {
            System.out.println(method.getName());
        }



    }
}
