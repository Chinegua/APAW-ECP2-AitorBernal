package apiDoctor.api.controller;

import java.util.Calendar;

import apiDoctor.Appointmen;
import apiDoctor.api.daos.DaoFactory;

public class AppointmenController {

	public void createAppointmen(Integer id, String paciente, Calendar calendar) {
		DaoFactory.getFactory().getAppointmenDao().create(new Appointmen(id,paciente,calendar));	
	}

}
