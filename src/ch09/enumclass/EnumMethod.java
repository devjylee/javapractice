package ch09.enumclass;

public class EnumMethod {

	public static void main(String[] args) {
		
		for(var se: Season.values()) {
			System.out.println(se.ordinal() + ":" + se.toString());
		}
		//0:SPRING
		//1:SUMMER
		//2:AUTUMN
		//3:WINTER
		
		var s = Season.valueOf("SPRING");
		System.out.println(s instanceof Season);
		
		for (var se: Season.values()) {
			se.show();
		}
		
		//봄은 새벽
		//여름은 밤
		//가을은 해질녘
		//겨울은 이른 아침

		
	}
	
}
