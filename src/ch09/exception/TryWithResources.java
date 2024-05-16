package ch09.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		
		try(var in = new FileInputStream("C:/data/nothing.gif")) {
			var data = -1;
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
	}

}
