package universe.dao.interfaces;

import universe.model.Group;
import universe.model.Student;

import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */
public interface StudentDAO extends ControllerDAO<Student> {

    List<Student> getStudentGroup(Group group);

    double getAvgStudentMark();

    double getAvgStudentMark(int id);


}