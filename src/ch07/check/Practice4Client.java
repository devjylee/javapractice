package ch07.check;

public class Practice4Client {

	public static void main(String[] args) {
		var value = new int[] {10, 20, 30};
		var p = new Practice4();
		System.out.println(p.change(value)[0]); //100
		System.out.println(value[0]); //100
	}

}
