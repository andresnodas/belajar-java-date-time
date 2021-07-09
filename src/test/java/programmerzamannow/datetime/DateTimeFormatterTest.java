package programmerzamannow.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class DateTimeFormatterTest {

	@Test
	public void parsing() {
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		
		LocalDate localDate = LocalDate.parse("2020 10 12", dateTimeFormatter);
		
		System.out.println(localDate);
		
	}
	
	@Test
	public void formatting() {
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate.format(dateTimeFormatter));
		
	}
	
	@Test
	public void defaultFormatter() {
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate.format(dateTimeFormatter));
	}
	
	@Test
	public void internationalization() {
		
		Locale locale = new Locale("in", "ID");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MMMM dd EEEE", locale);
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate.format(dateTimeFormatter));
	}
	
}
