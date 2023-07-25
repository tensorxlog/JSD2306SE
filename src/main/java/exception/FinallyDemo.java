package exception;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("the program begins");
        String line = null;
        try {
            System.out.println(line.length());
            return;
        } catch (Exception e) {
            System.out.println("an error has occured");
        } finally {
            System.out.println("the finally block");
        }

        System.out.println("the program ends");
    }
}
