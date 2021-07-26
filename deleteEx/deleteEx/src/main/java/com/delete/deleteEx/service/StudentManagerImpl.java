package com.delete.deleteEx.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.delete.deleteEx.classes.Student;

import org.springframework.stereotype.Service;

@Service
public class StudentManagerImpl implements StudentManager{

    List<Student> mystud=new ArrayList<>();
    @Override
    public void persitStudent(Student stud) {
        mystud.add(stud);
    }

    @Override
    public List<Student> fetchAllStudents() {
        return mystud;
    }

    @Override
    public Student deleteStudentById(int id) {
        Iterator<Student> iterator=mystud.iterator();
        while(iterator.hasNext())
        {
            Student s=iterator.next();
            if(s.getId()==id)
            {
                iterator.remove();
                return s;
            }
        }
        return null;
    }
    
}
