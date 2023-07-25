package homework.day07;

public class ThrowDemo {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(1000);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }

        System.out.println("此人年龄为" + person.getAge());
    }
}
