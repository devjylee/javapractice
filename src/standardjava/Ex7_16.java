package standardjava;

public class Ex7_16 {

	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.method1();
		//            value: 30
		//       this.value: 20
		//Outer3.this.value: 10
	}

}

class Outer3 {
	// 외부 클래스의 iv
	int value = 10; // Outer3.this.value
	
	class Inner {
		// 내부 클래스의 iv
		int value = 20; // this. value
		
		void method1() {
			// local value
			int value = 30; 
			System.out.println("            value: "+ value);
			System.out.println("       this.value: "+ this.value);
			System.out.println("Outer3.this.value: "+ Outer3.this.value);
		}
	}
}
