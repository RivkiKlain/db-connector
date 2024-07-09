package com.diversi_tech.database_connector.mapper;

import com.diversi_tech.database_connector.dto.CourseDocumentDTO;
import com.diversi_tech.database_connector.entity.CourseDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface CourseDocumentMapper extends GenericMapper<CourseDocument, CourseDocumentDTO> {
}