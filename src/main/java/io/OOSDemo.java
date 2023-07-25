package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        Person p = new Person(20, "No Name", "male", new String[]{"a", "b"});
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        oos.close();
    }
}
