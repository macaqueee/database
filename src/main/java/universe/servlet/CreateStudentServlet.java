package universe.servlet;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import universe.exceptions.FailedAddingStudentException;
import universe.model.Group;
import universe.model.Student;
import universe.service.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/student"})
public class CreateStudentServlet extends HttpServlet{

    private ApplicationContext applicationContext;
    private Service service;


    private static final Logger LOGGER = Logger.getLogger(CreateStudentServlet.class);

    @Override
    public void init() throws ServletException {

        applicationContext = (ApplicationContext) getServletContext().getContext("app-context");
        service = applicationContext.getBean(Service.class);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/create-student.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String groupName = req.getParameter("groupName");

        if(name == null || groupName == null){
            //redirect
            req.setAttribute("errorTitle", "Added failed");
            req.setAttribute("errorMessage", "Invalid student name or group name");
            req.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(req,resp);
            //current location localhost:8080/app/group
            //Absolute path = /http/error.jsp -> localhost:8080/http/error
            //Relative path = http/error.jsp -> localhost:8080/app/http/error.jsp
        }

        Student student = new Student(name,new Group(groupName));
        try {
            Student created = service.addStudent(student);
            req.setAttribute("student", created);
            req.getRequestDispatcher("/WEB-INF/pages/student-info.jsp").forward(req,resp);
        } catch (FailedAddingStudentException e) {
            LOGGER.error(e);
            // forward to error page
        }
    }
}
