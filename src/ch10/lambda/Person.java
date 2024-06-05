package ch10.lambda;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
    	return String.format("%s (%d살)", this.name, this.age);
    }
}