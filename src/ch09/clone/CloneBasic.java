package ch09.clone;

public class CloneBasic {

	public static void main(String[] args) {
		var p1 = new Person("타로", "야마다");
		var p2 = p1.clone();
		System.out.println(p1 == p2); //false
		System.out.println(p2); //야마다 타로
	}

}
