package container;

import model.Group;
import model.Lector;
import model.Student;
import model.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macaque on 06.10.2016.
 */
public class Container {

    private List<Student> studentsList = new ArrayList<>();
    private List<Lector> lectorsList= new ArrayList<>();
    private List<Subject> subjectsList = new ArrayList<>();
    private List<Group> groupsList = new ArrayList<>();

    public Container() {
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public List<Lector> getLectorsList() {
        return lectorsList;
    }

    public List<Subject> getSubjectsList() {
        return subjectsList;
    }

    public List<Group> getGroupsList() {
        return groupsList;
    }
}
