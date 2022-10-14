package a.com.local.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DConvertUtilSqlDateToLocalDate {

	public static void main(String[] args) {

		DConvertUtilSqlDateToLocalDate main = new DConvertUtilSqlDateToLocalDate();

		main.converUtilToLocalDate();
		main.converLocalDateToUtil();

		main.convertSqlToLocalDate();
		main.convertLocalToSqlDate();
	}

	private void convertLocalToSqlDate() {
		System.out.println("\n-----------Convert Local Date to SQL Date-------------\n");

		LocalDate localDate = LocalDate.of(2012, 10, 29);
		java.sql.Date date = java.sql.Date.valueOf(localDate);
		System.out.println("SQL Date : " + date);

	}

	private void convertSqlToLocalDate() {
		System.out.println("\n-----------Convert SQL Date to Local Date-------------\n");

		java.sql.Date date = new java.sql.Date(12, 10, 29);
		LocalDate localDate = date.toLocalDate();
		System.out.println("Local Date : " + localDate);

	}

	private void converLocalDateToUtil() {
		System.out.println("\n----------Convert Local Date to UTIL Date-----------\n");

		LocalDate localDate = LocalDate.of(2012, 12, 26);

		Date date = new Date().from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());

		System.out.println("LOCAL Date:  (" + localDate + ") to UTIL Date: (" + date + ")");
	}

	private void converUtilToLocalDate() {
		System.out.println("-----------Convert UTIL Date to Local Date-------------\n");

		Date date = new Date();

		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("UTIL Date:  (" + date + ") to LOCAL Date: (" + localDate + ")");

		LocalTime localTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
		System.out.println("LOCAL Time : " + localTime);

	}

}
