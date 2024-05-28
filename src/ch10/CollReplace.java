package ch10;

import java.util.ArrayList;
import java.util.Arrays;

public class CollReplace {

	public static void main(String[] args) {
		var list = new ArrayList<String>(Arrays.asList("장미", "튤립", "나팔꽃"));
		list.replaceAll(v -> {
			if (v.length() < 3) {
				return v;
			} else {
				return v.substring(0, 2);
			}
		});
		System.out.println(list);
	}

}
