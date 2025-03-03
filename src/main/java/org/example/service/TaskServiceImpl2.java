package org.example.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl2 implements TaskService {
    private final List<String> tasks = new ArrayList<>();

    @Override
    public void addTask(String task) {
        tasks.add("[Impl2] " + task);
    }

    @Override
    public List<String> getTasks() {
        return tasks;
    }
}
