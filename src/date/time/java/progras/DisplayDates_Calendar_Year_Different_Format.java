package date.time.java.progras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DisplayDates_Calendar_Year_Different_Format {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date=ld.format(dtf);
		System.out.println(date);
		dtf=DateTimeFormatter.ofPattern("EEEE,dd/MM/yyyy");
		date=ld.format(dtf);
		System.out.println(date);
		dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		date=ld.format(dtf);
		System.out.println(date);


	}

}
