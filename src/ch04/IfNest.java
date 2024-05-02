package ch04;

public class IfNest {

	public static void main(String[] args) {
		var i = 1;
		var j = 0;
		if(i == 1) {
			if(j == 1) {
				System.out.println("변수 i,j는 1이다.");
			} else {
				System.out.println("변수 i는 1이지만 j는 1이 아니다.");
			}
		} else {
			System.out.println("변수 i이 아니다.");
		}
		// 변수 i는 1이지만 j는 1이 아니다.
	}

}
