package com.diversi_tech.database_connector.dto;

import lombok.Data;


@Data
public class UserDTO {
    private String userId;
    private String username;
    private String password;
    private String email;

}
