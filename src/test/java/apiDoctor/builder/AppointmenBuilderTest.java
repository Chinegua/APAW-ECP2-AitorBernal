package apiDoctor.builder;
import apiDoctor.*;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class AppointmenBuilderTest {
	AppointmenBuilder appointmenBuilder;
	Calendar calendar;
	Calendar calendar2;
	Appointmen appointmen;
	@Before
	public void Before(){
		calendar = Calendar.getInstance();
		calendar.set(2004, 1, 7);
		appointmenBuilder = new AppointmenBuilder(2,"Juan Perez",calendar);
		appointmen = appointmenBuilder.build();
	}
	@Test
	public void testAppointmenBuilder() {
		assertEquals(2,appointmen.getId());
		
	}

	@Test
	public void testId() {
		appointmen = appointmenBuilder.id(5).build();
		assertEquals(5,appointmen.getId());
	}

	@Test
	public void testPatient() {
		appointmen = appointmenBuilder.patient("Francisco").build();
		assertEquals("Francisco",appointmen.getPatient());

	}

	@Test
	public void testCalendar() {
		calendar2 = Calendar.getInstance();
		calendar2.set(2004, 1, 7);
		appointmenBuilder.calendar(calendar2);
		assertEquals(calendar2,appointmen.getCalendar());

	}

}
