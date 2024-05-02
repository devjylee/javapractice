package ch05;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class TimeFromCalendar {

	public static void main(String[] args) {
		var cal = Calendar.getInstance();
		var dt1 = LocalDateTime.ofInstant(cal.toInstant(), ZoneId.systemDefault());
		var dt2 = OffsetDateTime.ofInstant(cal.toInstant(), ZoneId.systemDefault());
		var dt3 = ZonedDateTime.ofInstant(cal.toInstant(), ZoneId.systemDefault());

		System.out.println(dt1); // 2024-04-11T15:39:15.198
		System.out.println(dt2); // 2024-04-11T15:39:15.198+09:00
		System.out.println(dt3); // 2024-04-11T15:39:15.198+09:00[Asia/Seoul]
	}

}
