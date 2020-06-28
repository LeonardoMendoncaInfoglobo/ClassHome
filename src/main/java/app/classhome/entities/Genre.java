package app.classhome.entities;

import java.util.Objects;

public class Genre {

    private Long idGenre;
    private String description;

    public Long getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(Long idGenre) {
        this.idGenre = idGenre;
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
        Genre genre = (Genre) o;
        return Objects.equals(idGenre, genre.idGenre) &&
                Objects.equals(description, genre.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGenre, description);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "idGenre=" + idGenre +
                ", description='" + description + '\'' +
                '}';
    }
}
