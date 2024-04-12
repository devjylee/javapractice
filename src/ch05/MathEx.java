package ch05;

public class MathEx {

	public static void main(String[] args) {
		System.out.println(Math.abs(-100)); // 100
		System.out.println(Math.max(6,3)); // 6
		System.out.println(Math.min(6,3)); // 3
		System.out.println(Math.ceil(1234.56)); // 1235.0
		System.out.println(Math.floor(1234.56)); // 1234.0
		System.out.println(Math.round(1234.56)); // 1235
		System.out.println(Math.sqrt(100000)); // 316.22776601683796
		System.out.println(Math.cbrt(100000)); // 46.415888336127786
		System.out.println(Math.pow(2,4)); // 16.0
		System.out.println(Math.sin(Math.toRadians(30))); // 0.49999999999999994
		System.out.println(Math.cos(Math.toRadians(60))); // 0.5000000000000001
		System.out.println(Math.tan(Math.toRadians(45))); // 0.9999999999999999
		System.out.println(Math.log(100)); // 4.605170185988092
		System.out.println(Math.log10(100)); // 2.0
	}

}
