package c.com.local.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class BConversions {

	public static void main(String[] args) {
		BConversions main = new BConversions();

		main.convertIntoDateAndTime();

	}

	private void convertIntoDateAndTime() {
		LocalDate date1 = LocalDate.of(2013, 04, 13);

		System.out.print("Convert LOCAL DATE to LOCAL DateTime -->  ");
		System.out.println(date1.atTime(12, 32, 22));

		System.out.print("\nConvert LOCAL TIME to LOCAL DateTime -->  ");
		
		LocalTime time1 = LocalTime.of(12, 32, 16);
		
		System.out.println(time1.atDate(LocalDate.now()));
		
		System.out.println("--------------------------------------------------------");
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.print("Convert LOCAL DateTime to LOCAL DATE -->  ");
		System.out.println(dateTime.toLocalDate());
		
		
		System.out.print("\nConvert LOCAL DateTime to LOCAL TIME -->  ");
		System.out.println(dateTime.toLocalTime());

	}

}
