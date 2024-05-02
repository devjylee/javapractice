package ch05;

import java.util.regex.Pattern;

public class RegSplit {

	public static void main(String[] args) {
		var str = "니와니3와우라니와니51와니와토리가이루";
		var re = Pattern.compile("\\d{1,}와");
		var result = re.split(str);
		System.out.println(String.join(" ", result));
		//니와니 우라니와니 니와토리가이루
	}

}
