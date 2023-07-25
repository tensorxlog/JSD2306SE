package string;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String s = "abc23skdf23sd";
        System.out.println(s.replaceAll("[0-9]+", "TEST"));
        System.out.println(s.replaceAll("[a-zA-Z]", "#NUMBER"));

        String regex = "(wqnmlgb|dsb|nc|sb|rnm|fw|djb)";
        String message = "wqnmlgb!你这个dsb，怎么这么nc，你就纯纯的djb!";
        System.out.println(message.replaceAll(regex, "***"));

    }
}
