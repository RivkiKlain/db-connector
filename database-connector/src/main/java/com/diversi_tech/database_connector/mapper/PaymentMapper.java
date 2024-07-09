package com.diversi_tech.database_connector.mapper;


import com.diversi_tech.database_connector.dto.PaymentDTO;
import com.diversi_tech.database_connector.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface PaymentMapper extends GenericMapper<Payment, PaymentDTO>{
}
