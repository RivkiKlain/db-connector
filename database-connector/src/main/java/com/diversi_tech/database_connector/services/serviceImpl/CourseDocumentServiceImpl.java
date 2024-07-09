package com.diversi_tech.database_connector.services.serviceImpl;

import com.diversi_tech.database_connector.dto.CourseDocumentDTO;
import com.diversi_tech.database_connector.entity.CourseDocument;
import com.diversi_tech.database_connector.mapper.CourseDocumentMapper;
import com.diversi_tech.database_connector.mapper.GenericMapper;
import com.diversi_tech.database_connector.repositories.interfaces.CourseDocumentRepository;
//import com.diversi_tech.database_connector.repositories.repositoryImpl.CourseDocumentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CourseDocumentServiceImpl extends GenericServiceImpl<CourseDocument, CourseDocumentDTO ,Integer>{


        private final CourseDocumentRepository courseDocRepository;
        private final CourseDocumentMapper courseDocMapper;

        @Autowired
        public CourseDocumentServiceImpl(CourseDocumentRepository courseDocRepository, CourseDocumentMapper mapper){
                super(courseDocRepository,mapper);
                this.courseDocRepository=courseDocRepository;
                this.courseDocMapper=mapper;
        }

        public List<CourseDocumentDTO> getAllDocumentsByCourseId(Integer courseId){
                return courseDocRepository.findAllByCourse_CourseId(courseId).stream()
                .map(courseDocMapper::toDTO)
                .collect(Collectors.toList());
        }

        public boolean deleteDocumentsByCourseId(Integer courseId){
                try{
                        courseDocRepository.deleteByCourse_CourseId(courseId);
                        return true;
                } catch(Exception err){
                        return false;
                }
        }
}
