package features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

public class DateTimeAPITest {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);  // Wed Jun 19 10:46:13 IST 2024
		
		LocalDate ldt= LocalDate.now();
		System.out.println(ldt);  // 2024-06-19
		
		LocalTime ltm=LocalTime.now();
		System.out.println(ltm);  // 10:46:14.492690300
		
		LocalDateTime ldtm=LocalDateTime.now();
		System.out.println(ldtm);  // 2024-06-19T10:46:14.493696200
		
		LocalDate leap = LocalDate.of(2021, Month.FEBRUARY, 28);
		System.out.println(leap);  // 2021-02-28
		
		Set<String> set=ZoneId.getAvailableZoneIds();
		
//		for(String s:set) {                  // multiple list data execute using for each
//			System.out.println(s);
//		}
		
		set.stream().forEach(System.out::println);   // this also foreach
		
		LocalTime ist=LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(ist);
	}
}
