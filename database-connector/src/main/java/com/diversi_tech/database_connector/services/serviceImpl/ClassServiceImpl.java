package com.diversi_tech.database_connector.services.serviceImpl;

import com.diversi_tech.database_connector.dto.ClassCDTO;
import com.diversi_tech.database_connector.entity.ClassC;
import com.diversi_tech.database_connector.mapper.ClassMapper;
import com.diversi_tech.database_connector.repositories.interfaces.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassServiceImpl  extends GenericServiceImpl<ClassC, ClassCDTO, Integer> {

    private final ClassRepository classRepositoryI;
    private final ClassMapper classMapper;

    @Autowired
    public ClassServiceImpl(ClassRepository classRepositoryI, ClassMapper classMapper) {
        super(classRepositoryI,classMapper);
        this.classRepositoryI=classRepositoryI;
        this.classMapper=classMapper;
    }

    public List<ClassCDTO> getAllClassesByCourseId(Integer courseId) {
        return classRepositoryI.findAllByCourseCourseId(courseId).stream()
                .map(classMapper :: toDTO)
                .collect(Collectors.toList());
    }
//
//    @Override
//    // Add a method to save a new student
//    public Class save(Class a_class) {
//        a_class.setCreatedAt(new Timestamp(System.currentTimeMillis()));
//        a_class.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
//        return (Class) gClassRepository.save(a_class);
//    }
//    @Override
//    // Add a method to update an existing student
//    public Class update(Class a_class) {
//        a_class.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
//        return (Class) gClassRepository.update(a_class);
//    }
}
