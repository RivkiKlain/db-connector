package com.diversi_tech.database_connector.mapper;

import com.diversi_tech.database_connector.dto.UserDTO;
import com.diversi_tech.database_connector.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends GenericMapper<User, UserDTO> {
}
