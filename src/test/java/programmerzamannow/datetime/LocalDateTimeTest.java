package programmerzamannow.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class LocalDateTimeTest {

	@Test
	public void create() {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime localDateTime2 = LocalDateTime.of(2020, Month.DECEMBER, 10, 10, 10);
		LocalDateTime localDateTime3 = LocalDateTime.parse("2020-12-10T11:12:13.1444");
		
		System.out.println(localDateTime);
		System.out.println(localDateTime2);
		System.out.println(localDateTime3);
		
	}
	
	@Test
	public void update() {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime localDateTime2 = localDateTime.withYear(1990);
		LocalDateTime localDateTime3 = localDateTime.withMinute(40);
		
		System.out.println(localDateTime);
		System.out.println(localDateTime2);
		System.out.println(localDateTime3);
		
	}
	
	@Test
	public void manipulate() {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime localDateTime2 = localDateTime.plusYears(10);
		LocalDateTime localDateTime3 = localDateTime.minusMinutes(5);
		
		System.out.println(localDateTime);
		System.out.println(localDateTime2);
		System.out.println(localDateTime3);
		
	}
	
	@Test
	public void get() {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println(localDateTime.getYear());
		System.out.println(localDateTime.getMonthValue());
		System.out.println(localDateTime.getHour());
		System.out.println(localDateTime.getMinute());
		
	}
	
	@Test
	public void conversionDate() {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate localDate = localDateTime.toLocalDate();
		
		System.out.println(localDateTime);
		System.out.println(localDate);
		
		LocalDateTime localDateTime2 = localDate.atTime(10, 10);
		System.out.println(localDateTime2);
		
	}
	
	@Test
	public void conversionTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalTime localTime = localDateTime.toLocalTime();
		
		System.out.println(localDateTime);
		System.out.println(localTime);
		
		LocalDateTime localDateTime2 = localTime.atDate(LocalDate.of(2000, Month.JANUARY, 10));
		System.out.println(localDateTime2);
		
	}
	
}
