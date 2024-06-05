package ch10;

import java.util.stream.Stream;

public class StreamFind {

	public static void main(String[] args) {
		var str = Stream.of("장미", "나팔꽃", "튤립", "벚꽃")
		.parallel()
		.filter(s-> s.endsWith("꽃"))
		.findAny();
		
		System.out.println(str.orElse("-"));
	}

}
