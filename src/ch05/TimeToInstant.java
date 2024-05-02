package ch05;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class TimeToInstant {

	public static void main(String[] args) {
		var dt = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 123456789);
		var d = Date.from(dt.toInstant(ZoneOffset.of("+09:00")));
		var cal = Calendar.getInstance();
		cal.setTime(d);
		System.out.println(cal);
		//java.util.GregorianCalendar[time=1547083230123,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=10,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=20,SECOND=30,MILLISECOND=123,ZONE_OFFSET=32400000,DST_OFFSET=0]
	}

}
