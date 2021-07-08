package programmerzamannow.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

public class InstantTest {

	@Test
	public void create() {
		
		Instant instant = Instant.now();
		Instant instant2 = Instant.ofEpochMilli(System.currentTimeMillis());
		
		System.out.println(instant); //2021-07-08T07:01:35.625791040Z
		System.out.println(instant2); //2021-07-08T07:01:35.625Z
		
	}
	
	@Test
	public void change() {
		Instant instant = Instant.now();
		Instant instant2 = instant.plusMillis(1000);
		Instant instant3 = instant.plusSeconds(1000);
		Instant instant4 = instant.minusMillis(1000);
		Instant instant5 = instant.minusSeconds(1000);
	}
	
	@Test
	public void get() {
		
		Instant instant = Instant.now();
		
		System.out.println(instant.getEpochSecond());
		System.out.println(instant.getNano());
		
	}
	
	@Test
	public void conversion() {
		
		Instant instant = Instant.now();
		
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("Asia/Jakarta"));
		LocalTime localTime = LocalTime.ofInstant(instant, ZoneId.of("Asia/Jakarta"));
		LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.of("Asia/Jakarta"));
		
	}
	
	@Test
	public void conversion2() {
		
		Instant instant = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
		Instant instant2 = ZonedDateTime.now().toInstant();
		
		System.out.println(instant); //2021-07-08T07:29:28.072423709Z
		System.out.println(instant2); //2021-07-08T07:29:28.072892792Z
		
	}
	
}
