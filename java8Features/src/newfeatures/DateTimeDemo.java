package newfeatures;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;



/* Java 8 introduces a new date-time API under the package java.time.
It simply change the way we have been handling dates in java applications.Important classes introduced in java.time packageLocal − Simplified date-time API with no complexity of timezone handling.Zoned − Specialized date-time API to deal with various timezones.
*/


public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1= new Date();
		System.out.println(d1);
		System.out.println(d1.getDate());
		System.out.println(d1.getHours()+ " :"+d1.getMinutes()+":"+d1.getSeconds());
		
		//calander Class
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println("****** JAvA 8 Date and Time Classes ******");
		
		LocalDate d =LocalDate.now();
		LocalTime t= LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		
		System.out.println("Date and Time is :"+d + " --> "+ t);
		System.out.println("Brfore formstting"+dt);
		System.out.println(dt);
		
		DateTimeFormatter formate =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String dt1= dt.format(formate);
		
		System.out.println("AFter Formattinfg :"+dt1);
		
		//Java Clock class is used to provide an access to the current, date and time using a time zone.

        Clock c1=Clock.systemDefaultZone();
		System.out.println(c1.getZone());
		
		Clock c2= Clock.systemUTC();
		System.out.println(c2.instant());
		
		//ZOned Date time to deal with various time zones
		
		ZoneId z1=ZoneId.of("Asia/Tokyo");
		LocalTime t1=LocalTime.now(z1);
		System.out.println("Japan Time is :"+t1);
		
		
		
	
	}

}
