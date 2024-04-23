package ch06;

import java.util.ArrayList;
import java.util.Arrays;

public class SortList {

	public static void main(String[] args) {
		var data = new String[] {"장미", "해바라기", "튤립", "벚꽃"};
		Arrays.sort(data, (x, y) -> x.length() - y.length());
		System.out.println(Arrays.toString(data));
		// [장미, 튤립, 벚꽃, 해바라기]

		var list = new ArrayList<String>(Arrays.asList("장미", "해바라기", "튤립", "벚꽃"));
		list.sort((x, y) -> x.length() - y.length());
		System.out.println(list);
		// [장미, 튤립, 벚꽃, 해바라기]
		
	}

}
