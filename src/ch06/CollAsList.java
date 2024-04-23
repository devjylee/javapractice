package ch06;

import java.util.Arrays;

public class CollAsList {

	public static void main(String[] args) {
		var data = new String[] {"장미", "해바라기", "나팔꽃"};
		var list = Arrays.asList(data);
		
		list.set(0, "튤립");
		
		System.out.println(list); 
		// [튤립, 해바라기, 나팔꽃]
		System.out.println(Arrays.toString(data));
		// [튤립, 해바라기, 나팔꽃]
		
		//list.add("벚꽃"); //error
		//list.remove(0); //error
	}

}
