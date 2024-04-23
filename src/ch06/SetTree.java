package ch06;

import java.util.Arrays;
import java.util.TreeSet;

public class SetTree {

	public static void main(String[] args) {
		var ts = new TreeSet<Integer>(Arrays.asList(1, 20, 30, 10, 60, 15));
		System.out.println(ts); // [1, 10, 15, 20, 30, 60]
		System.out.println(ts.descendingSet()); // [60, 30, 20, 15, 10, 1]
		System.out.println(ts.ceiling(15)); // 15
		System.out.println(ts.lower(15)); // 10
		System.out.println(ts.tailSet(15)); // [15, 20, 30, 60]
		System.out.println(ts.headSet(30, true)); // [1, 10, 15, 20, 30]
	}

}
