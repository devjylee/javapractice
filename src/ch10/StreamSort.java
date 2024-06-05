package ch10;

import java.util.stream.Stream;

public class StreamSort {

	public static void main(String[] args) {
		Stream.of("장미", "나팔꽃", "튤립")
//		.sorted()
		.sorted((str1, str2) -> str1.length() - str2.length())
		.forEach(System.out::println);
	}

}
