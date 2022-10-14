package a.com.local.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CLocalDateException {

	public static void main(String[] args) {

		String exception = "java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Hours";

		System.out.println(
				"As we know local date does not consist of time so if we will try to plus/minus time from local date \nit will give "
						+ exception.toUpperCase() + " exception ");

		LocalDate localDate = LocalDate.of(2002, 06, 01);
		System.out.println(localDate.plus(2, ChronoUnit.HOURS));

	}

}
