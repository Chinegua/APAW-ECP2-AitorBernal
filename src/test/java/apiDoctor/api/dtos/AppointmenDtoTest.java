package apiDoctor.api.dtos;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import apiDoctor.Appointmen;
import apiDoctor.builder.AppointmenBuilder;

public class AppointmenDtoTest {

	Appointmen appointmen;
	Calendar calendar;
	AppointmenDto appointmenDto;

	@Before
	public void Before() {
		calendar = Calendar.getInstance();
		calendar.set(2004, 1, 7);
		appointmen = new AppointmenBuilder(2, "Jose Juan", calendar).build();
		appointmenDto = new AppointmenDto(appointmen);

	}

	@Test
	public void testAppointmenDto() {
		assertEquals(2, appointmenDto.getId());
	}

	@Test
	public void testGetPatient() {
		assertEquals("Jose Juan", appointmenDto.getPatient());
	}

	@Test
	public void testSetPatient() {
		appointmenDto.setPatient("Paco Juan");
		assertEquals("Paco Juan", appointmenDto.getPatient());
	}

	@Test
	public void testSetId() {
		appointmenDto.setId(1);
		assertEquals(1, appointmenDto.getId());

	}

	@Test
	public void testSetCalendar() {
		calendar.set(2004, 2, 7);
		appointmenDto.setCalendar(calendar);
		assertEquals(calendar,appointmenDto.getCalendar());

	}

	@Test
	public void testToString() {
	 assertEquals("{\"id\":\"2,\"patient\":Jose Juan,\"calendar\":7-1-2004}",appointmenDto.toString());
	}

}
