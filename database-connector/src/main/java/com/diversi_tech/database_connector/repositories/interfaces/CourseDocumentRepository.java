package com.diversi_tech.database_connector.repositories.interfaces;

import com.diversi_tech.database_connector.entity.CourseDocument;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface CourseDocumentRepository extends GenericRepository<CourseDocument, Integer>{
    List<CourseDocument> findAllByCourse_CourseId(Integer courseId);
    @Transactional
    void deleteByCourse_CourseId(Integer courseId);

}
