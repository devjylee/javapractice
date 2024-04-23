package ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollAddAll {

	public static void main(String[] args) {
		var data = new String[] {"장미", "해바라기", "나팔꽃"};
		var list = new ArrayList<String>();
		
		Collections.addAll(list, data);
		//list에 data에 들어있는 모든 요소 추가
		
		list.set(0, "튤립");
		list.add("벚꽃");
		list.remove(1);
		
		System.out.println(list);
		// [튤립, 나팔꽃, 벚꽃]
		System.out.println(Arrays.toString(data));
		// [장미, 해바라기, 나팔꽃]

	}

}
