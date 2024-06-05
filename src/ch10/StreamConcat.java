package ch10;

import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {
		var stream1 = Stream.of("무화과","당근","산초");
		var stream2 = Stream.of("표고버섯","우엉","무환자");
		Stream.concat(stream1, stream2).forEach(System.out::println);
	}

}
