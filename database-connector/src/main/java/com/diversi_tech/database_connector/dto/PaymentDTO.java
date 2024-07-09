package com.diversi_tech.database_connector.dto;

import com.diversi_tech.database_connector.entity.PaymentStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;


@Data
public class PaymentDTO {
    private Integer paymentId;
    private String studentId;
    private BigDecimal amount;
    private PaymentStatus status;
    private Date paymentDate;


}
