package ch09.nestinnerclass;

public class MyClass {
	
	private String str1 = "포함 인스턴스";
	private static String str2 = "포함 클래스";
	
	// 내부 클래스의 정의
	private static class MyHelper {
		private String str1 = "네스트 인스턴스";
		private static String str2 = "네스트 클래스";
		
		public void show() {
//			System.out.println(MyClass.this.str1);
			System.out.println(MyClass.str2); // 포함 클래스
		}
	}

	public void run() {
		var helper = new MyHelper();
		helper.show();
		System.out.println(helper.str1); // 네스트 인스턴스
		System.out.println(MyHelper.str2); // 네스트 클래스
	}

}
