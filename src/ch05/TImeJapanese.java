package ch05;

import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;

public class TImeJapanese {

	public static void main(String[] args) {
		var d = JapaneseDate.of(JapaneseEra.HEISEI, 30, 12, 31);
		System.out.println(d);

		var df = DateTimeFormatter.ofPattern("Gy년MM월dd일"); // Japanese Heisei 30-12-31
		System.out.println(d.format(df)); // 헤이세이30년12월31일
	}

}
