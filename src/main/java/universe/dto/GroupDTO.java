package universe.dto;

/**
 * Created by macaque on 12.11.2016.
 */
public class GroupDTO {

    private int Id;
    private String name;

    private StudentList studentList;

    public GroupDTO() {
    }

    public GroupDTO(int id, String name, StudentList studentList) {
        Id = id;
        this.name = name;
        this.studentList = studentList;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentList getStudentList() {
        return studentList;
    }

    public void setStudentList(StudentList studentList) {
        this.studentList = studentList;
    }
}
