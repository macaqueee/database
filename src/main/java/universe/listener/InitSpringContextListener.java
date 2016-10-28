package universe.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by macaque on 27.10.2016.
 */
@WebListener
public class InitSpringContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        String springLocation = servletContextEvent.getServletContext().getInitParameter("springLocation");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springLocation);
        servletContextEvent.getServletContext().setAttribute("app-context", applicationContext);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
