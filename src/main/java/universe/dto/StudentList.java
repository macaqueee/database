package universe.dto;

import java.util.List;

/**
 * Created by macaque on 12.11.2016.
 */
public class StudentList {

    private List<StudentDTO> studentDTOList;

    public StudentList() {
    }

    public StudentList(List<StudentDTO> studentDTOList) {
        this.studentDTOList = studentDTOList;
    }

    public List<StudentDTO> getStudentDTOList() {
        return studentDTOList;
    }

    public void setStudentDTOList(List<StudentDTO> studentDTOList) {
        this.studentDTOList = studentDTOList;
    }
}

