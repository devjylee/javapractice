package ch07.optional;

import java.util.Map;

public class BookMap {
	
	// [ISBN코드 : 책 이름] 의 형식으로 서적정보를 관리
	private Map<String, String> data;
	
	// 인수 map으로 서적정보를 초기화
	public BookMap(Map<String, String> map) {
		this.data = map;
	}
	
	// ISBN 코드(인수 isbn)을 키로 책 이름을 취득
	public String getTitleByIsbn(String isbn) {
		return this.data.get(isbn);
	}
	
}
