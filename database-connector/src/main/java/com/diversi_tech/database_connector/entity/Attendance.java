package com.diversi_tech.database_connector.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;
@Entity
@Table(name="attendance")
@Data
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private Integer attendanceId;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "class_id", referencedColumnName = "class_id")
    private ClassC classEntity;

    @Column(name = "class_date")
    private Date classDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private AttendanceStatus status;

    @ManyToOne
    @JoinColumn(name = "marked_by", referencedColumnName = "user_id")
    private User markedBy;

    @Column(name = "marked_at", nullable = false, columnDefinition = "timestamp default current_timestamp")
    private Timestamp markedAt;

}
