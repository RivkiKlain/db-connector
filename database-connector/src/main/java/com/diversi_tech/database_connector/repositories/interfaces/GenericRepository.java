package com.diversi_tech.database_connector.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@NoRepositoryBean
public interface GenericRepository <T, ID extends Serializable> extends JpaRepository<T, ID> {
    T update(T entity);
    //Since JpaRepository already provides basic CRUD methods,
    //save(S entity): Saves a given entity.
    //saveAll(Iterable<S> entities): Saves all given entities.
    //findById(ID id): Retrieves an entity by its id.
    //existsById(ID id): Checks whether an entity with the given id exists.
    //findAll(): Returns all entities.
    //findAllById(Iterable<ID> ids): Returns all entities with the given IDs.
    //count(): Returns the number of entities.
    //deleteById(ID id): Deletes the entity with the given id.
    //delete(T entity): Deletes a given entity.
    //deleteAllById(Iterable<? extends ID> ids): Deletes all entities with the given IDs.
    //deleteAll(Iterable<? extends T> entities): Deletes all given entities.
    //deleteAll(): Deletes all entities.

}
