package programmerzamannow.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

import org.junit.jupiter.api.Test;

public class YearTest {

	@Test
	public void create() {
		
		Year year = Year.now();
		Year year1 = Year.of(2010);
		Year year2 = Year.parse("2010");
		
		YearMonth yearMonth = YearMonth.now();
		YearMonth yearMonth2 = YearMonth.of(2010, Month.FEBRUARY);
		YearMonth yearMonth3 = YearMonth.parse("2010-02");
		
		MonthDay monthDay = MonthDay.now();
		MonthDay monthDay2 = MonthDay.of(Month.FEBRUARY, 5);
		MonthDay monthDay3 = MonthDay.parse("--02-05");
		
	}
	
	@Test
	public void conversionYear() {
		
		Year year = Year.of(1980);
		YearMonth yearMonth = year.atMonth(Month.DECEMBER);
		LocalDate localDate = yearMonth.atDay(30);
		MonthDay monthDay = MonthDay.from(localDate);
		
	}
	
	@Test
	public void get() {
		Year year = Year.now();
		System.out.println(year.getValue());
		
		YearMonth yearMonth = YearMonth.now();
		System.out.println(yearMonth.getYear());
		System.out.println(yearMonth.getMonthValue());
	}
	
}
