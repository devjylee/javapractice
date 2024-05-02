package ch07.argument;

public class ParamRefBasic {

	public static void main(String[] args) {
		var data = new int[] {2, 4, 6};
		var p = new ParamRef();
		System.out.println(p.update(data)[0]); //5
		System.out.println(data[0]); //5
	}

}
