package string;

public class MatchesDemo {
    public static void main(String[] args) {
        String testStr = "this@where.com";
        String testStr1 = "this@wh*ere.com";
        String regex = "\\w+@[A-Za-z0-9]+(\\.[a-zA-Z]+)+";
        System.out.println(testStr.matches(regex));
        System.out.println(testStr1.matches(regex));
    }
}
