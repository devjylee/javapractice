package ch05;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TimePlus2 {

	public static void main(String[] args) {
		var d = LocalDateTime.of(2019, 1, 10, 10, 20, 30);
		var period = Period.ofYears(3);
		var duration = Duration.parse("P21DT1H1M1S");
		System.out.println(d); // 2019-01-10T10:20:30
		System.out.println(d.plus(period)); // 2022-01-10T10:20:30
		System.out.println(d.minus(duration)); // 2018-12-20T09:19:29
	}

}
