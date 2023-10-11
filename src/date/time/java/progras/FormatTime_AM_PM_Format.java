package date.time.java.progras;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatTime_AM_PM_Format {

	public static void main(String[] args) {
		//Approach 1 Using java.util.Date and SimpleDateFormat
		Date d=new Date();
		SimpleDateFormat format=new SimpleDateFormat("hh:mm a");
		String t=format.format(d);
		System.out.println(t);
		//Approach 2 Using java.time.LocalTime and DateTimeFormater
		LocalTime lt=LocalTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
		String time=lt.format(dtf);
		System.out.println(time);
	}
}
