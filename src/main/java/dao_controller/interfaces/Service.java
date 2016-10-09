package dao_controller.interfaces;

import model.Group;
import model.Lector;
import model.Student;
import model.Subject;

import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */
public interface Service {

    List<Student> getAllStudents();
    List<Subject> getAllSubjects();
    List<Lector> getAllLectors();
    List<Group> getAllGroups();

    Student addStudent(Student student);
    Group addGroup(Group group);
    Lector addLector(Lector lector);
    Subject addSubject(Subject subject);

    Student updateStudent(Student student);

    List<Group> getGroupById(int id);
    List<Group> getMathGroup();

    List<Lector> getMinMaxExpLectors();



}
