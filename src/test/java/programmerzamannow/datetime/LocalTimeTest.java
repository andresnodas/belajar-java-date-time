package programmerzamannow.datetime;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class LocalTimeTest {

	@Test
	public void test() {
		
		LocalTime localTime1 = LocalTime.now();
		LocalTime localTime2 = LocalTime.of(10, 10, 10);
		LocalTime localTime3 = LocalTime.parse("10:10");
		
		System.out.println(localTime1);
		System.out.println(localTime2);
		System.out.println(localTime3);
	}
	
	@Test
	public void update() {
		
		LocalTime localTime1 = LocalTime.now();
		LocalTime localTime2 = localTime1.withHour(10);
		LocalTime localTime3 = localTime1.withHour(10).withMinute(10);
		
		System.out.println(localTime1);
		System.out.println(localTime2);
		System.out.println(localTime3);
		
	}
	
	@Test
	public void manipulate() {
		
		LocalTime localTime1 = LocalTime.now();
		LocalTime localTime2 = localTime1.plusHours(10);
		LocalTime localTime3 = localTime1.minusHours(5).plusMinutes(10);
		
		System.out.println(localTime1);
		System.out.println(localTime2);
		System.out.println(localTime3);
		
	}
	
	@Test
	public void get() {
		LocalTime localTime = LocalTime.now();
		
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
		System.out.println(localTime.getNano());
	}
	
}
