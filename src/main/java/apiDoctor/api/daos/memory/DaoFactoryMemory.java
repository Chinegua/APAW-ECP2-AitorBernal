package apiDoctor.api.daos.memory;

import apiDoctor.api.daos.AppointmenDao;

import apiDoctor.api.daos.DaoFactory;
import apiDoctor.api.daos.DoctorDao;

public class DaoFactoryMemory extends DaoFactory {

    private DoctorDao doctorDao;

    private AppointmenDao appointmenDao;

    @Override
    public DoctorDao getDoctorDao() {

        if (doctorDao == null) {

        	doctorDao = new DoctorDaoMemory();
        }

        return doctorDao;
    }

    @Override
    public AppointmenDao getAppointmenDao() {
        if (appointmenDao == null) {
        	appointmenDao = new AppointmenDaoMemory();
        }
        return appointmenDao;
    }

}
