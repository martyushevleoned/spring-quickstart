package org.example.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDto {

    private Integer id;
    private String username;
    private List<ProjectDto> projects = new ArrayList<>();
}
