package f.com.conversions.from.String;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BStringToLocalTime {

	public static void main(String[] args) {

		BStringToLocalTime main = new BStringToLocalTime();

		System.out.println("-------Convert String to Local Time (Parsing)------ \n ");
		main.parseToLocalTime();

		System.out.println("\n-------Convert Local Time to String (Formating)------ \n ");
		main.formatToString();

	}

	private void formatToString() {

		LocalTime localTime1 = LocalTime.of(12, 36, 56);
		String time1 = localTime1.format(DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("Local Time in String - " + time1);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
		String time2 = localTime1.format(dateTimeFormatter);
		System.out.println("CUstomize Time in String - " + time2);

	}

	private void parseToLocalTime() {

		String time1 = "10:15:30";
		LocalTime localTime1 = LocalTime.parse(time1);
		System.out.println("Local Time 1 - " + localTime1);

		String time2 = "10:15:30+01:00";
		LocalTime localTime2 = LocalTime.parse(time2, DateTimeFormatter.ISO_OFFSET_TIME);
		System.out.println("ISO_OFFSET_TIME Local Time 2 - " + localTime2);

		String time3 = "12*23*38";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime localTime3 = LocalTime.parse(time3, dateTimeFormatter);
		System.out.println("CUSTOMIZE Local Time 3 - " + localTime3);

	}

}
