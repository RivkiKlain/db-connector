package com.diversi_tech.database_connector.repositories.repositoryImpl;

import com.diversi_tech.database_connector.entity.ClassC;
import com.diversi_tech.database_connector.repositories.interfaces.ClassRepository;
import jakarta.persistence.EntityManager;

import java.util.List;
//
//public class ClassRepositoryImpl extends GenericRepositoryImpl<ClassC,Integer> implements ClassRepository {
//
//    private final EntityManager entityManager;
//
//    public ClassRepositoryImpl(Class<ClassC> domainClass, EntityManager entityManager) {
//        super(domainClass, entityManager);
//        this.entityManager = entityManager;
//
//    }
//
//    @Override
//    public List<ClassC> findAllByCourseCourseId(Integer courseId) {
//        return entityManager.createQuery("SELECT c FROM ClassC c WHERE c.course.courseId = :courseId", ClassC.class)
//                .setParameter("courseId", courseId)
//                .getResultList();
//    }
//}