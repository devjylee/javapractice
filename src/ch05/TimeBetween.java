package ch05;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TimeBetween {

	public static void main(String[] args) {
		var dt1 = LocalDateTime.of(2018, 12, 31, 0, 0, 0);
		var dt2 = LocalDateTime.of(2020, 3, 3, 10, 20, 30);
		System.out.println(dt1); // 2018-12-31T00:00
		System.out.println(dt2); // 2020-03-03T10:20:30

		var period = Period.between(dt1.toLocalDate(), dt2.toLocalDate());
		System.out.println("날짜의 차: "+period.getYears()+"년"+period.getMonths()+"월"+period.getDays()+"일간");
		// 날짜의 차: 1년2월3일간

		var duration = Duration.between(dt1, dt2);
		System.out.println("시간의 차: "+duration.toHours()+"시간");
		// 시간의 차: 10282시간
	}

}
