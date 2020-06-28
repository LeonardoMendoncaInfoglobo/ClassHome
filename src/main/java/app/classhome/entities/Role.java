package app.classhome.entities;

import java.util.Objects;

public class Role {

    private Long idRole;
    private String description;

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
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
        Role that = (Role) o;
        return Objects.equals(idRole, that.idRole) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRole, description);
    }

    @Override
    public String toString() {
        return "Role{" +
                "idRole=" + idRole +
                ", description='" + description + '\'' +
                '}';
    }
}
