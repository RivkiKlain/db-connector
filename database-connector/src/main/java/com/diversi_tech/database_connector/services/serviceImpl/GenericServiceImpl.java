package com.diversi_tech.database_connector.services.serviceImpl;

import com.diversi_tech.database_connector.mapper.GenericMapper;
import com.diversi_tech.database_connector.repositories.interfaces.GenericRepository;
import com.diversi_tech.database_connector.repositories.repositoryImpl.GenericRepositoryImpl;
import com.diversi_tech.database_connector.services.interfaces.GenericService;


import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

//public abstract class GenericServiceImpl <T, ID extends Serializable> implements GenericService<T,ID> {
public abstract class GenericServiceImpl<T, D, ID extends Serializable> implements GenericService<D, ID> {

//
//
//    private final GenericRepository<T, ID> genericRepository;
//
//    protected GenericServiceImpl(GenericRepository<T, ID> genericRepository) {
//        this.genericRepository = genericRepository;
//    }
//
//    @Override
//    public T save(T entity) {
//        return genericRepository.save(entity);
//    }
//
//    @Override
//    public T update(T entity) {
//        return genericRepository.update(entity);
//    }
//
//    @Override
//    public List<T> saveAll(Iterable<T> entities) {
//        return genericRepository.saveAll(entities);
//    }
//
//    @Override
//    public T findById(ID id) {
//        return genericRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public List<T> findAll() {
//        return genericRepository.findAll();
//    }
//
//    @Override
//    public void deleteAllById(ID id) {
//        genericRepository.deleteAllById((Iterable<? extends ID>) id);
//    }
//
//    @Override
//    public void delete(T entity) {
//        genericRepository.delete(entity);
//    }
//
//    @Override
//    public void deleteAll(Iterable<T> entities) {
//        genericRepository.deleteAll(entities);
//    }
//
//    @Override
//    public void deleteAll() {
//        genericRepository.deleteAll();
//    }

    private final GenericRepository<T, ID> genericRepository;
    private final GenericMapper<T, D> mapper;

    protected GenericServiceImpl(GenericRepository<T, ID> genericRepository, GenericMapper<T, D> mapper) {
        this.genericRepository = genericRepository;
        this.mapper = mapper;
    }

    @Override
    public D save(D dto) {
        T entity = mapper.toEntity(dto);
        T savedEntity = genericRepository.save(entity);
        return mapper.toDTO(savedEntity);
    }

    @Override
    public D update(D dto) {
        T entity = mapper.toEntity(dto);
        T updatedEntity = genericRepository.update(entity);
        return mapper.toDTO(updatedEntity);
    }

    @Override
    public List<D> saveAll(Iterable<D> dtos) {
        List<T> entities = StreamSupport.stream(dtos.spliterator(), false)
                .map(mapper::toEntity)
                .collect(Collectors.toList());
        List<T> savedEntities = genericRepository.saveAll(entities);
        return savedEntities.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public D findById(ID id) {
        return genericRepository.findById(id)
                .map(mapper::toDTO)
                .orElse(null);
    }

    @Override
    public List<D> findAll() {
        List<T> entities = genericRepository.findAll();
        return entities.stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteAllById(ID id) {
        genericRepository.deleteAllById((Iterable<? extends ID>)id);
    }

    @Override
    public void delete(D dto) {
        T entity = mapper.toEntity(dto);
        genericRepository.delete(entity);
    }

    @Override
    public void deleteAll(Iterable<D> dtos) {
        List<T> entities = StreamSupport.stream(dtos.spliterator(), false)
                .map(mapper::toEntity)
                .collect(Collectors.toList());
        genericRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        genericRepository.deleteAll();
    }

}
