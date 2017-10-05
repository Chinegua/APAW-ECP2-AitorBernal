package apiDoctor.api.dtos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import apiDoctor.Doctor;
import apiDoctor.builder.DoctorBuilder;

public class DoctorDtoTest {
	Doctor doctor;
	DoctorDto doctorDto;

	@Before
	public void Before() {
		doctor = new DoctorBuilder(2, "Cabecera").build();
		doctorDto = new DoctorDto(doctor);
	}

	@Test
	public void testDoctorDto() {
		assertEquals(2, doctorDto.getId());
	}

	@Test
	public void testSetId() {
		doctorDto.setId(1);
		assertEquals(1, doctorDto.getId());

	}

	@Test
	public void testGetSpeciality() {
		doctorDto.setSpeciality("Curandero");
		assertEquals("Curandero", doctorDto.getSpeciality());

		}

	@Test
	public void testToString() {
		assertEquals("{\"id\":2,\"speciality\":\"Cabecera\",\"cost\":\"0.0\"}",doctorDto.toString());
		
	}

}
