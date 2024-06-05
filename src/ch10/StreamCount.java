package ch10;

import java.util.stream.Stream;

public class StreamCount {

	public static void main(String[] args) {
		System.out.println(
			Stream.of("장미", "나팔꽃", "튤립", "벚꽃")
					.filter(s -> s.length() > 3)
					.count()
		);
		
	}

}
