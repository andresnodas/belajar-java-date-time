package programmerzamannow.datetime;

import java.time.ZoneOffset;

import org.junit.jupiter.api.Test;

public class ZoneOffsetTest {

	@Test
	public void create() {
		
		ZoneOffset zoneOffset = ZoneOffset.of("+07:00");
		ZoneOffset zoneOffset2 = ZoneOffset.ofHours(-7);
		ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(5, 30);
		
		System.out.println(zoneOffset);
		System.out.println(zoneOffset2);
		System.out.println(zoneOffset3);
		
	}
	
}
