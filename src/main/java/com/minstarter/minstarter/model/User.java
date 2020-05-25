package com.minstarter.minstarter.model;

// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.Table;
import java.util.UUID;

// @Entity
// @Table(name = "users")
public class User {

    // @Id
    private String id;

    private String name;
    private String email;
    // private String password;
    // private String image_url;

    public User() {}

    // Constructor for creat new object
    // public User(String name, String email, String password) {
    //     this.id = this.generateRandomId();
    //     this.name = name;
    //     this.email = email;
    //     this.password = password;
    // }

    // public User(String id, String name, String email, String password) {
    //     this.id = id;
    //     this.name = name;
    //     this.email = email;
    //     this.password = password;
    // }

    public String generateRandomId() {
        return UUID.randomUUID().toString().substring(0, 10);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // public String getPassword() {
    //     return password;
    // }

    // public void setPassword(String password) {
    //     this.password = password;
    // }

    // public String getImage_url() {
    //     return image_url;
    // }

    // public void setImage_url(String image_url) {
    //     this.image_url = image_url;
    // }

    // @Override
    // public String toString() {
    //     return "User [email=" + email + ", id=" + id + ", image_url=" + image_url + ", name=" + name + "]";
    // }

    @Override
    public String toString() {
        return "User [email=" + email + ", id=" + id + ", name=" + name + "]";
    }

        
    
}