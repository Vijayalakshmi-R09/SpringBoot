package com.app.RestDelValidationExcep.Vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class Student {

    @NotNull(message = "Id field is required")
    private int id;
    
    @NotBlank(message ="Name field is required")
    private String name;

    @NotNull(message = "Age field is required")
    private int age;

    @NotBlank(message = "Dept field is required")
    private String dept;


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

    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", dept=" + dept + ", id=" + id + ", name=" + name + "]";
    }
}
