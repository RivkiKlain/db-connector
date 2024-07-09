package com.diversi_tech.database_connector.repositories.interfaces;

import com.diversi_tech.database_connector.entity.Attendance;
import com.diversi_tech.database_connector.entity.CommunicationLog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunicationLogRepository extends GenericRepository<CommunicationLog,Integer> {
    List<CommunicationLog> findByStudentStudentId(String studentId);

}
