package ch09.practice;

import java.util.ArrayList;
import java.util.List;

public class GenericPractice {
	
	public static <T> ArrayList<T> newArrayList(T... data) {
		return new ArrayList<T>(List.of(data));
	}
	
}
