package ch06;

import java.util.Map;
import java.util.TreeMap;

public class MapTree {

	public static void main(String[] args) {
		var data = new TreeMap<String, String>(Map.of("Rose", "장미", "Sunflower", "해바라기", "Morning Glory", "나팔꽃"));
		
		for (var key : data.keySet()) {
			System.out.println(key);
		} //Morning Glory Rose Sunflower
		
	}

}
