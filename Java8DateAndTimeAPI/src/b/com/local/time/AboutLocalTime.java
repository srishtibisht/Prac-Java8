package b.com.local.time;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class AboutLocalTime {

	public static void main(String[] args) {
		AboutLocalTime main = new AboutLocalTime();

		System.out.println("---------------DISPLAY TIME---------------\n");
		main.displayTime();

		System.out.println("\n---------------GET Specific hours and min from local time---------------\n");
		main.getTime();

		System.out.println("---------------Modify Local Time (PLUS)---------------\n");
		main.modifyLocalTime();

	}

	private void modifyLocalTime() {
		LocalTime t1 = LocalTime.now();

		System.out.println("Local Time : " + t1);

		System.out.println("Minus second : " + t1.minusSeconds(12));
		System.out.println("Minus hour : " + t1.minus(2, ChronoUnit.HOURS));
		System.out.println("Plus nano second : " + t1.plus(3, ChronoUnit.NANOS));

		System.out.println("Change time to Midnight : " + t1.with(LocalTime.MIDNIGHT));

		System.out.println("Change hours : " + t1.with(ChronoField.HOUR_OF_DAY, 9));

		System.out.println("Change minutes : " + t1.withMinute(12));
	}

	private void getTime() {
		LocalTime t1 = LocalTime.of(04, 12);

		System.out.println("Get time in Hour : " + t1.getHour());

		System.out.println("Get time in Minute : " + t1.getMinute());

		System.out.println("Get time in Second : " + t1.getSecond());

		System.out.println("Get time in Nano : " + t1.getNano());

		System.out.println("Get MINUTE_OF_HOUR : " + t1.get(ChronoField.MINUTE_OF_HOUR));

		System.out.println("Get MINUTE_OF_DAY : " + t1.get(ChronoField.MINUTE_OF_DAY));

	}

	private void displayTime() {
		LocalTime t1 = LocalTime.now();
		System.out.println("Local Time - " + t1);

		LocalTime t2 = LocalTime.of(4, 26);
		System.out.println("Local Time in hour and minute - " + t2);

		LocalTime t3 = LocalTime.of(5, 05, 12);
		System.out.println("Local Time in hour, minute and second - " + t3);

		LocalTime t4 = LocalTime.of(13, 12, 56, 456457);
		System.out.println("Local Time in hour, minute, second and nanosecond - " + t4);

	}

}
