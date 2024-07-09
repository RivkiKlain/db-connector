package com.diversi_tech.database_connector.controllers;

import com.diversi_tech.database_connector.dto.PaymentDTO;
import com.diversi_tech.database_connector.entity.Payment;
import com.diversi_tech.database_connector.services.serviceImpl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/payment")
public class PaymentController extends GenericController<Payment,PaymentDTO, Integer> {


    private PaymentServiceImpl paymentService;

    @Autowired
    public PaymentController(PaymentServiceImpl paymentService) {
        super(paymentService);
        this.paymentService = paymentService;
    }

    @GetMapping("/byStudent/{studentId}")
    public ResponseEntity<List<PaymentDTO>> getByStudentId(@PathVariable String studentId) {
        List<PaymentDTO> payments = this.paymentService.getAllPaymentBYStudentId(studentId);
        return ResponseEntity.ok(payments);
    }


}
