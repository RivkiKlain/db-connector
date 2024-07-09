package com.diversi_tech.database_connector.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "course_documents")
@Data
public class CourseDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private Integer documentId;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Course course;

    @Column(name = "document_name", nullable = false, length = 225)
    private String documentName;

    @Column(name = "document_type", nullable = false, length = 225)
    private String documentType;

    @Column(name = "document_url", nullable = false, length = 225)
    private String documentUrl;

    @Column(name = "uploaded_at", nullable = false, columnDefinition = "timestamp default current_timestamp")
    private Timestamp uploadedAt;

}