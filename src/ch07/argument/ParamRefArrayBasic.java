package ch07.argument;

public class ParamRefArrayBasic {
	
	public static void main(String[] args) {
		var data = new int[] {2, 4, 6};
		var p = new ParamRefArray();
		System.out.println(p.update(data)[0]); //10
		System.out.println(data[0]); //2
	}

}
