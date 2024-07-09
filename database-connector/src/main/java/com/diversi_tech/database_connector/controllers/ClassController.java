package com.diversi_tech.database_connector.controllers;


import com.diversi_tech.database_connector.dto.ClassCDTO;
import com.diversi_tech.database_connector.entity.ClassC;
import com.diversi_tech.database_connector.services.serviceImpl.ClassServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/classes")
public class ClassController extends GenericController<ClassC, ClassCDTO,Integer>{
    private ClassServiceImpl classService;
    @Autowired
    public ClassController(ClassServiceImpl classService) {
        super(classService);
        this.classService = classService;
    }

    @GetMapping("/getAllByCourseId/{courseId}")
    public ResponseEntity<List<ClassCDTO>> getAllClassesByCourseId(@PathVariable Integer courseId) {
        List<ClassCDTO> classes = classService.getAllClassesByCourseId(courseId);
        return ResponseEntity.ok(classes);
    }

}