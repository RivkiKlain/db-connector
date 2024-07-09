package com.diversi_tech.database_connector.mapper;

import com.diversi_tech.database_connector.dto.StudentCourseDTO;
import com.diversi_tech.database_connector.entity.StudentCourse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface StudentCourseMapper extends GenericMapper<StudentCourse, StudentCourseDTO>{
}
