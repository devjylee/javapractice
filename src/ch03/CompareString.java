package ch03;

public class CompareString {

	public static void main(String[] args) {
		var str1 = "abc";
		var str2 = "abc";
		System.out.println(str1 == str2); // true
		System.out.println(str1 == "a"+"bc"); // true
	}

}
