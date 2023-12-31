package com.example.SpringBootCRUD.controller;

import com.example.SpringBootCRUD.constant.StringConstantList;
import com.example.SpringBootCRUD.dto.ResponseDTO;
import com.example.SpringBootCRUD.entity.Student;
import com.example.SpringBootCRUD.repository.StudentRepository;
import com.example.SpringBootCRUD.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/student")
public class StudentController {

        private final StudentService studentService;

        /*
         * This API is to check if the service is up and running.
         *
         * @return A ResponseEntity containing a ResponseDTO
         */
        @GetMapping("/health-check")
        public ResponseEntity<ResponseDTO> healthCheck(){
                ResponseDTO responseDTO = new ResponseDTO(null, StringConstantList.HEALTH_CHECK);
                return new ResponseEntity<>(responseDTO, HttpStatus.ACCEPTED);
        }

        /*
         * This API is to add students
         *
         * @param student
         *
         * @return A student object
         */
        @PostMapping("/add-student")
        public Student addStudent(@RequestBody Student student){
                return studentService.addStudent(student);

        }

        /*
         * This API is to get all students
         *
         * @return A list of Student objects
         */
        @GetMapping("/get-all-students")
        public List<Student> getAllStudents(){
                return studentService.getAllStudents();
        }

        /*
         * This API is to get a student by Id
         *
         * @param studId
         *
         * @return A Student object
         */
        @GetMapping("/get-student/{studId}")
        public Student getStudent(@PathVariable int studId){
                return studentService.getStudent(studId);
        }

        /*
         * This API is to delete
         *
         * @Param studId
         *
         * @return A ResponseEntity containing a String
         */
        @DeleteMapping("/delete-student/{studId}")
        public String deleteStudent(@PathVariable int studId){
                return studentService.deleteStudent(studId);
        }

        /*
         * This API is to update existing student records.
         *
         * @param student
         *
         * @return A student object
         */
        @PutMapping("update-student")
        public Student updateStudent(@RequestBody Student student){
                return studentService.updateStudent(student);
        }


}
