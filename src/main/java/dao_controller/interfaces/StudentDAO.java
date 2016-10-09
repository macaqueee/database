package dao_controller.interfaces;

import model.Student;

import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */
public interface StudentDAO extends ControllerDAO {

    List<Student> getStudentGroup(int id);

    double getAvgStudentMark();

    double getAvgStudentMark(int id);


}