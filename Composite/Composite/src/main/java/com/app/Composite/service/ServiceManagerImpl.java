package com.app.Composite.service;

import java.util.List;

import com.app.Composite.Repository.StudRepo;
import com.app.Composite.entity.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceManagerImpl {

        @Autowired
        private StudRepo srepo;

        public Student saveStudent(Student student)
        {
            return srepo.save(student);
        }
        public List<Student> saveStudents(List<Student> student) {
            return srepo.saveAll(student);
        }
    
        public List<Student> getStudents() 
        {
            return srepo.findAll();
        }
}
