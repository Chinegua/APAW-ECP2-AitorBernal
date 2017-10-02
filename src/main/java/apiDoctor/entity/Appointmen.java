package apiDoctor.entity;

import java.util.Calendar;

public class Appointmen {
	private int id;
	private String patient;
	private Calendar calendar;

	public Appointmen(int id, String patient, Calendar calendar) {
		assert id > 0;
		this.setId(id);
		this.setPatient(patient);
		this.setCalendar(calendar);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

}
