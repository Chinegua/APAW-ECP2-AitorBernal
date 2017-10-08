package apiDoctor.api.resource;

import java.util.Calendar;


import apiDoctor.api.controller.AppointmenController;
import apiDoctor.api.resource.exceptions.AppointmenIdInvalidException;
import apiDoctor.api.resource.exceptions.AppointmenPatientInvalidException;


public class AppointmenResource {
    public static final String APPOINTMEN = "appointmens";

	public void createAppointmen(Integer id, String paciente, Calendar calendar) throws AppointmenIdInvalidException, AppointmenPatientInvalidException  {

		this.validateid(id);
		this.validatePatient(paciente);

		new AppointmenController().createAppointmen(id, paciente,calendar);

	}
	
	private void validateid(int id) throws AppointmenIdInvalidException {
		if (id <= 0) {
			throw new AppointmenIdInvalidException(id);
		}
	}
	
	private void validatePatient(String patient) throws AppointmenPatientInvalidException {
		if (patient == null || patient.isEmpty()) {
			throw new AppointmenPatientInvalidException(patient);
		}
	}

	public static Object AppointmenList() {
		return new AppointmenController().AppointmenList();
	}

}
