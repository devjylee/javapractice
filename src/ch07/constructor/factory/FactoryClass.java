package ch07.constructor.factory;

public class FactoryClass {
	// private constructor
	private FactoryClass() {
		
	}
	
	//factory method
	public static FactoryClass getInstance() {
		return new FactoryClass();
	}
}
