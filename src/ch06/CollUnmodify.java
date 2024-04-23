package ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollUnmodify {

	public static void main(String[] args) {
		var data = new ArrayList<String> (Arrays.asList("장미", "해바라기", "나팔꽃"));
		var udata = Collections.unmodifiableList(data);
		//udata.set(0, "튤립"); //error
		//udata.add("벚꽃"); //error
	}

}
