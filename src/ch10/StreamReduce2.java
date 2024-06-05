package ch10;

import java.util.stream.Stream;

public class StreamReduce2 {

	public static void main(String[] args) {
		System.out.println(
				Stream.of("장미", "나팔꽃", "튤립", "벚꽃")
						.sorted()
						.reduce("해바라기", (result, str) -> {
							return result + "," + str;
							})
			);
		
		System.out.println(
				Stream.of("장미", "나팔꽃", "튤립", "벚꽃")
						.sorted()
						.parallel()
						.reduce("해바라기", (result, str) -> {
							return result + "," + str;
							})
			);
	}

}
