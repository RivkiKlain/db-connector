package com.diversi_tech.database_connector.repositories.repositoryImpl;

import com.diversi_tech.database_connector.entity.Attendance;
import com.diversi_tech.database_connector.entity.CourseDocument;
import com.diversi_tech.database_connector.repositories.interfaces.AttendanceRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.util.List;

//public class AttendanceRepositoryImpl extends GenericRepositoryImpl<Attendance, Integer> implements AttendanceRepository {
//
//    private final EntityManager entityManager;
//
//    public AttendanceRepositoryImpl(Class<Attendance> domainClass, EntityManager entityManager) {
//        super(domainClass, entityManager);
//        this.entityManager=entityManager;
//    }
//
//    @Override
//    public List<Attendance> findAllAttendanceByStudentId(String studentId) {
//        String jpql = "SELECT a FROM Attendance a WHERE a.student.studentId = :studentId";
//        TypedQuery<Attendance> query = entityManager.createQuery(jpql, Attendance.class);
//        query.setParameter("studentId", studentId);
//        return query.getResultList();
//    }
//
//}
