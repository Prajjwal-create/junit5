package testcode;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

import businesscode.ScheduleService;

class ScheduleServiceTest {

	@Test
	void testDoSchedule() {
		TimeZone tzone=TimeZone.getDefault();
		assumeTrue(tzone.getDisplayName().equals("Kolakaat/asia"));
		//test doSchedule module
		
		ScheduleService ss=new ScheduleService();
		assertTrue(ss.doSchedule());
	}
	
	
	// assume current OS is Window
	@Test
	public void doScheduleLocaleNonUS() {

	// Assume that the current locale is US
	Locale currentLocale = Locale.getDefault();
	assumeTrue(currentLocale.equals(Locale.US));

	// Test doSchedule method
	ScheduleService scheduleService = new ScheduleService();
	assertTrue(scheduleService.doSchedule());

	}
	
	

	@Test
	void testBackupCalendar() {
		fail("Not yet implemented");
	}

}
