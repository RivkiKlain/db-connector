package com.diversi_tech.database_connector.repositories.interfaces;
//package com.diversi_tech.database_connector.repositories.interfaces;

import com.diversi_tech.database_connector.entity.ClassC;
import com.diversi_tech.database_connector.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends GenericRepository<User, String> {

    User findByEmail(String email);
//    void deleteByEmail(String email);
}

