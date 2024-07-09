package com.diversi_tech.database_connector.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "communication_log")
@Data
public class CommunicationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Integer logId;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private Student student;

    @Column(name = "communication_date", columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    private Timestamp communicationDate;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

}
