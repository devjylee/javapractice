package ch10;

import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {
		Stream.of("장미", "나팔꽃", "튤립")
		.mapToInt(s -> s.length())
		.forEach(System.out::println);
	}

}
