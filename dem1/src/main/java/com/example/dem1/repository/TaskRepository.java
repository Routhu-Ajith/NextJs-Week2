package com.example.dem1.repository;

import com.example.dem1.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task,String> {


    List<Task> findBySeverity(int severity);

    @Query("{assignee: ?0}")

    List<Task>getTasksByAssignee(String assignee);


}
