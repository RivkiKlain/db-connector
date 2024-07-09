package com.diversi_tech.database_connector.services.serviceImpl;

import com.diversi_tech.database_connector.dto.StudentDTO;
import com.diversi_tech.database_connector.entity.*;
import com.diversi_tech.database_connector.mapper.StudentMapper;
import com.diversi_tech.database_connector.repositories.interfaces.StudentCourseRepository;
import com.diversi_tech.database_connector.repositories.interfaces.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
//import org.modelmapper.ModelMapper;

@Service
public class StudentServiceImpl extends GenericServiceImpl<Student,StudentDTO, String> {

    private final StudentRepository studentRepository;
    private final StudentCourseRepository studentCourseRepository;
    private final StudentMapper studentMapper;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, StudentCourseRepository studentCourseRepository,StudentMapper studentMapper) {
        super(studentRepository,studentMapper);
        this.studentRepository = studentRepository;
        this.studentCourseRepository = studentCourseRepository;
        this.studentMapper = studentMapper;
    }

    public List<StudentDTO> getStudentsByCourseId(Integer courseId) {
        List<StudentCourse> studentCourses = studentCourseRepository.findAllByCourse_CourseId(courseId);
        return   studentCourses.stream()
                .map(StudentCourse::getStudent)
                .map(studentMapper::toDTO)
                .collect(Collectors.toList());
    }

//    @Transactional
//    public StudentDTO updateStudent(StudentDTO studentDTO) {
//        Student student = studentMapper.toEntity(studentDTO);
//        Student updatedStudent = super.update(student);
//        return studentMapper.toDTO(updatedStudent);
//    }



//    @Override
//    public Student save(Student student) {
//        student.setCreatedAt(new Timestamp(System.currentTimeMillis()));
//        student.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
//        return studentRepository.save(student);
//    }
//
//@Override
//    // Add a method to update an existing student
//    public Student update(Student student) {
//        student.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
//        return (Student) studentRepository.update(student);
//    }
//    // Add a method to get all students by status
//    public List<Student> getStudentsByStatus(Student.Status status) {
//        return studentRepository.findByStatus(status);
//    }


//    public List<Student> getByObject(StudentSearch studentSearchObj) {
//        if (studentSearchObj.id != null)
//            return (List<Student>) studentRepository.findById(studentSearchObj.id).orElse(null);
//        else if (studentSearchObj.first_name != null && studentSearchObj.last_name != null)
//            return (List<Student>) studentRepository.findAllByfirstName(studentSearchObj.first_name).
//                    stream()<Student>.filter(val -> val.last_name).toList();
//
//        return (List<Student>) null;
//    }

//    public List<Student> findAllStudentsByClassId(Integer classId) {
//       // return studentRepository.findAllByClass_ClassId(classId);
//        return studentRepository.findAllByAttendances_ClassEntity_ClassId(classId);
//
//    }

}