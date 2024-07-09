package com.diversi_tech.database_connector.mapper;

import com.diversi_tech.database_connector.dto.AttendanceDTO;
import com.diversi_tech.database_connector.entity.Attendance;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface AttendanceMapper extends GenericMapper<Attendance,AttendanceDTO> {

//    AttendanceDTO toDTO(Attendance entity);
//
//    Attendance toEntity(AttendanceDTO dto);
//
//    void updateEntityFromDTO(AttendanceDTO dto, @MappingTarget Attendance entity);
}

