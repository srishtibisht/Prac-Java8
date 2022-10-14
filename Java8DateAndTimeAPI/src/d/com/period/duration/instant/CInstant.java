package d.com.period.duration.instant;

import java.time.Duration;
import java.time.Instant;

public class CInstant {
	
	public static void main(String[] args) {
		
		Instant i1 = Instant.now();
		System.out.println("Total seconds from 1970 to till now : "+ i1.getEpochSecond());
		
		System.out.println("----------------------------------");
		
		System.out.println("TIme at 61th second of 1970 is : "+ Instant.ofEpochSecond(61));
		
		System.out.println("----------------------------------");
		
		Instant i2 = Instant.now();
		Duration duration = Duration.between(i1, i2);
		System.out.println("Nano Second : "+ duration.getNano());
		System.out.println("Second : "+ duration.getSeconds());
	}

}
