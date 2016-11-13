package universe.dao.interfaces;

import universe.exceptions.StudentNotFoundException;

import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */
public interface ControllerDAO<E>{

    // todo pagination, get data by parts
    // getAll(int offset, int length)
    List<E> getAll(int position, int length);
    E updateInstance(E entity);
    E addInstance(E entity);
    E deleteInstance(E entity);

    E findInstance(E entity) throws StudentNotFoundException;


}
