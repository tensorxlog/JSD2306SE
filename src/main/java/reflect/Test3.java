package reflect;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test3 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Test3");
        Package pack = cls.getPackage();
        File dir = new File(Test3.class.getResource(".").toURI());
        File[] files = dir.listFiles();
        for (File file: files) {
            String fileName = file.getName();
            String className = pack.getName() + "." + fileName.split("\\.")[0];
            Class theCls = Class.forName(className);
            Method[] methods = theCls.getMethods();
            Object obj = theCls.newInstance();
            for (Method method: methods) {
                if (method.getParameterCount() == 0 && method.getModifiers() == Modifier.PUBLIC) {
                    method.invoke(obj);
                }
            }
        }
    }
}
