package ch10;

import java.util.ArrayList;
import java.util.Arrays;

public class Check10_1_2 {

	public static void main(String[] args) {
		var list = new ArrayList<String>(Arrays.asList("다이아몬드", "토파즈", "아이올라이트", "아메트린"));
		list.removeIf(v -> v.length() < 5);
		System.out.println(list);
		// [다이아몬드, 아이올라이트]
	}

}
