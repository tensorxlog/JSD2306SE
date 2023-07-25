package integer;

public class IntegerDemo2 {
    public static void main(String[] args) {
        int imax = Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        double dmax = Double.MAX_VALUE;
        double dmin = Double.MIN_VALUE;
        System.out.println(imax + ", " + imin + "; " + dmax + ", " + dmin);

        String s1 = "123";
        System.out.println(Double.parseDouble(s1));
        System.out.println(Byte.parseByte(s1));

        Integer temp = Integer.valueOf(3);
        int x = temp;
        System.out.println(x);
    }
}
