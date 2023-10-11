package date.time.java.progras;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ConvertLocalTimeToGMT {

	public static void main(String[] args) {
	LocalDateTime ldt=LocalDateTime.now();
	ldt.atZone(ZoneId.of("Asia/Jakarta"));
	System.out.println(ldt);
	
	ZonedDateTime currentDate = ZonedDateTime.now( ZoneOffset.UTC );
	System.out.println(currentDate);

	}

}
