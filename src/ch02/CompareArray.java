package ch02;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		var data1 = new String[]{"a", "b", "c"};
		var data2 = new String[]{"a", "b", "c"};
		System.out.println(data1 == data2); // false
		System.out.println(data1.equals(data2)); // true
		System.out.println(Arrays.equals(data1, data2)); // true
	}

}
