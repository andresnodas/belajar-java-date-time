package programmerzamannow.datetime;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class LocalDateTest {

	@Test
	public void create() {
		
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(1980, Month.JUNE, 10);
		LocalDate localDate3 = LocalDate.parse("1980-06-10");
		
		System.out.println(localDate1);
		System.out.println(localDate2);
		System.out.println(localDate3);
	}
	
	@Test
	public void update() {
		
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = localDate1.withYear(2000);
		LocalDate localDate3 = localDate1.withMonth(1);
		
		System.out.println(localDate1);
		System.out.println(localDate2);
		System.out.println(localDate3);
	}
	
	@Test
	public void manipulate() {
		
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = localDate1.plusYears(10);
		LocalDate localDate3 = localDate1.minusDays(10);
		
		System.out.println(localDate1);
		System.out.println(localDate2);
		System.out.println(localDate3);
	}
	
	@Test
	public void get() {
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate.getYear());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getDayOfMonth());
	}
	
}
