package exception;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "abc";
        char[] values = {'a', 'b', 'c'};
        String s2 = new String(values);
        System.out.println(s2);
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
    }
}
