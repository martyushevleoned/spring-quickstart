package org.example.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProjectDto {

    private String projectName;
    private List<TaskDto> tasks = new ArrayList<>();
}
