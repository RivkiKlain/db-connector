package com.diversi_tech.database_connector.repositories.interfaces;

import com.diversi_tech.database_connector.entity.Attendance;
import com.diversi_tech.database_connector.entity.Payment;
import com.diversi_tech.database_connector.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PaymentRepository extends GenericRepository<Payment, Integer> {
    // List<Payment> findByStudentId(String studentID);
    List<Payment> findByStudentStudentId(String studentId);

}
