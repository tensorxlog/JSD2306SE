package string;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());

        StringBuilder sb2 = new StringBuilder("hell0");
        System.out.println(sb2.length());

        //sb2.append("abc");
        //System.out.println(sb2.length());
        //System.out.println(sb2.toString());

        //sb2.replace(2, 3, "111");
        //System.out.println(sb2);

        //sb2.delete(2, 5);
        //System.out.println(sb2);

        //sb2.insert(0, "test");
        //System.out.println(sb2);

        sb2.append("abc").replace(2, 3, "111").delete(2, 5).insert(0, "test");
        System.out.println(sb2);

        System.out.println(sb2.reverse());
    }
}
