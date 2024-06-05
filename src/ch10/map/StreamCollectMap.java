package ch10.map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectMap {

	public static void main(String[] args) {
		System.out.println(
			Stream.of(
				new Person("야마다 타로", "tyamada@example.com"),
				new Person("스즈키 하나코", "hsuzuki@example.com"),
				new Person("이노우에 사부로", "sinoue@example.com"),
				new Person("사토 쿠미", "ksatou2@example.com"),
				new Person("야마다 타로", "yamataro@example.com")
			).collect(Collectors.toMap(
							Person::getName,
							Person::getEmail,
							(s, a) -> s + "/" + a
						)
					)
		);
	}

}
