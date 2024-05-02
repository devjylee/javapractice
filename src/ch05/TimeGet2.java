package ch05;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class TimeGet2 {

	public static void main(String[] args) {
		var dt = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 123);
		var week = new String[] {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		System.out.println(dt.get(ChronoField.YEAR)+"년"+dt.get(ChronoField.MONTH_OF_YEAR)+"월"+dt.get(ChronoField.DAY_OF_MONTH)+"월"+week[dt.get(ChronoField.DAY_OF_WEEK)-1]+" "+dt.get(ChronoField.HOUR_OF_DAY)+"시"+dt.get(ChronoField.MINUTE_OF_HOUR)+"분"+dt.get(ChronoField.SECOND_OF_MINUTE)+"초"+dt.get(ChronoField.NANO_OF_SECOND)+"나노초");
		// 2019년1월10월수요일 10시20분30초123나노초
	}

}
