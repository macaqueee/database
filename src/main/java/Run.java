import dao_controller.controller.StudentDAOImpl;
import dao_controller.controller.ServiceImpl;
import dao_controller.interfaces.StudentDAO;
import dao_controller.interfaces.Service;
import model.Student;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by macaque on 05.10.2016.
 */
public class Run {


    public static void main(String[] args) {
        StudentDAO daoStudentController = new StudentDAOImpl();
        Service service = new ServiceImpl(daoStudentController);
        List<Student> studentList = service.getAll();
        for (Student student : studentList) {
            System.out.printf(student.getId() + ", " + student.getName() + ", " + student.getGroupId() + "\n");
        }
    }
}
