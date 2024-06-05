package ch10;

import java.util.stream.Stream;

public class SteamDistinct {

	public static void main(String[] args) {
		Stream.of("빨강", "물고기", "빨강", "메아리", "메아리")
		.distinct()
		.forEach(System.out::println);
	}

}
