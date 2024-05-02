package ch07;

public class ScopeBasic {

	public static void main(String[] args) {
		var s = new Scope();
		
		System.out.println(s.show()); //필드
		System.out.println(s.data); //필드
	}

}
