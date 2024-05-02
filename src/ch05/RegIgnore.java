package ch05;

import java.util.regex.Pattern;

public class RegIgnore {

	public static void main(String[] args) {
		var str = "사업용은 wings@example.com입니다.개인용은 YAMA@exapmle.com입니다.";
		var ptn = Pattern.compile("[a-z0-9.!#$%&'*+/=?^_{|}~-]+@[a-z0-9-]+(\\.[a-z0-9-]+)",Pattern.CASE_INSENSITIVE);
		var match = ptn.matcher(str);
		while (match.find()) {
			System.out.println(match.group());
		}
		//wings@example.com
		//YAMA@exapmle.com
	}

}
