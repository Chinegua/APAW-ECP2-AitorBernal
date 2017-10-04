package apiDoctor.api.daos.memory;

import apiDoctor.api.daos.AppointmenDao;
import apiDoctor.api.daos.DaoFactory;
import apiDoctor.api.daos.DoctorDao;

public class DaoFactoryMemory extends DaoFactory {

    private DoctorDao themeDao;

    private AppointmenDao voteDao;

    @Override
    public DoctorDao getDoctorDao() {
        if (themeDao == null) {
            themeDao = new DoctorDaoMemory();
        }
        return themeDao;
    }

    @Override
    public AppointmenDao getAppointmenDao() {
        if (voteDao == null) {
            voteDao = new AppointmenDaoMemory();
        }
        return voteDao;
    }

}
