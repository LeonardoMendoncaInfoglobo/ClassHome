package app.classhome.entities;

import java.util.Objects;

public class Alternative {

    private Long idAlternative;
    private String enunciated;
    private String teacherOpinion;
    private Boolean isEnable;

    public Long getIdAlternative() {
        return idAlternative;
    }

    public void setIdAlternative(Long idAlternative) {
        this.idAlternative = idAlternative;
    }

    public String getEnunciated() {
        return enunciated;
    }

    public void setEnunciated(String enunciated) {
        this.enunciated = enunciated;
    }

    public String getTeacherOpinion() {
        return teacherOpinion;
    }

    public void setTeacherOpinion(String teacherOpinion) {
        this.teacherOpinion = teacherOpinion;
    }

    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alternative that = (Alternative) o;
        return Objects.equals(idAlternative, that.idAlternative) &&
                Objects.equals(enunciated, that.enunciated) &&
                Objects.equals(teacherOpinion, that.teacherOpinion) &&
                Objects.equals(isEnable, that.isEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlternative, enunciated, teacherOpinion, isEnable);
    }

    @Override
    public String toString() {
        return "Alternative{" +
                "idAlternative=" + idAlternative +
                ", enunciated='" + enunciated + '\'' +
                ", teacherOpinion='" + teacherOpinion + '\'' +
                ", isEnable=" + isEnable +
                '}';
    }
}
