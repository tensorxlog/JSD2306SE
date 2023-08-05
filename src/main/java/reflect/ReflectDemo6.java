package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemo6 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
        Class cls = Class.forName("reflect.Person");
//        Method method = cls.getDeclaredMethod("test");
//        Object obj = cls.newInstance();
//        method.invoke(obj);
        Method[] methods = cls.getDeclaredMethods();
//        for (Method method: methods) {
//            System.out.println(method);
//        }
        for (Method method: methods) {
            int modifier = method.getModifiers();
            switch (modifier) {
                case Modifier.PRIVATE:
                    System.out.println("a private method");
                    break;
                case Modifier.PUBLIC:
                    System.out.println("a public method");
                    break;
                case Modifier.PROTECTED:
                    System.out.println("a protected method");
            }
            System.out.println(method.getParameterCount());
        }
    }
}
