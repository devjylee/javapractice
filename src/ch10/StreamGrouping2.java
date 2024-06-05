package ch10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGrouping2 {

	public static void main(String[] args) {
		System.out.println(
				Stream.of("장미", "나팔꽃", "튤립", "벚꽃")
						.sorted()
						.collect(Collectors.groupingBy(str -> str.length(), Collectors.joining("/")))
		);
	}

}
