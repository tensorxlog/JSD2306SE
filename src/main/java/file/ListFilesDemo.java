package file;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        File file = new File(".");
        File[] fileList = file.listFiles();
        for (File f: fileList) {
            System.out.println(f.getName());
        }
    }
}
