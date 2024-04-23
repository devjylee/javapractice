package ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollUnmodifyRef {

	public static void main(String[] args) {
		var data = new ArrayList<StringBuilder> (Arrays.asList(new StringBuilder("일이삼"), new StringBuilder("사오육"), new StringBuilder("칠팔구")));
		var udata = Collections.unmodifiableList(data);
		udata.get(0).append("하나둘셋");
		System.out.println(udata);
		// [일이삼하나둘셋, 사오육, 칠팔구]
	}

}
