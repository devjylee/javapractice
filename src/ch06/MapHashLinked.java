package ch06;

import java.util.LinkedHashMap;

public class MapHashLinked {

	public static void main(String[] args) {
		var data = new LinkedHashMap<String, String>(10, 0.7f, true){
			{
				put("aaa", "아이우에오");
				put("bbb", "카키쿠케코");
				put("ccc", "사시스세소");
				put("ddd", "타치츠테토");
			}
		};
		
		System.out.println(data.get("ccc")); // 사시스세소
		System.out.println(data.get("aaa")); // 아이우에오
		System.out.println(data.get("bbb")); // 카키쿠케코
		System.out.println(data.get("ddd")); // 타치츠테토
		
		System.out.println(data);
		// {ccc=사시스세소, aaa=아이우에오, bbb=카키쿠케코, ddd=타치츠테토}
		
	}

}
