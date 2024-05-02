package ch05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class TimeNow {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now()); //2024-04-11T12:42:34.632661600
		System.out.println(OffsetDateTime.now()); //2024-04-11T12:42:34.633658700+09:00
		System.out.println(ZonedDateTime.now()); //2024-04-11T12:42:34.635661200+09:00[Asia/Seoul]

		System.out.println(LocalDate.now()); //2024-04-11
		System.out.println(LocalTime.now()); //12:42:34.635661200
	}

}
