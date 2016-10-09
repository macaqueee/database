import model.Group;
import model.Lector;
import model.Student;
import model.Subject;

import java.util.List;

/**
 * Created by macaque on 07.10.2016.
 */
public interface DatabaseController <E,K> {

    // TASK#1
    List<E> getAll(String table);

    // TASK#3
    E updateInstance(E entity);


    // TASK#4
    E addInstance(E entity);
    List<Group> getMathGroup();

    List<Subject> getAllSubjectLearning();

    List<Lector> getMinMaxExpLectors();
    List<Lector> getLectorWithThresholdExp(int experience);

    E getEntityById(K id);
    E update(E entity);
    boolean delete(K id);
    E create(E entity);
}
