package date.time.java.progras;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DisplayCurrentDateTime {

	public static void main(String[] args) {
	LocalDateTime ldt=LocalDateTime.now();
	System.out.println("Local Date Time :"+ldt);
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mma dd/MM/yyyy");
	String localDateTimeString=ldt.format(dtf);
	System.out.println("Local Date Time After Formatting:"+localDateTimeString);
	dtf=DateTimeFormatter.ofPattern("hh:mma dd/MM/yyyy",Locale.CANADA);
	localDateTimeString=ldt.format(dtf);
	System.out.println("Canada :"+localDateTimeString);
	dtf=DateTimeFormatter.ofPattern("hh:mma dd/MM/yyyy",Locale.FRANCE);
	localDateTimeString=ldt.format(dtf);
	System.out.println("France :"+localDateTimeString);
	System.out.println("Time :"+ldt.toLocalTime());
	System.out.println("Date :"+ldt.toLocalDate());
	
	}

}
