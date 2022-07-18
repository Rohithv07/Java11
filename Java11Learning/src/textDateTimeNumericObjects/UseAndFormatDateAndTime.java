package textDateTimeNumericObjects;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class UseAndFormatDateAndTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today); // current date
		System.out.println(today.plusYears(1).getDayOfWeek()); // current day after 1 years
		LocalTime teaTime = LocalTime.of(17, 30);
		System.out.println(teaTime); // 17.30
		Duration timeGap = Duration.between(LocalTime.now(), teaTime);
		System.out.println(timeGap); // says the duration from current time to time specified - PT-14M-3.319436S
		System.out.println(timeGap.toMinutes()); // returns total amount of minutes bw specific point.
		System.out.println(timeGap.toMinutesPart()); // returns remaning amount of minutes past the nearest hour.
		System.out.println(timeGap.toDays());
		LocalDateTime tomorrowTeaTime = LocalDateTime.of(today.plusDays(1), teaTime);
		System.out.println(tomorrowTeaTime); // tomorrows tea time

		// zones date and time

		ZoneId london = ZoneId.of("Europe/London");
		ZoneId katmandu = ZoneId.of("Asia/Katmandu");
		System.out.println(london);
		System.out.println(katmandu);
		ZonedDateTime londonTime = ZonedDateTime.of(tomorrowTeaTime, london);
		System.out.println(londonTime);
		ZonedDateTime katmanduTime = londonTime.withZoneSameInstant(katmandu);
		System.out.println(katmanduTime); // equivalent katmandu time for london time.
		System.out.println(katmanduTime.getOffset()); // 5 hours 45 min

		// formatting dates and times
		String datePattern = "EE', 'd' of 'MMMM yyyy' at 'HH:mm z";
		System.out.println(datePattern);
		Locale locale = Locale.UK;
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePattern);
		System.out.println(dateFormat);
		String timeText = dateFormat.format(katmanduTime);
		System.out.println(timeText); // formatted timezone of Katmandu

		// Localization
		ResourceBundle msg = ResourceBundle.getBundle("messages", locale); // messages must be inside src folder
		String offerPattern = msg.getString("offer");
		System.out.println(offerPattern);
		MessageFormat.format(offerPattern, 1); // now gives error but providing proper will give us the result
	}

}
