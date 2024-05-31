package standardjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		intStream.forEach(System.out::print);
		
		// stream은 일회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
		intStream = list.stream();
		intStream.forEach(System.out::print);
		System.out.println();
		
		Stream<String> strStream1 = Stream.of("a", "b", "c");
		strStream1.forEach(System.out::println);
		
		String[] strArr = {"a", "b", "c", "d"};
		Stream<String> strStream2 = Stream.of(strArr);
//		Stream<String> strStream2 = Arrays.stream(strArr);
		strStream2.forEach(System.out::println);
		
		int[] intArr = {1, 2, 3, 4, 5};
		IntStream intStream2 = Arrays.stream(intArr);
//		intStream2.forEach(System.out::println);
		System.out.println("count= " + intStream2.count()); // IntStream에는 count, sum, average 같은 함수 제공

	
	}

}
