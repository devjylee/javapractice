package ch10;

import java.util.stream.IntStream;

public class StreamRange {

	public static void main(String[] args) {
		IntStream.range(10, 20).forEach(System.out::println);;
		
	}

}
