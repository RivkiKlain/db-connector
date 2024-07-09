package com.diversi_tech.database_connector.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

//@Mapper(componentModel = "spring")
public interface GenericMapper<T, D> {

    D toDTO(T entity);

    T toEntity(D dto);

    void updateEntityFromDto(D dto, @MappingTarget T entity);
}

