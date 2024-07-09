package com.diversi_tech.database_connector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.diversi_tech.database_connector.entity")

public class DatabaseConnectorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseConnectorApplication.class, args);
    }

}
