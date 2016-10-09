package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by macaque on 05.10.2016.
 */
// DataSource Mysql
public class ConnectionFactory {

    // getResource from the classpath
    public static final String DATABASE_PROPERTIES_NAME = "database.properties";
    private static String url;
    private static String user;
    private static String password;

    public static Connection newInstance(){
        // only one type, singleton design pattern
        setUp();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void setUp(){

        Properties properties = new Properties();
        try {
            properties.load(ConnectionFactory.class.getClassLoader().getResourceAsStream(DATABASE_PROPERTIES_NAME));
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
