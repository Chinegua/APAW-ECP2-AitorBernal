package apiDoctor.api.dtos;

import java.util.Calendar;

import apiDoctor.Appointmen;

public class AppointmenDto {

    private String patient;

    private int id;
    
    private Calendar calendar;

    public AppointmenDto() {
    }

    public AppointmenDto(Appointmen appointmen) {
        this.patient = appointmen.getPatient();
        this.id = appointmen.getId();
        this.calendar = appointmen.getCalendar();
    }

    public String getPatient() {
        return this.getPatient();
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
    
    public Calendar getCalendar() {
        return this.getCalendar();
    }

    @Override
    public String toString() {
        return "{\"id\":\"" + this.id + ",\"patient\":" + this.patient + ",\"calendar\":" + this.calendar + "}";
    }

}
