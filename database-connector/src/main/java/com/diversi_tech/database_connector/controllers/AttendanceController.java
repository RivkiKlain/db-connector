package com.diversi_tech.database_connector.controllers;

import com.diversi_tech.database_connector.dto.AttendanceDTO;
import com.diversi_tech.database_connector.entity.Attendance;
import com.diversi_tech.database_connector.services.serviceImpl.AttendanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/attendance")
public class AttendanceController extends GenericController<Attendance, AttendanceDTO,Integer>{

    private AttendanceServiceImpl attendanceService;
    @Autowired
    public AttendanceController(AttendanceServiceImpl attendanceService) {
        super(attendanceService);
        this.attendanceService = attendanceService;
    }

    @GetMapping("/getAllByStudentId/{studentId}")
    public ResponseEntity<List<AttendanceDTO>> getAttendanceByStudentId(@PathVariable String studentId) {
        List<AttendanceDTO> attendances = attendanceService.getAllAttendanceByStudentId(studentId);
        return ResponseEntity.ok(attendances);
    }
}
