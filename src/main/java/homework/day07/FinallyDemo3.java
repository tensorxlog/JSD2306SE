package homework.day07;

public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(test("0") + ", " + test("") + ", " + test(null));
    }

    static int test(String s) {
        try {
            return s.charAt(0) - '0';
        } catch (NullPointerException e) {
            System.out.println("出现空指针异常");
            return 1;
        } catch (Exception e) {
            System.out.println("出现其他异常");
            return 2;
        } finally {
            System.out.println("进入finally语句块");
            return 3;
        }
    }
}
