package ch09.equals;

public class EqualsBasic {

	public static void main(String[] args) {
		var p = new Person("야마다", "타로");
		var bp = new BusinessPerson("야마다", "타로", "영업");
		
		System.out.println(p.equals(bp)); //true
		System.out.println(bp.equals(p)); //true
	}

}
