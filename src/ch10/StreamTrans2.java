package ch10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTrans2 {

	public static void main(String[] args) {
		var list = Stream.of("장미", "나팔꽃", "튤립", "벚꽃")
				.filter(s -> s.endsWith("꽃"))
				.collect(Collectors.toList());
		for(String s : list) System.out.println(s);
	}

}
