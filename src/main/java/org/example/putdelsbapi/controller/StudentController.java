package org.example.putdelsbapi.controller;

import org.example.putdelsbapi.model.Student;
import org.example.putdelsbapi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.putdelsbapi.service.StudentService;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("student")
    public List<Student> getStudent()
    {
        return studentService.getStd();
    }
    @GetMapping("student/{id}")
    public Object getStudentId(@PathVariable int id)
    {
        Student student= studentService.getStdId(id);
        if(student!=null)
        {
            return student;
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("student not found");
        }
    }
    @PostMapping("student")
    public String addStudent(@RequestBody Student student)
    {
        studentService.addStd(student);
        return "Successfully student added";
    }
    @PutMapping("student")
    public String modifyStudent(@RequestBody Student student)
    {
        return studentService.modStud(student);
    }
}
