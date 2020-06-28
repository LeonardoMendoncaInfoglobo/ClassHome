package app.classhome.entities;

import java.util.List;
import java.util.Objects;

public class Test {

    private Long idTest;
    private String title;
    private List<Question> questionList;
    private Classy classy;
    private Boolean isVisible;

    public Long getIdTest() {
        return idTest;
    }

    public void setIdTest(Long idTest) {
        this.idTest = idTest;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public Classy getClassy() {
        return classy;
    }

    public void setClassy(Classy classy) {
        this.classy = classy;
    }

    public Boolean getVisible() {
        return isVisible;
    }

    public void setVisible(Boolean visible) {
        isVisible = visible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(idTest, test.idTest) &&
                Objects.equals(title, test.title) &&
                Objects.equals(questionList, test.questionList) &&
                Objects.equals(classy, test.classy) &&
                Objects.equals(isVisible, test.isVisible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTest, title, questionList, classy, isVisible);
    }

    @Override
    public String toString() {
        return "Test{" +
                "idTest=" + idTest +
                ", title='" + title + '\'' +
                ", questionList=" + questionList +
                ", classy=" + classy +
                ", isVisible=" + isVisible +
                '}';
    }
}
