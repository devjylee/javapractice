package ch07.method;

public class Person {
	public String name;
	public int age;
	
	public String show() {
		return String.format("%s (%d살)입니다.\n", this.name, this.age);
	}
}
