package ch06;

import java.util.ArrayDeque;

public class DequeArray {

	public static void main(String[] args) {
		// 스택(말미의 데이터 추가, 말미의 데이터 취득)
		var data = new ArrayDeque<Integer>();
		data.addLast(10);
		data.addLast(15);
		data.addLast(30);
		
		System.out.println(data); // [10, 15, 30]
		System.out.println(data.removeLast());// 30
		System.out.println(data); // [10, 15]
		
		// 큐(말미의 데이터 추가, 선두의 데이터 취득)
		var data2 = new ArrayDeque<Integer>();
		data2.addLast(10);
		data2.addLast(15);
		data2.addLast(30);
		
		System.out.println(data2); // [10, 15, 30]
		System.out.println(data2.removeFirst()); // 10
		System.out.println(data2); // [15, 30]
	}

}
