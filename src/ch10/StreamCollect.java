package ch10;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {
		System.out.println(
			Stream.of("장미", "나팔꽃", "튤립", "벚꽃")
			.sorted()
			.collect(
					ArrayList<String>::new,
					(list, str) -> list.add(str),
					(list1, list2) -> list1.addAll(list2)
					)
		);
	}

}
