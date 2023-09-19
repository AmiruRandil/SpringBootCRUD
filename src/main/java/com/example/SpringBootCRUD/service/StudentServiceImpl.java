package com.example.SpringBootCRUD.service;

import com.example.SpringBootCRUD.entity.Student;
import com.example.SpringBootCRUD.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService{

        private final StudentRepository studentRepository;

        /*
         * This service is to add students
         *
         * @param student
         *
         * @return A student object
         */
        @Override
        public Student addStudent(Student student) {
                studentRepository.save(student);
                return student;
        }

        /*
         * This service is to get all students
         *
         * @return A list of Student objects
         */
        @Override
        public List<Student> getAllStudents() {
                return studentRepository.findAll();
        }

        /*
         * This service is to get a student by Id
         *
         * @param studId
         *
         * @return A Student object
         */
        @Override
        public Student getStudent(int studId) {
                return studentRepository.findById(studId).get();
        }

        /*
         * This service is to delete
         *
         * @Param studId
         *
         * @return A ResponseEntity containing a String
         */
        @Override
        public String deleteStudent(int studId) {
                Student student = studentRepository.findById(studId).get();
                if (student != null){
                        studentRepository.delete(student);
                }
                return "Record deleted successfully";
        }

        /*
         * This service is to update existing student records.
         *
         * @param student
         *
         * @return A student object
         */
        @Override
        public Student updateStudent(Student student) {
                studentRepository.save(student);
                return student;
        }
}
