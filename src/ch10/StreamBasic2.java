package ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StreamBasic2 {

	public static void main(String[] args) {
		//리스트
		var list = new ArrayList<String>(Arrays.asList("ant", "elephant", "hamster"));
		list.stream().forEach(System.out::println);
//		list.parallelStream().forEach(System.out::println);
		System.out.println();
		
		//배열
		var data = new String[] {"장미", "나팔꽃", "튤립"};
		Arrays.stream(data).forEach(System.out::println);
		System.out.println();
		
		//맵
		var map = new HashMap<String, String>(Map.of("orange", "오렌지", "apple", "사과", "strawberry", "딸기"));
		map.entrySet().stream().forEach(System.out::println);
	}

}
