package com.example.springBoot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Students> getStudents(){
        return studentRepository.findAll();
    }


    public void addNewStudent(Students student) {
        studentRepository.save(student);
    }

    public void deleteAStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}


