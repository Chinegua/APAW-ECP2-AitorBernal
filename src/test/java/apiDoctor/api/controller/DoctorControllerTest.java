package apiDoctor.api.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import apiDoctor.api.daos.DaoFactory;
import apiDoctor.api.daos.memory.DaoFactoryMemory;


public class DoctorControllerTest {
    private DoctorController DoctorController;

    @Before
    public void before() {
        DaoFactory.setFactory(new DaoFactoryMemory());
        DoctorController = new DoctorController();
    }
	@Test
	public void testCreateDoctor() {
		DoctorController.createDoctor(1,"Cabecera");
		DoctorController.createDoctor(1,"Cabecera");
        assertEquals(2, DoctorController.DoctorList().size());
        assertEquals("Cabecera", DoctorController.DoctorList().get(0).getSpeciality());
	}
	@Test
	public void testReadTheme(){
		DoctorController.createDoctor(1,"Cabecera");
		assertEquals("Cabecera",DoctorController.readTheme(1).get().getSpeciality());
	}



}
