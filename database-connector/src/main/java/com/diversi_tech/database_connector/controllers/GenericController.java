package com.diversi_tech.database_connector.controllers;

import com.diversi_tech.database_connector.services.serviceImpl.GenericServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

public abstract class GenericController <T,D, ID extends Serializable> {

    protected final GenericServiceImpl<T,D, ID> crudService;

    public GenericController(GenericServiceImpl<T,D, ID> crudService) {
        this.crudService = crudService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<D>> getAll() {
        List<D> dtos = crudService.findAll();
        return ResponseEntity.ok(dtos);
    }

    @GetMapping("/byId/{id}")
    public ResponseEntity<D> getById(@PathVariable ID id) {
        D foundById = crudService.findById(id);
        return ResponseEntity.ok(foundById);
    }



    @PostMapping
    public ResponseEntity<D> create(@RequestBody D entity) {
        D createdEntity = crudService.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ID id) {
        crudService.deleteAllById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update")
    public ResponseEntity<D> update(@RequestBody D entity) {
        D newEntity = crudService.update(entity);
        return ResponseEntity.ok(newEntity);
    }
}
