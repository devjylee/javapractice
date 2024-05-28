package ch10;

public class MethodRefUseBasic {

	public static void main(String[] args) {
		var data = new String[] { "봄은 새벽", "밤은 여름", "가을은 해질녘"};
		var u = new MethodRefUse();
		u.walkArray(data, MethodRefUse::addQuote);
	}

}
