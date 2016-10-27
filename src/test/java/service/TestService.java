package service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import universe.exceptions.EmptyStudentsTableException;
import universe.exceptions.FailedAddingStudentException;
import universe.model.Group;
import universe.model.Student;
import universe.service.Service;

/**
 * Created by macaque on 22.10.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =  {"classpath:app-context.xml"})
public class TestService {

    @Autowired
    private Service service;


    @Test
    public void getAllStudents() throws EmptyStudentsTableException {
        Assert.assertNotNull(service.getAllStudents(0,3));
    }

    @Test
    public void addStudent() throws FailedAddingStudentException {
        Group group = new Group("European");
        group.setId(2);
        Assert.assertNotNull(service.addStudent(new Student("Test service student",group)));
    }

}
