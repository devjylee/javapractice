package ch10;

import java.util.stream.Stream;

public class StreamForEach {

	public static void main(String[] args) {
		Stream.of("장미", "나팔꽃", "튤립", "벚꽃")
		.forEach(v -> System.out.println(v));
	}

}
