package Entity;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teacherList= new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();

    public School(List<Teacher> teacherList, List<Student> studentList) {
        this.teacherList = teacherList;
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
