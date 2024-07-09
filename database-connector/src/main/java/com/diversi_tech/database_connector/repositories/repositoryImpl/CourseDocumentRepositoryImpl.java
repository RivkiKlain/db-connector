package com.diversi_tech.database_connector.repositories.repositoryImpl;

import com.diversi_tech.database_connector.entity.CourseDocument;
import com.diversi_tech.database_connector.repositories.interfaces.CourseDocumentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;
//
//public class CourseDocumentRepositoryImpl extends GenericRepositoryImpl<CourseDocument, Integer> implements CourseDocumentRepository {
//
//    private final EntityManager entityManager;
//
//    public CourseDocumentRepositoryImpl(Class<CourseDocument> domainClass, EntityManager entityManager) {
//        super(domainClass, entityManager);
//        this.entityManager = entityManager;
//    }
//
//
//    // JPQL query to find all course documents by course ID
//    @Override
//    public List<CourseDocument> findAllDocumentByCourseId(Integer courseId) {
//        String jpql = "SELECT cd FROM CourseDocument cd WHERE cd.course.courseId = :courseId";
//        TypedQuery<CourseDocument> query = entityManager.createQuery(jpql, CourseDocument.class);
//        query.setParameter("courseId", courseId);
//        return query.getResultList();
//    }
//
//    @Override
//    public void deleteByCourse_CourseId(Integer courseId) {
//
//    }
//}
