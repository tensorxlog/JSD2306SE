package apidoc;

/**
 * 字符串常量池
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hello";
        String s4 = new String("hello");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println(s1 == s2);
        System.out.println("s3: " + s3);
        System.out.println(s1 == s3);
        System.out.println("s4: " + s4);
        System.out.println(s4 == s1);

        s1 = s1 + "!";
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println(s1 == s2);
        String s5 = "he" + "llo";
        System.out.println(s2 == s5);

        String s = "hel";
        String s6 = s + "lo";
        System.out.println(s2 == s6);

    }
}
