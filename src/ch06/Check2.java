package ch06;

import java.util.HashMap;

public class Check2 {

	public static void main(String[] args) {
		var map = new HashMap<String, String>() {
			{
				put("cucumber", "오이");
				put("lettuce", "양상추");
				put("spinach", "시금치");
			}
		};
		
		map.put("carrot", "당근");
		map.remove("spinach");
		map.replace("cucumber", "胡瓜");
		
		for(var entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}
}
