package dao_controller.controller;

import dao_controller.interfaces.StudentDAO;
import model.ConnectionFactory;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by macaque on 08.10.2016.
 */
public class StudentDAOImpl implements StudentDAO {

    private Connection connection = ConnectionFactory.newInstance();

    @Override
    public List<Student> getStudentGroup(int id) {
        String query = "SELECT * FROM students WHERE group_id =" + id;
        List<Student> studentList = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getInt(3));
                studentList.add(student);
            }
            return studentList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public double getAvgStudentMark() {
        return 0;
    }

    @Override
    public double getAvgStudentMark(int id) {
        return 0;
    }


    @Override
    public List<Student> getAll() {
        String query = "SELECT id,name,group_id FROM students";
        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            List<Student> studentList = new ArrayList<>();
            while(rs.next()){
                Student student = new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("group_id"));
                studentList.add(student);
            }
            return studentList;
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return null;
    }

        @Override
    public Student updateInstance(Object student) {
        return null;
    }

    @Override
    public Student addInstance(Object entity) {
        Student student = (Student) entity;

        try (PreparedStatement ps = connection.prepareStatement("INSERT INTO students(id,name,group_id) VALUES (?,?,?)")) {
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getGroupId());
            ps.executeUpdate();
            return student;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Student deleteInstance(Object entity) {
        return null;
    }
}
