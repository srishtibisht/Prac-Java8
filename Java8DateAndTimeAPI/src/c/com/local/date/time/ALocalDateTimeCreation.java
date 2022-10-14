package c.com.local.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ALocalDateTimeCreation {

	public static void main(String[] args) {

		ALocalDateTimeCreation main = new ALocalDateTimeCreation();

		System.out.println("---------------DISPLAY DATE TIME---------------\n");
		main.displayDateTime();

		System.out.println("\n---------------GET SPECIFIC DATE AND TIME---------------\n");
		main.getSpecificDateAndTime();

		System.out.println("---------------Modify Local DATE AND TIME---------------\n");
		main.modifyLocalDateAndTime();

	}

	private void modifyLocalDateAndTime() {

		LocalDateTime l1 = LocalDateTime.now();

		System.out.println("Local Date time : " + l1);

		System.out.println("Plus hours : " + l1.plus(2, ChronoUnit.HOURS));
		System.out.println("Minus days : " + l1.minusDays(12));
		System.out.println("Modify time : " + l1.withMinute(12));

	}

	private void getSpecificDateAndTime() {
		LocalDateTime l1 = LocalDateTime.now();

		System.out.println("Get day of month : " + l1.getDayOfMonth());
		System.out.println("Get day of the year : " + l1.get(ChronoField.YEAR));

	}

	private void displayDateTime() {
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println("Local Date time : " + l1);

		LocalDateTime l2 = LocalDateTime.of(LocalDate.now(), LocalTime.NOON);
		System.out.println("Local Date time : " + l2);

		LocalDateTime l3 = LocalDateTime.of(2012, 07, 05, 04, 32);
		System.out.println("Local Date time : " + l3);
	}

}
