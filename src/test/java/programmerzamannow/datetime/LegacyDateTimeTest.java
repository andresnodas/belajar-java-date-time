package programmerzamannow.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

public class LegacyDateTimeTest {

	@Test
	public void conversion() {
		
		Date date = new Date();
		Instant instantDate = date.toInstant();
		
		Calendar calendar = Calendar.getInstance();
		Instant instant = calendar.toInstant();
		
		TimeZone timeZone = TimeZone.getDefault();
		ZoneId zoneId = timeZone.toZoneId();
		
	}
	
	@Test
	public void conversionToLegacy() {
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		Date date = Date.from(zonedDateTime.toInstant());
		
		Calendar calendar = GregorianCalendar.from(zonedDateTime);
		
		ZoneId zoneId = ZoneId.systemDefault();
		TimeZone timeZone = TimeZone.getTimeZone(zoneId);
	}
	
}
