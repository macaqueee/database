package universe.dto;

import universe.model.Student;

/**
 * Created by macaque on 12.11.2016.
 */
public class StudentDTO {

    private int Id;
    private String name;
    private String groupName;

    public StudentDTO() {
    }

    public StudentDTO(int id, String name, String groupName) {
        Id = id;
        this.name = name;
        this.groupName = groupName;
    }

    public StudentDTO(Student student) {
        this.Id = student.getId();
        this.name = student.getName();
        this.groupName = student.getGroup().getName();
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
