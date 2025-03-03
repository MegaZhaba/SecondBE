package org.example.config;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LazyBean {
    private final List<String> tasks = new ArrayList<>();

    public void saveTask(String task) {
        tasks.add(task);
    }

    public List<String> findAllTasks() {
        return tasks;
    }
}
