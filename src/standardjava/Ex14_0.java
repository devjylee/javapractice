package standardjava;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_0 {
	
	public static void main(String[] args) {
		
		// 람다식
//		MyFunction f = new MyFunction() {
//			public int max (int a, int b) { // 오버라이딩 - 접근제어자는 좁게 못 바꾼다.
//				return a > b ? a : b;
//			}
//		};
		
		// 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다
		MyFunction2 f = (a, b) -> a > b ? a : b;
		
		int value = f.max(3, 5);
		System.out.println(value);
		
		
		
		
		//메소드 참조
//		Function<String, Integer> f1 = (String s) -> Integer.parseInt(s);
//		Function<String, Integer> f1 = 클래스이름::메서드이름;
		Function<String, Integer> f1 = Integer::parseInt;
		System.out.println(f1.apply("100")+100);

		
//		Supplier<MyClass> s = () -> new MyClass();
//		Supplier<MyClass> s = MyClass::new;
		
//		Function<Integer, MyClass> s = (i)-> new MyClass(i);
		Function<Integer, MyClass> s = MyClass::new;
		MyClass mc = s.apply(100);
		System.out.println(mc.iv);
		
//		Function<Integer, int[]> f2 = (i) -> new int[i];
		Function<Integer, int[]> f2 = int[]::new;
		int[] arr = f2.apply(100);
		System.out.println(arr.length);
	}

}

class MyClass {
	int iv;
	
	MyClass(int iv){
		this.iv = iv;
	}
}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상메서드만 가져야 함.
interface MyFunction2 {
//	public abstract int max(int a, int b);
	int max(int a, int b);
}
