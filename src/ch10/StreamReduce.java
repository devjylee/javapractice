package ch10;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamReduce {
	
	public static void main(String[] args) {
		System.out.println(
			Stream.of("장미", "나팔꽃", "튤립", "벚꽃")
					.sorted()
					.reduce((result, str) -> {
						return result + "," + str;
						})
					.orElse("")
		);
		
		var list = new String[] {"장미", "나팔꽃", "튤립", "벚꽃"};
		Arrays.sort(list);
		var result = "";
		for(var str : list) {
			result += str + ",";
		}
		System.out.println(result);
	}
	
}
