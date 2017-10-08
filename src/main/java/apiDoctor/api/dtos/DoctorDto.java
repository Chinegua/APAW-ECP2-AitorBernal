package apiDoctor.api.dtos;

import apiDoctor.Doctor;

public class DoctorDto {
    
    private int id;

    private String speciality;
    
    double cost;


    public DoctorDto(Doctor doctor) {
        id = doctor.getId();
        speciality = doctor.getSpeciality();
        cost = doctor.getCost();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    public String toSpeciality(){
        return "{\"speciality\":\"" + this.speciality +"}";
    }

    @Override
    public String toString() {
        return "{\"id\":" + this.id + ",\"speciality\":\"" + this.speciality + "\",\"cost\":\"" + this.cost +"\"}";
    }

    

}
