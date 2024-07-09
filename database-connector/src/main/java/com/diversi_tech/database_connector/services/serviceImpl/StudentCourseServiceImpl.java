package com.diversi_tech.database_connector.services.serviceImpl;

import com.diversi_tech.database_connector.dto.StudentCourseDTO;
import com.diversi_tech.database_connector.entity.StudentCourse;
import com.diversi_tech.database_connector.mapper.StudentCourseMapper;
import com.diversi_tech.database_connector.repositories.interfaces.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//
@Service
public class StudentCourseServiceImpl extends GenericServiceImpl<StudentCourse, StudentCourseDTO, Integer> /*implements UserService*/ {

   private final StudentCourseRepository studentCourseRepository;
   private final StudentCourseMapper mapper;

    @Autowired
    public StudentCourseServiceImpl(StudentCourseRepository studentCourseRepository,StudentCourseMapper mapper) {
        super(studentCourseRepository,mapper);
        this.studentCourseRepository = studentCourseRepository;
        this.mapper=mapper;
    }
////
////@Override
////    // Add a method to save a new student
////    public StudentCourse save(StudentCourse studentCourse) {
////        studentCourse.setCreatedAt(new Timestamp(System.currentTimeMillis()));
////        studentCourse.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
//////        studentCourse.setStatus(StudentCourseStatus.ENROLLED);
//////        studentCourse.setEnrollmentDate();
////        return (StudentCourse) studentCourseRepository.save(studentCourse);
////    }
////    @Override
////    // Add a method to update an existing student
////    public StudentCourse update(StudentCourse student) {
////        student.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
////        return (StudentCourse) studentCourseRepository.update(student);
////    }
////   @Override
////    //to delete
////    public void delete(StudentCourse studentCourse) {
////        studentCourse.setStatus(StudentCourseStatus.DROPPED);
////    }
}