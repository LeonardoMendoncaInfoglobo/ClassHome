package app.classhome.entities;

import java.util.List;
import java.util.Objects;

public class Classy {

    private Long idClassy;
    private String name;
    private List<Teacher> teacherList;
    private List<Student> studentList;

    public Long getIdClassy() {
        return idClassy;
    }

    public void setIdClassy(Long idClassy) {
        this.idClassy = idClassy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classy classy = (Classy) o;
        return Objects.equals(idClassy, classy.idClassy) &&
                Objects.equals(name, classy.name) &&
                Objects.equals(teacherList, classy.teacherList) &&
                Objects.equals(studentList, classy.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClassy, name, teacherList, studentList);
    }

    @Override
    public String toString() {
        return "Classy{" +
                "idClassy=" + idClassy +
                ", name='" + name + '\'' +
                ", teacherList=" + teacherList +
                ", studentList=" + studentList +
                '}';
    }
}
