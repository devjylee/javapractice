package ch06;

import java.util.ArrayList;

public class IteratorRemove {

	public static void main(String[] args) {
		var data = new ArrayList<String>() {
			{
				add("장미");
				add("해바라기");
				add("나팔꽃");
			}
		};
		
		var ite = data.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
			ite.remove();
		}
		
		System.out.println(data);
	}

}
