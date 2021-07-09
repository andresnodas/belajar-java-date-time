package programmerzamannow.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TemporalTest {

	@Test
	public void create() {
		
		Temporal temporal = LocalTime.now();
		Temporal temporal2 = LocalDate.now();
		Temporal temporal3 = LocalDateTime.now();
		Temporal temporal4 = ZonedDateTime.now();
		Temporal temporal5 = Year.now();
		Temporal temporal6 = YearMonth.now();
		Temporal temporal7 = Instant.now();
		
	}
	
	@Test
	public void temporalAmount() {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime localDateTime2 = localDateTime.plus(Duration.ofHours(10));
		LocalDateTime localDateTime3 = localDateTime.minus(Period.of(0, 10, 10));
	
		System.out.println(localDateTime);
		System.out.println(localDateTime2);
		System.out.println(localDateTime3);
		
	}
	
	@Test
	public void temporalUnit() {
		long between1 = ChronoUnit.SECONDS.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
		long between2 = ChronoUnit.MINUTES.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
		long between3 = ChronoUnit.DAYS.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
	}
	
	@Test
	public void temporalField() {
		
		Temporal temporal = LocalDateTime.now();
		
		System.out.println(temporal.get(ChronoField.YEAR));
		System.out.println(temporal.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(temporal.get(ChronoField.DAY_OF_MONTH));
		
	}
	
	@Test
	public void temporalQuery() {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		List<Integer> integers = localDateTime.query(temporal -> {
			List<Integer> list = new ArrayList<>();
			
			list.add(temporal.get(ChronoField.YEAR));
			list.add(temporal.get(ChronoField.MONTH_OF_YEAR));
			list.add(temporal.get(ChronoField.DAY_OF_MONTH));
			
			return list;
		});
		
		System.out.println(integers);
	}
	
	@Test
	public void temporalAdjusters() {
		
		LocalDate localDate = LocalDate.now();
		
		LocalDate localDate2 = localDate.with(TemporalAdjusters.firstDayOfMonth());
		//mengubah tanggal menjadi hari pertama di bulan tersebut
		LocalDate localDate3 = localDate.with(TemporalAdjusters.lastDayOfMonth());
		LocalDate localDate4 = localDate.with(TemporalAdjusters.firstDayOfYear());
		//mengubah tanggal menjadi hari pertama di tahun tersebut
		LocalDate localDate5 = localDate.with(TemporalAdjusters.lastDayOfYear());
		
	}
	
}
