package ch07.method2;

public class Person {
	public String name;
	public int age;
	
	public void show() {
		System.out.printf("%s (%d살)입니다.\n", this.name, this.age);
		return;
	}
}
