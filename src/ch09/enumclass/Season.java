package ch09.enumclass;

public enum Season {
	
	SPRING(0, "봄") 
	{
		public void show() {
			System.out.println("봄은 새벽");
		}
	},
	SUMMER(1, "여름")
	{
		public void show() {
			System.out.println("여름은 밤");
		}
	},
	AUTUMN(2, "가을")
	{
		public void show() {
			System.out.println("가을은 해질녘");
		}
	},
	WINTER(3, "겨울")
	{
		public void show() {
			System.out.println("겨울은 이른 아침");
		}
	},;

	// 필드 선언
	private int code; // 계절 코드
	private String name; // 계절 이름

	// 생성자
	private Season(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	// 메소드
	public int toSeasonValue() {
		return this.code;
	}
	
	@Override
	public String toString () {
		return this.name;
	}
	
	// 열거 정수가 실장해야할 기능(추상 메소드)
	public abstract void show();
	
}
