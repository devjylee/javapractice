package ch04;

public class BreakNest2 {

	public static void main(String[] args) {
		limit:
		for(var i=1; i<10; i++) {
			for(var j=1; j<10; j++) {
				var result = i * j;
				if(result > 50) {
					break limit;
				}
				System.out.printf(" %2d", result);
			}
			System.out.println();
		}

//		1 2 3 4 5 6 7 8 9
//		2 4 6 8 10 12 14 16 18
//		3 6 9 12 15 18 21 24 27
//		4 8 12 16 20 24 28 32 36
//		5 10 15 20 25 30 35 40 45
//		6 12 18 24 30 36 42 48
	}

}
