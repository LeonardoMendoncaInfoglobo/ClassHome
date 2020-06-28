package app.classhome.entities;

public class Student extends User {

    private Integer points;

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "points=" + points +
                '}';
    }
}
