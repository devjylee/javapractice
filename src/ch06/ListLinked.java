package ch06;

import java.util.Arrays;
import java.util.LinkedList;

public class ListLinked {

	public static void main(String[] args) {
		var list = new LinkedList<String>(Arrays.asList("토끼", "용", "뱀"));
		System.out.println(list);
		// [토끼, 용, 뱀]
		
		list.addFirst("호랑이");
		list.addLast("말");
		System.out.println(list);
		// [호랑이, 토끼, 용, 뱀, 말]
		
		System.out.println(list.getFirst());
		// 호랑이
		System.out.println(list.getLast());
		// 말
		System.out.println(list.removeFirst());
		// 호랑이
		System.out.println(list.removeLast());
		// 말
		System.out.println(list);
		// [토끼, 용, 뱀]
	}

}
