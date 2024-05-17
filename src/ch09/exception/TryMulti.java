package ch09.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TryMulti {

	public static void main(String[] args) {
		try {
		    URI uri = new URI("file:///C:/data/nothing.gif");
			var in = new FileInputStream("C:/data/nothing.gif");
		} catch (IOException | URISyntaxException e) {
			System.out.println("파일에 엑세스 할 수 없습니다.");
			e.printStackTrace();
		}
	}

}
