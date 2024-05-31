package standardjava;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamRandom {
	
	public static void main(String[] args) {
		// 무한스트림
		IntStream intStream= new Random().ints();
		intStream.limit(5).forEach(System.out::println);
		
		System.out.println();
		
		// 유한스트림
		IntStream intStream2= new Random().ints(5, 1, 10);
		intStream2.forEach(System.out::println);
		
	}

}
