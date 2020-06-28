package app.classhome.entities;

import java.util.List;
import java.util.Objects;

public class Question {

    private Long idQuestion;
    private String enunciated;
    private List<Alternative> falseAlternativeList;
    private List<Alternative> trueAlternativeList;
    private String teacherOpinion;
    private Theme theme;

    public Long getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Long idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getEnunciated() {
        return enunciated;
    }

    public void setEnunciated(String enunciated) {
        this.enunciated = enunciated;
    }

    public List<Alternative> getFalseAlternativeList() {
        return falseAlternativeList;
    }

    public void setFalseAlternativeList(List<Alternative> falseAlternativeList) {
        this.falseAlternativeList = falseAlternativeList;
    }

    public List<Alternative> getTrueAlternativeList() {
        return trueAlternativeList;
    }

    public void setTrueAlternativeList(List<Alternative> trueAlternativeList) {
        this.trueAlternativeList = trueAlternativeList;
    }

    public String getTeacherOpinion() {
        return teacherOpinion;
    }

    public void setTeacherOpinion(String teacherOpinion) {
        this.teacherOpinion = teacherOpinion;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(idQuestion, question.idQuestion) &&
                Objects.equals(enunciated, question.enunciated) &&
                Objects.equals(falseAlternativeList, question.falseAlternativeList) &&
                Objects.equals(trueAlternativeList, question.trueAlternativeList) &&
                Objects.equals(teacherOpinion, question.teacherOpinion) &&
                Objects.equals(theme, question.theme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idQuestion, enunciated, falseAlternativeList, trueAlternativeList, teacherOpinion, theme);
    }

    @Override
    public String toString() {
        return "Question{" +
                "idQuestion=" + idQuestion +
                ", enunciated='" + enunciated + '\'' +
                ", falseAlternativeList=" + falseAlternativeList +
                ", trueAlternativeList=" + trueAlternativeList +
                ", teacherOpinion='" + teacherOpinion + '\'' +
                ", theme=" + theme +
                '}';
    }
}
