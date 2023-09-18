package org.example;

import org.example.Repository.TaskRepository;
import org.example.model.Project;
import org.example.Repository.ProjectRepository;
import org.example.model.Task;
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

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setId(1);
        user.setUsername("username1");
        user.setPassword("password1");
        userRepository.save(user);

        Project project1 = new Project();
        project1.setId(1);
        project1.setUser(user);
        project1.setProjectName("projectName1");
        projectRepository.save(project1);

        Project project2 = new Project();
        project2.setId(2);
        project2.setUser(user);
        project2.setProjectName("projectName2");
        projectRepository.save(project2);

        Task task1 = new Task();
        task1.setId(1);
        task1.setProject(project1);
        task1.setTitle("title");
        task1.setText("text");
        taskRepository.save(task1);

        Task task2 = new Task();
        task2.setId(2);
        task2.setProject(project1);
        task2.setTitle("title2");
        task2.setText("text2");
        taskRepository.save(task2);
    }
}