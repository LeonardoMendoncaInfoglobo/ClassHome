package app.classhome.entities;

import java.util.Objects;

public class Lesson {

    private Long idLesson;
    private String title;
    private String description;
    private Classy classy;
    private Boolean isVisible;
    private Content content;

    public Long getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(Long idLesson) {
        this.idLesson = idLesson;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Objects.equals(idLesson, lesson.idLesson) &&
                Objects.equals(title, lesson.title) &&
                Objects.equals(description, lesson.description) &&
                Objects.equals(classy, lesson.classy) &&
                Objects.equals(isVisible, lesson.isVisible) &&
                Objects.equals(content, lesson.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLesson, title, description, classy, isVisible, content);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "idLesson=" + idLesson +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", classy=" + classy +
                ", isVisible=" + isVisible +
                ", content=" + content +
                '}';
    }
}
