package apiDoctor.api.controller;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import apiDoctor.api.daos.DaoFactory;
import apiDoctor.api.daos.memory.DaoFactoryMemory;

public class AppointmenControllerTest {
	Calendar calendar = Calendar.getInstance();


    @Before
    public void before() {
    	calendar.set(2004, 1, 7);
        DaoFactory.setFactory(new DaoFactoryMemory());
    }
	@Test
	public void testCreateAppointmen() {
		AppointmenController.createAppointmen(1,"Paco Perez",calendar);
		AppointmenController.createAppointmen(1,"Marcos ",calendar);
        assertEquals(2, AppointmenController.AppointmenList().size());
        assertEquals("Paco Perez", AppointmenController.AppointmenList().get(0).getPatient());
	}

	@Test
	public void testReadTheme() {
		AppointmenController.createAppointmen(1,"Paco Perez",calendar);
		AppointmenController.createAppointmen(1,"Marcos ",calendar);
		AppointmenController.createAppointmen(1,"Paco Perez",calendar);
		assertEquals("Paco Perez",AppointmenController.readTheme(1).get().getPatient());
	}

}
