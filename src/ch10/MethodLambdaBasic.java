package ch10;

public class MethodLambdaBasic {

	public static void main(String[] args) {
		var data = new String[] { "봄은 새벽", "밤은 여름", "가을은 해질녘"};
		var ml = new MethodLambda();
		// 람다식
		ml.walkArray(data, (String value) -> {
			System.out.printf("[%s]\n", value);
		});
		
		// 익명 클래스
//		ml.walkArray(data, new Consumer<String>() {
//			@Override
//			public void accept(String value) {
//				System.out.printf("[%s]\n", value);
//			}
//		});

	}

}
