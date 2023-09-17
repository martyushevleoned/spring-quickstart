package org.example.controller;

import org.example.model.User;
import org.example.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String index() {

        Optional<User> user = userRepository.findById(1);

        if (user.isPresent()){
            return user.get().getUsername();
        }

        return (new Date()).toString();
    }
}
