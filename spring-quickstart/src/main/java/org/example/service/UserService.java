package org.example.service;

import org.example.Repository.UserRepository;
import org.example.dto.ProjectDto;
import org.example.dto.TaskDto;
import org.example.dto.UserDto;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto getMyProjects(int id) {
        Optional<User> user = userRepository.findById(id);

        return user.map(this::convertEntityToDto).orElse(null);
    }

    private UserDto convertEntityToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());

        user.getProjects().forEach(p -> {
            ProjectDto projectDto = new ProjectDto();
            projectDto.setId(p.getId());
            projectDto.setProjectName(p.getProjectName());

            p.getTasks().forEach(t -> {
                TaskDto taskDto = new TaskDto();
                taskDto.setId(t.getId());
                taskDto.setTitle(t.getTitle());
                taskDto.setText(t.getText());

                projectDto.getTasks().add(taskDto);
            });

            userDto.getProjects().add(projectDto);
        });

        return userDto;
    }
}
