package apiDoctor.api.dtos;

import java.util.Calendar;

import apiDoctor.Appointmen;

public class AppointmenDto {

	private String patient;

	private int id;

	private Calendar calendar;

	public AppointmenDto(Appointmen appointmen) {

		this.patient = appointmen.getPatient();
		this.id = appointmen.getId();
		this.calendar = appointmen.getCalendar();
	}

	public String getPatient() {
		return patient;
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
		return this.calendar;
	}
	
    public String toCalendar(){
    	int day = this.calendar.get(Calendar.DAY_OF_MONTH);
    	int month = this.calendar.get(Calendar.MONTH);
    	int year = this.calendar.get(Calendar.YEAR);
        return "{\"date\":\"" + day+"-"+month+"-"+year +"}";
    }

	@Override
	public String toString() {
		return "{\"id\":\"" + this.id + ",\"patient\":" + this.patient + ",\"calendar\":" + this.calendar.get(Calendar.DATE)+"-"+this.calendar.get(Calendar.MONTH)+"-"+this.calendar.get(Calendar.YEAR) + "}";
	}

}
