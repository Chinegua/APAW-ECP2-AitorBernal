package apiDoctor.api.daos.memory;


import java.util.HashMap;

import apiDoctor.Appointmen;
import apiDoctor.api.daos.AppointmenDao;


public class AppointmenDaoMemory extends GenericMemoryDao<Appointmen> implements AppointmenDao {

    public AppointmenDaoMemory() {
        this.setMap(new HashMap<Integer, Appointmen>());
    }

    @Override
    protected Integer getId(Appointmen entity) {
        return entity.getId();
    }

    @Override
    protected void setId(Appointmen entity, Integer id) {
        entity.setId(id);
    }


}
