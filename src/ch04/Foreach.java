package ch04;

public class Foreach {
	
	public static void main(String[] args) {
		var data = new String[] {"a", "b", "c"};
		for(var value : data) {
			System.out.println(value);
		}
	}

}
