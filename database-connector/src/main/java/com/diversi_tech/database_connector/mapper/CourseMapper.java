package com.diversi_tech.database_connector.mapper;

import com.diversi_tech.database_connector.dto.CourseDTO;
import com.diversi_tech.database_connector.entity.Course;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface CourseMapper extends GenericMapper<Course, CourseDTO>{
}
