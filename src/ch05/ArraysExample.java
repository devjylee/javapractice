package ch05;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArraysExample {

	public static void main(String[] args) {
		var array1 = new String[] {"dog", "cat", "mouse", "fox", "lion"};
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.binarySearch(array1, "mouse"));
		
		var array2 = new String[] {"아", "이", "우", "에", "오"};
		var array3 = Arrays.copyOf(array2, 2);
		System.out.println(Arrays.toString(array3));
		
		var array4 = Arrays.copyOfRange(array2, 1, 17);
		System.out.println(Arrays.toString(array4));
		
		Arrays.fill(array4, 4, 6, "-");
		System.out.println(Arrays.toString(array4));
	}

}
