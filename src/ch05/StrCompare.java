package ch05;

public class StrCompare {

	public static void main(String[] args) {
		var str = "def";
		System.out.println(str.compareTo("abc")); // 3
		System.out.println(str.compareTo("def")); // 0
		System.out.println(str.compareTo("xyz")); // -20
		System.out.println(str.compareToIgnoreCase("DEF")); // 0
	}

}
