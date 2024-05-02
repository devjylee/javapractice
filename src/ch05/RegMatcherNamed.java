package ch05;

import java.util.regex.Pattern;

public class RegMatcherNamed {

	public static void main(String[] args) {
		var msg = "회사의 전화는 0123-99-0000입니다. 자택은 000-123-4567입니다.";
		var ptn = Pattern.compile("(?<area>\\d{2,4})-(?<city>\\d{2,4})-(?<local>\\d{4})");
		var match = ptn.matcher(msg);
		while (match.find()) {
			System.out.println("개시 위치:"+match.start());
			System.out.println("종료 위치:"+match.end());
			System.out.println("매치 문자열:"+match.group());
			System.out.println("시외 국번:"+match.group("area"));
			System.out.println("시내 국번:"+match.group("city"));
			System.out.println("가입자 번호:"+match.group("local"));
			System.out.println("-----");
		}
		//개시 위치:8
		//종료 위치:20
		//매치 문자열:0123-99-0000
		//시외 국번:0123
		//시내 국번:99
		//가입자 번호:0000
		//-----
		//개시 위치:29
		//종료 위치:41
		//매치 문자열:000-123-4567
		//시외 국번:000
		//시내 국번:123
		//가입자 번호:4567
		//-----
	}

}
