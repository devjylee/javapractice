package ch09.exception;

public class AssertBasic {

	public static void main(String[] args) {
		
		System.out.println(getTrapezoidArea(0, 0, 0));;
		
	}

	private static double getTrapezoidArea(double upper, double lower, double height) {
		//인수가 0 이하일 경우 예외를 발생
		assert upper > 0 && lower > 0 && height > 0 : "인수가 0보다 작음";
		return (upper + lower) * height / 2;
	}
	
}
