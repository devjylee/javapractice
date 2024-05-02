package ch05;

public class StrSubstring2 {

	public static void main(String[] args) {
		var mail = "yamada@example.com";
		System.out.println(mail.substring(mail.lastIndexOf("@")+1)); // example.com
		System.out.println(mail.charAt(0)); // y
		for (var i = 0; i < mail.length(); i++) {
			System.out.println(mail.charAt(i));
		}
	}

}
