package ch10;

import java.util.stream.Stream;

public class StreamTrans {

	public static void main(String[] args) {
		var list = Stream.of("장미", "나팔꽃", "튤립", "벚꽃")
				.filter(s -> s.endsWith("꽃"))
				.toArray();
		for(Object s : list) System.out.println(s);
	}

}
