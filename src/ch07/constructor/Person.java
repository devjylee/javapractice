package ch07.constructor;

public class Person {
	public String name;
	public int age;
	
	// 생성자
	public Person (String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		this("이름 없음", 20);
	}
	
	public void show() {
		System.out.printf("%s (%d살)", this.name, this.age);
	}
}
