package universe.rest.endpoint;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import universe.dao.interfaces.StudentDAO;
import universe.dto.StudentDTO;
import universe.exceptions.EmptyStudentsTableException;
import universe.exceptions.FailedAddingStudentException;
import universe.exceptions.WrongInputDataException;
import universe.model.Group;
import universe.model.Lector;
import universe.model.Student;
import universe.model.Subject;
import universe.service.Service;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by macaque on 11.11.2016.
 */
@Path(value = "/endpoint")
public class RestJerseyServiceEndpoint{

    private StudentDAO daoStudentController;

    private static final Logger LOGGER = Logger.getLogger(RestJerseyServiceEndpoint.class);

    public RestJerseyServiceEndpoint() {
    }

    @PostConstruct
    public void init(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-context.xml");
        daoStudentController = applicationContext.getBean(StudentDAO.class);
    }


    @GET
    @Path(value = "/getAll/{position}/{length}")
    @Produces(value = "application/json")
    public List<StudentDTO> getAllStudents(@PathParam("position") int position,@PathParam("length") int length) throws EmptyStudentsTableException {

        List<Student> studentList = daoStudentController.getAll(position,length);

        if (studentList.isEmpty()){
            LOGGER.error("Empty students table");
            throw new EmptyStudentsTableException("There is no students in the table");
        }

        return studentList.stream().map(student -> new StudentDTO(student)).collect(Collectors.toList());
    }



}
