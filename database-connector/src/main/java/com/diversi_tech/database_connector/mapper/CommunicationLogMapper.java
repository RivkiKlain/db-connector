package com.diversi_tech.database_connector.mapper;

import com.diversi_tech.database_connector.dto.CommunicationLogDTO;
import com.diversi_tech.database_connector.entity.CommunicationLog;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface CommunicationLogMapper extends GenericMapper<CommunicationLog, CommunicationLogDTO> {
}
