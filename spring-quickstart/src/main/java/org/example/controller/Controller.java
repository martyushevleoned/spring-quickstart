package org.example.controller;

import org.example.model.Project;
import org.example.Repository.ProjectRepository;
import org.example.model.User;
import org.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id) {

        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()){
            return user.get().getUsername();
        }

        return (new Date()).toString();
    }

    @GetMapping("/project/{id}")
    public String getProjectById(@PathVariable int id) {

        Optional<Project> project = projectRepository.findById(id);

        if (project.isPresent()){
            return project.get().getProjectName();
        }

        return (new Date()).toString();
    }

    @GetMapping("/userByProject/{id}")
    public String getUserByUser(@PathVariable int id) {

        Optional<Project> project = projectRepository.findById(id);

        if (project.isPresent()){
            return project.get().getUser().getUsername();
        }

        return (new Date()).toString();
    }

    @GetMapping("/projectsByUser/{id}")
    public String getProjectsByUser(@PathVariable int id) {

        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()){
            List<Project> projects = user.get().getProjects();

            StringBuilder stringBuilder = new StringBuilder();
            projects.forEach(p -> stringBuilder.append(p.getProjectName()).append("\n"));

            return stringBuilder.toString();
        }

        return (new Date()).toString();
    }
}
