package ch07.argument;

public class ParamPrimitiveBasic {

	public static void main(String[] args) {
		var num = 2;
		var p = new ParamPrimitive();
		System.out.println(p.update(num)); //20
		System.out.println(num); //2
	}

}
