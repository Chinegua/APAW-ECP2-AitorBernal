package apiDoctor.api.controller;

import java.util.ArrayList;

import java.util.List;

import apiDoctor.Doctor;

import apiDoctor.api.daos.DaoFactory;
import apiDoctor.api.dtos.DoctorDto;

public class DoctorController {

	public void createDoctor(Integer id, String speciality) {
		DaoFactory.getFactory().getDoctorDao().create(new Doctor(id,speciality));	
	}

	public List<DoctorDto> themeList() {
        List<Doctor> doctorList = DaoFactory.getFactory().getDoctorDao().findAll();
        List<DoctorDto> doctorDtoList = new ArrayList<>();
        for (Doctor theme : doctorList) {
            doctorDtoList.add(new DoctorDto(theme));
        }
        return doctorDtoList;
	}

}
