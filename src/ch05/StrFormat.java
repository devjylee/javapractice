package ch05;

import java.time.LocalDateTime;
import java.util.Locale;

public class StrFormat {

	public static void main(String[] args) {
		System.out.println(String.format("%s는 %s, %d살입니다.","사쿠라","여자아이",1));
		// 사쿠라는 여자아이, 1살입니다.
		System.out.println(String.format("이름은 %1$s, %3$d살입니다. %1$s는 건강합니다.","사쿠라","여자아이",1));
		// 이름은 사쿠라, 1살입니다. 사쿠라는 건강합니다.
		System.out.println(String.format("%.2s입니다.","사쿠라"));
		// 사쿠입니다.
		System.out.println(String.format("%5s입니다.","사쿠라"));
		//  사쿠라입니다.
		System.out.println(String.format("%-5s입니다.","사쿠라"));
		// 사쿠라  입니다.
		System.out.println(String.format("10진수 %08d", 12345));
		// 10진수 00012345
		System.out.println(String.format("16진수 %#x", 10));
		// 16진수 0xa
		System.out.println(String.format("부동소수점수 %.2f", 123.456));
		// 부동소수점수 123.46
		System.out.println(String.format("지수/소문자 %.2e", 123.456));
		// 지수/소문자 1.23e+02
		System.out.println(String.format("지수/대문자 %.2E", 123.456));
		// 지수/대문자 1.23E+02

		var d = LocalDateTime.now();
		System.out.println(String.format("%tF", d));
		// 2024-04-09
		System.out.println(String.format("%tr", d));
		// 04:52:56 오후
		System.out.println(String.format("%1$tY년 %1$tm월 %1$td일", d));
		// 2024년 04월 09일
		System.out.println(String.format(Locale.GERMAN, "%f", 1234.567));
		// 1234,567000
		System.out.println(String.format(Locale.GERMAN, "%tr", d));
		// 04:52:56 NACHM
		System.out.println(String.format("%.2s입니다.\n","사쿠라"));
		// 사쿠입니다.
	}

}
