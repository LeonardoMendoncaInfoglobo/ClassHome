package app.classhome.entities;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class User {

    private Long idUser;
    private List<Role> roleList;
    private String username;
    private String password;
    private String name;
    private Genre genre;
    private Date birth;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(idUser, user.idUser) &&
                Objects.equals(roleList, user.roleList) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(name, user.name) &&
                Objects.equals(genre, user.genre) &&
                Objects.equals(birth, user.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, roleList, username, password, name, genre, birth);
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", roleList=" + roleList +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", birth=" + birth +
                '}';
    }

}
