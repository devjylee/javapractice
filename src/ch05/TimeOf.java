package ch05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeOf {

	public static void main(String[] args) {
		// LocalDateTime의 생성
		var ldt1 = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 513);
		var ldt2 = LocalDateTime.of(2019, Month.JANUARY, 10, 10, 20, 30);
		//var ldt3 = LocalDateTime.of(2019, 1, 40, 10, 20, 30);

		System.out.println(ldt1); // 2019-01-10T10:20:30.000000513
		System.out.println(ldt2); // 2019-01-10T10:20:30
		//System.out.println(ldt3); // Error 인수에 정해진 시간범위를 넘어선 값을 지정

		//LocalDate/LocalTime의 생성
		var ld = LocalDate.of(2019, 1, 10); 
		System.out.println(ld); // 2019-01-10
		var lt = LocalTime.of(10, 20, 30);
		System.out.println(lt); // 10:20:30
		var ldt4 = LocalDateTime.of(ld, lt);
		System.out.println(ldt4); // 2019-01-10T10:20:30

		//OffsetDateTime의 생성
		var odt = OffsetDateTime.of(2019, 1, 10, 10, 20, 30, 999, ZoneOffset.ofHours(9));
		System.out.println(odt); // 2019-01-10T10:20:30.000000999+09:00

		//OffsetTime의 생성
		var ot = OffsetTime.of(10, 20, 30, 999, ZoneOffset.ofHours(9));
		System.out.println(ot); // 10:20:30.000000999+09:00

		//ZonedDatetime의 생성
		var zdt = ZonedDateTime.of(2019, 1, 10, 10, 20, 30, 999, ZoneId.of("Asia/Tokyo"));
		System.out.println(zdt); // 2019-01-10T10:20:30.000000999+09:00[Asia/Tokyo]
	}

}
