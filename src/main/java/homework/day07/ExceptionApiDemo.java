package homework.day07;

public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            System.out.println(Integer.parseInt("abc"));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("程序结束了");
    }
}
