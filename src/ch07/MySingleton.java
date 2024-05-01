package ch07;

public class MySingleton {
	private static MySingleton instance = new MySingleton();
	
	private MySingleton() {}
	
	// 미리 준비해놓은 인스턴스를 취득 
	public static MySingleton getInstance() {
		return instance;
	}
}
