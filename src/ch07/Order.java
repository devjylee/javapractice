package ch07;

public class Order {
	// 필드의 초기화 값
	String value = "First!";
	
	// 생성자
	public Order() {
		System.out.println(value);
	}
	
	// 초기화 블록
	{
		value = "Second!!";
	}
	
}
