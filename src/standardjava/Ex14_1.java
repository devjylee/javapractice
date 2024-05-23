package standardjava;

interface MyFunction {
	void run();
}

public class Ex14_1 {

	// 매개변수 타입이 MyFunction인 메소드
	static void execute(MyFunction f) {
		f.run();
	}
	
	
	// 반환 타입이 MyFunction인 메소드
	static MyFunction getMyFunction() {
//		MyFunction f = () -> System.out.println("f3.run()");
//		return f;
		return () -> System.out.println("f3.run()");
	}
	
	public static void main(String[] args) {
		// 람다식으로 MyFunction의 run()을 구현
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		// 익명클래스로 run()을 구현
		MyFunction f2 = new MyFunction() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
//		MyFunction f3 = getMyFunction();
		MyFunction f3 = () -> System.out.println("f3.run()");;
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(()->System.out.println("f1.run()"));
		execute(()->System.out.println("run()"));
		
	}

}
