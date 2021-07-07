package programmerzamannow.datetime;

import java.time.ZoneId;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ZoneIdTest {

	@Test
	public void create() {
		
		ZoneId zoneId = ZoneId.systemDefault();
		ZoneId zonIdGmt = ZoneId.of("GMT");
		
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		
		availableZoneIds.stream().forEach(System.out::println);
		
	}
	
}
