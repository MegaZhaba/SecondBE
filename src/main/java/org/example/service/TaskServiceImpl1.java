package org.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class TaskServiceImpl1 implements TaskService {
    private final List<String> tasks = new ArrayList<>();

    @Override
    public void addTask(String task) {
        tasks.add("[Impl1] " + task);
    }

    @Override
    public List<String> getTasks() {
        return tasks;
    }
}
