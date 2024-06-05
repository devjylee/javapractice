package ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//1
@FunctionalInterface
interface Hoge {
	void print (String str);
}

//2
@FunctionalInterface
interface Foo<T, R> {
	R process(T v1, T v2);
}

public class Check10_2_3 {

	public static void main(String[] args) {
		
		//3
		var list = new ArrayList<String>(
				Arrays.asList("ABCDE", "OP", "WXYZ", "HIJKL"));
		list.replaceAll(v -> {
			if(v.length() < 3) {
				return v;
			} else {
				return v.substring(0, 3);
			}
		});
		for(var value : list) System.out.println(value);
		
		//4
		Stream.of("슈크림", "푸딩", "마들렌", "바바로아")
		.sorted((str1, str2) -> str2.length() - str1.length())
		.forEach(System.out::println);
		
		//5
		var list2 = new int[] {60, 95, 75, 80, 70};
		System.out.println(IntStream.of(list2).max().orElse(0));;
		System.out.println(IntStream.of(list2).average().orElse(0));;
		
	}

}
