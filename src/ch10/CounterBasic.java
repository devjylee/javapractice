package ch10;

public class CounterBasic {

	public static void main(String[] args) {
		var data = new String[] { "봄은 새벽", "밤은 여름", "가을은 해질녘"};
		var u = new MethodRefUse();
		var c = new Counter();
		u.walkArray(data, c::addLength);
		System.out.println(c.getResult());
		
	}

}
