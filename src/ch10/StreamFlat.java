package ch10;

import java.util.Arrays;

public class StreamFlat {

	public static void main(String[] args) {
		var list = new String[][] {
				{"아이우", "카키쿠", "사시스"},
				{"타치츠", "나니누"},
				{"하히후", "마미무"},
		};
		Arrays.stream(list)
//		.flatMap(v -> Arrays.stream(v))
		.flatMap(v -> Arrays.stream(v).map(str -> str.substring(0,1)))
		.forEach(System.out::println);

	}
}
