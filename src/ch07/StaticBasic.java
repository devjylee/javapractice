package ch07;

public class StaticBasic {

	public static void main(String[] args) {
		System.out.println(Figure.getTriangleArea(10, 20)); // 100.0
//		var f = new Figure();
//		System.out.println(f.getTriangleArea(10, 20));
		
		System.out.println(Figure.pi); // 3.14
		Figure.getCircleArea(5); // 원의 면적은 78.5
	}

}
