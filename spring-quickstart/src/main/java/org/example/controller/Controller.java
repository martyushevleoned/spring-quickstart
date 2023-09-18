package org.example.controller;

import org.example.dto.UserDto;
import org.example.model.Project;
import org.example.Repository.ProjectRepository;
import org.example.model.User;
import org.example.Repository.UserRepository;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    UserService userService;

    @GetMapping("/my-projects/{id}")
    public UserDto myProjects(@PathVariable int id){
        return userService.getMyProjects(id);
    }

}
