package app.classhome.entities;

import java.util.List;
import java.util.Objects;

public class Teacher extends User {

    private List<Classy> classyList;

    public List<Classy> getClassyList() {
        return classyList;
    }

    public void setClassyList(List<Classy> classyList) {
        this.classyList = classyList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(classyList, teacher.classyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), classyList);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "classyList=" + classyList +
                '}';
    }
}
