package string;

/**
 * String substring(int fromIndex, int endIndex)
 * 截取当前字符串中的子串
 *
 */
public class SubStringDemo {
    public static void main(String[] args) {
        String line = "www.tedu.cn";
        String substr = line.substring(4, 8);
        System.out.println(substr);

        System.out.println(line.substring(4));
    }
}
