package com.diversi_tech.database_connector.services.serviceImpl;

import com.diversi_tech.database_connector.dto.AttendanceDTO;
import com.diversi_tech.database_connector.entity.Attendance;
import com.diversi_tech.database_connector.mapper.AttendanceMapper;
import com.diversi_tech.database_connector.repositories.interfaces.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AttendanceServiceImpl extends GenericServiceImpl<Attendance, AttendanceDTO, Integer>  {

    private final AttendanceRepository attendanceRepository;
    private final AttendanceMapper attendanceMapper;


    @Autowired
    public AttendanceServiceImpl(AttendanceRepository attendanceRepository,AttendanceMapper attendanceMapper) {
        super(attendanceRepository,attendanceMapper);
        this.attendanceRepository = attendanceRepository;
        this.attendanceMapper=attendanceMapper;
    }

    public List<AttendanceDTO> getAllAttendanceByStudentId(String studentId) {
        return attendanceRepository.findByStudentStudentId(studentId).stream()
                .map(attendanceMapper::toDTO)
                .collect(Collectors.toList());
    }

}
