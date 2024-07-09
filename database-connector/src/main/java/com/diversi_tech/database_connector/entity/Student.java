package com.diversi_tech.database_connector.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
@Entity
@Table(name = "students")
@Data
public class Student {
    @Id
    @Column(name = "student_id", nullable = false, length = 225, unique = true)
    private String studentId;

    @Column(name = "first_name", nullable = false, length = 225)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 225)
    private String lastName;

    @Column(name = "email", nullable = false, length = 225, unique = true)
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StudentStatus status;

    @Column(name = "created_at", updatable = false, nullable = false, columnDefinition = "timestamp default current_timestamp")
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false, columnDefinition = "timestamp default current_timestamp on update current_timestamp")
    private Timestamp updatedAt;

}
