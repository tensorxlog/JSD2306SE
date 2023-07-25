package file;

import java.io.File;

public class MKDirDemo {
    public static void main(String[] args) {
        //File file = new File("./testdir");
        //if (!file.exists()) {
        //    file.mkdir();
        //    System.out.println("directory created.");
        //}

        File dir = new File("./a/b/c/d");
        dir.mkdirs();
    }
}
