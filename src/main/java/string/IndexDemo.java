package string;

/**
 * int indexOf(String s)
 * 检索当前字符串中某个子串第一次出现的位置，若不存在则返回-1
 *
 */
public class IndexDemo {
    public static void main(String[] arga) {
        String line = "thinking in java";
        System.out.println(line.indexOf("in"));
        System.out.println(line.indexOf("in", 4));
        System.out.println(line.lastIndexOf("in"));
    }
}
