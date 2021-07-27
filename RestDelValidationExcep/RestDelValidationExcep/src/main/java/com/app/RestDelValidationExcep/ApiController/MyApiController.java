package com.app.RestDelValidationExcep.ApiController;

import java.util.List;

import javax.validation.Valid;

import com.app.RestDelValidationExcep.Vo.Student;
import com.app.RestDelValidationExcep.service.StudentManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api")
public class MyApiController extends BaseApiController {
    
    @Autowired
    public StudentManager service;

    @PutMapping(value = "/students",produces = MediaType.APPLICATION_JSON_VALUE) 
    public ResponseEntity<List<Student>> updatestud(@Valid @RequestBody Student stud) throws Exception
    {
        service.persitStudent(stud);
        return new ResponseEntity<List<Student>>(service.fetchAllStudents(),HttpStatus.OK);
    }

    @PostMapping(value = "/students",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> addStud(@Valid @RequestBody Student stud) throws Exception
    {
        service.persitStudent(stud);
        return new ResponseEntity<List<Student>>(service.fetchAllStudents(),HttpStatus.OK);
    }
    

    @GetMapping(value = "/students",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> getstudent() throws Exception
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