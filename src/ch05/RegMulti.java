package ch05;

import java.util.regex.Pattern;

public class RegMulti {

	public static void main(String[] args) {
		var str = "10인의 인디안. \n1년생이 되면 ";
		var ptn = Pattern.compile("^\\d*");
		//var ptn = Pattern.compile("^\\d*",Pattern.MULTILINE|Pattern.CASE_INSENSITIVE); // 10 1
		var match = ptn.matcher(str);
		while (match.find()) {
			System.out.println(match.group());
		}
		//10
	}

}
