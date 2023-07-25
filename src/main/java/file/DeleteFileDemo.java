package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        //File file = new File("./test.txt");
        //file.delete();
        //System.out.println("file deleted.");

        for (int i = 0; i < 100; i++) {
            if (new File("./test" + i + ".txt").delete()) {
                System.out.println("test" + i + ".txt has been deleted.");
            }
        }

    }
}
