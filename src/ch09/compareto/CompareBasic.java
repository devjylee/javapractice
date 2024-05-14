package ch09.compareto;

import java.util.Arrays;

public class CompareBasic {

	public static void main(String[] args) {
		var data = new Person[] {
				new Person("타로", "마츠다"),
				new Person("리코", "모리야마"),
				new Person("코우스케", "모리타"),
				new Person("마리코", "모리야"),
				new Person("소우시", "무라카미"),
				new Person("에미", "야마다")				
		};
		
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
	}

}
