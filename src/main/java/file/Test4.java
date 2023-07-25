package file;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File dir = new File("./myDir");
        File[] files = dir.listFiles();
        for (File file: files) {
            file.delete();
        }
        dir.delete();

    }
}
