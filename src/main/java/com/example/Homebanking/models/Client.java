package com.example.Homebanking.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    private String id;
    private String name;
    private String lastName;
    private String email;

    public Client() { }

    public Client(String id,String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
