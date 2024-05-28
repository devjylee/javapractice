package ch10;

import java.util.HashMap;
import java.util.Map;

public class CollReplaceMap {

	public static void main(String[] args) {
		var map = new HashMap<String, String>(Map.of("orange", "오렌지", "apple", "사과", "strawberry", "딸기"));
		map.replaceAll((k, v) -> k.charAt(0) + v);
		System.out.println(map);
	}

}
