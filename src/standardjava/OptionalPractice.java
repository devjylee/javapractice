package standardjava;

import java.util.Optional;

public class OptionalPractice {

	public static void main(String[] args) {
//		int[] arr = null;
		int[] arr1 = {};
		int[] arr2 = new int[0];
		System.out.println("arr1.length = " + arr1.length);
		System.out.println("arr2.length = " + arr2.length);
		
//		Optional<String> opt = null;
		Optional<String> opt = Optional.empty();
//		Optional<String> opt = Optional.of("abc");
		System.out.println("opt = " + opt);
//		System.out.println("opt = " + opt.get());
		
		String str = "";
		
//		try {
//			str = opt.get();
//		} catch (Exception e) {
//			str = "EMPTY";
//		}
		
//		str = opt.orElse("EMPTY");
//		str = opt.orElseGet(()-> new String());
		str = opt.orElseGet(String::new);
		System.out.println("str = " + str);
	}

}
