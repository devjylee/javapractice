package ch05;

public class AutoBoxing {

	public static void main(String[] args) {
		// Long은 long의 실수
		Long result = 0L;

		// 1~10000의 총합을 구하라
		for(var i = 1; i< 10000; i++) {
			// 언복싱(가산) + 복싱(대입)의 발생
			result += i;
		}

		System.out.println(result); //49995000
	}

}
