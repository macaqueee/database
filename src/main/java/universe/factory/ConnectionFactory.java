package universe.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by macaque on 05.10.2016.
 */
// DataSource Mysql

    @Component
public class ConnectionFactory {

    // getResource from the classpath
    //private static final String DATABASE_PROPERTIES_NAME = "database.properties";
    private static String url;
    private static String user;
    private static String password;

    @Autowired
    private static Connection connection;
    private static boolean isGenereted = false;


    private ConnectionFactory(){

    }

    public static Connection newInstance(String propertiesPath) throws SQLException {
        // only one type, singleton design pattern
        setUp(propertiesPath);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (isGenereted){
            return connection;
        }

        connection = DriverManager.getConnection(url,user,password);
        isGenereted = true;
        return connection;


    }

    public static void setUp(String propertiesPath){

        Properties properties = new Properties();
        try {
            properties.load(ConnectionFactory.class.getClassLoader().getResourceAsStream(propertiesPath));
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
