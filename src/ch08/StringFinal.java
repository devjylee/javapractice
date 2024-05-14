package ch08;

public class StringFinal {

	public static void main(String[] args) {
		//String 클래스는 불변 클래스
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		if (str1.equals(str2)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		} // same
		
		if (str1 == str2) {
			System.out.println("same");
		} else {
			System.out.println("different");
		} // same
		//String은 final 클래스이기 때문에 똑같은 값을 한번만 저장한다
		
		
		//새로 객체를 만들고 싶다면 new를 이용한다
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		if (str3.equals(str4)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		} // same
		
		if (str3 == str4) {
			System.out.println("same");
		} else {
			System.out.println("different");
		} // different
		
		
	}

}
