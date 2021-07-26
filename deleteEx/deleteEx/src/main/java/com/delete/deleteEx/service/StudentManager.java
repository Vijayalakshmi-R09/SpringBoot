package com.delete.deleteEx.service;

import java.util.List;

import com.delete.deleteEx.classes.Student;

public interface StudentManager 
{
    public void persitStudent(Student stud);

    public List<Student> fetchAllStudents();

    public Student deleteStudentById(int id);
}
