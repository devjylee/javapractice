package ch06;

import java.util.ArrayList;

public class CollForeach {

	public static void main(String[] args) {
		var data = new ArrayList<String>() {
			{
				add("장미");
				add("해바라기");
				add("나팔꽃");
			}
		};
		
		for (var s : data) {
			System.out.println(s);
		}
		
		var itr = data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
