package ch10;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMin {

	public static void main(String[] args) {
		var str = Stream.of("볼락", "꽁치", "넙치", "정어리", "임연수")
						.min(Comparator.naturalOrder());
		System.out.println(str.orElse(""));
	}

}
