package universe.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by macaque on 05.10.2016.
 */
@Entity
@Table(name = "groups")
public class Group extends IdEntity{

    @Column(nullable = false)
    private String name;

    @OneToMany (mappedBy = "group" ,fetch = FetchType.EAGER )
    private List<Student> studentList;

    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
