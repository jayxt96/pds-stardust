package pds.stardust.scaccount.entity;

import org.springframework.data.annotation.Id;

public class CustomerEntity {

    @Id
    private int id;
    private String name;
    private String surname;
    private String image;
    private String username;
    private String password;

    public CustomerEntity(int id, String name, String surname, String image, String username, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.image = image;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", image='" + image + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
}