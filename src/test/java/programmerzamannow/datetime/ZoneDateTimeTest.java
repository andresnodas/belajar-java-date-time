package programmerzamannow.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

public class ZoneDateTimeTest {

	@Test
	public void create() {
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("GMT"));
		ZonedDateTime zonedDateTime3 = ZonedDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));
		
//		System.out.println(zonedDateTime); //2021-07-08T11:45:15.859358123+07:00[Asia/Jakarta]
//		System.out.println(zonedDateTime2); //2021-07-08T04:45:15.859452417Z[GMT]
//		System.out.println(zonedDateTime3); //2021-07-08T11:45:15.859495833+07:00
	}
	
	@Test
	public void parsing() {
		ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2020-10-09T08:07:06+05:00[Asia/Jakarta]");
		ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2020-10-09T08:07:06+07:00");
		
//		System.out.println(zonedDateTime1); //2020-10-09T10:07:06+07:00[Asia/Jakarta]
//		System.out.println(zonedDateTime2);
	}
	
	@Test
	public void modifyTimeZone() {
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		ZonedDateTime zonedDateTime2 = zonedDateTime.withZoneSameLocal(ZoneId.of("GMT"));
		ZonedDateTime zonedDateTime3 = zonedDateTime.withZoneSameInstant(ZoneId.of("GMT"));
		
		System.out.println(zonedDateTime); //2021-07-08T12:01:54.439044449+07:00[Asia/Jakarta]
		System.out.println(zonedDateTime2); //2021-07-08T12:01:54.439044449Z[GMT]
		System.out.println(zonedDateTime3); //2021-07-08T05:01:54.439044449Z[GMT]
		
	}
	
}
