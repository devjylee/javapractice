package ch05;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeParse {

	public static void main(String[] args) {
		System.out.println(LocalDate.parse("2019-01-10", DateTimeFormatter.ISO_DATE)); //2019-01-10
		System.out.println(LocalDate.parse("2019-123", DateTimeFormatter.ISO_ORDINAL_DATE)); //2019-05-03
		System.out.println(LocalDate.parse("2019-W40-5", DateTimeFormatter.ISO_WEEK_DATE)); //2019-10-04
		System.out.println(ZonedDateTime.parse("2019-01-10T10:20:30.000000999+09:00[Asia/Tokyo]", DateTimeFormatter.ISO_DATE_TIME)); //2019-01-10T10:20:30.000000999+09:00[Asia/Tokyo]
	}

}
