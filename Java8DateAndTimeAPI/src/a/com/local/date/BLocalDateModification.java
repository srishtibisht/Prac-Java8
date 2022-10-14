package a.com.local.date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class BLocalDateModification {
	public static void main(String[] args) {
		BLocalDateModification main = new BLocalDateModification();

		System.out.println("---------------Modify Local Date (PLUS)---------------\n");
		main.modifyLocalDatePlus();

		System.out.println("\n---------------Modify Local Date (MINUS)---------------\n");
		main.modifyLocalDateMinus();

		System.out.println("\n---------------Additional functions to verify DATE---------------\n");
		main.verifyDates();
	}

	private void verifyDates() {
		LocalDate localDate1 = LocalDate.of(2022, 10, 11);
		LocalDate localDate2 = LocalDate.of(2022, 10, 12);

		System.out.println("Is " + LocalDate.ofYearDay(2021, 01).getYear() + " LEAP YEAR ? : "
				+ LocalDate.ofYearDay(2021, 01).isLeapYear());

		Boolean result1 = localDate2.isAfter(localDate1);
		System.out.println("Is 12th OCT is after 11th OCT : " + result1);

		Boolean result2 = localDate1.isEqual(LocalDate.now());
		System.out.println("Is 11th OCT is equal to current date : " + result2);

		Boolean result3 = localDate1.isBefore(localDate2);
		System.out.println("Is 11th OCT comes before 12th OCT : " + result3);

		Boolean result4 = localDate2.isSupported(ChronoField.DAY_OF_MONTH);
		System.out.println("Is local date supports months : " + result4);

		Boolean result5 = localDate2.isSupported(ChronoField.HOUR_OF_DAY);
		System.out.println("Is local date supports hours : " + result5);

		Boolean result6 = localDate1.isSupported(ChronoUnit.HOURS);
		System.out.println("Is local date supports ChronoUnit hours : " + result6);

		Boolean result7 = localDate1.isSupported(ChronoUnit.DAYS);
		System.out.println("Is local date supports ChronoUnit DAYS : " + result7);

	}

	private void modifyLocalDateMinus() {
		LocalDate localDate = LocalDate.now();

		System.out.println("DATE : " + localDate);

		System.out.println("Substract 5 DAYS : " + localDate.minusDays(5));

		System.out.println("Substract 4 WEEKS : " + localDate.minusWeeks(4));

		System.out.println("Substract 3 MONTHS : " + localDate.minusMonths(3));

		System.out.println("Substract 2 YEARS : " + localDate.minusYears(2));

		System.out.println("DAYS : " + localDate.minus(1, ChronoUnit.DAYS));

		System.out.println("WEEKS : " + localDate.minus(2, ChronoUnit.WEEKS));

		System.out.println("MONTHS : " + localDate.minus(2, ChronoUnit.MONTHS));

		System.out.println("YEARS : " + localDate.minus(1, ChronoUnit.YEARS));

	}

	private void modifyLocalDatePlus() {
		LocalDate localDate = LocalDate.of(2000, 10, 15);

		System.out.println("DATE : " + localDate);

		System.out.println("Add 5 DAYS : " + localDate.plusDays(5));

		System.out.println("Add 4 WEEKS : " + localDate.plusWeeks(4));

		System.out.println("Add 3 MONTHS : " + localDate.plusMonths(3));

		System.out.println("Add 2 YEARS : " + localDate.plusYears(2));

		System.out.println("DAYS : " + localDate.plus(1, ChronoUnit.DAYS));

		System.out.println("WEEKS : " + localDate.plus(2, ChronoUnit.WEEKS));

		System.out.println("MONTHS : " + localDate.plus(2, ChronoUnit.MONTHS));

		System.out.println("YEARS : " + localDate.plus(1, ChronoUnit.YEARS));

	}

}
