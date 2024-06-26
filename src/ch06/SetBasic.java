package ch06;

import java.util.Arrays;
import java.util.HashSet;

public class SetBasic {

	public static void main(String[] args) {
		var hs = new HashSet<Integer>(Arrays.asList(1, 20, 30, 10, 30, 60, 15));
		var hs2 = new HashSet<Integer>(Arrays.asList(10, 20, 99));
		
		System.out.println(hs); // [1, 20, 10, 60, 30, 15]
		System.out.println(hs.size()); // 6
		System.out.println(hs.isEmpty()); // false
		System.out.println(hs.contains(1)); // true
		System.out.println(hs.containsAll(hs2)); // false
		System.out.println(hs.remove(1)); // true
		System.out.println(hs); // [20, 10, 60, 30, 15]
		
		hs.addAll(hs2);
		System.out.println(hs); // [99, 20, 10, 60, 30, 15] 합집합
		
		hs.retainAll(hs2);
		System.out.println(hs); // [99, 20, 10] 교집합
		
		var hs3 = new HashSet<Integer>(Arrays.asList(1, 10, 20));
		hs.removeAll(hs3);
		System.out.println(hs); // [99] 차집합
		

	}

}
