package ch10;

import java.util.stream.Stream;

public class StreamPeek {

	public static void main(String[] args) {
		Stream.of("물고기", "빨강", "메아리", "금목서")
		.peek(System.out::println)
		.sorted()
		.forEach(System.out::println);
	}

}
