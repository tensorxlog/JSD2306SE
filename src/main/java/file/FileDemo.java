package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./demo.txt");
        System.out.println(file.getName());
        System.out.println(file.length());

        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
    }
}
