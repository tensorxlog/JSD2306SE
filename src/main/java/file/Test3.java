package file;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File dir = new File("./myDir");
        dir.mkdir();
        for (int i = 0; i < 10; i++) {
            File file = new File(dir, "test" + i + ".txt");
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
