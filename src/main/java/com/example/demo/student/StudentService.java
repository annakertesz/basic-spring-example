package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
        System.out.println("fdgd");
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void createStudent() {
        Student student1 = new Student("Julcsu", 13);
        Student student2 = new Student("Pisti", 12);
        studentRepository.saveAll(List.of(student1, student2));
    }
}
