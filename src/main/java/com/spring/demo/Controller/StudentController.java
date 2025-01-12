package com.spring.demo.Controller;

import com.spring.demo.Model.Student;
import com.spring.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/students")
    public List<Student> StudentsList(){
        return service.GetStudentsList();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @PostMapping("/student")
    public void AddStudent(@RequestBody Student student){
        service.AddStudent(student);
    }

    @PutMapping("/student")
    public void UpdateStudent(@RequestBody Student student){
        System.out.println(student.getStudentId());
      service.UpdateStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void DeleteStudent(@PathVariable int id){
       service.DeleteStudent(id);
    }



}
