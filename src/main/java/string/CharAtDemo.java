package string;

public class CharAtDemo {
    public static void main(String[] args) {
        String s = "www.tedu.cn";
        System.out.println(s.charAt(3));

        String str = "abcba";
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("不是回文");
                return;
            }
        }

        System.out.println("是回文");
    }

}
