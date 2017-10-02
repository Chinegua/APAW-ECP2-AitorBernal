package apiDoctor.builder;

import java.util.Calendar;

import citas.Appointmen;

public class AppointmenBuilder {

	Calendar calendar;
	Appointmen appointmen;

	public AppointmenBuilder(int id,String string, Calendar calendar){
		appointmen = new Appointmen(id,string,calendar);
		
	}
	
	public AppointmenBuilder id(int id){
		appointmen.setId(id);
		return this;
	}
	
	public AppointmenBuilder patient(String patient){
		appointmen.setPatient(patient);
		return this;
	}
	
	public AppointmenBuilder calendar(Calendar calendar){
		appointmen.setCalendar(calendar);
		return this;
	}
	public Appointmen build(){
		return this.appointmen;
	}

}
