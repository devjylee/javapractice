package ch06;

import java.util.ArrayList;

public class CollInitial {

	public static void main(String[] args) {
		var data = new ArrayList<String>() {
			{
				add("장미");
				add("해바라기");
				add("나팔꽃");
			}
		};
	}

}
