package ch05;

public class StrSubstring {

	public static void main(String[] args) {
		var str = "WINGSプロジェクト";
		System.out.println(str.substring(5, 7)); // true プロ
		System.out.println(str.substring(5, 2)); // error begin>end이 되면 안됨
		System.out.println(str.substring(-5)); // error begin은 음수가 되면 안 됨
		System.out.println(str.substring(15)); // error 문자열보다 큼
	}

}
