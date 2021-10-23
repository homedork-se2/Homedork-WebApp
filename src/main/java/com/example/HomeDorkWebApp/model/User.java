package com.example.HomeDorkWebApp.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;
    public String email;
    public String uuid;


    public User(String name, String email, String uuid) {
        this.name = name;
        this.email = email;
        this.uuid = uuid;
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

    public String getUuid() {
        return uuid;
    }

}