package com.delete.deleteEx.ApiController;

import java.util.List;

import com.delete.deleteEx.classes.Student;
import com.delete.deleteEx.service.StudentManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyApiController extends BaseApiController {
    
    @Autowired
    public StudentManager service;

    @PostMapping(value = "/students",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> addstudent(@RequestBody Student stud)
    {
        service.persitStudent(stud);
        return new ResponseEntity<List<Student>>(service.fetchAllStudents(),HttpStatus.OK);
    }
    

    @GetMapping(value = "/students",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> getstudent()
    {
        return new ResponseEntity<List<Student>>(service.fetchAllStudents(),HttpStatus.OK);
    }

    @DeleteMapping(value="/students/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> deleteCustomer(@PathVariable Integer id)
    {
         service.deleteStudentById(id);
         System.out.println("Record deleted");
         return new ResponseEntity<Integer>(HttpStatus.OK);
    }
}
