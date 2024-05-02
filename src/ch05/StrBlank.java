package ch05;

public class StrBlank {

	public static void main(String[] args) {
		var str1 = "";
		var str2 = " ";
		System.out.println(str1.isEmpty()); // true
		System.out.println(str1.isBlank()); // true
		System.out.println(str2.isEmpty()); // false
		System.out.println(str2.isBlank()); // true
	}

}
