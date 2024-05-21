package standardjava;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add("30");
//		
//		Integer i = (Integer) list.get(2);
//		// 컴파일은 되지만 그러나 실행하면 에러
//		
//		System.out.println(list);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer i = list.get(2);
		
		System.out.println(list);
	}

}
