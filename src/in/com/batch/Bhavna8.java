package in.com.batch;

import java.util.Calendar;
import java.util.Date;

public class Bhavna8 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,6);
		Date date=cal.getTime();
		System.out.println(date);
	}

}
