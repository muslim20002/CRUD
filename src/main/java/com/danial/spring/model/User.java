package com.danial.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    @NotEmpty(message = "name should not be empty")
    @Size(min = 1, max = 20, message = "Name should be between 1 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "Name must contain only letters")
    private String name;
    @Column(name="surname")
    @NotEmpty(message = "surname should not be empty")
    @Size(min = 1, max = 20, message = "Surname should be between 1 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "Surname must contain only letters")
    private String surname;
    @Column(name="old")
    @Min(value = 1, message = "Age should be greater than 0")
    private int old;

    public User() {}

    public User(String name, String surname, int old) {
        this.name = name;
        this.surname = surname;
        this.old = old;
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

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", old=" + old +
                '}';
    }
}
