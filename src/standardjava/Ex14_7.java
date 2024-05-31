package standardjava;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_7 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
					new String[] {"abc", "def", "jkl"},
					new String[] {"ABC", "GHI", "JKL"}
				);
		
		// flatMap을 이용해 하나의 스트림으로 합쳐줌
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
		
		strStrm.map(String::toLowerCase)
				.distinct()
				.sorted()
				.forEach(System.out::println);
		
		System.out.println();
		
		String[] lineArr = {
			"Belive or not It is true",
			"Do or do not There is no try",
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +")))
					.map(String::toLowerCase)
					.distinct()
					.sorted()
					.forEach(System.out::println);

	}

}
