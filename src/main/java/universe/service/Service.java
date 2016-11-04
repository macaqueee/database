package universe.service;

import universe.exceptions.EmptyStudentsTableException;
import universe.exceptions.FailedAddingStudentException;
import universe.exceptions.WrongInputDataException;
import universe.model.Group;
import universe.model.Lector;
import universe.model.Student;
import universe.model.Subject;

import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */
public interface Service {

    List<Student> getAllStudents(int offset, int length) throws EmptyStudentsTableException;
    List<Subject> getAllSubjects();
    List<Lector> getAllLectors();
    List<Group> getAllGroups();

    Student addStudent(Student student) throws FailedAddingStudentException, WrongInputDataException;
    Group addGroup(Group group);
    Lector addLector(Lector lector);
    Subject addSubject(Subject subject);

    Student updateStudent(Student student);

    List<Group> getGroupById(int id);
    List<Group> getMathGroup();

    List<Lector> getMinMaxExpLectors();



}
