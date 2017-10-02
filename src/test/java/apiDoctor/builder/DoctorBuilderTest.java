package apiDoctor.builder;
import apiDoctor.*;


import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class DoctorBuilderTest {
	DoctorBuilder doctorBuilder;
	Doctor doctor;
	@Before
	public void Before(){
		doctorBuilder = new DoctorBuilder(2,"cabecera");
		doctor = doctorBuilder.build();
		
	}
	@Test
	public void testDoctorBuilder() {
		assertEquals("cabecera",doctor.getSpeciality());
	}

	@Test
	public void testAppointmen() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2004, 1, 7);
		Appointmen appointmen;
		appointmen = new Appointmen(1,"Pepe",calendar);
		doctor = doctorBuilder.appointmen(appointmen).build();
		assertEquals(false,doctor.getApoimentList().isEmpty());

	}

	@Test
	public void testId() {
		doctor = doctorBuilder.id(3).build();
		assertEquals(3,doctor.getId());
		
	}

	@Test
	public void testSpeciality() {
		doctor = doctorBuilder.speciality("Dentista").build();
		assertEquals("Dentista",doctor.getSpeciality());
	}

	@Test
	public void testCost() {
		doctor = doctorBuilder.cost(30).build();
		assertEquals(30.0,doctor.getCost(),0.00001);

	}

	@Test
	public void testLevel() {

		doctor = doctorBuilder.level(Level.EXPERT).build();
		assertEquals(Level.EXPERT,doctor.getLevel());
	}

}
