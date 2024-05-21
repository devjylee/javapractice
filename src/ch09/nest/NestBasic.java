package ch09.nest;

public class NestBasic {

	public static void main(String[] args) {
		var c = new MyClass();
		c.run(); // Nested class is running!
		
//		var h = new MyClass.MyHelper(); // error
	}

}
