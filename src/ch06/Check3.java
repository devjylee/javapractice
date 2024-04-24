package ch06;

import java.util.ArrayList;
import java.util.Arrays;

public class Check3 {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		
		list.add(100);
		list.set(2, 30);
		list.remove(3);

		for (var i : list) {
			System.out.println(i);
		}
		// 1, 2, 30, 100
		
	}

}
