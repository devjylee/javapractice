package ch10;

import java.util.stream.Stream;

public class StreamReduce3 {

	public static void main(String[] args) {
		System.out.println(
			Stream.of("153", "211", "112", "350", "418", "208")
			.parallel()
			.reduce(0,
					// 각각의 요소를 계산
					(result, value) -> {
						return result + Integer.parseInt(value);
					},
					// 분산된 결과를 합친다
					(result1, result2) -> {
						return result1 + result2;
					}
			)
		);
		
	}

}
