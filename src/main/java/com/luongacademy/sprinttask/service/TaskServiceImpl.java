package com.luongacademy.sprinttask.service;

import com.luongacademy.sprinttask.domain.Task;
import com.luongacademy.sprinttask.repository.TaskRepository;

public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> getAll() {
        return taskRepository.findAll();
    }
}
