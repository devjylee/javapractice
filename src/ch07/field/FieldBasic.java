package ch07.field;

public class FieldBasic {

	public static void main(String[] args) {
		var p1 = new Person();
		p1.name = "야마다 타로";
		p1.age = 30;
		
		var p2 = new Person();
		p2.name = "스즈키 하나코";
		p2.age = 25;
		
		System.out.printf("%s (%d살)\n", p1.name, p1.age); // 야마다 타로 (30살)
		System.out.printf("%s (%d살)\n", p2.name, p2.age); // 스즈키 하나코 (25살)
	}

}
