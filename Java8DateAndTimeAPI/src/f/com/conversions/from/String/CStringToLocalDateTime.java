package f.com.conversions.from.String;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CStringToLocalDateTime {

	public static void main(String[] args) {

		CStringToLocalDateTime main = new CStringToLocalDateTime();

		System.out.println("-------Convert String to Local Date Time (Parsing)------ \n ");
		main.parseStringToLocalDateTime();

		System.out.println("\n-------Convert Local Date Time to String (Formating)------ \n ");
		main.formatLocalDateTimeToString();

	}

	private void formatLocalDateTimeToString() {
		LocalDateTime localDateTime1 = LocalDateTime.now();
		String dateTime1 = localDateTime1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("Date Time in String : " + dateTime1);

		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'*xxxx*'HH|mm|ss");
		LocalDateTime localDateTime2 = LocalDateTime.of(2022, 10, 29, 10, 12, 39);
		String dateTime2 = localDateTime2.format(dateTimeFormatter2);
		System.out.println("CUSTOMIZE Date Time in String : " + dateTime2);

	}

	private void parseStringToLocalDateTime() {
		String dateTime1 = "2022-10-29T12:33:56.01345";
		LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime1);
		System.out.println("Local Date Time : " + localDateTime1);

		String dateTime2 = "2021-10-13T10:11:12";
		LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime2, DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("ISO_DATE_TIME Local Date Time : " + localDateTime2);

		String dateTime3 = "2021**10**13&&10^^11^^12";
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy**MM**dd&&HH^^mm^^ss");
		LocalDateTime localDateTime3 = LocalDateTime.parse(dateTime3, dateTimeFormatter3);
		System.out.println("CUSTOMIZE Local Date Time : " + localDateTime3);

	}

}
