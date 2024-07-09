package com.diversi_tech.database_connector.controllers;

import com.diversi_tech.database_connector.dto.UserDTO;
import com.diversi_tech.database_connector.entity.User;
import com.diversi_tech.database_connector.services.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Api/users")
public class UserController extends GenericController<User, UserDTO, String> {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        super(userService);
        this.userService = userService;
    }

    @PostMapping("/sign-in/{email}")
    public ResponseEntity<UserDTO> findByEmail(@PathVariable String email) {
        UserDTO user = userService.findByEmail(email);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // Not Found
        }
    }
    @DeleteMapping("/deleteUser/{email}")
    public ResponseEntity<Void> deleteUser(@PathVariable String email) {
        userService.deleteUser(email);
        return ResponseEntity.noContent().build();
    }

    //
//    @GetMapping
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @PostMapping("/addUser")
//    public User addUser(@RequestBody User user) {
//        return userService.addUser(user);
//    }

    //    @DeleteMapping("/deleteUser/{email}")
//    public ResponseEntity<Void> deleteUser(@PathVariable String email) {
//        userService.deleteUser(email);
//        return ResponseEntity.noContent().build();
//    }

//
//    @GetMapping("/getUserByEmail/{email}")
//    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
//       User user = userService.getUserByEmail(email);
//        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//    }


    //    @PostMapping ("/getUserByEmail/{email}")
//    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
//        User user = userService.getUserByEmail(email);
//        if (user != null) {
//            return ResponseEntity.ok(user);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//    }
//    @GetMapping("/getUserByEmail/{email}")
//    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
//        User user = userService.getUserByEmail(email);
//        if (user != null) {
//            return ResponseEntity.ok(user);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//    }
}

