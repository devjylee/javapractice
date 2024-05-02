package ch07.optional2;

import java.util.Map;

public class OptionalNullCheck {

	public static void main(String[] args) {
        var b = new BookMap(Map.of(
        "978-4-7981-5757-3", "JavaScript 레시피",
        "978-4-7981-5202-8", "Android 어플리 개발 교과서",
        "978-4-7981-5382-7", "독습 C# 신판"));
		
		var optTitle = b.getTitleByIsbn("978-4-7981-5757-3");
		var title = optTitle.orElse("x");
		System.out.println(title.trim());
	}

}
