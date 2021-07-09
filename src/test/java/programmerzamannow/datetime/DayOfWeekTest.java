package programmerzamannow.datetime;

import java.time.DayOfWeek;

import org.junit.jupiter.api.Test;

public class DayOfWeekTest {

	@Test
	public void create() {
		
		DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
		DayOfWeek dayOfWeek2 = dayOfWeek.plus(2);
		DayOfWeek dayOfWeek3 = dayOfWeek.minus(2);
		
		System.out.println(dayOfWeek);
		System.out.println(dayOfWeek2);
		System.out.println(dayOfWeek3);
		
	}
	
}
