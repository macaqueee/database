package dao_controller.controller;

import dao_controller.interfaces.StudentDAO;
import dao_controller.interfaces.Service;
import model.Group;
import model.Lector;
import model.Student;
import model.Subject;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */
public class ServiceImpl implements Service {

    private StudentDAO daoStudentController;

    private final static Logger logger = Logger.getLogger(ServiceImpl.class);


    public ServiceImpl(StudentDAO daoStudentController) {
        this.daoStudentController = daoStudentController;
    }


    @Override
    public List<Student> getAllStudents() {
        logger.error("error messsage");
        logger.debug("debug message");
        logger.info("info message");
        return daoStudentController.getAll();
    }

    @Override
    public List<Subject> getAllSubjects() {
        return null;
    }

    @Override
    public List<Lector> getAllLectors() {
        return null;
    }

    @Override
    public List<Group> getAllGroups() {
        return null;
    }

    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public Group addGroup(Group group) {
        return null;
    }

    @Override
    public Lector addLector(Lector lector) {
        return null;
    }

    @Override
    public Subject addSubject(Subject subject) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public List<Group> getGroupById(int id) {
        return null;
    }

    @Override
    public List<Group> getMathGroup() {
        return null;
    }

    @Override
    public List<Lector> getMinMaxExpLectors() {
        return null;
    }
}
