package com.diversi_tech.database_connector.dto;

import com.diversi_tech.database_connector.entity.StudentCourseStatus;
import lombok.Data;

import java.sql.Date;


@Data
public class StudentCourseDTO {
    private Integer studentCourseId;
    private String studentId;
    private int courseId;
    private Date enrollmentDate;
    private StudentCourseStatus status;
    private int participationScore;

}
