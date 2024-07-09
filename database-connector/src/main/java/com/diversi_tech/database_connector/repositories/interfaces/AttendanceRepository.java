package com.diversi_tech.database_connector.repositories.interfaces;

import com.diversi_tech.database_connector.entity.Attendance;
import com.diversi_tech.database_connector.entity.CourseDocument;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AttendanceRepository extends GenericRepository<Attendance,Integer> {
    List<Attendance> findByStudentStudentId(String studentId);

}
