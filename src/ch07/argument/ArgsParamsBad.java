package ch07.argument;

public class ArgsParamsBad {
	public int totalProducts(int... values) {
		// 인수가 없을 경우 에러
		if (values.length == 0) {
			throw new IllegalArgumentException("하나 이상의 인수를 지정해주세요.");
		}
		var result = 1;
		return result;

	}
	
}
