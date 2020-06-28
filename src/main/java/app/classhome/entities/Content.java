package app.classhome.entities;

import java.util.List;
import java.util.Objects;

public class Content {

    private Long idContent;
    private String title;
    private String description;
    private String urlVideo;
    private List<Question> questionList;

    public Long getIdContent() {
        return idContent;
    }

    public void setIdContent(Long idContent) {
        this.idContent = idContent;
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

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return Objects.equals(idContent, content.idContent) &&
                Objects.equals(title, content.title) &&
                Objects.equals(description, content.description) &&
                Objects.equals(urlVideo, content.urlVideo) &&
                Objects.equals(questionList, content.questionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContent, title, description, urlVideo, questionList);
    }

    @Override
    public String toString() {
        return "Content{" +
                "idContent=" + idContent +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", urlVideo='" + urlVideo + '\'' +
                ", questionList=" + questionList +
                '}';
    }
}
