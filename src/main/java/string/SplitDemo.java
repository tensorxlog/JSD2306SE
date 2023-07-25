package string;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String line = "ab23234.cd09j";
        String[] arr = line.split("\\d+");
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(line.split("\\.")));

        String line1 = "a===b===c======";
        System.out.println(Arrays.toString(line1.split("=")));
    }
}
