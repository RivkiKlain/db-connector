package com.diversi_tech.database_connector.controllers;

import com.diversi_tech.database_connector.dto.CourseDTO;
import com.diversi_tech.database_connector.entity.Course;
import com.diversi_tech.database_connector.services.serviceImpl.CourseServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/course")
public class CourseController extends GenericController<Course, CourseDTO,Integer> {

    private final CourseServiceImpl courseService;

    public CourseController(CourseServiceImpl courseService){
        super(courseService);
        this.courseService=courseService;
    }

}
