package apiDoctor;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class AppointmenTest {
	public Calendar calendar = Calendar.getInstance();
	public Calendar calendar2 = Calendar.getInstance();

	public Appointmen appointmen;

	@Before
	public void Before() {
		calendar.set(2004, 1, 7);
		appointmen = new Appointmen(1, "Luis Peña Lopez", calendar);
	}

	@Test
	public void testAppointmen() {
		assertEquals(1, appointmen.getId());
	}

	@Test
	public void testGetId() {
		assertEquals(1, appointmen.getId());

	}

	@Test
	public void testSetId() {
		appointmen.setId(2);
		assertEquals(2, appointmen.getId());

	}

	@Test
	public void testGetPatient() {
		assertEquals("Luis Peña Lopez", appointmen.getPatient());

	}

	@Test
	public void testSetPatient() {
		appointmen.setPatient("Paco");
		assertEquals("Paco", appointmen.getPatient());
	}

	@Test
	public void testGetCalendar() {
		calendar2.set(2004, 1, 7);
		assertEquals(calendar2, appointmen.getCalendar());

	}

	@Test
	public void testSetCalendar() {
		calendar2.set(2003, 1, 7);
		appointmen.setCalendar(calendar2);
		assertEquals(calendar2, appointmen.getCalendar());

	}

}
