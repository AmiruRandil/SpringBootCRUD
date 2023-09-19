package com.example.SpringBootCRUD.service;

import com.example.SpringBootCRUD.entity.Student;
import java.util.List;

public interface StudentService {
        Student addStudent(Student student);
        List<Student> getAllStudents();
        Student getStudent(int studId);
        String deleteStudent(int studId);
        Student updateStudent(Student student);


}
