package com.diversi_tech.database_connector.repositories.repositoryImpl;

import com.diversi_tech.database_connector.entity.CourseDocument;
import com.diversi_tech.database_connector.entity.Payment;
//import com.diversi_tech.database_connector.repositories.interfaces.PaymentRepository;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
//
//public class PaymentRepositoryImpl extends GenericRepositoryImpl<Payment, Integer> implements PaymentRepository {
//
//    public PaymentRepositoryImpl(Class<Payment> domainClass, EntityManager entityManager) {
//        super(domainClass, entityManager);
//
//    }
//
//
//    private PaymentRepository IPayment;
//
//    @Override
//    @Query("SELECT * as p FROM Payment WHERE p.studentId=:studentID")
//    public List<Payment> findBystudentId(Integer studentID) {
//        return IPayment.findBystudentId(studentID);
//    }
//}
