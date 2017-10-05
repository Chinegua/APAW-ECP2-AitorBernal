package apiDoctor.api.controller;

import apiDoctor.Doctor;

import apiDoctor.api.daos.DaoFactory;

public class DoctorController {

	public void createDoctor(Integer id, String speciality) {
		DaoFactory.getFactory().getDoctorDao().create(new Doctor(id,speciality));	
	}

}
