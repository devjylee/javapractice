package ch07.staticfield;

public class ConstantInstance {

	public static void main(String[] args) {
		var app1 = new MyApp("독습 Java");
		System.out.println(app1.APP_NAME); //독습 Java

		var app2 = new MyApp("Teach Yourself Java");
		System.out.println(app2.APP_NAME); //Teach Yourself Java
	}

}
