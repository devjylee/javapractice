package ch06;

import java.util.HashMap;
import java.util.Map;

public class MapHash {

	public static void main(String[] args) {
		var map = new HashMap<String, String>(Map.of("Rose", "장미", "Sunflower", "해바라기", "Morning Glory", "나팔꽃"));
		
		System.out.println(map.containsKey("Rose")); // true
		System.out.println(map.containsValue("장미")); // true
		System.out.println(map.isEmpty()); // false
		
		for (var key : map.keySet()) {
			System.out.println(key);
		} //Rose Sunflower Morning Glory

		
		for (var value : map.values()) {
			System.out.println(value);
		} //장미 해바라기 나팔꽃
		
		map.replace("Rose", "バラ");
		map.replace("Sunflower", "해바라기", "ひまわり");
		
		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		} //Rose:バラ Sunflower:ひまわり Morning Glory:나팔꽃
		
	}

}
