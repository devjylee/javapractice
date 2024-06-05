package ch10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Check10_2_2 {

	public static void main(String[] args) {
		var data = List.of("라벤더", "민트", "로즈메리");
		var result = grep(data, v-> v.length() > 2);
		System.out.println(result);

	}
	
	public static <T> List<T> grep(List<T> list, Predicate<T> cond) {
		var result = new ArrayList<T>();
		for(var value : list) {
			if (cond.test(value)) {
				result.add(value);
			}
		}
		return result;
	}

}


