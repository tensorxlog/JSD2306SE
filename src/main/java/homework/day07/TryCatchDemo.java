package homework.day07;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
//            String s = null;
            String s = "";
            System.out.println(s.length());
            System.out.println(s.charAt(0));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("程序结束了");
    }
}
