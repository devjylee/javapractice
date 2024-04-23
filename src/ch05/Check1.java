package ch05;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Check1 {

	public static void main(String[] args) {
		// 1
		String str1 = "となりのきゃはよくきゃくくうきゃくだ";
		System.out.println(str1.indexOf("きゃく"));
		
		//2
		System.out.println(String.format("%s의 온도는 %.2f도","치바",17.256));
		
		//3
		String str2 = "그녀의 이름은 하나코이다.";
		System.out.println(str2.replace("그녀","아내"));
		
		//4
		var dt = LocalDateTime.now();
		System.out.println(dt.plus(Duration.parse("P5DT6H")));
		//P : period
		//5D : 5 days
		//T6H : 6 Hours
		
		//5
		var dt1 = LocalDate.of(2020, 3, 12);
		var dt2 = LocalDate.of(2020, 11, 5);
		var period = Period.between(dt1, dt2);
		System.out.println(period.getMonths()+"개월"+period.getDays()+"일 차");
	}

}
