package ch05;

import java.text.DateFormat;
import java.util.Calendar;

public class CalUse {

	public static void main(String[] args) {
		// 날짜/시각 오브젝트 생성
		var cal1 = Calendar.getInstance();
		var cal2 = Calendar.getInstance();

		// 시각요소 설정
		cal1.set(2019, 0, 10, 10, 20, 30);
		cal2.set(2019, 0, 10, 10, 20, 30);

		// 시각 요소를 취득
		System.out.println(cal1.get(Calendar.YEAR)+"년"+(cal1.get(Calendar.MONTH)+1)+"월"+cal1.get(Calendar.DATE)+"일");
		// 2019년1월10일
		// 날짜를 가산
		cal1.add(Calendar.YEAR, 1);
		// 일시를 취득
		System.out.println(cal1.getTime());
		// Fri Jan 10 10:20:30 KST 2020

		// 날짜의 차분을 연산
		var diff = (int)((cal1.getTimeInMillis()-cal2.getTimeInMillis())/(1000*60*60*24));
		System.out.println(diff+"일차");
		// 364일차

		// 일시를 비교
		// System.out.println(cal1.equals(cal2));
		// System.out.println(cal1.before(cal2));
		// System.out.println(cal1.after(cal2));
		// Error

		// 일시를 성형
		var fdatetime = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		System.out.println(fdatetime.format(cal2.getTime()));
		// 2019년 1월 10일 목요일 오전 10시 20분 30초 대한민국 표준시

		// 문자열로부터 날짜/시각 값을 생성
		// System.out.println(DateFormat.getInstance().parse("2019/1/10 10:20:30"));
		// Error
	}

}
