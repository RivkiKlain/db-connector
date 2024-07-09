package com.diversi_tech.database_connector.controllers;

import com.diversi_tech.database_connector.dto.StudentDTO;
import com.diversi_tech.database_connector.entity.CourseDocument;
import com.diversi_tech.database_connector.entity.Student;
import com.diversi_tech.database_connector.services.serviceImpl.GenericServiceImpl;
import com.diversi_tech.database_connector.services.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController extends GenericController<Student, StudentDTO, String> {

    private  StudentServiceImpl studentService;

    @Autowired
    public StudentController(StudentServiceImpl studentService) {
        super(studentService);
        this.studentService = studentService;
    }

//    @GetMapping("/getAllByClassId/{classId}")
//    public ResponseEntity<List<Student>> getAllStudentByCourseId(@PathVariable Integer classId) {
//        List<Student> documents = studentServiceImpl.findAllStudentsByClassId(classId);
//        return ResponseEntity.ok(documents);
//    }

    @GetMapping("/students/by-course/{courseId}")
    public List<StudentDTO> getStudentsByCourse(@PathVariable Integer courseId) {
        return studentService.getStudentsByCourseId(courseId);
    }
}

