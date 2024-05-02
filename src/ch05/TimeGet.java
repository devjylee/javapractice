package ch05;

import java.time.LocalDateTime;

public class TimeGet {

	public static void main(String[] args) {
		var dt = LocalDateTime.of(2010, 1, 10, 10, 20, 30, 123);
		System.out.println(dt.getYear()+"년"+dt.getMonthValue()+"월"+dt.getDayOfMonth()+"일"+dt.getDayOfWeek()+" "+dt.getHour()+"시"+dt.getMinute()+"분"+dt.getSecond()+"초"+dt.getNano()+"나노초");
		// 2010년1월10일SUNDAY 10시20분30초123나노초
	}

}
