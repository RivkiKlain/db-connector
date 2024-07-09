package com.diversi_tech.database_connector.dto;

import com.diversi_tech.database_connector.entity.StudentStatus;
import lombok.Data;


@Data
public class StudentDTO {
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private StudentStatus status;

}
