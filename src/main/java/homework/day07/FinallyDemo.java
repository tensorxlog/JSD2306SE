package homework.day07;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String s = null;
            System.out.println(s.length());
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally执行了");
        }
    }
}
