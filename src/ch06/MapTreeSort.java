package ch06;

import java.util.TreeMap;

public class MapTreeSort {

	public static void main(String[] args) {
		var data = new TreeMap<String, String>(
					(x, y) -> x.length() - y.length()
				);
		
		data.put("Rose", "장미");
		data.put("Sunflower", "해바라기");
		data.put("Morning Glory", "나팔꽃");
		
		System.out.println(data);
		// {Rose=장미, Sunflower=해바라기, Morning Glory=나팔꽃}

	}

}
