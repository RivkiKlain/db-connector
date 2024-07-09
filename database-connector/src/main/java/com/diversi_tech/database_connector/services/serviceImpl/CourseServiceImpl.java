package com.diversi_tech.database_connector.services.serviceImpl;

import com.diversi_tech.database_connector.dto.CourseDTO;
import com.diversi_tech.database_connector.entity.Course;
import com.diversi_tech.database_connector.mapper.CourseMapper;
import com.diversi_tech.database_connector.repositories.interfaces.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseServiceImpl  extends GenericServiceImpl<Course, CourseDTO, Integer> {

    private final CourseRepository courseRepository;
    private final CourseMapper mapper;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository,CourseMapper mapper) {
        super(courseRepository,mapper);
        this.courseRepository = courseRepository;
        this.mapper=mapper;
    }
//
////    @Override
////    // Add a method to save a new student
////    public Course save(Course course) {
////        course.setCreatedAt(new Timestamp(System.currentTimeMillis()));
////        course.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
////        return (Course) courseRepository.save(course);
////    }
}