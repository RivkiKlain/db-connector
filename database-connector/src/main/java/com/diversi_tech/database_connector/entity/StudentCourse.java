package com.diversi_tech.database_connector.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "student_courses")
@Data
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_course_id")
    private Integer studentCourseId;

    @ManyToOne
    @JoinColumn(name = "Student_id", referencedColumnName = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "Course_id", referencedColumnName = "course_id")
    private Course course;

    @Column(name = "enrollment_date")
    private Date enrollmentDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StudentCourseStatus status;

    @Column(name = "participation_score")
    private Integer participationScore;

    @Column(name = "created_at", updatable = false, nullable = false, columnDefinition = "timestamp default current_timestamp")
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false, columnDefinition = "timestamp default current_timestamp on update current_timestamp")
    private Timestamp updatedAt;


    // Default constructor
    public StudentCourse() {
        // empty constructor
    }

    public Student getStudent() {
        return student;
    }

//    // Constructor with fields
//    public StudentCourse(Student studentId, Course courseId, Date enrollmentDate, StudentCourseStatus status, int participationScore) {
//        this.student = studentId;
//        this.course = courseId;
//        this.enrollmentDate = enrollmentDate;
//        this.status = status;
//        this.participationScore = participationScore;
//        this.createdAt = new Timestamp(System.currentTimeMillis());
//        this.updatedAt = new Timestamp(System.currentTimeMillis());
//    }
//
//    // Other methods as needed

}