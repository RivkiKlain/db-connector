package com.diversi_tech.database_connector.controllers;

import com.diversi_tech.database_connector.dto.CommunicationLogDTO;
import com.diversi_tech.database_connector.entity.CommunicationLog;
import com.diversi_tech.database_connector.services.serviceImpl.CommunicationLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/communicationLog")
public class CommunicationLogController extends GenericController<CommunicationLog, CommunicationLogDTO,Integer>{

private CommunicationLogServiceImpl communicationLogService;
@Autowired
public CommunicationLogController(CommunicationLogServiceImpl communicationLogService) {
        super(communicationLogService);
        this.communicationLogService = communicationLogService;
        }

@GetMapping("/getAllByStudentId/{studentId}")
public ResponseEntity<List<CommunicationLogDTO>> getCommunicationLogByStudentId(@PathVariable String studentId) {
        List<CommunicationLogDTO> communicationLogs = communicationLogService.getAllCommunicationLogByStudentId(studentId);
        return ResponseEntity.ok(communicationLogs);
        }
}
