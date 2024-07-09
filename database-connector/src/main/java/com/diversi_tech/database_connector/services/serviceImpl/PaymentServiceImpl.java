package com.diversi_tech.database_connector.services.serviceImpl;

import com.diversi_tech.database_connector.dto.PaymentDTO;
import com.diversi_tech.database_connector.entity.Payment;
import com.diversi_tech.database_connector.mapper.PaymentMapper;
import com.diversi_tech.database_connector.repositories.interfaces.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentServiceImpl extends GenericServiceImpl<Payment, PaymentDTO, Integer> {

    private final PaymentRepository paymentRepository;
    private final PaymentMapper mapper;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository ,PaymentMapper mapper) {
        super(paymentRepository,mapper);
        this.paymentRepository = paymentRepository;
        this.mapper=mapper;
    }
////    @Override
////    // Add a method to save a new student
////    public Payment save(Payment payment) {
////        payment.setCreatedAt(new Timestamp(System.currentTimeMillis()));
////        payment.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
////        return (Payment) paymentRepository.save(payment);
////    }
////    @Override
////    // Add a method to update an existing student
////    public Payment update(Payment payment) {
////        payment.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
////        return (Payment) paymentRepository.update(payment);
////    }

    //Method to get all payment by studentId
    public List<PaymentDTO> getAllPaymentBYStudentId(String studentId){
        return this.paymentRepository.findByStudentStudentId(studentId).stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
}
