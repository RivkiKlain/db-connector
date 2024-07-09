package com.diversi_tech.database_connector.repositories.interfaces;

import com.diversi_tech.database_connector.entity.ClassC;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClassRepository extends GenericRepository<ClassC, Integer> {

    List<ClassC> findAllByCourseCourseId(Integer courseId);
}
