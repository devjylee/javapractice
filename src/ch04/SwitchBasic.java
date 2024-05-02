package ch04;

public class SwitchBasic {

	public static void main(String[] args) {
		var rank="A";
		switch(rank) {
			case "A":
				System.out.println("Very good");
				break;
			case "B":
				System.out.println("Good");
				break;
			case "C":
				System.out.println("Not bad");
				break;
			default:
				System.out.println("???");
				break;
		}
	}

}
