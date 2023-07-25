package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("the program starts");
        try {
            String s = "abc";
            System.out.println(s.length());
            System.out.println(s.charAt(0));
            System.out.println(Integer.parseInt(s));
            System.out.println("test");
        }
        //catch(NullPointerException e) {
        //    System.out.println("There appears the NullPointerException");
        //} catch(StringIndexOutOfBoundsException e) {
        //    System.out.println("There appears the StringIndexOutOfBoundsException");
        //}
        catch (NullPointerException|StringIndexOutOfBoundsException e) {
            System.out.println("There appears the NullPointerException or the StringIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Unknown exception");
        }
        System.out.println("the program ends");
    }
}
