package reflect;

public class Student {
    private String name = "张三";
    private int age = 18;
    private char gender = '男';

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student() {}

    public void study() {
        System.out.println(name + ": 好好学习，天天向上！");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void sleep() {
        System.out.println(name + ": 睡个觉。");
    }
}
