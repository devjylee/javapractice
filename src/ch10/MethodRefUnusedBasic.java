package ch10;

public class MethodRefUnusedBasic {

	public static void main(String[] args) {
		var data = new String[] { "봄은 새벽", "밤은 여름", "가을은 해질녘"};
		var un = new MethodRefUnuse();
		un.walkArray(data);
	}

}
