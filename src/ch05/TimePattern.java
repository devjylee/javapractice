package ch05;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimePattern {

	public static void main(String[] args) {
		var dt1 = LocalDateTime.of(2019, 1, 10, 10, 20, 30);
		var dt2 = ZonedDateTime.of(2019, 1, 10, 10, 20, 30, 0, ZoneId.of("Asia/Tokyo"));

		System.out.println(dt1.format(DateTimeFormatter.ofPattern("y.MM.dd H:m:s")));
		// 2019.01.10 10:20:30
		System.out.println(dt2.format(DateTimeFormatter.ofPattern("Y년L월d일 (E) a K시m분s초 (z)")));
		// 2019년1월10일 (목) 오전 10시20분30초 (JST)
	}

}
