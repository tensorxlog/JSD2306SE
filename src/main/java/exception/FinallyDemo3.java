package exception;

public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(test("0") + ", " + test(null) + ", " + test(""));

    }

    static int test(String s) {
        try {
            System.out.println("in try block");
            return s.charAt(0) - '0';
        } catch (NullPointerException e) {
            System.out.println("in catch block");
            return 1;
        } catch (Exception e) {
            System.out.println("in the second catch block");
            return 2;
        } finally {
            System.out.println("in finally block");
            return 3;
        }
    }
}
