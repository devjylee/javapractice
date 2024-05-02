package ch05;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TimeFormatLocale {

	public static void main(String[] args) {
		var locale = Locale.KOREA;
		var zone = ZoneId.of("Asia/Seoul");
		var dt = ZonedDateTime.of(LocalDateTime.now(), zone);

		System.out.println(dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(locale)));
		// 2024년 4월 11일 목요일 오후 2시 20분 36초 대한민국 표준시
		System.out.println(dt.format(DateTimeFormatter.ofPattern("Y년L월d일 (E) a K시m분s초 (z)",locale)));
		// 2024년4월11일 (목) 오후 2시20분36초 (KST)
	}

}
