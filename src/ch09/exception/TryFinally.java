package ch09.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryFinally {

	public static void main(String[] args) {
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("C:/data/nothing.gif");
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in!=null) {
					in.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
