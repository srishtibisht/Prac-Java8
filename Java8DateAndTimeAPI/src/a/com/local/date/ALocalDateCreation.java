package a.com.local.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class ALocalDateCreation {

	public static void main(String[] args) {

		ALocalDateCreation main = new ALocalDateCreation();

		System.out.println("---------------DISPLAY DATE---------------\n");
		main.displayDate();

		System.out.println("\n---------------DISPLAY DATE USING YEAR---------------\n");
		main.displayDateUisngYear();

		System.out.println("\n---------------DISPLAY SPECIFIC MONTH  OR DAY OF THE DATE---------------\n");
		main.displaySpecificDay();

	}

	private void displaySpecificDay() {

		LocalDate date = LocalDate.of(2022, 02, 01);

		System.out.println("Year : " + date.getYear());
		System.out.println("Day of the YEAR : " + date.getDayOfYear());
		System.out.println("Day of the MONTH : " + date.getDayOfMonth());
		System.out.println("Day of the WEEK : " + date.getDayOfWeek());
		System.out.println("Month : " + date.getMonthValue());
		System.out.println("Length of the MONTH : " + date.lengthOfMonth());
		System.out.println("Length of the YEAR : " + date.lengthOfYear());
		System.out.println("Day of the MONTH using get method : " + date.get(ChronoField.DAY_OF_MONTH));

	}

	private void displayDateUisngYear() {
		LocalDate date1 = LocalDate.ofYearDay(LocalDate.now().getYear(), 121);
		System.out.println("121 th date of this year : " + date1);

		LocalDate date2 = LocalDate.ofYearDay(LocalDate.now().getYear(), 365);
		System.out.println("Last date of this year : " + date2);

	}

	private void displayDate() {
		LocalDate localDate1 = LocalDate.now();
		System.out.println("Local Date 1 : " + localDate1);

		LocalDate localDate2 = LocalDate.of(1996, 10, 29);
		System.out.println("Local Date 2 : " + localDate2);

		LocalDate localDate3 = LocalDate.of(1996, Month.OCTOBER, 29);
		System.out.println("Local Date 3 : " + localDate3);

	}

}
