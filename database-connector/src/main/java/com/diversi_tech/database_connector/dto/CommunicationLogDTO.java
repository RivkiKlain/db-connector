package com.diversi_tech.database_connector.dto;

import lombok.Data;

import java.sql.Timestamp;


@Data
public class CommunicationLogDTO {
    private Integer logId;
    private String studentId;
    private Timestamp communicationDate;
    private String notes;
}
