package d.com.period.duration.instant;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class BDuration {

	public static void main(String[] args) {

		System.out.println("--------------------toHours / toMinutes--------------------\n");

		Duration d1 = Duration.ofHours(12);
		System.out.println("Duration in HOURS : " + d1.toHours() + " Duration in MINUTES : " + d1.toMinutes());

		System.out.println("\n--------------------getSeconds--------------------\n");

		Duration d2 = Duration.ofMinutes(26);
		System.out.println("Duration in SECONDS : " + d2.getSeconds());

		System.out.println("\n--------------------UNTIL--------------------\n");

		LocalTime t1 = LocalTime.of(12, 46, 29, 234);
		LocalTime t2 = LocalTime.of(15, 36, 19, 134);

		System.out.println("Diff in HOURS : " + t1.until(t2, ChronoUnit.HOURS));

		System.out.println("\n--------------------BETWEEN--------------------\n");

		Duration duration = Duration.between(t1, t2);

		System.out.println("DURATION : " + duration);
		System.out.println("HOURS : " + duration.toHours());
		System.out.println("NANOS : " + duration.get(ChronoUnit.NANOS));

	}

}
