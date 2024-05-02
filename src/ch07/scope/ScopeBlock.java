package ch07.scope;

public class ScopeBlock {

	public static void main(String[] args) {
		{
			var data = "블록스코프";
		}
		
		var data = "로컬스코프";

		System.out.println(data); //로컬스코프
	}

}
