package com.diversi_tech.database_connector.controllers;

import com.diversi_tech.database_connector.dto.StudentCourseDTO;
import com.diversi_tech.database_connector.entity.StudentCourse;
import com.diversi_tech.database_connector.services.serviceImpl.StudentCourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student-course")
public class StudentCourseController extends GenericController<StudentCourse, StudentCourseDTO, Integer> {

    private final StudentCourseServiceImpl studentService;

    @Autowired
    public StudentCourseController(StudentCourseServiceImpl studentService) {
        super(studentService);
        this.studentService = studentService;
    }
}
