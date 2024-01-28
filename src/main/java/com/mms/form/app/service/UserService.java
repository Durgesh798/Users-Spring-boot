package com.mms.form.app.service;

import com.mms.form.app.model.User;
import com.mms.form.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> getAllUsers(){
        return repo.findAll();
    }

    public User saveUser(User user){
        return repo.save(user);
    }

    public String Foo(String msg){
        return "Errors in request";
    }
}
