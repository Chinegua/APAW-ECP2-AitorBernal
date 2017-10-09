package apiDoctor.api.resource;

import java.util.List;

import java.util.Optional;

import apiDoctor.api.controller.DoctorController;
import apiDoctor.api.dtos.DoctorDto;
import apiDoctor.api.resource.exceptions.DoctorIdInvalidException;
import apiDoctor.api.resource.exceptions.DoctorIdNotFoundException;
import apiDoctor.api.resource.exceptions.DoctorSpecilityInvalidException;



public class DoctorResource {

	public static final String DOCTORS = "doctors";
    public static final String ID = "/{id}";
    public static final String ID_SPECIALITY = DOCTORS + ID + "/speciality";
    public static final String APPOINTMEN = "/appointmens";


	public void createDoctor(Integer id, String speciality)
			throws DoctorIdInvalidException, DoctorSpecilityInvalidException {

		this.validateid(id);
		this.validateSpeciality(speciality);
		new DoctorController().createDoctor(id, speciality);

	}
    public static List<DoctorDto> DoctorList() {
    	
        return new DoctorController().DoctorList();
    }
    

    
    public static DoctorDto doctorSpeciality(Integer id) throws DoctorIdNotFoundException{
    	Optional<DoctorDto> optional = new DoctorController().readTheme(id);
        return optional.orElseThrow(() -> new DoctorIdNotFoundException(Integer.toString(id)));
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
