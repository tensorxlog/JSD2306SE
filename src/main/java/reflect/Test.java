package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class cls = Class.forName("reflect.Student");
        Object o1 = cls.newInstance();
        Constructor constructor = cls.getConstructor(String.class, int.class, char.class);
        Object o2 = constructor.newInstance("李四", 30, '男');
        System.out.println(o1);
        System.out.println(o2);
    }
}
