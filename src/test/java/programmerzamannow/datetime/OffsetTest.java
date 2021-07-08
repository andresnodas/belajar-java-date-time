package programmerzamannow.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

import org.junit.jupiter.api.Test;

public class OffsetTest {

	@Test
	public void create() {
		
		OffsetTime offsetTime = OffsetTime.now();
		OffsetTime offsetTime2 = OffsetTime.of(LocalTime.now(), ZoneOffset.ofHours(7));
		
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		OffsetDateTime offsetDateTime2 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));
		
	}
	
	@Test
	public void convert() {
		LocalTime localTime = LocalTime.now();
		OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(7));
		LocalTime localTime2 = offsetTime.toLocalTime();
		
		LocalDateTime localDateTime = LocalDateTime.now();
		OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
		LocalDateTime localDateTime2 = offsetDateTime.toLocalDateTime();
		LocalDate localDate = offsetDateTime.toLocalDate();
		LocalTime localTime3 = offsetDateTime.toLocalTime();
	}
	
}
