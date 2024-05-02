package ch07;

public class Pclass {
	public int data = 10;
	
	public void hoge(int data) {
		if (data < 0) {
			data = 0;
		}
		System.out.println(data);
	}

}
