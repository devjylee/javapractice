package standardjava;

class Ex7_12 {
	
	class InstanceInner {
		int iv = 100;
//		static int cv = 100; // static 변수 선언 불가
		final static int CONST = 100; // 상수 가능
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static 클래스만 static 멤버 정의 가능
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300; // static 변수 선언 불가
			final static int CONST = 300; // 상수 가능
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST); // 100
		System.out.println(StaticInner.cv); // 200
//		System.out.println(LocalInner.CONST); // 메서드 내부에 있는 클래스는 메서드 내부에서만 사용 가능
	}

}
