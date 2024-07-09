package com.diversi_tech.database_connector.repositories.interfaces;

import com.diversi_tech.database_connector.entity.Student;
import com.diversi_tech.database_connector.entity.StudentCourse;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentCourseRepository extends GenericRepository<StudentCourse, Integer>{
    List<StudentCourse> findAllByCourse_CourseId(Integer courseId);
}
