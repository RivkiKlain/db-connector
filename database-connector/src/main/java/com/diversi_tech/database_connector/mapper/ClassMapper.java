package com.diversi_tech.database_connector.mapper;

import com.diversi_tech.database_connector.dto.ClassCDTO;
import com.diversi_tech.database_connector.dto.StudentDTO;
import com.diversi_tech.database_connector.entity.ClassC;
import com.diversi_tech.database_connector.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface ClassMapper extends GenericMapper<ClassC, ClassCDTO> {
//    ClassCDTO toDTO(ClassC classC);
//    ClassC toEntity(ClassCDTO dto);
}