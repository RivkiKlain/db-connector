package com.diversi_tech.database_connector.repositories.repositoryImpl;

import com.diversi_tech.database_connector.entity.ClassC;
import com.diversi_tech.database_connector.entity.Student;
import com.diversi_tech.database_connector.repositories.interfaces.StudentRepository;
import jakarta.persistence.EntityManager;

import java.util.List;

//public class StudentRepositoryImpl extends GenericRepositoryImpl<Student,String> implements StudentRepository {
//
//    private final EntityManager entityManager;
//
//    public StudentRepositoryImpl(Class<Student> domainClass, EntityManager entityManager) {
//        super(domainClass, entityManager);
//        this.entityManager = entityManager;
//
//    }
//
//    @Override
//    public List<Student> findAllByClassId(Integer classId) {
//        return null;
//    }
//}
