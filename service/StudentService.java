package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Students;
import com.student.repo.studentRepo;

@Service
public class StudentService {

    @Autowired
    private studentRepo studentRepository;

    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    public Students getStudentByRollnum(int rollnum) {
        return studentRepository.findById(rollnum).orElse(null);
    }
}