package string;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }

        System.out.println("完成");
    }
}
