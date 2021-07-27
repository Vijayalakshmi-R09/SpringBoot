package com.app.RestDelValidationExcep.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.app.RestDelValidationExcep.Vo.Student;

import org.springframework.stereotype.Service;

@Service
public class StudentManagerImpl implements StudentManager 
{
    List<Student> mystud=new ArrayList<>();
    
    @Override
    public void persitStudent(Student stud) {
        mystud.add(stud);
    }

    @Override
	public List<Student> fetchAllStudents() 
	 {
		if(mystud.isEmpty())
		{
			throw new RuntimeException();
		}
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

