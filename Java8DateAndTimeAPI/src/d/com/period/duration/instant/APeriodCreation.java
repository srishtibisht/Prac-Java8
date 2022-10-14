package d.com.period.duration.instant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class APeriodCreation {

	public static void main(String[] args) {

		APeriodCreation main = new APeriodCreation();

		main.displayPeriod();

	}

	private void displayPeriod() {

		System.out.println("---------------------UNTIL-----------------------\n");

		LocalDate d1 = LocalDate.of(2012, 07, 01);
		LocalDate d2 = LocalDate.of(2013, 06, 30);

		Period p = d1.until(d2);

		System.out.println("Total YEARS : " + p.getYears());
		System.out.println("Total MONTHS : " + p.getMonths());
		System.out.println("Total DAYS : " + p.get(ChronoUnit.DAYS));
		System.out.println("Total UNITS : " + p.getUnits());

		System.out.println("\n---------------------OF---------------------------------\n");

		Period p1 = Period.of(2, 11, 300);
		System.out.println("Total Days : " + p1.getDays());

		System.out.println("\n-----------------------OFYEARS--------------------------------\n");

		Period p2 = Period.ofYears(20);
		System.out.println("Get Years : " + p2.getYears() + " Get Months : " + p2.getMonths());

		System.out.println("\n------------------BETWEEN---------------------------------\n");

		LocalDateTime l1 = LocalDateTime.of(2018, 02, 12, 4, 25);
		LocalDateTime l2 = LocalDateTime.now();

		Period period = Period.between(l1.toLocalDate(), l2.toLocalDate());

		System.out.println("PERIOD : " + period);
		System.out.println("Total YEARS : " + period.getYears());
		System.out.println("Total MONTHS : " + period.get(ChronoUnit.MONTHS));
		System.out.println("Total DAYS : " + period.get(ChronoUnit.DAYS));

	}

}
