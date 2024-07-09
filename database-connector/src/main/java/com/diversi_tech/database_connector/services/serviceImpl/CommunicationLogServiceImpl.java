package com.diversi_tech.database_connector.services.serviceImpl;

import com.diversi_tech.database_connector.dto.AttendanceDTO;
import com.diversi_tech.database_connector.dto.CommunicationLogDTO;
import com.diversi_tech.database_connector.entity.CommunicationLog;
import com.diversi_tech.database_connector.mapper.CommunicationLogMapper;
import com.diversi_tech.database_connector.repositories.interfaces.CommunicationLogRepository;
import com.diversi_tech.database_connector.repositories.repositoryImpl.GenericRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommunicationLogServiceImpl extends GenericServiceImpl<CommunicationLog, CommunicationLogDTO ,Integer> {
    private final CommunicationLogRepository communicationLogRepository;
    private final CommunicationLogMapper communicationLogMapper;
    @Autowired
    public CommunicationLogServiceImpl(CommunicationLogRepository communicationLogRepository,CommunicationLogMapper communicationLogMapper) {
        super(communicationLogRepository,communicationLogMapper);
        this.communicationLogRepository = communicationLogRepository;
        this.communicationLogMapper=communicationLogMapper;
    }

    public List<CommunicationLogDTO> getAllCommunicationLogByStudentId(String studentId) {
        return communicationLogRepository.findByStudentStudentId(studentId).stream()
                .map(communicationLogMapper::toDTO)
                .collect(Collectors.toList());
    }
}
