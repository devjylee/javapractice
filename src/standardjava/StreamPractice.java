package standardjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		intStream.forEach(System.out::print);
		
		// stream은 일회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
		intStream = list.stream();
		intStream.forEach(System.out::print);
	}

}
