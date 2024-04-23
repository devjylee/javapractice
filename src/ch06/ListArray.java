package ch06;

import java.util.ArrayList;
import java.util.Arrays;

public class ListArray {

	public static void main(String[] args) {
		var list =  new ArrayList<Integer>(Arrays.asList(10, 15, 30, 60));
		var list2 =  new ArrayList<Integer>(Arrays.asList(1, 5, 3, 6));
		var list3 =  new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		
		for (var i : list) {
			System.out.println(i/5);
		}
		// 2 3 6 12
		
		System.out.println(list.size()); // 4
		System.out.println(list.get(0)); // 10
		System.out.println(list.contains(30)); // true
		System.out.println(list.indexOf(30)); // 2
		System.out.println(list.lastIndexOf(30)); // 2
		System.out.println(list.isEmpty()); //false
		System.out.println(list.remove(0)); // 10
		System.out.println(list); // [15, 30, 60]
		
		list.addAll(list2);
		System.out.println(list);
		// [15, 30, 60, 1, 5, 3, 6]
		
		list.removeAll(list3);
		System.out.println(list);
		// [15, 30, 60, 5, 6]
		
		list.set(0, 100);
		var data = list.toArray();
		System.out.println(Arrays.toString(data));
		// [100, 30, 60, 5, 6]
	}

}
