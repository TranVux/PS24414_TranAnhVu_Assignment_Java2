package com.assignment.model;

import java.io.Serializable;

public class Staff implements Serializable{
    private String id;
    private String fullName;
    private Integer age;
    private String email;
    private Double salary;
    private String pathImg;

    public Staff(String id, String fullName, Integer age, String email, Double salary, String pathImg) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.salary = salary;
        this.pathImg = pathImg;
    }

    public Staff(String id, String fullName, Integer age, String email, Double salary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.salary = salary;
        this.pathImg = "src\\com\\assignment\\avt\\avtnorNew1.png";
    }
    
    public Staff() {
    }

    public String getPathImg() {
        return pathImg;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
