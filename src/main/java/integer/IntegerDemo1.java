package integer;

public class IntegerDemo1 {
    public static void main(String[] args) {
        int num = 128;
        //Integer integer1 = new Integer(num);
        //Integer integer2 = new Integer(num);
        Integer integer1 = Integer.valueOf(num);
        Integer integer2 = Integer.valueOf(num);

        System.out.println("integer1 = " + integer1);
        System.out.println("integer2 = " + integer2);

        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));

        double dou = 12.3;
        Double douConv = Double.valueOf(dou);
        System.out.println(douConv);

        System.out.println(integer1.intValue());
        System.out.println(douConv.doubleValue());
        System.out.println(integer1.byteValue());
        System.out.println(douConv.byteValue());

    }
}
