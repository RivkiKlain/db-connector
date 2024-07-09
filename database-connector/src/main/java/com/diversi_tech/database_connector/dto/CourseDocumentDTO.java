package com.diversi_tech.database_connector.dto;

import lombok.Data;


@Data
public class CourseDocumentDTO {
    private Integer documentId;
    private int courseId;
    private String documentName;
    private String documentType;
    private String documentUrl;

}
