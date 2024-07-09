package com.diversi_tech.database_connector.mapper;

import com.diversi_tech.database_connector.dto.StudentDTO;
import com.diversi_tech.database_connector.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper extends GenericMapper<Student,StudentDTO> {
//    StudentDTO toDTO(Student student);
//    Student toEntity(StudentDTO dto);
}
