/*
import model.*;
import container.Container;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Logging+
//


//BL -> Dao(interface)
//      UserDao, SubjectDao,
//          create, delete, update, read, + customs methods
//      User create(User user);
//      User delete(int id);
// Dao -> JDBC , User convert(ResultSet)
public class DatabaseControllerImpl  implements DatabaseController {

    // cache
    private Container container;

    private static final int MATH_TABLE_ID = 1;

    private Connection connection = ConnectionFactory.newInstance();

    public DatabaseControllerImpl(Container container) {
        this.container = container;
    }

    @Override
    public List getAll(String table) {
        String query = "SELECT * from " + table;

        if(table.equals("students")){
            try (PreparedStatement ps = connection.prepareStatement(query))
            {
                return getStudentList(ps);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if(table.equals("lectors")){
            try(PreparedStatement ps = connection.prepareStatement(query))
            {
                return getLectorList(ps);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if(table.equals("subjects")){
            try(PreparedStatement ps = connection.prepareStatement(query)){
                return getSubjectList(ps);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if(table.equals("groups")){
            try(PreparedStatement ps = connection.prepareStatement(query)){
                return getGroupList(ps);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private List<Student> getStudentList(PreparedStatement ps) {

        try (ResultSet rs = ps.executeQuery()) {

            while(rs.next()){
                Student student = new Student(rs.getInt(1),rs.getString(2),rs.getInt(3));
                container.getStudentsList().add(student);
            }
            return container.getStudentsList();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    private List<Lector> getLectorList(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                Lector lector = new Lector(rs.getInt(1),rs.getString(2),rs.getInt(3), rs.getInt(4));
                container.getLectorsList().add(lector);
            }
            return container.getLectorsList();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    private List<Subject> getSubjectList(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            while(rs.next()){
                Subject subject = new Subject(rs.getInt(1),rs.getString(2),rs.getString(3));
                container.getSubjectsList().add(subject);
            }
            return container.getSubjectsList();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    private List<Group> getGroupList(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            while(rs.next()){
                Group group = new Group(rs.getInt(1),rs.getString(2));
                container.getGroupsList().add(group);
            }
            return container.getGroupsList();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object getEntityById(Object id) {

        return null;
    }

    @Override
    public Object update(Object entity) {
        return null;
    }

    @Override
    public boolean delete(Object id) {
        return false;
    }

    @Override
    public Object create(Object entity) {
        if (entity.getClass().getName().equals("model.Student")){
            Student student = (Student) entity;
            try (PreparedStatement ps = connection.prepareStatement("INSERT INTO students(id,name,group_id) VALUES (?,?,?)")){
                ps.setInt(1,student.getId());
                ps.setString(2,student.getName());
                ps.setInt(3,student.getGroupId());
                ps.executeUpdate();
                return student;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (entity.getClass().getName().equals("model.Subject")){
            Subject subject = (Subject) entity;
            try (PreparedStatement ps = connection.prepareStatement("INSERT INTO subjects(id,name,description) VALUES (?,?,?)")){
                ps.setInt(1,subject.getId());
                ps.setString(2,subject.getName());
                ps.setString(3,subject.getDescription());
                ps.executeUpdate();
                return subject;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (entity.getClass().getName().equals("model.Lector")){
            Lector lector = (Lector) entity;
            try (PreparedStatement ps = connection.prepareStatement("INSERT INTO lectors(id,name,experience,subject_id) VALUES (?,?,?,?)")){
                ps.setInt(1,lector.getId());
                ps.setString(2,lector.getName());
                ps.setInt(3,lector.getExperience());
                ps.setInt(4,lector.getSubject_id());
                ps.executeUpdate();
                return lector;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (entity.getClass().getName().equals("model.Group")){
            Group group = (Group) entity;
            try (PreparedStatement ps = connection.prepareStatement("INSERT INTO groups(id,name) VALUES (?,?)")){
                ps.setInt(1,group.getId());
                ps.setString(2,group.getName());
                ps.executeUpdate();
                return group;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }


    @Override
    public List<Group> checkMathGroup(){
        List<Group> groupList = new ArrayList<>();
        String query = "SELECT id,name FROM groups a " +
                       "LEFT JOIN studying_process b " +
                       "ON a.id = b.group_id " +
                       "WHERE b.subject_id =" + MATH_TABLE_ID;

        try(PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                Group group = new Group(rs.getInt(1),rs.getString(2));
                groupList.add(group);
            }
            return groupList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closePrepareStatement(PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
*/
