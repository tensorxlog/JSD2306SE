package string;

public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String s1 = "a2skfDcf";
        String s2 = "A2SKfdcf";
        System.out.println(s1.equalsIgnoreCase(s2));
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        System.out.println(s1.equals(s2));

    }
}
