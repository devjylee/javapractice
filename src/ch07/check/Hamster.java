package ch07.check;

public class Hamster {
	public String name;
	public int age;
	
	public Hamster(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Hamster() {
		this("홍길동", 0);
	}
	
	public void show() {
		System.out.printf("%s (%살)\n", this.name, this.age);
	}
}
