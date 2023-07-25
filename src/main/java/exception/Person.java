package exception;

public class Person {
	private int age;

    public void setAge(int age) throws IllegalAgeException {
        if (age < 0 || age > 100) {
            //throw new RuntimeException("年龄超出范围");
            throw new IllegalAgeException("年龄超出范围");
        }
         this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}