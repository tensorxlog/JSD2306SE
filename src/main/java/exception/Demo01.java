package exception;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Name1", 20, 80));
        list.add(new Student("Name1", 17, 82));
        list.add(new Student("Name1", 16, 90));
        list.add(new Student("Name1", 19, 78));
        list.add(new Student("Name1", 21, 89));
        System.out.println(list.stream().filter(student -> student.getAge() > 18).map(student -> {student.setGrade(student.getGrade() - 10); return student;}).sorted((s1, s2) -> (int) (s2.getGrade() - s1.getGrade())).collect(Collectors.toList()));


    }
}

class Student {
    String name;
    int age;
    float grade;

    Student(String name, int age, float grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}