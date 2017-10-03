package apiDoctor.api.resource;

import apiDoctor.api.controller.DoctorController;
import apiDoctor.api.resource.exceptions.DoctorCostInvalidException;
import apiDoctor.api.resource.exceptions.DoctorIdInvalidException;
import apiDoctor.api.resource.exceptions.DoctorSpecilityInvalidException;

public class DoctorResource {


	public static final String DOCTORS = "doctors";


	public void createDoctor(Integer id,String speciality,Double cost) throws DoctorIdInvalidException, DoctorSpecilityInvalidException, DoctorCostInvalidException{
		this.validateid(id);
		this.validateSpeciality(speciality);
		this.validateCost(cost);
		
	}
	
    private void validateid(int id) throws DoctorIdInvalidException {
        if (id <= 0 ) {
            throw new DoctorIdInvalidException(id);
        }
    }
    private void validateCost(double cost) throws DoctorIdInvalidException, DoctorCostInvalidException {
        if (cost <= 0 ) {
            throw new DoctorCostInvalidException(cost);
        }
    }
    private void validateSpeciality(String speciality) throws DoctorSpecilityInvalidException {
        if (speciality == null || speciality.isEmpty()) {
            throw new DoctorSpecilityInvalidException(speciality);
        }
    }

}
