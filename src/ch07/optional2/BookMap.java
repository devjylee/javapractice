package ch07.optional2;

import java.util.Map;
import java.util.Optional;

public class BookMap {
	
	// [ISBN코드 : 책 이름] 의 형식으로 서적정보를 관리
	private Map<String, String> data;
	
	// 인수 map으로 서적정보를 초기화
	public BookMap(Map<String, String> map) {
		this.data = map;
	}
	
	public Optional<String> getTitleByIsbn(String isbn) {
		return Optional.ofNullable(this.data.get(isbn));
	}
}
