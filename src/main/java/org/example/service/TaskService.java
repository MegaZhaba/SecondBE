package org.example.service;

import java.util.List;

public interface TaskService {
    void addTask(String task);
    List<String> getTasks();
}
