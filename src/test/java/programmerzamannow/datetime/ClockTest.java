package programmerzamannow.datetime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

public class ClockTest {

	@Test
	public void create() {
		
		Clock clockUTC = Clock.systemUTC();
		Clock clockSystem = Clock.systemDefaultZone();
		Clock clockJakarta = Clock.system(ZoneId.of("Asia/Jakarta"));
		
		System.out.println(clockUTC);
		System.out.println(clockSystem);
		System.out.println(clockJakarta); //SystemClock[Asia/Jakarta]
		
	}
	
	@Test
	public void instant() throws InterruptedException {
		
		Clock clockJakarta = Clock.system(ZoneId.of("Asia/Jakarta"));
		
		Instant instant = clockJakarta.instant();
		System.out.println(instant); //2021-07-09T03:56:15.187240125Z
		Thread.sleep(1_000);
		
		Instant instant2 = clockJakarta.instant();
		System.out.println(instant2); //2021-07-09T03:56:16.189541827Z
		
	}
	
	@Test
	public void dateTime() {
		
		Clock clockJakarta = Clock.system(ZoneId.of("Asia/Jakarta"));
		
		Year year = Year.now(clockJakarta);
		YearMonth yearMonth = YearMonth.now(clockJakarta);
		LocalTime localTime = LocalTime.now(clockJakarta);
		LocalDate localDate = LocalDate.now(clockJakarta);
		LocalDateTime localDateTime = LocalDateTime.now(clockJakarta);
		ZonedDateTime zonedDateTime = ZonedDateTime.now(clockJakarta);
		OffsetDateTime offsetDateTime = OffsetDateTime.now(clockJakarta);
		OffsetTime offsetTime = OffsetTime.now(clockJakarta);
		
	}
	
}
