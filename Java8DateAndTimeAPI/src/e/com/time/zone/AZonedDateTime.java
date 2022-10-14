package e.com.time.zone;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AZonedDateTime {

	public static void main(String[] args) {

		AZonedDateTime main = new AZonedDateTime();

		main.displayTimeZone();

	}

	private void displayTimeZone() {

		ZonedDateTime z1 = ZonedDateTime.now();
		System.out.println("Zoned Date Time : " + z1);

		System.out.println("Zoned ID : " + z1.getZone());

		System.out.println("Zoned ID : " + z1.getOffset());

		System.out.println("------------------------------------------------\n");

		System.out.println("All the available zone : ");
		ZoneId.getAvailableZoneIds().forEach(l -> System.out.print(l + "  "));

		System.out.println("");

		System.out.println("Total no. of zones :  " + ZoneId.getAvailableZoneIds().size());

		System.out.println("------------------------------------------------\n");

		ZonedDateTime t1 = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
		System.out.println("Zone time of [Asia/Calcutta] : " + t1);

		ZonedDateTime t2 = ZonedDateTime.now(ZoneId.of("Asia/Aden"));
		System.out.println("Zone time of [Asia/Aden] : " + t2);

		ZonedDateTime t3 = ZonedDateTime.now(ZoneId.of("Asia/Aqtau"));
		System.out.println("Zone time of [Asia/Aqtau] : " + t3);

		ZonedDateTime t4 = ZonedDateTime.now(ZoneId.of("America/Marigot"));
		System.out.println("Zone time of [Asia/Marigot] : " + t4);

		System.out.println("\n ----- LOCAL DATE TIME DOESNOT GIVE TIME ZONE -----\n ");
		LocalDateTime localDateTime = LocalDateTime.now(Clock.system(ZoneId.of("America/Marigot")));
		System.out.println("Zone time of [Asia/Marigot] using local date time : " + localDateTime);

		LocalDateTime lo1 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println("Zone time of THIS SYSTEM : " + lo1);

	}

}
