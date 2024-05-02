package ch07.optional;

import java.util.Map;

public class NullCheckBasic {

	public static void main(String[] args) {
		var b = new BookMap(Map.of(
				"978-4-7981-5757-3", "JavaScript 레시피",
				"978-4-7981-5202-8", "Android 어플리 개발 교과서",
				"978-4-7981-5382-7", "독습 C# 신판"));
		
		var title = b.getTitleByIsbn("978-4-7981-5757-3");
		if (title == null) {
			System.out.println("서적이 존재하지 않습니다.");
		} else {
			System.out.println(title.trim());
		} //JavaScript 레시피
	}

}
