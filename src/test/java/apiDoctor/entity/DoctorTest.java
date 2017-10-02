package apiDoctor.entity;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class DoctorTest {
	public Doctor doctor;

	@Before
	public void Before() {
		doctor = new Doctor(1, "Dentista");
	}

	@Test
	public void testDoctor() {
		assertEquals(1, doctor.getId());
	}

	@Test
	public void testGetId() {
		assertEquals(1, doctor.getId());
	}

	@Test
	public void testSetId() {
		doctor.setId(2);
		assertEquals(2, doctor.getId());
	}

	@Test
	public void testGetSpeciality() {
		assertEquals("Dentista", doctor.getSpeciality());
	}

	@Test
	public void testSetSpeciality() {
		doctor.setSpeciality("Oftalmologo");
		assertEquals("Oftalmologo", doctor.getSpeciality());

	}

	@Test
	public void testGetCost() {
		doctor.setCost(20.95);
		assertEquals(20.95, doctor.getCost(), 0.0001);

	}

	@Test
	public void testGetApoimentList() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2004, 1, 7);
		Appointmen app = new Appointmen(1, "Juan Pedro", calendar);
		doctor.addApoiment(app);
		assertEquals(false, doctor.getApoimentList().isEmpty());

	}

	@Test
	public void testGetLevel() {
		doctor.setLevel(Level.NORMAL);
		assertEquals(Level.NORMAL,doctor.getLevel());
	}


}
