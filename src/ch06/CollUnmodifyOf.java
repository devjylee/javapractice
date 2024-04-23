package ch06;

import java.util.List;
import java.util.Map;

public class CollUnmodifyOf {

	public static void main(String[] args) {
		var data = List.of("장미", "해바라기", "나팔꽃");
		System.out.println(data);
		// [장미, 해바라기, 나팔꽃]
		
		var map = Map.of("Rose", "장미", "Sunflower", "해바라기", "Morning Glory", "나팔꽃");
		System.out.println(map);
		// {Sunflower=해바라기, Morning Glory=나팔꽃, Rose=장미}
	}

}
