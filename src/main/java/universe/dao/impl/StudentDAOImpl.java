package universe.dao.impl;

import org.springframework.transaction.annotation.Transactional;
import universe.dao.interfaces.StudentDAO;
import universe.model.Group;
import universe.model.Student;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */
@Component
public class StudentDAOImpl implements StudentDAO {

    private String propertiesPath;
    private static final Logger LOGGER = Logger.getLogger(StudentDAOImpl.class);

    @PersistenceContext
    private EntityManager entityManager;


    public StudentDAOImpl() {
    }


    public StudentDAOImpl(String propertiesPath) {
        this.propertiesPath = propertiesPath;
    }

    @Override
    @Transactional
    public List<Student> getStudentGroup(Group group) {
        List<Student> students = entityManager.createQuery("SELECT s FROM Student s WHERE s.group LIKE :group")
                .setParameter("group", group).getResultList();
        return students;
    }

    @Override
    @Transactional
    public List<Student> getAll(int position, int offset) {
        TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s", Student.class);
        query.setMaxResults(offset);
        query.setFirstResult(position);
        return query.getResultList();
    }

    @Override
    @Transactional
    public Student addInstance(Student student) {

        Group group = entityManager.find(Group.class, student.getGroup().getId());
        if (group != null){
            student.setGroup(group);
        }
        entityManager.persist(student);
        return student;
    }


    @Override
    @Transactional
    public double getAvgStudentMark() {
        return 0;
    }

    @Override
    @Transactional
    public double getAvgStudentMark(int id) {
        return 0;
    }

    @Override
    @Transactional
    public Student findInstance(Student student){
        student = entityManager.find(Student.class, student);
        return student;
    }

        @Override
        @Transactional
    public Student updateInstance(Student student) {
        return null;
    }

    @Override
    @Transactional
    public Student deleteInstance(Student student) {
        entityManager.remove(student);
        return null;
    }
}
