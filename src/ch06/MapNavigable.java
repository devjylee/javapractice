package ch06;

import java.util.TreeMap;

public class MapNavigable {

	public static void main(String[] args) {
		var data = new TreeMap<String, String>() {
			{
				put("peak", "高くなる");
				put("peach", "もも");
				put("peace", "1切れ");
				put("piece", "平和");
			}
		};
		
		var key = "pear";
		
		if (data.containsKey(key)) {
			System.out.println(key+"는 "+data.get(key)+"입니다.");
		} else {
			System.out.print("검색 중인 단어는 ");
			System.out.print(data.lowerKey(key)+" 혹은 ");
			System.out.print(data.higherKey(key));
			System.out.println(" 입니까?");
		}
		// 검색 중인 단어는 peak 혹은 piece 입니까?

	}

}
