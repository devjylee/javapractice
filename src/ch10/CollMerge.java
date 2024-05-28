package ch10;

import java.util.HashMap;
import java.util.Map;

public class CollMerge {
	
	public static String concat(String v1, String v2) {
		if (v2 == "") {
			return null;
		}
		return v1 + "," + v2;
	}

	public static void main(String[] args) {
		var map = new HashMap<String, String>(Map.of("orange", "오렌지"));
		map.merge("melon", "멜론", CollMerge::concat);
		map.merge("orange", "귤", CollMerge::concat);
		System.out.println(map);
		map.merge("orange", "", CollMerge::concat);
		System.out.println(map);
		
	}

}
