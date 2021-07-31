package com.app.Composite.Repository;

import com.app.Composite.entity.Student;
import com.app.Composite.entity.StudentPK;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudRepo extends JpaRepository<Student,StudentPK>{
    
}
