package apiDoctor.api.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import apiDoctor.Appointmen;
import apiDoctor.api.daos.DaoFactory;
import apiDoctor.api.dtos.AppointmenDto;

public class AppointmenController {

	public static void createAppointmen(Integer id, String paciente, Calendar calendar) {
		DaoFactory.getFactory().getAppointmenDao().create(new Appointmen(id,paciente,calendar));	

	}

	public static List<AppointmenDto> AppointmenList() {
        List<Appointmen> appointmenList = DaoFactory.getFactory().getAppointmenDao().findAll();
        List<AppointmenDto> appointmenDtoList = new ArrayList<>();
        for (Appointmen appointmen : appointmenList) {
        	appointmenDtoList.add(new AppointmenDto(appointmen));
        }
        return appointmenDtoList;
	}

	public static Optional<AppointmenDto> readTheme(Integer id) {

        if (existAppointmenId(id)) {
            return Optional.of(new AppointmenDto(DaoFactory.getFactory().getAppointmenDao().read(id)));
        } else {
            return Optional.empty();
        }

	}

	private static boolean existAppointmenId(Integer id) {
		 return DaoFactory.getFactory().getAppointmenDao().read(id) != null;
	}

}
