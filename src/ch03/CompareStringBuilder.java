package ch03;

public class CompareStringBuilder {

	public static void main(String[] args) {
		var builder1 = new StringBuilder("abc");
		var builder2 = new StringBuilder("abc");
		System.out.println(builder1 == builder2); // false
		System.out.println(builder1.equals(builder2)); // true
	}

}
