package ch05;

public class StrStrip {

	public static void main(String[] args) {
		var str = "  Wings Project  ";
		System.out.println(str.strip()); //Wings Project
		System.out.println(str.stripLeading()); //Wings Project  
		System.out.println(str.stripTrailing()); //  Wings Project
	}

}
