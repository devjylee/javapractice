package ch07;

public class Scope {
	public String data = "필드";
	
	public String show() {
		var data = "로컬";
		return this.data;
	}
}
