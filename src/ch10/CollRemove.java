package ch10;

import java.util.ArrayList;
import java.util.Arrays;

public class CollRemove {

	public static void main(String[] args) {
		var list = new ArrayList<String>(Arrays.asList("장미", "튤립", "나팔꽃", "히아신스"));
		list.removeIf(v -> v.length()>2);
		System.out.println(list);
	}

}
