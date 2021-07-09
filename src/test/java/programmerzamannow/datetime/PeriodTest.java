package programmerzamannow.datetime;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.Test;

public class PeriodTest {

	@Test
	public void create() {
		Period period = Period.ofDays(10);
		Period period2 = Period.ofWeeks(10);
		Period period3 = Period.ofMonths(10);
		Period period4 = Period.ofYears(10);
		Period period5 = Period.of(10, 10, 10);
	}
	
	@Test
	public void get() {
		
		Period period = Period.of(10, 10, 10);
		
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
	}
	
	@Test
	public void calculate() {
		
		Period period = Period.between(
				LocalDate.of(2020, 10, 10), 
				LocalDate.of(2020, 12, 12)
			);
		
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
	}
	
}
