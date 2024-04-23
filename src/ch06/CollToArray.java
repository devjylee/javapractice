package ch06;

import java.util.ArrayList;
import java.util.Arrays;

public class CollToArray {

	public static void main(String[] args) {
		var data = new ArrayList<String> (Arrays.asList("장미", "해바라기", "나팔꽃"));
		
		//data 크기와 같은 배열을 만들어서 카피
		var strs = new String[data.size()];
		data.toArray(strs);
		
		data.set(0, "튤립");
		
		System.out.println(Arrays.toString(strs));
		// [장미, 해바라기, 나팔꽃]
		System.out.println(data);
		// [튤립, 해바라기, 나팔꽃]
		
	}

}
