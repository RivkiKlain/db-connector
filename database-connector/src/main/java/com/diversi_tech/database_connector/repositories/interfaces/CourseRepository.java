package com.diversi_tech.database_connector.repositories.interfaces;

import com.diversi_tech.database_connector.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseRepository extends GenericRepository<Course, Integer> {
}
