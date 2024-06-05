package ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class StreamCollectOf2 {

	public static void main(String[] args) {
		System.out.println(
			Arrays.toString(
				Stream.of("장미", "나팔꽃", "튤립", "벚꽃")
						.sorted()
						.collect(
								Collector.of(
											ArrayList::new,
											ArrayList::add,
											(list1, list2) -> {
												list1.addAll(list2);
												return list1;
											},
											list -> list.toArray()
										)
								)
							)
		);
	}

}
