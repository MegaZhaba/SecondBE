package org.example.repository;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    private final List<String> tasks = new ArrayList<>();

    public void saveTask(String task) {
        tasks.add(task);
    }

    public List<String> findAllTasks() {
        return tasks;
    }
}
