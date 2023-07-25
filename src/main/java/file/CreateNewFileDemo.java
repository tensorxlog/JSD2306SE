package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        if (file.exists()) {
            System.out.println("already existed");
        } else {
            file.createNewFile();
            System.out.println("file created.");
        }

        for (int i = 0; i < 100; i++) {
            new File("./test" + i + ".txt").createNewFile();
        }
    }
}
