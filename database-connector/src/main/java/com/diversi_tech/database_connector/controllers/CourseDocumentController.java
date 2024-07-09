package com.diversi_tech.database_connector.controllers;

import com.diversi_tech.database_connector.dto.CommunicationLogDTO;
import com.diversi_tech.database_connector.dto.CourseDocumentDTO;
import com.diversi_tech.database_connector.entity.CommunicationLog;
import com.diversi_tech.database_connector.entity.CourseDocument;
import com.diversi_tech.database_connector.services.serviceImpl.CourseDocumentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courseDocuments")
public class CourseDocumentController extends GenericController<CourseDocument, CourseDocumentDTO,Integer> {

    @Autowired
    private CourseDocumentServiceImpl courseDocumentService;

    @Autowired
    public CourseDocumentController(CourseDocumentServiceImpl courseDocumentService) {
        super(courseDocumentService);
        this.courseDocumentService = courseDocumentService;
    }

    @GetMapping("/getAllByCourseId/{courseId}")
    public ResponseEntity<List<CourseDocumentDTO>> getAllDocByCourseId(@PathVariable Integer courseId) {
        List<CourseDocumentDTO> documents = courseDocumentService.getAllDocumentsByCourseId(courseId);
        return ResponseEntity.ok(documents);
    }
    @DeleteMapping("/deleteByCourseId/{courseId}")
    public ResponseEntity<String> deleteDocumentsByCourseId(@PathVariable Integer courseId) {
        boolean isDeleted = courseDocumentService.deleteDocumentsByCourseId(courseId);
        if (isDeleted) {
            return new ResponseEntity<>("Documents deleted successfully.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Failed to delete documents.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
