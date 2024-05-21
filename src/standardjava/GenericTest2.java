package standardjava;

import java.util.ArrayList;

//class Tv {}
//class Audio {}

public class GenericTest2 {
	
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		ArrayList<Tv> list = new ArrayList<Tv>(); // Tv 타입의 객체만 저장 가능
		list.add(new Tv());
//		list.add(new Audio());
		
//		Tv t = (Tv) list.get(0); // Object로 반환되기 때문에 형 변환 필요
		Tv t = list.get(0);
	}
	
}
