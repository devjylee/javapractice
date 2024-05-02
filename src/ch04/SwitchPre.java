package ch04;

public class SwitchPre {

	public static void main(String[] args) {
		var rank="A";
		if(rank.equals("A")) {
			System.out.println("Very good");
		} else if(rank.equals("B")) {
			System.out.println("Good");
		} else if(rank.equals("C")) {
			System.out.println("Not bad");
		} else {
			System.out.println("???");
		}
	}

}
