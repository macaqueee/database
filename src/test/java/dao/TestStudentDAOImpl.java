package dao;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import universe.dao.interfaces.GroupDAO;
import universe.dao.interfaces.StudentDAO;
import universe.model.Group;
import universe.model.Student;
import org.junit.*;

import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =  {"classpath:app-context.xml"})
public class TestStudentDAOImpl {


    @Autowired
    private StudentDAO studentDAO;

    @Autowired
    private GroupDAO groupDAO;

    private static final String DUMP_NAME = "/dumpfile.sql";
    private static final String TEST_DATA_NAME = "/test_data.sql";
    private static final String TEST_DATABASE_PROPERTIES = "test_database.properties";

    /*@BeforeClass
    public static void createDatabase(){

        try(Connection connection = ConnectionFactory.newInstance(TEST_DATABASE_PROPERTIES)) {
            ScriptRunner runner = new ScriptRunner(connection);
            runner.runScript(new InputStreamReader(ClassLoader.class.getResourceAsStream(DUMP_NAME)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } */

    /*@Before
    public void fillUpDatabase(){

        try(Connection connection = ConnectionFactory.newInstance(TEST_DATABASE_PROPERTIES)) {
            ScriptRunner runner = new ScriptRunner(connection);
            runner.runScript(new InputStreamReader(ClassLoader.getSystemClassLoader().getResourceAsStream(TEST_DATA_NAME)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

    @Test
    public void checkSelect(){
        List<Student> actualList = studentDAO.getAll(0,10);
        Assert.assertNotNull(actualList);
    }


    @Test
    public void checkAddInstance(){
        Group group = new Group("European");
        group.setId(2);
        Student expectedStudent = new Student("Test Student",group );
        Student actualStudent = studentDAO.addInstance(expectedStudent);
        Assert.assertEquals(expectedStudent,actualStudent);

    }


    @After
    public void fillUpDatabase(){
        // TODO: Delete all test data or drop all tables
    }
}
