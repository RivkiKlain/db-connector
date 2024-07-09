package com.diversi_tech.database_connector.repositories.interfaces;

import com.diversi_tech.database_connector.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends GenericRepository<Student, String>{
  //  List<Student> findAllByClass_ClassId(Integer classId);
//  List<Student> findAllByAttendances_ClassEntity_ClassId(Integer classId);
}
