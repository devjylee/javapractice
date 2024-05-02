package ch05;

import java.util.regex.Pattern;

public class RegAfter {

	public static void main(String[] args) {
		var str = "<p>서포트 사이트<a href=\"https://www.wings.msn.to/\">https://wings.msn.to/</a></p>";
		var ptn = Pattern.compile("<a href=\"(.+?)\">\\1</a>");
		var match = ptn.matcher(str);
		if (match.find()) {
			System.out.println(match.group());
		}
		//<a href=\"https://www.wings.msn.to/\">https://wings.msn.to/</a>
	}

}
