package ch05;

public class StrContains {

	public static void main(String[] args) {
		var str = "WINGSプロジェクト";
		System.out.println(str.contains("プロ")); // true
		System.out.println(str.startsWith("WINGS")); // true
		System.out.println(str.startsWith("WINGS",3)); // false
		System.out.println(str.endsWith("WINGS")); // false
	}

}
