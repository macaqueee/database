package universe.run;

import universe.dao.interfaces.StudentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import universe.model.Group;
import universe.model.Student;

/**
 * Created by macaque on 05.10.2016.
 */
public class Run {

    private static final String URL = "jdbc:mysql://localhost/artcode_junit?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "QWEasd123";
    private static final String DUMP_NAME = "/dumpfile.sql";

    private static final String databasePropertyPath = "database.properties";



    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        StudentDAO studentDAO = context.getBean(StudentDAO.class);
        Group group = new Group("European");
        Student student = new Student("Test Student",group);
        studentDAO.addInstance(student);


    }

}
