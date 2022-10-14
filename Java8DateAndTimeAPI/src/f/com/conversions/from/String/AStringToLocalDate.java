package f.com.conversions.from.String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AStringToLocalDate {

	public static void main(String[] args) {

		AStringToLocalDate main = new AStringToLocalDate();

		System.out.println("-------Convert String to Local Date (Parsing)------ \n ");
		main.parseToLocalDate();

		System.out.println("\n-------Convert Local Date to String (Formating)------ \n ");
		main.formatToString();

	}

	private void formatToString() {
		LocalDate localDate1 = LocalDate.of(2022, 01, 01);

		String date1 = localDate1.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("ISO_LOCAL_DATE Date String : " + date1);

		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		String date4 = localDate1.format(dateTimeFormatter1);
		System.out.println("CUSTOMIZE Date String  : " + date4);

	}

	private void parseToLocalDate() {

		String date1 = "1996-10-29";
		LocalDate localDate1 = LocalDate.parse(date1);
		System.out.println("Local Date  : " + localDate1);

		String date2 = "19961029";
		LocalDate localDate2 = LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("Local Date using BASIC_ISO_DATE format : " + localDate2);

		String date3 = "1996-W43-6";
		LocalDate localDate3 = LocalDate.parse(date3, DateTimeFormatter.ISO_WEEK_DATE);
		System.out.println("Local Date using ISO_WEEK_DATE format : " + localDate3);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy$MM$dd");
		String date4 = "1996$10$29";
		LocalDate localDate4 = LocalDate.parse(date4, dateTimeFormatter);
		System.out.println("Local Date using CUSTOMIZE FORMATTER : " + localDate4);

	}

}
