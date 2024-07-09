package com.diversi_tech.database_connector.dto;

import com.diversi_tech.database_connector.entity.AttendanceStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;



@Data
public class AttendanceDTO {
    private Integer attendanceId;
    private String studentId;
    private int classId;
    private Date classDate;
    private AttendanceStatus status;
    private String markedById;

}
