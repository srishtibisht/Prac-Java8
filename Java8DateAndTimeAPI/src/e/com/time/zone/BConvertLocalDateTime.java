package e.com.time.zone;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class BConvertLocalDateTime {

	public static void main(String[] args) {
		BConvertLocalDateTime main = new BConvertLocalDateTime();

		System.out.println("-------------CONVERT LOCAL DATE TIME TO ZONED------------------\n ");

		main.convertLocalDateTime();
	}

	private void convertLocalDateTime() {

		LocalDateTime l1 = LocalDateTime.now();
		System.out.println("Local Date Time : " + l1);

		System.out.println("--------------------------------------\n");

		ZonedDateTime z1 = l1.atZone(ZoneId.of("Asia/Aqtau"));
		System.out.println("Zoned date time : " + z1);

		System.out.println("--------------------------------------\n");

		ZonedDateTime z2 = Instant.now().atZone(ZoneId.of("America/Marigot"));
		System.out.println("Zoned date time : " + z2);

		System.out.println("--------------------------------------\n");

		OffsetDateTime offsetDateTime = l1.atOffset(ZoneOffset.ofHours(-6));
		System.out.println("Offset : " + offsetDateTime);

	}
}
