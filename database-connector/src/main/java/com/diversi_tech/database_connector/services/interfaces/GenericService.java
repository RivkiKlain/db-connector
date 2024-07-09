package com.diversi_tech.database_connector.services.interfaces;

import com.diversi_tech.database_connector.services.serviceImpl.GenericServiceImpl;

import java.util.List;
import java.io.Serializable;

public interface GenericService<T,ID> {

    T save(T entity);
    List<T> saveAll(Iterable<T> entities);
    T findById(ID id);
    List<T> findAll();
    void deleteAllById(ID id);
    void delete(T entity);
    void deleteAll(Iterable<T> entities);
    void deleteAll();
    T update(T entity);
}
