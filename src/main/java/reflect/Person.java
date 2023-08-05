package reflect;

public class Person {
    private String name = "test";
    private int age = 20;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void sayHello() {
        System.out.println(name + ": hello!");
    }

    public void sayHi() {
        System.out.println(name + ": Hi!");
    }

    public void doSome() {
        System.out.println(name + ": is doing something.");
    }

    public void sleep() {
        System.out.println(name + ": is sleeping.");
    }

    public void watchTV() {
        System.out.printf(name + ": is watching TV.");
    }

    public void study() {
        System.out.println(name + ": is stutying.");
    }

    public void playGame() {
        System.out.println(name + ": is playing games.");
    }

    public void say(String info) {
        System.out.println(name + ": " + info);
    }

    private void test() {
        System.out.println("a private method");
    }

    public void say(String info, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name + ": " + info);
        }
    }
}
