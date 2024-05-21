package standardjava;

class Outer {
	
	private int iv = 0;
	protected static int cv = 0;
	
	void myMethod() {
		int lv = 0;
	}
	
}

// 변수의 범위와 같다고 보면 됨
class OuterClass {
	
	private int outeriv = 0;
	protected static int outercv = 0;
	
	// 내부클래스
	class InstanceInner {
		int iiv = outeriv; // 외부 클래스의 private 멤버도 접근 가능
		int iiv2 = outercv;
	}
	
	// static 멤버 클래스
	protected static class StaticInner {
//		int siv = outerIv; 
		static int scv = outercv;
	}
	
	// 지역 내부 클래스
	void myMethod() {
		int lv = 0; // 값이 바뀌지 않는 변수는 상수로 간주
		final int LV = 0; // JDK 1.8 부터 final 생략 가능
		// final을 붙이는 것을 추천
		
		class LocalInner {
			int liv = outeriv;
			int liv2 = outercv;
			int liv3 = lv; // JDK 1.8 이후로 에러 아님. 원래는 상수만 접근 가능했음.
			int liv4 = LV;
		}
	}
	
}
