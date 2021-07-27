package com.app.RestDelValidationExcep.service;

import java.util.List;

import com.app.RestDelValidationExcep.Vo.Student;

public interface StudentManager {
    public void persitStudent(Student stud);

    public List<Student> fetchAllStudents() ;

    public Student deleteStudentById(int id);
}
