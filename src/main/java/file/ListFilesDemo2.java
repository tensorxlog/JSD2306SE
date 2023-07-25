package file;

import java.io.File;
import java.util.Arrays;

public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");

        File[] files = dir.listFiles(file -> file.getName().contains("a"));
        System.out.println(Arrays.toString(files));
    }
}
