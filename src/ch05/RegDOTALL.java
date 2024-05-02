package ch05;

import java.util.regex.Pattern;

public class RegDOTALL {

	public static void main(String[] args) {
		var str = "처음 뵙겠습니다.\n잘 부탁드립니다.";
		var ptn = Pattern.compile("^.+",Pattern.DOTALL);
		var match = ptn.matcher(str);
		while (match.find()) {
			System.out.println(match.group());
		}
		//처음 뵙겠습니다.
		//잘 부탁드립니다.
	}

}
