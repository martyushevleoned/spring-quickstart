package org.example;

import org.example.model.Project;
import org.example.Repository.ProjectRepository;
import org.example.model.User;
import org.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void run(String... args) throws Exception {

//        User user = new User();
//        user.setId(2);
//        user.setUsername("username2");
//        user.setPassword("password2");
//        userRepository.save(user);

//        Project project1 = new Project();
//        project1.setId(1);
//        project1.setUser(user);
//        project1.setProjectName("projectName1");
//        projectRepository.save(project1);

//        Project project2 = new Project();
//        project2.setId(2);
//        project2.setUser(user);
//        project2.setProjectName("projectName2");
//        projectRepository.save(project2);
    }
}