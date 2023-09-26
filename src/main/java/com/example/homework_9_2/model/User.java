package com.example.homework_9_2.model;

import com.example.homework_9_2.Authorities;

import java.util.List;
import java.util.Objects;

public class User {
    private String user;
    private String password;
    private List<Authorities> autority;

    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getAutority() {
        return autority;
    }

    public void setAutority(List<Authorities> autority) {
        this.autority = autority;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return Objects.equals(user, user1.user) && Objects.equals(password, user1.password) && Objects.equals(autority, user1.autority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password, autority);
    }
}