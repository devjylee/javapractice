package ch04;

public class Break {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i = 1; i<=100; i++) {
			sum += i;
			if(sum>1000) {
				break;
			}
		}

		System.out.println("합계가 1000을 넘는 것은 1~"+i+"을 가산할 때 입니다.");
		// 합계가 1000이 넘는 것은 1~45를 가산할 때 입니다.
	}

}
