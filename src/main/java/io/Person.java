package io;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
    private int age;
    private String name;
    private String gender;
    private transient String[] otherInfo;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }

    public Person(int age, String name, String gender, String[] otherInfo) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

}
