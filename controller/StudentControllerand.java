package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Students;
import com.student.repo.studentRepo;
import com.student.service.StudentService;

@RestController
@CrossOrigin("*")
public class StudentControllerand {

    @Autowired
    private StudentService service;

    @Autowired
    private studentRepo studentRepo;

    @GetMapping("/students")
    public List<Students> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/student")
    public Students getStudentByRollnum(@RequestParam int rollnum) {
        return service.getStudentByRollnum(rollnum);
    }

    @PostMapping("/save-student")
    public Students saveStudent(@RequestBody Students student) {
        return studentRepo.save(student);
    }
}