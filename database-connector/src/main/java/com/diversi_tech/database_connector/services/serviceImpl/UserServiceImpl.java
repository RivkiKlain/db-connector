package com.diversi_tech.database_connector.services.serviceImpl;

import com.diversi_tech.database_connector.dto.UserDTO;
import com.diversi_tech.database_connector.entity.User;
import com.diversi_tech.database_connector.mapper.UserMapper;
import com.diversi_tech.database_connector.repositories.interfaces.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User, UserDTO, String> /*implements UserService*/ {


    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        super(userRepository, userMapper);
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public UserDTO findByEmail(String email) {
        return userMapper.toDTO(userRepository.findByEmail(email));
    }

//    public List<UserDTO> getAllUsers() {
//        return userRepository.findAll()
//                .stream()
//                .map(userMapper::toDTO)
//                .collect(Collectors.toList());
//    }
//
//    public User addUser(User user) {
//        return userRepository.save(user);
//    }

    //
//    public User deleteUser(String email) {
//      return   userRepository.deleteByEmail(email);
//    }
    public void deleteUser(String email) {
        User user = userRepository.findByEmail(email);
        if (user != null) {
            userRepository.delete(user);
        } else {
            throw new EntityNotFoundException("User with email " + email + " not found");
        }
    }

    //    public User getUserById(Long Id) {
//        return userRepository.findById(Id);
//    }
//    public User getUserByEmail(String email) {
//        return userRepository.findByEmail(email);
//    }

}
