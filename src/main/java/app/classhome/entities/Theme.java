package app.classhome.entities;

import java.util.Objects;

public class Theme {

    private Long idTheme;
    private String description;

    public Long getIdTheme() {
        return idTheme;
    }

    public void setIdTheme(Long idTheme) {
        this.idTheme = idTheme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theme theme = (Theme) o;
        return Objects.equals(idTheme, theme.idTheme) &&
                Objects.equals(description, theme.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTheme, description);
    }

    @Override
    public String toString() {
        return "Theme{" +
                "idTheme=" + idTheme +
                ", description='" + description + '\'' +
                '}';
    }
}
