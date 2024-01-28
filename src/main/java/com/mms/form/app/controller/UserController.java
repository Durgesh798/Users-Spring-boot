package com.mms.form.app.controller;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.mms.form.app.model.User;
import com.mms.form.app.service.UserService;
import jakarta.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public List<User> getUsers(){
        return service.getAllUsers();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/users/{err}")
    public ResponseEntity<String> getFoo(@PathVariable String err){
        return ResponseEntity.ok(err);
    }
}
