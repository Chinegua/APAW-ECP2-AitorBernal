package apiDoctor.api.resource;

import java.util.Calendar;
import java.util.Optional;

import apiDoctor.api.controller.AppointmenController;
import apiDoctor.api.controller.DoctorController;
import apiDoctor.api.dtos.AppointmenDto;
import apiDoctor.api.dtos.DoctorDto;
import apiDoctor.api.resource.exceptions.AppointmenIdInvalidException;
import apiDoctor.api.resource.exceptions.AppointmenIdNotFoundException;
import apiDoctor.api.resource.exceptions.AppointmenPatientInvalidException;
import apiDoctor.api.resource.exceptions.DoctorIdNotFoundException;


public class AppointmenResource {
    public static final String APPOINTMEN = "appointmens";
    public static final String ID = "/{id}";
	public static final String ID_CALENDAR = ID +"/calendar";

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

	public static AppointmenDto appointmenCalendar(Integer id) throws DoctorIdNotFoundException, AppointmenIdNotFoundException {
    	Optional<AppointmenDto> optional = new AppointmenController().readTheme(id);
        return optional.orElseThrow(() -> new AppointmenIdNotFoundException(Integer.toString(id)));
	}

}
