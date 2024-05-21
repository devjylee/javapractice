package ch09.enumclass;

public class WeekdayClient {

	public static void main(String[] args) {
		for(var w : Weekday.values()) {
			System.out.println(w.ordinal() + " : " + w.toString());
		}
	}

}
