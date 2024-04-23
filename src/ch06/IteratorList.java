package ch06;

import java.util.ArrayList;

public class IteratorList {

	public static void main(String[] args) {
		var data = new ArrayList<String>() {
			{
				add("장미");
				add("해바라기");
				add("나팔꽃");
			}
		};
		
		var ite = data.listIterator(data.size());
		while(ite.hasPrevious()) {
			System.out.println(ite.previous());
		}
	}

}
