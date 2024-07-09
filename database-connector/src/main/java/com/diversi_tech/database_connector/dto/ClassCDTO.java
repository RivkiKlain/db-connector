package com.diversi_tech.database_connector.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;


@Data
public class ClassCDTO {
    private Integer classId;
    private int courseId;
    private String className;
    private String classDescription;
    private Time startTime;
    private Time endTime;
    private Date date;

}
