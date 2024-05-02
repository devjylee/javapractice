package ch03;

public class DivZero {

	public static void main(String[] args) {
		System.out.println(5/0); // Error
		System.out.println(5%0); // Error
		System.out.println(5d/0); // Infinity
		System.out.println(5d%0); // NaN
	}

}
