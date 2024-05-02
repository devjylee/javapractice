package ch05;

public class StrIndex {

	public static void main(String[] args) {
		var str = "にわにはにわにわとりがいる";
		System.out.println(str.indexOf("にわ")); // 0
		System.out.println(str.indexOf("にも")); // -1
		System.out.println(str.lastIndexOf("にわ")); // 6
		System.out.println(str.indexOf("にわ",3)); // 4
		System.out.println(str.lastIndexOf("にわ",3)); // 0	
	}

}
