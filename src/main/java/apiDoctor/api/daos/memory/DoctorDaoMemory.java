package apiDoctor.api.daos.memory;

import java.util.HashMap;

import apiDoctor.Doctor;
import apiDoctor.api.daos.DoctorDao;


public class DoctorDaoMemory extends GenericMemoryDao<Doctor> implements DoctorDao {

    public DoctorDaoMemory() {
        this.setMap(new HashMap<Integer, Doctor>());
    }

    @Override
    protected Integer getId(Doctor entity) {
        return entity.getId();
    }

    @Override
    protected void setId(Doctor entity, Integer id) {
        entity.setId(id);

    }

}
