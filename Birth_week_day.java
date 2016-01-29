package birth_week_day;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Birth_week_day {

	public static void main(String[] args) {
		 Calendar c = new GregorianCalendar();
	        c.set(1982, Calendar.MARCH, 24);
	        System.out.println(c.get(Calendar.DAY_OF_WEEK));

	}

}
