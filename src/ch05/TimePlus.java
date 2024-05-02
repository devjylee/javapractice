package ch05;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimePlus {

	public static void main(String[] args) {
		var d = LocalDate.of(2019, 1, 10);
		System.out.println(d); // 2019-01-10
		System.out.println(d.plus(3, ChronoUnit.YEARS)); // 2022-01-10
		System.out.println(d.minus(21, ChronoUnit.DAYS)); // 2018-12-20
	}

}
