package ch07.staticfield;

public class Figure {
	public static double pi = 3.14;
	
	public static void getCircleArea(double r) {
		System.out.println("원의 면적은 "+ r * r * pi);
	}

}
