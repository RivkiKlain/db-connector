package com.diversi_tech.database_connector.dto;

import com.diversi_tech.database_connector.entity.UserRole;
import lombok.Data;


@Data
public class UserRolesDTO {
    private Integer userRoleId;
    private String userId;
    private UserRole role;

}
