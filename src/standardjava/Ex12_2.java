package standardjava;

import java.util.HashMap;

public class Ex12_2 {

	public static void main(String[] args) {
		HashMap<String, Student1> map = new HashMap<>(); // JDK 1.7 부터 생성자에 타입지정 생략가능
		map.put("자바왕", new Student1("자바왕", 1, 1, 100, 100, 100));
		
		Student1 s = map.get("자바왕");
		System.out.println(map);
	}

}

class Student1 {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}
