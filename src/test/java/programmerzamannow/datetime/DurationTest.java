package programmerzamannow.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class DurationTest {

	@Test
	public void create() {
		
		Duration duration = Duration.ofSeconds(10);
		Duration duration2 = Duration.ofMillis(10);
		Duration duration3 = Duration.ofHours(10);

	}
	
	@Test
	public void get() {
		
		Duration duration = Duration.ofHours(10);
		
		System.out.println(duration.toDays());
		System.out.println(duration.toMinutes());
		System.out.println(duration.toSeconds());
		System.out.println(duration.toNanos());
		
	}
	
	@Test
	public void calculate() {
		
		Duration duration = Duration.between(LocalTime.of(10, 10), LocalTime.of(20, 10));
		Duration duration2 = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(10));
		
		System.out.println(duration);
		System.out.println(duration2);
		
	}
	
}
