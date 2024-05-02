package ch07.optional2;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// Optional 오브젝트를 생성
		var opt1 = Optional.of("샘플1");
		var opt2 = Optional.ofNullable(null);
		var opt3 = Optional.empty();
		
		// 값이 존재하는지 확인
		System.out.println(opt1.isPresent()); //true
		
		// 값이 존재할 경우, 람다식을 실행
		opt1.ifPresent(value -> {
			System.out.println(value); //샘플1
		});
		
		// opt2의 값이 존재할 경우, null일 경우는 인수 값을 표시
		System.out.println(opt2.orElse("null값입니다.")); //null값입니다.
		
		// opt3가 null값일 경우, 람다식을 실행
		System.out.println(opt3.orElseGet(() -> {
			return "null값입니다.";
		}));//null값입니다.
	}

}
