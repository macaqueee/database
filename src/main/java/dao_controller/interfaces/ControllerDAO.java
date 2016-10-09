package dao_controller.interfaces;

import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */
public interface ControllerDAO<E>{

    List<E> getAll();
    E updateInstance(E entity);
    E addInstance(E entity);
    E deleteInstance(E entity);


}
