package com.example.dem1.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document(collection = "tasks")
public class Task {
    @Id
    private String TaskId;
    private String description;
    private Integer severity;
    private String assignee;
    private Integer storyPoint;
}