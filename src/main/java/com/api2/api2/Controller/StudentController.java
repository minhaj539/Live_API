package com.api2.api2.Controller;

import com.api2.api2.Models.Student;
import com.api2.api2.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/get_students")
    public List<Integer> getStudentsByRecentYear(){
        return studentService.getStudentsByRecentYear();
    }
}
