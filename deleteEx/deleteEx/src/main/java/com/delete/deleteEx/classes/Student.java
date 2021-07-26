package com.delete.deleteEx.classes;


public class Student {

    private int id;
    
    private String name;

    private int age;

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

    @Override
    public String toString() {
        return "Student [age=" + age + ", dept=" + dept + ", id=" + id + ", name=" + name + "]";
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    

   
}
