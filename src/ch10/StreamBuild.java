package ch10;

import java.util.stream.Stream;

public class StreamBuild {

	public static void main(String[] args) {
		var builder = Stream.builder()
				.add("무화과")
				.add("당근")
				.add("산초");
		builder.build().forEach(System.out::println);
	}

}
