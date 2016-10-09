import dao_controller.controller.StudentDAOImpl;
import dao_controller.interfaces.StudentDAO;
import model.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */
public class TestStudentDAOImpl {

    @Before


    @Test
    public void checkSelect(){
        List<Student> expectedList = null;
        int expectedCount = 20;
        int actualCount = 0;
        StudentDAO studentDAO = new StudentDAOImpl();
        List<Student> actualList = studentDAO.getAll();
        for (Student student : actualList) {
            actualCount++;
        }
        Assert.assertNotEquals(expectedList,actualList);
        Assert.assertEquals(expectedCount,actualCount);
    }
}
