package apiDoctor.api.resource;

import apiDoctor.api.controller.DoctorController;


import apiDoctor.api.resource.exceptions.DoctorIdInvalidException;
import apiDoctor.api.resource.exceptions.DoctorSpecilityInvalidException;

public class DoctorResource {

	public static final String DOCTORS = "doctors";

	public void createDoctor(Integer id, String speciality)
			throws DoctorIdInvalidException, DoctorSpecilityInvalidException {

		this.validateid(id);
		this.validateSpeciality(speciality);
		new DoctorController().createDoctor(id, speciality);

	}

	private void validateid(int id) throws DoctorIdInvalidException {
		if (id <= 0) {
			throw new DoctorIdInvalidException(id);
		}
	}

	private void validateSpeciality(String speciality) throws DoctorSpecilityInvalidException {
		if (speciality == null || speciality.isEmpty()) {
			throw new DoctorSpecilityInvalidException(speciality);
		}
	}

}
