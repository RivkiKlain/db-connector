package com.diversi_tech.database_connector.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false, length = 225, unique = true)
    private String userId;

    @Column(name = "username", nullable = false, length = 225)
    private String username;

    @Column(name = "password", nullable = false, length = 225, unique = true)
    private String password;

    @Column(name = "email", nullable = false, length = 225, unique = true)
    private String email;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "role", nullable = false)
//    private UserRole role;

    @Column(name = "created_at", updatable = false, nullable = false, columnDefinition = "timestamp default current_timestamp")
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false, columnDefinition = "timestamp default current_timestamp on update current_timestamp")
    private Timestamp updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = new Timestamp(System.currentTimeMillis());
        updatedAt = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = new Timestamp(System.currentTimeMillis());
    }
}
