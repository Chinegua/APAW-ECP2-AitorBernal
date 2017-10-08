package apiDoctor.api.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import apiDoctor.Appointmen;
import apiDoctor.api.daos.DaoFactory;
import apiDoctor.api.dtos.AppointmenDto;

public class AppointmenController {

	public void createAppointmen(Integer id, String paciente, Calendar calendar) {
		DaoFactory.getFactory().getAppointmenDao().create(new Appointmen(id,paciente,calendar));	
	}

	public Object AppointmenList() {
        List<Appointmen> appointmenList = DaoFactory.getFactory().getAppointmenDao().findAll();
        List<AppointmenDto> appointmenDtoList = new ArrayList<>();
        for (Appointmen appointmen : appointmenList) {
        	appointmenDtoList.add(new AppointmenDto(appointmen));
        }
        return appointmenDtoList;
	}

}
