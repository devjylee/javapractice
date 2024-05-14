package ch08;

public class StringAppend {

	public static void main(String[] args) {
		//String 클래스는 문자열을 연결할때 str1과 str2를 더한 임의의 문자열을 하나 더 생성한다
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1+str2);
		
		//StringBuffer와 StringBuilder는 문자열을 저장공간에 쌓아두었다가 출력한다
		StringBuffer sb1 = new StringBuffer();
		sb1.append(str1).append(str2).toString();
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append(str1).append(str2).toString();
		System.out.println(sb2);
		
	}

}
