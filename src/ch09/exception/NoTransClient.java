package ch09.exception;

import java.io.IOException;

public class NoTransClient {
	
	public static void main(String[] args) {
		
		var nt = new NoTrans();
		try {
			nt.readHttpPages();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
