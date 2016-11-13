package universe.service;

import org.springframework.transaction.annotation.Transactional;
import universe.dao.interfaces.StudentDAO;
import universe.exceptions.EmptyStudentsTableException;
import universe.exceptions.FailedAddingStudentException;
import universe.exceptions.WrongInputDataException;
import universe.model.Group;
import universe.model.Lector;
import universe.model.Student;
import universe.model.Subject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */
@Component
public class ServiceImpl implements Service {

    @Autowired
    private StudentDAO daoStudentController;


    private final static Logger LOGGER = Logger.getLogger(ServiceImpl.class);

    public ServiceImpl() {
    }

    public ServiceImpl(StudentDAO daoStudentController){
        this.daoStudentController = daoStudentController;
    }

    @Override
    @Transactional
    public List<Student> getAllStudents(int position, int length) throws EmptyStudentsTableException {

        // Validation

        List<Student> studentList = daoStudentController.getAll(position,length);

        if (studentList.isEmpty()){
            LOGGER.error("Empty students table");
            throw new EmptyStudentsTableException("There is no students in the table");
        }
        return studentList;
    }

    @Override
    public Student addStudent(Student student) throws FailedAddingStudentException, WrongInputDataException {

        if(student == null){
            LOGGER.error("Wrong input student");
            throw new WrongInputDataException("Fail with input student");
        }

        Student addedStudent = daoStudentController.addInstance(student);

        if (addedStudent == null){
            LOGGER.error("Fail with adding new Student into database");
            throw new FailedAddingStudentException("Fail with adding new Student into database");
        }
        return addedStudent;
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
